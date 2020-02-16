package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcardmedia extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcardmedia", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcardmedia.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _cardmedia = null;
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
public b4j.example.vmcardmedia  _initialize(b4j.example.vmcardmedia __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=79101952;
 //BA.debugLineNum = 79101952;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=79101953;
 //BA.debugLineNum = 79101953;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=79101954;
 //BA.debugLineNum = 79101954;BA.debugLine="CardMedia.Initialize(v, ID)";
__ref._cardmedia /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=79101955;
 //BA.debugLineNum = 79101955;BA.debugLine="CardMedia.SetTag(\"md-card-media\")";
__ref._cardmedia /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-card-media");
RDebugUtils.currentLine=79101956;
 //BA.debugLineNum = 79101956;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=79101957;
 //BA.debugLineNum = 79101957;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79101958;
 //BA.debugLineNum = 79101958;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _setbig(b4j.example.vmcardmedia __ref,boolean _varbig) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setbig", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setbig", new Object[] {_varbig}));}
RDebugUtils.currentLine=80150528;
 //BA.debugLineNum = 80150528;BA.debugLine="Sub SetBig(varBig As Boolean) As VMCardMedia";
RDebugUtils.currentLine=80150529;
 //BA.debugLineNum = 80150529;BA.debugLine="SetAttr(CreateMap(\":md-big\": varBig))";
__ref._setattr /*b4j.example.vmcardmedia*/ (null,__c.createMap(new Object[] {(Object)(":md-big"),(Object)(_varbig)}));
RDebugUtils.currentLine=80150530;
 //BA.debugLineNum = 80150530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=80150531;
 //BA.debugLineNum = 80150531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _setmedium(b4j.example.vmcardmedia __ref,boolean _varmedium) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setmedium", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setmedium", new Object[] {_varmedium}));}
RDebugUtils.currentLine=80084992;
 //BA.debugLineNum = 80084992;BA.debugLine="Sub SetMedium(varMedium As Boolean) As VMCardMedia";
RDebugUtils.currentLine=80084993;
 //BA.debugLineNum = 80084993;BA.debugLine="SetAttr(CreateMap(\":md-medium\": varMedium))";
__ref._setattr /*b4j.example.vmcardmedia*/ (null,__c.createMap(new Object[] {(Object)(":md-medium"),(Object)(_varmedium)}));
RDebugUtils.currentLine=80084994;
 //BA.debugLineNum = 80084994;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=80084995;
 //BA.debugLineNum = 80084995;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmcardmedia __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=79626240;
 //BA.debugLineNum = 79626240;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=79626241;
 //BA.debugLineNum = 79626241;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=79626242;
 //BA.debugLineNum = 79626242;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardmedia  _addchild(b4j.example.vmcardmedia __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=79495168;
 //BA.debugLineNum = 79495168;BA.debugLine="Sub AddChild(child As VMElement) As VMCardMedia";
RDebugUtils.currentLine=79495169;
 //BA.debugLineNum = 79495169;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=79495170;
 //BA.debugLineNum = 79495170;BA.debugLine="CardMedia.SetText(childHTML)";
__ref._cardmedia /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=79495171;
 //BA.debugLineNum = 79495171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79495172;
 //BA.debugLineNum = 79495172;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmcardmedia __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=79888384;
 //BA.debugLineNum = 79888384;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=79888385;
 //BA.debugLineNum = 79888385;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=79888386;
 //BA.debugLineNum = 79888386;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmcardmedia*/ (null,_childx);
 }
};
RDebugUtils.currentLine=79888388;
 //BA.debugLineNum = 79888388;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardmedia  _addclass(b4j.example.vmcardmedia __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=79691776;
 //BA.debugLineNum = 79691776;BA.debugLine="Sub AddClass(c As String) As VMCardMedia";
RDebugUtils.currentLine=79691777;
 //BA.debugLineNum = 79691777;BA.debugLine="CardMedia.AddClass(c)";
__ref._cardmedia /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=79691778;
 //BA.debugLineNum = 79691778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79691779;
 //BA.debugLineNum = 79691779;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmcardmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
RDebugUtils.currentLine=79036416;
 //BA.debugLineNum = 79036416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=79036417;
 //BA.debugLineNum = 79036417;BA.debugLine="Public CardMedia As VMElement";
_cardmedia = new b4j.example.vmelement();
RDebugUtils.currentLine=79036418;
 //BA.debugLineNum = 79036418;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=79036419;
 //BA.debugLineNum = 79036419;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=79036420;
 //BA.debugLineNum = 79036420;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=79036421;
 //BA.debugLineNum = 79036421;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmcardmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=79167488;
 //BA.debugLineNum = 79167488;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=79167489;
 //BA.debugLineNum = 79167489;BA.debugLine="Return CardMedia.ToString";
