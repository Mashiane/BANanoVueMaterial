package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsnackbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmsnackbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsnackbar.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _snackbar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _bactive = false;
public Object _module = null;
public String _mkey = "";
public b4j.example.vmbutton _button = null;
public String _mname = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _pop(b4j.example.vmsnackbar __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=196280320;
 //BA.debugLineNum = 196280320;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=196280321;
 //BA.debugLineNum = 196280321;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=196280322;
 //BA.debugLineNum = 196280322;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _initialize(b4j.example.vmsnackbar __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=195559424;
 //BA.debugLineNum = 195559424;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=195559425;
 //BA.debugLineNum = 195559425;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=195559426;
 //BA.debugLineNum = 195559426;BA.debugLine="Snackbar.Initialize(v, ID)";
__ref._snackbar /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=195559427;
 //BA.debugLineNum = 195559427;BA.debugLine="Snackbar.SetTag(\"md-snackbar\")";
__ref._snackbar /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-snackbar");
RDebugUtils.currentLine=195559428;
 //BA.debugLineNum = 195559428;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=195559429;
 //BA.debugLineNum = 195559429;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=195559430;
 //BA.debugLineNum = 195559430;BA.debugLine="bActive = False";
__ref._bactive /*boolean*/  = __c.False;
RDebugUtils.currentLine=195559431;
 //BA.debugLineNum = 195559431;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=195559432;
 //BA.debugLineNum = 195559432;BA.debugLine="SetActiveSync(ID)";
__ref._setactivesync /*b4j.example.vmsnackbar*/ (null,__ref._id /*String*/ );
 };
RDebugUtils.currentLine=195559434;
 //BA.debugLineNum = 195559434;BA.debugLine="SetOnOpened";
__ref._setonopened /*b4j.example.vmsnackbar*/ (null);
RDebugUtils.currentLine=195559435;
 //BA.debugLineNum = 195559435;BA.debugLine="SetOnClosed";
__ref._setonclosed /*b4j.example.vmsnackbar*/ (null);
RDebugUtils.currentLine=195559436;
 //BA.debugLineNum = 195559436;BA.debugLine="mKey = $\"${ID}message\"$";
__ref._mkey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"message");
RDebugUtils.currentLine=195559437;
 //BA.debugLineNum = 195559437;BA.debugLine="vue.SetStateSingle(mKey, Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._mkey /*String*/ ,__c.Null);
RDebugUtils.currentLine=195559438;
 //BA.debugLineNum = 195559438;BA.debugLine="SetText1($\"{{ ${mKey} }}\"$)";
__ref._settext1 /*b4j.example.vmsnackbar*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(__ref._mkey /*String*/ ))+" }}"));
RDebugUtils.currentLine=195559439;
 //BA.debugLineNum = 195559439;BA.debugLine="Button.Initialize(vue, \"snackbutton\", Me)";
__ref._button /*b4j.example.vmbutton*/ ._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"snackbutton",this);
RDebugUtils.currentLine=195559440;
 //BA.debugLineNum = 195559440;BA.debugLine="mName = \"\"";
__ref._mname /*String*/  = "";
RDebugUtils.currentLine=195559441;
 //BA.debugLineNum = 195559441;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=195559442;
 //BA.debugLineNum = 195559442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=195559443;
 //BA.debugLineNum = 195559443;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.vmsnackbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=196018176;
 //BA.debugLineNum = 196018176;BA.debugLine="Sub Show";
RDebugUtils.currentLine=196018177;
 //BA.debugLineNum = 196018177;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=196018178;
 //BA.debugLineNum = 196018178;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.True));
RDebugUtils.currentLine=196018179;
 //BA.debugLineNum = 196018179;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=196018180;
 //BA.debugLineNum = 196018180;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _addchild(b4j.example.vmsnackbar __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=196083712;
 //BA.debugLineNum = 196083712;BA.debugLine="Sub AddChild(child As VMElement) As VMSnackbar";
RDebugUtils.currentLine=196083713;
 //BA.debugLineNum = 196083713;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=196083714;
 //BA.debugLineNum = 196083714;BA.debugLine="Snackbar.SetText(childHTML)";
