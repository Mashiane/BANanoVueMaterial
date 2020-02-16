package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class moddashboard_subs_0 {


public static RemoteObject  _addbudgetcurrentmonth() throws Exception{
try {
		Debug.PushSubsStack("AddBudgetCurrentMonth (moddashboard) ","moddashboard",2,moddashboard.ba,moddashboard.mostCurrent,94);
if (RapidSub.canDelegate("addbudgetcurrentmonth")) { return b4j.example.moddashboard.remoteMe.runUserSub(false, "moddashboard","addbudgetcurrentmonth");}
RemoteObject _bcont = RemoteObject.declareNull("b4j.example.vmcontainer");
RemoteObject _lblx = RemoteObject.declareNull("b4j.example.vminputcontrol");
 BA.debugLineNum = 94;BA.debugLine="Sub AddBudgetCurrentMonth As VMContainer";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="Dim bcont As VMContainer = vm.CreateContainer(\"bu";
Debug.ShouldStop(1073741824);
_bcont = moddashboard._vm.runClassMethod (b4j.example.bananovm.class, "_createcontainer" /*RemoteObject*/ ,(Object)(BA.ObjectToString("budgetcurrmonthcont")),(Object)(moddashboard.getObject()));Debug.locals.put("bcont", _bcont);Debug.locals.put("bcont", _bcont);
 BA.debugLineNum = 96;BA.debugLine="bcont.SetElevation(2)";
Debug.ShouldStop(-2147483648);
_bcont.runClassMethod (b4j.example.vmcontainer.class, "_setelevation" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 97;BA.debugLine="bcont.SetPaddingAll(\"20px\")";
Debug.ShouldStop(1);
_bcont.runClassMethod (b4j.example.vmcontainer.class, "_setpaddingall" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("20px"))));
 BA.debugLineNum = 99;BA.debugLine="Dim lblx As VMInputControl = expcont.NewH1(\"lblx\"";
Debug.ShouldStop(4);
_lblx = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newh1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblx")),(Object)(RemoteObject.createImmutable("Budget (Current Month)")));Debug.locals.put("lblx", _lblx);Debug.locals.put("lblx", _lblx);
 BA.debugLineNum = 100;BA.debugLine="bcont.AddControl(lblx, 1, 1, 0, 0, 0, 0, 12, 12,";
Debug.ShouldStop(8);
_bcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_lblx),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 104;BA.debugLine="Return bcont";
Debug.ShouldStop(128);
if (true) return _bcont;
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addexpense() throws Exception{
try {
		Debug.PushSubsStack("AddExpense (moddashboard) ","moddashboard",2,moddashboard.ba,moddashboard.mostCurrent,29);
if (RapidSub.canDelegate("addexpense")) { return b4j.example.moddashboard.remoteMe.runUserSub(false, "moddashboard","addexpense");}
RemoteObject _expense_label = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_id = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_date = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_category = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_type = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_amount = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _expense_description = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _labelx = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _btnsubmitexpense = RemoteObject.declareNull("b4j.example.vminputcontrol");
 BA.debugLineNum = 29;BA.debugLine="Sub AddExpense As VMContainer";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="expcont = vm.CreateContainer(\"expcont\", Me)";
Debug.ShouldStop(536870912);
moddashboard._expcont = moddashboard._vm.runClassMethod (b4j.example.bananovm.class, "_createcontainer" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expcont")),(Object)(moddashboard.getObject()));
 BA.debugLineNum = 31;BA.debugLine="expcont.SetElevation(2)";
Debug.ShouldStop(1073741824);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_setelevation" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 32;BA.debugLine="expcont.SetPaddingAll(\"20px\")";
Debug.ShouldStop(-2147483648);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_setpaddingall" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("20px"))));
 BA.debugLineNum = 34;BA.debugLine="Dim expense_label As VMInputControl = expcont.New";
Debug.ShouldStop(2);
_expense_label = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newh1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_label")),(Object)(RemoteObject.createImmutable("Add Expense")));Debug.locals.put("expense_label", _expense_label);Debug.locals.put("expense_label", _expense_label);
 BA.debugLineNum = 35;BA.debugLine="expcont.AddControl(expense_label, 1, 1, 0, 0, 0,";
Debug.ShouldStop(4);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_label),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 37;BA.debugLine="Dim expense_id As VMInputControl = expcont.NewTex";
Debug.ShouldStop(16);
_expense_id = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newtext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("id")),(Object)(BA.ObjectToString("#")),(Object)(BA.ObjectToString("")),(Object)(moddashboard.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("expense_id", _expense_id);Debug.locals.put("expense_id", _expense_id);
 BA.debugLineNum = 38;BA.debugLine="expense_id.SetVisible(False).SetInt";
Debug.ShouldStop(32);
_expense_id.runClassMethod (b4j.example.vminputcontrol.class, "_setvisible" /*RemoteObject*/ ,(Object)(moddashboard.__c.getField(true,"False"))).runClassMethod (b4j.example.vminputcontrol.class, "_setint" /*RemoteObject*/ );
 BA.debugLineNum = 39;BA.debugLine="expcont.AddControl(expense_id, 1, 1, 0, 0, 0, 0,";
Debug.ShouldStop(64);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_id),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 41;BA.debugLine="Dim expense_date As VMInputControl = expcont.NewD";
Debug.ShouldStop(256);
_expense_date = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newdatepicker" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_date")),(Object)(BA.ObjectToString("Date")),(Object)(moddashboard.__c.getField(true,"True")),(Object)(moddashboard.__c.getField(true,"False")),(Object)(moddashboard.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("expense_date", _expense_date);Debug.locals.put("expense_date", _expense_date);
 BA.debugLineNum = 42;BA.debugLine="expcont.AddControl(expense_date, 2, 1, 0, 0, 0, 0";
Debug.ShouldStop(512);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_date),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 44;BA.debugLine="Dim expense_category As VMInputControl = expcont.";
Debug.ShouldStop(2048);
_expense_category = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newselect" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_category")),(Object)(BA.ObjectToString("Category")),(Object)(moddashboard.__c.getField(true,"True")),(Object)(moddashboard.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("categories")),(Object)(BA.ObjectToString("id")),(Object)(BA.ObjectToString("text")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The category should be specified!")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("expense_category", _expense_category);Debug.locals.put("expense_category", _expense_category);
 BA.debugLineNum = 45;BA.debugLine="expense_category.setint";
Debug.ShouldStop(4096);
_expense_category.runClassMethod (b4j.example.vminputcontrol.class, "_setint" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="expcont.AddControl(expense_category, 2, 2, 0, 0,";
Debug.ShouldStop(8192);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_category),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 48;BA.debugLine="Dim expense_type As VMInputControl = expcont.NewS";
Debug.ShouldStop(32768);
_expense_type = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newselect" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_type")),(Object)(BA.ObjectToString("Type")),(Object)(moddashboard.__c.getField(true,"True")),(Object)(moddashboard.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("types")),(Object)(BA.ObjectToString("id")),(Object)(BA.ObjectToString("text")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The type should be specified!")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("expense_type", _expense_type);Debug.locals.put("expense_type", _expense_type);
 BA.debugLineNum = 49;BA.debugLine="expense_type.setint";
Debug.ShouldStop(65536);
_expense_type.runClassMethod (b4j.example.vminputcontrol.class, "_setint" /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="expcont.AddControl(expense_type, 3, 1, 0, 0, 0, 0";
Debug.ShouldStop(131072);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_type),(Object)(BA.NumberToString(3)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 52;BA.debugLine="Dim expense_amount As VMInputControl = expcont.Ne";
Debug.ShouldStop(524288);
_expense_amount = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newtel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_amount")),(Object)(BA.ObjectToString("Amount")),(Object)(BA.ObjectToString("")),(Object)(moddashboard.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The amount should be specified!")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("expense_amount", _expense_amount);Debug.locals.put("expense_amount", _expense_amount);
 BA.debugLineNum = 53;BA.debugLine="expense_amount.setdouble";
Debug.ShouldStop(1048576);
_expense_amount.runClassMethod (b4j.example.vminputcontrol.class, "_setdouble" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="expcont.AddControl(expense_amount, 3, 2, 0, 0, 0,";
Debug.ShouldStop(2097152);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_amount),(Object)(BA.NumberToString(3)),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 56;BA.debugLine="Dim expense_description As VMInputControl = expco";
Debug.ShouldStop(8388608);
_expense_description = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newtextarea" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expense_description")),(Object)(BA.ObjectToString("Description")),(Object)(BA.ObjectToString("")),(Object)(moddashboard.__c.getField(true,"False")),(Object)(moddashboard.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("expense_description", _expense_description);Debug.locals.put("expense_description", _expense_description);
 BA.debugLineNum = 57;BA.debugLine="expcont.AddControl(expense_description, 4, 1, 0,";
Debug.ShouldStop(16777216);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_expense_description),(Object)(BA.NumberToString(4)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 59;BA.debugLine="Dim labelx As VMInputControl = expcont.NewP(\"labe";
Debug.ShouldStop(67108864);
_labelx = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newp" /*RemoteObject*/ ,(Object)(BA.ObjectToString("labelx")),(Object)(RemoteObject.createImmutable("Labelx"))).runClassMethod (b4j.example.vminputcontrol.class, "_setvisible" /*RemoteObject*/ ,(Object)(moddashboard.__c.getField(true,"False")));Debug.locals.put("labelx", _labelx);Debug.locals.put("labelx", _labelx);
 BA.debugLineNum = 60;BA.debugLine="expcont.AddControl(labelx, 5, 1, 0, 0, 0, 0, 12,";
Debug.ShouldStop(134217728);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_labelx),(Object)(BA.NumberToString(5)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 62;BA.debugLine="Dim btnSubmitExpense As VMInputControl = expcont.";
Debug.ShouldStop(536870912);
_btnsubmitexpense = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_newbutton" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnSubmitExpense")),(Object)(BA.ObjectToString("Submit")),(Object)(BA.ObjectToString("")),(Object)(moddashboard.__c.getField(true,"True")),(Object)(moddashboard.__c.getField(true,"True")),(Object)(moddashboard.__c.getField(true,"False")),(Object)(moddashboard.__c.getField(true,"True")));Debug.locals.put("btnSubmitExpense", _btnsubmitexpense);Debug.locals.put("btnSubmitExpense", _btnsubmitexpense);
 BA.debugLineNum = 63;BA.debugLine="expcont.AddControl(btnSubmitExpense, 5, 2, 0, 0,";
