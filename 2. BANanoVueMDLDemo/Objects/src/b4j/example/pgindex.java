package b4j.example;


import anywheresoftware.b4a.BA;

public class pgindex extends Object{
public static pgindex mostCurrent = new pgindex();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgindex", null);
		ba.loadHtSubs(pgindex.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgindex", ba);
		}
	}
    public static Class<?> getObject() {
		return pgindex.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.bananovm _vm = null;
public static b4j.example.main _main = null;
public static b4j.example.modfile _modfile = null;
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
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _avatar_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub avatar_click(e As BANanoEvent)";
 //BA.debugLineNum = 260;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Avatar\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Avatar");
 //BA.debugLineNum = 261;BA.debugLine="vm.ShowPage(modAvatar.name)";
_vm._showpage /*String*/ (_modavatar._name /*String*/ );
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public static String  _back_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub back_click(e As BANanoEvent)";
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public static String  _badge_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub badge_click(e As BANanoEvent)";
 //BA.debugLineNum = 255;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Badge\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Badge");
 //BA.debugLineNum = 256;BA.debugLine="vm.ShowPage(modBadge.name)";
_vm._showpage /*String*/ (_modbadge._name /*String*/ );
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public static String  _bottombar_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub bottombar_click(e As BANanoEvent)";
 //BA.debugLineNum = 133;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Bottom Bar\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Bottom Bar");
 //BA.debugLineNum = 134;BA.debugLine="vm.ShowPage(modBottomBar.name)";
_vm._showpage /*String*/ (_modbottombar._name /*String*/ );
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _builddrawer() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub BuildDrawer";
 //BA.debugLineNum = 74;BA.debugLine="vm.Drawer.AddItem(\"ui\",\"whatshot\",\"UI Elements\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._additem /*String*/ ("ui","whatshot","UI Elements");
 //BA.debugLineNum = 75;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"avatar\", \"person_outl";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","avatar","person_outline","Avatar");
 //BA.debugLineNum = 76;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"badge\", \"\",\"Badge\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","badge","","Badge");
 //BA.debugLineNum = 77;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"listview\", \"\",\"ListVi";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","listview","","ListView");
 //BA.debugLineNum = 78;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"buttons\", \"\",\"Buttons";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","buttons","","Buttons");
 //BA.debugLineNum = 79;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"typography\", \"\",\"Typo";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","typography","","Typography");
 //BA.debugLineNum = 80;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"icon\", \"\",\"Icon\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","icon","","Icon");
 //BA.debugLineNum = 81;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"menus\", \"\",\"Menu\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","menus","","Menu");
 //BA.debugLineNum = 82;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"dialog\", \"\",\"Dialog\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","dialog","","Dialog");
 //BA.debugLineNum = 83;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"empty\", \"\",\"Empty Sta";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","empty","","Empty State");
 //BA.debugLineNum = 84;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"speeddial\", \"\",\"Speed";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","speeddial","","Speed Dial");
 //BA.debugLineNum = 85;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"progress\", \"\",\"Progre";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","progress","","Progress");
 //BA.debugLineNum = 86;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"spinner\", \"\",\"Spinner";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","spinner","","Spinner");
 //BA.debugLineNum = 87;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"snackbar1\", \"\",\"Snack";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","snackbar1","","Snack Bar");
 //BA.debugLineNum = 88;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"steppers\", \"\",\"Steppe";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","steppers","","Steppers");
 //BA.debugLineNum = 89;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"tabs\", \"\",\"Tabs\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","tabs","","Tabs");
 //BA.debugLineNum = 90;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"toolbar\", \"\",\"Toolbar";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","toolbar","","Toolbar");
 //BA.debugLineNum = 91;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"table\", \"\",\"Table\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","table","","Table");
 //BA.debugLineNum = 92;BA.debugLine="vm.drawer.AddSubItem(\"ui\", \"bottombar\", \"\",\"Botto";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("ui","bottombar","","Bottom Bar");
 //BA.debugLineNum = 98;BA.debugLine="vm.Drawer.AddItem(\"forms\",\"video_library\",\"Forms\"";
_vm._drawer /*b4j.example.vmdrawer*/ ._additem /*String*/ ("forms","video_library","Forms");
 //BA.debugLineNum = 99;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"datepicker\", \"date";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","datepicker","date_range","DatePicker");
 //BA.debugLineNum = 100;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"timepicker\", \"\",\"T";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","timepicker","","TimePicker");
 //BA.debugLineNum = 101;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"checkbox\", \"check_";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","checkbox","check_box_outline_blank","CheckBox");
 //BA.debugLineNum = 102;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"chip\", \"\",\"Chip\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","chip","","Chip");
 //BA.debugLineNum = 103;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"file\", \"attach_fil";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","file","attach_file","File");
 //BA.debugLineNum = 104;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"input\", \"input\",\"I";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","input","input","Input");
 //BA.debugLineNum = 105;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"textarea\", \"commen";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","textarea","comment","TextArea");
 //BA.debugLineNum = 106;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"radio\", \"radio_but";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","radio","radio_button_checked","Radio");
 //BA.debugLineNum = 107;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"combo\", \"arrow_dro";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","combo","arrow_drop_down","Select");
 //BA.debugLineNum = 108;BA.debugLine="vm.drawer.AddSubItem(\"forms\", \"switchbox\", \"toggl";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("forms","switchbox","toggle_off","Switch");
 //BA.debugLineNum = 110;BA.debugLine="vm.Drawer.AddItem(\"plugins\",\"\",\"Plugins\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._additem /*String*/ ("plugins","","Plugins");
 //BA.debugLineNum = 111;BA.debugLine="vm.drawer.AddSubItem(\"plugins\", \"gmap\", \"\",\"Googl";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("plugins","gmap","","Google Map");
 //BA.debugLineNum = 112;BA.debugLine="vm.drawer.AddSubItem(\"plugins\", \"chartkick\", \"\",\"";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ ("plugins","chartkick","","ChartKick");
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public static String  _buttons_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub buttons_click(e As BANanoEvent)";
 //BA.debugLineNum = 245;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Buttons\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Buttons");
 //BA.debugLineNum = 246;BA.debugLine="vm.ShowPage(modButtons.name)";
_vm._showpage /*String*/ (_modbuttons._name /*String*/ );
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return "";
}
public static String  _chartkick_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub chartkick_click(e As BANanoEvent)";
 //BA.debugLineNum = 117;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Chart Kick\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Chart Kick");
 //BA.debugLineNum = 118;BA.debugLine="vm.ShowPage(modChartKick.name)";
