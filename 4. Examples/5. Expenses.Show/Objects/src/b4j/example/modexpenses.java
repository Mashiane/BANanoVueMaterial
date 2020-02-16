package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class modexpenses extends Object{
public static modexpenses mostCurrent = new modexpenses();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.modexpenses", null);
		ba.loadHtSubs(modexpenses.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modexpenses", ba);
		}
	}
    public static Class<?> getObject() {
		return modexpenses.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static String _mode = "";
public static b4j.example.vmdialog _mdlexpenses = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.vmgijgotable _expenses = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static String  _add() throws Exception{
RDebugUtils.currentModule="modexpenses";
if (Debug.shouldDelegate(ba, "add", false))
	 {return ((String) Debug.delegate(ba, "add", null));}
RDebugUtils.currentLine=276824064;
 //BA.debugLineNum = 276824064;BA.debugLine="Sub Add";
RDebugUtils.currentLine=276824065;
 //BA.debugLineNum = 276824065;BA.debugLine="Mode = \"A\"";
_mode = "A";
RDebugUtils.currentLine=276824066;
 //BA.debugLineNum = 276824066;BA.debugLine="vm.CallMethod(\"LoadTypes\")";
_vm._callmethod /*String*/ (null,"LoadTypes");
RDebugUtils.currentLine=276824067;
 //BA.debugLineNum = 276824067;BA.debugLine="vm.CallMethod(\"LoadCategories\")";
_vm._callmethod /*String*/ (null,"LoadCategories");
RDebugUtils.currentLine=276824068;
 //BA.debugLineNum = 276824068;BA.debugLine="mdlExpenses.Container.SetDefaults";
_mdlexpenses._container /*b4j.example.vmcontainer*/ ._setdefaults /*String*/ (null);
RDebugUtils.currentLine=276824069;
 //BA.debugLineNum = 276824069;BA.debugLine="mdlExpenses.SetTitle(\"New Expense\")";
_mdlexpenses._settitle /*b4j.example.vmdialog*/ (null,"New Expense");
RDebugUtils.currentLine=276824070;
 //BA.debugLineNum = 276824070;BA.debugLine="vm.ShowDialog(\"mdlExpenses\")";
_vm._showdialog /*String*/ (null,"mdlExpenses");
RDebugUtils.currentLine=276824071;
 //BA.debugLineNum = 276824071;BA.debugLine="End Sub";
return "";
}
public static String  _refresh() throws Exception{
RDebugUtils.currentModule="modexpenses";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
b4j.example.bananomysql _dbsql = null;
RDebugUtils.currentLine=276889600;
 //BA.debugLineNum = 276889600;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=276889601;
 //BA.debugLineNum = 276889601;BA.debugLine="vm.pagepause";
_vm._pagepause /*String*/ (null);
RDebugUtils.currentLine=276889602;
 //BA.debugLineNum = 276889602;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=276889603;
 //BA.debugLineNum = 276889603;BA.debugLine="dbsql.Initialize(Main.dbase, \"expenses\", \"id\")";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expenses","id");
RDebugUtils.currentLine=276889604;
 //BA.debugLineNum = 276889604;BA.debugLine="dbsql.SelectAll(Array(\"*\"), Array(\"id\"))";
_dbsql._selectall /*b4j.example.bananomysql*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
RDebugUtils.currentLine=276889605;
 //BA.debugLineNum = 276889605;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=276889606;
 //BA.debugLineNum = 276889606;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=276889607;
 //BA.debugLineNum = 276889607;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=276889608;
 //BA.debugLineNum = 276889608;BA.debugLine="expenses.SetDataSource(dbsql.result)";
_expenses._setdatasource /*b4j.example.vmgijgotable*/ (null,_dbsql._result /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=276889609;
 //BA.debugLineNum = 276889609;BA.debugLine="expenses.refresh";
_expenses._refresh /*b4j.example.vmgijgotable*/ (null);
 }else {
RDebugUtils.currentLine=276889611;
 //BA.debugLineNum = 276889611;BA.debugLine="Log(\"modExpenses.Refresh: Error - \" & dbsql.erro";
anywheresoftware.b4a.keywords.Common.Log("modExpenses.Refresh: Error - "+_dbsql._error /*String*/ );
 };
RDebugUtils.currentLine=276889613;
 //BA.debugLineNum = 276889613;BA.debugLine="vm.pageresume";
_vm._pageresume /*String*/ (null);
RDebugUtils.currentLine=276889614;
 //BA.debugLineNum = 276889614;BA.debugLine="End Sub";
return "";
}
public static String  _btncancelexpense_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpenses";
if (Debug.shouldDelegate(ba, "btncancelexpense_click", false))
	 {return ((String) Debug.delegate(ba, "btncancelexpense_click", new Object[] {_e}));}
RDebugUtils.currentLine=277741568;
 //BA.debugLineNum = 277741568;BA.debugLine="Sub btnCancelExpense_click(e As BANanoEvent)";
RDebugUtils.currentLine=277741569;
 //BA.debugLineNum = 277741569;BA.debugLine="vm.hidedialog(\"mdlExpenses\")";
_vm._hidedialog /*String*/ (null,"mdlExpenses");
RDebugUtils.currentLine=277741570;
 //BA.debugLineNum = 277741570;BA.debugLine="End Sub";
return "";
}
public static String  _btnsaveexpense_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpenses";
if (Debug.shouldDelegate(ba, "btnsaveexpense_click", false))
	 {return ((String) Debug.delegate(ba, "btnsaveexpense_click", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _expense = null;
boolean _bvalid = false;
b4j.example.bananomysql _dbsql = null;
String _sid = "";
RDebugUtils.currentLine=278134784;
 //BA.debugLineNum = 278134784;BA.debugLine="Sub btnSaveExpense_click(e As BANanoEvent)";
RDebugUtils.currentLine=278134786;
 //BA.debugLineNum = 278134786;BA.debugLine="Dim expense As Map = mdlExpenses.Container.GetDat";
_expense = new anywheresoftware.b4a.objects.collections.Map();
_expense = _mdlexpenses._container /*b4j.example.vmcontainer*/ ._getdata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=278134788;
 //BA.debugLineNum = 278134788;BA.debugLine="Dim bValid As Boolean = vm.Validate(expense, mdlE";
_bvalid = _vm._validate /*boolean*/ (null,_expense,_mdlexpenses._container /*b4j.example.vmcontainer*/ ._required /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=278134789;
 //BA.debugLineNum = 278134789;BA.debugLine="If bValid = False Then Return";
if (_bvalid==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=278134792;
 //BA.debugLineNum = 278134792;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=278134793;
 //BA.debugLineNum = 278134793;BA.debugLine="dbsql.Initialize(Main.dbase, \"expenses\", \"id\")";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expenses","id");
RDebugUtils.currentLine=278134794;
 //BA.debugLineNum = 278134794;BA.debugLine="dbsql.SchemaFromDesign(mdlExpenses.Container)";
_dbsql._schemafromdesign /*String*/ (null,_mdlexpenses._container /*b4j.example.vmcontainer*/ );
RDebugUtils.currentLine=278134795;
 //BA.debugLineNum = 278134795;BA.debugLine="Select Case Mode";
switch (BA.switchObjectToInt(_mode,"A","E")) {
case 0: {
RDebugUtils.currentLine=278134797;
 //BA.debugLineNum = 278134797;BA.debugLine="dbsql.RecordFromMap(expense)";
_dbsql._recordfrommap /*String*/ (null,_expense);
RDebugUtils.currentLine=278134798;
 //BA.debugLineNum = 278134798;BA.debugLine="dbsql.Insert";
_dbsql._insert /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=278134799;
 //BA.debugLineNum = 278134799;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=278134800;
 //BA.debugLineNum = 278134800;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=278134801;
 //BA.debugLineNum = 278134801;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=278134802;
 //BA.debugLineNum = 278134802;BA.debugLine="vm.ShowSnackBar(\"Expense added successfully!\")";
_vm._showsnackbar /*String*/ (null,"Expense added successfully!");
RDebugUtils.currentLine=278134803;
 //BA.debugLineNum = 278134803;BA.debugLine="vm.HideDialog(\"mdlExpenses\")";
_vm._hidedialog /*String*/ (null,"mdlExpenses");
RDebugUtils.currentLine=278134804;
 //BA.debugLineNum = 278134804;BA.debugLine="Refresh";
_refresh();
 }else {
RDebugUtils.currentLine=278134806;
 //BA.debugLineNum = 278134806;BA.debugLine="Log(\"modExpenses.btnSaveExpense_click: Error -";
anywheresoftware.b4a.keywords.Common.Log("modExpenses.btnSaveExpense_click: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=278134807;
 //BA.debugLineNum = 278134807;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
 break; }
case 1: {
RDebugUtils.currentLine=278134810;
 //BA.debugLineNum = 278134810;BA.debugLine="Dim sid As String = expense.Get(\"id\")";
_sid = BA.ObjectToString(_expense.Get((Object)("id")));
RDebugUtils.currentLine=278134811;
 //BA.debugLineNum = 278134811;BA.debugLine="dbsql.RecordFromMap(expense)";
_dbsql._recordfrommap /*String*/ (null,_expense);
RDebugUtils.currentLine=278134812;
 //BA.debugLineNum = 278134812;BA.debugLine="dbsql.Update(sid)";
_dbsql._update /*b4j.example.bananomysql*/ (null,_sid);
RDebugUtils.currentLine=278134813;
 //BA.debugLineNum = 278134813;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=278134814;
 //BA.debugLineNum = 278134814;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=278134815;
 //BA.debugLineNum = 278134815;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=278134816;
 //BA.debugLineNum = 278134816;BA.debugLine="vm.ShowSnackBar(\"Expense updated successfully!\"";
_vm._showsnackbar /*String*/ (null,"Expense updated successfully!");
RDebugUtils.currentLine=278134817;
 //BA.debugLineNum = 278134817;BA.debugLine="vm.HideDialog(\"mdlExpenses\")";
_vm._hidedialog /*String*/ (null,"mdlExpenses");
RDebugUtils.currentLine=278134818;
 //BA.debugLineNum = 278134818;BA.debugLine="Refresh";
_refresh();
 }else {
RDebugUtils.currentLine=278134820;
 //BA.debugLineNum = 278134820;BA.debugLine="Log(\"modExpenses.btnSaveExpense_click: Error -";
anywheresoftware.b4a.keywords.Common.Log("modExpenses.btnSaveExpense_click: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=278134821;
 //BA.debugLineNum = 278134821;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
 break; }
}
;
RDebugUtils.currentLine=278134824;
 //BA.debugLineNum = 278134824;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
RDebugUtils.currentModule="modexpenses";
if (Debug.shouldDelegate(ba, "code", false))
	 {return ((String) Debug.delegate(ba, "code", null));}
b4j.example.vmcontainer _cont = null;
b4j.example.vminputcontrol _expense_id = null;
b4j.example.vminputcontrol _expense_date = null;
b4j.example.vminputcontrol _expense_category = null;
b4j.example.vminputcontrol _expense_type = null;
b4j.example.vminputcontrol _expense_amount = null;
b4j.example.vminputcontrol _expense_description = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Code";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Log(\"modExpenses.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modExpenses.Code");
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (null,_name,modexpenses.getObject());
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="cont.Hide";
_cont._hide /*String*/ (null);
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="cont.AddRows(1).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ (null,(int) (1))._addcolumns12 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="expenses = vm.CreateGijgoTable(\"expensetable\", \"i";
_expenses = _vm._creategijgotable /*b4j.example.vmgijgotable*/ (null,"expensetable","id",modexpenses.getObject());
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="expenses.SetTitle(\"Expenses\")";
_expenses._settitle /*b4j.example.vmgijgotable*/ (null,"Expenses");
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="expenses.AddColumn(\"expense_date\",\"Date\")";
_expenses._addcolumn /*b4j.example.vmgijgotable*/ (null,"expense_date","Date");
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="expenses.AddColumn(\"expense_category\",\"Category\")";
_expenses._addcolumn /*b4j.example.vmgijgotable*/ (null,"expense_category","Category");
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="expenses.AddColumn(\"expense_type\",\"Type\")";
_expenses._addcolumn /*b4j.example.vmgijgotable*/ (null,"expense_type","Type");
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="expenses.AddColumn(\"expense_description\",\"Descrip";
_expenses._addcolumn /*b4j.example.vmgijgotable*/ (null,"expense_description","Description");
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="expenses.AddColumn(\"expense_amount\",\"Amount\")";
_expenses._addcolumn /*b4j.example.vmgijgotable*/ (null,"expense_amount","Amount");
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="expenses.AddEditTrash";
_expenses._addedittrash /*String*/ (null);
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="expenses.autoLoad = True";
_expenses._autoload /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="expenses.SetMoneyColumns(Array(\"expense_amount\"))";
_expenses._setmoneycolumns /*b4j.example.vmgijgotable*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("expense_amount")}));
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="expenses.SetColumnsHidden(Array(\"id\"))";
_expenses._setcolumnshidden /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id")}));
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="expenses.SetDataSource(Array())";
_expenses._setdatasource /*b4j.example.vmgijgotable*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="cont.AddComponent(1,1, expenses.tostring)";
_cont._addcomponent /*String*/ (null,(int) (1),(int) (1),_expenses._tostring /*String*/ (null));
RDebugUtils.currentLine=1114137;
 //BA.debugLineNum = 1114137;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (null,_cont);
RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="mdlExpenses = vm.CreateDialog(\"mdlExpenses\",Me)";
_mdlexpenses = _vm._createdialog /*b4j.example.vmdialog*/ (null,"mdlExpenses",modexpenses.getObject());
RDebugUtils.currentLine=1114141;
 //BA.debugLineNum = 1114141;BA.debugLine="mdlExpenses.settitle(\"New Expense\")";
_mdlexpenses._settitle /*b4j.example.vmdialog*/ (null,"New Expense");
RDebugUtils.currentLine=1114142;
 //BA.debugLineNum = 1114142;BA.debugLine="mdlExpenses.AddCancel(\"btnCancelExpense\", \"Cancel";
_mdlexpenses._addcancel /*b4j.example.vmdialog*/ (null,"btnCancelExpense","Cancel");
RDebugUtils.currentLine=1114143;
 //BA.debugLineNum = 1114143;BA.debugLine="mdlExpenses.AddOK(\"btnSaveExpense\", \"Save\")";
_mdlexpenses._addok /*b4j.example.vmdialog*/ (null,"btnSaveExpense","Save");
RDebugUtils.currentLine=1114145;
 //BA.debugLineNum = 1114145;BA.debugLine="Dim expense_id As VMInputControl = mdlExpenses.Co";
_expense_id = _mdlexpenses._container /*b4j.example.vmcontainer*/ ._newtext /*b4j.example.vminputcontrol*/ (null,"id","#","",anywheresoftware.b4a.keywords.Common.False,"",(int) (0),"","",(int) (0))._setvisible /*b4j.example.vminputcontrol*/ (null,anywheresoftware.b4a.keywords.Common.False)._setint /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=1114146;
 //BA.debugLineNum = 1114146;BA.debugLine="Dim expense_date As VMInputControl = mdlExpenses.";
_expense_date = _mdlexpenses._container /*b4j.example.vmcontainer*/ ._newdatepicker /*b4j.example.vminputcontrol*/ (null,"expense_date","Date",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True,"",(int) (0));
RDebugUtils.currentLine=1114147;
 //BA.debugLineNum = 1114147;BA.debugLine="Dim expense_category As VMInputControl = mdlExpen";
_expense_category = _mdlexpenses._container /*b4j.example.vmcontainer*/ ._newselect /*b4j.example.vminputcontrol*/ (null,"expense_category","Category",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,"","categories","id","text","","The category should be specified!",(int) (0))._setint /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=1114148;
 //BA.debugLineNum = 1114148;BA.debugLine="Dim expense_type As VMInputControl = mdlExpenses.";
_expense_type = _mdlexpenses._container /*b4j.example.vmcontainer*/ ._newselect /*b4j.example.vminputcontrol*/ (null,"expense_type","Type",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,"","types","id","text","","The type should be specified!",(int) (0))._setint /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=1114149;
 //BA.debugLineNum = 1114149;BA.debugLine="Dim expense_amount As VMInputControl = mdlExpense";
_expense_amount = _mdlexpenses._container /*b4j.example.vmcontainer*/ ._newtel /*b4j.example.vminputcontrol*/ (null,"expense_amount","Amount","",anywheresoftware.b4a.keywords.Common.True,"","","The amount should be specified!",(int) (0))._setdouble /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=1114150;
 //BA.debugLineNum = 1114150;BA.debugLine="Dim expense_description As VMInputControl = mdlEx";
_expense_description = _mdlexpenses._container /*b4j.example.vmcontainer*/ ._newtextarea /*b4j.example.vminputcontrol*/ (null,"expense_description","Description","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,"",(int) (100),"","",(int) (0));
RDebugUtils.currentLine=1114152;
 //BA.debugLineNum = 1114152;BA.debugLine="mdlExpenses.Container.AddControl(expense_id, 1, 1";
_mdlexpenses._container /*b4j.example.vmcontainer*/ ._addcontrol /*String*/ (null,_expense_id,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=1114153;
 //BA.debugLineNum = 1114153;BA.debugLine="mdlExpenses.Container.AddControl(expense_date, 2,";
_mdlexpenses._container /*b4j.example.vmcontainer*/ ._addcontrol /*String*/ (null,_expense_date,BA.NumberToString(2),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=1114154;
 //BA.debugLineNum = 1114154;BA.debugLine="mdlExpenses.Container.AddControl(expense_category";
_mdlexpenses._container /*b4j.example.vmcontainer*/ ._addcontrol /*String*/ (null,_expense_category,BA.NumberToString(2),BA.NumberToString(2),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=1114155;
 //BA.debugLineNum = 1114155;BA.debugLine="mdlExpenses.Container.AddControl(expense_type, 3,";
_mdlexpenses._container /*b4j.example.vmcontainer*/ ._addcontrol /*String*/ (null,_expense_type,BA.NumberToString(3),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=1114156;
 //BA.debugLineNum = 1114156;BA.debugLine="mdlExpenses.Container.AddControl(expense_amount,";
_mdlexpenses._container /*b4j.example.vmcontainer*/ ._addcontrol /*String*/ (null,_expense_amount,BA.NumberToString(3),BA.NumberToString(2),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=1114157;
 //BA.debugLineNum = 1114157;BA.debugLine="mdlExpenses.Container.AddControl(expense_descript";
_mdlexpenses._container /*b4j.example.vmcontainer*/ ._addcontrol /*String*/ (null,_expense_description,BA.NumberToString(4),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=1114159;
 //BA.debugLineNum = 1114159;BA.debugLine="mdlExpenses.SetClickOutsideToClose(False)";
_mdlexpenses._setclickoutsidetoclose /*b4j.example.vmdialog*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114160;
 //BA.debugLineNum = 1114160;BA.debugLine="mdlExpenses.SetCloseOnEsc(False)";
_mdlexpenses._setcloseonesc /*b4j.example.vmdialog*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114161;
 //BA.debugLineNum = 1114161;BA.debugLine="mdlExpenses.SetWidth(\"700px\")";
_mdlexpenses._setwidth /*b4j.example.vmdialog*/ (null,"700px");
RDebugUtils.currentLine=1114162;
 //BA.debugLineNum = 1114162;BA.debugLine="vm.AddDialog(mdlExpenses)";
_vm._adddialog /*String*/ (null,_mdlexpenses);
RDebugUtils.currentLine=1114164;
 //BA.debugLineNum = 1114164;BA.debugLine="End Sub";
return "";
}
}