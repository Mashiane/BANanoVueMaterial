package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcardarea extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcardarea", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcardarea.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _cardarea = null;
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
public b4j.example.vmcardarea  _addchild(b4j.example.vmcardarea __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=78446592;
 //BA.debugLineNum = 78446592;BA.debugLine="Sub AddChild(child As VMElement) As VMCardArea";
RDebugUtils.currentLine=78446593;
 //BA.debugLineNum = 78446593;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=78446594;
 //BA.debugLineNum = 78446594;BA.debugLine="CardArea.SetText(childHTML)";
__ref._cardarea /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=78446595;
 //BA.debugLineNum = 78446595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78446596;
 //BA.debugLineNum = 78446596;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmcardarea __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=78839808;
 //BA.debugLineNum = 78839808;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=78839809;
 //BA.debugLineNum = 78839809;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=78839810;
 //BA.debugLineNum = 78839810;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmcardarea*/ (null,_childx);
 }
};
RDebugUtils.currentLine=78839812;
 //BA.debugLineNum = 78839812;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardarea  _addclass(b4j.example.vmcardarea __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=78643200;
 //BA.debugLineNum = 78643200;BA.debugLine="Sub AddClass(c As String) As VMCardArea";
RDebugUtils.currentLine=78643201;
 //BA.debugLineNum = 78643201;BA.debugLine="CardArea.AddClass(c)";
__ref._cardarea /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=78643202;
 //BA.debugLineNum = 78643202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78643203;
 //BA.debugLineNum = 78643203;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmcardarea __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
RDebugUtils.currentLine=77987840;
 //BA.debugLineNum = 77987840;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=77987841;
 //BA.debugLineNum = 77987841;BA.debugLine="Public CardArea As VMElement";
_cardarea = new b4j.example.vmelement();
RDebugUtils.currentLine=77987842;
 //BA.debugLineNum = 77987842;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=77987843;
 //BA.debugLineNum = 77987843;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=77987844;
 //BA.debugLineNum = 77987844;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=77987845;
 //BA.debugLineNum = 77987845;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardarea  _initialize(b4j.example.vmcardarea __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=78053376;
 //BA.debugLineNum = 78053376;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=78053377;
 //BA.debugLineNum = 78053377;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=78053378;
 //BA.debugLineNum = 78053378;BA.debugLine="CardArea.Initialize(v, ID)";
__ref._cardarea /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=78053379;
 //BA.debugLineNum = 78053379;BA.debugLine="CardArea.SetTag(\"md-card-area\")";
__ref._cardarea /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-card-area");
RDebugUtils.currentLine=78053380;
 //BA.debugLineNum = 78053380;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=78053381;
 //BA.debugLineNum = 78053381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78053382;
 //BA.debugLineNum = 78053382;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmcardarea __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=78577664;
 //BA.debugLineNum = 78577664;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=78577665;
 //BA.debugLineNum = 78577665;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=78577666;
 //BA.debugLineNum = 78577666;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmcardarea __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=78118912;
 //BA.debugLineNum = 78118912;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=78118913;
 //BA.debugLineNum = 78118913;BA.debugLine="Return CardArea.ToString";
if (true) return __ref._cardarea /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=78118914;
 //BA.debugLineNum = 78118914;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmcardarea __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=78381056;
 //BA.debugLineNum = 78381056;BA.debugLine="Sub Render";
RDebugUtils.currentLine=78381057;
 //BA.debugLineNum = 78381057;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=78381058;
 //BA.debugLineNum = 78381058;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardarea  _setattr(b4j.example.vmcardarea __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=78708736;
 //BA.debugLineNum = 78708736;BA.debugLine="Sub SetAttr(attr As Map) As VMCardArea";
RDebugUtils.currentLine=78708737;
 //BA.debugLineNum = 78708737;BA.debugLine="CardArea.SetAttr(attr)";
