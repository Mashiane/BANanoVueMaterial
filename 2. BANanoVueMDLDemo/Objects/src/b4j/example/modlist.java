package b4j.example;


import anywheresoftware.b4a.BA;

public class modlist extends Object{
public static modlist mostCurrent = new modlist();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modlist", null);
		ba.loadHtSubs(modlist.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modlist", ba);
		}
	}
    public static Class<?> getObject() {
		return modlist.class;
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
b4j.example.vmlist _lcontrols = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modList.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modList.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modlist.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns(3,12,4,4,4)";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns /*b4j.example.vmgrid*/ ((int) (3),BA.NumberToString(12),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4));
 //BA.debugLineNum = 18;BA.debugLine="Dim lcontrols As VMList = vm.CreateList(\"lcontrol";
_lcontrols = _vm._createlist /*b4j.example.vmlist*/ ("lcontrols",modlist.getObject())._setelevation /*b4j.example.vmlist*/ ((int) (2));
 //BA.debugLineNum = 19;BA.debugLine="lcontrols.AddSubHeader(\"Notifications\")";
_lcontrols._addsubheader /*b4j.example.vmlist*/ ((Object)("Notifications"));
 //BA.debugLineNum = 20;BA.debugLine="lcontrols.AddCheckBox(\"notification\",\"preview\",\"S";
_lcontrols._addcheckbox /*String*/ ("notification",BA.ObjectToBoolean("preview"),"Show Content Preview",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 21;BA.debugLine="lcontrols.AddCheckBox(\"notification\",\"sound\",\"Sou";
_lcontrols._addcheckbox /*String*/ ("notification",BA.ObjectToBoolean("sound"),"Sound",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 22;BA.debugLine="lcontrols.AddCheckBox(\"notification\",\"vibrate\",\"V";
_lcontrols._addcheckbox /*String*/ ("notification",BA.ObjectToBoolean("vibrate"),"Vibrate",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 23;BA.debugLine="lcontrols.AddCheckBox(\"notification\",\"light\",\"Not";
_lcontrols._addcheckbox /*String*/ ("notification",BA.ObjectToBoolean("light"),"Notification Light",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 24;BA.debugLine="lcontrols.AddToContainer(cont, 1, 1)";
_lcontrols._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateLABEL(\"lbl\").SetText(\"{{ notification }\"";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._settext /*b4j.example.vmlabel*/ ("{{ notification }")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 28;BA.debugLine="vm.SetStateList(\"notification\", Array())";
_vm._setstatelist /*b4j.example.bananovm*/ ("notification",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"listcode1\"";
_name = "listcode1";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
