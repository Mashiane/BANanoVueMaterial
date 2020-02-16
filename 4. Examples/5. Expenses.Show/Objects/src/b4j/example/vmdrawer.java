package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdrawer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmdrawer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdrawer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _drawer = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _bactive = false;
public b4j.example.vmlist _drawerlist = null;
public anywheresoftware.b4a.objects.collections.Map _items = null;
public String _mshow = "";
public b4j.example.vmtoolbar _toolbar = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _additem(b4j.example.vmdrawer __ref,String _key,String _icon,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_key,_icon,_text}));}
b4j.example.vmlistitem _item = null;
RDebugUtils.currentLine=107479040;
 //BA.debugLineNum = 107479040;BA.debugLine="Sub AddItem(key As String, icon As String, text As";
RDebugUtils.currentLine=107479041;
 //BA.debugLineNum = 107479041;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
RDebugUtils.currentLine=107479042;
 //BA.debugLineNum = 107479042;BA.debugLine="item.Initialize(vue, key, module)";
_item._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ );
RDebugUtils.currentLine=107479043;
 //BA.debugLineNum = 107479043;BA.debugLine="item.SetIcon(icon, False)";
_item._seticon /*b4j.example.vmlistitem*/ (null,_icon,__c.False);
RDebugUtils.currentLine=107479044;
 //BA.debugLineNum = 107479044;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=107479045;
 //BA.debugLineNum = 107479045;BA.debugLine="items.Put(key, item)";
__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_item));
RDebugUtils.currentLine=107479046;
 //BA.debugLineNum = 107479046;BA.debugLine="End Sub";
return "";
}
public String  _addsubitem(b4j.example.vmdrawer __ref,String _parent,String _key,String _icon,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "addsubitem", true))
	 {return ((String) Debug.delegate(ba, "addsubitem", new Object[] {_parent,_key,_icon,_text}));}
b4j.example.vmlistitem _li = null;
b4j.example.vmlist _pl = null;
b4j.example.vmlistitem _item = null;
RDebugUtils.currentLine=107544576;
 //BA.debugLineNum = 107544576;BA.debugLine="Sub AddSubItem(parent As String, key As String, ic";
RDebugUtils.currentLine=107544577;
 //BA.debugLineNum = 107544577;BA.debugLine="If items.ContainsKey(parent) Then";
if (__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_parent))) { 
RDebugUtils.currentLine=107544578;
 //BA.debugLineNum = 107544578;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
_li = (b4j.example.vmlistitem)(__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent)));
RDebugUtils.currentLine=107544579;
 //BA.debugLineNum = 107544579;BA.debugLine="Dim pl As VMList = li.childList";
_pl = _li._childlist /*b4j.example.vmlist*/ ;
RDebugUtils.currentLine=107544580;
 //BA.debugLineNum = 107544580;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
RDebugUtils.currentLine=107544581;
 //BA.debugLineNum = 107544581;BA.debugLine="item.Initialize(vue, key, module)";
_item._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ );
RDebugUtils.currentLine=107544582;
 //BA.debugLineNum = 107544582;BA.debugLine="item.SetIcon(icon, False)";
_item._seticon /*b4j.example.vmlistitem*/ (null,_icon,__c.False);
RDebugUtils.currentLine=107544583;
 //BA.debugLineNum = 107544583;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=107544584;
 //BA.debugLineNum = 107544584;BA.debugLine="item.SetInset(True)";
_item._setinset /*b4j.example.vmlistitem*/ (null,__c.True);
RDebugUtils.currentLine=107544585;
 //BA.debugLineNum = 107544585;BA.debugLine="item.Pop(pl)";
_item._pop /*String*/ (null,_pl);
 };
RDebugUtils.currentLine=107544587;
 //BA.debugLineNum = 107544587;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _settitle(b4j.example.vmdrawer __ref,String _newtitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "settitle", new Object[] {_newtitle}));}
RDebugUtils.currentLine=106823680;
 //BA.debugLineNum = 106823680;BA.debugLine="Sub SetTitle(newTitle As String) As VMDrawer";
