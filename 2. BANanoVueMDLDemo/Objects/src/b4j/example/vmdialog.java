package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _dialog = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmelement _actions = null;
public com.ab.banano.BANano _banano = null;
public boolean _bactive = false;
public b4j.example.vmelement _content = null;
public Object _module = null;
public b4j.example.vmcontainer _container = null;
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
public b4j.example.vmdialog  _addaction(b4j.example.vmbutton _btn) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub AddAction(btn As VMButton) As VMDialog";
 //BA.debugLineNum = 122;BA.debugLine="btn.Pop(actions)";
_btn._pop /*String*/ (_actions);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addcancel(String _btnid,String _caption) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 135;BA.debugLine="Sub AddCancel(btnID As String, Caption As String)";
 //BA.debugLineNum = 136;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 137;BA.debugLine="btn.Initialize(vue, btnID, module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module);
 //BA.debugLineNum = 138;BA.debugLine="btn.SetText(Caption).SetAccent(True)";
_btn._settext /*b4j.example.vmbutton*/ (_caption)._setaccent /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 139;BA.debugLine="btn.RemoveAttr(\":required\")";
_btn._removeattr /*b4j.example.vmbutton*/ (":required");
 //BA.debugLineNum = 140;BA.debugLine="AddAction(btn)";
_addaction(_btn);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub AddClass(c As String) As VMDialog";
 //BA.debugLineNum = 98;BA.debugLine="Dialog.AddClass(c)";
_dialog._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addcontent(b4j.example.vmelement _cnttext) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub AddContent(cntText As VMElement) As VMDialog";
 //BA.debugLineNum = 67;BA.debugLine="cntText.Pop(Content)";
_cnttext._pop /*String*/ (_content);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _addform(b4j.example.vmform _frm) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub AddForm(frm As VMForm)";
 //BA.debugLineNum = 72;BA.debugLine="AddHTML(frm.ToString)";
_addhtml(_frm._tostring /*String*/ ());
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _addhtml(String _htmlcontent) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub AddHTML(htmlContent As String)";
 //BA.debugLineNum = 76;BA.debugLine="Content.SetText(htmlContent)";
_content._settext /*b4j.example.vmelement*/ (_htmlcontent);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _addok(String _btnid,String _caption) throws Exception{
b4j.example.vmbutton _btn = null;
 //BA.debugLineNum = 126;BA.debugLine="Sub AddOK(btnID As String, Caption As String) As V";
 //BA.debugLineNum = 127;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
 //BA.debugLineNum = 128;BA.debugLine="btn.Initialize(vue, btnID, module)";
_btn._initialize /*b4j.example.vmbutton*/ (ba,_vue,_btnid,_module);
 //BA.debugLineNum = 129;BA.debugLine="btn.SetText(Caption).SetPrimary(True)";
_btn._settext /*b4j.example.vmbutton*/ (_caption)._setprimary /*b4j.example.vmbutton*/ (__c.True);
 //BA.debugLineNum = 130;BA.debugLine="btn.RemoveAttr(\":required\")";
_btn._removeattr /*b4j.example.vmbutton*/ (":required");
 //BA.debugLineNum = 131;BA.debugLine="AddAction(btn)";
_addaction(_btn);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Dialog As VMElement";
_dialog = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private actions As VMElement";
_actions = new b4j.example.vmelement();
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="Private bActive As Boolean";
_bactive = false;
 //BA.debugLineNum = 9;BA.debugLine="Private Content As VMElement";
_content = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 79;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 80;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 81;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(_id),(Object)(__c.False));
 //BA.debugLineNum = 82;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="Dialog.Initialize(vue, $\"${ID}dialog\"$).SetTag(\"m";
_dialog._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"dialog"))._settag /*b4j.example.vmelement*/ ("md-dialog");
 //BA.debugLineNum = 20;BA.debugLine="actions.Initialize(vue,$\"${ID}actions\"$).SetTag(\"";
