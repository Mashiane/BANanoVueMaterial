package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmloader_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmloader","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 112;BA.debugLine="Sub AddClass(c As String) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="Loader.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 114;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmloader","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 135;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmloader.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Loader As VMElement";
vmloader._loader = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_loader",vmloader._loader);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmloader._id = RemoteObject.createImmutable("");__ref.setField("_id",vmloader._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmloader._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmloader._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmloader._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmloader._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object   'ignore";
vmloader._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmloader._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmloader","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 12;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 13;BA.debugLine="Loader.Initialize(vue, ID).SetTag(\"loading\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("loading")));
 BA.debugLineNum = 14;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 15;BA.debugLine="SetOnCancel";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setoncancel" /*RemoteObject*/ );
 BA.debugLineNum = 16;BA.debugLine="SetFullPage(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setfullpage" /*RemoteObject*/ ,(Object)(vmloader.__c.getField(true,"True")));
 BA.debugLineNum = 17;BA.debugLine="SetIsLoading(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setisloading" /*RemoteObject*/ ,(Object)(vmloader.__c.getField(true,"False")));
 BA.debugLineNum = 18;BA.debugLine="SetCanCancel(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setcancancel" /*RemoteObject*/ ,(Object)(vmloader.__c.getField(true,"False")));
 BA.debugLineNum = 19;BA.debugLine="SetColor(\"blue\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setcolor" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("blue")));
 BA.debugLineNum = 20;BA.debugLine="SetLoaderBars";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setloaderbars" /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmloader","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 131;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmloader.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmloader","render", __ref);}
 BA.debugLineNum = 127;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmloader.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmloader","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 118;BA.debugLine="Sub SetAttr(attr As Map) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Loader.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setbackgroundcolor(RemoteObject __ref,RemoteObject _scolor) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundColor (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "vmloader","setbackgroundcolor", __ref, _scolor);}
RemoteObject _xcolor = RemoteObject.createImmutable("");
Debug.locals.put("scolor", _scolor);
 BA.debugLineNum = 50;BA.debugLine="Sub SetBackgroundColor(scolor As String) As VMLoad";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Dim xcolor As String = $\"${ID}backgroundcolor\"$";
