package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmspeeddial extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmspeeddial", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmspeeddial.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _speeddial = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _target = null;
public b4j.example.vmelement _content = null;
public boolean _hasbuttons = false;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _pop(b4j.example.vmspeeddial __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=197984256;
 //BA.debugLineNum = 197984256;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=197984257;
 //BA.debugLineNum = 197984257;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=197984258;
 //BA.debugLineNum = 197984258;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _initialize(b4j.example.vmspeeddial __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=197197824;
 //BA.debugLineNum = 197197824;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=197197825;
 //BA.debugLineNum = 197197825;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=197197826;
 //BA.debugLineNum = 197197826;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=197197827;
 //BA.debugLineNum = 197197827;BA.debugLine="SpeedDial.Initialize(v, ID).SetTag(\"md-speed-dial";
__ref._speeddial /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-speed-dial");
RDebugUtils.currentLine=197197828;
 //BA.debugLineNum = 197197828;BA.debugLine="target.Initialize(v,\"\").SetTag(\"md-speed-dial-tar";
__ref._target /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,"")._settag /*b4j.example.vmelement*/ (null,"md-speed-dial-target")._setripple /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=197197829;
 //BA.debugLineNum = 197197829;BA.debugLine="content.Initialize(v,\"\").SetTag(\"md-speed-dial-co";
__ref._content /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,"")._settag /*b4j.example.vmelement*/ (null,"md-speed-dial-content");
RDebugUtils.currentLine=197197830;
 //BA.debugLineNum = 197197830;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=197197831;
 //BA.debugLineNum = 197197831;BA.debugLine="hasButtons = False";
__ref._hasbuttons /*boolean*/  = __c.False;
RDebugUtils.currentLine=197197832;
 //BA.debugLineNum = 197197832;BA.debugLine="SpeedDial.SetOnClick(eventHandler, $\"${ID}_click\"";
__ref._speeddial /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,_eventhandler,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=197197833;
 //BA.debugLineNum = 197197833;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197197834;
 //BA.debugLineNum = 197197834;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _addbutton(b4j.example.vmspeeddial __ref,String _btnid,String _btnicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "addbutton", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "addbutton", new Object[] {_btnid,_btnicon}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=197591040;
 //BA.debugLineNum = 197591040;BA.debugLine="Sub AddButton(btnID As String, btnIcon As String)";
RDebugUtils.currentLine=197591041;
 //BA.debugLineNum = 197591041;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=197591042;
 //BA.debugLineNum = 197591042;BA.debugLine="btn.Initialize(vue,btnID,module).SetIcon(btnIcon)";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_btnid,__ref._module /*Object*/ )._seticon /*b4j.example.vmbutton*/ (null,_btnicon)._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=197591043;
 //BA.debugLineNum = 197591043;BA.debugLine="btn.Pop(content)";
_btn._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=197591044;
 //BA.debugLineNum = 197591044;BA.debugLine="hasButtons = True";
__ref._hasbuttons /*boolean*/  = __c.True;
RDebugUtils.currentLine=197591045;
 //BA.debugLineNum = 197591045;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197591046;
 //BA.debugLineNum = 197591046;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _addchild(b4j.example.vmspeeddial __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=197853184;
 //BA.debugLineNum = 197853184;BA.debugLine="Sub AddChild(child As VMElement) As VMSpeedDial";
RDebugUtils.currentLine=197853185;
 //BA.debugLineNum = 197853185;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=197853186;
 //BA.debugLineNum = 197853186;BA.debugLine="SpeedDial.SetText(childHTML)";
__ref._speeddial /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=197853187;
 //BA.debugLineNum = 197853187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197853188;
 //BA.debugLineNum = 197853188;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmspeeddial __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=198246400;
 //BA.debugLineNum = 198246400;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=198246401;
 //BA.debugLineNum = 198246401;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=198246402;
 //BA.debugLineNum = 198246402;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmspeeddial*/ (null,_childx);
 }
};
RDebugUtils.currentLine=198246404;
 //BA.debugLineNum = 198246404;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _addclass(b4j.example.vmspeeddial __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=198049792;
 //BA.debugLineNum = 198049792;BA.debugLine="Sub AddClass(c As String) As VMSpeedDial";
