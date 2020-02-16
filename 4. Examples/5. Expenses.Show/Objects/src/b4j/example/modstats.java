package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class modstats extends Object{
public static modstats mostCurrent = new modstats();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.modstats", null);
		ba.loadHtSubs(modstats.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modstats", ba);
		}
	}
    public static Class<?> getObject() {
		return modstats.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static String _name = "";
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static String  _code() throws Exception{
RDebugUtils.currentModule="modstats";
if (Debug.shouldDelegate(ba, "code", false))
	 {return ((String) Debug.delegate(ba, "code", null));}
b4j.example.vmcontainer _cont = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Code";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Log(\"modStats.Code\")";
anywheresoftware.b4a.keywords.Common.Log("modStats.Code");
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (null,_name,modstats.getObject());
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="cont.Hide";
_cont._hide /*String*/ (null);
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="cont.AddRows(1).AddColumns12";
_cont._addrows /*b4j.example.vmgrid*/ (null,(int) (1))._addcolumns12 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (null,_cont);
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="End Sub";
return "";
}
}