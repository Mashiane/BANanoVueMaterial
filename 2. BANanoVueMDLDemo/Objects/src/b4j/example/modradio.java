package b4j.example;


import anywheresoftware.b4a.BA;

public class modradio extends Object{
public static modradio mostCurrent = new modradio();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modradio", null);
		ba.loadHtSubs(modradio.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modradio", ba);
		}
	}
    public static Class<?> getObject() {
		return modradio.class;
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
b4j.example.vmradiogroup _rg = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modRadio.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modRadio.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modradio.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateRadio(\"rd1\",Me).SetVmodel(\"radio\").SetVa";
_vm._createradio /*b4j.example.vmradio*/ ("rd1",modradio.getObject())._setvmodel /*b4j.example.vmradio*/ ("radio")._setvalue /*b4j.example.vmradio*/ ((Object)("false"),anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmradio*/ ("Boolean")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateRadio(\"rd2\",Me).SetVmodel(\"radio\").SetVa";
_vm._createradio /*b4j.example.vmradio*/ ("rd2",modradio.getObject())._setvmodel /*b4j.example.vmradio*/ ("radio")._setvalue /*b4j.example.vmradio*/ ((Object)("my-radio"),anywheresoftware.b4a.keywords.Common.False)._settext /*b4j.example.vmradio*/ ("String")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateRadio(\"rd3\",Me).SetVmodel(\"radio\").SetTe";
_vm._createradio /*b4j.example.vmradio*/ ("rd3",modradio.getObject())._setvmodel /*b4j.example.vmradio*/ ("radio")._settext /*b4j.example.vmradio*/ ("No Value")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateRadio(\"rd4\",Me).SetVmodel(\"radio\").SetDi";
_vm._createradio /*b4j.example.vmradio*/ ("rd4",modradio.getObject())._setvmodel /*b4j.example.vmradio*/ ("radio")._setdisabled /*b4j.example.vmradio*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmradio*/ ("Disabled")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="cont.AddComponent(1, 1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 24;BA.debugLine="cont.AddComponent(1, 1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 26;BA.debugLine="Dim rg As VMRadioGroup = vm.CreateRadioGroup(\"rg1";
_rg = _vm._createradiogroup /*b4j.example.vmradiogroup*/ ("rg1","Languages",modradio.getObject())._setvmodel /*b4j.example.vmradiogroup*/ ("mybook")._setvalue /*b4j.example.vmradiogroup*/ ((Object)("l1"));
 //BA.debugLineNum = 27;BA.debugLine="rg.AddItem(\"l1\", \"Xhosa\")";
_rg._additem /*b4j.example.vmradiogroup*/ ("l1","Xhosa");
 //BA.debugLineNum = 28;BA.debugLine="rg.AddItem(\"l2\", \"English\")";
_rg._additem /*b4j.example.vmradiogroup*/ ("l2","English");
 //BA.debugLineNum = 29;BA.debugLine="rg.AddItem(\"l3\", \"Afrikaans\")";
_rg._additem /*b4j.example.vmradiogroup*/ ("l3","Afrikaans");
 //BA.debugLineNum = 30;BA.debugLine="rg.AddToContainer(cont, 1, 1)";
_rg._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 32;BA.debugLine="vm.CreateLABEL(\"lbl\").SetText(\"{{ radio }}\").AddT";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._settext /*b4j.example.vmlabel*/ ("{{ radio }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 33;BA.debugLine="cont.AddComponent(1, 1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 34;BA.debugLine="vm.CreateLABEL(\"lbl\").SetText(\"{{ mybook }}\").Add";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._settext /*b4j.example.vmlabel*/ ("{{ mybook }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"radiocode\"";
_name = "radiocode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