__ref._snackbar /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=196083715;
 //BA.debugLineNum = 196083715;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196083716;
 //BA.debugLineNum = 196083716;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmsnackbar __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=196542464;
 //BA.debugLineNum = 196542464;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=196542465;
 //BA.debugLineNum = 196542465;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=196542466;
 //BA.debugLineNum = 196542466;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmsnackbar*/ (null,_childx);
 }
};
RDebugUtils.currentLine=196542468;
 //BA.debugLineNum = 196542468;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _addclass(b4j.example.vmsnackbar __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=196345856;
 //BA.debugLineNum = 196345856;BA.debugLine="Sub AddClass(c As String) As VMSnackbar";
RDebugUtils.currentLine=196345857;
 //BA.debugLineNum = 196345857;BA.debugLine="Snackbar.AddClass(c)";
__ref._snackbar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=196345858;
 //BA.debugLineNum = 196345858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196345859;
 //BA.debugLineNum = 196345859;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmsnackbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
RDebugUtils.currentLine=195493888;
 //BA.debugLineNum = 195493888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=195493889;
 //BA.debugLineNum = 195493889;BA.debugLine="Public Snackbar As VMElement";
_snackbar = new b4j.example.vmelement();
RDebugUtils.currentLine=195493890;
 //BA.debugLineNum = 195493890;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=195493891;
 //BA.debugLineNum = 195493891;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=195493892;
 //BA.debugLineNum = 195493892;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=195493893;
 //BA.debugLineNum = 195493893;BA.debugLine="Private bActive As Boolean";
_bactive = false;
RDebugUtils.currentLine=195493894;
 //BA.debugLineNum = 195493894;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=195493895;
 //BA.debugLineNum = 195493895;BA.debugLine="Private mKey As String";
_mkey = "";
RDebugUtils.currentLine=195493896;
 //BA.debugLineNum = 195493896;BA.debugLine="Public Button As VMButton";
_button = new b4j.example.vmbutton();
RDebugUtils.currentLine=195493897;
 //BA.debugLineNum = 195493897;BA.debugLine="Private mName As String";
_mname = "";
RDebugUtils.currentLine=195493898;
 //BA.debugLineNum = 195493898;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.vmsnackbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=195952640;
 //BA.debugLineNum = 195952640;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=195952641;
 //BA.debugLineNum = 195952641;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=195952642;
 //BA.debugLineNum = 195952642;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.False));
RDebugUtils.currentLine=195952643;
 //BA.debugLineNum = 195952643;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=195952644;
 //BA.debugLineNum = 195952644;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _setactivesync(b4j.example.vmsnackbar __ref,String _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setactivesync", new Object[] {_v}));}
RDebugUtils.currentLine=195821568;
 //BA.debugLineNum = 195821568;BA.debugLine="private Sub SetActiveSync(v As String) As VMSnackb";
RDebugUtils.currentLine=195821569;
 //BA.debugLineNum = 195821569;BA.debugLine="Snackbar.SetActiveSync(v)";
__ref._snackbar /*b4j.example.vmelement*/ ._setactivesync /*b4j.example.vmelement*/ (null,_v);
RDebugUtils.currentLine=195821570;
 //BA.debugLineNum = 195821570;BA.debugLine="bActive = True";
__ref._bactive /*boolean*/  = __c.True;
RDebugUtils.currentLine=195821571;
 //BA.debugLineNum = 195821571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=195821572;
 //BA.debugLineNum = 195821572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setonopened(b4j.example.vmsnackbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setonopened", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setonopened", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=197001216;
 //BA.debugLineNum = 197001216;BA.debugLine="private Sub SetOnOpened As VMSnackbar";
RDebugUtils.currentLine=197001217;
 //BA.debugLineNum = 197001217;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_opened");
RDebugUtils.currentLine=197001218;
 //BA.debugLineNum = 197001218;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
RDebugUtils.currentLine=197001219;
 //BA.debugLineNum = 197001219;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=197001220;
 //BA.debugLineNum = 197001220;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=197001221;
 //BA.debugLineNum = 197001221;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
