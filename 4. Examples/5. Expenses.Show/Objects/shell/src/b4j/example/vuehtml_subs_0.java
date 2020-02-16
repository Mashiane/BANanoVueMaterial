package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vuehtml_subs_0 {


public static RemoteObject  _addanchor(RemoteObject __ref,RemoteObject _href,RemoteObject _caption,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("AddAnchor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2479);
if (RapidSub.canDelegate("addanchor")) { return __ref.runUserSub(false, "vuehtml","addanchor", __ref, _href, _caption, _target);}
Debug.locals.put("href", _href);
Debug.locals.put("caption", _caption);
Debug.locals.put("Target", _target);
 BA.debugLineNum = 2479;BA.debugLine="Sub AddAnchor(href As String,caption As String,Tar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2480;BA.debugLine="AddLink(href,caption,Target)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addlink" /*RemoteObject*/ ,(Object)(_href),(Object)(_caption),(Object)(_target));
 BA.debugLineNum = 2481;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2482;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addattribute(RemoteObject __ref,RemoteObject _skey,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("AddAttribute (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2231);
if (RapidSub.canDelegate("addattribute")) { return __ref.runUserSub(false, "vuehtml","addattribute", __ref, _skey, _svalue);}
Debug.locals.put("skey", _skey);
Debug.locals.put("svalue", _svalue);
 BA.debugLineNum = 2231;BA.debugLine="public Sub AddAttribute(skey As String, svalue As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2232;BA.debugLine="If svalue <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_svalue)) { 
 BA.debugLineNum = 2233;BA.debugLine="skey = CStr(skey)";
Debug.JustUpdateDeviceLine();
_skey = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_skey)));Debug.locals.put("skey", _skey);
 BA.debugLineNum = 2234;BA.debugLine="skey = skey.trim";
Debug.JustUpdateDeviceLine();
_skey = _skey.runMethod(true,"trim");Debug.locals.put("skey", _skey);
 BA.debugLineNum = 2235;BA.debugLine="properties.Put(skey,svalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_properties" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_skey)),(Object)(_svalue));
 BA.debugLineNum = 2236;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 };
 BA.debugLineNum = 2238;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2239;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addattributeifset(RemoteObject __ref,RemoteObject _prop,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddAttributeIfSet (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,958);
if (RapidSub.canDelegate("addattributeifset")) { return __ref.runUserSub(false, "vuehtml","addattributeifset", __ref, _prop, _value);}
Debug.locals.put("prop", _prop);
Debug.locals.put("value", _value);
 BA.debugLineNum = 958;BA.debugLine="Sub AddAttributeIfSet(prop As String, value As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 959;BA.debugLine="If value <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_value,BA.ObjectToString(""))) { 
 BA.debugLineNum = 960;BA.debugLine="AddAttribute(prop,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(_prop),(Object)((_value)));
 };
 BA.debugLineNum = 962;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 963;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addattributeoncondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _attr,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddAttributeOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1411);
if (RapidSub.canDelegate("addattributeoncondition")) { return __ref.runUserSub(false, "vuehtml","addattributeoncondition", __ref, _bcondition, _attr, _value);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("attr", _attr);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1411;BA.debugLine="Sub AddAttributeOnCondition(bCondition As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1412;BA.debugLine="If bCondition = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bcondition,vuehtml.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1413;BA.debugLine="AddAttribute(attr,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(_attr),(Object)((_value)));
 };
 BA.debugLineNum = 1415;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1416;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbold(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddBold (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2355);
if (RapidSub.canDelegate("addbold")) { return __ref.runUserSub(false, "vuehtml","addbold", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2355;BA.debugLine="Sub AddBold(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2356;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2357;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2358;BA.debugLine="sb.Append(\"{B}\").Append(value).Append(\"{/B}\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("{B}"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("{/B}")));
 BA.debugLineNum = 2359;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2360;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2361;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddBR (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("addbr")) { return __ref.runUserSub(false, "vuehtml","addbr", __ref);}
 BA.debugLineNum = 273;BA.debugLine="Sub AddBR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 274;BA.debugLine="SetText(\"<br>\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("<br>")));
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbreak(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("AddBreak (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2466);
if (RapidSub.canDelegate("addbreak")) { return __ref.runUserSub(false, "vuehtml","addbreak", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 2466;BA.debugLine="Sub AddBreak(b As Boolean) As VueHTML  'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2467;BA.debugLine="AddContent(\"{BR}\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("{BR}")));
 BA.debugLineNum = 2468;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2469;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1990);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vuehtml","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 1990;BA.debugLine="Sub AddChild(child As VueHTML) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1991;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 1992;BA.debugLine="SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 1993;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1994;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1997);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vuehtml","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("children", _children);
 BA.debugLineNum = 1997;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1998;BA.debugLine="For Each childx As VueHTML In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 1999;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 2001;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcite(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddCite (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2441);
if (RapidSub.canDelegate("addcite")) { return __ref.runUserSub(false, "vuehtml","addcite", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2441;BA.debugLine="Sub AddCite(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2442;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2443;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2444;BA.debugLine="sb.Append(\"<cite>\").Append(value).Append(\"</cite>";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<cite>"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</cite>")));
 BA.debugLineNum = 2445;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2446;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2447;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2216);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vuehtml","addclass", __ref, _value);}
RemoteObject _spclasses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strclass = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2216;BA.debugLine="Sub AddClass(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2218;BA.debugLine="value = value.Replace(\" \",\";\")";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("value", _value);
 BA.debugLineNum = 2219;BA.debugLine="Dim spClasses As List = StrParse(\";\",value)";
Debug.JustUpdateDeviceLine();
_spclasses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_spclasses = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_value));Debug.locals.put("spClasses", _spclasses);Debug.locals.put("spClasses", _spclasses);
 BA.debugLineNum = 2220;BA.debugLine="For Each strClass As String In spClasses";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _spclasses;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strclass = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("strClass", _strclass);
Debug.locals.put("strClass", _strclass);
 BA.debugLineNum = 2221;BA.debugLine="strClass = strClass.Trim";
Debug.JustUpdateDeviceLine();
_strclass = _strclass.runMethod(true,"trim");Debug.locals.put("strClass", _strclass);
 BA.debugLineNum = 2222;BA.debugLine="If strClass.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_strclass.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2223;BA.debugLine="Classes.Put(strClass,strClass)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_classes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strclass)),(Object)((_strclass)));
 };
 }
}Debug.locals.put("strClass", _strclass);
;
 BA.debugLineNum = 2226;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 BA.debugLineNum = 2227;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclasses(RemoteObject __ref,RemoteObject _clslist) throws Exception{
try {
		Debug.PushSubsStack("AddClasses (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,386);
if (RapidSub.canDelegate("addclasses")) { return __ref.runUserSub(false, "vuehtml","addclasses", __ref, _clslist);}
RemoteObject _c = RemoteObject.createImmutable("");
Debug.locals.put("clsList", _clslist);
 BA.debugLineNum = 386;BA.debugLine="Sub AddClasses(clsList As List) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 387;BA.debugLine="For Each c As String In clsList";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _clslist;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 388;BA.debugLine="AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 }
}Debug.locals.put("c", _c);
;
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
public static RemoteObject  _addclassoncondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _sclass) throws Exception{
try {
		Debug.PushSubsStack("AddClassOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1465);
if (RapidSub.canDelegate("addclassoncondition")) { return __ref.runUserSub(false, "vuehtml","addclassoncondition", __ref, _bcondition, _sclass);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("sClass", _sclass);
 BA.debugLineNum = 1465;BA.debugLine="Sub AddClassOnCondition(bCondition As Boolean, sCl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1466;BA.debugLine="If bCondition  Then";
Debug.JustUpdateDeviceLine();
if (_bcondition.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1467;BA.debugLine="AddClass(sClass)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_sclass));
 };
 BA.debugLineNum = 1469;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1470;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclassonfalsecondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _sclass) throws Exception{
try {
		Debug.PushSubsStack("AddClassOnFalseCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1472);
if (RapidSub.canDelegate("addclassonfalsecondition")) { return __ref.runUserSub(false, "vuehtml","addclassonfalsecondition", __ref, _bcondition, _sclass);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("sClass", _sclass);
 BA.debugLineNum = 1472;BA.debugLine="Sub AddClassOnFalseCondition(bCondition As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1473;BA.debugLine="If bCondition = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bcondition,vuehtml.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1474;BA.debugLine="AddClass(sClass)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_sclass));
 };
 BA.debugLineNum = 1476;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1477;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclassonvalue(RemoteObject __ref,RemoteObject _ivalue,RemoteObject _sclass) throws Exception{
try {
		Debug.PushSubsStack("AddClassOnValue (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1458);
if (RapidSub.canDelegate("addclassonvalue")) { return __ref.runUserSub(false, "vuehtml","addclassonvalue", __ref, _ivalue, _sclass);}
Debug.locals.put("iValue", _ivalue);
Debug.locals.put("sClass", _sclass);
 BA.debugLineNum = 1458;BA.debugLine="Sub AddClassOnValue(iValue As Int, sClass As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1459;BA.debugLine="If iValue > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_ivalue,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1460;BA.debugLine="AddClass(sClass)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_sclass));
 };
 BA.debugLineNum = 1462;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1463;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcode(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddCode (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2416);
if (RapidSub.canDelegate("addcode")) { return __ref.runUserSub(false, "vuehtml","addcode", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2416;BA.debugLine="Sub AddCode(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2417;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2418;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2419;BA.debugLine="sb.Append(\"<code>\").Append(value).Append(\"</code>";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<code>"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</code>")));
 BA.debugLineNum = 2420;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2421;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2422;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontent(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddContent (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1740);
if (RapidSub.canDelegate("addcontent")) { return __ref.runUserSub(false, "vuehtml","addcontent", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1740;BA.debugLine="public Sub AddContent(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1741;BA.debugLine="value = CStr(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_value)));Debug.locals.put("value", _value);
 BA.debugLineNum = 1742;BA.debugLine="If value.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_value.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1743;BA.debugLine="value = FormatText(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.vuehtml.class, "_formattext" /*RemoteObject*/ ,(Object)(_value));Debug.locals.put("value", _value);
 BA.debugLineNum = 1744;BA.debugLine="Contents.Add(value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_value)));
 BA.debugLineNum = 1745;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1747;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1748;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontentafter(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddContentAfter (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1751);
if (RapidSub.canDelegate("addcontentafter")) { return __ref.runUserSub(false, "vuehtml","addcontentafter", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1751;BA.debugLine="public Sub AddContentAfter(value As String) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1752;BA.debugLine="value = CStr(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_value)));Debug.locals.put("value", _value);
 BA.debugLineNum = 1753;BA.debugLine="If value.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_value.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1754;BA.debugLine="value = FormatText(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.vuehtml.class, "_formattext" /*RemoteObject*/ ,(Object)(_value));Debug.locals.put("value", _value);
 BA.debugLineNum = 1755;BA.debugLine="SBAfter.Append(value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sbafter" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_value));
 BA.debugLineNum = 1756;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1758;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1759;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontentbefore(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddContentBefore (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1762);
if (RapidSub.canDelegate("addcontentbefore")) { return __ref.runUserSub(false, "vuehtml","addcontentbefore", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1762;BA.debugLine="public Sub AddContentBefore(value As String) As Vu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1763;BA.debugLine="value = CStr(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_value)));Debug.locals.put("value", _value);
 BA.debugLineNum = 1764;BA.debugLine="If value.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_value.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1765;BA.debugLine="value = FormatText(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.vuehtml.class, "_formattext" /*RemoteObject*/ ,(Object)(_value));Debug.locals.put("value", _value);
 BA.debugLineNum = 1766;BA.debugLine="SBBefore.Append(value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sbbefore" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_value));
 BA.debugLineNum = 1767;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1769;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1770;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontentline(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddContentLine (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1115);
if (RapidSub.canDelegate("addcontentline")) { return __ref.runUserSub(false, "vuehtml","addcontentline", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1115;BA.debugLine="public Sub AddContentLine(value As String) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1116;BA.debugLine="If value <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_value,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1117;BA.debugLine="value = value.Replace(CRLF,\"\")";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"replace",(Object)(vuehtml.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("value", _value);
 BA.debugLineNum = 1118;BA.debugLine="AddContent(value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_value));
 };
 BA.debugLineNum = 1120;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1121;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontentlist(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddContentList (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1496);
if (RapidSub.canDelegate("addcontentlist")) { return __ref.runUserSub(false, "vuehtml","addcontentlist", __ref, _lst);}
RemoteObject _strcontent = RemoteObject.createImmutable("");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1496;BA.debugLine="Sub AddContentList(lst As List) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1497;BA.debugLine="For Each strContent As String In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _lst;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcontent = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strContent", _strcontent);
Debug.locals.put("strContent", _strcontent);
 BA.debugLineNum = 1498;BA.debugLine="AddContent(strContent)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_strcontent));
 }
}Debug.locals.put("strContent", _strcontent);
;
 BA.debugLineNum = 1500;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1501;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontentlistreverse(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddContentListReverse (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1216);
if (RapidSub.canDelegate("addcontentlistreverse")) { return __ref.runUserSub(false, "vuehtml","addcontentlistreverse", __ref, _lst);}
RemoteObject _ltot = RemoteObject.createImmutable(0);
RemoteObject _lcnt = RemoteObject.createImmutable(0);
RemoteObject _strcontent = RemoteObject.createImmutable("");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1216;BA.debugLine="Sub AddContentListReverse(lst As List) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1217;BA.debugLine="Dim lTot As Int = lst.Size - 1";
Debug.JustUpdateDeviceLine();
_ltot = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("lTot", _ltot);Debug.locals.put("lTot", _ltot);
 BA.debugLineNum = 1218;BA.debugLine="Dim lCnt As Int";
Debug.JustUpdateDeviceLine();
_lcnt = RemoteObject.createImmutable(0);Debug.locals.put("lCnt", _lcnt);
 BA.debugLineNum = 1219;BA.debugLine="For lCnt = lTot To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step3 = -1;
final int limit3 = 0;
_lcnt = _ltot ;
for (;(step3 > 0 && _lcnt.<Integer>get().intValue() <= limit3) || (step3 < 0 && _lcnt.<Integer>get().intValue() >= limit3) ;_lcnt = RemoteObject.createImmutable((int)(0 + _lcnt.<Integer>get().intValue() + step3))  ) {
Debug.locals.put("lCnt", _lcnt);
 BA.debugLineNum = 1220;BA.debugLine="Dim strContent As String = lst.Get(lCnt)";
Debug.JustUpdateDeviceLine();
_strcontent = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_lcnt)));Debug.locals.put("strContent", _strcontent);Debug.locals.put("strContent", _strcontent);
 BA.debugLineNum = 1221;BA.debugLine="AddContent(strContent)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_strcontent));
 }
}Debug.locals.put("lCnt", _lcnt);
;
 BA.debugLineNum = 1223;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1224;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcssclassproperties(RemoteObject __ref,RemoteObject _sproperties) throws Exception{
try {
		Debug.PushSubsStack("AddCSSClassProperties (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("addcssclassproperties")) { return __ref.runUserSub(false, "vuehtml","addcssclassproperties", __ref, _sproperties);}
Debug.locals.put("sProperties", _sproperties);
 BA.debugLineNum = 31;BA.debugLine="Sub AddCSSClassProperties(sProperties As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="AddCssRule(\".\" & ID,sProperties)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcssrule" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("."),__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)(_sproperties));
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
public static RemoteObject  _addcssrule(RemoteObject __ref,RemoteObject _stylename,RemoteObject _content) throws Exception{
try {
		Debug.PushSubsStack("AddCssRule (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("addcssrule")) { return __ref.runUserSub(false, "vuehtml","addcssrule", __ref, _stylename, _content);}
RemoteObject _scontent = RemoteObject.createImmutable("");
RemoteObject _themstyles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strit = RemoteObject.createImmutable("");
Debug.locals.put("styleName", _stylename);
Debug.locals.put("content", _content);
 BA.debugLineNum = 74;BA.debugLine="Sub AddCssRule(styleName As String, content As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="Dim scontent As String";
Debug.JustUpdateDeviceLine();
_scontent = RemoteObject.createImmutable("");Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 77;BA.debugLine="Dim themStyles As List = StrParse(\",\",styleName)";
Debug.JustUpdateDeviceLine();
_themstyles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_themstyles = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_stylename));Debug.locals.put("themStyles", _themstyles);Debug.locals.put("themStyles", _themstyles);
 BA.debugLineNum = 78;BA.debugLine="For Each strIT As String In themStyles";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _themstyles;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strit = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("strIT", _strit);
Debug.locals.put("strIT", _strit);
 BA.debugLineNum = 79;BA.debugLine="strIT = strIT.Replace(CRLF,\"\")";
Debug.JustUpdateDeviceLine();
_strit = _strit.runMethod(true,"replace",(Object)(vuehtml.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strIT", _strit);
 BA.debugLineNum = 80;BA.debugLine="If CSSRule.ContainsKey(strIT) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_strit))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="scontent = CSSRule.Get(strIT)";
Debug.JustUpdateDeviceLine();
_scontent = BA.ObjectToString(__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strit))));Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 82;BA.debugLine="scontent = scontent & \";\" & content";
Debug.JustUpdateDeviceLine();
_scontent = RemoteObject.concat(_scontent,RemoteObject.createImmutable(";"),_content);Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 83;BA.debugLine="CSSRule.Put(strIT,scontent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strit)),(Object)((_scontent)));
 }else {
 BA.debugLineNum = 85;BA.debugLine="CSSRule.Put(strIT,content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strit)),(Object)((_content)));
 };
 }
}Debug.locals.put("strIT", _strit);
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
public static RemoteObject  _addcursor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddCursor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1448);
if (RapidSub.canDelegate("addcursor")) { return __ref.runUserSub(false, "vuehtml","addcursor", __ref);}
 BA.debugLineNum = 1448;BA.debugLine="Sub AddCursor As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1449;BA.debugLine="SetStyle(\"cursor\", \"pointer\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cursor")),(Object)(RemoteObject.createImmutable("pointer")));
 BA.debugLineNum = 1450;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1451;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddataattribute(RemoteObject __ref,RemoteObject _attribute,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddDataAttribute (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1360);
if (RapidSub.canDelegate("adddataattribute")) { return __ref.runUserSub(false, "vuehtml","adddataattribute", __ref, _attribute, _value);}
RemoteObject _sw = RemoteObject.createImmutable(false);
Debug.locals.put("attribute", _attribute);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1360;BA.debugLine="Sub AddDataAttribute(attribute As String, value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1361;BA.debugLine="Dim sw As Boolean = attribute.StartsWith(\"data-\")";
Debug.JustUpdateDeviceLine();
_sw = _attribute.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("data-")));Debug.locals.put("sw", _sw);Debug.locals.put("sw", _sw);
 BA.debugLineNum = 1362;BA.debugLine="If sw Then";
Debug.JustUpdateDeviceLine();
if (_sw.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1363;BA.debugLine="AddAttribute(attribute,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(_attribute),(Object)((_value)));
 }else {
 BA.debugLineNum = 1365;BA.debugLine="AddAttribute(\"data-\" & attribute,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("data-"),_attribute)),(Object)((_value)));
 };
 BA.debugLineNum = 1367;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1368;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddataattributeoncondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _attribute,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddDataAttributeOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1370);
if (RapidSub.canDelegate("adddataattributeoncondition")) { return __ref.runUserSub(false, "vuehtml","adddataattributeoncondition", __ref, _bcondition, _attribute, _value);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("attribute", _attribute);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1370;BA.debugLine="Sub AddDataAttributeOnCondition(bCondition As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1371;BA.debugLine="If bCondition = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bcondition,vuehtml.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1372;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 1374;BA.debugLine="AddDataAttribute(attribute,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_adddataattribute" /*RemoteObject*/ ,(Object)(_attribute),(Object)(_value));
 BA.debugLineNum = 1375;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1376;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddiv(RemoteObject __ref,RemoteObject _divid,RemoteObject _divcontent,RemoteObject _divclass) throws Exception{
try {
		Debug.PushSubsStack("AddDiv (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2346);
if (RapidSub.canDelegate("adddiv")) { return __ref.runUserSub(false, "vuehtml","adddiv", __ref, _divid, _divcontent, _divclass);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("divid", _divid);
Debug.locals.put("divContent", _divcontent);
Debug.locals.put("divClass", _divclass);
 BA.debugLineNum = 2346;BA.debugLine="Sub AddDiv(divid As String, divContent As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2347;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2348;BA.debugLine="div.Initialize(divid,\"div\").SetText(divContent).a";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_divid),(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_divcontent)).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_divclass));
 BA.debugLineNum = 2349;BA.debugLine="AddContent(div.HTML)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_div.runClassMethod (b4j.example.vuehtml.class, "_html" /*RemoteObject*/ )));
 BA.debugLineNum = 2350;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2351;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddElement (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1788);
if (RapidSub.canDelegate("addelement")) { return __ref.runUserSub(false, "vuehtml","addelement", __ref, _el);}
RemoteObject _scode = RemoteObject.createImmutable("");
Debug.locals.put("el", _el);
 BA.debugLineNum = 1788;BA.debugLine="public Sub AddElement(el As VueHTML) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1789;BA.debugLine="If el <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_el)) { 
 BA.debugLineNum = 1790;BA.debugLine="Dim scode As String = el.tostring";
Debug.JustUpdateDeviceLine();
_scode = _el.runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("scode", _scode);Debug.locals.put("scode", _scode);
 BA.debugLineNum = 1791;BA.debugLine="AddContent(scode)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_scode));
 BA.debugLineNum = 1792;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1794;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1795;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addelementline(RemoteObject __ref,RemoteObject _el) throws Exception{
try {
		Debug.PushSubsStack("AddElementLine (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1095);
if (RapidSub.canDelegate("addelementline")) { return __ref.runUserSub(false, "vuehtml","addelementline", __ref, _el);}
RemoteObject _scode = RemoteObject.createImmutable("");
Debug.locals.put("el", _el);
 BA.debugLineNum = 1095;BA.debugLine="public Sub AddElementLine(el As VueHTML) As VueHTM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1096;BA.debugLine="If el <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_el)) { 
 BA.debugLineNum = 1097;BA.debugLine="Dim scode As String = el.html";
Debug.JustUpdateDeviceLine();
_scode = _el.runClassMethod (b4j.example.vuehtml.class, "_html" /*RemoteObject*/ );Debug.locals.put("scode", _scode);Debug.locals.put("scode", _scode);
 BA.debugLineNum = 1098;BA.debugLine="AddContent(scode)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_scode));
 };
 BA.debugLineNum = 1100;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1101;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addelements(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddElements (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1798);
if (RapidSub.canDelegate("addelements")) { return __ref.runUserSub(false, "vuehtml","addelements", __ref, _lst);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1798;BA.debugLine="Sub AddElements(lst As List) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1799;BA.debugLine="For Each el As VueHTML In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _lst;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_el = (group1.runMethod(false,"Get",index1));Debug.locals.put("el", _el);
Debug.locals.put("el", _el);
 BA.debugLineNum = 1800;BA.debugLine="AddElement(el)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_el));
 }
}Debug.locals.put("el", _el);
;
 BA.debugLineNum = 1802;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1803;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addem(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddEM (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2449);
if (RapidSub.canDelegate("addem")) { return __ref.runUserSub(false, "vuehtml","addem", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2449;BA.debugLine="Sub AddEM(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2450;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2451;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2452;BA.debugLine="sb.Append(\"<em>\").Append(value).Append(\"</em>\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<em>"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</em>")));
 BA.debugLineNum = 2453;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2454;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2455;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addheading(RemoteObject __ref,RemoteObject _ssize,RemoteObject _scontent) throws Exception{
try {
		Debug.PushSubsStack("AddHeading (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1169);
if (RapidSub.canDelegate("addheading")) { return __ref.runUserSub(false, "vuehtml","addheading", __ref, _ssize, _scontent);}
RemoteObject _hdr = RemoteObject.declareNull("b4j.example.vuehtml");
RemoteObject _hkey = RemoteObject.createImmutable("");
Debug.locals.put("sSize", _ssize);
Debug.locals.put("sContent", _scontent);
 BA.debugLineNum = 1169;BA.debugLine="Sub AddHeading(sSize As Int, sContent As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1170;BA.debugLine="Dim hdr As VueHTML";
Debug.JustUpdateDeviceLine();
_hdr = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("hdr", _hdr);
 BA.debugLineNum = 1171;BA.debugLine="Dim hKey As String = \"h\" & sSize";
Debug.JustUpdateDeviceLine();
_hkey = RemoteObject.concat(RemoteObject.createImmutable("h"),_ssize);Debug.locals.put("hKey", _hkey);Debug.locals.put("hKey", _hkey);
 BA.debugLineNum = 1172;BA.debugLine="hdr.Initialize(\"\",hKey)";
Debug.JustUpdateDeviceLine();
_hdr.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(_hkey));
 BA.debugLineNum = 1173;BA.debugLine="hdr.AddContent(sContent)";
Debug.JustUpdateDeviceLine();
_hdr.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_scontent));
 BA.debugLineNum = 1174;BA.debugLine="AddContent(hdr.HTML)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_hdr.runClassMethod (b4j.example.vuehtml.class, "_html" /*RemoteObject*/ )));
 BA.debugLineNum = 1175;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1176;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddHR (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("addhr")) { return __ref.runUserSub(false, "vuehtml","addhr", __ref);}
 BA.debugLineNum = 278;BA.debugLine="Sub AddHR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 279;BA.debugLine="SetText(\"<hr>\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("<hr>")));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _additalic(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddItalic (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2364);
if (RapidSub.canDelegate("additalic")) { return __ref.runUserSub(false, "vuehtml","additalic", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2364;BA.debugLine="Sub AddItalic(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2365;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2366;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2367;BA.debugLine="sb.Append(\"{I}\").Append(value).Append(\"{/I}\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("{I}"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("{/I}")));
 BA.debugLineNum = 2368;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2369;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2370;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addkbd(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddKBD (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2407);
if (RapidSub.canDelegate("addkbd")) { return __ref.runUserSub(false, "vuehtml","addkbd", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2407;BA.debugLine="Sub AddKBD(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2408;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2409;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2410;BA.debugLine="sb.Append(\"<kbd>\").Append(value).Append(\"</kbd>\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<kbd>"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</kbd>")));
 BA.debugLineNum = 2411;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2412;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2413;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlink(RemoteObject __ref,RemoteObject _href,RemoteObject _caption,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("AddLink (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2472);
if (RapidSub.canDelegate("addlink")) { return __ref.runUserSub(false, "vuehtml","addlink", __ref, _href, _caption, _target);}
RemoteObject _a = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("href", _href);
Debug.locals.put("caption", _caption);
Debug.locals.put("Target", _target);
 BA.debugLineNum = 2472;BA.debugLine="Sub AddLink(href As String,caption As String,Targe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2473;BA.debugLine="Dim a As VueHTML";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("a", _a);
 BA.debugLineNum = 2474;BA.debugLine="a.Initialize(\"\",\"a\").SetAttrHREF(href).AddContent";
Debug.JustUpdateDeviceLine();
_a.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("a"))).runClassMethod (b4j.example.vuehtml.class, "_setattrhref" /*RemoteObject*/ ,(Object)(_href)).runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_caption)).runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(_target));
 BA.debugLineNum = 2475;BA.debugLine="AddElement(a)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_a));
 BA.debugLineNum = 2476;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2477;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlooseattribute(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddLooseAttribute (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1310);
if (RapidSub.canDelegate("addlooseattribute")) { return __ref.runUserSub(false, "vuehtml","addlooseattribute", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1310;BA.debugLine="Sub AddLooseAttribute(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1311;BA.debugLine="LooseAttributes.Put(value,value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_looseattributes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_value)),(Object)((_value)));
 BA.debugLineNum = 1312;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1313;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlooseattributeoncondition(RemoteObject __ref,RemoteObject _bstatus,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddLooseAttributeOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1302);
if (RapidSub.canDelegate("addlooseattributeoncondition")) { return __ref.runUserSub(false, "vuehtml","addlooseattributeoncondition", __ref, _bstatus, _value);}
Debug.locals.put("bStatus", _bstatus);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1302;BA.debugLine="Sub AddLooseAttributeOnCondition(bStatus As Boolea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1303;BA.debugLine="If bStatus = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bstatus,vuehtml.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1304;BA.debugLine="AddLooseAttribute(value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addlooseattribute" /*RemoteObject*/ ,(Object)(_value));
 };
 BA.debugLineNum = 1306;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1307;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlooseattributeonfalsecondition(RemoteObject __ref,RemoteObject _bstatus,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddLooseAttributeOnFalseCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1195);
if (RapidSub.canDelegate("addlooseattributeonfalsecondition")) { return __ref.runUserSub(false, "vuehtml","addlooseattributeonfalsecondition", __ref, _bstatus, _value);}
Debug.locals.put("bStatus", _bstatus);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1195;BA.debugLine="Sub AddLooseAttributeOnFalseCondition(bStatus As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1196;BA.debugLine="If bStatus = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bstatus,vuehtml.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1197;BA.debugLine="AddLooseAttribute(value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addlooseattribute" /*RemoteObject*/ ,(Object)(_value));
 };
 BA.debugLineNum = 1199;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1200;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmailto(RemoteObject __ref,RemoteObject _emailaddress,RemoteObject _subject,RemoteObject _caption) throws Exception{
try {
		Debug.PushSubsStack("AddMailTo (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2338);
if (RapidSub.canDelegate("addmailto")) { return __ref.runUserSub(false, "vuehtml","addmailto", __ref, _emailaddress, _subject, _caption);}
RemoteObject _a = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("emailaddress", _emailaddress);
Debug.locals.put("subject", _subject);
Debug.locals.put("caption", _caption);
 BA.debugLineNum = 2338;BA.debugLine="Sub AddMailTo(emailaddress As String,subject As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2339;BA.debugLine="subject = subject.Replace(\" \", \"%20\")";
Debug.JustUpdateDeviceLine();
_subject = _subject.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("%20")));Debug.locals.put("subject", _subject);
 BA.debugLineNum = 2340;BA.debugLine="Dim a As VueHTML";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("a", _a);
 BA.debugLineNum = 2341;BA.debugLine="a.Initialize(\"\",\"a\").setAttrHREF($\"mailto:${email";
Debug.JustUpdateDeviceLine();
_a.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("a"))).runClassMethod (b4j.example.vuehtml.class, "_setattrhref" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("mailto:"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailaddress))),RemoteObject.createImmutable("?subject="),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_subject))),RemoteObject.createImmutable(""))))).runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_caption)).runClassMethod (b4j.example.vuehtml.class, "_setattrtargetblank" /*RemoteObject*/ ,(Object)(vuehtml.__c.getField(true,"True")));
 BA.debugLineNum = 2342;BA.debugLine="AddContent(a.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_a.runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 2343;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2344;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmark(RemoteObject __ref,RemoteObject _scontent,RemoteObject _sclass) throws Exception{
