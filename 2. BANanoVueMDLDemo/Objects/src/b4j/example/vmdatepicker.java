package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdatepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdatepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdatepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _datepicker = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmlabel _lbl = null;
public b4j.example.vmelement _ht = null;
public boolean _hashelp = false;
public b4j.example.vmelement _dateint = null;
public com.ab.banano.BANano _banano = null;
public boolean _haserror = false;
public b4j.example.vmelement _he = null;
public String _xmodel = "";
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
public b4j.example.vmdatepicker  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub AddClass(c As String) As VMDatePicker";
 //BA.debugLineNum = 95;BA.debugLine="DatePicker.AddClass(c)";
_datepicker._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 186;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public DatePicker As VMElement";
_datepicker = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 7;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
 //BA.debugLineNum = 9;BA.debugLine="Private DateInt As VMElement";
_dateint = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 11;BA.debugLine="Private hasError As Boolean";
_haserror = false;
 //BA.debugLineNum = 12;BA.debugLine="Private he As VMElement";
_he = new b4j.example.vmelement();
 //BA.debugLineNum = 13;BA.debugLine="Private xmodel As String";
_xmodel = "";
 //BA.debugLineNum = 14;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatepicker  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 18;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="DatePicker.Initialize(vue, ID).SetTag(\"md-datepic";
_datepicker._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-datepicker");
 //BA.debugLineNum = 22;BA.debugLine="lbl.Initialize(vue,$\"${ID}lbl\"$)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"lbl"));
 //BA.debugLineNum = 23;BA.debugLine="hasHelp = False";
_hashelp = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="hasError = False";
_haserror = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="DateInt.Initialize(v,$\"${sid}parent\"$).SetTag(\"di";
_dateint._initialize /*b4j.example.vmelement*/ (ba,_v,(""+__c.SmartStringFormatter("",(Object)(_sid))+"parent"))._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 26;BA.debugLine="SetOnOpened";
_setonopened();
 //BA.debugLineNum = 27;BA.debugLine="SetOnClosed";
_setonclosed();
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 181;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub Render";
 //BA.debugLineNum = 177;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatepicker  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetAttr(attr As Map) As VMDatePicker";
 //BA.debugLineNum = 101;BA.debugLine="DatePicker.SetAttr(attr)";
_datepicker._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setclearable(boolean _varclearable) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMDat";
 //BA.debugLineNum = 89;BA.debugLine="If varClearable Then DatePicker.SetAttr(CreateMap";
if (_varclearable) { 
_datepicker._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-clearable"),(Object)(_varclearable)}));};
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setdebounce(boolean _b) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetDebounce(b As Boolean) As VMDatePicker";
 //BA.debugLineNum = 140;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 141;BA.debugLine="DatePicker.SetAttr(CreateMap(\"md-debounce\": b))";
_datepicker._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-debounce"),(Object)(_b)}));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetDisabled(b As Boolean) As VMDatePicker";
 //BA.debugLineNum = 38;BA.debugLine="DatePicker.SetDisabled(b)";
_datepicker._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _seterrortext(String _t) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetErrorText(t As String) As VMDatePicker";
 //BA.debugLineNum = 115;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 116;BA.debugLine="hasError = True";
_haserror = __c.True;
 //BA.debugLineNum = 117;BA.debugLine="he = DatePicker.SetErrorText(t)";
_he = _datepicker._seterrortext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _sethelpertext(String _t) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetHelperText(t As String) As VMDatePicker";
 //BA.debugLineNum = 107;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 108;BA.debugLine="hasHelp = True";
_hashelp = __c.True;
 //BA.debugLineNum = 109;BA.debugLine="ht = DatePicker.SetHelperText(t)";
_ht = _datepicker._sethelpertext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setimmediately(boolean _b) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetImmediately(b As Boolean) As VMDatePicker";
 //BA.debugLineNum = 122;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 123;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-immediately\": b";
_datepicker._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-immediately"),(Object)(_b)}));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setlabel(String _t) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetLabel(t As String) As VMDatePicker";
 //BA.debugLineNum = 153;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 154;BA.debugLine="lbl.SetText(t)";
_lbl._settext /*b4j.example.vmlabel*/ (_t);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 160;BA.debugLine="DatePicker.SetName(varName, bind)";
_datepicker._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setonclosed() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 56;BA.debugLine="private Sub SetOnClosed As VMDatePicker";
 //BA.debugLineNum = 57;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_closed");
 //BA.debugLineNum = 58;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 59;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 60;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 61;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
 //BA.debugLineNum = 64;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setonopened() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 43;BA.debugLine="private Sub SetOnOpened As VMDatePicker";
 //BA.debugLineNum = 44;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_opened");
 //BA.debugLineNum = 45;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 46;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 47;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 48;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
 //BA.debugLineNum = 51;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setopenonfocus(boolean _b) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetOpenOnFocus(b As Boolean) As VMDatePicker";
 //BA.debugLineNum = 128;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 129;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-open-on-focus\":";
_datepicker._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-open-on-focus"),(Object)(_b)}));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setoverridenative(boolean _b) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetOverrideNative(b As Boolean) As VMDatePicke";
 //BA.debugLineNum = 134;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 135;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-override-native";
_datepicker._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-override-native"),(Object)(_b)}));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMDateP";
 //BA.debugLineNum = 33;BA.debugLine="DatePicker.SetRequired(varRequired)";
_datepicker._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetTabIndex(ti As String) As VMDatePicker";
 //BA.debugLineNum = 70;BA.debugLine="DatePicker.SetTabIndex(ti)";
_datepicker._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setvif(String _vshow) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetVIf(vshow As String) As VMDatePicker";
 //BA.debugLineNum = 81;BA.debugLine="If vshow = \"\" Then Return Me";
if ((_vshow).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 82;BA.debugLine="DatePicker.SetVif(vshow)";
_datepicker._setvif /*b4j.example.vmelement*/ (_vshow);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetVModel(k As String) As VMDatePicker";
 //BA.debugLineNum = 146;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 147;BA.debugLine="DatePicker.SetVModel(k)";
_datepicker._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 148;BA.debugLine="xmodel = k";
_xmodel = _k;
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetVShow(vif As String) As VMDatePicker";
 //BA.debugLineNum = 75;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
 //BA.debugLineNum = 76;BA.debugLine="DatePicker.SetVShow(vif)";
_datepicker._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 165;BA.debugLine="lbl.Pop(DatePicker)";
_lbl._pop /*String*/ (_datepicker);
 //BA.debugLineNum = 166;BA.debugLine="DatePicker.Pop(DateInt)";
_datepicker._pop /*String*/ (_dateint);
 //BA.debugLineNum = 173;BA.debugLine="Return DateInt.tostring";
if (true) return _dateint._tostring /*String*/ ();
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
