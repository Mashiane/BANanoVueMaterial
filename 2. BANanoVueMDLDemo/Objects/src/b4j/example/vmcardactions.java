package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcardactions extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcardactions", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcardactions.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _cardactions = null;
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
public b4j.example.vmcardactions  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub AddChild(child As VMElement) As VMCardActions";
 //BA.debugLineNum = 45;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="CardActions.SetText(childHTML)";
_cardactions._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
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
public b4j.example.vmcardactions  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub AddClass(c As String) As VMCardActions";
 //BA.debugLineNum = 63;BA.debugLine="CardActions.AddClass(c)";
_cardactions._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public CardActions As VMElement";
_cardactions = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardactions  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="CardActions.Initialize(v, ID)";
_cardactions._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 13;BA.debugLine="CardActions.SetTag(\"md-card-actions\")";
_cardactions._settag /*b4j.example.vmelement*/ ("md-card-actions");
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
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
public b4j.example.vmcardactions  _setalignment(Object _varalignment) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetAlignment(varAlignment As Object) As VMCard";
 //BA.debugLineNum = 94;BA.debugLine="SetAttr(CreateMap(\"md-alignment\": varAlignment))";
_setattr(__c.createMap(new Object[] {(Object)("md-alignment"),_varalignment}));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetAttr(attr As Map) As VMCardActions";
 //BA.debugLineNum = 69;BA.debugLine="CardActions.SetAttr(attr)";
_cardactions._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetPadding(p As Object) As VMCardActions";
 //BA.debugLineNum = 88;BA.debugLine="CardActions.SetPaddingAll(p)";
_cardactions._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetStyle(sm As Map) As VMCardActions";
 //BA.debugLineNum = 75;BA.debugLine="CardActions.SetStyle(sm)";
_cardactions._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetText(t As Object) As VMCardActions";
 //BA.debugLineNum = 52;BA.debugLine="CardActions.SetText(t)";
_cardactions._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetVIf(vif As Object) As VMCardActions";
 //BA.debugLineNum = 29;BA.debugLine="CardActions.SetVIf(vif)";
_cardactions._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetVModel(k As String) As VMCardActions";
 //BA.debugLineNum = 24;BA.debugLine="CardActions.SetVModel(k)";
_cardactions._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetVShow(vif As Object) As VMCardActions";
 //BA.debugLineNum = 34;BA.debugLine="CardActions.SetVShow(vif)";
_cardactions._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 20;BA.debugLine="Return CardActions.ToString";
if (true) return _cardactions._tostring /*String*/ ();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
