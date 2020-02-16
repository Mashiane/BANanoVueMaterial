package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfile extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmfile", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmfile.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _fileo = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmfield _fileint = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public boolean _haserror = false;
public b4j.example.vmelement _he = null;
public String _vmodel = "";
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
public b4j.example.vmfile  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 137;BA.debugLine="Sub AddChild(child As VMElement) As VMFile";
 //BA.debugLineNum = 138;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 139;BA.debugLine="FileO.SetText(childHTML)";
_fileo._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 183;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 184;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 185;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfile  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub AddClass(c As String) As VMFile";
 //BA.debugLineNum = 166;BA.debugLine="FileO.AddClass(c)";
_fileo._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 227;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public FileO As VMElement";
_fileo = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private FileInt As VMField";
_fileint = new b4j.example.vmfield();
 //BA.debugLineNum = 8;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 9;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
 //BA.debugLineNum = 10;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private hasError As Boolean";
_haserror = false;
 //BA.debugLineNum = 12;BA.debugLine="Private he As VMElement";
_he = new b4j.example.vmelement();
 //BA.debugLineNum = 13;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 14;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfile  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
Object _flist = null;
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 20;BA.debugLine="FileO.Initialize(v, ID)";
_fileo._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 21;BA.debugLine="FileO.SetTag(\"md-file\")";
_fileo._settag /*b4j.example.vmelement*/ ("md-file");
 //BA.debugLineNum = 22;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 23;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 24;BA.debugLine="FileInt.Initialize(v, ID,  $\"${ID}field\"$, module";
_fileint._initialize /*b4j.example.vmfield*/ (ba,_v,_id,(""+__c.SmartStringFormatter("",(Object)(_id))+"field"),_module);
 //BA.debugLineNum = 25;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"label"));
 //BA.debugLineNum = 26;BA.debugLine="hasHelp = False";
_hashelp = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="hasError = False";
_haserror = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 29;BA.debugLine="Dim fList As Object";
_flist = new Object();
 //BA.debugLineNum = 30;BA.debugLine="SetOnChange(fList)";
_setonchange(_flist);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 161;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub Render";
 //BA.debugLineNum = 133;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfile  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetAccent(b As Boolean) As VMFile";
 //BA.debugLineNum = 155;BA.debugLine="FileO.SetAccent(True)";
_fileo._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setaccept(Object _accept) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetAccept(accept As Object) As VMFile";
 //BA.debugLineNum = 67;BA.debugLine="FileO.SetAttr(CreateMap(\"accept\": accept))";
_fileo._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("accept"),_accept}));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setacceptimages() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetAcceptImages As VMFile";
 //BA.debugLineNum = 46;BA.debugLine="SetAttr(CreateMap(\"accept\":\"image/*\"))";
_setattr(__c.createMap(new Object[] {(Object)("accept"),(Object)("image/*")}));
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetAttr(attr As Map) As VMFile";
 //BA.debugLineNum = 172;BA.debugLine="FileO.SetAttr(attr)";
_fileo._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setclearable(boolean _varclearable) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMFil";
 //BA.debugLineNum = 222;BA.debugLine="FileInt.SetClearable(varClearable)";
_fileint._setclearable /*b4j.example.vmfield*/ (_varclearable);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetDisabled(b As Boolean) As VMFile";
 //BA.debugLineNum = 202;BA.debugLine="FileO.SetDisabled(b)";
_fileo._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _seterrortext(String _t) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetErrorText(t As String) As VMFile";
 //BA.debugLineNum = 101;BA.debugLine="hasError = True";
_haserror = __c.True;
 //BA.debugLineNum = 102;BA.debugLine="he = FileO.SetErrorText(t)";
_he = _fileo._seterrortext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _sethelpertext(String _t) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetHelperText(t As String) As VMFile";
 //BA.debugLineNum = 95;BA.debugLine="hasHelp = True";
_hashelp = __c.True;
 //BA.debugLineNum = 96;BA.debugLine="ht = FileO.SetHelperText(t)";
_ht = _fileo._sethelpertext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setinline(boolean _varinline) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetInline(varInline As Boolean) As VMFile";
 //BA.debugLineNum = 216;BA.debugLine="FileInt.SetInline(varInline)";
_fileint._setinline /*b4j.example.vmfield*/ (_varinline);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setlabel(Object _l) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetLabel(l As Object) As VMFile";
 //BA.debugLineNum = 77;BA.debugLine="lbl.SetText(l)";
