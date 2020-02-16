package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmelement extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmelement", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmelement.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vuehtml _element = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _hascontent = false;
public String _rowclass = "";
public String _cellclass = "";
public anywheresoftware.b4a.objects.collections.Map _offclass = null;
public anywheresoftware.b4a.objects.collections.Map _colclass = null;
public String _showkey = "";
public String _diskey = "";
public String _reqkey = "";
public String _errkey = "";
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
public String  _addbr() throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub AddBR";
 //BA.debugLineNum = 383;BA.debugLine="SetText(\"<br>\")";
_settext("<br>");
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 419;BA.debugLine="Sub AddChild(child As VMElement) As VMElement";
 //BA.debugLineNum = 420;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 421;BA.debugLine="Element.SetText(childHTML)";
_element._settext /*b4j.example.vuehtml*/ (_childhtml);
 //BA.debugLineNum = 422;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 427;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 428;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 429;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub AddClass(c As String) As VMElement";
 //BA.debugLineNum = 393;BA.debugLine="Element.AddClass(c)";
_element._addclass /*b4j.example.vuehtml*/ (_c);
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public String  _addelement(b4j.example.vmelement _el) throws Exception{
 //BA.debugLineNum = 852;BA.debugLine="Sub AddElement(el As VMElement)";
 //BA.debugLineNum = 853;BA.debugLine="SetText(el.ToString)";
_settext(_el._tostring /*String*/ ());
 //BA.debugLineNum = 854;BA.debugLine="End Sub";
return "";
}
public String  _addelements(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.vmelement _li = null;
 //BA.debugLineNum = 846;BA.debugLine="Sub AddElements(lst As List)";
 //BA.debugLineNum = 847;BA.debugLine="For Each li As VMElement In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_li = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 848;BA.debugLine="SetText(li.tostring)";
_settext(_li._tostring /*String*/ ());
 }
};
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return "";
}
public String  _addhr() throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub AddHR";
 //BA.debugLineNum = 388;BA.debugLine="SetText(\"<hr>\")";
_settext("<hr>");
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _addstyle(String _prop,Object _val) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 1072;BA.debugLine="Sub AddStyle(prop As String, val As Object) As VME";
 //BA.debugLineNum = 1073;BA.debugLine="If val = Null Then Return Me";
if (_val== null) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1074;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1075;BA.debugLine="m.Put(prop, val)";
_m.Put((Object)(_prop),_val);
 //BA.debugLineNum = 1076;BA.debugLine="SetStyle(m)";
_setstyle(_m);
 //BA.debugLineNum = 1077;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1078;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Element As VueHTML";
_element = new b4j.example.vuehtml();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Public hasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 8;BA.debugLine="Private rowClass As String = \"row\"";
_rowclass = "row";
 //BA.debugLineNum = 9;BA.debugLine="Private cellClass As String = \"col\"";
_cellclass = "col";
 //BA.debugLineNum = 11;BA.debugLine="Private offClass As Map = CreateMap(\"s\":\"offset-s";
_offclass = new anywheresoftware.b4a.objects.collections.Map();
_offclass = __c.createMap(new Object[] {(Object)("s"),(Object)("offset-sm-"),(Object)("m"),(Object)("offset-md-"),(Object)("l"),(Object)("offset-lg-"),(Object)("xl"),(Object)("offset-xl-")});
 //BA.debugLineNum = 13;BA.debugLine="Private colClass As Map = CreateMap(\"s\": \"col-sm-";
_colclass = new anywheresoftware.b4a.objects.collections.Map();
_colclass = __c.createMap(new Object[] {(Object)("s"),(Object)("col-sm-"),(Object)("m"),(Object)("col-md-"),(Object)("l"),(Object)("col-lg-"),(Object)("xl"),(Object)("col-xl-")});
 //BA.debugLineNum = 14;BA.debugLine="Private showKey As String";
_showkey = "";
 //BA.debugLineNum = 15;BA.debugLine="Private disKey As String";
_diskey = "";
 //BA.debugLineNum = 16;BA.debugLine="Private reqKey As String";
_reqkey = "";
 //BA.debugLineNum = 17;BA.debugLine="Private errKey As String";
_errkey = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _clear() throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub Clear As VMElement";
 //BA.debugLineNum = 172;BA.debugLine="Element.clear";
_element._clear /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _enable(boolean _b) throws Exception{
boolean _n = false;
 //BA.debugLineNum = 61;BA.debugLine="Sub Enable(b As Boolean) As VMElement";
 //BA.debugLineNum = 62;BA.debugLine="Dim n As Boolean = Not(b)";
_n = __c.Not(_b);
 //BA.debugLineNum = 63;BA.debugLine="vue.SetStateSingle(disKey, n)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_diskey,(Object)(_n));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _hide() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Hide As VMElement";
 //BA.debugLineNum = 73;BA.debugLine="vue.SetStateSingle(showKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(__c.False));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 21;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 22;BA.debugLine="ID = ID.trim";
_id = _id.trim();
 //BA.debugLineNum = 23;BA.debugLine="Element.Initialize(ID,\"div\")";
_element._initialize /*b4j.example.vuehtml*/ (ba,_id,"div");
 //BA.debugLineNum = 24;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 25;BA.debugLine="hasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="SetRef(ID)";
_setref(_id);
 //BA.debugLineNum = 27;BA.debugLine="showKey = $\"${ID}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"show");
 //BA.debugLineNum = 28;BA.debugLine="disKey = $\"${ID}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_id))+"disabled");
 //BA.debugLineNum = 29;BA.debugLine="reqKey = $\"${ID}required\"$";
_reqkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"required");
 //BA.debugLineNum = 30;BA.debugLine="errKey = $\"${ID}error\"$";
_errkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"error");
 //BA.debugLineNum = 31;BA.debugLine="vue.SetStateSingle(showKey, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(__c.True));
 //BA.debugLineNum = 32;BA.debugLine="vue.SetStateSingle(disKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_diskey,(Object)(__c.False));
 //BA.debugLineNum = 33;BA.debugLine="vue.SetStateSingle(reqKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_reqkey,(Object)(__c.False));
 //BA.debugLineNum = 34;BA.debugLine="vue.SetStateSingle(errKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_errkey,(Object)(__c.False));
 //BA.debugLineNum = 36;BA.debugLine="SetRequired(False)";
_setrequired(__c.False);
 //BA.debugLineNum = 37;BA.debugLine="SetVShow(showKey)";
_setvshow(_showkey);
 //BA.debugLineNum = 38;BA.debugLine="SetDisabled(False)";
_setdisabled(__c.False);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 95;BA.debugLine="Return Element.MakePx(sValue)";
if (true) return _element._makepx /*String*/ (_svalue);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 879;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 880;BA.debugLine="p.Element.AddElement(Element)";
_p._element /*b4j.example.vuehtml*/ ._addelement /*b4j.example.vuehtml*/ (_element);
 //BA.debugLineNum = 881;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 882;BA.debugLine="End Sub";
return "";
}
public String  _pop1(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub Pop1(p As VMElement)";
 //BA.debugLineNum = 404;BA.debugLine="p.AddChild(Me)";
_p._addchild /*b4j.example.vmelement*/ ((b4j.example.vmelement)(this));
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="public Sub RemoveAttr(sName As String) As VMElemen";
 //BA.debugLineNum = 351;BA.debugLine="Element.RemoveAttr(sName)";
_element._removeattr /*b4j.example.vuehtml*/ (_sname);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _removeclass(String _classname) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub RemoveClass(className As String) As VMElement";
 //BA.debugLineNum = 197;BA.debugLine="Element.removeClass(className)";
_element._removeclass /*b4j.example.vuehtml*/ (_classname);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Sub Render";
 //BA.debugLineNum = 890;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 891;BA.debugLine="End Sub";
return "";
}
public String  _render1(String _parent) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub Render1(parent As String)";
 //BA.debugLineNum = 399;BA.debugLine="BANano.GetElement(parent).Append(ToString)";
