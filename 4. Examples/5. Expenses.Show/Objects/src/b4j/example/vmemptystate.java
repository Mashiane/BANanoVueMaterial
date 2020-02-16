package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmemptystate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmemptystate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmemptystate.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _emptystate = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmemptystate  _initialize(b4j.example.vmemptystate __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=118947840;
 //BA.debugLineNum = 118947840;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=118947841;
 //BA.debugLineNum = 118947841;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=118947842;
 //BA.debugLineNum = 118947842;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=118947843;
 //BA.debugLineNum = 118947843;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=118947844;
 //BA.debugLineNum = 118947844;BA.debugLine="EmptyState.Initialize(vue, ID).SetTag(\"md-empty-s";
__ref._emptystate /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-empty-state");
RDebugUtils.currentLine=118947845;
 //BA.debugLineNum = 118947845;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=118947846;
 //BA.debugLineNum = 118947846;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _addchild(b4j.example.vmemptystate __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=119341056;
 //BA.debugLineNum = 119341056;BA.debugLine="Sub AddChild(child As VMElement) As VMEmptyState";
RDebugUtils.currentLine=119341057;
 //BA.debugLineNum = 119341057;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=119341058;
 //BA.debugLineNum = 119341058;BA.debugLine="EmptyState.SetText(childHTML)";
__ref._emptystate /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=119341059;
 //BA.debugLineNum = 119341059;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119341060;
 //BA.debugLineNum = 119341060;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmemptystate __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=119406592;
 //BA.debugLineNum = 119406592;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=119406593;
 //BA.debugLineNum = 119406593;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=119406594;
 //BA.debugLineNum = 119406594;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmemptystate*/ (null,_childx);
 }
};
RDebugUtils.currentLine=119406596;
 //BA.debugLineNum = 119406596;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmemptystate  _addclass(b4j.example.vmemptystate __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=120061952;
 //BA.debugLineNum = 120061952;BA.debugLine="Sub AddClass(c As String) As VMEmptyState";
RDebugUtils.currentLine=120061953;
 //BA.debugLineNum = 120061953;BA.debugLine="EmptyState.AddClass(c)";
__ref._emptystate /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=120061954;
 //BA.debugLineNum = 120061954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=120061955;
 //BA.debugLineNum = 120061955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _addhtml(b4j.example.vmemptystate __ref,String _html) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "addhtml", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "addhtml", new Object[] {_html}));}
RDebugUtils.currentLine=119275520;
 //BA.debugLineNum = 119275520;BA.debugLine="Sub AddHTML(html As String) As VMEmptyState";
RDebugUtils.currentLine=119275521;
 //BA.debugLineNum = 119275521;BA.debugLine="EmptyState.SetText(html)";
__ref._emptystate /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_html);
RDebugUtils.currentLine=119275522;
 //BA.debugLineNum = 119275522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119275523;
 //BA.debugLineNum = 119275523;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmemptystate __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=120389632;
 //BA.debugLineNum = 120389632;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=120389633;
 //BA.debugLineNum = 120389633;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=120389634;
 //BA.debugLineNum = 120389634;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmemptystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=120193024;
 //BA.debugLineNum = 120193024;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=120193025;
 //BA.debugLineNum = 120193025;BA.debugLine="Return EmptyState.tostring";
if (true) return __ref._emptystate /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=120193026;
 //BA.debugLineNum = 120193026;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmemptystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
RDebugUtils.currentLine=118882304;
 //BA.debugLineNum = 118882304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=118882305;
 //BA.debugLineNum = 118882305;BA.debugLine="Public EmptyState As VMElement";
_emptystate = new b4j.example.vmelement();
RDebugUtils.currentLine=118882306;
 //BA.debugLineNum = 118882306;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=118882307;
 //BA.debugLineNum = 118882307;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=118882308;
 //BA.debugLineNum = 118882308;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=118882309;
 //BA.debugLineNum = 118882309;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmemptystate __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=120324096;
 //BA.debugLineNum = 120324096;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=120324097;
 //BA.debugLineNum = 120324097;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=120324098;
 //BA.debugLineNum = 120324098;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmemptystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=120258560;
 //BA.debugLineNum = 120258560;BA.debugLine="Sub Render";
RDebugUtils.currentLine=120258561;
 //BA.debugLineNum = 120258561;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=120258562;
 //BA.debugLineNum = 120258562;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmemptystate  _setaccent(b4j.example.vmemptystate __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=119930880;
 //BA.debugLineNum = 119930880;BA.debugLine="Sub SetAccent(b As Boolean) As VMEmptyState";
