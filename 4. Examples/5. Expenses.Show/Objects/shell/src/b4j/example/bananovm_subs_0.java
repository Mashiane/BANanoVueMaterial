package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bananovm_subs_0 {


public static RemoteObject  _addalert(RemoteObject __ref,RemoteObject _alertid,RemoteObject _eventhandler,RemoteObject _title,RemoteObject _alertcontent,RemoteObject _confirmtext) throws Exception{
try {
		Debug.PushSubsStack("AddAlert (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1312);
if (RapidSub.canDelegate("addalert")) { return __ref.runUserSub(false, "bananovm","addalert", __ref, _alertid, _eventhandler, _title, _alertcontent, _confirmtext);}
RemoteObject _myalert = RemoteObject.declareNull("b4j.example.vmalert");
Debug.locals.put("alertid", _alertid);
Debug.locals.put("eventHandler", _eventhandler);
Debug.locals.put("title", _title);
Debug.locals.put("AlertContent", _alertcontent);
Debug.locals.put("ConfirmText", _confirmtext);
 BA.debugLineNum = 1312;BA.debugLine="Sub AddAlert(alertid As String, eventHandler As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1313;BA.debugLine="Dim myalert As VMAlert = CreateAlert(alertid,even";
Debug.JustUpdateDeviceLine();
_myalert = __ref.runClassMethod (b4j.example.bananovm.class, "_createalert" /*RemoteObject*/ ,(Object)(_alertid),(Object)(_eventhandler)).runClassMethod (b4j.example.vmalert.class, "_setstatic" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True"))).runClassMethod (b4j.example.vmalert.class, "_settitle" /*RemoteObject*/ ,(Object)(_title)).runClassMethod (b4j.example.vmalert.class, "_setconfirmtext" /*RemoteObject*/ ,(Object)(_confirmtext)).runClassMethod (b4j.example.vmalert.class, "_setcontent" /*RemoteObject*/ ,(Object)(_alertcontent));Debug.locals.put("myalert", _myalert);Debug.locals.put("myalert", _myalert);
 BA.debugLineNum = 1314;BA.debugLine="myalert.Pop(Content)";
Debug.JustUpdateDeviceLine();
_myalert.runClassMethod (b4j.example.vmalert.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 1315;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcomponent(RemoteObject __ref,RemoteObject _comp) throws Exception{
try {
		Debug.PushSubsStack("AddComponent (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,437);
if (RapidSub.canDelegate("addcomponent")) { return __ref.runUserSub(false, "bananovm","addcomponent", __ref, _comp);}
Debug.locals.put("comp", _comp);
 BA.debugLineNum = 437;BA.debugLine="Sub AddComponent(comp As VueComponent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 438;BA.debugLine="Vue.AddComponent(comp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_comp));
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addconfirm(RemoteObject __ref,RemoteObject _confirmid,RemoteObject _eventhandler,RemoteObject _title,RemoteObject _confirmcontent,RemoteObject _confirmtext,RemoteObject _canceltext) throws Exception{
try {
		Debug.PushSubsStack("AddConfirm (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1318);
if (RapidSub.canDelegate("addconfirm")) { return __ref.runUserSub(false, "bananovm","addconfirm", __ref, _confirmid, _eventhandler, _title, _confirmcontent, _confirmtext, _canceltext);}
RemoteObject _myalert = RemoteObject.declareNull("b4j.example.vmconfirm");
Debug.locals.put("confirmid", _confirmid);
Debug.locals.put("eventHandler", _eventhandler);
Debug.locals.put("title", _title);
Debug.locals.put("ConfirmContent", _confirmcontent);
Debug.locals.put("ConfirmText", _confirmtext);
Debug.locals.put("CancelText", _canceltext);
 BA.debugLineNum = 1318;BA.debugLine="Sub AddConfirm(confirmid As String, eventHandler A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1319;BA.debugLine="Dim myalert As VMConfirm = CreateConfirm(confirmi";
Debug.JustUpdateDeviceLine();
_myalert = __ref.runClassMethod (b4j.example.bananovm.class, "_createconfirm" /*RemoteObject*/ ,(Object)(_confirmid),(Object)(_eventhandler)).runClassMethod (b4j.example.vmconfirm.class, "_setstatic" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True"))).runClassMethod (b4j.example.vmconfirm.class, "_settitle" /*RemoteObject*/ ,(Object)(_title)).runClassMethod (b4j.example.vmconfirm.class, "_setconfirmtext" /*RemoteObject*/ ,(Object)(_confirmtext)).runClassMethod (b4j.example.vmconfirm.class, "_setcontent" /*RemoteObject*/ ,(Object)(_confirmcontent)).runClassMethod (b4j.example.vmconfirm.class, "_setcanceltext" /*RemoteObject*/ ,(Object)(_canceltext));Debug.locals.put("myalert", _myalert);Debug.locals.put("myalert", _myalert);
 BA.debugLineNum = 1320;BA.debugLine="myalert.Pop(Content)";
Debug.JustUpdateDeviceLine();
_myalert.runClassMethod (b4j.example.vmconfirm.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 1321;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontainer(RemoteObject __ref,RemoteObject _cont) throws Exception{
try {
		Debug.PushSubsStack("AddContainer (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("addcontainer")) { return __ref.runUserSub(false, "bananovm","addcontainer", __ref, _cont);}
Debug.locals.put("cont", _cont);
 BA.debugLineNum = 57;BA.debugLine="Sub AddContainer(cont As VMContainer)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Content.SetText(cont.tostring)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_cont.runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontainerrc(RemoteObject __ref,RemoteObject _row,RemoteObject _col,RemoteObject _cont) throws Exception{
try {
		Debug.PushSubsStack("AddContainerRC (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("addcontainerrc")) { return __ref.runUserSub(false, "bananovm","addcontainerrc", __ref, _row, _col, _cont);}
Debug.locals.put("row", _row);
Debug.locals.put("col", _col);
Debug.locals.put("cont", _cont);
 BA.debugLineNum = 62;BA.debugLine="Sub AddContainerRC(row As Int, col As Int, cont As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="Container.AddComponent(row, col, cont.ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_row),(Object)(_col),(Object)(_cont.runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontent(RemoteObject __ref,RemoteObject _els) throws Exception{
try {
		Debug.PushSubsStack("AddContent (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1496);
if (RapidSub.canDelegate("addcontent")) { return __ref.runUserSub(false, "bananovm","addcontent", __ref, _els);}
Debug.locals.put("els", _els);
 BA.debugLineNum = 1496;BA.debugLine="Sub AddContent(els As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1497;BA.debugLine="Vue.SetTemplate(els)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(_els));
 BA.debugLineNum = 1498;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddialog(RemoteObject __ref,RemoteObject _diag) throws Exception{
try {
		Debug.PushSubsStack("AddDialog (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("adddialog")) { return __ref.runUserSub(false, "bananovm","adddialog", __ref, _diag);}
Debug.locals.put("diag", _diag);
 BA.debugLineNum = 123;BA.debugLine="Sub AddDialog(diag As VMDialog)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="diag.Pop(Content)";
Debug.JustUpdateDeviceLine();
_diag.runClassMethod (b4j.example.vmdialog.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addelement(RemoteObject __ref,RemoteObject _elm) throws Exception{
try {
		Debug.PushSubsStack("AddElement (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("addelement")) { return __ref.runUserSub(false, "bananovm","addelement", __ref, _elm);}
Debug.locals.put("elm", _elm);
 BA.debugLineNum = 442;BA.debugLine="Sub AddElement(elm As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 443;BA.debugLine="elm.Pop(Content)";
Debug.JustUpdateDeviceLine();
_elm.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
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
public static RemoteObject  _addgrid(RemoteObject __ref,RemoteObject _grd) throws Exception{
try {
		Debug.PushSubsStack("AddGrid (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("addgrid")) { return __ref.runUserSub(false, "bananovm","addgrid", __ref, _grd);}
Debug.locals.put("grd", _grd);
 BA.debugLineNum = 67;BA.debugLine="Sub AddGrid(grd As VMGrid)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="grd.Pop(Content)";
Debug.JustUpdateDeviceLine();
_grd.runClassMethod (b4j.example.vmgrid.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addhtml(RemoteObject __ref,RemoteObject _htmlcontent) throws Exception{
try {
		Debug.PushSubsStack("AddHTML (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("addhtml")) { return __ref.runUserSub(false, "bananovm","addhtml", __ref, _htmlcontent);}
Debug.locals.put("htmlContent", _htmlcontent);
 BA.debugLineNum = 446;BA.debugLine="Sub AddHTML(htmlContent As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 447;BA.debugLine="Content.SetText(htmlContent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_htmlcontent));
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpage(RemoteObject __ref,RemoteObject _name,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("AddPage (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1198);
if (RapidSub.canDelegate("addpage")) { return __ref.runUserSub(false, "bananovm","addpage", __ref, _name, _module);}
Debug.locals.put("name", _name);
Debug.locals.put("module", _module);
 BA.debugLineNum = 1198;BA.debugLine="Sub AddPage(name As String, module As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1199;BA.debugLine="Pages.add(name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pages" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_name)));
 BA.debugLineNum = 1200;BA.debugLine="BANano.CallSub(module, \"Code\", Array(Me))   'igno";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(_module),(Object)(BA.ObjectToString("Code")),(Object)(bananovm.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref})))));
 BA.debugLineNum = 1201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addprompt(RemoteObject __ref,RemoteObject _promptid,RemoteObject _eventhandler,RemoteObject _title,RemoteObject _message,RemoteObject _placeholder,RemoteObject _maxlen,RemoteObject _confirmtext,RemoteObject _canceltext) throws Exception{
try {
		Debug.PushSubsStack("AddPrompt (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1324);
if (RapidSub.canDelegate("addprompt")) { return __ref.runUserSub(false, "bananovm","addprompt", __ref, _promptid, _eventhandler, _title, _message, _placeholder, _maxlen, _confirmtext, _canceltext);}
RemoteObject _myprompt = RemoteObject.declareNull("b4j.example.vmprompt");
Debug.locals.put("promptid", _promptid);
Debug.locals.put("eventHandler", _eventhandler);
Debug.locals.put("title", _title);
Debug.locals.put("Message", _message);
Debug.locals.put("placeHolder", _placeholder);
Debug.locals.put("maxLen", _maxlen);
Debug.locals.put("ConfirmText", _confirmtext);
Debug.locals.put("CancelText", _canceltext);
 BA.debugLineNum = 1324;BA.debugLine="Sub AddPrompt(promptid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1325;BA.debugLine="Vue.SetStateSingle(promptid, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_promptid),(Object)(bananovm.__c.getField(false,"Null")));
 BA.debugLineNum = 1326;BA.debugLine="Dim myprompt As VMPrompt = CreatePrompt(promptid,";
Debug.JustUpdateDeviceLine();
_myprompt = __ref.runClassMethod (b4j.example.bananovm.class, "_createprompt" /*RemoteObject*/ ,(Object)(_promptid),(Object)(_eventhandler)).runClassMethod (b4j.example.vmprompt.class, "_setstatic" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True"))).runClassMethod (b4j.example.vmprompt.class, "_settitle" /*RemoteObject*/ ,(Object)(_title)).runClassMethod (b4j.example.vmprompt.class, "_setcontent" /*RemoteObject*/ ,(Object)(_message)).runClassMethod (b4j.example.vmprompt.class, "_setmaxlength" /*RemoteObject*/ ,(Object)(_maxlen)).runClassMethod (b4j.example.vmprompt.class, "_setplaceholder" /*RemoteObject*/ ,(Object)(_placeholder));Debug.locals.put("myprompt", _myprompt);Debug.locals.put("myprompt", _myprompt);
 BA.debugLineNum = 1327;BA.debugLine="myprompt.SetConfirmText(ConfirmText).SetCancelTex";
Debug.JustUpdateDeviceLine();
_myprompt.runClassMethod (b4j.example.vmprompt.class, "_setconfirmtext" /*RemoteObject*/ ,(Object)(_confirmtext)).runClassMethod (b4j.example.vmprompt.class, "_setcanceltext" /*RemoteObject*/ ,(Object)(_canceltext));
 BA.debugLineNum = 1328;BA.debugLine="myprompt.Pop(Content)";
Debug.JustUpdateDeviceLine();
_myprompt.runClassMethod (b4j.example.vmprompt.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 1329;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addroute(RemoteObject __ref,RemoteObject _path,RemoteObject _comp) throws Exception{
try {
		Debug.PushSubsStack("AddRoute (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("addroute")) { return __ref.runUserSub(false, "bananovm","addroute", __ref, _path, _comp);}
Debug.locals.put("path", _path);
Debug.locals.put("comp", _comp);
 BA.debugLineNum = 470;BA.debugLine="Sub AddRoute(path As String, comp As VueComponent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 471;BA.debugLine="Vue.AddRoute(path, comp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_addroute" /*RemoteObject*/ ,(Object)(_path),(Object)(_comp));
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
public static RemoteObject  _addsnackbar(RemoteObject __ref,RemoteObject _snackbar) throws Exception{
try {
		Debug.PushSubsStack("AddSnackBar (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("addsnackbar")) { return __ref.runUserSub(false, "bananovm","addsnackbar", __ref, _snackbar);}
Debug.locals.put("SnackBar", _snackbar);
 BA.debugLineNum = 128;BA.debugLine="Sub AddSnackBar(SnackBar As VMSnackbar)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="SnackBar.Pop(Content)";
Debug.JustUpdateDeviceLine();
_snackbar.runClassMethod (b4j.example.vmsnackbar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addspeeddial(RemoteObject __ref,RemoteObject _speed) throws Exception{
try {
		Debug.PushSubsStack("AddSpeedDial (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("addspeeddial")) { return __ref.runUserSub(false, "bananovm","addspeeddial", __ref, _speed);}
Debug.locals.put("speed", _speed);
 BA.debugLineNum = 133;BA.debugLine="Sub AddSpeedDial(speed As VMSpeedDial)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="speed.Pop(Content)";
Debug.JustUpdateDeviceLine();
_speed.runClassMethod (b4j.example.vmspeeddial.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtheme(RemoteObject __ref,RemoteObject _themename,RemoteObject _forecolor,RemoteObject _forecolorintensity,RemoteObject _backcolor,RemoteObject _backcolorintensity) throws Exception{
try {
		Debug.PushSubsStack("AddTheme (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1346);
if (RapidSub.canDelegate("addtheme")) { return __ref.runUserSub(false, "bananovm","addtheme", __ref, _themename, _forecolor, _forecolorintensity, _backcolor, _backcolorintensity);}
RemoteObject _fc = RemoteObject.createImmutable("");
RemoteObject _bc = RemoteObject.createImmutable("");
RemoteObject _theme = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("themeName", _themename);
Debug.locals.put("ForeColor", _forecolor);
Debug.locals.put("ForeColorIntensity", _forecolorintensity);
Debug.locals.put("BackColor", _backcolor);
Debug.locals.put("BackColorIntensity", _backcolorintensity);
 BA.debugLineNum = 1346;BA.debugLine="Sub AddTheme(themeName As String, ForeColor As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1347;BA.debugLine="themeName = themeName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_themename = _themename.runMethod(true,"toLowerCase");Debug.locals.put("themeName", _themename);
 BA.debugLineNum = 1348;BA.debugLine="Dim fc As String = $\"${ForeColor} ${ForeColorInte";
Debug.JustUpdateDeviceLine();
_fc = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_forecolor))),RemoteObject.createImmutable(" "),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_forecolorintensity))),RemoteObject.createImmutable("")));Debug.locals.put("fc", _fc);Debug.locals.put("fc", _fc);
 BA.debugLineNum = 1349;BA.debugLine="Dim bc As String = $\"${BackColor} ${BackColorInte";
Debug.JustUpdateDeviceLine();
_bc = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_backcolor))),RemoteObject.createImmutable(" "),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_backcolorintensity))),RemoteObject.createImmutable("")));Debug.locals.put("bc", _bc);Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1351;BA.debugLine="fc = fc.Trim";
Debug.JustUpdateDeviceLine();
_fc = _fc.runMethod(true,"trim");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 1352;BA.debugLine="bc = bc.trim";
Debug.JustUpdateDeviceLine();
_bc = _bc.runMethod(true,"trim");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1354;BA.debugLine="Dim theme As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_theme = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_theme = bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("theme", _theme);Debug.locals.put("theme", _theme);
 BA.debugLineNum = 1355;BA.debugLine="theme.Put(\"fc\", fc)";
Debug.JustUpdateDeviceLine();
_theme.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fc"))),(Object)((_fc)));
 BA.debugLineNum = 1356;BA.debugLine="theme.Put(\"bc\", bc)";
Debug.JustUpdateDeviceLine();
_theme.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bc"))),(Object)((_bc)));
 BA.debugLineNum = 1357;BA.debugLine="Themes.Put(themeName, theme)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_themes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_themename)),(Object)((_theme.getObject())));
 BA.debugLineNum = 1358;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Age (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("age")) { return __ref.runUserSub(false, "bananovm","age", __ref, _birthday);}
Debug.locals.put("birthDay", _birthday);
 BA.debugLineNum = 202;BA.debugLine="Sub Age(birthDay As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="Return Vue.Age(birthDay)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_age" /*RemoteObject*/ ,(Object)(_birthday));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audittrail(RemoteObject __ref,RemoteObject _oldm,RemoteObject _newm) throws Exception{
try {
		Debug.PushSubsStack("AuditTrail (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,808);
if (RapidSub.canDelegate("audittrail")) { return __ref.runUserSub(false, "bananovm","audittrail", __ref, _oldm, _newm);}
Debug.locals.put("oldM", _oldm);
Debug.locals.put("newM", _newm);
 BA.debugLineNum = 808;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 809;BA.debugLine="Return Vue.AuditTrail(oldM, newM)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_audittrail" /*RemoteObject*/ ,(Object)(_oldm),(Object)(_newm));
 BA.debugLineNum = 810;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("BR (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,536);
if (RapidSub.canDelegate("br")) { return __ref.runUserSub(false, "bananovm","br", __ref);}
 BA.debugLineNum = 536;BA.debugLine="Sub BR As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 537;BA.debugLine="Return \"<br>\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("<br>");
 BA.debugLineNum = 538;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CallComputed (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,773);
if (RapidSub.canDelegate("callcomputed")) { return __ref.runUserSub(false, "bananovm","callcomputed", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 773;BA.debugLine="Sub CallComputed(methodName As String) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 774;BA.debugLine="Return Vue.CallComputed(methodName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_callcomputed" /*RemoteObject*/ ,(Object)(_methodname));
 BA.debugLineNum = 775;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CallMethod (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,769);
if (RapidSub.canDelegate("callmethod")) { return __ref.runUserSub(false, "bananovm","callmethod", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 769;BA.debugLine="Sub CallMethod(methodName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 770;BA.debugLine="Vue.CallMethod(methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_callmethod" /*RemoteObject*/ ,(Object)(_methodname));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano";
bananovm._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananovm._banano);
 //BA.debugLineNum = 4;BA.debugLine="Public Overlay As VMLoader";
bananovm._overlay = RemoteObject.createNew ("b4j.example.vmloader");__ref.setField("_overlay",bananovm._overlay);
 //BA.debugLineNum = 5;BA.debugLine="Private Themes As Map";
bananovm._themes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_themes",bananovm._themes);
 //BA.debugLineNum = 6;BA.debugLine="Public refs As Map";
bananovm._refs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_refs",bananovm._refs);
 //BA.debugLineNum = 7;BA.debugLine="Public data As Map";
bananovm._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_data",bananovm._data);
 //BA.debugLineNum = 8;BA.debugLine="Private Prompt As VMPrompt";
bananovm._prompt = RemoteObject.createNew ("b4j.example.vmprompt");__ref.setField("_prompt",bananovm._prompt);
 //BA.debugLineNum = 9;BA.debugLine="Public material As BANanoObject";
bananovm._material = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_material",bananovm._material);
 //BA.debugLineNum = 10;BA.debugLine="Public VueLoading As BANanoObject";
bananovm._vueloading = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_vueloading",bananovm._vueloading);
 //BA.debugLineNum = 11;BA.debugLine="Public VueCal As BANanoObject";
bananovm._vuecal = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_vuecal",bananovm._vuecal);
 //BA.debugLineNum = 12;BA.debugLine="Public VueBO As BANanoObject";
bananovm._vuebo = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_vuebo",bananovm._vuebo);
 //BA.debugLineNum = 13;BA.debugLine="Public JQuery As BANanoObject";
bananovm._jquery = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_jquery",bananovm._jquery);
 //BA.debugLineNum = 14;BA.debugLine="Private BANano As BANano   'ignore";
bananovm._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananovm._banano);
 //BA.debugLineNum = 15;BA.debugLine="Public VM As BANanoObject";
bananovm._vm = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_vm",bananovm._vm);
 //BA.debugLineNum = 16;BA.debugLine="Public Vue As BANanoVue";
bananovm._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",bananovm._vue);
 //BA.debugLineNum = 17;BA.debugLine="Public VMDef As BANanoObject";
bananovm._vmdef = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_vmdef",bananovm._vmdef);
 //BA.debugLineNum = 18;BA.debugLine="Public Content As VMElement";
bananovm._content = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_content",bananovm._content);
 //BA.debugLineNum = 19;BA.debugLine="Public NavBar As VMToolBar";
bananovm._navbar = RemoteObject.createNew ("b4j.example.vmtoolbar");__ref.setField("_navbar",bananovm._navbar);
 //BA.debugLineNum = 20;BA.debugLine="Public Drawer As VMDrawer";
bananovm._drawer = RemoteObject.createNew ("b4j.example.vmdrawer");__ref.setField("_drawer",bananovm._drawer);
 //BA.debugLineNum = 21;BA.debugLine="Public App As VMElement";
bananovm._app = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_app",bananovm._app);
 //BA.debugLineNum = 22;BA.debugLine="Private Alert As VMAlert";
bananovm._alert = RemoteObject.createNew ("b4j.example.vmalert");__ref.setField("_alert",bananovm._alert);
 //BA.debugLineNum = 23;BA.debugLine="Private Confirm As VMConfirm";
bananovm._confirm = RemoteObject.createNew ("b4j.example.vmconfirm");__ref.setField("_confirm",bananovm._confirm);
 //BA.debugLineNum = 24;BA.debugLine="Private Snack As VMSnackbar";
bananovm._snack = RemoteObject.createNew ("b4j.example.vmsnackbar");__ref.setField("_snack",bananovm._snack);
 //BA.debugLineNum = 25;BA.debugLine="Public ColorOptions As Map";
bananovm._coloroptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_coloroptions",bananovm._coloroptions);
 //BA.debugLineNum = 26;BA.debugLine="Public BorderOptions As Map";
bananovm._borderoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_borderoptions",bananovm._borderoptions);
 //BA.debugLineNum = 27;BA.debugLine="Public IntensityOptions As Map";
bananovm._intensityoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_intensityoptions",bananovm._intensityoptions);
 //BA.debugLineNum = 28;BA.debugLine="Private HasKnob As Boolean";
bananovm._hasknob = RemoteObject.createImmutable(false);__ref.setField("_hasknob",bananovm._hasknob);
 //BA.debugLineNum = 29;BA.debugLine="Private HasInfoBox As Boolean";
bananovm._hasinfobox = RemoteObject.createImmutable(false);__ref.setField("_hasinfobox",bananovm._hasinfobox);
 //BA.debugLineNum = 30;BA.debugLine="Public Elevation As Map";
bananovm._elevation = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_elevation",bananovm._elevation);
 //BA.debugLineNum = 31;BA.debugLine="Public Container As VMContainer";
bananovm._container = RemoteObject.createNew ("b4j.example.vmcontainer");__ref.setField("_container",bananovm._container);
 //BA.debugLineNum = 32;BA.debugLine="Public GetTemplate As String";
bananovm._gettemplate = RemoteObject.createImmutable("");__ref.setField("_gettemplate",bananovm._gettemplate);
 //BA.debugLineNum = 33;BA.debugLine="Private Pages As List";
bananovm._pages = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_pages",bananovm._pages);
 //BA.debugLineNum = 34;BA.debugLine="Private Chartkick As BANanoObject";
bananovm._chartkick = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_chartkick",bananovm._chartkick);
 //BA.debugLineNum = 35;BA.debugLine="Private Chart As BANanoObject";
bananovm._chart = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_chart",bananovm._chart);
 //BA.debugLineNum = 36;BA.debugLine="Private VueGoogleMaps As BANanoObject";
bananovm._vuegooglemaps = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_vuegooglemaps",bananovm._vuegooglemaps);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _compile(RemoteObject __ref,RemoteObject _html) throws Exception{
try {
		Debug.PushSubsStack("Compile (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1119);
if (RapidSub.canDelegate("compile")) { return __ref.runUserSub(false, "bananovm","compile", __ref, _html);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("html", _html);
 BA.debugLineNum = 1119;BA.debugLine="Sub Compile(html As String) As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1120;BA.debugLine="Dim bo As BANanoObject = Vue.Compile(html)";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_compile" /*RemoteObject*/ ,(Object)(_html));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 1121;BA.debugLine="Return bo";
Debug.JustUpdateDeviceLine();
if (true) return _bo;
 BA.debugLineNum = 1122;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CopyMap (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1061);
if (RapidSub.canDelegate("copymap")) { return __ref.runUserSub(false, "bananovm","copymap", __ref, _source, _keys);}
Debug.locals.put("source", _source);
Debug.locals.put("keys", _keys);
 BA.debugLineNum = 1061;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1062;BA.debugLine="Return Vue.CopyMap(source, keys)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_copymap" /*RemoteObject*/ ,(Object)(_source),(Object)(_keys));
 BA.debugLineNum = 1063;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Create (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1501);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "bananovm","create", __ref);}
 BA.debugLineNum = 1501;BA.debugLine="Sub Create";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1502;BA.debugLine="NavBar.Pop(App)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_app" /*RemoteObject*/ )));
 BA.debugLineNum = 1503;BA.debugLine="Drawer.Pop(App)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_app" /*RemoteObject*/ )));
 BA.debugLineNum = 1504;BA.debugLine="Content.Pop(App)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_app" /*RemoteObject*/ )));
 BA.debugLineNum = 1505;BA.debugLine="AddContent(App.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_addcontent" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _createa(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateA (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,967);
if (RapidSub.canDelegate("createa")) { return __ref.runUserSub(false, "bananovm","createa", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 967;BA.debugLine="Sub CreateA(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 968;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 969;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"a\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("a")));
 BA.debugLineNum = 970;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 971;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createalert(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateAlert (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1544);
if (RapidSub.canDelegate("createalert")) { return __ref.runUserSub(false, "bananovm","createalert", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmalert");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1544;BA.debugLine="Sub CreateAlert(sid As String, eventHandler As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1545;BA.debugLine="Dim el As VMAlert";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmalert");Debug.locals.put("el", _el);
 BA.debugLineNum = 1546;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmalert.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1547;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1548;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createapp(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateApp (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1658);
if (RapidSub.canDelegate("createapp")) { return __ref.runUserSub(false, "bananovm","createapp", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1658;BA.debugLine="Sub CreateApp(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1659;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1660;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"md-app\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-app")));
 BA.debugLineNum = 1661;BA.debugLine="el.SetStyle(CreateMap(\"height\":\"100vh\"))";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),(RemoteObject.createImmutable("100vh"))}))));
 BA.debugLineNum = 1662;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1663;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createappcontent(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateAppContent (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1605);
if (RapidSub.canDelegate("createappcontent")) { return __ref.runUserSub(false, "bananovm","createappcontent", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1605;BA.debugLine="Sub CreateAppContent(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1606;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1607;BA.debugLine="el.Initialize(Vue, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
 BA.debugLineNum = 1608;BA.debugLine="el.SetTag(\"md-app-content\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-app-content")));
 BA.debugLineNum = 1609;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1610;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createavatar(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateAvatar (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,522);
if (RapidSub.canDelegate("createavatar")) { return __ref.runUserSub(false, "bananovm","createavatar", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmavatar");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 522;BA.debugLine="Sub CreateAvatar(sid As String, module As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 523;BA.debugLine="Dim el As VMAvatar";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmavatar");Debug.locals.put("el", _el);
 BA.debugLineNum = 524;BA.debugLine="el.Initialize(Vue,sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmavatar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 525;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createbadge(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateBadge (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("createbadge")) { return __ref.runUserSub(false, "bananovm","createbadge", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmbadge");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 529;BA.debugLine="Sub CreateBadge(sid As String) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 530;BA.debugLine="Dim el As VMBadge";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmbadge");Debug.locals.put("el", _el);
 BA.debugLineNum = 531;BA.debugLine="el.Initialize(Vue, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmbadge.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
 BA.debugLineNum = 532;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createbody1(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateBody1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,961);
if (RapidSub.canDelegate("createbody1")) { return __ref.runUserSub(false, "bananovm","createbody1", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 961;BA.debugLine="Sub CreateBody1(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 962;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 963;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetBody1(T";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setbody1" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 964;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 965;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbody2(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateBody2 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,973);
if (RapidSub.canDelegate("createbody2")) { return __ref.runUserSub(false, "bananovm","createbody2", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 973;BA.debugLine="Sub CreateBody2(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 974;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 975;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetBody2(T";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setbody2" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 976;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 977;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbottombaritem(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateBottomBarItem (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,849);
if (RapidSub.canDelegate("createbottombaritem")) { return __ref.runUserSub(false, "bananovm","createbottombaritem", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmbottombaritem");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 849;BA.debugLine="Sub CreateBottomBarItem(sid As String, eventHandle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 850;BA.debugLine="Dim el As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmbottombaritem");Debug.locals.put("el", _el);
 BA.debugLineNum = 851;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmbottombaritem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 852;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createbuttombar(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateButtomBar (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,855);
if (RapidSub.canDelegate("createbuttombar")) { return __ref.runUserSub(false, "bananovm","createbuttombar", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmbottombar");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 855;BA.debugLine="Sub CreateButtomBar(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 856;BA.debugLine="Dim el As VMBottomBar";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmbottombar");Debug.locals.put("el", _el);
 BA.debugLineNum = 857;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmbottombar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 858;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createbutton(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateButton (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1624);
if (RapidSub.canDelegate("createbutton")) { return __ref.runUserSub(false, "bananovm","createbutton", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 1624;BA.debugLine="Sub CreateButton(sid As String,module As Object) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1625;BA.debugLine="Dim el As VMButton";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("el", _el);
 BA.debugLineNum = 1626;BA.debugLine="el.Initialize(Vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 1627;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1628;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateBUTTON1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,635);
if (RapidSub.canDelegate("createbutton1")) { return __ref.runUserSub(false, "bananovm","createbutton1", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 635;BA.debugLine="Sub CreateBUTTON1(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 636;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 637;BA.debugLine="el.Initialize(Vue, id).SetTag(\"button\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("button")));
 BA.debugLineNum = 638;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 639;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcaption(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateCaption (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,955);
if (RapidSub.canDelegate("createcaption")) { return __ref.runUserSub(false, "bananovm","createcaption", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 955;BA.debugLine="Sub CreateCaption(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 956;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 957;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").AddClass(\"";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-caption")));
 BA.debugLineNum = 958;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 959;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchartkick(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateChartKick (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("createchartkick")) { return __ref.runUserSub(false, "bananovm","createchartkick", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmchartkick");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 84;BA.debugLine="Sub CreateChartKick(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="Dim el As VMChartKick";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmchartkick");Debug.locals.put("el", _el);
 BA.debugLineNum = 86;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmchartkick.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 87;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createcheckbox(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateCheckBox (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,885);
if (RapidSub.canDelegate("createcheckbox")) { return __ref.runUserSub(false, "bananovm","createcheckbox", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcheckbox");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 885;BA.debugLine="Sub CreateCheckBox(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 886;BA.debugLine="Dim el As VMCheckBox";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcheckbox");Debug.locals.put("el", _el);
 BA.debugLineNum = 887;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 888;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createcheckboxgroup(RemoteObject __ref,RemoteObject _sid,RemoteObject _scaption,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateCheckBoxGroup (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1636);
if (RapidSub.canDelegate("createcheckboxgroup")) { return __ref.runUserSub(false, "bananovm","createcheckboxgroup", __ref, _sid, _scaption, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcheckboxgroup");
Debug.locals.put("sid", _sid);
Debug.locals.put("sCaption", _scaption);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1636;BA.debugLine="Sub CreateCheckBoxGroup(sid As String, sCaption As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1637;BA.debugLine="Dim el As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcheckboxgroup");Debug.locals.put("el", _el);
 BA.debugLineNum = 1638;BA.debugLine="el.Initialize(Vue, sid, sCaption, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckboxgroup.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_scaption),(Object)(_eventhandler));
 BA.debugLineNum = 1639;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1640;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchip(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateChip (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1432);
if (RapidSub.canDelegate("createchip")) { return __ref.runUserSub(false, "bananovm","createchip", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmchip");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1432;BA.debugLine="Sub CreateChip(sid As String, eventHandler As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1433;BA.debugLine="Dim el As VMChip";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmchip");Debug.locals.put("el", _el);
 BA.debugLineNum = 1434;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmchip.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1435;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1436;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchips(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateChips (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1420);
if (RapidSub.canDelegate("createchips")) { return __ref.runUserSub(false, "bananovm","createchips", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmchips");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1420;BA.debugLine="Sub CreateChips(sid As String, eventHandler As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1421;BA.debugLine="Dim el As VMChips";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmchips");Debug.locals.put("el", _el);
 BA.debugLineNum = 1422;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmchips.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1423;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1424;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcol(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateCol (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1490);
if (RapidSub.canDelegate("createcol")) { return __ref.runUserSub(false, "bananovm","createcol", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcol");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1490;BA.debugLine="Sub CreateCol(sid As String) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1491;BA.debugLine="Dim el As VMCol";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcol");Debug.locals.put("el", _el);
 BA.debugLineNum = 1492;BA.debugLine="el.Initialize(Vue, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
 BA.debugLineNum = 1493;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1494;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcomponent(RemoteObject __ref,RemoteObject _id,RemoteObject _tag,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateComponent (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,457);
if (RapidSub.canDelegate("createcomponent")) { return __ref.runUserSub(false, "bananovm","createcomponent", __ref, _id, _tag, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vuecomponent");
Debug.locals.put("id", _id);
Debug.locals.put("tag", _tag);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 457;BA.debugLine="Sub CreateComponent(id As String, tag As String, e";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 458;BA.debugLine="Dim el As VueComponent";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vuecomponent");Debug.locals.put("el", _el);
 BA.debugLineNum = 459;BA.debugLine="el.Initialize(id, tag, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vuecomponent.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_id),(Object)(_tag),(Object)(_eventhandler));
 BA.debugLineNum = 460;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createcomponent1(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateComponent1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("createcomponent1")) { return __ref.runUserSub(false, "bananovm","createcomponent1", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 464;BA.debugLine="Sub CreateComponent1(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 465;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 466;BA.debugLine="el.Initialize(Vue, id).SetTag(\"component\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("component")));
 BA.debugLineNum = 467;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createconfirm(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateConfirm (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1538);
if (RapidSub.canDelegate("createconfirm")) { return __ref.runUserSub(false, "bananovm","createconfirm", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmconfirm");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1538;BA.debugLine="Sub CreateConfirm(sid As String, eventHandler As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1539;BA.debugLine="Dim el As VMConfirm";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmconfirm");Debug.locals.put("el", _el);
 BA.debugLineNum = 1540;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmconfirm.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1541;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1542;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcontainer(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateContainer (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("createcontainer")) { return __ref.runUserSub(false, "bananovm","createcontainer", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcontainer");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 216;BA.debugLine="Sub CreateContainer(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="Dim el As VMContainer";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcontainer");Debug.locals.put("el", _el);
 BA.debugLineNum = 218;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcontainer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 219;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 220;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateCSS (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("createcss")) { return __ref.runUserSub(false, "bananovm","createcss", __ref);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcss");
 BA.debugLineNum = 240;BA.debugLine="Sub CreateCSS As VMCSS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 241;BA.debugLine="Dim El As VMCSS";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcss");Debug.locals.put("El", _el);
 BA.debugLineNum = 242;BA.debugLine="El.Initialize";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcss.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 243;BA.debugLine="Return El";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createcustomcomponent(RemoteObject __ref,RemoteObject _id,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("CreateCustomComponent (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("createcustomcomponent")) { return __ref.runUserSub(false, "bananovm","createcustomcomponent", __ref, _id, _tag);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 450;BA.debugLine="Sub CreateCustomComponent(id As String, tag As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 451;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 452;BA.debugLine="el.Initialize(Vue, id).SetTag(tag)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(_tag));
 BA.debugLineNum = 453;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 454;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdatepicker(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateDatePicker (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1581);
if (RapidSub.canDelegate("createdatepicker")) { return __ref.runUserSub(false, "bananovm","createdatepicker", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmdatepicker");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1581;BA.debugLine="Sub CreateDatePicker(sid As String, eventHandler A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1582;BA.debugLine="Dim el As VMDatePicker";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmdatepicker");Debug.locals.put("el", _el);
 BA.debugLineNum = 1583;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmdatepicker.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
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
public static RemoteObject  _createdialog(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateDialog (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1563);
if (RapidSub.canDelegate("createdialog")) { return __ref.runUserSub(false, "bananovm","createdialog", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmdialog");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 1563;BA.debugLine="Sub CreateDialog(sid As String, module As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1564;BA.debugLine="Dim el As VMDialog";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmdialog");Debug.locals.put("el", _el);
 BA.debugLineNum = 1565;BA.debugLine="el.Initialize(Vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 1566;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1567;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdisplay1(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateDisplay1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,997);
if (RapidSub.canDelegate("createdisplay1")) { return __ref.runUserSub(false, "bananovm","createdisplay1", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 997;BA.debugLine="Sub CreateDisplay1(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 998;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 999;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setdisplay1" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1000;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1001;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdisplay2(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateDisplay2 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1003);
if (RapidSub.canDelegate("createdisplay2")) { return __ref.runUserSub(false, "bananovm","createdisplay2", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1003;BA.debugLine="Sub CreateDisplay2(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1004;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1005;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setdisplay2" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1006;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1007;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdisplay3(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateDisplay3 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1009);
if (RapidSub.canDelegate("createdisplay3")) { return __ref.runUserSub(false, "bananovm","createdisplay3", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1009;BA.debugLine="Sub CreateDisplay3(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1010;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1011;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setdisplay3" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1012;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1013;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdisplay4(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateDisplay4 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1015);
if (RapidSub.canDelegate("createdisplay4")) { return __ref.runUserSub(false, "bananovm","createdisplay4", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1015;BA.debugLine="Sub CreateDisplay4(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1016;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1017;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setdisplay4" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1018;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1019;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateDiv (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,569);
if (RapidSub.canDelegate("creatediv")) { return __ref.runUserSub(false, "bananovm","creatediv", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 569;BA.debugLine="Sub CreateDiv(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 570;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 571;BA.debugLine="el.Initialize(Vue,id).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 572;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 573;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdivider(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("CreateDivider (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1569);
if (RapidSub.canDelegate("createdivider")) { return __ref.runUserSub(false, "bananovm","createdivider", __ref, _b);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmdivider");
Debug.locals.put("b", _b);
 BA.debugLineNum = 1569;BA.debugLine="Sub CreateDivider(b As Boolean) As VMDivider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1570;BA.debugLine="Dim el As VMDivider";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmdivider");Debug.locals.put("el", _el);
 BA.debugLineNum = 1571;BA.debugLine="el.Initialize(Vue, \"\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmdivider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
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
public static RemoteObject  _createdrawer(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateDrawer (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1618);
if (RapidSub.canDelegate("createdrawer")) { return __ref.runUserSub(false, "bananovm","createdrawer", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmdrawer");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 1618;BA.debugLine="Sub CreateDrawer(sid As String, module As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1619;BA.debugLine="Dim el As VMDrawer";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmdrawer");Debug.locals.put("el", _el);
 BA.debugLineNum = 1620;BA.debugLine="el.Initialize(Vue,sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmdrawer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 1621;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1622;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createelement(RemoteObject __ref,RemoteObject _sid,RemoteObject _stag) throws Exception{
try {
		Debug.PushSubsStack("CreateElement (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1612);
if (RapidSub.canDelegate("createelement")) { return __ref.runUserSub(false, "bananovm","createelement", __ref, _sid, _stag);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
Debug.locals.put("stag", _stag);
 BA.debugLineNum = 1612;BA.debugLine="Sub CreateElement(sid As String, stag As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1613;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1614;BA.debugLine="el.Initialize(Vue,sid).SetTag(stag)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(_stag));
 BA.debugLineNum = 1615;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1616;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createemail(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateEmail (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1462);
if (RapidSub.canDelegate("createemail")) { return __ref.runUserSub(false, "bananovm","createemail", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1462;BA.debugLine="Sub CreateEmail(sid As String, eventHandler As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1463;BA.debugLine="Dim el As VMInput = CreateInput(sid, eventHandler";
Debug.JustUpdateDeviceLine();
_el = __ref.runClassMethod (b4j.example.bananovm.class, "_createinput" /*RemoteObject*/ ,(Object)(_sid),(Object)(_eventhandler)).runClassMethod (b4j.example.vminput.class, "_settypeemail" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));Debug.locals.put("el", _el);Debug.locals.put("el", _el);
 BA.debugLineNum = 1464;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1465;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createemptystate(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateEmptyState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("createemptystate")) { return __ref.runUserSub(false, "bananovm","createemptystate", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmemptystate");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 289;BA.debugLine="Sub CreateEmptyState(sid As String, eventHandler A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 290;BA.debugLine="Dim el As VMEmptyState";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmemptystate");Debug.locals.put("el", _el);
 BA.debugLineNum = 291;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmemptystate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 292;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createenlighter(RemoteObject __ref,RemoteObject _sid,RemoteObject _lang) throws Exception{
try {
		Debug.PushSubsStack("CreateEnlighter (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("createenlighter")) { return __ref.runUserSub(false, "bananovm","createenlighter", __ref, _sid, _lang);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmenlighter");
Debug.locals.put("sid", _sid);
Debug.locals.put("lang", _lang);
 BA.debugLineNum = 266;BA.debugLine="Sub CreateEnlighter(sid As String, lang As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="Dim el As VMEnlighter";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmenlighter");Debug.locals.put("el", _el);
 BA.debugLineNum = 268;BA.debugLine="el.Initialize(Vue, sid, lang)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmenlighter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_lang));
 BA.debugLineNum = 269;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createfield(RemoteObject __ref,RemoteObject _parentid,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateField (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1478);
if (RapidSub.canDelegate("createfield")) { return __ref.runUserSub(false, "bananovm","createfield", __ref, _parentid, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmfield");
Debug.locals.put("parentid", _parentid);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1478;BA.debugLine="Sub CreateField(parentid As String, sid As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1479;BA.debugLine="Dim el As VMField";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmfield");Debug.locals.put("el", _el);
 BA.debugLineNum = 1480;BA.debugLine="el.Initialize(Vue, parentid, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmfield.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_parentid),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1481;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1482;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfile(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateFile (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1450);
if (RapidSub.canDelegate("createfile")) { return __ref.runUserSub(false, "bananovm","createfile", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmfile");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1450;BA.debugLine="Sub CreateFile(sid As String, eventHandler As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1451;BA.debugLine="Dim el As VMFile";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmfile");Debug.locals.put("el", _el);
 BA.debugLineNum = 1452;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmfile.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1453;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1454;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createform(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateForm (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1426);
if (RapidSub.canDelegate("createform")) { return __ref.runUserSub(false, "bananovm","createform", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmform");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1426;BA.debugLine="Sub CreateForm(sid As String, eventHandler As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1427;BA.debugLine="Dim el As VMForm";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmform");Debug.locals.put("el", _el);
 BA.debugLineNum = 1428;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmform.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1429;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1430;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createform1(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateFORM1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("createform1")) { return __ref.runUserSub(false, "bananovm","createform1", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 608;BA.debugLine="Sub CreateFORM1(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 609;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 610;BA.debugLine="el.Initialize(Vue, id).SetTag(\"form\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("form")));
 BA.debugLineNum = 611;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createfrappegantt(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateFrappeGantt (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("createfrappegantt")) { return __ref.runUserSub(false, "bananovm","createfrappegantt", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmfrappegantt");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 210;BA.debugLine="Sub CreateFrappeGantt(sid As String, eventHandler";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="Dim el As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmfrappegantt");Debug.locals.put("el", _el);
 BA.debugLineNum = 212;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmfrappegantt.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 213;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _creategijgotable(RemoteObject __ref,RemoteObject _sid,RemoteObject _primarykey,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateGijgoTable (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("creategijgotable")) { return __ref.runUserSub(false, "bananovm","creategijgotable", __ref, _sid, _primarykey, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmgijgotable");
Debug.locals.put("sid", _sid);
Debug.locals.put("PrimaryKey", _primarykey);
Debug.locals.put("module", _module);
 BA.debugLineNum = 307;BA.debugLine="Sub CreateGijgoTable(sid As String, PrimaryKey As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="Dim el As VMGijgoTable";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmgijgotable");Debug.locals.put("el", _el);
 BA.debugLineNum = 309;BA.debugLine="el.Initialize(Vue, sid, PrimaryKey, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmgijgotable.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_primarykey),(Object)(_module));
 BA.debugLineNum = 310;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _creategmap(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateGMap (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("creategmap")) { return __ref.runUserSub(false, "bananovm","creategmap", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmgmap");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 39;BA.debugLine="Sub CreateGMap(sid As String, eventHandler As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="Dim el As VMGMap";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmgmap");Debug.locals.put("el", _el);
 BA.debugLineNum = 41;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmgmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 42;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _creategrid(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateGrid (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,949);
if (RapidSub.canDelegate("creategrid")) { return __ref.runUserSub(false, "bananovm","creategrid", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmgrid");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 949;BA.debugLine="Sub CreateGrid(sid As String, eventHandler As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 950;BA.debugLine="Dim el As VMGrid";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmgrid");Debug.locals.put("el", _el);
 BA.debugLineNum = 951;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmgrid.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 952;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 953;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateH1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,601);
if (RapidSub.canDelegate("createh1")) { return __ref.runUserSub(false, "bananovm","createh1", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 601;BA.debugLine="Sub CreateH1(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 602;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 603;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h1\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h1")));
 BA.debugLineNum = 604;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 605;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateH2 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,642);
if (RapidSub.canDelegate("createh2")) { return __ref.runUserSub(false, "bananovm","createh2", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 642;BA.debugLine="Sub CreateH2(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 643;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 644;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h2\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h2")));
 BA.debugLineNum = 645;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createh3(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateH3 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("createh3")) { return __ref.runUserSub(false, "bananovm","createh3", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 648;BA.debugLine="Sub CreateH3(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 649;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 650;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h3\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h3")));
 BA.debugLineNum = 651;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 652;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateH4 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,654);
if (RapidSub.canDelegate("createh4")) { return __ref.runUserSub(false, "bananovm","createh4", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 654;BA.debugLine="Sub CreateH4(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 655;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 656;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h4\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h4")));
 BA.debugLineNum = 657;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 658;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateH5 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,660);
if (RapidSub.canDelegate("createh5")) { return __ref.runUserSub(false, "bananovm","createh5", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 660;BA.debugLine="Sub CreateH5(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 661;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 662;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h5\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h5")));
 BA.debugLineNum = 663;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 664;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateH6 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,666);
if (RapidSub.canDelegate("createh6")) { return __ref.runUserSub(false, "bananovm","createh6", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 666;BA.debugLine="Sub CreateH6(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 667;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 668;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h6\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h6")));
 BA.debugLineNum = 669;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 670;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createheadline(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateHeadline (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,991);
if (RapidSub.canDelegate("createheadline")) { return __ref.runUserSub(false, "bananovm","createheadline", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 991;BA.debugLine="Sub CreateHeadline(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 992;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 993;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetHeadlin";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setheadline" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 994;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createicon(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateIcon (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1593);
if (RapidSub.canDelegate("createicon")) { return __ref.runUserSub(false, "bananovm","createicon", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmicon");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1593;BA.debugLine="Sub CreateIcon(sid As String) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1594;BA.debugLine="Dim el As VMIcon";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("el", _el);
 BA.debugLineNum = 1595;BA.debugLine="el.Initialize(Vue, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
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
public static RemoteObject  _createimage(RemoteObject __ref,RemoteObject _img,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateImage (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,295);
if (RapidSub.canDelegate("createimage")) { return __ref.runUserSub(false, "bananovm","createimage", __ref, _img, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmimage");
Debug.locals.put("img", _img);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 295;BA.debugLine="Sub CreateImage(img As String, eventHandler As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 296;BA.debugLine="Dim el As VMImage";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmimage");Debug.locals.put("el", _el);
 BA.debugLineNum = 297;BA.debugLine="el.Initialize(Vue, img, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmimage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_img),(Object)(_eventhandler));
 BA.debugLineNum = 298;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinfobox(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateInfoBox (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("createinfobox")) { return __ref.runUserSub(false, "bananovm","createinfobox", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminfobox");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 423;BA.debugLine="Sub CreateInfoBox(sid As String, eventHandler As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 424;BA.debugLine="HasInfoBox = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasinfobox" /*RemoteObject*/ ,bananovm.__c.getField(true,"True"));
 BA.debugLineNum = 425;BA.debugLine="Dim el As VMInfoBox";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminfobox");Debug.locals.put("el", _el);
 BA.debugLineNum = 426;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminfobox.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 427;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinput(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateInput (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1444);
if (RapidSub.canDelegate("createinput")) { return __ref.runUserSub(false, "bananovm","createinput", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1444;BA.debugLine="Sub CreateInput(sid As String, eventHandler As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1445;BA.debugLine="Dim el As VMInput";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminput");Debug.locals.put("el", _el);
 BA.debugLineNum = 1446;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminput.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1447;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1448;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinput1(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateINPUT1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,621);
if (RapidSub.canDelegate("createinput1")) { return __ref.runUserSub(false, "bananovm","createinput1", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 621;BA.debugLine="Sub CreateINPUT1(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 622;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 623;BA.debugLine="el.Initialize(Vue, id).SetTag(\"input\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("input")));
 BA.debugLineNum = 624;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 625;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateKeepAlive (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("createkeepalive")) { return __ref.runUserSub(false, "bananovm","createkeepalive", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 557;BA.debugLine="Sub CreateKeepAlive(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 558;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 559;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"keep-alive\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("keep-alive")));
 BA.debugLineNum = 560;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 561;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createknob(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateKnob (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("createknob")) { return __ref.runUserSub(false, "bananovm","createknob", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmknob");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 430;BA.debugLine="Sub CreateKnob(sid As String, eventHandler As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 431;BA.debugLine="HasKnob = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasknob" /*RemoteObject*/ ,bananovm.__c.getField(true,"True"));
 BA.debugLineNum = 432;BA.debugLine="Dim el As VMKnob";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmknob");Debug.locals.put("el", _el);
 BA.debugLineNum = 433;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmknob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 434;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateLABEL (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,614);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "bananovm","createlabel", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlabel");
Debug.locals.put("id", _id);
 BA.debugLineNum = 614;BA.debugLine="Sub CreateLABEL(id As String) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 615;BA.debugLine="Dim el As VMLabel";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlabel");Debug.locals.put("el", _el);
 BA.debugLineNum = 616;BA.debugLine="el.Initialize(Vue, id)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id));
 BA.debugLineNum = 617;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 618;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlayout(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateLayout (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1665);
if (RapidSub.canDelegate("createlayout")) { return __ref.runUserSub(false, "bananovm","createlayout", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1665;BA.debugLine="Sub CreateLayout(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1666;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1667;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"div\").SetLayout(Tr";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_setlayout" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1668;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1669;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlayoutitem(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateLayoutItem (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1671);
if (RapidSub.canDelegate("createlayoutitem")) { return __ref.runUserSub(false, "bananovm","createlayoutitem", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1671;BA.debugLine="Sub CreateLayoutItem(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1672;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1673;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"div\").SetLayoutIte";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_setlayoutitem" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1674;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1675;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateLI (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,581);
if (RapidSub.canDelegate("createli")) { return __ref.runUserSub(false, "bananovm","createli", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 581;BA.debugLine="Sub CreateLI(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 582;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 583;BA.debugLine="el.Initialize(Vue,id).SetTag(\"li\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("li")));
 BA.debugLineNum = 584;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createlist(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateList (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,937);
if (RapidSub.canDelegate("createlist")) { return __ref.runUserSub(false, "bananovm","createlist", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlist");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 937;BA.debugLine="Sub CreateList(sid As String,module As Object) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 938;BA.debugLine="Dim el As VMList";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlist");Debug.locals.put("el", _el);
 BA.debugLineNum = 939;BA.debugLine="el.Initialize(Vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 940;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createlistitem(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1587);
if (RapidSub.canDelegate("createlistitem")) { return __ref.runUserSub(false, "bananovm","createlistitem", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 1587;BA.debugLine="Sub CreateListItem(sid As String, module As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1588;BA.debugLine="Dim el As VMListItem";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("el", _el);
 BA.debugLineNum = 1589;BA.debugLine="el.Initialize(Vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
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
public static RemoteObject  _createlistview(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateListView (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,943);
if (RapidSub.canDelegate("createlistview")) { return __ref.runUserSub(false, "bananovm","createlistview", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlistview");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 943;BA.debugLine="Sub CreateListView(sid As String, module As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 944;BA.debugLine="Dim el As VMListView";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlistview");Debug.locals.put("el", _el);
 BA.debugLineNum = 945;BA.debugLine="el.Initialize(Vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlistview.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 946;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 947;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createloader(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateLoader (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1648);
if (RapidSub.canDelegate("createloader")) { return __ref.runUserSub(false, "bananovm","createloader", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmloader");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 1648;BA.debugLine="Sub CreateLoader(sid As String, module As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1649;BA.debugLine="Dim el As VMLoader";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmloader");Debug.locals.put("el", _el);
 BA.debugLineNum = 1650;BA.debugLine="el.Initialize(Vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmloader.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 1651;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1652;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createmenu(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateMenu (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1526);
if (RapidSub.canDelegate("createmenu")) { return __ref.runUserSub(false, "bananovm","createmenu", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmmenu");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 1526;BA.debugLine="Sub CreateMenu(sid As String, module As Object) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1527;BA.debugLine="Dim el As VMMenu";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmmenu");Debug.locals.put("el", _el);
 BA.debugLineNum = 1528;BA.debugLine="el.Initialize(Vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmmenu.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 1529;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1530;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createmenuitem(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateMenuItem (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1520);
if (RapidSub.canDelegate("createmenuitem")) { return __ref.runUserSub(false, "bananovm","createmenuitem", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmmenuitem");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1520;BA.debugLine="Sub CreateMenuItem(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1521;BA.debugLine="Dim el As VMMenuItem";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmmenuitem");Debug.locals.put("el", _el);
 BA.debugLineNum = 1522;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmmenuitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1523;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1524;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnumber(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateNumber (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1457);
if (RapidSub.canDelegate("createnumber")) { return __ref.runUserSub(false, "bananovm","createnumber", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1457;BA.debugLine="Sub CreateNumber(sid As String, eventHandler As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1458;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el = __ref.runClassMethod (b4j.example.bananovm.class, "_createinput" /*RemoteObject*/ ,(Object)(_sid),(Object)(_eventhandler)).runClassMethod (b4j.example.vminput.class, "_settypenumber" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));Debug.locals.put("el", _el);Debug.locals.put("el", _el);
 BA.debugLineNum = 1459;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1460;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnumberinput(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateNumberInput (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("createnumberinput")) { return __ref.runUserSub(false, "bananovm","createnumberinput", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmnumberinput");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 234;BA.debugLine="Sub CreateNumberInput(sid As String) As VMNumberIn";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Dim el As VMNumberInput";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmnumberinput");Debug.locals.put("el", _el);
 BA.debugLineNum = 236;BA.debugLine="el.Initialize(Vue, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmnumberinput.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
 BA.debugLineNum = 237;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 238;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateOL (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,588);
if (RapidSub.canDelegate("createol")) { return __ref.runUserSub(false, "bananovm","createol", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 588;BA.debugLine="Sub CreateOL(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 589;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 590;BA.debugLine="el.Initialize(Vue,id).SetTag(\"ol\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ol")));
 BA.debugLineNum = 591;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createoption1(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateOPTION1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1691);
if (RapidSub.canDelegate("createoption1")) { return __ref.runUserSub(false, "bananovm","createoption1", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1691;BA.debugLine="Sub CreateOPTION1(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1692;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1693;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"option\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("option")));
 BA.debugLineNum = 1694;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1695;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateP (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,595);
if (RapidSub.canDelegate("createp")) { return __ref.runUserSub(false, "bananovm","createp", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 595;BA.debugLine="Sub CreateP(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 596;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 597;BA.debugLine="el.Initialize(Vue, id).SetTag(\"p\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("p")));
 BA.debugLineNum = 598;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 599;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpassword(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreatePassword (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1467);
if (RapidSub.canDelegate("createpassword")) { return __ref.runUserSub(false, "bananovm","createpassword", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1467;BA.debugLine="Sub CreatePassword(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1468;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el = __ref.runClassMethod (b4j.example.bananovm.class, "_createinput" /*RemoteObject*/ ,(Object)(_sid),(Object)(_eventhandler)).runClassMethod (b4j.example.vminput.class, "_settypepassword" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));Debug.locals.put("el", _el);Debug.locals.put("el", _el);
 BA.debugLineNum = 1469;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createpdf(RemoteObject __ref,RemoteObject _sid,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("CreatePDF (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("createpdf")) { return __ref.runUserSub(false, "bananovm","createpdf", __ref, _sid, _url);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmpdf");
Debug.locals.put("sid", _sid);
Debug.locals.put("url", _url);
 BA.debugLineNum = 301;BA.debugLine="Sub CreatePDF(sid As String, url As String) As VMP";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="Dim el As VMPDF";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmpdf");Debug.locals.put("el", _el);
 BA.debugLineNum = 303;BA.debugLine="el.Initialize(Vue, sid, url)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmpdf.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_url));
 BA.debugLineNum = 304;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createprettyprint(RemoteObject __ref,RemoteObject _sid,RemoteObject _lang) throws Exception{
try {
		Debug.PushSubsStack("CreatePrettyPrint (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("createprettyprint")) { return __ref.runUserSub(false, "bananovm","createprettyprint", __ref, _sid, _lang);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmprettyprint");
Debug.locals.put("sid", _sid);
Debug.locals.put("lang", _lang);
 BA.debugLineNum = 260;BA.debugLine="Sub CreatePrettyPrint(sid As String, lang As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 261;BA.debugLine="Dim El As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmprettyprint");Debug.locals.put("El", _el);
 BA.debugLineNum = 262;BA.debugLine="El.Initialize(Vue, sid, lang)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmprettyprint.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_lang));
 BA.debugLineNum = 263;BA.debugLine="Return El";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createprogress(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateProgress (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("createprogress")) { return __ref.runUserSub(false, "bananovm","createprogress", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmprogress");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 102;BA.debugLine="Sub CreateProgress(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="Dim el As VMProgress";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmprogress");Debug.locals.put("el", _el);
 BA.debugLineNum = 104;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmprogress.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 105;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createprogresscircle(RemoteObject __ref,RemoteObject _sid,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateProgressCircle (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1130);
if (RapidSub.canDelegate("createprogresscircle")) { return __ref.runUserSub(false, "bananovm","createprogresscircle", __ref, _sid, _width, _height);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmprogresscircle");
Debug.locals.put("sid", _sid);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1130;BA.debugLine="Sub CreateProgressCircle(sid As String, Width As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1131;BA.debugLine="Dim el As VMProgressCircle";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmprogresscircle");Debug.locals.put("el", _el);
 BA.debugLineNum = 1132;BA.debugLine="el.Initialize(Vue, sid, Width, Height)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmprogresscircle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 1133;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createprompt(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreatePrompt (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1532);
if (RapidSub.canDelegate("createprompt")) { return __ref.runUserSub(false, "bananovm","createprompt", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmprompt");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1532;BA.debugLine="Sub CreatePrompt(sid As String, eventHandler As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1533;BA.debugLine="Dim el As VMPrompt";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmprompt");Debug.locals.put("el", _el);
 BA.debugLineNum = 1534;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmprompt.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1535;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1536;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createproperty(RemoteObject __ref,RemoteObject _module,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateProperty (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1550);
if (RapidSub.canDelegate("createproperty")) { return __ref.runUserSub(false, "bananovm","createproperty", __ref, _module, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmproperty");
Debug.locals.put("module", _module);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1550;BA.debugLine="Sub CreateProperty(module As Object, sid As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1551;BA.debugLine="Dim el As VMProperty";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmproperty");Debug.locals.put("el", _el);
 BA.debugLineNum = 1552;BA.debugLine="el.Initialize(Vue, module, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmproperty.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_module),(Object)(_sid));
 BA.debugLineNum = 1553;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createradio(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateRadio (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1575);
if (RapidSub.canDelegate("createradio")) { return __ref.runUserSub(false, "bananovm","createradio", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmradio");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1575;BA.debugLine="Sub CreateRadio(sid As String, eventHandler As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1576;BA.debugLine="Dim el As VMRadio";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmradio");Debug.locals.put("el", _el);
 BA.debugLineNum = 1577;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradio.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
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
public static RemoteObject  _createradiogroup(RemoteObject __ref,RemoteObject _sid,RemoteObject _scaption,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateRadioGroup (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1630);
if (RapidSub.canDelegate("createradiogroup")) { return __ref.runUserSub(false, "bananovm","createradiogroup", __ref, _sid, _scaption, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmradiogroup");
Debug.locals.put("sid", _sid);
Debug.locals.put("sCaption", _scaption);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1630;BA.debugLine="Sub CreateRadioGroup(sid As String, sCaption As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1631;BA.debugLine="Dim el As VMRadioGroup";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmradiogroup");Debug.locals.put("el", _el);
 BA.debugLineNum = 1632;BA.debugLine="el.Initialize(Vue, sid, sCaption, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradiogroup.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_scaption),(Object)(_eventhandler));
 BA.debugLineNum = 1633;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1634;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrouterlink(RemoteObject __ref,RemoteObject _rid,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateRouterLink (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,545);
if (RapidSub.canDelegate("createrouterlink")) { return __ref.runUserSub(false, "bananovm","createrouterlink", __ref, _rid, _text);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("rID", _rid);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 545;BA.debugLine="Sub CreateRouterLink(rID As String, Text As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 546;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 547;BA.debugLine="el.Initialize(Vue,rID).SetTag(\"router-link\").SetT";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_rid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("router-link"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 548;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 549;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrouterview(RemoteObject __ref,RemoteObject _rid) throws Exception{
try {
		Debug.PushSubsStack("CreateRouterView (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,551);
if (RapidSub.canDelegate("createrouterview")) { return __ref.runUserSub(false, "bananovm","createrouterview", __ref, _rid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("rID", _rid);
 BA.debugLineNum = 551;BA.debugLine="Sub CreateRouterView(rID As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 552;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 553;BA.debugLine="el.Initialize(Vue,rID).SetTag(\"router-view\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_rid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("router-view")));
 BA.debugLineNum = 554;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrow(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateRow (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1484);
if (RapidSub.canDelegate("createrow")) { return __ref.runUserSub(false, "bananovm","createrow", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmrow");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1484;BA.debugLine="Sub CreateRow(sid As String) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1485;BA.debugLine="Dim el As VMRow";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmrow");Debug.locals.put("el", _el);
 BA.debugLineNum = 1486;BA.debugLine="el.Initialize(Vue, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmrow.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
 BA.debugLineNum = 1487;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1488;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createselect(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSelect (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1677);
if (RapidSub.canDelegate("createselect")) { return __ref.runUserSub(false, "bananovm","createselect", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmselect");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1677;BA.debugLine="Sub CreateSelect(sid As String, eventHandler As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1678;BA.debugLine="Dim el As VMSelect";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmselect");Debug.locals.put("el", _el);
 BA.debugLineNum = 1679;BA.debugLine="el.Initialize(Vue,sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmselect.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1680;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1681;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createselect1(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSELECT1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1684);
if (RapidSub.canDelegate("createselect1")) { return __ref.runUserSub(false, "bananovm","createselect1", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1684;BA.debugLine="Sub CreateSELECT1(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1685;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1686;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"select\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("select")));
 BA.debugLineNum = 1687;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1688;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createslider(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSlider (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,843);
if (RapidSub.canDelegate("createslider")) { return __ref.runUserSub(false, "bananovm","createslider", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmslider");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 843;BA.debugLine="Sub CreateSlider(sid As String, eventHandler As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 844;BA.debugLine="Dim el As VMSlider";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmslider");Debug.locals.put("el", _el);
 BA.debugLineNum = 845;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmslider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 846;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createsnackbar(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSnackBar (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1398);
if (RapidSub.canDelegate("createsnackbar")) { return __ref.runUserSub(false, "bananovm","createsnackbar", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmsnackbar");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1398;BA.debugLine="Sub CreateSnackBar(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1399;BA.debugLine="Dim el As VMSnackbar";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmsnackbar");Debug.locals.put("el", _el);
 BA.debugLineNum = 1400;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmsnackbar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1401;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createspan(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSpan (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1599);
if (RapidSub.canDelegate("createspan")) { return __ref.runUserSub(false, "bananovm","createspan", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1599;BA.debugLine="Sub CreateSpan(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1600;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1601;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 1602;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1603;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createspeeddial(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSpeedDial (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1508);
if (RapidSub.canDelegate("createspeeddial")) { return __ref.runUserSub(false, "bananovm","createspeeddial", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmspeeddial");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1508;BA.debugLine="Sub CreateSpeedDial(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1509;BA.debugLine="Dim el As VMSpeedDial";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmspeeddial");Debug.locals.put("el", _el);
 BA.debugLineNum = 1510;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmspeeddial.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1511;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1512;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createspinner(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSpinner (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("createspinner")) { return __ref.runUserSub(false, "bananovm","createspinner", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmspinner");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 96;BA.debugLine="Sub CreateSpinner(sid As String, eventHandler As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Dim el As VMSpinner";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmspinner");Debug.locals.put("el", _el);
 BA.debugLineNum = 98;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmspinner.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 99;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createstepperitem(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateStepperItem (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,920);
if (RapidSub.canDelegate("createstepperitem")) { return __ref.runUserSub(false, "bananovm","createstepperitem", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmstepitem");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 920;BA.debugLine="Sub CreateStepperItem(sid As String, eventHandler";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 921;BA.debugLine="Dim el As VMStepItem";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmstepitem");Debug.locals.put("el", _el);
 BA.debugLineNum = 922;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmstepitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 923;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 924;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsteppers(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSteppers (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,926);
if (RapidSub.canDelegate("createsteppers")) { return __ref.runUserSub(false, "bananovm","createsteppers", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmsteppers");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 926;BA.debugLine="Sub CreateSteppers(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 927;BA.debugLine="Dim el As VMSteppers";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmsteppers");Debug.locals.put("el", _el);
 BA.debugLineNum = 928;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmsteppers.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 929;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 930;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsubhead(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSubHead (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,985);
if (RapidSub.canDelegate("createsubhead")) { return __ref.runUserSub(false, "bananovm","createsubhead", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 985;BA.debugLine="Sub CreateSubHead(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 986;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 987;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetSubHead";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setsubhead" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 988;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createsubheader(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSubHeader (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1514);
if (RapidSub.canDelegate("createsubheader")) { return __ref.runUserSub(false, "bananovm","createsubheader", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1514;BA.debugLine="Sub CreateSubHeader(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1515;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 1516;BA.debugLine="el.Initialize(Vue, sid).SetTagSubHeader(True)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settagsubheader" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1517;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1518;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsubheading(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateSubHeading (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,979);
if (RapidSub.canDelegate("createsubheading")) { return __ref.runUserSub(false, "bananovm","createsubheading", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 979;BA.debugLine="Sub CreateSubHeading(sid As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 980;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 981;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetSubHead";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_setsubheading" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 982;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 983;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createswitch(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSwitch (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,879);
if (RapidSub.canDelegate("createswitch")) { return __ref.runUserSub(false, "bananovm","createswitch", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmswitch");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 879;BA.debugLine="Sub CreateSwitch(sid As String, eventHandler As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 880;BA.debugLine="Dim el As VMSwitch";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmswitch");Debug.locals.put("el", _el);
 BA.debugLineNum = 881;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmswitch.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 882;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createtable(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "bananovm","createtable", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtable");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 90;BA.debugLine="Sub CreateTable(sid As String, eventHandler As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Dim el As VMTable";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtable");Debug.locals.put("el", _el);
 BA.debugLineNum = 92;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtable.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 93;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createtabs(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateTabs (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,867);
if (RapidSub.canDelegate("createtabs")) { return __ref.runUserSub(false, "bananovm","createtabs", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtabs");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 867;BA.debugLine="Sub CreateTabs(sid As String, eventHandler As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 868;BA.debugLine="Dim el As VMTabs";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtabs");Debug.locals.put("el", _el);
 BA.debugLineNum = 869;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtabs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 870;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createtabsitem(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateTabsItem (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,861);
if (RapidSub.canDelegate("createtabsitem")) { return __ref.runUserSub(false, "bananovm","createtabsitem", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtabsitem");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 861;BA.debugLine="Sub CreateTabsItem(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 862;BA.debugLine="Dim el As VMTabsItem";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtabsitem");Debug.locals.put("el", _el);
 BA.debugLineNum = 863;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtabsitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 864;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createtag(RemoteObject __ref,RemoteObject _id,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("CreateTag (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,563);
if (RapidSub.canDelegate("createtag")) { return __ref.runUserSub(false, "bananovm","createtag", __ref, _id, _tag);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 563;BA.debugLine="Sub CreateTag(id As String, tag As String) As VMEl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 564;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 565;BA.debugLine="el.Initialize(Vue,id).SetTag(tag)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(_tag));
 BA.debugLineNum = 566;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtel(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateTel (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1472);
if (RapidSub.canDelegate("createtel")) { return __ref.runUserSub(false, "bananovm","createtel", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1472;BA.debugLine="Sub CreateTel(sid As String, eventHandler As Objec";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1473;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el = __ref.runClassMethod (b4j.example.bananovm.class, "_createinput" /*RemoteObject*/ ,(Object)(_sid),(Object)(_eventhandler)).runClassMethod (b4j.example.vminput.class, "_settypetel" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));Debug.locals.put("el", _el);Debug.locals.put("el", _el);
 BA.debugLineNum = 1474;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1475;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextarea(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateTextArea (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1438);
if (RapidSub.canDelegate("createtextarea")) { return __ref.runUserSub(false, "bananovm","createtextarea", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtextarea");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1438;BA.debugLine="Sub CreateTextArea(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1439;BA.debugLine="Dim el As VMTextArea";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtextarea");Debug.locals.put("el", _el);
 BA.debugLineNum = 1440;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtextarea.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1441;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1442;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextarea1(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateTEXTAREA1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,628);
if (RapidSub.canDelegate("createtextarea1")) { return __ref.runUserSub(false, "bananovm","createtextarea1", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 628;BA.debugLine="Sub CreateTEXTAREA1(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 629;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 630;BA.debugLine="el.Initialize(Vue, id).SetTag(\"textarea\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("textarea")));
 BA.debugLineNum = 631;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createtimepicker(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateTimePicker (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("createtimepicker")) { return __ref.runUserSub(false, "bananovm","createtimepicker", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtimepicker");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 313;BA.debugLine="Sub CreateTimePicker(sid As String, eventHandler A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 314;BA.debugLine="Dim el As VMTimePicker";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtimepicker");Debug.locals.put("el", _el);
 BA.debugLineNum = 315;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtimepicker.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 316;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createtoolbar(RemoteObject __ref,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("CreateToolbar (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1642);
if (RapidSub.canDelegate("createtoolbar")) { return __ref.runUserSub(false, "bananovm","createtoolbar", __ref, _sid, _module);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtoolbar");
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 1642;BA.debugLine="Sub CreateToolbar(sid As String, module As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1643;BA.debugLine="Dim el As VMToolBar";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtoolbar");Debug.locals.put("el", _el);
 BA.debugLineNum = 1644;BA.debugLine="el.Initialize(Vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtoolbar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_module));
 BA.debugLineNum = 1645;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1646;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtree(RemoteObject __ref,RemoteObject _module,RemoteObject _sid,RemoteObject _prikey) throws Exception{
try {
		Debug.PushSubsStack("CreateTree (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1556);
if (RapidSub.canDelegate("createtree")) { return __ref.runUserSub(false, "bananovm","createtree", __ref, _module, _sid, _prikey);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtree");
Debug.locals.put("module", _module);
Debug.locals.put("sid", _sid);
Debug.locals.put("priKey", _prikey);
 BA.debugLineNum = 1556;BA.debugLine="Sub CreateTree(module As Object, sid As String, pr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1557;BA.debugLine="Dim el As VMTree";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtree");Debug.locals.put("el", _el);
 BA.debugLineNum = 1558;BA.debugLine="el.Initialize(Vue, module, sid, priKey)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtree.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_module),(Object)(_sid),(Object)(_prikey));
 BA.debugLineNum = 1559;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1560;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateUL (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,575);
if (RapidSub.canDelegate("createul")) { return __ref.runUserSub(false, "bananovm","createul", __ref, _id);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("id", _id);
 BA.debugLineNum = 575;BA.debugLine="Sub CreateUL(id As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 576;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 577;BA.debugLine="el.Initialize(Vue,id).SetTag(\"ul\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_id)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ul")));
 BA.debugLineNum = 578;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 579;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createvuecal(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateVueCal (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,873);
if (RapidSub.canDelegate("createvuecal")) { return __ref.runUserSub(false, "bananovm","createvuecal", __ref, _sid, _eventhandler, _width, _height);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmvuecal");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 873;BA.debugLine="Sub CreateVueCal(sid As String, eventHandler As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 874;BA.debugLine="Dim el As VMVueCal";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmvuecal");Debug.locals.put("el", _el);
 BA.debugLineNum = 875;BA.debugLine="el.Initialize(Vue, sid, eventHandler, width, heig";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmvuecal.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 876;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createwaterball(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateWaterBall (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1124);
if (RapidSub.canDelegate("createwaterball")) { return __ref.runUserSub(false, "bananovm","createwaterball", __ref, _sid, _eventhandler, _width, _height);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmwaterball");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1124;BA.debugLine="Sub CreateWaterBall(sid As String, eventHandler As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1125;BA.debugLine="Dim el As VMWaterBall";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmwaterball");Debug.locals.put("el", _el);
 BA.debugLineNum = 1126;BA.debugLine="el.Initialize(Vue, sid, eventHandler, Width, Heig";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmwaterball.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 1127;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1128;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CStr (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "bananovm","cstr", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 325;BA.debugLine="Sub CStr(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 326;BA.debugLine="Return Vue.CStr(o)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)(_o));
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
public static RemoteObject  _date2yyyymmdd(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Date2YYYYMMDD (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("date2yyyymmdd")) { return __ref.runUserSub(false, "bananovm","date2yyyymmdd", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 190;BA.debugLine="Sub Date2YYYYMMDD(value As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="Return Vue.Date2YYYYMMDD(value)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_date2yyyymmdd" /*RemoteObject*/ ,(Object)(_value));
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
public static RemoteObject  _dateadd(RemoteObject __ref,RemoteObject _mdate,RemoteObject _howmanydays) throws Exception{
try {
		Debug.PushSubsStack("DateAdd (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("dateadd")) { return __ref.runUserSub(false, "bananovm","dateadd", __ref, _mdate, _howmanydays);}
Debug.locals.put("mDate", _mdate);
Debug.locals.put("HowManyDays", _howmanydays);
 BA.debugLineNum = 198;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 199;BA.debugLine="Return Vue.DateAdd(mDate, HowManyDays)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_dateadd" /*RemoteObject*/ ,(Object)(_mdate),(Object)(_howmanydays));
 BA.debugLineNum = 200;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DateDiff (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("datediff")) { return __ref.runUserSub(false, "bananovm","datediff", __ref, _currentdate, _otherdate);}
Debug.locals.put("CurrentDate", _currentdate);
Debug.locals.put("OtherDate", _otherdate);
 BA.debugLineNum = 206;BA.debugLine="Sub DateDiff(CurrentDate As String, OtherDate As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="Return Vue.DateDiff(CurrentDate, OtherDate)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_datediff" /*RemoteObject*/ ,(Object)(_currentdate),(Object)(_otherdate));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DateNow (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1697);
if (RapidSub.canDelegate("datenow")) { return __ref.runUserSub(false, "bananovm","datenow", __ref);}
 BA.debugLineNum = 1697;BA.debugLine="Public Sub DateNow() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1698;BA.debugLine="Return Vue.DateNow";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_datenow" /*RemoteObject*/ );
 BA.debugLineNum = 1699;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DateTimeNow (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1702);
if (RapidSub.canDelegate("datetimenow")) { return __ref.runUserSub(false, "bananovm","datetimenow", __ref);}
 BA.debugLineNum = 1702;BA.debugLine="Public Sub DateTimeNow() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1703;BA.debugLine="Return Vue.DateTimeNow";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_datetimenow" /*RemoteObject*/ );
 BA.debugLineNum = 1704;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _decrementbadge(RemoteObject __ref,RemoteObject _elid,RemoteObject _counted) throws Exception{
try {
		Debug.PushSubsStack("DecrementBadge (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,499);
if (RapidSub.canDelegate("decrementbadge")) { return __ref.runUserSub(false, "bananovm","decrementbadge", __ref, _elid, _counted);}
RemoteObject _badvalue = RemoteObject.createImmutable("");
RemoteObject _lastvalue = RemoteObject.createImmutable("");
RemoteObject _intlast = RemoteObject.createImmutable(0);
Debug.locals.put("elID", _elid);
Debug.locals.put("counted", _counted);
 BA.debugLineNum = 499;BA.debugLine="Sub DecrementBadge(elID As String, counted As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 500;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 501;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
Debug.JustUpdateDeviceLine();
_badvalue = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("badgevalue")));Debug.locals.put("badValue", _badvalue);Debug.locals.put("badValue", _badvalue);
 BA.debugLineNum = 502;BA.debugLine="Dim lastValue As String = Vue.GetState(badValue,";
Debug.JustUpdateDeviceLine();
_lastvalue = BA.ObjectToString(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_badvalue),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("lastValue", _lastvalue);Debug.locals.put("lastValue", _lastvalue);
 BA.debugLineNum = 503;BA.debugLine="Dim intLast As Int = BANano.parseInt(lastValue)";
Debug.JustUpdateDeviceLine();
_intlast = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_lastvalue)));Debug.locals.put("intLast", _intlast);Debug.locals.put("intLast", _intlast);
 BA.debugLineNum = 504;BA.debugLine="intLast = intLast - counted";
Debug.JustUpdateDeviceLine();
_intlast = RemoteObject.solve(new RemoteObject[] {_intlast,_counted}, "-",1, 1);Debug.locals.put("intLast", _intlast);
 BA.debugLineNum = 505;BA.debugLine="Vue.SetStateSingle(badValue, intLast)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_badvalue),(Object)((_intlast)));
 BA.debugLineNum = 506;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 507;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disable(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("Disable (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("disable")) { return __ref.runUserSub(false, "bananovm","disable", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 163;BA.debugLine="Sub Disable(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 165;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("disabled")))),(Object)((bananovm.__c.getField(true,"True"))));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enable(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("Enable (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("enable")) { return __ref.runUserSub(false, "bananovm","enable", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 158;BA.debugLine="Sub Enable(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 160;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("disabled")))),(Object)((bananovm.__c.getField(true,"False"))));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("EQOperators (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("eqoperators")) { return __ref.runUserSub(false, "bananovm","eqoperators", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 246;BA.debugLine="Sub EQOperators(sm As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="Return Vue.EQOperators(sm)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extractmap(RemoteObject __ref,RemoteObject _source,RemoteObject _keys) throws Exception{
try {
		Debug.PushSubsStack("ExtractMap (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("extractmap")) { return __ref.runUserSub(false, "bananovm","extractmap", __ref, _source, _keys);}
Debug.locals.put("source", _source);
Debug.locals.put("keys", _keys);
 BA.debugLineNum = 251;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="Return ExtractMap(source, keys)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananovm.class, "_extractmap" /*RemoteObject*/ ,(Object)(_source),(Object)(_keys));
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
public static RemoteObject  _fixrecords(RemoteObject __ref,RemoteObject _recs,RemoteObject _trimthese,RemoteObject _numthese,RemoteObject _boolthese,RemoteObject _datethese,RemoteObject _dblthese) throws Exception{
try {
		Debug.PushSubsStack("FixRecords (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1065);
if (RapidSub.canDelegate("fixrecords")) { return __ref.runUserSub(false, "bananovm","fixrecords", __ref, _recs, _trimthese, _numthese, _boolthese, _datethese, _dblthese);}
Debug.locals.put("recs", _recs);
Debug.locals.put("trimThese", _trimthese);
Debug.locals.put("numThese", _numthese);
Debug.locals.put("boolThese", _boolthese);
Debug.locals.put("dateThese", _datethese);
Debug.locals.put("dblThese", _dblthese);
 BA.debugLineNum = 1065;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1066;BA.debugLine="Vue.FixRecords(recs, trimThese, numThese, boolThe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_fixrecords" /*RemoteObject*/ ,(Object)(_recs),(Object)(_trimthese),(Object)(_numthese),(Object)(_boolthese),(Object)(_datethese),(Object)(_dblthese));
 BA.debugLineNum = 1067;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixrecordsusedesign(RemoteObject __ref,RemoteObject _recs,RemoteObject _design) throws Exception{
try {
		Debug.PushSubsStack("FixRecordsUseDesign (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("fixrecordsusedesign")) { return __ref.runUserSub(false, "bananovm","fixrecordsusedesign", __ref, _recs, _design);}
Debug.locals.put("recs", _recs);
Debug.locals.put("design", _design);
 BA.debugLineNum = 75;BA.debugLine="Sub FixRecordsUseDesign(recs As List, design As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="Vue.FixRecords(recs, design.Strings, design.Integ";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_fixrecords" /*RemoteObject*/ ,(Object)(_recs),(Object)(_design.getField(false,"_strings" /*RemoteObject*/ )),(Object)(_design.getField(false,"_integers" /*RemoteObject*/ )),(Object)(_design.getField(false,"_booleans" /*RemoteObject*/ )),(Object)(_design.getField(false,"_dates" /*RemoteObject*/ )),(Object)(_design.getField(false,"_doubles" /*RemoteObject*/ )));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ForceUpdate (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,839);
if (RapidSub.canDelegate("forceupdate")) { return __ref.runUserSub(false, "bananovm","forceupdate", __ref);}
 BA.debugLineNum = 839;BA.debugLine="Sub ForceUpdate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 840;BA.debugLine="Vue.ForceUpdate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_forceupdate" /*RemoteObject*/ );
 BA.debugLineNum = 841;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalert(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAlert (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1409);
if (RapidSub.canDelegate("getalert")) { return __ref.runUserSub(false, "bananovm","getalert", __ref);}
 BA.debugLineNum = 1409;BA.debugLine="Sub GetAlert As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1410;BA.debugLine="Return Vue.getstate(\"alertkey\",\"\")";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("alertkey")),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1411;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetAlphabets (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("getalphabets")) { return __ref.runUserSub(false, "bananovm","getalphabets", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 226;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="Return Vue.GetAlphabets(value)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getalphabets" /*RemoteObject*/ ,(Object)(_value));
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
public static RemoteObject  _getchipidfromevent(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("GetChipIDFromEvent (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,510);
if (RapidSub.canDelegate("getchipidfromevent")) { return __ref.runUserSub(false, "bananovm","getchipidfromevent", __ref, _e);}
RemoteObject _spath = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sid = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 510;BA.debugLine="Sub GetChipIDFromEvent(e As BANanoEvent) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 511;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 512;BA.debugLine="Dim spath As List = e.OtherField(\"path\").Result";
Debug.JustUpdateDeviceLine();
_spath = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_spath.setObject(_e.runMethod(false,"OtherField",(Object)(RemoteObject.createImmutable("path"))).runMethod(false,"Result"));Debug.locals.put("spath", _spath);
 BA.debugLineNum = 513;BA.debugLine="Dim sitem As Map = spath.get(5)";
Debug.JustUpdateDeviceLine();
_sitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_sitem.setObject(_spath.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("sitem", _sitem);
 BA.debugLineNum = 514;BA.debugLine="Dim sid As String = sitem.get(\"id\")";
Debug.JustUpdateDeviceLine();
_sid = BA.ObjectToString(_sitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 515;BA.debugLine="Return sid";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _sid;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 517;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 518;BA.debugLine="Log(LastException)";
Debug.JustUpdateDeviceLine();
bananovm.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(bananovm.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 520;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getconfirm(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetConfirm (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1404);
if (RapidSub.canDelegate("getconfirm")) { return __ref.runUserSub(false, "bananovm","getconfirm", __ref);}
 BA.debugLineNum = 1404;BA.debugLine="Sub GetConfirm As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1405;BA.debugLine="Return Vue.getstate(\"confirmkey\",\"\")";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("confirmkey")),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1406;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetDisabledState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1031);
if (RapidSub.canDelegate("getdisabledstate")) { return __ref.runUserSub(false, "bananovm","getdisabledstate", __ref, _k);}
RemoteObject _diskey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 1031;BA.debugLine="Sub GetDisabledState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1032;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("disabled")));Debug.locals.put("disKey", _diskey);Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1033;BA.debugLine="Return GetState(disKey,False)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.bananovm.class, "_getstate" /*RemoteObject*/ ,(Object)(_diskey),(Object)((bananovm.__c.getField(true,"False")))));
 BA.debugLineNum = 1034;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetEventTargetProperty (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,786);
if (RapidSub.canDelegate("geteventtargetproperty")) { return __ref.runUserSub(false, "bananovm","geteventtargetproperty", __ref, _e, _prop);}
Debug.locals.put("e", _e);
Debug.locals.put("prop", _prop);
 BA.debugLineNum = 786;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 787;BA.debugLine="Return Vue.GetEventTargetProperty(e, prop)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_geteventtargetproperty" /*RemoteObject*/ ,(Object)(_e),(Object)(_prop));
 BA.debugLineNum = 788;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetFileDetails (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1722);
if (RapidSub.canDelegate("getfiledetails")) { return __ref.runUserSub(false, "bananovm","getfiledetails", __ref, _fileobj);}
Debug.locals.put("fileObj", _fileobj);
 BA.debugLineNum = 1722;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1723;BA.debugLine="Return Vue.GetFileDetails(fileObj)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getfiledetails" /*RemoteObject*/ ,(Object)(_fileobj));
 BA.debugLineNum = 1724;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getidfromevent(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("GetIDFromEvent (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,777);
if (RapidSub.canDelegate("getidfromevent")) { return __ref.runUserSub(false, "bananovm","getidfromevent", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 777;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 778;BA.debugLine="Return Vue.GetIDFromEvent(e)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getidfromevent" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 779;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetKeyFromEvent (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,781);
if (RapidSub.canDelegate("getkeyfromevent")) { return __ref.runUserSub(false, "bananovm","getkeyfromevent", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 781;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 782;BA.debugLine="Return Vue.GetKeyFromEvent(e)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getkeyfromevent" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 783;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprompt(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPrompt (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1306);
if (RapidSub.canDelegate("getprompt")) { return __ref.runUserSub(false, "bananovm","getprompt", __ref);}
RemoteObject _ss = RemoteObject.createImmutable("");
 BA.debugLineNum = 1306;BA.debugLine="Sub GetPrompt As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1307;BA.debugLine="Dim ss As String = Vue.GetState(\"promptvalue\",\"\")";
Debug.JustUpdateDeviceLine();
_ss = BA.ObjectToString(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("promptvalue")),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("ss", _ss);Debug.locals.put("ss", _ss);
 BA.debugLineNum = 1308;BA.debugLine="Return ss";
Debug.JustUpdateDeviceLine();
if (true) return _ss;
 BA.debugLineNum = 1309;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetRequiredState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1036);
if (RapidSub.canDelegate("getrequiredstate")) { return __ref.runUserSub(false, "bananovm","getrequiredstate", __ref, _k);}
RemoteObject _diskey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 1036;BA.debugLine="Sub GetRequiredState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1037;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("required")));Debug.locals.put("disKey", _diskey);Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1038;BA.debugLine="Return GetState(disKey,False)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.bananovm.class, "_getstate" /*RemoteObject*/ ,(Object)(_diskey),(Object)((bananovm.__c.getField(true,"False")))));
 BA.debugLineNum = 1039;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetShowState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1026);
if (RapidSub.canDelegate("getshowstate")) { return __ref.runUserSub(false, "bananovm","getshowstate", __ref, _k);}
RemoteObject _showkey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 1026;BA.debugLine="Sub GetShowState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1027;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
Debug.JustUpdateDeviceLine();
_showkey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("show")));Debug.locals.put("showKey", _showkey);Debug.locals.put("showKey", _showkey);
 BA.debugLineNum = 1028;BA.debugLine="Return GetState(showKey,False)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.bananovm.class, "_getstate" /*RemoteObject*/ ,(Object)(_showkey),(Object)((bananovm.__c.getField(true,"False")))));
 BA.debugLineNum = 1029;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstate(RemoteObject __ref,RemoteObject _k,RemoteObject _default) throws Exception{
try {
		Debug.PushSubsStack("GetState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,827);
if (RapidSub.canDelegate("getstate")) { return __ref.runUserSub(false, "bananovm","getstate", __ref, _k, _default);}
RemoteObject _res = RemoteObject.declareNull("Object");
Debug.locals.put("k", _k);
Debug.locals.put("default", _default);
 BA.debugLineNum = 827;BA.debugLine="Sub GetState(k As String, default As Object) As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 828;BA.debugLine="Dim res As Object = Vue.GetState(k, default)";
Debug.JustUpdateDeviceLine();
_res = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_k),(Object)(_default));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 829;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 830;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetStates (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,684);
if (RapidSub.canDelegate("getstates")) { return __ref.runUserSub(false, "bananovm","getstates", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 684;BA.debugLine="Sub GetStates(lst As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 685;BA.debugLine="Return Vue.GetStates(lst)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstates" /*RemoteObject*/ ,(Object)(_lst));
 BA.debugLineNum = 686;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HasState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,679);
if (RapidSub.canDelegate("hasstate")) { return __ref.runUserSub(false, "bananovm","hasstate", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 679;BA.debugLine="Sub HasState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 680;BA.debugLine="Return Vue.HasState(k)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_hasstate" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 681;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("Hide (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "bananovm","hide", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 173;BA.debugLine="Sub Hide(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 174;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 175;BA.debugLine="Vue.SetStateSingle($\"${elID}show\"$, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("show")))),(Object)((bananovm.__c.getField(true,"False"))));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidedialog(RemoteObject __ref,RemoteObject _did) throws Exception{
try {
		Debug.PushSubsStack("HideDialog (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("hidedialog")) { return __ref.runUserSub(false, "bananovm","hidedialog", __ref, _did);}
Debug.locals.put("dID", _did);
 BA.debugLineNum = 143;BA.debugLine="Sub HideDialog(dID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="dID = dID.tolowercase";
Debug.JustUpdateDeviceLine();
_did = _did.runMethod(true,"toLowerCase");Debug.locals.put("dID", _did);
 BA.debugLineNum = 145;BA.debugLine="SetStateFalse(dID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatefalse" /*RemoteObject*/ ,(Object)(_did));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hideerror(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("HideError (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("hideerror")) { return __ref.runUserSub(false, "bananovm","hideerror", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 186;BA.debugLine="Sub HideError(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="Vue.SetStateSingle($\"${elID}error\"$, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("error")))),(Object)((bananovm.__c.getField(true,"False"))));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HideItems (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,710);
if (RapidSub.canDelegate("hideitems")) { return __ref.runUserSub(false, "bananovm","hideitems", __ref, _items);}
RemoteObject _item = RemoteObject.createImmutable("");
Debug.locals.put("items", _items);
 BA.debugLineNum = 710;BA.debugLine="Sub HideItems(items As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 711;BA.debugLine="For Each item As String In items";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _items;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 712;BA.debugLine="Vue.SetStateSingle(item, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_item),(Object)((bananovm.__c.getField(true,"False"))));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 714;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HR (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,541);
if (RapidSub.canDelegate("hr")) { return __ref.runUserSub(false, "bananovm","hr", __ref);}
 BA.debugLineNum = 541;BA.debugLine="Sub HR As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 542;BA.debugLine="Return \"<hr>\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("<hr>");
 BA.debugLineNum = 543;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HTTPUpload (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1718);
if (RapidSub.canDelegate("httpupload")) { return __ref.runUserSub(false, "bananovm","httpupload", __ref, _fileobj, _module, _methodname);}
Debug.locals.put("fileObj", _fileobj);
Debug.locals.put("module", _module);
Debug.locals.put("methodname", _methodname);
 BA.debugLineNum = 1718;BA.debugLine="Sub HTTPUpload(fileObj As Object, module As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1719;BA.debugLine="Vue.HTTPUpload(fileObj, module, methodname)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_httpupload" /*RemoteObject*/ ,(Object)(_fileobj),(Object)(_module),(Object)(_methodname));
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
public static RemoteObject  _incrementbadge(RemoteObject __ref,RemoteObject _elid,RemoteObject _counted) throws Exception{
try {
		Debug.PushSubsStack("IncrementBadge (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,489);
if (RapidSub.canDelegate("incrementbadge")) { return __ref.runUserSub(false, "bananovm","incrementbadge", __ref, _elid, _counted);}
RemoteObject _badvalue = RemoteObject.createImmutable("");
RemoteObject _lastvalue = RemoteObject.createImmutable("");
RemoteObject _intlast = RemoteObject.createImmutable(0);
Debug.locals.put("elID", _elid);
Debug.locals.put("counted", _counted);
 BA.debugLineNum = 489;BA.debugLine="Sub IncrementBadge(elID As String, counted As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 490;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 491;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
Debug.JustUpdateDeviceLine();
_badvalue = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("badgevalue")));Debug.locals.put("badValue", _badvalue);Debug.locals.put("badValue", _badvalue);
 BA.debugLineNum = 492;BA.debugLine="Dim lastValue As String = Vue.GetState(badValue,";
Debug.JustUpdateDeviceLine();
_lastvalue = BA.ObjectToString(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_badvalue),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("lastValue", _lastvalue);Debug.locals.put("lastValue", _lastvalue);
 BA.debugLineNum = 493;BA.debugLine="Dim intLast As Int = BANano.parseInt(lastValue)";
Debug.JustUpdateDeviceLine();
_intlast = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_lastvalue)));Debug.locals.put("intLast", _intlast);Debug.locals.put("intLast", _intlast);
 BA.debugLineNum = 494;BA.debugLine="intLast = intLast + counted";
Debug.JustUpdateDeviceLine();
_intlast = RemoteObject.solve(new RemoteObject[] {_intlast,_counted}, "+",1, 1);Debug.locals.put("intLast", _intlast);
 BA.debugLineNum = 495;BA.debugLine="Vue.SetStateSingle(badValue, intLast)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_badvalue),(Object)((_intlast)));
 BA.debugLineNum = 496;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 497;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initcolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitColors (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("initcolors")) { return __ref.runUserSub(false, "bananovm","initcolors", __ref);}
 BA.debugLineNum = 344;BA.debugLine="private Sub InitColors";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 345;BA.debugLine="IntensityOptions.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 346;BA.debugLine="IntensityOptions.put(\"\",\"Normal\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Normal"))));
 BA.debugLineNum = 347;BA.debugLine="IntensityOptions.put(\"lighten-1\",\"Lighten 1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lighten-1"))),(Object)((RemoteObject.createImmutable("Lighten 1"))));
 BA.debugLineNum = 348;BA.debugLine="IntensityOptions.put(\"lighten-2\",\"Lighten 2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lighten-2"))),(Object)((RemoteObject.createImmutable("Lighten 2"))));
 BA.debugLineNum = 349;BA.debugLine="IntensityOptions.put(\"lighten-3\",\"Lighten 3\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lighten-3"))),(Object)((RemoteObject.createImmutable("Lighten 3"))));
 BA.debugLineNum = 350;BA.debugLine="IntensityOptions.put(\"lighten-4\",\"Lighten 4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lighten-4"))),(Object)((RemoteObject.createImmutable("Lighten 4"))));
 BA.debugLineNum = 351;BA.debugLine="IntensityOptions.put(\"lighten-5\",\"Lighten 5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lighten-5"))),(Object)((RemoteObject.createImmutable("Lighten 5"))));
 BA.debugLineNum = 352;BA.debugLine="IntensityOptions.put(\"darken-1\",\"Darken 1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("darken-1"))),(Object)((RemoteObject.createImmutable("Darken 1"))));
 BA.debugLineNum = 353;BA.debugLine="IntensityOptions.put(\"darken-2\",\"Darken 2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("darken-2"))),(Object)((RemoteObject.createImmutable("Darken 2"))));
 BA.debugLineNum = 354;BA.debugLine="IntensityOptions.put(\"darken-3\",\"Darken 3\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("darken-3"))),(Object)((RemoteObject.createImmutable("Darken 3"))));
 BA.debugLineNum = 355;BA.debugLine="IntensityOptions.put(\"darken-4\",\"Darken 4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("darken-4"))),(Object)((RemoteObject.createImmutable("Darken 4"))));
 BA.debugLineNum = 356;BA.debugLine="IntensityOptions.put(\"accent-1\",\"Accent 1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent-1"))),(Object)((RemoteObject.createImmutable("Accent 1"))));
 BA.debugLineNum = 357;BA.debugLine="IntensityOptions.put(\"accent-2\",\"Accent 2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent-2"))),(Object)((RemoteObject.createImmutable("Accent 2"))));
 BA.debugLineNum = 358;BA.debugLine="IntensityOptions.put(\"accent-3\",\"Accent 3\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent-3"))),(Object)((RemoteObject.createImmutable("Accent 3"))));
 BA.debugLineNum = 359;BA.debugLine="IntensityOptions.put(\"accent-4\",\"Accent 4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_intensityoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent-4"))),(Object)((RemoteObject.createImmutable("Accent 4"))));
 BA.debugLineNum = 361;BA.debugLine="ColorOptions.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 362;BA.debugLine="ColorOptions.Put(\"amber\",\"Amber\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amber"))),(Object)((RemoteObject.createImmutable("Amber"))));
 BA.debugLineNum = 363;BA.debugLine="ColorOptions.Put(\"black\",\"Black\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("black"))),(Object)((RemoteObject.createImmutable("Black"))));
 BA.debugLineNum = 364;BA.debugLine="ColorOptions.Put(\"blue\",\"Blue\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue"))),(Object)((RemoteObject.createImmutable("Blue"))));
 BA.debugLineNum = 365;BA.debugLine="ColorOptions.Put(\"blue-grey\",\"Blue Grey\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blue-grey"))),(Object)((RemoteObject.createImmutable("Blue Grey"))));
 BA.debugLineNum = 366;BA.debugLine="ColorOptions.Put(\"brown\",\"Brown\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("brown"))),(Object)((RemoteObject.createImmutable("Brown"))));
 BA.debugLineNum = 367;BA.debugLine="ColorOptions.Put(\"cyan\",\"Cyan\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cyan"))),(Object)((RemoteObject.createImmutable("Cyan"))));
 BA.debugLineNum = 368;BA.debugLine="ColorOptions.Put(\"deep-orange\",\"Deep Orange\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-orange"))),(Object)((RemoteObject.createImmutable("Deep Orange"))));
 BA.debugLineNum = 369;BA.debugLine="ColorOptions.Put(\"deep-purple\",\"Deep Purple\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep-purple"))),(Object)((RemoteObject.createImmutable("Deep Purple"))));
 BA.debugLineNum = 370;BA.debugLine="ColorOptions.Put(\"green\",\"Green\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("green"))),(Object)((RemoteObject.createImmutable("Green"))));
 BA.debugLineNum = 371;BA.debugLine="ColorOptions.Put(\"grey\",\"Grey\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grey"))),(Object)((RemoteObject.createImmutable("Grey"))));
 BA.debugLineNum = 372;BA.debugLine="ColorOptions.Put(\"indigo\",\"Indigo\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indigo"))),(Object)((RemoteObject.createImmutable("Indigo"))));
 BA.debugLineNum = 373;BA.debugLine="ColorOptions.Put(\"light-blue\",\"Light Blue\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-blue"))),(Object)((RemoteObject.createImmutable("Light Blue"))));
 BA.debugLineNum = 374;BA.debugLine="ColorOptions.Put(\"light-green\", \"Light Green\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("light-green"))),(Object)((RemoteObject.createImmutable("Light Green"))));
 BA.debugLineNum = 375;BA.debugLine="ColorOptions.Put(\"lime\", \"Lime\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lime"))),(Object)((RemoteObject.createImmutable("Lime"))));
 BA.debugLineNum = 376;BA.debugLine="ColorOptions.Put(\"orange\", \"Orange\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orange"))),(Object)((RemoteObject.createImmutable("Orange"))));
 BA.debugLineNum = 377;BA.debugLine="ColorOptions.Put(\"pink\", \"Pink\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pink"))),(Object)((RemoteObject.createImmutable("Pink"))));
 BA.debugLineNum = 378;BA.debugLine="ColorOptions.Put(\"purple\", \"Purple\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("purple"))),(Object)((RemoteObject.createImmutable("Purple"))));
 BA.debugLineNum = 379;BA.debugLine="ColorOptions.Put(\"red\", \"Red\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("red"))),(Object)((RemoteObject.createImmutable("Red"))));
 BA.debugLineNum = 380;BA.debugLine="ColorOptions.Put(\"teal\", \"Teal\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("teal"))),(Object)((RemoteObject.createImmutable("Teal"))));
 BA.debugLineNum = 381;BA.debugLine="ColorOptions.Put(\"transparent\", \"Transparent\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("transparent"))),(Object)((RemoteObject.createImmutable("Transparent"))));
 BA.debugLineNum = 382;BA.debugLine="ColorOptions.Put(\"white\", \"White\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("white"))),(Object)((RemoteObject.createImmutable("White"))));
 BA.debugLineNum = 383;BA.debugLine="ColorOptions.Put(\"yellow\", \"Yellow\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_coloroptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yellow"))),(Object)((RemoteObject.createImmutable("Yellow"))));
 BA.debugLineNum = 385;BA.debugLine="BorderOptions.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 386;BA.debugLine="BorderOptions.Put(\"dashed\", \"Dashed\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dashed"))),(Object)((RemoteObject.createImmutable("Dashed"))));
 BA.debugLineNum = 387;BA.debugLine="BorderOptions.Put(\"dotted\", \"Dotted\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dotted"))),(Object)((RemoteObject.createImmutable("Dotted"))));
 BA.debugLineNum = 388;BA.debugLine="BorderOptions.Put(\"double\", \"Double\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("double"))),(Object)((RemoteObject.createImmutable("Double"))));
 BA.debugLineNum = 389;BA.debugLine="BorderOptions.Put(\"groove\", \"Groove\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("groove"))),(Object)((RemoteObject.createImmutable("Groove"))));
 BA.debugLineNum = 390;BA.debugLine="BorderOptions.Put(\"hidden\", \"Hidden\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("hidden"))),(Object)((RemoteObject.createImmutable("Hidden"))));
 BA.debugLineNum = 391;BA.debugLine="BorderOptions.Put(\"inset\", \"Inset\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inset"))),(Object)((RemoteObject.createImmutable("Inset"))));
 BA.debugLineNum = 392;BA.debugLine="BorderOptions.Put(\"none\", \"None\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("none"))),(Object)((RemoteObject.createImmutable("None"))));
 BA.debugLineNum = 393;BA.debugLine="BorderOptions.Put(\"outset\", \"Outset\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("outset"))),(Object)((RemoteObject.createImmutable("Outset"))));
 BA.debugLineNum = 394;BA.debugLine="BorderOptions.Put(\"ridge\", \"Ridge\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ridge"))),(Object)((RemoteObject.createImmutable("Ridge"))));
 BA.debugLineNum = 395;BA.debugLine="BorderOptions.Put(\"solid\", \"Solid\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_borderoptions" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("solid"))),(Object)((RemoteObject.createImmutable("Solid"))));
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _module,RemoteObject _sappname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1215);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bananovm","initialize", __ref, _ba, _module, _sappname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _e = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("module", _module);
Debug.locals.put("sAppName", _sappname);
 BA.debugLineNum = 1215;BA.debugLine="Public Sub Initialize(module As Object, sAppName A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1216;BA.debugLine="Pages.initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pages" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1217;BA.debugLine="Vue.Initialize()";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1218;BA.debugLine="Themes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_themes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1219;BA.debugLine="SetNeeds";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setneeds" /*RemoteObject*/ );
 BA.debugLineNum = 1220;BA.debugLine="JQuery = Vue.jquery";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jquery" /*RemoteObject*/ ,__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(false,"_jquery" /*RemoteObject*/ ));
 BA.debugLineNum = 1221;BA.debugLine="VM.Initialize(\"VueMaterial\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vm" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("VueMaterial"))));
 BA.debugLineNum = 1222;BA.debugLine="VueCal.Initialize(\"vuecal\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("vuecal"))));
 BA.debugLineNum = 1223;BA.debugLine="VueLoading.initialize(\"VueLoading\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vueloading" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("VueLoading"))));
 BA.debugLineNum = 1224;BA.debugLine="VMDef = VM.GetField(\"default\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vmdef" /*RemoteObject*/ ,__ref.getField(false,"_vm" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("default"))));
 BA.debugLineNum = 1225;BA.debugLine="Chartkick.initialize(\"Chartkick\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("Chartkick"))));
 BA.debugLineNum = 1226;BA.debugLine="Chart.Initialize(\"Chart\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chart" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("Chart"))));
 BA.debugLineNum = 1227;BA.debugLine="Vue.Use(Chartkick.RunMethod(\"use\", Chart))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_use" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("use")),(Object)((__ref.getField(false,"_chart" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 1228;BA.debugLine="Vue.Use(VMDef)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_use" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_vmdef" /*RemoteObject*/ )));
 BA.debugLineNum = 1229;BA.debugLine="Vue.Use(VueLoading)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_use" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_vueloading" /*RemoteObject*/ )));
 BA.debugLineNum = 1230;BA.debugLine="Vue.AddComponentBO(\"loading\",VueLoading)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_addcomponentbo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("loading")),(Object)(__ref.getField(false,"_vueloading" /*RemoteObject*/ )));
 BA.debugLineNum = 1231;BA.debugLine="Vue.AddComponentBO(\"vue-cal\", VueCal)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_addcomponentbo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("vue-cal")),(Object)(__ref.getField(false,"_vuecal" /*RemoteObject*/ )));
 BA.debugLineNum = 1232;BA.debugLine="App = CreateApp(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_app" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.bananovm.class, "_createapp" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1233;BA.debugLine="Vue.SetStateSingle(\"navbarmode\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("navbarmode")),(Object)(bananovm.__c.getField(false,"Null")));
 BA.debugLineNum = 1234;BA.debugLine="App.SetAttr1(\":md-mode\", \"navbarmode\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-mode")),(Object)((RemoteObject.createImmutable("navbarmode"))));
 BA.debugLineNum = 1235;BA.debugLine="Vue.SetState(CreateMap(\"navbartitle\":sAppName))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("navbartitle")),(_sappname)}))));
 BA.debugLineNum = 1236;BA.debugLine="Vue.SetState(CreateMap(\"drawertblbartitle\":sAppNa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("drawertblbartitle")),(_sappname)}))));
 BA.debugLineNum = 1237;BA.debugLine="Vue.SetState(CreateMap(\"snack\":False,\"backshow\":F";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("snack")),(bananovm.__c.getField(true,"False")),RemoteObject.createImmutable(("backshow")),(bananovm.__c.getField(true,"False")),RemoteObject.createImmutable(("menushow")),(bananovm.__c.getField(true,"True"))}))));
 BA.debugLineNum = 1238;BA.debugLine="Vue.SetState(CreateMap(\"alerttitle\":\"\",\"alertmess";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("alerttitle")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("alertmessage")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("alertkey")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("snackmessage")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("confirmtext")),(RemoteObject.createImmutable(""))}))));
 BA.debugLineNum = 1239;BA.debugLine="Vue.SetState(CreateMap(\"confirmtitle\":\"\",\"confirm";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("confirmtitle")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("confirmmessage")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("confirmkey")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("confirmtext")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("canceltext")),(RemoteObject.createImmutable(""))}))));
 BA.debugLineNum = 1240;BA.debugLine="NavBar.Initialize(Vue, \"navbar\", module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(BA.ObjectToString("navbar")),(Object)(_module));
 BA.debugLineNum = 1241;BA.debugLine="Drawer.Initialize(Vue, \"drawer\", module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(BA.ObjectToString("drawer")),(Object)(_module));
 BA.debugLineNum = 1242;BA.debugLine="Content = CreateAppContent(\"content\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_content" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.bananovm.class, "_createappcontent" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("content"))));
 BA.debugLineNum = 1243;BA.debugLine="NavBar.SetHasBackButton(False).SetAppToolbar(True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_sethasbackbutton" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"False"))).runClassMethod (b4j.example.vmtoolbar.class, "_setapptoolbar" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1244;BA.debugLine="NavBar.SetHasMenuButton(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_sethasmenubutton" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1247;BA.debugLine="Overlay = CreateLoader(\"pageloader\", module)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_overlay" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.bananovm.class, "_createloader" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pageloader")),(Object)(_module)));
 BA.debugLineNum = 1248;BA.debugLine="Overlay.Pop(Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_overlay" /*RemoteObject*/ ).runClassMethod (b4j.example.vmloader.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 1250;BA.debugLine="CreateButton(\"back\",module).SetIconButton(True).S";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_createbutton" /*RemoteObject*/ ,(Object)(BA.ObjectToString("back")),(Object)(_module)).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True"))).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("keyboard_arrow_left"))).runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_navbar" /*RemoteObject*/ ).getField(false,"_startsection" /*RemoteObject*/ )));
 BA.debugLineNum = 1251;BA.debugLine="CreateButton(\"menu\",module).SetIconButton(True).S";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_createbutton" /*RemoteObject*/ ,(Object)(BA.ObjectToString("menu")),(Object)(_module)).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True"))).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("menu"))).runClassMethod (b4j.example.vmbutton.class, "_setonclick" /*RemoteObject*/ ,(Object)(__ref)).runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_navbar" /*RemoteObject*/ ).getField(false,"_startsection" /*RemoteObject*/ )));
 BA.debugLineNum = 1253;BA.debugLine="NavBar.SetHasLogo(False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_sethaslogo" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"False")));
 BA.debugLineNum = 1254;BA.debugLine="NavBar.SetLogo(\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_setlogo" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1256;BA.debugLine="Alert = CreateAlert(\"alert\",module).SetTitle(\"Ale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_alert" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.bananovm.class, "_createalert" /*RemoteObject*/ ,(Object)(BA.ObjectToString("alert")),(Object)(_module)).runClassMethod (b4j.example.vmalert.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Alert"))).runClassMethod (b4j.example.vmalert.class, "_setconfirmtext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Ok"))).runClassMethod (b4j.example.vmalert.class, "_setcontent" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Alert Content!"))));
 BA.debugLineNum = 1257;BA.debugLine="Alert.Pop(Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmalert.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 1259;BA.debugLine="Confirm = CreateConfirm(\"confirm\",module).SetTitl";
Debug.JustUpdateDeviceLine();
__ref.setField ("_confirm" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.bananovm.class, "_createconfirm" /*RemoteObject*/ ,(Object)(BA.ObjectToString("confirm")),(Object)(_module)).runClassMethod (b4j.example.vmconfirm.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Title"))).runClassMethod (b4j.example.vmconfirm.class, "_setcontent" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Content"))));
 BA.debugLineNum = 1260;BA.debugLine="Confirm.SetConfirmText(\"Ok\").SetCancelText(\"Cance";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmconfirm.class, "_setconfirmtext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Ok"))).runClassMethod (b4j.example.vmconfirm.class, "_setcanceltext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 1261;BA.debugLine="Confirm.Pop(Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmconfirm.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 1263;BA.debugLine="Prompt = CreatePrompt(\"prompt\", module).SetTitle(";
Debug.JustUpdateDeviceLine();
__ref.setField ("_prompt" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.bananovm.class, "_createprompt" /*RemoteObject*/ ,(Object)(BA.ObjectToString("prompt")),(Object)(_module)).runClassMethod (b4j.example.vmprompt.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Title"))).runClassMethod (b4j.example.vmprompt.class, "_setcontent" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Content"))).runClassMethod (b4j.example.vmprompt.class, "_setmaxlength" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 20))).runClassMethod (b4j.example.vmprompt.class, "_setplaceholder" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Placeholder"))));
 BA.debugLineNum = 1264;BA.debugLine="Prompt.SetConfirmText(\"Ok\").SetCancelText(\"Cancel";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmprompt.class, "_setconfirmtext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Ok"))).runClassMethod (b4j.example.vmprompt.class, "_setcanceltext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 1265;BA.debugLine="Prompt.Pop(Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmprompt.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 1267;BA.debugLine="Snack = CreateSnackBar(\"snack\",module)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_snack" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.bananovm.class, "_createsnackbar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("snack")),(Object)(_module)));
 BA.debugLineNum = 1268;BA.debugLine="Snack.Pop(Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snack" /*RemoteObject*/ ).runClassMethod (b4j.example.vmsnackbar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 1270;BA.debugLine="If SubExists(module, \"confirm_cancel\") = False Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",bananovm.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(RemoteObject.createImmutable("confirm_cancel"))),bananovm.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1271;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a conf";
Debug.JustUpdateDeviceLine();
bananovm.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Initialize: Pleasure ensure you have a confirm_cancel event!")));
 };
 BA.debugLineNum = 1274;BA.debugLine="If SubExists(module, \"confirm_ok\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",bananovm.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(RemoteObject.createImmutable("confirm_ok"))),bananovm.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1275;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a conf";
Debug.JustUpdateDeviceLine();
bananovm.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Initialize: Pleasure ensure you have a confirm_ok event!")));
 };
 BA.debugLineNum = 1278;BA.debugLine="If SubExists(module, \"prompt_cancel\") = False The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",bananovm.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(RemoteObject.createImmutable("prompt_cancel"))),bananovm.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1279;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a prom";
Debug.JustUpdateDeviceLine();
bananovm.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Initialize: Pleasure ensure you have a prompt_cancel event!")));
 };
 BA.debugLineNum = 1282;BA.debugLine="If SubExists(module, \"prompt_ok\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",bananovm.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(RemoteObject.createImmutable("prompt_ok"))),bananovm.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1283;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a prom";
Debug.JustUpdateDeviceLine();
bananovm.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Initialize: Pleasure ensure you have a prompt_ok event!")));
 };
 BA.debugLineNum = 1286;BA.debugLine="InitColors";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_initcolors" /*RemoteObject*/ );
 BA.debugLineNum = 1287;BA.debugLine="Vue.Template.AddClass(\"page-container\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("page-container")));
 BA.debugLineNum = 1288;BA.debugLine="Container.Initialize(Vue, sAppName & \"page\", modu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.concat(_sappname,RemoteObject.createImmutable("page"))),(Object)(_module));
 BA.debugLineNum = 1290;BA.debugLine="Dim e As Int";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createImmutable(0);Debug.locals.put("e", _e);
 BA.debugLineNum = 1291;BA.debugLine="For e = 0 To 24";
Debug.JustUpdateDeviceLine();
{
final int step62 = 1;
final int limit62 = 24;
_e = BA.numberCast(int.class, 0) ;
for (;(step62 > 0 && _e.<Integer>get().intValue() <= limit62) || (step62 < 0 && _e.<Integer>get().intValue() >= limit62) ;_e = RemoteObject.createImmutable((int)(0 + _e.<Integer>get().intValue() + step62))  ) {
Debug.locals.put("e", _e);
 BA.debugLineNum = 1292;BA.debugLine="Elevation.Put(e, e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_elevation" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_e)),(Object)((_e)));
 }
}Debug.locals.put("e", _e);
;
 BA.debugLineNum = 1294;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _instr(RemoteObject __ref,RemoteObject _searchit,RemoteObject _searchfor) throws Exception{
try {
		Debug.PushSubsStack("InStr (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("instr")) { return __ref.runUserSub(false, "bananovm","instr", __ref, _searchit, _searchfor);}
Debug.locals.put("searchit", _searchit);
Debug.locals.put("searchfor", _searchfor);
 BA.debugLineNum = 222;BA.debugLine="Sub InStr(searchit As String, searchfor As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 223;BA.debugLine="Return Vue.InStr(searchit, searchfor)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_instr" /*RemoteObject*/ ,(Object)(_searchit),(Object)(_searchfor));
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinlists(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("JoinLists (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("joinlists")) { return __ref.runUserSub(false, "bananovm","joinlists", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 71;BA.debugLine="Sub JoinLists(lst As List) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Return Vue.JoinLists(lst)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_joinlists" /*RemoteObject*/ ,(Object)(_lst));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("JoinMaps (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1105);
if (RapidSub.canDelegate("joinmaps")) { return __ref.runUserSub(false, "bananovm","joinmaps", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1105;BA.debugLine="Sub JoinMaps(lst As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1106;BA.debugLine="Return Vue.JoinMaps(lst)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_joinmaps" /*RemoteObject*/ ,(Object)(_lst));
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
public static RemoteObject  _joinnonblanks(RemoteObject __ref,RemoteObject _delimiter,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("JoinNonBlanks (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1101);
if (RapidSub.canDelegate("joinnonblanks")) { return __ref.runUserSub(false, "bananovm","joinnonblanks", __ref, _delimiter, _lst);}
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1101;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1102;BA.debugLine="Return Vue.JoinNonBlanks(delimiter, lst)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_joinnonblanks" /*RemoteObject*/ ,(Object)(_delimiter),(Object)(_lst));
 BA.debugLineNum = 1103;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("JQueryElement (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1707);
if (RapidSub.canDelegate("jqueryelement")) { return __ref.runUserSub(false, "bananovm","jqueryelement", __ref, _sid);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1707;BA.debugLine="Sub JQueryElement(sid As String) As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1708;BA.debugLine="sid = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
_sid = _sid.runMethod(true,"toLowerCase");Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1709;BA.debugLine="Dim bo As BANanoObject = JQuery.Selector($\"#${sid";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_jquery" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("#"),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable(""))))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 1710;BA.debugLine="Return bo";
Debug.JustUpdateDeviceLine();
if (true) return _bo;
 BA.debugLineNum = 1711;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("JSONPretty (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("jsonpretty")) { return __ref.runUserSub(false, "bananovm","jsonpretty", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 279;BA.debugLine="Sub JSONPretty(m As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 280;BA.debugLine="Return Vue.JSONPretty(m)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_jsonpretty" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 281;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("JSONSetProperty (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("jsonsetproperty")) { return __ref.runUserSub(false, "bananovm","jsonsetproperty", __ref, _sjson, _updates);}
Debug.locals.put("sjson", _sjson);
Debug.locals.put("updates", _updates);
 BA.debugLineNum = 230;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="Return Vue.JSONSetProperty(sjson, updates)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_jsonsetproperty" /*RemoteObject*/ ,(Object)(_sjson),(Object)(_updates));
 BA.debugLineNum = 232;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Len (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("len")) { return __ref.runUserSub(false, "bananovm","len", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 336;BA.debugLine="private Sub Len(Text As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="Return Text.Length";
Debug.JustUpdateDeviceLine();
if (true) return _text.runMethod(true,"length");
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2map(RemoteObject __ref,RemoteObject _lst,RemoteObject _keyname,RemoteObject _valuename) throws Exception{
try {
		Debug.PushSubsStack("List2Map (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,700);
if (RapidSub.canDelegate("list2map")) { return __ref.runUserSub(false, "bananovm","list2map", __ref, _lst, _keyname, _valuename);}
Debug.locals.put("lst", _lst);
Debug.locals.put("keyName", _keyname);
Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 700;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 701;BA.debugLine="Return List2Options(lst, keyName, valueName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananovm.class, "_list2options" /*RemoteObject*/ ,(Object)(_lst),(Object)(_keyname),(Object)(_valuename));
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
public static RemoteObject  _list2options(RemoteObject __ref,RemoteObject _lst,RemoteObject _keyname,RemoteObject _valuename) throws Exception{
try {
		Debug.PushSubsStack("List2Options (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,695);
if (RapidSub.canDelegate("list2options")) { return __ref.runUserSub(false, "bananovm","list2options", __ref, _lst, _keyname, _valuename);}
Debug.locals.put("lst", _lst);
Debug.locals.put("keyName", _keyname);
Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 695;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 696;BA.debugLine="Return List2Options(lst, keyName, valueName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananovm.class, "_list2options" /*RemoteObject*/ ,(Object)(_lst),(Object)(_keyname),(Object)(_valuename));
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
public static RemoteObject  _makeboolean(RemoteObject __ref,RemoteObject _m,RemoteObject _xkeys) throws Exception{
try {
		Debug.PushSubsStack("MakeBoolean (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1077);
if (RapidSub.canDelegate("makeboolean")) { return __ref.runUserSub(false, "bananovm","makeboolean", __ref, _m, _xkeys);}
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1077;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1078;BA.debugLine="Vue.MakeBoolean(m, xkeys)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makeboolean" /*RemoteObject*/ ,(Object)(_m),(Object)(_xkeys));
 BA.debugLineNum = 1079;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MakeDate (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1109);
if (RapidSub.canDelegate("makedate")) { return __ref.runUserSub(false, "bananovm","makedate", __ref, _m, _xkeys);}
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1109;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1110;BA.debugLine="Vue.MakeDate(m, xkeys)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makedate" /*RemoteObject*/ ,(Object)(_m),(Object)(_xkeys));
 BA.debugLineNum = 1111;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MakeDouble (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1069);
if (RapidSub.canDelegate("makedouble")) { return __ref.runUserSub(false, "bananovm","makedouble", __ref, _m, _xkeys);}
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1069;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1070;BA.debugLine="Vue.MakeDouble(m, xkeys)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makedouble" /*RemoteObject*/ ,(Object)(_m),(Object)(_xkeys));
 BA.debugLineNum = 1071;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MakeInteger (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1073);
if (RapidSub.canDelegate("makeinteger")) { return __ref.runUserSub(false, "bananovm","makeinteger", __ref, _m, _xkeys);}
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1073;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1074;BA.debugLine="Vue.MakeInteger(m, xkeys)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makeinteger" /*RemoteObject*/ ,(Object)(_m),(Object)(_xkeys));
 BA.debugLineNum = 1075;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MakeLowerCase (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1714);
if (RapidSub.canDelegate("makelowercase")) { return __ref.runUserSub(false, "bananovm","makelowercase", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 1714;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1715;BA.debugLine="Return Vue.MakeLowerCase(m)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makelowercase" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 1716;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MakePx (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1147);
if (RapidSub.canDelegate("makepx")) { return __ref.runUserSub(false, "bananovm","makepx", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1147;BA.debugLine="Sub MakePx(sValue As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1148;BA.debugLine="Return Vue.MakePx(sValue)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makepx" /*RemoteObject*/ ,(Object)(_svalue));
 BA.debugLineNum = 1149;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MakeTrim (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1081);
if (RapidSub.canDelegate("maketrim")) { return __ref.runUserSub(false, "bananovm","maketrim", __ref, _m, _xkeys);}
Debug.locals.put("m", _m);
Debug.locals.put("xkeys", _xkeys);
 BA.debugLineNum = 1081;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1082;BA.debugLine="Vue.MakeTrim(m, xkeys)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_maketrim" /*RemoteObject*/ ,(Object)(_m),(Object)(_xkeys));
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
public static RemoteObject  _map2options(RemoteObject __ref,RemoteObject _m,RemoteObject _keyname,RemoteObject _valuename) throws Exception{
try {
		Debug.PushSubsStack("Map2Options (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,705);
if (RapidSub.canDelegate("map2options")) { return __ref.runUserSub(false, "bananovm","map2options", __ref, _m, _keyname, _valuename);}
Debug.locals.put("m", _m);
Debug.locals.put("keyName", _keyname);
Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 705;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 706;BA.debugLine="Return Vue.Map2Options(m, keyName, valueName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_map2options" /*RemoteObject*/ ,(Object)(_m),(Object)(_keyname),(Object)(_valuename));
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
public static RemoteObject  _md5hash(RemoteObject __ref,RemoteObject _value,RemoteObject _key,RemoteObject _raw) throws Exception{
try {
		Debug.PushSubsStack("Md5Hash (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("md5hash")) { return __ref.runUserSub(false, "bananovm","md5hash", __ref, _value, _key, _raw);}
Debug.locals.put("value", _value);
Debug.locals.put("key", _key);
Debug.locals.put("raw", _raw);
 BA.debugLineNum = 256;BA.debugLine="Sub Md5Hash(value As String, key As String, raw As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="Return Vue.Md5Hash(value, key, raw)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_md5hash" /*RemoteObject*/ ,(Object)(_value),(Object)(_key),(Object)(_raw));
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menu_click(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("menu_click (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1340);
if (RapidSub.canDelegate("menu_click")) { return __ref.runUserSub(false, "bananovm","menu_click", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 1340;BA.debugLine="Sub menu_click(e As BANanoEvent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1341;BA.debugLine="Drawer.Toggle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_toggle" /*RemoteObject*/ );
 BA.debugLineNum = 1342;BA.debugLine="NavBar.ToggleMenu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_togglemenu" /*RemoteObject*/ );
 BA.debugLineNum = 1343;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MergeMaps (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("mergemaps")) { return __ref.runUserSub(false, "bananovm","mergemaps", __ref, _oldm, _newm);}
Debug.locals.put("oldm", _oldm);
Debug.locals.put("newm", _newm);
 BA.debugLineNum = 419;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 420;BA.debugLine="Return Vue.MergeMaps(oldm, newm)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_mergemaps" /*RemoteObject*/ ,(Object)(_oldm),(Object)(_newm));
 BA.debugLineNum = 421;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mvfield(RemoteObject __ref,RemoteObject _svalue,RemoteObject _iposition,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("MvField (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("mvfield")) { return __ref.runUserSub(false, "bananovm","mvfield", __ref, _svalue, _iposition, _delimiter);}
Debug.locals.put("sValue", _svalue);
Debug.locals.put("iPosition", _iposition);
Debug.locals.put("Delimiter", _delimiter);
 BA.debugLineNum = 320;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="Return Vue.MvField(sValue, iPosition, Delimiter)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_mvfield" /*RemoteObject*/ ,(Object)(_svalue),(Object)(_iposition),(Object)(_delimiter));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("PadRight (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("padright")) { return __ref.runUserSub(false, "bananovm","padright", __ref, _value, _maxlen, _padchar);}
Debug.locals.put("Value", _value);
Debug.locals.put("MaxLen", _maxlen);
Debug.locals.put("PadChar", _padchar);
 BA.debugLineNum = 331;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 332;BA.debugLine="Return Vue.PadRight(Value, MaxLen, PadChar)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_padright" /*RemoteObject*/ ,(Object)(_value),(Object)(_maxlen),(Object)(_padchar));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagepause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PagePause (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1736);
if (RapidSub.canDelegate("pagepause")) { return __ref.runUserSub(false, "bananovm","pagepause", __ref);}
 BA.debugLineNum = 1736;BA.debugLine="Sub PagePause";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1737;BA.debugLine="Overlay.SetIsLoading(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_overlay" /*RemoteObject*/ ).runClassMethod (b4j.example.vmloader.class, "_setisloading" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"True")));
 BA.debugLineNum = 1738;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagerefresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PageRefresh (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,911);
if (RapidSub.canDelegate("pagerefresh")) { return __ref.runUserSub(false, "bananovm","pagerefresh", __ref);}
 BA.debugLineNum = 911;BA.debugLine="Sub PageRefresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 912;BA.debugLine="If HasInfoBox Then SetInfoBox";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasinfobox" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.bananovm.class, "_setinfobox" /*RemoteObject*/ );};
 BA.debugLineNum = 913;BA.debugLine="If HasKnob Then SetKnob";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasknob" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.bananovm.class, "_setknob" /*RemoteObject*/ );};
 BA.debugLineNum = 914;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pageresume(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PageResume (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1741);
if (RapidSub.canDelegate("pageresume")) { return __ref.runUserSub(false, "bananovm","pageresume", __ref);}
 BA.debugLineNum = 1741;BA.debugLine="Sub PageResume";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1742;BA.debugLine="Overlay.SetIsLoading(False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_overlay" /*RemoteObject*/ ).runClassMethod (b4j.example.vmloader.class, "_setisloading" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(true,"False")));
 BA.debugLineNum = 1743;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prepare(RemoteObject __ref,RemoteObject _keys) throws Exception{
try {
		Debug.PushSubsStack("Prepare (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1086);
if (RapidSub.canDelegate("prepare")) { return __ref.runUserSub(false, "bananovm","prepare", __ref, _keys);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _sk = RemoteObject.createImmutable("");
Debug.locals.put("keys", _keys);
 BA.debugLineNum = 1086;BA.debugLine="Sub Prepare(keys As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1087;BA.debugLine="For Each k As String In keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _keys;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1088;BA.debugLine="Dim sk As String = GetState(k,\"\")";
Debug.JustUpdateDeviceLine();
_sk = BA.ObjectToString(__ref.runClassMethod (b4j.example.bananovm.class, "_getstate" /*RemoteObject*/ ,(Object)(_k),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sk", _sk);Debug.locals.put("sk", _sk);
 BA.debugLineNum = 1089;BA.debugLine="sk = Date2YYYYMMDD(sk)";
Debug.JustUpdateDeviceLine();
_sk = __ref.runClassMethod (b4j.example.bananovm.class, "_date2yyyymmdd" /*RemoteObject*/ ,(Object)((_sk)));Debug.locals.put("sk", _sk);
 BA.debugLineNum = 1090;BA.debugLine="SetStateSingle(k, sk)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((_k)),(Object)((_sk)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1092;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("RunMethod (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,764);
if (RapidSub.canDelegate("runmethod")) { return __ref.runUserSub(false, "bananovm","runmethod", __ref, _methodname, _params);}
Debug.locals.put("methodName", _methodname);
Debug.locals.put("params", _params);
 BA.debugLineNum = 764;BA.debugLine="Sub RunMethod(methodName As String, params As Obje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 765;BA.debugLine="Return Vue.RunMethod(methodName, params)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_runmethod" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_params));
 BA.debugLineNum = 766;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivated(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetActivated (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1156);
if (RapidSub.canDelegate("setactivated")) { return __ref.runUserSub(false, "bananovm","setactivated", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1156;BA.debugLine="Sub SetActivated(module As Object, methodName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1157;BA.debugLine="Vue.SetActivated(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setactivated" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1158;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1159;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBackgroundImage (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1137);
if (RapidSub.canDelegate("setbackgroundimage")) { return __ref.runUserSub(false, "bananovm","setbackgroundimage", __ref, _url);}
Debug.locals.put("url", _url);
 BA.debugLineNum = 1137;BA.debugLine="Sub SetBackgroundImage(url As String) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1138;BA.debugLine="Content.SetBackgroundImage(url)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setbackgroundimage" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 1139;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforecreate(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeCreate (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1192);
if (RapidSub.canDelegate("setbeforecreate")) { return __ref.runUserSub(false, "bananovm","setbeforecreate", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1192;BA.debugLine="Sub SetBeforeCreate(module As Object, methodName A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1193;BA.debugLine="Vue.SetBeforeCreate(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setbeforecreate" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1194;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1195;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBeforeDestroy (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1187);
if (RapidSub.canDelegate("setbeforedestroy")) { return __ref.runUserSub(false, "bananovm","setbeforedestroy", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1187;BA.debugLine="Sub SetBeforeDestroy(module As Object, methodName";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1188;BA.debugLine="Vue.SetBeforeDestroy(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setbeforedestroy" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1189;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1190;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBeforeMount (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1177);
if (RapidSub.canDelegate("setbeforemount")) { return __ref.runUserSub(false, "bananovm","setbeforemount", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1177;BA.debugLine="Sub SetBeforeMount(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1178;BA.debugLine="Vue.SetBeforeMount(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setbeforemount" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1179;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1180;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBeforeUpdate (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1182);
if (RapidSub.canDelegate("setbeforeupdate")) { return __ref.runUserSub(false, "bananovm","setbeforeupdate", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1182;BA.debugLine="Sub SetBeforeUpdate(module As Object, methodName A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1183;BA.debugLine="Vue.SetBeforeUpdate(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setbeforeupdate" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1184;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1185;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcallback(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetCallBack (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1331);
if (RapidSub.canDelegate("setcallback")) { return __ref.runUserSub(false, "bananovm","setcallback", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1331;BA.debugLine="Sub SetCallBack(module As Object, methodName As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1332;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1333;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",bananovm.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),bananovm.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 1334;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 1335;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 1336;BA.debugLine="Vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 1337;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1338;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcloak(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCloak (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setcloak")) { return __ref.runUserSub(false, "bananovm","setcloak", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 148;BA.debugLine="Sub SetCloak(b As Boolean) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="Vue.SetCloak(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcloak" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 150;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetComputed (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1161);
if (RapidSub.canDelegate("setcomputed")) { return __ref.runUserSub(false, "bananovm","setcomputed", __ref, _k, _module, _methodname);}
Debug.locals.put("k", _k);
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1161;BA.debugLine="Sub SetComputed(k As String, module As Object, met";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1162;BA.debugLine="Vue.SetComputed(k, module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcomputed" /*RemoteObject*/ ,(Object)(_k),(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1163;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcreated(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetCreated (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,759);
if (RapidSub.canDelegate("setcreated")) { return __ref.runUserSub(false, "bananovm","setcreated", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 759;BA.debugLine="Sub SetCreated(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 760;BA.debugLine="Vue.SetCreated(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcreated" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 761;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 762;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdateformat(RemoteObject __ref,RemoteObject _df) throws Exception{
try {
		Debug.PushSubsStack("SetDateFormat (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,673);
if (RapidSub.canDelegate("setdateformat")) { return __ref.runUserSub(false, "bananovm","setdateformat", __ref, _df);}
Debug.locals.put("df", _df);
 BA.debugLineNum = 673;BA.debugLine="Sub SetDateFormat(df As String) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 674;BA.debugLine="material.GetField(\"locale\").SetField(\"dateFormat\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_material" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("locale"))).runVoidMethod ("SetField",(Object)(BA.ObjectToString("dateFormat")),(Object)((_df)));
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
public static RemoteObject  _setdeactivated(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetDeActivated (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1167);
if (RapidSub.canDelegate("setdeactivated")) { return __ref.runUserSub(false, "bananovm","setdeactivated", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1167;BA.debugLine="Sub SetDeActivated(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1168;BA.debugLine="Vue.SetDeActivated(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setdeactivated" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1169;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1170;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDestroyed (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1151);
if (RapidSub.canDelegate("setdestroyed")) { return __ref.runUserSub(false, "bananovm","setdestroyed", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1151;BA.debugLine="Sub SetDestroyed(module As Object, methodName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1152;BA.debugLine="Vue.SetDestroyed(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setdestroyed" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1153;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1154;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabledState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1051);
if (RapidSub.canDelegate("setdisabledstate")) { return __ref.runUserSub(false, "bananovm","setdisabledstate", __ref, _k, _v);}
RemoteObject _diskey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1051;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1052;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("disabled")));Debug.locals.put("disKey", _diskey);Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1053;BA.debugLine="SetStateSingle(disKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((_diskey)),(Object)((_v)));
 BA.debugLineNum = 1054;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _elid,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetEnabled (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "bananovm","setenabled", __ref, _elid, _b);}
Debug.locals.put("elID", _elid);
Debug.locals.put("b", _b);
 BA.debugLineNum = 168;BA.debugLine="Sub SetEnabled(elID As String, b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 169;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 170;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("disabled")))),(Object)((_b)));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetErrorState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1041);
if (RapidSub.canDelegate("seterrorstate")) { return __ref.runUserSub(false, "bananovm","seterrorstate", __ref, _k, _v);}
RemoteObject _showkey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1041;BA.debugLine="Sub SetErrorState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1042;BA.debugLine="Dim showKey As String = $\"${k}error\"$";
Debug.JustUpdateDeviceLine();
_showkey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("error")));Debug.locals.put("showKey", _showkey);Debug.locals.put("showKey", _showkey);
 BA.debugLineNum = 1043;BA.debugLine="SetStateSingle(showKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((_showkey)),(Object)((_v)));
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetFontFamily (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,790);
if (RapidSub.canDelegate("setfontfamily")) { return __ref.runUserSub(false, "bananovm","setfontfamily", __ref, _ff);}
Debug.locals.put("ff", _ff);
 BA.debugLineNum = 790;BA.debugLine="private Sub SetFontFamily(ff As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 791;BA.debugLine="Vue.SetFontFamily(ff)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setfontfamily" /*RemoteObject*/ ,(Object)(_ff));
 BA.debugLineNum = 792;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgmapkey(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("SetGMapKey (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setgmapkey")) { return __ref.runUserSub(false, "bananovm","setgmapkey", __ref, _key);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _load = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("key", _key);
 BA.debugLineNum = 45;BA.debugLine="Sub SetGMapKey(key As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="VueGoogleMaps.Initialize(\"VueGoogleMaps\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuegooglemaps" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("VueGoogleMaps"))));
 BA.debugLineNum = 47;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 48;BA.debugLine="Dim load As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_load = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_load = bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("load", _load);Debug.locals.put("load", _load);
 BA.debugLineNum = 49;BA.debugLine="load.Put(\"key\", key)";
Debug.JustUpdateDeviceLine();
_load.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("key"))),(Object)((_key)));
 BA.debugLineNum = 50;BA.debugLine="load.Put(\"libraries\", \"places\")";
Debug.JustUpdateDeviceLine();
_load.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("libraries"))),(Object)((RemoteObject.createImmutable("places"))));
 BA.debugLineNum = 51;BA.debugLine="opt.Put(\"load\", load)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("load"))),(Object)((_load.getObject())));
 BA.debugLineNum = 52;BA.debugLine="opt.Put(\"installComponents\", True)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("installComponents"))),(Object)((bananovm.__c.getField(true,"True"))));
 BA.debugLineNum = 53;BA.debugLine="Vue.Use1(VueGoogleMaps, opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_use1" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_vuegooglemaps" /*RemoteObject*/ )),(Object)(_opt));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinfobox(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetInfoBox (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1727);
if (RapidSub.canDelegate("setinfobox")) { return __ref.runUserSub(false, "bananovm","setinfobox", __ref);}
 BA.debugLineNum = 1727;BA.debugLine="Sub SetInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1728;BA.debugLine="JQuery.Selector(\".count-to\").RunMethod(\"countTo\",";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jquery" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)((RemoteObject.createImmutable(".count-to")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("countTo")),(Object)(bananovm.__c.getField(false,"Null")));
 BA.debugLineNum = 1729;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setknob(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetKnob (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1731);
if (RapidSub.canDelegate("setknob")) { return __ref.runUserSub(false, "bananovm","setknob", __ref);}
 BA.debugLineNum = 1731;BA.debugLine="Sub SetKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1732;BA.debugLine="BANano.RunJavascriptMethod(\"tron\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunJavascriptMethod",(Object)(BA.ObjectToString("tron")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananovm.__c.getField(false,"Null")));
 BA.debugLineNum = 1733;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMethod (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,753);
if (RapidSub.canDelegate("setmethod")) { return __ref.runUserSub(false, "bananovm","setmethod", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 753;BA.debugLine="Sub SetMethod(module As Object, methodName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 754;BA.debugLine="Vue.SetMethod(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setmethod" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 755;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 756;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMounted (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,833);
if (RapidSub.canDelegate("setmounted")) { return __ref.runUserSub(false, "bananovm","setmounted", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 833;BA.debugLine="Sub SetMounted(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 834;BA.debugLine="Vue.SetMounted(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setmounted" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 835;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 836;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setneeds(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetNeeds (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1021);
if (RapidSub.canDelegate("setneeds")) { return __ref.runUserSub(false, "bananovm","setneeds", __ref);}
 BA.debugLineNum = 1021;BA.debugLine="private Sub SetNeeds";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1022;BA.debugLine="HasKnob = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasknob" /*RemoteObject*/ ,bananovm.__c.getField(true,"False"));
 BA.debugLineNum = 1023;BA.debugLine="HasInfoBox = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasinfobox" /*RemoteObject*/ ,bananovm.__c.getField(true,"False"));
 BA.debugLineNum = 1024;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogressbuffer(RemoteObject __ref,RemoteObject _pid,RemoteObject _bval) throws Exception{
try {
		Debug.PushSubsStack("SetProgressBuffer (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("setprogressbuffer")) { return __ref.runUserSub(false, "bananovm","setprogressbuffer", __ref, _pid, _bval);}
Debug.locals.put("pID", _pid);
Debug.locals.put("bVal", _bval);
 BA.debugLineNum = 116;BA.debugLine="Sub SetProgressBuffer(pID As String, bVal As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="pID = pID.ToLowerCase";
Debug.JustUpdateDeviceLine();
_pid = _pid.runMethod(true,"toLowerCase");Debug.locals.put("pID", _pid);
 BA.debugLineNum = 118;BA.debugLine="SetStateSingle($\"${pID}buffer\"$, bVal)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pid))),RemoteObject.createImmutable("buffer"))))),(Object)((_bval)));
 BA.debugLineNum = 119;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogressvalue(RemoteObject __ref,RemoteObject _pid,RemoteObject _pval) throws Exception{
try {
		Debug.PushSubsStack("SetProgressValue (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("setprogressvalue")) { return __ref.runUserSub(false, "bananovm","setprogressvalue", __ref, _pid, _pval);}
Debug.locals.put("pID", _pid);
Debug.locals.put("pVal", _pval);
 BA.debugLineNum = 109;BA.debugLine="Sub SetProgressValue(pID As String, pVal As Int) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="pID = pID.ToLowerCase";
Debug.JustUpdateDeviceLine();
_pid = _pid.runMethod(true,"toLowerCase");Debug.locals.put("pID", _pid);
 BA.debugLineNum = 111;BA.debugLine="SetStateSingle($\"${pID}value\"$, pVal)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pid))),RemoteObject.createImmutable("value"))))),(Object)((_pval)));
 BA.debugLineNum = 112;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprompt(RemoteObject __ref,RemoteObject _pvalue) throws Exception{
try {
		Debug.PushSubsStack("SetPrompt (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1302);
if (RapidSub.canDelegate("setprompt")) { return __ref.runUserSub(false, "bananovm","setprompt", __ref, _pvalue);}
Debug.locals.put("pvalue", _pvalue);
 BA.debugLineNum = 1302;BA.debugLine="Sub SetPrompt(pvalue As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1303;BA.debugLine="Vue.SetStateSingle(\"promptvalue\",pvalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("promptvalue")),(Object)(_pvalue));
 BA.debugLineNum = 1304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrequired(RemoteObject __ref,RemoteObject _elid,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRequired (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "bananovm","setrequired", __ref, _elid, _b);}
Debug.locals.put("elID", _elid);
Debug.locals.put("b", _b);
 BA.debugLineNum = 153;BA.debugLine="Sub SetRequired(elID As String, b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 155;BA.debugLine="Vue.SetStateSingle($\"${elID}required\"$, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("required")))),(Object)((_b)));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrequiredstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetRequiredState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1056);
if (RapidSub.canDelegate("setrequiredstate")) { return __ref.runUserSub(false, "bananovm","setrequiredstate", __ref, _k, _v);}
RemoteObject _diskey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1056;BA.debugLine="Sub SetRequiredState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1057;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("required")));Debug.locals.put("disKey", _diskey);Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1058;BA.debugLine="SetStateSingle(disKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((_diskey)),(Object)((_v)));
 BA.debugLineNum = 1059;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollbar(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetScrollBar (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,932);
if (RapidSub.canDelegate("setscrollbar")) { return __ref.runUserSub(false, "bananovm","setscrollbar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 932;BA.debugLine="Sub SetScrollBar(b As Boolean) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 933;BA.debugLine="App.SetAttr(CreateMap(\":md-scrollbar\":b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-scrollbar")),(_b)}))));
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
public static RemoteObject  _setshowstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetShowState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1046);
if (RapidSub.canDelegate("setshowstate")) { return __ref.runUserSub(false, "bananovm","setshowstate", __ref, _k, _v);}
RemoteObject _showkey = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1046;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1047;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
Debug.JustUpdateDeviceLine();
_showkey = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("show")));Debug.locals.put("showKey", _showkey);Debug.locals.put("showKey", _showkey);
 BA.debugLineNum = 1048;BA.debugLine="SetStateSingle(showKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((_showkey)),(Object)((_v)));
 BA.debugLineNum = 1049;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,689);
if (RapidSub.canDelegate("setstate")) { return __ref.runUserSub(false, "bananovm","setstate", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 689;BA.debugLine="Sub SetState(m As Map) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 690;BA.debugLine="Vue.SetState(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_m));
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
public static RemoteObject  _setstatedecrement(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetStateDecrement (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,822);
if (RapidSub.canDelegate("setstatedecrement")) { return __ref.runUserSub(false, "bananovm","setstatedecrement", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 822;BA.debugLine="Sub SetStateDecrement(k As String) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 823;BA.debugLine="Vue.SetStateDecrement(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatedecrement" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setstatefalse(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetStateFalse (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,812);
if (RapidSub.canDelegate("setstatefalse")) { return __ref.runUserSub(false, "bananovm","setstatefalse", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 812;BA.debugLine="Sub SetStateFalse(k As String) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 813;BA.debugLine="Vue.SetStateFalse(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatefalse" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 814;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 815;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateIncrement (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,817);
if (RapidSub.canDelegate("setstateincrement")) { return __ref.runUserSub(false, "bananovm","setstateincrement", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 817;BA.debugLine="Sub SetStateIncrement(k As String) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 818;BA.debugLine="Vue.SetStateIncrement(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstateincrement" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 819;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 820;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateList (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,734);
if (RapidSub.canDelegate("setstatelist")) { return __ref.runUserSub(false, "bananovm","setstatelist", __ref, _mapkey, _mapvalues);}
Debug.locals.put("mapKey", _mapkey);
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 734;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 735;BA.debugLine="Vue.SetStateList(mapKey, mapValues)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatelist" /*RemoteObject*/ ,(Object)(_mapkey),(Object)(_mapvalues));
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
public static RemoteObject  _setstatelistvalues(RemoteObject __ref,RemoteObject _mapvalues) throws Exception{
try {
		Debug.PushSubsStack("SetStateListValues (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,728);
if (RapidSub.canDelegate("setstatelistvalues")) { return __ref.runUserSub(false, "bananovm","setstatelistvalues", __ref, _mapvalues);}
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 728;BA.debugLine="Sub SetStateListValues(mapValues As List) As BANan";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 729;BA.debugLine="Vue.SetStateListValues(mapValues)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatelistvalues" /*RemoteObject*/ ,(Object)(_mapvalues));
 BA.debugLineNum = 730;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 731;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateMap (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,740);
if (RapidSub.canDelegate("setstatemap")) { return __ref.runUserSub(false, "bananovm","setstatemap", __ref, _mapkey, _mapvalues);}
Debug.locals.put("mapKey", _mapkey);
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 740;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 741;BA.debugLine="Vue.SetStateMap(mapKey, mapValues)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatemap" /*RemoteObject*/ ,(Object)(_mapkey),(Object)(_mapvalues));
 BA.debugLineNum = 742;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 743;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateSingle (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,723);
if (RapidSub.canDelegate("setstatesingle")) { return __ref.runUserSub(false, "bananovm","setstatesingle", __ref, _k, _v);}
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 723;BA.debugLine="Sub SetStateSingle(k As Object, v As Object) As BA";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 724;BA.debugLine="Vue.SetStateSingle(k, v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_k)),(Object)(_v));
 BA.debugLineNum = 725;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 726;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStateTrue (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,803);
if (RapidSub.canDelegate("setstatetrue")) { return __ref.runUserSub(false, "bananovm","setstatetrue", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 803;BA.debugLine="Sub SetStateTrue(k As String) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 804;BA.debugLine="Vue.SetStateTrue(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatetrue" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 805;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 806;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _classname,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "bananovm","setstyle", __ref, _classname, _prop, _val);}
Debug.locals.put("className", _classname);
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 273;BA.debugLine="Sub SetStyle(className As String, prop As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 274;BA.debugLine="Vue.SetStyle(className, prop, val)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstyle" /*RemoteObject*/ ,(Object)(_classname),(Object)(_prop),(Object)(_val));
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
public static RemoteObject  _setupdated(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetUpdated (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1172);
if (RapidSub.canDelegate("setupdated")) { return __ref.runUserSub(false, "bananovm","setupdated", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1172;BA.debugLine="Sub SetUpdated(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1173;BA.debugLine="Vue.SetUpdated(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setupdated" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
 BA.debugLineNum = 1174;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1175;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetWatch (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,746);
if (RapidSub.canDelegate("setwatch")) { return __ref.runUserSub(false, "bananovm","setwatch", __ref, _k, _bimmediate, _bdeep, _module, _methodname);}
Debug.locals.put("k", _k);
Debug.locals.put("bImmediate", _bimmediate);
Debug.locals.put("bDeep", _bdeep);
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 746;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 747;BA.debugLine="Vue.SetWatch(k, bImmediate, bDeep, module, method";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setwatch" /*RemoteObject*/ ,(Object)(_k),(Object)(_bimmediate),(Object)(_bdeep),(Object)(_module),(Object)(_methodname));
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
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("Show (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "bananovm","show", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 178;BA.debugLine="Sub Show(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 179;BA.debugLine="Vue.SetStateSingle($\"${elID}show\"$, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("show")))),(Object)((bananovm.__c.getField(true,"True"))));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showalert(RemoteObject __ref,RemoteObject _process,RemoteObject _title,RemoteObject _message,RemoteObject _confirmtext) throws Exception{
try {
		Debug.PushSubsStack("ShowAlert (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1377);
if (RapidSub.canDelegate("showalert")) { return __ref.runUserSub(false, "bananovm","showalert", __ref, _process, _title, _message, _confirmtext);}
Debug.locals.put("process", _process);
Debug.locals.put("Title", _title);
Debug.locals.put("Message", _message);
Debug.locals.put("ConfirmText", _confirmtext);
 BA.debugLineNum = 1377;BA.debugLine="Sub ShowAlert(process As String, Title As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1378;BA.debugLine="Vue.SetState(CreateMap(\"alertkey\":process, \"alert";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("alertkey")),(_process),RemoteObject.createImmutable(("alerttitle")),(_title),RemoteObject.createImmutable(("alertmessage")),(_message),RemoteObject.createImmutable(("confirmtext")),(_confirmtext)}))));
 BA.debugLineNum = 1379;BA.debugLine="Alert.Show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmalert.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1380;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showconfirm(RemoteObject __ref,RemoteObject _process,RemoteObject _title,RemoteObject _message,RemoteObject _confirmtext,RemoteObject _canceltext) throws Exception{
try {
		Debug.PushSubsStack("ShowConfirm (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1382);
if (RapidSub.canDelegate("showconfirm")) { return __ref.runUserSub(false, "bananovm","showconfirm", __ref, _process, _title, _message, _confirmtext, _canceltext);}
Debug.locals.put("process", _process);
Debug.locals.put("Title", _title);
Debug.locals.put("Message", _message);
Debug.locals.put("ConfirmText", _confirmtext);
Debug.locals.put("CancelText", _canceltext);
 BA.debugLineNum = 1382;BA.debugLine="Sub ShowConfirm(process As String, Title As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1383;BA.debugLine="Vue.SetState(CreateMap(\"confirmtitle\":Title,\"conf";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("confirmtitle")),(_title),RemoteObject.createImmutable(("confirmmessage")),(_message),RemoteObject.createImmutable(("confirmkey")),(_process),RemoteObject.createImmutable(("confirmtext")),(_confirmtext),RemoteObject.createImmutable(("canceltext")),(_canceltext)}))));
 BA.debugLineNum = 1384;BA.debugLine="Confirm.Show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmconfirm.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1385;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showdialog(RemoteObject __ref,RemoteObject _did) throws Exception{
try {
		Debug.PushSubsStack("ShowDialog (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("showdialog")) { return __ref.runUserSub(false, "bananovm","showdialog", __ref, _did);}
Debug.locals.put("dID", _did);
 BA.debugLineNum = 138;BA.debugLine="Sub ShowDialog(dID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 139;BA.debugLine="dID = dID.tolowercase";
Debug.JustUpdateDeviceLine();
_did = _did.runMethod(true,"toLowerCase");Debug.locals.put("dID", _did);
 BA.debugLineNum = 140;BA.debugLine="SetStateTrue(dID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatetrue" /*RemoteObject*/ ,(Object)(_did));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showerror(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("ShowError (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("showerror")) { return __ref.runUserSub(false, "bananovm","showerror", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 182;BA.debugLine="Sub ShowError(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="Vue.SetStateSingle($\"${elID}error\"$, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("error")))),(Object)((bananovm.__c.getField(true,"True"))));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ShowItems (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,717);
if (RapidSub.canDelegate("showitems")) { return __ref.runUserSub(false, "bananovm","showitems", __ref, _items);}
RemoteObject _item = RemoteObject.createImmutable("");
Debug.locals.put("items", _items);
 BA.debugLineNum = 717;BA.debugLine="Sub ShowItems(items As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 718;BA.debugLine="For Each item As String In items";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _items;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 719;BA.debugLine="Vue.SetStateSingle(item, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_item),(Object)((bananovm.__c.getField(true,"True"))));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpage(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("ShowPage (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1204);
if (RapidSub.canDelegate("showpage")) { return __ref.runUserSub(false, "bananovm","showpage", __ref, _name);}
RemoteObject _page = RemoteObject.createImmutable("");
Debug.locals.put("name", _name);
 BA.debugLineNum = 1204;BA.debugLine="Sub ShowPage(name As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1205;BA.debugLine="For Each page As String In Pages";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_pages" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_page = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("page", _page);
Debug.locals.put("page", _page);
 BA.debugLineNum = 1206;BA.debugLine="If name = page Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_name,_page)) { 
 BA.debugLineNum = 1207;BA.debugLine="Show(name)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_show" /*RemoteObject*/ ,(Object)(_name));
 }else {
 BA.debugLineNum = 1209;BA.debugLine="Hide(page)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_hide" /*RemoteObject*/ ,(Object)(_page));
 };
 }
}Debug.locals.put("page", _page);
;
 BA.debugLineNum = 1212;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showprompt(RemoteObject __ref,RemoteObject _title,RemoteObject _message,RemoteObject _placeholder,RemoteObject _maxlen,RemoteObject _confirmtext,RemoteObject _canceltext) throws Exception{
try {
		Debug.PushSubsStack("ShowPrompt (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1387);
if (RapidSub.canDelegate("showprompt")) { return __ref.runUserSub(false, "bananovm","showprompt", __ref, _title, _message, _placeholder, _maxlen, _confirmtext, _canceltext);}
Debug.locals.put("Title", _title);
Debug.locals.put("Message", _message);
Debug.locals.put("Placeholder", _placeholder);
Debug.locals.put("MaxLen", _maxlen);
Debug.locals.put("ConfirmText", _confirmtext);
Debug.locals.put("CancelText", _canceltext);
 BA.debugLineNum = 1387;BA.debugLine="Sub ShowPrompt(Title As String, Message As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1388;BA.debugLine="Vue.SetStateSingle(\"promptvalue\",Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("promptvalue")),(Object)(bananovm.__c.getField(false,"Null")));
 BA.debugLineNum = 1389;BA.debugLine="Vue.SetState(CreateMap(\"promptplaceholder\":Placeh";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("promptplaceholder")),(_placeholder),RemoteObject.createImmutable(("prompttitle")),(_title),RemoteObject.createImmutable(("promptcontent")),(_message),RemoteObject.createImmutable(("promptconfirmtext")),(_confirmtext),RemoteObject.createImmutable(("promptcanceltext")),(_canceltext),RemoteObject.createImmutable(("promptmaxlength")),(_maxlen)}))));
 BA.debugLineNum = 1390;BA.debugLine="Prompt.Show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmprompt.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1391;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showprompt1(RemoteObject __ref,RemoteObject _pname) throws Exception{
try {
		Debug.PushSubsStack("ShowPrompt1 (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1297);
if (RapidSub.canDelegate("showprompt1")) { return __ref.runUserSub(false, "bananovm","showprompt1", __ref, _pname);}
Debug.locals.put("pName", _pname);
 BA.debugLineNum = 1297;BA.debugLine="Sub ShowPrompt1(pName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1298;BA.debugLine="SetPrompt(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setprompt" /*RemoteObject*/ ,(Object)(bananovm.__c.getField(false,"Null")));
 BA.debugLineNum = 1299;BA.debugLine="ShowDialog(pName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_showdialog" /*RemoteObject*/ ,(Object)(_pname));
 BA.debugLineNum = 1300;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showsnackbar(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("ShowSnackBar (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1393);
if (RapidSub.canDelegate("showsnackbar")) { return __ref.runUserSub(false, "bananovm","showsnackbar", __ref, _message);}
Debug.locals.put("Message", _message);
 BA.debugLineNum = 1393;BA.debugLine="Sub ShowSnackBar(Message As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1394;BA.debugLine="Vue.SetState(CreateMap(\"snackmessage\":Message))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("snackmessage")),(_message)}))));
 BA.debugLineNum = 1395;BA.debugLine="Snack.show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snack" /*RemoteObject*/ ).runClassMethod (b4j.example.vmsnackbar.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1396;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("State2Another (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("state2another")) { return __ref.runUserSub(false, "bananovm","state2another", __ref, _source, _target, _defaultvalue);}
Debug.locals.put("source", _source);
Debug.locals.put("target", _target);
Debug.locals.put("defaultValue", _defaultvalue);
 BA.debugLineNum = 80;BA.debugLine="Sub State2Another(source As String, target As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Vue.State2Another(source, target, defaultValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_state2another" /*RemoteObject*/ ,(Object)(_source),(Object)(_target),(Object)(_defaultvalue));
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
public static RemoteObject  _stateexists(RemoteObject __ref,RemoteObject _statename) throws Exception{
try {
		Debug.PushSubsStack("StateExists (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,794);
if (RapidSub.canDelegate("stateexists")) { return __ref.runUserSub(false, "bananovm","stateexists", __ref, _statename);}
Debug.locals.put("stateName", _statename);
 BA.debugLineNum = 794;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 795;BA.debugLine="Return Vue.StateExists(stateName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_stateexists" /*RemoteObject*/ ,(Object)(_statename));
 BA.debugLineNum = 796;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strparse(RemoteObject __ref,RemoteObject _delim,RemoteObject _inputstring) throws Exception{
try {
		Debug.PushSubsStack("StrParse (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("strparse")) { return __ref.runUserSub(false, "bananovm","strparse", __ref, _delim, _inputstring);}
Debug.locals.put("Delim", _delim);
Debug.locals.put("InputString", _inputstring);
 BA.debugLineNum = 340;BA.debugLine="Sub StrParse(Delim As String, InputString As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 341;BA.debugLine="Return Vue.StrParse(Delim, InputString)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_strparse" /*RemoteObject*/ ,(Object)(_delim),(Object)(_inputstring));
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _togglenamedstate(RemoteObject __ref,RemoteObject _statename,RemoteObject _state1,RemoteObject _state2) throws Exception{
try {
		Debug.PushSubsStack("ToggleNamedState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1113);
if (RapidSub.canDelegate("togglenamedstate")) { return __ref.runUserSub(false, "bananovm","togglenamedstate", __ref, _statename, _state1, _state2);}
Debug.locals.put("stateName", _statename);
Debug.locals.put("state1", _state1);
Debug.locals.put("state2", _state2);
 BA.debugLineNum = 1113;BA.debugLine="Sub ToggleNamedState(stateName As String, state1 A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1114;BA.debugLine="Vue.ToggleNamedState(stateName, state1, state2)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_togglenamedstate" /*RemoteObject*/ ,(Object)(_statename),(Object)(_state1),(Object)(_state2));
 BA.debugLineNum = 1115;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1116;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToggleState (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,798);
if (RapidSub.canDelegate("togglestate")) { return __ref.runUserSub(false, "bananovm","togglestate", __ref, _statename);}
Debug.locals.put("stateName", _statename);
 BA.debugLineNum = 798;BA.debugLine="Sub ToggleState(stateName As String) As BANanoVM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 799;BA.debugLine="Vue.ToggleState(stateName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_togglestate" /*RemoteObject*/ ,(Object)(_statename));
 BA.debugLineNum = 800;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 801;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToYYYYMMDD (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1095);
if (RapidSub.canDelegate("toyyyymmdd")) { return __ref.runUserSub(false, "bananovm","toyyyymmdd", __ref, _vmodel);}
RemoteObject _sk = RemoteObject.createImmutable("");
Debug.locals.put("vmodel", _vmodel);
 BA.debugLineNum = 1095;BA.debugLine="Sub ToYYYYMMDD(vmodel As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1096;BA.debugLine="Dim sk As String = GetState(vmodel,\"\")";
Debug.JustUpdateDeviceLine();
_sk = BA.ObjectToString(__ref.runClassMethod (b4j.example.bananovm.class, "_getstate" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sk", _sk);Debug.locals.put("sk", _sk);
 BA.debugLineNum = 1097;BA.debugLine="sk = Date2YYYYMMDD(sk)";
Debug.JustUpdateDeviceLine();
_sk = __ref.runClassMethod (b4j.example.bananovm.class, "_date2yyyymmdd" /*RemoteObject*/ ,(Object)((_sk)));Debug.locals.put("sk", _sk);
 BA.debugLineNum = 1098;BA.debugLine="SetStateSingle(vmodel, sk)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((_vmodel)),(Object)((_sk)));
 BA.debugLineNum = 1099;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatebackgroundimage(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("UpdateBackgroundImage (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1143);
if (RapidSub.canDelegate("updatebackgroundimage")) { return __ref.runUserSub(false, "bananovm","updatebackgroundimage", __ref, _url);}
Debug.locals.put("url", _url);
 BA.debugLineNum = 1143;BA.debugLine="Sub UpdateBackgroundImage(url As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1144;BA.debugLine="BANano.GetElement(\"#content\").SetStyle(BANano.ToJ";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(RemoteObject.createImmutable("#content"))).runVoidMethod ("SetStyle",(Object)(BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("background-image")),((RemoteObject.concat(RemoteObject.createImmutable("url('"),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_url))),RemoteObject.createImmutable("')")))),RemoteObject.createImmutable(("background-size")),(RemoteObject.createImmutable("100% 100%"))})).getObject()))))));
 BA.debugLineNum = 1145;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatebadge(RemoteObject __ref,RemoteObject _elid,RemoteObject _counted) throws Exception{
try {
		Debug.PushSubsStack("UpdateBadge (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,475);
if (RapidSub.canDelegate("updatebadge")) { return __ref.runUserSub(false, "bananovm","updatebadge", __ref, _elid, _counted);}
RemoteObject _badvalue = RemoteObject.createImmutable("");
Debug.locals.put("elID", _elid);
Debug.locals.put("counted", _counted);
 BA.debugLineNum = 475;BA.debugLine="Sub UpdateBadge(elID As String, counted As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 476;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 477;BA.debugLine="Dim badValue As String = $\"${elID}value\"$";
Debug.JustUpdateDeviceLine();
_badvalue = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("value")));Debug.locals.put("badValue", _badvalue);Debug.locals.put("badValue", _badvalue);
 BA.debugLineNum = 478;BA.debugLine="Vue.SetStateSingle(badValue, counted)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_badvalue),(Object)((_counted)));
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
public static RemoteObject  _updateitembadge(RemoteObject __ref,RemoteObject _elid,RemoteObject _counted) throws Exception{
try {
		Debug.PushSubsStack("UpdateItemBadge (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,482);
if (RapidSub.canDelegate("updateitembadge")) { return __ref.runUserSub(false, "bananovm","updateitembadge", __ref, _elid, _counted);}
RemoteObject _badvalue = RemoteObject.createImmutable("");
Debug.locals.put("elID", _elid);
Debug.locals.put("counted", _counted);
 BA.debugLineNum = 482;BA.debugLine="Sub UpdateItemBadge(elID As String, counted As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 483;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 484;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
Debug.JustUpdateDeviceLine();
_badvalue = (RemoteObject.concat(RemoteObject.createImmutable(""),bananovm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("badgevalue")));Debug.locals.put("badValue", _badvalue);Debug.locals.put("badValue", _badvalue);
 BA.debugLineNum = 485;BA.debugLine="Vue.SetStateSingle(badValue, counted)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_badvalue),(Object)((_counted)));
 BA.debugLineNum = 486;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 487;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _use(RemoteObject __ref,RemoteObject _bo) throws Exception{
try {
		Debug.PushSubsStack("Use (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,916);
if (RapidSub.canDelegate("use")) { return __ref.runUserSub(false, "bananovm","use", __ref, _bo);}
Debug.locals.put("bo", _bo);
 BA.debugLineNum = 916;BA.debugLine="Sub Use(bo As BANanoObject)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 917;BA.debugLine="Vue.Use(bo)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_use" /*RemoteObject*/ ,(Object)(_bo));
 BA.debugLineNum = 918;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _usetheme(RemoteObject __ref,RemoteObject _ve,RemoteObject _themename) throws Exception{
try {
		Debug.PushSubsStack("UseTheme (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1362);
if (RapidSub.canDelegate("usetheme")) { return __ref.runUserSub(false, "bananovm","usetheme", __ref, _ve, _themename);}
RemoteObject _theme = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fc = RemoteObject.createImmutable("");
RemoteObject _bc = RemoteObject.createImmutable("");
RemoteObject _color = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ve", _ve);
Debug.locals.put("themeName", _themename);
 BA.debugLineNum = 1362;BA.debugLine="Sub UseTheme(ve As VMElement, themeName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1363;BA.debugLine="themeName = themeName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_themename = _themename.runMethod(true,"toLowerCase");Debug.locals.put("themeName", _themename);
 BA.debugLineNum = 1364;BA.debugLine="If Themes.ContainsKey(themeName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_themes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_themename))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1365;BA.debugLine="Dim theme As Map = Themes.Get(themeName)";
Debug.JustUpdateDeviceLine();
_theme = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_theme.setObject(__ref.getField(false,"_themes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_themename))));Debug.locals.put("theme", _theme);
 BA.debugLineNum = 1366;BA.debugLine="Dim fc As String = theme.Get(themeName)";
Debug.JustUpdateDeviceLine();
_fc = BA.ObjectToString(_theme.runMethod(false,"Get",(Object)((_themename))));Debug.locals.put("fc", _fc);Debug.locals.put("fc", _fc);
 BA.debugLineNum = 1367;BA.debugLine="Dim bc As String = theme.Get(themeName)";
Debug.JustUpdateDeviceLine();
_bc = BA.ObjectToString(_theme.runMethod(false,"Get",(Object)((_themename))));Debug.locals.put("bc", _bc);Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1369;BA.debugLine="Dim color As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_color = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_color = bananovm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("color", _color);Debug.locals.put("color", _color);
 BA.debugLineNum = 1370;BA.debugLine="color.Put(\"color\", fc)";
Debug.JustUpdateDeviceLine();
_color.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("color"))),(Object)((_fc)));
 BA.debugLineNum = 1371;BA.debugLine="color.Put(\"background-color\", bc)";
Debug.JustUpdateDeviceLine();
_color.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("background-color"))),(Object)((_bc)));
 BA.debugLineNum = 1372;BA.debugLine="ve.SetStyle(color)";
Debug.JustUpdateDeviceLine();
_ve.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_color));
 };
 BA.debugLineNum = 1374;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("UX (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,891);
if (RapidSub.canDelegate("ux")) { return __ref.runUserSub(false, "bananovm","ux", __ref);}
RemoteObject _rkey = RemoteObject.createImmutable("");
RemoteObject _srefs = RemoteObject.createImmutable("");
RemoteObject _dkey = RemoteObject.createImmutable("");
 BA.debugLineNum = 891;BA.debugLine="Sub UX()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 892;BA.debugLine="Content.SetText(Container.ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 893;BA.debugLine="Create";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_create" /*RemoteObject*/ );
 BA.debugLineNum = 894;BA.debugLine="Vue.ux";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_ux" /*RemoteObject*/ );
 BA.debugLineNum = 895;BA.debugLine="GetTemplate = Vue.GetTemplate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_gettemplate" /*RemoteObject*/ ,__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(true,"_gettemplate" /*RemoteObject*/ ));
 BA.debugLineNum = 896;BA.debugLine="VueBO = Vue.BOVue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vuebo" /*RemoteObject*/ ,__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(false,"_bovue" /*RemoteObject*/ ));
 BA.debugLineNum = 898;BA.debugLine="Dim rKey As String = \"$material\"";
Debug.JustUpdateDeviceLine();
_rkey = BA.ObjectToString("$material");Debug.locals.put("rKey", _rkey);Debug.locals.put("rKey", _rkey);
 BA.debugLineNum = 899;BA.debugLine="material = VueBO.GetField(rKey)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_material" /*RemoteObject*/ ,__ref.getField(false,"_vuebo" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_rkey)));
 BA.debugLineNum = 900;BA.debugLine="Dim srefs As String = \"$refs\"";
Debug.JustUpdateDeviceLine();
_srefs = BA.ObjectToString("$refs");Debug.locals.put("srefs", _srefs);Debug.locals.put("srefs", _srefs);
 BA.debugLineNum = 901;BA.debugLine="refs = VueBO.GetField(srefs).result";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_refs" /*RemoteObject*/ ).setObject (__ref.getField(false,"_vuebo" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_srefs)).runMethod(false,"Result"));
 BA.debugLineNum = 902;BA.debugLine="Dim dKey As String = \"$data\"";
Debug.JustUpdateDeviceLine();
_dkey = BA.ObjectToString("$data");Debug.locals.put("dKey", _dkey);Debug.locals.put("dKey", _dkey);
 BA.debugLineNum = 903;BA.debugLine="data = VueBO.GetField(dKey).Result";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).setObject (__ref.getField(false,"_vuebo" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_dkey)).runMethod(false,"Result"));
 BA.debugLineNum = 904;BA.debugLine="If HasInfoBox Then SetInfoBox";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasinfobox" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.bananovm.class, "_setinfobox" /*RemoteObject*/ );};
 BA.debugLineNum = 905;BA.debugLine="If HasKnob Then SetKnob";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasknob" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.bananovm.class, "_setknob" /*RemoteObject*/ );};
 BA.debugLineNum = 907;BA.debugLine="SetDateFormat(\"yyyy-MM-dd\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananovm.class, "_setdateformat" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("yyyy-MM-dd")));
 BA.debugLineNum = 908;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Validate (bananovm) ","bananovm",13,__ref.getField(false, "ba"),__ref,1654);
if (RapidSub.canDelegate("validate")) { return __ref.runUserSub(false, "bananovm","validate", __ref, _rec, _required);}
Debug.locals.put("rec", _rec);
Debug.locals.put("required", _required);
 BA.debugLineNum = 1654;BA.debugLine="Sub Validate(rec As Map, required As Map) As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1655;BA.debugLine="Return Vue.Validate(rec, required)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_validate" /*RemoteObject*/ ,(Object)(_rec),(Object)(_required));
 BA.debugLineNum = 1656;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}