Debug.JustUpdateDeviceLine();
_xcolor = (RemoteObject.concat(RemoteObject.createImmutable(""),vmloader.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("backgroundcolor")));Debug.locals.put("xcolor", _xcolor);Debug.locals.put("xcolor", _xcolor);
 BA.debugLineNum = 52;BA.debugLine="vue.SetStateSingle(xcolor, scolor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_xcolor),(Object)((_scolor)));
 BA.debugLineNum = 53;BA.debugLine="Loader.SetAttr1(\":background-color\", xcolor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":background-color")),(Object)((_xcolor)));
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
public static RemoteObject  _setcancancel(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCanCancel (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("setcancancel")) { return __ref.runUserSub(false, "vmloader","setcancancel", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 31;BA.debugLine="Sub SetCanCancel(b As Boolean) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Loader.setattr1(\":can-cancel\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":can-cancel")),(Object)((_b)));
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
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _scolor) throws Exception{
try {
		Debug.PushSubsStack("SetColor (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "vmloader","setcolor", __ref, _scolor);}
RemoteObject _xcolor = RemoteObject.createImmutable("");
Debug.locals.put("scolor", _scolor);
 BA.debugLineNum = 43;BA.debugLine="Sub SetColor(scolor As String) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Dim xcolor As String = $\"${ID}color\"$";
Debug.JustUpdateDeviceLine();
_xcolor = (RemoteObject.concat(RemoteObject.createImmutable(""),vmloader.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("color")));Debug.locals.put("xcolor", _xcolor);Debug.locals.put("xcolor", _xcolor);
 BA.debugLineNum = 45;BA.debugLine="vue.SetStateSingle(xcolor, scolor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_xcolor),(Object)((_scolor)));
 BA.debugLineNum = 46;BA.debugLine="Loader.SetAttr1(\":color\", xcolor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":color")),(Object)((_xcolor)));
 BA.debugLineNum = 47;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfullpage(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetFullPage (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("setfullpage")) { return __ref.runUserSub(false, "vmloader","setfullpage", __ref, _b);}
RemoteObject _fpage = RemoteObject.createImmutable("");
Debug.locals.put("b", _b);
 BA.debugLineNum = 36;BA.debugLine="Sub SetFullPage(b As Boolean) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Dim fPage As String = $\"${ID}fullpage\"$";
Debug.JustUpdateDeviceLine();
_fpage = (RemoteObject.concat(RemoteObject.createImmutable(""),vmloader.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("fullpage")));Debug.locals.put("fPage", _fpage);Debug.locals.put("fPage", _fpage);
 BA.debugLineNum = 38;BA.debugLine="vue.SetStateSingle(fPage, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_fpage),(Object)((_b)));
 BA.debugLineNum = 39;BA.debugLine="Loader.SetAttr1(\":is-full-page\", fPage)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":is-full-page")),(Object)((_fpage)));
 BA.debugLineNum = 40;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setisloading(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetIsLoading (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("setisloading")) { return __ref.runUserSub(false, "vmloader","setisloading", __ref, _b);}
RemoteObject _isloading = RemoteObject.createImmutable("");
Debug.locals.put("b", _b);
 BA.debugLineNum = 24;BA.debugLine="Sub SetIsLoading(b As Boolean) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="Dim isloading As String = $\"${ID}loading\"$";
Debug.JustUpdateDeviceLine();
_isloading = (RemoteObject.concat(RemoteObject.createImmutable(""),vmloader.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("loading")));Debug.locals.put("isloading", _isloading);Debug.locals.put("isloading", _isloading);
 BA.debugLineNum = 26;BA.debugLine="vue.SetStateSingle(isloading, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_isloading),(Object)((_b)));
 BA.debugLineNum = 27;BA.debugLine="Loader.SetAttr1(\":active.sync\", isloading)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":active.sync")),(Object)((_isloading)));
 BA.debugLineNum = 28;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setloader(RemoteObject __ref,RemoteObject _sloader) throws Exception{
try {
		Debug.PushSubsStack("SetLoader (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setloader")) { return __ref.runUserSub(false, "vmloader","setloader", __ref, _sloader);}
RemoteObject _xloader = RemoteObject.createImmutable("");
Debug.locals.put("sloader", _sloader);
 BA.debugLineNum = 64;BA.debugLine="Sub SetLoader(sloader As String) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="Dim xloader As String = $\"${ID}loader\"$";
Debug.JustUpdateDeviceLine();
_xloader = (RemoteObject.concat(RemoteObject.createImmutable(""),vmloader.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("loader")));Debug.locals.put("xloader", _xloader);Debug.locals.put("xloader", _xloader);
 BA.debugLineNum = 66;BA.debugLine="vue.SetStateSingle(xloader, sloader)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_xloader),(Object)((_sloader)));
 BA.debugLineNum = 67;BA.debugLine="Loader.SetAttr1(\":loader\", xloader)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":loader")),(Object)((_xloader)));
 BA.debugLineNum = 68;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setloaderbars(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLoaderBars (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setloaderbars")) { return __ref.runUserSub(false, "vmloader","setloaderbars", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Sub SetLoaderBars As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="SetLoader(\"bars\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setloader" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("bars")));
 BA.debugLineNum = 83;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setloaderdots(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLoaderDots (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setloaderdots")) { return __ref.runUserSub(false, "vmloader","setloaderdots", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Sub SetLoaderDots As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="SetLoader(\"dots\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setloader" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("dots")));
 BA.debugLineNum = 78;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setloaderspinner(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLoaderSpinner (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setloaderspinner")) { return __ref.runUserSub(false, "vmloader","setloaderspinner", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Sub SetLoaderSpinner As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="SetLoader(\"spinner\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmloader.class, "_setloader" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("spinner")));
 BA.debugLineNum = 73;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmargin(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetMargin (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "vmloader","setmargin", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 101;BA.debugLine="Sub SetMargin(p As String) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="Loader.SetStyle(CreateMap(\"margin\":p))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmloader.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin")),(_p)}))));
 BA.debugLineNum = 103;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoncancel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnCancel (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setoncancel")) { return __ref.runUserSub(false, "vmloader","setoncancel", __ref);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _oncancel = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 87;BA.debugLine="Sub SetOnCancel As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 89;BA.debugLine="Dim onCancel As String = $\"${ID}_oncancel\"$";
Debug.JustUpdateDeviceLine();
_oncancel = (RemoteObject.concat(RemoteObject.createImmutable(""),vmloader.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_oncancel")));Debug.locals.put("onCancel", _oncancel);Debug.locals.put("onCancel", _oncancel);
 BA.debugLineNum = 90;BA.debugLine="If SubExists(module, onCancel) = False Then Retur";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmloader.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_oncancel)),vmloader.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 91;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_oncancel),(Object)(vmloader.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 92;BA.debugLine="vue.SetCallBack(onCancel, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_oncancel),(Object)(_cb));
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
public static RemoteObject  _setopacity(RemoteObject __ref,RemoteObject _opac) throws Exception{
try {
		Debug.PushSubsStack("SetOpacity (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setopacity")) { return __ref.runUserSub(false, "vmloader","setopacity", __ref, _opac);}
RemoteObject _xcolor = RemoteObject.createImmutable("");
Debug.locals.put("opac", _opac);
 BA.debugLineNum = 57;BA.debugLine="Sub SetOpacity(opac As Double) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Dim xcolor As String = $\"${ID}opacity\"$";
Debug.JustUpdateDeviceLine();
_xcolor = (RemoteObject.concat(RemoteObject.createImmutable(""),vmloader.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("opacity")));Debug.locals.put("xcolor", _xcolor);Debug.locals.put("xcolor", _xcolor);
 BA.debugLineNum = 59;BA.debugLine="vue.SetStateSingle(xcolor, opac)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_xcolor),(Object)((_opac)));
 BA.debugLineNum = 60;BA.debugLine="Loader.SetAttr1(\":opacity\", xcolor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":opacity")),(Object)((_xcolor)));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmloader","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 106;BA.debugLine="Sub SetPadding(p As String) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="Loader.SetStyle(CreateMap(\"padding\":p))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmloader.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("padding")),(_p)}))));
 BA.debugLineNum = 108;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmloader","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 96;BA.debugLine="Sub SetStyle(m As Map) As VMLoader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Loader.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmloader) ","vmloader",73,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmloader","tostring", __ref);}
 BA.debugLineNum = 123;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="Return Loader.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_loader" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}