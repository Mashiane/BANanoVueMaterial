package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class pgindex extends Object{
public static pgindex mostCurrent = new pgindex();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pgindex", null);
		ba.loadHtSubs(pgindex.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgindex", ba);
		}
	}
    public static Class<?> getObject() {
		return pgindex.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.bananovm _vm = null;
public static b4j.example.main _main = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static String  _init() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "init", false))
	 {return ((String) Debug.delegate(ba, "init", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Init";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="vm.Initialize(Me, Main.appname)";
_vm._initialize /*String*/ (null,ba,pgindex.getObject(),_main._appname /*String*/ );
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ (null,"Expenses.Show");
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="vm.Drawer.SetTitle(\"Expenses.Show\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._settitle /*b4j.example.vmdrawer*/ (null,"Expenses.Show");
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="vm.Drawer.SetPersistentFull(True)";
_vm._drawer /*b4j.example.vmdrawer*/ ._setpersistentfull /*b4j.example.vmdrawer*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="vm.NavBar.Show";
_vm._navbar /*b4j.example.vmtoolbar*/ ._show /*String*/ (null);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="vm.NavBar.SetPrimary(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setprimary /*b4j.example.vmtoolbar*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="vm.NavBar.SetModeFixed(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setmodefixed /*b4j.example.vmtoolbar*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="vm.NavBar.SetHasBackButton(False)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._sethasbackbutton /*b4j.example.vmtoolbar*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="vm.NavBar.SetHasMenuButton(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._sethasmenubutton /*b4j.example.vmtoolbar*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="vm.NavBar.AddIcon(\"btnAddExpenseType\", \"add\", \"Ad";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addicon /*b4j.example.vmtoolbar*/ (null,"btnAddExpenseType","add","Add expense type","");
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="vm.NavBar.AddIcon(\"btnAddExpenseCategory\", \"add\",";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addicon /*b4j.example.vmtoolbar*/ (null,"btnAddExpenseCategory","add","Add expense category","");
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="vm.NavBar.AddIcon(\"btnAddExpense\", \"add\", \"Add ex";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addicon /*b4j.example.vmtoolbar*/ (null,"btnAddExpense","add","Add expense","");
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="vm.SetMethod(Me, \"LoadTypes\")";
_vm._setmethod /*b4j.example.bananovm*/ (null,pgindex.getObject(),"LoadTypes");
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="vm.SetMethod(Me, \"LoadCategories\")";
_vm._setmethod /*b4j.example.bananovm*/ (null,pgindex.getObject(),"LoadCategories");
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="BuildDrawer";
_builddrawer();
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="AddPages";
_addpages();
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="HideButtons";
_hidebuttons();
RDebugUtils.currentLine=327708;
 //BA.debugLineNum = 327708;BA.debugLine="vm.ux";
_vm._ux /*String*/ (null);
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="ShowDashboard";
_showdashboard();
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="End Sub";
return "";
}
public static String  _addpages() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "addpages", false))
	 {return ((String) Debug.delegate(ba, "addpages", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub AddPages";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="vm.AddPage(modDashboard.name, modDashboard)";
_vm._addpage /*String*/ (null,_moddashboard._name /*String*/ ,(Object)(_moddashboard.getObject()));
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="vm.AddPage(modExpenses.name, modExpenses)";
_vm._addpage /*String*/ (null,_modexpenses._name /*String*/ ,(Object)(_modexpenses.getObject()));
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="vm.AddPage(modStats.name, modStats)";
_vm._addpage /*String*/ (null,_modstats._name /*String*/ ,(Object)(_modstats.getObject()));
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="vm.AddPage(modExpenseTypes.name, modExpenseTypes)";
_vm._addpage /*String*/ (null,_modexpensetypes._name /*String*/ ,(Object)(_modexpensetypes.getObject()));
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="vm.Addpage(modExpenseCategories.name, modExpenseC";
_vm._addpage /*String*/ (null,_modexpensecategories._name /*String*/ ,(Object)(_modexpensecategories.getObject()));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
return "";
}
public static String  _back_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "back_click", false))
	 {return ((String) Debug.delegate(ba, "back_click", new Object[] {_e}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub back_click(e As BANanoEvent)";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddexpense_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "btnaddexpense_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddexpense_click", new Object[] {_e}));}
RDebugUtils.currentLine=277282816;
 //BA.debugLineNum = 277282816;BA.debugLine="Sub btnAddExpense_click(e As BANanoEvent)";
RDebugUtils.currentLine=277282817;
 //BA.debugLineNum = 277282817;BA.debugLine="modExpenses.add";
_modexpenses._add /*String*/ ();
RDebugUtils.currentLine=277282818;
 //BA.debugLineNum = 277282818;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddexpensecategory_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "btnaddexpensecategory_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddexpensecategory_click", new Object[] {_e}));}
RDebugUtils.currentLine=272039936;
 //BA.debugLineNum = 272039936;BA.debugLine="Sub btnAddExpenseCategory_click(e As BANanoEvent)";
RDebugUtils.currentLine=272039937;
 //BA.debugLineNum = 272039937;BA.debugLine="modExpenseCategories.Add";
_modexpensecategories._add /*String*/ ();
RDebugUtils.currentLine=272039938;
 //BA.debugLineNum = 272039938;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddexpensetype_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "btnaddexpensetype_click", false))
	 {return ((String) Debug.delegate(ba, "btnaddexpensetype_click", new Object[] {_e}));}
RDebugUtils.currentLine=271515648;
 //BA.debugLineNum = 271515648;BA.debugLine="Sub btnAddExpenseType_click(e As BANanoEvent)";
RDebugUtils.currentLine=271515649;
 //BA.debugLineNum = 271515649;BA.debugLine="modExpenseTypes.Add";
_modexpensetypes._add /*String*/ ();
RDebugUtils.currentLine=271515650;
 //BA.debugLineNum = 271515650;BA.debugLine="End Sub";
return "";
}
public static String  _builddrawer() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "builddrawer", false))
	 {return ((String) Debug.delegate(ba, "builddrawer", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub BuildDrawer";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="vm.Drawer.AddItem(\"dashboard\",\"\",\"Dashboard\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._additem /*String*/ (null,"dashboard","","Dashboard");
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="vm.Drawer.AddItem(\"expenses\",\"\",\"Expenses\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._additem /*String*/ (null,"expenses","","Expenses");
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="vm.Drawer.AddItem(\"stats\",\"\",\"Stats\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._additem /*String*/ (null,"stats","","Stats");
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="vm.Drawer.AddItem(\"settings\",\"\",\"Settings\")";
_vm._drawer /*b4j.example.vmdrawer*/ ._additem /*String*/ (null,"settings","","Settings");
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="vm.Drawer.AddSubItem(\"settings\",\"expensetypes\",\"\"";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ (null,"settings","expensetypes","","Expense Types");
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="vm.Drawer.AddSubItem(\"settings\",\"expensecategorie";
_vm._drawer /*b4j.example.vmdrawer*/ ._addsubitem /*String*/ (null,"settings","expensecategories","","Expense Categories");
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="End Sub";
return "";
}
public static String  _confirm_ok() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "confirm_ok", false))
	 {return ((String) Debug.delegate(ba, "confirm_ok", null));}
String _sconfirm = "";
String _sid = "";
b4j.example.bananomysql _dbsql = null;
RDebugUtils.currentLine=276496384;
 //BA.debugLineNum = 276496384;BA.debugLine="Sub confirm_ok";
RDebugUtils.currentLine=276496385;
 //BA.debugLineNum = 276496385;BA.debugLine="Dim sconfirm As String = vm.GetConfirm";
_sconfirm = _vm._getconfirm /*String*/ (null);
RDebugUtils.currentLine=276496386;
 //BA.debugLineNum = 276496386;BA.debugLine="Select Case sconfirm";
switch (BA.switchObjectToInt(_sconfirm,"delete_expensetype","delete_category")) {
case 0: {
RDebugUtils.currentLine=276496389;
 //BA.debugLineNum = 276496389;BA.debugLine="Dim sid As String = vm.getstate(\"expensetypeid\",";
_sid = BA.ObjectToString(_vm._getstate /*Object*/ (null,"expensetypeid",(Object)("")));
RDebugUtils.currentLine=276496390;
 //BA.debugLineNum = 276496390;BA.debugLine="If sid = \"\" Then Return";
if ((_sid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=276496392;
 //BA.debugLineNum = 276496392;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=276496393;
 //BA.debugLineNum = 276496393;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensetypes\", \"id";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expensetypes","id");
RDebugUtils.currentLine=276496394;
 //BA.debugLineNum = 276496394;BA.debugLine="dbsql.Delete(sid)";
_dbsql._delete /*b4j.example.bananomysql*/ (null,_sid);
RDebugUtils.currentLine=276496395;
 //BA.debugLineNum = 276496395;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=276496396;
 //BA.debugLineNum = 276496396;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=276496397;
 //BA.debugLineNum = 276496397;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=276496398;
 //BA.debugLineNum = 276496398;BA.debugLine="vm.ShowSnackBar(\"Expense Type deleted successfu";
_vm._showsnackbar /*String*/ (null,"Expense Type deleted successfully!");
RDebugUtils.currentLine=276496400;
 //BA.debugLineNum = 276496400;BA.debugLine="modExpenseTypes.Refresh";
_modexpensetypes._refresh /*String*/ ();
 }else {
RDebugUtils.currentLine=276496402;
 //BA.debugLineNum = 276496402;BA.debugLine="Log(\"phIndex.confirm_ok.delete_expensetype: Err";
anywheresoftware.b4a.keywords.Common.Log("phIndex.confirm_ok.delete_expensetype: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=276496403;
 //BA.debugLineNum = 276496403;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
 break; }
case 1: {
RDebugUtils.currentLine=276496408;
 //BA.debugLineNum = 276496408;BA.debugLine="Dim sid As String = vm.getstate(\"categoryid\", \"\"";
_sid = BA.ObjectToString(_vm._getstate /*Object*/ (null,"categoryid",(Object)("")));
RDebugUtils.currentLine=276496409;
 //BA.debugLineNum = 276496409;BA.debugLine="If sid = \"\" Then Return";
if ((_sid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=276496410;
 //BA.debugLineNum = 276496410;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=276496411;
 //BA.debugLineNum = 276496411;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensecategories\"";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expensecategories","id");
RDebugUtils.currentLine=276496412;
 //BA.debugLineNum = 276496412;BA.debugLine="dbsql.Delete(sid)";
_dbsql._delete /*b4j.example.bananomysql*/ (null,_sid);
RDebugUtils.currentLine=276496413;
 //BA.debugLineNum = 276496413;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=276496414;
 //BA.debugLineNum = 276496414;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=276496415;
 //BA.debugLineNum = 276496415;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=276496416;
 //BA.debugLineNum = 276496416;BA.debugLine="vm.ShowSnackBar(\"Expense Category deleted succe";
_vm._showsnackbar /*String*/ (null,"Expense Category deleted successfully!");
RDebugUtils.currentLine=276496417;
 //BA.debugLineNum = 276496417;BA.debugLine="modExpenseCategories.Refresh";
_modexpensecategories._refresh /*String*/ ();
 }else {
RDebugUtils.currentLine=276496419;
 //BA.debugLineNum = 276496419;BA.debugLine="Log(\"phIndex.confirm_ok.delete_category: Error";
anywheresoftware.b4a.keywords.Common.Log("phIndex.confirm_ok.delete_category: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=276496420;
 //BA.debugLineNum = 276496420;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
 break; }
}
;
RDebugUtils.currentLine=276496424;
 //BA.debugLineNum = 276496424;BA.debugLine="End Sub";
return "";
}
public static String  _dashboard_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "dashboard_click", false))
	 {return ((String) Debug.delegate(ba, "dashboard_click", new Object[] {_e}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub dashboard_click(e As BANanoEvent)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="ShowDashboard";
_showdashboard();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _showdashboard() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "showdashboard", false))
	 {return ((String) Debug.delegate(ba, "showdashboard", null));}
RDebugUtils.currentLine=280887296;
 //BA.debugLineNum = 280887296;BA.debugLine="Sub ShowDashboard";
RDebugUtils.currentLine=280887297;
 //BA.debugLineNum = 280887297;BA.debugLine="HideButtons";
_hidebuttons();
RDebugUtils.currentLine=280887299;
 //BA.debugLineNum = 280887299;BA.debugLine="vm.CallMethod(\"LoadTypes\")";
_vm._callmethod /*String*/ (null,"LoadTypes");
RDebugUtils.currentLine=280887300;
 //BA.debugLineNum = 280887300;BA.debugLine="vm.CallMethod(\"LoadCategories\")";
_vm._callmethod /*String*/ (null,"LoadCategories");
RDebugUtils.currentLine=280887301;
 //BA.debugLineNum = 280887301;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Dashboard\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ (null,"Expenses.Show - Dashboard");
RDebugUtils.currentLine=280887302;
 //BA.debugLineNum = 280887302;BA.debugLine="modDashboard.expcont.setdefaults";
_moddashboard._expcont /*b4j.example.vmcontainer*/ ._setdefaults /*String*/ (null);
RDebugUtils.currentLine=280887303;
 //BA.debugLineNum = 280887303;BA.debugLine="vm.showpage(modDashboard.name)";
_vm._showpage /*String*/ (null,_moddashboard._name /*String*/ );
RDebugUtils.currentLine=280887304;
 //BA.debugLineNum = 280887304;BA.debugLine="End Sub";
return "";
}
public static String  _expensecategories_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "expensecategories_click", false))
	 {return ((String) Debug.delegate(ba, "expensecategories_click", new Object[] {_e}));}
RDebugUtils.currentLine=269484032;
 //BA.debugLineNum = 269484032;BA.debugLine="Sub expensecategories_click(e As BANanoEvent)";
RDebugUtils.currentLine=269484033;
 //BA.debugLineNum = 269484033;BA.debugLine="HideButtons";
_hidebuttons();
RDebugUtils.currentLine=269484034;
 //BA.debugLineNum = 269484034;BA.debugLine="vm.show(\"btnAddExpenseCategory\")";
_vm._show /*String*/ (null,"btnAddExpenseCategory");
RDebugUtils.currentLine=269484035;
 //BA.debugLineNum = 269484035;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Settings\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ (null,"Expenses.Show - Settings");
RDebugUtils.currentLine=269484036;
 //BA.debugLineNum = 269484036;BA.debugLine="vm.showpage(modExpenseCategories.name)";
_vm._showpage /*String*/ (null,_modexpensecategories._name /*String*/ );
RDebugUtils.currentLine=269484037;
 //BA.debugLineNum = 269484037;BA.debugLine="modExpenseCategories.refresh";
_modexpensecategories._refresh /*String*/ ();
RDebugUtils.currentLine=269484038;
 //BA.debugLineNum = 269484038;BA.debugLine="End Sub";
return "";
}
public static String  _hidebuttons() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "hidebuttons", false))
	 {return ((String) Debug.delegate(ba, "hidebuttons", null));}
