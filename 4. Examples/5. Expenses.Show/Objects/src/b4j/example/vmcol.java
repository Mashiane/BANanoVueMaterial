package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcol extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcol", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcol.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _col = null;
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
public b4j.example.vmcol  _initialize(b4j.example.vmcol __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=90570752;
 //BA.debugLineNum = 90570752;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=90570753;
 //BA.debugLineNum = 90570753;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=90570754;
 //BA.debugLineNum = 90570754;BA.debugLine="Col.Initialize(v, ID)";
__ref._col /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=90570755;
 //BA.debugLineNum = 90570755;BA.debugLine="Col.SetTag(\"div\").AddClass(\"md-layout-item\")";
__ref._col /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"md-layout-item");
RDebugUtils.currentLine=90570756;
 //BA.debugLineNum = 90570756;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=90570757;
 //BA.debugLineNum = 90570757;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=90570758;
 //BA.debugLineNum = 90570758;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _addchild(b4j.example.vmcol __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=91226112;
 //BA.debugLineNum = 91226112;BA.debugLine="Sub AddChild(child As VMElement) As VMCol";
RDebugUtils.currentLine=91226113;
 //BA.debugLineNum = 91226113;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=91226114;
 //BA.debugLineNum = 91226114;BA.debugLine="Col.SetText(childHTML)";
__ref._col /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=91226115;
 //BA.debugLineNum = 91226115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91226116;
 //BA.debugLineNum = 91226116;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmcol __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=91750400;
 //BA.debugLineNum = 91750400;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=91750401;
 //BA.debugLineNum = 91750401;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=91750402;
 //BA.debugLineNum = 91750402;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmcol*/ (null,_childx);
 }
};
RDebugUtils.currentLine=91750404;
 //BA.debugLineNum = 91750404;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcol  _addclass(b4j.example.vmcol __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=91553792;
 //BA.debugLineNum = 91553792;BA.debugLine="Sub AddClass(c As String) As VMCol";
RDebugUtils.currentLine=91553793;
 //BA.debugLineNum = 91553793;BA.debugLine="Col.AddClass(c)";
__ref._col /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=91553794;
 //BA.debugLineNum = 91553794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91553795;
 //BA.debugLineNum = 91553795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _addelements(b4j.example.vmcol __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "addelements", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "addelements", new Object[] {_lst}));}
RDebugUtils.currentLine=90636288;
 //BA.debugLineNum = 90636288;BA.debugLine="Sub AddElements(lst As List) As VMCol";
RDebugUtils.currentLine=90636289;
 //BA.debugLineNum = 90636289;BA.debugLine="Col.AddElements(lst)";
__ref._col /*b4j.example.vmelement*/ ._addelements /*String*/ (null,_lst);
RDebugUtils.currentLine=90636290;
 //BA.debugLineNum = 90636290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=90636291;
 //BA.debugLineNum = 90636291;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmcol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
RDebugUtils.currentLine=90505216;
 //BA.debugLineNum = 90505216;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=90505217;
 //BA.debugLineNum = 90505217;BA.debugLine="Public Col As VMElement";
_col = new b4j.example.vmelement();
RDebugUtils.currentLine=90505218;
 //BA.debugLineNum = 90505218;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=90505219;
 //BA.debugLineNum = 90505219;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=90505220;
 //BA.debugLineNum = 90505220;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=90505221;
 //BA.debugLineNum = 90505221;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmcol __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=91488256;
 //BA.debugLineNum = 91488256;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=91488257;
 //BA.debugLineNum = 91488257;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=91488258;
 //BA.debugLineNum = 91488258;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmcol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=90898432;
 //BA.debugLineNum = 90898432;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=90898433;
 //BA.debugLineNum = 90898433;BA.debugLine="Return Col.ToString";
if (true) return __ref._col /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=90898434;
 //BA.debugLineNum = 90898434;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmcol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=91160576;
 //BA.debugLineNum = 91160576;BA.debugLine="Sub Render";
RDebugUtils.currentLine=91160577;
 //BA.debugLineNum = 91160577;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=91160578;
 //BA.debugLineNum = 91160578;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcol  _setaccent(b4j.example.vmcol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=91422720;
 //BA.debugLineNum = 91422720;BA.debugLine="Sub SetAccent(b As Boolean) As VMCol";
RDebugUtils.currentLine=91422721;
 //BA.debugLineNum = 91422721;BA.debugLine="Col.SetAccent(True)";
__ref._col /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=91422722;
 //BA.debugLineNum = 91422722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91422723;
 //BA.debugLineNum = 91422723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setattr(b4j.example.vmcol __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=91619328;
 //BA.debugLineNum = 91619328;BA.debugLine="Sub SetAttr(attr As Map) As VMCol";
RDebugUtils.currentLine=91619329;
 //BA.debugLineNum = 91619329;BA.debugLine="Col.SetAttr(attr)";
__ref._col /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=91619330;
 //BA.debugLineNum = 91619330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91619331;
 //BA.debugLineNum = 91619331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setgutter(b4j.example.vmcol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setgutter", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setgutter", new Object[] {_b}));}
RDebugUtils.currentLine=90832896;
 //BA.debugLineNum = 90832896;BA.debugLine="Sub SetGutter(b As Boolean) As VMCol";
