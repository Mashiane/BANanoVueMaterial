package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmloader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmloader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmloader.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _loader = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmloader  _initialize(b4j.example.vmloader __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=170459136;
 //BA.debugLineNum = 170459136;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=170459137;
 //BA.debugLineNum = 170459137;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=170459138;
 //BA.debugLineNum = 170459138;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=170459139;
 //BA.debugLineNum = 170459139;BA.debugLine="Loader.Initialize(vue, ID).SetTag(\"loading\")";
__ref._loader /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"loading");
RDebugUtils.currentLine=170459140;
 //BA.debugLineNum = 170459140;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=170459141;
 //BA.debugLineNum = 170459141;BA.debugLine="SetOnCancel";
__ref._setoncancel /*b4j.example.vmloader*/ (null);
RDebugUtils.currentLine=170459142;
 //BA.debugLineNum = 170459142;BA.debugLine="SetFullPage(True)";
__ref._setfullpage /*b4j.example.vmloader*/ (null,__c.True);
RDebugUtils.currentLine=170459143;
 //BA.debugLineNum = 170459143;BA.debugLine="SetIsLoading(False)";
__ref._setisloading /*b4j.example.vmloader*/ (null,__c.False);
RDebugUtils.currentLine=170459144;
 //BA.debugLineNum = 170459144;BA.debugLine="SetCanCancel(False)";
__ref._setcancancel /*b4j.example.vmloader*/ (null,__c.False);
RDebugUtils.currentLine=170459145;
 //BA.debugLineNum = 170459145;BA.debugLine="SetColor(\"blue\")";
__ref._setcolor /*b4j.example.vmloader*/ (null,"blue");
RDebugUtils.currentLine=170459146;
 //BA.debugLineNum = 170459146;BA.debugLine="SetLoaderBars";
__ref._setloaderbars /*b4j.example.vmloader*/ (null);
RDebugUtils.currentLine=170459147;
 //BA.debugLineNum = 170459147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170459148;
 //BA.debugLineNum = 170459148;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmloader __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=171704320;
 //BA.debugLineNum = 171704320;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=171704321;
 //BA.debugLineNum = 171704321;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=171704322;
 //BA.debugLineNum = 171704322;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmloader  _setisloading(b4j.example.vmloader __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setisloading", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setisloading", new Object[] {_b}));}
String _isloading = "";
RDebugUtils.currentLine=170524672;
 //BA.debugLineNum = 170524672;BA.debugLine="Sub SetIsLoading(b As Boolean) As VMLoader";
RDebugUtils.currentLine=170524673;
 //BA.debugLineNum = 170524673;BA.debugLine="Dim isloading As String = $\"${ID}loading\"$";
_isloading = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"loading");
RDebugUtils.currentLine=170524674;
 //BA.debugLineNum = 170524674;BA.debugLine="vue.SetStateSingle(isloading, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_isloading,(Object)(_b));
RDebugUtils.currentLine=170524675;
 //BA.debugLineNum = 170524675;BA.debugLine="Loader.SetAttr1(\":active.sync\", isloading)";
__ref._loader /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":active.sync",(Object)(_isloading));
RDebugUtils.currentLine=170524676;
 //BA.debugLineNum = 170524676;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170524677;
 //BA.debugLineNum = 170524677;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _addclass(b4j.example.vmloader __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=171442176;
 //BA.debugLineNum = 171442176;BA.debugLine="Sub AddClass(c As String) As VMLoader";
RDebugUtils.currentLine=171442177;
 //BA.debugLineNum = 171442177;BA.debugLine="Loader.AddClass(c)";
__ref._loader /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=171442178;
 //BA.debugLineNum = 171442178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=171442179;
 //BA.debugLineNum = 171442179;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmloader __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=171769856;
 //BA.debugLineNum = 171769856;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=171769857;
 //BA.debugLineNum = 171769857;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=171769858;
 //BA.debugLineNum = 171769858;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=171573248;
 //BA.debugLineNum = 171573248;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=171573249;
 //BA.debugLineNum = 171573249;BA.debugLine="Return Loader.tostring";
