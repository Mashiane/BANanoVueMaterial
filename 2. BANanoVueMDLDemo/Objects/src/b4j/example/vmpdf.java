package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmpdf extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmpdf", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmpdf.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _pdf = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public String _dockey = "";
public String _docvisible = "";
public anywheresoftware.b4a.objects.collections.Map _options = null;
public com.ab.banano.BANano _banano = null;
public com.ab.banano.BANanoObject _jq = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public PDF As VMElement";
_pdf = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private docKey As String";
_dockey = "";
 //BA.debugLineNum = 7;BA.debugLine="Private docVisible As String";
_docvisible = "";
 //BA.debugLineNum = 8;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 10;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _url) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="JQ = vue.jquery";
_jq = _vue._jquery /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 19;BA.debugLine="PDF.Initialize(vue, sid)";
_pdf._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid);
 //BA.debugLineNum = 20;BA.debugLine="PDF.SetTag(\"iframe\")";
_pdf._settag /*b4j.example.vmelement*/ ("iframe");
 //BA.debugLineNum = 21;BA.debugLine="PDF.SetAttr(CreateMap(\"type\":\"application/pdf\"))";
_pdf._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("type"),(Object)("application/pdf")}));
 //BA.debugLineNum = 22;BA.debugLine="PDF.SetAttr(CreateMap(\"frameborder\":\"0\"))";
_pdf._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("frameborder"),(Object)("0")}));
 //BA.debugLineNum = 23;BA.debugLine="PDF.SetAttr(CreateMap(\"scrolling\":\"no\"))";
_pdf._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("scrolling"),(Object)("no")}));
 //BA.debugLineNum = 24;BA.debugLine="PDF.SetAttr(CreateMap(\"allowfullscreen\":True))";
_pdf._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("allowfullscreen"),(Object)(__c.True)}));
 //BA.debugLineNum = 25;BA.debugLine="SetURL(URL)";
_seturl(_url);
 //BA.debugLineNum = 26;BA.debugLine="docVisible = $\"${ID}visible\"$";
_docvisible = (""+__c.SmartStringFormatter("",(Object)(_id))+"visible");
 //BA.debugLineNum = 27;BA.debugLine="SetVIf(docVisible)";
_setvif((Object)(_docvisible));
 //BA.debugLineNum = 28;BA.debugLine="SetVisible(True)";
_setvisible(__c.True);
 //BA.debugLineNum = 29;BA.debugLine="SetWidth(\"100%\")";
_setwidth("100%");
 //BA.debugLineNum = 30;BA.debugLine="SetHeight(\"80vh\")";
_setheight("80vh");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 88;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub Render";
 //BA.debugLineNum = 84;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpdf  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetElevation(e As Int) As VMPDF";
 //BA.debugLineNum = 48;BA.debugLine="PDF.SetElevation(e)";
_pdf._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpdf  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetHeight(h As String) As VMPDF";
 //BA.debugLineNum = 42;BA.debugLine="PDF.SetStyle(CreateMap(\"height\":h & \" !important\"";
_pdf._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("height"),(Object)(_h+" !important")}));
 //BA.debugLineNum = 43;BA.debugLine="options.Put(\"height\", h)";
_options.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _seturl(String _url) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetURL(url As String)";
 //BA.debugLineNum = 67;BA.debugLine="docKey = $\"${ID}doc\"$";
_dockey = (""+__c.SmartStringFormatter("",(Object)(_id))+"doc");
 //BA.debugLineNum = 68;BA.debugLine="vue.SetStateSingle(docKey, url)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_dockey,(Object)(_url));
 //BA.debugLineNum = 69;BA.debugLine="PDF.SetAttr(CreateMap(\":src\":docKey))";
_pdf._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":src"),(Object)(_dockey)}));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _seturl1(String _url) throws Exception{
String _ikey = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub SetURL1(url As String)";
 //BA.debugLineNum = 74;BA.debugLine="Dim iKey As String = $\"#${ID}\"$";
_ikey = ("#"+__c.SmartStringFormatter("",(Object)(_id))+"");
 //BA.debugLineNum = 75;BA.debugLine="BANano.GetElement(iKey).SetAttr(\"href\", url).AddC";
_banano.GetElement(_ikey).SetAttr("href",_url).AddClass("media");
 //BA.debugLineNum = 76;BA.debugLine="JQ.Selector(iKey).RunMethod(\"media\", options)";
_jq.Selector((Object)(_ikey)).RunMethod("media",(Object)(_options.getObject()));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpdf  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetVIf(vif As Object) As VMPDF";
 //BA.debugLineNum = 57;BA.debugLine="PDF.SetVIf(vif)";
_pdf._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetVisible(b As Boolean)";
 //BA.debugLineNum = 53;BA.debugLine="vue.SetStateSingle(docVisible, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_docvisible,(Object)(_b));
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpdf  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetVShow(vif As Object) As VMPDF";
 //BA.debugLineNum = 62;BA.debugLine="PDF.SetVShow(vif)";
_pdf._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpdf  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetWidth(w As String) As VMPDF";
 //BA.debugLineNum = 35;BA.debugLine="PDF.SetStyle(CreateMap(\"width\":w & \" !important\")";
_pdf._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("width"),(Object)(_w+" !important")}));
 //BA.debugLineNum = 36;BA.debugLine="options.Put(\"width\", w)";
_options.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 80;BA.debugLine="Return PDF.tostring";
if (true) return _pdf._tostring /*String*/ ();
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
