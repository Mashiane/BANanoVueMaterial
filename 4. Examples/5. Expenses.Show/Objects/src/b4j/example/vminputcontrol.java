package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vminputcontrol extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vminputcontrol", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vminputcontrol  _setvisible(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=157024256;
 //BA.debugLineNum = 157024256;BA.debugLine="Sub SetVisible(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=157024257;
 //BA.debugLineNum = 157024257;BA.debugLine="Isvisible = b";
__ref._isvisible /*boolean*/  = _b;
RDebugUtils.currentLine=157024258;
 //BA.debugLineNum = 157024258;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157024259;
 //BA.debugLineNum = 157024259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setint(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setint", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setint", null));}
RDebugUtils.currentLine=155844608;
 //BA.debugLineNum = 155844608;BA.debugLine="Sub SetInt As VMInputControl";
RDebugUtils.currentLine=155844609;
 //BA.debugLineNum = 155844609;BA.debugLine="fieldType = \"int\"";
__ref._fieldtype /*String*/  = "int";
RDebugUtils.currentLine=155844610;
 //BA.debugLineNum = 155844610;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155844611;
 //BA.debugLineNum = 155844611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdouble(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdouble", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdouble", null));}
RDebugUtils.currentLine=155582464;
 //BA.debugLineNum = 155582464;BA.debugLine="Sub SetDouble As VMInputControl";
RDebugUtils.currentLine=155582465;
 //BA.debugLineNum = 155582465;BA.debugLine="fieldType = \"dbl\"";
__ref._fieldtype /*String*/  = "dbl";
RDebugUtils.currentLine=155582466;
 //BA.debugLineNum = 155582466;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155582467;
 //BA.debugLineNum = 155582467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _initialize(b4j.example.vminputcontrol __ref,anywheresoftware.b4a.BA _ba,String _sname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "initialize", new Object[] {_ba,_sname}));}
RDebugUtils.currentLine=150798336;
 //BA.debugLineNum = 150798336;BA.debugLine="Public Sub Initialize(sName As String) As VMInputC";
RDebugUtils.currentLine=150798337;
 //BA.debugLineNum = 150798337;BA.debugLine="sName = sName.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=150798338;
 //BA.debugLineNum = 150798338;BA.debugLine="sName = sName.trim";
_sname = _sname.trim();
RDebugUtils.currentLine=150798339;
 //BA.debugLineNum = 150798339;BA.debugLine="name = sName";
__ref._name /*String*/  = _sname;
RDebugUtils.currentLine=150798340;
 //BA.debugLineNum = 150798340;BA.debugLine="href = \"\"";
__ref._href /*String*/  = "";
RDebugUtils.currentLine=150798341;
 //BA.debugLineNum = 150798341;BA.debugLine="TogglePassword = False";
__ref._togglepassword /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798342;
 //BA.debugLineNum = 150798342;BA.debugLine="UseDataSource = False";
__ref._usedatasource /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798343;
 //BA.debugLineNum = 150798343;BA.debugLine="HoverExpandEffect = False";
__ref._hoverexpandeffect /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798344;
 //BA.debugLineNum = 150798344;BA.debugLine="HoverZoomEffect = False";
__ref._hoverzoomeffect /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798345;
 //BA.debugLineNum = 150798345;BA.debugLine="bSetCounter = False";
__ref._bsetcounter /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798346;
 //BA.debugLineNum = 150798346;BA.debugLine="typeOf = \"text\"";
__ref._typeof /*String*/  = "text";
RDebugUtils.currentLine=150798347;
 //BA.debugLineNum = 150798347;BA.debugLine="fieldType = \"string\"";
__ref._fieldtype /*String*/  = "string";
RDebugUtils.currentLine=150798348;
 //BA.debugLineNum = 150798348;BA.debugLine="defaultValue = Null";
__ref._defaultvalue /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798349;
 //BA.debugLineNum = 150798349;BA.debugLine="Isvisible = True";
__ref._isvisible /*boolean*/  = __c.True;
RDebugUtils.currentLine=150798350;
 //BA.debugLineNum = 150798350;BA.debugLine="IsDisabled = False";
__ref._isdisabled /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798351;
 //BA.debugLineNum = 150798351;BA.debugLine="Required = False";
__ref._required /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798352;
 //BA.debugLineNum = 150798352;BA.debugLine="Clickable = False";
__ref._clickable /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798353;
 //BA.debugLineNum = 150798353;BA.debugLine="Deletable = False";
__ref._deletable /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798354;
 //BA.debugLineNum = 150798354;BA.debugLine="UseOptions = False";
__ref._useoptions /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798355;
 //BA.debugLineNum = 150798355;BA.debugLine="multiple = False";
__ref._multiple /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798356;
 //BA.debugLineNum = 150798356;BA.debugLine="MarginTop = Null";
__ref._margintop /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798357;
 //BA.debugLineNum = 150798357;BA.debugLine="MarginBottom = Null";
__ref._marginbottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798358;
 //BA.debugLineNum = 150798358;BA.debugLine="MarginLeft = Null";
__ref._marginleft /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798359;
 //BA.debugLineNum = 150798359;BA.debugLine="MarginRight = Null";
__ref._marginright /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798360;
 //BA.debugLineNum = 150798360;BA.debugLine="PaddingTop = Null";
__ref._paddingtop /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798361;
 //BA.debugLineNum = 150798361;BA.debugLine="PaddingBottom = Null";
__ref._paddingbottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798362;
 //BA.debugLineNum = 150798362;BA.debugLine="PaddingLeft = Null";
__ref._paddingleft /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798363;
 //BA.debugLineNum = 150798363;BA.debugLine="PaddingRight = Null";
__ref._paddingright /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798364;
 //BA.debugLineNum = 150798364;BA.debugLine="IsDisabled = False";
__ref._isdisabled /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798365;
 //BA.debugLineNum = 150798365;BA.debugLine="OptionsList.Initialize";
__ref._optionslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=150798366;
 //BA.debugLineNum = 150798366;BA.debugLine="MaxLength = Null";
__ref._maxlength /*Object*/  = __c.Null;
RDebugUtils.currentLine=150798367;
 //BA.debugLineNum = 150798367;BA.debugLine="errorText = \"\"";
__ref._errortext /*String*/  = "";
RDebugUtils.currentLine=150798368;
 //BA.debugLineNum = 150798368;BA.debugLine="helperText = \"\"";
__ref._helpertext /*String*/  = "";
RDebugUtils.currentLine=150798369;
 //BA.debugLineNum = 150798369;BA.debugLine="AutoGrow = False";
__ref._autogrow /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798370;
 //BA.debugLineNum = 150798370;BA.debugLine="TabIndex = \"\"";
__ref._tabindex /*int*/  = (int)(Double.parseDouble(""));
RDebugUtils.currentLine=150798371;
 //BA.debugLineNum = 150798371;BA.debugLine="immediately = True";
__ref._immediately /*boolean*/  = __c.True;
RDebugUtils.currentLine=150798372;
 //BA.debugLineNum = 150798372;BA.debugLine="openonfocus = False";
__ref._openonfocus /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798373;
 //BA.debugLineNum = 150798373;BA.debugLine="Dense = False";
__ref._dense /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798374;
 //BA.debugLineNum = 150798374;BA.debugLine="Raised = True";
__ref._raised /*boolean*/  = __c.True;
RDebugUtils.currentLine=150798375;
 //BA.debugLineNum = 150798375;BA.debugLine="FitWidth = True";
__ref._fitwidth /*boolean*/  = __c.True;
RDebugUtils.currentLine=150798376;
 //BA.debugLineNum = 150798376;BA.debugLine="Ripple = True";
__ref._ripple /*boolean*/  = __c.True;
RDebugUtils.currentLine=150798377;
 //BA.debugLineNum = 150798377;BA.debugLine="MenuTrigger = False";
__ref._menutrigger /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798378;
 //BA.debugLineNum = 150798378;BA.debugLine="IconButton = False";
__ref._iconbutton /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798379;
 //BA.debugLineNum = 150798379;BA.debugLine="Plain = False";
__ref._plain /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798380;
 //BA.debugLineNum = 150798380;BA.debugLine="Mini = False";
__ref._mini /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798381;
 //BA.debugLineNum = 150798381;BA.debugLine="Fab = False";
__ref._fab /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798382;
 //BA.debugLineNum = 150798382;BA.debugLine="ListAction = False";
__ref._listaction /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798383;
 //BA.debugLineNum = 150798383;BA.debugLine="IsPrimary = True";
__ref._isprimary /*boolean*/  = __c.True;
RDebugUtils.currentLine=150798384;
 //BA.debugLineNum = 150798384;BA.debugLine="IsAccent = False";
__ref._isaccent /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798385;
 //BA.debugLineNum = 150798385;BA.debugLine="FabFixed = False";
__ref._fabfixed /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798386;
 //BA.debugLineNum = 150798386;BA.debugLine="Static = False";
__ref._static /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798387;
 //BA.debugLineNum = 150798387;BA.debugLine="CheckDuplicates = False";
__ref._checkduplicates /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798388;
 //BA.debugLineNum = 150798388;BA.debugLine="readonly = False";
__ref._readonly /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798389;
 //BA.debugLineNum = 150798389;BA.debugLine="Exclude = False";
__ref._exclude /*boolean*/  = __c.False;
RDebugUtils.currentLine=150798390;
 //BA.debugLineNum = 150798390;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150798391;
 //BA.debugLineNum = 150798391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbutton(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setbutton", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setbutton", null));}
RDebugUtils.currentLine=155975680;
 //BA.debugLineNum = 155975680;BA.debugLine="Sub SetButton As VMInputControl";
RDebugUtils.currentLine=155975681;
 //BA.debugLineNum = 155975681;BA.debugLine="typeOf = \"button\"";
__ref._typeof /*String*/  = "button";
RDebugUtils.currentLine=155975682;
 //BA.debugLineNum = 155975682;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155975683;
 //BA.debugLineNum = 155975683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlabel(b4j.example.vminputcontrol __ref,String _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setlabel", new Object[] {_lbl}));}
RDebugUtils.currentLine=156237824;
 //BA.debugLineNum = 156237824;BA.debugLine="Sub SetLabel(lbl As String) As VMInputControl";
RDebugUtils.currentLine=156237825;
 //BA.debugLineNum = 156237825;BA.debugLine="label = lbl";
__ref._label /*String*/  = _lbl;
RDebugUtils.currentLine=156237826;
 //BA.debugLineNum = 156237826;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156237827;
 //BA.debugLineNum = 156237827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbuttontyperegular(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setbuttontyperegular", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setbuttontyperegular", null));}
RDebugUtils.currentLine=153092096;
 //BA.debugLineNum = 153092096;BA.debugLine="Sub SetButtonTypeRegular As VMInputControl";
RDebugUtils.currentLine=153092097;
 //BA.debugLineNum = 153092097;BA.debugLine="ButtonType = \"regular\"";
__ref._buttontype /*String*/  = "regular";
RDebugUtils.currentLine=153092098;
 //BA.debugLineNum = 153092098;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153092099;
 //BA.debugLineNum = 153092099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setraised(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setraised", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setraised", new Object[] {_b}));}
RDebugUtils.currentLine=153878528;
 //BA.debugLineNum = 153878528;BA.debugLine="Sub SetRaised(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153878529;
 //BA.debugLineNum = 153878529;BA.debugLine="Raised = b";
__ref._raised /*boolean*/  = _b;
RDebugUtils.currentLine=153878530;
 //BA.debugLineNum = 153878530;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153878531;
 //BA.debugLineNum = 153878531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setprimary(b4j.example.vminputcontrol __ref,boolean _sisprimary) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setprimary", new Object[] {_sisprimary}));}
RDebugUtils.currentLine=157614080;
 //BA.debugLineNum = 157614080;BA.debugLine="Sub SetPrimary(sIsPrimary As Boolean) As VMInputCo";
RDebugUtils.currentLine=157614081;
 //BA.debugLineNum = 157614081;BA.debugLine="IsPrimary = sIsPrimary";
__ref._isprimary /*boolean*/  = _sisprimary;
RDebugUtils.currentLine=157614082;
 //BA.debugLineNum = 157614082;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157614083;
 //BA.debugLineNum = 157614083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setaccent(b4j.example.vminputcontrol __ref,boolean _sisaccent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setaccent", new Object[] {_sisaccent}));}
RDebugUtils.currentLine=157679616;
 //BA.debugLineNum = 157679616;BA.debugLine="Sub SetAccent(sIsAccent As Boolean) As VMInputCont";
RDebugUtils.currentLine=157679617;
 //BA.debugLineNum = 157679617;BA.debugLine="IsAccent = sIsAccent";
__ref._isaccent /*boolean*/  = _sisaccent;
RDebugUtils.currentLine=157679618;
 //BA.debugLineNum = 157679618;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157679619;
 //BA.debugLineNum = 157679619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfitwidth(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfitwidth", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfitwidth", new Object[] {_b}));}
RDebugUtils.currentLine=153747456;
 //BA.debugLineNum = 153747456;BA.debugLine="Sub SetFitWidth(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153747457;
 //BA.debugLineNum = 153747457;BA.debugLine="FitWidth = b";
__ref._fitwidth /*boolean*/  = _b;
RDebugUtils.currentLine=153747458;
 //BA.debugLineNum = 153747458;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153747459;
 //BA.debugLineNum = 153747459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcheckbox(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setcheckbox", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setcheckbox", null));}
RDebugUtils.currentLine=154992640;
 //BA.debugLineNum = 154992640;BA.debugLine="Sub SetCheckbox As VMInputControl";
RDebugUtils.currentLine=154992641;
 //BA.debugLineNum = 154992641;BA.debugLine="typeOf = \"checkbox\"";
__ref._typeof /*String*/  = "checkbox";
RDebugUtils.currentLine=154992642;
 //BA.debugLineNum = 154992642;BA.debugLine="fieldType = \"bool\"";
__ref._fieldtype /*String*/  = "bool";
RDebugUtils.currentLine=154992643;
 //BA.debugLineNum = 154992643;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154992644;
 //BA.debugLineNum = 154992644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcheckboxgroup(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setcheckboxgroup", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setcheckboxgroup", null));}
RDebugUtils.currentLine=154796032;
 //BA.debugLineNum = 154796032;BA.debugLine="Sub SetCheckBoxGroup As VMInputControl";
