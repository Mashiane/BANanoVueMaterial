package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsnackbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsnackbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsnackbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _snackbar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _bactive = false;
public Object _module = null;
public String _mkey = "";
public b4j.example.vmbutton _button = null;
public String _mname = "";
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
public b4j.example.vmsnackbar  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 83;BA.debugLine="Sub AddChild(child As VMElement) As VMSnackbar";
 //BA.debugLineNum = 84;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 85;BA.debugLine="Snackbar.SetText(childHTML)";
_snackbar._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 128;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 129;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub AddClass(c As String) As VMSnackbar";
 //BA.debugLineNum = 110;BA.debugLine="Snackbar.AddClass(c)";
_snackbar._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Snackbar As VMElement";
_snackbar = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
_bactive = false;
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private mKey As String";
_mkey = "";
 //BA.debugLineNum = 10;BA.debugLine="Public Button As VMButton";
_button = new b4j.example.vmbutton();
 //BA.debugLineNum = 11;BA.debugLine="Private mName As String";
_mname = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 71;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 72;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(_id),(Object)(__c.False));
 //BA.debugLineNum = 73;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Snackbar.Initialize(v, ID)";
_snackbar._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="Snackbar.SetTag(\"md-snackbar\")";
_snackbar._settag /*b4j.example.vmelement*/ ("md-snackbar");
 //BA.debugLineNum = 19;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="bActive = False";
_bactive = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 23;BA.debugLine="SetActiveSync(ID)";
_setactivesync(_id);
 };
 //BA.debugLineNum = 25;BA.debugLine="SetOnOpened";
_setonopened();
 //BA.debugLineNum = 26;BA.debugLine="SetOnClosed";
_setonclosed();
 //BA.debugLineNum = 27;BA.debugLine="mKey = $\"${ID}message\"$";
_mkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"message");
 //BA.debugLineNum = 28;BA.debugLine="vue.SetStateSingle(mKey, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_mkey,__c.Null);
 //BA.debugLineNum = 29;BA.debugLine="SetText1($\"{{ ${mKey} }}\"$)";
_settext1(("{{ "+__c.SmartStringFormatter("",(Object)(_mkey))+" }}"));
 //BA.debugLineNum = 30;BA.debugLine="Button.Initialize(vue, \"snackbutton\", Me)";
_button._initialize /*b4j.example.vmbutton*/ (ba,_vue,"snackbutton",this);
 //BA.debugLineNum = 31;BA.debugLine="mName = \"\"";
_mname = "";
 //BA.debugLineNum = 32;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 105;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Render";
 //BA.debugLineNum = 67;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsnackbar  _setactivesync(String _v) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="private Sub SetActiveSync(v As String) As VMSnackb";
 //BA.debugLineNum = 60;BA.debugLine="Snackbar.SetActiveSync(v)";
_snackbar._setactivesync /*b4j.example.vmelement*/ (_v);
 //BA.debugLineNum = 61;BA.debugLine="bActive = True";
_bactive = __c.True;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetAttr(attr As Map) As VMSnackbar";
 //BA.debugLineNum = 116;BA.debugLine="Snackbar.SetAttr(attr)";
