package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vminfobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vminfobox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vminfobox.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _infobox = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmelement _icon = null;
public b4j.example.vmelement _content = null;
public b4j.example.vmelement _text = null;
public b4j.example.vmelement _countit = null;
public b4j.example.vmelement _i = null;
public boolean _hasicon = false;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vminfobox  _initialize(b4j.example.vminfobox __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=145227776;
 //BA.debugLineNum = 145227776;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=145227777;
 //BA.debugLineNum = 145227777;BA.debugLine="banano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jquery-3.4.1.min.js");
RDebugUtils.currentLine=145227778;
 //BA.debugLineNum = 145227778;BA.debugLine="banano.DependsOnAsset(\"info-box.css\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("info-box.css");
RDebugUtils.currentLine=145227779;
 //BA.debugLineNum = 145227779;BA.debugLine="banano.DependsOnAsset(\"jquery.countTo.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jquery.countTo.js");
RDebugUtils.currentLine=145227780;
 //BA.debugLineNum = 145227780;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=145227781;
 //BA.debugLineNum = 145227781;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=145227782;
 //BA.debugLineNum = 145227782;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=145227783;
 //BA.debugLineNum = 145227783;BA.debugLine="InfoBox.Initialize(vue, ID).SetTag(\"div\").AddClas";
__ref._infobox /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"info-box");
RDebugUtils.currentLine=145227784;
 //BA.debugLineNum = 145227784;BA.debugLine="Icon.Initialize(vue, $\"${ID}icn\"$).SetTag(\"div\").";
__ref._icon /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icn"))._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"icon");
RDebugUtils.currentLine=145227785;
 //BA.debugLineNum = 145227785;BA.debugLine="Content.Initialize(vue,$\"${ID}content\"$).SetTag(\"";
__ref._content /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"content"))._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"content");
RDebugUtils.currentLine=145227786;
 //BA.debugLineNum = 145227786;BA.debugLine="Text.Initialize(vue,$\"${ID}text\"$).SetTag(\"div\").";
__ref._text /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"text"))._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"text");
RDebugUtils.currentLine=145227787;
 //BA.debugLineNum = 145227787;BA.debugLine="CountIt.Initialize(vue,$\"${ID}number\"$).SetTag(\"d";
__ref._countit /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"number"))._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"number");
RDebugUtils.currentLine=145227788;
 //BA.debugLineNum = 145227788;BA.debugLine="i.Initialize(vue,$\"${ID}i\"$).SetTag(\"i\").AddClass";
__ref._i /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"i"))._settag /*b4j.example.vmelement*/ (null,"i")._addclass /*b4j.example.vmelement*/ (null,"material-icons");
RDebugUtils.currentLine=145227789;
 //BA.debugLineNum = 145227789;BA.debugLine="hasIcon = False";
__ref._hasicon /*boolean*/  = __c.False;
RDebugUtils.currentLine=145227790;
 //BA.debugLineNum = 145227790;BA.debugLine="InfoBox.SetOnClick(module, $\"${ID}_click\"$)";
__ref._infobox /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=145227791;
 //BA.debugLineNum = 145227791;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145227792;
 //BA.debugLineNum = 145227792;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setfrom(b4j.example.vminfobox __ref,String _startfrom) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setfrom", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setfrom", new Object[] {_startfrom}));}
RDebugUtils.currentLine=145817600;
 //BA.debugLineNum = 145817600;BA.debugLine="Sub SetFrom(startFrom As String) As VMInfoBox";
RDebugUtils.currentLine=145817601;
 //BA.debugLineNum = 145817601;BA.debugLine="If startFrom = \"\" Then Return Me";
if ((_startfrom).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=145817602;
 //BA.debugLineNum = 145817602;BA.debugLine="CountIt.AddClass(\"count-to\")";
__ref._countit /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"count-to");
RDebugUtils.currentLine=145817603;
 //BA.debugLineNum = 145817603;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-from\": startFrom)";
