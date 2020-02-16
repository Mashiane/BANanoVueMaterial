package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmspeeddial extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmspeeddial", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmspeeddial.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _speeddial = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _target = null;
public b4j.example.vmelement _content = null;
public boolean _hasbuttons = false;
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
public b4j.example.vmspeeddial  _addbutton(String _btnid,String _btnicon) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 60;BA.debugLine="Sub AddButton(btnID As String, btnIcon As String)";
 //BA.debugLineNum = 61;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 62;BA.debugLine="btn.Initialize(vue,btnID,module).SetIcon(btnIcon)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module)._seticon /*b4j.example.vmbutton*/ (_btnicon)._seticonbutton /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 63;BA.debugLine="btn.Pop(content)";
_btn._pop /*String*/ (_content);
 //BA.debugLineNum = 64;BA.debugLine="hasButtons = True";
_hasbuttons = __c.True;
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 86;BA.debugLine="Sub AddChild(child As VMElement) As VMSpeedDial";
 //BA.debugLineNum = 87;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="SpeedDial.SetText(childHTML)";
_speeddial._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 123;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 124;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 125;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub AddClass(c As String) As VMSpeedDial";
 //BA.debugLineNum = 106;BA.debugLine="SpeedDial.AddClass(c)";
_speeddial._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 238;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SpeedDial As VMElement";
_speeddial = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private target As VMElement";
_target = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Private content As VMElement";
_content = new b4j.example.vmelement();
 //BA.debugLineNum = 9;BA.debugLine="Private hasButtons As Boolean";
_hasbuttons = false;
 //BA.debugLineNum = 10;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 17;BA.debugLine="SpeedDial.Initialize(v, ID).SetTag(\"md-speed-dial";
_speeddial._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("md-speed-dial");
 //BA.debugLineNum = 18;BA.debugLine="target.Initialize(v,\"\").SetTag(\"md-speed-dial-tar";