RDebugUtils.currentLine=154796033;
 //BA.debugLineNum = 154796033;BA.debugLine="typeOf = \"checkboxgroup\"";
__ref._typeof /*String*/  = "checkboxgroup";
RDebugUtils.currentLine=154796034;
 //BA.debugLineNum = 154796034;BA.debugLine="fieldType = \"string\"";
__ref._fieldtype /*String*/  = "string";
RDebugUtils.currentLine=154796035;
 //BA.debugLineNum = 154796035;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154796036;
 //BA.debugLineNum = 154796036;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setchip(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setchip", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setchip", null));}
RDebugUtils.currentLine=154861568;
 //BA.debugLineNum = 154861568;BA.debugLine="Sub SetChip As VMInputControl";
RDebugUtils.currentLine=154861569;
 //BA.debugLineNum = 154861569;BA.debugLine="typeOf = \"chip\"";
__ref._typeof /*String*/  = "chip";
RDebugUtils.currentLine=154861570;
 //BA.debugLineNum = 154861570;BA.debugLine="fieldType = \"string\"";
__ref._fieldtype /*String*/  = "string";
RDebugUtils.currentLine=154861571;
 //BA.debugLineNum = 154861571;BA.debugLine="InputType = \"text\"";
__ref._inputtype /*String*/  = "text";
RDebugUtils.currentLine=154861572;
 //BA.debugLineNum = 154861572;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154861573;
 //BA.debugLineNum = 154861573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setchips(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setchips", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setchips", null));}
RDebugUtils.currentLine=154927104;
 //BA.debugLineNum = 154927104;BA.debugLine="Sub SetChips As VMInputControl";
RDebugUtils.currentLine=154927105;
 //BA.debugLineNum = 154927105;BA.debugLine="typeOf = \"chips\"";
__ref._typeof /*String*/  = "chips";
RDebugUtils.currentLine=154927106;
 //BA.debugLineNum = 154927106;BA.debugLine="fieldType = \"string\"";
__ref._fieldtype /*String*/  = "string";
RDebugUtils.currentLine=154927107;
 //BA.debugLineNum = 154927107;BA.debugLine="InputType = \"text\"";
__ref._inputtype /*String*/  = "text";
RDebugUtils.currentLine=154927108;
 //BA.debugLineNum = 154927108;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154927109;
 //BA.debugLineNum = 154927109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdatepicker(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdatepicker", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdatepicker", null));}
RDebugUtils.currentLine=155058176;
 //BA.debugLineNum = 155058176;BA.debugLine="Sub SetDatePicker As VMInputControl";
RDebugUtils.currentLine=155058177;
 //BA.debugLineNum = 155058177;BA.debugLine="typeOf = \"datepicker\"";
__ref._typeof /*String*/  = "datepicker";
RDebugUtils.currentLine=155058178;
 //BA.debugLineNum = 155058178;BA.debugLine="fieldType = \"date\"";
__ref._fieldtype /*String*/  = "date";
RDebugUtils.currentLine=155058179;
 //BA.debugLineNum = 155058179;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155058180;
 //BA.debugLineNum = 155058180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setemail(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setemail", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setemail", null));}
RDebugUtils.currentLine=155451392;
 //BA.debugLineNum = 155451392;BA.debugLine="Sub SetEmail As VMInputControl";
RDebugUtils.currentLine=155451393;
 //BA.debugLineNum = 155451393;BA.debugLine="typeOf = \"email\"";
__ref._typeof /*String*/  = "email";
RDebugUtils.currentLine=155451394;
 //BA.debugLineNum = 155451394;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155451395;
 //BA.debugLineNum = 155451395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticonbutton(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "seticonbutton", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "seticonbutton", new Object[] {_b}));}
RDebugUtils.currentLine=153550848;
 //BA.debugLineNum = 153550848;BA.debugLine="Sub SetIconButton(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153550849;
 //BA.debugLineNum = 153550849;BA.debugLine="IconButton = b";
__ref._iconbutton /*boolean*/  = _b;
RDebugUtils.currentLine=153550850;
 //BA.debugLineNum = 153550850;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153550851;
 //BA.debugLineNum = 153550851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlist(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setlist", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setlist", null));}
RDebugUtils.currentLine=156041216;
 //BA.debugLineNum = 156041216;BA.debugLine="Sub SetList As VMInputControl";
RDebugUtils.currentLine=156041217;
 //BA.debugLineNum = 156041217;BA.debugLine="typeOf = \"list\"";
__ref._typeof /*String*/  = "list";
RDebugUtils.currentLine=156041218;
 //BA.debugLineNum = 156041218;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156041219;
 //BA.debugLineNum = 156041219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setpassword(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setpassword", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setpassword", null));}
RDebugUtils.currentLine=155385856;
 //BA.debugLineNum = 155385856;BA.debugLine="Sub SetPassword As VMInputControl";
RDebugUtils.currentLine=155385857;
 //BA.debugLineNum = 155385857;BA.debugLine="typeOf = \"password\"";
__ref._typeof /*String*/  = "password";
RDebugUtils.currentLine=155385858;
 //BA.debugLineNum = 155385858;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155385859;
 //BA.debugLineNum = 155385859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setradiogroup(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setradiogroup", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setradiogroup", null));}
RDebugUtils.currentLine=154730496;
 //BA.debugLineNum = 154730496;BA.debugLine="Sub SetRadioGroup As VMInputControl";
RDebugUtils.currentLine=154730497;
 //BA.debugLineNum = 154730497;BA.debugLine="typeOf = \"radiogroup\"";
__ref._typeof /*String*/  = "radiogroup";
RDebugUtils.currentLine=154730498;
 //BA.debugLineNum = 154730498;BA.debugLine="fieldType = \"string\"";
__ref._fieldtype /*String*/  = "string";
RDebugUtils.currentLine=154730499;
 //BA.debugLineNum = 154730499;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154730500;
 //BA.debugLineNum = 154730500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setselect(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setselect", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setselect", null));}
RDebugUtils.currentLine=155189248;
 //BA.debugLineNum = 155189248;BA.debugLine="Sub SetSelect As VMInputControl";
RDebugUtils.currentLine=155189249;
 //BA.debugLineNum = 155189249;BA.debugLine="typeOf = \"selectbox\"";
__ref._typeof /*String*/  = "selectbox";
RDebugUtils.currentLine=155189250;
 //BA.debugLineNum = 155189250;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155189251;
 //BA.debugLineNum = 155189251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setslider(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setslider", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setslider", null));}
RDebugUtils.currentLine=155254784;
 //BA.debugLineNum = 155254784;BA.debugLine="Sub SetSlider As VMInputControl";
RDebugUtils.currentLine=155254785;
 //BA.debugLineNum = 155254785;BA.debugLine="typeOf = \"slide\"";
__ref._typeof /*String*/  = "slide";
RDebugUtils.currentLine=155254786;
 //BA.debugLineNum = 155254786;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155254787;
 //BA.debugLineNum = 155254787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setswitch(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setswitch", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setswitch", null));}
RDebugUtils.currentLine=154599424;
 //BA.debugLineNum = 154599424;BA.debugLine="Sub SetSwitch As VMInputControl";
RDebugUtils.currentLine=154599425;
 //BA.debugLineNum = 154599425;BA.debugLine="typeOf = \"switchbox\"";
__ref._typeof /*String*/  = "switchbox";
RDebugUtils.currentLine=154599426;
 //BA.debugLineNum = 154599426;BA.debugLine="fieldType = \"bool\"";
__ref._fieldtype /*String*/  = "bool";
RDebugUtils.currentLine=154599427;
 //BA.debugLineNum = 154599427;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154599428;
 //BA.debugLineNum = 154599428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settextarea(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "settextarea", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "settextarea", null));}
RDebugUtils.currentLine=155320320;
 //BA.debugLineNum = 155320320;BA.debugLine="Sub SetTextArea As VMInputControl";
RDebugUtils.currentLine=155320321;
 //BA.debugLineNum = 155320321;BA.debugLine="typeOf = \"textarea\"";
__ref._typeof /*String*/  = "textarea";
RDebugUtils.currentLine=155320322;
 //BA.debugLineNum = 155320322;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155320323;
 //BA.debugLineNum = 155320323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settimepicker(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "settimepicker", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "settimepicker", null));}
RDebugUtils.currentLine=155123712;
 //BA.debugLineNum = 155123712;BA.debugLine="Sub SetTimePicker As VMInputControl";
RDebugUtils.currentLine=155123713;
 //BA.debugLineNum = 155123713;BA.debugLine="typeOf = \"timepicker\"";
__ref._typeof /*String*/  = "timepicker";
RDebugUtils.currentLine=155123714;
 //BA.debugLineNum = 155123714;BA.debugLine="fieldType = \"string\"";
__ref._fieldtype /*String*/  = "string";
RDebugUtils.currentLine=155123715;
 //BA.debugLineNum = 155123715;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155123716;
 //BA.debugLineNum = 155123716;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
RDebugUtils.currentLine=150011904;
 //BA.debugLineNum = 150011904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=150011905;
 //BA.debugLineNum = 150011905;BA.debugLine="Public name As String";
_name = "";
RDebugUtils.currentLine=150011906;
 //BA.debugLineNum = 150011906;BA.debugLine="Public label As String";
_label = "";
RDebugUtils.currentLine=150011907;
 //BA.debugLineNum = 150011907;BA.debugLine="Public typeOf As String";
_typeof = "";
RDebugUtils.currentLine=150011908;
 //BA.debugLineNum = 150011908;BA.debugLine="Public helperText As String";
_helpertext = "";
RDebugUtils.currentLine=150011909;
 //BA.debugLineNum = 150011909;BA.debugLine="Public errorText As String";
_errortext = "";
RDebugUtils.currentLine=150011910;
 //BA.debugLineNum = 150011910;BA.debugLine="Public Required As Boolean";
_required = false;
RDebugUtils.currentLine=150011911;
 //BA.debugLineNum = 150011911;BA.debugLine="Public clearable As Boolean";
_clearable = false;
RDebugUtils.currentLine=150011912;
 //BA.debugLineNum = 150011912;BA.debugLine="Public sourceTable As String";
_sourcetable = "";
RDebugUtils.currentLine=150011913;
 //BA.debugLineNum = 150011913;BA.debugLine="Public sourceField As String";
_sourcefield = "";
RDebugUtils.currentLine=150011914;
 //BA.debugLineNum = 150011914;BA.debugLine="Public displayField As String";
_displayfield = "";
RDebugUtils.currentLine=150011915;
 //BA.debugLineNum = 150011915;BA.debugLine="Public fieldType As String";
_fieldtype = "";
RDebugUtils.currentLine=150011916;
 //BA.debugLineNum = 150011916;BA.debugLine="Public Isvisible As Boolean";
_isvisible = false;
RDebugUtils.currentLine=150011917;
 //BA.debugLineNum = 150011917;BA.debugLine="Public defaultValue As Object";
_defaultvalue = new Object();
RDebugUtils.currentLine=150011918;
 //BA.debugLineNum = 150011918;BA.debugLine="Public options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=150011919;
 //BA.debugLineNum = 150011919;BA.debugLine="Public MinValue As Int";
_minvalue = 0;
RDebugUtils.currentLine=150011920;
 //BA.debugLineNum = 150011920;BA.debugLine="Public MaxValue As Int";
_maxvalue = 0;
RDebugUtils.currentLine=150011921;
 //BA.debugLineNum = 150011921;BA.debugLine="Public module As Object";
_module = new Object();
RDebugUtils.currentLine=150011922;
 //BA.debugLineNum = 150011922;BA.debugLine="Public methodName As String";
_methodname = "";
RDebugUtils.currentLine=150011923;
 //BA.debugLineNum = 150011923;BA.debugLine="Public IconName As String";
_iconname = "";
RDebugUtils.currentLine=150011924;
 //BA.debugLineNum = 150011924;BA.debugLine="Public IsPrimary As Boolean";
_isprimary = false;
RDebugUtils.currentLine=150011925;
 //BA.debugLineNum = 150011925;BA.debugLine="Public IsAccent As Boolean";
_isaccent = false;
RDebugUtils.currentLine=150011926;
 //BA.debugLineNum = 150011926;BA.debugLine="Public IsDisabled As Boolean";
_isdisabled = false;
RDebugUtils.currentLine=150011927;
 //BA.debugLineNum = 150011927;BA.debugLine="Public Text As String";
_text = "";
RDebugUtils.currentLine=150011928;
 //BA.debugLineNum = 150011928;BA.debugLine="Public Description As String";
_description = "";
RDebugUtils.currentLine=150011929;
 //BA.debugLineNum = 150011929;BA.debugLine="Public ThirdLine As String";
_thirdline = "";
RDebugUtils.currentLine=150011930;
 //BA.debugLineNum = 150011930;BA.debugLine="Public Lines As Int";
_lines = 0;
RDebugUtils.currentLine=150011931;
 //BA.debugLineNum = 150011931;BA.debugLine="Public Key As String";
_key = "";
RDebugUtils.currentLine=150011932;
 //BA.debugLineNum = 150011932;BA.debugLine="Public Source As String";
_source = "";
RDebugUtils.currentLine=150011933;
 //BA.debugLineNum = 150011933;BA.debugLine="Public ActionIcon As String";
_actionicon = "";
RDebugUtils.currentLine=150011934;
 //BA.debugLineNum = 150011934;BA.debugLine="Public MenuIcon As String";
_menuicon = "";
RDebugUtils.currentLine=150011935;
 //BA.debugLineNum = 150011935;BA.debugLine="Public MenuClick As Boolean";
_menuclick = false;
RDebugUtils.currentLine=150011936;
 //BA.debugLineNum = 150011936;BA.debugLine="Public AddEdit As Boolean";
_addedit = false;
RDebugUtils.currentLine=150011937;
 //BA.debugLineNum = 150011937;BA.debugLine="Public EditMethod As String";
_editmethod = "";
RDebugUtils.currentLine=150011938;
 //BA.debugLineNum = 150011938;BA.debugLine="Public DeleteMethod As String";
_deletemethod = "";
RDebugUtils.currentLine=150011939;
 //BA.debugLineNum = 150011939;BA.debugLine="Public EditCaption As String";
_editcaption = "";
RDebugUtils.currentLine=150011940;
 //BA.debugLineNum = 150011940;BA.debugLine="Public DeleteCaption As String";
