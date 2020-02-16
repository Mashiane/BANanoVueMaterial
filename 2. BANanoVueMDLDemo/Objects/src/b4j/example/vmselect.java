package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmselect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmselect", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmselect.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _combo = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmfield _comboint = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public b4j.example.vmelement _et = null;
public com.ab.banano.BANano _banano = null;
public boolean _haserror = false;
public String _xname = "";
public String _xmodel = "";
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
public b4j.example.vmselect  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub AddChild(child As VMElement) As VMSelect";
 //BA.debugLineNum = 200;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 201;BA.debugLine="Combo.SetText(childHTML)";
_combo._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 228;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 229;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 230;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub AddClass(c As String) As VMSelect";
 //BA.debugLineNum = 45;BA.debugLine="Combo.AddClass(c)";
_combo._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _additem(String _k,String _v) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 76;BA.debugLine="Sub AddItem(k As String, v As String) As VMSelect";
 //BA.debugLineNum = 77;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 78;BA.debugLine="el.Initialize(vue,k).SetTag(\"md-option\").SetName(";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_k)._settag /*b4j.example.vmelement*/ ("md-option")._setname /*b4j.example.vmelement*/ (_k,__c.False)._setkey /*b4j.example.vmelement*/ ((Object)(_k),__c.False)._setvalue /*b4j.example.vmelement*/ (_k,__c.False)._settext /*b4j.example.vmelement*/ (_v);
 //BA.debugLineNum = 79;BA.debugLine="el.Pop(Combo)";
_el._pop /*String*/ (_combo);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _additem1(String _k,String _v,boolean _disabled) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 83;BA.debugLine="Sub AddItem1(k As String, v As String,disabled As";
 //BA.debugLineNum = 84;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 85;BA.debugLine="el.Initialize(vue,k).SetTag(\"md-option\").SetName(";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_k)._settag /*b4j.example.vmelement*/ ("md-option")._setname /*b4j.example.vmelement*/ (_k,__c.False)._setkey /*b4j.example.vmelement*/ ((Object)(_k),__c.False)._setvalue /*b4j.example.vmelement*/ (_k,__c.False)._settext /*b4j.example.vmelement*/ (_v)._setdisabled /*b4j.example.vmelement*/ (_disabled);
 //BA.debugLineNum = 86;BA.debugLine="el.Pop(Combo)";
