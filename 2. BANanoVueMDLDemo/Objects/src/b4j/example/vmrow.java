package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmrow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _row = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
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
public String  _addbr() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub AddBR";
 //BA.debugLineNum = 20;BA.debugLine="SetText(\"<br>\")";
_settext((Object)("<br>"));
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub AddChild(child As VMElement) As VMRow";
 //BA.debugLineNum = 85;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="Row.SetText(childHTML)";
_row._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 140;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 141;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 142;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub AddClass(c As String) As VMRow";
 //BA.debugLineNum = 113;BA.debugLine="Row.AddClass(c)";
_row._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _addelements(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub AddElements(lst As List) As VMRow";
 //BA.debugLineNum = 29;BA.debugLine="Row.AddElements(lst)";
_row._addelements /*String*/ (_lst);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _addhr() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub AddHR";
 //BA.debugLineNum = 25;BA.debugLine="SetText(\"<hr>\")";
_settext((Object)("<hr>"));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Row As VMElement";
_row = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="Row.Initialize(v, ID)";
_row._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 13;BA.debugLine="Row.SetTag(\"div\").AddClass(\"md-layout\")";
_row._settag /*b4j.example.vmelement*/ ("div")._addclass /*b4j.example.vmelement*/ ("md-layout");
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 108;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Render";
 //BA.debugLineNum = 80;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetAccent(b As Boolean) As VMRow";
 //BA.debugLineNum = 102;BA.debugLine="Row.SetAccent(True)";
_row._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignment(String _a) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetAlignment(a As String) As VMRow";
 //BA.debugLineNum = 44;BA.debugLine="Row.AddClass(a)";
_row._addclass /*b4j.example.vmelement*/ (_a);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignmenttopcenter(boolean _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetAlignmentTopCenter(b As Boolean) As VMRow";
 //BA.debugLineNum = 49;BA.debugLine="SetAlignment(\"md-alignment-top-center\")";
_setalignment("md-alignment-top-center");
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignmenttopleft(boolean _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetAlignmentTopLeft(b As Boolean) As VMRow";
 //BA.debugLineNum = 54;BA.debugLine="SetAlignment(\"md-alignment-top-left\")";
_setalignment("md-alignment-top-left");
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetAttr(attr As Map) As VMRow";
 //BA.debugLineNum = 119;BA.debugLine="Row.SetAttr(attr)";
_row._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setgutter(boolean _b) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetGutter(b As Boolean) As VMRow";
 //BA.debugLineNum = 34;BA.debugLine="Row.SetGutter(True)";
_row._setgutter /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _sethidden(boolean _xsmall,boolean _small,boolean _medium,boolean _large,boolean _xlarge) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetHidden(xsmall As Boolean, small As Boolean,";
 //BA.debugLineNum = 130;BA.debugLine="Row.SetHidden(xsmall, small, medium, large, xlarg";
_row._sethidden /*b4j.example.vmelement*/ (_xsmall,_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setnowrap(boolean _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetNoWrap(b As Boolean) As VMRow";
 //BA.debugLineNum = 39;BA.debugLine="If b Then Row.AddClass(\"md-layout-nowrap\")";
if (_b) { 
_row._addclass /*b4j.example.vmelement*/ ("md-layout-nowrap");};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetPadding(p As Object) As VMRow";
 //BA.debugLineNum = 148;BA.debugLine="Row.SetPaddingAll(p)";
_row._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetPrimary(b As Boolean) As VMRow";
 //BA.debugLineNum = 97;BA.debugLine="Row.SetPrimary(True)";
_row._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setsizes(int _xsmall,int _small,int _medium,int _large,int _xlarge) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetSizes(xsmall As Int, small As Int, medium A";
 //BA.debugLineNum = 135;BA.debugLine="Row.SetSizes(xsmall, small, medium, large, xlarge";
_row._setsizes /*b4j.example.vmelement*/ (_xsmall,_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetStyle(sm As Map) As VMRow";
 //BA.debugLineNum = 125;BA.debugLine="Row.SetStyle(sm)";
_row._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetText(t As Object) As VMRow";
 //BA.debugLineNum = 92;BA.debugLine="Row.SetText(t)";
_row._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetVIf(vif As Object) As VMRow";
 //BA.debugLineNum = 69;BA.debugLine="Row.SetVIf(vif)";
_row._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetVModel(k As String) As VMRow";
 //BA.debugLineNum = 64;BA.debugLine="Row.SetVModel(k)";
_row._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetVShow(vif As Object) As VMRow";
 //BA.debugLineNum = 74;BA.debugLine="Row.SetVShow(vif)";
_row._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 60;BA.debugLine="Return Row.ToString";
if (true) return _row._tostring /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
