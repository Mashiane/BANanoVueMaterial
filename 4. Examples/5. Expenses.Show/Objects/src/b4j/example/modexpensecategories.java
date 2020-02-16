package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class modexpensecategories extends Object{
public static modexpensecategories mostCurrent = new modexpensecategories();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.modexpensecategories", null);
		ba.loadHtSubs(modexpensecategories.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modexpensecategories", ba);
		}
	}
    public static Class<?> getObject() {
		return modexpensecategories.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static b4j.example.vmgijgotable _expensecategory = null;
public static String _mode = "";
public static b4j.example.vmdialog _mdlexpensecategory = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static String  _add() throws Exception{
RDebugUtils.currentModule="modexpensecategories";
if (Debug.shouldDelegate(ba, "add", false))
	 {return ((String) Debug.delegate(ba, "add", null));}
RDebugUtils.currentLine=274071552;
 //BA.debugLineNum = 274071552;BA.debugLine="Sub Add";
RDebugUtils.currentLine=274071553;
 //BA.debugLineNum = 274071553;BA.debugLine="Mode = \"A\"";
_mode = "A";
RDebugUtils.currentLine=274071554;
 //BA.debugLineNum = 274071554;BA.debugLine="mdlExpenseCategory.SetTitle(\"New Expense Category";
_mdlexpensecategory._settitle /*b4j.example.vmdialog*/ (null,"New Expense Category");
RDebugUtils.currentLine=274071555;
 //BA.debugLineNum = 274071555;BA.debugLine="mdlExpenseCategory.Container.setdefaults";
_mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._setdefaults /*String*/ (null);
RDebugUtils.currentLine=274071556;
 //BA.debugLineNum = 274071556;BA.debugLine="vm.showdialog(\"mdlExpenseCategory\")";
_vm._showdialog /*String*/ (null,"mdlExpenseCategory");
RDebugUtils.currentLine=274071557;
 //BA.debugLineNum = 274071557;BA.debugLine="End Sub";
return "";
}
public static String  _refresh() throws Exception{
RDebugUtils.currentModule="modexpensecategories";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
b4j.example.bananomysql _dbsql = null;
RDebugUtils.currentLine=269877248;
 //BA.debugLineNum = 269877248;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=269877249;
 //BA.debugLineNum = 269877249;BA.debugLine="vm.pagepause";
_vm._pagepause /*String*/ (null);
RDebugUtils.currentLine=269877250;
 //BA.debugLineNum = 269877250;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=269877251;
 //BA.debugLineNum = 269877251;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensecategories\",";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expensecategories","id");
RDebugUtils.currentLine=269877252;
 //BA.debugLineNum = 269877252;BA.debugLine="dbsql.SelectAll(Array(\"*\"), Array(\"text\"))";
_dbsql._selectall /*b4j.example.bananomysql*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("text")}));
RDebugUtils.currentLine=269877253;
 //BA.debugLineNum = 269877253;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=269877254;
 //BA.debugLineNum = 269877254;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=269877255;
 //BA.debugLineNum = 269877255;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=269877256;
 //BA.debugLineNum = 269877256;BA.debugLine="expensecategory.SetDataSource(dbsql.result)";
_expensecategory._setdatasource /*b4j.example.vmgijgotable*/ (null,_dbsql._result /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=269877257;
 //BA.debugLineNum = 269877257;BA.debugLine="expensecategory.refresh";
_expensecategory._refresh /*b4j.example.vmgijgotable*/ (null);
 }else {
RDebugUtils.currentLine=269877259;
 //BA.debugLineNum = 269877259;BA.debugLine="Log(\"modExpenseCategories.Refresh: Error - \" & d";
anywheresoftware.b4a.keywords.Common.Log("modExpenseCategories.Refresh: Error - "+_dbsql._error /*String*/ );
 };
RDebugUtils.currentLine=269877261;
 //BA.debugLineNum = 269877261;BA.debugLine="vm.pageresume";
_vm._pageresume /*String*/ (null);
RDebugUtils.currentLine=269877262;
 //BA.debugLineNum = 269877262;BA.debugLine="End Sub";
return "";
}
public static String  _btncancelcategory_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpensecategories";
if (Debug.shouldDelegate(ba, "btncancelcategory_click", false))
	 {return ((String) Debug.delegate(ba, "btncancelcategory_click", new Object[] {_e}));}
RDebugUtils.currentLine=273088512;
 //BA.debugLineNum = 273088512;BA.debugLine="Sub btnCancelCategory_click(e As BANanoEvent)";
RDebugUtils.currentLine=273088513;
 //BA.debugLineNum = 273088513;BA.debugLine="vm.HideDialog(\"mdlExpenseCategory\")";
_vm._hidedialog /*String*/ (null,"mdlExpenseCategory");
RDebugUtils.currentLine=273088514;
 //BA.debugLineNum = 273088514;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavecategory_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpensecategories";
if (Debug.shouldDelegate(ba, "btnsavecategory_click", false))
	 {return ((String) Debug.delegate(ba, "btnsavecategory_click", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _rec = null;
boolean _bvalid = false;
b4j.example.bananomysql _dbsql = null;
String _sid = "";
RDebugUtils.currentLine=273154048;
 //BA.debugLineNum = 273154048;BA.debugLine="Sub btnSaveCategory_click(e As BANanoEvent)";
RDebugUtils.currentLine=273154050;
 //BA.debugLineNum = 273154050;BA.debugLine="Dim rec As Map = mdlExpenseCategory.GetData";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = _mdlexpensecategory._getdata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=273154052;
 //BA.debugLineNum = 273154052;BA.debugLine="Dim bValid As Boolean = vm.validate(rec, mdlExpen";
_bvalid = _vm._validate /*boolean*/ (null,_rec,_mdlexpensecategory._required /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=273154053;
 //BA.debugLineNum = 273154053;BA.debugLine="If bValid = False Then Return";
if (_bvalid==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=273154055;
 //BA.debugLineNum = 273154055;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=273154056;
 //BA.debugLineNum = 273154056;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensecategories\",";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expensecategories","id");
RDebugUtils.currentLine=273154057;
 //BA.debugLineNum = 273154057;BA.debugLine="dbsql.SchemaFromDesign(mdlExpenseCategory.Contain";
_dbsql._schemafromdesign /*String*/ (null,_mdlexpensecategory._container /*b4j.example.vmcontainer*/ );
RDebugUtils.currentLine=273154058;
 //BA.debugLineNum = 273154058;BA.debugLine="Select Case Mode";
switch (BA.switchObjectToInt(_mode,"A","E")) {
case 0: {
RDebugUtils.currentLine=273154060;
 //BA.debugLineNum = 273154060;BA.debugLine="dbsql.RecordFromMap(rec)";
_dbsql._recordfrommap /*String*/ (null,_rec);
RDebugUtils.currentLine=273154061;
 //BA.debugLineNum = 273154061;BA.debugLine="dbsql.Insert";
_dbsql._insert /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=273154062;
 //BA.debugLineNum = 273154062;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=273154063;
 //BA.debugLineNum = 273154063;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=273154064;
 //BA.debugLineNum = 273154064;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=273154065;
 //BA.debugLineNum = 273154065;BA.debugLine="vm.ShowSnackBar(\"Expense Category added success";
_vm._showsnackbar /*String*/ (null,"Expense Category added successfully!");
RDebugUtils.currentLine=273154066;
 //BA.debugLineNum = 273154066;BA.debugLine="vm.HideDialog(\"mdlExpenseCategory\")";
_vm._hidedialog /*String*/ (null,"mdlExpenseCategory");
RDebugUtils.currentLine=273154067;
 //BA.debugLineNum = 273154067;BA.debugLine="Refresh";
_refresh();
 }else {
RDebugUtils.currentLine=273154069;
 //BA.debugLineNum = 273154069;BA.debugLine="Log(\"modExpenseCategories.btnSaveCategory_click";
anywheresoftware.b4a.keywords.Common.Log("modExpenseCategories.btnSaveCategory_click: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=273154070;
 //BA.debugLineNum = 273154070;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
 break; }
case 1: {
RDebugUtils.currentLine=273154073;
 //BA.debugLineNum = 273154073;BA.debugLine="Dim sid As String = rec.Get(\"id\")";
_sid = BA.ObjectToString(_rec.Get((Object)("id")));
RDebugUtils.currentLine=273154074;
 //BA.debugLineNum = 273154074;BA.debugLine="dbsql.RecordFromMap(rec)";
_dbsql._recordfrommap /*String*/ (null,_rec);
RDebugUtils.currentLine=273154075;
 //BA.debugLineNum = 273154075;BA.debugLine="dbsql.Update(sid)";
_dbsql._update /*b4j.example.bananomysql*/ (null,_sid);
RDebugUtils.currentLine=273154076;
 //BA.debugLineNum = 273154076;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=273154077;
 //BA.debugLineNum = 273154077;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=273154078;
 //BA.debugLineNum = 273154078;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=273154079;
 //BA.debugLineNum = 273154079;BA.debugLine="vm.ShowSnackBar(\"Expense Category updated succe";
_vm._showsnackbar /*String*/ (null,"Expense Category updated successfully!");
RDebugUtils.currentLine=273154080;
 //BA.debugLineNum = 273154080;BA.debugLine="vm.HideDialog(\"mdlExpenseCategory\")";
_vm._hidedialog /*String*/ (null,"mdlExpenseCategory");
RDebugUtils.currentLine=273154081;
 //BA.debugLineNum = 273154081;BA.debugLine="Refresh";
_refresh();
 }else {
RDebugUtils.currentLine=273154083;
 //BA.debugLineNum = 273154083;BA.debugLine="Log(\"modExpenseCategories.btnSaveCategory_click";
anywheresoftware.b4a.keywords.Common.Log("modExpenseCategories.btnSaveCategory_click: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=273154084;
 //BA.debugLineNum = 273154084;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
 break; }
}
;
RDebugUtils.currentLine=273154087;
 //BA.debugLineNum = 273154087;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
RDebugUtils.currentModule="modexpensecategories";
if (Debug.shouldDelegate(ba, "code", false))
	 {return ((String) Debug.delegate(ba, "code", null));}
b4j.example.vmcontainer _cont = null;
b4j.example.vminputcontrol _ecid = null;
b4j.example.vminputcontrol _ectext = null;
b4j.example.vminputcontrol _ecdescription = null;
b4j.example.vminputcontrol _ecbudget = null;
RDebugUtils.currentLine=269811712;
 //BA.debugLineNum = 269811712;BA.debugLine="Sub Code";
RDebugUtils.currentLine=269811713;
 //BA.debugLineNum = 269811713;BA.debugLine="Mode = \"\"";
_mode = "";
RDebugUtils.currentLine=269811714;
 //BA.debugLineNum = 269811714;BA.debugLine="Log(\"modExpenseCategories.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modExpenseCategories.Code");
RDebugUtils.currentLine=269811715;
 //BA.debugLineNum = 269811715;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
RDebugUtils.currentLine=269811717;
 //BA.debugLineNum = 269811717;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (null,_name,modexpensecategories.getObject());
RDebugUtils.currentLine=269811719;
 //BA.debugLineNum = 269811719;BA.debugLine="cont.Hide";
_cont._hide /*String*/ (null);
RDebugUtils.currentLine=269811721;
 //BA.debugLineNum = 269811721;BA.debugLine="cont.AddRows(2).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ (null,(int) (2))._addcolumns12 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=269811723;
 //BA.debugLineNum = 269811723;BA.debugLine="expensecategory = vm.CreateGijgoTable(\"expensecat";
_expensecategory = _vm._creategijgotable /*b4j.example.vmgijgotable*/ (null,"expensecategory","id",modexpensecategories.getObject());
RDebugUtils.currentLine=269811724;
 //BA.debugLineNum = 269811724;BA.debugLine="expensecategory.SetTitle(\"Expense Categories\")";
_expensecategory._settitle /*b4j.example.vmgijgotable*/ (null,"Expense Categories");
RDebugUtils.currentLine=269811725;
 //BA.debugLineNum = 269811725;BA.debugLine="expensecategory.AddColumn(\"text\",\"Name\")";
_expensecategory._addcolumn /*b4j.example.vmgijgotable*/ (null,"text","Name");
RDebugUtils.currentLine=269811726;
 //BA.debugLineNum = 269811726;BA.debugLine="expensecategory.AddColumn(\"description\",\"Descript";
_expensecategory._addcolumn /*b4j.example.vmgijgotable*/ (null,"description","Description");
RDebugUtils.currentLine=269811727;
 //BA.debugLineNum = 269811727;BA.debugLine="expensecategory.AddColumn(\"budget\",\"Monthly Budge";
_expensecategory._addcolumn /*b4j.example.vmgijgotable*/ (null,"budget","Monthly Budget");
RDebugUtils.currentLine=269811728;
 //BA.debugLineNum = 269811728;BA.debugLine="expensecategory.AddEditTrash";
_expensecategory._addedittrash /*String*/ (null);
RDebugUtils.currentLine=269811729;
 //BA.debugLineNum = 269811729;BA.debugLine="expensecategory.autoLoad = True";
_expensecategory._autoload /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=269811730;
 //BA.debugLineNum = 269811730;BA.debugLine="expensecategory.SetMoneyColumns(Array(\"budget\"))";
_expensecategory._setmoneycolumns /*b4j.example.vmgijgotable*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("budget")}));
RDebugUtils.currentLine=269811731;
 //BA.debugLineNum = 269811731;BA.debugLine="expensecategory.SetDataSource(Array())";
_expensecategory._setdatasource /*b4j.example.vmgijgotable*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
RDebugUtils.currentLine=269811732;
 //BA.debugLineNum = 269811732;BA.debugLine="cont.AddComponent(1,1, expensecategory.tostring)";
_cont._addcomponent /*String*/ (null,(int) (1),(int) (1),_expensecategory._tostring /*String*/ (null));
RDebugUtils.currentLine=269811734;
 //BA.debugLineNum = 269811734;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (null,_cont);
RDebugUtils.currentLine=269811738;
 //BA.debugLineNum = 269811738;BA.debugLine="mdlExpenseCategory = vm.CreateDialog(\"mdlExpenseC";
_mdlexpensecategory = _vm._createdialog /*b4j.example.vmdialog*/ (null,"mdlExpenseCategory",modexpensecategories.getObject());
RDebugUtils.currentLine=269811739;
 //BA.debugLineNum = 269811739;BA.debugLine="mdlExpenseCategory.SetTitle(\"New Expense Category";
_mdlexpensecategory._settitle /*b4j.example.vmdialog*/ (null,"New Expense Category");
RDebugUtils.currentLine=269811740;
 //BA.debugLineNum = 269811740;BA.debugLine="mdlExpenseCategory.AddCancel(\"btnCancelCategory\",";
_mdlexpensecategory._addcancel /*b4j.example.vmdialog*/ (null,"btnCancelCategory","Cancel");
RDebugUtils.currentLine=269811741;
 //BA.debugLineNum = 269811741;BA.debugLine="mdlExpenseCategory.AddOK(\"btnSaveCategory\", \"Save";
_mdlexpensecategory._addok /*b4j.example.vmdialog*/ (null,"btnSaveCategory","Save");
RDebugUtils.currentLine=269811743;
 //BA.debugLineNum = 269811743;BA.debugLine="Dim ecID As VMInputControl = mdlExpenseCategory.C";
_ecid = _mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._newtext /*b4j.example.vminputcontrol*/ (null,"id","#","",anywheresoftware.b4a.keywords.Common.False,"",(int) (0),"","",(int) (0));
RDebugUtils.currentLine=269811744;
 //BA.debugLineNum = 269811744;BA.debugLine="ecID.SetVisible(False).SetInt";
_ecid._setvisible /*b4j.example.vminputcontrol*/ (null,anywheresoftware.b4a.keywords.Common.False)._setint /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=269811745;
 //BA.debugLineNum = 269811745;BA.debugLine="Dim ecText As VMInputControl = mdlExpenseCategory";
_ectext = _mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._newtext /*b4j.example.vminputcontrol*/ (null,"text","Name","",anywheresoftware.b4a.keywords.Common.True,"",(int) (20),"","The category name is required!",(int) (0));
RDebugUtils.currentLine=269811746;
 //BA.debugLineNum = 269811746;BA.debugLine="Dim ecDescription As VMInputControl = mdlExpenseC";
_ecdescription = _mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._newtextarea /*b4j.example.vminputcontrol*/ (null,"description","Description","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,"",(int) (100),"","",(int) (0));
RDebugUtils.currentLine=269811747;
 //BA.debugLineNum = 269811747;BA.debugLine="Dim ecBudget As VMInputControl = mdlExpenseCatego";
_ecbudget = _mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._newtel /*b4j.example.vminputcontrol*/ (null,"budget","Monthly Budget","",anywheresoftware.b4a.keywords.Common.True,"","","The monthly budget is required!",(int) (0));
RDebugUtils.currentLine=269811748;
 //BA.debugLineNum = 269811748;BA.debugLine="ecBudget.SetDouble";
_ecbudget._setdouble /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=269811750;
 //BA.debugLineNum = 269811750;BA.debugLine="mdlExpenseCategory.Container.AddControlS(ecID, 1,";
_mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (null,_ecid,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=269811751;
 //BA.debugLineNum = 269811751;BA.debugLine="mdlExpenseCategory.Container.AddControlS(ecText,";
_mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (null,_ectext,BA.NumberToString(2),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=269811752;
 //BA.debugLineNum = 269811752;BA.debugLine="mdlExpenseCategory.Container.AddControlS(ecDescri";
_mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (null,_ecdescription,BA.NumberToString(3),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=269811753;
 //BA.debugLineNum = 269811753;BA.debugLine="mdlExpenseCategory.Container.AddControlS(ecBudget";
_mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (null,_ecbudget,BA.NumberToString(4),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=269811755;
 //BA.debugLineNum = 269811755;BA.debugLine="mdlExpenseCategory.SetClickOutsideToClose(False)";
_mdlexpensecategory._setclickoutsidetoclose /*b4j.example.vmdialog*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=269811756;
 //BA.debugLineNum = 269811756;BA.debugLine="mdlExpenseCategory.SetCloseOnEsc(False)";
_mdlexpensecategory._setcloseonesc /*b4j.example.vmdialog*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=269811757;
 //BA.debugLineNum = 269811757;BA.debugLine="mdlExpenseCategory.SetWidth(\"500px\")";
_mdlexpensecategory._setwidth /*b4j.example.vmdialog*/ (null,"500px");
RDebugUtils.currentLine=269811758;
 //BA.debugLineNum = 269811758;BA.debugLine="vm.AddDialog(mdlExpenseCategory)";
_vm._adddialog /*String*/ (null,_mdlexpensecategory);
RDebugUtils.currentLine=269811759;
 //BA.debugLineNum = 269811759;BA.debugLine="End Sub";
return "";
}
public static String  _expensecategory_delete(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpensecategories";
if (Debug.shouldDelegate(ba, "expensecategory_delete", false))
	 {return ((String) Debug.delegate(ba, "expensecategory_delete", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _sid = "";
String _stext = "";
RDebugUtils.currentLine=276037632;
 //BA.debugLineNum = 276037632;BA.debugLine="Sub expensecategory_delete(e As BANanoEvent)";
RDebugUtils.currentLine=276037634;
 //BA.debugLineNum = 276037634;BA.debugLine="Dim rec As Map = expensecategory.GetRecordFromEve";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = _expensecategory._getrecordfromevent /*anywheresoftware.b4a.objects.collections.Map*/ (null,_e);
RDebugUtils.currentLine=276037635;
 //BA.debugLineNum = 276037635;BA.debugLine="Dim sid As String = rec.GetDefault(\"id\",\"\")";
_sid = BA.ObjectToString(_rec.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=276037636;
 //BA.debugLineNum = 276037636;BA.debugLine="Dim stext As String = rec.getdefault(\"text\",\"\")";
_stext = BA.ObjectToString(_rec.GetDefault((Object)("text"),(Object)("")));
RDebugUtils.currentLine=276037637;
 //BA.debugLineNum = 276037637;BA.debugLine="If sid = \"\" Then Return";
if ((_sid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=276037639;
 //BA.debugLineNum = 276037639;BA.debugLine="vm.SetStateSingle(\"categoryid\", sid)";
_vm._setstatesingle /*b4j.example.bananovm*/ (null,(Object)("categoryid"),(Object)(_sid));
RDebugUtils.currentLine=276037641;
 //BA.debugLineNum = 276037641;BA.debugLine="vm.ShowConfirm(\"delete_category\", $\"Confirm Delet";
_vm._showconfirm /*String*/ (null,"delete_category",("Confirm Delete: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stext))+""),"Are you sure that you want to delete this expense category. You will not be able to undo your actions. Continue?","Ok","Cancel");
RDebugUtils.currentLine=276037643;
 //BA.debugLineNum = 276037643;BA.debugLine="End Sub";
return "";
}
public static String  _expensecategory_edit(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpensecategories";
if (Debug.shouldDelegate(ba, "expensecategory_edit", false))
	 {return ((String) Debug.delegate(ba, "expensecategory_edit", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _sid = "";
RDebugUtils.currentLine=275709952;
 //BA.debugLineNum = 275709952;BA.debugLine="Sub expensecategory_edit(e As BANanoEvent)";
RDebugUtils.currentLine=275709954;
 //BA.debugLineNum = 275709954;BA.debugLine="Dim rec As Map = expensecategory.GetRecordFromEve";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = _expensecategory._getrecordfromevent /*anywheresoftware.b4a.objects.collections.Map*/ (null,_e);
RDebugUtils.currentLine=275709955;
 //BA.debugLineNum = 275709955;BA.debugLine="Dim sid As String = rec.GetDefault(\"id\",\"\")";
_sid = BA.ObjectToString(_rec.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=275709956;
 //BA.debugLineNum = 275709956;BA.debugLine="If sid = \"\" Then Return";
if ((_sid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=275709958;
 //BA.debugLineNum = 275709958;BA.debugLine="Mode = \"E\"";
_mode = "E";
RDebugUtils.currentLine=275709960;
 //BA.debugLineNum = 275709960;BA.debugLine="mdlExpenseCategory.SetTitle(\"Edit Expense Categor";
_mdlexpensecategory._settitle /*b4j.example.vmdialog*/ (null,"Edit Expense Category");
RDebugUtils.currentLine=275709962;
 //BA.debugLineNum = 275709962;BA.debugLine="mdlExpenseCategory.Container.setdefaults";
_mdlexpensecategory._container /*b4j.example.vmcontainer*/ ._setdefaults /*String*/ (null);
RDebugUtils.currentLine=275709964;
 //BA.debugLineNum = 275709964;BA.debugLine="vm.SetState(rec)";
_vm._setstate /*b4j.example.bananovm*/ (null,_rec);
RDebugUtils.currentLine=275709966;
 //BA.debugLineNum = 275709966;BA.debugLine="vm.showdialog(\"mdlExpenseCategory\")";
_vm._showdialog /*String*/ (null,"mdlExpenseCategory");
RDebugUtils.currentLine=275709967;
 //BA.debugLineNum = 275709967;BA.debugLine="End Sub";
return "";
}
}