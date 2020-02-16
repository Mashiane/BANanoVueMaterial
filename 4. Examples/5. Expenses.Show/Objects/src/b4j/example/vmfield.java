package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmfield", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmfield.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _field = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public String _errkey = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmfield  _initialize(b4j.example.vmfield __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _parentid,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_parentid,_sid,_eventhandler}));}
RDebugUtils.currentLine=121503744;
 //BA.debugLineNum = 121503744;BA.debugLine="Public Sub Initialize(v As BANanoVue, parentID As";
RDebugUtils.currentLine=121503745;
 //BA.debugLineNum = 121503745;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=121503746;
 //BA.debugLineNum = 121503746;BA.debugLine="Field.Initialize(v, ID)";
__ref._field /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=121503747;
 //BA.debugLineNum = 121503747;BA.debugLine="Field.SetTag(\"md-field\")";
__ref._field /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-field");
RDebugUtils.currentLine=121503748;
 //BA.debugLineNum = 121503748;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=121503749;
 //BA.debugLineNum = 121503749;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=121503750;
 //BA.debugLineNum = 121503750;BA.debugLine="Field.SetOnClear(module, $\"${ID}_clear\"$)";
__ref._field /*b4j.example.vmelement*/ ._setonclear /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_clear"));
RDebugUtils.currentLine=121503751;
 //BA.debugLineNum = 121503751;BA.debugLine="errKey = $\"${parentID}error\"$";
__ref._errkey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(_parentid))+"error");
RDebugUtils.currentLine=121503752;
 //BA.debugLineNum = 121503752;BA.debugLine="vue.SetStateSingle(errKey, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._errkey /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=121503753;
 //BA.debugLineNum = 121503753;BA.debugLine="Field.SetAttr(CreateMap(\":class\":errKey & \"class\"";
__ref._field /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":class"),(Object)(__ref._errkey /*String*/ +"class")}));
RDebugUtils.currentLine=121503754;
 //BA.debugLineNum = 121503754;BA.debugLine="vue.SetComputed(errKey & \"class\", Me, \"FieldError";
__ref._vue /*b4j.example.bananovue*/ ._setcomputed /*b4j.example.bananovue*/ (null,__ref._errkey /*String*/ +"class",this,"FieldError");
RDebugUtils.currentLine=121503755;
 //BA.debugLineNum = 121503755;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=121503756;
 //BA.debugLineNum = 121503756;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _addchild(b4j.example.vmfield __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=122028032;
 //BA.debugLineNum = 122028032;BA.debugLine="Sub AddChild(child As VMElement) As VMField";
RDebugUtils.currentLine=122028033;
 //BA.debugLineNum = 122028033;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=122028034;
 //BA.debugLineNum = 122028034;BA.debugLine="Field.SetText(childHTML)";
__ref._field /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=122028035;
 //BA.debugLineNum = 122028035;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122028036;
 //BA.debugLineNum = 122028036;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmfield __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=122552320;
 //BA.debugLineNum = 122552320;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=122552321;
 //BA.debugLineNum = 122552321;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=122552322;
 //BA.debugLineNum = 122552322;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmfield*/ (null,_childx);
 }
};
RDebugUtils.currentLine=122552324;
 //BA.debugLineNum = 122552324;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfield  _addclass(b4j.example.vmfield __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=122355712;
 //BA.debugLineNum = 122355712;BA.debugLine="Sub AddClass(c As String) As VMField";
RDebugUtils.currentLine=122355713;
 //BA.debugLineNum = 122355713;BA.debugLine="Field.AddClass(c)";
__ref._field /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=122355714;
 //BA.debugLineNum = 122355714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122355715;
 //BA.debugLineNum = 122355715;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
RDebugUtils.currentLine=121438208;
 //BA.debugLineNum = 121438208;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=121438209;
 //BA.debugLineNum = 121438209;BA.debugLine="Public Field As VMElement";
_field = new b4j.example.vmelement();
RDebugUtils.currentLine=121438210;
 //BA.debugLineNum = 121438210;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=121438211;
 //BA.debugLineNum = 121438211;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=121438212;
 //BA.debugLineNum = 121438212;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=121438213;
 //BA.debugLineNum = 121438213;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=121438214;
 //BA.debugLineNum = 121438214;BA.debugLine="Private errKey As String";
_errkey = "";
RDebugUtils.currentLine=121438215;
 //BA.debugLineNum = 121438215;BA.debugLine="End Sub";
return "";
}
public Object  _fielderror(b4j.example.vmfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "fielderror", true))
	 {return ((Object) Debug.delegate(ba, "fielderror", null));}
