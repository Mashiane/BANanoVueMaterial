package b4j.example;


import anywheresoftware.b4a.BA;

public class modfile extends Object{
public static modfile mostCurrent = new modfile();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modfile", null);
		ba.loadHtSubs(modfile.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modfile", ba);
		}
	}
    public static Class<?> getObject() {
		return modfile.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static com.ab.banano.BANano _banano = null;
public static String _ajaxresult = "";
public static b4j.example.main _main = null;
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
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 11;BA.debugLine="Log(\"modFile.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modFile.Code");
 //BA.debugLineNum = 12;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modfile.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateFile(\"file0\",Me).SetVModel(\"single\").Set";
_vm._createfile /*b4j.example.vmfile*/ ("file0",modfile.getObject())._setvmodel /*b4j.example.vmfile*/ ("single")._setlabel /*b4j.example.vmfile*/ ((Object)("Single"))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateFile(\"file1\",Me).SetVModel(\"placeholder\"";
_vm._createfile /*b4j.example.vmfile*/ ("file1",modfile.getObject())._setvmodel /*b4j.example.vmfile*/ ("placeholder")._setlabel /*b4j.example.vmfile*/ ((Object)("Placeholder"))._setplaceholder /*b4j.example.vmfile*/ ((Object)("A nice input placeholder"))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateFile(\"file2\",Me).SetVModel(\"disabledx\").";
_vm._createfile /*b4j.example.vmfile*/ ("file2",modfile.getObject())._setvmodel /*b4j.example.vmfile*/ ("disabledx")._setdisabled /*b4j.example.vmfile*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateFile(\"file3\",Me).SetVModel(\"initial\").Se";
_vm._createfile /*b4j.example.vmfile*/ ("file3",modfile.getObject())._setvmodel /*b4j.example.vmfile*/ ("initial")._setlabel /*b4j.example.vmfile*/ ((Object)("Initial Value"))._setvalue /*b4j.example.vmfile*/ ("./assets/sponge.png")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateFile(\"file4\",Me).SetVModel(\"multiple\").S";
_vm._createfile /*b4j.example.vmfile*/ ("file4",modfile.getObject())._setvmodel /*b4j.example.vmfile*/ ("multiple")._setlabel /*b4j.example.vmfile*/ ((Object)("Multiple Files"))._setmultiple /*b4j.example.vmfile*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _file0_change(anywheresoftware.b4a.objects.collections.List _flist) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub file0_change(fList As List)";
 //BA.debugLineNum = 34;BA.debugLine="UploadFiles(fList)";
_uploadfiles(_flist);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _file1_change(anywheresoftware.b4a.objects.collections.List _flist) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub file1_change(fList As List)";
 //BA.debugLineNum = 39;BA.debugLine="Log(fList)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_flist));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public static String  _file2_change(anywheresoftware.b4a.objects.collections.List _flist) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub file2_change(fList As List)";
 //BA.debugLineNum = 44;BA.debugLine="Log(fList)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_flist));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _file3_change(anywheresoftware.b4a.objects.collections.List _flist) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub file3_change(fList As List)";
 //BA.debugLineNum = 49;BA.debugLine="Log(fList)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_flist));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public static String  _file4_change(anywheresoftware.b4a.objects.collections.List _flist) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub file4_change(fList As List)";
 //BA.debugLineNum = 54;BA.debugLine="Log(fList)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_flist));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _filedone(anywheresoftware.b4a.objects.collections.Map _fileobj,String _json) throws Exception{
anywheresoftware.b4a.objects.collections.Map _resp = null;
String _status = "";
b4j.example.bananovue._fileobject _fd = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub FileDone(fileObj As Map, json As String)";
 //BA.debugLineNum = 64;BA.debugLine="Dim resp As Map = BANano.FromJson(json)";
_resp = new anywheresoftware.b4a.objects.collections.Map();
_resp.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_json))));
 //BA.debugLineNum = 65;BA.debugLine="Dim status As String = resp.Get(\"status\")";
_status = BA.ObjectToString(_resp.Get((Object)("status")));
 //BA.debugLineNum = 66;BA.debugLine="Select Case status";
switch (BA.switchObjectToInt(_status,"success")) {
case 0: {
 //BA.debugLineNum = 68;BA.debugLine="Dim fd As FileObject = vm.GetFileDetails(fileObj";
_fd = _vm._getfiledetails /*b4j.example.bananovue._fileobject*/ (_fileobj);
 //BA.debugLineNum = 69;BA.debugLine="Log(fd)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_fd));
 break; }
default: {
 //BA.debugLineNum = 71;BA.debugLine="vm.ShowSnackBar(\"File could not be uploaded!\")";
_vm._showsnackbar /*String*/ ("File could not be uploaded!");
 break; }
}
;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"filecode\"";
_name = "filecode";
 //BA.debugLineNum = 5;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="Private ajaxResult As String";
_ajaxresult = "";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _uploadfiles(anywheresoftware.b4a.objects.collections.List _flist) throws Exception{
Object _fileobj = null;
 //BA.debugLineNum = 57;BA.debugLine="Sub UploadFiles(fList As List)";
 //BA.debugLineNum = 58;BA.debugLine="For Each fileObj As Object In fList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_fileobj = group1.Get(index1);
 //BA.debugLineNum = 59;BA.debugLine="vm.HTTPUpload(fileObj, Me, \"filedone\")";
_vm._httpupload /*String*/ (_fileobj,modfile.getObject(),"filedone");
 }
};
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
}