_banano.GetElement(_parent).Append(_tostring());
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _required(boolean _b) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub Required(b As Boolean) As VMElement";
 //BA.debugLineNum = 57;BA.debugLine="vue.SetStateSingle(reqKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_reqkey,(Object)(_b));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 522;BA.debugLine="Sub SetAccent(b As Boolean) As VMElement";
 //BA.debugLineNum = 523;BA.debugLine="Element.AddClass(\"md-accent\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-accent");
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setactivesync(String _a) throws Exception{
anywheresoftware.b4a.objects.collections.Map _state = null;
 //BA.debugLineNum = 486;BA.debugLine="Sub SetActiveSync(a As String) As VMElement";
 //BA.debugLineNum = 487;BA.debugLine="a = a.tolowercase";
_a = _a.toLowerCase();
 //BA.debugLineNum = 488;BA.debugLine="Element.SetAttr(\":md-active.sync\", a)";
_element._setattr /*b4j.example.vuehtml*/ (":md-active.sync",_a);
 //BA.debugLineNum = 489;BA.debugLine="Dim state As Map = CreateMap()";
_state = new anywheresoftware.b4a.objects.collections.Map();
_state = __c.createMap(new Object[] {});
 //BA.debugLineNum = 490;BA.debugLine="state.Put(a, False)";
_state.Put((Object)(_a),(Object)(__c.False));
 //BA.debugLineNum = 491;BA.debugLine="vue.SetState(state)";
_vue._setstate /*b4j.example.bananovue*/ (_state);
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setalt(String _a) throws Exception{
 //BA.debugLineNum = 623;BA.debugLine="Sub SetAlt(a As String) As VMElement";
 //BA.debugLineNum = 624;BA.debugLine="Element.SetAlt(a)";
_element._setalt /*b4j.example.vuehtml*/ (_a);
 //BA.debugLineNum = 625;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setappcontent(boolean _b) throws Exception{
 //BA.debugLineNum = 604;BA.debugLine="Sub SetAppContent(b As Boolean) As VMElement";
 //BA.debugLineNum = 605;BA.debugLine="Element.SetTag(\"md-app-content\")";
_element._settag /*b4j.example.vuehtml*/ ("md-app-content");
 //BA.debugLineNum = 606;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattr(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 548;BA.debugLine="Sub SetAttr(m As Map) As VMElement";
 //BA.debugLineNum = 549;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 550;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 551;BA.debugLine="Element.SetAttr(k, v)";
_element._setattr /*b4j.example.vuehtml*/ (_k,BA.ObjectToString(_v));
 }
};
 //BA.debugLineNum = 553;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattr1(String _attr,Object _val) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAttr1(attr As String, val As Object) As VME";
 //BA.debugLineNum = 88;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 89;BA.debugLine="opt.Put(attr, val)";
_opt.Put((Object)(_attr),_val);
 //BA.debugLineNum = 90;BA.debugLine="SetAttr(opt)";
_setattr(_opt);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattrsingle(String _prop,Object _val) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 49;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
 //BA.debugLineNum = 50;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 51;BA.debugLine="attr.Put(prop, val)";
_attr.Put((Object)(_prop),_val);
 //BA.debugLineNum = 52;BA.debugLine="SetAttr(attr)";
_setattr(_attr);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setautocomplete(String _auto) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetAutoComplete(auto As String) As VMElement";
 //BA.debugLineNum = 328;BA.debugLine="SetAttr(CreateMap(\"autocomplete\": auto))";
_setattr(__c.createMap(new Object[] {(Object)("autocomplete"),(Object)(_auto)}));
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbackgroundcolor(Object _p) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub SetBackgroundColor(p As Object) As VMElement";
 //BA.debugLineNum = 435;BA.debugLine="SetStyle(CreateMap(\"background-color\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("background-color"),_p}));
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbackgroundimage(String _url) throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Sub SetBackgroundImage(url As String) As VMElement";
 //BA.debugLineNum = 562;BA.debugLine="Element.SetStyle(\"background-image\", $\"url('${url";
_element._setstyle /*b4j.example.vuehtml*/ ("background-image",("url('"+__c.SmartStringFormatter("",(Object)(_url))+"')"));
 //BA.debugLineNum = 563;BA.debugLine="Element.SetStyle(\"background-size\", \"100% 100%\")";
_element._setstyle /*b4j.example.vuehtml*/ ("background-size","100% 100%");
 //BA.debugLineNum = 564;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 565;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbody1(boolean _b) throws Exception{
 //BA.debugLineNum = 710;BA.debugLine="Sub SetBody1(b As Boolean) As VMElement";
 //BA.debugLineNum = 711;BA.debugLine="Element.AddClass(\"md-body-1\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-body-1");
 //BA.debugLineNum = 712;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 713;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbody2(boolean _b) throws Exception{
 //BA.debugLineNum = 703;BA.debugLine="Sub SetBody2(b As Boolean) As VMElement";
 //BA.debugLineNum = 704;BA.debugLine="Element.AddClass(\"md-body-2\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-body-2");
 //BA.debugLineNum = 705;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 706;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setborder(String _width,String _color,String _bstyle) throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 145;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
 //BA.debugLineNum = 146;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 147;BA.debugLine="b.Put(\"border-style\", bstyle)";
_b.Put((Object)("border-style"),(Object)(_bstyle));
 //BA.debugLineNum = 148;BA.debugLine="b.Put(\"border-width\", width)";
_b.Put((Object)("border-width"),(Object)(_width));
 //BA.debugLineNum = 149;BA.debugLine="b.Put(\"border-color\", color)";
_b.Put((Object)("border-color"),(Object)(_color));
 //BA.debugLineNum = 150;BA.debugLine="SetStyle(b)";
