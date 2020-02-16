package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananovm extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananovm", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananovm.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmloader _overlay = null;
public anywheresoftware.b4a.objects.collections.Map _themes = null;
public anywheresoftware.b4a.objects.collections.Map _refs = null;
public anywheresoftware.b4a.objects.collections.Map _data = null;
public b4j.example.vmprompt _prompt = null;
public com.ab.banano.BANanoObject _material = null;
public com.ab.banano.BANanoObject _vueloading = null;
public com.ab.banano.BANanoObject _vuecal = null;
public com.ab.banano.BANanoObject _vuebo = null;
public com.ab.banano.BANanoObject _jquery = null;
public com.ab.banano.BANanoObject _vm = null;
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANanoObject _vmdef = null;
public b4j.example.vmelement _content = null;
public b4j.example.vmtoolbar _navbar = null;
public b4j.example.vmdrawer _drawer = null;
public b4j.example.vmelement _app = null;
public b4j.example.vmalert _alert = null;
public b4j.example.vmconfirm _confirm = null;
public b4j.example.vmsnackbar _snack = null;
public anywheresoftware.b4a.objects.collections.Map _coloroptions = null;
public anywheresoftware.b4a.objects.collections.Map _borderoptions = null;
public anywheresoftware.b4a.objects.collections.Map _intensityoptions = null;
public boolean _hasknob = false;
public boolean _hasinfobox = false;
public anywheresoftware.b4a.objects.collections.Map _elevation = null;
public b4j.example.vmcontainer _container = null;
public String _gettemplate = "";
public anywheresoftware.b4a.objects.collections.List _pages = null;
public com.ab.banano.BANanoObject _chartkick = null;
public com.ab.banano.BANanoObject _chart = null;
public com.ab.banano.BANanoObject _vuegooglemaps = null;
public b4j.example.main _main = null;
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public String  _addalert(String _alertid,Object _eventhandler,String _title,String _alertcontent,String _confirmtext) throws Exception{
b4j.example.vmalert _myalert = null;
 //BA.debugLineNum = 1312;BA.debugLine="Sub AddAlert(alertid As String, eventHandler As Ob";
 //BA.debugLineNum = 1313;BA.debugLine="Dim myalert As VMAlert = CreateAlert(alertid,even";
_myalert = _createalert(_alertid,_eventhandler)._setstatic /*b4j.example.vmalert*/ (__c.True)._settitle /*b4j.example.vmalert*/ (_title)._setconfirmtext /*b4j.example.vmalert*/ (_confirmtext)._setcontent /*b4j.example.vmalert*/ (_alertcontent);
 //BA.debugLineNum = 1314;BA.debugLine="myalert.Pop(Content)";
_myalert._pop /*String*/ (_content);
 //BA.debugLineNum = 1315;BA.debugLine="End Sub";
return "";
}
public String  _addcomponent(b4j.example.vuecomponent _comp) throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub AddComponent(comp As VueComponent)";
 //BA.debugLineNum = 438;BA.debugLine="Vue.AddComponent(comp)";
_vue._addcomponent /*b4j.example.bananovue*/ (_comp);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return "";
}
public String  _addconfirm(String _confirmid,Object _eventhandler,String _title,String _confirmcontent,String _confirmtext,String _canceltext) throws Exception{
b4j.example.vmconfirm _myalert = null;
 //BA.debugLineNum = 1318;BA.debugLine="Sub AddConfirm(confirmid As String, eventHandler A";
 //BA.debugLineNum = 1319;BA.debugLine="Dim myalert As VMConfirm = CreateConfirm(confirmi";
_myalert = _createconfirm(_confirmid,_eventhandler)._setstatic /*b4j.example.vmconfirm*/ (__c.True)._settitle /*b4j.example.vmconfirm*/ (_title)._setconfirmtext /*b4j.example.vmconfirm*/ (_confirmtext)._setcontent /*b4j.example.vmconfirm*/ (_confirmcontent)._setcanceltext /*b4j.example.vmconfirm*/ (_canceltext);
 //BA.debugLineNum = 1320;BA.debugLine="myalert.Pop(Content)";
_myalert._pop /*String*/ (_content);
 //BA.debugLineNum = 1321;BA.debugLine="End Sub";
return "";
}
public String  _addcontainer(b4j.example.vmcontainer _cont) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub AddContainer(cont As VMContainer)";
 //BA.debugLineNum = 58;BA.debugLine="Content.SetText(cont.tostring)";
_content._settext /*b4j.example.vmelement*/ (_cont._tostring /*String*/ ());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _addcontainerrc(int _row,int _col,b4j.example.vmcontainer _cont) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub AddContainerRC(row As Int, col As Int, cont As";
 //BA.debugLineNum = 63;BA.debugLine="Container.AddComponent(row, col, cont.ToString)";
_container._addcomponent /*String*/ (_row,_col,_cont._tostring /*String*/ ());
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _addcontent(String _els) throws Exception{
 //BA.debugLineNum = 1496;BA.debugLine="Sub AddContent(els As String)";
 //BA.debugLineNum = 1497;BA.debugLine="Vue.SetTemplate(els)";
_vue._settemplate /*String*/ (_els);
 //BA.debugLineNum = 1498;BA.debugLine="End Sub";
return "";
}
public String  _adddialog(b4j.example.vmdialog _diag) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub AddDialog(diag As VMDialog)";
 //BA.debugLineNum = 124;BA.debugLine="diag.Pop(Content)";
_diag._pop /*String*/ (_content);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _addelement(b4j.example.vmelement _elm) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub AddElement(elm As VMElement)";
 //BA.debugLineNum = 443;BA.debugLine="elm.Pop(Content)";
_elm._pop /*String*/ (_content);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return "";
}
public String  _addgrid(b4j.example.vmgrid _grd) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub AddGrid(grd As VMGrid)";
 //BA.debugLineNum = 68;BA.debugLine="grd.Pop(Content)";
_grd._pop /*String*/ (_content);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _addhtml(String _htmlcontent) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub AddHTML(htmlContent As String)";
 //BA.debugLineNum = 447;BA.debugLine="Content.SetText(htmlContent)";
_content._settext /*b4j.example.vmelement*/ (_htmlcontent);
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return "";
}
public String  _addpage(String _name,Object _module) throws Exception{
 //BA.debugLineNum = 1198;BA.debugLine="Sub AddPage(name As String, module As Object)";
 //BA.debugLineNum = 1199;BA.debugLine="Pages.add(name)";
_pages.Add((Object)(_name));
 //BA.debugLineNum = 1200;BA.debugLine="BANano.CallSub(module, \"Code\", Array(Me))   'igno";
_banano.CallSub(_module,"Code",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{this}));
 //BA.debugLineNum = 1201;BA.debugLine="End Sub";
return "";
}
public String  _addprompt(String _promptid,Object _eventhandler,String _title,String _message,String _placeholder,int _maxlen,String _confirmtext,String _canceltext) throws Exception{
b4j.example.vmprompt _myprompt = null;
 //BA.debugLineNum = 1324;BA.debugLine="Sub AddPrompt(promptid As String, eventHandler As";
 //BA.debugLineNum = 1325;BA.debugLine="Vue.SetStateSingle(promptid, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_promptid,__c.Null);
 //BA.debugLineNum = 1326;BA.debugLine="Dim myprompt As VMPrompt = CreatePrompt(promptid,";
_myprompt = _createprompt(_promptid,_eventhandler)._setstatic /*b4j.example.vmprompt*/ (__c.True)._settitle /*b4j.example.vmprompt*/ (_title)._setcontent /*b4j.example.vmprompt*/ (_message)._setmaxlength /*b4j.example.vmprompt*/ (_maxlen)._setplaceholder /*b4j.example.vmprompt*/ (_placeholder);
 //BA.debugLineNum = 1327;BA.debugLine="myprompt.SetConfirmText(ConfirmText).SetCancelTex";
_myprompt._setconfirmtext /*b4j.example.vmprompt*/ (_confirmtext)._setcanceltext /*b4j.example.vmprompt*/ (_canceltext);
 //BA.debugLineNum = 1328;BA.debugLine="myprompt.Pop(Content)";
_myprompt._pop /*String*/ (_content);
 //BA.debugLineNum = 1329;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _addroute(String _path,b4j.example.vuecomponent _comp) throws Exception{
 //BA.debugLineNum = 470;BA.debugLine="Sub AddRoute(path As String, comp As VueComponent)";
 //BA.debugLineNum = 471;BA.debugLine="Vue.AddRoute(path, comp)";
_vue._addroute /*String*/ (_path,_comp);
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public String  _addsnackbar(b4j.example.vmsnackbar _snackbar) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub AddSnackBar(SnackBar As VMSnackbar)";
 //BA.debugLineNum = 129;BA.debugLine="SnackBar.Pop(Content)";
_snackbar._pop /*String*/ (_content);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _addspeeddial(b4j.example.vmspeeddial _speed) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub AddSpeedDial(speed As VMSpeedDial)";
 //BA.debugLineNum = 134;BA.debugLine="speed.Pop(Content)";
_speed._pop /*String*/ (_content);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _addtheme(String _themename,String _forecolor,String _forecolorintensity,String _backcolor,String _backcolorintensity) throws Exception{
String _fc = "";
String _bc = "";
anywheresoftware.b4a.objects.collections.Map _theme = null;
 //BA.debugLineNum = 1346;BA.debugLine="Sub AddTheme(themeName As String, ForeColor As Str";
 //BA.debugLineNum = 1347;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 1348;BA.debugLine="Dim fc As String = $\"${ForeColor} ${ForeColorInte";
_fc = (""+__c.SmartStringFormatter("",(Object)(_forecolor))+" "+__c.SmartStringFormatter("",(Object)(_forecolorintensity))+"");
 //BA.debugLineNum = 1349;BA.debugLine="Dim bc As String = $\"${BackColor} ${BackColorInte";
_bc = (""+__c.SmartStringFormatter("",(Object)(_backcolor))+" "+__c.SmartStringFormatter("",(Object)(_backcolorintensity))+"");
 //BA.debugLineNum = 1351;BA.debugLine="fc = fc.Trim";
_fc = _fc.trim();
 //BA.debugLineNum = 1352;BA.debugLine="bc = bc.trim";
_bc = _bc.trim();
 //BA.debugLineNum = 1354;BA.debugLine="Dim theme As Map = CreateMap()";
_theme = new anywheresoftware.b4a.objects.collections.Map();
_theme = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1355;BA.debugLine="theme.Put(\"fc\", fc)";
_theme.Put((Object)("fc"),(Object)(_fc));
 //BA.debugLineNum = 1356;BA.debugLine="theme.Put(\"bc\", bc)";
_theme.Put((Object)("bc"),(Object)(_bc));
 //BA.debugLineNum = 1357;BA.debugLine="Themes.Put(themeName, theme)";
_themes.Put((Object)(_themename),(Object)(_theme.getObject()));
 //BA.debugLineNum = 1358;BA.debugLine="End Sub";
return "";
}
public int  _age(String _birthday) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub Age(birthDay As String) As Int";
 //BA.debugLineNum = 203;BA.debugLine="Return Vue.Age(birthDay)";
if (true) return _vue._age /*int*/ (_birthday);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _audittrail(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
 //BA.debugLineNum = 808;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
 //BA.debugLineNum = 809;BA.debugLine="Return Vue.AuditTrail(oldM, newM)";
if (true) return _vue._audittrail /*anywheresoftware.b4a.objects.collections.Map*/ (_oldm,_newm);
 //BA.debugLineNum = 810;BA.debugLine="End Sub";
return null;
}
public String  _br() throws Exception{
 //BA.debugLineNum = 536;BA.debugLine="Sub BR As String";
 //BA.debugLineNum = 537;BA.debugLine="Return \"<br>\"";
if (true) return "<br>";
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return "";
}
public Object  _callcomputed(String _methodname) throws Exception{
 //BA.debugLineNum = 773;BA.debugLine="Sub CallComputed(methodName As String) As Object";
 //BA.debugLineNum = 774;BA.debugLine="Return Vue.CallComputed(methodName)";
if (true) return _vue._callcomputed /*Object*/ (_methodname);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return null;
}
public String  _callmethod(String _methodname) throws Exception{
 //BA.debugLineNum = 769;BA.debugLine="Sub CallMethod(methodName As String)";
 //BA.debugLineNum = 770;BA.debugLine="Vue.CallMethod(methodName)";
_vue._callmethod /*String*/ (_methodname);
 //BA.debugLineNum = 771;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 4;BA.debugLine="Public Overlay As VMLoader";
_overlay = new b4j.example.vmloader();
 //BA.debugLineNum = 5;BA.debugLine="Private Themes As Map";
_themes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public refs As Map";
_refs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Public data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private Prompt As VMPrompt";
_prompt = new b4j.example.vmprompt();
 //BA.debugLineNum = 9;BA.debugLine="Public material As BANanoObject";
_material = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 10;BA.debugLine="Public VueLoading As BANanoObject";
_vueloading = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 11;BA.debugLine="Public VueCal As BANanoObject";
_vuecal = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 12;BA.debugLine="Public VueBO As BANanoObject";
_vuebo = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 13;BA.debugLine="Public JQuery As BANanoObject";
_jquery = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 14;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 15;BA.debugLine="Public VM As BANanoObject";
_vm = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 16;BA.debugLine="Public Vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 17;BA.debugLine="Public VMDef As BANanoObject";
_vmdef = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 18;BA.debugLine="Public Content As VMElement";
_content = new b4j.example.vmelement();
 //BA.debugLineNum = 19;BA.debugLine="Public NavBar As VMToolBar";
_navbar = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 20;BA.debugLine="Public Drawer As VMDrawer";
_drawer = new b4j.example.vmdrawer();
 //BA.debugLineNum = 21;BA.debugLine="Public App As VMElement";
_app = new b4j.example.vmelement();
 //BA.debugLineNum = 22;BA.debugLine="Private Alert As VMAlert";
_alert = new b4j.example.vmalert();
 //BA.debugLineNum = 23;BA.debugLine="Private Confirm As VMConfirm";
_confirm = new b4j.example.vmconfirm();
 //BA.debugLineNum = 24;BA.debugLine="Private Snack As VMSnackbar";
_snack = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 25;BA.debugLine="Public ColorOptions As Map";
_coloroptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 26;BA.debugLine="Public BorderOptions As Map";
_borderoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="Public IntensityOptions As Map";
_intensityoptions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 28;BA.debugLine="Private HasKnob As Boolean";
_hasknob = false;
 //BA.debugLineNum = 29;BA.debugLine="Private HasInfoBox As Boolean";
_hasinfobox = false;
 //BA.debugLineNum = 30;BA.debugLine="Public Elevation As Map";
_elevation = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 31;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 32;BA.debugLine="Public GetTemplate As String";
_gettemplate = "";
 //BA.debugLineNum = 33;BA.debugLine="Private Pages As List";
_pages = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 34;BA.debugLine="Private Chartkick As BANanoObject";
_chartkick = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 35;BA.debugLine="Private Chart As BANanoObject";
_chart = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 36;BA.debugLine="Private VueGoogleMaps As BANanoObject";
_vuegooglemaps = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _compile(String _html) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 1119;BA.debugLine="Sub Compile(html As String) As BANanoObject";
 //BA.debugLineNum = 1120;BA.debugLine="Dim bo As BANanoObject = Vue.Compile(html)";
_bo = new com.ab.banano.BANanoObject();
_bo = _vue._compile /*com.ab.banano.BANanoObject*/ (_html);
 //BA.debugLineNum = 1121;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 1122;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _copymap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
 //BA.debugLineNum = 1061;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 1062;BA.debugLine="Return Vue.CopyMap(source, keys)";
if (true) return _vue._copymap /*anywheresoftware.b4a.objects.collections.Map*/ (_source,_keys);
 //BA.debugLineNum = 1063;BA.debugLine="End Sub";
return null;
}
public String  _create() throws Exception{
 //BA.debugLineNum = 1501;BA.debugLine="Sub Create";
 //BA.debugLineNum = 1502;BA.debugLine="NavBar.Pop(App)";
_navbar._pop /*String*/ (_app);
 //BA.debugLineNum = 1503;BA.debugLine="Drawer.Pop(App)";
_drawer._pop /*String*/ (_app);
 //BA.debugLineNum = 1504;BA.debugLine="Content.Pop(App)";
_content._pop /*String*/ (_app);
 //BA.debugLineNum = 1505;BA.debugLine="AddContent(App.ToString)";
_addcontent(_app._tostring /*String*/ ());
 //BA.debugLineNum = 1506;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _createa(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 967;BA.debugLine="Sub CreateA(sid As String) As VMElement";
 //BA.debugLineNum = 968;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 969;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"a\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("a");
 //BA.debugLineNum = 970;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmalert  _createalert(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmalert _el = null;
 //BA.debugLineNum = 1544;BA.debugLine="Sub CreateAlert(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 1545;BA.debugLine="Dim el As VMAlert";
_el = new b4j.example.vmalert();
 //BA.debugLineNum = 1546;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmalert*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1547;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createapp(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1658;BA.debugLine="Sub CreateApp(sid As String) As VMElement";
 //BA.debugLineNum = 1659;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1660;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"md-app\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("md-app");
 //BA.debugLineNum = 1661;BA.debugLine="el.SetStyle(CreateMap(\"height\":\"100vh\"))";
_el._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("100vh")}));
 //BA.debugLineNum = 1662;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1663;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createappcontent(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1605;BA.debugLine="Sub CreateAppContent(sid As String) As VMElement";
 //BA.debugLineNum = 1606;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1607;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid);
 //BA.debugLineNum = 1608;BA.debugLine="el.SetTag(\"md-app-content\")";
