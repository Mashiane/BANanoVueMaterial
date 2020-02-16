package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfsecurity extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfsecurity", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfsecurity.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _userpassword = "";
public String _ownerpassword = "";
public boolean _printinghr = false;
public boolean _printinglr = false;
public boolean _modifying = false;
public boolean _copying = false;
public boolean _annotating = false;
public boolean _fillingforms = false;
public boolean _contentaccessibility = false;
public boolean _documentassembly = false;
public anywheresoftware.b4a.objects.collections.Map _permissions = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdfsecurity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfsecurity";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=56950784;
 //BA.debugLineNum = 56950784;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=56950785;
 //BA.debugLineNum = 56950785;BA.debugLine="If printingHR Then permissions.Put(\"printing\", \"h";
if (__ref._printinghr /*boolean*/ ) { 
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("printing"),(Object)("highResolution"));};
RDebugUtils.currentLine=56950786;
 //BA.debugLineNum = 56950786;BA.debugLine="If printingLR Then permissions.Put(\"printing\", \"l";
if (__ref._printinglr /*boolean*/ ) { 
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("printing"),(Object)("lowResolution"));};
RDebugUtils.currentLine=56950787;
 //BA.debugLineNum = 56950787;BA.debugLine="permissions.Put(\"modifying\", modifying)";
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("modifying"),(Object)(__ref._modifying /*boolean*/ ));
RDebugUtils.currentLine=56950788;
 //BA.debugLineNum = 56950788;BA.debugLine="permissions.Put(\"copying\", copying)";
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("copying"),(Object)(__ref._copying /*boolean*/ ));
RDebugUtils.currentLine=56950789;
 //BA.debugLineNum = 56950789;BA.debugLine="permissions.Put(\"annotating\", annotating)";
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("annotating"),(Object)(__ref._annotating /*boolean*/ ));
RDebugUtils.currentLine=56950790;
 //BA.debugLineNum = 56950790;BA.debugLine="permissions.Put(\"fillingForms\", fillingForms)";
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("fillingForms"),(Object)(__ref._fillingforms /*boolean*/ ));
RDebugUtils.currentLine=56950791;
 //BA.debugLineNum = 56950791;BA.debugLine="permissions.Put(\"contentAccessibility\", contentAc";
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("contentAccessibility"),(Object)(__ref._contentaccessibility /*boolean*/ ));
RDebugUtils.currentLine=56950792;
 //BA.debugLineNum = 56950792;BA.debugLine="permissions.Put(\"documentAssembly\", documentAssem";
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("documentAssembly"),(Object)(__ref._documentassembly /*boolean*/ ));
RDebugUtils.currentLine=56950793;
 //BA.debugLineNum = 56950793;BA.debugLine="Return permissions";
if (true) return __ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=56950794;
 //BA.debugLineNum = 56950794;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.pdfsecurity __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfsecurity";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="permissions.Initialize";
__ref._permissions /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=56819714;
 //BA.debugLineNum = 56819714;BA.debugLine="printingHR = True";
__ref._printinghr /*boolean*/  = __c.True;
RDebugUtils.currentLine=56819715;
 //BA.debugLineNum = 56819715;BA.debugLine="printingLR = False";
__ref._printinglr /*boolean*/  = __c.False;
RDebugUtils.currentLine=56819716;
 //BA.debugLineNum = 56819716;BA.debugLine="copying = True";
__ref._copying /*boolean*/  = __c.True;
RDebugUtils.currentLine=56819717;
 //BA.debugLineNum = 56819717;BA.debugLine="annotating = True";
__ref._annotating /*boolean*/  = __c.True;
RDebugUtils.currentLine=56819718;
 //BA.debugLineNum = 56819718;BA.debugLine="fillingForms = True";
__ref._fillingforms /*boolean*/  = __c.True;
RDebugUtils.currentLine=56819719;
 //BA.debugLineNum = 56819719;BA.debugLine="contentAccessibility = True";
__ref._contentaccessibility /*boolean*/  = __c.True;
RDebugUtils.currentLine=56819720;
 //BA.debugLineNum = 56819720;BA.debugLine="documentAssembly = True";
__ref._documentassembly /*boolean*/  = __c.True;
RDebugUtils.currentLine=56819721;
 //BA.debugLineNum = 56819721;BA.debugLine="userPassword = Null";
__ref._userpassword /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=56819722;
 //BA.debugLineNum = 56819722;BA.debugLine="ownerPassword = Null";
__ref._ownerpassword /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=56819723;
 //BA.debugLineNum = 56819723;BA.debugLine="End Sub";
