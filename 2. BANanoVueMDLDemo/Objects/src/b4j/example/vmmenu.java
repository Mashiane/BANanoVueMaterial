package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _menu = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _menucontent = null;
public boolean _bactive = false;
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
public b4j.example.vmmenu  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 117;BA.debugLine="Sub AddChild(child As VMElement) As VMMenu";
 //BA.debugLineNum = 118;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 119;BA.debugLine="Menu.SetText(childHTML)";
_menu._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 163;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 164;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 165;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub AddClass(c As String) As VMMenu";
 //BA.debugLineNum = 146;BA.debugLine="Menu.AddClass(c)";
_menu._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public String  _addicontext(String _itemid,String _iconname,String _text) throws Exception{
b4j.example.vmmenuitem _mi = null;
b4j.example.vmicon _icn = null;
b4j.example.vmelement _span = null;
 //BA.debugLineNum = 66;BA.debugLine="Sub AddIconText(itemID As String, iconName As Stri";
 //BA.debugLineNum = 67;BA.debugLine="Dim mi As VMMenuItem";
_mi = new b4j.example.vmmenuitem();
 //BA.debugLineNum = 68;BA.debugLine="mi.Initialize(vue,itemID, eventHandler)";
_mi._initialize /*b4j.example.vmmenuitem*/ (ba,_vue,_itemid,_eventhandler);
 //BA.debugLineNum = 70;BA.debugLine="If iconName <> \"\" Then";
if ((_iconname).equals("") == false) { 
 //BA.debugLineNum = 71;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
 //BA.debugLineNum = 72;BA.debugLine="icn.Initialize(vue, $\"${itemID}icon\"$).SetText(i";
_icn._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_itemid))+"icon"))._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 73;BA.debugLine="icn.Pop(mi.MenuItem)";
_icn._pop /*String*/ (_mi._menuitem /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 76;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 77;BA.debugLine="span.Initialize(vue,$\"${itemID}text\"$).SetTag(\"sp";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_itemid))+"text"))._settag /*b4j.example.vmelement*/ ("span")._settext /*b4j.example.vmelement*/ (_text);
 //BA.debugLineNum = 78;BA.debugLine="span.Pop(mi.MenuItem)";
_span._pop /*String*/ (_mi._menuitem /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 79;BA.debugLine="mi.Pop(MenuContent)";
_mi._pop /*String*/ (_menucontent);
 //BA.debugLineNum = 80;BA.debugLine="MenuContent.hasContent = True";
_menucontent._hascontent /*boolean*/  = __c.True;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _addmenuitem(String _itemid,String _iconname,String _itemtext) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub AddMenuItem(itemID As String, iconName As Stri";
 //BA.debugLineNum = 62;BA.debugLine="AddIconText(itemID, iconName, itemText)";
_addicontext(_itemid,_iconname,_itemtext);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 280;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Menu As VMElement";
_menu = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private MenuContent As VMElement";
_menucontent = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Private bActive As Boolean";
_bactive = false;
 //BA.debugLineNum = 9;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _module) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="Menu.Initialize(v, ID)";
_menu._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="Menu.SetTag(\"md-menu\")";
_menu._settag /*b4j.example.vmelement*/ ("md-menu");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="MenuContent.Initialize(vue,$\"${ID}content\"$).SetT";
_menucontent._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"content"))._settag /*b4j.example.vmelement*/ ("md-menu-content");
 //BA.debugLineNum = 19;BA.debugLine="bActive = False";
_bactive = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 141;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub Render";
 //BA.debugLineNum = 113;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetAccent(b As Boolean) As VMMenu";
 //BA.debugLineNum = 135;BA.debugLine="Menu.SetAccent(True)";
_menu._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setactive(Object _varactive) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetActive(varActive As Object) As VMMenu";
 //BA.debugLineNum = 177;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
_setattr(__c.createMap(new Object[] {(Object)("md-active"),_varactive}));
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setactivesync(String _v) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetActiveSync(v As String) As VMMenu";
 //BA.debugLineNum = 106;BA.debugLine="Menu.SetActiveSync(v)";
_menu._setactivesync /*b4j.example.vmelement*/ (_v);
 //BA.debugLineNum = 107;BA.debugLine="bActive = True";
_bactive = __c.True;
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setaligntrigger(Object _varaligntrigger) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetAlignTrigger(varAlignTrigger As Object) As";
 //BA.debugLineNum = 225;BA.debugLine="SetAttr(CreateMap(\"md-align-trigger\": varAlignTri";
