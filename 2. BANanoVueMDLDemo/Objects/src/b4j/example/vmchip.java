package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmchip extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmchip", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmchip.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _chip = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
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
public b4j.example.vmchip  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 53;BA.debugLine="Sub AddChild(child As VMElement) As VMChip";
 //BA.debugLineNum = 54;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 55;BA.debugLine="Chip.SetText(childHTML)";
_chip._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 102;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 103;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 104;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub AddClass(c As String) As VMChip";
 //BA.debugLineNum = 85;BA.debugLine="Chip.AddClass(c)";
_chip._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 200;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Chip As VMElement";
_chip = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="Chip.Initialize(v, ID)";
_chip._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 14;BA.debugLine="Chip.SetTag(\"md-chip\")";
_chip._settag /*b4j.example.vmelement*/ ("md-chip");
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 17;BA.debugLine="Chip.SetOnClick(module, $\"${ID}_click\"$)";
_chip._setonclick /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 18;BA.debugLine="SetOnDelete";
_setondelete();
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 80;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Render";
 //BA.debugLineNum = 49;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetAccent(b As Boolean) As VMChip";
 //BA.debugLineNum = 73;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 74;BA.debugLine="Chip.SetAccent(True)";
_chip._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetAttr(attr As Map) As VMChip";
 //BA.debugLineNum = 91;BA.debugLine="Chip.SetAttr(attr)";
_chip._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setclickable(boolean _varclickable) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetClickable(varClickable As Boolean) As VMChi";
 //BA.debugLineNum = 116;BA.debugLine="If varClickable = False Then Return Me";
