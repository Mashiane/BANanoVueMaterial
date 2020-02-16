package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modexpensetypes_subs_0 {


public static RemoteObject  _add() throws Exception{
try {
		Debug.PushSubsStack("Add (modexpensetypes) ","modexpensetypes",5,modexpensetypes.ba,modexpensetypes.mostCurrent,56);
if (RapidSub.canDelegate("add")) { return b4j.example.modexpensetypes.remoteMe.runUserSub(false, "modexpensetypes","add");}
 BA.debugLineNum = 56;BA.debugLine="Sub Add";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Mode = \"A\"";
Debug.ShouldStop(16777216);
modexpensetypes._mode = BA.ObjectToString("A");
 BA.debugLineNum = 58;BA.debugLine="mdlExpenseType.Container.SetDefaults";
Debug.ShouldStop(33554432);
modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_setdefaults" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="mdlExpenseType.SetTitle(\"New Expense Type\")";
Debug.ShouldStop(67108864);
modexpensetypes._mdlexpensetype.runClassMethod (b4j.example.vmdialog.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("New Expense Type")));
 BA.debugLineNum = 60;BA.debugLine="vm.ShowDialog(\"mdlExpenseType\")";
Debug.ShouldStop(134217728);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_showdialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseType")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancelexpensetype_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnCancelExpenseType_click (modexpensetypes) ","modexpensetypes",5,modexpensetypes.ba,modexpensetypes.mostCurrent,80);
if (RapidSub.canDelegate("btncancelexpensetype_click")) { return b4j.example.modexpensetypes.remoteMe.runUserSub(false, "modexpensetypes","btncancelexpensetype_click", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 80;BA.debugLine="Sub btnCancelExpenseType_click(e As BANanoEvent)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="vm.HideDialog(\"mdlExpenseType\")";
Debug.ShouldStop(65536);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseType")));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsaveexpensetype_click(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("btnSaveExpenseType_click (modexpensetypes) ","modexpensetypes",5,modexpensetypes.ba,modexpensetypes.mostCurrent,84);
if (RapidSub.canDelegate("btnsaveexpensetype_click")) { return b4j.example.modexpensetypes.remoteMe.runUserSub(false, "modexpensetypes","btnsaveexpensetype_click", _e);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bvalid = RemoteObject.createImmutable(false);
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
RemoteObject _sid = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 84;BA.debugLine="Sub btnSaveExpenseType_click(e As BANanoEvent)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="Dim rec As Map = mdlExpenseType.Container.GetData";
Debug.ShouldStop(2097152);
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec = modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_getdata" /*RemoteObject*/ );Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 88;BA.debugLine="Dim bValid As Boolean = vm.validate(rec, mdlExpen";
Debug.ShouldStop(8388608);
_bvalid = modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_validate" /*RemoteObject*/ ,(Object)(_rec),(Object)(modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).getField(false,"_required" /*RemoteObject*/ )));Debug.locals.put("bValid", _bvalid);Debug.locals.put("bValid", _bvalid);
 BA.debugLineNum = 89;BA.debugLine="If bValid = False Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_bvalid,modexpensetypes.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 91;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(67108864);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 92;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensetypes\", \"id\"";
Debug.ShouldStop(134217728);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,modexpensetypes.ba,(Object)(modexpensetypes._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expensetypes")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 93;BA.debugLine="dbsql.SchemaFromDesign(mdlExpenseType.Container)";
Debug.ShouldStop(268435456);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_schemafromdesign" /*RemoteObject*/ ,(Object)(modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ )));
 BA.debugLineNum = 94;BA.debugLine="Select Case Mode";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(modexpensetypes._mode,BA.ObjectToString("A"),BA.ObjectToString("E"))) {
case 0: {
 BA.debugLineNum = 96;BA.debugLine="dbsql.RecordFromMap(rec)";
Debug.ShouldStop(-2147483648);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_recordfrommap" /*RemoteObject*/ ,(Object)(_rec));
 BA.debugLineNum = 97;BA.debugLine="dbsql.Insert";
Debug.ShouldStop(1);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_insert" /*RemoteObject*/ );
 BA.debugLineNum = 98;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.met";
Debug.ShouldStop(2);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpensetypes._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 99;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(4);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(8);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 101;BA.debugLine="vm.ShowSnackBar(\"Expense Type added successful";
Debug.ShouldStop(16);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense Type added successfully!")));
 BA.debugLineNum = 102;BA.debugLine="vm.HideDialog(\"mdlExpenseType\")";
Debug.ShouldStop(32);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseType")));
 BA.debugLineNum = 103;BA.debugLine="Refresh";
Debug.ShouldStop(64);
_refresh();
 }else {
 BA.debugLineNum = 105;BA.debugLine="Log(\"modExpenseTypes.btnSaveExpenseType_click:";
Debug.ShouldStop(256);
modexpensetypes.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenseTypes.btnSaveExpenseType_click: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 106;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(512);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 break; }
case 1: {
 BA.debugLineNum = 109;BA.debugLine="Dim sid As String = rec.Get(\"id\")";
Debug.ShouldStop(4096);
_sid = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 110;BA.debugLine="dbsql.RecordFromMap(rec)";
Debug.ShouldStop(8192);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_recordfrommap" /*RemoteObject*/ ,(Object)(_rec));
 BA.debugLineNum = 111;BA.debugLine="dbsql.Update(sid)";
Debug.ShouldStop(16384);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_update" /*RemoteObject*/ ,(Object)(_sid));
 BA.debugLineNum = 112;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.met";
Debug.ShouldStop(32768);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpensetypes._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 113;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(65536);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(131072);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 115;BA.debugLine="vm.ShowSnackBar(\"Expense Type updated successf";
Debug.ShouldStop(262144);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense Type updated successfully!")));
 BA.debugLineNum = 116;BA.debugLine="vm.HideDialog(\"mdlExpenseType\")";
Debug.ShouldStop(524288);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_hidedialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseType")));
 BA.debugLineNum = 117;BA.debugLine="Refresh";
Debug.ShouldStop(1048576);
_refresh();
 }else {
 BA.debugLineNum = 119;BA.debugLine="Log(\"modExpenseTypes.btnSaveExpenseType_click:";
Debug.ShouldStop(4194304);
modexpensetypes.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenseTypes.btnSaveExpenseType_click: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 BA.debugLineNum = 120;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
Debug.ShouldStop(8388608);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_showsnackbar" /*RemoteObject*/ ,(Object)(_dbsql.getField(true,"_error" /*RemoteObject*/ )));
 };
 break; }
}
;
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Code (modexpensetypes) ","modexpensetypes",5,modexpensetypes.ba,modexpensetypes.mostCurrent,11);
if (RapidSub.canDelegate("code")) { return b4j.example.modexpensetypes.remoteMe.runUserSub(false, "modexpensetypes","code");}
RemoteObject _cont = RemoteObject.declareNull("b4j.example.vmcontainer");
RemoteObject _etid = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _ettext = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _etdescription = RemoteObject.declareNull("b4j.example.vminputcontrol");
 BA.debugLineNum = 11;BA.debugLine="Sub Code";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Mode = \"\"";
Debug.ShouldStop(2048);
modexpensetypes._mode = BA.ObjectToString("");
 BA.debugLineNum = 13;BA.debugLine="Log(\"modExpenseTypes.Code\")";
Debug.ShouldStop(4096);
modexpensetypes.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("modExpenseTypes.Code")));
 BA.debugLineNum = 14;BA.debugLine="vm = pgIndex.vm";
Debug.ShouldStop(8192);
modexpensetypes._vm = modexpensetypes._pgindex._vm /*RemoteObject*/ ;
 BA.debugLineNum = 16;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
Debug.ShouldStop(32768);
_cont = modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_createcontainer" /*RemoteObject*/ ,(Object)(modexpensetypes._name),(Object)(modexpensetypes.getObject()));Debug.locals.put("cont", _cont);Debug.locals.put("cont", _cont);
 BA.debugLineNum = 18;BA.debugLine="cont.Hide";
Debug.ShouldStop(131072);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 20;BA.debugLine="cont.AddRows(1).AddColumns12";
Debug.ShouldStop(524288);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addrows" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns12" /*RemoteObject*/ );
 BA.debugLineNum = 22;BA.debugLine="expenseType = vm.CreateGijgoTable(\"expensetype\",";
Debug.ShouldStop(2097152);
modexpensetypes._expensetype = modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_creategijgotable" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expensetype")),(Object)(BA.ObjectToString("id")),(Object)(modexpensetypes.getObject()));
 BA.debugLineNum = 23;BA.debugLine="expenseType.SetTitle(\"Expense Types\")";
