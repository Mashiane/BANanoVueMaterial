package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbottombaritem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbottombaritem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbottombaritem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _bottombaritem = null;
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
public b4j.example.vmbottombaritem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 88;BA.debugLine="Sub AddChild(child As VMElement) As VMBottomBarIte";
 //BA.debugLineNum = 89;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 90;BA.debugLine="BottomBarItem.SetText(childHTML)";
_bottombaritem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 128;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 129;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 130;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombaritem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub AddClass(c As String) As VMBottomBarItem";
 //BA.debugLineNum = 111;BA.debugLine="BottomBarItem.AddClass(c)";
_bottombaritem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BottomBarItem As VMElement";
_bottombaritem = new b4j.example.vmelement();
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
public b4j.example.vmbottombaritem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="BottomBarItem.Initialize(v, ID)";
_bottombaritem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 14;BA.debugLine="BottomBarItem.SetTag(\"md-bottom-bar-item\")";
_bottombaritem._settag /*b4j.example.vmelement*/ ("md-bottom-bar-item");
 //BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 16;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 17;BA.debugLine="BottomBarItem.SetOnClick(module, $\"${ID}_click\"$)";
_bottombaritem._setonclick /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 106;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub Render";
 //BA.debugLineNum = 84;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombaritem  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetAccent(b As Boolean) As VMBottomBarItem";
 //BA.debugLineNum = 100;BA.debugLine="BottomBarItem.SetAccent(True)";
_bottombaritem._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetAttr(attr As Map) As VMBottomBarItem";
 //BA.debugLineNum = 117;BA.debugLine="BottomBarItem.SetAttr(attr)";
_bottombaritem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setbadge(String _badge) throws Exception{
String _badgecontent = "";
b4j.example.vmelement _i = null;
 //BA.debugLineNum = 53;BA.debugLine="Sub SetBadge(badge As String) As VMBottomBarItem";
 //BA.debugLineNum = 54;BA.debugLine="Dim badgeContent As String = $\"${ID}badgevalue\"$";
_badgecontent = (""+__c.SmartStringFormatter("",(Object)(_id))+"badgevalue");
 //BA.debugLineNum = 55;BA.debugLine="vue.SetStateSingle(badgeContent, badge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badgecontent,(Object)(_badge));
 //BA.debugLineNum = 56;BA.debugLine="Dim i As VMElement";
_i = new b4j.example.vmelement();
 //BA.debugLineNum = 57;BA.debugLine="i.Initialize(vue,$\"${ID}badge\"$).SetTag(\"i\").AddC";
_i._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"badge"))._settag /*b4j.example.vmelement*/ ("i")._addclass /*b4j.example.vmelement*/ ("bottomitembadge")._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_badgecontent))+" }}"));
 //BA.debugLineNum = 58;BA.debugLine="i.Pop(BottomBarItem)";
_i._pop /*String*/ (_bottombaritem);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMBotto";
 //BA.debugLineNum = 164;BA.debugLine="BottomBarItem.SetDisabled(varDisabled)";
_bottombaritem._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setexact(boolean _b) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetExact(b As Boolean) As VMBottomBarItem";
 //BA.debugLineNum = 22;BA.debugLine="BottomBarItem.SetExact(b)";
