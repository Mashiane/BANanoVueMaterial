package b4j.example;


import anywheresoftware.b4a.BA;

public class modprogress extends Object{
public static modprogress mostCurrent = new modprogress();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modprogress", null);
		ba.loadHtSubs(modprogress.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modprogress", ba);
		}
	}
    public static Class<?> getObject() {
		return modprogress.class;
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
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modProgress.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modProgress.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modprogress.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(4).AddColumns2x6";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (4))._addcolumns2x6 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateProgress(\"p1\", Me).SetMargin(\"25px\").Set";
_vm._createprogress /*b4j.example.vmprogress*/ ("p1",modprogress.getObject())._setmargin /*b4j.example.vmprogress*/ ("25px")._setmodedeterminate /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogress*/ ((int) (10))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateProgress(\"p2\", Me).SetMargin(\"25px\").Set";
_vm._createprogress /*b4j.example.vmprogress*/ ("p2",modprogress.getObject())._setmargin /*b4j.example.vmprogress*/ ("25px")._setmodedeterminate /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogress*/ ((int) (20))._setaccent /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateProgress(\"p3\", Me).SetMargin(\"25px\").Set";
_vm._createprogress /*b4j.example.vmprogress*/ ("p3",modprogress.getObject())._setmargin /*b4j.example.vmprogress*/ ("25px")._setmodeindeterminate /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateProgress(\"p4\", Me).SetMargin(\"25px\").Set";
_vm._createprogress /*b4j.example.vmprogress*/ ("p4",modprogress.getObject())._setmargin /*b4j.example.vmprogress*/ ("25px")._setmodeindeterminate /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._setaccent /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateProgress(\"p5\", Me).SetMargin(\"25px\").Set";
_vm._createprogress /*b4j.example.vmprogress*/ ("p5",modprogress.getObject())._setmargin /*b4j.example.vmprogress*/ ("25px")._setmodebuffer /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogress*/ ((int) (25))._setbuffer /*b4j.example.vmprogress*/ ((int) (40))._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="vm.CreateProgress(\"p6\", Me).SetMargin(\"25px\").Set";
_vm._createprogress /*b4j.example.vmprogress*/ ("p6",modprogress.getObject())._setmargin /*b4j.example.vmprogress*/ ("25px")._setmodebuffer /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogress*/ ((int) (25))._setbuffer /*b4j.example.vmprogress*/ ((int) (40))._setaccent /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (3),(int) (2));
 //BA.debugLineNum = 27;BA.debugLine="vm.CreateProgress(\"p7\", Me).SetMargin(\"25px\").Set";
_vm._createprogress /*b4j.example.vmprogress*/ ("p7",modprogress.getObject())._setmargin /*b4j.example.vmprogress*/ ("25px")._setmodequery /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateProgress(\"p8\", Me).SetMargin(\"25px\").Set";
_vm._createprogress /*b4j.example.vmprogress*/ ("p8",modprogress.getObject())._setmargin /*b4j.example.vmprogress*/ ("25px")._setmodequery /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._setaccent /*b4j.example.vmprogress*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (4),(int) (2));
 //BA.debugLineNum = 31;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"progresscode\"";
_name = "progresscode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
