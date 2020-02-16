package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmenlighter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmenlighter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmenlighter.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _enlighter = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _codename = "";
public String _codevisible = "";
public anywheresoftware.b4a.objects.collections.Map _options = null;
public b4j.example.vmelement _codeel = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmenlighter  _initialize(b4j.example.vmenlighter __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _lang) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_lang}));}
RDebugUtils.currentLine=120520704;
 //BA.debugLineNum = 120520704;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=120520705;
 //BA.debugLineNum = 120520705;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=120520706;
 //BA.debugLineNum = 120520706;BA.debugLine="Enlighter.Initialize(v, ID).SetTag(\"pre\")";
__ref._enlighter /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"pre");
RDebugUtils.currentLine=120520707;
 //BA.debugLineNum = 120520707;BA.debugLine="Enlighter.SetAttr(CreateMap(\"data-enlighter-langu";
__ref._enlighter /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-enlighter-language"),(Object)(_lang)}));
RDebugUtils.currentLine=120520708;
 //BA.debugLineNum = 120520708;BA.debugLine="Enlighter.SetAttr(CreateMap(\"data-enlighter-linen";
__ref._enlighter /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-enlighter-linenumbers"),(Object)("true")}));
RDebugUtils.currentLine=120520709;
 //BA.debugLineNum = 120520709;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=120520710;
 //BA.debugLineNum = 120520710;BA.debugLine="Enlighter.SetStyle(CreateMap(\"width\":\"100% !impor";
__ref._enlighter /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)("100% !important"),(Object)("height"),(Object)("80vh !important")}));
RDebugUtils.currentLine=120520712;
 //BA.debugLineNum = 120520712;BA.debugLine="codeName = $\"${ID}code\"$";
__ref._codename /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"code");
RDebugUtils.currentLine=120520713;
 //BA.debugLineNum = 120520713;BA.debugLine="CodeEL.Initialize(v, codeName).SetTag(\"code\")";
__ref._codeel /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._codename /*String*/ )._settag /*b4j.example.vmelement*/ (null,"code");
RDebugUtils.currentLine=120520714;
 //BA.debugLineNum = 120520714;BA.debugLine="CodeEL.SetText($\"{{ ${codeName} }}\"$)";
__ref._codeel /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(__ref._codename /*String*/ ))+" }}"));
RDebugUtils.currentLine=120520715;
 //BA.debugLineNum = 120520715;BA.debugLine="CodeEL.AddClass(\"col s12\").AddClass(\"special\")";
__ref._codeel /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"col s12")._addclass /*b4j.example.vmelement*/ (null,"special");
RDebugUtils.currentLine=120520716;
 //BA.debugLineNum = 120520716;BA.debugLine="CodeEL.SetAttr(CreateMap(\"data-enlighter-language";
__ref._codeel /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-enlighter-language"),(Object)(_lang)}));
RDebugUtils.currentLine=120520717;
 //BA.debugLineNum = 120520717;BA.debugLine="CodeEL.SetAttr(CreateMap(\"data-enlighter-linenumb";
__ref._codeel /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-enlighter-linenumbers"),(Object)("true")}));
RDebugUtils.currentLine=120520720;
 //BA.debugLineNum = 120520720;BA.debugLine="SetText(\"\")";
__ref._settext /*b4j.example.vmenlighter*/ (null,"");
RDebugUtils.currentLine=120520721;
 //BA.debugLineNum = 120520721;BA.debugLine="codevisible = $\"${ID}visible\"$";
__ref._codevisible /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"visible");
RDebugUtils.currentLine=120520722;
 //BA.debugLineNum = 120520722;BA.debugLine="SetVIf(codevisible)";
__ref._setvif /*b4j.example.vmenlighter*/ (null,__ref._codevisible /*String*/ );
RDebugUtils.currentLine=120520723;
 //BA.debugLineNum = 120520723;BA.debugLine="SetVisible(True)";
__ref._setvisible /*String*/ (null,__c.True);
RDebugUtils.currentLine=120520724;
 //BA.debugLineNum = 120520724;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=120520725;
 //BA.debugLineNum = 120520725;BA.debugLine="options.Put(\"language\", lang)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("language"),(Object)(_lang));
