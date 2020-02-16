package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtable.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _table = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmtoolbar _toolbar = null;
public Object _module = null;
public b4j.example.vmtr _tblrow = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmtable  _initialize(b4j.example.vmtable __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
String _pp = "";
RDebugUtils.currentLine=206307328;
 //BA.debugLineNum = 206307328;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=206307329;
 //BA.debugLineNum = 206307329;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=206307330;
 //BA.debugLineNum = 206307330;BA.debugLine="Table.Initialize(v, ID)";
__ref._table /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=206307331;
 //BA.debugLineNum = 206307331;BA.debugLine="Table.SetTag(\"md-table\")";
__ref._table /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-table");
RDebugUtils.currentLine=206307332;
 //BA.debugLineNum = 206307332;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=206307333;
 //BA.debugLineNum = 206307333;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=206307334;
 //BA.debugLineNum = 206307334;BA.debugLine="SetOnSelected";
__ref._setonselected /*b4j.example.vmtable*/ (null);
RDebugUtils.currentLine=206307336;
 //BA.debugLineNum = 206307336;BA.debugLine="ToolBar.Initialize(vue, $\"${ID}table\"$, eventHand";
__ref._toolbar /*b4j.example.vmtoolbar*/ ._initialize /*b4j.example.vmtoolbar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"table"),_eventhandler)._settabletoolbar /*b4j.example.vmtoolbar*/ (null,__c.True);
RDebugUtils.currentLine=206307337;
 //BA.debugLineNum = 206307337;BA.debugLine="tblRow.Initialize(vue, $\"${ID}row\"$, ID)";
__ref._tblrow /*b4j.example.vmtr*/ ._initialize /*b4j.example.vmtr*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"row"),__ref._id /*String*/ );
RDebugUtils.currentLine=206307338;
 //BA.debugLineNum = 206307338;BA.debugLine="Table.RemoveAttr(\":required\")";
__ref._table /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=206307339;
 //BA.debugLineNum = 206307339;BA.debugLine="Table.RemoveAttr(\":disabled\")";
__ref._table /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=206307340;
 //BA.debugLineNum = 206307340;BA.debugLine="Table.RemoveAttr(\"id\")";
__ref._table /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"id");
RDebugUtils.currentLine=206307341;
 //BA.debugLineNum = 206307341;BA.debugLine="Table.RemoveAttr(\"ref\")";
__ref._table /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"ref");
RDebugUtils.currentLine=206307342;
 //BA.debugLineNum = 206307342;BA.debugLine="Dim pp As String = $\"${ID}selection\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"selection");
RDebugUtils.currentLine=206307343;
 //BA.debugLineNum = 206307343;BA.debugLine="vue.SetStateSingle(pp, Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,__c.Null);
RDebugUtils.currentLine=206307344;
 //BA.debugLineNum = 206307344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206307345;
 //BA.debugLineNum = 206307345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _addchild(b4j.example.vmtable __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=207421440;
 //BA.debugLineNum = 207421440;BA.debugLine="Sub AddChild(child As VMElement) As VMTable";
RDebugUtils.currentLine=207421441;
 //BA.debugLineNum = 207421441;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=207421442;
 //BA.debugLineNum = 207421442;BA.debugLine="Table.SetText(childHTML)";
__ref._table /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=207421443;
 //BA.debugLineNum = 207421443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207421444;
 //BA.debugLineNum = 207421444;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmtable __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=207945728;
 //BA.debugLineNum = 207945728;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=207945729;
 //BA.debugLineNum = 207945729;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=207945730;
 //BA.debugLineNum = 207945730;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmtable*/ (null,_childx);
 }
};
RDebugUtils.currentLine=207945732;
 //BA.debugLineNum = 207945732;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtable  _addclass(b4j.example.vmtable __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=207749120;
 //BA.debugLineNum = 207749120;BA.debugLine="Sub AddClass(c As String) As VMTable";
RDebugUtils.currentLine=207749121;
 //BA.debugLineNum = 207749121;BA.debugLine="Table.AddClass(c)";
__ref._table /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=207749122;
 //BA.debugLineNum = 207749122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207749123;
 //BA.debugLineNum = 207749123;BA.debugLine="End Sub";
