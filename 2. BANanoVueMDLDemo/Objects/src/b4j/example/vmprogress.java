package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprogress extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmprogress", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprogress.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _progress = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public String _bindvalue = "";
public String _buffervalue = "";
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
public b4j.example.vmprogress  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub AddClass(c As String) As VMProgress";
 //BA.debugLineNum = 121;BA.debugLine="Progress.AddClass(c)";
_progress._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 144;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Progress As VMElement";
_progress = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object   'ignore";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private bindvalue As String";
_bindvalue = "";
 //BA.debugLineNum = 9;BA.debugLine="Private buffervalue As String";
_buffervalue = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogress  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="Progress.Initialize(vue, ID).SetTag(\"md-progress-";
_progress._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-progress-bar");
 //BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 17;BA.debugLine="bindvalue = $\"${ID}value\"$";
_bindvalue = (""+__c.SmartStringFormatter("",(Object)(_id))+"value");
 //BA.debugLineNum = 18;BA.debugLine="buffervalue = $\"${ID}buffer\"$";
_buffervalue = (""+__c.SmartStringFormatter("",(Object)(_id))+"buffer");
 //BA.debugLineNum = 19;BA.debugLine="SetValue(Null)";
_setvalue((int)(BA.ObjectToNumber(__c.Null)));
 //BA.debugLineNum = 20;BA.debugLine="SetBuffer(Null)";
_setbuffer((int)(BA.ObjectToNumber(__c.Null)));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 140;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub Render";
 //BA.debugLineNum = 136;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogress  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetAccent(b As Boolean) As VMProgress";
 //BA.debugLineNum = 97;BA.debugLine="Progress.SetAccent(b)";
_progress._setaccent /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetAttr(attr As Map) As VMProgress";
 //BA.debugLineNum = 127;BA.debugLine="Progress.SetAttr(attr)";
_progress._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setbuffer(int _bvalue) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetBuffer(bValue As Int) As VMProgress";
 //BA.debugLineNum = 71;BA.debugLine="vue.SetStateSingle(buffervalue, bValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_buffervalue,(Object)(_bvalue));
 //BA.debugLineNum = 72;BA.debugLine="Progress.SetAttr1(\":md-buffer\", buffervalue)";
_progress._setattr1 /*b4j.example.vmelement*/ (":md-buffer",(Object)(_buffervalue));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetDisabled(b As Boolean) As VMProgress";
 //BA.debugLineNum = 115;BA.debugLine="Progress.SetDisabled(b)";
_progress._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmargin(String _p) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetMargin(p As String) As VMProgress";
 //BA.debugLineNum = 30;BA.debugLine="Progress.SetStyle(CreateMap(\"margin\":p))";
_progress._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("margin"),(Object)(_p)}));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmode(String _varmode) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetMode(varMode As String) As VMProgress";
 //BA.debugLineNum = 41;BA.debugLine="Progress.SetAttr1(\"md-mode\", varMode)";
_progress._setattr1 /*b4j.example.vmelement*/ ("md-mode",(Object)(_varmode));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmodebuffer(boolean _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetModeBuffer(b As Boolean) As VMProgress";
 //BA.debugLineNum = 65;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmprogress)(this);};
 //BA.debugLineNum = 66;BA.debugLine="SetMode(\"buffer\")";
_setmode("buffer");
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmodedeterminate(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetModeDeterminate(b As Boolean) As VMProgress";
 //BA.debugLineNum = 46;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmprogress)(this);};
 //BA.debugLineNum = 47;BA.debugLine="SetMode(\"determinate\")";
_setmode("determinate");
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmodeindeterminate(boolean _b) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetModeInDeterminate(b As Boolean) As VMProgre";
 //BA.debugLineNum = 52;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmprogress)(this);};
 //BA.debugLineNum = 53;BA.debugLine="SetMode(\"indeterminate\")";
_setmode("indeterminate");
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmodequery(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetModeQuery(b As Boolean) As VMProgress";
 //BA.debugLineNum = 58;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmprogress)(this);};
 //BA.debugLineNum = 59;BA.debugLine="SetMode(\"query\")";
_setmode("query");
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 103;BA.debugLine="Progress.SetName(varName, bind)";
_progress._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setpadding(String _p) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetPadding(p As String) As VMProgress";
 //BA.debugLineNum = 35;BA.debugLine="Progress.SetStyle(CreateMap(\"padding\":p))";
_progress._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("padding"),(Object)(_p)}));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetPrimary(b As Boolean) As VMProgress";
 //BA.debugLineNum = 92;BA.debugLine="Progress.SetPrimary(b)";
_progress._setprimary /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetStyle(m As Map) As VMProgress";
 //BA.debugLineNum = 25;BA.debugLine="Progress.SetStyle(m)";
_progress._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetTabIndex(ti As String) As VMProgress";
 //BA.debugLineNum = 77;BA.debugLine="Progress.SetTabIndex(ti)";
_progress._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setvalue(int _valueint) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetValue(valueInt As Int) As VMProgress";
 //BA.debugLineNum = 109;BA.debugLine="Progress.SetAttr1(\":md-value\", bindvalue)";
_progress._setattr1 /*b4j.example.vmelement*/ (":md-value",(Object)(_bindvalue));
 //BA.debugLineNum = 110;BA.debugLine="vue.SetStateSingle(bindvalue, valueInt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_bindvalue,(Object)(_valueint));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setvif(String _vshow) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetVIf(vshow As String) As VMProgress";
 //BA.debugLineNum = 87;BA.debugLine="Progress.SetVif(vshow)";
_progress._setvif /*b4j.example.vmelement*/ (_vshow);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setvshow(String _vshow) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVShow(vshow As String) As VMProgress";
 //BA.debugLineNum = 82;BA.debugLine="Progress.SetVShow(vshow)";
_progress._setvshow /*b4j.example.vmelement*/ (_vshow);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 132;BA.debugLine="Return Progress.tostring";
if (true) return _progress._tostring /*String*/ ();
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