RDebugUtils.currentLine=270467072;
 //BA.debugLineNum = 270467072;BA.debugLine="Sub HideButtons";
RDebugUtils.currentLine=270467073;
 //BA.debugLineNum = 270467073;BA.debugLine="vm.hide(\"btnAddExpenseCategory\")";
_vm._hide /*String*/ (null,"btnAddExpenseCategory");
RDebugUtils.currentLine=270467074;
 //BA.debugLineNum = 270467074;BA.debugLine="vm.Hide(\"btnAddExpenseType\")";
_vm._hide /*String*/ (null,"btnAddExpenseType");
RDebugUtils.currentLine=270467075;
 //BA.debugLineNum = 270467075;BA.debugLine="vm.hide(\"btnAddExpense\")";
_vm._hide /*String*/ (null,"btnAddExpense");
RDebugUtils.currentLine=270467076;
 //BA.debugLineNum = 270467076;BA.debugLine="End Sub";
return "";
}
public static String  _expenses_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "expenses_click", false))
	 {return ((String) Debug.delegate(ba, "expenses_click", new Object[] {_e}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub expenses_click(e As BANanoEvent)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="HideButtons";
_hidebuttons();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="vm.Show(\"btnAddExpense\")";
_vm._show /*String*/ (null,"btnAddExpense");
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Expenses\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ (null,"Expenses.Show - Expenses");
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="vm.showpage(modExpenses.name)";
_vm._showpage /*String*/ (null,_modexpenses._name /*String*/ );
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="modExpenses.refresh";
_modexpenses._refresh /*String*/ ();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="End Sub";
return "";
}
public static String  _expensetypes_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "expensetypes_click", false))
	 {return ((String) Debug.delegate(ba, "expensetypes_click", new Object[] {_e}));}