_vm._showpage /*String*/ (_modchartkick._name /*String*/ );
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub checkbox_click(e As BANanoEvent)";
 //BA.debugLineNum = 235;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - CheckBox\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - CheckBox");
 //BA.debugLineNum = 236;BA.debugLine="vm.ShowPage(modCheckBox.name)";
_vm._showpage /*String*/ (_modcheckbox._name /*String*/ );
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public static String  _chip_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub chip_click(e As BANanoEvent)";
 //BA.debugLineNum = 270;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Chip\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Chip");
 //BA.debugLineNum = 271;BA.debugLine="vm.ShowPage(modChips.name)";
_vm._showpage /*String*/ (_modchips._name /*String*/ );
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public static String  _combo_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub combo_click(e As BANanoEvent)";
 //BA.debugLineNum = 210;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Select\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Select");
 //BA.debugLineNum = 211;BA.debugLine="vm.ShowPage(modSelect.name)";
_vm._showpage /*String*/ (_modselect._name /*String*/ );
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public static String  _controls_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub controls_click(e As BANanoEvent)";
 //BA.debugLineNum = 195;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - List > Controls\"";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - List > Controls");
 //BA.debugLineNum = 196;BA.debugLine="vm.ShowPage(modList.name)";
_vm._showpage /*String*/ (_modlist._name /*String*/ );
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public static String  _datepicker_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub datepicker_click(e As BANanoEvent)";
 //BA.debugLineNum = 240;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - DatePicker\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - DatePicker");
 //BA.debugLineNum = 241;BA.debugLine="vm.ShowPage(modDatePicker.name)";
