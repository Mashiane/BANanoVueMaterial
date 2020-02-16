package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmloader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmloader", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _loader = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
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
public b4j.example.vmloader  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub AddClass(c As String) As VMLoader";
 //BA.debugLineNum = 113;BA.debugLine="Loader.AddClass(c)";
_loader._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 136;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Loader As VMElement";
_loader = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object   'ignore";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmloader  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 13;BA.debugLine="Loader.Initialize(vue, ID).SetTag(\"loading\")";
_loader._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("loading");
 //BA.debugLineNum = 14;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 15;BA.debugLine="SetOnCancel";
_setoncancel();
 //BA.debugLineNum = 16;BA.debugLine="SetFullPage(True)";
_setfullpage(__c.True);
 //BA.debugLineNum = 17;BA.debugLine="SetIsLoading(False)";
_setisloading(__c.False);
 //BA.debugLineNum = 18;BA.debugLine="SetCanCancel(False)";
_setcancancel(__c.False);
 //BA.debugLineNum = 19;BA.debugLine="SetColor(\"blue\")";
_setcolor("blue");
 //BA.debugLineNum = 20;BA.debugLine="SetLoaderBars";
_setloaderbars();
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 132;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub Render";
 //BA.debugLineNum = 128;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmloader  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetAttr(attr As Map) As VMLoader";
 //BA.debugLineNum = 119;BA.debugLine="Loader.SetAttr(attr)";