RDebugUtils.currentLine=198049793;
 //BA.debugLineNum = 198049793;BA.debugLine="SpeedDial.AddClass(c)";
__ref._speeddial /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=198049794;
 //BA.debugLineNum = 198049794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198049795;
 //BA.debugLineNum = 198049795;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmspeeddial __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=199491584;
 //BA.debugLineNum = 199491584;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=199491585;
 //BA.debugLineNum = 199491585;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=199491586;
 //BA.debugLineNum = 199491586;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmspeeddial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=197656576;
 //BA.debugLineNum = 197656576;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=197656577;
 //BA.debugLineNum = 197656577;BA.debugLine="target.Pop(SpeedDial)";
__ref._target /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._speeddial /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=197656578;
 //BA.debugLineNum = 197656578;BA.debugLine="If hasButtons Then content.Pop(SpeedDial)";
if (__ref._hasbuttons /*boolean*/ ) { 
__ref._content /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._speeddial /*b4j.example.vmelement*/ );};
RDebugUtils.currentLine=197656579;
 //BA.debugLineNum = 197656579;BA.debugLine="Return SpeedDial.ToString";
if (true) return __ref._speeddial /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=197656580;
 //BA.debugLineNum = 197656580;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmspeeddial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
RDebugUtils.currentLine=197132288;
 //BA.debugLineNum = 197132288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=197132289;
 //BA.debugLineNum = 197132289;BA.debugLine="Public SpeedDial As VMElement";
_speeddial = new b4j.example.vmelement();
RDebugUtils.currentLine=197132290;
 //BA.debugLineNum = 197132290;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=197132291;
 //BA.debugLineNum = 197132291;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=197132292;
 //BA.debugLineNum = 197132292;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=197132293;
 //BA.debugLineNum = 197132293;BA.debugLine="Private target As VMElement";
_target = new b4j.example.vmelement();
RDebugUtils.currentLine=197132294;
 //BA.debugLineNum = 197132294;BA.debugLine="Private content As VMElement";
_content = new b4j.example.vmelement();
RDebugUtils.currentLine=197132295;
 //BA.debugLineNum = 197132295;BA.debugLine="Private hasButtons As Boolean";
_hasbuttons = false;
RDebugUtils.currentLine=197132296;
 //BA.debugLineNum = 197132296;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=197132297;
 //BA.debugLineNum = 197132297;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmspeeddial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=197787648;
 //BA.debugLineNum = 197787648;BA.debugLine="Sub Render";
RDebugUtils.currentLine=197787649;
 //BA.debugLineNum = 197787649;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=197787650;
 //BA.debugLineNum = 197787650;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspeeddial  _setaccent(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=197394432;
 //BA.debugLineNum = 197394432;BA.debugLine="Sub SetAccent(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=197394433;
 //BA.debugLineNum = 197394433;BA.debugLine="target.AddClass(\"md-accent\")";
__ref._target /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-accent");
RDebugUtils.currentLine=197394434;
 //BA.debugLineNum = 197394434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197394435;
 //BA.debugLineNum = 197394435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setattr(b4j.example.vmspeeddial __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=198115328;
 //BA.debugLineNum = 198115328;BA.debugLine="Sub SetAttr(attr As Map) As VMSpeedDial";
RDebugUtils.currentLine=198115329;
 //BA.debugLineNum = 198115329;BA.debugLine="SpeedDial.SetAttr(attr)";
__ref._speeddial /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=198115330;
 //BA.debugLineNum = 198115330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198115331;
 //BA.debugLineNum = 198115331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdirection(b4j.example.vmspeeddial __ref,Object _vardirection) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setdirection", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setdirection", new Object[] {_vardirection}));}
