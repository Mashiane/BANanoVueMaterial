package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtooltip extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtooltip", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtooltip.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tooltip = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _bactive = false;
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
public b4j.example.vmtooltip  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 55;BA.debugLine="Sub AddChild(child As VMElement) As VMTooltip";
 //BA.debugLineNum = 56;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="Tooltip.SetText(childHTML)";
_tooltip._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 102;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 103;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub AddClass(c As String) As VMTooltip";
 //BA.debugLineNum = 84;BA.debugLine="Tooltip.AddClass(c)";
_tooltip._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Tooltip As VMElement";
_tooltip = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
_bactive = false;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Tooltip.Initialize(v, ID)";
_tooltip._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 14;BA.debugLine="Tooltip.SetTag(\"md-tooltip\")";
_tooltip._settag /*b4j.example.vmelement*/ ("md-tooltip");
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="bActive = False";
_bactive = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 18;BA.debugLine="SetActiveSync(ID)";
_setactivesync(_id);
 };
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 50;BA.debugLine="Sub Render";
 //BA.debugLineNum = 51;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetAccent(b As Boolean) As VMTooltip";
 //BA.debugLineNum = 73;BA.debugLine="Tooltip.SetAccent(True)";
_tooltip._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setactive(Object _varactive) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetActive(varActive As Object) As VMTooltip";
 //BA.debugLineNum = 151;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
_setattr(__c.createMap(new Object[] {(Object)("md-active"),_varactive}));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setactivesync(String _v) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="private Sub SetActiveSync(v As String) As VMToolti";
 //BA.debugLineNum = 24;BA.debugLine="Tooltip.SetActiveSync(v)";
_tooltip._setactivesync /*b4j.example.vmelement*/ (_v);
 //BA.debugLineNum = 25;BA.debugLine="bActive = True";
_bactive = __c.True;
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetAttr(attr As Map) As VMTooltip";
 //BA.debugLineNum = 90;BA.debugLine="Tooltip.SetAttr(attr)";
_tooltip._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdelay(Object _vardelay) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetDelay(varDelay As Object) As VMTooltip";
 //BA.debugLineNum = 145;BA.debugLine="SetAttr(CreateMap(\"md-delay\": varDelay))";
_setattr(__c.createMap(new Object[] {(Object)("md-delay"),_vardelay}));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirection(Object _vardirection) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetDirection(varDirection As Object) As VMTool";
 //BA.debugLineNum = 115;BA.debugLine="SetAttr(CreateMap(\"md-direction\": varDirection))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),_vardirection}));
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirectionbottom(boolean _b) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetDirectionBottom(b As Boolean) As VMTooltip";
 //BA.debugLineNum = 133;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),(Object)("bottom")}));
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirectionleft(boolean _b) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetDirectionLeft(b As Boolean) As VMTooltip";
 //BA.debugLineNum = 139;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"left\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),(Object)("left")}));
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirectionright(boolean _b) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetDirectionRight(b As Boolean) As VMTooltip";
 //BA.debugLineNum = 127;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"right\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),(Object)("right")}));
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirectiontop(boolean _b) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetDirectionTop(b As Boolean) As VMTooltip";
 //BA.debugLineNum = 121;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top\"))";
_setattr(__c.createMap(new Object[] {(Object)("md-direction"),(Object)("top")}));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetPadding(p As Object) As VMTooltip";
 //BA.debugLineNum = 109;BA.debugLine="Tooltip.SetPaddingAll(p)";
_tooltip._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTooltip";
 //BA.debugLineNum = 68;BA.debugLine="Tooltip.SetPrimary(True)";
_tooltip._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetStyle(sm As Map) As VMTooltip";
 //BA.debugLineNum = 96;BA.debugLine="Tooltip.SetStyle(sm)";
_tooltip._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetText(t As Object) As VMTooltip";
 //BA.debugLineNum = 63;BA.debugLine="Tooltip.SetText(t)";
_tooltip._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetVIf(vif As Object) As VMTooltip";
 //BA.debugLineNum = 40;BA.debugLine="Tooltip.SetVIf(vif)";
_tooltip._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetVModel(k As String) As VMTooltip";
 //BA.debugLineNum = 35;BA.debugLine="Tooltip.SetVModel(k)";
_tooltip._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetVShow(vif As Object) As VMTooltip";
 //BA.debugLineNum = 45;BA.debugLine="Tooltip.SetVShow(vif)";
_tooltip._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 31;BA.debugLine="Return Tooltip.ToString";
if (true) return _tooltip._tostring /*String*/ ();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
