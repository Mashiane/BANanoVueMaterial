package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,57);
if (RapidSub.canDelegate("application_error")) { return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 57;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,16);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _version = RemoteObject.createImmutable(0L);
RemoteObject _appfile = RemoteObject.createImmutable("");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 16;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="BP.Initialize";
Debug.ShouldStop(131072);
main._bp.runVoidMethod ("_initialize",main.ba);
 BA.debugLineNum = 19;BA.debugLine="BP.RedirectOutput(File.DirApp,\"log.txt\")";
Debug.ShouldStop(262144);
main._bp.runVoidMethod ("_redirectoutput",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("log.txt")));
 BA.debugLineNum = 20;BA.debugLine="Publish = \"C:\\laragon\\www\"";
Debug.ShouldStop(524288);
main._publish = BA.ObjectToString("C:\\laragon\\www");
 BA.debugLineNum = 21;BA.debugLine="ServerIP = \"127.0.0.1\"";
Debug.ShouldStop(1048576);
main._serverip = BA.ObjectToString("127.0.0.1");
 BA.debugLineNum = 22;BA.debugLine="Dbase = \"expensesshow\"";
Debug.ShouldStop(2097152);
main._dbase = BA.ObjectToString("expensesshow");
 BA.debugLineNum = 24;BA.debugLine="Dim Version As Long = DateTime.now";
Debug.ShouldStop(8388608);
_version = main.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("Version", _version);Debug.locals.put("Version", _version);
 BA.debugLineNum = 25;BA.debugLine="Dim appFile As String = $\"app${Version}.js\"$";
Debug.ShouldStop(16777216);
_appfile = (RemoteObject.concat(RemoteObject.createImmutable("app"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_version))),RemoteObject.createImmutable(".js")));Debug.locals.put("appFile", _appfile);Debug.locals.put("appFile", _appfile);
 BA.debugLineNum = 28;BA.debugLine="BANano.Initialize(\"BANano\", AppName, Version)";
Debug.ShouldStop(134217728);
main._banano.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("BANano")),(Object)(main._appname),(Object)(_version));
 BA.debugLineNum = 29;BA.debugLine="BANano.HTML_NAME = \"index.html\"";
Debug.ShouldStop(268435456);
main._banano.setField ("HTML_NAME",BA.ObjectToString("index.html"));
 BA.debugLineNum = 30;BA.debugLine="BANano.Header.Title = AppName";
Debug.ShouldStop(536870912);
main._banano.getField(false,"Header").setField ("Title",main._appname);
 BA.debugLineNum = 31;BA.debugLine="BANano.JAVASCRIPT_NAME = appFile";
Debug.ShouldStop(1073741824);
main._banano.setField ("JAVASCRIPT_NAME",_appfile);
 BA.debugLineNum = 32;BA.debugLine="BANano.TranspilerOptions.UseServiceWorker = False";
Debug.ShouldStop(-2147483648);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setUseServiceWorker",main.__c.getField(true,"False"));
 BA.debugLineNum = 33;BA.debugLine="BANano.transpileroptions.MergeAllCSSFiles = True";
Debug.ShouldStop(1);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setMergeAllCSSFiles",main.__c.getField(true,"True"));
 BA.debugLineNum = 34;BA.debugLine="BANano.transpileroptions.MergeAllJavascriptFiles";
Debug.ShouldStop(2);
main._banano.getField(false,"TranspilerOptions").runVoidMethod ("setMergeAllJavascriptFiles",main.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="BANano.PHP_NAME = $\"${AppName}.php\"$";
Debug.ShouldStop(32);
main._banano.setField ("PHP_NAME",(RemoteObject.concat(RemoteObject.createImmutable(""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._appname))),RemoteObject.createImmutable(".php"))));
 BA.debugLineNum = 39;BA.debugLine="BANano.PHPHost = $\"http://${ServerIP}/${AppName}/";
Debug.ShouldStop(64);
main._banano.setField ("PHPHost",(RemoteObject.concat(RemoteObject.createImmutable("http://"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._serverip))),RemoteObject.createImmutable("/"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._appname))),RemoteObject.createImmutable("/"))));
 BA.debugLineNum = 40;BA.debugLine="BANano.PHPAddHeader(\"Access-Control-Allow-Origin:";
Debug.ShouldStop(128);
main._banano.runVoidMethod ("PHPAddHeader",(Object)(RemoteObject.createImmutable("Access-Control-Allow-Origin: *")));
 BA.debugLineNum = 42;BA.debugLine="BANano.Build(Publish)";