return "";
}
public String  _set(b4j.example.pdfsecurity __ref,String _fldname,Object _fldvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfsecurity";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_fldname,_fldvalue}));}
RDebugUtils.currentLine=56885248;
 //BA.debugLineNum = 56885248;BA.debugLine="Sub Set(fldName As String, fldValue As Object)";
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="Select Case fldName";
switch (BA.switchObjectToInt(_fldname,"ownerPassword","userPassword","modifying","copying","annotating","fillingForms","contentAccessibility","documentAssembly","userPassword","ownerPassword","printing")) {
case 0: {
RDebugUtils.currentLine=56885251;
 //BA.debugLineNum = 56885251;BA.debugLine="ownerPassword = fldValue";
__ref._ownerpassword /*String*/  = BA.ObjectToString(_fldvalue);
 break; }
case 1: {
RDebugUtils.currentLine=56885253;
 //BA.debugLineNum = 56885253;BA.debugLine="userPassword = fldValue";
__ref._userpassword /*String*/  = BA.ObjectToString(_fldvalue);
 break; }
case 2: {
RDebugUtils.currentLine=56885255;
 //BA.debugLineNum = 56885255;BA.debugLine="modifying = fldValue";
__ref._modifying /*boolean*/  = BA.ObjectToBoolean(_fldvalue);
 break; }
case 3: {
RDebugUtils.currentLine=56885257;
 //BA.debugLineNum = 56885257;BA.debugLine="copying = fldValue";
__ref._copying /*boolean*/  = BA.ObjectToBoolean(_fldvalue);
 break; }
case 4: {
RDebugUtils.currentLine=56885259;
 //BA.debugLineNum = 56885259;BA.debugLine="annotating = fldValue";
__ref._annotating /*boolean*/  = BA.ObjectToBoolean(_fldvalue);
 break; }
case 5: {
RDebugUtils.currentLine=56885261;
 //BA.debugLineNum = 56885261;BA.debugLine="fillingForms = fldValue";
__ref._fillingforms /*boolean*/  = BA.ObjectToBoolean(_fldvalue);
 break; }
case 6: {
RDebugUtils.currentLine=56885263;
 //BA.debugLineNum = 56885263;BA.debugLine="contentAccessibility = fldValue";
__ref._contentaccessibility /*boolean*/  = BA.ObjectToBoolean(_fldvalue);
 break; }
case 7: {
RDebugUtils.currentLine=56885265;
 //BA.debugLineNum = 56885265;BA.debugLine="documentAssembly = fldValue";
__ref._documentassembly /*boolean*/  = BA.ObjectToBoolean(_fldvalue);
 break; }
case 8: {
RDebugUtils.currentLine=56885267;
 //BA.debugLineNum = 56885267;BA.debugLine="userPassword = fldValue";
__ref._userpassword /*String*/  = BA.ObjectToString(_fldvalue);
 break; }
case 9: {
RDebugUtils.currentLine=56885269;
 //BA.debugLineNum = 56885269;BA.debugLine="ownerPassword = fldValue";
__ref._ownerpassword /*String*/  = BA.ObjectToString(_fldvalue);
 break; }
case 10: {
RDebugUtils.currentLine=56885271;
 //BA.debugLineNum = 56885271;BA.debugLine="If fldValue = \"highResolution\" Then printingHR =";
if ((_fldvalue).equals((Object)("highResolution"))) { 
__ref._printinghr /*boolean*/  = __c.True;};
RDebugUtils.currentLine=56885272;
 //BA.debugLineNum = 56885272;BA.debugLine="If fldValue = \"lowResolution\" Then printingLR =";
if ((_fldvalue).equals((Object)("lowResolution"))) { 
__ref._printinglr /*boolean*/  = __c.True;};
 break; }
}
;
RDebugUtils.currentLine=56885274;
 //BA.debugLineNum = 56885274;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.pdfsecurity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfsecurity";
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="Public userPassword As String";
_userpassword = "";
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="Public ownerPassword As String";
_ownerpassword = "";
RDebugUtils.currentLine=56754179;
 //BA.debugLineNum = 56754179;BA.debugLine="Public printingHR As Boolean";
_printinghr = false;
RDebugUtils.currentLine=56754180;
 //BA.debugLineNum = 56754180;BA.debugLine="Public printingLR As Boolean";
_printinglr = false;
RDebugUtils.currentLine=56754181;
 //BA.debugLineNum = 56754181;BA.debugLine="Public modifying As Boolean";
_modifying = false;
RDebugUtils.currentLine=56754182;
 //BA.debugLineNum = 56754182;BA.debugLine="Public copying As Boolean";
_copying = false;
RDebugUtils.currentLine=56754183;
 //BA.debugLineNum = 56754183;BA.debugLine="Public annotating As Boolean";
_annotating = false;
RDebugUtils.currentLine=56754184;
 //BA.debugLineNum = 56754184;BA.debugLine="Public fillingForms As Boolean";
_fillingforms = false;
RDebugUtils.currentLine=56754185;
 //BA.debugLineNum = 56754185;BA.debugLine="Public contentAccessibility As Boolean";
_contentaccessibility = false;
RDebugUtils.currentLine=56754186;
 //BA.debugLineNum = 56754186;BA.debugLine="Public documentAssembly As Boolean";
_documentassembly = false;
RDebugUtils.currentLine=56754187;
 //BA.debugLineNum = 56754187;BA.debugLine="Private permissions As Map";
_permissions = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56754188;
 //BA.debugLineNum = 56754188;BA.debugLine="End Sub";
return "";
}
}