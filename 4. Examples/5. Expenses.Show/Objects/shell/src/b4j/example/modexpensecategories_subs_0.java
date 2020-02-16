package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modexpensecategories_subs_0 {


public static RemoteObject  _add() throws Exception{
try {
		Debug.PushSubsStack("Add (modexpensecategories) ","modexpensecategories",6,modexpensecategories.ba,modexpensecategories.mostCurrent,78);
if (RapidSub.canDelegate("add")) { return b4j.example.modexpensecategories.remoteMe.runUserSub(false, "modexpensecategories","add");}
 BA.debugLineNum = 78;BA.debugLine="Sub Add";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Mode = \"A\"";
Debug.ShouldStop(16384);
modexpensecategories._mode = BA.ObjectToString("A");
 BA.debugLineNum = 80;BA.debugLine="mdlExpenseCategory.SetTitle(\"New Expense Category";
Debug.ShouldStop(32768);
modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("New Expense Category")));
 BA.debugLineNum = 81;BA.debugLine="mdlExpenseCategory.Container.setdefaults";
Debug.ShouldStop(65536);
modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_setdefaults" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="vm.showdialog(\"mdlExpenseCategory\")";
Debug.ShouldStop(131072);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_showdialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseCategory")));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancelcategory_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnCancelCategory_click (modexpensecategories) ","modexpensecategories",6,modexpensecategories.ba,modexpensecategories.mostCurrent,85);
if (RapidSub.canDelegate("btncancelcategory_click")) { return b4j.example.modexpensecategories.remoteMe.runUserSub(false, "modexpensecategories","btncancelcategory_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 85;BA.debugLine="Sub btnCancelCategory_click(e As BANanoEvent)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="vm.HideDialog(\"mdlExpenseCategory\")";
Debug.ShouldStop(2097152);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseCategory")));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsavecategory_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnSaveCategory_click (modexpensecategories) ","modexpensecategories",6,modexpensecategories.ba,modexpensecategories.mostCurrent,89);
if (RapidSub.canDelegate("btnsavecategory_click")) { return b4j.example.modexpensecategories.remoteMe.runUserSub(false, "modexpensecategories","btnsavecategory_click", _e);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bvalid = RemoteObject.createImmutable(false);
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
RemoteObject _sid = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 89;BA.debugLine="Sub btnSaveCategory_click(e As BANanoEvent)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="Dim rec As Map = mdlExpenseCategory.GetData";
Debug.ShouldStop(67108864);
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec = modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_getdata" /*RemoteObject*/ );Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 93;BA.debugLine="Dim bValid As Boolean = vm.validate(rec, mdlExpen";
Debug.ShouldStop(268435456);
_bvalid = modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_validate" /*RemoteObject*/ ,(Object)(_rec),(Object)(modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_required" /*RemoteObject*/ )));Debug.locals.put("bValid", _bvalid);Debug.locals.put("bValid", _bvalid);
 BA.debugLineNum = 94;BA.debugLine="If bValid = False Then Return";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_bvalid,modexpensecategories.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 96;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(-2147483648);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 97;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensecategories\",";
Debug.ShouldStop(1);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,modexpensecategories.ba,(Object)(modexpensecategories._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expensecategories")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 98;BA.debugLine="dbsql.SchemaFromDesign(mdlExpenseCategory.Contain";
Debug.ShouldStop(2);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_schemafromdesign" /*RemoteObject*/ ,(Object)(modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="Select Case Mode";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(modexpensecategories._mode,BA.ObjectToString("A"),BA.ObjectToString("E"))) {
case 0: {
 BA.debugLineNum = 101;BA.debugLine="dbsql.RecordFromMap(rec)";
Debug.ShouldStop(16);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_recordfrommap" /*RemoteObject*/ ,(Object)(_rec));
 BA.debugLineNum = 102;BA.debugLine="dbsql.Insert";
Debug.ShouldStop(32);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_insert" /*RemoteObject*/ );
 BA.debugLineNum = 103;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
Debug.ShouldStop(64);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpensecategories._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 104;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(128);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(256);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="vm.ShowSnackBar(\"Expense Category added success";
Debug.ShouldStop(512);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense Category added successfully!")));
 BA.debugLineNum = 107;BA.debugLine="vm.HideDialog(\"mdlExpenseCategory\")";
Debug.ShouldStop(1024);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseCategory")));
 BA.debugLineNum = 108;BA.debugLine="Refresh";
Debug.ShouldStop(2048);
_refresh();
 }else {
 BA.debugLineNum = 110;BA.debugLine="Log(\"modExpenseCategories.btnSaveCategory_click";
Debug.ShouldStop(8192);
modexpensecategories.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenseCategories.btnSaveCategory_click: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 111;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(16384);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 break; }
case 1: {
 BA.debugLineNum = 114;BA.debugLine="Dim sid As String = rec.Get(\"id\")";
Debug.ShouldStop(131072);
_sid = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 115;BA.debugLine="dbsql.RecordFromMap(rec)";
Debug.ShouldStop(262144);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_recordfrommap" /*RemoteObject*/ ,(Object)(_rec));
 BA.debugLineNum = 116;BA.debugLine="dbsql.Update(sid)";
Debug.ShouldStop(524288);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_update" /*RemoteObject*/ ,(Object)(_sid));
 BA.debugLineNum = 117;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
Debug.ShouldStop(1048576);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpensecategories._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 118;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(2097152);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 119;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(4194304);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="vm.ShowSnackBar(\"Expense Category updated succe";
Debug.ShouldStop(8388608);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense Category updated successfully!")));
 BA.debugLineNum = 121;BA.debugLine="vm.HideDialog(\"mdlExpenseCategory\")";
Debug.ShouldStop(16777216);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseCategory")));
 BA.debugLineNum = 122;BA.debugLine="Refresh";
Debug.ShouldStop(33554432);
_refresh();
 }else {
 BA.debugLineNum = 124;BA.debugLine="Log(\"modExpenseCategories.btnSaveCategory_click";
Debug.ShouldStop(134217728);
modexpensecategories.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenseCategories.btnSaveCategory_click: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 125;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(268435456);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 break; }
}
;
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Code (modexpensecategories) ","modexpensecategories",6,modexpensecategories.ba,modexpensecategories.mostCurrent,11);
if (RapidSub.canDelegate("code")) { return b4j.example.modexpensecategories.remoteMe.runUserSub(false, "modexpensecategories","code");}
RemoteObject _cont = RemoteObject.declareNull("b4j.example.vmcontainer");
RemoteObject _ecid = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _ectext = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _ecdescription = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _ecbudget = RemoteObject.declareNull("b4j.example.vminputcontrol");
 BA.debugLineNum = 11;BA.debugLine="Sub Code";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Mode = \"\"";
Debug.ShouldStop(2048);
modexpensecategories._mode = BA.ObjectToString("");
 BA.debugLineNum = 13;BA.debugLine="Log(\"modExpenseCategories.Code\")";
Debug.ShouldStop(4096);
modexpensecategories.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("modExpenseCategories.Code")));
 BA.debugLineNum = 14;BA.debugLine="vm = pgIndex.vm";
