package b4j.example;


import anywheresoftware.b4a.BA;

public class modemptystate extends Object{
public static modemptystate mostCurrent = new modemptystate();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modemptystate", null);
		ba.loadHtSubs(modemptystate.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modemptystate", ba);
		}
	}
    public static Class<?> getObject() {
		return modemptystate.class;
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
public static String  _btn1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub btn1_click(e As BANanoEvent)";
 //BA.debugLineNum = 45;BA.debugLine="vm.ShowSnackBar(\"Start creating your project now!";
_vm._showsnackbar /*String*/ ("Start creating your project now!");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmemptystate _es = null;
b4j.example.vmbutton _btn = null;
b4j.example.vmemptystate _es1 = null;
b4j.example.vmemptystate _es2 = null;
b4j.example.vmemptystate _es3 = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modEmptyState.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modEmptyState.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modemptystate.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(4).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (4))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim es As VMEmptyState = vm.CreateEmptyState(\"es1";
_es = _vm._createemptystate /*b4j.example.vmemptystate*/ ("es1",modemptystate.getObject());
 //BA.debugLineNum = 19;BA.debugLine="es.SetIcon(\"devices_other\").SetLabel(\"Create your";
_es._seticon /*b4j.example.vmemptystate*/ ("devices_other")._setlabel /*b4j.example.vmemptystate*/ ("Create your first project");
 //BA.debugLineNum = 20;BA.debugLine="es.SetDescription(\"Creating project, you'll be ab";
_es._setdescription /*b4j.example.vmemptystate*/ ("Creating project, you'll be able to upload your design and collaborate with people.");
 //BA.debugLineNum = 22;BA.debugLine="Dim btn As VMButton = vm.CreateButton(\"btn1\", Me)";
_btn = _vm._createbutton /*b4j.example.vmbutton*/ ("btn1",modemptystate.getObject())._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmbutton*/ ("Create first project");
 //BA.debugLineNum = 23;BA.debugLine="es.Addhtml(btn.tostring)";
_es._addhtml /*b4j.example.vmemptystate*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 24;BA.debugLine="es.AddToContainer(cont, 1, 1)";
_es._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="Dim es1 As VMEmptyState = vm.CreateEmptyState(\"es";
_es1 = _vm._createemptystate /*b4j.example.vmemptystate*/ ("es1",modemptystate.getObject())._setrounded /*b4j.example.vmemptystate*/ (anywheresoftware.b4a.keywords.Common.True)._seticon /*b4j.example.vmemptystate*/ ("access_time");
 //BA.debugLineNum = 27;BA.debugLine="es1.Setlabel(\"Nothing in Snoozed\")";
_es1._setlabel /*b4j.example.vmemptystate*/ ("Nothing in Snoozed");
 //BA.debugLineNum = 28;BA.debugLine="es1.SetDescription(\"Anything you snooze will go h";
_es1._setdescription /*b4j.example.vmemptystate*/ ("Anything you snooze will go here until it's time for it to return to the inbox.");
 //BA.debugLineNum = 29;BA.debugLine="es1.AddToContainer(cont, 2, 1)";
_es1._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="Dim es2 As VMEmptyState = vm.CreateEmptyState(\"es";
_es2 = _vm._createemptystate /*b4j.example.vmemptystate*/ ("es2",modemptystate.getObject())._seticon /*b4j.example.vmemptystate*/ ("done")._setprimary /*b4j.example.vmemptystate*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 32;BA.debugLine="es2.Setlabel(\"Nothing in Done\")";
_es2._setlabel /*b4j.example.vmemptystate*/ ("Nothing in Done");
 //BA.debugLineNum = 33;BA.debugLine="es2.SetDescription(\"Anything you mark done will b";
_es2._setdescription /*b4j.example.vmemptystate*/ ("Anything you mark done will be safely stored here.");
 //BA.debugLineNum = 34;BA.debugLine="es2.AddToContainer(cont, 3, 1)";
_es2._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="Dim es3 As VMEmptyState = vm.CreateEmptyState(\"es";
_es3 = _vm._createemptystate /*b4j.example.vmemptystate*/ ("es3",modemptystate.getObject())._setrounded /*b4j.example.vmemptystate*/ (anywheresoftware.b4a.keywords.Common.True)._seticon /*b4j.example.vmemptystate*/ ("alarm_off")._setaccent /*b4j.example.vmemptystate*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 37;BA.debugLine="es3.Setlabel(\"Nothing in Reminders\")";
_es3._setlabel /*b4j.example.vmemptystate*/ ("Nothing in Reminders");
 //BA.debugLineNum = 38;BA.debugLine="es3.SetDescription(\"Create a Reminder and it will";
_es3._setdescription /*b4j.example.vmemptystate*/ ("Create a Reminder and it will show up here.");
 //BA.debugLineNum = 39;BA.debugLine="es3.AddToContainer(cont, 4, 1)";
_es3._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"emptycode\"";
_name = "emptycode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
