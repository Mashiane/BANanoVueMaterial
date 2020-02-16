package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vminput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vminput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vminput.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _input = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmfield _inputint = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public boolean _haserror = false;
public b4j.example.vmicon _icon1 = null;
public b4j.example.vmicon _icon2 = null;
public b4j.example.vmelement _suffix = null;
public b4j.example.vmelement _prefix = null;
public boolean _hassuffix = false;
public boolean _hasprefix = false;
public b4j.example.vmelement _he = null;
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
public b4j.example.vminput  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 163;BA.debugLine="Sub AddChild(child As VMElement) As VMInput";
 //BA.debugLineNum = 164;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 165;BA.debugLine="Input.SetText(childHTML)";
_input._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 210;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 211;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 212;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub AddClass(c As String) As VMInput";
 //BA.debugLineNum = 193;BA.debugLine="Input.AddClass(c)";
_input._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 336;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Input As VMElement";
_input = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private InputInt As VMField";
_inputint = new b4j.example.vmfield();
 //BA.debugLineNum = 8;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 9;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
 //BA.debugLineNum = 10;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private hasError As Boolean";
_haserror = false;
 //BA.debugLineNum = 12;BA.debugLine="Private icon1 As VMIcon";
_icon1 = new b4j.example.vmicon();
 //BA.debugLineNum = 13;BA.debugLine="Private icon2 As VMIcon";
_icon2 = new b4j.example.vmicon();
 //BA.debugLineNum = 14;BA.debugLine="Private suffix As VMElement";
_suffix = new b4j.example.vmelement();
 //BA.debugLineNum = 15;BA.debugLine="Private prefix As VMElement";
_prefix = new b4j.example.vmelement();
 //BA.debugLineNum = 16;BA.debugLine="Private hasSuffix As Boolean";
_hassuffix = false;
 //BA.debugLineNum = 17;BA.debugLine="Private hasPrefix As Boolean";
_hasprefix = false;
 //BA.debugLineNum = 18;BA.debugLine="Private he As VMElement";
_he = new b4j.example.vmelement();
 //BA.debugLineNum = 19;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 24;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 25;BA.debugLine="Input.Initialize(v, ID)";
_input._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 26;BA.debugLine="Input.SetTag(\"md-input\")";
_input._settag /*b4j.example.vmelement*/ ("md-input");
 //BA.debugLineNum = 27;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 28;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 29;BA.debugLine="InputInt.Initialize(v,ID, $\"${ID}field\"$,module)";
_inputint._initialize /*b4j.example.vmfield*/ (ba,_v,_id,(""+__c.SmartStringFormatter("",(Object)(_id))+"field"),_module);
 //BA.debugLineNum = 30;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"label"));
 //BA.debugLineNum = 31;BA.debugLine="hasHelp = False";
_hashelp = __c.False;
 //BA.debugLineNum = 32;BA.debugLine="hasError = False";
_haserror = __c.False;
 //BA.debugLineNum = 33;BA.debugLine="icon1.Initialize(vue,$\"${ID}icon1\"$)";
_icon1._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon1"));
 //BA.debugLineNum = 34;BA.debugLine="icon2.Initialize(vue,$\"${ID}icon2\"$)";
_icon2._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon2"));
 //BA.debugLineNum = 35;BA.debugLine="prefix.Initialize(vue,$\"${ID}prefix\"$).AddClass(\"";
_prefix._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"prefix"))._addclass /*b4j.example.vmelement*/ ("md-prefix")._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 36;BA.debugLine="suffix.Initialize(vue,$\"${ID}suffix\"$).AddClass(\"";
_suffix._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"suffix"))._addclass /*b4j.example.vmelement*/ ("md-suffix")._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 37;BA.debugLine="hasPrefix = False";
_hasprefix = __c.False;
 //BA.debugLineNum = 38;BA.debugLine="hasSuffix = False";
_hassuffix = __c.False;
 //BA.debugLineNum = 39;BA.debugLine="SetOnInput";
_setoninput();
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 188;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub Render";
 //BA.debugLineNum = 159;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetAccent(b As Boolean) As VMInput";
 //BA.debugLineNum = 182;BA.debugLine="Input.SetAccent(True)";