_deletecaption = "";
RDebugUtils.currentLine=150011941;
 //BA.debugLineNum = 150011941;BA.debugLine="Public Row As String";
_row = "";
RDebugUtils.currentLine=150011942;
 //BA.debugLineNum = 150011942;BA.debugLine="Public cell As String";
_cell = "";
RDebugUtils.currentLine=150011943;
 //BA.debugLineNum = 150011943;BA.debugLine="Public OffsetSmall As String";
_offsetsmall = "";
RDebugUtils.currentLine=150011944;
 //BA.debugLineNum = 150011944;BA.debugLine="Public OffsetMedium As String";
_offsetmedium = "";
RDebugUtils.currentLine=150011945;
 //BA.debugLineNum = 150011945;BA.debugLine="Public OffsetLarge As String";
_offsetlarge = "";
RDebugUtils.currentLine=150011946;
 //BA.debugLineNum = 150011946;BA.debugLine="Public OffsetXLarge As String";
_offsetxlarge = "";
RDebugUtils.currentLine=150011947;
 //BA.debugLineNum = 150011947;BA.debugLine="Public SizeSmall As String";
_sizesmall = "";
RDebugUtils.currentLine=150011948;
 //BA.debugLineNum = 150011948;BA.debugLine="Public SizeMedium As String";
_sizemedium = "";
RDebugUtils.currentLine=150011949;
 //BA.debugLineNum = 150011949;BA.debugLine="Public SizeLarge As String";
_sizelarge = "";
RDebugUtils.currentLine=150011950;
 //BA.debugLineNum = 150011950;BA.debugLine="Public SizeXLarge As String";
_sizexlarge = "";
RDebugUtils.currentLine=150011951;
 //BA.debugLineNum = 150011951;BA.debugLine="Public Visibility As String";
_visibility = "";
RDebugUtils.currentLine=150011952;
 //BA.debugLineNum = 150011952;BA.debugLine="Public UseOptions As Boolean";
_useoptions = false;
RDebugUtils.currentLine=150011953;
 //BA.debugLineNum = 150011953;BA.debugLine="Public multiple As Boolean";
_multiple = false;
RDebugUtils.currentLine=150011954;
 //BA.debugLineNum = 150011954;BA.debugLine="Public MarginTop As Object";
_margintop = new Object();
RDebugUtils.currentLine=150011955;
 //BA.debugLineNum = 150011955;BA.debugLine="Public MarginBottom As Object";
_marginbottom = new Object();
RDebugUtils.currentLine=150011956;
 //BA.debugLineNum = 150011956;BA.debugLine="Public MarginLeft As Object";
_marginleft = new Object();
RDebugUtils.currentLine=150011957;
 //BA.debugLineNum = 150011957;BA.debugLine="Public MarginRight As Object";
_marginright = new Object();
RDebugUtils.currentLine=150011958;
 //BA.debugLineNum = 150011958;BA.debugLine="Public PaddingTop As Object";
_paddingtop = new Object();
RDebugUtils.currentLine=150011959;
 //BA.debugLineNum = 150011959;BA.debugLine="Public PaddingBottom As Object";
_paddingbottom = new Object();
RDebugUtils.currentLine=150011960;
 //BA.debugLineNum = 150011960;BA.debugLine="Public PaddingLeft As Object";
_paddingleft = new Object();
RDebugUtils.currentLine=150011961;
 //BA.debugLineNum = 150011961;BA.debugLine="Public PaddingRight As Object";
_paddingright = new Object();
RDebugUtils.currentLine=150011962;
 //BA.debugLineNum = 150011962;BA.debugLine="Public OptionsList As List";
_optionslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150011963;
 //BA.debugLineNum = 150011963;BA.debugLine="Public MaxLength As Object";
_maxlength = new Object();
RDebugUtils.currentLine=150011964;
 //BA.debugLineNum = 150011964;BA.debugLine="Public TabIndex As Int";
_tabindex = 0;
RDebugUtils.currentLine=150011965;
 //BA.debugLineNum = 150011965;BA.debugLine="Public AutoGrow As Boolean";
_autogrow = false;
RDebugUtils.currentLine=150011966;
 //BA.debugLineNum = 150011966;BA.debugLine="Public openonfocus As Boolean";
_openonfocus = false;
RDebugUtils.currentLine=150011967;
 //BA.debugLineNum = 150011967;BA.debugLine="Public immediately As Boolean";
_immediately = false;
RDebugUtils.currentLine=150011968;
 //BA.debugLineNum = 150011968;BA.debugLine="Public PlaceHolder As String";
_placeholder = "";
RDebugUtils.currentLine=150011969;
 //BA.debugLineNum = 150011969;BA.debugLine="Public ThumbLabel As Boolean";
_thumblabel = false;
RDebugUtils.currentLine=150011970;
 //BA.debugLineNum = 150011970;BA.debugLine="Public Dense As Boolean";
_dense = false;
RDebugUtils.currentLine=150011971;
 //BA.debugLineNum = 150011971;BA.debugLine="Public IconSize As String";
_iconsize = "";
RDebugUtils.currentLine=150011972;
 //BA.debugLineNum = 150011972;BA.debugLine="Public Raised As Boolean";
_raised = false;
RDebugUtils.currentLine=150011973;
 //BA.debugLineNum = 150011973;BA.debugLine="Public Ripple As Boolean";
_ripple = false;
RDebugUtils.currentLine=150011974;
 //BA.debugLineNum = 150011974;BA.debugLine="Public FitWidth As Boolean";
_fitwidth = false;
RDebugUtils.currentLine=150011975;
 //BA.debugLineNum = 150011975;BA.debugLine="Public href As String";
_href = "";
RDebugUtils.currentLine=150011976;
 //BA.debugLineNum = 150011976;BA.debugLine="Public MenuTrigger As Boolean";
_menutrigger = false;
RDebugUtils.currentLine=150011977;
 //BA.debugLineNum = 150011977;BA.debugLine="Public IconButton As Boolean";
_iconbutton = false;
RDebugUtils.currentLine=150011978;
 //BA.debugLineNum = 150011978;BA.debugLine="Public Plain As Boolean";
_plain = false;
RDebugUtils.currentLine=150011979;
 //BA.debugLineNum = 150011979;BA.debugLine="Public Mini As Boolean";
_mini = false;
RDebugUtils.currentLine=150011980;
 //BA.debugLineNum = 150011980;BA.debugLine="Public Fab As Boolean";
_fab = false;
RDebugUtils.currentLine=150011981;
 //BA.debugLineNum = 150011981;BA.debugLine="Public ListAction As Boolean";
_listaction = false;
RDebugUtils.currentLine=150011982;
 //BA.debugLineNum = 150011982;BA.debugLine="Public ButtonType As String";
_buttontype = "";
RDebugUtils.currentLine=150011983;
 //BA.debugLineNum = 150011983;BA.debugLine="Public NavigateTo As String";
_navigateto = "";
RDebugUtils.currentLine=150011984;
 //BA.debugLineNum = 150011984;BA.debugLine="Public FabPosition As String";
_fabposition = "";
RDebugUtils.currentLine=150011985;
 //BA.debugLineNum = 150011985;BA.debugLine="Public FabFixed As Boolean";
_fabfixed = false;
RDebugUtils.currentLine=150011986;
 //BA.debugLineNum = 150011986;BA.debugLine="Public Tag As String";
_tag = "";
RDebugUtils.currentLine=150011987;
 //BA.debugLineNum = 150011987;BA.debugLine="Public Width As String";
_width = "";
RDebugUtils.currentLine=150011988;
 //BA.debugLineNum = 150011988;BA.debugLine="Public Height As String";
_height = "";
RDebugUtils.currentLine=150011989;
 //BA.debugLineNum = 150011989;BA.debugLine="Public IsRound As Boolean";
_isround = false;
RDebugUtils.currentLine=150011990;
 //BA.debugLineNum = 150011990;BA.debugLine="Public Alt As String";
_alt = "";
RDebugUtils.currentLine=150011991;
 //BA.debugLineNum = 150011991;BA.debugLine="Public Count As String";
_count = "";
RDebugUtils.currentLine=150011992;
 //BA.debugLineNum = 150011992;BA.debugLine="Public Start As String";
_start = "";
RDebugUtils.currentLine=150011993;
 //BA.debugLineNum = 150011993;BA.debugLine="Public Finish As String";
_finish = "";
RDebugUtils.currentLine=150011994;
 //BA.debugLineNum = 150011994;BA.debugLine="Public Speed As String";
_speed = "";
RDebugUtils.currentLine=150011995;
 //BA.debugLineNum = 150011995;BA.debugLine="Public RefreshInterval As String";
_refreshinterval = "";
RDebugUtils.currentLine=150011996;
 //BA.debugLineNum = 150011996;BA.debugLine="Public BoxType As String";
_boxtype = "";
RDebugUtils.currentLine=150011997;
 //BA.debugLineNum = 150011997;BA.debugLine="Public IconColor As String";
_iconcolor = "";
RDebugUtils.currentLine=150011998;
 //BA.debugLineNum = 150011998;BA.debugLine="Public IconBackgroundColor As String";
_iconbackgroundcolor = "";
RDebugUtils.currentLine=150011999;
 //BA.debugLineNum = 150011999;BA.debugLine="Public HoverZoomEffect As Boolean";
_hoverzoomeffect = false;
RDebugUtils.currentLine=150012000;
 //BA.debugLineNum = 150012000;BA.debugLine="Public HoverExpandEffect As Boolean";
_hoverexpandeffect = false;
RDebugUtils.currentLine=150012001;
 //BA.debugLineNum = 150012001;BA.debugLine="Public bSetCounter As Boolean";
_bsetcounter = false;
RDebugUtils.currentLine=150012002;
 //BA.debugLineNum = 150012002;BA.debugLine="Public Clickable As Boolean";
_clickable = false;
RDebugUtils.currentLine=150012003;
 //BA.debugLineNum = 150012003;BA.debugLine="Public Deletable As Boolean";
_deletable = false;
RDebugUtils.currentLine=150012004;
 //BA.debugLineNum = 150012004;BA.debugLine="Public TheLimit As String";
_thelimit = "";
RDebugUtils.currentLine=150012005;
 //BA.debugLineNum = 150012005;BA.debugLine="Public CheckDuplicates As Boolean";
_checkduplicates = false;
RDebugUtils.currentLine=150012006;
 //BA.debugLineNum = 150012006;BA.debugLine="Public InputType As String";
_inputtype = "";
RDebugUtils.currentLine=150012007;
 //BA.debugLineNum = 150012007;BA.debugLine="Public Static As Boolean";
_static = false;
RDebugUtils.currentLine=150012009;
 //BA.debugLineNum = 150012009;BA.debugLine="Public Footer As Boolean";
_footer = false;
RDebugUtils.currentLine=150012010;
 //BA.debugLineNum = 150012010;BA.debugLine="Public Format As String";
_format = "";
RDebugUtils.currentLine=150012011;
 //BA.debugLineNum = 150012011;BA.debugLine="Public Locale As String";
_locale = "";
RDebugUtils.currentLine=150012012;
 //BA.debugLineNum = 150012012;BA.debugLine="Public Modal As Boolean";
_modal = false;
RDebugUtils.currentLine=150012013;
 //BA.debugLineNum = 150012013;BA.debugLine="Public Size As String";
_size = "";
RDebugUtils.currentLine=150012014;
 //BA.debugLineNum = 150012014;BA.debugLine="Public Value As String";
_value = "";
RDebugUtils.currentLine=150012015;
 //BA.debugLineNum = 150012015;BA.debugLine="Public ShowOtherMonths As Boolean";
_showothermonths = false;
RDebugUtils.currentLine=150012016;
 //BA.debugLineNum = 150012016;BA.debugLine="Public CalendarWeeks As Boolean";
_calendarweeks = false;
RDebugUtils.currentLine=150012017;
 //BA.debugLineNum = 150012017;BA.debugLine="Public Header As Boolean";
_header = false;
RDebugUtils.currentLine=150012018;
 //BA.debugLineNum = 150012018;BA.debugLine="Public Mode As String";
_mode = "";
RDebugUtils.currentLine=150012019;
 //BA.debugLineNum = 150012019;BA.debugLine="Public readonly As Boolean";
_readonly = false;
RDebugUtils.currentLine=150012020;
 //BA.debugLineNum = 150012020;BA.debugLine="Public UseDataSource As Boolean";
_usedatasource = false;
RDebugUtils.currentLine=150012021;
 //BA.debugLineNum = 150012021;BA.debugLine="Public TogglePassword As Boolean";
_togglepassword = false;
RDebugUtils.currentLine=150012022;
 //BA.debugLineNum = 150012022;BA.debugLine="Public Exclude As Boolean";
_exclude = false;
RDebugUtils.currentLine=150012023;
 //BA.debugLineNum = 150012023;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminputcontrol  _setactionicon(b4j.example.vminputcontrol __ref,String _sactionicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setactionicon", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setactionicon", new Object[] {_sactionicon}));}
RDebugUtils.currentLine=158203904;
 //BA.debugLineNum = 158203904;BA.debugLine="Sub SetActionIcon(sActionIcon As String) As VMInpu";
RDebugUtils.currentLine=158203905;
 //BA.debugLineNum = 158203905;BA.debugLine="ActionIcon = sActionIcon";
__ref._actionicon /*String*/  = _sactionicon;
RDebugUtils.currentLine=158203906;
 //BA.debugLineNum = 158203906;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158203907;
 //BA.debugLineNum = 158203907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setaddedit(b4j.example.vminputcontrol __ref,boolean _saddedit) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setaddedit", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setaddedit", new Object[] {_saddedit}));}
RDebugUtils.currentLine=158400512;
 //BA.debugLineNum = 158400512;BA.debugLine="Sub SetAddEdit(sAddEdit As Boolean) As VMInputCont";
RDebugUtils.currentLine=158400513;
 //BA.debugLineNum = 158400513;BA.debugLine="AddEdit = sAddEdit";
__ref._addedit /*boolean*/  = _saddedit;
RDebugUtils.currentLine=158400514;
 //BA.debugLineNum = 158400514;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158400515;
 //BA.debugLineNum = 158400515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setalt(b4j.example.vminputcontrol __ref,String _tg) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setalt", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setalt", new Object[] {_tg}));}
RDebugUtils.currentLine=152174592;
 //BA.debugLineNum = 152174592;BA.debugLine="Sub SetAlt(tg As String) As VMInputControl";