_el._settag /*b4j.example.vmelement*/ ("md-app-content");
 //BA.debugLineNum = 1609;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1610;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _createavatar(String _sid,Object _module) throws Exception{
b4j.example.vmavatar _el = null;
 //BA.debugLineNum = 522;BA.debugLine="Sub CreateAvatar(sid As String, module As Object)";
 //BA.debugLineNum = 523;BA.debugLine="Dim el As VMAvatar";
_el = new b4j.example.vmavatar();
 //BA.debugLineNum = 524;BA.debugLine="el.Initialize(Vue,sid, module)";
_el._initialize /*b4j.example.vmavatar*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 525;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _createbadge(String _sid) throws Exception{
b4j.example.vmbadge _el = null;
 //BA.debugLineNum = 529;BA.debugLine="Sub CreateBadge(sid As String) As VMBadge";
 //BA.debugLineNum = 530;BA.debugLine="Dim el As VMBadge";
_el = new b4j.example.vmbadge();
 //BA.debugLineNum = 531;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmbadge*/ (ba,_vue,_sid);
 //BA.debugLineNum = 532;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 533;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createbody1(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 961;BA.debugLine="Sub CreateBody1(sid As String) As VMElement";
 //BA.debugLineNum = 962;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 963;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetBody1(T";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setbody1 /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 964;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 965;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createbody2(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 973;BA.debugLine="Sub CreateBody2(sid As String) As VMElement";
 //BA.debugLineNum = 974;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 975;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetBody2(T";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setbody2 /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 976;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 977;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _createbottombaritem(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmbottombaritem _el = null;
 //BA.debugLineNum = 849;BA.debugLine="Sub CreateBottomBarItem(sid As String, eventHandle";
 //BA.debugLineNum = 850;BA.debugLine="Dim el As VMBottomBarItem";
_el = new b4j.example.vmbottombaritem();
 //BA.debugLineNum = 851;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmbottombaritem*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 852;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 853;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _createbuttombar(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmbottombar _el = null;
 //BA.debugLineNum = 855;BA.debugLine="Sub CreateButtomBar(sid As String, eventHandler As";
 //BA.debugLineNum = 856;BA.debugLine="Dim el As VMBottomBar";
_el = new b4j.example.vmbottombar();
 //BA.debugLineNum = 857;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmbottombar*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 858;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createbutton(String _sid,Object _module) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 1624;BA.debugLine="Sub CreateButton(sid As String,module As Object) A";
 //BA.debugLineNum = 1625;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 1626;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 1627;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1628;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createbutton1(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 635;BA.debugLine="Sub CreateBUTTON1(id As String) As VMElement";
 //BA.debugLineNum = 636;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 637;BA.debugLine="el.Initialize(Vue, id).SetTag(\"button\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("button");
 //BA.debugLineNum = 638;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 639;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcaption(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 955;BA.debugLine="Sub CreateCaption(sid As String) As VMElement";
 //BA.debugLineNum = 956;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 957;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").AddClass(\"";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._addclass /*b4j.example.vmelement*/ ("md-caption");
 //BA.debugLineNum = 958;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 959;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _createchartkick(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmchartkick _el = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub CreateChartKick(sid As String, eventHandler As";
 //BA.debugLineNum = 85;BA.debugLine="Dim el As VMChartKick";
_el = new b4j.example.vmchartkick();
 //BA.debugLineNum = 86;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmchartkick*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 87;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _createcheckbox(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 885;BA.debugLine="Sub CreateCheckBox(sid As String, eventHandler As";
 //BA.debugLineNum = 886;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 887;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 888;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 889;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _createcheckboxgroup(String _sid,String _scaption,Object _eventhandler) throws Exception{
b4j.example.vmcheckboxgroup _el = null;
 //BA.debugLineNum = 1636;BA.debugLine="Sub CreateCheckBoxGroup(sid As String, sCaption As";
 //BA.debugLineNum = 1637;BA.debugLine="Dim el As VMCheckBoxGroup";
_el = new b4j.example.vmcheckboxgroup();
 //BA.debugLineNum = 1638;BA.debugLine="el.Initialize(Vue, sid, sCaption, eventHandler)";
_el._initialize /*b4j.example.vmcheckboxgroup*/ (ba,_vue,_sid,_scaption,_eventhandler);
 //BA.debugLineNum = 1639;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1640;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _createchip(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmchip _el = null;
 //BA.debugLineNum = 1432;BA.debugLine="Sub CreateChip(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 1433;BA.debugLine="Dim el As VMChip";
_el = new b4j.example.vmchip();
 //BA.debugLineNum = 1434;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmchip*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1435;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _createchips(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmchips _el = null;
 //BA.debugLineNum = 1420;BA.debugLine="Sub CreateChips(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 1421;BA.debugLine="Dim el As VMChips";
_el = new b4j.example.vmchips();
 //BA.debugLineNum = 1422;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmchips*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1423;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1424;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _createcol(String _sid) throws Exception{
b4j.example.vmcol _el = null;
 //BA.debugLineNum = 1490;BA.debugLine="Sub CreateCol(sid As String) As VMCol";
 //BA.debugLineNum = 1491;BA.debugLine="Dim el As VMCol";
_el = new b4j.example.vmcol();
 //BA.debugLineNum = 1492;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmcol*/ (ba,_vue,_sid);
 //BA.debugLineNum = 1493;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1494;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _createcomponent(String _id,String _tag,Object _eventhandler) throws Exception{
b4j.example.vuecomponent _el = null;
 //BA.debugLineNum = 457;BA.debugLine="Sub CreateComponent(id As String, tag As String, e";
 //BA.debugLineNum = 458;BA.debugLine="Dim el As VueComponent";
_el = new b4j.example.vuecomponent();
 //BA.debugLineNum = 459;BA.debugLine="el.Initialize(id, tag, eventHandler)";
_el._initialize /*b4j.example.vuecomponent*/ (ba,_id,_tag,_eventhandler);
 //BA.debugLineNum = 460;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcomponent1(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 464;BA.debugLine="Sub CreateComponent1(id As String) As VMElement";
 //BA.debugLineNum = 465;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 466;BA.debugLine="el.Initialize(Vue, id).SetTag(\"component\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("component");
 //BA.debugLineNum = 467;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmconfirm  _createconfirm(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmconfirm _el = null;
 //BA.debugLineNum = 1538;BA.debugLine="Sub CreateConfirm(sid As String, eventHandler As O";
 //BA.debugLineNum = 1539;BA.debugLine="Dim el As VMConfirm";
_el = new b4j.example.vmconfirm();
 //BA.debugLineNum = 1540;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmconfirm*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1541;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1542;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _createcontainer(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcontainer _el = null;
 //BA.debugLineNum = 216;BA.debugLine="Sub CreateContainer(sid As String, eventHandler As";
 //BA.debugLineNum = 217;BA.debugLine="Dim el As VMContainer";
_el = new b4j.example.vmcontainer();
 //BA.debugLineNum = 218;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcontainer*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 219;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcss  _createcss() throws Exception{
b4j.example.vmcss _el = null;
 //BA.debugLineNum = 240;BA.debugLine="Sub CreateCSS As VMCSS";
 //BA.debugLineNum = 241;BA.debugLine="Dim El As VMCSS";
_el = new b4j.example.vmcss();
 //BA.debugLineNum = 242;BA.debugLine="El.Initialize";
_el._initialize /*String*/ (ba);
 //BA.debugLineNum = 243;BA.debugLine="Return El";
if (true) return _el;
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcustomcomponent(String _id,String _tag) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 450;BA.debugLine="Sub CreateCustomComponent(id As String, tag As Str";
 //BA.debugLineNum = 451;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 452;BA.debugLine="el.Initialize(Vue, id).SetTag(tag)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ (_tag);
 //BA.debugLineNum = 453;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _createdatepicker(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmdatepicker _el = null;
 //BA.debugLineNum = 1581;BA.debugLine="Sub CreateDatePicker(sid As String, eventHandler A";
 //BA.debugLineNum = 1582;BA.debugLine="Dim el As VMDatePicker";
_el = new b4j.example.vmdatepicker();
 //BA.debugLineNum = 1583;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmdatepicker*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1584;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1585;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _createdialog(String _sid,Object _module) throws Exception{
b4j.example.vmdialog _el = null;
 //BA.debugLineNum = 1563;BA.debugLine="Sub CreateDialog(sid As String, module As Object)";
 //BA.debugLineNum = 1564;BA.debugLine="Dim el As VMDialog";
_el = new b4j.example.vmdialog();
 //BA.debugLineNum = 1565;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmdialog*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 1566;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdisplay1(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 997;BA.debugLine="Sub CreateDisplay1(sid As String) As VMElement";
 //BA.debugLineNum = 998;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 999;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setdisplay1 /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1000;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1001;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdisplay2(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1003;BA.debugLine="Sub CreateDisplay2(sid As String) As VMElement";
 //BA.debugLineNum = 1004;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1005;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setdisplay2 /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1006;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1007;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdisplay3(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1009;BA.debugLine="Sub CreateDisplay3(sid As String) As VMElement";
 //BA.debugLineNum = 1010;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1011;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setdisplay3 /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1012;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1013;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdisplay4(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1015;BA.debugLine="Sub CreateDisplay4(sid As String) As VMElement";
 //BA.debugLineNum = 1016;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1017;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setdisplay4 /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1018;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _creatediv(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 569;BA.debugLine="Sub CreateDiv(id As String) As VMElement";
 //BA.debugLineNum = 570;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 571;BA.debugLine="el.Initialize(Vue,id).SetTag(\"div\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 572;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _createdivider(boolean _b) throws Exception{
b4j.example.vmdivider _el = null;
 //BA.debugLineNum = 1569;BA.debugLine="Sub CreateDivider(b As Boolean) As VMDivider";
 //BA.debugLineNum = 1570;BA.debugLine="Dim el As VMDivider";
_el = new b4j.example.vmdivider();
 //BA.debugLineNum = 1571;BA.debugLine="el.Initialize(Vue, \"\")";
_el._initialize /*b4j.example.vmdivider*/ (ba,_vue,"");
 //BA.debugLineNum = 1572;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _createdrawer(String _sid,Object _module) throws Exception{
b4j.example.vmdrawer _el = null;
 //BA.debugLineNum = 1618;BA.debugLine="Sub CreateDrawer(sid As String, module As Object)";
 //BA.debugLineNum = 1619;BA.debugLine="Dim el As VMDrawer";
_el = new b4j.example.vmdrawer();
 //BA.debugLineNum = 1620;BA.debugLine="el.Initialize(Vue,sid, module)";
_el._initialize /*b4j.example.vmdrawer*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 1621;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1622;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createelement(String _sid,String _stag) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1612;BA.debugLine="Sub CreateElement(sid As String, stag As String) A";
 //BA.debugLineNum = 1613;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1614;BA.debugLine="el.Initialize(Vue,sid).SetTag(stag)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ (_stag);
 //BA.debugLineNum = 1615;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1616;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createemail(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminput _el = null;
 //BA.debugLineNum = 1462;BA.debugLine="Sub CreateEmail(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 1463;BA.debugLine="Dim el As VMInput = CreateInput(sid, eventHandler";
_el = _createinput(_sid,_eventhandler)._settypeemail /*b4j.example.vminput*/ (__c.True);
 //BA.debugLineNum = 1464;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1465;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _createemptystate(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmemptystate _el = null;
 //BA.debugLineNum = 289;BA.debugLine="Sub CreateEmptyState(sid As String, eventHandler A";
 //BA.debugLineNum = 290;BA.debugLine="Dim el As VMEmptyState";
_el = new b4j.example.vmemptystate();
 //BA.debugLineNum = 291;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmemptystate*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 292;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _createenlighter(String _sid,String _lang) throws Exception{
b4j.example.vmenlighter _el = null;
 //BA.debugLineNum = 266;BA.debugLine="Sub CreateEnlighter(sid As String, lang As String)";
 //BA.debugLineNum = 267;BA.debugLine="Dim el As VMEnlighter";
_el = new b4j.example.vmenlighter();
 //BA.debugLineNum = 268;BA.debugLine="el.Initialize(Vue, sid, lang)";
_el._initialize /*b4j.example.vmenlighter*/ (ba,_vue,_sid,_lang);
 //BA.debugLineNum = 269;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _createfield(String _parentid,String _sid,Object _eventhandler) throws Exception{
b4j.example.vmfield _el = null;
 //BA.debugLineNum = 1478;BA.debugLine="Sub CreateField(parentid As String, sid As String,";
 //BA.debugLineNum = 1479;BA.debugLine="Dim el As VMField";
_el = new b4j.example.vmfield();
 //BA.debugLineNum = 1480;BA.debugLine="el.Initialize(Vue, parentid, sid,eventHandler)";
_el._initialize /*b4j.example.vmfield*/ (ba,_vue,_parentid,_sid,_eventhandler);
 //BA.debugLineNum = 1481;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1482;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _createfile(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmfile _el = null;
 //BA.debugLineNum = 1450;BA.debugLine="Sub CreateFile(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 1451;BA.debugLine="Dim el As VMFile";
_el = new b4j.example.vmfile();
 //BA.debugLineNum = 1452;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmfile*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1453;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1454;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _createform(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmform _el = null;
 //BA.debugLineNum = 1426;BA.debugLine="Sub CreateForm(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 1427;BA.debugLine="Dim el As VMForm";
_el = new b4j.example.vmform();
 //BA.debugLineNum = 1428;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmform*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1429;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createform1(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 608;BA.debugLine="Sub CreateFORM1(id As String) As VMElement";
 //BA.debugLineNum = 609;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 610;BA.debugLine="el.Initialize(Vue, id).SetTag(\"form\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("form");
 //BA.debugLineNum = 611;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _createfrappegantt(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmfrappegantt _el = null;
 //BA.debugLineNum = 210;BA.debugLine="Sub CreateFrappeGantt(sid As String, eventHandler";
 //BA.debugLineNum = 211;BA.debugLine="Dim el As VMFrappeGantt";
_el = new b4j.example.vmfrappegantt();
 //BA.debugLineNum = 212;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmfrappegantt*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 213;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _creategijgotable(String _sid,String _primarykey,Object _module) throws Exception{
b4j.example.vmgijgotable _el = null;
 //BA.debugLineNum = 307;BA.debugLine="Sub CreateGijgoTable(sid As String, PrimaryKey As";
 //BA.debugLineNum = 308;BA.debugLine="Dim el As VMGijgoTable";
_el = new b4j.example.vmgijgotable();
 //BA.debugLineNum = 309;BA.debugLine="el.Initialize(Vue, sid, PrimaryKey, module)";
