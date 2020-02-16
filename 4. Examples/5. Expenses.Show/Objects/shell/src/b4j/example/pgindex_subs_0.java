package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pgindex_subs_0 {


public static RemoteObject  _addpages() throws Exception{
try {
		Debug.PushSubsStack("AddPages (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,93);
if (RapidSub.canDelegate("addpages")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","addpages");}
 BA.debugLineNum = 93;BA.debugLine="Sub AddPages";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="vm.AddPage(modDashboard.name, modDashboard)";
Debug.ShouldStop(536870912);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_addpage" /*RemoteObject*/ ,(Object)(pgindex._moddashboard._name /*RemoteObject*/ ),(Object)((pgindex._moddashboard.getObject())));
 BA.debugLineNum = 95;BA.debugLine="vm.AddPage(modExpenses.name, modExpenses)";
Debug.ShouldStop(1073741824);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_addpage" /*RemoteObject*/ ,(Object)(pgindex._modexpenses._name /*RemoteObject*/ ),(Object)((pgindex._modexpenses.getObject())));
 BA.debugLineNum = 96;BA.debugLine="vm.AddPage(modStats.name, modStats)";
Debug.ShouldStop(-2147483648);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_addpage" /*RemoteObject*/ ,(Object)(pgindex._modstats._name /*RemoteObject*/ ),(Object)((pgindex._modstats.getObject())));
 BA.debugLineNum = 97;BA.debugLine="vm.AddPage(modExpenseTypes.name, modExpenseTypes)";
Debug.ShouldStop(1);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_addpage" /*RemoteObject*/ ,(Object)(pgindex._modexpensetypes._name /*RemoteObject*/ ),(Object)((pgindex._modexpensetypes.getObject())));
 BA.debugLineNum = 98;BA.debugLine="vm.Addpage(modExpenseCategories.name, modExpenseC";
Debug.ShouldStop(2);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_addpage" /*RemoteObject*/ ,(Object)(pgindex._modexpensecategories._name /*RemoteObject*/ ),(Object)((pgindex._modexpensecategories.getObject())));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("back_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,145);
if (RapidSub.canDelegate("back_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","back_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 145;BA.debugLine="Sub back_click(e As BANanoEvent)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaddexpense_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnAddExpense_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,64);
if (RapidSub.canDelegate("btnaddexpense_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","btnaddexpense_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 64;BA.debugLine="Sub btnAddExpense_click(e As BANanoEvent)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="modExpenses.add";
Debug.ShouldStop(1);
pgindex._modexpenses.runVoidMethod ("_add" /*RemoteObject*/ );
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaddexpensecategory_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnAddExpenseCategory_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,72);
if (RapidSub.canDelegate("btnaddexpensecategory_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","btnaddexpensecategory_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 72;BA.debugLine="Sub btnAddExpenseCategory_click(e As BANanoEvent)";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="modExpenseCategories.Add";
Debug.ShouldStop(256);
pgindex._modexpensecategories.runVoidMethod ("_add" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaddexpensetype_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnAddExpenseType_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,68);
if (RapidSub.canDelegate("btnaddexpensetype_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","btnaddexpensetype_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 68;BA.debugLine="Sub btnAddExpenseType_click(e As BANanoEvent)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="modExpenseTypes.Add";
Debug.ShouldStop(16);
pgindex._modexpensetypes.runVoidMethod ("_add" /*RemoteObject*/ );
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _builddrawer() throws Exception{
try {
		Debug.PushSubsStack("BuildDrawer (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,82);
if (RapidSub.canDelegate("builddrawer")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","builddrawer");}
 BA.debugLineNum = 82;BA.debugLine="Sub BuildDrawer";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="vm.Drawer.AddItem(\"dashboard\",\"\",\"Dashboard\")";
Debug.ShouldStop(262144);
pgindex._vm.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_additem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("dashboard")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("Dashboard")));
 BA.debugLineNum = 84;BA.debugLine="vm.Drawer.AddItem(\"expenses\",\"\",\"Expenses\")";
Debug.ShouldStop(524288);
pgindex._vm.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_additem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expenses")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("Expenses")));
 BA.debugLineNum = 85;BA.debugLine="vm.Drawer.AddItem(\"stats\",\"\",\"Stats\")";
Debug.ShouldStop(1048576);
pgindex._vm.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_additem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("stats")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("Stats")));
 BA.debugLineNum = 86;BA.debugLine="vm.Drawer.AddItem(\"settings\",\"\",\"Settings\")";
Debug.ShouldStop(2097152);
pgindex._vm.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_additem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("settings")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("Settings")));
 BA.debugLineNum = 87;BA.debugLine="vm.Drawer.AddSubItem(\"settings\",\"expensetypes\",\"\"";
Debug.ShouldStop(4194304);
pgindex._vm.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_addsubitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("settings")),(Object)(BA.ObjectToString("expensetypes")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("Expense Types")));
 BA.debugLineNum = 88;BA.debugLine="vm.Drawer.AddSubItem(\"settings\",\"expensecategorie";
Debug.ShouldStop(8388608);
pgindex._vm.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_addsubitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("settings")),(Object)(BA.ObjectToString("expensecategories")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("Expense Categories")));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _confirm_ok() throws Exception{
try {
		Debug.PushSubsStack("confirm_ok (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,149);
if (RapidSub.canDelegate("confirm_ok")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","confirm_ok");}
RemoteObject _sconfirm = RemoteObject.createImmutable("");
RemoteObject _sid = RemoteObject.createImmutable("");
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
 BA.debugLineNum = 149;BA.debugLine="Sub confirm_ok";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim sconfirm As String = vm.GetConfirm";
Debug.ShouldStop(2097152);
_sconfirm = pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_getconfirm" /*RemoteObject*/ );Debug.locals.put("sconfirm", _sconfirm);Debug.locals.put("sconfirm", _sconfirm);
 BA.debugLineNum = 151;BA.debugLine="Select Case sconfirm";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_sconfirm,BA.ObjectToString("delete_expensetype"),BA.ObjectToString("delete_category"))) {
case 0: {
 BA.debugLineNum = 154;BA.debugLine="Dim sid As String = vm.getstate(\"expensetypeid\",";
Debug.ShouldStop(33554432);
_sid = BA.ObjectToString(pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_getstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expensetypeid")),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 155;BA.debugLine="If sid = \"\" Then Return";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_sid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 157;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(268435456);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 158;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensetypes\", \"id";
Debug.ShouldStop(536870912);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,pgindex.ba,(Object)(pgindex._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expensetypes")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 159;BA.debugLine="dbsql.Delete(sid)";
Debug.ShouldStop(1073741824);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_delete" /*RemoteObject*/ ,(Object)(_sid));
 BA.debugLineNum = 160;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
Debug.ShouldStop(-2147483648);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(pgindex._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 161;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(1);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(2);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 163;BA.debugLine="vm.ShowSnackBar(\"Expense Type deleted successfu";
Debug.ShouldStop(4);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense Type deleted successfully!")));
 BA.debugLineNum = 165;BA.debugLine="modExpenseTypes.Refresh";
Debug.ShouldStop(16);
pgindex._modexpensetypes.runVoidMethod ("_refresh" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 167;BA.debugLine="Log(\"phIndex.confirm_ok.delete_expensetype: Err";
Debug.ShouldStop(64);
pgindex.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("phIndex.confirm_ok.delete_expensetype: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 168;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(128);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 break; }
case 1: {
 BA.debugLineNum = 173;BA.debugLine="Dim sid As String = vm.getstate(\"categoryid\", \"\"";
Debug.ShouldStop(4096);
_sid = BA.ObjectToString(pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_getstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("categoryid")),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 174;BA.debugLine="If sid = \"\" Then Return";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_sid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 175;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(16384);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 176;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensecategories\"";
Debug.ShouldStop(32768);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,pgindex.ba,(Object)(pgindex._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expensecategories")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 177;BA.debugLine="dbsql.Delete(sid)";
Debug.ShouldStop(65536);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_delete" /*RemoteObject*/ ,(Object)(_sid));
 BA.debugLineNum = 178;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.meth";
Debug.ShouldStop(131072);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(pgindex._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 179;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(262144);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(524288);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 181;BA.debugLine="vm.ShowSnackBar(\"Expense Category deleted succe";
Debug.ShouldStop(1048576);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense Category deleted successfully!")));
 BA.debugLineNum = 182;BA.debugLine="modExpenseCategories.Refresh";
Debug.ShouldStop(2097152);
pgindex._modexpensecategories.runVoidMethod ("_refresh" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 184;BA.debugLine="Log(\"phIndex.confirm_ok.delete_category: Error";
Debug.ShouldStop(8388608);
pgindex.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("phIndex.confirm_ok.delete_category: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 185;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(16777216);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 break; }
}
;
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dashboard_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("dashboard_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,131);
if (RapidSub.canDelegate("dashboard_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","dashboard_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 131;BA.debugLine="Sub dashboard_click(e As BANanoEvent)";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="ShowDashboard";
Debug.ShouldStop(8);
_showdashboard();
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expensecategories_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("expensecategories_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,109);
if (RapidSub.canDelegate("expensecategories_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","expensecategories_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 109;BA.debugLine="Sub expensecategories_click(e As BANanoEvent)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="HideButtons";
Debug.ShouldStop(8192);
_hidebuttons();
 BA.debugLineNum = 111;BA.debugLine="vm.show(\"btnAddExpenseCategory\")";
Debug.ShouldStop(16384);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_show" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("btnAddExpenseCategory")));
 BA.debugLineNum = 112;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Settings\")";
Debug.ShouldStop(32768);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expenses.Show - Settings")));
 BA.debugLineNum = 113;BA.debugLine="vm.showpage(modExpenseCategories.name)";
Debug.ShouldStop(65536);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showpage" /*RemoteObject*/ ,(Object)(pgindex._modexpensecategories._name /*RemoteObject*/ ));
 BA.debugLineNum = 114;BA.debugLine="modExpenseCategories.refresh";
Debug.ShouldStop(131072);
pgindex._modexpensecategories.runVoidMethod ("_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expenses_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("expenses_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,123);
if (RapidSub.canDelegate("expenses_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","expenses_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 123;BA.debugLine="Sub expenses_click(e As BANanoEvent)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="HideButtons";
Debug.ShouldStop(134217728);
_hidebuttons();
 BA.debugLineNum = 125;BA.debugLine="vm.Show(\"btnAddExpense\")";
Debug.ShouldStop(268435456);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_show" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("btnAddExpense")));
 BA.debugLineNum = 126;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Expenses\")";
Debug.ShouldStop(536870912);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expenses.Show - Expenses")));
 BA.debugLineNum = 127;BA.debugLine="vm.showpage(modExpenses.name)";
Debug.ShouldStop(1073741824);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showpage" /*RemoteObject*/ ,(Object)(pgindex._modexpenses._name /*RemoteObject*/ ));
 BA.debugLineNum = 128;BA.debugLine="modExpenses.refresh";
Debug.ShouldStop(-2147483648);
pgindex._modexpenses.runVoidMethod ("_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expensetypes_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("expensetypes_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,101);
if (RapidSub.canDelegate("expensetypes_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","expensetypes_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 101;BA.debugLine="Sub expensetypes_click(e As BANanoEvent)";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="HideButtons";
Debug.ShouldStop(32);
_hidebuttons();
 BA.debugLineNum = 103;BA.debugLine="vm.Show(\"btnAddExpenseType\")";
Debug.ShouldStop(64);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_show" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("btnAddExpenseType")));
 BA.debugLineNum = 104;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Settings\")";
Debug.ShouldStop(128);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expenses.Show - Settings")));
 BA.debugLineNum = 105;BA.debugLine="vm.showpage(modExpenseTypes.name)";
Debug.ShouldStop(256);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showpage" /*RemoteObject*/ ,(Object)(pgindex._modexpensetypes._name /*RemoteObject*/ ));
 BA.debugLineNum = 106;BA.debugLine="modExpenseTypes.refresh";
Debug.ShouldStop(512);
pgindex._modexpensetypes.runVoidMethod ("_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidebuttons() throws Exception{
try {
		Debug.PushSubsStack("HideButtons (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,76);
if (RapidSub.canDelegate("hidebuttons")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","hidebuttons");}
 BA.debugLineNum = 76;BA.debugLine="Sub HideButtons";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="vm.hide(\"btnAddExpenseCategory\")";
Debug.ShouldStop(4096);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_hide" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("btnAddExpenseCategory")));
 BA.debugLineNum = 78;BA.debugLine="vm.Hide(\"btnAddExpenseType\")";
Debug.ShouldStop(8192);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_hide" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("btnAddExpenseType")));
 BA.debugLineNum = 79;BA.debugLine="vm.hide(\"btnAddExpense\")";
Debug.ShouldStop(16384);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_hide" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("btnAddExpense")));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _init() throws Exception{
try {
		Debug.PushSubsStack("Init (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,7);
if (RapidSub.canDelegate("init")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","init");}
 BA.debugLineNum = 7;BA.debugLine="Sub Init";
Debug.ShouldStop(64);
 BA.debugLineNum = 9;BA.debugLine="vm.Initialize(Me, Main.appname)";
Debug.ShouldStop(256);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_initialize" /*RemoteObject*/ ,pgindex.ba,(Object)(pgindex.getObject()),(Object)(pgindex._main._appname /*RemoteObject*/ ));
 BA.debugLineNum = 10;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show\")";
Debug.ShouldStop(512);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expenses.Show")));
 BA.debugLineNum = 11;BA.debugLine="vm.Drawer.SetTitle(\"Expenses.Show\")";
Debug.ShouldStop(1024);
pgindex._vm.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expenses.Show")));
 BA.debugLineNum = 12;BA.debugLine="vm.Drawer.SetPersistentFull(True)";
Debug.ShouldStop(2048);
pgindex._vm.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmdrawer.class, "_setpersistentfull" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 14;BA.debugLine="vm.NavBar.Show";
Debug.ShouldStop(8192);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 16;BA.debugLine="vm.NavBar.SetPrimary(True)";
Debug.ShouldStop(32768);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_setprimary" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 18;BA.debugLine="vm.NavBar.SetModeFixed(True)";
Debug.ShouldStop(131072);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_setmodefixed" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 20;BA.debugLine="vm.NavBar.SetHasBackButton(False)";
Debug.ShouldStop(524288);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_sethasbackbutton" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"False")));
 BA.debugLineNum = 22;BA.debugLine="vm.NavBar.SetHasMenuButton(True)";
Debug.ShouldStop(2097152);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_sethasmenubutton" /*RemoteObject*/ ,(Object)(pgindex.__c.getField(true,"True")));
 BA.debugLineNum = 23;BA.debugLine="vm.NavBar.AddIcon(\"btnAddExpenseType\", \"add\", \"Ad";
Debug.ShouldStop(4194304);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_addicon" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnAddExpenseType")),(Object)(BA.ObjectToString("add")),(Object)(BA.ObjectToString("Add expense type")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="vm.NavBar.AddIcon(\"btnAddExpenseCategory\", \"add\",";
Debug.ShouldStop(8388608);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_addicon" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnAddExpenseCategory")),(Object)(BA.ObjectToString("add")),(Object)(BA.ObjectToString("Add expense category")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="vm.NavBar.AddIcon(\"btnAddExpense\", \"add\", \"Add ex";
Debug.ShouldStop(16777216);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_addicon" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnAddExpense")),(Object)(BA.ObjectToString("add")),(Object)(BA.ObjectToString("Add expense")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="vm.SetMethod(Me, \"LoadTypes\")";
Debug.ShouldStop(134217728);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_setmethod" /*RemoteObject*/ ,(Object)(pgindex.getObject()),(Object)(RemoteObject.createImmutable("LoadTypes")));
 BA.debugLineNum = 29;BA.debugLine="vm.SetMethod(Me, \"LoadCategories\")";
Debug.ShouldStop(268435456);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_setmethod" /*RemoteObject*/ ,(Object)(pgindex.getObject()),(Object)(RemoteObject.createImmutable("LoadCategories")));
 BA.debugLineNum = 31;BA.debugLine="BuildDrawer";
Debug.ShouldStop(1073741824);
_builddrawer();
 BA.debugLineNum = 32;BA.debugLine="AddPages";
Debug.ShouldStop(-2147483648);
_addpages();
 BA.debugLineNum = 33;BA.debugLine="HideButtons";
Debug.ShouldStop(1);
_hidebuttons();
 BA.debugLineNum = 35;BA.debugLine="vm.ux";
Debug.ShouldStop(4);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_ux" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="ShowDashboard";
Debug.ShouldStop(16);
_showdashboard();
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcategories() throws Exception{
try {
		Debug.PushSubsStack("LoadCategories (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,52);
if (RapidSub.canDelegate("loadcategories")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","loadcategories");}
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
 BA.debugLineNum = 52;BA.debugLine="Sub LoadCategories";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="vm.SetStateSingle(\"categories\", Array())";
Debug.ShouldStop(1048576);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("categories"))),(Object)((RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 54;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(2097152);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 55;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensecategories\",";
Debug.ShouldStop(4194304);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,pgindex.ba,(Object)(pgindex._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expensecategories")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 56;BA.debugLine="dbsql.SelectAll(Array(\"id\",\"text\"), Array(\"text\")";
Debug.ShouldStop(8388608);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_selectall" /*RemoteObject*/ ,(Object)(pgindex.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("id")),(RemoteObject.createImmutable("text"))})))),(Object)(pgindex.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("text"))})))));
 BA.debugLineNum = 57;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
Debug.ShouldStop(16777216);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(pgindex._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 58;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(33554432);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(67108864);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 60;BA.debugLine="vm.SetStateSingle(\"categories\", dbsql.result)";
Debug.ShouldStop(134217728);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("categories"))),(Object)((_dbsql.getField(false,"_result" /*RemoteObject*/ ).getObject())));
 };
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadtypes() throws Exception{
try {
		Debug.PushSubsStack("LoadTypes (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,40);
if (RapidSub.canDelegate("loadtypes")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","loadtypes");}
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
 BA.debugLineNum = 40;BA.debugLine="Sub LoadTypes";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="vm.SetStateSingle(\"types\", Array())";
Debug.ShouldStop(256);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("types"))),(Object)((RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 42;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(512);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 43;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensetypes\", \"id\"";
Debug.ShouldStop(1024);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,pgindex.ba,(Object)(pgindex._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expensetypes")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 44;BA.debugLine="dbsql.SelectAll(Array(\"id\",\"text\"), Array(\"text\")";
Debug.ShouldStop(2048);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_selectall" /*RemoteObject*/ ,(Object)(pgindex.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("id")),(RemoteObject.createImmutable("text"))})))),(Object)(pgindex.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("text"))})))));
 BA.debugLineNum = 45;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
Debug.ShouldStop(4096);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(pgindex._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 46;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(8192);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(16384);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="vm.SetStateSingle(\"types\", dbsql.result)";
Debug.ShouldStop(32768);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("types"))),(Object)((_dbsql.getField(false,"_result" /*RemoteObject*/ ).getObject())));
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano  'ignore";
pgindex._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 4;BA.debugLine="Public vm As BANanoVM";
pgindex._vm = RemoteObject.createNew ("b4j.example.bananovm");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showdashboard() throws Exception{
try {
		Debug.PushSubsStack("ShowDashboard (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,135);
if (RapidSub.canDelegate("showdashboard")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","showdashboard");}
 BA.debugLineNum = 135;BA.debugLine="Sub ShowDashboard";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="HideButtons";
Debug.ShouldStop(128);
_hidebuttons();
 BA.debugLineNum = 138;BA.debugLine="vm.CallMethod(\"LoadTypes\")";
Debug.ShouldStop(512);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_callmethod" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("LoadTypes")));
 BA.debugLineNum = 139;BA.debugLine="vm.CallMethod(\"LoadCategories\")";
Debug.ShouldStop(1024);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_callmethod" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("LoadCategories")));
 BA.debugLineNum = 140;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Dashboard\")";
Debug.ShouldStop(2048);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expenses.Show - Dashboard")));
 BA.debugLineNum = 141;BA.debugLine="modDashboard.expcont.setdefaults";
Debug.ShouldStop(4096);
pgindex._moddashboard._expcont /*RemoteObject*/ .runClassMethod (b4j.example.vmcontainer.class, "_setdefaults" /*RemoteObject*/ );
 BA.debugLineNum = 142;BA.debugLine="vm.showpage(modDashboard.name)";
Debug.ShouldStop(8192);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showpage" /*RemoteObject*/ ,(Object)(pgindex._moddashboard._name /*RemoteObject*/ ));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stats_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("stats_click (pgindex) ","pgindex",1,pgindex.ba,pgindex.mostCurrent,117);
if (RapidSub.canDelegate("stats_click")) { return b4j.example.pgindex.remoteMe.runUserSub(false, "pgindex","stats_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 117;BA.debugLine="Sub stats_click(e As BANanoEvent)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="HideButtons";
Debug.ShouldStop(2097152);
_hidebuttons();
 BA.debugLineNum = 119;BA.debugLine="vm.NavBar.SetTitle(\"Expenses.Show - Stats\")";
Debug.ShouldStop(4194304);
pgindex._vm.getField(false,"_navbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expenses.Show - Stats")));
 BA.debugLineNum = 120;BA.debugLine="vm.showpage(modStats.name)";
Debug.ShouldStop(8388608);
pgindex._vm.runClassMethod (b4j.example.bananovm.class, "_showpage" /*RemoteObject*/ ,(Object)(pgindex._modstats._name /*RemoteObject*/ ));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}