_target._initialize /*b4j.example.vmelement*/ (ba,_v,"")._settag /*b4j.example.vmelement*/ ("md-speed-dial-target")._setripple /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 19;BA.debugLine="content.Initialize(v,\"\").SetTag(\"md-speed-dial-co";
_content._initialize /*b4j.example.vmelement*/ (ba,_v,"")._settag /*b4j.example.vmelement*/ ("md-speed-dial-content");
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="hasButtons = False";
_hasbuttons = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="SpeedDial.SetOnClick(eventHandler, $\"${ID}_click\"";
_speeddial._setonclick /*b4j.example.vmelement*/ (_eventhandler,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 100;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub Render";
 //BA.debugLineNum = 82;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetAccent(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 40;BA.debugLine="target.AddClass(\"md-accent\")";
_target._addclass /*b4j.example.vmelement*/ ("md-accent");
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetAttr(attr As Map) As VMSpeedDial";
 //BA.debugLineNum = 112;BA.debugLine="SpeedDial.SetAttr(attr)";
_speeddial._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdirection(Object _vardirection) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetDirection(varDirection As Object) As VMSpee";
 //BA.debugLineNum = 137;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", varDire";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-direction",BA.ObjectToString(_vardirection));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdirectionbottom(boolean _b) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetDirectionBottom(b As Boolean) As VMSpeedDia";
 //BA.debugLineNum = 149;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", \"bottom";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-direction","bottom");
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdirectiontop(boolean _b) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetDirectionTop(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 143;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", \"top\")";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-direction","top");
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteffect(Object _vareffect) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetEffect(varEffect As Object) As VMSpeedDial";
 //BA.debugLineNum = 155;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", varEffect)";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-effect",BA.ObjectToString(_vareffect));
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteffectfling(boolean _b) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetEffectFling(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 161;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"fling\")";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-effect","fling");
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteffectopacity(boolean _b) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetEffectOpacity(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 173;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"opacity\")";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-effect","opacity");
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteffectscale(boolean _b) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetEffectScale(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 167;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"scale\")";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-effect","scale");
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setevent(Object _varevent) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetEvent(varEvent As Object) As VMSpeedDial";
 //BA.debugLineNum = 179;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", varEvent)";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-event",BA.ObjectToString(_varevent));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteventclick(boolean _b) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetEventClick(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 191;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", \"click\")";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-event","click");
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteventhover(boolean _b) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetEventHover(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 185;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", \"hover\")";
_speeddial._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ ("md-event","hover");
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setfinalicon(String _i) throws Exception{
b4j.example.vmicon _icn = null;
 //BA.debugLineNum = 44;BA.debugLine="Sub SetFinalIcon(i As String) As VMSpeedDial";
 //BA.debugLineNum = 45;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
 //BA.debugLineNum = 46;BA.debugLine="icn.Initialize(vue,$\"${ID}finalicon\"$).SetText(i)";
_icn._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"finalicon"))._settext /*b4j.example.vmicon*/ (_i)._addclass /*b4j.example.vmicon*/ ("md-morph-final");
 //BA.debugLineNum = 47;BA.debugLine="icn.Pop(target)";
_icn._pop /*String*/ (_target);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seticon(String _i) throws Exception{
b4j.example.vmicon _icn = null;
 //BA.debugLineNum = 52;BA.debugLine="Sub SetIcon(i As String) As VMSpeedDial";
 //BA.debugLineNum = 53;BA.debugLine="If i = \"\" Then Return Me";
if ((_i).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
 //BA.debugLineNum = 54;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
 //BA.debugLineNum = 55;BA.debugLine="icn.Initialize(vue,$\"${ID}icon\"$).SetText(i)";
_icn._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"))._settext /*b4j.example.vmicon*/ (_i);
 //BA.debugLineNum = 56;BA.debugLine="icn.Pop(target)";
_icn._pop /*String*/ (_target);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setinitialicon(String _i) throws Exception{
b4j.example.vmicon _icn = null;
 //BA.debugLineNum = 27;BA.debugLine="Sub SetInitialIcon(i As String) As VMSpeedDial";
 //BA.debugLineNum = 28;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
 //BA.debugLineNum = 29;BA.debugLine="icn.Initialize(vue,$\"${ID}initicon\"$).SetText(i).";
_icn._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"initicon"))._settext /*b4j.example.vmicon*/ (_i)._addclass /*b4j.example.vmicon*/ ("md-morph-initial");
 //BA.debugLineNum = 30;BA.debugLine="icn.Pop(target)";
_icn._pop /*String*/ (_target);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetPadding(p As Object) As VMSpeedDial";
 //BA.debugLineNum = 131;BA.debugLine="SpeedDial.SetPaddingAll(p)";
_speeddial._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositionbottomcenter(boolean _b) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetPositionBottomCenter(b As Boolean) As VMSpe";
 //BA.debugLineNum = 221;BA.debugLine="AddClass(\"md-bottom-center\")";
_addclass("md-bottom-center");
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositionbottomleft(boolean _b) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetPositionBottomLeft(b As Boolean) As VMSpeed";
 //BA.debugLineNum = 227;BA.debugLine="AddClass(\"md-bottom-left\")";
_addclass("md-bottom-left");
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositionbottomright(boolean _b) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetPositionBottomRight(b As Boolean) As VMSpee";
 //BA.debugLineNum = 215;BA.debugLine="AddClass(\"md-bottom-right\")";
_addclass("md-bottom-right");
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositionfixed(boolean _b) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetPositionFixed(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 233;BA.debugLine="AddClass(\"md-fixed\")";
_addclass("md-fixed");
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositiontopcenter(boolean _b) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetPositionTopCenter(b As Boolean) As VMSpeedD";
 //BA.debugLineNum = 203;BA.debugLine="AddClass(\"md-top-center\")";
_addclass("md-top-center");
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositiontopleft(boolean _b) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetPositionTopLeft(b As Boolean) As VMSpeedDia";
 //BA.debugLineNum = 209;BA.debugLine="AddClass(\"md-top-left\")";
_addclass("md-top-left");
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositiontopright(boolean _b) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetPositionTopRight(b As Boolean) As VMSpeedDi";
 //BA.debugLineNum = 197;BA.debugLine="AddClass(\"md-top-right\")";
_addclass("md-top-right");
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSpeedDial";
 //BA.debugLineNum = 35;BA.debugLine="target.AddClass(\"md-primary\")";
_target._addclass /*b4j.example.vmelement*/ ("md-primary");
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetStyle(sm As Map) As VMSpeedDial";
 //BA.debugLineNum = 118;BA.debugLine="SpeedDial.SetStyle(sm)";
_speeddial._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetText(t As Object) As VMSpeedDial";
 //BA.debugLineNum = 94;BA.debugLine="SpeedDial.SetText(t)";
_speeddial._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetVModel(k As String) As VMSpeedDial";
 //BA.debugLineNum = 76;BA.debugLine="SpeedDial.SetVModel(k)";
_speeddial._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 70;BA.debugLine="target.Pop(SpeedDial)";
_target._pop /*String*/ (_speeddial);
 //BA.debugLineNum = 71;BA.debugLine="If hasButtons Then content.Pop(SpeedDial)";
if (_hasbuttons) { 
_content._pop /*String*/ (_speeddial);};
 //BA.debugLineNum = 72;BA.debugLine="Return SpeedDial.ToString";
if (true) return _speeddial._tostring /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
