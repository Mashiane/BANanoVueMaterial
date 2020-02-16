package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vminputcontrol extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vminputcontrol", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vminputcontrol.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _name = "";
public String _label = "";
public String _typeof = "";
public String _helpertext = "";
public String _errortext = "";
public boolean _required = false;
public boolean _clearable = false;
public String _sourcetable = "";
public String _sourcefield = "";
public String _displayfield = "";
public String _fieldtype = "";
public boolean _isvisible = false;
public Object _defaultvalue = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public int _minvalue = 0;
public int _maxvalue = 0;
public Object _module = null;
public String _methodname = "";
public String _iconname = "";
public boolean _isprimary = false;
public boolean _isaccent = false;
public boolean _isdisabled = false;
public String _text = "";
public String _description = "";
public String _thirdline = "";
public int _lines = 0;
public String _key = "";
public String _source = "";
public String _actionicon = "";
public String _menuicon = "";
public boolean _menuclick = false;
public boolean _addedit = false;
public String _editmethod = "";
public String _deletemethod = "";
public String _editcaption = "";
public String _deletecaption = "";
public String _row = "";
public String _cell = "";
public String _offsetsmall = "";
public String _offsetmedium = "";
public String _offsetlarge = "";
public String _offsetxlarge = "";
public String _sizesmall = "";
public String _sizemedium = "";
public String _sizelarge = "";
public String _sizexlarge = "";
public String _visibility = "";
public boolean _useoptions = false;
public boolean _multiple = false;
public Object _margintop = null;
public Object _marginbottom = null;
public Object _marginleft = null;
public Object _marginright = null;
public Object _paddingtop = null;
public Object _paddingbottom = null;
public Object _paddingleft = null;
public Object _paddingright = null;
public anywheresoftware.b4a.objects.collections.List _optionslist = null;
public Object _maxlength = null;
public int _tabindex = 0;
public boolean _autogrow = false;
public boolean _openonfocus = false;
public boolean _immediately = false;
public String _placeholder = "";
public boolean _thumblabel = false;
public boolean _dense = false;
public String _iconsize = "";
public boolean _raised = false;
public boolean _ripple = false;
public boolean _fitwidth = false;
public String _href = "";
public boolean _menutrigger = false;
public boolean _iconbutton = false;
public boolean _plain = false;
public boolean _mini = false;
public boolean _fab = false;
public boolean _listaction = false;
public String _buttontype = "";
public String _navigateto = "";
public String _fabposition = "";
public boolean _fabfixed = false;
public String _tag = "";
public String _width = "";
public String _height = "";
public boolean _isround = false;
public String _alt = "";
public String _count = "";
public String _start = "";
public String _finish = "";
public String _speed = "";
public String _refreshinterval = "";
public String _boxtype = "";
public String _iconcolor = "";
public String _iconbackgroundcolor = "";
public boolean _hoverzoomeffect = false;
public boolean _hoverexpandeffect = false;
public boolean _bsetcounter = false;
public boolean _clickable = false;
public boolean _deletable = false;
public String _thelimit = "";
public boolean _checkduplicates = false;
public String _inputtype = "";
public boolean _static = false;
public boolean _footer = false;
public String _format = "";
public String _locale = "";
public boolean _modal = false;
public String _size = "";
public String _value = "";
public boolean _showothermonths = false;
public boolean _calendarweeks = false;
public boolean _header = false;
public String _mode = "";
public boolean _readonly = false;
public boolean _usedatasource = false;
public boolean _togglepassword = false;
public boolean _exclude = false;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String";
_name = "";
 //BA.debugLineNum = 4;BA.debugLine="Public label As String";
_label = "";
 //BA.debugLineNum = 5;BA.debugLine="Public typeOf As String";
_typeof = "";
 //BA.debugLineNum = 6;BA.debugLine="Public helperText As String";
_helpertext = "";
 //BA.debugLineNum = 7;BA.debugLine="Public errorText As String";
_errortext = "";
 //BA.debugLineNum = 8;BA.debugLine="Public Required As Boolean";
_required = false;
 //BA.debugLineNum = 9;BA.debugLine="Public clearable As Boolean";
_clearable = false;
 //BA.debugLineNum = 10;BA.debugLine="Public sourceTable As String";
_sourcetable = "";
 //BA.debugLineNum = 11;BA.debugLine="Public sourceField As String";
_sourcefield = "";
 //BA.debugLineNum = 12;BA.debugLine="Public displayField As String";
_displayfield = "";
 //BA.debugLineNum = 13;BA.debugLine="Public fieldType As String";
_fieldtype = "";
 //BA.debugLineNum = 14;BA.debugLine="Public Isvisible As Boolean";
_isvisible = false;
 //BA.debugLineNum = 15;BA.debugLine="Public defaultValue As Object";
_defaultvalue = new Object();
 //BA.debugLineNum = 16;BA.debugLine="Public options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Public MinValue As Int";
_minvalue = 0;
 //BA.debugLineNum = 18;BA.debugLine="Public MaxValue As Int";
_maxvalue = 0;
 //BA.debugLineNum = 19;BA.debugLine="Public module As Object";
_module = new Object();
 //BA.debugLineNum = 20;BA.debugLine="Public methodName As String";
_methodname = "";
 //BA.debugLineNum = 21;BA.debugLine="Public IconName As String";
_iconname = "";
 //BA.debugLineNum = 22;BA.debugLine="Public IsPrimary As Boolean";
_isprimary = false;
 //BA.debugLineNum = 23;BA.debugLine="Public IsAccent As Boolean";
_isaccent = false;
 //BA.debugLineNum = 24;BA.debugLine="Public IsDisabled As Boolean";
_isdisabled = false;
 //BA.debugLineNum = 25;BA.debugLine="Public Text As String";
_text = "";
 //BA.debugLineNum = 26;BA.debugLine="Public Description As String";
_description = "";
 //BA.debugLineNum = 27;BA.debugLine="Public ThirdLine As String";
_thirdline = "";
 //BA.debugLineNum = 28;BA.debugLine="Public Lines As Int";
_lines = 0;
 //BA.debugLineNum = 29;BA.debugLine="Public Key As String";
_key = "";
 //BA.debugLineNum = 30;BA.debugLine="Public Source As String";
_source = "";
 //BA.debugLineNum = 31;BA.debugLine="Public ActionIcon As String";
_actionicon = "";
 //BA.debugLineNum = 32;BA.debugLine="Public MenuIcon As String";
_menuicon = "";
 //BA.debugLineNum = 33;BA.debugLine="Public MenuClick As Boolean";
_menuclick = false;
 //BA.debugLineNum = 34;BA.debugLine="Public AddEdit As Boolean";
_addedit = false;
 //BA.debugLineNum = 35;BA.debugLine="Public EditMethod As String";
_editmethod = "";
 //BA.debugLineNum = 36;BA.debugLine="Public DeleteMethod As String";
_deletemethod = "";
 //BA.debugLineNum = 37;BA.debugLine="Public EditCaption As String";
_editcaption = "";
 //BA.debugLineNum = 38;BA.debugLine="Public DeleteCaption As String";
_deletecaption = "";
 //BA.debugLineNum = 39;BA.debugLine="Public Row As String";
_row = "";
 //BA.debugLineNum = 40;BA.debugLine="Public cell As String";
_cell = "";
 //BA.debugLineNum = 41;BA.debugLine="Public OffsetSmall As String";
_offsetsmall = "";
 //BA.debugLineNum = 42;BA.debugLine="Public OffsetMedium As String";