RDebugUtils.currentLine=198377472;
 //BA.debugLineNum = 198377472;BA.debugLine="Sub SetDirection(varDirection As Object) As VMSpee";
RDebugUtils.currentLine=198377473;
 //BA.debugLineNum = 198377473;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", varDire";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-direction",BA.ObjectToString(_vardirection));
RDebugUtils.currentLine=198377474;
 //BA.debugLineNum = 198377474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198377475;
 //BA.debugLineNum = 198377475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdirectionbottom(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setdirectionbottom", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setdirectionbottom", new Object[] {_b}));}
RDebugUtils.currentLine=198508544;
 //BA.debugLineNum = 198508544;BA.debugLine="Sub SetDirectionBottom(b As Boolean) As VMSpeedDia";
RDebugUtils.currentLine=198508545;
 //BA.debugLineNum = 198508545;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", \"bottom";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-direction","bottom");
RDebugUtils.currentLine=198508546;
 //BA.debugLineNum = 198508546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198508547;
 //BA.debugLineNum = 198508547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setdirectiontop(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setdirectiontop", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setdirectiontop", new Object[] {_b}));}
RDebugUtils.currentLine=198443008;
 //BA.debugLineNum = 198443008;BA.debugLine="Sub SetDirectionTop(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=198443009;
 //BA.debugLineNum = 198443009;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", \"top\")";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-direction","top");
RDebugUtils.currentLine=198443010;
 //BA.debugLineNum = 198443010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198443011;
 //BA.debugLineNum = 198443011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteffect(b4j.example.vmspeeddial __ref,Object _vareffect) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "seteffect", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "seteffect", new Object[] {_vareffect}));}
RDebugUtils.currentLine=198574080;
 //BA.debugLineNum = 198574080;BA.debugLine="Sub SetEffect(varEffect As Object) As VMSpeedDial";
RDebugUtils.currentLine=198574081;
 //BA.debugLineNum = 198574081;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", varEffect)";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-effect",BA.ObjectToString(_vareffect));
RDebugUtils.currentLine=198574082;
 //BA.debugLineNum = 198574082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198574083;
 //BA.debugLineNum = 198574083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteffectfling(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "seteffectfling", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "seteffectfling", new Object[] {_b}));}
RDebugUtils.currentLine=198639616;
 //BA.debugLineNum = 198639616;BA.debugLine="Sub SetEffectFling(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=198639617;
 //BA.debugLineNum = 198639617;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"fling\")";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-effect","fling");
RDebugUtils.currentLine=198639618;
 //BA.debugLineNum = 198639618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198639619;
 //BA.debugLineNum = 198639619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteffectopacity(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "seteffectopacity", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "seteffectopacity", new Object[] {_b}));}
RDebugUtils.currentLine=198770688;
 //BA.debugLineNum = 198770688;BA.debugLine="Sub SetEffectOpacity(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=198770689;
 //BA.debugLineNum = 198770689;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"opacity\")";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-effect","opacity");
RDebugUtils.currentLine=198770690;
 //BA.debugLineNum = 198770690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198770691;
 //BA.debugLineNum = 198770691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteffectscale(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "seteffectscale", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "seteffectscale", new Object[] {_b}));}
RDebugUtils.currentLine=198705152;
 //BA.debugLineNum = 198705152;BA.debugLine="Sub SetEffectScale(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=198705153;
 //BA.debugLineNum = 198705153;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"scale\")";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-effect","scale");
RDebugUtils.currentLine=198705154;
 //BA.debugLineNum = 198705154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198705155;
 //BA.debugLineNum = 198705155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setevent(b4j.example.vmspeeddial __ref,Object _varevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setevent", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setevent", new Object[] {_varevent}));}
RDebugUtils.currentLine=198836224;
 //BA.debugLineNum = 198836224;BA.debugLine="Sub SetEvent(varEvent As Object) As VMSpeedDial";
