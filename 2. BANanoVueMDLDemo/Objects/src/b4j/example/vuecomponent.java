package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vuecomponent extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vuecomponent", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vuecomponent.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.Map _methods = null;
public anywheresoftware.b4a.objects.collections.Map _data = null;
public b4j.example.vuehtml _template = null;
public anywheresoftware.b4a.objects.collections.Map _computed = null;
public anywheresoftware.b4a.objects.collections.Map _watches = null;
public com.ab.banano.BANanoObject _created = null;
public com.ab.banano.BANanoObject _mounted = null;
public com.ab.banano.BANanoObject _beforecreate = null;
public com.ab.banano.BANanoObject _destroyed = null;
public com.ab.banano.BANanoObject _beforemount = null;
public com.ab.banano.BANanoObject _updated = null;
public com.ab.banano.BANanoObject _beforedestroy = null;
public com.ab.banano.BANanoObject _activated = null;
public com.ab.banano.BANanoObject _deactivated = null;
public com.ab.banano.BANanoObject _beforeupdate = null;
public anywheresoftware.b4a.objects.collections.Map _opt = null;
public String _url = "";
public String _name = "";
public boolean _hascontent = false;
public anywheresoftware.b4a.objects.collections.Map _refs = null;
public anywheresoftware.b4a.objects.collections.List _props = null;
public String _propfrom = "";
public com.ab.banano.BANanoObject _bovue = null;
public String _showkey = "";
public String _diskey = "";
public Object _module = null;
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
public String  _addbr() throws Exception{
 //BA.debugLineNum = 676;BA.debugLine="Sub AddBR";
 //BA.debugLineNum = 677;BA.debugLine="Template.SetText(\"<br>\")";
_template._settext /*b4j.example.vuehtml*/ ("<br>");
 //BA.debugLineNum = 678;BA.debugLine="End Sub";
return "";
}
public String  _addchild(String _child) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub AddChild(child As String)";
 //BA.debugLineNum = 75;BA.debugLine="SetText(child)";
_settext(_child);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _strline = "";
 //BA.debugLineNum = 102;BA.debugLine="Sub AddChildren(lst As List)";
 //BA.debugLineNum = 103;BA.debugLine="For Each strLine As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strline = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 104;BA.debugLine="SetText(strLine)";
_settext(_strline);
 }
};
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 686;BA.debugLine="Sub AddClass(c As String) As VueComponent";
 //BA.debugLineNum = 687;BA.debugLine="Template.AddClass(c)";
_template._addclass /*b4j.example.vuehtml*/ (_c);
 //BA.debugLineNum = 688;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _addelement(b4j.example.vmelement _el) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub AddElement(el As VMElement) As VueComponent";
 //BA.debugLineNum = 79;BA.debugLine="AddChild(el.ToString)";
_addchild(_el._tostring /*String*/ ());
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public String  _addhr() throws Exception{
 //BA.debugLineNum = 681;BA.debugLine="Sub AddHR";
 //BA.debugLineNum = 682;BA.debugLine="Template.SetText(\"<hr>\")";
_template._settext /*b4j.example.vuehtml*/ ("<hr>");
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _addprop(String _propname) throws Exception{
 //BA.debugLineNum = 938;BA.debugLine="Sub AddProp(propName As String) As VueComponent";
 //BA.debugLineNum = 939;BA.debugLine="props.Add(propName)";
_props.Add((Object)(_propname));
 //BA.debugLineNum = 940;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 941;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _addprops(anywheresoftware.b4a.objects.collections.List _propslist) throws Exception{
String _k = "";
 //BA.debugLineNum = 943;BA.debugLine="Sub AddProps(propsList As List) As VueComponent";
 //BA.debugLineNum = 944;BA.debugLine="For Each k As String In propsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _propslist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 945;BA.debugLine="AddProp(k)";
_addprop(_k);
 }
};
 //BA.debugLineNum = 947;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 948;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _addstyle(String _prop,Object _val) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 951;BA.debugLine="Sub AddStyle(prop As String, val As Object) As Vue";
 //BA.debugLineNum = 952;BA.debugLine="If val = Null Then Return Me";
if (_val== null) { 
if (true) return (b4j.example.vuecomponent)(this);};
 //BA.debugLineNum = 953;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 954;BA.debugLine="m.Put(prop, val)";
_m.Put((Object)(_prop),_val);
 //BA.debugLineNum = 955;BA.debugLine="SetStyle(m)";
_setstyle(_m);
 //BA.debugLineNum = 956;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 957;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 4;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="Private methods As Map";
_methods = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Private Template As VueHTML";
_template = new b4j.example.vuehtml();
 //BA.debugLineNum = 8;BA.debugLine="Private computed As Map";
_computed = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private watches As Map";
_watches = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private created As BANanoObject";
_created = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 11;BA.debugLine="Private mounted As BANanoObject";
_mounted = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 12;BA.debugLine="Private beforeCreate As BANanoObject";
_beforecreate = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 13;BA.debugLine="Private destroyed As BANanoObject";
_destroyed = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 14;BA.debugLine="Private beforeMount As BANanoObject";
_beforemount = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 15;BA.debugLine="Private updated As BANanoObject";
_updated = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 16;BA.debugLine="Private beforeDestroy As BANanoObject";
_beforedestroy = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 17;BA.debugLine="Private activated As BANanoObject";
_activated = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 18;BA.debugLine="Private deactivated As BANanoObject";
_deactivated = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 19;BA.debugLine="Private beforeUpdate As BANanoObject";
_beforeupdate = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 20;BA.debugLine="Private opt As Map";
_opt = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 21;BA.debugLine="Public URL As String";
_url = "";
 //BA.debugLineNum = 22;BA.debugLine="Public name As String";
_name = "";
 //BA.debugLineNum = 23;BA.debugLine="Public hasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 24;BA.debugLine="Private refs As Map";
_refs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 25;BA.debugLine="Private props As List";
_props = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 26;BA.debugLine="Private propFrom As String";
_propfrom = "";
 //BA.debugLineNum = 27;BA.debugLine="Private boVUE As BANanoObject";
_bovue = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 28;BA.debugLine="Private showKey As String";
_showkey = "";
 //BA.debugLineNum = 29;BA.debugLine="Private disKey As String";
_diskey = "";
 //BA.debugLineNum = 30;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _clear(boolean _b) throws Exception{
 //BA.debugLineNum = 701;BA.debugLine="Sub Clear(b As Boolean) As VueComponent";
 //BA.debugLineNum = 702;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vuecomponent)(this);};
 //BA.debugLineNum = 703;BA.debugLine="Template.Clear";
_template._clear /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 704;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 705;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _compile(String _html) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub Compile(html As String) As BANanoObject";
 //BA.debugLineNum = 36;BA.debugLine="Dim bo As BANanoObject = boVUE.RunMethod(\"compile";
_bo = new com.ab.banano.BANanoObject();
_bo = _bovue.RunMethod("compile",(Object)(new Object[]{(Object)(_html)}));
 //BA.debugLineNum = 37;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _component() throws Exception{