Debug.ShouldStop(8192);
modexpensecategories._vm = modexpensecategories._pgindex._vm /*RemoteObject*/ ;
 BA.debugLineNum = 16;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
Debug.ShouldStop(32768);
_cont = modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_createcontainer" /*RemoteObject*/ ,(Object)(modexpensecategories._name),(Object)(modexpensecategories.getObject()));Debug.locals.put("cont", _cont);Debug.locals.put("cont", _cont);
 BA.debugLineNum = 18;BA.debugLine="cont.Hide";
Debug.ShouldStop(131072);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 20;BA.debugLine="cont.AddRows(2).AddColumns12";
Debug.ShouldStop(524288);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addrows" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 2))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns12" /*RemoteObject*/ );
 BA.debugLineNum = 22;BA.debugLine="expensecategory = vm.CreateGijgoTable(\"expensecat";
Debug.ShouldStop(2097152);
modexpensecategories._expensecategory = modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_creategijgotable" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expensecategory")),(Object)(BA.ObjectToString("id")),(Object)(modexpensecategories.getObject()));
 BA.debugLineNum = 23;BA.debugLine="expensecategory.SetTitle(\"Expense Categories\")";
Debug.ShouldStop(4194304);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense Categories")));
 BA.debugLineNum = 24;BA.debugLine="expensecategory.AddColumn(\"text\",\"Name\")";
Debug.ShouldStop(8388608);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text")),(Object)(RemoteObject.createImmutable("Name")));
 BA.debugLineNum = 25;BA.debugLine="expensecategory.AddColumn(\"description\",\"Descript";
Debug.ShouldStop(16777216);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("description")),(Object)(RemoteObject.createImmutable("Description")));
 BA.debugLineNum = 26;BA.debugLine="expensecategory.AddColumn(\"budget\",\"Monthly Budge";
