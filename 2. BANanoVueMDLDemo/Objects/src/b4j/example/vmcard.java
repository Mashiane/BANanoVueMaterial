package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcard.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _card = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _header = null;
public b4j.example.vmelement _content = null;
public b4j.example.vmcardactions _actions = null;
public b4j.example.vmelement _headertext = null;
public b4j.example.vmcardmedia _media = null;
public boolean _monside = false;
public b4j.example.vmavatar _avatar = null;
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
public b4j.example.vmcard  _addaction(String _btnid,String _btntext) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub AddAction(btnID As String, btnText As String)";
 //BA.debugLineNum = 88;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 89;BA.debugLine="btn.Initialize(vue,btnID, module).SetText(btnText";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module)._settext /*b4j.example.vmbutton*/ (_btntext);
 //BA.debugLineNum = 90;BA.debugLine="btn.Pop(Actions.CardActions)";
_btn._pop /*String*/ (_actions._cardactions /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 135;BA.debugLine="Sub AddChild(child As VMElement) As VMCard";
 //BA.debugLineNum = 136;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 137;BA.debugLine="Card.SetText(childHTML)";
_card._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 171;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 172;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 173;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub AddClass(c As String) As VMCard";
 //BA.debugLineNum = 154;BA.debugLine="Card.AddClass(c)";
_card._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Card As VMElement";
_card = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Public Header As VMElement";
_header = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Public Content As VMElement";
_content = new b4j.example.vmelement();
 //BA.debugLineNum = 9;BA.debugLine="Public Actions As VMCardActions";
_actions = new b4j.example.vmcardactions();
 //BA.debugLineNum = 10;BA.debugLine="Private HeaderText As VMElement";
_headertext = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private Media As VMCardMedia";
_media = new b4j.example.vmcardmedia();
 //BA.debugLineNum = 12;BA.debugLine="Private monside As Boolean";
_monside = false;
 //BA.debugLineNum = 13;BA.debugLine="Private Avatar As VMAvatar";
_avatar = new b4j.example.vmavatar();
 //BA.debugLineNum = 14;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="Card.Initialize(v, ID)";
_card._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 21;BA.debugLine="Card.SetTag(\"md-card\")";
_card._settag /*b4j.example.vmelement*/ ("md-card");
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 24;BA.debugLine="Header.Initialize(vue,$\"${ID}ch\"$).SetTag(\"md-car";
_header._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"ch"))._settag /*b4j.example.vmelement*/ ("md-card-header");
 //BA.debugLineNum = 25;BA.debugLine="Content.Initialize(vue,$\"${ID}cc\"$).SetTag(\"md-ca";
_content._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"cc"))._settag /*b4j.example.vmelement*/ ("md-card-content");
 //BA.debugLineNum = 26;BA.debugLine="Actions.Initialize(vue,$\"${ID}actions\"$)";
_actions._initialize /*b4j.example.vmcardactions*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"actions"));
 //BA.debugLineNum = 27;BA.debugLine="HeaderText.Initialize(vue,$\"${ID}cht\"$).SetTag(\"m";
_headertext._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"cht"))._settag /*b4j.example.vmelement*/ ("md-card-header-text");
 //BA.debugLineNum = 28;BA.debugLine="Media.Initialize(vue,$\"${ID}media\"$)";
_media._initialize /*b4j.example.vmcardmedia*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"media"));
 //BA.debugLineNum = 29;BA.debugLine="monside = False";
_monside = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="Avatar.Initialize(vue,$\"${ID}avatar\"$,module)";
_avatar._initialize /*b4j.example.vmavatar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"avatar"),_module);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 149;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub Render";
 //BA.debugLineNum = 131;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetAccent(b As Boolean) As VMCard";
 //BA.debugLineNum = 51;BA.debugLine="Card.SetAccent(True)";
_card._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetAttr(attr As Map) As VMCard";
 //BA.debugLineNum = 160;BA.debugLine="Card.SetAttr(attr)";
_card._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setavatar(String _imgurl,String _imgalt) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetAvatar(imgURL As String, imgAlt As String)";
 //BA.debugLineNum = 35;BA.debugLine="Avatar.SetValue(imgURL)";
_avatar._setvalue /*b4j.example.vmavatar*/ (_imgurl);
 //BA.debugLineNum = 36;BA.debugLine="Avatar.SetAlt(imgAlt)";
_avatar._setalt /*b4j.example.vmavatar*/ (_imgalt);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setcontent(String _c) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetContent(c As String) As VMCard";
 //BA.debugLineNum = 95;BA.debugLine="Content.SetText(c)";
