package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmchip extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmchip", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmchip.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _chip = null;
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
public b4j.example.vmchip  _initialize(b4j.example.vmchip __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=86245376;
 //BA.debugLineNum = 86245376;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=86245377;
 //BA.debugLineNum = 86245377;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=86245378;
 //BA.debugLineNum = 86245378;BA.debugLine="Chip.Initialize(v, ID)";
__ref._chip /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=86245379;
 //BA.debugLineNum = 86245379;BA.debugLine="Chip.SetTag(\"md-chip\")";
__ref._chip /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-chip");
RDebugUtils.currentLine=86245380;
 //BA.debugLineNum = 86245380;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=86245381;
 //BA.debugLineNum = 86245381;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=86245382;
 //BA.debugLineNum = 86245382;BA.debugLine="Chip.SetOnClick(module, $\"${ID}_click\"$)";
__ref._chip /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=86245383;
 //BA.debugLineNum = 86245383;BA.debugLine="SetOnDelete";
__ref._setondelete /*b4j.example.vmchip*/ (null);
RDebugUtils.currentLine=86245384;
 //BA.debugLineNum = 86245384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86245385;
 //BA.debugLineNum = 86245385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _addchild(b4j.example.vmchip __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=86704128;
 //BA.debugLineNum = 86704128;BA.debugLine="Sub AddChild(child As VMElement) As VMChip";
RDebugUtils.currentLine=86704129;
 //BA.debugLineNum = 86704129;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=86704130;
 //BA.debugLineNum = 86704130;BA.debugLine="Chip.SetText(childHTML)";
__ref._chip /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=86704131;
 //BA.debugLineNum = 86704131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86704132;
 //BA.debugLineNum = 86704132;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmchip __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=87228416;
 //BA.debugLineNum = 87228416;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=87228417;
 //BA.debugLineNum = 87228417;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=87228418;
 //BA.debugLineNum = 87228418;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmchip*/ (null,_childx);
 }
};
RDebugUtils.currentLine=87228420;
 //BA.debugLineNum = 87228420;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _addclass(b4j.example.vmchip __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=87031808;
 //BA.debugLineNum = 87031808;BA.debugLine="Sub AddClass(c As String) As VMChip";
RDebugUtils.currentLine=87031809;
 //BA.debugLineNum = 87031809;BA.debugLine="Chip.AddClass(c)";
__ref._chip /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=87031810;
 //BA.debugLineNum = 87031810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87031811;
 //BA.debugLineNum = 87031811;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmchip __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=87818240;
 //BA.debugLineNum = 87818240;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=87818241;
 //BA.debugLineNum = 87818241;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=87818242;
 //BA.debugLineNum = 87818242;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmchip __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=86376448;
 //BA.debugLineNum = 86376448;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=86376449;
 //BA.debugLineNum = 86376449;BA.debugLine="Return Chip.ToString";
if (true) return __ref._chip /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=86376450;
 //BA.debugLineNum = 86376450;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmchip __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
RDebugUtils.currentLine=86179840;
 //BA.debugLineNum = 86179840;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=86179841;
 //BA.debugLineNum = 86179841;BA.debugLine="Public Chip As VMElement";
_chip = new b4j.example.vmelement();
RDebugUtils.currentLine=86179842;
 //BA.debugLineNum = 86179842;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=86179843;
 //BA.debugLineNum = 86179843;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=86179844;
 //BA.debugLineNum = 86179844;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=86179845;
 //BA.debugLineNum = 86179845;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=86179846;
 //BA.debugLineNum = 86179846;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _setondelete(b4j.example.vmchip __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setondelete", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setondelete", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=87556096;
 //BA.debugLineNum = 87556096;BA.debugLine="private Sub SetOnDelete As VMChip";
RDebugUtils.currentLine=87556097;
 //BA.debugLineNum = 87556097;BA.debugLine="Dim methodName As String  = $\"${ID}_delete\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_delete");
RDebugUtils.currentLine=87556098;
 //BA.debugLineNum = 87556098;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
