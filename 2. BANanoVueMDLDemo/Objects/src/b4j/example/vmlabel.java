package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _label = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
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
public b4j.example.vmlabel  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub AddChild(child As VMElement) As VMLabel";
 //BA.debugLineNum = 157;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 158;BA.debugLine="Label.SetText(childHTML)";
_label._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 163;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 164;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 165;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub AddClass(c As String) As VMLabel";
 //BA.debugLineNum = 151;BA.debugLine="Label.AddClass(c)";
_label._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 193;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Label As VMElement";
_label = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 9;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 10;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 11;BA.debugLine="Label.Initialize(vue, ID).SetTag(\"label\")";
_label._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("label");
 //BA.debugLineNum = 12;BA.debugLine="Label.RemoveAttr(\":required\")";
_label._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 189;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub Render";
 //BA.debugLineNum = 185;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetAttr(attr As Map) As VMLabel";
 //BA.debugLineNum = 171;BA.debugLine="Label.SetAttr(attr)";
_label._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setbody1(boolean _b) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetBody1(b As Boolean) As VMLabel";
 //BA.debugLineNum = 67;BA.debugLine="Label.SetBody1(b)";
_label._setbody1 /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setbody2(boolean _b) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetBody2(b As Boolean) As VMLabel";
 //BA.debugLineNum = 62;BA.debugLine="Label.SetBody2(b)";
_label._setbody2 /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setcaption(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetCaption(b As Boolean) As VMLabel";
 //BA.debugLineNum = 72;BA.debugLine="Label.SetCaption(b)";
_label._setcaption /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetDisabled(b As Boolean) As VMLabel";
 //BA.debugLineNum = 77;BA.debugLine="Label.SetDisabled(b)";
_label._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay1(boolean _b) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetDisplay1(b As Boolean) As VMLabel";
 //BA.debugLineNum = 32;BA.debugLine="Label.SetDisplay1(b)";
_label._setdisplay1 /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay2(boolean _b) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetDisplay2(b As Boolean) As VMLabel";
 //BA.debugLineNum = 27;BA.debugLine="Label.SetDisplay2(b)";
_label._setdisplay2 /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay3(boolean _b) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetDisplay3(b As Boolean) As VMLabel";
 //BA.debugLineNum = 22;BA.debugLine="Label.SetDisplay3(b)";
_label._setdisplay3 /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay4(boolean _b) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub SetDisplay4(b As Boolean) As VMLabel";
 //BA.debugLineNum = 17;BA.debugLine="Label.SetDisplay4(b)";
_label._setdisplay4 /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetElevation(e As Int) As VMLabel";
 //BA.debugLineNum = 145;BA.debugLine="Label.SetElevation(e)";
_label._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth1() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetH1 As VMLabel";
 //BA.debugLineNum = 104;BA.debugLine="Label.SetTag(\"h1\")";
_label._settag /*b4j.example.vmelement*/ ("h1");
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth2() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetH2 As VMLabel";
 //BA.debugLineNum = 114;BA.debugLine="Label.SetTag(\"h2\")";
_label._settag /*b4j.example.vmelement*/ ("h2");
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth3() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetH3 As VMLabel";
 //BA.debugLineNum = 120;BA.debugLine="Label.SetTag(\"h3\")";
_label._settag /*b4j.example.vmelement*/ ("h3");
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth4() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetH4 As VMLabel";
 //BA.debugLineNum = 125;BA.debugLine="Label.SetTag(\"h4\")";
_label._settag /*b4j.example.vmelement*/ ("h4");
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth5() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetH5 As VMLabel";
 //BA.debugLineNum = 135;BA.debugLine="Label.SetTag(\"h5\")";
_label._settag /*b4j.example.vmelement*/ ("h5");
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth6() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetH6 As VMLabel";
 //BA.debugLineNum = 140;BA.debugLine="Label.SetTag(\"h6\")";
_label._settag /*b4j.example.vmelement*/ ("h6");
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setheadline(boolean _b) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetHeadline(b As Boolean) As VMLabel";
 //BA.debugLineNum = 37;BA.debugLine="Label.SetHeadline(b)";
_label._setheadline /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setparagraph() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetParagraph As VMLabel";
 //BA.debugLineNum = 99;BA.debugLine="Label.SetTag(\"p\")";
_label._settag /*b4j.example.vmelement*/ ("p");
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setspan() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetSpan As VMLabel";
 //BA.debugLineNum = 130;BA.debugLine="Label.SetTag(\"span\")";
_label._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetStyle(sm As Map) As VMLabel";
 //BA.debugLineNum = 89;BA.debugLine="Label.SetStyle(sm)";
_label._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setsubheading(boolean _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetSubHeading(b As Boolean) As VMLabel";
 //BA.debugLineNum = 57;BA.debugLine="Label.SetSubHeading(b)";
_label._setsubheading /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settag(String _size) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetTag(size As String) As VMLabel";
 //BA.debugLineNum = 109;BA.debugLine="Label.SetTag(size)";
_label._settag /*b4j.example.vmelement*/ (_size);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settext(String _t) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetText(t As String) As VMLabel";
 //BA.debugLineNum = 94;BA.debugLine="Label.SetText(t)";
_label._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settitle(boolean _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetTitle(b As Boolean) As VMLabel";
 //BA.debugLineNum = 42;BA.debugLine="Label.SetTitle(b)";
_label._settitle /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settransparent(boolean _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetTransparent(b As Boolean) As VMLabel";
 //BA.debugLineNum = 47;BA.debugLine="Label.SetTransparent(b)";
_label._settransparent /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setverticalalignmiddle() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetVerticalAlignMiddle As VMLabel";
 //BA.debugLineNum = 52;BA.debugLine="Label.SetVerticalAlignMiddle";
_label._setverticalalignmiddle /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVShow(vif As String) As VMLabel";
 //BA.debugLineNum = 82;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
 //BA.debugLineNum = 83;BA.debugLine="Label.SetVShow(vif)";
_label._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 181;BA.debugLine="Return Label.tostring";
if (true) return _label._tostring /*String*/ ();
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
