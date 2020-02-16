package b4j.example;


import anywheresoftware.b4a.BA;

public class modtable extends Object{
public static modtable mostCurrent = new modtable();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtable", null);
		ba.loadHtSubs(modtable.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtable", ba);
		}
	}
    public static Class<?> getObject() {
		return modtable.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static com.ab.banano.BANano _banano = null;
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
public static b4j.example.modtabs _modtabs = null;
public static b4j.example.modtextarea _modtextarea = null;
public static b4j.example.modtextbox _modtextbox = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmtable _tablex = null;
String _stable = "";
anywheresoftware.b4a.objects.collections.List _users = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 10;BA.debugLine="Log(\"modTable.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modTable.Code");
 //BA.debugLineNum = 11;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 13;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtable.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 19;BA.debugLine="vm.setstatelist(\"users\", Array())";
_vm._setstatelist /*b4j.example.bananovm*/ ("users",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
 //BA.debugLineNum = 20;BA.debugLine="vm.setstatelist(\"searched\", Array())";
_vm._setstatelist /*b4j.example.bananovm*/ ("searched",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
 //BA.debugLineNum = 21;BA.debugLine="vm.SetCreated(Me, \"setSearched\")";
_vm._setcreated /*b4j.example.bananovm*/ (modtable.getObject(),"setSearched");
 //BA.debugLineNum = 22;BA.debugLine="Dim tablex As VMTable = vm.CreateTable(\"tablex\",";
_tablex = _vm._createtable /*b4j.example.vmtable*/ ("tablex",modtable.getObject())._setvmodel /*b4j.example.vmtable*/ ("searched")._setcard /*b4j.example.vmtable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 23;BA.debugLine="tablex.ToolBar.SetTitle(\"Users\")";
_tablex._toolbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ ("Users");
 //BA.debugLineNum = 25;BA.debugLine="tablex.ToolBar.AddSearch(\"search\", \"Search...\", \"";
_tablex._toolbar /*b4j.example.vmtoolbar*/ ._addsearch /*String*/ ("search","Search...","mysearch");
 //BA.debugLineNum = 27;BA.debugLine="tablex.SetSort(\"name\").SetSortOrderAsc(True)";
_tablex._setsort /*b4j.example.vmtable*/ ("name")._setsortorderasc /*b4j.example.vmtable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 30;BA.debugLine="tablex.SetSelectableSingle(True)";
_tablex._setselectablesingle /*b4j.example.vmtable*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 32;BA.debugLine="tablex.AddColumn(\"id\", \"ID\",True, True)";
_tablex._addcolumn /*String*/ ("id","ID",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 33;BA.debugLine="tablex.AddColumn(\"name\", \"Name\",False, True)";
_tablex._addcolumn /*String*/ ("name","Name",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="tablex.AddColumn(\"email\", \"Email\",False, True)";
_tablex._addcolumn /*String*/ ("email","Email",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 35;BA.debugLine="tablex.AddColumn(\"gender\", \"Gender\",False, True)";
_tablex._addcolumn /*String*/ ("gender","Gender",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 36;BA.debugLine="tablex.AddColumn(\"title\", \"Title\",False, True)";
_tablex._addcolumn /*String*/ ("title","Title",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 38;BA.debugLine="Dim stable As String = tablex.tostring";
_stable = _tablex._tostring /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="cont.AddComponent(1,1, stable)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_stable);
 //BA.debugLineNum = 42;BA.debugLine="Dim users As List";
_users = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 43;BA.debugLine="users.initialize";
_users.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="users.add(CreateMap(\"id\": 1, \"name\": \"Shawna Dubb";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(1),(Object)("name"),(Object)("Shawna Dubbin"),(Object)("email"),(Object)("sdubbin0@geocities.com"),(Object)("gender"),(Object)("Male"),(Object)("title"),(Object)("Assistant Media Planner")}).getObject()));
 //BA.debugLineNum = 45;BA.debugLine="users.add(CreateMap(\"id\": 2, \"name\": \"Odette Dema";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(2),(Object)("name"),(Object)("Odette Demageard"),(Object)("email"),(Object)("odemageard1@spotify.com"),(Object)("gender"),(Object)("Female"),(Object)("title"),(Object)("Account Coordinator")}).getObject()));
 //BA.debugLineNum = 46;BA.debugLine="users.add(CreateMap(\"id\": 3, \"name\": \"Lonnie Izko";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(3),(Object)("name"),(Object)("Lonnie Izkovitz"),(Object)("email"),(Object)("lizkovitz3@youtu.be"),(Object)("gender"),(Object)("Female"),(Object)("title"),(Object)("Operator")}).getObject()));
 //BA.debugLineNum = 47;BA.debugLine="users.add(CreateMap(\"id\": 4, \"name\": \"Thatcher St";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(4),(Object)("name"),(Object)("Thatcher Stave"),(Object)("email"),(Object)("tstave4@reference.com"),(Object)("gender"),(Object)("Male"),(Object)("title"),(Object)("Software Test Engineer III")}).getObject()));
 //BA.debugLineNum = 48;BA.debugLine="users.add(CreateMap(\"id\": 5, \"name\": \"Clarinda Ma";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(5),(Object)("name"),(Object)("Clarinda Marieton"),(Object)("email"),(Object)("cmarietonh@theatlantic.com"),(Object)("gender"),(Object)("Female"),(Object)("title"),(Object)("Paralegal")}).getObject()));
 //BA.debugLineNum = 49;BA.debugLine="users.add(CreateMap(\"id\": 6, \"name\": \"Karim Chipp";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(6),(Object)("name"),(Object)("Karim Chipping"),(Object)("email"),(Object)("kchipping5@scribd.com"),(Object)("gender"),(Object)("Female"),(Object)("title"),(Object)("Safety Technician II")}).getObject()));
 //BA.debugLineNum = 50;BA.debugLine="users.add(CreateMap(\"id\": 7, \"name\": \"Helge Holya";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(7),(Object)("name"),(Object)("Helge Holyard"),(Object)("email"),(Object)("hholyard6@howstuffworks.com"),(Object)("gender"),(Object)("Female"),(Object)("title"),(Object)("Internal Auditor")}).getObject()));
 //BA.debugLineNum = 51;BA.debugLine="users.add(CreateMap(\"id\": 8, \"name\": \"Rod Tittert";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(8),(Object)("name"),(Object)("Rod Titterton"),(Object)("email"),(Object)("rtitterton7@nydailynews.com"),(Object)("gender"),(Object)("Male"),(Object)("title"),(Object)("Technical Writer")}).getObject()));
 //BA.debugLineNum = 52;BA.debugLine="users.add(CreateMap(\"id\": 9, \"name\": \"Gawen Apple";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(9),(Object)("name"),(Object)("Gawen Applewhite"),(Object)("email"),(Object)("gapplewhite8@reverbnation.com"),(Object)("gender"),(Object)("Female"),(Object)("title"),(Object)("GIS Technical Architect")}).getObject()));
 //BA.debugLineNum = 53;BA.debugLine="users.add(CreateMap(\"id\": 10, \"name\": \"Nero Mulgr";
_users.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)(10),(Object)("name"),(Object)("Nero Mulgrew"),(Object)("email"),(Object)("nmulgrew9@plala.or.jp"),(Object)("gender"),(Object)("Female"),(Object)("title"),(Object)("Staff Scientist")}).getObject()));
 //BA.debugLineNum = 55;BA.debugLine="vm.setstatesingle(\"users\", users)";
