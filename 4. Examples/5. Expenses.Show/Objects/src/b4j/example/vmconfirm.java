package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmconfirm extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmconfirm", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmconfirm.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _confirm = null;
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
public b4j.example.vmconfirm  _setstatic(b4j.example.vmconfirm __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "setstatic", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "setstatic", new Object[] {_b}));}
RDebugUtils.currentLine=92012544;
 //BA.debugLineNum = 92012544;BA.debugLine="Sub SetStatic(b As Boolean) As VMConfirm";
RDebugUtils.currentLine=92012545;
 //BA.debugLineNum = 92012545;BA.debugLine="bstatic = b";
__ref._bstatic /*boolean*/  = _b;
RDebugUtils.currentLine=92012546;
 //BA.debugLineNum = 92012546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=92012547;
 //BA.debugLineNum = 92012547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _settitle(b4j.example.vmconfirm __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "settitle", new Object[] {_t}));}
RDebugUtils.currentLine=92602368;
 //BA.debugLineNum = 92602368;BA.debugLine="Sub SetTitle(t As String) As VMConfirm";
RDebugUtils.currentLine=92602369;
 //BA.debugLineNum = 92602369;BA.debugLine="If bstatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=92602370;
 //BA.debugLineNum = 92602370;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-title\":t))";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-title"),(Object)(_t)}));
RDebugUtils.currentLine=92602371;
 //BA.debugLineNum = 92602371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 };
RDebugUtils.currentLine=92602373;
 //BA.debugLineNum = 92602373;BA.debugLine="vue.SetState(CreateMap(\"confirmtitle\":t))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("confirmtitle"),(Object)(_t)}));
RDebugUtils.currentLine=92602374;
 //BA.debugLineNum = 92602374;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-title\":\"confirmtit";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-title"),(Object)("confirmtitle")}));
RDebugUtils.currentLine=92602375;
 //BA.debugLineNum = 92602375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=92602376;
 //BA.debugLineNum = 92602376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _setconfirmtext(b4j.example.vmconfirm __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "setconfirmtext", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "setconfirmtext", new Object[] {_t}));}
RDebugUtils.currentLine=92536832;
 //BA.debugLineNum = 92536832;BA.debugLine="Sub SetConfirmText(t As String) As VMConfirm";
RDebugUtils.currentLine=92536833;
 //BA.debugLineNum = 92536833;BA.debugLine="If bstatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=92536834;
 //BA.debugLineNum = 92536834;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-confirm-text\":t))";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-confirm-text"),(Object)(_t)}));
RDebugUtils.currentLine=92536835;
 //BA.debugLineNum = 92536835;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 };
RDebugUtils.currentLine=92536837;
 //BA.debugLineNum = 92536837;BA.debugLine="vue.SetState(CreateMap(\"confirmtext\":t))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("confirmtext"),(Object)(_t)}));
RDebugUtils.currentLine=92536838;
 //BA.debugLineNum = 92536838;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-confirm-text\":\"con";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-confirm-text"),(Object)("confirmtext")}));
RDebugUtils.currentLine=92536839;
 //BA.debugLineNum = 92536839;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=92536840;
 //BA.debugLineNum = 92536840;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _setcontent(b4j.example.vmconfirm __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "setcontent", new Object[] {_c}));}
RDebugUtils.currentLine=92471296;
 //BA.debugLineNum = 92471296;BA.debugLine="Sub SetContent(c As String) As VMConfirm";
RDebugUtils.currentLine=92471297;
 //BA.debugLineNum = 92471297;BA.debugLine="If bstatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=92471298;
 //BA.debugLineNum = 92471298;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-content\": c))";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-content"),(Object)(_c)}));
RDebugUtils.currentLine=92471299;
 //BA.debugLineNum = 92471299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 };
RDebugUtils.currentLine=92471301;
 //BA.debugLineNum = 92471301;BA.debugLine="vue.SetState(CreateMap(\"confirmmessage\":c))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("confirmmessage"),(Object)(_c)}));
RDebugUtils.currentLine=92471302;
 //BA.debugLineNum = 92471302;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-content\": \"confirm";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-content"),(Object)("confirmmessage")}));