_offsetmedium = "";
 //BA.debugLineNum = 43;BA.debugLine="Public OffsetLarge As String";
_offsetlarge = "";
 //BA.debugLineNum = 44;BA.debugLine="Public OffsetXLarge As String";
_offsetxlarge = "";
 //BA.debugLineNum = 45;BA.debugLine="Public SizeSmall As String";
_sizesmall = "";
 //BA.debugLineNum = 46;BA.debugLine="Public SizeMedium As String";
_sizemedium = "";
 //BA.debugLineNum = 47;BA.debugLine="Public SizeLarge As String";
_sizelarge = "";
 //BA.debugLineNum = 48;BA.debugLine="Public SizeXLarge As String";
_sizexlarge = "";
 //BA.debugLineNum = 49;BA.debugLine="Public Visibility As String";
_visibility = "";
 //BA.debugLineNum = 50;BA.debugLine="Public UseOptions As Boolean";
_useoptions = false;
 //BA.debugLineNum = 51;BA.debugLine="Public multiple As Boolean";
_multiple = false;
 //BA.debugLineNum = 52;BA.debugLine="Public MarginTop As Object";
_margintop = new Object();
 //BA.debugLineNum = 53;BA.debugLine="Public MarginBottom As Object";
_marginbottom = new Object();
 //BA.debugLineNum = 54;BA.debugLine="Public MarginLeft As Object";
_marginleft = new Object();
 //BA.debugLineNum = 55;BA.debugLine="Public MarginRight As Object";
_marginright = new Object();
 //BA.debugLineNum = 56;BA.debugLine="Public PaddingTop As Object";
_paddingtop = new Object();
 //BA.debugLineNum = 57;BA.debugLine="Public PaddingBottom As Object";
_paddingbottom = new Object();
 //BA.debugLineNum = 58;BA.debugLine="Public PaddingLeft As Object";
_paddingleft = new Object();
 //BA.debugLineNum = 59;BA.debugLine="Public PaddingRight As Object";
_paddingright = new Object();
 //BA.debugLineNum = 60;BA.debugLine="Public OptionsList As List";
_optionslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 61;BA.debugLine="Public MaxLength As Object";
_maxlength = new Object();
 //BA.debugLineNum = 62;BA.debugLine="Public TabIndex As Int";
_tabindex = 0;
 //BA.debugLineNum = 63;BA.debugLine="Public AutoGrow As Boolean";
_autogrow = false;
 //BA.debugLineNum = 64;BA.debugLine="Public openonfocus As Boolean";
_openonfocus = false;
 //BA.debugLineNum = 65;BA.debugLine="Public immediately As Boolean";
_immediately = false;
 //BA.debugLineNum = 66;BA.debugLine="Public PlaceHolder As String";
_placeholder = "";
 //BA.debugLineNum = 67;BA.debugLine="Public ThumbLabel As Boolean";
_thumblabel = false;
 //BA.debugLineNum = 68;BA.debugLine="Public Dense As Boolean";
_dense = false;
 //BA.debugLineNum = 69;BA.debugLine="Public IconSize As String";
_iconsize = "";
 //BA.debugLineNum = 70;BA.debugLine="Public Raised As Boolean";
_raised = false;
 //BA.debugLineNum = 71;BA.debugLine="Public Ripple As Boolean";
_ripple = false;
 //BA.debugLineNum = 72;BA.debugLine="Public FitWidth As Boolean";
_fitwidth = false;
 //BA.debugLineNum = 73;BA.debugLine="Public href As String";
_href = "";
 //BA.debugLineNum = 74;BA.debugLine="Public MenuTrigger As Boolean";
_menutrigger = false;
 //BA.debugLineNum = 75;BA.debugLine="Public IconButton As Boolean";
_iconbutton = false;
 //BA.debugLineNum = 76;BA.debugLine="Public Plain As Boolean";
_plain = false;
 //BA.debugLineNum = 77;BA.debugLine="Public Mini As Boolean";
_mini = false;
 //BA.debugLineNum = 78;BA.debugLine="Public Fab As Boolean";
_fab = false;
 //BA.debugLineNum = 79;BA.debugLine="Public ListAction As Boolean";
_listaction = false;
 //BA.debugLineNum = 80;BA.debugLine="Public ButtonType As String";
_buttontype = "";
 //BA.debugLineNum = 81;BA.debugLine="Public NavigateTo As String";
_navigateto = "";
 //BA.debugLineNum = 82;BA.debugLine="Public FabPosition As String";
_fabposition = "";
 //BA.debugLineNum = 83;BA.debugLine="Public FabFixed As Boolean";
_fabfixed = false;
 //BA.debugLineNum = 84;BA.debugLine="Public Tag As String";
_tag = "";
 //BA.debugLineNum = 85;BA.debugLine="Public Width As String";
_width = "";
 //BA.debugLineNum = 86;BA.debugLine="Public Height As String";
_height = "";
 //BA.debugLineNum = 87;BA.debugLine="Public IsRound As Boolean";
_isround = false;
 //BA.debugLineNum = 88;BA.debugLine="Public Alt As String";
_alt = "";
 //BA.debugLineNum = 89;BA.debugLine="Public Count As String";
_count = "";
 //BA.debugLineNum = 90;BA.debugLine="Public Start As String";
_start = "";
 //BA.debugLineNum = 91;BA.debugLine="Public Finish As String";
_finish = "";
 //BA.debugLineNum = 92;BA.debugLine="Public Speed As String";
_speed = "";
 //BA.debugLineNum = 93;BA.debugLine="Public RefreshInterval As String";
_refreshinterval = "";
 //BA.debugLineNum = 94;BA.debugLine="Public BoxType As String";
_boxtype = "";
 //BA.debugLineNum = 95;BA.debugLine="Public IconColor As String";
_iconcolor = "";
 //BA.debugLineNum = 96;BA.debugLine="Public IconBackgroundColor As String";
_iconbackgroundcolor = "";
 //BA.debugLineNum = 97;BA.debugLine="Public HoverZoomEffect As Boolean";
_hoverzoomeffect = false;
 //BA.debugLineNum = 98;BA.debugLine="Public HoverExpandEffect As Boolean";
_hoverexpandeffect = false;
 //BA.debugLineNum = 99;BA.debugLine="Public bSetCounter As Boolean";
_bsetcounter = false;
 //BA.debugLineNum = 100;BA.debugLine="Public Clickable As Boolean";
_clickable = false;
 //BA.debugLineNum = 101;BA.debugLine="Public Deletable As Boolean";
_deletable = false;
 //BA.debugLineNum = 102;BA.debugLine="Public TheLimit As String";
_thelimit = "";
 //BA.debugLineNum = 103;BA.debugLine="Public CheckDuplicates As Boolean";
_checkduplicates = false;
 //BA.debugLineNum = 104;BA.debugLine="Public InputType As String";
_inputtype = "";
 //BA.debugLineNum = 105;BA.debugLine="Public Static As Boolean";
_static = false;
 //BA.debugLineNum = 107;BA.debugLine="Public Footer As Boolean";
_footer = false;
 //BA.debugLineNum = 108;BA.debugLine="Public Format As String";
_format = "";
 //BA.debugLineNum = 109;BA.debugLine="Public Locale As String";
_locale = "";
 //BA.debugLineNum = 110;BA.debugLine="Public Modal As Boolean";
_modal = false;
 //BA.debugLineNum = 111;BA.debugLine="Public Size As String";
_size = "";
 //BA.debugLineNum = 112;BA.debugLine="Public Value As String";
_value = "";
 //BA.debugLineNum = 113;BA.debugLine="Public ShowOtherMonths As Boolean";
