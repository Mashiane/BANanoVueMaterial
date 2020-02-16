package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdffooter_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public LeftPart As PDFText";
pdffooter._leftpart = RemoteObject.createNew ("b4j.example.pdftext");__ref.setField("_leftpart",pdffooter._leftpart);
 //BA.debugLineNum = 3;BA.debugLine="Public RightPart As PDFText";
pdffooter._rightpart = RemoteObject.createNew ("b4j.example.pdftext");__ref.setField("_rightpart",pdffooter._rightpart);
 //BA.debugLineNum = 4;BA.debugLine="Private cols As List";
pdffooter._cols = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_cols",pdffooter._cols);
 //BA.debugLineNum = 5;BA.debugLine="Dim ftr As Map";
pdffooter._ftr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_ftr",pdffooter._ftr);
 //BA.debugLineNum = 6;BA.debugLine="Public style As PDFStyle";
pdffooter._style = RemoteObject.createNew ("b4j.example.pdfstyle");__ref.setField("_style",pdffooter._style);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdffooter) ","pdffooter",16,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdffooter","getcontent", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="cols.Add(LeftPart.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_leftpart" /*RemoteObject*/ ).runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 21;BA.debugLine="cols.Add(RightPart.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_rightpart" /*RemoteObject*/ ).runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 22;BA.debugLine="ftr.Put(\"columns\", cols)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ftr" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("columns"))),(Object)((__ref.getField(false,"_cols" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 23;BA.debugLine="style.Include(ftr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_include" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_ftr" /*RemoteObject*/ )));
 BA.debugLineNum = 24;BA.debugLine="Return ftr";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_ftr" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdffooter) ","pdffooter",16,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdffooter","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="cols.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 12;BA.debugLine="LeftPart.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_leftpart" /*RemoteObject*/ ).runClassMethod (b4j.example.pdftext.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 13;BA.debugLine="RightPart.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rightpart" /*RemoteObject*/ ).runClassMethod (b4j.example.pdftext.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 14;BA.debugLine="ftr.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ftr" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="style.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}