_el._initialize /*b4j.example.vmgijgotable*/ (ba,_vue,_sid,_primarykey,_module);
 //BA.debugLineNum = 310;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _creategmap(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmgmap _el = null;
 //BA.debugLineNum = 39;BA.debugLine="Sub CreateGMap(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 40;BA.debugLine="Dim el As VMGMap";
_el = new b4j.example.vmgmap();
 //BA.debugLineNum = 41;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmgmap*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 42;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _creategrid(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmgrid _el = null;
 //BA.debugLineNum = 949;BA.debugLine="Sub CreateGrid(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 950;BA.debugLine="Dim el As VMGrid";
_el = new b4j.example.vmgrid();
 //BA.debugLineNum = 951;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmgrid*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 952;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 953;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh1(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 601;BA.debugLine="Sub CreateH1(id As String) As VMElement";
 //BA.debugLineNum = 602;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 603;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h1\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("h1");
 //BA.debugLineNum = 604;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh2(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 642;BA.debugLine="Sub CreateH2(id As String) As VMElement";
 //BA.debugLineNum = 643;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 644;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h2\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("h2");
 //BA.debugLineNum = 645;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh3(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 648;BA.debugLine="Sub CreateH3(id As String) As VMElement";
 //BA.debugLineNum = 649;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 650;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h3\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("h3");
 //BA.debugLineNum = 651;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh4(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 654;BA.debugLine="Sub CreateH4(id As String) As VMElement";
 //BA.debugLineNum = 655;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 656;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h4\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("h4");
 //BA.debugLineNum = 657;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 658;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh5(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 660;BA.debugLine="Sub CreateH5(id As String) As VMElement";
 //BA.debugLineNum = 661;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 662;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h5\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("h5");
 //BA.debugLineNum = 663;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 664;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh6(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 666;BA.debugLine="Sub CreateH6(id As String) As VMElement";
 //BA.debugLineNum = 667;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 668;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h6\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("h6");
 //BA.debugLineNum = 669;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 670;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createheadline(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 991;BA.debugLine="Sub CreateHeadline(sid As String) As VMElement";
 //BA.debugLineNum = 992;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 993;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetHeadlin";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setheadline /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 994;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 995;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _createicon(String _sid) throws Exception{
b4j.example.vmicon _el = null;
 //BA.debugLineNum = 1593;BA.debugLine="Sub CreateIcon(sid As String) As VMIcon";
 //BA.debugLineNum = 1594;BA.debugLine="Dim el As VMIcon";
_el = new b4j.example.vmicon();
 //BA.debugLineNum = 1595;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmicon*/ (ba,_vue,_sid);
 //BA.debugLineNum = 1596;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1597;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _createimage(String _img,Object _eventhandler) throws Exception{
b4j.example.vmimage _el = null;
 //BA.debugLineNum = 295;BA.debugLine="Sub CreateImage(img As String, eventHandler As Obj";
 //BA.debugLineNum = 296;BA.debugLine="Dim el As VMImage";
_el = new b4j.example.vmimage();
 //BA.debugLineNum = 297;BA.debugLine="el.Initialize(Vue, img, eventHandler)";
_el._initialize /*b4j.example.vmimage*/ (ba,_vue,_img,_eventhandler);
 //BA.debugLineNum = 298;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _createinfobox(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminfobox _el = null;
 //BA.debugLineNum = 423;BA.debugLine="Sub CreateInfoBox(sid As String, eventHandler As O";
 //BA.debugLineNum = 424;BA.debugLine="HasInfoBox = True";
_hasinfobox = __c.True;
 //BA.debugLineNum = 425;BA.debugLine="Dim el As VMInfoBox";
_el = new b4j.example.vminfobox();
 //BA.debugLineNum = 426;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminfobox*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 427;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createinput(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminput _el = null;
 //BA.debugLineNum = 1444;BA.debugLine="Sub CreateInput(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 1445;BA.debugLine="Dim el As VMInput";
_el = new b4j.example.vminput();
 //BA.debugLineNum = 1446;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminput*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1447;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1448;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createinput1(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 621;BA.debugLine="Sub CreateINPUT1(id As String) As VMElement";
 //BA.debugLineNum = 622;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 623;BA.debugLine="el.Initialize(Vue, id).SetTag(\"input\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("input");
 //BA.debugLineNum = 624;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createkeepalive(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 557;BA.debugLine="Sub CreateKeepAlive(sid As String) As VMElement";
 //BA.debugLineNum = 558;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 559;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"keep-alive\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("keep-alive");
 //BA.debugLineNum = 560;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _createknob(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmknob _el = null;
 //BA.debugLineNum = 430;BA.debugLine="Sub CreateKnob(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 431;BA.debugLine="HasKnob = True";
_hasknob = __c.True;
 //BA.debugLineNum = 432;BA.debugLine="Dim el As VMKnob";
_el = new b4j.example.vmknob();
 //BA.debugLineNum = 433;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmknob*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 434;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createlabel(String _id) throws Exception{
b4j.example.vmlabel _el = null;
 //BA.debugLineNum = 614;BA.debugLine="Sub CreateLABEL(id As String) As VMLabel";
 //BA.debugLineNum = 615;BA.debugLine="Dim el As VMLabel";
_el = new b4j.example.vmlabel();
 //BA.debugLineNum = 616;BA.debugLine="el.Initialize(Vue, id)";
_el._initialize /*b4j.example.vmlabel*/ (ba,_vue,_id);
 //BA.debugLineNum = 617;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 618;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createlayout(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1665;BA.debugLine="Sub CreateLayout(sid As String) As VMElement";
 //BA.debugLineNum = 1666;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1667;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"div\").SetLayout(Tr";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("div")._setlayout /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1668;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1669;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createlayoutitem(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1671;BA.debugLine="Sub CreateLayoutItem(sid As String) As VMElement";
 //BA.debugLineNum = 1672;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1673;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"div\").SetLayoutIte";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("div")._setlayoutitem /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1674;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createli(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 581;BA.debugLine="Sub CreateLI(id As String) As VMElement";
 //BA.debugLineNum = 582;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 583;BA.debugLine="el.Initialize(Vue,id).SetTag(\"li\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("li");
 //BA.debugLineNum = 584;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _createlist(String _sid,Object _module) throws Exception{
b4j.example.vmlist _el = null;
 //BA.debugLineNum = 937;BA.debugLine="Sub CreateList(sid As String,module As Object) As";
 //BA.debugLineNum = 938;BA.debugLine="Dim el As VMList";
_el = new b4j.example.vmlist();
 //BA.debugLineNum = 939;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmlist*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 940;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 941;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _createlistitem(String _sid,Object _module) throws Exception{
b4j.example.vmlistitem _el = null;
 //BA.debugLineNum = 1587;BA.debugLine="Sub CreateListItem(sid As String, module As Object";
 //BA.debugLineNum = 1588;BA.debugLine="Dim el As VMListItem";
_el = new b4j.example.vmlistitem();
 //BA.debugLineNum = 1589;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 1590;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1591;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _createlistview(String _sid,Object _module) throws Exception{
b4j.example.vmlistview _el = null;
 //BA.debugLineNum = 943;BA.debugLine="Sub CreateListView(sid As String, module As Object";
 //BA.debugLineNum = 944;BA.debugLine="Dim el As VMListView";
_el = new b4j.example.vmlistview();
 //BA.debugLineNum = 945;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmlistview*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 946;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _createloader(String _sid,Object _module) throws Exception{
b4j.example.vmloader _el = null;
 //BA.debugLineNum = 1648;BA.debugLine="Sub CreateLoader(sid As String, module As Object)";
 //BA.debugLineNum = 1649;BA.debugLine="Dim el As VMLoader";
_el = new b4j.example.vmloader();
 //BA.debugLineNum = 1650;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmloader*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 1651;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1652;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _createmenu(String _sid,Object _module) throws Exception{
b4j.example.vmmenu _el = null;
 //BA.debugLineNum = 1526;BA.debugLine="Sub CreateMenu(sid As String, module As Object) As";
 //BA.debugLineNum = 1527;BA.debugLine="Dim el As VMMenu";
_el = new b4j.example.vmmenu();
 //BA.debugLineNum = 1528;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmmenu*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 1529;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1530;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _createmenuitem(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmmenuitem _el = null;
 //BA.debugLineNum = 1520;BA.debugLine="Sub CreateMenuItem(sid As String, eventHandler As";
 //BA.debugLineNum = 1521;BA.debugLine="Dim el As VMMenuItem";
_el = new b4j.example.vmmenuitem();
 //BA.debugLineNum = 1522;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmmenuitem*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1523;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1524;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createnumber(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminput _el = null;
 //BA.debugLineNum = 1457;BA.debugLine="Sub CreateNumber(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 1458;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
_el = _createinput(_sid,_eventhandler)._settypenumber /*b4j.example.vminput*/ (__c.True);
 //BA.debugLineNum = 1459;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1460;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _createnumberinput(String _sid) throws Exception{
b4j.example.vmnumberinput _el = null;
 //BA.debugLineNum = 234;BA.debugLine="Sub CreateNumberInput(sid As String) As VMNumberIn";
 //BA.debugLineNum = 235;BA.debugLine="Dim el As VMNumberInput";
_el = new b4j.example.vmnumberinput();
 //BA.debugLineNum = 236;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmnumberinput*/ (ba,_vue,_sid);
 //BA.debugLineNum = 237;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createol(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 588;BA.debugLine="Sub CreateOL(id As String) As VMElement";
 //BA.debugLineNum = 589;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 590;BA.debugLine="el.Initialize(Vue,id).SetTag(\"ol\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("ol");
 //BA.debugLineNum = 591;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createoption1(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1691;BA.debugLine="Sub CreateOPTION1(sid As String) As VMElement";
 //BA.debugLineNum = 1692;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1693;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"option\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("option");
 //BA.debugLineNum = 1694;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1695;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createp(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 595;BA.debugLine="Sub CreateP(id As String) As VMElement";
 //BA.debugLineNum = 596;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 597;BA.debugLine="el.Initialize(Vue, id).SetTag(\"p\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("p");
 //BA.debugLineNum = 598;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createpassword(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminput _el = null;
 //BA.debugLineNum = 1467;BA.debugLine="Sub CreatePassword(sid As String, eventHandler As";
 //BA.debugLineNum = 1468;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
_el = _createinput(_sid,_eventhandler)._settypepassword /*b4j.example.vminput*/ (__c.True);
 //BA.debugLineNum = 1469;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1470;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpdf  _createpdf(String _sid,String _url) throws Exception{
b4j.example.vmpdf _el = null;
 //BA.debugLineNum = 301;BA.debugLine="Sub CreatePDF(sid As String, url As String) As VMP";
 //BA.debugLineNum = 302;BA.debugLine="Dim el As VMPDF";
_el = new b4j.example.vmpdf();
 //BA.debugLineNum = 303;BA.debugLine="el.Initialize(Vue, sid, url)";
_el._initialize /*String*/ (ba,_vue,_sid,_url);
 //BA.debugLineNum = 304;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _createprettyprint(String _sid,String _lang) throws Exception{
b4j.example.vmprettyprint _el = null;
 //BA.debugLineNum = 260;BA.debugLine="Sub CreatePrettyPrint(sid As String, lang As Strin";
 //BA.debugLineNum = 261;BA.debugLine="Dim El As VMPrettyPrint";
_el = new b4j.example.vmprettyprint();
 //BA.debugLineNum = 262;BA.debugLine="El.Initialize(Vue, sid, lang)";
_el._initialize /*b4j.example.vmprettyprint*/ (ba,_vue,_sid,_lang);
 //BA.debugLineNum = 263;BA.debugLine="Return El";
if (true) return _el;
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _createprogress(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmprogress _el = null;
 //BA.debugLineNum = 102;BA.debugLine="Sub CreateProgress(sid As String, eventHandler As";
 //BA.debugLineNum = 103;BA.debugLine="Dim el As VMProgress";
_el = new b4j.example.vmprogress();
 //BA.debugLineNum = 104;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmprogress*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 105;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _createprogresscircle(String _sid,String _width,String _height) throws Exception{
b4j.example.vmprogresscircle _el = null;
 //BA.debugLineNum = 1130;BA.debugLine="Sub CreateProgressCircle(sid As String, Width As S";
 //BA.debugLineNum = 1131;BA.debugLine="Dim el As VMProgressCircle";
_el = new b4j.example.vmprogresscircle();
 //BA.debugLineNum = 1132;BA.debugLine="el.Initialize(Vue, sid, Width, Height)";
_el._initialize /*b4j.example.vmprogresscircle*/ (ba,_vue,_sid,_width,_height);
 //BA.debugLineNum = 1133;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprompt  _createprompt(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmprompt _el = null;
 //BA.debugLineNum = 1532;BA.debugLine="Sub CreatePrompt(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 1533;BA.debugLine="Dim el As VMPrompt";
_el = new b4j.example.vmprompt();
 //BA.debugLineNum = 1534;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmprompt*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1535;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1536;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _createproperty(Object _module,String _sid) throws Exception{
b4j.example.vmproperty _el = null;
 //BA.debugLineNum = 1550;BA.debugLine="Sub CreateProperty(module As Object, sid As String";
 //BA.debugLineNum = 1551;BA.debugLine="Dim el As VMProperty";
_el = new b4j.example.vmproperty();
 //BA.debugLineNum = 1552;BA.debugLine="el.Initialize(Vue, module, sid)";
_el._initialize /*b4j.example.vmproperty*/ (ba,_vue,_module,_sid);
 //BA.debugLineNum = 1553;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _createradio(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmradio _el = null;
 //BA.debugLineNum = 1575;BA.debugLine="Sub CreateRadio(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 1576;BA.debugLine="Dim el As VMRadio";
_el = new b4j.example.vmradio();
 //BA.debugLineNum = 1577;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmradio*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1578;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _createradiogroup(String _sid,String _scaption,Object _eventhandler) throws Exception{
b4j.example.vmradiogroup _el = null;
 //BA.debugLineNum = 1630;BA.debugLine="Sub CreateRadioGroup(sid As String, sCaption As St";
 //BA.debugLineNum = 1631;BA.debugLine="Dim el As VMRadioGroup";
_el = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 1632;BA.debugLine="el.Initialize(Vue, sid, sCaption, eventHandler)";
_el._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,_sid,_scaption,_eventhandler);
 //BA.debugLineNum = 1633;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createrouterlink(String _rid,String _text) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 545;BA.debugLine="Sub CreateRouterLink(rID As String, Text As String";
 //BA.debugLineNum = 546;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 547;BA.debugLine="el.Initialize(Vue,rID).SetTag(\"router-link\").SetT";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_rid)._settag /*b4j.example.vmelement*/ ("router-link")._settext /*b4j.example.vmelement*/ (_text);
 //BA.debugLineNum = 548;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createrouterview(String _rid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 551;BA.debugLine="Sub CreateRouterView(rID As String) As VMElement";
 //BA.debugLineNum = 552;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 553;BA.debugLine="el.Initialize(Vue,rID).SetTag(\"router-view\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_rid)._settag /*b4j.example.vmelement*/ ("router-view");
 //BA.debugLineNum = 554;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _createrow(String _sid) throws Exception{
b4j.example.vmrow _el = null;
 //BA.debugLineNum = 1484;BA.debugLine="Sub CreateRow(sid As String) As VMRow";
 //BA.debugLineNum = 1485;BA.debugLine="Dim el As VMRow";
_el = new b4j.example.vmrow();
 //BA.debugLineNum = 1486;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmrow*/ (ba,_vue,_sid);
 //BA.debugLineNum = 1487;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1488;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _createselect(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 1677;BA.debugLine="Sub CreateSelect(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 1678;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
 //BA.debugLineNum = 1679;BA.debugLine="el.Initialize(Vue,sid,eventHandler)";