Debug.ShouldStop(1073741824);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_btnsubmitexpense),(Object)(BA.NumberToString(5)),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 65;BA.debugLine="expcont.AddExclusion(Array(\"expense_label\",\"label";
Debug.ShouldStop(1);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_addexclusion" /*RemoteObject*/ ,(Object)(moddashboard.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("expense_label")),(RemoteObject.createImmutable("labelx"))})))));
 BA.debugLineNum = 66;BA.debugLine="Return expcont";
Debug.ShouldStop(2);
if (true) return moddashboard._expcont;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsubmitexpense_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnSubmitExpense_click (moddashboard) ","moddashboard",2,moddashboard.ba,moddashboard.mostCurrent,69);
if (RapidSub.canDelegate("btnsubmitexpense_click")) { return b4j.example.moddashboard.remoteMe.runUserSub(false, "moddashboard","btnsubmitexpense_click", _e);}
RemoteObject _expense = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bvalid = RemoteObject.createImmutable(false);
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
Debug.locals.put("e", _e);
 BA.debugLineNum = 69;BA.debugLine="Sub btnSubmitExpense_click(e As BANanoEvent)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="Dim expense As Map = expcont.GetData";
Debug.ShouldStop(64);
_expense = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_expense = moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_getdata" /*RemoteObject*/ );Debug.locals.put("expense", _expense);Debug.locals.put("expense", _expense);
 BA.debugLineNum = 73;BA.debugLine="Dim bValid As Boolean = vm.Validate(expense, expc";
