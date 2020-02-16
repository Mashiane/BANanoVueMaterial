package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmconfirm extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmconfirm", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _confirm = null;
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
public b4j.example.vmconfirm  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub AddClass(c As String) As VMConfirm";
 //BA.debugLineNum = 46;BA.debugLine="Confirm.AddClass(c)";
_confirm._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Confirm As VMElement";
_confirm = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
_bactive = false;
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bstatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 32;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 33;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 34;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(_id),(Object)(__c.False));
 //BA.debugLineNum = 35;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmconfirm  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="Confirm.Initialize(vue, ID).SetTag(\"md-dialog-con";
_confirm._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-dialog-confirm");
 //BA.debugLineNum = 16;BA.debugLine="bActive = False";
_bactive = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 18;BA.debugLine="SetActiveSync(ID)";
_setactivesync((Object)(_id));
 };
 //BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="Confirm.SetOnConfirm(module, $\"${ID}_ok\"$)";
_confirm._setonconfirm /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_ok"));
 //BA.debugLineNum = 22;BA.debugLine="Confirm.SetOnCancel(module, $\"${ID}_cancel\"$)";
_confirm._setoncancel /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_cancel"));
 //BA.debugLineNum = 23;BA.debugLine="bstatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 115;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Render";
 //BA.debugLineNum = 111;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmconfirm  _setactivesync(Object _a) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="private Sub SetActiveSync(a As Object) As VMConfir";
 //BA.debugLineNum = 67;BA.debugLine="Confirm.SetActiveSync(a)";
_confirm._setactivesync /*b4j.example.vmelement*/ (BA.ObjectToString(_a));
 //BA.debugLineNum = 68;BA.debugLine="bActive = True";
_bactive = __c.True;
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetAttr(attr As Map) As VMConfirm";
 //BA.debugLineNum = 52;BA.debugLine="Confirm.SetAttr(attr)";
_confirm._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _setcanceltext(String _c) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetCancelText(c As String) As VMConfirm";
 //BA.debugLineNum = 57;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 58;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-cancel-text\": c))";
_confirm._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-cancel-text"),(Object)(_c)}));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 };
 //BA.debugLineNum = 61;BA.debugLine="vue.SetState(CreateMap(\"canceltext\":c))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("canceltext"),(Object)(_c)}));
 //BA.debugLineNum = 62;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-cancel-text\": \"can";
_confirm._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-cancel-text"),(Object)("canceltext")}));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _setconfirmtext(String _t) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetConfirmText(t As String) As VMConfirm";
 //BA.debugLineNum = 83;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 84;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-confirm-text\":t))";
_confirm._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-confirm-text"),(Object)(_t)}));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 };
 //BA.debugLineNum = 87;BA.debugLine="vue.SetState(CreateMap(\"confirmtext\":t))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("confirmtext"),(Object)(_t)}));
 //BA.debugLineNum = 88;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-confirm-text\":\"con";
_confirm._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-confirm-text"),(Object)("confirmtext")}));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _setcontent(String _c) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetContent(c As String) As VMConfirm";
 //BA.debugLineNum = 73;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 74;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-content\": c))";
_confirm._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-content"),(Object)(_c)}));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 };
 //BA.debugLineNum = 77;BA.debugLine="vue.SetState(CreateMap(\"confirmmessage\":c))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("confirmmessage"),(Object)(_c)}));
 //BA.debugLineNum = 78;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-content\": \"confirm";
_confirm._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-content"),(Object)("confirmmessage")}));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetStatic(b As Boolean) As VMConfirm";
 //BA.debugLineNum = 28;BA.debugLine="bstatic = b";
_bstatic = _b;
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _settitle(String _t) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetTitle(t As String) As VMConfirm";
 //BA.debugLineNum = 93;BA.debugLine="If bstatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 94;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-title\":t))";
_confirm._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-title"),(Object)(_t)}));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 };
 //BA.debugLineNum = 97;BA.debugLine="vue.SetState(CreateMap(\"confirmtitle\":t))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("confirmtitle"),(Object)(_t)}));
 //BA.debugLineNum = 98;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-title\":\"confirmtit";
_confirm._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-title"),(Object)("confirmtitle")}));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmconfirm)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 38;BA.debugLine="Sub Show";
 //BA.debugLineNum = 39;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 40;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(_id),(Object)(__c.True));
 //BA.debugLineNum = 41;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 104;BA.debugLine="If bActive = False Then";
if (_bactive==__c.False) { 
 //BA.debugLineNum = 105;BA.debugLine="Log($\"VMConfirm.SetActiveSync: '${ID}' has not b";
__c.Log(("VMConfirm.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(_id))+"' has not been activated!"));
 };
 //BA.debugLineNum = 107;BA.debugLine="Return Confirm.tostring";
if (true) return _confirm._tostring /*String*/ ();
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