boolean _errmodel = false;
anywheresoftware.b4a.objects.collections.Map _obj = null;
RDebugUtils.currentLine=121634816;
 //BA.debugLineNum = 121634816;BA.debugLine="private Sub FieldError As Object";
RDebugUtils.currentLine=121634817;
 //BA.debugLineNum = 121634817;BA.debugLine="Dim errModel As Boolean = vue.GetState(errKey, Fa";
_errmodel = BA.ObjectToBoolean(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,__ref._errkey /*String*/ ,(Object)(__c.False)));
RDebugUtils.currentLine=121634818;
 //BA.debugLineNum = 121634818;BA.debugLine="Dim obj As Map = CreateMap()";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj = __c.createMap(new Object[] {});
RDebugUtils.currentLine=121634819;
 //BA.debugLineNum = 121634819;BA.debugLine="obj.Put(\"md-invalid\", errModel)";
_obj.Put((Object)("md-invalid"),(Object)(_errmodel));
RDebugUtils.currentLine=121634820;
 //BA.debugLineNum = 121634820;BA.debugLine="Return obj";
if (true) return (Object)(_obj.getObject());
RDebugUtils.currentLine=121634821;
 //BA.debugLineNum = 121634821;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmfield __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=122290176;
 //BA.debugLineNum = 122290176;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=122290177;
 //BA.debugLineNum = 122290177;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=122290178;
 //BA.debugLineNum = 122290178;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=121700352;
 //BA.debugLineNum = 121700352;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=121700353;
 //BA.debugLineNum = 121700353;BA.debugLine="Return Field.ToString";
if (true) return __ref._field /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=121700354;
 //BA.debugLineNum = 121700354;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=121962496;
 //BA.debugLineNum = 121962496;BA.debugLine="Sub Render";
RDebugUtils.currentLine=121962497;
 //BA.debugLineNum = 121962497;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=121962498;
 //BA.debugLineNum = 121962498;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfield  _setaccent(b4j.example.vmfield __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=122224640;
 //BA.debugLineNum = 122224640;BA.debugLine="Sub SetAccent(b As Boolean) As VMField";
RDebugUtils.currentLine=122224641;
 //BA.debugLineNum = 122224641;BA.debugLine="Field.SetAccent(True)";
__ref._field /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=122224642;
 //BA.debugLineNum = 122224642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122224643;
 //BA.debugLineNum = 122224643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setattr(b4j.example.vmfield __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=122421248;
 //BA.debugLineNum = 122421248;BA.debugLine="Sub SetAttr(attr As Map) As VMField";
RDebugUtils.currentLine=122421249;
 //BA.debugLineNum = 122421249;BA.debugLine="Field.SetAttr(attr)";
__ref._field /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=122421250;
 //BA.debugLineNum = 122421250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122421251;
 //BA.debugLineNum = 122421251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setclearable(b4j.example.vmfield __ref,boolean _varclearable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setclearable", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setclearable", new Object[] {_varclearable}));}
RDebugUtils.currentLine=122814464;
 //BA.debugLineNum = 122814464;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMFie";
RDebugUtils.currentLine=122814465;
 //BA.debugLineNum = 122814465;BA.debugLine="SetAttr(CreateMap(\":md-clearable\": varClearable))";
__ref._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-clearable"),(Object)(_varclearable)}));
RDebugUtils.currentLine=122814466;
 //BA.debugLineNum = 122814466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122814467;
 //BA.debugLineNum = 122814467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setcounter(b4j.example.vmfield __ref,boolean _varcounter) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setcounter", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setcounter", new Object[] {_varcounter}));}
RDebugUtils.currentLine=122748928;
 //BA.debugLineNum = 122748928;BA.debugLine="Sub SetCounter(varCounter As Boolean) As VMField";
RDebugUtils.currentLine=122748929;
 //BA.debugLineNum = 122748929;BA.debugLine="SetAttr(CreateMap(\":md-counter\": varCounter))";
__ref._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-counter"),(Object)(_varcounter)}));
RDebugUtils.currentLine=122748930;
 //BA.debugLineNum = 122748930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122748931;
 //BA.debugLineNum = 122748931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setinline(b4j.example.vmfield __ref,boolean _varinline) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setinline", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setinline", new Object[] {_varinline}));}
RDebugUtils.currentLine=122683392;
 //BA.debugLineNum = 122683392;BA.debugLine="Sub SetInline(varInline As Boolean) As VMField";
RDebugUtils.currentLine=122683393;
 //BA.debugLineNum = 122683393;BA.debugLine="SetAttr(CreateMap(\":md-inline\": varInline))";
__ref._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-inline"),(Object)(_varinline)}));
RDebugUtils.currentLine=122683394;
 //BA.debugLineNum = 122683394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122683395;
 //BA.debugLineNum = 122683395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setmaxwidth(b4j.example.vmfield __ref,String _mw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setmaxwidth", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setmaxwidth", new Object[] {_mw}));}
