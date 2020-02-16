package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcardactions extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcardactions", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcardactions.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _cardactions = null;
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
public b4j.example.vmcardactions  _initialize(b4j.example.vmcardactions __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=77004800;
 //BA.debugLineNum = 77004800;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=77004801;
 //BA.debugLineNum = 77004801;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=77004802;
 //BA.debugLineNum = 77004802;BA.debugLine="CardActions.Initialize(v, ID)";
__ref._cardactions /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=77004803;
 //BA.debugLineNum = 77004803;BA.debugLine="CardActions.SetTag(\"md-card-actions\")";
__ref._cardactions /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-card-actions");
RDebugUtils.currentLine=77004804;
 //BA.debugLineNum = 77004804;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=77004805;
 //BA.debugLineNum = 77004805;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77004806;
 //BA.debugLineNum = 77004806;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmcardactions __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=77529088;
 //BA.debugLineNum = 77529088;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=77529089;
 //BA.debugLineNum = 77529089;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=77529090;
 //BA.debugLineNum = 77529090;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardactions  _addchild(b4j.example.vmcardactions __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=77398016;
 //BA.debugLineNum = 77398016;BA.debugLine="Sub AddChild(child As VMElement) As VMCardActions";
RDebugUtils.currentLine=77398017;
 //BA.debugLineNum = 77398017;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=77398018;
 //BA.debugLineNum = 77398018;BA.debugLine="CardActions.SetText(childHTML)";
__ref._cardactions /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=77398019;
 //BA.debugLineNum = 77398019;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77398020;
 //BA.debugLineNum = 77398020;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmcardactions __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=77791232;
 //BA.debugLineNum = 77791232;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=77791233;
 //BA.debugLineNum = 77791233;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=77791234;
 //BA.debugLineNum = 77791234;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmcardactions*/ (null,_childx);
 }
};
RDebugUtils.currentLine=77791236;
 //BA.debugLineNum = 77791236;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardactions  _addclass(b4j.example.vmcardactions __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=77594624;
 //BA.debugLineNum = 77594624;BA.debugLine="Sub AddClass(c As String) As VMCardActions";
RDebugUtils.currentLine=77594625;
 //BA.debugLineNum = 77594625;BA.debugLine="CardActions.AddClass(c)";
__ref._cardactions /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=77594626;
 //BA.debugLineNum = 77594626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77594627;
 //BA.debugLineNum = 77594627;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmcardactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
RDebugUtils.currentLine=76939264;
 //BA.debugLineNum = 76939264;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=76939265;
 //BA.debugLineNum = 76939265;BA.debugLine="Public CardActions As VMElement";
_cardactions = new b4j.example.vmelement();
RDebugUtils.currentLine=76939266;
 //BA.debugLineNum = 76939266;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=76939267;
 //BA.debugLineNum = 76939267;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=76939268;
 //BA.debugLineNum = 76939268;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=76939269;
 //BA.debugLineNum = 76939269;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmcardactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=77070336;
 //BA.debugLineNum = 77070336;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=77070337;
 //BA.debugLineNum = 77070337;BA.debugLine="Return CardActions.ToString";
if (true) return __ref._cardactions /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=77070338;
 //BA.debugLineNum = 77070338;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmcardactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=77332480;
 //BA.debugLineNum = 77332480;BA.debugLine="Sub Render";
RDebugUtils.currentLine=77332481;
 //BA.debugLineNum = 77332481;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=77332482;
 //BA.debugLineNum = 77332482;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcardactions  _setalignment(b4j.example.vmcardactions __ref,Object _varalignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "setalignment", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "setalignment", new Object[] {_varalignment}));}
RDebugUtils.currentLine=77922304;
 //BA.debugLineNum = 77922304;BA.debugLine="Sub SetAlignment(varAlignment As Object) As VMCard";
RDebugUtils.currentLine=77922305;
 //BA.debugLineNum = 77922305;BA.debugLine="SetAttr(CreateMap(\"md-alignment\": varAlignment))";
__ref._setattr /*b4j.example.vmcardactions*/ (null,__c.createMap(new Object[] {(Object)("md-alignment"),_varalignment}));
RDebugUtils.currentLine=77922306;
 //BA.debugLineNum = 77922306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77922307;
 //BA.debugLineNum = 77922307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setattr(b4j.example.vmcardactions __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=77660160;
 //BA.debugLineNum = 77660160;BA.debugLine="Sub SetAttr(attr As Map) As VMCardActions";
RDebugUtils.currentLine=77660161;
 //BA.debugLineNum = 77660161;BA.debugLine="CardActions.SetAttr(attr)";
__ref._cardactions /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=77660162;
 //BA.debugLineNum = 77660162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77660163;
 //BA.debugLineNum = 77660163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setpadding(b4j.example.vmcardactions __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=77856768;
 //BA.debugLineNum = 77856768;BA.debugLine="Sub SetPadding(p As Object) As VMCardActions";
RDebugUtils.currentLine=77856769;
 //BA.debugLineNum = 77856769;BA.debugLine="CardActions.SetPaddingAll(p)";
__ref._cardactions /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=77856770;
 //BA.debugLineNum = 77856770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77856771;
 //BA.debugLineNum = 77856771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setstyle(b4j.example.vmcardactions __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=77725696;
 //BA.debugLineNum = 77725696;BA.debugLine="Sub SetStyle(sm As Map) As VMCardActions";
RDebugUtils.currentLine=77725697;
 //BA.debugLineNum = 77725697;BA.debugLine="CardActions.SetStyle(sm)";
__ref._cardactions /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=77725698;
 //BA.debugLineNum = 77725698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77725699;
 //BA.debugLineNum = 77725699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _settext(b4j.example.vmcardactions __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=77463552;
 //BA.debugLineNum = 77463552;BA.debugLine="Sub SetText(t As Object) As VMCardActions";
RDebugUtils.currentLine=77463553;
 //BA.debugLineNum = 77463553;BA.debugLine="CardActions.SetText(t)";
__ref._cardactions /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=77463554;
 //BA.debugLineNum = 77463554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77463555;
 //BA.debugLineNum = 77463555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvif(b4j.example.vmcardactions __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=77201408;
 //BA.debugLineNum = 77201408;BA.debugLine="Sub SetVIf(vif As Object) As VMCardActions";
RDebugUtils.currentLine=77201409;
 //BA.debugLineNum = 77201409;BA.debugLine="CardActions.SetVIf(vif)";
__ref._cardactions /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=77201410;
 //BA.debugLineNum = 77201410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77201411;
 //BA.debugLineNum = 77201411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvmodel(b4j.example.vmcardactions __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=77135872;
 //BA.debugLineNum = 77135872;BA.debugLine="Sub SetVModel(k As String) As VMCardActions";
RDebugUtils.currentLine=77135873;
 //BA.debugLineNum = 77135873;BA.debugLine="CardActions.SetVModel(k)";
__ref._cardactions /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=77135874;
 //BA.debugLineNum = 77135874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77135875;
 //BA.debugLineNum = 77135875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcardactions  _setvshow(b4j.example.vmcardactions __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcardactions";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmcardactions) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=77266944;
 //BA.debugLineNum = 77266944;BA.debugLine="Sub SetVShow(vif As Object) As VMCardActions";
RDebugUtils.currentLine=77266945;
 //BA.debugLineNum = 77266945;BA.debugLine="CardActions.SetVShow(vif)";
__ref._cardactions /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=77266946;
 //BA.debugLineNum = 77266946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcardactions)(this);
RDebugUtils.currentLine=77266947;
 //BA.debugLineNum = 77266947;BA.debugLine="End Sub";
return null;
}
}