_snackbar._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setduration(int _varduration) throws Exception{
String _pp = "";
 //BA.debugLineNum = 140;BA.debugLine="Sub SetDuration(varDuration As Int) As VMSnackbar";
 //BA.debugLineNum = 141;BA.debugLine="Dim pp As String = $\"${ID}duration\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"duration");
 //BA.debugLineNum = 142;BA.debugLine="vue.SetStateSingle(pp, varDuration)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varduration));
 //BA.debugLineNum = 143;BA.debugLine="SetAttr(CreateMap(\":md-duration\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-duration"),(Object)(_pp)}));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setonclick(String _methodname) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetOnClick(methodName As String) As VMSnackbar";
 //BA.debugLineNum = 38;BA.debugLine="mName = methodName.ToLowerCase";
_mname = _methodname.toLowerCase();
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setonclosed() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 188;BA.debugLine="private Sub SetOnClosed As VMSnackbar";
 //BA.debugLineNum = 189;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_closed");
 //BA.debugLineNum = 190;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 191;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 192;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 193;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
 //BA.debugLineNum = 195;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setonopened() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 176;BA.debugLine="private Sub SetOnOpened As VMSnackbar";
 //BA.debugLineNum = 177;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_opened");
 //BA.debugLineNum = 178;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmsnackbar)(this);};
 //BA.debugLineNum = 179;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 180;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 181;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
 //BA.debugLineNum = 183;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetPadding(p As Object) As VMSnackbar";
 //BA.debugLineNum = 135;BA.debugLine="Snackbar.SetPaddingAll(p)";
_snackbar._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpersistent(boolean _varpersistent) throws Exception{
String _pp = "";
 //BA.debugLineNum = 148;BA.debugLine="Sub SetPersistent(varPersistent As Boolean) As VMS";
 //BA.debugLineNum = 149;BA.debugLine="Dim pp As String = $\"${ID}persistent\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"persistent");
 //BA.debugLineNum = 150;BA.debugLine="vue.SetStateSingle(pp, varPersistent)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varpersistent));
 //BA.debugLineNum = 151;BA.debugLine="SetAttr(CreateMap(\":md-persistent\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-persistent"),(Object)(_pp)}));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setposition(Object _varposition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub SetPosition(varPosition As Object) As VMSnackb";
 //BA.debugLineNum = 157;BA.debugLine="Dim pp As String = $\"${ID}position\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"position");
 //BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(pp, varPosition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varposition);
 //BA.debugLineNum = 159;BA.debugLine="SetAttr(CreateMap(\":md-position\": pp))";
_setattr(__c.createMap(new Object[] {(Object)(":md-position"),(Object)(_pp)}));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpositioncenter(boolean _b) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetPositionCenter(b As Boolean) As VMSnackbar";
 //BA.debugLineNum = 165;BA.debugLine="SetPosition(\"center\")";
_setposition((Object)("center"));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setpositionleft(boolean _b) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub SetPositionLeft(b As Boolean) As VMSnackbar";
 //BA.debugLineNum = 171;BA.debugLine="SetPosition(\"left\")";
_setposition((Object)("left"));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetStyle(sm As Map) As VMSnackbar";
 //BA.debugLineNum = 122;BA.debugLine="Snackbar.SetStyle(sm)";
_snackbar._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settext(String _t) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetText(t As String) As VMSnackbar";
 //BA.debugLineNum = 91;BA.debugLine="vue.SetStateSingle(mKey, t)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_mkey,(Object)(_t));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _settext1(String _t) throws Exception{
b4j.example.vmelement _span = null;
 //BA.debugLineNum = 96;BA.debugLine="private Sub SetText1(t As String) As VMSnackbar";
 //BA.debugLineNum = 97;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
 //BA.debugLineNum = 98;BA.debugLine="span.Initialize(vue,$\"${ID}text\"$).SetTag(\"span\")";
_span._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"text"))._settag /*b4j.example.vmelement*/ ("span")._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 99;BA.debugLine="span.Pop(Snackbar)";
_span._pop /*String*/ (_snackbar);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsnackbar)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 76;BA.debugLine="Sub Show";
 //BA.debugLineNum = 77;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 78;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(_id),(Object)(__c.True));
 //BA.debugLineNum = 79;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _snackbutton_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub snackbutton_click(e As BANanoEvent)";
 //BA.debugLineNum = 43;BA.debugLine="If mName = \"\" Then";
if ((_mname).equals("")) { 
 //BA.debugLineNum = 44;BA.debugLine="Log($\"VMSnackbar.snackbutton_click: 'SetOnClick'";
__c.Log(("VMSnackbar.snackbutton_click: 'SetOnClick' has not been set!"));
 };
 //BA.debugLineNum = 46;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 47;BA.debugLine="BANano.CallSub(module, mName, Null)";
_banano.CallSub(_module,_mname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 52;BA.debugLine="If bActive = False Then";
if (_bactive==__c.False) { 
 //BA.debugLineNum = 53;BA.debugLine="Log($\"VMSnackbar.SetActiveSync: '${ID}' has not";
__c.Log(("VMSnackbar.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(_id))+"' has not been activated!"));
 };
 //BA.debugLineNum = 55;BA.debugLine="Button.Pop(Snackbar)";
_button._pop /*String*/ (_snackbar);
 //BA.debugLineNum = 56;BA.debugLine="Return Snackbar.ToString";
if (true) return _snackbar._tostring /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
