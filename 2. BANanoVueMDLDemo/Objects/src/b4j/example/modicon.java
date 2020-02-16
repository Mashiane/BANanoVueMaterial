package b4j.example;


import anywheresoftware.b4a.BA;

public class modicon extends Object{
public static modicon mostCurrent = new modicon();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modicon", null);
		ba.loadHtSubs(modicon.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modicon", ba);
		}
	}
    public static Class<?> getObject() {
		return modicon.class;
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
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modIcon.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modIcon.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modicon.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateIcon(\"icon1\").SetText(\"menu\").AddToConta";
_vm._createicon /*b4j.example.vmicon*/ ("icon1")._settext /*b4j.example.vmicon*/ ("menu")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateIcon(\"icon2\").SetText(\"add\").AddToContai";
_vm._createicon /*b4j.example.vmicon*/ ("icon2")._settext /*b4j.example.vmicon*/ ("add")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateIcon(\"icon3\").SetText(\"thumb_up\").AddToC";
_vm._createicon /*b4j.example.vmicon*/ ("icon3")._settext /*b4j.example.vmicon*/ ("thumb_up")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateIcon(\"icon4\").SetText(\"verified_user\").A";
_vm._createicon /*b4j.example.vmicon*/ ("icon4")._settext /*b4j.example.vmicon*/ ("verified_user")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateIcon(\"icon5\").SetText(\"home\").AddToConta";
_vm._createicon /*b4j.example.vmicon*/ ("icon5")._settext /*b4j.example.vmicon*/ ("home")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="cont.AddComponent(1, 1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 26;BA.debugLine="cont.AddComponent(1, 1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateIcon(\"icon1s\").SetText(\"menu\").SetSize2x";
_vm._createicon /*b4j.example.vmicon*/ ("icon1s")._settext /*b4j.example.vmicon*/ ("menu")._setsize2x /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.CreateIcon(\"icon2s\").SetText(\"add\").SetSize3x(";
_vm._createicon /*b4j.example.vmicon*/ ("icon2s")._settext /*b4j.example.vmicon*/ ("add")._setsize3x /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.CreateIcon(\"icon3s\").SetText(\"thumb_up\").SetSi";
_vm._createicon /*b4j.example.vmicon*/ ("icon3s")._settext /*b4j.example.vmicon*/ ("thumb_up")._setsize4x /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="vm.CreateIcon(\"icon4s\").SetText(\"verified_user\").";
_vm._createicon /*b4j.example.vmicon*/ ("icon4s")._settext /*b4j.example.vmicon*/ ("verified_user")._setsize5x /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 33;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"iconcode\"";
_name = "iconcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
