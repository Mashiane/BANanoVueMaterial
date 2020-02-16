package b4j.example;


import anywheresoftware.b4a.BA;

public class modchips extends Object{
public static modchips mostCurrent = new modchips();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modchips", null);
		ba.loadHtSubs(modchips.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modchips", ba);
		}
	}
    public static Class<?> getObject() {
		return modchips.class;
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
public static String  _chip2_delete(com.ab.banano.BANanoEvent _e) throws Exception{
String _sid = "";
 //BA.debugLineNum = 87;BA.debugLine="Sub chip2_delete(e As BANanoEvent)";
 //BA.debugLineNum = 88;BA.debugLine="Dim sid As String = vm.GetChipIDFromEvent(e)";
_sid = _vm._getchipidfromevent /*String*/ (_e);
 //BA.debugLineNum = 89;BA.debugLine="vm.showsnackbar(sid)";
_vm._showsnackbar /*String*/ (_sid);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _chip3_click(com.ab.banano.BANanoEvent _e) throws Exception{
String _chipid = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub chip3_click(e As BANanoEvent)";
 //BA.debugLineNum = 77;BA.debugLine="Dim chipID As String = vm.GetIDFromEvent(e)";
_chipid = _vm._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 78;BA.debugLine="vm.showsnackbar(chipID)";
_vm._showsnackbar /*String*/ (_chipid);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public static String  _chip5_click(String _text,int _index) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub chip5_click(text As String, index As Int)";
 //BA.debugLineNum = 83;BA.debugLine="vm.showsnackbar(text)";
_vm._showsnackbar /*String*/ (_text);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public static String  _chip5_delete(String _text,int _index) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub chip5_delete(text As String, index As Int)";
 //BA.debugLineNum = 98;BA.debugLine="vm.showsnackbar(text)";
_vm._showsnackbar /*String*/ (_text);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _chip5_insert(String _value) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub chip5_insert(value As String)";
 //BA.debugLineNum = 94;BA.debugLine="vm.showsnackbar(value)";
_vm._showsnackbar /*String*/ (_value);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public static String  _chipbooks_click(com.ab.banano.BANanoEvent _e) throws Exception{
String _chipid = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub chipBooks_click(e As BANanoEvent)";
 //BA.debugLineNum = 72;BA.debugLine="Dim chipID As String = vm.GetIDFromEvent(e)";
_chipid = _vm._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 73;BA.debugLine="vm.showsnackbar(chipID)";
_vm._showsnackbar /*String*/ (_chipid);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static String  _code(b4j.example.bananovm _vmx) throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmlabel _lbl = null;
b4j.example.vmchip _chip1 = null;
b4j.example.vmchip _chip2 = null;
b4j.example.vmchip _chip3 = null;
b4j.example.vmchip _chip4 = null;
anywheresoftware.b4a.objects.collections.List _books = null;
b4j.example.vmchip _chipbooks = null;
b4j.example.vmchips _chip5 = null;
b4j.example.vmchips _chip6 = null;
b4j.example.vmchips _chip7 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code(vmx As BANanoVM)";
 //BA.debugLineNum = 10;BA.debugLine="Log(\"modChips.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modChips.Code");
 //BA.debugLineNum = 11;BA.debugLine="vm = vmx";
_vm = _vmx;
 //BA.debugLineNum = 13;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modchips.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.Hide";
_cont._hide /*String*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ ((int) (2))._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim lbl As VMLabel = vm.CreateLABEL(\"lbl\").SetPar";
_lbl = _vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("Chip Component");
 //BA.debugLineNum = 19;BA.debugLine="cont.AddComponent(1,1,lbl.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_lbl._tostring /*String*/ ());
 //BA.debugLineNum = 22;BA.debugLine="Dim chip1 As VMChip = vm.CreateChip(\"chip1\",Me).S";
_chip1 = _vm._createchip /*b4j.example.vmchip*/ ("chip1",modchips.getObject())._settext /*b4j.example.vmchip*/ ("Chip1 - Static");
 //BA.debugLineNum = 24;BA.debugLine="cont.AddComponent(1,1, chip1.ToString)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_chip1._tostring /*String*/ ());
 //BA.debugLineNum = 26;BA.debugLine="Dim chip2 As VMChip = vm.CreateChip(\"chip2\",Me).S";
_chip2 = _vm._createchip /*b4j.example.vmchip*/ ("chip2",modchips.getObject())._settext /*b4j.example.vmchip*/ ("Chip2 - Deletable")._setprimary /*b4j.example.vmchip*/ (anywheresoftware.b4a.keywords.Common.True)._setdeletable /*b4j.example.vmchip*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="cont.AddComponent(1,1,chip2.ToString)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_chip2._tostring /*String*/ ());
 //BA.debugLineNum = 29;BA.debugLine="Dim chip3 As VMChip = vm.CreateChip(\"chip3\",Me).S";
_chip3 = _vm._createchip /*b4j.example.vmchip*/ ("chip3",modchips.getObject())._settext /*b4j.example.vmchip*/ ("Chip3 - Clickable")._setaccent /*b4j.example.vmchip*/ (anywheresoftware.b4a.keywords.Common.True)._setclickable /*b4j.example.vmchip*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 30;BA.debugLine="cont.AddComponent(1,1,chip3.ToString)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_chip3._tostring /*String*/ ());
 //BA.debugLineNum = 32;BA.debugLine="Dim chip4 As VMChip = vm.CreateChip(\"chip4\",Me).S";
_chip4 = _vm._createchip /*b4j.example.vmchip*/ ("chip4",modchips.getObject())._settext /*b4j.example.vmchip*/ ("Chip4 - Disabled")._setdisabled /*b4j.example.vmchip*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 33;BA.debugLine="cont.AddComponent(1,1,chip4.ToString)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_chip4._tostring /*String*/ ());
 //BA.debugLineNum = 35;BA.debugLine="Dim lbl As VMLabel = vm.CreateLABEL(\"lbl\").SetPar";
