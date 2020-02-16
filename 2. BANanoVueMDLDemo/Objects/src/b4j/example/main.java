package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 500, 500);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static String _appname = "";
public static String _dbase = "";
public static String _publish = "";
public static b4j.example.bananopostprocessor _bp = null;
public static String _serverip = "";
public static b4j.example.modfile _modfile = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.modgmap _modgmap = null;
public static b4j.example.modchartkick _modchartkick = null;
public static b4j.example.modavatar _modavatar = null;
public static b4j.example.modbadge _modbadge = null;
public static b4j.example.modbottombar _modbottombar = null;
public static b4j.example.modbuttons _modbuttons = null;
public static b4j.example.modcheckbox _modcheckbox = null;
public static b4j.example.modchips _modchips = null;
public static b4j.example.moddatepicker _moddatepicker = null;
public static b4j.example.moddialog _moddialog = null;
public static b4j.example.modemptystate _modemptystate = null;
public static b4j.example.modicon _modicon = null;
public static b4j.example.modlist _modlist = null;
public static b4j.example.modlistview _modlistview = null;
public static b4j.example.modmenu _modmenu = null;
public static b4j.example.modprogress _modprogress = null;
public static b4j.example.modradio _modradio = null;
public static b4j.example.modselect _modselect = null;
public static b4j.example.modskeleton _modskeleton = null;
public static b4j.example.modsnackbar _modsnackbar = null;
public static b4j.example.modspeeddial _modspeeddial = null;
public static b4j.example.modspinner _modspinner = null;
public static b4j.example.modsteppers _modsteppers = null;
public static b4j.example.modswitch _modswitch = null;
public static b4j.example.modtable _modtable = null;
public static b4j.example.modtabs _modtabs = null;
public static b4j.example.modtextarea _modtextarea = null;
public static b4j.example.modtextbox _modtextbox = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtypography _modtypography = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 58;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
long _version = 0L;
String _appfile = "";
 //BA.debugLineNum = 16;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 18;BA.debugLine="BP.Initialize";
_bp._initialize(ba);
 //BA.debugLineNum = 19;BA.debugLine="BP.RedirectOutput(File.DirApp,\"log.txt\")";
_bp._redirectoutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"log.txt");
 //BA.debugLineNum = 20;BA.debugLine="Publish = \"C:\\laragon\\www\"";
_publish = "C:\\laragon\\www";
 //BA.debugLineNum = 21;BA.debugLine="ServerIP = BP.FileReadString(File.DirAssets, \"hos";
_serverip = _bp._filereadstring(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"host.txt");
 //BA.debugLineNum = 22;BA.debugLine="Dbase = BP.FileReadString(File.DirAssets, \"dbase.";
_dbase = _bp._filereadstring(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"dbase.txt");
 //BA.debugLineNum = 24;BA.debugLine="Dim Version As Long = DateTime.now";
_version = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 25;BA.debugLine="Dim appFile As String = $\"app${Version}.js\"$";
_appfile = ("app"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version))+".js");
 //BA.debugLineNum = 28;BA.debugLine="BANano.Initialize(\"BANano\", AppName, Version)";
_banano.Initialize("BANano",_appname,_version);
 //BA.debugLineNum = 29;BA.debugLine="BANano.HTML_NAME = \"index.html\"";
_banano.HTML_NAME = "index.html";
 //BA.debugLineNum = 30;BA.debugLine="BANano.Header.Title = AppName";
_banano.Header.Title = _appname;
 //BA.debugLineNum = 31;BA.debugLine="BANano.JAVASCRIPT_NAME = appFile";
_banano.JAVASCRIPT_NAME = _appfile;
 //BA.debugLineNum = 32;BA.debugLine="BANano.TranspilerOptions.UseServiceWorker = False";
