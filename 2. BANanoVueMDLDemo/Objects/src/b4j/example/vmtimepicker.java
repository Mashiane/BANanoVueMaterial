package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtimepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtimepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtimepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _timepicker = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmfield _timepickerint = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public b4j.example.vmelement _et = null;
public com.ab.banano.BANano _banano = null;
public boolean _haserror = false;
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
public b4j.example.vmtimepicker  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub AddChild(child As VMElement) As VMTimePicker";
 //BA.debugLineNum = 147;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 148;BA.debugLine="TimePicker.SetText(childHTML)";
_timepicker._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 175;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 176;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 177;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub AddClass(c As String) As VMTimePicker";
 //BA.debugLineNum = 52;BA.debugLine="TimePicker.AddClass(c)";
_timepicker._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 268;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private TimePicker As VMElement";
_timepicker = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private TimePickerInt As VMField";
_timepickerint = new b4j.example.vmfield();
 //BA.debugLineNum = 7;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 8;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
 //BA.debugLineNum = 9;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="Private et As VMElement";
_et = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 12;BA.debugLine="Private hasError As Boolean";
_haserror = false;
 //BA.debugLineNum = 13;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
String _sval = "";
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="TimePicker.Initialize(vue, ID).SetTag(\"md-select\"";
_timepicker._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-select");
 //BA.debugLineNum = 21;BA.debugLine="TimePickerInt.Initialize(v,ID,$\"${ID}field\"$,modu";
_timepickerint._initialize /*b4j.example.vmfield*/ (ba,_v,_id,(""+__c.SmartStringFormatter("",(Object)(_id))+"field"),_module);
 //BA.debugLineNum = 22;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"label"));
 //BA.debugLineNum = 23;BA.debugLine="hasHelp = False";
_hashelp = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="hasError = False";
_haserror = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="SetTimes";
_settimes();
 //BA.debugLineNum = 26;BA.debugLine="Dim sval As String";
_sval = "";
 //BA.debugLineNum = 27;BA.debugLine="SetOnSelected(sval)";
_setonselected(_sval);
 //BA.debugLineNum = 28;BA.debugLine="SetOnOpened";
_setonopened();
 //BA.debugLineNum = 29;BA.debugLine="SetOnClosed";
_setonclosed();
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 130;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub Render";
 //BA.debugLineNum = 126;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetAccent(b As Boolean) As VMTimePicker";
 //BA.debugLineNum = 164;BA.debugLine="TimePicker.SetAccent(True)";
_timepicker._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetAttr(attr As Map) As VMTimePicker";
 //BA.debugLineNum = 58;BA.debugLine="TimePicker.SetAttr(attr)";
_timepicker._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setdense(boolean _vardense) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetDense(varDense As Boolean) As VMTimePicker";
 //BA.debugLineNum = 227;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 228;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
if (_vardense) { 
_setattr(__c.createMap(new Object[] {(Object)(":md-dense"),(Object)(_vardense)}));};
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTimePicker";
 //BA.debugLineNum = 214;BA.debugLine="TimePicker.setdisabled(b)";
_timepicker._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _seterrortext(String _txt) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetErrorText(txt As String) As VMTimePicker";
 //BA.debugLineNum = 107;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 108;BA.debugLine="hasError = True";
_haserror = __c.True;
 //BA.debugLineNum = 109;BA.debugLine="et = TimePicker.SetErrorText(txt)";
_et = _timepicker._seterrortext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _sethelpertext(String _t) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetHelperText(t As String) As VMTimePicker";
 //BA.debugLineNum = 100;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 101;BA.debugLine="hasHelp = True";
_hashelp = __c.True;
 //BA.debugLineNum = 102;BA.debugLine="ht = TimePicker.SetHelperText(t)";