RDebugUtils.currentLine=198836225;
 //BA.debugLineNum = 198836225;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", varEvent)";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-event",BA.ObjectToString(_varevent));
RDebugUtils.currentLine=198836226;
 //BA.debugLineNum = 198836226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198836227;
 //BA.debugLineNum = 198836227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteventclick(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "seteventclick", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "seteventclick", new Object[] {_b}));}
RDebugUtils.currentLine=198967296;
 //BA.debugLineNum = 198967296;BA.debugLine="Sub SetEventClick(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=198967297;
 //BA.debugLineNum = 198967297;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", \"click\")";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-event","click");
RDebugUtils.currentLine=198967298;
 //BA.debugLineNum = 198967298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198967299;
 //BA.debugLineNum = 198967299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seteventhover(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "seteventhover", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "seteventhover", new Object[] {_b}));}
RDebugUtils.currentLine=198901760;
 //BA.debugLineNum = 198901760;BA.debugLine="Sub SetEventHover(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=198901761;
 //BA.debugLineNum = 198901761;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", \"hover\")";
__ref._speeddial /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-event","hover");
RDebugUtils.currentLine=198901762;
 //BA.debugLineNum = 198901762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198901763;
 //BA.debugLineNum = 198901763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setfinalicon(b4j.example.vmspeeddial __ref,String _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setfinalicon", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setfinalicon", new Object[] {_i}));}
b4j.example.vmicon _icn = null;
RDebugUtils.currentLine=197459968;
 //BA.debugLineNum = 197459968;BA.debugLine="Sub SetFinalIcon(i As String) As VMSpeedDial";
RDebugUtils.currentLine=197459969;
 //BA.debugLineNum = 197459969;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
RDebugUtils.currentLine=197459970;
 //BA.debugLineNum = 197459970;BA.debugLine="icn.Initialize(vue,$\"${ID}finalicon\"$).SetText(i)";
_icn._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"finalicon"))._settext /*b4j.example.vmicon*/ (null,_i)._addclass /*b4j.example.vmicon*/ (null,"md-morph-final");
RDebugUtils.currentLine=197459971;
 //BA.debugLineNum = 197459971;BA.debugLine="icn.Pop(target)";
_icn._pop /*String*/ (null,__ref._target /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=197459972;
 //BA.debugLineNum = 197459972;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197459973;
 //BA.debugLineNum = 197459973;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _seticon(b4j.example.vmspeeddial __ref,String _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "seticon", new Object[] {_i}));}
b4j.example.vmicon _icn = null;
RDebugUtils.currentLine=197525504;
 //BA.debugLineNum = 197525504;BA.debugLine="Sub SetIcon(i As String) As VMSpeedDial";
RDebugUtils.currentLine=197525505;
 //BA.debugLineNum = 197525505;BA.debugLine="If i = \"\" Then Return Me";
if ((_i).equals("")) { 
if (true) return (b4j.example.vmspeeddial)(this);};
RDebugUtils.currentLine=197525506;
 //BA.debugLineNum = 197525506;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
RDebugUtils.currentLine=197525507;
 //BA.debugLineNum = 197525507;BA.debugLine="icn.Initialize(vue,$\"${ID}icon\"$).SetText(i)";
_icn._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon"))._settext /*b4j.example.vmicon*/ (null,_i);
RDebugUtils.currentLine=197525508;
 //BA.debugLineNum = 197525508;BA.debugLine="icn.Pop(target)";
_icn._pop /*String*/ (null,__ref._target /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=197525509;
 //BA.debugLineNum = 197525509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197525510;
 //BA.debugLineNum = 197525510;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setinitialicon(b4j.example.vmspeeddial __ref,String _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setinitialicon", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setinitialicon", new Object[] {_i}));}
b4j.example.vmicon _icn = null;
RDebugUtils.currentLine=197263360;
 //BA.debugLineNum = 197263360;BA.debugLine="Sub SetInitialIcon(i As String) As VMSpeedDial";
RDebugUtils.currentLine=197263361;
 //BA.debugLineNum = 197263361;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
RDebugUtils.currentLine=197263362;
 //BA.debugLineNum = 197263362;BA.debugLine="icn.Initialize(vue,$\"${ID}initicon\"$).SetText(i).";
_icn._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"initicon"))._settext /*b4j.example.vmicon*/ (null,_i)._addclass /*b4j.example.vmicon*/ (null,"md-morph-initial");
RDebugUtils.currentLine=197263363;
 //BA.debugLineNum = 197263363;BA.debugLine="icn.Pop(target)";
