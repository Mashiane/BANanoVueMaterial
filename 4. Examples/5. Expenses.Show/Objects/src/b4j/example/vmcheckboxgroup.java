package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcheckboxgroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcheckboxgroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcheckboxgroup.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _checkgroup = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmlabel _lbl = null;
public com.ab.banano.BANano _banano = null;
public String _vmodel = "";
public Object _module = null;
public boolean _designmode = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmcheckboxgroup  _initialize(b4j.example.vmcheckboxgroup __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _caption,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_caption,_eventhandler}));}
RDebugUtils.currentLine=84934656;
 //BA.debugLineNum = 84934656;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=84934657;
 //BA.debugLineNum = 84934657;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=84934658;
 //BA.debugLineNum = 84934658;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=84934659;
 //BA.debugLineNum = 84934659;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=84934660;
 //BA.debugLineNum = 84934660;BA.debugLine="CheckGroup.Initialize(vue, ID).SetTag(\"div\")";
__ref._checkgroup /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=84934661;
 //BA.debugLineNum = 84934661;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$).SetText($\"${";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_sid))+"label"))._settext /*b4j.example.vmlabel*/ (null,(""+__c.SmartStringFormatter("",(Object)(_caption))+"<br/>"))._setcaption /*b4j.example.vmlabel*/ (null,__c.True);
RDebugUtils.currentLine=84934662;
 //BA.debugLineNum = 84934662;BA.debugLine="lbl.Pop(CheckGroup)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._checkgroup /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=84934663;
 //BA.debugLineNum = 84934663;BA.debugLine="designMode = False";
__ref._designmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=84934664;
 //BA.debugLineNum = 84934664;BA.debugLine="vmodel = \"\"";
__ref._vmodel /*String*/  = "";
RDebugUtils.currentLine=84934665;
 //BA.debugLineNum = 84934665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=84934666;
 //BA.debugLineNum = 84934666;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _addchild(b4j.example.vmcheckboxgroup __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=85852160;
 //BA.debugLineNum = 85852160;BA.debugLine="Sub AddChild(child As VMElement) As VMCheckBoxGrou";
RDebugUtils.currentLine=85852161;
 //BA.debugLineNum = 85852161;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=85852162;
 //BA.debugLineNum = 85852162;BA.debugLine="CheckGroup.SetText(childHTML)";
__ref._checkgroup /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=85852163;
 //BA.debugLineNum = 85852163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85852164;
 //BA.debugLineNum = 85852164;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmcheckboxgroup __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=85983232;
 //BA.debugLineNum = 85983232;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=85983233;
 //BA.debugLineNum = 85983233;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=85983234;
 //BA.debugLineNum = 85983234;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmcheckboxgroup*/ (null,_childx);
 }
};
RDebugUtils.currentLine=85983236;
 //BA.debugLineNum = 85983236;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckboxgroup  _addclass(b4j.example.vmcheckboxgroup __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=85196800;
 //BA.debugLineNum = 85196800;BA.debugLine="Sub AddClass(c As String) As VMCheckBoxGroup";
RDebugUtils.currentLine=85196801;
 //BA.debugLineNum = 85196801;BA.debugLine="CheckGroup.AddClass(c)";
__ref._checkgroup /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=85196802;
 //BA.debugLineNum = 85196802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85196803;
 //BA.debugLineNum = 85196803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _additem(b4j.example.vmcheckboxgroup __ref,String _k,String _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "additem", new Object[] {_k,_v}));}
b4j.example.vmcheckbox _el = null;
RDebugUtils.currentLine=85458944;
 //BA.debugLineNum = 85458944;BA.debugLine="Sub AddItem(k As String, v As String) As VMCheckBo";
RDebugUtils.currentLine=85458945;
 //BA.debugLineNum = 85458945;BA.debugLine="If vmodel = \"\" Then";
if ((__ref._vmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=85458946;
 //BA.debugLineNum = 85458946;BA.debugLine="Log($\"VMCheckBoxGroup.AddItem: '${ID}' - the vMo";
__c.Log(("VMCheckBoxGroup.AddItem: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' - the vModel has not been set!"));
 };
RDebugUtils.currentLine=85458948;
 //BA.debugLineNum = 85458948;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
RDebugUtils.currentLine=85458949;
 //BA.debugLineNum = 85458949;BA.debugLine="el.Initialize(vue, k,module)";
_el._initialize /*b4j.example.vmcheckbox*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_k,__ref._module /*Object*/ );
RDebugUtils.currentLine=85458950;
 //BA.debugLineNum = 85458950;BA.debugLine="If designMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=85458951;
 //BA.debugLineNum = 85458951;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmcheckbox*/ (null,__ref._vmodel /*String*/ );
 };
RDebugUtils.currentLine=85458953;
 //BA.debugLineNum = 85458953;BA.debugLine="el.SetText(v)";
_el._settext /*b4j.example.vmcheckbox*/ (null,_v);
RDebugUtils.currentLine=85458954;
 //BA.debugLineNum = 85458954;BA.debugLine="el.SetValue(k)";