Debug.ShouldStop(256);
_bvalid = moddashboard._vm.runClassMethod (b4j.example.bananovm.class, "_validate" /*RemoteObject*/ ,(Object)(_expense),(Object)(moddashboard._expcont.getField(false,"_required" /*RemoteObject*/ )));Debug.locals.put("bValid", _bvalid);Debug.locals.put("bValid", _bvalid);
 BA.debugLineNum = 74;BA.debugLine="If bValid = False Then Return";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_bvalid,moddashboard.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 77;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(4096);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 78;BA.debugLine="dbsql.Initialize(Main.dbase, \"expenses\", \"id\")";
Debug.ShouldStop(8192);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,moddashboard.ba,(Object)(moddashboard._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expenses")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 79;BA.debugLine="dbsql.SchemaFromDesign(expcont)";
Debug.ShouldStop(16384);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_schemafromdesign" /*RemoteObject*/ ,(Object)(moddashboard._expcont));
 BA.debugLineNum = 80;BA.debugLine="dbsql.RecordFromMap(expense)";
Debug.ShouldStop(32768);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_recordfrommap" /*RemoteObject*/ ,(Object)(_expense));
 BA.debugLineNum = 81;BA.debugLine="dbsql.Insert";
Debug.ShouldStop(65536);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_insert" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
Debug.ShouldStop(131072);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(moddashboard._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 83;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(262144);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(524288);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="expcont.setdefaults";
Debug.ShouldStop(1048576);
moddashboard._expcont.runClassMethod (b4j.example.vmcontainer.class, "_setdefaults" /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="vm.ShowSnackBar(\"Expense added successfully!\")";
Debug.ShouldStop(2097152);
moddashboard._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense added successfully!")));
 }else {
 BA.debugLineNum = 88;BA.debugLine="Log(\"modDashboard.btnSubmitExpense_click: Error";
Debug.ShouldStop(8388608);
moddashboard.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modDashboard.btnSubmitExpense_click: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 89;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(16777216);
moddashboard._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Code (moddashboard) ","moddashboard",2,moddashboard.ba,moddashboard.mostCurrent,9);
if (RapidSub.canDelegate("code")) { return b4j.example.moddashboard.remoteMe.runUserSub(false, "moddashboard","code");}
RemoteObject _cont = RemoteObject.declareNull("b4j.example.vmcontainer");
RemoteObject _ec = RemoteObject.declareNull("b4j.example.vmcontainer");
RemoteObject _bcm = RemoteObject.declareNull("b4j.example.vmcontainer");
 BA.debugLineNum = 9;BA.debugLine="Sub Code";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Log(\"modDashboard.Code\")";
Debug.ShouldStop(512);
moddashboard.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("modDashboard.Code")));
 BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
Debug.ShouldStop(1024);
moddashboard._vm = moddashboard._pgindex._vm /*RemoteObject*/ ;
 BA.debugLineNum = 13;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
Debug.ShouldStop(4096);
_cont = moddashboard._vm.runClassMethod (b4j.example.bananovm.class, "_createcontainer" /*RemoteObject*/ ,(Object)(moddashboard._name),(Object)(moddashboard.getObject()));Debug.locals.put("cont", _cont);Debug.locals.put("cont", _cont);
 BA.debugLineNum = 15;BA.debugLine="cont.Hide";
Debug.ShouldStop(16384);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 17;BA.debugLine="cont.AddRows(1).AddColumns2x6";
Debug.ShouldStop(65536);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addrows" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns2x6" /*RemoteObject*/ );
 BA.debugLineNum = 19;BA.debugLine="Dim ec As VMContainer = AddExpense";
Debug.ShouldStop(262144);
_ec = _addexpense();Debug.locals.put("ec", _ec);Debug.locals.put("ec", _ec);
 BA.debugLineNum = 20;BA.debugLine="Dim bcm As VMContainer = AddBudgetCurrentMonth";
Debug.ShouldStop(524288);
_bcm = _addbudgetcurrentmonth();Debug.locals.put("bcm", _bcm);Debug.locals.put("bcm", _bcm);
 BA.debugLineNum = 22;BA.debugLine="cont.AddComponent(1, 1, ec.tostring)";
Debug.ShouldStop(2097152);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(_ec.runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="cont.AddComponent(1,2, bcm.tostring)";
Debug.ShouldStop(4194304);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(_bcm.runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="vm.AddContainer(cont)";
Debug.ShouldStop(33554432);
moddashboard._vm.runClassMethod (b4j.example.bananovm.class, "_addcontainer" /*RemoteObject*/ ,(Object)(_cont));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
moddashboard._vm = RemoteObject.createNew ("b4j.example.bananovm");
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"dashboardcode\"";
moddashboard._name = BA.ObjectToString("dashboardcode");
 //BA.debugLineNum = 5;BA.debugLine="Public expcont As VMContainer   ' container for A";
moddashboard._expcont = RemoteObject.createNew ("b4j.example.vmcontainer");
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano";
moddashboard._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}