RDebugUtils.currentLine=106823681;
 //BA.debugLineNum = 106823681;BA.debugLine="vue.SetState(CreateMap(\"drawertblbartitle\":newTit";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("drawertblbartitle"),(Object)(_newtitle)}));
RDebugUtils.currentLine=106823682;
 //BA.debugLineNum = 106823682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=106823683;
 //BA.debugLineNum = 106823683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpersistentfull(b4j.example.vmdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setpersistentfull", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setpersistentfull", new Object[] {_b}));}
RDebugUtils.currentLine=108724224;
 //BA.debugLineNum = 108724224;BA.debugLine="Sub SetPersistentFull(b As Boolean) As VMDrawer";
RDebugUtils.currentLine=108724225;
 //BA.debugLineNum = 108724225;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": \"full\"))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-persistent"),(Object)("full")}));
RDebugUtils.currentLine=108724226;
 //BA.debugLineNum = 108724226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108724227;
 //BA.debugLineNum = 108724227;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmdrawer __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=108134400;
 //BA.debugLineNum = 108134400;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=108134401;
 //BA.debugLineNum = 108134401;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=108134402;
 //BA.debugLineNum = 108134402;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _initialize(b4j.example.vmdrawer __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=106758144;
 //BA.debugLineNum = 106758144;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=106758145;
 //BA.debugLineNum = 106758145;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=106758146;
 //BA.debugLineNum = 106758146;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=106758147;
 //BA.debugLineNum = 106758147;BA.debugLine="Drawer.Initialize(vue, ID).SetTag(\"md-app-drawer\"";
__ref._drawer /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-app-drawer");
RDebugUtils.currentLine=106758148;
 //BA.debugLineNum = 106758148;BA.debugLine="bActive = False";
__ref._bactive /*boolean*/  = __c.False;
RDebugUtils.currentLine=106758149;
 //BA.debugLineNum = 106758149;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=106758150;
 //BA.debugLineNum = 106758150;BA.debugLine="SetActiveSync(ID)";
__ref._setactivesync /*b4j.example.vmdrawer*/ (null,__ref._id /*String*/ );
 };
RDebugUtils.currentLine=106758152;
 //BA.debugLineNum = 106758152;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=106758153;
 //BA.debugLineNum = 106758153;BA.debugLine="DrawerList.Initialize(vue,$\"${ID}list\"$, eventHan";
__ref._drawerlist /*b4j.example.vmlist*/ ._initialize /*b4j.example.vmlist*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"list"),_eventhandler);
RDebugUtils.currentLine=106758154;
 //BA.debugLineNum = 106758154;BA.debugLine="DrawerList.SetExpandSingle(True)";
__ref._drawerlist /*b4j.example.vmlist*/ ._setexpandsingle /*b4j.example.vmlist*/ (null,__c.True);
RDebugUtils.currentLine=106758155;
 //BA.debugLineNum = 106758155;BA.debugLine="items.Initialize";
__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=106758156;
 //BA.debugLineNum = 106758156;BA.debugLine="mshow = \"\"";
__ref._mshow /*String*/  = "";
RDebugUtils.currentLine=106758157;
 //BA.debugLineNum = 106758157;BA.debugLine="ToolBar.Initialize(vue,$\"${ID}tblbar\"$, eventHand";
__ref._toolbar /*b4j.example.vmtoolbar*/ ._initialize /*b4j.example.vmtoolbar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"tblbar"),_eventhandler);
RDebugUtils.currentLine=106758158;
 //BA.debugLineNum = 106758158;BA.debugLine="ToolBar.SetTransparent(True).SetElevation(0)";
__ref._toolbar /*b4j.example.vmtoolbar*/ ._settransparent /*b4j.example.vmtoolbar*/ (null,__c.True)._setelevation /*b4j.example.vmtoolbar*/ (null,(int) (0));
RDebugUtils.currentLine=106758159;
 //BA.debugLineNum = 106758159;BA.debugLine="ToolBar.SetTitle(\"\")";
__ref._toolbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ (null,"");
RDebugUtils.currentLine=106758160;
 //BA.debugLineNum = 106758160;BA.debugLine="Drawer.RemoveAttr(\"v-show\")";
__ref._drawer /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=106758161;
 //BA.debugLineNum = 106758161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=106758162;
 //BA.debugLineNum = 106758162;BA.debugLine="End Sub";