_el._pop /*String*/ (_combo);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _additems(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub AddItems(m As Map) As VMSelect";
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
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 338;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Combo As VMElement";
_combo = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private ComboInt As VMField";
_comboint = new b4j.example.vmfield();
 //BA.debugLineNum = 7;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 8;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
 //BA.debugLineNum = 9;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="Private et As VMElement";
_et = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 12;BA.debugLine="Private hasError As Boolean";
_haserror = false;
 //BA.debugLineNum = 13;BA.debugLine="Private xname As String";
_xname = "";
 //BA.debugLineNum = 14;BA.debugLine="Private xmodel As String";
_xmodel = "";
 //BA.debugLineNum = 15;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
String _sval = "";
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 19;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="Combo.Initialize(vue, ID).SetTag(\"md-select\")";
_combo._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-select");
 //BA.debugLineNum = 23;BA.debugLine="ComboInt.Initialize(v, ID, $\"${ID}field\"$, module";
_comboint._initialize /*b4j.example.vmfield*/ (ba,_v,_id,(""+__c.SmartStringFormatter("",(Object)(_id))+"field"),_module);
 //BA.debugLineNum = 24;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_sid))+"label"));
 //BA.debugLineNum = 25;BA.debugLine="SetName(sid)";
_setname(_sid);
 //BA.debugLineNum = 26;BA.debugLine="hasHelp = False";
_hashelp = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="hasError = False";
_haserror = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="xname = \"\"";
_xname = "";
 //BA.debugLineNum = 29;BA.debugLine="xmodel = \"\"";
_xmodel = "";
 //BA.debugLineNum = 30;BA.debugLine="Dim sval As String";
_sval = "";
 //BA.debugLineNum = 31;BA.debugLine="SetOnSelected(sval)";
_setonselected(_sval);
 //BA.debugLineNum = 32;BA.debugLine="SetOnOpened";
_setonopened();
 //BA.debugLineNum = 33;BA.debugLine="SetOnClosed";
_setonclosed();
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 183;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub Render";
 //BA.debugLineNum = 179;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetAccent(b As Boolean) As VMSelect";
 //BA.debugLineNum = 217;BA.debugLine="Combo.SetAccent(True)";
_combo._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetAttr(attr As Map) As VMSelect";
 //BA.debugLineNum = 51;BA.debugLine="Combo.SetAttr(attr)";
_combo._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _setdatasource(String _sourcetable,String _sourcefield,String _displayfield) throws Exception{
int _intsel = 0;
String _krow = "";
String _drow = "";
b4j.example.vmelement _option = null;
 //BA.debugLineNum = 119;BA.debugLine="Sub SetDataSource(sourceTable As String, sourceFie";
 //BA.debugLineNum = 120;BA.debugLine="sourceTable = sourceTable.ToLowerCase";
_sourcetable = _sourcetable.toLowerCase();
 //BA.debugLineNum = 121;BA.debugLine="sourceField = sourceField.ToLowerCase";
_sourcefield = _sourcefield.toLowerCase();
 //BA.debugLineNum = 122;BA.debugLine="displayField = displayField.tolowercase";
_displayfield = _displayfield.toLowerCase();
 //BA.debugLineNum = 124;BA.debugLine="Dim intSel As Int = 0";
_intsel = (int) (0);
 //BA.debugLineNum = 125;BA.debugLine="If sourceTable <> \"\" Then intSel = BANano.parseIn";
if ((_sourcetable).equals("") == false) { 
_intsel = (int) (_banano.parseInt((Object)(_intsel))+1);};
 //BA.debugLineNum = 126;BA.debugLine="If sourceField <> \"\" Then intSel = BANano.parseIn";
if ((_sourcefield).equals("") == false) { 
_intsel = (int) (_banano.parseInt((Object)(_intsel))+1);};
 //BA.debugLineNum = 127;BA.debugLine="If displayField <> \"\" Then intSel = BANano.parseI";
if ((_displayfield).equals("") == false) { 
_intsel = (int) (_banano.parseInt((Object)(_intsel))+1);};
 //BA.debugLineNum = 129;BA.debugLine="If intSel = 3 Then";
if (_intsel==3) { 
 //BA.debugLineNum = 130;BA.debugLine="Dim kRow As String = $\"row.${sourceField}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
 //BA.debugLineNum = 131;BA.debugLine="Dim dRow As String = $\"row.${displayField}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
 //BA.debugLineNum = 132;BA.debugLine="Dim option As VMElement";
_option = new b4j.example.vmelement();
 //BA.debugLineNum = 133;BA.debugLine="option.Initialize(vue,\"\")";
_option._initialize /*b4j.example.vmelement*/ (ba,_vue,"");
 //BA.debugLineNum = 134;BA.debugLine="option.SetTag(\"md-option\")";
_option._settag /*b4j.example.vmelement*/ ("md-option");
 //BA.debugLineNum = 135;BA.debugLine="option.SetVFor(\"row\", sourceTable)";
_option._setvfor /*b4j.example.vmelement*/ ("row",_sourcetable);
 //BA.debugLineNum = 138;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
_option._setvalue /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
 //BA.debugLineNum = 140;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
_option._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
 //BA.debugLineNum = 141;BA.debugLine="option.Pop(Combo)";
_option._pop /*String*/ (_combo);
 };
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _setdense(boolean _vardense) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetDense(varDense As Boolean) As VMSelect";
 //BA.debugLineNum = 296;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 297;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
if (_vardense) { 
_setattr(__c.createMap(new Object[] {(Object)(":md-dense"),(Object)(_vardense)}));};
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSelect";
 //BA.debugLineNum = 263;BA.debugLine="Combo.SetDisabled(b)";
_combo._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _seterrortext(String _txt) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetErrorText(txt As String) As VMSelect";
 //BA.debugLineNum = 154;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 155;BA.debugLine="hasError = True";
_haserror = __c.True;
 //BA.debugLineNum = 156;BA.debugLine="et = Combo.SetErrorText(txt)";
_et = _combo._seterrortext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _sethelpertext(String _t) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub SetHelperText(t As String) As VMSelect";
 //BA.debugLineNum = 147;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 148;BA.debugLine="hasHelp = True";
_hashelp = __c.True;
 //BA.debugLineNum = 149;BA.debugLine="ht = Combo.SetHelperText(t)";
_ht = _combo._sethelpertext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setid(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
 //BA.debugLineNum = 277;BA.debugLine="Combo.SetID(varName, bind)";
_combo._setid /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setlabel(Object _l) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetLabel(l As Object) As VMSelect";
 //BA.debugLineNum = 64;BA.debugLine="lbl.SetText(l)";
_lbl._settext /*b4j.example.vmlabel*/ (BA.ObjectToString(_l));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setmultiple(boolean _varmultiple) throws Exception{
anywheresoftware.b4a.objects.collections.List _nlist = null;
 //BA.debugLineNum = 282;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMSelec";
 //BA.debugLineNum = 283;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 284;BA.debugLine="If xmodel = \"\" Then";
if ((_xmodel).equals("")) { 
 //BA.debugLineNum = 285;BA.debugLine="Log($\"VMSelect.SetMultiple.${ID} - vmodel is not";
__c.Log(("VMSelect.SetMultiple."+__c.SmartStringFormatter("",(Object)(_id))+" - vmodel is not set!"));
 };
 //BA.debugLineNum = 287;BA.debugLine="Dim nList As List";
_nlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 288;BA.debugLine="nList.Initialize";
_nlist.Initialize();
 //BA.debugLineNum = 289;BA.debugLine="vue.SetStateSingle(xmodel, nList)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_xmodel,(Object)(_nlist.getObject()));
 //BA.debugLineNum = 290;BA.debugLine="SetAttr(CreateMap(\":multiple\": varMultiple))";
_setattr(__c.createMap(new Object[] {(Object)(":multiple"),(Object)(_varmultiple)}));
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setname(String _varname) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="private Sub SetName(varName As String) As VMSelect";
 //BA.debugLineNum = 269;BA.debugLine="varName = varName.tolowercase";
_varname = _varname.toLowerCase();
 //BA.debugLineNum = 270;BA.debugLine="xname = varName";
_xname = _varname;
 //BA.debugLineNum = 271;BA.debugLine="Combo.SetName(varName, False)";
_combo._setname /*b4j.example.vmelement*/ (_varname,__c.False);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonclosed() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 325;BA.debugLine="private Sub SetOnClosed As VMSelect";
 //BA.debugLineNum = 326;BA.debugLine="Dim methodName As String  = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_closed");
 //BA.debugLineNum = 327;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 328;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 329;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 330;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
 //BA.debugLineNum = 332;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonopened() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 313;BA.debugLine="private Sub SetOnOpened As VMSelect";
 //BA.debugLineNum = 314;BA.debugLine="Dim methodName As String = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_opened");
 //BA.debugLineNum = 315;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 316;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 317;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 318;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
 //BA.debugLineNum = 320;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonselected(String _value) throws Exception{
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 302;BA.debugLine="private Sub SetOnSelected(value As String) As VMSe";
 //BA.debugLineNum = 303;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 304;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 305;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value)}))));
 //BA.debugLineNum = 306;BA.debugLine="SetAttr(CreateMap(\"v-on:md-selected\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-selected"),(Object)(_methodname)}));
 //BA.debugLineNum = 308;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public String  _setoptions(String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _krow = "";
String _drow = "";
b4j.example.vmelement _option = null;
 //BA.debugLineNum = 90;BA.debugLine="Sub SetOptions(sourceName As String, options As Ma";
 //BA.debugLineNum = 91;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
 //BA.debugLineNum = 92;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 93;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 94;BA.debugLine="For Each k As String In options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _options.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 95;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
 //BA.debugLineNum = 96;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 97;BA.debugLine="nrec.Put(sourcefield, k)";
_nrec.Put((Object)(_sourcefield),(Object)(_k));
 //BA.debugLineNum = 98;BA.debugLine="nrec.Put(displayfield, v)";
_nrec.Put((Object)(_displayfield),(Object)(_v));
 //BA.debugLineNum = 99;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 102;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_sourcename,(Object)(_recs.getObject()));
 //BA.debugLineNum = 103;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
 //BA.debugLineNum = 104;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
 //BA.debugLineNum = 106;BA.debugLine="Dim option As VMElement";
_option = new b4j.example.vmelement();
 //BA.debugLineNum = 107;BA.debugLine="option.Initialize(vue,\"\")";
_option._initialize /*b4j.example.vmelement*/ (ba,_vue,"");
 //BA.debugLineNum = 108;BA.debugLine="option.SetTag(\"md-option\")";
_option._settag /*b4j.example.vmelement*/ ("md-option");
 //BA.debugLineNum = 109;BA.debugLine="option.SetVFor(\"row\", sourceName)";
_option._setvfor /*b4j.example.vmelement*/ ("row",_sourcename);
 //BA.debugLineNum = 112;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
_option._setvalue /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
 //BA.debugLineNum = 114;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
_option._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
 //BA.debugLineNum = 115;BA.debugLine="option.Pop(Combo)";
_option._pop /*String*/ (_combo);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetPadding(p As Object) As VMSelect";
 //BA.debugLineNum = 236;BA.debugLine="Combo.SetPaddingAll(p)";
_combo._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setplaceholder(String _varplaceholder) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 242;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 243;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
_setattr(__c.createMap(new Object[] {(Object)("placeholder"),(Object)(_varplaceholder)}));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSelect";
 //BA.debugLineNum = 212;BA.debugLine="Combo.SetPrimary(True)";
_combo._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMSelec";
 //BA.debugLineNum = 249;BA.debugLine="Combo.SetRequired(varRequired)";
_combo._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetStyle(sm As Map) As VMSelect";
 //BA.debugLineNum = 223;BA.debugLine="Combo.SetStyle(sm)";
_combo._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetTabIndex(ti As String) As VMSelect";
 //BA.debugLineNum = 38;BA.debugLine="Combo.SetTabIndex(ti)";
_combo._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetText(t As Object) As VMSelect";
 //BA.debugLineNum = 207;BA.debugLine="Combo.SetText(t)";
_combo._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvalue(String _valx) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetValue(valx As String) As VMSelect";
 //BA.debugLineNum = 254;BA.debugLine="If xmodel = \"\" Then";
if ((_xmodel).equals("")) { 
 //BA.debugLineNum = 255;BA.debugLine="Log($\"VMSelect.SetValue.${ID} - vmodel is not se";
__c.Log(("VMSelect.SetValue."+__c.SmartStringFormatter("",(Object)(_id))+" - vmodel is not set!"));
 };
 //BA.debugLineNum = 257;BA.debugLine="vue.SetStateSingle(xmodel, valx)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_xmodel,(Object)(_valx));
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetVIf(vif As String) As VMSelect";
 //BA.debugLineNum = 187;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 188;BA.debugLine="ComboInt.SetVIf(vif)";
_comboint._setvif /*b4j.example.vmfield*/ ((Object)(_vif));
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetVModel(k As String) As VMSelect";
 //BA.debugLineNum = 57;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 58;BA.debugLine="xmodel = k";
_xmodel = _k;
 //BA.debugLineNum = 59;BA.debugLine="Combo.SetVModel(k)";
_combo._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetVShow(vif As String) As VMSelect";
 //BA.debugLineNum = 193;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
 //BA.debugLineNum = 194;BA.debugLine="ComboInt.SetVShow(vif)";
_comboint._setvshow /*b4j.example.vmfield*/ ((Object)(_vif));
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 161;BA.debugLine="If xname = \"\" Then";
if ((_xname).equals("")) { 
 //BA.debugLineNum = 162;BA.debugLine="Log($\"VMSelect.ToString.${ID} - name is not set!";
__c.Log(("VMSelect.ToString."+__c.SmartStringFormatter("",(Object)(_id))+" - name is not set!"));
 };
 //BA.debugLineNum = 164;BA.debugLine="If xmodel = \"\" Then";
if ((_xmodel).equals("")) { 
 //BA.debugLineNum = 165;BA.debugLine="Log($\"VMSelect.ToString.${ID} - model is not set";
__c.Log(("VMSelect.ToString."+__c.SmartStringFormatter("",(Object)(_id))+" - model is not set!"));
 };
 //BA.debugLineNum = 167;BA.debugLine="lbl.Pop(ComboInt.Field)";
_lbl._pop /*String*/ (_comboint._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 168;BA.debugLine="Combo.Pop(ComboInt.Field)";
_combo._pop /*String*/ (_comboint._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 169;BA.debugLine="If hasHelp Then";
if (_hashelp) { 
 //BA.debugLineNum = 170;BA.debugLine="ht.Pop(ComboInt.Field)";
_ht._pop /*String*/ (_comboint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 172;BA.debugLine="If hasError Then";
if (_haserror) { 
 //BA.debugLineNum = 173;BA.debugLine="et.Pop(ComboInt.Field)";
_et._pop /*String*/ (_comboint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 175;BA.debugLine="Return ComboInt.tostring";
if (true) return _comboint._tostring /*String*/ ();
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
