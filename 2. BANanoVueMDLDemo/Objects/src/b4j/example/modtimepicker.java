package b4j.example;


import anywheresoftware.b4a.BA;

public class modtimepicker extends Object{
public static modtimepicker mostCurrent = new modtimepicker();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtimepicker", null);
		ba.loadHtSubs(modtimepicker.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtimepicker", ba);
		}
	}
    public static Class<?> getObject() {
		return modtimepicker.class;
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
public static b4j.example.modcheckbox _modcheckbox = null;
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
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmtimepicker _timex = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modTimePicker.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modTimePicker.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtimepicker.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns2x6";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns2x6 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim timex As VMTimePicker = vm.CreateTimePicker(\"";
_timex = _vm._createtimepicker /*b4j.example.vmtimepicker*/ ("timex",modtimepicker.getObject())._setlabel /*b4j.example.vmtimepicker*/ ((Object)("Entry Time"));
 //BA.debugLineNum = 19;BA.debugLine="timex.SetHelperText(\"Enter time\").SetErrorText(\"T";
_timex._sethelpertext /*b4j.example.vmtimepicker*/ ("Enter time")._seterrortext /*b4j.example.vmtimepicker*/ ("Time should be entered!")._setrequired /*b4j.example.vmtimepicker*/ (anywheresoftware.b4a.keywords.Common.True)._setvmodel /*b4j.example.vmtimepicker*/ ("timex");
 //BA.debugLineNum = 20;BA.debugLine="timex.AddToContainer(cont, 1, 1)";
_timex._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"timecode\"";
_name = "timecode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _timex_change(String _value) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub timex_change(value As String)";
 //BA.debugLineNum = 27;BA.debugLine="vm.ShowSnackBar(value)";
_vm._showsnackbar /*String*/ (_value);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
}
