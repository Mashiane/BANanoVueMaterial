package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtabs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtabs", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtabs.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tabs = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _atkey = "";
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
public b4j.example.vmtabs  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 106;BA.debugLine="Sub AddChild(child As VMElement) As VMTabs";
 //BA.debugLineNum = 107;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 108;BA.debugLine="Tabs.SetText(childHTML)";
_tabs._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 152;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 153;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 154;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub AddClass(c As String) As VMTabs";
 //BA.debugLineNum = 135;BA.debugLine="Tabs.AddClass(c)";
_tabs._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public String  _addtab(String _tabid,String _tablabel,String _tabicon,String _tabcontent) throws Exception{
b4j.example.vmtabsitem _ti = null;
 //BA.debugLineNum = 67;BA.debugLine="Sub AddTab(tabID As String, tabLabel As String, ta";
 //BA.debugLineNum = 68;BA.debugLine="tabID = tabID.tolowercase";
_tabid = _tabid.toLowerCase();
 //BA.debugLineNum = 69;BA.debugLine="Dim ti As VMTabsItem";
_ti = new b4j.example.vmtabsitem();
 //BA.debugLineNum = 70;BA.debugLine="ti.Initialize(vue,tabID,module)";
_ti._initialize /*b4j.example.vmtabsitem*/ (ba,_vue,_tabid,_module);
 //BA.debugLineNum = 71;BA.debugLine="ti.SetLabel(tabLabel)";
_ti._setlabel /*b4j.example.vmtabsitem*/ (_tablabel);
 //BA.debugLineNum = 72;BA.debugLine="ti.SetIcon(tabIcon)";
_ti._seticon /*b4j.example.vmtabsitem*/ (_tabicon);
 //BA.debugLineNum = 74;BA.debugLine="If tabContent <> Null Then";
if (_tabcontent!= null) { 
 //BA.debugLineNum = 75;BA.debugLine="ti.SetText(tabContent)";
_ti._settext /*b4j.example.vmtabsitem*/ (_tabcontent);
 };
 //BA.debugLineNum = 77;BA.debugLine="ti.Pop(Tabs)";
_ti._pop /*String*/ (_tabs);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 277;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Tabs As VMElement";
_tabs = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private atKey As String = $\"${ID}active\"$";
_atkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"active");
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _hidetab(String _stepid) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 52;BA.debugLine="Sub HideTab(stepID As String) As VMTabs";
 //BA.debugLineNum = 53;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 54;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"show");
 //BA.debugLineNum = 55;BA.debugLine="vue.SetStateSingle(stepShow, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(__c.False));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Tabs.Initialize(v, ID)";
_tabs._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="Tabs.SetTag(\"md-tabs\")";
_tabs._settag /*b4j.example.vmelement*/ ("md-tabs");
 //BA.debugLineNum = 16;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="SetOnChanged";
_setonchanged();
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 130;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Render";
 //BA.debugLineNum = 102;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetAccent(b As Boolean) As VMTabs";
 //BA.debugLineNum = 124;BA.debugLine="Tabs.SetAccent(True)";