RDebugUtils.currentLine=152174593;
 //BA.debugLineNum = 152174593;BA.debugLine="Alt = tg";
__ref._alt /*String*/  = _tg;
RDebugUtils.currentLine=152174594;
 //BA.debugLineNum = 152174594;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152174595;
 //BA.debugLineNum = 152174595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setautogrow(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setautogrow", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setautogrow", new Object[] {_b}));}
RDebugUtils.currentLine=154468352;
 //BA.debugLineNum = 154468352;BA.debugLine="Sub SetAutoGrow(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=154468353;
 //BA.debugLineNum = 154468353;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminputcontrol)(this);};
RDebugUtils.currentLine=154468354;
 //BA.debugLineNum = 154468354;BA.debugLine="AutoGrow = b";
__ref._autogrow /*boolean*/  = _b;
RDebugUtils.currentLine=154468355;
 //BA.debugLineNum = 154468355;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154468356;
 //BA.debugLineNum = 154468356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbool(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setbool", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setbool", null));}
RDebugUtils.currentLine=155779072;
 //BA.debugLineNum = 155779072;BA.debugLine="Sub SetBool As VMInputControl";
RDebugUtils.currentLine=155779073;
 //BA.debugLineNum = 155779073;BA.debugLine="fieldType = \"bool\"";
__ref._fieldtype /*String*/  = "bool";
RDebugUtils.currentLine=155779074;
 //BA.debugLineNum = 155779074;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155779075;
 //BA.debugLineNum = 155779075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setboxtype(b4j.example.vminputcontrol __ref,String _sboxtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setboxtype", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setboxtype", new Object[] {_sboxtype}));}
RDebugUtils.currentLine=151715840;
 //BA.debugLineNum = 151715840;BA.debugLine="Sub SetBoxType(sBoxType As String) As VMInputContr";
RDebugUtils.currentLine=151715841;
 //BA.debugLineNum = 151715841;BA.debugLine="BoxType = sBoxType";
__ref._boxtype /*String*/  = _sboxtype;
RDebugUtils.currentLine=151715842;
 //BA.debugLineNum = 151715842;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151715843;
 //BA.debugLineNum = 151715843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbuttontype(b4j.example.vminputcontrol __ref,String _tt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setbuttontype", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setbuttontype", new Object[] {_tt}));}
RDebugUtils.currentLine=153026560;
 //BA.debugLineNum = 153026560;BA.debugLine="Sub SetButtonType(tt As String) As VMInputControl";
RDebugUtils.currentLine=153026561;
 //BA.debugLineNum = 153026561;BA.debugLine="ButtonType = tt";
__ref._buttontype /*String*/  = _tt;
RDebugUtils.currentLine=153026562;
 //BA.debugLineNum = 153026562;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153026563;
 //BA.debugLineNum = 153026563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbuttontypefab(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setbuttontypefab", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setbuttontypefab", null));}
RDebugUtils.currentLine=153223168;
 //BA.debugLineNum = 153223168;BA.debugLine="Sub SetButtonTypeFAB As VMInputControl";
RDebugUtils.currentLine=153223169;
 //BA.debugLineNum = 153223169;BA.debugLine="ButtonType = \"fab\"";
__ref._buttontype /*String*/  = "fab";
RDebugUtils.currentLine=153223170;
 //BA.debugLineNum = 153223170;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153223171;
 //BA.debugLineNum = 153223171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setbuttontypeicon(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setbuttontypeicon", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setbuttontypeicon", null));}
RDebugUtils.currentLine=153157632;
 //BA.debugLineNum = 153157632;BA.debugLine="Sub SetButtonTypeIcon As VMInputControl";
RDebugUtils.currentLine=153157633;
 //BA.debugLineNum = 153157633;BA.debugLine="ButtonType = \"icon\"";
__ref._buttontype /*String*/  = "icon";
RDebugUtils.currentLine=153157634;
 //BA.debugLineNum = 153157634;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153157635;
 //BA.debugLineNum = 153157635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcalendarweeks(b4j.example.vminputcontrol __ref,boolean _cw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setcalendarweeks", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setcalendarweeks", new Object[] {_cw}));}
RDebugUtils.currentLine=150208512;
 //BA.debugLineNum = 150208512;BA.debugLine="Sub SetCalendarWeeks(cw As Boolean) As VMInputCont";
RDebugUtils.currentLine=150208513;
 //BA.debugLineNum = 150208513;BA.debugLine="CalendarWeeks = cw";
__ref._calendarweeks /*boolean*/  = _cw;
RDebugUtils.currentLine=150208514;
 //BA.debugLineNum = 150208514;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150208515;
 //BA.debugLineNum = 150208515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcell(b4j.example.vminputcontrol __ref,String _scell) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setcell", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setcell", new Object[] {_scell}));}
RDebugUtils.currentLine=158793728;
 //BA.debugLineNum = 158793728;BA.debugLine="Sub SetCell(scell As String) As VMInputControl";
RDebugUtils.currentLine=158793729;
 //BA.debugLineNum = 158793729;BA.debugLine="cell = scell";
__ref._cell /*String*/  = _scell;
RDebugUtils.currentLine=158793730;
 //BA.debugLineNum = 158793730;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158793731;
 //BA.debugLineNum = 158793731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcheckduplicates(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setcheckduplicates", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setcheckduplicates", new Object[] {_b}));}
RDebugUtils.currentLine=151126016;
 //BA.debugLineNum = 151126016;BA.debugLine="Sub SetCheckDuplicates(b As Boolean) As VMInputCon";
RDebugUtils.currentLine=151126017;
 //BA.debugLineNum = 151126017;BA.debugLine="CheckDuplicates = b";
__ref._checkduplicates /*boolean*/  = _b;
RDebugUtils.currentLine=151126018;
 //BA.debugLineNum = 151126018;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151126019;
 //BA.debugLineNum = 151126019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setclearable(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setclearable", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setclearable", new Object[] {_b}));}
RDebugUtils.currentLine=156696576;
 //BA.debugLineNum = 156696576;BA.debugLine="Sub SetClearable(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=156696577;
 //BA.debugLineNum = 156696577;BA.debugLine="clearable = b";
__ref._clearable /*boolean*/  = _b;
RDebugUtils.currentLine=156696578;
 //BA.debugLineNum = 156696578;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156696579;
 //BA.debugLineNum = 156696579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setclickable(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setclickable", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setclickable", new Object[] {_b}));}
RDebugUtils.currentLine=151322624;
 //BA.debugLineNum = 151322624;BA.debugLine="Sub SetClickable(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=151322625;
 //BA.debugLineNum = 151322625;BA.debugLine="Clickable = b";
__ref._clickable /*boolean*/  = _b;
RDebugUtils.currentLine=151322626;
 //BA.debugLineNum = 151322626;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151322627;
 //BA.debugLineNum = 151322627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setcount(b4j.example.vminputcontrol __ref,String _scount) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setcount", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setcount", new Object[] {_scount}));}
RDebugUtils.currentLine=152043520;
 //BA.debugLineNum = 152043520;BA.debugLine="Sub SetCount(sCount As String) As VMInputControl";
RDebugUtils.currentLine=152043521;
 //BA.debugLineNum = 152043521;BA.debugLine="Count = sCount";
__ref._count /*String*/  = _scount;
RDebugUtils.currentLine=152043522;
 //BA.debugLineNum = 152043522;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152043523;
 //BA.debugLineNum = 152043523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdatasource(b4j.example.vminputcontrol __ref,String _ssourcetable,String _ssourcefield,String _sdisplayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdatasource", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdatasource", new Object[] {_ssourcetable,_ssourcefield,_sdisplayfield}));}
RDebugUtils.currentLine=156172288;
 //BA.debugLineNum = 156172288;BA.debugLine="Sub SetDataSource(ssourceTable As String, ssourceF";
RDebugUtils.currentLine=156172289;
 //BA.debugLineNum = 156172289;BA.debugLine="UseOptions = False";
__ref._useoptions /*boolean*/  = __c.False;
RDebugUtils.currentLine=156172290;
 //BA.debugLineNum = 156172290;BA.debugLine="UseDataSource = True";
__ref._usedatasource /*boolean*/  = __c.True;
RDebugUtils.currentLine=156172291;
 //BA.debugLineNum = 156172291;BA.debugLine="sourceTable = ssourceTable";
__ref._sourcetable /*String*/  = _ssourcetable;
RDebugUtils.currentLine=156172292;
 //BA.debugLineNum = 156172292;BA.debugLine="sourceField = ssourceField";
__ref._sourcefield /*String*/  = _ssourcefield;
RDebugUtils.currentLine=156172293;
 //BA.debugLineNum = 156172293;BA.debugLine="displayField = sdisplayField";
__ref._displayfield /*String*/  = _sdisplayfield;
RDebugUtils.currentLine=156172294;
 //BA.debugLineNum = 156172294;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156172295;
 //BA.debugLineNum = 156172295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdate(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdate", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdate", null));}
RDebugUtils.currentLine=155910144;
 //BA.debugLineNum = 155910144;BA.debugLine="Sub SetDate As VMInputControl";
RDebugUtils.currentLine=155910145;
 //BA.debugLineNum = 155910145;BA.debugLine="fieldType = \"date\"";
__ref._fieldtype /*String*/  = "date";
RDebugUtils.currentLine=155910146;
 //BA.debugLineNum = 155910146;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155910147;
 //BA.debugLineNum = 155910147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdefaultvalue(b4j.example.vminputcontrol __ref,Object _sdefaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdefaultvalue", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdefaultvalue", new Object[] {_sdefaultvalue}));}
RDebugUtils.currentLine=157155328;
 //BA.debugLineNum = 157155328;BA.debugLine="Sub SetDefaultValue(sdefaultValue As Object) As VM";
RDebugUtils.currentLine=157155329;
 //BA.debugLineNum = 157155329;BA.debugLine="defaultValue = sdefaultValue";
__ref._defaultvalue /*Object*/  = _sdefaultvalue;
RDebugUtils.currentLine=157155330;
 //BA.debugLineNum = 157155330;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157155331;
 //BA.debugLineNum = 157155331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdeletable(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdeletable", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdeletable", new Object[] {_b}));}
RDebugUtils.currentLine=151388160;
 //BA.debugLineNum = 151388160;BA.debugLine="Sub SetDeletable(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=151388161;
 //BA.debugLineNum = 151388161;BA.debugLine="Deletable = b";
__ref._deletable /*boolean*/  = _b;
RDebugUtils.currentLine=151388162;
 //BA.debugLineNum = 151388162;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151388163;
 //BA.debugLineNum = 151388163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdeletecaption(b4j.example.vminputcontrol __ref,String _sdeletecaption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdeletecaption", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdeletecaption", new Object[] {_sdeletecaption}));}
RDebugUtils.currentLine=158662656;
 //BA.debugLineNum = 158662656;BA.debugLine="Sub SetDeleteCaption(sDeleteCaption As String) As";
RDebugUtils.currentLine=158662657;
 //BA.debugLineNum = 158662657;BA.debugLine="DeleteCaption = sDeleteCaption";
__ref._deletecaption /*String*/  = _sdeletecaption;
RDebugUtils.currentLine=158662658;
 //BA.debugLineNum = 158662658;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158662659;
 //BA.debugLineNum = 158662659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdeletemethod(b4j.example.vminputcontrol __ref,String _sdeletemethod) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdeletemethod", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdeletemethod", new Object[] {_sdeletemethod}));}
RDebugUtils.currentLine=158531584;
 //BA.debugLineNum = 158531584;BA.debugLine="Sub SetDeleteMethod(sDeleteMethod As String) As VM";
RDebugUtils.currentLine=158531585;
 //BA.debugLineNum = 158531585;BA.debugLine="DeleteMethod = sDeleteMethod";
__ref._deletemethod /*String*/  = _sdeletemethod;
RDebugUtils.currentLine=158531586;
 //BA.debugLineNum = 158531586;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158531587;
 //BA.debugLineNum = 158531587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdense(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdense", new Object[] {_b}));}
RDebugUtils.currentLine=154206208;
 //BA.debugLineNum = 154206208;BA.debugLine="Sub SetDense(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=154206209;
 //BA.debugLineNum = 154206209;BA.debugLine="Dense = b";
__ref._dense /*boolean*/  = _b;
RDebugUtils.currentLine=154206210;
 //BA.debugLineNum = 154206210;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154206211;
 //BA.debugLineNum = 154206211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdescription(b4j.example.vminputcontrol __ref,String _sdescription) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdescription", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdescription", new Object[] {_sdescription}));}
RDebugUtils.currentLine=157876224;
 //BA.debugLineNum = 157876224;BA.debugLine="Sub SetDescription(sDescription As String) As VMIn";
RDebugUtils.currentLine=157876225;
 //BA.debugLineNum = 157876225;BA.debugLine="Description = sDescription";
__ref._description /*String*/  = _sdescription;
RDebugUtils.currentLine=157876226;
 //BA.debugLineNum = 157876226;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157876227;
 //BA.debugLineNum = 157876227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdisabled(b4j.example.vminputcontrol __ref,boolean _sisdisabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdisabled", new Object[] {_sisdisabled}));}
RDebugUtils.currentLine=157745152;
 //BA.debugLineNum = 157745152;BA.debugLine="Sub SetDisabled(sIsDisabled As Boolean) As VMInput";
RDebugUtils.currentLine=157745153;
 //BA.debugLineNum = 157745153;BA.debugLine="IsDisabled = sIsDisabled";
__ref._isdisabled /*boolean*/  = _sisdisabled;
RDebugUtils.currentLine=157745154;
 //BA.debugLineNum = 157745154;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157745155;
 //BA.debugLineNum = 157745155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setdisplayfield(b4j.example.vminputcontrol __ref,String _sdisplayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setdisplayfield", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setdisplayfield", new Object[] {_sdisplayfield}));}
RDebugUtils.currentLine=156893184;
 //BA.debugLineNum = 156893184;BA.debugLine="Sub SetDisplayField(sdisplayField As String) As VM";
RDebugUtils.currentLine=156893185;
 //BA.debugLineNum = 156893185;BA.debugLine="displayField = sdisplayField";
__ref._displayfield /*String*/  = _sdisplayfield;
RDebugUtils.currentLine=156893186;
 //BA.debugLineNum = 156893186;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156893187;
 //BA.debugLineNum = 156893187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seteditcaption(b4j.example.vminputcontrol __ref,String _seditcaption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "seteditcaption", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "seteditcaption", new Object[] {_seditcaption}));}
