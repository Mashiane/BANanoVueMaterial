package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmavatar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmavatar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmavatar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _avatar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmelement _img = null;
public boolean _hasimage = false;
public boolean _hasbadge = false;
public b4j.example.vmbadge _badge = null;
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
public b4j.example.vmavatar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub AddClass(c As String) As VMAvatar";
 //BA.debugLineNum = 127;BA.debugLine="Avatar.AddClass(c)";
_avatar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 198;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Avatar As VMElement";
_avatar = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private img As VMElement";
_img = new b4j.example.vmelement();
 //BA.debugLineNum = 7;BA.debugLine="Private hasImage As Boolean";
_hasimage = false;
 //BA.debugLineNum = 8;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
 //BA.debugLineNum = 9;BA.debugLine="Private badge As VMBadge";
_badge = new b4j.example.vmbadge();
 //BA.debugLineNum = 10;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 17;BA.debugLine="Avatar.Initialize(vue, ID).SetTag(\"md-avatar\")";
_avatar._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-avatar");
 //BA.debugLineNum = 18;BA.debugLine="img.Initialize(vue,$\"${ID}img\"$).SetTag(\"img\")";
_img._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"img"))._settag /*b4j.example.vmelement*/ ("img");
 //BA.debugLineNum = 19;BA.debugLine="hasImage = False";
_hasimage = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="hasBadge = False";
_hasbadge = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
_badge._initialize /*b4j.example.vmbadge*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"badge"));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 194;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub Render";
 //BA.debugLineNum = 190;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetAccent(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 102;BA.debugLine="If b Then Avatar.AddClass(\"md-accent\")";
if (_b) { 
_avatar._addclass /*b4j.example.vmelement*/ ("md-accent");};
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setalt(String _a) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SetAlt(a As String) As VMAvatar";
 //BA.debugLineNum = 162;BA.debugLine="img.SetAlt(a)";
_img._setalt /*b4j.example.vmelement*/ (_a);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetAttr(attr As Map) As VMAvatar";
 //BA.debugLineNum = 157;BA.debugLine="Avatar.SetAttr(attr)";