return null;
}
public String  _toggle(b4j.example.vmdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "toggle", true))
	 {return ((String) Debug.delegate(ba, "toggle", null));}
boolean _bstate = false;
RDebugUtils.currentLine=106954752;
 //BA.debugLineNum = 106954752;BA.debugLine="Sub Toggle";
RDebugUtils.currentLine=106954753;
 //BA.debugLineNum = 106954753;BA.debugLine="vue.ToggleState(ID)";
__ref._vue /*b4j.example.bananovue*/ ._togglestate /*b4j.example.bananovue*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=106954754;
 //BA.debugLineNum = 106954754;BA.debugLine="Dim bstate As Boolean = vue.GetState(ID,True)";
_bstate = BA.ObjectToBoolean(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,__ref._id /*String*/ ,(Object)(__c.True)));
RDebugUtils.currentLine=106954755;
 //BA.debugLineNum = 106954755;BA.debugLine="vue.SetStateSingle(\"back1show\", bstate)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"back1show",(Object)(_bstate));
RDebugUtils.currentLine=106954756;
 //BA.debugLineNum = 106954756;BA.debugLine="End Sub";
return "";
}
public String  _addavatar(b4j.example.vmdrawer __ref,String _key,String _imgurl,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "addavatar", true))
	 {return ((String) Debug.delegate(ba, "addavatar", new Object[] {_key,_imgurl,_text}));}
b4j.example.vmlistitem _item = null;
RDebugUtils.currentLine=107347968;
 //BA.debugLineNum = 107347968;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, tex";
RDebugUtils.currentLine=107347969;
 //BA.debugLineNum = 107347969;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
RDebugUtils.currentLine=107347970;
 //BA.debugLineNum = 107347970;BA.debugLine="item.Initialize(vue, key, module)";
_item._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ );
RDebugUtils.currentLine=107347971;
 //BA.debugLineNum = 107347971;BA.debugLine="item.SetAvatar(imgURL)";
_item._setavatar /*b4j.example.vmlistitem*/ (null,_imgurl);
RDebugUtils.currentLine=107347972;
 //BA.debugLineNum = 107347972;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=107347973;
 //BA.debugLineNum = 107347973;BA.debugLine="items.Put(key, item)";
__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_item));
RDebugUtils.currentLine=107347974;
 //BA.debugLineNum = 107347974;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _addclass(b4j.example.vmdrawer __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=107675648;
 //BA.debugLineNum = 107675648;BA.debugLine="Sub AddClass(c As String) As VMDrawer";
RDebugUtils.currentLine=107675649;
 //BA.debugLineNum = 107675649;BA.debugLine="Drawer.AddClass(c)";
__ref._drawer /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=107675650;
 //BA.debugLineNum = 107675650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=107675651;
 //BA.debugLineNum = 107675651;BA.debugLine="End Sub";
return null;
}
public String  _addsubavatar(b4j.example.vmdrawer __ref,String _parent,String _key,String _imgurl,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "addsubavatar", true))
	 {return ((String) Debug.delegate(ba, "addsubavatar", new Object[] {_parent,_key,_imgurl,_text}));}
b4j.example.vmlistitem _li = null;
b4j.example.vmlist _pl = null;
b4j.example.vmlistitem _item = null;
RDebugUtils.currentLine=107413504;
 //BA.debugLineNum = 107413504;BA.debugLine="Sub AddSubAvatar(parent As String, key As String,";
RDebugUtils.currentLine=107413505;
 //BA.debugLineNum = 107413505;BA.debugLine="If items.ContainsKey(parent) Then";
if (__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_parent))) { 
RDebugUtils.currentLine=107413506;
 //BA.debugLineNum = 107413506;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
_li = (b4j.example.vmlistitem)(__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent)));
RDebugUtils.currentLine=107413507;
 //BA.debugLineNum = 107413507;BA.debugLine="Dim pl As VMList = li.childList";
_pl = _li._childlist /*b4j.example.vmlist*/ ;
RDebugUtils.currentLine=107413508;
 //BA.debugLineNum = 107413508;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