_ht = _timepicker._sethelpertext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setid(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
 //BA.debugLineNum = 208;BA.debugLine="TimePicker.SetID(varName, bind)";
_timepicker._setid /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setlabel(Object _l) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetLabel(l As Object) As VMTimePicker";
 //BA.debugLineNum = 68;BA.debugLine="lbl.SetText(l)";
_lbl._settext /*b4j.example.vmlabel*/ (BA.ObjectToString(_l));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setmultiple(boolean _varmultiple) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMTimeP";
 //BA.debugLineNum = 220;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 221;BA.debugLine="SetAttr(CreateMap(\":multiple\": varMultiple))";
_setattr(__c.createMap(new Object[] {(Object)(":multiple"),(Object)(_varmultiple)}));
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 202;BA.debugLine="TimePicker.SetName(varName, bind)";
_timepicker._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setonclosed() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 256;BA.debugLine="Sub SetOnClosed As VMTimePicker";
 //BA.debugLineNum = 257;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_closed");
 //BA.debugLineNum = 258;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 259;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 260;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 261;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
 //BA.debugLineNum = 263;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setonopened() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 244;BA.debugLine="private Sub SetOnOpened As VMTimePicker";
 //BA.debugLineNum = 245;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_opened");
 //BA.debugLineNum = 246;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 247;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 248;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 249;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
 //BA.debugLineNum = 251;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setonselected(String _value) throws Exception{
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 233;BA.debugLine="private Sub SetOnSelected(value As String) As VMTi";
 //BA.debugLineNum = 234;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 235;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 236;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value)}))));
 //BA.debugLineNum = 237;BA.debugLine="SetAttr(CreateMap(\"v-on:md-selected\": methodName)";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-selected"),(Object)(_methodname)}));
 //BA.debugLineNum = 239;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public String  _setoptions(String _sourcename,anywheresoftware.b4a.objects.collections.List _options,String _sourcefield,String _displayfield) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _krow = "";
String _drow = "";
b4j.example.vmelement _option = null;
 //BA.debugLineNum = 72;BA.debugLine="private Sub SetOptions(sourceName As String, optio";
 //BA.debugLineNum = 73;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
 //BA.debugLineNum = 74;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 75;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 76;BA.debugLine="For Each k As String In options";
{
final anywheresoftware.b4a.BA.IterableList group4 = _options;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 77;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 78;BA.debugLine="nrec.Put(sourcefield, k)";
_nrec.Put((Object)(_sourcefield),(Object)(_k));
 //BA.debugLineNum = 79;BA.debugLine="nrec.Put(displayfield, k)";
_nrec.Put((Object)(_displayfield),(Object)(_k));
 //BA.debugLineNum = 80;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 83;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_sourcename,(Object)(_recs.getObject()));
 //BA.debugLineNum = 84;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
 //BA.debugLineNum = 85;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
 //BA.debugLineNum = 86;BA.debugLine="Dim option As VMElement";
_option = new b4j.example.vmelement();
 //BA.debugLineNum = 87;BA.debugLine="option.Initialize(vue,\"\")";
_option._initialize /*b4j.example.vmelement*/ (ba,_vue,"");
 //BA.debugLineNum = 88;BA.debugLine="option.SetTag(\"md-option\")";
_option._settag /*b4j.example.vmelement*/ ("md-option");
 //BA.debugLineNum = 89;BA.debugLine="option.SetVFor(\"row\", sourceName)";
_option._setvfor /*b4j.example.vmelement*/ ("row",_sourcename);
 //BA.debugLineNum = 90;BA.debugLine="option.SetID($\"${kRow}\"$,True)";
_option._setid /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
 //BA.debugLineNum = 91;BA.debugLine="option.SetKey($\"${kRow}\"$,True)";
_option._setkey /*b4j.example.vmelement*/ ((Object)((""+__c.SmartStringFormatter("",(Object)(_krow))+"")),__c.True);
 //BA.debugLineNum = 92;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
_option._setvalue /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
 //BA.debugLineNum = 93;BA.debugLine="option.SetName($\"${kRow}\"$,True)";
_option._setname /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
 //BA.debugLineNum = 94;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
_option._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
 //BA.debugLineNum = 95;BA.debugLine="option.Pop(TimePicker)";
_option._pop /*String*/ (_timepicker);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetPadding(p As Object) As VMTimePicker";
 //BA.debugLineNum = 183;BA.debugLine="TimePicker.SetPaddingAll(p)";
_timepicker._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setplaceholder(String _varplaceholder) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 189;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 190;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
_setattr(__c.createMap(new Object[] {(Object)("placeholder"),(Object)(_varplaceholder)}));
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTimePicker";
 //BA.debugLineNum = 159;BA.debugLine="TimePicker.SetPrimary(True)";
_timepicker._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMTimeP";
 //BA.debugLineNum = 196;BA.debugLine="TimePicker.SetRequired(varRequired)";
_timepicker._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetStyle(sm As Map) As VMTimePicker";
 //BA.debugLineNum = 170;BA.debugLine="TimePicker.SetStyle(sm)";
_timepicker._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetTabIndex(ti As String) As VMTimePicker";
 //BA.debugLineNum = 45;BA.debugLine="TimePicker.SetTabIndex(ti)";
_timepicker._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetText(t As Object) As VMTimePicker";
 //BA.debugLineNum = 154;BA.debugLine="TimePicker.SetText(t)";
_timepicker._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public String  _settimes() throws Exception{
anywheresoftware.b4a.objects.collections.List _times = null;
 //BA.debugLineNum = 33;BA.debugLine="private Sub SetTimes";
 //BA.debugLineNum = 34;BA.debugLine="Dim times As List";
_times = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="times.Initialize";
_times.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="times.AddAll(Array(\"12:00\",\"12:30\",\"01:00\",\"01:30";
_times.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("12:00"),(Object)("12:30"),(Object)("01:00"),(Object)("01:30"),(Object)("02:00"),(Object)("02:30"),(Object)("03:00"),(Object)("03:30"),(Object)("04:00"),(Object)("04:30"),(Object)("05:00"),(Object)("05:30"),(Object)("06:00")}));
 //BA.debugLineNum = 37;BA.debugLine="times.AddAll(Array(\"06:30\",\"07:00\",\"07:30\",\"08:00";
