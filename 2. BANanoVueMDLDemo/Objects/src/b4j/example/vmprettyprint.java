package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprettyprint extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmprettyprint", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprettyprint.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _pp = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _codename = "";
public String _codevisible = "";
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
public b4j.example.vmprettyprint  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub AddClass(c As String) As VMPrettyPrint";
 //BA.debugLineNum = 81;BA.debugLine="PP.AddClass(c)";
_pp._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public PP As VMElement";
_pp = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private CodeEL As VMElement";
_codeel = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprettyprint  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _lang) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="PP.Initialize(v, ID).SetTag(\"pre\").AddClass(\"pret";
_pp._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("pre")._addclass /*b4j.example.vmelement*/ ("prettyprint")._addclass /*b4j.example.vmelement*/ ("linenums");
 //BA.debugLineNum = 16;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 17;BA.debugLine="PP.SetStyle(CreateMap(\"width\":\"100% !important\",";
_pp._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("width"),(Object)("100% !important"),(Object)("height"),(Object)("80vh !important")}));
 //BA.debugLineNum = 19;BA.debugLine="codeName = $\"${ID}code\"$";
_codename = (""+__c.SmartStringFormatter("",(Object)(_id))+"code");
 //BA.debugLineNum = 20;BA.debugLine="CodeEL.Initialize(v, codeName).SetTag(\"code\")";
_codeel._initialize /*b4j.example.vmelement*/ (ba,_v,_codename)._settag /*b4j.example.vmelement*/ ("code");
 //BA.debugLineNum = 21;BA.debugLine="CodeEL.SetText($\"{{ ${codeName} }}\"$)";
_codeel._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_codename))+" }}"));
 //BA.debugLineNum = 22;BA.debugLine="CodeEL.AddClass(\"col s12\").AddClass(\"prettyprint\"";
_codeel._addclass /*b4j.example.vmelement*/ ("col s12")._addclass /*b4j.example.vmelement*/ ("prettyprint");
 //BA.debugLineNum = 23;BA.debugLine="CodeEL.AddClass($\"language-${lang}\"$)";
_codeel._addclass /*b4j.example.vmelement*/ (("language-"+__c.SmartStringFormatter("",(Object)(_lang))+""));
 //BA.debugLineNum = 25;BA.debugLine="codevisible = $\"${ID}visible\"$";
_codevisible = (""+__c.SmartStringFormatter("",(Object)(_id))+"visible");
 //BA.debugLineNum = 26;BA.debugLine="SetVIf(codevisible)";
_setvif(_codevisible);
 //BA.debugLineNum = 27;BA.debugLine="SetVisible(True)";
_setvisible(__c.True);
 //BA.debugLineNum = 28;BA.debugLine="SetText(\"\")";
_settext("");
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 76;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
com.ab.banano.BANanoObject _pr = null;
 //BA.debugLineNum = 57;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 58;BA.debugLine="Dim PR As BANanoObject";
_pr = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 59;BA.debugLine="PR.Initialize(\"PR\")";
_pr.Initialize((Object)("PR"));
 //BA.debugLineNum = 60;BA.debugLine="PR.RunMethod(\"prettyPrint\", Null)";
_pr.RunMethod("prettyPrint",__c.Null);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Render";
 //BA.debugLineNum = 71;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprettyprint  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetAttr(attr As Map) As VMPrettyPrint";
 //BA.debugLineNum = 87;BA.debugLine="PP.SetAttr(attr)";
_pp._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetElevation(e As Int) As VMPrettyPrint";
 //BA.debugLineNum = 33;BA.debugLine="PP.SetElevation(e)";
_pp._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetPadding(p As Object) As VMPrettyPrint";
 //BA.debugLineNum = 99;BA.debugLine="PP.SetPaddingAll(p)";
_pp._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetStyle(sm As Map) As VMPrettyPrint";
 //BA.debugLineNum = 93;BA.debugLine="PP.SetStyle(sm)";
_pp._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _settext(String _stext) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetText(sText As String) As VMPrettyPrint";
 //BA.debugLineNum = 53;BA.debugLine="vue.SetStateSingle(codeName, sText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_codename,(Object)(_stext));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetVIf(vif As String) As VMPrettyPrint";
 //BA.debugLineNum = 42;BA.debugLine="PP.SetVIf(vif)";
_pp._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public String  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetVisible(b As Boolean)";
 //BA.debugLineNum = 38;BA.debugLine="vue.SetStateSingle(codevisible, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_codevisible,(Object)(_b));
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprettyprint  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetVShow(vif As String) As VMPrettyPrint";
 //BA.debugLineNum = 47;BA.debugLine="PP.SetVShow(vif)";
_pp._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 65;BA.debugLine="PP.AddElement(CodeEL)";
_pp._addelement /*String*/ (_codeel);
 //BA.debugLineNum = 66;BA.debugLine="Return PP.ToString";
if (true) return _pp._tostring /*String*/ ();
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
