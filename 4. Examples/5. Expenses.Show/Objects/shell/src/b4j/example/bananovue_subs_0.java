package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bananovue_subs_0 {


public static RemoteObject  _addcomponent(RemoteObject __ref,RemoteObject _comp) throws Exception{
try {
		Debug.PushSubsStack("AddComponent (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1633);
if (RapidSub.canDelegate("addcomponent")) { return __ref.runUserSub(false, "bananovue","addcomponent", __ref, _comp);}
RemoteObject _sid = RemoteObject.createImmutable("");
Debug.locals.put("comp", _comp);
 BA.debugLineNum = 1633;BA.debugLine="Sub AddComponent(comp As VueComponent) As BANanoVu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1634;BA.debugLine="Dim sid As String = comp.id";
Debug.JustUpdateDeviceLine();
_sid = _comp.getField(true,"_id" /*RemoteObject*/ );Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1635;BA.debugLine="components.Put(sid, comp.Component)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_components" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_sid)),(Object)((_comp.runClassMethod (b4j.example.vuecomponent.class, "_component" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _addcomponentbo(RemoteObject __ref,RemoteObject _compname,RemoteObject _comp) throws Exception{
try {
		Debug.PushSubsStack("AddComponentBO (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1639);
if (RapidSub.canDelegate("addcomponentbo")) { return __ref.runUserSub(false, "bananovue","addcomponentbo", __ref, _compname, _comp);}
Debug.locals.put("compName", _compname);
Debug.locals.put("comp", _comp);
 BA.debugLineNum = 1639;BA.debugLine="Sub AddComponentBO(compName As String, comp As BAN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1640;BA.debugLine="components.Put(compName, comp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_components" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_compname)),(Object)((_comp.getObject())));
 BA.debugLineNum = 1641;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1642;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addroute(RemoteObject __ref,RemoteObject _path,RemoteObject _comp) throws Exception{
try {
		Debug.PushSubsStack("AddRoute (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1645);
if (RapidSub.canDelegate("addroute")) { return __ref.runUserSub(false, "bananovue","addroute", __ref, _path, _comp);}
RemoteObject _eachroute = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("path", _path);
Debug.locals.put("comp", _comp);
 BA.debugLineNum = 1645;BA.debugLine="Sub AddRoute(path As String, comp As VueComponent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1646;BA.debugLine="If comp.name = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_comp.getField(true,"_name" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1647;BA.debugLine="Log(\"AddRoute: Please specify the name of the Ro";
Debug.JustUpdateDeviceLine();
bananovue.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("AddRoute: Please specify the name of the Route!")));
 };
 BA.debugLineNum = 1650;BA.debugLine="Dim eachroute As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_eachroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_eachroute = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("eachroute", _eachroute);Debug.locals.put("eachroute", _eachroute);
 BA.debugLineNum = 1651;BA.debugLine="eachroute.Put(\"path\", path)";
Debug.JustUpdateDeviceLine();
_eachroute.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("path"))),(Object)((_path)));
 BA.debugLineNum = 1652;BA.debugLine="eachroute.Put(\"name\", comp.name)";
Debug.JustUpdateDeviceLine();
_eachroute.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_comp.getField(true,"_name" /*RemoteObject*/ ))));
 BA.debugLineNum = 1653;BA.debugLine="eachroute.Put(\"component\", comp.component)";
Debug.JustUpdateDeviceLine();
_eachroute.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("component"))),(Object)((_comp.runClassMethod (b4j.example.vuecomponent.class, "_component" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 1655;BA.debugLine="routes.Add(eachroute)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_routes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_eachroute.getObject())));
 BA.debugLineNum = 1656;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _aftertodayrg(RemoteObject __ref,RemoteObject _dvariance) throws Exception{
try {
		Debug.PushSubsStack("AfterTodayRG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2519);
if (RapidSub.canDelegate("aftertodayrg")) { return __ref.runUserSub(false, "bananovue","aftertodayrg", __ref, _dvariance);}
Debug.locals.put("dVariance", _dvariance);
 BA.debugLineNum = 2519;BA.debugLine="public Sub AfterTodayRG(dVariance As Long) As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2520;BA.debugLine="If dVariance <= 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_dvariance,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2521;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 }else 
{ BA.debugLineNum = 2522;BA.debugLine="else if dVariance > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_dvariance,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2523;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 }else {
 BA.debugLineNum = 2525;BA.debugLine="Return \"./assets/gray.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/gray.png");
 }}
;
 BA.debugLineNum = 2527;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _age(RemoteObject __ref,RemoteObject _birthday) throws Exception{
try {
		Debug.PushSubsStack("Age (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("age")) { return __ref.runUserSub(false, "bananovue","age", __ref, _birthday);}
RemoteObject _tday = RemoteObject.createImmutable("");
RemoteObject _cday = RemoteObject.createImmutable("");
RemoteObject _adays = RemoteObject.createImmutable(0);
RemoteObject _ayears = RemoteObject.createImmutable(0);
Debug.locals.put("birthDay", _birthday);
 BA.debugLineNum = 446;BA.debugLine="Sub Age(birthDay As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 447;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 448;BA.debugLine="Dim tDay As String = DateTime.Date(DateTime.Now)";
Debug.JustUpdateDeviceLine();
_tday = bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(bananovue.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("tDay", _tday);Debug.locals.put("tDay", _tday);
 BA.debugLineNum = 449;BA.debugLine="Dim cDay As String = DateTime.Date(DateTime.DateP";
Debug.JustUpdateDeviceLine();
_cday = bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(bananovue.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_birthday))));Debug.locals.put("cDay", _cday);Debug.locals.put("cDay", _cday);
 BA.debugLineNum = 450;BA.debugLine="Dim aDays As Int = DateDiff(tDay, cDay)";
Debug.JustUpdateDeviceLine();
_adays = __ref.runClassMethod (b4j.example.bananovue.class, "_datediff" /*RemoteObject*/ ,(Object)(_tday),(Object)(_cday));Debug.locals.put("aDays", _adays);Debug.locals.put("aDays", _adays);
 BA.debugLineNum = 451;BA.debugLine="Dim aYears As Int = aDays / 365.25";
Debug.JustUpdateDeviceLine();
_ayears = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_adays,RemoteObject.createImmutable(365.25)}, "/",0, 0));Debug.locals.put("aYears", _ayears);Debug.locals.put("aYears", _ayears);
 BA.debugLineNum = 452;BA.debugLine="Return BANAno.parseInt(aYears)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_ayears)));
 BA.debugLineNum = 453;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _alpha(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Alpha (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,575);
if (RapidSub.canDelegate("alpha")) { return __ref.runUserSub(false, "bananovue","alpha", __ref, _value);}
RemoteObject _sout = RemoteObject.createImmutable("");
RemoteObject _mout = RemoteObject.createImmutable("");
RemoteObject _slen = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 575;BA.debugLine="Public Sub Alpha(value As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 576;BA.debugLine="value = CStr(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_value)));Debug.locals.put("value", _value);
 BA.debugLineNum = 577;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 578;BA.debugLine="value = value.Trim";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"trim");Debug.locals.put("value", _value);
 BA.debugLineNum = 579;BA.debugLine="If value = \"\" Then value = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
_value = BA.ObjectToString("");Debug.locals.put("value", _value);};
 BA.debugLineNum = 580;BA.debugLine="Dim sout As String = \"\"";
Debug.JustUpdateDeviceLine();
_sout = BA.ObjectToString("");Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 581;BA.debugLine="Dim mout As String = \"\"";
Debug.JustUpdateDeviceLine();
_mout = BA.ObjectToString("");Debug.locals.put("mout", _mout);Debug.locals.put("mout", _mout);
 BA.debugLineNum = 582;BA.debugLine="Dim slen As Int = value.Length";
Debug.JustUpdateDeviceLine();
_slen = _value.runMethod(true,"length");Debug.locals.put("slen", _slen);Debug.locals.put("slen", _slen);
 BA.debugLineNum = 583;BA.debugLine="Dim i As Int = 0";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 584;BA.debugLine="For i = 0 To slen - 1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_slen,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 585;BA.debugLine="mout = value.CharAt(i)";
Debug.JustUpdateDeviceLine();
_mout = BA.ObjectToString(_value.runMethod(true,"charAt",(Object)(_i)));Debug.locals.put("mout", _mout);
 BA.debugLineNum = 586;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.example.bananovue.class, "_instr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")),(Object)(_mout)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 587;BA.debugLine="sout = sout & mout";
Debug.JustUpdateDeviceLine();
_sout = RemoteObject.concat(_sout,_mout);Debug.locals.put("sout", _sout);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 590;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _sout;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 592;BA.debugLine="Return value";
Debug.JustUpdateDeviceLine();
if (true) return _value;
 };
 BA.debugLineNum = 594;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audittrail(RemoteObject __ref,RemoteObject _oldm,RemoteObject _newm) throws Exception{
try {
		Debug.PushSubsStack("AuditTrail (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1670);
if (RapidSub.canDelegate("audittrail")) { return __ref.runUserSub(false, "bananovue","audittrail", __ref, _oldm, _newm);}
RemoteObject _df = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
RemoteObject _nv = RemoteObject.declareNull("Object");
RemoteObject _ov = RemoteObject.declareNull("Object");
Debug.locals.put("oldM", _oldm);
Debug.locals.put("newM", _newm);
 BA.debugLineNum = 1670;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1671;BA.debugLine="Dim df As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_df = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_df = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 1672;BA.debugLine="For Each k As String In oldM.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _oldm.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1673;BA.debugLine="Dim v As Object = oldM.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _oldm.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1674;BA.debugLine="If newM.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_newm.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1675;BA.debugLine="Dim nv As Object = newM.Get(k)";
Debug.JustUpdateDeviceLine();
_nv = _newm.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("nv", _nv);Debug.locals.put("nv", _nv);
 BA.debugLineNum = 1676;BA.debugLine="If v <> nv Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_v,_nv)) { 
 BA.debugLineNum = 1677;BA.debugLine="df.Put(k, nv)";
Debug.JustUpdateDeviceLine();
_df.runVoidMethod ("Put",(Object)((_k)),(Object)(_nv));
 };
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1681;BA.debugLine="For Each k As String In newM.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group11 = _newm.runMethod(false,"Keys");
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_k = BA.ObjectToString(group11.runMethod(false,"Get",index11));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1682;BA.debugLine="Dim v As Object = newM.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _newm.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1683;BA.debugLine="If oldM.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_oldm.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1684;BA.debugLine="Dim ov As Object = oldM.Get(k)";
Debug.JustUpdateDeviceLine();
_ov = _oldm.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("ov", _ov);Debug.locals.put("ov", _ov);
 BA.debugLineNum = 1685;BA.debugLine="If v <> ov Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_v,_ov)) { 
 BA.debugLineNum = 1686;BA.debugLine="df.Put(k, v)";
Debug.JustUpdateDeviceLine();
_df.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 };
 }else {
 BA.debugLineNum = 1689;BA.debugLine="df.Put(k, v)";
Debug.JustUpdateDeviceLine();
_df.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1692;BA.debugLine="Return df";
Debug.JustUpdateDeviceLine();
if (true) return _df;
 BA.debugLineNum = 1693;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _br(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BR (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1499);
if (RapidSub.canDelegate("br")) { return __ref.runUserSub(false, "bananovue","br", __ref);}
 BA.debugLineNum = 1499;BA.debugLine="Sub BR As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1500;BA.debugLine="Return \"<br>\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("<br>");
 BA.debugLineNum = 1501;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callcomputed(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("CallComputed (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1938);
if (RapidSub.canDelegate("callcomputed")) { return __ref.runUserSub(false, "bananovue","callcomputed", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1938;BA.debugLine="Sub CallComputed(methodName As String) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1939;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1940;BA.debugLine="Return BOVue.GetField(methodName)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_methodname)).getObject());
 BA.debugLineNum = 1941;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callmethod(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("CallMethod (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1943);
if (RapidSub.canDelegate("callmethod")) { return __ref.runUserSub(false, "bananovue","callmethod", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1943;BA.debugLine="Sub CallMethod(methodName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1944;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1945;BA.debugLine="BOVue.RunMethod(methodName, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(_methodname),(Object)(bananovue.__c.getField(false,"Null")));
 BA.debugLineNum = 1946;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _capitalize(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("Capitalize (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,882);
if (RapidSub.canDelegate("capitalize")) { return __ref.runUserSub(false, "bananovue","capitalize", __ref, _t);}
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _r = RemoteObject.createImmutable("");
RemoteObject _o = RemoteObject.createImmutable("");
Debug.locals.put("t", _t);
 BA.debugLineNum = 882;BA.debugLine="Sub Capitalize(t As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 883;BA.debugLine="Dim s , r , o As String";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createImmutable("");Debug.locals.put("s", _s);
_r = RemoteObject.createImmutable("");Debug.locals.put("r", _r);
_o = RemoteObject.createImmutable("");Debug.locals.put("o", _o);
 BA.debugLineNum = 884;BA.debugLine="s = t.SubString2(0,1)";
Debug.JustUpdateDeviceLine();
_s = _t.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("s", _s);
 BA.debugLineNum = 885;BA.debugLine="r = t.SubString2(1, t.Length)";
Debug.JustUpdateDeviceLine();
_r = _t.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(_t.runMethod(true,"length")));Debug.locals.put("r", _r);
 BA.debugLineNum = 886;BA.debugLine="o = s.ToUpperCase & r";
Debug.JustUpdateDeviceLine();
_o = RemoteObject.concat(_s.runMethod(true,"toUpperCase"),_r);Debug.locals.put("o", _o);
 BA.debugLineNum = 887;BA.debugLine="Return o";
Debug.JustUpdateDeviceLine();
if (true) return _o;
 BA.debugLineNum = 888;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cdbl(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CDbl (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("cdbl")) { return __ref.runUserSub(false, "bananovue","cdbl", __ref, _value);}
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 467;BA.debugLine="Public Sub CDbl(value As String) As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 468;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 469;BA.debugLine="value = value.Trim";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"trim");Debug.locals.put("value", _value);
 BA.debugLineNum = 470;BA.debugLine="If value = \"\" Then value = \"0\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
_value = BA.ObjectToString("0");Debug.locals.put("value", _value);};
 BA.debugLineNum = 471;BA.debugLine="value = value.Replace(\",\",\"\")";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("value", _value);
 BA.debugLineNum = 472;BA.debugLine="Dim out As Double = NumberFormat2(value,0,2,2,Fa";
Debug.JustUpdateDeviceLine();
_out = BA.numberCast(double.class, bananovue.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _value)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(bananovue.__c.getField(true,"False"))));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 473;BA.debugLine="Return out";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _out;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 475;BA.debugLine="Return value";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, _value);
 };
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cint(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CInt (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,708);
if (RapidSub.canDelegate("cint")) { return __ref.runUserSub(false, "bananovue","cint", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 708;BA.debugLine="Sub CInt(o As Object) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 709;BA.debugLine="Return Floor(o)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, bananovue.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _o))));
 BA.debugLineNum = 710;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type FileObject(FileName As String, FileDate As S";
;
 //BA.debugLineNum = 4;BA.debugLine="Public BOVue As BANanoObject";
bananovue._bovue = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_bovue",bananovue._bovue);
 //BA.debugLineNum = 5;BA.debugLine="Private BANAno As BANano  'ignore";
bananovue._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananovue._banano);
 //BA.debugLineNum = 6;BA.debugLine="Private methods As Map";
bananovue._methods = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_methods",bananovue._methods);
 //BA.debugLineNum = 7;BA.debugLine="Public data As Map";
bananovue._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_data",bananovue._data);
 //BA.debugLineNum = 8;BA.debugLine="Public refs As Map";
bananovue._refs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_refs",bananovue._refs);
 //BA.debugLineNum = 9;BA.debugLine="Public body As BANanoElement";
bananovue._body = RemoteObject.createNew ("com.ab.banano.BANanoElement");__ref.setField("_body",bananovue._body);
 //BA.debugLineNum = 10;BA.debugLine="Public Template As VueHTML";
bananovue._template = RemoteObject.createNew ("b4j.example.vuehtml");__ref.setField("_template",bananovue._template);
 //BA.debugLineNum = 11;BA.debugLine="Private computed As Map";
bananovue._computed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_computed",bananovue._computed);
 //BA.debugLineNum = 12;BA.debugLine="Private watches As Map";
bananovue._watches = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_watches",bananovue._watches);
 //BA.debugLineNum = 13;BA.debugLine="Private created As BANanoObject";
bananovue._created = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_created",bananovue._created);
 //BA.debugLineNum = 14;BA.debugLine="Private mounted As BANanoObject";
bananovue._mounted = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_mounted",bananovue._mounted);
 //BA.debugLineNum = 15;BA.debugLine="Private beforeCreate As BANanoObject";
bananovue._beforecreate = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_beforecreate",bananovue._beforecreate);
 //BA.debugLineNum = 16;BA.debugLine="Private destroyed As BANanoObject";
bananovue._destroyed = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_destroyed",bananovue._destroyed);
 //BA.debugLineNum = 17;BA.debugLine="Private beforeMount As BANanoObject";
bananovue._beforemount = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_beforemount",bananovue._beforemount);
 //BA.debugLineNum = 18;BA.debugLine="Private updated As BANanoObject";
bananovue._updated = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_updated",bananovue._updated);
 //BA.debugLineNum = 19;BA.debugLine="Private beforeDestroy As BANanoObject";
bananovue._beforedestroy = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_beforedestroy",bananovue._beforedestroy);
 //BA.debugLineNum = 20;BA.debugLine="Private activated As BANanoObject";
bananovue._activated = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_activated",bananovue._activated);
 //BA.debugLineNum = 21;BA.debugLine="Private deactivated As BANanoObject";
bananovue._deactivated = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_deactivated",bananovue._deactivated);
 //BA.debugLineNum = 22;BA.debugLine="Private beforeUpdate As BANanoObject";
bananovue._beforeupdate = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_beforeupdate",bananovue._beforeupdate);
 //BA.debugLineNum = 23;BA.debugLine="Private TypeOfString As BANanoObject   'ignore";
bananovue._typeofstring = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_typeofstring",bananovue._typeofstring);
 //BA.debugLineNum = 24;BA.debugLine="Private TypeOfNumber As BANanoObject   'ignore";
bananovue._typeofnumber = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_typeofnumber",bananovue._typeofnumber);
 //BA.debugLineNum = 25;BA.debugLine="Private TypeOfBoolean As BANanoObject  'ignore";
bananovue._typeofboolean = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_typeofboolean",bananovue._typeofboolean);
 //BA.debugLineNum = 26;BA.debugLine="Private TypeOfArray As BANanoObject    'ignore";
bananovue._typeofarray = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_typeofarray",bananovue._typeofarray);
 //BA.debugLineNum = 27;BA.debugLine="Private TypeOfObject As BANanoObject   'ignore";
bananovue._typeofobject = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_typeofobject",bananovue._typeofobject);
 //BA.debugLineNum = 28;BA.debugLine="Private TypeOfDate As BANanoObject     'ignore";
bananovue._typeofdate = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_typeofdate",bananovue._typeofdate);
 //BA.debugLineNum = 29;BA.debugLine="Private TypeOfFunction As BANanoObject  'ignore";
bananovue._typeoffunction = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_typeoffunction",bananovue._typeoffunction);
 //BA.debugLineNum = 30;BA.debugLine="Private TypeOfSymbol As BANanoObject    'ignore";
bananovue._typeofsymbol = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_typeofsymbol",bananovue._typeofsymbol);
 //BA.debugLineNum = 31;BA.debugLine="Private BORouter As BANanoObject      'ignore";
bananovue._borouter = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_borouter",bananovue._borouter);
 //BA.debugLineNum = 32;BA.debugLine="Private routes As List";
bananovue._routes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_routes",bananovue._routes);
 //BA.debugLineNum = 33;BA.debugLine="Private components As Map";
bananovue._components = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_components",bananovue._components);
 //BA.debugLineNum = 34;BA.debugLine="Public Options As Map";
bananovue._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",bananovue._options);
 //BA.debugLineNum = 35;BA.debugLine="Private dynamicStyle As Map";
bananovue._dynamicstyle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dynamicstyle",bananovue._dynamicstyle);
 //BA.debugLineNum = 36;BA.debugLine="Public JQuery As BANanoObject";
bananovue._jquery = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_jquery",bananovue._jquery);
 //BA.debugLineNum = 37;BA.debugLine="Public GetTemplate As String";
bananovue._gettemplate = RemoteObject.createImmutable("");__ref.setField("_gettemplate",bananovue._gettemplate);
 //BA.debugLineNum = 38;BA.debugLine="Public const colors_red As String = \"#F44336\"";
bananovue._colors_red = BA.ObjectToString("#F44336");__ref.setField("_colors_red",bananovue._colors_red);
 //BA.debugLineNum = 39;BA.debugLine="Public const colors_pink As String = \"#E91E63\"";
bananovue._colors_pink = BA.ObjectToString("#E91E63");__ref.setField("_colors_pink",bananovue._colors_pink);
 //BA.debugLineNum = 40;BA.debugLine="Public const colors_purple As String = \"#9C27B0\"";
bananovue._colors_purple = BA.ObjectToString("#9C27B0");__ref.setField("_colors_purple",bananovue._colors_purple);
 //BA.debugLineNum = 41;BA.debugLine="Public const colors_deepPurple As String = \"#673A";
bananovue._colors_deeppurple = BA.ObjectToString("#673AB7");__ref.setField("_colors_deeppurple",bananovue._colors_deeppurple);
 //BA.debugLineNum = 42;BA.debugLine="Public const colors_indigo As String = \"#3F51B5\"";
bananovue._colors_indigo = BA.ObjectToString("#3F51B5");__ref.setField("_colors_indigo",bananovue._colors_indigo);
 //BA.debugLineNum = 43;BA.debugLine="Public const colors_blue As String = \"#2196F3\"";
bananovue._colors_blue = BA.ObjectToString("#2196F3");__ref.setField("_colors_blue",bananovue._colors_blue);
 //BA.debugLineNum = 44;BA.debugLine="Public const colors_lightBlue As String = \"#03A9F";
bananovue._colors_lightblue = BA.ObjectToString("#03A9F4");__ref.setField("_colors_lightblue",bananovue._colors_lightblue);
 //BA.debugLineNum = 45;BA.debugLine="Public const colors_cyan As String = \"#00BCD4\"";
bananovue._colors_cyan = BA.ObjectToString("#00BCD4");__ref.setField("_colors_cyan",bananovue._colors_cyan);
 //BA.debugLineNum = 46;BA.debugLine="Public const colors_teal As String = \"#009688\"";
bananovue._colors_teal = BA.ObjectToString("#009688");__ref.setField("_colors_teal",bananovue._colors_teal);
 //BA.debugLineNum = 47;BA.debugLine="Public const colors_green As String = \"#4CAF50\"";
bananovue._colors_green = BA.ObjectToString("#4CAF50");__ref.setField("_colors_green",bananovue._colors_green);
 //BA.debugLineNum = 48;BA.debugLine="Public const colors_lightGreen As String = \"#8BC3";
bananovue._colors_lightgreen = BA.ObjectToString("#8BC34A");__ref.setField("_colors_lightgreen",bananovue._colors_lightgreen);
 //BA.debugLineNum = 49;BA.debugLine="Public const colors_lime As String = \"#CDDC39\"";
bananovue._colors_lime = BA.ObjectToString("#CDDC39");__ref.setField("_colors_lime",bananovue._colors_lime);
 //BA.debugLineNum = 50;BA.debugLine="Public const colors_yellow As String = \"#ffe821\"";
bananovue._colors_yellow = BA.ObjectToString("#ffe821");__ref.setField("_colors_yellow",bananovue._colors_yellow);
 //BA.debugLineNum = 51;BA.debugLine="Public const colors_amber As String = \"#FFC107\"";
bananovue._colors_amber = BA.ObjectToString("#FFC107");__ref.setField("_colors_amber",bananovue._colors_amber);
 //BA.debugLineNum = 52;BA.debugLine="Public const colors_orange As String = \"#FF9800\"";
bananovue._colors_orange = BA.ObjectToString("#FF9800");__ref.setField("_colors_orange",bananovue._colors_orange);
 //BA.debugLineNum = 53;BA.debugLine="Public const colors_deepOrange As String = \"#FF57";
bananovue._colors_deeporange = BA.ObjectToString("#FF5722");__ref.setField("_colors_deeporange",bananovue._colors_deeporange);
 //BA.debugLineNum = 54;BA.debugLine="Public const colors_brown As String = \"#795548\"";
bananovue._colors_brown = BA.ObjectToString("#795548");__ref.setField("_colors_brown",bananovue._colors_brown);
 //BA.debugLineNum = 55;BA.debugLine="Public const colors_grey As String = \"#9E9E9E\"";
bananovue._colors_grey = BA.ObjectToString("#9E9E9E");__ref.setField("_colors_grey",bananovue._colors_grey);
 //BA.debugLineNum = 56;BA.debugLine="Public const colors_blueGrey As String = \"#607D8B";
bananovue._colors_bluegrey = BA.ObjectToString("#607D8B");__ref.setField("_colors_bluegrey",bananovue._colors_bluegrey);
 //BA.debugLineNum = 57;BA.debugLine="Public const colors_black As String = \"#000000\"";
bananovue._colors_black = BA.ObjectToString("#000000");__ref.setField("_colors_black",bananovue._colors_black);
 //BA.debugLineNum = 58;BA.debugLine="Public const colors_white As String = \"#ffffff\"";
bananovue._colors_white = BA.ObjectToString("#ffffff");__ref.setField("_colors_white",bananovue._colors_white);
 //BA.debugLineNum = 59;BA.debugLine="Public const colors_transparent As String = \"tran";
bananovue._colors_transparent = BA.ObjectToString("transparent");__ref.setField("_colors_transparent",bananovue._colors_transparent);
 //BA.debugLineNum = 61;BA.debugLine="Public const BORDER_DEFAULT As String = \"\"";
bananovue._border_default = BA.ObjectToString("");__ref.setField("_border_default",bananovue._border_default);
 //BA.debugLineNum = 62;BA.debugLine="Public const BORDER_DASHED As String = \"dashed\"";
bananovue._border_dashed = BA.ObjectToString("dashed");__ref.setField("_border_dashed",bananovue._border_dashed);
 //BA.debugLineNum = 63;BA.debugLine="Public const BORDER_DOTTED As String = \"dotted\"";
bananovue._border_dotted = BA.ObjectToString("dotted");__ref.setField("_border_dotted",bananovue._border_dotted);
 //BA.debugLineNum = 64;BA.debugLine="Public const BORDER_DOUBLE As String = \"double\"";
bananovue._border_double = BA.ObjectToString("double");__ref.setField("_border_double",bananovue._border_double);
 //BA.debugLineNum = 65;BA.debugLine="Public const BORDER_GROOVE As String = \"groove\"";
bananovue._border_groove = BA.ObjectToString("groove");__ref.setField("_border_groove",bananovue._border_groove);
 //BA.debugLineNum = 66;BA.debugLine="Public const BORDER_HIDDEN As String = \"hidden\"";
bananovue._border_hidden = BA.ObjectToString("hidden");__ref.setField("_border_hidden",bananovue._border_hidden);
 //BA.debugLineNum = 67;BA.debugLine="Public const BORDER_INSET As String = \"inset\"";
bananovue._border_inset = BA.ObjectToString("inset");__ref.setField("_border_inset",bananovue._border_inset);
 //BA.debugLineNum = 68;BA.debugLine="Public const BORDER_NONE As String = \"none\"";
bananovue._border_none = BA.ObjectToString("none");__ref.setField("_border_none",bananovue._border_none);
 //BA.debugLineNum = 69;BA.debugLine="Public const BORDER_OUTSET As String = \"outset\"";
bananovue._border_outset = BA.ObjectToString("outset");__ref.setField("_border_outset",bananovue._border_outset);
 //BA.debugLineNum = 70;BA.debugLine="Public const BORDER_RIDGE As String = \"ridge\"";
bananovue._border_ridge = BA.ObjectToString("ridge");__ref.setField("_border_ridge",bananovue._border_ridge);
 //BA.debugLineNum = 71;BA.debugLine="Public const BORDER_SOLID As String = \"solid\"";
bananovue._border_solid = BA.ObjectToString("solid");__ref.setField("_border_solid",bananovue._border_solid);
 //BA.debugLineNum = 73;BA.debugLine="Public const COLOR_AMBER As String = \"amber\"";
bananovue._color_amber = BA.ObjectToString("amber");__ref.setField("_color_amber",bananovue._color_amber);
 //BA.debugLineNum = 74;BA.debugLine="Public const COLOR_BLACK As String = \"black\"";
bananovue._color_black = BA.ObjectToString("black");__ref.setField("_color_black",bananovue._color_black);
 //BA.debugLineNum = 75;BA.debugLine="Public const COLOR_BLUE As String = \"blue\"";
bananovue._color_blue = BA.ObjectToString("blue");__ref.setField("_color_blue",bananovue._color_blue);
 //BA.debugLineNum = 76;BA.debugLine="Public const COLOR_BLUEGREY As String = \"blue-gre";
bananovue._color_bluegrey = BA.ObjectToString("blue-grey");__ref.setField("_color_bluegrey",bananovue._color_bluegrey);
 //BA.debugLineNum = 77;BA.debugLine="Public const COLOR_BROWN As String = \"brown\"";
bananovue._color_brown = BA.ObjectToString("brown");__ref.setField("_color_brown",bananovue._color_brown);
 //BA.debugLineNum = 78;BA.debugLine="Public const COLOR_CYAN As String = \"cyan\"";
bananovue._color_cyan = BA.ObjectToString("cyan");__ref.setField("_color_cyan",bananovue._color_cyan);
 //BA.debugLineNum = 79;BA.debugLine="Public const COLOR_DEEPORANGE As String = \"deep-o";
bananovue._color_deeporange = BA.ObjectToString("deep-orange");__ref.setField("_color_deeporange",bananovue._color_deeporange);
 //BA.debugLineNum = 80;BA.debugLine="Public const COLOR_DEEPPURPLE As String = \"deep-p";
bananovue._color_deeppurple = BA.ObjectToString("deep-purple");__ref.setField("_color_deeppurple",bananovue._color_deeppurple);
 //BA.debugLineNum = 81;BA.debugLine="Public const COLOR_GREEN As String = \"green\"";
bananovue._color_green = BA.ObjectToString("green");__ref.setField("_color_green",bananovue._color_green);
 //BA.debugLineNum = 82;BA.debugLine="Public const COLOR_GREY As String = \"grey\"";
bananovue._color_grey = BA.ObjectToString("grey");__ref.setField("_color_grey",bananovue._color_grey);
 //BA.debugLineNum = 83;BA.debugLine="Public const COLOR_INDIGO As String = \"indigo\"";
bananovue._color_indigo = BA.ObjectToString("indigo");__ref.setField("_color_indigo",bananovue._color_indigo);
 //BA.debugLineNum = 84;BA.debugLine="Public const COLOR_LIGHTBLUE As String = \"light-b";
bananovue._color_lightblue = BA.ObjectToString("light-blue");__ref.setField("_color_lightblue",bananovue._color_lightblue);
 //BA.debugLineNum = 85;BA.debugLine="Public const COLOR_LIGHTGREEN As String = \"light-";
bananovue._color_lightgreen = BA.ObjectToString("light-green");__ref.setField("_color_lightgreen",bananovue._color_lightgreen);
 //BA.debugLineNum = 86;BA.debugLine="Public const COLOR_LIME As String = \"lime\"";
bananovue._color_lime = BA.ObjectToString("lime");__ref.setField("_color_lime",bananovue._color_lime);
 //BA.debugLineNum = 87;BA.debugLine="Public const COLOR_ORANGE As String = \"orange\"";
bananovue._color_orange = BA.ObjectToString("orange");__ref.setField("_color_orange",bananovue._color_orange);
 //BA.debugLineNum = 88;BA.debugLine="Public const COLOR_PINK As String = \"pink\"";
bananovue._color_pink = BA.ObjectToString("pink");__ref.setField("_color_pink",bananovue._color_pink);
 //BA.debugLineNum = 89;BA.debugLine="Public const COLOR_PURPLE As String = \"purple\"";
bananovue._color_purple = BA.ObjectToString("purple");__ref.setField("_color_purple",bananovue._color_purple);
 //BA.debugLineNum = 90;BA.debugLine="Public const COLOR_RED As String = \"red\"";
bananovue._color_red = BA.ObjectToString("red");__ref.setField("_color_red",bananovue._color_red);
 //BA.debugLineNum = 91;BA.debugLine="Public const COLOR_TEAL As String = \"teal\"";
bananovue._color_teal = BA.ObjectToString("teal");__ref.setField("_color_teal",bananovue._color_teal);
 //BA.debugLineNum = 92;BA.debugLine="Public const COLOR_TRANSPARENT As String = \"trans";
bananovue._color_transparent = BA.ObjectToString("transparent");__ref.setField("_color_transparent",bananovue._color_transparent);
 //BA.debugLineNum = 93;BA.debugLine="Public const COLOR_WHITE As String = \"white\"";
bananovue._color_white = BA.ObjectToString("white");__ref.setField("_color_white",bananovue._color_white);
 //BA.debugLineNum = 94;BA.debugLine="Public const COLOR_YELLOW As String = \"yellow\"";
bananovue._color_yellow = BA.ObjectToString("yellow");__ref.setField("_color_yellow",bananovue._color_yellow);
 //BA.debugLineNum = 96;BA.debugLine="Public const INTENSITY_NORMAL As String = \"\"";
bananovue._intensity_normal = BA.ObjectToString("");__ref.setField("_intensity_normal",bananovue._intensity_normal);
 //BA.debugLineNum = 97;BA.debugLine="Public const INTENSITY_LIGHTEN5 As String = \"ligh";
bananovue._intensity_lighten5 = BA.ObjectToString("lighten-5");__ref.setField("_intensity_lighten5",bananovue._intensity_lighten5);
 //BA.debugLineNum = 98;BA.debugLine="Public const INTENSITY_LIGHTEN4 As String = \"ligh";
bananovue._intensity_lighten4 = BA.ObjectToString("lighten-4");__ref.setField("_intensity_lighten4",bananovue._intensity_lighten4);
 //BA.debugLineNum = 99;BA.debugLine="Public const INTENSITY_LIGHTEN3 As String = \"ligh";
bananovue._intensity_lighten3 = BA.ObjectToString("lighten-3");__ref.setField("_intensity_lighten3",bananovue._intensity_lighten3);
 //BA.debugLineNum = 100;BA.debugLine="Public const INTENSITY_LIGHTEN2 As String = \"ligh";
bananovue._intensity_lighten2 = BA.ObjectToString("lighten-2");__ref.setField("_intensity_lighten2",bananovue._intensity_lighten2);
 //BA.debugLineNum = 101;BA.debugLine="Public const INTENSITY_LIGHTEN1 As String = \"ligh";
bananovue._intensity_lighten1 = BA.ObjectToString("lighten-1");__ref.setField("_intensity_lighten1",bananovue._intensity_lighten1);
 //BA.debugLineNum = 102;BA.debugLine="Public const INTENSITY_DARKEN1 As String = \"darke";
bananovue._intensity_darken1 = BA.ObjectToString("darken-1");__ref.setField("_intensity_darken1",bananovue._intensity_darken1);
 //BA.debugLineNum = 103;BA.debugLine="Public const INTENSITY_DARKEN2 As String = \"darke";
bananovue._intensity_darken2 = BA.ObjectToString("darken-2");__ref.setField("_intensity_darken2",bananovue._intensity_darken2);
 //BA.debugLineNum = 104;BA.debugLine="Public const INTENSITY_DARKEN3 As String = \"darke";
bananovue._intensity_darken3 = BA.ObjectToString("darken-3");__ref.setField("_intensity_darken3",bananovue._intensity_darken3);
 //BA.debugLineNum = 105;BA.debugLine="Public const INTENSITY_DARKEN4 As String = \"darke";
bananovue._intensity_darken4 = BA.ObjectToString("darken-4");__ref.setField("_intensity_darken4",bananovue._intensity_darken4);
 //BA.debugLineNum = 106;BA.debugLine="Public const INTENSITY_ACCENT1 As String = \"accen";
bananovue._intensity_accent1 = BA.ObjectToString("accent-1");__ref.setField("_intensity_accent1",bananovue._intensity_accent1);
 //BA.debugLineNum = 107;BA.debugLine="Public const INTENSITY_ACCENT2 As String = \"accen";
bananovue._intensity_accent2 = BA.ObjectToString("accent-2");__ref.setField("_intensity_accent2",bananovue._intensity_accent2);
 //BA.debugLineNum = 108;BA.debugLine="Public const INTENSITY_ACCENT3 As String = \"accen";
bananovue._intensity_accent3 = BA.ObjectToString("accent-3");__ref.setField("_intensity_accent3",bananovue._intensity_accent3);
 //BA.debugLineNum = 109;BA.debugLine="Public const INTENSITY_ACCENT4 As String = \"accen";
bananovue._intensity_accent4 = BA.ObjectToString("accent-4");__ref.setField("_intensity_accent4",bananovue._intensity_accent4);
 //BA.debugLineNum = 111;BA.debugLine="Type ColorTypes(red As String, pink As String, pu";
;
 //BA.debugLineNum = 115;BA.debugLine="Public Colors As ColorTypes";
bananovue._colors = RemoteObject.createNew ("b4j.example.bananovue._colortypes");__ref.setField("_colors",bananovue._colors);
 //BA.debugLineNum = 117;BA.debugLine="Private ColorMap As Map";
bananovue._colormap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_colormap",bananovue._colormap);
 //BA.debugLineNum = 119;BA.debugLine="Public Attention_Seekers_bounce As String = \"boun";
bananovue._attention_seekers_bounce = BA.ObjectToString("bounce");__ref.setField("_attention_seekers_bounce",bananovue._attention_seekers_bounce);
 //BA.debugLineNum = 120;BA.debugLine="Public Attention_Seekers_flash As String = \"flash";
bananovue._attention_seekers_flash = BA.ObjectToString("flash");__ref.setField("_attention_seekers_flash",bananovue._attention_seekers_flash);
 //BA.debugLineNum = 121;BA.debugLine="Public Attention_Seekers_pulse As String=\"pulse\"";
bananovue._attention_seekers_pulse = BA.ObjectToString("pulse");__ref.setField("_attention_seekers_pulse",bananovue._attention_seekers_pulse);
 //BA.debugLineNum = 122;BA.debugLine="Public Attention_Seekers_rubberBand As String=\"ru";
bananovue._attention_seekers_rubberband = BA.ObjectToString("rubberBand");__ref.setField("_attention_seekers_rubberband",bananovue._attention_seekers_rubberband);
 //BA.debugLineNum = 123;BA.debugLine="Public Attention_Seekers_shake As String=\"shake\"";
bananovue._attention_seekers_shake = BA.ObjectToString("shake");__ref.setField("_attention_seekers_shake",bananovue._attention_seekers_shake);
 //BA.debugLineNum = 124;BA.debugLine="Public Attention_Seekers_swing As String=\"swing\"";
bananovue._attention_seekers_swing = BA.ObjectToString("swing");__ref.setField("_attention_seekers_swing",bananovue._attention_seekers_swing);
 //BA.debugLineNum = 125;BA.debugLine="Public Attention_Seekers_tada As String=\"tada\"";
bananovue._attention_seekers_tada = BA.ObjectToString("tada");__ref.setField("_attention_seekers_tada",bananovue._attention_seekers_tada);
 //BA.debugLineNum = 126;BA.debugLine="Public Attention_Seekers_wobble As String=\"wobble";
bananovue._attention_seekers_wobble = BA.ObjectToString("wobble");__ref.setField("_attention_seekers_wobble",bananovue._attention_seekers_wobble);
 //BA.debugLineNum = 127;BA.debugLine="Public Attention_Seekers_jello As String=\"jello\"";
bananovue._attention_seekers_jello = BA.ObjectToString("jello");__ref.setField("_attention_seekers_jello",bananovue._attention_seekers_jello);
 //BA.debugLineNum = 128;BA.debugLine="Public Bouncing_Entrances_bounceIn As String=\"bou";
bananovue._bouncing_entrances_bouncein = BA.ObjectToString("bounceIn");__ref.setField("_bouncing_entrances_bouncein",bananovue._bouncing_entrances_bouncein);
 //BA.debugLineNum = 129;BA.debugLine="Public Bouncing_Entrances_bounceInDown As String=";
bananovue._bouncing_entrances_bounceindown = BA.ObjectToString("bounceInDown");__ref.setField("_bouncing_entrances_bounceindown",bananovue._bouncing_entrances_bounceindown);
 //BA.debugLineNum = 130;BA.debugLine="Public Bouncing_Entrances_bounceInLeft As String=";
bananovue._bouncing_entrances_bounceinleft = BA.ObjectToString("bounceInLeft");__ref.setField("_bouncing_entrances_bounceinleft",bananovue._bouncing_entrances_bounceinleft);
 //BA.debugLineNum = 131;BA.debugLine="Public Bouncing_Entrances_bounceInRight As String";
bananovue._bouncing_entrances_bounceinright = BA.ObjectToString("bounceInRight");__ref.setField("_bouncing_entrances_bounceinright",bananovue._bouncing_entrances_bounceinright);
 //BA.debugLineNum = 132;BA.debugLine="Public Bouncing_EntrancesbounceInUp As String=\"bo";
bananovue._bouncing_entrancesbounceinup = BA.ObjectToString("bounceInUp");__ref.setField("_bouncing_entrancesbounceinup",bananovue._bouncing_entrancesbounceinup);
 //BA.debugLineNum = 133;BA.debugLine="Public Bouncing_Exits_bounceOut As String=\"bounce";
bananovue._bouncing_exits_bounceout = BA.ObjectToString("bounceOut");__ref.setField("_bouncing_exits_bounceout",bananovue._bouncing_exits_bounceout);
 //BA.debugLineNum = 134;BA.debugLine="Public Bouncing_Exits_bounceOutDown As String=\"bo";
bananovue._bouncing_exits_bounceoutdown = BA.ObjectToString("bounceOutDown");__ref.setField("_bouncing_exits_bounceoutdown",bananovue._bouncing_exits_bounceoutdown);
 //BA.debugLineNum = 135;BA.debugLine="Public Bouncing_Exits_bounceOutLeft As String=\"bo";
bananovue._bouncing_exits_bounceoutleft = BA.ObjectToString("bounceOutLeft");__ref.setField("_bouncing_exits_bounceoutleft",bananovue._bouncing_exits_bounceoutleft);
 //BA.debugLineNum = 136;BA.debugLine="Public Bouncing_Exits_bounceOutRight As String=\"b";
bananovue._bouncing_exits_bounceoutright = BA.ObjectToString("bounceOutRight");__ref.setField("_bouncing_exits_bounceoutright",bananovue._bouncing_exits_bounceoutright);
 //BA.debugLineNum = 137;BA.debugLine="Public Bouncing_Exits_bounceOutUp As String=\"boun";
bananovue._bouncing_exits_bounceoutup = BA.ObjectToString("bounceOutUp");__ref.setField("_bouncing_exits_bounceoutup",bananovue._bouncing_exits_bounceoutup);
 //BA.debugLineNum = 138;BA.debugLine="Public Fading_Entrances_fadeIn As String=\"fadeIn\"";
bananovue._fading_entrances_fadein = BA.ObjectToString("fadeIn");__ref.setField("_fading_entrances_fadein",bananovue._fading_entrances_fadein);
 //BA.debugLineNum = 139;BA.debugLine="Public Fading_Entrances_fadeInDown As String=\"fad";
bananovue._fading_entrances_fadeindown = BA.ObjectToString("fadeInDown");__ref.setField("_fading_entrances_fadeindown",bananovue._fading_entrances_fadeindown);
 //BA.debugLineNum = 140;BA.debugLine="Public Fading_Entrances_fadeInDownBig As String=\"";
bananovue._fading_entrances_fadeindownbig = BA.ObjectToString("fadeInDownBig");__ref.setField("_fading_entrances_fadeindownbig",bananovue._fading_entrances_fadeindownbig);
 //BA.debugLineNum = 141;BA.debugLine="Public Fading_Entrances_fadeInLeft As String=\"fad";
bananovue._fading_entrances_fadeinleft = BA.ObjectToString("fadeInLeft");__ref.setField("_fading_entrances_fadeinleft",bananovue._fading_entrances_fadeinleft);
 //BA.debugLineNum = 142;BA.debugLine="Public Fading_Entrances_fadeInLeftBig As String=\"";
bananovue._fading_entrances_fadeinleftbig = BA.ObjectToString("fadeInLeftBig");__ref.setField("_fading_entrances_fadeinleftbig",bananovue._fading_entrances_fadeinleftbig);
 //BA.debugLineNum = 143;BA.debugLine="Public Fading_Entrances_fadeInRight As String=\"fa";
bananovue._fading_entrances_fadeinright = BA.ObjectToString("fadeInRight");__ref.setField("_fading_entrances_fadeinright",bananovue._fading_entrances_fadeinright);
 //BA.debugLineNum = 144;BA.debugLine="Public Fading_Entrances_fadeInRightBig As String=";
bananovue._fading_entrances_fadeinrightbig = BA.ObjectToString("fadeInRightBig");__ref.setField("_fading_entrances_fadeinrightbig",bananovue._fading_entrances_fadeinrightbig);
 //BA.debugLineNum = 145;BA.debugLine="Public Fading_Entrances_fadeInUp As String=\"fadeI";
bananovue._fading_entrances_fadeinup = BA.ObjectToString("fadeInUp");__ref.setField("_fading_entrances_fadeinup",bananovue._fading_entrances_fadeinup);
 //BA.debugLineNum = 146;BA.debugLine="Public Fading_Entrances_fadeInUpBig As String=\"fa";
bananovue._fading_entrances_fadeinupbig = BA.ObjectToString("fadeInUpBig");__ref.setField("_fading_entrances_fadeinupbig",bananovue._fading_entrances_fadeinupbig);
 //BA.debugLineNum = 147;BA.debugLine="Public Fading_Exits_fadeOut As String=\"fadeOut\"";
bananovue._fading_exits_fadeout = BA.ObjectToString("fadeOut");__ref.setField("_fading_exits_fadeout",bananovue._fading_exits_fadeout);
 //BA.debugLineNum = 148;BA.debugLine="Public Fading_Exits_fadeOutDown As String=\"fadeOu";
bananovue._fading_exits_fadeoutdown = BA.ObjectToString("fadeOutDown");__ref.setField("_fading_exits_fadeoutdown",bananovue._fading_exits_fadeoutdown);
 //BA.debugLineNum = 149;BA.debugLine="Public Fading_Exits_fadeOutDownBig As String=\"fad";
bananovue._fading_exits_fadeoutdownbig = BA.ObjectToString("fadeOutDownBig");__ref.setField("_fading_exits_fadeoutdownbig",bananovue._fading_exits_fadeoutdownbig);
 //BA.debugLineNum = 150;BA.debugLine="Public Fading_Exits_fadeOutLeft As String=\"fadeOu";
bananovue._fading_exits_fadeoutleft = BA.ObjectToString("fadeOutLeft");__ref.setField("_fading_exits_fadeoutleft",bananovue._fading_exits_fadeoutleft);
 //BA.debugLineNum = 151;BA.debugLine="Public Fading_Exits_fadeOutLeftBig As String=\"fad";
bananovue._fading_exits_fadeoutleftbig = BA.ObjectToString("fadeOutLeftBig");__ref.setField("_fading_exits_fadeoutleftbig",bananovue._fading_exits_fadeoutleftbig);
 //BA.debugLineNum = 152;BA.debugLine="Public Fading_Exits_fadeOutRight As String=\"fadeO";
bananovue._fading_exits_fadeoutright = BA.ObjectToString("fadeOutRight");__ref.setField("_fading_exits_fadeoutright",bananovue._fading_exits_fadeoutright);
 //BA.debugLineNum = 153;BA.debugLine="Public Fading_Exits_fadeOutRightBig As String=\"fa";
bananovue._fading_exits_fadeoutrightbig = BA.ObjectToString("fadeOutRightBig");__ref.setField("_fading_exits_fadeoutrightbig",bananovue._fading_exits_fadeoutrightbig);
 //BA.debugLineNum = 154;BA.debugLine="Public Fading_Exits_fadeOutUp As String=\"fadeOutU";
bananovue._fading_exits_fadeoutup = BA.ObjectToString("fadeOutUp");__ref.setField("_fading_exits_fadeoutup",bananovue._fading_exits_fadeoutup);
 //BA.debugLineNum = 155;BA.debugLine="Public Fading_Exits_fadeOutUpBig As String=\"fadeO";
bananovue._fading_exits_fadeoutupbig = BA.ObjectToString("fadeOutUpBig");__ref.setField("_fading_exits_fadeoutupbig",bananovue._fading_exits_fadeoutupbig);
 //BA.debugLineNum = 156;BA.debugLine="Public Flippers_flip As String=\"flip\"";
bananovue._flippers_flip = BA.ObjectToString("flip");__ref.setField("_flippers_flip",bananovue._flippers_flip);
 //BA.debugLineNum = 157;BA.debugLine="Public Flippers_flipInX As String=\"flipInX\"";
bananovue._flippers_flipinx = BA.ObjectToString("flipInX");__ref.setField("_flippers_flipinx",bananovue._flippers_flipinx);
 //BA.debugLineNum = 158;BA.debugLine="Public Flippers_flipInY As String=\"flipInY\"";
bananovue._flippers_flipiny = BA.ObjectToString("flipInY");__ref.setField("_flippers_flipiny",bananovue._flippers_flipiny);
 //BA.debugLineNum = 159;BA.debugLine="Public Flippers_flipOutX As String=\"flipOutX\"";
bananovue._flippers_flipoutx = BA.ObjectToString("flipOutX");__ref.setField("_flippers_flipoutx",bananovue._flippers_flipoutx);
 //BA.debugLineNum = 160;BA.debugLine="Public Flippers_flipOutY As String=\"flipOutY\"";
bananovue._flippers_flipouty = BA.ObjectToString("flipOutY");__ref.setField("_flippers_flipouty",bananovue._flippers_flipouty);
 //BA.debugLineNum = 161;BA.debugLine="Public Lightspeed_lightSpeedIn As String=\"lightSp";
bananovue._lightspeed_lightspeedin = BA.ObjectToString("lightSpeedIn");__ref.setField("_lightspeed_lightspeedin",bananovue._lightspeed_lightspeedin);
 //BA.debugLineNum = 162;BA.debugLine="Public Lightspeed_lightSpeedOut As String=\"lightS";
bananovue._lightspeed_lightspeedout = BA.ObjectToString("lightSpeedOut");__ref.setField("_lightspeed_lightspeedout",bananovue._lightspeed_lightspeedout);
 //BA.debugLineNum = 163;BA.debugLine="Public Rotating_Entrances_rotateIn As String=\"rot";
bananovue._rotating_entrances_rotatein = BA.ObjectToString("rotateIn");__ref.setField("_rotating_entrances_rotatein",bananovue._rotating_entrances_rotatein);
 //BA.debugLineNum = 164;BA.debugLine="Public Rotating_Entrances_rotateInDownLeft As Str";
bananovue._rotating_entrances_rotateindownleft = BA.ObjectToString("rotateInDownLeft");__ref.setField("_rotating_entrances_rotateindownleft",bananovue._rotating_entrances_rotateindownleft);
 //BA.debugLineNum = 165;BA.debugLine="Public Rotating_Entrances_rotateInDownRight As St";
bananovue._rotating_entrances_rotateindownright = BA.ObjectToString("rotateInDownRight");__ref.setField("_rotating_entrances_rotateindownright",bananovue._rotating_entrances_rotateindownright);
 //BA.debugLineNum = 166;BA.debugLine="Public Rotating_Entrances_rotateInUpLeft As Strin";
bananovue._rotating_entrances_rotateinupleft = BA.ObjectToString("rotateInUpLeft");__ref.setField("_rotating_entrances_rotateinupleft",bananovue._rotating_entrances_rotateinupleft);
 //BA.debugLineNum = 167;BA.debugLine="Public Rotating_Entrances_rotateInUpRight As Stri";
bananovue._rotating_entrances_rotateinupright = BA.ObjectToString("rotateInUpRight");__ref.setField("_rotating_entrances_rotateinupright",bananovue._rotating_entrances_rotateinupright);
 //BA.debugLineNum = 168;BA.debugLine="Public Rotating_Exits_rotateOut As String=\"rotate";
bananovue._rotating_exits_rotateout = BA.ObjectToString("rotateOut");__ref.setField("_rotating_exits_rotateout",bananovue._rotating_exits_rotateout);
 //BA.debugLineNum = 169;BA.debugLine="Public Rotating_Exits_rotateOutDownLeft As String";
bananovue._rotating_exits_rotateoutdownleft = BA.ObjectToString("rotateOutDownLeft");__ref.setField("_rotating_exits_rotateoutdownleft",bananovue._rotating_exits_rotateoutdownleft);
 //BA.debugLineNum = 170;BA.debugLine="Public Rotating_Exits_rotateOutDownRight As Strin";
bananovue._rotating_exits_rotateoutdownright = BA.ObjectToString("rotateOutDownRight");__ref.setField("_rotating_exits_rotateoutdownright",bananovue._rotating_exits_rotateoutdownright);
 //BA.debugLineNum = 171;BA.debugLine="Public Rotating_Exits_rotateOutUpLeft As String=\"";
bananovue._rotating_exits_rotateoutupleft = BA.ObjectToString("rotateOutUpLeft");__ref.setField("_rotating_exits_rotateoutupleft",bananovue._rotating_exits_rotateoutupleft);
 //BA.debugLineNum = 172;BA.debugLine="Public Rotating_Exits_rotateOutUpRight As String=";
bananovue._rotating_exits_rotateoutupright = BA.ObjectToString("rotateOutUpRight");__ref.setField("_rotating_exits_rotateoutupright",bananovue._rotating_exits_rotateoutupright);
 //BA.debugLineNum = 173;BA.debugLine="Public Sliding_Entrances_slideInUp As String=\"sli";
bananovue._sliding_entrances_slideinup = BA.ObjectToString("slideInUp");__ref.setField("_sliding_entrances_slideinup",bananovue._sliding_entrances_slideinup);
 //BA.debugLineNum = 174;BA.debugLine="Public Sliding_Entrances_slideInDown As String=\"s";
bananovue._sliding_entrances_slideindown = BA.ObjectToString("slideInDown");__ref.setField("_sliding_entrances_slideindown",bananovue._sliding_entrances_slideindown);
 //BA.debugLineNum = 175;BA.debugLine="Public Sliding_Entrances_slideInLeft As String=\"s";
bananovue._sliding_entrances_slideinleft = BA.ObjectToString("slideInLeft");__ref.setField("_sliding_entrances_slideinleft",bananovue._sliding_entrances_slideinleft);
 //BA.debugLineNum = 176;BA.debugLine="Public Sliding_Entrances_slideInRight As String=\"";
bananovue._sliding_entrances_slideinright = BA.ObjectToString("slideInRight");__ref.setField("_sliding_entrances_slideinright",bananovue._sliding_entrances_slideinright);
 //BA.debugLineNum = 177;BA.debugLine="Public Sliding_Exits_slideOutUp As String=\"slideO";
bananovue._sliding_exits_slideoutup = BA.ObjectToString("slideOutUp");__ref.setField("_sliding_exits_slideoutup",bananovue._sliding_exits_slideoutup);
 //BA.debugLineNum = 178;BA.debugLine="Public Sliding_Exits_slideOutDown As String=\"slid";
bananovue._sliding_exits_slideoutdown = BA.ObjectToString("slideOutDown");__ref.setField("_sliding_exits_slideoutdown",bananovue._sliding_exits_slideoutdown);
 //BA.debugLineNum = 179;BA.debugLine="Public Sliding_Exits_slideOutLeft As String=\"slid";
bananovue._sliding_exits_slideoutleft = BA.ObjectToString("slideOutLeft");__ref.setField("_sliding_exits_slideoutleft",bananovue._sliding_exits_slideoutleft);
 //BA.debugLineNum = 180;BA.debugLine="Public Sliding_Exits_slideOutRight As String=\"sli";
bananovue._sliding_exits_slideoutright = BA.ObjectToString("slideOutRight");__ref.setField("_sliding_exits_slideoutright",bananovue._sliding_exits_slideoutright);
 //BA.debugLineNum = 181;BA.debugLine="Public Zoom_Entrances_zoomIn As String=\"zoomIn\"";
bananovue._zoom_entrances_zoomin = BA.ObjectToString("zoomIn");__ref.setField("_zoom_entrances_zoomin",bananovue._zoom_entrances_zoomin);
 //BA.debugLineNum = 182;BA.debugLine="Public Zoom_Entrances_zoomInDown As String=\"zoomI";
bananovue._zoom_entrances_zoomindown = BA.ObjectToString("zoomInDown");__ref.setField("_zoom_entrances_zoomindown",bananovue._zoom_entrances_zoomindown);
 //BA.debugLineNum = 183;BA.debugLine="Public Zoom_Entrances_zoomInLeft As String=\"zoomI";
bananovue._zoom_entrances_zoominleft = BA.ObjectToString("zoomInLeft");__ref.setField("_zoom_entrances_zoominleft",bananovue._zoom_entrances_zoominleft);
 //BA.debugLineNum = 184;BA.debugLine="Public Zoom_Entrances_zoomInRight As String=\"zoom";
bananovue._zoom_entrances_zoominright = BA.ObjectToString("zoomInRight");__ref.setField("_zoom_entrances_zoominright",bananovue._zoom_entrances_zoominright);
 //BA.debugLineNum = 185;BA.debugLine="Public Zoom_Entrances_zoomInUp As String=\"zoomInU";
bananovue._zoom_entrances_zoominup = BA.ObjectToString("zoomInUp");__ref.setField("_zoom_entrances_zoominup",bananovue._zoom_entrances_zoominup);
 //BA.debugLineNum = 186;BA.debugLine="Public Zoom_Exits_zoomOut As String=\"zoomOut\"";
bananovue._zoom_exits_zoomout = BA.ObjectToString("zoomOut");__ref.setField("_zoom_exits_zoomout",bananovue._zoom_exits_zoomout);
 //BA.debugLineNum = 187;BA.debugLine="Public Zoom_Exits_zoomOutDown As String=\"zoomOutD";
bananovue._zoom_exits_zoomoutdown = BA.ObjectToString("zoomOutDown");__ref.setField("_zoom_exits_zoomoutdown",bananovue._zoom_exits_zoomoutdown);
 //BA.debugLineNum = 188;BA.debugLine="Public Zoom_Exits_zoomOutLeft As String=\"zoomOutL";
bananovue._zoom_exits_zoomoutleft = BA.ObjectToString("zoomOutLeft");__ref.setField("_zoom_exits_zoomoutleft",bananovue._zoom_exits_zoomoutleft);
 //BA.debugLineNum = 189;BA.debugLine="Public Zoom_Exits_zoomOutRight As String=\"zoomOut";
bananovue._zoom_exits_zoomoutright = BA.ObjectToString("zoomOutRight");__ref.setField("_zoom_exits_zoomoutright",bananovue._zoom_exits_zoomoutright);
 //BA.debugLineNum = 190;BA.debugLine="Public Zoom_Exits_zoomOutUp As String=\"zoomOutUp\"";
bananovue._zoom_exits_zoomoutup = BA.ObjectToString("zoomOutUp");__ref.setField("_zoom_exits_zoomoutup",bananovue._zoom_exits_zoomoutup);
 //BA.debugLineNum = 191;BA.debugLine="Public Specials_hinge As String=\"hinge\"";
bananovue._specials_hinge = BA.ObjectToString("hinge");__ref.setField("_specials_hinge",bananovue._specials_hinge);
 //BA.debugLineNum = 192;BA.debugLine="Public Specials_rollIn As String=\"rollIn\"";
bananovue._specials_rollin = BA.ObjectToString("rollIn");__ref.setField("_specials_rollin",bananovue._specials_rollin);
 //BA.debugLineNum = 193;BA.debugLine="Public Specials_rollOut As String=\"rollOut\"";
bananovue._specials_rollout = BA.ObjectToString("rollOut");__ref.setField("_specials_rollout",bananovue._specials_rollout);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clng(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CLng (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,704);
if (RapidSub.canDelegate("clng")) { return __ref.runUserSub(false, "bananovue","clng", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 704;BA.debugLine="Sub CLng(o As Object) As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 705;BA.debugLine="Return Floor(o)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(long.class, bananovue.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _o))));
 BA.debugLineNum = 706;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _compile(RemoteObject __ref,RemoteObject _html) throws Exception{
try {
		Debug.PushSubsStack("Compile (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1118);
if (RapidSub.canDelegate("compile")) { return __ref.runUserSub(false, "bananovue","compile", __ref, _html);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("html", _html);
 BA.debugLineNum = 1118;BA.debugLine="Sub Compile(html As String) As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1119;BA.debugLine="Dim bo As BANanoObject = BOVue.RunMethod(\"compile";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("compile")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_html)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 1120;BA.debugLine="Return bo";
Debug.JustUpdateDeviceLine();
if (true) return _bo;
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
public static RemoteObject  _copymap(RemoteObject __ref,RemoteObject _source,RemoteObject _keys) throws Exception{
try {
		Debug.PushSubsStack("CopyMap (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1721);
if (RapidSub.canDelegate("copymap")) { return __ref.runUserSub(false, "bananovue","copymap", __ref, _source, _keys);}
RemoteObject _nm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
Debug.locals.put("keys", _keys);
 BA.debugLineNum = 1721;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1722;BA.debugLine="Dim nm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nm = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nm", _nm);Debug.locals.put("nm", _nm);
 BA.debugLineNum = 1723;BA.debugLine="If keys.Get(0) = \"*\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_keys.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("*")))) { 
 BA.debugLineNum = 1724;BA.debugLine="For Each k As String In source.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _source.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1725;BA.debugLine="Dim v As Object = source.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _source.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1726;BA.debugLine="nm.Put(k, v)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 }else {
 BA.debugLineNum = 1729;BA.debugLine="For Each k As String In keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = _keys;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_k = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1730;BA.debugLine="Dim v As Object = source.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _source.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1731;BA.debugLine="nm.Put(k, v)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 };
 BA.debugLineNum = 1734;BA.debugLine="Return nm";
Debug.JustUpdateDeviceLine();
if (true) return _nm;
 BA.debugLineNum = 1735;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbutton1(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateBUTTON1 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1593);
if (RapidSub.canDelegate("createbutton1")) { return __ref.runUserSub(false, "bananovue","createbutton1", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 1593;BA.debugLine="Sub CreateBUTTON1(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1594;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1595;BA.debugLine="el.Initialize(Me, id).SetTag(\"button\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("button")));
 BA.debugLineNum = 1596;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1597;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcomponent(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateComponent (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2470);
if (RapidSub.canDelegate("createcomponent")) { return __ref.runUserSub(false, "bananovue","createcomponent", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2470;BA.debugLine="Sub CreateComponent(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2471;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2472;BA.debugLine="el.Initialize(Me, id).SetTag(\"component\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("component")));
 BA.debugLineNum = 2473;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2474;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcss(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateCSS (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2457);
if (RapidSub.canDelegate("createcss")) { return __ref.runUserSub(false, "bananovue","createcss", __ref);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcss");
 BA.debugLineNum = 2457;BA.debugLine="Sub CreateCSS As VMCSS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2458;BA.debugLine="Dim el As VMCSS";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcss");Debug.locals.put("el", _el);
 BA.debugLineNum = 2459;BA.debugLine="el.Initialize";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcss.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2460;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2461;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _creatediv(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateDiv (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2418);
if (RapidSub.canDelegate("creatediv")) { return __ref.runUserSub(false, "bananovue","creatediv", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2418;BA.debugLine="Sub CreateDiv(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2419;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2420;BA.debugLine="el.Initialize(Me,id).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 2421;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createform(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateFORM (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1569);
if (RapidSub.canDelegate("createform")) { return __ref.runUserSub(false, "bananovue","createform", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 1569;BA.debugLine="Sub CreateFORM(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1570;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1571;BA.debugLine="el.Initialize(Me, id).SetTag(\"form\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("form")));
 BA.debugLineNum = 1572;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1573;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh1(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateH1 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2482);
if (RapidSub.canDelegate("createh1")) { return __ref.runUserSub(false, "bananovue","createh1", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2482;BA.debugLine="Sub CreateH1(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2483;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2484;BA.debugLine="el.Initialize(Me, id).SetTag(\"h1\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h1")));
 BA.debugLineNum = 2485;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2486;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh2(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateH2 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2488);
if (RapidSub.canDelegate("createh2")) { return __ref.runUserSub(false, "bananovue","createh2", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2488;BA.debugLine="Sub CreateH2(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2489;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2490;BA.debugLine="el.Initialize(Me, id).SetTag(\"h2\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h2")));
 BA.debugLineNum = 2491;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2492;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh3(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateH3 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2494);
if (RapidSub.canDelegate("createh3")) { return __ref.runUserSub(false, "bananovue","createh3", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2494;BA.debugLine="Sub CreateH3(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2495;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2496;BA.debugLine="el.Initialize(Me, id).SetTag(\"h3\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h3")));
 BA.debugLineNum = 2497;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createh4(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateH4 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2500);
if (RapidSub.canDelegate("createh4")) { return __ref.runUserSub(false, "bananovue","createh4", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2500;BA.debugLine="Sub CreateH4(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2501;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2502;BA.debugLine="el.Initialize(Me, id).SetTag(\"h4\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h4")));
 BA.debugLineNum = 2503;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2504;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh5(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateH5 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2506);
if (RapidSub.canDelegate("createh5")) { return __ref.runUserSub(false, "bananovue","createh5", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2506;BA.debugLine="Sub CreateH5(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2507;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2508;BA.debugLine="el.Initialize(Me, id).SetTag(\"h5\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h5")));
 BA.debugLineNum = 2509;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2510;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createh6(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateH6 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2512);
if (RapidSub.canDelegate("createh6")) { return __ref.runUserSub(false, "bananovue","createh6", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2512;BA.debugLine="Sub CreateH6(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2513;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2514;BA.debugLine="el.Initialize(Me, id).SetTag(\"h6\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h6")));
 BA.debugLineNum = 2515;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2516;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimg(RemoteObject __ref,RemoteObject _img) throws Exception{
try {
		Debug.PushSubsStack("CreateIMG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2476);
if (RapidSub.canDelegate("createimg")) { return __ref.runUserSub(false, "bananovue","createimg", __ref, _img);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("img", _img);
 BA.debugLineNum = 2476;BA.debugLine="Sub CreateIMG(img As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2477;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2478;BA.debugLine="el.Initialize(Me, img).SetTag(\"img\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_img)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 2479;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2480;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinput(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateINPUT (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1581);
if (RapidSub.canDelegate("createinput")) { return __ref.runUserSub(false, "bananovue","createinput", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 1581;BA.debugLine="Sub CreateINPUT(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1582;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1583;BA.debugLine="el.Initialize(Me, id).SetTag(\"input\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("input")));
 BA.debugLineNum = 1584;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1585;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createkeepalive(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateKeepAlive (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2463);
if (RapidSub.canDelegate("createkeepalive")) { return __ref.runUserSub(false, "bananovue","createkeepalive", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 2463;BA.debugLine="Sub CreateKeepAlive(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2464;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2465;BA.debugLine="el.Initialize(Me,sid).SetTag(\"keep-alive\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("keep-alive")));
 BA.debugLineNum = 2466;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2467;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateLABEL (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1575);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "bananovue","createlabel", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 1575;BA.debugLine="Sub CreateLABEL(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1576;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1577;BA.debugLine="el.Initialize(Me, id).SetTag(\"label\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("label")));
 BA.debugLineNum = 1578;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1579;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createli(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateLI (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2436);
if (RapidSub.canDelegate("createli")) { return __ref.runUserSub(false, "bananovue","createli", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2436;BA.debugLine="Sub CreateLI(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2437;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2438;BA.debugLine="el.Initialize(Me,id).SetTag(\"li\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("li")));
 BA.debugLineNum = 2439;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2440;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createol(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateOL (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2443);
if (RapidSub.canDelegate("createol")) { return __ref.runUserSub(false, "bananovue","createol", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2443;BA.debugLine="Sub CreateOL(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2444;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2445;BA.debugLine="el.Initialize(Me,id).SetTag(\"ol\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ol")));
 BA.debugLineNum = 2446;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createoption(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateOPTION (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1135);
if (RapidSub.canDelegate("createoption")) { return __ref.runUserSub(false, "bananovue","createoption", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1135;BA.debugLine="Sub CreateOPTION(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1136;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1137;BA.debugLine="el.Initialize(Me,sid).SetTag(\"option\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("option")));
 BA.debugLineNum = 1138;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createp(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateP (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2450);
if (RapidSub.canDelegate("createp")) { return __ref.runUserSub(false, "bananovue","createp", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2450;BA.debugLine="Sub CreateP(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2451;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2452;BA.debugLine="el.Initialize(Me, id).SetTag(\"p\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("p")));
 BA.debugLineNum = 2453;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2454;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrouterlink(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateRouterLink (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1658);
if (RapidSub.canDelegate("createrouterlink")) { return __ref.runUserSub(false, "bananovue","createrouterlink", __ref, _text);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vuehtml");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 1658;BA.debugLine="Sub CreateRouterLink(Text As String) As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1659;BA.debugLine="Dim el As VueHTML";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("el", _el);
 BA.debugLineNum = 1660;BA.debugLine="el.Initialize(\"\",\"router-link\").SetText(Text)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("router-link"))).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 1661;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1662;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrouterview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateRouterView (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1664);
if (RapidSub.canDelegate("createrouterview")) { return __ref.runUserSub(false, "bananovue","createrouterview", __ref);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vuehtml");
 BA.debugLineNum = 1664;BA.debugLine="Sub CreateRouterView As VueHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1665;BA.debugLine="Dim el As VueHTML";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("el", _el);
 BA.debugLineNum = 1666;BA.debugLine="el.Initialize(\"\",\"router-view\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("router-view")));
 BA.debugLineNum = 1667;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1668;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createselect(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSELECT (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1143);
if (RapidSub.canDelegate("createselect")) { return __ref.runUserSub(false, "bananovue","createselect", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1143;BA.debugLine="Sub CreateSELECT(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1144;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1145;BA.debugLine="el.Initialize(Me,sid).SetTag(\"select\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("select")));
 BA.debugLineNum = 1146;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createspan(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateSPAN (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2424);
if (RapidSub.canDelegate("createspan")) { return __ref.runUserSub(false, "bananovue","createspan", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2424;BA.debugLine="Sub CreateSPAN(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2425;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2426;BA.debugLine="el.Initialize(Me,id).SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 2427;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2428;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtag(RemoteObject __ref,RemoteObject _id,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("CreateTag (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2412);
if (RapidSub.canDelegate("createtag")) { return __ref.runUserSub(false, "bananovue","createtag", __ref, _id, _tag);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 2412;BA.debugLine="Sub CreateTag(id As String, tag As String) As VMEl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2413;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2414;BA.debugLine="el.Initialize(Me,id).SetTag(tag)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(_tag));
 BA.debugLineNum = 2415;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2416;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextarea(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateTEXTAREA (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1587);
if (RapidSub.canDelegate("createtextarea")) { return __ref.runUserSub(false, "bananovue","createtextarea", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 1587;BA.debugLine="Sub CreateTEXTAREA(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1588;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1589;BA.debugLine="el.Initialize(Me, id).SetTag(\"textarea\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("textarea")));
 BA.debugLineNum = 1590;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1591;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createul(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateUL (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2430);
if (RapidSub.canDelegate("createul")) { return __ref.runUserSub(false, "bananovue","createul", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 2430;BA.debugLine="Sub CreateUL(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2431;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 2432;BA.debugLine="el.Initialize(Me,id).SetTag(\"ul\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ul")));
 BA.debugLineNum = 2433;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 2434;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CStr (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1805);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "bananovue","cstr", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 1805;BA.debugLine="Sub CStr(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1806;BA.debugLine="If o = BANAno.UNDEFINED Then o = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_o,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED"))) { 
_o = RemoteObject.createImmutable((""));Debug.locals.put("o", _o);};
 BA.debugLineNum = 1807;BA.debugLine="Return \"\" & o";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
 BA.debugLineNum = 1808;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _date2yyyymmdd(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Date2YYYYMMDD (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,971);
if (RapidSub.canDelegate("date2yyyymmdd")) { return __ref.runUserSub(false, "bananovue","date2yyyymmdd", __ref, _value);}
RemoteObject _m = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 971;BA.debugLine="Sub Date2YYYYMMDD(value As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 972;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 973;BA.debugLine="If CStr(value) = \"\" Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)(_value)),BA.ObjectToString(""))) { 
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 974;BA.debugLine="If value = Null Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_value)) { 
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 975;BA.debugLine="Dim m As BANanoObject = BANAno.RunJavascriptMeth";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_m.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunJavascriptMethod",(Object)(BA.ObjectToString("moment")),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_value}))))));Debug.locals.put("m", _m);
 BA.debugLineNum = 976;BA.debugLine="Dim res As String = m.RunMethod(\"format\", \"YYYY-";
Debug.JustUpdateDeviceLine();
_res = BA.ObjectToString(_m.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("format")),(Object)((RemoteObject.createImmutable("YYYY-MM-DD")))).runMethod(false,"Result"));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 977;BA.debugLine="If res.IndexOf(\"Invalid\") > 0 Then res = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_res.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("Invalid"))),BA.numberCast(double.class, 0))) { 
_res = BA.ObjectToString("");Debug.locals.put("res", _res);};
 BA.debugLineNum = 978;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _res;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 980;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 982;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _date2yyyymmddhhmm(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Date2YYYYMMDDHHMM (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,984);
if (RapidSub.canDelegate("date2yyyymmddhhmm")) { return __ref.runUserSub(false, "bananovue","date2yyyymmddhhmm", __ref, _value);}
RemoteObject _m = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 984;BA.debugLine="Sub Date2YYYYMMDDHHMM(value As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 985;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 986;BA.debugLine="If CStr(value) = \"\" Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)(_value)),BA.ObjectToString(""))) { 
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 987;BA.debugLine="If value = Null Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_value)) { 
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 988;BA.debugLine="Dim m As BANanoObject = BANAno.RunJavascriptMeth";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_m.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunJavascriptMethod",(Object)(BA.ObjectToString("moment")),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_value}))))));Debug.locals.put("m", _m);
 BA.debugLineNum = 989;BA.debugLine="Dim res As String = m.RunMethod(\"format\", \"YYYY-";
Debug.JustUpdateDeviceLine();
_res = BA.ObjectToString(_m.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("format")),(Object)((RemoteObject.createImmutable("YYYY-MM-DD HH:MM")))).runMethod(false,"Result"));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 990;BA.debugLine="If res.IndexOf(\"Invalid\") > 0 Then res = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_res.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("Invalid"))),BA.numberCast(double.class, 0))) { 
_res = BA.ObjectToString("");Debug.locals.put("res", _res);};
 BA.debugLineNum = 991;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _res;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 993;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 995;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dateadd(RemoteObject __ref,RemoteObject _mdate,RemoteObject _howmanydays) throws Exception{
try {
		Debug.PushSubsStack("DateAdd (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("dateadd")) { return __ref.runUserSub(false, "bananovue","dateadd", __ref, _mdate, _howmanydays);}
RemoteObject _convertdate = RemoteObject.createImmutable(0L);
RemoteObject _newdateday = RemoteObject.createImmutable(0L);
Debug.locals.put("mDate", _mdate);
Debug.locals.put("HowManyDays", _howmanydays);
 BA.debugLineNum = 439;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 440;BA.debugLine="Dim ConvertDate, NewDateDay As Long";
Debug.JustUpdateDeviceLine();
_convertdate = RemoteObject.createImmutable(0L);Debug.locals.put("ConvertDate", _convertdate);
_newdateday = RemoteObject.createImmutable(0L);Debug.locals.put("NewDateDay", _newdateday);
 BA.debugLineNum = 441;BA.debugLine="ConvertDate = DateTime.DateParse(mDate)";
Debug.JustUpdateDeviceLine();
_convertdate = bananovue.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_mdate));Debug.locals.put("ConvertDate", _convertdate);
 BA.debugLineNum = 442;BA.debugLine="NewDateDay = DateTime.Add(ConvertDate, 0, 0, HowM";
Debug.JustUpdateDeviceLine();
_newdateday = bananovue.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_convertdate),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_howmanydays));Debug.locals.put("NewDateDay", _newdateday);
 BA.debugLineNum = 443;BA.debugLine="Return DateTime.Date(NewDateDay)";
Debug.JustUpdateDeviceLine();
if (true) return bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_newdateday));
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datediff(RemoteObject __ref,RemoteObject _currentdate,RemoteObject _otherdate) throws Exception{
try {
		Debug.PushSubsStack("DateDiff (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,455);
if (RapidSub.canDelegate("datediff")) { return __ref.runUserSub(false, "bananovue","datediff", __ref, _currentdate, _otherdate);}
RemoteObject _currdate = RemoteObject.createImmutable(0L);
RemoteObject _othdate = RemoteObject.createImmutable(0L);
Debug.locals.put("CurrentDate", _currentdate);
Debug.locals.put("OtherDate", _otherdate);
 BA.debugLineNum = 455;BA.debugLine="Sub DateDiff(CurrentDate As String, OtherDate As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 456;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 458;BA.debugLine="Dim CurrDate As Long";
Debug.JustUpdateDeviceLine();
_currdate = RemoteObject.createImmutable(0L);Debug.locals.put("CurrDate", _currdate);
 BA.debugLineNum = 459;BA.debugLine="Dim OthDate As Long";
Debug.JustUpdateDeviceLine();
_othdate = RemoteObject.createImmutable(0L);Debug.locals.put("OthDate", _othdate);
 BA.debugLineNum = 460;BA.debugLine="CurrDate = DateTime.DateParse(CurrentDate)";
Debug.JustUpdateDeviceLine();
_currdate = bananovue.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_currentdate));Debug.locals.put("CurrDate", _currdate);
 BA.debugLineNum = 461;BA.debugLine="OthDate = DateTime.DateParse(OtherDate)";
Debug.JustUpdateDeviceLine();
_othdate = bananovue.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_otherdate));Debug.locals.put("OthDate", _othdate);
 BA.debugLineNum = 463;BA.debugLine="Return (CurrDate-OthDate) / DateTime.TicksPerDay";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_currdate,_othdate}, "-",1, 2)),bananovue.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "/",0, 0));
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datenow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DateNow (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1704);
if (RapidSub.canDelegate("datenow")) { return __ref.runUserSub(false, "bananovue","datenow", __ref);}
RemoteObject _lnow = RemoteObject.createImmutable(0L);
RemoteObject _dt = RemoteObject.createImmutable("");
 BA.debugLineNum = 1704;BA.debugLine="Public Sub DateNow() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1705;BA.debugLine="Dim lNow As Long";
Debug.JustUpdateDeviceLine();
_lnow = RemoteObject.createImmutable(0L);Debug.locals.put("lNow", _lnow);
 BA.debugLineNum = 1706;BA.debugLine="Dim dt As String";
Debug.JustUpdateDeviceLine();
_dt = RemoteObject.createImmutable("");Debug.locals.put("dt", _dt);
 BA.debugLineNum = 1707;BA.debugLine="lNow = DateTime.Now";
Debug.JustUpdateDeviceLine();
_lnow = bananovue.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("lNow", _lnow);
 BA.debugLineNum = 1708;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm"));
 BA.debugLineNum = 1709;BA.debugLine="dt = DateTime.Date(lNow)";
Debug.JustUpdateDeviceLine();
_dt = bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lnow));Debug.locals.put("dt", _dt);
 BA.debugLineNum = 1710;BA.debugLine="Return dt";
Debug.JustUpdateDeviceLine();
if (true) return _dt;
 BA.debugLineNum = 1711;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datetimenow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DateTimeNow (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1695);
if (RapidSub.canDelegate("datetimenow")) { return __ref.runUserSub(false, "bananovue","datetimenow", __ref);}
RemoteObject _lnow = RemoteObject.createImmutable(0L);
RemoteObject _dt = RemoteObject.createImmutable("");
 BA.debugLineNum = 1695;BA.debugLine="Public Sub DateTimeNow() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1696;BA.debugLine="Dim lNow As Long";
Debug.JustUpdateDeviceLine();
_lnow = RemoteObject.createImmutable(0L);Debug.locals.put("lNow", _lnow);
 BA.debugLineNum = 1697;BA.debugLine="Dim dt As String";
Debug.JustUpdateDeviceLine();
_dt = RemoteObject.createImmutable("");Debug.locals.put("dt", _dt);
 BA.debugLineNum = 1698;BA.debugLine="lNow = DateTime.Now";
Debug.JustUpdateDeviceLine();
_lnow = bananovue.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("lNow", _lnow);
 BA.debugLineNum = 1699;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 1700;BA.debugLine="dt = DateTime.Date(lNow)";
Debug.JustUpdateDeviceLine();
_dt = bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lnow));Debug.locals.put("dt", _dt);
 BA.debugLineNum = 1701;BA.debugLine="Return dt";
Debug.JustUpdateDeviceLine();
if (true) return _dt;
 BA.debugLineNum = 1702;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _doupload(RemoteObject __ref,RemoteObject _fileobj) throws Exception{
try {
		Debug.PushSubsStack("DoUpload (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("doupload")) { return __ref.runUserSub(false, "bananovue","doupload", __ref, _fileobj);}
RemoteObject _aevt = RemoteObject.declareNull("Object");
RemoteObject _xhr = RemoteObject.declareNull("com.ab.banano.BANanoXMLHttpRequest");
RemoteObject _fd = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _err = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _serr = RemoteObject.createImmutable("");
Debug.locals.put("fileObj", _fileobj);
 BA.debugLineNum = 231;BA.debugLine="private Sub DoUpload(fileObj As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="Dim aEvt As Object";
Debug.JustUpdateDeviceLine();
_aevt = RemoteObject.createNew ("Object");Debug.locals.put("aEvt", _aevt);
 BA.debugLineNum = 233;BA.debugLine="Dim xhr As BANanoXMLHttpRequest";
Debug.JustUpdateDeviceLine();
_xhr = RemoteObject.createNew ("com.ab.banano.BANanoXMLHttpRequest");Debug.locals.put("xhr", _xhr);
 BA.debugLineNum = 235;BA.debugLine="Dim fd As BANanoObject";
Debug.JustUpdateDeviceLine();
_fd = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("fd", _fd);
 BA.debugLineNum = 236;BA.debugLine="fd.Initialize2(\"FormData\",Null)";
Debug.JustUpdateDeviceLine();
_fd.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("FormData")),(Object)(bananovue.__c.getField(false,"Null")));
 BA.debugLineNum = 237;BA.debugLine="fd.RunMethod(\"append\", Array(\"upload\", fileObj))";
Debug.JustUpdateDeviceLine();
_fd.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("append")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("upload")),_fileobj}))));
 BA.debugLineNum = 239;BA.debugLine="xhr.Initialize";
Debug.JustUpdateDeviceLine();
_xhr.runVoidMethod ("Initialize");
 BA.debugLineNum = 240;BA.debugLine="xhr.Open(\"POST\", \"./assets/upload.php\")";
Debug.JustUpdateDeviceLine();
_xhr.runVoidMethod ("Open",(Object)(BA.ObjectToString("POST")),(Object)(RemoteObject.createImmutable("./assets/upload.php")));
 BA.debugLineNum = 241;BA.debugLine="xhr.AddEventListenerOpenAsync(\"onreadystatechange";
Debug.JustUpdateDeviceLine();
_xhr.runVoidMethod ("AddEventListenerOpenAsync",(Object)(BA.ObjectToString("onreadystatechange")),(Object)(_aevt));
 BA.debugLineNum = 242;BA.debugLine="If xhr.ReadyState = 4 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_xhr.runMethod(true,"getReadyState"),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 243;BA.debugLine="If xhr.Status = 200 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_xhr.runMethod(true,"getStatus"),BA.numberCast(double.class, 200))) { 
 BA.debugLineNum = 244;BA.debugLine="BANAno.ReturnThen(xhr.ResponseText)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("ReturnThen",(Object)((_xhr.runMethod(true,"getResponseText"))));
 }else {
 BA.debugLineNum = 246;BA.debugLine="Dim err As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_err = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_err = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("err", _err);Debug.locals.put("err", _err);
 BA.debugLineNum = 247;BA.debugLine="err.Put(\"status\", \"error\")";
Debug.JustUpdateDeviceLine();
_err.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("error"))));
 BA.debugLineNum = 248;BA.debugLine="Dim serr As String = BANAno.ToJson(err)";
Debug.JustUpdateDeviceLine();
_serr = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((_err.getObject()))));Debug.locals.put("serr", _serr);Debug.locals.put("serr", _serr);
 BA.debugLineNum = 249;BA.debugLine="BANAno.ReturnElse(serr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("ReturnElse",(Object)((_serr)));
 };
 };
 BA.debugLineNum = 252;BA.debugLine="xhr.CloseEventListener";
Debug.JustUpdateDeviceLine();
_xhr.runVoidMethod ("CloseEventListener");
 BA.debugLineNum = 253;BA.debugLine="xhr.Send2(fd)";
Debug.JustUpdateDeviceLine();
_xhr.runVoidMethod ("Send2",(Object)((_fd.getObject())));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eqoperators(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("EQOperators (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1150);
if (RapidSub.canDelegate("eqoperators")) { return __ref.runUserSub(false, "bananovue","eqoperators", __ref, _sm);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 1150;BA.debugLine="Sub EQOperators(sm As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1151;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 1152;BA.debugLine="nl.initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 1153;BA.debugLine="For Each k As String In sm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _sm.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1154;BA.debugLine="nl.Add(\"=\")";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("="))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1156;BA.debugLine="Return nl";
Debug.JustUpdateDeviceLine();
if (true) return _nl;
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
public static RemoteObject  _expectedrag(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("ExpectedRAG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2543);
if (RapidSub.canDelegate("expectedrag")) { return __ref.runUserSub(false, "bananovue","expectedrag", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2543;BA.debugLine="Public Sub ExpectedRAG(dValue As Double) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2544;BA.debugLine="If dValue = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dvalue,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2545;BA.debugLine="Return \"./assets/orange.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/orange.png");
 }else 
{ BA.debugLineNum = 2546;BA.debugLine="else if dValue > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_dvalue,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2547;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 }else 
{ BA.debugLineNum = 2548;BA.debugLine="else if dValue < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_dvalue,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2549;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 }else {
 BA.debugLineNum = 2551;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 }}}
;
 BA.debugLineNum = 2553;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expenditurerag(RemoteObject __ref,RemoteObject _dvariance) throws Exception{
try {
		Debug.PushSubsStack("ExpenditureRAG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2555);
if (RapidSub.canDelegate("expenditurerag")) { return __ref.runUserSub(false, "bananovue","expenditurerag", __ref, _dvariance);}
Debug.locals.put("dVariance", _dvariance);
 BA.debugLineNum = 2555;BA.debugLine="Public Sub ExpenditureRAG(dVariance As Double) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2556;BA.debugLine="If dVariance > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_dvariance,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2557;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 }else 
{ BA.debugLineNum = 2558;BA.debugLine="else if dVariance < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_dvariance,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2559;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 }else 
{ BA.debugLineNum = 2560;BA.debugLine="else if dVariance = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dvariance,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2561;BA.debugLine="Return \"./assets/orange.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/orange.png");
 }else {
 BA.debugLineNum = 2563;BA.debugLine="Return \"./assets/gray.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/gray.png");
 }}}
;
 BA.debugLineNum = 2565;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extractmap(RemoteObject __ref,RemoteObject _source,RemoteObject _keys) throws Exception{
try {
		Debug.PushSubsStack("ExtractMap (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("extractmap")) { return __ref.runUserSub(false, "bananovue","extractmap", __ref, _source, _keys);}
RemoteObject _nm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
Debug.locals.put("keys", _keys);
 BA.debugLineNum = 314;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 315;BA.debugLine="Dim nm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nm = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nm", _nm);Debug.locals.put("nm", _nm);
 BA.debugLineNum = 316;BA.debugLine="For Each k As String In keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _keys;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 317;BA.debugLine="Dim v As Object = source.get(k)";
Debug.JustUpdateDeviceLine();
_v = _source.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 318;BA.debugLine="nm.put(k, v)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 320;BA.debugLine="Return nm";
Debug.JustUpdateDeviceLine();
if (true) return _nm;
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _facedone(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("FaceDone (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2654);
if (RapidSub.canDelegate("facedone")) { return __ref.runUserSub(false, "bananovue","facedone", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2654;BA.debugLine="Public Sub FaceDone(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2655;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 100))) {
case 0: {
 BA.debugLineNum = 2657;BA.debugLine="Return \"./assets/happyface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/happyface.png");
 break; }
default: {
 BA.debugLineNum = 2659;BA.debugLine="Return \"./assets/sadface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/sadface.png");
 break; }
}
;
 BA.debugLineNum = 2661;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _facerag(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("FaceRAG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2619);
if (RapidSub.canDelegate("facerag")) { return __ref.runUserSub(false, "bananovue","facerag", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2619;BA.debugLine="Public Sub FaceRAG(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2620;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 2622;BA.debugLine="Return \"./assets/sadface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/sadface.png");
 break; }
case 1: {
 BA.debugLineNum = 2624;BA.debugLine="Return \"./assets/neutralface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/neutralface.png");
 break; }
case 2: {
 BA.debugLineNum = 2626;BA.debugLine="Return \"./assets/happyface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/happyface.png");
 break; }
default: {
 BA.debugLineNum = 2628;BA.debugLine="Return \"./assets/sadface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/sadface.png");
 break; }
}
;
 BA.debugLineNum = 2630;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _facerg(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("FaceRG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2632);
if (RapidSub.canDelegate("facerg")) { return __ref.runUserSub(false, "bananovue","facerg", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2632;BA.debugLine="Public Sub FaceRG(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2633;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 2635;BA.debugLine="Return \"./assets/sadface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/sadface.png");
 break; }
case 1: {
 BA.debugLineNum = 2637;BA.debugLine="Return \"./assets/happyface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/happyface.png");
 break; }
default: {
 BA.debugLineNum = 2639;BA.debugLine="Return \"./assets/sadface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/sadface.png");
 break; }
}
;
 BA.debugLineNum = 2641;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _facerg1(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("FaceRG1 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2643);
if (RapidSub.canDelegate("facerg1")) { return __ref.runUserSub(false, "bananovue","facerg1", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2643;BA.debugLine="Public Sub FaceRG1(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2644;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 1),BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 2646;BA.debugLine="Return \"./assets/sadface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/sadface.png");
 break; }
case 1: {
 BA.debugLineNum = 2648;BA.debugLine="Return \"./assets/happyface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/happyface.png");
 break; }
default: {
 BA.debugLineNum = 2650;BA.debugLine="Return \"./assets/sadface.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/sadface.png");
 break; }
}
;
 BA.debugLineNum = 2652;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixrecords(RemoteObject __ref,RemoteObject _recs,RemoteObject _trimthese,RemoteObject _numthese,RemoteObject _boolthese,RemoteObject _datethese,RemoteObject _dblthese) throws Exception{
try {
		Debug.PushSubsStack("FixRecords (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1811);
if (RapidSub.canDelegate("fixrecords")) { return __ref.runUserSub(false, "bananovue","fixrecords", __ref, _recs, _trimthese, _numthese, _boolthese, _datethese, _dblthese);}
RemoteObject _rtot = RemoteObject.createImmutable(0);
RemoteObject _rcnt = RemoteObject.createImmutable(0);
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("recs", _recs);
Debug.locals.put("trimThese", _trimthese);
Debug.locals.put("numThese", _numthese);
Debug.locals.put("boolThese", _boolthese);
Debug.locals.put("dateThese", _datethese);
Debug.locals.put("dblThese", _dblthese);
 BA.debugLineNum = 1811;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1812;BA.debugLine="Dim rTot As Int = recs.Size - 1";
Debug.JustUpdateDeviceLine();
_rtot = RemoteObject.solve(new RemoteObject[] {_recs.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("rTot", _rtot);Debug.locals.put("rTot", _rtot);
 BA.debugLineNum = 1813;BA.debugLine="Dim rCnt As Int";
Debug.JustUpdateDeviceLine();
_rcnt = RemoteObject.createImmutable(0);Debug.locals.put("rCnt", _rcnt);
 BA.debugLineNum = 1814;BA.debugLine="For rCnt = 0 To rTot";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = _rtot.<Integer>get().intValue();
_rcnt = BA.numberCast(int.class, 0) ;
for (;(step3 > 0 && _rcnt.<Integer>get().intValue() <= limit3) || (step3 < 0 && _rcnt.<Integer>get().intValue() >= limit3) ;_rcnt = RemoteObject.createImmutable((int)(0 + _rcnt.<Integer>get().intValue() + step3))  ) {
Debug.locals.put("rCnt", _rcnt);
 BA.debugLineNum = 1815;BA.debugLine="Dim rec As Map = recs.Get(rCnt)";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec.setObject(_recs.runMethod(false,"Get",(Object)(_rcnt)));Debug.locals.put("rec", _rec);
 BA.debugLineNum = 1817;BA.debugLine="Dim nrec As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nrec = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nrec", _nrec);Debug.locals.put("nrec", _nrec);
 BA.debugLineNum = 1818;BA.debugLine="For Each k As String In rec.keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _rec.runMethod(false,"Keys");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1819;BA.debugLine="Dim v As Object = rec.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _rec.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1820;BA.debugLine="k = k.ToLowerCase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 1821;BA.debugLine="nrec.Put(k, v)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1823;BA.debugLine="If dateThese <> Null Then MakeDate(nrec,dateThes";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_datethese)) { 
__ref.runClassMethod (b4j.example.bananovue.class, "_makedate" /*RemoteObject*/ ,(Object)(_nrec),(Object)(_datethese));};
 BA.debugLineNum = 1824;BA.debugLine="If trimThese <> Null Then MakeTrim(nrec,trimThes";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_trimthese)) { 
__ref.runClassMethod (b4j.example.bananovue.class, "_maketrim" /*RemoteObject*/ ,(Object)(_nrec),(Object)(_trimthese));};
 BA.debugLineNum = 1825;BA.debugLine="If numThese <> Null Then MakeInteger(nrec, numTh";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_numthese)) { 
__ref.runClassMethod (b4j.example.bananovue.class, "_makeinteger" /*RemoteObject*/ ,(Object)(_nrec),(Object)(_numthese));};
 BA.debugLineNum = 1826;BA.debugLine="If dblThese <> Null Then MakeDouble(nrec, dblThe";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_dblthese)) { 
__ref.runClassMethod (b4j.example.bananovue.class, "_makedouble" /*RemoteObject*/ ,(Object)(_nrec),(Object)(_dblthese));};
 BA.debugLineNum = 1827;BA.debugLine="If boolThese <> Null Then MakeBoolean(nrec, bool";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_boolthese)) { 
__ref.runClassMethod (b4j.example.bananovue.class, "_makeboolean" /*RemoteObject*/ ,(Object)(_nrec),(Object)(_boolthese));};
 BA.debugLineNum = 1828;BA.debugLine="recs.Set(rCnt, nrec)";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Set",(Object)(_rcnt),(Object)((_nrec.getObject())));
 }
}Debug.locals.put("rCnt", _rcnt);
;
 BA.debugLineNum = 1830;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _forceupdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ForceUpdate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2188);
if (RapidSub.canDelegate("forceupdate")) { return __ref.runUserSub(false, "bananovue","forceupdate", __ref);}
RemoteObject _fu = RemoteObject.createImmutable("");
RemoteObject _dkey = RemoteObject.createImmutable("");
RemoteObject _rkey = RemoteObject.createImmutable("");
 BA.debugLineNum = 2188;BA.debugLine="Sub ForceUpdate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2189;BA.debugLine="Dim fu As String = \"$forceUpdate\"";
Debug.JustUpdateDeviceLine();
_fu = BA.ObjectToString("$forceUpdate");Debug.locals.put("fu", _fu);Debug.locals.put("fu", _fu);
 BA.debugLineNum = 2190;BA.debugLine="BOVue.RunMethod(fu, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(_fu),(Object)(bananovue.__c.getField(false,"Null")));
 BA.debugLineNum = 2192;BA.debugLine="Dim dKey As String = \"$data\"";
Debug.JustUpdateDeviceLine();
_dkey = BA.ObjectToString("$data");Debug.locals.put("dKey", _dkey);Debug.locals.put("dKey", _dkey);
 BA.debugLineNum = 2193;BA.debugLine="data = BOVue.GetField(dKey).Result";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).setObject (__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_dkey)).runMethod(false,"Result"));
 BA.debugLineNum = 2195;BA.debugLine="Dim rKey As String = \"$refs\"";
Debug.JustUpdateDeviceLine();
_rkey = BA.ObjectToString("$refs");Debug.locals.put("rKey", _rkey);Debug.locals.put("rKey", _rkey);
 BA.debugLineNum = 2196;BA.debugLine="refs = BOVue.GetField(rKey)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_refs" /*RemoteObject*/ ).setObject (__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_rkey)).getObject());
 BA.debugLineNum = 2197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatfilesize(RemoteObject __ref,RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("FormatFileSize (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,504);
if (RapidSub.canDelegate("formatfilesize")) { return __ref.runUserSub(false, "bananovue","formatfilesize", __ref, _bytes);}
RemoteObject _unit = null;
RemoteObject _po = RemoteObject.createImmutable(0);
RemoteObject _si = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 504;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 505;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 506;BA.debugLine="Private Unit() As String = Array As String(\" Byt";
Debug.JustUpdateDeviceLine();
_unit = RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString(" Byte"),BA.ObjectToString(" KB"),BA.ObjectToString(" MB"),BA.ObjectToString(" GB"),BA.ObjectToString(" TB"),BA.ObjectToString(" PB"),BA.ObjectToString(" EB"),BA.ObjectToString(" ZB"),RemoteObject.createImmutable(" YB")});Debug.locals.put("Unit", _unit);Debug.locals.put("Unit", _unit);
 BA.debugLineNum = 507;BA.debugLine="If Bytes = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bytes,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 508;BA.debugLine="Return \"0 Bytes\"";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("0 Bytes");
 }else {
 BA.debugLineNum = 510;BA.debugLine="Private Po, Si As Double";
Debug.JustUpdateDeviceLine();
_po = RemoteObject.createImmutable(0);Debug.locals.put("Po", _po);
_si = RemoteObject.createImmutable(0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 511;BA.debugLine="Private I As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("I", _i);
 BA.debugLineNum = 512;BA.debugLine="Bytes = Abs(Bytes)";
Debug.JustUpdateDeviceLine();
_bytes = BA.numberCast(float.class, bananovue.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _bytes))));Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 513;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, bananovue.__c.runMethod(true,"Floor",(Object)(bananovue.__c.runMethod(true,"Logarithm",(Object)(BA.numberCast(double.class, _bytes)),(Object)(BA.numberCast(double.class, 1024))))));Debug.locals.put("I", _i);
 BA.debugLineNum = 514;BA.debugLine="Po = Power(1024, I)";
Debug.JustUpdateDeviceLine();
_po = bananovue.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 1024)),(Object)(BA.numberCast(double.class, _i)));Debug.locals.put("Po", _po);
 BA.debugLineNum = 515;BA.debugLine="Si = Bytes / Po";
Debug.JustUpdateDeviceLine();
_si = RemoteObject.solve(new RemoteObject[] {_bytes,_po}, "/",0, 0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 516;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(bananovue.__c.runMethod(true,"NumberFormat",(Object)(_si),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),_unit.getArrayElement(true,_i));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 519;BA.debugLine="Return \"0 Bytes\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("0 Bytes");
 };
 BA.debugLineNum = 521;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gar(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("GAR (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2593);
if (RapidSub.canDelegate("gar")) { return __ref.runUserSub(false, "bananovue","gar", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2593;BA.debugLine="Public Sub GAR(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2594;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 2596;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 break; }
case 1: {
 BA.debugLineNum = 2598;BA.debugLine="Return \"./assets/orange.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/orange.png");
 break; }
case 2: {
 BA.debugLineNum = 2600;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 break; }
default: {
 BA.debugLineNum = 2602;BA.debugLine="Return \"./assets/gray.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/gray.png");
 break; }
}
;
 BA.debugLineNum = 2604;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalphabets(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetAlphabets (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("getalphabets")) { return __ref.runUserSub(false, "bananovue","getalphabets", __ref, _value);}
RemoteObject _sout = RemoteObject.createImmutable("");
RemoteObject _mout = RemoteObject.createImmutable("");
RemoteObject _slen = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 279;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 280;BA.debugLine="value = CStr(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_value)));Debug.locals.put("value", _value);
 BA.debugLineNum = 281;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 282;BA.debugLine="value = value.Trim";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"trim");Debug.locals.put("value", _value);
 BA.debugLineNum = 283;BA.debugLine="If value = \"\" Then value = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
_value = BA.ObjectToString("");Debug.locals.put("value", _value);};
 BA.debugLineNum = 284;BA.debugLine="Dim sout As String = \"\"";
Debug.JustUpdateDeviceLine();
_sout = BA.ObjectToString("");Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 285;BA.debugLine="Dim mout As String = \"\"";
Debug.JustUpdateDeviceLine();
_mout = BA.ObjectToString("");Debug.locals.put("mout", _mout);Debug.locals.put("mout", _mout);
 BA.debugLineNum = 286;BA.debugLine="Dim slen As Int = value.Length";
Debug.JustUpdateDeviceLine();
_slen = _value.runMethod(true,"length");Debug.locals.put("slen", _slen);Debug.locals.put("slen", _slen);
 BA.debugLineNum = 287;BA.debugLine="Dim i As Int = 0";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 288;BA.debugLine="For i = 0 To slen - 1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_slen,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 289;BA.debugLine="mout = value.CharAt(i)";
Debug.JustUpdateDeviceLine();
_mout = BA.ObjectToString(_value.runMethod(true,"charAt",(Object)(_i)));Debug.locals.put("mout", _mout);
 BA.debugLineNum = 290;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.example.bananovue.class, "_instr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ")),(Object)(_mout)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 291;BA.debugLine="sout = sout & mout";
Debug.JustUpdateDeviceLine();
_sout = RemoteObject.concat(_sout,_mout);Debug.locals.put("sout", _sout);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 294;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _sout;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 296;BA.debugLine="Return value";
Debug.JustUpdateDeviceLine();
if (true) return _value;
 };
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolorhex(RemoteObject __ref,RemoteObject _scolor) throws Exception{
try {
		Debug.PushSubsStack("GetColorHex (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1489);
if (RapidSub.canDelegate("getcolorhex")) { return __ref.runUserSub(false, "bananovue","getcolorhex", __ref, _scolor);}
RemoteObject _xcolor = RemoteObject.createImmutable("");
Debug.locals.put("sColor", _scolor);
 BA.debugLineNum = 1489;BA.debugLine="Sub GetColorHex(sColor As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1490;BA.debugLine="sColor = sColor.tolowercase";
Debug.JustUpdateDeviceLine();
_scolor = _scolor.runMethod(true,"toLowerCase");Debug.locals.put("sColor", _scolor);
 BA.debugLineNum = 1491;BA.debugLine="If ColorMap.ContainsKey(sColor) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_colormap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_scolor))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1492;BA.debugLine="Dim xColor As String = ColorMap.Get(sColor)";
Debug.JustUpdateDeviceLine();
_xcolor = BA.ObjectToString(__ref.getField(false,"_colormap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_scolor))));Debug.locals.put("xColor", _xcolor);Debug.locals.put("xColor", _xcolor);
 BA.debugLineNum = 1493;BA.debugLine="Return xColor";
Debug.JustUpdateDeviceLine();
if (true) return _xcolor;
 };
 BA.debugLineNum = 1495;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 1496;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdisabledstate(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("GetDisabledState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1029);
if (RapidSub.canDelegate("getdisabledstate")) { return __ref.runUserSub(false, "bananovue","getdisabledstate", __ref, _k);}
RemoteObject _diskey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 1029;BA.debugLine="Sub GetDisabledState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1030;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("disabled")));Debug.locals.put("disKey", _diskey);Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1031;BA.debugLine="Return GetState(disKey,False)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_diskey),(Object)((bananovue.__c.getField(true,"False")))));
 BA.debugLineNum = 1032;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteventtargetproperty(RemoteObject __ref,RemoteObject _e,RemoteObject _prop) throws Exception{
try {
		Debug.PushSubsStack("GetEventTargetProperty (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1933);
if (RapidSub.canDelegate("geteventtargetproperty")) { return __ref.runUserSub(false, "bananovue","geteventtargetproperty", __ref, _e, _prop);}
RemoteObject _sid = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
Debug.locals.put("prop", _prop);
 BA.debugLineNum = 1933;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1934;BA.debugLine="Dim sid As String = e.OtherField(\"target\").GetFie";
Debug.JustUpdateDeviceLine();
_sid = BA.ObjectToString(_e.runMethod(false,"OtherField",(Object)(RemoteObject.createImmutable("target"))).runMethod(false,"GetField",(Object)(_prop)).runMethod(false,"Result"));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1935;BA.debugLine="Return sid";
Debug.JustUpdateDeviceLine();
if (true) return _sid;
 BA.debugLineNum = 1936;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfiledetails(RemoteObject __ref,RemoteObject _fileobj) throws Exception{
try {
		Debug.PushSubsStack("GetFileDetails (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("getfiledetails")) { return __ref.runUserSub(false, "bananovue","getfiledetails", __ref, _fileobj);}
RemoteObject _sname = RemoteObject.createImmutable("");
RemoteObject _slastmodifieddate = RemoteObject.createImmutable("");
RemoteObject _ssize = RemoteObject.createImmutable("");
RemoteObject _stype = RemoteObject.createImmutable("");
RemoteObject _ff = RemoteObject.declareNull("b4j.example.bananovue._fileobject");
Debug.locals.put("fileObj", _fileobj);
 BA.debugLineNum = 210;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="Dim sname As String = fileObj.Get(\"name\")";
Debug.JustUpdateDeviceLine();
_sname = BA.ObjectToString(_fileobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("sname", _sname);Debug.locals.put("sname", _sname);
 BA.debugLineNum = 212;BA.debugLine="Dim slastModifiedDate As String = fileObj.Get(\"la";
Debug.JustUpdateDeviceLine();
_slastmodifieddate = BA.ObjectToString(_fileobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastModifiedDate")))));Debug.locals.put("slastModifiedDate", _slastmodifieddate);Debug.locals.put("slastModifiedDate", _slastmodifieddate);
 BA.debugLineNum = 213;BA.debugLine="slastModifiedDate = Date2YYYYMMDDHHMM(slastModifi";
Debug.JustUpdateDeviceLine();
_slastmodifieddate = __ref.runClassMethod (b4j.example.bananovue.class, "_date2yyyymmddhhmm" /*RemoteObject*/ ,(Object)((_slastmodifieddate)));Debug.locals.put("slastModifiedDate", _slastmodifieddate);
 BA.debugLineNum = 214;BA.debugLine="Dim ssize As String = fileObj.Get(\"size\")";
Debug.JustUpdateDeviceLine();
_ssize = BA.ObjectToString(_fileobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("size")))));Debug.locals.put("ssize", _ssize);Debug.locals.put("ssize", _ssize);
 BA.debugLineNum = 215;BA.debugLine="Dim stype As String = fileObj.Get(\"type\")";
Debug.JustUpdateDeviceLine();
_stype = BA.ObjectToString(_fileobj.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("stype", _stype);Debug.locals.put("stype", _stype);
 BA.debugLineNum = 217;BA.debugLine="Dim ff As FileObject";
Debug.JustUpdateDeviceLine();
_ff = RemoteObject.createNew ("b4j.example.bananovue._fileobject");Debug.locals.put("ff", _ff);
 BA.debugLineNum = 218;BA.debugLine="ff.Initialize";
Debug.JustUpdateDeviceLine();
_ff.runVoidMethod ("Initialize");
 BA.debugLineNum = 219;BA.debugLine="ff.FileName = sname";
Debug.JustUpdateDeviceLine();
_ff.setField ("FileName" /*RemoteObject*/ ,_sname);
 BA.debugLineNum = 220;BA.debugLine="ff.FileDate = slastModifiedDate";
Debug.JustUpdateDeviceLine();
_ff.setField ("FileDate" /*RemoteObject*/ ,_slastmodifieddate);
 BA.debugLineNum = 221;BA.debugLine="ff.FileSize = ssize";
Debug.JustUpdateDeviceLine();
_ff.setField ("FileSize" /*RemoteObject*/ ,BA.numberCast(long.class, _ssize));
 BA.debugLineNum = 222;BA.debugLine="ff.FileType = stype";
Debug.JustUpdateDeviceLine();
_ff.setField ("FileType" /*RemoteObject*/ ,_stype);
 BA.debugLineNum = 223;BA.debugLine="Return ff";
Debug.JustUpdateDeviceLine();
if (true) return _ff;
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
public static RemoteObject  _getfileext(RemoteObject __ref,RemoteObject _fullpath) throws Exception{
try {
		Debug.PushSubsStack("GetFileExt (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1790);
if (RapidSub.canDelegate("getfileext")) { return __ref.runUserSub(false, "bananovue","getfileext", __ref, _fullpath);}
Debug.locals.put("FullPath", _fullpath);
 BA.debugLineNum = 1790;BA.debugLine="Sub GetFileExt(FullPath As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1791;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\".";
Debug.JustUpdateDeviceLine();
if (true) return _fullpath.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fullpath.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 1792;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfileparentpath(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("GetFileParentPath (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1770);
if (RapidSub.canDelegate("getfileparentpath")) { return __ref.runUserSub(false, "bananovue","getfileparentpath", __ref, _path);}
RemoteObject _path1 = RemoteObject.createImmutable("");
RemoteObject _l = RemoteObject.createImmutable(0);
Debug.locals.put("Path", _path);
 BA.debugLineNum = 1770;BA.debugLine="Sub GetFileParentPath(Path As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1771;BA.debugLine="Dim Path1 As String";
Debug.JustUpdateDeviceLine();
_path1 = RemoteObject.createImmutable("");Debug.locals.put("Path1", _path1);
 BA.debugLineNum = 1772;BA.debugLine="Dim L As Int";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createImmutable(0);Debug.locals.put("L", _l);
 BA.debugLineNum = 1773;BA.debugLine="If Path = \"/\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_path,BA.ObjectToString("/"))) { 
 BA.debugLineNum = 1774;BA.debugLine="Return \"/\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("/");
 };
 BA.debugLineNum = 1776;BA.debugLine="L = Path.LastIndexOf(\"/\")";
Debug.JustUpdateDeviceLine();
_l = _path.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("L", _l);
 BA.debugLineNum = 1777;BA.debugLine="If L = Path.Length - 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_path.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 1779;BA.debugLine="Path1 = Path.SubString2(0,L)";
Debug.JustUpdateDeviceLine();
_path1 = _path.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_l));Debug.locals.put("Path1", _path1);
 }else {
 BA.debugLineNum = 1781;BA.debugLine="Path1 = Path";
Debug.JustUpdateDeviceLine();
_path1 = _path;Debug.locals.put("Path1", _path1);
 };
 BA.debugLineNum = 1783;BA.debugLine="L = Path.LastIndexOf(\"/\")";
Debug.JustUpdateDeviceLine();
_l = _path.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("L", _l);
 BA.debugLineNum = 1784;BA.debugLine="If L = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1785;BA.debugLine="L = 1";
Debug.JustUpdateDeviceLine();
_l = BA.numberCast(int.class, 1);Debug.locals.put("L", _l);
 };
 BA.debugLineNum = 1787;BA.debugLine="Return Path1.SubString2(0,L)";
Debug.JustUpdateDeviceLine();
if (true) return _path1.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_l));
 BA.debugLineNum = 1788;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getidfromevent(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("GetIDFromEvent (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1920);
if (RapidSub.canDelegate("getidfromevent")) { return __ref.runUserSub(false, "bananovue","getidfromevent", __ref, _e);}
RemoteObject _cureve = RemoteObject.declareNull("com.ab.banano.BANanoElement");
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 1920;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1921;BA.debugLine="Dim curEve As BANanoElement = BANAno.ToElement(e.";
Debug.JustUpdateDeviceLine();
_cureve = RemoteObject.createNew ("com.ab.banano.BANanoElement");
_cureve = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToElement",(Object)(_e.runMethod(false,"OtherField",(Object)(RemoteObject.createImmutable("currentTarget")))));Debug.locals.put("curEve", _cureve);Debug.locals.put("curEve", _cureve);
 BA.debugLineNum = 1922;BA.debugLine="Dim id As String = curEve.GetField(\"id\").Result";
Debug.JustUpdateDeviceLine();
_id = BA.ObjectToString(_cureve.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("id"))).runMethod(false,"Result"));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1923;BA.debugLine="Return id";
Debug.JustUpdateDeviceLine();
if (true) return _id;
 BA.debugLineNum = 1924;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getkeyfromevent(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("GetKeyFromEvent (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1927);
if (RapidSub.canDelegate("getkeyfromevent")) { return __ref.runUserSub(false, "bananovue","getkeyfromevent", __ref, _e);}
RemoteObject _cureve = RemoteObject.declareNull("com.ab.banano.BANanoElement");
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 1927;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1928;BA.debugLine="Dim curEve As BANanoElement = BANAno.ToElement(e.";
Debug.JustUpdateDeviceLine();
_cureve = RemoteObject.createNew ("com.ab.banano.BANanoElement");
_cureve = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToElement",(Object)(_e.runMethod(false,"OtherField",(Object)(RemoteObject.createImmutable("currentTarget")))));Debug.locals.put("curEve", _cureve);Debug.locals.put("curEve", _cureve);
 BA.debugLineNum = 1929;BA.debugLine="Dim id As String = curEve.GetField(\"key\").Result";
Debug.JustUpdateDeviceLine();
_id = BA.ObjectToString(_cureve.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("key"))).runMethod(false,"Result"));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1930;BA.debugLine="Return id";
Debug.JustUpdateDeviceLine();
if (true) return _id;
 BA.debugLineNum = 1931;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmapkeys(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("GetMapKeys (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,928);
if (RapidSub.canDelegate("getmapkeys")) { return __ref.runUserSub(false, "bananovue","getmapkeys", __ref, _sourcemap);}
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 928;BA.debugLine="Sub GetMapKeys(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 929;BA.debugLine="Dim listOfValues As List";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 930;BA.debugLine="listOfValues.Initialize";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 931;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 932;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 933;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 934;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 935;BA.debugLine="Dim value As Object = sourceMap.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_value = _sourcemap.runMethod(false,"GetKeyAt",(Object)(_icnt));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 936;BA.debugLine="listOfValues.Add(value)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 938;BA.debugLine="Return listOfValues";
Debug.JustUpdateDeviceLine();
if (true) return _listofvalues;
 BA.debugLineNum = 939;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmapvalues(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("GetMapValues (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,914);
if (RapidSub.canDelegate("getmapvalues")) { return __ref.runUserSub(false, "bananovue","getmapvalues", __ref, _sourcemap);}
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 914;BA.debugLine="Sub GetMapValues(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 915;BA.debugLine="Dim listOfValues As List";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 916;BA.debugLine="listOfValues.Initialize";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 917;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 918;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 919;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 920;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 921;BA.debugLine="Dim value As Object = sourceMap.GetValueAt(iCnt)";
Debug.JustUpdateDeviceLine();
_value = _sourcemap.runMethod(false,"GetValueAt",(Object)(_icnt));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 922;BA.debugLine="listOfValues.Add(value)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 924;BA.debugLine="Return listOfValues";
Debug.JustUpdateDeviceLine();
if (true) return _listofvalues;
 BA.debugLineNum = 925;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnumbers(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetNumbers (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,943);
if (RapidSub.canDelegate("getnumbers")) { return __ref.runUserSub(false, "bananovue","getnumbers", __ref, _value);}
RemoteObject _sout = RemoteObject.createImmutable("");
RemoteObject _mout = RemoteObject.createImmutable("");
RemoteObject _slen = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 943;BA.debugLine="Public Sub GetNumbers(value As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 944;BA.debugLine="value = CStr(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_value)));Debug.locals.put("value", _value);
 BA.debugLineNum = 945;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 946;BA.debugLine="value = value.Trim";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"trim");Debug.locals.put("value", _value);
 BA.debugLineNum = 947;BA.debugLine="Dim sout As String = \"\"";
Debug.JustUpdateDeviceLine();
_sout = BA.ObjectToString("");Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 948;BA.debugLine="Dim mout As String = \"\"";
Debug.JustUpdateDeviceLine();
_mout = BA.ObjectToString("");Debug.locals.put("mout", _mout);Debug.locals.put("mout", _mout);
 BA.debugLineNum = 949;BA.debugLine="Dim slen As Int = value.Length";
Debug.JustUpdateDeviceLine();
_slen = _value.runMethod(true,"length");Debug.locals.put("slen", _slen);Debug.locals.put("slen", _slen);
 BA.debugLineNum = 950;BA.debugLine="Dim i As Int = 0";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 951;BA.debugLine="For i = 0 To slen - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_slen,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && _i.<Integer>get().intValue() <= limit8) || (step8 < 0 && _i.<Integer>get().intValue() >= limit8) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 952;BA.debugLine="mout = value.CharAt(i)";
Debug.JustUpdateDeviceLine();
_mout = BA.ObjectToString(_value.runMethod(true,"charAt",(Object)(_i)));Debug.locals.put("mout", _mout);
 BA.debugLineNum = 953;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.example.bananovue.class, "_instr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("0123456789.-")),(Object)(_mout)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 954;BA.debugLine="sout = sout & mout";
Debug.JustUpdateDeviceLine();
_sout = RemoteObject.concat(_sout,_mout);Debug.locals.put("sout", _sout);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 957;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _sout;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 959;BA.debugLine="Return value";
Debug.JustUpdateDeviceLine();
if (true) return _value;
 };
 BA.debugLineNum = 961;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrequiredstate(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("GetRequiredState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1874);
if (RapidSub.canDelegate("getrequiredstate")) { return __ref.runUserSub(false, "bananovue","getrequiredstate", __ref, _k);}
RemoteObject _diskey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 1874;BA.debugLine="Sub GetRequiredState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1875;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("required")));Debug.locals.put("disKey", _diskey);Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1876;BA.debugLine="Return GetState(disKey,False)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_diskey),(Object)((bananovue.__c.getField(true,"False")))));
 BA.debugLineNum = 1877;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowstate(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("GetShowState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1024);
if (RapidSub.canDelegate("getshowstate")) { return __ref.runUserSub(false, "bananovue","getshowstate", __ref, _k);}
RemoteObject _showkey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 1024;BA.debugLine="Sub GetShowState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1025;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
Debug.JustUpdateDeviceLine();
_showkey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("show")));Debug.locals.put("showKey", _showkey);Debug.locals.put("showKey", _showkey);
 BA.debugLineNum = 1026;BA.debugLine="Return GetState(showKey,False)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_showkey),(Object)((bananovue.__c.getField(true,"False")))));
 BA.debugLineNum = 1027;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2401);
if (RapidSub.canDelegate("getstate")) { return __ref.runUserSub(false, "bananovue","getstate", __ref, _k, _v);}
RemoteObject _out = RemoteObject.declareNull("Object");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 2401;BA.debugLine="Sub GetState(k As String, v As Object) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2402;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 2403;BA.debugLine="If data.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2404;BA.debugLine="Dim out As Object = data.GetDefault(k,v)";
Debug.JustUpdateDeviceLine();
_out = __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_k)),(Object)(_v));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 2405;BA.debugLine="Return out";
Debug.JustUpdateDeviceLine();
if (true) return _out;
 }else {
 BA.debugLineNum = 2407;BA.debugLine="Log(\"GetState: First set the v-model for \" & k)";
Debug.JustUpdateDeviceLine();
bananovue.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetState: First set the v-model for "),_k)));
 BA.debugLineNum = 2408;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable((""));
 };
 BA.debugLineNum = 2410;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetStates (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2377);
if (RapidSub.canDelegate("getstates")) { return __ref.runUserSub(false, "bananovue","getstates", __ref, _lst);}
RemoteObject _sm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstrec = RemoteObject.createImmutable("");
RemoteObject _state = RemoteObject.declareNull("Object");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 2377;BA.debugLine="Sub GetStates(lst As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2378;BA.debugLine="Dim sm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_sm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_sm = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("sm", _sm);Debug.locals.put("sm", _sm);
 BA.debugLineNum = 2379;BA.debugLine="For Each lstrec As String In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _lst;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lstrec = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("lstrec", _lstrec);
Debug.locals.put("lstrec", _lstrec);
 BA.debugLineNum = 2380;BA.debugLine="lstrec = lstrec.tolowercase";
Debug.JustUpdateDeviceLine();
_lstrec = _lstrec.runMethod(true,"toLowerCase");Debug.locals.put("lstrec", _lstrec);
 BA.debugLineNum = 2381;BA.debugLine="Dim state As Object = GetState(lstrec, Null)";
Debug.JustUpdateDeviceLine();
_state = __ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_lstrec),(Object)(bananovue.__c.getField(false,"Null")));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 2382;BA.debugLine="sm.Put(lstrec, state)";
Debug.JustUpdateDeviceLine();
_sm.runVoidMethod ("Put",(Object)((_lstrec)),(Object)(_state));
 }
}Debug.locals.put("lstrec", _lstrec);
;
 BA.debugLineNum = 2384;BA.debugLine="Return sm";
Debug.JustUpdateDeviceLine();
if (true) return _sm;
 BA.debugLineNum = 2385;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HasState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2373);
if (RapidSub.canDelegate("hasstate")) { return __ref.runUserSub(false, "bananovue","hasstate", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 2373;BA.debugLine="Sub HasState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2374;BA.debugLine="Return data.ContainsKey(k)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_k)));
 BA.debugLineNum = 2375;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hideerror(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("HideError (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1766);
if (RapidSub.canDelegate("hideerror")) { return __ref.runUserSub(false, "bananovue","hideerror", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 1766;BA.debugLine="Sub HideError(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1767;BA.debugLine="SetStateSingle($\"${elID}error\"$, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("error")))),(Object)((bananovue.__c.getField(true,"False"))));
 BA.debugLineNum = 1768;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hideitems(RemoteObject __ref,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("HideItems (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1065);
if (RapidSub.canDelegate("hideitems")) { return __ref.runUserSub(false, "bananovue","hideitems", __ref, _items);}
RemoteObject _item = RemoteObject.createImmutable("");
Debug.locals.put("items", _items);
 BA.debugLineNum = 1065;BA.debugLine="Sub HideItems(items As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1066;BA.debugLine="For Each item As String In items";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _items;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 1067;BA.debugLine="SetStateSingle(item, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_item),(Object)((bananovue.__c.getField(true,"False"))));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 1069;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HR (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1504);
if (RapidSub.canDelegate("hr")) { return __ref.runUserSub(false, "bananovue","hr", __ref);}
 BA.debugLineNum = 1504;BA.debugLine="Sub HR As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1505;BA.debugLine="Return \"<hr>\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("<hr>");
 BA.debugLineNum = 1506;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _httpupload(RemoteObject __ref,RemoteObject _fileobj,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("HTTPUpload (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("httpupload")) { return __ref.runUserSub(false, "bananovue","httpupload", __ref, _fileobj, _module, _methodname);}
RemoteObject _promise = RemoteObject.declareNull("com.ab.banano.BANanoPromise");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _json = RemoteObject.createImmutable("");
Debug.locals.put("fileObj", _fileobj);
Debug.locals.put("module", _module);
Debug.locals.put("methodname", _methodname);
 BA.debugLineNum = 256;BA.debugLine="Sub HTTPUpload(fileObj As Object, module As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="Dim promise As BANanoPromise 'ignore";
Debug.JustUpdateDeviceLine();
_promise = RemoteObject.createNew ("com.ab.banano.BANanoPromise");Debug.locals.put("promise", _promise);
 BA.debugLineNum = 259;BA.debugLine="Dim Error As String";
Debug.JustUpdateDeviceLine();
_error = RemoteObject.createImmutable("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 260;BA.debugLine="Dim json As String";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 263;BA.debugLine="promise.CallSub(Me, \"DoUpload\", Array(fileObj))";
Debug.JustUpdateDeviceLine();
_promise.runVoidMethod ("CallSub",(Object)(__ref),(Object)(BA.ObjectToString("DoUpload")),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_fileobj})))));
 BA.debugLineNum = 264;BA.debugLine="promise.ThenWait(json)";
Debug.JustUpdateDeviceLine();
_promise.runVoidMethod ("ThenWait",(Object)((_json)));
 BA.debugLineNum = 265;BA.debugLine="BANAno.CallSub(module, methodname, Array(fileObj,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(_module),(Object)(_methodname),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_fileobj,(_json)})))));
 BA.debugLineNum = 266;BA.debugLine="promise.ElseWait(Error)  'ignore";
Debug.JustUpdateDeviceLine();
_promise.runVoidMethod ("ElseWait",(Object)((_error)));
 BA.debugLineNum = 267;BA.debugLine="BANAno.CallSub(module, methodname, Array(fileObj,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(_module),(Object)(_methodname),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_fileobj,(_error)})))));
 BA.debugLineNum = 268;BA.debugLine="promise.End";
Debug.JustUpdateDeviceLine();
_promise.runVoidMethod ("End");
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1166);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bananovue","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 1166;BA.debugLine="Public Sub Initialize()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1167;BA.debugLine="BOVue.Initialize(\"Vue\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("Vue"))));
 BA.debugLineNum = 1168;BA.debugLine="JQuery.Initialize(\"$\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jquery" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("$"))));
 BA.debugLineNum = 1170;BA.debugLine="body = BANAno.GetElement(\"#body\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_body" /*RemoteObject*/ ,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#body"))));
 BA.debugLineNum = 1171;BA.debugLine="body.empty";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("Empty");
 BA.debugLineNum = 1173;BA.debugLine="body.Append($\"<div id=\"app\"></div>\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)((RemoteObject.createImmutable("<div id=\"app\"></div>"))));
 BA.debugLineNum = 1174;BA.debugLine="Template.Initialize(\"app\",\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("app")),(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 1175;BA.debugLine="Template.SetVCloak";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setvcloak" /*RemoteObject*/ );
 BA.debugLineNum = 1176;BA.debugLine="methods.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1177;BA.debugLine="data.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1178;BA.debugLine="computed.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_computed" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1179;BA.debugLine="watches.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_watches" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1180;BA.debugLine="routes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_routes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1181;BA.debugLine="beforeMount = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforemount" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1182;BA.debugLine="beforeUpdate = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforeupdate" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1183;BA.debugLine="created = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_created" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1184;BA.debugLine="mounted = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mounted" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1185;BA.debugLine="destroyed = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_destroyed" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1186;BA.debugLine="updated = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_updated" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1187;BA.debugLine="beforeCreate = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforecreate" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1188;BA.debugLine="activated = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_activated" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1189;BA.debugLine="deactivated = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_deactivated" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1190;BA.debugLine="beforeDestroy = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforedestroy" /*RemoteObject*/ ).setObject (bananovue.__c.getField(false,"Null"));
 BA.debugLineNum = 1192;BA.debugLine="TypeOfString = BOVue.GetField(\"String\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_typeofstring" /*RemoteObject*/ ,__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("String"))));
 BA.debugLineNum = 1193;BA.debugLine="TypeOfNumber = BOVue.GetField(\"Number\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_typeofnumber" /*RemoteObject*/ ,__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Number"))));
 BA.debugLineNum = 1194;BA.debugLine="TypeOfBoolean = BOVue.GetField(\"Boolean\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_typeofboolean" /*RemoteObject*/ ,__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Boolean"))));
 BA.debugLineNum = 1195;BA.debugLine="TypeOfArray = BOVue.GetField(\"Array\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_typeofarray" /*RemoteObject*/ ,__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Array"))));
 BA.debugLineNum = 1196;BA.debugLine="TypeOfObject = BOVue.GetField(\"Object\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_typeofobject" /*RemoteObject*/ ,__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Object"))));
 BA.debugLineNum = 1197;BA.debugLine="TypeOfDate = BOVue.GetField(\"Date\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_typeofdate" /*RemoteObject*/ ,__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Date"))));
 BA.debugLineNum = 1198;BA.debugLine="TypeOfFunction = BOVue.GetField(\"Function\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_typeoffunction" /*RemoteObject*/ ,__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Function"))));
 BA.debugLineNum = 1199;BA.debugLine="TypeOfSymbol = BOVue.GetField(\"Symbol\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_typeofsymbol" /*RemoteObject*/ ,__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("Symbol"))));
 BA.debugLineNum = 1200;BA.debugLine="Options = CreateMap()";
Debug.JustUpdateDeviceLine();
__ref.setField ("_options" /*RemoteObject*/ ,bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 1201;BA.debugLine="dynamicStyle = CreateMap()";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dynamicstyle" /*RemoteObject*/ ,bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 1202;BA.debugLine="SetFontFamily(\"'Roboto', 'Helvetica', Arial, sans";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setfontfamily" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("'Roboto', 'Helvetica', Arial, sans-serif"))));
 BA.debugLineNum = 1204;BA.debugLine="Colors.initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1205;BA.debugLine="Colors.red = \"red\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("red" /*RemoteObject*/ ,BA.ObjectToString("red"));
 BA.debugLineNum = 1206;BA.debugLine="Colors.pink = \"pink\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("pink" /*RemoteObject*/ ,BA.ObjectToString("pink"));
 BA.debugLineNum = 1207;BA.debugLine="Colors.purple = \"purple\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("purple" /*RemoteObject*/ ,BA.ObjectToString("purple"));
 BA.debugLineNum = 1208;BA.debugLine="Colors.deepPurple = \"deep-purple\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("deepPurple" /*RemoteObject*/ ,BA.ObjectToString("deep-purple"));
 BA.debugLineNum = 1209;BA.debugLine="Colors.indigo = \"indigo\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("indigo" /*RemoteObject*/ ,BA.ObjectToString("indigo"));
 BA.debugLineNum = 1210;BA.debugLine="Colors.blue = \"blue\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("blue" /*RemoteObject*/ ,BA.ObjectToString("blue"));
 BA.debugLineNum = 1211;BA.debugLine="Colors.lightBlue = \"light-blue\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("lightBlue" /*RemoteObject*/ ,BA.ObjectToString("light-blue"));
 BA.debugLineNum = 1212;BA.debugLine="Colors.cyan = \"cyan\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("cyan" /*RemoteObject*/ ,BA.ObjectToString("cyan"));
 BA.debugLineNum = 1213;BA.debugLine="Colors.teal = \"teal\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("teal" /*RemoteObject*/ ,BA.ObjectToString("teal"));
 BA.debugLineNum = 1214;BA.debugLine="Colors.green = \"green\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("green" /*RemoteObject*/ ,BA.ObjectToString("green"));
 BA.debugLineNum = 1215;BA.debugLine="Colors.lightGreen = \"light-green\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("lightGreen" /*RemoteObject*/ ,BA.ObjectToString("light-green"));
 BA.debugLineNum = 1216;BA.debugLine="Colors.lime = \"lime\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("lime" /*RemoteObject*/ ,BA.ObjectToString("lime"));
 BA.debugLineNum = 1217;BA.debugLine="Colors.yellow = \"yellow\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("yellow" /*RemoteObject*/ ,BA.ObjectToString("yellow"));
 BA.debugLineNum = 1218;BA.debugLine="Colors.amber = \"amber\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("amber" /*RemoteObject*/ ,BA.ObjectToString("amber"));
 BA.debugLineNum = 1219;BA.debugLine="Colors.Orange = \"orange\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("Orange" /*RemoteObject*/ ,BA.ObjectToString("orange"));
 BA.debugLineNum = 1220;BA.debugLine="Colors.deepOrange = \"deep-orange\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("deepOrange" /*RemoteObject*/ ,BA.ObjectToString("deep-orange"));
 BA.debugLineNum = 1221;BA.debugLine="Colors.brown = \"brown\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("brown" /*RemoteObject*/ ,BA.ObjectToString("brown"));
 BA.debugLineNum = 1222;BA.debugLine="Colors.grey = \"grey\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("grey" /*RemoteObject*/ ,BA.ObjectToString("grey"));
 BA.debugLineNum = 1223;BA.debugLine="Colors.blueGrey = \"blue-grey\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("blueGrey" /*RemoteObject*/ ,BA.ObjectToString("blue-grey"));
 BA.debugLineNum = 1224;BA.debugLine="Colors.black = \"black\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("black" /*RemoteObject*/ ,BA.ObjectToString("black"));
 BA.debugLineNum = 1225;BA.debugLine="Colors.white = \"white\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("white" /*RemoteObject*/ ,BA.ObjectToString("white"));
 BA.debugLineNum = 1226;BA.debugLine="Colors.transparent = \"transparent\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).setField ("transparent" /*RemoteObject*/ ,BA.ObjectToString("transparent"));
 BA.debugLineNum = 1228;BA.debugLine="ColorMap.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1229;BA.debugLine="ColorMap.put(\"red lighten-5\", \"#ffebee\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red lighten-5"))),(Object)((RemoteObject.createImmutable("#ffebee"))));
 BA.debugLineNum = 1230;BA.debugLine="ColorMap.put(\"red lighten-4\", \"#ffcdd2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red lighten-4"))),(Object)((RemoteObject.createImmutable("#ffcdd2"))));
 BA.debugLineNum = 1231;BA.debugLine="ColorMap.put(\"red lighten-3\", \"#ef9a9a\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red lighten-3"))),(Object)((RemoteObject.createImmutable("#ef9a9a"))));
 BA.debugLineNum = 1232;BA.debugLine="ColorMap.put(\"red lighten-2\", \"#e57373\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red lighten-2"))),(Object)((RemoteObject.createImmutable("#e57373"))));
 BA.debugLineNum = 1233;BA.debugLine="ColorMap.put(\"red lighten-1\", \"#ef5350\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red lighten-1"))),(Object)((RemoteObject.createImmutable("#ef5350"))));
 BA.debugLineNum = 1234;BA.debugLine="ColorMap.put(\"red\", \"#f44336\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red"))),(Object)((RemoteObject.createImmutable("#f44336"))));
 BA.debugLineNum = 1235;BA.debugLine="ColorMap.put(\"red darken-1\", \"#e53935\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red darken-1"))),(Object)((RemoteObject.createImmutable("#e53935"))));
 BA.debugLineNum = 1236;BA.debugLine="ColorMap.put(\"red darken-2\", \"#d32f2f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red darken-2"))),(Object)((RemoteObject.createImmutable("#d32f2f"))));
 BA.debugLineNum = 1237;BA.debugLine="ColorMap.put(\"red darken-3\", \"#c62828\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red darken-3"))),(Object)((RemoteObject.createImmutable("#c62828"))));
 BA.debugLineNum = 1238;BA.debugLine="ColorMap.put(\"red darken-4\", \"#b71c1c\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red darken-4"))),(Object)((RemoteObject.createImmutable("#b71c1c"))));
 BA.debugLineNum = 1239;BA.debugLine="ColorMap.put(\"red accent-1\", \"#ff8a80\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red accent-1"))),(Object)((RemoteObject.createImmutable("#ff8a80"))));
 BA.debugLineNum = 1240;BA.debugLine="ColorMap.put(\"red accent-2\", \"#ff5252\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red accent-2"))),(Object)((RemoteObject.createImmutable("#ff5252"))));
 BA.debugLineNum = 1241;BA.debugLine="ColorMap.put(\"red accent-3\", \"#ff1744\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red accent-3"))),(Object)((RemoteObject.createImmutable("#ff1744"))));
 BA.debugLineNum = 1242;BA.debugLine="ColorMap.put(\"red accent-4\", \"#d50000\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red accent-4"))),(Object)((RemoteObject.createImmutable("#d50000"))));
 BA.debugLineNum = 1243;BA.debugLine="ColorMap.put(\"pink lighten-5\", \"#fce4ec\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink lighten-5"))),(Object)((RemoteObject.createImmutable("#fce4ec"))));
 BA.debugLineNum = 1244;BA.debugLine="ColorMap.put(\"pink lighten-4\", \"#f8bbd0\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink lighten-4"))),(Object)((RemoteObject.createImmutable("#f8bbd0"))));
 BA.debugLineNum = 1245;BA.debugLine="ColorMap.put(\"pink lighten-3\", \"#f48fb1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink lighten-3"))),(Object)((RemoteObject.createImmutable("#f48fb1"))));
 BA.debugLineNum = 1246;BA.debugLine="ColorMap.put(\"pink lighten-2\", \"#f06292\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink lighten-2"))),(Object)((RemoteObject.createImmutable("#f06292"))));
 BA.debugLineNum = 1247;BA.debugLine="ColorMap.put(\"pink lighten-1\", \"#ec407a\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink lighten-1"))),(Object)((RemoteObject.createImmutable("#ec407a"))));
 BA.debugLineNum = 1248;BA.debugLine="ColorMap.put(\"pink\", \"#e91e63\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink"))),(Object)((RemoteObject.createImmutable("#e91e63"))));
 BA.debugLineNum = 1249;BA.debugLine="ColorMap.put(\"pink darken-1\", \"#d81b60\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink darken-1"))),(Object)((RemoteObject.createImmutable("#d81b60"))));
 BA.debugLineNum = 1250;BA.debugLine="ColorMap.put(\"pink darken-2\", \"#c2185b\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink darken-2"))),(Object)((RemoteObject.createImmutable("#c2185b"))));
 BA.debugLineNum = 1251;BA.debugLine="ColorMap.put(\"pink darken-3\", \"#ad1457\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink darken-3"))),(Object)((RemoteObject.createImmutable("#ad1457"))));
 BA.debugLineNum = 1252;BA.debugLine="ColorMap.put(\"pink darken-4\", \"#880e4f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink darken-4"))),(Object)((RemoteObject.createImmutable("#880e4f"))));
 BA.debugLineNum = 1253;BA.debugLine="ColorMap.put(\"pink accent-1\", \"#ff80ab\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink accent-1"))),(Object)((RemoteObject.createImmutable("#ff80ab"))));
 BA.debugLineNum = 1254;BA.debugLine="ColorMap.put(\"pink accent-2\", \"#ff4081\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink accent-2"))),(Object)((RemoteObject.createImmutable("#ff4081"))));
 BA.debugLineNum = 1255;BA.debugLine="ColorMap.put(\"pink accent-3\", \"#f50057\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink accent-3"))),(Object)((RemoteObject.createImmutable("#f50057"))));
 BA.debugLineNum = 1256;BA.debugLine="ColorMap.put(\"pink accent-4\", \"#c51162\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink accent-4"))),(Object)((RemoteObject.createImmutable("#c51162"))));
 BA.debugLineNum = 1257;BA.debugLine="ColorMap.put(\"purple lighten-5\", \"#f3e5f5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple lighten-5"))),(Object)((RemoteObject.createImmutable("#f3e5f5"))));
 BA.debugLineNum = 1258;BA.debugLine="ColorMap.put(\"purple lighten-4\", \"#e1bee7\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple lighten-4"))),(Object)((RemoteObject.createImmutable("#e1bee7"))));
 BA.debugLineNum = 1259;BA.debugLine="ColorMap.put(\"purple lighten-3\", \"#ce93d8\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple lighten-3"))),(Object)((RemoteObject.createImmutable("#ce93d8"))));
 BA.debugLineNum = 1260;BA.debugLine="ColorMap.put(\"purple lighten-2\", \"#ba68c8\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple lighten-2"))),(Object)((RemoteObject.createImmutable("#ba68c8"))));
 BA.debugLineNum = 1261;BA.debugLine="ColorMap.put(\"purple lighten-1\", \"#ab47bc\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple lighten-1"))),(Object)((RemoteObject.createImmutable("#ab47bc"))));
 BA.debugLineNum = 1262;BA.debugLine="ColorMap.put(\"purple\", \"#9c27b0\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple"))),(Object)((RemoteObject.createImmutable("#9c27b0"))));
 BA.debugLineNum = 1263;BA.debugLine="ColorMap.put(\"purple darken-1\", \"#8e24aa\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple darken-1"))),(Object)((RemoteObject.createImmutable("#8e24aa"))));
 BA.debugLineNum = 1264;BA.debugLine="ColorMap.put(\"purple darken-2\", \"#7b1fa2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple darken-2"))),(Object)((RemoteObject.createImmutable("#7b1fa2"))));
 BA.debugLineNum = 1265;BA.debugLine="ColorMap.put(\"purple darken-3\", \"#6a1b9a\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple darken-3"))),(Object)((RemoteObject.createImmutable("#6a1b9a"))));
 BA.debugLineNum = 1266;BA.debugLine="ColorMap.put(\"purple darken-4\", \"#4a148c\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple darken-4"))),(Object)((RemoteObject.createImmutable("#4a148c"))));
 BA.debugLineNum = 1267;BA.debugLine="ColorMap.put(\"purple accent-1\", \"#ea80fc\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple accent-1"))),(Object)((RemoteObject.createImmutable("#ea80fc"))));
 BA.debugLineNum = 1268;BA.debugLine="ColorMap.put(\"purple accent-2\", \"#e040fb\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple accent-2"))),(Object)((RemoteObject.createImmutable("#e040fb"))));
 BA.debugLineNum = 1269;BA.debugLine="ColorMap.put(\"purple accent-3\", \"#d500f9\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple accent-3"))),(Object)((RemoteObject.createImmutable("#d500f9"))));
 BA.debugLineNum = 1270;BA.debugLine="ColorMap.put(\"purple accent-4\", \"#aa00ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple accent-4"))),(Object)((RemoteObject.createImmutable("#aa00ff"))));
 BA.debugLineNum = 1271;BA.debugLine="ColorMap.put(\"deep-purple lighten-5\", \"#ede7f6\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple lighten-5"))),(Object)((RemoteObject.createImmutable("#ede7f6"))));
 BA.debugLineNum = 1272;BA.debugLine="ColorMap.put(\"deep-purple lighten-4\", \"#d1c4e9\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple lighten-4"))),(Object)((RemoteObject.createImmutable("#d1c4e9"))));
 BA.debugLineNum = 1273;BA.debugLine="ColorMap.put(\"deep-purple lighten-3\", \"#b39ddb\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple lighten-3"))),(Object)((RemoteObject.createImmutable("#b39ddb"))));
 BA.debugLineNum = 1274;BA.debugLine="ColorMap.put(\"deep-purple lighten-2\", \"#9575cd\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple lighten-2"))),(Object)((RemoteObject.createImmutable("#9575cd"))));
 BA.debugLineNum = 1275;BA.debugLine="ColorMap.put(\"deep-purple lighten-1\", \"#7e57c2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple lighten-1"))),(Object)((RemoteObject.createImmutable("#7e57c2"))));
 BA.debugLineNum = 1276;BA.debugLine="ColorMap.put(\"deep-purple\", \"#673ab7\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple"))),(Object)((RemoteObject.createImmutable("#673ab7"))));
 BA.debugLineNum = 1277;BA.debugLine="ColorMap.put(\"deep-purple darken-1\", \"#5e35b1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple darken-1"))),(Object)((RemoteObject.createImmutable("#5e35b1"))));
 BA.debugLineNum = 1278;BA.debugLine="ColorMap.put(\"deep-purple darken-2\", \"#512da8\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple darken-2"))),(Object)((RemoteObject.createImmutable("#512da8"))));
 BA.debugLineNum = 1279;BA.debugLine="ColorMap.put(\"deep-purple darken-3\", \"#4527a0\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple darken-3"))),(Object)((RemoteObject.createImmutable("#4527a0"))));
 BA.debugLineNum = 1280;BA.debugLine="ColorMap.put(\"deep-purple darken-4\", \"#311b92\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple darken-4"))),(Object)((RemoteObject.createImmutable("#311b92"))));
 BA.debugLineNum = 1281;BA.debugLine="ColorMap.put(\"deep-purple accent-1\", \"#b388ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple accent-1"))),(Object)((RemoteObject.createImmutable("#b388ff"))));
 BA.debugLineNum = 1282;BA.debugLine="ColorMap.put(\"deep-purple accent-2\", \"#7c4dff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple accent-2"))),(Object)((RemoteObject.createImmutable("#7c4dff"))));
 BA.debugLineNum = 1283;BA.debugLine="ColorMap.put(\"deep-purple accent-3\", \"#651fff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple accent-3"))),(Object)((RemoteObject.createImmutable("#651fff"))));
 BA.debugLineNum = 1284;BA.debugLine="ColorMap.put(\"deep-purple accent-4\", \"#6200ea\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple accent-4"))),(Object)((RemoteObject.createImmutable("#6200ea"))));
 BA.debugLineNum = 1285;BA.debugLine="ColorMap.put(\"indigo lighten-5\", \"#e8eaf6\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo lighten-5"))),(Object)((RemoteObject.createImmutable("#e8eaf6"))));
 BA.debugLineNum = 1286;BA.debugLine="ColorMap.put(\"indigo lighten-4\", \"#c5cae9\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo lighten-4"))),(Object)((RemoteObject.createImmutable("#c5cae9"))));
 BA.debugLineNum = 1287;BA.debugLine="ColorMap.put(\"indigo lighten-3\", \"#9fa8da\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo lighten-3"))),(Object)((RemoteObject.createImmutable("#9fa8da"))));
 BA.debugLineNum = 1288;BA.debugLine="ColorMap.put(\"indigo lighten-2\", \"#7986cb\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo lighten-2"))),(Object)((RemoteObject.createImmutable("#7986cb"))));
 BA.debugLineNum = 1289;BA.debugLine="ColorMap.put(\"indigo lighten-1\", \"#5c6bc0\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo lighten-1"))),(Object)((RemoteObject.createImmutable("#5c6bc0"))));
 BA.debugLineNum = 1290;BA.debugLine="ColorMap.put(\"indigo\", \"#3f51b5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo"))),(Object)((RemoteObject.createImmutable("#3f51b5"))));
 BA.debugLineNum = 1291;BA.debugLine="ColorMap.put(\"indigo darken-1\", \"#3949ab\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo darken-1"))),(Object)((RemoteObject.createImmutable("#3949ab"))));
 BA.debugLineNum = 1292;BA.debugLine="ColorMap.put(\"indigo darken-2\", \"#303f9f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo darken-2"))),(Object)((RemoteObject.createImmutable("#303f9f"))));
 BA.debugLineNum = 1293;BA.debugLine="ColorMap.put(\"indigo darken-3\", \"#283593\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo darken-3"))),(Object)((RemoteObject.createImmutable("#283593"))));
 BA.debugLineNum = 1294;BA.debugLine="ColorMap.put(\"indigo darken-4\", \"#1a237e\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo darken-4"))),(Object)((RemoteObject.createImmutable("#1a237e"))));
 BA.debugLineNum = 1295;BA.debugLine="ColorMap.put(\"indigo accent-1\", \"#8c9eff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo accent-1"))),(Object)((RemoteObject.createImmutable("#8c9eff"))));
 BA.debugLineNum = 1296;BA.debugLine="ColorMap.put(\"indigo accent-2\", \"#536dfe\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo accent-2"))),(Object)((RemoteObject.createImmutable("#536dfe"))));
 BA.debugLineNum = 1297;BA.debugLine="ColorMap.put(\"indigo accent-3\", \"#3d5afe\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo accent-3"))),(Object)((RemoteObject.createImmutable("#3d5afe"))));
 BA.debugLineNum = 1298;BA.debugLine="ColorMap.put(\"indigo accent-4\", \"#304ffe\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo accent-4"))),(Object)((RemoteObject.createImmutable("#304ffe"))));
 BA.debugLineNum = 1299;BA.debugLine="ColorMap.put(\"blue lighten-5\", \"#e3f2fd\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue lighten-5"))),(Object)((RemoteObject.createImmutable("#e3f2fd"))));
 BA.debugLineNum = 1300;BA.debugLine="ColorMap.put(\"blue lighten-4\", \"#bbdefb\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue lighten-4"))),(Object)((RemoteObject.createImmutable("#bbdefb"))));
 BA.debugLineNum = 1301;BA.debugLine="ColorMap.put(\"blue lighten-3\", \"#90caf9\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue lighten-3"))),(Object)((RemoteObject.createImmutable("#90caf9"))));
 BA.debugLineNum = 1302;BA.debugLine="ColorMap.put(\"blue lighten-2\", \"#64b5f6\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue lighten-2"))),(Object)((RemoteObject.createImmutable("#64b5f6"))));
 BA.debugLineNum = 1303;BA.debugLine="ColorMap.put(\"blue lighten-1\", \"#42a5f5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue lighten-1"))),(Object)((RemoteObject.createImmutable("#42a5f5"))));
 BA.debugLineNum = 1304;BA.debugLine="ColorMap.put(\"blue\", \"#2196f3\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue"))),(Object)((RemoteObject.createImmutable("#2196f3"))));
 BA.debugLineNum = 1305;BA.debugLine="ColorMap.put(\"blue darken-1\", \"#1e88e5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue darken-1"))),(Object)((RemoteObject.createImmutable("#1e88e5"))));
 BA.debugLineNum = 1306;BA.debugLine="ColorMap.put(\"blue darken-2\", \"#1976d2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue darken-2"))),(Object)((RemoteObject.createImmutable("#1976d2"))));
 BA.debugLineNum = 1307;BA.debugLine="ColorMap.put(\"blue darken-3\", \"#1565c0\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue darken-3"))),(Object)((RemoteObject.createImmutable("#1565c0"))));
 BA.debugLineNum = 1308;BA.debugLine="ColorMap.put(\"blue darken-4\", \"#0d47a1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue darken-4"))),(Object)((RemoteObject.createImmutable("#0d47a1"))));
 BA.debugLineNum = 1309;BA.debugLine="ColorMap.put(\"blue accent-1\", \"#82b1ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue accent-1"))),(Object)((RemoteObject.createImmutable("#82b1ff"))));
 BA.debugLineNum = 1310;BA.debugLine="ColorMap.put(\"blue accent-2\", \"#448aff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue accent-2"))),(Object)((RemoteObject.createImmutable("#448aff"))));
 BA.debugLineNum = 1311;BA.debugLine="ColorMap.put(\"blue accent-3\", \"#2979ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue accent-3"))),(Object)((RemoteObject.createImmutable("#2979ff"))));
 BA.debugLineNum = 1312;BA.debugLine="ColorMap.put(\"blue accent-4\", \"#2962ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue accent-4"))),(Object)((RemoteObject.createImmutable("#2962ff"))));
 BA.debugLineNum = 1313;BA.debugLine="ColorMap.put(\"light-blue lighten-5\", \"#e1f5fe\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue lighten-5"))),(Object)((RemoteObject.createImmutable("#e1f5fe"))));
 BA.debugLineNum = 1314;BA.debugLine="ColorMap.put(\"light-blue lighten-4\", \"#b3e5fc\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue lighten-4"))),(Object)((RemoteObject.createImmutable("#b3e5fc"))));
 BA.debugLineNum = 1315;BA.debugLine="ColorMap.put(\"light-blue lighten-3\", \"#81d4fa\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue lighten-3"))),(Object)((RemoteObject.createImmutable("#81d4fa"))));
 BA.debugLineNum = 1316;BA.debugLine="ColorMap.put(\"light-blue lighten-2\", \"#4fc3f7\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue lighten-2"))),(Object)((RemoteObject.createImmutable("#4fc3f7"))));
 BA.debugLineNum = 1317;BA.debugLine="ColorMap.put(\"light-blue lighten-1\", \"#29b6f6\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue lighten-1"))),(Object)((RemoteObject.createImmutable("#29b6f6"))));
 BA.debugLineNum = 1318;BA.debugLine="ColorMap.put(\"light-blue\", \"#03a9f4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue"))),(Object)((RemoteObject.createImmutable("#03a9f4"))));
 BA.debugLineNum = 1319;BA.debugLine="ColorMap.put(\"light-blue darken-1\", \"#039be5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue darken-1"))),(Object)((RemoteObject.createImmutable("#039be5"))));
 BA.debugLineNum = 1320;BA.debugLine="ColorMap.put(\"light-blue darken-2\", \"#0288d1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue darken-2"))),(Object)((RemoteObject.createImmutable("#0288d1"))));
 BA.debugLineNum = 1321;BA.debugLine="ColorMap.put(\"light-blue darken-3\", \"#0277bd\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue darken-3"))),(Object)((RemoteObject.createImmutable("#0277bd"))));
 BA.debugLineNum = 1322;BA.debugLine="ColorMap.put(\"light-blue darken-4\", \"#01579b\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue darken-4"))),(Object)((RemoteObject.createImmutable("#01579b"))));
 BA.debugLineNum = 1323;BA.debugLine="ColorMap.put(\"light-blue accent-1\", \"#80d8ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue accent-1"))),(Object)((RemoteObject.createImmutable("#80d8ff"))));
 BA.debugLineNum = 1324;BA.debugLine="ColorMap.put(\"light-blue accent-2\", \"#40c4ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue accent-2"))),(Object)((RemoteObject.createImmutable("#40c4ff"))));
 BA.debugLineNum = 1325;BA.debugLine="ColorMap.put(\"light-blue accent-3\", \"#00b0ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue accent-3"))),(Object)((RemoteObject.createImmutable("#00b0ff"))));
 BA.debugLineNum = 1326;BA.debugLine="ColorMap.put(\"light-blue accent-4\", \"#0091ea\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue accent-4"))),(Object)((RemoteObject.createImmutable("#0091ea"))));
 BA.debugLineNum = 1327;BA.debugLine="ColorMap.put(\"cyan lighten-5\", \"#e0f7fa\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan lighten-5"))),(Object)((RemoteObject.createImmutable("#e0f7fa"))));
 BA.debugLineNum = 1328;BA.debugLine="ColorMap.put(\"cyan lighten-4\", \"#b2ebf2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan lighten-4"))),(Object)((RemoteObject.createImmutable("#b2ebf2"))));
 BA.debugLineNum = 1329;BA.debugLine="ColorMap.put(\"cyan lighten-3\", \"#80deea\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan lighten-3"))),(Object)((RemoteObject.createImmutable("#80deea"))));
 BA.debugLineNum = 1330;BA.debugLine="ColorMap.put(\"cyan lighten-2\", \"#4dd0e1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan lighten-2"))),(Object)((RemoteObject.createImmutable("#4dd0e1"))));
 BA.debugLineNum = 1331;BA.debugLine="ColorMap.put(\"cyan lighten-1\", \"#26c6da\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan lighten-1"))),(Object)((RemoteObject.createImmutable("#26c6da"))));
 BA.debugLineNum = 1332;BA.debugLine="ColorMap.put(\"cyan\", \"#00bcd4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan"))),(Object)((RemoteObject.createImmutable("#00bcd4"))));
 BA.debugLineNum = 1333;BA.debugLine="ColorMap.put(\"cyan darken-1\", \"#00acc1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan darken-1"))),(Object)((RemoteObject.createImmutable("#00acc1"))));
 BA.debugLineNum = 1334;BA.debugLine="ColorMap.put(\"cyan darken-2\", \"#0097a7\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan darken-2"))),(Object)((RemoteObject.createImmutable("#0097a7"))));
 BA.debugLineNum = 1335;BA.debugLine="ColorMap.put(\"cyan darken-3\", \"#00838f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan darken-3"))),(Object)((RemoteObject.createImmutable("#00838f"))));
 BA.debugLineNum = 1336;BA.debugLine="ColorMap.put(\"cyan darken-4\", \"#006064\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan darken-4"))),(Object)((RemoteObject.createImmutable("#006064"))));
 BA.debugLineNum = 1337;BA.debugLine="ColorMap.put(\"cyan accent-1\", \"#84ffff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan accent-1"))),(Object)((RemoteObject.createImmutable("#84ffff"))));
 BA.debugLineNum = 1338;BA.debugLine="ColorMap.put(\"cyan accent-2\", \"#18ffff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan accent-2"))),(Object)((RemoteObject.createImmutable("#18ffff"))));
 BA.debugLineNum = 1339;BA.debugLine="ColorMap.put(\"cyan accent-3\", \"#00e5ff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan accent-3"))),(Object)((RemoteObject.createImmutable("#00e5ff"))));
 BA.debugLineNum = 1340;BA.debugLine="ColorMap.put(\"cyan accent-4\", \"#00b8d4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan accent-4"))),(Object)((RemoteObject.createImmutable("#00b8d4"))));
 BA.debugLineNum = 1341;BA.debugLine="ColorMap.put(\"teal lighten-5\", \"#e0f2f1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal lighten-5"))),(Object)((RemoteObject.createImmutable("#e0f2f1"))));
 BA.debugLineNum = 1342;BA.debugLine="ColorMap.put(\"teal lighten-4\", \"#b2dfdb\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal lighten-4"))),(Object)((RemoteObject.createImmutable("#b2dfdb"))));
 BA.debugLineNum = 1343;BA.debugLine="ColorMap.put(\"teal lighten-3\", \"#80cbc4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal lighten-3"))),(Object)((RemoteObject.createImmutable("#80cbc4"))));
 BA.debugLineNum = 1344;BA.debugLine="ColorMap.put(\"teal lighten-2\", \"#4db6ac\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal lighten-2"))),(Object)((RemoteObject.createImmutable("#4db6ac"))));
 BA.debugLineNum = 1345;BA.debugLine="ColorMap.put(\"teal lighten-1\", \"#26a69a\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal lighten-1"))),(Object)((RemoteObject.createImmutable("#26a69a"))));
 BA.debugLineNum = 1346;BA.debugLine="ColorMap.put(\"teal\", \"#009688\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal"))),(Object)((RemoteObject.createImmutable("#009688"))));
 BA.debugLineNum = 1347;BA.debugLine="ColorMap.put(\"teal darken-1\", \"#00897b\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal darken-1"))),(Object)((RemoteObject.createImmutable("#00897b"))));
 BA.debugLineNum = 1348;BA.debugLine="ColorMap.put(\"teal darken-2\", \"#00796b\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal darken-2"))),(Object)((RemoteObject.createImmutable("#00796b"))));
 BA.debugLineNum = 1349;BA.debugLine="ColorMap.put(\"teal darken-3\", \"#00695c\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal darken-3"))),(Object)((RemoteObject.createImmutable("#00695c"))));
 BA.debugLineNum = 1350;BA.debugLine="ColorMap.put(\"teal darken-4\", \"#004d40\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal darken-4"))),(Object)((RemoteObject.createImmutable("#004d40"))));
 BA.debugLineNum = 1351;BA.debugLine="ColorMap.put(\"teal accent-1\", \"#a7ffeb\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal accent-1"))),(Object)((RemoteObject.createImmutable("#a7ffeb"))));
 BA.debugLineNum = 1352;BA.debugLine="ColorMap.put(\"teal accent-2\", \"#64ffda\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal accent-2"))),(Object)((RemoteObject.createImmutable("#64ffda"))));
 BA.debugLineNum = 1353;BA.debugLine="ColorMap.put(\"teal accent-3\", \"#1de9b6\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal accent-3"))),(Object)((RemoteObject.createImmutable("#1de9b6"))));
 BA.debugLineNum = 1354;BA.debugLine="ColorMap.put(\"teal accent-4\", \"#00bfa5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal accent-4"))),(Object)((RemoteObject.createImmutable("#00bfa5"))));
 BA.debugLineNum = 1355;BA.debugLine="ColorMap.put(\"green lighten-5\", \"#e8f5e9\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green lighten-5"))),(Object)((RemoteObject.createImmutable("#e8f5e9"))));
 BA.debugLineNum = 1356;BA.debugLine="ColorMap.put(\"green lighten-4\", \"#c8e6c9\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green lighten-4"))),(Object)((RemoteObject.createImmutable("#c8e6c9"))));
 BA.debugLineNum = 1357;BA.debugLine="ColorMap.put(\"green lighten-3\", \"#a5d6a7\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green lighten-3"))),(Object)((RemoteObject.createImmutable("#a5d6a7"))));
 BA.debugLineNum = 1358;BA.debugLine="ColorMap.put(\"green lighten-2\", \"#81c784\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green lighten-2"))),(Object)((RemoteObject.createImmutable("#81c784"))));
 BA.debugLineNum = 1359;BA.debugLine="ColorMap.put(\"green lighten-1\", \"#66bb6a\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green lighten-1"))),(Object)((RemoteObject.createImmutable("#66bb6a"))));
 BA.debugLineNum = 1360;BA.debugLine="ColorMap.put(\"green\", \"#4caf50\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green"))),(Object)((RemoteObject.createImmutable("#4caf50"))));
 BA.debugLineNum = 1361;BA.debugLine="ColorMap.put(\"green darken-1\", \"#43a047\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green darken-1"))),(Object)((RemoteObject.createImmutable("#43a047"))));
 BA.debugLineNum = 1362;BA.debugLine="ColorMap.put(\"green darken-2\", \"#388e3c\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green darken-2"))),(Object)((RemoteObject.createImmutable("#388e3c"))));
 BA.debugLineNum = 1363;BA.debugLine="ColorMap.put(\"green darken-3\", \"#2e7d32\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green darken-3"))),(Object)((RemoteObject.createImmutable("#2e7d32"))));
 BA.debugLineNum = 1364;BA.debugLine="ColorMap.put(\"green darken-4\", \"#1b5e20\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green darken-4"))),(Object)((RemoteObject.createImmutable("#1b5e20"))));
 BA.debugLineNum = 1365;BA.debugLine="ColorMap.put(\"green accent-1\", \"#b9f6ca\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green accent-1"))),(Object)((RemoteObject.createImmutable("#b9f6ca"))));
 BA.debugLineNum = 1366;BA.debugLine="ColorMap.put(\"green accent-2\", \"#69f0ae\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green accent-2"))),(Object)((RemoteObject.createImmutable("#69f0ae"))));
 BA.debugLineNum = 1367;BA.debugLine="ColorMap.put(\"green accent-3\", \"#00e676\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green accent-3"))),(Object)((RemoteObject.createImmutable("#00e676"))));
 BA.debugLineNum = 1368;BA.debugLine="ColorMap.put(\"green accent-4\", \"#00c853\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green accent-4"))),(Object)((RemoteObject.createImmutable("#00c853"))));
 BA.debugLineNum = 1369;BA.debugLine="ColorMap.put(\"light-green lighten-5\", \"#f1f8e9\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green lighten-5"))),(Object)((RemoteObject.createImmutable("#f1f8e9"))));
 BA.debugLineNum = 1370;BA.debugLine="ColorMap.put(\"light-green lighten-4\", \"#dcedc8\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green lighten-4"))),(Object)((RemoteObject.createImmutable("#dcedc8"))));
 BA.debugLineNum = 1371;BA.debugLine="ColorMap.put(\"light-green lighten-3\", \"#c5e1a5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green lighten-3"))),(Object)((RemoteObject.createImmutable("#c5e1a5"))));
 BA.debugLineNum = 1372;BA.debugLine="ColorMap.put(\"light-green lighten-2\", \"#aed581\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green lighten-2"))),(Object)((RemoteObject.createImmutable("#aed581"))));
 BA.debugLineNum = 1373;BA.debugLine="ColorMap.put(\"light-green lighten-1\", \"#9ccc65\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green lighten-1"))),(Object)((RemoteObject.createImmutable("#9ccc65"))));
 BA.debugLineNum = 1374;BA.debugLine="ColorMap.put(\"light-green\", \"#8bc34a\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green"))),(Object)((RemoteObject.createImmutable("#8bc34a"))));
 BA.debugLineNum = 1375;BA.debugLine="ColorMap.put(\"light-green darken-1\", \"#7cb342\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green darken-1"))),(Object)((RemoteObject.createImmutable("#7cb342"))));
 BA.debugLineNum = 1376;BA.debugLine="ColorMap.put(\"light-green darken-2\", \"#689f38\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green darken-2"))),(Object)((RemoteObject.createImmutable("#689f38"))));
 BA.debugLineNum = 1377;BA.debugLine="ColorMap.put(\"light-green darken-3\", \"#558b2f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green darken-3"))),(Object)((RemoteObject.createImmutable("#558b2f"))));
 BA.debugLineNum = 1378;BA.debugLine="ColorMap.put(\"light-green darken-4\", \"#33691e\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green darken-4"))),(Object)((RemoteObject.createImmutable("#33691e"))));
 BA.debugLineNum = 1379;BA.debugLine="ColorMap.put(\"light-green accent-1\", \"#ccff90\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green accent-1"))),(Object)((RemoteObject.createImmutable("#ccff90"))));
 BA.debugLineNum = 1380;BA.debugLine="ColorMap.put(\"light-green accent-2\", \"#b2ff59\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green accent-2"))),(Object)((RemoteObject.createImmutable("#b2ff59"))));
 BA.debugLineNum = 1381;BA.debugLine="ColorMap.put(\"light-green accent-3\", \"#76ff03\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green accent-3"))),(Object)((RemoteObject.createImmutable("#76ff03"))));
 BA.debugLineNum = 1382;BA.debugLine="ColorMap.put(\"light-green accent-4\", \"#64dd17\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green accent-4"))),(Object)((RemoteObject.createImmutable("#64dd17"))));
 BA.debugLineNum = 1383;BA.debugLine="ColorMap.put(\"lime lighten-5\", \"#f9fbe7\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime lighten-5"))),(Object)((RemoteObject.createImmutable("#f9fbe7"))));
 BA.debugLineNum = 1384;BA.debugLine="ColorMap.put(\"lime lighten-4\", \"#f0f4c3\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime lighten-4"))),(Object)((RemoteObject.createImmutable("#f0f4c3"))));
 BA.debugLineNum = 1385;BA.debugLine="ColorMap.put(\"lime lighten-3\", \"#e6ee9c\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime lighten-3"))),(Object)((RemoteObject.createImmutable("#e6ee9c"))));
 BA.debugLineNum = 1386;BA.debugLine="ColorMap.put(\"lime lighten-2\", \"#dce775\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime lighten-2"))),(Object)((RemoteObject.createImmutable("#dce775"))));
 BA.debugLineNum = 1387;BA.debugLine="ColorMap.put(\"lime lighten-1\", \"#d4e157\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime lighten-1"))),(Object)((RemoteObject.createImmutable("#d4e157"))));
 BA.debugLineNum = 1388;BA.debugLine="ColorMap.put(\"lime\", \"#cddc39\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime"))),(Object)((RemoteObject.createImmutable("#cddc39"))));
 BA.debugLineNum = 1389;BA.debugLine="ColorMap.put(\"lime darken-1\", \"#c0ca33\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime darken-1"))),(Object)((RemoteObject.createImmutable("#c0ca33"))));
 BA.debugLineNum = 1390;BA.debugLine="ColorMap.put(\"lime darken-2\", \"#afb42b\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime darken-2"))),(Object)((RemoteObject.createImmutable("#afb42b"))));
 BA.debugLineNum = 1391;BA.debugLine="ColorMap.put(\"lime darken-3\", \"#9e9d24\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime darken-3"))),(Object)((RemoteObject.createImmutable("#9e9d24"))));
 BA.debugLineNum = 1392;BA.debugLine="ColorMap.put(\"lime darken-4\", \"#827717\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime darken-4"))),(Object)((RemoteObject.createImmutable("#827717"))));
 BA.debugLineNum = 1393;BA.debugLine="ColorMap.put(\"lime accent-1\", \"#f4ff81\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime accent-1"))),(Object)((RemoteObject.createImmutable("#f4ff81"))));
 BA.debugLineNum = 1394;BA.debugLine="ColorMap.put(\"lime accent-2\", \"#eeff41\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime accent-2"))),(Object)((RemoteObject.createImmutable("#eeff41"))));
 BA.debugLineNum = 1395;BA.debugLine="ColorMap.put(\"lime accent-3\", \"#c6ff00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime accent-3"))),(Object)((RemoteObject.createImmutable("#c6ff00"))));
 BA.debugLineNum = 1396;BA.debugLine="ColorMap.put(\"lime accent-4\", \"#aeea00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime accent-4"))),(Object)((RemoteObject.createImmutable("#aeea00"))));
 BA.debugLineNum = 1397;BA.debugLine="ColorMap.put(\"yellow lighten-5\", \"#fffde7\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow lighten-5"))),(Object)((RemoteObject.createImmutable("#fffde7"))));
 BA.debugLineNum = 1398;BA.debugLine="ColorMap.put(\"yellow lighten-4\", \"#fff9c4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow lighten-4"))),(Object)((RemoteObject.createImmutable("#fff9c4"))));
 BA.debugLineNum = 1399;BA.debugLine="ColorMap.put(\"yellow lighten-3\", \"#fff59d\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow lighten-3"))),(Object)((RemoteObject.createImmutable("#fff59d"))));
 BA.debugLineNum = 1400;BA.debugLine="ColorMap.put(\"yellow lighten-2\", \"#fff176\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow lighten-2"))),(Object)((RemoteObject.createImmutable("#fff176"))));
 BA.debugLineNum = 1401;BA.debugLine="ColorMap.put(\"yellow lighten-1\", \"#ffee58\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow lighten-1"))),(Object)((RemoteObject.createImmutable("#ffee58"))));
 BA.debugLineNum = 1402;BA.debugLine="ColorMap.put(\"yellow\", \"#ffeb3b\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow"))),(Object)((RemoteObject.createImmutable("#ffeb3b"))));
 BA.debugLineNum = 1403;BA.debugLine="ColorMap.put(\"yellow darken-1\", \"#fdd835\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow darken-1"))),(Object)((RemoteObject.createImmutable("#fdd835"))));
 BA.debugLineNum = 1404;BA.debugLine="ColorMap.put(\"yellow darken-2\", \"#fbc02d\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow darken-2"))),(Object)((RemoteObject.createImmutable("#fbc02d"))));
 BA.debugLineNum = 1405;BA.debugLine="ColorMap.put(\"yellow darken-3\", \"#f9a825\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow darken-3"))),(Object)((RemoteObject.createImmutable("#f9a825"))));
 BA.debugLineNum = 1406;BA.debugLine="ColorMap.put(\"yellow darken-4\", \"#f57f17\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow darken-4"))),(Object)((RemoteObject.createImmutable("#f57f17"))));
 BA.debugLineNum = 1407;BA.debugLine="ColorMap.put(\"yellow accent-1\", \"#ffff8d\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow accent-1"))),(Object)((RemoteObject.createImmutable("#ffff8d"))));
 BA.debugLineNum = 1408;BA.debugLine="ColorMap.put(\"yellow accent-2\", \"#ffff00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow accent-2"))),(Object)((RemoteObject.createImmutable("#ffff00"))));
 BA.debugLineNum = 1409;BA.debugLine="ColorMap.put(\"yellow accent-3\", \"#ffea00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow accent-3"))),(Object)((RemoteObject.createImmutable("#ffea00"))));
 BA.debugLineNum = 1410;BA.debugLine="ColorMap.put(\"yellow accent-4\", \"#ffd600\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow accent-4"))),(Object)((RemoteObject.createImmutable("#ffd600"))));
 BA.debugLineNum = 1411;BA.debugLine="ColorMap.put(\"amber lighten-5\", \"#fff8e1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber lighten-5"))),(Object)((RemoteObject.createImmutable("#fff8e1"))));
 BA.debugLineNum = 1412;BA.debugLine="ColorMap.put(\"amber lighten-4\", \"#ffecb3\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber lighten-4"))),(Object)((RemoteObject.createImmutable("#ffecb3"))));
 BA.debugLineNum = 1413;BA.debugLine="ColorMap.put(\"amber lighten-3\", \"#ffe082\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber lighten-3"))),(Object)((RemoteObject.createImmutable("#ffe082"))));
 BA.debugLineNum = 1414;BA.debugLine="ColorMap.put(\"amber lighten-2\", \"#ffd54f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber lighten-2"))),(Object)((RemoteObject.createImmutable("#ffd54f"))));
 BA.debugLineNum = 1415;BA.debugLine="ColorMap.put(\"amber lighten-1\", \"#ffca28\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber lighten-1"))),(Object)((RemoteObject.createImmutable("#ffca28"))));
 BA.debugLineNum = 1416;BA.debugLine="ColorMap.put(\"amber\", \"#ffc107\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber"))),(Object)((RemoteObject.createImmutable("#ffc107"))));
 BA.debugLineNum = 1417;BA.debugLine="ColorMap.put(\"amber darken-1\", \"#ffb300\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber darken-1"))),(Object)((RemoteObject.createImmutable("#ffb300"))));
 BA.debugLineNum = 1418;BA.debugLine="ColorMap.put(\"amber darken-2\", \"#ffa000\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber darken-2"))),(Object)((RemoteObject.createImmutable("#ffa000"))));
 BA.debugLineNum = 1419;BA.debugLine="ColorMap.put(\"amber darken-3\", \"#ff8f00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber darken-3"))),(Object)((RemoteObject.createImmutable("#ff8f00"))));
 BA.debugLineNum = 1420;BA.debugLine="ColorMap.put(\"amber darken-4\", \"#ff6f00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber darken-4"))),(Object)((RemoteObject.createImmutable("#ff6f00"))));
 BA.debugLineNum = 1421;BA.debugLine="ColorMap.put(\"amber accent-1\", \"#ffe57f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber accent-1"))),(Object)((RemoteObject.createImmutable("#ffe57f"))));
 BA.debugLineNum = 1422;BA.debugLine="ColorMap.put(\"amber accent-2\", \"#ffd740\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber accent-2"))),(Object)((RemoteObject.createImmutable("#ffd740"))));
 BA.debugLineNum = 1423;BA.debugLine="ColorMap.put(\"amber accent-3\", \"#ffc400\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber accent-3"))),(Object)((RemoteObject.createImmutable("#ffc400"))));
 BA.debugLineNum = 1424;BA.debugLine="ColorMap.put(\"amber accent-4\", \"#ffab00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber accent-4"))),(Object)((RemoteObject.createImmutable("#ffab00"))));
 BA.debugLineNum = 1425;BA.debugLine="ColorMap.put(\"orange lighten-5\", \"#fff3e0\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange lighten-5"))),(Object)((RemoteObject.createImmutable("#fff3e0"))));
 BA.debugLineNum = 1426;BA.debugLine="ColorMap.put(\"orange lighten-4\", \"#ffe0b2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange lighten-4"))),(Object)((RemoteObject.createImmutable("#ffe0b2"))));
 BA.debugLineNum = 1427;BA.debugLine="ColorMap.put(\"orange lighten-3\", \"#ffcc80\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange lighten-3"))),(Object)((RemoteObject.createImmutable("#ffcc80"))));
 BA.debugLineNum = 1428;BA.debugLine="ColorMap.put(\"orange lighten-2\", \"#ffb74d\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange lighten-2"))),(Object)((RemoteObject.createImmutable("#ffb74d"))));
 BA.debugLineNum = 1429;BA.debugLine="ColorMap.put(\"orange lighten-1\", \"#ffa726\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange lighten-1"))),(Object)((RemoteObject.createImmutable("#ffa726"))));
 BA.debugLineNum = 1430;BA.debugLine="ColorMap.put(\"orange\", \"#ff9800\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange"))),(Object)((RemoteObject.createImmutable("#ff9800"))));
 BA.debugLineNum = 1431;BA.debugLine="ColorMap.put(\"orange darken-1\", \"#fb8c00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange darken-1"))),(Object)((RemoteObject.createImmutable("#fb8c00"))));
 BA.debugLineNum = 1432;BA.debugLine="ColorMap.put(\"orange darken-2\", \"#f57c00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange darken-2"))),(Object)((RemoteObject.createImmutable("#f57c00"))));
 BA.debugLineNum = 1433;BA.debugLine="ColorMap.put(\"orange darken-3\", \"#ef6c00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange darken-3"))),(Object)((RemoteObject.createImmutable("#ef6c00"))));
 BA.debugLineNum = 1434;BA.debugLine="ColorMap.put(\"orange darken-4\", \"#e65100\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange darken-4"))),(Object)((RemoteObject.createImmutable("#e65100"))));
 BA.debugLineNum = 1435;BA.debugLine="ColorMap.put(\"orange accent-1\", \"#ffd180\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange accent-1"))),(Object)((RemoteObject.createImmutable("#ffd180"))));
 BA.debugLineNum = 1436;BA.debugLine="ColorMap.put(\"orange accent-2\", \"#ffab40\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange accent-2"))),(Object)((RemoteObject.createImmutable("#ffab40"))));
 BA.debugLineNum = 1437;BA.debugLine="ColorMap.put(\"orange accent-3\", \"#ff9100\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange accent-3"))),(Object)((RemoteObject.createImmutable("#ff9100"))));
 BA.debugLineNum = 1438;BA.debugLine="ColorMap.put(\"orange accent-4\", \"#ff6d00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange accent-4"))),(Object)((RemoteObject.createImmutable("#ff6d00"))));
 BA.debugLineNum = 1439;BA.debugLine="ColorMap.put(\"deep-orange lighten-5\", \"#fbe9e7\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange lighten-5"))),(Object)((RemoteObject.createImmutable("#fbe9e7"))));
 BA.debugLineNum = 1440;BA.debugLine="ColorMap.put(\"deep-orange lighten-4\", \"#ffccbc\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange lighten-4"))),(Object)((RemoteObject.createImmutable("#ffccbc"))));
 BA.debugLineNum = 1441;BA.debugLine="ColorMap.put(\"deep-orange lighten-3\", \"#ffab91\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange lighten-3"))),(Object)((RemoteObject.createImmutable("#ffab91"))));
 BA.debugLineNum = 1442;BA.debugLine="ColorMap.put(\"deep-orange lighten-2\", \"#ff8a65\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange lighten-2"))),(Object)((RemoteObject.createImmutable("#ff8a65"))));
 BA.debugLineNum = 1443;BA.debugLine="ColorMap.put(\"deep-orange lighten-1\", \"#ff7043\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange lighten-1"))),(Object)((RemoteObject.createImmutable("#ff7043"))));
 BA.debugLineNum = 1444;BA.debugLine="ColorMap.put(\"deep-orange\", \"#ff5722\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange"))),(Object)((RemoteObject.createImmutable("#ff5722"))));
 BA.debugLineNum = 1445;BA.debugLine="ColorMap.put(\"deep-orange darken-1\", \"#f4511e\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange darken-1"))),(Object)((RemoteObject.createImmutable("#f4511e"))));
 BA.debugLineNum = 1446;BA.debugLine="ColorMap.put(\"deep-orange darken-2\", \"#e64a19\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange darken-2"))),(Object)((RemoteObject.createImmutable("#e64a19"))));
 BA.debugLineNum = 1447;BA.debugLine="ColorMap.put(\"deep-orange darken-3\", \"#d84315\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange darken-3"))),(Object)((RemoteObject.createImmutable("#d84315"))));
 BA.debugLineNum = 1448;BA.debugLine="ColorMap.put(\"deep-orange darken-4\", \"#bf360c\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange darken-4"))),(Object)((RemoteObject.createImmutable("#bf360c"))));
 BA.debugLineNum = 1449;BA.debugLine="ColorMap.put(\"deep-orange accent-1\", \"#ff9e80\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange accent-1"))),(Object)((RemoteObject.createImmutable("#ff9e80"))));
 BA.debugLineNum = 1450;BA.debugLine="ColorMap.put(\"deep-orange accent-2\", \"#ff6e40\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange accent-2"))),(Object)((RemoteObject.createImmutable("#ff6e40"))));
 BA.debugLineNum = 1451;BA.debugLine="ColorMap.put(\"deep-orange accent-3\", \"#ff3d00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange accent-3"))),(Object)((RemoteObject.createImmutable("#ff3d00"))));
 BA.debugLineNum = 1452;BA.debugLine="ColorMap.put(\"deep-orange accent-4\", \"#dd2c00\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange accent-4"))),(Object)((RemoteObject.createImmutable("#dd2c00"))));
 BA.debugLineNum = 1453;BA.debugLine="ColorMap.put(\"brown lighten-5\", \"#efebe9\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown lighten-5"))),(Object)((RemoteObject.createImmutable("#efebe9"))));
 BA.debugLineNum = 1454;BA.debugLine="ColorMap.put(\"brown lighten-4\", \"#d7ccc8\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown lighten-4"))),(Object)((RemoteObject.createImmutable("#d7ccc8"))));
 BA.debugLineNum = 1455;BA.debugLine="ColorMap.put(\"brown lighten-3\", \"#bcaaa4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown lighten-3"))),(Object)((RemoteObject.createImmutable("#bcaaa4"))));
 BA.debugLineNum = 1456;BA.debugLine="ColorMap.put(\"brown lighten-2\", \"#a1887f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown lighten-2"))),(Object)((RemoteObject.createImmutable("#a1887f"))));
 BA.debugLineNum = 1457;BA.debugLine="ColorMap.put(\"brown lighten-1\", \"#8d6e63\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown lighten-1"))),(Object)((RemoteObject.createImmutable("#8d6e63"))));
 BA.debugLineNum = 1458;BA.debugLine="ColorMap.put(\"brown\", \"#795548\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown"))),(Object)((RemoteObject.createImmutable("#795548"))));
 BA.debugLineNum = 1459;BA.debugLine="ColorMap.put(\"brown darken-1\", \"#6d4c41\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown darken-1"))),(Object)((RemoteObject.createImmutable("#6d4c41"))));
 BA.debugLineNum = 1460;BA.debugLine="ColorMap.put(\"brown darken-2\", \"#5d4037\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown darken-2"))),(Object)((RemoteObject.createImmutable("#5d4037"))));
 BA.debugLineNum = 1461;BA.debugLine="ColorMap.put(\"brown darken-3\", \"#4e342e\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown darken-3"))),(Object)((RemoteObject.createImmutable("#4e342e"))));
 BA.debugLineNum = 1462;BA.debugLine="ColorMap.put(\"brown darken-4\", \"#3e2723\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown darken-4"))),(Object)((RemoteObject.createImmutable("#3e2723"))));
 BA.debugLineNum = 1463;BA.debugLine="ColorMap.put(\"grey lighten-5\", \"#fafafa\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey lighten-5"))),(Object)((RemoteObject.createImmutable("#fafafa"))));
 BA.debugLineNum = 1464;BA.debugLine="ColorMap.put(\"grey lighten-4\", \"#f5f5f5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey lighten-4"))),(Object)((RemoteObject.createImmutable("#f5f5f5"))));
 BA.debugLineNum = 1465;BA.debugLine="ColorMap.put(\"grey lighten-3\", \"#eeeeee\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey lighten-3"))),(Object)((RemoteObject.createImmutable("#eeeeee"))));
 BA.debugLineNum = 1466;BA.debugLine="ColorMap.put(\"grey lighten-2\", \"#e0e0e0\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey lighten-2"))),(Object)((RemoteObject.createImmutable("#e0e0e0"))));
 BA.debugLineNum = 1467;BA.debugLine="ColorMap.put(\"grey lighten-1\", \"#bdbdbd\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey lighten-1"))),(Object)((RemoteObject.createImmutable("#bdbdbd"))));
 BA.debugLineNum = 1468;BA.debugLine="ColorMap.put(\"grey\", \"#9e9e9e\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey"))),(Object)((RemoteObject.createImmutable("#9e9e9e"))));
 BA.debugLineNum = 1469;BA.debugLine="ColorMap.put(\"grey darken-1\", \"#757575\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey darken-1"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 1470;BA.debugLine="ColorMap.put(\"grey darken-2\", \"#616161\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey darken-2"))),(Object)((RemoteObject.createImmutable("#616161"))));
 BA.debugLineNum = 1471;BA.debugLine="ColorMap.put(\"grey darken-3\", \"#424242\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey darken-3"))),(Object)((RemoteObject.createImmutable("#424242"))));
 BA.debugLineNum = 1472;BA.debugLine="ColorMap.put(\"grey darken-4\", \"#212121\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey darken-4"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 1473;BA.debugLine="ColorMap.put(\"blue-grey lighten-5\", \"#eceff1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey lighten-5"))),(Object)((RemoteObject.createImmutable("#eceff1"))));
 BA.debugLineNum = 1474;BA.debugLine="ColorMap.put(\"blue-grey lighten-4\", \"#cfd8dc\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey lighten-4"))),(Object)((RemoteObject.createImmutable("#cfd8dc"))));
 BA.debugLineNum = 1475;BA.debugLine="ColorMap.put(\"blue-grey lighten-3\", \"#b0bec5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey lighten-3"))),(Object)((RemoteObject.createImmutable("#b0bec5"))));
 BA.debugLineNum = 1476;BA.debugLine="ColorMap.put(\"blue-grey lighten-2\", \"#90a4ae\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey lighten-2"))),(Object)((RemoteObject.createImmutable("#90a4ae"))));
 BA.debugLineNum = 1477;BA.debugLine="ColorMap.put(\"blue-grey lighten-1\", \"#78909c\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey lighten-1"))),(Object)((RemoteObject.createImmutable("#78909c"))));
 BA.debugLineNum = 1478;BA.debugLine="ColorMap.put(\"blue-grey\", \"#607d8b\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey"))),(Object)((RemoteObject.createImmutable("#607d8b"))));
 BA.debugLineNum = 1479;BA.debugLine="ColorMap.put(\"blue-grey darken-1\", \"#546e7a\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey darken-1"))),(Object)((RemoteObject.createImmutable("#546e7a"))));
 BA.debugLineNum = 1480;BA.debugLine="ColorMap.put(\"blue-grey darken-2\", \"#455a64\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey darken-2"))),(Object)((RemoteObject.createImmutable("#455a64"))));
 BA.debugLineNum = 1481;BA.debugLine="ColorMap.put(\"blue-grey darken-3\", \"#37474f\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey darken-3"))),(Object)((RemoteObject.createImmutable("#37474f"))));
 BA.debugLineNum = 1482;BA.debugLine="ColorMap.put(\"blue-grey darken-4\", \"#263238\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey darken-4"))),(Object)((RemoteObject.createImmutable("#263238"))));
 BA.debugLineNum = 1483;BA.debugLine="ColorMap.put(\"black\", \"#000000\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("black"))),(Object)((RemoteObject.createImmutable("#000000"))));
 BA.debugLineNum = 1484;BA.debugLine="ColorMap.put(\"white\", \"#ffffff\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("white"))),(Object)((RemoteObject.createImmutable("#ffffff"))));
 BA.debugLineNum = 1485;BA.debugLine="ColorMap.put(\"transparent\", \"transparent\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colormap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("transparent"))),(Object)((RemoteObject.createImmutable("transparent"))));
 BA.debugLineNum = 1486;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inquotes(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("InQuotes (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,858);
if (RapidSub.canDelegate("inquotes")) { return __ref.runUserSub(false, "bananovue","inquotes", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 858;BA.debugLine="Public Sub InQuotes(sValue As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 859;BA.debugLine="Return QUOTE & sValue & QUOTE";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(bananovue.__c.getField(true,"QUOTE"),_svalue,bananovue.__c.getField(true,"QUOTE"));
 BA.debugLineNum = 860;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _instr(RemoteObject __ref,RemoteObject _text,RemoteObject _sfind) throws Exception{
try {
		Debug.PushSubsStack("InStr (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("instr")) { return __ref.runUserSub(false, "bananovue","instr", __ref, _text, _sfind);}
Debug.locals.put("Text", _text);
Debug.locals.put("sFind", _sfind);
 BA.debugLineNum = 323;BA.debugLine="Sub InStr(Text As String, sFind As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 324;BA.debugLine="Return Text.tolowercase.IndexOf(sFind.tolowercase";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"toLowerCase").runMethod(true,"indexOf",(Object)(_sfind.runMethod(true,"toLowerCase")));
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _instrrev(RemoteObject __ref,RemoteObject _value,RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("InStrRev (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,523);
if (RapidSub.canDelegate("instrrev")) { return __ref.runUserSub(false, "bananovue","instrrev", __ref, _value, _search);}
Debug.locals.put("value", _value);
Debug.locals.put("search", _search);
 BA.debugLineNum = 523;BA.debugLine="Sub InStrRev(value As String, search As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 524;BA.debugLine="Return value.LastIndexOf(search) + 1";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_value.runMethod(true,"lastIndexOf",(Object)(_search)),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 525;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _join(RemoteObject __ref,RemoteObject _delimiter,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("Join (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,355);
if (RapidSub.canDelegate("join")) { return __ref.runUserSub(false, "bananovue","join", __ref, _delimiter, _lst);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fld = RemoteObject.createImmutable("");
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 355;BA.debugLine="Sub Join(delimiter As String, lst As List) As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 356;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 357;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 358;BA.debugLine="Dim fld As String";
Debug.JustUpdateDeviceLine();
_fld = RemoteObject.createImmutable("");Debug.locals.put("fld", _fld);
 BA.debugLineNum = 359;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 360;BA.debugLine="fld = lst.Get(0)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 361;BA.debugLine="sb.Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fld));
 BA.debugLineNum = 362;BA.debugLine="For i = 1 To lst.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step7 > 0 && _i.<Integer>get().intValue() <= limit7) || (step7 < 0 && _i.<Integer>get().intValue() >= limit7) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 363;BA.debugLine="Dim fld As String = lst.Get(i)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("fld", _fld);Debug.locals.put("fld", _fld);
 BA.debugLineNum = 364;BA.debugLine="sb.Append(delimiter).Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delimiter)).runVoidMethod ("Append",(Object)(_fld));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 366;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinlists(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("JoinLists (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("joinlists")) { return __ref.runUserSub(false, "bananovue","joinlists", __ref, _lst);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 382;BA.debugLine="Sub JoinLists(lst As List) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 383;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 384;BA.debugLine="nl.Initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 385;BA.debugLine="For Each lo As List In lst";
Debug.JustUpdateDeviceLine();
_lo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
{
final RemoteObject group3 = _lst;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_lo.setObject(group3.runMethod(false,"Get",index3));
Debug.locals.put("lo", _lo);
 BA.debugLineNum = 386;BA.debugLine="For Each k As Object In lo";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _lo;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = group4.runMethod(false,"Get",index4);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 387;BA.debugLine="nl.Add(k)";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)(_k));
 }
}Debug.locals.put("k", _k);
;
 }
}Debug.locals.put("lo", _lo);
;
 BA.debugLineNum = 390;BA.debugLine="Return nl";
Debug.JustUpdateDeviceLine();
if (true) return _nl;
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
public static RemoteObject  _joinmaps(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("JoinMaps (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("joinmaps")) { return __ref.runUserSub(false, "bananovue","joinmaps", __ref, _lst);}
RemoteObject _nm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 370;BA.debugLine="Sub JoinMaps(lst As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 371;BA.debugLine="Dim nm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nm = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nm", _nm);Debug.locals.put("nm", _nm);
 BA.debugLineNum = 372;BA.debugLine="For Each mr As Map In lst";
Debug.JustUpdateDeviceLine();
_mr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = _lst;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mr.setObject(group2.runMethod(false,"Get",index2));
Debug.locals.put("mr", _mr);
 BA.debugLineNum = 373;BA.debugLine="For Each k As String In mr.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _mr.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 374;BA.debugLine="Dim v As Object = mr.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _mr.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 375;BA.debugLine="nm.Put(k, v)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 }
}Debug.locals.put("mr", _mr);
;
 BA.debugLineNum = 378;BA.debugLine="Return nm";
Debug.JustUpdateDeviceLine();
if (true) return _nm;
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinnonblanks(RemoteObject __ref,RemoteObject _delimiter,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("JoinNonBlanks (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("joinnonblanks")) { return __ref.runUserSub(false, "bananovue","joinnonblanks", __ref, _delimiter, _lst);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fld = RemoteObject.createImmutable("");
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 328;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 330;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 331;BA.debugLine="nl.Initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 332;BA.debugLine="For Each str As String In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _lst;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_str = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("str", _str);
Debug.locals.put("str", _str);
 BA.debugLineNum = 333;BA.debugLine="str = str.Trim";
Debug.JustUpdateDeviceLine();
_str = _str.runMethod(true,"trim");Debug.locals.put("str", _str);
 BA.debugLineNum = 334;BA.debugLine="If str.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_str.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 335;BA.debugLine="nl.Add(str)";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)((_str)));
 };
 }
}Debug.locals.put("str", _str);
;
 BA.debugLineNum = 338;BA.debugLine="If nl.Size = 0 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_nl.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 340;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 341;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 342;BA.debugLine="Dim fld As String";
Debug.JustUpdateDeviceLine();
_fld = RemoteObject.createImmutable("");Debug.locals.put("fld", _fld);
 BA.debugLineNum = 343;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 344;BA.debugLine="fld = nl.Get(0)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_nl.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 345;BA.debugLine="sb.Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fld));
 BA.debugLineNum = 346;BA.debugLine="For i = 1 To nl.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_nl.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step16 > 0 && _i.<Integer>get().intValue() <= limit16) || (step16 < 0 && _i.<Integer>get().intValue() >= limit16) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 347;BA.debugLine="Dim fld As String = nl.Get(i)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_nl.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("fld", _fld);Debug.locals.put("fld", _fld);
 BA.debugLineNum = 348;BA.debugLine="sb.Append(delimiter).Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delimiter)).runVoidMethod ("Append",(Object)(_fld));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 350;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jqueryelement(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("JQueryElement (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("jqueryelement")) { return __ref.runUserSub(false, "bananovue","jqueryelement", __ref, _sid);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 307;BA.debugLine="Sub JQueryElement(sid As String) As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="sid = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
_sid = _sid.runMethod(true,"toLowerCase");Debug.locals.put("sid", _sid);
 BA.debugLineNum = 309;BA.debugLine="Dim bo As BANanoObject = JQuery.Selector($\"#${sid";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_jquery" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("#"),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable(""))))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 310;BA.debugLine="Return bo";
Debug.JustUpdateDeviceLine();
if (true) return _bo;
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
public static RemoteObject  _json2list(RemoteObject __ref,RemoteObject _strvalue) throws Exception{
try {
		Debug.PushSubsStack("Json2List (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,721);
if (RapidSub.canDelegate("json2list")) { return __ref.runUserSub(false, "bananovue","json2list", __ref, _strvalue);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("com.ab.banano.BANanoJSONParser");
Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 721;BA.debugLine="Sub Json2List(strValue As String) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 722;BA.debugLine="Dim lst As List";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 723;BA.debugLine="lst.Initialize";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 724;BA.debugLine="lst.clear";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Clear");
 BA.debugLineNum = 725;BA.debugLine="If strValue.Length = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_strvalue.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 726;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 };
 BA.debugLineNum = 728;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 729;BA.debugLine="Dim parser As BANanoJSONParser";
Debug.JustUpdateDeviceLine();
_parser = RemoteObject.createNew ("com.ab.banano.BANanoJSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 730;BA.debugLine="parser.Initialize(strValue)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(_strvalue));
 BA.debugLineNum = 731;BA.debugLine="Return parser.NextArray";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _parser.runMethod(false,"NextArray");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 733;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 };
 BA.debugLineNum = 735;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _json2map(RemoteObject __ref,RemoteObject _strjson) throws Exception{
try {
		Debug.PushSubsStack("Json2Map (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,663);
if (RapidSub.canDelegate("json2map")) { return __ref.runUserSub(false, "bananovue","json2map", __ref, _strjson);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("strJSON", _strjson);
 BA.debugLineNum = 663;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 664;BA.debugLine="Dim json As BANanoJSONParser";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 665;BA.debugLine="Dim Map1 As Map";
Debug.JustUpdateDeviceLine();
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 666;BA.debugLine="Map1.Initialize";
Debug.JustUpdateDeviceLine();
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 667;BA.debugLine="Map1.clear";
Debug.JustUpdateDeviceLine();
_map1.runVoidMethod ("Clear");
 BA.debugLineNum = 668;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 669;BA.debugLine="If strJSON.length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_strjson.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 670;BA.debugLine="json.Initialize(strJSON)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize",(Object)(_strjson));
 BA.debugLineNum = 671;BA.debugLine="Map1 = json.NextObject";
Debug.JustUpdateDeviceLine();
_map1 = _json.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 };
 BA.debugLineNum = 673;BA.debugLine="Return Map1";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _map1;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 675;BA.debugLine="Return Map1";
Debug.JustUpdateDeviceLine();
if (true) return _map1;
 };
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
public static RemoteObject  _jsonpretty(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("JSONPretty (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("jsonpretty")) { return __ref.runUserSub(false, "bananovue","jsonpretty", __ref, _m);}
RemoteObject _pretty = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 301;BA.debugLine="Sub JSONPretty(m As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="Dim pretty As String = BANAno.RunJavascriptMethod";
Debug.JustUpdateDeviceLine();
_pretty = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunJavascriptMethod",(Object)(BA.ObjectToString("JSON.stringify")),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {_m,bananovue.__c.getField(false,"Null"),RemoteObject.createImmutable((4))}))))));Debug.locals.put("pretty", _pretty);Debug.locals.put("pretty", _pretty);
 BA.debugLineNum = 303;BA.debugLine="Return pretty";
Debug.JustUpdateDeviceLine();
if (true) return _pretty;
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jsonsetproperty(RemoteObject __ref,RemoteObject _sjson,RemoteObject _updates) throws Exception{
try {
		Debug.PushSubsStack("JSONSetProperty (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1124);
if (RapidSub.canDelegate("jsonsetproperty")) { return __ref.runUserSub(false, "bananovue","jsonsetproperty", __ref, _sjson, _updates);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
RemoteObject _sout = RemoteObject.createImmutable("");
Debug.locals.put("sjson", _sjson);
Debug.locals.put("updates", _updates);
 BA.debugLineNum = 1124;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1125;BA.debugLine="Dim m As Map = BANAno.FromJson(sjson)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"FromJson",(Object)((_sjson))));Debug.locals.put("m", _m);
 BA.debugLineNum = 1126;BA.debugLine="For Each k As String In updates.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _updates.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1127;BA.debugLine="Dim v As Object = updates.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _updates.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1128;BA.debugLine="m.Put(k, v)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1130;BA.debugLine="Dim sout As String = BANAno.ToJson(m)";
Debug.JustUpdateDeviceLine();
_sout = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((_m.getObject()))));Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 1131;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
if (true) return _sout;
 BA.debugLineNum = 1132;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jsonvalues2lowercase(RemoteObject __ref,RemoteObject _sjson,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("JSONValues2LowerCase (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,639);
if (RapidSub.canDelegate("jsonvalues2lowercase")) { return __ref.runUserSub(false, "bananovue","jsonvalues2lowercase", __ref, _sjson, _props);}
RemoteObject _jmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _njson = RemoteObject.createImmutable("");
Debug.locals.put("sJSON", _sjson);
Debug.locals.put("props", _props);
 BA.debugLineNum = 639;BA.debugLine="Sub JSONValues2LowerCase(sJSON As String, props As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 641;BA.debugLine="Dim jmap As Map = Json2Map(sJSON)";
Debug.JustUpdateDeviceLine();
_jmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_jmap = __ref.runClassMethod (b4j.example.bananovue.class, "_json2map" /*RemoteObject*/ ,(Object)(_sjson));Debug.locals.put("jmap", _jmap);Debug.locals.put("jmap", _jmap);
 BA.debugLineNum = 642;BA.debugLine="MapValues2LowerCase(jmap, props)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_mapvalues2lowercase" /*RemoteObject*/ ,(Object)(_jmap),(Object)(_props));
 BA.debugLineNum = 643;BA.debugLine="Dim nJSON As String = Map2Json(jmap)";
Debug.JustUpdateDeviceLine();
_njson = __ref.runClassMethod (b4j.example.bananovue.class, "_map2json" /*RemoteObject*/ ,(Object)(_jmap));Debug.locals.put("nJSON", _njson);Debug.locals.put("nJSON", _njson);
 BA.debugLineNum = 644;BA.debugLine="Return nJSON";
Debug.JustUpdateDeviceLine();
if (true) return _njson;
 BA.debugLineNum = 645;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lcase(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("LCase (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,846);
if (RapidSub.canDelegate("lcase")) { return __ref.runUserSub(false, "bananovue","lcase", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 846;BA.debugLine="Sub LCase(Text As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 847;BA.debugLine="Return Text.ToLowerCase";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"toLowerCase");
 BA.debugLineNum = 848;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _leftstring(RemoteObject __ref,RemoteObject _text,RemoteObject _llength) throws Exception{
try {
		Debug.PushSubsStack("LeftString (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,809);
if (RapidSub.canDelegate("leftstring")) { return __ref.runUserSub(false, "bananovue","leftstring", __ref, _text, _llength);}
Debug.locals.put("Text", _text);
Debug.locals.put("lLength", _llength);
 BA.debugLineNum = 809;BA.debugLine="Sub LeftString(Text As String, lLength As Long)As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 810;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_llength,BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
_llength = BA.numberCast(long.class, _text.runMethod(true,"length"));Debug.locals.put("lLength", _llength);};
 BA.debugLineNum = 811;BA.debugLine="Return Text.SubString2(0, lLength)";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _llength)));
 BA.debugLineNum = 812;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _len(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("Len (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,528);
if (RapidSub.canDelegate("len")) { return __ref.runUserSub(false, "bananovue","len", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 528;BA.debugLine="Sub Len(Text As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 529;BA.debugLine="Return Text.Length";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"length");
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2arrayvariable(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("List2ArrayVariable (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,619);
if (RapidSub.canDelegate("list2arrayvariable")) { return __ref.runUserSub(false, "bananovue","list2arrayvariable", __ref, _lst);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fld = RemoteObject.createImmutable("");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 619;BA.debugLine="Sub List2ArrayVariable(lst As List) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 620;BA.debugLine="If lst.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 621;BA.debugLine="Return $\"\"\"\"$";
Debug.JustUpdateDeviceLine();
if (true) return (RemoteObject.createImmutable("\"\""));
 };
 BA.debugLineNum = 623;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 624;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 625;BA.debugLine="Dim fld As String";
Debug.JustUpdateDeviceLine();
_fld = RemoteObject.createImmutable("");Debug.locals.put("fld", _fld);
 BA.debugLineNum = 626;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 627;BA.debugLine="fld = lst.Get(0)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 628;BA.debugLine="fld = $\"\"${fld}\"\"$";
Debug.JustUpdateDeviceLine();
_fld = (RemoteObject.concat(RemoteObject.createImmutable("\""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fld))),RemoteObject.createImmutable("\"")));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 629;BA.debugLine="sb.Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fld));
 BA.debugLineNum = 630;BA.debugLine="For i = 1 To lst.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step11 > 0 && _i.<Integer>get().intValue() <= limit11) || (step11 < 0 && _i.<Integer>get().intValue() >= limit11) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 631;BA.debugLine="Dim fld As String = lst.Get(i)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("fld", _fld);Debug.locals.put("fld", _fld);
 BA.debugLineNum = 632;BA.debugLine="fld = $\"\"${fld}\"\"$";
Debug.JustUpdateDeviceLine();
_fld = (RemoteObject.concat(RemoteObject.createImmutable("\""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fld))),RemoteObject.createImmutable("\"")));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 633;BA.debugLine="sb.Append(\",\").Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(","))).runVoidMethod ("Append",(Object)(_fld));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 635;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 636;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2idvalue(RemoteObject __ref,RemoteObject _lst,RemoteObject _mapvalues) throws Exception{
try {
		Debug.PushSubsStack("List2IDValue (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,603);
if (RapidSub.canDelegate("list2idvalue")) { return __ref.runUserSub(false, "bananovue","list2idvalue", __ref, _lst, _mapvalues);}
RemoteObject _mv1 = RemoteObject.createImmutable("");
RemoteObject _mv2 = RemoteObject.createImmutable("");
RemoteObject _nlst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dict = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mk = RemoteObject.createImmutable("");
RemoteObject _mv = RemoteObject.createImmutable("");
RemoteObject _nm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("lst", _lst);
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 603;BA.debugLine="Sub List2IDValue(lst As List, mapValues As List) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 604;BA.debugLine="Dim mv1 As String = mapValues.get(0)";
Debug.JustUpdateDeviceLine();
_mv1 = BA.ObjectToString(_mapvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mv1", _mv1);Debug.locals.put("mv1", _mv1);
 BA.debugLineNum = 605;BA.debugLine="Dim mv2 As String = mapValues.get(1)";
Debug.JustUpdateDeviceLine();
_mv2 = BA.ObjectToString(_mapvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("mv2", _mv2);Debug.locals.put("mv2", _mv2);
 BA.debugLineNum = 606;BA.debugLine="Dim nlst As List";
Debug.JustUpdateDeviceLine();
_nlst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nlst", _nlst);
 BA.debugLineNum = 607;BA.debugLine="nlst.initialize";
Debug.JustUpdateDeviceLine();
_nlst.runVoidMethod ("Initialize");
 BA.debugLineNum = 608;BA.debugLine="For Each dict As Map In lst";
Debug.JustUpdateDeviceLine();
_dict = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = _lst;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_dict.setObject(group5.runMethod(false,"Get",index5));
Debug.locals.put("dict", _dict);
 BA.debugLineNum = 609;BA.debugLine="Dim mk As String = dict.get(mv1)";
Debug.JustUpdateDeviceLine();
_mk = BA.ObjectToString(_dict.runMethod(false,"Get",(Object)((_mv1))));Debug.locals.put("mk", _mk);Debug.locals.put("mk", _mk);
 BA.debugLineNum = 610;BA.debugLine="Dim mv As String = dict.get(mv2)";
Debug.JustUpdateDeviceLine();
_mv = BA.ObjectToString(_dict.runMethod(false,"Get",(Object)((_mv2))));Debug.locals.put("mv", _mv);Debug.locals.put("mv", _mv);
 BA.debugLineNum = 611;BA.debugLine="Dim nm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nm = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nm", _nm);Debug.locals.put("nm", _nm);
 BA.debugLineNum = 612;BA.debugLine="nm.Put(\"id\", mk)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_mk)));
 BA.debugLineNum = 613;BA.debugLine="nm.put(\"value\", mv)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("value"))),(Object)((_mv)));
 BA.debugLineNum = 614;BA.debugLine="nlst.Add(nm)";
Debug.JustUpdateDeviceLine();
_nlst.runVoidMethod ("Add",(Object)((_nm.getObject())));
 }
}Debug.locals.put("dict", _dict);
;
 BA.debugLineNum = 616;BA.debugLine="Return nlst";
Debug.JustUpdateDeviceLine();
if (true) return _nlst;
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
public static RemoteObject  _list2json(RemoteObject __ref,RemoteObject _mp) throws Exception{
try {
		Debug.PushSubsStack("List2Json (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,714);
if (RapidSub.canDelegate("list2json")) { return __ref.runUserSub(false, "bananovue","list2json", __ref, _mp);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONGenerator");
Debug.locals.put("mp", _mp);
 BA.debugLineNum = 714;BA.debugLine="Sub List2Json(mp As List) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 715;BA.debugLine="Dim JSON As BANanoJSONGenerator";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 716;BA.debugLine="JSON.Initialize2(mp)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize2",(Object)(_mp));
 BA.debugLineNum = 717;BA.debugLine="Return JSON.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _json.runMethod(true,"ToString");
 BA.debugLineNum = 718;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2keyvalues(RemoteObject __ref,RemoteObject _lst,RemoteObject _mapvalues) throws Exception{
try {
		Debug.PushSubsStack("List2KeyValues (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,598);
if (RapidSub.canDelegate("list2keyvalues")) { return __ref.runUserSub(false, "bananovue","list2keyvalues", __ref, _lst, _mapvalues);}
Debug.locals.put("lst", _lst);
Debug.locals.put("mapvalues", _mapvalues);
 BA.debugLineNum = 598;BA.debugLine="Sub List2KeyValues(lst As List, mapvalues As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 599;BA.debugLine="Return List2IDValue(lst, mapvalues)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananovue.class, "_list2idvalue" /*RemoteObject*/ ,(Object)(_lst),(Object)(_mapvalues));
 BA.debugLineNum = 600;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2map(RemoteObject __ref,RemoteObject _lst,RemoteObject _keyname,RemoteObject _valuename) throws Exception{
try {
		Debug.PushSubsStack("List2Map (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1093);
if (RapidSub.canDelegate("list2map")) { return __ref.runUserSub(false, "bananovue","list2map", __ref, _lst, _keyname, _valuename);}
Debug.locals.put("lst", _lst);
Debug.locals.put("keyName", _keyname);
Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 1093;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1094;BA.debugLine="Return List2Options(lst, keyName, valueName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananovue.class, "_list2options" /*RemoteObject*/ ,(Object)(_lst),(Object)(_keyname),(Object)(_valuename));
 BA.debugLineNum = 1095;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2options(RemoteObject __ref,RemoteObject _lst,RemoteObject _keyname,RemoteObject _valuename) throws Exception{
try {
		Debug.PushSubsStack("List2Options (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1080);
if (RapidSub.canDelegate("list2options")) { return __ref.runUserSub(false, "bananovue","list2options", __ref, _lst, _keyname, _valuename);}
RemoteObject _recs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _nrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("lst", _lst);
Debug.locals.put("keyName", _keyname);
Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 1080;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1081;BA.debugLine="Dim recs As List";
Debug.JustUpdateDeviceLine();
_recs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("recs", _recs);
 BA.debugLineNum = 1082;BA.debugLine="recs.Initialize";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Initialize");
 BA.debugLineNum = 1083;BA.debugLine="For Each k As String In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _lst;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1084;BA.debugLine="Dim nrec As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nrec = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nrec", _nrec);Debug.locals.put("nrec", _nrec);
 BA.debugLineNum = 1085;BA.debugLine="nrec.Put(keyName, k)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_keyname)),(Object)((_k)));
 BA.debugLineNum = 1086;BA.debugLine="nrec.Put(valueName, k)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_valuename)),(Object)((_k)));
 BA.debugLineNum = 1087;BA.debugLine="recs.Add(nrec)";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Add",(Object)((_nrec.getObject())));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1089;BA.debugLine="Return recs";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _recs.getObject());
 BA.debugLineNum = 1090;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listremoveduplicates(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("ListRemoveDuplicates (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("listremoveduplicates")) { return __ref.runUserSub(false, "bananovue","listremoveduplicates", __ref, _lst);}
RemoteObject _nd = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 196;BA.debugLine="Sub ListRemoveDuplicates(lst As List) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="Dim nd As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nd = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nd = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nd", _nd);Debug.locals.put("nd", _nd);
 BA.debugLineNum = 198;BA.debugLine="For Each k As String In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _lst;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 199;BA.debugLine="nd.Put(k, k)";
Debug.JustUpdateDeviceLine();
_nd.runVoidMethod ("Put",(Object)((_k)),(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 201;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 202;BA.debugLine="nl.Initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 203;BA.debugLine="For Each k As String In nd.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group7 = _nd.runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 204;BA.debugLine="nl.Add(k)";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 206;BA.debugLine="nl.Sort(True)";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Sort",(Object)(bananovue.__c.getField(true,"True")));
 BA.debugLineNum = 207;BA.debugLine="Return nl";
Debug.JustUpdateDeviceLine();
if (true) return _nl;
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _longdate(RemoteObject __ref,RemoteObject _sdate) throws Exception{
try {
		Debug.PushSubsStack("LongDate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,818);
if (RapidSub.canDelegate("longdate")) { return __ref.runUserSub(false, "bananovue","longdate", __ref, _sdate);}
RemoteObject _dt = RemoteObject.createImmutable(0L);
Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 818;BA.debugLine="Sub LongDate(sDate As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 819;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sdate.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 820;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 821;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 822;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
Debug.JustUpdateDeviceLine();
_dt = bananovue.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_sdate));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 823;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEEE, dd MMMM yyyy"));
 BA.debugLineNum = 824;BA.debugLine="Return DateTime.Date(dt)";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_dt));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 826;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 828;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _longdatetime(RemoteObject __ref,RemoteObject _sdate) throws Exception{
try {
		Debug.PushSubsStack("LongDateTime (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,830);
if (RapidSub.canDelegate("longdatetime")) { return __ref.runUserSub(false, "bananovue","longdatetime", __ref, _sdate);}
RemoteObject _dt = RemoteObject.createImmutable(0L);
Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 830;BA.debugLine="Sub LongDateTime(sDate As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 831;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sdate.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 832;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 833;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm"));
 BA.debugLineNum = 834;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
Debug.JustUpdateDeviceLine();
_dt = bananovue.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_sdate));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 835;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy HH:mm\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEEE, dd MMMM yyyy HH:mm"));
 BA.debugLineNum = 836;BA.debugLine="Return DateTime.Date(dt)";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_dt));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 838;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 840;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _longdatetimetoday(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LongDateTimeToday (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1714);
if (RapidSub.canDelegate("longdatetimetoday")) { return __ref.runUserSub(false, "bananovue","longdatetimetoday", __ref);}
RemoteObject _dt = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 1714;BA.debugLine="Sub LongDateTimeToday() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1715;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm"));
 BA.debugLineNum = 1716;BA.debugLine="Dim dt As Long = DateTime.now";
Debug.JustUpdateDeviceLine();
_dt = bananovue.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 1717;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy, HH:mm\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy, HH:mm"));
 BA.debugLineNum = 1718;BA.debugLine="Return DateTime.Date(dt)";
Debug.JustUpdateDeviceLine();
if (true) return bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_dt));
 BA.debugLineNum = 1719;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeboolean(RemoteObject __ref,RemoteObject _m,RemoteObject _xkeys) throws Exception{
try {
		Debug.PushSubsStack("MakeBoolean (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1858);
if (RapidSub.canDelegate("makeboolean")) { return __ref.runUserSub(false, "bananovue","makeboolean", __ref, _m, _xkeys);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1858;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1859;BA.debugLine="For Each k As String In xkeys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _xkeys;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1860;BA.debugLine="If m.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_m.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1861;BA.debugLine="Dim v As String = m.GetDefault(k,\"0\")";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)((_k)),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1862;BA.debugLine="v = CStr(v)";
Debug.JustUpdateDeviceLine();
_v = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_v)));Debug.locals.put("v", _v);
 BA.debugLineNum = 1863;BA.debugLine="v = v.trim";
Debug.JustUpdateDeviceLine();
_v = _v.runMethod(true,"trim");Debug.locals.put("v", _v);
 BA.debugLineNum = 1864;BA.debugLine="Select Case v";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_v,BA.ObjectToString(""),BA.ObjectToString("0"),BA.ObjectToString("false"),BA.ObjectToString("False"),BA.ObjectToString(bananovue.__c.getField(true,"False")),BA.NumberToString(0),BA.ObjectToString("1"),BA.ObjectToString("true"),BA.ObjectToString("True"),BA.ObjectToString(bananovue.__c.getField(true,"True")),BA.NumberToString(1))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 BA.debugLineNum = 1866;BA.debugLine="m.Put(k, False)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_k)),(Object)((bananovue.__c.getField(true,"False"))));
 break; }
case 6: 
case 7: 
case 8: 
case 9: 
case 10: {
 BA.debugLineNum = 1868;BA.debugLine="m.Put(k, True)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_k)),(Object)((bananovue.__c.getField(true,"True"))));
 break; }
}
;
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1872;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedate(RemoteObject __ref,RemoteObject _m,RemoteObject _xkeys) throws Exception{
try {
		Debug.PushSubsStack("MakeDate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1906);
if (RapidSub.canDelegate("makedate")) { return __ref.runUserSub(false, "bananovue","makedate", __ref, _m, _xkeys);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1906;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1907;BA.debugLine="For Each k As String In xkeys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _xkeys;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1908;BA.debugLine="If m.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_m.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1909;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)((_k)),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1910;BA.debugLine="v = CStr(v)";
Debug.JustUpdateDeviceLine();
_v = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_v)));Debug.locals.put("v", _v);
 BA.debugLineNum = 1911;BA.debugLine="v = v.trim";
Debug.JustUpdateDeviceLine();
_v = _v.runMethod(true,"trim");Debug.locals.put("v", _v);
 BA.debugLineNum = 1912;BA.debugLine="v = MvField(v,1,\" \")";
Debug.JustUpdateDeviceLine();
_v = __ref.runClassMethod (b4j.example.bananovue.class, "_mvfield" /*RemoteObject*/ ,(Object)(_v),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("v", _v);
 BA.debugLineNum = 1913;BA.debugLine="m.Put(k, v)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_k)),(Object)((_v)));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1916;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedouble(RemoteObject __ref,RemoteObject _m,RemoteObject _xkeys) throws Exception{
try {
		Debug.PushSubsStack("MakeDouble (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1845);
if (RapidSub.canDelegate("makedouble")) { return __ref.runUserSub(false, "bananovue","makedouble", __ref, _m, _xkeys);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1845;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1846;BA.debugLine="For Each k As String In xkeys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _xkeys;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1847;BA.debugLine="If m.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_m.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1848;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)((_k)),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1849;BA.debugLine="v = CStr(v)";
Debug.JustUpdateDeviceLine();
_v = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_v)));Debug.locals.put("v", _v);
 BA.debugLineNum = 1850;BA.debugLine="v = v.trim";
Debug.JustUpdateDeviceLine();
_v = _v.runMethod(true,"trim");Debug.locals.put("v", _v);
 BA.debugLineNum = 1851;BA.debugLine="If v = \"\" Then v = \"0\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v,BA.ObjectToString(""))) { 
_v = BA.ObjectToString("0");Debug.locals.put("v", _v);};
 BA.debugLineNum = 1852;BA.debugLine="v = BANAno.parseFloat(v)";
Debug.JustUpdateDeviceLine();
_v = BA.NumberToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_v))));Debug.locals.put("v", _v);
 BA.debugLineNum = 1853;BA.debugLine="m.Put(k, v)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_k)),(Object)((_v)));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1856;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeinteger(RemoteObject __ref,RemoteObject _m,RemoteObject _xkeys) throws Exception{
try {
		Debug.PushSubsStack("MakeInteger (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1832);
if (RapidSub.canDelegate("makeinteger")) { return __ref.runUserSub(false, "bananovue","makeinteger", __ref, _m, _xkeys);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1832;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1833;BA.debugLine="For Each k As String In xkeys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _xkeys;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1834;BA.debugLine="If m.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_m.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1835;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)((_k)),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1836;BA.debugLine="v = CStr(v)";
Debug.JustUpdateDeviceLine();
_v = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_v)));Debug.locals.put("v", _v);
 BA.debugLineNum = 1837;BA.debugLine="v = v.trim";
Debug.JustUpdateDeviceLine();
_v = _v.runMethod(true,"trim");Debug.locals.put("v", _v);
 BA.debugLineNum = 1838;BA.debugLine="If v = \"\" Then v = \"0\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v,BA.ObjectToString(""))) { 
_v = BA.ObjectToString("0");Debug.locals.put("v", _v);};
 BA.debugLineNum = 1839;BA.debugLine="v = BANAno.parseInt(v)";
Debug.JustUpdateDeviceLine();
_v = BA.NumberToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_v))));Debug.locals.put("v", _v);
 BA.debugLineNum = 1840;BA.debugLine="m.Put(k, v)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_k)),(Object)((_v)));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1843;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makelowercase(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("MakeLowerCase (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1896);
if (RapidSub.canDelegate("makelowercase")) { return __ref.runUserSub(false, "bananovue","makelowercase", __ref, _m);}
RemoteObject _nm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 1896;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1897;BA.debugLine="Dim nm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nm = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nm", _nm);Debug.locals.put("nm", _nm);
 BA.debugLineNum = 1898;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _m.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1899;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1900;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 1901;BA.debugLine="nm.Put(k, v)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1903;BA.debugLine="Return nm";
Debug.JustUpdateDeviceLine();
if (true) return _nm;
 BA.debugLineNum = 1904;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makemoney(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("MakeMoney (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,774);
if (RapidSub.canDelegate("makemoney")) { return __ref.runUserSub(false, "bananovue","makemoney", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 774;BA.debugLine="Sub MakeMoney(sValue As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 775;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("0.00");};
 BA.debugLineNum = 776;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue,BA.ObjectToString("null"))) { 
_svalue = BA.ObjectToString("0.00");Debug.locals.put("sValue", _svalue);};
 BA.debugLineNum = 777;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 778;BA.debugLine="sValue = Val(sValue)";
Debug.JustUpdateDeviceLine();
_svalue = __ref.runClassMethod (b4j.example.bananovue.class, "_val" /*RemoteObject*/ ,(Object)(_svalue));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 779;BA.debugLine="If sValue = \"0\" Then sValue = \"000\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue,BA.ObjectToString("0"))) { 
_svalue = BA.ObjectToString("000");Debug.locals.put("sValue", _svalue);};
 BA.debugLineNum = 780;BA.debugLine="sValue = Round2(sValue,2)";
Debug.JustUpdateDeviceLine();
_svalue = BA.NumberToString(bananovue.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _svalue)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 781;BA.debugLine="Return NumberFormat2(sValue, 1, 2, 2, True)";
Debug.JustUpdateDeviceLine();
if (true) return bananovue.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _svalue)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(bananovue.__c.getField(true,"True")));
 BA.debugLineNum = 782;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MakePx (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1525);
if (RapidSub.canDelegate("makepx")) { return __ref.runUserSub(false, "bananovue","makepx", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1525;BA.debugLine="Sub MakePx(sValue As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1526;BA.debugLine="sValue = sValue.trim";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"trim");Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1527;BA.debugLine="If sValue.EndsWith(\"%\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("%"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1528;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1529;BA.debugLine="else If sValue.EndsWith(\"vm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1530;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1531;BA.debugLine="else If sValue.EndsWith(\"px\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("px"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1532;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1533;BA.debugLine="else If sValue.EndsWith(\"cm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("cm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1534;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1535;BA.debugLine="else If sValue.EndsWith(\"mm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("mm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1536;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1537;BA.debugLine="else If sValue.EndsWith(\"in\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("in"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1538;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1539;BA.debugLine="else If sValue.EndsWith(\"pt\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("pt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1540;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1541;BA.debugLine="else If sValue.EndsWith(\"pc\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("pc"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1542;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1543;BA.debugLine="else If sValue.EndsWith(\"em\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("em"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1544;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1545;BA.debugLine="else If sValue.EndsWith(\"ex\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("ex"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1546;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1547;BA.debugLine="else If sValue.EndsWith(\"ch\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("ch"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1548;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1549;BA.debugLine="else If sValue.EndsWith(\"rem\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("rem"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1550;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1551;BA.debugLine="else If sValue.EndsWith(\"vw\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vw"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1552;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1553;BA.debugLine="else If sValue.EndsWith(\"vh\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vh"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1554;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1555;BA.debugLine="else If sValue.EndsWith(\"vmin\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vmin"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1556;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1557;BA.debugLine="else If sValue.EndsWith(\"vmax\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vmax"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1558;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1559;BA.debugLine="else If sValue.EndsWith(\";\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1560;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else {
 BA.debugLineNum = 1562;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"replace",(Object)(BA.ObjectToString("px")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1563;BA.debugLine="sValue = $\"${sValue}px\"$";
Debug.JustUpdateDeviceLine();
_svalue = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_svalue))),RemoteObject.createImmutable("px")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1564;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue,BA.ObjectToString("px"))) { 
_svalue = BA.ObjectToString("");Debug.locals.put("sValue", _svalue);};
 BA.debugLineNum = 1565;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }}}}}}}}}}}}}}}}}
;
 BA.debugLineNum = 1567;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketrim(RemoteObject __ref,RemoteObject _m,RemoteObject _xkeys) throws Exception{
try {
		Debug.PushSubsStack("MakeTrim (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1885);
if (RapidSub.canDelegate("maketrim")) { return __ref.runUserSub(false, "bananovue","maketrim", __ref, _m, _xkeys);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1885;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1886;BA.debugLine="For Each k As String In xkeys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _xkeys;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1887;BA.debugLine="If m.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_m.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1888;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)((_k)),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1889;BA.debugLine="v = CStr(v)";
Debug.JustUpdateDeviceLine();
_v = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_v)));Debug.locals.put("v", _v);
 BA.debugLineNum = 1890;BA.debugLine="v = v.trim";
Debug.JustUpdateDeviceLine();
_v = _v.runMethod(true,"trim");Debug.locals.put("v", _v);
 BA.debugLineNum = 1891;BA.debugLine="m.Put(k, v)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_k)),(Object)((_v)));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1894;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _map2json(RemoteObject __ref,RemoteObject _mp) throws Exception{
try {
		Debug.PushSubsStack("Map2Json (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,649);
if (RapidSub.canDelegate("map2json")) { return __ref.runUserSub(false, "bananovue","map2json", __ref, _mp);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONGenerator");
Debug.locals.put("mp", _mp);
 BA.debugLineNum = 649;BA.debugLine="Sub Map2Json(mp As Map) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 650;BA.debugLine="Dim JSON As BANanoJSONGenerator";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 651;BA.debugLine="JSON.Initialize(mp)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize",(Object)(_mp));
 BA.debugLineNum = 652;BA.debugLine="Return JSON.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _json.runMethod(true,"ToString");
 BA.debugLineNum = 653;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _map2jsonpretty(RemoteObject __ref,RemoteObject _mp) throws Exception{
try {
		Debug.PushSubsStack("Map2JsonPretty (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,655);
if (RapidSub.canDelegate("map2jsonpretty")) { return __ref.runUserSub(false, "bananovue","map2jsonpretty", __ref, _mp);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONGenerator");
Debug.locals.put("mp", _mp);
 BA.debugLineNum = 655;BA.debugLine="Sub Map2JsonPretty(mp As Map) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 656;BA.debugLine="Dim JSON As BANanoJSONGenerator";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 657;BA.debugLine="JSON.Initialize(mp)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize",(Object)(_mp));
 BA.debugLineNum = 658;BA.debugLine="Return JSON.ToPrettyString(4)";
Debug.JustUpdateDeviceLine();
if (true) return _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _map2options(RemoteObject __ref,RemoteObject _m,RemoteObject _keyname,RemoteObject _valuename) throws Exception{
try {
		Debug.PushSubsStack("Map2Options (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1098);
if (RapidSub.canDelegate("map2options")) { return __ref.runUserSub(false, "bananovue","map2options", __ref, _m, _keyname, _valuename);}
RemoteObject _recs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
RemoteObject _nrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("m", _m);
Debug.locals.put("keyName", _keyname);
Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 1098;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1099;BA.debugLine="Dim recs As List";
Debug.JustUpdateDeviceLine();
_recs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("recs", _recs);
 BA.debugLineNum = 1100;BA.debugLine="recs.Initialize";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Initialize");
 BA.debugLineNum = 1101;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _m.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1102;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1103;BA.debugLine="Dim nrec As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nrec = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nrec", _nrec);Debug.locals.put("nrec", _nrec);
 BA.debugLineNum = 1104;BA.debugLine="nrec.Put(keyName, k)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_keyname)),(Object)((_k)));
 BA.debugLineNum = 1105;BA.debugLine="nrec.Put(valueName, v)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_valuename)),(Object)(_v));
 BA.debugLineNum = 1106;BA.debugLine="recs.Add(nrec)";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Add",(Object)((_nrec.getObject())));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1108;BA.debugLine="Return recs";
Debug.JustUpdateDeviceLine();
if (true) return _recs;
 BA.debugLineNum = 1109;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapkeys2list(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("MapKeys2List (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,395);
if (RapidSub.canDelegate("mapkeys2list")) { return __ref.runUserSub(false, "bananovue","mapkeys2list", __ref, _m);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 395;BA.debugLine="Sub MapKeys2List(m As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 396;BA.debugLine="Dim lst As List";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 397;BA.debugLine="lst.Initialize";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 398;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _m.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 399;BA.debugLine="lst.Add(k)";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Add",(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 401;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapkeyslowercaselist(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("MapKeysLowerCaseList (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,902);
if (RapidSub.canDelegate("mapkeyslowercaselist")) { return __ref.runUserSub(false, "bananovue","mapkeyslowercaselist", __ref, _lst);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 902;BA.debugLine="Sub MapKeysLowerCaseList(lst As List) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 903;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 904;BA.debugLine="nl.Initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 905;BA.debugLine="For Each rec As Map In lst";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group3 = _lst;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_rec.setObject(group3.runMethod(false,"Get",index3));
Debug.locals.put("rec", _rec);
 BA.debugLineNum = 906;BA.debugLine="rec = MapKeysLowerCaseSingle(rec)";
Debug.JustUpdateDeviceLine();
_rec = __ref.runClassMethod (b4j.example.bananovue.class, "_mapkeyslowercasesingle" /*RemoteObject*/ ,(Object)(_rec));Debug.locals.put("rec", _rec);
 BA.debugLineNum = 907;BA.debugLine="nl.Add(rec)";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)((_rec.getObject())));
 }
}Debug.locals.put("rec", _rec);
;
 BA.debugLineNum = 909;BA.debugLine="Return nl";
Debug.JustUpdateDeviceLine();
if (true) return _nl;
 BA.debugLineNum = 910;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapkeyslowercasesingle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("MapKeysLowerCaseSingle (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,891);
if (RapidSub.canDelegate("mapkeyslowercasesingle")) { return __ref.runUserSub(false, "bananovue","mapkeyslowercasesingle", __ref, _m);}
RemoteObject _nm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 891;BA.debugLine="Sub MapKeysLowerCaseSingle(m As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 892;BA.debugLine="Dim nm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nm = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nm", _nm);Debug.locals.put("nm", _nm);
 BA.debugLineNum = 893;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _m.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 894;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 895;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 896;BA.debugLine="nm.Put(k, v)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 898;BA.debugLine="Return nm";
Debug.JustUpdateDeviceLine();
if (true) return _nm;
 BA.debugLineNum = 899;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapvalues2list(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("MapValues2List (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,405);
if (RapidSub.canDelegate("mapvalues2list")) { return __ref.runUserSub(false, "bananovue","mapvalues2list", __ref, _m);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 405;BA.debugLine="Sub MapValues2List(m As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 406;BA.debugLine="Dim lst As List";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 407;BA.debugLine="lst.Initialize";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 408;BA.debugLine="For Each k As String In m.values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _m.runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 409;BA.debugLine="lst.Add(k)";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Add",(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 411;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapvalues2lowercase(RemoteObject __ref,RemoteObject _m,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("MapValues2LowerCase (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,738);
if (RapidSub.canDelegate("mapvalues2lowercase")) { return __ref.runUserSub(false, "bananovue","mapvalues2lowercase", __ref, _m, _props);}
RemoteObject _prop = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
Debug.locals.put("props", _props);
 BA.debugLineNum = 738;BA.debugLine="Sub MapValues2LowerCase(m As Map, props As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 739;BA.debugLine="For Each prop As String In props";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _props;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_prop = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("prop", _prop);
Debug.locals.put("prop", _prop);
 BA.debugLineNum = 740;BA.debugLine="If m.ContainsKey(prop) Then";
Debug.JustUpdateDeviceLine();
if (_m.runMethod(true,"ContainsKey",(Object)((_prop))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 741;BA.debugLine="Dim v As String = m.GetDefault(prop,\"\")";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)((_prop)),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 742;BA.debugLine="v = v.tolowercase";
Debug.JustUpdateDeviceLine();
_v = _v.runMethod(true,"toLowerCase");Debug.locals.put("v", _v);
 BA.debugLineNum = 743;BA.debugLine="m.Put(prop,v)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_prop)),(Object)((_v)));
 };
 }
}Debug.locals.put("prop", _prop);
;
 BA.debugLineNum = 746;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _md5hash(RemoteObject __ref,RemoteObject _value,RemoteObject _key,RemoteObject _raw) throws Exception{
try {
		Debug.PushSubsStack("Md5Hash (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,998);
if (RapidSub.canDelegate("md5hash")) { return __ref.runUserSub(false, "bananovue","md5hash", __ref, _value, _key, _raw);}
RemoteObject _res = RemoteObject.declareNull("Object");
Debug.locals.put("value", _value);
Debug.locals.put("key", _key);
Debug.locals.put("raw", _raw);
 BA.debugLineNum = 998;BA.debugLine="Sub Md5Hash(value As String, key As String, raw As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 999;BA.debugLine="Dim res As Object = BANAno.RunJavascriptMethod(\"m";
Debug.JustUpdateDeviceLine();
_res = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunJavascriptMethod",(Object)(BA.ObjectToString("md5")),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_value),(_key),(_raw)})))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1000;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_res);
 BA.debugLineNum = 1001;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mergemaps(RemoteObject __ref,RemoteObject _oldm,RemoteObject _newm) throws Exception{
try {
		Debug.PushSubsStack("MergeMaps (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1050);
if (RapidSub.canDelegate("mergemaps")) { return __ref.runUserSub(false, "bananovue","mergemaps", __ref, _oldm, _newm);}
RemoteObject _om = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("oldm", _oldm);
Debug.locals.put("newm", _newm);
 BA.debugLineNum = 1050;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1051;BA.debugLine="Dim om As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_om = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_om = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("om", _om);Debug.locals.put("om", _om);
 BA.debugLineNum = 1052;BA.debugLine="For Each k As String In oldm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _oldm.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1053;BA.debugLine="Dim v As Object = oldm.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _oldm.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1054;BA.debugLine="om.Put(k, v)";
Debug.JustUpdateDeviceLine();
_om.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1057;BA.debugLine="For Each k As String In newm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _newm.runMethod(false,"Keys");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1058;BA.debugLine="Dim v As Object = newm.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _newm.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1059;BA.debugLine="om.Put(k, v)";
Debug.JustUpdateDeviceLine();
_om.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1061;BA.debugLine="Return om";
Debug.JustUpdateDeviceLine();
if (true) return _om;
 BA.debugLineNum = 1062;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _midstring(RemoteObject __ref,RemoteObject _text,RemoteObject _start,RemoteObject _llength) throws Exception{
try {
		Debug.PushSubsStack("MidString (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,796);
if (RapidSub.canDelegate("midstring")) { return __ref.runUserSub(false, "bananovue","midstring", __ref, _text, _start, _llength);}
Debug.locals.put("Text", _text);
Debug.locals.put("Start", _start);
Debug.locals.put("lLength", _llength);
 BA.debugLineNum = 796;BA.debugLine="Sub MidString(Text As String, Start As Int, lLengt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 797;BA.debugLine="Return Text.SubString2(Start-1,Start+lLength-1)";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_start,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_start,_llength,RemoteObject.createImmutable(1)}, "+-",2, 1)));
 BA.debugLineNum = 798;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _midstring2(RemoteObject __ref,RemoteObject _text,RemoteObject _start) throws Exception{
try {
		Debug.PushSubsStack("MidString2 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,800);
if (RapidSub.canDelegate("midstring2")) { return __ref.runUserSub(false, "bananovue","midstring2", __ref, _text, _start);}
Debug.locals.put("Text", _text);
Debug.locals.put("Start", _start);
 BA.debugLineNum = 800;BA.debugLine="Sub MidString2(Text As String, Start As Int) As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 801;BA.debugLine="Return Text.SubString(Start-1)";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_start,RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 802;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mvcount(RemoteObject __ref,RemoteObject _strmv,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("MvCount (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1624);
if (RapidSub.canDelegate("mvcount")) { return __ref.runUserSub(false, "bananovue","mvcount", __ref, _strmv, _delimiter);}
RemoteObject _spvalues = null;
Debug.locals.put("strMV", _strmv);
Debug.locals.put("Delimiter", _delimiter);
 BA.debugLineNum = 1624;BA.debugLine="Sub MvCount(strMV As String, Delimiter As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1625;BA.debugLine="Dim spValues() As String = BANAno.Split(Delimiter";
Debug.JustUpdateDeviceLine();
_spvalues = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"Split",(Object)(_delimiter),(Object)(_strmv));Debug.locals.put("spValues", _spvalues);Debug.locals.put("spValues", _spvalues);
 BA.debugLineNum = 1626;BA.debugLine="Return spValues.Length";
Debug.JustUpdateDeviceLine();
if (true) return _spvalues.getField(true,"length");
 BA.debugLineNum = 1627;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mvfield(RemoteObject __ref,RemoteObject _svalue,RemoteObject _iposition,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("MvField (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2027);
if (RapidSub.canDelegate("mvfield")) { return __ref.runUserSub(false, "bananovue","mvfield", __ref, _svalue, _iposition, _delimiter);}
RemoteObject _xpos = RemoteObject.createImmutable(0);
RemoteObject _mvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tvalues = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _startcnt = RemoteObject.createImmutable(0);
Debug.locals.put("sValue", _svalue);
Debug.locals.put("iPosition", _iposition);
Debug.locals.put("Delimiter", _delimiter);
 BA.debugLineNum = 2027;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2028;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 2029;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
Debug.JustUpdateDeviceLine();
_xpos = _svalue.runMethod(true,"indexOf",(Object)(_delimiter));Debug.locals.put("xPos", _xpos);Debug.locals.put("xPos", _xpos);
 BA.debugLineNum = 2030;BA.debugLine="If xPos = -1 Then Return sValue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_xpos,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return _svalue;};
 BA.debugLineNum = 2031;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
Debug.JustUpdateDeviceLine();
_mvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_mvalues = __ref.runClassMethod (b4j.example.bananovue.class, "_strparse" /*RemoteObject*/ ,(Object)(_delimiter),(Object)(_svalue));Debug.locals.put("mValues", _mvalues);Debug.locals.put("mValues", _mvalues);
 BA.debugLineNum = 2032;BA.debugLine="Dim tValues As Int";
Debug.JustUpdateDeviceLine();
_tvalues = RemoteObject.createImmutable(0);Debug.locals.put("tValues", _tvalues);
 BA.debugLineNum = 2033;BA.debugLine="tValues = mValues.size -1";
Debug.JustUpdateDeviceLine();
_tvalues = RemoteObject.solve(new RemoteObject[] {_mvalues.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("tValues", _tvalues);
 BA.debugLineNum = 2034;BA.debugLine="Select Case iPosition";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_iposition,BA.numberCast(int.class, -(double) (0 + 1)),BA.numberCast(int.class, -(double) (0 + 2)),BA.numberCast(int.class, -(double) (0 + 3)))) {
case 0: {
 BA.debugLineNum = 2036;BA.debugLine="Return mValues.get(tValues)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_tvalues)));
 break; }
case 1: {
 BA.debugLineNum = 2038;BA.debugLine="Return mValues.get(tValues - 1)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_tvalues,RemoteObject.createImmutable(1)}, "-",1, 1))));
 break; }
case 2: {
 BA.debugLineNum = 2040;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2041;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2042;BA.debugLine="Dim startcnt As Int";
Debug.JustUpdateDeviceLine();
_startcnt = RemoteObject.createImmutable(0);Debug.locals.put("startcnt", _startcnt);
 BA.debugLineNum = 2043;BA.debugLine="sb.Append(mValues.Get(1))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 2044;BA.debugLine="For startcnt = 2 To tValues";
Debug.JustUpdateDeviceLine();
{
final int step17 = 1;
final int limit17 = _tvalues.<Integer>get().intValue();
_startcnt = BA.numberCast(int.class, 2) ;
for (;(step17 > 0 && _startcnt.<Integer>get().intValue() <= limit17) || (step17 < 0 && _startcnt.<Integer>get().intValue() >= limit17) ;_startcnt = RemoteObject.createImmutable((int)(0 + _startcnt.<Integer>get().intValue() + step17))  ) {
Debug.locals.put("startcnt", _startcnt);
 BA.debugLineNum = 2045;BA.debugLine="sb.Append(Delimiter)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_delimiter));
 BA.debugLineNum = 2046;BA.debugLine="sb.Append(mValues.get(startcnt))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_startcnt)))));
 }
}Debug.locals.put("startcnt", _startcnt);
;
 BA.debugLineNum = 2048;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 break; }
default: {
 BA.debugLineNum = 2050;BA.debugLine="iPosition = iPosition - 1";
Debug.JustUpdateDeviceLine();
_iposition = RemoteObject.solve(new RemoteObject[] {_iposition,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iPosition", _iposition);
 BA.debugLineNum = 2051;BA.debugLine="If iPosition <= -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_iposition,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 2052;BA.debugLine="Return mValues.get(tValues)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_tvalues)));
 };
 BA.debugLineNum = 2054;BA.debugLine="If iPosition > tValues Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_iposition,BA.numberCast(double.class, _tvalues))) { 
 BA.debugLineNum = 2055;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 2057;BA.debugLine="Return mValues.get(iPosition)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_mvalues.runMethod(false,"Get",(Object)(_iposition)));
 break; }
}
;
 BA.debugLineNum = 2059;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newdate(RemoteObject __ref,RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("NewDate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,679);
if (RapidSub.canDelegate("newdate")) { return __ref.runUserSub(false, "bananovue","newdate", __ref, _year, _month, _day);}
RemoteObject _dd = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
 BA.debugLineNum = 679;BA.debugLine="Sub NewDate(year As Int, month As Int, day As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 680;BA.debugLine="Dim dd As BANanoObject";
Debug.JustUpdateDeviceLine();
_dd = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 681;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day))";
Debug.JustUpdateDeviceLine();
_dd.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Date")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_year),(_month),(_day)}))));
 BA.debugLineNum = 682;BA.debugLine="Return dd";
Debug.JustUpdateDeviceLine();
if (true) return _dd;
 BA.debugLineNum = 683;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newdatetime(RemoteObject __ref,RemoteObject _year,RemoteObject _month,RemoteObject _day,RemoteObject _hour,RemoteObject _minute) throws Exception{
try {
		Debug.PushSubsStack("NewDateTime (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,685);
if (RapidSub.canDelegate("newdatetime")) { return __ref.runUserSub(false, "bananovue","newdatetime", __ref, _year, _month, _day, _hour, _minute);}
RemoteObject _dd = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("year", _year);
Debug.locals.put("month", _month);
Debug.locals.put("day", _day);
Debug.locals.put("hour", _hour);
Debug.locals.put("minute", _minute);
 BA.debugLineNum = 685;BA.debugLine="Sub NewDateTime(year As Int, month As Int, day As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 686;BA.debugLine="Dim dd As BANanoObject";
Debug.JustUpdateDeviceLine();
_dd = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 687;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day, ho";
Debug.JustUpdateDeviceLine();
_dd.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Date")),(Object)((RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_year),(_month),(_day),(_hour),(_minute)}))));
 BA.debugLineNum = 688;BA.debugLine="Return dd";
Debug.JustUpdateDeviceLine();
if (true) return _dd;
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
public static RemoteObject  _numbersuffix(RemoteObject __ref,RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("NumberSuffix (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,748);
if (RapidSub.canDelegate("numbersuffix")) { return __ref.runUserSub(false, "bananovue","numbersuffix", __ref, _n);}
RemoteObject _suffix = null;
RemoteObject _thousands = RemoteObject.createImmutable(0);
RemoteObject _maxdecimalplaces = RemoteObject.createImmutable(0);
RemoteObject _relativeerror = RemoteObject.createImmutable(0);
Debug.locals.put("N", _n);
 BA.debugLineNum = 748;BA.debugLine="Sub NumberSuffix(N As Double) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 749;BA.debugLine="If N < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_n,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 750;BA.debugLine="Return \"-\" & NumberSuffix(-N)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("-"),__ref.runClassMethod (b4j.example.bananovue.class, "_numbersuffix" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, -_n.<Double>get().doubleValue()))));
 };
 BA.debugLineNum = 752;BA.debugLine="Dim Suffix() As String = Array As String(\"\", \"k\",";
Debug.JustUpdateDeviceLine();
_suffix = RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString(""),BA.ObjectToString("k"),BA.ObjectToString("M"),BA.ObjectToString("B"),RemoteObject.createImmutable("T")});Debug.locals.put("Suffix", _suffix);Debug.locals.put("Suffix", _suffix);
 BA.debugLineNum = 753;BA.debugLine="Dim Thousands As Int = 0";
Debug.JustUpdateDeviceLine();
_thousands = BA.numberCast(int.class, 0);Debug.locals.put("Thousands", _thousands);Debug.locals.put("Thousands", _thousands);
 BA.debugLineNum = 754;BA.debugLine="Do While N >= 1000 And Thousands < Suffix.Length";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("g",_n,BA.numberCast(double.class, 1000)) && RemoteObject.solveBoolean("<",_thousands,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_suffix.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)))) {
 BA.debugLineNum = 755;BA.debugLine="Thousands = Thousands + 1";
Debug.JustUpdateDeviceLine();
_thousands = RemoteObject.solve(new RemoteObject[] {_thousands,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Thousands", _thousands);
 BA.debugLineNum = 756;BA.debugLine="N = N / 1000";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1000)}, "/",0, 0);Debug.locals.put("N", _n);
 }
;
 BA.debugLineNum = 758;BA.debugLine="If Thousands = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_thousands,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 759;BA.debugLine="Return NumberFormat2(N, 1, 2, 2, False)";
Debug.JustUpdateDeviceLine();
if (true) return bananovue.__c.runMethod(true,"NumberFormat2",(Object)(_n),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(bananovue.__c.getField(true,"False")));
 };
 BA.debugLineNum = 762;BA.debugLine="Dim MaxDecimalPlaces As Int = 0";
Debug.JustUpdateDeviceLine();
_maxdecimalplaces = BA.numberCast(int.class, 0);Debug.locals.put("MaxDecimalPlaces", _maxdecimalplaces);Debug.locals.put("MaxDecimalPlaces", _maxdecimalplaces);
 BA.debugLineNum = 763;BA.debugLine="Do While MaxDecimalPlaces < 5";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",_maxdecimalplaces,BA.numberCast(double.class, 5))) {
 BA.debugLineNum = 764;BA.debugLine="Dim RelativeError As Double = Abs(N - Round2(N,";
Debug.JustUpdateDeviceLine();
_relativeerror = RemoteObject.solve(new RemoteObject[] {bananovue.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_n,bananovue.__c.runMethod(true,"Round2",(Object)(_n),(Object)(_maxdecimalplaces))}, "-",1, 0))),_n}, "/",0, 0);Debug.locals.put("RelativeError", _relativeerror);Debug.locals.put("RelativeError", _relativeerror);
 BA.debugLineNum = 765;BA.debugLine="If RelativeError < 0.007 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_relativeerror,BA.numberCast(double.class, 0.007))) { 
 BA.debugLineNum = 766;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 BA.debugLineNum = 768;BA.debugLine="MaxDecimalPlaces = MaxDecimalPlaces + 1";
Debug.JustUpdateDeviceLine();
_maxdecimalplaces = RemoteObject.solve(new RemoteObject[] {_maxdecimalplaces,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("MaxDecimalPlaces", _maxdecimalplaces);
 }
;
 BA.debugLineNum = 770;BA.debugLine="Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, F";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(bananovue.__c.runMethod(true,"NumberFormat2",(Object)(_n),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(_maxdecimalplaces),(Object)(bananovue.__c.getField(true,"False"))),_suffix.getArrayElement(true,_thousands));
 BA.debugLineNum = 771;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pad(RemoteObject __ref,RemoteObject _value,RemoteObject _maxlen,RemoteObject _padchar,RemoteObject _right) throws Exception{
try {
		Debug.PushSubsStack("Pad (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,691);
if (RapidSub.canDelegate("pad")) { return __ref.runUserSub(false, "bananovue","pad", __ref, _value, _maxlen, _padchar, _right);}
RemoteObject _intordnolen = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Value", _value);
Debug.locals.put("MaxLen", _maxlen);
Debug.locals.put("PadChar", _padchar);
Debug.locals.put("right", _right);
 BA.debugLineNum = 691;BA.debugLine="Sub Pad(Value As String, MaxLen As Int, PadChar As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 692;BA.debugLine="Dim  intOrdNoLen As Int = Value.Length";
Debug.JustUpdateDeviceLine();
_intordnolen = _value.runMethod(true,"length");Debug.locals.put("intOrdNoLen", _intordnolen);Debug.locals.put("intOrdNoLen", _intordnolen);
 BA.debugLineNum = 693;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 694;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = (RemoteObject.solve(new RemoteObject[] {_maxlen,_intordnolen}, "-",1, 1)).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step3 > 0 && _i.<Integer>get().intValue() <= limit3) || (step3 < 0 && _i.<Integer>get().intValue() >= limit3) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 695;BA.debugLine="If right Then";
Debug.JustUpdateDeviceLine();
if (_right.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 696;BA.debugLine="Value =  Value & PadChar";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.concat(_value,_padchar);Debug.locals.put("Value", _value);
 }else {
 BA.debugLineNum = 698;BA.debugLine="Value = PadChar & Value";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.concat(_padchar,_value);Debug.locals.put("Value", _value);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 701;BA.debugLine="Return Value";
Debug.JustUpdateDeviceLine();
if (true) return _value;
 BA.debugLineNum = 702;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _padright(RemoteObject __ref,RemoteObject _value,RemoteObject _maxlen,RemoteObject _padchar) throws Exception{
try {
		Debug.PushSubsStack("PadRight (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("padright")) { return __ref.runUserSub(false, "bananovue","padright", __ref, _value, _maxlen, _padchar);}
RemoteObject _intordnolen = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Value", _value);
Debug.locals.put("MaxLen", _maxlen);
Debug.locals.put("PadChar", _padchar);
 BA.debugLineNum = 533;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 534;BA.debugLine="Value = CStr(Value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_value)));Debug.locals.put("Value", _value);
 BA.debugLineNum = 535;BA.debugLine="Dim intOrdNoLen As Int = Len(Value)";
Debug.JustUpdateDeviceLine();
_intordnolen = __ref.runClassMethod (b4j.example.bananovue.class, "_len" /*RemoteObject*/ ,(Object)(_value));Debug.locals.put("intOrdNoLen", _intordnolen);Debug.locals.put("intOrdNoLen", _intordnolen);
 BA.debugLineNum = 536;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 537;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = (RemoteObject.solve(new RemoteObject[] {_maxlen,_intordnolen}, "-",1, 1)).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step4 > 0 && _i.<Integer>get().intValue() <= limit4) || (step4 < 0 && _i.<Integer>get().intValue() >= limit4) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 538;BA.debugLine="Value = PadChar & Value";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.concat(_padchar,_value);Debug.locals.put("Value", _value);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 540;BA.debugLine="Return Value";
Debug.JustUpdateDeviceLine();
if (true) return _value;
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _percentage(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("Percentage (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,784);
if (RapidSub.canDelegate("percentage")) { return __ref.runUserSub(false, "bananovue","percentage", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 784;BA.debugLine="Sub Percentage(sValue As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 785;BA.debugLine="If sValue = \"\" Then sValue = \"0.00\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue,BA.ObjectToString(""))) { 
_svalue = BA.ObjectToString("0.00");Debug.locals.put("sValue", _svalue);};
 BA.debugLineNum = 786;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("0.00");};
 BA.debugLineNum = 787;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue,BA.ObjectToString("null"))) { 
_svalue = BA.ObjectToString("0.00");Debug.locals.put("sValue", _svalue);};
 BA.debugLineNum = 788;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 789;BA.debugLine="sValue = Val(sValue)";
Debug.JustUpdateDeviceLine();
_svalue = __ref.runClassMethod (b4j.example.bananovue.class, "_val" /*RemoteObject*/ ,(Object)(_svalue));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 790;BA.debugLine="If sValue = \"0\" Then sValue = \"0.00\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue,BA.ObjectToString("0"))) { 
_svalue = BA.ObjectToString("0.00");Debug.locals.put("sValue", _svalue);};
 BA.debugLineNum = 791;BA.debugLine="sValue = Round2(sValue,2)";
Debug.JustUpdateDeviceLine();
_svalue = BA.NumberToString(bananovue.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _svalue)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 792;BA.debugLine="sValue = sValue & \"%\"";
Debug.JustUpdateDeviceLine();
_svalue = RemoteObject.concat(_svalue,RemoteObject.createImmutable("%"));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 793;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 BA.debugLineNum = 794;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _priorityrag(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("PriorityRAG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2567);
if (RapidSub.canDelegate("priorityrag")) { return __ref.runUserSub(false, "bananovue","priorityrag", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2567;BA.debugLine="Public Sub PriorityRAG(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2568;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 2570;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 break; }
case 1: {
 BA.debugLineNum = 2572;BA.debugLine="Return \"./assets/orange.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/orange.png");
 break; }
case 2: {
 BA.debugLineNum = 2574;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 break; }
default: {
 BA.debugLineNum = 2576;BA.debugLine="Return \"./assets/gray.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/gray.png");
 break; }
}
;
 BA.debugLineNum = 2578;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _progressrag(RemoteObject __ref,RemoteObject _dvariance) throws Exception{
try {
		Debug.PushSubsStack("ProgressRAG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2530);
if (RapidSub.canDelegate("progressrag")) { return __ref.runUserSub(false, "bananovue","progressrag", __ref, _dvariance);}
Debug.locals.put("dVariance", _dvariance);
 BA.debugLineNum = 2530;BA.debugLine="Public Sub ProgressRAG(dVariance As Double) As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2531;BA.debugLine="If dVariance < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_dvariance,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2532;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 }else 
{ BA.debugLineNum = 2533;BA.debugLine="else if dVariance > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_dvariance,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2534;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 }else 
{ BA.debugLineNum = 2535;BA.debugLine="else if dVariance = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dvariance,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2536;BA.debugLine="Return \"./assets/orange.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/orange.png");
 }else {
 BA.debugLineNum = 2538;BA.debugLine="Return \"./assets/gray.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/gray.png");
 }}}
;
 BA.debugLineNum = 2540;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _progressstatus(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("ProgressStatus (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2663);
if (RapidSub.canDelegate("progressstatus")) { return __ref.runUserSub(false, "bananovue","progressstatus", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2663;BA.debugLine="Public Sub ProgressStatus(dValue As Int) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2664;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 100))) {
case 0: {
 BA.debugLineNum = 2666;BA.debugLine="Return 1";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, 1);
 break; }
default: {
 BA.debugLineNum = 2668;BA.debugLine="Return 0";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, 0);
 break; }
}
;
 BA.debugLineNum = 2670;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _projectdate(RemoteObject __ref,RemoteObject _sdate) throws Exception{
try {
		Debug.PushSubsStack("ProjectDate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,492);
if (RapidSub.canDelegate("projectdate")) { return __ref.runUserSub(false, "bananovue","projectdate", __ref, _sdate);}
RemoteObject _dt = RemoteObject.createImmutable(0L);
Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 492;BA.debugLine="Sub ProjectDate(sDate As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 493;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sdate.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 494;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 495;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 496;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
Debug.JustUpdateDeviceLine();
_dt = bananovue.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_sdate));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 497;BA.debugLine="DateTime.DateFormat = \"dd-MMM-yyyy, EEE\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MMM-yyyy, EEE"));
 BA.debugLineNum = 498;BA.debugLine="Return DateTime.Date(dt)";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_dt));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 500;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
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
public static RemoteObject  _projectdays(RemoteObject __ref,RemoteObject _sdays) throws Exception{
try {
		Debug.PushSubsStack("ProjectDays (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,480);
if (RapidSub.canDelegate("projectdays")) { return __ref.runUserSub(false, "bananovue","projectdays", __ref, _sdays);}
Debug.locals.put("sDays", _sdays);
 BA.debugLineNum = 480;BA.debugLine="Sub ProjectDays(sDays As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 481;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 482;BA.debugLine="sDays = sDays.trim";
Debug.JustUpdateDeviceLine();
_sdays = _sdays.runMethod(true,"trim");Debug.locals.put("sDays", _sdays);
 BA.debugLineNum = 483;BA.debugLine="If sDays = \"\" Then sDays = \"0\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sdays,BA.ObjectToString(""))) { 
_sdays = BA.ObjectToString("0");Debug.locals.put("sDays", _sdays);};
 BA.debugLineNum = 484;BA.debugLine="sDays = sDays.Replace(\",\",\"\")";
Debug.JustUpdateDeviceLine();
_sdays = _sdays.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sDays", _sdays);
 BA.debugLineNum = 485;BA.debugLine="sDays = NumberFormat2(sDays,0,0,0,True)";
Debug.JustUpdateDeviceLine();
_sdays = bananovue.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _sdays)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(bananovue.__c.getField(true,"True")));Debug.locals.put("sDays", _sdays);
 BA.debugLineNum = 486;BA.debugLine="Return sDays & \" Dys\"";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(_sdays,RemoteObject.createImmutable(" Dys"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 488;BA.debugLine="Return \"0 Dys\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("0 Dys");
 };
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _propercase(RemoteObject __ref,RemoteObject _mystr) throws Exception{
try {
		Debug.PushSubsStack("ProperCase (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,862);
if (RapidSub.canDelegate("propercase")) { return __ref.runUserSub(false, "bananovue","propercase", __ref, _mystr);}
RemoteObject _x = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _k = RemoteObject.createImmutable(0);
Debug.locals.put("myStr", _mystr);
 BA.debugLineNum = 862;BA.debugLine="Sub ProperCase(myStr As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 863;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 864;BA.debugLine="If myStr.trim.length = 0 Then Return \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_mystr.runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 865;BA.debugLine="Dim x As String";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createImmutable("");Debug.locals.put("x", _x);
 BA.debugLineNum = 866;BA.debugLine="Dim j, k As Int";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
_k = RemoteObject.createImmutable(0);Debug.locals.put("k", _k);
 BA.debugLineNum = 867;BA.debugLine="myStr = myStr.tolowercase";
Debug.JustUpdateDeviceLine();
_mystr = _mystr.runMethod(true,"toLowerCase");Debug.locals.put("myStr", _mystr);
 BA.debugLineNum = 868;BA.debugLine="x = myStr.ToUpperCase.CharAt(0)";
Debug.JustUpdateDeviceLine();
_x = BA.ObjectToString(_mystr.runMethod(true,"toUpperCase").runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("x", _x);
 BA.debugLineNum = 869;BA.debugLine="myStr = x & myStr.SubString2(1, myStr.Length)";
Debug.JustUpdateDeviceLine();
_mystr = RemoteObject.concat(_x,_mystr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(_mystr.runMethod(true,"length"))));Debug.locals.put("myStr", _mystr);
 BA.debugLineNum = 870;BA.debugLine="For j = 1 To myStr.Length";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = _mystr.runMethod(true,"length").<Integer>get().intValue();
_j = BA.numberCast(int.class, 1) ;
for (;(step8 > 0 && _j.<Integer>get().intValue() <= limit8) || (step8 < 0 && _j.<Integer>get().intValue() >= limit8) ;_j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 871;BA.debugLine="k = myStr.IndexOf2(\" \", j + 1)";
Debug.JustUpdateDeviceLine();
_k = _mystr.runMethod(true,"indexOf",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.solve(new RemoteObject[] {_j,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("k", _k);
 BA.debugLineNum = 872;BA.debugLine="If k = -1 Then Exit";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_k,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) break;};
 BA.debugLineNum = 873;BA.debugLine="x = myStr.ToUpperCase.CharAt(k + 1)";
Debug.JustUpdateDeviceLine();
_x = BA.ObjectToString(_mystr.runMethod(true,"toUpperCase").runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {_k,RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("x", _x);
 BA.debugLineNum = 874;BA.debugLine="myStr = myStr.SubString2(0, k + 1) & x & myStr.";
Debug.JustUpdateDeviceLine();
_mystr = RemoteObject.concat(_mystr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_k,RemoteObject.createImmutable(1)}, "+",1, 1))),_x,_mystr.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_k,RemoteObject.createImmutable(2)}, "+",1, 1)),(Object)(_mystr.runMethod(true,"length"))));Debug.locals.put("myStr", _mystr);
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 876;BA.debugLine="Return myStr";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _mystr;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 878;BA.debugLine="Return myStr";
Debug.JustUpdateDeviceLine();
if (true) return _mystr;
 };
 BA.debugLineNum = 880;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rag(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("RAG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2580);
if (RapidSub.canDelegate("rag")) { return __ref.runUserSub(false, "bananovue","rag", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2580;BA.debugLine="Public Sub RAG(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2581;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 2583;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 break; }
case 1: {
 BA.debugLineNum = 2585;BA.debugLine="Return \"./assets/orange.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/orange.png");
 break; }
case 2: {
 BA.debugLineNum = 2587;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 break; }
default: {
 BA.debugLineNum = 2589;BA.debugLine="Return \"./assets/gray.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/gray.png");
 break; }
}
;
 BA.debugLineNum = 2591;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("RamoveFromList (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2069);
if (RapidSub.canDelegate("ramovefromlist")) { return __ref.runUserSub(false, "bananovue","ramovefromlist", __ref, _listx, _item);}
RemoteObject _li = RemoteObject.createImmutable(0);
Debug.locals.put("listX", _listx);
Debug.locals.put("item", _item);
 BA.debugLineNum = 2069;BA.debugLine="Sub RamoveFromList(listX As List, item As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2070;BA.debugLine="Dim li As Int = listX.IndexOf(item)";
Debug.JustUpdateDeviceLine();
_li = _listx.runMethod(true,"IndexOf",(Object)((_item)));Debug.locals.put("li", _li);Debug.locals.put("li", _li);
 BA.debugLineNum = 2071;BA.debugLine="If li >= 0 Then listX.RemoveAt(li)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_li,BA.numberCast(double.class, 0))) { 
_listx.runVoidMethod ("RemoveAt",(Object)(_li));};
 BA.debugLineNum = 2072;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("RandListValue (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2063);
if (RapidSub.canDelegate("randlistvalue")) { return __ref.runUserSub(false, "bananovue","randlistvalue", __ref, _listx);}
Debug.locals.put("ListX", _listx);
 BA.debugLineNum = 2063;BA.debugLine="Sub RandListValue(ListX As List) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2064;BA.debugLine="ShuffleList(ListX)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_shufflelist" /*RemoteObject*/ ,(Object)(_listx));
 BA.debugLineNum = 2065;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
Debug.JustUpdateDeviceLine();
if (true) return _listx.runMethod(false,"Get",(Object)(bananovue.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_listx.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 2066;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replacestring(RemoteObject __ref,RemoteObject _text,RemoteObject _sfind,RemoteObject _sreplacewith) throws Exception{
try {
		Debug.PushSubsStack("ReplaceString (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,814);
if (RapidSub.canDelegate("replacestring")) { return __ref.runUserSub(false, "bananovue","replacestring", __ref, _text, _sfind, _sreplacewith);}
Debug.locals.put("Text", _text);
Debug.locals.put("sFind", _sfind);
Debug.locals.put("sReplaceWith", _sreplacewith);
 BA.debugLineNum = 814;BA.debugLine="Sub ReplaceString(Text As String, sFind As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 815;BA.debugLine="Return Text.Replace(sFind, sReplaceWith)";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"replace",(Object)(_sfind),(Object)(_sreplacewith));
 BA.debugLineNum = 816;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rightstring(RemoteObject __ref,RemoteObject _text,RemoteObject _llength) throws Exception{
try {
		Debug.PushSubsStack("RightString (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,804);
if (RapidSub.canDelegate("rightstring")) { return __ref.runUserSub(false, "bananovue","rightstring", __ref, _text, _llength);}
Debug.locals.put("Text", _text);
Debug.locals.put("lLength", _llength);
 BA.debugLineNum = 804;BA.debugLine="Sub RightString(Text As String, lLength As Long) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 805;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_llength,BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
_llength = BA.numberCast(long.class, _text.runMethod(true,"length"));Debug.locals.put("lLength", _llength);};
 BA.debugLineNum = 806;BA.debugLine="Return Text.SubString(Text.Length-lLength)";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),_llength}, "-",1, 2))));
 BA.debugLineNum = 807;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rsaidnumber2dateofbirth(RemoteObject __ref,RemoteObject _rsaid) throws Exception{
try {
		Debug.PushSubsStack("RSAIDNumber2DateOfBirth (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("rsaidnumber2dateofbirth")) { return __ref.runUserSub(false, "bananovue","rsaidnumber2dateofbirth", __ref, _rsaid);}
RemoteObject _yymmdd = RemoteObject.createImmutable("");
RemoteObject _yy = RemoteObject.createImmutable("");
RemoteObject _mm = RemoteObject.createImmutable("");
RemoteObject _dd = RemoteObject.createImmutable("");
Debug.locals.put("rsaID", _rsaid);
 BA.debugLineNum = 416;BA.debugLine="Sub RSAIDNumber2DateOfBirth(rsaID As String) As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 418;BA.debugLine="If rsaID.length = 13 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_rsaid.runMethod(true,"length"),BA.numberCast(double.class, 13))) { 
 BA.debugLineNum = 419;BA.debugLine="Dim yymmdd As String = LeftString(rsaID, 6)";
Debug.JustUpdateDeviceLine();
_yymmdd = __ref.runClassMethod (b4j.example.bananovue.class, "_leftstring" /*RemoteObject*/ ,(Object)(_rsaid),(Object)(BA.numberCast(long.class, 6)));Debug.locals.put("yymmdd", _yymmdd);Debug.locals.put("yymmdd", _yymmdd);
 BA.debugLineNum = 420;BA.debugLine="Dim yy As String = LeftString(yymmdd,2)";
Debug.JustUpdateDeviceLine();
_yy = __ref.runClassMethod (b4j.example.bananovue.class, "_leftstring" /*RemoteObject*/ ,(Object)(_yymmdd),(Object)(BA.numberCast(long.class, 2)));Debug.locals.put("yy", _yy);Debug.locals.put("yy", _yy);
 BA.debugLineNum = 421;BA.debugLine="Dim mm As String = MidString(yymmdd,3,2)";
Debug.JustUpdateDeviceLine();
_mm = __ref.runClassMethod (b4j.example.bananovue.class, "_midstring" /*RemoteObject*/ ,(Object)(_yymmdd),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("mm", _mm);Debug.locals.put("mm", _mm);
 BA.debugLineNum = 422;BA.debugLine="Dim dd As String = RightString(yymmdd,2)";
Debug.JustUpdateDeviceLine();
_dd = __ref.runClassMethod (b4j.example.bananovue.class, "_rightstring" /*RemoteObject*/ ,(Object)(_yymmdd),(Object)(BA.numberCast(long.class, 2)));Debug.locals.put("dd", _dd);Debug.locals.put("dd", _dd);
 BA.debugLineNum = 423;BA.debugLine="yymmdd = $\"19${yy}-${mm}-${dd}\"$";
Debug.JustUpdateDeviceLine();
_yymmdd = (RemoteObject.concat(RemoteObject.createImmutable("19"),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_yy))),RemoteObject.createImmutable("-"),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mm))),RemoteObject.createImmutable("-"),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dd))),RemoteObject.createImmutable("")));Debug.locals.put("yymmdd", _yymmdd);
 BA.debugLineNum = 424;BA.debugLine="Return yymmdd";
Debug.JustUpdateDeviceLine();
if (true) return _yymmdd;
 }else {
 BA.debugLineNum = 426;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _runmethod(RemoteObject __ref,RemoteObject _methodname,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("RunMethod (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1948);
if (RapidSub.canDelegate("runmethod")) { return __ref.runUserSub(false, "bananovue","runmethod", __ref, _methodname, _params);}
Debug.locals.put("methodName", _methodname);
Debug.locals.put("params", _params);
 BA.debugLineNum = 1948;BA.debugLine="Sub RunMethod(methodName As String, params As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1949;BA.debugLine="Return BOVue.RunMethod(methodName, params)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(_methodname),(Object)(_params));
 BA.debugLineNum = 1950;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savetext2file(RemoteObject __ref,RemoteObject _content,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SaveText2File (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1614);
if (RapidSub.canDelegate("savetext2file")) { return __ref.runUserSub(false, "bananovue","savetext2file", __ref, _content, _filename);}
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _blob = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("content", _content);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1614;BA.debugLine="Sub SaveText2File(content As String, fileName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1615;BA.debugLine="Dim fc As List";
Debug.JustUpdateDeviceLine();
_fc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 1616;BA.debugLine="fc.Initialize";
Debug.JustUpdateDeviceLine();
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 1617;BA.debugLine="fc.Add(content)";
Debug.JustUpdateDeviceLine();
_fc.runVoidMethod ("Add",(Object)((_content)));
 BA.debugLineNum = 1618;BA.debugLine="Dim blob As BANanoObject";
Debug.JustUpdateDeviceLine();
_blob = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("blob", _blob);
 BA.debugLineNum = 1619;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
Debug.JustUpdateDeviceLine();
_blob.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Blob")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fc.getObject()),(bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(RemoteObject.createImmutable("text/plain;charset=utf-8"))})).getObject())}))));
 BA.debugLineNum = 1620;BA.debugLine="BANAno.RunJavascriptMethod(\"saveAs\",Array(blob,fi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunJavascriptMethod",(Object)(BA.ObjectToString("saveAs")),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_blob.getObject()),(_filename)})))));
 BA.debugLineNum = 1621;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivated(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetActivated (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2216);
if (RapidSub.canDelegate("setactivated")) { return __ref.runUserSub(false, "bananovue","setactivated", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2216;BA.debugLine="Sub SetActivated(module As Object, methodName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2217;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2218;BA.debugLine="activated = BANAno.CallBack(module, methodName, N";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_activated" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2219;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2220;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundimage(RemoteObject __ref,RemoteObject _elid,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundImage (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1112);
if (RapidSub.canDelegate("setbackgroundimage")) { return __ref.runUserSub(false, "bananovue","setbackgroundimage", __ref, _elid, _url);}
Debug.locals.put("elid", _elid);
Debug.locals.put("url", _url);
 BA.debugLineNum = 1112;BA.debugLine="Sub SetBackgroundImage(elid As String, url As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1113;BA.debugLine="BANAno.GetElement(elid).SetStyle(BANAno.ToJson(Cr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(_elid)).runVoidMethod ("SetStyle",(Object)(BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("background-image")),((RemoteObject.concat(RemoteObject.createImmutable("url('"),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_url))),RemoteObject.createImmutable("')")))),RemoteObject.createImmutable(("background-size")),(RemoteObject.createImmutable("100% 100%"))})).getObject()))))));
 BA.debugLineNum = 1114;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforecreate(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeCreate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2261);
if (RapidSub.canDelegate("setbeforecreate")) { return __ref.runUserSub(false, "bananovue","setbeforecreate", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2261;BA.debugLine="Sub SetBeforeCreate(module As Object, methodName A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2262;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2263;BA.debugLine="beforeCreate = BANAno.CallBack(module, methodName";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforecreate" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2264;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2265;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforedestroy(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeDestroy (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2253);
if (RapidSub.canDelegate("setbeforedestroy")) { return __ref.runUserSub(false, "bananovue","setbeforedestroy", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2253;BA.debugLine="Sub SetBeforeDestroy(module As Object, methodName";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2254;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2255;BA.debugLine="beforeDestroy = BANAno.CallBack(module, methodNam";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforedestroy" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2256;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2257;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforemount(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeMount (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2239);
if (RapidSub.canDelegate("setbeforemount")) { return __ref.runUserSub(false, "bananovue","setbeforemount", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2239;BA.debugLine="Sub SetBeforeMount(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2240;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2241;BA.debugLine="beforeMount = BANAno.CallBack(module, methodName,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforemount" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2242;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2243;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforeupdate(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeUpdate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2246);
if (RapidSub.canDelegate("setbeforeupdate")) { return __ref.runUserSub(false, "bananovue","setbeforeupdate", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2246;BA.debugLine="Sub SetBeforeUpdate(module As Object, methodName A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2247;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2248;BA.debugLine="beforeMount = BANAno.CallBack(module, methodName,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforemount" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2249;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2250;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetCallBack (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2286);
if (RapidSub.canDelegate("setcallback")) { return __ref.runUserSub(false, "bananovue","setcallback", __ref, _methodname, _cb);}
Debug.locals.put("methodName", _methodname);
Debug.locals.put("cb", _cb);
 BA.debugLineNum = 2286;BA.debugLine="Sub SetCallBack(methodName As String, cb As BANano";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2287;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2288;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 BA.debugLineNum = 2289;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcloak(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCloak (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1159);
if (RapidSub.canDelegate("setcloak")) { return __ref.runUserSub(false, "bananovue","setcloak", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 1159;BA.debugLine="Sub SetCloak(b As Boolean) As BANanoVue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1160;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,bananovue.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 1161;BA.debugLine="Template.SetAttr(\"v-cloak\",\"true\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-cloak")),(Object)(RemoteObject.createImmutable("true")));
 BA.debugLineNum = 1162;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1163;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcomputed(RemoteObject __ref,RemoteObject _k,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetComputed (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2292);
if (RapidSub.canDelegate("setcomputed")) { return __ref.runUserSub(false, "bananovue","setcomputed", __ref, _k, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("k", _k);
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2292;BA.debugLine="Sub SetComputed(k As String, module As Object, met";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2293;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2294;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (bananovue.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2295;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 2296;BA.debugLine="If data.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2297;BA.debugLine="SetStateSingle(k, Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)(bananovue.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 2299;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 2300;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 2301;BA.debugLine="computed.Put(k, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_computed" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 2303;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcoverimage(RemoteObject __ref,RemoteObject _imgurl) throws Exception{
try {
		Debug.PushSubsStack("SetCoverImage (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2099);
if (RapidSub.canDelegate("setcoverimage")) { return __ref.runUserSub(false, "bananovue","setcoverimage", __ref, _imgurl);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sjson = RemoteObject.createImmutable("");
Debug.locals.put("imgURL", _imgurl);
 BA.debugLineNum = 2099;BA.debugLine="Sub SetCoverImage(imgURL As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2100;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 2101;BA.debugLine="If imgURL = \"none\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_imgurl,BA.ObjectToString("none"))) { 
 BA.debugLineNum = 2102;BA.debugLine="opt.Put(\"background-image\", \"none\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("background-image"))),(Object)((RemoteObject.createImmutable("none"))));
 }else {
 BA.debugLineNum = 2110;BA.debugLine="opt.Put(\"background\", $\"url('${imgURL}')\"$)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("background"))),(Object)(((RemoteObject.concat(RemoteObject.createImmutable("url('"),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgurl))),RemoteObject.createImmutable("')"))))));
 BA.debugLineNum = 2111;BA.debugLine="opt.Put(\"position\", \"absolute\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)((RemoteObject.createImmutable("absolute"))));
 BA.debugLineNum = 2112;BA.debugLine="opt.Put(\"height\", \"100%\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((RemoteObject.createImmutable("100%"))));
 BA.debugLineNum = 2113;BA.debugLine="opt.Put(\"width\", \"100%\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((RemoteObject.createImmutable("100%"))));
 BA.debugLineNum = 2114;BA.debugLine="opt.Put(\"top\", \"0\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("top"))),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 2115;BA.debugLine="opt.Put(\"bottom\", \"0\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bottom"))),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 2116;BA.debugLine="opt.Put(\"right\", \"0\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("right"))),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 2117;BA.debugLine="opt.Put(\"left\", \"0\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("left"))),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 2118;BA.debugLine="opt.Put(\"z-index\", \"0\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("z-index"))),(Object)((RemoteObject.createImmutable("0"))));
 };
 BA.debugLineNum = 2120;BA.debugLine="Dim sjson As String = BANAno.ToJson(opt)";
Debug.JustUpdateDeviceLine();
_sjson = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((_opt.getObject()))));Debug.locals.put("sjson", _sjson);Debug.locals.put("sjson", _sjson);
 BA.debugLineNum = 2121;BA.debugLine="body.SetStyle(sjson)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("SetStyle",(Object)(_sjson));
 BA.debugLineNum = 2122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcreated(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetCreated (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2269);
if (RapidSub.canDelegate("setcreated")) { return __ref.runUserSub(false, "bananovue","setcreated", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2269;BA.debugLine="Sub SetCreated(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2270;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2271;BA.debugLine="created = BANAno.CallBack(module, methodName, Nul";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_created" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2272;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2273;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdeactivated(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetDeActivated (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2224);
if (RapidSub.canDelegate("setdeactivated")) { return __ref.runUserSub(false, "bananovue","setdeactivated", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2224;BA.debugLine="Sub SetDeActivated(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2225;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2226;BA.debugLine="deactivated = BANAno.CallBack(module, methodName,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_deactivated" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
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
public static RemoteObject  _setdestroyed(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetDestroyed (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2208);
if (RapidSub.canDelegate("setdestroyed")) { return __ref.runUserSub(false, "bananovue","setdestroyed", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2208;BA.debugLine="Sub SetDestroyed(module As Object, methodName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2209;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2210;BA.debugLine="destroyed = BANAno.CallBack(module, methodName, N";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_destroyed" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2211;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2212;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabledState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1045);
if (RapidSub.canDelegate("setdisabledstate")) { return __ref.runUserSub(false, "bananovue","setdisabledstate", __ref, _k, _v);}
RemoteObject _diskey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1045;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1046;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("disabled")));Debug.locals.put("disKey", _diskey);Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1047;BA.debugLine="SetStateSingle(disKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_diskey),(Object)((_v)));
 BA.debugLineNum = 1048;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seterrorstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetErrorState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1039);
if (RapidSub.canDelegate("seterrorstate")) { return __ref.runUserSub(false, "bananovue","seterrorstate", __ref, _k, _v);}
RemoteObject _showkey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1039;BA.debugLine="Sub SetErrorState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1040;BA.debugLine="Dim showKey As String = $\"${k}error\"$";
Debug.JustUpdateDeviceLine();
_showkey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("error")));Debug.locals.put("showKey", _showkey);Debug.locals.put("showKey", _showkey);
 BA.debugLineNum = 1041;BA.debugLine="SetStateSingle(showKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_showkey),(Object)((_v)));
 BA.debugLineNum = 1042;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfontfamily(RemoteObject __ref,RemoteObject _ff) throws Exception{
try {
		Debug.PushSubsStack("SetFontFamily (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2094);
if (RapidSub.canDelegate("setfontfamily")) { return __ref.runUserSub(false, "bananovue","setfontfamily", __ref, _ff);}
Debug.locals.put("ff", _ff);
 BA.debugLineNum = 2094;BA.debugLine="Sub SetFontFamily(ff As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2095;BA.debugLine="body.SetStyle(BANAno.ToJson(CreateMap(\"font-famil";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("SetStyle",(Object)(BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("font-family")),_ff})).getObject()))))));
 BA.debugLineNum = 2096;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmethod(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetMethod (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2276);
if (RapidSub.canDelegate("setmethod")) { return __ref.runUserSub(false, "bananovue","setmethod", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2276;BA.debugLine="Sub SetMethod(module As Object, methodName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2277;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2278;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (bananovue.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2279;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 2280;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 2281;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 2283;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2284;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmounted(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetMounted (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2200);
if (RapidSub.canDelegate("setmounted")) { return __ref.runUserSub(false, "bananovue","setmounted", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2200;BA.debugLine="Sub SetMounted(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2201;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2202;BA.debugLine="mounted = BANAno.CallBack(module, methodName, Nul";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mounted" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2203;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnexttick(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetNextTick (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2306);
if (RapidSub.canDelegate("setnexttick")) { return __ref.runUserSub(false, "bananovue","setnexttick", __ref, _module, _methodname);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2306;BA.debugLine="Sub SetNextTick(module As Object, methodName As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2307;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2308;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 2309;BA.debugLine="BOVue.RunMethod(\"nextTick\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("nextTick")),(Object)((_cb.getObject())));
 BA.debugLineNum = 2310;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2311;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoptionbo(RemoteObject __ref,RemoteObject _optionname,RemoteObject _optionobject) throws Exception{
try {
		Debug.PushSubsStack("SetOptionBO (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1629);
if (RapidSub.canDelegate("setoptionbo")) { return __ref.runUserSub(false, "bananovue","setoptionbo", __ref, _optionname, _optionobject);}
Debug.locals.put("optionName", _optionname);
Debug.locals.put("optionObject", _optionobject);
 BA.debugLineNum = 1629;BA.debugLine="Sub SetOptionBO(optionName As String, optionObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1630;BA.debugLine="Options.Put(optionName, optionObject)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_optionname)),(Object)((_optionobject.getObject())));
 BA.debugLineNum = 1631;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprefix(RemoteObject __ref,RemoteObject _prefix,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("SetPrefix (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1794);
if (RapidSub.canDelegate("setprefix")) { return __ref.runUserSub(false, "bananovue","setprefix", __ref, _prefix, _target);}
RemoteObject _nm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mk = RemoteObject.createImmutable("");
RemoteObject _mv = RemoteObject.declareNull("Object");
RemoteObject _mk1 = RemoteObject.createImmutable("");
Debug.locals.put("prefix", _prefix);
Debug.locals.put("target", _target);
 BA.debugLineNum = 1794;BA.debugLine="Sub SetPrefix(prefix As String, target As Map) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1795;BA.debugLine="Dim nm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nm = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nm", _nm);Debug.locals.put("nm", _nm);
 BA.debugLineNum = 1796;BA.debugLine="For Each mk As String In target.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _target.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("mk", _mk);
Debug.locals.put("mk", _mk);
 BA.debugLineNum = 1797;BA.debugLine="Dim mv As Object = target.Get(mk)";
Debug.JustUpdateDeviceLine();
_mv = _target.runMethod(false,"Get",(Object)((_mk)));Debug.locals.put("mv", _mv);Debug.locals.put("mv", _mv);
 BA.debugLineNum = 1798;BA.debugLine="Dim mk1 As String = prefix & \"_\" & mk";
Debug.JustUpdateDeviceLine();
_mk1 = RemoteObject.concat(_prefix,RemoteObject.createImmutable("_"),_mk);Debug.locals.put("mk1", _mk1);Debug.locals.put("mk1", _mk1);
 BA.debugLineNum = 1799;BA.debugLine="nm.Put(mk1,mv)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)((_mk1)),(Object)(_mv));
 }
}Debug.locals.put("mk", _mk);
;
 BA.debugLineNum = 1801;BA.debugLine="Return nm";
Debug.JustUpdateDeviceLine();
if (true) return _nm;
 BA.debugLineNum = 1802;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrequiredstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetRequiredState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1879);
if (RapidSub.canDelegate("setrequiredstate")) { return __ref.runUserSub(false, "bananovue","setrequiredstate", __ref, _k, _v);}
RemoteObject _diskey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1879;BA.debugLine="Sub SetRequiredState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1880;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("required")));Debug.locals.put("disKey", _diskey);Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1881;BA.debugLine="SetStateSingle(disKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_diskey),(Object)((_v)));
 BA.debugLineNum = 1882;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetShowState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1034);
if (RapidSub.canDelegate("setshowstate")) { return __ref.runUserSub(false, "bananovue","setshowstate", __ref, _k, _v);}
RemoteObject _showkey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1034;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1035;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
Debug.JustUpdateDeviceLine();
_showkey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("show")));Debug.locals.put("showKey", _showkey);Debug.locals.put("showKey", _showkey);
 BA.debugLineNum = 1036;BA.debugLine="SetStateSingle(showKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_showkey),(Object)((_v)));
 BA.debugLineNum = 1037;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstate(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2359);
if (RapidSub.canDelegate("setstate")) { return __ref.runUserSub(false, "bananovue","setstate", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 2359;BA.debugLine="Sub SetState(m As Map) As BANanoVue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2360;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 2361;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _m.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 2362;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 2363;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 2364;BA.debugLine="data.Put(k, v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 2367;BA.debugLine="Log(LastException)";
Debug.JustUpdateDeviceLine();
bananovue.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(bananovue.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
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
public static RemoteObject  _setstatedecrement(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetStateDecrement (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1969);
if (RapidSub.canDelegate("setstatedecrement")) { return __ref.runUserSub(false, "bananovue","setstatedecrement", __ref, _k);}
RemoteObject _oldv = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 1969;BA.debugLine="Sub SetStateDecrement(k As String) As BANanoVue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1970;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
Debug.JustUpdateDeviceLine();
_oldv = BA.ObjectToString(__ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_k),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("oldV", _oldv);Debug.locals.put("oldV", _oldv);
 BA.debugLineNum = 1971;BA.debugLine="oldV = BANAno.parseInt(oldV) - 1";
Debug.JustUpdateDeviceLine();
_oldv = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_oldv))),RemoteObject.createImmutable(1)}, "-",1, 1));Debug.locals.put("oldV", _oldv);
 BA.debugLineNum = 1972;BA.debugLine="SetStateSingle(k, oldV)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((_oldv)));
 BA.debugLineNum = 1973;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1974;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateFalse (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1957);
if (RapidSub.canDelegate("setstatefalse")) { return __ref.runUserSub(false, "bananovue","setstatefalse", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 1957;BA.debugLine="Sub SetStateFalse(k As String) As BANanoVue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1958;BA.debugLine="SetStateSingle(k,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((bananovue.__c.getField(true,"False"))));
 BA.debugLineNum = 1959;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1960;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateIncrement (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1962);
if (RapidSub.canDelegate("setstateincrement")) { return __ref.runUserSub(false, "bananovue","setstateincrement", __ref, _k);}
RemoteObject _oldv = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 1962;BA.debugLine="Sub SetStateIncrement(k As String) As BANanoVue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1963;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
Debug.JustUpdateDeviceLine();
_oldv = BA.ObjectToString(__ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_k),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("oldV", _oldv);Debug.locals.put("oldV", _oldv);
 BA.debugLineNum = 1964;BA.debugLine="oldV = BANAno.parseInt(oldV) + 1";
Debug.JustUpdateDeviceLine();
_oldv = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_oldv))),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("oldV", _oldv);
 BA.debugLineNum = 1965;BA.debugLine="SetStateSingle(k, oldV)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((_oldv)));
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
public static RemoteObject  _setstatelist(RemoteObject __ref,RemoteObject _mapkey,RemoteObject _mapvalues) throws Exception{
try {
		Debug.PushSubsStack("SetStateList (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2342);
if (RapidSub.canDelegate("setstatelist")) { return __ref.runUserSub(false, "bananovue","setstatelist", __ref, _mapkey, _mapvalues);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("mapKey", _mapkey);
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 2342;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2343;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 2344;BA.debugLine="opt.Put(mapKey, mapValues)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((_mapkey)),(Object)((_mapvalues.getObject())));
 BA.debugLineNum = 2345;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 2346;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2347;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateListValues (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2349);
if (RapidSub.canDelegate("setstatelistvalues")) { return __ref.runUserSub(false, "bananovue","setstatelistvalues", __ref, _mapvalues);}
RemoteObject _lstvalue = RemoteObject.createImmutable("");
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 2349;BA.debugLine="Sub SetStateListValues(mapValues As List) As BANan";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2350;BA.debugLine="For Each lstValue As String In mapValues";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _mapvalues;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstvalue = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("lstValue", _lstvalue);
Debug.locals.put("lstValue", _lstvalue);
 BA.debugLineNum = 2351;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 2352;BA.debugLine="opt.Put(lstValue, \"\")";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((_lstvalue)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2353;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 }
}Debug.locals.put("lstValue", _lstvalue);
;
 BA.debugLineNum = 2355;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2356;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateMap (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2334);
if (RapidSub.canDelegate("setstatemap")) { return __ref.runUserSub(false, "bananovue","setstatemap", __ref, _mapkey, _mapvalues);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("mapKey", _mapkey);
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 2334;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2335;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 2336;BA.debugLine="opt.Put(mapKey, mapValues)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((_mapkey)),(Object)((_mapvalues.getObject())));
 BA.debugLineNum = 2337;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 2338;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2339;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateSingle (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1978);
if (RapidSub.canDelegate("setstatesingle")) { return __ref.runUserSub(false, "bananovue","setstatesingle", __ref, _k, _v);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1978;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As BA";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1979;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 1980;BA.debugLine="opt.Put(k, v)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 BA.debugLineNum = 1981;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 1982;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1983;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateTrue (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1952);
if (RapidSub.canDelegate("setstatetrue")) { return __ref.runUserSub(false, "bananovue","setstatetrue", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 1952;BA.debugLine="Sub SetStateTrue(k As String) As BANanoVue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1953;BA.debugLine="SetStateSingle(k,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((bananovue.__c.getField(true,"True"))));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _classname,RemoteObject _prop,RemoteObject _valx) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1600);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "bananovue","setstyle", __ref, _classname, _prop, _valx);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("className", _classname);
Debug.locals.put("prop", _prop);
Debug.locals.put("valx", _valx);
 BA.debugLineNum = 1600;BA.debugLine="Sub SetStyle(className As String, prop As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1601;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1602;BA.debugLine="If dynamicStyle.ContainsKey(className) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_dynamicstyle" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_classname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1603;BA.debugLine="m = dynamicStyle.Get(className)";
Debug.JustUpdateDeviceLine();
_m.setObject(__ref.getField(false,"_dynamicstyle" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_classname))));
 BA.debugLineNum = 1604;BA.debugLine="m.Put(prop, valx)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_prop)),(Object)((_valx)));
 }else {
 BA.debugLineNum = 1606;BA.debugLine="m = CreateMap()";
Debug.JustUpdateDeviceLine();
_m = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("m", _m);
 BA.debugLineNum = 1607;BA.debugLine="m.Put(prop, valx)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_prop)),(Object)((_valx)));
 };
 BA.debugLineNum = 1609;BA.debugLine="dynamicStyle.Put(className, m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dynamicstyle" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_classname)),(Object)((_m.getObject())));
 BA.debugLineNum = 1610;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1611;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTemplate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2125);
if (RapidSub.canDelegate("settemplate")) { return __ref.runUserSub(false, "bananovue","settemplate", __ref, _tmp);}
Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 2125;BA.debugLine="Sub SetTemplate(tmp As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2126;BA.debugLine="Template.SetText(tmp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_tmp));
 BA.debugLineNum = 2127;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupdated(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetUpdated (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2232);
if (RapidSub.canDelegate("setupdated")) { return __ref.runUserSub(false, "bananovue","setupdated", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2232;BA.debugLine="Sub SetUpdated(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2233;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2234;BA.debugLine="updated = BANAno.CallBack(module, methodName, Nul";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_updated" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovue.__c.getField(false,"Null"))));
 BA.debugLineNum = 2235;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2236;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwatch(RemoteObject __ref,RemoteObject _k,RemoteObject _bimmediate,RemoteObject _bdeep,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetWatch (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2314);
if (RapidSub.canDelegate("setwatch")) { return __ref.runUserSub(false, "bananovue","setwatch", __ref, _k, _bimmediate, _bdeep, _module, _methodname);}
RemoteObject _newval = RemoteObject.declareNull("Object");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _deepit = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("k", _k);
Debug.locals.put("bImmediate", _bimmediate);
Debug.locals.put("bDeep", _bdeep);
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2314;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2315;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 2316;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (bananovue.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2317;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 2318;BA.debugLine="If data.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2319;BA.debugLine="SetStateSingle(k, Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)(bananovue.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 2321;BA.debugLine="Dim newVal As Object";
Debug.JustUpdateDeviceLine();
_newval = RemoteObject.createNew ("Object");Debug.locals.put("newVal", _newval);
 BA.debugLineNum = 2322;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),(Object)(bananovue.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_newval}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 2323;BA.debugLine="Dim deepit As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_deepit = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_deepit = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("deepit", _deepit);Debug.locals.put("deepit", _deepit);
 BA.debugLineNum = 2324;BA.debugLine="deepit.Put(\"handler\", methodName)";
Debug.JustUpdateDeviceLine();
_deepit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("handler"))),(Object)((_methodname)));
 BA.debugLineNum = 2325;BA.debugLine="deepit.Put(\"deep\", bDeep)";
Debug.JustUpdateDeviceLine();
_deepit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep"))),(Object)((_bdeep)));
 BA.debugLineNum = 2326;BA.debugLine="deepit.Put(\"immediate\", bImmediate)";
Debug.JustUpdateDeviceLine();
_deepit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("immediate"))),(Object)((_bimmediate)));
 BA.debugLineNum = 2327;BA.debugLine="watches.Put(k, deepit)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_watches" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)((_deepit.getObject())));
 BA.debugLineNum = 2328;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 2330;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showerror(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("ShowError (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1762);
if (RapidSub.canDelegate("showerror")) { return __ref.runUserSub(false, "bananovue","showerror", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 1762;BA.debugLine="Sub ShowError(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1763;BA.debugLine="SetStateSingle($\"${elID}error\"$, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovue.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("error")))),(Object)((bananovue.__c.getField(true,"True"))));
 BA.debugLineNum = 1764;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showitems(RemoteObject __ref,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("ShowItems (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1072);
if (RapidSub.canDelegate("showitems")) { return __ref.runUserSub(false, "bananovue","showitems", __ref, _items);}
RemoteObject _item = RemoteObject.createImmutable("");
Debug.locals.put("items", _items);
 BA.debugLineNum = 1072;BA.debugLine="Sub ShowItems(items As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1073;BA.debugLine="For Each item As String In items";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _items;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 1074;BA.debugLine="SetStateSingle(item, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_item),(Object)((bananovue.__c.getField(true,"True"))));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 1076;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shufflelist(RemoteObject __ref,RemoteObject _pl) throws Exception{
try {
		Debug.PushSubsStack("ShuffleList (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2074);
if (RapidSub.canDelegate("shufflelist")) { return __ref.runUserSub(false, "bananovue","shufflelist", __ref, _pl);}
int _i = 0;
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _k = RemoteObject.declareNull("Object");
Debug.locals.put("pl", _pl);
 BA.debugLineNum = 2074;BA.debugLine="Sub ShuffleList(pl As List) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2075;BA.debugLine="For i = pl.Size - 1 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_pl.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2076;BA.debugLine="Dim j As Int";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 2077;BA.debugLine="Dim k As Object";
Debug.JustUpdateDeviceLine();
_k = RemoteObject.createNew ("Object");Debug.locals.put("k", _k);
 BA.debugLineNum = 2078;BA.debugLine="j = Rnd(0, i + 1)";
Debug.JustUpdateDeviceLine();
_j = bananovue.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("j", _j);
 BA.debugLineNum = 2079;BA.debugLine="k = pl.Get(j)";
Debug.JustUpdateDeviceLine();
_k = _pl.runMethod(false,"Get",(Object)(_j));Debug.locals.put("k", _k);
 BA.debugLineNum = 2080;BA.debugLine="pl.Set(j,pl.Get(i))";
Debug.JustUpdateDeviceLine();
_pl.runVoidMethod ("Set",(Object)(_j),(Object)(_pl.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 2081;BA.debugLine="pl.Set(i,k)";
Debug.JustUpdateDeviceLine();
_pl.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _i)),(Object)(_k));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2083;BA.debugLine="Return pl";
Debug.JustUpdateDeviceLine();
if (true) return _pl;
 BA.debugLineNum = 2084;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sortmap(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SortMap (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1003);
if (RapidSub.canDelegate("sortmap")) { return __ref.runUserSub(false, "bananovue","sortmap", __ref, _m);}
RemoteObject _nm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _strvalue = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 1003;BA.debugLine="Sub SortMap(m As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1004;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 1005;BA.debugLine="Dim nm As Map";
Debug.JustUpdateDeviceLine();
_nm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("nm", _nm);
 BA.debugLineNum = 1006;BA.debugLine="nm.Initialize";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Initialize");
 BA.debugLineNum = 1007;BA.debugLine="Dim lst As List";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1008;BA.debugLine="lst.Initialize";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 1009;BA.debugLine="For Each strkey As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _m.runMethod(false,"Keys");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_strkey = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("strkey", _strkey);
Debug.locals.put("strkey", _strkey);
 BA.debugLineNum = 1010;BA.debugLine="lst.Add(strkey)";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Add",(Object)((_strkey)));
 }
}Debug.locals.put("strkey", _strkey);
;
 BA.debugLineNum = 1013;BA.debugLine="lst.Sort(True)";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Sort",(Object)(bananovue.__c.getField(true,"True")));
 BA.debugLineNum = 1014;BA.debugLine="For Each strkey As String In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group10 = _lst;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_strkey = BA.ObjectToString(group10.runMethod(false,"Get",index10));Debug.locals.put("strkey", _strkey);
Debug.locals.put("strkey", _strkey);
 BA.debugLineNum = 1015;BA.debugLine="Dim strvalue As Object = m.Get(strkey)";
Debug.JustUpdateDeviceLine();
_strvalue = _m.runMethod(false,"Get",(Object)((_strkey)));Debug.locals.put("strvalue", _strvalue);Debug.locals.put("strvalue", _strvalue);
 BA.debugLineNum = 1016;BA.debugLine="nm.Put(strkey,strvalue)";
Debug.JustUpdateDeviceLine();
_nm.runVoidMethod ("Put",(Object)((_strkey)),(Object)(_strvalue));
 }
}Debug.locals.put("strkey", _strkey);
;
 BA.debugLineNum = 1018;BA.debugLine="Return nm";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _nm;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 1020;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 };
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
public static RemoteObject  _space(RemoteObject __ref,RemoteObject _hm) throws Exception{
try {
		Debug.PushSubsStack("Space (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,850);
if (RapidSub.canDelegate("space")) { return __ref.runUserSub(false, "bananovue","space", __ref, _hm);}
RemoteObject _rs = RemoteObject.createImmutable("");
Debug.locals.put("HM", _hm);
 BA.debugLineNum = 850;BA.debugLine="Sub Space(HM As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 851;BA.debugLine="Dim RS As String = \"\"";
Debug.JustUpdateDeviceLine();
_rs = BA.ObjectToString("");Debug.locals.put("RS", _rs);Debug.locals.put("RS", _rs);
 BA.debugLineNum = 852;BA.debugLine="Do While Len(RS) < HM";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",__ref.runClassMethod (b4j.example.bananovue.class, "_len" /*RemoteObject*/ ,(Object)(_rs)),BA.numberCast(double.class, _hm))) {
 BA.debugLineNum = 853;BA.debugLine="RS = RS & \" \"";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.concat(_rs,RemoteObject.createImmutable(" "));Debug.locals.put("RS", _rs);
 }
;
 BA.debugLineNum = 855;BA.debugLine="Return RS";
Debug.JustUpdateDeviceLine();
if (true) return _rs;
 BA.debugLineNum = 856;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _state2another(RemoteObject __ref,RemoteObject _source,RemoteObject _target,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("State2Another (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("state2another")) { return __ref.runUserSub(false, "bananovue","state2another", __ref, _source, _target, _defaultvalue);}
RemoteObject _readobj = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
Debug.locals.put("target", _target);
Debug.locals.put("defaultValue", _defaultvalue);
 BA.debugLineNum = 273;BA.debugLine="Sub State2Another(source As String, target As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 274;BA.debugLine="Dim readObj As Object = GetState(source, defaultV";
Debug.JustUpdateDeviceLine();
_readobj = __ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_source),(Object)(_defaultvalue));Debug.locals.put("readObj", _readobj);Debug.locals.put("readObj", _readobj);
 BA.debugLineNum = 275;BA.debugLine="SetStateSingle(target, readObj)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_target),(Object)(_readobj));
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stateexists(RemoteObject __ref,RemoteObject _statename) throws Exception{
try {
		Debug.PushSubsStack("StateExists (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2088);
if (RapidSub.canDelegate("stateexists")) { return __ref.runUserSub(false, "bananovue","stateexists", __ref, _statename);}
Debug.locals.put("stateName", _statename);
 BA.debugLineNum = 2088;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2089;BA.debugLine="stateName = stateName.tolowercase";
Debug.JustUpdateDeviceLine();
_statename = _statename.runMethod(true,"toLowerCase");Debug.locals.put("stateName", _statename);
 BA.debugLineNum = 2090;BA.debugLine="Return data.ContainsKey(stateName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_statename)));
 BA.debugLineNum = 2091;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _statusrag(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("StatusRAG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2606);
if (RapidSub.canDelegate("statusrag")) { return __ref.runUserSub(false, "bananovue","statusrag", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2606;BA.debugLine="Public Sub StatusRAG(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2607;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 2609;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 break; }
case 1: {
 BA.debugLineNum = 2611;BA.debugLine="Return \"./assets/orange.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/orange.png");
 break; }
case 2: {
 BA.debugLineNum = 2613;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 break; }
default: {
 BA.debugLineNum = 2615;BA.debugLine="Return \"./assets/gray.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/gray.png");
 break; }
}
;
 BA.debugLineNum = 2617;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _statusrg(RemoteObject __ref,RemoteObject _dvalue) throws Exception{
try {
		Debug.PushSubsStack("StatusRG (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2672);
if (RapidSub.canDelegate("statusrg")) { return __ref.runUserSub(false, "bananovue","statusrg", __ref, _dvalue);}
Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 2672;BA.debugLine="Public Sub StatusRG(dValue As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2673;BA.debugLine="Select Case dValue";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dvalue,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 2675;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 break; }
case 1: {
 BA.debugLineNum = 2677;BA.debugLine="Return \"./assets/green.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/green.png");
 break; }
default: {
 BA.debugLineNum = 2679;BA.debugLine="Return \"./assets/red.png\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("./assets/red.png");
 break; }
}
;
 BA.debugLineNum = 2681;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strparse(RemoteObject __ref,RemoteObject _delim,RemoteObject _inputstring) throws Exception{
try {
		Debug.PushSubsStack("StrParse (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2007);
if (RapidSub.canDelegate("strparse")) { return __ref.runUserSub(false, "bananovue","strparse", __ref, _delim, _inputstring);}
RemoteObject _outlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _commaloc = RemoteObject.createImmutable(0);
RemoteObject _leftside = RemoteObject.createImmutable("");
RemoteObject _rightside = RemoteObject.createImmutable("");
Debug.locals.put("Delim", _delim);
Debug.locals.put("InputString", _inputstring);
 BA.debugLineNum = 2007;BA.debugLine="Sub StrParse(Delim As String, InputString As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2008;BA.debugLine="Dim OutList As List";
Debug.JustUpdateDeviceLine();
_outlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("OutList", _outlist);
 BA.debugLineNum = 2009;BA.debugLine="Dim CommaLoc As Int";
Debug.JustUpdateDeviceLine();
_commaloc = RemoteObject.createImmutable(0);Debug.locals.put("CommaLoc", _commaloc);
 BA.debugLineNum = 2010;BA.debugLine="OutList.Initialize";
Debug.JustUpdateDeviceLine();
_outlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2011;BA.debugLine="OutList.clear";
Debug.JustUpdateDeviceLine();
_outlist.runVoidMethod ("Clear");
 BA.debugLineNum = 2012;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
Debug.JustUpdateDeviceLine();
_commaloc = _inputstring.runMethod(true,"indexOf",(Object)(_delim));Debug.locals.put("CommaLoc", _commaloc);
 BA.debugLineNum = 2013;BA.debugLine="Do While CommaLoc >-1";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",_commaloc,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 2014;BA.debugLine="Dim LeftSide As String";
Debug.JustUpdateDeviceLine();
_leftside = RemoteObject.createImmutable("");Debug.locals.put("LeftSide", _leftside);
 BA.debugLineNum = 2015;BA.debugLine="LeftSide= InputString.SubString2(0,CommaLoc)";
Debug.JustUpdateDeviceLine();
_leftside = _inputstring.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_commaloc));Debug.locals.put("LeftSide", _leftside);
 BA.debugLineNum = 2016;BA.debugLine="Dim RightSide As String";
Debug.JustUpdateDeviceLine();
_rightside = RemoteObject.createImmutable("");Debug.locals.put("RightSide", _rightside);
 BA.debugLineNum = 2017;BA.debugLine="RightSide= InputString.SubString(CommaLoc+1)";
Debug.JustUpdateDeviceLine();
_rightside = _inputstring.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_commaloc,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("RightSide", _rightside);
 BA.debugLineNum = 2018;BA.debugLine="OutList.Add(LeftSide)";
Debug.JustUpdateDeviceLine();
_outlist.runVoidMethod ("Add",(Object)((_leftside)));
 BA.debugLineNum = 2019;BA.debugLine="InputString=RightSide";
Debug.JustUpdateDeviceLine();
_inputstring = _rightside;Debug.locals.put("InputString", _inputstring);
 BA.debugLineNum = 2020;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
Debug.JustUpdateDeviceLine();
_commaloc = _inputstring.runMethod(true,"indexOf",(Object)(_delim));Debug.locals.put("CommaLoc", _commaloc);
 }
;
 BA.debugLineNum = 2022;BA.debugLine="OutList.Add(InputString)";
Debug.JustUpdateDeviceLine();
_outlist.runVoidMethod ("Add",(Object)((_inputstring)));
 BA.debugLineNum = 2023;BA.debugLine="Return OutList";
Debug.JustUpdateDeviceLine();
if (true) return _outlist;
 BA.debugLineNum = 2024;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sumlistofmapsproperty(RemoteObject __ref,RemoteObject _lst,RemoteObject _prop) throws Exception{
try {
		Debug.PushSubsStack("SumListOfMapsProperty (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,544);
if (RapidSub.canDelegate("sumlistofmapsproperty")) { return __ref.runUserSub(false, "bananovue","sumlistofmapsproperty", __ref, _lst, _prop);}
RemoteObject _tsum = RemoteObject.createImmutable(0);
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _propv = RemoteObject.createImmutable("");
Debug.locals.put("lst", _lst);
Debug.locals.put("prop", _prop);
 BA.debugLineNum = 544;BA.debugLine="Sub SumListOfMapsProperty(lst As List, prop As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 545;BA.debugLine="Dim tsum As Double = 0";
Debug.JustUpdateDeviceLine();
_tsum = BA.numberCast(double.class, 0);Debug.locals.put("tsum", _tsum);Debug.locals.put("tsum", _tsum);
 BA.debugLineNum = 546;BA.debugLine="For Each rec As Map In lst";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = _lst;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_rec.setObject(group2.runMethod(false,"Get",index2));
Debug.locals.put("rec", _rec);
 BA.debugLineNum = 547;BA.debugLine="Dim propv As String = rec.GetDefault(prop,\"0\")";
Debug.JustUpdateDeviceLine();
_propv = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)((_prop)),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("propv", _propv);Debug.locals.put("propv", _propv);
 BA.debugLineNum = 548;BA.debugLine="tsum = tsum + BANAno.parseFloat(propv)";
Debug.JustUpdateDeviceLine();
_tsum = RemoteObject.solve(new RemoteObject[] {_tsum,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_propv)))}, "+",1, 0);Debug.locals.put("tsum", _tsum);
 }
}Debug.locals.put("rec", _rec);
;
 BA.debugLineNum = 550;BA.debugLine="Return tsum";
Debug.JustUpdateDeviceLine();
if (true) return _tsum;
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _togglenamedstate(RemoteObject __ref,RemoteObject _statename,RemoteObject _state1,RemoteObject _state2) throws Exception{
try {
		Debug.PushSubsStack("ToggleNamedState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1992);
if (RapidSub.canDelegate("togglenamedstate")) { return __ref.runUserSub(false, "bananovue","togglenamedstate", __ref, _statename, _state1, _state2);}
RemoteObject _bcurrent = RemoteObject.createImmutable("");
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("stateName", _statename);
Debug.locals.put("state1", _state1);
Debug.locals.put("state2", _state2);
 BA.debugLineNum = 1992;BA.debugLine="Sub ToggleNamedState(stateName As String, state1 A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1993;BA.debugLine="Dim bcurrent As String = GetState(stateName,\"\")";
Debug.JustUpdateDeviceLine();
_bcurrent = BA.ObjectToString(__ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_statename),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("bcurrent", _bcurrent);Debug.locals.put("bcurrent", _bcurrent);
 BA.debugLineNum = 1994;BA.debugLine="If bcurrent.EqualsIgnoreCase(state1) Then";
Debug.JustUpdateDeviceLine();
if (_bcurrent.runMethod(true,"equalsIgnoreCase",(Object)(_state1)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1995;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 1996;BA.debugLine="opt.Put(stateName, state2)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((_statename)),(Object)((_state2)));
 BA.debugLineNum = 1997;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 }else {
 BA.debugLineNum = 1999;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 2000;BA.debugLine="opt.Put(stateName, state1)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((_statename)),(Object)((_state1)));
 BA.debugLineNum = 2001;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 };
 BA.debugLineNum = 2003;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 2004;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToggleState (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1985);
if (RapidSub.canDelegate("togglestate")) { return __ref.runUserSub(false, "bananovue","togglestate", __ref, _statename);}
RemoteObject _bcurrent = RemoteObject.createImmutable(false);
Debug.locals.put("stateName", _statename);
 BA.debugLineNum = 1985;BA.debugLine="Sub ToggleState(stateName As String) As BANanoVue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1986;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,Fals";
Debug.JustUpdateDeviceLine();
_bcurrent = BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_statename),(Object)((bananovue.__c.getField(true,"False")))));Debug.locals.put("bcurrent", _bcurrent);Debug.locals.put("bcurrent", _bcurrent);
 BA.debugLineNum = 1987;BA.debugLine="bcurrent = Not(bcurrent)";
Debug.JustUpdateDeviceLine();
_bcurrent = bananovue.__c.runMethod(true,"Not",(Object)(_bcurrent));Debug.locals.put("bcurrent", _bcurrent);
 BA.debugLineNum = 1988;BA.debugLine="SetStateSingle(stateName, bcurrent)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_statename),(Object)((_bcurrent)));
 BA.debugLineNum = 1989;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1990;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toyyyymmdd(RemoteObject __ref,RemoteObject _vmodel) throws Exception{
try {
		Debug.PushSubsStack("ToYYYYMMDD (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,964);
if (RapidSub.canDelegate("toyyyymmdd")) { return __ref.runUserSub(false, "bananovue","toyyyymmdd", __ref, _vmodel);}
RemoteObject _sk = RemoteObject.createImmutable("");
Debug.locals.put("vmodel", _vmodel);
 BA.debugLineNum = 964;BA.debugLine="Sub ToYYYYMMDD(vmodel As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 965;BA.debugLine="Dim sk As String = GetState(vmodel,\"\")";
Debug.JustUpdateDeviceLine();
_sk = BA.ObjectToString(__ref.runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sk", _sk);Debug.locals.put("sk", _sk);
 BA.debugLineNum = 966;BA.debugLine="sk = Date2YYYYMMDD(sk)";
Debug.JustUpdateDeviceLine();
_sk = __ref.runClassMethod (b4j.example.bananovue.class, "_date2yyyymmdd" /*RemoteObject*/ ,(Object)((_sk)));Debug.locals.put("sk", _sk);
 BA.debugLineNum = 967;BA.debugLine="SetStateSingle(vmodel, sk)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_sk)));
 BA.debugLineNum = 968;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trimstring(RemoteObject __ref,RemoteObject _strvalue) throws Exception{
try {
		Debug.PushSubsStack("TrimString (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,842);
if (RapidSub.canDelegate("trimstring")) { return __ref.runUserSub(false, "bananovue","trimstring", __ref, _strvalue);}
Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 842;BA.debugLine="private Sub TrimString(strValue As String) As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 843;BA.debugLine="Return strValue.trim";
Debug.JustUpdateDeviceLine();
if (true) return _strvalue.runMethod(true,"trim");
 BA.debugLineNum = 844;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _use(RemoteObject __ref,RemoteObject _bo) throws Exception{
try {
		Debug.PushSubsStack("Use (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2130);
if (RapidSub.canDelegate("use")) { return __ref.runUserSub(false, "bananovue","use", __ref, _bo);}
Debug.locals.put("bo", _bo);
 BA.debugLineNum = 2130;BA.debugLine="Sub Use(bo As BANanoObject)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2131;BA.debugLine="BOVue.RunMethod(\"use\", bo)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("use")),(Object)((_bo.getObject())));
 BA.debugLineNum = 2132;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _use1(RemoteObject __ref,RemoteObject _bo,RemoteObject _opt) throws Exception{
try {
		Debug.PushSubsStack("Use1 (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2135);
if (RapidSub.canDelegate("use1")) { return __ref.runUserSub(false, "bananovue","use1", __ref, _bo, _opt);}
Debug.locals.put("bo", _bo);
Debug.locals.put("opt", _opt);
 BA.debugLineNum = 2135;BA.debugLine="Sub Use1(bo As BANanoObject, opt As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2136;BA.debugLine="BOVue.RunMethod(\"use\", Array(bo, opt))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("use")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_bo.getObject()),(_opt.getObject())}))));
 BA.debugLineNum = 2137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ux(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UX (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,2151);
if (RapidSub.canDelegate("ux")) { return __ref.runUserSub(false, "bananovue","ux", __ref);}
RemoteObject _tmp = RemoteObject.createImmutable("");
RemoteObject _ropt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _router = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _dkey = RemoteObject.createImmutable("");
RemoteObject _rkey = RemoteObject.createImmutable("");
 BA.debugLineNum = 2151;BA.debugLine="Sub UX()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 2152;BA.debugLine="Dim tmp As String = Template.tostring";
Debug.JustUpdateDeviceLine();
_tmp = __ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("tmp", _tmp);Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 2153;BA.debugLine="GetTemplate = tmp";
Debug.JustUpdateDeviceLine();
__ref.setField ("_gettemplate" /*RemoteObject*/ ,_tmp);
 BA.debugLineNum = 2154;BA.debugLine="If routes.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_routes" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2155;BA.debugLine="Dim ropt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_ropt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ropt = bananovue.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("ropt", _ropt);Debug.locals.put("ropt", _ropt);
 BA.debugLineNum = 2156;BA.debugLine="ropt.Put(\"mode\", \"history\")";
Debug.JustUpdateDeviceLine();
_ropt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mode"))),(Object)((RemoteObject.createImmutable("history"))));
 BA.debugLineNum = 2157;BA.debugLine="ropt.Put(\"routes\", routes)";
Debug.JustUpdateDeviceLine();
_ropt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("routes"))),(Object)((__ref.getField(false,"_routes" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 2158;BA.debugLine="Dim router As BANanoObject";
Debug.JustUpdateDeviceLine();
_router = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("router", _router);
 BA.debugLineNum = 2159;BA.debugLine="router.Initialize2(\"VueRouter\", Array(ropt))";
Debug.JustUpdateDeviceLine();
_router.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("VueRouter")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ropt.getObject())}))));
 BA.debugLineNum = 2160;BA.debugLine="Options.Put(\"router\", router)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("router"))),(Object)((_router.getObject())));
 };
 BA.debugLineNum = 2162;BA.debugLine="Options.Put(\"el\", \"#app\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("el"))),(Object)((RemoteObject.createImmutable("#app"))));
 BA.debugLineNum = 2163;BA.debugLine="If data.Size > 0 Then Options.put(\"data\", data)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((__ref.getField(false,"_data" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2164;BA.debugLine="If methods.Size > 0 Then Options.Put(\"methods\", m";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_methods" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("methods"))),(Object)((__ref.getField(false,"_methods" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2165;BA.debugLine="If computed.Size > 0 Then Options.Put(\"computed\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_computed" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("computed"))),(Object)((__ref.getField(false,"_computed" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2166;BA.debugLine="If watches.Size > 0 Then Options.Put(\"watch\", wat";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_watches" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("watch"))),(Object)((__ref.getField(false,"_watches" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2167;BA.debugLine="If components.Size > 0 Then Options.Put(\"componen";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_components" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("components"))),(Object)((__ref.getField(false,"_components" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2168;BA.debugLine="If updated <> Null Then Options.Put(\"updated\", up";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_updated" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((__ref.getField(false,"_updated" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2169;BA.debugLine="If destroyed <> Null Then Options.Put(\"destroyed\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_destroyed" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("destroyed"))),(Object)((__ref.getField(false,"_destroyed" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2170;BA.debugLine="If mounted <> Null Then	Options.Put(\"mounted\", mo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_mounted" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mounted"))),(Object)((__ref.getField(false,"_mounted" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2171;BA.debugLine="If beforeCreate <> Null Then Options.Put(\"beforeC";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_beforecreate" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beforeCreate"))),(Object)((__ref.getField(false,"_beforecreate" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2172;BA.debugLine="If created <> Null Then Options.Put(\"created\", cr";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_created" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("created"))),(Object)((__ref.getField(false,"_created" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2173;BA.debugLine="If beforeMount <> Null Then Options.Put(\"beforeMo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_beforemount" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beforeMount"))),(Object)((__ref.getField(false,"_beforemount" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2174;BA.debugLine="If beforeUpdate <> Null Then Options.Put(\"beforeU";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_beforeupdate" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beforeUpdate"))),(Object)((__ref.getField(false,"_beforeupdate" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2175;BA.debugLine="If activated <> Null Then Options.Put(\"activated\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_activated" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("activated"))),(Object)((__ref.getField(false,"_activated" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2176;BA.debugLine="If deactivated <> Null Then Options.Put(\"deactiva";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_deactivated" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deactivated"))),(Object)((__ref.getField(false,"_deactivated" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2177;BA.debugLine="If beforeDestroy <> Null Then Options.Put(\"before";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_beforedestroy" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beforeDestroy"))),(Object)((__ref.getField(false,"_beforedestroy" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 2178;BA.debugLine="Options.Put(\"template\", tmp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("template"))),(Object)((_tmp)));
 BA.debugLineNum = 2179;BA.debugLine="BOVue.Initialize2(\"Vue\", Options)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Vue")),(Object)((__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 2181;BA.debugLine="Dim dKey As String = \"$data\"";
Debug.JustUpdateDeviceLine();
_dkey = BA.ObjectToString("$data");Debug.locals.put("dKey", _dkey);Debug.locals.put("dKey", _dkey);
 BA.debugLineNum = 2182;BA.debugLine="data = BOVue.GetField(dKey).Result";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).setObject (__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_dkey)).runMethod(false,"Result"));
 BA.debugLineNum = 2184;BA.debugLine="Dim rKey As String = \"$refs\"";
Debug.JustUpdateDeviceLine();
_rkey = BA.ObjectToString("$refs");Debug.locals.put("rKey", _rkey);Debug.locals.put("rKey", _rkey);
 BA.debugLineNum = 2185;BA.debugLine="refs = BOVue.GetField(rKey).result";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_refs" /*RemoteObject*/ ).setObject (__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_rkey)).runMethod(false,"Result"));
 BA.debugLineNum = 2186;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _val(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Val (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,554);
if (RapidSub.canDelegate("val")) { return __ref.runUserSub(false, "bananovue","val", __ref, _value);}
RemoteObject _sout = RemoteObject.createImmutable("");
RemoteObject _mout = RemoteObject.createImmutable("");
RemoteObject _slen = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 554;BA.debugLine="Public Sub Val(value As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 555;BA.debugLine="value = CStr(value)";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_value)));Debug.locals.put("value", _value);
 BA.debugLineNum = 556;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 557;BA.debugLine="value = value.Trim";
Debug.JustUpdateDeviceLine();
_value = _value.runMethod(true,"trim");Debug.locals.put("value", _value);
 BA.debugLineNum = 558;BA.debugLine="If value = \"\" Then value = \"0\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
_value = BA.ObjectToString("0");Debug.locals.put("value", _value);};
 BA.debugLineNum = 559;BA.debugLine="Dim sout As String = \"\"";
Debug.JustUpdateDeviceLine();
_sout = BA.ObjectToString("");Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 560;BA.debugLine="Dim mout As String = \"\"";
Debug.JustUpdateDeviceLine();
_mout = BA.ObjectToString("");Debug.locals.put("mout", _mout);Debug.locals.put("mout", _mout);
 BA.debugLineNum = 561;BA.debugLine="Dim slen As Int = value.Length";
Debug.JustUpdateDeviceLine();
_slen = _value.runMethod(true,"length");Debug.locals.put("slen", _slen);Debug.locals.put("slen", _slen);
 BA.debugLineNum = 562;BA.debugLine="Dim i As Int = 0";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 563;BA.debugLine="For i = 0 To slen - 1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_slen,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 564;BA.debugLine="mout = value.CharAt(i)";
Debug.JustUpdateDeviceLine();
_mout = BA.ObjectToString(_value.runMethod(true,"charAt",(Object)(_i)));Debug.locals.put("mout", _mout);
 BA.debugLineNum = 565;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4j.example.bananovue.class, "_instr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("0123456789.-")),(Object)(_mout)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 566;BA.debugLine="sout = sout & mout";
Debug.JustUpdateDeviceLine();
_sout = RemoteObject.concat(_sout,_mout);Debug.locals.put("sout", _sout);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 569;BA.debugLine="Return sout";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _sout;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 571;BA.debugLine="Return value";
Debug.JustUpdateDeviceLine();
if (true) return _value;
 };
 BA.debugLineNum = 573;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validate(RemoteObject __ref,RemoteObject _rec,RemoteObject _required) throws Exception{
try {
		Debug.PushSubsStack("Validate (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,1738);
if (RapidSub.canDelegate("validate")) { return __ref.runUserSub(false, "bananovue","validate", __ref, _rec, _required);}
RemoteObject _iv = RemoteObject.createImmutable(0);
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("rec", _rec);
Debug.locals.put("required", _required);
 BA.debugLineNum = 1738;BA.debugLine="Sub Validate(rec As Map, required As Map) As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1739;BA.debugLine="Dim iv As Int = 0";
Debug.JustUpdateDeviceLine();
_iv = BA.numberCast(int.class, 0);Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 1740;BA.debugLine="For Each k As String In required.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _required.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1741;BA.debugLine="If rec.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_rec.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1742;BA.debugLine="Dim v As String = rec.GetDefault(k,\"\")";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)((_k)),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1743;BA.debugLine="v = CStr(v)";
Debug.JustUpdateDeviceLine();
_v = __ref.runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_v)));Debug.locals.put("v", _v);
 BA.debugLineNum = 1744;BA.debugLine="v = v.trim";
Debug.JustUpdateDeviceLine();
_v = _v.runMethod(true,"trim");Debug.locals.put("v", _v);
 BA.debugLineNum = 1745;BA.debugLine="If v = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1746;BA.debugLine="Log(\"Validate: \" & k)";
Debug.JustUpdateDeviceLine();
bananovue.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Validate: "),_k)));
 BA.debugLineNum = 1747;BA.debugLine="iv = iv + 1";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.solve(new RemoteObject[] {_iv,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 1748;BA.debugLine="ShowError(k)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_showerror" /*RemoteObject*/ ,(Object)(_k));
 }else {
 BA.debugLineNum = 1750;BA.debugLine="HideError(k)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovue.class, "_hideerror" /*RemoteObject*/ ,(Object)(_k));
 };
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1754;BA.debugLine="If iv = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_iv,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1755;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return bananovue.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 1757;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return bananovue.__c.getField(true,"False");
 };
 BA.debugLineNum = 1759;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _yearnow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("YearNow (bananovue) ","bananovue",14,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("yearnow")) { return __ref.runUserSub(false, "bananovue","yearnow", __ref);}
RemoteObject _lnow = RemoteObject.createImmutable(0L);
RemoteObject _dt = RemoteObject.createImmutable("");
 BA.debugLineNum = 430;BA.debugLine="Public Sub YearNow() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 431;BA.debugLine="Dim lNow As Long";
Debug.JustUpdateDeviceLine();
_lnow = RemoteObject.createImmutable(0L);Debug.locals.put("lNow", _lnow);
 BA.debugLineNum = 432;BA.debugLine="Dim dt As String";
Debug.JustUpdateDeviceLine();
_dt = RemoteObject.createImmutable("");Debug.locals.put("dt", _dt);
 BA.debugLineNum = 433;BA.debugLine="lNow = DateTime.Now";
Debug.JustUpdateDeviceLine();
_lnow = bananovue.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("lNow", _lnow);
 BA.debugLineNum = 434;BA.debugLine="DateTime.DateFormat = \"yyyy\"";
Debug.JustUpdateDeviceLine();
bananovue.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy"));
 BA.debugLineNum = 435;BA.debugLine="dt = DateTime.Date(lNow)";
Debug.JustUpdateDeviceLine();
_dt = bananovue.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lnow));Debug.locals.put("dt", _dt);
 BA.debugLineNum = 436;BA.debugLine="Return dt";
Debug.JustUpdateDeviceLine();
if (true) return _dt;
 BA.debugLineNum = 437;BA.debugLine="End Sub";
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