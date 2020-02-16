package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmproperty extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmproperty", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmproperty.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _propcontrols{
public boolean IsInitialized;
public String vmodel;
public String value;
public String text;
public String typeOf;
public Object module;
public String methodName;
public String iconName;
public int MinValue;
public int MaxValue;
public String sourceName;
public anywheresoftware.b4a.objects.collections.Map options;
public String sourcefield;
public String displayfield;
public anywheresoftware.b4a.objects.collections.List OptionsList;
public void Initialize() {
IsInitialized = true;
vmodel = "";
value = "";
text = "";
typeOf = "";
module = new Object();
methodName = "";
iconName = "";
MinValue = 0;
MaxValue = 0;
sourceName = "";
options = new anywheresoftware.b4a.objects.collections.Map();
sourcefield = "";
displayfield = "";
OptionsList = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public anywheresoftware.b4a.objects.collections.Map _labels = null;
public b4j.example.vmelement _bag = null;
public b4j.example.vmlist _lst = null;
public anywheresoftware.b4a.objects.collections.Map _controls = null;
public Object _eventhandler = null;
public anywheresoftware.b4a.objects.collections.List _fields = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.List _booleans = null;
public anywheresoftware.b4a.objects.collections.List _strings = null;
public anywheresoftware.b4a.objects.collections.List _integers = null;
public anywheresoftware.b4a.objects.collections.List _doubles = null;
public anywheresoftware.b4a.objects.collections.List _dates = null;
public anywheresoftware.b4a.objects.collections.Map _defaults = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmproperty  _initialize(b4j.example.vmproperty __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,Object _module,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_module,_sid}));}
RDebugUtils.currentLine=184680448;
 //BA.debugLineNum = 184680448;BA.debugLine="Public Sub Initialize(v As BANanoVue, module As Ob";
RDebugUtils.currentLine=184680449;
 //BA.debugLineNum = 184680449;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=184680450;
 //BA.debugLineNum = 184680450;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=184680451;
 //BA.debugLineNum = 184680451;BA.debugLine="vue.SetStateSingle(\"expandProp\", True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"expandProp",(Object)(__c.True));
RDebugUtils.currentLine=184680452;
 //BA.debugLineNum = 184680452;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=184680453;
 //BA.debugLineNum = 184680453;BA.debugLine="fields.Initialize";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=184680454;
 //BA.debugLineNum = 184680454;BA.debugLine="Bag.Initialize(vue, ID)";
__ref._bag /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ );
RDebugUtils.currentLine=184680455;
 //BA.debugLineNum = 184680455;BA.debugLine="Bag.SetKey(ID,False).AddClass(\"propertybag\")";
__ref._bag /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(__ref._id /*String*/ ),__c.False)._addclass /*b4j.example.vmelement*/ (null,"propertybag");
RDebugUtils.currentLine=184680456;
 //BA.debugLineNum = 184680456;BA.debugLine="Lst.Initialize(vue, $\"${ID}list\"$,module)";
__ref._lst /*b4j.example.vmlist*/ ._initialize /*b4j.example.vmlist*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"list"),_module);
RDebugUtils.currentLine=184680457;
 //BA.debugLineNum = 184680457;BA.debugLine="Lst.SetStyle(CreateMap(\"width\": \"100%\", \"height\":";
__ref._lst /*b4j.example.vmlist*/ ._setstyle /*b4j.example.vmlist*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)("100%"),(Object)("height"),(Object)("100%")}));
RDebugUtils.currentLine=184680458;
 //BA.debugLineNum = 184680458;BA.debugLine="Lst.SetStyle(CreateMap(\"font-size\":\"14px\"))";
__ref._lst /*b4j.example.vmlist*/ ._setstyle /*b4j.example.vmlist*/ (null,__c.createMap(new Object[] {(Object)("font-size"),(Object)("14px")}));
RDebugUtils.currentLine=184680462;
 //BA.debugLineNum = 184680462;BA.debugLine="Lst.isPropertyBag = True";
__ref._lst /*b4j.example.vmlist*/ ._ispropertybag /*boolean*/  = __c.True;
RDebugUtils.currentLine=184680463;
 //BA.debugLineNum = 184680463;BA.debugLine="Lst.SetExpandSingle(\"expandProp\")";
__ref._lst /*b4j.example.vmlist*/ ._setexpandsingle /*b4j.example.vmlist*/ (null,BA.ObjectToBoolean("expandProp"));
RDebugUtils.currentLine=184680464;
 //BA.debugLineNum = 184680464;BA.debugLine="labels.Initialize";
__ref._labels /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=184680465;
 //BA.debugLineNum = 184680465;BA.debugLine="controls.Initialize";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=184680466;
 //BA.debugLineNum = 184680466;BA.debugLine="AddHeading(\"main\", \"Main\")";
__ref._addheading /*b4j.example.vmproperty*/ (null,"main","Main");
RDebugUtils.currentLine=184680467;
 //BA.debugLineNum = 184680467;BA.debugLine="Booleans.Initialize";
__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=184680468;
 //BA.debugLineNum = 184680468;BA.debugLine="Strings.Initialize";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=184680469;
 //BA.debugLineNum = 184680469;BA.debugLine="Integers.Initialize";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=184680470;
 //BA.debugLineNum = 184680470;BA.debugLine="Doubles.Initialize";
__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=184680471;
 //BA.debugLineNum = 184680471;BA.debugLine="defaults.Initialize";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=184680472;
 //BA.debugLineNum = 184680472;BA.debugLine="Dates.Initialize";
__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=184680473;
 //BA.debugLineNum = 184680473;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=184680474;
 //BA.debugLineNum = 184680474;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _addbooleans(b4j.example.vmproperty __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addbooleans", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "addbooleans", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=185008128;
 //BA.debugLineNum = 185008128;BA.debugLine="Sub AddBooleans(i As List) As VMProperty";
RDebugUtils.currentLine=185008129;
 //BA.debugLineNum = 185008129;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=185008130;
 //BA.debugLineNum = 185008130;BA.debugLine="Booleans.Add(s)";
__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=185008132;
 //BA.debugLineNum = 185008132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=185008133;
 //BA.debugLineNum = 185008133;BA.debugLine="End Sub";