RDebugUtils.currentLine=107413509;
 //BA.debugLineNum = 107413509;BA.debugLine="item.Initialize(vue, key, module)";
_item._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ );
RDebugUtils.currentLine=107413510;
 //BA.debugLineNum = 107413510;BA.debugLine="item.SetAvatar(imgURL)";
_item._setavatar /*b4j.example.vmlistitem*/ (null,_imgurl);
RDebugUtils.currentLine=107413511;
 //BA.debugLineNum = 107413511;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=107413512;
 //BA.debugLineNum = 107413512;BA.debugLine="item.Pop(pl)";
_item._pop /*String*/ (null,_pl);
 };
RDebugUtils.currentLine=107413514;
 //BA.debugLineNum = 107413514;BA.debugLine="End Sub";
return "";
}
public String  _back1_click(b4j.example.vmdrawer __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "back1_click", true))
	 {return ((String) Debug.delegate(ba, "back1_click", new Object[] {_e}));}
boolean _bdrawer = false;
RDebugUtils.currentLine=108003328;
 //BA.debugLineNum = 108003328;BA.debugLine="Sub back1_click(e As BANanoEvent)";
RDebugUtils.currentLine=108003329;
 //BA.debugLineNum = 108003329;BA.debugLine="Toggle";
__ref._toggle /*String*/ (null);
RDebugUtils.currentLine=108003330;
 //BA.debugLineNum = 108003330;BA.debugLine="Dim bDrawer As Boolean = vue.GetState(\"drawer\",Fa";
_bdrawer = BA.ObjectToBoolean(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,"drawer",(Object)(__c.False)));
RDebugUtils.currentLine=108003331;
 //BA.debugLineNum = 108003331;BA.debugLine="bDrawer = Not(bDrawer)";
_bdrawer = __c.Not(_bdrawer);
RDebugUtils.currentLine=108003332;
 //BA.debugLineNum = 108003332;BA.debugLine="vue.SetStateSingle(\"menushow\", bDrawer)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"menushow",(Object)(_bdrawer));
RDebugUtils.currentLine=108003333;
 //BA.debugLineNum = 108003333;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
RDebugUtils.currentLine=106692608;
 //BA.debugLineNum = 106692608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=106692609;
 //BA.debugLineNum = 106692609;BA.debugLine="Public Drawer As VMElement";
_drawer = new b4j.example.vmelement();
RDebugUtils.currentLine=106692610;
 //BA.debugLineNum = 106692610;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=106692611;
 //BA.debugLineNum = 106692611;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=106692612;
 //BA.debugLineNum = 106692612;BA.debugLine="Private bActive As Boolean";
_bactive = false;
RDebugUtils.currentLine=106692613;
 //BA.debugLineNum = 106692613;BA.debugLine="Private DrawerList As VMList";
_drawerlist = new b4j.example.vmlist();
RDebugUtils.currentLine=106692614;
 //BA.debugLineNum = 106692614;BA.debugLine="Private items As Map";
_items = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=106692615;
 //BA.debugLineNum = 106692615;BA.debugLine="Private mshow As String";
_mshow = "";
RDebugUtils.currentLine=106692616;
 //BA.debugLineNum = 106692616;BA.debugLine="Public ToolBar As VMToolBar";
_toolbar = new b4j.example.vmtoolbar();
RDebugUtils.currentLine=106692617;
 //BA.debugLineNum = 106692617;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=106692618;
 //BA.debugLineNum = 106692618;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.vmdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=107085824;
 //BA.debugLineNum = 107085824;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=107085825;
 //BA.debugLineNum = 107085825;BA.debugLine="vue.SetStateSingle(ID, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._id /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=107085827;
 //BA.debugLineNum = 107085827;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _setactivesync(b4j.example.vmdrawer __ref,String _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setactivesync", new Object[] {_v}));}
RDebugUtils.currentLine=107806720;
 //BA.debugLineNum = 107806720;BA.debugLine="private Sub SetActiveSync(v As String) As VMDrawer";
RDebugUtils.currentLine=107806721;
 //BA.debugLineNum = 107806721;BA.debugLine="Drawer.SetActiveSync(v)";