Debug.ShouldStop(33554432);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("budget")),(Object)(RemoteObject.createImmutable("Monthly Budget")));
 BA.debugLineNum = 27;BA.debugLine="expensecategory.AddEditTrash";
Debug.ShouldStop(67108864);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_addedittrash" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="expensecategory.autoLoad = True";
Debug.ShouldStop(134217728);
modexpensecategories._expensecategory.setField ("_autoload" /*RemoteObject*/ ,modexpensecategories.__c.getField(true,"True"));
 BA.debugLineNum = 29;BA.debugLine="expensecategory.SetMoneyColumns(Array(\"budget\"))";
Debug.ShouldStop(268435456);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_setmoneycolumns" /*RemoteObject*/ ,(Object)(modexpensecategories.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("budget"))})))));
 BA.debugLineNum = 30;BA.debugLine="expensecategory.SetDataSource(Array())";
Debug.ShouldStop(536870912);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_setdatasource" /*RemoteObject*/ ,(Object)(modexpensecategories.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {})))));
 BA.debugLineNum = 31;BA.debugLine="cont.AddComponent(1,1, expensecategory.tostring)";
Debug.ShouldStop(1073741824);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="vm.AddContainer(cont)";
Debug.ShouldStop(1);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_addcontainer" /*RemoteObject*/ ,(Object)(_cont));
 BA.debugLineNum = 37;BA.debugLine="mdlExpenseCategory = vm.CreateDialog(\"mdlExpenseC";
Debug.ShouldStop(16);
modexpensecategories._mdlexpensecategory = modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_createdialog" /*RemoteObject*/ ,(Object)(BA.ObjectToString("mdlExpenseCategory")),(Object)(modexpensecategories.getObject()));
 BA.debugLineNum = 38;BA.debugLine="mdlExpenseCategory.SetTitle(\"New Expense Category";
Debug.ShouldStop(32);
modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("New Expense Category")));
 BA.debugLineNum = 39;BA.debugLine="mdlExpenseCategory.AddCancel(\"btnCancelCategory\",";
Debug.ShouldStop(64);
modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_addcancel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnCancelCategory")),(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 40;BA.debugLine="mdlExpenseCategory.AddOK(\"btnSaveCategory\", \"Save";
Debug.ShouldStop(128);
modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_addok" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnSaveCategory")),(Object)(RemoteObject.createImmutable("Save")));
 BA.debugLineNum = 42;BA.debugLine="Dim ecID As VMInputControl = mdlExpenseCategory.C";
Debug.ShouldStop(512);
_ecid = modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("id")),(Object)(BA.ObjectToString("#")),(Object)(BA.ObjectToString("")),(Object)(modexpensecategories.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ecID", _ecid);Debug.locals.put("ecID", _ecid);
 BA.debugLineNum = 43;BA.debugLine="ecID.SetVisible(False).SetInt";
Debug.ShouldStop(1024);
_ecid.runClassMethod (b4j.example.vminputcontrol.class, "_setvisible" /*RemoteObject*/ ,(Object)(modexpensecategories.__c.getField(true,"False"))).runClassMethod (b4j.example.vminputcontrol.class, "_setint" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="Dim ecText As VMInputControl = mdlExpenseCategory";
Debug.ShouldStop(2048);
_ectext = modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text")),(Object)(BA.ObjectToString("Name")),(Object)(BA.ObjectToString("")),(Object)(modexpensecategories.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 20)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The category name is required!")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ecText", _ectext);Debug.locals.put("ecText", _ectext);
 BA.debugLineNum = 45;BA.debugLine="Dim ecDescription As VMInputControl = mdlExpenseC";
Debug.ShouldStop(4096);
_ecdescription = modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtextarea" /*RemoteObject*/ ,(Object)(BA.ObjectToString("description")),(Object)(BA.ObjectToString("Description")),(Object)(BA.ObjectToString("")),(Object)(modexpensecategories.__c.getField(true,"False")),(Object)(modexpensecategories.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ecDescription", _ecdescription);Debug.locals.put("ecDescription", _ecdescription);
 BA.debugLineNum = 46;BA.debugLine="Dim ecBudget As VMInputControl = mdlExpenseCatego";
Debug.ShouldStop(8192);
_ecbudget = modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("budget")),(Object)(BA.ObjectToString("Monthly Budget")),(Object)(BA.ObjectToString("")),(Object)(modexpensecategories.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The monthly budget is required!")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ecBudget", _ecbudget);Debug.locals.put("ecBudget", _ecbudget);
 BA.debugLineNum = 47;BA.debugLine="ecBudget.SetDouble";