Debug.ShouldStop(4194304);
modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Expense Types")));
 BA.debugLineNum = 24;BA.debugLine="expenseType.AddColumn(\"text\",\"Name\")   ' 20";
Debug.ShouldStop(8388608);
modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text")),(Object)(RemoteObject.createImmutable("Name")));
 BA.debugLineNum = 25;BA.debugLine="expenseType.AddColumn(\"description\",\"Description\"";
Debug.ShouldStop(16777216);
modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("description")),(Object)(RemoteObject.createImmutable("Description")));
 BA.debugLineNum = 26;BA.debugLine="expenseType.AddEditTrash";
Debug.ShouldStop(33554432);
modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_addedittrash" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="expenseType.autoLoad = True";
Debug.ShouldStop(67108864);
modexpensetypes._expensetype.setField ("_autoload" /*RemoteObject*/ ,modexpensetypes.__c.getField(true,"True"));
 BA.debugLineNum = 28;BA.debugLine="expenseType.SetDataSource(Array())";
Debug.ShouldStop(134217728);
modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_setdatasource" /*RemoteObject*/ ,(Object)(modexpensetypes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {})))));
 BA.debugLineNum = 29;BA.debugLine="cont.AddComponent(1,1, expenseType.tostring)";
Debug.ShouldStop(268435456);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="vm.AddContainer(cont)";
Debug.ShouldStop(1073741824);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_addcontainer" /*RemoteObject*/ ,(Object)(_cont));
 BA.debugLineNum = 34;BA.debugLine="mdlExpenseType = vm.CreateDialog(\"mdlExpenseType\"";