RDebugUtils.currentLine=269418496;
 //BA.debugLineNum = 269418496;BA.debugLine="Sub expensetypes_click(e As BANanoEvent)";
RDebugUtils.currentLine=269418497;
 //BA.debugLineNum = 269418497;BA.debugLine="HideButtons";
_hidebuttons();
RDebugUtils.currentLine=269418498;
 //BA.debugLineNum = 269418498;BA.debugLine="vm.Show(\"btnAddExpenseType\")";
_vm._show /*String*/ (null,"btnAddExpenseType");
RDebugUtils.currentLine=269418499;
 //BA.debugLineNum = 269418499;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Settings\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ (null,"Expenses.Show - Settings");
RDebugUtils.currentLine=269418500;
 //BA.debugLineNum = 269418500;BA.debugLine="vm.showpage(modExpenseTypes.name)";
_vm._showpage /*String*/ (null,_modexpensetypes._name /*String*/ );
RDebugUtils.currentLine=269418501;
 //BA.debugLineNum = 269418501;BA.debugLine="modExpenseTypes.refresh";
_modexpensetypes._refresh /*String*/ ();
RDebugUtils.currentLine=269418502;
 //BA.debugLineNum = 269418502;BA.debugLine="End Sub";
return "";
}
public static String  _loadcategories() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "loadcategories", false))
	 {return ((String) Debug.delegate(ba, "loadcategories", null));}
