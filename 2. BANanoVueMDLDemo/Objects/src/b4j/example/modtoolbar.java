package b4j.example;


import anywheresoftware.b4a.BA;

public class modtoolbar extends Object{
public static modtoolbar mostCurrent = new modtoolbar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtoolbar", null);
		ba.loadHtSubs(modtoolbar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtoolbar", ba);
		}
	}
    public static Class<?> getObject() {
		return modtoolbar.class;
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
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmtoolbar _tbl1 = null;
b4j.example.vmtoolbar _tbl2 = null;
b4j.example.vmmenu _icn = null;
b4j.example.vmtoolbar _tbl3 = null;
b4j.example.vmmenu _img = null;
b4j.example.vmtoolbar _tbl4 = null;
b4j.example.vmtoolbar _tbl5 = null;
b4j.example.vmtoolbar _tbl6 = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modToolbar.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modToolbar.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtoolbar.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim tbl1 As VMToolBar = vm.CreateToolbar(\"tbl1\",";
_tbl1 = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("tbl1",modtoolbar.getObject())._settitle /*b4j.example.vmtoolbar*/ ("My Toolbar")._setmarginall /*b4j.example.vmtoolbar*/ ("10px");
 //BA.debugLineNum = 19;BA.debugLine="tbl1.SetToolbar(True)";
_tbl1._settoolbar /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 20;BA.debugLine="tbl1.AddIcon(\"menux\",\"more_vert\", \"Menu\",\"\")";
_tbl1._addicon /*b4j.example.vmtoolbar*/ ("menux","more_vert","Menu","");
 //BA.debugLineNum = 21;BA.debugLine="tbl1.AddButton(\"ref\", \"\", \"Refresh\", \"Refresh\",\"\"";
_tbl1._addbutton /*b4j.example.vmtoolbar*/ ("ref","","Refresh","Refresh","");
 //BA.debugLineNum = 22;BA.debugLine="tbl1.AddIcon(\"ham\",\"menu\",\"Hamburger\",\"\")";
_tbl1._addicon /*b4j.example.vmtoolbar*/ ("ham","menu","Hamburger","");
 //BA.debugLineNum = 23;BA.debugLine="tbl1.AddIcon(\"ref1\", \"refresh\",\"Refresh\",\"5\")";
_tbl1._addicon /*b4j.example.vmtoolbar*/ ("ref1","refresh","Refresh","5");
 //BA.debugLineNum = 24;BA.debugLine="tbl1.AddAvatar(\"av1\",\"./assets/sponge.png\",\"TheMa";
_tbl1._addavatar /*b4j.example.vmtoolbar*/ ("av1","./assets/sponge.png","TheMash","My Profile","30");
 //BA.debugLineNum = 25;BA.debugLine="tbl1.AddToContainer(cont, 1, 1)";
_tbl1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="Dim tbl2 As VMToolBar = vm.CreateToolbar(\"tbl2\",";
_tbl2 = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("tbl2",modtoolbar.getObject())._settitle /*b4j.example.vmtoolbar*/ ("No Elevation")._setelevation /*b4j.example.vmtoolbar*/ ((int) (0))._setmarginall /*b4j.example.vmtoolbar*/ ("10px");
 //BA.debugLineNum = 28;BA.debugLine="tbl2.SetToolbar(True)";
_tbl2._settoolbar /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 29;BA.debugLine="Dim icn As VMMenu = vm.CreateMenu(\"icn\", Me).SetI";
_icn = _vm._createmenu /*b4j.example.vmmenu*/ ("icn",modtoolbar.getObject())._seticon /*b4j.example.vmmenu*/ ("contacts");
 //BA.debugLineNum = 30;BA.debugLine="icn.AddMenuItem(\"icn1\",\"phone\",\"Call Home\")";
_icn._addmenuitem /*String*/ ("icn1","phone","Call Home");
 //BA.debugLineNum = 31;BA.debugLine="icn.AddMenuItem(\"icn2\",\"phone\",\"Call Work\")";
_icn._addmenuitem /*String*/ ("icn2","phone","Call Work");
 //BA.debugLineNum = 32;BA.debugLine="icn.AddMenuItem(\"icn3\",\"phone\",\"Call Spouse\")";
_icn._addmenuitem /*String*/ ("icn3","phone","Call Spouse");
 //BA.debugLineNum = 33;BA.debugLine="tbl2.AddMenu(icn)";
_tbl2._addmenu /*b4j.example.vmtoolbar*/ (_icn);
 //BA.debugLineNum = 34;BA.debugLine="tbl2.AddToContainer(cont, 1, 1)";
_tbl2._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="Dim tbl3 As VMToolBar = vm.CreateToolbar(\"tbl3\",";
_tbl3 = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("tbl3",modtoolbar.getObject())._settitle /*b4j.example.vmtoolbar*/ ("Primary")._setprimary /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True)._setmarginall /*b4j.example.vmtoolbar*/ ("10px");
 //BA.debugLineNum = 37;BA.debugLine="tbl3.SetToolbar(True)";
_tbl3._settoolbar /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 38;BA.debugLine="Dim img As VMMenu = vm.CreateMenu(\"img\", Me).SetI";
_img = _vm._createmenu /*b4j.example.vmmenu*/ ("img",modtoolbar.getObject())._setimage /*b4j.example.vmmenu*/ ("./assets/2.png","");
 //BA.debugLineNum = 39;BA.debugLine="img.AddMenuItem(\"img1\",\"phone\",\"Call Home\")";
_img._addmenuitem /*String*/ ("img1","phone","Call Home");
 //BA.debugLineNum = 40;BA.debugLine="img.AddMenuItem(\"img2\",\"phone\",\"Call Work\")";
_img._addmenuitem /*String*/ ("img2","phone","Call Work");
 //BA.debugLineNum = 41;BA.debugLine="img.AddMenuItem(\"img3\",\"phone\",\"Call Spouse\")";
_img._addmenuitem /*String*/ ("img3","phone","Call Spouse");
 //BA.debugLineNum = 42;BA.debugLine="tbl3.addmenu(img)";
_tbl3._addmenu /*b4j.example.vmtoolbar*/ (_img);
 //BA.debugLineNum = 43;BA.debugLine="tbl3.AddToContainer(cont, 1, 1)";
_tbl3._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 45;BA.debugLine="Dim tbl4 As VMToolBar = vm.CreateToolbar(\"tbl4\",";
_tbl4 = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("tbl4",modtoolbar.getObject())._settitle /*b4j.example.vmtoolbar*/ ("Accent")._setaccent /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True)._setmarginall /*b4j.example.vmtoolbar*/ ("10px");
 //BA.debugLineNum = 46;BA.debugLine="tbl4.SetToolbar(True)";