RDebugUtils.currentLine=92471303;
 //BA.debugLineNum = 92471303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=92471304;
 //BA.debugLineNum = 92471304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _setcanceltext(b4j.example.vmconfirm __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "setcanceltext", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "setcanceltext", new Object[] {_c}));}
RDebugUtils.currentLine=92340224;
 //BA.debugLineNum = 92340224;BA.debugLine="Sub SetCancelText(c As String) As VMConfirm";
RDebugUtils.currentLine=92340225;
 //BA.debugLineNum = 92340225;BA.debugLine="If bstatic Then";
if (__ref._bstatic /*boolean*/ ) { 
RDebugUtils.currentLine=92340226;
 //BA.debugLineNum = 92340226;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-cancel-text\": c))";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-cancel-text"),(Object)(_c)}));
RDebugUtils.currentLine=92340227;
 //BA.debugLineNum = 92340227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 };
RDebugUtils.currentLine=92340229;
 //BA.debugLineNum = 92340229;BA.debugLine="vue.SetState(CreateMap(\"canceltext\":c))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("canceltext"),(Object)(_c)}));
RDebugUtils.currentLine=92340230;
 //BA.debugLineNum = 92340230;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-cancel-text\": \"can";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-cancel-text"),(Object)("canceltext")}));
RDebugUtils.currentLine=92340231;
 //BA.debugLineNum = 92340231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=92340232;
 //BA.debugLineNum = 92340232;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmconfirm __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=92798976;
 //BA.debugLineNum = 92798976;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=92798977;
 //BA.debugLineNum = 92798977;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=92798978;
 //BA.debugLineNum = 92798978;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmconfirm  _initialize(b4j.example.vmconfirm __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=91947008;
 //BA.debugLineNum = 91947008;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=91947009;
 //BA.debugLineNum = 91947009;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=91947010;
 //BA.debugLineNum = 91947010;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=91947011;
 //BA.debugLineNum = 91947011;BA.debugLine="Confirm.Initialize(vue, ID).SetTag(\"md-dialog-con";
__ref._confirm /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-dialog-confirm");
RDebugUtils.currentLine=91947012;
 //BA.debugLineNum = 91947012;BA.debugLine="bActive = False";
__ref._bactive /*boolean*/  = __c.False;
RDebugUtils.currentLine=91947013;
 //BA.debugLineNum = 91947013;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=91947014;
 //BA.debugLineNum = 91947014;BA.debugLine="SetActiveSync(ID)";
__ref._setactivesync /*b4j.example.vmconfirm*/ (null,(Object)(__ref._id /*String*/ ));
 };
RDebugUtils.currentLine=91947016;
 //BA.debugLineNum = 91947016;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=91947017;
 //BA.debugLineNum = 91947017;BA.debugLine="Confirm.SetOnConfirm(module, $\"${ID}_ok\"$)";
__ref._confirm /*b4j.example.vmelement*/ ._setonconfirm /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_ok"));
RDebugUtils.currentLine=91947018;
 //BA.debugLineNum = 91947018;BA.debugLine="Confirm.SetOnCancel(module, $\"${ID}_cancel\"$)";
__ref._confirm /*b4j.example.vmelement*/ ._setoncancel /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_cancel"));
RDebugUtils.currentLine=91947019;
 //BA.debugLineNum = 91947019;BA.debugLine="bstatic = False";
__ref._bstatic /*boolean*/  = __c.False;
RDebugUtils.currentLine=91947020;
 //BA.debugLineNum = 91947020;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=91947021;
 //BA.debugLineNum = 91947021;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.vmconfirm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=92143616;
 //BA.debugLineNum = 92143616;BA.debugLine="Sub Show";
RDebugUtils.currentLine=92143617;
 //BA.debugLineNum = 92143617;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=92143618;
 //BA.debugLineNum = 92143618;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.True));
RDebugUtils.currentLine=92143619;
 //BA.debugLineNum = 92143619;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=92143620;
 //BA.debugLineNum = 92143620;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmconfirm  _addclass(b4j.example.vmconfirm __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=92209152;
 //BA.debugLineNum = 92209152;BA.debugLine="Sub AddClass(c As String) As VMConfirm";
