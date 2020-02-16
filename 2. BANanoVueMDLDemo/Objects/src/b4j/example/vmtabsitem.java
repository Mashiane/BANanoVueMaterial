package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtabsitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtabsitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtabsitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tabitem = null;
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
public b4j.example.vmtabsitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 42;BA.debugLine="Sub AddChild(child As VMElement) As VMTabsItem";
 //BA.debugLineNum = 43;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 44;BA.debugLine="TabItem.SetText(childHTML)";
_tabitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 78;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 79;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 80;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub AddClass(c As String) As VMTabsItem";
 //BA.debugLineNum = 61;BA.debugLine="TabItem.AddClass(c)";
_tabitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TabItem As VMElement";
_tabitem = new b4j.example.vmelement();
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
public b4j.example.vmtabsitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="TabItem.Initialize(v, ID)";
_tabitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 14;BA.debugLine="TabItem.SetTag(\"md-tab\")";
_tabitem._settag /*b4j.example.vmelement*/ ("md-tab");
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="SetId(ID)";
_setid(_id);
 //BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 56;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub Render";
 //BA.debugLineNum = 38;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetAttr(attr As Map) As VMTabsItem";
 //BA.debugLineNum = 67;BA.debugLine="TabItem.SetAttr(attr)";
_tabitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setdisabled(boolean _vardisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 121;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMTabsI";
 //BA.debugLineNum = 122;BA.debugLine="Dim pp As String = $\"${ID}disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"disabled");
 //BA.debugLineNum = 123;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisabled));
 //BA.debugLineNum = 124;BA.debugLine="SetAttr(CreateMap(\":md-disabled\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-disabled"),(Object)(_pp)}));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _seticon(String _varicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 113;BA.debugLine="Sub SetIcon(varIcon As String) As VMTabsItem";
 //BA.debugLineNum = 114;BA.debugLine="Dim pp As String = $\"${ID}icon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"icon");
 //BA.debugLineNum = 115;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varicon));
 //BA.debugLineNum = 116;BA.debugLine="SetAttr(CreateMap(\":md-icon\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-icon"),(Object)(_pp)}));
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setid(String _varid) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetId(varId As String) As VMTabsItem";
 //BA.debugLineNum = 92;BA.debugLine="If varId = \"\" Then Return Me";
if ((_varid).equals("")) { 
if (true) return (b4j.example.vmtabsitem)(this);};
 //BA.debugLineNum = 93;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
_setattr(__c.createMap(new Object[] {(Object)("id"),(Object)(_varid)}));
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 105;BA.debugLine="Sub SetLabel(varLabel As String) As VMTabsItem";
 //BA.debugLineNum = 106;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"label");
 //BA.debugLineNum = 107;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 108;BA.debugLine="SetAttr(CreateMap(\":md-label\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-label"),(Object)(_pp)}));
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetPadding(p As Object) As VMTabsItem";
 //BA.debugLineNum = 86;BA.debugLine="TabItem.SetPaddingAll(p)";
_tabitem._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setref(String _varref) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetRef(varRef As String) As VMTabsItem";
 //BA.debugLineNum = 99;BA.debugLine="If varRef = \"\" Then Return Me";
if ((_varref).equals("")) { 
if (true) return (b4j.example.vmtabsitem)(this);};
 //BA.debugLineNum = 100;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
_setattr(__c.createMap(new Object[] {(Object)("ref"),(Object)(_varref)}));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetStyle(sm As Map) As VMTabsItem";
 //BA.debugLineNum = 73;BA.debugLine="TabItem.SetStyle(sm)";
_tabitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _settemplatedata(Object _vartemplatedata) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetTemplateData(varTemplateData As Object) As";
 //BA.debugLineNum = 130;BA.debugLine="SetAttr(CreateMap(\"md-template-data\": varTemplate";
_setattr(__c.createMap(new Object[] {(Object)("md-template-data"),_vartemplatedata}));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _settext(String _t) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetText(t As String) As VMTabsItem";
 //BA.debugLineNum = 50;BA.debugLine="TabItem.SetText(t)";
_tabitem._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetVIf(vif As String) As VMTabsItem";
 //BA.debugLineNum = 27;BA.debugLine="TabItem.SetVIf(vif)";
_tabitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetVShow(vif As String) As VMTabsItem";
 //BA.debugLineNum = 32;BA.debugLine="TabItem.SetVShow(vif)";
_tabitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 23;BA.debugLine="Return TabItem.ToString";
if (true) return _tabitem._tostring /*String*/ ();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
