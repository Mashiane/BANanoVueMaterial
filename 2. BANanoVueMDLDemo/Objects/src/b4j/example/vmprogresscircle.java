package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprogresscircle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmprogresscircle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprogresscircle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _progresscircle = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
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
public b4j.example.vmprogresscircle  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub AddClass(c As String) As VMProgressCircle";
 //BA.debugLineNum = 70;BA.debugLine="ProgressCircle.AddClass(c)";
_progresscircle._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ProgressCircle As VMElement";
_progresscircle = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircle  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _width,String _height) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="BANano.DependsOnAsset(\"progresscircle.css\")";
_banano.DependsOnAsset("progresscircle.css");
 //BA.debugLineNum = 12;BA.debugLine="BANano.DependsOnAsset(\"progresscircle.js\")";
_banano.DependsOnAsset("progresscircle.js");
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="JQ = vue.jquery";
_jq = _vue._jquery /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 17;BA.debugLine="ProgressCircle.Initialize(vue, ID).SetTag(\"div\")";
_progresscircle._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 18;BA.debugLine="ProgressCircle.AddClass(ID)";
_progresscircle._addclass /*b4j.example.vmelement*/ (_id);
 //BA.debugLineNum = 19;BA.debugLine="Width = ProgressCircle.MakePx(Width)";
_width = _progresscircle._makepx /*String*/ (_width);
 //BA.debugLineNum = 20;BA.debugLine="Height = ProgressCircle.MakePx(Height)";
_height = _progresscircle._makepx /*String*/ (_height);
 //BA.debugLineNum = 21;BA.debugLine="ProgressCircle.SetWidth(Width).SetHeight(Height)";
_progresscircle._setwidth /*b4j.example.vmelement*/ (_width)._setheight /*b4j.example.vmelement*/ (_height);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _px) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub Pop(px As VMElement)";
 //BA.debugLineNum = 90;BA.debugLine="px.SetText(ToString)";
_px._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
com.ab.banano.BANanoObject _loadingele = null;
 //BA.debugLineNum = 104;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 106;BA.debugLine="Dim loadingEle As BANanoObject = JQ.Selector($\"#$";
_loadingele = new com.ab.banano.BANanoObject();
_loadingele = _jq.Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(_id))+"")));
 //BA.debugLineNum = 107;BA.debugLine="loadingEle.RunMethod(\"circlechart\", Null)";
_loadingele.RunMethod("circlechart",__c.Null);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub Render";
 //BA.debugLineNum = 86;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircle  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetAttr(attr As Map) As VMProgressCircle";
 //BA.debugLineNum = 76;BA.debugLine="ProgressCircle.SetAttr(attr)";
_progresscircle._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetDisabled(b As Boolean) As VMProgressCircle";
 //BA.debugLineNum = 27;BA.debugLine="ProgressCircle.SetDisabled(b)";
_progresscircle._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setid(String _iid,boolean _bind) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMPro";
 //BA.debugLineNum = 49;BA.debugLine="ProgressCircle.SetID(iID,bind)";
_progresscircle._setid /*b4j.example.vmelement*/ (_iid,_bind);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMProg";
 //BA.debugLineNum = 59;BA.debugLine="ProgressCircle.SetKey(k, bind)";
_progresscircle._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetLabel(lbl As String) As VMProgressCircle";
 //BA.debugLineNum = 99;BA.debugLine="ProgressCircle.SetText(lbl)";
_progresscircle._settext /*b4j.example.vmelement*/ (_lbl);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setname(String _nam,boolean _bind) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMP";
 //BA.debugLineNum = 54;BA.debugLine="ProgressCircle.SetName(nam, bind)";
_progresscircle._setname /*b4j.example.vmelement*/ (_nam,_bind);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStyle(sm As Map) As VMProgressCircle";
 //BA.debugLineNum = 39;BA.debugLine="ProgressCircle.SetStyle(sm)";
_progresscircle._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetTabIndex(ti As String) As VMProgressCircle";
 //BA.debugLineNum = 32;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmprogresscircle)(this);};
 //BA.debugLineNum = 33;BA.debugLine="ProgressCircle.SetTabIndex(ti)";
_progresscircle._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setvalue(int _vl) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetValue(vl As Int) As VMProgressCircle";
 //BA.debugLineNum = 94;BA.debugLine="ProgressCircle.SetAttr(CreateMap(\"data-percentage";
_progresscircle._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-percentage"),(Object)(_vl)}));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetVIf(vif As String) As VMProgressCircle";
 //BA.debugLineNum = 44;BA.debugLine="ProgressCircle.SetVIf(vif)";
_progresscircle._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetVShow(vif As String) As VMProgressCircle";
 //BA.debugLineNum = 64;BA.debugLine="ProgressCircle.SetVShow(vif)";
_progresscircle._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 82;BA.debugLine="Return ProgressCircle.tostring";
if (true) return _progresscircle._tostring /*String*/ ();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