_banano.TranspilerOptions.setUseServiceWorker(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 33;BA.debugLine="BANano.transpileroptions.MergeAllCSSFiles = True";
_banano.TranspilerOptions.setMergeAllCSSFiles(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="BANano.transpileroptions.MergeAllJavascriptFiles";
_banano.TranspilerOptions.setMergeAllJavascriptFiles(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 38;BA.debugLine="BANano.PHP_NAME = $\"${AppName}.php\"$";
_banano.PHP_NAME = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+".php");
 //BA.debugLineNum = 39;BA.debugLine="BANano.PHPHost = $\"http://${ServerIP}/${AppName}/";
_banano.PHPHost = ("http://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_serverip))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+"/");
 //BA.debugLineNum = 40;BA.debugLine="BANano.PHPAddHeader(\"Access-Control-Allow-Origin:";
_banano.PHPAddHeader("Access-Control-Allow-Origin: *");
 //BA.debugLineNum = 42;BA.debugLine="BANano.Build(Publish)";
_banano.Build(_publish);
 //BA.debugLineNum = 43;BA.debugLine="BP.OpenLog(File.DirApp, \"log.txt\")";
_bp._openlog(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"log.txt");
 //BA.debugLineNum = 45;BA.debugLine="BP.PublishPath = Publish";
_bp._publishpath = _publish;
 //BA.debugLineNum = 46;BA.debugLine="BP.ShortName = AppName";
_bp._shortname = _appname;
 //BA.debugLineNum = 47;BA.debugLine="BP.AssetsPath = BANano.ASSETS_FOLDER";
_bp._assetspath = _banano.ASSETS_FOLDER;
 //BA.debugLineNum = 48;BA.debugLine="BP.ScriptsPath = BANano.SCRIPTS_FOLDER";
_bp._scriptspath = _banano.SCRIPTS_FOLDER;
 //BA.debugLineNum = 49;BA.debugLine="BP.StylesPath = BANano.STYLES_FOLDER";
_bp._stylespath = _banano.STYLES_FOLDER;
 //BA.debugLineNum = 50;BA.debugLine="BP.ScriptFile = BANano.JAVASCRIPT_NAME";
_bp._scriptfile = _banano.JAVASCRIPT_NAME;
 //BA.debugLineNum = 51;BA.debugLine="BP.UnzipFonts";
_bp._unzipfonts();
 //BA.debugLineNum = 52;BA.debugLine="BP.Open(True)";
_bp._open(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 53;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public static String  _banano_ready() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub BANano_Ready";
 //BA.debugLineNum = 62;BA.debugLine="pgIndex.Init";
_pgindex._init /*String*/ ();
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
modfile._process_globals();
pgindex._process_globals();
modgmap._process_globals();
modchartkick._process_globals();
modavatar._process_globals();
modbadge._process_globals();
modbottombar._process_globals();
modbuttons._process_globals();
modcheckbox._process_globals();
modchips._process_globals();
moddatepicker._process_globals();
moddialog._process_globals();
modemptystate._process_globals();
modicon._process_globals();
modlist._process_globals();
modlistview._process_globals();
modmenu._process_globals();
modprogress._process_globals();
modradio._process_globals();
modselect._process_globals();
modskeleton._process_globals();
modsnackbar._process_globals();
modspeeddial._process_globals();
modspinner._process_globals();
modsteppers._process_globals();
modswitch._process_globals();
modtable._process_globals();
modtabs._process_globals();
modtextarea._process_globals();
modtextbox._process_globals();
modtimepicker._process_globals();
modtoolbar._process_globals();
modtypography._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Public BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 9;BA.debugLine="Public AppName As String = \"bvmdemo\"";
_appname = "bvmdemo";
 //BA.debugLineNum = 10;BA.debugLine="Public Dbase As String";
_dbase = "";
 //BA.debugLineNum = 11;BA.debugLine="Private Publish As String";
_publish = "";
 //BA.debugLineNum = 12;BA.debugLine="Private BP As BANanoPostProcessor";
_bp = new b4j.example.bananopostprocessor();
 //BA.debugLineNum = 13;BA.debugLine="Public ServerIP As String";
_serverip = "";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
}
