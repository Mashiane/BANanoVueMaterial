package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modexpenses_subs_0 {


public static RemoteObject  _add() throws Exception{
try {
		Debug.PushSubsStack("Add (modexpenses) ","modexpenses",3,modexpenses.ba,modexpenses.mostCurrent,112);
if (RapidSub.canDelegate("add")) { return b4j.example.modexpenses.remoteMe.runUserSub(false, "modexpenses","add");}
 BA.debugLineNum = 112;BA.debugLine="Sub Add";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Mode = \"A\"";
Debug.ShouldStop(65536);
modexpenses._mode = BA.ObjectToString("A");
 BA.debugLineNum = 114;BA.debugLine="vm.CallMethod(\"LoadTypes\")";
Debug.ShouldStop(131072);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_callmethod" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("LoadTypes")));
 BA.debugLineNum = 115;BA.debugLine="vm.CallMethod(\"LoadCategories\")";
Debug.ShouldStop(262144);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_callmethod" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("LoadCategories")));
 BA.debugLineNum = 116;BA.debugLine="mdlExpenses.Container.SetDefaults";
Debug.ShouldStop(524288);
modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_setdefaults" /*RemoteObject*/ );
 BA.debugLineNum = 117;BA.debugLine="mdlExpenses.SetTitle(\"New Expense\")";
Debug.ShouldStop(1048576);
modexpenses._mdlexpenses.runClassMethod (b4j.example.vmdialog.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("New Expense")));
 BA.debugLineNum = 118;BA.debugLine="vm.ShowDialog(\"mdlExpenses\")";
Debug.ShouldStop(2097152);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_showdialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenses")));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancelexpense_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnCancelExpense_click (modexpenses) ","modexpenses",3,modexpenses.ba,modexpenses.mostCurrent,65);
if (RapidSub.canDelegate("btncancelexpense_click")) { return b4j.example.modexpenses.remoteMe.runUserSub(false, "modexpenses","btncancelexpense_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 65;BA.debugLine="Sub btnCancelExpense_click(e As BANanoEvent)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="vm.hidedialog(\"mdlExpenses\")";
Debug.ShouldStop(2);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenses")));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsaveexpense_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnSaveExpense_click (modexpenses) ","modexpenses",3,modexpenses.ba,modexpenses.mostCurrent,69);
if (RapidSub.canDelegate("btnsaveexpense_click")) { return b4j.example.modexpenses.remoteMe.runUserSub(false, "modexpenses","btnsaveexpense_click", _e);}
RemoteObject _expense = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bvalid = RemoteObject.createImmutable(false);
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
RemoteObject _sid = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 69;BA.debugLine="Sub btnSaveExpense_click(e As BANanoEvent)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="Dim expense As Map = mdlExpenses.Container.GetDat";
Debug.ShouldStop(64);
_expense = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_expense = modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_getdata" /*RemoteObject*/ );Debug.locals.put("expense", _expense);Debug.locals.put("expense", _expense);
 BA.debugLineNum = 73;BA.debugLine="Dim bValid As Boolean = vm.Validate(expense, mdlE";
Debug.ShouldStop(256);
_bvalid = modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_validate" /*RemoteObject*/ ,(Object)(_expense),(Object)(modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).getField(false,"_required" /*RemoteObject*/ )));Debug.locals.put("bValid", _bvalid);Debug.locals.put("bValid", _bvalid);
 BA.debugLineNum = 74;BA.debugLine="If bValid = False Then Return";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_bvalid,modexpenses.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 77;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(4096);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 78;BA.debugLine="dbsql.Initialize(Main.dbase, \"expenses\", \"id\")";
Debug.ShouldStop(8192);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,modexpenses.ba,(Object)(modexpenses._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expenses")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 79;BA.debugLine="dbsql.SchemaFromDesign(mdlExpenses.Container)";
Debug.ShouldStop(16384);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_schemafromdesign" /*RemoteObject*/ ,(Object)(modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="Select Case Mode";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(modexpenses._mode,BA.ObjectToString("A"),BA.ObjectToString("E"))) {
case 0: {
 BA.debugLineNum = 82;BA.debugLine="dbsql.RecordFromMap(expense)";
Debug.ShouldStop(131072);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_recordfrommap" /*RemoteObject*/ ,(Object)(_expense));
 BA.debugLineNum = 83;BA.debugLine="dbsql.Insert";
Debug.ShouldStop(262144);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_insert" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
Debug.ShouldStop(524288);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpenses._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 85;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(1048576);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(2097152);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 87;BA.debugLine="vm.ShowSnackBar(\"Expense added successfully!\")";
Debug.ShouldStop(4194304);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense added successfully!")));
 BA.debugLineNum = 88;BA.debugLine="vm.HideDialog(\"mdlExpenses\")";
Debug.ShouldStop(8388608);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenses")));
 BA.debugLineNum = 89;BA.debugLine="Refresh";
Debug.ShouldStop(16777216);
_refresh();
 }else {
 BA.debugLineNum = 91;BA.debugLine="Log(\"modExpenses.btnSaveExpense_click: Error -";
Debug.ShouldStop(67108864);
modexpenses.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenses.btnSaveExpense_click: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 92;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(134217728);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 break; }
case 1: {
 BA.debugLineNum = 95;BA.debugLine="Dim sid As String = expense.Get(\"id\")";
Debug.ShouldStop(1073741824);
_sid = BA.ObjectToString(_expense.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 96;BA.debugLine="dbsql.RecordFromMap(expense)";
Debug.ShouldStop(-2147483648);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_recordfrommap" /*RemoteObject*/ ,(Object)(_expense));
 BA.debugLineNum = 97;BA.debugLine="dbsql.Update(sid)";
Debug.ShouldStop(1);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_update" /*RemoteObject*/ ,(Object)(_sid));
 BA.debugLineNum = 98;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
Debug.ShouldStop(2);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpenses._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 99;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(4);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(8);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 101;BA.debugLine="vm.ShowSnackBar(\"Expense updated successfully!\"";
Debug.ShouldStop(16);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense updated successfully!")));
 BA.debugLineNum = 102;BA.debugLine="vm.HideDialog(\"mdlExpenses\")";
Debug.ShouldStop(32);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenses")));
 BA.debugLineNum = 103;BA.debugLine="Refresh";
Debug.ShouldStop(64);
_refresh();
 }else {
 BA.debugLineNum = 105;BA.debugLine="Log(\"modExpenses.btnSaveExpense_click: Error -";
Debug.ShouldStop(256);
modexpenses.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenses.btnSaveExpense_click: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 106;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(512);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 break; }
}
;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _code() throws Exception{
try {
		Debug.PushSubsStack("Code (modexpenses) ","modexpenses",3,modexpenses.ba,modexpenses.mostCurrent,11);
if (RapidSub.canDelegate("code")) { return b4j.example.modexpenses.remoteMe.runUserSub(false, "modexpenses","code");}
RemoteObject _cont = RemoteObject.declareNull("b4j.example.vmcontainer");
RemoteObject _expense_id = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_date = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_category = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_type = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_amount = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_description = RemoteObject.declareNull("b4j.example.vminputcontrol");
 BA.debugLineNum = 11;BA.debugLine="Sub Code";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Log(\"modExpenses.Code\")";
Debug.ShouldStop(2048);
modexpenses.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("modExpenses.Code")));
 BA.debugLineNum = 13;BA.debugLine="vm = pgIndex.vm";
Debug.ShouldStop(4096);
modexpenses._vm = modexpenses._pgindex._vm /*RemoteObject*/ ;
 BA.debugLineNum = 15;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
Debug.ShouldStop(16384);
_cont = modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_createcontainer" /*RemoteObject*/ ,(Object)(modexpenses._name),(Object)(modexpenses.getObject()));Debug.locals.put("cont", _cont);Debug.locals.put("cont", _cont);
 BA.debugLineNum = 17;BA.debugLine="cont.Hide";
Debug.ShouldStop(65536);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 19;BA.debugLine="cont.AddRows(1).AddColumns12";
Debug.ShouldStop(262144);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addrows" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns12" /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="expenses = vm.CreateGijgoTable(\"expensetable\", \"i";
Debug.ShouldStop(1048576);
modexpenses._expenses = modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_creategijgotable" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expensetable")),(Object)(BA.ObjectToString("id")),(Object)(modexpenses.getObject()));
 BA.debugLineNum = 22;BA.debugLine="expenses.SetTitle(\"Expenses\")";
Debug.ShouldStop(2097152);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expenses")));
 BA.debugLineNum = 23;BA.debugLine="expenses.AddColumn(\"expense_date\",\"Date\")";
Debug.ShouldStop(4194304);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_date")),(Object)(RemoteObject.createImmutable("Date")));
 BA.debugLineNum = 24;BA.debugLine="expenses.AddColumn(\"expense_category\",\"Category\")";
Debug.ShouldStop(8388608);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_category")),(Object)(RemoteObject.createImmutable("Category")));
 BA.debugLineNum = 25;BA.debugLine="expenses.AddColumn(\"expense_type\",\"Type\")";
Debug.ShouldStop(16777216);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_type")),(Object)(RemoteObject.createImmutable("Type")));
 BA.debugLineNum = 26;BA.debugLine="expenses.AddColumn(\"expense_description\",\"Descrip";
Debug.ShouldStop(33554432);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_description")),(Object)(RemoteObject.createImmutable("Description")));
 BA.debugLineNum = 27;BA.debugLine="expenses.AddColumn(\"expense_amount\",\"Amount\")";
Debug.ShouldStop(67108864);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_amount")),(Object)(RemoteObject.createImmutable("Amount")));
 BA.debugLineNum = 28;BA.debugLine="expenses.AddEditTrash";
Debug.ShouldStop(134217728);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_addedittrash" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="expenses.autoLoad = True";
Debug.ShouldStop(268435456);
modexpenses._expenses.setField ("_autoload" /*RemoteObject*/ ,modexpenses.__c.getField(true,"True"));
 BA.debugLineNum = 30;BA.debugLine="expenses.SetMoneyColumns(Array(\"expense_amount\"))";
Debug.ShouldStop(536870912);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_setmoneycolumns" /*RemoteObject*/ ,(Object)(modexpenses.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("expense_amount"))})))));
 BA.debugLineNum = 31;BA.debugLine="expenses.SetColumnsHidden(Array(\"id\"))";
Debug.ShouldStop(1073741824);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnshidden" /*RemoteObject*/ ,(Object)(modexpenses.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("id"))})))));
 BA.debugLineNum = 32;BA.debugLine="expenses.SetDataSource(Array())";
Debug.ShouldStop(-2147483648);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_setdatasource" /*RemoteObject*/ ,(Object)(modexpenses.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {})))));
 BA.debugLineNum = 33;BA.debugLine="cont.AddComponent(1,1, expenses.tostring)";
Debug.ShouldStop(1);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="vm.AddContainer(cont)";
Debug.ShouldStop(8);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_addcontainer" /*RemoteObject*/ ,(Object)(_cont));
 BA.debugLineNum = 39;BA.debugLine="mdlExpenses = vm.CreateDialog(\"mdlExpenses\",Me)";
Debug.ShouldStop(64);
modexpenses._mdlexpenses = modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_createdialog" /*RemoteObject*/ ,(Object)(BA.ObjectToString("mdlExpenses")),(Object)(modexpenses.getObject()));
 BA.debugLineNum = 40;BA.debugLine="mdlExpenses.settitle(\"New Expense\")";
Debug.ShouldStop(128);
modexpenses._mdlexpenses.runClassMethod (b4j.example.vmdialog.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("New Expense")));
 BA.debugLineNum = 41;BA.debugLine="mdlExpenses.AddCancel(\"btnCancelExpense\", \"Cancel";