_times.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("06:30"),(Object)("07:00"),(Object)("07:30"),(Object)("08:00"),(Object)("08:30"),(Object)("09:00"),(Object)("09:30"),(Object)("10:00"),(Object)("10:30"),(Object)("11:00"),(Object)("11:30"),(Object)("13:00"),(Object)("13:30")}));
 //BA.debugLineNum = 38;BA.debugLine="times.AddAll(Array(\"14:00\",\"14:30\",\"15:00\",\"15:30";
_times.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("14:00"),(Object)("14:30"),(Object)("15:00"),(Object)("15:30"),(Object)("16:00"),(Object)("16:30"),(Object)("17:00"),(Object)("17:30"),(Object)("18:00"),(Object)("18:30"),(Object)("19:00"),(Object)("19:30"),(Object)("20:00")}));
 //BA.debugLineNum = 39;BA.debugLine="times.AddAll(Array(\"20:30\",\"21:00\",\"21:30\",\"22:00";
_times.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("20:30"),(Object)("21:00"),(Object)("21:30"),(Object)("22:00"),(Object)("22:30"),(Object)("23:00"),(Object)("23:30"),(Object)("00:00"),(Object)("00:30"),(Object)("")}));
 //BA.debugLineNum = 40;BA.debugLine="times.Sort(True)";
_times.Sort(__c.True);
 //BA.debugLineNum = 41;BA.debugLine="SetOptions($\"${ID}_times\"$, times, \"id\", \"text\")";
_setoptions((""+__c.SmartStringFormatter("",(Object)(_id))+"_times"),_times,"id","text");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetVIf(vif As String) As VMTimePicker";
 //BA.debugLineNum = 134;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 135;BA.debugLine="TimePickerInt.SetVIf(vif)";
_timepickerint._setvif /*b4j.example.vmfield*/ ((Object)(_vif));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetVModel(k As String) As VMTimePicker";
 //BA.debugLineNum = 63;BA.debugLine="TimePicker.SetVModel(k)";
_timepicker._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetVShow(vif As String) As VMTimePicker";
 //BA.debugLineNum = 140;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
 //BA.debugLineNum = 141;BA.debugLine="TimePickerInt.SetVShow(vif)";
_timepickerint._setvshow /*b4j.example.vmfield*/ ((Object)(_vif));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 114;BA.debugLine="lbl.Pop(TimePickerInt.Field)";
_lbl._pop /*String*/ (_timepickerint._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 115;BA.debugLine="TimePicker.Pop(TimePickerInt.Field)";
_timepicker._pop /*String*/ (_timepickerint._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 116;BA.debugLine="If hasHelp Then";
if (_hashelp) { 
 //BA.debugLineNum = 117;BA.debugLine="ht.Pop(TimePickerInt.Field)";
_ht._pop /*String*/ (_timepickerint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 119;BA.debugLine="If hasError Then";
if (_haserror) { 
 //BA.debugLineNum = 120;BA.debugLine="et.Pop(TimePickerInt.Field)";
_et._pop /*String*/ (_timepickerint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 122;BA.debugLine="Return TimePickerInt.tostring";
if (true) return _timepickerint._tostring /*String*/ ();
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