__ref._cardarea /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=78708738;
 //BA.debugLineNum = 78708738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78708739;
 //BA.debugLineNum = 78708739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardarea  _setinset(b4j.example.vmcardarea __ref,boolean _varinset) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "setinset", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "setinset", new Object[] {_varinset}));}
RDebugUtils.currentLine=78970880;
 //BA.debugLineNum = 78970880;BA.debugLine="Sub SetInset(varInset As Boolean) As VMCardArea";
RDebugUtils.currentLine=78970881;
 //BA.debugLineNum = 78970881;BA.debugLine="SetAttr(CreateMap(\":md-inset\": varInset))";
__ref._setattr /*b4j.example.vmcardarea*/ (null,__c.createMap(new Object[] {(Object)(":md-inset"),(Object)(_varinset)}));
RDebugUtils.currentLine=78970882;
 //BA.debugLineNum = 78970882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78970883;
 //BA.debugLineNum = 78970883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardarea  _setpadding(b4j.example.vmcardarea __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=78905344;
 //BA.debugLineNum = 78905344;BA.debugLine="Sub SetPadding(p As Object) As VMCardArea";
RDebugUtils.currentLine=78905345;
 //BA.debugLineNum = 78905345;BA.debugLine="CardArea.SetPaddingAll(p)";
__ref._cardarea /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=78905346;
 //BA.debugLineNum = 78905346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78905347;
 //BA.debugLineNum = 78905347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardarea  _setstyle(b4j.example.vmcardarea __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=78774272;
 //BA.debugLineNum = 78774272;BA.debugLine="Sub SetStyle(sm As Map) As VMCardArea";
RDebugUtils.currentLine=78774273;
 //BA.debugLineNum = 78774273;BA.debugLine="CardArea.SetStyle(sm)";
__ref._cardarea /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=78774274;
 //BA.debugLineNum = 78774274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78774275;
 //BA.debugLineNum = 78774275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardarea  _settext(b4j.example.vmcardarea __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=78512128;
 //BA.debugLineNum = 78512128;BA.debugLine="Sub SetText(t As Object) As VMCardArea";
RDebugUtils.currentLine=78512129;
 //BA.debugLineNum = 78512129;BA.debugLine="CardArea.SetText(t)";
__ref._cardarea /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=78512130;
 //BA.debugLineNum = 78512130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78512131;
 //BA.debugLineNum = 78512131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardarea  _setvif(b4j.example.vmcardarea __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=78249984;
 //BA.debugLineNum = 78249984;BA.debugLine="Sub SetVIf(vif As Object) As VMCardArea";
RDebugUtils.currentLine=78249985;
 //BA.debugLineNum = 78249985;BA.debugLine="CardArea.SetVIf(vif)";
__ref._cardarea /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=78249986;
 //BA.debugLineNum = 78249986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78249987;
 //BA.debugLineNum = 78249987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardarea  _setvmodel(b4j.example.vmcardarea __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=78184448;
 //BA.debugLineNum = 78184448;BA.debugLine="Sub SetVModel(k As String) As VMCardArea";
RDebugUtils.currentLine=78184449;
 //BA.debugLineNum = 78184449;BA.debugLine="CardArea.SetVModel(k)";
__ref._cardarea /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=78184450;
 //BA.debugLineNum = 78184450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78184451;
 //BA.debugLineNum = 78184451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardarea  _setvshow(b4j.example.vmcardarea __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardarea";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmcardarea) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=78315520;
 //BA.debugLineNum = 78315520;BA.debugLine="Sub SetVShow(vif As Object) As VMCardArea";
RDebugUtils.currentLine=78315521;
 //BA.debugLineNum = 78315521;BA.debugLine="CardArea.SetVShow(vif)";
__ref._cardarea /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=78315522;
 //BA.debugLineNum = 78315522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardarea)(this);
RDebugUtils.currentLine=78315523;
 //BA.debugLineNum = 78315523;BA.debugLine="End Sub";
return null;
}
}