return null;
}
public String  _addcolumn(b4j.example.vmtable __ref,String _colid,String _collabel,boolean _colnumeric,boolean _colvisible) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "addcolumn", true))
	 {return ((String) Debug.delegate(ba, "addcolumn", new Object[] {_colid,_collabel,_colnumeric,_colvisible}));}
b4j.example.vmtd _tc = null;
RDebugUtils.currentLine=206635008;
 //BA.debugLineNum = 206635008;BA.debugLine="Sub AddColumn(colID As String, colLabel As String,";
RDebugUtils.currentLine=206635009;
 //BA.debugLineNum = 206635009;BA.debugLine="Dim tc As VMTD";
_tc = new b4j.example.vmtd();
RDebugUtils.currentLine=206635010;
 //BA.debugLineNum = 206635010;BA.debugLine="tc.Initialize(vue, colID).SetLabel(colLabel).SetS";
_tc._initialize /*b4j.example.vmtd*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_colid)._setlabel /*b4j.example.vmtd*/ (null,_collabel)._setsortby /*b4j.example.vmtd*/ (null,_colid)._setnumeric /*b4j.example.vmtd*/ (null,_colnumeric)._settext /*b4j.example.vmtd*/ (null,(Object)(("{{ item."+__c.SmartStringFormatter("",(Object)(_colid))+" }}")));
RDebugUtils.currentLine=206635011;
 //BA.debugLineNum = 206635011;BA.debugLine="tc.SetVShow(colVisible)";
_tc._setvshow /*b4j.example.vmtd*/ (null,_colvisible);
RDebugUtils.currentLine=206635012;
 //BA.debugLineNum = 206635012;BA.debugLine="tc.Pop(tblRow.TR)";