_actions._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"actions"))._settag /*b4j.example.vmelement*/ ("md-dialog-actions");
 //BA.debugLineNum = 21;BA.debugLine="actions.RemoveAttr(\":required\")";
_actions._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 22;BA.debugLine="actions.RemoveAttr(\"v-show\")";
_actions._removeattr /*b4j.example.vmelement*/ ("v-show");
 //BA.debugLineNum = 23;BA.debugLine="bActive = False";
_bactive = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 25;BA.debugLine="SetActiveSync(ID)";
_setactivesync((Object)(_id));
 };
 //BA.debugLineNum = 27;BA.debugLine="Content.Initialize(vue,$\"${ID}content\"$).SetTag(\"";
_content._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"content"))._settag /*b4j.example.vmelement*/ ("md-dialog-content");
 //BA.debugLineNum = 28;BA.debugLine="Content.RemoveAttr(\":required\")";
_content._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 29;BA.debugLine="Container.Initialize(vue, sid & \"grid\", eventHand";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,_sid+"grid",_eventhandler);
 //BA.debugLineNum = 30;BA.debugLine="Container.RemoveAttr(\":required\")";
_container._removeattr /*b4j.example.vmcontainer*/ (":required");
 //BA.debugLineNum = 31;BA.debugLine="SetOnOpened";
_setonopened();
 //BA.debugLineNum = 32;BA.debugLine="SetOnClosed";
_setonclosed();
 //BA.debugLineNum = 33;BA.debugLine="SetOnClickedOutside";
_setonclickedoutside();
 //BA.debugLineNum = 34;BA.debugLine="Dialog.RemoveAttr(\":required\")";
_dialog._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 35;BA.debugLine="Dialog.RemoveAttr(\"v-show\")";
_dialog._removeattr /*b4j.example.vmelement*/ ("v-show");
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 178;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Render";
 //BA.debugLineNum = 174;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _setactivesync(Object _a) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="private Sub SetActiveSync(a As Object) As VMDialog";
 //BA.debugLineNum = 156;BA.debugLine="Dialog.SetActiveSync(a)";
_dialog._setactivesync /*b4j.example.vmelement*/ (BA.ObjectToString(_a));
 //BA.debugLineNum = 157;BA.debugLine="bActive = True";
_bactive = __c.True;
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetAttr(attr As Map) As VMDialog";
 //BA.debugLineNum = 104;BA.debugLine="Dialog.SetAttr(attr)";
_dialog._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setbackdrop(boolean _b) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetBackdrop(b As Boolean) As VMDialog";
 //BA.debugLineNum = 197;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-backdrop\": b))";
_dialog._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-backdrop"),(Object)(_b)}));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setclickoutsidetoclose(boolean _b) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetClickOutsideToClose(b As Boolean) As VMDial";
 //BA.debugLineNum = 187;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-click-outside-to-cl";
_dialog._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-click-outside-to-close"),(Object)(_b)}));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setcloseonesc(boolean _b) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetCloseOnEsc(b As Boolean) As VMDialog";
 //BA.debugLineNum = 192;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-close-on-esc\": b))";
_dialog._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-close-on-esc"),(Object)(_b)}));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setcontent(String _cnttext) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetContent(cntText As String) As VMDialog";
 //BA.debugLineNum = 109;BA.debugLine="Dialog.SetText(cntText)";
_dialog._settext /*b4j.example.vmelement*/ (_cnttext);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetElevation(e As Int) As VMDialog";
 //BA.debugLineNum = 92;BA.debugLine="Dialog.SetElevation(e)";
_dialog._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setfullscreen(boolean _b) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetFullScreen(b As Boolean) As VMDialog";
 //BA.debugLineNum = 182;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-fullscreen\": b))";
_dialog._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-fullscreen"),(Object)(_b)}));
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setheight(String _w) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetHeight(w As String) As VMDialog";
 //BA.debugLineNum = 62;BA.debugLine="Dialog.SetStyle(CreateMap(\"width\":w))";
_dialog._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetKey(k As String) As VMDialog";
 //BA.debugLineNum = 40;BA.debugLine="Dialog.SetKey(k,True)";
