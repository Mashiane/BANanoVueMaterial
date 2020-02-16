package b4j.example;


import anywheresoftware.b4a.BA;

public class modselect extends Object{
public static modselect mostCurrent = new modselect();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modselect", null);
		ba.loadHtSubs(modselect.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modselect", ba);
		}
	}
    public static Class<?> getObject() {
		return modselect.class;
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
public static String  _btnsel_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub btnSel_click(e As BANanoEvent)";
 //BA.debugLineNum = 89;BA.debugLine="vm.setstatesingle(\"country\", \"japan\")";
_vm._setstatesingle /*b4j.example.bananovm*/ ((Object)("country"),(Object)("japan"));
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmselect _selmovie = null;
anywheresoftware.b4a.objects.collections.List _countries = null;
b4j.example.vmselect _selcountries = null;
anywheresoftware.b4a.objects.collections.Map _fonts = null;
b4j.example.vmselect _selfonts = null;
 //BA.debugLineNum = 8;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 9;BA.debugLine="Log(\"modSelect.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modSelect.Code");
 //BA.debugLineNum = 10;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modselect.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(2).AddColumns(3,12,4,4,4)";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns /*b4j.example.vmgrid*/ ((int) (3),BA.NumberToString(12),BA.NumberToString(4),BA.NumberToString(4),BA.NumberToString(4));
 //BA.debugLineNum = 18;BA.debugLine="Dim selMovie As VMSelect = vm.CreateSelect(\"movie";
_selmovie = _vm._createselect /*b4j.example.vmselect*/ ("movie",modselect.getObject())._setvmodel /*b4j.example.vmselect*/ ("movie")._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 19;BA.debugLine="selMovie.SetLabel(\"Movie\").SetValue(\"godfather\")";
_selmovie._setlabel /*b4j.example.vmselect*/ ((Object)("Movie"))._setvalue /*b4j.example.vmselect*/ ("godfather");
 //BA.debugLineNum = 20;BA.debugLine="selMovie.additem(\"fightclub\", \"Fight Club\")";
_selmovie._additem /*b4j.example.vmselect*/ ("fightclub","Fight Club");
 //BA.debugLineNum = 21;BA.debugLine="selMovie.additem(\"godfather\", \"Godfather\")";
_selmovie._additem /*b4j.example.vmselect*/ ("godfather","Godfather");
 //BA.debugLineNum = 22;BA.debugLine="selMovie.additem(\"godfatherii\", \"Godfather II\")";
_selmovie._additem /*b4j.example.vmselect*/ ("godfatherii","Godfather II");
 //BA.debugLineNum = 23;BA.debugLine="selMovie.additem(\"godfatheriii\", \"Godfather III\")";
_selmovie._additem /*b4j.example.vmselect*/ ("godfatheriii","Godfather III");
 //BA.debugLineNum = 24;BA.debugLine="selMovie.additem(\"godfellas\", \"Godfellas\")";
_selmovie._additem /*b4j.example.vmselect*/ ("godfellas","Godfellas");
 //BA.debugLineNum = 25;BA.debugLine="selMovie.additem(\"pulpfiction\", \"Pulp Fiction\")";
_selmovie._additem /*b4j.example.vmselect*/ ("pulpfiction","Pulp Fiction");
 //BA.debugLineNum = 26;BA.debugLine="selMovie.additem(\"scarface\", \"Scarface\")";
_selmovie._additem /*b4j.example.vmselect*/ ("scarface","Scarface");
 //BA.debugLineNum = 27;BA.debugLine="selMovie.AddToContainer(cont, 1, 1)";
_selmovie._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 31;BA.debugLine="cont.AddComponent(1,1, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_vm._br /*String*/ ());
 //BA.debugLineNum = 33;BA.debugLine="vm.CreateLABEL(\"lbl\").SetText(\"{{ movie }}\").AddT";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._settext /*b4j.example.vmlabel*/ ("{{ movie }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 35;BA.debugLine="Dim countries As List";
_countries = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 36;BA.debugLine="countries.initialize";
_countries.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="countries.add(CreateMap(\"id\":\"australia\", \"text\":";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("australia"),(Object)("text"),(Object)("Australia")}).getObject()));
 //BA.debugLineNum = 38;BA.debugLine="countries.add(CreateMap(\"id\":\"brazil\", \"text\":\"Br";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("brazil"),(Object)("text"),(Object)("Brazil")}).getObject()));
 //BA.debugLineNum = 39;BA.debugLine="countries.add(CreateMap(\"id\":\"japan\", \"text\":\"Jap";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("japan"),(Object)("text"),(Object)("Japan")}).getObject()));
 //BA.debugLineNum = 40;BA.debugLine="countries.add(CreateMap(\"id\":\"united-states\", \"te";
