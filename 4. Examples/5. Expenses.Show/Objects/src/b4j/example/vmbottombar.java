package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbottombar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmbottombar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbottombar.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _bottombar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmbottombar  _initialize(b4j.example.vmbottombar __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
String _sval = "";
RDebugUtils.currentLine=68354048;
 //BA.debugLineNum = 68354048;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=68354049;
 //BA.debugLineNum = 68354049;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=68354050;
 //BA.debugLineNum = 68354050;BA.debugLine="BottomBar.Initialize(v, ID)";
__ref._bottombar /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=68354051;
 //BA.debugLineNum = 68354051;BA.debugLine="BottomBar.SetTag(\"md-bottom-bar\")";
__ref._bottombar /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-bottom-bar");
RDebugUtils.currentLine=68354052;
 //BA.debugLineNum = 68354052;BA.debugLine="module = EventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=68354053;
 //BA.debugLineNum = 68354053;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=68354054;
 //BA.debugLineNum = 68354054;BA.debugLine="Dim sval As String";
_sval = "";
RDebugUtils.currentLine=68354055;
 //BA.debugLineNum = 68354055;BA.debugLine="SetOnChanged(sval)";
__ref._setonchanged /*b4j.example.vmbottombar*/ (null,_sval);
RDebugUtils.currentLine=68354056;
 //BA.debugLineNum = 68354056;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=68354057;
 //BA.debugLineNum = 68354057;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _addchild(b4j.example.vmbottombar __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=68943872;
 //BA.debugLineNum = 68943872;BA.debugLine="Sub AddChild(child As VMElement) As VMBottomBar";
RDebugUtils.currentLine=68943873;
 //BA.debugLineNum = 68943873;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=68943874;
 //BA.debugLineNum = 68943874;BA.debugLine="BottomBar.SetText(childHTML)";
__ref._bottombar /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=68943875;
 //BA.debugLineNum = 68943875;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=68943876;
 //BA.debugLineNum = 68943876;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmbottombar __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=69468160;
 //BA.debugLineNum = 69468160;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=69468161;
 //BA.debugLineNum = 69468161;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=69468162;
 //BA.debugLineNum = 69468162;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmbottombar*/ (null,_childx);
 }
};
RDebugUtils.currentLine=69468164;
 //BA.debugLineNum = 69468164;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombar  _addclass(b4j.example.vmbottombar __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=69271552;
 //BA.debugLineNum = 69271552;BA.debugLine="Sub AddClass(c As String) As VMBottomBar";
RDebugUtils.currentLine=69271553;
 //BA.debugLineNum = 69271553;BA.debugLine="BottomBar.AddClass(c)";
__ref._bottombar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=69271554;
 //BA.debugLineNum = 69271554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69271555;
 //BA.debugLineNum = 69271555;BA.debugLine="End Sub";
return null;
}
public String  _additem(b4j.example.vmbottombar __ref,String _iid,String _ilabel,String _iicon,String _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_iid,_ilabel,_iicon,_badge}));}
b4j.example.vmbottombaritem _item = null;
RDebugUtils.currentLine=68485120;
 //BA.debugLineNum = 68485120;BA.debugLine="Sub AddItem(iID As String, iLabel As String, iIcon";
RDebugUtils.currentLine=68485121;
 //BA.debugLineNum = 68485121;BA.debugLine="Dim item As VMBottomBarItem";
_item = new b4j.example.vmbottombaritem();
RDebugUtils.currentLine=68485122;
 //BA.debugLineNum = 68485122;BA.debugLine="item.Initialize(vue, iID, module)";
_item._initialize /*b4j.example.vmbottombaritem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_iid,__ref._module /*Object*/ );
RDebugUtils.currentLine=68485123;
 //BA.debugLineNum = 68485123;BA.debugLine="If badge = \"\" Then";
if ((_badge).equals("")) { 
RDebugUtils.currentLine=68485124;
 //BA.debugLineNum = 68485124;BA.debugLine="item.SetLabel(iLabel)";
_item._setlabel /*b4j.example.vmbottombaritem*/ (null,_ilabel);
RDebugUtils.currentLine=68485125;
 //BA.debugLineNum = 68485125;BA.debugLine="item.SetIcon(iIcon)";
_item._seticon /*b4j.example.vmbottombaritem*/ (null,(Object)(_iicon));
 }else {
RDebugUtils.currentLine=68485127;
 //BA.debugLineNum = 68485127;BA.debugLine="item.SetIcon1(iIcon)";
_item._seticon1 /*b4j.example.vmbottombaritem*/ (null,_iicon);
RDebugUtils.currentLine=68485128;
 //BA.debugLineNum = 68485128;BA.debugLine="item.SetLabel1(iLabel)";
_item._setlabel1 /*b4j.example.vmbottombaritem*/ (null,_ilabel);
RDebugUtils.currentLine=68485129;
 //BA.debugLineNum = 68485129;BA.debugLine="item.SetBadge(badge)";
_item._setbadge /*b4j.example.vmbottombaritem*/ (null,_badge);
 };
