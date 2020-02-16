package b4j.example;


import anywheresoftware.b4a.BA;

public class modtypography extends Object{
public static modtypography mostCurrent = new modtypography();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtypography", null);
		ba.loadHtSubs(modtypography.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtypography", ba);
		}
	}
    public static Class<?> getObject() {
		return modtypography.class;
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
public static b4j.example.modtextbox _modtextbox = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modTypography.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modTypography.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtypography.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(1).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 17;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetDisplay4(True)";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setdisplay4 /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Display 4")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetDisplay3(True)";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setdisplay3 /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Display 3")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetDisplay2(True)";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setdisplay2 /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Display 2")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetDisplay1(True)";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setdisplay1 /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Display 1")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetHeadline(True)";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setheadline /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Headline")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetTitle(True).Se";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._settitle /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Title")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetSubHeading(Tru";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setsubheading /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Sub-Heading")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetBody2(True).Se";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setbody2 /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Body 2")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetBody1(True).Se";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setbody1 /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Body 1")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateLABEL(\"\").SetParagraph.SetCaption(True).";
_vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ()._setcaption /*b4j.example.vmlabel*/ (anywheresoftware.b4a.keywords.Common.True)._settext /*b4j.example.vmlabel*/ ("Caption")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"typographycode\"";
_name = "typographycode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
