package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _table = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmtoolbar _toolbar = null;
public Object _module = null;
public b4j.example.vmtr _tblrow = null;
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
public b4j.example.vmtable  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 129;BA.debugLine="Sub AddChild(child As VMElement) As VMTable";
 //BA.debugLineNum = 130;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 131;BA.debugLine="Table.SetText(childHTML)";
_table._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 175;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 176;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 177;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtable  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub AddClass(c As String) As VMTable";
 //BA.debugLineNum = 158;BA.debugLine="Table.AddClass(c)";
_table._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public String  _addcolumn(String _colid,String _collabel,boolean _colnumeric,boolean _colvisible) throws Exception{
b4j.example.vmtd _tc = null;
 //BA.debugLineNum = 55;BA.debugLine="Sub AddColumn(colID As String, colLabel As String,";
 //BA.debugLineNum = 56;BA.debugLine="Dim tc As VMTD";
_tc = new b4j.example.vmtd();
 //BA.debugLineNum = 57;BA.debugLine="tc.Initialize(vue, colID).SetLabel(colLabel).SetS";
_tc._initialize /*b4j.example.vmtd*/ (ba,_vue,_colid)._setlabel /*b4j.example.vmtd*/ (_collabel)._setsortby /*b4j.example.vmtd*/ (_colid)._setnumeric /*b4j.example.vmtd*/ (_colnumeric)._settext /*b4j.example.vmtd*/ ((Object)(("{{ item."+__c.SmartStringFormatter("",(Object)(_colid))+" }}")));
 //BA.debugLineNum = 58;BA.debugLine="tc.SetVShow(colVisible)";
_tc._setvshow /*b4j.example.vmtd*/ (_colvisible);
 //BA.debugLineNum = 59;BA.debugLine="tc.Pop(tblRow.TR)";
_tc._pop /*String*/ (_tblrow._tr /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 189;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Table As VMElement";
_table = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Public ToolBar As VMToolBar";
_toolbar = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private tblRow As VMTR";
_tblrow = new b4j.example.vmtr();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtable  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
String _pp = "";
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="Table.Initialize(v, ID)";
_table._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="Table.SetTag(\"md-table\")";
_table._settag /*b4j.example.vmelement*/ ("md-table");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="SetOnSelected";
_setonselected();
 //BA.debugLineNum = 21;BA.debugLine="ToolBar.Initialize(vue, $\"${ID}table\"$, eventHand";
_toolbar._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"table"),_eventhandler)._settabletoolbar /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 22;BA.debugLine="tblRow.Initialize(vue, $\"${ID}row\"$, ID)";
_tblrow._initialize /*b4j.example.vmtr*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"row"),_id);
 //BA.debugLineNum = 23;BA.debugLine="Table.RemoveAttr(\":required\")";
_table._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 24;BA.debugLine="Table.RemoveAttr(\":disabled\")";
_table._removeattr /*b4j.example.vmelement*/ (":disabled");
 //BA.debugLineNum = 25;BA.debugLine="Table.RemoveAttr(\"id\")";
_table._removeattr /*b4j.example.vmelement*/ ("id");
 //BA.debugLineNum = 26;BA.debugLine="Table.RemoveAttr(\"ref\")";
_table._removeattr /*b4j.example.vmelement*/ ("ref");
 //BA.debugLineNum = 27;BA.debugLine="Dim pp As String = $\"${ID}selection\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"selection");
 //BA.debugLineNum = 28;BA.debugLine="vue.SetStateSingle(pp, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,__c.Null);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 153;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub Render";
 //BA.debugLineNum = 125;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtable  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetAccent(b As Boolean) As VMTable";
 //BA.debugLineNum = 147;BA.debugLine="If b Then Table.SetAccent(True)";
if (_b) { 
_table._setaccent /*b4j.example.vmelement*/ (__c.True);};
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetAttr(attr As Map) As VMTable";
 //BA.debugLineNum = 164;BA.debugLine="Table.SetAttr(attr)";
_table._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setautoselect(boolean _b) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetAutoSelect(b As Boolean) As VMTable";
 //BA.debugLineNum = 45;BA.debugLine="tblRow.SetAutoSelect(b)";
_tblrow._setautoselect /*b4j.example.vmtr*/ (_b);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setcard(boolean _b) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetCard(b As Boolean) As VMTable";
 //BA.debugLineNum = 84;BA.debugLine="If b Then SetAttr(CreateMap(\"md-card\": True))";
