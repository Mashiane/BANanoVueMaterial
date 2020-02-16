package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcheckboxgroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcheckboxgroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcheckboxgroup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _checkgroup = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmlabel _lbl = null;
public com.ab.banano.BANano _banano = null;
public String _vmodel = "";
public Object _module = null;
public boolean _designmode = false;
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
public b4j.example.vmcheckboxgroup  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub AddChild(child As VMElement) As VMCheckBoxGrou";
 //BA.debugLineNum = 117;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 118;BA.debugLine="CheckGroup.SetText(childHTML)";
_checkgroup._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 129;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 130;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 131;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckboxgroup  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub AddClass(c As String) As VMCheckBoxGroup";
 //BA.debugLineNum = 48;BA.debugLine="CheckGroup.AddClass(c)";
_checkgroup._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _additem(String _k,String _v) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 74;BA.debugLine="Sub AddItem(k As String, v As String) As VMCheckBo";
 //BA.debugLineNum = 75;BA.debugLine="If vmodel = \"\" Then";
if ((_vmodel).equals("")) { 
 //BA.debugLineNum = 76;BA.debugLine="Log($\"VMCheckBoxGroup.AddItem: '${ID}' - the vMo";
__c.Log(("VMCheckBoxGroup.AddItem: '"+__c.SmartStringFormatter("",(Object)(_id))+"' - the vModel has not been set!"));
 };
 //BA.debugLineNum = 78;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 79;BA.debugLine="el.Initialize(vue, k,module)";
_el._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_k,_module);
 //BA.debugLineNum = 80;BA.debugLine="If designMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 81;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmcheckbox*/ (_vmodel);
 };
 //BA.debugLineNum = 83;BA.debugLine="el.SetText(v)";
_el._settext /*b4j.example.vmcheckbox*/ (_v);
 //BA.debugLineNum = 84;BA.debugLine="el.SetValue(k)";
_el._setvalue /*b4j.example.vmcheckbox*/ ((Object)(_k));
 //BA.debugLineNum = 85;BA.debugLine="el.SetPrimary(True)";
_el._setprimary /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 86;BA.debugLine="el.SetOnChange(ID)";
_el._setonchange /*b4j.example.vmcheckbox*/ (_id);
 //BA.debugLineNum = 87;BA.debugLine="el.Pop(CheckGroup)";
_el._pop /*String*/ (_checkgroup);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _additems(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 66;BA.debugLine="Sub AddItems(m As Map) As VMCheckBoxGroup";
 //BA.debugLineNum = 67;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 68;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 69;BA.debugLine="AddItem(k, v)";
_additem(_k,BA.ObjectToString(_v));
 }
};
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 143;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private CheckGroup As VMElement";
_checkgroup = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 9;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Private designMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckboxgroup  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _caption,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 17;BA.debugLine="CheckGroup.Initialize(vue, ID).SetTag(\"div\")";
_checkgroup._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 18;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$).SetText($\"${";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_sid))+"label"))._settext /*b4j.example.vmlabel*/ ((""+__c.SmartStringFormatter("",(Object)(_caption))+"<br/>"))._setcaption /*b4j.example.vmlabel*/ (__c.True);
 //BA.debugLineNum = 19;BA.debugLine="lbl.Pop(CheckGroup)";
_lbl._pop /*String*/ (_checkgroup);
 //BA.debugLineNum = 20;BA.debugLine="designMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 95;BA.debugLine="Sub Render";
 //BA.debugLineNum = 96;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckboxgroup  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetAttr(attr As Map) As VMCheckBoxGroup";
 //BA.debugLineNum = 54;BA.debugLine="CheckGroup.SetAttr(attr)";
_checkgroup._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCheckBoxGroup";
 //BA.debugLineNum = 26;BA.debugLine="designMode = b";
_designmode = _b;
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetDisabled(b As Boolean) As VMCheckBoxGroup";
 //BA.debugLineNum = 136;BA.debugLine="CheckGroup.SetDisabled(b)";
_checkgroup._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetStyle(sm As Map) As VMCheckBoxGroup";
 //BA.debugLineNum = 124;BA.debugLine="CheckGroup.SetStyle(sm)";
_checkgroup._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetTabIndex(ti As String) As VMCheckBoxGroup";
 //BA.debugLineNum = 42;BA.debugLine="CheckGroup.SetTabIndex(ti)";
_checkgroup._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setvalue(Object _v) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 30;BA.debugLine="Sub SetValue(v As Object) As VMCheckBoxGroup";
 //BA.debugLineNum = 31;BA.debugLine="If vmodel = \"\" Then";
if ((_vmodel).equals("")) { 
 //BA.debugLineNum = 32;BA.debugLine="Log($\"VMCheckBoxGroup.SetValue: '${ID}' - the vM";
__c.Log(("VMCheckBoxGroup.SetValue: '"+__c.SmartStringFormatter("",(Object)(_id))+"' - the vModel has not been set!"));
 };
 //BA.debugLineNum = 34;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="nl.Add(v)";
_nl.Add(_v);
 //BA.debugLineNum = 37;BA.debugLine="vue.SetStateSingle(vmodel,nl)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_nl.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetVIf(vif As String) As VMCheckBoxGroup";
 //BA.debugLineNum = 104;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmcheckboxgroup)(this);};
 //BA.debugLineNum = 105;BA.debugLine="CheckGroup.SetVIf(vif)";
_checkgroup._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setvmodel(String _k) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 58;BA.debugLine="Sub SetVModel(k As String) As VMCheckBoxGroup";
 //BA.debugLineNum = 59;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 60;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 61;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 62;BA.debugLine="vue.SetStateSingle(vmodel,nl)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_nl.getObject()));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetVShow(vif As String) As VMCheckBoxGroup";
 //BA.debugLineNum = 110;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmcheckboxgroup)(this);};
 //BA.debugLineNum = 111;BA.debugLine="CheckGroup.SetVShow(vif)";
_checkgroup._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 92;BA.debugLine="Return CheckGroup.tostring";
if (true) return _checkgroup._tostring /*String*/ ();
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
