package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmenlighter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmenlighter", this);
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
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public b4j.example.vmenlighter  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub AddClass(c As String) As VMEnlighter";
 //BA.debugLineNum = 90;BA.debugLine="Enlighter.AddClass(c)";
_enlighter._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Enlighter As VMElement";
_enlighter = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private codeName As String";
_codename = "";
 //BA.debugLineNum = 8;BA.debugLine="Private codevisible As String";
_codevisible = "";
 //BA.debugLineNum = 9;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private CodeEL As VMElement";
_codeel = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmenlighter  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _lang) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="Enlighter.Initialize(v, ID).SetTag(\"pre\")";
_enlighter._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("pre");
 //BA.debugLineNum = 17;BA.debugLine="Enlighter.SetAttr(CreateMap(\"data-enlighter-langu";
_enlighter._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-enlighter-language"),(Object)(_lang)}));
 //BA.debugLineNum = 18;BA.debugLine="Enlighter.SetAttr(CreateMap(\"data-enlighter-linen";
_enlighter._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-enlighter-linenumbers"),(Object)("true")}));
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="Enlighter.SetStyle(CreateMap(\"width\":\"100% !impor";
_enlighter._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("width"),(Object)("100% !important"),(Object)("height"),(Object)("80vh !important")}));
 //BA.debugLineNum = 22;BA.debugLine="codeName = $\"${ID}code\"$";
_codename = (""+__c.SmartStringFormatter("",(Object)(_id))+"code");
 //BA.debugLineNum = 23;BA.debugLine="CodeEL.Initialize(v, codeName).SetTag(\"code\")";
_codeel._initialize /*b4j.example.vmelement*/ (ba,_v,_codename)._settag /*b4j.example.vmelement*/ ("code");
 //BA.debugLineNum = 24;BA.debugLine="CodeEL.SetText($\"{{ ${codeName} }}\"$)";
_codeel._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_codename))+" }}"));
 //BA.debugLineNum = 25;BA.debugLine="CodeEL.AddClass(\"col s12\").AddClass(\"special\")";
_codeel._addclass /*b4j.example.vmelement*/ ("col s12")._addclass /*b4j.example.vmelement*/ ("special");
 //BA.debugLineNum = 26;BA.debugLine="CodeEL.SetAttr(CreateMap(\"data-enlighter-language";
_codeel._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-enlighter-language"),(Object)(_lang)}));
 //BA.debugLineNum = 27;BA.debugLine="CodeEL.SetAttr(CreateMap(\"data-enlighter-linenumb";
_codeel._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-enlighter-linenumbers"),(Object)("true")}));
 //BA.debugLineNum = 30;BA.debugLine="SetText(\"\")";
_settext("");
 //BA.debugLineNum = 31;BA.debugLine="codevisible = $\"${ID}visible\"$";
_codevisible = (""+__c.SmartStringFormatter("",(Object)(_id))+"visible");
 //BA.debugLineNum = 32;BA.debugLine="SetVIf(codevisible)";
_setvif(_codevisible);
 //BA.debugLineNum = 33;BA.debugLine="SetVisible(True)";
_setvisible(__c.True);
 //BA.debugLineNum = 34;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="options.Put(\"language\", lang)";
_options.Put((Object)("language"),(Object)(_lang));
 //BA.debugLineNum = 36;BA.debugLine="options.Put(\"indent\", 4)";
_options.Put((Object)("indent"),(Object)(4));
 //BA.debugLineNum = 37;BA.debugLine="options.Put(\"showLinenumbers\", True)";
_options.Put((Object)("showLinenumbers"),(Object)(__c.True));
 //BA.debugLineNum = 38;BA.debugLine="options.Put(\"renderer\", \"Inline\")";
_options.Put((Object)("renderer"),(Object)("Inline"));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 85;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 67;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 68;BA.debugLine="Dim bo As BANanoObject = BANano.Window.GetField(\"";
_bo = new com.ab.banano.BANanoObject();
_bo = _banano.Window().GetField("document").RunMethod("id",(Object)(_codename));
 //BA.debugLineNum = 69;BA.debugLine="bo.RunMethod(\"enlight\", options)";
_bo.RunMethod("enlight",(Object)(_options.getObject()));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Render";
 //BA.debugLineNum = 80;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmenlighter  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetAttr(attr As Map) As VMEnlighter";
 //BA.debugLineNum = 96;BA.debugLine="Enlighter.SetAttr(attr)";
_enlighter._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetElevation(e As Int) As VMEnlighter";
 //BA.debugLineNum = 43;BA.debugLine="Enlighter.SetElevation(e)";
_enlighter._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetPadding(p As Object) As VMEnlighter";
 //BA.debugLineNum = 108;BA.debugLine="Enlighter.SetPaddingAll(p)";
_enlighter._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetStyle(sm As Map) As VMEnlighter";
 //BA.debugLineNum = 102;BA.debugLine="Enlighter.SetStyle(sm)";
_enlighter._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _settext(String _stext) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetText(sText As String) As VMEnlighter";
 //BA.debugLineNum = 63;BA.debugLine="vue.SetStateSingle(codeName, sText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_codename,(Object)(_stext));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetVIf(vif As String) As VMEnlighter";
 //BA.debugLineNum = 52;BA.debugLine="Enlighter.SetVIf(vif)";
_enlighter._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public String  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetVisible(b As Boolean)";
 //BA.debugLineNum = 48;BA.debugLine="vue.SetStateSingle(codevisible, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_codevisible,(Object)(_b));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmenlighter  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetVShow(vif As String) As VMEnlighter";
 //BA.debugLineNum = 57;BA.debugLine="Enlighter.SetVShow(vif)";
_enlighter._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmenlighter)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 74;BA.debugLine="Enlighter.AddElement(CodeEL)";
_enlighter._addelement /*String*/ (_codeel);
 //BA.debugLineNum = 75;BA.debugLine="Return Enlighter.ToString";
if (true) return _enlighter._tostring /*String*/ ();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