_vm._showpage /*String*/ (_moddatepicker._name /*String*/ );
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public static String  _dialog_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub dialog_click(e As BANanoEvent)";
 //BA.debugLineNum = 185;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Dialog\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Dialog");
 //BA.debugLineNum = 186;BA.debugLine="vm.ShowPage(modDialog.name)";
_vm._showpage /*String*/ (_moddialog._name /*String*/ );
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public static String  _empty_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub empty_click(e As BANanoEvent)";
 //BA.debugLineNum = 180;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Empty State\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Empty State");
 //BA.debugLineNum = 181;BA.debugLine="vm.ShowPage(modEmptyState.name)";
_vm._showpage /*String*/ (_modemptystate._name /*String*/ );
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public static String  _file_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub file_click(e As BANanoEvent)";
 //BA.debugLineNum = 230;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - File\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - File");
 //BA.debugLineNum = 231;BA.debugLine="vm.ShowPage(modFile.name)";
_vm._showpage /*String*/ (_modfile._name /*String*/ );
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public static String  _gmap_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub gmap_click(e As BANanoEvent)";
 //BA.debugLineNum = 122;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Google Map\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Google Map");
 //BA.debugLineNum = 123;BA.debugLine="vm.ShowPage(modGMap.name)";
_vm._showpage /*String*/ (_modgmap._name /*String*/ );
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _icon_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub icon_click(e As BANanoEvent)";
 //BA.debugLineNum = 200;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Icon\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Icon");
 //BA.debugLineNum = 201;BA.debugLine="vm.ShowPage(modIcon.name)";
_vm._showpage /*String*/ (_modicon._name /*String*/ );
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="vm.Initialize(Me, Main.appname)";
_vm._initialize /*String*/ (ba,pgindex.getObject(),_main._appname /*String*/ );
 //BA.debugLineNum = 11;BA.debugLine="vm.NavBar.UpdateLogo(\"./assets/sponge.png\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatelogo /*b4j.example.vmtoolbar*/ ("./assets/sponge.png");
 //BA.debugLineNum = 12;BA.debugLine="vm.NavBar.SetTitle(\"BVMDemo - created by TheMash\"";
_vm._navbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ ("BVMDemo - created by TheMash");
 //BA.debugLineNum = 13;BA.debugLine="vm.Drawer.SetTitle(\"BDMDemo\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._settitle /*b4j.example.vmdrawer*/ ("BDMDemo");
 //BA.debugLineNum = 14;BA.debugLine="vm.Drawer.SetPersistentFull(True)";
