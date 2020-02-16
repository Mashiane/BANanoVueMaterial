package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtoolbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtoolbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtoolbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _toolbar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hascontent = false;
public b4j.example.vmelement _endsection = null;
public b4j.example.vmelement _startsection = null;
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
public b4j.example.vmtoolbar  _addavatar(String _key,String _imgurl,String _txt,String _tooltip,String _badge) throws Exception{
b4j.example.vmavatar _avt = null;
 //BA.debugLineNum = 183;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, txt";
 //BA.debugLineNum = 184;BA.debugLine="Dim avt As VMAvatar";
_avt = new b4j.example.vmavatar();
 //BA.debugLineNum = 185;BA.debugLine="avt.Initialize(vue, key,module)";
_avt._initialize /*b4j.example.vmavatar*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 186;BA.debugLine="avt.SetValue(imgURL)";
_avt._setvalue /*b4j.example.vmavatar*/ (_imgurl);
 //BA.debugLineNum = 187;BA.debugLine="avt.SetAlt(txt)";
_avt._setalt /*b4j.example.vmavatar*/ (_txt);
 //BA.debugLineNum = 188;BA.debugLine="avt.SetToolTip(toolTip)";
_avt._settooltip /*b4j.example.vmavatar*/ (_tooltip);
 //BA.debugLineNum = 189;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 190;BA.debugLine="avt.SetBadgeContent(badge)";
_avt._setbadgecontent /*b4j.example.vmavatar*/ ((int)(Double.parseDouble(_badge)));
 };
 //BA.debugLineNum = 192;BA.debugLine="avt.Pop(EndSection)";
_avt._pop /*String*/ (_endsection);
 //BA.debugLineNum = 193;BA.debugLine="EndSection.hasContent = True";
_endsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 194;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addavatarstart(String _key,String _imgurl,String _txt,String _tooltip,String _badge) throws Exception{
b4j.example.vmavatar _avt = null;
 //BA.debugLineNum = 198;BA.debugLine="Sub AddAvatarStart(key As String, imgURL As String";
 //BA.debugLineNum = 199;BA.debugLine="Dim avt As VMAvatar";
_avt = new b4j.example.vmavatar();
 //BA.debugLineNum = 200;BA.debugLine="avt.Initialize(vue, key,module)";
_avt._initialize /*b4j.example.vmavatar*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 201;BA.debugLine="avt.SetValue(imgURL)";
_avt._setvalue /*b4j.example.vmavatar*/ (_imgurl);
 //BA.debugLineNum = 202;BA.debugLine="avt.SetAlt(txt)";
_avt._setalt /*b4j.example.vmavatar*/ (_txt);
 //BA.debugLineNum = 203;BA.debugLine="avt.SetToolTip(toolTip)";
_avt._settooltip /*b4j.example.vmavatar*/ (_tooltip);
 //BA.debugLineNum = 204;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 205;BA.debugLine="avt.SetBadgeContent(badge)";
_avt._setbadgecontent /*b4j.example.vmavatar*/ ((int)(Double.parseDouble(_badge)));
 };
 //BA.debugLineNum = 207;BA.debugLine="avt.Pop(StartSection)";
_avt._pop /*String*/ (_startsection);
 //BA.debugLineNum = 208;BA.debugLine="StartSection.hasContent = True";
_startsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 209;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addbutton(String _key,String _iconname,String _text,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 144;BA.debugLine="Sub AddButton(key As String, iconName As String, t";
 //BA.debugLineNum = 145;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 146;BA.debugLine="btn.Initialize(vue, key, module).SetToolTip(toolT";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module)._settooltip /*b4j.example.vmbutton*/ (_tooltip)._seticon /*b4j.example.vmbutton*/ (_iconname)._settext /*b4j.example.vmbutton*/ (_text);
 //BA.debugLineNum = 147;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 148;BA.debugLine="btn.SetBadgeContent(badge)";
_btn._setbadgecontent /*b4j.example.vmbutton*/ ((int)(Double.parseDouble(_badge)));
 };
 //BA.debugLineNum = 150;BA.debugLine="btn.Pop(EndSection)";
_btn._pop /*String*/ (_endsection);
 //BA.debugLineNum = 151;BA.debugLine="EndSection.hasContent = True";
_endsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 152;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addbuttonstart(String _key,String _iconname,String _text,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 156;BA.debugLine="Sub AddButtonStart(key As String, iconName As Stri";
 //BA.debugLineNum = 157;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 158;BA.debugLine="btn.Initialize(vue, key, module).SetToolTip(toolT";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module)._settooltip /*b4j.example.vmbutton*/ (_tooltip)._seticon /*b4j.example.vmbutton*/ (_iconname)._settext /*b4j.example.vmbutton*/ (_text);
 //BA.debugLineNum = 159;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 160;BA.debugLine="btn.SetBadgeContent(badge)";
_btn._setbadgecontent /*b4j.example.vmbutton*/ ((int)(Double.parseDouble(_badge)));
 };
 //BA.debugLineNum = 162;BA.debugLine="btn.Pop(StartSection)";
_btn._pop /*String*/ (_startsection);
 //BA.debugLineNum = 163;BA.debugLine="StartSection.hasContent = True";
_startsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 164;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub AddClass(c As String) As VMToolBar";
 //BA.debugLineNum = 276;BA.debugLine="ToolBar.AddClass(c)";
_toolbar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addicon(String _key,String _iconname,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 132;BA.debugLine="Sub AddIcon(key As String, iconName As String, too";
 //BA.debugLineNum = 133;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 134;BA.debugLine="btn.Initialize(vue, key, module).SetIcon(iconName";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module)._seticon /*b4j.example.vmbutton*/ (_iconname)._seticonbutton /*b4j.example.vmbutton*/ (__c.True)._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 135;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 136;BA.debugLine="btn.SetBadgeContent(badge)";
_btn._setbadgecontent /*b4j.example.vmbutton*/ ((int)(Double.parseDouble(_badge)));
 };
 //BA.debugLineNum = 138;BA.debugLine="btn.Pop(EndSection)";
_btn._pop /*String*/ (_endsection);
 //BA.debugLineNum = 139;BA.debugLine="EndSection.hasContent = True";
_endsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 140;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addiconstart(String _key,String _iconname,String _tooltip,String _badge) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 213;BA.debugLine="Sub AddIconStart(key As String, iconName As String";
 //BA.debugLineNum = 214;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 215;BA.debugLine="btn.Initialize(vue, key, module).SetIcon(iconName";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_key,_module)._seticon /*b4j.example.vmbutton*/ (_iconname)._seticonbutton /*b4j.example.vmbutton*/ (__c.True)._settooltip /*b4j.example.vmbutton*/ (_tooltip);
 //BA.debugLineNum = 216;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
 //BA.debugLineNum = 217;BA.debugLine="btn.SetBadgeContent(badge)";
_btn._setbadgecontent /*b4j.example.vmbutton*/ ((int)(Double.parseDouble(_badge)));
 };
 //BA.debugLineNum = 219;BA.debugLine="btn.Pop(StartSection)";
_btn._pop /*String*/ (_startsection);
 //BA.debugLineNum = 220;BA.debugLine="StartSection.hasContent = True";
_startsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 221;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addmenu(b4j.example.vmmenu _mnu) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub AddMenu(mnu As VMMenu) As VMToolBar";
 //BA.debugLineNum = 170;BA.debugLine="mnu.Pop(EndSection)";
_mnu._pop /*String*/ (_endsection);
 //BA.debugLineNum = 171;BA.debugLine="EndSection.hasContent = True";
_endsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 172;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addmenustart(b4j.example.vmmenu _mnu) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub AddMenuStart(mnu As VMMenu) As VMToolBar";
 //BA.debugLineNum = 177;BA.debugLine="mnu.Pop(StartSection)";
_mnu._pop /*String*/ (_startsection);
 //BA.debugLineNum = 178;BA.debugLine="StartSection.hasContent = True";
_startsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 179;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public String  _addsearch(String _searchid,String _placeholder,String _vmodel) throws Exception{
b4j.example.vmfield _mf = null;
b4j.example.vminput _inp = null;
 //BA.debugLineNum = 51;BA.debugLine="Sub AddSearch(searchID As String, placeHolder As S";
 //BA.debugLineNum = 52;BA.debugLine="searchID = searchID.tolowercase";
_searchid = _searchid.toLowerCase();
 //BA.debugLineNum = 53;BA.debugLine="Dim mf As VMField";
_mf = new b4j.example.vmfield();
 //BA.debugLineNum = 54;BA.debugLine="Dim inp As VMInput";
_inp = new b4j.example.vminput();
 //BA.debugLineNum = 56;BA.debugLine="mf.Initialize(vue, ID, $\"${searchID}field\"$, modu";
_mf._initialize /*b4j.example.vmfield*/ (ba,_vue,_id,(""+__c.SmartStringFormatter("",(Object)(_searchid))+"field"),_module)._setclearable /*b4j.example.vmfield*/ (__c.True)._setmaxwidth /*b4j.example.vmfield*/ ("300px");
 //BA.debugLineNum = 57;BA.debugLine="inp.Initialize(vue, searchID, module).SetPlacehol";
_inp._initialize /*b4j.example.vminput*/ (ba,_vue,_searchid,_module)._setplaceholder /*b4j.example.vminput*/ ((Object)(_placeholder))._setvmodel /*b4j.example.vminput*/ (_vmodel);
 //BA.debugLineNum = 58;BA.debugLine="inp.Pop(mf.Field)";
_inp._pop /*String*/ (_mf._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 59;BA.debugLine="mf.Pop(EndSection)";
_mf._pop /*String*/ (_endsection);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 383;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ToolBar As VMElement";
_toolbar = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 7;BA.debugLine="Public EndSection As VMElement";
_endsection = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Public StartSection As VMElement";
_startsection = new b4j.example.vmelement();
 //BA.debugLineNum = 9;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _createbutton(String _btnid) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 258;BA.debugLine="Sub CreateButton(btnID As String) As VMButton";
 //BA.debugLineNum = 259;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 260;BA.debugLine="el.Initialize(vue, btnID, module)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module);
 //BA.debugLineNum = 261;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 271;BA.debugLine="SetVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public String  _hidebackbutton() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub HideBackButton";
 //BA.debugLineNum = 84;BA.debugLine="SetHasBackButton(False)";
_sethasbackbutton(__c.False);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _hidemenu() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub HideMenu";
 //BA.debugLineNum = 96;BA.debugLine="SetHasMenuButton(False)";
_sethasmenubutton(__c.False);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 16;BA.debugLine="ToolBar.Initialize(vue, ID).SetTag(\"md-app-toolba";
_toolbar._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-app-toolbar");
 //BA.debugLineNum = 17;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="EndSection.Initialize(vue,$\"${ID}end\"$).SetTag(\"d";
_endsection._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"end"))._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("md-toolbar-section-end");
 //BA.debugLineNum = 19;BA.debugLine="StartSection.Initialize(vue,$\"${ID}start\"$).SetTa";
_startsection._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"start"))._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("md-toolbar-section-start");
 //BA.debugLineNum = 20;BA.debugLine="ToolBar.RemoveAttr(\":required\")";
_toolbar._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 21;BA.debugLine="ToolBar.RemoveAttr(\":disabled\")";
_toolbar._removeattr /*b4j.example.vmelement*/ (":disabled");
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 377;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub Render";
 //BA.debugLineNum = 373;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetAccent(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 338;BA.debugLine="ToolBar.SetAccent(True)";
_toolbar._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 339;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetAttr(attr As Map) As VMToolBar";
 //BA.debugLineNum = 282;BA.debugLine="ToolBar.SetAttr(attr)";