String _tmp = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 206;BA.debugLine="Sub Component() As Map";
 //BA.debugLineNum = 207;BA.debugLine="Dim tmp As String = Template.tostring";
_tmp = _template._tostring /*String*/ ();
 //BA.debugLineNum = 208;BA.debugLine="If data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 209;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"re";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(this,"returnData",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 210;BA.debugLine="opt.Put(\"data\", cb)";
_opt.Put((Object)("data"),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 212;BA.debugLine="If methods.Size > 0 Then opt.Put(\"methods\", metho";
if (_methods.getSize()>0) { 
_opt.Put((Object)("methods"),(Object)(_methods.getObject()));};
 //BA.debugLineNum = 213;BA.debugLine="If computed.Size > 0 Then opt.Put(\"computed\", com";
if (_computed.getSize()>0) { 
_opt.Put((Object)("computed"),(Object)(_computed.getObject()));};
 //BA.debugLineNum = 214;BA.debugLine="If watches.Size > 0 Then opt.Put(\"watch\", watches";
if (_watches.getSize()>0) { 
_opt.Put((Object)("watch"),(Object)(_watches.getObject()));};
 //BA.debugLineNum = 215;BA.debugLine="If props.Size <> 0 Then opt.Put(\"props\", props)";
if (_props.getSize()!=0) { 
_opt.Put((Object)("props"),(Object)(_props.getObject()));};
 //BA.debugLineNum = 216;BA.debugLine="If updated <> Null Then opt.Put(\"updated\", update";
if (_updated!= null) { 
_opt.Put((Object)("updated"),(Object)(_updated.getObject()));};
 //BA.debugLineNum = 217;BA.debugLine="If destroyed <> Null Then opt.Put(\"destroyed\", de";
if (_destroyed!= null) { 
_opt.Put((Object)("destroyed"),(Object)(_destroyed.getObject()));};
 //BA.debugLineNum = 218;BA.debugLine="If mounted <> Null Then	opt.Put(\"mounted\", mounte";
if (_mounted!= null) { 
_opt.Put((Object)("mounted"),(Object)(_mounted.getObject()));};
 //BA.debugLineNum = 219;BA.debugLine="If beforeCreate <> Null Then opt.Put(\"beforeCreat";
if (_beforecreate!= null) { 
_opt.Put((Object)("beforeCreate"),(Object)(_beforecreate.getObject()));};
 //BA.debugLineNum = 220;BA.debugLine="If created <> Null Then opt.Put(\"created\", create";
if (_created!= null) { 
_opt.Put((Object)("created"),(Object)(_created.getObject()));};
 //BA.debugLineNum = 221;BA.debugLine="If beforeMount <> Null Then opt.Put(\"beforeMount\"";
if (_beforemount!= null) { 
_opt.Put((Object)("beforeMount"),(Object)(_beforemount.getObject()));};
 //BA.debugLineNum = 222;BA.debugLine="If beforeUpdate <> Null Then opt.Put(\"beforeUpdat";
if (_beforeupdate!= null) { 
_opt.Put((Object)("beforeUpdate"),(Object)(_beforeupdate.getObject()));};
 //BA.debugLineNum = 223;BA.debugLine="If activated <> Null Then opt.Put(\"activated\", ac";
if (_activated!= null) { 
_opt.Put((Object)("activated"),(Object)(_activated.getObject()));};
 //BA.debugLineNum = 224;BA.debugLine="If deactivated <> Null Then opt.Put(\"deactivated\"";
if (_deactivated!= null) { 
_opt.Put((Object)("deactivated"),(Object)(_deactivated.getObject()));};
 //BA.debugLineNum = 225;BA.debugLine="If beforeDestroy <> Null Then opt.Put(\"beforeDest";
if (_beforedestroy!= null) { 
_opt.Put((Object)("beforeDestroy"),(Object)(_beforedestroy.getObject()));};
 //BA.debugLineNum = 226;BA.debugLine="opt.Put(\"template\", tmp)";
_opt.Put((Object)("template"),(Object)(_tmp));
 //BA.debugLineNum = 227;BA.debugLine="Return opt";
if (true) return _opt;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public Object  _getstate(String _k,Object _v) throws Exception{
Object _out = null;
 //BA.debugLineNum = 435;BA.debugLine="Sub GetState(k As String, v As Object) As Object";
 //BA.debugLineNum = 436;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 437;BA.debugLine="If data.ContainsKey(k) Then";
if (_data.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 438;BA.debugLine="Dim out As Object = data.GetDefault(k,v)";
_out = _data.GetDefault((Object)(_k),_v);
 //BA.debugLineNum = 439;BA.debugLine="Return out";
if (true) return _out;
 }else {
 //BA.debugLineNum = 441;BA.debugLine="Log(\"GetState: First set the v-model for \" & k)";
__c.Log("GetState: First set the v-model for "+_k);
 //BA.debugLineNum = 442;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sm = null;
String _lstrec = "";
Object _state = null;
 //BA.debugLineNum = 424;BA.debugLine="Sub GetStates(lst As List) As Map";
 //BA.debugLineNum = 425;BA.debugLine="Dim sm As Map = CreateMap()";
_sm = new anywheresoftware.b4a.objects.collections.Map();
_sm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 426;BA.debugLine="For Each lstrec As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lstrec = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 427;BA.debugLine="lstrec = lstrec.tolowercase";
_lstrec = _lstrec.toLowerCase();
 //BA.debugLineNum = 428;BA.debugLine="Dim state As Object = GetState(lstrec, Null)";
_state = _getstate(_lstrec,__c.Null);
 //BA.debugLineNum = 429;BA.debugLine="sm.Put(lstrec, state)";
_sm.Put((Object)(_lstrec),_state);
 }
};
 //BA.debugLineNum = 431;BA.debugLine="Return sm";
if (true) return _sm;
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(String _k) throws Exception{
 //BA.debugLineNum = 420;BA.debugLine="Sub HasState(k As String) As Boolean";
 //BA.debugLineNum = 421;BA.debugLine="Return data.ContainsKey(k)";
if (true) return _data.ContainsKey((Object)(_k));
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return false;
}
public b4j.example.vuecomponent  _initialize(anywheresoftware.b4a.BA _ba,String _sid,String _tag,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 108;BA.debugLine="Public Sub Initialize(sid As String, tag As String";
 //BA.debugLineNum = 109;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 110;BA.debugLine="ID = ID.trim";
_id = _id.trim();
 //BA.debugLineNum = 111;BA.debugLine="name = sid";
_name = _sid;
 //BA.debugLineNum = 112;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 113;BA.debugLine="props.Initialize";
_props.Initialize();
 //BA.debugLineNum = 114;BA.debugLine="Template.Initialize(ID,tag)";
_template._initialize /*b4j.example.vuehtml*/ (ba,_id,_tag);
 //BA.debugLineNum = 115;BA.debugLine="methods.Initialize";
_methods.Initialize();
 //BA.debugLineNum = 116;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 117;BA.debugLine="computed.Initialize";
_computed.Initialize();
 //BA.debugLineNum = 118;BA.debugLine="watches.Initialize";
_watches.Initialize();
 //BA.debugLineNum = 119;BA.debugLine="beforeMount = Null";
_beforemount.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 120;BA.debugLine="beforeUpdate = Null";
_beforeupdate.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 121;BA.debugLine="created = Null";
_created.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 122;BA.debugLine="mounted = Null";
_mounted.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 123;BA.debugLine="destroyed = Null";
_destroyed.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 124;BA.debugLine="updated = Null";
_updated.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 125;BA.debugLine="beforeCreate = Null";
_beforecreate.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 126;BA.debugLine="activated = Null";
_activated.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 127;BA.debugLine="deactivated = Null";
_deactivated.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 128;BA.debugLine="beforeDestroy = Null";
_beforedestroy.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 129;BA.debugLine="opt = CreateMap()";
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 130;BA.debugLine="URL = $\"/${ID}\"$";
_url = ("/"+__c.SmartStringFormatter("",(Object)(_id))+"");
 //BA.debugLineNum = 131;BA.debugLine="hasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 132;BA.debugLine="boVUE.Initialize(\"Vue\")";
_bovue.Initialize((Object)("Vue"));
 //BA.debugLineNum = 133;BA.debugLine="showKey = $\"${ID}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"show");
 //BA.debugLineNum = 134;BA.debugLine="disKey = $\"${ID}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_id))+"disabled");
 //BA.debugLineNum = 135;BA.debugLine="SetStateSingle(showKey, True)";
_setstatesingle(_showkey,(Object)(__c.True));
 //BA.debugLineNum = 136;BA.debugLine="SetVShow(showKey)";
_setvshow(_showkey);
 //BA.debugLineNum = 137;BA.debugLine="SetStateSingle(disKey, False)";
_setstatesingle(_diskey,(Object)(__c.False));
 //BA.debugLineNum = 138;BA.debugLine="SetDisabled(False)";
_setdisabled(__c.False);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vuecomponent _p) throws Exception{
String _sout = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub Pop(p As VueComponent)";
 //BA.debugLineNum = 70;BA.debugLine="Dim sout As String = ToString";
_sout = _tostring();
 //BA.debugLineNum = 71;BA.debugLine="p.SetText(sout)";
_p._settext /*b4j.example.vuecomponent*/ (_sout);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _removeclass(String _classname) throws Exception{
 //BA.debugLineNum = 696;BA.debugLine="Sub RemoveClass(className As String) As VueCompone";
 //BA.debugLineNum = 697;BA.debugLine="RemoveClass(className)";
_removeclass(_classname);
 //BA.debugLineNum = 698;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 699;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _renderit() throws Exception{
anywheresoftware.b4a.objects.collections.Map _option = null;
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 53;BA.debugLine="Sub RenderIt As BANanoObject";
 //BA.debugLineNum = 54;BA.debugLine="Dim option As Map = CreateMap(\"template\" : $\"{{ $";
_option = new anywheresoftware.b4a.objects.collections.Map();
_option = __c.createMap(new Object[] {(Object)("template"),(Object)(("{{ "+__c.SmartStringFormatter("",(Object)(_propfrom))+" }}"))});
 //BA.debugLineNum = 55;BA.debugLine="Dim bo As BANanoObject = BANano.RunJavascriptMeth";
_bo = new com.ab.banano.BANanoObject();
_bo.setObject((java.lang.Object)(_banano.RunJavascriptMethod("createElement",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_option.getObject())}))));
 //BA.debugLineNum = 56;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _renderto(String _elid) throws Exception{
