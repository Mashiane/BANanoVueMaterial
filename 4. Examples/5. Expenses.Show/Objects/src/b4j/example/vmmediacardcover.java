package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmmediacardcover extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmmediacardcover", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmmediacardcover.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _mediacardcover = null;
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
public b4j.example.vmmediacardcover  _addchild(b4j.example.vmmediacardcover __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=172294144;
 //BA.debugLineNum = 172294144;BA.debugLine="Sub AddChild(child As VMElement) As VMMediaCardCov";
RDebugUtils.currentLine=172294145;
 //BA.debugLineNum = 172294145;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=172294146;
 //BA.debugLineNum = 172294146;BA.debugLine="MediaCardCover.SetText(childHTML)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=172294147;
 //BA.debugLineNum = 172294147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172294148;
 //BA.debugLineNum = 172294148;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmmediacardcover __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=172687360;
 //BA.debugLineNum = 172687360;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=172687361;
 //BA.debugLineNum = 172687361;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=172687362;
 //BA.debugLineNum = 172687362;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmmediacardcover*/ (null,_childx);
 }
};
RDebugUtils.currentLine=172687364;
 //BA.debugLineNum = 172687364;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmediacardcover  _addclass(b4j.example.vmmediacardcover __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=172490752;
 //BA.debugLineNum = 172490752;BA.debugLine="Sub AddClass(c As String) As VMMediaCardCover";
RDebugUtils.currentLine=172490753;
 //BA.debugLineNum = 172490753;BA.debugLine="MediaCardCover.AddClass(c)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=172490754;
 //BA.debugLineNum = 172490754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172490755;
 //BA.debugLineNum = 172490755;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmmediacardcover __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
RDebugUtils.currentLine=171835392;
 //BA.debugLineNum = 171835392;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=171835393;
 //BA.debugLineNum = 171835393;BA.debugLine="Public MediaCardCover As VMElement";
_mediacardcover = new b4j.example.vmelement();
RDebugUtils.currentLine=171835394;
 //BA.debugLineNum = 171835394;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=171835395;
 //BA.debugLineNum = 171835395;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=171835396;
 //BA.debugLineNum = 171835396;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=171835397;
 //BA.debugLineNum = 171835397;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmediacardcover  _initialize(b4j.example.vmmediacardcover __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=171900928;
 //BA.debugLineNum = 171900928;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=171900929;
 //BA.debugLineNum = 171900929;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=171900930;
 //BA.debugLineNum = 171900930;BA.debugLine="MediaCardCover.Initialize(v, ID)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=171900931;
 //BA.debugLineNum = 171900931;BA.debugLine="MediaCardCover.SetTag(\"md-card-media-cover\")";
__ref._mediacardcover /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-card-media-cover");
RDebugUtils.currentLine=171900932;
 //BA.debugLineNum = 171900932;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=171900933;
 //BA.debugLineNum = 171900933;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=171900934;
 //BA.debugLineNum = 171900934;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmmediacardcover __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=172425216;
 //BA.debugLineNum = 172425216;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=172425217;
 //BA.debugLineNum = 172425217;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=172425218;
 //BA.debugLineNum = 172425218;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmmediacardcover __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=171966464;
 //BA.debugLineNum = 171966464;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=171966465;
 //BA.debugLineNum = 171966465;BA.debugLine="Return MediaCardCover.ToString";
if (true) return __ref._mediacardcover /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=171966466;
 //BA.debugLineNum = 171966466;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmmediacardcover __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=172228608;
 //BA.debugLineNum = 172228608;BA.debugLine="Sub Render";
RDebugUtils.currentLine=172228609;
 //BA.debugLineNum = 172228609;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=172228610;
 //BA.debugLineNum = 172228610;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmediacardcover  _setattr(b4j.example.vmmediacardcover __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=172556288;
 //BA.debugLineNum = 172556288;BA.debugLine="Sub SetAttr(attr As Map) As VMMediaCardCover";
RDebugUtils.currentLine=172556289;
 //BA.debugLineNum = 172556289;BA.debugLine="MediaCardCover.SetAttr(attr)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=172556290;
 //BA.debugLineNum = 172556290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172556291;
 //BA.debugLineNum = 172556291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setpadding(b4j.example.vmmediacardcover __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=172752896;
 //BA.debugLineNum = 172752896;BA.debugLine="Sub SetPadding(p As Object) As VMMediaCardCover";