_toolbar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdense(boolean _b) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetDense(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 306;BA.debugLine="ToolBar.SetDense(b)";
_toolbar._setdense /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetDisabled(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 79;BA.debugLine="ToolBar.SetDisabled(b)";
_toolbar._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetElevation(e As Int) As VMToolBar";
 //BA.debugLineNum = 327;BA.debugLine="ToolBar.SetElevation(e)";
_toolbar._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _sethasbackbutton(boolean _b) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub SetHasBackButton(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 226;BA.debugLine="vue.SetStateSingle(\"backshow\", b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("backshow",(Object)(_b));
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _sethaslogo(boolean _b) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 26;BA.debugLine="Sub SetHasLogo(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 27;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 28;BA.debugLine="vue.SetStateSingle(\"logo\", b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("logo",(Object)(_b));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _sethasmenubutton(boolean _b) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetHasMenuButton(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 232;BA.debugLine="vue.SetStateSingle(\"menushow\", b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("menushow",(Object)(_b));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setlarge(boolean _b) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetLarge(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 312;BA.debugLine="ToolBar.SetLarge(b)";
_toolbar._setlarge /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setlogo(String _url) throws Exception{
b4j.example.vmimage _img = null;
 //BA.debugLineNum = 32;BA.debugLine="Sub SetLogo(url As String) As VMToolBar";
 //BA.debugLineNum = 33;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
 //BA.debugLineNum = 34;BA.debugLine="img.Initialize(vue, $\"${ID}logo\"$, module)";
_img._initialize /*b4j.example.vmimage*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"logo"),_module);
 //BA.debugLineNum = 35;BA.debugLine="img.SetValue(url, True).SetStyle(CreateMap(\"heigh";
_img._setvalue /*b4j.example.vmimage*/ (_url,__c.True)._setstyle /*b4j.example.vmimage*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("42px"),(Object)("width"),(Object)("56px")}));
 //BA.debugLineNum = 36;BA.debugLine="img.Pop(StartSection)";
_img._pop /*String*/ (_startsection);
 //BA.debugLineNum = 37;BA.debugLine="img.SetVShow(\"logo\")";
_img._setvshow /*b4j.example.vmimage*/ ("logo");
 //BA.debugLineNum = 38;BA.debugLine="vue.SetStateSingle(\"logo\", False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("logo",(Object)(__c.False));
 //BA.debugLineNum = 39;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 40;BA.debugLine="StartSection.hasContent = True";
_startsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetMarginAll(p As String) As VMToolBar";
 //BA.debugLineNum = 358;BA.debugLine="ToolBar.SetMarginAll(p)";
_toolbar._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmedium(boolean _b) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetMedium(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 317;BA.debugLine="ToolBar.SetMedium(b)";
_toolbar._setmedium /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmode(String _str) throws Exception{
String _pp = "";
 //BA.debugLineNum = 99;BA.debugLine="Sub SetMode(str As String) As VMToolBar   'ignore";
 //BA.debugLineNum = 100;BA.debugLine="Dim pp As String = $\"${ID}mode\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"mode");
 //BA.debugLineNum = 101;BA.debugLine="vue.SetStateSingle(pp, str)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_str));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodefixed(boolean _b) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetModeFixed(b As Boolean) As VMToolBar   'ign";
 //BA.debugLineNum = 107;BA.debugLine="SetMode(\"fixed\")";
_setmode("fixed");
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodefixedlast(boolean _b) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetModeFixedLast(b As Boolean) As VMToolBar  '";
 //BA.debugLineNum = 122;BA.debugLine="SetMode(\"fixed-last\")";
_setmode("fixed-last");
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodeflexible(boolean _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetModeFlexible(b As Boolean) As VMToolBar  'i";
 //BA.debugLineNum = 117;BA.debugLine="SetMode(\"flexible\")";
_setmode("flexible");
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodeoverlap(boolean _b) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetModeOverlap(b As Boolean) As VMToolBar   'i";
 //BA.debugLineNum = 127;BA.debugLine="SetMode(\"overlap\")";
_setmode("overlap");
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodereveal(boolean _b) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetModeReveal(b As Boolean) As VMToolBar   'ig";
 //BA.debugLineNum = 112;BA.debugLine="SetMode(\"reveal\")";
_setmode("reveal");
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetPaddingAll(p As String) As VMToolBar";
 //BA.debugLineNum = 352;BA.debugLine="ToolBar.SetPaddingAll(p)";
_toolbar._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetPrimary(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 332;BA.debugLine="ToolBar.SetPrimary(True)";
_toolbar._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 333;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settabletoolbar(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetTableToolbar(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 72;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 73;BA.debugLine="ToolBar.SetTag(\"md-table-toolbar\")";
_toolbar._settag /*b4j.example.vmelement*/ ("md-table-toolbar");
 //BA.debugLineNum = 74;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settext(String _t) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetText(t As String) As VMToolBar";
 //BA.debugLineNum = 344;BA.debugLine="ToolBar.SetText(t)";
_toolbar._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 345;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settitle(String _tt) throws Exception{
String _pp = "";
String _page_title = "";
b4j.example.vmelement _span = null;
 //BA.debugLineNum = 286;BA.debugLine="Sub SetTitle(tt As String) As VMToolBar";
 //BA.debugLineNum = 287;BA.debugLine="Dim pp As String = $\"${ID}title\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"title");
 //BA.debugLineNum = 288;BA.debugLine="vue.SetStateSingle(pp, tt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_tt));
 //BA.debugLineNum = 290;BA.debugLine="Dim page_title As String = $\"{{ ${pp} }}\"$";
_page_title = ("{{ "+__c.SmartStringFormatter("",(Object)(_pp))+" }}");
 //BA.debugLineNum = 291;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 292;BA.debugLine="span.Initialize(vue, $\"${ID}title\"$).SetTag(\"h1\")";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"title"))._settag /*b4j.example.vmelement*/ ("h1")._settitle /*b4j.example.vmelement*/ (__c.True)._settext /*b4j.example.vmelement*/ (_page_title);
 //BA.debugLineNum = 293;BA.debugLine="span.Pop(StartSection)";
_span._pop /*String*/ (_startsection);
 //BA.debugLineNum = 294;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 295;BA.debugLine="StartSection.hasContent = True";
_startsection._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settoolbar(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetToolbar(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 64;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
 //BA.debugLineNum = 65;BA.debugLine="ToolBar.SetTag(\"md-toolbar\")";
_toolbar._settag /*b4j.example.vmelement*/ ("md-toolbar");
 //BA.debugLineNum = 66;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settransparent(boolean _b) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetTransparent(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 322;BA.debugLine="ToolBar.SetTransparent(b)";
_toolbar._settransparent /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvif(String _xshow) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetVIf(xshow As String) As VMToolBar";
 //BA.debugLineNum = 254;BA.debugLine="ToolBar.SetVif(xshow)";
_toolbar._setvif /*b4j.example.vmelement*/ (_xshow);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetVisible(b As Boolean) As VMToolBar";
 //BA.debugLineNum = 244;BA.debugLine="ToolBar.SetVisible(b)";
_toolbar._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvshow(String _xshow) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetVShow(xshow As String) As VMToolBar";
 //BA.debugLineNum = 249;BA.debugLine="ToolBar.SetVShow(xshow)";
_toolbar._setvshow /*b4j.example.vmelement*/ (_xshow);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub Show";
 //BA.debugLineNum = 266;BA.debugLine="SetVisible(True)";
_setvisible(__c.True);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public String  _showbackbutton() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub ShowBackButton";
 //BA.debugLineNum = 88;BA.debugLine="SetHasBackButton(True)";
_sethasbackbutton(__c.True);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _showmenu() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub ShowMenu";
 //BA.debugLineNum = 92;BA.debugLine="SetHasMenuButton(True)";
_sethasmenubutton(__c.True);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _togglemenu() throws Exception{
boolean _bdrawer = false;
 //BA.debugLineNum = 236;BA.debugLine="Sub ToggleMenu";
 //BA.debugLineNum = 238;BA.debugLine="Dim bDrawer As Boolean = vue.GetState(\"drawer\",Fa";
_bdrawer = BA.ObjectToBoolean(_vue._getstate /*Object*/ ("drawer",(Object)(__c.False)));
 //BA.debugLineNum = 239;BA.debugLine="bDrawer = Not(bDrawer)";
_bdrawer = __c.Not(_bdrawer);
 //BA.debugLineNum = 240;BA.debugLine="vue.SetStateSingle(\"menushow\", bDrawer)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("menushow",(Object)(_bdrawer));
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 363;BA.debugLine="If StartSection.hasContent Then";
if (_startsection._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 364;BA.debugLine="StartSection.Pop(ToolBar)";
_startsection._pop /*String*/ (_toolbar);
 };
 //BA.debugLineNum = 366;BA.debugLine="If EndSection.hasContent Then";
if (_endsection._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 367;BA.debugLine="EndSection.Pop(ToolBar)";
_endsection._pop /*String*/ (_toolbar);
 };
 //BA.debugLineNum = 369;BA.debugLine="Return ToolBar.tostring";
if (true) return _toolbar._tostring /*String*/ ();
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _updatelogo(String _url) throws Exception{
String _pp = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub UpdateLogo(URL As String) As VMToolBar";
 //BA.debugLineNum = 44;BA.debugLine="Dim pp As String = $\"${ID}logosrc\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"logosrc");
 //BA.debugLineNum = 45;BA.debugLine="vue.SetStateSingle(pp, URL)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_url));
 //BA.debugLineNum = 46;BA.debugLine="SetHasLogo(True)";
_sethaslogo(__c.True);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _updatetitle(String _tt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 299;BA.debugLine="Sub UpdateTitle(tt As String) As VMToolBar";
 //BA.debugLineNum = 300;BA.debugLine="Dim pp As String = $\"${ID}title\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"title");
 //BA.debugLineNum = 301;BA.debugLine="vue.SetStateSingle(pp, tt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_tt));
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