__ref._countit /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-from"),(Object)(_startfrom)}));
RDebugUtils.currentLine=145817604;
 //BA.debugLineNum = 145817604;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145817605;
 //BA.debugLineNum = 145817605;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setto(b4j.example.vminfobox __ref,String _endto) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setto", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setto", new Object[] {_endto}));}
RDebugUtils.currentLine=145883136;
 //BA.debugLineNum = 145883136;BA.debugLine="Sub SetTo(endTo As String) As VMInfoBox";
RDebugUtils.currentLine=145883137;
 //BA.debugLineNum = 145883137;BA.debugLine="If endTo = \"\" Then Return Me";
if ((_endto).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=145883138;
 //BA.debugLineNum = 145883138;BA.debugLine="CountIt.AddClass(\"count-to\")";
__ref._countit /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"count-to");
RDebugUtils.currentLine=145883139;
 //BA.debugLineNum = 145883139;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-to\": endTo))";
__ref._countit /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-to"),(Object)(_endto)}));
RDebugUtils.currentLine=145883140;
 //BA.debugLineNum = 145883140;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145883141;
 //BA.debugLineNum = 145883141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setspeed(b4j.example.vminfobox __ref,String _speed) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setspeed", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setspeed", new Object[] {_speed}));}
RDebugUtils.currentLine=146014208;
 //BA.debugLineNum = 146014208;BA.debugLine="Sub SetSpeed(speed As String) As VMInfoBox";
RDebugUtils.currentLine=146014209;
 //BA.debugLineNum = 146014209;BA.debugLine="If speed = \"\" Then Return Me";
if ((_speed).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=146014210;
 //BA.debugLineNum = 146014210;BA.debugLine="CountIt.AddClass(\"count-to\")";
__ref._countit /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"count-to");
RDebugUtils.currentLine=146014211;
 //BA.debugLineNum = 146014211;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-speed\":speed))";
__ref._countit /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-speed"),(Object)(_speed)}));
RDebugUtils.currentLine=146014212;
 //BA.debugLineNum = 146014212;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146014213;
 //BA.debugLineNum = 146014213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setrefreshinterval(b4j.example.vminfobox __ref,String _interval) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setrefreshinterval", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setrefreshinterval", new Object[] {_interval}));}
RDebugUtils.currentLine=146079744;
 //BA.debugLineNum = 146079744;BA.debugLine="Sub SetRefreshInterval(interval As String) As VMIn";
RDebugUtils.currentLine=146079745;
 //BA.debugLineNum = 146079745;BA.debugLine="If interval = \"\" Then Return Me";
if ((_interval).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=146079746;
 //BA.debugLineNum = 146079746;BA.debugLine="CountIt.AddClass(\"count-to\")";
__ref._countit /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"count-to");
RDebugUtils.currentLine=146079747;
 //BA.debugLineNum = 146079747;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-fresh-interval\":i";
__ref._countit /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-fresh-interval"),(Object)(_interval)}));
RDebugUtils.currentLine=146079748;
 //BA.debugLineNum = 146079748;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146079749;
 //BA.debugLineNum = 146079749;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setnumber(b4j.example.vminfobox __ref,String _numo) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setnumber", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setnumber", new Object[] {_numo}));}
RDebugUtils.currentLine=145948672;
 //BA.debugLineNum = 145948672;BA.debugLine="Sub SetNumber(numo As String) As VMInfoBox";
RDebugUtils.currentLine=145948673;
 //BA.debugLineNum = 145948673;BA.debugLine="CountIt.SetText(numo)";
__ref._countit /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_numo);
RDebugUtils.currentLine=145948674;
 //BA.debugLineNum = 145948674;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145948675;
 //BA.debugLineNum = 145948675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _seticon(b4j.example.vminfobox __ref,String _maticon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "seticon", new Object[] {_maticon}));}
RDebugUtils.currentLine=146145280;
 //BA.debugLineNum = 146145280;BA.debugLine="Sub SetIcon(matIcon As String) As VMInfoBox";
