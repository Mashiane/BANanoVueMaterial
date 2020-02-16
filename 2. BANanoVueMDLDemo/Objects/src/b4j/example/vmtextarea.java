package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtextarea extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtextarea", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtextarea.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _textarea = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmfield _internal = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public boolean _haserror = false;
public b4j.example.vmelement _he = null;
public b4j.example.vmicon _icon1 = null;
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
public b4j.example.vmtextarea  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub AddChild(child As VMElement) As VMTextArea";
 //BA.debugLineNum = 124;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 125;BA.debugLine="TextArea.SetText(childHTML)";
_textarea._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 169;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 170;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 171;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextarea  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub AddClass(c As String) As VMTextArea";
 //BA.debugLineNum = 152;BA.debugLine="TextArea.AddClass(c)";
_textarea._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 237;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TextArea As VMElement";
_textarea = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private Internal As VMField";
_internal = new b4j.example.vmfield();
 //BA.debugLineNum = 8;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 9;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
 //BA.debugLineNum = 10;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private hasError As Boolean";
_haserror = false;
 //BA.debugLineNum = 12;BA.debugLine="Private he As VMElement";
_he = new b4j.example.vmelement();
 //BA.debugLineNum = 13;BA.debugLine="Private icon1 As VMIcon";
_icon1 = new b4j.example.vmicon();
 //BA.debugLineNum = 14;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextarea  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="TextArea.Initialize(v, ID)";
_textarea._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 22;BA.debugLine="TextArea.SetTag(\"md-textarea\")";
_textarea._settag /*b4j.example.vmelement*/ ("md-textarea");
 //BA.debugLineNum = 23;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 24;BA.debugLine="Internal.Initialize(v,ID,$\"${ID}field\"$, module)";
_internal._initialize /*b4j.example.vmfield*/ (ba,_v,_id,(""+__c.SmartStringFormatter("",(Object)(_id))+"field"),_module);
 //BA.debugLineNum = 25;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"label"));
 //BA.debugLineNum = 26;BA.debugLine="hasHelp = False";
_hashelp = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="hasError = False";
_haserror = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="icon1.Initialize(vue,$\"${ID}icon\"$)";
_icon1._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 147;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub Render";
 //BA.debugLineNum = 119;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextarea  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetAccent(b As Boolean) As VMTextArea";
 //BA.debugLineNum = 141;BA.debugLine="TextArea.SetAccent(True)";
_textarea._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetAttr(attr As Map) As VMTextArea";
 //BA.debugLineNum = 158;BA.debugLine="TextArea.SetAttr(attr)";
_textarea._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setautogrow(boolean _varautogrow) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetAutogrow(varAutogrow As Boolean) As VMTextA";
 //BA.debugLineNum = 217;BA.debugLine="If varAutogrow = False Then Return Me";
if (_varautogrow==__c.False) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 218;BA.debugLine="SetAttr(CreateMap(\":md-autogrow\": varAutogrow))";
_setattr(__c.createMap(new Object[] {(Object)(":md-autogrow"),(Object)(_varautogrow)}));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setclearable(boolean _varclearable) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMTex";
 //BA.debugLineNum = 231;BA.debugLine="If varClearable Then Internal.SetAttr(CreateMap(\"";
if (_varclearable) { 
_internal._setattr /*b4j.example.vmfield*/ (__c.createMap(new Object[] {(Object)(":md-clearable"),(Object)(_varclearable)}));};
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setcounter(String _varcounter) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetCounter(varCounter As String) As VMTextArea";
 //BA.debugLineNum = 210;BA.debugLine="If varCounter = \"\" Then Return Me";
