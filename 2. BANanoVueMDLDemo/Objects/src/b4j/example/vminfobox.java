package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vminfobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vminfobox", this);
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
public b4j.example.vminfobox  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub AddClass(c As String) As VMInfoBox";
 //BA.debugLineNum = 165;BA.debugLine="InfoBox.AddClass(c)";
_infobox._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public InfoBox As VMElement";
_infobox = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private Icon As VMElement";
_icon = new b4j.example.vmelement();
 //BA.debugLineNum = 7;BA.debugLine="Private Content As VMElement";
_content = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Private Text As VMElement";
_text = new b4j.example.vmelement();
 //BA.debugLineNum = 9;BA.debugLine="Private CountIt As VMElement";
_countit = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="Private i As VMElement";
_i = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private hasIcon As Boolean";
_hasicon = false;
 //BA.debugLineNum = 12;BA.debugLine="Private banano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 13;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminfobox  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="banano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
_banano.DependsOnAsset("jquery-3.4.1.min.js");
 //BA.debugLineNum = 18;BA.debugLine="banano.DependsOnAsset(\"info-box.css\")";
_banano.DependsOnAsset("info-box.css");
 //BA.debugLineNum = 19;BA.debugLine="banano.DependsOnAsset(\"jquery.countTo.js\")";
_banano.DependsOnAsset("jquery.countTo.js");
 //BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="InfoBox.Initialize(vue, ID).SetTag(\"div\").AddClas";
_infobox._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("info-box");
 //BA.debugLineNum = 24;BA.debugLine="Icon.Initialize(vue, $\"${ID}icn\"$).SetTag(\"div\").";
_icon._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icn"))._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("icon");
 //BA.debugLineNum = 25;BA.debugLine="Content.Initialize(vue,$\"${ID}content\"$).SetTag(\"";
_content._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"content"))._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("content");
 //BA.debugLineNum = 26;BA.debugLine="Text.Initialize(vue,$\"${ID}text\"$).SetTag(\"div\").";
_text._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"text"))._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("text");
 //BA.debugLineNum = 27;BA.debugLine="CountIt.Initialize(vue,$\"${ID}number\"$).SetTag(\"d";
_countit._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"number"))._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("number");
 //BA.debugLineNum = 28;BA.debugLine="i.Initialize(vue,$\"${ID}i\"$).SetTag(\"i\").AddClass";
_i._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"i"))._settag /*b4j.example.vmelement*/ ("i")._addclass /*b4j.example.vmelement*/ ("material-icons");
 //BA.debugLineNum = 29;BA.debugLine="hasIcon = False";
_hasicon = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="InfoBox.SetOnClick(module, $\"${ID}_click\"$)";
_infobox._setonclick /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 185;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub Render";
 //BA.debugLineNum = 181;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminfobox  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetAttr(attr As Map) As VMInfoBox";
 //BA.debugLineNum = 171;BA.debugLine="InfoBox.SetAttr(attr)";