Debug.ShouldStop(256);
modexpenses._mdlexpenses.runClassMethod (b4j.example.vmdialog.class, "_addcancel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnCancelExpense")),(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 42;BA.debugLine="mdlExpenses.AddOK(\"btnSaveExpense\", \"Save\")";
Debug.ShouldStop(512);
modexpenses._mdlexpenses.runClassMethod (b4j.example.vmdialog.class, "_addok" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnSaveExpense")),(Object)(RemoteObject.createImmutable("Save")));
 BA.debugLineNum = 44;BA.debugLine="Dim expense_id As VMInputControl = mdlExpenses.Co";
Debug.ShouldStop(2048);
_expense_id = modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("id")),(Object)(BA.ObjectToString("#")),(Object)(BA.ObjectToString("")),(Object)(modexpenses.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0))).runClassMethod (b4j.example.vminputcontrol.class, "_setvisible" /*RemoteObject*/ ,(Object)(modexpenses.__c.getField(true,"False"))).runClassMethod (b4j.example.vminputcontrol.class, "_setint" /*RemoteObject*/ );Debug.locals.put("expense_id", _expense_id);Debug.locals.put("expense_id", _expense_id);
 BA.debugLineNum = 45;BA.debugLine="Dim expense_date As VMInputControl = mdlExpenses.";