String _dkey = "";
String _rkey = "";
 //BA.debugLineNum = 231;BA.debugLine="Sub RenderTo(elID As String)";
 //BA.debugLineNum = 232;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 233;BA.debugLine="BANano.GetElement($\"#${elID}\"$).empty";
_banano.GetElement(("#"+__c.SmartStringFormatter("",(Object)(_elid))+"")).Empty();
 //BA.debugLineNum = 235;BA.debugLine="Dim boVUE As BANanoObject";
_bovue = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 236;BA.debugLine="opt.Put(\"el\", $\"#${elID}\"$)";
_opt.Put((Object)("el"),(Object)(("#"+__c.SmartStringFormatter("",(Object)(_elid))+"")));
 //BA.debugLineNum = 237;BA.debugLine="Component";
_component();
 //BA.debugLineNum = 238;BA.debugLine="boVUE.Initialize2(\"Vue\", opt)";
_bovue.Initialize2("Vue",(Object)(_opt.getObject()));
 //BA.debugLineNum = 240;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
 //BA.debugLineNum = 241;BA.debugLine="data = boVUE.GetField(dKey).Result";
_data.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_dkey).Result()));
 //BA.debugLineNum = 243;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
 //BA.debugLineNum = 244;BA.debugLine="refs = boVUE.GetField(rKey).result";
_refs.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_rkey).Result()));
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _returndata() throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="private Sub ReturnData As Map";
 //BA.debugLineNum = 346;BA.debugLine="Return data";
if (true) return _data;
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setactivated(String _methodname) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetActivated(methodName As String) As VueCompo";
 //BA.debugLineNum = 265;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 266;BA.debugLine="activated = BANano.CallBack(module, methodName, N";
_activated.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setalt(String _a) throws Exception{
 //BA.debugLineNum = 603;BA.debugLine="Sub SetAlt(a As String) As VueComponent";
 //BA.debugLineNum = 604;BA.debugLine="Template.SetAlt(a)";
_template._setalt /*b4j.example.vuehtml*/ (_a);
 //BA.debugLineNum = 605;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 606;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setattr(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 639;BA.debugLine="Sub SetAttr(m As Map) As VueComponent";
 //BA.debugLineNum = 640;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 641;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 642;BA.debugLine="Template.SetAttr(k, v)";
_template._setattr /*b4j.example.vuehtml*/ (_k,BA.ObjectToString(_v));
 }
};
 //BA.debugLineNum = 644;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setautocomplete(String _auto,boolean _bind) throws Exception{
 //BA.debugLineNum = 802;BA.debugLine="Sub SetAutoComplete(auto As String, bind As Boolea";
 //BA.debugLineNum = 803;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 804;BA.debugLine="SetAttr(CreateMap(\":autocomplete\": auto))";
_setattr(__c.createMap(new Object[] {(Object)(":autocomplete"),(Object)(_auto)}));
 }else {
 //BA.debugLineNum = 806;BA.debugLine="SetAttr(CreateMap(\"autocomplete\": auto))";
_setattr(__c.createMap(new Object[] {(Object)("autocomplete"),(Object)(_auto)}));
 };
 //BA.debugLineNum = 808;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbackgroundcolor(Object _p) throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Sub SetBackgroundColor(p As Object) As VueComponen";
 //BA.debugLineNum = 461;BA.debugLine="SetStyle(CreateMap(\"background-color\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("background-color"),_p}));
 //BA.debugLineNum = 462;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbeforecreate(String _methodname) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetBeforeCreate(methodName As String) As VueCo";
 //BA.debugLineNum = 321;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 322;BA.debugLine="beforeCreate = BANano.CallBack(module, methodName";