return null;
}
public String  _addbutton(b4j.example.vmproperty __ref,String _parent,String _btnid,String _btntext,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addbutton", true))
	 {return ((String) Debug.delegate(ba, "addbutton", new Object[] {_parent,_btnid,_btntext,_methodname}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=185794560;
 //BA.debugLineNum = 185794560;BA.debugLine="Sub AddButton(parent As String, btnID As String, b";
RDebugUtils.currentLine=185794561;
 //BA.debugLineNum = 185794561;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=185794562;
 //BA.debugLineNum = 185794562;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=185794563;
 //BA.debugLineNum = 185794563;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185794564;
 //BA.debugLineNum = 185794564;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=185794566;
 //BA.debugLineNum = 185794566;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=185794567;
 //BA.debugLineNum = 185794567;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=185794568;
 //BA.debugLineNum = 185794568;BA.debugLine="nc.vmodel = \"\"";
_nc.vmodel /*String*/  = "";
RDebugUtils.currentLine=185794569;
 //BA.debugLineNum = 185794569;BA.debugLine="nc.text = btnText";
_nc.text /*String*/  = _btntext;
RDebugUtils.currentLine=185794570;
 //BA.debugLineNum = 185794570;BA.debugLine="nc.value = btnID";
_nc.value /*String*/  = _btnid;
RDebugUtils.currentLine=185794571;
 //BA.debugLineNum = 185794571;BA.debugLine="nc.typeOf = \"btn\"";
_nc.typeOf /*String*/  = "btn";
RDebugUtils.currentLine=185794572;
 //BA.debugLineNum = 185794572;BA.debugLine="nc.module = eventHandler";
_nc.module /*Object*/  = __ref._eventhandler /*Object*/ ;
RDebugUtils.currentLine=185794573;
 //BA.debugLineNum = 185794573;BA.debugLine="nc.methodName = methodName";
_nc.methodName /*String*/  = _methodname;
RDebugUtils.currentLine=185794574;
 //BA.debugLineNum = 185794574;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=185794575;
 //BA.debugLineNum = 185794575;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=185794576;
 //BA.debugLineNum = 185794576;BA.debugLine="End Sub";
return "";
}
public String  _addcheck(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _text,boolean _bvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addcheck", true))
	 {return ((String) Debug.delegate(ba, "addcheck", new Object[] {_parent,_vmodel,_text,_bvalue}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=186712064;
 //BA.debugLineNum = 186712064;BA.debugLine="Sub AddCheck(parent As String, vModel As String, t";
RDebugUtils.currentLine=186712065;
 //BA.debugLineNum = 186712065;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=186712066;
 //BA.debugLineNum = 186712066;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=186712067;
 //BA.debugLineNum = 186712067;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=186712068;
 //BA.debugLineNum = 186712068;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=186712070;
 //BA.debugLineNum = 186712070;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=186712071;
 //BA.debugLineNum = 186712071;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=186712072;
 //BA.debugLineNum = 186712072;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=186712073;
 //BA.debugLineNum = 186712073;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
RDebugUtils.currentLine=186712074;
 //BA.debugLineNum = 186712074;BA.debugLine="nc.value = bvalue";
_nc.value /*String*/  = BA.ObjectToString(_bvalue);
RDebugUtils.currentLine=186712075;
 //BA.debugLineNum = 186712075;BA.debugLine="nc.typeOf = \"chk\"";
_nc.typeOf /*String*/  = "chk";
RDebugUtils.currentLine=186712076;
 //BA.debugLineNum = 186712076;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=186712077;
 //BA.debugLineNum = 186712077;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=186712078;
 //BA.debugLineNum = 186712078;BA.debugLine="fields.Add(vModel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186712079;
 //BA.debugLineNum = 186712079;BA.debugLine="Booleans.Add(vModel)";
__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186712080;
 //BA.debugLineNum = 186712080;BA.debugLine="defaults.Put(vModel,bvalue)";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(_bvalue));
RDebugUtils.currentLine=186712082;
 //BA.debugLineNum = 186712082;BA.debugLine="End Sub";
return "";
}
public String  _adddatepicker(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _text,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "adddatepicker", true))
	 {return ((String) Debug.delegate(ba, "adddatepicker", new Object[] {_parent,_vmodel,_text,_vvalue}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=186777600;
 //BA.debugLineNum = 186777600;BA.debugLine="Sub AddDatePicker(parent As String, vModel As Stri";
RDebugUtils.currentLine=186777601;
 //BA.debugLineNum = 186777601;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=186777602;
 //BA.debugLineNum = 186777602;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=186777603;
 //BA.debugLineNum = 186777603;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=186777604;
 //BA.debugLineNum = 186777604;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=186777606;
 //BA.debugLineNum = 186777606;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=186777607;
 //BA.debugLineNum = 186777607;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=186777608;
 //BA.debugLineNum = 186777608;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=186777609;
 //BA.debugLineNum = 186777609;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
RDebugUtils.currentLine=186777610;
 //BA.debugLineNum = 186777610;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
RDebugUtils.currentLine=186777611;
 //BA.debugLineNum = 186777611;BA.debugLine="nc.typeOf = \"dp\"";
_nc.typeOf /*String*/  = "dp";
RDebugUtils.currentLine=186777612;
 //BA.debugLineNum = 186777612;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=186777613;
 //BA.debugLineNum = 186777613;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=186777614;
 //BA.debugLineNum = 186777614;BA.debugLine="fields.Add(vModel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186777615;
 //BA.debugLineNum = 186777615;BA.debugLine="Strings.Add(vModel)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186777616;
 //BA.debugLineNum = 186777616;BA.debugLine="defaults.Put(vModel,vValue)";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(_vvalue));
RDebugUtils.currentLine=186777617;
 //BA.debugLineNum = 186777617;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _adddates(b4j.example.vmproperty __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "adddates", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "adddates", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=185139200;
 //BA.debugLineNum = 185139200;BA.debugLine="Sub AddDates(i As List) As VMProperty";
RDebugUtils.currentLine=185139201;
 //BA.debugLineNum = 185139201;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=185139202;
 //BA.debugLineNum = 185139202;BA.debugLine="Dates.Add(s)";
__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=185139204;
 //BA.debugLineNum = 185139204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=185139205;
 //BA.debugLineNum = 185139205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _adddoubles(b4j.example.vmproperty __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "adddoubles", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "adddoubles", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=185073664;
 //BA.debugLineNum = 185073664;BA.debugLine="Sub AddDoubles(i As List) As VMProperty";
RDebugUtils.currentLine=185073665;
 //BA.debugLineNum = 185073665;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=185073666;
 //BA.debugLineNum = 185073666;BA.debugLine="Doubles.Add(s)";
__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=185073668;
 //BA.debugLineNum = 185073668;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=185073669;
 //BA.debugLineNum = 185073669;BA.debugLine="End Sub";
return null;
}
public String  _addemail(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addemail", true))
	 {return ((String) Debug.delegate(ba, "addemail", new Object[] {_parent,_vmodel,_vtext,_vicon,_vvalue}));}
RDebugUtils.currentLine=186515456;
 //BA.debugLineNum = 186515456;BA.debugLine="Sub AddEmail(parent As String, vModel As String, v";
RDebugUtils.currentLine=186515457;
 //BA.debugLineNum = 186515457;BA.debugLine="AddInput(parent, \"email\", vModel, vText, vIcon, v";
__ref._addinput /*String*/ (null,_parent,"email",_vmodel,_vtext,_vicon,_vvalue);
RDebugUtils.currentLine=186515458;
 //BA.debugLineNum = 186515458;BA.debugLine="Strings.Add(vModel)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186515459;
 //BA.debugLineNum = 186515459;BA.debugLine="End Sub";
return "";
}
public String  _addinput(b4j.example.vmproperty __ref,String _parent,String _typeof,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addinput", true))
	 {return ((String) Debug.delegate(ba, "addinput", new Object[] {_parent,_typeof,_vmodel,_vtext,_vicon,_vvalue}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=186580992;
 //BA.debugLineNum = 186580992;BA.debugLine="private Sub AddInput(parent As String, typeOf As S";
RDebugUtils.currentLine=186580993;
 //BA.debugLineNum = 186580993;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=186580994;
 //BA.debugLineNum = 186580994;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=186580995;
 //BA.debugLineNum = 186580995;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=186580996;
 //BA.debugLineNum = 186580996;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=186580998;
 //BA.debugLineNum = 186580998;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=186580999;
 //BA.debugLineNum = 186580999;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=186581000;
 //BA.debugLineNum = 186581000;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=186581001;
 //BA.debugLineNum = 186581001;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
RDebugUtils.currentLine=186581002;
 //BA.debugLineNum = 186581002;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
RDebugUtils.currentLine=186581003;
 //BA.debugLineNum = 186581003;BA.debugLine="nc.typeOf = typeOf";
_nc.typeOf /*String*/  = _typeof;
RDebugUtils.currentLine=186581004;
 //BA.debugLineNum = 186581004;BA.debugLine="nc.iconName = vIcon";
_nc.iconName /*String*/  = _vicon;
RDebugUtils.currentLine=186581005;
 //BA.debugLineNum = 186581005;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=186581006;
 //BA.debugLineNum = 186581006;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=186581007;
 //BA.debugLineNum = 186581007;BA.debugLine="fields.Add(vModel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186581008;
 //BA.debugLineNum = 186581008;BA.debugLine="defaults.Put(vModel,vValue)";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(_vvalue));
RDebugUtils.currentLine=186581009;
 //BA.debugLineNum = 186581009;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addheading(b4j.example.vmproperty __ref,String _sectname,String _sectheading) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addheading", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "addheading", new Object[] {_sectname,_sectheading}));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=186056704;
 //BA.debugLineNum = 186056704;BA.debugLine="Sub AddHeading(sectName As String, sectHeading As";
RDebugUtils.currentLine=186056705;
 //BA.debugLineNum = 186056705;BA.debugLine="sectName = sectName.tolowercase";
_sectname = _sectname.toLowerCase();
RDebugUtils.currentLine=186056706;
 //BA.debugLineNum = 186056706;BA.debugLine="labels.Put(sectName, sectHeading)";
__ref._labels /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_sectname),(Object)(_sectheading));
RDebugUtils.currentLine=186056708;
 //BA.debugLineNum = 186056708;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=186056709;
 //BA.debugLineNum = 186056709;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=186056710;
 //BA.debugLineNum = 186056710;BA.debugLine="controls.Put(sectName, items)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_sectname),(Object)(_items.getObject()));
RDebugUtils.currentLine=186056711;
 //BA.debugLineNum = 186056711;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=186056712;
 //BA.debugLineNum = 186056712;BA.debugLine="End Sub";
return null;
}
public String  _addiconbutton(b4j.example.vmproperty __ref,String _parent,String _btnid,String _btnicon,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addiconbutton", true))
	 {return ((String) Debug.delegate(ba, "addiconbutton", new Object[] {_parent,_btnid,_btnicon,_methodname}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=186187776;
 //BA.debugLineNum = 186187776;BA.debugLine="Sub AddIconButton(parent As String, btnID As Strin";
RDebugUtils.currentLine=186187777;
 //BA.debugLineNum = 186187777;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=186187778;
 //BA.debugLineNum = 186187778;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=186187779;
 //BA.debugLineNum = 186187779;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=186187780;
 //BA.debugLineNum = 186187780;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=186187782;
 //BA.debugLineNum = 186187782;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=186187783;
 //BA.debugLineNum = 186187783;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=186187784;
 //BA.debugLineNum = 186187784;BA.debugLine="nc.iconName = btnIcon";
_nc.iconName /*String*/  = _btnicon;
RDebugUtils.currentLine=186187785;
 //BA.debugLineNum = 186187785;BA.debugLine="nc.value = btnID";
_nc.value /*String*/  = _btnid;
RDebugUtils.currentLine=186187786;
 //BA.debugLineNum = 186187786;BA.debugLine="nc.typeOf = \"btnicon\"";
_nc.typeOf /*String*/  = "btnicon";
RDebugUtils.currentLine=186187787;
 //BA.debugLineNum = 186187787;BA.debugLine="nc.module = eventHandler";
_nc.module /*Object*/  = __ref._eventhandler /*Object*/ ;
RDebugUtils.currentLine=186187788;
 //BA.debugLineNum = 186187788;BA.debugLine="nc.methodName = methodName";
_nc.methodName /*String*/  = _methodname;
RDebugUtils.currentLine=186187789;
 //BA.debugLineNum = 186187789;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=186187790;
 //BA.debugLineNum = 186187790;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=186187791;
 //BA.debugLineNum = 186187791;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addintegers(b4j.example.vmproperty __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addintegers", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "addintegers", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=184877056;
 //BA.debugLineNum = 184877056;BA.debugLine="Sub AddIntegers(i As List) As VMProperty";
RDebugUtils.currentLine=184877057;
 //BA.debugLineNum = 184877057;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=184877058;
 //BA.debugLineNum = 184877058;BA.debugLine="Integers.Add(s)";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=184877060;
 //BA.debugLineNum = 184877060;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=184877061;
 //BA.debugLineNum = 184877061;BA.debugLine="End Sub";
return null;
}
public String  _addlabel(b4j.example.vmproperty __ref,String _parent,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addlabel", true))
	 {return ((String) Debug.delegate(ba, "addlabel", new Object[] {_parent,_txt}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=185991168;
 //BA.debugLineNum = 185991168;BA.debugLine="Sub AddLabel(parent As String, txt As String)";
RDebugUtils.currentLine=185991169;
 //BA.debugLineNum = 185991169;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=185991170;
 //BA.debugLineNum = 185991170;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=185991171;
 //BA.debugLineNum = 185991171;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185991172;
 //BA.debugLineNum = 185991172;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=185991174;
 //BA.debugLineNum = 185991174;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=185991175;
 //BA.debugLineNum = 185991175;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=185991176;
 //BA.debugLineNum = 185991176;BA.debugLine="nc.vmodel = \"\"";
_nc.vmodel /*String*/  = "";
RDebugUtils.currentLine=185991177;
 //BA.debugLineNum = 185991177;BA.debugLine="nc.text = txt";
_nc.text /*String*/  = _txt;
RDebugUtils.currentLine=185991178;
 //BA.debugLineNum = 185991178;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
RDebugUtils.currentLine=185991179;
 //BA.debugLineNum = 185991179;BA.debugLine="nc.typeOf = \"lbl\"";
_nc.typeOf /*String*/  = "lbl";
RDebugUtils.currentLine=185991180;
 //BA.debugLineNum = 185991180;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=185991181;
 //BA.debugLineNum = 185991181;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=185991182;
 //BA.debugLineNum = 185991182;BA.debugLine="End Sub";
return "";
}
public String  _addnumber(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addnumber", true))
	 {return ((String) Debug.delegate(ba, "addnumber", new Object[] {_parent,_vmodel,_vtext,_vicon,_vvalue}));}
RDebugUtils.currentLine=186449920;
 //BA.debugLineNum = 186449920;BA.debugLine="Sub AddNumber(parent As String, vModel As String,";
RDebugUtils.currentLine=186449921;
 //BA.debugLineNum = 186449921;BA.debugLine="AddInput(parent, \"number\", vModel, vText, vIcon,";
__ref._addinput /*String*/ (null,_parent,"number",_vmodel,_vtext,_vicon,_vvalue);
RDebugUtils.currentLine=186449922;
 //BA.debugLineNum = 186449922;BA.debugLine="Integers.Add(vModel)";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186449923;
 //BA.debugLineNum = 186449923;BA.debugLine="End Sub";
return "";
}
public String  _addnumberinput(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addnumberinput", true))
	 {return ((String) Debug.delegate(ba, "addnumberinput", new Object[] {_parent,_vmodel,_label,_minvalue,_maxvalue,_value}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=185925632;
 //BA.debugLineNum = 185925632;BA.debugLine="Sub AddNumberInput(parent As String, vmodel As Str";
RDebugUtils.currentLine=185925633;
 //BA.debugLineNum = 185925633;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=185925634;
 //BA.debugLineNum = 185925634;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=185925635;
 //BA.debugLineNum = 185925635;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185925636;
 //BA.debugLineNum = 185925636;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=185925638;
 //BA.debugLineNum = 185925638;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=185925639;
 //BA.debugLineNum = 185925639;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=185925640;
 //BA.debugLineNum = 185925640;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=185925641;
 //BA.debugLineNum = 185925641;BA.debugLine="nc.text = Label";
_nc.text /*String*/  = _label;
RDebugUtils.currentLine=185925642;
 //BA.debugLineNum = 185925642;BA.debugLine="nc.value = value";
_nc.value /*String*/  = BA.NumberToString(_value);
RDebugUtils.currentLine=185925643;
 //BA.debugLineNum = 185925643;BA.debugLine="nc.typeOf = \"numberinput\"";
_nc.typeOf /*String*/  = "numberinput";
RDebugUtils.currentLine=185925644;
 //BA.debugLineNum = 185925644;BA.debugLine="nc.MinValue = minValue";
_nc.MinValue /*int*/  = _minvalue;
RDebugUtils.currentLine=185925645;
 //BA.debugLineNum = 185925645;BA.debugLine="nc.MaxValue = maxValue";
_nc.MaxValue /*int*/  = _maxvalue;
RDebugUtils.currentLine=185925646;
 //BA.debugLineNum = 185925646;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=185925647;
 //BA.debugLineNum = 185925647;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=185925648;
 //BA.debugLineNum = 185925648;BA.debugLine="fields.Add(vmodel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=185925649;
 //BA.debugLineNum = 185925649;BA.debugLine="Integers.Add(vmodel)";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=185925650;
 //BA.debugLineNum = 185925650;BA.debugLine="defaults.Put(vmodel,value)";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(_value));
RDebugUtils.currentLine=185925651;
 //BA.debugLineNum = 185925651;BA.debugLine="End Sub";
return "";
}
public String  _addpassword(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _vtext,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addpassword", true))
	 {return ((String) Debug.delegate(ba, "addpassword", new Object[] {_parent,_vmodel,_vtext,_vvalue}));}
RDebugUtils.currentLine=186253312;
 //BA.debugLineNum = 186253312;BA.debugLine="Sub AddPassword(parent As String, vModel As String";
RDebugUtils.currentLine=186253313;
 //BA.debugLineNum = 186253313;BA.debugLine="AddInput(parent, \"password\", vModel, vText, \"\", v";
__ref._addinput /*String*/ (null,_parent,"password",_vmodel,_vtext,"",_vvalue);
RDebugUtils.currentLine=186253314;
 //BA.debugLineNum = 186253314;BA.debugLine="Strings.Add(vModel)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186253315;
 //BA.debugLineNum = 186253315;BA.debugLine="End Sub";
return "";
}
public String  _addradiogroup(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _vtext,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addradiogroup", true))
	 {return ((String) Debug.delegate(ba, "addradiogroup", new Object[] {_parent,_vmodel,_vtext,_sourcename,_options,_sourcefield,_displayfield}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=186908672;
 //BA.debugLineNum = 186908672;BA.debugLine="Sub AddRadioGroup(parent As String, vmodel As Stri";
RDebugUtils.currentLine=186908673;
 //BA.debugLineNum = 186908673;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=186908674;
 //BA.debugLineNum = 186908674;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=186908675;
 //BA.debugLineNum = 186908675;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=186908676;
 //BA.debugLineNum = 186908676;BA.debugLine="If controls.ContainsKey(parent) Then";
if (__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_parent))) { 
RDebugUtils.currentLine=186908677;
 //BA.debugLineNum = 186908677;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
 }else {
RDebugUtils.currentLine=186908679;
 //BA.debugLineNum = 186908679;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
RDebugUtils.currentLine=186908682;
 //BA.debugLineNum = 186908682;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=186908683;
 //BA.debugLineNum = 186908683;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=186908684;
 //BA.debugLineNum = 186908684;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=186908685;
 //BA.debugLineNum = 186908685;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
RDebugUtils.currentLine=186908686;
 //BA.debugLineNum = 186908686;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
RDebugUtils.currentLine=186908687;
 //BA.debugLineNum = 186908687;BA.debugLine="nc.typeOf = \"radiogroup\"";
_nc.typeOf /*String*/  = "radiogroup";
RDebugUtils.currentLine=186908688;
 //BA.debugLineNum = 186908688;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
RDebugUtils.currentLine=186908689;
 //BA.debugLineNum = 186908689;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
RDebugUtils.currentLine=186908690;
 //BA.debugLineNum = 186908690;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
RDebugUtils.currentLine=186908691;
 //BA.debugLineNum = 186908691;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
RDebugUtils.currentLine=186908692;
 //BA.debugLineNum = 186908692;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=186908693;
 //BA.debugLineNum = 186908693;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=186908694;
 //BA.debugLineNum = 186908694;BA.debugLine="fields.Add(vmodel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186908695;
 //BA.debugLineNum = 186908695;BA.debugLine="Strings.Add(vmodel)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186908696;
 //BA.debugLineNum = 186908696;BA.debugLine="defaults.Put(vmodel,\"\")";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(""));
RDebugUtils.currentLine=186908697;
 //BA.debugLineNum = 186908697;BA.debugLine="End Sub";
return "";
}
public String  _addselect(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _vtext,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addselect", true))
	 {return ((String) Debug.delegate(ba, "addselect", new Object[] {_parent,_vmodel,_vtext,_sourcename,_options,_sourcefield,_displayfield}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=185401344;
 //BA.debugLineNum = 185401344;BA.debugLine="Sub AddSelect(parent As String, vmodel As String,";
RDebugUtils.currentLine=185401345;
 //BA.debugLineNum = 185401345;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=185401346;
 //BA.debugLineNum = 185401346;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=185401347;
 //BA.debugLineNum = 185401347;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185401348;
 //BA.debugLineNum = 185401348;BA.debugLine="If controls.ContainsKey(parent) Then";
if (__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_parent))) { 
RDebugUtils.currentLine=185401349;
 //BA.debugLineNum = 185401349;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
 }else {
RDebugUtils.currentLine=185401351;
 //BA.debugLineNum = 185401351;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
RDebugUtils.currentLine=185401354;
 //BA.debugLineNum = 185401354;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=185401355;
 //BA.debugLineNum = 185401355;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=185401356;
 //BA.debugLineNum = 185401356;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=185401357;
 //BA.debugLineNum = 185401357;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
RDebugUtils.currentLine=185401358;
 //BA.debugLineNum = 185401358;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
RDebugUtils.currentLine=185401359;
 //BA.debugLineNum = 185401359;BA.debugLine="nc.typeOf = \"select\"";
_nc.typeOf /*String*/  = "select";
RDebugUtils.currentLine=185401360;
 //BA.debugLineNum = 185401360;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
RDebugUtils.currentLine=185401361;
 //BA.debugLineNum = 185401361;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
RDebugUtils.currentLine=185401362;
 //BA.debugLineNum = 185401362;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
RDebugUtils.currentLine=185401363;
 //BA.debugLineNum = 185401363;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
RDebugUtils.currentLine=185401364;
 //BA.debugLineNum = 185401364;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=185401365;
 //BA.debugLineNum = 185401365;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=185401366;
 //BA.debugLineNum = 185401366;BA.debugLine="fields.Add(vmodel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=185401367;
 //BA.debugLineNum = 185401367;BA.debugLine="Strings.Add(vmodel)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=185401368;
 //BA.debugLineNum = 185401368;BA.debugLine="defaults.Put(vmodel,\"\")";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(""));
RDebugUtils.currentLine=185401369;
 //BA.debugLineNum = 185401369;BA.debugLine="End Sub";
return "";
}
public String  _addslider(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addslider", true))
	 {return ((String) Debug.delegate(ba, "addslider", new Object[] {_parent,_vmodel,_label,_minvalue,_maxvalue,_value}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=185860096;
 //BA.debugLineNum = 185860096;BA.debugLine="Sub AddSlider(parent As String, vmodel As String,";
RDebugUtils.currentLine=185860097;
 //BA.debugLineNum = 185860097;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=185860098;
 //BA.debugLineNum = 185860098;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=185860099;
 //BA.debugLineNum = 185860099;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185860100;
 //BA.debugLineNum = 185860100;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=185860102;
 //BA.debugLineNum = 185860102;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=185860103;
 //BA.debugLineNum = 185860103;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=185860104;
 //BA.debugLineNum = 185860104;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=185860105;
 //BA.debugLineNum = 185860105;BA.debugLine="nc.text = Label";
_nc.text /*String*/  = _label;
RDebugUtils.currentLine=185860106;
 //BA.debugLineNum = 185860106;BA.debugLine="nc.value = value";
_nc.value /*String*/  = BA.NumberToString(_value);
RDebugUtils.currentLine=185860107;
 //BA.debugLineNum = 185860107;BA.debugLine="nc.typeOf = \"slider\"";
_nc.typeOf /*String*/  = "slider";
RDebugUtils.currentLine=185860108;
 //BA.debugLineNum = 185860108;BA.debugLine="nc.MinValue = minValue";
_nc.MinValue /*int*/  = _minvalue;
RDebugUtils.currentLine=185860109;
 //BA.debugLineNum = 185860109;BA.debugLine="nc.MaxValue = maxValue";
_nc.MaxValue /*int*/  = _maxvalue;
RDebugUtils.currentLine=185860110;
 //BA.debugLineNum = 185860110;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=185860111;
 //BA.debugLineNum = 185860111;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=185860112;
 //BA.debugLineNum = 185860112;BA.debugLine="fields.Add(vmodel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=185860113;
 //BA.debugLineNum = 185860113;BA.debugLine="Integers.Add(vmodel)";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=185860114;
 //BA.debugLineNum = 185860114;BA.debugLine="defaults.Put(vmodel,value)";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(_value));
RDebugUtils.currentLine=185860115;
 //BA.debugLineNum = 185860115;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addstrings(b4j.example.vmproperty __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addstrings", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "addstrings", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=184942592;
 //BA.debugLineNum = 184942592;BA.debugLine="Sub AddStrings(i As List) As VMProperty";
RDebugUtils.currentLine=184942593;
 //BA.debugLineNum = 184942593;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=184942594;
 //BA.debugLineNum = 184942594;BA.debugLine="Strings.Add(s)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=184942596;
 //BA.debugLineNum = 184942596;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=184942597;
 //BA.debugLineNum = 184942597;BA.debugLine="End Sub";
return null;
}
public String  _addswitch(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _text,boolean _bvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addswitch", true))
	 {return ((String) Debug.delegate(ba, "addswitch", new Object[] {_parent,_vmodel,_text,_bvalue}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=186122240;
 //BA.debugLineNum = 186122240;BA.debugLine="Sub AddSwitch(parent As String, vModel As String,";
RDebugUtils.currentLine=186122241;
 //BA.debugLineNum = 186122241;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=186122242;
 //BA.debugLineNum = 186122242;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=186122243;
 //BA.debugLineNum = 186122243;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=186122244;
 //BA.debugLineNum = 186122244;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=186122246;
 //BA.debugLineNum = 186122246;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=186122247;
 //BA.debugLineNum = 186122247;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=186122248;
 //BA.debugLineNum = 186122248;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=186122249;
 //BA.debugLineNum = 186122249;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
RDebugUtils.currentLine=186122250;
 //BA.debugLineNum = 186122250;BA.debugLine="nc.value = bValue";
_nc.value /*String*/  = BA.ObjectToString(_bvalue);
RDebugUtils.currentLine=186122251;
 //BA.debugLineNum = 186122251;BA.debugLine="nc.typeOf = \"swt\"";
_nc.typeOf /*String*/  = "swt";
RDebugUtils.currentLine=186122252;
 //BA.debugLineNum = 186122252;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=186122253;
 //BA.debugLineNum = 186122253;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=186122254;
 //BA.debugLineNum = 186122254;BA.debugLine="fields.Add(vModel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186122255;
 //BA.debugLineNum = 186122255;BA.debugLine="Booleans.Add(vModel)";
__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186122256;
 //BA.debugLineNum = 186122256;BA.debugLine="defaults.Put(vModel,bValue)";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(_bvalue));
RDebugUtils.currentLine=186122257;
 //BA.debugLineNum = 186122257;BA.debugLine="End Sub";
return "";
}
public String  _addtel(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addtel", true))
	 {return ((String) Debug.delegate(ba, "addtel", new Object[] {_parent,_vmodel,_vtext,_vicon,_vvalue}));}
RDebugUtils.currentLine=186384384;
 //BA.debugLineNum = 186384384;BA.debugLine="Sub AddTel(parent As String, vModel As String, vTe";
RDebugUtils.currentLine=186384385;
 //BA.debugLineNum = 186384385;BA.debugLine="AddInput(parent, \"tel\", vModel, vText, vIcon, vVa";
__ref._addinput /*String*/ (null,_parent,"tel",_vmodel,_vtext,_vicon,_vvalue);
RDebugUtils.currentLine=186384386;
 //BA.debugLineNum = 186384386;BA.debugLine="Integers.add(vModel)";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186384387;
 //BA.debugLineNum = 186384387;BA.debugLine="End Sub";
return "";
}
public String  _addtext(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addtext", true))
	 {return ((String) Debug.delegate(ba, "addtext", new Object[] {_parent,_vmodel,_vtext,_vicon,_vvalue}));}
RDebugUtils.currentLine=186318848;
 //BA.debugLineNum = 186318848;BA.debugLine="Sub AddText(parent As String, vModel As String, vT";
RDebugUtils.currentLine=186318849;
 //BA.debugLineNum = 186318849;BA.debugLine="AddInput(parent, \"text\", vModel, vText, vIcon, vV";
__ref._addinput /*String*/ (null,_parent,"text",_vmodel,_vtext,_vicon,_vvalue);
RDebugUtils.currentLine=186318850;
 //BA.debugLineNum = 186318850;BA.debugLine="Strings.add(vModel)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186318851;
 //BA.debugLineNum = 186318851;BA.debugLine="End Sub";
return "";
}
public String  _addtextarea(b4j.example.vmproperty __ref,String _parent,String _vmodel,String _text,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "addtextarea", true))
	 {return ((String) Debug.delegate(ba, "addtextarea", new Object[] {_parent,_vmodel,_text,_vvalue}));}
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
RDebugUtils.currentLine=186843136;
 //BA.debugLineNum = 186843136;BA.debugLine="Sub AddTextArea(parent As String, vModel As String";
RDebugUtils.currentLine=186843137;
 //BA.debugLineNum = 186843137;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
RDebugUtils.currentLine=186843138;
 //BA.debugLineNum = 186843138;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
RDebugUtils.currentLine=186843139;
 //BA.debugLineNum = 186843139;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=186843140;
 //BA.debugLineNum = 186843140;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent))));
RDebugUtils.currentLine=186843142;
 //BA.debugLineNum = 186843142;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
RDebugUtils.currentLine=186843143;
 //BA.debugLineNum = 186843143;BA.debugLine="nc.Initialize";
_nc.Initialize();
RDebugUtils.currentLine=186843144;
 //BA.debugLineNum = 186843144;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
RDebugUtils.currentLine=186843145;
 //BA.debugLineNum = 186843145;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
RDebugUtils.currentLine=186843146;
 //BA.debugLineNum = 186843146;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
RDebugUtils.currentLine=186843147;
 //BA.debugLineNum = 186843147;BA.debugLine="nc.typeOf = \"textarea\"";
_nc.typeOf /*String*/  = "textarea";
RDebugUtils.currentLine=186843148;
 //BA.debugLineNum = 186843148;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
RDebugUtils.currentLine=186843149;
 //BA.debugLineNum = 186843149;BA.debugLine="controls.Put(parent, existing)";
__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_parent),(Object)(_existing.getObject()));
RDebugUtils.currentLine=186843150;
 //BA.debugLineNum = 186843150;BA.debugLine="fields.Add(vModel)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186843151;
 //BA.debugLineNum = 186843151;BA.debugLine="Strings.Add(vModel)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_vmodel));
RDebugUtils.currentLine=186843152;
 //BA.debugLineNum = 186843152;BA.debugLine="defaults.Put(vModel,vValue)";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vmodel),(Object)(_vvalue));
RDebugUtils.currentLine=186843154;
 //BA.debugLineNum = 186843154;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmproperty __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
RDebugUtils.currentLine=184614912;
 //BA.debugLineNum = 184614912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=184614913;
 //BA.debugLineNum = 184614913;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=184614914;
 //BA.debugLineNum = 184614914;BA.debugLine="Public vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=184614915;
 //BA.debugLineNum = 184614915;BA.debugLine="Private labels As Map";
_labels = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184614916;
 //BA.debugLineNum = 184614916;BA.debugLine="Private Bag As VMElement";
_bag = new b4j.example.vmelement();
RDebugUtils.currentLine=184614917;
 //BA.debugLineNum = 184614917;BA.debugLine="Private Lst As VMList";
_lst = new b4j.example.vmlist();
RDebugUtils.currentLine=184614918;
 //BA.debugLineNum = 184614918;BA.debugLine="Type PropControls(vmodel As String, value As Stri";
;
RDebugUtils.currentLine=184614921;
 //BA.debugLineNum = 184614921;BA.debugLine="Dim controls As Map";
_controls = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184614922;
 //BA.debugLineNum = 184614922;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
RDebugUtils.currentLine=184614923;
 //BA.debugLineNum = 184614923;BA.debugLine="Private fields As List";
_fields = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184614924;
 //BA.debugLineNum = 184614924;BA.debugLine="Private BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=184614925;
 //BA.debugLineNum = 184614925;BA.debugLine="Private Booleans As List";
_booleans = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184614926;
 //BA.debugLineNum = 184614926;BA.debugLine="Private Strings As List";
_strings = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184614927;
 //BA.debugLineNum = 184614927;BA.debugLine="Private Integers As List";
_integers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184614928;
 //BA.debugLineNum = 184614928;BA.debugLine="Private Doubles As List";
_doubles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184614929;
 //BA.debugLineNum = 184614929;BA.debugLine="Private Dates As List";
_dates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184614930;
 //BA.debugLineNum = 184614930;BA.debugLine="Private defaults As Map";
_defaults = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184614931;
 //BA.debugLineNum = 184614931;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.vmproperty __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
String _k = "";
RDebugUtils.currentLine=185663488;
 //BA.debugLineNum = 185663488;BA.debugLine="Sub Clear";
RDebugUtils.currentLine=185663489;
 //BA.debugLineNum = 185663489;BA.debugLine="For Each k As String In fields";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._fields /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=185663490;
 //BA.debugLineNum = 185663490;BA.debugLine="vue.SetStateSingle(k, Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_k,__c.Null);
 }
};
RDebugUtils.currentLine=185663492;
 //BA.debugLineNum = 185663492;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _expanditem(b4j.example.vmproperty __ref,String _sid,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "expanditem", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "expanditem", new Object[] {_sid,_b}));}
RDebugUtils.currentLine=184745984;
 //BA.debugLineNum = 184745984;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VMP";
RDebugUtils.currentLine=184745985;
 //BA.debugLineNum = 184745985;BA.debugLine="Lst.ExpandItem(sid, b)";
__ref._lst /*b4j.example.vmlist*/ ._expanditem /*b4j.example.vmlist*/ (null,_sid,_b);
RDebugUtils.currentLine=184745986;
 //BA.debugLineNum = 184745986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=184745987;
 //BA.debugLineNum = 184745987;BA.debugLine="End Sub";
return null;
}
public String  _getcode(b4j.example.vmproperty __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "getcode", true))
	 {return ((String) Debug.delegate(ba, "getcode", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _items = null;
b4j.example.vmproperty._propcontrols _item = null;
RDebugUtils.currentLine=187039744;
 //BA.debugLineNum = 187039744;BA.debugLine="Sub GetCode As String";
RDebugUtils.currentLine=187039745;
 //BA.debugLineNum = 187039745;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=187039746;
 //BA.debugLineNum = 187039746;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=187039748;
 //BA.debugLineNum = 187039748;BA.debugLine="For Each k As String In controls.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=187039749;
 //BA.debugLineNum = 187039749;BA.debugLine="Dim items As List = controls.Get(k)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k))));
RDebugUtils.currentLine=187039750;
 //BA.debugLineNum = 187039750;BA.debugLine="For Each item As PropControls In items";
{
final anywheresoftware.b4a.BA.IterableList group5 = _items;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_item = (b4j.example.vmproperty._propcontrols)(group5.Get(index5));
RDebugUtils.currentLine=187039751;
 //BA.debugLineNum = 187039751;BA.debugLine="Select Case item.typeOf";
switch (BA.switchObjectToInt(_item.typeOf /*String*/ ,"number","text","email","password","dp","textarea","chk","swt","rad","slider","tel","select","autocomplete")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=187039753;
 //BA.debugLineNum = 187039753;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
_sb.Append(("Dim s"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As String = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
case 6: 
case 7: {
RDebugUtils.currentLine=187039755;
 //BA.debugLineNum = 187039755;BA.debugLine="sb.Append($\"Dim b${item.vmodel} As Boolean =";
_sb.Append(("Dim b"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As Boolean = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
case 8: {
RDebugUtils.currentLine=187039757;
 //BA.debugLineNum = 187039757;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
_sb.Append(("Dim s"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As String = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
case 9: 
case 10: {
RDebugUtils.currentLine=187039759;
 //BA.debugLineNum = 187039759;BA.debugLine="sb.Append($\"Dim i${item.vmodel} As Int = rec.";
_sb.Append(("Dim i"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As Int = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
case 11: 
case 12: {
RDebugUtils.currentLine=187039761;
 //BA.debugLineNum = 187039761;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
_sb.Append(("Dim s"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As String = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
}
;
 }
};
 }
};
RDebugUtils.currentLine=187039765;
 //BA.debugLineNum = 187039765;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=187039766;
 //BA.debugLineNum = 187039766;BA.debugLine="End Sub";
return "";
}
public String  _getjson(b4j.example.vmproperty __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "getjson", true))
	 {return ((String) Debug.delegate(ba, "getjson", null));}
anywheresoftware.b4a.objects.collections.Map _them = null;
String _sjson = "";
RDebugUtils.currentLine=185729024;
 //BA.debugLineNum = 185729024;BA.debugLine="Sub getJSON As String";
RDebugUtils.currentLine=185729025;
 //BA.debugLineNum = 185729025;BA.debugLine="Dim them As Map = getProperties";
_them = new anywheresoftware.b4a.objects.collections.Map();
_them = __ref._getproperties /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=185729026;
 //BA.debugLineNum = 185729026;BA.debugLine="Dim sjson As String = BANano.ToJson(them)";
_sjson = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(_them.getObject())));
RDebugUtils.currentLine=185729027;
 //BA.debugLineNum = 185729027;BA.debugLine="Return sjson";
if (true) return _sjson;
RDebugUtils.currentLine=185729028;
 //BA.debugLineNum = 185729028;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getproperties(b4j.example.vmproperty __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "getproperties", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getproperties", null));}
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=185597952;
 //BA.debugLineNum = 185597952;BA.debugLine="Sub getProperties As Map";
RDebugUtils.currentLine=185597953;
 //BA.debugLineNum = 185597953;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
RDebugUtils.currentLine=185597954;
 //BA.debugLineNum = 185597954;BA.debugLine="For Each k As String In fields";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._fields /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=185597955;
 //BA.debugLineNum = 185597955;BA.debugLine="Dim v As Object = vue.GetState(k, \"\")";
_v = __ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,_k,(Object)(""));
RDebugUtils.currentLine=185597956;
 //BA.debugLineNum = 185597956;BA.debugLine="If v = BANano.UNDEFINED Then v = \"\"";
if ((_v).equals(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_v = (Object)("");};
RDebugUtils.currentLine=185597957;
 //BA.debugLineNum = 185597957;BA.debugLine="rec.Put(k, v)";
_rec.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=185597959;
 //BA.debugLineNum = 185597959;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(rec, Bo";
if (__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makeboolean /*String*/ (null,_rec,__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185597960;
 //BA.debugLineNum = 185597960;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(rec, Doub";
if (__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makedouble /*String*/ (null,_rec,__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185597961;
 //BA.debugLineNum = 185597961;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(rec, In";
if (__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makeinteger /*String*/ (null,_rec,__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185597962;
 //BA.debugLineNum = 185597962;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(rec, String";
if (__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._maketrim /*String*/ (null,_rec,__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185597963;
 //BA.debugLineNum = 185597963;BA.debugLine="Return rec";
if (true) return _rec;
RDebugUtils.currentLine=185597964;
 //BA.debugLineNum = 185597964;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmproperty __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=187170816;
 //BA.debugLineNum = 187170816;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=187170817;
 //BA.debugLineNum = 187170817;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=187170818;
 //BA.debugLineNum = 187170818;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmproperty __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.List _items = null;
b4j.example.vmproperty._propcontrols _item = null;
b4j.example.vmlistitem _lix = null;
b4j.example.vmlist _childlist = null;
RDebugUtils.currentLine=186974208;
 //BA.debugLineNum = 186974208;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=186974210;
 //BA.debugLineNum = 186974210;BA.debugLine="For Each k As String In labels.keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._labels /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=186974211;
 //BA.debugLineNum = 186974211;BA.debugLine="Dim v As String = labels.Get(k)";
_v = BA.ObjectToString(__ref._labels /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
RDebugUtils.currentLine=186974212;
 //BA.debugLineNum = 186974212;BA.debugLine="Dim items As List = controls.Get(k)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k))));
RDebugUtils.currentLine=186974213;
 //BA.debugLineNum = 186974213;BA.debugLine="Select Case k";
switch (BA.switchObjectToInt(_k,"main")) {
case 0: {
RDebugUtils.currentLine=186974215;
 //BA.debugLineNum = 186974215;BA.debugLine="For Each item As PropControls In items";
{
final anywheresoftware.b4a.BA.IterableList group6 = _items;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_item = (b4j.example.vmproperty._propcontrols)(group6.Get(index6));
RDebugUtils.currentLine=186974216;
 //BA.debugLineNum = 186974216;BA.debugLine="Select Case item.typeOf";
switch (BA.switchObjectToInt(_item.typeOf /*String*/ ,"number","text","tel","email","password","chk","swt","rad","dp","btn","btnicon","textarea","slider","numberinput","select","autocomplete","lbl")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
RDebugUtils.currentLine=186974218;
 //BA.debugLineNum = 186974218;BA.debugLine="Lst.AddInput(item.typeOf, item.vmodel, item.t";
__ref._lst /*b4j.example.vmlist*/ ._addinput /*String*/ (null,_item.typeOf /*String*/ ,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.iconName /*String*/ ,_item.value /*String*/ );
 break; }
case 5: {
RDebugUtils.currentLine=186974220;
 //BA.debugLineNum = 186974220;BA.debugLine="Lst.AddCheckBox(item.vmodel, item.value, item";
__ref._lst /*b4j.example.vmlist*/ ._addcheckbox /*String*/ (null,_item.vmodel /*String*/ ,BA.ObjectToBoolean(_item.value /*String*/ ),_item.text /*String*/ ,__c.True);
 break; }
case 6: {
RDebugUtils.currentLine=186974222;
 //BA.debugLineNum = 186974222;BA.debugLine="Lst.addswitch(item.vmodel, item.text, True, i";
__ref._lst /*b4j.example.vmlist*/ ._addswitch /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,__c.True,BA.ObjectToBoolean(_item.value /*String*/ ));
 break; }
case 7: {
RDebugUtils.currentLine=186974224;
 //BA.debugLineNum = 186974224;BA.debugLine="Lst.AddRadio(item.vmodel, item.value, item.te";
__ref._lst /*b4j.example.vmlist*/ ._addradio /*String*/ (null,_item.vmodel /*String*/ ,_item.value /*String*/ ,_item.text /*String*/ ,__c.True,__c.False);
 break; }
case 8: {
RDebugUtils.currentLine=186974226;
 //BA.debugLineNum = 186974226;BA.debugLine="Lst.AddDatePicker(item.vmodel, item.text, ite";
__ref._lst /*b4j.example.vmlist*/ ._adddatepicker /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.value /*String*/ );
 break; }
case 9: {
RDebugUtils.currentLine=186974228;
 //BA.debugLineNum = 186974228;BA.debugLine="Lst.AddButton(item.value, item.text)";
__ref._lst /*b4j.example.vmlist*/ ._addbutton /*String*/ (null,_item.value /*String*/ ,_item.text /*String*/ );
 break; }
case 10: {
RDebugUtils.currentLine=186974230;
 //BA.debugLineNum = 186974230;BA.debugLine="Lst.AddIconButton(item.value, item.iconName)";
__ref._lst /*b4j.example.vmlist*/ ._addiconbutton /*String*/ (null,_item.value /*String*/ ,_item.iconName /*String*/ );
 break; }
case 11: {
RDebugUtils.currentLine=186974232;
 //BA.debugLineNum = 186974232;BA.debugLine="Lst.AddTextArea(item.vmodel, item.text, item.";
__ref._lst /*b4j.example.vmlist*/ ._addtextarea /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.value /*String*/ );
 break; }
case 12: {
RDebugUtils.currentLine=186974234;
 //BA.debugLineNum = 186974234;BA.debugLine="Lst.AddSlider(item.vmodel, item.text, item.Mi";
__ref._lst /*b4j.example.vmlist*/ ._addslider /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.MinValue /*int*/ ,_item.MaxValue /*int*/ ,(int)(Double.parseDouble(_item.value /*String*/ )),__c.True);
 break; }
case 13: {
RDebugUtils.currentLine=186974236;
 //BA.debugLineNum = 186974236;BA.debugLine="Lst.AddNumberInput(item.vmodel, item.text, it";
__ref._lst /*b4j.example.vmlist*/ ._addnumberinput /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.MinValue /*int*/ ,_item.MaxValue /*int*/ ,(int)(Double.parseDouble(_item.value /*String*/ )));
 break; }
case 14: {
RDebugUtils.currentLine=186974238;
 //BA.debugLineNum = 186974238;BA.debugLine="Lst.addselect(item.vmodel, item.text, item.so";
__ref._lst /*b4j.example.vmlist*/ ._addselect /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.sourceName /*String*/ ,_item.options /*anywheresoftware.b4a.objects.collections.Map*/ ,_item.sourcefield /*String*/ ,_item.displayfield /*String*/ );
 break; }
case 15: {
 break; }
case 16: {
RDebugUtils.currentLine=186974243;
 //BA.debugLineNum = 186974243;BA.debugLine="Lst.AddLabel(item.text)";
__ref._lst /*b4j.example.vmlist*/ ._addlabel /*String*/ (null,_item.text /*String*/ );
 break; }
}
;
 }
};
 break; }
default: {
RDebugUtils.currentLine=186974247;
 //BA.debugLineNum = 186974247;BA.debugLine="Dim lix As VMListItem = Lst.CreateItem(k)";
_lix = __ref._lst /*b4j.example.vmlist*/ ._createitem /*b4j.example.vmlistitem*/ (null,_k);
RDebugUtils.currentLine=186974248;
 //BA.debugLineNum = 186974248;BA.debugLine="lix.SetText(v)";
_lix._settext /*b4j.example.vmlistitem*/ (null,_v);
RDebugUtils.currentLine=186974249;
 //BA.debugLineNum = 186974249;BA.debugLine="lix.SetStyle(CreateMap(\"padding-top\": \"5px !imp";
_lix._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("padding-top"),(Object)("5px !important"),(Object)("padding-bottom"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("10px !important")}));
RDebugUtils.currentLine=186974251;
 //BA.debugLineNum = 186974251;BA.debugLine="Dim items As List = controls.Get(k)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items.setObject((java.util.List)(__ref._controls /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k))));
RDebugUtils.currentLine=186974252;
 //BA.debugLineNum = 186974252;BA.debugLine="Dim childList As VMList";
_childlist = new b4j.example.vmlist();
RDebugUtils.currentLine=186974253;
 //BA.debugLineNum = 186974253;BA.debugLine="childList.Initialize(vue,$\"${k}children\"$,event";
_childlist._initialize /*b4j.example.vmlist*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_k))+"children"),__ref._eventhandler /*Object*/ )._addclass /*b4j.example.vmlist*/ (null,"propertybag");
RDebugUtils.currentLine=186974254;
 //BA.debugLineNum = 186974254;BA.debugLine="childList.isPropertyBag = True";
_childlist._ispropertybag /*boolean*/  = __c.True;
RDebugUtils.currentLine=186974255;
 //BA.debugLineNum = 186974255;BA.debugLine="childList.SetStyle(CreateMap(\"width\": \"100%\", \"";
_childlist._setstyle /*b4j.example.vmlist*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)("100%"),(Object)("height"),(Object)("100%")}));
RDebugUtils.currentLine=186974256;
 //BA.debugLineNum = 186974256;BA.debugLine="childList.SetStyle(CreateMap(\"font-size\":\"14px\"";
_childlist._setstyle /*b4j.example.vmlist*/ (null,__c.createMap(new Object[] {(Object)("font-size"),(Object)("14px")}));
RDebugUtils.currentLine=186974257;
 //BA.debugLineNum = 186974257;BA.debugLine="childList.SetStyle(CreateMap(\"margin-bottom\":\"5";
_childlist._setstyle /*b4j.example.vmlist*/ (null,__c.createMap(new Object[] {(Object)("margin-bottom"),(Object)("5px !important")}));
RDebugUtils.currentLine=186974262;
 //BA.debugLineNum = 186974262;BA.debugLine="For Each item As PropControls In items";
{
final anywheresoftware.b4a.BA.IterableList group46 = _items;
final int groupLen46 = group46.getSize()
;int index46 = 0;
;
for (; index46 < groupLen46;index46++){
_item = (b4j.example.vmproperty._propcontrols)(group46.Get(index46));
RDebugUtils.currentLine=186974263;
 //BA.debugLineNum = 186974263;BA.debugLine="Select Case item.typeOf";
switch (BA.switchObjectToInt(_item.typeOf /*String*/ ,"number","text","tel","email","password","chk","swt","rad","dp","btn","btnicon","textarea","slider","numberinput","select","autocomplete","lbl")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
RDebugUtils.currentLine=186974265;
 //BA.debugLineNum = 186974265;BA.debugLine="childList.AddInput(item.typeOf, item.vmodel,";
_childlist._addinput /*String*/ (null,_item.typeOf /*String*/ ,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.iconName /*String*/ ,_item.value /*String*/ );
 break; }
case 5: {
RDebugUtils.currentLine=186974267;
 //BA.debugLineNum = 186974267;BA.debugLine="childList.AddCheckBox(item.vmodel, item.value";
_childlist._addcheckbox /*String*/ (null,_item.vmodel /*String*/ ,BA.ObjectToBoolean(_item.value /*String*/ ),_item.text /*String*/ ,__c.True);
 break; }
case 6: {
RDebugUtils.currentLine=186974269;
 //BA.debugLineNum = 186974269;BA.debugLine="childList.addswitch(item.vmodel, item.text, T";
_childlist._addswitch /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,__c.True,BA.ObjectToBoolean(_item.value /*String*/ ));
 break; }
case 7: {
RDebugUtils.currentLine=186974271;
 //BA.debugLineNum = 186974271;BA.debugLine="childList.AddRadio(item.vmodel, item.value, i";
_childlist._addradio /*String*/ (null,_item.vmodel /*String*/ ,_item.value /*String*/ ,_item.text /*String*/ ,__c.True,__c.False);
 break; }
case 8: {
RDebugUtils.currentLine=186974273;
 //BA.debugLineNum = 186974273;BA.debugLine="childList.AddDatePicker(item.vmodel, item.tex";
_childlist._adddatepicker /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.value /*String*/ );
 break; }
case 9: {
RDebugUtils.currentLine=186974275;
 //BA.debugLineNum = 186974275;BA.debugLine="childList.AddButton(item.value, item.text)";
_childlist._addbutton /*String*/ (null,_item.value /*String*/ ,_item.text /*String*/ );
 break; }
case 10: {
RDebugUtils.currentLine=186974277;
 //BA.debugLineNum = 186974277;BA.debugLine="childList.AddIconButton(item.value, item.icon";
_childlist._addiconbutton /*String*/ (null,_item.value /*String*/ ,_item.iconName /*String*/ );
 break; }
case 11: {
RDebugUtils.currentLine=186974279;
 //BA.debugLineNum = 186974279;BA.debugLine="childList.AddTextArea(item.vmodel, item.text,";
_childlist._addtextarea /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.value /*String*/ );
 break; }
case 12: {
RDebugUtils.currentLine=186974281;
 //BA.debugLineNum = 186974281;BA.debugLine="childList.AddSlider(item.vmodel, item.text, i";
_childlist._addslider /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.MinValue /*int*/ ,_item.MaxValue /*int*/ ,(int)(Double.parseDouble(_item.value /*String*/ )),__c.True);
 break; }
case 13: {
RDebugUtils.currentLine=186974283;
 //BA.debugLineNum = 186974283;BA.debugLine="childList.AddNumberInput(item.vmodel, item.te";
_childlist._addnumberinput /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.MinValue /*int*/ ,_item.MaxValue /*int*/ ,(int)(Double.parseDouble(_item.value /*String*/ )));
 break; }
case 14: {
RDebugUtils.currentLine=186974285;
 //BA.debugLineNum = 186974285;BA.debugLine="childList.addselect(item.vmodel, item.text, i";
_childlist._addselect /*String*/ (null,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.sourceName /*String*/ ,_item.options /*anywheresoftware.b4a.objects.collections.Map*/ ,_item.sourcefield /*String*/ ,_item.displayfield /*String*/ );
 break; }
case 15: {
 break; }
case 16: {
RDebugUtils.currentLine=186974290;
 //BA.debugLineNum = 186974290;BA.debugLine="childList.AddLabel(item.text)";
_childlist._addlabel /*String*/ (null,_item.text /*String*/ );
 break; }
}
;
 }
};
RDebugUtils.currentLine=186974293;
 //BA.debugLineNum = 186974293;BA.debugLine="lix.SetList(childList)";
_lix._setlist /*b4j.example.vmlistitem*/ (null,_childlist);
RDebugUtils.currentLine=186974294;
 //BA.debugLineNum = 186974294;BA.debugLine="lix.SetExpand(True)";
_lix._setexpand /*b4j.example.vmlistitem*/ (null,__c.True);
RDebugUtils.currentLine=186974295;
 //BA.debugLineNum = 186974295;BA.debugLine="lix.Pop(Lst)";
_lix._pop /*String*/ (null,__ref._lst /*b4j.example.vmlist*/ );
 break; }
}
;
 }
};
RDebugUtils.currentLine=186974298;
 //BA.debugLineNum = 186974298;BA.debugLine="Lst.Pop(Bag)";
__ref._lst /*b4j.example.vmlist*/ ._pop /*String*/ (null,__ref._bag /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=186974299;
 //BA.debugLineNum = 186974299;BA.debugLine="Return Bag.tostring";
if (true) return __ref._bag /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=186974300;
 //BA.debugLineNum = 186974300;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmproperty __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=187105280;
 //BA.debugLineNum = 187105280;BA.debugLine="Sub Render";
RDebugUtils.currentLine=187105281;
 //BA.debugLineNum = 187105281;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=187105282;
 //BA.debugLineNum = 187105282;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setborder(b4j.example.vmproperty __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "setborder", new Object[] {_b}));}
RDebugUtils.currentLine=185466880;
 //BA.debugLineNum = 185466880;BA.debugLine="Sub SetBorder(b As Boolean) As VMProperty";
RDebugUtils.currentLine=185466881;
 //BA.debugLineNum = 185466881;BA.debugLine="Lst.SetBorder(b)";
__ref._lst /*b4j.example.vmlist*/ ._setborder /*b4j.example.vmlist*/ (null,_b);
RDebugUtils.currentLine=185466882;
 //BA.debugLineNum = 185466882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=185466883;
 //BA.debugLineNum = 185466883;BA.debugLine="End Sub";
return null;
}
public String  _setdefaults(b4j.example.vmproperty __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "setdefaults", true))
	 {return ((String) Debug.delegate(ba, "setdefaults", null));}
RDebugUtils.currentLine=186646528;
 //BA.debugLineNum = 186646528;BA.debugLine="Sub SetDefaults";
RDebugUtils.currentLine=186646529;
 //BA.debugLineNum = 186646529;BA.debugLine="vue.SetState(defaults)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=186646530;
 //BA.debugLineNum = 186646530;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setelevation(b4j.example.vmproperty __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=184811520;
 //BA.debugLineNum = 184811520;BA.debugLine="Sub SetElevation(e As Int) As VMProperty";
RDebugUtils.currentLine=184811521;
 //BA.debugLineNum = 184811521;BA.debugLine="Bag.SetElevation(e)";
__ref._bag /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=184811522;
 //BA.debugLineNum = 184811522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=184811523;
 //BA.debugLineNum = 184811523;BA.debugLine="End Sub";
return null;
}
public String  _setproperties(b4j.example.vmproperty __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "setproperties", true))
	 {return ((String) Debug.delegate(ba, "setproperties", new Object[] {_m}));}
RDebugUtils.currentLine=185204736;
 //BA.debugLineNum = 185204736;BA.debugLine="Sub setProperties(m As Map)";
RDebugUtils.currentLine=185204737;
 //BA.debugLineNum = 185204737;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(m, Double";
if (__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makedouble /*String*/ (null,_m,__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185204738;
 //BA.debugLineNum = 185204738;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(m, Inte";
if (__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makeinteger /*String*/ (null,_m,__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185204739;
 //BA.debugLineNum = 185204739;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(m, Strings)";
if (__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._maketrim /*String*/ (null,_m,__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185204740;
 //BA.debugLineNum = 185204740;BA.debugLine="If Dates.Size > 0 Then vue.MakeDate(m, Dates)";
if (__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makedate /*String*/ (null,_m,__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185204741;
 //BA.debugLineNum = 185204741;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(m, Bool";
if (__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makeboolean /*String*/ (null,_m,__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=185204742;
 //BA.debugLineNum = 185204742;BA.debugLine="vue.SetState(m)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_m);
RDebugUtils.currentLine=185204743;
 //BA.debugLineNum = 185204743;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setstyle(b4j.example.vmproperty __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=185532416;
 //BA.debugLineNum = 185532416;BA.debugLine="Sub SetStyle(m As Map) As VMProperty";
RDebugUtils.currentLine=185532417;
 //BA.debugLineNum = 185532417;BA.debugLine="Bag.SetStyle(m)";
__ref._bag /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=185532418;
 //BA.debugLineNum = 185532418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=185532419;
 //BA.debugLineNum = 185532419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _setvif(b4j.example.vmproperty __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=185270272;
 //BA.debugLineNum = 185270272;BA.debugLine="Sub SetVIf(vif As Object) As VMProperty";
RDebugUtils.currentLine=185270273;
 //BA.debugLineNum = 185270273;BA.debugLine="Bag.SetVIf(vif)";
__ref._bag /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=185270274;
 //BA.debugLineNum = 185270274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=185270275;
 //BA.debugLineNum = 185270275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _setvshow(b4j.example.vmproperty __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmproperty";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=185335808;
 //BA.debugLineNum = 185335808;BA.debugLine="Sub SetVShow(vif As Object) As VMProperty";
RDebugUtils.currentLine=185335809;
 //BA.debugLineNum = 185335809;BA.debugLine="Bag.SetVShow(vif)";
__ref._bag /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=185335810;
 //BA.debugLineNum = 185335810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
RDebugUtils.currentLine=185335811;
 //BA.debugLineNum = 185335811;BA.debugLine="End Sub";
return null;
}
}