Debug.ShouldStop(4096);
_expense_date = modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newdatepicker" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_date")),(Object)(BA.ObjectToString("Date")),(Object)(modexpenses.__c.getField(true,"True")),(Object)(modexpenses.__c.getField(true,"False")),(Object)(modexpenses.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("expense_date", _expense_date);Debug.locals.put("expense_date", _expense_date);
 BA.debugLineNum = 46;BA.debugLine="Dim expense_category As VMInputControl = mdlExpen";
Debug.ShouldStop(8192);
_expense_category = modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newselect" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_category")),(Object)(BA.ObjectToString("Category")),(Object)(modexpenses.__c.getField(true,"True")),(Object)(modexpenses.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("categories")),(Object)(BA.ObjectToString("id")),(Object)(BA.ObjectToString("text")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The category should be specified!")),(Object)(BA.numberCast(int.class, 0))).runClassMethod (b4j.example.vminputcontrol.class, "_setint" /*RemoteObject*/ );Debug.locals.put("expense_category", _expense_category);Debug.locals.put("expense_category", _expense_category);
 BA.debugLineNum = 47;BA.debugLine="Dim expense_type As VMInputControl = mdlExpenses.";
Debug.ShouldStop(16384);
_expense_type = modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newselect" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_type")),(Object)(BA.ObjectToString("Type")),(Object)(modexpenses.__c.getField(true,"True")),(Object)(modexpenses.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("types")),(Object)(BA.ObjectToString("id")),(Object)(BA.ObjectToString("text")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The type should be specified!")),(Object)(BA.numberCast(int.class, 0))).runClassMethod (b4j.example.vminputcontrol.class, "_setint" /*RemoteObject*/ );Debug.locals.put("expense_type", _expense_type);Debug.locals.put("expense_type", _expense_type);
 BA.debugLineNum = 48;BA.debugLine="Dim expense_amount As VMInputControl = mdlExpense";
Debug.ShouldStop(32768);
_expense_amount = modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_amount")),(Object)(BA.ObjectToString("Amount")),(Object)(BA.ObjectToString("")),(Object)(modexpenses.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The amount should be specified!")),(Object)(BA.numberCast(int.class, 0))).runClassMethod (b4j.example.vminputcontrol.class, "_setdouble" /*RemoteObject*/ );Debug.locals.put("expense_amount", _expense_amount);Debug.locals.put("expense_amount", _expense_amount);
 BA.debugLineNum = 49;BA.debugLine="Dim expense_description As VMInputControl = mdlEx";