_content._settext /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setimage(String _imgurl,String _alt) throws Exception{
b4j.example.vmimage _img = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub SetImage(imgURL As String, alt As String) As V";
 //BA.debugLineNum = 73;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
 //BA.debugLineNum = 74;BA.debugLine="img.Initialize(vue,$\"${ID}image\"$,module).SetValu";
_img._initialize /*b4j.example.vmimage*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"image"),_module)._setvalue /*b4j.example.vmimage*/ (_imgurl,__c.True);
 //BA.debugLineNum = 75;BA.debugLine="img.SetAlt(alt)";
_img._setalt /*b4j.example.vmimage*/ (_alt);
 //BA.debugLineNum = 76;BA.debugLine="img.Pop(Media.CardMedia)";
_img._pop /*String*/ (_media._cardmedia /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmediabig(boolean _b) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetMediaBig(b As Boolean) As VMCard";
 //BA.debugLineNum = 56;BA.debugLine="Media.SetBig(b)";
_media._setbig /*b4j.example.vmcardmedia*/ (_b);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmediamedium(boolean _b) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetMediaMedium(b As Boolean) As VMCard";
 //BA.debugLineNum = 61;BA.debugLine="Media.SetMedium(b)";
_media._setmedium /*b4j.example.vmcardmedia*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmediaonside(boolean _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetMediaOnSide(b As Boolean) As VMCard";
 //BA.debugLineNum = 41;BA.debugLine="monside = b";
_monside = _b;
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetPadding(p As Object) As VMCard";
 //BA.debugLineNum = 179;BA.debugLine="Card.SetPaddingAll(p)";
_card._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetPrimary(b As Boolean) As VMCard";
 //BA.debugLineNum = 46;BA.debugLine="Card.SetPrimary(True)";
_card._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetStyle(sm As Map) As VMCard";
 //BA.debugLineNum = 166;BA.debugLine="Card.SetStyle(sm)";
_card._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setsubheading(String _t) throws Exception{
b4j.example.vmelement _title = null;
 //BA.debugLineNum = 80;BA.debugLine="Sub SetSubHeading(t As String) As VMCard";
 //BA.debugLineNum = 81;BA.debugLine="Dim title As VMElement";
_title = new b4j.example.vmelement();
 //BA.debugLineNum = 82;BA.debugLine="title.Initialize(vue,$\"${ID}subheading\"$).SetTag(";
_title._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"subheading"))._settag /*b4j.example.vmelement*/ ("div")._setsubhead /*b4j.example.vmelement*/ (__c.True)._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 83;BA.debugLine="title.Pop(HeaderText)";
_title._pop /*String*/ (_headertext);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetText(t As Object) As VMCard";
 //BA.debugLineNum = 143;BA.debugLine="Card.SetText(t)";
_card._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settheme(Object _vartheme) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetTheme(varTheme As Object) As VMCard";
 //BA.debugLineNum = 191;BA.debugLine="SetAttr(CreateMap(\"md-theme\": varTheme))";
_setattr(__c.createMap(new Object[] {(Object)("md-theme"),_vartheme}));
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setthemeaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetThemeAccent(b As Boolean) As VMCard    'ign";
 //BA.debugLineNum = 203;BA.debugLine="AddClass(\"md-accent\")";
_addclass("md-accent");
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setthemeprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetThemePrimary(b As Boolean) As VMCard    'ig";
 //BA.debugLineNum = 197;BA.debugLine="AddClass(\"md-primary\")";
_addclass("md-primary");
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settitle(String _t) throws Exception{
b4j.example.vmelement _title = null;
 //BA.debugLineNum = 65;BA.debugLine="Sub SetTitle(t As String) As VMCard";
 //BA.debugLineNum = 66;BA.debugLine="Dim title As VMElement";
_title = new b4j.example.vmelement();
 //BA.debugLineNum = 67;BA.debugLine="title.Initialize(vue,$\"${ID}title\"$).SetTag(\"div\"";
_title._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"title"))._settag /*b4j.example.vmelement*/ ("div")._settitle /*b4j.example.vmelement*/ (__c.True)._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 68;BA.debugLine="title.Pop(HeaderText)";
_title._pop /*String*/ (_headertext);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetVIf(vif As Object) As VMCard";
 //BA.debugLineNum = 120;BA.debugLine="Card.SetVIf(vif)";
_card._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetVModel(k As String) As VMCard";
 //BA.debugLineNum = 115;BA.debugLine="Card.SetVModel(k)";
_card._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetVShow(vif As Object) As VMCard";
 //BA.debugLineNum = 125;BA.debugLine="Card.SetVShow(vif)";
_card._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setwithhover(boolean _varwith) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetWithHover(varWith As Boolean) As VMCard";
 //BA.debugLineNum = 185;BA.debugLine="SetAttr(CreateMap(\":md-with-hover\": varWith))";
_setattr(__c.createMap(new Object[] {(Object)(":md-with-hover"),(Object)(_varwith)}));
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 102;BA.debugLine="HeaderText.Pop(Header)";
_headertext._pop /*String*/ (_header);
 //BA.debugLineNum = 103;BA.debugLine="If monside Then";
if (_monside) { 
 //BA.debugLineNum = 104;BA.debugLine="Media.Pop(Header)";
_media._pop /*String*/ (_header);
 }else {
 //BA.debugLineNum = 106;BA.debugLine="Media.Pop(Card)";
_media._pop /*String*/ (_card);
 };
 //BA.debugLineNum = 108;BA.debugLine="Header.Pop(Card)";
_header._pop /*String*/ (_card);
 //BA.debugLineNum = 109;BA.debugLine="Content.Pop(Card)";
_content._pop /*String*/ (_card);
 //BA.debugLineNum = 110;BA.debugLine="Actions.Pop(Card)";
_actions._pop /*String*/ (_card);
 //BA.debugLineNum = 111;BA.debugLine="Return Card.ToString";
if (true) return _card._tostring /*String*/ ();
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
