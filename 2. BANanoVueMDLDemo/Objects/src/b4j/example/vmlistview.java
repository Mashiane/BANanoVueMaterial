package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlistview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmlist _listview = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hascontent = false;
public Object _eventhandler = null;
public anywheresoftware.b4a.objects.collections.Map _items = null;
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
public String  _addavatar(String _key,String _imgurl,String _text,Object _badge) throws Exception{
b4j.example.vmlistitem _item = null;
 //BA.debugLineNum = 28;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, tex";
 //BA.debugLineNum = 29;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
 //BA.debugLineNum = 30;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
 //BA.debugLineNum = 31;BA.debugLine="item.Initialize(vue, key,eventHandler)";
_item._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_eventhandler);
 //BA.debugLineNum = 32;BA.debugLine="item.SetAvatar(imgURL)";
_item._setavatar /*b4j.example.vmlistitem*/ (_imgurl);
 //BA.debugLineNum = 33;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (_text);
 //BA.debugLineNum = 34;BA.debugLine="If badge <> Null Then item.SetBadge(badge,True,\"t";
if (_badge!= null) { 
_item._setbadge /*b4j.example.vmlistitem*/ ((int)(BA.ObjectToNumber(_badge)),__c.True,"top",__c.True,__c.False);};
 //BA.debugLineNum = 35;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistview  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub AddClass(c As String) As VMListView";
 //BA.debugLineNum = 116;BA.debugLine="ListView.AddClass(c)";
_listview._addclass /*b4j.example.vmlist*/ (_c);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public String  _additem(String _key,String _icon,String _text,Object _badge) throws Exception{
b4j.example.vmlistitem _item = null;
 //BA.debugLineNum = 50;BA.debugLine="Sub AddItem(key As String, icon As String, text As";
 //BA.debugLineNum = 51;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
 //BA.debugLineNum = 52;BA.debugLine="item.Initialize(vue, key,eventHandler)";
_item._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_eventhandler);
 //BA.debugLineNum = 53;BA.debugLine="item.SetIcon(icon, False)";
_item._seticon /*b4j.example.vmlistitem*/ (_icon,__c.False);
 //BA.debugLineNum = 54;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (_text);
 //BA.debugLineNum = 55;BA.debugLine="If badge <> Null Then item.SetBadge(badge,True,\"t";
if (_badge!= null) { 
_item._setbadge /*b4j.example.vmlistitem*/ ((int)(BA.ObjectToNumber(_badge)),__c.True,"top",__c.True,__c.False);};
 //BA.debugLineNum = 56;BA.debugLine="items.Put(key, item)";