_countries.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("united-states"),(Object)("text"),(Object)("United States")}).getObject()));
 //BA.debugLineNum = 41;BA.debugLine="vm.setstatesingle(\"countries\", countries)";
_vm._setstatesingle /*b4j.example.bananovm*/ ((Object)("countries"),(Object)(_countries.getObject()));
 //BA.debugLineNum = 43;BA.debugLine="Dim selCountries As VMSelect = vm.CreateSelect(\"c";
_selcountries = _vm._createselect /*b4j.example.vmselect*/ ("country",modselect.getObject())._setvmodel /*b4j.example.vmselect*/ ("country");
 //BA.debugLineNum = 44;BA.debugLine="selCountries.SetPlaceholder(\"Country\")";
_selcountries._setplaceholder /*b4j.example.vmselect*/ ("Country");
 //BA.debugLineNum = 45;BA.debugLine="selCountries.SetDataSource(\"countries\", \"id\", \"te";
_selcountries._setdatasource /*String*/ ("countries","id","text");
 //BA.debugLineNum = 46;BA.debugLine="selCountries.AddToContainer(cont, 1, 2)";
_selcountries._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 48;BA.debugLine="cont.AddComponent(1,2, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (2),_vm._br /*String*/ ());
 //BA.debugLineNum = 49;BA.debugLine="cont.AddComponent(1,2, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (2),_vm._br /*String*/ ());
 //BA.debugLineNum = 51;BA.debugLine="vm.CreateButton(\"btnSel\",Me).SetText(\"Set Japan\")";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnSel",modselect.getObject())._settext /*b4j.example.vmbutton*/ ("Set Japan")._setraised /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 52;BA.debugLine="cont.AddComponent(1,2, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (2),_vm._br /*String*/ ());
 //BA.debugLineNum = 53;BA.debugLine="cont.AddComponent(1,2, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (2),_vm._br /*String*/ ());
 //BA.debugLineNum = 54;BA.debugLine="vm.CreateLABEL(\"lbl2\").SetText(\"{{ country }}\").A";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl2")._settext /*b4j.example.vmlabel*/ ("{{ country }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 56;BA.debugLine="Dim fonts As Map = CreateMap()";
_fonts = new anywheresoftware.b4a.objects.collections.Map();
_fonts = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 57;BA.debugLine="fonts.put(\"arial\",\"Arial\")";
_fonts.Put((Object)("arial"),(Object)("Arial"));
 //BA.debugLineNum = 58;BA.debugLine="fonts.put(\"calibri\",\"Calibri\")";
_fonts.Put((Object)("calibri"),(Object)("Calibri"));
 //BA.debugLineNum = 59;BA.debugLine="fonts.put(\"cambria\",\"Cambria\")";
_fonts.Put((Object)("cambria"),(Object)("Cambria"));
 //BA.debugLineNum = 60;BA.debugLine="fonts.put(\"comicsans\",\"Comic Sans\")";
_fonts.Put((Object)("comicsans"),(Object)("Comic Sans"));
 //BA.debugLineNum = 61;BA.debugLine="fonts.put(\"consolas\",\"Consolas\")";
_fonts.Put((Object)("consolas"),(Object)("Consolas"));
 //BA.debugLineNum = 62;BA.debugLine="fonts.put(\"courier\",\"Courier\")";
_fonts.Put((Object)("courier"),(Object)("Courier"));
 //BA.debugLineNum = 63;BA.debugLine="fonts.put(\"droidsans\",\"Droid Sans\")";
_fonts.Put((Object)("droidsans"),(Object)("Droid Sans"));
 //BA.debugLineNum = 64;BA.debugLine="fonts.put(\"georgia\",\"Georgia\")";
