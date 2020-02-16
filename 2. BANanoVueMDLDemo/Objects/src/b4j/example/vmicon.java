package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmicon extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmicon", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmicon.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _icon = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
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
public b4j.example.vmicon  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub AddClass(c As String) As VMIcon";
 //BA.debugLineNum = 39;BA.debugLine="Icon.AddClass(c)";
_icon._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 18;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Icon As VMElement";
_icon = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Public hasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 12;BA.debugLine="Icon.Initialize(vue, ID).SetTag(\"md-icon\")";
_icon._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-icon");
 //BA.debugLineNum = 13;BA.debugLine="hasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 104;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Render";
 //BA.debugLineNum = 100;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetAttr(attr As Map) As VMIcon";
 //BA.debugLineNum = 64;BA.debugLine="Icon.SetAttr(attr)";
_icon._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setbottombaricon(boolean _b) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetBottomBarIcon(b As Boolean) As VMIcon";
 //BA.debugLineNum = 28;BA.debugLine="Icon.AddClass(\"md-bottom-bar-icon\")";
_icon._addclass /*b4j.example.vmelement*/ ("md-bottom-bar-icon");
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setfontawesome(String _fa) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetFontAwesome(fa As String) As VMIcon";
 //BA.debugLineNum = 45;BA.debugLine="AddClass(fa)";
_addclass(_fa);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setid(String _iid,boolean _bind) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMIco";
 //BA.debugLineNum = 81;BA.debugLine="Icon.setid(iID, bind)";
_icon._setid /*b4j.example.vmelement*/ (_iid,_bind);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMIcon";
 //BA.debugLineNum = 91;BA.debugLine="Icon.SetKey(k, bind)";
_icon._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setname(String _nam,boolean _bind) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMI";
 //BA.debugLineNum = 86;BA.debugLine="Icon.SetName(nam, bind)";
_icon._setname /*b4j.example.vmelement*/ (_nam,_bind);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setonclick(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetOnClick(module As Object, methodName As Str";
 //BA.debugLineNum = 23;BA.debugLine="Icon.SetOnClick(module, methodName)";
_icon._setonclick /*b4j.example.vmelement*/ (_module,_methodname);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetPrimary(b As Boolean) As VMIcon";
 //BA.debugLineNum = 70;BA.debugLine="Icon.SetPrimary(b)";
_icon._setprimary /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize2x(boolean _b) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetSize2x(b As Boolean) As VMIcon    'ignore";
 //BA.debugLineNum = 109;BA.debugLine="AddClass(\"md-size-2x\")";
_addclass("md-size-2x");
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize3x(boolean _b) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetSize3x(b As Boolean) As VMIcon    'ignore";
 //BA.debugLineNum = 115;BA.debugLine="AddClass(\"md-size-3x\")";
_addclass("md-size-3x");
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize4x(boolean _b) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetSize4x(b As Boolean) As VMIcon    'ignore";
 //BA.debugLineNum = 121;BA.debugLine="AddClass(\"md-size-4x\")";
_addclass("md-size-4x");
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize5x(boolean _b) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetSize5x(b As Boolean) As VMIcon    'ignore";
 //BA.debugLineNum = 127;BA.debugLine="AddClass(\"md-size-5x\")";
_addclass("md-size-5x");
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsrc(String _src) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetSrc(src As String) As VMIcon";
 //BA.debugLineNum = 33;BA.debugLine="SetAttr(CreateMap(\"md-src\": src))";
_setattr(__c.createMap(new Object[] {(Object)("md-src"),(Object)(_src)}));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _settext(String _t) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetText(t As String) As VMIcon";
 //BA.debugLineNum = 75;BA.debugLine="Icon.SetText(t)";
_icon._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 76;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetVIf(vif As Object) As VMIcon";
 //BA.debugLineNum = 50;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals((Object)(""))) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 51;BA.debugLine="Icon.SetVIf(vif)";
_icon._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetVShow(vif As Object) As VMIcon";
 //BA.debugLineNum = 56;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals((Object)(""))) { 
if (true) return (b4j.example.vmicon)(this);};
 //BA.debugLineNum = 57;BA.debugLine="Icon.SetVShow(vif)";
_icon._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 96;BA.debugLine="Return Icon.tostring";
if (true) return _icon._tostring /*String*/ ();
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