RDebugUtils.currentLine=119930881;
 //BA.debugLineNum = 119930881;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmemptystate)(this);};
RDebugUtils.currentLine=119930882;
 //BA.debugLineNum = 119930882;BA.debugLine="EmptyState.AddClass(\"md-accent\")";
__ref._emptystate /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-accent");
RDebugUtils.currentLine=119930883;
 //BA.debugLineNum = 119930883;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119930884;
 //BA.debugLineNum = 119930884;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setattr(b4j.example.vmemptystate __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=120127488;
 //BA.debugLineNum = 120127488;BA.debugLine="Sub SetAttr(attr As Map) As VMEmptyState";
RDebugUtils.currentLine=120127489;
 //BA.debugLineNum = 120127489;BA.debugLine="EmptyState.SetAttr(attr)";
__ref._emptystate /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=120127490;
 //BA.debugLineNum = 120127490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=120127491;
 //BA.debugLineNum = 120127491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setdescription(b4j.example.vmemptystate __ref,String _labelx) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setdescription", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setdescription", new Object[] {_labelx}));}
RDebugUtils.currentLine=119668736;
 //BA.debugLineNum = 119668736;BA.debugLine="Sub SetDescription(labelx As String) As VMEmptySta";
RDebugUtils.currentLine=119668737;
 //BA.debugLineNum = 119668737;BA.debugLine="If labelx = \"\" Then Return Me";
if ((_labelx).equals("")) { 
if (true) return (b4j.example.vmemptystate)(this);};
RDebugUtils.currentLine=119668738;
 //BA.debugLineNum = 119668738;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-description\": la";
__ref._emptystate /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-description"),(Object)(_labelx)}));
RDebugUtils.currentLine=119668739;
 //BA.debugLineNum = 119668739;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119668740;
 //BA.debugLineNum = 119668740;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _seticon(b4j.example.vmemptystate __ref,String _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "seticon", new Object[] {_icon}));}
RDebugUtils.currentLine=119537664;
 //BA.debugLineNum = 119537664;BA.debugLine="Sub SetIcon(icon As String) As VMEmptyState";
RDebugUtils.currentLine=119537665;
 //BA.debugLineNum = 119537665;BA.debugLine="If icon = \"\" Then Return Me";
if ((_icon).equals("")) { 
if (true) return (b4j.example.vmemptystate)(this);};
RDebugUtils.currentLine=119537666;
 //BA.debugLineNum = 119537666;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-icon\": icon))";
__ref._emptystate /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-icon"),(Object)(_icon)}));
RDebugUtils.currentLine=119537667;
 //BA.debugLineNum = 119537667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119537668;
 //BA.debugLineNum = 119537668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setid(b4j.example.vmemptystate __ref,String _iid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setid", new Object[] {_iid,_bind}));}
RDebugUtils.currentLine=119144448;
 //BA.debugLineNum = 119144448;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMEmp";
RDebugUtils.currentLine=119144449;
 //BA.debugLineNum = 119144449;BA.debugLine="EmptyState.SetID(iID,bind)";
__ref._emptystate /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_iid,_bind);
RDebugUtils.currentLine=119144450;
 //BA.debugLineNum = 119144450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119144451;
 //BA.debugLineNum = 119144451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setkey(b4j.example.vmemptystate __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=119472128;
 //BA.debugLineNum = 119472128;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMEmpt";
RDebugUtils.currentLine=119472129;
 //BA.debugLineNum = 119472129;BA.debugLine="EmptyState.SetKey(k, bind)";
__ref._emptystate /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=119472130;
 //BA.debugLineNum = 119472130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119472131;
 //BA.debugLineNum = 119472131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setlabel(b4j.example.vmemptystate __ref,String _labelx) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setlabel", new Object[] {_labelx}));}
RDebugUtils.currentLine=119603200;
 //BA.debugLineNum = 119603200;BA.debugLine="Sub SetLabel(labelx As String) As VMEmptyState";
RDebugUtils.currentLine=119603201;
 //BA.debugLineNum = 119603201;BA.debugLine="If labelx = \"\" Then Return Me";
if ((_labelx).equals("")) { 
if (true) return (b4j.example.vmemptystate)(this);};
RDebugUtils.currentLine=119603202;
 //BA.debugLineNum = 119603202;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-label\": labelx))";
