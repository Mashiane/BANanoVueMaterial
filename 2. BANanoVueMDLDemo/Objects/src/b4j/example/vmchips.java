package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmchips extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmchips", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmchips.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _chips = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public b4j.example.vmelement _et = null;
public b4j.example.vmelement _lbl = null;
public boolean _haslabel = false;
public boolean _haserror = false;
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
public b4j.example.vmchips  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 115;BA.debugLine="Sub AddChild(child As VMElement) As VMChips";
 //BA.debugLineNum = 116;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 117;BA.debugLine="Chips.SetText(childHTML)";
_chips._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 157;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 158;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 159;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchips  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddClass(c As String) As VMChips";
 //BA.debugLineNum = 140;BA.debugLine="Chips.AddClass(c)";
_chips._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 294;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Chips As VMElement";
_chips = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
 //BA.debugLineNum = 8;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
 //BA.debugLineNum = 9;BA.debugLine="Private et As VMElement";
_et = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="Private lbl As VMElement";
_lbl = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private hasLabel As Boolean";
_haslabel = false;
 //BA.debugLineNum = 12;BA.debugLine="Private hasError As Boolean";
_haserror = false;
 //BA.debugLineNum = 13;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchips  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
String _ctext = "";
int _chint = 0;
String _sval = "";
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 18;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="Chips.Initialize(v, ID)";
_chips._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 20;BA.debugLine="Chips.SetTag(\"md-chips\")";
_chips._settag /*b4j.example.vmelement*/ ("md-chips");
 //BA.debugLineNum = 21;BA.debugLine="lbl.Initialize(v,\"\").SetTag(\"label\")";
_lbl._initialize /*b4j.example.vmelement*/ (ba,_v,"")._settag /*b4j.example.vmelement*/ ("label");
 //BA.debugLineNum = 22;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 23;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 24;BA.debugLine="hasHelp = False";
_hashelp = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="hasLabel = False";
_haslabel = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="hasHelp = False";
_hashelp = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="hasError = False";
_haserror = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="Dim cText As String, chInt As Int  'ignore";
_ctext = "";
_chint = 0;
 //BA.debugLineNum = 29;BA.debugLine="SetOnDelete(cText, chInt)";
_setondelete(_ctext,_chint);
 //BA.debugLineNum = 30;BA.debugLine="SetOnClick(cText, chInt)";
_setonclick(_ctext,_chint);
 //BA.debugLineNum = 31;BA.debugLine="Dim sval As String";
_sval = "";
 //BA.debugLineNum = 32;BA.debugLine="SetOnInsert(sval)";
_setoninsert(_sval);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 135;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Render";
 //BA.debugLineNum = 111;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchips  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetAccent(b As Boolean) As VMChips";
 //BA.debugLineNum = 128;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 129;BA.debugLine="Chips.SetAccent(True)";
_chips._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAttr(attr As Map) As VMChips";
 //BA.debugLineNum = 146;BA.debugLine="Chips.SetAttr(attr)";
