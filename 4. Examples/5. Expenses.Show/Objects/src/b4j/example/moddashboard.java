package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class moddashboard extends Object{
public static moddashboard mostCurrent = new moddashboard();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.moddashboard", null);
		ba.loadHtSubs(moddashboard.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.moddashboard", ba);
		}
	}
    public static Class<?> getObject() {
		return moddashboard.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static b4j.example.vmcontainer _expcont = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static b4j.example.vmcontainer  _addbudgetcurrentmonth() throws Exception{
RDebugUtils.currentModule="moddashboard";
if (Debug.shouldDelegate(ba, "addbudgetcurrentmonth", false))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addbudgetcurrentmonth", null));}
b4j.example.vmcontainer _bcont = null;
b4j.example.vminputcontrol _lblx = null;
RDebugUtils.currentLine=268828672;
 //BA.debugLineNum = 268828672;BA.debugLine="Sub AddBudgetCurrentMonth As VMContainer";
RDebugUtils.currentLine=268828673;
 //BA.debugLineNum = 268828673;BA.debugLine="Dim bcont As VMContainer = vm.CreateContainer(\"bu";
_bcont = _vm._createcontainer /*b4j.example.vmcontainer*/ (null,"budgetcurrmonthcont",moddashboard.getObject());
RDebugUtils.currentLine=268828674;
 //BA.debugLineNum = 268828674;BA.debugLine="bcont.SetElevation(2)";
_bcont._setelevation /*b4j.example.vmcontainer*/ (null,(int) (2));
RDebugUtils.currentLine=268828675;
 //BA.debugLineNum = 268828675;BA.debugLine="bcont.SetPaddingAll(\"20px\")";
_bcont._setpaddingall /*b4j.example.vmcontainer*/ (null,(Object)("20px"));
RDebugUtils.currentLine=268828677;
 //BA.debugLineNum = 268828677;BA.debugLine="Dim lblx As VMInputControl = expcont.NewH1(\"lblx\"";
_lblx = _expcont._newh1 /*b4j.example.vminputcontrol*/ (null,"lblx","Budget (Current Month)");
RDebugUtils.currentLine=268828678;
 //BA.debugLineNum = 268828678;BA.debugLine="bcont.AddControl(lblx, 1, 1, 0, 0, 0, 0, 12, 12,";
_bcont._addcontrol /*String*/ (null,_lblx,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=268828682;
 //BA.debugLineNum = 268828682;BA.debugLine="Return bcont";
if (true) return _bcont;
RDebugUtils.currentLine=268828683;
 //BA.debugLineNum = 268828683;BA.debugLine="End Sub";
return null;
}
public static b4j.example.vmcontainer  _addexpense() throws Exception{
RDebugUtils.currentModule="moddashboard";
if (Debug.shouldDelegate(ba, "addexpense", false))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addexpense", null));}
b4j.example.vminputcontrol _expense_label = null;
b4j.example.vminputcontrol _expense_id = null;
b4j.example.vminputcontrol _expense_date = null;
b4j.example.vminputcontrol _expense_category = null;
b4j.example.vminputcontrol _expense_type = null;
b4j.example.vminputcontrol _expense_amount = null;
b4j.example.vminputcontrol _expense_description = null;
b4j.example.vminputcontrol _labelx = null;
b4j.example.vminputcontrol _btnsubmitexpense = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub AddExpense As VMContainer";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="expcont = vm.CreateContainer(\"expcont\", Me)";
_expcont = _vm._createcontainer /*b4j.example.vmcontainer*/ (null,"expcont",moddashboard.getObject());
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="expcont.SetElevation(2)";
_expcont._setelevation /*b4j.example.vmcontainer*/ (null,(int) (2));
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="expcont.SetPaddingAll(\"20px\")";
_expcont._setpaddingall /*b4j.example.vmcontainer*/ (null,(Object)("20px"));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim expense_label As VMInputControl = expcont.New";
_expense_label = _expcont._newh1 /*b4j.example.vminputcontrol*/ (null,"expense_label","Add Expense");
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="expcont.AddControl(expense_label, 1, 1, 0, 0, 0,";
_expcont._addcontrol /*String*/ (null,_expense_label,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Dim expense_id As VMInputControl = expcont.NewTex";
_expense_id = _expcont._newtext /*b4j.example.vminputcontrol*/ (null,"id","#","",anywheresoftware.b4a.keywords.Common.False,"",(int) (0),"","",(int) (0));
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="expense_id.SetVisible(False).SetInt";
_expense_id._setvisible /*b4j.example.vminputcontrol*/ (null,anywheresoftware.b4a.keywords.Common.False)._setint /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="expcont.AddControl(expense_id, 1, 1, 0, 0, 0, 0,";
_expcont._addcontrol /*String*/ (null,_expense_id,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Dim expense_date As VMInputControl = expcont.NewD";
_expense_date = _expcont._newdatepicker /*b4j.example.vminputcontrol*/ (null,"expense_date","Date",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True,"",(int) (0));
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="expcont.AddControl(expense_date, 2, 1, 0, 0, 0, 0";
_expcont._addcontrol /*String*/ (null,_expense_date,BA.NumberToString(2),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="Dim expense_category As VMInputControl = expcont.";
_expense_category = _expcont._newselect /*b4j.example.vminputcontrol*/ (null,"expense_category","Category",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,"","categories","id","text","","The category should be specified!",(int) (0));
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="expense_category.setint";
_expense_category._setint /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="expcont.AddControl(expense_category, 2, 2, 0, 0,";
_expcont._addcontrol /*String*/ (null,_expense_category,BA.NumberToString(2),BA.NumberToString(2),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="Dim expense_type As VMInputControl = expcont.NewS";
_expense_type = _expcont._newselect /*b4j.example.vminputcontrol*/ (null,"expense_type","Type",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,"","types","id","text","","The type should be specified!",(int) (0));
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="expense_type.setint";
_expense_type._setint /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="expcont.AddControl(expense_type, 3, 1, 0, 0, 0, 0";
_expcont._addcontrol /*String*/ (null,_expense_type,BA.NumberToString(3),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="Dim expense_amount As VMInputControl = expcont.Ne";
_expense_amount = _expcont._newtel /*b4j.example.vminputcontrol*/ (null,"expense_amount","Amount","",anywheresoftware.b4a.keywords.Common.True,"","","The amount should be specified!",(int) (0));
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="expense_amount.setdouble";
_expense_amount._setdouble /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="expcont.AddControl(expense_amount, 3, 2, 0, 0, 0,";
_expcont._addcontrol /*String*/ (null,_expense_amount,BA.NumberToString(3),BA.NumberToString(2),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="Dim expense_description As VMInputControl = expco";
_expense_description = _expcont._newtextarea /*b4j.example.vminputcontrol*/ (null,"expense_description","Description","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,"",(int) (100),"","",(int) (0));
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="expcont.AddControl(expense_description, 4, 1, 0,";
_expcont._addcontrol /*String*/ (null,_expense_description,BA.NumberToString(4),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="Dim labelx As VMInputControl = expcont.NewP(\"labe";
_labelx = _expcont._newp /*b4j.example.vminputcontrol*/ (null,"labelx","Labelx")._setvisible /*b4j.example.vminputcontrol*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="expcont.AddControl(labelx, 5, 1, 0, 0, 0, 0, 12,";
_expcont._addcontrol /*String*/ (null,_labelx,BA.NumberToString(5),BA.NumberToString(1),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="Dim btnSubmitExpense As VMInputControl = expcont.";
_btnsubmitexpense = _expcont._newbutton /*b4j.example.vminputcontrol*/ (null,"btnSubmitExpense","Submit","",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="expcont.AddControl(btnSubmitExpense, 5, 2, 0, 0,";
_expcont._addcontrol /*String*/ (null,_btnsubmitexpense,BA.NumberToString(5),BA.NumberToString(2),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(12),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="expcont.AddExclusion(Array(\"expense_label\",\"label";
_expcont._addexclusion /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("expense_label"),(Object)("labelx")}));
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="Return expcont";
if (true) return _expcont;
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="End Sub";
return null;
}
public static String  _btnsubmitexpense_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="moddashboard";
if (Debug.shouldDelegate(ba, "btnsubmitexpense_click", false))
	 {return ((String) Debug.delegate(ba, "btnsubmitexpense_click", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _expense = null;
boolean _bvalid = false;
b4j.example.bananomysql _dbsql = null;
RDebugUtils.currentLine=267780096;
 //BA.debugLineNum = 267780096;BA.debugLine="Sub btnSubmitExpense_click(e As BANanoEvent)";
RDebugUtils.currentLine=267780098;
 //BA.debugLineNum = 267780098;BA.debugLine="Dim expense As Map = expcont.GetData";
_expense = new anywheresoftware.b4a.objects.collections.Map();
_expense = _expcont._getdata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=267780100;
 //BA.debugLineNum = 267780100;BA.debugLine="Dim bValid As Boolean = vm.Validate(expense, expc";
_bvalid = _vm._validate /*boolean*/ (null,_expense,_expcont._required /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=267780101;
 //BA.debugLineNum = 267780101;BA.debugLine="If bValid = False Then Return";
if (_bvalid==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=267780104;
 //BA.debugLineNum = 267780104;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=267780105;
 //BA.debugLineNum = 267780105;BA.debugLine="dbsql.Initialize(Main.dbase, \"expenses\", \"id\")";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expenses","id");
RDebugUtils.currentLine=267780106;
 //BA.debugLineNum = 267780106;BA.debugLine="dbsql.SchemaFromDesign(expcont)";
_dbsql._schemafromdesign /*String*/ (null,_expcont);
RDebugUtils.currentLine=267780107;
 //BA.debugLineNum = 267780107;BA.debugLine="dbsql.RecordFromMap(expense)";
_dbsql._recordfrommap /*String*/ (null,_expense);
RDebugUtils.currentLine=267780108;
 //BA.debugLineNum = 267780108;BA.debugLine="dbsql.Insert";
_dbsql._insert /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=267780109;
 //BA.debugLineNum = 267780109;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=267780110;
 //BA.debugLineNum = 267780110;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=267780111;
 //BA.debugLineNum = 267780111;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=267780112;
 //BA.debugLineNum = 267780112;BA.debugLine="expcont.setdefaults";
_expcont._setdefaults /*String*/ (null);
RDebugUtils.currentLine=267780113;
 //BA.debugLineNum = 267780113;BA.debugLine="vm.ShowSnackBar(\"Expense added successfully!\")";
_vm._showsnackbar /*String*/ (null,"Expense added successfully!");
 }else {
RDebugUtils.currentLine=267780115;
 //BA.debugLineNum = 267780115;BA.debugLine="Log(\"modDashboard.btnSubmitExpense_click: Error";
anywheresoftware.b4a.keywords.Common.Log("modDashboard.btnSubmitExpense_click: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=267780116;
 //BA.debugLineNum = 267780116;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
RDebugUtils.currentLine=267780118;
 //BA.debugLineNum = 267780118;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
RDebugUtils.currentModule="moddashboard";
if (Debug.shouldDelegate(ba, "code", false))
	 {return ((String) Debug.delegate(ba, "code", null));}
b4j.example.vmcontainer _cont = null;
b4j.example.vmcontainer _ec = null;
b4j.example.vmcontainer _bcm = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Code";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Log(\"modDashboard.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modDashboard.Code");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (null,_name,moddashboard.getObject());
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="cont.Hide";
_cont._hide /*String*/ (null);
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="cont.AddRows(1).AddColumns2x6";
_cont._addrows /*b4j.example.vmgrid*/ (null,(int) (1))._addcolumns2x6 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Dim ec As VMContainer = AddExpense";
_ec = _addexpense();
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Dim bcm As VMContainer = AddBudgetCurrentMonth";
_bcm = _addbudgetcurrentmonth();
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="cont.AddComponent(1, 1, ec.tostring)";
_cont._addcomponent /*String*/ (null,(int) (1),(int) (1),_ec._tostring /*String*/ (null));
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="cont.AddComponent(1,2, bcm.tostring)";
_cont._addcomponent /*String*/ (null,(int) (1),(int) (2),_bcm._tostring /*String*/ (null));
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (null,_cont);
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="End Sub";
return "";
}
}