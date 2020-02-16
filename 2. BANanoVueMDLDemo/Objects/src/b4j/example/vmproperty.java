package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmproperty extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmproperty", this);
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
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
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
public b4j.example.vmproperty  _addbooleans(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 77;BA.debugLine="Sub AddBooleans(i As List) As VMProperty";
 //BA.debugLineNum = 78;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 79;BA.debugLine="Booleans.Add(s)";
_booleans.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public String  _addbutton(String _parent,String _btnid,String _btntext,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 237;BA.debugLine="Sub AddButton(parent As String, btnID As String, b";
 //BA.debugLineNum = 238;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 239;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 240;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 241;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 243;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 244;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 245;BA.debugLine="nc.vmodel = \"\"";
_nc.vmodel /*String*/  = "";
 //BA.debugLineNum = 246;BA.debugLine="nc.text = btnText";
_nc.text /*String*/  = _btntext;
 //BA.debugLineNum = 247;BA.debugLine="nc.value = btnID";
_nc.value /*String*/  = _btnid;
 //BA.debugLineNum = 248;BA.debugLine="nc.typeOf = \"btn\"";
_nc.typeOf /*String*/  = "btn";
 //BA.debugLineNum = 249;BA.debugLine="nc.module = eventHandler";
_nc.module /*Object*/  = _eventhandler;
 //BA.debugLineNum = 250;BA.debugLine="nc.methodName = methodName";
_nc.methodName /*String*/  = _methodname;
 //BA.debugLineNum = 251;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 252;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public String  _addcheck(String _parent,String _vmodel,String _text,boolean _bvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 409;BA.debugLine="Sub AddCheck(parent As String, vModel As String, t";
 //BA.debugLineNum = 410;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 411;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 412;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 413;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 415;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 416;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 417;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 418;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
 //BA.debugLineNum = 419;BA.debugLine="nc.value = bvalue";
_nc.value /*String*/  = BA.ObjectToString(_bvalue);
 //BA.debugLineNum = 420;BA.debugLine="nc.typeOf = \"chk\"";
_nc.typeOf /*String*/  = "chk";
 //BA.debugLineNum = 421;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 422;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 423;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 424;BA.debugLine="Booleans.Add(vModel)";
_booleans.Add((Object)(_vmodel));
 //BA.debugLineNum = 425;BA.debugLine="defaults.Put(vModel,bvalue)";
_defaults.Put((Object)(_vmodel),(Object)(_bvalue));
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public String  _adddatepicker(String _parent,String _vmodel,String _text,String _vvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 429;BA.debugLine="Sub AddDatePicker(parent As String, vModel As Stri";
 //BA.debugLineNum = 430;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 431;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 432;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 433;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 435;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 436;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 437;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 438;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
 //BA.debugLineNum = 439;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
 //BA.debugLineNum = 440;BA.debugLine="nc.typeOf = \"dp\"";
_nc.typeOf /*String*/  = "dp";
 //BA.debugLineNum = 441;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 442;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 443;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 444;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 445;BA.debugLine="defaults.Put(vModel,vValue)";
_defaults.Put((Object)(_vmodel),(Object)(_vvalue));
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _adddates(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 91;BA.debugLine="Sub AddDates(i As List) As VMProperty";
 //BA.debugLineNum = 92;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 93;BA.debugLine="Dates.Add(s)";
_dates.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _adddoubles(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub AddDoubles(i As List) As VMProperty";
 //BA.debugLineNum = 85;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 86;BA.debugLine="Doubles.Add(s)";
_doubles.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public String  _addemail(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub AddEmail(parent As String, vModel As String, v";
 //BA.debugLineNum = 382;BA.debugLine="AddInput(parent, \"email\", vModel, vText, vIcon, v";
_addinput(_parent,"email",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 383;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addheading(String _sectname,String _sectheading) throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 315;BA.debugLine="Sub AddHeading(sectName As String, sectHeading As";
 //BA.debugLineNum = 316;BA.debugLine="sectName = sectName.tolowercase";
_sectname = _sectname.toLowerCase();
 //BA.debugLineNum = 317;BA.debugLine="labels.Put(sectName, sectHeading)";
_labels.Put((Object)(_sectname),(Object)(_sectheading));
 //BA.debugLineNum = 319;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 320;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 321;BA.debugLine="controls.Put(sectName, items)";
_controls.Put((Object)(_sectname),(Object)(_items.getObject()));
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public String  _addiconbutton(String _parent,String _btnid,String _btnicon,String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 344;BA.debugLine="Sub AddIconButton(parent As String, btnID As Strin";
 //BA.debugLineNum = 345;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 346;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 347;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 348;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 350;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 351;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 352;BA.debugLine="nc.iconName = btnIcon";
_nc.iconName /*String*/  = _btnicon;
 //BA.debugLineNum = 353;BA.debugLine="nc.value = btnID";
_nc.value /*String*/  = _btnid;
 //BA.debugLineNum = 354;BA.debugLine="nc.typeOf = \"btnicon\"";
_nc.typeOf /*String*/  = "btnicon";
 //BA.debugLineNum = 355;BA.debugLine="nc.module = eventHandler";
_nc.module /*Object*/  = _eventhandler;
 //BA.debugLineNum = 356;BA.debugLine="nc.methodName = methodName";
_nc.methodName /*String*/  = _methodname;
 //BA.debugLineNum = 357;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 358;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public String  _addinput(String _parent,String _typeof,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 386;BA.debugLine="private Sub AddInput(parent As String, typeOf As S";
 //BA.debugLineNum = 387;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 388;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 389;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 390;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 392;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 393;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 394;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 395;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 396;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
 //BA.debugLineNum = 397;BA.debugLine="nc.typeOf = typeOf";
_nc.typeOf /*String*/  = _typeof;
 //BA.debugLineNum = 398;BA.debugLine="nc.iconName = vIcon";
_nc.iconName /*String*/  = _vicon;
 //BA.debugLineNum = 399;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 400;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 401;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 402;BA.debugLine="defaults.Put(vModel,vValue)";
_defaults.Put((Object)(_vmodel),(Object)(_vvalue));
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addintegers(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub AddIntegers(i As List) As VMProperty";
 //BA.debugLineNum = 64;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 65;BA.debugLine="Integers.Add(s)";
_integers.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public String  _addlabel(String _parent,String _txt) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 298;BA.debugLine="Sub AddLabel(parent As String, txt As String)";
 //BA.debugLineNum = 299;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 300;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 301;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 302;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 304;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 305;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 306;BA.debugLine="nc.vmodel = \"\"";
_nc.vmodel /*String*/  = "";
 //BA.debugLineNum = 307;BA.debugLine="nc.text = txt";
_nc.text /*String*/  = _txt;
 //BA.debugLineNum = 308;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 309;BA.debugLine="nc.typeOf = \"lbl\"";
_nc.typeOf /*String*/  = "lbl";
 //BA.debugLineNum = 310;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 311;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public String  _addnumber(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub AddNumber(parent As String, vModel As String,";
 //BA.debugLineNum = 377;BA.debugLine="AddInput(parent, \"number\", vModel, vText, vIcon,";
_addinput(_parent,"number",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 378;BA.debugLine="Integers.Add(vModel)";
_integers.Add((Object)(_vmodel));
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public String  _addnumberinput(String _parent,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 276;BA.debugLine="Sub AddNumberInput(parent As String, vmodel As Str";
 //BA.debugLineNum = 277;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 278;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 279;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 280;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 282;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 283;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 284;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 285;BA.debugLine="nc.text = Label";
_nc.text /*String*/  = _label;
 //BA.debugLineNum = 286;BA.debugLine="nc.value = value";
_nc.value /*String*/  = BA.NumberToString(_value);
 //BA.debugLineNum = 287;BA.debugLine="nc.typeOf = \"numberinput\"";
_nc.typeOf /*String*/  = "numberinput";
 //BA.debugLineNum = 288;BA.debugLine="nc.MinValue = minValue";
_nc.MinValue /*int*/  = _minvalue;
 //BA.debugLineNum = 289;BA.debugLine="nc.MaxValue = maxValue";
_nc.MaxValue /*int*/  = _maxvalue;
 //BA.debugLineNum = 290;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 291;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 292;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 293;BA.debugLine="Integers.Add(vmodel)";
_integers.Add((Object)(_vmodel));
 //BA.debugLineNum = 294;BA.debugLine="defaults.Put(vmodel,value)";
_defaults.Put((Object)(_vmodel),(Object)(_value));
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public String  _addpassword(String _parent,String _vmodel,String _vtext,String _vvalue) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub AddPassword(parent As String, vModel As String";
 //BA.debugLineNum = 362;BA.debugLine="AddInput(parent, \"password\", vModel, vText, \"\", v";
_addinput(_parent,"password",_vmodel,_vtext,"",_vvalue);
 //BA.debugLineNum = 363;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
public String  _addradiogroup(String _parent,String _vmodel,String _vtext,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 477;BA.debugLine="Sub AddRadioGroup(parent As String, vmodel As Stri";
 //BA.debugLineNum = 478;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 479;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 480;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 481;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 482;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 484;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 487;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 488;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 489;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 490;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 491;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 492;BA.debugLine="nc.typeOf = \"radiogroup\"";
_nc.typeOf /*String*/  = "radiogroup";
 //BA.debugLineNum = 493;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
 //BA.debugLineNum = 494;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 495;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
 //BA.debugLineNum = 496;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
 //BA.debugLineNum = 497;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 498;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 499;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 500;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 501;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return "";
}
public String  _addselect(String _parent,String _vmodel,String _vtext,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 118;BA.debugLine="Sub AddSelect(parent As String, vmodel As String,";
 //BA.debugLineNum = 119;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 120;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 121;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 122;BA.debugLine="If controls.ContainsKey(parent) Then";
if (_controls.ContainsKey((Object)(_parent))) { 
 //BA.debugLineNum = 123;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 }else {
 //BA.debugLineNum = 125;BA.debugLine="existing.Initialize";
_existing.Initialize();
 };
 //BA.debugLineNum = 128;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 129;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 130;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 131;BA.debugLine="nc.text = vText";
_nc.text /*String*/  = _vtext;
 //BA.debugLineNum = 132;BA.debugLine="nc.value = \"\"";
_nc.value /*String*/  = "";
 //BA.debugLineNum = 133;BA.debugLine="nc.typeOf = \"select\"";
_nc.typeOf /*String*/  = "select";
 //BA.debugLineNum = 134;BA.debugLine="nc.sourceName = sourceName";
_nc.sourceName /*String*/  = _sourcename;
 //BA.debugLineNum = 135;BA.debugLine="nc.options = options";
_nc.options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 136;BA.debugLine="nc.sourcefield = sourcefield";
_nc.sourcefield /*String*/  = _sourcefield;
 //BA.debugLineNum = 137;BA.debugLine="nc.displayfield = displayfield";
_nc.displayfield /*String*/  = _displayfield;
 //BA.debugLineNum = 138;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 139;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 140;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 141;BA.debugLine="Strings.Add(vmodel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 142;BA.debugLine="defaults.Put(vmodel,\"\")";
_defaults.Put((Object)(_vmodel),(Object)(""));
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _addslider(String _parent,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 255;BA.debugLine="Sub AddSlider(parent As String, vmodel As String,";
 //BA.debugLineNum = 256;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 257;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 258;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 259;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 261;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 262;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 263;BA.debugLine="nc.vmodel = vmodel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 264;BA.debugLine="nc.text = Label";
_nc.text /*String*/  = _label;
 //BA.debugLineNum = 265;BA.debugLine="nc.value = value";
_nc.value /*String*/  = BA.NumberToString(_value);
 //BA.debugLineNum = 266;BA.debugLine="nc.typeOf = \"slider\"";
_nc.typeOf /*String*/  = "slider";
 //BA.debugLineNum = 267;BA.debugLine="nc.MinValue = minValue";
_nc.MinValue /*int*/  = _minvalue;
 //BA.debugLineNum = 268;BA.debugLine="nc.MaxValue = maxValue";
_nc.MaxValue /*int*/  = _maxvalue;
 //BA.debugLineNum = 269;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 270;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 271;BA.debugLine="fields.Add(vmodel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 272;BA.debugLine="Integers.Add(vmodel)";
_integers.Add((Object)(_vmodel));
 //BA.debugLineNum = 273;BA.debugLine="defaults.Put(vmodel,value)";
_defaults.Put((Object)(_vmodel),(Object)(_value));
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _addstrings(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub AddStrings(i As List) As VMProperty";
 //BA.debugLineNum = 71;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 72;BA.debugLine="Strings.Add(s)";
_strings.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public String  _addswitch(String _parent,String _vmodel,String _text,boolean _bvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 325;BA.debugLine="Sub AddSwitch(parent As String, vModel As String,";
 //BA.debugLineNum = 326;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 327;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 328;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 329;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 331;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 332;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 333;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 334;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
 //BA.debugLineNum = 335;BA.debugLine="nc.value = bValue";
_nc.value /*String*/  = BA.ObjectToString(_bvalue);
 //BA.debugLineNum = 336;BA.debugLine="nc.typeOf = \"swt\"";
_nc.typeOf /*String*/  = "swt";
 //BA.debugLineNum = 337;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 338;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 339;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 340;BA.debugLine="Booleans.Add(vModel)";
_booleans.Add((Object)(_vmodel));
 //BA.debugLineNum = 341;BA.debugLine="defaults.Put(vModel,bValue)";
_defaults.Put((Object)(_vmodel),(Object)(_bvalue));
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return "";
}
public String  _addtel(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub AddTel(parent As String, vModel As String, vTe";
 //BA.debugLineNum = 372;BA.debugLine="AddInput(parent, \"tel\", vModel, vText, vIcon, vVa";
_addinput(_parent,"tel",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 373;BA.debugLine="Integers.add(vModel)";
_integers.Add((Object)(_vmodel));
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public String  _addtext(String _parent,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub AddText(parent As String, vModel As String, vT";
 //BA.debugLineNum = 367;BA.debugLine="AddInput(parent, \"text\", vModel, vText, vIcon, vV";
_addinput(_parent,"text",_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 368;BA.debugLine="Strings.add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return "";
}
public String  _addtextarea(String _parent,String _vmodel,String _text,String _vvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.example.vmproperty._propcontrols _nc = null;
 //BA.debugLineNum = 448;BA.debugLine="Sub AddTextArea(parent As String, vModel As String";
 //BA.debugLineNum = 449;BA.debugLine="parent = parent.tolowercase";
_parent = _parent.toLowerCase();
 //BA.debugLineNum = 450;BA.debugLine="If parent = \"\" Then parent = \"main\"";
if ((_parent).equals("")) { 
_parent = "main";};
 //BA.debugLineNum = 451;BA.debugLine="Dim existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 452;BA.debugLine="existing = controls.Get(parent)";
_existing.setObject((java.util.List)(_controls.Get((Object)(_parent))));
 //BA.debugLineNum = 454;BA.debugLine="Dim nc As PropControls";
_nc = new b4j.example.vmproperty._propcontrols();
 //BA.debugLineNum = 455;BA.debugLine="nc.Initialize";
_nc.Initialize();
 //BA.debugLineNum = 456;BA.debugLine="nc.vmodel = vModel";
_nc.vmodel /*String*/  = _vmodel;
 //BA.debugLineNum = 457;BA.debugLine="nc.text = text";
_nc.text /*String*/  = _text;
 //BA.debugLineNum = 458;BA.debugLine="nc.value = vValue";
_nc.value /*String*/  = _vvalue;
 //BA.debugLineNum = 459;BA.debugLine="nc.typeOf = \"textarea\"";
_nc.typeOf /*String*/  = "textarea";
 //BA.debugLineNum = 460;BA.debugLine="existing.Add(nc)";
_existing.Add((Object)(_nc));
 //BA.debugLineNum = 461;BA.debugLine="controls.Put(parent, existing)";
_controls.Put((Object)(_parent),(Object)(_existing.getObject()));
 //BA.debugLineNum = 462;BA.debugLine="fields.Add(vModel)";
_fields.Add((Object)(_vmodel));
 //BA.debugLineNum = 463;BA.debugLine="Strings.Add(vModel)";
_strings.Add((Object)(_vmodel));
 //BA.debugLineNum = 464;BA.debugLine="defaults.Put(vModel,vValue)";
_defaults.Put((Object)(_vmodel),(Object)(_vvalue));
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Public vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 5;BA.debugLine="Private labels As Map";
_labels = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private Bag As VMElement";
_bag = new b4j.example.vmelement();
 //BA.debugLineNum = 7;BA.debugLine="Private Lst As VMList";
_lst = new b4j.example.vmlist();
 //BA.debugLineNum = 8;BA.debugLine="Type PropControls(vmodel As String, value As Stri";
;
 //BA.debugLineNum = 11;BA.debugLine="Dim controls As Map";
_controls = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Private fields As List";
_fields = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Private BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 15;BA.debugLine="Private Booleans As List";
_booleans = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private Strings As List";
_strings = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="Private Integers As List";
_integers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 18;BA.debugLine="Private Doubles As List";
_doubles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="Private Dates As List";
_dates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Private defaults As Map";
_defaults = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
String _k = "";
 //BA.debugLineNum = 224;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 225;BA.debugLine="For Each k As String In fields";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fields;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 226;BA.debugLine="vue.SetStateSingle(k, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_k,__c.Null);
 }
};
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _expanditem(String _sid,boolean _b) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VMP";
 //BA.debugLineNum = 53;BA.debugLine="Lst.ExpandItem(sid, b)";
_lst._expanditem /*b4j.example.vmlist*/ (_sid,_b);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public String  _getcode() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _items = null;
b4j.example.vmproperty._propcontrols _item = null;
 //BA.debugLineNum = 616;BA.debugLine="Sub GetCode As String";
 //BA.debugLineNum = 617;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 618;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 620;BA.debugLine="For Each k As String In controls.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _controls.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 621;BA.debugLine="Dim items As List = controls.Get(k)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items.setObject((java.util.List)(_controls.Get((Object)(_k))));
 //BA.debugLineNum = 622;BA.debugLine="For Each item As PropControls In items";
{
final anywheresoftware.b4a.BA.IterableList group5 = _items;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_item = (b4j.example.vmproperty._propcontrols)(group5.Get(index5));
 //BA.debugLineNum = 623;BA.debugLine="Select Case item.typeOf";
switch (BA.switchObjectToInt(_item.typeOf /*String*/ ,"number","text","email","password","dp","textarea","chk","swt","rad","slider","tel","select","autocomplete")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 625;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
_sb.Append(("Dim s"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As String = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
case 6: 
case 7: {
 //BA.debugLineNum = 627;BA.debugLine="sb.Append($\"Dim b${item.vmodel} As Boolean =";
_sb.Append(("Dim b"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As Boolean = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
case 8: {
 //BA.debugLineNum = 629;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
_sb.Append(("Dim s"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As String = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
case 9: 
case 10: {
 //BA.debugLineNum = 631;BA.debugLine="sb.Append($\"Dim i${item.vmodel} As Int = rec.";
_sb.Append(("Dim i"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As Int = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
case 11: 
case 12: {
 //BA.debugLineNum = 633;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
_sb.Append(("Dim s"+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+" As String = rec.Get(\""+__c.SmartStringFormatter("",(Object)(_item.vmodel /*String*/ ))+"\")")).Append(__c.CRLF);
 break; }
}
;
 }
};
 }
};
 //BA.debugLineNum = 637;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return "";
}
public String  _getjson() throws Exception{
anywheresoftware.b4a.objects.collections.Map _them = null;
String _sjson = "";
 //BA.debugLineNum = 231;BA.debugLine="Sub getJSON As String";
 //BA.debugLineNum = 232;BA.debugLine="Dim them As Map = getProperties";
_them = new anywheresoftware.b4a.objects.collections.Map();
_them = _getproperties();
 //BA.debugLineNum = 233;BA.debugLine="Dim sjson As String = BANano.ToJson(them)";
_sjson = BA.ObjectToString(_banano.ToJson((Object)(_them.getObject())));
 //BA.debugLineNum = 234;BA.debugLine="Return sjson";
if (true) return _sjson;
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getproperties() throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 209;BA.debugLine="Sub getProperties As Map";
 //BA.debugLineNum = 210;BA.debugLine="Dim rec As Map = CreateMap()";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 211;BA.debugLine="For Each k As String In fields";
{
final anywheresoftware.b4a.BA.IterableList group2 = _fields;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 212;BA.debugLine="Dim v As Object = vue.GetState(k, \"\")";
_v = _vue._getstate /*Object*/ (_k,(Object)(""));
 //BA.debugLineNum = 213;BA.debugLine="If v = BANano.UNDEFINED Then v = \"\"";
if ((_v).equals(_banano.UNDEFINED())) { 
_v = (Object)("");};
 //BA.debugLineNum = 214;BA.debugLine="rec.Put(k, v)";
_rec.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 216;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(rec, Bo";
if (_booleans.getSize()>0) { 
_vue._makeboolean /*String*/ (_rec,_booleans);};
 //BA.debugLineNum = 217;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(rec, Doub";
if (_doubles.getSize()>0) { 
_vue._makedouble /*String*/ (_rec,_doubles);};
 //BA.debugLineNum = 218;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(rec, In";
if (_integers.getSize()>0) { 
_vue._makeinteger /*String*/ (_rec,_integers);};
 //BA.debugLineNum = 219;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(rec, String";
if (_strings.getSize()>0) { 
_vue._maketrim /*String*/ (_rec,_strings);};
 //BA.debugLineNum = 220;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,Object _module,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(v As BANanoVue, module As Ob";
 //BA.debugLineNum = 25;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 26;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 27;BA.debugLine="vue.SetStateSingle(\"expandProp\", True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("expandProp",(Object)(__c.True));
 //BA.debugLineNum = 28;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 29;BA.debugLine="fields.Initialize";
_fields.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="Bag.Initialize(vue, ID)";
_bag._initialize /*b4j.example.vmelement*/ (ba,_vue,_id);
 //BA.debugLineNum = 31;BA.debugLine="Bag.SetKey(ID,False).AddClass(\"propertybag\")";
_bag._setkey /*b4j.example.vmelement*/ ((Object)(_id),__c.False)._addclass /*b4j.example.vmelement*/ ("propertybag");
 //BA.debugLineNum = 32;BA.debugLine="Lst.Initialize(vue, $\"${ID}list\"$,module)";
_lst._initialize /*b4j.example.vmlist*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"list"),_module);
 //BA.debugLineNum = 33;BA.debugLine="Lst.SetStyle(CreateMap(\"width\": \"100%\", \"height\":";
_lst._setstyle /*b4j.example.vmlist*/ (__c.createMap(new Object[] {(Object)("width"),(Object)("100%"),(Object)("height"),(Object)("100%")}));
 //BA.debugLineNum = 34;BA.debugLine="Lst.SetStyle(CreateMap(\"font-size\":\"14px\"))";
_lst._setstyle /*b4j.example.vmlist*/ (__c.createMap(new Object[] {(Object)("font-size"),(Object)("14px")}));
 //BA.debugLineNum = 38;BA.debugLine="Lst.isPropertyBag = True";
_lst._ispropertybag /*boolean*/  = __c.True;
 //BA.debugLineNum = 39;BA.debugLine="Lst.SetExpandSingle(\"expandProp\")";
_lst._setexpandsingle /*b4j.example.vmlist*/ (BA.ObjectToBoolean("expandProp"));
 //BA.debugLineNum = 40;BA.debugLine="labels.Initialize";
_labels.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="controls.Initialize";
_controls.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="AddHeading(\"main\", \"Main\")";
_addheading("main","Main");
 //BA.debugLineNum = 43;BA.debugLine="Booleans.Initialize";
_booleans.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="Strings.Initialize";
_strings.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="Integers.Initialize";
_integers.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="Doubles.Initialize";
_doubles.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="defaults.Initialize";
_defaults.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="Dates.Initialize";
_dates.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 644;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 645;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 640;BA.debugLine="Sub Render";
 //BA.debugLineNum = 641;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setborder(boolean _b) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetBorder(b As Boolean) As VMProperty";
 //BA.debugLineNum = 199;BA.debugLine="Lst.SetBorder(b)";
_lst._setborder /*b4j.example.vmlist*/ (_b);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public String  _setdefaults() throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetDefaults";
 //BA.debugLineNum = 406;BA.debugLine="vue.SetState(defaults)";
_vue._setstate /*b4j.example.bananovue*/ (_defaults);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetElevation(e As Int) As VMProperty";
 //BA.debugLineNum = 58;BA.debugLine="Bag.SetElevation(e)";
_bag._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public String  _setproperties(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub setProperties(m As Map)";
 //BA.debugLineNum = 100;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(m, Double";
if (_doubles.getSize()>0) { 
_vue._makedouble /*String*/ (_m,_doubles);};
 //BA.debugLineNum = 101;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(m, Inte";
if (_integers.getSize()>0) { 
_vue._makeinteger /*String*/ (_m,_integers);};
 //BA.debugLineNum = 102;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(m, Strings)";
if (_strings.getSize()>0) { 
_vue._maketrim /*String*/ (_m,_strings);};
 //BA.debugLineNum = 103;BA.debugLine="If Dates.Size > 0 Then vue.MakeDate(m, Dates)";
if (_dates.getSize()>0) { 
_vue._makedate /*String*/ (_m,_dates);};
 //BA.debugLineNum = 104;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(m, Bool";
if (_booleans.getSize()>0) { 
_vue._makeboolean /*String*/ (_m,_booleans);};
 //BA.debugLineNum = 105;BA.debugLine="vue.SetState(m)";
_vue._setstate /*b4j.example.bananovue*/ (_m);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmproperty  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetStyle(m As Map) As VMProperty";
 //BA.debugLineNum = 204;BA.debugLine="Bag.SetStyle(m)";
_bag._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetVIf(vif As Object) As VMProperty";
 //BA.debugLineNum = 109;BA.debugLine="Bag.SetVIf(vif)";
_bag._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetVShow(vif As Object) As VMProperty";
 //BA.debugLineNum = 114;BA.debugLine="Bag.SetVShow(vif)";
_bag._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmproperty)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.List _items = null;
b4j.example.vmproperty._propcontrols _item = null;
b4j.example.vmlistitem _lix = null;
b4j.example.vmlist _childlist = null;
 //BA.debugLineNum = 522;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 524;BA.debugLine="For Each k As String In labels.keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _labels.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 525;BA.debugLine="Dim v As String = labels.Get(k)";
_v = BA.ObjectToString(_labels.Get((Object)(_k)));
 //BA.debugLineNum = 526;BA.debugLine="Dim items As List = controls.Get(k)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items.setObject((java.util.List)(_controls.Get((Object)(_k))));
 //BA.debugLineNum = 527;BA.debugLine="Select Case k";
switch (BA.switchObjectToInt(_k,"main")) {
case 0: {
 //BA.debugLineNum = 529;BA.debugLine="For Each item As PropControls In items";
{
final anywheresoftware.b4a.BA.IterableList group6 = _items;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_item = (b4j.example.vmproperty._propcontrols)(group6.Get(index6));
 //BA.debugLineNum = 530;BA.debugLine="Select Case item.typeOf";
switch (BA.switchObjectToInt(_item.typeOf /*String*/ ,"number","text","tel","email","password","chk","swt","rad","dp","btn","btnicon","textarea","slider","numberinput","select","autocomplete","lbl")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 //BA.debugLineNum = 532;BA.debugLine="Lst.AddInput(item.typeOf, item.vmodel, item.t";
_lst._addinput /*String*/ (_item.typeOf /*String*/ ,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.iconName /*String*/ ,_item.value /*String*/ );
 break; }
case 5: {
 //BA.debugLineNum = 534;BA.debugLine="Lst.AddCheckBox(item.vmodel, item.value, item";
_lst._addcheckbox /*String*/ (_item.vmodel /*String*/ ,BA.ObjectToBoolean(_item.value /*String*/ ),_item.text /*String*/ ,__c.True);
 break; }
case 6: {
 //BA.debugLineNum = 536;BA.debugLine="Lst.addswitch(item.vmodel, item.text, True, i";
_lst._addswitch /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,__c.True,BA.ObjectToBoolean(_item.value /*String*/ ));
 break; }
case 7: {
 //BA.debugLineNum = 538;BA.debugLine="Lst.AddRadio(item.vmodel, item.value, item.te";
_lst._addradio /*String*/ (_item.vmodel /*String*/ ,_item.value /*String*/ ,_item.text /*String*/ ,__c.True,__c.False);
 break; }
case 8: {
 //BA.debugLineNum = 540;BA.debugLine="Lst.AddDatePicker(item.vmodel, item.text, ite";
_lst._adddatepicker /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.value /*String*/ );
 break; }
case 9: {
 //BA.debugLineNum = 542;BA.debugLine="Lst.AddButton(item.value, item.text)";
_lst._addbutton /*String*/ (_item.value /*String*/ ,_item.text /*String*/ );
 break; }
case 10: {
 //BA.debugLineNum = 544;BA.debugLine="Lst.AddIconButton(item.value, item.iconName)";
_lst._addiconbutton /*String*/ (_item.value /*String*/ ,_item.iconName /*String*/ );
 break; }
case 11: {
 //BA.debugLineNum = 546;BA.debugLine="Lst.AddTextArea(item.vmodel, item.text, item.";
_lst._addtextarea /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.value /*String*/ );
 break; }
case 12: {
 //BA.debugLineNum = 548;BA.debugLine="Lst.AddSlider(item.vmodel, item.text, item.Mi";
_lst._addslider /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.MinValue /*int*/ ,_item.MaxValue /*int*/ ,(int)(Double.parseDouble(_item.value /*String*/ )),__c.True);
 break; }
case 13: {
 //BA.debugLineNum = 550;BA.debugLine="Lst.AddNumberInput(item.vmodel, item.text, it";
_lst._addnumberinput /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.MinValue /*int*/ ,_item.MaxValue /*int*/ ,(int)(Double.parseDouble(_item.value /*String*/ )));
 break; }
case 14: {
 //BA.debugLineNum = 552;BA.debugLine="Lst.addselect(item.vmodel, item.text, item.so";
_lst._addselect /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.sourceName /*String*/ ,_item.options /*anywheresoftware.b4a.objects.collections.Map*/ ,_item.sourcefield /*String*/ ,_item.displayfield /*String*/ );
 break; }
case 15: {
 break; }
case 16: {
 //BA.debugLineNum = 557;BA.debugLine="Lst.AddLabel(item.text)";
_lst._addlabel /*String*/ (_item.text /*String*/ );
 break; }
}
;
 }
};
 break; }
default: {
 //BA.debugLineNum = 561;BA.debugLine="Dim lix As VMListItem = Lst.CreateItem(k)";
_lix = _lst._createitem /*b4j.example.vmlistitem*/ (_k);
 //BA.debugLineNum = 562;BA.debugLine="lix.SetText(v)";
_lix._settext /*b4j.example.vmlistitem*/ (_v);
 //BA.debugLineNum = 563;BA.debugLine="lix.SetStyle(CreateMap(\"padding-top\": \"5px !imp";
_lix._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("padding-top"),(Object)("5px !important"),(Object)("padding-bottom"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("10px !important")}));
 //BA.debugLineNum = 565;BA.debugLine="Dim items As List = controls.Get(k)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items.setObject((java.util.List)(_controls.Get((Object)(_k))));
 //BA.debugLineNum = 566;BA.debugLine="Dim childList As VMList";
_childlist = new b4j.example.vmlist();
 //BA.debugLineNum = 567;BA.debugLine="childList.Initialize(vue,$\"${k}children\"$,event";
_childlist._initialize /*b4j.example.vmlist*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_k))+"children"),_eventhandler)._addclass /*b4j.example.vmlist*/ ("propertybag");
 //BA.debugLineNum = 568;BA.debugLine="childList.isPropertyBag = True";
_childlist._ispropertybag /*boolean*/  = __c.True;
 //BA.debugLineNum = 569;BA.debugLine="childList.SetStyle(CreateMap(\"width\": \"100%\", \"";
_childlist._setstyle /*b4j.example.vmlist*/ (__c.createMap(new Object[] {(Object)("width"),(Object)("100%"),(Object)("height"),(Object)("100%")}));
 //BA.debugLineNum = 570;BA.debugLine="childList.SetStyle(CreateMap(\"font-size\":\"14px\"";
_childlist._setstyle /*b4j.example.vmlist*/ (__c.createMap(new Object[] {(Object)("font-size"),(Object)("14px")}));
 //BA.debugLineNum = 571;BA.debugLine="childList.SetStyle(CreateMap(\"margin-bottom\":\"5";
_childlist._setstyle /*b4j.example.vmlist*/ (__c.createMap(new Object[] {(Object)("margin-bottom"),(Object)("5px !important")}));
 //BA.debugLineNum = 576;BA.debugLine="For Each item As PropControls In items";
{
final anywheresoftware.b4a.BA.IterableList group46 = _items;
final int groupLen46 = group46.getSize()
;int index46 = 0;
;
for (; index46 < groupLen46;index46++){
_item = (b4j.example.vmproperty._propcontrols)(group46.Get(index46));
 //BA.debugLineNum = 577;BA.debugLine="Select Case item.typeOf";
switch (BA.switchObjectToInt(_item.typeOf /*String*/ ,"number","text","tel","email","password","chk","swt","rad","dp","btn","btnicon","textarea","slider","numberinput","select","autocomplete","lbl")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 //BA.debugLineNum = 579;BA.debugLine="childList.AddInput(item.typeOf, item.vmodel,";
_childlist._addinput /*String*/ (_item.typeOf /*String*/ ,_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.iconName /*String*/ ,_item.value /*String*/ );
 break; }
case 5: {
 //BA.debugLineNum = 581;BA.debugLine="childList.AddCheckBox(item.vmodel, item.value";
_childlist._addcheckbox /*String*/ (_item.vmodel /*String*/ ,BA.ObjectToBoolean(_item.value /*String*/ ),_item.text /*String*/ ,__c.True);
 break; }
case 6: {
 //BA.debugLineNum = 583;BA.debugLine="childList.addswitch(item.vmodel, item.text, T";
_childlist._addswitch /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,__c.True,BA.ObjectToBoolean(_item.value /*String*/ ));
 break; }
case 7: {
 //BA.debugLineNum = 585;BA.debugLine="childList.AddRadio(item.vmodel, item.value, i";
_childlist._addradio /*String*/ (_item.vmodel /*String*/ ,_item.value /*String*/ ,_item.text /*String*/ ,__c.True,__c.False);
 break; }
case 8: {
 //BA.debugLineNum = 587;BA.debugLine="childList.AddDatePicker(item.vmodel, item.tex";
_childlist._adddatepicker /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.value /*String*/ );
 break; }
case 9: {
 //BA.debugLineNum = 589;BA.debugLine="childList.AddButton(item.value, item.text)";
_childlist._addbutton /*String*/ (_item.value /*String*/ ,_item.text /*String*/ );
 break; }
case 10: {
 //BA.debugLineNum = 591;BA.debugLine="childList.AddIconButton(item.value, item.icon";
_childlist._addiconbutton /*String*/ (_item.value /*String*/ ,_item.iconName /*String*/ );
 break; }
case 11: {
 //BA.debugLineNum = 593;BA.debugLine="childList.AddTextArea(item.vmodel, item.text,";
_childlist._addtextarea /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.value /*String*/ );
 break; }
case 12: {
 //BA.debugLineNum = 595;BA.debugLine="childList.AddSlider(item.vmodel, item.text, i";
_childlist._addslider /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.MinValue /*int*/ ,_item.MaxValue /*int*/ ,(int)(Double.parseDouble(_item.value /*String*/ )),__c.True);
 break; }
case 13: {
 //BA.debugLineNum = 597;BA.debugLine="childList.AddNumberInput(item.vmodel, item.te";
_childlist._addnumberinput /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.MinValue /*int*/ ,_item.MaxValue /*int*/ ,(int)(Double.parseDouble(_item.value /*String*/ )));
 break; }
case 14: {
 //BA.debugLineNum = 599;BA.debugLine="childList.addselect(item.vmodel, item.text, i";
_childlist._addselect /*String*/ (_item.vmodel /*String*/ ,_item.text /*String*/ ,_item.sourceName /*String*/ ,_item.options /*anywheresoftware.b4a.objects.collections.Map*/ ,_item.sourcefield /*String*/ ,_item.displayfield /*String*/ );
 break; }
case 15: {
 break; }
case 16: {
 //BA.debugLineNum = 604;BA.debugLine="childList.AddLabel(item.text)";
_childlist._addlabel /*String*/ (_item.text /*String*/ );
 break; }
}
;
 }
};
 //BA.debugLineNum = 607;BA.debugLine="lix.SetList(childList)";
_lix._setlist /*b4j.example.vmlistitem*/ (_childlist);
 //BA.debugLineNum = 608;BA.debugLine="lix.SetExpand(True)";
_lix._setexpand /*b4j.example.vmlistitem*/ (__c.True);
 //BA.debugLineNum = 609;BA.debugLine="lix.Pop(Lst)";
_lix._pop /*String*/ (_lst);
 break; }
}
;
 }
};
 //BA.debugLineNum = 612;BA.debugLine="Lst.Pop(Bag)";
_lst._pop /*String*/ (_bag);
 //BA.debugLineNum = 613;BA.debugLine="Return Bag.tostring";
if (true) return _bag._tostring /*String*/ ();
 //BA.debugLineNum = 614;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
