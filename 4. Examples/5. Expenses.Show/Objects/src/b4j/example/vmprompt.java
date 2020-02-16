package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprompt extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmprompt", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprompt.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _prompt = null;
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
public b4j.example.vmprompt  _setstatic(b4j.example.vmprompt __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setstatic", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setstatic", new Object[] {_b}));}
RDebugUtils.currentLine=183566336;
 //BA.debugLineNum = 183566336;BA.debugLine="Sub SetStatic(b As Boolean) As VMPrompt";
RDebugUtils.currentLine=183566337;
 //BA.debugLineNum = 183566337;BA.debugLine="bStatic = b";
__ref._bstatic /*boolean*/  = _b;
RDebugUtils.currentLine=183566338;
 //BA.debugLineNum = 183566338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=183566339;
 //BA.debugLineNum = 183566339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _settitle(b4j.example.vmprompt __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "settitle", new Object[] {_t}));}
RDebugUtils.currentLine=184352768;
 //BA.debugLineNum = 184352768;BA.debugLine="Sub SetTitle(t As String) As VMPrompt";
RDebugUtils.currentLine=184352769;
 //BA.debugLineNum = 184352769;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=184352770;
 //BA.debugLineNum = 184352770;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-title\":t))";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-title"),(Object)(_t)}));
RDebugUtils.currentLine=184352771;
 //BA.debugLineNum = 184352771;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
RDebugUtils.currentLine=184352773;
 //BA.debugLineNum = 184352773;BA.debugLine="vue.SetState(CreateMap(\"prompttitle\":t))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("prompttitle"),(Object)(_t)}));
RDebugUtils.currentLine=184352774;
 //BA.debugLineNum = 184352774;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-title\":\"prompttitle";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-title"),(Object)("prompttitle")}));
RDebugUtils.currentLine=184352775;
 //BA.debugLineNum = 184352775;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=184352776;
 //BA.debugLineNum = 184352776;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setcontent(b4j.example.vmprompt __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setcontent", new Object[] {_c}));}
RDebugUtils.currentLine=184221696;
 //BA.debugLineNum = 184221696;BA.debugLine="Sub SetContent(c As String) As VMPrompt";
RDebugUtils.currentLine=184221697;
 //BA.debugLineNum = 184221697;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=184221698;
 //BA.debugLineNum = 184221698;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-content\": c))";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-content"),(Object)(_c)}));
RDebugUtils.currentLine=184221699;
 //BA.debugLineNum = 184221699;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
RDebugUtils.currentLine=184221701;
 //BA.debugLineNum = 184221701;BA.debugLine="vue.SetState(CreateMap(\"promptcontent\":c))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("promptcontent"),(Object)(_c)}));
RDebugUtils.currentLine=184221702;
 //BA.debugLineNum = 184221702;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-content\": \"promptco";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-content"),(Object)("promptcontent")}));
RDebugUtils.currentLine=184221703;
 //BA.debugLineNum = 184221703;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=184221704;
 //BA.debugLineNum = 184221704;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setmaxlength(b4j.example.vmprompt __ref,int _ml) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setmaxlength", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setmaxlength", new Object[] {_ml}));}
RDebugUtils.currentLine=183959552;
 //BA.debugLineNum = 183959552;BA.debugLine="Sub SetMaxLength(ml As Int) As VMPrompt";
RDebugUtils.currentLine=183959553;
 //BA.debugLineNum = 183959553;BA.debugLine="If ml < 0 Then Return Me";
if (_ml<0) { 
if (true) return (b4j.example.vmprompt)(this);};
RDebugUtils.currentLine=183959554;
 //BA.debugLineNum = 183959554;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=183959555;
 //BA.debugLineNum = 183959555;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-maxlength\": m";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-input-maxlength"),(Object)(_ml)}));
RDebugUtils.currentLine=183959556;
 //BA.debugLineNum = 183959556;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
RDebugUtils.currentLine=183959558;
 //BA.debugLineNum = 183959558;BA.debugLine="vue.SetState(CreateMap(\"promptmaxlength\":ml))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("promptmaxlength"),(Object)(_ml)}));
