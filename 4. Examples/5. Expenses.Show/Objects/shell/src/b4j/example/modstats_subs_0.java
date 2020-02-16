package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modstats_subs_0 {


public static RemoteObject  _code() throws Exception{
try {
		Debug.PushSubsStack("Code (modstats) ","modstats",4,modstats.ba,modstats.mostCurrent,7);
if (RapidSub.canDelegate("code")) { return b4j.example.modstats.remoteMe.runUserSub(false, "modstats","code");}
RemoteObject _cont = RemoteObject.declareNull("b4j.example.vmcontainer");
 BA.debugLineNum = 7;BA.debugLine="Sub Code";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="Log(\"modStats.Code\")";
Debug.ShouldStop(128);
modstats.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("modStats.Code")));
 BA.debugLineNum = 9;BA.debugLine="vm = pgIndex.vm";
Debug.ShouldStop(256);
modstats._vm = modstats._pgindex._vm /*RemoteObject*/ ;
 BA.debugLineNum = 11;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
Debug.ShouldStop(1024);
_cont = modstats._vm.runClassMethod (b4j.example.bananovm.class, "_createcontainer" /*RemoteObject*/ ,(Object)(modstats._name),(Object)(modstats.getObject()));Debug.locals.put("cont", _cont);Debug.locals.put("cont", _cont);
 BA.debugLineNum = 13;BA.debugLine="cont.Hide";
Debug.ShouldStop(4096);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 15;BA.debugLine="cont.AddRows(1).AddColumns12";
Debug.ShouldStop(16384);
_cont.runClassMethod (b4j.example.vmcontainer.class, "_addrows" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns12" /*RemoteObject*/ );
 BA.debugLineNum = 18;BA.debugLine="vm.AddContainer(cont)";
Debug.ShouldStop(131072);
modstats._vm.runClassMethod (b4j.example.bananovm.class, "_addcontainer" /*RemoteObject*/ ,(Object)(_cont));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
modstats._vm = RemoteObject.createNew ("b4j.example.bananovm");
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"statscode\"";
modstats._name = BA.ObjectToString("statscode");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}