_tbl4._settoolbar /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 47;BA.debugLine="tbl4.AddToContainer(cont, 1, 1)";
_tbl4._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 49;BA.debugLine="Dim tbl5 As VMToolBar = vm.CreateToolbar(\"tbl5\",";
_tbl5 = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("tbl5",modtoolbar.getObject())._settitle /*b4j.example.vmtoolbar*/ ("Transparent")._settransparent /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True)._setmarginall /*b4j.example.vmtoolbar*/ ("10px");
 //BA.debugLineNum = 50;BA.debugLine="tbl5.SetToolbar(True)";
_tbl5._settoolbar /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 51;BA.debugLine="tbl5.AddToContainer(cont, 1, 1)";
_tbl5._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 53;BA.debugLine="Dim tbl6 As VMToolBar = vm.CreateToolbar(\"tbl6\",";
_tbl6 = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("tbl6",modtoolbar.getObject())._settitle /*b4j.example.vmtoolbar*/ ("Dense")._setdense /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True)._setmarginall /*b4j.example.vmtoolbar*/ ("10px");
 //BA.debugLineNum = 54;BA.debugLine="tbl6.SetToolbar(True)";
_tbl6._settoolbar /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 55;BA.debugLine="tbl6.AddToContainer(cont, 1, 1)";
_tbl6._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 57;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 58;BA.debugLine="End Sub'Static code module";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"toolcode\"";
_name = "toolcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _ref1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub ref1_click(e As BANanoEvent)";
 //BA.debugLineNum = 61;BA.debugLine="vm.IncrementBadge(\"ref1\",1)";
_vm._incrementbadge /*b4j.example.bananovm*/ ("ref1",(int) (1));
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
}