_tabs._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignment(String _varalignment) throws Exception{
String _pp = "";
 //BA.debugLineNum = 194;BA.debugLine="Sub SetAlignment(varAlignment As String) As VMTabs";
 //BA.debugLineNum = 195;BA.debugLine="Dim pp As String = $\"${ID}alignment\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"alignment");
 //BA.debugLineNum = 196;BA.debugLine="vue.SetStateSingle(pp, varAlignment)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varalignment));
 //BA.debugLineNum = 197;BA.debugLine="SetAttr(CreateMap(\":md-alignment\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-alignment"),(Object)(_pp)}));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignmentcenter(boolean _b) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetAlignmentCenter(b As Boolean) As VMTabs";
 //BA.debugLineNum = 209;BA.debugLine="SetAlignment(\"centered\")";
_setalignment("centered");
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignmentfixed(boolean _b) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetAlignmentFixed(b As Boolean) As VMTabs    '";
 //BA.debugLineNum = 221;BA.debugLine="SetAlignment(\"fixed\")";
_setalignment("fixed");
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignmentleft(boolean _b) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetAlignmentLeft(b As Boolean) As VMTabs    'i";
 //BA.debugLineNum = 203;BA.debugLine="SetAlignment(\"left\")";
_setalignment("left");
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignmentright(boolean _b) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetAlignmentRight(b As Boolean) As VMTabs    '";
 //BA.debugLineNum = 215;BA.debugLine="SetAlignment(\"right\")";
_setalignment("right");
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetAttr(attr As Map) As VMTabs";
 //BA.debugLineNum = 141;BA.debugLine="Tabs.SetAttr(attr)";
_tabs._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTabs";
 //BA.debugLineNum = 24;BA.debugLine="Tabs.SetDisabled(b)";
_tabs._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdynamicheight(boolean _vardynamicheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 226;BA.debugLine="Sub SetDynamicHeight(varDynamicHeight As Boolean)";
 //BA.debugLineNum = 227;BA.debugLine="Dim pp As String = $\"${ID}dynamicheight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"dynamicheight");
 //BA.debugLineNum = 228;BA.debugLine="vue.SetStateSingle(pp, varDynamicHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardynamicheight));
 //BA.debugLineNum = 229;BA.debugLine="SetAttr(CreateMap(\":md-dynamic-height\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-dynamic-height"),(Object)(_pp)}));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setelevation(int _varelevation) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub SetElevation(varElevation As Int) As VMTabs";
 //BA.debugLineNum = 241;BA.debugLine="Tabs.SetElevation(varElevation)";
_tabs._setelevation /*b4j.example.vmelement*/ (_varelevation);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setmargin(Object _p) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetMargin(p As Object) As VMTabs";
 //BA.debugLineNum = 235;BA.debugLine="Tabs.SetMarginAll(p)";
_tabs._setmarginall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setonchanged() throws Exception{
String _tabid = "";
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 264;BA.debugLine="private Sub SetOnChanged As VMTabs";
 //BA.debugLineNum = 265;BA.debugLine="Dim tabID As String";
_tabid = "";
 //BA.debugLineNum = 266;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 267;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 268;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_tabid)}))));
 //BA.debugLineNum = 269;BA.debugLine="SetAttr(CreateMap(\"v-on:md-changed\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-changed"),(Object)(_methodname)}));
 //BA.debugLineNum = 271;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetPadding(p As Object) As VMTabs";
 //BA.debugLineNum = 160;BA.debugLine="Tabs.SetPaddingAll(p)";
_tabs._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTabs";
 //BA.debugLineNum = 119;BA.debugLine="Tabs.SetPrimary(True)";
_tabs._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetStyle(sm As Map) As VMTabs";
 //BA.debugLineNum = 147;BA.debugLine="Tabs.SetStyle(sm)";
_tabs._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setswipeable(boolean _varswipeable) throws Exception{
String _pp = "";
 //BA.debugLineNum = 180;BA.debugLine="Sub SetSwipeable(varSwipeable As Boolean) As VMTab";
 //BA.debugLineNum = 181;BA.debugLine="Dim pp As String = $\"${ID}swipeable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"swipeable");
 //BA.debugLineNum = 182;BA.debugLine="vue.SetStateSingle(pp, varSwipeable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varswipeable));
 //BA.debugLineNum = 183;BA.debugLine="SetAttr(CreateMap(\":md-swipeable\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-swipeable"),(Object)(_pp)}));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setswiperestraint(Object _varswiperestraint) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetSwipeRestraint(varSwipeRestraint As Object)";
 //BA.debugLineNum = 253;BA.debugLine="SetAttr(CreateMap(\"md-swipe-restraint\": varSwipeR";
_setattr(__c.createMap(new Object[] {(Object)("md-swipe-restraint"),_varswiperestraint}));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setswipethreshold(Object _varswipethreshold) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetSwipeThreshold(varSwipeThreshold As Object)";
 //BA.debugLineNum = 247;BA.debugLine="SetAttr(CreateMap(\"md-swipe-threshold\": varSwipeT";
_setattr(__c.createMap(new Object[] {(Object)("md-swipe-threshold"),_varswipethreshold}));
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setswipetime(Object _varswipetime) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetSwipeTime(varSwipeTime As Object) As VMTabs";
 //BA.debugLineNum = 259;BA.debugLine="SetAttr(CreateMap(\"md-swipe-time\": varSwipeTime))";
_setattr(__c.createMap(new Object[] {(Object)("md-swipe-time"),_varswipetime}));
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setsyncroute(boolean _varsyncroute) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMTab";
 //BA.debugLineNum = 189;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
_setattr(__c.createMap(new Object[] {(Object)(":md-sync-route"),(Object)(_varsyncroute)}));
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settabactive(String _varactivetab) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetTabActive(varActiveTab As String) As VMTabs";
 //BA.debugLineNum = 172;BA.debugLine="If varActiveTab = Null Then Return Me";
if (_varactivetab== null) { 
if (true) return (b4j.example.vmtabs)(this);};
 //BA.debugLineNum = 173;BA.debugLine="varActiveTab = varActiveTab.tolowercase";
_varactivetab = _varactivetab.toLowerCase();
 //BA.debugLineNum = 174;BA.debugLine="vue.SetStateSingle(atKey, varActiveTab)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_atkey,(Object)(_varactivetab));
 //BA.debugLineNum = 175;BA.debugLine="SetAttr(CreateMap(\":md-active-tab\": atKey))";
_setattr(__c.createMap(new Object[] {(Object)(":md-active-tab"),(Object)(_atkey)}));
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settabdisabled(String _stepid,boolean _steplabel) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 45;BA.debugLine="Sub SetTabDisabled(stepID As String, stepLabel As";
 //BA.debugLineNum = 46;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 47;BA.debugLine="Dim stepShow As String = $\"${stepID}disabled\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"disabled");
 //BA.debugLineNum = 48;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_steplabel));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settabicon(String _stepid,String _steplabel) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 37;BA.debugLine="Sub SetTabIcon(stepID As String, stepLabel As Stri";
 //BA.debugLineNum = 38;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 39;BA.debugLine="Dim stepShow As String = $\"${stepID}icon\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"icon");
 //BA.debugLineNum = 40;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_steplabel));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settablabel(String _stepid,String _steplabel) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 29;BA.debugLine="Sub SetTabLabel(stepID As String, stepLabel As Str";
 //BA.debugLineNum = 30;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 31;BA.debugLine="Dim stepShow As String = $\"${stepID}label\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"label");
 //BA.debugLineNum = 32;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_steplabel));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetText(t As Object) As VMTabs";
 //BA.debugLineNum = 114;BA.debugLine="Tabs.SetText(t)";
_tabs._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetVIf(vif As Object) As VMTabs";
 //BA.debugLineNum = 91;BA.debugLine="Tabs.SetVIf(vif)";
_tabs._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetVModel(k As String) As VMTabs";
 //BA.debugLineNum = 86;BA.debugLine="Tabs.SetVModel(k)";
_tabs._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetVShow(vif As Object) As VMTabs";
 //BA.debugLineNum = 96;BA.debugLine="Tabs.SetVShow(vif)";
_tabs._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _showtab(String _stepid) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub ShowTab(stepID As String) As VMTabs";
 //BA.debugLineNum = 60;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 61;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"show");
 //BA.debugLineNum = 62;BA.debugLine="vue.SetStateSingle(stepShow, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(__c.True));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 82;BA.debugLine="Return Tabs.ToString";
if (true) return _tabs._tostring /*String*/ ();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