_beforecreate.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbeforedestroy(String _methodname) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetBeforeDestroy(methodName As String) As VueC";
 //BA.debugLineNum = 302;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 303;BA.debugLine="beforeDestroy = BANano.CallBack(module, methodNam";
_beforedestroy.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbeforemount(String _methodname) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetBeforeMount(methodName As String) As VueCom";
 //BA.debugLineNum = 288;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 289;BA.debugLine="beforeMount = BANano.CallBack(module, methodName,";
_beforemount.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbeforeupdate(String _methodname) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetBeforeUpdate(methodName As String) As VueCo";
 //BA.debugLineNum = 295;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 296;BA.debugLine="beforeMount = BANano.CallBack(module, methodName,";
_beforemount.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setborder(String _width,String _color,String _bstyle) throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 812;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
 //BA.debugLineNum = 813;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 814;BA.debugLine="b.Put(\"border-style\", bstyle)";
_b.Put((Object)("border-style"),(Object)(_bstyle));
 //BA.debugLineNum = 815;BA.debugLine="b.Put(\"border-width\", width)";
_b.Put((Object)("border-width"),(Object)(_width));
 //BA.debugLineNum = 816;BA.debugLine="b.Put(\"border-color\", color)";
_b.Put((Object)("border-color"),(Object)(_color));
 //BA.debugLineNum = 817;BA.debugLine="SetStyle(b)";
_setstyle(_b);
 //BA.debugLineNum = 818;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 819;BA.debugLine="End Sub";
return null;
}
public String  _setcallback(String _methodname,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 858;BA.debugLine="Sub SetCallBack(methodName As String, cb As BANano";
 //BA.debugLineNum = 859;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 860;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 //BA.debugLineNum = 861;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _setchecked(boolean _b) throws Exception{
 //BA.debugLineNum = 691;BA.debugLine="Sub SetChecked(b As Boolean) As VueComponent";
 //BA.debugLineNum = 692;BA.debugLine="SetAttr(CreateMap(\":checked\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":checked"),(Object)(_b)}));
 //BA.debugLineNum = 693;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 694;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setcolor(Object _c) throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub SetColor(c As Object) As VueComponent";
 //BA.debugLineNum = 449;BA.debugLine="SetStyle(CreateMap(\"color\": c))";
_setstyle(__c.createMap(new Object[] {(Object)("color"),_c}));
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setcomputed(String _k,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 350;BA.debugLine="Sub SetComputed(k As String, methodName As String)";
 //BA.debugLineNum = 351;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 352;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 353;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 354;BA.debugLine="If data.ContainsKey(k) Then";
if (_data.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 355;BA.debugLine="SetStateSingle(k, Null)";
_setstatesingle(_k,__c.Null);
 };
 //BA.debugLineNum = 357;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 358;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 359;BA.debugLine="computed.Put(k, cb)";
_computed.Put((Object)(_k),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setcreated(String _methodname) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetCreated(methodName As String) As VueCompone";
 //BA.debugLineNum = 329;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 330;BA.debugLine="created = BANano.CallBack(module, methodName, Nul";
_created.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setcursormove() throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Sub SetCursorMove As VueComponent";
 //BA.debugLineNum = 823;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"move\"))";
_setstyle(__c.createMap(new Object[] {(Object)("cursor"),(Object)("move")}));
 //BA.debugLineNum = 824;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 825;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setdeactivated(String _methodname) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetDeActivated(methodName As String) As VueCom";
 //BA.debugLineNum = 273;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 274;BA.debugLine="deactivated = BANano.CallBack(module, methodName,";
_deactivated.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setdestroyed(String _methodname) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetDestroyed(methodName As String) As VueCompo";
 //BA.debugLineNum = 257;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 258;BA.debugLine="destroyed = BANano.CallBack(module, methodName, N";
_destroyed.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 624;BA.debugLine="Sub SetDisabled(b As Boolean) As VueComponent";
 //BA.debugLineNum = 625;BA.debugLine="Template.SetAttr(\":disabled\", b)";
_template._setattr /*b4j.example.vuehtml*/ (":disabled",BA.ObjectToString(_b));
 //BA.debugLineNum = 626;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return null;
}
public String  _setdisabledstate(String _k,boolean _v) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
 //BA.debugLineNum = 195;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 196;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle(_diskey,(Object)(_v));
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _setdraggable(boolean _b) throws Exception{
 //BA.debugLineNum = 834;BA.debugLine="Sub SetDraggable(b As Boolean) As VueComponent";
 //BA.debugLineNum = 835;BA.debugLine="SetAttr(CreateMap(\":draggable\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":draggable"),(Object)(_b)}));
 //BA.debugLineNum = 836;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setdroppable(boolean _b) throws Exception{
 //BA.debugLineNum = 840;BA.debugLine="Sub SetDroppable(b As Boolean) As VueComponent";
 //BA.debugLineNum = 841;BA.debugLine="SetAttr(CreateMap(\":droppable\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":droppable"),(Object)(_b)}));
 //BA.debugLineNum = 842;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setfunctional(boolean _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetFunctional(b As Boolean) As VueComponent";
 //BA.debugLineNum = 41;BA.debugLine="opt.Put(\"functional\", b)";
_opt.Put((Object)("functional"),(Object)(_b));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 852;BA.debugLine="Sub SetHeight(h As String) As VueComponent";
 //BA.debugLineNum = 853;BA.debugLine="SetStyle(CreateMap(\"height\":h))";
_setstyle(__c.createMap(new Object[] {(Object)("height"),(Object)(_h)}));
 //BA.debugLineNum = 854;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 855;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _sethref(String _h) throws Exception{
 //BA.debugLineNum = 619;BA.debugLine="Sub SetHREF(h As String) As VueComponent";
 //BA.debugLineNum = 620;BA.debugLine="Template.SetAttrHREF(h)";
_template._setattrhref /*b4j.example.vuehtml*/ (_h);
 //BA.debugLineNum = 621;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setid(String _sid,boolean _bind) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetID(sid As String, bind As Boolean) As VueCo";
 //BA.debugLineNum = 84;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 85;BA.debugLine="SetAttr(CreateMap(\":id\":sid))";
_setattr(__c.createMap(new Object[] {(Object)(":id"),(Object)(_sid)}));
 }else {
 //BA.debugLineNum = 87;BA.debugLine="SetAttr(CreateMap(\"id\":sid))";
_setattr(__c.createMap(new Object[] {(Object)("id"),(Object)(_sid)}));
 };
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setis(String _t) throws Exception{
 //BA.debugLineNum = 760;BA.debugLine="Sub SetIs(t As String) As VueComponent";
 //BA.debugLineNum = 761;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 762;BA.debugLine="SetAttr(CreateMap(\":is\": t))";
_setattr(__c.createMap(new Object[] {(Object)(":is"),(Object)(_t)}));
 //BA.debugLineNum = 763;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 764;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setishidden(boolean _b) throws Exception{
 //BA.debugLineNum = 707;BA.debugLine="Sub SetIsHidden(b As Boolean) As VueComponent";
 //BA.debugLineNum = 708;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vuecomponent)(this);};
 //BA.debugLineNum = 709;BA.debugLine="AddClass(\"is-hidden\")";
_addclass("is-hidden");
 //BA.debugLineNum = 710;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 711;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setkey(Object _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 718;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VueCom";
 //BA.debugLineNum = 719;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 720;BA.debugLine="SetAttr(CreateMap(\":key\": k))";
_setattr(__c.createMap(new Object[] {(Object)(":key"),_k}));
 }else {
 //BA.debugLineNum = 722;BA.debugLine="SetAttr(CreateMap(\"key\": k))";
_setattr(__c.createMap(new Object[] {(Object)("key"),_k}));
 };
 //BA.debugLineNum = 724;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setlineheight(Object _lh) throws Exception{
 //BA.debugLineNum = 634;BA.debugLine="Sub SetLineHeight(lh As Object) As VueComponent";
 //BA.debugLineNum = 635;BA.debugLine="SetStyle(CreateMap(\"line-height\": lh))";
_setstyle(__c.createMap(new Object[] {(Object)("line-height"),_lh}));
 //BA.debugLineNum = 636;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 637;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmarginall(Object _p) throws Exception{
 //BA.debugLineNum = 578;BA.debugLine="Sub SetMarginAll(p As Object) As VueComponent";
 //BA.debugLineNum = 579;BA.debugLine="SetStyle(CreateMap(\"margin\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("margin"),_p}));
 //BA.debugLineNum = 580;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmargins(Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
 //BA.debugLineNum = 929;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
 //BA.debugLineNum = 930;BA.debugLine="AddStyle(\"margin-top\", mt)";
_addstyle("margin-top",_mt);
 //BA.debugLineNum = 931;BA.debugLine="AddStyle(\"margin-bottom\", mb)";
_addstyle("margin-bottom",_mb);
 //BA.debugLineNum = 932;BA.debugLine="AddStyle(\"margin-left\", ml)";
_addstyle("margin-left",_ml);
 //BA.debugLineNum = 933;BA.debugLine="AddStyle(\"margin-right\", mr)";
_addstyle("margin-right",_mr);
 //BA.debugLineNum = 934;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 935;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmaxwidth(String _mw) throws Exception{
 //BA.debugLineNum = 609;BA.debugLine="Sub SetMaxWidth(mw As String) As VueComponent";
 //BA.debugLineNum = 610;BA.debugLine="Template.SetStyle(\"max-width\",mw)";
_template._setstyle /*b4j.example.vuehtml*/ ("max-width",_mw);
 //BA.debugLineNum = 611;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmethod(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 335;BA.debugLine="Sub SetMethod(methodName As String) As VueComponen";
 //BA.debugLineNum = 336;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 337;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 338;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 339;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 340;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmounted(String _methodname) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetMounted(methodName As String) As VueCompone";
 //BA.debugLineNum = 249;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 250;BA.debugLine="mounted = BANano.CallBack(module, methodName, Nul";
_mounted.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setname(String _sid,boolean _bind) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetName(sid As String, bind As Boolean) As Vue";
 //BA.debugLineNum = 93;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 94;BA.debugLine="SetAttr(CreateMap(\":name\":sid))";
_setattr(__c.createMap(new Object[] {(Object)(":name"),(Object)(_sid)}));
 }else {
 //BA.debugLineNum = 96;BA.debugLine="SetAttr(CreateMap(\"name\":sid))";
_setattr(__c.createMap(new Object[] {(Object)("name"),(Object)(_sid)}));
 };
 //BA.debugLineNum = 98;BA.debugLine="name = sid";
_name = _sid;
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonblur(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 496;BA.debugLine="Sub SetOnBlur(methodName As String) As VueComponen";
 //BA.debugLineNum = 497;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 498;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 499;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 500;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 501;BA.debugLine="SetAttr(CreateMap(\"v-on:blur\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:blur"),(Object)(_methodname)}));
 //BA.debugLineNum = 503;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 505;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonchange(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 529;BA.debugLine="Sub SetOnChange(methodName As String) As VueCompon";
 //BA.debugLineNum = 530;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 531;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 532;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 533;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 534;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
 //BA.debugLineNum = 536;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 538;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 515;BA.debugLine="Sub SetOnClick(methodName As String) As VueCompone";
 //BA.debugLineNum = 516;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 517;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 518;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 519;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 520;BA.debugLine="SetAttr(CreateMap(\"v-on:click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:click"),(Object)(_methodname)}));
 //BA.debugLineNum = 522;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 //BA.debugLineNum = 523;BA.debugLine="SetPointer(True)";
_setpointer(__c.True);
 };
 //BA.debugLineNum = 525;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondragend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 890;BA.debugLine="Sub SetOnDragEnd(methodName As String) As VueCompo";
 //BA.debugLineNum = 891;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 892;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 893;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 894;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 895;BA.debugLine="SetAttr(CreateMap(\"v-on:dragend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:dragend"),(Object)(_methodname)}));
 //BA.debugLineNum = 897;BA.debugLine="SetCallBack(methodName, cb)";
_setcallback(_methodname,_cb);
 };
 //BA.debugLineNum = 899;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondragenter(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 903;BA.debugLine="Sub SetOnDragEnter(methodName As String) As VueCom";
 //BA.debugLineNum = 904;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 905;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 906;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 907;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 908;BA.debugLine="SetAttr(CreateMap(\"v-on:dragenter\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:dragenter"),(Object)(_methodname)}));
 //BA.debugLineNum = 910;BA.debugLine="SetCallBack(methodName, cb)";
