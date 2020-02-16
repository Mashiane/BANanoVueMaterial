package b4j.example;


import anywheresoftware.b4a.BA;

public class modspeeddial extends Object{
public static modspeeddial mostCurrent = new modspeeddial();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modspeeddial", null);
		ba.loadHtSubs(modspeeddial.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modspeeddial", ba);
		}
	}
    public static Class<?> getObject() {
		return modspeeddial.class;
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
public static String  _btndirection_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub btndirection_click(e As BANanoEvent)";
 //BA.debugLineNum = 43;BA.debugLine="vm.ShowSnackBar(\"Show Directions\")";
_vm._showsnackbar /*String*/ ("Show Directions");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _btnstreetview_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub btnstreetview_click(e As BANanoEvent)";
 //BA.debugLineNum = 47;BA.debugLine="vm.showsnackbar(\"Street View\")";
_vm._showsnackbar /*String*/ ("Street View");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmspeeddial _sp1 = null;
b4j.example.vmspeeddial _sp2 = null;
b4j.example.vmspeeddial _sp3 = null;
b4j.example.vmspeeddial _sp4 = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modSpeedDial.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modSpeedDial.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modspeeddial.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns4x3";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns4x3 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim sp1 As VMSpeedDial = vm.CreateSpeedDial(\"sp1\"";
_sp1 = _vm._createspeeddial /*b4j.example.vmspeeddial*/ ("sp1",modspeeddial.getObject())._seteffectfling /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True)._setprimary /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True)._seticon /*b4j.example.vmspeeddial*/ ("my_location");
 //BA.debugLineNum = 19;BA.debugLine="sp1.AddButton(\"btnDirection\", \"directions\")";
_sp1._addbutton /*b4j.example.vmspeeddial*/ ("btnDirection","directions");
 //BA.debugLineNum = 20;BA.debugLine="sp1.AddButton(\"btnStreetView\", \"streetview\")";
_sp1._addbutton /*b4j.example.vmspeeddial*/ ("btnStreetView","streetview");
 //BA.debugLineNum = 21;BA.debugLine="sp1.AddToContainer(cont, 1, 1)";
_sp1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="Dim sp2 As VMSpeedDial = vm.CreateSpeedDial(\"sp2\"";
_sp2 = _vm._createspeeddial /*b4j.example.vmspeeddial*/ ("sp2",modspeeddial.getObject())._seteventclick /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True)._seteffectopacity /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True)._setaccent /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True)._seticon /*b4j.example.vmspeeddial*/ ("add");
 //BA.debugLineNum = 25;BA.debugLine="sp2.AddButton(\"btnNote\", \"note\")";
_sp2._addbutton /*b4j.example.vmspeeddial*/ ("btnNote","note");
 //BA.debugLineNum = 26;BA.debugLine="sp2.AddButton(\"btnEvent\", \"event\")";
_sp2._addbutton /*b4j.example.vmspeeddial*/ ("btnEvent","event");
 //BA.debugLineNum = 27;BA.debugLine="sp2.AddToContainer(cont, 1, 2)";
_sp2._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 29;BA.debugLine="Dim sp3 As VMSpeedDial = vm.CreateSpeedDial(\"sp3\"";
_sp3 = _vm._createspeeddial /*b4j.example.vmspeeddial*/ ("sp3",modspeeddial.getObject())._setprimary /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True)._setinitialicon /*b4j.example.vmspeeddial*/ ("add")._setfinalicon /*b4j.example.vmspeeddial*/ ("edit");
 //BA.debugLineNum = 30;BA.debugLine="sp3.AddButton(\"btnDirection\", \"directions\")";
_sp3._addbutton /*b4j.example.vmspeeddial*/ ("btnDirection","directions");
 //BA.debugLineNum = 31;BA.debugLine="sp3.AddButton(\"btnStreetView\", \"streetview\")";
_sp3._addbutton /*b4j.example.vmspeeddial*/ ("btnStreetView","streetview");
 //BA.debugLineNum = 32;BA.debugLine="sp3.AddToContainer(cont, 1, 3)";
_sp3._addtocontainer /*String*/ (_cont,(int) (1),(int) (3));
 //BA.debugLineNum = 34;BA.debugLine="Dim sp4 As VMSpeedDial = vm.CreateSpeedDial(\"sp4\"";
_sp4 = _vm._createspeeddial /*b4j.example.vmspeeddial*/ ("sp4",modspeeddial.getObject())._seteventclick /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True)._setaccent /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True)._setinitialicon /*b4j.example.vmspeeddial*/ ("add")._setfinalicon /*b4j.example.vmspeeddial*/ ("close");
 //BA.debugLineNum = 35;BA.debugLine="sp4.AddButton(\"btnNote\", \"note\")";
_sp4._addbutton /*b4j.example.vmspeeddial*/ ("btnNote","note");
 //BA.debugLineNum = 36;BA.debugLine="sp4.AddButton(\"btnEvent\", \"event\")";
_sp4._addbutton /*b4j.example.vmspeeddial*/ ("btnEvent","event");
 //BA.debugLineNum = 37;BA.debugLine="sp4.AddToContainer(cont, 1, 4)";
_sp4._addtocontainer /*String*/ (_cont,(int) (1),(int) (4));
 //BA.debugLineNum = 39;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"speedcode\"";
_name = "speedcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