_dialog._setkey /*b4j.example.vmelement*/ ((Object)(_k),__c.True);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setmaxheight(String _mw) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetMaxHeight(mw As String) As VMDialog";
 //BA.debugLineNum = 151;BA.debugLine="Dialog.SetMaxHeight(mw)";
_dialog._setmaxheight /*b4j.example.vmelement*/ (_mw);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setmaxwidth(String _mw) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetMaxWidth(mw As String) As VMDialog";
 //BA.debugLineNum = 146;BA.debugLine="Dialog.SetMaxWidth(mw)";
_dialog._setmaxwidth /*b4j.example.vmelement*/ (_mw);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setonclickedoutside() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 223;BA.debugLine="private Sub SetOnClickedOutside As VMDialog";
 //BA.debugLineNum = 224;BA.debugLine="Dim methodName As String = $\"${ID}_outside\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_outside");
 //BA.debugLineNum = 225;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 226;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 227;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-clicked-outside";
_dialog._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("v-on:md-clicked-outside"),(Object)(_methodname)}));
 //BA.debugLineNum = 229;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setonclosed() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 212;BA.debugLine="private Sub SetOnClosed As VMDialog";
 //BA.debugLineNum = 213;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_closed");
 //BA.debugLineNum = 214;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 215;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 216;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 217;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-closed\": method";
_dialog._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
 //BA.debugLineNum = 219;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setonopened() throws Exception{
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 201;BA.debugLine="private Sub SetOnOpened As VMDialog";
 //BA.debugLineNum = 202;BA.debugLine="Dim methodName As String = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_opened");
 //BA.debugLineNum = 203;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
 //BA.debugLineNum = 204;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 205;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 206;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-opened\": method";
_dialog._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
 //BA.debugLineNum = 208;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setscrollbar(boolean _b) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMDialog";
 //BA.debugLineNum = 45;BA.debugLine="Content.SetScrollBar(True)";
_content._setscrollbar /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetStyle(m As Map) As VMDialog";
 //BA.debugLineNum = 51;BA.debugLine="Dialog.SetStyle(m)";
_dialog._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _settitle(Object _t) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 113;BA.debugLine="Sub SetTitle(t As Object) As VMDialog";
 //BA.debugLineNum = 114;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 115;BA.debugLine="el.Initialize(vue,$\"${ID}title\"$).SetTagDialogTit";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"title"))._settagdialogtitle /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 116;BA.debugLine="el.SetText(t)";
_el._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 117;BA.debugLine="el.Pop(Dialog)";
_el._pop /*String*/ (_dialog);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetWidth(w As String) As VMDialog";
 //BA.debugLineNum = 57;BA.debugLine="Dialog.SetStyle(CreateMap(\"width\":w))";
_dialog._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 85;BA.debugLine="Sub Show";
 //BA.debugLineNum = 86;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 87;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(_id),(Object)(__c.True));
 //BA.debugLineNum = 88;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 162;BA.debugLine="AddHTML(Container.ToString)";
_addhtml(_container._tostring /*String*/ ());
 //BA.debugLineNum = 163;BA.debugLine="Content.Pop(Dialog)";
_content._pop /*String*/ (_dialog);
 //BA.debugLineNum = 164;BA.debugLine="If bActive = False Then";
if (_bactive==__c.False) { 
 //BA.debugLineNum = 165;BA.debugLine="Log($\"VMDialog.SetActiveSync: '${ID}' has not be";
__c.Log(("VMDialog.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(_id))+"' has not been activated!"));
 };
 //BA.debugLineNum = 167;BA.debugLine="If actions.hasContent Then";
if (_actions._hascontent /*boolean*/ ) { 
 //BA.debugLineNum = 168;BA.debugLine="actions.Pop(Dialog)";
_actions._pop /*String*/ (_dialog);
 };
 //BA.debugLineNum = 170;BA.debugLine="Return Dialog.tostring";
if (true) return _dialog._tostring /*String*/ ();
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