_setcallback(_methodname,_cb);
 };
 //BA.debugLineNum = 912;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 913;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondragover(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 864;BA.debugLine="Sub SetOnDragOver(methodName As String) As VueComp";
 //BA.debugLineNum = 865;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 866;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 867;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 868;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 869;BA.debugLine="SetAttr(CreateMap(\"v-on:dragover\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:dragover"),(Object)(_methodname)}));
 //BA.debugLineNum = 871;BA.debugLine="SetCallBack(methodName, cb)";
_setcallback(_methodname,_cb);
 };
 //BA.debugLineNum = 873;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 874;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondragstart(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 877;BA.debugLine="Sub SetOnDragStart(methodName As String) As VueCom";
 //BA.debugLineNum = 878;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 879;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 880;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 881;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 882;BA.debugLine="SetAttr(CreateMap(\"v-on:dragstart\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:dragstart"),(Object)(_methodname)}));
 //BA.debugLineNum = 884;BA.debugLine="SetCallBack(methodName, cb)";
_setcallback(_methodname,_cb);
 };
 //BA.debugLineNum = 886;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 887;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondrop(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 916;BA.debugLine="Sub SetOnDrop(methodName As String) As VueComponen";
 //BA.debugLineNum = 917;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 918;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 919;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 920;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 921;BA.debugLine="SetAttr(CreateMap(\"v-on:drop\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:drop"),(Object)(_methodname)}));
 //BA.debugLineNum = 923;BA.debugLine="SetCallBack(methodName, cb)";
