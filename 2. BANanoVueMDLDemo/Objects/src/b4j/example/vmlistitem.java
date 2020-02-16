package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlistitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _listitem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmelement _txt = null;
public boolean _hastext = false;
public boolean _hasaction = false;
public b4j.example.vmbutton _btn = null;
public boolean _hasicon = false;
public b4j.example.vmicon _icn = null;
public boolean _hasavatar = false;
public b4j.example.vmavatar _avatar = null;
public boolean _hasswitch = false;
public b4j.example.vmswitch _switch = null;
public boolean _hasbadge = false;
public b4j.example.vmbadge _badge = null;
public b4j.example.vmlist _childlist = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _span = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public boolean _hasmenu = false;
public b4j.example.vmmenu _menu = null;
public String _syncid = "";
public Object _eventhandler = null;
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
public b4j.example.vmlistitem  _addbutton(String _btnid,String _btntext) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub AddButton(btnID As String, btnText As String)";
 //BA.debugLineNum = 143;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 144;BA.debugLine="btn.Initialize(vue,btnID, eventHandler)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_eventhandler);
 //BA.debugLineNum = 145;BA.debugLine="btn.SetText(btnText)";
_btn._settext /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 146;BA.debugLine="btn.SetRaised(True)";
_btn._setraised /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 147;BA.debugLine="btn.SetPrimary(True)";
_btn._setprimary /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 148;BA.debugLine="btn.SetAccent(False)";
_btn._setaccent /*b4j.example.vmbutton*/ (__c.False);
 //BA.debugLineNum = 149;BA.debugLine="btn.SetDisabled(False)";
_btn._setdisabled /*b4j.example.vmbutton*/ (__c.False);
 //BA.debugLineNum = 150;BA.debugLine="btn.SetStyle(CreateMap(\"width\":\"100%\",\"margin-lef";
_btn._setstyle /*b4j.example.vmbutton*/ (__c.createMap(new Object[] {(Object)("width"),(Object)("100%"),(Object)("margin-left"),(Object)("0px"),(Object)("margin-right"),(Object)("0px")}));
 //BA.debugLineNum = 151;BA.debugLine="btn.Pop(ListItem)";
_btn._pop /*String*/ (_listitem);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addcheckbox(String _vmodel,boolean _bvalue,String _vtext,boolean _bprimary) throws Exception{
b4j.example.vmcheckbox _cb = null;
 //BA.debugLineNum = 285;BA.debugLine="Sub AddCheckBox(vmodel As String, bValue As Boolea";
 //BA.debugLineNum = 286;BA.debugLine="vue.SetStateSingle(vmodel, bValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_bvalue));
 //BA.debugLineNum = 287;BA.debugLine="Dim cb As VMCheckBox";
_cb = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 288;BA.debugLine="cb.Initialize(vue, $\"${vmodel}cb\"$,eventHandler).";
_cb._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"cb"),_eventhandler)._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel)._setprimary /*b4j.example.vmcheckbox*/ (_bprimary);
 //BA.debugLineNum = 289;BA.debugLine="cb.Pop(ListItem)";
_cb._pop /*String*/ (_listitem);
 //BA.debugLineNum = 290;BA.debugLine="SetText(vText)";
_settext(_vtext);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub AddClass(c As String) As VMListItem";
 //BA.debugLineNum = 120;BA.debugLine="ListItem.AddClass(c)";
_listitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _adddatepicker(String _vmodel,String _vtext,String _value) throws Exception{
b4j.example.vmdatepicker _datex = null;
 //BA.debugLineNum = 246;BA.debugLine="Sub AddDatePicker(vmodel As String, vText As Strin";
 //BA.debugLineNum = 247;BA.debugLine="vue.SetStateSingle(vmodel, value)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_value));
 //BA.debugLineNum = 248;BA.debugLine="Dim datex As VMDatePicker";
_datex = new b4j.example.vmdatepicker();
 //BA.debugLineNum = 249;BA.debugLine="datex.Initialize(vue,$\"${vmodel}dp\"$,eventHandler";
_datex._initialize /*b4j.example.vmdatepicker*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"dp"),_eventhandler);
 //BA.debugLineNum = 250;BA.debugLine="datex.SetVModel(vmodel)";
_datex._setvmodel /*b4j.example.vmdatepicker*/ (_vmodel);
 //BA.debugLineNum = 251;BA.debugLine="datex.SetLabel(vText)";
_datex._setlabel /*b4j.example.vmdatepicker*/ (_vtext);
 //BA.debugLineNum = 252;BA.debugLine="datex.Pop(ListItem)";
_datex._pop /*String*/ (_listitem);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public String  _adddeletemenuitem(String _sid,String _caption) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub AddDeleteMenuItem(sid As String, caption As St";
 //BA.debugLineNum = 42;BA.debugLine="menu.AddIconText(sid, \"delete\", caption)";
_menu._addicontext /*String*/ (_sid,"delete",_caption);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _addeditmenuitem(String _sid,String _caption) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub AddEditMenuItem(sid As String, caption As Stri";
 //BA.debugLineNum = 38;BA.debugLine="menu.AddIconText(sid, \"edit\", caption)";
_menu._addicontext /*String*/ (_sid,"edit",_caption);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _addiconbutton(String _btnid,String _btnicon) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub AddIconButton(btnID As String, btnIcon As Stri";
 //BA.debugLineNum = 156;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 157;BA.debugLine="btn.Initialize(vue,btnID,eventHandler).SetIconBut";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_eventhandler)._seticonbutton /*b4j.example.vmbutton*/ (__c.True)._seticon /*b4j.example.vmbutton*/ (_btnicon);
 //BA.debugLineNum = 158;BA.debugLine="btn.SetPrimary(True)";
_btn._setprimary /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 159;BA.debugLine="btn.SetDisabled(False)";
_btn._setdisabled /*b4j.example.vmbutton*/ (__c.False);
 //BA.debugLineNum = 160;BA.debugLine="btn.Pop(ListItem)";
_btn._pop /*String*/ (_listitem);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addinput(String _typeof,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
b4j.example.vminput _input = null;
 //BA.debugLineNum = 268;BA.debugLine="Sub AddInput(typeOf As String, vModel As String, v";
 //BA.debugLineNum = 269;BA.debugLine="vue.SetStateSingle(vModel, vValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_vvalue));
 //BA.debugLineNum = 270;BA.debugLine="Dim input As VMInput";
_input = new b4j.example.vminput();
 //BA.debugLineNum = 271;BA.debugLine="input.Initialize(vue,$\"${vModel}inp\"$,eventHandle";
_input._initialize /*b4j.example.vminput*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"inp"),_eventhandler);
 //BA.debugLineNum = 272;BA.debugLine="input.SetType(typeOf)";
_input._settype /*b4j.example.vminput*/ ((Object)(_typeof));
 //BA.debugLineNum = 273;BA.debugLine="input.SetLabel(vText)";
_input._setlabel /*b4j.example.vminput*/ (_vtext);
 //BA.debugLineNum = 274;BA.debugLine="input.SetVModel(vModel)";
_input._setvmodel /*b4j.example.vminput*/ (_vmodel);
 //BA.debugLineNum = 275;BA.debugLine="input.SetName(vModel,False)";
_input._setname /*b4j.example.vminput*/ ((Object)(_vmodel),__c.False);
 //BA.debugLineNum = 276;BA.debugLine="input.SetAutoComplete(vModel)";
_input._setautocomplete /*b4j.example.vminput*/ (_vmodel);
 //BA.debugLineNum = 277;BA.debugLine="If vIcon <> \"\" Then input.SetIcon(vIcon)";
if ((_vicon).equals("") == false) { 
_input._seticon /*b4j.example.vminput*/ (_vicon);};
 //BA.debugLineNum = 278;BA.debugLine="If typeOf <> \"password\" Then";
if ((_typeof).equals("password") == false) { 
 //BA.debugLineNum = 279;BA.debugLine="input.SetClearable(True)";
_input._setclearable /*b4j.example.vminput*/ (__c.True);
 };
 //BA.debugLineNum = 281;BA.debugLine="input.Pop(ListItem)";
_input._pop /*String*/ (_listitem);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addlabel(String _t) throws Exception{
b4j.example.vmlabel _el = null;
 //BA.debugLineNum = 239;BA.debugLine="Sub AddLabel(t As String) As VMListItem";
 //BA.debugLineNum = 240;BA.debugLine="Dim el As VMLabel";
_el = new b4j.example.vmlabel();
 //BA.debugLineNum = 241;BA.debugLine="el.Initialize(vue,$\"${ID}lbl\"$).SetText(t)";
_el._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"lbl"))._settext /*b4j.example.vmlabel*/ (_t);
 //BA.debugLineNum = 242;BA.debugLine="el.Pop(ListItem)";
_el._pop /*String*/ (_listitem);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public String  _addmenuitem(String _sid,String _iconname,String _caption) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub AddMenuItem(sid As String, iconName As String,";
 //BA.debugLineNum = 34;BA.debugLine="menu.addicontext(sid, iconName, Caption)";
_menu._addicontext /*String*/ (_sid,_iconname,_caption);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _addnumberinput(String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
b4j.example.vmnumberinput _ni = null;
 //BA.debugLineNum = 179;BA.debugLine="Sub AddNumberInput(vmodel As String, Label As Stri";
 //BA.debugLineNum = 180;BA.debugLine="vue.SetStateSingle(vmodel, value)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_value));
 //BA.debugLineNum = 181;BA.debugLine="Dim ni As VMNumberInput";
_ni = new b4j.example.vmnumberinput();
 //BA.debugLineNum = 182;BA.debugLine="ni.initialize(vue,$\"${vmodel}ni\"$)";
_ni._initialize /*b4j.example.vmnumberinput*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ni"));
 //BA.debugLineNum = 183;BA.debugLine="ni.SetMin(minValue)";
_ni._setmin /*b4j.example.vmnumberinput*/ (BA.NumberToString(_minvalue));
 //BA.debugLineNum = 184;BA.debugLine="ni.SetMax(maxValue)";
_ni._setmax /*b4j.example.vmnumberinput*/ (BA.NumberToString(_maxvalue));
 //BA.debugLineNum = 185;BA.debugLine="ni.SetLabel(Label)";
_ni._setlabel /*b4j.example.vmnumberinput*/ (_label);
 //BA.debugLineNum = 186;BA.debugLine="ni.SetVModel(vmodel)";
_ni._setvmodel /*b4j.example.vmnumberinput*/ (_vmodel);
 //BA.debugLineNum = 187;BA.debugLine="ni.SetName(vmodel,False)";
_ni._setname /*b4j.example.vmnumberinput*/ ((Object)(_vmodel),__c.False);
 //BA.debugLineNum = 188;BA.debugLine="ni.SetSizeSmall";
_ni._setsizesmall /*b4j.example.vmnumberinput*/ ();
 //BA.debugLineNum = 189;BA.debugLine="ni.Pop(ListItem)";
_ni._pop /*String*/ (_listitem);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addradiogroup(String _vmodel,String _vtext,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
b4j.example.vmradiogroup _sel = null;
 //BA.debugLineNum = 204;BA.debugLine="Sub AddRadioGroup(vmodel As String, vText As Strin";
 //BA.debugLineNum = 205;BA.debugLine="Dim sel As VMRadioGroup";
_sel = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 206;BA.debugLine="sel.Initialize(vue,$\"${vmodel}rg\"$,vText,eventHan";
_sel._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"rg"),_vtext,_eventhandler);
 //BA.debugLineNum = 207;BA.debugLine="sel.SetVModel(vmodel)";
_sel._setvmodel /*b4j.example.vmradiogroup*/ (_vmodel);
 //BA.debugLineNum = 208;BA.debugLine="sel.SetOPtions(options)";
_sel._setoptions /*String*/ (_options);
 //BA.debugLineNum = 209;BA.debugLine="sel.Pop(ListItem)";
_sel._pop /*String*/ (_listitem);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addselect(String _vmodel,String _vtext,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
b4j.example.vmselect _sel = null;
 //BA.debugLineNum = 193;BA.debugLine="Sub AddSelect(vmodel As String, vText As String, s";
 //BA.debugLineNum = 194;BA.debugLine="Dim sel As VMSelect";
_sel = new b4j.example.vmselect();
 //BA.debugLineNum = 195;BA.debugLine="sel.Initialize(vue,$\"${vmodel}sel\"$,eventHandler)";
_sel._initialize /*b4j.example.vmselect*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"sel"),_eventhandler);
 //BA.debugLineNum = 196;BA.debugLine="sel.SetLabel(vText)";
_sel._setlabel /*b4j.example.vmselect*/ ((Object)(_vtext));
 //BA.debugLineNum = 197;BA.debugLine="sel.SetVModel(vmodel)";
_sel._setvmodel /*b4j.example.vmselect*/ (_vmodel);
 //BA.debugLineNum = 198;BA.debugLine="sel.SetOPtions(sourceName, options, sourcefield,";
_sel._setoptions /*String*/ (_sourcename,_options,_sourcefield,_displayfield);
 //BA.debugLineNum = 199;BA.debugLine="sel.SetDense(True)";
_sel._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 200;BA.debugLine="sel.Pop(ListItem)";
_sel._pop /*String*/ (_listitem);
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addslider(String _vmodel,String _label,int _minvalue,int _maxvalue,int _value,boolean _labelontop) throws Exception{
b4j.example.vmslider _slid = null;
 //BA.debugLineNum = 164;BA.debugLine="Sub AddSlider(vmodel As String, Label As String, m";
 //BA.debugLineNum = 165;BA.debugLine="vue.SetStateSingle(vmodel, value)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_value));
 //BA.debugLineNum = 166;BA.debugLine="Dim slid As VMSlider";
_slid = new b4j.example.vmslider();
 //BA.debugLineNum = 167;BA.debugLine="slid.initialize(vue,$\"${vmodel}sld\"$, eventHandle";
_slid._initialize /*b4j.example.vmslider*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"sld"),_eventhandler);
 //BA.debugLineNum = 168;BA.debugLine="slid.SetMin(minValue)";
_slid._setmin /*b4j.example.vmslider*/ (_minvalue);
 //BA.debugLineNum = 169;BA.debugLine="slid.SetMax(maxValue)";
_slid._setmax /*b4j.example.vmslider*/ (_maxvalue);
 //BA.debugLineNum = 170;BA.debugLine="slid.SetLabel(Label)";
_slid._setlabel /*b4j.example.vmslider*/ ((Object)(_label));
 //BA.debugLineNum = 171;BA.debugLine="slid.SetThumbLabel(False)";
_slid._setthumblabel /*b4j.example.vmslider*/ (__c.False);
 //BA.debugLineNum = 172;BA.debugLine="slid.SetVModel(vmodel)";
_slid._setvmodel /*b4j.example.vmslider*/ (_vmodel);
 //BA.debugLineNum = 173;BA.debugLine="slid.SetName(vmodel,False)";
_slid._setname /*b4j.example.vmslider*/ ((Object)(_vmodel),__c.False);
 //BA.debugLineNum = 174;BA.debugLine="slid.SetLabelOnTop(labelOnTop)";
_slid._setlabelontop /*b4j.example.vmslider*/ (_labelontop);
 //BA.debugLineNum = 175;BA.debugLine="slid.Pop(ListItem)";
_slid._pop /*String*/ (_listitem);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addtextarea(String _vmodel,String _vtext,String _vvalue) throws Exception{
b4j.example.vmtextarea _input = null;
 //BA.debugLineNum = 256;BA.debugLine="Sub AddTextArea(vModel As String, vText As String,";
 //BA.debugLineNum = 257;BA.debugLine="vue.SetStateSingle(vModel, vValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_vvalue));
 //BA.debugLineNum = 258;BA.debugLine="Dim input As VMTextArea";
_input = new b4j.example.vmtextarea();
 //BA.debugLineNum = 259;BA.debugLine="input.Initialize(vue,$\"${vModel}ta\"$, eventHandle";
_input._initialize /*b4j.example.vmtextarea*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ta"),_eventhandler);
 //BA.debugLineNum = 260;BA.debugLine="input.SetLabel(vText)";
_input._setlabel /*b4j.example.vmtextarea*/ (_vtext);
 //BA.debugLineNum = 261;BA.debugLine="input.SetVModel(vModel)";
_input._setvmodel /*b4j.example.vmtextarea*/ (_vmodel);
 //BA.debugLineNum = 262;BA.debugLine="input.SetName(vModel,False)";
_input._setname /*b4j.example.vmtextarea*/ ((Object)(_vmodel),__c.False);
 //BA.debugLineNum = 263;BA.debugLine="input.Pop(ListItem)";
_input._pop /*String*/ (_listitem);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ListItem As VMElement";
_listitem = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private txt As VMElement";
_txt = new b4j.example.vmelement();
 //BA.debugLineNum = 7;BA.debugLine="Private hasText As Boolean";
_hastext = false;
 //BA.debugLineNum = 8;BA.debugLine="Private hasAction As Boolean";
_hasaction = false;
 //BA.debugLineNum = 9;BA.debugLine="Private btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 10;BA.debugLine="Private hasIcon As Boolean";
_hasicon = false;
 //BA.debugLineNum = 11;BA.debugLine="Private icn As VMIcon";
_icn = new b4j.example.vmicon();
 //BA.debugLineNum = 12;BA.debugLine="Private hasAvatar As Boolean";
_hasavatar = false;
 //BA.debugLineNum = 13;BA.debugLine="Private avatar As VMAvatar";
_avatar = new b4j.example.vmavatar();
 //BA.debugLineNum = 14;BA.debugLine="Private hasSwitch As Boolean";
_hasswitch = false;
 //BA.debugLineNum = 15;BA.debugLine="Private switch As VMSwitch";
_switch = new b4j.example.vmswitch();
 //BA.debugLineNum = 16;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
 //BA.debugLineNum = 17;BA.debugLine="Private badge As VMBadge";
_badge = new b4j.example.vmbadge();
 //BA.debugLineNum = 18;BA.debugLine="Public childList As VMList";
_childlist = new b4j.example.vmlist();
 //BA.debugLineNum = 19;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 20;BA.debugLine="Private span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 21;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 22;BA.debugLine="Private hasMenu As Boolean";
_hasmenu = false;
 //BA.debugLineNum = 23;BA.debugLine="Private menu As VMMenu";
_menu = new b4j.example.vmmenu();
 //BA.debugLineNum = 24;BA.debugLine="Private syncid As String";
_syncid = "";
 //BA.debugLineNum = 25;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _module) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 52;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 53;BA.debugLine="syncid = $\"${ID}sync\"$";
_syncid = (""+__c.SmartStringFormatter("",(Object)(_id))+"sync");
 //BA.debugLineNum = 54;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 55;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 56;BA.debugLine="ListItem.Initialize(vue, ID).SetTag(\"md-list-item";
_listitem._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-list-item");
 //BA.debugLineNum = 57;BA.debugLine="hasText = False";
_hastext = __c.False;
 //BA.debugLineNum = 58;BA.debugLine="txt.Initialize(vue,$\"${ID}text\"$).SetTag(\"div\").A";
_txt._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"text"))._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("md-list-item-text");
 //BA.debugLineNum = 59;BA.debugLine="hasAction = False";
_hasaction = __c.False;
 //BA.debugLineNum = 60;BA.debugLine="btn.Initialize(vue,$\"${ID}button\"$,module).SetIco";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"button"),_module)._seticonbutton /*b4j.example.vmbutton*/ (__c.True)._setlistaction /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 61;BA.debugLine="hasMenu = False";
_hasmenu = __c.False;
 //BA.debugLineNum = 62;BA.debugLine="menu.Initialize(vue,$\"${ID}menu\"$,module).AddClas";
_menu._initialize /*b4j.example.vmmenu*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"menu"),_module)._addclass /*b4j.example.vmmenu*/ ("md-list-action")._setcloseonclick /*b4j.example.vmmenu*/ (__c.True)._setcloseonselect /*b4j.example.vmmenu*/ (__c.True);
 //BA.debugLineNum = 63;BA.debugLine="menu.SetAlignTrigger(True).SetSizeAuto(True)";
_menu._setaligntrigger /*b4j.example.vmmenu*/ ((Object)(__c.True))._setsizeauto /*b4j.example.vmmenu*/ (__c.True);
 //BA.debugLineNum = 64;BA.debugLine="hasIcon = False";
_hasicon = __c.False;
 //BA.debugLineNum = 65;BA.debugLine="icn.Initialize(vue, $\"${ID}icon\"$)";
_icn._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"));
 //BA.debugLineNum = 66;BA.debugLine="hasAvatar = False";
_hasavatar = __c.False;
 //BA.debugLineNum = 67;BA.debugLine="avatar.Initialize(vue, $\"${ID}avatar\"$,module)";
_avatar._initialize /*b4j.example.vmavatar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"avatar"),_module);
 //BA.debugLineNum = 68;BA.debugLine="hasSwitch = False";
_hasswitch = __c.False;
 //BA.debugLineNum = 69;BA.debugLine="switch.Initialize(vue, $\"${ID}switch\"$,module)";
_switch._initialize /*b4j.example.vmswitch*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"switch"),_module);
 //BA.debugLineNum = 70;BA.debugLine="hasBadge = False";
_hasbadge = __c.False;
 //BA.debugLineNum = 71;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
_badge._initialize /*b4j.example.vmbadge*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"badge"));
 //BA.debugLineNum = 72;BA.debugLine="childList.Initialize(vue, $\"${ID}children\"$, even";
_childlist._initialize /*b4j.example.vmlist*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"children"),_eventhandler);
 //BA.debugLineNum = 73;BA.debugLine="span.Initialize(vue,$\"${ID}span\"$).SetTag(\"span\")";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"span"))._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 74;BA.debugLine="vue.SetStateSingle(syncid, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_syncid,(Object)(__c.False));
 //BA.debugLineNum = 75;BA.debugLine="ListItem.SetOnClick(eventHandler, $\"${ID}_click\"$";
_listitem._setonclick /*b4j.example.vmelement*/ (_eventhandler,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmlist _p) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub Pop(p As VMList)";
 //BA.debugLineNum = 434;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmlist*/ (_tostring());
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _setactionicon(String _icon) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetActionIcon(icon As String) As VMListItem";
 //BA.debugLineNum = 344;BA.debugLine="btn.SetIcon(icon)";
_btn._seticon /*b4j.example.vmbutton*/ (_icon);
 //BA.debugLineNum = 345;BA.debugLine="hasAction = True";
_hasaction = __c.True;
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetAttr(attr As Map) As VMListItem";
 //BA.debugLineNum = 131;BA.debugLine="ListItem.SetAttr(attr)";
_listitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setavatar(String _img) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetAvatar(img As String) As VMListItem";
 //BA.debugLineNum = 136;BA.debugLine="avatar.SetID(ID)";
_avatar._setid /*b4j.example.vmavatar*/ (_id);
 //BA.debugLineNum = 137;BA.debugLine="avatar.SetValue(img)";
_avatar._setvalue /*b4j.example.vmavatar*/ (_img);
 //BA.debugLineNum = 138;BA.debugLine="hasAvatar = True";
_hasavatar = __c.True;
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setbadge(int _content,boolean _bprimary,String _position,boolean _bdense,boolean _bsquare) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetBadge(content As Int, bPrimary As Boolean,";
 //BA.debugLineNum = 304;BA.debugLine="badge.SetContent(content).SetPosition(position).S";
_badge._setcontent /*b4j.example.vmbadge*/ (_content)._setposition /*b4j.example.vmbadge*/ ((Object)(_position))._setdense /*b4j.example.vmbadge*/ (_bdense)._setsquare /*b4j.example.vmbadge*/ (_bsquare);
 //BA.debugLineNum = 305;BA.debugLine="badge.SetPrimary(bPrimary)";
_badge._setprimary /*b4j.example.vmbadge*/ (_bprimary);
 //BA.debugLineNum = 306;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public String  _setdata(anywheresoftware.b4a.objects.collections.List _recs) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetData(recs As List)";
 //BA.debugLineNum = 80;BA.debugLine="data = recs";
_data = _recs;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _setdescription(String _t) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetDescription(t As String) As VMListItem";
 //BA.debugLineNum = 328;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 329;BA.debugLine="span.Initialize(vue,$\"${ID}desc\"$).SetTag(\"span\")";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"desc"))._settag /*b4j.example.vmelement*/ ("span")._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 330;BA.debugLine="span.Pop(txt)";
_span._pop /*String*/ (_txt);
 //BA.debugLineNum = 331;BA.debugLine="hasText = True";
_hastext = __c.True;
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetElevation(e As Int) As VMListItem";
 //BA.debugLineNum = 29;BA.debugLine="ListItem.SetElevation(e)";
_listitem._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setexpand(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetExpand(b As Boolean) As VMListItem";
 //BA.debugLineNum = 97;BA.debugLine="ListItem.SetAttr(CreateMap(\":md-expand\": b))";
_listitem._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-expand"),(Object)(_b)}));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setexpanded(String _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetExpanded(b As String) As VMListItem";
 //BA.debugLineNum = 102;BA.debugLine="b = b.tolowercase";
_b = _b.toLowerCase();
 //BA.debugLineNum = 103;BA.debugLine="If vue.HasState(b) = False Then";
if (_vue._hasstate /*boolean*/ (_b)==__c.False) { 
 //BA.debugLineNum = 104;BA.debugLine="Log($\"VMListItem.SetExpanded: '${b}' default sta";
__c.Log(("VMListItem.SetExpanded: '"+__c.SmartStringFormatter("",(Object)(_b))+"' default state should be set!"));
 };
 //BA.debugLineNum = 106;BA.debugLine="ListItem.SetAttr(CreateMap(\":md-expanded.sync\": b";
_listitem._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-expanded.sync"),(Object)(_b)}));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _sethref(Object _h) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetHREF(h As Object) As VMListItem";
 //BA.debugLineNum = 355;BA.debugLine="ListItem.SetHREF(h)";
_listitem._sethref /*b4j.example.vmelement*/ (BA.ObjectToString(_h));
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _seticon(String _icon,boolean _primary) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetIcon(icon As String, primary As Boolean) As";
 //BA.debugLineNum = 111;BA.debugLine="If icon = \"\" Then Return Me";
if ((_icon).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
 //BA.debugLineNum = 112;BA.debugLine="icn.SetText(icon)";
_icn._settext /*b4j.example.vmicon*/ (_icon);
 //BA.debugLineNum = 113;BA.debugLine="If primary Then icn.SetPrimary(primary)";
if (_primary) { 
_icn._setprimary /*b4j.example.vmicon*/ (_primary);};
 //BA.debugLineNum = 114;BA.debugLine="hasIcon = True";
_hasicon = __c.True;
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setid(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub SetID(k As String, bind As Boolean) As VMListI";
 //BA.debugLineNum = 368;BA.debugLine="ListItem.SetID(k, bind)";
_listitem._setid /*b4j.example.vmelement*/ (_k,_bind);
 //BA.debugLineNum = 369;BA.debugLine="txt.SetID(k,bind)";
_txt._setid /*b4j.example.vmelement*/ (_k,_bind);
 //BA.debugLineNum = 370;BA.debugLine="span.SetID(k,bind)";
_span._setid /*b4j.example.vmelement*/ (_k,_bind);
 //BA.debugLineNum = 371;BA.debugLine="btn.setid(k,bind)";
_btn._setid /*b4j.example.vmbutton*/ (_k,_bind);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setinset(boolean _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetInset(b As Boolean) As VMListItem";
 //BA.debugLineNum = 92;BA.debugLine="If b Then AddClass(\"md-inset\")";
if (_b) { 
_addclass("md-inset");};
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMList";
 //BA.debugLineNum = 376;BA.debugLine="ListItem.SetKey(k, bind)";
_listitem._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 377;BA.debugLine="txt.SetKey(k,bind)";
_txt._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 378;BA.debugLine="span.SetKey(k,bind)";
_span._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 379;BA.debugLine="btn.setkey(k,bind)";
_btn._setkey /*b4j.example.vmbutton*/ (_k,_bind);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setlist(b4j.example.vmlist _lst) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetList(lst As VMList) As VMListItem";
 //BA.debugLineNum = 84;BA.debugLine="SetExpand(True)";
_setexpand(__c.True);
 //BA.debugLineNum = 85;BA.debugLine="SetExpanded(syncid)";
_setexpanded(_syncid);
 //BA.debugLineNum = 86;BA.debugLine="lst.SetSlotExpand(True)";
_lst._setslotexpand /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 87;BA.debugLine="lst.Pop(ListItem)";
_lst._pop /*String*/ (_listitem);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setmenuicon(String _menuicon) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetMenuIcon(menuIcon As String) As VMListItem";
 //BA.debugLineNum = 46;BA.debugLine="hasMenu = True";
_hasmenu = __c.True;
 //BA.debugLineNum = 47;BA.debugLine="menu.SetIcon(menuIcon)";
_menu._seticon /*b4j.example.vmmenu*/ (_menuicon);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setname(Object _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetName(k As Object, bind As Boolean) As VMLis";
 //BA.debugLineNum = 360;BA.debugLine="ListItem.SetName(k, bind)";
_listitem._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_k),_bind);
 //BA.debugLineNum = 361;BA.debugLine="txt.SetName(k,bind)";
_txt._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_k),_bind);
 //BA.debugLineNum = 362;BA.debugLine="span.SetName(k,bind)";
_span._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_k),_bind);
 //BA.debugLineNum = 363;BA.debugLine="btn.setname(k,bind)";
_btn._setname /*b4j.example.vmbutton*/ (BA.ObjectToString(_k),_bind);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setradio(String _vmodel,String _vvalue,String _vtext,boolean _bprimary,boolean _bdesignmode) throws Exception{
b4j.example.vmradio _cb = null;
 //BA.debugLineNum = 294;BA.debugLine="Sub SetRadio(vmodel As String, vValue As String, v";
 //BA.debugLineNum = 295;BA.debugLine="Dim cb As VMRadio";
_cb = new b4j.example.vmradio();
 //BA.debugLineNum = 296;BA.debugLine="cb.Initialize(vue, $\"${vmodel}rd\"$,eventHandler).";
_cb._initialize /*b4j.example.vmradio*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"rd"),_eventhandler)._setvalue /*b4j.example.vmradio*/ ((Object)(_vvalue),__c.False)._setname /*b4j.example.vmradio*/ ((Object)(_vmodel),__c.False)._setprimary /*b4j.example.vmradio*/ (_bprimary);
 //BA.debugLineNum = 297;BA.debugLine="If bDesignMode = False Then cb.SetVModel(vmodel)";
if (_bdesignmode==__c.False) { 
_cb._setvmodel /*b4j.example.vmradio*/ (_vmodel);};
 //BA.debugLineNum = 298;BA.debugLine="cb.Pop(ListItem)";
_cb._pop /*String*/ (_listitem);
 //BA.debugLineNum = 299;BA.debugLine="SetText(vText)";
_settext(_vtext);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetStyle(m As Map) As VMListItem";
 //BA.debugLineNum = 125;BA.debugLine="ListItem.SetStyle(m)";
_listitem._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setswitch(String _vmodel,String _text,boolean _bprimary,boolean _bvalue) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetSwitch(vmodel As String, text As String,bPr";
 //BA.debugLineNum = 312;BA.debugLine="vue.SetStateSingle(vmodel, bValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_bvalue));
 //BA.debugLineNum = 313;BA.debugLine="SetText(text)";
_settext(_text);
 //BA.debugLineNum = 314;BA.debugLine="hasSwitch = True";
_hasswitch = __c.True;
 //BA.debugLineNum = 315;BA.debugLine="switch.SetVModel(vmodel).SetPrimary(bPrimary)";
_switch._setvmodel /*b4j.example.vmswitch*/ (_vmodel)._setprimary /*b4j.example.vmswitch*/ (_bprimary);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settargetblank(boolean _b) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub SetTargetBlank(b As Boolean) As VMListItem   '";
 //BA.debugLineNum = 384;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_blank\")";
_listitem._element /*b4j.example.vuehtml*/ ._setattrtarget /*b4j.example.vuehtml*/ ("_blank");
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settargetparent(boolean _b) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub SetTargetParent(b As Boolean) As VMListItem";
 //BA.debugLineNum = 394;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_parent\")";
_listitem._element /*b4j.example.vuehtml*/ ._setattrtarget /*b4j.example.vuehtml*/ ("_parent");
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settargetself(boolean _b) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub SetTargetSelf(b As Boolean) As VMListItem    '";
 //BA.debugLineNum = 389;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_self\")";
_listitem._element /*b4j.example.vuehtml*/ ._setattrtarget /*b4j.example.vuehtml*/ ("_self");
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settargettop(boolean _b) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub SetTargetTop(b As Boolean) As VMListItem    'i";
 //BA.debugLineNum = 399;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_top\")";
_listitem._element /*b4j.example.vuehtml*/ ._setattrtarget /*b4j.example.vuehtml*/ ("_top");
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settext(String _t) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetText(t As String) As VMListItem";
 //BA.debugLineNum = 320;BA.debugLine="span.SetText(t)";
_span._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 321;BA.debugLine="span.Pop(txt)";
_span._pop /*String*/ (_txt);
 //BA.debugLineNum = 322;BA.debugLine="hasText = True";
_hastext = __c.True;
 //BA.debugLineNum = 323;BA.debugLine="avatar.SetAlt(t)";
_avatar._setalt /*b4j.example.vmavatar*/ (_t);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setthirdline(String _t) throws Exception{
b4j.example.vmelement _p = null;
 //BA.debugLineNum = 335;BA.debugLine="Sub SetThirdLine(t As String) As VMListItem";
 //BA.debugLineNum = 336;BA.debugLine="Dim p As VMElement";
_p = new b4j.example.vmelement();
 //BA.debugLineNum = 337;BA.debugLine="p.Initialize(vue,$\"${ID}third\"$).SetTag(\"p\").SetT";
_p._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"third"))._settag /*b4j.example.vmelement*/ ("p")._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 338;BA.debugLine="p.Pop(txt)";
_p._pop /*String*/ (_txt);
 //BA.debugLineNum = 339;BA.debugLine="hasText = True";
_hastext = __c.True;
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setto(Object _t) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetTo(t As Object) As VMListItem";
 //BA.debugLineNum = 350;BA.debugLine="ListItem.SetTo(t)";
_listitem._setto /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setvfor(String _item,String _datasource) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 404;BA.debugLine="ListItem.SetVFor(item, dataSource)";
_listitem._setvfor /*b4j.example.vmelement*/ (_item,_datasource);
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 409;BA.debugLine="If hasIcon Then";
if (_hasicon) { 
 //BA.debugLineNum = 410;BA.debugLine="icn.Pop(ListItem)";
_icn._pop /*String*/ (_listitem);
 };
 //BA.debugLineNum = 412;BA.debugLine="If hasAvatar Then";
if (_hasavatar) { 
 //BA.debugLineNum = 413;BA.debugLine="avatar.Pop(ListItem)";
_avatar._pop /*String*/ (_listitem);
 };
 //BA.debugLineNum = 415;BA.debugLine="If hasText Then";
if (_hastext) { 
 //BA.debugLineNum = 416;BA.debugLine="txt.Pop(ListItem)";
_txt._pop /*String*/ (_listitem);
 };
 //BA.debugLineNum = 418;BA.debugLine="If hasAction Then";
if (_hasaction) { 
 //BA.debugLineNum = 419;BA.debugLine="btn.Pop(ListItem)";
_btn._pop /*String*/ (_listitem);
 };
 //BA.debugLineNum = 421;BA.debugLine="If hasMenu Then";
if (_hasmenu) { 
 //BA.debugLineNum = 422;BA.debugLine="menu.Pop(ListItem)";
_menu._pop /*String*/ (_listitem);
 };
 //BA.debugLineNum = 424;BA.debugLine="If hasSwitch Then";
if (_hasswitch) { 
 //BA.debugLineNum = 425;BA.debugLine="switch.Pop(ListItem)";
_switch._pop /*String*/ (_listitem);
 };
 //BA.debugLineNum = 427;BA.debugLine="If hasBadge Then";
if (_hasbadge) { 
 //BA.debugLineNum = 428;BA.debugLine="badge.Pop(ListItem)";
_badge._pop /*String*/ (_listitem);
 };
 //BA.debugLineNum = 430;BA.debugLine="Return ListItem.ToString";
if (true) return _listitem._tostring /*String*/ ();
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