Debug.ShouldStop(512);
main._banano.runVoidMethod ("Build",(Object)(main._publish));
 BA.debugLineNum = 43;BA.debugLine="BP.OpenLog(File.DirApp, \"log.txt\")";
Debug.ShouldStop(1024);
main._bp.runVoidMethod ("_openlog",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("log.txt")));
 BA.debugLineNum = 45;BA.debugLine="BP.PublishPath = Publish";
Debug.ShouldStop(4096);
main._bp.setField ("_publishpath",main._publish);
 BA.debugLineNum = 46;BA.debugLine="BP.ShortName = AppName";
Debug.ShouldStop(8192);
main._bp.setField ("_shortname",main._appname);
 BA.debugLineNum = 47;BA.debugLine="BP.AssetsPath = BANano.ASSETS_FOLDER";
Debug.ShouldStop(16384);
main._bp.setField ("_assetspath",main._banano.getField(true,"ASSETS_FOLDER"));
 BA.debugLineNum = 48;BA.debugLine="BP.ScriptsPath = BANano.SCRIPTS_FOLDER";
Debug.ShouldStop(32768);
main._bp.setField ("_scriptspath",main._banano.getField(true,"SCRIPTS_FOLDER"));
 BA.debugLineNum = 49;BA.debugLine="BP.StylesPath = BANano.STYLES_FOLDER";
Debug.ShouldStop(65536);
main._bp.setField ("_stylespath",main._banano.getField(true,"STYLES_FOLDER"));
 BA.debugLineNum = 50;BA.debugLine="BP.ScriptFile = BANano.JAVASCRIPT_NAME";
Debug.ShouldStop(131072);
main._bp.setField ("_scriptfile",main._banano.getField(true,"JAVASCRIPT_NAME"));
 BA.debugLineNum = 51;BA.debugLine="BP.UnzipFonts";
Debug.ShouldStop(262144);
main._bp.runVoidMethod ("_unzipfonts");
 BA.debugLineNum = 52;BA.debugLine="BP.Open(True)";
