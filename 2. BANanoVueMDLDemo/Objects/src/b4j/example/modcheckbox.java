package b4j.example;


import anywheresoftware.b4a.BA;

public class modcheckbox extends Object{
public static modcheckbox mostCurrent = new modcheckbox();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modcheckbox", null);
		ba.loadHtSubs(modcheckbox.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modcheckbox", ba);
		}
	}
    public static Class<?> getObject() {
		return modcheckbox.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static b4j.example.main _main = null;
public static b4j.example.modfile _modfile = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.modgmap _modgmap = null;
public static b4j.example.modchartkick _modchartkick = null;
public static b4j.example.modavatar _modavatar = null;
public static b4j.example.modbadge _modbadge = null;
public static b4j.example.modbottombar _modbottombar = null;
public static b4j.example.modbuttons _modbuttons = null;
public static b4j.example.modchips _modchips = null;
public static b4j.example.moddatepicker _moddatepicker = null;
public static b4j.example.moddialog _moddialog = null;
public static b4j.example.modemptystate _modemptystate = null;
public static b4j.example.modicon _modicon = null;
public static b4j.example.modlist _modlist = null;
public static b4j.example.modlistview _modlistview = null;
public static b4j.example.modmenu _modmenu = null;
public static b4j.example.modprogress _modprogress = null;
public static b4j.example.modradio _modradio = null;
public static b4j.example.modselect _modselect = null;
public static b4j.example.modskeleton _modskeleton = null;
public static b4j.example.modsnackbar _modsnackbar = null;
public static b4j.example.modspeeddial _modspeeddial = null;
public static b4j.example.modspinner _modspinner = null;
public static b4j.example.modsteppers _modsteppers = null;
public static b4j.example.modswitch _modswitch = null;
public static b4j.example.modtable _modtable = null;
public static b4j.example.modtabs _modtabs = null;
public static b4j.example.modtextarea _modtextarea = null;
public static b4j.example.modtextbox _modtextbox = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _cb2_change(String _cvalue) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub cb2_change(cValue As String)";
 //BA.debugLineNum = 43;BA.debugLine="vm.ShowSnackBar(cValue)";
_vm._showsnackbar /*String*/ (_cvalue);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modCheckBox.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modCheckBox.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modcheckbox.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateCheckBox(\"cb1\",Me).SetText(\"Boolean\").Se";
_vm._createcheckbox /*b4j.example.vmcheckbox*/ ("cb1",modcheckbox.getObject())._settext /*b4j.example.vmcheckbox*/ ("Boolean")._setvmodel /*b4j.example.vmcheckbox*/ ("cb1")._setvalue /*b4j.example.vmcheckbox*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateCheckBox(\"cb2\",Me).SetText(\"String\").Set";
_vm._createcheckbox /*b4j.example.vmcheckbox*/ ("cb2",modcheckbox.getObject())._settext /*b4j.example.vmcheckbox*/ ("String")._setvmodel /*b4j.example.vmcheckbox*/ ("cb2")._setprimary /*b4j.example.vmcheckbox*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmcheckbox*/ ((Object)("male"))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateCheckBox(\"cb3\",Me).SetText(\"Disabled\").S";
_vm._createcheckbox /*b4j.example.vmcheckbox*/ ("cb3",modcheckbox.getObject())._settext /*b4j.example.vmcheckbox*/ ("Disabled")._setdisabled /*b4j.example.vmcheckbox*/ (anywheresoftware.b4a.keywords.Common.True)._setvmodel /*b4j.example.vmcheckbox*/ ("cb3")._setvalue /*b4j.example.vmcheckbox*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateCheckBox(\"cb4\",Me).SetText(\"Indeterminat";
_vm._createcheckbox /*b4j.example.vmcheckbox*/ ("cb4",modcheckbox.getObject())._settext /*b4j.example.vmcheckbox*/ ("Indeterminate")._setvmodel /*b4j.example.vmcheckbox*/ ("cb4")._setindeterminate /*b4j.example.vmcheckbox*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 24;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 35;BA.debugLine="vm.CreateLABEL(\"\").SetText(\"CB1 {{ cb1 }}\").SetPa";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._settext /*b4j.example.vmlabel*/ ("CB1 {{ cb1 }}")._setparagraph /*b4j.example.vmlabel*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="vm.CreateLABEL(\"\").SetText(\"CB2 {{ cb2 }}\").SetPa";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._settext /*b4j.example.vmlabel*/ ("CB2 {{ cb2 }}")._setparagraph /*b4j.example.vmlabel*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 39;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"checkboxcode\"";
_name = "checkboxcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