__ref._emptystate /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-label"),(Object)(_labelx)}));
RDebugUtils.currentLine=119603203;
 //BA.debugLineNum = 119603203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119603204;
 //BA.debugLineNum = 119603204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setname(b4j.example.vmemptystate __ref,String _nam,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setname", new Object[] {_nam,_bind}));}
RDebugUtils.currentLine=119209984;
 //BA.debugLineNum = 119209984;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VME";
RDebugUtils.currentLine=119209985;
 //BA.debugLineNum = 119209985;BA.debugLine="EmptyState.SetName(nam, bind)";
__ref._emptystate /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_nam,_bind);
RDebugUtils.currentLine=119209986;
 //BA.debugLineNum = 119209986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119209987;
 //BA.debugLineNum = 119209987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setprimary(b4j.example.vmemptystate __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=119865344;
 //BA.debugLineNum = 119865344;BA.debugLine="Sub SetPrimary(b As Boolean) As VMEmptyState";
RDebugUtils.currentLine=119865345;
 //BA.debugLineNum = 119865345;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmemptystate)(this);};
RDebugUtils.currentLine=119865346;
 //BA.debugLineNum = 119865346;BA.debugLine="EmptyState.AddClass(\"md-primary\")";
__ref._emptystate /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-primary");
RDebugUtils.currentLine=119865347;
 //BA.debugLineNum = 119865347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119865348;
 //BA.debugLineNum = 119865348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setrounded(b4j.example.vmemptystate __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setrounded", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setrounded", new Object[] {_b}));}
RDebugUtils.currentLine=119734272;
 //BA.debugLineNum = 119734272;BA.debugLine="Sub SetRounded(b As Boolean) As VMEmptyState";
RDebugUtils.currentLine=119734273;
 //BA.debugLineNum = 119734273;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmemptystate)(this);};
RDebugUtils.currentLine=119734274;
 //BA.debugLineNum = 119734274;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-rounded\": b))";
__ref._emptystate /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-rounded"),(Object)(_b)}));
RDebugUtils.currentLine=119734275;
 //BA.debugLineNum = 119734275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119734276;
 //BA.debugLineNum = 119734276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setsize(b4j.example.vmemptystate __ref,String _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setsize", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setsize", new Object[] {_size}));}
RDebugUtils.currentLine=119799808;
 //BA.debugLineNum = 119799808;BA.debugLine="Sub SetSize(size As String) As VMEmptyState";
RDebugUtils.currentLine=119799809;
 //BA.debugLineNum = 119799809;BA.debugLine="If size = \"\" Then Return Me";
if ((_size).equals("")) { 
if (true) return (b4j.example.vmemptystate)(this);};
RDebugUtils.currentLine=119799810;
 //BA.debugLineNum = 119799810;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-size\": size))";
__ref._emptystate /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-size"),(Object)(_size)}));
RDebugUtils.currentLine=119799811;
 //BA.debugLineNum = 119799811;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119799812;
 //BA.debugLineNum = 119799812;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setstyle(b4j.example.vmemptystate __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=119013376;
 //BA.debugLineNum = 119013376;BA.debugLine="Sub SetStyle(sm As Map) As VMEmptyState";
RDebugUtils.currentLine=119013377;
 //BA.debugLineNum = 119013377;BA.debugLine="EmptyState.SetStyle(sm)";
__ref._emptystate /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=119013378;
 //BA.debugLineNum = 119013378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119013379;
 //BA.debugLineNum = 119013379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setvif(b4j.example.vmemptystate __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=119078912;
 //BA.debugLineNum = 119078912;BA.debugLine="Sub SetVIf(vif As String) As VMEmptyState";
RDebugUtils.currentLine=119078913;
 //BA.debugLineNum = 119078913;BA.debugLine="EmptyState.SetVIf(vif)";
__ref._emptystate /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=119078914;
 //BA.debugLineNum = 119078914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119078915;
 //BA.debugLineNum = 119078915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setvshow(b4j.example.vmemptystate __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmemptystate";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=119996416;
 //BA.debugLineNum = 119996416;BA.debugLine="Sub SetVShow(vif As String) As VMEmptyState";
RDebugUtils.currentLine=119996417;
 //BA.debugLineNum = 119996417;BA.debugLine="EmptyState.SetVShow(vif)";
__ref._emptystate /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=119996418;
 //BA.debugLineNum = 119996418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
RDebugUtils.currentLine=119996419;
 //BA.debugLineNum = 119996419;BA.debugLine="End Sub";
return null;
}
}