if (true) return __ref._loader /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=171573250;
 //BA.debugLineNum = 171573250;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
RDebugUtils.currentLine=170393600;
 //BA.debugLineNum = 170393600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=170393601;
 //BA.debugLineNum = 170393601;BA.debugLine="Public Loader As VMElement";
_loader = new b4j.example.vmelement();
RDebugUtils.currentLine=170393602;
 //BA.debugLineNum = 170393602;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=170393603;
 //BA.debugLineNum = 170393603;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=170393604;
 //BA.debugLineNum = 170393604;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=170393605;
 //BA.debugLineNum = 170393605;BA.debugLine="Private module As Object   'ignore";
_module = new Object();
RDebugUtils.currentLine=170393606;
 //BA.debugLineNum = 170393606;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmloader  _setoncancel(b4j.example.vmloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setoncancel", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setoncancel", null));}
com.ab.banano.BANanoEvent _e = null;
String _oncancel = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=171180032;
 //BA.debugLineNum = 171180032;BA.debugLine="Sub SetOnCancel As VMLoader";
RDebugUtils.currentLine=171180033;
 //BA.debugLineNum = 171180033;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=171180034;
 //BA.debugLineNum = 171180034;BA.debugLine="Dim onCancel As String = $\"${ID}_oncancel\"$";
_oncancel = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_oncancel");
RDebugUtils.currentLine=171180035;
 //BA.debugLineNum = 171180035;BA.debugLine="If SubExists(module, onCancel) = False Then Retur";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_oncancel)==__c.False) { 
if (true) return (b4j.example.vmloader)(this);};
RDebugUtils.currentLine=171180036;
 //BA.debugLineNum = 171180036;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_oncancel,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
RDebugUtils.currentLine=171180037;
 //BA.debugLineNum = 171180037;BA.debugLine="vue.SetCallBack(onCancel, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_oncancel,_cb);
RDebugUtils.currentLine=171180038;
 //BA.debugLineNum = 171180038;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=171180039;
 //BA.debugLineNum = 171180039;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setfullpage(b4j.example.vmloader __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setfullpage", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setfullpage", new Object[] {_b}));}
String _fpage = "";
RDebugUtils.currentLine=170655744;
 //BA.debugLineNum = 170655744;BA.debugLine="Sub SetFullPage(b As Boolean) As VMLoader";
RDebugUtils.currentLine=170655745;
 //BA.debugLineNum = 170655745;BA.debugLine="Dim fPage As String = $\"${ID}fullpage\"$";
_fpage = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"fullpage");
RDebugUtils.currentLine=170655746;
 //BA.debugLineNum = 170655746;BA.debugLine="vue.SetStateSingle(fPage, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_fpage,(Object)(_b));
RDebugUtils.currentLine=170655747;
 //BA.debugLineNum = 170655747;BA.debugLine="Loader.SetAttr1(\":is-full-page\", fPage)";
__ref._loader /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":is-full-page",(Object)(_fpage));
RDebugUtils.currentLine=170655748;
 //BA.debugLineNum = 170655748;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170655749;
 //BA.debugLineNum = 170655749;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setcancancel(b4j.example.vmloader __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setcancancel", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setcancancel", new Object[] {_b}));}
RDebugUtils.currentLine=170590208;
 //BA.debugLineNum = 170590208;BA.debugLine="Sub SetCanCancel(b As Boolean) As VMLoader";
RDebugUtils.currentLine=170590209;
 //BA.debugLineNum = 170590209;BA.debugLine="Loader.setattr1(\":can-cancel\", b)";
__ref._loader /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":can-cancel",(Object)(_b));
RDebugUtils.currentLine=170590210;
 //BA.debugLineNum = 170590210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170590211;
 //BA.debugLineNum = 170590211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setcolor(b4j.example.vmloader __ref,String _scolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setcolor", new Object[] {_scolor}));}
String _xcolor = "";
RDebugUtils.currentLine=170721280;
 //BA.debugLineNum = 170721280;BA.debugLine="Sub SetColor(scolor As String) As VMLoader";
RDebugUtils.currentLine=170721281;
 //BA.debugLineNum = 170721281;BA.debugLine="Dim xcolor As String = $\"${ID}color\"$";
