package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprompt extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmprompt", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _prompt = null;
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
public b4j.example.vmprompt  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub AddClass(c As String) As VMPrompt";
 //BA.debugLineNum = 50;BA.debugLine="Prompt.AddClass(c)";
_prompt._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Prompt As VMElement";
_prompt = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 31;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 32;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 33;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(_id),(Object)(__c.False));
 //BA.debugLineNum = 34;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprompt  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="Prompt.Initialize(vue, ID).SetTag(\"md-dialog-prom";
_prompt._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-dialog-prompt");
 //BA.debugLineNum = 16;BA.debugLine="bActive = False";
_bactive = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 18;BA.debugLine="SetActiveSync(ID)";
_setactivesync((Object)(_id));
 };
 //BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="Prompt.SetOnConfirm(module, $\"${ID}_ok\"$)";
_prompt._setonconfirm /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_ok"));
 //BA.debugLineNum = 22;BA.debugLine="Prompt.SetOnCancel(module, $\"${ID}_cancel\"$)";
_prompt._setoncancel /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_cancel"));
 //BA.debugLineNum = 23;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="SetVModel(\"promptvalue\")";
_setvmodel("promptvalue");
 //BA.debugLineNum = 25;BA.debugLine="vue.SetStateSingle(\"promptvalue\",Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("promptvalue",__c.Null);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 154;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub Render";
 //BA.debugLineNum = 150;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprompt  _setactivesync(Object _a) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="private Sub SetActiveSync(a As Object) As VMPrompt";
 //BA.debugLineNum = 109;BA.debugLine="Prompt.SetActiveSync(a)";
_prompt._setactivesync /*b4j.example.vmelement*/ (BA.ObjectToString(_a));
 //BA.debugLineNum = 110;BA.debugLine="bActive = True";
_bactive = __c.True;
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetAttr(attr As Map) As VMPrompt";
 //BA.debugLineNum = 56;BA.debugLine="Prompt.SetAttr(attr)";
_prompt._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setcanceltext(String _c) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetCancelText(c As String) As VMPrompt";
 //BA.debugLineNum = 99;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 100;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-cancel-text\": c))";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-cancel-text"),(Object)(_c)}));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
 //BA.debugLineNum = 103;BA.debugLine="vue.SetState(CreateMap(\"promptcanceltext\":c))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("promptcanceltext"),(Object)(_c)}));
 //BA.debugLineNum = 104;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-cancel-text\": \"prom";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-cancel-text"),(Object)("promptcanceltext")}));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setconfirmtext(String _t) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetConfirmText(t As String) As VMPrompt";
 //BA.debugLineNum = 125;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 126;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-confirm-text\":t))";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-confirm-text"),(Object)(_t)}));
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
 //BA.debugLineNum = 129;BA.debugLine="vue.SetState(CreateMap(\"promptconfirmtext\":t))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("promptconfirmtext"),(Object)(_t)}));
 //BA.debugLineNum = 130;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-confirm-text\":\"prom";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-confirm-text"),(Object)("promptconfirmtext")}));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setcontent(String _c) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetContent(c As String) As VMPrompt";
 //BA.debugLineNum = 115;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 116;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-content\": c))";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-content"),(Object)(_c)}));
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
 //BA.debugLineNum = 119;BA.debugLine="vue.SetState(CreateMap(\"promptcontent\":c))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("promptcontent"),(Object)(_c)}));
 //BA.debugLineNum = 120;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-content\": \"promptco";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-content"),(Object)("promptcontent")}));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setinputid(Object _n) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetInputID(n As Object) As VMPrompt";
 //BA.debugLineNum = 73;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-id\": n))";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-input-id"),_n}));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setinputname(Object _n) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetInputName(n As Object) As VMPrompt";
 //BA.debugLineNum = 68;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-name\": n))";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-input-name"),_n}));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setmaxlength(int _ml) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetMaxLength(ml As Int) As VMPrompt";
 //BA.debugLineNum = 78;BA.debugLine="If ml < 0 Then Return Me";
if (_ml<0) { 
if (true) return (b4j.example.vmprompt)(this);};
 //BA.debugLineNum = 79;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 80;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-maxlength\": m";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-input-maxlength"),(Object)(_ml)}));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
 //BA.debugLineNum = 83;BA.debugLine="vue.SetState(CreateMap(\"promptmaxlength\":ml))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("promptmaxlength"),(Object)(_ml)}));
 //BA.debugLineNum = 84;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-input-maxlength\": \"";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-input-maxlength"),(Object)("promptmaxlength")}));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setplaceholder(String _ph) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetPlaceHolder(ph As String) As VMPrompt";
 //BA.debugLineNum = 89;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 90;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-placeholder\":";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-input-placeholder"),(Object)(_ph)}));
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
 //BA.debugLineNum = 93;BA.debugLine="vue.SetState(CreateMap(\"promptplaceholder\":ph))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("promptplaceholder"),(Object)(_ph)}));
 //BA.debugLineNum = 94;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-input-placeholder\":";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-input-placeholder"),(Object)("promptplaceholder")}));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetStatic(b As Boolean) As VMPrompt";
 //BA.debugLineNum = 44;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _settitle(String _t) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetTitle(t As String) As VMPrompt";
 //BA.debugLineNum = 135;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 136;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-title\":t))";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-title"),(Object)(_t)}));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 };
 //BA.debugLineNum = 139;BA.debugLine="vue.SetState(CreateMap(\"prompttitle\":t))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("prompttitle"),(Object)(_t)}));
 //BA.debugLineNum = 140;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-title\":\"prompttitle";
_prompt._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-title"),(Object)("prompttitle")}));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetVModel(k As String) As VMPrompt";
 //BA.debugLineNum = 62;BA.debugLine="Prompt.SetVModel(k)";
_prompt._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprompt)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 37;BA.debugLine="Sub Show";
 //BA.debugLineNum = 38;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 39;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(_id),(Object)(__c.True));
 //BA.debugLineNum = 40;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 146;BA.debugLine="Return Prompt.tostring";
if (true) return _prompt._tostring /*String*/ ();
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