if (_b) { 
_setattr(__c.createMap(new Object[] {(Object)("md-card"),(Object)(__c.True)}));};
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetElevation(e As Int) As VMTable";
 //BA.debugLineNum = 51;BA.debugLine="Table.SetElevation(e)";
_table._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setfixedheaders(boolean _b) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetFixedHeaders(b As Boolean) As VMTable";
 //BA.debugLineNum = 74;BA.debugLine="If b Then SetAttr(CreateMap(\"md-fixed-header\":\"tr";
if (_b) { 
_setattr(__c.createMap(new Object[] {(Object)("md-fixed-header"),(Object)("true")}));};
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setonselected() throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 108;BA.debugLine="private Sub SetOnSelected As VMTable";
 //BA.debugLineNum = 109;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 110;BA.debugLine="Dim methodName As String = $\"${ID}_select\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_select");
 //BA.debugLineNum = 111;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_items.getObject())}))));
 //BA.debugLineNum = 112;BA.debugLine="SetAttr(CreateMap(\"@md-selected\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@md-selected"),(Object)(_methodname)}));
 //BA.debugLineNum = 114;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetPadding(p As Object) As VMTable";
 //BA.debugLineNum = 183;BA.debugLine="Table.SetPaddingAll(p)";
_table._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTable";
 //BA.debugLineNum = 142;BA.debugLine="If b Then Table.SetPrimary(True)";
if (_b) { 
_table._setprimary /*b4j.example.vmelement*/ (__c.True);};
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setselectablemultiple(boolean _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetSelectableMultiple(b As Boolean) As VMTable";
 //BA.debugLineNum = 40;BA.debugLine="tblRow.SetSelectableMultiple(b)";
_tblrow._setselectablemultiple /*b4j.example.vmtr*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setselectablesingle(boolean _b) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetSelectableSingle(b As Boolean) As VMTable";
 //BA.debugLineNum = 34;BA.debugLine="tblRow.SetSelectableSingle(b)";
_tblrow._setselectablesingle /*b4j.example.vmtr*/ (_b);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setsort(String _columnname) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetSort(columnName As String) As VMTable";
 //BA.debugLineNum = 79;BA.debugLine="SetAttr(CreateMap(\"md-sort\":columnName))";
_setattr(__c.createMap(new Object[] {(Object)("md-sort"),(Object)(_columnname)}));
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setsortorderasc(boolean _b) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetSortOrderAsc(b As Boolean) As VMTable";
 //BA.debugLineNum = 99;BA.debugLine="If b Then SetAttr(CreateMap(\"md-sort-order\":\"asc\"";
if (_b) { 
_setattr(__c.createMap(new Object[] {(Object)("md-sort-order"),(Object)("asc")}));};
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setsortorderdesc(boolean _b) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetSortOrderDesc(b As Boolean) As VMTable";
 //BA.debugLineNum = 104;BA.debugLine="If b Then SetAttr(CreateMap(\"md-sort-order\":\"desc";
if (_b) { 
_setattr(__c.createMap(new Object[] {(Object)("md-sort-order"),(Object)("desc")}));};
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetStyle(sm As Map) As VMTable";
 //BA.debugLineNum = 170;BA.debugLine="Table.SetStyle(sm)";
_table._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetText(t As Object) As VMTable";
 //BA.debugLineNum = 137;BA.debugLine="Table.SetText(t)";
_table._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetVIf(vif As Object) As VMTable";
 //BA.debugLineNum = 94;BA.debugLine="Table.SetVIf(vif)";
_table._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetVModel(k As String) As VMTable";
 //BA.debugLineNum = 89;BA.debugLine="Table.SetVModel(k)";
_table._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetVShow(vif As Object) As VMTable";
 //BA.debugLineNum = 119;BA.debugLine="Table.SetVShow(vif)";
_table._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 64;BA.debugLine="If ToolBar.HasContent Then";
if (_toolbar._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 65;BA.debugLine="ToolBar.Pop(Table)";
_toolbar._pop /*String*/ (_table);
 };
 //BA.debugLineNum = 67;BA.debugLine="If tblRow.hascontent Then";
if (_tblrow._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 68;BA.debugLine="tblRow.Pop(Table)";
_tblrow._pop /*String*/ (_table);
 };
 //BA.debugLineNum = 70;BA.debugLine="Return Table.ToString";
if (true) return _table._tostring /*String*/ ();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