RDebugUtils.currentLine=90832897;
 //BA.debugLineNum = 90832897;BA.debugLine="Col.SetGutter(True)";
__ref._col /*b4j.example.vmelement*/ ._setgutter /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=90832898;
 //BA.debugLineNum = 90832898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=90832899;
 //BA.debugLineNum = 90832899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _sethidden(b4j.example.vmcol __ref,boolean _xsmall,boolean _small,boolean _medium,boolean _large,boolean _xlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "sethidden", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "sethidden", new Object[] {_xsmall,_small,_medium,_large,_xlarge}));}
RDebugUtils.currentLine=90701824;
 //BA.debugLineNum = 90701824;BA.debugLine="Sub SetHidden(xsmall As Boolean, small As Boolean,";
RDebugUtils.currentLine=90701825;
 //BA.debugLineNum = 90701825;BA.debugLine="Col.SetHidden(xsmall, small, medium, large, xlarg";
__ref._col /*b4j.example.vmelement*/ ._sethidden /*b4j.example.vmelement*/ (null,_xsmall,_small,_medium,_large,_xlarge);
RDebugUtils.currentLine=90701826;
 //BA.debugLineNum = 90701826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=90701827;
 //BA.debugLineNum = 90701827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setpadding(b4j.example.vmcol __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=91815936;
 //BA.debugLineNum = 91815936;BA.debugLine="Sub SetPadding(p As Object) As VMCol";
RDebugUtils.currentLine=91815937;
 //BA.debugLineNum = 91815937;BA.debugLine="Col.SetPaddingAll(p)";
__ref._col /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=91815938;
 //BA.debugLineNum = 91815938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91815939;
 //BA.debugLineNum = 91815939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setprimary(b4j.example.vmcol __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=91357184;
 //BA.debugLineNum = 91357184;BA.debugLine="Sub SetPrimary(b As Boolean) As VMCol";
RDebugUtils.currentLine=91357185;
 //BA.debugLineNum = 91357185;BA.debugLine="Col.SetPrimary(True)";
__ref._col /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=91357186;
 //BA.debugLineNum = 91357186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91357187;
 //BA.debugLineNum = 91357187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setsizes(b4j.example.vmcol __ref,int _xsmall,int _small,int _medium,int _large,int _xlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setsizes", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setsizes", new Object[] {_xsmall,_small,_medium,_large,_xlarge}));}
RDebugUtils.currentLine=90767360;
 //BA.debugLineNum = 90767360;BA.debugLine="Sub SetSizes(xsmall As Int, small As Int, medium A";
RDebugUtils.currentLine=90767361;
 //BA.debugLineNum = 90767361;BA.debugLine="Col.SetSizes(xsmall, small, medium, large, xlarge";
__ref._col /*b4j.example.vmelement*/ ._setsizes /*b4j.example.vmelement*/ (null,_xsmall,_small,_medium,_large,_xlarge);
RDebugUtils.currentLine=90767362;
 //BA.debugLineNum = 90767362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=90767363;
 //BA.debugLineNum = 90767363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setstyle(b4j.example.vmcol __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=91684864;
 //BA.debugLineNum = 91684864;BA.debugLine="Sub SetStyle(sm As Map) As VMCol";
RDebugUtils.currentLine=91684865;
 //BA.debugLineNum = 91684865;BA.debugLine="Col.SetStyle(sm)";
__ref._col /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=91684866;
 //BA.debugLineNum = 91684866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91684867;
 //BA.debugLineNum = 91684867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _settext(b4j.example.vmcol __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=91291648;
 //BA.debugLineNum = 91291648;BA.debugLine="Sub SetText(t As Object) As VMCol";
RDebugUtils.currentLine=91291649;
 //BA.debugLineNum = 91291649;BA.debugLine="Col.SetText(t)";
__ref._col /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=91291650;
 //BA.debugLineNum = 91291650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91291651;
 //BA.debugLineNum = 91291651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setvif(b4j.example.vmcol __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=91029504;
 //BA.debugLineNum = 91029504;BA.debugLine="Sub SetVIf(vif As Object) As VMCol";
RDebugUtils.currentLine=91029505;
 //BA.debugLineNum = 91029505;BA.debugLine="Col.SetVIf(vif)";
__ref._col /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=91029506;
 //BA.debugLineNum = 91029506;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91029507;
 //BA.debugLineNum = 91029507;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setvmodel(b4j.example.vmcol __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=90963968;
 //BA.debugLineNum = 90963968;BA.debugLine="Sub SetVModel(k As String) As VMCol";
RDebugUtils.currentLine=90963969;
 //BA.debugLineNum = 90963969;BA.debugLine="Col.SetVModel(k)";
__ref._col /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=90963970;
 //BA.debugLineNum = 90963970;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=90963971;
 //BA.debugLineNum = 90963971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _setvshow(b4j.example.vmcol __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcol";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=91095040;
 //BA.debugLineNum = 91095040;BA.debugLine="Sub SetVShow(vif As Object) As VMCol";
RDebugUtils.currentLine=91095041;
 //BA.debugLineNum = 91095041;BA.debugLine="Col.SetVShow(vif)";
__ref._col /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=91095042;
 //BA.debugLineNum = 91095042;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcol)(this);
RDebugUtils.currentLine=91095043;
 //BA.debugLineNum = 91095043;BA.debugLine="End Sub";
return null;
}
}