RDebugUtils.currentLine=146145281;
 //BA.debugLineNum = 146145281;BA.debugLine="If matIcon = \"\" Then Return Me";
if ((_maticon).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=146145282;
 //BA.debugLineNum = 146145282;BA.debugLine="hasIcon = True";
__ref._hasicon /*boolean*/  = __c.True;
RDebugUtils.currentLine=146145283;
 //BA.debugLineNum = 146145283;BA.debugLine="i.SetText(matIcon)";
__ref._i /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_maticon);
RDebugUtils.currentLine=146145284;
 //BA.debugLineNum = 146145284;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146145285;
 //BA.debugLineNum = 146145285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _seticoncolor(b4j.example.vminfobox __ref,String _forecolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "seticoncolor", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "seticoncolor", new Object[] {_forecolor}));}
String _bg = "";
RDebugUtils.currentLine=145620992;
 //BA.debugLineNum = 145620992;BA.debugLine="Sub SetIconColor(foreColor As String) As VMInfoBox";
RDebugUtils.currentLine=145620993;
 //BA.debugLineNum = 145620993;BA.debugLine="If foreColor = \"\" Then Return Me";
if ((_forecolor).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=145620994;
 //BA.debugLineNum = 145620994;BA.debugLine="Dim bg As String = $\"col-${foreColor}\"$";
_bg = ("col-"+__c.SmartStringFormatter("",(Object)(_forecolor))+"");
RDebugUtils.currentLine=145620995;
 //BA.debugLineNum = 145620995;BA.debugLine="I.AddClass(bg)";
__ref._i /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_bg);
RDebugUtils.currentLine=145620996;
 //BA.debugLineNum = 145620996;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145620997;
 //BA.debugLineNum = 145620997;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _seticonbackgroundcolor(b4j.example.vminfobox __ref,String _background) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "seticonbackgroundcolor", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "seticonbackgroundcolor", new Object[] {_background}));}
String _bg = "";
RDebugUtils.currentLine=145489920;
 //BA.debugLineNum = 145489920;BA.debugLine="Sub SetIconBackgroundColor(background As String) A";
RDebugUtils.currentLine=145489921;
 //BA.debugLineNum = 145489921;BA.debugLine="If background = \"\" Then Return Me";
if ((_background).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=145489922;
 //BA.debugLineNum = 145489922;BA.debugLine="Dim bg As String = $\"bg-${background}\"$";
_bg = ("bg-"+__c.SmartStringFormatter("",(Object)(_background))+"");
RDebugUtils.currentLine=145489923;
 //BA.debugLineNum = 145489923;BA.debugLine="Icon.AddClass(bg)";
__ref._icon /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_bg);
RDebugUtils.currentLine=145489924;
 //BA.debugLineNum = 145489924;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145489925;
 //BA.debugLineNum = 145489925;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _settext(b4j.example.vminfobox __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "settext", new Object[] {_txt}));}
RDebugUtils.currentLine=145752064;
 //BA.debugLineNum = 145752064;BA.debugLine="Sub SetText(txt As String) As VMInfoBox";
RDebugUtils.currentLine=145752065;
 //BA.debugLineNum = 145752065;BA.debugLine="Text.SetText(txt)";
__ref._text /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_txt);
RDebugUtils.currentLine=145752066;
 //BA.debugLineNum = 145752066;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145752067;
 //BA.debugLineNum = 145752067;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setvshow(b4j.example.vminfobox __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=146604032;
 //BA.debugLineNum = 146604032;BA.debugLine="Sub SetVShow(vif As Object) As VMInfoBox";
RDebugUtils.currentLine=146604033;
 //BA.debugLineNum = 146604033;BA.debugLine="InfoBox.SetVShow(vif)";
__ref._infobox /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=146604034;
 //BA.debugLineNum = 146604034;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146604035;
 //BA.debugLineNum = 146604035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _sethoverexpandeffect(b4j.example.vminfobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "sethoverexpandeffect", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "sethoverexpandeffect", new Object[] {_b}));}
