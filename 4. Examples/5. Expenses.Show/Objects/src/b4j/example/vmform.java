package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmform extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmform", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmform.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _form = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmcontainer _container = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmform  _initialize(b4j.example.vmform __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmform";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmform) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=125239296;
 //BA.debugLineNum = 125239296;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=125239297;
 //BA.debugLineNum = 125239297;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=125239298;
 //BA.debugLineNum = 125239298;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=125239299;
 //BA.debugLineNum = 125239299;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=125239300;
 //BA.debugLineNum = 125239300;BA.debugLine="Form.Initialize(vue, ID).SetTag(\"form\")";
__ref._form /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"form");
RDebugUtils.currentLine=125239301;
 //BA.debugLineNum = 125239301;BA.debugLine="Container.Initialize(vue, sid & \"grid\", eventHand";
__ref._container /*b4j.example.vmcontainer*/ ._initialize /*b4j.example.vmcontainer*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid+"grid",_eventhandler);
RDebugUtils.currentLine=125239302;
 //BA.debugLineNum = 125239302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
RDebugUtils.currentLine=125239303;
 //BA.debugLineNum = 125239303;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmform __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmform";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=125501440;
 //BA.debugLineNum = 125501440;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=125501441;
 //BA.debugLineNum = 125501441;BA.debugLine="Form.SetText(Container.ToString)";
__ref._form /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,__ref._container /*b4j.example.vmcontainer*/ ._tostring /*String*/ (null));
RDebugUtils.currentLine=125501442;
 //BA.debugLineNum = 125501442;BA.debugLine="Return Form.tostring";
if (true) return __ref._form /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=125501443;
 //BA.debugLineNum = 125501443;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _addclass(b4j.example.vmform __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmform";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmform) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=125304832;
 //BA.debugLineNum = 125304832;BA.debugLine="Sub AddClass(c As String) As VMForm";
RDebugUtils.currentLine=125304833;
 //BA.debugLineNum = 125304833;BA.debugLine="Form.AddClass(c)";
__ref._form /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=125304834;
 //BA.debugLineNum = 125304834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
RDebugUtils.currentLine=125304835;
 //BA.debugLineNum = 125304835;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmform __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmform";
RDebugUtils.currentLine=125173760;
 //BA.debugLineNum = 125173760;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=125173761;
 //BA.debugLineNum = 125173761;BA.debugLine="Public Form As VMElement";
_form = new b4j.example.vmelement();
RDebugUtils.currentLine=125173762;
 //BA.debugLineNum = 125173762;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=125173763;
 //BA.debugLineNum = 125173763;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=125173764;
 //BA.debugLineNum = 125173764;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
RDebugUtils.currentLine=125173765;
 //BA.debugLineNum = 125173765;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=125173766;
 //BA.debugLineNum = 125173766;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmform __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmform";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=125632512;
 //BA.debugLineNum = 125632512;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=125632513;
 //BA.debugLineNum = 125632513;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=125632514;
 //BA.debugLineNum = 125632514;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmform __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmform";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=125566976;
 //BA.debugLineNum = 125566976;BA.debugLine="Sub Render";
RDebugUtils.currentLine=125566977;
 //BA.debugLineNum = 125566977;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=125566978;
 //BA.debugLineNum = 125566978;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _setattr(b4j.example.vmform __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmform";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmform) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=125435904;
 //BA.debugLineNum = 125435904;BA.debugLine="Sub SetAttr(attr As Map) As VMForm";
RDebugUtils.currentLine=125435905;
 //BA.debugLineNum = 125435905;BA.debugLine="Form.SetAttr(attr)";
__ref._form /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=125435906;
 //BA.debugLineNum = 125435906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
RDebugUtils.currentLine=125435907;
 //BA.debugLineNum = 125435907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setnovalidate(b4j.example.vmform __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmform";
if (Debug.shouldDelegate(ba, "setnovalidate", true))
	 {return ((b4j.example.vmform) Debug.delegate(ba, "setnovalidate", new Object[] {_b}));}
RDebugUtils.currentLine=125370368;
 //BA.debugLineNum = 125370368;BA.debugLine="Sub SetNoValidate(b As Boolean) As VMForm";
RDebugUtils.currentLine=125370369;
 //BA.debugLineNum = 125370369;BA.debugLine="SetAttr(CreateMap(\":novalidate\": b))";
__ref._setattr /*b4j.example.vmform*/ (null,__c.createMap(new Object[] {(Object)(":novalidate"),(Object)(_b)}));
RDebugUtils.currentLine=125370370;
 //BA.debugLineNum = 125370370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
RDebugUtils.currentLine=125370371;
 //BA.debugLineNum = 125370371;BA.debugLine="End Sub";
return null;
}
}