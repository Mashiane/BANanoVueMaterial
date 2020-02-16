package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfsecurity_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public userPassword As String";
pdfsecurity._userpassword = RemoteObject.createImmutable("");__ref.setField("_userpassword",pdfsecurity._userpassword);
 //BA.debugLineNum = 3;BA.debugLine="Public ownerPassword As String";
pdfsecurity._ownerpassword = RemoteObject.createImmutable("");__ref.setField("_ownerpassword",pdfsecurity._ownerpassword);
 //BA.debugLineNum = 4;BA.debugLine="Public printingHR As Boolean";
pdfsecurity._printinghr = RemoteObject.createImmutable(false);__ref.setField("_printinghr",pdfsecurity._printinghr);
 //BA.debugLineNum = 5;BA.debugLine="Public printingLR As Boolean";
pdfsecurity._printinglr = RemoteObject.createImmutable(false);__ref.setField("_printinglr",pdfsecurity._printinglr);
 //BA.debugLineNum = 6;BA.debugLine="Public modifying As Boolean";
pdfsecurity._modifying = RemoteObject.createImmutable(false);__ref.setField("_modifying",pdfsecurity._modifying);
 //BA.debugLineNum = 7;BA.debugLine="Public copying As Boolean";
pdfsecurity._copying = RemoteObject.createImmutable(false);__ref.setField("_copying",pdfsecurity._copying);
 //BA.debugLineNum = 8;BA.debugLine="Public annotating As Boolean";
pdfsecurity._annotating = RemoteObject.createImmutable(false);__ref.setField("_annotating",pdfsecurity._annotating);
 //BA.debugLineNum = 9;BA.debugLine="Public fillingForms As Boolean";
pdfsecurity._fillingforms = RemoteObject.createImmutable(false);__ref.setField("_fillingforms",pdfsecurity._fillingforms);
 //BA.debugLineNum = 10;BA.debugLine="Public contentAccessibility As Boolean";
pdfsecurity._contentaccessibility = RemoteObject.createImmutable(false);__ref.setField("_contentaccessibility",pdfsecurity._contentaccessibility);
 //BA.debugLineNum = 11;BA.debugLine="Public documentAssembly As Boolean";
pdfsecurity._documentassembly = RemoteObject.createImmutable(false);__ref.setField("_documentassembly",pdfsecurity._documentassembly);
 //BA.debugLineNum = 12;BA.debugLine="Private permissions As Map";