_el._setvalue /*b4j.example.vmcheckbox*/ (null,(Object)(_k));
RDebugUtils.currentLine=85458955;
 //BA.debugLineNum = 85458955;BA.debugLine="el.SetPrimary(True)";
_el._setprimary /*b4j.example.vmcheckbox*/ (null,__c.True);
RDebugUtils.currentLine=85458956;
 //BA.debugLineNum = 85458956;BA.debugLine="el.SetOnChange(ID)";
_el._setonchange /*b4j.example.vmcheckbox*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=85458957;
 //BA.debugLineNum = 85458957;BA.debugLine="el.Pop(CheckGroup)";
_el._pop /*String*/ (null,__ref._checkgroup /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=85458958;
 //BA.debugLineNum = 85458958;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85458959;
 //BA.debugLineNum = 85458959;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _additems(b4j.example.vmcheckboxgroup __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "additems", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "additems", new Object[] {_m}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=85393408;
 //BA.debugLineNum = 85393408;BA.debugLine="Sub AddItems(m As Map) As VMCheckBoxGroup";
RDebugUtils.currentLine=85393409;
 //BA.debugLineNum = 85393409;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=85393410;
 //BA.debugLineNum = 85393410;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=85393411;
 //BA.debugLineNum = 85393411;BA.debugLine="AddItem(k, v)";
__ref._additem /*b4j.example.vmcheckboxgroup*/ (null,_k,BA.ObjectToString(_v));
 }
};
RDebugUtils.currentLine=85393413;
 //BA.debugLineNum = 85393413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85393414;
 //BA.debugLineNum = 85393414;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcheckboxgroup __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=86114304;
 //BA.debugLineNum = 86114304;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=86114305;
 //BA.debugLineNum = 86114305;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=86114306;
 //BA.debugLineNum = 86114306;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmcheckboxgroup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=85524480;
 //BA.debugLineNum = 85524480;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=85524481;
 //BA.debugLineNum = 85524481;BA.debugLine="Return CheckGroup.tostring";
if (true) return __ref._checkgroup /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=85524482;
 //BA.debugLineNum = 85524482;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmcheckboxgroup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
RDebugUtils.currentLine=84869120;
 //BA.debugLineNum = 84869120;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=84869121;
 //BA.debugLineNum = 84869121;BA.debugLine="Private CheckGroup As VMElement";
_checkgroup = new b4j.example.vmelement();
RDebugUtils.currentLine=84869122;
 //BA.debugLineNum = 84869122;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=84869123;
 //BA.debugLineNum = 84869123;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=84869124;
 //BA.debugLineNum = 84869124;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=84869125;
 //BA.debugLineNum = 84869125;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=84869126;
 //BA.debugLineNum = 84869126;BA.debugLine="Private vmodel As String";
_vmodel = "";
RDebugUtils.currentLine=84869127;
 //BA.debugLineNum = 84869127;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=84869128;
 //BA.debugLineNum = 84869128;BA.debugLine="Private designMode As Boolean";
_designmode = false;
RDebugUtils.currentLine=84869129;
 //BA.debugLineNum = 84869129;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmcheckboxgroup __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=85655552;
 //BA.debugLineNum = 85655552;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=85655553;
 //BA.debugLineNum = 85655553;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=85655554;
 //BA.debugLineNum = 85655554;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmcheckboxgroup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=85590016;
 //BA.debugLineNum = 85590016;BA.debugLine="Sub Render";
RDebugUtils.currentLine=85590017;
 //BA.debugLineNum = 85590017;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=85590018;
 //BA.debugLineNum = 85590018;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckboxgroup  _setattr(b4j.example.vmcheckboxgroup __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=85262336;
 //BA.debugLineNum = 85262336;BA.debugLine="Sub SetAttr(attr As Map) As VMCheckBoxGroup";
RDebugUtils.currentLine=85262337;
 //BA.debugLineNum = 85262337;BA.debugLine="CheckGroup.SetAttr(attr)";
__ref._checkgroup /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=85262338;
 //BA.debugLineNum = 85262338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85262339;
 //BA.debugLineNum = 85262339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setdesignmode(b4j.example.vmcheckboxgroup __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "setdesignmode", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "setdesignmode", new Object[] {_b}));}
RDebugUtils.currentLine=85000192;
 //BA.debugLineNum = 85000192;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCheckBoxGroup";
RDebugUtils.currentLine=85000193;
 //BA.debugLineNum = 85000193;BA.debugLine="designMode = b";
__ref._designmode /*boolean*/  = _b;
RDebugUtils.currentLine=85000194;
 //BA.debugLineNum = 85000194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85000195;
 //BA.debugLineNum = 85000195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setdisabled(b4j.example.vmcheckboxgroup __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=86048768;
 //BA.debugLineNum = 86048768;BA.debugLine="Sub SetDisabled(b As Boolean) As VMCheckBoxGroup";
RDebugUtils.currentLine=86048769;
 //BA.debugLineNum = 86048769;BA.debugLine="CheckGroup.SetDisabled(b)";