RDebugUtils.currentLine=158597120;
 //BA.debugLineNum = 158597120;BA.debugLine="Sub SetEditCaption(sEditCaption As String) As VMIn";
RDebugUtils.currentLine=158597121;
 //BA.debugLineNum = 158597121;BA.debugLine="EditCaption = sEditCaption";
__ref._editcaption /*String*/  = _seditcaption;
RDebugUtils.currentLine=158597122;
 //BA.debugLineNum = 158597122;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158597123;
 //BA.debugLineNum = 158597123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seteditmethod(b4j.example.vminputcontrol __ref,String _seditmethod) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "seteditmethod", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "seteditmethod", new Object[] {_seditmethod}));}
RDebugUtils.currentLine=158466048;
 //BA.debugLineNum = 158466048;BA.debugLine="Sub SetEditMethod(sEditMethod As String) As VMInpu";
RDebugUtils.currentLine=158466049;
 //BA.debugLineNum = 158466049;BA.debugLine="EditMethod = sEditMethod";
__ref._editmethod /*String*/  = _seditmethod;
RDebugUtils.currentLine=158466050;
 //BA.debugLineNum = 158466050;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158466051;
 //BA.debugLineNum = 158466051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seterrortext(b4j.example.vminputcontrol __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "seterrortext", new Object[] {_txt}));}
RDebugUtils.currentLine=156434432;
 //BA.debugLineNum = 156434432;BA.debugLine="Sub SetErrorText(txt As String) As VMInputControl";
RDebugUtils.currentLine=156434433;
 //BA.debugLineNum = 156434433;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vminputcontrol)(this);};
RDebugUtils.currentLine=156434434;
 //BA.debugLineNum = 156434434;BA.debugLine="errorText = txt";
__ref._errortext /*String*/  = _txt;
RDebugUtils.currentLine=156434435;
 //BA.debugLineNum = 156434435;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156434436;
 //BA.debugLineNum = 156434436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setexclude(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setexclude", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setexclude", new Object[] {_b}));}
RDebugUtils.currentLine=150929408;
 //BA.debugLineNum = 150929408;BA.debugLine="Sub SetExclude(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=150929409;
 //BA.debugLineNum = 150929409;BA.debugLine="Exclude = b";
__ref._exclude /*boolean*/  = _b;
RDebugUtils.currentLine=150929410;
 //BA.debugLineNum = 150929410;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150929411;
 //BA.debugLineNum = 150929411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfab(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfab", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfab", new Object[] {_b}));}
RDebugUtils.currentLine=153354240;
 //BA.debugLineNum = 153354240;BA.debugLine="Sub SetFAB(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153354241;
 //BA.debugLineNum = 153354241;BA.debugLine="Fab = b";
__ref._fab /*boolean*/  = _b;
RDebugUtils.currentLine=153354242;
 //BA.debugLineNum = 153354242;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153354243;
 //BA.debugLineNum = 153354243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabfixed(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfabfixed", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfabfixed", new Object[] {_b}));}
RDebugUtils.currentLine=152895488;
 //BA.debugLineNum = 152895488;BA.debugLine="Sub SetFabFixed(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=152895489;
 //BA.debugLineNum = 152895489;BA.debugLine="FabFixed = b";
__ref._fabfixed /*boolean*/  = _b;
RDebugUtils.currentLine=152895490;
 //BA.debugLineNum = 152895490;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152895491;
 //BA.debugLineNum = 152895491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabposition(b4j.example.vminputcontrol __ref,String _pos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfabposition", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfabposition", new Object[] {_pos}));}
RDebugUtils.currentLine=152829952;
 //BA.debugLineNum = 152829952;BA.debugLine="Sub SetFabPosition(pos As String) As VMInputContro";
RDebugUtils.currentLine=152829953;
 //BA.debugLineNum = 152829953;BA.debugLine="FabPosition = pos";
__ref._fabposition /*String*/  = _pos;
RDebugUtils.currentLine=152829954;
 //BA.debugLineNum = 152829954;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152829955;
 //BA.debugLineNum = 152829955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositionbottomcenter(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfabpositionbottomcenter", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfabpositionbottomcenter", null));}
RDebugUtils.currentLine=152698880;
 //BA.debugLineNum = 152698880;BA.debugLine="Sub SetFabPositionBottomCenter As VMInputControl";
RDebugUtils.currentLine=152698881;
 //BA.debugLineNum = 152698881;BA.debugLine="SetFabPosition(\"md-fab-bottom-center\")";
__ref._setfabposition /*b4j.example.vminputcontrol*/ (null,"md-fab-bottom-center");
RDebugUtils.currentLine=152698882;
 //BA.debugLineNum = 152698882;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152698883;
 //BA.debugLineNum = 152698883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositionbottomleft(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfabpositionbottomleft", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfabpositionbottomleft", null));}
RDebugUtils.currentLine=152764416;
 //BA.debugLineNum = 152764416;BA.debugLine="Sub SetFabPositionBottomLeft As VMInputControl";
RDebugUtils.currentLine=152764417;
 //BA.debugLineNum = 152764417;BA.debugLine="SetFabPosition(\"md-fab-bottom-left\")";
__ref._setfabposition /*b4j.example.vminputcontrol*/ (null,"md-fab-bottom-left");
RDebugUtils.currentLine=152764418;
 //BA.debugLineNum = 152764418;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152764419;
 //BA.debugLineNum = 152764419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositionbottomright(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfabpositionbottomright", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfabpositionbottomright", null));}
RDebugUtils.currentLine=152633344;
 //BA.debugLineNum = 152633344;BA.debugLine="Sub SetFabPositionBottomRight As VMInputControl";
RDebugUtils.currentLine=152633345;
 //BA.debugLineNum = 152633345;BA.debugLine="SetFabPosition(\"md-fab-bottom-right\")";
__ref._setfabposition /*b4j.example.vminputcontrol*/ (null,"md-fab-bottom-right");
RDebugUtils.currentLine=152633346;
 //BA.debugLineNum = 152633346;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152633347;
 //BA.debugLineNum = 152633347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositiontopcenter(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfabpositiontopcenter", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfabpositiontopcenter", null));}
RDebugUtils.currentLine=152502272;
 //BA.debugLineNum = 152502272;BA.debugLine="Sub SetFabPositionTopCenter As VMInputControl";
RDebugUtils.currentLine=152502273;
 //BA.debugLineNum = 152502273;BA.debugLine="SetFabPosition(\"md-fab-top-center\")";
__ref._setfabposition /*b4j.example.vminputcontrol*/ (null,"md-fab-top-center");
RDebugUtils.currentLine=152502274;
 //BA.debugLineNum = 152502274;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152502275;
 //BA.debugLineNum = 152502275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositiontopleft(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfabpositiontopleft", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfabpositiontopleft", null));}
RDebugUtils.currentLine=152567808;
 //BA.debugLineNum = 152567808;BA.debugLine="Sub SetFabPositionTopLeft As VMInputControl";
RDebugUtils.currentLine=152567809;
 //BA.debugLineNum = 152567809;BA.debugLine="SetFabPosition(\"md-fab-top-left\")";
__ref._setfabposition /*b4j.example.vminputcontrol*/ (null,"md-fab-top-left");
RDebugUtils.currentLine=152567810;
 //BA.debugLineNum = 152567810;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152567811;
 //BA.debugLineNum = 152567811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfabpositiontopright(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfabpositiontopright", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfabpositiontopright", null));}
RDebugUtils.currentLine=152436736;
 //BA.debugLineNum = 152436736;BA.debugLine="Sub SetFabPositionTopRight As VMInputControl";
RDebugUtils.currentLine=152436737;
 //BA.debugLineNum = 152436737;BA.debugLine="SetFabPosition(\"md-fab-top-right\")";
__ref._setfabposition /*b4j.example.vminputcontrol*/ (null,"md-fab-top-right");
RDebugUtils.currentLine=152436738;
 //BA.debugLineNum = 152436738;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152436739;
 //BA.debugLineNum = 152436739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfieldtype(b4j.example.vminputcontrol __ref,String _sfieldtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfieldtype", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfieldtype", new Object[] {_sfieldtype}));}
RDebugUtils.currentLine=156958720;
 //BA.debugLineNum = 156958720;BA.debugLine="Sub SetFieldType(sfieldType As String) As VMInputC";
RDebugUtils.currentLine=156958721;
 //BA.debugLineNum = 156958721;BA.debugLine="fieldType = sfieldType";
__ref._fieldtype /*String*/  = _sfieldtype;
RDebugUtils.currentLine=156958722;
 //BA.debugLineNum = 156958722;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156958723;
 //BA.debugLineNum = 156958723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfinish(b4j.example.vminputcontrol __ref,String _sfinish) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfinish", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfinish", new Object[] {_sfinish}));}
RDebugUtils.currentLine=151912448;
 //BA.debugLineNum = 151912448;BA.debugLine="Sub SetFinish(sFinish As String) As VMInputControl";
RDebugUtils.currentLine=151912449;
 //BA.debugLineNum = 151912449;BA.debugLine="Finish = sFinish";
__ref._finish /*String*/  = _sfinish;
RDebugUtils.currentLine=151912450;
 //BA.debugLineNum = 151912450;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151912451;
 //BA.debugLineNum = 151912451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setfooter(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setfooter", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setfooter", new Object[] {_b}));}
RDebugUtils.currentLine=150470656;
 //BA.debugLineNum = 150470656;BA.debugLine="Sub SetFooter(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=150470657;
 //BA.debugLineNum = 150470657;BA.debugLine="Footer = b";
__ref._footer /*boolean*/  = _b;
RDebugUtils.currentLine=150470658;
 //BA.debugLineNum = 150470658;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150470659;
 //BA.debugLineNum = 150470659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setformat(b4j.example.vminputcontrol __ref,String _fmt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setformat", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setformat", new Object[] {_fmt}));}
RDebugUtils.currentLine=150536192;
 //BA.debugLineNum = 150536192;BA.debugLine="Sub SetFormat(fmt As String) As VMInputControl";
RDebugUtils.currentLine=150536193;
 //BA.debugLineNum = 150536193;BA.debugLine="Format = fmt";
__ref._format /*String*/  = _fmt;
RDebugUtils.currentLine=150536194;
 //BA.debugLineNum = 150536194;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150536195;
 //BA.debugLineNum = 150536195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setheader(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setheader", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setheader", new Object[] {_b}));}
RDebugUtils.currentLine=150142976;
 //BA.debugLineNum = 150142976;BA.debugLine="Sub SetHeader(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=150142977;
 //BA.debugLineNum = 150142977;BA.debugLine="Header = b";
__ref._header /*boolean*/  = _b;
RDebugUtils.currentLine=150142978;
 //BA.debugLineNum = 150142978;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150142979;
 //BA.debugLineNum = 150142979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setheight(b4j.example.vminputcontrol __ref,String _tg) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setheight", new Object[] {_tg}));}
RDebugUtils.currentLine=152240128;
 //BA.debugLineNum = 152240128;BA.debugLine="Sub SetHeight(tg As String) As VMInputControl";
RDebugUtils.currentLine=152240129;
 //BA.debugLineNum = 152240129;BA.debugLine="Height = tg";
__ref._height /*String*/  = _tg;
RDebugUtils.currentLine=152240130;
 //BA.debugLineNum = 152240130;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152240131;
 //BA.debugLineNum = 152240131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethelpertext(b4j.example.vminputcontrol __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "sethelpertext", new Object[] {_txt}));}
RDebugUtils.currentLine=156368896;
 //BA.debugLineNum = 156368896;BA.debugLine="Sub SetHelperText(txt As String) As VMInputControl";
RDebugUtils.currentLine=156368897;
 //BA.debugLineNum = 156368897;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vminputcontrol)(this);};
RDebugUtils.currentLine=156368898;
 //BA.debugLineNum = 156368898;BA.debugLine="helperText = txt";
__ref._helpertext /*String*/  = _txt;
RDebugUtils.currentLine=156368899;
 //BA.debugLineNum = 156368899;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156368900;
 //BA.debugLineNum = 156368900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethidden(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "sethidden", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "sethidden", new Object[] {_b}));}
RDebugUtils.currentLine=157089792;
 //BA.debugLineNum = 157089792;BA.debugLine="Sub SetHidden(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=157089793;
 //BA.debugLineNum = 157089793;BA.debugLine="If b = True Then";
if (_b==__c.True) { 
RDebugUtils.currentLine=157089794;
 //BA.debugLineNum = 157089794;BA.debugLine="SetVisible(False)";
__ref._setvisible /*b4j.example.vminputcontrol*/ (null,__c.False);
 }else {
RDebugUtils.currentLine=157089796;
 //BA.debugLineNum = 157089796;BA.debugLine="SetVisible(True)";
__ref._setvisible /*b4j.example.vminputcontrol*/ (null,__c.True);
 };
RDebugUtils.currentLine=157089798;
 //BA.debugLineNum = 157089798;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157089799;
 //BA.debugLineNum = 157089799;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethoverexpandeffect(b4j.example.vminputcontrol __ref,boolean _bhoverexpandeffect) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "sethoverexpandeffect", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "sethoverexpandeffect", new Object[] {_bhoverexpandeffect}));}
RDebugUtils.currentLine=151453696;
 //BA.debugLineNum = 151453696;BA.debugLine="Sub SetHoverExpandEffect(bHoverExpandEffect As Boo";
RDebugUtils.currentLine=151453697;
 //BA.debugLineNum = 151453697;BA.debugLine="HoverExpandEffect = bHoverExpandEffect";
__ref._hoverexpandeffect /*boolean*/  = _bhoverexpandeffect;
RDebugUtils.currentLine=151453698;
 //BA.debugLineNum = 151453698;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151453699;
 //BA.debugLineNum = 151453699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethoverzoomeffect(b4j.example.vminputcontrol __ref,boolean _bhoverzoomeffect) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "sethoverzoomeffect", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "sethoverzoomeffect", new Object[] {_bhoverzoomeffect}));}
RDebugUtils.currentLine=151519232;
 //BA.debugLineNum = 151519232;BA.debugLine="Sub SetHoverZoomEffect(bHoverZoomEffect As Boolean";