_icn._pop /*String*/ (null,__ref._target /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=197263364;
 //BA.debugLineNum = 197263364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197263365;
 //BA.debugLineNum = 197263365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpadding(b4j.example.vmspeeddial __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=198311936;
 //BA.debugLineNum = 198311936;BA.debugLine="Sub SetPadding(p As Object) As VMSpeedDial";
RDebugUtils.currentLine=198311937;
 //BA.debugLineNum = 198311937;BA.debugLine="SpeedDial.SetPaddingAll(p)";
__ref._speeddial /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=198311938;
 //BA.debugLineNum = 198311938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198311939;
 //BA.debugLineNum = 198311939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositionbottomcenter(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setpositionbottomcenter", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setpositionbottomcenter", new Object[] {_b}));}
RDebugUtils.currentLine=199294976;
 //BA.debugLineNum = 199294976;BA.debugLine="Sub SetPositionBottomCenter(b As Boolean) As VMSpe";
RDebugUtils.currentLine=199294977;
 //BA.debugLineNum = 199294977;BA.debugLine="AddClass(\"md-bottom-center\")";
__ref._addclass /*b4j.example.vmspeeddial*/ (null,"md-bottom-center");
RDebugUtils.currentLine=199294978;
 //BA.debugLineNum = 199294978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=199294979;
 //BA.debugLineNum = 199294979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositionbottomleft(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setpositionbottomleft", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setpositionbottomleft", new Object[] {_b}));}
RDebugUtils.currentLine=199360512;
 //BA.debugLineNum = 199360512;BA.debugLine="Sub SetPositionBottomLeft(b As Boolean) As VMSpeed";
RDebugUtils.currentLine=199360513;
 //BA.debugLineNum = 199360513;BA.debugLine="AddClass(\"md-bottom-left\")";
__ref._addclass /*b4j.example.vmspeeddial*/ (null,"md-bottom-left");
RDebugUtils.currentLine=199360514;
 //BA.debugLineNum = 199360514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=199360515;
 //BA.debugLineNum = 199360515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositionbottomright(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setpositionbottomright", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setpositionbottomright", new Object[] {_b}));}
RDebugUtils.currentLine=199229440;
 //BA.debugLineNum = 199229440;BA.debugLine="Sub SetPositionBottomRight(b As Boolean) As VMSpee";
RDebugUtils.currentLine=199229441;
 //BA.debugLineNum = 199229441;BA.debugLine="AddClass(\"md-bottom-right\")";
__ref._addclass /*b4j.example.vmspeeddial*/ (null,"md-bottom-right");
RDebugUtils.currentLine=199229442;
 //BA.debugLineNum = 199229442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=199229443;
 //BA.debugLineNum = 199229443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositionfixed(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setpositionfixed", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setpositionfixed", new Object[] {_b}));}
RDebugUtils.currentLine=199426048;
 //BA.debugLineNum = 199426048;BA.debugLine="Sub SetPositionFixed(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=199426049;
 //BA.debugLineNum = 199426049;BA.debugLine="AddClass(\"md-fixed\")";
__ref._addclass /*b4j.example.vmspeeddial*/ (null,"md-fixed");
RDebugUtils.currentLine=199426050;
 //BA.debugLineNum = 199426050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=199426051;
 //BA.debugLineNum = 199426051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositiontopcenter(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setpositiontopcenter", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setpositiontopcenter", new Object[] {_b}));}
RDebugUtils.currentLine=199098368;
 //BA.debugLineNum = 199098368;BA.debugLine="Sub SetPositionTopCenter(b As Boolean) As VMSpeedD";
RDebugUtils.currentLine=199098369;
 //BA.debugLineNum = 199098369;BA.debugLine="AddClass(\"md-top-center\")";
__ref._addclass /*b4j.example.vmspeeddial*/ (null,"md-top-center");
RDebugUtils.currentLine=199098370;
 //BA.debugLineNum = 199098370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=199098371;
 //BA.debugLineNum = 199098371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositiontopleft(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setpositiontopleft", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setpositiontopleft", new Object[] {_b}));}
RDebugUtils.currentLine=199163904;
 //BA.debugLineNum = 199163904;BA.debugLine="Sub SetPositionTopLeft(b As Boolean) As VMSpeedDia";
RDebugUtils.currentLine=199163905;
 //BA.debugLineNum = 199163905;BA.debugLine="AddClass(\"md-top-left\")";
__ref._addclass /*b4j.example.vmspeeddial*/ (null,"md-top-left");
RDebugUtils.currentLine=199163906;
 //BA.debugLineNum = 199163906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=199163907;
 //BA.debugLineNum = 199163907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setpositiontopright(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setpositiontopright", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setpositiontopright", new Object[] {_b}));}
RDebugUtils.currentLine=199032832;
 //BA.debugLineNum = 199032832;BA.debugLine="Sub SetPositionTopRight(b As Boolean) As VMSpeedDi";
RDebugUtils.currentLine=199032833;
 //BA.debugLineNum = 199032833;BA.debugLine="AddClass(\"md-top-right\")";
__ref._addclass /*b4j.example.vmspeeddial*/ (null,"md-top-right");
RDebugUtils.currentLine=199032834;
 //BA.debugLineNum = 199032834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=199032835;
 //BA.debugLineNum = 199032835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setprimary(b4j.example.vmspeeddial __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=197328896;
 //BA.debugLineNum = 197328896;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSpeedDial";
RDebugUtils.currentLine=197328897;
 //BA.debugLineNum = 197328897;BA.debugLine="target.AddClass(\"md-primary\")";
__ref._target /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-primary");
RDebugUtils.currentLine=197328898;
 //BA.debugLineNum = 197328898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197328899;
 //BA.debugLineNum = 197328899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setstyle(b4j.example.vmspeeddial __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=198180864;
 //BA.debugLineNum = 198180864;BA.debugLine="Sub SetStyle(sm As Map) As VMSpeedDial";
RDebugUtils.currentLine=198180865;
 //BA.debugLineNum = 198180865;BA.debugLine="SpeedDial.SetStyle(sm)";
__ref._speeddial /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=198180866;
 //BA.debugLineNum = 198180866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=198180867;
 //BA.debugLineNum = 198180867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _settext(b4j.example.vmspeeddial __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=197918720;
 //BA.debugLineNum = 197918720;BA.debugLine="Sub SetText(t As Object) As VMSpeedDial";
RDebugUtils.currentLine=197918721;
 //BA.debugLineNum = 197918721;BA.debugLine="SpeedDial.SetText(t)";
__ref._speeddial /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=197918722;
 //BA.debugLineNum = 197918722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197918723;
 //BA.debugLineNum = 197918723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _setvmodel(b4j.example.vmspeeddial __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspeeddial";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=197722112;
 //BA.debugLineNum = 197722112;BA.debugLine="Sub SetVModel(k As String) As VMSpeedDial";
RDebugUtils.currentLine=197722113;
 //BA.debugLineNum = 197722113;BA.debugLine="SpeedDial.SetVModel(k)";
__ref._speeddial /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=197722114;
 //BA.debugLineNum = 197722114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspeeddial)(this);
RDebugUtils.currentLine=197722115;
 //BA.debugLineNum = 197722115;BA.debugLine="End Sub";
return null;
}
}