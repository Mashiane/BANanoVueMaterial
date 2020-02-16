package b4j.example;


import anywheresoftware.b4a.BA;

public class modbottombar extends Object{
public static modbottombar mostCurrent = new modbottombar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbottombar", null);
		ba.loadHtSubs(modbottombar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbottombar", ba);
		}
	}
    public static Class<?> getObject() {
		return modbottombar.class;
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
public static String  _bb2item1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub bb2item1_click(e As BANanoEvent)";
 //BA.debugLineNum = 34;BA.debugLine="vm.ShowSnackBar(\"Home\")";
_vm._showsnackbar /*String*/ ("Home");
 //BA.debugLineNum = 35;BA.debugLine="vm.IncrementBadge(\"bb2item1\",1)";
_vm._incrementbadge /*b4j.example.bananovm*/ ("bb2item1",(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _bb2item2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub bb2item2_click(e As BANanoEvent)";
 //BA.debugLineNum = 39;BA.debugLine="vm.ShowSnackBar(\"Favourates\")";
_vm._showsnackbar /*String*/ ("Favourates");
 //BA.debugLineNum = 40;BA.debugLine="vm.IncrementBadge(\"bb2item2\",2)";
_vm._incrementbadge /*b4j.example.bananovm*/ ("bb2item2",(int) (2));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public static String  _bb2item3_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub bb2item3_click(e As BANanoEvent)";
 //BA.debugLineNum = 44;BA.debugLine="vm.ShowSnackBar(\"Posts\")";
_vm._showsnackbar /*String*/ ("Posts");
 //BA.debugLineNum = 45;BA.debugLine="vm.IncrementBadge(\"bb2item3\",3)";
_vm._incrementbadge /*b4j.example.bananovm*/ ("bb2item3",(int) (3));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _bbitem1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub bbitem1_click(e As BANanoEvent)";
 //BA.debugLineNum = 54;BA.debugLine="vm.ShowSnackBar(\"Home\")";
_vm._showsnackbar /*String*/ ("Home");
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _bbitem2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub bbitem2_click(e As BANanoEvent)";
 //BA.debugLineNum = 58;BA.debugLine="vm.ShowSnackBar(\"Favourates\")";
_vm._showsnackbar /*String*/ ("Favourates");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static String  _bbitem3_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub bbitem3_click(e As BANanoEvent)";
 //BA.debugLineNum = 62;BA.debugLine="vm.ShowSnackBar(\"Posts\")";
_vm._showsnackbar /*String*/ ("Posts");
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmbottombar _bb = null;
b4j.example.vmbottombar _bb2 = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modBottomBar.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modBottomBar.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbottombar.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns3x4";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns3x4 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim bb As VMBottomBar = vm.CreateButtomBar(\"bb1\",";
_bb = _vm._createbuttombar /*b4j.example.vmbottombar*/ ("bb1",modbottombar.getObject())._setprimary /*b4j.example.vmbottombar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 19;BA.debugLine="bb.AddItem(\"bbitem1\", \"Home\", \"home\", \"\")";
_bb._additem /*String*/ ("bbitem1","Home","home","");
 //BA.debugLineNum = 20;BA.debugLine="bb.AddItem(\"bbitem2\", \"Favourates\", \"favorite\", \"";
_bb._additem /*String*/ ("bbitem2","Favourates","favorite","");
 //BA.debugLineNum = 21;BA.debugLine="bb.AddItem(\"bbitem3\", \"Posts\", \"email\", \"\")";
_bb._additem /*String*/ ("bbitem3","Posts","email","");
 //BA.debugLineNum = 22;BA.debugLine="bb.AddToContainer(cont, 1, 1)";
_bb._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="Dim bb2 As VMBottomBar = vm.CreateButtomBar(\"bb2\"";
_bb2 = _vm._createbuttombar /*b4j.example.vmbottombar*/ ("bb2",modbottombar.getObject())._setaccent /*b4j.example.vmbottombar*/ (anywheresoftware.b4a.keywords.Common.True)._settypeshift /*b4j.example.vmbottombar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 25;BA.debugLine="bb2.AddItem(\"bb2item1\", \"Home\", \"home\", \"1\")";
_bb2._additem /*String*/ ("bb2item1","Home","home","1");
 //BA.debugLineNum = 26;BA.debugLine="bb2.AddItem(\"bb2item2\", \"Favourates\", \"favorite\",";
_bb2._additem /*String*/ ("bb2item2","Favourates","favorite","3");
 //BA.debugLineNum = 27;BA.debugLine="bb2.AddItem(\"bb2item3\", \"Posts\", \"email\", \"2\")";
_bb2._additem /*String*/ ("bb2item3","Posts","email","2");
 //BA.debugLineNum = 28;BA.debugLine="bb2.AddToContainer(cont, 1, 2)";
_bb2._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 30;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"bottomcode\"";
_name = "bottomcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