_vm._setstatesingle /*b4j.example.bananovm*/ ((Object)("users"),(Object)(_users.getObject()));
 //BA.debugLineNum = 58;BA.debugLine="vm.CreateLABEL(\"lbl\").SetText(\"{{ tablexselection";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._settext /*b4j.example.vmlabel*/ ("{{ tablexselection }}")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 59;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"tablecode\"";
_name = "tablecode";
 //BA.debugLineNum = 5;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _search_input(com.ab.banano.BANanoEvent _e) throws Exception{
String _svalue = "";
anywheresoftware.b4a.objects.collections.List _items = null;
com.ab.banano.BANanoJSONQuery _jsonq = null;
com.ab.banano.BANanoJSONQuery _jsonf = null;
anywheresoftware.b4a.objects.collections.List _searched = null;
 //BA.debugLineNum = 83;BA.debugLine="Sub search_input(e As BANanoEvent)";
 //BA.debugLineNum = 85;BA.debugLine="Dim svalue As String = vm.getstate(\"mysearch\", \"\"";
_svalue = BA.ObjectToString(_vm._getstate /*Object*/ ("mysearch",(Object)("")));
 //BA.debugLineNum = 86;BA.debugLine="If svalue = \"\" Then";
if ((_svalue).equals("")) { 
 //BA.debugLineNum = 88;BA.debugLine="vm.State2Another(\"users\", \"searched\", Array())";
_vm._state2another /*String*/ ("users","searched",(Object)(new Object[]{}));
 }else {
 //BA.debugLineNum = 91;BA.debugLine="Dim items As List = vm.getstate(\"users\", Array()";
_items = new anywheresoftware.b4a.objects.collections.List();
_items.setObject((java.util.List)(_vm._getstate /*Object*/ ("users",(Object)(new Object[]{}))));
 //BA.debugLineNum = 93;BA.debugLine="Dim jsonQ As BANanoJSONQuery";
_jsonq = new com.ab.banano.BANanoJSONQuery();
 //BA.debugLineNum = 94;BA.debugLine="jsonQ.Initialize(items)";
_jsonq.Initialize((Object)(_items.getObject()));
 //BA.debugLineNum = 97;BA.debugLine="Dim jsonF As BANanoJSONQuery = jsonQ.Where($\"{'n";
_jsonf = _jsonq.Where(("{'name.$li':'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_svalue))+"'}")).ToJQ();
 //BA.debugLineNum = 98;BA.debugLine="Dim searched As List = jsonF.All";
_searched = new anywheresoftware.b4a.objects.collections.List();
_searched = _jsonf.All();
 //BA.debugLineNum = 99;BA.debugLine="If searched.Size = 0 Then";
if (_searched.getSize()==0) { 
 //BA.debugLineNum = 100;BA.debugLine="vm.State2Another(\"users\", \"searched\", Array())";
_vm._state2another /*String*/ ("users","searched",(Object)(new Object[]{}));
 }else {
 //BA.debugLineNum = 102;BA.debugLine="vm.SetStateSingle(\"searched\", searched)";
_vm._setstatesingle /*b4j.example.bananovm*/ ((Object)("searched"),(Object)(_searched.getObject()));
 };
 };
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public static String  _setsearched(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub setSearched(e As BANanoEvent)";
 //BA.debugLineNum = 65;BA.debugLine="vm.State2Another(\"users\", \"searched\", Array())";
_vm._state2another /*String*/ ("users","searched",(Object)(new Object[]{}));
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static String  _tablex_select(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub tablex_select(items As List)";
 //BA.debugLineNum = 69;BA.debugLine="vm.setstatesingle(\"tablexselection\", items)";
_vm._setstatesingle /*b4j.example.bananovm*/ ((Object)("tablexselection"),(Object)(_items.getObject()));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
}