_chips._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setcheckduplicated(boolean _varcheckduplicated) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetCheckDuplicated(varCheckDuplicated As Boole";
 //BA.debugLineNum = 235;BA.debugLine="If varCheckDuplicated = False Then Return Me";
if (_varcheckduplicated==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 236;BA.debugLine="SetAttr(CreateMap(\":md-check-duplicated\": varChec";
_setattr(__c.createMap(new Object[] {(Object)(":md-check-duplicated"),(Object)(_varcheckduplicated)}));
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChips";
 //BA.debugLineNum = 253;BA.debugLine="Chips.SetDisabled(b)";
_chips._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setemail() throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetEmail As VMChips";
 //BA.debugLineNum = 193;BA.debugLine="SetInputType(\"email\")";
_setinputtype("email");
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _seterrortext(String _txt) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetErrorText(txt As String) As VMChips";
 //BA.debugLineNum = 45;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 46;BA.debugLine="hasError = True";
_haserror = __c.True;
 //BA.debugLineNum = 47;BA.debugLine="et = Chips.SetErrorText(txt)";
_et = _chips._seterrortext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setformat(String _varformat,String _methodname) throws Exception{
String _value = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 241;BA.debugLine="Sub SetFormat(varFormat As String, methodName As S";
 //BA.debugLineNum = 242;BA.debugLine="If varFormat = \"\" Then Return Me";
if ((_varformat).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 243;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 244;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 245;BA.debugLine="SetAttr(CreateMap(\":md-format\": varFormat))";
_setattr(__c.createMap(new Object[] {(Object)(":md-format"),(Object)(_varformat)}));
 //BA.debugLineNum = 246;BA.debugLine="Dim value As String";
_value = "";
 //BA.debugLineNum = 247;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value)}))));
 //BA.debugLineNum = 248;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _sethelpertext(String _t) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetHelperText(t As String) As VMChips";
 //BA.debugLineNum = 38;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 39;BA.debugLine="hasHelp = True";
_hashelp = __c.True;
 //BA.debugLineNum = 40;BA.debugLine="ht = Chips.SetHelperText(t)";
_ht = _chips._sethelpertext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setinputtype(String _varinputtype) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetInputType(varInputType As String) As VMChip";
 //BA.debugLineNum = 172;BA.debugLine="If varInputType = \"\" Then Return Me";
if ((_varinputtype).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 173;BA.debugLine="SetAttr(CreateMap(\"md-input-type\": varInputType))";
_setattr(__c.createMap(new Object[] {(Object)("md-input-type"),(Object)(_varinputtype)}));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setlabel(String _labeltext) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetLabel(labelText As String) As VMChips";
 //BA.debugLineNum = 91;BA.debugLine="If labelText = \"\" Then Return Me";
if ((_labeltext).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 92;BA.debugLine="lbl.SetText(labelText)";
_lbl._settext /*b4j.example.vmelement*/ (_labeltext);
 //BA.debugLineNum = 93;BA.debugLine="hasLabel = True";
_haslabel = __c.True;
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setlimit(String _varlimit) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetLimit(varLimit As String) As VMChips";
 //BA.debugLineNum = 228;BA.debugLine="If varLimit = \"\" Then Return Me";
if ((_varlimit).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 229;BA.debugLine="SetAttr(CreateMap(\":md-limit\": varLimit))";
_setattr(__c.createMap(new Object[] {(Object)(":md-limit"),(Object)(_varlimit)}));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setnumber() throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetNumber As VMChips";
 //BA.debugLineNum = 203;BA.debugLine="SetInputType(\"number\")";
_setinputtype("number");
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setonclick(String _text,int _index) throws Exception{
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 270;BA.debugLine="private Sub SetOnClick(text As String, index As In";
 //BA.debugLineNum = 271;BA.debugLine="Dim methodName As String  = $\"${ID}_click\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 272;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 273;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_text),(Object)(_index)}))));
 //BA.debugLineNum = 274;BA.debugLine="SetAttr(CreateMap(\"v-on:md-click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-click"),(Object)(_methodname)}));
 //BA.debugLineNum = 276;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setondelete(String _text,int _index) throws Exception{
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 259;BA.debugLine="private Sub SetOnDelete(text As String, index As I";
 //BA.debugLineNum = 260;BA.debugLine="Dim methodName As String = $\"${ID}_delete\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_delete");
 //BA.debugLineNum = 261;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 262;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_text),(Object)(_index)}))));
 //BA.debugLineNum = 263;BA.debugLine="SetAttr(CreateMap(\"v-on:md-delete\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-delete"),(Object)(_methodname)}));
 //BA.debugLineNum = 265;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setoninsert(String _value) throws Exception{
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 281;BA.debugLine="private Sub SetOnInsert(value As String) As VMChip";
 //BA.debugLineNum = 282;BA.debugLine="Dim methodName As String = $\"${ID}_insert\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_insert");
 //BA.debugLineNum = 283;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 284;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value)}))));
 //BA.debugLineNum = 285;BA.debugLine="SetAttr(CreateMap(\"v-on:md-insert\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-insert"),(Object)(_methodname)}));
 //BA.debugLineNum = 287;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setoptions(String _vmodel,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetOptions(vModel As String, options As List)";
 //BA.debugLineNum = 79;BA.debugLine="SetVModel(vModel)";
_setvmodel(_vmodel);
 //BA.debugLineNum = 80;BA.debugLine="vue.SetStateSingle(vModel, options)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_options.getObject()));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setpadding(String _p) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetPadding(p As String) As VMChips";
 //BA.debugLineNum = 165;BA.debugLine="If p = \"\" Then Return Me";
if ((_p).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 166;BA.debugLine="Chips.SetPaddingAll(p)";
_chips._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setpassword() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SetPassword As VMChips";
 //BA.debugLineNum = 183;BA.debugLine="SetInputType(\"password\")";
_setinputtype("password");
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setplaceholder(String _varplaceholder) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 214;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 215;BA.debugLine="SetAttr(CreateMap(\"md-placeholder\": varPlaceholde";
_setattr(__c.createMap(new Object[] {(Object)("md-placeholder"),(Object)(_varplaceholder)}));
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetPrimary(b As Boolean) As VMChips";
 //BA.debugLineNum = 122;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 123;BA.debugLine="Chips.SetPrimary(True)";
_chips._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMChips";
 //BA.debugLineNum = 60;BA.debugLine="Chips.SetRequired(varRequired)";
_chips._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setsearch() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetSearch As VMChips";
 //BA.debugLineNum = 188;BA.debugLine="SetInputType(\"search\")";
_setinputtype("search");
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setstatic(boolean _varstatic) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub SetStatic(varStatic As Boolean) As VMChips";
 //BA.debugLineNum = 221;BA.debugLine="If varStatic = False Then Return Me";
if (_varstatic==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 222;BA.debugLine="SetAttr(CreateMap(\":md-static\": varStatic))";
_setattr(__c.createMap(new Object[] {(Object)(":md-static"),(Object)(_varstatic)}));
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetStyle(sm As Map) As VMChips";
 //BA.debugLineNum = 152;BA.debugLine="Chips.SetStyle(sm)";
_chips._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetTabIndex(ti As String) As VMChips";
 //BA.debugLineNum = 52;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 53;BA.debugLine="Chips.SetTabIndex(ti)";
_chips._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _settel() throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetTel As VMChips";
 //BA.debugLineNum = 198;BA.debugLine="SetInputType(\"tel\")";
_setinputtype("tel");
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _settext() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetText As VMChips";
 //BA.debugLineNum = 178;BA.debugLine="SetInputType(\"text\")";
_setinputtype("text");
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _seturl() throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetURL As VMChips";
 //BA.debugLineNum = 208;BA.debugLine="SetInputType(\"url\")";
_setinputtype("url");
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetVIf(vif As String) As VMChips";
 //BA.debugLineNum = 98;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 99;BA.debugLine="Chips.SetVIf(vif)";
_chips._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetVModel(k As String) As VMChips";
 //BA.debugLineNum = 85;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 86;BA.debugLine="Chips.SetVModel(k)";
_chips._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetVShow(vif As String) As VMChips";
 //BA.debugLineNum = 104;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
 //BA.debugLineNum = 105;BA.debugLine="Chips.SetVShow(vif)";
_chips._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 66;BA.debugLine="If hasLabel Then";
if (_haslabel) { 
 //BA.debugLineNum = 67;BA.debugLine="lbl.pop(Chips)";
_lbl._pop /*String*/ (_chips);
 };
 //BA.debugLineNum = 69;BA.debugLine="If hasHelp Then";
if (_hashelp) { 
 //BA.debugLineNum = 70;BA.debugLine="ht.Pop(Chips)";
_ht._pop /*String*/ (_chips);
 };
 //BA.debugLineNum = 72;BA.debugLine="If hasError Then";
if (_haserror) { 
 //BA.debugLineNum = 73;BA.debugLine="et.Pop(Chips)";
_et._pop /*String*/ (_chips);
 };
 //BA.debugLineNum = 75;BA.debugLine="Return Chips.ToString";
if (true) return _chips._tostring /*String*/ ();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