_lbl = _vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("Chip from VModel");
 //BA.debugLineNum = 36;BA.debugLine="cont.AddComponent(1,1,lbl.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_lbl._tostring /*String*/ ());
 //BA.debugLineNum = 38;BA.debugLine="Dim books As List";
_books = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 39;BA.debugLine="books.initialize";
_books.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="books.add(CreateMap(\"id\":\"1\",\"title\":\"English\"))";
_books.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("1"),(Object)("title"),(Object)("English")}).getObject()));
 //BA.debugLineNum = 41;BA.debugLine="books.add(CreateMap(\"id\":\"2\",\"title\":\"Afrikaans\")";
_books.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("2"),(Object)("title"),(Object)("Afrikaans")}).getObject()));
 //BA.debugLineNum = 42;BA.debugLine="books.add(CreateMap(\"id\":\"3\",\"title\":\"Xhosa\"))";
_books.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("id"),(Object)("3"),(Object)("title"),(Object)("Xhosa")}).getObject()));
 //BA.debugLineNum = 43;BA.debugLine="vm.setstatesingle(\"books\", books)";
_vm._setstatesingle /*b4j.example.bananovm*/ ((Object)("books"),(Object)(_books.getObject()));
 //BA.debugLineNum = 45;BA.debugLine="Dim chipBooks As VMChip = vm.CreateChip(\"chipBook";
_chipbooks = _vm._createchip /*b4j.example.vmchip*/ ("chipBooks",modchips.getObject())._setdatasource /*b4j.example.vmchip*/ ("books","id","title");
 //BA.debugLineNum = 46;BA.debugLine="chipBooks.SetPrimary(True).SetClickable(True).Set";
_chipbooks._setprimary /*b4j.example.vmchip*/ (anywheresoftware.b4a.keywords.Common.True)._setclickable /*b4j.example.vmchip*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmchip*/ ("Languages");
 //BA.debugLineNum = 47;BA.debugLine="cont.AddComponent(1,1,chipBooks.ToString)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_chipbooks._tostring /*String*/ ());
 //BA.debugLineNum = 50;BA.debugLine="Dim lbl As VMLabel = vm.CreateLABEL(\"lbl\").SetPar";