RDebugUtils.currentLine=183959559;
 //BA.debugLineNum = 183959559;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-input-maxlength\": \"";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-input-maxlength"),(Object)("promptmaxlength")}));
RDebugUtils.currentLine=183959560;
 //BA.debugLineNum = 183959560;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=183959561;
 //BA.debugLineNum = 183959561;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setplaceholder(b4j.example.vmprompt __ref,String _ph) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setplaceholder", new Object[] {_ph}));}
RDebugUtils.currentLine=184025088;
 //BA.debugLineNum = 184025088;BA.debugLine="Sub SetPlaceHolder(ph As String) As VMPrompt";
RDebugUtils.currentLine=184025089;
 //BA.debugLineNum = 184025089;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=184025090;
 //BA.debugLineNum = 184025090;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-placeholder\":";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-input-placeholder"),(Object)(_ph)}));
RDebugUtils.currentLine=184025091;
 //BA.debugLineNum = 184025091;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
RDebugUtils.currentLine=184025093;
 //BA.debugLineNum = 184025093;BA.debugLine="vue.SetState(CreateMap(\"promptplaceholder\":ph))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("promptplaceholder"),(Object)(_ph)}));
RDebugUtils.currentLine=184025094;
 //BA.debugLineNum = 184025094;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-input-placeholder\":";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-input-placeholder"),(Object)("promptplaceholder")}));
RDebugUtils.currentLine=184025095;
 //BA.debugLineNum = 184025095;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=184025096;
 //BA.debugLineNum = 184025096;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setconfirmtext(b4j.example.vmprompt __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setconfirmtext", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setconfirmtext", new Object[] {_t}));}
RDebugUtils.currentLine=184287232;
 //BA.debugLineNum = 184287232;BA.debugLine="Sub SetConfirmText(t As String) As VMPrompt";
RDebugUtils.currentLine=184287233;
 //BA.debugLineNum = 184287233;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=184287234;
 //BA.debugLineNum = 184287234;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-confirm-text\":t))";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-confirm-text"),(Object)(_t)}));
RDebugUtils.currentLine=184287235;
 //BA.debugLineNum = 184287235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
RDebugUtils.currentLine=184287237;
 //BA.debugLineNum = 184287237;BA.debugLine="vue.SetState(CreateMap(\"promptconfirmtext\":t))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("promptconfirmtext"),(Object)(_t)}));
RDebugUtils.currentLine=184287238;
 //BA.debugLineNum = 184287238;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-confirm-text\":\"prom";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-confirm-text"),(Object)("promptconfirmtext")}));
RDebugUtils.currentLine=184287239;
 //BA.debugLineNum = 184287239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=184287240;
 //BA.debugLineNum = 184287240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setcanceltext(b4j.example.vmprompt __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setcanceltext", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setcanceltext", new Object[] {_c}));}
RDebugUtils.currentLine=184090624;
 //BA.debugLineNum = 184090624;BA.debugLine="Sub SetCancelText(c As String) As VMPrompt";
RDebugUtils.currentLine=184090625;
 //BA.debugLineNum = 184090625;BA.debugLine="If bStatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=184090626;
 //BA.debugLineNum = 184090626;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-cancel-text\": c))";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-cancel-text"),(Object)(_c)}));
RDebugUtils.currentLine=184090627;
 //BA.debugLineNum = 184090627;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
RDebugUtils.currentLine=184090629;
 //BA.debugLineNum = 184090629;BA.debugLine="vue.SetState(CreateMap(\"promptcanceltext\":c))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("promptcanceltext"),(Object)(_c)}));
RDebugUtils.currentLine=184090630;
 //BA.debugLineNum = 184090630;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-cancel-text\": \"prom";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-cancel-text"),(Object)("promptcanceltext")}));