RDebugUtils.currentLine=68485131;
 //BA.debugLineNum = 68485131;BA.debugLine="item.Pop(BottomBar)";
_item._pop /*String*/ (null,__ref._bottombar /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=68485132;
 //BA.debugLineNum = 68485132;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmbottombar __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=69926912;
 //BA.debugLineNum = 69926912;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=69926913;
 //BA.debugLineNum = 69926913;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=69926914;
 //BA.debugLineNum = 69926914;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmbottombar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=68616192;
 //BA.debugLineNum = 68616192;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=68616193;
 //BA.debugLineNum = 68616193;BA.debugLine="Return BottomBar.ToString";
if (true) return __ref._bottombar /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=68616194;
 //BA.debugLineNum = 68616194;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmbottombar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
RDebugUtils.currentLine=68288512;
 //BA.debugLineNum = 68288512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=68288513;
 //BA.debugLineNum = 68288513;BA.debugLine="Public BottomBar As VMElement";
_bottombar = new b4j.example.vmelement();
RDebugUtils.currentLine=68288514;
 //BA.debugLineNum = 68288514;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=68288515;
 //BA.debugLineNum = 68288515;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=68288516;
 //BA.debugLineNum = 68288516;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=68288517;
 //BA.debugLineNum = 68288517;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=68288518;
 //BA.debugLineNum = 68288518;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombaritem  _createitem(b4j.example.vmbottombar __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "createitem", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "createitem", new Object[] {_sid}));}
b4j.example.vmbottombaritem _el = null;
RDebugUtils.currentLine=68419584;
 //BA.debugLineNum = 68419584;BA.debugLine="Sub CreateItem(sid As String) As VMBottomBarItem";
RDebugUtils.currentLine=68419585;
 //BA.debugLineNum = 68419585;BA.debugLine="Dim el As VMBottomBarItem";
_el = new b4j.example.vmbottombaritem();
RDebugUtils.currentLine=68419586;
 //BA.debugLineNum = 68419586;BA.debugLine="el.Initialize(vue, sid, module)";
_el._initialize /*b4j.example.vmbottombaritem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,__ref._module /*Object*/ );
RDebugUtils.currentLine=68419587;
 //BA.debugLineNum = 68419587;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=68419588;
 //BA.debugLineNum = 68419588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setonchanged(b4j.example.vmbottombar __ref,String _activeitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setonchanged", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setonchanged", new Object[] {_activeitem}));}
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=68550656;
 //BA.debugLineNum = 68550656;BA.debugLine="private Sub SetOnChanged(activeItem As String) As";
RDebugUtils.currentLine=68550657;
 //BA.debugLineNum = 68550657;BA.debugLine="Dim MethodName As String = $\"${ID}_changed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_changed");
RDebugUtils.currentLine=68550658;
 //BA.debugLineNum = 68550658;BA.debugLine="If SubExists(module, MethodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmbottombar)(this);};
RDebugUtils.currentLine=68550659;
 //BA.debugLineNum = 68550659;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_activeitem)}))));
RDebugUtils.currentLine=68550660;
 //BA.debugLineNum = 68550660;BA.debugLine="SetAttr(CreateMap(\"@md-changed\": MethodName))";
__ref._setattr /*b4j.example.vmbottombar*/ (null,__c.createMap(new Object[] {(Object)("@md-changed"),(Object)(_methodname)}));
RDebugUtils.currentLine=68550662;
 //BA.debugLineNum = 68550662;BA.debugLine="vue.SetCallBack(MethodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=68550663;
 //BA.debugLineNum = 68550663;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=68550664;
 //BA.debugLineNum = 68550664;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmbottombar __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=69206016;
 //BA.debugLineNum = 69206016;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=69206017;
 //BA.debugLineNum = 69206017;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=69206018;
 //BA.debugLineNum = 69206018;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmbottombar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=68878336;
 //BA.debugLineNum = 68878336;BA.debugLine="Sub Render";
