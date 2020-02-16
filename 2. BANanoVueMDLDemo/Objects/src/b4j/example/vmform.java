package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmform extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmform", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmform.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _form = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmcontainer _container = null;
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
public b4j.example.vmform  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub AddClass(c As String) As VMForm";
 //BA.debugLineNum = 21;BA.debugLine="Form.AddClass(c)";
_form._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Form As VMElement";
_form = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 13;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 14;BA.debugLine="Form.Initialize(vue, ID).SetTag(\"form\")";
_form._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("form");
 //BA.debugLineNum = 15;BA.debugLine="Container.Initialize(vue, sid & \"grid\", eventHand";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,_sid+"grid",_eventhandler);
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 46;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub Render";
 //BA.debugLineNum = 42;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmform  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetAttr(attr As Map) As VMForm";
 //BA.debugLineNum = 32;BA.debugLine="Form.SetAttr(attr)";
_form._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _setnovalidate(boolean _b) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetNoValidate(b As Boolean) As VMForm";
 //BA.debugLineNum = 26;BA.debugLine="SetAttr(CreateMap(\":novalidate\": b))";
_setattr(__c.createMap(new Object[] {(Object)(":novalidate"),(Object)(_b)}));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmform)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 37;BA.debugLine="Form.SetText(Container.ToString)";
_form._settext /*b4j.example.vmelement*/ (_container._tostring /*String*/ ());
 //BA.debugLineNum = 38;BA.debugLine="Return Form.tostring";
if (true) return _form._tostring /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