_fonts.Put((Object)("georgia"),(Object)("Georgia"));
 //BA.debugLineNum = 65;BA.debugLine="fonts.put(\"helvetica\",\"Helvetica\")";
_fonts.Put((Object)("helvetica"),(Object)("Helvetica"));
 //BA.debugLineNum = 66;BA.debugLine="fonts.put(\"impact\",\"Impact\")";
_fonts.Put((Object)("impact"),(Object)("Impact"));
 //BA.debugLineNum = 67;BA.debugLine="fonts.put(\"roboto\",\"Roboto\")";
_fonts.Put((Object)("roboto"),(Object)("Roboto"));
 //BA.debugLineNum = 68;BA.debugLine="fonts.put(\"segoeui\",\"Segoe UI\")";
_fonts.Put((Object)("segoeui"),(Object)("Segoe UI"));
 //BA.debugLineNum = 69;BA.debugLine="fonts.put(\"timesnewroman\",\"Times New Roman\")";
_fonts.Put((Object)("timesnewroman"),(Object)("Times New Roman"));
 //BA.debugLineNum = 70;BA.debugLine="fonts.put(\"ubuntu\",\"Ubuntu\")";
_fonts.Put((Object)("ubuntu"),(Object)("Ubuntu"));
 //BA.debugLineNum = 71;BA.debugLine="fonts.put(\"verdana\",\"Verdana\")";
_fonts.Put((Object)("verdana"),(Object)("Verdana"));
 //BA.debugLineNum = 73;BA.debugLine="Dim selFonts As VMSelect = vm.CreateSelect(\"font\"";
_selfonts = _vm._createselect /*b4j.example.vmselect*/ ("font",modselect.getObject())._setvmodel /*b4j.example.vmselect*/ ("font")._setlabel /*b4j.example.vmselect*/ ((Object)("Font"));
 //BA.debugLineNum = 74;BA.debugLine="selFonts.SetPlaceholder(\"Font\")";
_selfonts._setplaceholder /*b4j.example.vmselect*/ ("Font");
 //BA.debugLineNum = 75;BA.debugLine="selFonts.SetOptions(\"fontnames\", fonts, \"id\", \"te";
_selfonts._setoptions /*String*/ ("fontnames",_fonts,"id","text");
 //BA.debugLineNum = 76;BA.debugLine="selFonts.SetRequired(True).SetErrorText(\"Font sho";
_selfonts._setrequired /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._seterrortext /*b4j.example.vmselect*/ ("Font should be selected!");
 //BA.debugLineNum = 77;BA.debugLine="selFonts.AddToContainer(cont, 1, 3)";
_selfonts._addtocontainer /*String*/ (_cont,(int) (1),(int) (3));
 //BA.debugLineNum = 79;BA.debugLine="cont.AddComponent(1,3, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (3),_vm._br /*String*/ ());
 //BA.debugLineNum = 80;BA.debugLine="cont.AddComponent(1,3, vm.BR)";
_cont._addcomponent /*String*/ ((int) (1),(int) (3),_vm._br /*String*/ ());
 //BA.debugLineNum = 82;BA.debugLine="vm.CreateLABEL(\"lblx\").SetText(\"{{ font }}\").AddT";
_vm._createlabel /*b4j.example.vmlabel*/ ("lblx")._settext /*b4j.example.vmlabel*/ ("{{ font }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (3));
 //BA.debugLineNum = 84;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 85;BA.debugLine="vm.SHowError(\"font\")";
_vm._showerror /*String*/ ("font");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _country_change(String _value) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub country_change(value As String)";
 //BA.debugLineNum = 101;BA.debugLine="vm.ShowSnackBar(value)";
_vm._showsnackbar /*String*/ (_value);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public static String  _countryclosed(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub countryClosed(e As BANanoEvent)";
 //BA.debugLineNum = 97;BA.debugLine="vm.ShowSnackBar(\"Country Closed!\")";
_vm._showsnackbar /*String*/ ("Country Closed!");
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public static String  _countryopened(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub countryOpened(e As BANanoEvent)";
 //BA.debugLineNum = 93;BA.debugLine="vm.ShowSnackBar(\"Country Opened!\")";
_vm._showsnackbar /*String*/ ("Country Opened!");
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"selectcode\"";
_name = "selectcode";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