RDebugUtils.currentLine=146341888;
 //BA.debugLineNum = 146341888;BA.debugLine="Sub SetHoverExpandEffect(b As Boolean) As VMInfoBo";
RDebugUtils.currentLine=146341889;
 //BA.debugLineNum = 146341889;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=146341890;
 //BA.debugLineNum = 146341890;BA.debugLine="InfoBox.AddClass(\"hover-expand-effect\")";
__ref._infobox /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"hover-expand-effect");
RDebugUtils.currentLine=146341891;
 //BA.debugLineNum = 146341891;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146341892;
 //BA.debugLineNum = 146341892;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _sethoverzoomeffect(b4j.example.vminfobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "sethoverzoomeffect", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "sethoverzoomeffect", new Object[] {_b}));}
RDebugUtils.currentLine=146276352;
 //BA.debugLineNum = 146276352;BA.debugLine="Sub SetHoverZoomEffect(b As Boolean) As VMInfoBox";
RDebugUtils.currentLine=146276353;
 //BA.debugLineNum = 146276353;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=146276354;
 //BA.debugLineNum = 146276354;BA.debugLine="InfoBox.AddClass(\"hover-zoom-effect\")";
__ref._infobox /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"hover-zoom-effect");
RDebugUtils.currentLine=146276355;
 //BA.debugLineNum = 146276355;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146276356;
 //BA.debugLineNum = 146276356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setstyle2(b4j.example.vminfobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setstyle2", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setstyle2", new Object[] {_b}));}
RDebugUtils.currentLine=145293312;
 //BA.debugLineNum = 145293312;BA.debugLine="Sub SetStyle2(b As Boolean) As VMInfoBox";
RDebugUtils.currentLine=145293313;
 //BA.debugLineNum = 145293313;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
__ref._infobox /*b4j.example.vmelement*/ ._removeclass /*b4j.example.vmelement*/ (null,"info-box")._addclass /*b4j.example.vmelement*/ (null,"info-box-2");
RDebugUtils.currentLine=145293314;
 //BA.debugLineNum = 145293314;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145293315;
 //BA.debugLineNum = 145293315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setstyle3(b4j.example.vminfobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setstyle3", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setstyle3", new Object[] {_b}));}
RDebugUtils.currentLine=145358848;
 //BA.debugLineNum = 145358848;BA.debugLine="Sub SetStyle3(b As Boolean) As VMInfoBox";
RDebugUtils.currentLine=145358849;
 //BA.debugLineNum = 145358849;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
__ref._infobox /*b4j.example.vmelement*/ ._removeclass /*b4j.example.vmelement*/ (null,"info-box")._addclass /*b4j.example.vmelement*/ (null,"info-box-3");
RDebugUtils.currentLine=145358850;
 //BA.debugLineNum = 145358850;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145358851;
 //BA.debugLineNum = 145358851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setstyle4(b4j.example.vminfobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setstyle4", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setstyle4", new Object[] {_b}));}
RDebugUtils.currentLine=145424384;
 //BA.debugLineNum = 145424384;BA.debugLine="Sub SetStyle4(b As Boolean) As VMInfoBox";
RDebugUtils.currentLine=145424385;
 //BA.debugLineNum = 145424385;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
__ref._infobox /*b4j.example.vmelement*/ ._removeclass /*b4j.example.vmelement*/ (null,"info-box")._addclass /*b4j.example.vmelement*/ (null,"info-box-4");
RDebugUtils.currentLine=145424386;
 //BA.debugLineNum = 145424386;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145424387;
 //BA.debugLineNum = 145424387;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vminfobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=146210816;
 //BA.debugLineNum = 146210816;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=146210817;
 //BA.debugLineNum = 146210817;BA.debugLine="If hasIcon Then i.Pop(Icon)";