Debug.ShouldStop(524288);
main._bp.runVoidMethod ("_open",(Object)(main.__c.getField(true,"True")));
 BA.debugLineNum = 53;BA.debugLine="ExitApplication";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _banano_ready() throws Exception{
try {
		Debug.PushSubsStack("BANano_Ready (main) ","main",0,main.ba,main.mostCurrent,61);
if (RapidSub.canDelegate("banano_ready")) { return b4j.example.main.remoteMe.runUserSub(false, "main","banano_ready");}
 BA.debugLineNum = 61;BA.debugLine="Sub BANano_Ready";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="pgIndex.Init";
Debug.ShouldStop(536870912);
main._pgindex.runVoidMethod ("_init" /*RemoteObject*/ );
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

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
pgindex_subs_0._process_globals();
moddashboard_subs_0._process_globals();
modexpenses_subs_0._process_globals();
modstats_subs_0._process_globals();
modexpensetypes_subs_0._process_globals();
modexpensecategories_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
pgindex.myClass = BA.getDeviceClass ("b4j.example.pgindex");
moddashboard.myClass = BA.getDeviceClass ("b4j.example.moddashboard");
modexpenses.myClass = BA.getDeviceClass ("b4j.example.modexpenses");
modstats.myClass = BA.getDeviceClass ("b4j.example.modstats");
modexpensetypes.myClass = BA.getDeviceClass ("b4j.example.modexpensetypes");
modexpensecategories.myClass = BA.getDeviceClass ("b4j.example.modexpensecategories");
bananoalasql.myClass = BA.getDeviceClass ("b4j.example.bananoalasql");
bananohashes.myClass = BA.getDeviceClass ("b4j.example.bananohashes");
bananomssql.myClass = BA.getDeviceClass ("b4j.example.bananomssql");
bananomysql.myClass = BA.getDeviceClass ("b4j.example.bananomysql");
bananooxml.myClass = BA.getDeviceClass ("b4j.example.bananooxml");
bananosqlite.myClass = BA.getDeviceClass ("b4j.example.bananosqlite");
bananovm.myClass = BA.getDeviceClass ("b4j.example.bananovm");
bananovue.myClass = BA.getDeviceClass ("b4j.example.bananovue");
pdfcolumns.myClass = BA.getDeviceClass ("b4j.example.pdfcolumns");
pdffooter.myClass = BA.getDeviceClass ("b4j.example.pdffooter");
pdfimage.myClass = BA.getDeviceClass ("b4j.example.pdfimage");
pdflist.myClass = BA.getDeviceClass ("b4j.example.pdflist");
pdfmaker.myClass = BA.getDeviceClass ("b4j.example.pdfmaker");
pdfparagraphs.myClass = BA.getDeviceClass ("b4j.example.pdfparagraphs");
pdfqrcode.myClass = BA.getDeviceClass ("b4j.example.pdfqrcode");
pdfrow.myClass = BA.getDeviceClass ("b4j.example.pdfrow");
pdfsecurity.myClass = BA.getDeviceClass ("b4j.example.pdfsecurity");
pdfstack.myClass = BA.getDeviceClass ("b4j.example.pdfstack");
pdfstyle.myClass = BA.getDeviceClass ("b4j.example.pdfstyle");
pdftable.myClass = BA.getDeviceClass ("b4j.example.pdftable");
pdftext.myClass = BA.getDeviceClass ("b4j.example.pdftext");
pdftoc.myClass = BA.getDeviceClass ("b4j.example.pdftoc");
pdfview.myClass = BA.getDeviceClass ("b4j.example.pdfview");
vmalert.myClass = BA.getDeviceClass ("b4j.example.vmalert");
vmavatar.myClass = BA.getDeviceClass ("b4j.example.vmavatar");
vmbadge.myClass = BA.getDeviceClass ("b4j.example.vmbadge");
vmbottombar.myClass = BA.getDeviceClass ("b4j.example.vmbottombar");
vmbottombaritem.myClass = BA.getDeviceClass ("b4j.example.vmbottombaritem");
vmbutton.myClass = BA.getDeviceClass ("b4j.example.vmbutton");
vmcard.myClass = BA.getDeviceClass ("b4j.example.vmcard");
vmcardactions.myClass = BA.getDeviceClass ("b4j.example.vmcardactions");
vmcardarea.myClass = BA.getDeviceClass ("b4j.example.vmcardarea");
vmcardmedia.myClass = BA.getDeviceClass ("b4j.example.vmcardmedia");
vmchartkick.myClass = BA.getDeviceClass ("b4j.example.vmchartkick");
vmcheckbox.myClass = BA.getDeviceClass ("b4j.example.vmcheckbox");
vmcheckboxgroup.myClass = BA.getDeviceClass ("b4j.example.vmcheckboxgroup");
vmchip.myClass = BA.getDeviceClass ("b4j.example.vmchip");
vmchips.myClass = BA.getDeviceClass ("b4j.example.vmchips");
vmcol.myClass = BA.getDeviceClass ("b4j.example.vmcol");
vmconfirm.myClass = BA.getDeviceClass ("b4j.example.vmconfirm");
vmcontainer.myClass = BA.getDeviceClass ("b4j.example.vmcontainer");
vmcss.myClass = BA.getDeviceClass ("b4j.example.vmcss");
vmdatepicker.myClass = BA.getDeviceClass ("b4j.example.vmdatepicker");
vmdialog.myClass = BA.getDeviceClass ("b4j.example.vmdialog");
vmdivider.myClass = BA.getDeviceClass ("b4j.example.vmdivider");
vmdrawer.myClass = BA.getDeviceClass ("b4j.example.vmdrawer");
vmelement.myClass = BA.getDeviceClass ("b4j.example.vmelement");
vmemptystate.myClass = BA.getDeviceClass ("b4j.example.vmemptystate");
vmenlighter.myClass = BA.getDeviceClass ("b4j.example.vmenlighter");
vmfield.myClass = BA.getDeviceClass ("b4j.example.vmfield");
vmfile.myClass = BA.getDeviceClass ("b4j.example.vmfile");
vmform.myClass = BA.getDeviceClass ("b4j.example.vmform");
vmfrappegantt.myClass = BA.getDeviceClass ("b4j.example.vmfrappegantt");
vmgijgotable.myClass = BA.getDeviceClass ("b4j.example.vmgijgotable");
vmgmap.myClass = BA.getDeviceClass ("b4j.example.vmgmap");
vmgrid.myClass = BA.getDeviceClass ("b4j.example.vmgrid");
vmicon.myClass = BA.getDeviceClass ("b4j.example.vmicon");
vmimage.myClass = BA.getDeviceClass ("b4j.example.vmimage");
vminfobox.myClass = BA.getDeviceClass ("b4j.example.vminfobox");
vminput.myClass = BA.getDeviceClass ("b4j.example.vminput");
vminputcontrol.myClass = BA.getDeviceClass ("b4j.example.vminputcontrol");
vmknob.myClass = BA.getDeviceClass ("b4j.example.vmknob");
vmlabel.myClass = BA.getDeviceClass ("b4j.example.vmlabel");
vmlist.myClass = BA.getDeviceClass ("b4j.example.vmlist");
vmlistitem.myClass = BA.getDeviceClass ("b4j.example.vmlistitem");
vmlistview.myClass = BA.getDeviceClass ("b4j.example.vmlistview");
vmloader.myClass = BA.getDeviceClass ("b4j.example.vmloader");
vmmediacardcover.myClass = BA.getDeviceClass ("b4j.example.vmmediacardcover");
vmmenu.myClass = BA.getDeviceClass ("b4j.example.vmmenu");
vmmenuitem.myClass = BA.getDeviceClass ("b4j.example.vmmenuitem");
vmnumberinput.myClass = BA.getDeviceClass ("b4j.example.vmnumberinput");
vmpdf.myClass = BA.getDeviceClass ("b4j.example.vmpdf");
vmprettyprint.myClass = BA.getDeviceClass ("b4j.example.vmprettyprint");
vmprogress.myClass = BA.getDeviceClass ("b4j.example.vmprogress");
vmprogresscircle.myClass = BA.getDeviceClass ("b4j.example.vmprogresscircle");
vmprompt.myClass = BA.getDeviceClass ("b4j.example.vmprompt");
vmproperty.myClass = BA.getDeviceClass ("b4j.example.vmproperty");
vmradio.myClass = BA.getDeviceClass ("b4j.example.vmradio");
vmradiogroup.myClass = BA.getDeviceClass ("b4j.example.vmradiogroup");
vmrow.myClass = BA.getDeviceClass ("b4j.example.vmrow");
vmselect.myClass = BA.getDeviceClass ("b4j.example.vmselect");
vmslider.myClass = BA.getDeviceClass ("b4j.example.vmslider");
vmsnackbar.myClass = BA.getDeviceClass ("b4j.example.vmsnackbar");
vmspeeddial.myClass = BA.getDeviceClass ("b4j.example.vmspeeddial");
vmspinner.myClass = BA.getDeviceClass ("b4j.example.vmspinner");
vmstepitem.myClass = BA.getDeviceClass ("b4j.example.vmstepitem");
vmsteppers.myClass = BA.getDeviceClass ("b4j.example.vmsteppers");
vmswitch.myClass = BA.getDeviceClass ("b4j.example.vmswitch");
vmtable.myClass = BA.getDeviceClass ("b4j.example.vmtable");
vmtabs.myClass = BA.getDeviceClass ("b4j.example.vmtabs");
vmtabsitem.myClass = BA.getDeviceClass ("b4j.example.vmtabsitem");
vmtd.myClass = BA.getDeviceClass ("b4j.example.vmtd");
vmtextarea.myClass = BA.getDeviceClass ("b4j.example.vmtextarea");
vmth.myClass = BA.getDeviceClass ("b4j.example.vmth");
vmtimepicker.myClass = BA.getDeviceClass ("b4j.example.vmtimepicker");
vmtoolbar.myClass = BA.getDeviceClass ("b4j.example.vmtoolbar");
vmtooltip.myClass = BA.getDeviceClass ("b4j.example.vmtooltip");
vmtr.myClass = BA.getDeviceClass ("b4j.example.vmtr");
vmtree.myClass = BA.getDeviceClass ("b4j.example.vmtree");
vmvuecal.myClass = BA.getDeviceClass ("b4j.example.vmvuecal");
vmwaterball.myClass = BA.getDeviceClass ("b4j.example.vmwaterball");
vuecomponent.myClass = BA.getDeviceClass ("b4j.example.vuecomponent");
vuehtml.myClass = BA.getDeviceClass ("b4j.example.vuehtml");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Public BANano As BANano 'ignore";
main._banano = RemoteObject.createNew ("com.ab.banano.BANano");
 //BA.debugLineNum = 9;BA.debugLine="Public AppName As String = \"expensesshow\"";
main._appname = BA.ObjectToString("expensesshow");
 //BA.debugLineNum = 10;BA.debugLine="Public Dbase As String";
main._dbase = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Private Publish As String";
main._publish = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Private BP As BANanoPostProcessor";
main._bp = RemoteObject.createNew ("b4j.example.bananopostprocessor");
 //BA.debugLineNum = 13;BA.debugLine="Public ServerIP As String";
main._serverip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}