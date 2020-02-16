package b4j.example;


import anywheresoftware.b4a.BA;

public class moddialog extends Object{
public static moddialog mostCurrent = new moddialog();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.moddialog", null);
		ba.loadHtSubs(moddialog.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.moddialog", ba);
		}
	}
    public static Class<?> getObject() {
		return moddialog.class;
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
public static String  _a1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub a1_click(e As BANanoEvent)";
 //BA.debugLineNum = 54;BA.debugLine="vm.ShowAlert(\"first\", \"Hi there!\", \"Your post has";
_vm._showalert /*String*/ ("first","Hi there!","Your post has been deleted!","Cool");
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _a2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub a2_click(e As BANanoEvent)";
 //BA.debugLineNum = 58;BA.debugLine="vm.ShowAlert(\"second\", \"Google Location\", \"Your p";
_vm._showalert /*String*/ ("second","Google Location","Your post <strong>Material Design is awesome</strong> has been created.","Ok");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static String  _a3_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub a3_click(e As BANanoEvent)";
 //BA.debugLineNum = 50;BA.debugLine="vm.showdialog(\"askuser\")";
_vm._showdialog /*String*/ ("askuser");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _a4_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub a4_click(e As BANanoEvent)";
 //BA.debugLineNum = 62;BA.debugLine="vm.ShowPrompt1(\"yourname\")";
_vm._showprompt1 /*String*/ ("yourname");
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _askuser_cancel(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub askuser_cancel(e As BANanoEvent)";
 //BA.debugLineNum = 86;BA.debugLine="vm.showsnackbar(\"Cancel Google location!\")";
_vm._showsnackbar /*String*/ ("Cancel Google location!");
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _askuser_ok(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub askuser_ok(e As BANanoEvent)";
 //BA.debugLineNum = 82;BA.debugLine="vm.ShowSnackBar(\"Use Google location!\")";
_vm._showsnackbar /*String*/ ("Use Google location!");
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public static String  _btncancel_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub btncancel_click(e As BANanoEvent)";
 //BA.debugLineNum = 76;BA.debugLine="vm.ShowSnackBar(\"Dialog Cancel clicked!\")";
_vm._showsnackbar /*String*/ ("Dialog Cancel clicked!");
 //BA.debugLineNum = 77;BA.debugLine="vm.hidedialog(\"dialog1\")";
_vm._hidedialog /*String*/ ("dialog1");
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _btnok_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub btnok_click(e As BANanoEvent)";
 //BA.debugLineNum = 72;BA.debugLine="vm.showsnackbar(\"Dialog Ok clicked!\")";
_vm._showsnackbar /*String*/ ("Dialog Ok clicked!");
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modDialog.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modDialog.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,moddialog.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns(4,12,3,3,3)";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns /*b4j.example.vmgrid*/ ((int) (4),BA.NumberToString(12),BA.NumberToString(3),BA.NumberToString(3),BA.NumberToString(3));
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateButton(\"d1\", Me).SetText(\"Show Dialog\").";
_vm._createbutton /*b4j.example.vmbutton*/ ("d1",moddialog.getObject())._settext /*b4j.example.vmbutton*/ ("Show Dialog")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateButton(\"a1\", Me).SetText(\"Alert 1\").SetR";
_vm._createbutton /*b4j.example.vmbutton*/ ("a1",moddialog.getObject())._settext /*b4j.example.vmbutton*/ ("Alert 1")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateButton(\"a2\", Me).SetText(\"Alert 2\").SetA";
_vm._createbutton /*b4j.example.vmbutton*/ ("a2",moddialog.getObject())._settext /*b4j.example.vmbutton*/ ("Alert 2")._setaccent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (3));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateButton(\"a3\", Me).SetText(\"Confirm\").SetA";
_vm._createbutton /*b4j.example.vmbutton*/ ("a3",moddialog.getObject())._settext /*b4j.example.vmbutton*/ ("Confirm")._setaccent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (4));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateButton(\"a4\", Me).SetText(\"Prompt\").SetPr";
_vm._createbutton /*b4j.example.vmbutton*/ ("a4",moddialog.getObject())._settext /*b4j.example.vmbutton*/ ("Prompt")._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 25;BA.debugLine="CreateDialog";
_createdialog();
 //BA.debugLineNum = 28;BA.debugLine="vm.AddConfirm(\"askuser\", Me, \"Use Google's locati";
_vm._addconfirm /*String*/ ("askuser",moddialog.getObject(),"Use Google's location service?","Let Google help apps determine location. <br> This means sending <strong>anonymous</strong> location data to Google, even when no apps are running.","Agree","Disagree");
 //BA.debugLineNum = 31;BA.debugLine="vm.AddPrompt(\"yourname\", Me, \"What's your name?\",";
_vm._addprompt /*String*/ ("yourname",moddialog.getObject(),"What's your name?","","Type your name",(int) (30),"Done","Cancel");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public static String  _createdialog() throws Exception{
b4j.example.vmdialog _dialog1 = null;
b4j.example.vmlabel _lbl = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub CreateDialog";
 //BA.debugLineNum = 37;BA.debugLine="Dim dialog1 As VMDialog = vm.CreateDialog(\"dialog";
_dialog1 = _vm._createdialog /*b4j.example.vmdialog*/ ("dialog1",moddialog.getObject())._settitle /*b4j.example.vmdialog*/ ((Object)("Dialog 1"));
 //BA.debugLineNum = 39;BA.debugLine="Dim lbl As VMLabel = vm.CreateLABEL(\"lblx\").SetTe";
_lbl = _vm._createlabel /*b4j.example.vmlabel*/ ("lblx")._settext /*b4j.example.vmlabel*/ ("This is my dialog content!");
 //BA.debugLineNum = 41;BA.debugLine="dialog1.Container.AddRows(1).AddColumns(1,12,12,1";
_dialog1._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns /*b4j.example.vmgrid*/ ((int) (1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 42;BA.debugLine="dialog1.Container.AddComponent(1,1, lbl.tostring)";
_dialog1._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_lbl._tostring /*String*/ ());
 //BA.debugLineNum = 44;BA.debugLine="dialog1.AddCancel(\"btncancel\", \"Cancel\")";
_dialog1._addcancel /*b4j.example.vmdialog*/ ("btncancel","Cancel");
 //BA.debugLineNum = 45;BA.debugLine="dialog1.AddOk(\"btnok\", \"Ok\")";
_dialog1._addok /*b4j.example.vmdialog*/ ("btnok","Ok");
 //BA.debugLineNum = 46;BA.debugLine="vm.AddDialog(dialog1)";
_vm._adddialog /*String*/ (_dialog1);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _d1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub d1_click(e As BANanoEvent)";
 //BA.debugLineNum = 68;BA.debugLine="vm.showdialog(\"dialog1\")";
_vm._showdialog /*String*/ ("dialog1");
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"dialogcode\"";
_name = "dialogcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _yourname_cancel(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub yourname_cancel(e As BANanoEvent)";
 //BA.debugLineNum = 94;BA.debugLine="vm.setprompt(Null)";
_vm._setprompt /*String*/ (anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 95;BA.debugLine="vm.showsnackbar(\"Cancel Name Prompt\")";
_vm._showsnackbar /*String*/ ("Cancel Name Prompt");
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _yourname_ok(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub yourname_ok(e As BANanoEvent)";
 //BA.debugLineNum = 90;BA.debugLine="vm.ShowSnackBar(vm.getprompt)";
_vm._showsnackbar /*String*/ (_vm._getprompt /*String*/ ());
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
}