RDebugUtils.currentLine=151519233;
 //BA.debugLineNum = 151519233;BA.debugLine="HoverZoomEffect = bHoverZoomEffect";
__ref._hoverzoomeffect /*boolean*/  = _bhoverzoomeffect;
RDebugUtils.currentLine=151519234;
 //BA.debugLineNum = 151519234;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151519235;
 //BA.debugLineNum = 151519235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _sethref(b4j.example.vminputcontrol __ref,String _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "sethref", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "sethref", new Object[] {_b}));}
RDebugUtils.currentLine=153681920;
 //BA.debugLineNum = 153681920;BA.debugLine="Sub SetHREF(b As String) As VMInputControl";
RDebugUtils.currentLine=153681921;
 //BA.debugLineNum = 153681921;BA.debugLine="href = b";
__ref._href /*String*/  = _b;
RDebugUtils.currentLine=153681922;
 //BA.debugLineNum = 153681922;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153681923;
 //BA.debugLineNum = 153681923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticonbackgroundcolor(b4j.example.vminputcontrol __ref,String _siconbackgroundcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "seticonbackgroundcolor", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "seticonbackgroundcolor", new Object[] {_siconbackgroundcolor}));}
RDebugUtils.currentLine=151584768;
 //BA.debugLineNum = 151584768;BA.debugLine="Sub SetIconBackgroundColor(sIconBackgroundColor As";
RDebugUtils.currentLine=151584769;
 //BA.debugLineNum = 151584769;BA.debugLine="IconBackgroundColor = sIconBackgroundColor";
__ref._iconbackgroundcolor /*String*/  = _siconbackgroundcolor;
RDebugUtils.currentLine=151584770;
 //BA.debugLineNum = 151584770;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151584771;
 //BA.debugLineNum = 151584771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticoncolor(b4j.example.vminputcontrol __ref,String _siconcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "seticoncolor", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "seticoncolor", new Object[] {_siconcolor}));}
RDebugUtils.currentLine=151650304;
 //BA.debugLineNum = 151650304;BA.debugLine="Sub SetIconColor(sIconColor As String) As VMInputC";
RDebugUtils.currentLine=151650305;
 //BA.debugLineNum = 151650305;BA.debugLine="IconColor = sIconColor";
__ref._iconcolor /*String*/  = _siconcolor;
RDebugUtils.currentLine=151650306;
 //BA.debugLineNum = 151650306;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151650307;
 //BA.debugLineNum = 151650307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticonname(b4j.example.vminputcontrol __ref,String _siconname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "seticonname", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "seticonname", new Object[] {_siconname}));}
RDebugUtils.currentLine=157548544;
 //BA.debugLineNum = 157548544;BA.debugLine="Sub SetIconName(sIconName As String) As VMInputCon";
RDebugUtils.currentLine=157548545;
 //BA.debugLineNum = 157548545;BA.debugLine="IconName = sIconName";
__ref._iconname /*String*/  = _siconname;
RDebugUtils.currentLine=157548546;
 //BA.debugLineNum = 157548546;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157548547;
 //BA.debugLineNum = 157548547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _seticonsize(b4j.example.vminputcontrol __ref,String _icns) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "seticonsize", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "seticonsize", new Object[] {_icns}));}
RDebugUtils.currentLine=153944064;
 //BA.debugLineNum = 153944064;BA.debugLine="Sub SetIconSize(icns As String) As VMInputControl";
RDebugUtils.currentLine=153944065;
 //BA.debugLineNum = 153944065;BA.debugLine="IconSize = icns";
__ref._iconsize /*String*/  = _icns;
RDebugUtils.currentLine=153944066;
 //BA.debugLineNum = 153944066;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153944067;
 //BA.debugLineNum = 153944067;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setimmediately(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setimmediately", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setimmediately", new Object[] {_b}));}
RDebugUtils.currentLine=154402816;
 //BA.debugLineNum = 154402816;BA.debugLine="Sub SetImmediately(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=154402817;
 //BA.debugLineNum = 154402817;BA.debugLine="immediately = b";
__ref._immediately /*boolean*/  = _b;
RDebugUtils.currentLine=154402818;
 //BA.debugLineNum = 154402818;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154402819;
 //BA.debugLineNum = 154402819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setinputtype(b4j.example.vminputcontrol __ref,String _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setinputtype", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setinputtype", new Object[] {_i}));}
RDebugUtils.currentLine=151060480;
 //BA.debugLineNum = 151060480;BA.debugLine="Sub SetInputType(i As String) As VMInputControl";
RDebugUtils.currentLine=151060481;
 //BA.debugLineNum = 151060481;BA.debugLine="InputType = i";
__ref._inputtype /*String*/  = _i;
RDebugUtils.currentLine=151060482;
 //BA.debugLineNum = 151060482;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151060483;
 //BA.debugLineNum = 151060483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setinvalidmessage(b4j.example.vminputcontrol __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setinvalidmessage", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setinvalidmessage", new Object[] {_txt}));}
RDebugUtils.currentLine=156499968;
 //BA.debugLineNum = 156499968;BA.debugLine="Sub SetInvalidMessage(txt As String) As VMInputCon";
RDebugUtils.currentLine=156499969;
 //BA.debugLineNum = 156499969;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vminputcontrol)(this);};
RDebugUtils.currentLine=156499970;
 //BA.debugLineNum = 156499970;BA.debugLine="errorText = txt";
__ref._errortext /*String*/  = _txt;
RDebugUtils.currentLine=156499971;
 //BA.debugLineNum = 156499971;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156499972;
 //BA.debugLineNum = 156499972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setkey(b4j.example.vminputcontrol __ref,String _skey) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setkey", new Object[] {_skey}));}
RDebugUtils.currentLine=158072832;
 //BA.debugLineNum = 158072832;BA.debugLine="Sub SetKey(sKey As String) As VMInputControl";
RDebugUtils.currentLine=158072833;
 //BA.debugLineNum = 158072833;BA.debugLine="Key = sKey";
__ref._key /*String*/  = _skey;
RDebugUtils.currentLine=158072834;
 //BA.debugLineNum = 158072834;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158072835;
 //BA.debugLineNum = 158072835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlimit(b4j.example.vminputcontrol __ref,String _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setlimit", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setlimit", new Object[] {_i}));}
RDebugUtils.currentLine=151257088;
 //BA.debugLineNum = 151257088;BA.debugLine="Sub SetLimit(i As String) As VMInputControl";
RDebugUtils.currentLine=151257089;
 //BA.debugLineNum = 151257089;BA.debugLine="TheLimit = i";
__ref._thelimit /*String*/  = _i;
RDebugUtils.currentLine=151257090;
 //BA.debugLineNum = 151257090;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151257091;
 //BA.debugLineNum = 151257091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlines(b4j.example.vminputcontrol __ref,int _slines) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setlines", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setlines", new Object[] {_slines}));}
RDebugUtils.currentLine=158007296;
 //BA.debugLineNum = 158007296;BA.debugLine="Sub SetLines(sLines As Int) As VMInputControl";
RDebugUtils.currentLine=158007297;
 //BA.debugLineNum = 158007297;BA.debugLine="Lines = sLines";
__ref._lines /*int*/  = _slines;
RDebugUtils.currentLine=158007298;
 //BA.debugLineNum = 158007298;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158007299;
 //BA.debugLineNum = 158007299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlistaction(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setlistaction", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setlistaction", new Object[] {_b}));}
RDebugUtils.currentLine=153288704;
 //BA.debugLineNum = 153288704;BA.debugLine="Sub SetListAction(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153288705;
 //BA.debugLineNum = 153288705;BA.debugLine="ListAction = b";
__ref._listaction /*boolean*/  = _b;
RDebugUtils.currentLine=153288706;
 //BA.debugLineNum = 153288706;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153288707;
 //BA.debugLineNum = 153288707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setlocale(b4j.example.vminputcontrol __ref,String _loc) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setlocale", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setlocale", new Object[] {_loc}));}
RDebugUtils.currentLine=150601728;
 //BA.debugLineNum = 150601728;BA.debugLine="Sub SetLocale(loc As String) As VMInputControl";
RDebugUtils.currentLine=150601729;
 //BA.debugLineNum = 150601729;BA.debugLine="Locale = loc";
__ref._locale /*String*/  = _loc;
RDebugUtils.currentLine=150601730;
 //BA.debugLineNum = 150601730;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150601731;
 //BA.debugLineNum = 150601731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmargins(b4j.example.vminputcontrol __ref,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmargins", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmargins", new Object[] {_mt,_mb,_ml,_mr}));}
RDebugUtils.currentLine=159055872;
 //BA.debugLineNum = 159055872;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
RDebugUtils.currentLine=159055873;
 //BA.debugLineNum = 159055873;BA.debugLine="MarginTop = mt";
__ref._margintop /*Object*/  = _mt;
RDebugUtils.currentLine=159055874;
 //BA.debugLineNum = 159055874;BA.debugLine="MarginBottom = mb";
__ref._marginbottom /*Object*/  = _mb;
RDebugUtils.currentLine=159055875;
 //BA.debugLineNum = 159055875;BA.debugLine="MarginLeft = ml";
__ref._marginleft /*Object*/  = _ml;
RDebugUtils.currentLine=159055876;
 //BA.debugLineNum = 159055876;BA.debugLine="MarginRight = mr";
__ref._marginright /*Object*/  = _mr;
RDebugUtils.currentLine=159055877;
 //BA.debugLineNum = 159055877;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=159055878;
 //BA.debugLineNum = 159055878;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmaxlength(b4j.example.vminputcontrol __ref,int _smaxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmaxlength", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmaxlength", new Object[] {_smaxvalue}));}
RDebugUtils.currentLine=157351936;
 //BA.debugLineNum = 157351936;BA.debugLine="Sub SetMaxLength(sMaxValue As Int) As VMInputContr";
RDebugUtils.currentLine=157351937;
 //BA.debugLineNum = 157351937;BA.debugLine="MaxLength = sMaxValue";
__ref._maxlength /*Object*/  = (Object)(_smaxvalue);
RDebugUtils.currentLine=157351938;
 //BA.debugLineNum = 157351938;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157351939;
 //BA.debugLineNum = 157351939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmaxvalue(b4j.example.vminputcontrol __ref,int _smaxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmaxvalue", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmaxvalue", new Object[] {_smaxvalue}));}
RDebugUtils.currentLine=157286400;
 //BA.debugLineNum = 157286400;BA.debugLine="Sub SetMaxValue(sMaxValue As Int) As VMInputContro";
RDebugUtils.currentLine=157286401;
 //BA.debugLineNum = 157286401;BA.debugLine="MaxValue = sMaxValue";
__ref._maxvalue /*int*/  = _smaxvalue;
RDebugUtils.currentLine=157286402;
 //BA.debugLineNum = 157286402;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157286403;
 //BA.debugLineNum = 157286403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmenuclick(b4j.example.vminputcontrol __ref,boolean _smenuclick) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmenuclick", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmenuclick", new Object[] {_smenuclick}));}
RDebugUtils.currentLine=158334976;
 //BA.debugLineNum = 158334976;BA.debugLine="Sub SetMenuClick(sMenuClick As Boolean) As VMInput";
RDebugUtils.currentLine=158334977;
 //BA.debugLineNum = 158334977;BA.debugLine="MenuClick = sMenuClick";
__ref._menuclick /*boolean*/  = _smenuclick;
RDebugUtils.currentLine=158334978;
 //BA.debugLineNum = 158334978;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158334979;
 //BA.debugLineNum = 158334979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmenuicon(b4j.example.vminputcontrol __ref,String _smenuicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmenuicon", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmenuicon", new Object[] {_smenuicon}));}
RDebugUtils.currentLine=158269440;
 //BA.debugLineNum = 158269440;BA.debugLine="Sub SetMenuIcon(sMenuIcon As String) As VMInputCon";
RDebugUtils.currentLine=158269441;
 //BA.debugLineNum = 158269441;BA.debugLine="MenuIcon = sMenuIcon";
__ref._menuicon /*String*/  = _smenuicon;
RDebugUtils.currentLine=158269442;
 //BA.debugLineNum = 158269442;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158269443;
 //BA.debugLineNum = 158269443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmenutrigger(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmenutrigger", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmenutrigger", new Object[] {_b}));}
RDebugUtils.currentLine=153616384;
 //BA.debugLineNum = 153616384;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153616385;
 //BA.debugLineNum = 153616385;BA.debugLine="MenuTrigger = b";
__ref._menutrigger /*boolean*/  = _b;
RDebugUtils.currentLine=153616386;
 //BA.debugLineNum = 153616386;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153616387;
 //BA.debugLineNum = 153616387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmethodname(b4j.example.vminputcontrol __ref,String _smethodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmethodname", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmethodname", new Object[] {_smethodname}));}
RDebugUtils.currentLine=157483008;
 //BA.debugLineNum = 157483008;BA.debugLine="Sub SetMethodName(smethodName As String) As VMInpu";
RDebugUtils.currentLine=157483009;
 //BA.debugLineNum = 157483009;BA.debugLine="methodName = smethodName";
__ref._methodname /*String*/  = _smethodname;
RDebugUtils.currentLine=157483010;
 //BA.debugLineNum = 157483010;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157483011;
 //BA.debugLineNum = 157483011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmini(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmini", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmini", new Object[] {_b}));}
RDebugUtils.currentLine=153419776;
 //BA.debugLineNum = 153419776;BA.debugLine="Sub SetMini(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153419777;
 //BA.debugLineNum = 153419777;BA.debugLine="Mini = b";
__ref._mini /*boolean*/  = _b;
RDebugUtils.currentLine=153419778;
 //BA.debugLineNum = 153419778;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153419779;
 //BA.debugLineNum = 153419779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setminvalue(b4j.example.vminputcontrol __ref,int _sminvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setminvalue", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setminvalue", new Object[] {_sminvalue}));}
RDebugUtils.currentLine=157220864;
 //BA.debugLineNum = 157220864;BA.debugLine="Sub SetMinValue(sMinValue As Int) As VMInputContro";
RDebugUtils.currentLine=157220865;
 //BA.debugLineNum = 157220865;BA.debugLine="MinValue = sMinValue";
__ref._minvalue /*int*/  = _sminvalue;
RDebugUtils.currentLine=157220866;
 //BA.debugLineNum = 157220866;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157220867;
 //BA.debugLineNum = 157220867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmodal(b4j.example.vminputcontrol __ref,boolean _mdl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmodal", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmodal", new Object[] {_mdl}));}
