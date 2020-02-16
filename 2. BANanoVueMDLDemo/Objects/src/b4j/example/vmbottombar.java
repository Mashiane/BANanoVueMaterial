package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbottombar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbottombar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbottombar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _bottombar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
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
public b4j.example.vmbottombar  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 78;BA.debugLine="Sub AddChild(child As VMElement) As VMBottomBar";
 //BA.debugLineNum = 79;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 80;BA.debugLine="BottomBar.SetText(childHTML)";
_bottombar._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 124;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 125;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 126;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub AddClass(c As String) As VMBottomBar";
 //BA.debugLineNum = 107;BA.debugLine="BottomBar.AddClass(c)";
_bottombar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public String  _additem(String _iid,String _ilabel,String _iicon,String _badge) throws Exception{
b4j.example.vmbottombaritem _item = null;
 //BA.debugLineNum = 28;BA.debugLine="Sub AddItem(iID As String, iLabel As String, iIcon";
 //BA.debugLineNum = 29;BA.debugLine="Dim item As VMBottomBarItem";
_item = new b4j.example.vmbottombaritem();
 //BA.debugLineNum = 30;BA.debugLine="item.Initialize(vue, iID, module)";
_item._initialize /*b4j.example.vmbottombaritem*/ (ba,_vue,_iid,_module);
 //BA.debugLineNum = 31;BA.debugLine="If badge = \"\" Then";
if ((_badge).equals("")) { 
 //BA.debugLineNum = 32;BA.debugLine="item.SetLabel(iLabel)";
_item._setlabel /*b4j.example.vmbottombaritem*/ (_ilabel);
 //BA.debugLineNum = 33;BA.debugLine="item.SetIcon(iIcon)";
_item._seticon /*b4j.example.vmbottombaritem*/ ((Object)(_iicon));
 }else {
 //BA.debugLineNum = 35;BA.debugLine="item.SetIcon1(iIcon)";
_item._seticon1 /*b4j.example.vmbottombaritem*/ (_iicon);
 //BA.debugLineNum = 36;BA.debugLine="item.SetLabel1(iLabel)";
_item._setlabel1 /*b4j.example.vmbottombaritem*/ (_ilabel);
 //BA.debugLineNum = 37;BA.debugLine="item.SetBadge(badge)";
_item._setbadge /*b4j.example.vmbottombaritem*/ (_badge);
 };
 //BA.debugLineNum = 39;BA.debugLine="item.Pop(BottomBar)";
_item._pop /*String*/ (_bottombar);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 172;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BottomBar As VMElement";
_bottombar = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombaritem  _createitem(String _sid) throws Exception{
b4j.example.vmbottombaritem _el = null;
 //BA.debugLineNum = 22;BA.debugLine="Sub CreateItem(sid As String) As VMBottomBarItem";
 //BA.debugLineNum = 23;BA.debugLine="Dim el As VMBottomBarItem";
_el = new b4j.example.vmbottombaritem();
 //BA.debugLineNum = 24;BA.debugLine="el.Initialize(vue, sid, module)";
_el._initialize /*b4j.example.vmbottombaritem*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 25;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
String _sval = "";
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="BottomBar.Initialize(v, ID)";
_bottombar._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 14;BA.debugLine="BottomBar.SetTag(\"md-bottom-bar\")";
_bottombar._settag /*b4j.example.vmelement*/ ("md-bottom-bar");
 //BA.debugLineNum = 15;BA.debugLine="module = EventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 16;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 17;BA.debugLine="Dim sval As String";
_sval = "";
 //BA.debugLineNum = 18;BA.debugLine="SetOnChanged(sval)";
_setonchanged(_sval);
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 102;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub Render";
 //BA.debugLineNum = 74;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombar  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetAccent(b As Boolean) As VMBottomBar";
 //BA.debugLineNum = 96;BA.debugLine="BottomBar.SetAccent(True)";
_bottombar._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setactiveitem(Object _varactiveitem) throws Exception{
String _pp = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetActiveItem(varActiveItem As Object) As VMBo";
 //BA.debugLineNum = 158;BA.debugLine="Dim pp As String = $\"${ID}activeitem\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"activeitem");
 //BA.debugLineNum = 159;BA.debugLine="vue.SetStateSingle(pp, varActiveItem)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varactiveitem);
 //BA.debugLineNum = 160;BA.debugLine="SetAttr(CreateMap(\":md-active-item\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-active-item"),(Object)(_pp)}));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetAttr(attr As Map) As VMBottomBar";
 //BA.debugLineNum = 113;BA.debugLine="BottomBar.SetAttr(attr)";
_bottombar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setonchanged(String _activeitem) throws Exception{
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 42;BA.debugLine="private Sub SetOnChanged(activeItem As String) As";
 //BA.debugLineNum = 43;BA.debugLine="Dim MethodName As String = $\"${ID}_changed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_changed");
 //BA.debugLineNum = 44;BA.debugLine="If SubExists(module, MethodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmbottombar)(this);};
 //BA.debugLineNum = 45;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_activeitem)}))));
 //BA.debugLineNum = 46;BA.debugLine="SetAttr(CreateMap(\"@md-changed\": MethodName))";
_setattr(__c.createMap(new Object[] {(Object)("@md-changed"),(Object)(_methodname)}));
 //BA.debugLineNum = 48;BA.debugLine="vue.SetCallBack(MethodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetPadding(p As Object) As VMBottomBar";
 //BA.debugLineNum = 132;BA.debugLine="BottomBar.SetPaddingAll(p)";
_bottombar._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBottomBar";
 //BA.debugLineNum = 91;BA.debugLine="BottomBar.SetPrimary(True)";
_bottombar._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetStyle(sm As Map) As VMBottomBar";
 //BA.debugLineNum = 119;BA.debugLine="BottomBar.SetStyle(sm)";
_bottombar._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setsyncroute(boolean _varsyncroute) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMBot";
 //BA.debugLineNum = 166;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
_setattr(__c.createMap(new Object[] {(Object)(":md-sync-route"),(Object)(_varsyncroute)}));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetText(t As Object) As VMBottomBar";
 //BA.debugLineNum = 86;BA.debugLine="BottomBar.SetText(t)";
_bottombar._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _settype(Object _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 137;BA.debugLine="Sub SetType(varType As Object) As VMBottomBar";
 //BA.debugLineNum = 138;BA.debugLine="Dim pp As String = $\"${ID}type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"type");
 //BA.debugLineNum = 139;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartype);
 //BA.debugLineNum = 140;BA.debugLine="SetAttr(CreateMap(\":md-type\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-type"),(Object)(_pp)}));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _settypefixed(boolean _b) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetTypeFixed(b As Boolean) As VMBottomBar    '";
 //BA.debugLineNum = 146;BA.debugLine="SetType(\"fixed\")";
_settype((Object)("fixed"));
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _settypeshift(boolean _b) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetTypeShift(b As Boolean) As VMBottomBar    '";
 //BA.debugLineNum = 152;BA.debugLine="SetType(\"shift\")";
_settype((Object)("shift"));
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetVIf(vif As Object) As VMBottomBar";
 //BA.debugLineNum = 63;BA.debugLine="BottomBar.SetVIf(vif)";
_bottombar._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetVModel(k As String) As VMBottomBar";
 //BA.debugLineNum = 58;BA.debugLine="BottomBar.SetVModel(k)";
_bottombar._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetVShow(vif As Object) As VMBottomBar";
 //BA.debugLineNum = 68;BA.debugLine="BottomBar.SetVShow(vif)";
_bottombar._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 54;BA.debugLine="Return BottomBar.ToString";
if (true) return _bottombar._tostring /*String*/ ();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