_tc._pop /*String*/ (null,__ref._tblrow /*b4j.example.vmtr*/ ._tr /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=206635013;
 //BA.debugLineNum = 206635013;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmtable __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=208076800;
 //BA.debugLineNum = 208076800;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=208076801;
 //BA.debugLineNum = 208076801;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=208076802;
 //BA.debugLineNum = 208076802;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=206700544;
 //BA.debugLineNum = 206700544;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=206700545;
 //BA.debugLineNum = 206700545;BA.debugLine="If ToolBar.HasContent Then";
if (__ref._toolbar /*b4j.example.vmtoolbar*/ ._hascontent /*boolean*/ ) { 
RDebugUtils.currentLine=206700546;
 //BA.debugLineNum = 206700546;BA.debugLine="ToolBar.Pop(Table)";
__ref._toolbar /*b4j.example.vmtoolbar*/ ._pop /*String*/ (null,__ref._table /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=206700548;
 //BA.debugLineNum = 206700548;BA.debugLine="If tblRow.hascontent Then";
if (__ref._tblrow /*b4j.example.vmtr*/ ._hascontent /*boolean*/ ) { 
RDebugUtils.currentLine=206700549;
 //BA.debugLineNum = 206700549;BA.debugLine="tblRow.Pop(Table)";
__ref._tblrow /*b4j.example.vmtr*/ ._pop /*String*/ (null,__ref._table /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=206700551;
 //BA.debugLineNum = 206700551;BA.debugLine="Return Table.ToString";
if (true) return __ref._table /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=206700552;
 //BA.debugLineNum = 206700552;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
RDebugUtils.currentLine=206241792;
 //BA.debugLineNum = 206241792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=206241793;
 //BA.debugLineNum = 206241793;BA.debugLine="Public Table As VMElement";
_table = new b4j.example.vmelement();
RDebugUtils.currentLine=206241794;
 //BA.debugLineNum = 206241794;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=206241795;
 //BA.debugLineNum = 206241795;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=206241796;
 //BA.debugLineNum = 206241796;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=206241797;
 //BA.debugLineNum = 206241797;BA.debugLine="Public ToolBar As VMToolBar";
_toolbar = new b4j.example.vmtoolbar();
RDebugUtils.currentLine=206241798;
 //BA.debugLineNum = 206241798;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=206241799;
 //BA.debugLineNum = 206241799;BA.debugLine="Private tblRow As VMTR";
_tblrow = new b4j.example.vmtr();
RDebugUtils.currentLine=206241800;
 //BA.debugLineNum = 206241800;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtable  _setonselected(b4j.example.vmtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setonselected", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setonselected", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=207224832;
 //BA.debugLineNum = 207224832;BA.debugLine="private Sub SetOnSelected As VMTable";
RDebugUtils.currentLine=207224833;
 //BA.debugLineNum = 207224833;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=207224834;
 //BA.debugLineNum = 207224834;BA.debugLine="Dim methodName As String = $\"${ID}_select\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_select");
RDebugUtils.currentLine=207224835;
 //BA.debugLineNum = 207224835;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_items.getObject())}))));
RDebugUtils.currentLine=207224836;
 //BA.debugLineNum = 207224836;BA.debugLine="SetAttr(CreateMap(\"@md-selected\": methodName))";
__ref._setattr /*b4j.example.vmtable*/ (null,__c.createMap(new Object[] {(Object)("@md-selected"),(Object)(_methodname)}));
RDebugUtils.currentLine=207224838;
 //BA.debugLineNum = 207224838;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=207224839;
 //BA.debugLineNum = 207224839;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207224840;
 //BA.debugLineNum = 207224840;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtable __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=207683584;
 //BA.debugLineNum = 207683584;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=207683585;
 //BA.debugLineNum = 207683585;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=207683586;
 //BA.debugLineNum = 207683586;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=207355904;
 //BA.debugLineNum = 207355904;BA.debugLine="Sub Render";
RDebugUtils.currentLine=207355905;
 //BA.debugLineNum = 207355905;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=207355906;
 //BA.debugLineNum = 207355906;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtable  _setaccent(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=207618048;
 //BA.debugLineNum = 207618048;BA.debugLine="Sub SetAccent(b As Boolean) As VMTable";
RDebugUtils.currentLine=207618049;
 //BA.debugLineNum = 207618049;BA.debugLine="If b Then Table.SetAccent(True)";
if (_b) { 
__ref._table /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);};
RDebugUtils.currentLine=207618050;
 //BA.debugLineNum = 207618050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207618051;
 //BA.debugLineNum = 207618051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setattr(b4j.example.vmtable __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=207814656;
 //BA.debugLineNum = 207814656;BA.debugLine="Sub SetAttr(attr As Map) As VMTable";
RDebugUtils.currentLine=207814657;
 //BA.debugLineNum = 207814657;BA.debugLine="Table.SetAttr(attr)";
__ref._table /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=207814658;
 //BA.debugLineNum = 207814658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207814659;
 //BA.debugLineNum = 207814659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setautoselect(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setautoselect", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setautoselect", new Object[] {_b}));}
RDebugUtils.currentLine=206503936;
 //BA.debugLineNum = 206503936;BA.debugLine="Sub SetAutoSelect(b As Boolean) As VMTable";
RDebugUtils.currentLine=206503937;
 //BA.debugLineNum = 206503937;BA.debugLine="tblRow.SetAutoSelect(b)";
__ref._tblrow /*b4j.example.vmtr*/ ._setautoselect /*b4j.example.vmtr*/ (null,_b);
RDebugUtils.currentLine=206503938;
 //BA.debugLineNum = 206503938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206503939;
 //BA.debugLineNum = 206503939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setcard(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setcard", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setcard", new Object[] {_b}));}
RDebugUtils.currentLine=206897152;
 //BA.debugLineNum = 206897152;BA.debugLine="Sub SetCard(b As Boolean) As VMTable";
RDebugUtils.currentLine=206897153;
 //BA.debugLineNum = 206897153;BA.debugLine="If b Then SetAttr(CreateMap(\"md-card\": True))";
if (_b) { 
__ref._setattr /*b4j.example.vmtable*/ (null,__c.createMap(new Object[] {(Object)("md-card"),(Object)(__c.True)}));};
RDebugUtils.currentLine=206897154;
 //BA.debugLineNum = 206897154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206897155;
 //BA.debugLineNum = 206897155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setelevation(b4j.example.vmtable __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=206569472;
 //BA.debugLineNum = 206569472;BA.debugLine="Sub SetElevation(e As Int) As VMTable";
RDebugUtils.currentLine=206569473;
 //BA.debugLineNum = 206569473;BA.debugLine="Table.SetElevation(e)";
__ref._table /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=206569474;
 //BA.debugLineNum = 206569474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206569475;
 //BA.debugLineNum = 206569475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setfixedheaders(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setfixedheaders", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setfixedheaders", new Object[] {_b}));}
RDebugUtils.currentLine=206766080;
 //BA.debugLineNum = 206766080;BA.debugLine="Sub SetFixedHeaders(b As Boolean) As VMTable";
RDebugUtils.currentLine=206766081;
 //BA.debugLineNum = 206766081;BA.debugLine="If b Then SetAttr(CreateMap(\"md-fixed-header\":\"tr";
if (_b) { 
__ref._setattr /*b4j.example.vmtable*/ (null,__c.createMap(new Object[] {(Object)("md-fixed-header"),(Object)("true")}));};
RDebugUtils.currentLine=206766082;
 //BA.debugLineNum = 206766082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206766083;
 //BA.debugLineNum = 206766083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setpadding(b4j.example.vmtable __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=208011264;
 //BA.debugLineNum = 208011264;BA.debugLine="Sub SetPadding(p As Object) As VMTable";
RDebugUtils.currentLine=208011265;
 //BA.debugLineNum = 208011265;BA.debugLine="Table.SetPaddingAll(p)";
__ref._table /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=208011266;
 //BA.debugLineNum = 208011266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=208011267;
 //BA.debugLineNum = 208011267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setprimary(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=207552512;
 //BA.debugLineNum = 207552512;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTable";
RDebugUtils.currentLine=207552513;
 //BA.debugLineNum = 207552513;BA.debugLine="If b Then Table.SetPrimary(True)";
if (_b) { 
__ref._table /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);};
RDebugUtils.currentLine=207552514;
 //BA.debugLineNum = 207552514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207552515;
 //BA.debugLineNum = 207552515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setselectablemultiple(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setselectablemultiple", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setselectablemultiple", new Object[] {_b}));}
RDebugUtils.currentLine=206438400;
 //BA.debugLineNum = 206438400;BA.debugLine="Sub SetSelectableMultiple(b As Boolean) As VMTable";
RDebugUtils.currentLine=206438401;
 //BA.debugLineNum = 206438401;BA.debugLine="tblRow.SetSelectableMultiple(b)";
__ref._tblrow /*b4j.example.vmtr*/ ._setselectablemultiple /*b4j.example.vmtr*/ (null,_b);
RDebugUtils.currentLine=206438402;
 //BA.debugLineNum = 206438402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206438403;
 //BA.debugLineNum = 206438403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setselectablesingle(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setselectablesingle", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setselectablesingle", new Object[] {_b}));}
RDebugUtils.currentLine=206372864;
 //BA.debugLineNum = 206372864;BA.debugLine="Sub SetSelectableSingle(b As Boolean) As VMTable";
RDebugUtils.currentLine=206372865;
 //BA.debugLineNum = 206372865;BA.debugLine="tblRow.SetSelectableSingle(b)";
__ref._tblrow /*b4j.example.vmtr*/ ._setselectablesingle /*b4j.example.vmtr*/ (null,_b);
RDebugUtils.currentLine=206372866;
 //BA.debugLineNum = 206372866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206372867;
 //BA.debugLineNum = 206372867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setsort(b4j.example.vmtable __ref,String _columnname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setsort", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setsort", new Object[] {_columnname}));}
RDebugUtils.currentLine=206831616;
 //BA.debugLineNum = 206831616;BA.debugLine="Sub SetSort(columnName As String) As VMTable";
RDebugUtils.currentLine=206831617;
 //BA.debugLineNum = 206831617;BA.debugLine="SetAttr(CreateMap(\"md-sort\":columnName))";
__ref._setattr /*b4j.example.vmtable*/ (null,__c.createMap(new Object[] {(Object)("md-sort"),(Object)(_columnname)}));
RDebugUtils.currentLine=206831618;
 //BA.debugLineNum = 206831618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206831619;
 //BA.debugLineNum = 206831619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setsortorderasc(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setsortorderasc", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setsortorderasc", new Object[] {_b}));}
RDebugUtils.currentLine=207093760;
 //BA.debugLineNum = 207093760;BA.debugLine="Sub SetSortOrderAsc(b As Boolean) As VMTable";
RDebugUtils.currentLine=207093761;
 //BA.debugLineNum = 207093761;BA.debugLine="If b Then SetAttr(CreateMap(\"md-sort-order\":\"asc\"";
if (_b) { 
__ref._setattr /*b4j.example.vmtable*/ (null,__c.createMap(new Object[] {(Object)("md-sort-order"),(Object)("asc")}));};
RDebugUtils.currentLine=207093762;
 //BA.debugLineNum = 207093762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207093763;
 //BA.debugLineNum = 207093763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setsortorderdesc(b4j.example.vmtable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setsortorderdesc", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setsortorderdesc", new Object[] {_b}));}
RDebugUtils.currentLine=207159296;
 //BA.debugLineNum = 207159296;BA.debugLine="Sub SetSortOrderDesc(b As Boolean) As VMTable";
RDebugUtils.currentLine=207159297;
 //BA.debugLineNum = 207159297;BA.debugLine="If b Then SetAttr(CreateMap(\"md-sort-order\":\"desc";
if (_b) { 
__ref._setattr /*b4j.example.vmtable*/ (null,__c.createMap(new Object[] {(Object)("md-sort-order"),(Object)("desc")}));};
RDebugUtils.currentLine=207159298;
 //BA.debugLineNum = 207159298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207159299;
 //BA.debugLineNum = 207159299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setstyle(b4j.example.vmtable __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=207880192;
 //BA.debugLineNum = 207880192;BA.debugLine="Sub SetStyle(sm As Map) As VMTable";
RDebugUtils.currentLine=207880193;
 //BA.debugLineNum = 207880193;BA.debugLine="Table.SetStyle(sm)";
__ref._table /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=207880194;
 //BA.debugLineNum = 207880194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207880195;
 //BA.debugLineNum = 207880195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _settext(b4j.example.vmtable __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=207486976;
 //BA.debugLineNum = 207486976;BA.debugLine="Sub SetText(t As Object) As VMTable";
RDebugUtils.currentLine=207486977;
 //BA.debugLineNum = 207486977;BA.debugLine="Table.SetText(t)";
__ref._table /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=207486978;
 //BA.debugLineNum = 207486978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207486979;
 //BA.debugLineNum = 207486979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setvif(b4j.example.vmtable __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=207028224;
 //BA.debugLineNum = 207028224;BA.debugLine="Sub SetVIf(vif As Object) As VMTable";
RDebugUtils.currentLine=207028225;
 //BA.debugLineNum = 207028225;BA.debugLine="Table.SetVIf(vif)";
__ref._table /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=207028226;
 //BA.debugLineNum = 207028226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207028227;
 //BA.debugLineNum = 207028227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setvmodel(b4j.example.vmtable __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=206962688;
 //BA.debugLineNum = 206962688;BA.debugLine="Sub SetVModel(k As String) As VMTable";
RDebugUtils.currentLine=206962689;
 //BA.debugLineNum = 206962689;BA.debugLine="Table.SetVModel(k)";
__ref._table /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=206962690;
 //BA.debugLineNum = 206962690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=206962691;
 //BA.debugLineNum = 206962691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _setvshow(b4j.example.vmtable __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtable";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=207290368;
 //BA.debugLineNum = 207290368;BA.debugLine="Sub SetVShow(vif As Object) As VMTable";
RDebugUtils.currentLine=207290369;
 //BA.debugLineNum = 207290369;BA.debugLine="Table.SetVShow(vif)";
__ref._table /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=207290370;
 //BA.debugLineNum = 207290370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtable)(this);
RDebugUtils.currentLine=207290371;
 //BA.debugLineNum = 207290371;BA.debugLine="End Sub";
return null;
}
}