RDebugUtils.currentLine=150667264;
 //BA.debugLineNum = 150667264;BA.debugLine="Sub SetModal(mdl As Boolean) As VMInputControl";
RDebugUtils.currentLine=150667265;
 //BA.debugLineNum = 150667265;BA.debugLine="Modal = mdl";
__ref._modal /*boolean*/  = _mdl;
RDebugUtils.currentLine=150667266;
 //BA.debugLineNum = 150667266;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150667267;
 //BA.debugLineNum = 150667267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmode(b4j.example.vminputcontrol __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmode", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmode", new Object[] {_s}));}
RDebugUtils.currentLine=150077440;
 //BA.debugLineNum = 150077440;BA.debugLine="Sub SetMode(s As String) As VMInputControl";
RDebugUtils.currentLine=150077441;
 //BA.debugLineNum = 150077441;BA.debugLine="Mode = s";
__ref._mode /*String*/  = _s;
RDebugUtils.currentLine=150077442;
 //BA.debugLineNum = 150077442;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150077443;
 //BA.debugLineNum = 150077443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmodule(b4j.example.vminputcontrol __ref,Object _smodule) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmodule", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmodule", new Object[] {_smodule}));}
RDebugUtils.currentLine=157417472;
 //BA.debugLineNum = 157417472;BA.debugLine="Sub SetModule(smodule As Object) As VMInputControl";
RDebugUtils.currentLine=157417473;
 //BA.debugLineNum = 157417473;BA.debugLine="module = smodule";
__ref._module /*Object*/  = _smodule;
RDebugUtils.currentLine=157417474;
 //BA.debugLineNum = 157417474;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157417475;
 //BA.debugLineNum = 157417475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setmultiple(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setmultiple", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setmultiple", new Object[] {_b}));}
RDebugUtils.currentLine=156565504;
 //BA.debugLineNum = 156565504;BA.debugLine="Sub SetMultiple(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=156565505;
 //BA.debugLineNum = 156565505;BA.debugLine="multiple = b";
__ref._multiple /*boolean*/  = _b;
RDebugUtils.currentLine=156565506;
 //BA.debugLineNum = 156565506;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156565507;
 //BA.debugLineNum = 156565507;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setname(b4j.example.vminputcontrol __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setname", new Object[] {_sname}));}
RDebugUtils.currentLine=150863872;
 //BA.debugLineNum = 150863872;BA.debugLine="Sub SetName(sname As String) As VMInputControl";
RDebugUtils.currentLine=150863873;
 //BA.debugLineNum = 150863873;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=150863874;
 //BA.debugLineNum = 150863874;BA.debugLine="sname = sname.trim";
_sname = _sname.trim();
RDebugUtils.currentLine=150863875;
 //BA.debugLineNum = 150863875;BA.debugLine="name = sname";
__ref._name /*String*/  = _sname;
RDebugUtils.currentLine=150863876;
 //BA.debugLineNum = 150863876;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150863877;
 //BA.debugLineNum = 150863877;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setnumber(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setnumber", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setnumber", null));}
RDebugUtils.currentLine=155713536;
 //BA.debugLineNum = 155713536;BA.debugLine="Sub SetNumber As VMInputControl";
RDebugUtils.currentLine=155713537;
 //BA.debugLineNum = 155713537;BA.debugLine="typeOf = \"number\"";
__ref._typeof /*String*/  = "number";
RDebugUtils.currentLine=155713538;
 //BA.debugLineNum = 155713538;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155713539;
 //BA.debugLineNum = 155713539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setoffsets(b4j.example.vminputcontrol __ref,String _soffsetsmall,String _soffsetmedium,String _soffsetlarge,String _soffsetxlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setoffsets", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setoffsets", new Object[] {_soffsetsmall,_soffsetmedium,_soffsetlarge,_soffsetxlarge}));}
RDebugUtils.currentLine=158924800;
 //BA.debugLineNum = 158924800;BA.debugLine="Sub SetOffsets(sOffsetSmall As String, sOffsetMedi";
RDebugUtils.currentLine=158924801;
 //BA.debugLineNum = 158924801;BA.debugLine="OffsetSmall = sOffsetSmall";
__ref._offsetsmall /*String*/  = _soffsetsmall;
RDebugUtils.currentLine=158924802;
 //BA.debugLineNum = 158924802;BA.debugLine="OffsetMedium = sOffsetMedium";
__ref._offsetmedium /*String*/  = _soffsetmedium;
RDebugUtils.currentLine=158924803;
 //BA.debugLineNum = 158924803;BA.debugLine="OffsetLarge = sOffsetLarge";
__ref._offsetlarge /*String*/  = _soffsetlarge;
RDebugUtils.currentLine=158924804;
 //BA.debugLineNum = 158924804;BA.debugLine="OffsetXLarge = sOffsetXLarge";
__ref._offsetxlarge /*String*/  = _soffsetxlarge;
RDebugUtils.currentLine=158924805;
 //BA.debugLineNum = 158924805;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158924806;
 //BA.debugLineNum = 158924806;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setopenonfocus(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setopenonfocus", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setopenonfocus", new Object[] {_b}));}
RDebugUtils.currentLine=154337280;
 //BA.debugLineNum = 154337280;BA.debugLine="Sub SetOpenOnFocus(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=154337281;
 //BA.debugLineNum = 154337281;BA.debugLine="openonfocus = b";
__ref._openonfocus /*boolean*/  = _b;
RDebugUtils.currentLine=154337282;
 //BA.debugLineNum = 154337282;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154337283;
 //BA.debugLineNum = 154337283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setoptions(b4j.example.vminputcontrol __ref,String _ssourcetable,anywheresoftware.b4a.objects.collections.Map _soptions,String _ssourcefield,String _sdisplayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setoptions", new Object[] {_ssourcetable,_soptions,_ssourcefield,_sdisplayfield}));}
RDebugUtils.currentLine=156106752;
 //BA.debugLineNum = 156106752;BA.debugLine="Sub SetOptions(ssourceTable As String, soptions As";
RDebugUtils.currentLine=156106753;
 //BA.debugLineNum = 156106753;BA.debugLine="UseOptions = True";
__ref._useoptions /*boolean*/  = __c.True;
RDebugUtils.currentLine=156106754;
 //BA.debugLineNum = 156106754;BA.debugLine="UseDataSource = False";
__ref._usedatasource /*boolean*/  = __c.False;
RDebugUtils.currentLine=156106755;
 //BA.debugLineNum = 156106755;BA.debugLine="sourceTable = ssourceTable";
__ref._sourcetable /*String*/  = _ssourcetable;
RDebugUtils.currentLine=156106756;
 //BA.debugLineNum = 156106756;BA.debugLine="options = soptions";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/  = _soptions;
RDebugUtils.currentLine=156106757;
 //BA.debugLineNum = 156106757;BA.debugLine="sourceField = ssourceField";
__ref._sourcefield /*String*/  = _ssourcefield;
RDebugUtils.currentLine=156106758;
 //BA.debugLineNum = 156106758;BA.debugLine="displayField = sdisplayField";
__ref._displayfield /*String*/  = _sdisplayfield;
RDebugUtils.currentLine=156106759;
 //BA.debugLineNum = 156106759;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156106760;
 //BA.debugLineNum = 156106760;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setpadding(b4j.example.vminputcontrol __ref,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setpadding", new Object[] {_pt,_pb,_pl,_pr}));}
RDebugUtils.currentLine=159121408;
 //BA.debugLineNum = 159121408;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
RDebugUtils.currentLine=159121409;
 //BA.debugLineNum = 159121409;BA.debugLine="PaddingTop = pt";
__ref._paddingtop /*Object*/  = _pt;
RDebugUtils.currentLine=159121410;
 //BA.debugLineNum = 159121410;BA.debugLine="PaddingBottom = pb";
__ref._paddingbottom /*Object*/  = _pb;
RDebugUtils.currentLine=159121411;
 //BA.debugLineNum = 159121411;BA.debugLine="PaddingLeft = pl";
__ref._paddingleft /*Object*/  = _pl;
RDebugUtils.currentLine=159121412;
 //BA.debugLineNum = 159121412;BA.debugLine="PaddingRight = pr";
__ref._paddingright /*Object*/  = _pr;
RDebugUtils.currentLine=159121413;
 //BA.debugLineNum = 159121413;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=159121414;
 //BA.debugLineNum = 159121414;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setplaceholder(b4j.example.vminputcontrol __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setplaceholder", new Object[] {_txt}));}
RDebugUtils.currentLine=154271744;
 //BA.debugLineNum = 154271744;BA.debugLine="Sub SetPlaceHolder(txt As String) As VMInputContro";
RDebugUtils.currentLine=154271745;
 //BA.debugLineNum = 154271745;BA.debugLine="PlaceHolder = txt";
__ref._placeholder /*String*/  = _txt;
RDebugUtils.currentLine=154271746;
 //BA.debugLineNum = 154271746;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154271747;
 //BA.debugLineNum = 154271747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setplain(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setplain", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setplain", new Object[] {_b}));}
RDebugUtils.currentLine=153485312;
 //BA.debugLineNum = 153485312;BA.debugLine="Sub SetPlain(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153485313;
 //BA.debugLineNum = 153485313;BA.debugLine="Plain = b";
__ref._plain /*boolean*/  = _b;
RDebugUtils.currentLine=153485314;
 //BA.debugLineNum = 153485314;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153485315;
 //BA.debugLineNum = 153485315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setradio(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setradio", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setradio", null));}
RDebugUtils.currentLine=154664960;
 //BA.debugLineNum = 154664960;BA.debugLine="Sub SetRadio As VMInputControl";
RDebugUtils.currentLine=154664961;
 //BA.debugLineNum = 154664961;BA.debugLine="typeOf = \"radio\"";
__ref._typeof /*String*/  = "radio";
RDebugUtils.currentLine=154664962;
 //BA.debugLineNum = 154664962;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154664963;
 //BA.debugLineNum = 154664963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setreadonly(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setreadonly", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setreadonly", new Object[] {_b}));}
RDebugUtils.currentLine=150994944;
 //BA.debugLineNum = 150994944;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=150994945;
 //BA.debugLineNum = 150994945;BA.debugLine="readonly = b";
__ref._readonly /*boolean*/  = _b;
RDebugUtils.currentLine=150994946;
 //BA.debugLineNum = 150994946;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150994947;
 //BA.debugLineNum = 150994947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setrefreshinterval(b4j.example.vminputcontrol __ref,String _srefreshinterval) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setrefreshinterval", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setrefreshinterval", new Object[] {_srefreshinterval}));}
RDebugUtils.currentLine=151781376;
 //BA.debugLineNum = 151781376;BA.debugLine="Sub SetRefreshInterval(sRefreshInterval As String)";
RDebugUtils.currentLine=151781377;
 //BA.debugLineNum = 151781377;BA.debugLine="RefreshInterval = sRefreshInterval";
__ref._refreshinterval /*String*/  = _srefreshinterval;
RDebugUtils.currentLine=151781378;
 //BA.debugLineNum = 151781378;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151781379;
 //BA.debugLineNum = 151781379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setrequired(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setrequired", new Object[] {_b}));}
RDebugUtils.currentLine=156631040;
 //BA.debugLineNum = 156631040;BA.debugLine="Sub SetRequired(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=156631041;
 //BA.debugLineNum = 156631041;BA.debugLine="Required = b";
__ref._required /*boolean*/  = _b;
RDebugUtils.currentLine=156631042;
 //BA.debugLineNum = 156631042;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156631043;
 //BA.debugLineNum = 156631043;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setripple(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setripple", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setripple", new Object[] {_b}));}
RDebugUtils.currentLine=153812992;
 //BA.debugLineNum = 153812992;BA.debugLine="Sub SetRipple(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=153812993;
 //BA.debugLineNum = 153812993;BA.debugLine="Ripple = b";
__ref._ripple /*boolean*/  = _b;
RDebugUtils.currentLine=153812994;
 //BA.debugLineNum = 153812994;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=153812995;
 //BA.debugLineNum = 153812995;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setround(b4j.example.vminputcontrol __ref,boolean _tg) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setround", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setround", new Object[] {_tg}));}
RDebugUtils.currentLine=152109056;
 //BA.debugLineNum = 152109056;BA.debugLine="Sub SetRound(tg As Boolean) As VMInputControl";
RDebugUtils.currentLine=152109057;
 //BA.debugLineNum = 152109057;BA.debugLine="IsRound = tg";
__ref._isround /*boolean*/  = _tg;
RDebugUtils.currentLine=152109058;
 //BA.debugLineNum = 152109058;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152109059;
 //BA.debugLineNum = 152109059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setrow(b4j.example.vminputcontrol __ref,String _srow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setrow", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setrow", new Object[] {_srow}));}
RDebugUtils.currentLine=158728192;
 //BA.debugLineNum = 158728192;BA.debugLine="Sub SetRow(sRow As String) As VMInputControl";
RDebugUtils.currentLine=158728193;
 //BA.debugLineNum = 158728193;BA.debugLine="Row = sRow";
__ref._row /*String*/  = _srow;
RDebugUtils.currentLine=158728194;
 //BA.debugLineNum = 158728194;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158728195;
 //BA.debugLineNum = 158728195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setshowothermonths(b4j.example.vminputcontrol __ref,boolean _som) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setshowothermonths", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setshowothermonths", new Object[] {_som}));}
RDebugUtils.currentLine=150274048;
 //BA.debugLineNum = 150274048;BA.debugLine="Sub SetShowOtherMonths(som As Boolean) As VMInputC";
RDebugUtils.currentLine=150274049;
 //BA.debugLineNum = 150274049;BA.debugLine="ShowOtherMonths = som";
__ref._showothermonths /*boolean*/  = _som;
RDebugUtils.currentLine=150274050;
 //BA.debugLineNum = 150274050;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150274051;
 //BA.debugLineNum = 150274051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsize(b4j.example.vminputcontrol __ref,String _ssize) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setsize", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setsize", new Object[] {_ssize}));}
RDebugUtils.currentLine=150405120;
 //BA.debugLineNum = 150405120;BA.debugLine="Sub SetSize(sSize As String) As VMInputControl";
RDebugUtils.currentLine=150405121;
 //BA.debugLineNum = 150405121;BA.debugLine="Size = sSize";