if (_varclickable==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 117;BA.debugLine="SetAttr(CreateMap(\":md-clickable\": varClickable))";
_setattr(__c.createMap(new Object[] {(Object)(":md-clickable"),(Object)(_varclickable)}));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdatasource(String _sourcetable,String _sourcefield,String _displayfield) throws Exception{
int _intsel = 0;
String _krow = "";
String _drow = "";
 //BA.debugLineNum = 175;BA.debugLine="Sub SetDataSource(sourceTable As String, sourceFie";
 //BA.debugLineNum = 176;BA.debugLine="sourceTable = sourceTable.ToLowerCase";
_sourcetable = _sourcetable.toLowerCase();
 //BA.debugLineNum = 177;BA.debugLine="sourceField = sourceField.ToLowerCase";
_sourcefield = _sourcefield.toLowerCase();
 //BA.debugLineNum = 178;BA.debugLine="displayField = displayField.tolowercase";
_displayfield = _displayfield.toLowerCase();
 //BA.debugLineNum = 180;BA.debugLine="Dim intSel As Int = 0";
_intsel = (int) (0);
 //BA.debugLineNum = 181;BA.debugLine="If sourceTable <> \"\" Then intSel = BANano.parseIn";
if ((_sourcetable).equals("") == false) { 
_intsel = (int) (_banano.parseInt((Object)(_intsel))+1);};
 //BA.debugLineNum = 182;BA.debugLine="If sourceField <> \"\" Then intSel = BANano.parseIn";
if ((_sourcefield).equals("") == false) { 
_intsel = (int) (_banano.parseInt((Object)(_intsel))+1);};
 //BA.debugLineNum = 183;BA.debugLine="If displayField <> \"\" Then intSel = BANano.parseI";
if ((_displayfield).equals("") == false) { 
_intsel = (int) (_banano.parseInt((Object)(_intsel))+1);};
 //BA.debugLineNum = 185;BA.debugLine="If intSel = 3 Then";
if (_intsel==3) { 
 //BA.debugLineNum = 186;BA.debugLine="Dim kRow As String = $\"row.${sourceField}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
 //BA.debugLineNum = 187;BA.debugLine="Dim dRow As String = $\"row.${displayField}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
 //BA.debugLineNum = 188;BA.debugLine="Chip.clear";
_chip._clear /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 189;BA.debugLine="Chip.SetVFor(\"row\", sourceTable)";
_chip._setvfor /*b4j.example.vmelement*/ ("row",_sourcetable);
 //BA.debugLineNum = 190;BA.debugLine="Chip.SetID($\"${kRow}\"$,True)";
_chip._setid /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
 //BA.debugLineNum = 191;BA.debugLine="Chip.SetKey($\"${kRow}\"$,True)";
_chip._setkey /*b4j.example.vmelement*/ ((Object)((""+__c.SmartStringFormatter("",(Object)(_krow))+"")),__c.True);
 //BA.debugLineNum = 192;BA.debugLine="Chip.SetText($\"{{ ${dRow} }}\"$)";
_chip._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
 };
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdeletable(boolean _vardeletable) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetDeletable(varDeletable As Boolean) As VMChi";
 //BA.debugLineNum = 123;BA.debugLine="If varDeletable = False Then Return Me";
if (_vardeletable==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 124;BA.debugLine="SetAttr(CreateMap(\":md-deletable\": varDeletable))";
_setattr(__c.createMap(new Object[] {(Object)(":md-deletable"),(Object)(_vardeletable)}));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChip";
 //BA.debugLineNum = 129;BA.debugLine="Chip.SetDisabled(b)";
_chip._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetKey(k As String) As VMChip";
 //BA.debugLineNum = 170;BA.debugLine="Chip.SetKey(k, False)";
_chip._setkey /*b4j.example.vmelement*/ ((Object)(_k),__c.False);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setlabel(String _labeltext) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetLabel(labelText As String) As VMChip";
 //BA.debugLineNum = 23;BA.debugLine="If labelText = \"\" Then Return Me";
if ((_labeltext).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setondelete() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 135;BA.debugLine="private Sub SetOnDelete As VMChip";
 //BA.debugLineNum = 136;BA.debugLine="Dim methodName As String  = $\"${ID}_delete\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_delete");
 //BA.debugLineNum = 137;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 138;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 139;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 140;BA.debugLine="SetAttr(CreateMap(\"v-on:md-delete\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-delete"),(Object)(_methodname)}));
 //BA.debugLineNum = 142;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setoptions(String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _krow = "";
String _drow = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub SetOptions(sourceName As String, options As Ma";
 //BA.debugLineNum = 147;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
 //BA.debugLineNum = 148;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 149;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 150;BA.debugLine="For Each k As String In options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _options.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 151;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
 //BA.debugLineNum = 152;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 153;BA.debugLine="nrec.Put(sourcefield, k)";
_nrec.Put((Object)(_sourcefield),(Object)(_k));
 //BA.debugLineNum = 154;BA.debugLine="nrec.Put(displayfield, v)";
_nrec.Put((Object)(_displayfield),(Object)(_v));
 //BA.debugLineNum = 155;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_sourcename,(Object)(_recs.getObject()));
 //BA.debugLineNum = 159;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
 //BA.debugLineNum = 160;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
 //BA.debugLineNum = 161;BA.debugLine="Chip.clear";
_chip._clear /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 162;BA.debugLine="Chip.SetVFor(\"row\", sourceName)";
_chip._setvfor /*b4j.example.vmelement*/ ("row",_sourcename);
 //BA.debugLineNum = 163;BA.debugLine="Chip.SetID($\"${kRow}\"$,True)";
_chip._setid /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
 //BA.debugLineNum = 164;BA.debugLine="Chip.SetKey($\"${kRow}\"$,True)";
_chip._setkey /*b4j.example.vmelement*/ ((Object)((""+__c.SmartStringFormatter("",(Object)(_krow))+"")),__c.True);
 //BA.debugLineNum = 165;BA.debugLine="Chip.SetText($\"{{ ${dRow} }}\"$)";
_chip._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetPadding(p As Object) As VMChip";
 //BA.debugLineNum = 110;BA.debugLine="Chip.SetPaddingAll(p)";
_chip._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetPrimary(b As Boolean) As VMChip";
 //BA.debugLineNum = 67;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 68;BA.debugLine="Chip.SetPrimary(True)";
_chip._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetStyle(sm As Map) As VMChip";
 //BA.debugLineNum = 97;BA.debugLine="Chip.SetStyle(sm)";
_chip._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _settext(String _t) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetText(t As String) As VMChip";
 //BA.debugLineNum = 61;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
 //BA.debugLineNum = 62;BA.debugLine="Chip.SetText(t)";
_chip._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetVIf(vif As Object) As VMChip";
 //BA.debugLineNum = 38;BA.debugLine="Chip.SetVIf(vif)";
_chip._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetVModel(k As String) As VMChip";
 //BA.debugLineNum = 33;BA.debugLine="Chip.SetVModel(k)";
_chip._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetVShow(vif As Object) As VMChip";
 //BA.debugLineNum = 43;BA.debugLine="Chip.SetVShow(vif)";
_chip._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 29;BA.debugLine="Return Chip.ToString";
if (true) return _chip._tostring /*String*/ ();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