if ((_varcounter).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 211;BA.debugLine="SetAttr(CreateMap(\":md-counter\": varCounter))";
_setattr(__c.createMap(new Object[] {(Object)(":md-counter"),(Object)(_varcounter)}));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setcounterdisabled() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetCounterDisabled As VMTextArea";
 //BA.debugLineNum = 33;BA.debugLine="Internal.SetAttr(CreateMap(\":md-counter\": False))";
_internal._setattr /*b4j.example.vmfield*/ (__c.createMap(new Object[] {(Object)(":md-counter"),(Object)(__c.False)}));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTextArea";
 //BA.debugLineNum = 196;BA.debugLine="TextArea.SetDisabled(b)";
_textarea._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _seterrortext(String _t) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetErrorText(t As String) As VMTextArea";
 //BA.debugLineNum = 99;BA.debugLine="hasError = True";
_haserror = __c.True;
 //BA.debugLineNum = 100;BA.debugLine="he = TextArea.SetErrorText(t)";
_he = _textarea._seterrortext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _sethelpertext(String _t) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetHelperText(t As String) As VMTextArea";
 //BA.debugLineNum = 92;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 93;BA.debugLine="hasHelp = True";
_hashelp = __c.True;
 //BA.debugLineNum = 94;BA.debugLine="ht = TextArea.SetHelperText(t)";
_ht = _textarea._sethelpertext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _seticon(String _stricon) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetIcon(strIcon As String) As VMTextArea";
 //BA.debugLineNum = 51;BA.debugLine="If strIcon <> \"\" Then icon1.SetText(strIcon)";
if ((_stricon).equals("") == false) { 
_icon1._settext /*b4j.example.vmicon*/ (_stricon);};
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setinline(boolean _varinline) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetInline(varInline As Boolean) As VMTextArea";
 //BA.debugLineNum = 224;BA.debugLine="If varInline = False Then Return Me";
if (_varinline==__c.False) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 225;BA.debugLine="Internal.SetAttr(CreateMap(\":md-inline\": varInlin";
_internal._setattr /*b4j.example.vmfield*/ (__c.createMap(new Object[] {(Object)(":md-inline"),(Object)(_varinline)}));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetLabel(l As String) As VMTextArea";
 //BA.debugLineNum = 63;BA.debugLine="If l = \"\" Then Return Me";
if ((_l).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 64;BA.debugLine="lbl.SetText(l)";
_lbl._settext /*b4j.example.vmlabel*/ (_l);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setmaxlength(String _varmaxlength) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetMaxLength(varMaxlength As String) As VMText";
 //BA.debugLineNum = 202;BA.debugLine="If varMaxlength = \"\" Then Return Me";
if ((_varmaxlength).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 203;BA.debugLine="If varMaxlength = Null Then Return Me";
if (_varmaxlength== null) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 204;BA.debugLine="SetAttr(CreateMap(\"maxlength\": varMaxlength))";
_setattr(__c.createMap(new Object[] {(Object)("maxlength"),(Object)(_varmaxlength)}));
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 45;BA.debugLine="TextArea.SetName(varName, bind)";
_textarea._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetPadding(p As Object) As VMTextArea";
 //BA.debugLineNum = 177;BA.debugLine="TextArea.SetPaddingAll(p)";
_textarea._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setplaceholder(Object _varplaceholder) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
 //BA.debugLineNum = 184;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
_setattr(__c.createMap(new Object[] {(Object)("placeholder"),_varplaceholder}));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTextArea";
 //BA.debugLineNum = 136;BA.debugLine="TextArea.SetPrimary(True)";
_textarea._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMTextArea";
 //BA.debugLineNum = 57;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 58;BA.debugLine="TextArea.SetAttr(CreateMap(\":readonly\": b))";
_textarea._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":readonly"),(Object)(_b)}));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMTextA";
 //BA.debugLineNum = 190;BA.debugLine="TextArea.SetRequired(varRequired)";
_textarea._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetStyle(sm As Map) As VMTextArea";
 //BA.debugLineNum = 164;BA.debugLine="TextArea.SetStyle(sm)";
_textarea._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetTabIndex(ti As String) As VMTextArea";
 //BA.debugLineNum = 38;BA.debugLine="TextArea.SetTabIndex(ti)";
_textarea._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetText(t As Object) As VMTextArea";
 //BA.debugLineNum = 131;BA.debugLine="TextArea.SetText(t)";
_textarea._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetVIf(vif As String) As VMTextArea";
 //BA.debugLineNum = 106;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 107;BA.debugLine="Internal.SetVIf(vif)";
_internal._setvif /*b4j.example.vmfield*/ ((Object)(_vif));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetVModel(k As String) As VMTextArea";
 //BA.debugLineNum = 85;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 86;BA.debugLine="TextArea.SetVModel(k)";
_textarea._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetVShow(vif As String) As VMTextArea";
 //BA.debugLineNum = 112;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
 //BA.debugLineNum = 113;BA.debugLine="Internal.SetVShow(vif)";
_internal._setvshow /*b4j.example.vmfield*/ ((Object)(_vif));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 70;BA.debugLine="lbl.Pop(Internal.Field)";
_lbl._pop /*String*/ (_internal._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 71;BA.debugLine="TextArea.Pop(Internal.Field)";
_textarea._pop /*String*/ (_internal._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 72;BA.debugLine="If hasHelp Then";
if (_hashelp) { 
 //BA.debugLineNum = 73;BA.debugLine="ht.Pop(Internal.Field)";
_ht._pop /*String*/ (_internal._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 75;BA.debugLine="If hasError Then";
if (_haserror) { 
 //BA.debugLineNum = 76;BA.debugLine="he.Pop(Internal.field)";
_he._pop /*String*/ (_internal._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 78;BA.debugLine="If icon1.hasContent Then";
if (_icon1._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 79;BA.debugLine="icon1.Pop(Internal.Field)";
_icon1._pop /*String*/ (_internal._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 81;BA.debugLine="Return Internal.tostring";
if (true) return _internal._tostring /*String*/ ();
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