_setattr(__c.createMap(new Object[] {(Object)("md-align-trigger"),_varaligntrigger}));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetAttr(attr As Map) As VMMenu";
 //BA.debugLineNum = 152;BA.debugLine="Menu.SetAttr(attr)";
_menu._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setbutton(String _iconname,String _text) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 48;BA.debugLine="Sub SetButton(iconName As String, text As String)";
 //BA.debugLineNum = 49;BA.debugLine="If text = \"\" Then Return Me";
if ((_text).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 50;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 51;BA.debugLine="btn.Initialize(vue, $\"${ID}button\"$,eventHandler)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"button"),_eventhandler)._setmenutrigger /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 52;BA.debugLine="If iconName <> \"\" Then";
if ((_iconname).equals("") == false) { 
 //BA.debugLineNum = 53;BA.debugLine="btn.SetIcon(iconName)";
_btn._seticon /*b4j.example.vmbutton*/ (_iconname);
 };
 //BA.debugLineNum = 55;BA.debugLine="btn.SetText(text)";
_btn._settext /*b4j.example.vmbutton*/ (_text);
 //BA.debugLineNum = 56;BA.debugLine="btn.Pop(Menu)";
_btn._pop /*String*/ (_menu);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setcloseonclick(boolean _varcloseonclick) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetCloseOnClick(varCloseOnClick As Boolean) As";
 //BA.debugLineNum = 183;BA.debugLine="SetAttr(CreateMap(\":md-close-on-click\": varCloseO";
_setattr(__c.createMap(new Object[] {(Object)(":md-close-on-click"),(Object)(_varcloseonclick)}));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setcloseonselect(boolean _varcloseonselect) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetCloseOnSelect(varCloseOnSelect As Boolean)";
 //BA.debugLineNum = 189;BA.debugLine="SetAttr(CreateMap(\":md-close-on-select\": varClose";
_setattr(__c.createMap(new Object[] {(Object)(":md-close-on-select"),(Object)(_varcloseonselect)}));
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirection(Object _vardirection) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetDirection(varDirection As Object) As VMMenu";
 //BA.debugLineNum = 195;BA.debugLine="SetAttr(CreateMap(\"md-direction\": varDirection))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),_vardirection}));
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirectionbottomend(boolean _b) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetDirectionBottomEnd(b As Boolean) As VMMenu";
 //BA.debugLineNum = 207;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom-end\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),(Object)("bottom-end")}));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirectionbottomstart(boolean _b) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetDirectionBottomStart(b As Boolean) As VMMen";
 //BA.debugLineNum = 201;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom-start\")";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),(Object)("bottom-start")}));
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirectiontopend(boolean _b) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetDirectionTopEnd(b As Boolean) As VMMenu";
 //BA.debugLineNum = 219;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top-end\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),(Object)("top-end")}));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirectiontopstart(boolean _b) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetDirectionTopStart(b As Boolean) As VMMenu";
 //BA.debugLineNum = 213;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top-start\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),(Object)("top-start")}));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _seticon(String _icon) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 25;BA.debugLine="Sub SetIcon(icon As String) As VMMenu";
 //BA.debugLineNum = 26;BA.debugLine="If icon = \"\" Then Return Me";
if ((_icon).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
 //BA.debugLineNum = 27;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 28;BA.debugLine="btn.Initialize(vue, $\"${ID}icon\"$, eventHandler).";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"),_eventhandler)._setmenutrigger /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 29;BA.debugLine="btn.SetIcon(icon).SetIconButton(True)";
_btn._seticon /*b4j.example.vmbutton*/ (_icon)._seticonbutton /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 30;BA.debugLine="btn.Pop(Menu)";
_btn._pop /*String*/ (_menu);
 //BA.debugLineNum = 31;BA.debugLine="SetDirectionBottomEnd(True)";
_setdirectionbottomend(__c.True);
 //BA.debugLineNum = 32;BA.debugLine="SetAlignTrigger(True)";
_setaligntrigger((Object)(__c.True));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setimage(String _imgurl,String _txt) throws Exception{
b4j.example.vmavatar _avt = null;
 //BA.debugLineNum = 37;BA.debugLine="Sub SetImage(imgURL As String, txt As String) As V";
 //BA.debugLineNum = 38;BA.debugLine="Dim avt As VMAvatar";
_avt = new b4j.example.vmavatar();
 //BA.debugLineNum = 39;BA.debugLine="avt.Initialize(vue, $\"${ID}image\"$,eventHandler).";
_avt._initialize /*b4j.example.vmavatar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"image"),_eventhandler)._setalt /*b4j.example.vmavatar*/ (_txt)._setmenutrigger /*b4j.example.vmavatar*/ (__c.True);
 //BA.debugLineNum = 40;BA.debugLine="avt.SetValue(imgURL)";
_avt._setvalue /*b4j.example.vmavatar*/ (_imgurl);
 //BA.debugLineNum = 41;BA.debugLine="avt.Pop(Menu)";
_avt._pop /*String*/ (_menu);
 //BA.debugLineNum = 42;BA.debugLine="SetDirectionBottomEnd(True)";
_setdirectionbottomend(__c.True);
 //BA.debugLineNum = 43;BA.debugLine="SetAlignTrigger(True)";
_setaligntrigger((Object)(__c.True));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setoffsetx(Object _varoffsetx) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetOffsetX(varOffsetX As Object) As VMMenu";
 //BA.debugLineNum = 231;BA.debugLine="SetAttr(CreateMap(\"md-offset-x\": varOffsetX))";
_setattr(__c.createMap(new Object[] {(Object)("md-offset-x"),_varoffsetx}));
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setoffsety(Object _varoffsety) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetOffsetY(varOffsetY As Object) As VMMenu";
 //BA.debugLineNum = 237;BA.debugLine="SetAttr(CreateMap(\"md-offset-y\": varOffsetY))";
_setattr(__c.createMap(new Object[] {(Object)("md-offset-y"),_varoffsety}));
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetPadding(p As Object) As VMMenu";
 //BA.debugLineNum = 171;BA.debugLine="Menu.SetPaddingAll(p)";
_menu._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetPrimary(b As Boolean) As VMMenu";
 //BA.debugLineNum = 130;BA.debugLine="Menu.SetPrimary(True)";
_menu._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsize(Object _varsize) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetSize(varSize As Object) As VMMenu";
 //BA.debugLineNum = 243;BA.debugLine="SetAttr(CreateMap(\"md-size\": varSize))";
_setattr(__c.createMap(new Object[] {(Object)("md-size"),_varsize}));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizeauto(boolean _b) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetSizeAuto(b As Boolean) As VMMenu    'ignore";
 //BA.debugLineNum = 273;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"auto\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-size"),(Object)("auto")}));
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizebig(boolean _b) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetSizeBig(b As Boolean) As VMMenu    'ignore";
 //BA.debugLineNum = 261;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"big\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-size"),(Object)("big")}));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizehuge(boolean _b) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetSizeHuge(b As Boolean) As VMMenu    'ignore";
 //BA.debugLineNum = 267;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"huge\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-size"),(Object)("huge")}));
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizemedium(boolean _b) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetSizeMedium(b As Boolean) As VMMenu    'igno";
 //BA.debugLineNum = 255;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"medium\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-size"),(Object)("medium")}));
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizesmall(boolean _b) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetSizeSmall(b As Boolean) As VMMenu    'ignor";
 //BA.debugLineNum = 249;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"small\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-size"),(Object)("small")}));
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetStyle(sm As Map) As VMMenu";
 //BA.debugLineNum = 158;BA.debugLine="Menu.SetStyle(sm)";
_menu._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetText(t As Object) As VMMenu";
 //BA.debugLineNum = 125;BA.debugLine="Menu.SetText(t)";
_menu._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetVIf(vif As Object) As VMMenu";
 //BA.debugLineNum = 96;BA.debugLine="Menu.SetVIf(vif)";
_menu._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetVModel(k As String) As VMMenu";
 //BA.debugLineNum = 91;BA.debugLine="Menu.SetVModel(k)";
_menu._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetVShow(vif As Object) As VMMenu";
 //BA.debugLineNum = 101;BA.debugLine="Menu.SetVShow(vif)";
_menu._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 86;BA.debugLine="If MenuContent.hasContent Then MenuContent.Pop(Me";
if (_menucontent._hascontent /*boolean*/ ) { 
_menucontent._pop /*String*/ (_menu);};
 //BA.debugLineNum = 87;BA.debugLine="Return Menu.ToString";
if (true) return _menu._tostring /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
