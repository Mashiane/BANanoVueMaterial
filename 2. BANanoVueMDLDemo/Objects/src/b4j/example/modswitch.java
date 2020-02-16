package b4j.example;


import anywheresoftware.b4a.BA;

public class modswitch extends Object{
public static modswitch mostCurrent = new modswitch();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modswitch", null);
		ba.loadHtSubs(modswitch.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modswitch", ba);
		}
	}
    public static Class<?> getObject() {
		return modswitch.class;
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
public static b4j.example.modtable _modtable = null;
public static b4j.example.modtabs _modtabs = null;
public static b4j.example.modtextarea _modtextarea = null;
public static b4j.example.modtextbox _modtextbox = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modSwitch.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modSwitch.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modswitch.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.createswitch(\"s1\",Me).SetVModel(\"array\").SetVa";
_vm._createswitch /*b4j.example.vmswitch*/ ("s1",modswitch.getObject())._setvmodel /*b4j.example.vmswitch*/ ("array")._setvalue /*b4j.example.vmswitch*/ ((Object)("1"))._settext /*b4j.example.vmswitch*/ ("Array")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.createswitch(\"s2\",Me).SetVModel(\"array\").SetVa";
_vm._createswitch /*b4j.example.vmswitch*/ ("s2",modswitch.getObject())._setvmodel /*b4j.example.vmswitch*/ ("array")._setvalue /*b4j.example.vmswitch*/ ((Object)("2"))._settext /*b4j.example.vmswitch*/ ("Array")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.createswitch(\"s3\",Me).SetVModel(\"boolean\").Set";
_vm._createswitch /*b4j.example.vmswitch*/ ("s3",modswitch.getObject())._setvmodel /*b4j.example.vmswitch*/ ("boolean")._settext /*b4j.example.vmswitch*/ ("Boolean")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.createswitch(\"s4\",Me).SetVModel(\"string\").SetT";
_vm._createswitch /*b4j.example.vmswitch*/ ("s4",modswitch.getObject())._setvmodel /*b4j.example.vmswitch*/ ("string")._settext /*b4j.example.vmswitch*/ ("String")._setvalue /*b4j.example.vmswitch*/ ((Object)("my-switch"))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.createswitch(\"s5\",Me).SetVModel(\"novalue\").Set";
_vm._createswitch /*b4j.example.vmswitch*/ ("s5",modswitch.getObject())._setvmodel /*b4j.example.vmswitch*/ ("novalue")._settext /*b4j.example.vmswitch*/ ("No Value")._setprimary /*b4j.example.vmswitch*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.createswitch(\"s6\",Me).SetVModel(\"disabled\").Se";
_vm._createswitch /*b4j.example.vmswitch*/ ("s6",modswitch.getObject())._setvmodel /*b4j.example.vmswitch*/ ("disabled")._settext /*b4j.example.vmswitch*/ ("Disabled")._setdisabled /*b4j.example.vmswitch*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 26;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateLABEL(\"lbl\").SetText(\"{{ array }}\").SetP";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._settext /*b4j.example.vmlabel*/ ("{{ array }}")._setparagraph /*b4j.example.vmlabel*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.CreateLABEL(\"lbl1\").SetText(\"{{ boolean }}\").S";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl1")._settext /*b4j.example.vmlabel*/ ("{{ boolean }}")._setparagraph /*b4j.example.vmlabel*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.CreateLABEL(\"lbl2\").SetText(\"{{ string }}\").Se";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl2")._settext /*b4j.example.vmlabel*/ ("{{ string }}")._setparagraph /*b4j.example.vmlabel*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="vm.CreateLABEL(\"lbl3\").SetText(\"{{ novalue }}\").S";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl3")._settext /*b4j.example.vmlabel*/ ("{{ novalue }}")._setparagraph /*b4j.example.vmlabel*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 33;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 34;BA.debugLine="vm.SetStateList(\"array\", Array())";
_vm._setstatelist /*b4j.example.bananovm*/ ("array",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"switchcode\"";
_name = "switchcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _s5_change(Object _sval) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub s5_change(sval As Object)";
 //BA.debugLineNum = 39;BA.debugLine="vm.ShowSnackBar(sval)";
_vm._showsnackbar /*String*/ (BA.ObjectToString(_sval));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
}
