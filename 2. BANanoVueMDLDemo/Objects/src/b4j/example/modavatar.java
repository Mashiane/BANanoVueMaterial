package b4j.example;


import anywheresoftware.b4a.BA;

public class modavatar extends Object{
public static modavatar mostCurrent = new modavatar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modavatar", null);
		ba.loadHtSubs(modavatar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modavatar", ba);
		}
	}
    public static Class<?> getObject() {
		return modavatar.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static b4j.example.main _main = null;
public static b4j.example.modfile _modfile = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.modgmap _modgmap = null;
public static b4j.example.modchartkick _modchartkick = null;
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
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modAvatar.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modAvatar.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modavatar.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateAvatar(\"sponge\",Me).SetAlt(\"My Avatar\").";
_vm._createavatar /*b4j.example.vmavatar*/ ("sponge",modavatar.getObject())._setalt /*b4j.example.vmavatar*/ ("My Avatar")._setvalue /*b4j.example.vmavatar*/ ("./assets/sponge.png")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="cont.AddComponent(1,1,vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 20;BA.debugLine="cont.AddComponent(1,1,vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateAvatar(\"home\",Me).SetIcon(\"home\").SetSma";
_vm._createavatar /*b4j.example.vmavatar*/ ("home",modavatar.getObject())._seticon /*b4j.example.vmavatar*/ ("home")._setsmall /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateAvatar(\"folder\",Me).SetIcon(\"folder\").Se";
_vm._createavatar /*b4j.example.vmavatar*/ ("folder",modavatar.getObject())._seticon /*b4j.example.vmavatar*/ ("folder")._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateAvatar(\"favorite\",Me).SetIcon(\"favorite\"";
_vm._createavatar /*b4j.example.vmavatar*/ ("favorite",modavatar.getObject())._seticon /*b4j.example.vmavatar*/ ("favorite")._setlarge /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setaccent /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="cont.AddComponent(1,1,vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 27;BA.debugLine="cont.AddComponent(1,1,vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetSma";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setsmall /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmavatar*/ ("B")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetSma";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setsmall /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmavatar*/ ("B")._setprimary /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetSma";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setsmall /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmavatar*/ ("B")._setaccent /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 32;BA.debugLine="cont.AddComponent(1,1,vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 33;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetTex";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmavatar*/ ("A")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetTex";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmavatar*/ ("A")._setprimary /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 35;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetTex";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmavatar*/ ("A")._setaccent /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 38;BA.debugLine="cont.AddComponent(1,1,vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 39;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetLar";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setlarge /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settextripple /*b4j.example.vmavatar*/ ("MM")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 40;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetLar";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setlarge /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settextripple /*b4j.example.vmavatar*/ ("MM")._setprimary /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="vm.CreateAvatar(\"\",Me).SetAvatarIcon(True).SetLar";
_vm._createavatar /*b4j.example.vmavatar*/ ("",modavatar.getObject())._setavataricon /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setlarge /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._settextripple /*b4j.example.vmavatar*/ ("MM")._setaccent /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 43;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"avatarcode\"";
_name = "avatarcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