_input._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetAttr(attr As Map) As VMInput";
 //BA.debugLineNum = 199;BA.debugLine="Input.SetAttr(attr)";
_input._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setautocomplete(String _auto) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetAutoComplete(auto As String) As VMInput";
 //BA.debugLineNum = 54;BA.debugLine="Input.SetAutoComplete(auto)";
_input._setautocomplete /*b4j.example.vmelement*/ (_auto);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setclearable(boolean _varclearable) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMInp";
 //BA.debugLineNum = 322;BA.debugLine="If varClearable = False Then Return Me";
if (_varclearable==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 323;BA.debugLine="If varClearable Then InputInt.SetAttr(CreateMap(\"";
if (_varclearable) { 
_inputint._setattr /*b4j.example.vmfield*/ (__c.createMap(new Object[] {(Object)(":md-clearable"),(Object)(_varclearable)}));};
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setcounter(String _varcounter) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetCounter(varCounter As String) As VMInput";
 //BA.debugLineNum = 303;BA.debugLine="If varCounter = \"\" Then Return Me";
if ((_varcounter).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 304;BA.debugLine="SetAttr(CreateMap(\"md-counter\": varCounter))";
_setattr(__c.createMap(new Object[] {(Object)("md-counter"),(Object)(_varcounter)}));
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setcounterdisabled() throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetCounterDisabled As VMInput";
 //BA.debugLineNum = 297;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-counter\": False))";
_inputint._setattr /*b4j.example.vmfield*/ (__c.createMap(new Object[] {(Object)(":md-counter"),(Object)(__c.False)}));
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetDisabled(b As Boolean) As VMInput";
 //BA.debugLineNum = 284;BA.debugLine="Input.setdisabled(b)";
_input._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seterrortext(String _t) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetErrorText(t As String) As VMInput";
 //BA.debugLineNum = 132;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 133;BA.debugLine="hasError = True";
_haserror = __c.True;
 //BA.debugLineNum = 134;BA.debugLine="he = Input.SetErrorText(t)";
_he = _input._seterrortext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _sethelpertext(String _t) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetHelperText(t As String) As VMInput";
 //BA.debugLineNum = 125;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 126;BA.debugLine="hasHelp = True";
_hashelp = __c.True;
 //BA.debugLineNum = 127;BA.debugLine="ht = Input.SetHelperText(t)";
_ht = _input._sethelpertext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seticon(String _stricon) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetIcon(strIcon As String) As VMInput";
 //BA.debugLineNum = 74;BA.debugLine="If strIcon = \"\" Then Return Me";
if ((_stricon).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 75;BA.debugLine="icon1.SetText(strIcon)";
_icon1._settext /*b4j.example.vmicon*/ (_stricon);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seticon1(String _stricon) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetIcon1(strIcon As String) As VMInput";
 //BA.debugLineNum = 81;BA.debugLine="If strIcon = \"\" Then Return Me";
if ((_stricon).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 82;BA.debugLine="icon2.SetText(strIcon)";
_icon2._settext /*b4j.example.vmicon*/ (_stricon);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setid(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
 //BA.debugLineNum = 279;BA.debugLine="Input.SetID(varName, bind)";
_input._setid /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setinline(boolean _varinline) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetInline(varInline As Boolean) As VMInput";
 //BA.debugLineNum = 310;BA.debugLine="If varInline = True Then Return Me";
if (_varinline==__c.True) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 311;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-inline\": varInlin";
_inputint._setattr /*b4j.example.vmfield*/ (__c.createMap(new Object[] {(Object)(":md-inline"),(Object)(_varinline)}));
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setlabel(String _lbltext) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetLabel(lblText As String) As VMInput";
 //BA.debugLineNum = 94;BA.debugLine="If lblText = \"\" Then Return Me";
if ((_lbltext).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 95;BA.debugLine="lbl.SetText(lblText)";
_lbl._settext /*b4j.example.vmlabel*/ (_lbltext);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setmaxlength(int _varmaxlength) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetMaxLength(varMaxlength As Int) As VMInput";
 //BA.debugLineNum = 290;BA.debugLine="If varMaxlength = Null Then Return Me";
if (_varmaxlength==(double)(BA.ObjectToNumber(__c.Null))) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 291;BA.debugLine="SetAttr(CreateMap(\"maxlength\": varMaxlength))";
_setattr(__c.createMap(new Object[] {(Object)("maxlength"),(Object)(_varmaxlength)}));
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 273;BA.debugLine="Input.SetName(varName, bind)";
_input._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setoninput() throws Exception{
String _oninput = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 43;BA.debugLine="private Sub SetOnInput As VMInput";
 //BA.debugLineNum = 44;BA.debugLine="Dim oninput As String = $\"${ID}_input\"$";
_oninput = (""+__c.SmartStringFormatter("",(Object)(_id))+"_input");
 //BA.debugLineNum = 45;BA.debugLine="If SubExists(module, oninput) = False Then Return";
if (__c.SubExists(ba,_module,_oninput)==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 46;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 47;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_oninput,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 48;BA.debugLine="SetAttr(CreateMap(\"@input\":oninput))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_oninput)}));
 //BA.debugLineNum = 49;BA.debugLine="vue.SetCallBack(oninput, cb)";
_vue._setcallback /*String*/ (_oninput,_cb);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetPadding(p As Object) As VMInput";
 //BA.debugLineNum = 218;BA.debugLine="Input.SetPaddingAll(p)";
_input._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setplaceholder(Object _varplaceholder) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
 //BA.debugLineNum = 261;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
_setattr(__c.createMap(new Object[] {(Object)("placeholder"),_varplaceholder}));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setprefix(String _p) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetPrefix(p As String) As VMInput";
 //BA.debugLineNum = 59;BA.debugLine="If p = \"\" Then Return Me";
if ((_p).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 60;BA.debugLine="hasPrefix = True";
_hasprefix = __c.True;
 //BA.debugLineNum = 61;BA.debugLine="prefix.SetText(p)";
_prefix._settext /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetPrimary(b As Boolean) As VMInput";
 //BA.debugLineNum = 177;BA.debugLine="Input.SetPrimary(True)";
_input._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMInput";
 //BA.debugLineNum = 88;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 89;BA.debugLine="Input.SetAttr(CreateMap(\":readonly\": b))";
_input._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":readonly"),(Object)(_b)}));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMInput";
 //BA.debugLineNum = 267;BA.debugLine="Input.SetRequired(varRequired)";
_input._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetStyle(sm As Map) As VMInput";
 //BA.debugLineNum = 205;BA.debugLine="Input.SetStyle(sm)";
_input._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setsuffix(String _s) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetSuffix(s As String) As VMInput";
 //BA.debugLineNum = 66;BA.debugLine="If s = \"\" Then Return Me";
if ((_s).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 67;BA.debugLine="hasSuffix = True";
_hassuffix = __c.True;
 //BA.debugLineNum = 68;BA.debugLine="suffix.SetText(s)";
_suffix._settext /*b4j.example.vmelement*/ (_s);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetTabIndex(ti As String) As VMInput";
 //BA.debugLineNum = 316;BA.debugLine="Input.SetTabIndex(ti)";
_input._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settext(String _t) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetText(t As String) As VMInput";
 //BA.debugLineNum = 171;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 172;BA.debugLine="Input.SetText(t)";
_input._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settogglepassword(boolean _vartogglepassword) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetTogglePassword(varTogglePassword As Boolean";
 //BA.debugLineNum = 329;BA.debugLine="If varTogglePassword = False Then Return Me";
if (_vartogglepassword==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 330;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-toggle-password\":";
_inputint._setattr /*b4j.example.vmfield*/ (__c.createMap(new Object[] {(Object)(":md-toggle-password"),(Object)(_vartogglepassword)}));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settype(Object _vartype) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetType(varType As Object) As VMInput";
 //BA.debugLineNum = 224;BA.debugLine="SetAttr(CreateMap(\"type\": varType))";
_setattr(__c.createMap(new Object[] {(Object)("type"),_vartype}));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypeemail(boolean _b) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetTypeEmail(b As Boolean) As VMInput    'igno";
 //BA.debugLineNum = 236;BA.debugLine="SetAttr(CreateMap(\"type\": \"email\"))";
_setattr(__c.createMap(new Object[] {(Object)("type"),(Object)("email")}));
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypenumber(boolean _b) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetTypeNumber(b As Boolean) As VMInput    'ign";
 //BA.debugLineNum = 255;BA.debugLine="SetAttr(CreateMap(\"type\": \"number\"))";
_setattr(__c.createMap(new Object[] {(Object)("type"),(Object)("number")}));
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypepassword(boolean _b) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetTypePassword(b As Boolean) As VMInput    'i";
 //BA.debugLineNum = 248;BA.debugLine="SetAttr(CreateMap(\"type\": \"password\"))";
_setattr(__c.createMap(new Object[] {(Object)("type"),(Object)("password")}));
 //BA.debugLineNum = 249;BA.debugLine="InputInt.SetAttr(CreateMap(\"md-has-password\":True";
_inputint._setattr /*b4j.example.vmfield*/ (__c.createMap(new Object[] {(Object)("md-has-password"),(Object)(__c.True)}));
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypetel(boolean _b) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetTypeTel(b As Boolean) As VMInput    'ignore";
 //BA.debugLineNum = 242;BA.debugLine="SetAttr(CreateMap(\"type\": \"tel\"))";
_setattr(__c.createMap(new Object[] {(Object)("type"),(Object)("tel")}));
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypetext(boolean _b) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetTypeText(b As Boolean) As VMInput    'ignor";
 //BA.debugLineNum = 230;BA.debugLine="SetAttr(CreateMap(\"type\": \"text\"))";
_setattr(__c.createMap(new Object[] {(Object)("type"),(Object)("text")}));
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetVIf(vif As Object) As VMInput";
 //BA.debugLineNum = 146;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals((Object)(""))) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 147;BA.debugLine="InputInt.SetVIf(vif)";
_inputint._setvif /*b4j.example.vmfield*/ (_vif);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetVModel(k As String) As VMInput";
 //BA.debugLineNum = 140;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 141;BA.debugLine="Input.SetVModel(k)";
_input._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetVShow(vif As Object) As VMInput";
 //BA.debugLineNum = 152;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals((Object)(""))) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 153;BA.debugLine="InputInt.SetVShow(vif)";
_inputint._setvshow /*b4j.example.vmfield*/ (_vif);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 101;BA.debugLine="If icon1.hasContent Then";
if (_icon1._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 102;BA.debugLine="icon1.Pop(InputInt.Field)";
_icon1._pop /*String*/ (_inputint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 104;BA.debugLine="lbl.Pop(InputInt.Field)";
_lbl._pop /*String*/ (_inputint._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 105;BA.debugLine="If hasPrefix Then";
if (_hasprefix) { 
 //BA.debugLineNum = 106;BA.debugLine="prefix.Pop(InputInt.Field)";
_prefix._pop /*String*/ (_inputint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 108;BA.debugLine="Input.Pop(InputInt.Field)";
_input._pop /*String*/ (_inputint._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 109;BA.debugLine="If hasSuffix Then";
if (_hassuffix) { 
 //BA.debugLineNum = 110;BA.debugLine="suffix.Pop(InputInt.Field)";
_suffix._pop /*String*/ (_inputint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 112;BA.debugLine="If icon2.hasContent Then";
if (_icon2._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 113;BA.debugLine="icon2.Pop(InputInt.Field)";
_icon2._pop /*String*/ (_inputint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 115;BA.debugLine="If hasHelp Then";
if (_hashelp) { 
 //BA.debugLineNum = 116;BA.debugLine="ht.Pop(InputInt.Field)";
_ht._pop /*String*/ (_inputint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 118;BA.debugLine="If hasError Then";
if (_haserror) { 
 //BA.debugLineNum = 119;BA.debugLine="he.Pop(InputInt.Field)";
_he._pop /*String*/ (_inputint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 121;BA.debugLine="Return InputInt.tostring";
if (true) return _inputint._tostring /*String*/ ();
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