__ref._drawer /*b4j.example.vmelement*/ ._setactivesync /*b4j.example.vmelement*/ (null,_v);
RDebugUtils.currentLine=107806722;
 //BA.debugLineNum = 107806722;BA.debugLine="bActive = True";
__ref._bactive /*boolean*/  = __c.True;
RDebugUtils.currentLine=107806723;
 //BA.debugLineNum = 107806723;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=107806724;
 //BA.debugLineNum = 107806724;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
b4j.example.vmlistitem _item = null;
b4j.example.vmlist _cl = null;
RDebugUtils.currentLine=107937792;
 //BA.debugLineNum = 107937792;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=107937793;
 //BA.debugLineNum = 107937793;BA.debugLine="ToolBar.CreateButton(\"back1\").SetOnClick(Me).SetD";
__ref._toolbar /*b4j.example.vmtoolbar*/ ._createbutton /*b4j.example.vmbutton*/ (null,"back1")._setonclick /*b4j.example.vmbutton*/ (null,this)._setdense /*b4j.example.vmbutton*/ (null,__c.True)._seticon /*b4j.example.vmbutton*/ (null,"keyboard_arrow_left")._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True)._pop /*String*/ (null,__ref._toolbar /*b4j.example.vmtoolbar*/ ._endsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=107937794;
 //BA.debugLineNum = 107937794;BA.debugLine="ToolBar.Pop(Drawer)";
__ref._toolbar /*b4j.example.vmtoolbar*/ ._pop /*String*/ (null,__ref._drawer /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=107937796;
 //BA.debugLineNum = 107937796;BA.debugLine="For Each item As VMListItem In items.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_item = (b4j.example.vmlistitem)(group3.Get(index3));
RDebugUtils.currentLine=107937797;
 //BA.debugLineNum = 107937797;BA.debugLine="Dim cl As VMList = item.childList";
_cl = _item._childlist /*b4j.example.vmlist*/ ;
RDebugUtils.currentLine=107937798;
 //BA.debugLineNum = 107937798;BA.debugLine="If cl.HasContent Then item.SetList(cl)";
if (_cl._hascontent /*boolean*/ ) { 
_item._setlist /*b4j.example.vmlistitem*/ (null,_cl);};
RDebugUtils.currentLine=107937799;
 //BA.debugLineNum = 107937799;BA.debugLine="item.Pop(DrawerList)";
_item._pop /*String*/ (null,__ref._drawerlist /*b4j.example.vmlist*/ );
 }
};
RDebugUtils.currentLine=107937801;
 //BA.debugLineNum = 107937801;BA.debugLine="If DrawerList.HasContent Then DrawerList.Pop(Draw";
if (__ref._drawerlist /*b4j.example.vmlist*/ ._hascontent /*boolean*/ ) { 
__ref._drawerlist /*b4j.example.vmlist*/ ._pop /*String*/ (null,__ref._drawer /*b4j.example.vmelement*/ );};
RDebugUtils.currentLine=107937802;
 //BA.debugLineNum = 107937802;BA.debugLine="If bActive = False Then";
if (__ref._bactive /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=107937803;
 //BA.debugLineNum = 107937803;BA.debugLine="Log($\"VMDrawer.SetActiveSync: '${ID}' has not be";
__c.Log(("VMDrawer.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' has not been activated!"));
 };
RDebugUtils.currentLine=107937805;
 //BA.debugLineNum = 107937805;BA.debugLine="Return Drawer.tostring";
if (true) return __ref._drawer /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=107937806;
 //BA.debugLineNum = 107937806;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=108068864;
 //BA.debugLineNum = 108068864;BA.debugLine="Sub Render";
RDebugUtils.currentLine=108068865;
 //BA.debugLineNum = 108068865;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=108068866;
 //BA.debugLineNum = 108068866;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _setactive(b4j.example.vmdrawer __ref,Object _varactive) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setactive", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setactive", new Object[] {_varactive}));}
RDebugUtils.currentLine=108199936;
 //BA.debugLineNum = 108199936;BA.debugLine="Sub SetActive(varActive As Object) As VMDrawer";
RDebugUtils.currentLine=108199937;
 //BA.debugLineNum = 108199937;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-active"),_varactive}));
