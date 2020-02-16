package b4j.example;


import anywheresoftware.b4a.BA;

public class modgmap extends Object{
public static modgmap mostCurrent = new modgmap();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modgmap", null);
		ba.loadHtSubs(modgmap.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modgmap", ba);
		}
	}
    public static Class<?> getObject() {
		return modgmap.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static com.ab.banano.BANano _banano = null;
public static b4j.example.vmgmap _buildmap = null;
public static b4j.example.vmcontainer _frm = null;
public static b4j.example.main _main = null;
public static b4j.example.modfile _modfile = null;
public static b4j.example.pgindex _pgindex = null;
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
public static String  _btnresetloc_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub btnResetLoc_click(e As BANanoEvent)";
 //BA.debugLineNum = 65;BA.debugLine="buildMap.clearmarkers";
_buildmap._clearmarkers /*b4j.example.vmgmap*/ ();
 //BA.debugLineNum = 66;BA.debugLine="buildMap.ShowInfoWindow(False)";
_buildmap._showinfowindow /*b4j.example.vmgmap*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 67;BA.debugLine="buildMap.setcenter(-28.4792625, 24.6727135)";
_buildmap._setcenter /*b4j.example.vmgmap*/ (-28.4792625,24.6727135);
 //BA.debugLineNum = 68;BA.debugLine="buildMap.SetZoom(8)";
_buildmap._setzoom /*b4j.example.vmgmap*/ ((int) (8));
 //BA.debugLineNum = 69;BA.debugLine="buildMap.refresh";
_buildmap._refresh /*String*/ ();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _btnshowloc_click(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.Map _req = null;
anywheresoftware.b4a.objects.collections.Map _record = null;
String _bvalid = "";
double _dlat = 0;
double _dlng = 0;
String _saddress1 = "";
String _saddress2 = "";
String _saddress3 = "";
String _sfulladdress = "";
 //BA.debugLineNum = 72;BA.debugLine="Sub btnShowLoc_click(e As BANanoEvent)";
 //BA.debugLineNum = 74;BA.debugLine="Dim req As Map = CreateMap()";
_req = new anywheresoftware.b4a.objects.collections.Map();
_req = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 75;BA.debugLine="req.Put(\"building_longitude\", \"building_longitude";
_req.Put((Object)("building_longitude"),(Object)("building_longitude"));
 //BA.debugLineNum = 76;BA.debugLine="req.Put(\"building_latitude\", \"building_latitude\")";
_req.Put((Object)("building_latitude"),(Object)("building_latitude"));
 //BA.debugLineNum = 78;BA.debugLine="Dim record As Map = frm.GetData";
_record = new anywheresoftware.b4a.objects.collections.Map();
_record = _frm._getdata /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 80;BA.debugLine="Dim bvalid As String = vm.validate(record, req)";
_bvalid = BA.ObjectToString(_vm._validate /*boolean*/ (_record,_req));
 //BA.debugLineNum = 81;BA.debugLine="If bvalid = False Then";
if ((_bvalid).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False))) { 
 //BA.debugLineNum = 82;BA.debugLine="vm.ShowSnackBar(\"The GPS Location needs to be sp";
_vm._showsnackbar /*String*/ ("The GPS Location needs to be specified!");
 //BA.debugLineNum = 83;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 86;BA.debugLine="Dim dlat As Double = vm.GetState(\"building_latitu";
_dlat = (double)(BA.ObjectToNumber(_vm._getstate /*Object*/ ("building_latitude",(Object)(0))));
 //BA.debugLineNum = 87;BA.debugLine="Dim dlng As Double = vm.getstate(\"building_longit";
_dlng = (double)(BA.ObjectToNumber(_vm._getstate /*Object*/ ("building_longitude",(Object)(0))));
 //BA.debugLineNum = 89;BA.debugLine="Dim saddress1 As String = vm.GetState(\"building_a";
_saddress1 = BA.ObjectToString(_vm._getstate /*Object*/ ("building_address1",(Object)("")));
 //BA.debugLineNum = 90;BA.debugLine="Dim saddress2 As String = vm.GetState(\"building_a";
_saddress2 = BA.ObjectToString(_vm._getstate /*Object*/ ("building_address2",(Object)("")));
 //BA.debugLineNum = 91;BA.debugLine="Dim saddress3 As String = vm.GetState(\"building_a";
_saddress3 = BA.ObjectToString(_vm._getstate /*Object*/ ("building_address3",(Object)("")));
 //BA.debugLineNum = 92;BA.debugLine="Dim sfulladdress As String =  vm.JoinNonBlanks(\",";
_sfulladdress = _vm._joinnonblanks /*String*/ (", ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_saddress1),(Object)(_saddress2),(Object)(_saddress3)}));
 //BA.debugLineNum = 94;BA.debugLine="buildMap.ClearMarkers";
_buildmap._clearmarkers /*b4j.example.vmgmap*/ ();
 //BA.debugLineNum = 95;BA.debugLine="buildMap.AddMarker(\"buildx\", dlat, dlng, \"\", $\"<s";
_buildmap._addmarker /*String*/ ("buildx",_dlat,_dlng,"",("<strong>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sfulladdress))+"</string>"));
 //BA.debugLineNum = 96;BA.debugLine="buildMap.SetCenter(dlat, dlng)";
_buildmap._setcenter /*b4j.example.vmgmap*/ (_dlat,_dlng);
 //BA.debugLineNum = 97;BA.debugLine="buildMap.SetZoom(8)";
_buildmap._setzoom /*b4j.example.vmgmap*/ ((int) (8));
 //BA.debugLineNum = 98;BA.debugLine="buildMap.ShowInfoWindow(True)";
_buildmap._showinfowindow /*b4j.example.vmgmap*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 99;BA.debugLine="buildMap.Refresh";
_buildmap._refresh /*String*/ ();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vminputcontrol _latitude = null;
b4j.example.vminputcontrol _longitude = null;
b4j.example.vmcontainer _mapgrid = null;
b4j.example.vmtoolbar _maptool = null;
 //BA.debugLineNum = 11;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 12;BA.debugLine="Log(\"modFile.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modFile.Code");
 //BA.debugLineNum = 13;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 15;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modgmap.getObject());
 //BA.debugLineNum = 17;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 22;BA.debugLine="frm = vm.CreateContainer(\"content\", Me)";
_frm = _vm._createcontainer /*b4j.example.vmcontainer*/ ("content",modgmap.getObject());
 //BA.debugLineNum = 23;BA.debugLine="Dim latitude As VMInputControl";
_latitude = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 24;BA.debugLine="latitude.Initialize(\"building_latitude\")";
_latitude._initialize /*b4j.example.vminputcontrol*/ (ba,"building_latitude");
 //BA.debugLineNum = 25;BA.debugLine="latitude.SetLabel(\"GPS Latitude\")";
_latitude._setlabel /*b4j.example.vminputcontrol*/ ("GPS Latitude");
 //BA.debugLineNum = 26;BA.debugLine="latitude.SetInvalidMessage(\"The latitude is requi";
_latitude._setinvalidmessage /*b4j.example.vminputcontrol*/ ("The latitude is required!");
 //BA.debugLineNum = 27;BA.debugLine="frm.AddControl(latitude,1,2,0,0,0,0,12,6,6,6)";
_frm._addcontrol /*String*/ (_latitude,BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 29;BA.debugLine="Dim longitude As VMInputControl";
_longitude = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 30;BA.debugLine="longitude.Initialize(\"building_longitude\")";
_longitude._initialize /*b4j.example.vminputcontrol*/ (ba,"building_longitude");
 //BA.debugLineNum = 31;BA.debugLine="longitude.SetLabel(\"GPS Longitude\")";
_longitude._setlabel /*b4j.example.vminputcontrol*/ ("GPS Longitude");
 //BA.debugLineNum = 32;BA.debugLine="longitude.SetInvalidMessage(\"The address is requi";
_longitude._setinvalidmessage /*b4j.example.vminputcontrol*/ ("The address is required!");
 //BA.debugLineNum = 33;BA.debugLine="frm.AddControl(longitude,1,1,0,0,0,0,12,6,6,6)";
_frm._addcontrol /*String*/ (_longitude,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 35;BA.debugLine="cont.AddComponent(1, 1 ,frm.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_frm._tostring /*String*/ ());
 //BA.debugLineNum = 38;BA.debugLine="Dim mapGrid As VMContainer = vm.CreateContainer(\"";
_mapgrid = _vm._createcontainer /*b4j.example.vmcontainer*/ ("mapGrid",modgmap.getObject());
 //BA.debugLineNum = 39;BA.debugLine="mapGrid.AddRows(2).AddColumns12";
_mapgrid._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 41;BA.debugLine="Dim mapTool As VMToolBar = vm.CreateToolbar(\"mapt";
_maptool = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("maptool",modgmap.getObject());
 //BA.debugLineNum = 42;BA.debugLine="mapTool.Settitle(\"Building Location on Map\")";
_maptool._settitle /*b4j.example.vmtoolbar*/ ("Building Location on Map");
 //BA.debugLineNum = 43;BA.debugLine="mapTool.SetPrimary(True)";
_maptool._setprimary /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 44;BA.debugLine="mapTool.AddButton(\"btnResetLoc\", \"\", \"Reset\", \"Re";
_maptool._addbutton /*b4j.example.vmtoolbar*/ ("btnResetLoc","","Reset","Reset the map location","");
 //BA.debugLineNum = 45;BA.debugLine="mapTool.AddButton(\"btnShowLoc\", \"\", \"Show\", \"Show";
_maptool._addbutton /*b4j.example.vmtoolbar*/ ("btnShowLoc","","Show","Show location of building using GPS","");
 //BA.debugLineNum = 46;BA.debugLine="mapGrid.AddComponent(1,1, mapTool.ToString)";
_mapgrid._addcomponent /*String*/ ((int) (1),(int) (1),_maptool._tostring /*String*/ ());
 //BA.debugLineNum = 48;BA.debugLine="buildMap = vm.CreateGMap(\"build1\", Me)";
_buildmap = _vm._creategmap /*b4j.example.vmgmap*/ ("build1",modgmap.getObject());
 //BA.debugLineNum = 49;BA.debugLine="vm.SetGMapKey(\"\")";
_vm._setgmapkey /*String*/ ("");
 //BA.debugLineNum = 50;BA.debugLine="buildMap.SetCenter(-28.4792625, 24.6727135)";
_buildmap._setcenter /*b4j.example.vmgmap*/ (-28.4792625,24.6727135);
 //BA.debugLineNum = 51;BA.debugLine="buildMap.SetZoom(8)";
_buildmap._setzoom /*b4j.example.vmgmap*/ ((int) (8));
 //BA.debugLineNum = 52;BA.debugLine="buildMap.SetMapTypeHybrid";
_buildmap._setmaptypehybrid /*b4j.example.vmgmap*/ ();
 //BA.debugLineNum = 53;BA.debugLine="buildMap.setwidth(\"100%\")";
_buildmap._setwidth /*b4j.example.vmgmap*/ ("100%");
 //BA.debugLineNum = 54;BA.debugLine="buildMap.setheight(\"500px\")";
_buildmap._setheight /*b4j.example.vmgmap*/ ("500px");
 //BA.debugLineNum = 55;BA.debugLine="buildMap.ClearMarkers";
_buildmap._clearmarkers /*b4j.example.vmgmap*/ ();
 //BA.debugLineNum = 56;BA.debugLine="mapGrid.AddComponent(2,1, buildMap.ToString)";
_mapgrid._addcomponent /*String*/ ((int) (2),(int) (1),_buildmap._tostring /*String*/ ());
 //BA.debugLineNum = 58;BA.debugLine="cont.AddComponent(2, 1 ,mapGrid.tostring)";
_cont._addcomponent /*String*/ ((int) (2),(int) (1),_mapgrid._tostring /*String*/ ());
 //BA.debugLineNum = 60;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"gmapcode\"";
_name = "gmapcode";
 //BA.debugLineNum = 5;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="Private buildMap As VMGMap";
_buildmap = new b4j.example.vmgmap();
 //BA.debugLineNum = 7;BA.debugLine="Private frm As VMContainer";
_frm = new b4j.example.vmcontainer();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