_el._initialize /*b4j.example.vmselect*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1680;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1681;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createselect1(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1684;BA.debugLine="Sub CreateSELECT1(sid As String) As VMElement";
 //BA.debugLineNum = 1685;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1686;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"select\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("select");
 //BA.debugLineNum = 1687;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1688;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _createslider(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmslider _el = null;
 //BA.debugLineNum = 843;BA.debugLine="Sub CreateSlider(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 844;BA.debugLine="Dim el As VMSlider";
_el = new b4j.example.vmslider();
 //BA.debugLineNum = 845;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmslider*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 846;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _createsnackbar(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmsnackbar _el = null;
 //BA.debugLineNum = 1398;BA.debugLine="Sub CreateSnackBar(sid As String, eventHandler As";
 //BA.debugLineNum = 1399;BA.debugLine="Dim el As VMSnackbar";
_el = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 1400;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmsnackbar*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1401;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createspan(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1599;BA.debugLine="Sub CreateSpan(sid As String) As VMElement";
 //BA.debugLineNum = 1600;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1601;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"span\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 1602;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _createspeeddial(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmspeeddial _el = null;
 //BA.debugLineNum = 1508;BA.debugLine="Sub CreateSpeedDial(sid As String, eventHandler As";
 //BA.debugLineNum = 1509;BA.debugLine="Dim el As VMSpeedDial";
_el = new b4j.example.vmspeeddial();
 //BA.debugLineNum = 1510;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmspeeddial*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1511;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _createspinner(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmspinner _el = null;
 //BA.debugLineNum = 96;BA.debugLine="Sub CreateSpinner(sid As String, eventHandler As O";
 //BA.debugLineNum = 97;BA.debugLine="Dim el As VMSpinner";
_el = new b4j.example.vmspinner();
 //BA.debugLineNum = 98;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmspinner*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 99;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _createstepperitem(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmstepitem _el = null;
 //BA.debugLineNum = 920;BA.debugLine="Sub CreateStepperItem(sid As String, eventHandler";
 //BA.debugLineNum = 921;BA.debugLine="Dim el As VMStepItem";
_el = new b4j.example.vmstepitem();
 //BA.debugLineNum = 922;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmstepitem*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 923;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _createsteppers(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmsteppers _el = null;
 //BA.debugLineNum = 926;BA.debugLine="Sub CreateSteppers(sid As String, eventHandler As";
 //BA.debugLineNum = 927;BA.debugLine="Dim el As VMSteppers";
_el = new b4j.example.vmsteppers();
 //BA.debugLineNum = 928;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmsteppers*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 929;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 930;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createsubhead(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 985;BA.debugLine="Sub CreateSubHead(sid As String) As VMElement";
 //BA.debugLineNum = 986;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 987;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetSubHead";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setsubhead /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 988;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 989;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createsubheader(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1514;BA.debugLine="Sub CreateSubHeader(sid As String) As VMElement";
 //BA.debugLineNum = 1515;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1516;BA.debugLine="el.Initialize(Vue, sid).SetTagSubHeader(True)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settagsubheader /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 1517;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1518;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createsubheading(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 979;BA.debugLine="Sub CreateSubHeading(sid As String) As VMElement";
 //BA.debugLineNum = 980;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 981;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetSubHead";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_sid)._settag /*b4j.example.vmelement*/ ("span")._setsubheading /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 982;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 983;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _createswitch(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmswitch _el = null;
 //BA.debugLineNum = 879;BA.debugLine="Sub CreateSwitch(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 880;BA.debugLine="Dim el As VMSwitch";
_el = new b4j.example.vmswitch();
 //BA.debugLineNum = 881;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmswitch*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 882;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _createtable(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtable _el = null;
 //BA.debugLineNum = 90;BA.debugLine="Sub CreateTable(sid As String, eventHandler As Obj";
 //BA.debugLineNum = 91;BA.debugLine="Dim el As VMTable";
_el = new b4j.example.vmtable();
 //BA.debugLineNum = 92;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtable*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 93;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _createtabs(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtabs _el = null;
 //BA.debugLineNum = 867;BA.debugLine="Sub CreateTabs(sid As String, eventHandler As Obje";
 //BA.debugLineNum = 868;BA.debugLine="Dim el As VMTabs";
_el = new b4j.example.vmtabs();
 //BA.debugLineNum = 869;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtabs*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 870;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 871;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _createtabsitem(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtabsitem _el = null;
 //BA.debugLineNum = 861;BA.debugLine="Sub CreateTabsItem(sid As String, eventHandler As";
 //BA.debugLineNum = 862;BA.debugLine="Dim el As VMTabsItem";
_el = new b4j.example.vmtabsitem();
 //BA.debugLineNum = 863;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtabsitem*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 864;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtag(String _id,String _tag) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 563;BA.debugLine="Sub CreateTag(id As String, tag As String) As VMEl";
 //BA.debugLineNum = 564;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 565;BA.debugLine="el.Initialize(Vue,id).SetTag(tag)";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ (_tag);
 //BA.debugLineNum = 566;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createtel(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminput _el = null;
 //BA.debugLineNum = 1472;BA.debugLine="Sub CreateTel(sid As String, eventHandler As Objec";
 //BA.debugLineNum = 1473;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
_el = _createinput(_sid,_eventhandler)._settypetel /*b4j.example.vminput*/ (__c.True);
 //BA.debugLineNum = 1474;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _createtextarea(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtextarea _el = null;
 //BA.debugLineNum = 1438;BA.debugLine="Sub CreateTextArea(sid As String, eventHandler As";
 //BA.debugLineNum = 1439;BA.debugLine="Dim el As VMTextArea";
_el = new b4j.example.vmtextarea();
 //BA.debugLineNum = 1440;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmtextarea*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1441;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1442;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtextarea1(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 628;BA.debugLine="Sub CreateTEXTAREA1(id As String) As VMElement";
 //BA.debugLineNum = 629;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 630;BA.debugLine="el.Initialize(Vue, id).SetTag(\"textarea\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("textarea");
 //BA.debugLineNum = 631;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 632;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _createtimepicker(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtimepicker _el = null;
 //BA.debugLineNum = 313;BA.debugLine="Sub CreateTimePicker(sid As String, eventHandler A";
 //BA.debugLineNum = 314;BA.debugLine="Dim el As VMTimePicker";
_el = new b4j.example.vmtimepicker();
 //BA.debugLineNum = 315;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtimepicker*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 316;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _createtoolbar(String _sid,Object _module) throws Exception{
b4j.example.vmtoolbar _el = null;
 //BA.debugLineNum = 1642;BA.debugLine="Sub CreateToolbar(sid As String, module As Object)";
 //BA.debugLineNum = 1643;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
 //BA.debugLineNum = 1644;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,_sid,_module);
 //BA.debugLineNum = 1645;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1646;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _createtree(Object _module,String _sid,String _prikey) throws Exception{
b4j.example.vmtree _el = null;
 //BA.debugLineNum = 1556;BA.debugLine="Sub CreateTree(module As Object, sid As String, pr";
 //BA.debugLineNum = 1557;BA.debugLine="Dim el As VMTree";
_el = new b4j.example.vmtree();
 //BA.debugLineNum = 1558;BA.debugLine="el.Initialize(Vue, module, sid, priKey)";
_el._initialize /*b4j.example.vmtree*/ (ba,_vue,_module,_sid,_prikey);
 //BA.debugLineNum = 1559;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1560;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createul(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 575;BA.debugLine="Sub CreateUL(id As String) As VMElement";
 //BA.debugLineNum = 576;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 577;BA.debugLine="el.Initialize(Vue,id).SetTag(\"ul\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("ul");
 //BA.debugLineNum = 578;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _createvuecal(String _sid,Object _eventhandler,String _width,String _height) throws Exception{
b4j.example.vmvuecal _el = null;
 //BA.debugLineNum = 873;BA.debugLine="Sub CreateVueCal(sid As String, eventHandler As Ob";
 //BA.debugLineNum = 874;BA.debugLine="Dim el As VMVueCal";
_el = new b4j.example.vmvuecal();
 //BA.debugLineNum = 875;BA.debugLine="el.Initialize(Vue, sid, eventHandler, width, heig";
_el._initialize /*b4j.example.vmvuecal*/ (ba,_vue,_sid,_eventhandler,_width,_height);
 //BA.debugLineNum = 876;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _createwaterball(String _sid,Object _eventhandler,String _width,String _height) throws Exception{
b4j.example.vmwaterball _el = null;
 //BA.debugLineNum = 1124;BA.debugLine="Sub CreateWaterBall(sid As String, eventHandler As";
 //BA.debugLineNum = 1125;BA.debugLine="Dim el As VMWaterBall";
_el = new b4j.example.vmwaterball();
 //BA.debugLineNum = 1126;BA.debugLine="el.Initialize(Vue, sid, eventHandler, Width, Heig";
_el._initialize /*b4j.example.vmwaterball*/ (ba,_vue,_sid,_eventhandler,_width,_height);
 //BA.debugLineNum = 1127;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1128;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 326;BA.debugLine="Return Vue.CStr(o)";
if (true) return _vue._cstr /*String*/ (_o);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public String  _date2yyyymmdd(Object _value) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub Date2YYYYMMDD(value As Object) As String";
 //BA.debugLineNum = 191;BA.debugLine="Return Vue.Date2YYYYMMDD(value)";
if (true) return _vue._date2yyyymmdd /*String*/ (_value);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _dateadd(String _mdate,int _howmanydays) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
 //BA.debugLineNum = 199;BA.debugLine="Return Vue.DateAdd(mDate, HowManyDays)";
if (true) return _vue._dateadd /*String*/ (_mdate,_howmanydays);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public int  _datediff(String _currentdate,String _otherdate) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub DateDiff(CurrentDate As String, OtherDate As S";
 //BA.debugLineNum = 207;BA.debugLine="Return Vue.DateDiff(CurrentDate, OtherDate)";
if (true) return _vue._datediff /*int*/ (_currentdate,_otherdate);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return 0;
}
public String  _datenow() throws Exception{
 //BA.debugLineNum = 1697;BA.debugLine="Public Sub DateNow() As String";
 //BA.debugLineNum = 1698;BA.debugLine="Return Vue.DateNow";
if (true) return _vue._datenow /*String*/ ();
 //BA.debugLineNum = 1699;BA.debugLine="End Sub";
return "";
}
public String  _datetimenow() throws Exception{
 //BA.debugLineNum = 1702;BA.debugLine="Public Sub DateTimeNow() As String";
 //BA.debugLineNum = 1703;BA.debugLine="Return Vue.DateTimeNow";
if (true) return _vue._datetimenow /*String*/ ();
 //BA.debugLineNum = 1704;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _decrementbadge(String _elid,int _counted) throws Exception{
String _badvalue = "";
String _lastvalue = "";
int _intlast = 0;
 //BA.debugLineNum = 499;BA.debugLine="Sub DecrementBadge(elID As String, counted As Int)";
 //BA.debugLineNum = 500;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 501;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgevalue");
 //BA.debugLineNum = 502;BA.debugLine="Dim lastValue As String = Vue.GetState(badValue,";
_lastvalue = BA.ObjectToString(_vue._getstate /*Object*/ (_badvalue,(Object)("0")));
 //BA.debugLineNum = 503;BA.debugLine="Dim intLast As Int = BANano.parseInt(lastValue)";
_intlast = _banano.parseInt((Object)(_lastvalue));
 //BA.debugLineNum = 504;BA.debugLine="intLast = intLast - counted";
_intlast = (int) (_intlast-_counted);
 //BA.debugLineNum = 505;BA.debugLine="Vue.SetStateSingle(badValue, intLast)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_intlast));
 //BA.debugLineNum = 506;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 507;BA.debugLine="End Sub";
return null;
}
public String  _disable(String _elid) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub Disable(elID As String)";
 //BA.debugLineNum = 164;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 165;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.True));
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _enable(String _elid) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub Enable(elID As String)";
 //BA.debugLineNum = 159;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 160;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.False));
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub EQOperators(sm As Map) As List";
 //BA.debugLineNum = 247;BA.debugLine="Return Vue.EQOperators(sm)";
if (true) return _vue._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (_sm);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _extractmap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 252;BA.debugLine="Return ExtractMap(source, keys)";
if (true) return _extractmap(_source,_keys);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public String  _fixrecords(anywheresoftware.b4a.objects.collections.List _recs,anywheresoftware.b4a.objects.collections.List _trimthese,anywheresoftware.b4a.objects.collections.List _numthese,anywheresoftware.b4a.objects.collections.List _boolthese,anywheresoftware.b4a.objects.collections.List _datethese,anywheresoftware.b4a.objects.collections.List _dblthese) throws Exception{
 //BA.debugLineNum = 1065;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
 //BA.debugLineNum = 1066;BA.debugLine="Vue.FixRecords(recs, trimThese, numThese, boolThe";
_vue._fixrecords /*String*/ (_recs,_trimthese,_numthese,_boolthese,_datethese,_dblthese);
 //BA.debugLineNum = 1067;BA.debugLine="End Sub";
return "";
}
public String  _fixrecordsusedesign(anywheresoftware.b4a.objects.collections.List _recs,b4j.example.vmcontainer _design) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub FixRecordsUseDesign(recs As List, design As VM";
 //BA.debugLineNum = 76;BA.debugLine="Vue.FixRecords(recs, design.Strings, design.Integ";
_vue._fixrecords /*String*/ (_recs,_design._strings /*anywheresoftware.b4a.objects.collections.List*/ ,_design._integers /*anywheresoftware.b4a.objects.collections.List*/ ,_design._booleans /*anywheresoftware.b4a.objects.collections.List*/ ,_design._dates /*anywheresoftware.b4a.objects.collections.List*/ ,_design._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _forceupdate() throws Exception{
 //BA.debugLineNum = 839;BA.debugLine="Sub ForceUpdate";
 //BA.debugLineNum = 840;BA.debugLine="Vue.ForceUpdate";
_vue._forceupdate /*String*/ ();
 //BA.debugLineNum = 841;BA.debugLine="End Sub";
return "";
}
public String  _getalert() throws Exception{
 //BA.debugLineNum = 1409;BA.debugLine="Sub GetAlert As String";
 //BA.debugLineNum = 1410;BA.debugLine="Return Vue.getstate(\"alertkey\",\"\")";
if (true) return BA.ObjectToString(_vue._getstate /*Object*/ ("alertkey",(Object)("")));
 //BA.debugLineNum = 1411;BA.debugLine="End Sub";
return "";
}
public String  _getalphabets(String _value) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
 //BA.debugLineNum = 227;BA.debugLine="Return Vue.GetAlphabets(value)";
if (true) return _vue._getalphabets /*String*/ (_value);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _getchipidfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.List _spath = null;
anywheresoftware.b4a.objects.collections.Map _sitem = null;
String _sid = "";
 //BA.debugLineNum = 510;BA.debugLine="Sub GetChipIDFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 511;BA.debugLine="Try";
try { //BA.debugLineNum = 512;BA.debugLine="Dim spath As List = e.OtherField(\"path\").Result";
_spath = new anywheresoftware.b4a.objects.collections.List();
_spath.setObject((java.util.List)(_e.OtherField("path").Result()));
 //BA.debugLineNum = 513;BA.debugLine="Dim sitem As Map = spath.get(5)";
_sitem = new anywheresoftware.b4a.objects.collections.Map();
_sitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_spath.Get((int) (5))));
 //BA.debugLineNum = 514;BA.debugLine="Dim sid As String = sitem.get(\"id\")";
_sid = BA.ObjectToString(_sitem.Get((Object)("id")));
 //BA.debugLineNum = 515;BA.debugLine="Return sid";
if (true) return _sid;
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 517;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 518;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return "";
}
public String  _getconfirm() throws Exception{
 //BA.debugLineNum = 1404;BA.debugLine="Sub GetConfirm As String";
 //BA.debugLineNum = 1405;BA.debugLine="Return Vue.getstate(\"confirmkey\",\"\")";
if (true) return BA.ObjectToString(_vue._getstate /*Object*/ ("confirmkey",(Object)("")));
 //BA.debugLineNum = 1406;BA.debugLine="End Sub";
return "";
}
public boolean  _getdisabledstate(String _k) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 1031;BA.debugLine="Sub GetDisabledState(k As String) As Boolean";
 //BA.debugLineNum = 1032;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 1033;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_diskey,(Object)(__c.False)));
 //BA.debugLineNum = 1034;BA.debugLine="End Sub";
return false;
}
public String  _geteventtargetproperty(com.ab.banano.BANanoEvent _e,String _prop) throws Exception{
 //BA.debugLineNum = 786;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
 //BA.debugLineNum = 787;BA.debugLine="Return Vue.GetEventTargetProperty(e, prop)";
if (true) return _vue._geteventtargetproperty /*String*/ (_e,_prop);
 //BA.debugLineNum = 788;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue._fileobject  _getfiledetails(anywheresoftware.b4a.objects.collections.Map _fileobj) throws Exception{
 //BA.debugLineNum = 1722;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
 //BA.debugLineNum = 1723;BA.debugLine="Return Vue.GetFileDetails(fileObj)";
if (true) return _vue._getfiledetails /*b4j.example.bananovue._fileobject*/ (_fileobj);
 //BA.debugLineNum = 1724;BA.debugLine="End Sub";
return null;
}
public String  _getidfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 777;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 778;BA.debugLine="Return Vue.GetIDFromEvent(e)";
if (true) return _vue._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return "";
}
public String  _getkeyfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 781;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 782;BA.debugLine="Return Vue.GetKeyFromEvent(e)";
if (true) return _vue._getkeyfromevent /*String*/ (_e);
 //BA.debugLineNum = 783;BA.debugLine="End Sub";