__ref._size /*String*/  = _ssize;
RDebugUtils.currentLine=150405122;
 //BA.debugLineNum = 150405122;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150405123;
 //BA.debugLineNum = 150405123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsizes(b4j.example.vminputcontrol __ref,String _ssizesmall,String _ssizemedium,String _ssizelarge,String _ssizexlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setsizes", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setsizes", new Object[] {_ssizesmall,_ssizemedium,_ssizelarge,_ssizexlarge}));}
RDebugUtils.currentLine=158990336;
 //BA.debugLineNum = 158990336;BA.debugLine="Sub SetSizes(sSizeSmall As String, sSizeMedium As";
RDebugUtils.currentLine=158990337;
 //BA.debugLineNum = 158990337;BA.debugLine="SizeSmall = sSizeSmall";
__ref._sizesmall /*String*/  = _ssizesmall;
RDebugUtils.currentLine=158990338;
 //BA.debugLineNum = 158990338;BA.debugLine="SizeMedium = sSizeMedium";
__ref._sizemedium /*String*/  = _ssizemedium;
RDebugUtils.currentLine=158990339;
 //BA.debugLineNum = 158990339;BA.debugLine="SizeLarge = sSizeLarge";
__ref._sizelarge /*String*/  = _ssizelarge;
RDebugUtils.currentLine=158990340;
 //BA.debugLineNum = 158990340;BA.debugLine="SizeXLarge = sSizeXLarge";
__ref._sizexlarge /*String*/  = _ssizexlarge;
RDebugUtils.currentLine=158990341;
 //BA.debugLineNum = 158990341;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158990342;
 //BA.debugLineNum = 158990342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsource(b4j.example.vminputcontrol __ref,String _ssource) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setsource", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setsource", new Object[] {_ssource}));}
RDebugUtils.currentLine=158138368;
 //BA.debugLineNum = 158138368;BA.debugLine="Sub SetSource(sSource As String) As VMInputControl";
RDebugUtils.currentLine=158138369;
 //BA.debugLineNum = 158138369;BA.debugLine="Source = sSource";
__ref._source /*String*/  = _ssource;
RDebugUtils.currentLine=158138370;
 //BA.debugLineNum = 158138370;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158138371;
 //BA.debugLineNum = 158138371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsourcefield(b4j.example.vminputcontrol __ref,String _ssourcefield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setsourcefield", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setsourcefield", new Object[] {_ssourcefield}));}
RDebugUtils.currentLine=156827648;
 //BA.debugLineNum = 156827648;BA.debugLine="Sub SetSourceField(ssourceField As String) As VMIn";
RDebugUtils.currentLine=156827649;
 //BA.debugLineNum = 156827649;BA.debugLine="sourceField = ssourceField";
__ref._sourcefield /*String*/  = _ssourcefield;
RDebugUtils.currentLine=156827650;
 //BA.debugLineNum = 156827650;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156827651;
 //BA.debugLineNum = 156827651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setsourcetable(b4j.example.vminputcontrol __ref,String _ssourcetable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setsourcetable", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setsourcetable", new Object[] {_ssourcetable}));}
RDebugUtils.currentLine=156762112;
 //BA.debugLineNum = 156762112;BA.debugLine="Sub SetSourceTable(ssourceTable As String) As VMIn";
RDebugUtils.currentLine=156762113;
 //BA.debugLineNum = 156762113;BA.debugLine="sourceTable = ssourceTable";
__ref._sourcetable /*String*/  = _ssourcetable;
RDebugUtils.currentLine=156762114;
 //BA.debugLineNum = 156762114;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156762115;
 //BA.debugLineNum = 156762115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setspeed(b4j.example.vminputcontrol __ref,String _sspeed) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setspeed", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setspeed", new Object[] {_sspeed}));}
RDebugUtils.currentLine=151846912;
 //BA.debugLineNum = 151846912;BA.debugLine="Sub SetSpeed(sSpeed As String) As VMInputControl";
RDebugUtils.currentLine=151846913;
 //BA.debugLineNum = 151846913;BA.debugLine="Speed = sSpeed";
__ref._speed /*String*/  = _sspeed;
RDebugUtils.currentLine=151846914;
 //BA.debugLineNum = 151846914;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151846915;
 //BA.debugLineNum = 151846915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setstart(b4j.example.vminputcontrol __ref,String _sstart) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setstart", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setstart", new Object[] {_sstart}));}
RDebugUtils.currentLine=151977984;
 //BA.debugLineNum = 151977984;BA.debugLine="Sub SetStart(sStart As String) As VMInputControl";
RDebugUtils.currentLine=151977985;
 //BA.debugLineNum = 151977985;BA.debugLine="Start = sStart";
__ref._start /*String*/  = _sstart;
RDebugUtils.currentLine=151977986;
 //BA.debugLineNum = 151977986;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151977987;
 //BA.debugLineNum = 151977987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setstatic(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setstatic", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setstatic", new Object[] {_b}));}
RDebugUtils.currentLine=151191552;
 //BA.debugLineNum = 151191552;BA.debugLine="Sub SetStatic(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=151191553;
 //BA.debugLineNum = 151191553;BA.debugLine="Static = b";
__ref._static /*boolean*/  = _b;
RDebugUtils.currentLine=151191554;
 //BA.debugLineNum = 151191554;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=151191555;
 //BA.debugLineNum = 151191555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setstring(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setstring", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setstring", null));}
RDebugUtils.currentLine=155648000;
 //BA.debugLineNum = 155648000;BA.debugLine="Sub SetString As VMInputControl";
RDebugUtils.currentLine=155648001;
 //BA.debugLineNum = 155648001;BA.debugLine="fieldType = \"string\"";
__ref._fieldtype /*String*/  = "string";
RDebugUtils.currentLine=155648002;
 //BA.debugLineNum = 155648002;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155648003;
 //BA.debugLineNum = 155648003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settabindex(b4j.example.vminputcontrol __ref,int _idx) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "settabindex", new Object[] {_idx}));}
RDebugUtils.currentLine=154533888;
 //BA.debugLineNum = 154533888;BA.debugLine="Sub SetTabIndex(idx As Int) As VMInputControl";
RDebugUtils.currentLine=154533889;
 //BA.debugLineNum = 154533889;BA.debugLine="TabIndex = idx";
__ref._tabindex /*int*/  = _idx;
RDebugUtils.currentLine=154533890;
 //BA.debugLineNum = 154533890;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154533891;
 //BA.debugLineNum = 154533891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settag(b4j.example.vminputcontrol __ref,String _tg) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "settag", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "settag", new Object[] {_tg}));}
RDebugUtils.currentLine=152371200;
 //BA.debugLineNum = 152371200;BA.debugLine="Sub SetTag(tg As String) As VMInputControl";
RDebugUtils.currentLine=152371201;
 //BA.debugLineNum = 152371201;BA.debugLine="Tag = tg";
__ref._tag /*String*/  = _tg;
RDebugUtils.currentLine=152371202;
 //BA.debugLineNum = 152371202;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152371203;
 //BA.debugLineNum = 152371203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settel(b4j.example.vminputcontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "settel", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "settel", null));}
RDebugUtils.currentLine=155516928;
 //BA.debugLineNum = 155516928;BA.debugLine="Sub SetTel As VMInputControl";
RDebugUtils.currentLine=155516929;
 //BA.debugLineNum = 155516929;BA.debugLine="typeOf = \"tel\"";
__ref._typeof /*String*/  = "tel";
RDebugUtils.currentLine=155516930;
 //BA.debugLineNum = 155516930;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=155516931;
 //BA.debugLineNum = 155516931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settext(b4j.example.vminputcontrol __ref,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "settext", new Object[] {_stext}));}
RDebugUtils.currentLine=157810688;
 //BA.debugLineNum = 157810688;BA.debugLine="Sub SetText(sText As String) As VMInputControl";
RDebugUtils.currentLine=157810689;
 //BA.debugLineNum = 157810689;BA.debugLine="Text = sText";
__ref._text /*String*/  = _stext;
RDebugUtils.currentLine=157810690;
 //BA.debugLineNum = 157810690;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157810691;
 //BA.debugLineNum = 157810691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setthirdline(b4j.example.vminputcontrol __ref,String _sthirdline) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setthirdline", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setthirdline", new Object[] {_sthirdline}));}
RDebugUtils.currentLine=157941760;
 //BA.debugLineNum = 157941760;BA.debugLine="Sub SetThirdLine(sThirdLine As String) As VMInputC";
RDebugUtils.currentLine=157941761;
 //BA.debugLineNum = 157941761;BA.debugLine="ThirdLine = sThirdLine";
__ref._thirdline /*String*/  = _sthirdline;
RDebugUtils.currentLine=157941762;
 //BA.debugLineNum = 157941762;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=157941763;
 //BA.debugLineNum = 157941763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setthumblabel(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setthumblabel", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setthumblabel", new Object[] {_b}));}
RDebugUtils.currentLine=154009600;
 //BA.debugLineNum = 154009600;BA.debugLine="Sub SetThumbLabel(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=154009601;
 //BA.debugLineNum = 154009601;BA.debugLine="ThumbLabel = b";
__ref._thumblabel /*boolean*/  = _b;
RDebugUtils.currentLine=154009602;
 //BA.debugLineNum = 154009602;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154009603;
 //BA.debugLineNum = 154009603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setto(b4j.example.vminputcontrol __ref,String _sto) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setto", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setto", new Object[] {_sto}));}
RDebugUtils.currentLine=152961024;
 //BA.debugLineNum = 152961024;BA.debugLine="Sub SetTo(sTo As String) As VMInputControl";
RDebugUtils.currentLine=152961025;
 //BA.debugLineNum = 152961025;BA.debugLine="NavigateTo = sTo";
__ref._navigateto /*String*/  = _sto;
RDebugUtils.currentLine=152961026;
 //BA.debugLineNum = 152961026;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152961027;
 //BA.debugLineNum = 152961027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settogglepassword(b4j.example.vminputcontrol __ref,boolean _btogglepassword) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "settogglepassword", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "settogglepassword", new Object[] {_btogglepassword}));}
RDebugUtils.currentLine=150732800;
 //BA.debugLineNum = 150732800;BA.debugLine="Sub SetTogglePassword(bTogglePassword As Boolean)";
RDebugUtils.currentLine=150732801;
 //BA.debugLineNum = 150732801;BA.debugLine="TogglePassword = bTogglePassword";
__ref._togglepassword /*boolean*/  = _btogglepassword;
RDebugUtils.currentLine=150732802;
 //BA.debugLineNum = 150732802;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150732803;
 //BA.debugLineNum = 150732803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _settype(b4j.example.vminputcontrol __ref,String _stypeof) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "settype", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "settype", new Object[] {_stypeof}));}
RDebugUtils.currentLine=156303360;
 //BA.debugLineNum = 156303360;BA.debugLine="Sub SetType(stypeOf As String) As VMInputControl";
RDebugUtils.currentLine=156303361;
 //BA.debugLineNum = 156303361;BA.debugLine="typeOf = stypeOf";
__ref._typeof /*String*/  = _stypeof;
RDebugUtils.currentLine=156303362;
 //BA.debugLineNum = 156303362;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=156303363;
 //BA.debugLineNum = 156303363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setusedatasource(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setusedatasource", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setusedatasource", new Object[] {_b}));}
RDebugUtils.currentLine=154140672;
 //BA.debugLineNum = 154140672;BA.debugLine="Sub SetUseDataSource(b As Boolean) As VMInputContr";
RDebugUtils.currentLine=154140673;
 //BA.debugLineNum = 154140673;BA.debugLine="UseDataSource = b";
__ref._usedatasource /*boolean*/  = _b;
RDebugUtils.currentLine=154140674;
 //BA.debugLineNum = 154140674;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154140675;
 //BA.debugLineNum = 154140675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setuseoptions(b4j.example.vminputcontrol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setuseoptions", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setuseoptions", new Object[] {_b}));}
RDebugUtils.currentLine=154075136;
 //BA.debugLineNum = 154075136;BA.debugLine="Sub SetUseOptions(b As Boolean) As VMInputControl";
RDebugUtils.currentLine=154075137;
 //BA.debugLineNum = 154075137;BA.debugLine="UseOptions = b";
__ref._useoptions /*boolean*/  = _b;
RDebugUtils.currentLine=154075138;
 //BA.debugLineNum = 154075138;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=154075139;
 //BA.debugLineNum = 154075139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setvalue(b4j.example.vminputcontrol __ref,String _valu) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setvalue", new Object[] {_valu}));}
RDebugUtils.currentLine=150339584;
 //BA.debugLineNum = 150339584;BA.debugLine="Sub SetValue(valu As String) As VMInputControl";
RDebugUtils.currentLine=150339585;
 //BA.debugLineNum = 150339585;BA.debugLine="Value = valu";
__ref._value /*String*/  = _valu;
RDebugUtils.currentLine=150339586;
 //BA.debugLineNum = 150339586;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=150339587;
 //BA.debugLineNum = 150339587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setvisibility(b4j.example.vminputcontrol __ref,String _svisibility) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setvisibility", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setvisibility", new Object[] {_svisibility}));}
RDebugUtils.currentLine=158859264;
 //BA.debugLineNum = 158859264;BA.debugLine="Sub SetVisibility(sVisibility As String) As VMInpu";
RDebugUtils.currentLine=158859265;
 //BA.debugLineNum = 158859265;BA.debugLine="Visibility = sVisibility";
__ref._visibility /*String*/  = _svisibility;
RDebugUtils.currentLine=158859266;
 //BA.debugLineNum = 158859266;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=158859267;
 //BA.debugLineNum = 158859267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _setwidth(b4j.example.vminputcontrol __ref,String _tg) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminputcontrol";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "setwidth", new Object[] {_tg}));}
RDebugUtils.currentLine=152305664;
 //BA.debugLineNum = 152305664;BA.debugLine="Sub SetWidth(tg As String) As VMInputControl";
RDebugUtils.currentLine=152305665;
 //BA.debugLineNum = 152305665;BA.debugLine="Width = tg";
__ref._width /*String*/  = _tg;
RDebugUtils.currentLine=152305666;
 //BA.debugLineNum = 152305666;BA.debugLine="Return Me";
if (true) return (b4j.example.vminputcontrol)(this);
RDebugUtils.currentLine=152305667;
 //BA.debugLineNum = 152305667;BA.debugLine="End Sub";
return null;
}
}