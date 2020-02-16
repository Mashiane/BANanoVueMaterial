package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmfield", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmfield.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _field = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
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
public b4j.example.vmfield  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub AddChild(child As VMElement) As VMField";
 //BA.debugLineNum = 66;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 67;BA.debugLine="Field.SetText(childHTML)";
_field._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 111;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 112;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 113;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfield  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub AddClass(c As String) As VMField";
 //BA.debugLineNum = 94;BA.debugLine="Field.AddClass(c)";
_field._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Field As VMElement";
_field = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private errKey As String";
_errkey = "";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public Object  _fielderror() throws Exception{
boolean _errmodel = false;
anywheresoftware.b4a.objects.collections.Map _obj = null;
 //BA.debugLineNum = 31;BA.debugLine="private Sub FieldError As Object";
 //BA.debugLineNum = 32;BA.debugLine="Dim errModel As Boolean = vue.GetState(errKey, Fa";
_errmodel = BA.ObjectToBoolean(_vue._getstate /*Object*/ (_errkey,(Object)(__c.False)));
 //BA.debugLineNum = 33;BA.debugLine="Dim obj As Map = CreateMap()";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj = __c.createMap(new Object[] {});
 //BA.debugLineNum = 34;BA.debugLine="obj.Put(\"md-invalid\", errModel)";
_obj.Put((Object)("md-invalid"),(Object)(_errmodel));
 //BA.debugLineNum = 35;BA.debugLine="Return obj";
if (true) return (Object)(_obj.getObject());
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _parentid,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, parentID As";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Field.Initialize(v, ID)";
_field._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="Field.SetTag(\"md-field\")";
_field._settag /*b4j.example.vmelement*/ ("md-field");
 //BA.debugLineNum = 16;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="Field.SetOnClear(module, $\"${ID}_clear\"$)";
_field._setonclear /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_clear"));
 //BA.debugLineNum = 19;BA.debugLine="errKey = $\"${parentID}error\"$";
_errkey = (""+__c.SmartStringFormatter("",(Object)(_parentid))+"error");
 //BA.debugLineNum = 20;BA.debugLine="vue.SetStateSingle(errKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_errkey,(Object)(__c.False));
 //BA.debugLineNum = 21;BA.debugLine="Field.SetAttr(CreateMap(\":class\":errKey & \"class\"";
_field._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":class"),(Object)(_errkey+"class")}));
 //BA.debugLineNum = 22;BA.debugLine="vue.SetComputed(errKey & \"class\", Me, \"FieldError";
_vue._setcomputed /*b4j.example.bananovue*/ (_errkey+"class",this,"FieldError");
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 89;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Render";
 //BA.debugLineNum = 61;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfield  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetAccent(b As Boolean) As VMField";
 //BA.debugLineNum = 83;BA.debugLine="Field.SetAccent(True)";
_field._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetAttr(attr As Map) As VMField";
 //BA.debugLineNum = 100;BA.debugLine="Field.SetAttr(attr)";
_field._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setclearable(boolean _varclearable) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMFie";
 //BA.debugLineNum = 137;BA.debugLine="SetAttr(CreateMap(\":md-clearable\": varClearable))";
_setattr(__c.createMap(new Object[] {(Object)(":md-clearable"),(Object)(_varclearable)}));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setcounter(boolean _varcounter) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetCounter(varCounter As Boolean) As VMField";
 //BA.debugLineNum = 131;BA.debugLine="SetAttr(CreateMap(\":md-counter\": varCounter))";
_setattr(__c.createMap(new Object[] {(Object)(":md-counter"),(Object)(_varcounter)}));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setinline(boolean _varinline) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetInline(varInline As Boolean) As VMField";
 //BA.debugLineNum = 125;BA.debugLine="SetAttr(CreateMap(\":md-inline\": varInline))";
_setattr(__c.createMap(new Object[] {(Object)(":md-inline"),(Object)(_varinline)}));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setmaxwidth(String _mw) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetMaxWidth(mw As String) As VMField";
 //BA.debugLineNum = 27;BA.debugLine="Field.SetMaxWidth(mw)";
_field._setmaxwidth /*b4j.example.vmelement*/ (_mw);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetPadding(p As Object) As VMField";
 //BA.debugLineNum = 119;BA.debugLine="Field.SetPaddingAll(p)";
_field._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetPrimary(b As Boolean) As VMField";
 //BA.debugLineNum = 78;BA.debugLine="Field.SetPrimary(True)";
_field._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetStyle(sm As Map) As VMField";
 //BA.debugLineNum = 106;BA.debugLine="Field.SetStyle(sm)";
_field._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetText(t As Object) As VMField";
 //BA.debugLineNum = 73;BA.debugLine="Field.SetText(t)";
_field._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _settogglepassword(boolean _vartogglepassword) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetTogglePassword(varTogglePassword As Boolean";
 //BA.debugLineNum = 143;BA.debugLine="SetAttr(CreateMap(\":md-toggle-password\": varToggl";
_setattr(__c.createMap(new Object[] {(Object)(":md-toggle-password"),(Object)(_vartogglepassword)}));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetVIf(vif As Object) As VMField";
 //BA.debugLineNum = 50;BA.debugLine="Field.SetVIf(vif)";
_field._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetVModel(k As String) As VMField";
 //BA.debugLineNum = 45;BA.debugLine="Field.SetVModel(k)";
_field._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetVShow(vif As Object) As VMField";
 //BA.debugLineNum = 55;BA.debugLine="Field.SetVShow(vif)";
_field._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 41;BA.debugLine="Return Field.ToString";
if (true) return _field._tostring /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
