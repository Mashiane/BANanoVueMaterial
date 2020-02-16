package b4j.example;


import anywheresoftware.b4a.BA;

public class modtextbox extends Object{
public static modtextbox mostCurrent = new modtextbox();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtextbox", null);
		ba.loadHtSubs(modtextbox.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtextbox", ba);
		}
	}
    public static Class<?> getObject() {
		return modtextbox.class;
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
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _btnx_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub btnx_click(e As BANanoEvent)";
 //BA.debugLineNum = 58;BA.debugLine="vm.ShowError(\"inp7\")";
_vm._showerror /*String*/ ("inp7");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modTextBox.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modTextBox.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtextbox.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns(2,12,12,12,12)";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns /*b4j.example.vmgrid*/ ((int) (2),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateInput(\"inp1\",Me).SetLabel(\"Initial Value";
_vm._createinput /*b4j.example.vminput*/ ("inp1",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Initial Value")._setvmodel /*b4j.example.vminput*/ ("initial")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateInput(\"inp2\",Me).SetLabel(\"Initial Value";
_vm._createinput /*b4j.example.vminput*/ ("inp2",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Initial Value (Read Only)")._setreadonly /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.True)._setvmodel /*b4j.example.vminput*/ ("initial")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateInput(\"inp3\",Me).SetLabel(\"With Help\").S";
_vm._createinput /*b4j.example.vminput*/ ("inp3",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("With Help")._setvmodel /*b4j.example.vminput*/ ("help")._sethelpertext /*b4j.example.vminput*/ ("Some help text")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateInput(\"inp4\",Me).SetLabel(\"Inline\").SetV";
_vm._createinput /*b4j.example.vminput*/ ("inp4",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Inline")._setvmodel /*b4j.example.vminput*/ ("help1")._setinline /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateInput(\"inp5\",Me).SetLabel(\"Number\").SetV";
_vm._createinput /*b4j.example.vminput*/ ("inp5",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Number")._setvmodel /*b4j.example.vminput*/ ("help3")._settypenumber /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateInput(\"inp6\",Me).SetLabel(\"Disabled\").Se";
_vm._createinput /*b4j.example.vminput*/ ("inp6",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Disabled")._setvmodel /*b4j.example.vminput*/ ("help4")._setdisabled /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateInput(\"inp7\",Me).SetLabel(\"Required\").Se";
_vm._createinput /*b4j.example.vminput*/ ("inp7",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Required")._setvmodel /*b4j.example.vminput*/ ("help5")._seterrortext /*b4j.example.vminput*/ ("There is an error")._setrequired /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="vm.CreateInput(\"inp8\",Me).SetLabel(\"Counter\").Set";
_vm._createinput /*b4j.example.vminput*/ ("inp8",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Counter")._setvmodel /*b4j.example.vminput*/ ("txtcount")._setcounter /*b4j.example.vminput*/ (BA.NumberToString(30))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateInput(\"inp9\",Me).SetLabel(\"Max Length\").";
_vm._createinput /*b4j.example.vminput*/ ("inp9",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Max Length")._setvmodel /*b4j.example.vminput*/ ("txtlen")._setmaxlength /*b4j.example.vminput*/ ((int) (10))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vm.CreateInput(\"inp10\",Me).SetLabel(\"Max Length &";
_vm._createinput /*b4j.example.vminput*/ ("inp10",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Max Length & Disabled Counter")._setvmodel /*b4j.example.vminput*/ ("txtlend")._setmaxlength /*b4j.example.vminput*/ ((int) (15))._setcounterdisabled /*b4j.example.vminput*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateInput(\"txti\",Me).SetLabel(\"Date\").SetVMo";
_vm._createinput /*b4j.example.vminput*/ ("txti",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Date")._setvmodel /*b4j.example.vminput*/ ("txti")._seticon /*b4j.example.vminput*/ ("event")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.CreateInput(\"txtz\",Me).SetLabel(\"Voice\").SetVM";
_vm._createinput /*b4j.example.vminput*/ ("txtz",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Voice")._setvmodel /*b4j.example.vminput*/ ("txtz")._seticon1 /*b4j.example.vminput*/ ("keyboard_voice")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.CreateInput(\"txty\",Me).SetLabel(\"Transfer Mone";
_vm._createinput /*b4j.example.vminput*/ ("txty",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Transfer Money")._setvmodel /*b4j.example.vminput*/ ("txty")._seticon /*b4j.example.vminput*/ ("warning")._seticon1 /*b4j.example.vminput*/ ("attach_money")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="vm.CreateInput(\"txtw\",Me).SetLabel(\"Cleraable\").S";
_vm._createinput /*b4j.example.vminput*/ ("txtw",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Cleraable")._setvmodel /*b4j.example.vminput*/ ("initial")._setclearable /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 32;BA.debugLine="vm.CreateInput(\"txtu\",Me).SetLabel(\"Password\").Se";
_vm._createinput /*b4j.example.vminput*/ ("txtu",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Password")._setvmodel /*b4j.example.vminput*/ ("password")._settypepassword /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 33;BA.debugLine="vm.CreateInput(\"txth\",Me).SetLabel(\"Password with";
_vm._createinput /*b4j.example.vminput*/ ("txth",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Password without toggle")._setvmodel /*b4j.example.vminput*/ ("password")._settypepassword /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.True)._settogglepassword /*b4j.example.vminput*/ (anywheresoftware.b4a.keywords.Common.False)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="vm.CreateInput(\"txtd\",Me).SetLabel(\"Prefix\").SetV";
_vm._createinput /*b4j.example.vminput*/ ("txtd",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Prefix")._setvmodel /*b4j.example.vminput*/ ("txtd")._setprefix /*b4j.example.vminput*/ ("$")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 35;BA.debugLine="vm.CreateInput(\"txtf\",Me).SetLabel(\"Suffix\").SetV";
_vm._createinput /*b4j.example.vminput*/ ("txtf",modtextbox.getObject())._setlabel /*b4j.example.vminput*/ ("Suffix")._setvmodel /*b4j.example.vminput*/ ("txtf")._setsuffix /*b4j.example.vminput*/ ("@gmail.com")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 38;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 39;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 40;BA.debugLine="vm.CreateButton(\"btnx\",Me).SetText(\"Show Error\").";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnx",modtextbox.getObject())._settext /*b4j.example.vmbutton*/ ("Show Error")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 44;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetText(\"{{ initi";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("{{ initial }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 45;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetText(\"{{ help";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("{{ help }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 46;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetText(\"{{ help1";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("{{ help1 }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 47;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetText(\"{{ help3";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("{{ help3 }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 48;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetText(\"{{ help4";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("{{ help4 }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 49;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetText(\"{{ txtd";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("{{ txtd }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 50;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetText(\"{{ txtf";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("{{ txtf }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 52;BA.debugLine="vm.SetStateSingle(\"help4\", \"This text control is";
_vm._setstatesingle /*b4j.example.bananovm*/ ((Object)("help4"),(Object)("This text control is disabled!"));
 //BA.debugLineNum = 53;BA.debugLine="vm.SetStateSingle(\"initial\", \"This is BANanoVuewM";
_vm._setstatesingle /*b4j.example.bananovm*/ ((Object)("initial"),(Object)("This is BANanoVuewMaterial"));
 //BA.debugLineNum = 54;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"textcode\"";
_name = "textcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
