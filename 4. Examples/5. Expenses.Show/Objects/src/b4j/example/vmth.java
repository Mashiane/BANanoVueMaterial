package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmth extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmth", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmth.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _th = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmth  _addchild(b4j.example.vmth __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=216137728;
 //BA.debugLineNum = 216137728;BA.debugLine="Sub AddChild(child As VMElement) As VMTH";
RDebugUtils.currentLine=216137729;
 //BA.debugLineNum = 216137729;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=216137730;
 //BA.debugLineNum = 216137730;BA.debugLine="TH.SetText(childHTML)";
__ref._th /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=216137731;
 //BA.debugLineNum = 216137731;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216137732;
 //BA.debugLineNum = 216137732;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmth __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=216662016;
 //BA.debugLineNum = 216662016;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=216662017;
 //BA.debugLineNum = 216662017;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=216662018;
 //BA.debugLineNum = 216662018;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmth*/ (null,_childx);
 }
};
RDebugUtils.currentLine=216662020;
 //BA.debugLineNum = 216662020;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmth  _addclass(b4j.example.vmth __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=216465408;
 //BA.debugLineNum = 216465408;BA.debugLine="Sub AddClass(c As String) As VMTH";
RDebugUtils.currentLine=216465409;
 //BA.debugLineNum = 216465409;BA.debugLine="TH.AddClass(c)";
__ref._th /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=216465410;
 //BA.debugLineNum = 216465410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216465411;
 //BA.debugLineNum = 216465411;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
RDebugUtils.currentLine=215678976;
 //BA.debugLineNum = 215678976;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=215678977;
 //BA.debugLineNum = 215678977;BA.debugLine="Public TH As VMElement";
_th = new b4j.example.vmelement();
RDebugUtils.currentLine=215678978;
 //BA.debugLineNum = 215678978;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=215678979;
 //BA.debugLineNum = 215678979;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=215678980;
 //BA.debugLineNum = 215678980;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=215678981;
 //BA.debugLineNum = 215678981;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmth  _initialize(b4j.example.vmth __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=215744512;
 //BA.debugLineNum = 215744512;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=215744513;
 //BA.debugLineNum = 215744513;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=215744514;
 //BA.debugLineNum = 215744514;BA.debugLine="TH.Initialize(v, ID)";
__ref._th /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=215744515;
 //BA.debugLineNum = 215744515;BA.debugLine="TH.SetTag(\"md-table-head\")";
__ref._th /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-table-head");
RDebugUtils.currentLine=215744516;
 //BA.debugLineNum = 215744516;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=215744517;
 //BA.debugLineNum = 215744517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=215744518;
 //BA.debugLineNum = 215744518;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmth __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=216399872;
 //BA.debugLineNum = 216399872;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=216399873;
 //BA.debugLineNum = 216399873;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=216399874;
 //BA.debugLineNum = 216399874;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=215810048;
 //BA.debugLineNum = 215810048;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=215810049;
 //BA.debugLineNum = 215810049;BA.debugLine="Return TH.ToString";
if (true) return __ref._th /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=215810050;
 //BA.debugLineNum = 215810050;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=216072192;
 //BA.debugLineNum = 216072192;BA.debugLine="Sub Render";
RDebugUtils.currentLine=216072193;
 //BA.debugLineNum = 216072193;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=216072194;
 //BA.debugLineNum = 216072194;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmth  _setaccent(b4j.example.vmth __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=216334336;
 //BA.debugLineNum = 216334336;BA.debugLine="Sub SetAccent(b As Boolean) As VMTH";
RDebugUtils.currentLine=216334337;
 //BA.debugLineNum = 216334337;BA.debugLine="TH.SetAccent(True)";
__ref._th /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=216334338;
 //BA.debugLineNum = 216334338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216334339;
 //BA.debugLineNum = 216334339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmth  _setattr(b4j.example.vmth __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=216530944;
 //BA.debugLineNum = 216530944;BA.debugLine="Sub SetAttr(attr As Map) As VMTH";
RDebugUtils.currentLine=216530945;
 //BA.debugLineNum = 216530945;BA.debugLine="TH.SetAttr(attr)";
__ref._th /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=216530946;
 //BA.debugLineNum = 216530946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216530947;
 //BA.debugLineNum = 216530947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmth  _setpadding(b4j.example.vmth __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=216727552;
 //BA.debugLineNum = 216727552;BA.debugLine="Sub SetPadding(p As Object) As VMTH";
RDebugUtils.currentLine=216727553;
 //BA.debugLineNum = 216727553;BA.debugLine="TH.SetPaddingAll(p)";
__ref._th /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=216727554;
 //BA.debugLineNum = 216727554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216727555;
 //BA.debugLineNum = 216727555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmth  _setprimary(b4j.example.vmth __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=216268800;
 //BA.debugLineNum = 216268800;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTH";
RDebugUtils.currentLine=216268801;
 //BA.debugLineNum = 216268801;BA.debugLine="TH.SetPrimary(True)";
__ref._th /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=216268802;
 //BA.debugLineNum = 216268802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216268803;
 //BA.debugLineNum = 216268803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmth  _setstyle(b4j.example.vmth __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=216596480;
 //BA.debugLineNum = 216596480;BA.debugLine="Sub SetStyle(sm As Map) As VMTH";
RDebugUtils.currentLine=216596481;
 //BA.debugLineNum = 216596481;BA.debugLine="TH.SetStyle(sm)";
__ref._th /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=216596482;
 //BA.debugLineNum = 216596482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216596483;
 //BA.debugLineNum = 216596483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmth  _settext(b4j.example.vmth __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=216203264;
 //BA.debugLineNum = 216203264;BA.debugLine="Sub SetText(t As Object) As VMTH";
RDebugUtils.currentLine=216203265;
 //BA.debugLineNum = 216203265;BA.debugLine="TH.SetText(t)";
__ref._th /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=216203266;
 //BA.debugLineNum = 216203266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216203267;
 //BA.debugLineNum = 216203267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmth  _setvif(b4j.example.vmth __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=215941120;
 //BA.debugLineNum = 215941120;BA.debugLine="Sub SetVIf(vif As Object) As VMTH";
RDebugUtils.currentLine=215941121;
 //BA.debugLineNum = 215941121;BA.debugLine="TH.SetVIf(vif)";
__ref._th /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=215941122;
 //BA.debugLineNum = 215941122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=215941123;
 //BA.debugLineNum = 215941123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmth  _setvmodel(b4j.example.vmth __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=215875584;
 //BA.debugLineNum = 215875584;BA.debugLine="Sub SetVModel(k As String) As VMTH";
RDebugUtils.currentLine=215875585;
 //BA.debugLineNum = 215875585;BA.debugLine="TH.SetVModel(k)";
__ref._th /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=215875586;
 //BA.debugLineNum = 215875586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=215875587;
 //BA.debugLineNum = 215875587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmth  _setvshow(b4j.example.vmth __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmth";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmth) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=216006656;
 //BA.debugLineNum = 216006656;BA.debugLine="Sub SetVShow(vif As Object) As VMTH";
RDebugUtils.currentLine=216006657;
 //BA.debugLineNum = 216006657;BA.debugLine="TH.SetVShow(vif)";
__ref._th /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=216006658;
 //BA.debugLineNum = 216006658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmth)(this);
RDebugUtils.currentLine=216006659;
 //BA.debugLineNum = 216006659;BA.debugLine="End Sub";
return null;
}
}