RDebugUtils.currentLine=87556099;
 //BA.debugLineNum = 87556099;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=87556100;
 //BA.debugLineNum = 87556100;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=87556101;
 //BA.debugLineNum = 87556101;BA.debugLine="SetAttr(CreateMap(\"v-on:md-delete\": methodName))";
__ref._setattr /*b4j.example.vmchip*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-delete"),(Object)(_methodname)}));
RDebugUtils.currentLine=87556103;
 //BA.debugLineNum = 87556103;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=87556104;
 //BA.debugLineNum = 87556104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87556105;
 //BA.debugLineNum = 87556105;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmchip __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=86966272;
 //BA.debugLineNum = 86966272;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=86966273;
 //BA.debugLineNum = 86966273;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=86966274;
 //BA.debugLineNum = 86966274;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmchip __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=86638592;
 //BA.debugLineNum = 86638592;BA.debugLine="Sub Render";
RDebugUtils.currentLine=86638593;
 //BA.debugLineNum = 86638593;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=86638594;
 //BA.debugLineNum = 86638594;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchip  _setaccent(b4j.example.vmchip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=86900736;
 //BA.debugLineNum = 86900736;BA.debugLine="Sub SetAccent(b As Boolean) As VMChip";
RDebugUtils.currentLine=86900737;
 //BA.debugLineNum = 86900737;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
RDebugUtils.currentLine=86900738;
 //BA.debugLineNum = 86900738;BA.debugLine="Chip.SetAccent(True)";
__ref._chip /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=86900739;
 //BA.debugLineNum = 86900739;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86900740;
 //BA.debugLineNum = 86900740;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setattr(b4j.example.vmchip __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=87097344;
 //BA.debugLineNum = 87097344;BA.debugLine="Sub SetAttr(attr As Map) As VMChip";
RDebugUtils.currentLine=87097345;
 //BA.debugLineNum = 87097345;BA.debugLine="Chip.SetAttr(attr)";
__ref._chip /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=87097346;
 //BA.debugLineNum = 87097346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87097347;
 //BA.debugLineNum = 87097347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setclickable(b4j.example.vmchip __ref,boolean _varclickable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setclickable", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setclickable", new Object[] {_varclickable}));}
RDebugUtils.currentLine=87359488;
 //BA.debugLineNum = 87359488;BA.debugLine="Sub SetClickable(varClickable As Boolean) As VMChi";
RDebugUtils.currentLine=87359489;
 //BA.debugLineNum = 87359489;BA.debugLine="If varClickable = False Then Return Me";
if (_varclickable==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
RDebugUtils.currentLine=87359490;
 //BA.debugLineNum = 87359490;BA.debugLine="SetAttr(CreateMap(\":md-clickable\": varClickable))";
__ref._setattr /*b4j.example.vmchip*/ (null,__c.createMap(new Object[] {(Object)(":md-clickable"),(Object)(_varclickable)}));
RDebugUtils.currentLine=87359491;
 //BA.debugLineNum = 87359491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87359492;
 //BA.debugLineNum = 87359492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdatasource(b4j.example.vmchip __ref,String _sourcetable,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setdatasource", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setdatasource", new Object[] {_sourcetable,_sourcefield,_displayfield}));}
int _intsel = 0;
String _krow = "";
String _drow = "";
RDebugUtils.currentLine=87752704;
 //BA.debugLineNum = 87752704;BA.debugLine="Sub SetDataSource(sourceTable As String, sourceFie";
RDebugUtils.currentLine=87752705;
 //BA.debugLineNum = 87752705;BA.debugLine="sourceTable = sourceTable.ToLowerCase";
_sourcetable = _sourcetable.toLowerCase();
RDebugUtils.currentLine=87752706;
 //BA.debugLineNum = 87752706;BA.debugLine="sourceField = sourceField.ToLowerCase";
_sourcefield = _sourcefield.toLowerCase();
RDebugUtils.currentLine=87752707;
 //BA.debugLineNum = 87752707;BA.debugLine="displayField = displayField.tolowercase";