RDebugUtils.currentLine=172752897;
 //BA.debugLineNum = 172752897;BA.debugLine="MediaCardCover.SetPaddingAll(p)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=172752898;
 //BA.debugLineNum = 172752898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172752899;
 //BA.debugLineNum = 172752899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setsolid(b4j.example.vmmediacardcover __ref,boolean _varsolid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "setsolid", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "setsolid", new Object[] {_varsolid}));}
RDebugUtils.currentLine=172883968;
 //BA.debugLineNum = 172883968;BA.debugLine="Sub SetSolid(varSolid As Boolean) As VMMediaCardCo";
RDebugUtils.currentLine=172883969;
 //BA.debugLineNum = 172883969;BA.debugLine="SetAttr(CreateMap(\":md-solid\": varSolid))";
__ref._setattr /*b4j.example.vmmediacardcover*/ (null,__c.createMap(new Object[] {(Object)(":md-solid"),(Object)(_varsolid)}));
RDebugUtils.currentLine=172883970;
 //BA.debugLineNum = 172883970;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172883971;
 //BA.debugLineNum = 172883971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setstyle(b4j.example.vmmediacardcover __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=172621824;
 //BA.debugLineNum = 172621824;BA.debugLine="Sub SetStyle(sm As Map) As VMMediaCardCover";
RDebugUtils.currentLine=172621825;
 //BA.debugLineNum = 172621825;BA.debugLine="MediaCardCover.SetStyle(sm)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=172621826;
 //BA.debugLineNum = 172621826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172621827;
 //BA.debugLineNum = 172621827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _settext(b4j.example.vmmediacardcover __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=172359680;
 //BA.debugLineNum = 172359680;BA.debugLine="Sub SetText(t As Object) As VMMediaCardCover";
RDebugUtils.currentLine=172359681;
 //BA.debugLineNum = 172359681;BA.debugLine="MediaCardCover.SetText(t)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=172359682;
 //BA.debugLineNum = 172359682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172359683;
 //BA.debugLineNum = 172359683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _settextscrim(b4j.example.vmmediacardcover __ref,boolean _vartext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "settextscrim", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "settextscrim", new Object[] {_vartext}));}
RDebugUtils.currentLine=172818432;
 //BA.debugLineNum = 172818432;BA.debugLine="Sub SetTextScrim(varText As Boolean) As VMMediaCar";
RDebugUtils.currentLine=172818433;
 //BA.debugLineNum = 172818433;BA.debugLine="SetAttr(CreateMap(\":md-text-scrim\": varText))";
__ref._setattr /*b4j.example.vmmediacardcover*/ (null,__c.createMap(new Object[] {(Object)(":md-text-scrim"),(Object)(_vartext)}));
RDebugUtils.currentLine=172818434;
 //BA.debugLineNum = 172818434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172818435;
 //BA.debugLineNum = 172818435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setvif(b4j.example.vmmediacardcover __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=172097536;
 //BA.debugLineNum = 172097536;BA.debugLine="Sub SetVIf(vif As Object) As VMMediaCardCover";
RDebugUtils.currentLine=172097537;
 //BA.debugLineNum = 172097537;BA.debugLine="MediaCardCover.SetVIf(vif)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=172097538;
 //BA.debugLineNum = 172097538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172097539;
 //BA.debugLineNum = 172097539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setvmodel(b4j.example.vmmediacardcover __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=172032000;
 //BA.debugLineNum = 172032000;BA.debugLine="Sub SetVModel(k As String) As VMMediaCardCover";
RDebugUtils.currentLine=172032001;
 //BA.debugLineNum = 172032001;BA.debugLine="MediaCardCover.SetVModel(k)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=172032002;
 //BA.debugLineNum = 172032002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172032003;
 //BA.debugLineNum = 172032003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmediacardcover  _setvshow(b4j.example.vmmediacardcover __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmediacardcover";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmmediacardcover) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=172163072;
 //BA.debugLineNum = 172163072;BA.debugLine="Sub SetVShow(vif As Object) As VMMediaCardCover";
RDebugUtils.currentLine=172163073;
 //BA.debugLineNum = 172163073;BA.debugLine="MediaCardCover.SetVShow(vif)";
__ref._mediacardcover /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=172163074;
 //BA.debugLineNum = 172163074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmediacardcover)(this);
RDebugUtils.currentLine=172163075;
 //BA.debugLineNum = 172163075;BA.debugLine="End Sub";
return null;
}
}