RDebugUtils.currentLine=108199938;
 //BA.debugLineNum = 108199938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108199939;
 //BA.debugLineNum = 108199939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setattr(b4j.example.vmdrawer __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=107741184;
 //BA.debugLineNum = 107741184;BA.debugLine="Sub SetAttr(attr As Map) As VMDrawer";
RDebugUtils.currentLine=107741185;
 //BA.debugLineNum = 107741185;BA.debugLine="Drawer.SetAttr(attr)";
__ref._drawer /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=107741186;
 //BA.debugLineNum = 107741186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=107741187;
 //BA.debugLineNum = 107741187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setelevation(b4j.example.vmdrawer __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=107610112;
 //BA.debugLineNum = 107610112;BA.debugLine="Sub SetElevation(e As Int) As VMDrawer";
RDebugUtils.currentLine=107610113;
 //BA.debugLineNum = 107610113;BA.debugLine="Drawer.SetElevation(e)";
__ref._drawer /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=107610114;
 //BA.debugLineNum = 107610114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=107610115;
 //BA.debugLineNum = 107610115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setfixed(b4j.example.vmdrawer __ref,boolean _varfixed) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setfixed", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setfixed", new Object[] {_varfixed}));}
RDebugUtils.currentLine=108331008;
 //BA.debugLineNum = 108331008;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMDrawer";
RDebugUtils.currentLine=108331009;
 //BA.debugLineNum = 108331009;BA.debugLine="SetAttr(CreateMap(\":md-fixed\": varFixed))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)(":md-fixed"),(Object)(_varfixed)}));
RDebugUtils.currentLine=108331010;
 //BA.debugLineNum = 108331010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108331011;
 //BA.debugLineNum = 108331011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpermanent(b4j.example.vmdrawer __ref,Object _varpermanent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setpermanent", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setpermanent", new Object[] {_varpermanent}));}
RDebugUtils.currentLine=108462080;
 //BA.debugLineNum = 108462080;BA.debugLine="Sub SetPermanent(varPermanent As Object) As VMDraw";
RDebugUtils.currentLine=108462081;
 //BA.debugLineNum = 108462081;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": varPermanent))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-permanent"),_varpermanent}));
RDebugUtils.currentLine=108462082;
 //BA.debugLineNum = 108462082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108462083;
 //BA.debugLineNum = 108462083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpermanentcard(b4j.example.vmdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setpermanentcard", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setpermanentcard", new Object[] {_b}));}
RDebugUtils.currentLine=108593152;
 //BA.debugLineNum = 108593152;BA.debugLine="Sub SetPermanentCard(b As Boolean) As VMDrawer";
RDebugUtils.currentLine=108593153;
 //BA.debugLineNum = 108593153;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": \"card\"))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-permanent"),(Object)("card")}));
RDebugUtils.currentLine=108593154;
 //BA.debugLineNum = 108593154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108593155;
 //BA.debugLineNum = 108593155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpermanentclipped(b4j.example.vmdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setpermanentclipped", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setpermanentclipped", new Object[] {_b}));}
RDebugUtils.currentLine=108527616;
 //BA.debugLineNum = 108527616;BA.debugLine="Sub SetPermanentClipped(b As Boolean) As VMDrawer";
RDebugUtils.currentLine=108527617;
 //BA.debugLineNum = 108527617;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": \"clipped\"))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-permanent"),(Object)("clipped")}));
RDebugUtils.currentLine=108527618;
 //BA.debugLineNum = 108527618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108527619;
 //BA.debugLineNum = 108527619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpermanentfull(b4j.example.vmdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setpermanentfull", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setpermanentfull", new Object[] {_b}));}
RDebugUtils.currentLine=107872256;
 //BA.debugLineNum = 107872256;BA.debugLine="Sub SetPermanentFull(b As Boolean) As VMDrawer";
RDebugUtils.currentLine=107872257;
 //BA.debugLineNum = 107872257;BA.debugLine="Drawer.SetPermanentFull(b)";
__ref._drawer /*b4j.example.vmelement*/ ._setpermanentfull /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=107872258;
 //BA.debugLineNum = 107872258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=107872259;
 //BA.debugLineNum = 107872259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpersistent(b4j.example.vmdrawer __ref,Object _varpersistent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setpersistent", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setpersistent", new Object[] {_varpersistent}));}