_displayfield = _displayfield.toLowerCase();
RDebugUtils.currentLine=87752709;
 //BA.debugLineNum = 87752709;BA.debugLine="Dim intSel As Int = 0";
_intsel = (int) (0);
RDebugUtils.currentLine=87752710;
 //BA.debugLineNum = 87752710;BA.debugLine="If sourceTable <> \"\" Then intSel = BANano.parseIn";
if ((_sourcetable).equals("") == false) { 
_intsel = (int) (__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_intsel))+1);};
RDebugUtils.currentLine=87752711;
 //BA.debugLineNum = 87752711;BA.debugLine="If sourceField <> \"\" Then intSel = BANano.parseIn";
if ((_sourcefield).equals("") == false) { 
_intsel = (int) (__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_intsel))+1);};
RDebugUtils.currentLine=87752712;
 //BA.debugLineNum = 87752712;BA.debugLine="If displayField <> \"\" Then intSel = BANano.parseI";
if ((_displayfield).equals("") == false) { 
_intsel = (int) (__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_intsel))+1);};
RDebugUtils.currentLine=87752714;
 //BA.debugLineNum = 87752714;BA.debugLine="If intSel = 3 Then";
if (_intsel==3) { 
RDebugUtils.currentLine=87752715;
 //BA.debugLineNum = 87752715;BA.debugLine="Dim kRow As String = $\"row.${sourceField}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
RDebugUtils.currentLine=87752716;
 //BA.debugLineNum = 87752716;BA.debugLine="Dim dRow As String = $\"row.${displayField}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
RDebugUtils.currentLine=87752717;
 //BA.debugLineNum = 87752717;BA.debugLine="Chip.clear";
__ref._chip /*b4j.example.vmelement*/ ._clear /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=87752718;
 //BA.debugLineNum = 87752718;BA.debugLine="Chip.SetVFor(\"row\", sourceTable)";
__ref._chip /*b4j.example.vmelement*/ ._setvfor /*b4j.example.vmelement*/ (null,"row",_sourcetable);
RDebugUtils.currentLine=87752719;
 //BA.debugLineNum = 87752719;BA.debugLine="Chip.SetID($\"${kRow}\"$,True)";
__ref._chip /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=87752720;
 //BA.debugLineNum = 87752720;BA.debugLine="Chip.SetKey($\"${kRow}\"$,True)";
__ref._chip /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)((""+__c.SmartStringFormatter("",(Object)(_krow))+"")),__c.True);
RDebugUtils.currentLine=87752721;
 //BA.debugLineNum = 87752721;BA.debugLine="Chip.SetText($\"{{ ${dRow} }}\"$)";
__ref._chip /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
 };
RDebugUtils.currentLine=87752723;
 //BA.debugLineNum = 87752723;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87752724;
 //BA.debugLineNum = 87752724;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdeletable(b4j.example.vmchip __ref,boolean _vardeletable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setdeletable", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setdeletable", new Object[] {_vardeletable}));}
RDebugUtils.currentLine=87425024;
 //BA.debugLineNum = 87425024;BA.debugLine="Sub SetDeletable(varDeletable As Boolean) As VMChi";
RDebugUtils.currentLine=87425025;
 //BA.debugLineNum = 87425025;BA.debugLine="If varDeletable = False Then Return Me";