Debug.ShouldStop(65536);
_expense_description = modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtextarea" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_description")),(Object)(BA.ObjectToString("Description")),(Object)(BA.ObjectToString("")),(Object)(modexpenses.__c.getField(true,"False")),(Object)(modexpenses.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("expense_description", _expense_description);Debug.locals.put("expense_description", _expense_description);
 BA.debugLineNum = 51;BA.debugLine="mdlExpenses.Container.AddControl(expense_id, 1, 1";
Debug.ShouldStop(262144);
modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_id),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 52;BA.debugLine="mdlExpenses.Container.AddControl(expense_date, 2,";
Debug.ShouldStop(524288);
modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_date),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 53;BA.debugLine="mdlExpenses.Container.AddControl(expense_category";
Debug.ShouldStop(1048576);
modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_category),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 54;BA.debugLine="mdlExpenses.Container.AddControl(expense_type, 3,";
Debug.ShouldStop(2097152);
modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_type),(Object)(BA.NumberToString(3)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 55;BA.debugLine="mdlExpenses.Container.AddControl(expense_amount,";
Debug.ShouldStop(4194304);
modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_amount),(Object)(BA.NumberToString(3)),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 56;BA.debugLine="mdlExpenses.Container.AddControl(expense_descript";
Debug.ShouldStop(8388608);
modexpenses._mdlexpenses.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_description),(Object)(BA.NumberToString(4)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 58;BA.debugLine="mdlExpenses.SetClickOutsideToClose(False)";
Debug.ShouldStop(33554432);
modexpenses._mdlexpenses.runClassMethod (b4j.example.vmdialog.class, "_setclickoutsidetoclose" /*RemoteObject*/ ,(Object)(modexpenses.__c.getField(true,"False")));
 BA.debugLineNum = 59;BA.debugLine="mdlExpenses.SetCloseOnEsc(False)";
Debug.ShouldStop(67108864);
modexpenses._mdlexpenses.runClassMethod (b4j.example.vmdialog.class, "_setcloseonesc" /*RemoteObject*/ ,(Object)(modexpenses.__c.getField(true,"False")));
 BA.debugLineNum = 60;BA.debugLine="mdlExpenses.SetWidth(\"700px\")";
Debug.ShouldStop(134217728);
modexpenses._mdlexpenses.runClassMethod (b4j.example.vmdialog.class, "_setwidth" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("700px")));
 BA.debugLineNum = 61;BA.debugLine="vm.AddDialog(mdlExpenses)";
