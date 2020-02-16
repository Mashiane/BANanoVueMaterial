package b4j.example;


import anywheresoftware.b4a.BA;

public class moddatepicker extends Object{
public static moddatepicker mostCurrent = new moddatepicker();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.moddatepicker", null);
		ba.loadHtSubs(moddatepicker.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.moddatepicker", ba);
		}
	}
    public static Class<?> getObject() {
		return moddatepicker.class;
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
public static String  _btn_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub btn_click(e As BANanoEvent)";
 //BA.debugLineNum = 41;BA.debugLine="vm.ToYYYYMMDD(\"dp1\")";
_vm._toyyyymmdd /*String*/ ("dp1");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modDatePicker.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modDatePicker.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,moddatepicker.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 17;BA.debugLine="vm.CreateDatePicker(\"dp1\",Me).SetLabel(\"Date Pick";
_vm._createdatepicker /*b4j.example.vmdatepicker*/ ("dp1",moddatepicker.getObject())._setlabel /*b4j.example.vmdatepicker*/ ("Date Picker")._setvmodel /*b4j.example.vmdatepicker*/ ("dp1")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateDatePicker(\"dp2\",Me).SetLabel(\"Immediate";
_vm._createdatepicker /*b4j.example.vmdatepicker*/ ("dp2",moddatepicker.getObject())._setlabel /*b4j.example.vmdatepicker*/ ("Immediately")._setimmediately /*b4j.example.vmdatepicker*/ (anywheresoftware.b4a.keywords.Common.True)._setvmodel /*b4j.example.vmdatepicker*/ ("dp2")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateDatePicker(\"dp3\",Me).SetLabel(\"On Open/C";
_vm._createdatepicker /*b4j.example.vmdatepicker*/ ("dp3",moddatepicker.getObject())._setlabel /*b4j.example.vmdatepicker*/ ("On Open/Close")._setvmodel /*b4j.example.vmdatepicker*/ ("dp3")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateLabel(\"lbl\").SetParagraph.SetText(\"Selec";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("Selected Date: {{ dp1 }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateLabel(\"lbl1\").SetParagraph.SetText(\"Date";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl1")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("Date 2: {{ dp2 }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateLabel(\"lbl2\").SetParagraph.SetText(\"Date";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl2")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("Date 3: {{ dp3 }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 25;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateButton(\"btn\",Me).SetText(\"Get Date\").Set";
_vm._createbutton /*b4j.example.vmbutton*/ ("btn",moddatepicker.getObject())._settext /*b4j.example.vmbutton*/ ("Get Date")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public static String  _d3_closed(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub d3_closed(e As BANanoEvent)";
 //BA.debugLineNum = 35;BA.debugLine="vm.ToYYYYMMDD(\"dp3\")";
_vm._toyyyymmdd /*String*/ ("dp3");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _d3_opened(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub d3_opened(e As BANanoEvent)";
 //BA.debugLineNum = 31;BA.debugLine="vm.ToYYYYMMDD(\"dp3\")";
_vm._toyyyymmdd /*String*/ ("dp3");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"datepickercode\"";
_name = "datepickercode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
