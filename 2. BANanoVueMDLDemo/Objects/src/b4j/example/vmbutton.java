package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _button = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hasbadge = false;
public b4j.example.vmbadge _badge = null;
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
public b4j.example.vmbutton  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub AddClass(c As String) As VMButton";
 //BA.debugLineNum = 179;BA.debugLine="Button.AddClass(c)";
_button._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 311;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Button As VMElement";
_button = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
 //BA.debugLineNum = 7;BA.debugLine="Private badge As VMBadge";
_badge = new b4j.example.vmbadge();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 28;BA.debugLine="Button.hide";
_button._hide /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 13;BA.debugLine="Button.Initialize(vue, ID).SetTag(\"md-button\")";
_button._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-button");
 //BA.debugLineNum = 14;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 15;BA.debugLine="hasBadge = False";
_hasbadge = __c.False;
 //BA.debugLineNum = 16;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
_badge._initialize /*b4j.example.vmbadge*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"badge"));
 };
 //BA.debugLineNum = 18;BA.debugLine="Button.SetOnClick(eventHandler, $\"${ID}_click\"$)";
_button._setonclick /*b4j.example.vmelement*/ (_eventhandler,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 306;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="public Sub RemoveAttr(sName As String) As VMButton";
 //BA.debugLineNum = 23;BA.debugLine="Button.RemoveAttr(sName)";
_button._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub Render";
 //BA.debugLineNum = 302;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetAccent(b As Boolean) As VMButton";
 //BA.debugLineNum = 224;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 225;BA.debugLine="Button.SetAccent(b)";
_button._setaccent /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetAttr(attr As Map) As VMButton";
 //BA.debugLineNum = 185;BA.debugLine="Button.SetAttr(attr)";
_button._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgeaccent() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetBadgeAccent As VMButton";
 //BA.debugLineNum = 103;BA.debugLine="badge.SetAccent(True)";
_badge._setaccent /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 104;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgecontent(int _counted) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetBadgeContent(counted As Int) As VMButton";
 //BA.debugLineNum = 91;BA.debugLine="badge.SetContent(counted)";
_badge._setcontent /*b4j.example.vmbadge*/ (_counted);
 //BA.debugLineNum = 92;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgedense() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetBadgeDense As VMButton";
 //BA.debugLineNum = 121;BA.debugLine="badge.SetDense(True)";
_badge._setdense /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 122;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgeonbottom() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetBadgeOnBottom As VMButton";
 //BA.debugLineNum = 115;BA.debugLine="badge.SetPositionBottom(True)";
_badge._setpositionbottom /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 116;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgeontop() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetBadgeOnTop As VMButton";
 //BA.debugLineNum = 109;BA.debugLine="badge.SetPositionTop(True)";
_badge._setpositiontop /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 110;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgeprimary() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetBadgePrimary As VMButton";
 //BA.debugLineNum = 97;BA.debugLine="badge.SetPrimary(True)";
_badge._setprimary /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 98;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgesquare() throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetBadgeSquare As VMButton";
 //BA.debugLineNum = 127;BA.debugLine="badge.SetSquare(True)";
_badge._setsquare /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 128;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdense(boolean _b) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetDense(b As Boolean) As VMButton";
 //BA.debugLineNum = 201;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 202;BA.debugLine="Button.SetDense(b)";
_button._setdense /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetDisabled(b As Boolean) As VMButton";
 //BA.debugLineNum = 190;BA.debugLine="Button.SetDisabled(b)";
_button._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfab(boolean _b) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetFab(b As Boolean) As VMButton";
 //BA.debugLineNum = 43;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 44;BA.debugLine="Button.AddClass(\"md-fab\")";
_button._addclass /*b4j.example.vmelement*/ ("md-fab");
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabfixed(boolean _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetFabFixed(b As Boolean) As VMButton";
 //BA.debugLineNum = 37;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 38;BA.debugLine="Button.AddClass(\"md-fixed\")";
_button._addclass /*b4j.example.vmelement*/ ("md-fixed");
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabposition(String _pos) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetFabPosition(pos As String) As VMButton";
 //BA.debugLineNum = 49;BA.debugLine="If pos = \"\" Then Return Me";
if ((_pos).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 50;BA.debugLine="Button.AddClass(pos)";
_button._addclass /*b4j.example.vmelement*/ (_pos);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositionbottomcenter() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetFabPositionBottomCenter As VMButton";
 //BA.debugLineNum = 75;BA.debugLine="SetFabPosition(\"md-fab-bottom-center\")";
_setfabposition("md-fab-bottom-center");
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositionbottomleft() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetFabPositionBottomLeft As VMButton";
 //BA.debugLineNum = 80;BA.debugLine="SetFabPosition(\"md-fab-bottom-left\")";
_setfabposition("md-fab-bottom-left");
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositionbottomright() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetFabPositionBottomRight As VMButton";
 //BA.debugLineNum = 70;BA.debugLine="SetFabPosition(\"md-fab-bottom-right\")";
_setfabposition("md-fab-bottom-right");
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositiontopcenter() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetFabPositionTopCenter As VMButton";
 //BA.debugLineNum = 60;BA.debugLine="SetFabPosition(\"md-fab-top-center\")";
_setfabposition("md-fab-top-center");
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositiontopleft() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetFabPositionTopLeft As VMButton";
 //BA.debugLineNum = 65;BA.debugLine="SetFabPosition(\"md-fab-top-left\")";
_setfabposition("md-fab-top-left");
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositiontopright() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetFabPositionTopRight As VMButton";
 //BA.debugLineNum = 55;BA.debugLine="SetFabPosition(\"md-fab-top-right\")";
_setfabposition("md-fab-top-right");
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _sethref(String _h,boolean _bind) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetHREF(h As String, bind As Boolean) As VMBut";
 //BA.debugLineNum = 241;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 242;BA.debugLine="If bind = True Then";
if (_bind==__c.True) { 
 //BA.debugLineNum = 243;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
 //BA.debugLineNum = 244;BA.debugLine="SetAttr(CreateMap(\":href\":h))";
_setattr(__c.createMap(new Object[] {(Object)(":href"),(Object)(_h)}));
 }else {
 //BA.debugLineNum = 246;BA.debugLine="Button.sethref(h)";
_button._sethref /*b4j.example.vmelement*/ (_h);
 };
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _seticon(String _icn) throws Exception{
b4j.example.vmelement _icon = null;
 //BA.debugLineNum = 269;BA.debugLine="Sub SetIcon(icn As String) As VMButton";
 //BA.debugLineNum = 270;BA.debugLine="If icn = \"\" Then Return Me";
if ((_icn).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 271;BA.debugLine="Dim icon As VMElement";
_icon = new b4j.example.vmelement();
 //BA.debugLineNum = 272;BA.debugLine="icon.Initialize(vue,$\"${ID}icn\"$).SetTagIcon(True";
_icon._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icn"))._settagicon /*b4j.example.vmelement*/ (__c.True)._settext /*b4j.example.vmelement*/ (_icn);
 //BA.debugLineNum = 273;BA.debugLine="icon.Pop(Button)";
_icon._pop /*String*/ (_button);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _seticonbutton(boolean _b) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetIconButton(b As Boolean) As VMButton";
 //BA.debugLineNum = 252;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 253;BA.debugLine="Button.AddClass(\"md-icon-button\")";
_button._addclass /*b4j.example.vmelement*/ ("md-icon-button");
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setid(String _iid,boolean _bind) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMBut";
 //BA.debugLineNum = 151;BA.debugLine="Button.SetID(iID,bind)";
_button._setid /*b4j.example.vmelement*/ (_iid,_bind);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMButt";
 //BA.debugLineNum = 161;BA.debugLine="Button.SetKey(k, bind)";
_button._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setlistaction(boolean _b) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetListAction(b As Boolean) As VMButton";
 //BA.debugLineNum = 195;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 196;BA.debugLine="Button.SetListAction(True)";
_button._setlistaction /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setmenutrigger(boolean _b) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMButton";
 //BA.debugLineNum = 167;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 168;BA.debugLine="Button.SetAttr(CreateMap(\"md-menu-trigger\": True)";
_button._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-menu-trigger"),(Object)(__c.True)}));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setmini(boolean _b) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetMini(b As Boolean) As VMButton";
 //BA.debugLineNum = 258;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 259;BA.debugLine="Button.AddClass(\"md-mini\")";
_button._addclass /*b4j.example.vmelement*/ ("md-mini");
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setname(String _nam,boolean _bind) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMB";
 //BA.debugLineNum = 156;BA.debugLine="Button.SetName(nam, bind)";
_button._setname /*b4j.example.vmelement*/ (_nam,_bind);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setonclick(Object _targetmodule) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetOnClick(targetModule As Object) As VMButton";
 //BA.debugLineNum = 86;BA.debugLine="Button.SetOnClick(targetModule, $\"${ID}_click\"$)";
_button._setonclick /*b4j.example.vmelement*/ (_targetmodule,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setplain(boolean _b) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetPlain(b As Boolean) As VMButton";
 //BA.debugLineNum = 264;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 265;BA.debugLine="Button.AddClass(\"md-plain\")";
_button._addclass /*b4j.example.vmelement*/ ("md-plain");
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetPrimary(b As Boolean) As VMButton";
 //BA.debugLineNum = 218;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 219;BA.debugLine="Button.SetPrimary(b)";
_button._setprimary /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setraised(boolean _b) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetRaised(b As Boolean) As VMButton";
 //BA.debugLineNum = 207;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 208;BA.debugLine="Button.AddClass(\"md-raised\")";
_button._addclass /*b4j.example.vmelement*/ ("md-raised");
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setripple(boolean _b) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetRipple(b As Boolean) As VMButton";
 //BA.debugLineNum = 213;BA.debugLine="Button.SetRipple(b)";
_button._setripple /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetStyle(sm As Map) As VMButton";
 //BA.debugLineNum = 141;BA.debugLine="Button.SetStyle(sm)";
_button._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetTabIndex(ti As String) As VMButton";
 //BA.debugLineNum = 134;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 135;BA.debugLine="Button.SetTabIndex(ti)";
_button._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settext(String _t) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub SetText(t As String) As VMButton";
 //BA.debugLineNum = 286;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 287;BA.debugLine="Button.SetText(t)";
_button._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setto(String _t,boolean _bind) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetTo(t As String, bind As Boolean) As VMButto";
 //BA.debugLineNum = 230;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 231;BA.debugLine="If bind = True Then";
if (_bind==__c.True) { 
 //BA.debugLineNum = 232;BA.debugLine="t= t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 233;BA.debugLine="SetAttr(CreateMap(\":to\":t))";
_setattr(__c.createMap(new Object[] {(Object)(":to"),(Object)(_t)}));
 }else {
 //BA.debugLineNum = 235;BA.debugLine="Button.SetTo(t)";
_button._setto /*b4j.example.vmelement*/ ((Object)(_t));
 };
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settooltip(String _tt) throws Exception{
b4j.example.vmtooltip _el = null;
 //BA.debugLineNum = 277;BA.debugLine="Sub SetToolTip(tt As String) As VMButton";
 //BA.debugLineNum = 278;BA.debugLine="If tt = \"\" Then Return Me";
if ((_tt).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
 //BA.debugLineNum = 279;BA.debugLine="Dim el As VMTooltip";
_el = new b4j.example.vmtooltip();
 //BA.debugLineNum = 280;BA.debugLine="el.Initialize(vue,$\"${ID}tlt\"$).SetText(tt)";
_el._initialize /*b4j.example.vmtooltip*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tlt"))._settext /*b4j.example.vmtooltip*/ ((Object)(_tt));
 //BA.debugLineNum = 281;BA.debugLine="el.Pop(Button)";
_el._pop /*String*/ (_button);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetVIf(vif As String) As VMButton";
 //BA.debugLineNum = 146;BA.debugLine="Button.SetVIf(vif)";
_button._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetVShow(vif As String) As VMButton";
 //BA.debugLineNum = 173;BA.debugLine="Button.SetVShow(vif)";
_button._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub Show";
 //BA.debugLineNum = 32;BA.debugLine="Button.show";
_button._show /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
String _strbtn = "";
 //BA.debugLineNum = 291;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 292;BA.debugLine="If hasBadge Then";
if (_hasbadge) { 
 //BA.debugLineNum = 293;BA.debugLine="Dim strBTN As String = Button.ToString";
_strbtn = _button._tostring /*String*/ ();
 //BA.debugLineNum = 294;BA.debugLine="badge.SetText(strBTN)";
_badge._settext /*b4j.example.vmbadge*/ ((Object)(_strbtn));
 //BA.debugLineNum = 295;BA.debugLine="Return badge.tostring";
if (true) return _badge._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 297;BA.debugLine="Return Button.tostring";
if (true) return _button._tostring /*String*/ ();
 };
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