__ref._checkgroup /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=86048770;
 //BA.debugLineNum = 86048770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=86048771;
 //BA.debugLineNum = 86048771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setstyle(b4j.example.vmcheckboxgroup __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=85917696;
 //BA.debugLineNum = 85917696;BA.debugLine="Sub SetStyle(sm As Map) As VMCheckBoxGroup";
RDebugUtils.currentLine=85917697;
 //BA.debugLineNum = 85917697;BA.debugLine="CheckGroup.SetStyle(sm)";
__ref._checkgroup /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=85917698;
 //BA.debugLineNum = 85917698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85917699;
 //BA.debugLineNum = 85917699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _settabindex(b4j.example.vmcheckboxgroup __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=85131264;
 //BA.debugLineNum = 85131264;BA.debugLine="Sub SetTabIndex(ti As String) As VMCheckBoxGroup";
RDebugUtils.currentLine=85131265;
 //BA.debugLineNum = 85131265;BA.debugLine="CheckGroup.SetTabIndex(ti)";
__ref._checkgroup /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=85131266;
 //BA.debugLineNum = 85131266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85131267;
 //BA.debugLineNum = 85131267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setvalue(b4j.example.vmcheckboxgroup __ref,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
RDebugUtils.currentLine=85065728;
 //BA.debugLineNum = 85065728;BA.debugLine="Sub SetValue(v As Object) As VMCheckBoxGroup";
RDebugUtils.currentLine=85065729;
 //BA.debugLineNum = 85065729;BA.debugLine="If vmodel = \"\" Then";
if ((__ref._vmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=85065730;
 //BA.debugLineNum = 85065730;BA.debugLine="Log($\"VMCheckBoxGroup.SetValue: '${ID}' - the vM";
__c.Log(("VMCheckBoxGroup.SetValue: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' - the vModel has not been set!"));
 };
RDebugUtils.currentLine=85065732;
 //BA.debugLineNum = 85065732;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=85065733;
 //BA.debugLineNum = 85065733;BA.debugLine="nl.Initialize";
_nl.Initialize();
RDebugUtils.currentLine=85065734;
 //BA.debugLineNum = 85065734;BA.debugLine="nl.Add(v)";
_nl.Add(_v);
RDebugUtils.currentLine=85065735;
 //BA.debugLineNum = 85065735;BA.debugLine="vue.SetStateSingle(vmodel,nl)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._vmodel /*String*/ ,(Object)(_nl.getObject()));
RDebugUtils.currentLine=85065736;
 //BA.debugLineNum = 85065736;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85065737;
 //BA.debugLineNum = 85065737;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setvif(b4j.example.vmcheckboxgroup __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=85721088;
 //BA.debugLineNum = 85721088;BA.debugLine="Sub SetVIf(vif As String) As VMCheckBoxGroup";
RDebugUtils.currentLine=85721089;
 //BA.debugLineNum = 85721089;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmcheckboxgroup)(this);};
RDebugUtils.currentLine=85721090;
 //BA.debugLineNum = 85721090;BA.debugLine="CheckGroup.SetVIf(vif)";
__ref._checkgroup /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=85721091;
 //BA.debugLineNum = 85721091;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85721092;
 //BA.debugLineNum = 85721092;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setvmodel(b4j.example.vmcheckboxgroup __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
RDebugUtils.currentLine=85327872;
 //BA.debugLineNum = 85327872;BA.debugLine="Sub SetVModel(k As String) As VMCheckBoxGroup";
RDebugUtils.currentLine=85327873;
 //BA.debugLineNum = 85327873;BA.debugLine="vmodel = k.tolowercase";
__ref._vmodel /*String*/  = _k.toLowerCase();
RDebugUtils.currentLine=85327874;
 //BA.debugLineNum = 85327874;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=85327875;
 //BA.debugLineNum = 85327875;BA.debugLine="nl.Initialize";
_nl.Initialize();
RDebugUtils.currentLine=85327876;
 //BA.debugLineNum = 85327876;BA.debugLine="vue.SetStateSingle(vmodel,nl)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._vmodel /*String*/ ,(Object)(_nl.getObject()));
RDebugUtils.currentLine=85327877;
 //BA.debugLineNum = 85327877;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85327878;
 //BA.debugLineNum = 85327878;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _setvshow(b4j.example.vmcheckboxgroup __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckboxgroup";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=85786624;
 //BA.debugLineNum = 85786624;BA.debugLine="Sub SetVShow(vif As String) As VMCheckBoxGroup";
RDebugUtils.currentLine=85786625;
 //BA.debugLineNum = 85786625;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmcheckboxgroup)(this);};
RDebugUtils.currentLine=85786626;
 //BA.debugLineNum = 85786626;BA.debugLine="CheckGroup.SetVShow(vif)";
__ref._checkgroup /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=85786627;
 //BA.debugLineNum = 85786627;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckboxgroup)(this);
RDebugUtils.currentLine=85786628;
 //BA.debugLineNum = 85786628;BA.debugLine="End Sub";
return null;
}
}