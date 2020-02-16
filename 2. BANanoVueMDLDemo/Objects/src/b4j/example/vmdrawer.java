package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdrawer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdrawer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdrawer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _drawer = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _bactive = false;
public b4j.example.vmlist _drawerlist = null;
public anywheresoftware.b4a.objects.collections.Map _items = null;
public String _mshow = "";
public b4j.example.vmtoolbar _toolbar = null;
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
public String  _addavatar(String _key,String _imgurl,String _text) throws Exception{
b4j.example.vmlistitem _item = null;
 //BA.debugLineNum = 79;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, tex";
 //BA.debugLineNum = 80;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
 //BA.debugLineNum = 81;BA.debugLine="item.Initialize(vue, key, module)";
_item._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 82;BA.debugLine="item.SetAvatar(imgURL)";
_item._setavatar /*b4j.example.vmlistitem*/ (_imgurl);
 //BA.debugLineNum = 83;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (_text);
 //BA.debugLineNum = 84;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub AddClass(c As String) As VMDrawer";
 //BA.debugLineNum = 127;BA.debugLine="Drawer.AddClass(c)";
_drawer._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _additem(String _key,String _icon,String _text) throws Exception{
b4j.example.vmlistitem _item = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub AddItem(key As String, icon As String, text As";
 //BA.debugLineNum = 100;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
 //BA.debugLineNum = 101;BA.debugLine="item.Initialize(vue, key, module)";
_item._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 102;BA.debugLine="item.SetIcon(icon, False)";
_item._seticon /*b4j.example.vmlistitem*/ (_icon,__c.False);
 //BA.debugLineNum = 103;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (_text);
 //BA.debugLineNum = 104;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _addsubavatar(String _parent,String _key,String _imgurl,String _text) throws Exception{
b4j.example.vmlistitem _li = null;
b4j.example.vmlist _pl = null;
b4j.example.vmlistitem _item = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub AddSubAvatar(parent As String, key As String,";
 //BA.debugLineNum = 88;BA.debugLine="If items.ContainsKey(parent) Then";
if (_items.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 89;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
_li = (b4j.example.vmlistitem)(_items.Get((Object)(_parent)));
 //BA.debugLineNum = 90;BA.debugLine="Dim pl As VMList = li.childList";
_pl = _li._childlist /*b4j.example.vmlist*/ ;
 //BA.debugLineNum = 91;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
 //BA.debugLineNum = 92;BA.debugLine="item.Initialize(vue, key, module)";
_item._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 93;BA.debugLine="item.SetAvatar(imgURL)";
_item._setavatar /*b4j.example.vmlistitem*/ (_imgurl);
 //BA.debugLineNum = 94;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (_text);
 //BA.debugLineNum = 95;BA.debugLine="item.Pop(pl)";
_item._pop /*String*/ (_pl);
 };
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _addsubitem(String _parent,String _key,String _icon,String _text) throws Exception{
b4j.example.vmlistitem _li = null;
b4j.example.vmlist _pl = null;
b4j.example.vmlistitem _item = null;
 //BA.debugLineNum = 107;BA.debugLine="Sub AddSubItem(parent As String, key As String, ic";
 //BA.debugLineNum = 108;BA.debugLine="If items.ContainsKey(parent) Then";
if (_items.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 109;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
_li = (b4j.example.vmlistitem)(_items.Get((Object)(_parent)));
 //BA.debugLineNum = 110;BA.debugLine="Dim pl As VMList = li.childList";
_pl = _li._childlist /*b4j.example.vmlist*/ ;
 //BA.debugLineNum = 111;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
 //BA.debugLineNum = 112;BA.debugLine="item.Initialize(vue, key, module)";
_item._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_module);
 //BA.debugLineNum = 113;BA.debugLine="item.SetIcon(icon, False)";
_item._seticon /*b4j.example.vmlistitem*/ (_icon,__c.False);
 //BA.debugLineNum = 114;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (_text);
 //BA.debugLineNum = 115;BA.debugLine="item.SetInset(True)";
_item._setinset /*b4j.example.vmlistitem*/ (__c.True);
 //BA.debugLineNum = 116;BA.debugLine="item.Pop(pl)";
_item._pop /*String*/ (_pl);
 };
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _back1_click(com.ab.banano.BANanoEvent _e) throws Exception{
boolean _bdrawer = false;
 //BA.debugLineNum = 164;BA.debugLine="Sub back1_click(e As BANanoEvent)";
 //BA.debugLineNum = 165;BA.debugLine="Toggle";
_toggle();
 //BA.debugLineNum = 166;BA.debugLine="Dim bDrawer As Boolean = vue.GetState(\"drawer\",Fa";
_bdrawer = BA.ObjectToBoolean(_vue._getstate /*Object*/ ("drawer",(Object)(__c.False)));
 //BA.debugLineNum = 167;BA.debugLine="bDrawer = Not(bDrawer)";
_bdrawer = __c.Not(_bdrawer);
 //BA.debugLineNum = 168;BA.debugLine="vue.SetStateSingle(\"menushow\", bDrawer)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("menushow",(Object)(_bdrawer));
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Drawer As VMElement";
_drawer = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private bActive As Boolean";
_bactive = false;
 //BA.debugLineNum = 7;BA.debugLine="Private DrawerList As VMList";
_drawerlist = new b4j.example.vmlist();
 //BA.debugLineNum = 8;BA.debugLine="Private items As Map";
_items = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private mshow As String";
_mshow = "";
 //BA.debugLineNum = 10;BA.debugLine="Public ToolBar As VMToolBar";
_toolbar = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 11;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 58;BA.debugLine="vue.SetStateSingle(ID, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_id,(Object)(__c.False));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 17;BA.debugLine="Drawer.Initialize(vue, ID).SetTag(\"md-app-drawer\"";
_drawer._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-app-drawer");
 //BA.debugLineNum = 18;BA.debugLine="bActive = False";
_bactive = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 20;BA.debugLine="SetActiveSync(ID)";
_setactivesync(_id);
 };
 //BA.debugLineNum = 22;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 23;BA.debugLine="DrawerList.Initialize(vue,$\"${ID}list\"$, eventHan";
_drawerlist._initialize /*b4j.example.vmlist*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"list"),_eventhandler);
 //BA.debugLineNum = 24;BA.debugLine="DrawerList.SetExpandSingle(True)";
_drawerlist._setexpandsingle /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 25;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="mshow = \"\"";
_mshow = "";
 //BA.debugLineNum = 27;BA.debugLine="ToolBar.Initialize(vue,$\"${ID}tblbar\"$, eventHand";
_toolbar._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tblbar"),_eventhandler);
 //BA.debugLineNum = 28;BA.debugLine="ToolBar.SetTransparent(True).SetElevation(0)";
_toolbar._settransparent /*b4j.example.vmtoolbar*/ (__c.True)._setelevation /*b4j.example.vmtoolbar*/ ((int) (0));
 //BA.debugLineNum = 29;BA.debugLine="ToolBar.SetTitle(\"\")";
_toolbar._settitle /*b4j.example.vmtoolbar*/ ("");
 //BA.debugLineNum = 30;BA.debugLine="Drawer.RemoveAttr(\"v-show\")";
_drawer._removeattr /*b4j.example.vmelement*/ ("v-show");
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 176;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub Render";
 //BA.debugLineNum = 172;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _setactive(Object _varactive) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetActive(varActive As Object) As VMDrawer";
 //BA.debugLineNum = 181;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
_setattr(__c.createMap(new Object[] {(Object)("md-active"),_varactive}));
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setactivesync(String _v) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="private Sub SetActiveSync(v As String) As VMDrawer";
 //BA.debugLineNum = 138;BA.debugLine="Drawer.SetActiveSync(v)";
_drawer._setactivesync /*b4j.example.vmelement*/ (_v);
 //BA.debugLineNum = 139;BA.debugLine="bActive = True";
_bactive = __c.True;
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetAttr(attr As Map) As VMDrawer";
 //BA.debugLineNum = 133;BA.debugLine="Drawer.SetAttr(attr)";
_drawer._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetElevation(e As Int) As VMDrawer";
 //BA.debugLineNum = 121;BA.debugLine="Drawer.SetElevation(e)";
_drawer._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setfixed(boolean _varfixed) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMDrawer";
 //BA.debugLineNum = 193;BA.debugLine="SetAttr(CreateMap(\":md-fixed\": varFixed))";
_setattr(__c.createMap(new Object[] {(Object)(":md-fixed"),(Object)(_varfixed)}));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpermanent(Object _varpermanent) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetPermanent(varPermanent As Object) As VMDraw";
 //BA.debugLineNum = 205;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": varPermanent))";
_setattr(__c.createMap(new Object[] {(Object)("md-permanent"),_varpermanent}));
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpermanentcard(boolean _b) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetPermanentCard(b As Boolean) As VMDrawer";
 //BA.debugLineNum = 217;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": \"card\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-permanent"),(Object)("card")}));
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpermanentclipped(boolean _b) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetPermanentClipped(b As Boolean) As VMDrawer";
 //BA.debugLineNum = 211;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": \"clipped\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-permanent"),(Object)("clipped")}));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpermanentfull(boolean _b) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetPermanentFull(b As Boolean) As VMDrawer";
 //BA.debugLineNum = 144;BA.debugLine="Drawer.SetPermanentFull(b)";
_drawer._setpermanentfull /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpersistent(Object _varpersistent) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetPersistent(varPersistent As Object) As VMDr";
 //BA.debugLineNum = 223;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": varPersistent)";
_setattr(__c.createMap(new Object[] {(Object)("md-persistent"),_varpersistent}));
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpersistentfull(boolean _b) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetPersistentFull(b As Boolean) As VMDrawer";
 //BA.debugLineNum = 229;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": \"full\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-persistent"),(Object)("full")}));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpersistentmini(boolean _b) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetPersistentMini(b As Boolean) As VMDrawer";
 //BA.debugLineNum = 235;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": \"mini\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-persistent"),(Object)("mini")}));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setright(boolean _varright) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetRight(varRight As Boolean) As VMDrawer";
 //BA.debugLineNum = 199;BA.debugLine="SetAttr(CreateMap(\":md-right\": varRight))";
_setattr(__c.createMap(new Object[] {(Object)(":md-right"),(Object)(_varright)}));
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setswipeable(boolean _varswipeable) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetSwipeable(varSwipeable As Boolean) As VMDra";
 //BA.debugLineNum = 187;BA.debugLine="SetAttr(CreateMap(\":md-swipeable\": varSwipeable))";
_setattr(__c.createMap(new Object[] {(Object)(":md-swipeable"),(Object)(_varswipeable)}));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setswiperestraint(Object _varswipe) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetSwipeRestraint(varSwipe As Object) As VMDra";
 //BA.debugLineNum = 247;BA.debugLine="SetAttr(CreateMap(\"md-swipe-restraint\": varSwipe)";
_setattr(__c.createMap(new Object[] {(Object)("md-swipe-restraint"),_varswipe}));
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setswipethreshold(Object _varswipe) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetSwipeThreshold(varSwipe As Object) As VMDra";
 //BA.debugLineNum = 241;BA.debugLine="SetAttr(CreateMap(\"md-swipe-threshold\": varSwipe)";
_setattr(__c.createMap(new Object[] {(Object)("md-swipe-threshold"),_varswipe}));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setswipetime(Object _varswipe) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetSwipeTime(varSwipe As Object) As VMDrawer";
 //BA.debugLineNum = 253;BA.debugLine="SetAttr(CreateMap(\"md-swipe-time\": varSwipe))";
_setattr(__c.createMap(new Object[] {(Object)("md-swipe-time"),_varswipe}));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _settitle(String _newtitle) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetTitle(newTitle As String) As VMDrawer";
 //BA.debugLineNum = 35;BA.debugLine="vue.SetState(CreateMap(\"drawertblbartitle\":newTit";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("drawertblbartitle"),(Object)(_newtitle)}));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setvif(String _vshow) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetVIf(vshow As String) As VMDrawer";
 //BA.debugLineNum = 69;BA.debugLine="Drawer.SetVif(vshow)";
_drawer._setvif /*b4j.example.vmelement*/ (_vshow);
 //BA.debugLineNum = 70;BA.debugLine="mshow = vshow";
_mshow = _vshow;
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setvshow(String _vshow) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetVShow(vshow As String) As VMDrawer";
 //BA.debugLineNum = 63;BA.debugLine="Drawer.SetVShow(vshow)";
_drawer._setvshow /*b4j.example.vmelement*/ (_vshow);
 //BA.debugLineNum = 64;BA.debugLine="mshow = vshow";
_mshow = _vshow;
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public String  _setwidth(String _width) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetWidth(width As String)";
 //BA.debugLineNum = 76;BA.debugLine="vue.SetStyle(\".md-drawer\", \"width\", width)";
_vue._setstyle /*b4j.example.bananovue*/ (".md-drawer","width",_width);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Show";
 //BA.debugLineNum = 52;BA.debugLine="vue.SetStateSingle(ID,True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_id,(Object)(__c.True));
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _toggle() throws Exception{
boolean _bstate = false;
 //BA.debugLineNum = 44;BA.debugLine="Sub Toggle";
 //BA.debugLineNum = 45;BA.debugLine="vue.ToggleState(ID)";
_vue._togglestate /*b4j.example.bananovue*/ (_id);
 //BA.debugLineNum = 46;BA.debugLine="Dim bstate As Boolean = vue.GetState(ID,True)";
_bstate = BA.ObjectToBoolean(_vue._getstate /*Object*/ (_id,(Object)(__c.True)));
 //BA.debugLineNum = 47;BA.debugLine="vue.SetStateSingle(\"back1show\", bstate)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("back1show",(Object)(_bstate));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
b4j.example.vmlistitem _item = null;
b4j.example.vmlist _cl = null;
 //BA.debugLineNum = 148;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 149;BA.debugLine="ToolBar.CreateButton(\"back1\").SetOnClick(Me).SetD";
_toolbar._createbutton /*b4j.example.vmbutton*/ ("back1")._setonclick /*b4j.example.vmbutton*/ (this)._setdense /*b4j.example.vmbutton*/ (__c.True)._seticon /*b4j.example.vmbutton*/ ("keyboard_arrow_left")._seticonbutton /*b4j.example.vmbutton*/ (__c.True)._pop /*String*/ (_toolbar._endsection /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 150;BA.debugLine="ToolBar.Pop(Drawer)";
_toolbar._pop /*String*/ (_drawer);
 //BA.debugLineNum = 152;BA.debugLine="For Each item As VMListItem In items.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _items.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_item = (b4j.example.vmlistitem)(group3.Get(index3));
 //BA.debugLineNum = 153;BA.debugLine="Dim cl As VMList = item.childList";
_cl = _item._childlist /*b4j.example.vmlist*/ ;
 //BA.debugLineNum = 154;BA.debugLine="If cl.HasContent Then item.SetList(cl)";
if (_cl._hascontent /*boolean*/ ) { 
_item._setlist /*b4j.example.vmlistitem*/ (_cl);};
 //BA.debugLineNum = 155;BA.debugLine="item.Pop(DrawerList)";
_item._pop /*String*/ (_drawerlist);
 }
};
 //BA.debugLineNum = 157;BA.debugLine="If DrawerList.HasContent Then DrawerList.Pop(Draw";
if (_drawerlist._hascontent /*boolean*/ ) { 
_drawerlist._pop /*String*/ (_drawer);};
 //BA.debugLineNum = 158;BA.debugLine="If bActive = False Then";
if (_bactive==__c.False) { 
 //BA.debugLineNum = 159;BA.debugLine="Log($\"VMDrawer.SetActiveSync: '${ID}' has not be";
__c.Log(("VMDrawer.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(_id))+"' has not been activated!"));
 };
 //BA.debugLineNum = 161;BA.debugLine="Return Drawer.tostring";
if (true) return _drawer._tostring /*String*/ ();
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _updatetitle(String _newtitle) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub UpdateTitle(newTitle As String) As VMDrawer";
 //BA.debugLineNum = 40;BA.debugLine="vue.SetState(CreateMap(\"drawertblbartitle\":newTit";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("drawertblbartitle"),(Object)(_newtitle)}));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