RDebugUtils.currentLine=108658688;
 //BA.debugLineNum = 108658688;BA.debugLine="Sub SetPersistent(varPersistent As Object) As VMDr";
RDebugUtils.currentLine=108658689;
 //BA.debugLineNum = 108658689;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": varPersistent)";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-persistent"),_varpersistent}));
RDebugUtils.currentLine=108658690;
 //BA.debugLineNum = 108658690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108658691;
 //BA.debugLineNum = 108658691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setpersistentmini(b4j.example.vmdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setpersistentmini", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setpersistentmini", new Object[] {_b}));}
RDebugUtils.currentLine=108789760;
 //BA.debugLineNum = 108789760;BA.debugLine="Sub SetPersistentMini(b As Boolean) As VMDrawer";
RDebugUtils.currentLine=108789761;
 //BA.debugLineNum = 108789761;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": \"mini\"))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-persistent"),(Object)("mini")}));
RDebugUtils.currentLine=108789762;
 //BA.debugLineNum = 108789762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108789763;
 //BA.debugLineNum = 108789763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setright(b4j.example.vmdrawer __ref,boolean _varright) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setright", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setright", new Object[] {_varright}));}
RDebugUtils.currentLine=108396544;
 //BA.debugLineNum = 108396544;BA.debugLine="Sub SetRight(varRight As Boolean) As VMDrawer";
RDebugUtils.currentLine=108396545;
 //BA.debugLineNum = 108396545;BA.debugLine="SetAttr(CreateMap(\":md-right\": varRight))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)(":md-right"),(Object)(_varright)}));
RDebugUtils.currentLine=108396546;
 //BA.debugLineNum = 108396546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108396547;
 //BA.debugLineNum = 108396547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setswipeable(b4j.example.vmdrawer __ref,boolean _varswipeable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setswipeable", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setswipeable", new Object[] {_varswipeable}));}
RDebugUtils.currentLine=108265472;
 //BA.debugLineNum = 108265472;BA.debugLine="Sub SetSwipeable(varSwipeable As Boolean) As VMDra";
RDebugUtils.currentLine=108265473;
 //BA.debugLineNum = 108265473;BA.debugLine="SetAttr(CreateMap(\":md-swipeable\": varSwipeable))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)(":md-swipeable"),(Object)(_varswipeable)}));
RDebugUtils.currentLine=108265474;
 //BA.debugLineNum = 108265474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108265475;
 //BA.debugLineNum = 108265475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setswiperestraint(b4j.example.vmdrawer __ref,Object _varswipe) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setswiperestraint", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setswiperestraint", new Object[] {_varswipe}));}
RDebugUtils.currentLine=108920832;
 //BA.debugLineNum = 108920832;BA.debugLine="Sub SetSwipeRestraint(varSwipe As Object) As VMDra";
RDebugUtils.currentLine=108920833;
 //BA.debugLineNum = 108920833;BA.debugLine="SetAttr(CreateMap(\"md-swipe-restraint\": varSwipe)";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-swipe-restraint"),_varswipe}));
RDebugUtils.currentLine=108920834;
 //BA.debugLineNum = 108920834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108920835;
 //BA.debugLineNum = 108920835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setswipethreshold(b4j.example.vmdrawer __ref,Object _varswipe) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setswipethreshold", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setswipethreshold", new Object[] {_varswipe}));}
RDebugUtils.currentLine=108855296;
 //BA.debugLineNum = 108855296;BA.debugLine="Sub SetSwipeThreshold(varSwipe As Object) As VMDra";
RDebugUtils.currentLine=108855297;
 //BA.debugLineNum = 108855297;BA.debugLine="SetAttr(CreateMap(\"md-swipe-threshold\": varSwipe)";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-swipe-threshold"),_varswipe}));
RDebugUtils.currentLine=108855298;
 //BA.debugLineNum = 108855298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108855299;
 //BA.debugLineNum = 108855299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setswipetime(b4j.example.vmdrawer __ref,Object _varswipe) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setswipetime", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setswipetime", new Object[] {_varswipe}));}