try {
		Debug.PushSubsStack("AddMark (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1186);
if (RapidSub.canDelegate("addmark")) { return __ref.runUserSub(false, "vuehtml","addmark", __ref, _scontent, _sclass);}
RemoteObject _p = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sContent", _scontent);
Debug.locals.put("sclass", _sclass);
 BA.debugLineNum = 1186;BA.debugLine="Sub AddMark(sContent As String, sclass As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1187;BA.debugLine="Dim p As VueHTML";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("p", _p);
 BA.debugLineNum = 1188;BA.debugLine="p.Initialize(\"\",\"mark\").AddClass(sclass)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("mark"))).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_sclass));
 BA.debugLineNum = 1189;BA.debugLine="p.AddContent(sContent)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_scontent));
 BA.debugLineNum = 1190;BA.debugLine="AddContent(p.HTML)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_p.runClassMethod (b4j.example.vuehtml.class, "_html" /*RemoteObject*/ )));
 BA.debugLineNum = 1191;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpre(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddPre (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2424);
if (RapidSub.canDelegate("addpre")) { return __ref.runUserSub(false, "vuehtml","addpre", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2424;BA.debugLine="Sub AddPre(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2425;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2426;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2427;BA.debugLine="sb.Append(\"<pre>\").Append(value).Append(\"</pre>\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<pre>"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</pre>")));
 BA.debugLineNum = 2428;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2429;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2430;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addproperty(RemoteObject __ref,RemoteObject _skey,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("AddProperty (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1019);
if (RapidSub.canDelegate("addproperty")) { return __ref.runUserSub(false, "vuehtml","addproperty", __ref, _skey, _svalue);}
Debug.locals.put("sKey", _skey);
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1019;BA.debugLine="Public Sub AddProperty(sKey As String, sValue As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1020;BA.debugLine="AddAttribute(sKey, sValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(_skey),(Object)((_svalue)));
 BA.debugLineNum = 1021;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1022;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpropertyoncondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _attr,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddPropertyOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1011);
if (RapidSub.canDelegate("addpropertyoncondition")) { return __ref.runUserSub(false, "vuehtml","addpropertyoncondition", __ref, _bcondition, _attr, _value);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("attr", _attr);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1011;BA.debugLine="Sub AddPropertyOnCondition(bCondition As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1012;BA.debugLine="If bCondition Then";
Debug.JustUpdateDeviceLine();
if (_bcondition.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1013;BA.debugLine="AddAttribute(attr,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(_attr),(Object)((_value)));
 };
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
public static RemoteObject  _addstrong(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddStrong (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2457);
if (RapidSub.canDelegate("addstrong")) { return __ref.runUserSub(false, "vuehtml","addstrong", __ref, _value);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2457;BA.debugLine="Sub AddStrong(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2458;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 2459;BA.debugLine="s = CreateStrong(\"\").SetText(value)";
Debug.JustUpdateDeviceLine();
_s = __ref.runClassMethod (b4j.example.vuehtml.class, "_createstrong" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_value));Debug.locals.put("s", _s);
 BA.debugLineNum = 2460;BA.debugLine="AddElement(s)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_s));
 BA.debugLineNum = 2461;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2462;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyle(RemoteObject __ref,RemoteObject _prop,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2182);
if (RapidSub.canDelegate("addstyle")) { return __ref.runUserSub(false, "vuehtml","addstyle", __ref, _prop, _value);}
Debug.locals.put("prop", _prop);
Debug.locals.put("value", _value);
 BA.debugLineNum = 2182;BA.debugLine="Sub AddStyle(prop As String, value As Object) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2183;BA.debugLine="AddStyleAttribute(prop,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addstyleattribute" /*RemoteObject*/ ,(Object)(_prop),(Object)(_value));
 BA.debugLineNum = 2184;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2185;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyleattribute(RemoteObject __ref,RemoteObject _sprop,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("AddStyleAttribute (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2188);
if (RapidSub.canDelegate("addstyleattribute")) { return __ref.runUserSub(false, "vuehtml","addstyleattribute", __ref, _sprop, _svalue);}
RemoteObject _xvalue = RemoteObject.createImmutable("");
Debug.locals.put("sprop", _sprop);
Debug.locals.put("svalue", _svalue);
 BA.debugLineNum = 2188;BA.debugLine="Sub AddStyleAttribute(sprop As String, svalue As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2189;BA.debugLine="If svalue = Null Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_svalue)) { 
if (true) return (__ref);};
 BA.debugLineNum = 2190;BA.debugLine="sprop = sprop.ToLowerCase";
Debug.JustUpdateDeviceLine();
_sprop = _sprop.runMethod(true,"toLowerCase");Debug.locals.put("sprop", _sprop);
 BA.debugLineNum = 2191;BA.debugLine="sprop = sprop.Trim";
Debug.JustUpdateDeviceLine();
_sprop = _sprop.runMethod(true,"trim");Debug.locals.put("sprop", _sprop);
 BA.debugLineNum = 2192;BA.debugLine="Dim xvalue As String = CStr(svalue)";
Debug.JustUpdateDeviceLine();
_xvalue = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)(_svalue));Debug.locals.put("xvalue", _xvalue);Debug.locals.put("xvalue", _xvalue);
 BA.debugLineNum = 2194;BA.debugLine="sprop = RemDelim(sprop,\":\")";
Debug.JustUpdateDeviceLine();
_sprop = __ref.runClassMethod (b4j.example.vuehtml.class, "_remdelim" /*RemoteObject*/ ,(Object)(_sprop),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("sprop", _sprop);
 BA.debugLineNum = 2196;BA.debugLine="xvalue = RemDelim(xvalue,\";\")";
Debug.JustUpdateDeviceLine();
_xvalue = __ref.runClassMethod (b4j.example.vuehtml.class, "_remdelim" /*RemoteObject*/ ,(Object)(_xvalue),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("xvalue", _xvalue);
 BA.debugLineNum = 2197;BA.debugLine="sprop = sprop.Trim";
Debug.JustUpdateDeviceLine();
_sprop = _sprop.runMethod(true,"trim");Debug.locals.put("sprop", _sprop);
 BA.debugLineNum = 2198;BA.debugLine="xvalue = xvalue.trim";
Debug.JustUpdateDeviceLine();
_xvalue = _xvalue.runMethod(true,"trim");Debug.locals.put("xvalue", _xvalue);
 BA.debugLineNum = 2199;BA.debugLine="If xvalue.Length > 0 And sprop.length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_xvalue.runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_sprop.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2201;BA.debugLine="If xvalue.EndsWith(\"!important\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_xvalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("!important"))),vuehtml.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2202;BA.debugLine="If IsImportant Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isimportant" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2203;BA.debugLine="xvalue = xvalue & \" !important\"";
Debug.JustUpdateDeviceLine();
_xvalue = RemoteObject.concat(_xvalue,RemoteObject.createImmutable(" !important"));Debug.locals.put("xvalue", _xvalue);
 };
 };
 BA.debugLineNum = 2207;BA.debugLine="Styles.Put(sprop, xvalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_styles" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_sprop)),(Object)((_xvalue)));
 };
 BA.debugLineNum = 2209;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 BA.debugLineNum = 2210;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2211;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyleattributeoncondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _attr,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddStyleAttributeOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1404);
if (RapidSub.canDelegate("addstyleattributeoncondition")) { return __ref.runUserSub(false, "vuehtml","addstyleattributeoncondition", __ref, _bcondition, _attr, _value);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("attr", _attr);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1404;BA.debugLine="Sub AddStyleAttributeOnCondition(bCondition As Boo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1405;BA.debugLine="If bCondition = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bcondition,vuehtml.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1406;BA.debugLine="SetStyle(attr,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(_attr),(Object)(_value));
 };
 BA.debugLineNum = 1408;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1409;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyleoncondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _attribute,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddStyleOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1378);
if (RapidSub.canDelegate("addstyleoncondition")) { return __ref.runUserSub(false, "vuehtml","addstyleoncondition", __ref, _bcondition, _attribute, _value);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("attribute", _attribute);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1378;BA.debugLine="Sub AddStyleOnCondition(bCondition As Boolean,attr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1379;BA.debugLine="If bCondition = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bcondition,vuehtml.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1380;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 1382;BA.debugLine="AddStyle(attribute,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(_attribute),(Object)((_value)));
 BA.debugLineNum = 1383;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1384;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addsub(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddSub (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2399);
if (RapidSub.canDelegate("addsub")) { return __ref.runUserSub(false, "vuehtml","addsub", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2399;BA.debugLine="Sub AddSub(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2400;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2401;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2402;BA.debugLine="sb.Append(\"<sub>\").Append(value).Append(\"</sub>\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<sub>"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</sub>")));
 BA.debugLineNum = 2403;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2404;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2405;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addsubscript(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddSubScript (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2382);
if (RapidSub.canDelegate("addsubscript")) { return __ref.runUserSub(false, "vuehtml","addsubscript", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2382;BA.debugLine="Sub AddSubScript(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2383;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2384;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2385;BA.debugLine="sb.Append(\"{SUB}\").Append(value).Append(\"{/SUB}\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("{SUB}"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("{/SUB}")));
 BA.debugLineNum = 2386;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2387;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2388;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addsup(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddSup (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2433);
if (RapidSub.canDelegate("addsup")) { return __ref.runUserSub(false, "vuehtml","addsup", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2433;BA.debugLine="Sub AddSup(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2434;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2435;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2436;BA.debugLine="sb.Append(\"<sup>\").Append(value).Append(\"</sup>\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<sup>"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</sup>")));
 BA.debugLineNum = 2437;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2438;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2439;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addsuperscript(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddSuperScript (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2391);
if (RapidSub.canDelegate("addsuperscript")) { return __ref.runUserSub(false, "vuehtml","addsuperscript", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2391;BA.debugLine="Sub AddSuperScript(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2392;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2393;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2394;BA.debugLine="sb.Append(\"{SUP}\").Append(value).Append(\"{/SUP}\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("{SUP}"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("{/SUP}")));
 BA.debugLineNum = 2395;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2396;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2397;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddText (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1523);
if (RapidSub.canDelegate("addtext")) { return __ref.runUserSub(false, "vuehtml","addtext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 1523;BA.debugLine="Sub AddText(txt As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1524;BA.debugLine="AddContent(txt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_txt));
 BA.debugLineNum = 1525;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1526;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addunderline(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddUnderline (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2373);
if (RapidSub.canDelegate("addunderline")) { return __ref.runUserSub(false, "vuehtml","addunderline", __ref, _value);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("value", _value);
 BA.debugLineNum = 2373;BA.debugLine="Sub AddUnderline(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2374;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2375;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2376;BA.debugLine="sb.Append(\"{U}\").Append(value).Append(\"{/U}\")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("{U}"))).runMethod(false,"Append",(Object)(_value)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("{/U}")));
 BA.debugLineNum = 2377;BA.debugLine="AddContent(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2378;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2379;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendh1(RemoteObject __ref,RemoteObject _paratext) throws Exception{
try {
		Debug.PushSubsStack("AppendH1 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2485);
if (RapidSub.canDelegate("appendh1")) { return __ref.runUserSub(false, "vuehtml","appendh1", __ref, _paratext);}
Debug.locals.put("paraText", _paratext);
 BA.debugLineNum = 2485;BA.debugLine="Sub AppendH1(paraText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2486;BA.debugLine="AddContent($\"<h1>${paraText}</h1>\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("<h1>"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_paratext))),RemoteObject.createImmutable("</h1>")))));
 BA.debugLineNum = 2487;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2488;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendh2(RemoteObject __ref,RemoteObject _paratext) throws Exception{
try {
		Debug.PushSubsStack("AppendH2 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2490);
if (RapidSub.canDelegate("appendh2")) { return __ref.runUserSub(false, "vuehtml","appendh2", __ref, _paratext);}
Debug.locals.put("paraText", _paratext);
 BA.debugLineNum = 2490;BA.debugLine="Sub AppendH2(paraText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2491;BA.debugLine="AddContent($\"<h2>${paraText}</h2>\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("<h2>"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_paratext))),RemoteObject.createImmutable("</h2>")))));
 BA.debugLineNum = 2492;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendh3(RemoteObject __ref,RemoteObject _paratext) throws Exception{
try {
		Debug.PushSubsStack("AppendH3 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2495);
if (RapidSub.canDelegate("appendh3")) { return __ref.runUserSub(false, "vuehtml","appendh3", __ref, _paratext);}
Debug.locals.put("paraText", _paratext);
 BA.debugLineNum = 2495;BA.debugLine="Sub AppendH3(paraText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2496;BA.debugLine="AddContent($\"<h3>${paraText}</h3>\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("<h3>"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_paratext))),RemoteObject.createImmutable("</h3>")))));
 BA.debugLineNum = 2497;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2498;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendh4(RemoteObject __ref,RemoteObject _paratext) throws Exception{
try {
		Debug.PushSubsStack("AppendH4 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2500);
if (RapidSub.canDelegate("appendh4")) { return __ref.runUserSub(false, "vuehtml","appendh4", __ref, _paratext);}
Debug.locals.put("paraText", _paratext);
 BA.debugLineNum = 2500;BA.debugLine="Sub AppendH4(paraText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2501;BA.debugLine="AddContent($\"<h4>${paraText}</h4>\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("<h4>"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_paratext))),RemoteObject.createImmutable("</h4>")))));
 BA.debugLineNum = 2502;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2503;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendh5(RemoteObject __ref,RemoteObject _paratext) throws Exception{
try {
		Debug.PushSubsStack("AppendH5 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2510);
if (RapidSub.canDelegate("appendh5")) { return __ref.runUserSub(false, "vuehtml","appendh5", __ref, _paratext);}
Debug.locals.put("paraText", _paratext);
 BA.debugLineNum = 2510;BA.debugLine="Sub AppendH5(paraText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2511;BA.debugLine="AddContent($\"<h5>${paraText}</h5>\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("<h5>"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_paratext))),RemoteObject.createImmutable("</h5>")))));
 BA.debugLineNum = 2512;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2513;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendh6(RemoteObject __ref,RemoteObject _paratext) throws Exception{
try {
		Debug.PushSubsStack("AppendH6 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2515);
if (RapidSub.canDelegate("appendh6")) { return __ref.runUserSub(false, "vuehtml","appendh6", __ref, _paratext);}
Debug.locals.put("paraText", _paratext);
 BA.debugLineNum = 2515;BA.debugLine="Sub AppendH6(paraText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2516;BA.debugLine="AddContent($\"<h6>${paraText}</h6>\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("<h6>"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_paratext))),RemoteObject.createImmutable("</h6>")))));
 BA.debugLineNum = 2517;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2518;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendparagraph(RemoteObject __ref,RemoteObject _scontent) throws Exception{
try {
		Debug.PushSubsStack("AppendParagraph (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1178);
if (RapidSub.canDelegate("appendparagraph")) { return __ref.runUserSub(false, "vuehtml","appendparagraph", __ref, _scontent);}
RemoteObject _p = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sContent", _scontent);
 BA.debugLineNum = 1178;BA.debugLine="Sub AppendParagraph(sContent As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1179;BA.debugLine="Dim p As VueHTML";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("p", _p);
 BA.debugLineNum = 1180;BA.debugLine="p.Initialize(\"\",\"p\")";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("p")));
 BA.debugLineNum = 1181;BA.debugLine="p.AddContent(sContent)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_scontent));
 BA.debugLineNum = 1182;BA.debugLine="AddContent(p.HTML)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_p.runClassMethod (b4j.example.vuehtml.class, "_html" /*RemoteObject*/ )));
 BA.debugLineNum = 1183;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendsmall(RemoteObject __ref,RemoteObject _paratext) throws Exception{
try {
		Debug.PushSubsStack("AppendSmall (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2505);
if (RapidSub.canDelegate("appendsmall")) { return __ref.runUserSub(false, "vuehtml","appendsmall", __ref, _paratext);}
Debug.locals.put("paraText", _paratext);
 BA.debugLineNum = 2505;BA.debugLine="Sub AppendSmall(paraText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2506;BA.debugLine="AddContent($\"<small>${paraText}</small>\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("<small>"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_paratext))),RemoteObject.createImmutable("</small>")))));
 BA.debugLineNum = 2507;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2508;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _applystyle(RemoteObject __ref,RemoteObject _sstyle) throws Exception{
try {
		Debug.PushSubsStack("ApplyStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1051);
if (RapidSub.canDelegate("applystyle")) { return __ref.runUserSub(false, "vuehtml","applystyle", __ref, _sstyle);}
RemoteObject _pieces = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strpiece = RemoteObject.createImmutable("");
RemoteObject _attr = RemoteObject.createImmutable("");
RemoteObject _val = RemoteObject.createImmutable("");
Debug.locals.put("sStyle", _sstyle);
 BA.debugLineNum = 1051;BA.debugLine="Sub ApplyStyle(sStyle As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1053;BA.debugLine="sStyle = sStyle.trim";
Debug.JustUpdateDeviceLine();
_sstyle = _sstyle.runMethod(true,"trim");Debug.locals.put("sStyle", _sstyle);
 BA.debugLineNum = 1054;BA.debugLine="sStyle = RemDelim(sStyle,\";\")";
Debug.JustUpdateDeviceLine();
_sstyle = __ref.runClassMethod (b4j.example.vuehtml.class, "_remdelim" /*RemoteObject*/ ,(Object)(_sstyle),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("sStyle", _sstyle);
 BA.debugLineNum = 1055;BA.debugLine="Dim pieces As List = StrParse(\";\",sStyle)";
Debug.JustUpdateDeviceLine();
_pieces = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_pieces = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_sstyle));Debug.locals.put("pieces", _pieces);Debug.locals.put("pieces", _pieces);
 BA.debugLineNum = 1056;BA.debugLine="For Each strPiece As String In pieces";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _pieces;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strpiece = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("strPiece", _strpiece);
Debug.locals.put("strPiece", _strpiece);
 BA.debugLineNum = 1057;BA.debugLine="Dim attr As String = MvField(strPiece,1,\":\")";
Debug.JustUpdateDeviceLine();
_attr = __ref.runClassMethod (b4j.example.vuehtml.class, "_mvfield" /*RemoteObject*/ ,(Object)(_strpiece),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("attr", _attr);Debug.locals.put("attr", _attr);
 BA.debugLineNum = 1058;BA.debugLine="Dim val As String = MvField(strPiece,2,\":\")";
Debug.JustUpdateDeviceLine();
_val = __ref.runClassMethod (b4j.example.vuehtml.class, "_mvfield" /*RemoteObject*/ ,(Object)(_strpiece),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1059;BA.debugLine="attr = attr.trim";
Debug.JustUpdateDeviceLine();
_attr = _attr.runMethod(true,"trim");Debug.locals.put("attr", _attr);
 BA.debugLineNum = 1060;BA.debugLine="val = val.trim";
Debug.JustUpdateDeviceLine();
_val = _val.runMethod(true,"trim");Debug.locals.put("val", _val);
 BA.debugLineNum = 1061;BA.debugLine="If attr <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_attr,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1062;BA.debugLine="SetStyle(attr,val)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(_attr),(Object)(_val));
 };
 }
}Debug.locals.put("strPiece", _strpiece);
;
 BA.debugLineNum = 1065;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1066;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildattributes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildAttributes (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2072);
if (RapidSub.canDelegate("buildattributes")) { return __ref.runUserSub(false, "vuehtml","buildattributes", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _ktot = RemoteObject.createImmutable(0);
RemoteObject _kcnt = RemoteObject.createImmutable(0);
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _strvalue = RemoteObject.declareNull("Object");
 BA.debugLineNum = 2072;BA.debugLine="Sub BuildAttributes As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2073;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2074;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2075;BA.debugLine="Dim kTot As Int = properties.Size - 1";
Debug.JustUpdateDeviceLine();
_ktot = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("kTot", _ktot);Debug.locals.put("kTot", _ktot);
 BA.debugLineNum = 2076;BA.debugLine="Dim kCnt As Int";
Debug.JustUpdateDeviceLine();
_kcnt = RemoteObject.createImmutable(0);Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 2077;BA.debugLine="Dim strKey As String = properties.GetKeyAt(0)";
Debug.JustUpdateDeviceLine();
_strkey = BA.ObjectToString(__ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("strKey", _strkey);Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 2078;BA.debugLine="Dim strValue As Object = properties.Get(strKey)";
Debug.JustUpdateDeviceLine();
_strvalue = __ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strkey)));Debug.locals.put("strValue", _strvalue);Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 2079;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_singlequote" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_strkey))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 2080;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_toproperty" /*RemoteObject*/ ,(Object)(_strkey),(Object)(_strvalue))));
 }else {
 BA.debugLineNum = 2082;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_tosinglequoteproperty" /*RemoteObject*/ ,(Object)(_strkey),(Object)(_strvalue))));
 };
 BA.debugLineNum = 2084;BA.debugLine="For kCnt = 1 To kTot";
Debug.JustUpdateDeviceLine();
{
final int step12 = 1;
final int limit12 = _ktot.<Integer>get().intValue();
_kcnt = BA.numberCast(int.class, 1) ;
for (;(step12 > 0 && _kcnt.<Integer>get().intValue() <= limit12) || (step12 < 0 && _kcnt.<Integer>get().intValue() >= limit12) ;_kcnt = RemoteObject.createImmutable((int)(0 + _kcnt.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 2085;BA.debugLine="strKey = properties.GetKeyAt(kCnt)";
Debug.JustUpdateDeviceLine();
_strkey = BA.ObjectToString(__ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_kcnt)));Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 2086;BA.debugLine="strValue = properties.Get(strKey)";
Debug.JustUpdateDeviceLine();
_strvalue = __ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strkey)));Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 2087;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 2088;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_singlequote" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_strkey))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 2089;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_toproperty" /*RemoteObject*/ ,(Object)(_strkey),(Object)(_strvalue))));
 }else {
 BA.debugLineNum = 2091;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_tosinglequoteproperty" /*RemoteObject*/ ,(Object)(_strkey),(Object)(_strvalue))));
 };
 }
}Debug.locals.put("kCnt", _kcnt);
;
 BA.debugLineNum = 2094;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 2095;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildclass(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildClass (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1806);
if (RapidSub.canDelegate("buildclass")) { return __ref.runUserSub(false, "vuehtml","buildclass", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _ktot = RemoteObject.createImmutable(0);
RemoteObject _kcnt = RemoteObject.createImmutable(0);
RemoteObject _strclass = RemoteObject.createImmutable("");
RemoteObject _estyle = RemoteObject.createImmutable("");
 BA.debugLineNum = 1806;BA.debugLine="Sub BuildClass() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1807;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1808;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1809;BA.debugLine="Dim kTot As Int = Classes.Size - 1";
Debug.JustUpdateDeviceLine();
_ktot = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_classes" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("kTot", _ktot);Debug.locals.put("kTot", _ktot);
 BA.debugLineNum = 1810;BA.debugLine="Dim kCnt As Int";
Debug.JustUpdateDeviceLine();
_kcnt = RemoteObject.createImmutable(0);Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 1811;BA.debugLine="Dim strClass As String  = Classes.GetKeyAt(0)";
Debug.JustUpdateDeviceLine();
_strclass = BA.ObjectToString(__ref.getField(false,"_classes" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("strClass", _strclass);Debug.locals.put("strClass", _strclass);
 BA.debugLineNum = 1812;BA.debugLine="sb.Append(strClass)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_strclass));
 BA.debugLineNum = 1813;BA.debugLine="For kCnt = 1 To kTot";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = _ktot.<Integer>get().intValue();
_kcnt = BA.numberCast(int.class, 1) ;
for (;(step7 > 0 && _kcnt.<Integer>get().intValue() <= limit7) || (step7 < 0 && _kcnt.<Integer>get().intValue() >= limit7) ;_kcnt = RemoteObject.createImmutable((int)(0 + _kcnt.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 1814;BA.debugLine="Dim strClass As String  = Classes.GetKeyAt(kCnt)";
Debug.JustUpdateDeviceLine();
_strclass = BA.ObjectToString(__ref.getField(false,"_classes" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_kcnt)));Debug.locals.put("strClass", _strclass);Debug.locals.put("strClass", _strclass);
 BA.debugLineNum = 1816;BA.debugLine="If CSSRule.ContainsKey(strClass.tolowercase) The";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_strclass.runMethod(true,"toLowerCase")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1817;BA.debugLine="Dim eStyle As String = CSSRule.Get(strClass)";
Debug.JustUpdateDeviceLine();
_estyle = BA.ObjectToString(__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strclass))));Debug.locals.put("eStyle", _estyle);Debug.locals.put("eStyle", _estyle);
 BA.debugLineNum = 1818;BA.debugLine="ApplyStyle(eStyle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_applystyle" /*RemoteObject*/ ,(Object)(_estyle));
 BA.debugLineNum = 1819;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 1822;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 1823;BA.debugLine="sb.Append(strClass)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_strclass));
 }
}Debug.locals.put("kCnt", _kcnt);
;
 BA.debugLineNum = 1825;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 1826;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildcssrules(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildCSSRules (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("buildcssrules")) { return __ref.runUserSub(false, "vuehtml","buildcssrules", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _scontent = RemoteObject.createImmutable("");
RemoteObject _spprops = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strpropvalue = RemoteObject.createImmutable("");
RemoteObject _strprop = RemoteObject.createImmutable("");
RemoteObject _strvalue = RemoteObject.createImmutable("");
RemoteObject _nline = RemoteObject.createImmutable("");
RemoteObject _values = RemoteObject.createImmutable("");
 BA.debugLineNum = 36;BA.debugLine="Sub BuildCSSRules() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 38;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="For Each strKey As String In CSSRule.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("strKey", _strkey);
Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 42;BA.debugLine="Dim scontent As String = CSSRule.Get(strKey)";
Debug.JustUpdateDeviceLine();
_scontent = BA.ObjectToString(__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strkey))));Debug.locals.put("scontent", _scontent);Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 43;BA.debugLine="Dim spProps As List = StrParse(\";\",scontent)";
Debug.JustUpdateDeviceLine();
_spprops = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_spprops = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_scontent));Debug.locals.put("spProps", _spprops);Debug.locals.put("spProps", _spprops);
 BA.debugLineNum = 44;BA.debugLine="Dim nList As List";
Debug.JustUpdateDeviceLine();
_nlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nList", _nlist);
 BA.debugLineNum = 45;BA.debugLine="nList.initialize";
Debug.JustUpdateDeviceLine();
_nlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="For Each strPropValue As String In spProps";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = _spprops;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_strpropvalue = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("strPropValue", _strpropvalue);
Debug.locals.put("strPropValue", _strpropvalue);
 BA.debugLineNum = 47;BA.debugLine="strPropValue = strPropValue.Trim";
Debug.JustUpdateDeviceLine();
_strpropvalue = _strpropvalue.runMethod(true,"trim");Debug.locals.put("strPropValue", _strpropvalue);
 BA.debugLineNum = 48;BA.debugLine="If strPropValue <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_strpropvalue,BA.ObjectToString(""))) { 
 BA.debugLineNum = 49;BA.debugLine="Dim strProp As String = MvField(strPropValue,1";
Debug.JustUpdateDeviceLine();
_strprop = __ref.runClassMethod (b4j.example.vuehtml.class, "_mvfield" /*RemoteObject*/ ,(Object)(_strpropvalue),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("strProp", _strprop);Debug.locals.put("strProp", _strprop);
 BA.debugLineNum = 50;BA.debugLine="Dim strValue As String = MvField(strPropValue,";
Debug.JustUpdateDeviceLine();
_strvalue = __ref.runClassMethod (b4j.example.vuehtml.class, "_mvfield" /*RemoteObject*/ ,(Object)(_strpropvalue),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("strValue", _strvalue);Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 51;BA.debugLine="strProp = strProp.Trim";
Debug.JustUpdateDeviceLine();
_strprop = _strprop.runMethod(true,"trim");Debug.locals.put("strProp", _strprop);
 BA.debugLineNum = 52;BA.debugLine="strValue = strValue.trim";
Debug.JustUpdateDeviceLine();
_strvalue = _strvalue.runMethod(true,"trim");Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 53;BA.debugLine="If strValue.EndsWith(\"!important\") = False And";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_strvalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("!important"))),vuehtml.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_isimportant" /*RemoteObject*/ ),vuehtml.__c.getField(true,"True"))) { 
 BA.debugLineNum = 54;BA.debugLine="strValue = strValue & \" !important\"";
Debug.JustUpdateDeviceLine();
_strvalue = RemoteObject.concat(_strvalue,RemoteObject.createImmutable(" !important"));Debug.locals.put("strValue", _strvalue);
 };
 BA.debugLineNum = 56;BA.debugLine="Dim nLine As String = $\"${strProp}:${strValue}";
Debug.JustUpdateDeviceLine();
_nline = (RemoteObject.concat(RemoteObject.createImmutable(""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strprop))),RemoteObject.createImmutable(":"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strvalue))),RemoteObject.createImmutable("")));Debug.locals.put("nLine", _nline);Debug.locals.put("nLine", _nline);
 BA.debugLineNum = 57;BA.debugLine="nList.Add(nLine)";
Debug.JustUpdateDeviceLine();
_nlist.runVoidMethod ("Add",(Object)((_nline)));
 };
 }
}Debug.locals.put("strPropValue", _strpropvalue);
;
 BA.debugLineNum = 60;BA.debugLine="scontent = Join(\";\",nList)";
Debug.JustUpdateDeviceLine();
_scontent = __ref.runClassMethod (b4j.example.vuehtml.class, "_join" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_nlist));Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 61;BA.debugLine="CSSRule.Put(strKey,scontent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strkey)),(Object)((_scontent)));
 }
}Debug.locals.put("strKey", _strkey);
;
 BA.debugLineNum = 64;BA.debugLine="For Each strKey As String In CSSRule.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group25 = __ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen25 = group25.runMethod(true,"getSize").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_strkey = BA.ObjectToString(group25.runMethod(false,"Get",index25));Debug.locals.put("strKey", _strkey);
Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 65;BA.debugLine="Dim values As String = CSSRule.Get(strKey)";
Debug.JustUpdateDeviceLine();
_values = BA.ObjectToString(__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strkey))));Debug.locals.put("values", _values);Debug.locals.put("values", _values);
 BA.debugLineNum = 66;BA.debugLine="If values.StartsWith(\"{\") = False Then values =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_values.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("{"))),vuehtml.__c.getField(true,"False"))) { 
_values = RemoteObject.concat(RemoteObject.createImmutable("{"),_values);Debug.locals.put("values", _values);};
 BA.debugLineNum = 67;BA.debugLine="If values.EndsWith(\"}\") = False Then values = va";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_values.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("}"))),vuehtml.__c.getField(true,"False"))) { 
_values = RemoteObject.concat(_values,RemoteObject.createImmutable("}"));Debug.locals.put("values", _values);};
 BA.debugLineNum = 68;BA.debugLine="sb.Append(strKey).Append(\" \").Append(values).App";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_strkey)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runMethod(false,"Append",(Object)(_values)).runVoidMethod ("Append",(Object)(vuehtml.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("strKey", _strkey);
;
 BA.debugLineNum = 70;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
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
public static RemoteObject  _buildstyle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1831);
if (RapidSub.canDelegate("buildstyle")) { return __ref.runUserSub(false, "vuehtml","buildstyle", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _kcnt = RemoteObject.createImmutable(0);
RemoteObject _ktot = RemoteObject.createImmutable(0);
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _strvalue = RemoteObject.createImmutable("");
RemoteObject _strline = RemoteObject.createImmutable("");
 BA.debugLineNum = 1831;BA.debugLine="Sub BuildStyle() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1832;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1833;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1834;BA.debugLine="Dim kCnt As Int";
Debug.JustUpdateDeviceLine();
_kcnt = RemoteObject.createImmutable(0);Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 1835;BA.debugLine="Dim kTot As Int = Styles.Size - 1";
Debug.JustUpdateDeviceLine();
_ktot = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("kTot", _ktot);Debug.locals.put("kTot", _ktot);
 BA.debugLineNum = 1837;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(0)";
Debug.JustUpdateDeviceLine();
_strkey = BA.ObjectToString(__ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("strKey", _strkey);Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 1838;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
Debug.JustUpdateDeviceLine();
_strvalue = BA.ObjectToString(__ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strkey))));Debug.locals.put("strValue", _strvalue);Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 1839;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
Debug.JustUpdateDeviceLine();
_strline = __ref.runClassMethod (b4j.example.vuehtml.class, "_tostyle" /*RemoteObject*/ ,(Object)(_strkey),(Object)(_strvalue));Debug.locals.put("strLine", _strline);Debug.locals.put("strLine", _strline);
 BA.debugLineNum = 1840;BA.debugLine="sb.Append(strLine)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_strline));
 BA.debugLineNum = 1841;BA.debugLine="For kCnt = 1 To kTot";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _ktot.<Integer>get().intValue();
_kcnt = BA.numberCast(int.class, 1) ;
for (;(step9 > 0 && _kcnt.<Integer>get().intValue() <= limit9) || (step9 < 0 && _kcnt.<Integer>get().intValue() >= limit9) ;_kcnt = RemoteObject.createImmutable((int)(0 + _kcnt.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 1842;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(kCnt)";
Debug.JustUpdateDeviceLine();
_strkey = BA.ObjectToString(__ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_kcnt)));Debug.locals.put("strKey", _strkey);Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 1843;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
Debug.JustUpdateDeviceLine();
_strvalue = BA.ObjectToString(__ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strkey))));Debug.locals.put("strValue", _strvalue);Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 1844;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
Debug.JustUpdateDeviceLine();
_strline = __ref.runClassMethod (b4j.example.vuehtml.class, "_tostyle" /*RemoteObject*/ ,(Object)(_strkey),(Object)(_strvalue));Debug.locals.put("strLine", _strline);Debug.locals.put("strLine", _strline);
 BA.debugLineNum = 1845;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 1846;BA.debugLine="sb.Append(strLine)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_strline));
 }
}Debug.locals.put("kCnt", _kcnt);
;
 BA.debugLineNum = 1848;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 1849;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _centeritems(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("CenterItems (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("centeritems")) { return __ref.runUserSub(false, "vuehtml","centeritems", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 151;BA.debugLine="Sub CenterItems(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="SetStyle(\"justify-content\", \"center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("justify-content")),(Object)(RemoteObject.createImmutable("center")));
 BA.debugLineNum = 153;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _centertext(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("CenterText (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("centertext")) { return __ref.runUserSub(false, "vuehtml","centertext", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 157;BA.debugLine="Sub CenterText(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="SetStyle(\"text-align\", \"center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text-align")),(Object)(RemoteObject.createImmutable("center")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vuehtml._id = RemoteObject.createImmutable("");__ref.setField("_id",vuehtml._id);
 //BA.debugLineNum = 5;BA.debugLine="Public Tag As String";
vuehtml._tag = RemoteObject.createImmutable("");__ref.setField("_tag",vuehtml._tag);
 //BA.debugLineNum = 6;BA.debugLine="Private properties As Map";
vuehtml._properties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_properties",vuehtml._properties);
 //BA.debugLineNum = 7;BA.debugLine="Private Contents As List";
vuehtml._contents = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_contents",vuehtml._contents);
 //BA.debugLineNum = 8;BA.debugLine="Private Classes As Map";
vuehtml._classes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_classes",vuehtml._classes);
 //BA.debugLineNum = 9;BA.debugLine="Public Styles As Map";
vuehtml._styles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_styles",vuehtml._styles);
 //BA.debugLineNum = 10;BA.debugLine="Private LooseAttributes As Map";
vuehtml._looseattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_looseattributes",vuehtml._looseattributes);
 //BA.debugLineNum = 11;BA.debugLine="Private DontBreak As List";
vuehtml._dontbreak = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_dontbreak",vuehtml._dontbreak);
 //BA.debugLineNum = 12;BA.debugLine="Private Prefix As String";
vuehtml._prefix = RemoteObject.createImmutable("");__ref.setField("_prefix",vuehtml._prefix);
 //BA.debugLineNum = 13;BA.debugLine="Private DoAProperClose As Boolean";
vuehtml._doaproperclose = RemoteObject.createImmutable(false);__ref.setField("_doaproperclose",vuehtml._doaproperclose);
 //BA.debugLineNum = 14;BA.debugLine="Private CSSRule As Map";
vuehtml._cssrule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cssrule",vuehtml._cssrule);
 //BA.debugLineNum = 15;BA.debugLine="Private SingleQuote As List";
vuehtml._singlequote = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_singlequote",vuehtml._singlequote);
 //BA.debugLineNum = 16;BA.debugLine="Private SBAfter As StringBuilder";
vuehtml._sbafter = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");__ref.setField("_sbafter",vuehtml._sbafter);
 //BA.debugLineNum = 17;BA.debugLine="Private SBBefore As StringBuilder";
vuehtml._sbbefore = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");__ref.setField("_sbbefore",vuehtml._sbbefore);
 //BA.debugLineNum = 18;BA.debugLine="Public IsImportant As Boolean";
vuehtml._isimportant = RemoteObject.createImmutable(false);__ref.setField("_isimportant",vuehtml._isimportant);
 //BA.debugLineNum = 19;BA.debugLine="Private BANano As BANano   'ignore";
vuehtml._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vuehtml._banano);
 //BA.debugLineNum = 20;BA.debugLine="Private ParentID As String";
vuehtml._parentid = RemoteObject.createImmutable("");__ref.setField("_parentid",vuehtml._parentid);
 //BA.debugLineNum = 21;BA.debugLine="Private ds As String";
vuehtml._ds = RemoteObject.createImmutable("");__ref.setField("_ds",vuehtml._ds);
 //BA.debugLineNum = 22;BA.debugLine="Private hasContent As Boolean";
vuehtml._hascontent = RemoteObject.createImmutable(false);__ref.setField("_hascontent",vuehtml._hascontent);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _classexists(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ClassExists (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1428);
if (RapidSub.canDelegate("classexists")) { return __ref.runUserSub(false, "vuehtml","classexists", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1428;BA.debugLine="Sub ClassExists(value As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1429;BA.debugLine="value = value.trim";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"trim");Debug.locals.put("value", _value);
 BA.debugLineNum = 1430;BA.debugLine="If value.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_value.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1431;BA.debugLine="Return Classes.ContainsKey(value)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_classes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_value)));
 };
 BA.debugLineNum = 1433;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return vuehtml.__c.getField(true,"False");
 BA.debugLineNum = 1434;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1005);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "vuehtml","clear", __ref);}
 BA.debugLineNum = 1005;BA.debugLine="Sub Clear As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1006;BA.debugLine="Contents.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1007;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1008;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Close (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2275);
if (RapidSub.canDelegate("close")) { return __ref.runUserSub(false, "vuehtml","close", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 2275;BA.debugLine="private Sub Close() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2276;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2277;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2278;BA.debugLine="Select Case Tag.ToLowerCase";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_tag" /*RemoteObject*/ ).runMethod(true,"toLowerCase"),BA.ObjectToString("img"),BA.ObjectToString("link"),BA.ObjectToString("meta"),BA.ObjectToString("input"),BA.ObjectToString("source"),BA.ObjectToString("hr"),BA.ObjectToString("br"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: {
 BA.debugLineNum = 2280;BA.debugLine="DoAProperClose = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_doaproperclose" /*RemoteObject*/ ,vuehtml.__c.getField(true,"False"));
 break; }
}
;
 BA.debugLineNum = 2282;BA.debugLine="If DoAProperClose = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_doaproperclose" /*RemoteObject*/ ),vuehtml.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2283;BA.debugLine="sb.Append(\"</\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</")));
 BA.debugLineNum = 2284;BA.debugLine="sb.Append(Tag)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.getField(true,"_tag" /*RemoteObject*/ )));
 BA.debugLineNum = 2285;BA.debugLine="sb.Append(\">\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(">")));
 };
 BA.debugLineNum = 2287;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 2288;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createanchor(RemoteObject __ref,RemoteObject _aid) throws Exception{
try {
		Debug.PushSubsStack("CreateAnchor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2809);
if (RapidSub.canDelegate("createanchor")) { return __ref.runUserSub(false, "vuehtml","createanchor", __ref, _aid);}
RemoteObject _a = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("aid", _aid);
 BA.debugLineNum = 2809;BA.debugLine="Sub CreateAnchor(aid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2810;BA.debugLine="Dim a As VueHTML";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("a", _a);
 BA.debugLineNum = 2811;BA.debugLine="a.Initialize(aid,\"a\")";
Debug.JustUpdateDeviceLine();
_a.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_aid),(Object)(RemoteObject.createImmutable("a")));
 BA.debugLineNum = 2812;BA.debugLine="Return a";
Debug.JustUpdateDeviceLine();
if (true) return _a;
 BA.debugLineNum = 2813;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createarticle(RemoteObject __ref,RemoteObject _aid) throws Exception{
try {
		Debug.PushSubsStack("CreateArticle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2816);
if (RapidSub.canDelegate("createarticle")) { return __ref.runUserSub(false, "vuehtml","createarticle", __ref, _aid);}
RemoteObject _a = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("aid", _aid);
 BA.debugLineNum = 2816;BA.debugLine="Sub CreateArticle(aid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2817;BA.debugLine="Dim a As VueHTML";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("a", _a);
 BA.debugLineNum = 2818;BA.debugLine="a.Initialize(aid,\"article\")";
Debug.JustUpdateDeviceLine();
_a.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_aid),(Object)(RemoteObject.createImmutable("article")));
 BA.debugLineNum = 2819;BA.debugLine="Return a";
Debug.JustUpdateDeviceLine();
if (true) return _a;
 BA.debugLineNum = 2820;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createaside(RemoteObject __ref,RemoteObject _aid) throws Exception{
try {
		Debug.PushSubsStack("CreateAside (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2823);
if (RapidSub.canDelegate("createaside")) { return __ref.runUserSub(false, "vuehtml","createaside", __ref, _aid);}
RemoteObject _a = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("aid", _aid);
 BA.debugLineNum = 2823;BA.debugLine="Sub CreateAside(aid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2824;BA.debugLine="Dim a As VueHTML";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("a", _a);
 BA.debugLineNum = 2825;BA.debugLine="a.Initialize(aid,\"aside\")";
Debug.JustUpdateDeviceLine();
_a.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_aid),(Object)(RemoteObject.createImmutable("aside")));
 BA.debugLineNum = 2826;BA.debugLine="Return a";
Debug.JustUpdateDeviceLine();
if (true) return _a;
 BA.debugLineNum = 2827;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createaudio(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateAUDIO (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2877);
if (RapidSub.canDelegate("createaudio")) { return __ref.runUserSub(false, "vuehtml","createaudio", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2877;BA.debugLine="Sub CreateAUDIO(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2878;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2879;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2880;BA.debugLine="div.Initialize(cid,\"audio\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("audio")));
 BA.debugLineNum = 2881;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2882;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createblockquote(RemoteObject __ref,RemoteObject _bqid) throws Exception{
try {
		Debug.PushSubsStack("CreateBlockQuote (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2595);
if (RapidSub.canDelegate("createblockquote")) { return __ref.runUserSub(false, "vuehtml","createblockquote", __ref, _bqid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("bqid", _bqid);
 BA.debugLineNum = 2595;BA.debugLine="Sub CreateBlockQuote(bqid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2596;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2597;BA.debugLine="ul.Initialize(bqid,\"blockquote\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_bqid),(Object)(RemoteObject.createImmutable("blockquote")));
 BA.debugLineNum = 2598;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2599;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbutton(RemoteObject __ref,RemoteObject _btnid) throws Exception{
try {
		Debug.PushSubsStack("CreateButton (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3034);
if (RapidSub.canDelegate("createbutton")) { return __ref.runUserSub(false, "vuehtml","createbutton", __ref, _btnid);}
RemoteObject _b = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("btnID", _btnid);
 BA.debugLineNum = 3034;BA.debugLine="Sub CreateButton(btnID As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3035;BA.debugLine="Dim b As VueHTML";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("b", _b);
 BA.debugLineNum = 3036;BA.debugLine="b.Initialize(btnID, \"button\")";
Debug.JustUpdateDeviceLine();
_b.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_btnid),(Object)(RemoteObject.createImmutable("button")));
 BA.debugLineNum = 3037;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
if (true) return _b;
 BA.debugLineNum = 3038;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcanvas(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateCANVAS (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2869);
if (RapidSub.canDelegate("createcanvas")) { return __ref.runUserSub(false, "vuehtml","createcanvas", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2869;BA.debugLine="Sub CreateCANVAS(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2870;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2871;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2872;BA.debugLine="div.Initialize(cid,\"canvas\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("canvas")));
 BA.debugLineNum = 2873;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2874;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcaption(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateCAPTION (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2934);
if (RapidSub.canDelegate("createcaption")) { return __ref.runUserSub(false, "vuehtml","createcaption", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2934;BA.debugLine="Sub CreateCAPTION(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2935;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2936;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2937;BA.debugLine="div.Initialize(cid,\"caption\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("caption")));
 BA.debugLineNum = 2938;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2939;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcode(RemoteObject __ref,RemoteObject _oid) throws Exception{
try {
		Debug.PushSubsStack("CreateCode (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3007);
if (RapidSub.canDelegate("createcode")) { return __ref.runUserSub(false, "vuehtml","createcode", __ref, _oid);}
RemoteObject _o = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("oid", _oid);
 BA.debugLineNum = 3007;BA.debugLine="Sub CreateCode(oid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3008;BA.debugLine="Dim o As VueHTML";
Debug.JustUpdateDeviceLine();
_o = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("o", _o);
 BA.debugLineNum = 3009;BA.debugLine="o.Initialize(oid, \"code\")";
Debug.JustUpdateDeviceLine();
_o.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_oid),(Object)(RemoteObject.createImmutable("code")));
 BA.debugLineNum = 3010;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return _o;
 BA.debugLineNum = 3011;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcontainer(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateContainer (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2861);
if (RapidSub.canDelegate("createcontainer")) { return __ref.runUserSub(false, "vuehtml","createcontainer", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2861;BA.debugLine="Sub CreateContainer(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2862;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2863;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2864;BA.debugLine="div.Initialize(cid,\"div\").AddClass(\"container\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("container")));
 BA.debugLineNum = 2865;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2866;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdatalist(RemoteObject __ref,RemoteObject _nid) throws Exception{
try {
		Debug.PushSubsStack("CreateDataList (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2566);
if (RapidSub.canDelegate("createdatalist")) { return __ref.runUserSub(false, "vuehtml","createdatalist", __ref, _nid);}
RemoteObject _n = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("nid", _nid);
 BA.debugLineNum = 2566;BA.debugLine="Sub CreateDataList(nid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2567;BA.debugLine="Dim n As VueHTML";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("n", _n);
 BA.debugLineNum = 2568;BA.debugLine="n.Initialize(nid, \"datalist\")";
Debug.JustUpdateDeviceLine();
_n.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_nid),(Object)(RemoteObject.createImmutable("datalist")));
 BA.debugLineNum = 2569;BA.debugLine="Return n";
Debug.JustUpdateDeviceLine();
if (true) return _n;
 BA.debugLineNum = 2570;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdd(RemoteObject __ref,RemoteObject _preid) throws Exception{
try {
		Debug.PushSubsStack("CreateDD (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2639);
if (RapidSub.canDelegate("createdd")) { return __ref.runUserSub(false, "vuehtml","createdd", __ref, _preid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("preid", _preid);
 BA.debugLineNum = 2639;BA.debugLine="Sub CreateDD(preid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2640;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2641;BA.debugLine="ul.Initialize(preid, \"dd\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_preid),(Object)(RemoteObject.createImmutable("dd")));
 BA.debugLineNum = 2642;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2643;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creatediv(RemoteObject __ref,RemoteObject _did) throws Exception{
try {
		Debug.PushSubsStack("CreateDIV (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2588);
if (RapidSub.canDelegate("creatediv")) { return __ref.runUserSub(false, "vuehtml","creatediv", __ref, _did);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("did", _did);
 BA.debugLineNum = 2588;BA.debugLine="Sub CreateDIV(did As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2589;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2590;BA.debugLine="div.Initialize(did,\"div\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_did),(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 2591;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2592;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdl(RemoteObject __ref,RemoteObject _preid) throws Exception{
try {
		Debug.PushSubsStack("CreateDL (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2627);
if (RapidSub.canDelegate("createdl")) { return __ref.runUserSub(false, "vuehtml","createdl", __ref, _preid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("preid", _preid);
 BA.debugLineNum = 2627;BA.debugLine="Sub CreateDL(preid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2628;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2629;BA.debugLine="ul.Initialize(preid, \"dl\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_preid),(Object)(RemoteObject.createImmutable("dl")));
 BA.debugLineNum = 2630;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2631;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdt(RemoteObject __ref,RemoteObject _preid) throws Exception{
try {
		Debug.PushSubsStack("CreateDT (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2633);
if (RapidSub.canDelegate("createdt")) { return __ref.runUserSub(false, "vuehtml","createdt", __ref, _preid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("preid", _preid);
 BA.debugLineNum = 2633;BA.debugLine="Sub CreateDT(preid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2634;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2635;BA.debugLine="ul.Initialize(preid, \"dt\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_preid),(Object)(RemoteObject.createImmutable("dt")));
 BA.debugLineNum = 2636;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2637;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createem(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateEM (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2787);
if (RapidSub.canDelegate("createem")) { return __ref.runUserSub(false, "vuehtml","createem", __ref, _sid);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2787;BA.debugLine="Sub CreateEM(sid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2788;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 2789;BA.debugLine="s.Initialize(sid, \"em\")";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sid),(Object)(RemoteObject.createImmutable("em")));
 BA.debugLineNum = 2790;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 2791;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfieldset(RemoteObject __ref,RemoteObject _fid,RemoteObject _scaption) throws Exception{
try {
		Debug.PushSubsStack("CreateFieldSet (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2852);
if (RapidSub.canDelegate("createfieldset")) { return __ref.runUserSub(false, "vuehtml","createfieldset", __ref, _fid, _scaption);}
RemoteObject _fs = RemoteObject.declareNull("b4j.example.vuehtml");
RemoteObject _lgnd = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("fID", _fid);
Debug.locals.put("sCaption", _scaption);
 BA.debugLineNum = 2852;BA.debugLine="Sub CreateFieldSet(fID As String, sCaption As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2853;BA.debugLine="Dim fs As VueHTML";
Debug.JustUpdateDeviceLine();
_fs = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("fs", _fs);
 BA.debugLineNum = 2854;BA.debugLine="fs.Initialize(fID,\"fieldset\")";
Debug.JustUpdateDeviceLine();
_fs.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_fid),(Object)(RemoteObject.createImmutable("fieldset")));
 BA.debugLineNum = 2855;BA.debugLine="Dim lgnd As VueHTML = CreateLegend(\"\", sCaption)";
Debug.JustUpdateDeviceLine();
_lgnd = __ref.runClassMethod (b4j.example.vuehtml.class, "_createlegend" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(_scaption));Debug.locals.put("lgnd", _lgnd);Debug.locals.put("lgnd", _lgnd);
 BA.debugLineNum = 2856;BA.debugLine="fs.AddElement(lgnd)";
Debug.JustUpdateDeviceLine();
_fs.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_lgnd));
 BA.debugLineNum = 2857;BA.debugLine="Return fs";
Debug.JustUpdateDeviceLine();
if (true) return _fs;
 BA.debugLineNum = 2858;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfigcaption(RemoteObject __ref,RemoteObject _fid) throws Exception{
try {
		Debug.PushSubsStack("CreateFigCaption (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2706);
if (RapidSub.canDelegate("createfigcaption")) { return __ref.runUserSub(false, "vuehtml","createfigcaption", __ref, _fid);}
RemoteObject _f = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("fid", _fid);
 BA.debugLineNum = 2706;BA.debugLine="Sub CreateFigCaption(fid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2707;BA.debugLine="Dim f As VueHTML";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("f", _f);
 BA.debugLineNum = 2708;BA.debugLine="f.Initialize(fid, \"figcaption\")";
Debug.JustUpdateDeviceLine();
_f.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_fid),(Object)(RemoteObject.createImmutable("figcaption")));
 BA.debugLineNum = 2709;BA.debugLine="Return f";
Debug.JustUpdateDeviceLine();
if (true) return _f;
 BA.debugLineNum = 2710;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfigure(RemoteObject __ref,RemoteObject _fid) throws Exception{
try {
		Debug.PushSubsStack("CreateFigure (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2714);
if (RapidSub.canDelegate("createfigure")) { return __ref.runUserSub(false, "vuehtml","createfigure", __ref, _fid);}
RemoteObject _f = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("fid", _fid);
 BA.debugLineNum = 2714;BA.debugLine="Sub CreateFigure(fid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2715;BA.debugLine="Dim f As VueHTML";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("f", _f);
 BA.debugLineNum = 2716;BA.debugLine="f.Initialize(fid, \"figure\")";
Debug.JustUpdateDeviceLine();
_f.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_fid),(Object)(RemoteObject.createImmutable("figure")));
 BA.debugLineNum = 2717;BA.debugLine="Return f";
Debug.JustUpdateDeviceLine();
if (true) return _f;
 BA.debugLineNum = 2718;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfooter(RemoteObject __ref,RemoteObject _fid) throws Exception{
try {
		Debug.PushSubsStack("CreateFooter (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2552);
if (RapidSub.canDelegate("createfooter")) { return __ref.runUserSub(false, "vuehtml","createfooter", __ref, _fid);}
RemoteObject _f = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("fid", _fid);
 BA.debugLineNum = 2552;BA.debugLine="Sub CreateFooter(fid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2553;BA.debugLine="Dim f As VueHTML";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("f", _f);
 BA.debugLineNum = 2554;BA.debugLine="f.Initialize(fid, \"footer\")";
Debug.JustUpdateDeviceLine();
_f.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_fid),(Object)(RemoteObject.createImmutable("footer")));
 BA.debugLineNum = 2555;BA.debugLine="Return f";
Debug.JustUpdateDeviceLine();
if (true) return _f;
 BA.debugLineNum = 2556;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createform(RemoteObject __ref,RemoteObject _fid) throws Exception{
try {
		Debug.PushSubsStack("CreateForm (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2838);
if (RapidSub.canDelegate("createform")) { return __ref.runUserSub(false, "vuehtml","createform", __ref, _fid);}
RemoteObject _frm = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("fID", _fid);
 BA.debugLineNum = 2838;BA.debugLine="Sub CreateForm(fID As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2839;BA.debugLine="Dim frm As VueHTML";
Debug.JustUpdateDeviceLine();
_frm = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("frm", _frm);
 BA.debugLineNum = 2840;BA.debugLine="frm.Initialize(fID, \"form\")";
Debug.JustUpdateDeviceLine();
_frm.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_fid),(Object)(RemoteObject.createImmutable("form")));
 BA.debugLineNum = 2841;BA.debugLine="Return frm";
Debug.JustUpdateDeviceLine();
if (true) return _frm;
 BA.debugLineNum = 2842;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh(RemoteObject __ref,RemoteObject _hid,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("CreateH (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2721);
if (RapidSub.canDelegate("createh")) { return __ref.runUserSub(false, "vuehtml","createh", __ref, _hid, _size);}
RemoteObject _hkey = RemoteObject.createImmutable("");
RemoteObject _h = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("hid", _hid);
Debug.locals.put("size", _size);
 BA.debugLineNum = 2721;BA.debugLine="Sub CreateH(hid As String, size As Int) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2722;BA.debugLine="Dim hkey As String = \"h\" & CStr(size)";
Debug.JustUpdateDeviceLine();
_hkey = RemoteObject.concat(RemoteObject.createImmutable("h"),__ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_size))));Debug.locals.put("hkey", _hkey);Debug.locals.put("hkey", _hkey);
 BA.debugLineNum = 2723;BA.debugLine="Dim h As VueHTML";
Debug.JustUpdateDeviceLine();
_h = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("h", _h);
 BA.debugLineNum = 2724;BA.debugLine="h.Initialize(hid, hkey)";
Debug.JustUpdateDeviceLine();
_h.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_hid),(Object)(_hkey));
 BA.debugLineNum = 2725;BA.debugLine="Return h";
Debug.JustUpdateDeviceLine();
if (true) return _h;
 BA.debugLineNum = 2726;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh1(RemoteObject __ref,RemoteObject _hid) throws Exception{
try {
		Debug.PushSubsStack("CreateH1 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2730);
if (RapidSub.canDelegate("createh1")) { return __ref.runUserSub(false, "vuehtml","createh1", __ref, _hid);}
RemoteObject _hdr = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("hid", _hid);
 BA.debugLineNum = 2730;BA.debugLine="Sub CreateH1(hid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2731;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,1)";
Debug.JustUpdateDeviceLine();
_hdr = __ref.runClassMethod (b4j.example.vuehtml.class, "_createh" /*RemoteObject*/ ,(Object)(_hid),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("hdr", _hdr);Debug.locals.put("hdr", _hdr);
 BA.debugLineNum = 2732;BA.debugLine="Return hdr";
Debug.JustUpdateDeviceLine();
if (true) return _hdr;
 BA.debugLineNum = 2733;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh2(RemoteObject __ref,RemoteObject _hid) throws Exception{
try {
		Debug.PushSubsStack("CreateH2 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2736);
if (RapidSub.canDelegate("createh2")) { return __ref.runUserSub(false, "vuehtml","createh2", __ref, _hid);}
RemoteObject _hdr = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("hid", _hid);
 BA.debugLineNum = 2736;BA.debugLine="Sub CreateH2(hid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2737;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,2)";
Debug.JustUpdateDeviceLine();
_hdr = __ref.runClassMethod (b4j.example.vuehtml.class, "_createh" /*RemoteObject*/ ,(Object)(_hid),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("hdr", _hdr);Debug.locals.put("hdr", _hdr);
 BA.debugLineNum = 2738;BA.debugLine="Return hdr";
Debug.JustUpdateDeviceLine();
if (true) return _hdr;
 BA.debugLineNum = 2739;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh3(RemoteObject __ref,RemoteObject _hid) throws Exception{
try {
		Debug.PushSubsStack("CreateH3 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2742);
if (RapidSub.canDelegate("createh3")) { return __ref.runUserSub(false, "vuehtml","createh3", __ref, _hid);}
RemoteObject _hdr = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("hid", _hid);
 BA.debugLineNum = 2742;BA.debugLine="Sub CreateH3(hid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2743;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,3)";
Debug.JustUpdateDeviceLine();
_hdr = __ref.runClassMethod (b4j.example.vuehtml.class, "_createh" /*RemoteObject*/ ,(Object)(_hid),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("hdr", _hdr);Debug.locals.put("hdr", _hdr);
 BA.debugLineNum = 2744;BA.debugLine="Return hdr";
Debug.JustUpdateDeviceLine();
if (true) return _hdr;
 BA.debugLineNum = 2745;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh4(RemoteObject __ref,RemoteObject _hid) throws Exception{
try {
		Debug.PushSubsStack("CreateH4 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2748);
if (RapidSub.canDelegate("createh4")) { return __ref.runUserSub(false, "vuehtml","createh4", __ref, _hid);}
RemoteObject _hdr = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("hid", _hid);
 BA.debugLineNum = 2748;BA.debugLine="Sub CreateH4(hid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2749;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,4)";
Debug.JustUpdateDeviceLine();
_hdr = __ref.runClassMethod (b4j.example.vuehtml.class, "_createh" /*RemoteObject*/ ,(Object)(_hid),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("hdr", _hdr);Debug.locals.put("hdr", _hdr);
 BA.debugLineNum = 2750;BA.debugLine="Return hdr";
Debug.JustUpdateDeviceLine();
if (true) return _hdr;
 BA.debugLineNum = 2751;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh5(RemoteObject __ref,RemoteObject _hid) throws Exception{
try {
		Debug.PushSubsStack("CreateH5 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2754);
if (RapidSub.canDelegate("createh5")) { return __ref.runUserSub(false, "vuehtml","createh5", __ref, _hid);}
RemoteObject _hdr = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("hid", _hid);
 BA.debugLineNum = 2754;BA.debugLine="Sub CreateH5(hid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2755;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,5)";
Debug.JustUpdateDeviceLine();
_hdr = __ref.runClassMethod (b4j.example.vuehtml.class, "_createh" /*RemoteObject*/ ,(Object)(_hid),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("hdr", _hdr);Debug.locals.put("hdr", _hdr);
 BA.debugLineNum = 2756;BA.debugLine="Return hdr";
Debug.JustUpdateDeviceLine();
if (true) return _hdr;
 BA.debugLineNum = 2757;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh6(RemoteObject __ref,RemoteObject _hid) throws Exception{
try {
		Debug.PushSubsStack("CreateH6 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2760);
if (RapidSub.canDelegate("createh6")) { return __ref.runUserSub(false, "vuehtml","createh6", __ref, _hid);}
RemoteObject _hdr = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("hid", _hid);
 BA.debugLineNum = 2760;BA.debugLine="Sub CreateH6(hid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2761;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,6)";
Debug.JustUpdateDeviceLine();
_hdr = __ref.runClassMethod (b4j.example.vuehtml.class, "_createh" /*RemoteObject*/ ,(Object)(_hid),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("hdr", _hdr);Debug.locals.put("hdr", _hdr);
 BA.debugLineNum = 2762;BA.debugLine="Return hdr";
Debug.JustUpdateDeviceLine();
if (true) return _hdr;
 BA.debugLineNum = 2763;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createheader(RemoteObject __ref,RemoteObject _hid) throws Exception{
try {
		Debug.PushSubsStack("CreateHeader (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2573);
if (RapidSub.canDelegate("createheader")) { return __ref.runUserSub(false, "vuehtml","createheader", __ref, _hid);}
RemoteObject _h = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("hid", _hid);
 BA.debugLineNum = 2573;BA.debugLine="Sub CreateHeader(hid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2574;BA.debugLine="Dim h As VueHTML";
Debug.JustUpdateDeviceLine();
_h = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("h", _h);
 BA.debugLineNum = 2575;BA.debugLine="h.Initialize(hid, \"header\")";
Debug.JustUpdateDeviceLine();
_h.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_hid),(Object)(RemoteObject.createImmutable("header")));
 BA.debugLineNum = 2576;BA.debugLine="Return h";
Debug.JustUpdateDeviceLine();
if (true) return _h;
 BA.debugLineNum = 2577;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createhr(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("CreateHR (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2767);
if (RapidSub.canDelegate("createhr")) { return __ref.runUserSub(false, "vuehtml","createhr", __ref, _b);}
RemoteObject _hr = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("b", _b);
 BA.debugLineNum = 2767;BA.debugLine="Sub CreateHR(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2768;BA.debugLine="Dim hr As VueHTML";
Debug.JustUpdateDeviceLine();
_hr = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("hr", _hr);
 BA.debugLineNum = 2769;BA.debugLine="hr.Initialize(\"\",\"hr\")";
Debug.JustUpdateDeviceLine();
_hr.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("hr")));
 BA.debugLineNum = 2770;BA.debugLine="Return hr";
Debug.JustUpdateDeviceLine();
if (true) return _hr;
 BA.debugLineNum = 2771;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createiframe(RemoteObject __ref,RemoteObject _ifid) throws Exception{
try {
		Debug.PushSubsStack("CreateIFrame (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3134);
if (RapidSub.canDelegate("createiframe")) { return __ref.runUserSub(false, "vuehtml","createiframe", __ref, _ifid);}
RemoteObject _i = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("ifid", _ifid);
 BA.debugLineNum = 3134;BA.debugLine="Sub CreateIFrame(ifid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3135;BA.debugLine="Dim i As VueHTML";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("i", _i);
 BA.debugLineNum = 3136;BA.debugLine="i.Initialize(ifid, \"iframe\")";
Debug.JustUpdateDeviceLine();
_i.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_ifid),(Object)(RemoteObject.createImmutable("iframe")));
 BA.debugLineNum = 3137;BA.debugLine="Return i";
Debug.JustUpdateDeviceLine();
if (true) return _i;
 BA.debugLineNum = 3138;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimg(RemoteObject __ref,RemoteObject _imgid) throws Exception{
try {
		Debug.PushSubsStack("CreateIMG (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2699);
if (RapidSub.canDelegate("createimg")) { return __ref.runUserSub(false, "vuehtml","createimg", __ref, _imgid);}
RemoteObject _img = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("imgid", _imgid);
 BA.debugLineNum = 2699;BA.debugLine="Sub CreateIMG(imgid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2700;BA.debugLine="Dim img As VueHTML";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("img", _img);
 BA.debugLineNum = 2701;BA.debugLine="img.Initialize(imgid, \"img\")";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgid),(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 2702;BA.debugLine="Return img";
Debug.JustUpdateDeviceLine();
if (true) return _img;
 BA.debugLineNum = 2703;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinput(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInput (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2969);
if (RapidSub.canDelegate("createinput")) { return __ref.runUserSub(false, "vuehtml","createinput", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 2969;BA.debugLine="Sub CreateInput(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2970;BA.debugLine="tid = tid.tolowercase";
Debug.JustUpdateDeviceLine();
_tid = _tid.runMethod(true,"toLowerCase");Debug.locals.put("tid", _tid);
 BA.debugLineNum = 2971;BA.debugLine="Dim input As VueHTML";
Debug.JustUpdateDeviceLine();
_input = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("input", _input);
 BA.debugLineNum = 2972;BA.debugLine="input.Initialize(tid, \"input\")";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tid),(Object)(RemoteObject.createImmutable("input")));
 BA.debugLineNum = 2973;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 2974;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputbutton(RemoteObject __ref,RemoteObject _tid,RemoteObject _tvalue) throws Exception{
try {
		Debug.PushSubsStack("CreateInputButton (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3041);
if (RapidSub.canDelegate("createinputbutton")) { return __ref.runUserSub(false, "vuehtml","createinputbutton", __ref, _tid, _tvalue);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
Debug.locals.put("tValue", _tvalue);
 BA.debugLineNum = 3041;BA.debugLine="Sub CreateInputButton(tid As String, tValue As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3042;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("button"))).runClassMethod (b4j.example.vuehtml.class, "_setattrvalue" /*RemoteObject*/ ,(Object)(_tvalue));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3043;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3044;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputcheckbox(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputCheckBox (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3090);
if (RapidSub.canDelegate("createinputcheckbox")) { return __ref.runUserSub(false, "vuehtml","createinputcheckbox", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3090;BA.debugLine="Sub CreateInputCheckBox(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3091;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("checkbox"))).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("tabindex")),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3092;BA.debugLine="input.AddAttribute(\"autocomplete\", \"off\")";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("autocomplete")),(Object)((RemoteObject.createImmutable("off"))));
 BA.debugLineNum = 3093;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3094;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputcolor(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3071);
if (RapidSub.canDelegate("createinputcolor")) { return __ref.runUserSub(false, "vuehtml","createinputcolor", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3071;BA.debugLine="Sub CreateInputColor(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3072;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("color")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3073;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3074;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputdate(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputDate (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3065);
if (RapidSub.canDelegate("createinputdate")) { return __ref.runUserSub(false, "vuehtml","createinputdate", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3065;BA.debugLine="Sub CreateInputDate(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3066;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("date")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3067;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3068;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputemail(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputEmail (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3078);
if (RapidSub.canDelegate("createinputemail")) { return __ref.runUserSub(false, "vuehtml","createinputemail", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3078;BA.debugLine="Sub CreateInputEmail(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3079;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("email")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3080;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3081;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputfile(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputFile (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3059);
if (RapidSub.canDelegate("createinputfile")) { return __ref.runUserSub(false, "vuehtml","createinputfile", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3059;BA.debugLine="Sub CreateInputFile(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3060;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("file")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3061;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3062;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputnumber(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputNumber (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3128);
if (RapidSub.canDelegate("createinputnumber")) { return __ref.runUserSub(false, "vuehtml","createinputnumber", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3128;BA.debugLine="Sub CreateInputNumber(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3129;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("number")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3130;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputpassword(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputPassword (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3084);
if (RapidSub.canDelegate("createinputpassword")) { return __ref.runUserSub(false, "vuehtml","createinputpassword", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3084;BA.debugLine="Sub CreateInputPassword(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3085;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("password")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3086;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3087;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputradio(RemoteObject __ref,RemoteObject _tid,RemoteObject _tname) throws Exception{
try {
		Debug.PushSubsStack("CreateInputRadio (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3108);
if (RapidSub.canDelegate("createinputradio")) { return __ref.runUserSub(false, "vuehtml","createinputradio", __ref, _tid, _tname);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
Debug.locals.put("tname", _tname);
 BA.debugLineNum = 3108;BA.debugLine="Sub CreateInputRadio(tid As String, tname As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3109;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("radio"))).runClassMethod (b4j.example.vuehtml.class, "_setattrtabindex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("0"))).runClassMethod (b4j.example.vuehtml.class, "_setattrname" /*RemoteObject*/ ,(Object)(_tname));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3110;BA.debugLine="input.SetAttrautocomplete(\"off\")";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vuehtml.class, "_setattrautocomplete" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.createImmutable("off"))));
 BA.debugLineNum = 3111;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputrange(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputRange (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2528);
if (RapidSub.canDelegate("createinputrange")) { return __ref.runUserSub(false, "vuehtml","createinputrange", __ref, _sid);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2528;BA.debugLine="Sub CreateInputRange(sid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2529;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 2530;BA.debugLine="s.Initialize(sid, \"input\").SetAttrTYPE(\"range\")";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sid),(Object)(RemoteObject.createImmutable("input"))).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("range")));
 BA.debugLineNum = 2531;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 2532;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputreset(RemoteObject __ref,RemoteObject _tid,RemoteObject _tvalue) throws Exception{
try {
		Debug.PushSubsStack("CreateInputReset (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3047);
if (RapidSub.canDelegate("createinputreset")) { return __ref.runUserSub(false, "vuehtml","createinputreset", __ref, _tid, _tvalue);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
Debug.locals.put("tValue", _tvalue);
 BA.debugLineNum = 3047;BA.debugLine="Sub CreateInputReset(tid As String, tValue As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3048;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("reset"))).runClassMethod (b4j.example.vuehtml.class, "_setattrvalue" /*RemoteObject*/ ,(Object)(_tvalue));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3049;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3050;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputsearch(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputSearch (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2521);
if (RapidSub.canDelegate("createinputsearch")) { return __ref.runUserSub(false, "vuehtml","createinputsearch", __ref, _sid);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2521;BA.debugLine="Sub CreateInputSearch(sid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2522;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 2523;BA.debugLine="s.Initialize(sid, \"input\").SetAttrTYPE(\"search\")";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sid),(Object)(RemoteObject.createImmutable("input"))).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("search")));
 BA.debugLineNum = 2524;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 2525;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputsubmit(RemoteObject __ref,RemoteObject _tid,RemoteObject _tvalue) throws Exception{
try {
		Debug.PushSubsStack("CreateInputSubmit (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3053);
if (RapidSub.canDelegate("createinputsubmit")) { return __ref.runUserSub(false, "vuehtml","createinputsubmit", __ref, _tid, _tvalue);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
Debug.locals.put("tValue", _tvalue);
 BA.debugLineNum = 3053;BA.debugLine="Sub CreateInputSubmit(tid As String, tValue As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3054;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("submit"))).runClassMethod (b4j.example.vuehtml.class, "_setattrvalue" /*RemoteObject*/ ,(Object)(_tvalue));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3055;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3056;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputtel(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputTel (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3115);
if (RapidSub.canDelegate("createinputtel")) { return __ref.runUserSub(false, "vuehtml","createinputtel", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3115;BA.debugLine="Sub CreateInputTel(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3116;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("tel")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3117;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3118;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputtext(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputText (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3028);
if (RapidSub.canDelegate("createinputtext")) { return __ref.runUserSub(false, "vuehtml","createinputtext", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3028;BA.debugLine="Sub CreateInputText(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3029;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("text")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3030;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3031;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinputurl(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateInputUrl (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3121);
if (RapidSub.canDelegate("createinputurl")) { return __ref.runUserSub(false, "vuehtml","createinputurl", __ref, _tid);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 3121;BA.debugLine="Sub CreateInputUrl(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3122;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vuehtml.class, "_createinput" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("url")));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 3123;BA.debugLine="Return input";
Debug.JustUpdateDeviceLine();
if (true) return _input;
 BA.debugLineNum = 3124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _lid) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2952);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "vuehtml","createlabel", __ref, _lid);}
RemoteObject _lbl = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("lid", _lid);
 BA.debugLineNum = 2952;BA.debugLine="Sub CreateLabel(lid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2953;BA.debugLine="lid = lid.tolowercase";
Debug.JustUpdateDeviceLine();
_lid = _lid.runMethod(true,"toLowerCase");Debug.locals.put("lid", _lid);
 BA.debugLineNum = 2954;BA.debugLine="Dim lbl As VueHTML";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 2955;BA.debugLine="lbl.Initialize(lid, \"label\")";
Debug.JustUpdateDeviceLine();
_lbl.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_lid),(Object)(RemoteObject.createImmutable("label")));
 BA.debugLineNum = 2956;BA.debugLine="Return lbl";
Debug.JustUpdateDeviceLine();
if (true) return _lbl;
 BA.debugLineNum = 2957;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlegend(RemoteObject __ref,RemoteObject _fid,RemoteObject _scaption) throws Exception{
try {
		Debug.PushSubsStack("CreateLegend (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2845);
if (RapidSub.canDelegate("createlegend")) { return __ref.runUserSub(false, "vuehtml","createlegend", __ref, _fid, _scaption);}
RemoteObject _fs = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("fID", _fid);
Debug.locals.put("sCaption", _scaption);
 BA.debugLineNum = 2845;BA.debugLine="Sub CreateLegend(fID As String, sCaption As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2846;BA.debugLine="Dim fs As VueHTML";
Debug.JustUpdateDeviceLine();
_fs = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("fs", _fs);
 BA.debugLineNum = 2847;BA.debugLine="fs.Initialize(fID, \"legend\").AddContent(sCaption)";
Debug.JustUpdateDeviceLine();
_fs.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_fid),(Object)(RemoteObject.createImmutable("legend"))).runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_scaption));
 BA.debugLineNum = 2848;BA.debugLine="Return fs";
Debug.JustUpdateDeviceLine();
if (true) return _fs;
 BA.debugLineNum = 2849;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createli(RemoteObject __ref,RemoteObject _liid) throws Exception{
try {
		Debug.PushSubsStack("CreateLI (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2692);
if (RapidSub.canDelegate("createli")) { return __ref.runUserSub(false, "vuehtml","createli", __ref, _liid);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("liid", _liid);
 BA.debugLineNum = 2692;BA.debugLine="Sub CreateLI(liid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2693;BA.debugLine="Dim li As VueHTML";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("li", _li);
 BA.debugLineNum = 2694;BA.debugLine="li.Initialize(liid, \"li\")";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_liid),(Object)(RemoteObject.createImmutable("li")));
 BA.debugLineNum = 2695;BA.debugLine="Return li";
Debug.JustUpdateDeviceLine();
if (true) return _li;
 BA.debugLineNum = 2696;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createmain(RemoteObject __ref,RemoteObject _mainid) throws Exception{
try {
		Debug.PushSubsStack("CreateMain (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2536);
if (RapidSub.canDelegate("createmain")) { return __ref.runUserSub(false, "vuehtml","createmain", __ref, _mainid);}
RemoteObject _m = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("mainid", _mainid);
 BA.debugLineNum = 2536;BA.debugLine="Sub CreateMain(mainid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2537;BA.debugLine="Dim m As VueHTML";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("m", _m);
 BA.debugLineNum = 2538;BA.debugLine="m.Initialize(mainid, \"main\")";
Debug.JustUpdateDeviceLine();
_m.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_mainid),(Object)(RemoteObject.createImmutable("main")));
 BA.debugLineNum = 2539;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 2540;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createmark(RemoteObject __ref,RemoteObject _preid) throws Exception{
try {
		Debug.PushSubsStack("CreateMARK (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2613);
if (RapidSub.canDelegate("createmark")) { return __ref.runUserSub(false, "vuehtml","createmark", __ref, _preid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("preid", _preid);
 BA.debugLineNum = 2613;BA.debugLine="Sub CreateMARK(preid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2614;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2615;BA.debugLine="ul.Initialize(preid, \"mark\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_preid),(Object)(RemoteObject.createImmutable("mark")));
 BA.debugLineNum = 2616;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2617;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnav(RemoteObject __ref,RemoteObject _nid) throws Exception{
try {
		Debug.PushSubsStack("CreateNav (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2559);
if (RapidSub.canDelegate("createnav")) { return __ref.runUserSub(false, "vuehtml","createnav", __ref, _nid);}
RemoteObject _n = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("nid", _nid);
 BA.debugLineNum = 2559;BA.debugLine="Sub CreateNav(nid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2560;BA.debugLine="Dim n As VueHTML";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("n", _n);
 BA.debugLineNum = 2561;BA.debugLine="n.Initialize(nid, \"nav\")";
Debug.JustUpdateDeviceLine();
_n.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_nid),(Object)(RemoteObject.createImmutable("nav")));
 BA.debugLineNum = 2562;BA.debugLine="Return n";
Debug.JustUpdateDeviceLine();
if (true) return _n;
 BA.debugLineNum = 2563;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createol(RemoteObject __ref,RemoteObject _preid) throws Exception{
try {
		Debug.PushSubsStack("CreateOL (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2645);
if (RapidSub.canDelegate("createol")) { return __ref.runUserSub(false, "vuehtml","createol", __ref, _preid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("preid", _preid);
 BA.debugLineNum = 2645;BA.debugLine="Sub CreateOL(preid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2646;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2647;BA.debugLine="ul.Initialize(preid, \"ol\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_preid),(Object)(RemoteObject.createImmutable("ol")));
 BA.debugLineNum = 2648;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2649;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createol1(RemoteObject __ref,RemoteObject _ulid,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("CreateOL1 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2659);
if (RapidSub.canDelegate("createol1")) { return __ref.runUserSub(false, "vuehtml","createol1", __ref, _ulid, _items);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _optid = RemoteObject.createImmutable("");
RemoteObject _optval = RemoteObject.createImmutable("");
RemoteObject _thisoption = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("ulid", _ulid);
Debug.locals.put("items", _items);
 BA.debugLineNum = 2659;BA.debugLine="Sub CreateOL1(ulid As String, items As List) As Vu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2660;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2661;BA.debugLine="ul.Initialize(ulid, \"ol\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_ulid),(Object)(RemoteObject.createImmutable("ol")));
 BA.debugLineNum = 2662;BA.debugLine="For Each opt As Map In items";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group3 = _items;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt.setObject(group3.runMethod(false,"Get",index3));
Debug.locals.put("opt", _opt);
 BA.debugLineNum = 2663;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
Debug.JustUpdateDeviceLine();
_optid = BA.ObjectToString(_opt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("optid", _optid);Debug.locals.put("optid", _optid);
 BA.debugLineNum = 2664;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
Debug.JustUpdateDeviceLine();
_optval = BA.ObjectToString(_opt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("optval", _optval);Debug.locals.put("optval", _optval);
 BA.debugLineNum = 2665;BA.debugLine="Dim thisoption As VueHTML = CreateLI(\"\")";
Debug.JustUpdateDeviceLine();
_thisoption = __ref.runClassMethod (b4j.example.vuehtml.class, "_createli" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("thisoption", _thisoption);Debug.locals.put("thisoption", _thisoption);
 BA.debugLineNum = 2666;BA.debugLine="optid = CStr(optid)";
Debug.JustUpdateDeviceLine();
_optid = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_optid)));Debug.locals.put("optid", _optid);
 BA.debugLineNum = 2667;BA.debugLine="optval = CStr(optval)";
Debug.JustUpdateDeviceLine();
_optval = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_optval)));Debug.locals.put("optval", _optval);
 BA.debugLineNum = 2668;BA.debugLine="thisoption.SetText(optval)";
Debug.JustUpdateDeviceLine();
_thisoption.runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_optval));
 BA.debugLineNum = 2669;BA.debugLine="thisoption.SetAttrVALUE(optid)";
Debug.JustUpdateDeviceLine();
_thisoption.runClassMethod (b4j.example.vuehtml.class, "_setattrvalue" /*RemoteObject*/ ,(Object)(_optid));
 BA.debugLineNum = 2670;BA.debugLine="ul.AddElement(thisoption)";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_thisoption));
 }
}Debug.locals.put("opt", _opt);
;
 BA.debugLineNum = 2672;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2673;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createoptgroup(RemoteObject __ref,RemoteObject _oid) throws Exception{
try {
		Debug.PushSubsStack("CreateOptGroup (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2992);
if (RapidSub.canDelegate("createoptgroup")) { return __ref.runUserSub(false, "vuehtml","createoptgroup", __ref, _oid);}
RemoteObject _o = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("oid", _oid);
 BA.debugLineNum = 2992;BA.debugLine="Sub CreateOptGroup(oid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2993;BA.debugLine="Dim o As VueHTML";
Debug.JustUpdateDeviceLine();
_o = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("o", _o);
 BA.debugLineNum = 2994;BA.debugLine="o.Initialize(oid, \"optgroup\")";
Debug.JustUpdateDeviceLine();
_o.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_oid),(Object)(RemoteObject.createImmutable("optgroup")));
 BA.debugLineNum = 2995;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return _o;
 BA.debugLineNum = 2996;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createoption(RemoteObject __ref,RemoteObject _oid) throws Exception{
try {
		Debug.PushSubsStack("CreateOption (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2984);
if (RapidSub.canDelegate("createoption")) { return __ref.runUserSub(false, "vuehtml","createoption", __ref, _oid);}
RemoteObject _o = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("oid", _oid);
 BA.debugLineNum = 2984;BA.debugLine="Sub CreateOption(oid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2985;BA.debugLine="Dim o As VueHTML";
Debug.JustUpdateDeviceLine();
_o = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("o", _o);
 BA.debugLineNum = 2986;BA.debugLine="o.Initialize(oid, \"option\")";
Debug.JustUpdateDeviceLine();
_o.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_oid),(Object)(RemoteObject.createImmutable("option")));
 BA.debugLineNum = 2987;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return _o;
 BA.debugLineNum = 2988;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createparagraph(RemoteObject __ref,RemoteObject _pid) throws Exception{
try {
		Debug.PushSubsStack("CreateParagraph (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2831);
if (RapidSub.canDelegate("createparagraph")) { return __ref.runUserSub(false, "vuehtml","createparagraph", __ref, _pid);}
RemoteObject _p = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("pid", _pid);
 BA.debugLineNum = 2831;BA.debugLine="Sub CreateParagraph(pid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2832;BA.debugLine="Dim p As VueHTML";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("p", _p);
 BA.debugLineNum = 2833;BA.debugLine="p.Initialize(pid, \"p\")";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_pid),(Object)(RemoteObject.createImmutable("p")));
 BA.debugLineNum = 2834;BA.debugLine="Return p";
Debug.JustUpdateDeviceLine();
if (true) return _p;
 BA.debugLineNum = 2835;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpre(RemoteObject __ref,RemoteObject _preid) throws Exception{
try {
		Debug.PushSubsStack("CreatePRE (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2607);
if (RapidSub.canDelegate("createpre")) { return __ref.runUserSub(false, "vuehtml","createpre", __ref, _preid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("preid", _preid);
 BA.debugLineNum = 2607;BA.debugLine="Sub CreatePRE(preid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2608;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2609;BA.debugLine="ul.Initialize(preid, \"pre\").AddClass(\"code-line\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_preid),(Object)(RemoteObject.createImmutable("pre"))).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("code-line")));
 BA.debugLineNum = 2610;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2611;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createprogressbar(RemoteObject __ref,RemoteObject _pbid) throws Exception{
try {
		Debug.PushSubsStack("CreateProgressBar (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2544);
if (RapidSub.canDelegate("createprogressbar")) { return __ref.runUserSub(false, "vuehtml","createprogressbar", __ref, _pbid);}
RemoteObject _pb = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("pbid", _pbid);
 BA.debugLineNum = 2544;BA.debugLine="Sub CreateProgressBar(pbid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2545;BA.debugLine="Dim pb As VueHTML";
Debug.JustUpdateDeviceLine();
_pb = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("pb", _pb);
 BA.debugLineNum = 2546;BA.debugLine="pb.Initialize(pbid, \"progress\")";
Debug.JustUpdateDeviceLine();
_pb.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_pbid),(Object)(RemoteObject.createImmutable("progress")));
 BA.debugLineNum = 2547;BA.debugLine="Return pb";
Debug.JustUpdateDeviceLine();
if (true) return _pb;
 BA.debugLineNum = 2548;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsection(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSection (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2580);
if (RapidSub.canDelegate("createsection")) { return __ref.runUserSub(false, "vuehtml","createsection", __ref, _sid);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2580;BA.debugLine="Sub CreateSection(sid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2581;BA.debugLine="Dim s As VueHTML = CreateDIV(sid)";
Debug.JustUpdateDeviceLine();
_s = __ref.runClassMethod (b4j.example.vuehtml.class, "_creatediv" /*RemoteObject*/ ,(Object)(_sid));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 2582;BA.debugLine="s.AddClass(\"section\")";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("section")));
 BA.debugLineNum = 2583;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 2584;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createselect(RemoteObject __ref,RemoteObject _oid) throws Exception{
try {
		Debug.PushSubsStack("CreateSelect (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3000);
if (RapidSub.canDelegate("createselect")) { return __ref.runUserSub(false, "vuehtml","createselect", __ref, _oid);}
RemoteObject _o = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("oid", _oid);
 BA.debugLineNum = 3000;BA.debugLine="Sub CreateSelect(oid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3001;BA.debugLine="Dim o As VueHTML";
Debug.JustUpdateDeviceLine();
_o = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("o", _o);
 BA.debugLineNum = 3002;BA.debugLine="o.Initialize(oid, \"select\")";
Debug.JustUpdateDeviceLine();
_o.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_oid),(Object)(RemoteObject.createImmutable("select")));
 BA.debugLineNum = 3003;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return _o;
 BA.debugLineNum = 3004;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createselect1(RemoteObject __ref,RemoteObject _tid,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("CreateSelect1 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3014);
if (RapidSub.canDelegate("createselect1")) { return __ref.runUserSub(false, "vuehtml","createselect1", __ref, _tid, _options);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.vuehtml");
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _optid = RemoteObject.createImmutable("");
RemoteObject _optval = RemoteObject.createImmutable("");
RemoteObject _thisoption = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
Debug.locals.put("options", _options);
 BA.debugLineNum = 3014;BA.debugLine="Sub CreateSelect1(tid As String, options As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3015;BA.debugLine="Dim ta As VueHTML";
Debug.JustUpdateDeviceLine();
_ta = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ta", _ta);
 BA.debugLineNum = 3016;BA.debugLine="ta.Initialize(tid, \"select\")";
Debug.JustUpdateDeviceLine();
_ta.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tid),(Object)(RemoteObject.createImmutable("select")));
 BA.debugLineNum = 3017;BA.debugLine="For Each opt As Map In options";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group3 = _options;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt.setObject(group3.runMethod(false,"Get",index3));
Debug.locals.put("opt", _opt);
 BA.debugLineNum = 3018;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
Debug.JustUpdateDeviceLine();
_optid = BA.ObjectToString(_opt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("optid", _optid);Debug.locals.put("optid", _optid);
 BA.debugLineNum = 3019;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
Debug.JustUpdateDeviceLine();
_optval = BA.ObjectToString(_opt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("optval", _optval);Debug.locals.put("optval", _optval);
 BA.debugLineNum = 3020;BA.debugLine="Dim thisoption As VueHTML = CreateOption(\"\").Set";
Debug.JustUpdateDeviceLine();
_thisoption = __ref.runClassMethod (b4j.example.vuehtml.class, "_createoption" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_optval));Debug.locals.put("thisoption", _thisoption);Debug.locals.put("thisoption", _thisoption);
 BA.debugLineNum = 3021;BA.debugLine="thisoption.SetParentID(tid).SetAttrVALUE(optid)";
Debug.JustUpdateDeviceLine();
_thisoption.runClassMethod (b4j.example.vuehtml.class, "_setparentid" /*RemoteObject*/ ,(Object)(_tid)).runClassMethod (b4j.example.vuehtml.class, "_setattrvalue" /*RemoteObject*/ ,(Object)(_optid));
 BA.debugLineNum = 3022;BA.debugLine="ta.AddElement(thisoption)";
Debug.JustUpdateDeviceLine();
_ta.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_thisoption));
 }
}Debug.locals.put("opt", _opt);
;
 BA.debugLineNum = 3024;BA.debugLine="Return ta";
Debug.JustUpdateDeviceLine();
if (true) return _ta;
 BA.debugLineNum = 3025;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsmall(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSmall (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2795);
if (RapidSub.canDelegate("createsmall")) { return __ref.runUserSub(false, "vuehtml","createsmall", __ref, _sid);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2795;BA.debugLine="Sub CreateSmall(sid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2796;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 2797;BA.debugLine="s.Initialize(sid,\"small\")";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sid),(Object)(RemoteObject.createImmutable("small")));
 BA.debugLineNum = 2798;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 2799;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsource(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateSOURCE (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2902);
if (RapidSub.canDelegate("createsource")) { return __ref.runUserSub(false, "vuehtml","createsource", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2902;BA.debugLine="Sub CreateSOURCE(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2903;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2904;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2905;BA.debugLine="div.Initialize(cid, \"source\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("source")));
 BA.debugLineNum = 2906;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2907;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createspan(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSpan (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2802);
if (RapidSub.canDelegate("createspan")) { return __ref.runUserSub(false, "vuehtml","createspan", __ref, _sid);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2802;BA.debugLine="Sub CreateSpan(sid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2803;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 2804;BA.debugLine="s.Initialize(sid,\"span\")";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sid),(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 2805;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 2806;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstrong(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateStrong (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2780);
if (RapidSub.canDelegate("createstrong")) { return __ref.runUserSub(false, "vuehtml","createstrong", __ref, _sid);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2780;BA.debugLine="Sub CreateStrong(sid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2781;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 2782;BA.debugLine="s.Initialize(sid, \"strong\")";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sid),(Object)(RemoteObject.createImmutable("strong")));
 BA.debugLineNum = 2783;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 2784;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsub(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSub (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2774);
if (RapidSub.canDelegate("createsub")) { return __ref.runUserSub(false, "vuehtml","createsub", __ref, _sid);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2774;BA.debugLine="Sub CreateSub(sid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2775;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 2776;BA.debugLine="s.Initialize(sid, \"sub\")";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sid),(Object)(RemoteObject.createImmutable("sub")));
 BA.debugLineNum = 2777;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 2778;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateTABLE (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2893);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "vuehtml","createtable", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2893;BA.debugLine="Sub CreateTABLE(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2894;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2895;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2896;BA.debugLine="div.Initialize(cid, \"table\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("table")));
 BA.debugLineNum = 2897;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2898;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtbody(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateTBODY (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2926);
if (RapidSub.canDelegate("createtbody")) { return __ref.runUserSub(false, "vuehtml","createtbody", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2926;BA.debugLine="Sub CreateTBODY(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2927;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2928;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2929;BA.debugLine="div.Initialize(cid, \"tbody\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("tbody")));
 BA.debugLineNum = 2930;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2931;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtd(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateTD (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2943);
if (RapidSub.canDelegate("createtd")) { return __ref.runUserSub(false, "vuehtml","createtd", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2943;BA.debugLine="Sub CreateTD(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2944;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2945;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2946;BA.debugLine="div.Initialize(cid, \"td\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("td")));
 BA.debugLineNum = 2947;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2948;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextarea(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("CreateTextArea (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2977);
if (RapidSub.canDelegate("createtextarea")) { return __ref.runUserSub(false, "vuehtml","createtextarea", __ref, _tid);}
RemoteObject _ta = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 2977;BA.debugLine="Sub CreateTextArea(tid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2978;BA.debugLine="Dim ta As VueHTML";
Debug.JustUpdateDeviceLine();
_ta = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ta", _ta);
 BA.debugLineNum = 2979;BA.debugLine="ta.Initialize(tid, \"textarea\")";
Debug.JustUpdateDeviceLine();
_ta.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tid),(Object)(RemoteObject.createImmutable("textarea")));
 BA.debugLineNum = 2980;BA.debugLine="Return ta";
Debug.JustUpdateDeviceLine();
if (true) return _ta;
 BA.debugLineNum = 2981;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createthead(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateTHEAD (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2918);
if (RapidSub.canDelegate("createthead")) { return __ref.runUserSub(false, "vuehtml","createthead", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2918;BA.debugLine="Sub CreateTHEAD(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2919;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2920;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2921;BA.debugLine="div.Initialize(cid, \"thead\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("thead")));
 BA.debugLineNum = 2922;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2923;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtime(RemoteObject __ref,RemoteObject _preid) throws Exception{
try {
		Debug.PushSubsStack("CreateTIME (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2620);
if (RapidSub.canDelegate("createtime")) { return __ref.runUserSub(false, "vuehtml","createtime", __ref, _preid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("preid", _preid);
 BA.debugLineNum = 2620;BA.debugLine="Sub CreateTIME(preid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2621;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2622;BA.debugLine="ul.Initialize(preid, \"time\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_preid),(Object)(RemoteObject.createImmutable("time")));
 BA.debugLineNum = 2623;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2624;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtr(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateTR (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2911);
if (RapidSub.canDelegate("createtr")) { return __ref.runUserSub(false, "vuehtml","createtr", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2911;BA.debugLine="Sub CreateTR(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2912;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2913;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2914;BA.debugLine="div.Initialize(cid, \"tr\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("tr")));
 BA.debugLineNum = 2915;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2916;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createul(RemoteObject __ref,RemoteObject _preid) throws Exception{
try {
		Debug.PushSubsStack("CreateUL (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2651);
if (RapidSub.canDelegate("createul")) { return __ref.runUserSub(false, "vuehtml","createul", __ref, _preid);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("preid", _preid);
 BA.debugLineNum = 2651;BA.debugLine="Sub CreateUL(preid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2652;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2653;BA.debugLine="ul.Initialize(preid, \"ul\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_preid),(Object)(RemoteObject.createImmutable("ul")));
 BA.debugLineNum = 2654;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2655;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createul1(RemoteObject __ref,RemoteObject _ulid,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("CreateUL1 (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2676);
if (RapidSub.canDelegate("createul1")) { return __ref.runUserSub(false, "vuehtml","createul1", __ref, _ulid, _items);}
RemoteObject _ul = RemoteObject.declareNull("b4j.example.vuehtml");
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _optid = RemoteObject.createImmutable("");
RemoteObject _optval = RemoteObject.createImmutable("");
RemoteObject _thisoption = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("ulid", _ulid);
Debug.locals.put("items", _items);
 BA.debugLineNum = 2676;BA.debugLine="Sub CreateUL1(ulid As String, items As List) As Vu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2677;BA.debugLine="Dim ul As VueHTML";
Debug.JustUpdateDeviceLine();
_ul = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("ul", _ul);
 BA.debugLineNum = 2678;BA.debugLine="ul.Initialize(ulid, \"ul\")";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_ulid),(Object)(RemoteObject.createImmutable("ul")));
 BA.debugLineNum = 2679;BA.debugLine="For Each opt As Map In items";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group3 = _items;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt.setObject(group3.runMethod(false,"Get",index3));
Debug.locals.put("opt", _opt);
 BA.debugLineNum = 2680;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
Debug.JustUpdateDeviceLine();
_optid = BA.ObjectToString(_opt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("optid", _optid);Debug.locals.put("optid", _optid);
 BA.debugLineNum = 2681;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
Debug.JustUpdateDeviceLine();
_optval = BA.ObjectToString(_opt.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("optval", _optval);Debug.locals.put("optval", _optval);
 BA.debugLineNum = 2682;BA.debugLine="optid = CStr(optid)";
Debug.JustUpdateDeviceLine();
_optid = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_optid)));Debug.locals.put("optid", _optid);
 BA.debugLineNum = 2683;BA.debugLine="optval = CStr(optval)";
Debug.JustUpdateDeviceLine();
_optval = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_optval)));Debug.locals.put("optval", _optval);
 BA.debugLineNum = 2684;BA.debugLine="Dim thisoption As VueHTML = CreateLI(optid)";
Debug.JustUpdateDeviceLine();
_thisoption = __ref.runClassMethod (b4j.example.vuehtml.class, "_createli" /*RemoteObject*/ ,(Object)(_optid));Debug.locals.put("thisoption", _thisoption);Debug.locals.put("thisoption", _thisoption);
 BA.debugLineNum = 2685;BA.debugLine="thisoption.SetText(optval)";
Debug.JustUpdateDeviceLine();
_thisoption.runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_optval));
 BA.debugLineNum = 2686;BA.debugLine="ul.AddElement(thisoption)";
Debug.JustUpdateDeviceLine();
_ul.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_thisoption));
 }
}Debug.locals.put("opt", _opt);
;
 BA.debugLineNum = 2688;BA.debugLine="Return ul";
Debug.JustUpdateDeviceLine();
if (true) return _ul;
 BA.debugLineNum = 2689;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createvideo(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("CreateVIDEO (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2885);
if (RapidSub.canDelegate("createvideo")) { return __ref.runUserSub(false, "vuehtml","createvideo", __ref, _cid);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2885;BA.debugLine="Sub CreateVIDEO(cid As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2886;BA.debugLine="cid = cid.tolowercase";
Debug.JustUpdateDeviceLine();
_cid = _cid.runMethod(true,"toLowerCase");Debug.locals.put("cid", _cid);
 BA.debugLineNum = 2887;BA.debugLine="Dim div As VueHTML";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("div", _div);
 BA.debugLineNum = 2888;BA.debugLine="div.Initialize(cid,\"video\")";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cid),(Object)(RemoteObject.createImmutable("video")));
 BA.debugLineNum = 2889;BA.debugLine="Return div";
Debug.JustUpdateDeviceLine();
if (true) return _div;
 BA.debugLineNum = 2890;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cstr(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CStr (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1733);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "vuehtml","cstr", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 1733;BA.debugLine="private Sub CStr(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1734;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_o,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED"))) { 
_o = RemoteObject.createImmutable((""));Debug.locals.put("o", _o);};
 BA.debugLineNum = 1735;BA.debugLine="Return \"\" & o";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
 BA.debugLineNum = 1736;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formattext(RemoteObject __ref,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("FormatText (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2113);
if (RapidSub.canDelegate("formattext")) { return __ref.runUserSub(false, "vuehtml","formattext", __ref, _stext);}
RemoteObject _rm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ktot = RemoteObject.createImmutable(0);
RemoteObject _kcnt = RemoteObject.createImmutable(0);
RemoteObject _strvalue = RemoteObject.createImmutable("");
RemoteObject _strrep = RemoteObject.createImmutable("");
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 2113;BA.debugLine="private Sub FormatText(sText As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2114;BA.debugLine="Dim RM As Map";
Debug.JustUpdateDeviceLine();
_rm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("RM", _rm);
 BA.debugLineNum = 2115;BA.debugLine="RM.Initialize";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Initialize");
 BA.debugLineNum = 2116;BA.debugLine="RM.clear";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Clear");
 BA.debugLineNum = 2117;BA.debugLine="RM.Put(\"{U}\", \"<ins>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{U}"))),(Object)((RemoteObject.createImmutable("<ins>"))));
 BA.debugLineNum = 2118;BA.debugLine="RM.Put(\"{/U}\", \"</ins>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/U}"))),(Object)((RemoteObject.createImmutable("</ins>"))));
 BA.debugLineNum = 2119;BA.debugLine="RM.Put(\"¢\",\"&cent;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("¢"))),(Object)((RemoteObject.createImmutable("&cent;"))));
 BA.debugLineNum = 2120;BA.debugLine="RM.put(\"£\",\"&pound;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("£"))),(Object)((RemoteObject.createImmutable("&pound;"))));
 BA.debugLineNum = 2121;BA.debugLine="RM.Put(\"{SUP}\", \"<sup>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{SUP}"))),(Object)((RemoteObject.createImmutable("<sup>"))));
 BA.debugLineNum = 2122;BA.debugLine="RM.Put(\"{/SUP}\", \"</sup>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/SUP}"))),(Object)((RemoteObject.createImmutable("</sup>"))));
 BA.debugLineNum = 2123;BA.debugLine="RM.Put(\"¥\",\"&yen;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("¥"))),(Object)((RemoteObject.createImmutable("&yen;"))));
 BA.debugLineNum = 2124;BA.debugLine="RM.Put(\"€\",\"&euro;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("€"))),(Object)((RemoteObject.createImmutable("&euro;"))));
 BA.debugLineNum = 2125;BA.debugLine="RM.put(\"©\",\"&copy;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("©"))),(Object)((RemoteObject.createImmutable("&copy;"))));
 BA.debugLineNum = 2126;BA.debugLine="RM.Put(\"®\",\"&reg;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("®"))),(Object)((RemoteObject.createImmutable("&reg;"))));
 BA.debugLineNum = 2127;BA.debugLine="RM.Put(\"{POUND}\",\"&pound;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{POUND}"))),(Object)((RemoteObject.createImmutable("&pound;"))));
 BA.debugLineNum = 2128;BA.debugLine="RM.Put(\"{/B}\", \"</b>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/B}"))),(Object)((RemoteObject.createImmutable("</b>"))));
 BA.debugLineNum = 2129;BA.debugLine="RM.Put(\"{I}\", \"<i>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{I}"))),(Object)((RemoteObject.createImmutable("<i>"))));
 BA.debugLineNum = 2130;BA.debugLine="RM.Put(\"{YEN}\",\"&yen;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{YEN}"))),(Object)((RemoteObject.createImmutable("&yen;"))));
 BA.debugLineNum = 2131;BA.debugLine="RM.Put(\"{EURO}\",\"&euro;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{EURO}"))),(Object)((RemoteObject.createImmutable("&euro;"))));
 BA.debugLineNum = 2132;BA.debugLine="RM.Put(\"{CODE}\",\"<code>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{CODE}"))),(Object)((RemoteObject.createImmutable("<code>"))));
 BA.debugLineNum = 2133;BA.debugLine="RM.Put(\"{/CODE}\",\"</code>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/CODE}"))),(Object)((RemoteObject.createImmutable("</code>"))));
 BA.debugLineNum = 2134;BA.debugLine="RM.put(\"{COPYRIGHT}\",\"&copy;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{COPYRIGHT}"))),(Object)((RemoteObject.createImmutable("&copy;"))));
 BA.debugLineNum = 2135;BA.debugLine="RM.Put(\"{REGISTERED}\",\"&reg;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{REGISTERED}"))),(Object)((RemoteObject.createImmutable("&reg;"))));
 BA.debugLineNum = 2136;BA.debugLine="RM.Put(\"®\", \"&reg;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("®"))),(Object)((RemoteObject.createImmutable("&reg;"))));
 BA.debugLineNum = 2137;BA.debugLine="RM.Put(\"{B}\", \"<b>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{B}"))),(Object)((RemoteObject.createImmutable("<b>"))));
 BA.debugLineNum = 2138;BA.debugLine="RM.Put(\"{SMALL}\", \"<small>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{SMALL}"))),(Object)((RemoteObject.createImmutable("<small>"))));
 BA.debugLineNum = 2139;BA.debugLine="RM.Put(\"{/SMALL}\", \"</small>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/SMALL}"))),(Object)((RemoteObject.createImmutable("</small>"))));
 BA.debugLineNum = 2140;BA.debugLine="RM.Put(\"{EM}\", \"<em>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{EM}"))),(Object)((RemoteObject.createImmutable("<em>"))));
 BA.debugLineNum = 2141;BA.debugLine="RM.Put(\"{/EM}\", \"</em>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/EM}"))),(Object)((RemoteObject.createImmutable("</em>"))));
 BA.debugLineNum = 2142;BA.debugLine="RM.Put(\"{MARK}\", \"<mark>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{MARK}"))),(Object)((RemoteObject.createImmutable("<mark>"))));
 BA.debugLineNum = 2143;BA.debugLine="RM.Put(\"{/MARK}\", \"</mark>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/MARK}"))),(Object)((RemoteObject.createImmutable("</mark>"))));
 BA.debugLineNum = 2144;BA.debugLine="RM.Put(\"{/I}\", \"</i>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/I}"))),(Object)((RemoteObject.createImmutable("</i>"))));
 BA.debugLineNum = 2145;BA.debugLine="RM.Put(\"{SUB}\", \"<sub>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{SUB}"))),(Object)((RemoteObject.createImmutable("<sub>"))));
 BA.debugLineNum = 2146;BA.debugLine="RM.Put(\"{/SUB}\", \"</sub>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/SUB}"))),(Object)((RemoteObject.createImmutable("</sub>"))));
 BA.debugLineNum = 2147;BA.debugLine="RM.Put(\"{BR}\", \"<br/>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{BR}"))),(Object)((RemoteObject.createImmutable("<br/>"))));
 BA.debugLineNum = 2148;BA.debugLine="RM.Put(\"{WBR}\",\"<wbr>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{WBR}"))),(Object)((RemoteObject.createImmutable("<wbr>"))));
 BA.debugLineNum = 2149;BA.debugLine="RM.Put(\"{STRONG}\", \"<strong>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{STRONG}"))),(Object)((RemoteObject.createImmutable("<strong>"))));
 BA.debugLineNum = 2150;BA.debugLine="RM.Put(\"{/STRONG}\", \"</strong>\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{/STRONG}"))),(Object)((RemoteObject.createImmutable("</strong>"))));
 BA.debugLineNum = 2151;BA.debugLine="RM.Put(\"{NBSP}\", \"&nbsp;\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("{NBSP}"))),(Object)((RemoteObject.createImmutable("&nbsp;"))));
 BA.debugLineNum = 2152;BA.debugLine="RM.Put(\"“\",\"\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("“"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2153;BA.debugLine="RM.Put(\"”\",\"\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("”"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2154;BA.debugLine="RM.Put(\"’\",\"'\")";
Debug.JustUpdateDeviceLine();
_rm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("’"))),(Object)((RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 2155;BA.debugLine="Dim kTot As Int = RM.Size - 1";
Debug.JustUpdateDeviceLine();
_ktot = RemoteObject.solve(new RemoteObject[] {_rm.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("kTot", _ktot);Debug.locals.put("kTot", _ktot);
 BA.debugLineNum = 2156;BA.debugLine="Dim kCnt As Int";
Debug.JustUpdateDeviceLine();
_kcnt = RemoteObject.createImmutable(0);Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 2157;BA.debugLine="For kCnt = 0 To kTot";
Debug.JustUpdateDeviceLine();
{
final int step44 = 1;
final int limit44 = _ktot.<Integer>get().intValue();
_kcnt = BA.numberCast(int.class, 0) ;
for (;(step44 > 0 && _kcnt.<Integer>get().intValue() <= limit44) || (step44 < 0 && _kcnt.<Integer>get().intValue() >= limit44) ;_kcnt = RemoteObject.createImmutable((int)(0 + _kcnt.<Integer>get().intValue() + step44))  ) {
Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 2158;BA.debugLine="Dim strValue As String = RM.GetKeyAt(kCnt)";
Debug.JustUpdateDeviceLine();
_strvalue = BA.ObjectToString(_rm.runMethod(false,"GetKeyAt",(Object)(_kcnt)));Debug.locals.put("strValue", _strvalue);Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 2159;BA.debugLine="Dim strRep As String = RM.Get(strValue)";
Debug.JustUpdateDeviceLine();
_strrep = BA.ObjectToString(_rm.runMethod(false,"Get",(Object)((_strvalue))));Debug.locals.put("strRep", _strrep);Debug.locals.put("strRep", _strrep);
 BA.debugLineNum = 2160;BA.debugLine="sText = sText.Replace(strValue, strRep)";
Debug.JustUpdateDeviceLine();
_stext = _stext.runMethod(true,"replace",(Object)(_strvalue),(Object)(_strrep));Debug.locals.put("sText", _stext);
 }
}Debug.locals.put("kCnt", _kcnt);
;
 BA.debugLineNum = 2162;BA.debugLine="Return sText";
Debug.JustUpdateDeviceLine();
if (true) return _stext;
 BA.debugLineNum = 2163;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("GetAttr (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1418);
if (RapidSub.canDelegate("getattr")) { return __ref.runUserSub(false, "vuehtml","getattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 1418;BA.debugLine="Sub GetAttr(attr As String) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1419;BA.debugLine="attr = attr.tolowercase";
Debug.JustUpdateDeviceLine();
_attr = _attr.runMethod(true,"toLowerCase");Debug.locals.put("attr", _attr);
 BA.debugLineNum = 1420;BA.debugLine="If properties.ContainsKey(attr) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_attr))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1421;BA.debugLine="Return properties.Get(attr)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_attr)));
 }else {
 BA.debugLineNum = 1423;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable((""));
 };
 BA.debugLineNum = 1425;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcomponentbuilder(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetComponentBuilder (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1681);
if (RapidSub.canDelegate("getcomponentbuilder")) { return __ref.runUserSub(false, "vuehtml","getcomponentbuilder", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _sout = RemoteObject.createImmutable("");
 BA.debugLineNum = 1681;BA.debugLine="private Sub GetComponentBuilder() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1682;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1683;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1684;BA.debugLine="If Prefix.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_prefix" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1685;BA.debugLine="sb.Append(Prefix)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.getField(true,"_prefix" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1687;BA.debugLine="sb.Append(\"<\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<")));
 BA.debugLineNum = 1688;BA.debugLine="sb.Append(Tag)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.getField(true,"_tag" /*RemoteObject*/ )));
 BA.debugLineNum = 1689;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 1690;BA.debugLine="If ID.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_id" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1691;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_toproperty" /*RemoteObject*/ ,(Object)(BA.ObjectToString("id")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))))));
 };
 BA.debugLineNum = 1693;BA.debugLine="sb.Append(\">\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(">")));
 BA.debugLineNum = 1694;BA.debugLine="Select Case Tag.ToLowerCase";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_tag" /*RemoteObject*/ ).runMethod(true,"toLowerCase"),BA.ObjectToString("img"),BA.ObjectToString("link"),BA.ObjectToString("meta"),BA.ObjectToString("input"),BA.ObjectToString("source"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 BA.debugLineNum = 1696;BA.debugLine="DoAProperClose = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_doaproperclose" /*RemoteObject*/ ,vuehtml.__c.getField(true,"False"));
 break; }
}
;
 BA.debugLineNum = 1698;BA.debugLine="If DoAProperClose = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_doaproperclose" /*RemoteObject*/ ),vuehtml.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1699;BA.debugLine="sb.Append(\"</\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</")));
 BA.debugLineNum = 1700;BA.debugLine="sb.Append(Tag)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.getField(true,"_tag" /*RemoteObject*/ )));
 BA.debugLineNum = 1701;BA.debugLine="sb.Append(\">\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(">")));
 };
 BA.debugLineNum = 1703;BA.debugLine="Dim sout As String = sb.tostring";
Debug.JustUpdateDeviceLine();
_sout = _sb.runMethod(true,"ToString");Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 1704;BA.debugLine="sout = sout.Trim";
Debug.JustUpdateDeviceLine();
_sout = _sout.runMethod(true,"trim");Debug.locals.put("sout", _sout);
 BA.debugLineNum = 1705;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
if (true) return _sout;
 BA.debugLineNum = 1706;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcssstyle(RemoteObject __ref,RemoteObject _stylename) throws Exception{
try {
		Debug.PushSubsStack("GetCssStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("getcssstyle")) { return __ref.runUserSub(false, "vuehtml","getcssstyle", __ref, _stylename);}
Debug.locals.put("styleName", _stylename);
 BA.debugLineNum = 26;BA.debugLine="Sub GetCssStyle(styleName As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="Return CSSRule.Get(styleName)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_stylename))));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getkeys(RemoteObject __ref,RemoteObject _delim,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("GetKeys (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2048);
if (RapidSub.canDelegate("getkeys")) { return __ref.runUserSub(false, "vuehtml","getkeys", __ref, _delim, _m);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _sout = RemoteObject.createImmutable("");
Debug.locals.put("Delim", _delim);
Debug.locals.put("m", _m);
 BA.debugLineNum = 2048;BA.debugLine="Sub GetKeys(Delim As String, m As Map) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2049;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2050;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2051;BA.debugLine="For Each strKey As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _m.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("strKey", _strkey);
Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 2052;BA.debugLine="sb.Append(strKey).Append(Delim)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_strkey)).runVoidMethod ("Append",(Object)(_delim));
 }
}Debug.locals.put("strKey", _strkey);
;
 BA.debugLineNum = 2054;BA.debugLine="Dim sout As String = sb.ToString";
Debug.JustUpdateDeviceLine();
_sout = _sb.runMethod(true,"ToString");Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2055;BA.debugLine="sout = RemDelim(sout,Delim)";
Debug.JustUpdateDeviceLine();
_sout = __ref.runClassMethod (b4j.example.vuehtml.class, "_remdelim" /*RemoteObject*/ ,(Object)(_sout),(Object)(_delim));Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2056;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
if (true) return _sout;
 BA.debugLineNum = 2057;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstyleattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("GetStyleAttr (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1073);
if (RapidSub.canDelegate("getstyleattr")) { return __ref.runUserSub(false, "vuehtml","getstyleattr", __ref, _attr);}
RemoteObject _hasitem = RemoteObject.createImmutable(false);
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 1073;BA.debugLine="Sub GetStyleAttr(attr As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1074;BA.debugLine="attr = attr.ToLowerCase";
Debug.JustUpdateDeviceLine();
_attr = _attr.runMethod(true,"toLowerCase");Debug.locals.put("attr", _attr);
 BA.debugLineNum = 1075;BA.debugLine="attr = RemDelim(attr,\":\")";
Debug.JustUpdateDeviceLine();
_attr = __ref.runClassMethod (b4j.example.vuehtml.class, "_remdelim" /*RemoteObject*/ ,(Object)(_attr),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("attr", _attr);
 BA.debugLineNum = 1076;BA.debugLine="attr = attr.trim";
Debug.JustUpdateDeviceLine();
_attr = _attr.runMethod(true,"trim");Debug.locals.put("attr", _attr);
 BA.debugLineNum = 1077;BA.debugLine="Dim hasItem As Boolean = Styles.ContainsKey(attr)";
Debug.JustUpdateDeviceLine();
_hasitem = __ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_attr)));Debug.locals.put("hasItem", _hasitem);Debug.locals.put("hasItem", _hasitem);
 BA.debugLineNum = 1078;BA.debugLine="If hasItem Then";
Debug.JustUpdateDeviceLine();
if (_hasitem.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1079;BA.debugLine="Return Styles.Get(attr)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_attr))));
 }else {
 BA.debugLineNum = 1081;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 1083;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalues(RemoteObject __ref,RemoteObject _delim,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("GetValues (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2060);
if (RapidSub.canDelegate("getvalues")) { return __ref.runUserSub(false, "vuehtml","getvalues", __ref, _delim, _m);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _sout = RemoteObject.createImmutable("");
Debug.locals.put("Delim", _delim);
Debug.locals.put("m", _m);
 BA.debugLineNum = 2060;BA.debugLine="Sub GetValues(Delim As String, m As Map) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2061;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2062;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2063;BA.debugLine="For Each strKey As String In m.values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _m.runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("strKey", _strkey);
Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 2064;BA.debugLine="sb.Append(strKey).Append(Delim)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_strkey)).runVoidMethod ("Append",(Object)(_delim));
 }
}Debug.locals.put("strKey", _strkey);
;
 BA.debugLineNum = 2066;BA.debugLine="Dim sout As String = sb.ToString";
Debug.JustUpdateDeviceLine();
_sout = _sb.runMethod(true,"ToString");Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2067;BA.debugLine="sout = RemDelim(sout,Delim)";
Debug.JustUpdateDeviceLine();
_sout = __ref.runClassMethod (b4j.example.vuehtml.class, "_remdelim" /*RemoteObject*/ ,(Object)(_sout),(Object)(_delim));Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2068;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
if (true) return _sout;
 BA.debugLineNum = 2069;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _html(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HTML (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1438);
if (RapidSub.canDelegate("html")) { return __ref.runUserSub(false, "vuehtml","html", __ref);}
RemoteObject _sout = RemoteObject.createImmutable("");
 BA.debugLineNum = 1438;BA.debugLine="public Sub HTML As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1439;BA.debugLine="Dim sOut As String = ToString";
Debug.JustUpdateDeviceLine();
_sout = __ref.runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("sOut", _sout);Debug.locals.put("sOut", _sout);
 BA.debugLineNum = 1440;BA.debugLine="Return sOut";
Debug.JustUpdateDeviceLine();
if (true) return _sout;
 BA.debugLineNum = 1441;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _elid,RemoteObject _stag) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1585);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vuehtml","initialize", __ref, _ba, _elid, _stag);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("elID", _elid);
Debug.locals.put("stag", _stag);
 BA.debugLineNum = 1585;BA.debugLine="Public Sub Initialize(elID As String, stag As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1586;BA.debugLine="ds = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ds" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1587;BA.debugLine="hasContent = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"False"));
 BA.debugLineNum = 1588;BA.debugLine="ParentID = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_parentid" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1589;BA.debugLine="ID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_elid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 1590;BA.debugLine="IsImportant = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isimportant" /*RemoteObject*/ ,vuehtml.__c.getField(true,"False"));
 BA.debugLineNum = 1591;BA.debugLine="SBBefore.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sbbefore" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1592;BA.debugLine="SBAfter.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sbafter" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1593;BA.debugLine="properties.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_properties" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1594;BA.debugLine="properties.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_properties" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1595;BA.debugLine="Contents.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1596;BA.debugLine="Contents.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1597;BA.debugLine="Styles.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_styles" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1598;BA.debugLine="Styles.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_styles" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1599;BA.debugLine="Classes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_classes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1600;BA.debugLine="Classes.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_classes" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1601;BA.debugLine="LooseAttributes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_looseattributes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1602;BA.debugLine="LooseAttributes.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_looseattributes" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1603;BA.debugLine="DontBreak.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dontbreak" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1604;BA.debugLine="DontBreak.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dontbreak" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1605;BA.debugLine="DontBreak.Add(\"li\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dontbreak" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("li"))));
 BA.debugLineNum = 1606;BA.debugLine="DontBreak.Add(\"a\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dontbreak" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("a"))));
 BA.debugLineNum = 1607;BA.debugLine="DontBreak.Add(\"i\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dontbreak" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("i"))));
 BA.debugLineNum = 1608;BA.debugLine="DontBreak.Add(\"span\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dontbreak" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("span"))));
 BA.debugLineNum = 1609;BA.debugLine="DontBreak.Add(\"img\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dontbreak" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("img"))));
 BA.debugLineNum = 1610;BA.debugLine="Tag = stag.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,_stag.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 1611;BA.debugLine="Prefix = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_prefix" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1612;BA.debugLine="DoAProperClose = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_doaproperclose" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 BA.debugLineNum = 1613;BA.debugLine="CSSRule.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1614;BA.debugLine="CSSRule.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1615;BA.debugLine="SingleQuote.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_singlequote" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1616;BA.debugLine="SingleQuote.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_singlequote" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1617;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1618;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _join(RemoteObject __ref,RemoteObject _delimiter,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("Join (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2263);
if (RapidSub.canDelegate("join")) { return __ref.runUserSub(false, "vuehtml","join", __ref, _delimiter, _lst);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 2263;BA.debugLine="public Sub Join(delimiter As String, lst As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2264;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 2265;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2266;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2267;BA.debugLine="sb.Append(lst.get(0))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 2268;BA.debugLine="For i = 1 To lst.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step5 > 0 && _i.<Integer>get().intValue() <= limit5) || (step5 < 0 && _i.<Integer>get().intValue() >= limit5) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2269;BA.debugLine="sb.Append(delimiter).Append(lst.get(i))";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delimiter)).runVoidMethod ("Append",(Object)(BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2271;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 2272;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makepx(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("MakePx (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1315);
if (RapidSub.canDelegate("makepx")) { return __ref.runUserSub(false, "vuehtml","makepx", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1315;BA.debugLine="Sub MakePx(sValue As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1316;BA.debugLine="sValue = sValue.trim";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"trim");Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1317;BA.debugLine="If sValue.EndsWith(\"%\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("%"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1318;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1319;BA.debugLine="else If sValue.EndsWith(\"vm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1320;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1321;BA.debugLine="else If sValue.EndsWith(\"px\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("px"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1322;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1323;BA.debugLine="else If sValue.EndsWith(\"cm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("cm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1324;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1325;BA.debugLine="else If sValue.EndsWith(\"mm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("mm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1326;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1327;BA.debugLine="else If sValue.EndsWith(\"in\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("in"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1328;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1329;BA.debugLine="else If sValue.EndsWith(\"pt\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("pt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1330;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1331;BA.debugLine="else If sValue.EndsWith(\"pc\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("pc"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1332;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1333;BA.debugLine="else If sValue.EndsWith(\"em\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("em"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1334;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1335;BA.debugLine="else If sValue.EndsWith(\"ex\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("ex"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1336;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1337;BA.debugLine="else If sValue.EndsWith(\"ch\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("ch"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1338;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1339;BA.debugLine="else If sValue.EndsWith(\"rem\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("rem"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1340;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1341;BA.debugLine="else If sValue.EndsWith(\"vw\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vw"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1342;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1343;BA.debugLine="else If sValue.EndsWith(\"vh\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vh"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1344;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1345;BA.debugLine="else If sValue.EndsWith(\"vmin\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vmin"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1346;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1347;BA.debugLine="else If sValue.EndsWith(\"vmax\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vmax"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1348;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1349;BA.debugLine="else If sValue.EndsWith(\";\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1350;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else {
 BA.debugLineNum = 1352;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"replace",(Object)(BA.ObjectToString("px")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1353;BA.debugLine="sValue = $\"${sValue}px\"$";
Debug.JustUpdateDeviceLine();
_svalue = (RemoteObject.concat(RemoteObject.createImmutable(""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_svalue))),RemoteObject.createImmutable("px")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1354;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue,BA.ObjectToString("px"))) { 
_svalue = BA.ObjectToString("");Debug.locals.put("sValue", _svalue);};
 BA.debugLineNum = 1355;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }}}}}}}}}}}}}}}}}
;
 BA.debugLineNum = 1357;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mvfield(RemoteObject __ref,RemoteObject _svalue,RemoteObject _iposition,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("MvField (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("mvfield")) { return __ref.runUserSub(false, "vuehtml","mvfield", __ref, _svalue, _iposition, _delimiter);}
RemoteObject _xpos = RemoteObject.createImmutable(0);
RemoteObject _mvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tvalues = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _startcnt = RemoteObject.createImmutable(0);
Debug.locals.put("sValue", _svalue);
Debug.locals.put("iPosition", _iposition);
Debug.locals.put("Delimiter", _delimiter);
 BA.debugLineNum = 313;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 314;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 315;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
Debug.JustUpdateDeviceLine();
_xpos = _svalue.runMethod(true,"indexOf",(Object)(_delimiter));Debug.locals.put("xPos", _xpos);Debug.locals.put("xPos", _xpos);
 BA.debugLineNum = 316;BA.debugLine="If xPos = -1 Then Return sValue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_xpos,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return _svalue;};
 BA.debugLineNum = 317;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
Debug.JustUpdateDeviceLine();
_mvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_mvalues = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(_delimiter),(Object)(_svalue));Debug.locals.put("mValues", _mvalues);Debug.locals.put("mValues", _mvalues);
 BA.debugLineNum = 318;BA.debugLine="Dim tValues As Int";
Debug.JustUpdateDeviceLine();
_tvalues = RemoteObject.createImmutable(0);Debug.locals.put("tValues", _tvalues);
 BA.debugLineNum = 319;BA.debugLine="tValues = mValues.size -1";
Debug.JustUpdateDeviceLine();
_tvalues = RemoteObject.solve(new RemoteObject[] {_mvalues.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("tValues", _tvalues);
 BA.debugLineNum = 320;BA.debugLine="Select Case iPosition";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_iposition,BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, -(double) (0 + 2)),BA.numberCast(int.class, -(double) (0 + 3)))) {
case 0: {
 BA.debugLineNum = 322;BA.debugLine="Return mValues.get(tValues)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_tvalues)));
 break; }
case 1: {
 BA.debugLineNum = 324;BA.debugLine="Return mValues.get(tValues - 1)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_tvalues,RemoteObject.createImmutable(1)}, "-",1, 1))));
 break; }
case 2: {
 BA.debugLineNum = 326;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 327;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 328;BA.debugLine="Dim startcnt As Int";
Debug.JustUpdateDeviceLine();
_startcnt = RemoteObject.createImmutable(0);Debug.locals.put("startcnt", _startcnt);
 BA.debugLineNum = 329;BA.debugLine="sb.Append(mValues.Get(1))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 330;BA.debugLine="For startcnt = 2 To tValues";
Debug.JustUpdateDeviceLine();
{
final int step17 = 1;
final int limit17 = _tvalues.<Integer>get().intValue();
_startcnt = BA.numberCast(int.class, 2) ;
for (;(step17 > 0 && _startcnt.<Integer>get().intValue() <= limit17) || (step17 < 0 && _startcnt.<Integer>get().intValue() >= limit17) ;_startcnt = RemoteObject.createImmutable((int)(0 + _startcnt.<Integer>get().intValue() + step17))  ) {
Debug.locals.put("startcnt", _startcnt);
 BA.debugLineNum = 331;BA.debugLine="sb.Append(Delimiter)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_delimiter));
 BA.debugLineNum = 332;BA.debugLine="sb.Append(mValues.get(startcnt))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_startcnt)))));
 }
}Debug.locals.put("startcnt", _startcnt);
;
 BA.debugLineNum = 334;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 break; }
default: {
 BA.debugLineNum = 336;BA.debugLine="iPosition = iPosition - 1";
Debug.JustUpdateDeviceLine();
_iposition = RemoteObject.solve(new RemoteObject[] {_iposition,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iPosition", _iposition);
 BA.debugLineNum = 337;BA.debugLine="If iPosition <= -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_iposition,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 338;BA.debugLine="Return mValues.get(tValues)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_tvalues)));
 };
 BA.debugLineNum = 340;BA.debugLine="If iPosition > tValues Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_iposition,BA.numberCast(double.class, _tvalues))) { 
 BA.debugLineNum = 341;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 343;BA.debugLine="Return mValues.get(iPosition)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_iposition)));
 break; }
}
;
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mvfieldfrom(RemoteObject __ref,RemoteObject _svalue,RemoteObject _iposition,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("MvFieldFrom (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1866);
if (RapidSub.canDelegate("mvfieldfrom")) { return __ref.runUserSub(false, "vuehtml","mvfieldfrom", __ref, _svalue, _iposition, _delimiter);}
RemoteObject _mvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tvalues = RemoteObject.createImmutable(0);
RemoteObject _ew = RemoteObject.createImmutable(false);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _startcnt = RemoteObject.createImmutable(0);
Debug.locals.put("sValue", _svalue);
Debug.locals.put("iPosition", _iposition);
Debug.locals.put("Delimiter", _delimiter);
 BA.debugLineNum = 1866;BA.debugLine="public Sub MvFieldFrom(sValue As String, iPosition";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1867;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1868;BA.debugLine="Dim mValues As List";
Debug.JustUpdateDeviceLine();
_mvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("mValues", _mvalues);
 BA.debugLineNum = 1869;BA.debugLine="Dim tValues As Int";
Debug.JustUpdateDeviceLine();
_tvalues = RemoteObject.createImmutable(0);Debug.locals.put("tValues", _tvalues);
 BA.debugLineNum = 1870;BA.debugLine="Dim ew As Boolean = sValue.EndsWith(Delimiter)";
Debug.JustUpdateDeviceLine();
_ew = _svalue.runMethod(true,"endsWith",(Object)(_delimiter));Debug.locals.put("ew", _ew);Debug.locals.put("ew", _ew);
 BA.debugLineNum = 1871;BA.debugLine="If ew Then";
Debug.JustUpdateDeviceLine();
if (_ew.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1872;BA.debugLine="sValue = sValue & \" \"";
Debug.JustUpdateDeviceLine();
_svalue = RemoteObject.concat(_svalue,RemoteObject.createImmutable(" "));Debug.locals.put("sValue", _svalue);
 };
 BA.debugLineNum = 1874;BA.debugLine="mValues = StrParse(Delimiter, sValue)";
Debug.JustUpdateDeviceLine();
_mvalues = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(_delimiter),(Object)(_svalue));Debug.locals.put("mValues", _mvalues);
 BA.debugLineNum = 1875;BA.debugLine="tValues = mValues.size -1";
Debug.JustUpdateDeviceLine();
_tvalues = RemoteObject.solve(new RemoteObject[] {_mvalues.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("tValues", _tvalues);
 BA.debugLineNum = 1876;BA.debugLine="If tValues < iPosition Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_tvalues,BA.numberCast(double.class, _iposition))) { 
 BA.debugLineNum = 1877;BA.debugLine="Return mValues.get(tValues)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_tvalues)));
 };
 BA.debugLineNum = 1879;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1880;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1881;BA.debugLine="Dim startcnt As Int";
Debug.JustUpdateDeviceLine();
_startcnt = RemoteObject.createImmutable(0);Debug.locals.put("startcnt", _startcnt);
 BA.debugLineNum = 1882;BA.debugLine="sb.Append(mValues.get(iPosition))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_iposition)))));
 BA.debugLineNum = 1883;BA.debugLine="For startcnt = iPosition + 1 To tValues";
Debug.JustUpdateDeviceLine();
{
final int step17 = 1;
final int limit17 = _tvalues.<Integer>get().intValue();
_startcnt = RemoteObject.solve(new RemoteObject[] {_iposition,RemoteObject.createImmutable(1)}, "+",1, 1) ;
for (;(step17 > 0 && _startcnt.<Integer>get().intValue() <= limit17) || (step17 < 0 && _startcnt.<Integer>get().intValue() >= limit17) ;_startcnt = RemoteObject.createImmutable((int)(0 + _startcnt.<Integer>get().intValue() + step17))  ) {
Debug.locals.put("startcnt", _startcnt);
 BA.debugLineNum = 1884;BA.debugLine="sb.Append(Delimiter)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_delimiter));
 BA.debugLineNum = 1885;BA.debugLine="sb.Append(mValues.get(startcnt))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_startcnt)))));
 }
}Debug.locals.put("startcnt", _startcnt);
;
 BA.debugLineNum = 1887;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 1888;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _open(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Open (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2006);
if (RapidSub.canDelegate("open")) { return __ref.runUserSub(false, "vuehtml","open", __ref);}
RemoteObject _thisclass = RemoteObject.createImmutable("");
RemoteObject _thisstyle = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _thisattr = RemoteObject.createImmutable("");
RemoteObject _thoseloose = RemoteObject.createImmutable("");
 BA.debugLineNum = 2006;BA.debugLine="private Sub Open() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2012;BA.debugLine="Dim thisClass As String = BuildClass";
Debug.JustUpdateDeviceLine();
_thisclass = __ref.runClassMethod (b4j.example.vuehtml.class, "_buildclass" /*RemoteObject*/ );Debug.locals.put("thisClass", _thisclass);Debug.locals.put("thisClass", _thisclass);
 BA.debugLineNum = 2013;BA.debugLine="thisClass = thisClass.trim";
Debug.JustUpdateDeviceLine();
_thisclass = _thisclass.runMethod(true,"trim");Debug.locals.put("thisClass", _thisclass);
 BA.debugLineNum = 2014;BA.debugLine="If thisClass.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_thisclass.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2015;BA.debugLine="AddAttribute(\"class\", thisClass)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("class")),(Object)((_thisclass)));
 };
 BA.debugLineNum = 2018;BA.debugLine="Dim thisStyle As String = BuildStyle";
Debug.JustUpdateDeviceLine();
_thisstyle = __ref.runClassMethod (b4j.example.vuehtml.class, "_buildstyle" /*RemoteObject*/ );Debug.locals.put("thisStyle", _thisstyle);Debug.locals.put("thisStyle", _thisstyle);
 BA.debugLineNum = 2019;BA.debugLine="thisStyle = thisStyle.trim";
Debug.JustUpdateDeviceLine();
_thisstyle = _thisstyle.runMethod(true,"trim");Debug.locals.put("thisStyle", _thisstyle);
 BA.debugLineNum = 2020;BA.debugLine="If thisStyle.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_thisstyle.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2021;BA.debugLine="AddAttribute(\"style\", thisStyle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("style")),(Object)((_thisstyle)));
 };
 BA.debugLineNum = 2023;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2024;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2025;BA.debugLine="If Prefix.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_prefix" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2026;BA.debugLine="sb.Append(Prefix)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.getField(true,"_prefix" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 2028;BA.debugLine="sb.Append(\"<\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<")));
 BA.debugLineNum = 2029;BA.debugLine="sb.Append(Tag)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.getField(true,"_tag" /*RemoteObject*/ )));
 BA.debugLineNum = 2030;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 2031;BA.debugLine="If ID.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_id" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2032;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_toproperty" /*RemoteObject*/ ,(Object)(BA.ObjectToString("id")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))))));
 BA.debugLineNum = 2033;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 };
 BA.debugLineNum = 2036;BA.debugLine="Dim thisAttr As String = BuildAttributes";
Debug.JustUpdateDeviceLine();
_thisattr = __ref.runClassMethod (b4j.example.vuehtml.class, "_buildattributes" /*RemoteObject*/ );Debug.locals.put("thisAttr", _thisattr);Debug.locals.put("thisAttr", _thisattr);
 BA.debugLineNum = 2037;BA.debugLine="thisAttr = thisAttr.Trim";
Debug.JustUpdateDeviceLine();
_thisattr = _thisattr.runMethod(true,"trim");Debug.locals.put("thisAttr", _thisattr);
 BA.debugLineNum = 2038;BA.debugLine="If thisAttr.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_thisattr.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2039;BA.debugLine="sb.Append(thisAttr)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_thisattr));
 };
 BA.debugLineNum = 2041;BA.debugLine="Dim thoseLoose As String = GetKeys(\" \",LooseAttri";
Debug.JustUpdateDeviceLine();
_thoseloose = __ref.runClassMethod (b4j.example.vuehtml.class, "_getkeys" /*RemoteObject*/ ,(Object)(BA.ObjectToString(" ")),(Object)(__ref.getField(false,"_looseattributes" /*RemoteObject*/ )));Debug.locals.put("thoseLoose", _thoseloose);Debug.locals.put("thoseLoose", _thoseloose);
 BA.debugLineNum = 2042;BA.debugLine="sb.Append(\" \").Append(thoseLoose)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runVoidMethod ("Append",(Object)(_thoseloose));
 BA.debugLineNum = 2043;BA.debugLine="sb.Append(\">\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(">")));
 BA.debugLineNum = 2044;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 2045;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pointer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pointer (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1444);
if (RapidSub.canDelegate("pointer")) { return __ref.runUserSub(false, "vuehtml","pointer", __ref);}
 BA.debugLineNum = 1444;BA.debugLine="Sub Pointer As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1445;BA.debugLine="Return \"cursor:pointer\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("cursor:pointer");
 BA.debugLineNum = 1446;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _pelement) throws Exception{
try {
		Debug.PushSubsStack("Pop (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1621);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vuehtml","pop", __ref, _pelement);}
Debug.locals.put("pElement", _pelement);
 BA.debugLineNum = 1621;BA.debugLine="Sub Pop(pElement As VueHTML)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1622;BA.debugLine="pElement.AddElement(Me)";
Debug.JustUpdateDeviceLine();
_pelement.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 1623;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _poptoparent(RemoteObject __ref,RemoteObject _sparentid) throws Exception{
try {
		Debug.PushSubsStack("PopToParent (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2960);
if (RapidSub.canDelegate("poptoparent")) { return __ref.runUserSub(false, "vuehtml","poptoparent", __ref, _sparentid);}
RemoteObject _sout = RemoteObject.createImmutable("");
RemoteObject _pel = RemoteObject.declareNull("com.ab.banano.BANanoElement");
Debug.locals.put("sParentID", _sparentid);
 BA.debugLineNum = 2960;BA.debugLine="Sub PopToParent(sParentID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2961;BA.debugLine="Dim sout As String = ToString";
Debug.JustUpdateDeviceLine();
_sout = __ref.runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2962;BA.debugLine="sParentID = sParentID.tolowercase";
Debug.JustUpdateDeviceLine();
_sparentid = _sparentid.runMethod(true,"toLowerCase");Debug.locals.put("sParentID", _sparentid);
 BA.debugLineNum = 2963;BA.debugLine="Dim pEL As BANanoElement";
Debug.JustUpdateDeviceLine();
_pel = RemoteObject.createNew ("com.ab.banano.BANanoElement");Debug.locals.put("pEL", _pel);
 BA.debugLineNum = 2964;BA.debugLine="pEL = BANano.GetElement($\"#${sParentID}\"$)";
Debug.JustUpdateDeviceLine();
_pel = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)((RemoteObject.concat(RemoteObject.createImmutable("#"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sparentid))),RemoteObject.createImmutable("")))));Debug.locals.put("pEL", _pel);
 BA.debugLineNum = 2965;BA.debugLine="pEL.Append(sout)";
Debug.JustUpdateDeviceLine();
_pel.runVoidMethod ("Append",(Object)(_sout));
 BA.debugLineNum = 2966;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ramovefromlist(RemoteObject __ref,RemoteObject _listx,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("RamoveFromList (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,355);
if (RapidSub.canDelegate("ramovefromlist")) { return __ref.runUserSub(false, "vuehtml","ramovefromlist", __ref, _listx, _item);}
RemoteObject _li = RemoteObject.createImmutable(0);
Debug.locals.put("listX", _listx);
Debug.locals.put("item", _item);
 BA.debugLineNum = 355;BA.debugLine="Sub RamoveFromList(listX As List, item As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 356;BA.debugLine="Dim li As Int = listX.IndexOf(item)";
Debug.JustUpdateDeviceLine();
_li = _listx.runMethod(true,"IndexOf",(Object)((_item)));Debug.locals.put("li", _li);Debug.locals.put("li", _li);
 BA.debugLineNum = 357;BA.debugLine="If li >= 0 Then listX.RemoveAt(li)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_li,BA.numberCast(double.class, 0))) { 
_listx.runVoidMethod ("RemoveAt",(Object)(_li));};
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _randlistvalue(RemoteObject __ref,RemoteObject _listx) throws Exception{
try {
		Debug.PushSubsStack("RandListValue (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("randlistvalue")) { return __ref.runUserSub(false, "vuehtml","randlistvalue", __ref, _listx);}
Debug.locals.put("ListX", _listx);
 BA.debugLineNum = 349;BA.debugLine="Sub RandListValue(ListX As List) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 350;BA.debugLine="ShuffleList(ListX)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_shufflelist" /*RemoteObject*/ ,(Object)(_listx));
 BA.debugLineNum = 351;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
Debug.JustUpdateDeviceLine();
if (true) return _listx.runMethod(false,"Get",(Object)(vuehtml.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_listx.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
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
public static RemoteObject  _remdelim(RemoteObject __ref,RemoteObject _svalue,RemoteObject _delim) throws Exception{
try {
		Debug.PushSubsStack("RemDelim (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2166);
if (RapidSub.canDelegate("remdelim")) { return __ref.runUserSub(false, "vuehtml","remdelim", __ref, _svalue, _delim);}
RemoteObject _sw = RemoteObject.createImmutable(false);
RemoteObject _ldelim = RemoteObject.createImmutable(0);
RemoteObject _nvalue = RemoteObject.createImmutable("");
Debug.locals.put("sValue", _svalue);
Debug.locals.put("Delim", _delim);
 BA.debugLineNum = 2166;BA.debugLine="private Sub RemDelim(sValue As String, Delim As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2167;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
Debug.JustUpdateDeviceLine();
_sw = _svalue.runMethod(true,"endsWith",(Object)(_delim));Debug.locals.put("sw", _sw);Debug.locals.put("sw", _sw);
 BA.debugLineNum = 2168;BA.debugLine="If sw Then";
Debug.JustUpdateDeviceLine();
if (_sw.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2169;BA.debugLine="Dim lDelim As Int = Delim.Length";
Debug.JustUpdateDeviceLine();
_ldelim = _delim.runMethod(true,"length");Debug.locals.put("lDelim", _ldelim);Debug.locals.put("lDelim", _ldelim);
 BA.debugLineNum = 2170;BA.debugLine="Dim nValue As String = sValue";
Debug.JustUpdateDeviceLine();
_nvalue = _svalue;Debug.locals.put("nValue", _nvalue);Debug.locals.put("nValue", _nvalue);
 BA.debugLineNum = 2171;BA.debugLine="sw = nValue.EndsWith(Delim)";
Debug.JustUpdateDeviceLine();
_sw = _nvalue.runMethod(true,"endsWith",(Object)(_delim));Debug.locals.put("sw", _sw);
 BA.debugLineNum = 2172;BA.debugLine="If sw Then";
Debug.JustUpdateDeviceLine();
if (_sw.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2173;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
Debug.JustUpdateDeviceLine();
_nvalue = _nvalue.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_nvalue.runMethod(true,"length"),_ldelim}, "-",1, 1)));Debug.locals.put("nValue", _nvalue);
 };
 BA.debugLineNum = 2175;BA.debugLine="Return nValue";
Debug.JustUpdateDeviceLine();
if (true) return _nvalue;
 }else {
 BA.debugLineNum = 2177;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 };
 BA.debugLineNum = 2179;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("RemoveAttr (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1646);
if (RapidSub.canDelegate("removeattr")) { return __ref.runUserSub(false, "vuehtml","removeattr", __ref, _sname);}
RemoteObject _sitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strstyle = RemoteObject.createImmutable("");
Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1646;BA.debugLine="public Sub RemoveAttr(sName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1647;BA.debugLine="sName = sName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1648;BA.debugLine="sName = sName.Replace(\" \",\";\")";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1649;BA.debugLine="Dim sItems As List = StrParse(\";\",sName)";
Debug.JustUpdateDeviceLine();
_sitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_sitems = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_sname));Debug.locals.put("sItems", _sitems);Debug.locals.put("sItems", _sitems);
 BA.debugLineNum = 1650;BA.debugLine="For Each strStyle As String In sItems";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _sitems;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("strStyle", _strstyle);
Debug.locals.put("strStyle", _strstyle);
 BA.debugLineNum = 1651;BA.debugLine="strStyle = strStyle.trim";
Debug.JustUpdateDeviceLine();
_strstyle = _strstyle.runMethod(true,"trim");Debug.locals.put("strStyle", _strstyle);
 BA.debugLineNum = 1652;BA.debugLine="If properties.ContainsKey(strStyle) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_strstyle))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1653;BA.debugLine="properties.Remove(strStyle)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_properties" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_strstyle)));
 };
 }
}Debug.locals.put("strStyle", _strstyle);
;
 BA.debugLineNum = 1656;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1657;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeattrdata(RemoteObject __ref,RemoteObject _sdata) throws Exception{
try {
		Debug.PushSubsStack("RemoveAttrData (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1626);
if (RapidSub.canDelegate("removeattrdata")) { return __ref.runUserSub(false, "vuehtml","removeattrdata", __ref, _sdata);}
Debug.locals.put("sData", _sdata);
 BA.debugLineNum = 1626;BA.debugLine="public Sub RemoveAttrData(sData As String) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1627;BA.debugLine="sData = $\"data-${sData}\"$";
Debug.JustUpdateDeviceLine();
_sdata = (RemoteObject.concat(RemoteObject.createImmutable("data-"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdata))),RemoteObject.createImmutable("")));Debug.locals.put("sData", _sdata);
 BA.debugLineNum = 1628;BA.debugLine="RemoveAttr(sData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_removeattr" /*RemoteObject*/ ,(Object)(_sdata));
 BA.debugLineNum = 1629;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1630;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeattribute(RemoteObject __ref,RemoteObject _prop) throws Exception{
try {
		Debug.PushSubsStack("RemoveAttribute (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1640);
if (RapidSub.canDelegate("removeattribute")) { return __ref.runUserSub(false, "vuehtml","removeattribute", __ref, _prop);}
Debug.locals.put("prop", _prop);
 BA.debugLineNum = 1640;BA.debugLine="Sub RemoveAttribute(prop As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1641;BA.debugLine="RemoveAttr(prop)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_removeattr" /*RemoteObject*/ ,(Object)(_prop));
 BA.debugLineNum = 1642;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1643;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeattributeoncondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _prop) throws Exception{
try {
		Debug.PushSubsStack("RemoveAttributeOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1632);
if (RapidSub.canDelegate("removeattributeoncondition")) { return __ref.runUserSub(false, "vuehtml","removeattributeoncondition", __ref, _bcondition, _prop);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("prop", _prop);
 BA.debugLineNum = 1632;BA.debugLine="Sub RemoveAttributeOnCondition(bCondition As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1633;BA.debugLine="If bCondition Then";
Debug.JustUpdateDeviceLine();
if (_bcondition.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1634;BA.debugLine="RemoveAttr(prop)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_removeattr" /*RemoteObject*/ ,(Object)(_prop));
 };
 BA.debugLineNum = 1636;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1637;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeborder(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("RemoveBorder (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("removeborder")) { return __ref.runUserSub(false, "vuehtml","removeborder", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 139;BA.debugLine="Sub RemoveBorder(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="SetStyle(\"border\",\"none none double none\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border")),(Object)(RemoteObject.createImmutable("none none double none")));
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
public static RemoteObject  _removeclass(RemoteObject __ref,RemoteObject _classname) throws Exception{
try {
		Debug.PushSubsStack("removeClass (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1774);
if (RapidSub.canDelegate("removeclass")) { return __ref.runUserSub(false, "vuehtml","removeclass", __ref, _classname);}
RemoteObject _sitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strstyle = RemoteObject.createImmutable("");
Debug.locals.put("className", _classname);
 BA.debugLineNum = 1774;BA.debugLine="public Sub removeClass(className As String) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1775;BA.debugLine="className = className.Trim";
Debug.JustUpdateDeviceLine();
_classname = _classname.runMethod(true,"trim");Debug.locals.put("className", _classname);
 BA.debugLineNum = 1776;BA.debugLine="className = className.replace(\" \",\";\")";
Debug.JustUpdateDeviceLine();
_classname = _classname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("className", _classname);
 BA.debugLineNum = 1777;BA.debugLine="Dim sItems As List = StrParse(\";\",className)";
Debug.JustUpdateDeviceLine();
_sitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_sitems = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_classname));Debug.locals.put("sItems", _sitems);Debug.locals.put("sItems", _sitems);
 BA.debugLineNum = 1778;BA.debugLine="For Each strStyle As String In sItems";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _sitems;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("strStyle", _strstyle);
Debug.locals.put("strStyle", _strstyle);
 BA.debugLineNum = 1779;BA.debugLine="strStyle = strStyle.Trim";
Debug.JustUpdateDeviceLine();
_strstyle = _strstyle.runMethod(true,"trim");Debug.locals.put("strStyle", _strstyle);
 BA.debugLineNum = 1780;BA.debugLine="If Classes.ContainsKey(strStyle) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_classes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_strstyle))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1781;BA.debugLine="Classes.Remove(strStyle)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_classes" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_strstyle)));
 };
 }
}Debug.locals.put("strStyle", _strstyle);
;
 BA.debugLineNum = 1784;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1785;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeclassoncondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _sclass) throws Exception{
try {
		Debug.PushSubsStack("RemoveClassOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1479);
if (RapidSub.canDelegate("removeclassoncondition")) { return __ref.runUserSub(false, "vuehtml","removeclassoncondition", __ref, _bcondition, _sclass);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("sClass", _sclass);
 BA.debugLineNum = 1479;BA.debugLine="Sub RemoveClassOnCondition(bCondition As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1480;BA.debugLine="If bCondition Then";
Debug.JustUpdateDeviceLine();
if (_bcondition.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1481;BA.debugLine="removeClass(sClass)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_removeclass" /*RemoteObject*/ ,(Object)(_sclass));
 };
 BA.debugLineNum = 1483;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1484;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeclassonfalsecondition(RemoteObject __ref,RemoteObject _bcondition,RemoteObject _sclass) throws Exception{
try {
		Debug.PushSubsStack("RemoveClassOnFalseCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1487);
if (RapidSub.canDelegate("removeclassonfalsecondition")) { return __ref.runUserSub(false, "vuehtml","removeclassonfalsecondition", __ref, _bcondition, _sclass);}
Debug.locals.put("bCondition", _bcondition);
Debug.locals.put("sClass", _sclass);
 BA.debugLineNum = 1487;BA.debugLine="Sub RemoveClassOnFalseCondition(bCondition As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1488;BA.debugLine="If bCondition = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bcondition,vuehtml.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1489;BA.debugLine="removeClass(sClass)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_removeclass" /*RemoteObject*/ ,(Object)(_sclass));
 };
 BA.debugLineNum = 1491;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1492;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removecssrule(RemoteObject __ref,RemoteObject _stylename,RemoteObject _styleprop) throws Exception{
try {
		Debug.PushSubsStack("RemoveCssRule (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("removecssrule")) { return __ref.runUserSub(false, "vuehtml","removecssrule", __ref, _stylename, _styleprop);}
RemoteObject _scontent = RemoteObject.createImmutable("");
RemoteObject _spprops = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strpropvalue = RemoteObject.createImmutable("");
RemoteObject _strprop = RemoteObject.createImmutable("");
RemoteObject _strvalue = RemoteObject.createImmutable("");
RemoteObject _nline = RemoteObject.createImmutable("");
Debug.locals.put("styleName", _stylename);
Debug.locals.put("styleProp", _styleprop);
 BA.debugLineNum = 92;BA.debugLine="Sub RemoveCssRule(styleName As String, styleProp A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="Dim scontent As String";
Debug.JustUpdateDeviceLine();
_scontent = RemoteObject.createImmutable("");Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 94;BA.debugLine="If CSSRule.ContainsKey(styleName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_stylename))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 95;BA.debugLine="scontent = CSSRule.Get(styleName)";
Debug.JustUpdateDeviceLine();
_scontent = BA.ObjectToString(__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_stylename))));Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 96;BA.debugLine="scontent = scontent.trim";
Debug.JustUpdateDeviceLine();
_scontent = _scontent.runMethod(true,"trim");Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 97;BA.debugLine="Dim spProps As List = StrParse(\";\",scontent)";
Debug.JustUpdateDeviceLine();
_spprops = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_spprops = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_scontent));Debug.locals.put("spProps", _spprops);Debug.locals.put("spProps", _spprops);
 BA.debugLineNum = 98;BA.debugLine="Dim nList As List";
Debug.JustUpdateDeviceLine();
_nlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nList", _nlist);
 BA.debugLineNum = 99;BA.debugLine="nList.initialize";
Debug.JustUpdateDeviceLine();
_nlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="For Each strPropValue As String In spProps";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = _spprops;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_strpropvalue = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("strPropValue", _strpropvalue);
Debug.locals.put("strPropValue", _strpropvalue);
 BA.debugLineNum = 101;BA.debugLine="strPropValue = strPropValue.Trim";
Debug.JustUpdateDeviceLine();
_strpropvalue = _strpropvalue.runMethod(true,"trim");Debug.locals.put("strPropValue", _strpropvalue);
 BA.debugLineNum = 102;BA.debugLine="Dim strProp As String = MvField(strPropValue,1,";
Debug.JustUpdateDeviceLine();
_strprop = __ref.runClassMethod (b4j.example.vuehtml.class, "_mvfield" /*RemoteObject*/ ,(Object)(_strpropvalue),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("strProp", _strprop);Debug.locals.put("strProp", _strprop);
 BA.debugLineNum = 103;BA.debugLine="Dim strValue As String = MvField(strPropValue,2";
Debug.JustUpdateDeviceLine();
_strvalue = __ref.runClassMethod (b4j.example.vuehtml.class, "_mvfield" /*RemoteObject*/ ,(Object)(_strpropvalue),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("strValue", _strvalue);Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 104;BA.debugLine="strProp = strProp.Trim";
Debug.JustUpdateDeviceLine();
_strprop = _strprop.runMethod(true,"trim");Debug.locals.put("strProp", _strprop);
 BA.debugLineNum = 105;BA.debugLine="strValue = strValue.trim";
Debug.JustUpdateDeviceLine();
_strvalue = _strvalue.runMethod(true,"trim");Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 106;BA.debugLine="If styleProp.EqualsIgnoreCase(strProp) = False";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_styleprop.runMethod(true,"equalsIgnoreCase",(Object)(_strprop)),vuehtml.__c.getField(true,"False"))) { 
 BA.debugLineNum = 107;BA.debugLine="Dim nLine As String = $\"${strProp}:${strValue}";
Debug.JustUpdateDeviceLine();
_nline = (RemoteObject.concat(RemoteObject.createImmutable(""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strprop))),RemoteObject.createImmutable(":"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strvalue))),RemoteObject.createImmutable("")));Debug.locals.put("nLine", _nline);Debug.locals.put("nLine", _nline);
 BA.debugLineNum = 108;BA.debugLine="nList.Add(nLine)";
Debug.JustUpdateDeviceLine();
_nlist.runVoidMethod ("Add",(Object)((_nline)));
 };
 }
}Debug.locals.put("strPropValue", _strpropvalue);
;
 BA.debugLineNum = 111;BA.debugLine="scontent = Join(\";\",nList)";
Debug.JustUpdateDeviceLine();
_scontent = __ref.runClassMethod (b4j.example.vuehtml.class, "_join" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_nlist));Debug.locals.put("scontent", _scontent);
 BA.debugLineNum = 112;BA.debugLine="CSSRule.Put(styleName,scontent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cssrule" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_stylename)),(Object)((_scontent)));
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removestyle(RemoteObject __ref,RemoteObject _stylename) throws Exception{
try {
		Debug.PushSubsStack("RemoveStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1660);
if (RapidSub.canDelegate("removestyle")) { return __ref.runUserSub(false, "vuehtml","removestyle", __ref, _stylename);}
RemoteObject _sitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strstyle = RemoteObject.createImmutable("");
Debug.locals.put("styleName", _stylename);
 BA.debugLineNum = 1660;BA.debugLine="public Sub RemoveStyle(styleName As String) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1661;BA.debugLine="styleName = styleName.Trim";
Debug.JustUpdateDeviceLine();
_stylename = _stylename.runMethod(true,"trim");Debug.locals.put("styleName", _stylename);
 BA.debugLineNum = 1662;BA.debugLine="styleName = styleName.tolowercase";
Debug.JustUpdateDeviceLine();
_stylename = _stylename.runMethod(true,"toLowerCase");Debug.locals.put("styleName", _stylename);
 BA.debugLineNum = 1663;BA.debugLine="styleName = styleName.Replace(\" \",\";\")";
Debug.JustUpdateDeviceLine();
_stylename = _stylename.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("styleName", _stylename);
 BA.debugLineNum = 1664;BA.debugLine="Dim sItems As List = StrParse(\";\",styleName)";
Debug.JustUpdateDeviceLine();
_sitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_sitems = __ref.runClassMethod (b4j.example.vuehtml.class, "_strparse" /*RemoteObject*/ ,(Object)(BA.ObjectToString(";")),(Object)(_stylename));Debug.locals.put("sItems", _sitems);Debug.locals.put("sItems", _sitems);
 BA.debugLineNum = 1665;BA.debugLine="For Each strStyle As String In sItems";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _sitems;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strstyle = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("strStyle", _strstyle);
Debug.locals.put("strStyle", _strstyle);
 BA.debugLineNum = 1666;BA.debugLine="strStyle = strStyle.trim";
Debug.JustUpdateDeviceLine();
_strstyle = _strstyle.runMethod(true,"trim");Debug.locals.put("strStyle", _strstyle);
 BA.debugLineNum = 1667;BA.debugLine="If Styles.ContainsKey(strStyle) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_strstyle))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1668;BA.debugLine="Styles.Remove(strStyle)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_styles" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_strstyle)));
 };
 }
}Debug.locals.put("strStyle", _strstyle);
;
 BA.debugLineNum = 1671;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1672;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAlt (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setalt")) { return __ref.runUserSub(false, "vuehtml","setalt", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 206;BA.debugLine="Sub SetAlt(a As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="SetAttr(\"alt\", a)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("alt")),(Object)(_a));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vuehtml","setattr", __ref, _attr, _val);}
Debug.locals.put("attr", _attr);
Debug.locals.put("val", _val);
 BA.debugLineNum = 464;BA.debugLine="Sub SetAttr(attr As String, val As String) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 465;BA.debugLine="AddAttribute(attr,val)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(_attr),(Object)((_val)));
 BA.debugLineNum = 466;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattraction(RemoteObject __ref,RemoteObject _stitle) throws Exception{
try {
		Debug.PushSubsStack("SetAttrACTION (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,978);
if (RapidSub.canDelegate("setattraction")) { return __ref.runUserSub(false, "vuehtml","setattraction", __ref, _stitle);}
Debug.locals.put("stitle", _stitle);
 BA.debugLineNum = 978;BA.debugLine="Sub SetAttrACTION(stitle As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 979;BA.debugLine="AddAttribute(\"action\", stitle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("action")),(Object)((_stitle)));
 BA.debugLineNum = 980;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 981;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattralt(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("SetAttrALT (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1399);
if (RapidSub.canDelegate("setattralt")) { return __ref.runUserSub(false, "vuehtml","setattralt", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1399;BA.debugLine="Sub SetAttrALT(sValue As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1400;BA.debugLine="AddAttribute(\"alt\",sValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("alt")),(Object)((_svalue)));
 BA.debugLineNum = 1401;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1402;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrautocomplete(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrAUTOCOMPLETE (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,984);
if (RapidSub.canDelegate("setattrautocomplete")) { return __ref.runUserSub(false, "vuehtml","setattrautocomplete", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 984;BA.debugLine="Sub SetAttrAUTOCOMPLETE(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 985;BA.debugLine="If b Then";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 986;BA.debugLine="AddAttribute(\"autocomplete\", \"on\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("autocomplete")),(Object)((RemoteObject.createImmutable("on"))));
 };
 BA.debugLineNum = 988;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 989;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrautocompleteoff(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrAutoCompleteOFF (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3096);
if (RapidSub.canDelegate("setattrautocompleteoff")) { return __ref.runUserSub(false, "vuehtml","setattrautocompleteoff", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 3096;BA.debugLine="Sub SetAttrAutoCompleteOFF(b As Boolean) As VueHTM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3097;BA.debugLine="SetAttr(\"autocomplete\", \"off\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("autocomplete")),(Object)(RemoteObject.createImmutable("off")));
 BA.debugLineNum = 3098;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 3099;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrautofocus(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrAUTOFOCUS (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,992);
if (RapidSub.canDelegate("setattrautofocus")) { return __ref.runUserSub(false, "vuehtml","setattrautofocus", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 992;BA.debugLine="Sub SetAttrAUTOFOCUS(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 993;BA.debugLine="If b Then AddLooseAttribute(\"autofocus\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vuehtml.class, "_addlooseattribute" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("autofocus")));};
 BA.debugLineNum = 994;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 995;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrcols(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("SetAttrCols (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1273);
if (RapidSub.canDelegate("setattrcols")) { return __ref.runUserSub(false, "vuehtml","setattrcols", __ref, _l);}
Debug.locals.put("l", _l);
 BA.debugLineNum = 1273;BA.debugLine="Sub SetAttrCols(l As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1274;BA.debugLine="AddAttribute(\"cols\",l)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cols")),(Object)((_l)));
 BA.debugLineNum = 1275;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1276;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrcss(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetAttrCSS (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,844);
if (RapidSub.canDelegate("setattrcss")) { return __ref.runUserSub(false, "vuehtml","setattrcss", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 844;BA.debugLine="Sub SetAttrCSS(w As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 845;BA.debugLine="AddAttribute(\"css\", w)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("css")),(Object)(_w));
 BA.debugLineNum = 846;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 847;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrdata(RemoteObject __ref,RemoteObject _prop,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetAttrData (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1723);
if (RapidSub.canDelegate("setattrdata")) { return __ref.runUserSub(false, "vuehtml","setattrdata", __ref, _prop, _value);}
RemoteObject _sw = RemoteObject.createImmutable(false);
Debug.locals.put("prop", _prop);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1723;BA.debugLine="Sub SetAttrData(prop As String, value As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1724;BA.debugLine="Dim sw As Boolean = prop.StartsWith(\"data-\")";
Debug.JustUpdateDeviceLine();
_sw = _prop.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("data-")));Debug.locals.put("sw", _sw);Debug.locals.put("sw", _sw);
 BA.debugLineNum = 1725;BA.debugLine="If sw Then";
Debug.JustUpdateDeviceLine();
if (_sw.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1726;BA.debugLine="AddAttribute(prop,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(_prop),(Object)((_value)));
 }else {
 BA.debugLineNum = 1728;BA.debugLine="AddAttribute(\"data-\" & prop,value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("data-"),_prop)),(Object)((_value)));
 };
 BA.debugLineNum = 1730;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1731;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrDisabled (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,573);
if (RapidSub.canDelegate("setattrdisabled")) { return __ref.runUserSub(false, "vuehtml","setattrdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 573;BA.debugLine="Sub SetAttrDisabled(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 574;BA.debugLine="If b Then AddLooseAttribute(\"disabled\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vuehtml.class, "_addlooseattribute" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("disabled")));};
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
public static RemoteObject  _setattrfor(RemoteObject __ref,RemoteObject _sfor) throws Exception{
try {
		Debug.PushSubsStack("SetAttrFOR (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1232);
if (RapidSub.canDelegate("setattrfor")) { return __ref.runUserSub(false, "vuehtml","setattrfor", __ref, _sfor);}
Debug.locals.put("sFor", _sfor);
 BA.debugLineNum = 1232;BA.debugLine="Sub SetAttrFOR(sFor As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1233;BA.debugLine="AddAttribute(\"for\",sFor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("for")),(Object)((_sfor)));
 BA.debugLineNum = 1234;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetAttrHeight (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,850);
if (RapidSub.canDelegate("setattrheight")) { return __ref.runUserSub(false, "vuehtml","setattrheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 850;BA.debugLine="Sub SetAttrHeight(h As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 851;BA.debugLine="AddAttribute(\"height\", h)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("height")),(Object)((_h)));
 BA.debugLineNum = 852;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 853;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrhref(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetAttrHREF (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1453);
if (RapidSub.canDelegate("setattrhref")) { return __ref.runUserSub(false, "vuehtml","setattrhref", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1453;BA.debugLine="Sub SetAttrHREF(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1454;BA.debugLine="AddAttribute(\"href\",value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("href")),(Object)((_value)));
 BA.debugLineNum = 1455;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1456;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattributes(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttributes (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("setattributes")) { return __ref.runUserSub(false, "vuehtml","setattributes", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 394;BA.debugLine="Sub SetAttributes(m As Map) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 395;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 396;BA.debugLine="Dim v As String = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 397;BA.debugLine="SetAttr(k,v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(_k),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 399;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrlabel(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("SetAttrLabel (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1261);
if (RapidSub.canDelegate("setattrlabel")) { return __ref.runUserSub(false, "vuehtml","setattrlabel", __ref, _l);}
Debug.locals.put("l", _l);
 BA.debugLineNum = 1261;BA.debugLine="Sub SetAttrLabel(l As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1262;BA.debugLine="AddAttribute(\"label\",l)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("label")),(Object)((_l)));
 BA.debugLineNum = 1263;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1264;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrloose(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetAttrLoose (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1675);
if (RapidSub.canDelegate("setattrloose")) { return __ref.runUserSub(false, "vuehtml","setattrloose", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1675;BA.debugLine="Sub SetAttrLoose(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1676;BA.debugLine="AddLooseAttribute(value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addlooseattribute" /*RemoteObject*/ ,(Object)(_value));
 BA.debugLineNum = 1677;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1678;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrmax(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttrMax (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1544);
if (RapidSub.canDelegate("setattrmax")) { return __ref.runUserSub(false, "vuehtml","setattrmax", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 1544;BA.debugLine="Sub SetAttrMax(m As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1545;BA.debugLine="SetAttr(\"max\", m)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("max")),(Object)(BA.ObjectToString(_m)));
 BA.debugLineNum = 1546;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1547;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrmaxheight(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttrMaxHeight (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1579);
if (RapidSub.canDelegate("setattrmaxheight")) { return __ref.runUserSub(false, "vuehtml","setattrmaxheight", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 1579;BA.debugLine="Sub SetAttrMaxHeight(m As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1580;BA.debugLine="SetAttr(\"mnax-height\", MakePx(m))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("mnax-height")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m)))));
 BA.debugLineNum = 1581;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1582;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrmaxwidth(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttrMaxWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1572);
if (RapidSub.canDelegate("setattrmaxwidth")) { return __ref.runUserSub(false, "vuehtml","setattrmaxwidth", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 1572;BA.debugLine="Sub SetAttrMaxWidth(m As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1573;BA.debugLine="SetAttr(\"max-width\", MakePx(m))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("max-width")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m)))));
 BA.debugLineNum = 1574;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1575;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrmethod(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("SetAttrMETHOD (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1109);
if (RapidSub.canDelegate("setattrmethod")) { return __ref.runUserSub(false, "vuehtml","setattrmethod", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1109;BA.debugLine="Sub SetAttrMETHOD(sValue As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1110;BA.debugLine="AddAttribute(\"method\",sValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("method")),(Object)((_svalue)));
 BA.debugLineNum = 1111;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrmin(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttrMin (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1551);
if (RapidSub.canDelegate("setattrmin")) { return __ref.runUserSub(false, "vuehtml","setattrmin", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 1551;BA.debugLine="Sub SetAttrMin(m As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1552;BA.debugLine="SetAttr(\"min\", MakePx(m))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("min")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m)))));
 BA.debugLineNum = 1553;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1554;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrminheight(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttrMinHeight (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1565);
if (RapidSub.canDelegate("setattrminheight")) { return __ref.runUserSub(false, "vuehtml","setattrminheight", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 1565;BA.debugLine="Sub SetAttrMinHeight(m As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1566;BA.debugLine="SetAttr(\"min-height\", MakePx(m))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("min-height")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m)))));
 BA.debugLineNum = 1567;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1568;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrminwidth(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttrMinWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1558);
if (RapidSub.canDelegate("setattrminwidth")) { return __ref.runUserSub(false, "vuehtml","setattrminwidth", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 1558;BA.debugLine="Sub SetAttrMinWidth(m As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1559;BA.debugLine="SetAttr(\"min-width\", MakePx(m))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("min-width")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_m)))));
 BA.debugLineNum = 1560;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1561;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrname(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("SetAttrNAME (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1244);
if (RapidSub.canDelegate("setattrname")) { return __ref.runUserSub(false, "vuehtml","setattrname", __ref, _sname);}
Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1244;BA.debugLine="Sub SetAttrNAME(sName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1245;BA.debugLine="AddAttribute(\"name\",sName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("name")),(Object)((_sname)));
 BA.debugLineNum = 1246;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1247;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrplaceholder(RemoteObject __ref,RemoteObject _splaceholder) throws Exception{
try {
		Debug.PushSubsStack("SetAttrPlaceHolder (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,966);
if (RapidSub.canDelegate("setattrplaceholder")) { return __ref.runUserSub(false, "vuehtml","setattrplaceholder", __ref, _splaceholder);}
Debug.locals.put("sPlaceholder", _splaceholder);
 BA.debugLineNum = 966;BA.debugLine="Sub SetAttrPlaceHolder(sPlaceholder As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 967;BA.debugLine="AddAttribute(\"placeholder\",sPlaceholder)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("placeholder")),(Object)((_splaceholder)));
 BA.debugLineNum = 968;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 969;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrrel(RemoteObject __ref,RemoteObject _rel) throws Exception{
try {
		Debug.PushSubsStack("SetAttrREL (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,999);
if (RapidSub.canDelegate("setattrrel")) { return __ref.runUserSub(false, "vuehtml","setattrrel", __ref, _rel);}
Debug.locals.put("rel", _rel);
 BA.debugLineNum = 999;BA.debugLine="Sub SetAttrREL(rel As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1000;BA.debugLine="AddAttribute(\"rel\", rel)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("rel")),(Object)((_rel)));
 BA.debugLineNum = 1001;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1002;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrrole(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("SetAttrROLE (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1104);
if (RapidSub.canDelegate("setattrrole")) { return __ref.runUserSub(false, "vuehtml","setattrrole", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1104;BA.debugLine="Sub SetAttrROLE(sValue As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1105;BA.debugLine="AddAttribute(\"role\",sValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("role")),(Object)((_svalue)));
 BA.debugLineNum = 1106;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1107;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrrolebutton(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrRoleButton (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("setattrrolebutton")) { return __ref.runUserSub(false, "vuehtml","setattrrolebutton", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 470;BA.debugLine="Sub SetAttrRoleButton(b As Boolean) As VueHTML   '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 471;BA.debugLine="SetAttrROLE(\"button\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattrrole" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("button")));
 BA.debugLineNum = 472;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrrows(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("SetAttrRows (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1267);
if (RapidSub.canDelegate("setattrrows")) { return __ref.runUserSub(false, "vuehtml","setattrrows", __ref, _l);}
Debug.locals.put("l", _l);
 BA.debugLineNum = 1267;BA.debugLine="Sub SetAttrRows(l As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1268;BA.debugLine="AddAttribute(\"rows\",l)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("rows")),(Object)((_l)));
 BA.debugLineNum = 1269;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1270;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrrowspan(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("SetAttrROWSPAN (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1279);
if (RapidSub.canDelegate("setattrrowspan")) { return __ref.runUserSub(false, "vuehtml","setattrrowspan", __ref, _sname);}
Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1279;BA.debugLine="Sub SetAttrROWSPAN(sName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1280;BA.debugLine="AddAttribute(\"rowspan\",sName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("rowspan")),(Object)((_sname)));
 BA.debugLineNum = 1281;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1282;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrsrc(RemoteObject __ref,RemoteObject _svalue,RemoteObject _static) throws Exception{
try {
		Debug.PushSubsStack("SetAttrSRC (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1387);
if (RapidSub.canDelegate("setattrsrc")) { return __ref.runUserSub(false, "vuehtml","setattrsrc", __ref, _svalue, _static);}
RemoteObject _tmpfile = RemoteObject.createImmutable("");
Debug.locals.put("sValue", _svalue);
Debug.locals.put("Static", _static);
 BA.debugLineNum = 1387;BA.debugLine="Sub SetAttrSRC(sValue As String, Static As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1388;BA.debugLine="Dim tmpFile As String = MvField(sValue,1,\"?\")";
Debug.JustUpdateDeviceLine();
_tmpfile = __ref.runClassMethod (b4j.example.vuehtml.class, "_mvfield" /*RemoteObject*/ ,(Object)(_svalue),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable("?")));Debug.locals.put("tmpFile", _tmpfile);Debug.locals.put("tmpFile", _tmpfile);
 BA.debugLineNum = 1389;BA.debugLine="If Static Then";
Debug.JustUpdateDeviceLine();
if (_static.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1390;BA.debugLine="sValue = tmpFile";
Debug.JustUpdateDeviceLine();
_svalue = _tmpfile;Debug.locals.put("sValue", _svalue);
 }else {
 BA.debugLineNum = 1392;BA.debugLine="sValue = tmpFile & \"?\" & DateTime.now";
Debug.JustUpdateDeviceLine();
_svalue = RemoteObject.concat(_tmpfile,RemoteObject.createImmutable("?"),vuehtml.__c.getField(false,"DateTime").runMethod(true,"getNow"));Debug.locals.put("sValue", _svalue);
 };
 BA.debugLineNum = 1394;BA.debugLine="AddAttribute(\"src\",sValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("src")),(Object)((_svalue)));
 BA.debugLineNum = 1395;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrsummary(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("SetAttrSUMMARY (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1249);
if (RapidSub.canDelegate("setattrsummary")) { return __ref.runUserSub(false, "vuehtml","setattrsummary", __ref, _sname);}
Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1249;BA.debugLine="Sub SetAttrSUMMARY(sName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1250;BA.debugLine="AddAttribute(\"summary\",sName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("summary")),(Object)((_sname)));
 BA.debugLineNum = 1251;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1252;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtabindex(RemoteObject __ref,RemoteObject _tbi) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTabIndex (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,3101);
if (RapidSub.canDelegate("setattrtabindex")) { return __ref.runUserSub(false, "vuehtml","setattrtabindex", __ref, _tbi);}
Debug.locals.put("tbi", _tbi);
 BA.debugLineNum = 3101;BA.debugLine="Sub SetAttrTabIndex(tbi As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 3102;BA.debugLine="SetAttr(\"tabindex\", tbi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("tabindex")),(Object)(_tbi));
 BA.debugLineNum = 3103;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 3104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtarget(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTARGET (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1025);
if (RapidSub.canDelegate("setattrtarget")) { return __ref.runUserSub(false, "vuehtml","setattrtarget", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1025;BA.debugLine="Sub SetAttrTARGET(sValue As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1026;BA.debugLine="If sValue.Trim = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue.runMethod(true,"trim"),BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 1027;BA.debugLine="AddAttribute(\"target\",sValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("target")),(Object)((_svalue)));
 BA.debugLineNum = 1028;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1029;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtargetblank(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTargetBlank (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1031);
if (RapidSub.canDelegate("setattrtargetblank")) { return __ref.runUserSub(false, "vuehtml","setattrtargetblank", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 1031;BA.debugLine="Sub SetAttrTargetBlank(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1032;BA.debugLine="SetAttrTARGET(\"_blank\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("_blank")));
 BA.debugLineNum = 1033;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1034;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtargetparent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTargetParent (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1041);
if (RapidSub.canDelegate("setattrtargetparent")) { return __ref.runUserSub(false, "vuehtml","setattrtargetparent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 1041;BA.debugLine="Sub SetAttrTargetParent(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1042;BA.debugLine="SetAttrTARGET(\"_parent\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("_parent")));
 BA.debugLineNum = 1043;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtargetself(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTargetSelf (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1036);
if (RapidSub.canDelegate("setattrtargetself")) { return __ref.runUserSub(false, "vuehtml","setattrtargetself", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 1036;BA.debugLine="Sub SetAttrTargetSelf(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1037;BA.debugLine="SetAttrTARGET(\"_self\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("_self")));
 BA.debugLineNum = 1038;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1039;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtargettop(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTargetTop (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1046);
if (RapidSub.canDelegate("setattrtargettop")) { return __ref.runUserSub(false, "vuehtml","setattrtargettop", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 1046;BA.debugLine="Sub SetAttrTargetTop(b As Boolean) As VueHTML    '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1047;BA.debugLine="SetAttrTARGET(\"_top\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("_top")));
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
public static RemoteObject  _setattrtitle(RemoteObject __ref,RemoteObject _stitle) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTITLE (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,972);
if (RapidSub.canDelegate("setattrtitle")) { return __ref.runUserSub(false, "vuehtml","setattrtitle", __ref, _stitle);}
Debug.locals.put("stitle", _stitle);
 BA.debugLineNum = 972;BA.debugLine="Sub SetAttrTITLE(stitle As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 973;BA.debugLine="AddAttribute(\"title\", stitle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("title")),(Object)((_stitle)));
 BA.debugLineNum = 974;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 975;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtype(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTYPE (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1284);
if (RapidSub.canDelegate("setattrtype")) { return __ref.runUserSub(false, "vuehtml","setattrtype", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1284;BA.debugLine="Sub SetAttrTYPE(sValue As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1285;BA.debugLine="AddAttribute(\"type\",sValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("type")),(Object)((_svalue)));
 BA.debugLineNum = 1286;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtypelowercase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTypeLowerCase (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1133);
if (RapidSub.canDelegate("setattrtypelowercase")) { return __ref.runUserSub(false, "vuehtml","setattrtypelowercase", __ref);}
 BA.debugLineNum = 1133;BA.debugLine="Sub SetAttrTypeLowerCase() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1134;BA.debugLine="AddAttribute(\"type\",\"a\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("type")),(Object)((RemoteObject.createImmutable("a"))));
 BA.debugLineNum = 1135;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtypelowercaseroman(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTypeLowerCaseRoman (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1143);
if (RapidSub.canDelegate("setattrtypelowercaseroman")) { return __ref.runUserSub(false, "vuehtml","setattrtypelowercaseroman", __ref);}
 BA.debugLineNum = 1143;BA.debugLine="Sub SetAttrTypeLowerCaseRoman() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1144;BA.debugLine="AddAttribute(\"type\",\"i\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("type")),(Object)((RemoteObject.createImmutable("i"))));
 BA.debugLineNum = 1145;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1146;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtypenumbers(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTypeNumbers (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1123);
if (RapidSub.canDelegate("setattrtypenumbers")) { return __ref.runUserSub(false, "vuehtml","setattrtypenumbers", __ref);}
 BA.debugLineNum = 1123;BA.debugLine="Sub SetAttrTypeNumbers() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1124;BA.debugLine="AddAttribute(\"type\",\"1\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("type")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 1125;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtypeuppercase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTypeUpperCase (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1128);
if (RapidSub.canDelegate("setattrtypeuppercase")) { return __ref.runUserSub(false, "vuehtml","setattrtypeuppercase", __ref);}
 BA.debugLineNum = 1128;BA.debugLine="Sub SetAttrTypeUpperCase() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1129;BA.debugLine="AddAttribute(\"type\",\"A\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("type")),(Object)((RemoteObject.createImmutable("A"))));
 BA.debugLineNum = 1130;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrtypeuppercaseroman(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAttrTypeUpperCaseRoman (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1138);
if (RapidSub.canDelegate("setattrtypeuppercaseroman")) { return __ref.runUserSub(false, "vuehtml","setattrtypeuppercaseroman", __ref);}
 BA.debugLineNum = 1138;BA.debugLine="Sub SetAttrTypeUpperCaseRoman() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1139;BA.debugLine="AddAttribute(\"type\",\"I\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("type")),(Object)((RemoteObject.createImmutable("I"))));
 BA.debugLineNum = 1140;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrvalue(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("SetAttrVALUE (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1238);
if (RapidSub.canDelegate("setattrvalue")) { return __ref.runUserSub(false, "vuehtml","setattrvalue", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1238;BA.debugLine="Sub SetAttrVALUE(sValue As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1239;BA.debugLine="AddAttribute(\"value\",sValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("value")),(Object)((_svalue)));
 BA.debugLineNum = 1240;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetAttrWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,838);
if (RapidSub.canDelegate("setattrwidth")) { return __ref.runUserSub(false, "vuehtml","setattrwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 838;BA.debugLine="Sub SetAttrWidth(w As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 839;BA.debugLine="AddAttribute(\"width\", w)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("width")),(Object)(_w));
 BA.debugLineNum = 840;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 841;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBackgroundColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "vuehtml","setbackgroundcolor", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 188;BA.debugLine="Sub SetBackgroundColor(p As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="SetStyleMulti(CreateMap(\"background-color\":p))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstylemulti" /*RemoteObject*/ ,(Object)(vuehtml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("background-color")),_p}))));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _width,RemoteObject _color,RemoteObject _bstyle) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,812);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vuehtml","setborder", __ref, _width, _color, _bstyle);}
Debug.locals.put("width", _width);
Debug.locals.put("color", _color);
Debug.locals.put("bstyle", _bstyle);
 BA.debugLineNum = 812;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 813;BA.debugLine="SetStyle(\"border-style\", bstyle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(_bstyle));
 BA.debugLineNum = 814;BA.debugLine="SetStyle(\"border-width\", width)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-width")),(Object)(_width));
 BA.debugLineNum = 815;BA.debugLine="SetStyle(\"border-color\", color)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-color")),(Object)(_color));
 BA.debugLineNum = 816;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 817;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcite(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetCite (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2601);
if (RapidSub.canDelegate("setcite")) { return __ref.runUserSub(false, "vuehtml","setcite", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 2601;BA.debugLine="Sub SetCite(c As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2602;BA.debugLine="AddAttribute(\"cite\", c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cite")),(Object)(_c));
 BA.debugLineNum = 2603;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2604;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetClass (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,438);
if (RapidSub.canDelegate("setclass")) { return __ref.runUserSub(false, "vuehtml","setclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 438;BA.debugLine="Sub SetClass(c As Object) As VueHTML   'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 439;BA.debugLine="AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_c)));
 BA.debugLineNum = 440;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 441;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclasscenter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetClassCenter (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1068);
if (RapidSub.canDelegate("setclasscenter")) { return __ref.runUserSub(false, "vuehtml","setclasscenter", __ref);}
 BA.debugLineNum = 1068;BA.debugLine="Sub SetClassCenter As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1069;BA.debugLine="AddClass(\"center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("center")));
 BA.debugLineNum = 1070;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1071;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclasses(RemoteObject __ref,RemoteObject _clslist) throws Exception{
try {
		Debug.PushSubsStack("SetClasses (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,378);
if (RapidSub.canDelegate("setclasses")) { return __ref.runUserSub(false, "vuehtml","setclasses", __ref, _clslist);}
RemoteObject _c = RemoteObject.createImmutable("");
Debug.locals.put("clsList", _clslist);
 BA.debugLineNum = 378;BA.debugLine="Sub SetClasses(clsList As List) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 379;BA.debugLine="For Each c As String In clsList";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _clslist;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 380;BA.debugLine="AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 382;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclassrow(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetClassRow (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,458);
if (RapidSub.canDelegate("setclassrow")) { return __ref.runUserSub(false, "vuehtml","setclassrow", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 458;BA.debugLine="Sub SetClassRow(b As Boolean) As VueHTML   'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 459;BA.debugLine="AddClass(\"row\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("row")));
 BA.debugLineNum = 460;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 461;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclasssection(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetClassSection (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,444);
if (RapidSub.canDelegate("setclasssection")) { return __ref.runUserSub(false, "vuehtml","setclasssection", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 444;BA.debugLine="Sub SetClassSection(b As Boolean) As VueHTML   'ig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 445;BA.debugLine="AddClass(\"section\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("section")));
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
public static RemoteObject  _setcode(RemoteObject __ref,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("SetCode (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1515);
if (RapidSub.canDelegate("setcode")) { return __ref.runUserSub(false, "vuehtml","setcode", __ref, _stext);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 1515;BA.debugLine="Sub SetCode(sText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1516;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 1517;BA.debugLine="s = CreateCode(\"\").SetText(sText)";
Debug.JustUpdateDeviceLine();
_s = __ref.runClassMethod (b4j.example.vuehtml.class, "_createcode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_stext));Debug.locals.put("s", _s);
 BA.debugLineNum = 1518;BA.debugLine="AddElement(s)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_s));
 BA.debugLineNum = 1519;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1520;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "vuehtml","setcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 175;BA.debugLine="Sub SetColor(c As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="SetAttr(\"color\", c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("color")),(Object)(BA.ObjectToString(_c)));
 BA.debugLineNum = 177;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolspan(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("SetCOLSPAN (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1255);
if (RapidSub.canDelegate("setcolspan")) { return __ref.runUserSub(false, "vuehtml","setcolspan", __ref, _sname);}
Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1255;BA.debugLine="Sub SetCOLSPAN(sName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1256;BA.debugLine="AddAttribute(\"colspan\",sName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("colspan")),(Object)((_sname)));
 BA.debugLineNum = 1257;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1258;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcontents(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetContents (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1086);
if (RapidSub.canDelegate("setcontents")) { return __ref.runUserSub(false, "vuehtml","setcontents", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1086;BA.debugLine="public Sub SetContents(value As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1087;BA.debugLine="Contents.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1088;BA.debugLine="Contents.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1089;BA.debugLine="If value.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_value.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1090;BA.debugLine="AddContent(value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_value));
 };
 BA.debugLineNum = 1092;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1093;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetCursorMove (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,820);
if (RapidSub.canDelegate("setcursormove")) { return __ref.runUserSub(false, "vuehtml","setcursormove", __ref);}
 BA.debugLineNum = 820;BA.debugLine="Sub SetCursorMove As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 821;BA.debugLine="SetStyle(\"cursor\", \"move\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cursor")),(Object)(RemoteObject.createImmutable("move")));
 BA.debugLineNum = 822;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 823;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetCursorPointer (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,806);
if (RapidSub.canDelegate("setcursorpointer")) { return __ref.runUserSub(false, "vuehtml","setcursorpointer", __ref);}
 BA.debugLineNum = 806;BA.debugLine="Sub SetCursorPointer As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 807;BA.debugLine="SetStyle(\"cursor\", \"pointer\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cursor")),(Object)(RemoteObject.createImmutable("pointer")));
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
public static RemoteObject  _setdata(RemoteObject __ref,RemoteObject _dsx) throws Exception{
try {
		Debug.PushSubsStack("SetData (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("setdata")) { return __ref.runUserSub(false, "vuehtml","setdata", __ref, _dsx);}
Debug.locals.put("dsx", _dsx);
 BA.debugLineNum = 219;BA.debugLine="Sub SetData(dsx As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 220;BA.debugLine="ds = dsx";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ds" /*RemoteObject*/ ,BA.ObjectToString(_dsx));
 BA.debugLineNum = 221;BA.debugLine="SetVFor(\"row\", dsx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("row")),(Object)(BA.ObjectToString(_dsx)));
 BA.debugLineNum = 222;BA.debugLine="SetKey(\"id\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setkey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 223;BA.debugLine="SetValue(\"value\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setvalue" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("value"))));
 BA.debugLineNum = 224;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 225;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDraggable (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("setdraggable")) { return __ref.runUserSub(false, "vuehtml","setdraggable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 239;BA.debugLine="Sub SetDraggable(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 240;BA.debugLine="SetAttr(\":draggable\",b)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":draggable")),(Object)(BA.ObjectToString(_b)));
 BA.debugLineNum = 241;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 242;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDroppable (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setdroppable")) { return __ref.runUserSub(false, "vuehtml","setdroppable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 244;BA.debugLine="Sub SetDroppable(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="SetAttr(\":droppable\",b)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":droppable")),(Object)(BA.ObjectToString(_b)));
 BA.debugLineNum = 246;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelementtypeoncondition(RemoteObject __ref,RemoteObject _bstatus,RemoteObject _selementtype) throws Exception{
try {
		Debug.PushSubsStack("SetElementTypeOnCondition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1203);
if (RapidSub.canDelegate("setelementtypeoncondition")) { return __ref.runUserSub(false, "vuehtml","setelementtypeoncondition", __ref, _bstatus, _selementtype);}
Debug.locals.put("bStatus", _bstatus);
Debug.locals.put("sElementType", _selementtype);
 BA.debugLineNum = 1203;BA.debugLine="Sub SetElementTypeOnCondition(bStatus As Boolean,s";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1204;BA.debugLine="If bStatus Then";
Debug.JustUpdateDeviceLine();
if (_bstatus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1205;BA.debugLine="Tag = sElementType";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,_selementtype);
 };
 BA.debugLineNum = 1207;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1208;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetExact (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("setexact")) { return __ref.runUserSub(false, "vuehtml","setexact", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 250;BA.debugLine="Sub SetExact(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 251;BA.debugLine="If b Then SetAttr(\"exact\", b)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("exact")),(Object)(BA.ObjectToString(_b)));};
 BA.debugLineNum = 252;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinline(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetInline (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,372);
if (RapidSub.canDelegate("setinline")) { return __ref.runUserSub(false, "vuehtml","setinline", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 372;BA.debugLine="Sub SetInline(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 373;BA.debugLine="SetStyleMulti(CreateMap(\"display\":\"inline-flex\",\"";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstylemulti" /*RemoteObject*/ ,(Object)(vuehtml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("display")),RemoteObject.createImmutable(("inline-flex")),RemoteObject.createImmutable(("margin-right")),(RemoteObject.createImmutable("10px"))}))));
 BA.debugLineNum = 374;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 375;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetKey (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vuehtml","setkey", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 267;BA.debugLine="Sub SetKey(k As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 268;BA.debugLine="SetAttr(\":key\", k)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":key")),(Object)(_k));
 BA.debugLineNum = 269;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 270;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMethodPost (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1227);
if (RapidSub.canDelegate("setmethodpost")) { return __ref.runUserSub(false, "vuehtml","setmethodpost", __ref);}
 BA.debugLineNum = 1227;BA.debugLine="Sub SetMethodPost As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1228;BA.debugLine="AddAttribute(\"method\",\"POST\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addattribute" /*RemoteObject*/ ,(Object)(BA.ObjectToString("method")),(Object)((RemoteObject.createImmutable("POST"))));
 BA.debugLineNum = 1229;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1230;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnBlur (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1969);
if (RapidSub.canDelegate("setonblur")) { return __ref.runUserSub(false, "vuehtml","setonblur", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1969;BA.debugLine="Sub SetOnBlur(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1970;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1971;BA.debugLine="SetAttr(\"v-on:blur\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:blur")),(Object)(_methodname));
 BA.debugLineNum = 1972;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1973;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnClick (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1977);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vuehtml","setonclick", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1977;BA.debugLine="Sub SetOnClick(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1978;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1979;BA.debugLine="SetAttr(\"v-on:click\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:click")),(Object)(_methodname));
 BA.debugLineNum = 1980;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1981;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondblclick(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDblClick (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1896);
if (RapidSub.canDelegate("setondblclick")) { return __ref.runUserSub(false, "vuehtml","setondblclick", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1896;BA.debugLine="Sub SetOnDblClick(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1897;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1898;BA.debugLine="SetAttr(\"v-on:dblclick\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:dblclick")),(Object)(_methodname));
 BA.debugLineNum = 1899;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1900;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnFocus (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1963);
if (RapidSub.canDelegate("setonfocus")) { return __ref.runUserSub(false, "vuehtml","setonfocus", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1963;BA.debugLine="Sub SetOnFocus(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1964;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1965;BA.debugLine="SetAttr(\"v-on:focus\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:focus")),(Object)(_methodname));
 BA.debugLineNum = 1966;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1967;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnInput (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1957);
if (RapidSub.canDelegate("setoninput")) { return __ref.runUserSub(false, "vuehtml","setoninput", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1957;BA.debugLine="Sub SetOnInput(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1958;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1959;BA.debugLine="SetAttr(\"v-on:input\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:input")),(Object)(_methodname));
 BA.debugLineNum = 1960;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1961;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonkeydown(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnKeyDown (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1945);
if (RapidSub.canDelegate("setonkeydown")) { return __ref.runUserSub(false, "vuehtml","setonkeydown", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1945;BA.debugLine="Sub SetOnKeyDown(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1946;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1947;BA.debugLine="SetAttr(\"v-on:keydown\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:keydown")),(Object)(_methodname));
 BA.debugLineNum = 1948;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1949;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonkeyup(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnKeyUp (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1951);
if (RapidSub.canDelegate("setonkeyup")) { return __ref.runUserSub(false, "vuehtml","setonkeyup", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1951;BA.debugLine="Sub SetOnKeyUp(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1952;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1953;BA.debugLine="SetAttr(\"v-on:keyup\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:keyup")),(Object)(_methodname));
 BA.debugLineNum = 1954;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1955;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnMouseOut (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setonmouseout")) { return __ref.runUserSub(false, "vuehtml","setonmouseout", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 126;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 128;BA.debugLine="SetAttr(\"v-on:mouseout\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:mouseout")),(Object)(_methodname));
 BA.debugLineNum = 129;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnMouseOver (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("setonmouseover")) { return __ref.runUserSub(false, "vuehtml","setonmouseover", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 132;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VueHTM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 134;BA.debugLine="SetAttr(\"v-on:mouseover\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:mouseover")),(Object)(_methodname));
 BA.debugLineNum = 135;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonsubmit(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnSubmit (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1939);
if (RapidSub.canDelegate("setonsubmit")) { return __ref.runUserSub(false, "vuehtml","setonsubmit", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1939;BA.debugLine="Sub SetOnSubmit(methodName As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1940;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1941;BA.debugLine="SetAttr(\"v-on:submit\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:submit")),(Object)(_methodname));
 BA.debugLineNum = 1942;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1943;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnTouchStart (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1983);
if (RapidSub.canDelegate("setontouchstart")) { return __ref.runUserSub(false, "vuehtml","setontouchstart", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1983;BA.debugLine="Sub SetOnTouchStart(methodName As String) As VueHT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1984;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1985;BA.debugLine="SetAttr(\"v-on:touchstart\", methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:touchstart")),(Object)(_methodname));
 BA.debugLineNum = 1986;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1987;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vuehtml","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 181;BA.debugLine="Sub SetPadding(p As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 182;BA.debugLine="SetStyleMulti(CreateMap(\"padding\":p))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstylemulti" /*RemoteObject*/ ,(Object)(vuehtml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("padding")),_p}))));
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
public static RemoteObject  _setparentid(RemoteObject __ref,RemoteObject _sparentid) throws Exception{
try {
		Debug.PushSubsStack("SetParentID (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2291);
if (RapidSub.canDelegate("setparentid")) { return __ref.runUserSub(false, "vuehtml","setparentid", __ref, _sparentid);}
Debug.locals.put("sParentID", _sparentid);
 BA.debugLineNum = 2291;BA.debugLine="Sub SetParentID(sParentID As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2292;BA.debugLine="ParentID = sParentID";
Debug.JustUpdateDeviceLine();
__ref.setField ("_parentid" /*RemoteObject*/ ,_sparentid);
 BA.debugLineNum = 2293;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2294;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPointer (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setpointer")) { return __ref.runUserSub(false, "vuehtml","setpointer", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 145;BA.debugLine="Sub SetPointer(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="SetStyle(\"cursor\",\"pointer\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cursor")),(Object)(RemoteObject.createImmutable("pointer")));
 BA.debugLineNum = 147;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprefix(RemoteObject __ref,RemoteObject _sprefix) throws Exception{
try {
		Debug.PushSubsStack("SetPrefix (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1529);
if (RapidSub.canDelegate("setprefix")) { return __ref.runUserSub(false, "vuehtml","setprefix", __ref, _sprefix);}
Debug.locals.put("sPrefix", _sprefix);
 BA.debugLineNum = 1529;BA.debugLine="Sub SetPrefix(sPrefix As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1530;BA.debugLine="Prefix = sPrefix";
Debug.JustUpdateDeviceLine();
__ref.setField ("_prefix" /*RemoteObject*/ ,_sprefix);
 BA.debugLineNum = 1531;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1532;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setref(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("SetRef (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("setref")) { return __ref.runUserSub(false, "vuehtml","setref", __ref, _r);}
Debug.locals.put("r", _r);
 BA.debugLineNum = 212;BA.debugLine="Sub SetRef(r As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 213;BA.debugLine="If r = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 214;BA.debugLine="SetAttr(\"ref\", r)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ref")),(Object)(_r));
 BA.debugLineNum = 215;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setslot(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("SetSlot (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,421);
if (RapidSub.canDelegate("setslot")) { return __ref.runUserSub(false, "vuehtml","setslot", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 421;BA.debugLine="Sub SetSlot(s As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 422;BA.debugLine="SetAttr(\"slot\", s)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("slot")),(Object)(BA.ObjectToString(_s)));
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
public static RemoteObject  _setspan(RemoteObject __ref,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("SetSpan (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,412);
if (RapidSub.canDelegate("setspan")) { return __ref.runUserSub(false, "vuehtml","setspan", __ref, _stext);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 412;BA.debugLine="Sub SetSpan(sText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 413;BA.debugLine="Dim s As VueHTML";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("s", _s);
 BA.debugLineNum = 414;BA.debugLine="s = CreateSpan(\"\").SetText(sText)";
Debug.JustUpdateDeviceLine();
_s = __ref.runClassMethod (b4j.example.vuehtml.class, "_createspan" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_stext));Debug.locals.put("s", _s);
 BA.debugLineNum = 415;BA.debugLine="AddElement(s)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_s));
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
public static RemoteObject  _setsrc(RemoteObject __ref,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetSrc (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("setsrc")) { return __ref.runUserSub(false, "vuehtml","setsrc", __ref, _bind);}
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 201;BA.debugLine="Sub SetSrc(bind As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 202;BA.debugLine="SetAttr(\":src\", bind)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":src")),(Object)(_bind));
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
public static RemoteObject  _setstateonclick(RemoteObject __ref,RemoteObject _ns) throws Exception{
try {
		Debug.PushSubsStack("SetStateOnClick (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,426);
if (RapidSub.canDelegate("setstateonclick")) { return __ref.runUserSub(false, "vuehtml","setstateonclick", __ref, _ns);}
Debug.locals.put("ns", _ns);
 BA.debugLineNum = 426;BA.debugLine="Sub SetStateOnClick(ns As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 427;BA.debugLine="SetAttr(\"v-on:click\", ns)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on:click")),(Object)(BA.ObjectToString(_ns)));
 BA.debugLineNum = 428;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,832);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vuehtml","setstyle", __ref, _prop, _val);}
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 832;BA.debugLine="Sub SetStyle(prop As String, val As String) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 833;BA.debugLine="AddStyleAttribute(prop,val)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addstyleattribute" /*RemoteObject*/ ,(Object)(_prop),(Object)((_val)));
 BA.debugLineNum = 834;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 835;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebackgroundattachment(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBackgroundAttachment (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,905);
if (RapidSub.canDelegate("setstylebackgroundattachment")) { return __ref.runUserSub(false, "vuehtml","setstylebackgroundattachment", __ref, _r);}
Debug.locals.put("r", _r);
 BA.debugLineNum = 905;BA.debugLine="Sub SetStyleBackgroundAttachment(r As String) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 906;BA.debugLine="SetStyle(\"background-attachment\", r)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-attachment")),(Object)(_r));
 BA.debugLineNum = 907;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 908;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebackgroundclip(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBackgroundClip (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,586);
if (RapidSub.canDelegate("setstylebackgroundclip")) { return __ref.runUserSub(false, "vuehtml","setstylebackgroundclip", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 586;BA.debugLine="Sub SetStyleBackgroundClip(c As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 587;BA.debugLine="SetStyle(\"background-clip\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-clip")),(Object)(BA.ObjectToString(_c)));
 BA.debugLineNum = 588;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebackgroundcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBackgroundColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,579);
if (RapidSub.canDelegate("setstylebackgroundcolor")) { return __ref.runUserSub(false, "vuehtml","setstylebackgroundcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 579;BA.debugLine="Sub SetStyleBackgroundColor(c As Object) As VueHTM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 580;BA.debugLine="SetStyle(\"background-color\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-color")),(Object)(BA.ObjectToString(_c)));
 BA.debugLineNum = 581;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 582;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebackgroundimage(RemoteObject __ref,RemoteObject _imgurl) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBackgroundImage (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,886);
if (RapidSub.canDelegate("setstylebackgroundimage")) { return __ref.runUserSub(false, "vuehtml","setstylebackgroundimage", __ref, _imgurl);}
Debug.locals.put("imgURL", _imgurl);
 BA.debugLineNum = 886;BA.debugLine="Sub SetStyleBackgroundImage(imgURL As String) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 887;BA.debugLine="SetStyle(\"background-image\", $\"url('${imgURL}')\"$";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-image")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("url('"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgurl))),RemoteObject.createImmutable("')")))));
 BA.debugLineNum = 888;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 889;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebackgroundorigin(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBackgroundOrigin (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,593);
if (RapidSub.canDelegate("setstylebackgroundorigin")) { return __ref.runUserSub(false, "vuehtml","setstylebackgroundorigin", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 593;BA.debugLine="Sub SetStyleBackgroundOrigin(c As Object) As VueHT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 594;BA.debugLine="SetStyle(\"background-origin\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-origin")),(Object)(BA.ObjectToString(_c)));
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
public static RemoteObject  _setstylebackgroundposition(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBackgroundPosition (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,912);
if (RapidSub.canDelegate("setstylebackgroundposition")) { return __ref.runUserSub(false, "vuehtml","setstylebackgroundposition", __ref, _r);}
Debug.locals.put("r", _r);
 BA.debugLineNum = 912;BA.debugLine="Sub SetStyleBackgroundPosition(r As String) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 913;BA.debugLine="SetStyle(\"background-position\", r)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-position")),(Object)(_r));
 BA.debugLineNum = 914;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 915;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebackgroundrepeat(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBackgroundRepeat (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,892);
if (RapidSub.canDelegate("setstylebackgroundrepeat")) { return __ref.runUserSub(false, "vuehtml","setstylebackgroundrepeat", __ref, _r);}
Debug.locals.put("r", _r);
 BA.debugLineNum = 892;BA.debugLine="Sub SetStyleBackgroundRepeat(r As String) As VueHT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 893;BA.debugLine="SetStyle(\"background-repeat\", r)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-repeat")),(Object)(_r));
 BA.debugLineNum = 894;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 895;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebackgroundsize(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBackgroundSize (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,898);
if (RapidSub.canDelegate("setstylebackgroundsize")) { return __ref.runUserSub(false, "vuehtml","setstylebackgroundsize", __ref, _r);}
Debug.locals.put("r", _r);
 BA.debugLineNum = 898;BA.debugLine="Sub SetStyleBackgroundSize(r As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 899;BA.debugLine="SetStyle(\"background-size\", r)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-size")),(Object)(_r));
 BA.debugLineNum = 900;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 901;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderbottomcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderBottomColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,736);
if (RapidSub.canDelegate("setstyleborderbottomcolor")) { return __ref.runUserSub(false, "vuehtml","setstyleborderbottomcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 736;BA.debugLine="Sub SetStyleBorderBottomColor(c As String) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 737;BA.debugLine="SetStyle(\"border-bottom-color\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-bottom-color")),(Object)(_c));
 BA.debugLineNum = 738;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderbottomleftradius(RemoteObject __ref,RemoteObject _bottomleft) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderBottomLeftRadius (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,625);
if (RapidSub.canDelegate("setstyleborderbottomleftradius")) { return __ref.runUserSub(false, "vuehtml","setstyleborderbottomleftradius", __ref, _bottomleft);}
Debug.locals.put("bottomLeft", _bottomleft);
 BA.debugLineNum = 625;BA.debugLine="Sub SetStyleBorderBottomLeftRadius(bottomLeft As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 626;BA.debugLine="bottomLeft = MakePx(bottomLeft)";
Debug.JustUpdateDeviceLine();
_bottomleft = __ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_bottomleft));Debug.locals.put("bottomLeft", _bottomleft);
 BA.debugLineNum = 627;BA.debugLine="SetStyle(\"border-bottom-left-radius\", bottomLeft)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-bottom-left-radius")),(Object)(_bottomleft));
 BA.debugLineNum = 628;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 629;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderbottomrightradius(RemoteObject __ref,RemoteObject _bottomright) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderBottomRightRadius (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,631);
if (RapidSub.canDelegate("setstyleborderbottomrightradius")) { return __ref.runUserSub(false, "vuehtml","setstyleborderbottomrightradius", __ref, _bottomright);}
Debug.locals.put("bottomRight", _bottomright);
 BA.debugLineNum = 631;BA.debugLine="Sub SetStyleBorderBottomRightRadius(bottomRight As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 632;BA.debugLine="bottomRight = MakePx(bottomRight)";
Debug.JustUpdateDeviceLine();
_bottomright = __ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_bottomright));Debug.locals.put("bottomRight", _bottomright);
 BA.debugLineNum = 633;BA.debugLine="SetStyle(\"border-bottom-right-radius\", bottomRigh";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-bottom-right-radius")),(Object)(_bottomright));
 BA.debugLineNum = 634;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderbottomstyle(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderBottomStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,751);
if (RapidSub.canDelegate("setstyleborderbottomstyle")) { return __ref.runUserSub(false, "vuehtml","setstyleborderbottomstyle", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 751;BA.debugLine="Sub SetStyleBorderBottomStyle(c As String) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 752;BA.debugLine="SetStyle(\"border-bottom-style\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-bottom-style")),(Object)(_c));
 BA.debugLineNum = 753;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 754;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderbottomwidth(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderBottomWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,704);
if (RapidSub.canDelegate("setstyleborderbottomwidth")) { return __ref.runUserSub(false, "vuehtml","setstyleborderbottomwidth", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 704;BA.debugLine="Sub SetStyleBorderBottomWidth(b As String) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 705;BA.debugLine="SetStyle(\"border-bottom-width\",MakePx(b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-bottom-width")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_b))));
 BA.debugLineNum = 706;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 707;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebordercolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,714);
if (RapidSub.canDelegate("setstylebordercolor")) { return __ref.runUserSub(false, "vuehtml","setstylebordercolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 714;BA.debugLine="Sub SetStyleBorderColor(c As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 715;BA.debugLine="SetStyle(\"border-color\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-color")),(Object)(_c));
 BA.debugLineNum = 716;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 717;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderleftcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderLeftColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,719);
if (RapidSub.canDelegate("setstyleborderleftcolor")) { return __ref.runUserSub(false, "vuehtml","setstyleborderleftcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 719;BA.debugLine="Sub SetStyleBorderLeftColor(c As String) As VueHTM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 720;BA.debugLine="SetStyle(\"border-left-color\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-left-color")),(Object)(_c));
 BA.debugLineNum = 721;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 722;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderleftstyle(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderLeftStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,741);
if (RapidSub.canDelegate("setstyleborderleftstyle")) { return __ref.runUserSub(false, "vuehtml","setstyleborderleftstyle", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 741;BA.debugLine="Sub SetStyleBorderLeftStyle(c As String) As VueHTM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 742;BA.debugLine="SetStyle(\"border-left-style\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-left-style")),(Object)(_c));
 BA.debugLineNum = 743;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 744;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderleftwidth(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderLeftWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,694);
if (RapidSub.canDelegate("setstyleborderleftwidth")) { return __ref.runUserSub(false, "vuehtml","setstyleborderleftwidth", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 694;BA.debugLine="Sub SetStyleBorderLeftWidth(b As String) As VueHTM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 695;BA.debugLine="SetStyle(\"border-left-width\",MakePx(b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-left-width")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_b))));
 BA.debugLineNum = 696;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 697;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderradius(RemoteObject __ref,RemoteObject _topleft,RemoteObject _topright,RemoteObject _bottomleft,RemoteObject _bottomright) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderRadius (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,599);
if (RapidSub.canDelegate("setstyleborderradius")) { return __ref.runUserSub(false, "vuehtml","setstyleborderradius", __ref, _topleft, _topright, _bottomleft, _bottomright);}
RemoteObject _br = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sbr = RemoteObject.createImmutable("");
Debug.locals.put("topLeft", _topleft);
Debug.locals.put("topRight", _topright);
Debug.locals.put("bottomLeft", _bottomleft);
Debug.locals.put("bottomRight", _bottomright);
 BA.debugLineNum = 599;BA.debugLine="Sub SetStyleBorderRadius(topLeft As String, topRig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 600;BA.debugLine="Dim br As List";
Debug.JustUpdateDeviceLine();
_br = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("br", _br);
 BA.debugLineNum = 601;BA.debugLine="br.Initialize";
Debug.JustUpdateDeviceLine();
_br.runVoidMethod ("Initialize");
 BA.debugLineNum = 602;BA.debugLine="br.Add(MakePx(topLeft))";
Debug.JustUpdateDeviceLine();
_br.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_topleft)))));
 BA.debugLineNum = 603;BA.debugLine="br.Add(MakePx(topRight))";
Debug.JustUpdateDeviceLine();
_br.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_topright)))));
 BA.debugLineNum = 604;BA.debugLine="br.Add(MakePx(bottomLeft))";
Debug.JustUpdateDeviceLine();
_br.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_bottomleft)))));
 BA.debugLineNum = 605;BA.debugLine="br.Add(MakePx(bottomRight))";
Debug.JustUpdateDeviceLine();
_br.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_bottomright)))));
 BA.debugLineNum = 607;BA.debugLine="Dim sbr As String = Join(\" \", br)";
Debug.JustUpdateDeviceLine();
_sbr = __ref.runClassMethod (b4j.example.vuehtml.class, "_join" /*RemoteObject*/ ,(Object)(BA.ObjectToString(" ")),(Object)(_br));Debug.locals.put("sbr", _sbr);Debug.locals.put("sbr", _sbr);
 BA.debugLineNum = 608;BA.debugLine="SetStyle(\"border-radius\", sbr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-radius")),(Object)(_sbr));
 BA.debugLineNum = 609;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderrightcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderRightColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,725);
if (RapidSub.canDelegate("setstyleborderrightcolor")) { return __ref.runUserSub(false, "vuehtml","setstyleborderrightcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 725;BA.debugLine="Sub SetStyleBorderRightColor(c As String) As VueHT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 726;BA.debugLine="SetStyle(\"border-right-color\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-right-color")),(Object)(_c));
 BA.debugLineNum = 727;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 728;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderrightstyle(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderRightStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,746);
if (RapidSub.canDelegate("setstyleborderrightstyle")) { return __ref.runUserSub(false, "vuehtml","setstyleborderrightstyle", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 746;BA.debugLine="Sub SetStyleBorderRightStyle(c As String) As VueHT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 747;BA.debugLine="SetStyle(\"border-right-style\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-right-style")),(Object)(_c));
 BA.debugLineNum = 748;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 749;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderrightwidth(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderRightWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,699);
if (RapidSub.canDelegate("setstyleborderrightwidth")) { return __ref.runUserSub(false, "vuehtml","setstyleborderrightwidth", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 699;BA.debugLine="Sub SetStyleBorderRightWidth(b As String) As VueHT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 700;BA.debugLine="SetStyle(\"border-right-width\",MakePx(b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-right-width")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_b))));
 BA.debugLineNum = 701;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 702;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderstyle(RemoteObject __ref,RemoteObject _bs) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,664);
if (RapidSub.canDelegate("setstyleborderstyle")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstyle", __ref, _bs);}
Debug.locals.put("bs", _bs);
 BA.debugLineNum = 664;BA.debugLine="Sub SetStyleBorderStyle(bs As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 665;BA.debugLine="SetStyle(\"border-style\",bs)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(BA.ObjectToString(_bs)));
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
public static RemoteObject  _setstyleborderstyledashed(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleDashed (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,674);
if (RapidSub.canDelegate("setstyleborderstyledashed")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstyledashed", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 674;BA.debugLine="Sub SetStyleBorderStyleDashed(b As Boolean) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 675;BA.debugLine="SetStyle(\"border-style\",\"dashed\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("dashed")));
 BA.debugLineNum = 676;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 677;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderstyledotted(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleDotted (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,669);
if (RapidSub.canDelegate("setstyleborderstyledotted")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstyledotted", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 669;BA.debugLine="Sub SetStyleBorderStyleDotted(b As Boolean) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 670;BA.debugLine="SetStyle(\"border-style\",\"dotted\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("dotted")));
 BA.debugLineNum = 671;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 672;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderstyledouble(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleDouble (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,684);
if (RapidSub.canDelegate("setstyleborderstyledouble")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstyledouble", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 684;BA.debugLine="Sub SetStyleBorderStyleDouble(b As Boolean) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 685;BA.debugLine="SetStyle(\"border-style\",\"double\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("double")));
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
public static RemoteObject  _setstyleborderstylegroove(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleGroove (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,761);
if (RapidSub.canDelegate("setstyleborderstylegroove")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstylegroove", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 761;BA.debugLine="Sub SetStyleBorderStyleGroove(b As Boolean) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 762;BA.debugLine="SetStyle(\"border-style\",\"groove\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("groove")));
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
public static RemoteObject  _setstyleborderstylehidden(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleHidden (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,786);
if (RapidSub.canDelegate("setstyleborderstylehidden")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstylehidden", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 786;BA.debugLine="Sub SetStyleBorderStyleHidden(b As Boolean) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 787;BA.debugLine="SetStyle(\"border-style\",\"hidden\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("hidden")));
 BA.debugLineNum = 788;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 789;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderstyleinset(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleInset (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,771);
if (RapidSub.canDelegate("setstyleborderstyleinset")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstyleinset", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 771;BA.debugLine="Sub SetStyleBorderStyleInset(b As Boolean) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 772;BA.debugLine="SetStyle(\"border-style\",\"inset\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("inset")));
 BA.debugLineNum = 773;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 774;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderstylenone(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleNone (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,781);
if (RapidSub.canDelegate("setstyleborderstylenone")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstylenone", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 781;BA.debugLine="Sub SetStyleBorderStyleNone(b As Boolean) As VueHT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 782;BA.debugLine="SetStyle(\"border-style\",\"none\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("none")));
 BA.debugLineNum = 783;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 784;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderstyleoutset(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleOutset (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,776);
if (RapidSub.canDelegate("setstyleborderstyleoutset")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstyleoutset", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 776;BA.debugLine="Sub SetStyleBorderStyleOutset(b As Boolean) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 777;BA.debugLine="SetStyle(\"border-style\",\"outset\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("outset")));
 BA.debugLineNum = 778;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 779;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderstyleridge(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleRidge (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,766);
if (RapidSub.canDelegate("setstyleborderstyleridge")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstyleridge", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 766;BA.debugLine="Sub SetStyleBorderStyleRidge(b As Boolean) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 767;BA.debugLine="SetStyle(\"border-style\",\"ridge\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("ridge")));
 BA.debugLineNum = 768;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 769;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderstylesolid(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderStyleSolid (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,679);
if (RapidSub.canDelegate("setstyleborderstylesolid")) { return __ref.runUserSub(false, "vuehtml","setstyleborderstylesolid", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 679;BA.debugLine="Sub SetStyleBorderStyleSolid(b As Boolean) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 680;BA.debugLine="SetStyle(\"border-style\",\"solid\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-style")),(Object)(RemoteObject.createImmutable("solid")));
 BA.debugLineNum = 681;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 682;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebordertopcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderTopColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,730);
if (RapidSub.canDelegate("setstylebordertopcolor")) { return __ref.runUserSub(false, "vuehtml","setstylebordertopcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 730;BA.debugLine="Sub SetStyleBorderTopColor(c As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 731;BA.debugLine="SetStyle(\"border-top-color\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-top-color")),(Object)(_c));
 BA.debugLineNum = 732;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 733;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebordertopleftradius(RemoteObject __ref,RemoteObject _topleft) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderTopLeftRadius (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,613);
if (RapidSub.canDelegate("setstylebordertopleftradius")) { return __ref.runUserSub(false, "vuehtml","setstylebordertopleftradius", __ref, _topleft);}
Debug.locals.put("topLeft", _topleft);
 BA.debugLineNum = 613;BA.debugLine="Sub SetStyleBorderTopLeftRadius(topLeft As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 614;BA.debugLine="topLeft = MakePx(topLeft)";
Debug.JustUpdateDeviceLine();
_topleft = __ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_topleft));Debug.locals.put("topLeft", _topleft);
 BA.debugLineNum = 615;BA.debugLine="SetStyle(\"border-top-left-radius\", topLeft)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-top-left-radius")),(Object)(_topleft));
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
public static RemoteObject  _setstylebordertoprightradius(RemoteObject __ref,RemoteObject _topright) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderTopRightRadius (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,619);
if (RapidSub.canDelegate("setstylebordertoprightradius")) { return __ref.runUserSub(false, "vuehtml","setstylebordertoprightradius", __ref, _topright);}
Debug.locals.put("topRight", _topright);
 BA.debugLineNum = 619;BA.debugLine="Sub SetStyleBorderTopRightRadius(topRight As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 620;BA.debugLine="topRight = MakePx(topRight)";
Debug.JustUpdateDeviceLine();
_topright = __ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_topright));Debug.locals.put("topRight", _topright);
 BA.debugLineNum = 621;BA.debugLine="SetStyle(\"border-top-right-radius\", topRight)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-top-right-radius")),(Object)(_topright));
 BA.debugLineNum = 622;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebordertopstyle(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderTopStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,756);
if (RapidSub.canDelegate("setstylebordertopstyle")) { return __ref.runUserSub(false, "vuehtml","setstylebordertopstyle", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 756;BA.debugLine="Sub SetStyleBorderTopStyle(c As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 757;BA.debugLine="SetStyle(\"border-top-style\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-top-style")),(Object)(_c));
 BA.debugLineNum = 758;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 759;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylebordertopwidth(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderTopWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,709);
if (RapidSub.canDelegate("setstylebordertopwidth")) { return __ref.runUserSub(false, "vuehtml","setstylebordertopwidth", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 709;BA.debugLine="Sub SetStyleBorderTopWidth(b As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 710;BA.debugLine="SetStyle(\"border-top-width\",MakePx(b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-top-width")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_b))));
 BA.debugLineNum = 711;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 712;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleborderwidth(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleBorderWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,689);
if (RapidSub.canDelegate("setstyleborderwidth")) { return __ref.runUserSub(false, "vuehtml","setstyleborderwidth", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 689;BA.debugLine="Sub SetStyleBorderWidth(b As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 690;BA.debugLine="SetStyle(\"border-width\",MakePx(b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("border-width")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_b))));
 BA.debugLineNum = 691;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 692;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylecolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,637);
if (RapidSub.canDelegate("setstylecolor")) { return __ref.runUserSub(false, "vuehtml","setstylecolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 637;BA.debugLine="Sub SetStyleColor(c As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 638;BA.debugLine="SetStyle(\"color\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("color")),(Object)(BA.ObjectToString(_c)));
 BA.debugLineNum = 639;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 640;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyledirection(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleDirection (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("setstyledirection")) { return __ref.runUserSub(false, "vuehtml","setstyledirection", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 561;BA.debugLine="Sub SetStyleDirection(f As Object) As VueHTML   'i";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 562;BA.debugLine="SetStyle(\"direction\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("direction")),(Object)(BA.ObjectToString(_f)));
 BA.debugLineNum = 563;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylefontfamily(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleFontFamily (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,475);
if (RapidSub.canDelegate("setstylefontfamily")) { return __ref.runUserSub(false, "vuehtml","setstylefontfamily", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 475;BA.debugLine="Sub SetStyleFontFamily(f As Object) As VueHTML   '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 476;BA.debugLine="SetStyle(\"font-family\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("font-family")),(Object)(BA.ObjectToString(_f)));
 BA.debugLineNum = 477;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylefontsize(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleFontSize (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,508);
if (RapidSub.canDelegate("setstylefontsize")) { return __ref.runUserSub(false, "vuehtml","setstylefontsize", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 508;BA.debugLine="Sub SetStyleFontSize(f As Object) As VueHTML   'ig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 509;BA.debugLine="SetStyle(\"font-size\", MakePx(f))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("font-size")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_f)))));
 BA.debugLineNum = 510;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 511;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylefontstyle(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleFontStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,503);
if (RapidSub.canDelegate("setstylefontstyle")) { return __ref.runUserSub(false, "vuehtml","setstylefontstyle", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 503;BA.debugLine="Sub SetStyleFontStyle(f As Object) As VueHTML   'i";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 504;BA.debugLine="SetStyle(\"font-style\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("font-style")),(Object)(BA.ObjectToString(_f)));
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
public static RemoteObject  _setstylefontvariant(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleFontVariant (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,492);
if (RapidSub.canDelegate("setstylefontvariant")) { return __ref.runUserSub(false, "vuehtml","setstylefontvariant", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 492;BA.debugLine="Sub SetStyleFontVariant(f As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 493;BA.debugLine="SetStyle(\"font-variant\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("font-variant")),(Object)(BA.ObjectToString(_f)));
 BA.debugLineNum = 494;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylefontweight(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleFontWeight (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("setstylefontweight")) { return __ref.runUserSub(false, "vuehtml","setstylefontweight", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 481;BA.debugLine="Sub SetStyleFontWeight(f As Object) As VueHTML   '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 482;BA.debugLine="SetStyle(\"font-weight\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("font-weight")),(Object)(BA.ObjectToString(_f)));
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
public static RemoteObject  _setstylefontweightbold(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleFontWeightBold (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,487);
if (RapidSub.canDelegate("setstylefontweightbold")) { return __ref.runUserSub(false, "vuehtml","setstylefontweightbold", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 487;BA.debugLine="Sub SetStyleFontWeightBold(f As Boolean) As VueHTM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 488;BA.debugLine="SetStyle(\"font-weight\", \"bold\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("font-weight")),(Object)(RemoteObject.createImmutable("bold")));
 BA.debugLineNum = 489;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylefontweightnormal(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleFontWeightNormal (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,497);
if (RapidSub.canDelegate("setstylefontweightnormal")) { return __ref.runUserSub(false, "vuehtml","setstylefontweightnormal", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 497;BA.debugLine="Sub SetStyleFontWeightNormal(f As Boolean) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 498;BA.debugLine="SetStyle(\"font-weight\", \"normal\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("font-weight")),(Object)(RemoteObject.createImmutable("normal")));
 BA.debugLineNum = 499;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 500;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetStyleHeight (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("setstyleheight")) { return __ref.runUserSub(false, "vuehtml","setstyleheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 293;BA.debugLine="Sub SetStyleHeight(h As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 294;BA.debugLine="SetStyleMulti(CreateMap(\"height\":h))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstylemulti" /*RemoteObject*/ ,(Object)(vuehtml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),_h}))));
 BA.debugLineNum = 295;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleimportant(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyleImportant (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,791);
if (RapidSub.canDelegate("setstyleimportant")) { return __ref.runUserSub(false, "vuehtml","setstyleimportant", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 791;BA.debugLine="Sub SetStyleImportant(b As Boolean) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 792;BA.debugLine="IsImportant = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isimportant" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 793;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 794;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleletterspacing(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleLetterSpacing (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,530);
if (RapidSub.canDelegate("setstyleletterspacing")) { return __ref.runUserSub(false, "vuehtml","setstyleletterspacing", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 530;BA.debugLine="Sub SetStyleLetterSpacing(f As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 531;BA.debugLine="SetStyle(\"letter-spacing\", MakePx(f))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("letter-spacing")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_f)))));
 BA.debugLineNum = 532;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylelineheight(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleLineHeight (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,545);
if (RapidSub.canDelegate("setstylelineheight")) { return __ref.runUserSub(false, "vuehtml","setstylelineheight", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 545;BA.debugLine="Sub SetStyleLineHeight(f As Object) As VueHTML   '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 546;BA.debugLine="SetStyle(\"line-height\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("line-height")),(Object)(BA.ObjectToString(_f)));
 BA.debugLineNum = 547;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 548;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleliststylecircle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetStyleListStyleCircle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1149);
if (RapidSub.canDelegate("setstyleliststylecircle")) { return __ref.runUserSub(false, "vuehtml","setstyleliststylecircle", __ref);}
 BA.debugLineNum = 1149;BA.debugLine="Sub SetStyleListStyleCircle() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1150;BA.debugLine="SetStyle(\"list-style-type\",\"circle\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("list-style-type")),(Object)(RemoteObject.createImmutable("circle")));
 BA.debugLineNum = 1151;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleliststyledisk(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetStyleListStyleDisk (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1154);
if (RapidSub.canDelegate("setstyleliststyledisk")) { return __ref.runUserSub(false, "vuehtml","setstyleliststyledisk", __ref);}
 BA.debugLineNum = 1154;BA.debugLine="Sub SetStyleListStyleDisk() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1155;BA.debugLine="SetStyle(\"list-style-type\",\"disk\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("list-style-type")),(Object)(RemoteObject.createImmutable("disk")));
 BA.debugLineNum = 1156;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleliststylenone(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetStyleListStyleNone (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1159);
if (RapidSub.canDelegate("setstyleliststylenone")) { return __ref.runUserSub(false, "vuehtml","setstyleliststylenone", __ref);}
 BA.debugLineNum = 1159;BA.debugLine="Sub SetStyleListStyleNone() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1160;BA.debugLine="SetStyle(\"list-style-type\",\"none\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("list-style-type")),(Object)(RemoteObject.createImmutable("none")));
 BA.debugLineNum = 1161;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1162;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleliststylesquare(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetStyleListStyleSquare (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1164);
if (RapidSub.canDelegate("setstyleliststylesquare")) { return __ref.runUserSub(false, "vuehtml","setstyleliststylesquare", __ref);}
 BA.debugLineNum = 1164;BA.debugLine="Sub SetStyleListStyleSquare() As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1165;BA.debugLine="SetStyle(\"list-style-type\",\"square\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("list-style-type")),(Object)(RemoteObject.createImmutable("square")));
 BA.debugLineNum = 1166;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1167;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylemargin(RemoteObject __ref,RemoteObject _marginbottom) throws Exception{
try {
		Debug.PushSubsStack("SetStyleMargin (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,919);
if (RapidSub.canDelegate("setstylemargin")) { return __ref.runUserSub(false, "vuehtml","setstylemargin", __ref, _marginbottom);}
Debug.locals.put("MarginBottom", _marginbottom);
 BA.debugLineNum = 919;BA.debugLine="Sub SetStyleMargin(MarginBottom As String) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 920;BA.debugLine="SetStyle(\"margin\", MakePx(MarginBottom))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_marginbottom))));
 BA.debugLineNum = 921;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 922;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylemarginbottom(RemoteObject __ref,RemoteObject _marginbottom) throws Exception{
try {
		Debug.PushSubsStack("SetStyleMarginBottom (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,925);
if (RapidSub.canDelegate("setstylemarginbottom")) { return __ref.runUserSub(false, "vuehtml","setstylemarginbottom", __ref, _marginbottom);}
Debug.locals.put("MarginBottom", _marginbottom);
 BA.debugLineNum = 925;BA.debugLine="Sub SetStyleMarginBottom(MarginBottom As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 926;BA.debugLine="SetStyle(\"margin-bottom\", MakePx(MarginBottom))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-bottom")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_marginbottom))));
 BA.debugLineNum = 927;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 928;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylemarginleft(RemoteObject __ref,RemoteObject _marginleft) throws Exception{
try {
		Debug.PushSubsStack("SetStyleMarginLeft (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,937);
if (RapidSub.canDelegate("setstylemarginleft")) { return __ref.runUserSub(false, "vuehtml","setstylemarginleft", __ref, _marginleft);}
Debug.locals.put("MarginLeft", _marginleft);
 BA.debugLineNum = 937;BA.debugLine="Sub SetStyleMarginLeft(MarginLeft As String) As Vu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 938;BA.debugLine="SetStyle(\"margin-left\", MakePx(MarginLeft))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-left")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_marginleft))));
 BA.debugLineNum = 939;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 940;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylemarginright(RemoteObject __ref,RemoteObject _marginright) throws Exception{
try {
		Debug.PushSubsStack("SetStyleMarginRight (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,931);
if (RapidSub.canDelegate("setstylemarginright")) { return __ref.runUserSub(false, "vuehtml","setstylemarginright", __ref, _marginright);}
Debug.locals.put("MarginRight", _marginright);
 BA.debugLineNum = 931;BA.debugLine="Sub SetStyleMarginRight(MarginRight As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 932;BA.debugLine="SetStyle(\"margin-right\", MakePx(MarginRight))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-right")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_marginright))));
 BA.debugLineNum = 933;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 934;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylemargintop(RemoteObject __ref,RemoteObject _margintop) throws Exception{
try {
		Debug.PushSubsStack("SetStyleMarginTop (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,943);
if (RapidSub.canDelegate("setstylemargintop")) { return __ref.runUserSub(false, "vuehtml","setstylemargintop", __ref, _margintop);}
Debug.locals.put("MarginTop", _margintop);
 BA.debugLineNum = 943;BA.debugLine="Sub SetStyleMarginTop(MarginTop As String) As VueH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 944;BA.debugLine="SetStyle(\"margin-top\", MakePx(MarginTop))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-top")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_margintop))));
 BA.debugLineNum = 945;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 946;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylemulti(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyleMulti (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,798);
if (RapidSub.canDelegate("setstylemulti")) { return __ref.runUserSub(false, "vuehtml","setstylemulti", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 798;BA.debugLine="Sub SetStyleMulti(m As Map) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 799;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 800;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 801;BA.debugLine="SetStyle(k,v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(_k),(Object)(BA.ObjectToString(_v)));
 }
}Debug.locals.put("k", _k);
;
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
public static RemoteObject  _setstyleoutline(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetStyleOutline (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,642);
if (RapidSub.canDelegate("setstyleoutline")) { return __ref.runUserSub(false, "vuehtml","setstyleoutline", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 642;BA.debugLine="Sub SetStyleOutline(c As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 643;BA.debugLine="SetStyle(\"outline\",c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("outline")),(Object)(BA.ObjectToString(_c)));
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
public static RemoteObject  _setstyleoutlinecolor(RemoteObject __ref,RemoteObject _bs) throws Exception{
try {
		Debug.PushSubsStack("SetStyleOutlineColor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,653);
if (RapidSub.canDelegate("setstyleoutlinecolor")) { return __ref.runUserSub(false, "vuehtml","setstyleoutlinecolor", __ref, _bs);}
Debug.locals.put("bs", _bs);
 BA.debugLineNum = 653;BA.debugLine="Sub SetStyleOutlineColor(bs As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 654;BA.debugLine="SetStyle(\"outline-color\",bs)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("outline-color")),(Object)(BA.ObjectToString(_bs)));
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
public static RemoteObject  _setstyleoutlinestyle(RemoteObject __ref,RemoteObject _bs) throws Exception{
try {
		Debug.PushSubsStack("SetStyleOutlineStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,647);
if (RapidSub.canDelegate("setstyleoutlinestyle")) { return __ref.runUserSub(false, "vuehtml","setstyleoutlinestyle", __ref, _bs);}
Debug.locals.put("bs", _bs);
 BA.debugLineNum = 647;BA.debugLine="Sub SetStyleOutlineStyle(bs As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 648;BA.debugLine="SetStyle(\"outline-style\",bs)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("outline-style")),(Object)(BA.ObjectToString(_bs)));
 BA.debugLineNum = 649;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 650;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleoutlinewidth(RemoteObject __ref,RemoteObject _bs) throws Exception{
try {
		Debug.PushSubsStack("SetStyleOutlineWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,658);
if (RapidSub.canDelegate("setstyleoutlinewidth")) { return __ref.runUserSub(false, "vuehtml","setstyleoutlinewidth", __ref, _bs);}
Debug.locals.put("bs", _bs);
 BA.debugLineNum = 658;BA.debugLine="Sub SetStyleOutlineWidth(bs As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 659;BA.debugLine="SetStyle(\"outline-width\",MakePx(bs))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("outline-width")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_bs)))));
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
public static RemoteObject  _setstylepadding(RemoteObject __ref,RemoteObject _paddingbottom) throws Exception{
try {
		Debug.PushSubsStack("SetStylePadding (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,856);
if (RapidSub.canDelegate("setstylepadding")) { return __ref.runUserSub(false, "vuehtml","setstylepadding", __ref, _paddingbottom);}
Debug.locals.put("PaddingBottom", _paddingbottom);
 BA.debugLineNum = 856;BA.debugLine="Sub SetStylePadding(PaddingBottom As String) As Vu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 857;BA.debugLine="SetStyle(\"padding\", MakePx(PaddingBottom))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_paddingbottom))));
 BA.debugLineNum = 858;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 859;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylepaddingbottom(RemoteObject __ref,RemoteObject _paddingbottom) throws Exception{
try {
		Debug.PushSubsStack("SetStylePaddingBottom (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,862);
if (RapidSub.canDelegate("setstylepaddingbottom")) { return __ref.runUserSub(false, "vuehtml","setstylepaddingbottom", __ref, _paddingbottom);}
Debug.locals.put("PaddingBottom", _paddingbottom);
 BA.debugLineNum = 862;BA.debugLine="Sub SetStylePaddingBottom(PaddingBottom As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 863;BA.debugLine="SetStyle(\"padding-bottom\", MakePx(PaddingBottom))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-bottom")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_paddingbottom))));
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
public static RemoteObject  _setstylepaddingleft(RemoteObject __ref,RemoteObject _paddingleft) throws Exception{
try {
		Debug.PushSubsStack("SetStylePaddingLeft (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,874);
if (RapidSub.canDelegate("setstylepaddingleft")) { return __ref.runUserSub(false, "vuehtml","setstylepaddingleft", __ref, _paddingleft);}
Debug.locals.put("PaddingLeft", _paddingleft);
 BA.debugLineNum = 874;BA.debugLine="Sub SetStylePaddingLeft(PaddingLeft As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 875;BA.debugLine="SetStyle(\"padding-left\", MakePx(PaddingLeft))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-left")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_paddingleft))));
 BA.debugLineNum = 876;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 877;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylepaddingright(RemoteObject __ref,RemoteObject _paddingright) throws Exception{
try {
		Debug.PushSubsStack("SetStylePaddingRight (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,868);
if (RapidSub.canDelegate("setstylepaddingright")) { return __ref.runUserSub(false, "vuehtml","setstylepaddingright", __ref, _paddingright);}
Debug.locals.put("PaddingRight", _paddingright);
 BA.debugLineNum = 868;BA.debugLine="Sub SetStylePaddingRight(PaddingRight As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 869;BA.debugLine="SetStyle(\"padding-right\", MakePx(PaddingRight))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-right")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_paddingright))));
 BA.debugLineNum = 870;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 871;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylepaddingtop(RemoteObject __ref,RemoteObject _paddingtop) throws Exception{
try {
		Debug.PushSubsStack("SetStylePaddingTop (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,880);
if (RapidSub.canDelegate("setstylepaddingtop")) { return __ref.runUserSub(false, "vuehtml","setstylepaddingtop", __ref, _paddingtop);}
Debug.locals.put("PaddingTop", _paddingtop);
 BA.debugLineNum = 880;BA.debugLine="Sub SetStylePaddingTop(PaddingTop As String) As Vu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 881;BA.debugLine="SetStyle(\"padding-top\", MakePx(PaddingTop))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-top")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_paddingtop))));
 BA.debugLineNum = 882;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 883;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyles(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyles (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("setstyles")) { return __ref.runUserSub(false, "vuehtml","setstyles", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 403;BA.debugLine="Sub SetStyles(m As Map) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 404;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 405;BA.debugLine="Dim v As String = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 406;BA.debugLine="SetStyle(k,v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(_k),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 408;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyletextaligncenter(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleTextAlignCenter (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,514);
if (RapidSub.canDelegate("setstyletextaligncenter")) { return __ref.runUserSub(false, "vuehtml","setstyletextaligncenter", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 514;BA.debugLine="Sub SetStyleTextAlignCenter(f As Boolean) As VueHT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 515;BA.debugLine="SetStyle(\"text-align\", \"center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text-align")),(Object)(RemoteObject.createImmutable("center")));
 BA.debugLineNum = 516;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 517;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyletextdecoration(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleTextDecoration (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,535);
if (RapidSub.canDelegate("setstyletextdecoration")) { return __ref.runUserSub(false, "vuehtml","setstyletextdecoration", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 535;BA.debugLine="Sub SetStyleTextDecoration(f As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 536;BA.debugLine="SetStyle(\"text-decoration\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text-decoration")),(Object)(BA.ObjectToString(_f)));
 BA.debugLineNum = 537;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyletextindent(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleTextIndent (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("setstyletextindent")) { return __ref.runUserSub(false, "vuehtml","setstyletextindent", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 520;BA.debugLine="Sub SetStyleTextIndent(f As Object) As VueHTML   '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 521;BA.debugLine="SetStyle(\"text-indent\", MakePx(f))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text-indent")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_f)))));
 BA.debugLineNum = 522;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyletextshadow(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleTextShadow (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,540);
if (RapidSub.canDelegate("setstyletextshadow")) { return __ref.runUserSub(false, "vuehtml","setstyletextshadow", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 540;BA.debugLine="Sub SetStyleTextShadow(f As Object) As VueHTML   '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 541;BA.debugLine="SetStyle(\"text-shadow\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text-shadow")),(Object)(BA.ObjectToString(_f)));
 BA.debugLineNum = 542;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 543;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyletexttransform(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleTextTransform (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,525);
if (RapidSub.canDelegate("setstyletexttransform")) { return __ref.runUserSub(false, "vuehtml","setstyletexttransform", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 525;BA.debugLine="Sub SetStyleTextTransform(f As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 526;BA.debugLine="SetStyle(\"text-transform\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text-transform")),(Object)(BA.ObjectToString(_f)));
 BA.debugLineNum = 527;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 528;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleverticalalign(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleVerticalAlign (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,556);
if (RapidSub.canDelegate("setstyleverticalalign")) { return __ref.runUserSub(false, "vuehtml","setstyleverticalalign", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 556;BA.debugLine="Sub SetStyleVerticalAlign(f As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 557;BA.debugLine="SetStyle(\"vertical-align\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("vertical-align")),(Object)(BA.ObjectToString(_f)));
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
public static RemoteObject  _setstylewhitespace(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleWhiteSpace (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,551);
if (RapidSub.canDelegate("setstylewhitespace")) { return __ref.runUserSub(false, "vuehtml","setstylewhitespace", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 551;BA.debugLine="Sub SetStyleWhiteSpace(f As Object) As VueHTML   '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 552;BA.debugLine="SetStyle(\"white-space\", f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("white-space")),(Object)(BA.ObjectToString(_f)));
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
public static RemoteObject  _setstylewidth(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetStyleWidth (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("setstylewidth")) { return __ref.runUserSub(false, "vuehtml","setstylewidth", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 305;BA.debugLine="Sub SetStyleWidth(h As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 306;BA.debugLine="SetStyleMulti(CreateMap(\"width\":h))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstylemulti" /*RemoteObject*/ ,(Object)(vuehtml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),_h}))));
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
public static RemoteObject  _setstylewordspacing(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetStyleWordSpacing (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,566);
if (RapidSub.canDelegate("setstylewordspacing")) { return __ref.runUserSub(false, "vuehtml","setstylewordspacing", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 566;BA.debugLine="Sub SetStyleWordSpacing(f As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 567;BA.debugLine="SetStyle(\"word-spacing\", MakePx(f))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("word-spacing")),(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_f)))));
 BA.debugLineNum = 568;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylezindex(RemoteObject __ref,RemoteObject _zindex) throws Exception{
try {
		Debug.PushSubsStack("SetStyleZIndex (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1211);
if (RapidSub.canDelegate("setstylezindex")) { return __ref.runUserSub(false, "vuehtml","setstylezindex", __ref, _zindex);}
Debug.locals.put("zindex", _zindex);
 BA.debugLineNum = 1211;BA.debugLine="Sub SetStyleZIndex(zindex As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1212;BA.debugLine="SetStyle(\"z-index\",zindex)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("z-index")),(Object)(_zindex));
 BA.debugLineNum = 1213;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1214;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vuehtml","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 121;BA.debugLine="Sub SetTabIndex(ti As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="SetAttr(\"tabindex\", ti)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("tabindex")),(Object)(_ti));
 BA.debugLineNum = 123;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _stag) throws Exception{
try {
		Debug.PushSubsStack("SetTag (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1535);
if (RapidSub.canDelegate("settag")) { return __ref.runUserSub(false, "vuehtml","settag", __ref, _stag);}
Debug.locals.put("sTag", _stag);
 BA.debugLineNum = 1535;BA.debugLine="Sub SetTag(sTag As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1536;BA.debugLine="Tag = sTag.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,_stag.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 1537;BA.debugLine="If Tag = \"pre\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_tag" /*RemoteObject*/ ),BA.ObjectToString("pre"))) { 
 BA.debugLineNum = 1538;BA.debugLine="AddClass(\"code-line\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("code-line")));
 };
 BA.debugLineNum = 1540;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1541;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTemplate (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("settemplate")) { return __ref.runUserSub(false, "vuehtml","settemplate", __ref, _tmp);}
Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 194;BA.debugLine="Sub SetTemplate(tmp As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="Clear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 196;BA.debugLine="SetText(tmp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_tmp)));
 BA.debugLineNum = 197;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("SetText (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1509);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vuehtml","settext", __ref, _stext);}
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 1509;BA.debugLine="Sub SetText(sText As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1510;BA.debugLine="AddContent(sText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(_stext));
 BA.debugLineNum = 1511;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuehtml.__c.getField(true,"True"));
 BA.debugLineNum = 1512;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1513;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTextAlignCenter (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,826);
if (RapidSub.canDelegate("settextaligncenter")) { return __ref.runUserSub(false, "vuehtml","settextaligncenter", __ref);}
 BA.debugLineNum = 826;BA.debugLine="Sub SetTextAlignCenter As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 827;BA.debugLine="SetStyle(\"text-align\", \"center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text-align")),(Object)(RemoteObject.createImmutable("center")));
 BA.debugLineNum = 828;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 829;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTo (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setto")) { return __ref.runUserSub(false, "vuehtml","setto", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 169;BA.debugLine="Sub SetTo(t As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="SetAttr(\"to\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("to")),(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _settype(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetType (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1503);
if (RapidSub.canDelegate("settype")) { return __ref.runUserSub(false, "vuehtml","settype", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 1503;BA.debugLine="Sub SetType(t As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1504;BA.debugLine="SetAttr(\"type\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("type")),(Object)(_t));
 BA.debugLineNum = 1505;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1506;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seturl(RemoteObject __ref,RemoteObject _u) throws Exception{
try {
		Debug.PushSubsStack("SetURL (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("seturl")) { return __ref.runUserSub(false, "vuehtml","seturl", __ref, _u);}
Debug.locals.put("u", _u);
 BA.debugLineNum = 163;BA.debugLine="Sub SetURL(u As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="SetAttr(\"url\", u)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("url")),(Object)(BA.ObjectToString(_u)));
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vuehtml","setvalue", __ref, _l);}
RemoteObject _valuename = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
Debug.locals.put("l", _l);
 BA.debugLineNum = 228;BA.debugLine="private Sub SetValue(l As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 229;BA.debugLine="If ds = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_ds" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 230;BA.debugLine="Log(\"VueHTML.SetValue, you need to run VueHTML.S";
Debug.JustUpdateDeviceLine();
vuehtml.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("VueHTML.SetValue, you need to run VueHTML.SetData first before you set value!")));
 };
 BA.debugLineNum = 232;BA.debugLine="Dim valueName As String = $\"row.${l}\"$";
Debug.JustUpdateDeviceLine();
_valuename = (RemoteObject.concat(RemoteObject.createImmutable("row."),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_l)),RemoteObject.createImmutable("")));Debug.locals.put("valueName", _valuename);Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 233;BA.debugLine="Dim txt As String = $\"{{ ${valueName} }}\"$";
Debug.JustUpdateDeviceLine();
_txt = (RemoteObject.concat(RemoteObject.createImmutable("{{ "),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_valuename))),RemoteObject.createImmutable(" }}")));Debug.locals.put("txt", _txt);Debug.locals.put("txt", _txt);
 BA.debugLineNum = 234;BA.debugLine="SetText(txt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_txt));
 BA.debugLineNum = 235;BA.debugLine="SetAttr(\"v-bind:name\", valueName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-bind:name")),(Object)(_valuename));
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
public static RemoteObject  _setvbind(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVBind (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1907);
if (RapidSub.canDelegate("setvbind")) { return __ref.runUserSub(false, "vuehtml","setvbind", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 1907;BA.debugLine="Sub SetVBind(t As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1908;BA.debugLine="t = t.tolowercase";
Debug.JustUpdateDeviceLine();
_t = _t.runMethod(true,"toLowerCase");Debug.locals.put("t", _t);
 BA.debugLineNum = 1909;BA.debugLine="SetAttr(\"v-bind\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-bind")),(Object)(_t));
 BA.debugLineNum = 1910;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1911;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVBindIs (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1913);
if (RapidSub.canDelegate("setvbindis")) { return __ref.runUserSub(false, "vuehtml","setvbindis", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 1913;BA.debugLine="Sub SetVBindIs(t As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1914;BA.debugLine="SetAttr(\"v-bind:is\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-bind:is")),(Object)(_t));
 BA.debugLineNum = 1915;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1916;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVCloak (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("setvcloak")) { return __ref.runUserSub(false, "vuehtml","setvcloak", __ref);}
 BA.debugLineNum = 116;BA.debugLine="Sub SetVCloak As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="SetAttr(\"v-cloak\", \"true\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-cloak")),(Object)(RemoteObject.createImmutable("true")));
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
public static RemoteObject  _setvelse(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVElse (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1929);
if (RapidSub.canDelegate("setvelse")) { return __ref.runUserSub(false, "vuehtml","setvelse", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 1929;BA.debugLine="Sub SetVElse(t As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1930;BA.debugLine="SetAttr(\"v-else\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-else")),(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 1931;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1932;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVElseIf (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1934);
if (RapidSub.canDelegate("setvelseif")) { return __ref.runUserSub(false, "vuehtml","setvelseif", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 1934;BA.debugLine="Sub SetVElseIf(t As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1935;BA.debugLine="SetAttr(\"v-else-if\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-else-if")),(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 1936;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1937;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVFor (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setvfor")) { return __ref.runUserSub(false, "vuehtml","setvfor", __ref, _item, _datasource);}
RemoteObject _sline = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
Debug.locals.put("dataSource", _datasource);
 BA.debugLineNum = 256;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="dataSource = dataSource.tolowercase";
Debug.JustUpdateDeviceLine();
_datasource = _datasource.runMethod(true,"toLowerCase");Debug.locals.put("dataSource", _datasource);
 BA.debugLineNum = 258;BA.debugLine="item = item.tolowercase";
Debug.JustUpdateDeviceLine();
_item = _item.runMethod(true,"toLowerCase");Debug.locals.put("item", _item);
 BA.debugLineNum = 259;BA.debugLine="If ds = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_ds" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 260;BA.debugLine="Log(\"VueHTML.SetValue, you need to run VueHTML.S";
Debug.JustUpdateDeviceLine();
vuehtml.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("VueHTML.SetValue, you need to run VueHTML.SetData first before you set for!")));
 };
 BA.debugLineNum = 262;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
Debug.JustUpdateDeviceLine();
_sline = (RemoteObject.concat(RemoteObject.createImmutable(""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item))),RemoteObject.createImmutable(" in "),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datasource))),RemoteObject.createImmutable("")));Debug.locals.put("sline", _sline);Debug.locals.put("sline", _sline);
 BA.debugLineNum = 263;BA.debugLine="SetAttr(\"v-for\", sline)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-for")),(Object)(_sline));
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
public static RemoteObject  _setvhtml(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetVHtml (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("setvhtml")) { return __ref.runUserSub(false, "vuehtml","setvhtml", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 298;BA.debugLine="Sub SetVHtml(h As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 299;BA.debugLine="If h = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_h,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 300;BA.debugLine="h = h.tolowercase";
Debug.JustUpdateDeviceLine();
_h = _h.runMethod(true,"toLowerCase");Debug.locals.put("h", _h);
 BA.debugLineNum = 301;BA.debugLine="SetAttr(\"v-html\", h)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-html")),(Object)(_h));
 BA.debugLineNum = 302;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 303;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vuehtml","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 283;BA.debugLine="Sub SetVIf(vif As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="SetAttr(\"v-if\", vif)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-if")),(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvlazy(RemoteObject __ref,RemoteObject _varlazyload) throws Exception{
try {
		Debug.PushSubsStack("SetVLazy (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,432);
if (RapidSub.canDelegate("setvlazy")) { return __ref.runUserSub(false, "vuehtml","setvlazy", __ref, _varlazyload);}
Debug.locals.put("varLazyLoad", _varlazyload);
 BA.debugLineNum = 432;BA.debugLine="Sub SetVLazy(varLazyLoad As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 433;BA.debugLine="SetAttr(\"v-lazy\", varLazyLoad)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-lazy")),(Object)(BA.ObjectToString(_varlazyload)));
 BA.debugLineNum = 434;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _varvmodel) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1890);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vuehtml","setvmodel", __ref, _varvmodel);}
Debug.locals.put("varVModel", _varvmodel);
 BA.debugLineNum = 1890;BA.debugLine="Sub SetVModel(varVModel As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1891;BA.debugLine="varVModel = varVModel.tolowercase";
Debug.JustUpdateDeviceLine();
_varvmodel = _varvmodel.runMethod(true,"toLowerCase");Debug.locals.put("varVModel", _varvmodel);
 BA.debugLineNum = 1892;BA.debugLine="SetAttr(\"v-model\", varVModel)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-model")),(Object)(_varvmodel));
 BA.debugLineNum = 1893;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1894;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVOn (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1902);
if (RapidSub.canDelegate("setvon")) { return __ref.runUserSub(false, "vuehtml","setvon", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 1902;BA.debugLine="Sub SetVOn(t As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1903;BA.debugLine="SetAttr(\"v-on\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-on")),(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 1904;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1905;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVOnce (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1918);
if (RapidSub.canDelegate("setvonce")) { return __ref.runUserSub(false, "vuehtml","setvonce", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 1918;BA.debugLine="Sub SetVOnce(t As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1919;BA.debugLine="SetAttr(\"v-once\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-once")),(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 1920;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1921;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vuehtml","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 288;BA.debugLine="Sub SetVShow(vif As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 289;BA.debugLine="SetAttr(\"v-show\", vif)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-show")),(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvtext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVText (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1924);
if (RapidSub.canDelegate("setvtext")) { return __ref.runUserSub(false, "vuehtml","setvtext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 1924;BA.debugLine="Sub SetVText(t As Object) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1925;BA.debugLine="SetAttr(\"v-text\", t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-text")),(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 1926;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1927;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shufflelist(RemoteObject __ref,RemoteObject _pl) throws Exception{
try {
		Debug.PushSubsStack("ShuffleList (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,360);
if (RapidSub.canDelegate("shufflelist")) { return __ref.runUserSub(false, "vuehtml","shufflelist", __ref, _pl);}
int _i = 0;
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("pl", _pl);
 BA.debugLineNum = 360;BA.debugLine="Sub ShuffleList(pl As List) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 361;BA.debugLine="For i = pl.Size - 1 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_pl.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 362;BA.debugLine="Dim j As Int";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 363;BA.debugLine="Dim k As Object";
Debug.JustUpdateDeviceLine();
_k = RemoteObject.createNew ("Object");Debug.locals.put("k", _k);
 BA.debugLineNum = 364;BA.debugLine="j = Rnd(0, i + 1)";
Debug.JustUpdateDeviceLine();
_j = vuehtml.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("j", _j);
 BA.debugLineNum = 365;BA.debugLine="k = pl.Get(j)";
Debug.JustUpdateDeviceLine();
_k = _pl.runMethod(false,"Get",(Object)(_j));Debug.locals.put("k", _k);
 BA.debugLineNum = 366;BA.debugLine="pl.Set(j,pl.Get(i))";
Debug.JustUpdateDeviceLine();
_pl.runVoidMethod ("Set",(Object)(_j),(Object)(_pl.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 367;BA.debugLine="pl.Set(i,k)";
Debug.JustUpdateDeviceLine();
_pl.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _i)),(Object)(_k));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 369;BA.debugLine="Return pl";
Debug.JustUpdateDeviceLine();
if (true) return _pl;
 BA.debugLineNum = 370;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strparse(RemoteObject __ref,RemoteObject _delim,RemoteObject _inputstring) throws Exception{
try {
		Debug.PushSubsStack("StrParse (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2243);
if (RapidSub.canDelegate("strparse")) { return __ref.runUserSub(false, "vuehtml","strparse", __ref, _delim, _inputstring);}
RemoteObject _outlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _commaloc = RemoteObject.createImmutable(0);
RemoteObject _leftside = RemoteObject.createImmutable("");
RemoteObject _rightside = RemoteObject.createImmutable("");
Debug.locals.put("Delim", _delim);
Debug.locals.put("InputString", _inputstring);
 BA.debugLineNum = 2243;BA.debugLine="private Sub StrParse(Delim As String, InputString";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2244;BA.debugLine="Dim OutList As List";
Debug.JustUpdateDeviceLine();
_outlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("OutList", _outlist);
 BA.debugLineNum = 2245;BA.debugLine="Dim CommaLoc As Int";
Debug.JustUpdateDeviceLine();
_commaloc = RemoteObject.createImmutable(0);Debug.locals.put("CommaLoc", _commaloc);
 BA.debugLineNum = 2246;BA.debugLine="OutList.Initialize";
Debug.JustUpdateDeviceLine();
_outlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2247;BA.debugLine="OutList.clear";
Debug.JustUpdateDeviceLine();
_outlist.runVoidMethod ("Clear");
 BA.debugLineNum = 2248;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
Debug.JustUpdateDeviceLine();
_commaloc = _inputstring.runMethod(true,"indexOf",(Object)(_delim));Debug.locals.put("CommaLoc", _commaloc);
 BA.debugLineNum = 2249;BA.debugLine="Do While CommaLoc >-1";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",_commaloc,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 2250;BA.debugLine="Dim LeftSide As String";
Debug.JustUpdateDeviceLine();
_leftside = RemoteObject.createImmutable("");Debug.locals.put("LeftSide", _leftside);
 BA.debugLineNum = 2251;BA.debugLine="LeftSide= InputString.SubString2(0,CommaLoc)";
Debug.JustUpdateDeviceLine();
_leftside = _inputstring.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_commaloc));Debug.locals.put("LeftSide", _leftside);
 BA.debugLineNum = 2252;BA.debugLine="Dim RightSide As String";
Debug.JustUpdateDeviceLine();
_rightside = RemoteObject.createImmutable("");Debug.locals.put("RightSide", _rightside);
 BA.debugLineNum = 2253;BA.debugLine="RightSide= InputString.SubString(CommaLoc+1)";
Debug.JustUpdateDeviceLine();
_rightside = _inputstring.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_commaloc,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("RightSide", _rightside);
 BA.debugLineNum = 2254;BA.debugLine="OutList.Add(LeftSide)";
Debug.JustUpdateDeviceLine();
_outlist.runVoidMethod ("Add",(Object)((_leftside)));
 BA.debugLineNum = 2255;BA.debugLine="InputString=RightSide";
Debug.JustUpdateDeviceLine();
_inputstring = _rightside;Debug.locals.put("InputString", _inputstring);
 BA.debugLineNum = 2256;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
Debug.JustUpdateDeviceLine();
_commaloc = _inputstring.runMethod(true,"indexOf",(Object)(_delim));Debug.locals.put("CommaLoc", _commaloc);
 }
;
 BA.debugLineNum = 2258;BA.debugLine="OutList.Add(InputString)";
Debug.JustUpdateDeviceLine();
_outlist.runVoidMethod ("Add",(Object)((_inputstring)));
 BA.debugLineNum = 2259;BA.debugLine="Return OutList";
Debug.JustUpdateDeviceLine();
if (true) return _outlist;
 BA.debugLineNum = 2260;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toproperty(RemoteObject __ref,RemoteObject _sname,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("ToProperty (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1709);
if (RapidSub.canDelegate("toproperty")) { return __ref.runUserSub(false, "vuehtml","toproperty", __ref, _sname, _svalue);}
RemoteObject _script = RemoteObject.createImmutable("");
Debug.locals.put("sName", _sname);
Debug.locals.put("svalue", _svalue);
 BA.debugLineNum = 1709;BA.debugLine="private Sub ToProperty(sName As String, svalue As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1710;BA.debugLine="sName = CStr(sName)";
Debug.JustUpdateDeviceLine();
_sname = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_sname)));Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1711;BA.debugLine="sName = sName.Trim";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"trim");Debug.locals.put("sName", _sname);
 BA.debugLineNum = 1712;BA.debugLine="Dim script As String = \"\"";
Debug.JustUpdateDeviceLine();
_script = BA.ObjectToString("");Debug.locals.put("script", _script);Debug.locals.put("script", _script);
 BA.debugLineNum = 1713;BA.debugLine="If sName.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_sname.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1714;BA.debugLine="script = $\"${sName}=\"${svalue}\"\"$";
Debug.JustUpdateDeviceLine();
_script = (RemoteObject.concat(RemoteObject.createImmutable(""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sname))),RemoteObject.createImmutable("=\""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_svalue)),RemoteObject.createImmutable("\"")));Debug.locals.put("script", _script);
 BA.debugLineNum = 1715;BA.debugLine="script = script.trim";
Debug.JustUpdateDeviceLine();
_script = _script.runMethod(true,"trim");Debug.locals.put("script", _script);
 BA.debugLineNum = 1716;BA.debugLine="Return script";
Debug.JustUpdateDeviceLine();
if (true) return _script;
 }else {
 BA.debugLineNum = 1718;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 1720;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tosinglequoteproperty(RemoteObject __ref,RemoteObject _sname,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("ToSingleQuoteProperty (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2098);
if (RapidSub.canDelegate("tosinglequoteproperty")) { return __ref.runUserSub(false, "vuehtml","tosinglequoteproperty", __ref, _sname, _svalue);}
RemoteObject _script = RemoteObject.createImmutable("");
Debug.locals.put("sName", _sname);
Debug.locals.put("svalue", _svalue);
 BA.debugLineNum = 2098;BA.debugLine="private Sub ToSingleQuoteProperty(sName As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2099;BA.debugLine="sName = CStr(sName)";
Debug.JustUpdateDeviceLine();
_sname = __ref.runClassMethod (b4j.example.vuehtml.class, "_cstr" /*RemoteObject*/ ,(Object)((_sname)));Debug.locals.put("sName", _sname);
 BA.debugLineNum = 2100;BA.debugLine="sName = sName.Trim";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"trim");Debug.locals.put("sName", _sname);
 BA.debugLineNum = 2101;BA.debugLine="If sName.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_sname.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2102;BA.debugLine="Dim script As String = $\"${sName}='${svalue}'\"$";
Debug.JustUpdateDeviceLine();
_script = (RemoteObject.concat(RemoteObject.createImmutable(""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sname))),RemoteObject.createImmutable("='"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_svalue)),RemoteObject.createImmutable("'")));Debug.locals.put("script", _script);Debug.locals.put("script", _script);
 BA.debugLineNum = 2103;BA.debugLine="script = script.trim";
Debug.JustUpdateDeviceLine();
_script = _script.runMethod(true,"trim");Debug.locals.put("script", _script);
 BA.debugLineNum = 2104;BA.debugLine="Return script";
Debug.JustUpdateDeviceLine();
if (true) return _script;
 }else {
 BA.debugLineNum = 2106;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 2108;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,2297);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vuehtml","tostring", __ref);}
RemoteObject _imgurl = RemoteObject.createImmutable("");
RemoteObject _lnk = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _strcontent = RemoteObject.createImmutable("");
RemoteObject _sout = RemoteObject.createImmutable("");
 BA.debugLineNum = 2297;BA.debugLine="public Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2298;BA.debugLine="If ParentID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_parentid" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 2299;BA.debugLine="ID = ParentID & ID";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_parentid" /*RemoteObject*/ ),__ref.getField(true,"_id" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 2301;BA.debugLine="Select Case Tag";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_tag" /*RemoteObject*/ ),BA.ObjectToString("img"),BA.ObjectToString("script"),BA.ObjectToString("link"))) {
case 0: 
case 1: {
 BA.debugLineNum = 2304;BA.debugLine="Dim imgURL As String = GetAttr(\"src\")";
Debug.JustUpdateDeviceLine();
_imgurl = BA.ObjectToString(__ref.runClassMethod (b4j.example.vuehtml.class, "_getattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("src"))));Debug.locals.put("imgURL", _imgurl);Debug.locals.put("imgURL", _imgurl);
 BA.debugLineNum = 2305;BA.debugLine="If imgURL.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_imgurl.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2306;BA.debugLine="imgURL = imgURL.tolowercase";
Debug.JustUpdateDeviceLine();
_imgurl = _imgurl.runMethod(true,"toLowerCase");Debug.locals.put("imgURL", _imgurl);
 };
 break; }
case 2: {
 BA.debugLineNum = 2309;BA.debugLine="Dim lnk As String = GetAttr(\"href\")";
Debug.JustUpdateDeviceLine();
_lnk = BA.ObjectToString(__ref.runClassMethod (b4j.example.vuehtml.class, "_getattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("href"))));Debug.locals.put("lnk", _lnk);Debug.locals.put("lnk", _lnk);
 BA.debugLineNum = 2310;BA.debugLine="If lnk.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_lnk.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2311;BA.debugLine="lnk = lnk.tolowercase";
Debug.JustUpdateDeviceLine();
_lnk = _lnk.runMethod(true,"toLowerCase");Debug.locals.put("lnk", _lnk);
 };
 break; }
}
;
 BA.debugLineNum = 2314;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2315;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2316;BA.debugLine="sb.Append(SBBefore)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(__ref.getField(false,"_sbbefore" /*RemoteObject*/ ))));
 BA.debugLineNum = 2317;BA.debugLine="sb.Append(Open)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_open" /*RemoteObject*/ )));
 BA.debugLineNum = 2318;BA.debugLine="For Each strContent As String In Contents";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group20 = __ref.getField(false,"_contents" /*RemoteObject*/ );
final int groupLen20 = group20.runMethod(true,"getSize").<Integer>get()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_strcontent = BA.ObjectToString(group20.runMethod(false,"Get",index20));Debug.locals.put("strContent", _strcontent);
Debug.locals.put("strContent", _strcontent);
 BA.debugLineNum = 2319;BA.debugLine="If strContent.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_strcontent.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2320;BA.debugLine="strContent = strContent.trim";
Debug.JustUpdateDeviceLine();
_strcontent = _strcontent.runMethod(true,"trim");Debug.locals.put("strContent", _strcontent);
 BA.debugLineNum = 2321;BA.debugLine="sb.Append(strContent.trim)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_strcontent.runMethod(true,"trim")));
 };
 }
}Debug.locals.put("strContent", _strcontent);
;
 BA.debugLineNum = 2324;BA.debugLine="sb.Append(Close)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_close" /*RemoteObject*/ )));
 BA.debugLineNum = 2325;BA.debugLine="Dim sout As String = sb.ToString";
Debug.JustUpdateDeviceLine();
_sout = _sb.runMethod(true,"ToString");Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2326;BA.debugLine="If DontBreak.IndexOf(Tag) <> -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_dontbreak" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((__ref.getField(true,"_tag" /*RemoteObject*/ )))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 2327;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
Debug.JustUpdateDeviceLine();
_sout = _sout.runMethod(true,"replace",(Object)(vuehtml.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sout", _sout);
 };
 BA.debugLineNum = 2330;BA.debugLine="sout = sout & SBAfter.tostring";
Debug.JustUpdateDeviceLine();
_sout = RemoteObject.concat(_sout,__ref.getField(false,"_sbafter" /*RemoteObject*/ ).runMethod(true,"ToString"));Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2331;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
Debug.JustUpdateDeviceLine();
_sout = _sout.runMethod(true,"replace",(Object)(vuehtml.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2332;BA.debugLine="sout = sout.Replace(\"  >\",\">\")";
Debug.JustUpdateDeviceLine();
_sout = _sout.runMethod(true,"replace",(Object)(BA.ObjectToString("  >")),(Object)(RemoteObject.createImmutable(">")));Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2333;BA.debugLine="sout = sout.Replace(\" >\",\">\")";
Debug.JustUpdateDeviceLine();
_sout = _sout.runMethod(true,"replace",(Object)(BA.ObjectToString(" >")),(Object)(RemoteObject.createImmutable(">")));Debug.locals.put("sout", _sout);
 BA.debugLineNum = 2334;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
if (true) return _sout;
 BA.debugLineNum = 2335;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostyle(RemoteObject __ref,RemoteObject _sname,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ToStyle (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1852);
if (RapidSub.canDelegate("tostyle")) { return __ref.runUserSub(false, "vuehtml","tostyle", __ref, _sname, _value);}
RemoteObject _ew = RemoteObject.createImmutable(false);
RemoteObject _sout = RemoteObject.createImmutable("");
Debug.locals.put("sName", _sname);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1852;BA.debugLine="private Sub ToStyle(sName As String, value As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1853;BA.debugLine="If sName.Length > 0 And value.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_sname.runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_value.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1854;BA.debugLine="Dim ew As Boolean = sName.EndsWith(\":\")";
Debug.JustUpdateDeviceLine();
_ew = _sname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("ew", _ew);Debug.locals.put("ew", _ew);
 BA.debugLineNum = 1855;BA.debugLine="If ew Then";
Debug.JustUpdateDeviceLine();
if (_ew.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1856;BA.debugLine="sName = MvField(sName,1,\":\")";
Debug.JustUpdateDeviceLine();
_sname = __ref.runClassMethod (b4j.example.vuehtml.class, "_mvfield" /*RemoteObject*/ ,(Object)(_sname),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable(":")));Debug.locals.put("sName", _sname);
 };
 BA.debugLineNum = 1858;BA.debugLine="Dim sout As String = $\"${sName}:${value};\"$";
Debug.JustUpdateDeviceLine();
_sout = (RemoteObject.concat(RemoteObject.createImmutable(""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sname))),RemoteObject.createImmutable(":"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable(";")));Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 1859;BA.debugLine="If sout = \":;\" Then sout = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sout,BA.ObjectToString(":;"))) { 
_sout = BA.ObjectToString("");Debug.locals.put("sout", _sout);};
 BA.debugLineNum = 1860;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
if (true) return _sout;
 }else {
 BA.debugLineNum = 1862;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 1864;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateattribute(RemoteObject __ref,RemoteObject _name,RemoteObject _propvalue) throws Exception{
try {
		Debug.PushSubsStack("UpdateAttribute (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,1290);
if (RapidSub.canDelegate("updateattribute")) { return __ref.runUserSub(false, "vuehtml","updateattribute", __ref, _name, _propvalue);}
RemoteObject _svalue = RemoteObject.declareNull("Object");
Debug.locals.put("name", _name);
Debug.locals.put("propValue", _propvalue);
 BA.debugLineNum = 1290;BA.debugLine="Sub UpdateAttribute(name As String, propValue As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1291;BA.debugLine="If properties.ContainsKey(name) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_name))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1292;BA.debugLine="Dim svalue As Object = properties.Get(name)";
Debug.JustUpdateDeviceLine();
_svalue = __ref.getField(false,"_properties" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name)));Debug.locals.put("svalue", _svalue);Debug.locals.put("svalue", _svalue);
 BA.debugLineNum = 1293;BA.debugLine="svalue = svalue & \";\" & propValue";
Debug.JustUpdateDeviceLine();
_svalue = (RemoteObject.concat(_svalue,RemoteObject.createImmutable(";"),_propvalue));Debug.locals.put("svalue", _svalue);
 BA.debugLineNum = 1294;BA.debugLine="properties.Put(name,svalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_properties" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_name)),(Object)(_svalue));
 }else {
 BA.debugLineNum = 1296;BA.debugLine="properties.Put(name,propValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_properties" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_name)),(Object)(_propvalue));
 };
 BA.debugLineNum = 1298;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _usetheme(RemoteObject __ref,RemoteObject _sprefix,RemoteObject _themename) throws Exception{
try {
		Debug.PushSubsStack("UseTheme (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,948);
if (RapidSub.canDelegate("usetheme")) { return __ref.runUserSub(false, "vuehtml","usetheme", __ref, _sprefix, _themename);}
Debug.locals.put("sPrefix", _sprefix);
Debug.locals.put("themeName", _themename);
 BA.debugLineNum = 948;BA.debugLine="Sub UseTheme(sPrefix As String, themeName As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 949;BA.debugLine="If themeName = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_themename,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 950;BA.debugLine="themeName = themeName.tolowercase";
Debug.JustUpdateDeviceLine();
_themename = _themename.runMethod(true,"toLowerCase");Debug.locals.put("themeName", _themename);
 BA.debugLineNum = 951;BA.debugLine="If sPrefix <> \"\" And themeName <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_sprefix,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_themename,BA.ObjectToString(""))) { 
 BA.debugLineNum = 952;BA.debugLine="AddClass($\"${sPrefix}-${themeName}\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sprefix))),RemoteObject.createImmutable("-"),vuehtml.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_themename))),RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 954;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 955;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _wrap(RemoteObject __ref,RemoteObject _wid,RemoteObject _wraptype) throws Exception{
try {
		Debug.PushSubsStack("Wrap (vuehtml) ","vuehtml",109,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("wrap")) { return __ref.runUserSub(false, "vuehtml","wrap", __ref, _wid, _wraptype);}
RemoteObject _p = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("wid", _wid);
Debug.locals.put("wrapType", _wraptype);
 BA.debugLineNum = 450;BA.debugLine="Sub Wrap(wid As String, wrapType As String) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 451;BA.debugLine="Dim p As VueHTML";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("p", _p);
 BA.debugLineNum = 452;BA.debugLine="p.Initialize(wid,wrapType)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_wid),(Object)(_wraptype));
 BA.debugLineNum = 453;BA.debugLine="p.AddContent(HTML)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vuehtml.class, "_addcontent" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vuehtml.class, "_html" /*RemoteObject*/ )));
 BA.debugLineNum = 454;BA.debugLine="Return p";
Debug.JustUpdateDeviceLine();
if (true) return _p;
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}