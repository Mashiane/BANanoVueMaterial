package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmalert extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmalert", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmalert.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _alert = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _bactive = false;
public Object _module = null;
public boolean _bstatic = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmalert  _setstatic(b4j.example.vmalert __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "setstatic", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "setstatic", new Object[] {_b}));}
RDebugUtils.currentLine=63766528;
 //BA.debugLineNum = 63766528;BA.debugLine="Sub SetStatic(b As Boolean) As VMAlert";
RDebugUtils.currentLine=63766529;
 //BA.debugLineNum = 63766529;BA.debugLine="bStatic = b";
__ref._bstatic /*boolean*/  = _b;
RDebugUtils.currentLine=63766530;
 //BA.debugLineNum = 63766530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
RDebugUtils.currentLine=63766531;
 //BA.debugLineNum = 63766531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settitle(b4j.example.vmalert __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "settitle", new Object[] {_t}));}
RDebugUtils.currentLine=64290816;
 //BA.debugLineNum = 64290816;BA.debugLine="Sub SetTitle(t As String) As VMAlert";
RDebugUtils.currentLine=64290817;
 //BA.debugLineNum = 64290817;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=64290818;
 //BA.debugLineNum = 64290818;BA.debugLine="Alert.SetAttr(CreateMap(\"md-title\":t))";
__ref._alert /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-title"),(Object)(_t)}));
RDebugUtils.currentLine=64290819;
 //BA.debugLineNum = 64290819;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
RDebugUtils.currentLine=64290821;
 //BA.debugLineNum = 64290821;BA.debugLine="vue.SetState(CreateMap(\"alerttitle\":t))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("alerttitle"),(Object)(_t)}));
RDebugUtils.currentLine=64290822;
 //BA.debugLineNum = 64290822;BA.debugLine="Alert.SetAttr(CreateMap(\":md-title\":\"alerttitle\")";
__ref._alert /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-title"),(Object)("alerttitle")}));
RDebugUtils.currentLine=64290823;
 //BA.debugLineNum = 64290823;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
RDebugUtils.currentLine=64290824;
 //BA.debugLineNum = 64290824;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setconfirmtext(b4j.example.vmalert __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "setconfirmtext", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "setconfirmtext", new Object[] {_t}));}
RDebugUtils.currentLine=64225280;
 //BA.debugLineNum = 64225280;BA.debugLine="Sub SetConfirmText(t As String) As VMAlert";
RDebugUtils.currentLine=64225281;
 //BA.debugLineNum = 64225281;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=64225282;
 //BA.debugLineNum = 64225282;BA.debugLine="Alert.SetAttr(CreateMap(\"md-confirm-text\":t))";
__ref._alert /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-confirm-text"),(Object)(_t)}));
RDebugUtils.currentLine=64225283;
 //BA.debugLineNum = 64225283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
RDebugUtils.currentLine=64225285;
 //BA.debugLineNum = 64225285;BA.debugLine="vue.SetState(CreateMap(\"confirmtext\":t))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("confirmtext"),(Object)(_t)}));
RDebugUtils.currentLine=64225286;
 //BA.debugLineNum = 64225286;BA.debugLine="Alert.SetAttr(CreateMap(\":md-confirm-text\":\"confi";
__ref._alert /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-confirm-text"),(Object)("confirmtext")}));
RDebugUtils.currentLine=64225287;
 //BA.debugLineNum = 64225287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
RDebugUtils.currentLine=64225288;
 //BA.debugLineNum = 64225288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setcontent(b4j.example.vmalert __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "setcontent", new Object[] {_c}));}
RDebugUtils.currentLine=64159744;
 //BA.debugLineNum = 64159744;BA.debugLine="Sub SetContent(c As String) As VMAlert";
RDebugUtils.currentLine=64159745;
 //BA.debugLineNum = 64159745;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=64159746;
 //BA.debugLineNum = 64159746;BA.debugLine="Alert.SetAttr(CreateMap(\"md-content\": c))";
__ref._alert /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-content"),(Object)(_c)}));
RDebugUtils.currentLine=64159747;
 //BA.debugLineNum = 64159747;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
RDebugUtils.currentLine=64159749;
 //BA.debugLineNum = 64159749;BA.debugLine="vue.SetState(CreateMap(\"alertmessage\":c))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("alertmessage"),(Object)(_c)}));
RDebugUtils.currentLine=64159750;
 //BA.debugLineNum = 64159750;BA.debugLine="Alert.SetAttr(CreateMap(\":md-content\": \"alertmess";
__ref._alert /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-content"),(Object)("alertmessage")}));
RDebugUtils.currentLine=64159751;
 //BA.debugLineNum = 64159751;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
RDebugUtils.currentLine=64159752;
 //BA.debugLineNum = 64159752;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmalert __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=64487424;
 //BA.debugLineNum = 64487424;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=64487425;
 //BA.debugLineNum = 64487425;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=64487426;
 //BA.debugLineNum = 64487426;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _initialize(b4j.example.vmalert __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=63700992;
 //BA.debugLineNum = 63700992;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=63700993;
 //BA.debugLineNum = 63700993;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=63700994;
 //BA.debugLineNum = 63700994;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=63700995;
 //BA.debugLineNum = 63700995;BA.debugLine="Alert.Initialize(vue, ID).SetTag(\"md-dialog-alert";
__ref._alert /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-dialog-alert");
RDebugUtils.currentLine=63700996;
 //BA.debugLineNum = 63700996;BA.debugLine="bActive = False";
