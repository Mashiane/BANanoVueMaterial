package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmchips extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmchips", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmchips.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _chips = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public b4j.example.vmelement _et = null;
public b4j.example.vmelement _lbl = null;
public boolean _haslabel = false;
public boolean _haserror = false;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmchips  _initialize(b4j.example.vmchips __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
String _ctext = "";
int _chint = 0;
String _sval = "";
RDebugUtils.currentLine=87949312;
 //BA.debugLineNum = 87949312;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=87949313;
 //BA.debugLineNum = 87949313;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=87949314;
 //BA.debugLineNum = 87949314;BA.debugLine="Chips.Initialize(v, ID)";
__ref._chips /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=87949315;
 //BA.debugLineNum = 87949315;BA.debugLine="Chips.SetTag(\"md-chips\")";
__ref._chips /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-chips");
RDebugUtils.currentLine=87949316;
 //BA.debugLineNum = 87949316;BA.debugLine="lbl.Initialize(v,\"\").SetTag(\"label\")";
__ref._lbl /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,"")._settag /*b4j.example.vmelement*/ (null,"label");
RDebugUtils.currentLine=87949317;
 //BA.debugLineNum = 87949317;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=87949318;
 //BA.debugLineNum = 87949318;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=87949319;
 //BA.debugLineNum = 87949319;BA.debugLine="hasHelp = False";
__ref._hashelp /*boolean*/  = __c.False;
RDebugUtils.currentLine=87949320;
 //BA.debugLineNum = 87949320;BA.debugLine="hasLabel = False";
__ref._haslabel /*boolean*/  = __c.False;
RDebugUtils.currentLine=87949321;
 //BA.debugLineNum = 87949321;BA.debugLine="hasHelp = False";
__ref._hashelp /*boolean*/  = __c.False;
RDebugUtils.currentLine=87949322;
 //BA.debugLineNum = 87949322;BA.debugLine="hasError = False";
__ref._haserror /*boolean*/  = __c.False;
RDebugUtils.currentLine=87949323;
 //BA.debugLineNum = 87949323;BA.debugLine="Dim cText As String, chInt As Int  'ignore";
_ctext = "";
_chint = 0;
RDebugUtils.currentLine=87949324;
 //BA.debugLineNum = 87949324;BA.debugLine="SetOnDelete(cText, chInt)";
__ref._setondelete /*b4j.example.vmchips*/ (null,_ctext,_chint);
RDebugUtils.currentLine=87949325;
 //BA.debugLineNum = 87949325;BA.debugLine="SetOnClick(cText, chInt)";
__ref._setonclick /*b4j.example.vmchips*/ (null,_ctext,_chint);
RDebugUtils.currentLine=87949326;
 //BA.debugLineNum = 87949326;BA.debugLine="Dim sval As String";
_sval = "";
RDebugUtils.currentLine=87949327;
 //BA.debugLineNum = 87949327;BA.debugLine="SetOnInsert(sval)";
__ref._setoninsert /*b4j.example.vmchips*/ (null,_sval);
RDebugUtils.currentLine=87949328;
 //BA.debugLineNum = 87949328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=87949329;
 //BA.debugLineNum = 87949329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _addchild(b4j.example.vmchips __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=88735744;
 //BA.debugLineNum = 88735744;BA.debugLine="Sub AddChild(child As VMElement) As VMChips";
RDebugUtils.currentLine=88735745;
 //BA.debugLineNum = 88735745;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=88735746;
 //BA.debugLineNum = 88735746;BA.debugLine="Chips.SetText(childHTML)";
__ref._chips /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=88735747;
 //BA.debugLineNum = 88735747;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88735748;
 //BA.debugLineNum = 88735748;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmchips __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=89194496;
 //BA.debugLineNum = 89194496;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=89194497;
 //BA.debugLineNum = 89194497;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=89194498;
 //BA.debugLineNum = 89194498;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmchips*/ (null,_childx);
 }
};
RDebugUtils.currentLine=89194500;
 //BA.debugLineNum = 89194500;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchips  _addclass(b4j.example.vmchips __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=88997888;
 //BA.debugLineNum = 88997888;BA.debugLine="Sub AddClass(c As String) As VMChips";
RDebugUtils.currentLine=88997889;
 //BA.debugLineNum = 88997889;BA.debugLine="Chips.AddClass(c)";
