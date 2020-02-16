package b4j.example;


import anywheresoftware.b4a.BA;

public class modtabs extends Object{
public static modtabs mostCurrent = new modtabs();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtabs", null);
		ba.loadHtSubs(modtabs.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtabs", ba);
		}
	}
    public static Class<?> getObject() {
		return modtabs.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static b4j.example.vmtabs _step4 = null;
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
public static b4j.example.modtextarea _modtextarea = null;
public static b4j.example.modtextbox _modtextbox = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmtabs _step1 = null;
b4j.example.vmtabs _step2 = null;
b4j.example.vmtabs _step3 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 10;BA.debugLine="Log(\"mdTabs.Code\")";
anywheresoftware.b4a.keywords.Common.Log("mdTabs.Code");
 //BA.debugLineNum = 11;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 13;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtabs.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.addrows(4).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (4))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 19;BA.debugLine="Dim step1 As VMTabs = vm.CreateTabs(\"tab1\", Me).S";
_step1 = _vm._createtabs /*b4j.example.vmtabs*/ ("tab1",modtabs.getObject())._setelevation /*b4j.example.vmtabs*/ ((int) (2))._setmargin /*b4j.example.vmtabs*/ ((Object)("10px"));
 //BA.debugLineNum = 20;BA.debugLine="step1.AddTab(\"first\",\"First Step\",\"home\",FirstSte";
_step1._addtab /*String*/ ("first","First Step","home",_firststep()._tostring /*String*/ ());
 //BA.debugLineNum = 21;BA.debugLine="step1.AddTab(\"second\",\"Second Step\",\"pages\",Secon";
_step1._addtab /*String*/ ("second","Second Step","pages",_secondstep()._tostring /*String*/ ());
 //BA.debugLineNum = 22;BA.debugLine="step1.AddTab(\"third\",\"Third Step\",\"favorite\",Thir";
_step1._addtab /*String*/ ("third","Third Step","favorite",_thirdstep()._tostring /*String*/ ());
 //BA.debugLineNum = 23;BA.debugLine="step1.AddToContainer(cont, 1, 1)";
_step1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="Dim step2 As VMTabs = vm.CreateTabs(\"tab2\", Me).S";
_step2 = _vm._createtabs /*b4j.example.vmtabs*/ ("tab2",modtabs.getObject())._setelevation /*b4j.example.vmtabs*/ ((int) (2))._setmargin /*b4j.example.vmtabs*/ ((Object)("10px"))._setalignmentcenter /*b4j.example.vmtabs*/ (anywheresoftware.b4a.keywords.Common.True)._setswipeable /*b4j.example.vmtabs*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 26;BA.debugLine="step2.AddTab(\"first2\",\"First Step\",\"\",Null)";
_step2._addtab /*String*/ ("first2","First Step","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 27;BA.debugLine="step2.AddTab(\"second2\",\"Second Step\",\"\",Null)";
_step2._addtab /*String*/ ("second2","Second Step","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 28;BA.debugLine="step2.AddTab(\"third2\",\"Third Step\",\"\",Null)";
_step2._addtab /*String*/ ("third2","Third Step","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 29;BA.debugLine="step2.AddToContainer(cont, 2, 1)";
_step2._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="Dim step3 As VMTabs = vm.CreateTabs(\"tab3\", Me).S";
_step3 = _vm._createtabs /*b4j.example.vmtabs*/ ("tab3",modtabs.getObject())._setelevation /*b4j.example.vmtabs*/ ((int) (2))._setmargin /*b4j.example.vmtabs*/ ((Object)("10px"))._setalignmentright /*b4j.example.vmtabs*/ (anywheresoftware.b4a.keywords.Common.True)._settabactive /*b4j.example.vmtabs*/ ("second3");
 //BA.debugLineNum = 32;BA.debugLine="step3.AddTab(\"first3\",\"First Step\",\"Optional\",Nul";
_step3._addtab /*String*/ ("first3","First Step","Optional",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 33;BA.debugLine="step3.AddTab(\"second3\",\"Second Step\",\"\",Null)";
_step3._addtab /*String*/ ("second3","Second Step","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 34;BA.debugLine="step3.AddTab(\"third3\",\"Third Step\",\"\",Null)";
_step3._addtab /*String*/ ("third3","Third Step","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 35;BA.debugLine="step3.AddToContainer(cont, 3, 1)";
_step3._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 37;BA.debugLine="step4 = vm.CreateTabs(\"step4\", Me).SetTabActive(\"";
_step4 = _vm._createtabs /*b4j.example.vmtabs*/ ("step4",modtabs.getObject())._settabactive /*b4j.example.vmtabs*/ ("first4")._setelevation /*b4j.example.vmtabs*/ ((int) (2))._setmargin /*b4j.example.vmtabs*/ ((Object)("10px"))._setalignmentfixed /*b4j.example.vmtabs*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 38;BA.debugLine="step4.AddTab(\"first4\",\"First Step\",\"\",FirstStep.t";
_step4._addtab /*String*/ ("first4","First Step","",_firststep()._tostring /*String*/ ());
 //BA.debugLineNum = 39;BA.debugLine="step4.AddTab(\"second4\",\"Second Step\",\"\",SecondSte";
_step4._addtab /*String*/ ("second4","Second Step","",_secondstep()._tostring /*String*/ ());
 //BA.debugLineNum = 40;BA.debugLine="step4.AddTab(\"third4\",\"Third Step\",\"\",ThirdStep.t";
_step4._addtab /*String*/ ("third4","Third Step","",_thirdstep()._tostring /*String*/ ());
 //BA.debugLineNum = 41;BA.debugLine="step4.AddToContainer(cont,4, 1)";
_step4._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 43;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static b4j.example.vmcontainer  _firststep() throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 47;BA.debugLine="Sub FirstStep As VMContainer";
 //BA.debugLineNum = 48;BA.debugLine="Dim el As VMContainer = vm.CreateContainer(\"first";
_el = _vm._createcontainer /*b4j.example.vmcontainer*/ ("firststep",modtabs.getObject());
 //BA.debugLineNum = 50;BA.debugLine="el.AddRows(1).AddColumns12";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 52;BA.debugLine="vm.CreateLABEL(\"fs1label\").SetParagraph.SetText(\"";
_vm._createlabel /*b4j.example.vmlabel*/ ("fs1label")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("This is tab 1")._addtocontainer /*String*/ (_el,(int) (1),(int) (1));
 //BA.debugLineNum = 53;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"tabscode\"";
_name = "tabscode";
 //BA.debugLineNum = 5;BA.debugLine="Dim step4 As VMTabs";
_step4 = new b4j.example.vmtabs();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static b4j.example.vmcontainer  _secondstep() throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 57;BA.debugLine="Sub SecondStep As VMContainer";
 //BA.debugLineNum = 58;BA.debugLine="Dim el As VMContainer = vm.CreateContainer(\"first";
_el = _vm._createcontainer /*b4j.example.vmcontainer*/ ("firststep",modtabs.getObject());
 //BA.debugLineNum = 61;BA.debugLine="el.AddRows(1).AddColumns12";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 63;BA.debugLine="vm.CreateLABEL(\"fs1label\").SetParagraph.SetText(\"";
_vm._createlabel /*b4j.example.vmlabel*/ ("fs1label")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("This is tab 2")._addtocontainer /*String*/ (_el,(int) (1),(int) (1));
 //BA.debugLineNum = 64;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public static b4j.example.vmcontainer  _thirdstep() throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 67;BA.debugLine="Sub ThirdStep As VMContainer";
 //BA.debugLineNum = 68;BA.debugLine="Dim el As VMContainer = vm.CreateContainer(\"first";
_el = _vm._createcontainer /*b4j.example.vmcontainer*/ ("firststep",modtabs.getObject());
 //BA.debugLineNum = 71;BA.debugLine="el.AddRows(1).AddColumns12";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 73;BA.debugLine="vm.CreateLABEL(\"fs1label\").SetParagraph.SetText(\"";
_vm._createlabel /*b4j.example.vmlabel*/ ("fs1label")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("This is tab 3")._addtocontainer /*String*/ (_el,(int) (1),(int) (1));
 //BA.debugLineNum = 74;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
}