if (__ref._hasicon /*boolean*/ ) { 
__ref._i /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._icon /*b4j.example.vmelement*/ );};
RDebugUtils.currentLine=146210818;
 //BA.debugLineNum = 146210818;BA.debugLine="Icon.Pop(InfoBox)";
__ref._icon /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._infobox /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=146210819;
 //BA.debugLineNum = 146210819;BA.debugLine="Text.Pop(Content)";
__ref._text /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=146210820;
 //BA.debugLineNum = 146210820;BA.debugLine="CountIt.Pop(Content)";
__ref._countit /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=146210821;
 //BA.debugLineNum = 146210821;BA.debugLine="Content.Pop(InfoBox)";
__ref._content /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._infobox /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=146210822;
 //BA.debugLineNum = 146210822;BA.debugLine="Return InfoBox.tostring";
if (true) return __ref._infobox /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=146210823;
 //BA.debugLineNum = 146210823;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminfobox  _addclass(b4j.example.vminfobox __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=146669568;
 //BA.debugLineNum = 146669568;BA.debugLine="Sub AddClass(c As String) As VMInfoBox";
RDebugUtils.currentLine=146669569;
 //BA.debugLineNum = 146669569;BA.debugLine="InfoBox.AddClass(c)";
__ref._infobox /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=146669570;
 //BA.debugLineNum = 146669570;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146669571;
 //BA.debugLineNum = 146669571;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vminfobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
RDebugUtils.currentLine=145162240;
 //BA.debugLineNum = 145162240;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=145162241;
 //BA.debugLineNum = 145162241;BA.debugLine="Public InfoBox As VMElement";
_infobox = new b4j.example.vmelement();
RDebugUtils.currentLine=145162242;
 //BA.debugLineNum = 145162242;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=145162243;
 //BA.debugLineNum = 145162243;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=145162244;
 //BA.debugLineNum = 145162244;BA.debugLine="Private Icon As VMElement";
_icon = new b4j.example.vmelement();
RDebugUtils.currentLine=145162245;
 //BA.debugLineNum = 145162245;BA.debugLine="Private Content As VMElement";
_content = new b4j.example.vmelement();
RDebugUtils.currentLine=145162246;
 //BA.debugLineNum = 145162246;BA.debugLine="Private Text As VMElement";
_text = new b4j.example.vmelement();
RDebugUtils.currentLine=145162247;
 //BA.debugLineNum = 145162247;BA.debugLine="Private CountIt As VMElement";
_countit = new b4j.example.vmelement();
RDebugUtils.currentLine=145162248;
 //BA.debugLineNum = 145162248;BA.debugLine="Private i As VMElement";
_i = new b4j.example.vmelement();
RDebugUtils.currentLine=145162249;
 //BA.debugLineNum = 145162249;BA.debugLine="Private hasIcon As Boolean";
_hasicon = false;
RDebugUtils.currentLine=145162250;
 //BA.debugLineNum = 145162250;BA.debugLine="Private banano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=145162251;
 //BA.debugLineNum = 145162251;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=145162252;
 //BA.debugLineNum = 145162252;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vminfobox __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=146931712;
 //BA.debugLineNum = 146931712;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=146931713;
 //BA.debugLineNum = 146931713;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=146931714;
 //BA.debugLineNum = 146931714;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vminfobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=146866176;
 //BA.debugLineNum = 146866176;BA.debugLine="Sub Render";
RDebugUtils.currentLine=146866177;
 //BA.debugLineNum = 146866177;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=146866178;
 //BA.debugLineNum = 146866178;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminfobox  _setattr(b4j.example.vminfobox __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=146735104;
 //BA.debugLineNum = 146735104;BA.debugLine="Sub SetAttr(attr As Map) As VMInfoBox";
RDebugUtils.currentLine=146735105;
 //BA.debugLineNum = 146735105;BA.debugLine="InfoBox.SetAttr(attr)";