if (_vardeletable==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
RDebugUtils.currentLine=87425026;
 //BA.debugLineNum = 87425026;BA.debugLine="SetAttr(CreateMap(\":md-deletable\": varDeletable))";
__ref._setattr /*b4j.example.vmchip*/ (null,__c.createMap(new Object[] {(Object)(":md-deletable"),(Object)(_vardeletable)}));
RDebugUtils.currentLine=87425027;
 //BA.debugLineNum = 87425027;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87425028;
 //BA.debugLineNum = 87425028;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setdisabled(b4j.example.vmchip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=87490560;
 //BA.debugLineNum = 87490560;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChip";
RDebugUtils.currentLine=87490561;
 //BA.debugLineNum = 87490561;BA.debugLine="Chip.SetDisabled(b)";
__ref._chip /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=87490562;
 //BA.debugLineNum = 87490562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87490563;
 //BA.debugLineNum = 87490563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setkey(b4j.example.vmchip __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setkey", new Object[] {_k}));}
RDebugUtils.currentLine=87687168;
 //BA.debugLineNum = 87687168;BA.debugLine="Sub SetKey(k As String) As VMChip";
RDebugUtils.currentLine=87687169;
 //BA.debugLineNum = 87687169;BA.debugLine="Chip.SetKey(k, False)";
__ref._chip /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),__c.False);
RDebugUtils.currentLine=87687170;
 //BA.debugLineNum = 87687170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87687171;
 //BA.debugLineNum = 87687171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setlabel(b4j.example.vmchip __ref,String _labeltext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setlabel", new Object[] {_labeltext}));}
RDebugUtils.currentLine=86310912;
 //BA.debugLineNum = 86310912;BA.debugLine="Sub SetLabel(labelText As String) As VMChip";
RDebugUtils.currentLine=86310913;
 //BA.debugLineNum = 86310913;BA.debugLine="If labelText = \"\" Then Return Me";
if ((_labeltext).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
RDebugUtils.currentLine=86310914;
 //BA.debugLineNum = 86310914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86310915;
 //BA.debugLineNum = 86310915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setoptions(b4j.example.vmchip __ref,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setoptions", new Object[] {_sourcename,_options,_sourcefield,_displayfield}));}
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _krow = "";
String _drow = "";
RDebugUtils.currentLine=87621632;
 //BA.debugLineNum = 87621632;BA.debugLine="Sub SetOptions(sourceName As String, options As Ma";
RDebugUtils.currentLine=87621633;
 //BA.debugLineNum = 87621633;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
RDebugUtils.currentLine=87621634;
 //BA.debugLineNum = 87621634;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=87621635;
 //BA.debugLineNum = 87621635;BA.debugLine="recs.Initialize";
_recs.Initialize();
RDebugUtils.currentLine=87621636;
 //BA.debugLineNum = 87621636;BA.debugLine="For Each k As String In options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _options.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=87621637;
 //BA.debugLineNum = 87621637;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
RDebugUtils.currentLine=87621638;
 //BA.debugLineNum = 87621638;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
RDebugUtils.currentLine=87621639;
 //BA.debugLineNum = 87621639;BA.debugLine="nrec.Put(sourcefield, k)";
_nrec.Put((Object)(_sourcefield),(Object)(_k));
RDebugUtils.currentLine=87621640;
 //BA.debugLineNum = 87621640;BA.debugLine="nrec.Put(displayfield, v)";
_nrec.Put((Object)(_displayfield),(Object)(_v));
RDebugUtils.currentLine=87621641;
 //BA.debugLineNum = 87621641;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
RDebugUtils.currentLine=87621644;
 //BA.debugLineNum = 87621644;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_sourcename,(Object)(_recs.getObject()));
RDebugUtils.currentLine=87621645;
 //BA.debugLineNum = 87621645;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
RDebugUtils.currentLine=87621646;
 //BA.debugLineNum = 87621646;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
RDebugUtils.currentLine=87621647;
 //BA.debugLineNum = 87621647;BA.debugLine="Chip.clear";
__ref._chip /*b4j.example.vmelement*/ ._clear /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=87621648;
 //BA.debugLineNum = 87621648;BA.debugLine="Chip.SetVFor(\"row\", sourceName)";
__ref._chip /*b4j.example.vmelement*/ ._setvfor /*b4j.example.vmelement*/ (null,"row",_sourcename);
RDebugUtils.currentLine=87621649;
 //BA.debugLineNum = 87621649;BA.debugLine="Chip.SetID($\"${kRow}\"$,True)";
__ref._chip /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=87621650;
 //BA.debugLineNum = 87621650;BA.debugLine="Chip.SetKey($\"${kRow}\"$,True)";
__ref._chip /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)((""+__c.SmartStringFormatter("",(Object)(_krow))+"")),__c.True);
RDebugUtils.currentLine=87621651;
 //BA.debugLineNum = 87621651;BA.debugLine="Chip.SetText($\"{{ ${dRow} }}\"$)";