RDebugUtils.currentLine=184090631;
 //BA.debugLineNum = 184090631;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=184090632;
 //BA.debugLineNum = 184090632;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmprompt __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=184549376;
 //BA.debugLineNum = 184549376;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=184549377;
 //BA.debugLineNum = 184549377;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=184549378;
 //BA.debugLineNum = 184549378;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprompt  _initialize(b4j.example.vmprompt __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=183369728;
 //BA.debugLineNum = 183369728;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=183369729;
 //BA.debugLineNum = 183369729;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=183369730;
 //BA.debugLineNum = 183369730;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=183369731;
 //BA.debugLineNum = 183369731;BA.debugLine="Prompt.Initialize(vue, ID).SetTag(\"md-dialog-prom";
__ref._prompt /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-dialog-prompt");
RDebugUtils.currentLine=183369732;
 //BA.debugLineNum = 183369732;BA.debugLine="bActive = False";
__ref._bactive /*boolean*/  = __c.False;
RDebugUtils.currentLine=183369733;
 //BA.debugLineNum = 183369733;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=183369734;
 //BA.debugLineNum = 183369734;BA.debugLine="SetActiveSync(ID)";
__ref._setactivesync /*b4j.example.vmprompt*/ (null,(Object)(__ref._id /*String*/ ));
 };
RDebugUtils.currentLine=183369736;
 //BA.debugLineNum = 183369736;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=183369737;
 //BA.debugLineNum = 183369737;BA.debugLine="Prompt.SetOnConfirm(module, $\"${ID}_ok\"$)";
__ref._prompt /*b4j.example.vmelement*/ ._setonconfirm /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_ok"));
RDebugUtils.currentLine=183369738;
 //BA.debugLineNum = 183369738;BA.debugLine="Prompt.SetOnCancel(module, $\"${ID}_cancel\"$)";
__ref._prompt /*b4j.example.vmelement*/ ._setoncancel /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_cancel"));
RDebugUtils.currentLine=183369739;
 //BA.debugLineNum = 183369739;BA.debugLine="bStatic = False";
__ref._bstatic /*boolean*/  = __c.False;
RDebugUtils.currentLine=183369740;
 //BA.debugLineNum = 183369740;BA.debugLine="SetVModel(\"promptvalue\")";
__ref._setvmodel /*b4j.example.vmprompt*/ (null,"promptvalue");
RDebugUtils.currentLine=183369741;
 //BA.debugLineNum = 183369741;BA.debugLine="vue.SetStateSingle(\"promptvalue\",Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"promptvalue",__c.Null);
RDebugUtils.currentLine=183369742;
 //BA.debugLineNum = 183369742;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=183369743;
 //BA.debugLineNum = 183369743;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.vmprompt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=183500800;
 //BA.debugLineNum = 183500800;BA.debugLine="Sub Show";
RDebugUtils.currentLine=183500801;
 //BA.debugLineNum = 183500801;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=183500802;
 //BA.debugLineNum = 183500802;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.True));
RDebugUtils.currentLine=183500803;
 //BA.debugLineNum = 183500803;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=183500804;
 //BA.debugLineNum = 183500804;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprompt  _addclass(b4j.example.vmprompt __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=183631872;
 //BA.debugLineNum = 183631872;BA.debugLine="Sub AddClass(c As String) As VMPrompt";
RDebugUtils.currentLine=183631873;
 //BA.debugLineNum = 183631873;BA.debugLine="Prompt.AddClass(c)";
__ref._prompt /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=183631874;
 //BA.debugLineNum = 183631874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=183631875;
 //BA.debugLineNum = 183631875;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmprompt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
RDebugUtils.currentLine=183304192;
 //BA.debugLineNum = 183304192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=183304193;
 //BA.debugLineNum = 183304193;BA.debugLine="Public Prompt As VMElement";
_prompt = new b4j.example.vmelement();
RDebugUtils.currentLine=183304194;
 //BA.debugLineNum = 183304194;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=183304195;
 //BA.debugLineNum = 183304195;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=183304196;
 //BA.debugLineNum = 183304196;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=183304197;
 //BA.debugLineNum = 183304197;BA.debugLine="Private bActive As Boolean";
_bactive = false;
RDebugUtils.currentLine=183304198;
 //BA.debugLineNum = 183304198;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=183304199;
 //BA.debugLineNum = 183304199;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
