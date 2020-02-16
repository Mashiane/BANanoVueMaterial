package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmmediacardcover extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmmediacardcover", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmmediacardcover.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _mediacardcover = null;
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
public b4j.example.vmmediacardcover  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub AddChild(child As VMElement) As VMMediaCardCov";
 //BA.debugLineNum = 45;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="MediaCardCover.SetText(childHTML)";
_mediacardcover._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 80;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 81;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 82;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmediacardcover  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub AddClass(c As String) As VMMediaCardCover";
 //BA.debugLineNum = 63;BA.debugLine="MediaCardCover.AddClass(c)";
_mediacardcover._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public MediaCardCover As VMElement";
_mediacardcover = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmediacardcover  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="MediaCardCover.Initialize(v, ID)";
_mediacardcover._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 13;BA.debugLine="MediaCardCover.SetTag(\"md-card-media-cover\")";
_mediacardcover._settag /*b4j.example.vmelement*/ ("md-card-media-cover");
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 58;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub Render";
 //BA.debugLineNum = 40;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmediacardcover  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetAttr(attr As Map) As VMMediaCardCover";
 //BA.debugLineNum = 69;BA.debugLine="MediaCardCover.SetAttr(attr)";
_mediacardcover._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetPadding(p As Object) As VMMediaCardCover";
 //BA.debugLineNum = 88;BA.debugLine="MediaCardCover.SetPaddingAll(p)";
_mediacardcover._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setsolid(boolean _varsolid) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetSolid(varSolid As Boolean) As VMMediaCardCo";
 //BA.debugLineNum = 100;BA.debugLine="SetAttr(CreateMap(\":md-solid\": varSolid))";
_setattr(__c.createMap(new Object[] {(Object)(":md-solid"),(Object)(_varsolid)}));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetStyle(sm As Map) As VMMediaCardCover";
 //BA.debugLineNum = 75;BA.debugLine="MediaCardCover.SetStyle(sm)";
_mediacardcover._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetText(t As Object) As VMMediaCardCover";
 //BA.debugLineNum = 52;BA.debugLine="MediaCardCover.SetText(t)";
_mediacardcover._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _settextscrim(boolean _vartext) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetTextScrim(varText As Boolean) As VMMediaCar";
 //BA.debugLineNum = 94;BA.debugLine="SetAttr(CreateMap(\":md-text-scrim\": varText))";
_setattr(__c.createMap(new Object[] {(Object)(":md-text-scrim"),(Object)(_vartext)}));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetVIf(vif As Object) As VMMediaCardCover";
 //BA.debugLineNum = 29;BA.debugLine="MediaCardCover.SetVIf(vif)";
_mediacardcover._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetVModel(k As String) As VMMediaCardCover";
 //BA.debugLineNum = 24;BA.debugLine="MediaCardCover.SetVModel(k)";
_mediacardcover._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetVShow(vif As Object) As VMMediaCardCover";
 //BA.debugLineNum = 34;BA.debugLine="MediaCardCover.SetVShow(vif)";
_mediacardcover._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 20;BA.debugLine="Return MediaCardCover.ToString";
if (true) return _mediacardcover._tostring /*String*/ ();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