_setcallback(_methodname,_cb);
 };
 //BA.debugLineNum = 925;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 926;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonfocus(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 483;BA.debugLine="Sub SetOnFocus(methodName As String) As VueCompone";
 //BA.debugLineNum = 484;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 485;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 486;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 487;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 488;BA.debugLine="SetAttr(CreateMap(\"v-on:focus\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:focus"),(Object)(_methodname)}));
 //BA.debugLineNum = 490;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setoninput(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 470;BA.debugLine="Sub SetOnInput(methodName As String) As VueCompone";
 //BA.debugLineNum = 471;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 472;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 473;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 474;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 475;BA.debugLine="SetAttr(CreateMap(\"v-on:input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:input"),(Object)(_methodname)}));
 //BA.debugLineNum = 477;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 479;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonmouseout(String _methodname) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VueComp";
 //BA.debugLineNum = 308;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 309;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseout\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:mouseout"),(Object)(_methodname)}));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonmouseover(String _methodname) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VueCom";
 //BA.debugLineNum = 314;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 315;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseover\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:mouseover"),(Object)(_methodname)}));
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonselected(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 542;BA.debugLine="Sub SetOnSelected(methodName As String) As VueComp";
 //BA.debugLineNum = 543;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 544;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 545;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 546;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 547;BA.debugLine="SetAttr(CreateMap(\"v-on:selected\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:selected"),(Object)(_methodname)}));
 //BA.debugLineNum = 549;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setontouchstart(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 555;BA.debugLine="Sub SetOnTouchStart(methodName As String) As VueCo";
 //BA.debugLineNum = 556;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 557;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 558;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 559;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 560;BA.debugLine="SetAttr(CreateMap(\"v-on:touchstart\": methodName)";
_setattr(__c.createMap(new Object[] {(Object)("v-on:touchstart"),(Object)(_methodname)}));
 //BA.debugLineNum = 562;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 564;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 565;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setpadding(Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
 //BA.debugLineNum = 960;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
 //BA.debugLineNum = 961;BA.debugLine="AddStyle(\"padding-top\", pt)";
_addstyle("padding-top",_pt);
 //BA.debugLineNum = 962;BA.debugLine="AddStyle(\"padding-bottom\", pb)";
_addstyle("padding-bottom",_pb);
 //BA.debugLineNum = 963;BA.debugLine="AddStyle(\"padding-left\", pl)";
_addstyle("padding-left",_pl);
 //BA.debugLineNum = 964;BA.debugLine="AddStyle(\"padding-right\", pr)";
_addstyle("padding-right",_pr);
 //BA.debugLineNum = 965;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 966;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setpaddingall(Object _p) throws Exception{
 //BA.debugLineNum = 589;BA.debugLine="Sub SetPaddingAll(p As Object) As VueComponent";
 //BA.debugLineNum = 590;BA.debugLine="SetStyle(CreateMap(\"padding\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("padding"),_p}));
 //BA.debugLineNum = 591;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setpointer(boolean _b) throws Exception{
 //BA.debugLineNum = 509;BA.debugLine="Sub SetPointer(b As Boolean) As VueComponent";
 //BA.debugLineNum = 510;BA.debugLine="Template.SetPointer(True)";
_template._setpointer /*b4j.example.vuehtml*/ (__c.True);
 //BA.debugLineNum = 511;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setref(String _varref) throws Exception{
 //BA.debugLineNum = 727;BA.debugLine="Sub SetRef(varRef As String) As VueComponent";
 //BA.debugLineNum = 728;BA.debugLine="If varRef <> \"\" Then";
if ((_varref).equals("") == false) { 
 //BA.debugLineNum = 729;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
_setattr(__c.createMap(new Object[] {(Object)("ref"),(Object)(_varref)}));
 };
 //BA.debugLineNum = 731;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return null;
}
public String  _setshowstate(String _k,boolean _v) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
 //BA.debugLineNum = 190;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 191;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle(_showkey,(Object)(_v));
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _setsrc(String _s,boolean _bind) throws Exception{
 //BA.debugLineNum = 594;BA.debugLine="Sub SetSRC(s As String, bind As Boolean) As VueCom";
 //BA.debugLineNum = 595;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 596;BA.debugLine="SetAttr(CreateMap(\":src\":s))";
_setattr(__c.createMap(new Object[] {(Object)(":src"),(Object)(_s)}));
 }else {
 //BA.debugLineNum = 598;BA.debugLine="Template.SetSrc(s)";
_template._setsrc /*b4j.example.vuehtml*/ (_s);
 };
 //BA.debugLineNum = 600;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstate(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 410;BA.debugLine="Sub SetState(m As Map) As VueComponent";
 //BA.debugLineNum = 411;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 412;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 413;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 414;BA.debugLine="data.Put(k, v)";