_lbl = _vm._createlabel /*b4j.example.vmlabel*/ ("lbl")._setparagraph /*b4j.example.vmlabel*/ ()._settext /*b4j.example.vmlabel*/ ("Chips Input Component");
 //BA.debugLineNum = 51;BA.debugLine="cont.AddComponent(1,1,lbl.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_lbl._tostring /*String*/ ());
 //BA.debugLineNum = 53;BA.debugLine="vm.SetStateList(\"fruits\", Array(\"Orange\", \"Apple\"";
_vm._setstatelist /*b4j.example.bananovm*/ ("fruits",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Orange"),(Object)("Apple"),(Object)("Pineapple")}));
 //BA.debugLineNum = 54;BA.debugLine="Dim chip5 As VMChips = vm.CreateChips(\"chip5\",Me)";
_chip5 = _vm._createchips /*b4j.example.vmchips*/ ("chip5",modchips.getObject())._setvmodel /*b4j.example.vmchips*/ ("fruits")._setplaceholder /*b4j.example.vmchips*/ ("Add fruit...")._setcheckduplicated /*b4j.example.vmchips*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 55;BA.debugLine="cont.AddComponent(2,1, chip5.tostring)";
_cont._addcomponent /*String*/ ((int) (2),(int) (1),_chip5._tostring /*String*/ ());
 //BA.debugLineNum = 57;BA.debugLine="Dim lbl As VMLabel = vm.createlabel(\"thefruits\").";
_lbl = _vm._createlabel /*b4j.example.vmlabel*/ ("thefruits")._settext /*b4j.example.vmlabel*/ ("{{ fruits }}")._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 58;BA.debugLine="cont.AddComponent(2,1, lbl.tostring)";
_cont._addcomponent /*String*/ ((int) (2),(int) (1),_lbl._tostring /*String*/ ());
 //BA.debugLineNum = 60;BA.debugLine="vm.SetStateList(\"cities\", Array(\"New York\", \"Amst";
_vm._setstatelist /*b4j.example.bananovm*/ ("cities",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("New York"),(Object)("Amsterdam"),(Object)("Tokyo"),(Object)("Rome")}));
 //BA.debugLineNum = 61;BA.debugLine="Dim chip6 As VMChips = vm.CreateChips(\"chip6\",Me)";
_chip6 = _vm._createchips /*b4j.example.vmchips*/ ("chip6",modchips.getObject())._setvmodel /*b4j.example.vmchips*/ ("cities")._setlabel /*b4j.example.vmchips*/ ("Cities");
 //BA.debugLineNum = 62;BA.debugLine="chip6.SetHelperText(\"Wonderful places\")";
_chip6._sethelpertext /*b4j.example.vmchips*/ ("Wonderful places");
 //BA.debugLineNum = 63;BA.debugLine="cont.AddComponent(2,1, chip6.tostring)";
_cont._addcomponent /*String*/ ((int) (2),(int) (1),_chip6._tostring /*String*/ ());
 //BA.debugLineNum = 65;BA.debugLine="Dim chip7 As VMChips = vm.CreateChips(\"chip7\",Me)";
_chip7 = _vm._createchips /*b4j.example.vmchips*/ ("chip7",modchips.getObject())._setvmodel /*b4j.example.vmchips*/ ("cities")._setstatic /*b4j.example.vmchips*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 66;BA.debugLine="cont.AddComponent(2,1, chip7.tostring)";
_cont._addcomponent /*String*/ ((int) (2),(int) (1),_chip7._tostring /*String*/ ());
 //BA.debugLineNum = 68;BA.debugLine="vm.Container.AddComponent(1,1,cont.tostring)";
_vm._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_cont._tostring /*String*/ ());
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"chipscode\"";
_name = "chipscode";
 //BA.debugLineNum = 5;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
