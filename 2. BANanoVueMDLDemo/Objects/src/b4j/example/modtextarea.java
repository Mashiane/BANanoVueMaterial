package b4j.example;


import anywheresoftware.b4a.BA;

public class modtextarea extends Object{
public static modtextarea mostCurrent = new modtextarea();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtextarea", null);
		ba.loadHtSubs(modtextarea.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtextarea", ba);
		}
	}
    public static Class<?> getObject() {
		return modtextarea.class;
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
public static b4j.example.modtextbox _modtextbox = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modTextArea.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modTextArea.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtextarea.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateTextArea(\"txta\",Me).SetLabel(\"Text Area\"";
_vm._createtextarea /*b4j.example.vmtextarea*/ ("txta",modtextarea.getObject())._setlabel /*b4j.example.vmtextarea*/ ("Text Area")._setvmodel /*b4j.example.vmtextarea*/ ("txtarea")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateTextArea(\"txtb\",Me).SetLabel(\"Text Area";
_vm._createtextarea /*b4j.example.vmtextarea*/ ("txtb",modtextarea.getObject())._setlabel /*b4j.example.vmtextarea*/ ("Text Area with AutoGrow")._setvmodel /*b4j.example.vmtextarea*/ ("txtareb")._setautogrow /*b4j.example.vmtextarea*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateTextArea(\"txtc\",Me).SetLabel(\"Required\")";
_vm._createtextarea /*b4j.example.vmtextarea*/ ("txtc",modtextarea.getObject())._setlabel /*b4j.example.vmtextarea*/ ("Required")._setvmodel /*b4j.example.vmtextarea*/ ("txtarec")._seterrortext /*b4j.example.vmtextarea*/ ("There is an error")._setrequired /*b4j.example.vmtextarea*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateTextArea(\"txt8\",Me).SetLabel(\"Counter\").";
_vm._createtextarea /*b4j.example.vmtextarea*/ ("txt8",modtextarea.getObject())._setlabel /*b4j.example.vmtextarea*/ ("Counter")._setvmodel /*b4j.example.vmtextarea*/ ("txt8count")._setcounter /*b4j.example.vmtextarea*/ (BA.NumberToString(30))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateTextArea(\"txt9\",Me).SetLabel(\"Max Length";
_vm._createtextarea /*b4j.example.vmtextarea*/ ("txt9",modtextarea.getObject())._setlabel /*b4j.example.vmtextarea*/ ("Max Length")._setvmodel /*b4j.example.vmtextarea*/ ("txt9len")._setmaxlength /*b4j.example.vmtextarea*/ (BA.NumberToString(10))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateTextArea(\"txt10x\",Me).SetLabel(\"Max Leng";
_vm._createtextarea /*b4j.example.vmtextarea*/ ("txt10x",modtextarea.getObject())._setlabel /*b4j.example.vmtextarea*/ ("Max Length & Disabled Counter")._setvmodel /*b4j.example.vmtextarea*/ ("txtlendg")._setmaxlength /*b4j.example.vmtextarea*/ (BA.NumberToString(15))._setcounterdisabled /*b4j.example.vmtextarea*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateTextArea(\"txtai\",Me).SetLabel(\"Descripti";
_vm._createtextarea /*b4j.example.vmtextarea*/ ("txtai",modtextarea.getObject())._setlabel /*b4j.example.vmtextarea*/ ("Description")._setvmodel /*b4j.example.vmtextarea*/ ("txtai")._seticon /*b4j.example.vmtextarea*/ ("description")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 26;BA.debugLine="vm.ShowError(\"txtc\")";
_vm._showerror /*String*/ ("txtc");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"textareacode\"";
_name = "textareacode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