return "";
}
public String  _getprompt() throws Exception{
String _ss = "";
 //BA.debugLineNum = 1306;BA.debugLine="Sub GetPrompt As String";
 //BA.debugLineNum = 1307;BA.debugLine="Dim ss As String = Vue.GetState(\"promptvalue\",\"\")";
_ss = BA.ObjectToString(_vue._getstate /*Object*/ ("promptvalue",(Object)("")));
 //BA.debugLineNum = 1308;BA.debugLine="Return ss";
if (true) return _ss;
 //BA.debugLineNum = 1309;BA.debugLine="End Sub";
return "";
}
public boolean  _getrequiredstate(String _k) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 1036;BA.debugLine="Sub GetRequiredState(k As String) As Boolean";
 //BA.debugLineNum = 1037;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
 //BA.debugLineNum = 1038;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_diskey,(Object)(__c.False)));
 //BA.debugLineNum = 1039;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowstate(String _k) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 1026;BA.debugLine="Sub GetShowState(k As String) As Boolean";
 //BA.debugLineNum = 1027;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 1028;BA.debugLine="Return GetState(showKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_showkey,(Object)(__c.False)));
 //BA.debugLineNum = 1029;BA.debugLine="End Sub";
return false;
}
public Object  _getstate(String _k,Object _default) throws Exception{
Object _res = null;
 //BA.debugLineNum = 827;BA.debugLine="Sub GetState(k As String, default As Object) As Ob";
 //BA.debugLineNum = 828;BA.debugLine="Dim res As Object = Vue.GetState(k, default)";
_res = _vue._getstate /*Object*/ (_k,_default);
 //BA.debugLineNum = 829;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 830;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 684;BA.debugLine="Sub GetStates(lst As List) As Map";
 //BA.debugLineNum = 685;BA.debugLine="Return Vue.GetStates(lst)";
if (true) return _vue._getstates /*anywheresoftware.b4a.objects.collections.Map*/ (_lst);
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(String _k) throws Exception{
 //BA.debugLineNum = 679;BA.debugLine="Sub HasState(k As String) As Boolean";
 //BA.debugLineNum = 680;BA.debugLine="Return Vue.HasState(k)";
if (true) return _vue._hasstate /*boolean*/ (_k);
 //BA.debugLineNum = 681;BA.debugLine="End Sub";
return false;
}
public String  _hide(String _elid) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Hide(elID As String)";
 //BA.debugLineNum = 174;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 175;BA.debugLine="Vue.SetStateSingle($\"${elID}show\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.False));
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public String  _hidedialog(String _did) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub HideDialog(dID As String)";
 //BA.debugLineNum = 144;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 145;BA.debugLine="SetStateFalse(dID)";
_setstatefalse(_did);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _hideerror(String _elid) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub HideError(elID As String)";
 //BA.debugLineNum = 187;BA.debugLine="Vue.SetStateSingle($\"${elID}error\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.False));
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _hideitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
String _item = "";
 //BA.debugLineNum = 710;BA.debugLine="Sub HideItems(items As List)";
 //BA.debugLineNum = 711;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 712;BA.debugLine="Vue.SetStateSingle(item, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_item,(Object)(__c.False));
 }
};
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return "";
}
public String  _hr() throws Exception{
 //BA.debugLineNum = 541;BA.debugLine="Sub HR As String";
 //BA.debugLineNum = 542;BA.debugLine="Return \"<hr>\"";
if (true) return "<hr>";
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return "";
}
public String  _httpupload(Object _fileobj,Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1718;BA.debugLine="Sub HTTPUpload(fileObj As Object, module As Object";
 //BA.debugLineNum = 1719;BA.debugLine="Vue.HTTPUpload(fileObj, module, methodname)";
_vue._httpupload /*String*/ (_fileobj,_module,_methodname);
 //BA.debugLineNum = 1720;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _incrementbadge(String _elid,int _counted) throws Exception{
String _badvalue = "";
String _lastvalue = "";
int _intlast = 0;
 //BA.debugLineNum = 489;BA.debugLine="Sub IncrementBadge(elID As String, counted As Int)";
 //BA.debugLineNum = 490;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 491;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgevalue");
 //BA.debugLineNum = 492;BA.debugLine="Dim lastValue As String = Vue.GetState(badValue,";
_lastvalue = BA.ObjectToString(_vue._getstate /*Object*/ (_badvalue,(Object)("0")));
 //BA.debugLineNum = 493;BA.debugLine="Dim intLast As Int = BANano.parseInt(lastValue)";
_intlast = _banano.parseInt((Object)(_lastvalue));
 //BA.debugLineNum = 494;BA.debugLine="intLast = intLast + counted";
_intlast = (int) (_intlast+_counted);
 //BA.debugLineNum = 495;BA.debugLine="Vue.SetStateSingle(badValue, intLast)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_intlast));
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public String  _initcolors() throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="private Sub InitColors";
 //BA.debugLineNum = 345;BA.debugLine="IntensityOptions.Initialize";
_intensityoptions.Initialize();
 //BA.debugLineNum = 346;BA.debugLine="IntensityOptions.put(\"\",\"Normal\")";
_intensityoptions.Put((Object)(""),(Object)("Normal"));
 //BA.debugLineNum = 347;BA.debugLine="IntensityOptions.put(\"lighten-1\",\"Lighten 1\")";
_intensityoptions.Put((Object)("lighten-1"),(Object)("Lighten 1"));
 //BA.debugLineNum = 348;BA.debugLine="IntensityOptions.put(\"lighten-2\",\"Lighten 2\")";
_intensityoptions.Put((Object)("lighten-2"),(Object)("Lighten 2"));
 //BA.debugLineNum = 349;BA.debugLine="IntensityOptions.put(\"lighten-3\",\"Lighten 3\")";
_intensityoptions.Put((Object)("lighten-3"),(Object)("Lighten 3"));
 //BA.debugLineNum = 350;BA.debugLine="IntensityOptions.put(\"lighten-4\",\"Lighten 4\")";
_intensityoptions.Put((Object)("lighten-4"),(Object)("Lighten 4"));
 //BA.debugLineNum = 351;BA.debugLine="IntensityOptions.put(\"lighten-5\",\"Lighten 5\")";
_intensityoptions.Put((Object)("lighten-5"),(Object)("Lighten 5"));
 //BA.debugLineNum = 352;BA.debugLine="IntensityOptions.put(\"darken-1\",\"Darken 1\")";
_intensityoptions.Put((Object)("darken-1"),(Object)("Darken 1"));
 //BA.debugLineNum = 353;BA.debugLine="IntensityOptions.put(\"darken-2\",\"Darken 2\")";
_intensityoptions.Put((Object)("darken-2"),(Object)("Darken 2"));
 //BA.debugLineNum = 354;BA.debugLine="IntensityOptions.put(\"darken-3\",\"Darken 3\")";
_intensityoptions.Put((Object)("darken-3"),(Object)("Darken 3"));
 //BA.debugLineNum = 355;BA.debugLine="IntensityOptions.put(\"darken-4\",\"Darken 4\")";
_intensityoptions.Put((Object)("darken-4"),(Object)("Darken 4"));
 //BA.debugLineNum = 356;BA.debugLine="IntensityOptions.put(\"accent-1\",\"Accent 1\")";
_intensityoptions.Put((Object)("accent-1"),(Object)("Accent 1"));
 //BA.debugLineNum = 357;BA.debugLine="IntensityOptions.put(\"accent-2\",\"Accent 2\")";
_intensityoptions.Put((Object)("accent-2"),(Object)("Accent 2"));
 //BA.debugLineNum = 358;BA.debugLine="IntensityOptions.put(\"accent-3\",\"Accent 3\")";
_intensityoptions.Put((Object)("accent-3"),(Object)("Accent 3"));
 //BA.debugLineNum = 359;BA.debugLine="IntensityOptions.put(\"accent-4\",\"Accent 4\")";
_intensityoptions.Put((Object)("accent-4"),(Object)("Accent 4"));
 //BA.debugLineNum = 361;BA.debugLine="ColorOptions.Initialize";
_coloroptions.Initialize();
 //BA.debugLineNum = 362;BA.debugLine="ColorOptions.Put(\"amber\",\"Amber\")";
_coloroptions.Put((Object)("amber"),(Object)("Amber"));
 //BA.debugLineNum = 363;BA.debugLine="ColorOptions.Put(\"black\",\"Black\")";
_coloroptions.Put((Object)("black"),(Object)("Black"));
 //BA.debugLineNum = 364;BA.debugLine="ColorOptions.Put(\"blue\",\"Blue\")";
_coloroptions.Put((Object)("blue"),(Object)("Blue"));
 //BA.debugLineNum = 365;BA.debugLine="ColorOptions.Put(\"blue-grey\",\"Blue Grey\")";
_coloroptions.Put((Object)("blue-grey"),(Object)("Blue Grey"));
 //BA.debugLineNum = 366;BA.debugLine="ColorOptions.Put(\"brown\",\"Brown\")";
_coloroptions.Put((Object)("brown"),(Object)("Brown"));
 //BA.debugLineNum = 367;BA.debugLine="ColorOptions.Put(\"cyan\",\"Cyan\")";
_coloroptions.Put((Object)("cyan"),(Object)("Cyan"));
 //BA.debugLineNum = 368;BA.debugLine="ColorOptions.Put(\"deep-orange\",\"Deep Orange\")";
_coloroptions.Put((Object)("deep-orange"),(Object)("Deep Orange"));
 //BA.debugLineNum = 369;BA.debugLine="ColorOptions.Put(\"deep-purple\",\"Deep Purple\")";
_coloroptions.Put((Object)("deep-purple"),(Object)("Deep Purple"));
 //BA.debugLineNum = 370;BA.debugLine="ColorOptions.Put(\"green\",\"Green\")";
_coloroptions.Put((Object)("green"),(Object)("Green"));
 //BA.debugLineNum = 371;BA.debugLine="ColorOptions.Put(\"grey\",\"Grey\")";
_coloroptions.Put((Object)("grey"),(Object)("Grey"));
 //BA.debugLineNum = 372;BA.debugLine="ColorOptions.Put(\"indigo\",\"Indigo\")";
_coloroptions.Put((Object)("indigo"),(Object)("Indigo"));
 //BA.debugLineNum = 373;BA.debugLine="ColorOptions.Put(\"light-blue\",\"Light Blue\")";
_coloroptions.Put((Object)("light-blue"),(Object)("Light Blue"));
 //BA.debugLineNum = 374;BA.debugLine="ColorOptions.Put(\"light-green\", \"Light Green\")";
_coloroptions.Put((Object)("light-green"),(Object)("Light Green"));
 //BA.debugLineNum = 375;BA.debugLine="ColorOptions.Put(\"lime\", \"Lime\")";
_coloroptions.Put((Object)("lime"),(Object)("Lime"));
 //BA.debugLineNum = 376;BA.debugLine="ColorOptions.Put(\"orange\", \"Orange\")";
_coloroptions.Put((Object)("orange"),(Object)("Orange"));
 //BA.debugLineNum = 377;BA.debugLine="ColorOptions.Put(\"pink\", \"Pink\")";
_coloroptions.Put((Object)("pink"),(Object)("Pink"));
 //BA.debugLineNum = 378;BA.debugLine="ColorOptions.Put(\"purple\", \"Purple\")";
_coloroptions.Put((Object)("purple"),(Object)("Purple"));
 //BA.debugLineNum = 379;BA.debugLine="ColorOptions.Put(\"red\", \"Red\")";
_coloroptions.Put((Object)("red"),(Object)("Red"));
 //BA.debugLineNum = 380;BA.debugLine="ColorOptions.Put(\"teal\", \"Teal\")";
_coloroptions.Put((Object)("teal"),(Object)("Teal"));
 //BA.debugLineNum = 381;BA.debugLine="ColorOptions.Put(\"transparent\", \"Transparent\")";
_coloroptions.Put((Object)("transparent"),(Object)("Transparent"));
 //BA.debugLineNum = 382;BA.debugLine="ColorOptions.Put(\"white\", \"White\")";
_coloroptions.Put((Object)("white"),(Object)("White"));
 //BA.debugLineNum = 383;BA.debugLine="ColorOptions.Put(\"yellow\", \"Yellow\")";
_coloroptions.Put((Object)("yellow"),(Object)("Yellow"));
 //BA.debugLineNum = 385;BA.debugLine="BorderOptions.Initialize";
_borderoptions.Initialize();
 //BA.debugLineNum = 386;BA.debugLine="BorderOptions.Put(\"dashed\", \"Dashed\")";
_borderoptions.Put((Object)("dashed"),(Object)("Dashed"));
 //BA.debugLineNum = 387;BA.debugLine="BorderOptions.Put(\"dotted\", \"Dotted\")";
_borderoptions.Put((Object)("dotted"),(Object)("Dotted"));
 //BA.debugLineNum = 388;BA.debugLine="BorderOptions.Put(\"double\", \"Double\")";
_borderoptions.Put((Object)("double"),(Object)("Double"));
 //BA.debugLineNum = 389;BA.debugLine="BorderOptions.Put(\"groove\", \"Groove\")";
_borderoptions.Put((Object)("groove"),(Object)("Groove"));
 //BA.debugLineNum = 390;BA.debugLine="BorderOptions.Put(\"hidden\", \"Hidden\")";
_borderoptions.Put((Object)("hidden"),(Object)("Hidden"));
 //BA.debugLineNum = 391;BA.debugLine="BorderOptions.Put(\"inset\", \"Inset\")";
_borderoptions.Put((Object)("inset"),(Object)("Inset"));
 //BA.debugLineNum = 392;BA.debugLine="BorderOptions.Put(\"none\", \"None\")";
_borderoptions.Put((Object)("none"),(Object)("None"));
 //BA.debugLineNum = 393;BA.debugLine="BorderOptions.Put(\"outset\", \"Outset\")";
_borderoptions.Put((Object)("outset"),(Object)("Outset"));
 //BA.debugLineNum = 394;BA.debugLine="BorderOptions.Put(\"ridge\", \"Ridge\")";
_borderoptions.Put((Object)("ridge"),(Object)("Ridge"));
 //BA.debugLineNum = 395;BA.debugLine="BorderOptions.Put(\"solid\", \"Solid\")";
_borderoptions.Put((Object)("solid"),(Object)("Solid"));
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _module,String _sappname) throws Exception{
innerInitialize(_ba);
int _e = 0;
 //BA.debugLineNum = 1215;BA.debugLine="Public Sub Initialize(module As Object, sAppName A";
 //BA.debugLineNum = 1216;BA.debugLine="Pages.initialize";
_pages.Initialize();
 //BA.debugLineNum = 1217;BA.debugLine="Vue.Initialize()";
_vue._initialize /*String*/ (ba);
 //BA.debugLineNum = 1218;BA.debugLine="Themes.Initialize";
_themes.Initialize();
 //BA.debugLineNum = 1219;BA.debugLine="SetNeeds";
_setneeds();
 //BA.debugLineNum = 1220;BA.debugLine="JQuery = Vue.jquery";
_jquery = _vue._jquery /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 1221;BA.debugLine="VM.Initialize(\"VueMaterial\")";
_vm.Initialize((Object)("VueMaterial"));
 //BA.debugLineNum = 1222;BA.debugLine="VueCal.Initialize(\"vuecal\")";
_vuecal.Initialize((Object)("vuecal"));
 //BA.debugLineNum = 1223;BA.debugLine="VueLoading.initialize(\"VueLoading\")";
_vueloading.Initialize((Object)("VueLoading"));
 //BA.debugLineNum = 1224;BA.debugLine="VMDef = VM.GetField(\"default\")";
_vmdef = _vm.GetField("default");
 //BA.debugLineNum = 1225;BA.debugLine="Chartkick.initialize(\"Chartkick\")";
_chartkick.Initialize((Object)("Chartkick"));
 //BA.debugLineNum = 1226;BA.debugLine="Chart.Initialize(\"Chart\")";
_chart.Initialize((Object)("Chart"));
 //BA.debugLineNum = 1227;BA.debugLine="Vue.Use(Chartkick.RunMethod(\"use\", Chart))";
_vue._use /*String*/ (_chartkick.RunMethod("use",(Object)(_chart.getObject())));
 //BA.debugLineNum = 1228;BA.debugLine="Vue.Use(VMDef)";
_vue._use /*String*/ (_vmdef);
 //BA.debugLineNum = 1229;BA.debugLine="Vue.Use(VueLoading)";
_vue._use /*String*/ (_vueloading);
 //BA.debugLineNum = 1230;BA.debugLine="Vue.AddComponentBO(\"loading\",VueLoading)";
_vue._addcomponentbo /*b4j.example.bananovue*/ ("loading",_vueloading);
 //BA.debugLineNum = 1231;BA.debugLine="Vue.AddComponentBO(\"vue-cal\", VueCal)";
_vue._addcomponentbo /*b4j.example.bananovue*/ ("vue-cal",_vuecal);
 //BA.debugLineNum = 1232;BA.debugLine="App = CreateApp(\"\")";
_app = _createapp("");
 //BA.debugLineNum = 1233;BA.debugLine="Vue.SetStateSingle(\"navbarmode\", Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("navbarmode",__c.Null);
 //BA.debugLineNum = 1234;BA.debugLine="App.SetAttr1(\":md-mode\", \"navbarmode\")";
_app._setattr1 /*b4j.example.vmelement*/ (":md-mode",(Object)("navbarmode"));
 //BA.debugLineNum = 1235;BA.debugLine="Vue.SetState(CreateMap(\"navbartitle\":sAppName))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("navbartitle"),(Object)(_sappname)}));
 //BA.debugLineNum = 1236;BA.debugLine="Vue.SetState(CreateMap(\"drawertblbartitle\":sAppNa";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("drawertblbartitle"),(Object)(_sappname)}));
 //BA.debugLineNum = 1237;BA.debugLine="Vue.SetState(CreateMap(\"snack\":False,\"backshow\":F";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("snack"),(Object)(__c.False),(Object)("backshow"),(Object)(__c.False),(Object)("menushow"),(Object)(__c.True)}));
 //BA.debugLineNum = 1238;BA.debugLine="Vue.SetState(CreateMap(\"alerttitle\":\"\",\"alertmess";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("alerttitle"),(Object)(""),(Object)("alertmessage"),(Object)(""),(Object)("alertkey"),(Object)(""),(Object)("snackmessage"),(Object)(""),(Object)("confirmtext"),(Object)("")}));
 //BA.debugLineNum = 1239;BA.debugLine="Vue.SetState(CreateMap(\"confirmtitle\":\"\",\"confirm";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("confirmtitle"),(Object)(""),(Object)("confirmmessage"),(Object)(""),(Object)("confirmkey"),(Object)(""),(Object)("confirmtext"),(Object)(""),(Object)("canceltext"),(Object)("")}));
 //BA.debugLineNum = 1240;BA.debugLine="NavBar.Initialize(Vue, \"navbar\", module)";
_navbar._initialize /*b4j.example.vmtoolbar*/ (ba,_vue,"navbar",_module);
 //BA.debugLineNum = 1241;BA.debugLine="Drawer.Initialize(Vue, \"drawer\", module)";
_drawer._initialize /*b4j.example.vmdrawer*/ (ba,_vue,"drawer",_module);
 //BA.debugLineNum = 1242;BA.debugLine="Content = CreateAppContent(\"content\")";
_content = _createappcontent("content");
 //BA.debugLineNum = 1243;BA.debugLine="NavBar.SetHasBackButton(False)";
_navbar._sethasbackbutton /*b4j.example.vmtoolbar*/ (__c.False);
 //BA.debugLineNum = 1244;BA.debugLine="NavBar.SetHasMenuButton(True)";
_navbar._sethasmenubutton /*b4j.example.vmtoolbar*/ (__c.True);
 //BA.debugLineNum = 1247;BA.debugLine="Overlay = CreateLoader(\"pageloader\", module)";
_overlay = _createloader("pageloader",_module);
 //BA.debugLineNum = 1248;BA.debugLine="Overlay.Pop(Content)";
_overlay._pop /*String*/ (_content);
 //BA.debugLineNum = 1250;BA.debugLine="CreateButton(\"back\",module).SetIconButton(True).S";
_createbutton("back",_module)._seticonbutton /*b4j.example.vmbutton*/ (__c.True)._seticon /*b4j.example.vmbutton*/ ("keyboard_arrow_left")._pop /*String*/ (_navbar._startsection /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 1251;BA.debugLine="CreateButton(\"menu\",module).SetIconButton(True).S";
_createbutton("menu",_module)._seticonbutton /*b4j.example.vmbutton*/ (__c.True)._seticon /*b4j.example.vmbutton*/ ("menu")._setonclick /*b4j.example.vmbutton*/ (this)._pop /*String*/ (_navbar._startsection /*b4j.example.vmelement*/ );
 //BA.debugLineNum = 1253;BA.debugLine="NavBar.SetHasLogo(False)";
_navbar._sethaslogo /*b4j.example.vmtoolbar*/ (__c.False);
 //BA.debugLineNum = 1254;BA.debugLine="NavBar.SetLogo(\"\")";
_navbar._setlogo /*b4j.example.vmtoolbar*/ ("");
 //BA.debugLineNum = 1256;BA.debugLine="Alert = CreateAlert(\"alert\",module).SetTitle(\"Ale";
_alert = _createalert("alert",_module)._settitle /*b4j.example.vmalert*/ ("Alert")._setconfirmtext /*b4j.example.vmalert*/ ("Ok")._setcontent /*b4j.example.vmalert*/ ("Alert Content!");
 //BA.debugLineNum = 1257;BA.debugLine="Alert.Pop(Content)";
_alert._pop /*String*/ (_content);
 //BA.debugLineNum = 1259;BA.debugLine="Confirm = CreateConfirm(\"confirm\",module).SetTitl";
_confirm = _createconfirm("confirm",_module)._settitle /*b4j.example.vmconfirm*/ ("Title")._setcontent /*b4j.example.vmconfirm*/ ("Content");
 //BA.debugLineNum = 1260;BA.debugLine="Confirm.SetConfirmText(\"Ok\").SetCancelText(\"Cance";
_confirm._setconfirmtext /*b4j.example.vmconfirm*/ ("Ok")._setcanceltext /*b4j.example.vmconfirm*/ ("Cancel");
 //BA.debugLineNum = 1261;BA.debugLine="Confirm.Pop(Content)";
_confirm._pop /*String*/ (_content);
 //BA.debugLineNum = 1263;BA.debugLine="Prompt = CreatePrompt(\"prompt\", module).SetTitle(";
_prompt = _createprompt("prompt",_module)._settitle /*b4j.example.vmprompt*/ ("Title")._setcontent /*b4j.example.vmprompt*/ ("Content")._setmaxlength /*b4j.example.vmprompt*/ ((int) (20))._setplaceholder /*b4j.example.vmprompt*/ ("Placeholder");
 //BA.debugLineNum = 1264;BA.debugLine="Prompt.SetConfirmText(\"Ok\").SetCancelText(\"Cancel";
_prompt._setconfirmtext /*b4j.example.vmprompt*/ ("Ok")._setcanceltext /*b4j.example.vmprompt*/ ("Cancel");
 //BA.debugLineNum = 1265;BA.debugLine="Prompt.Pop(Content)";
_prompt._pop /*String*/ (_content);
 //BA.debugLineNum = 1267;BA.debugLine="Snack = CreateSnackBar(\"snack\",module)";
_snack = _createsnackbar("snack",_module);
 //BA.debugLineNum = 1268;BA.debugLine="Snack.Pop(Content)";
_snack._pop /*String*/ (_content);
 //BA.debugLineNum = 1270;BA.debugLine="If SubExists(module, \"confirm_cancel\") = False Th";
if (__c.SubExists(ba,_module,"confirm_cancel")==__c.False) { 
 //BA.debugLineNum = 1271;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a conf";
__c.Log("Initialize: Pleasure ensure you have a confirm_cancel event!");
 };
 //BA.debugLineNum = 1274;BA.debugLine="If SubExists(module, \"confirm_ok\") = False Then";
if (__c.SubExists(ba,_module,"confirm_ok")==__c.False) { 
 //BA.debugLineNum = 1275;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a conf";
__c.Log("Initialize: Pleasure ensure you have a confirm_ok event!");
 };
 //BA.debugLineNum = 1278;BA.debugLine="If SubExists(module, \"prompt_cancel\") = False The";
if (__c.SubExists(ba,_module,"prompt_cancel")==__c.False) { 
 //BA.debugLineNum = 1279;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a prom";
__c.Log("Initialize: Pleasure ensure you have a prompt_cancel event!");
 };
 //BA.debugLineNum = 1282;BA.debugLine="If SubExists(module, \"prompt_ok\") = False Then";
if (__c.SubExists(ba,_module,"prompt_ok")==__c.False) { 
 //BA.debugLineNum = 1283;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a prom";
__c.Log("Initialize: Pleasure ensure you have a prompt_ok event!");
 };
 //BA.debugLineNum = 1286;BA.debugLine="InitColors";
_initcolors();
 //BA.debugLineNum = 1287;BA.debugLine="Vue.Template.AddClass(\"page-container\")";
_vue._template /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ ("page-container");
 //BA.debugLineNum = 1288;BA.debugLine="Container.Initialize(Vue, sAppName & \"page\", modu";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,_sappname+"page",_module);
 //BA.debugLineNum = 1290;BA.debugLine="Dim e As Int";
_e = 0;
 //BA.debugLineNum = 1291;BA.debugLine="For e = 0 To 24";
{
final int step62 = 1;
final int limit62 = (int) (24);
_e = (int) (0) ;
for (;_e <= limit62 ;_e = _e + step62 ) {
 //BA.debugLineNum = 1292;BA.debugLine="Elevation.Put(e, e)";
_elevation.Put((Object)(_e),(Object)(_e));
 }
};
 //BA.debugLineNum = 1294;BA.debugLine="End Sub";
return "";
}
public int  _instr(String _searchit,String _searchfor) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub InStr(searchit As String, searchfor As String)";
 //BA.debugLineNum = 223;BA.debugLine="Return Vue.InStr(searchit, searchfor)";
if (true) return _vue._instr /*int*/ (_searchit,_searchfor);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _joinlists(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub JoinLists(lst As List) As List";
 //BA.debugLineNum = 72;BA.debugLine="Return Vue.JoinLists(lst)";
if (true) return _vue._joinlists /*anywheresoftware.b4a.objects.collections.List*/ (_lst);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _joinmaps(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 1105;BA.debugLine="Sub JoinMaps(lst As List) As Map";
 //BA.debugLineNum = 1106;BA.debugLine="Return Vue.JoinMaps(lst)";
if (true) return _vue._joinmaps /*anywheresoftware.b4a.objects.collections.Map*/ (_lst);
 //BA.debugLineNum = 1107;BA.debugLine="End Sub";
return null;
}
public String  _joinnonblanks(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 1101;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
 //BA.debugLineNum = 1102;BA.debugLine="Return Vue.JoinNonBlanks(delimiter, lst)";
if (true) return _vue._joinnonblanks /*String*/ (_delimiter,_lst);
 //BA.debugLineNum = 1103;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _jqueryelement(String _sid) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 1707;BA.debugLine="Sub JQueryElement(sid As String) As BANanoObject";
 //BA.debugLineNum = 1708;BA.debugLine="sid = sid.ToLowerCase";
_sid = _sid.toLowerCase();
 //BA.debugLineNum = 1709;BA.debugLine="Dim bo As BANanoObject = JQuery.Selector($\"#${sid";
_bo = new com.ab.banano.BANanoObject();
_bo = _jquery.Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(_sid))+"")));
 //BA.debugLineNum = 1710;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 1711;BA.debugLine="End Sub";