Debug.ShouldStop(16384);
_ecbudget.runClassMethod (b4j.example.vminputcontrol.class, "_setdouble" /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="mdlExpenseCategory.Container.AddControlS(ecID, 1,";
Debug.ShouldStop(65536);
modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrols" /*RemoteObject*/ ,(Object)(_ecid),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 50;BA.debugLine="mdlExpenseCategory.Container.AddControlS(ecText,";
Debug.ShouldStop(131072);
modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrols" /*RemoteObject*/ ,(Object)(_ectext),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 51;BA.debugLine="mdlExpenseCategory.Container.AddControlS(ecDescri";
Debug.ShouldStop(262144);
modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrols" /*RemoteObject*/ ,(Object)(_ecdescription),(Object)(BA.NumberToString(3)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 52;BA.debugLine="mdlExpenseCategory.Container.AddControlS(ecBudget";
Debug.ShouldStop(524288);
modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrols" /*RemoteObject*/ ,(Object)(_ecbudget),(Object)(BA.NumberToString(4)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 54;BA.debugLine="mdlExpenseCategory.SetClickOutsideToClose(False)";
Debug.ShouldStop(2097152);
modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_setclickoutsidetoclose" /*RemoteObject*/ ,(Object)(modexpensecategories.__c.getField(true,"False")));
 BA.debugLineNum = 55;BA.debugLine="mdlExpenseCategory.SetCloseOnEsc(False)";
Debug.ShouldStop(4194304);
modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_setcloseonesc" /*RemoteObject*/ ,(Object)(modexpensecategories.__c.getField(true,"False")));
 BA.debugLineNum = 56;BA.debugLine="mdlExpenseCategory.SetWidth(\"500px\")";
Debug.ShouldStop(8388608);
modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_setwidth" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("500px")));
 BA.debugLineNum = 57;BA.debugLine="vm.AddDialog(mdlExpenseCategory)";
Debug.ShouldStop(16777216);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_adddialog" /*RemoteObject*/ ,(Object)(modexpensecategories._mdlexpensecategory));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expensecategory_delete(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("expensecategory_delete (modexpensecategories) ","modexpensecategories",6,modexpensecategories.ba,modexpensecategories.mostCurrent,149);
if (RapidSub.canDelegate("expensecategory_delete")) { return b4j.example.modexpensecategories.remoteMe.runUserSub(false, "modexpensecategories","expensecategory_delete", _e);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sid = RemoteObject.createImmutable("");
RemoteObject _stext = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 149;BA.debugLine="Sub expensecategory_delete(e As BANanoEvent)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="Dim rec As Map = expensecategory.GetRecordFromEve";
Debug.ShouldStop(4194304);
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec = modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_getrecordfromevent" /*RemoteObject*/ ,(Object)(_e));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 152;BA.debugLine="Dim sid As String = rec.GetDefault(\"id\",\"\")";
Debug.ShouldStop(8388608);
_sid = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 153;BA.debugLine="Dim stext As String = rec.getdefault(\"text\",\"\")";
Debug.ShouldStop(16777216);
_stext = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("text"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("stext", _stext);Debug.locals.put("stext", _stext);
 BA.debugLineNum = 154;BA.debugLine="If sid = \"\" Then Return";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_sid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 156;BA.debugLine="vm.SetStateSingle(\"categoryid\", sid)";
Debug.ShouldStop(134217728);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("categoryid"))),(Object)((_sid)));
 BA.debugLineNum = 158;BA.debugLine="vm.ShowConfirm(\"delete_category\", $\"Confirm Delet";
Debug.ShouldStop(536870912);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_showconfirm" /*RemoteObject*/ ,(Object)(BA.ObjectToString("delete_category")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Confirm Delete: "),modexpensecategories.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stext))),RemoteObject.createImmutable("")))),(Object)(BA.ObjectToString("Are you sure that you want to delete this expense category. You will not be able to undo your actions. Continue?")),(Object)(BA.ObjectToString("Ok")),(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expensecategory_edit(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("expensecategory_edit (modexpensecategories) ","modexpensecategories",6,modexpensecategories.ba,modexpensecategories.mostCurrent,131);
if (RapidSub.canDelegate("expensecategory_edit")) { return b4j.example.modexpensecategories.remoteMe.runUserSub(false, "modexpensecategories","expensecategory_edit", _e);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sid = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 131;BA.debugLine="Sub expensecategory_edit(e As BANanoEvent)";
Debug.ShouldStop(4);
 BA.debugLineNum = 133;BA.debugLine="Dim rec As Map = expensecategory.GetRecordFromEve";
Debug.ShouldStop(16);
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec = modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_getrecordfromevent" /*RemoteObject*/ ,(Object)(_e));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 134;BA.debugLine="Dim sid As String = rec.GetDefault(\"id\",\"\")";
Debug.ShouldStop(32);
_sid = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 135;BA.debugLine="If sid = \"\" Then Return";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_sid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 137;BA.debugLine="Mode = \"E\"";
Debug.ShouldStop(256);
modexpensecategories._mode = BA.ObjectToString("E");
 BA.debugLineNum = 139;BA.debugLine="mdlExpenseCategory.SetTitle(\"Edit Expense Categor";
Debug.ShouldStop(1024);
modexpensecategories._mdlexpensecategory.runClassMethod (b4j.example.vmdialog.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Edit Expense Category")));
 BA.debugLineNum = 141;BA.debugLine="mdlExpenseCategory.Container.setdefaults";
Debug.ShouldStop(4096);
modexpensecategories._mdlexpensecategory.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_setdefaults" /*RemoteObject*/ );
 BA.debugLineNum = 143;BA.debugLine="vm.SetState(rec)";
Debug.ShouldStop(16384);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_setstate" /*RemoteObject*/ ,(Object)(_rec));
 BA.debugLineNum = 145;BA.debugLine="vm.showdialog(\"mdlExpenseCategory\")";
Debug.ShouldStop(65536);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_showdialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseCategory")));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
modexpensecategories._vm = RemoteObject.createNew ("b4j.example.bananovm");
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"expensecategorycode\"";
modexpensecategories._name = BA.ObjectToString("expensecategorycode");
 //BA.debugLineNum = 5;BA.debugLine="Private expensecategory As VMGijgoTable";
modexpensecategories._expensecategory = RemoteObject.createNew ("b4j.example.vmgijgotable");
 //BA.debugLineNum = 6;BA.debugLine="Public Mode As String";
modexpensecategories._mode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 7;BA.debugLine="Public mdlExpenseCategory As VMDialog";
modexpensecategories._mdlexpensecategory = RemoteObject.createNew ("b4j.example.vmdialog");
 //BA.debugLineNum = 8;BA.debugLine="Private BANano As BANano";
modexpensecategories._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refresh() throws Exception{
try {
		Debug.PushSubsStack("Refresh (modexpensecategories) ","modexpensecategories",6,modexpensecategories.ba,modexpensecategories.mostCurrent,61);
if (RapidSub.canDelegate("refresh")) { return b4j.example.modexpensecategories.remoteMe.runUserSub(false, "modexpensecategories","refresh");}
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
 BA.debugLineNum = 61;BA.debugLine="Sub Refresh";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="vm.pagepause";
Debug.ShouldStop(536870912);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_pagepause" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(1073741824);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 64;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensecategories\",";
Debug.ShouldStop(-2147483648);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,modexpensecategories.ba,(Object)(modexpensecategories._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expensecategories")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 65;BA.debugLine="dbsql.SelectAll(Array(\"*\"), Array(\"text\"))";
Debug.ShouldStop(1);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_selectall" /*RemoteObject*/ ,(Object)(modexpensecategories.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*"))})))),(Object)(modexpensecategories.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("text"))})))));
 BA.debugLineNum = 66;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
Debug.ShouldStop(2);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpensecategories._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 67;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(4);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(8);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 69;BA.debugLine="expensecategory.SetDataSource(dbsql.result)";
Debug.ShouldStop(16);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_setdatasource" /*RemoteObject*/ ,(Object)(_dbsql.getField(false,"_result" /*RemoteObject*/ )));
 BA.debugLineNum = 70;BA.debugLine="expensecategory.refresh";
Debug.ShouldStop(32);
modexpensecategories._expensecategory.runClassMethod (b4j.example.vmgijgotable.class, "_refresh" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 72;BA.debugLine="Log(\"modExpenseCategories.Refresh: Error - \" & d";
Debug.ShouldStop(128);
modexpensecategories.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenseCategories.Refresh: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 74;BA.debugLine="vm.pageresume";
Debug.ShouldStop(512);
modexpensecategories._vm.runClassMethod (b4j.example.bananovm.class, "_pageresume" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}