RDebugUtils.currentLine=108986368;
 //BA.debugLineNum = 108986368;BA.debugLine="Sub SetSwipeTime(varSwipe As Object) As VMDrawer";
RDebugUtils.currentLine=108986369;
 //BA.debugLineNum = 108986369;BA.debugLine="SetAttr(CreateMap(\"md-swipe-time\": varSwipe))";
__ref._setattr /*b4j.example.vmdrawer*/ (null,__c.createMap(new Object[] {(Object)("md-swipe-time"),_varswipe}));
RDebugUtils.currentLine=108986370;
 //BA.debugLineNum = 108986370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=108986371;
 //BA.debugLineNum = 108986371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setvif(b4j.example.vmdrawer __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setvif", new Object[] {_vshow}));}
RDebugUtils.currentLine=107216896;
 //BA.debugLineNum = 107216896;BA.debugLine="Sub SetVIf(vshow As String) As VMDrawer";
RDebugUtils.currentLine=107216897;
 //BA.debugLineNum = 107216897;BA.debugLine="Drawer.SetVif(vshow)";
__ref._drawer /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=107216898;
 //BA.debugLineNum = 107216898;BA.debugLine="mshow = vshow";
__ref._mshow /*String*/  = _vshow;
RDebugUtils.currentLine=107216899;
 //BA.debugLineNum = 107216899;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=107216900;
 //BA.debugLineNum = 107216900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _setvshow(b4j.example.vmdrawer __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "setvshow", new Object[] {_vshow}));}
RDebugUtils.currentLine=107151360;
 //BA.debugLineNum = 107151360;BA.debugLine="Sub SetVShow(vshow As String) As VMDrawer";
RDebugUtils.currentLine=107151361;
 //BA.debugLineNum = 107151361;BA.debugLine="Drawer.SetVShow(vshow)";
__ref._drawer /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=107151362;
 //BA.debugLineNum = 107151362;BA.debugLine="mshow = vshow";
__ref._mshow /*String*/  = _vshow;
RDebugUtils.currentLine=107151363;
 //BA.debugLineNum = 107151363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=107151364;
 //BA.debugLineNum = 107151364;BA.debugLine="End Sub";
return null;
}
public String  _setwidth(b4j.example.vmdrawer __ref,String _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_width}));}
RDebugUtils.currentLine=107282432;
 //BA.debugLineNum = 107282432;BA.debugLine="Sub SetWidth(width As String)";
RDebugUtils.currentLine=107282433;
 //BA.debugLineNum = 107282433;BA.debugLine="vue.SetStyle(\".md-drawer\", \"width\", width)";
__ref._vue /*b4j.example.bananovue*/ ._setstyle /*b4j.example.bananovue*/ (null,".md-drawer","width",_width);
RDebugUtils.currentLine=107282434;
 //BA.debugLineNum = 107282434;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.vmdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=107020288;
 //BA.debugLineNum = 107020288;BA.debugLine="Sub Show";
RDebugUtils.currentLine=107020289;
 //BA.debugLineNum = 107020289;BA.debugLine="vue.SetStateSingle(ID,True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._id /*String*/ ,(Object)(__c.True));
RDebugUtils.currentLine=107020291;
 //BA.debugLineNum = 107020291;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdrawer  _updatetitle(b4j.example.vmdrawer __ref,String _newtitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdrawer";
if (Debug.shouldDelegate(ba, "updatetitle", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "updatetitle", new Object[] {_newtitle}));}
RDebugUtils.currentLine=106889216;
 //BA.debugLineNum = 106889216;BA.debugLine="Sub UpdateTitle(newTitle As String) As VMDrawer";
RDebugUtils.currentLine=106889217;
 //BA.debugLineNum = 106889217;BA.debugLine="vue.SetState(CreateMap(\"drawertblbartitle\":newTit";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("drawertblbartitle"),(Object)(_newtitle)}));
RDebugUtils.currentLine=106889218;
 //BA.debugLineNum = 106889218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdrawer)(this);
RDebugUtils.currentLine=106889219;
 //BA.debugLineNum = 106889219;BA.debugLine="End Sub";
return null;
}
}