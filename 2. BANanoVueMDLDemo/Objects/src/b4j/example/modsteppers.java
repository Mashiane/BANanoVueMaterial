package b4j.example;


import anywheresoftware.b4a.BA;

public class modsteppers extends Object{
public static modsteppers mostCurrent = new modsteppers();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modsteppers", null);
		ba.loadHtSubs(modsteppers.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modsteppers", ba);
		}
	}
    public static Class<?> getObject() {
		return modsteppers.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static b4j.example.vmsteppers _step4 = null;
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
b4j.example.vmsteppers _step1 = null;
b4j.example.vmsteppers _step2 = null;
b4j.example.vmsteppers _step3 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 10;BA.debugLine="Log(\"modSkeleton.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modSkeleton.Code");
 //BA.debugLineNum = 11;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 13;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modsteppers.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.addrows(4).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (4))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 19;BA.debugLine="Dim step1 As VMSteppers = vm.CreateSteppers(\"step";
_step1 = _vm._createsteppers /*b4j.example.vmsteppers*/ ("step1",modsteppers.getObject())._setelevation /*b4j.example.vmsteppers*/ ((int) (2))._setmargin /*b4j.example.vmsteppers*/ ((Object)("10px"));
 //BA.debugLineNum = 20;BA.debugLine="step1.AddStep(\"first\",\"First Step\",\"\",True,Null)";