RDebugUtils.currentLine=120520726;
 //BA.debugLineNum = 120520726;BA.debugLine="options.Put(\"indent\", 4)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indent"),(Object)(4));
RDebugUtils.currentLine=120520727;
 //BA.debugLineNum = 120520727;BA.debugLine="options.Put(\"showLinenumbers\", True)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("showLinenumbers"),(Object)(__c.True));
RDebugUtils.currentLine=120520728;
 //BA.debugLineNum = 120520728;BA.debugLine="options.Put(\"renderer\", \"Inline\")";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("renderer"),(Object)("Inline"));
RDebugUtils.currentLine=120520729;
 //BA.debugLineNum = 120520729;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=120520730;
 //BA.debugLineNum = 120520730;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _addclass(b4j.example.vmenlighter __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=121176064;
 //BA.debugLineNum = 121176064;BA.debugLine="Sub AddClass(c As String) As VMEnlighter";
RDebugUtils.currentLine=121176065;
 //BA.debugLineNum = 121176065;BA.debugLine="Enlighter.AddClass(c)";
__ref._enlighter /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=121176066;
 //BA.debugLineNum = 121176066;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=121176067;
 //BA.debugLineNum = 121176067;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmenlighter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
RDebugUtils.currentLine=120455168;
 //BA.debugLineNum = 120455168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=120455169;
 //BA.debugLineNum = 120455169;BA.debugLine="Public Enlighter As VMElement";
_enlighter = new b4j.example.vmelement();
RDebugUtils.currentLine=120455170;
 //BA.debugLineNum = 120455170;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=120455171;
 //BA.debugLineNum = 120455171;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=120455172;
 //BA.debugLineNum = 120455172;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=120455173;
 //BA.debugLineNum = 120455173;BA.debugLine="Private codeName As String";
_codename = "";
RDebugUtils.currentLine=120455174;
 //BA.debugLineNum = 120455174;BA.debugLine="Private codevisible As String";
_codevisible = "";
RDebugUtils.currentLine=120455175;
 //BA.debugLineNum = 120455175;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=120455176;
 //BA.debugLineNum = 120455176;BA.debugLine="Private CodeEL As VMElement";
_codeel = new b4j.example.vmelement();
RDebugUtils.currentLine=120455177;
 //BA.debugLineNum = 120455177;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmenlighter  _settext(b4j.example.vmenlighter __ref,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "settext", new Object[] {_stext}));}
RDebugUtils.currentLine=120848384;
 //BA.debugLineNum = 120848384;BA.debugLine="Sub SetText(sText As String) As VMEnlighter";
RDebugUtils.currentLine=120848385;
 //BA.debugLineNum = 120848385;BA.debugLine="vue.SetStateSingle(codeName, sText)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._codename /*String*/ ,(Object)(_stext));
RDebugUtils.currentLine=120848386;
 //BA.debugLineNum = 120848386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=120848387;
 //BA.debugLineNum = 120848387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setvif(b4j.example.vmenlighter __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=120717312;
 //BA.debugLineNum = 120717312;BA.debugLine="Sub SetVIf(vif As String) As VMEnlighter";
RDebugUtils.currentLine=120717313;
 //BA.debugLineNum = 120717313;BA.debugLine="Enlighter.SetVIf(vif)";
__ref._enlighter /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=120717314;
 //BA.debugLineNum = 120717314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=120717315;
 //BA.debugLineNum = 120717315;BA.debugLine="End Sub";
