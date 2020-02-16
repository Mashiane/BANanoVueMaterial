package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmnumberinput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmnumberinput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmnumberinput.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _numberinput = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _div = null;
public b4j.example.vmelement _lbl = null;
public String _mdl = "";
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
public b4j.example.vmnumberinput  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub AddClass(c As String) As VMNumberInput";
 //BA.debugLineNum = 107;BA.debugLine="NumberInput.AddClass(c)";
_numberinput._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public NumberInput As VMElement";
_numberinput = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private div As VMElement";
_div = new b4j.example.vmelement();
 //BA.debugLineNum = 8;BA.debugLine="Private lbl As VMElement";
_lbl = new b4j.example.vmelement();
 //BA.debugLineNum = 9;BA.debugLine="Private mdl As String";
_mdl = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnumberinput  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="BANano.DependsOnAsset(\"vue-number-input.js\")";
_banano.DependsOnAsset("vue-number-input.js");
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 17;BA.debugLine="div.Initialize(vue, $\"${ID}\"$).SetTag(\"div\")";
_div._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+""))._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 18;BA.debugLine="lbl.Initialize(vue,$\"${ID}lbl\"$).SetTag(\"label\")";
_lbl._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"lbl"))._settag /*b4j.example.vmelement*/ ("label");
 //BA.debugLineNum = 19;BA.debugLine="lbl.SetStyle(CreateMap(\"pointer-events\": \"auto\",";
_lbl._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("pointer-events"),(Object)("auto"),(Object)("top"),(Object)("0"),(Object)("opacity"),(Object)("1"),(Object)("font-size"),(Object)("12px")}));
 //BA.debugLineNum = 20;BA.debugLine="NumberInput.Initialize(vue, ID).SetTag(\"number-in";
_numberinput._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("number-input");
 //BA.debugLineNum = 21;BA.debugLine="mdl = \"\"";
_mdl = "";
 //BA.debugLineNum = 22;BA.debugLine="SetCenter(True)";
_setcenter(__c.True);
 //BA.debugLineNum = 23;BA.debugLine="SetControls(True)";
_setcontrols(__c.True);
 //BA.debugLineNum = 24;BA.debugLine="SetInputable(False)";
_setinputable(__c.False);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 173;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub Render";
 //BA.debugLineNum = 169;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnumberinput  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetAttr(attr As Map) As VMNumberInput";
 //BA.debugLineNum = 113;BA.debugLine="NumberInput.SetAttr(attr)";
