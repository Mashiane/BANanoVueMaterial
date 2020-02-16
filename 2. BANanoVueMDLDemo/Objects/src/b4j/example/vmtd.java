package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtd extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtd", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtd.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _td = null;
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
public b4j.example.vmtd  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub AddChild(child As VMElement) As VMTD";
 //BA.debugLineNum = 75;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 76;BA.debugLine="TD.SetText(childHTML)";
_td._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 121;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 122;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtd  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub AddClass(c As String) As VMTD";
 //BA.debugLineNum = 103;BA.debugLine="TD.AddClass(c)";
_td._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TD As VMElement";
_td = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtd  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="TD.Initialize(v, ID)";
_td._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 13;BA.debugLine="TD.SetTag(\"md-table-cell\")";
_td._settag /*b4j.example.vmelement*/ ("md-table-cell");
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="TD.RemoveAttr(\":required\")";
_td._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 16;BA.debugLine="TD.RemoveAttr(\":disabled\")";
_td._removeattr /*b4j.example.vmelement*/ (":disabled");
 //BA.debugLineNum = 17;BA.debugLine="TD.RemoveAttr(\"v-show\")";
_td._removeattr /*b4j.example.vmelement*/ ("v-show");
 //BA.debugLineNum = 18;BA.debugLine="TD.RemoveAttr(\"ref\")";
_td._removeattr /*b4j.example.vmelement*/ ("ref");
 //BA.debugLineNum = 19;BA.debugLine="TD.RemoveAttr(\"id\")";
_td._removeattr /*b4j.example.vmelement*/ ("id");
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 98;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub Render";
 //BA.debugLineNum = 70;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtd  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetAccent(b As Boolean) As VMTD";
 //BA.debugLineNum = 92;BA.debugLine="TD.SetAccent(True)";
_td._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAttr(attr As Map) As VMTD";
 //BA.debugLineNum = 109;BA.debugLine="TD.SetAttr(attr)";
_td._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setlabel(String _l) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetLabel(l As String) As VMTD";
 //BA.debugLineNum = 47;BA.debugLine="SetAttr(CreateMap(\"md-label\":l))";
_setattr(__c.createMap(new Object[] {(Object)("md-label"),(Object)(_l)}));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setnumeric(boolean _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetNumeric(b As Boolean) As VMTD";
 //BA.debugLineNum = 35;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 36;BA.debugLine="SetAttr(CreateMap(\"md-numeric\":\"true\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-numeric"),(Object)("true")}));
 };
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetPadding(p As Object) As VMTD";
 //BA.debugLineNum = 128;BA.debugLine="TD.SetPaddingAll(p)";
_td._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTD";
 //BA.debugLineNum = 87;BA.debugLine="TD.SetPrimary(True)";
_td._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setsortby(String _i) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetSortBy(i As String) As VMTD";
 //BA.debugLineNum = 42;BA.debugLine="SetAttr(CreateMap(\"md-sort-by\":i))";
_setattr(__c.createMap(new Object[] {(Object)("md-sort-by"),(Object)(_i)}));
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetStyle(sm As Map) As VMTD";
 //BA.debugLineNum = 115;BA.debugLine="TD.SetStyle(sm)";
_td._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetText(t As Object) As VMTD";
 //BA.debugLineNum = 82;BA.debugLine="TD.SetText(t)";
_td._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetVIf(vif As Object) As VMTD";
 //BA.debugLineNum = 57;BA.debugLine="TD.SetVIf(vif)";
_td._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetVisible(b As Boolean) As VMTD";
 //BA.debugLineNum = 30;BA.debugLine="TD.SetVisible(b)";
_td._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetVModel(k As String) As VMTD";
 //BA.debugLineNum = 52;BA.debugLine="TD.SetVModel(k)";
_td._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setvshow(boolean _vif) throws Exception{
String _colshow = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetVShow(vif As Boolean) As VMTD";
 //BA.debugLineNum = 62;BA.debugLine="Dim colShow As String = $\"${ID}show\"$";
_colshow = (""+__c.SmartStringFormatter("",(Object)(_id))+"show");
 //BA.debugLineNum = 63;BA.debugLine="vue.SetStateSingle(colShow, vif)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_colshow,(Object)(_vif));
 //BA.debugLineNum = 64;BA.debugLine="TD.SetVShow(colShow)";
_td._setvshow /*b4j.example.vmelement*/ (_colshow);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 25;BA.debugLine="TD.RemoveAttr(\"v-show\")";
_td._removeattr /*b4j.example.vmelement*/ ("v-show");
 //BA.debugLineNum = 26;BA.debugLine="Return TD.ToString";
if (true) return _td._tostring /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