b4j.example.bananomysql _dbsql = null;
RDebugUtils.currentLine=280166400;
 //BA.debugLineNum = 280166400;BA.debugLine="Sub LoadCategories";
RDebugUtils.currentLine=280166401;
 //BA.debugLineNum = 280166401;BA.debugLine="vm.SetStateSingle(\"categories\", Array())";
_vm._setstatesingle /*b4j.example.bananovm*/ (null,(Object)("categories"),(Object)(new Object[]{}));
RDebugUtils.currentLine=280166402;
 //BA.debugLineNum = 280166402;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=280166403;
 //BA.debugLineNum = 280166403;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensecategories\",";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expensecategories","id");
RDebugUtils.currentLine=280166404;
 //BA.debugLineNum = 280166404;BA.debugLine="dbsql.SelectAll(Array(\"id\",\"text\"), Array(\"text\")";
_dbsql._selectall /*b4j.example.bananomysql*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id"),(Object)("text")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("text")}));
RDebugUtils.currentLine=280166405;
 //BA.debugLineNum = 280166405;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=280166406;
 //BA.debugLineNum = 280166406;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=280166407;
 //BA.debugLineNum = 280166407;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=280166408;
 //BA.debugLineNum = 280166408;BA.debugLine="vm.SetStateSingle(\"categories\", dbsql.result)";
_vm._setstatesingle /*b4j.example.bananovm*/ (null,(Object)("categories"),(Object)(_dbsql._result /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 };
RDebugUtils.currentLine=280166410;
 //BA.debugLineNum = 280166410;BA.debugLine="End Sub";
return "";
}
public static String  _loadtypes() throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "loadtypes", false))
	 {return ((String) Debug.delegate(ba, "loadtypes", null));}