if (true) return __ref._cardmedia /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=79167490;
 //BA.debugLineNum = 79167490;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmcardmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=79429632;
 //BA.debugLineNum = 79429632;BA.debugLine="Sub Render";
RDebugUtils.currentLine=79429633;
 //BA.debugLineNum = 79429633;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=79429634;
 //BA.debugLineNum = 79429634;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardmedia  _setattr(b4j.example.vmcardmedia __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=79757312;
 //BA.debugLineNum = 79757312;BA.debugLine="Sub SetAttr(attr As Map) As VMCardMedia";
RDebugUtils.currentLine=79757313;
 //BA.debugLineNum = 79757313;BA.debugLine="CardMedia.SetAttr(attr)";
__ref._cardmedia /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=79757314;
 //BA.debugLineNum = 79757314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79757315;
 //BA.debugLineNum = 79757315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _setpadding(b4j.example.vmcardmedia __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=79953920;
 //BA.debugLineNum = 79953920;BA.debugLine="Sub SetPadding(p As Object) As VMCardMedia";
RDebugUtils.currentLine=79953921;
 //BA.debugLineNum = 79953921;BA.debugLine="CardMedia.SetPaddingAll(p)";
__ref._cardmedia /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=79953922;
 //BA.debugLineNum = 79953922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79953923;
 //BA.debugLineNum = 79953923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _setratio(b4j.example.vmcardmedia __ref,Object _varratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setratio", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setratio", new Object[] {_varratio}));}
RDebugUtils.currentLine=80019456;
 //BA.debugLineNum = 80019456;BA.debugLine="Sub SetRatio(varRatio As Object) As VMCardMedia";
RDebugUtils.currentLine=80019457;
 //BA.debugLineNum = 80019457;BA.debugLine="SetAttr(CreateMap(\"md-ratio\": varRatio))";
__ref._setattr /*b4j.example.vmcardmedia*/ (null,__c.createMap(new Object[] {(Object)("md-ratio"),_varratio}));
RDebugUtils.currentLine=80019458;
 //BA.debugLineNum = 80019458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=80019459;
 //BA.debugLineNum = 80019459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _setstyle(b4j.example.vmcardmedia __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=79822848;
 //BA.debugLineNum = 79822848;BA.debugLine="Sub SetStyle(sm As Map) As VMCardMedia";
RDebugUtils.currentLine=79822849;
 //BA.debugLineNum = 79822849;BA.debugLine="CardMedia.SetStyle(sm)";
__ref._cardmedia /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=79822850;
 //BA.debugLineNum = 79822850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79822851;
 //BA.debugLineNum = 79822851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _settext(b4j.example.vmcardmedia __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=79560704;
 //BA.debugLineNum = 79560704;BA.debugLine="Sub SetText(t As Object) As VMCardMedia";
RDebugUtils.currentLine=79560705;
 //BA.debugLineNum = 79560705;BA.debugLine="CardMedia.SetText(t)";
__ref._cardmedia /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=79560706;
 //BA.debugLineNum = 79560706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79560707;
 //BA.debugLineNum = 79560707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _setvif(b4j.example.vmcardmedia __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=79298560;
 //BA.debugLineNum = 79298560;BA.debugLine="Sub SetVIf(vif As Object) As VMCardMedia";
RDebugUtils.currentLine=79298561;
 //BA.debugLineNum = 79298561;BA.debugLine="CardMedia.SetVIf(vif)";
__ref._cardmedia /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=79298562;
 //BA.debugLineNum = 79298562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79298563;
 //BA.debugLineNum = 79298563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _setvmodel(b4j.example.vmcardmedia __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=79233024;
 //BA.debugLineNum = 79233024;BA.debugLine="Sub SetVModel(k As String) As VMCardMedia";
RDebugUtils.currentLine=79233025;
 //BA.debugLineNum = 79233025;BA.debugLine="CardMedia.SetVModel(k)";
__ref._cardmedia /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=79233026;
 //BA.debugLineNum = 79233026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79233027;
 //BA.debugLineNum = 79233027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardmedia  _setvshow(b4j.example.vmcardmedia __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardmedia";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmcardmedia) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=79364096;
 //BA.debugLineNum = 79364096;BA.debugLine="Sub SetVShow(vif As Object) As VMCardMedia";
RDebugUtils.currentLine=79364097;
 //BA.debugLineNum = 79364097;BA.debugLine="CardMedia.SetVShow(vif)";
__ref._cardmedia /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=79364098;
 //BA.debugLineNum = 79364098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardmedia)(this);
RDebugUtils.currentLine=79364099;
 //BA.debugLineNum = 79364099;BA.debugLine="End Sub";
return null;
}
}