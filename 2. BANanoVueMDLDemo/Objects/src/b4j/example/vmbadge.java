package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbadge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbadge", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbadge.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _badge = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _badvalue = "";
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
public b4j.example.vmbadge  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 101;BA.debugLine="Sub AddChild(child As VMElement) As VMBadge";
 //BA.debugLineNum = 102;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 103;BA.debugLine="Badge.SetText(childHTML)";
_badge._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 108;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 109;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 110;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub AddClass(c As String) As VMBadge";
 //BA.debugLineNum = 84;BA.debugLine="Badge.AddClass(c)";
_badge._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 157;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Badge As VMElement";
_badge = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private badValue As String";
_badvalue = "";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Badge.Initialize(v, ID)";
_badge._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 14;BA.debugLine="Badge.SetTag(\"md-badge\")";
_badge._settag /*b4j.example.vmelement*/ ("md-badge");
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="badValue = $\"${ID}value\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_id))+"value");
 //BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 18;BA.debugLine="vue.SetStateSingle(badValue,\"0\")";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)("0"));
 //BA.debugLineNum = 19;BA.debugLine="SetAttr(CreateMap(\"v-bind:md-content\": badValue))";
_setattr(__c.createMap(new Object[] {(Object)("v-bind:md-content"),(Object)(_badvalue)}));
 };
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 79;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Render";
 //BA.debugLineNum = 68;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetAccent(b As Boolean) As VMBadge";
 //BA.debugLineNum = 56;BA.debugLine="If b Then Badge.SetAccent(True)";
if (_b) { 
_badge._setaccent /*b4j.example.vmelement*/ (__c.True);};
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetAttr(attr As Map) As VMBadge";
 //BA.debugLineNum = 90;BA.debugLine="Badge.SetAttr(attr)";
_badge._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setavatar(b4j.example.vmavatar _avtr) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetAvatar(avtr As VMAvatar) As VMBadge";
 //BA.debugLineNum = 41;BA.debugLine="avtr.Pop(Badge)";
_avtr._pop /*String*/ (_badge);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setbutton(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetButton(btn As VMButton) As VMBadge";
 //BA.debugLineNum = 36;BA.debugLine="btn.Pop(Badge)";
_btn._pop /*String*/ (_badge);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setcontent(int _varcontent) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetContent(varContent As Int) As VMBadge";
 //BA.debugLineNum = 122;BA.debugLine="vue.SetStateSingle(badValue,varContent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_varcontent));
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdense(boolean _vardense) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetDense(varDense As Boolean) As VMBadge";
 //BA.debugLineNum = 146;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
if (_vardense) { 
_setattr(__c.createMap(new Object[] {(Object)(":md-dense"),(Object)(_vardense)}));};
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetDisabled(b As Boolean) As VMBadge";
 //BA.debugLineNum = 25;BA.debugLine="Badge.SetDisabled(b)";
_badge._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetPadding(p As Object) As VMBadge";
 //BA.debugLineNum = 116;BA.debugLine="Badge.SetPaddingAll(p)";
_badge._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setposition(Object _varposition) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetPosition(varPosition As Object) As VMBadge";
 //BA.debugLineNum = 128;BA.debugLine="SetAttr(CreateMap(\"md-position\": varPosition))";
_setattr(__c.createMap(new Object[] {(Object)("md-position"),_varposition}));
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setpositionbottom(boolean _b) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetPositionBottom(b As Boolean) As VMBadge";
 //BA.debugLineNum = 140;BA.debugLine="SetAttr(CreateMap(\"md-position\": \"bottom\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-position"),(Object)("bottom")}));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setpositiontop(boolean _b) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetPositionTop(b As Boolean) As VMBadge    'ig";
 //BA.debugLineNum = 134;BA.debugLine="SetAttr(CreateMap(\"md-position\": \"top\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-position"),(Object)("top")}));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBadge";
 //BA.debugLineNum = 51;BA.debugLine="If b Then Badge.SetPrimary(True)";
if (_b) { 
_badge._setprimary /*b4j.example.vmelement*/ (__c.True);};
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setsquare(boolean _b) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetSquare(b As Boolean) As VMBadge    'ignore";
 //BA.debugLineNum = 152;BA.debugLine="If b = True Then AddClass(\"md-square\")";
if (_b==__c.True) { 
_addclass("md-square");};
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetStyle(sm As Map) As VMBadge";
 //BA.debugLineNum = 96;BA.debugLine="Badge.SetStyle(sm)";
_badge._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetText(t As Object) As VMBadge";
 //BA.debugLineNum = 73;BA.debugLine="Badge.SetText(t)";
_badge._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetVModel(k As String) As VMBadge";
 //BA.debugLineNum = 62;BA.debugLine="Badge.SetVModel(k)";
_badge._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetVShow(vif As String) As VMBadge";
 //BA.debugLineNum = 30;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmbadge)(this);};
 //BA.debugLineNum = 31;BA.debugLine="Badge.SetVShow(vif)";
_badge._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 47;BA.debugLine="Return Badge.ToString";
if (true) return _badge._tostring /*String*/ ();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
