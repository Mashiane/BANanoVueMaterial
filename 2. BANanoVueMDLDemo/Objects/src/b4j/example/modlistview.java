package b4j.example;


import anywheresoftware.b4a.BA;

public class modlistview extends Object{
public static modlistview mostCurrent = new modlistview();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modlistview", null);
		ba.loadHtSubs(modlistview.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modlistview", ba);
		}
	}
    public static Class<?> getObject() {
		return modlistview.class;
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
b4j.example.vmlistview _lv = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modListView.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modListView.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modlistview.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim lv As VMListView = vm.CreateListView(\"lv1\", M";
_lv = _vm._createlistview /*b4j.example.vmlistview*/ ("lv1",modlistview.getObject());
 //BA.debugLineNum = 19;BA.debugLine="lv.SetElevation(2)";
_lv._setelevation /*b4j.example.vmlistview*/ ((int) (2));
 //BA.debugLineNum = 20;BA.debugLine="lv.AddItem(\"inbox\",\"move_to_inbox\",\"Inbox\",\"6\")";
_lv._additem /*String*/ ("inbox","move_to_inbox","Inbox",(Object)("6"));
 //BA.debugLineNum = 21;BA.debugLine="lv.AddItem(\"send\",\"send\",\"Sent Email\",Null)";
_lv._additem /*String*/ ("send","send","Sent Email",anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 22;BA.debugLine="lv.AddItem(\"trash\",\"delete\",\"Trash\",\"20\")";
_lv._additem /*String*/ ("trash","delete","Trash",(Object)("20"));
 //BA.debugLineNum = 23;BA.debugLine="lv.AddItem(\"spam\",\"error\",\"Spam\",\"1\")";
_lv._additem /*String*/ ("spam","error","Spam",(Object)("1"));
 //BA.debugLineNum = 25;BA.debugLine="lv.AddToContainer(cont, 1,1)";
_lv._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public static String  _inbox_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub inbox_click(e As BANanoEvent)";
 //BA.debugLineNum = 31;BA.debugLine="vm.ShowSnackBar(\"Inbox...\")";
_vm._showsnackbar /*String*/ ("Inbox...");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"listviewcode\"";
_name = "listviewcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _send_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub send_click(e As BANanoEvent)";
 //BA.debugLineNum = 35;BA.debugLine="vm.ShowSnackBar(\"Sent...\")";
_vm._showsnackbar /*String*/ ("Sent...");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _spam_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub spam_click(e As BANanoEvent)";
 //BA.debugLineNum = 43;BA.debugLine="vm.ShowSnackBar(\"Spam...\")";
_vm._showsnackbar /*String*/ ("Spam...");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _trash_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub trash_click(e As BANanoEvent)";
 //BA.debugLineNum = 39;BA.debugLine="vm.ShowSnackBar(\"Trash...\")";
_vm._showsnackbar /*String*/ ("Trash...");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
}