return null;
}
public String  _jsonpretty(Object _m) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub JSONPretty(m As Object) As String";
 //BA.debugLineNum = 280;BA.debugLine="Return Vue.JSONPretty(m)";
if (true) return _vue._jsonpretty /*String*/ (_m);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public String  _jsonsetproperty(String _sjson,anywheresoftware.b4a.objects.collections.Map _updates) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
 //BA.debugLineNum = 231;BA.debugLine="Return Vue.JSONSetProperty(sjson, updates)";
if (true) return _vue._jsonsetproperty /*String*/ (_sjson,_updates);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public int  _len(String _text) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="private Sub Len(Text As String) As Int";
 //BA.debugLineNum = 337;BA.debugLine="Return Text.Length";
if (true) return _text.length();
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _list2map(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 700;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
 //BA.debugLineNum = 701;BA.debugLine="Return List2Options(lst, keyName, valueName)";
if (true) return _list2options(_lst,_keyname,_valuename);
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2options(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 695;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
 //BA.debugLineNum = 696;BA.debugLine="Return List2Options(lst, keyName, valueName)";
if (true) return _list2options(_lst,_keyname,_valuename);
 //BA.debugLineNum = 697;BA.debugLine="End Sub";
return null;
}
public String  _makeboolean(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 1077;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
 //BA.debugLineNum = 1078;BA.debugLine="Vue.MakeBoolean(m, xkeys)";
_vue._makeboolean /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 1079;BA.debugLine="End Sub";
return "";
}
public String  _makedate(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 1109;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
 //BA.debugLineNum = 1110;BA.debugLine="Vue.MakeDate(m, xkeys)";
_vue._makedate /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 1111;BA.debugLine="End Sub";
return "";
}
public String  _makedouble(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 1069;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
 //BA.debugLineNum = 1070;BA.debugLine="Vue.MakeDouble(m, xkeys)";
_vue._makedouble /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 1071;BA.debugLine="End Sub";
return "";
}
public String  _makeinteger(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 1073;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
 //BA.debugLineNum = 1074;BA.debugLine="Vue.MakeInteger(m, xkeys)";
_vue._makeinteger /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 1075;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _makelowercase(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 1714;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
 //BA.debugLineNum = 1715;BA.debugLine="Return Vue.MakeLowerCase(m)";
if (true) return _vue._makelowercase /*anywheresoftware.b4a.objects.collections.Map*/ (_m);
 //BA.debugLineNum = 1716;BA.debugLine="End Sub";
return null;
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 1147;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 1148;BA.debugLine="Return Vue.MakePx(sValue)";
if (true) return _vue._makepx /*String*/ (_svalue);
 //BA.debugLineNum = 1149;BA.debugLine="End Sub";
return "";
}
public String  _maketrim(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
 //BA.debugLineNum = 1081;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
 //BA.debugLineNum = 1082;BA.debugLine="Vue.MakeTrim(m, xkeys)";
_vue._maketrim /*String*/ (_m,_xkeys);
 //BA.debugLineNum = 1083;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _map2options(anywheresoftware.b4a.objects.collections.Map _m,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 705;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
 //BA.debugLineNum = 706;BA.debugLine="Return Vue.Map2Options(m, keyName, valueName)";
if (true) return _vue._map2options /*anywheresoftware.b4a.objects.collections.List*/ (_m,_keyname,_valuename);
 //BA.debugLineNum = 707;BA.debugLine="End Sub";
return null;
}
public String  _md5hash(String _value,String _key,boolean _raw) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub Md5Hash(value As String, key As String, raw As";
 //BA.debugLineNum = 257;BA.debugLine="Return Vue.Md5Hash(value, key, raw)";
if (true) return _vue._md5hash /*String*/ (_value,_key,_raw);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public String  _menu_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 1340;BA.debugLine="Sub menu_click(e As BANanoEvent)";
 //BA.debugLineNum = 1341;BA.debugLine="Drawer.Toggle";
_drawer._toggle /*String*/ ();
 //BA.debugLineNum = 1342;BA.debugLine="NavBar.ToggleMenu";
_navbar._togglemenu /*String*/ ();
 //BA.debugLineNum = 1343;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
 //BA.debugLineNum = 420;BA.debugLine="Return Vue.MergeMaps(oldm, newm)";
if (true) return _vue._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (_oldm,_newm);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 321;BA.debugLine="Return Vue.MvField(sValue, iPosition, Delimiter)";
if (true) return _vue._mvfield /*String*/ (_svalue,_iposition,_delimiter);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public String  _padright(String _value,int _maxlen,String _padchar) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
 //BA.debugLineNum = 332;BA.debugLine="Return Vue.PadRight(Value, MaxLen, PadChar)";
if (true) return _vue._padright /*String*/ (_value,_maxlen,_padchar);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _pagepause() throws Exception{
 //BA.debugLineNum = 1736;BA.debugLine="Sub PagePause";
 //BA.debugLineNum = 1737;BA.debugLine="Overlay.SetIsLoading(True)";
_overlay._setisloading /*b4j.example.vmloader*/ (__c.True);
 //BA.debugLineNum = 1738;BA.debugLine="End Sub";
return "";
}
public String  _pagerefresh() throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="Sub PageRefresh";
 //BA.debugLineNum = 912;BA.debugLine="If HasInfoBox Then SetInfoBox";
if (_hasinfobox) { 
_setinfobox();};
 //BA.debugLineNum = 913;BA.debugLine="If HasKnob Then SetKnob";
if (_hasknob) { 
_setknob();};
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return "";
}
public String  _pageresume() throws Exception{
 //BA.debugLineNum = 1741;BA.debugLine="Sub PageResume";
 //BA.debugLineNum = 1742;BA.debugLine="Overlay.SetIsLoading(False)";
_overlay._setisloading /*b4j.example.vmloader*/ (__c.False);
 //BA.debugLineNum = 1743;BA.debugLine="End Sub";
return "";
}
public String  _prepare(anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
String _k = "";
String _sk = "";
 //BA.debugLineNum = 1086;BA.debugLine="Sub Prepare(keys As List)";
 //BA.debugLineNum = 1087;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _keys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1088;BA.debugLine="Dim sk As String = GetState(k,\"\")";
_sk = BA.ObjectToString(_getstate(_k,(Object)("")));
 //BA.debugLineNum = 1089;BA.debugLine="sk = Date2YYYYMMDD(sk)";
_sk = _date2yyyymmdd((Object)(_sk));
 //BA.debugLineNum = 1090;BA.debugLine="SetStateSingle(k, sk)";
_setstatesingle((Object)(_k),(Object)(_sk));
 }
};
 //BA.debugLineNum = 1092;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _runmethod(String _methodname,Object _params) throws Exception{
 //BA.debugLineNum = 764;BA.debugLine="Sub RunMethod(methodName As String, params As Obje";
 //BA.debugLineNum = 765;BA.debugLine="Return Vue.RunMethod(methodName, params)";
if (true) return _vue._runmethod /*com.ab.banano.BANanoObject*/ (_methodname,_params);
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setactivated(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1156;BA.debugLine="Sub SetActivated(module As Object, methodName As S";
 //BA.debugLineNum = 1157;BA.debugLine="Vue.SetActivated(module, methodName)";
_vue._setactivated /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1158;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1159;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbackgroundimage(String _url) throws Exception{
 //BA.debugLineNum = 1137;BA.debugLine="Sub SetBackgroundImage(url As String) As BANanoVM";
 //BA.debugLineNum = 1138;BA.debugLine="Content.SetBackgroundImage(url)";
_content._setbackgroundimage /*b4j.example.vmelement*/ (_url);
 //BA.debugLineNum = 1139;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1140;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforecreate(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1192;BA.debugLine="Sub SetBeforeCreate(module As Object, methodName A";
 //BA.debugLineNum = 1193;BA.debugLine="Vue.SetBeforeCreate(module, methodName)";
_vue._setbeforecreate /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1194;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1195;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforedestroy(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1187;BA.debugLine="Sub SetBeforeDestroy(module As Object, methodName";
 //BA.debugLineNum = 1188;BA.debugLine="Vue.SetBeforeDestroy(module, methodName)";
_vue._setbeforedestroy /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1189;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1190;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforemount(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1177;BA.debugLine="Sub SetBeforeMount(module As Object, methodName As";
 //BA.debugLineNum = 1178;BA.debugLine="Vue.SetBeforeMount(module, methodName)";
_vue._setbeforemount /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1179;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1180;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforeupdate(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1182;BA.debugLine="Sub SetBeforeUpdate(module As Object, methodName A";
 //BA.debugLineNum = 1183;BA.debugLine="Vue.SetBeforeUpdate(module, methodName)";
_vue._setbeforeupdate /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1184;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1185;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcallback(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1331;BA.debugLine="Sub SetCallBack(module As Object, methodName As St";
 //BA.debugLineNum = 1332;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1333;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovm)(this);};
 //BA.debugLineNum = 1334;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1335;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 1336;BA.debugLine="Vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1337;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1338;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcloak(boolean _b) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetCloak(b As Boolean) As BANanoVM";
 //BA.debugLineNum = 149;BA.debugLine="Vue.SetCloak(b)";
_vue._setcloak /*b4j.example.bananovue*/ (_b);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcomputed(String _k,Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1161;BA.debugLine="Sub SetComputed(k As String, module As Object, met";
 //BA.debugLineNum = 1162;BA.debugLine="Vue.SetComputed(k, module, methodName)";
_vue._setcomputed /*b4j.example.bananovue*/ (_k,_module,_methodname);
 //BA.debugLineNum = 1163;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1164;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcreated(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 759;BA.debugLine="Sub SetCreated(module As Object, methodName As Str";
 //BA.debugLineNum = 760;BA.debugLine="Vue.SetCreated(module, methodName)";
_vue._setcreated /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 761;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdateformat(String _df) throws Exception{
 //BA.debugLineNum = 673;BA.debugLine="Sub SetDateFormat(df As String) As BANanoVM";
 //BA.debugLineNum = 674;BA.debugLine="material.GetField(\"locale\").SetField(\"dateFormat\"";
_material.GetField("locale").SetField("dateFormat",(Object)(_df));
 //BA.debugLineNum = 675;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 676;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdeactivated(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1167;BA.debugLine="Sub SetDeActivated(module As Object, methodName As";
 //BA.debugLineNum = 1168;BA.debugLine="Vue.SetDeActivated(module, methodName)";
_vue._setdeactivated /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1169;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1170;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdestroyed(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1151;BA.debugLine="Sub SetDestroyed(module As Object, methodName As S";
 //BA.debugLineNum = 1152;BA.debugLine="Vue.SetDestroyed(module, methodName)";
_vue._setdestroyed /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1153;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1154;BA.debugLine="End Sub";
return null;
}
public String  _setdisabledstate(String _k,boolean _v) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 1051;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
 //BA.debugLineNum = 1052;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 1053;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle((Object)(_diskey),(Object)(_v));
 //BA.debugLineNum = 1054;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(String _elid,boolean _b) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetEnabled(elID As String, b As Boolean)";
 //BA.debugLineNum = 169;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 170;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(_b));
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _seterrorstate(String _k,boolean _v) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 1041;BA.debugLine="Sub SetErrorState(k As String, v As Boolean)";
 //BA.debugLineNum = 1042;BA.debugLine="Dim showKey As String = $\"${k}error\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"error");
 //BA.debugLineNum = 1043;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle((Object)(_showkey),(Object)(_v));
 //BA.debugLineNum = 1044;BA.debugLine="End Sub";
return "";
}
public String  _setfontfamily(Object _ff) throws Exception{
 //BA.debugLineNum = 790;BA.debugLine="private Sub SetFontFamily(ff As Object)";
 //BA.debugLineNum = 791;BA.debugLine="Vue.SetFontFamily(ff)";
_vue._setfontfamily /*String*/ (_ff);
 //BA.debugLineNum = 792;BA.debugLine="End Sub";
return "";
}
public String  _setgmapkey(String _key) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
anywheresoftware.b4a.objects.collections.Map _load = null;
 //BA.debugLineNum = 45;BA.debugLine="Sub SetGMapKey(key As String)";
 //BA.debugLineNum = 46;BA.debugLine="VueGoogleMaps.Initialize(\"VueGoogleMaps\")";
_vuegooglemaps.Initialize((Object)("VueGoogleMaps"));
 //BA.debugLineNum = 47;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 48;BA.debugLine="Dim load As Map = CreateMap()";
_load = new anywheresoftware.b4a.objects.collections.Map();
_load = __c.createMap(new Object[] {});
 //BA.debugLineNum = 49;BA.debugLine="load.Put(\"key\", key)";
_load.Put((Object)("key"),(Object)(_key));
 //BA.debugLineNum = 50;BA.debugLine="load.Put(\"libraries\", \"places\")";
_load.Put((Object)("libraries"),(Object)("places"));
 //BA.debugLineNum = 51;BA.debugLine="opt.Put(\"load\", load)";
_opt.Put((Object)("load"),(Object)(_load.getObject()));
 //BA.debugLineNum = 52;BA.debugLine="opt.Put(\"installComponents\", True)";
_opt.Put((Object)("installComponents"),(Object)(__c.True));
 //BA.debugLineNum = 53;BA.debugLine="Vue.Use1(VueGoogleMaps, opt)";
_vue._use1 /*String*/ (_vuegooglemaps,_opt);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _setinfobox() throws Exception{
 //BA.debugLineNum = 1727;BA.debugLine="Sub SetInfoBox";
 //BA.debugLineNum = 1728;BA.debugLine="JQuery.Selector(\".count-to\").RunMethod(\"countTo\",";
_jquery.Selector((Object)(".count-to")).RunMethod("countTo",__c.Null);
 //BA.debugLineNum = 1729;BA.debugLine="End Sub";
return "";
}
public String  _setknob() throws Exception{
 //BA.debugLineNum = 1731;BA.debugLine="Sub SetKnob";
 //BA.debugLineNum = 1732;BA.debugLine="BANano.RunJavascriptMethod(\"tron\", Null)";
_banano.RunJavascriptMethod("tron",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 1733;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setmethod(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 753;BA.debugLine="Sub SetMethod(module As Object, methodName As Stri";
 //BA.debugLineNum = 754;BA.debugLine="Vue.SetMethod(module, methodName)";
_vue._setmethod /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 755;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 756;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setmounted(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 833;BA.debugLine="Sub SetMounted(module As Object, methodName As Str";
 //BA.debugLineNum = 834;BA.debugLine="Vue.SetMounted(module, methodName)";
_vue._setmounted /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 835;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 836;BA.debugLine="End Sub";
return null;
}
public String  _setneeds() throws Exception{
 //BA.debugLineNum = 1021;BA.debugLine="private Sub SetNeeds";
 //BA.debugLineNum = 1022;BA.debugLine="HasKnob = False";
_hasknob = __c.False;
 //BA.debugLineNum = 1023;BA.debugLine="HasInfoBox = False";
_hasinfobox = __c.False;
 //BA.debugLineNum = 1024;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setprogressbuffer(String _pid,int _bval) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetProgressBuffer(pID As String, bVal As Int)";
 //BA.debugLineNum = 117;BA.debugLine="pID = pID.ToLowerCase";
_pid = _pid.toLowerCase();
 //BA.debugLineNum = 118;BA.debugLine="SetStateSingle($\"${pID}buffer\"$, bVal)";
_setstatesingle((Object)((""+__c.SmartStringFormatter("",(Object)(_pid))+"buffer")),(Object)(_bval));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setprogressvalue(String _pid,int _pval) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetProgressValue(pID As String, pVal As Int) A";
 //BA.debugLineNum = 110;BA.debugLine="pID = pID.ToLowerCase";
_pid = _pid.toLowerCase();
 //BA.debugLineNum = 111;BA.debugLine="SetStateSingle($\"${pID}value\"$, pVal)";
_setstatesingle((Object)((""+__c.SmartStringFormatter("",(Object)(_pid))+"value")),(Object)(_pval));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public String  _setprompt(Object _pvalue) throws Exception{
 //BA.debugLineNum = 1302;BA.debugLine="Sub SetPrompt(pvalue As Object)";
 //BA.debugLineNum = 1303;BA.debugLine="Vue.SetStateSingle(\"promptvalue\",pvalue)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("promptvalue",_pvalue);
 //BA.debugLineNum = 1304;BA.debugLine="End Sub";
return "";
}
public String  _setrequired(String _elid,boolean _b) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetRequired(elID As String, b As Boolean)";
 //BA.debugLineNum = 154;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 155;BA.debugLine="Vue.SetStateSingle($\"${elID}required\"$, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"required"),(Object)(_b));
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public String  _setrequiredstate(String _k,boolean _v) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 1056;BA.debugLine="Sub SetRequiredState(k As String, v As Boolean)";
 //BA.debugLineNum = 1057;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
 //BA.debugLineNum = 1058;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle((Object)(_diskey),(Object)(_v));
 //BA.debugLineNum = 1059;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setscrollbar(boolean _b) throws Exception{
 //BA.debugLineNum = 932;BA.debugLine="Sub SetScrollBar(b As Boolean) As BANanoVM";
 //BA.debugLineNum = 933;BA.debugLine="App.SetAttr(CreateMap(\":md-scrollbar\":b))";
_app._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-scrollbar"),(Object)(_b)}));
 //BA.debugLineNum = 934;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 935;BA.debugLine="End Sub";
return null;
}
public String  _setshowstate(String _k,boolean _v) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 1046;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
 //BA.debugLineNum = 1047;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 1048;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle((Object)(_showkey),(Object)(_v));
 //BA.debugLineNum = 1049;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setstate(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 689;BA.debugLine="Sub SetState(m As Map) As BANanoVM";
 //BA.debugLineNum = 690;BA.debugLine="Vue.SetState(m)";
_vue._setstate /*b4j.example.bananovue*/ (_m);
 //BA.debugLineNum = 691;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatedecrement(String _k) throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Sub SetStateDecrement(k As String) As BANanoVM";
 //BA.debugLineNum = 823;BA.debugLine="Vue.SetStateDecrement(k)";
_vue._setstatedecrement /*b4j.example.bananovue*/ (_k);
 //BA.debugLineNum = 824;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 825;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatefalse(String _k) throws Exception{
 //BA.debugLineNum = 812;BA.debugLine="Sub SetStateFalse(k As String) As BANanoVM";
 //BA.debugLineNum = 813;BA.debugLine="Vue.SetStateFalse(k)";
_vue._setstatefalse /*b4j.example.bananovue*/ (_k);
 //BA.debugLineNum = 814;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstateincrement(String _k) throws Exception{
 //BA.debugLineNum = 817;BA.debugLine="Sub SetStateIncrement(k As String) As BANanoVM";
 //BA.debugLineNum = 818;BA.debugLine="Vue.SetStateIncrement(k)";
_vue._setstateincrement /*b4j.example.bananovue*/ (_k);
 //BA.debugLineNum = 819;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 820;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatelist(String _mapkey,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 734;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
 //BA.debugLineNum = 735;BA.debugLine="Vue.SetStateList(mapKey, mapValues)";
_vue._setstatelist /*b4j.example.bananovue*/ (_mapkey,_mapvalues);
 //BA.debugLineNum = 736;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatelistvalues(anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 728;BA.debugLine="Sub SetStateListValues(mapValues As List) As BANan";
 //BA.debugLineNum = 729;BA.debugLine="Vue.SetStateListValues(mapValues)";
_vue._setstatelistvalues /*b4j.example.bananovue*/ (_mapvalues);
 //BA.debugLineNum = 730;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatemap(String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
 //BA.debugLineNum = 740;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
 //BA.debugLineNum = 741;BA.debugLine="Vue.SetStateMap(mapKey, mapValues)";
_vue._setstatemap /*b4j.example.bananovue*/ (_mapkey,_mapvalues);
 //BA.debugLineNum = 742;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatesingle(Object _k,Object _v) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Sub SetStateSingle(k As Object, v As Object) As BA";
 //BA.debugLineNum = 724;BA.debugLine="Vue.SetStateSingle(k, v)";
_vue._setstatesingle /*b4j.example.bananovue*/ (BA.ObjectToString(_k),_v);
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatetrue(String _k) throws Exception{
 //BA.debugLineNum = 803;BA.debugLine="Sub SetStateTrue(k As String) As BANanoVM";
 //BA.debugLineNum = 804;BA.debugLine="Vue.SetStateTrue(k)";
_vue._setstatetrue /*b4j.example.bananovue*/ (_k);
 //BA.debugLineNum = 805;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 806;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstyle(String _classname,String _prop,String _val) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetStyle(className As String, prop As String,";
 //BA.debugLineNum = 274;BA.debugLine="Vue.SetStyle(className, prop, val)";
_vue._setstyle /*b4j.example.bananovue*/ (_classname,_prop,_val);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setupdated(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1172;BA.debugLine="Sub SetUpdated(module As Object, methodName As Str";
 //BA.debugLineNum = 1173;BA.debugLine="Vue.SetUpdated(module, methodName)";
_vue._setupdated /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1174;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1175;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setwatch(String _k,boolean _bimmediate,boolean _bdeep,Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 746;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
 //BA.debugLineNum = 747;BA.debugLine="Vue.SetWatch(k, bImmediate, bDeep, module, method";
_vue._setwatch /*b4j.example.bananovue*/ (_k,_bimmediate,_bdeep,_module,_methodname);
 //BA.debugLineNum = 748;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 749;BA.debugLine="End Sub";
return null;
}
public String  _show(String _elid) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub Show(elID As String)";
 //BA.debugLineNum = 179;BA.debugLine="Vue.SetStateSingle($\"${elID}show\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.True));
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _showalert(String _process,String _title,String _message,String _confirmtext) throws Exception{
 //BA.debugLineNum = 1377;BA.debugLine="Sub ShowAlert(process As String, Title As String,";
 //BA.debugLineNum = 1378;BA.debugLine="Vue.SetState(CreateMap(\"alertkey\":process, \"alert";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("alertkey"),(Object)(_process),(Object)("alerttitle"),(Object)(_title),(Object)("alertmessage"),(Object)(_message),(Object)("confirmtext"),(Object)(_confirmtext)}));
 //BA.debugLineNum = 1379;BA.debugLine="Alert.Show";
_alert._show /*String*/ ();
 //BA.debugLineNum = 1380;BA.debugLine="End Sub";
return "";
}
public String  _showconfirm(String _process,String _title,String _message,String _confirmtext,String _canceltext) throws Exception{
 //BA.debugLineNum = 1382;BA.debugLine="Sub ShowConfirm(process As String, Title As String";
 //BA.debugLineNum = 1383;BA.debugLine="Vue.SetState(CreateMap(\"confirmtitle\":Title,\"conf";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("confirmtitle"),(Object)(_title),(Object)("confirmmessage"),(Object)(_message),(Object)("confirmkey"),(Object)(_process),(Object)("confirmtext"),(Object)(_confirmtext),(Object)("canceltext"),(Object)(_canceltext)}));
 //BA.debugLineNum = 1384;BA.debugLine="Confirm.Show";
_confirm._show /*String*/ ();
 //BA.debugLineNum = 1385;BA.debugLine="End Sub";
return "";
}
public String  _showdialog(String _did) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub ShowDialog(dID As String)";
 //BA.debugLineNum = 139;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
 //BA.debugLineNum = 140;BA.debugLine="SetStateTrue(dID)";
_setstatetrue(_did);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _showerror(String _elid) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub ShowError(elID As String)";
 //BA.debugLineNum = 183;BA.debugLine="Vue.SetStateSingle($\"${elID}error\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.True));
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _showitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
String _item = "";
 //BA.debugLineNum = 717;BA.debugLine="Sub ShowItems(items As List)";
 //BA.debugLineNum = 718;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 719;BA.debugLine="Vue.SetStateSingle(item, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_item,(Object)(__c.True));
 }
};
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return "";
}
public String  _showpage(String _name) throws Exception{
String _page = "";
 //BA.debugLineNum = 1204;BA.debugLine="Sub ShowPage(name As String)";
 //BA.debugLineNum = 1205;BA.debugLine="For Each page As String In Pages";
{
final anywheresoftware.b4a.BA.IterableList group1 = _pages;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_page = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1206;BA.debugLine="If name = page Then";
if ((_name).equals(_page)) { 
 //BA.debugLineNum = 1207;BA.debugLine="Show(name)";
_show(_name);
 }else {
 //BA.debugLineNum = 1209;BA.debugLine="Hide(page)";
_hide(_page);
 };
 }
};
 //BA.debugLineNum = 1212;BA.debugLine="End Sub";
return "";
}
public String  _showprompt(String _title,String _message,String _placeholder,int _maxlen,String _confirmtext,String _canceltext) throws Exception{
 //BA.debugLineNum = 1387;BA.debugLine="Sub ShowPrompt(Title As String, Message As String,";
 //BA.debugLineNum = 1388;BA.debugLine="Vue.SetStateSingle(\"promptvalue\",Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ ("promptvalue",__c.Null);
 //BA.debugLineNum = 1389;BA.debugLine="Vue.SetState(CreateMap(\"promptplaceholder\":Placeh";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("promptplaceholder"),(Object)(_placeholder),(Object)("prompttitle"),(Object)(_title),(Object)("promptcontent"),(Object)(_message),(Object)("promptconfirmtext"),(Object)(_confirmtext),(Object)("promptcanceltext"),(Object)(_canceltext),(Object)("promptmaxlength"),(Object)(_maxlen)}));
 //BA.debugLineNum = 1390;BA.debugLine="Prompt.Show";
_prompt._show /*String*/ ();
 //BA.debugLineNum = 1391;BA.debugLine="End Sub";
return "";
}
public String  _showprompt1(String _pname) throws Exception{
 //BA.debugLineNum = 1297;BA.debugLine="Sub ShowPrompt1(pName As String)";
 //BA.debugLineNum = 1298;BA.debugLine="SetPrompt(Null)";
_setprompt(__c.Null);
 //BA.debugLineNum = 1299;BA.debugLine="ShowDialog(pName)";
_showdialog(_pname);
 //BA.debugLineNum = 1300;BA.debugLine="End Sub";
return "";
}
public String  _showsnackbar(String _message) throws Exception{
 //BA.debugLineNum = 1393;BA.debugLine="Sub ShowSnackBar(Message As String)";
 //BA.debugLineNum = 1394;BA.debugLine="Vue.SetState(CreateMap(\"snackmessage\":Message))";
_vue._setstate /*b4j.example.bananovue*/ (__c.createMap(new Object[] {(Object)("snackmessage"),(Object)(_message)}));
 //BA.debugLineNum = 1395;BA.debugLine="Snack.show";
_snack._show /*String*/ ();
 //BA.debugLineNum = 1396;BA.debugLine="End Sub";
return "";
}
public String  _state2another(String _source,String _target,Object _defaultvalue) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub State2Another(source As String, target As Stri";
 //BA.debugLineNum = 81;BA.debugLine="Vue.State2Another(source, target, defaultValue)";
_vue._state2another /*String*/ (_source,_target,_defaultvalue);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public boolean  _stateexists(String _statename) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
 //BA.debugLineNum = 795;BA.debugLine="Return Vue.StateExists(stateName)";
if (true) return _vue._stateexists /*boolean*/ (_statename);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _strparse(String _delim,String _inputstring) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub StrParse(Delim As String, InputString As Strin";
 //BA.debugLineNum = 341;BA.debugLine="Return Vue.StrParse(Delim, InputString)";
if (true) return _vue._strparse /*anywheresoftware.b4a.objects.collections.List*/ (_delim,_inputstring);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _togglenamedstate(String _statename,String _state1,String _state2) throws Exception{
 //BA.debugLineNum = 1113;BA.debugLine="Sub ToggleNamedState(stateName As String, state1 A";
 //BA.debugLineNum = 1114;BA.debugLine="Vue.ToggleNamedState(stateName, state1, state2)";
_vue._togglenamedstate /*b4j.example.bananovue*/ (_statename,_state1,_state2);
 //BA.debugLineNum = 1115;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 1116;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _togglestate(String _statename) throws Exception{
 //BA.debugLineNum = 798;BA.debugLine="Sub ToggleState(stateName As String) As BANanoVM";
 //BA.debugLineNum = 799;BA.debugLine="Vue.ToggleState(stateName)";
_vue._togglestate /*b4j.example.bananovue*/ (_statename);
 //BA.debugLineNum = 800;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 801;BA.debugLine="End Sub";
return null;
}
public String  _toyyyymmdd(String _vmodel) throws Exception{
String _sk = "";
 //BA.debugLineNum = 1095;BA.debugLine="Sub ToYYYYMMDD(vmodel As String)";
 //BA.debugLineNum = 1096;BA.debugLine="Dim sk As String = GetState(vmodel,\"\")";
_sk = BA.ObjectToString(_getstate(_vmodel,(Object)("")));
 //BA.debugLineNum = 1097;BA.debugLine="sk = Date2YYYYMMDD(sk)";
_sk = _date2yyyymmdd((Object)(_sk));
 //BA.debugLineNum = 1098;BA.debugLine="SetStateSingle(vmodel, sk)";
_setstatesingle((Object)(_vmodel),(Object)(_sk));
 //BA.debugLineNum = 1099;BA.debugLine="End Sub";
return "";
}
public String  _updatebackgroundimage(String _url) throws Exception{
 //BA.debugLineNum = 1143;BA.debugLine="Sub UpdateBackgroundImage(url As String)";
 //BA.debugLineNum = 1144;BA.debugLine="BANano.GetElement(\"#content\").SetStyle(BANano.ToJ";
_banano.GetElement("#content").SetStyle(BA.ObjectToString(_banano.ToJson((Object)(__c.createMap(new Object[] {(Object)("background-image"),(Object)(("url('"+__c.SmartStringFormatter("",(Object)(_url))+"')")),(Object)("background-size"),(Object)("100% 100%")}).getObject()))));
 //BA.debugLineNum = 1145;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _updatebadge(String _elid,String _counted) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 475;BA.debugLine="Sub UpdateBadge(elID As String, counted As String)";
 //BA.debugLineNum = 476;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 477;BA.debugLine="Dim badValue As String = $\"${elID}value\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"value");
 //BA.debugLineNum = 478;BA.debugLine="Vue.SetStateSingle(badValue, counted)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_counted));
 //BA.debugLineNum = 479;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _updateitembadge(String _elid,String _counted) throws Exception{
String _badvalue = "";
 //BA.debugLineNum = 482;BA.debugLine="Sub UpdateItemBadge(elID As String, counted As Str";
 //BA.debugLineNum = 483;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 484;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgevalue");
 //BA.debugLineNum = 485;BA.debugLine="Vue.SetStateSingle(badValue, counted)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_badvalue,(Object)(_counted));
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public String  _use(com.ab.banano.BANanoObject _bo) throws Exception{
 //BA.debugLineNum = 916;BA.debugLine="Sub Use(bo As BANanoObject)";
 //BA.debugLineNum = 917;BA.debugLine="Vue.Use(bo)";
_vue._use /*String*/ (_bo);
 //BA.debugLineNum = 918;BA.debugLine="End Sub";
return "";
}
public String  _usetheme(b4j.example.vmelement _ve,String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _theme = null;
String _fc = "";
String _bc = "";
anywheresoftware.b4a.objects.collections.Map _color = null;
 //BA.debugLineNum = 1362;BA.debugLine="Sub UseTheme(ve As VMElement, themeName As String)";
 //BA.debugLineNum = 1363;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 1364;BA.debugLine="If Themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 1365;BA.debugLine="Dim theme As Map = Themes.Get(themeName)";
_theme = new anywheresoftware.b4a.objects.collections.Map();
_theme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_themes.Get((Object)(_themename))));
 //BA.debugLineNum = 1366;BA.debugLine="Dim fc As String = theme.Get(themeName)";
_fc = BA.ObjectToString(_theme.Get((Object)(_themename)));
 //BA.debugLineNum = 1367;BA.debugLine="Dim bc As String = theme.Get(themeName)";
_bc = BA.ObjectToString(_theme.Get((Object)(_themename)));
 //BA.debugLineNum = 1369;BA.debugLine="Dim color As Map = CreateMap()";
_color = new anywheresoftware.b4a.objects.collections.Map();
_color = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1370;BA.debugLine="color.Put(\"color\", fc)";
_color.Put((Object)("color"),(Object)(_fc));
 //BA.debugLineNum = 1371;BA.debugLine="color.Put(\"background-color\", bc)";
_color.Put((Object)("background-color"),(Object)(_bc));
 //BA.debugLineNum = 1372;BA.debugLine="ve.SetStyle(color)";
_ve._setstyle /*b4j.example.vmelement*/ (_color);
 };
 //BA.debugLineNum = 1374;BA.debugLine="End Sub";
return "";
}
public String  _ux() throws Exception{
String _rkey = "";
String _srefs = "";
String _dkey = "";
 //BA.debugLineNum = 891;BA.debugLine="Sub UX()";
 //BA.debugLineNum = 892;BA.debugLine="Content.SetText(Container.ToString)";
_content._settext /*b4j.example.vmelement*/ (_container._tostring /*String*/ ());
 //BA.debugLineNum = 893;BA.debugLine="Create";
_create();
 //BA.debugLineNum = 894;BA.debugLine="Vue.ux";
_vue._ux /*String*/ ();
 //BA.debugLineNum = 895;BA.debugLine="GetTemplate = Vue.GetTemplate";
_gettemplate = _vue._gettemplate /*String*/ ;
 //BA.debugLineNum = 896;BA.debugLine="VueBO = Vue.BOVue";
_vuebo = _vue._bovue /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 898;BA.debugLine="Dim rKey As String = \"$material\"";
_rkey = "$material";
 //BA.debugLineNum = 899;BA.debugLine="material = VueBO.GetField(rKey)";
_material = _vuebo.GetField(_rkey);
 //BA.debugLineNum = 900;BA.debugLine="Dim srefs As String = \"$refs\"";
_srefs = "$refs";
 //BA.debugLineNum = 901;BA.debugLine="refs = VueBO.GetField(srefs).result";
_refs.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_vuebo.GetField(_srefs).Result()));
 //BA.debugLineNum = 902;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
 //BA.debugLineNum = 903;BA.debugLine="data = VueBO.GetField(dKey).Result";
_data.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_vuebo.GetField(_dkey).Result()));
 //BA.debugLineNum = 904;BA.debugLine="If HasInfoBox Then SetInfoBox";
if (_hasinfobox) { 
_setinfobox();};
 //BA.debugLineNum = 905;BA.debugLine="If HasKnob Then SetKnob";
if (_hasknob) { 
_setknob();};
 //BA.debugLineNum = 907;BA.debugLine="SetDateFormat(\"yyyy-MM-dd\")";
_setdateformat("yyyy-MM-dd");
 //BA.debugLineNum = 908;BA.debugLine="End Sub";
return "";
}
public boolean  _validate(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.Map _required) throws Exception{
 //BA.debugLineNum = 1654;BA.debugLine="Sub Validate(rec As Map, required As Map) As Boole";
 //BA.debugLineNum = 1655;BA.debugLine="Return Vue.Validate(rec, required)";
if (true) return _vue._validate /*boolean*/ (_rec,_required);
 //BA.debugLineNum = 1656;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