__ref._chips /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=88997890;
 //BA.debugLineNum = 88997890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88997891;
 //BA.debugLineNum = 88997891;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmchips __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=90439680;
 //BA.debugLineNum = 90439680;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=90439681;
 //BA.debugLineNum = 90439681;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=90439682;
 //BA.debugLineNum = 90439682;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=88276992;
 //BA.debugLineNum = 88276992;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=88276993;
 //BA.debugLineNum = 88276993;BA.debugLine="If hasLabel Then";
if (__ref._haslabel /*boolean*/ ) { 
RDebugUtils.currentLine=88276994;
 //BA.debugLineNum = 88276994;BA.debugLine="lbl.pop(Chips)";
__ref._lbl /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._chips /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=88276996;
 //BA.debugLineNum = 88276996;BA.debugLine="If hasHelp Then";
if (__ref._hashelp /*boolean*/ ) { 
RDebugUtils.currentLine=88276997;
 //BA.debugLineNum = 88276997;BA.debugLine="ht.Pop(Chips)";
__ref._ht /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._chips /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=88276999;
 //BA.debugLineNum = 88276999;BA.debugLine="If hasError Then";
if (__ref._haserror /*boolean*/ ) { 
RDebugUtils.currentLine=88277000;
 //BA.debugLineNum = 88277000;BA.debugLine="et.Pop(Chips)";
__ref._et /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._chips /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=88277002;
 //BA.debugLineNum = 88277002;BA.debugLine="Return Chips.ToString";
if (true) return __ref._chips /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=88277003;
 //BA.debugLineNum = 88277003;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
RDebugUtils.currentLine=87883776;
 //BA.debugLineNum = 87883776;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=87883777;
 //BA.debugLineNum = 87883777;BA.debugLine="Public Chips As VMElement";
_chips = new b4j.example.vmelement();
RDebugUtils.currentLine=87883778;
 //BA.debugLineNum = 87883778;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=87883779;
 //BA.debugLineNum = 87883779;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=87883780;
 //BA.debugLineNum = 87883780;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=87883781;
 //BA.debugLineNum = 87883781;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
RDebugUtils.currentLine=87883782;
 //BA.debugLineNum = 87883782;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
RDebugUtils.currentLine=87883783;
 //BA.debugLineNum = 87883783;BA.debugLine="Private et As VMElement";
_et = new b4j.example.vmelement();
RDebugUtils.currentLine=87883784;
 //BA.debugLineNum = 87883784;BA.debugLine="Private lbl As VMElement";
_lbl = new b4j.example.vmelement();
RDebugUtils.currentLine=87883785;
 //BA.debugLineNum = 87883785;BA.debugLine="Private hasLabel As Boolean";
_haslabel = false;
RDebugUtils.currentLine=87883786;
 //BA.debugLineNum = 87883786;BA.debugLine="Private hasError As Boolean";
_haserror = false;
RDebugUtils.currentLine=87883787;
 //BA.debugLineNum = 87883787;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=87883788;
 //BA.debugLineNum = 87883788;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchips  _setondelete(b4j.example.vmchips __ref,String _text,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setondelete", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setondelete", new Object[] {_text,_index}));}
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=90243072;
 //BA.debugLineNum = 90243072;BA.debugLine="private Sub SetOnDelete(text As String, index As I";
RDebugUtils.currentLine=90243073;
 //BA.debugLineNum = 90243073;BA.debugLine="Dim methodName As String = $\"${ID}_delete\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_delete");
RDebugUtils.currentLine=90243074;
 //BA.debugLineNum = 90243074;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=90243075;
 //BA.debugLineNum = 90243075;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_text),(Object)(_index)}))));
RDebugUtils.currentLine=90243076;
 //BA.debugLineNum = 90243076;BA.debugLine="SetAttr(CreateMap(\"v-on:md-delete\": methodName))";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-delete"),(Object)(_methodname)}));
RDebugUtils.currentLine=90243078;
 //BA.debugLineNum = 90243078;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=90243079;
 //BA.debugLineNum = 90243079;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=90243080;
 //BA.debugLineNum = 90243080;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setonclick(b4j.example.vmchips __ref,String _text,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setonclick", new Object[] {_text,_index}));}
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=90308608;
 //BA.debugLineNum = 90308608;BA.debugLine="private Sub SetOnClick(text As String, index As In";
RDebugUtils.currentLine=90308609;
 //BA.debugLineNum = 90308609;BA.debugLine="Dim methodName As String  = $\"${ID}_click\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click");
RDebugUtils.currentLine=90308610;
 //BA.debugLineNum = 90308610;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=90308611;
 //BA.debugLineNum = 90308611;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_text),(Object)(_index)}))));
RDebugUtils.currentLine=90308612;
 //BA.debugLineNum = 90308612;BA.debugLine="SetAttr(CreateMap(\"v-on:md-click\": methodName))";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-click"),(Object)(_methodname)}));
RDebugUtils.currentLine=90308614;
 //BA.debugLineNum = 90308614;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=90308615;
 //BA.debugLineNum = 90308615;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=90308616;
 //BA.debugLineNum = 90308616;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setoninsert(b4j.example.vmchips __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setoninsert", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setoninsert", new Object[] {_value}));}
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=90374144;
 //BA.debugLineNum = 90374144;BA.debugLine="private Sub SetOnInsert(value As String) As VMChip";
RDebugUtils.currentLine=90374145;
 //BA.debugLineNum = 90374145;BA.debugLine="Dim methodName As String = $\"${ID}_insert\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_insert");
RDebugUtils.currentLine=90374146;
 //BA.debugLineNum = 90374146;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=90374147;
 //BA.debugLineNum = 90374147;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value)}))));
RDebugUtils.currentLine=90374148;
 //BA.debugLineNum = 90374148;BA.debugLine="SetAttr(CreateMap(\"v-on:md-insert\": methodName))";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-insert"),(Object)(_methodname)}));
RDebugUtils.currentLine=90374150;
 //BA.debugLineNum = 90374150;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=90374151;
 //BA.debugLineNum = 90374151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=90374152;
 //BA.debugLineNum = 90374152;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmchips __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=88932352;
 //BA.debugLineNum = 88932352;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=88932353;
 //BA.debugLineNum = 88932353;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=88932354;
 //BA.debugLineNum = 88932354;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=88670208;
 //BA.debugLineNum = 88670208;BA.debugLine="Sub Render";
RDebugUtils.currentLine=88670209;
 //BA.debugLineNum = 88670209;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=88670210;
 //BA.debugLineNum = 88670210;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchips  _setaccent(b4j.example.vmchips __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=88866816;
 //BA.debugLineNum = 88866816;BA.debugLine="Sub SetAccent(b As Boolean) As VMChips";
RDebugUtils.currentLine=88866817;
 //BA.debugLineNum = 88866817;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88866818;
 //BA.debugLineNum = 88866818;BA.debugLine="Chips.SetAccent(True)";
__ref._chips /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=88866819;
 //BA.debugLineNum = 88866819;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88866820;
 //BA.debugLineNum = 88866820;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setattr(b4j.example.vmchips __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=89063424;
 //BA.debugLineNum = 89063424;BA.debugLine="Sub SetAttr(attr As Map) As VMChips";
RDebugUtils.currentLine=89063425;
 //BA.debugLineNum = 89063425;BA.debugLine="Chips.SetAttr(attr)";
__ref._chips /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=89063426;
 //BA.debugLineNum = 89063426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89063427;
 //BA.debugLineNum = 89063427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setcheckduplicated(b4j.example.vmchips __ref,boolean _varcheckduplicated) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setcheckduplicated", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setcheckduplicated", new Object[] {_varcheckduplicated}));}
RDebugUtils.currentLine=90046464;
 //BA.debugLineNum = 90046464;BA.debugLine="Sub SetCheckDuplicated(varCheckDuplicated As Boole";
RDebugUtils.currentLine=90046465;
 //BA.debugLineNum = 90046465;BA.debugLine="If varCheckDuplicated = False Then Return Me";
if (_varcheckduplicated==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=90046466;
 //BA.debugLineNum = 90046466;BA.debugLine="SetAttr(CreateMap(\":md-check-duplicated\": varChec";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)(":md-check-duplicated"),(Object)(_varcheckduplicated)}));
RDebugUtils.currentLine=90046467;
 //BA.debugLineNum = 90046467;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=90046468;
 //BA.debugLineNum = 90046468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setdisabled(b4j.example.vmchips __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=90177536;
 //BA.debugLineNum = 90177536;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChips";
RDebugUtils.currentLine=90177537;
 //BA.debugLineNum = 90177537;BA.debugLine="Chips.SetDisabled(b)";
__ref._chips /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=90177538;
 //BA.debugLineNum = 90177538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=90177539;
 //BA.debugLineNum = 90177539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setemail(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setemail", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setemail", null));}
RDebugUtils.currentLine=89587712;
 //BA.debugLineNum = 89587712;BA.debugLine="Sub SetEmail As VMChips";
RDebugUtils.currentLine=89587713;
 //BA.debugLineNum = 89587713;BA.debugLine="SetInputType(\"email\")";
__ref._setinputtype /*b4j.example.vmchips*/ (null,"email");
RDebugUtils.currentLine=89587714;
 //BA.debugLineNum = 89587714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89587715;
 //BA.debugLineNum = 89587715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setinputtype(b4j.example.vmchips __ref,String _varinputtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setinputtype", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setinputtype", new Object[] {_varinputtype}));}
RDebugUtils.currentLine=89325568;
 //BA.debugLineNum = 89325568;BA.debugLine="Sub SetInputType(varInputType As String) As VMChip";
RDebugUtils.currentLine=89325569;
 //BA.debugLineNum = 89325569;BA.debugLine="If varInputType = \"\" Then Return Me";
if ((_varinputtype).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=89325570;
 //BA.debugLineNum = 89325570;BA.debugLine="SetAttr(CreateMap(\"md-input-type\": varInputType))";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)("md-input-type"),(Object)(_varinputtype)}));
RDebugUtils.currentLine=89325571;
 //BA.debugLineNum = 89325571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89325572;
 //BA.debugLineNum = 89325572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _seterrortext(b4j.example.vmchips __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "seterrortext", new Object[] {_txt}));}
RDebugUtils.currentLine=88080384;
 //BA.debugLineNum = 88080384;BA.debugLine="Sub SetErrorText(txt As String) As VMChips";
RDebugUtils.currentLine=88080385;
 //BA.debugLineNum = 88080385;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88080386;
 //BA.debugLineNum = 88080386;BA.debugLine="hasError = True";
__ref._haserror /*boolean*/  = __c.True;
RDebugUtils.currentLine=88080387;
 //BA.debugLineNum = 88080387;BA.debugLine="et = Chips.SetErrorText(txt)";
__ref._et /*b4j.example.vmelement*/  = __ref._chips /*b4j.example.vmelement*/ ._seterrortext /*b4j.example.vmelement*/ (null,_txt);
RDebugUtils.currentLine=88080388;
 //BA.debugLineNum = 88080388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88080389;
 //BA.debugLineNum = 88080389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setformat(b4j.example.vmchips __ref,String _varformat,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setformat", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setformat", new Object[] {_varformat,_methodname}));}
String _value = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=90112000;
 //BA.debugLineNum = 90112000;BA.debugLine="Sub SetFormat(varFormat As String, methodName As S";
RDebugUtils.currentLine=90112001;
 //BA.debugLineNum = 90112001;BA.debugLine="If varFormat = \"\" Then Return Me";
if ((_varformat).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=90112002;
 //BA.debugLineNum = 90112002;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=90112003;
 //BA.debugLineNum = 90112003;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=90112004;
 //BA.debugLineNum = 90112004;BA.debugLine="SetAttr(CreateMap(\":md-format\": varFormat))";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)(":md-format"),(Object)(_varformat)}));
RDebugUtils.currentLine=90112005;
 //BA.debugLineNum = 90112005;BA.debugLine="Dim value As String";
_value = "";
RDebugUtils.currentLine=90112006;
 //BA.debugLineNum = 90112006;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value)}))));
RDebugUtils.currentLine=90112007;
 //BA.debugLineNum = 90112007;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=90112008;
 //BA.debugLineNum = 90112008;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=90112009;
 //BA.debugLineNum = 90112009;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _sethelpertext(b4j.example.vmchips __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "sethelpertext", new Object[] {_t}));}
RDebugUtils.currentLine=88014848;
 //BA.debugLineNum = 88014848;BA.debugLine="Sub SetHelperText(t As String) As VMChips";
RDebugUtils.currentLine=88014849;
 //BA.debugLineNum = 88014849;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88014850;
 //BA.debugLineNum = 88014850;BA.debugLine="hasHelp = True";
__ref._hashelp /*boolean*/  = __c.True;
RDebugUtils.currentLine=88014851;
 //BA.debugLineNum = 88014851;BA.debugLine="ht = Chips.SetHelperText(t)";
__ref._ht /*b4j.example.vmelement*/  = __ref._chips /*b4j.example.vmelement*/ ._sethelpertext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=88014852;
 //BA.debugLineNum = 88014852;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88014853;
 //BA.debugLineNum = 88014853;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setlabel(b4j.example.vmchips __ref,String _labeltext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setlabel", new Object[] {_labeltext}));}
RDebugUtils.currentLine=88473600;
 //BA.debugLineNum = 88473600;BA.debugLine="Sub SetLabel(labelText As String) As VMChips";
RDebugUtils.currentLine=88473601;
 //BA.debugLineNum = 88473601;BA.debugLine="If labelText = \"\" Then Return Me";
if ((_labeltext).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88473602;
 //BA.debugLineNum = 88473602;BA.debugLine="lbl.SetText(labelText)";
__ref._lbl /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_labeltext);
RDebugUtils.currentLine=88473603;
 //BA.debugLineNum = 88473603;BA.debugLine="hasLabel = True";
__ref._haslabel /*boolean*/  = __c.True;
RDebugUtils.currentLine=88473604;
 //BA.debugLineNum = 88473604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88473605;
 //BA.debugLineNum = 88473605;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setlimit(b4j.example.vmchips __ref,String _varlimit) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setlimit", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setlimit", new Object[] {_varlimit}));}
RDebugUtils.currentLine=89980928;
 //BA.debugLineNum = 89980928;BA.debugLine="Sub SetLimit(varLimit As String) As VMChips";
RDebugUtils.currentLine=89980929;
 //BA.debugLineNum = 89980929;BA.debugLine="If varLimit = \"\" Then Return Me";
if ((_varlimit).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=89980930;
 //BA.debugLineNum = 89980930;BA.debugLine="SetAttr(CreateMap(\":md-limit\": varLimit))";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)(":md-limit"),(Object)(_varlimit)}));
RDebugUtils.currentLine=89980931;
 //BA.debugLineNum = 89980931;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89980932;
 //BA.debugLineNum = 89980932;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setnumber(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setnumber", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setnumber", null));}
RDebugUtils.currentLine=89718784;
 //BA.debugLineNum = 89718784;BA.debugLine="Sub SetNumber As VMChips";
RDebugUtils.currentLine=89718785;
 //BA.debugLineNum = 89718785;BA.debugLine="SetInputType(\"number\")";
__ref._setinputtype /*b4j.example.vmchips*/ (null,"number");
RDebugUtils.currentLine=89718786;
 //BA.debugLineNum = 89718786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89718787;
 //BA.debugLineNum = 89718787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setoptions(b4j.example.vmchips __ref,String _vmodel,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setoptions", new Object[] {_vmodel,_options}));}
RDebugUtils.currentLine=88342528;
 //BA.debugLineNum = 88342528;BA.debugLine="Sub SetOptions(vModel As String, options As List)";
RDebugUtils.currentLine=88342529;
 //BA.debugLineNum = 88342529;BA.debugLine="SetVModel(vModel)";
__ref._setvmodel /*b4j.example.vmchips*/ (null,_vmodel);
RDebugUtils.currentLine=88342530;
 //BA.debugLineNum = 88342530;BA.debugLine="vue.SetStateSingle(vModel, options)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_options.getObject()));
RDebugUtils.currentLine=88342531;
 //BA.debugLineNum = 88342531;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88342532;
 //BA.debugLineNum = 88342532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setvmodel(b4j.example.vmchips __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=88408064;
 //BA.debugLineNum = 88408064;BA.debugLine="Sub SetVModel(k As String) As VMChips";
RDebugUtils.currentLine=88408065;
 //BA.debugLineNum = 88408065;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88408066;
 //BA.debugLineNum = 88408066;BA.debugLine="Chips.SetVModel(k)";
__ref._chips /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=88408067;
 //BA.debugLineNum = 88408067;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88408068;
 //BA.debugLineNum = 88408068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setpadding(b4j.example.vmchips __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=89260032;
 //BA.debugLineNum = 89260032;BA.debugLine="Sub SetPadding(p As String) As VMChips";
RDebugUtils.currentLine=89260033;
 //BA.debugLineNum = 89260033;BA.debugLine="If p = \"\" Then Return Me";
if ((_p).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=89260034;
 //BA.debugLineNum = 89260034;BA.debugLine="Chips.SetPaddingAll(p)";
__ref._chips /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,(Object)(_p));
RDebugUtils.currentLine=89260035;
 //BA.debugLineNum = 89260035;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89260036;
 //BA.debugLineNum = 89260036;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setpassword(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setpassword", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setpassword", null));}
RDebugUtils.currentLine=89456640;
 //BA.debugLineNum = 89456640;BA.debugLine="Sub SetPassword As VMChips";
RDebugUtils.currentLine=89456641;
 //BA.debugLineNum = 89456641;BA.debugLine="SetInputType(\"password\")";
__ref._setinputtype /*b4j.example.vmchips*/ (null,"password");
RDebugUtils.currentLine=89456642;
 //BA.debugLineNum = 89456642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89456643;
 //BA.debugLineNum = 89456643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setplaceholder(b4j.example.vmchips __ref,String _varplaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setplaceholder", new Object[] {_varplaceholder}));}
RDebugUtils.currentLine=89849856;
 //BA.debugLineNum = 89849856;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
RDebugUtils.currentLine=89849857;
 //BA.debugLineNum = 89849857;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=89849858;
 //BA.debugLineNum = 89849858;BA.debugLine="SetAttr(CreateMap(\"md-placeholder\": varPlaceholde";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)("md-placeholder"),(Object)(_varplaceholder)}));
RDebugUtils.currentLine=89849859;
 //BA.debugLineNum = 89849859;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89849860;
 //BA.debugLineNum = 89849860;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setprimary(b4j.example.vmchips __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=88801280;
 //BA.debugLineNum = 88801280;BA.debugLine="Sub SetPrimary(b As Boolean) As VMChips";
RDebugUtils.currentLine=88801281;
 //BA.debugLineNum = 88801281;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88801282;
 //BA.debugLineNum = 88801282;BA.debugLine="Chips.SetPrimary(True)";
__ref._chips /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=88801283;
 //BA.debugLineNum = 88801283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88801284;
 //BA.debugLineNum = 88801284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setrequired(b4j.example.vmchips __ref,boolean _varrequired) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setrequired", new Object[] {_varrequired}));}
RDebugUtils.currentLine=88211456;
 //BA.debugLineNum = 88211456;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMChips";
RDebugUtils.currentLine=88211457;
 //BA.debugLineNum = 88211457;BA.debugLine="Chips.SetRequired(varRequired)";
__ref._chips /*b4j.example.vmelement*/ ._setrequired /*b4j.example.vmelement*/ (null,_varrequired);
RDebugUtils.currentLine=88211458;
 //BA.debugLineNum = 88211458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88211459;
 //BA.debugLineNum = 88211459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setsearch(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setsearch", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setsearch", null));}
RDebugUtils.currentLine=89522176;
 //BA.debugLineNum = 89522176;BA.debugLine="Sub SetSearch As VMChips";
RDebugUtils.currentLine=89522177;
 //BA.debugLineNum = 89522177;BA.debugLine="SetInputType(\"search\")";
__ref._setinputtype /*b4j.example.vmchips*/ (null,"search");
RDebugUtils.currentLine=89522178;
 //BA.debugLineNum = 89522178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89522179;
 //BA.debugLineNum = 89522179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setstatic(b4j.example.vmchips __ref,boolean _varstatic) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setstatic", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setstatic", new Object[] {_varstatic}));}
RDebugUtils.currentLine=89915392;
 //BA.debugLineNum = 89915392;BA.debugLine="Sub SetStatic(varStatic As Boolean) As VMChips";
RDebugUtils.currentLine=89915393;
 //BA.debugLineNum = 89915393;BA.debugLine="If varStatic = False Then Return Me";
if (_varstatic==__c.False) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=89915394;
 //BA.debugLineNum = 89915394;BA.debugLine="SetAttr(CreateMap(\":md-static\": varStatic))";
__ref._setattr /*b4j.example.vmchips*/ (null,__c.createMap(new Object[] {(Object)(":md-static"),(Object)(_varstatic)}));
RDebugUtils.currentLine=89915395;
 //BA.debugLineNum = 89915395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89915396;
 //BA.debugLineNum = 89915396;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setstyle(b4j.example.vmchips __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=89128960;
 //BA.debugLineNum = 89128960;BA.debugLine="Sub SetStyle(sm As Map) As VMChips";
RDebugUtils.currentLine=89128961;
 //BA.debugLineNum = 89128961;BA.debugLine="Chips.SetStyle(sm)";
__ref._chips /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=89128962;
 //BA.debugLineNum = 89128962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89128963;
 //BA.debugLineNum = 89128963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _settabindex(b4j.example.vmchips __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=88145920;
 //BA.debugLineNum = 88145920;BA.debugLine="Sub SetTabIndex(ti As String) As VMChips";
RDebugUtils.currentLine=88145921;
 //BA.debugLineNum = 88145921;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88145922;
 //BA.debugLineNum = 88145922;BA.debugLine="Chips.SetTabIndex(ti)";
__ref._chips /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=88145923;
 //BA.debugLineNum = 88145923;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88145924;
 //BA.debugLineNum = 88145924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _settel(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "settel", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "settel", null));}
RDebugUtils.currentLine=89653248;
 //BA.debugLineNum = 89653248;BA.debugLine="Sub SetTel As VMChips";
RDebugUtils.currentLine=89653249;
 //BA.debugLineNum = 89653249;BA.debugLine="SetInputType(\"tel\")";
__ref._setinputtype /*b4j.example.vmchips*/ (null,"tel");
RDebugUtils.currentLine=89653250;
 //BA.debugLineNum = 89653250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89653251;
 //BA.debugLineNum = 89653251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _settext(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "settext", null));}
RDebugUtils.currentLine=89391104;
 //BA.debugLineNum = 89391104;BA.debugLine="Sub SetText As VMChips";
RDebugUtils.currentLine=89391105;
 //BA.debugLineNum = 89391105;BA.debugLine="SetInputType(\"text\")";
__ref._setinputtype /*b4j.example.vmchips*/ (null,"text");
RDebugUtils.currentLine=89391106;
 //BA.debugLineNum = 89391106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89391107;
 //BA.debugLineNum = 89391107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _seturl(b4j.example.vmchips __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "seturl", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "seturl", null));}
RDebugUtils.currentLine=89784320;
 //BA.debugLineNum = 89784320;BA.debugLine="Sub SetURL As VMChips";
RDebugUtils.currentLine=89784321;
 //BA.debugLineNum = 89784321;BA.debugLine="SetInputType(\"url\")";
__ref._setinputtype /*b4j.example.vmchips*/ (null,"url");
RDebugUtils.currentLine=89784322;
 //BA.debugLineNum = 89784322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=89784323;
 //BA.debugLineNum = 89784323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setvif(b4j.example.vmchips __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=88539136;
 //BA.debugLineNum = 88539136;BA.debugLine="Sub SetVIf(vif As String) As VMChips";
RDebugUtils.currentLine=88539137;
 //BA.debugLineNum = 88539137;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88539138;
 //BA.debugLineNum = 88539138;BA.debugLine="Chips.SetVIf(vif)";
__ref._chips /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=88539139;
 //BA.debugLineNum = 88539139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88539140;
 //BA.debugLineNum = 88539140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _setvshow(b4j.example.vmchips __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchips";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=88604672;
 //BA.debugLineNum = 88604672;BA.debugLine="Sub SetVShow(vif As String) As VMChips";
RDebugUtils.currentLine=88604673;
 //BA.debugLineNum = 88604673;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmchips)(this);};
RDebugUtils.currentLine=88604674;
 //BA.debugLineNum = 88604674;BA.debugLine="Chips.SetVShow(vif)";
__ref._chips /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=88604675;
 //BA.debugLineNum = 88604675;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchips)(this);
RDebugUtils.currentLine=88604676;
 //BA.debugLineNum = 88604676;BA.debugLine="End Sub";
return null;
}
}