RDebugUtils.currentLine=92209153;
 //BA.debugLineNum = 92209153;BA.debugLine="Confirm.AddClass(c)";
__ref._confirm /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=92209154;
 //BA.debugLineNum = 92209154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=92209155;
 //BA.debugLineNum = 92209155;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmconfirm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
RDebugUtils.currentLine=91881472;
 //BA.debugLineNum = 91881472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=91881473;
 //BA.debugLineNum = 91881473;BA.debugLine="Public Confirm As VMElement";
_confirm = new b4j.example.vmelement();
RDebugUtils.currentLine=91881474;
 //BA.debugLineNum = 91881474;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=91881475;
 //BA.debugLineNum = 91881475;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=91881476;
 //BA.debugLineNum = 91881476;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=91881477;
 //BA.debugLineNum = 91881477;BA.debugLine="Private bActive As Boolean";
_bactive = false;
RDebugUtils.currentLine=91881478;
 //BA.debugLineNum = 91881478;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=91881479;
 //BA.debugLineNum = 91881479;BA.debugLine="Private bstatic As Boolean";
_bstatic = false;
RDebugUtils.currentLine=91881480;
 //BA.debugLineNum = 91881480;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.vmconfirm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=92078080;
 //BA.debugLineNum = 92078080;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=92078081;
 //BA.debugLineNum = 92078081;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=92078082;
 //BA.debugLineNum = 92078082;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.False));
RDebugUtils.currentLine=92078083;
 //BA.debugLineNum = 92078083;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=92078084;
 //BA.debugLineNum = 92078084;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmconfirm  _setactivesync(b4j.example.vmconfirm __ref,Object _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "setactivesync", new Object[] {_a}));}
RDebugUtils.currentLine=92405760;
 //BA.debugLineNum = 92405760;BA.debugLine="private Sub SetActiveSync(a As Object) As VMConfir";
RDebugUtils.currentLine=92405761;
 //BA.debugLineNum = 92405761;BA.debugLine="Confirm.SetActiveSync(a)";
__ref._confirm /*b4j.example.vmelement*/ ._setactivesync /*b4j.example.vmelement*/ (null,BA.ObjectToString(_a));
RDebugUtils.currentLine=92405762;
 //BA.debugLineNum = 92405762;BA.debugLine="bActive = True";
__ref._bactive /*boolean*/  = __c.True;
RDebugUtils.currentLine=92405763;
 //BA.debugLineNum = 92405763;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=92405764;
 //BA.debugLineNum = 92405764;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmconfirm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=92667904;
 //BA.debugLineNum = 92667904;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=92667905;
 //BA.debugLineNum = 92667905;BA.debugLine="If bActive = False Then";
if (__ref._bactive /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=92667906;
 //BA.debugLineNum = 92667906;BA.debugLine="Log($\"VMConfirm.SetActiveSync: '${ID}' has not b";
__c.Log(("VMConfirm.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' has not been activated!"));
 };
RDebugUtils.currentLine=92667908;
 //BA.debugLineNum = 92667908;BA.debugLine="Return Confirm.tostring";
if (true) return __ref._confirm /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=92667909;
 //BA.debugLineNum = 92667909;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmconfirm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=92733440;
 //BA.debugLineNum = 92733440;BA.debugLine="Sub Render";
RDebugUtils.currentLine=92733441;
 //BA.debugLineNum = 92733441;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=92733442;
 //BA.debugLineNum = 92733442;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmconfirm  _setattr(b4j.example.vmconfirm __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmconfirm";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=92274688;
 //BA.debugLineNum = 92274688;BA.debugLine="Sub SetAttr(attr As Map) As VMConfirm";
RDebugUtils.currentLine=92274689;
 //BA.debugLineNum = 92274689;BA.debugLine="Confirm.SetAttr(attr)";
__ref._confirm /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=92274690;
 //BA.debugLineNum = 92274690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
RDebugUtils.currentLine=92274691;
 //BA.debugLineNum = 92274691;BA.debugLine="End Sub";
return null;
}
}