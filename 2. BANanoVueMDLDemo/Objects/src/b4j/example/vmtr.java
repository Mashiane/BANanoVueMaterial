package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtr extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtr", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtr.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tr = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _hascontent = false;
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
public b4j.example.vmtr  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 98;BA.debugLine="Sub AddChild(child As VMElement) As VMTR";
 //BA.debugLineNum = 99;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 100;BA.debugLine="TR.SetText(childHTML)";
_tr._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 101;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 150;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 151;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 153;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtr  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub AddClass(c As String) As VMTR";
 //BA.debugLineNum = 129;BA.debugLine="TR.AddClass(c)";
_tr._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 130;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TR As VMElement";
_tr = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtr  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _parentid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="TR.Initialize(v, ID)";
_tr._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 14;BA.debugLine="TR.SetTag(\"md-table-row\")";
_tr._settag /*b4j.example.vmelement*/ ("md-table-row");
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="SetSlot(\"md-table-row\")";
_setslot("md-table-row");
 //BA.debugLineNum = 18;BA.debugLine="SetSlotScope(\"{ item }\")";
_setslotscope("{ item }");
 //BA.debugLineNum = 19;BA.debugLine="TR.RemoveAttr(\":required\")";
_tr._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 20;BA.debugLine="TR.RemoveAttr(\":disabled\")";
_tr._removeattr /*b4j.example.vmelement*/ (":disabled");
 //BA.debugLineNum = 21;BA.debugLine="TR.RemoveAttr(\"v-show\")";
_tr._removeattr /*b4j.example.vmelement*/ ("v-show");
 //BA.debugLineNum = 22;BA.debugLine="TR.RemoveAttr(\"ref\")";
_tr._removeattr /*b4j.example.vmelement*/ ("ref");
 //BA.debugLineNum = 23;BA.debugLine="TR.RemoveAttr(\"id\")";
_tr._removeattr /*b4j.example.vmelement*/ ("id");
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 124;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Render";
 //BA.debugLineNum = 94;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtr  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetAccent(b As Boolean) As VMTR";
 //BA.debugLineNum = 118;BA.debugLine="TR.SetAccent(True)";
_tr._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetAttr(attr As Map) As VMTR";
 //BA.debugLineNum = 136;BA.debugLine="TR.SetAttr(attr)";
_tr._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 137;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setautoselect(boolean _b) throws Exception{
String _pp = "";
 //BA.debugLineNum = 46;BA.debugLine="Sub SetAutoSelect(b As Boolean) As VMTR";
 //BA.debugLineNum = 47;BA.debugLine="Dim pp As String = $\"${ID}autoselect\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"autoselect");
 //BA.debugLineNum = 48;BA.debugLine="vue.SetStateSingle(pp, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_b));
 //BA.debugLineNum = 49;BA.debugLine="If b Then SetAttr(CreateMap(\":md-auto-select\":pp)";
if (_b) { 
_setattr(__c.createMap(new Object[] {(Object)(":md-auto-select"),(Object)(_pp)}));};
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetPadding(p As Object) As VMTR";
 //BA.debugLineNum = 158;BA.debugLine="TR.SetPaddingAll(p)";
_tr._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTR";
 //BA.debugLineNum = 113;BA.debugLine="TR.SetPrimary(True)";
_tr._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setselectable(String _sel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub SetSelectable(sel As String) As VMTR";
 //BA.debugLineNum = 28;BA.debugLine="Dim pp As String = $\"${ID}selectable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"selectable");
 //BA.debugLineNum = 29;BA.debugLine="vue.SetStateSingle(pp, sel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_sel));
 //BA.debugLineNum = 30;BA.debugLine="SetAttr(CreateMap(\":md-selectable\":pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-selectable"),(Object)(_pp)}));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setselectablemultiple(boolean _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetSelectableMultiple(b As Boolean) As VMTR";
 //BA.debugLineNum = 41;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtr)(this);};
 //BA.debugLineNum = 42;BA.debugLine="SetSelectable(\"multiple\")";
_setselectable("multiple");
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setselectablesingle(boolean _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetSelectableSingle(b As Boolean) As VMTR";
 //BA.debugLineNum = 35;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtr)(this);};
 //BA.debugLineNum = 36;BA.debugLine="SetSelectable(\"single\")";
_setselectable("single");
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setslot(String _s) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetSlot(s As String) As VMTR";
 //BA.debugLineNum = 54;BA.debugLine="SetAttr(CreateMap(\"slot\":s))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)(_s)}));
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setslotscope(String _sc) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetSlotScope(sc As String) As VMTR";
 //BA.debugLineNum = 64;BA.debugLine="SetAttr(CreateMap(\"slot-scope\": sc))";
_setattr(__c.createMap(new Object[] {(Object)("slot-scope"),(Object)(_sc)}));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setslottablerow(boolean _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetSlotTableRow(b As Boolean) As VMTR";
 //BA.debugLineNum = 59;BA.debugLine="If b Then SetSlot(\"md-table-row\")";
if (_b) { 
_setslot("md-table-row");};
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetStyle(sm As Map) As VMTR";
 //BA.debugLineNum = 143;BA.debugLine="TR.SetStyle(sm)";
_tr._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 144;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetText(t As Object) As VMTR";
 //BA.debugLineNum = 107;BA.debugLine="TR.SetText(t)";
_tr._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 108;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetVIf(vif As Object) As VMTR";
 //BA.debugLineNum = 81;BA.debugLine="TR.SetVIf(vif)";
_tr._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 82;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetVModel(k As String) As VMTR";
 //BA.debugLineNum = 75;BA.debugLine="TR.SetVModel(k)";
_tr._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 76;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetVShow(vif As Object) As VMTR";
 //BA.debugLineNum = 87;BA.debugLine="TR.SetVShow(vif)";
_tr._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 88;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 70;BA.debugLine="TR.RemoveAttr(\"v-show\")";
_tr._removeattr /*b4j.example.vmelement*/ ("v-show");
 //BA.debugLineNum = 71;BA.debugLine="Return TR.ToString";
if (true) return _tr._tostring /*String*/ ();
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
