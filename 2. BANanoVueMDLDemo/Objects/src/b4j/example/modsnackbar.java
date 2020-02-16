package b4j.example;


import anywheresoftware.b4a.BA;

public class modsnackbar extends Object{
public static modsnackbar mostCurrent = new modsnackbar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modsnackbar", null);
		ba.loadHtSubs(modsnackbar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modsnackbar", ba);
		}
	}
    public static Class<?> getObject() {
		return modsnackbar.class;
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
public static String  _btnx_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub btnx_click(e As BANanoEvent)";
 //BA.debugLineNum = 30;BA.debugLine="vm.showdialog(\"sb1\")";
_vm._showdialog /*String*/ ("sb1");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmsnackbar _sb1 = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modSnackBar.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modSnackBar.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modsnackbar.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim sb1 As VMSnackbar = vm.CreateSnackBar(\"sb1\",";
_sb1 = _vm._createsnackbar /*b4j.example.vmsnackbar*/ ("sb1",modsnackbar.getObject())._setpositionleft /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True)._setduration /*b4j.example.vmsnackbar*/ ((int) (3000))._setpersistent /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 19;BA.debugLine="sb1.SetText(\"This is my snack bar!\").SetOnClick(\"";
_sb1._settext /*b4j.example.vmsnackbar*/ ("This is my snack bar!")._setonclick /*b4j.example.vmsnackbar*/ ("sb1close_click");
 //BA.debugLineNum = 20;BA.debugLine="sb1.Button.SetText(\"Retry\").SetAccent(True)";
_sb1._button /*b4j.example.vmbutton*/ ._settext /*b4j.example.vmbutton*/ ("Retry")._setaccent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 21;BA.debugLine="sb1.button.Show";
_sb1._button /*b4j.example.vmbutton*/ ._show /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="vm.AddSnackBar(sb1)";
_vm._addsnackbar /*String*/ (_sb1);
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateButton(\"btnx\", Me).SetText(\"Show Snackba";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnx",modsnackbar.getObject())._settext /*b4j.example.vmbutton*/ ("Show Snackbar")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"snackcode\"";
_name = "snackcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _sb1close_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub sb1close_click(e As BANanoEvent)";
 //BA.debugLineNum = 34;BA.debugLine="vm.showsnackbar(\"Retry clicked!\")";
_vm._showsnackbar /*String*/ ("Retry clicked!");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
}