return null;
}
public String  _setvisible(b4j.example.vmenlighter __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=120651776;
 //BA.debugLineNum = 120651776;BA.debugLine="Sub SetVisible(b As Boolean)";
RDebugUtils.currentLine=120651777;
 //BA.debugLineNum = 120651777;BA.debugLine="vue.SetStateSingle(codevisible, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._codevisible /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=120651778;
 //BA.debugLineNum = 120651778;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmenlighter __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=121110528;
 //BA.debugLineNum = 121110528;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=121110529;
 //BA.debugLineNum = 121110529;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=121110530;
 //BA.debugLineNum = 121110530;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmenlighter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=120979456;
 //BA.debugLineNum = 120979456;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=120979457;
 //BA.debugLineNum = 120979457;BA.debugLine="Enlighter.AddElement(CodeEL)";
__ref._enlighter /*b4j.example.vmelement*/ ._addelement /*String*/ (null,__ref._codeel /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=120979458;
 //BA.debugLineNum = 120979458;BA.debugLine="Return Enlighter.ToString";
if (true) return __ref._enlighter /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=120979459;
 //BA.debugLineNum = 120979459;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.vmenlighter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=120913920;
 //BA.debugLineNum = 120913920;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=120913921;
 //BA.debugLineNum = 120913921;BA.debugLine="Dim bo As BANanoObject = BANano.Window.GetField(\"";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._banano /*com.ab.banano.BANano*/ .Window().GetField("document").RunMethod("id",(Object)(__ref._codename /*String*/ ));
RDebugUtils.currentLine=120913922;
 //BA.debugLineNum = 120913922;BA.debugLine="bo.RunMethod(\"enlight\", options)";
_bo.RunMethod("enlight",(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=120913923;
 //BA.debugLineNum = 120913923;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmenlighter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=121044992;
 //BA.debugLineNum = 121044992;BA.debugLine="Sub Render";
RDebugUtils.currentLine=121044993;
 //BA.debugLineNum = 121044993;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=121044994;
 //BA.debugLineNum = 121044994;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmenlighter  _setattr(b4j.example.vmenlighter __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=121241600;
 //BA.debugLineNum = 121241600;BA.debugLine="Sub SetAttr(attr As Map) As VMEnlighter";
RDebugUtils.currentLine=121241601;
 //BA.debugLineNum = 121241601;BA.debugLine="Enlighter.SetAttr(attr)";
__ref._enlighter /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=121241602;
 //BA.debugLineNum = 121241602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=121241603;
 //BA.debugLineNum = 121241603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setelevation(b4j.example.vmenlighter __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=120586240;
 //BA.debugLineNum = 120586240;BA.debugLine="Sub SetElevation(e As Int) As VMEnlighter";
RDebugUtils.currentLine=120586241;
 //BA.debugLineNum = 120586241;BA.debugLine="Enlighter.SetElevation(e)";
__ref._enlighter /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=120586242;
 //BA.debugLineNum = 120586242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=120586243;
 //BA.debugLineNum = 120586243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setpadding(b4j.example.vmenlighter __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=121372672;
 //BA.debugLineNum = 121372672;BA.debugLine="Sub SetPadding(p As Object) As VMEnlighter";
RDebugUtils.currentLine=121372673;
 //BA.debugLineNum = 121372673;BA.debugLine="Enlighter.SetPaddingAll(p)";
__ref._enlighter /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=121372674;
 //BA.debugLineNum = 121372674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=121372675;
 //BA.debugLineNum = 121372675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setstyle(b4j.example.vmenlighter __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=121307136;
 //BA.debugLineNum = 121307136;BA.debugLine="Sub SetStyle(sm As Map) As VMEnlighter";
RDebugUtils.currentLine=121307137;
 //BA.debugLineNum = 121307137;BA.debugLine="Enlighter.SetStyle(sm)";
__ref._enlighter /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=121307138;
 //BA.debugLineNum = 121307138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=121307139;
 //BA.debugLineNum = 121307139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setvshow(b4j.example.vmenlighter __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmenlighter";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=120782848;
 //BA.debugLineNum = 120782848;BA.debugLine="Sub SetVShow(vif As String) As VMEnlighter";
RDebugUtils.currentLine=120782849;
 //BA.debugLineNum = 120782849;BA.debugLine="Enlighter.SetVShow(vif)";
__ref._enlighter /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=120782850;
 //BA.debugLineNum = 120782850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
RDebugUtils.currentLine=120782851;
 //BA.debugLineNum = 120782851;BA.debugLine="End Sub";
return null;
}
}