__ref._setattr /*b4j.example.vmsnackbar*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
RDebugUtils.currentLine=197001223;
 //BA.debugLineNum = 197001223;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=197001224;
 //BA.debugLineNum = 197001224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=197001225;
 //BA.debugLineNum = 197001225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setonclosed(b4j.example.vmsnackbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setonclosed", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setonclosed", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=197066752;
 //BA.debugLineNum = 197066752;BA.debugLine="private Sub SetOnClosed As VMSnackbar";
RDebugUtils.currentLine=197066753;
 //BA.debugLineNum = 197066753;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_closed");
RDebugUtils.currentLine=197066754;
 //BA.debugLineNum = 197066754;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
RDebugUtils.currentLine=197066755;
 //BA.debugLineNum = 197066755;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=197066756;
 //BA.debugLineNum = 197066756;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=197066757;
 //BA.debugLineNum = 197066757;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
__ref._setattr /*b4j.example.vmsnackbar*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
RDebugUtils.currentLine=197066759;
 //BA.debugLineNum = 197066759;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=197066760;
 //BA.debugLineNum = 197066760;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=197066761;
 //BA.debugLineNum = 197066761;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settext1(b4j.example.vmsnackbar __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "settext1", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "settext1", new Object[] {_t}));}
b4j.example.vmelement _span = null;
RDebugUtils.currentLine=196214784;
 //BA.debugLineNum = 196214784;BA.debugLine="private Sub SetText1(t As String) As VMSnackbar";
RDebugUtils.currentLine=196214785;
 //BA.debugLineNum = 196214785;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
RDebugUtils.currentLine=196214786;
 //BA.debugLineNum = 196214786;BA.debugLine="span.Initialize(vue,$\"${ID}text\"$).SetTag(\"span\")";
_span._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"text"))._settag /*b4j.example.vmelement*/ (null,"span")._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=196214787;
 //BA.debugLineNum = 196214787;BA.debugLine="span.Pop(Snackbar)";