RDebugUtils.currentLine=68878337;
 //BA.debugLineNum = 68878337;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=68878338;
 //BA.debugLineNum = 68878338;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombar  _setaccent(b4j.example.vmbottombar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=69140480;
 //BA.debugLineNum = 69140480;BA.debugLine="Sub SetAccent(b As Boolean) As VMBottomBar";
RDebugUtils.currentLine=69140481;
 //BA.debugLineNum = 69140481;BA.debugLine="BottomBar.SetAccent(True)";
__ref._bottombar /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=69140482;
 //BA.debugLineNum = 69140482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69140483;
 //BA.debugLineNum = 69140483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setactiveitem(b4j.example.vmbottombar __ref,Object _varactiveitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setactiveitem", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setactiveitem", new Object[] {_varactiveitem}));}
String _pp = "";
RDebugUtils.currentLine=69795840;
 //BA.debugLineNum = 69795840;BA.debugLine="Sub SetActiveItem(varActiveItem As Object) As VMBo";
RDebugUtils.currentLine=69795841;
 //BA.debugLineNum = 69795841;BA.debugLine="Dim pp As String = $\"${ID}activeitem\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"activeitem");
RDebugUtils.currentLine=69795842;
 //BA.debugLineNum = 69795842;BA.debugLine="vue.SetStateSingle(pp, varActiveItem)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,_varactiveitem);
RDebugUtils.currentLine=69795843;
 //BA.debugLineNum = 69795843;BA.debugLine="SetAttr(CreateMap(\":md-active-item\": pp))";
__ref._setattr /*b4j.example.vmbottombar*/ (null,__c.createMap(new Object[] {(Object)(":md-active-item"),(Object)(_pp)}));
RDebugUtils.currentLine=69795844;
 //BA.debugLineNum = 69795844;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69795845;
 //BA.debugLineNum = 69795845;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setattr(b4j.example.vmbottombar __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=69337088;
 //BA.debugLineNum = 69337088;BA.debugLine="Sub SetAttr(attr As Map) As VMBottomBar";
RDebugUtils.currentLine=69337089;
 //BA.debugLineNum = 69337089;BA.debugLine="BottomBar.SetAttr(attr)";
__ref._bottombar /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=69337090;
 //BA.debugLineNum = 69337090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69337091;
 //BA.debugLineNum = 69337091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setpadding(b4j.example.vmbottombar __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=69533696;
 //BA.debugLineNum = 69533696;BA.debugLine="Sub SetPadding(p As Object) As VMBottomBar";
RDebugUtils.currentLine=69533697;
 //BA.debugLineNum = 69533697;BA.debugLine="BottomBar.SetPaddingAll(p)";
__ref._bottombar /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=69533698;
 //BA.debugLineNum = 69533698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69533699;
 //BA.debugLineNum = 69533699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setprimary(b4j.example.vmbottombar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=69074944;
 //BA.debugLineNum = 69074944;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBottomBar";
RDebugUtils.currentLine=69074945;
 //BA.debugLineNum = 69074945;BA.debugLine="BottomBar.SetPrimary(True)";
__ref._bottombar /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=69074946;
 //BA.debugLineNum = 69074946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69074947;
 //BA.debugLineNum = 69074947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setstyle(b4j.example.vmbottombar __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=69402624;
 //BA.debugLineNum = 69402624;BA.debugLine="Sub SetStyle(sm As Map) As VMBottomBar";
RDebugUtils.currentLine=69402625;
 //BA.debugLineNum = 69402625;BA.debugLine="BottomBar.SetStyle(sm)";
__ref._bottombar /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=69402626;
 //BA.debugLineNum = 69402626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69402627;
 //BA.debugLineNum = 69402627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setsyncroute(b4j.example.vmbottombar __ref,boolean _varsyncroute) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setsyncroute", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setsyncroute", new Object[] {_varsyncroute}));}
RDebugUtils.currentLine=69861376;
 //BA.debugLineNum = 69861376;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMBot";
RDebugUtils.currentLine=69861377;
 //BA.debugLineNum = 69861377;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
__ref._setattr /*b4j.example.vmbottombar*/ (null,__c.createMap(new Object[] {(Object)(":md-sync-route"),(Object)(_varsyncroute)}));
RDebugUtils.currentLine=69861378;
 //BA.debugLineNum = 69861378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69861379;
 //BA.debugLineNum = 69861379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _settext(b4j.example.vmbottombar __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=69009408;
 //BA.debugLineNum = 69009408;BA.debugLine="Sub SetText(t As Object) As VMBottomBar";
