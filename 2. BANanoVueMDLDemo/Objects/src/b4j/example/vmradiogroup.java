package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmradiogroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmradiogroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmradiogroup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _radiogroup = null;
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
public b4j.example.vmradiogroup  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 118;BA.debugLine="Sub AddChild(child As VMElement) As VMRadioGroup";
 //BA.debugLineNum = 119;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 120;BA.debugLine="RadioGroup.SetText(childHTML)";
_radiogroup._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 131;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 132;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 133;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub AddClass(c As String) As VMRadioGroup";
 //BA.debugLineNum = 53;BA.debugLine="RadioGroup.AddClass(c)";
_radiogroup._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _additem(String _k,String _v) throws Exception{
b4j.example.vmradio _el = null;
 //BA.debugLineNum = 76;BA.debugLine="Sub AddItem(k As String, v As String) As VMRadioGr";
 //BA.debugLineNum = 77;BA.debugLine="If vmodel = \"\" Then";
if ((_vmodel).equals("")) { 
 //BA.debugLineNum = 78;BA.debugLine="Log($\"VMRadioGroup.AddItem: '${ID}' - the vModel";
__c.Log(("VMRadioGroup.AddItem: '"+__c.SmartStringFormatter("",(Object)(_id))+"' - the vModel has not been set!"));
 };
 //BA.debugLineNum = 80;BA.debugLine="Dim el As VMRadio";
_el = new b4j.example.vmradio();
 //BA.debugLineNum = 81;BA.debugLine="el.Initialize(vue, k, module)";
_el._initialize /*b4j.example.vmradio*/ (ba,_vue,_k,_module);
 //BA.debugLineNum = 82;BA.debugLine="el.SetText(v)";
_el._settext /*b4j.example.vmradio*/ (_v);
 //BA.debugLineNum = 83;BA.debugLine="el.SetValue(k,False)";
_el._setvalue /*b4j.example.vmradio*/ ((Object)(_k),__c.False);
 //BA.debugLineNum = 84;BA.debugLine="el.SetPrimary(True)";
_el._setprimary /*b4j.example.vmradio*/ (__c.True);
 //BA.debugLineNum = 85;BA.debugLine="el.SetOnChange(ID)";
_el._setonchange /*b4j.example.vmradio*/ (_id);
 //BA.debugLineNum = 86;BA.debugLine="If designMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 87;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmradio*/ (_vmodel);
 };
 //BA.debugLineNum = 89;BA.debugLine="el.Pop(RadioGroup)";
_el._pop /*String*/ (_radiogroup);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _additems(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub AddItems(m As Map) As VMRadioGroup";
 //BA.debugLineNum = 69;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 70;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 71;BA.debugLine="AddItem(k, v)";
_additem(_k,BA.ObjectToString(_v));
 }
};
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 145;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private RadioGroup As VMElement";
_radiogroup = new b4j.example.vmelement();
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
 //BA.debugLineNum = 11;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _caption,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="RadioGroup.Initialize(vue, ID).SetTag(\"div\")";
_radiogroup._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 19;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$).SetText($\"${";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_sid))+"label"))._settext /*b4j.example.vmlabel*/ ((""+__c.SmartStringFormatter("",(Object)(_caption))+"<br/>"))._setcaption /*b4j.example.vmlabel*/ (__c.True);
 //BA.debugLineNum = 20;BA.debugLine="lbl.Pop(RadioGroup)";
_lbl._pop /*String*/ (_radiogroup);
 //BA.debugLineNum = 21;BA.debugLine="designMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 102;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Render";
 //BA.debugLineNum = 98;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetAttr(attr As Map) As VMRadioGroup";
 //BA.debugLineNum = 59;BA.debugLine="RadioGroup.SetAttr(attr)";
_radiogroup._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 34;BA.debugLine="designMode = b";
_designmode = _b;
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetDisabled(b As Boolean) As VMRadioGroup";
 //BA.debugLineNum = 138;BA.debugLine="RadioGroup.SetDisabled(b)";
_radiogroup._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public String  _setoptions(anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub SetOptions(options As Map)";
 //BA.debugLineNum = 27;BA.debugLine="For Each k As String In options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _options.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 28;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
 //BA.debugLineNum = 29;BA.debugLine="AddItem(k, v)";
_additem(_k,_v);
 }
};
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetStyle(sm As Map) As VMRadioGroup";
 //BA.debugLineNum = 126;BA.debugLine="RadioGroup.SetStyle(sm)";
_radiogroup._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetTabIndex(ti As String) As VMRadioGroup";
 //BA.debugLineNum = 47;BA.debugLine="RadioGroup.SetTabIndex(ti)";
_radiogroup._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvalue(Object _v) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetValue(v As Object) As VMRadioGroup";
 //BA.debugLineNum = 39;BA.debugLine="If vmodel = \"\" Then";
if ((_vmodel).equals("")) { 
 //BA.debugLineNum = 40;BA.debugLine="Log($\"VMRadioGroup.SetValue: '${ID}' - the vMode";
__c.Log(("VMRadioGroup.SetValue: '"+__c.SmartStringFormatter("",(Object)(_id))+"' - the vModel has not been set!"));
 };
 //BA.debugLineNum = 42;BA.debugLine="vue.SetStateSingle(vmodel,v)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,_v);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetVIf(vif As String) As VMRadioGroup";
 //BA.debugLineNum = 106;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 107;BA.debugLine="RadioGroup.SetVIf(vif)";
_radiogroup._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetVModel(k As String) As VMRadioGroup";
 //BA.debugLineNum = 64;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetVShow(vif As String) As VMRadioGroup";
 //BA.debugLineNum = 112;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
 //BA.debugLineNum = 113;BA.debugLine="RadioGroup.SetVShow(vif)";
_radiogroup._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 94;BA.debugLine="Return RadioGroup.tostring";
if (true) return _radiogroup._tostring /*String*/ ();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