RDebugUtils.currentLine=183304200;
 //BA.debugLineNum = 183304200;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.vmprompt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=183435264;
 //BA.debugLineNum = 183435264;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=183435265;
 //BA.debugLineNum = 183435265;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=183435266;
 //BA.debugLineNum = 183435266;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.False));
RDebugUtils.currentLine=183435267;
 //BA.debugLineNum = 183435267;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=183435268;
 //BA.debugLineNum = 183435268;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprompt  _setactivesync(b4j.example.vmprompt __ref,Object _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setactivesync", new Object[] {_a}));}
RDebugUtils.currentLine=184156160;
 //BA.debugLineNum = 184156160;BA.debugLine="private Sub SetActiveSync(a As Object) As VMPrompt";
RDebugUtils.currentLine=184156161;
 //BA.debugLineNum = 184156161;BA.debugLine="Prompt.SetActiveSync(a)";
__ref._prompt /*b4j.example.vmelement*/ ._setactivesync /*b4j.example.vmelement*/ (null,BA.ObjectToString(_a));
RDebugUtils.currentLine=184156162;
 //BA.debugLineNum = 184156162;BA.debugLine="bActive = True";
__ref._bactive /*boolean*/  = __c.True;
RDebugUtils.currentLine=184156163;
 //BA.debugLineNum = 184156163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=184156164;
 //BA.debugLineNum = 184156164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setvmodel(b4j.example.vmprompt __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=183762944;
 //BA.debugLineNum = 183762944;BA.debugLine="Sub SetVModel(k As String) As VMPrompt";
RDebugUtils.currentLine=183762945;
 //BA.debugLineNum = 183762945;BA.debugLine="Prompt.SetVModel(k)";
__ref._prompt /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=183762946;
 //BA.debugLineNum = 183762946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=183762947;
 //BA.debugLineNum = 183762947;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmprompt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=184418304;
 //BA.debugLineNum = 184418304;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=184418305;
 //BA.debugLineNum = 184418305;BA.debugLine="Return Prompt.tostring";
if (true) return __ref._prompt /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=184418306;
 //BA.debugLineNum = 184418306;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmprompt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=184483840;
 //BA.debugLineNum = 184483840;BA.debugLine="Sub Render";
RDebugUtils.currentLine=184483841;
 //BA.debugLineNum = 184483841;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=184483842;
 //BA.debugLineNum = 184483842;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprompt  _setattr(b4j.example.vmprompt __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=183697408;
 //BA.debugLineNum = 183697408;BA.debugLine="Sub SetAttr(attr As Map) As VMPrompt";
RDebugUtils.currentLine=183697409;
 //BA.debugLineNum = 183697409;BA.debugLine="Prompt.SetAttr(attr)";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=183697410;
 //BA.debugLineNum = 183697410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=183697411;
 //BA.debugLineNum = 183697411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setinputid(b4j.example.vmprompt __ref,Object _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setinputid", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setinputid", new Object[] {_n}));}
RDebugUtils.currentLine=183894016;
 //BA.debugLineNum = 183894016;BA.debugLine="Sub SetInputID(n As Object) As VMPrompt";
RDebugUtils.currentLine=183894017;
 //BA.debugLineNum = 183894017;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-id\": n))";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-input-id"),_n}));
RDebugUtils.currentLine=183894018;
 //BA.debugLineNum = 183894018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=183894019;
 //BA.debugLineNum = 183894019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setinputname(b4j.example.vmprompt __ref,Object _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprompt";
if (Debug.shouldDelegate(ba, "setinputname", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "setinputname", new Object[] {_n}));}
RDebugUtils.currentLine=183828480;
 //BA.debugLineNum = 183828480;BA.debugLine="Sub SetInputName(n As Object) As VMPrompt";
RDebugUtils.currentLine=183828481;
 //BA.debugLineNum = 183828481;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-name\": n))";
__ref._prompt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-input-name"),_n}));
RDebugUtils.currentLine=183828482;
 //BA.debugLineNum = 183828482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
RDebugUtils.currentLine=183828483;
 //BA.debugLineNum = 183828483;BA.debugLine="End Sub";
return null;
}
}