Debug.ShouldStop(2);
modexpensetypes._mdlexpensetype = modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_createdialog" /*RemoteObject*/ ,(Object)(BA.ObjectToString("mdlExpenseType")),(Object)(modexpensetypes.getObject()));
 BA.debugLineNum = 35;BA.debugLine="mdlExpenseType.settitle(\"New Expense Type\")";
Debug.ShouldStop(4);
modexpensetypes._mdlexpensetype.runClassMethod (b4j.example.vmdialog.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("New Expense Type")));
 BA.debugLineNum = 36;BA.debugLine="mdlExpenseType.AddCancel(\"btnCancelExpenseType\",";
Debug.ShouldStop(8);
modexpensetypes._mdlexpensetype.runClassMethod (b4j.example.vmdialog.class, "_addcancel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnCancelExpenseType")),(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 37;BA.debugLine="mdlExpenseType.AddOK(\"btnSaveExpenseType\", \"Save\"";
Debug.ShouldStop(16);
modexpensetypes._mdlexpensetype.runClassMethod (b4j.example.vmdialog.class, "_addok" /*RemoteObject*/ ,(Object)(BA.ObjectToString("btnSaveExpenseType")),(Object)(RemoteObject.createImmutable("Save")));
 BA.debugLineNum = 39;BA.debugLine="Dim etID As VMInputControl = mdlExpenseType.Conta";
Debug.ShouldStop(64);
_etid = modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("id")),(Object)(BA.ObjectToString("#")),(Object)(BA.ObjectToString("")),(Object)(modexpensetypes.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("etID", _etid);Debug.locals.put("etID", _etid);
 BA.debugLineNum = 40;BA.debugLine="etID.SetVisible(False).SetInt";
Debug.ShouldStop(128);
_etid.runClassMethod (b4j.example.vminputcontrol.class, "_setvisible" /*RemoteObject*/ ,(Object)(modexpensetypes.__c.getField(true,"False"))).runClassMethod (b4j.example.vminputcontrol.class, "_setint" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="Dim etText As VMInputControl = mdlExpenseType.Con";
Debug.ShouldStop(256);
_ettext = modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("text")),(Object)(BA.ObjectToString("Name")),(Object)(BA.ObjectToString("")),(Object)(modexpensetypes.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 20)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("The expense type is required!")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("etText", _ettext);Debug.locals.put("etText", _ettext);
 BA.debugLineNum = 42;BA.debugLine="Dim etDescription As VMInputControl = mdlExpenseT";
Debug.ShouldStop(512);
_etdescription = modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_newtextarea" /*RemoteObject*/ ,(Object)(BA.ObjectToString("description")),(Object)(BA.ObjectToString("Description")),(Object)(BA.ObjectToString("")),(Object)(modexpensetypes.__c.getField(true,"False")),(Object)(modexpensetypes.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("etDescription", _etdescription);Debug.locals.put("etDescription", _etdescription);
 BA.debugLineNum = 45;BA.debugLine="mdlExpenseType.Container.AddControlS(etID, 1, 1,";
Debug.ShouldStop(4096);
modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrols" /*RemoteObject*/ ,(Object)(_etid),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 46;BA.debugLine="mdlExpenseType.Container.AddControlS(etText, 2, 1";
Debug.ShouldStop(8192);
modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrols" /*RemoteObject*/ ,(Object)(_ettext),(Object)(BA.NumberToString(2)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 47;BA.debugLine="mdlExpenseType.Container.AddControlS(etDescriptio";
Debug.ShouldStop(16384);
modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_addcontrols" /*RemoteObject*/ ,(Object)(_etdescription),(Object)(BA.NumberToString(3)),(Object)(BA.NumberToString(1)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)),(Object)(BA.NumberToString(12)));
 BA.debugLineNum = 49;BA.debugLine="mdlExpenseType.SetClickOutsideToClose(False)";
Debug.ShouldStop(65536);
modexpensetypes._mdlexpensetype.runClassMethod (b4j.example.vmdialog.class, "_setclickoutsidetoclose" /*RemoteObject*/ ,(Object)(modexpensetypes.__c.getField(true,"False")));
 BA.debugLineNum = 50;BA.debugLine="mdlExpenseType.SetCloseOnEsc(False)";
Debug.ShouldStop(131072);
modexpensetypes._mdlexpensetype.runClassMethod (b4j.example.vmdialog.class, "_setcloseonesc" /*RemoteObject*/ ,(Object)(modexpensetypes.__c.getField(true,"False")));
 BA.debugLineNum = 51;BA.debugLine="mdlExpenseType.SetWidth(\"500px\")";
Debug.ShouldStop(262144);
modexpensetypes._mdlexpensetype.runClassMethod (b4j.example.vmdialog.class, "_setwidth" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("500px")));
 BA.debugLineNum = 52;BA.debugLine="vm.AddDialog(mdlExpenseType)";
Debug.ShouldStop(524288);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_adddialog" /*RemoteObject*/ ,(Object)(modexpensetypes._mdlexpensetype));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expensetype_delete(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("expensetype_delete (modexpensetypes) ","modexpensetypes",5,modexpensetypes.ba,modexpensetypes.mostCurrent,144);
if (RapidSub.canDelegate("expensetype_delete")) { return b4j.example.modexpensetypes.remoteMe.runUserSub(false, "modexpensetypes","expensetype_delete", _e);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sid = RemoteObject.createImmutable("");
RemoteObject _stext = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 144;BA.debugLine="Sub expensetype_delete(e As BANanoEvent)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 146;BA.debugLine="Dim rec As Map = expenseType.GetRecordFromEvent(e";
Debug.ShouldStop(131072);
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec = modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_getrecordfromevent" /*RemoteObject*/ ,(Object)(_e));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 147;BA.debugLine="Dim sid As String = rec.GetDefault(\"id\",\"\")";
Debug.ShouldStop(262144);
_sid = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 148;BA.debugLine="Dim stext As String = rec.getdefault(\"text\",\"\")";
Debug.ShouldStop(524288);
_stext = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("text"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("stext", _stext);Debug.locals.put("stext", _stext);
 BA.debugLineNum = 149;BA.debugLine="If sid = \"\" Then Return";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_sid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 151;BA.debugLine="vm.SetStateSingle(\"expensetypeid\", sid)";
Debug.ShouldStop(4194304);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("expensetypeid"))),(Object)((_sid)));
 BA.debugLineNum = 153;BA.debugLine="vm.ShowConfirm(\"delete_expensetype\", $\"Confirm De";
Debug.ShouldStop(16777216);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_showconfirm" /*RemoteObject*/ ,(Object)(BA.ObjectToString("delete_expensetype")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Confirm Delete: "),modexpensetypes.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stext))),RemoteObject.createImmutable("")))),(Object)(BA.ObjectToString("Are you sure that you want to delete this expense type. You will not be able to undo your actions. Continue?")),(Object)(BA.ObjectToString("Ok")),(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expensetype_edit(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("expensetype_edit (modexpensetypes) ","modexpensetypes",5,modexpensetypes.ba,modexpensetypes.mostCurrent,126);
if (RapidSub.canDelegate("expensetype_edit")) { return b4j.example.modexpensetypes.remoteMe.runUserSub(false, "modexpensetypes","expensetype_edit", _e);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sid = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 126;BA.debugLine="Sub expensetype_edit(e As BANanoEvent)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 128;BA.debugLine="Dim rec As Map = expenseType.GetRecordFromEvent(e";
Debug.ShouldStop(-2147483648);
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec = modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_getrecordfromevent" /*RemoteObject*/ ,(Object)(_e));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 129;BA.debugLine="Dim sid As String = rec.GetDefault(\"id\",\"\")";
Debug.ShouldStop(1);
_sid = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sid", _sid);Debug.locals.put("sid", _sid);
 BA.debugLineNum = 130;BA.debugLine="If sid = \"\" Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_sid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 132;BA.debugLine="Mode = \"E\"";
Debug.ShouldStop(8);
modexpensetypes._mode = BA.ObjectToString("E");
 BA.debugLineNum = 134;BA.debugLine="mdlExpenseType.SetTitle(\"Edit Expense Type\")";
Debug.ShouldStop(32);
modexpensetypes._mdlexpensetype.runClassMethod (b4j.example.vmdialog.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Edit Expense Type")));
 BA.debugLineNum = 136;BA.debugLine="mdlExpenseType.Container.setdefaults";
Debug.ShouldStop(128);
modexpensetypes._mdlexpensetype.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_setdefaults" /*RemoteObject*/ );
 BA.debugLineNum = 138;BA.debugLine="vm.SetState(rec)";
Debug.ShouldStop(512);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_setstate" /*RemoteObject*/ ,(Object)(_rec));
 BA.debugLineNum = 140;BA.debugLine="vm.showdialog(\"mdlExpenseType\")";
Debug.ShouldStop(2048);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_showdialog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mdlExpenseType")));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
modexpensetypes._vm = RemoteObject.createNew ("b4j.example.bananovm");
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"expensetypecode\"";
modexpensetypes._name = BA.ObjectToString("expensetypecode");
 //BA.debugLineNum = 5;BA.debugLine="Private expenseType As VMGijgoTable";
modexpensetypes._expensetype = RemoteObject.createNew ("b4j.example.vmgijgotable");
 //BA.debugLineNum = 6;BA.debugLine="Public Mode As String";
modexpensetypes._mode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 7;BA.debugLine="Public mdlExpenseType As VMDialog";
modexpensetypes._mdlexpensetype = RemoteObject.createNew ("b4j.example.vmdialog");
 //BA.debugLineNum = 8;BA.debugLine="Private BANano As BANano";
modexpensetypes._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refresh() throws Exception{
try {
		Debug.PushSubsStack("Refresh (modexpensetypes) ","modexpensetypes",5,modexpensetypes.ba,modexpensetypes.mostCurrent,64);
if (RapidSub.canDelegate("refresh")) { return b4j.example.modexpensetypes.remoteMe.runUserSub(false, "modexpensetypes","refresh");}
RemoteObject _dbsql = RemoteObject.declareNull("b4j.example.bananomysql");
 BA.debugLineNum = 64;BA.debugLine="Sub Refresh";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="vm.pagepause";
Debug.ShouldStop(1);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_pagepause" /*RemoteObject*/ );
 BA.debugLineNum = 66;BA.debugLine="Dim dbsql As BANanoMySQL";
Debug.ShouldStop(2);
_dbsql = RemoteObject.createNew ("b4j.example.bananomysql");Debug.locals.put("dbsql", _dbsql);
 BA.debugLineNum = 67;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensetypes\", \"id\"";
Debug.ShouldStop(4);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_initialize" /*RemoteObject*/ ,modexpensetypes.ba,(Object)(modexpensetypes._main._dbase /*RemoteObject*/ ),(Object)(BA.ObjectToString("expensetypes")),(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 68;BA.debugLine="dbsql.SelectAll(Array(\"*\"), Array(\"text\"))";
Debug.ShouldStop(8);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_selectall" /*RemoteObject*/ ,(Object)(modexpensetypes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*"))})))),(Object)(modexpensetypes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("text"))})))));
 BA.debugLineNum = 69;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