RDebugUtils.currentLine=69009409;
 //BA.debugLineNum = 69009409;BA.debugLine="BottomBar.SetText(t)";
__ref._bottombar /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=69009410;
 //BA.debugLineNum = 69009410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69009411;
 //BA.debugLineNum = 69009411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _settype(b4j.example.vmbottombar __ref,Object _vartype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "settype", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "settype", new Object[] {_vartype}));}
String _pp = "";
RDebugUtils.currentLine=69599232;
 //BA.debugLineNum = 69599232;BA.debugLine="Sub SetType(varType As Object) As VMBottomBar";
RDebugUtils.currentLine=69599233;
 //BA.debugLineNum = 69599233;BA.debugLine="Dim pp As String = $\"${ID}type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"type");
RDebugUtils.currentLine=69599234;
 //BA.debugLineNum = 69599234;BA.debugLine="vue.SetStateSingle(pp, varType)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,_vartype);
RDebugUtils.currentLine=69599235;
 //BA.debugLineNum = 69599235;BA.debugLine="SetAttr(CreateMap(\":md-type\": pp))";
__ref._setattr /*b4j.example.vmbottombar*/ (null,__c.createMap(new Object[] {(Object)(":md-type"),(Object)(_pp)}));
RDebugUtils.currentLine=69599236;
 //BA.debugLineNum = 69599236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69599237;
 //BA.debugLineNum = 69599237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _settypefixed(b4j.example.vmbottombar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "settypefixed", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "settypefixed", new Object[] {_b}));}
RDebugUtils.currentLine=69664768;
 //BA.debugLineNum = 69664768;BA.debugLine="Sub SetTypeFixed(b As Boolean) As VMBottomBar    '";
RDebugUtils.currentLine=69664769;
 //BA.debugLineNum = 69664769;BA.debugLine="SetType(\"fixed\")";
__ref._settype /*b4j.example.vmbottombar*/ (null,(Object)("fixed"));
RDebugUtils.currentLine=69664770;
 //BA.debugLineNum = 69664770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69664771;
 //BA.debugLineNum = 69664771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _settypeshift(b4j.example.vmbottombar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "settypeshift", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "settypeshift", new Object[] {_b}));}
RDebugUtils.currentLine=69730304;
 //BA.debugLineNum = 69730304;BA.debugLine="Sub SetTypeShift(b As Boolean) As VMBottomBar    '";
RDebugUtils.currentLine=69730305;
 //BA.debugLineNum = 69730305;BA.debugLine="SetType(\"shift\")";
__ref._settype /*b4j.example.vmbottombar*/ (null,(Object)("shift"));
RDebugUtils.currentLine=69730306;
 //BA.debugLineNum = 69730306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=69730307;
 //BA.debugLineNum = 69730307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setvif(b4j.example.vmbottombar __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=68747264;
 //BA.debugLineNum = 68747264;BA.debugLine="Sub SetVIf(vif As Object) As VMBottomBar";
RDebugUtils.currentLine=68747265;
 //BA.debugLineNum = 68747265;BA.debugLine="BottomBar.SetVIf(vif)";
__ref._bottombar /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=68747266;
 //BA.debugLineNum = 68747266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=68747267;
 //BA.debugLineNum = 68747267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setvmodel(b4j.example.vmbottombar __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=68681728;
 //BA.debugLineNum = 68681728;BA.debugLine="Sub SetVModel(k As String) As VMBottomBar";
RDebugUtils.currentLine=68681729;
 //BA.debugLineNum = 68681729;BA.debugLine="BottomBar.SetVModel(k)";
__ref._bottombar /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=68681730;
 //BA.debugLineNum = 68681730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=68681731;
 //BA.debugLineNum = 68681731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _setvshow(b4j.example.vmbottombar __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombar";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=68812800;
 //BA.debugLineNum = 68812800;BA.debugLine="Sub SetVShow(vif As Object) As VMBottomBar";
RDebugUtils.currentLine=68812801;
 //BA.debugLineNum = 68812801;BA.debugLine="BottomBar.SetVShow(vif)";
__ref._bottombar /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=68812802;
 //BA.debugLineNum = 68812802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombar)(this);
RDebugUtils.currentLine=68812803;
 //BA.debugLineNum = 68812803;BA.debugLine="End Sub";
return null;
}
}