_vm._drawer /*b4j.example.vmdrawer*/ ._setpersistentfull /*b4j.example.vmdrawer*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 16;BA.debugLine="vm.NavBar.Show";
_vm._navbar /*b4j.example.vmtoolbar*/ ._show /*String*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.NavBar.SetPrimary(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setprimary /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 20;BA.debugLine="vm.NavBar.SetModeFixed(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setmodefixed /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 22;BA.debugLine="vm.NavBar.SetHasBackButton(False)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._sethasbackbutton /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 24;BA.debugLine="vm.NavBar.SetHasMenuButton(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._sethasmenubutton /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 26;BA.debugLine="BuildDrawer";
_builddrawer();
 //BA.debugLineNum = 28;BA.debugLine="vm.Container.AddRows(1).AddColumns12";
_vm._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 30;BA.debugLine="vm.AddPage(modTypography.name, modTypography)";
_vm._addpage /*String*/ (_modtypography._name /*String*/ ,(Object)(_modtypography.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="vm.AddPage(modChips.name, modChips)";
_vm._addpage /*String*/ (_modchips._name /*String*/ ,(Object)(_modchips.getObject()));
 //BA.debugLineNum = 32;BA.debugLine="vm.AddPage(modAvatar.name, modAvatar)";
_vm._addpage /*String*/ (_modavatar._name /*String*/ ,(Object)(_modavatar.getObject()));
 //BA.debugLineNum = 33;BA.debugLine="vm.AddPage(modBadge.name, modBadge)";
_vm._addpage /*String*/ (_modbadge._name /*String*/ ,(Object)(_modbadge.getObject()));
 //BA.debugLineNum = 34;BA.debugLine="vm.AddPage(modListView.name, modListView)";
_vm._addpage /*String*/ (_modlistview._name /*String*/ ,(Object)(_modlistview.getObject()));
 //BA.debugLineNum = 35;BA.debugLine="vm.AddPage(modButtons.name, modButtons)";
_vm._addpage /*String*/ (_modbuttons._name /*String*/ ,(Object)(_modbuttons.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="vm.AddPage(modDatePicker.name, modDatePicker)";
_vm._addpage /*String*/ (_moddatepicker._name /*String*/ ,(Object)(_moddatepicker.getObject()));
 //BA.debugLineNum = 37;BA.debugLine="vm.AddPage(modCheckBox.name, modCheckBox)";
_vm._addpage /*String*/ (_modcheckbox._name /*String*/ ,(Object)(_modcheckbox.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="vm.AddPage(modFile.name, modFile)";
_vm._addpage /*String*/ (_modfile._name /*String*/ ,(Object)(_modfile.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="vm.AddPage(modTextBox.name, modTextBox)";
_vm._addpage /*String*/ (_modtextbox._name /*String*/ ,(Object)(_modtextbox.getObject()));
 //BA.debugLineNum = 40;BA.debugLine="vm.AddPage(modTextArea.name, modTextArea)";
_vm._addpage /*String*/ (_modtextarea._name /*String*/ ,(Object)(_modtextarea.getObject()));
 //BA.debugLineNum = 41;BA.debugLine="vm.AddPage(modRadio.name, modRadio)";
_vm._addpage /*String*/ (_modradio._name /*String*/ ,(Object)(_modradio.getObject()));
 //BA.debugLineNum = 42;BA.debugLine="vm.AddPage(modSelect.name, modSelect)";
_vm._addpage /*String*/ (_modselect._name /*String*/ ,(Object)(_modselect.getObject()));
 //BA.debugLineNum = 43;BA.debugLine="vm.AddPage(modSwitch.name, modSwitch)";
_vm._addpage /*String*/ (_modswitch._name /*String*/ ,(Object)(_modswitch.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="vm.AddPage(modIcon.name, modIcon)";
_vm._addpage /*String*/ (_modicon._name /*String*/ ,(Object)(_modicon.getObject()));
 //BA.debugLineNum = 46;BA.debugLine="vm.AddPage(modMenu.name, modMenu)";
_vm._addpage /*String*/ (_modmenu._name /*String*/ ,(Object)(_modmenu.getObject()));
 //BA.debugLineNum = 47;BA.debugLine="vm.AddPage(modDialog.name, modDialog)";
_vm._addpage /*String*/ (_moddialog._name /*String*/ ,(Object)(_moddialog.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="vm.AddPage(modEmptyState.name, modEmptyState)";
_vm._addpage /*String*/ (_modemptystate._name /*String*/ ,(Object)(_modemptystate.getObject()));
 //BA.debugLineNum = 49;BA.debugLine="vm.AddPage(modSpeedDial.name, modSpeedDial)";
_vm._addpage /*String*/ (_modspeeddial._name /*String*/ ,(Object)(_modspeeddial.getObject()));
 //BA.debugLineNum = 50;BA.debugLine="vm.AddPage(modProgress.name, modProgress)";
_vm._addpage /*String*/ (_modprogress._name /*String*/ ,(Object)(_modprogress.getObject()));
 //BA.debugLineNum = 51;BA.debugLine="vm.AddPage(modSpinner.name, modSpinner)";
_vm._addpage /*String*/ (_modspinner._name /*String*/ ,(Object)(_modspinner.getObject()));
 //BA.debugLineNum = 52;BA.debugLine="vm.AddPage(modSnackBar.name, modSnackBar)";
_vm._addpage /*String*/ (_modsnackbar._name /*String*/ ,(Object)(_modsnackbar.getObject()));
 //BA.debugLineNum = 53;BA.debugLine="vm.AddPage(modSteppers.name, modSteppers)";
_vm._addpage /*String*/ (_modsteppers._name /*String*/ ,(Object)(_modsteppers.getObject()));
 //BA.debugLineNum = 54;BA.debugLine="vm.AddPage(modTabs.name, modTabs)";
_vm._addpage /*String*/ (_modtabs._name /*String*/ ,(Object)(_modtabs.getObject()));
 //BA.debugLineNum = 55;BA.debugLine="vm.AddPage(modToolbar.name, modToolbar)";
_vm._addpage /*String*/ (_modtoolbar._name /*String*/ ,(Object)(_modtoolbar.getObject()));
 //BA.debugLineNum = 56;BA.debugLine="vm.AddPage(modTable.name, modTable)";
_vm._addpage /*String*/ (_modtable._name /*String*/ ,(Object)(_modtable.getObject()));
 //BA.debugLineNum = 57;BA.debugLine="vm.AddPage(modBottomBar.name, modBottomBar)";
_vm._addpage /*String*/ (_modbottombar._name /*String*/ ,(Object)(_modbottombar.getObject()));
 //BA.debugLineNum = 58;BA.debugLine="vm.AddPage(modTimePIcker.name, modTimePIcker)";
_vm._addpage /*String*/ (_modtimepicker._name /*String*/ ,(Object)(_modtimepicker.getObject()));
 //BA.debugLineNum = 59;BA.debugLine="vm.AddPage(modGMap.name, modGMap)";
_vm._addpage /*String*/ (_modgmap._name /*String*/ ,(Object)(_modgmap.getObject()));
 //BA.debugLineNum = 60;BA.debugLine="vm.AddPage(modChartKick.name, modChartKick)";
_vm._addpage /*String*/ (_modchartkick._name /*String*/ ,(Object)(_modchartkick.getObject()));
 //BA.debugLineNum = 64;BA.debugLine="vm.ux";
_vm._ux /*String*/ ();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public static String  _input_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub input_click(e As BANanoEvent)";
 //BA.debugLineNum = 225;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Input\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Input");
 //BA.debugLineNum = 226;BA.debugLine="vm.ShowPage(modTextBox.name)";
_vm._showpage /*String*/ (_modtextbox._name /*String*/ );
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public static String  _listview_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub listview_click(e As BANanoEvent)";
 //BA.debugLineNum = 250;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - ListView\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - ListView");
 //BA.debugLineNum = 251;BA.debugLine="vm.ShowPage(modListView.name)";
_vm._showpage /*String*/ (_modlistview._name /*String*/ );
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return "";
}
public static String  _menus_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub menus_click(e As BANanoEvent)";
 //BA.debugLineNum = 190;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Menu\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Menu");
 //BA.debugLineNum = 191;BA.debugLine="vm.ShowPage(modMenu.name)";
_vm._showpage /*String*/ (_modmenu._name /*String*/ );
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 4;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _progress_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub progress_click(e As BANanoEvent)";
 //BA.debugLineNum = 168;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Progress\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Progress");
 //BA.debugLineNum = 169;BA.debugLine="vm.ShowPage(modProgress.name)";
_vm._showpage /*String*/ (_modprogress._name /*String*/ );
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public static String  _radio_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub radio_click(e As BANanoEvent)";
 //BA.debugLineNum = 215;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Radio\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Radio");
 //BA.debugLineNum = 216;BA.debugLine="vm.ShowPage(modRadio.name)";
_vm._showpage /*String*/ (_modradio._name /*String*/ );
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public static String  _snackbar1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub snackbar1_click(e As BANanoEvent)";
 //BA.debugLineNum = 158;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Snack Bar\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Snack Bar");
 //BA.debugLineNum = 159;BA.debugLine="vm.ShowPage(modSnackBar.name)";
_vm._showpage /*String*/ (_modsnackbar._name /*String*/ );
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public static String  _speeddial_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub speeddial_click(e As BANanoEvent)";
 //BA.debugLineNum = 174;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Speed Dial\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Speed Dial");
 //BA.debugLineNum = 175;BA.debugLine="vm.ShowPage(modSpeedDial.name)";
_vm._showpage /*String*/ (_modspeeddial._name /*String*/ );
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public static String  _spinner_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub spinner_click(e As BANanoEvent)";
 //BA.debugLineNum = 163;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Spinner\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Spinner");
 //BA.debugLineNum = 164;BA.debugLine="vm.ShowPage(modSpinner.name)";
_vm._showpage /*String*/ (_modspinner._name /*String*/ );
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public static String  _steppers_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub steppers_click(e As BANanoEvent)";
 //BA.debugLineNum = 153;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Steppers\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Steppers");
 //BA.debugLineNum = 154;BA.debugLine="vm.ShowPage(modSteppers.name)";
_vm._showpage /*String*/ (_modsteppers._name /*String*/ );
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public static String  _switchbox_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub switchbox_click(e As BANanoEvent)";
 //BA.debugLineNum = 205;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Switch\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Switch");
 //BA.debugLineNum = 206;BA.debugLine="vm.ShowPage(modSwitch.name)";
_vm._showpage /*String*/ (_modswitch._name /*String*/ );
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public static String  _table_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub table_click(e As BANanoEvent)";
 //BA.debugLineNum = 138;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Table\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Table");
 //BA.debugLineNum = 139;BA.debugLine="vm.ShowPage(modTable.name)";
_vm._showpage /*String*/ (_modtable._name /*String*/ );
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static String  _tabs_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub tabs_click(e As BANanoEvent)";
 //BA.debugLineNum = 148;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Tabs\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Tabs");
 //BA.debugLineNum = 149;BA.debugLine="vm.ShowPage(modTabs.name)";
_vm._showpage /*String*/ (_modtabs._name /*String*/ );
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public static String  _textarea_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub textarea_click(e As BANanoEvent)";
 //BA.debugLineNum = 220;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - TextArea\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - TextArea");
 //BA.debugLineNum = 221;BA.debugLine="vm.ShowPage(modTextArea.name)";
_vm._showpage /*String*/ (_modtextarea._name /*String*/ );
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public static String  _timepicker_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub timepicker_click(e As BANanoEvent)";
 //BA.debugLineNum = 128;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - TimePicker\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - TimePicker");
 //BA.debugLineNum = 129;BA.debugLine="vm.ShowPage(modTimePIcker.name)";
_vm._showpage /*String*/ (_modtimepicker._name /*String*/ );
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public static String  _toolbar_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub toolbar_click(e As BANanoEvent)";
 //BA.debugLineNum = 143;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Toolbar\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Toolbar");
 //BA.debugLineNum = 144;BA.debugLine="vm.ShowPage(modToolbar.name)";
_vm._showpage /*String*/ (_modtoolbar._name /*String*/ );
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public static String  _typography_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub typography_click(e As BANanoEvent)";
 //BA.debugLineNum = 265;BA.debugLine="vm.NavBar.UpdateTitle(\"BVMDemo - Typography\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ ("BVMDemo - Typography");
 //BA.debugLineNum = 266;BA.debugLine="vm.ShowPage(modTypography.name)";
_vm._showpage /*String*/ (_modtypography._name /*String*/ );
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
}