_bottombaritem._setexact /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _seticon(Object _varicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub SetIcon(varIcon As Object) As VMBottomBarItem";
 //BA.debugLineNum = 156;BA.debugLine="Dim pp As String = $\"${ID}icon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"icon");
 //BA.debugLineNum = 157;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varicon);
 //BA.debugLineNum = 158;BA.debugLine="SetAttr(CreateMap(\":md-icon\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-icon"),(Object)(_pp)}));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _seticon1(String _icn) throws Exception{
b4j.example.vmicon _icon = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub SetIcon1(icn As String) As VMBottomBarItem";
 //BA.debugLineNum = 36;BA.debugLine="If icn = \"\" Then Return Me";
if ((_icn).equals("")) { 
if (true) return (b4j.example.vmbottombaritem)(this);};
 //BA.debugLineNum = 37;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 38;BA.debugLine="icon.Initialize(vue, $\"${ID}icon\"$).SetBottomBarI";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"))._setbottombaricon /*b4j.example.vmicon*/ (__c.True)._settext /*b4j.example.vmicon*/ (_icn);
 //BA.debugLineNum = 39;BA.debugLine="icon.Pop(BottomBarItem)";
_icon._pop /*String*/ (_bottombaritem);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setid(Object _varid) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetId(varId As Object) As VMBottomBarItem";
 //BA.debugLineNum = 142;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
_setattr(__c.createMap(new Object[] {(Object)("id"),_varid}));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setlabel(String _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetLabel(varLabel As String) As VMBottomBarIte";
 //BA.debugLineNum = 148;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"label");
 //BA.debugLineNum = 149;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlabel));
 //BA.debugLineNum = 150;BA.debugLine="SetAttr(CreateMap(\":md-label\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-label"),(Object)(_pp)}));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setlabel1(String _label) throws Exception{
String _pp = "";
b4j.example.vmelement _span = null;
 //BA.debugLineNum = 44;BA.debugLine="Sub SetLabel1(label As String) As VMBottomBarItem";
 //BA.debugLineNum = 45;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"label");
 //BA.debugLineNum = 46;BA.debugLine="vue.SetStateSingle(pp, label)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_label));
 //BA.debugLineNum = 47;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 48;BA.debugLine="span.Initialize(vue, $\"${ID}label\"$).SetTag(\"span";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"label"))._settag /*b4j.example.vmelement*/ ("span")._addclass /*b4j.example.vmelement*/ ("md-bottom-bar-label")._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_pp))+" }}"));
 //BA.debugLineNum = 49;BA.debugLine="span.Pop(BottomBarItem)";
_span._pop /*String*/ (_bottombaritem);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetPadding(p As Object) As VMBottomBarItem";
 //BA.debugLineNum = 136;BA.debugLine="BottomBarItem.SetPaddingAll(p)";
_bottombaritem._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBottomBarItem";
 //BA.debugLineNum = 95;BA.debugLine="BottomBarItem.SetPrimary(True)";
_bottombaritem._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetStyle(sm As Map) As VMBottomBarItem";
 //BA.debugLineNum = 123;BA.debugLine="BottomBarItem.SetStyle(sm)";
_bottombaritem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setsvg(String _src) throws Exception{
b4j.example.vmicon _icon = null;
 //BA.debugLineNum = 27;BA.debugLine="Sub SetSVG(src As String) As VMBottomBarItem";
 //BA.debugLineNum = 28;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 29;BA.debugLine="icon.Initialize(vue, $\"${ID}svg\"$).SetBottomBarIc";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"svg"))._setbottombaricon /*b4j.example.vmicon*/ (__c.True)._setsrc /*b4j.example.vmicon*/ (_src);
 //BA.debugLineNum = 30;BA.debugLine="icon.Pop(BottomBarItem)";
_icon._pop /*String*/ (_bottombaritem);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setto(String _t) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetTo(t As String) As VMBottomBarItem";
 //BA.debugLineNum = 63;BA.debugLine="BottomBarItem.SetTo(t)";
_bottombaritem._setto /*b4j.example.vmelement*/ ((Object)(_t));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetVIf(vif As Object) As VMBottomBarItem";
 //BA.debugLineNum = 73;BA.debugLine="BottomBarItem.SetVIf(vif)";
_bottombaritem._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetVShow(vif As Object) As VMBottomBarItem";
 //BA.debugLineNum = 78;BA.debugLine="BottomBarItem.SetVShow(vif)";
_bottombaritem._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 69;BA.debugLine="Return BottomBarItem.ToString";
if (true) return _bottombaritem._tostring /*String*/ ();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