_xcolor = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"color");
RDebugUtils.currentLine=170721282;
 //BA.debugLineNum = 170721282;BA.debugLine="vue.SetStateSingle(xcolor, scolor)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_xcolor,(Object)(_scolor));
RDebugUtils.currentLine=170721283;
 //BA.debugLineNum = 170721283;BA.debugLine="Loader.SetAttr1(\":color\", xcolor)";
__ref._loader /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":color",(Object)(_xcolor));
RDebugUtils.currentLine=170721284;
 //BA.debugLineNum = 170721284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170721285;
 //BA.debugLineNum = 170721285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setloaderbars(b4j.example.vmloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setloaderbars", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setloaderbars", null));}
RDebugUtils.currentLine=171114496;
 //BA.debugLineNum = 171114496;BA.debugLine="Sub SetLoaderBars As VMLoader";
RDebugUtils.currentLine=171114497;
 //BA.debugLineNum = 171114497;BA.debugLine="SetLoader(\"bars\")";
__ref._setloader /*b4j.example.vmloader*/ (null,"bars");
RDebugUtils.currentLine=171114498;
 //BA.debugLineNum = 171114498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=171114499;
 //BA.debugLineNum = 171114499;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=171638784;
 //BA.debugLineNum = 171638784;BA.debugLine="Sub Render";
RDebugUtils.currentLine=171638785;
 //BA.debugLineNum = 171638785;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=171638786;
 //BA.debugLineNum = 171638786;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmloader  _setattr(b4j.example.vmloader __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=171507712;
 //BA.debugLineNum = 171507712;BA.debugLine="Sub SetAttr(attr As Map) As VMLoader";
RDebugUtils.currentLine=171507713;
 //BA.debugLineNum = 171507713;BA.debugLine="Loader.SetAttr(attr)";
__ref._loader /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=171507714;
 //BA.debugLineNum = 171507714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=171507715;
 //BA.debugLineNum = 171507715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setbackgroundcolor(b4j.example.vmloader __ref,String _scolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_scolor}));}
String _xcolor = "";
RDebugUtils.currentLine=170786816;
 //BA.debugLineNum = 170786816;BA.debugLine="Sub SetBackgroundColor(scolor As String) As VMLoad";
RDebugUtils.currentLine=170786817;
 //BA.debugLineNum = 170786817;BA.debugLine="Dim xcolor As String = $\"${ID}backgroundcolor\"$";
_xcolor = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"backgroundcolor");
RDebugUtils.currentLine=170786818;
 //BA.debugLineNum = 170786818;BA.debugLine="vue.SetStateSingle(xcolor, scolor)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_xcolor,(Object)(_scolor));
RDebugUtils.currentLine=170786819;
 //BA.debugLineNum = 170786819;BA.debugLine="Loader.SetAttr1(\":background-color\", xcolor)";
__ref._loader /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":background-color",(Object)(_xcolor));
RDebugUtils.currentLine=170786820;
 //BA.debugLineNum = 170786820;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170786821;
 //BA.debugLineNum = 170786821;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setloader(b4j.example.vmloader __ref,String _sloader) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setloader", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setloader", new Object[] {_sloader}));}
String _xloader = "";
RDebugUtils.currentLine=170917888;
 //BA.debugLineNum = 170917888;BA.debugLine="Sub SetLoader(sloader As String) As VMLoader";
RDebugUtils.currentLine=170917889;
 //BA.debugLineNum = 170917889;BA.debugLine="Dim xloader As String = $\"${ID}loader\"$";
_xloader = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"loader");
RDebugUtils.currentLine=170917890;
 //BA.debugLineNum = 170917890;BA.debugLine="vue.SetStateSingle(xloader, sloader)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_xloader,(Object)(_sloader));
RDebugUtils.currentLine=170917891;
 //BA.debugLineNum = 170917891;BA.debugLine="Loader.SetAttr1(\":loader\", xloader)";
__ref._loader /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":loader",(Object)(_xloader));
RDebugUtils.currentLine=170917892;
 //BA.debugLineNum = 170917892;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170917893;
 //BA.debugLineNum = 170917893;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setloaderdots(b4j.example.vmloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setloaderdots", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setloaderdots", null));}