_showothermonths = false;
 //BA.debugLineNum = 114;BA.debugLine="Public CalendarWeeks As Boolean";
_calendarweeks = false;
 //BA.debugLineNum = 115;BA.debugLine="Public Header As Boolean";
_header = false;
 //BA.debugLineNum = 116;BA.debugLine="Public Mode As String";
_mode = "";
 //BA.debugLineNum = 117;BA.debugLine="Public readonly As Boolean";
_readonly = false;
 //BA.debugLineNum = 118;BA.debugLine="Public UseDataSource As Boolean";
_usedatasource = false;
 //BA.debugLineNum = 119;BA.debugLine="Public TogglePassword As Boolean";
_togglepassword = false;
 //BA.debugLineNum = 120;BA.debugLine="Public Exclude As Boolean";
_exclude = false;
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminputcontrol  _initialize(anywheresoftware.b4a.BA _ba,String _sname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 179;BA.debugLine="Public Sub Initialize(sName As String) As VMInputC";
 //BA.debugLineNum = 180;BA.debugLine="sName = sName.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 181;BA.debugLine="sName = sName.trim";
_sname = _sname.trim();
 //BA.debugLineNum = 182;BA.debugLine="name = sName";
_name = _sname;
 //BA.debugLineNum = 183;BA.debugLine="href = \"\"";
_href = "";
 //BA.debugLineNum = 184;BA.debugLine="TogglePassword = False";
_togglepassword = __c.False;
 //BA.debugLineNum = 185;BA.debugLine="UseDataSource = False";
_usedatasource = __c.False;
 //BA.debugLineNum = 186;BA.debugLine="HoverExpandEffect = False";
_hoverexpandeffect = __c.False;
 //BA.debugLineNum = 187;BA.debugLine="HoverZoomEffect = False";
_hoverzoomeffect = __c.False;
 //BA.debugLineNum = 188;BA.debugLine="bSetCounter = False";
_bsetcounter = __c.False;
 //BA.debugLineNum = 189;BA.debugLine="typeOf = \"text\"";
_typeof = "text";
 //BA.debugLineNum = 190;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 191;BA.debugLine="defaultValue = Null";
_defaultvalue = __c.Null;
 //BA.debugLineNum = 192;BA.debugLine="Isvisible = True";
_isvisible = __c.True;
 //BA.debugLineNum = 193;BA.debugLine="IsDisabled = False";
_isdisabled = __c.False;
 //BA.debugLineNum = 194;BA.debugLine="Required = False";
_required = __c.False;
 //BA.debugLineNum = 195;BA.debugLine="Clickable = False";
_clickable = __c.False;
 //BA.debugLineNum = 196;BA.debugLine="Deletable = False";
_deletable = __c.False;
 //BA.debugLineNum = 197;BA.debugLine="UseOptions = False";
_useoptions = __c.False;
 //BA.debugLineNum = 198;BA.debugLine="multiple = False";
_multiple = __c.False;
 //BA.debugLineNum = 199;BA.debugLine="MarginTop = Null";
_margintop = __c.Null;
 //BA.debugLineNum = 200;BA.debugLine="MarginBottom = Null";
_marginbottom = __c.Null;
 //BA.debugLineNum = 201;BA.debugLine="MarginLeft = Null";
_marginleft = __c.Null;
 //BA.debugLineNum = 202;BA.debugLine="MarginRight = Null";
_marginright = __c.Null;
 //BA.debugLineNum = 203;BA.debugLine="PaddingTop = Null";
_paddingtop = __c.Null;
 //BA.debugLineNum = 204;BA.debugLine="PaddingBottom = Null";
_paddingbottom = __c.Null;
 //BA.debugLineNum = 205;BA.debugLine="PaddingLeft = Null";
_paddingleft = __c.Null;
 //BA.debugLineNum = 206;BA.debugLine="PaddingRight = Null";
_paddingright = __c.Null;
 //BA.debugLineNum = 207;BA.debugLine="IsDisabled = False";
_isdisabled = __c.False;
 //BA.debugLineNum = 208;BA.debugLine="OptionsList.Initialize";
_optionslist.Initialize();
 //BA.debugLineNum = 209;BA.debugLine="MaxLength = Null";
_maxlength = __c.Null;
 //BA.debugLineNum = 210;BA.debugLine="errorText = \"\"";
_errortext = "";
 //BA.debugLineNum = 211;BA.debugLine="helperText = \"\"";
_helpertext = "";
 //BA.debugLineNum = 212;BA.debugLine="AutoGrow = False";
_autogrow = __c.False;
 //BA.debugLineNum = 213;BA.debugLine="TabIndex = \"\"";
_tabindex = (int)(Double.parseDouble(""));
 //BA.debugLineNum = 214;BA.debugLine="immediately = True";
_immediately = __c.True;
 //BA.debugLineNum = 215;BA.debugLine="openonfocus = False";
_openonfocus = __c.False;
 //BA.debugLineNum = 216;BA.debugLine="Dense = False";
_dense = __c.False;
 //BA.debugLineNum = 217;BA.debugLine="Raised = True";
_raised = __c.True;
 //BA.debugLineNum = 218;BA.debugLine="FitWidth = True";
_fitwidth = __c.True;
 //BA.debugLineNum = 219;BA.debugLine="Ripple = True";
_ripple = __c.True;
 //BA.debugLineNum = 220;BA.debugLine="MenuTrigger = False";
_menutrigger = __c.False;
 //BA.debugLineNum = 221;BA.debugLine="IconButton = False";
_iconbutton = __c.False;
 //BA.debugLineNum = 222;BA.debugLine="Plain = False";
_plain = __c.False;
 //BA.debugLineNum = 223;BA.debugLine="Mini = False";
_mini = __c.False;
 //BA.debugLineNum = 224;BA.debugLine="Fab = False";
_fab = __c.False;
 //BA.debugLineNum = 225;BA.debugLine="ListAction = False";
_listaction = __c.False;
 //BA.debugLineNum = 226;BA.debugLine="IsPrimary = True";
_isprimary = __c.True;
 //BA.debugLineNum = 227;BA.debugLine="IsAccent = False";
_isaccent = __c.False;
 //BA.debugLineNum = 228;BA.debugLine="FabFixed = False";
_fabfixed = __c.False;
 //BA.debugLineNum = 229;BA.debugLine="Static = False";
_static = __c.False;
 //BA.debugLineNum = 230;BA.debugLine="CheckDuplicates = False";
_checkduplicates = __c.False;
 //BA.debugLineNum = 231;BA.debugLine="readonly = False";
_readonly = __c.False;
 //BA.debugLineNum = 232;BA.debugLine="Exclude = False";
_exclude = __c.False;
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setaccent(boolean _sisaccent) throws Exception{
 //BA.debugLineNum = 810;BA.debugLine="Sub SetAccent(sIsAccent As Boolean) As VMInputCont";
 //BA.debugLineNum = 811;BA.debugLine="IsAccent = sIsAccent";
_isaccent = _sisaccent;
 //BA.debugLineNum = 812;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setactionicon(String _sactionicon) throws Exception{
 //BA.debugLineNum = 850;BA.debugLine="Sub SetActionIcon(sActionIcon As String) As VMInpu";
 //BA.debugLineNum = 851;BA.debugLine="ActionIcon = sActionIcon";
_actionicon = _sactionicon;
 //BA.debugLineNum = 852;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 853;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setaddedit(boolean _saddedit) throws Exception{
 //BA.debugLineNum = 865;BA.debugLine="Sub SetAddEdit(sAddEdit As Boolean) As VMInputCont";
 //BA.debugLineNum = 866;BA.debugLine="AddEdit = sAddEdit";
_addedit = _saddedit;
 //BA.debugLineNum = 867;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 868;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setalt(String _tg) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetAlt(tg As String) As VMInputControl";
 //BA.debugLineNum = 344;BA.debugLine="Alt = tg";
_alt = _tg;
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setautogrow(boolean _b) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub SetAutoGrow(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 529;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminputcontrol)(this);};
 //BA.debugLineNum = 530;BA.debugLine="AutoGrow = b";
_autogrow = _b;
 //BA.debugLineNum = 531;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbool() throws Exception{
 //BA.debugLineNum = 646;BA.debugLine="Sub SetBool As VMInputControl";
 //BA.debugLineNum = 647;BA.debugLine="fieldType = \"bool\"";
_fieldtype = "bool";
 //BA.debugLineNum = 648;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setboxtype(String _sboxtype) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetBoxType(sBoxType As String) As VMInputContr";
 //BA.debugLineNum = 307;BA.debugLine="BoxType = sBoxType";
_boxtype = _sboxtype;
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbutton() throws Exception{
 //BA.debugLineNum = 661;BA.debugLine="Sub SetButton As VMInputControl";
 //BA.debugLineNum = 662;BA.debugLine="typeOf = \"button\"";
_typeof = "button";
 //BA.debugLineNum = 663;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 664;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbuttontype(String _tt) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetButtonType(tt As String) As VMInputControl";
 //BA.debugLineNum = 413;BA.debugLine="ButtonType = tt";
_buttontype = _tt;
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbuttontypefab() throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub SetButtonTypeFAB As VMInputControl";
 //BA.debugLineNum = 430;BA.debugLine="ButtonType = \"fab\"";
_buttontype = "fab";
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbuttontypeicon() throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub SetButtonTypeIcon As VMInputControl";
 //BA.debugLineNum = 424;BA.debugLine="ButtonType = \"icon\"";
_buttontype = "icon";
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbuttontyperegular() throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetButtonTypeRegular As VMInputControl";
 //BA.debugLineNum = 418;BA.debugLine="ButtonType = \"regular\"";
_buttontype = "regular";
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcalendarweeks(boolean _cw) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetCalendarWeeks(cw As Boolean) As VMInputCont";
 //BA.debugLineNum = 134;BA.debugLine="CalendarWeeks = cw";
_calendarweeks = _cw;
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcell(String _scell) throws Exception{
 //BA.debugLineNum = 895;BA.debugLine="Sub SetCell(scell As String) As VMInputControl";
 //BA.debugLineNum = 896;BA.debugLine="cell = scell";
_cell = _scell;
 //BA.debugLineNum = 897;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcheckbox() throws Exception{
 //BA.debugLineNum = 582;BA.debugLine="Sub SetCheckbox As VMInputControl";
 //BA.debugLineNum = 583;BA.debugLine="typeOf = \"checkbox\"";
_typeof = "checkbox";
 //BA.debugLineNum = 584;BA.debugLine="fieldType = \"bool\"";
_fieldtype = "bool";
 //BA.debugLineNum = 585;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcheckboxgroup() throws Exception{
 //BA.debugLineNum = 556;BA.debugLine="Sub SetCheckBoxGroup As VMInputControl";
 //BA.debugLineNum = 557;BA.debugLine="typeOf = \"checkboxgroup\"";
_typeof = "checkboxgroup";
 //BA.debugLineNum = 558;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 559;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcheckduplicates(boolean _b) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetCheckDuplicates(b As Boolean) As VMInputCon";
 //BA.debugLineNum = 261;BA.debugLine="CheckDuplicates = b";
_checkduplicates = _b;
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setchip() throws Exception{
 //BA.debugLineNum = 568;BA.debugLine="Sub SetChip As VMInputControl";
 //BA.debugLineNum = 569;BA.debugLine="typeOf = \"chip\"";
_typeof = "chip";
 //BA.debugLineNum = 570;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 571;BA.debugLine="InputType = \"text\"";
_inputtype = "text";
 //BA.debugLineNum = 572;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setchips() throws Exception{
 //BA.debugLineNum = 575;BA.debugLine="Sub SetChips As VMInputControl";
 //BA.debugLineNum = 576;BA.debugLine="typeOf = \"chips\"";
_typeof = "chips";
 //BA.debugLineNum = 577;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 578;BA.debugLine="InputType = \"text\"";
_inputtype = "text";
 //BA.debugLineNum = 579;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setclearable(boolean _b) throws Exception{
 //BA.debugLineNum = 729;BA.debugLine="Sub SetClearable(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 730;BA.debugLine="clearable = b";
_clearable = _b;
 //BA.debugLineNum = 731;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setclickable(boolean _b) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetClickable(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 276;BA.debugLine="Clickable = b";
_clickable = _b;
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcount(String _scount) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetCount(sCount As String) As VMInputControl";
 //BA.debugLineNum = 334;BA.debugLine="Count = sCount";
_count = _scount;
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdatasource(String _ssourcetable,String _ssourcefield,String _sdisplayfield) throws Exception{
 //BA.debugLineNum = 682;BA.debugLine="Sub SetDataSource(ssourceTable As String, ssourceF";
 //BA.debugLineNum = 683;BA.debugLine="UseOptions = False";
_useoptions = __c.False;
 //BA.debugLineNum = 684;BA.debugLine="UseDataSource = True";
_usedatasource = __c.True;
 //BA.debugLineNum = 685;BA.debugLine="sourceTable = ssourceTable";
_sourcetable = _ssourcetable;
 //BA.debugLineNum = 686;BA.debugLine="sourceField = ssourceField";
_sourcefield = _ssourcefield;
 //BA.debugLineNum = 687;BA.debugLine="displayField = sdisplayField";
_displayfield = _sdisplayfield;
 //BA.debugLineNum = 688;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdate() throws Exception{
 //BA.debugLineNum = 656;BA.debugLine="Sub SetDate As VMInputControl";
 //BA.debugLineNum = 657;BA.debugLine="fieldType = \"date\"";
_fieldtype = "date";
 //BA.debugLineNum = 658;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdatepicker() throws Exception{
 //BA.debugLineNum = 588;BA.debugLine="Sub SetDatePicker As VMInputControl";
 //BA.debugLineNum = 589;BA.debugLine="typeOf = \"datepicker\"";
_typeof = "datepicker";
 //BA.debugLineNum = 590;BA.debugLine="fieldType = \"date\"";
_fieldtype = "date";
 //BA.debugLineNum = 591;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdefaultvalue(Object _sdefaultvalue) throws Exception{
 //BA.debugLineNum = 769;BA.debugLine="Sub SetDefaultValue(sdefaultValue As Object) As VM";
 //BA.debugLineNum = 770;BA.debugLine="defaultValue = sdefaultValue";
_defaultvalue = _sdefaultvalue;
 //BA.debugLineNum = 771;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 772;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdeletable(boolean _b) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetDeletable(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 281;BA.debugLine="Deletable = b";
_deletable = _b;
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdeletecaption(String _sdeletecaption) throws Exception{
 //BA.debugLineNum = 885;BA.debugLine="Sub SetDeleteCaption(sDeleteCaption As String) As";
 //BA.debugLineNum = 886;BA.debugLine="DeleteCaption = sDeleteCaption";
_deletecaption = _sdeletecaption;
 //BA.debugLineNum = 887;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdeletemethod(String _sdeletemethod) throws Exception{
 //BA.debugLineNum = 875;BA.debugLine="Sub SetDeleteMethod(sDeleteMethod As String) As VM";
 //BA.debugLineNum = 876;BA.debugLine="DeleteMethod = sDeleteMethod";
_deletemethod = _sdeletemethod;
 //BA.debugLineNum = 877;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 878;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdense(boolean _b) throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="Sub SetDense(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 509;BA.debugLine="Dense = b";
_dense = _b;
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdescription(String _sdescription) throws Exception{
 //BA.debugLineNum = 825;BA.debugLine="Sub SetDescription(sDescription As String) As VMIn";
 //BA.debugLineNum = 826;BA.debugLine="Description = sDescription";
_description = _sdescription;
 //BA.debugLineNum = 827;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 828;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdisabled(boolean _sisdisabled) throws Exception{
 //BA.debugLineNum = 815;BA.debugLine="Sub SetDisabled(sIsDisabled As Boolean) As VMInput";
 //BA.debugLineNum = 816;BA.debugLine="IsDisabled = sIsDisabled";
_isdisabled = _sisdisabled;
 //BA.debugLineNum = 817;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 818;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdisplayfield(String _sdisplayfield) throws Exception{
 //BA.debugLineNum = 744;BA.debugLine="Sub SetDisplayField(sdisplayField As String) As VM";
 //BA.debugLineNum = 745;BA.debugLine="displayField = sdisplayField";
_displayfield = _sdisplayfield;
 //BA.debugLineNum = 746;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdouble() throws Exception{
 //BA.debugLineNum = 631;BA.debugLine="Sub SetDouble As VMInputControl";
 //BA.debugLineNum = 632;BA.debugLine="fieldType = \"dbl\"";
_fieldtype = "dbl";
 //BA.debugLineNum = 633;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seteditcaption(String _seditcaption) throws Exception{
 //BA.debugLineNum = 880;BA.debugLine="Sub SetEditCaption(sEditCaption As String) As VMIn";
 //BA.debugLineNum = 881;BA.debugLine="EditCaption = sEditCaption";
_editcaption = _seditcaption;
 //BA.debugLineNum = 882;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seteditmethod(String _seditmethod) throws Exception{
 //BA.debugLineNum = 870;BA.debugLine="Sub SetEditMethod(sEditMethod As String) As VMInpu";
 //BA.debugLineNum = 871;BA.debugLine="EditMethod = sEditMethod";
_editmethod = _seditmethod;
 //BA.debugLineNum = 872;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setemail() throws Exception{
 //BA.debugLineNum = 621;BA.debugLine="Sub SetEmail As VMInputControl";
 //BA.debugLineNum = 622;BA.debugLine="typeOf = \"email\"";
_typeof = "email";
 //BA.debugLineNum = 623;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 624;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seterrortext(String _txt) throws Exception{
 //BA.debugLineNum = 707;BA.debugLine="Sub SetErrorText(txt As String) As VMInputControl";
 //BA.debugLineNum = 708;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vminputcontrol)(this);};
 //BA.debugLineNum = 709;BA.debugLine="errorText = txt";
_errortext = _txt;
 //BA.debugLineNum = 710;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 711;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setexclude(boolean _b) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetExclude(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 245;BA.debugLine="Exclude = b";
_exclude = _b;
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfab(boolean _b) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub SetFAB(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 440;BA.debugLine="Fab = b";
_fab = _b;
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabfixed(boolean _b) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub SetFabFixed(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 402;BA.debugLine="FabFixed = b";
_fabfixed = _b;
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabposition(String _pos) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetFabPosition(pos As String) As VMInputContro";
 //BA.debugLineNum = 397;BA.debugLine="FabPosition = pos";
_fabposition = _pos;
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositionbottomcenter() throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetFabPositionBottomCenter As VMInputControl";
 //BA.debugLineNum = 387;BA.debugLine="SetFabPosition(\"md-fab-bottom-center\")";
_setfabposition("md-fab-bottom-center");
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositionbottomleft() throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetFabPositionBottomLeft As VMInputControl";
 //BA.debugLineNum = 392;BA.debugLine="SetFabPosition(\"md-fab-bottom-left\")";
_setfabposition("md-fab-bottom-left");
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositionbottomright() throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub SetFabPositionBottomRight As VMInputControl";
 //BA.debugLineNum = 382;BA.debugLine="SetFabPosition(\"md-fab-bottom-right\")";
_setfabposition("md-fab-bottom-right");
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositiontopcenter() throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub SetFabPositionTopCenter As VMInputControl";
 //BA.debugLineNum = 372;BA.debugLine="SetFabPosition(\"md-fab-top-center\")";
_setfabposition("md-fab-top-center");
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositiontopleft() throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetFabPositionTopLeft As VMInputControl";
 //BA.debugLineNum = 377;BA.debugLine="SetFabPosition(\"md-fab-top-left\")";
_setfabposition("md-fab-top-left");
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositiontopright() throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetFabPositionTopRight As VMInputControl";
 //BA.debugLineNum = 367;BA.debugLine="SetFabPosition(\"md-fab-top-right\")";
_setfabposition("md-fab-top-right");
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfieldtype(String _sfieldtype) throws Exception{
 //BA.debugLineNum = 750;BA.debugLine="Sub SetFieldType(sfieldType As String) As VMInputC";
 //BA.debugLineNum = 751;BA.debugLine="fieldType = sfieldType";
_fieldtype = _sfieldtype;
 //BA.debugLineNum = 752;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfinish(String _sfinish) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetFinish(sFinish As String) As VMInputControl";
 //BA.debugLineNum = 323;BA.debugLine="Finish = sFinish";
_finish = _sfinish;
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfitwidth(boolean _b) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub SetFitWidth(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 472;BA.debugLine="FitWidth = b";
_fitwidth = _b;
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfooter(boolean _b) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetFooter(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 154;BA.debugLine="Footer = b";
_footer = _b;
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setformat(String _fmt) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetFormat(fmt As String) As VMInputControl";
 //BA.debugLineNum = 159;BA.debugLine="Format = fmt";
_format = _fmt;
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setheader(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetHeader(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 129;BA.debugLine="Header = b";
_header = _b;
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setheight(String _tg) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetHeight(tg As String) As VMInputControl";
 //BA.debugLineNum = 350;BA.debugLine="Height = tg";
_height = _tg;
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethelpertext(String _txt) throws Exception{
 //BA.debugLineNum = 701;BA.debugLine="Sub SetHelperText(txt As String) As VMInputControl";
 //BA.debugLineNum = 702;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vminputcontrol)(this);};
 //BA.debugLineNum = 703;BA.debugLine="helperText = txt";
_helpertext = _txt;
 //BA.debugLineNum = 704;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 705;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethidden(boolean _b) throws Exception{
 //BA.debugLineNum = 760;BA.debugLine="Sub SetHidden(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 761;BA.debugLine="If b = True Then";
if (_b==__c.True) { 
 //BA.debugLineNum = 762;BA.debugLine="SetVisible(False)";
_setvisible(__c.False);
 }else {
 //BA.debugLineNum = 764;BA.debugLine="SetVisible(True)";
_setvisible(__c.True);
 };
 //BA.debugLineNum = 766;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 767;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethoverexpandeffect(boolean _bhoverexpandeffect) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetHoverExpandEffect(bHoverExpandEffect As Boo";
 //BA.debugLineNum = 287;BA.debugLine="HoverExpandEffect = bHoverExpandEffect";
_hoverexpandeffect = _bhoverexpandeffect;
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethoverzoomeffect(boolean _bhoverzoomeffect) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetHoverZoomEffect(bHoverZoomEffect As Boolean";
 //BA.debugLineNum = 292;BA.debugLine="HoverZoomEffect = bHoverZoomEffect";
_hoverzoomeffect = _bhoverzoomeffect;
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethref(String _b) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub SetHREF(b As String) As VMInputControl";
 //BA.debugLineNum = 467;BA.debugLine="href = b";
_href = _b;
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticonbackgroundcolor(String _siconbackgroundcolor) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetIconBackgroundColor(sIconBackgroundColor As";
 //BA.debugLineNum = 297;BA.debugLine="IconBackgroundColor = sIconBackgroundColor";
_iconbackgroundcolor = _siconbackgroundcolor;
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticonbutton(boolean _b) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub SetIconButton(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 456;BA.debugLine="IconButton = b";
_iconbutton = _b;
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticoncolor(String _siconcolor) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetIconColor(sIconColor As String) As VMInputC";
 //BA.debugLineNum = 302;BA.debugLine="IconColor = sIconColor";
_iconcolor = _siconcolor;
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticonname(String _siconname) throws Exception{
 //BA.debugLineNum = 799;BA.debugLine="Sub SetIconName(sIconName As String) As VMInputCon";
 //BA.debugLineNum = 800;BA.debugLine="IconName = sIconName";
_iconname = _siconname;
 //BA.debugLineNum = 801;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticonsize(String _icns) throws Exception{
 //BA.debugLineNum = 487;BA.debugLine="Sub SetIconSize(icns As String) As VMInputControl";
 //BA.debugLineNum = 488;BA.debugLine="IconSize = icns";
_iconsize = _icns;
 //BA.debugLineNum = 489;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setimmediately(boolean _b) throws Exception{
 //BA.debugLineNum = 523;BA.debugLine="Sub SetImmediately(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 524;BA.debugLine="immediately = b";
_immediately = _b;
 //BA.debugLineNum = 525;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setinputtype(String _i) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetInputType(i As String) As VMInputControl";
 //BA.debugLineNum = 256;BA.debugLine="InputType = i";
_inputtype = _i;
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setint() throws Exception{
 //BA.debugLineNum = 651;BA.debugLine="Sub SetInt As VMInputControl";
 //BA.debugLineNum = 652;BA.debugLine="fieldType = \"int\"";
_fieldtype = "int";
 //BA.debugLineNum = 653;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setinvalidmessage(String _txt) throws Exception{
 //BA.debugLineNum = 713;BA.debugLine="Sub SetInvalidMessage(txt As String) As VMInputCon";
 //BA.debugLineNum = 714;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vminputcontrol)(this);};
 //BA.debugLineNum = 715;BA.debugLine="errorText = txt";
_errortext = _txt;
 //BA.debugLineNum = 716;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 717;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setkey(String _skey) throws Exception{
 //BA.debugLineNum = 840;BA.debugLine="Sub SetKey(sKey As String) As VMInputControl";
 //BA.debugLineNum = 841;BA.debugLine="Key = sKey";
_key = _skey;
 //BA.debugLineNum = 842;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlabel(String _lbl) throws Exception{
 //BA.debugLineNum = 691;BA.debugLine="Sub SetLabel(lbl As String) As VMInputControl";
 //BA.debugLineNum = 692;BA.debugLine="label = lbl";
_label = _lbl;
 //BA.debugLineNum = 693;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 694;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlimit(String _i) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetLimit(i As String) As VMInputControl";
 //BA.debugLineNum = 271;BA.debugLine="TheLimit = i";
_thelimit = _i;
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlines(int _slines) throws Exception{
 //BA.debugLineNum = 835;BA.debugLine="Sub SetLines(sLines As Int) As VMInputControl";
 //BA.debugLineNum = 836;BA.debugLine="Lines = sLines";
_lines = _slines;
 //BA.debugLineNum = 837;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 838;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlist() throws Exception{
 //BA.debugLineNum = 666;BA.debugLine="Sub SetList As VMInputControl";
 //BA.debugLineNum = 667;BA.debugLine="typeOf = \"list\"";
_typeof = "list";
 //BA.debugLineNum = 668;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 669;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlistaction(boolean _b) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub SetListAction(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 435;BA.debugLine="ListAction = b";
_listaction = _b;
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlocale(String _loc) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetLocale(loc As String) As VMInputControl";
 //BA.debugLineNum = 164;BA.debugLine="Locale = loc";
_locale = _loc;
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmargins(Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
 //BA.debugLineNum = 921;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
 //BA.debugLineNum = 922;BA.debugLine="MarginTop = mt";
_margintop = _mt;
 //BA.debugLineNum = 923;BA.debugLine="MarginBottom = mb";
_marginbottom = _mb;
 //BA.debugLineNum = 924;BA.debugLine="MarginLeft = ml";
_marginleft = _ml;
 //BA.debugLineNum = 925;BA.debugLine="MarginRight = mr";
_marginright = _mr;
 //BA.debugLineNum = 926;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 927;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmaxlength(int _smaxvalue) throws Exception{
 //BA.debugLineNum = 784;BA.debugLine="Sub SetMaxLength(sMaxValue As Int) As VMInputContr";
 //BA.debugLineNum = 785;BA.debugLine="MaxLength = sMaxValue";
_maxlength = (Object)(_smaxvalue);
 //BA.debugLineNum = 786;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmaxvalue(int _smaxvalue) throws Exception{
 //BA.debugLineNum = 779;BA.debugLine="Sub SetMaxValue(sMaxValue As Int) As VMInputContro";
 //BA.debugLineNum = 780;BA.debugLine="MaxValue = sMaxValue";
_maxvalue = _smaxvalue;
 //BA.debugLineNum = 781;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 782;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmenuclick(boolean _smenuclick) throws Exception{
 //BA.debugLineNum = 860;BA.debugLine="Sub SetMenuClick(sMenuClick As Boolean) As VMInput";
 //BA.debugLineNum = 861;BA.debugLine="MenuClick = sMenuClick";
_menuclick = _smenuclick;
 //BA.debugLineNum = 862;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 863;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmenuicon(String _smenuicon) throws Exception{
 //BA.debugLineNum = 855;BA.debugLine="Sub SetMenuIcon(sMenuIcon As String) As VMInputCon";
 //BA.debugLineNum = 856;BA.debugLine="MenuIcon = sMenuIcon";
_menuicon = _smenuicon;
 //BA.debugLineNum = 857;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 858;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmenutrigger(boolean _b) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 462;BA.debugLine="MenuTrigger = b";
_menutrigger = _b;
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmethodname(String _smethodname) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub SetMethodName(smethodName As String) As VMInpu";
 //BA.debugLineNum = 795;BA.debugLine="methodName = smethodName";
_methodname = _smethodname;
 //BA.debugLineNum = 796;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmini(boolean _b) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetMini(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 445;BA.debugLine="Mini = b";
_mini = _b;
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setminvalue(int _sminvalue) throws Exception{
 //BA.debugLineNum = 774;BA.debugLine="Sub SetMinValue(sMinValue As Int) As VMInputContro";
 //BA.debugLineNum = 775;BA.debugLine="MinValue = sMinValue";
_minvalue = _sminvalue;
 //BA.debugLineNum = 776;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 777;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmodal(boolean _mdl) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetModal(mdl As Boolean) As VMInputControl";
 //BA.debugLineNum = 169;BA.debugLine="Modal = mdl";
_modal = _mdl;
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmode(String _s) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetMode(s As String) As VMInputControl";
 //BA.debugLineNum = 124;BA.debugLine="Mode = s";
_mode = _s;
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmodule(Object _smodule) throws Exception{
 //BA.debugLineNum = 789;BA.debugLine="Sub SetModule(smodule As Object) As VMInputControl";
 //BA.debugLineNum = 790;BA.debugLine="module = smodule";
_module = _smodule;
 //BA.debugLineNum = 791;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 792;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmultiple(boolean _b) throws Exception{
 //BA.debugLineNum = 719;BA.debugLine="Sub SetMultiple(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 720;BA.debugLine="multiple = b";
_multiple = _b;
 //BA.debugLineNum = 721;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setname(String _sname) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetName(sname As String) As VMInputControl";
 //BA.debugLineNum = 237;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 238;BA.debugLine="sname = sname.trim";
_sname = _sname.trim();
 //BA.debugLineNum = 239;BA.debugLine="name = sname";
_name = _sname;
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setnumber() throws Exception{
 //BA.debugLineNum = 641;BA.debugLine="Sub SetNumber As VMInputControl";
 //BA.debugLineNum = 642;BA.debugLine="typeOf = \"number\"";
_typeof = "number";
 //BA.debugLineNum = 643;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setoffsets(String _soffsetsmall,String _soffsetmedium,String _soffsetlarge,String _soffsetxlarge) throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Sub SetOffsets(sOffsetSmall As String, sOffsetMedi";
 //BA.debugLineNum = 906;BA.debugLine="OffsetSmall = sOffsetSmall";
_offsetsmall = _soffsetsmall;
 //BA.debugLineNum = 907;BA.debugLine="OffsetMedium = sOffsetMedium";
_offsetmedium = _soffsetmedium;
 //BA.debugLineNum = 908;BA.debugLine="OffsetLarge = sOffsetLarge";
_offsetlarge = _soffsetlarge;
 //BA.debugLineNum = 909;BA.debugLine="OffsetXLarge = sOffsetXLarge";
_offsetxlarge = _soffsetxlarge;
 //BA.debugLineNum = 910;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 911;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setopenonfocus(boolean _b) throws Exception{
 //BA.debugLineNum = 518;BA.debugLine="Sub SetOpenOnFocus(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 519;BA.debugLine="openonfocus = b";
_openonfocus = _b;
 //BA.debugLineNum = 520;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setoptions(String _ssourcetable,anywheresoftware.b4a.objects.collections.Map _soptions,String _ssourcefield,String _sdisplayfield) throws Exception{
 //BA.debugLineNum = 672;BA.debugLine="Sub SetOptions(ssourceTable As String, soptions As";
 //BA.debugLineNum = 673;BA.debugLine="UseOptions = True";
_useoptions = __c.True;
 //BA.debugLineNum = 674;BA.debugLine="UseDataSource = False";
_usedatasource = __c.False;
 //BA.debugLineNum = 675;BA.debugLine="sourceTable = ssourceTable";
_sourcetable = _ssourcetable;
 //BA.debugLineNum = 676;BA.debugLine="options = soptions";
_options = _soptions;
 //BA.debugLineNum = 677;BA.debugLine="sourceField = ssourceField";
_sourcefield = _ssourcefield;
 //BA.debugLineNum = 678;BA.debugLine="displayField = sdisplayField";
_displayfield = _sdisplayfield;
 //BA.debugLineNum = 679;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 680;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setpadding(Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
 //BA.debugLineNum = 929;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
 //BA.debugLineNum = 930;BA.debugLine="PaddingTop = pt";
_paddingtop = _pt;
 //BA.debugLineNum = 931;BA.debugLine="PaddingBottom = pb";
_paddingbottom = _pb;
 //BA.debugLineNum = 932;BA.debugLine="PaddingLeft = pl";
_paddingleft = _pl;
 //BA.debugLineNum = 933;BA.debugLine="PaddingRight = pr";
_paddingright = _pr;
 //BA.debugLineNum = 934;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 935;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setpassword() throws Exception{
 //BA.debugLineNum = 616;BA.debugLine="Sub SetPassword As VMInputControl";
 //BA.debugLineNum = 617;BA.debugLine="typeOf = \"password\"";
_typeof = "password";
 //BA.debugLineNum = 618;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setplaceholder(String _txt) throws Exception{
 //BA.debugLineNum = 513;BA.debugLine="Sub SetPlaceHolder(txt As String) As VMInputContro";
 //BA.debugLineNum = 514;BA.debugLine="PlaceHolder = txt";
_placeholder = _txt;
 //BA.debugLineNum = 515;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setplain(boolean _b) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetPlain(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 450;BA.debugLine="Plain = b";
_plain = _b;
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setprimary(boolean _sisprimary) throws Exception{
 //BA.debugLineNum = 805;BA.debugLine="Sub SetPrimary(sIsPrimary As Boolean) As VMInputCo";
 //BA.debugLineNum = 806;BA.debugLine="IsPrimary = sIsPrimary";
_isprimary = _sisprimary;
 //BA.debugLineNum = 807;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setradio() throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Sub SetRadio As VMInputControl";
 //BA.debugLineNum = 546;BA.debugLine="typeOf = \"radio\"";
_typeof = "radio";
 //BA.debugLineNum = 547;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setradiogroup() throws Exception{
 //BA.debugLineNum = 550;BA.debugLine="Sub SetRadioGroup As VMInputControl";
 //BA.debugLineNum = 551;BA.debugLine="typeOf = \"radiogroup\"";
_typeof = "radiogroup";
 //BA.debugLineNum = 552;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 553;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setraised(boolean _b) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub SetRaised(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 483;BA.debugLine="Raised = b";
_raised = _b;
 //BA.debugLineNum = 484;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 251;BA.debugLine="readonly = b";
_readonly = _b;
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setrefreshinterval(String _srefreshinterval) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub SetRefreshInterval(sRefreshInterval As String)";
 //BA.debugLineNum = 313;BA.debugLine="RefreshInterval = sRefreshInterval";
_refreshinterval = _srefreshinterval;
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 724;BA.debugLine="Sub SetRequired(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 725;BA.debugLine="Required = b";
_required = _b;
 //BA.debugLineNum = 726;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setripple(boolean _b) throws Exception{
 //BA.debugLineNum = 477;BA.debugLine="Sub SetRipple(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 478;BA.debugLine="Ripple = b";
_ripple = _b;
 //BA.debugLineNum = 479;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setround(boolean _tg) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetRound(tg As Boolean) As VMInputControl";
 //BA.debugLineNum = 339;BA.debugLine="IsRound = tg";
_isround = _tg;
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setrow(String _srow) throws Exception{
 //BA.debugLineNum = 890;BA.debugLine="Sub SetRow(sRow As String) As VMInputControl";
 //BA.debugLineNum = 891;BA.debugLine="Row = sRow";
_row = _srow;
 //BA.debugLineNum = 892;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 893;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setselect() throws Exception{
 //BA.debugLineNum = 601;BA.debugLine="Sub SetSelect As VMInputControl";
 //BA.debugLineNum = 602;BA.debugLine="typeOf = \"selectbox\"";
_typeof = "selectbox";
 //BA.debugLineNum = 603;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 604;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setshowothermonths(boolean _som) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetShowOtherMonths(som As Boolean) As VMInputC";
 //BA.debugLineNum = 139;BA.debugLine="ShowOtherMonths = som";
_showothermonths = _som;
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsize(String _ssize) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetSize(sSize As String) As VMInputControl";
 //BA.debugLineNum = 149;BA.debugLine="Size = sSize";
_size = _ssize;
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsizes(String _ssizesmall,String _ssizemedium,String _ssizelarge,String _ssizexlarge) throws Exception{
 //BA.debugLineNum = 913;BA.debugLine="Sub SetSizes(sSizeSmall As String, sSizeMedium As";
 //BA.debugLineNum = 914;BA.debugLine="SizeSmall = sSizeSmall";
_sizesmall = _ssizesmall;
 //BA.debugLineNum = 915;BA.debugLine="SizeMedium = sSizeMedium";
_sizemedium = _ssizemedium;
 //BA.debugLineNum = 916;BA.debugLine="SizeLarge = sSizeLarge";
_sizelarge = _ssizelarge;
 //BA.debugLineNum = 917;BA.debugLine="SizeXLarge = sSizeXLarge";
_sizexlarge = _ssizexlarge;
 //BA.debugLineNum = 918;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 919;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setslider() throws Exception{
 //BA.debugLineNum = 606;BA.debugLine="Sub SetSlider As VMInputControl";
 //BA.debugLineNum = 607;BA.debugLine="typeOf = \"slide\"";
_typeof = "slide";
 //BA.debugLineNum = 608;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 609;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsource(String _ssource) throws Exception{
 //BA.debugLineNum = 845;BA.debugLine="Sub SetSource(sSource As String) As VMInputControl";
 //BA.debugLineNum = 846;BA.debugLine="Source = sSource";
_source = _ssource;
 //BA.debugLineNum = 847;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 848;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsourcefield(String _ssourcefield) throws Exception{
 //BA.debugLineNum = 739;BA.debugLine="Sub SetSourceField(ssourceField As String) As VMIn";
 //BA.debugLineNum = 740;BA.debugLine="sourceField = ssourceField";
_sourcefield = _ssourcefield;
 //BA.debugLineNum = 741;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 742;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsourcetable(String _ssourcetable) throws Exception{
 //BA.debugLineNum = 734;BA.debugLine="Sub SetSourceTable(ssourceTable As String) As VMIn";
 //BA.debugLineNum = 735;BA.debugLine="sourceTable = ssourceTable";
_sourcetable = _ssourcetable;
 //BA.debugLineNum = 736;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setspeed(String _sspeed) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetSpeed(sSpeed As String) As VMInputControl";
 //BA.debugLineNum = 318;BA.debugLine="Speed = sSpeed";
_speed = _sspeed;
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setstart(String _sstart) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetStart(sStart As String) As VMInputControl";
 //BA.debugLineNum = 328;BA.debugLine="Start = sStart";
_start = _sstart;
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetStatic(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 266;BA.debugLine="Static = b";
_static = _b;
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setstring() throws Exception{
 //BA.debugLineNum = 636;BA.debugLine="Sub SetString As VMInputControl";
 //BA.debugLineNum = 637;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 638;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 639;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setswitch() throws Exception{
 //BA.debugLineNum = 539;BA.debugLine="Sub SetSwitch As VMInputControl";
 //BA.debugLineNum = 540;BA.debugLine="typeOf = \"switchbox\"";
_typeof = "switchbox";
 //BA.debugLineNum = 541;BA.debugLine="fieldType = \"bool\"";
_fieldtype = "bool";
 //BA.debugLineNum = 542;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settabindex(int _idx) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Sub SetTabIndex(idx As Int) As VMInputControl";
 //BA.debugLineNum = 535;BA.debugLine="TabIndex = idx";
_tabindex = _idx;
 //BA.debugLineNum = 536;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settag(String _tg) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetTag(tg As String) As VMInputControl";
 //BA.debugLineNum = 361;BA.debugLine="Tag = tg";
_tag = _tg;
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settel() throws Exception{
 //BA.debugLineNum = 626;BA.debugLine="Sub SetTel As VMInputControl";
 //BA.debugLineNum = 627;BA.debugLine="typeOf = \"tel\"";
_typeof = "tel";
 //BA.debugLineNum = 628;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 629;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settext(String _stext) throws Exception{
 //BA.debugLineNum = 820;BA.debugLine="Sub SetText(sText As String) As VMInputControl";
 //BA.debugLineNum = 821;BA.debugLine="Text = sText";
_text = _stext;
 //BA.debugLineNum = 822;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settextarea() throws Exception{
 //BA.debugLineNum = 611;BA.debugLine="Sub SetTextArea As VMInputControl";
 //BA.debugLineNum = 612;BA.debugLine="typeOf = \"textarea\"";
_typeof = "textarea";
 //BA.debugLineNum = 613;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 614;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setthirdline(String _sthirdline) throws Exception{
 //BA.debugLineNum = 830;BA.debugLine="Sub SetThirdLine(sThirdLine As String) As VMInputC";
 //BA.debugLineNum = 831;BA.debugLine="ThirdLine = sThirdLine";
_thirdline = _sthirdline;
 //BA.debugLineNum = 832;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 833;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setthumblabel(boolean _b) throws Exception{
 //BA.debugLineNum = 492;BA.debugLine="Sub SetThumbLabel(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 493;BA.debugLine="ThumbLabel = b";
_thumblabel = _b;
 //BA.debugLineNum = 494;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settimepicker() throws Exception{
 //BA.debugLineNum = 594;BA.debugLine="Sub SetTimePicker As VMInputControl";
 //BA.debugLineNum = 595;BA.debugLine="typeOf = \"timepicker\"";
_typeof = "timepicker";
 //BA.debugLineNum = 596;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 597;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 598;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setto(String _sto) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub SetTo(sTo As String) As VMInputControl";
 //BA.debugLineNum = 408;BA.debugLine="NavigateTo = sTo";
_navigateto = _sto;
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settogglepassword(boolean _btogglepassword) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetTogglePassword(bTogglePassword As Boolean)";
 //BA.debugLineNum = 174;BA.debugLine="TogglePassword = bTogglePassword";
_togglepassword = _btogglepassword;
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settype(String _stypeof) throws Exception{
 //BA.debugLineNum = 696;BA.debugLine="Sub SetType(stypeOf As String) As VMInputControl";
 //BA.debugLineNum = 697;BA.debugLine="typeOf = stypeOf";
_typeof = _stypeof;
 //BA.debugLineNum = 698;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setusedatasource(boolean _b) throws Exception{
 //BA.debugLineNum = 502;BA.debugLine="Sub SetUseDataSource(b As Boolean) As VMInputContr";
 //BA.debugLineNum = 503;BA.debugLine="UseDataSource = b";
_usedatasource = _b;
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setuseoptions(boolean _b) throws Exception{
 //BA.debugLineNum = 497;BA.debugLine="Sub SetUseOptions(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 498;BA.debugLine="UseOptions = b";
_useoptions = _b;
 //BA.debugLineNum = 499;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setvalue(String _valu) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetValue(valu As String) As VMInputControl";
 //BA.debugLineNum = 144;BA.debugLine="Value = valu";
_value = _valu;
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setvisibility(String _svisibility) throws Exception{
 //BA.debugLineNum = 900;BA.debugLine="Sub SetVisibility(sVisibility As String) As VMInpu";
 //BA.debugLineNum = 901;BA.debugLine="Visibility = sVisibility";
_visibility = _svisibility;
 //BA.debugLineNum = 902;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 903;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 755;BA.debugLine="Sub SetVisible(b As Boolean) As VMInputControl";
 //BA.debugLineNum = 756;BA.debugLine="Isvisible = b";
_isvisible = _b;
 //BA.debugLineNum = 757;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setwidth(String _tg) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetWidth(tg As String) As VMInputControl";
 //BA.debugLineNum = 355;BA.debugLine="Width = tg";
_width = _tg;
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