_items.Put((Object)(_key),(Object)(_item));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _addsubavatar(String _parent,String _key,String _imgurl,String _text) throws Exception{
b4j.example.vmlistitem _li = null;
b4j.example.vmlist _pl = null;
b4j.example.vmlistitem _item = null;
 //BA.debugLineNum = 38;BA.debugLine="Sub AddSubAvatar(parent As String, key As String,";
 //BA.debugLineNum = 39;BA.debugLine="If items.ContainsKey(parent) Then";
if (_items.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 40;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
_li = (b4j.example.vmlistitem)(_items.Get((Object)(_parent)));
 //BA.debugLineNum = 41;BA.debugLine="Dim pl As VMList = li.childList";
_pl = _li._childlist /*b4j.example.vmlist*/ ;
 //BA.debugLineNum = 42;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
 //BA.debugLineNum = 43;BA.debugLine="item.Initialize(vue, key,eventHandler)";
_item._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_eventhandler);
 //BA.debugLineNum = 44;BA.debugLine="item.SetAvatar(imgURL)";
_item._setavatar /*b4j.example.vmlistitem*/ (_imgurl);
 //BA.debugLineNum = 45;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (_text);
 //BA.debugLineNum = 46;BA.debugLine="item.Pop(pl)";
_item._pop /*String*/ (_pl);
 };
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _addsubitem(String _parent,String _key,String _icon,String _text) throws Exception{
b4j.example.vmlistitem _li = null;
b4j.example.vmlist _pl = null;
b4j.example.vmlistitem _item = null;
 //BA.debugLineNum = 59;BA.debugLine="Sub AddSubItem(parent As String, key As String, ic";
 //BA.debugLineNum = 60;BA.debugLine="If items.ContainsKey(parent) Then";
if (_items.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 61;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
_li = (b4j.example.vmlistitem)(_items.Get((Object)(_parent)));
 //BA.debugLineNum = 62;BA.debugLine="Dim pl As VMList = li.childList";
_pl = _li._childlist /*b4j.example.vmlist*/ ;
 //BA.debugLineNum = 63;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
 //BA.debugLineNum = 64;BA.debugLine="item.Initialize(vue, key, eventHandler)";
_item._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_key,_eventhandler);
 //BA.debugLineNum = 65;BA.debugLine="item.SetIcon(icon, False)";
_item._seticon /*b4j.example.vmlistitem*/ (_icon,__c.False);
 //BA.debugLineNum = 66;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (_text);
 //BA.debugLineNum = 67;BA.debugLine="item.SetInset(True)";
_item._setinset /*b4j.example.vmlistitem*/ (__c.True);
 //BA.debugLineNum = 68;BA.debugLine="item.Pop(pl)";
_item._pop /*String*/ (_pl);
 };
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 151;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ListView As VMList";
_listview = new b4j.example.vmlist();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 7;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private items As Map";
_items = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistview  _expanditem(String _sid,boolean _b) throws Exception{
String _syncid = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VML";
 //BA.debugLineNum = 74;BA.debugLine="Dim syncid As String = $\"${ID}sync\"$";
_syncid = (""+__c.SmartStringFormatter("",(Object)(_id))+"sync");
 //BA.debugLineNum = 75;BA.debugLine="vue.SetStateSingle(syncid, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_syncid,(Object)(_b));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _module) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 14;BA.debugLine="ListView.Initialize(vue, ID,module)";
_listview._initialize /*b4j.example.vmlist*/ (ba,_vue,_id,_module);
 //BA.debugLineNum = 15;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 146;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub Render";
 //BA.debugLineNum = 142;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistview  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetAttr(attr As Map) As VMListView";
 //BA.debugLineNum = 122;BA.debugLine="ListView.SetAttr(attr)";
_listview._setattr /*b4j.example.vmlist*/ (_attr);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setborder(boolean _b) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetBorder(b As Boolean) As VMListView";
 //BA.debugLineNum = 105;BA.debugLine="If b Then SetStyle(CreateMap(\"border\": \"1px solid";
if (_b) { 
_setstyle(__c.createMap(new Object[] {(Object)("border"),(Object)("1px solid rgba(#000, .12)")}));};
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setdense(boolean _b) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetDense(b As Boolean) As VMListView";
 //BA.debugLineNum = 90;BA.debugLine="If b Then AddClass(\"md-dense\")";
if (_b) { 
_addclass("md-dense");};
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetDisabled(b As Boolean) As VMListView";
 //BA.debugLineNum = 23;BA.debugLine="ListView.SetDisabled(b)";
_listview._setdisabled /*b4j.example.vmlist*/ (_b);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetElevation(e As Int) As VMListView";
 //BA.debugLineNum = 110;BA.debugLine="ListView.SetElevation(e)";
_listview._setelevation /*b4j.example.vmlist*/ (_e);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetStyle(m As Map) As VMListView";
 //BA.debugLineNum = 100;BA.debugLine="ListView.SetStyle(m)";
_listview._setstyle /*b4j.example.vmlist*/ (_m);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetTabIndex(ti As String) As VMListView";
 //BA.debugLineNum = 80;BA.debugLine="ListView.SetTabIndex(ti)";
_listview._settabindex /*b4j.example.vmlist*/ (_ti);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _settext(String _t) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetText(t As String) As VMListView";
 //BA.debugLineNum = 127;BA.debugLine="ListView.SetText(t)";
_listview._settext /*b4j.example.vmlist*/ (_t);
 //BA.debugLineNum = 128;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetVIf(vif As Object) As VMListView";
 //BA.debugLineNum = 95;BA.debugLine="ListView.SetVIf(vif)";
_listview._setvif /*b4j.example.vmlist*/ (_vif);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetVShow(vif As Object) As VMListView";
 //BA.debugLineNum = 85;BA.debugLine="ListView.SetVShow(vif)";
_listview._setvshow /*b4j.example.vmlist*/ (_vif);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
b4j.example.vmlistitem _item = null;
b4j.example.vmlist _cl = null;
 //BA.debugLineNum = 132;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 133;BA.debugLine="For Each item As VMListItem In items.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items.Values();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = (b4j.example.vmlistitem)(group1.Get(index1));
 //BA.debugLineNum = 134;BA.debugLine="Dim cl As VMList = item.childList";
_cl = _item._childlist /*b4j.example.vmlist*/ ;
 //BA.debugLineNum = 135;BA.debugLine="If cl.HasContent Then item.SetList(cl)";
if (_cl._hascontent /*boolean*/ ) { 
_item._setlist /*b4j.example.vmlistitem*/ (_cl);};
 //BA.debugLineNum = 136;BA.debugLine="item.Pop(ListView)";
_item._pop /*String*/ (_listview);
 }
};
 //BA.debugLineNum = 138;BA.debugLine="Return ListView.tostring";
if (true) return _listview._tostring /*String*/ ();
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