_loader._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setbackgroundcolor(String _scolor) throws Exception{
String _xcolor = "";
 //BA.debugLineNum = 50;BA.debugLine="Sub SetBackgroundColor(scolor As String) As VMLoad";
 //BA.debugLineNum = 51;BA.debugLine="Dim xcolor As String = $\"${ID}backgroundcolor\"$";
_xcolor = (""+__c.SmartStringFormatter("",(Object)(_id))+"backgroundcolor");
 //BA.debugLineNum = 52;BA.debugLine="vue.SetStateSingle(xcolor, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_xcolor,(Object)(_scolor));
 //BA.debugLineNum = 53;BA.debugLine="Loader.SetAttr1(\":background-color\", xcolor)";
_loader._setattr1 /*b4j.example.vmelement*/ (":background-color",(Object)(_xcolor));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setcancancel(boolean _b) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetCanCancel(b As Boolean) As VMLoader";
 //BA.debugLineNum = 32;BA.debugLine="Loader.setattr1(\":can-cancel\", b)";
_loader._setattr1 /*b4j.example.vmelement*/ (":can-cancel",(Object)(_b));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setcolor(String _scolor) throws Exception{
String _xcolor = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SetColor(scolor As String) As VMLoader";
 //BA.debugLineNum = 44;BA.debugLine="Dim xcolor As String = $\"${ID}color\"$";
_xcolor = (""+__c.SmartStringFormatter("",(Object)(_id))+"color");
 //BA.debugLineNum = 45;BA.debugLine="vue.SetStateSingle(xcolor, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_xcolor,(Object)(_scolor));
 //BA.debugLineNum = 46;BA.debugLine="Loader.SetAttr1(\":color\", xcolor)";
_loader._setattr1 /*b4j.example.vmelement*/ (":color",(Object)(_xcolor));
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setfullpage(boolean _b) throws Exception{
String _fpage = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetFullPage(b As Boolean) As VMLoader";
 //BA.debugLineNum = 37;BA.debugLine="Dim fPage As String = $\"${ID}fullpage\"$";
_fpage = (""+__c.SmartStringFormatter("",(Object)(_id))+"fullpage");
 //BA.debugLineNum = 38;BA.debugLine="vue.SetStateSingle(fPage, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_fpage,(Object)(_b));
 //BA.debugLineNum = 39;BA.debugLine="Loader.SetAttr1(\":is-full-page\", fPage)";
_loader._setattr1 /*b4j.example.vmelement*/ (":is-full-page",(Object)(_fpage));
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setisloading(boolean _b) throws Exception{
String _isloading = "";
 //BA.debugLineNum = 24;BA.debugLine="Sub SetIsLoading(b As Boolean) As VMLoader";
 //BA.debugLineNum = 25;BA.debugLine="Dim isloading As String = $\"${ID}loading\"$";
_isloading = (""+__c.SmartStringFormatter("",(Object)(_id))+"loading");
 //BA.debugLineNum = 26;BA.debugLine="vue.SetStateSingle(isloading, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_isloading,(Object)(_b));
 //BA.debugLineNum = 27;BA.debugLine="Loader.SetAttr1(\":active.sync\", isloading)";
_loader._setattr1 /*b4j.example.vmelement*/ (":active.sync",(Object)(_isloading));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setloader(String _sloader) throws Exception{
String _xloader = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub SetLoader(sloader As String) As VMLoader";
 //BA.debugLineNum = 65;BA.debugLine="Dim xloader As String = $\"${ID}loader\"$";
_xloader = (""+__c.SmartStringFormatter("",(Object)(_id))+"loader");
 //BA.debugLineNum = 66;BA.debugLine="vue.SetStateSingle(xloader, sloader)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_xloader,(Object)(_sloader));
 //BA.debugLineNum = 67;BA.debugLine="Loader.SetAttr1(\":loader\", xloader)";
_loader._setattr1 /*b4j.example.vmelement*/ (":loader",(Object)(_xloader));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setloaderbars() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetLoaderBars As VMLoader";
 //BA.debugLineNum = 82;BA.debugLine="SetLoader(\"bars\")";
_setloader("bars");
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setloaderdots() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetLoaderDots As VMLoader";
 //BA.debugLineNum = 77;BA.debugLine="SetLoader(\"dots\")";
_setloader("dots");
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setloaderspinner() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetLoaderSpinner As VMLoader";
 //BA.debugLineNum = 72;BA.debugLine="SetLoader(\"spinner\")";
_setloader("spinner");
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setmargin(String _p) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetMargin(p As String) As VMLoader";
 //BA.debugLineNum = 102;BA.debugLine="Loader.SetStyle(CreateMap(\"margin\":p))";
_loader._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("margin"),(Object)(_p)}));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setoncancel() throws Exception{
com.ab.banano.BANanoEvent _e = null;
String _oncancel = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub SetOnCancel As VMLoader";
 //BA.debugLineNum = 88;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 89;BA.debugLine="Dim onCancel As String = $\"${ID}_oncancel\"$";
_oncancel = (""+__c.SmartStringFormatter("",(Object)(_id))+"_oncancel");
 //BA.debugLineNum = 90;BA.debugLine="If SubExists(module, onCancel) = False Then Retur";
if (__c.SubExists(ba,_module,_oncancel)==__c.False) { 
if (true) return (b4j.example.vmloader)(this);};
 //BA.debugLineNum = 91;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_oncancel,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 92;BA.debugLine="vue.SetCallBack(onCancel, cb)";
_vue._setcallback /*String*/ (_oncancel,_cb);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setopacity(double _opac) throws Exception{
String _xcolor = "";
 //BA.debugLineNum = 57;BA.debugLine="Sub SetOpacity(opac As Double) As VMLoader";
 //BA.debugLineNum = 58;BA.debugLine="Dim xcolor As String = $\"${ID}opacity\"$";
_xcolor = (""+__c.SmartStringFormatter("",(Object)(_id))+"opacity");
 //BA.debugLineNum = 59;BA.debugLine="vue.SetStateSingle(xcolor, opac)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_xcolor,(Object)(_opac));
 //BA.debugLineNum = 60;BA.debugLine="Loader.SetAttr1(\":opacity\", xcolor)";
_loader._setattr1 /*b4j.example.vmelement*/ (":opacity",(Object)(_xcolor));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setpadding(String _p) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetPadding(p As String) As VMLoader";
 //BA.debugLineNum = 107;BA.debugLine="Loader.SetStyle(CreateMap(\"padding\":p))";
_loader._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("padding"),(Object)(_p)}));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetStyle(m As Map) As VMLoader";
 //BA.debugLineNum = 97;BA.debugLine="Loader.SetStyle(m)";
_loader._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmloader)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 124;BA.debugLine="Return Loader.tostring";
if (true) return _loader._tostring /*String*/ ();
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