Debug.ShouldStop(268435456);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_adddialog" /*RemoteObject*/ ,(Object)(modexpenses._mdlexpenses));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private vm As BANanoVM";
modexpenses._vm = RemoteObject.createNew ("b4j.example.bananovm");
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"expensescode\"";
modexpenses._name = BA.ObjectToString("expensescode");
 //BA.debugLineNum = 5;BA.debugLine="Public Mode As String";
modexpenses._mode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 6;BA.debugLine="Public mdlExpenses As VMDialog";
modexpenses._mdlexpenses = RemoteObject.createNew ("b4j.example.vmdialog");
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano";
modexpenses._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 8;BA.debugLine="Private expenses As VMGijgoTable";
modexpenses._expenses = RemoteObject.createNew ("b4j.example.vmgijgotable");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refresh() throws Exception{
try {
		Debug.PushSubsStack("Refresh (modexpenses) ","modexpenses",3,modexpenses.ba,modexpenses.mostCurrent,123);
if (RapidSub.canDelegate("refresh")) { return b4j.example.modexpenses.remoteMe.runUserSub(false, "modexpenses","refresh");}
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
 BA.debugLineNum = 123;BA.debugLine="Sub Refresh";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="vm.pagepause";
Debug.ShouldStop(134217728);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_pagepause" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(268435456);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 126;BA.debugLine="dbsql.Initialize(Main.dbase, \"expenses\", \"id\")";
Debug.ShouldStop(536870912);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,modexpenses.ba,(Object)(modexpenses._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expenses")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 127;BA.debugLine="dbsql.SelectAll(Array(\"*\"), Array(\"id\"))";
Debug.ShouldStop(1073741824);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_selectall" /*RemoteObject*/ ,(Object)(modexpenses.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*"))})))),(Object)(modexpenses.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("id"))})))));
 BA.debugLineNum = 128;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
Debug.ShouldStop(-2147483648);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpenses._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 129;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(1);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 130;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(2);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 131;BA.debugLine="expenses.SetDataSource(dbsql.result)";
Debug.ShouldStop(4);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_setdatasource" /*RemoteObject*/ ,(Object)(_dbsql.getField(false,"_result" /*RemoteObject*/ )));
 BA.debugLineNum = 132;BA.debugLine="expenses.refresh";
Debug.ShouldStop(8);
modexpenses._expenses.runClassMethod (b4j.example.vmgijgotable.class, "_refresh" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 134;BA.debugLine="Log(\"modExpenses.Refresh: Error - \" & dbsql.erro";
Debug.ShouldStop(32);
modexpenses.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenses.Refresh: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 136;BA.debugLine="vm.pageresume";
Debug.ShouldStop(128);
modexpenses._vm.runClassMethod (b4j.example.bananovm.class, "_pageresume" /*RemoteObject*/ );
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}