RDebugUtils.currentLine=121569280;
 //BA.debugLineNum = 121569280;BA.debugLine="Sub SetMaxWidth(mw As String) As VMField";
RDebugUtils.currentLine=121569281;
 //BA.debugLineNum = 121569281;BA.debugLine="Field.SetMaxWidth(mw)";
__ref._field /*b4j.example.vmelement*/ ._setmaxwidth /*b4j.example.vmelement*/ (null,_mw);
RDebugUtils.currentLine=121569282;
 //BA.debugLineNum = 121569282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=121569283;
 //BA.debugLineNum = 121569283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setpadding(b4j.example.vmfield __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=122617856;
 //BA.debugLineNum = 122617856;BA.debugLine="Sub SetPadding(p As Object) As VMField";
RDebugUtils.currentLine=122617857;
 //BA.debugLineNum = 122617857;BA.debugLine="Field.SetPaddingAll(p)";
__ref._field /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=122617858;
 //BA.debugLineNum = 122617858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122617859;
 //BA.debugLineNum = 122617859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setprimary(b4j.example.vmfield __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=122159104;
 //BA.debugLineNum = 122159104;BA.debugLine="Sub SetPrimary(b As Boolean) As VMField";
RDebugUtils.currentLine=122159105;
 //BA.debugLineNum = 122159105;BA.debugLine="Field.SetPrimary(True)";
__ref._field /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=122159106;
 //BA.debugLineNum = 122159106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122159107;
 //BA.debugLineNum = 122159107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setstyle(b4j.example.vmfield __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=122486784;
 //BA.debugLineNum = 122486784;BA.debugLine="Sub SetStyle(sm As Map) As VMField";
RDebugUtils.currentLine=122486785;
 //BA.debugLineNum = 122486785;BA.debugLine="Field.SetStyle(sm)";
__ref._field /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=122486786;
 //BA.debugLineNum = 122486786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122486787;
 //BA.debugLineNum = 122486787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _settext(b4j.example.vmfield __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=122093568;
 //BA.debugLineNum = 122093568;BA.debugLine="Sub SetText(t As Object) As VMField";
RDebugUtils.currentLine=122093569;
 //BA.debugLineNum = 122093569;BA.debugLine="Field.SetText(t)";
__ref._field /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=122093570;
 //BA.debugLineNum = 122093570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122093571;
 //BA.debugLineNum = 122093571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _settogglepassword(b4j.example.vmfield __ref,boolean _vartogglepassword) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "settogglepassword", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "settogglepassword", new Object[] {_vartogglepassword}));}
RDebugUtils.currentLine=122880000;
 //BA.debugLineNum = 122880000;BA.debugLine="Sub SetTogglePassword(varTogglePassword As Boolean";
RDebugUtils.currentLine=122880001;
 //BA.debugLineNum = 122880001;BA.debugLine="SetAttr(CreateMap(\":md-toggle-password\": varToggl";
__ref._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-toggle-password"),(Object)(_vartogglepassword)}));
RDebugUtils.currentLine=122880002;
 //BA.debugLineNum = 122880002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=122880003;
 //BA.debugLineNum = 122880003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setvif(b4j.example.vmfield __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=121831424;
 //BA.debugLineNum = 121831424;BA.debugLine="Sub SetVIf(vif As Object) As VMField";
RDebugUtils.currentLine=121831425;
 //BA.debugLineNum = 121831425;BA.debugLine="Field.SetVIf(vif)";
__ref._field /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=121831426;
 //BA.debugLineNum = 121831426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=121831427;
 //BA.debugLineNum = 121831427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setvmodel(b4j.example.vmfield __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=121765888;
 //BA.debugLineNum = 121765888;BA.debugLine="Sub SetVModel(k As String) As VMField";
RDebugUtils.currentLine=121765889;
 //BA.debugLineNum = 121765889;BA.debugLine="Field.SetVModel(k)";
__ref._field /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=121765890;
 //BA.debugLineNum = 121765890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=121765891;
 //BA.debugLineNum = 121765891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _setvshow(b4j.example.vmfield __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfield";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=121896960;
 //BA.debugLineNum = 121896960;BA.debugLine="Sub SetVShow(vif As Object) As VMField";
RDebugUtils.currentLine=121896961;
 //BA.debugLineNum = 121896961;BA.debugLine="Field.SetVShow(vif)";
__ref._field /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=121896962;
 //BA.debugLineNum = 121896962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfield)(this);
RDebugUtils.currentLine=121896963;
 //BA.debugLineNum = 121896963;BA.debugLine="End Sub";
return null;
}
}