__ref._infobox /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=146735106;
 //BA.debugLineNum = 146735106;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146735107;
 //BA.debugLineNum = 146735107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setbackgroundcolor(b4j.example.vminfobox __ref,String _background) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_background}));}
String _bg = "";
RDebugUtils.currentLine=145555456;
 //BA.debugLineNum = 145555456;BA.debugLine="Sub SetBackgroundColor(background As String) As VM";
RDebugUtils.currentLine=145555457;
 //BA.debugLineNum = 145555457;BA.debugLine="If background = \"\" Then Return Me";
if ((_background).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
RDebugUtils.currentLine=145555458;
 //BA.debugLineNum = 145555458;BA.debugLine="Dim bg As String = $\"bg-${background}\"$";
_bg = ("bg-"+__c.SmartStringFormatter("",(Object)(_background))+"");
RDebugUtils.currentLine=145555459;
 //BA.debugLineNum = 145555459;BA.debugLine="InfoBox.AddClass(bg)";
__ref._infobox /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_bg);
RDebugUtils.currentLine=145555460;
 //BA.debugLineNum = 145555460;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145555461;
 //BA.debugLineNum = 145555461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setcolor(b4j.example.vminfobox __ref,String _forecolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setcolor", new Object[] {_forecolor}));}
String _bg = "";
RDebugUtils.currentLine=145686528;
 //BA.debugLineNum = 145686528;BA.debugLine="Sub SetColor(foreColor As String) As VMInfoBox";
RDebugUtils.currentLine=145686529;
 //BA.debugLineNum = 145686529;BA.debugLine="Dim bg As String = $\"col-${foreColor}\"$";
_bg = ("col-"+__c.SmartStringFormatter("",(Object)(_forecolor))+"");
RDebugUtils.currentLine=145686530;
 //BA.debugLineNum = 145686530;BA.debugLine="InfoBox.AddClass(bg)";
__ref._infobox /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_bg);
RDebugUtils.currentLine=145686531;
 //BA.debugLineNum = 145686531;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=145686532;
 //BA.debugLineNum = 145686532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setdisabled(b4j.example.vminfobox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=146800640;
 //BA.debugLineNum = 146800640;BA.debugLine="Sub SetDisabled(b As Boolean) As VMInfoBox";
RDebugUtils.currentLine=146800641;
 //BA.debugLineNum = 146800641;BA.debugLine="InfoBox.SetDisabled(b)";
__ref._infobox /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=146800642;
 //BA.debugLineNum = 146800642;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146800643;
 //BA.debugLineNum = 146800643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setkey(b4j.example.vminfobox __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=146538496;
 //BA.debugLineNum = 146538496;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMInfo";
RDebugUtils.currentLine=146538497;
 //BA.debugLineNum = 146538497;BA.debugLine="InfoBox.SetKey(k, bind)";
__ref._infobox /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=146538498;
 //BA.debugLineNum = 146538498;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146538499;
 //BA.debugLineNum = 146538499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setstyle(b4j.example.vminfobox __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=146407424;
 //BA.debugLineNum = 146407424;BA.debugLine="Sub SetStyle(sm As Map) As VMInfoBox";
RDebugUtils.currentLine=146407425;
 //BA.debugLineNum = 146407425;BA.debugLine="InfoBox.SetStyle(sm)";
__ref._infobox /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=146407426;
 //BA.debugLineNum = 146407426;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146407427;
 //BA.debugLineNum = 146407427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setvif(b4j.example.vminfobox __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminfobox";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=146472960;
 //BA.debugLineNum = 146472960;BA.debugLine="Sub SetVIf(vif As Object) As VMInfoBox";
RDebugUtils.currentLine=146472961;
 //BA.debugLineNum = 146472961;BA.debugLine="InfoBox.SetVIf(vif)";
__ref._infobox /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=146472962;
 //BA.debugLineNum = 146472962;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
RDebugUtils.currentLine=146472963;
 //BA.debugLineNum = 146472963;BA.debugLine="End Sub";
return null;
}
}