_numberinput._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setcenter(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetCenter(b As Boolean) As VMNumberInput";
 //BA.debugLineNum = 36;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 37;BA.debugLine="SetAttr(CreateMap(\":center\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":center"),(Object)(_b)}));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setcontrols(boolean _b) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetControls(b As Boolean) As VMNumberInput";
 //BA.debugLineNum = 29;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 30;BA.debugLine="SetAttr(CreateMap(\":controls\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":controls"),(Object)(_b)}));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetDisabled(b As Boolean) As VMNumberInput";
 //BA.debugLineNum = 100;BA.debugLine="NumberInput.SetDisabled(b)";
_numberinput._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setid(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
 //BA.debugLineNum = 95;BA.debugLine="NumberInput.SetID(varName, bind)";
_numberinput._setid /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setinline(boolean _b) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetInline(b As Boolean) As VMNumberInput";
 //BA.debugLineNum = 42;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 43;BA.debugLine="SetAttr(CreateMap(\":inline\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":inline"),(Object)(_b)}));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setinputable(boolean _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetInputable(b As Boolean) As VMNumberInput";
 //BA.debugLineNum = 54;BA.debugLine="If b = True Then Return Me";
if (_b==__c.True) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 55;BA.debugLine="SetAttr(CreateMap(\":inputtable\": b))";
_setattr(__c.createMap(new Object[] {(Object)(":inputtable"),(Object)(_b)}));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setlabel(String _t) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetLabel(t As String) As VMNumberInput";
 //BA.debugLineNum = 76;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 77;BA.debugLine="lbl.SetText(t)";
_lbl._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setmax(String _mx) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub SetMax(mx As String) As VMNumberInput";
 //BA.debugLineNum = 130;BA.debugLine="If mx = \"\" Then Return Me";
if ((_mx).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 131;BA.debugLine="SetAttr(CreateMap(\":max\": mx))";
_setattr(__c.createMap(new Object[] {(Object)(":max"),(Object)(_mx)}));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setmin(String _mn) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetMin(mn As String) As VMNumberInput";
 //BA.debugLineNum = 136;BA.debugLine="If mn = \"\" Then Return Me";
if ((_mn).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 137;BA.debugLine="SetAttr(CreateMap(\":min\": mn))";
_setattr(__c.createMap(new Object[] {(Object)(":min"),(Object)(_mn)}));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 89;BA.debugLine="NumberInput.SetName(varName, bind)";
_numberinput._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMNumberInput";
 //BA.debugLineNum = 48;BA.debugLine="If b = True Then Return Me";
if (_b==__c.True) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 49;BA.debugLine="SetAttr(CreateMap(\":readonly\": b))";
_setattr(__c.createMap(new Object[] {(Object)(":readonly"),(Object)(_b)}));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setrounded(boolean _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetRounded(b As Boolean) As VMNumberInput";
 //BA.debugLineNum = 60;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 61;BA.debugLine="SetAttr(CreateMap(\"rounded\": b))";
_setattr(__c.createMap(new Object[] {(Object)("rounded"),(Object)(_b)}));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setsizelarge() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetSizeLarge As VMNumberInput";
 //BA.debugLineNum = 71;BA.debugLine="SetAttr(CreateMap(\"size\":\"large\"))";
_setattr(__c.createMap(new Object[] {(Object)("size"),(Object)("large")}));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setsizesmall() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetSizeSmall As VMNumberInput";
 //BA.debugLineNum = 66;BA.debugLine="SetAttr(CreateMap(\"size\":\"small\"))";
_setattr(__c.createMap(new Object[] {(Object)("size"),(Object)("small")}));
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setstep(String _stp) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetStep(stp As String) As VMNumberInput";
 //BA.debugLineNum = 157;BA.debugLine="If stp = \"\" Then Return Me";
if ((_stp).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 158;BA.debugLine="SetAttr(CreateMap(\":step\":stp))";
_setattr(__c.createMap(new Object[] {(Object)(":step"),(Object)(_stp)}));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetTabIndex(ti As String) As VMNumberInput";
 //BA.debugLineNum = 82;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 83;BA.debugLine="NumberInput.SetTabIndex(ti)";
_numberinput._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setvalue(String _vl) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetValue(vl As String) As VMNumberInput";
 //BA.debugLineNum = 149;BA.debugLine="If mdl = \"\" Then";
if ((_mdl).equals("")) { 
 //BA.debugLineNum = 150;BA.debugLine="Log(\"VMNumberInput: Set VModel first!\")";
__c.Log("VMNumberInput: Set VModel first!");
 };
 //BA.debugLineNum = 152;BA.debugLine="vue.SetStateSingle(mdl, vl)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_mdl,(Object)(_vl));
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetVIf(vif As String) As VMNumberInput";
 //BA.debugLineNum = 118;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 119;BA.debugLine="div.SetVIf(vif)";
_div._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetVModel(k As String) As VMNumberInput";
 //BA.debugLineNum = 142;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 143;BA.debugLine="mdl = k.tolowercase";
_mdl = _k.toLowerCase();
 //BA.debugLineNum = 144;BA.debugLine="NumberInput.SetVModel(k)";
_numberinput._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetVShow(vif As String) As VMNumberInput";
 //BA.debugLineNum = 124;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
 //BA.debugLineNum = 125;BA.debugLine="div.SetVShow(vif)";
_div._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 163;BA.debugLine="lbl.Pop(div)";
_lbl._pop /*String*/ (_div);
 //BA.debugLineNum = 164;BA.debugLine="NumberInput.Pop(div)";
_numberinput._pop /*String*/ (_div);
 //BA.debugLineNum = 165;BA.debugLine="Return div.tostring";
if (true) return _div._tostring /*String*/ ();
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