_infobox._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setbackgroundcolor(String _background) throws Exception{
String _bg = "";
 //BA.debugLineNum = 56;BA.debugLine="Sub SetBackgroundColor(background As String) As VM";
 //BA.debugLineNum = 57;BA.debugLine="If background = \"\" Then Return Me";
if ((_background).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 58;BA.debugLine="Dim bg As String = $\"bg-${background}\"$";
_bg = ("bg-"+__c.SmartStringFormatter("",(Object)(_background))+"");
 //BA.debugLineNum = 59;BA.debugLine="InfoBox.AddClass(bg)";
_infobox._addclass /*b4j.example.vmelement*/ (_bg);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setcolor(String _forecolor) throws Exception{
String _bg = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SetColor(foreColor As String) As VMInfoBox";
 //BA.debugLineNum = 71;BA.debugLine="Dim bg As String = $\"col-${foreColor}\"$";
_bg = ("col-"+__c.SmartStringFormatter("",(Object)(_forecolor))+"");
 //BA.debugLineNum = 72;BA.debugLine="InfoBox.AddClass(bg)";
_infobox._addclass /*b4j.example.vmelement*/ (_bg);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetDisabled(b As Boolean) As VMInfoBox";
 //BA.debugLineNum = 176;BA.debugLine="InfoBox.SetDisabled(b)";
_infobox._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setfrom(String _startfrom) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetFrom(startFrom As String) As VMInfoBox";
 //BA.debugLineNum = 82;BA.debugLine="If startFrom = \"\" Then Return Me";
if ((_startfrom).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 83;BA.debugLine="CountIt.AddClass(\"count-to\")";
_countit._addclass /*b4j.example.vmelement*/ ("count-to");
 //BA.debugLineNum = 84;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-from\": startFrom)";
_countit._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-from"),(Object)(_startfrom)}));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _sethoverexpandeffect(boolean _b) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetHoverExpandEffect(b As Boolean) As VMInfoBo";
 //BA.debugLineNum = 137;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 138;BA.debugLine="InfoBox.AddClass(\"hover-expand-effect\")";
_infobox._addclass /*b4j.example.vmelement*/ ("hover-expand-effect");
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _sethoverzoomeffect(boolean _b) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetHoverZoomEffect(b As Boolean) As VMInfoBox";
 //BA.debugLineNum = 131;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 132;BA.debugLine="InfoBox.AddClass(\"hover-zoom-effect\")";
_infobox._addclass /*b4j.example.vmelement*/ ("hover-zoom-effect");
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _seticon(String _maticon) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetIcon(matIcon As String) As VMInfoBox";
 //BA.debugLineNum = 115;BA.debugLine="If matIcon = \"\" Then Return Me";
if ((_maticon).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 116;BA.debugLine="hasIcon = True";
_hasicon = __c.True;
 //BA.debugLineNum = 117;BA.debugLine="i.SetText(matIcon)";
_i._settext /*b4j.example.vmelement*/ (_maticon);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _seticonbackgroundcolor(String _background) throws Exception{
String _bg = "";
 //BA.debugLineNum = 49;BA.debugLine="Sub SetIconBackgroundColor(background As String) A";
 //BA.debugLineNum = 50;BA.debugLine="If background = \"\" Then Return Me";
if ((_background).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 51;BA.debugLine="Dim bg As String = $\"bg-${background}\"$";
_bg = ("bg-"+__c.SmartStringFormatter("",(Object)(_background))+"");
 //BA.debugLineNum = 52;BA.debugLine="Icon.AddClass(bg)";
_icon._addclass /*b4j.example.vmelement*/ (_bg);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _seticoncolor(String _forecolor) throws Exception{
String _bg = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub SetIconColor(foreColor As String) As VMInfoBox";
 //BA.debugLineNum = 64;BA.debugLine="If foreColor = \"\" Then Return Me";
if ((_forecolor).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 65;BA.debugLine="Dim bg As String = $\"col-${foreColor}\"$";
_bg = ("col-"+__c.SmartStringFormatter("",(Object)(_forecolor))+"");
 //BA.debugLineNum = 66;BA.debugLine="I.AddClass(bg)";
_i._addclass /*b4j.example.vmelement*/ (_bg);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMInfo";
 //BA.debugLineNum = 154;BA.debugLine="InfoBox.SetKey(k, bind)";
_infobox._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setnumber(String _numo) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetNumber(numo As String) As VMInfoBox";
 //BA.debugLineNum = 96;BA.debugLine="CountIt.SetText(numo)";
_countit._settext /*b4j.example.vmelement*/ (_numo);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setrefreshinterval(String _interval) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetRefreshInterval(interval As String) As VMIn";
 //BA.debugLineNum = 108;BA.debugLine="If interval = \"\" Then Return Me";
if ((_interval).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 109;BA.debugLine="CountIt.AddClass(\"count-to\")";
_countit._addclass /*b4j.example.vmelement*/ ("count-to");
 //BA.debugLineNum = 110;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-fresh-interval\":i";
_countit._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-fresh-interval"),(Object)(_interval)}));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setspeed(String _speed) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetSpeed(speed As String) As VMInfoBox";
 //BA.debugLineNum = 101;BA.debugLine="If speed = \"\" Then Return Me";
if ((_speed).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 102;BA.debugLine="CountIt.AddClass(\"count-to\")";
_countit._addclass /*b4j.example.vmelement*/ ("count-to");
 //BA.debugLineNum = 103;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-speed\":speed))";
_countit._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-speed"),(Object)(_speed)}));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetStyle(sm As Map) As VMInfoBox";
 //BA.debugLineNum = 144;BA.debugLine="InfoBox.SetStyle(sm)";
_infobox._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setstyle2(boolean _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStyle2(b As Boolean) As VMInfoBox";
 //BA.debugLineNum = 35;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
_infobox._removeclass /*b4j.example.vmelement*/ ("info-box")._addclass /*b4j.example.vmelement*/ ("info-box-2");
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setstyle3(boolean _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetStyle3(b As Boolean) As VMInfoBox";
 //BA.debugLineNum = 40;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
_infobox._removeclass /*b4j.example.vmelement*/ ("info-box")._addclass /*b4j.example.vmelement*/ ("info-box-3");
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setstyle4(boolean _b) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetStyle4(b As Boolean) As VMInfoBox";
 //BA.debugLineNum = 45;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
_infobox._removeclass /*b4j.example.vmelement*/ ("info-box")._addclass /*b4j.example.vmelement*/ ("info-box-4");
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _settext(String _txt) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetText(txt As String) As VMInfoBox";
 //BA.debugLineNum = 77;BA.debugLine="Text.SetText(txt)";
_text._settext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setto(String _endto) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetTo(endTo As String) As VMInfoBox";
 //BA.debugLineNum = 89;BA.debugLine="If endTo = \"\" Then Return Me";
if ((_endto).equals("")) { 
if (true) return (b4j.example.vminfobox)(this);};
 //BA.debugLineNum = 90;BA.debugLine="CountIt.AddClass(\"count-to\")";
_countit._addclass /*b4j.example.vmelement*/ ("count-to");
 //BA.debugLineNum = 91;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-to\": endTo))";
_countit._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-to"),(Object)(_endto)}));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetVIf(vif As Object) As VMInfoBox";
 //BA.debugLineNum = 149;BA.debugLine="InfoBox.SetVIf(vif)";
_infobox._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetVShow(vif As Object) As VMInfoBox";
 //BA.debugLineNum = 159;BA.debugLine="InfoBox.SetVShow(vif)";
_infobox._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vminfobox)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 122;BA.debugLine="If hasIcon Then i.Pop(Icon)";
if (_hasicon) { 
_i._pop /*String*/ (_icon);};
 //BA.debugLineNum = 123;BA.debugLine="Icon.Pop(InfoBox)";
_icon._pop /*String*/ (_infobox);
 //BA.debugLineNum = 124;BA.debugLine="Text.Pop(Content)";
_text._pop /*String*/ (_content);
 //BA.debugLineNum = 125;BA.debugLine="CountIt.Pop(Content)";
_countit._pop /*String*/ (_content);
 //BA.debugLineNum = 126;BA.debugLine="Content.Pop(InfoBox)";
_content._pop /*String*/ (_infobox);
 //BA.debugLineNum = 127;BA.debugLine="Return InfoBox.tostring";
if (true) return _infobox._tostring /*String*/ ();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