_setstyle(_b);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcaption(boolean _b) throws Exception{
 //BA.debugLineNum = 717;BA.debugLine="Sub SetCaption(b As Boolean) As VMElement";
 //BA.debugLineNum = 718;BA.debugLine="Element.AddClass(\"md-caption\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-caption");
 //BA.debugLineNum = 719;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcolor(Object _c) throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Sub SetColor(c As Object) As VMElement";
 //BA.debugLineNum = 409;BA.debugLine="SetStyle(CreateMap(\"color\": c))";
_setstyle(__c.createMap(new Object[] {(Object)("color"),_c}));
 //BA.debugLineNum = 410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcursormove() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetCursorMove As VMElement";
 //BA.debugLineNum = 156;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"move\"))";
_setstyle(__c.createMap(new Object[] {(Object)("cursor"),(Object)("move")}));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcursorpointer() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub SetCursorPointer As VMElement";
 //BA.debugLineNum = 161;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"pointer\"))";
_setstyle(__c.createMap(new Object[] {(Object)("cursor"),(Object)("pointer")}));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdense(boolean _b) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub SetDense(b As Boolean) As VMElement";
 //BA.debugLineNum = 501;BA.debugLine="Element.AddClass(\"md-dense\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-dense");
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 510;BA.debugLine="Sub SetDisabled(b As Boolean) As VMElement";
 //BA.debugLineNum = 511;BA.debugLine="vue.SetStatesingle(disKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_diskey,(Object)(_b));
 //BA.debugLineNum = 512;BA.debugLine="Element.SetAttr(\":disabled\", disKey)";
_element._setattr /*b4j.example.vuehtml*/ (":disabled",_diskey);
 //BA.debugLineNum = 513;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisplay1(boolean _b) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Sub SetDisplay1(b As Boolean) As VMElement";
 //BA.debugLineNum = 588;BA.debugLine="Element.AddClass(\"md-display-1\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-display-1");
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisplay2(boolean _b) throws Exception{
 //BA.debugLineNum = 582;BA.debugLine="Sub SetDisplay2(b As Boolean) As VMElement";
 //BA.debugLineNum = 583;BA.debugLine="Element.AddClass(\"md-display-2\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-display-2");
 //BA.debugLineNum = 584;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisplay3(boolean _b) throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub SetDisplay3(b As Boolean) As VMElement";
 //BA.debugLineNum = 578;BA.debugLine="Element.AddClass(\"md-display-3\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-display-3");
 //BA.debugLineNum = 579;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisplay4(boolean _b) throws Exception{
 //BA.debugLineNum = 572;BA.debugLine="Sub SetDisplay4(b As Boolean) As VMElement";
 //BA.debugLineNum = 573;BA.debugLine="Element.AddClass(\"md-display-4\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-display-4");
 //BA.debugLineNum = 574;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 575;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdoubleline(boolean _b) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub SetDoubleLine(b As Boolean) As VMElement";
 //BA.debugLineNum = 456;BA.debugLine="Element.AddClass(\"md-double-line\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-double-line");
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdraggable(boolean _b) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetDraggable(b As Boolean) As VMElement";
 //BA.debugLineNum = 124;BA.debugLine="SetAttr(CreateMap(\":draggable\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":draggable"),(Object)(_b)}));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdroppable(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetDroppable(b As Boolean) As VMElement";
 //BA.debugLineNum = 129;BA.debugLine="SetAttr(CreateMap(\":droppable\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":droppable"),(Object)(_b)}));
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 673;BA.debugLine="Sub SetElevation(e As Int) As VMElement";
 //BA.debugLineNum = 674;BA.debugLine="Element.addclass($\"md-elevation-${e}\"$)";
_element._addclass /*b4j.example.vuehtml*/ (("md-elevation-"+__c.SmartStringFormatter("",(Object)(_e))+""));
 //BA.debugLineNum = 675;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 676;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _seterrortext(String _t) throws Exception{
String _errorshow = "";
b4j.example.vmelement _he = null;
 //BA.debugLineNum = 814;BA.debugLine="Sub SetErrorText(t As String) As VMElement";
 //BA.debugLineNum = 815;BA.debugLine="Dim errorShow As String = $\"${ID}error\"$";
_errorshow = (""+__c.SmartStringFormatter("",(Object)(_id))+"error");
 //BA.debugLineNum = 816;BA.debugLine="Dim he As VMElement";
_he = new b4j.example.vmelement();
 //BA.debugLineNum = 817;BA.debugLine="he.Initialize(vue,$\"${ID}err\"$).SetTag(\"span\")";
_he._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"err"))._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 818;BA.debugLine="he.AddClass(\"md-error\")";
_he._addclass /*b4j.example.vmelement*/ ("md-error");
 //BA.debugLineNum = 819;BA.debugLine="he.SetText(t)";
_he._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 820;BA.debugLine="Return he";
if (true) return _he;
 //BA.debugLineNum = 821;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setexact(boolean _b) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetExact(b As Boolean) As VMElement";
 //BA.debugLineNum = 202;BA.debugLine="If b Then SetAttr(CreateMap(\"exact\": b))";
if (_b) { 
_setattr(__c.createMap(new Object[] {(Object)("exact"),(Object)(_b)}));};
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setfor(String _f) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetFor(f As String) As VMElement";
 //BA.debugLineNum = 99;BA.debugLine="Element.SetAttr(\"for\", f)";
_element._setattr /*b4j.example.vuehtml*/ ("for",_f);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setgutter(boolean _b) throws Exception{
 //BA.debugLineNum = 862;BA.debugLine="Sub SetGutter(b As Boolean) As VMElement";
 //BA.debugLineNum = 863;BA.debugLine="Element.AddClass(\"md-gutter\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-gutter");
 //BA.debugLineNum = 864;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setheadline(boolean _b) throws Exception{
 //BA.debugLineNum = 593;BA.debugLine="Sub SetHeadline(b As Boolean) As VMElement";
 //BA.debugLineNum = 594;BA.debugLine="Element.AddClass(\"md-headline\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-headline");
 //BA.debugLineNum = 595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 596;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetHeight(h As String) As VMElement";
 //BA.debugLineNum = 140;BA.debugLine="SetStyle(CreateMap(\"height\":h))";
_setstyle(__c.createMap(new Object[] {(Object)("height"),(Object)(_h)}));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _sethelpertext(String _t) throws Exception{
b4j.example.vmelement _ht = null;
 //BA.debugLineNum = 806;BA.debugLine="Sub SetHelperText(t As String) As VMElement";
 //BA.debugLineNum = 807;BA.debugLine="Dim ht As VMElement";
_ht = new b4j.example.vmelement();
 //BA.debugLineNum = 808;BA.debugLine="ht.Initialize(vue,$\"${ID}hlp\"$).SetTag(\"span\")";
_ht._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"hlp"))._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 809;BA.debugLine="ht.AddClass(\"md-helper-text\")";
_ht._addclass /*b4j.example.vmelement*/ ("md-helper-text");
 //BA.debugLineNum = 810;BA.debugLine="ht.SetText(t)";
_ht._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 811;BA.debugLine="Return ht";
if (true) return _ht;
 //BA.debugLineNum = 812;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _sethidden(boolean _xsmall,boolean _small,boolean _medium,boolean _large,boolean _xlarge) throws Exception{
anywheresoftware.b4a.objects.collections.List _sizes = null;
String _strsizes = "";
 //BA.debugLineNum = 723;BA.debugLine="Sub SetHidden(xsmall As Boolean, small As Boolean,";
 //BA.debugLineNum = 724;BA.debugLine="Dim sizes As List";
_sizes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 725;BA.debugLine="sizes.Initialize";
_sizes.Initialize();
 //BA.debugLineNum = 727;BA.debugLine="If xsmall Then";
if (_xsmall) { 
 //BA.debugLineNum = 728;BA.debugLine="sizes.Add($\"md-xsmall-hide\"$)";
_sizes.Add((Object)(("md-xsmall-hide")));
 };
 //BA.debugLineNum = 731;BA.debugLine="If small Then";
if (_small) { 
 //BA.debugLineNum = 732;BA.debugLine="sizes.Add($\"md-small-hide\"$)";
_sizes.Add((Object)(("md-small-hide")));
 };
 //BA.debugLineNum = 735;BA.debugLine="If medium Then";
if (_medium) { 
 //BA.debugLineNum = 736;BA.debugLine="sizes.Add($\"md-medium-hide\"$)";
_sizes.Add((Object)(("md-medium-hide")));
 };
 //BA.debugLineNum = 739;BA.debugLine="If large Then";
if (_large) { 
 //BA.debugLineNum = 740;BA.debugLine="sizes.Add($\"md-large-hide\"$)";
_sizes.Add((Object)(("md-large-hide")));
 };
 //BA.debugLineNum = 743;BA.debugLine="If xlarge Then";
if (_xlarge) { 
 //BA.debugLineNum = 744;BA.debugLine="sizes.Add($\"md-xlarge-hide\"$)";
_sizes.Add((Object)(("md-xlarge-hide")));
 };
 //BA.debugLineNum = 747;BA.debugLine="Dim strSizes As String = Element.join(\" \", sizes)";
_strsizes = _element._join /*String*/ (" ",_sizes);
 //BA.debugLineNum = 748;BA.debugLine="Element.AddClass(strSizes)";
