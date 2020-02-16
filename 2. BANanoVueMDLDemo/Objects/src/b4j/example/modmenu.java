package b4j.example;


import anywheresoftware.b4a.BA;

public class modmenu extends Object{
public static modmenu mostCurrent = new modmenu();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modmenu", null);
		ba.loadHtSubs(modmenu.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modmenu", ba);
		}
	}
    public static Class<?> getObject() {
		return modmenu.class;
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
public static String  _be1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub be1_click(e As BANanoEvent)";
 //BA.debugLineNum = 98;BA.debugLine="vm.ShowSnackBar(\"be1\")";
_vm._showsnackbar /*String*/ ("be1");
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _be2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub be2_click(e As BANanoEvent)";
 //BA.debugLineNum = 103;BA.debugLine="vm.ShowSnackBar(\"be2\")";
_vm._showsnackbar /*String*/ ("be2");
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public static String  _be3_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub be3_click(e As BANanoEvent)";
 //BA.debugLineNum = 108;BA.debugLine="vm.ShowSnackBar(\"be3\")";
_vm._showsnackbar /*String*/ ("be3");
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmmenu _m1 = null;
b4j.example.vmmenu _be = null;
b4j.example.vmmenu _ts = null;
b4j.example.vmmenu _te = null;
b4j.example.vmmenu _at = null;
b4j.example.vmmenu _icn = null;
b4j.example.vmmenu _img = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modMenu.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modMenu.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modmenu.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns(4,12,3,3,3)";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns /*b4j.example.vmgrid*/ ((int) (4),BA.NumberToString(12),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 18;BA.debugLine="Dim m1 As VMMenu = vm.CreateMenu(\"m1\", Me)";
_m1 = _vm._createmenu /*b4j.example.vmmenu*/ ("m1",modmenu.getObject());
 //BA.debugLineNum = 20;BA.debugLine="m1.SetButton(\"\", \"Bottom Start\")";
_m1._setbutton /*b4j.example.vmmenu*/ ("","Bottom Start");
 //BA.debugLineNum = 21;BA.debugLine="m1.SetDirectionBottomStart(True)";
_m1._setdirectionbottomstart /*b4j.example.vmmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 22;BA.debugLine="m1.AddMenuItem(\"mi1\",\"\",\"My Item 1\")";
_m1._addmenuitem /*String*/ ("mi1","","My Item 1");
 //BA.debugLineNum = 23;BA.debugLine="m1.AddMenuItem(\"mi2\",\"\",\"My Item 2\")";
_m1._addmenuitem /*String*/ ("mi2","","My Item 2");
 //BA.debugLineNum = 24;BA.debugLine="m1.AddMenuItem(\"mi3\",\"\",\"My Item 3\")";
_m1._addmenuitem /*String*/ ("mi3","","My Item 3");
 //BA.debugLineNum = 25;BA.debugLine="m1.AddToContainer(cont, 1, 1)";
_m1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="Dim be As VMMenu = vm.CreateMenu(\"be\", Me)";
_be = _vm._createmenu /*b4j.example.vmmenu*/ ("be",modmenu.getObject());
 //BA.debugLineNum = 29;BA.debugLine="be.SetButton(\"\", \"Bottom End\")";
_be._setbutton /*b4j.example.vmmenu*/ ("","Bottom End");
 //BA.debugLineNum = 30;BA.debugLine="be.SetDirectionBottomEnd(True)";
_be._setdirectionbottomend /*b4j.example.vmmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 31;BA.debugLine="be.AddMenuItem(\"be1\",\"\",\"My Item 1\")";
_be._addmenuitem /*String*/ ("be1","","My Item 1");
 //BA.debugLineNum = 32;BA.debugLine="be.AddMenuItem(\"be2\",\"\",\"My Item 2\")";
_be._addmenuitem /*String*/ ("be2","","My Item 2");
 //BA.debugLineNum = 33;BA.debugLine="be.AddMenuItem(\"be3\",\"\",\"My Item 3\")";
_be._addmenuitem /*String*/ ("be3","","My Item 3");
 //BA.debugLineNum = 34;BA.debugLine="be.AddToContainer(cont, 1, 2)";
_be._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 36;BA.debugLine="Dim ts As VMMenu = vm.CreateMenu(\"ts\", Me)";
_ts = _vm._createmenu /*b4j.example.vmmenu*/ ("ts",modmenu.getObject());
 //BA.debugLineNum = 38;BA.debugLine="ts.SetButton(\"\", \"Top Start\")";
_ts._setbutton /*b4j.example.vmmenu*/ ("","Top Start");
 //BA.debugLineNum = 39;BA.debugLine="ts.SetDirectionTopStart(True)";
_ts._setdirectiontopstart /*b4j.example.vmmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 40;BA.debugLine="ts.AddMenuItem(\"ts1\",\"\",\"My Item 1\")";
_ts._addmenuitem /*String*/ ("ts1","","My Item 1");
 //BA.debugLineNum = 41;BA.debugLine="ts.AddMenuItem(\"ts2\",\"\",\"My Item 2\")";
_ts._addmenuitem /*String*/ ("ts2","","My Item 2");
 //BA.debugLineNum = 42;BA.debugLine="ts.AddMenuItem(\"ts3\",\"\",\"My Item 3\")";
_ts._addmenuitem /*String*/ ("ts3","","My Item 3");
 //BA.debugLineNum = 43;BA.debugLine="ts.AddToContainer(cont, 1, 3)";
_ts._addtocontainer /*String*/ (_cont,(int) (1),(int) (3));
 //BA.debugLineNum = 45;BA.debugLine="Dim te As VMMenu = vm.CreateMenu(\"te\", Me)";
_te = _vm._createmenu /*b4j.example.vmmenu*/ ("te",modmenu.getObject());
 //BA.debugLineNum = 47;BA.debugLine="te.SetButton(\"\", \"Top End\")";
_te._setbutton /*b4j.example.vmmenu*/ ("","Top End");
 //BA.debugLineNum = 48;BA.debugLine="te.SetDirectionTopEnd(True)";
_te._setdirectiontopend /*b4j.example.vmmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 49;BA.debugLine="te.AddMenuItem(\"te1\",\"\",\"My Item 1\")";
_te._addmenuitem /*String*/ ("te1","","My Item 1");
 //BA.debugLineNum = 50;BA.debugLine="te.AddMenuItem(\"te2\",\"\",\"My Item 2\")";
_te._addmenuitem /*String*/ ("te2","","My Item 2");
 //BA.debugLineNum = 51;BA.debugLine="te.AddMenuItem(\"te3\",\"\",\"My Item 3\")";
_te._addmenuitem /*String*/ ("te3","","My Item 3");
 //BA.debugLineNum = 52;BA.debugLine="te.AddToContainer(cont, 1, 4)";
_te._addtocontainer /*String*/ (_cont,(int) (1),(int) (4));
 //BA.debugLineNum = 55;BA.debugLine="Dim at As VMMenu = vm.CreateMenu(\"at\", Me)";
_at = _vm._createmenu /*b4j.example.vmmenu*/ ("at",modmenu.getObject());
 //BA.debugLineNum = 57;BA.debugLine="at.SetButton(\"\", \"Align with Trigger\")";
_at._setbutton /*b4j.example.vmmenu*/ ("","Align with Trigger");
 //BA.debugLineNum = 58;BA.debugLine="at.SetSizeMedium(True)";
_at._setsizemedium /*b4j.example.vmmenu*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 59;BA.debugLine="at.SetAlignTrigger(True)";
_at._setaligntrigger /*b4j.example.vmmenu*/ ((Object)(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 60;BA.debugLine="at.AddMenuItem(\"at1\",\"\",\"My Item 1\")";
_at._addmenuitem /*String*/ ("at1","","My Item 1");
 //BA.debugLineNum = 61;BA.debugLine="at.AddMenuItem(\"at2\",\"\",\"My Item 2\")";
_at._addmenuitem /*String*/ ("at2","","My Item 2");
 //BA.debugLineNum = 62;BA.debugLine="at.AddMenuItem(\"at3\",\"\",\"My Item 3\")";
_at._addmenuitem /*String*/ ("at3","","My Item 3");
 //BA.debugLineNum = 63;BA.debugLine="at.AddToContainer(cont, 2, 1)";
_at._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 67;BA.debugLine="Dim icn As VMMenu = vm.CreateMenu(\"icn\", Me).SetI";
_icn = _vm._createmenu /*b4j.example.vmmenu*/ ("icn",modmenu.getObject())._seticon /*b4j.example.vmmenu*/ ("contacts");
 //BA.debugLineNum = 68;BA.debugLine="icn.AddMenuItem(\"icn1\",\"phone\",\"Call Home\")";
_icn._addmenuitem /*String*/ ("icn1","phone","Call Home");
 //BA.debugLineNum = 69;BA.debugLine="icn.AddMenuItem(\"icn2\",\"phone\",\"Call Work\")";
_icn._addmenuitem /*String*/ ("icn2","phone","Call Work");
 //BA.debugLineNum = 70;BA.debugLine="icn.AddMenuItem(\"icn3\",\"phone\",\"Call Spouse\")";
_icn._addmenuitem /*String*/ ("icn3","phone","Call Spouse");
 //BA.debugLineNum = 71;BA.debugLine="icn.AddToContainer(cont, 2, 2)";
_icn._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 74;BA.debugLine="Dim img As VMMenu = vm.CreateMenu(\"img\", Me).SetI";
_img = _vm._createmenu /*b4j.example.vmmenu*/ ("img",modmenu.getObject())._setimage /*b4j.example.vmmenu*/ ("./assets/2.png","");
 //BA.debugLineNum = 75;BA.debugLine="img.AddMenuItem(\"img1\",\"phone\",\"Call Home\")";
_img._addmenuitem /*String*/ ("img1","phone","Call Home");
 //BA.debugLineNum = 76;BA.debugLine="img.AddMenuItem(\"img2\",\"phone\",\"Call Work\")";
_img._addmenuitem /*String*/ ("img2","phone","Call Work");
 //BA.debugLineNum = 77;BA.debugLine="img.AddMenuItem(\"img3\",\"phone\",\"Call Spouse\")";
_img._addmenuitem /*String*/ ("img3","phone","Call Spouse");
 //BA.debugLineNum = 78;BA.debugLine="img.AddToContainer(cont, 2, 3)";
_img._addtocontainer /*String*/ (_cont,(int) (2),(int) (3));
 //BA.debugLineNum = 80;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public static String  _icn1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub icn1_click(e As BANanoEvent)";
 //BA.debugLineNum = 85;BA.debugLine="vm.ShowSnackBar(\"Calling Home\")";
_vm._showsnackbar /*String*/ ("Calling Home");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _icn2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub icn2_click(e As BANanoEvent)";
 //BA.debugLineNum = 89;BA.debugLine="vm.ShowSnackBar(\"Calling Work\")";
_vm._showsnackbar /*String*/ ("Calling Work");
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _icn3_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub icn3_click(e As BANanoEvent)";
 //BA.debugLineNum = 93;BA.debugLine="vm.ShowSnackBar(\"Calling Spouse\")";
_vm._showsnackbar /*String*/ ("Calling Spouse");
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _mi1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub mi1_click(e As BANanoEvent)";
 //BA.debugLineNum = 113;BA.debugLine="vm.ShowSnackBar(\"mi1\")";
_vm._showsnackbar /*String*/ ("mi1");
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public static String  _mi2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub mi2_click(e As BANanoEvent)";
 //BA.debugLineNum = 117;BA.debugLine="vm.ShowSnackBar(\"mi2\")";
_vm._showsnackbar /*String*/ ("mi2");
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _mi3_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub mi3_click(e As BANanoEvent)";
 //BA.debugLineNum = 121;BA.debugLine="vm.ShowSnackBar(\"mi3\")";
_vm._showsnackbar /*String*/ ("mi3");
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"menucode\"";
_name = "menucode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