RDebugUtils.currentLine=171048960;
 //BA.debugLineNum = 171048960;BA.debugLine="Sub SetLoaderDots As VMLoader";
RDebugUtils.currentLine=171048961;
 //BA.debugLineNum = 171048961;BA.debugLine="SetLoader(\"dots\")";
__ref._setloader /*b4j.example.vmloader*/ (null,"dots");
RDebugUtils.currentLine=171048962;
 //BA.debugLineNum = 171048962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=171048963;
 //BA.debugLineNum = 171048963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setloaderspinner(b4j.example.vmloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setloaderspinner", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setloaderspinner", null));}
RDebugUtils.currentLine=170983424;
 //BA.debugLineNum = 170983424;BA.debugLine="Sub SetLoaderSpinner As VMLoader";
RDebugUtils.currentLine=170983425;
 //BA.debugLineNum = 170983425;BA.debugLine="SetLoader(\"spinner\")";
__ref._setloader /*b4j.example.vmloader*/ (null,"spinner");
RDebugUtils.currentLine=170983426;
 //BA.debugLineNum = 170983426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170983427;
 //BA.debugLineNum = 170983427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setmargin(b4j.example.vmloader __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setmargin", new Object[] {_p}));}
RDebugUtils.currentLine=171311104;
 //BA.debugLineNum = 171311104;BA.debugLine="Sub SetMargin(p As String) As VMLoader";
RDebugUtils.currentLine=171311105;
 //BA.debugLineNum = 171311105;BA.debugLine="Loader.SetStyle(CreateMap(\"margin\":p))";
__ref._loader /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("margin"),(Object)(_p)}));
RDebugUtils.currentLine=171311106;
 //BA.debugLineNum = 171311106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=171311107;
 //BA.debugLineNum = 171311107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setopacity(b4j.example.vmloader __ref,double _opac) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setopacity", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setopacity", new Object[] {_opac}));}
String _xcolor = "";
RDebugUtils.currentLine=170852352;
 //BA.debugLineNum = 170852352;BA.debugLine="Sub SetOpacity(opac As Double) As VMLoader";
RDebugUtils.currentLine=170852353;
 //BA.debugLineNum = 170852353;BA.debugLine="Dim xcolor As String = $\"${ID}opacity\"$";
_xcolor = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"opacity");
RDebugUtils.currentLine=170852354;
 //BA.debugLineNum = 170852354;BA.debugLine="vue.SetStateSingle(xcolor, opac)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_xcolor,(Object)(_opac));
RDebugUtils.currentLine=170852355;
 //BA.debugLineNum = 170852355;BA.debugLine="Loader.SetAttr1(\":opacity\", xcolor)";
__ref._loader /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":opacity",(Object)(_xcolor));
RDebugUtils.currentLine=170852356;
 //BA.debugLineNum = 170852356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=170852357;
 //BA.debugLineNum = 170852357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setpadding(b4j.example.vmloader __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=171376640;
 //BA.debugLineNum = 171376640;BA.debugLine="Sub SetPadding(p As String) As VMLoader";
RDebugUtils.currentLine=171376641;
 //BA.debugLineNum = 171376641;BA.debugLine="Loader.SetStyle(CreateMap(\"padding\":p))";
__ref._loader /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("padding"),(Object)(_p)}));
RDebugUtils.currentLine=171376642;
 //BA.debugLineNum = 171376642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=171376643;
 //BA.debugLineNum = 171376643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setstyle(b4j.example.vmloader __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmloader";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=171245568;
 //BA.debugLineNum = 171245568;BA.debugLine="Sub SetStyle(m As Map) As VMLoader";
RDebugUtils.currentLine=171245569;
 //BA.debugLineNum = 171245569;BA.debugLine="Loader.SetStyle(m)";
__ref._loader /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=171245570;
 //BA.debugLineNum = 171245570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
RDebugUtils.currentLine=171245571;
 //BA.debugLineNum = 171245571;BA.debugLine="End Sub";
return null;
}
}