_element._addclass /*b4j.example.vuehtml*/ (_strsizes);
 //BA.debugLineNum = 749;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 750;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _sethref(String _h) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub SetHREF(h As String) As VMElement";
 //BA.debugLineNum = 506;BA.debugLine="Element.SetAttrHREF(h)";
_element._setattrhref /*b4j.example.vuehtml*/ (_h);
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _seticonbutton(boolean _b) throws Exception{
 //BA.debugLineNum = 643;BA.debugLine="Sub SetIconButton(b As Boolean) As VMElement";
 //BA.debugLineNum = 644;BA.debugLine="Element.AddClass(\"md-icon-button\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-icon-button");
 //BA.debugLineNum = 645;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setid(String _n,boolean _bind) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetID(n As String, bind As Boolean) As VMEleme";
 //BA.debugLineNum = 356;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 357;BA.debugLine="RemoveAttr(\"id\")";
_removeattr("id");
 //BA.debugLineNum = 358;BA.debugLine="SetAttr(CreateMap(\":id\": n))";
_setattr(__c.createMap(new Object[] {(Object)(":id"),(Object)(_n)}));
 }else {
 //BA.debugLineNum = 360;BA.debugLine="RemoveAttr(\":id\")";
_removeattr(":id");
 //BA.debugLineNum = 361;BA.debugLine="SetAttr(CreateMap(\"id\": n))";
_setattr(__c.createMap(new Object[] {(Object)("id"),(Object)(_n)}));
 };
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setinset(boolean _b) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub SetInset(b As Boolean) As VMElement";
 //BA.debugLineNum = 462;BA.debugLine="If b Then Element.AddClass(\"md-inset\")";
if (_b) { 
_element._addclass /*b4j.example.vuehtml*/ ("md-inset");};
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setis(String _t) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetIs(t As String) As VMElement";
 //BA.debugLineNum = 238;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 239;BA.debugLine="SetAttr(CreateMap(\":is\": t))";
_setattr(__c.createMap(new Object[] {(Object)(":is"),(Object)(_t)}));
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setkey(Object _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VMElem";
 //BA.debugLineNum = 227;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 228;BA.debugLine="RemoveAttr(\"key\")";
_removeattr("key");
 //BA.debugLineNum = 229;BA.debugLine="Element.SetAttr(\":key\", k)";
_element._setattr /*b4j.example.vuehtml*/ (":key",BA.ObjectToString(_k));
 }else {
 //BA.debugLineNum = 231;BA.debugLine="RemoveAttr(\":key\")";
_removeattr(":key");
 //BA.debugLineNum = 232;BA.debugLine="Element.SetAttr(\"key\", k)";
_element._setattr /*b4j.example.vuehtml*/ ("key",BA.ObjectToString(_k));
 };
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlarge(boolean _b) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="Sub SetLarge(b As Boolean) As VMElement";
 //BA.debugLineNum = 538;BA.debugLine="Element.AddClass(\"md-large\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-large");
 //BA.debugLineNum = 539;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlayout(boolean _b) throws Exception{
 //BA.debugLineNum = 867;BA.debugLine="Sub SetLayout(b As Boolean) As VMElement";
 //BA.debugLineNum = 868;BA.debugLine="Element.AddClass(\"md-layout\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-layout");
 //BA.debugLineNum = 869;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 870;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlayoutcolumn(boolean _b) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetLayoutColumn(b As Boolean) As VMElement";
 //BA.debugLineNum = 450;BA.debugLine="Element.AddClass(\"md-layout-column\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-layout-column");
 //BA.debugLineNum = 451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlayoutitem(boolean _b) throws Exception{
 //BA.debugLineNum = 873;BA.debugLine="Sub SetLayoutItem(b As Boolean) As VMElement";
 //BA.debugLineNum = 874;BA.debugLine="Element.AddClass(\"md-layout-item\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-layout-item");
 //BA.debugLineNum = 875;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlineheight(Object _lh) throws Exception{
 //BA.debugLineNum = 633;BA.debugLine="Sub SetLineHeight(lh As Object) As VMElement";
 //BA.debugLineNum = 634;BA.debugLine="SetStyle(CreateMap(\"line-height\": lh))";
_setstyle(__c.createMap(new Object[] {(Object)("line-height"),_lh}));
 //BA.debugLineNum = 635;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlistaction(boolean _b) throws Exception{
 //BA.debugLineNum = 648;BA.debugLine="Sub SetListAction(b As Boolean) As VMElement";
 //BA.debugLineNum = 649;BA.debugLine="Element.AddClass(\"md-list-action\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-list-action");
 //BA.debugLineNum = 650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlistitemtext(boolean _b) throws Exception{
 //BA.debugLineNum = 668;BA.debugLine="Sub SetListItemText(b As Boolean) As VMElement";
 //BA.debugLineNum = 669;BA.debugLine="Element.AddClass(\"md-list-item-text\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-list-item-text");
 //BA.debugLineNum = 670;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 671;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmarginall(Object _p) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub SetMarginAll(p As Object) As VMElement";
 //BA.debugLineNum = 440;BA.debugLine="SetStyle(CreateMap(\"margin\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("margin"),_p}));
 //BA.debugLineNum = 441;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmargins(Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
 //BA.debugLineNum = 1063;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
 //BA.debugLineNum = 1064;BA.debugLine="AddStyle(\"margin-top\", mt)";
_addstyle("margin-top",_mt);
 //BA.debugLineNum = 1065;BA.debugLine="AddStyle(\"margin-bottom\", mb)";
_addstyle("margin-bottom",_mb);
 //BA.debugLineNum = 1066;BA.debugLine="AddStyle(\"margin-left\", ml)";
_addstyle("margin-left",_ml);
 //BA.debugLineNum = 1067;BA.debugLine="AddStyle(\"margin-right\", mr)";
_addstyle("margin-right",_mr);
 //BA.debugLineNum = 1068;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1069;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmaxheight(String _mw) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub SetMaxHeight(mw As String) As VMElement";
 //BA.debugLineNum = 477;BA.debugLine="Element.SetStyle(\"max-height\",mw)";
_element._setstyle /*b4j.example.vuehtml*/ ("max-height",_mw);
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmaxwidth(String _mw) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub SetMaxWidth(mw As String) As VMElement";
 //BA.debugLineNum = 472;BA.debugLine="Element.SetStyle(\"max-width\",mw)";
_element._setstyle /*b4j.example.vuehtml*/ ("max-width",_mw);
 //BA.debugLineNum = 473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmedium(boolean _b) throws Exception{
 //BA.debugLineNum = 532;BA.debugLine="Sub SetMedium(b As Boolean) As VMElement";
 //BA.debugLineNum = 533;BA.debugLine="If b Then Element.AddClass(\"md-medium\")";
if (_b) { 
_element._addclass /*b4j.example.vuehtml*/ ("md-medium");};
 //BA.debugLineNum = 534;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmethodpost() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetMethodPost As VMElement";
 //BA.debugLineNum = 119;BA.debugLine="SetAttr(CreateMap(\"method\":\"POST\"))";
_setattr(__c.createMap(new Object[] {(Object)("method"),(Object)("POST")}));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setname(String _n,boolean _bind) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub SetName(n As String, bind As Boolean) As VMEle";
 //BA.debugLineNum = 340;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 341;BA.debugLine="RemoveAttr(\"name\")";
_removeattr("name");
 //BA.debugLineNum = 342;BA.debugLine="SetAttr(CreateMap(\":name\": n))";
