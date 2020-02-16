package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmalert extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmalert", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _alert = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _bactive = false;
public Object _module = null;
public boolean _bstatic = false;
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
public b4j.example.vmalert  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub AddClass(c As String) As VMAlert";
 //BA.debugLineNum = 44;BA.debugLine="Alert.AddClass(c)";
_alert._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Alert As VMElement";
_alert = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
_bactive = false;
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object  'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 30;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 31;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 32;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(_id),(Object)(__c.False));
 //BA.debugLineNum = 33;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="Alert.Initialize(vue, ID).SetTag(\"md-dialog-alert";
_alert._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-dialog-alert");
 //BA.debugLineNum = 16;BA.debugLine="bActive = False";
_bactive = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 18;BA.debugLine="SetActiveSync(ID)";
_setactivesync((Object)(_id));
 };
 //BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 103;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub Render";
 //BA.debugLineNum = 99;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _setactivesync(Object _a) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="private Sub SetActiveSync(a As Object) As VMAlert";
 //BA.debugLineNum = 55;BA.debugLine="Alert.SetActiveSync(a)";
_alert._setactivesync /*b4j.example.vmelement*/ (BA.ObjectToString(_a));
 //BA.debugLineNum = 56;BA.debugLine="bActive = True";
_bactive = __c.True;
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetAttr(attr As Map) As VMAlert";
 //BA.debugLineNum = 50;BA.debugLine="Alert.SetAttr(attr)";
_alert._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setconfirmtext(String _t) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetConfirmText(t As String) As VMAlert";
 //BA.debugLineNum = 71;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 72;BA.debugLine="Alert.SetAttr(CreateMap(\"md-confirm-text\":t))";
_alert._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-confirm-text"),(Object)(_t)}));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 75;BA.debugLine="vue.SetState(CreateMap(\"confirmtext\":t))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("confirmtext"),(Object)(_t)}));
 //BA.debugLineNum = 76;BA.debugLine="Alert.SetAttr(CreateMap(\":md-confirm-text\":\"confi";
_alert._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-confirm-text"),(Object)("confirmtext")}));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setcontent(String _c) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetContent(c As String) As VMAlert";
 //BA.debugLineNum = 61;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 62;BA.debugLine="Alert.SetAttr(CreateMap(\"md-content\": c))";
_alert._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-content"),(Object)(_c)}));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 65;BA.debugLine="vue.SetState(CreateMap(\"alertmessage\":c))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("alertmessage"),(Object)(_c)}));
 //BA.debugLineNum = 66;BA.debugLine="Alert.SetAttr(CreateMap(\":md-content\": \"alertmess";
_alert._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-content"),(Object)("alertmessage")}));
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetStatic(b As Boolean) As VMAlert";
 //BA.debugLineNum = 26;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _settitle(String _t) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetTitle(t As String) As VMAlert";
 //BA.debugLineNum = 81;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 82;BA.debugLine="Alert.SetAttr(CreateMap(\"md-title\":t))";
_alert._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-title"),(Object)(_t)}));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 };
 //BA.debugLineNum = 85;BA.debugLine="vue.SetState(CreateMap(\"alerttitle\":t))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("alerttitle"),(Object)(_t)}));
 //BA.debugLineNum = 86;BA.debugLine="Alert.SetAttr(CreateMap(\":md-title\":\"alerttitle\")";
_alert._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-title"),(Object)("alerttitle")}));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmalert)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 36;BA.debugLine="Sub Show";
 //BA.debugLineNum = 37;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 38;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(_id),(Object)(__c.True));
 //BA.debugLineNum = 39;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 92;BA.debugLine="If bActive = False Then";
if (_bactive==__c.False) { 
 //BA.debugLineNum = 93;BA.debugLine="Log($\"VMAlert.SetActiveSync: '${ID}' has not bee";
__c.Log(("VMAlert.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(_id))+"' has not been activated!"));
 };
 //BA.debugLineNum = 95;BA.debugLine="Return Alert.tostring";
if (true) return _alert._tostring /*String*/ ();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
