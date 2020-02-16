package b4j.example;


import anywheresoftware.b4a.BA;

public class modbuttons extends Object{
public static modbuttons mostCurrent = new modbuttons();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbuttons", null);
		ba.loadHtSubs(modbuttons.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbuttons", ba);
		}
	}
    public static Class<?> getObject() {
		return modbuttons.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.modfile _modfile = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.modgmap _modgmap = null;
public static b4j.example.modchartkick _modchartkick = null;
public static b4j.example.modavatar _modavatar = null;
public static b4j.example.modbadge _modbadge = null;
public static b4j.example.modbottombar _modbottombar = null;
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
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 10;BA.debugLine="Log(\"modButtons.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modButtons.Code");
 //BA.debugLineNum = 11;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 13;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbuttons.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateButton(\"b1\",Me).SetText(\"Default\").AddTo";
_vm._createbutton /*b4j.example.vmbutton*/ ("b1",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Default")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateButton(\"b2\",Me).SetText(\"Ripple Off\").Se";
_vm._createbutton /*b4j.example.vmbutton*/ ("b2",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Ripple Off")._setripple /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.False)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateButton(\"b3\",Me).SetText(\"Primary\").SetPr";
_vm._createbutton /*b4j.example.vmbutton*/ ("b3",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Primary")._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateButton(\"b4\",Me).SetText(\"Accent\").SetAcc";
_vm._createbutton /*b4j.example.vmbutton*/ ("b4",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Accent")._setaccent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateButton(\"b5\",Me).SetText(\"Disabled\").SetD";
_vm._createbutton /*b4j.example.vmbutton*/ ("b5",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Disabled")._setdisabled /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 25;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 27;BA.debugLine="vm.CreateButton(\"b1r\",Me).SetText(\"Default\").SetR";
_vm._createbutton /*b4j.example.vmbutton*/ ("b1r",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Default")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateButton(\"b2r\",Me).SetText(\"Ripple Off\").S";
_vm._createbutton /*b4j.example.vmbutton*/ ("b2r",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Ripple Off")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setripple /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.False)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.CreateButton(\"b3r\",Me).SetText(\"Primary\").SetR";
_vm._createbutton /*b4j.example.vmbutton*/ ("b3r",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Primary")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.CreateButton(\"b4r\",Me).SetText(\"Accent\").SetRa";
_vm._createbutton /*b4j.example.vmbutton*/ ("b4r",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Accent")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setaccent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="vm.CreateButton(\"b5r\",Me).SetText(\"Disabled\").Set";
_vm._createbutton /*b4j.example.vmbutton*/ ("b5r",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Disabled")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setdisabled /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 33;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 34;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 36;BA.debugLine="vm.CreateButton(\"b1ri\",Me).SetIcon(\"home\").SetIco";
_vm._createbutton /*b4j.example.vmbutton*/ ("b1ri",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("home")._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 37;BA.debugLine="vm.CreateButton(\"b2ri\",Me).SetIcon(\"menu\").SetIco";
_vm._createbutton /*b4j.example.vmbutton*/ ("b2ri",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("menu")._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 38;BA.debugLine="vm.CreateButton(\"b3ri\",Me).SetIcon(\"thumb_up\").Se";
_vm._createbutton /*b4j.example.vmbutton*/ ("b3ri",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("thumb_up")._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setaccent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 39;BA.debugLine="vm.CreateButton(\"b4ri\",Me).SetIcon(\"add\").SetIcon";
_vm._createbutton /*b4j.example.vmbutton*/ ("b4ri",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("add")._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setdisabled /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 42;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 44;BA.debugLine="vm.CreateButton(\"b1rix\",Me).SetIcon(\"home\").SetRa";
_vm._createbutton /*b4j.example.vmbutton*/ ("b1rix",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("home")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 45;BA.debugLine="vm.CreateButton(\"b2rix\",Me).SetIcon(\"menu\").SetRa";
_vm._createbutton /*b4j.example.vmbutton*/ ("b2rix",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("menu")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 46;BA.debugLine="vm.CreateButton(\"b3rix\",Me).SetIcon(\"thumb_up\").S";
_vm._createbutton /*b4j.example.vmbutton*/ ("b3rix",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("thumb_up")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setaccent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 47;BA.debugLine="vm.CreateButton(\"b4rix\",Me).SetIcon(\"add\").SetIco";
_vm._createbutton /*b4j.example.vmbutton*/ ("b4rix",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("add")._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setdisabled /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 49;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 50;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 52;BA.debugLine="vm.CreateButton(\"f1\",Me).SetIcon(\"home\").SetFab(T";
_vm._createbutton /*b4j.example.vmbutton*/ ("f1",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("home")._setfab /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 53;BA.debugLine="vm.CreateButton(\"f2\",Me).SetIcon(\"menu\").SetFab(T";
_vm._createbutton /*b4j.example.vmbutton*/ ("f2",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("menu")._setfab /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 54;BA.debugLine="vm.CreateButton(\"f3\",Me).SetIcon(\"edit\").SetFab(T";
_vm._createbutton /*b4j.example.vmbutton*/ ("f3",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("edit")._setfab /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setplain /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 56;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 57;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 59;BA.debugLine="vm.CreateButton(\"f1m\",Me).SetIcon(\"menu\").SetFab(";
_vm._createbutton /*b4j.example.vmbutton*/ ("f1m",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("menu")._setfab /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setmini /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 60;BA.debugLine="vm.CreateButton(\"f2m\",Me).SetIcon(\"home\").SetFab(";
_vm._createbutton /*b4j.example.vmbutton*/ ("f2m",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("home")._setfab /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setmini /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 61;BA.debugLine="vm.CreateButton(\"f3m\",Me).SetIcon(\"edit\").SetFab(";
_vm._createbutton /*b4j.example.vmbutton*/ ("f3m",modbuttons.getObject())._seticon /*b4j.example.vmbutton*/ ("edit")._setfab /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setmini /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setplain /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 63;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 64;BA.debugLine="cont.AddComponent(1,1,vm.br)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 66;BA.debugLine="vm.CreateButton(\"lnk\",Me).SetText(\"Link\").SetHREF";
_vm._createbutton /*b4j.example.vmbutton*/ ("lnk",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Link")._sethref /*b4j.example.vmbutton*/ ("pageurl",anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 67;BA.debugLine="vm.CreateButton(\"lnk1\",Me).SetText(\"Route Link\").";
_vm._createbutton /*b4j.example.vmbutton*/ ("lnk1",modbuttons.getObject())._settext /*b4j.example.vmbutton*/ ("Route Link")._sethref /*b4j.example.vmbutton*/ ("pageurl",anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 68;BA.debugLine="vm.setcomputed(\"pageurl\", Me, \"getpageurl\")";
_vm._setcomputed /*b4j.example.bananovm*/ ("pageurl",modbuttons.getObject(),"getpageurl");
 //BA.debugLineNum = 70;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 71;BA.debugLine="End Sub'Static code module";
return "";
}
public static String  _getpageurl() throws Exception{
String _pg = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub getpageURL As String";
 //BA.debugLineNum = 74;BA.debugLine="Dim pg As String = banano.Location.GetHref";
_pg = _banano.Location().GetHref();
 //BA.debugLineNum = 75;BA.debugLine="Return pg";
if (true) return _pg;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"buttonscode\"";
_name = "buttonscode";
 //BA.debugLineNum = 5;BA.debugLine="Private banano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
