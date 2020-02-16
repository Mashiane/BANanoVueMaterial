package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class modexpensetypes extends Object{
public static modexpensetypes mostCurrent = new modexpensetypes();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.modexpensetypes", null);
		ba.loadHtSubs(modexpensetypes.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modexpensetypes", ba);
		}
	}
    public static Class<?> getObject() {
		return modexpensetypes.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static b4j.example.vmgijgotable _expensetype = null;
public static String _mode = "";
public static b4j.example.vmdialog _mdlexpensetype = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static String  _add() throws Exception{
RDebugUtils.currentModule="modexpensetypes";
if (Debug.shouldDelegate(ba, "add", false))
	 {return ((String) Debug.delegate(ba, "add", null));}
RDebugUtils.currentLine=273809408;
 //BA.debugLineNum = 273809408;BA.debugLine="Sub Add";
RDebugUtils.currentLine=273809409;
 //BA.debugLineNum = 273809409;BA.debugLine="Mode = \"A\"";
_mode = "A";
RDebugUtils.currentLine=273809410;
 //BA.debugLineNum = 273809410;BA.debugLine="mdlExpenseType.Container.SetDefaults";
_mdlexpensetype._container /*b4j.example.vmcontainer*/ ._setdefaults /*String*/ (null);
RDebugUtils.currentLine=273809411;
 //BA.debugLineNum = 273809411;BA.debugLine="mdlExpenseType.SetTitle(\"New Expense Type\")";
_mdlexpensetype._settitle /*b4j.example.vmdialog*/ (null,"New Expense Type");
RDebugUtils.currentLine=273809412;
 //BA.debugLineNum = 273809412;BA.debugLine="vm.ShowDialog(\"mdlExpenseType\")";
_vm._showdialog /*String*/ (null,"mdlExpenseType");
RDebugUtils.currentLine=273809413;
 //BA.debugLineNum = 273809413;BA.debugLine="End Sub";
return "";
}
public static String  _refresh() throws Exception{
RDebugUtils.currentModule="modexpensetypes";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
b4j.example.bananomysql _dbsql = null;
RDebugUtils.currentLine=269746176;
 //BA.debugLineNum = 269746176;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=269746177;
 //BA.debugLineNum = 269746177;BA.debugLine="vm.pagepause";
_vm._pagepause /*String*/ (null);
RDebugUtils.currentLine=269746178;
 //BA.debugLineNum = 269746178;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=269746179;
 //BA.debugLineNum = 269746179;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensetypes\", \"id\"";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expensetypes","id");
RDebugUtils.currentLine=269746180;
 //BA.debugLineNum = 269746180;BA.debugLine="dbsql.SelectAll(Array(\"*\"), Array(\"text\"))";
_dbsql._selectall /*b4j.example.bananomysql*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("text")}));
RDebugUtils.currentLine=269746181;
 //BA.debugLineNum = 269746181;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.metho";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=269746182;
 //BA.debugLineNum = 269746182;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=269746183;
 //BA.debugLineNum = 269746183;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=269746184;
 //BA.debugLineNum = 269746184;BA.debugLine="expenseType.SetDataSource(dbsql.result)";
_expensetype._setdatasource /*b4j.example.vmgijgotable*/ (null,_dbsql._result /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=269746185;
 //BA.debugLineNum = 269746185;BA.debugLine="expenseType.refresh";
_expensetype._refresh /*b4j.example.vmgijgotable*/ (null);
 }else {
RDebugUtils.currentLine=269746187;
 //BA.debugLineNum = 269746187;BA.debugLine="Log(\"modExpenseTypes.Refresh: Error - \" & dbsql.";
anywheresoftware.b4a.keywords.Common.Log("modExpenseTypes.Refresh: Error - "+_dbsql._error /*String*/ );
 };
RDebugUtils.currentLine=269746189;
 //BA.debugLineNum = 269746189;BA.debugLine="vm.pageresume";
_vm._pageresume /*String*/ (null);
RDebugUtils.currentLine=269746190;
 //BA.debugLineNum = 269746190;BA.debugLine="End Sub";
return "";
}
public static String  _btncancelexpensetype_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpensetypes";
if (Debug.shouldDelegate(ba, "btncancelexpensetype_click", false))
	 {return ((String) Debug.delegate(ba, "btncancelexpensetype_click", new Object[] {_e}));}
RDebugUtils.currentLine=272498688;
 //BA.debugLineNum = 272498688;BA.debugLine="Sub btnCancelExpenseType_click(e As BANanoEvent)";
RDebugUtils.currentLine=272498689;
 //BA.debugLineNum = 272498689;BA.debugLine="vm.HideDialog(\"mdlExpenseType\")";
_vm._hidedialog /*String*/ (null,"mdlExpenseType");
RDebugUtils.currentLine=272498690;
 //BA.debugLineNum = 272498690;BA.debugLine="End Sub";
return "";
}
public static String  _btnsaveexpensetype_click(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpensetypes";
if (Debug.shouldDelegate(ba, "btnsaveexpensetype_click", false))
	 {return ((String) Debug.delegate(ba, "btnsaveexpensetype_click", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _rec = null;
boolean _bvalid = false;
b4j.example.bananomysql _dbsql = null;
String _sid = "";
RDebugUtils.currentLine=272891904;
 //BA.debugLineNum = 272891904;BA.debugLine="Sub btnSaveExpenseType_click(e As BANanoEvent)";
RDebugUtils.currentLine=272891906;
 //BA.debugLineNum = 272891906;BA.debugLine="Dim rec As Map = mdlExpenseType.Container.GetData";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = _mdlexpensetype._container /*b4j.example.vmcontainer*/ ._getdata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=272891908;
 //BA.debugLineNum = 272891908;BA.debugLine="Dim bValid As Boolean = vm.validate(rec, mdlExpen";
_bvalid = _vm._validate /*boolean*/ (null,_rec,_mdlexpensetype._container /*b4j.example.vmcontainer*/ ._required /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=272891909;
 //BA.debugLineNum = 272891909;BA.debugLine="If bValid = False Then Return";
if (_bvalid==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=272891911;
 //BA.debugLineNum = 272891911;BA.debugLine="Dim dbsql As BANanoMySQL";
_dbsql = new b4j.example.bananomysql();
RDebugUtils.currentLine=272891912;
 //BA.debugLineNum = 272891912;BA.debugLine="dbsql.Initialize(Main.dbase, \"expensetypes\", \"id\"";
_dbsql._initialize /*b4j.example.bananomysql*/ (null,ba,_main._dbase /*String*/ ,"expensetypes","id");
RDebugUtils.currentLine=272891913;
 //BA.debugLineNum = 272891913;BA.debugLine="dbsql.SchemaFromDesign(mdlExpenseType.Container)";
_dbsql._schemafromdesign /*String*/ (null,_mdlexpensetype._container /*b4j.example.vmcontainer*/ );
RDebugUtils.currentLine=272891914;
 //BA.debugLineNum = 272891914;BA.debugLine="Select Case Mode";
switch (BA.switchObjectToInt(_mode,"A","E")) {
case 0: {
RDebugUtils.currentLine=272891916;
 //BA.debugLineNum = 272891916;BA.debugLine="dbsql.RecordFromMap(rec)";
_dbsql._recordfrommap /*String*/ (null,_rec);
RDebugUtils.currentLine=272891917;
 //BA.debugLineNum = 272891917;BA.debugLine="dbsql.Insert";
_dbsql._insert /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=272891918;
 //BA.debugLineNum = 272891918;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.met";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=272891919;
 //BA.debugLineNum = 272891919;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=272891920;
 //BA.debugLineNum = 272891920;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=272891921;
 //BA.debugLineNum = 272891921;BA.debugLine="vm.ShowSnackBar(\"Expense Type added successful";
_vm._showsnackbar /*String*/ (null,"Expense Type added successfully!");
RDebugUtils.currentLine=272891922;
 //BA.debugLineNum = 272891922;BA.debugLine="vm.HideDialog(\"mdlExpenseType\")";
_vm._hidedialog /*String*/ (null,"mdlExpenseType");
RDebugUtils.currentLine=272891923;
 //BA.debugLineNum = 272891923;BA.debugLine="Refresh";
_refresh();
 }else {
RDebugUtils.currentLine=272891925;
 //BA.debugLineNum = 272891925;BA.debugLine="Log(\"modExpenseTypes.btnSaveExpenseType_click:";
anywheresoftware.b4a.keywords.Common.Log("modExpenseTypes.btnSaveExpenseType_click: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=272891926;
 //BA.debugLineNum = 272891926;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
 break; }
case 1: {
RDebugUtils.currentLine=272891929;
 //BA.debugLineNum = 272891929;BA.debugLine="Dim sid As String = rec.Get(\"id\")";
_sid = BA.ObjectToString(_rec.Get((Object)("id")));
RDebugUtils.currentLine=272891930;
 //BA.debugLineNum = 272891930;BA.debugLine="dbsql.RecordFromMap(rec)";
_dbsql._recordfrommap /*String*/ (null,_rec);
RDebugUtils.currentLine=272891931;
 //BA.debugLineNum = 272891931;BA.debugLine="dbsql.Update(sid)";
_dbsql._update /*b4j.example.bananomysql*/ (null,_sid);
RDebugUtils.currentLine=272891932;
 //BA.debugLineNum = 272891932;BA.debugLine="dbsql.json = BANano.CallInlinePHPWait(dbsql.met";
_dbsql._json /*String*/  = BA.ObjectToString(_banano.CallInlinePHPWait(_dbsql._methodname /*String*/ ,_dbsql._build /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=272891933;
 //BA.debugLineNum = 272891933;BA.debugLine="dbsql.FromJSON";
_dbsql._fromjson /*b4j.example.bananomysql*/ (null);
RDebugUtils.currentLine=272891934;
 //BA.debugLineNum = 272891934;BA.debugLine="If dbsql.OK Then";
if (_dbsql._ok /*boolean*/ ) { 
RDebugUtils.currentLine=272891935;
 //BA.debugLineNum = 272891935;BA.debugLine="vm.ShowSnackBar(\"Expense Type updated successf";
_vm._showsnackbar /*String*/ (null,"Expense Type updated successfully!");
RDebugUtils.currentLine=272891936;
 //BA.debugLineNum = 272891936;BA.debugLine="vm.HideDialog(\"mdlExpenseType\")";
_vm._hidedialog /*String*/ (null,"mdlExpenseType");
RDebugUtils.currentLine=272891937;
 //BA.debugLineNum = 272891937;BA.debugLine="Refresh";
_refresh();
 }else {
RDebugUtils.currentLine=272891939;
 //BA.debugLineNum = 272891939;BA.debugLine="Log(\"modExpenseTypes.btnSaveExpenseType_click:";
anywheresoftware.b4a.keywords.Common.Log("modExpenseTypes.btnSaveExpenseType_click: Error - "+_dbsql._error /*String*/ );
RDebugUtils.currentLine=272891940;
 //BA.debugLineNum = 272891940;BA.debugLine="vm.ShowSnackBar(dbsql.error)";
_vm._showsnackbar /*String*/ (null,_dbsql._error /*String*/ );
 };
 break; }
}
;
RDebugUtils.currentLine=272891943;
 //BA.debugLineNum = 272891943;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
RDebugUtils.currentModule="modexpensetypes";
if (Debug.shouldDelegate(ba, "code", false))
	 {return ((String) Debug.delegate(ba, "code", null));}
b4j.example.vmcontainer _cont = null;
b4j.example.vminputcontrol _etid = null;
b4j.example.vminputcontrol _ettext = null;
b4j.example.vminputcontrol _etdescription = null;
RDebugUtils.currentLine=269680640;
 //BA.debugLineNum = 269680640;BA.debugLine="Sub Code";
RDebugUtils.currentLine=269680641;
 //BA.debugLineNum = 269680641;BA.debugLine="Mode = \"\"";
_mode = "";
RDebugUtils.currentLine=269680642;
 //BA.debugLineNum = 269680642;BA.debugLine="Log(\"modExpenseTypes.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modExpenseTypes.Code");
RDebugUtils.currentLine=269680643;
 //BA.debugLineNum = 269680643;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
RDebugUtils.currentLine=269680645;
 //BA.debugLineNum = 269680645;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (null,_name,modexpensetypes.getObject());
RDebugUtils.currentLine=269680647;
 //BA.debugLineNum = 269680647;BA.debugLine="cont.Hide";
_cont._hide /*String*/ (null);
RDebugUtils.currentLine=269680649;
 //BA.debugLineNum = 269680649;BA.debugLine="cont.AddRows(1).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ (null,(int) (1))._addcolumns12 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=269680651;
 //BA.debugLineNum = 269680651;BA.debugLine="expenseType = vm.CreateGijgoTable(\"expensetype\",";
_expensetype = _vm._creategijgotable /*b4j.example.vmgijgotable*/ (null,"expensetype","id",modexpensetypes.getObject());
RDebugUtils.currentLine=269680652;
 //BA.debugLineNum = 269680652;BA.debugLine="expenseType.SetTitle(\"Expense Types\")";
_expensetype._settitle /*b4j.example.vmgijgotable*/ (null,"Expense Types");
RDebugUtils.currentLine=269680653;
 //BA.debugLineNum = 269680653;BA.debugLine="expenseType.AddColumn(\"text\",\"Name\")   ' 20";
_expensetype._addcolumn /*b4j.example.vmgijgotable*/ (null,"text","Name");
RDebugUtils.currentLine=269680654;
 //BA.debugLineNum = 269680654;BA.debugLine="expenseType.AddColumn(\"description\",\"Description\"";
_expensetype._addcolumn /*b4j.example.vmgijgotable*/ (null,"description","Description");
RDebugUtils.currentLine=269680655;
 //BA.debugLineNum = 269680655;BA.debugLine="expenseType.AddEditTrash";
_expensetype._addedittrash /*String*/ (null);
RDebugUtils.currentLine=269680656;
 //BA.debugLineNum = 269680656;BA.debugLine="expenseType.autoLoad = True";
_expensetype._autoload /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=269680657;
 //BA.debugLineNum = 269680657;BA.debugLine="expenseType.SetDataSource(Array())";
_expensetype._setdatasource /*b4j.example.vmgijgotable*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
RDebugUtils.currentLine=269680658;
 //BA.debugLineNum = 269680658;BA.debugLine="cont.AddComponent(1,1, expenseType.tostring)";
_cont._addcomponent /*String*/ (null,(int) (1),(int) (1),_expensetype._tostring /*String*/ (null));
RDebugUtils.currentLine=269680660;
 //BA.debugLineNum = 269680660;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (null,_cont);
RDebugUtils.currentLine=269680663;
 //BA.debugLineNum = 269680663;BA.debugLine="mdlExpenseType = vm.CreateDialog(\"mdlExpenseType\"";
_mdlexpensetype = _vm._createdialog /*b4j.example.vmdialog*/ (null,"mdlExpenseType",modexpensetypes.getObject());
RDebugUtils.currentLine=269680664;
 //BA.debugLineNum = 269680664;BA.debugLine="mdlExpenseType.settitle(\"New Expense Type\")";
_mdlexpensetype._settitle /*b4j.example.vmdialog*/ (null,"New Expense Type");
RDebugUtils.currentLine=269680665;
 //BA.debugLineNum = 269680665;BA.debugLine="mdlExpenseType.AddCancel(\"btnCancelExpenseType\",";
_mdlexpensetype._addcancel /*b4j.example.vmdialog*/ (null,"btnCancelExpenseType","Cancel");
RDebugUtils.currentLine=269680666;
 //BA.debugLineNum = 269680666;BA.debugLine="mdlExpenseType.AddOK(\"btnSaveExpenseType\", \"Save\"";
_mdlexpensetype._addok /*b4j.example.vmdialog*/ (null,"btnSaveExpenseType","Save");
RDebugUtils.currentLine=269680668;
 //BA.debugLineNum = 269680668;BA.debugLine="Dim etID As VMInputControl = mdlExpenseType.Conta";
_etid = _mdlexpensetype._container /*b4j.example.vmcontainer*/ ._newtext /*b4j.example.vminputcontrol*/ (null,"id","#","",anywheresoftware.b4a.keywords.Common.False,"",(int) (0),"","",(int) (0));
RDebugUtils.currentLine=269680669;
 //BA.debugLineNum = 269680669;BA.debugLine="etID.SetVisible(False).SetInt";
_etid._setvisible /*b4j.example.vminputcontrol*/ (null,anywheresoftware.b4a.keywords.Common.False)._setint /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=269680670;
 //BA.debugLineNum = 269680670;BA.debugLine="Dim etText As VMInputControl = mdlExpenseType.Con";
_ettext = _mdlexpensetype._container /*b4j.example.vmcontainer*/ ._newtext /*b4j.example.vminputcontrol*/ (null,"text","Name","",anywheresoftware.b4a.keywords.Common.True,"",(int) (20),"","The expense type is required!",(int) (0));
RDebugUtils.currentLine=269680671;
 //BA.debugLineNum = 269680671;BA.debugLine="Dim etDescription As VMInputControl = mdlExpenseT";
_etdescription = _mdlexpensetype._container /*b4j.example.vmcontainer*/ ._newtextarea /*b4j.example.vminputcontrol*/ (null,"description","Description","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,"",(int) (100),"","",(int) (0));
RDebugUtils.currentLine=269680674;
 //BA.debugLineNum = 269680674;BA.debugLine="mdlExpenseType.Container.AddControlS(etID, 1, 1,";
_mdlexpensetype._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (null,_etid,BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=269680675;
 //BA.debugLineNum = 269680675;BA.debugLine="mdlExpenseType.Container.AddControlS(etText, 2, 1";
_mdlexpensetype._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (null,_ettext,BA.NumberToString(2),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=269680676;
 //BA.debugLineNum = 269680676;BA.debugLine="mdlExpenseType.Container.AddControlS(etDescriptio";
_mdlexpensetype._container /*b4j.example.vmcontainer*/ ._addcontrols /*String*/ (null,_etdescription,BA.NumberToString(3),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
RDebugUtils.currentLine=269680678;
 //BA.debugLineNum = 269680678;BA.debugLine="mdlExpenseType.SetClickOutsideToClose(False)";
_mdlexpensetype._setclickoutsidetoclose /*b4j.example.vmdialog*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=269680679;
 //BA.debugLineNum = 269680679;BA.debugLine="mdlExpenseType.SetCloseOnEsc(False)";
_mdlexpensetype._setcloseonesc /*b4j.example.vmdialog*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=269680680;
 //BA.debugLineNum = 269680680;BA.debugLine="mdlExpenseType.SetWidth(\"500px\")";
_mdlexpensetype._setwidth /*b4j.example.vmdialog*/ (null,"500px");
RDebugUtils.currentLine=269680681;
 //BA.debugLineNum = 269680681;BA.debugLine="vm.AddDialog(mdlExpenseType)";
_vm._adddialog /*String*/ (null,_mdlexpensetype);
RDebugUtils.currentLine=269680682;
 //BA.debugLineNum = 269680682;BA.debugLine="End Sub";
return "";
}
public static String  _expensetype_delete(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpensetypes";
if (Debug.shouldDelegate(ba, "expensetype_delete", false))
	 {return ((String) Debug.delegate(ba, "expensetype_delete", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _sid = "";
String _stext = "";
RDebugUtils.currentLine=276758528;
 //BA.debugLineNum = 276758528;BA.debugLine="Sub expensetype_delete(e As BANanoEvent)";
RDebugUtils.currentLine=276758530;
 //BA.debugLineNum = 276758530;BA.debugLine="Dim rec As Map = expenseType.GetRecordFromEvent(e";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = _expensetype._getrecordfromevent /*anywheresoftware.b4a.objects.collections.Map*/ (null,_e);
RDebugUtils.currentLine=276758531;
 //BA.debugLineNum = 276758531;BA.debugLine="Dim sid As String = rec.GetDefault(\"id\",\"\")";
_sid = BA.ObjectToString(_rec.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=276758532;
 //BA.debugLineNum = 276758532;BA.debugLine="Dim stext As String = rec.getdefault(\"text\",\"\")";
_stext = BA.ObjectToString(_rec.GetDefault((Object)("text"),(Object)("")));
RDebugUtils.currentLine=276758533;
 //BA.debugLineNum = 276758533;BA.debugLine="If sid = \"\" Then Return";
if ((_sid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=276758535;
 //BA.debugLineNum = 276758535;BA.debugLine="vm.SetStateSingle(\"expensetypeid\", sid)";
_vm._setstatesingle /*b4j.example.bananovm*/ (null,(Object)("expensetypeid"),(Object)(_sid));
RDebugUtils.currentLine=276758537;
 //BA.debugLineNum = 276758537;BA.debugLine="vm.ShowConfirm(\"delete_expensetype\", $\"Confirm De";
_vm._showconfirm /*String*/ (null,"delete_expensetype",("Confirm Delete: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stext))+""),"Are you sure that you want to delete this expense type. You will not be able to undo your actions. Continue?","Ok","Cancel");
RDebugUtils.currentLine=276758539;
 //BA.debugLineNum = 276758539;BA.debugLine="End Sub";
return "";
}
public static String  _expensetype_edit(com.ab.banano.BANanoEvent _e) throws Exception{
RDebugUtils.currentModule="modexpensetypes";
if (Debug.shouldDelegate(ba, "expensetype_edit", false))
	 {return ((String) Debug.delegate(ba, "expensetype_edit", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _sid = "";
RDebugUtils.currentLine=276692992;
 //BA.debugLineNum = 276692992;BA.debugLine="Sub expensetype_edit(e As BANanoEvent)";
RDebugUtils.currentLine=276692994;
 //BA.debugLineNum = 276692994;BA.debugLine="Dim rec As Map = expenseType.GetRecordFromEvent(e";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = _expensetype._getrecordfromevent /*anywheresoftware.b4a.objects.collections.Map*/ (null,_e);
RDebugUtils.currentLine=276692995;
 //BA.debugLineNum = 276692995;BA.debugLine="Dim sid As String = rec.GetDefault(\"id\",\"\")";
_sid = BA.ObjectToString(_rec.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=276692996;
 //BA.debugLineNum = 276692996;BA.debugLine="If sid = \"\" Then Return";
if ((_sid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=276692998;
 //BA.debugLineNum = 276692998;BA.debugLine="Mode = \"E\"";
_mode = "E";
RDebugUtils.currentLine=276693000;
 //BA.debugLineNum = 276693000;BA.debugLine="mdlExpenseType.SetTitle(\"Edit Expense Type\")";
_mdlexpensetype._settitle /*b4j.example.vmdialog*/ (null,"Edit Expense Type");
RDebugUtils.currentLine=276693002;
 //BA.debugLineNum = 276693002;BA.debugLine="mdlExpenseType.Container.setdefaults";
_mdlexpensetype._container /*b4j.example.vmcontainer*/ ._setdefaults /*String*/ (null);
RDebugUtils.currentLine=276693004;
 //BA.debugLineNum = 276693004;BA.debugLine="vm.SetState(rec)";
_vm._setstate /*b4j.example.bananovm*/ (null,_rec);
RDebugUtils.currentLine=276693006;
 //BA.debugLineNum = 276693006;BA.debugLine="vm.showdialog(\"mdlExpenseType\")";
_vm._showdialog /*String*/ (null,"mdlExpenseType");
RDebugUtils.currentLine=276693007;
 //BA.debugLineNum = 276693007;BA.debugLine="End Sub";
return "";
}
}