_span._pop /*String*/ (null,__ref._snackbar /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=196214788;
 //BA.debugLineNum = 196214788;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196214789;
 //BA.debugLineNum = 196214789;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmsnackbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=195756032;
 //BA.debugLineNum = 195756032;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=195756033;
 //BA.debugLineNum = 195756033;BA.debugLine="If bActive = False Then";
if (__ref._bactive /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=195756034;
 //BA.debugLineNum = 195756034;BA.debugLine="Log($\"VMSnackbar.SetActiveSync: '${ID}' has not";
__c.Log(("VMSnackbar.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' has not been activated!"));
 };
RDebugUtils.currentLine=195756036;
 //BA.debugLineNum = 195756036;BA.debugLine="Button.Pop(Snackbar)";
__ref._button /*b4j.example.vmbutton*/ ._pop /*String*/ (null,__ref._snackbar /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=195756037;
 //BA.debugLineNum = 195756037;BA.debugLine="Return Snackbar.ToString";
if (true) return __ref._snackbar /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=195756038;
 //BA.debugLineNum = 195756038;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmsnackbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=195887104;
 //BA.debugLineNum = 195887104;BA.debugLine="Sub Render";
RDebugUtils.currentLine=195887105;
 //BA.debugLineNum = 195887105;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=195887106;
 //BA.debugLineNum = 195887106;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _setattr(b4j.example.vmsnackbar __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=196411392;
 //BA.debugLineNum = 196411392;BA.debugLine="Sub SetAttr(attr As Map) As VMSnackbar";
RDebugUtils.currentLine=196411393;
 //BA.debugLineNum = 196411393;BA.debugLine="Snackbar.SetAttr(attr)";
__ref._snackbar /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=196411394;
 //BA.debugLineNum = 196411394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196411395;
 //BA.debugLineNum = 196411395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setduration(b4j.example.vmsnackbar __ref,int _varduration) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setduration", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setduration", new Object[] {_varduration}));}
String _pp = "";
RDebugUtils.currentLine=196673536;
 //BA.debugLineNum = 196673536;BA.debugLine="Sub SetDuration(varDuration As Int) As VMSnackbar";
RDebugUtils.currentLine=196673537;
 //BA.debugLineNum = 196673537;BA.debugLine="Dim pp As String = $\"${ID}duration\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"duration");
RDebugUtils.currentLine=196673538;
 //BA.debugLineNum = 196673538;BA.debugLine="vue.SetStateSingle(pp, varDuration)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_varduration));
RDebugUtils.currentLine=196673539;
 //BA.debugLineNum = 196673539;BA.debugLine="SetAttr(CreateMap(\":md-duration\": pp))";
__ref._setattr /*b4j.example.vmsnackbar*/ (null,__c.createMap(new Object[] {(Object)(":md-duration"),(Object)(_pp)}));
RDebugUtils.currentLine=196673540;
 //BA.debugLineNum = 196673540;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196673541;
 //BA.debugLineNum = 196673541;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setonclick(b4j.example.vmsnackbar __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setonclick", new Object[] {_methodname}));}
RDebugUtils.currentLine=195624960;
 //BA.debugLineNum = 195624960;BA.debugLine="Sub SetOnClick(methodName As String) As VMSnackbar";
RDebugUtils.currentLine=195624961;
 //BA.debugLineNum = 195624961;BA.debugLine="mName = methodName.ToLowerCase";
__ref._mname /*String*/  = _methodname.toLowerCase();
RDebugUtils.currentLine=195624962;
 //BA.debugLineNum = 195624962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=195624963;
 //BA.debugLineNum = 195624963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpadding(b4j.example.vmsnackbar __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=196608000;
 //BA.debugLineNum = 196608000;BA.debugLine="Sub SetPadding(p As Object) As VMSnackbar";
RDebugUtils.currentLine=196608001;
 //BA.debugLineNum = 196608001;BA.debugLine="Snackbar.SetPaddingAll(p)";
__ref._snackbar /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=196608002;
 //BA.debugLineNum = 196608002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196608003;
 //BA.debugLineNum = 196608003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpersistent(b4j.example.vmsnackbar __ref,boolean _varpersistent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setpersistent", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setpersistent", new Object[] {_varpersistent}));}
String _pp = "";
RDebugUtils.currentLine=196739072;
 //BA.debugLineNum = 196739072;BA.debugLine="Sub SetPersistent(varPersistent As Boolean) As VMS";
RDebugUtils.currentLine=196739073;
 //BA.debugLineNum = 196739073;BA.debugLine="Dim pp As String = $\"${ID}persistent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"persistent");
RDebugUtils.currentLine=196739074;
 //BA.debugLineNum = 196739074;BA.debugLine="vue.SetStateSingle(pp, varPersistent)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_varpersistent));
RDebugUtils.currentLine=196739075;
 //BA.debugLineNum = 196739075;BA.debugLine="SetAttr(CreateMap(\":md-persistent\": pp))";
__ref._setattr /*b4j.example.vmsnackbar*/ (null,__c.createMap(new Object[] {(Object)(":md-persistent"),(Object)(_pp)}));
RDebugUtils.currentLine=196739076;
 //BA.debugLineNum = 196739076;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196739077;
 //BA.debugLineNum = 196739077;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setposition(b4j.example.vmsnackbar __ref,Object _varposition) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setposition", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setposition", new Object[] {_varposition}));}
String _pp = "";
RDebugUtils.currentLine=196804608;
 //BA.debugLineNum = 196804608;BA.debugLine="Sub SetPosition(varPosition As Object) As VMSnackb";
RDebugUtils.currentLine=196804609;
 //BA.debugLineNum = 196804609;BA.debugLine="Dim pp As String = $\"${ID}position\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"position");
RDebugUtils.currentLine=196804610;
 //BA.debugLineNum = 196804610;BA.debugLine="vue.SetStateSingle(pp, varPosition)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,_varposition);
RDebugUtils.currentLine=196804611;
 //BA.debugLineNum = 196804611;BA.debugLine="SetAttr(CreateMap(\":md-position\": pp))";
__ref._setattr /*b4j.example.vmsnackbar*/ (null,__c.createMap(new Object[] {(Object)(":md-position"),(Object)(_pp)}));
RDebugUtils.currentLine=196804612;
 //BA.debugLineNum = 196804612;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196804613;
 //BA.debugLineNum = 196804613;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpositioncenter(b4j.example.vmsnackbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setpositioncenter", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setpositioncenter", new Object[] {_b}));}
RDebugUtils.currentLine=196870144;
 //BA.debugLineNum = 196870144;BA.debugLine="Sub SetPositionCenter(b As Boolean) As VMSnackbar";
RDebugUtils.currentLine=196870145;
 //BA.debugLineNum = 196870145;BA.debugLine="SetPosition(\"center\")";
__ref._setposition /*b4j.example.vmsnackbar*/ (null,(Object)("center"));
RDebugUtils.currentLine=196870146;
 //BA.debugLineNum = 196870146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196870147;
 //BA.debugLineNum = 196870147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpositionleft(b4j.example.vmsnackbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setpositionleft", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setpositionleft", new Object[] {_b}));}
RDebugUtils.currentLine=196935680;
 //BA.debugLineNum = 196935680;BA.debugLine="Sub SetPositionLeft(b As Boolean) As VMSnackbar";
RDebugUtils.currentLine=196935681;
 //BA.debugLineNum = 196935681;BA.debugLine="SetPosition(\"left\")";
__ref._setposition /*b4j.example.vmsnackbar*/ (null,(Object)("left"));
RDebugUtils.currentLine=196935682;
 //BA.debugLineNum = 196935682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196935683;
 //BA.debugLineNum = 196935683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setstyle(b4j.example.vmsnackbar __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=196476928;
 //BA.debugLineNum = 196476928;BA.debugLine="Sub SetStyle(sm As Map) As VMSnackbar";
RDebugUtils.currentLine=196476929;
 //BA.debugLineNum = 196476929;BA.debugLine="Snackbar.SetStyle(sm)";
__ref._snackbar /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=196476930;
 //BA.debugLineNum = 196476930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196476931;
 //BA.debugLineNum = 196476931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settext(b4j.example.vmsnackbar __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=196149248;
 //BA.debugLineNum = 196149248;BA.debugLine="Sub SetText(t As String) As VMSnackbar";
RDebugUtils.currentLine=196149249;
 //BA.debugLineNum = 196149249;BA.debugLine="vue.SetStateSingle(mKey, t)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._mkey /*String*/ ,(Object)(_t));
RDebugUtils.currentLine=196149250;
 //BA.debugLineNum = 196149250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
RDebugUtils.currentLine=196149251;
 //BA.debugLineNum = 196149251;BA.debugLine="End Sub";
return null;
}
public String  _snackbutton_click(b4j.example.vmsnackbar __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsnackbar";
if (Debug.shouldDelegate(ba, "snackbutton_click", true))
	 {return ((String) Debug.delegate(ba, "snackbutton_click", new Object[] {_e}));}
RDebugUtils.currentLine=195690496;
 //BA.debugLineNum = 195690496;BA.debugLine="Sub snackbutton_click(e As BANanoEvent)";
RDebugUtils.currentLine=195690497;
 //BA.debugLineNum = 195690497;BA.debugLine="If mName = \"\" Then";
if ((__ref._mname /*String*/ ).equals("")) { 
RDebugUtils.currentLine=195690498;
 //BA.debugLineNum = 195690498;BA.debugLine="Log($\"VMSnackbar.snackbutton_click: 'SetOnClick'";
__c.Log(("VMSnackbar.snackbutton_click: 'SetOnClick' has not been set!"));
 };
RDebugUtils.currentLine=195690500;
 //BA.debugLineNum = 195690500;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=195690501;
 //BA.debugLineNum = 195690501;BA.debugLine="BANano.CallSub(module, mName, Null)";
__ref._banano /*com.ab.banano.BANano*/ .CallSub(__ref._module /*Object*/ ,__ref._mname /*String*/ ,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=195690502;
 //BA.debugLineNum = 195690502;BA.debugLine="End Sub";
return "";
}
}