__ref._chip /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
RDebugUtils.currentLine=87621652;
 //BA.debugLineNum = 87621652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87621653;
 //BA.debugLineNum = 87621653;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setpadding(b4j.example.vmchip __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=87293952;
 //BA.debugLineNum = 87293952;BA.debugLine="Sub SetPadding(p As Object) As VMChip";
RDebugUtils.currentLine=87293953;
 //BA.debugLineNum = 87293953;BA.debugLine="Chip.SetPaddingAll(p)";
__ref._chip /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=87293954;
 //BA.debugLineNum = 87293954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87293955;
 //BA.debugLineNum = 87293955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setprimary(b4j.example.vmchip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=86835200;
 //BA.debugLineNum = 86835200;BA.debugLine="Sub SetPrimary(b As Boolean) As VMChip";
RDebugUtils.currentLine=86835201;
 //BA.debugLineNum = 86835201;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmchip)(this);};
RDebugUtils.currentLine=86835202;
 //BA.debugLineNum = 86835202;BA.debugLine="Chip.SetPrimary(True)";
__ref._chip /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=86835203;
 //BA.debugLineNum = 86835203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86835204;
 //BA.debugLineNum = 86835204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setstyle(b4j.example.vmchip __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=87162880;
 //BA.debugLineNum = 87162880;BA.debugLine="Sub SetStyle(sm As Map) As VMChip";
RDebugUtils.currentLine=87162881;
 //BA.debugLineNum = 87162881;BA.debugLine="Chip.SetStyle(sm)";
__ref._chip /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=87162882;
 //BA.debugLineNum = 87162882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=87162883;
 //BA.debugLineNum = 87162883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _settext(b4j.example.vmchip __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=86769664;
 //BA.debugLineNum = 86769664;BA.debugLine="Sub SetText(t As String) As VMChip";
RDebugUtils.currentLine=86769665;
 //BA.debugLineNum = 86769665;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmchip)(this);};
RDebugUtils.currentLine=86769666;
 //BA.debugLineNum = 86769666;BA.debugLine="Chip.SetText(t)";
__ref._chip /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=86769667;
 //BA.debugLineNum = 86769667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86769668;
 //BA.debugLineNum = 86769668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvif(b4j.example.vmchip __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=86507520;
 //BA.debugLineNum = 86507520;BA.debugLine="Sub SetVIf(vif As Object) As VMChip";
RDebugUtils.currentLine=86507521;
 //BA.debugLineNum = 86507521;BA.debugLine="Chip.SetVIf(vif)";
__ref._chip /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=86507522;
 //BA.debugLineNum = 86507522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86507523;
 //BA.debugLineNum = 86507523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvmodel(b4j.example.vmchip __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=86441984;
 //BA.debugLineNum = 86441984;BA.debugLine="Sub SetVModel(k As String) As VMChip";
RDebugUtils.currentLine=86441985;
 //BA.debugLineNum = 86441985;BA.debugLine="Chip.SetVModel(k)";
__ref._chip /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=86441986;
 //BA.debugLineNum = 86441986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86441987;
 //BA.debugLineNum = 86441987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _setvshow(b4j.example.vmchip __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchip";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=86573056;
 //BA.debugLineNum = 86573056;BA.debugLine="Sub SetVShow(vif As Object) As VMChip";
RDebugUtils.currentLine=86573057;
 //BA.debugLineNum = 86573057;BA.debugLine="Chip.SetVShow(vif)";
__ref._chip /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=86573058;
 //BA.debugLineNum = 86573058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchip)(this);
RDebugUtils.currentLine=86573059;
 //BA.debugLineNum = 86573059;BA.debugLine="End Sub";
return null;
}
}