__ref._bactive /*boolean*/  = __c.False;
RDebugUtils.currentLine=63700997;
 //BA.debugLineNum = 63700997;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=63700998;
 //BA.debugLineNum = 63700998;BA.debugLine="SetActiveSync(ID)";
__ref._setactivesync /*b4j.example.vmalert*/ (null,(Object)(__ref._id /*String*/ ));
 };
RDebugUtils.currentLine=63701000;
 //BA.debugLineNum = 63701000;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=63701001;
 //BA.debugLineNum = 63701001;BA.debugLine="bStatic = False";
__ref._bstatic /*boolean*/  = __c.False;
RDebugUtils.currentLine=63701002;
 //BA.debugLineNum = 63701002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
RDebugUtils.currentLine=63701003;
 //BA.debugLineNum = 63701003;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.vmalert __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=63897600;
 //BA.debugLineNum = 63897600;BA.debugLine="Sub Show";
RDebugUtils.currentLine=63897601;
 //BA.debugLineNum = 63897601;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=63897602;
 //BA.debugLineNum = 63897602;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.True));
RDebugUtils.currentLine=63897603;
 //BA.debugLineNum = 63897603;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=63897604;
 //BA.debugLineNum = 63897604;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _addclass(b4j.example.vmalert __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=63963136;
 //BA.debugLineNum = 63963136;BA.debugLine="Sub AddClass(c As String) As VMAlert";
RDebugUtils.currentLine=63963137;
 //BA.debugLineNum = 63963137;BA.debugLine="Alert.AddClass(c)";
__ref._alert /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=63963138;
 //BA.debugLineNum = 63963138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
RDebugUtils.currentLine=63963139;
 //BA.debugLineNum = 63963139;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmalert __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
RDebugUtils.currentLine=63635456;
 //BA.debugLineNum = 63635456;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=63635457;
 //BA.debugLineNum = 63635457;BA.debugLine="Public Alert As VMElement";
_alert = new b4j.example.vmelement();
RDebugUtils.currentLine=63635458;
 //BA.debugLineNum = 63635458;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=63635459;
 //BA.debugLineNum = 63635459;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=63635460;
 //BA.debugLineNum = 63635460;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=63635461;
 //BA.debugLineNum = 63635461;BA.debugLine="Private bActive As Boolean";
_bactive = false;
RDebugUtils.currentLine=63635462;
 //BA.debugLineNum = 63635462;BA.debugLine="Private module As Object  'ignore";
_module = new Object();
RDebugUtils.currentLine=63635463;
 //BA.debugLineNum = 63635463;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
RDebugUtils.currentLine=63635464;
 //BA.debugLineNum = 63635464;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.vmalert __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=63832064;
 //BA.debugLineNum = 63832064;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=63832065;
 //BA.debugLineNum = 63832065;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=63832066;
 //BA.debugLineNum = 63832066;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.False));
RDebugUtils.currentLine=63832067;
 //BA.debugLineNum = 63832067;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=63832068;
 //BA.debugLineNum = 63832068;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _setactivesync(b4j.example.vmalert __ref,Object _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "setactivesync", new Object[] {_a}));}
RDebugUtils.currentLine=64094208;
 //BA.debugLineNum = 64094208;BA.debugLine="private Sub SetActiveSync(a As Object) As VMAlert";
RDebugUtils.currentLine=64094209;
 //BA.debugLineNum = 64094209;BA.debugLine="Alert.SetActiveSync(a)";
__ref._alert /*b4j.example.vmelement*/ ._setactivesync /*b4j.example.vmelement*/ (null,BA.ObjectToString(_a));
RDebugUtils.currentLine=64094210;
 //BA.debugLineNum = 64094210;BA.debugLine="bActive = True";
__ref._bactive /*boolean*/  = __c.True;
RDebugUtils.currentLine=64094211;
 //BA.debugLineNum = 64094211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
RDebugUtils.currentLine=64094212;
 //BA.debugLineNum = 64094212;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmalert __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=64356352;
 //BA.debugLineNum = 64356352;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=64356353;
 //BA.debugLineNum = 64356353;BA.debugLine="If bActive = False Then";
if (__ref._bactive /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=64356354;
 //BA.debugLineNum = 64356354;BA.debugLine="Log($\"VMAlert.SetActiveSync: '${ID}' has not bee";
__c.Log(("VMAlert.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' has not been activated!"));
 };
RDebugUtils.currentLine=64356356;
 //BA.debugLineNum = 64356356;BA.debugLine="Return Alert.tostring";
if (true) return __ref._alert /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=64356357;
 //BA.debugLineNum = 64356357;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmalert __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=64421888;
 //BA.debugLineNum = 64421888;BA.debugLine="Sub Render";
RDebugUtils.currentLine=64421889;
 //BA.debugLineNum = 64421889;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=64421890;
 //BA.debugLineNum = 64421890;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _setattr(b4j.example.vmalert __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmalert";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=64028672;
 //BA.debugLineNum = 64028672;BA.debugLine="Sub SetAttr(attr As Map) As VMAlert";
RDebugUtils.currentLine=64028673;
 //BA.debugLineNum = 64028673;BA.debugLine="Alert.SetAttr(attr)";
__ref._alert /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=64028674;
 //BA.debugLineNum = 64028674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
RDebugUtils.currentLine=64028675;
 //BA.debugLineNum = 64028675;BA.debugLine="End Sub";
return null;
}
}