_data.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatedecrement(String _k) throws Exception{
String _oldv = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub SetStateDecrement(k As String) As VueComponent";
 //BA.debugLineNum = 160;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(_getstate(_k,(Object)("0")));
 //BA.debugLineNum = 161;BA.debugLine="oldV = BANano.parseInt(oldV) - 1";
_oldv = BA.NumberToString(_banano.parseInt((Object)(_oldv))-1);
 //BA.debugLineNum = 162;BA.debugLine="SetStateSingle(k, oldV)";
_setstatesingle(_k,(Object)(_oldv));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatefalse(String _k) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetStateFalse(k As String) As VueComponent";
 //BA.debugLineNum = 148;BA.debugLine="SetStateSingle(k,False)";
_setstatesingle(_k,(Object)(__c.False));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstateincrement(String _k) throws Exception{
String _oldv = "";
 //BA.debugLineNum = 152;BA.debugLine="Sub SetStateIncrement(k As String) As VueComponent";
 //BA.debugLineNum = 153;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(_getstate(_k,(Object)("0")));
 //BA.debugLineNum = 154;BA.debugLine="oldV = BANano.parseInt(oldV) + 1";
_oldv = BA.NumberToString(_banano.parseInt((Object)(_oldv))+1);
 //BA.debugLineNum = 155;BA.debugLine="SetStateSingle(k, oldV)";
_setstatesingle(_k,(Object)(_oldv));
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatelist(String _mapkey,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
 //BA.debugLineNum = 394;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 395;BA.debugLine="opt.Put(mapKey, mapValues)";
_opt.Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
 //BA.debugLineNum = 396;BA.debugLine="SetState(opt)";
_setstate(_opt);
 //BA.debugLineNum = 397;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatelistvalues(anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
String _lstvalue = "";
 //BA.debugLineNum = 400;BA.debugLine="Sub SetStateListValues(mapValues As List) As VueCo";
 //BA.debugLineNum = 401;BA.debugLine="For Each lstValue As String In mapValues";
{
final anywheresoftware.b4a.BA.IterableList group1 = _mapvalues;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstvalue = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 402;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 403;BA.debugLine="opt.Put(lstValue, \"\")";
_opt.Put((Object)(_lstvalue),(Object)(""));
 //BA.debugLineNum = 404;BA.debugLine="SetState(opt)";
_setstate(_opt);
 }
};
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatemap(String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
 //BA.debugLineNum = 386;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 387;BA.debugLine="opt.Put(mapKey, mapValues)";
_opt.Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
 //BA.debugLineNum = 388;BA.debugLine="SetState(opt)";
_setstate(_opt);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatesingle(String _k,Object _v) throws Exception{
anywheresoftware.b4a.objects.collections.Map _optx = null;
 //BA.debugLineNum = 167;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As Vu";
 //BA.debugLineNum = 168;BA.debugLine="Dim optx As Map = CreateMap()";
_optx = new anywheresoftware.b4a.objects.collections.Map();
_optx = __c.createMap(new Object[] {});
 //BA.debugLineNum = 169;BA.debugLine="optx.Put(k, v)";
_optx.Put((Object)(_k),_v);
 //BA.debugLineNum = 170;BA.debugLine="SetState(optx)";
_setstate(_optx);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatetrue(String _k) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetStateTrue(k As String) As VueComponent";
 //BA.debugLineNum = 143;BA.debugLine="SetStateSingle(k,True)";
_setstatesingle(_k,(Object)(__c.True));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 453;BA.debugLine="Sub SetStyle(m As Map) As VueComponent";
 //BA.debugLineNum = 454;BA.debugLine="Template.SetStyles(m)";
_template._setstyles /*b4j.example.vuehtml*/ (_m);
 //BA.debugLineNum = 455;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetTabIndex(ti As String) As VueComponent";
 //BA.debugLineNum = 65;BA.debugLine="Template.SetTabIndex(ti)";
_template._settabindex /*b4j.example.vuehtml*/ (_ti);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settag(String _t) throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Sub SetTag(t As String) As VueComponent";
 //BA.debugLineNum = 584;BA.debugLine="Template.SetTag(t)";
_template._settag /*b4j.example.vuehtml*/ (_t);
 //BA.debugLineNum = 585;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settemplate(String _tmp) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetTemplate(tmp As String) As VueComponent";
 //BA.debugLineNum = 201;BA.debugLine="Template.clear";
_template._clear /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 202;BA.debugLine="Template.SetText(tmp)";
_template._settext /*b4j.example.vuehtml*/ (_tmp);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settext(String _txt) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Sub SetText(txt As String) As VueComponent";
 //BA.debugLineNum = 670;BA.debugLine="Template.settext(txt)";
_template._settext /*b4j.example.vuehtml*/ (_txt);
 //BA.debugLineNum = 671;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 672;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settextaligncenter() throws Exception{
 //BA.debugLineNum = 828;BA.debugLine="Sub SetTextAlignCenter As VueComponent";
 //BA.debugLineNum = 829;BA.debugLine="SetStyle(CreateMap(\"text-align\": \"center\"))";
_setstyle(__c.createMap(new Object[] {(Object)("text-align"),(Object)("center")}));
 //BA.debugLineNum = 830;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 831;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setto(Object _t) throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Sub SetTo(t As Object) As VueComponent";
 //BA.debugLineNum = 615;BA.debugLine="Template.SetAttr(\"to\", t)";
_template._setattr /*b4j.example.vuehtml*/ ("to",BA.ObjectToString(_t));
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settype(String _t) throws Exception{
 //BA.debugLineNum = 713;BA.debugLine="Sub SetType(t As String) As VueComponent";
 //BA.debugLineNum = 714;BA.debugLine="Template.SetType(t)";
_template._settype /*b4j.example.vuehtml*/ (_t);
 //BA.debugLineNum = 715;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setupdated(String _methodname) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetUpdated(methodName As String) As VueCompone";
 //BA.debugLineNum = 281;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 282;BA.debugLine="updated = BANano.CallBack(module, methodName, Nul";
_updated.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvalue(String _valuename,boolean _bind) throws Exception{
 //BA.debugLineNum = 785;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
 //BA.debugLineNum = 786;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 787;BA.debugLine="valueName = valueName.tolowercase";
_valuename = _valuename.toLowerCase();
 //BA.debugLineNum = 788;BA.debugLine="SetAttr(CreateMap(\":value\":valueName))";
_setattr(__c.createMap(new Object[] {(Object)(":value"),(Object)(_valuename)}));
 }else {
 //BA.debugLineNum = 790;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
_setattr(__c.createMap(new Object[] {(Object)("value"),(Object)(_valuename)}));
 };
 //BA.debugLineNum = 792;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvbind(String _t) throws Exception{
 //BA.debugLineNum = 754;BA.debugLine="Sub SetVBind(t As String) As VueComponent";
 //BA.debugLineNum = 755;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 756;BA.debugLine="SetAttr(CreateMap(\"v-bind\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-bind"),(Object)(_t)}));
 //BA.debugLineNum = 757;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvcloak() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetVCloak As VueComponent";
 //BA.debugLineNum = 60;BA.debugLine="Template.setvcloak";
_template._setvcloak /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvelse(Object _t) throws Exception{
 //BA.debugLineNum = 739;BA.debugLine="Sub SetVElse(t As Object) As VueComponent";
 //BA.debugLineNum = 740;BA.debugLine="SetAttr(CreateMap(\"v-else\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-else"),_t}));
 //BA.debugLineNum = 741;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 742;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvelseif(Object _t) throws Exception{
 //BA.debugLineNum = 744;BA.debugLine="Sub SetVElseIf(t As Object) As VueComponent";
 //BA.debugLineNum = 745;BA.debugLine="SetAttr(CreateMap(\"v-else-if\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-else-if"),_t}));
 //BA.debugLineNum = 746;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setverticalalignmiddle() throws Exception{
 //BA.debugLineNum = 629;BA.debugLine="Sub SetVerticalAlignMiddle As VueComponent";
 //BA.debugLineNum = 630;BA.debugLine="SetStyle(CreateMap(\"vertical-align\": \"middle\"))";
_setstyle(__c.createMap(new Object[] {(Object)("vertical-align"),(Object)("middle")}));
 //BA.debugLineNum = 631;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 632;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 773;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 774;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 775;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 776;BA.debugLine="If StateExists(dataSource) = False Then";
if (_stateexists(_datasource)==__c.False) { 
 //BA.debugLineNum = 777;BA.debugLine="Log(\"VueComponent.SetVFor: The data source state";
__c.Log("VueComponent.SetVFor: The data source state has not been registered, register it first!");
 };
 //BA.debugLineNum = 779;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 780;BA.debugLine="SetAttr(CreateMap(\"v-for\": sline))";
_setattr(__c.createMap(new Object[] {(Object)("v-for"),(Object)(_sline)}));
 //BA.debugLineNum = 781;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 782;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvhtml(String _h) throws Exception{
 //BA.debugLineNum = 795;BA.debugLine="Sub SetVHtml(h As String) As VueComponent";
 //BA.debugLineNum = 796;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vuecomponent)(this);};
 //BA.debugLineNum = 797;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
 //BA.debugLineNum = 798;BA.debugLine="SetAttr(CreateMap(\"v-html\": h))";
_setattr(__c.createMap(new Object[] {(Object)("v-html"),(Object)(_h)}));
 //BA.debugLineNum = 799;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 800;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 647;BA.debugLine="Sub SetVIf(vif As String) As VueComponent";
 //BA.debugLineNum = 648;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
 //BA.debugLineNum = 649;BA.debugLine="If HasState(vif) = False Then";
if (_hasstate(_vif)==__c.False) { 
 //BA.debugLineNum = 650;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 651;BA.debugLine="opt.Put(vif, False)";
_opt.Put((Object)(_vif),(Object)(__c.False));
 //BA.debugLineNum = 652;BA.debugLine="SetState(opt)";
_setstate(_opt);
 };
 //BA.debugLineNum = 654;BA.debugLine="SetVIf(vif)";
_setvif(_vif);
 //BA.debugLineNum = 655;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 567;BA.debugLine="Sub SetVModel(k As String) As VueComponent";
 //BA.debugLineNum = 568;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 569;BA.debugLine="If HasState(k) = False Then";
if (_hasstate(_k)==__c.False) { 
 //BA.debugLineNum = 570;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 571;BA.debugLine="opt.Put(k, Null)";
_opt.Put((Object)(_k),__c.Null);
 //BA.debugLineNum = 572;BA.debugLine="SetState(opt)";
_setstate(_opt);
 };
 //BA.debugLineNum = 574;BA.debugLine="Template.SetAttr(\"v-model\", k)";
_template._setattr /*b4j.example.vuehtml*/ ("v-model",_k);
 //BA.debugLineNum = 575;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvon(Object _t) throws Exception{
 //BA.debugLineNum = 749;BA.debugLine="Sub SetVOn(t As Object) As VueComponent";
 //BA.debugLineNum = 750;BA.debugLine="SetAttr(CreateMap(\"v-on\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-on"),_t}));
 //BA.debugLineNum = 751;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 752;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvonce(Object _t) throws Exception{
 //BA.debugLineNum = 767;BA.debugLine="Sub SetVOnce(t As Object) As VueComponent";
 //BA.debugLineNum = 768;BA.debugLine="SetAttr(CreateMap(\"v-once\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-once"),_t}));
 //BA.debugLineNum = 769;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 770;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Sub SetVShow(vif As String) As VueComponent";
 //BA.debugLineNum = 659;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
 //BA.debugLineNum = 660;BA.debugLine="If HasState(vif) = False Then";
if (_hasstate(_vif)==__c.False) { 
 //BA.debugLineNum = 661;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 662;BA.debugLine="opt.Put(vif, False)";
_opt.Put((Object)(_vif),(Object)(__c.False));
 //BA.debugLineNum = 663;BA.debugLine="SetState(opt)";
_setstate(_opt);
 };
 //BA.debugLineNum = 665;BA.debugLine="SetVShow(vif)";
_setvshow(_vif);
 //BA.debugLineNum = 666;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvtext(Object _t) throws Exception{
 //BA.debugLineNum = 734;BA.debugLine="Sub SetVText(t As Object) As VueComponent";
 //BA.debugLineNum = 735;BA.debugLine="SetAttr(CreateMap(\"v-text\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-text"),_t}));
 //BA.debugLineNum = 736;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setwatch(String _k,boolean _bimmediate,boolean _bdeep,String _methodname) throws Exception{
Object _newval = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _deepit = null;
 //BA.debugLineNum = 365;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
 //BA.debugLineNum = 366;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 367;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 368;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 369;BA.debugLine="If data.ContainsKey(k) Then";
if (_data.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 370;BA.debugLine="SetStateSingle(k, Null)";
_setstatesingle(_k,__c.Null);
 };
 //BA.debugLineNum = 372;BA.debugLine="Dim newVal As Object";
_newval = new Object();
 //BA.debugLineNum = 373;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_newval}))));
 //BA.debugLineNum = 374;BA.debugLine="Dim deepit As Map = CreateMap()";
_deepit = new anywheresoftware.b4a.objects.collections.Map();
_deepit = __c.createMap(new Object[] {});
 //BA.debugLineNum = 375;BA.debugLine="deepit.Put(\"handler\", methodName)";
_deepit.Put((Object)("handler"),(Object)(_methodname));
 //BA.debugLineNum = 376;BA.debugLine="deepit.Put(\"deep\", bDeep)";
_deepit.Put((Object)("deep"),(Object)(_bdeep));
 //BA.debugLineNum = 377;BA.debugLine="deepit.Put(\"immediate\", bImmediate)";
_deepit.Put((Object)("immediate"),(Object)(_bimmediate));
 //BA.debugLineNum = 378;BA.debugLine="watches.Put(k, deepit)";
_watches.Put((Object)(_k),(Object)(_deepit.getObject()));
 //BA.debugLineNum = 379;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 846;BA.debugLine="Sub SetWidth(w As String) As VueComponent";
 //BA.debugLineNum = 847;BA.debugLine="SetStyle(CreateMap(\"width\":w))";
_setstyle(__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
 //BA.debugLineNum = 848;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 849;BA.debugLine="End Sub";
return null;
}
public boolean  _stateexists(String _statename) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
 //BA.debugLineNum = 185;BA.debugLine="stateName = stateName.tolowercase";
_statename = _statename.toLowerCase();
 //BA.debugLineNum = 186;BA.debugLine="Return data.ContainsKey(stateName)";
if (true) return _data.ContainsKey((Object)(_statename));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return false;
}
public b4j.example.vuecomponent  _templatefromproperty(String _propname) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 45;BA.debugLine="Sub TemplateFromProperty(propName As String) As Vu";
 //BA.debugLineNum = 46;BA.debugLine="propName = propName.ToLowerCase";
_propname = _propname.toLowerCase();
 //BA.debugLineNum = 47;BA.debugLine="propFrom = propName";
_propfrom = _propname;
 //BA.debugLineNum = 48;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"Ren";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(this,"RenderIt",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 49;BA.debugLine="opt.Put(\"render\", cb)";
_opt.Put((Object)("render"),(Object)(_cb.getObject()));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _togglestate(String _statename) throws Exception{
boolean _bcurrent = false;
anywheresoftware.b4a.objects.collections.Map _optx = null;
 //BA.debugLineNum = 174;BA.debugLine="Sub ToggleState(stateName As String) As VueCompone";
 //BA.debugLineNum = 175;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,\"\")";
_bcurrent = BA.ObjectToBoolean(_getstate(_statename,(Object)("")));
 //BA.debugLineNum = 176;BA.debugLine="bcurrent = Not(bcurrent)";
_bcurrent = __c.Not(_bcurrent);
 //BA.debugLineNum = 177;BA.debugLine="Dim optx As Map = CreateMap()";
_optx = new anywheresoftware.b4a.objects.collections.Map();
_optx = __c.createMap(new Object[] {});
 //BA.debugLineNum = 178;BA.debugLine="optx.Put(stateName, bcurrent)";
_optx.Put((Object)(_statename),(Object)(_bcurrent));
 //BA.debugLineNum = 179;BA.debugLine="SetState(optx)";
_setstate(_optx);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 466;BA.debugLine="Return Template.tostring";
if (true) return _template._tostring /*String*/ ();
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