_lbl._settext /*b4j.example.vmlabel*/ (BA.ObjectToString(_l));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setmultiple(boolean _b) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetMultiple(b As Boolean) As VMFile";
 //BA.debugLineNum = 62;BA.debugLine="FileO.SetAttr(CreateMap(\":multiple\": b))";
_fileo._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":multiple"),(Object)(_b)}));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 36;BA.debugLine="FileO.SetName(varName, bind)";
_fileo._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setonchange(Object _filelist) throws Exception{
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 51;BA.debugLine="private Sub SetOnChange(fileList As Object) As VMF";
 //BA.debugLineNum = 52;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 53;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfile)(this);};
 //BA.debugLineNum = 54;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_filelist}))));
 //BA.debugLineNum = 55;BA.debugLine="SetAttr(CreateMap(\"v-on:md-change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-change"),(Object)(_methodname)}));
 //BA.debugLineNum = 57;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetPadding(p As Object) As VMFile";
 //BA.debugLineNum = 191;BA.debugLine="FileO.SetPaddingAll(p)";
_fileo._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setplaceholder(Object _varplaceholder) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
 //BA.debugLineNum = 197;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
_setattr(__c.createMap(new Object[] {(Object)("placeholder"),_varplaceholder}));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetPrimary(b As Boolean) As VMFile";
 //BA.debugLineNum = 150;BA.debugLine="FileO.SetPrimary(True)";
_fileo._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setreadonly(boolean _b) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMFile";
 //BA.debugLineNum = 72;BA.debugLine="FileO.SetAttr(CreateMap(\":readonly\": b))";
_fileo._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":readonly"),(Object)(_b)}));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setrequired(boolean _varrequired) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMFile";
 //BA.debugLineNum = 209;BA.debugLine="FileO.SetRequired(varRequired)";
_fileo._setrequired /*b4j.example.vmelement*/ (_varrequired);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetStyle(sm As Map) As VMFile";
 //BA.debugLineNum = 178;BA.debugLine="FileO.SetStyle(sm)";
_fileo._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetTabIndex(ti As String) As VMFile";
 //BA.debugLineNum = 41;BA.debugLine="FileO.SetTabIndex(ti)";
_fileo._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub SetText(t As Object) As VMFile";
 //BA.debugLineNum = 145;BA.debugLine="FileO.SetText(t)";
_fileo._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setvalue(String _xval) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetValue(xval As String) As VMFile";
 //BA.debugLineNum = 114;BA.debugLine="If vmodel = \"\" Then";
if ((_vmodel).equals("")) { 
 //BA.debugLineNum = 115;BA.debugLine="Log($\"VMFile.SetValue ${ID} - v-model has not be";
__c.Log(("VMFile.SetValue "+__c.SmartStringFormatter("",(Object)(_id))+" - v-model has not been set!"));
 };
 //BA.debugLineNum = 117;BA.debugLine="vue.SetStateSingle(vmodel, xval)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_vmodel,(Object)(_xval));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetVIf(vif As Object) As VMFile";
 //BA.debugLineNum = 122;BA.debugLine="FileInt.SetVIf(vif)";
_fileint._setvif /*b4j.example.vmfield*/ (_vif);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetVModel(k As String) As VMFile";
 //BA.debugLineNum = 107;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 108;BA.debugLine="vue.SetStateSingle(k,Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_k,__c.Null);
 //BA.debugLineNum = 109;BA.debugLine="FileO.SetVModel(k)";
_fileo._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetVShow(vif As Object) As VMFile";
 //BA.debugLineNum = 127;BA.debugLine="FileInt.SetVShow(vif)";
_fileint._setvshow /*b4j.example.vmfield*/ (_vif);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 83;BA.debugLine="lbl.Pop(FileInt.Field)";
_lbl._pop /*String*/ (_fileint._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 84;BA.debugLine="FileO.Pop(FileInt.Field)";
_fileo._pop /*String*/ (_fileint._field /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 85;BA.debugLine="If hasHelp Then";
if (_hashelp) { 
 //BA.debugLineNum = 86;BA.debugLine="ht.Pop(FileInt.Field)";
_ht._pop /*String*/ (_fileint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 88;BA.debugLine="If hasError Then";
if (_haserror) { 
 //BA.debugLineNum = 89;BA.debugLine="he.Pop(FileInt.Field)";
_he._pop /*String*/ (_fileint._field /*b4j.example.vmelement*/ );
 };
 //BA.debugLineNum = 91;BA.debugLine="Return FileInt.tostring";
if (true) return _fileint._tostring /*String*/ ();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