_step1._addstep /*String*/ ("first","First Step","",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 21;BA.debugLine="step1.AddStep(\"second\",\"Second Step\",\"\",True,Null";
_step1._addstep /*String*/ ("second","Second Step","",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 22;BA.debugLine="step1.AddStep(\"third\",\"Third Step\",\"\",True,Null)";
_step1._addstep /*String*/ ("third","Third Step","",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 23;BA.debugLine="step1.AddToContainer(cont, 1, 1)";
_step1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="Dim step2 As VMSteppers = vm.CreateSteppers(\"step";
_step2 = _vm._createsteppers /*b4j.example.vmsteppers*/ ("step2",modsteppers.getObject())._setalternative /*b4j.example.vmsteppers*/ (anywheresoftware.b4a.keywords.Common.True)._setelevation /*b4j.example.vmsteppers*/ ((int) (2))._setmargin /*b4j.example.vmsteppers*/ ((Object)("10px"));
 //BA.debugLineNum = 26;BA.debugLine="step2.AddStep(\"first2\",\"First Step\",\"\",True,Null)";
_step2._addstep /*String*/ ("first2","First Step","",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 27;BA.debugLine="step2.AddStep(\"second2\",\"Second Step\",\"\",True,Nul";
_step2._addstep /*String*/ ("second2","Second Step","",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 28;BA.debugLine="step2.AddStep(\"third2\",\"Third Step\",\"\",True,Null)";
_step2._addstep /*String*/ ("third2","Third Step","",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 29;BA.debugLine="step2.AddToContainer(cont, 2, 1)";
_step2._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="Dim step3 As VMSteppers = vm.CreateSteppers(\"step";
_step3 = _vm._createsteppers /*b4j.example.vmsteppers*/ ("step3",modsteppers.getObject())._setvertical /*b4j.example.vmsteppers*/ (anywheresoftware.b4a.keywords.Common.True)._setelevation /*b4j.example.vmsteppers*/ ((int) (2))._setmargin /*b4j.example.vmsteppers*/ ((Object)("10px"));
 //BA.debugLineNum = 32;BA.debugLine="step3.AddStep(\"first3\",\"First Step\",\"Optional\",Tr";
_step3._addstep /*String*/ ("first3","First Step","Optional",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 33;BA.debugLine="step3.AddStep(\"second3\",\"Second Step\",\"\",True,Nul";
_step3._addstep /*String*/ ("second3","Second Step","",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 34;BA.debugLine="step3.AddStep(\"third3\",\"Third Step\",\"\",True,Null)";
_step3._addstep /*String*/ ("third3","Third Step","",anywheresoftware.b4a.keywords.Common.True,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 35;BA.debugLine="step3.AddToContainer(cont, 3, 1)";
_step3._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 37;BA.debugLine="step4 = vm.CreateSteppers(\"step4\", Me).SetStepAct";
_step4 = _vm._createsteppers /*b4j.example.vmsteppers*/ ("step4",modsteppers.getObject())._setstepactive /*b4j.example.vmsteppers*/ ("first4")._setlinear /*b4j.example.vmsteppers*/ (anywheresoftware.b4a.keywords.Common.True)._setelevation /*b4j.example.vmsteppers*/ ((int) (2))._setmargin /*b4j.example.vmsteppers*/ ((Object)("10px"));
 //BA.debugLineNum = 38;BA.debugLine="step4.AddStep(\"first4\",\"First Step\",\"Optional\",Tr";
_step4._addstep /*String*/ ("first4","First Step","Optional",anywheresoftware.b4a.keywords.Common.True,_firststep()._tostring /*String*/ ());
 //BA.debugLineNum = 39;BA.debugLine="step4.AddStep(\"second4\",\"Second Step\",\"\",True,Sec";
_step4._addstep /*String*/ ("second4","Second Step","",anywheresoftware.b4a.keywords.Common.True,_secondstep()._tostring /*String*/ ());
 //BA.debugLineNum = 40;BA.debugLine="step4.AddStep(\"third4\",\"Third Step\",\"\",True,Third";
_step4._addstep /*String*/ ("third4","Third Step","",anywheresoftware.b4a.keywords.Common.True,_thirdstep()._tostring /*String*/ ());
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
_el = _vm._createcontainer /*b4j.example.vmcontainer*/ ("firststep",modsteppers.getObject());
 //BA.debugLineNum = 50;BA.debugLine="el.AddRows(1).AddColumns12";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 51;BA.debugLine="el.AddRows(1).AddColumns2x6";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns2x6 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 52;BA.debugLine="vm.CreateLABEL(\"fs1label\").SetParagraph.SetText(\"";
_vm._createlabel /*b4j.example.vmlabel*/ ("fs1label")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("This is step 1")._addtocontainer /*String*/ (_el,(int) (1),(int) (1));
 //BA.debugLineNum = 53;BA.debugLine="vm.CreateButton(\"tostep2\", Me).SetText(\"Next\").Se";
_vm._createbutton /*b4j.example.vmbutton*/ ("tostep2",modsteppers.getObject())._settext /*b4j.example.vmbutton*/ ("Next")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_el,(int) (2),(int) (1));
 //BA.debugLineNum = 54;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"steppercode\"";
_name = "steppercode";
 //BA.debugLineNum = 5;BA.debugLine="Dim step4 As VMSteppers";
_step4 = new b4j.example.vmsteppers();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static b4j.example.vmcontainer  _secondstep() throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 58;BA.debugLine="Sub SecondStep As VMContainer";
 //BA.debugLineNum = 59;BA.debugLine="Dim el As VMContainer = vm.CreateContainer(\"first";
_el = _vm._createcontainer /*b4j.example.vmcontainer*/ ("firststep",modsteppers.getObject());
 //BA.debugLineNum = 62;BA.debugLine="el.AddRows(1).AddColumns12";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 63;BA.debugLine="el.AddRows(1).AddColumns2x6";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns2x6 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 64;BA.debugLine="vm.CreateLABEL(\"fs1label\").SetParagraph.SetText(\"";
_vm._createlabel /*b4j.example.vmlabel*/ ("fs1label")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("This is step 2")._addtocontainer /*String*/ (_el,(int) (1),(int) (1));
 //BA.debugLineNum = 65;BA.debugLine="vm.CreateButton(\"tostep1\", Me).SetText(\"Back\").Se";
_vm._createbutton /*b4j.example.vmbutton*/ ("tostep1",modsteppers.getObject())._settext /*b4j.example.vmbutton*/ ("Back")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_el,(int) (2),(int) (1));
 //BA.debugLineNum = 66;BA.debugLine="vm.CreateButton(\"tostep3\", Me).SetText(\"Next\").Se";
_vm._createbutton /*b4j.example.vmbutton*/ ("tostep3",modsteppers.getObject())._settext /*b4j.example.vmbutton*/ ("Next")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_el,(int) (2),(int) (1));
 //BA.debugLineNum = 67;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public static b4j.example.vmcontainer  _thirdstep() throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 85;BA.debugLine="Sub ThirdStep As VMContainer";
 //BA.debugLineNum = 86;BA.debugLine="Dim el As VMContainer = vm.CreateContainer(\"first";
_el = _vm._createcontainer /*b4j.example.vmcontainer*/ ("firststep",modsteppers.getObject());
 //BA.debugLineNum = 89;BA.debugLine="el.AddRows(1).AddColumns12";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 90;BA.debugLine="el.AddRows(1).AddColumns2x6";
_el._addrows /*b4j.example.vmgrid*/ ((int) (1))._addcolumns2x6 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 91;BA.debugLine="vm.CreateLABEL(\"fs1label\").SetParagraph.SetText(\"";
_vm._createlabel /*b4j.example.vmlabel*/ ("fs1label")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("This is step 3")._addtocontainer /*String*/ (_el,(int) (1),(int) (1));
 //BA.debugLineNum = 92;BA.debugLine="vm.CreateButton(\"tostep2\", Me).SetText(\"Back\").Se";
_vm._createbutton /*b4j.example.vmbutton*/ ("tostep2",modsteppers.getObject())._settext /*b4j.example.vmbutton*/ ("Back")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_el,(int) (2),(int) (1));
 //BA.debugLineNum = 93;BA.debugLine="vm.CreateButton(\"done\", Me).SetText(\"Done\").SetRa";
_vm._createbutton /*b4j.example.vmbutton*/ ("done",modsteppers.getObject())._settext /*b4j.example.vmbutton*/ ("Done")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_el,(int) (2),(int) (1));
 //BA.debugLineNum = 94;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public static String  _tostep1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub tostep1_click(e As BANanoEvent)";
 //BA.debugLineNum = 71;BA.debugLine="step4.SetStepActive(\"first4\")";
_step4._setstepactive /*b4j.example.vmsteppers*/ ("first4");
 //BA.debugLineNum = 72;BA.debugLine="step4.SetStepDone(\"second4\",False)";
_step4._setstepdone /*b4j.example.vmsteppers*/ ("second4",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _tostep2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub tostep2_click(e As BANanoEvent)";
 //BA.debugLineNum = 76;BA.debugLine="step4.SetStepActive(\"second4\")";
_step4._setstepactive /*b4j.example.vmsteppers*/ ("second4");
 //BA.debugLineNum = 77;BA.debugLine="step4.SetStepDone(\"first4\",True)";
_step4._setstepdone /*b4j.example.vmsteppers*/ ("first4",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _tostep3_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub tostep3_click(e As BANanoEvent)";
 //BA.debugLineNum = 81;BA.debugLine="step4.SetStepActive(\"third4\")";
_step4._setstepactive /*b4j.example.vmsteppers*/ ("third4");
 //BA.debugLineNum = 82;BA.debugLine="step4.SetStepDone(\"second4\",True)";
_step4._setstepdone /*b4j.example.vmsteppers*/ ("second4",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
}