b4j.example.bananomysql _dbsql = null;
RDebugUtils.currentLine=279576576;
 //BA.debugLineNum = 279576576;BA.debugLine="Sub LoadTypes";
RDebugUtils.currentLine=279576577;
 //BA.debugLineNum = 279576577;BA.debugLine="vm.SetStateSingle(\"types\", Array())";
_vm._setstatesingle /*b4j.example.bananovm*/ (null,(Object)("types"),(Object)(new Object[]{}));
RDebugUtils.currentLine=279576578;
 //BA.debugLineNum = 279576578;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=279576579;
 //BA.debugLineNum = 279576579;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensetypes\", \"id\"";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expensetypes","id");
RDebugUtils.currentLine=279576580;
 //BA.debugLineNum = 279576580;BA.debugLine="dbsql.SelectAll(Array(\"id\",\"text\"), Array(\"text\")";
_dbsql._selectall /*b4j.example.bananomysql*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id"),(Object)("text")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("text")}));
RDebugUtils.currentLine=279576581;
 //BA.debugLineNum = 279576581;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=279576582;
 //BA.debugLineNum = 279576582;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=279576583;
 //BA.debugLineNum = 279576583;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=279576584;
 //BA.debugLineNum = 279576584;BA.debugLine="vm.SetStateSingle(\"types\", dbsql.result)";
_vm._setstatesingle /*b4j.example.bananovm*/ (null,(Object)("types"),(Object)(_dbsql._result /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 };
RDebugUtils.currentLine=279576586;
 //BA.debugLineNum = 279576586;BA.debugLine="End Sub";
return "";
}
public static String  _stats_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="pgindex";
if (Debug.shouldDelegate(ba, "stats_click", false))
	 {return ((String) Debug.delegate(ba, "stats_click", new Object[] {_e}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub stats_click(e As BANanoEvent)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="HideButtons";
_hidebuttons();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Stats\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._settitle /*b4j.example.vmtoolbar*/ (null,"Expenses.Show - Stats");
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="vm.showpage(modStats.name)";
_vm._showpage /*String*/ (null,_modstats._name /*String*/ );
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="End Sub";
return "";
}
}