Debug.ShouldStop(16);
_dbsql.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(modexpensetypes._banano.runMethod(false,"CallInlinePHPWait",(Object)(_dbsql.getField(true,"_methodname" /*RemoteObject*/ )),(Object)(_dbsql.runClassMethod (b4j.example.bananomysql.class, "_build" /*RemoteObject*/ )))));
 BA.debugLineNum = 70;BA.debugLine="dbsql.FromJSON";
Debug.ShouldStop(32);
_dbsql.runClassMethod (b4j.example.bananomysql.class, "_fromjson" /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="If dbsql.OK Then";
Debug.ShouldStop(64);
if (_dbsql.getField(true,"_ok" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="expenseType.SetDataSource(dbsql.result)";
Debug.ShouldStop(128);
modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_setdatasource" /*RemoteObject*/ ,(Object)(_dbsql.getField(false,"_result" /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="expenseType.refresh";
Debug.ShouldStop(256);
modexpensetypes._expensetype.runClassMethod (b4j.example.vmgijgotable.class, "_refresh" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 75;BA.debugLine="Log(\"modExpenseTypes.Refresh: Error - \" & dbsql.";
Debug.ShouldStop(1024);
modexpensetypes.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("modExpenseTypes.Refresh: Error - "),_dbsql.getField(true,"_error" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 77;BA.debugLine="vm.pageresume";
Debug.ShouldStop(4096);
modexpensetypes._vm.runClassMethod (b4j.example.bananovm.class, "_pageresume" /*RemoteObject*/ );
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}