_setattr(__c.createMap(new Object[] {(Object)(":name"),(Object)(_n)}));
 }else {
 //BA.debugLineNum = 344;BA.debugLine="RemoveAttr(\":name\")";
_removeattr(":name");
 //BA.debugLineNum = 345;BA.debugLine="SetAttr(CreateMap(\"name\": n))";
_setattr(__c.createMap(new Object[] {(Object)("name"),(Object)(_n)}));
 };
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setnotselectible() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetNotSelectible As VMElement";
 //BA.debugLineNum = 109;BA.debugLine="Element.AddClass(\"gj-unselectable\")";
_element._addclass /*b4j.example.vuehtml*/ ("gj-unselectable");
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setnowrap(boolean _b) throws Exception{
 //BA.debugLineNum = 824;BA.debugLine="Sub SetNoWrap(b As Boolean) As VMElement";
 //BA.debugLineNum = 825;BA.debugLine="Element.AddClass(\"md-layout-nowrap\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-layout-nowrap");
 //BA.debugLineNum = 826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonblur(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 952;BA.debugLine="Sub SetOnBlur(module As Object, methodName As Stri";
 //BA.debugLineNum = 953;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 954;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 955;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 956;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 957;BA.debugLine="SetAttr(CreateMap(\"v-on:blur\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:blur"),(Object)(_methodname)}));
 //BA.debugLineNum = 959;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 960;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 961;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setoncancel(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 893;BA.debugLine="Sub SetOnCancel(module As Object, methodName As St";
 //BA.debugLineNum = 894;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 895;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 896;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 897;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 898;BA.debugLine="SetAttr(CreateMap(\"@md-cancel\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@md-cancel"),(Object)(_methodname)}));
 //BA.debugLineNum = 900;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 901;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 902;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonchange(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 983;BA.debugLine="Sub SetOnChange(module As Object, methodName As St";
 //BA.debugLineNum = 984;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 985;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 986;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 987;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 988;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
 //BA.debugLineNum = 990;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 991;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 992;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonclear(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 940;BA.debugLine="Sub SetOnClear(module As Object, methodName As Str";
 //BA.debugLineNum = 941;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 942;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 943;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 944;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 945;BA.debugLine="SetAttr(CreateMap(\"v-on:md-clear\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-clear"),(Object)(_methodname)}));
 //BA.debugLineNum = 947;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 948;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 949;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonclick(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 970;BA.debugLine="Sub SetOnClick(module As Object, methodName As Str";
 //BA.debugLineNum = 971;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 972;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 973;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 974;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 975;BA.debugLine="SetAttr(CreateMap(\"v-on:click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:click"),(Object)(_methodname)}));
 //BA.debugLineNum = 977;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 978;BA.debugLine="SetPointer(True)";
_setpointer(__c.True);
 //BA.debugLineNum = 979;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 980;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonconfirm(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 904;BA.debugLine="Sub SetOnConfirm(module As Object, methodName As S";
 //BA.debugLineNum = 905;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 906;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 907;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 908;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 909;BA.debugLine="SetAttr(CreateMap(\"@md-confirm\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@md-confirm"),(Object)(_methodname)}));
 //BA.debugLineNum = 911;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 912;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 913;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragend(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1029;BA.debugLine="Sub SetOnDragEnd(module As Object, methodName As S";
 //BA.debugLineNum = 1030;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1031;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1032;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1033;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 1034;BA.debugLine="SetAttr(CreateMap(\"v-on:dragend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:dragend"),(Object)(_methodname)}));
 //BA.debugLineNum = 1036;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1037;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1038;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragenter(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1040;BA.debugLine="Sub SetOnDragEnter(module As Object, methodName As";
 //BA.debugLineNum = 1041;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1042;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1043;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1044;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 1045;BA.debugLine="SetAttr(CreateMap(\"v-on:dragenter\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:dragenter"),(Object)(_methodname)}));
 //BA.debugLineNum = 1047;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1048;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1049;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragover(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1007;BA.debugLine="Sub SetOnDragOver(module As Object, methodName As";
 //BA.debugLineNum = 1008;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1009;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1010;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1011;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 1012;BA.debugLine="SetAttr(CreateMap(\"v-on:dragover\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:dragover"),(Object)(_methodname)}));
 //BA.debugLineNum = 1014;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1015;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragstart(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1018;BA.debugLine="Sub SetOnDragStart(module As Object, methodName As";
 //BA.debugLineNum = 1019;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1020;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1021;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1022;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 1023;BA.debugLine="SetAttr(CreateMap(\"v-on:dragstart\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:dragstart"),(Object)(_methodname)}));
 //BA.debugLineNum = 1025;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondrop(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1051;BA.debugLine="Sub SetOnDrop(module As Object, methodName As Stri";
 //BA.debugLineNum = 1052;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1053;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1054;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1055;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 1056;BA.debugLine="SetAttr(CreateMap(\"v-on:drop\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:drop"),(Object)(_methodname)}));
 //BA.debugLineNum = 1058;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1059;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1060;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonfocus(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 929;BA.debugLine="Sub SetOnFocus(module As Object, methodName As Str";
 //BA.debugLineNum = 930;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 931;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 932;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 933;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 934;BA.debugLine="SetAttr(CreateMap(\"v-on:focus\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:focus"),(Object)(_methodname)}));
 //BA.debugLineNum = 936;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 937;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 938;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setoninput(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 917;BA.debugLine="Sub SetOnInput(module As Object, methodName As Str";
 //BA.debugLineNum = 918;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 919;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 920;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 921;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 922;BA.debugLine="SetAttr(CreateMap(\"v-on:input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:input"),(Object)(_methodname)}));
 //BA.debugLineNum = 924;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 925;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 926;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonmouseout(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 206;BA.debugLine="Sub SetOnMouseOut(module As Object, methodName As";
 //BA.debugLineNum = 207;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 208;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 209;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseout\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:mouseout"),(Object)(_methodname)}));
 //BA.debugLineNum = 210;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 211;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 212;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonmouseover(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 216;BA.debugLine="Sub SetOnMouseOver(module As Object, methodName As";
 //BA.debugLineNum = 217;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 218;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 219;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseover\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:mouseover"),(Object)(_methodname)}));
 //BA.debugLineNum = 220;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 221;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 222;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setontouchstart(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 996;BA.debugLine="Sub SetOnTouchStart(module As Object, methodName A";
 //BA.debugLineNum = 997;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 998;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 999;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1000;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 1001;BA.debugLine="SetAttr(CreateMap(\"v-on:touchstart\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:touchstart"),(Object)(_methodname)}));
 //BA.debugLineNum = 1003;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1004;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1005;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpadding(Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
 //BA.debugLineNum = 1080;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
 //BA.debugLineNum = 1081;BA.debugLine="AddStyle(\"padding-top\", pt)";
_addstyle("padding-top",_pt);
 //BA.debugLineNum = 1082;BA.debugLine="AddStyle(\"padding-bottom\", pb)";
_addstyle("padding-bottom",_pb);
 //BA.debugLineNum = 1083;BA.debugLine="AddStyle(\"padding-left\", pl)";
_addstyle("padding-left",_pl);
 //BA.debugLineNum = 1084;BA.debugLine="AddStyle(\"padding-right\", pr)";
_addstyle("padding-right",_pr);
 //BA.debugLineNum = 1085;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1086;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpaddingall(Object _p) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetPaddingAll(p As Object) As VMElement";
 //BA.debugLineNum = 445;BA.debugLine="SetStyle(CreateMap(\"padding\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("padding"),_p}));
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpermanentfull(boolean _b) throws Exception{
 //BA.debugLineNum = 638;BA.debugLine="Sub SetPermanentFull(b As Boolean) As VMElement";
 //BA.debugLineNum = 639;BA.debugLine="Element.SetAttr(\"md-permanent\",\"full\")";
_element._setattr /*b4j.example.vuehtml*/ ("md-permanent","full");
 //BA.debugLineNum = 640;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 641;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setplaceholder(String _varplaceholder) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 83;BA.debugLine="Element.SetAttrPlaceHolder(varPlaceholder)";
_element._setattrplaceholder /*b4j.example.vuehtml*/ (_varplaceholder);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpointer(boolean _b) throws Exception{
 //BA.debugLineNum = 964;BA.debugLine="Sub SetPointer(b As Boolean) As VMElement";
 //BA.debugLineNum = 965;BA.debugLine="Element.SetPointer(True)";
_element._setpointer /*b4j.example.vuehtml*/ (__c.True);
 //BA.debugLineNum = 966;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 967;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 678;BA.debugLine="Sub SetPrimary(b As Boolean) As VMElement";
 //BA.debugLineNum = 679;BA.debugLine="Element.AddClass(\"md-primary\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-primary");
 //BA.debugLineNum = 680;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 681;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setref(String _varref) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetRef(varRef As String) As VMElement";
 //BA.debugLineNum = 245;BA.debugLine="If varRef <> \"\" Then";
if ((_varref).equals("") == false) { 
 //BA.debugLineNum = 246;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
_setattr(__c.createMap(new Object[] {(Object)("ref"),(Object)(_varref)}));
 };
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 516;BA.debugLine="Sub SetRequired(b As Boolean) As VMElement";
 //BA.debugLineNum = 517;BA.debugLine="vue.SetStateSingle(reqKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_reqkey,(Object)(_b));
 //BA.debugLineNum = 518;BA.debugLine="Element.SetAttr(\":required\", reqKey)";
_element._setattr /*b4j.example.vuehtml*/ (":required",_reqkey);
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setripple(boolean _b) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="Sub SetRipple(b As Boolean) As VMElement";
 //BA.debugLineNum = 528;BA.debugLine="Element.SetAttr(\":md-ripple\", b)";
_element._setattr /*b4j.example.vuehtml*/ (":md-ripple",BA.ObjectToString(_b));
 //BA.debugLineNum = 529;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setscrollbar(boolean _b) throws Exception{
 //BA.debugLineNum = 556;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMElement";
 //BA.debugLineNum = 557;BA.debugLine="Element.AddClass(\"md-scrollbar\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-scrollbar");
 //BA.debugLineNum = 558;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsize(int _s) throws Exception{
double _eachcell = 0;
double _actsize = 0;
 //BA.debugLineNum = 798;BA.debugLine="Sub SetSize(s As Int) As VMElement";
 //BA.debugLineNum = 799;BA.debugLine="Dim eachCell As Double = 8.33";
_eachcell = 8.33;
 //BA.debugLineNum = 800;BA.debugLine="Dim actSize As Double = s * BANano.parseFloat(eac";
_actsize = _s*_banano.parseFloat((Object)(_eachcell));
 //BA.debugLineNum = 801;BA.debugLine="actSize = Round(BANano.parseFloat(actSize))";
_actsize = __c.Round(_banano.parseFloat((Object)(_actsize)));
 //BA.debugLineNum = 802;BA.debugLine="Element.AddClass($\"md-size-${actSize}\"$)";
_element._addclass /*b4j.example.vuehtml*/ (("md-size-"+__c.SmartStringFormatter("",(Object)(_actsize))+""));
 //BA.debugLineNum = 803;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 804;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsizes(int _xsmall,int _small,int _medium,int _large,int _xlarge) throws Exception{
anywheresoftware.b4a.objects.collections.List _sizes = null;
double _eachcell = 0;
String _eachsize = "";
double _xsmalld = 0;
double _smalld = 0;
double _mediumd = 0;
double _larged = 0;
double _xlarged = 0;
String _strsizes = "";
 //BA.debugLineNum = 752;BA.debugLine="Sub SetSizes(xsmall As Int, small As Int, medium A";
 //BA.debugLineNum = 753;BA.debugLine="Dim sizes As List";
_sizes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 754;BA.debugLine="sizes.Initialize";
_sizes.Initialize();
 //BA.debugLineNum = 755;BA.debugLine="Dim eachCell As Double = 8.33";
_eachcell = 8.33;
 //BA.debugLineNum = 756;BA.debugLine="Dim eachSize As String";
_eachsize = "";
 //BA.debugLineNum = 758;BA.debugLine="If xsmall > 0 Then";
if (_xsmall>0) { 
 //BA.debugLineNum = 759;BA.debugLine="Dim xsmallD As Double = xsmall * BANano.parseFlo";
_xsmalld = _xsmall*_banano.parseFloat((Object)(_eachcell));
 //BA.debugLineNum = 760;BA.debugLine="xsmallD = Round(BANano.parseFloat(xsmallD))";
_xsmalld = __c.Round(_banano.parseFloat((Object)(_xsmalld)));
 //BA.debugLineNum = 761;BA.debugLine="eachSize = 	$\"md-xsmall-size-${xsmallD}\"$";
_eachsize = ("md-xsmall-size-"+__c.SmartStringFormatter("",(Object)(_xsmalld))+"");
 //BA.debugLineNum = 762;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
 //BA.debugLineNum = 765;BA.debugLine="If small > 0 Then";
if (_small>0) { 
 //BA.debugLineNum = 766;BA.debugLine="Dim smallD As Double = small * BANano.parseFloat";
_smalld = _small*_banano.parseFloat((Object)(_eachcell));
 //BA.debugLineNum = 767;BA.debugLine="smallD = Round(BANano.parseFloat(smallD))";
_smalld = __c.Round(_banano.parseFloat((Object)(_smalld)));
 //BA.debugLineNum = 768;BA.debugLine="eachSize = 	$\"md-small-size-${smallD}\"$";
_eachsize = ("md-small-size-"+__c.SmartStringFormatter("",(Object)(_smalld))+"");
 //BA.debugLineNum = 769;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
 //BA.debugLineNum = 772;BA.debugLine="If medium > 0 Then";
if (_medium>0) { 
 //BA.debugLineNum = 773;BA.debugLine="Dim mediumD As Double = medium * BANano.parseFlo";
_mediumd = _medium*_banano.parseFloat((Object)(_eachcell));
 //BA.debugLineNum = 774;BA.debugLine="mediumD = Round(BANano.parseFloat(mediumD))";
_mediumd = __c.Round(_banano.parseFloat((Object)(_mediumd)));
 //BA.debugLineNum = 775;BA.debugLine="eachSize = 	$\"md-medium-size-${mediumD}\"$";
_eachsize = ("md-medium-size-"+__c.SmartStringFormatter("",(Object)(_mediumd))+"");
 //BA.debugLineNum = 776;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
 //BA.debugLineNum = 779;BA.debugLine="If large > 0 Then";
if (_large>0) { 
 //BA.debugLineNum = 780;BA.debugLine="Dim largeD As Double = large * BANano.parseFloat";
_larged = _large*_banano.parseFloat((Object)(_eachcell));
 //BA.debugLineNum = 781;BA.debugLine="largeD = Round(BANano.parseFloat(largeD))";
_larged = __c.Round(_banano.parseFloat((Object)(_larged)));
 //BA.debugLineNum = 782;BA.debugLine="eachSize = 	$\"md-large-size-${largeD}\"$";
_eachsize = ("md-large-size-"+__c.SmartStringFormatter("",(Object)(_larged))+"");
 //BA.debugLineNum = 783;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
 //BA.debugLineNum = 786;BA.debugLine="If xlarge > 0 Then";
if (_xlarge>0) { 
 //BA.debugLineNum = 787;BA.debugLine="Dim xlargeD As Double = xlarge * BANano.parseFlo";
_xlarged = _xlarge*_banano.parseFloat((Object)(_eachcell));
 //BA.debugLineNum = 788;BA.debugLine="xlargeD = Round(BANano.parseFloat(xlargeD))";
_xlarged = __c.Round(_banano.parseFloat((Object)(_xlarged)));
 //BA.debugLineNum = 789;BA.debugLine="eachSize = 	$\"md-xlarge-size-${xlargeD}\"$";
_eachsize = ("md-xlarge-size-"+__c.SmartStringFormatter("",(Object)(_xlarged))+"");
 //BA.debugLineNum = 790;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
 //BA.debugLineNum = 793;BA.debugLine="Dim strSizes As String = Element.join(\" \", sizes)";
_strsizes = _element._join /*String*/ (" ",_sizes);
 //BA.debugLineNum = 794;BA.debugLine="Element.AddClass(strSizes)";
_element._addclass /*b4j.example.vuehtml*/ (_strsizes);
 //BA.debugLineNum = 795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setslot(String _sltvalue) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetSlot(sltValue As String) As VMElement";
 //BA.debugLineNum = 177;BA.debugLine="Element.SetAttr(\"slot\", sltValue)";
_element._setattr /*b4j.example.vuehtml*/ ("slot",_sltvalue);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setslotscope(String _sltvalue) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetSlotScope(sltValue As String) As VMElement";
 //BA.debugLineNum = 187;BA.debugLine="Element.SetAttr(\"slot-scope\", sltValue)";
_element._setattr /*b4j.example.vuehtml*/ ("slot-scope",_sltvalue);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsrc(String _s,boolean _bind) throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Sub SetSRC(s As String, bind As Boolean) As VMElem";
 //BA.debugLineNum = 615;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 616;BA.debugLine="SetAttr(CreateMap(\":src\":s))";
_setattr(__c.createMap(new Object[] {(Object)(":src"),(Object)(_s)}));
 }else {
 //BA.debugLineNum = 618;BA.debugLine="SetAttr(CreateMap(\"src\":s))";
_setattr(__c.createMap(new Object[] {(Object)("src"),(Object)(_s)}));
 };
 //BA.debugLineNum = 620;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Sub SetStyle(m As Map) As VMElement";
 //BA.debugLineNum = 414;BA.debugLine="Element.SetStyles(m)";
_element._setstyles /*b4j.example.vuehtml*/ (_m);
 //BA.debugLineNum = 415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setstylesingle(String _prop,Object _val) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 42;BA.debugLine="Sub SetStyleSingle(prop As String, val As Object)";
 //BA.debugLineNum = 43;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 44;BA.debugLine="attr.Put(prop, val)";
_attr.Put((Object)(_prop),_val);
 //BA.debugLineNum = 45;BA.debugLine="SetStyle(attr)";
_setstyle(_attr);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsubhead(boolean _b) throws Exception{
 //BA.debugLineNum = 690;BA.debugLine="Sub SetSubHead(b As Boolean) As VMElement";
 //BA.debugLineNum = 691;BA.debugLine="Element.AddClass(\"md-subhead\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-subhead");
 //BA.debugLineNum = 692;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsubheading(boolean _b) throws Exception{
 //BA.debugLineNum = 684;BA.debugLine="Sub SetSubHeading(b As Boolean) As VMElement";
 //BA.debugLineNum = 685;BA.debugLine="Element.AddClass(\"md-subheading\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-subheading");
 //BA.debugLineNum = 686;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetTabIndex(ti As String) As VMElement";
 //BA.debugLineNum = 114;BA.debugLine="Element.SetTabIndex(ti)";
_element._settabindex /*b4j.example.vuehtml*/ (_ti);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settag(String _t) throws Exception{
 //BA.debugLineNum = 841;BA.debugLine="Sub SetTag(t As String) As VMElement";
 //BA.debugLineNum = 842;BA.debugLine="Element.SetTag(t)";
_element._settag /*b4j.example.vuehtml*/ (_t);
 //BA.debugLineNum = 843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagappcontent(boolean _b) throws Exception{
 //BA.debugLineNum = 567;BA.debugLine="Sub SetTagAppContent(b As Boolean) As VMElement";
 //BA.debugLineNum = 568;BA.debugLine="Element.SetTag(\"md-app-content\")";
_element._settag /*b4j.example.vuehtml*/ ("md-app-content");
 //BA.debugLineNum = 569;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagdialogactions(boolean _b) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub SetTagDialogActions(b As Boolean) As VMElement";
 //BA.debugLineNum = 467;BA.debugLine="Element.SetTag(\"md-dialog-actions\")";
_element._settag /*b4j.example.vuehtml*/ ("md-dialog-actions");
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagdialogtitle(boolean _b) throws Exception{
 //BA.debugLineNum = 481;BA.debugLine="Sub SetTagDialogTitle(b As Boolean) As VMElement";
 //BA.debugLineNum = 482;BA.debugLine="Element.SetTag(\"md-dialog-title\")";
_element._settag /*b4j.example.vuehtml*/ ("md-dialog-title");
 //BA.debugLineNum = 483;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagicon(boolean _b) throws Exception{
 //BA.debugLineNum = 653;BA.debugLine="Sub SetTagIcon(b As Boolean) As VMElement";
 //BA.debugLineNum = 654;BA.debugLine="Element.SetTag(\"md-icon\")";
_element._settag /*b4j.example.vuehtml*/ ("md-icon");
 //BA.debugLineNum = 655;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settaglistitem(boolean _b) throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Sub SetTagListItem(b As Boolean) As VMElement";
 //BA.debugLineNum = 659;BA.debugLine="Element.settag(\"md-list-item\")";
_element._settag /*b4j.example.vuehtml*/ ("md-list-item");
 //BA.debugLineNum = 660;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 661;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagspan(boolean _b) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Sub SetTagSpan(b As Boolean) As VMElement";
 //BA.debugLineNum = 664;BA.debugLine="Element.SetTag(\"span\")";
_element._settag /*b4j.example.vuehtml*/ ("span");
 //BA.debugLineNum = 665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagsubheader(boolean _b) throws Exception{
 //BA.debugLineNum = 697;BA.debugLine="Sub SetTagSubHeader(b As Boolean) As VMElement";
 //BA.debugLineNum = 698;BA.debugLine="Element.SetTag(\"md-subheader\")";
_element._settag /*b4j.example.vuehtml*/ ("md-subheader");
 //BA.debugLineNum = 699;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 700;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settemplate(Object _tmp) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetTemplate(tmp As Object) As VMElement";
 //BA.debugLineNum = 315;BA.debugLine="Element.Clear";
_element._clear /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 316;BA.debugLine="Element.SetText(tmp)";
_element._settext /*b4j.example.vuehtml*/ (BA.ObjectToString(_tmp));
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setterm(String _term) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetTerm(term As String) As VMElement";
 //BA.debugLineNum = 182;BA.debugLine="Element.SetAttr(\":md-term\", term)";
_element._setattr /*b4j.example.vuehtml*/ (":md-term",_term);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settext(String _t) throws Exception{
 //BA.debugLineNum = 856;BA.debugLine="Sub SetText(t As String) As VMElement";
 //BA.debugLineNum = 857;BA.debugLine="Element.SetText(t)";
_element._settext /*b4j.example.vuehtml*/ (_t);
 //BA.debugLineNum = 858;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 859;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 860;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settextaligncenter() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SetTextAlignCenter As VMElement";
 //BA.debugLineNum = 166;BA.debugLine="SetStyle(CreateMap(\"text-align\": \"center\"))";
_setstyle(__c.createMap(new Object[] {(Object)("text-align"),(Object)("center")}));
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settitle(boolean _b) throws Exception{
 //BA.debugLineNum = 599;BA.debugLine="Sub SetTitle(b As Boolean) As VMElement";
 //BA.debugLineNum = 600;BA.debugLine="Element.AddClass(\"md-title\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-title");
 //BA.debugLineNum = 601;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 602;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setto(Object _t) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub SetTo(t As Object) As VMElement";
 //BA.debugLineNum = 496;BA.debugLine="Element.SetAttr(\"to\", t)";
_element._setattr /*b4j.example.vuehtml*/ ("to",BA.ObjectToString(_t));
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settransparent(boolean _b) throws Exception{
 //BA.debugLineNum = 609;BA.debugLine="Sub SetTransparent(b As Boolean) As VMElement";
 //BA.debugLineNum = 610;BA.debugLine="Element.AddClass(\"md-transparent\")";
_element._addclass /*b4j.example.vuehtml*/ ("md-transparent");
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settype(String _typeof) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetType(typeof As String) As VMElement";
 //BA.debugLineNum = 192;BA.debugLine="Element.SetAttr(\"type\", typeof)";
_element._setattr /*b4j.example.vuehtml*/ ("type",_typeof);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvalue(String _valuename,boolean _bind) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
 //BA.debugLineNum = 302;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 303;BA.debugLine="RemoveAttr(\"value\")";
_removeattr("value");
 //BA.debugLineNum = 304;BA.debugLine="valueName = valueName.tolowercase";
_valuename = _valuename.toLowerCase();
 //BA.debugLineNum = 305;BA.debugLine="SetAttr(CreateMap(\":value\":valueName))";
_setattr(__c.createMap(new Object[] {(Object)(":value"),(Object)(_valuename)}));
 }else {
 //BA.debugLineNum = 307;BA.debugLine="RemoveAttr(\":value\")";
_removeattr(":value");
 //BA.debugLineNum = 308;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
_setattr(__c.createMap(new Object[] {(Object)("value"),(Object)(_valuename)}));
 };
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvbind(String _t) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetVBind(t As String) As VMElement";
 //BA.debugLineNum = 272;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 273;BA.debugLine="SetAttr(CreateMap(\"v-bind\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-bind"),(Object)(_t)}));
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvbindis(String _t) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetVBindIs(t As String) As VMElement";
 //BA.debugLineNum = 278;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 279;BA.debugLine="SetAttr(CreateMap(\"v-bind:is\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-bind:is"),(Object)(_t)}));
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvcloak() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetVCloak As VMElement";
 //BA.debugLineNum = 104;BA.debugLine="Element.setvcloak";
_element._setvcloak /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvelse(Object _t) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetVElse(t As Object) As VMElement";
 //BA.debugLineNum = 257;BA.debugLine="SetAttr(CreateMap(\"v-else\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-else"),_t}));
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvelseif(Object _t) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetVElseIf(t As Object) As VMElement";
 //BA.debugLineNum = 262;BA.debugLine="SetAttr(CreateMap(\"v-else-if\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-else-if"),_t}));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setverticalalignmiddle() throws Exception{
 //BA.debugLineNum = 628;BA.debugLine="Sub SetVerticalAlignMiddle As VMElement";
 //BA.debugLineNum = 629;BA.debugLine="SetStyle(CreateMap(\"vertical-align\": \"middle\"))";
_setstyle(__c.createMap(new Object[] {(Object)("vertical-align"),(Object)("middle")}));
 //BA.debugLineNum = 630;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 631;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 290;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 291;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 292;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 293;BA.debugLine="If vue.StateExists(dataSource) = False Then vue.S";
if (_vue._stateexists /*boolean*/ (_datasource)==__c.False) { 
_vue._setstatesingle /*b4j.example.bananovue*/ (_datasource,(Object)(new Object[]{}));};
 //BA.debugLineNum = 294;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 295;BA.debugLine="SetAttr(CreateMap(\"v-for\": sline))";
_setattr(__c.createMap(new Object[] {(Object)("v-for"),(Object)(_sline)}));
 //BA.debugLineNum = 296;BA.debugLine="RemoveAttr(\"ref\")";
_removeattr("ref");
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvhtml(String _h) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetVHtml(h As String) As VMElement";
 //BA.debugLineNum = 321;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 322;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
 //BA.debugLineNum = 323;BA.debugLine="Element.SetAttr(\"v-html\", h)";
_element._setattr /*b4j.example.vuehtml*/ ("v-html",_h);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetVIf(vif As String) As VMElement";
 //BA.debugLineNum = 367;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
 //BA.debugLineNum = 368;BA.debugLine="If vue.HasState(vif) = False Then vue.SetStateFal";
if (_vue._hasstate /*boolean*/ (_vif)==__c.False) { 
_vue._setstatefalse /*b4j.example.bananovue*/ (_vif);};
 //BA.debugLineNum = 369;BA.debugLine="Element.SetVIf(vif)";
_element._setvif /*b4j.example.vuehtml*/ ((Object)(_vif));
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetVisible(b As Boolean) As VMElement";
 //BA.debugLineNum = 78;BA.debugLine="vue.SetStateSingle(showKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(_b));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvmodel(String _k) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 829;BA.debugLine="Sub SetVModel(k As String) As VMElement";
 //BA.debugLineNum = 830;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 831;BA.debugLine="If vue.HasState(k) = False Then";
if (_vue._hasstate /*boolean*/ (_k)==__c.False) { 
 //BA.debugLineNum = 832;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 833;BA.debugLine="opt.Put(k, Null)";
_opt.Put((Object)(_k),__c.Null);
 //BA.debugLineNum = 834;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 };
 //BA.debugLineNum = 836;BA.debugLine="Element.SetAttr(\"v-model\", k)";
_element._setattr /*b4j.example.vuehtml*/ ("v-model",_k);
 //BA.debugLineNum = 837;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 838;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvon(Object _t) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetVOn(t As Object) As VMElement";
 //BA.debugLineNum = 267;BA.debugLine="SetAttr(CreateMap(\"v-on\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-on"),_t}));
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvonce(Object _t) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetVOnce(t As Object) As VMElement";
 //BA.debugLineNum = 284;BA.debugLine="SetAttr(CreateMap(\"v-once\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-once"),_t}));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetVShow(vif As String) As VMElement";
 //BA.debugLineNum = 374;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
 //BA.debugLineNum = 375;BA.debugLine="If vue.HasState(vif) = False Then vue.SetStateFal";
if (_vue._hasstate /*boolean*/ (_vif)==__c.False) { 
_vue._setstatefalse /*b4j.example.bananovue*/ (_vif);};
 //BA.debugLineNum = 376;BA.debugLine="Element.SetVShow(vif)";
_element._setvshow /*b4j.example.vuehtml*/ ((Object)(_vif));
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvtext(Object _t) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetVText(t As Object) As VMElement";
 //BA.debugLineNum = 252;BA.debugLine="SetAttr(CreateMap(\"v-text\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-text"),_t}));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setwaterfall(boolean _b) throws Exception{
 //BA.debugLineNum = 543;BA.debugLine="Sub SetWaterfall(b As Boolean) As VMElement";
 //BA.debugLineNum = 544;BA.debugLine="Element.SetAttr(\":md-waterfall\", b)";
_element._setattr /*b4j.example.vuehtml*/ (":md-waterfall",BA.ObjectToString(_b));
 //BA.debugLineNum = 545;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetWidth(w As String) As VMElement";
 //BA.debugLineNum = 135;BA.debugLine="SetStyle(CreateMap(\"width\":w))";
_setstyle(__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _show() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Show As VMElement";
 //BA.debugLineNum = 68;BA.debugLine="vue.SetStateSingle(showKey, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(__c.True));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 884;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 885;BA.debugLine="Return Element.tostring";
if (true) return _element._tostring /*String*/ ();
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