_avatar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setavataricon(boolean _b) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAvatarIcon(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 146;BA.debugLine="If b Then Avatar.AddClass(\"md-avatar-icon\")";
if (_b) { 
_avatar._addclass /*b4j.example.vmelement*/ ("md-avatar-icon");};
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgeaccent() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetBadgeAccent As VMAvatar";
 //BA.debugLineNum = 38;BA.debugLine="badge.SetAccent(True)";
_badge._setaccent /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 39;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgecontent(int _counted) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetBadgeContent(counted As Int) As VMAvatar";
 //BA.debugLineNum = 26;BA.debugLine="badge.SetContent(counted)";
_badge._setcontent /*b4j.example.vmbadge*/ (_counted);
 //BA.debugLineNum = 27;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgedense() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetBadgeDense As VMAvatar";
 //BA.debugLineNum = 56;BA.debugLine="badge.SetDense(True)";
_badge._setdense /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 57;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgeonbottom() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetBadgeOnBottom As VMAvatar";
 //BA.debugLineNum = 50;BA.debugLine="badge.SetPositionBottom(True)";
_badge._setpositionbottom /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 51;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgeontop() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetBadgeOnTop As VMAvatar";
 //BA.debugLineNum = 44;BA.debugLine="badge.SetPositionTop(True)";
_badge._setpositiontop /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 45;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgeprimary() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetBadgePrimary As VMAvatar";
 //BA.debugLineNum = 32;BA.debugLine="badge.SetPrimary(True)";
_badge._setprimary /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 33;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgesquare() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetBadgeSquare As VMAvatar";
 //BA.debugLineNum = 62;BA.debugLine="badge.SetSquare(True)";
_badge._setsquare /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 63;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetDisabled(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 68;BA.debugLine="Avatar.SetDisabled(b)";
_avatar._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetElevation(e As Int) As VMAvatar";
 //BA.debugLineNum = 112;BA.debugLine="Avatar.SetElevation(e)";
_avatar._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _seticon(String _icn) throws Exception{
b4j.example.vmicon _icon = null;
 //BA.debugLineNum = 136;BA.debugLine="Sub SetIcon(icn As String) As VMAvatar";
 //BA.debugLineNum = 137;BA.debugLine="If icn = \"\" Then Return Me";
if ((_icn).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 138;BA.debugLine="SetAvatarIcon(True)";
_setavataricon(__c.True);
 //BA.debugLineNum = 139;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 140;BA.debugLine="icon.Initialize(vue,$\"${ID}icn\"$).SetText(icn)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icn"))._settext /*b4j.example.vmicon*/ (_icn);
 //BA.debugLineNum = 141;BA.debugLine="icon.pop(Avatar)";
_icon._pop /*String*/ (_avatar);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setid(String _sid) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetID(sid As String) As VMAvatar";
 //BA.debugLineNum = 107;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setlarge(boolean _b) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetLarge(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 151;BA.debugLine="If b Then Avatar.AddClass(\"md-large\")";
if (_b) { 
_avatar._addclass /*b4j.example.vmelement*/ ("md-large");};
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setmenutrigger(boolean _b) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 79;BA.debugLine="Avatar.SetAttr(CreateMap(\":md-menu-trigger\": b))";
_avatar._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-menu-trigger"),(Object)(_b)}));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetPrimary(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 97;BA.debugLine="If b Then Avatar.AddClass(\"md-primary\")";
if (_b) { 
_avatar._addclass /*b4j.example.vmelement*/ ("md-primary");};
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setsmall(boolean _b) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetSmall(b As Boolean) As VMAvatar";
 //BA.debugLineNum = 132;BA.debugLine="If b Then Avatar.AddClass(\"md-small\")";
if (_b) { 
_avatar._addclass /*b4j.example.vmelement*/ ("md-small");};
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settext(String _t) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetText(t As String) As VMAvatar";
 //BA.debugLineNum = 85;BA.debugLine="Avatar.SetText(t)";
_avatar._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settextripple(String _t) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 89;BA.debugLine="Sub SetTextRipple(t As String) As VMAvatar";
 //BA.debugLineNum = 90;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 91;BA.debugLine="el.Initialize(vue,$\"${ID}txt\"$).SetTag(\"md-ripple";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"txt"))._settag /*b4j.example.vmelement*/ ("md-ripple")._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 92;BA.debugLine="el.Pop(Avatar)";
_el._pop /*String*/ (_avatar);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settooltip(String _tt) throws Exception{
b4j.example.vmtooltip _el = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub SetToolTip(tt As String) As VMAvatar";
 //BA.debugLineNum = 118;BA.debugLine="If tt = \"\" Then Return Me";
if ((_tt).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 119;BA.debugLine="Dim el As VMTooltip";
_el = new b4j.example.vmtooltip();
 //BA.debugLineNum = 120;BA.debugLine="el.Initialize(vue,$\"${ID}tlt\"$).SetText(tt)";
_el._initialize /*b4j.example.vmtooltip*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tlt"))._settext /*b4j.example.vmtooltip*/ ((Object)(_tt));
 //BA.debugLineNum = 121;BA.debugLine="el.Pop(Avatar)";
_el._pop /*String*/ (_avatar);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setvalue(String _imgurl) throws Exception{
String _lkey = "";
 //BA.debugLineNum = 166;BA.debugLine="Sub SetValue(imgURL As String) As VMAvatar";
 //BA.debugLineNum = 167;BA.debugLine="If ID = \"\" Then";
if ((_id).equals("")) { 
 //BA.debugLineNum = 168;BA.debugLine="Log(\"VMAvatar.SetValue: You need to set the ID o";
__c.Log("VMAvatar.SetValue: You need to set the ID of the image.");
 };
 //BA.debugLineNum = 170;BA.debugLine="Dim lkey As String = $\"${ID}url\"$";
_lkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"url");
 //BA.debugLineNum = 171;BA.debugLine="img.SetSRC(lkey,True)";
_img._setsrc /*b4j.example.vmelement*/ (_lkey,__c.True);
 //BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(lkey, imgURL)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_lkey,(Object)(_imgurl));
 //BA.debugLineNum = 173;BA.debugLine="hasImage = True";
_hasimage = __c.True;
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetVShow(vif As String) As VMAvatar";
 //BA.debugLineNum = 73;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
 //BA.debugLineNum = 74;BA.debugLine="Avatar.SetVShow(vif)";
_avatar._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _strbtn = "";
 //BA.debugLineNum = 177;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 178;BA.debugLine="If hasImage Then img.Pop(Avatar)";
if (_hasimage) { 
_img._pop /*String*/ (_avatar);};
 //BA.debugLineNum = 180;BA.debugLine="If hasBadge Then";
if (_hasbadge) { 
 //BA.debugLineNum = 181;BA.debugLine="Dim strBTN As String = Avatar.ToString";
_strbtn = _avatar._tostring /*String*/ ();
 //BA.debugLineNum = 182;BA.debugLine="badge.SetText(strBTN)";
_badge._settext /*b4j.example.vmbadge*/ ((Object)(_strbtn));
 //BA.debugLineNum = 183;BA.debugLine="Return badge.tostring";
if (true) return _badge._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 185;BA.debugLine="Return Avatar.tostring";
if (true) return _avatar._tostring /*String*/ ();
 };
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