pdfsecurity._permissions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_permissions",pdfsecurity._permissions);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdfsecurity) ","pdfsecurity",23,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdfsecurity","getcontent", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="If printingHR Then permissions.Put(\"printing\", \"h";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_printinghr" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("printing"))),(Object)((RemoteObject.createImmutable("highResolution"))));};
 BA.debugLineNum = 59;BA.debugLine="If printingLR Then permissions.Put(\"printing\", \"l";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_printinglr" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("printing"))),(Object)((RemoteObject.createImmutable("lowResolution"))));};
 BA.debugLineNum = 60;BA.debugLine="permissions.Put(\"modifying\", modifying)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("modifying"))),(Object)((__ref.getField(true,"_modifying" /*RemoteObject*/ ))));
 BA.debugLineNum = 61;BA.debugLine="permissions.Put(\"copying\", copying)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("copying"))),(Object)((__ref.getField(true,"_copying" /*RemoteObject*/ ))));
 BA.debugLineNum = 62;BA.debugLine="permissions.Put(\"annotating\", annotating)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("annotating"))),(Object)((__ref.getField(true,"_annotating" /*RemoteObject*/ ))));
 BA.debugLineNum = 63;BA.debugLine="permissions.Put(\"fillingForms\", fillingForms)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fillingForms"))),(Object)((__ref.getField(true,"_fillingforms" /*RemoteObject*/ ))));
 BA.debugLineNum = 64;BA.debugLine="permissions.Put(\"contentAccessibility\", contentAc";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("contentAccessibility"))),(Object)((__ref.getField(true,"_contentaccessibility" /*RemoteObject*/ ))));
 BA.debugLineNum = 65;BA.debugLine="permissions.Put(\"documentAssembly\", documentAssem";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("documentAssembly"))),(Object)((__ref.getField(true,"_documentassembly" /*RemoteObject*/ ))));
 BA.debugLineNum = 66;BA.debugLine="Return permissions";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_permissions" /*RemoteObject*/ );
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdfsecurity) ","pdfsecurity",23,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfsecurity","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 17;BA.debugLine="permissions.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_permissions" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="printingHR = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_printinghr" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"True"));
 BA.debugLineNum = 19;BA.debugLine="printingLR = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_printinglr" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"False"));
 BA.debugLineNum = 20;BA.debugLine="copying = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_copying" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"True"));
 BA.debugLineNum = 21;BA.debugLine="annotating = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_annotating" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"True"));
 BA.debugLineNum = 22;BA.debugLine="fillingForms = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fillingforms" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"True"));
 BA.debugLineNum = 23;BA.debugLine="contentAccessibility = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_contentaccessibility" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"True"));
 BA.debugLineNum = 24;BA.debugLine="documentAssembly = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_documentassembly" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"True"));
 BA.debugLineNum = 25;BA.debugLine="userPassword = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_userpassword" /*RemoteObject*/ ,BA.ObjectToString(pdfsecurity.__c.getField(false,"Null")));
 BA.debugLineNum = 26;BA.debugLine="ownerPassword = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ownerpassword" /*RemoteObject*/ ,BA.ObjectToString(pdfsecurity.__c.getField(false,"Null")));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _set(RemoteObject __ref,RemoteObject _fldname,RemoteObject _fldvalue) throws Exception{
try {
		Debug.PushSubsStack("Set (pdfsecurity) ","pdfsecurity",23,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("set")) { return __ref.runUserSub(false, "pdfsecurity","set", __ref, _fldname, _fldvalue);}
Debug.locals.put("fldName", _fldname);
Debug.locals.put("fldValue", _fldvalue);
 BA.debugLineNum = 29;BA.debugLine="Sub Set(fldName As String, fldValue As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="Select Case fldName";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fldname,BA.ObjectToString("ownerPassword"),BA.ObjectToString("userPassword"),BA.ObjectToString("modifying"),BA.ObjectToString("copying"),BA.ObjectToString("annotating"),BA.ObjectToString("fillingForms"),BA.ObjectToString("contentAccessibility"),BA.ObjectToString("documentAssembly"),BA.ObjectToString("userPassword"),BA.ObjectToString("ownerPassword"),BA.ObjectToString("printing"))) {
case 0: {
 BA.debugLineNum = 32;BA.debugLine="ownerPassword = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ownerpassword" /*RemoteObject*/ ,BA.ObjectToString(_fldvalue));
 break; }
case 1: {
 BA.debugLineNum = 34;BA.debugLine="userPassword = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_userpassword" /*RemoteObject*/ ,BA.ObjectToString(_fldvalue));
 break; }
case 2: {
 BA.debugLineNum = 36;BA.debugLine="modifying = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_modifying" /*RemoteObject*/ ,BA.ObjectToBoolean(_fldvalue));
 break; }
case 3: {
 BA.debugLineNum = 38;BA.debugLine="copying = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_copying" /*RemoteObject*/ ,BA.ObjectToBoolean(_fldvalue));
 break; }
case 4: {
 BA.debugLineNum = 40;BA.debugLine="annotating = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_annotating" /*RemoteObject*/ ,BA.ObjectToBoolean(_fldvalue));
 break; }
case 5: {
 BA.debugLineNum = 42;BA.debugLine="fillingForms = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fillingforms" /*RemoteObject*/ ,BA.ObjectToBoolean(_fldvalue));
 break; }
case 6: {
 BA.debugLineNum = 44;BA.debugLine="contentAccessibility = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_contentaccessibility" /*RemoteObject*/ ,BA.ObjectToBoolean(_fldvalue));
 break; }
case 7: {
 BA.debugLineNum = 46;BA.debugLine="documentAssembly = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_documentassembly" /*RemoteObject*/ ,BA.ObjectToBoolean(_fldvalue));
 break; }
case 8: {
 BA.debugLineNum = 48;BA.debugLine="userPassword = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_userpassword" /*RemoteObject*/ ,BA.ObjectToString(_fldvalue));
 break; }
case 9: {
 BA.debugLineNum = 50;BA.debugLine="ownerPassword = fldValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ownerpassword" /*RemoteObject*/ ,BA.ObjectToString(_fldvalue));
 break; }
case 10: {
 BA.debugLineNum = 52;BA.debugLine="If fldValue = \"highResolution\" Then printingHR =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_fldvalue,RemoteObject.createImmutable(("highResolution")))) { 
__ref.setField ("_printinghr" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"True"));};
 BA.debugLineNum = 53;BA.debugLine="If fldValue = \"lowResolution\" Then printingLR =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_fldvalue,RemoteObject.createImmutable(("lowResolution")))) { 
__ref.setField ("_printinglr" /*RemoteObject*/ ,pdfsecurity.__c.getField(true,"True"));};
 break; }
}
;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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