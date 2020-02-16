package b4j.example;


import anywheresoftware.b4a.BA;

public class modbadge extends Object{
public static modbadge mostCurrent = new modbadge();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbadge", null);
		ba.loadHtSubs(modbadge.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbadge", ba);
		}
	}
    public static Class<?> getObject() {
		return modbadge.class;
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
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modBadge.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modBadge.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbadge.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateButton(\"btn1\",Me).SetIcon(\"notifications";
_vm._createbutton /*b4j.example.vmbutton*/ ("btn1",modbadge.getObject())._seticon /*b4j.example.vmbutton*/ ("notifications")._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setbadgecontent /*b4j.example.vmbutton*/ ((int) (5))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateButton(\"btn2\",Me).SetIcon(\"home\").SetIco";
_vm._createbutton /*b4j.example.vmbutton*/ ("btn2",modbadge.getObject())._seticon /*b4j.example.vmbutton*/ ("home")._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setbadgecontent /*b4j.example.vmbutton*/ ((int) (1))._setbadgeprimary /*b4j.example.vmbutton*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateButton(\"btn3\",Me).SetIcon(\"home\").SetIco";
_vm._createbutton /*b4j.example.vmbutton*/ ("btn3",modbadge.getObject())._seticon /*b4j.example.vmbutton*/ ("home")._seticonbutton /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setbadgecontent /*b4j.example.vmbutton*/ ((int) (12))._setbadgeonbottom /*b4j.example.vmbutton*/ ()._setbadgeaccent /*b4j.example.vmbutton*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateAvatar(\"img1\",Me).SetValue(\"./assets/spo";
_vm._createavatar /*b4j.example.vmavatar*/ ("img1",modbadge.getObject())._setvalue /*b4j.example.vmavatar*/ ("./assets/sponge.png")._setalt /*b4j.example.vmavatar*/ ("Avatar")._setbadgedense /*b4j.example.vmavatar*/ ()._setbadgecontent /*b4j.example.vmavatar*/ ((int) (6))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateButton(\"btn4\",Me).SetText(\"Button With\")";
_vm._createbutton /*b4j.example.vmbutton*/ ("btn4",modbadge.getObject())._settext /*b4j.example.vmbutton*/ ("Button With")._setbadgeonbottom /*b4j.example.vmbutton*/ ()._setbadgesquare /*b4j.example.vmbutton*/ ()._setbadgecontent /*b4j.example.vmbutton*/ ((int) (10))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 25;BA.debugLine="End Sub'Static code module";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"badgecode\"";
_name = "badgecode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
