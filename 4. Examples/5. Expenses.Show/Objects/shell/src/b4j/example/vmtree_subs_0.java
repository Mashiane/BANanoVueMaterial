package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtree_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtree","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 200;BA.debugLine="Sub AddClass(c As String) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 201;BA.debugLine="Tree.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 202;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addnode(RemoteObject __ref,RemoteObject _parentid,RemoteObject _pk,RemoteObject _text,RemoteObject _imgurl,RemoteObject _icon,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("AddNode (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("addnode")) { return __ref.runUserSub(false, "vmtree","addnode", __ref, _parentid, _pk, _text, _imgurl, _icon, _tag);}
RemoteObject _nod = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sicon = RemoteObject.createImmutable("");
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _strval = RemoteObject.declareNull("Object");
RemoteObject _prnt = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("parentID", _parentid);
Debug.locals.put("pk", _pk);
Debug.locals.put("Text", _text);
Debug.locals.put("ImgURL", _imgurl);
Debug.locals.put("Icon", _icon);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 244;BA.debugLine="Sub AddNode(parentID As String, pk As String, Text";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="If treeBO = Null Then Refresh";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_treebo" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4j.example.vmtree.class, "_refresh" /*RemoteObject*/ );};
 BA.debugLineNum = 247;BA.debugLine="Dim nod As Map = CreateMap(\"id\":pk,\"text\":Text)";
Debug.JustUpdateDeviceLine();
_nod = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nod = vmtree.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_pk),RemoteObject.createImmutable(("text")),(_text)}));Debug.locals.put("nod", _nod);Debug.locals.put("nod", _nod);
 BA.debugLineNum = 249;BA.debugLine="If ImgURL <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_imgurl,BA.ObjectToString(""))) { 
 BA.debugLineNum = 250;BA.debugLine="nod.Put(ImageUrlField, ImgURL)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("Put",(Object)((__ref.getField(true,"_imageurlfield" /*RemoteObject*/ ))),(Object)((_imgurl)));
 };
 BA.debugLineNum = 253;BA.debugLine="If Icon <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_icon,BA.ObjectToString(""))) { 
 BA.debugLineNum = 254;BA.debugLine="Dim sIcon As String = \"\"";
Debug.JustUpdateDeviceLine();
_sicon = BA.ObjectToString("");Debug.locals.put("sIcon", _sicon);Debug.locals.put("sIcon", _sicon);
 BA.debugLineNum = 255;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 257;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<i class=\"material-icons\">"),vmtree.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icon))),RemoteObject.createImmutable("</i>")));Debug.locals.put("sIcon", _sicon);
 break; }
case 1: {
 BA.debugLineNum = 259;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<i class=\""),vmtree.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icon))),RemoteObject.createImmutable("\"></i>")));Debug.locals.put("sIcon", _sicon);
 break; }
}
;
 BA.debugLineNum = 261;BA.debugLine="nod.Put(ImageHtmlField, sIcon)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("Put",(Object)((__ref.getField(true,"_imagehtmlfield" /*RemoteObject*/ ))),(Object)((_sicon)));
 };
 BA.debugLineNum = 264;BA.debugLine="If Tag <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_tag)) { 
 BA.debugLineNum = 265;BA.debugLine="For Each strKey As String In Tag.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group17 = _tag.runMethod(false,"Keys");
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_strkey = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("strKey", _strkey);
Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 266;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
Debug.JustUpdateDeviceLine();
_strval = _tag.runMethod(false,"Get",(Object)((_strkey)));Debug.locals.put("strVal", _strval);Debug.locals.put("strVal", _strval);
 BA.debugLineNum = 267;BA.debugLine="nod.Put(strKey,strVal)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("Put",(Object)((_strkey)),(Object)(_strval));
 }
}Debug.locals.put("strKey", _strkey);
;
 };
 BA.debugLineNum = 270;BA.debugLine="If parentID = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parentid,BA.ObjectToString(""))) { 
 BA.debugLineNum = 271;BA.debugLine="treeBO.RunMethod(\"addNode\",Array(nod))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addNode")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_nod.getObject())}))));
 }else {
 BA.debugLineNum = 273;BA.debugLine="Dim prnt As BANanoObject = GetNodeById(parentID)";
Debug.JustUpdateDeviceLine();
_prnt = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_prnt = __ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_parentid));Debug.locals.put("prnt", _prnt);Debug.locals.put("prnt", _prnt);
 BA.debugLineNum = 274;BA.debugLine="If prnt <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_prnt)) { 
 BA.debugLineNum = 275;BA.debugLine="treeBO.RunMethod(\"addNode\",Array(nod,prnt))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addNode")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_nod.getObject()),(_prnt.getObject())}))));
 };
 };
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("Check (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("check")) { return __ref.runUserSub(false, "vmtree","check", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 408;BA.debugLine="Sub Check(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 409;BA.debugLine="treeBO.RunMethod(\"check\", Array(GetNodeById(pk)))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("check")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())}))));
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckAll (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("checkall")) { return __ref.runUserSub(false, "vmtree","checkall", __ref);}
 BA.debugLineNum = 450;BA.debugLine="Sub CheckAll()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 451;BA.debugLine="treeBO.RunMethod(\"checkAll\", \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("checkAll")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Tree As VMElement";
vmtree._tree = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_tree",vmtree._tree);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtree._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtree._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtree._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtree._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmtree._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtree._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private options As Map";
vmtree._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",vmtree._options);
 //BA.debugLineNum = 8;BA.debugLine="Private eventHandler As Object";
vmtree._eventhandler = RemoteObject.createNew ("Object");__ref.setField("_eventhandler",vmtree._eventhandler);
 //BA.debugLineNum = 9;BA.debugLine="Private ExpandIcon As String";
vmtree._expandicon = RemoteObject.createImmutable("");__ref.setField("_expandicon",vmtree._expandicon);
 //BA.debugLineNum = 10;BA.debugLine="Private CollapseIcon As String";
vmtree._collapseicon = RemoteObject.createImmutable("");__ref.setField("_collapseicon",vmtree._collapseicon);
 //BA.debugLineNum = 11;BA.debugLine="Private treeBO As BANanoObject";
vmtree._treebo = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_treebo",vmtree._treebo);
 //BA.debugLineNum = 12;BA.debugLine="Private IconsLibrary As String";
vmtree._iconslibrary = RemoteObject.createImmutable("");__ref.setField("_iconslibrary",vmtree._iconslibrary);
 //BA.debugLineNum = 13;BA.debugLine="Private ImageUrlField As String";
vmtree._imageurlfield = RemoteObject.createImmutable("");__ref.setField("_imageurlfield",vmtree._imageurlfield);
 //BA.debugLineNum = 14;BA.debugLine="Private ImageHtmlField As String";
vmtree._imagehtmlfield = RemoteObject.createImmutable("");__ref.setField("_imagehtmlfield",vmtree._imagehtmlfield);
 //BA.debugLineNum = 15;BA.debugLine="Private JQ As BANanoObject";
vmtree._jq = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_jq",vmtree._jq);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,434);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "vmtree","clear", __ref);}
 BA.debugLineNum = 434;BA.debugLine="Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 435;BA.debugLine="SetDataSource(Array())";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setdatasource" /*RemoteObject*/ ,(Object)(vmtree.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {})))));
 BA.debugLineNum = 436;BA.debugLine="Refresh";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collapse(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("Collapse (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("collapse")) { return __ref.runUserSub(false, "vmtree","collapse", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 466;BA.debugLine="Sub Collapse(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 467;BA.debugLine="treeBO.RunMethod(\"collapse\", Array(GetNodeById(pk";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("collapse")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())}))));
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collapseall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CollapseAll (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,445);
if (RapidSub.canDelegate("collapseall")) { return __ref.runUserSub(false, "vmtree","collapseall", __ref);}
 BA.debugLineNum = 445;BA.debugLine="Sub CollapseAll()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 446;BA.debugLine="treeBO.RunMethod(\"collapseAll\", \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("collapseAll")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _destroy(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Destroy (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("destroy")) { return __ref.runUserSub(false, "vmtree","destroy", __ref);}
 BA.debugLineNum = 224;BA.debugLine="Sub Destroy";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 225;BA.debugLine="treeBO.runmethod(\"destroy\",Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("destroy")),(Object)(vmtree.__c.getField(false,"Null")));
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disable(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("Disable (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,476);
if (RapidSub.canDelegate("disable")) { return __ref.runUserSub(false, "vmtree","disable", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 476;BA.debugLine="Sub Disable(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 477;BA.debugLine="treeBO.RunMethod(\"disable\", Array(GetNodeById(pk)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("disable")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())}))));
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enable(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("Enable (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("enable")) { return __ref.runUserSub(false, "vmtree","enable", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 471;BA.debugLine="Sub Enable(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 472;BA.debugLine="treeBO.RunMethod(\"enable\", Array(GetNodeById(pk))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("enable")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())}))));
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expand(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("Expand (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,461);
if (RapidSub.canDelegate("expand")) { return __ref.runUserSub(false, "vmtree","expand", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 461;BA.debugLine="Sub Expand(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 462;BA.debugLine="treeBO.RunMethod(\"expand\", Array(GetNodeById(pk))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("expand")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())}))));
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expandall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExpandAll (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("expandall")) { return __ref.runUserSub(false, "vmtree","expandall", __ref);}
 BA.debugLineNum = 430;BA.debugLine="Sub ExpandAll()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 431;BA.debugLine="treeBO.RunMethod(\"expandAll\", \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("expandAll")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAll (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("getall")) { return __ref.runUserSub(false, "vmtree","getall", __ref);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 393;BA.debugLine="Sub GetAll() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 394;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getAll";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_treebo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAll")),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 395;BA.debugLine="Return BANano.ToJson(bo.Result)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)(_bo.runMethod(false,"Result"))));
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcheckednodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCheckedNodes (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,380);
if (RapidSub.canDelegate("getcheckednodes")) { return __ref.runUserSub(false, "vmtree","getcheckednodes", __ref);}
RemoteObject _snodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 380;BA.debugLine="Sub GetCheckedNodes() As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 381;BA.debugLine="Dim snodes As List";
Debug.JustUpdateDeviceLine();
_snodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("snodes", _snodes);
 BA.debugLineNum = 382;BA.debugLine="snodes.Initialize";
Debug.JustUpdateDeviceLine();
_snodes.runVoidMethod ("Initialize");
 BA.debugLineNum = 383;BA.debugLine="snodes = treeBO.RunMethod(\"getCheckedNodes\",\"\")";
Debug.JustUpdateDeviceLine();
_snodes.setObject(__ref.getField(false,"_treebo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getCheckedNodes")),(Object)((RemoteObject.createImmutable("")))).getObject());
 BA.debugLineNum = 384;BA.debugLine="Return snodes";
Debug.JustUpdateDeviceLine();
if (true) return _snodes;
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getchildren(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("GetChildren (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("getchildren")) { return __ref.runUserSub(false, "vmtree","getchildren", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 375;BA.debugLine="Sub GetChildren(pk As String) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="Return treeBO.RunMethod(\"getChildren\", Array(GetN";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_treebo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getChildren")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())})))).getObject());
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdata(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("GetData (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,493);
if (RapidSub.canDelegate("getdata")) { return __ref.runUserSub(false, "vmtree","getdata", __ref, _pk);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _dm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 493;BA.debugLine="Sub GetData(pk As String) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 494;BA.debugLine="Dim bo As BANanoObject = GetDataById(pk)";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo.setObject(__ref.runClassMethod (b4j.example.vmtree.class, "_getdatabyid" /*RemoteObject*/ ,(Object)(_pk)).getObject());Debug.locals.put("bo", _bo);
 BA.debugLineNum = 495;BA.debugLine="Dim dm As Map = bo.Result";
Debug.JustUpdateDeviceLine();
_dm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_dm.setObject(_bo.runMethod(false,"Result"));Debug.locals.put("dm", _dm);
 BA.debugLineNum = 496;BA.debugLine="Return dm";
Debug.JustUpdateDeviceLine();
if (true) return _dm;
 BA.debugLineNum = 497;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdatabyid(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("GetDataById (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("getdatabyid")) { return __ref.runUserSub(false, "vmtree","getdatabyid", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 281;BA.debugLine="Sub GetDataById(pk As String) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 282;BA.debugLine="Return treeBO.RunMethod(\"getDataById\", Array(pk))";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_treebo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDataById")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pk)})))).getObject());
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdatabytext(RemoteObject __ref,RemoteObject _nodetext) throws Exception{
try {
		Debug.PushSubsStack("GetDataByText (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("getdatabytext")) { return __ref.runUserSub(false, "vmtree","getdatabytext", __ref, _nodetext);}
Debug.locals.put("nodeText", _nodetext);
 BA.debugLineNum = 298;BA.debugLine="Sub GetDataByText(nodeText As String) As BANanoObj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 299;BA.debugLine="Return treeBO.RunMethod(\"getDataByText\", Array(no";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_treebo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDataByText")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_nodetext)}))));
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnodebyid(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("GetNodeById (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("getnodebyid")) { return __ref.runUserSub(false, "vmtree","getnodebyid", __ref, _pk);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 286;BA.debugLine="Sub GetNodeById(pk As String) As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 287;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getNod";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_treebo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getNodeById")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pk)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 288;BA.debugLine="Return bo";
Debug.JustUpdateDeviceLine();
if (true) return _bo;
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnodebytext(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("GetNodeByText (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("getnodebytext")) { return __ref.runUserSub(false, "vmtree","getnodebytext", __ref, _pk);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 292;BA.debugLine="Sub GetNodeByText(pk As String) As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 293;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getNod";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_treebo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getNodeByText")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pk)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 294;BA.debugLine="Return bo";
Debug.JustUpdateDeviceLine();
if (true) return _bo;
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselections(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSelections (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("getselections")) { return __ref.runUserSub(false, "vmtree","getselections", __ref);}
 BA.debugLineNum = 388;BA.debugLine="Sub GetSelections() As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 389;BA.debugLine="Return treeBO.RunMethod(\"getSelections\",\"\")";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_treebo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSelections")),(Object)((RemoteObject.createImmutable("")))).getObject());
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _module,RemoteObject _sid,RemoteObject _prikey) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtree","initialize", __ref, _ba, _v, _module, _sid, _prikey);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("module", _module);
Debug.locals.put("sid", _sid);
Debug.locals.put("priKey", _prikey);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(v As BANanoVue, module As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="BANano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jquery-3.4.1.min.js")));
 BA.debugLineNum = 21;BA.debugLine="BANano.DependsOnAsset(\"gijgo.min.css\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("gijgo.min.css")));
 BA.debugLineNum = 22;BA.debugLine="BANano.DependsOnAsset(\"gijgo.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("gijgo.min.js")));
 BA.debugLineNum = 23;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 24;BA.debugLine="Tree.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 25;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 26;BA.debugLine="JQ = vue.jquery";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jq" /*RemoteObject*/ ,__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(false,"_jquery" /*RemoteObject*/ ));
 BA.debugLineNum = 27;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 28;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 29;BA.debugLine="SetUiLibrary(\"materialdesign\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setuilibrary" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("materialdesign")));
 BA.debugLineNum = 30;BA.debugLine="SetIconsLibrary(\"materialicons\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_seticonslibrary" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("materialicons")));
 BA.debugLineNum = 31;BA.debugLine="SetLazyLoading(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setlazyloading" /*RemoteObject*/ ,(Object)(vmtree.__c.getField(true,"True")));
 BA.debugLineNum = 32;BA.debugLine="SetSelectionType(\"single\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setselectiontype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("single")));
 BA.debugLineNum = 33;BA.debugLine="SetCheckedField(\"checked\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setcheckedfield" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("checked")));
 BA.debugLineNum = 34;BA.debugLine="SetChildrenField(\"children\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setchildrenfield" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("children")));
 BA.debugLineNum = 35;BA.debugLine="SetDisabledField(\"disabled\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setdisabledfield" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("disabled")));
 BA.debugLineNum = 36;BA.debugLine="SetHasChildrenField(\"hasChildren\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_sethaschildrenfield" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("hasChildren")));
 BA.debugLineNum = 37;BA.debugLine="SetImageCssClassField(\"imageCssClass\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setimagecssclassfield" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("imageCssClass")));
 BA.debugLineNum = 38;BA.debugLine="SetImageHtmlField(\"imageHtml\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setimagehtmlfield" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("imageHtml")));
 BA.debugLineNum = 39;BA.debugLine="SetImageUrlField(\"imageUrl\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setimageurlfield" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("imageUrl")));
 BA.debugLineNum = 40;BA.debugLine="SetTextField(\"text\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_settextfield" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("text")));
 BA.debugLineNum = 41;BA.debugLine="SetPrimaryKey(priKey)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_setprimarykey" /*RemoteObject*/ ,(Object)(_prikey));
 BA.debugLineNum = 42;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtree","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 195;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtree.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmtree","refresh", __ref);}
RemoteObject _e = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _node = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sid = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _state = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 229;BA.debugLine="Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 230;BA.debugLine="If treeBO <> Null Then Destroy";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_treebo" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4j.example.vmtree.class, "_destroy" /*RemoteObject*/ );};
 BA.debugLineNum = 232;BA.debugLine="treeBO = JQ.Selector($\"#${ID}\"$).RunMethod(\"tree\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_treebo" /*RemoteObject*/ ,__ref.getField(false,"_jq" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("#"),vmtree.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("tree")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())})))));
 BA.debugLineNum = 234;BA.debugLine="Dim e, node, record, sID, state As Map  'ignore";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("e", _e);
_node = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("node", _node);
_record = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("record", _record);
_sid = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("sID", _sid);
_state = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("state", _state);
 BA.debugLineNum = 237;BA.debugLine="treeBO.RunMethod(\"bind\", Array(\"select\", BANano.C";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("bind")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("select")),__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_id" /*RemoteObject*/ ),RemoteObject.createImmutable("_select"))),(Object)(vmtree.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_e.getObject()),(_node.getObject()),(_sid.getObject())})))))}))));
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reload(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reload (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("reload")) { return __ref.runUserSub(false, "vmtree","reload", __ref);}
 BA.debugLineNum = 440;BA.debugLine="Sub Reload()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 441;BA.debugLine="treeBO.RunMethod(\"reload\", \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("reload")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removechildren(RemoteObject __ref,RemoteObject _parentid) throws Exception{
try {
		Debug.PushSubsStack("RemoveChildren (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("removechildren")) { return __ref.runUserSub(false, "vmtree","removechildren", __ref, _parentid);}
RemoteObject _children = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tchild = RemoteObject.createImmutable(0);
RemoteObject _cchild = RemoteObject.createImmutable(0);
RemoteObject _strchild = RemoteObject.createImmutable("");
Debug.locals.put("parentID", _parentid);
 BA.debugLineNum = 481;BA.debugLine="Sub RemoveChildren(parentID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 483;BA.debugLine="Dim children As List = GetChildren(parentID)";
Debug.JustUpdateDeviceLine();
_children = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_children = __ref.runClassMethod (b4j.example.vmtree.class, "_getchildren" /*RemoteObject*/ ,(Object)(_parentid));Debug.locals.put("children", _children);Debug.locals.put("children", _children);
 BA.debugLineNum = 484;BA.debugLine="Dim tChild As Int = children.Size - 1";
Debug.JustUpdateDeviceLine();
_tchild = RemoteObject.solve(new RemoteObject[] {_children.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("tChild", _tchild);Debug.locals.put("tChild", _tchild);
 BA.debugLineNum = 485;BA.debugLine="Dim cChild As Int";
Debug.JustUpdateDeviceLine();
_cchild = RemoteObject.createImmutable(0);Debug.locals.put("cChild", _cchild);
 BA.debugLineNum = 486;BA.debugLine="For cChild = tChild To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step4 = -1;
final int limit4 = 0;
_cchild = _tchild ;
for (;(step4 > 0 && _cchild.<Integer>get().intValue() <= limit4) || (step4 < 0 && _cchild.<Integer>get().intValue() >= limit4) ;_cchild = RemoteObject.createImmutable((int)(0 + _cchild.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("cChild", _cchild);
 BA.debugLineNum = 487;BA.debugLine="Dim strChild As String = children.Get(cChild)";
Debug.JustUpdateDeviceLine();
_strchild = BA.ObjectToString(_children.runMethod(false,"Get",(Object)(_cchild)));Debug.locals.put("strChild", _strchild);Debug.locals.put("strChild", _strchild);
 BA.debugLineNum = 488;BA.debugLine="RemoveNode(strChild)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_removenode" /*RemoteObject*/ ,(Object)(_strchild));
 }
}Debug.locals.put("cChild", _cchild);
;
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removenode(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("RemoveNode (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,399);
if (RapidSub.canDelegate("removenode")) { return __ref.runUserSub(false, "vmtree","removenode", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 399;BA.debugLine="Sub RemoveNode(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 400;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 401;BA.debugLine="treeBO.RunMethod(\"removeNode\", GetNodeById(pk))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("removeNode")),(Object)((__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e4.toString()); BA.debugLineNum = 403;BA.debugLine="Log(\"Error removing node\")";
Debug.JustUpdateDeviceLine();
vmtree.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error removing node")));
 };
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtree","render", __ref);}
 BA.debugLineNum = 190;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtree.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectnode(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("SelectNode (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("selectnode")) { return __ref.runUserSub(false, "vmtree","selectnode", __ref, _pk);}
RemoteObject _rec = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 418;BA.debugLine="Sub SelectNode(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 419;BA.debugLine="UnSelectAll";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtree.class, "_unselectall" /*RemoteObject*/ );
 BA.debugLineNum = 420;BA.debugLine="Dim rec As BANanoObject = GetNodeById(pk)";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_rec = __ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 421;BA.debugLine="treeBO.RunMethod(\"select\", Array(rec))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("select")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_rec.getObject())}))));
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtree","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 206;BA.debugLine="Sub SetAttr(attr As Map) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="Tree.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 208;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautoload(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAutoLoad (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setautoload")) { return __ref.runUserSub(false, "vmtree","setautoload", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="Sub SetAutoLoad(b As Boolean) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="options.Put(\"autoLoad\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("autoLoad"))),(Object)((_b)));
 BA.debugLineNum = 64;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vmtree","setborder", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 72;BA.debugLine="Sub SetBorder(b As Boolean) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="options.Put(\"border\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border"))),(Object)((_b)));
 BA.debugLineNum = 74;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcascadecheck(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCascadeCheck (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setcascadecheck")) { return __ref.runUserSub(false, "vmtree","setcascadecheck", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 77;BA.debugLine="Sub SetCascadeCheck(b As Boolean) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="options.Put(\"cascadeCheck\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cascadeCheck"))),(Object)((_b)));
 BA.debugLineNum = 79;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcheckboxes(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCheckboxes (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setcheckboxes")) { return __ref.runUserSub(false, "vmtree","setcheckboxes", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 82;BA.debugLine="Sub SetCheckboxes(b As Boolean) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="options.put(\"checkboxes\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("checkboxes"))),(Object)((_b)));
 BA.debugLineNum = 84;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcheckedfield(RemoteObject __ref,RemoteObject _checkedfield) throws Exception{
try {
		Debug.PushSubsStack("SetCheckedField (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setcheckedfield")) { return __ref.runUserSub(false, "vmtree","setcheckedfield", __ref, _checkedfield);}
Debug.locals.put("checkedField", _checkedfield);
 BA.debugLineNum = 87;BA.debugLine="Sub SetCheckedField(checkedField As String) As VMT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="options.Put(\"checkedField\", checkedField)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("checkedField"))),(Object)((_checkedfield)));
 BA.debugLineNum = 89;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setchildrenfield(RemoteObject __ref,RemoteObject _childrenfield) throws Exception{
try {
		Debug.PushSubsStack("SetChildrenField (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setchildrenfield")) { return __ref.runUserSub(false, "vmtree","setchildrenfield", __ref, _childrenfield);}
Debug.locals.put("childrenField", _childrenfield);
 BA.debugLineNum = 92;BA.debugLine="Sub SetChildrenField(childrenField As String) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="options.Put(\"childrenField\", childrenField)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("childrenField"))),(Object)((_childrenfield)));
 BA.debugLineNum = 94;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdata(RemoteObject __ref,RemoteObject _pk,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("SetData (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,337);
if (RapidSub.canDelegate("setdata")) { return __ref.runUserSub(false, "vmtree","setdata", __ref, _pk, _tag);}
RemoteObject _nod = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _strval = RemoteObject.declareNull("Object");
Debug.locals.put("pk", _pk);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 337;BA.debugLine="Sub SetData(pk As String, Tag As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 338;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
Debug.JustUpdateDeviceLine();
_nod = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_nod.setObject(__ref.runClassMethod (b4j.example.vmtree.class, "_getdatabyid" /*RemoteObject*/ ,(Object)(_pk)).getObject());Debug.locals.put("nod", _nod);
 BA.debugLineNum = 339;BA.debugLine="If nod <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_nod)) { 
 BA.debugLineNum = 340;BA.debugLine="If Tag <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_tag)) { 
 BA.debugLineNum = 341;BA.debugLine="For Each strKey As String In Tag.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _tag.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strkey = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("strKey", _strkey);
Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 342;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
Debug.JustUpdateDeviceLine();
_strval = _tag.runMethod(false,"Get",(Object)((_strkey)));Debug.locals.put("strVal", _strval);Debug.locals.put("strVal", _strval);
 BA.debugLineNum = 343;BA.debugLine="nod.SetField(strKey, strVal)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("SetField",(Object)(_strkey),(Object)(_strval));
 }
}Debug.locals.put("strKey", _strkey);
;
 };
 BA.debugLineNum = 346;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("updateNode")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_pk),(_nod.getObject())}))));
 };
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdatasource(RemoteObject __ref,RemoteObject _datasource) throws Exception{
try {
		Debug.PushSubsStack("SetDataSource (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setdatasource")) { return __ref.runUserSub(false, "vmtree","setdatasource", __ref, _datasource);}
Debug.locals.put("dataSource", _datasource);
 BA.debugLineNum = 97;BA.debugLine="Sub SetDataSource(dataSource As List) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="options.Put(\"dataSource\", dataSource)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dataSource"))),(Object)((_datasource.getObject())));
 BA.debugLineNum = 99;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmtree","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 46;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="Tree.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 48;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabledfield(RemoteObject __ref,RemoteObject _disabledfield) throws Exception{
try {
		Debug.PushSubsStack("SetDisabledField (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("setdisabledfield")) { return __ref.runUserSub(false, "vmtree","setdisabledfield", __ref, _disabledfield);}
Debug.locals.put("disabledField", _disabledfield);
 BA.debugLineNum = 102;BA.debugLine="Sub SetDisabledField(disabledField As String) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="options.Put(\"disabledField\", disabledField)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("disabledField"))),(Object)((_disabledfield)));
 BA.debugLineNum = 104;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdraganddrop(RemoteObject __ref,RemoteObject _draganddrop) throws Exception{
try {
		Debug.PushSubsStack("SetDragAndDrop (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setdraganddrop")) { return __ref.runUserSub(false, "vmtree","setdraganddrop", __ref, _draganddrop);}
Debug.locals.put("dragAndDrop", _draganddrop);
 BA.debugLineNum = 107;BA.debugLine="Sub SetDragAndDrop(dragAndDrop As Boolean) As VMTr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="options.Put(\"dragAndDrop\", dragAndDrop)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dragAndDrop"))),(Object)((_draganddrop)));
 BA.debugLineNum = 109;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmtree","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 57;BA.debugLine="Sub SetElevation(e As Int) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Tree.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 59;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethaschildrenfield(RemoteObject __ref,RemoteObject _haschildrenfield) throws Exception{
try {
		Debug.PushSubsStack("SetHasChildrenField (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("sethaschildrenfield")) { return __ref.runUserSub(false, "vmtree","sethaschildrenfield", __ref, _haschildrenfield);}
Debug.locals.put("hasChildrenField", _haschildrenfield);
 BA.debugLineNum = 112;BA.debugLine="Sub SetHasChildrenField(hasChildrenField As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="options.Put(\"hasChildrenField\", hasChildrenField)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("hasChildrenField"))),(Object)((_haschildrenfield)));
 BA.debugLineNum = 114;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _pk,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmtree","seticon", __ref, _pk, _icon);}
RemoteObject _nod = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _sicon = RemoteObject.createImmutable("");
Debug.locals.put("pk", _pk);
Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 312;BA.debugLine="Sub SetIcon(pk As String, Icon As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 313;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
Debug.JustUpdateDeviceLine();
_nod = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_nod.setObject(__ref.runClassMethod (b4j.example.vmtree.class, "_getdatabyid" /*RemoteObject*/ ,(Object)(_pk)).getObject());Debug.locals.put("nod", _nod);
 BA.debugLineNum = 314;BA.debugLine="If nod <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_nod)) { 
 BA.debugLineNum = 315;BA.debugLine="Dim sIcon As String = \"\"";
Debug.JustUpdateDeviceLine();
_sicon = BA.ObjectToString("");Debug.locals.put("sIcon", _sicon);Debug.locals.put("sIcon", _sicon);
 BA.debugLineNum = 316;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 318;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<i class=\"material-icons\">"),vmtree.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icon))),RemoteObject.createImmutable("</i>")));Debug.locals.put("sIcon", _sicon);
 break; }
case 1: {
 BA.debugLineNum = 320;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<i class=\""),vmtree.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icon))),RemoteObject.createImmutable("\"></i>")));Debug.locals.put("sIcon", _sicon);
 break; }
}
;
 BA.debugLineNum = 322;BA.debugLine="nod.SetField(ImageHtmlField, sIcon)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("SetField",(Object)(__ref.getField(true,"_imagehtmlfield" /*RemoteObject*/ )),(Object)((_sicon)));
 BA.debugLineNum = 323;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("updateNode")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_pk),(_nod.getObject())}))));
 };
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticonslibrary(RemoteObject __ref,RemoteObject _siconslibrary) throws Exception{
try {
		Debug.PushSubsStack("SetIconsLibrary (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("seticonslibrary")) { return __ref.runUserSub(false, "vmtree","seticonslibrary", __ref, _siconslibrary);}
Debug.locals.put("sIconsLibrary", _siconslibrary);
 BA.debugLineNum = 117;BA.debugLine="Sub SetIconsLibrary(sIconsLibrary As String) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="IconsLibrary = sIconsLibrary";
Debug.JustUpdateDeviceLine();
__ref.setField ("_iconslibrary" /*RemoteObject*/ ,_siconslibrary);
 BA.debugLineNum = 119;BA.debugLine="options.Put(\"iconsLibrary\", IconsLibrary)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("iconsLibrary"))),(Object)((__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ))));
 BA.debugLineNum = 120;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 122;BA.debugLine="ExpandIcon = $\"<i class=\"material-icons\">keyboar";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expandicon" /*RemoteObject*/ ,(RemoteObject.createImmutable("<i class=\"material-icons\">keyboard_arrow_right</i>")));
 BA.debugLineNum = 123;BA.debugLine="CollapseIcon = $\"<i class=\"material-icons\">keybo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_collapseicon" /*RemoteObject*/ ,(RemoteObject.createImmutable("<i class=\"material-icons\">keyboard_arrow_down</i>")));
 break; }
case 1: {
 BA.debugLineNum = 125;BA.debugLine="ExpandIcon = $\"<i class=\"fa fa-chevron-right\"></";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expandicon" /*RemoteObject*/ ,(RemoteObject.createImmutable("<i class=\"fa fa-chevron-right\"></i>")));
 BA.debugLineNum = 126;BA.debugLine="CollapseIcon = $\"<i class=\"fa fa-chevron-down\"><";
Debug.JustUpdateDeviceLine();
__ref.setField ("_collapseicon" /*RemoteObject*/ ,(RemoteObject.createImmutable("<i class=\"fa fa-chevron-down\"></i>")));
 break; }
}
;
 BA.debugLineNum = 128;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setimage(RemoteObject __ref,RemoteObject _pk,RemoteObject _imageurl) throws Exception{
try {
		Debug.PushSubsStack("SetImage (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("setimage")) { return __ref.runUserSub(false, "vmtree","setimage", __ref, _pk, _imageurl);}
RemoteObject _nod = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("pk", _pk);
Debug.locals.put("ImageURL", _imageurl);
 BA.debugLineNum = 328;BA.debugLine="Sub SetImage(pk As String, ImageURL As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
Debug.JustUpdateDeviceLine();
_nod = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_nod.setObject(__ref.runClassMethod (b4j.example.vmtree.class, "_getdatabyid" /*RemoteObject*/ ,(Object)(_pk)).getObject());Debug.locals.put("nod", _nod);
 BA.debugLineNum = 330;BA.debugLine="If nod <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_nod)) { 
 BA.debugLineNum = 331;BA.debugLine="nod.SetField(ImageUrlField, ImageURL)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("SetField",(Object)(__ref.getField(true,"_imageurlfield" /*RemoteObject*/ )),(Object)((_imageurl)));
 BA.debugLineNum = 332;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("updateNode")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_pk),(_nod.getObject())}))));
 };
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setimagecssclassfield(RemoteObject __ref,RemoteObject _imagecssclassfield) throws Exception{
try {
		Debug.PushSubsStack("SetImageCssClassField (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("setimagecssclassfield")) { return __ref.runUserSub(false, "vmtree","setimagecssclassfield", __ref, _imagecssclassfield);}
Debug.locals.put("imageCssClassField", _imagecssclassfield);
 BA.debugLineNum = 131;BA.debugLine="Sub SetImageCssClassField(imageCssClassField As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="options.Put(\"imageCssClassField\", imageCssClassFi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imageCssClassField"))),(Object)((_imagecssclassfield)));
 BA.debugLineNum = 133;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setimagehtmlfield(RemoteObject __ref,RemoteObject _simagehtmlfield) throws Exception{
try {
		Debug.PushSubsStack("SetImageHtmlField (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("setimagehtmlfield")) { return __ref.runUserSub(false, "vmtree","setimagehtmlfield", __ref, _simagehtmlfield);}
Debug.locals.put("sImageHtmlField", _simagehtmlfield);
 BA.debugLineNum = 136;BA.debugLine="Sub SetImageHtmlField(sImageHtmlField As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="ImageHtmlField = sImageHtmlField";
Debug.JustUpdateDeviceLine();
__ref.setField ("_imagehtmlfield" /*RemoteObject*/ ,_simagehtmlfield);
 BA.debugLineNum = 138;BA.debugLine="options.Put(\"imageHtmlField\", ImageHtmlField)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imageHtmlField"))),(Object)((__ref.getField(true,"_imagehtmlfield" /*RemoteObject*/ ))));
 BA.debugLineNum = 139;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setimageurlfield(RemoteObject __ref,RemoteObject _simageurlfield) throws Exception{
try {
		Debug.PushSubsStack("SetImageUrlField (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("setimageurlfield")) { return __ref.runUserSub(false, "vmtree","setimageurlfield", __ref, _simageurlfield);}
Debug.locals.put("sImageUrlField", _simageurlfield);
 BA.debugLineNum = 142;BA.debugLine="Sub SetImageUrlField(sImageUrlField As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="ImageUrlField = sImageUrlField";
Debug.JustUpdateDeviceLine();
__ref.setField ("_imageurlfield" /*RemoteObject*/ ,_simageurlfield);
 BA.debugLineNum = 144;BA.debugLine="options.Put(\"imageUrlField\", ImageUrlField)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imageUrlField"))),(Object)((__ref.getField(true,"_imageurlfield" /*RemoteObject*/ ))));
 BA.debugLineNum = 145;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlazyloading(RemoteObject __ref,RemoteObject _lazyloading) throws Exception{
try {
		Debug.PushSubsStack("SetLazyLoading (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setlazyloading")) { return __ref.runUserSub(false, "vmtree","setlazyloading", __ref, _lazyloading);}
Debug.locals.put("lazyLoading", _lazyloading);
 BA.debugLineNum = 148;BA.debugLine="Sub SetLazyLoading(lazyLoading As Boolean) As VMTr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="options.Put(\"lazyLoading\", lazyLoading)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lazyLoading"))),(Object)((_lazyloading)));
 BA.debugLineNum = 150;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtree","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 218;BA.debugLine="Sub SetPadding(p As Object) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="Tree.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 220;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprimarykey(RemoteObject __ref,RemoteObject _primarykey) throws Exception{
try {
		Debug.PushSubsStack("SetPrimaryKey (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("setprimarykey")) { return __ref.runUserSub(false, "vmtree","setprimarykey", __ref, _primarykey);}
Debug.locals.put("primaryKey", _primarykey);
 BA.debugLineNum = 153;BA.debugLine="Sub SetPrimaryKey(primaryKey As String) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="options.Put(\"primaryKey\", primaryKey)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primaryKey"))),(Object)((_primarykey)));
 BA.debugLineNum = 155;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectiontype(RemoteObject __ref,RemoteObject _selectiontype) throws Exception{
try {
		Debug.PushSubsStack("SetSelectionType (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("setselectiontype")) { return __ref.runUserSub(false, "vmtree","setselectiontype", __ref, _selectiontype);}
Debug.locals.put("selectionType", _selectiontype);
 BA.debugLineNum = 158;BA.debugLine="Sub SetSelectionType(selectionType As String) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="options.Put(\"selectionType\", selectionType)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("selectionType"))),(Object)((_selectiontype)));
 BA.debugLineNum = 160;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtree","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 212;BA.debugLine="Sub SetStyle(sm As Map) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 213;BA.debugLine="Tree.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 214;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _pk,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtree","settext", __ref, _pk, _text);}
RemoteObject _nod = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("pk", _pk);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 303;BA.debugLine="Sub SetText(pk As String, Text As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 304;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
Debug.JustUpdateDeviceLine();
_nod = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_nod.setObject(__ref.runClassMethod (b4j.example.vmtree.class, "_getdatabyid" /*RemoteObject*/ ,(Object)(_pk)).getObject());Debug.locals.put("nod", _nod);
 BA.debugLineNum = 305;BA.debugLine="If nod <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_nod)) { 
 BA.debugLineNum = 306;BA.debugLine="nod.SetField(\"text\", Text)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("SetField",(Object)(BA.ObjectToString("text")),(Object)((_text)));
 BA.debugLineNum = 307;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("updateNode")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_pk),(_nod.getObject())}))));
 };
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextfield(RemoteObject __ref,RemoteObject _textfield) throws Exception{
try {
		Debug.PushSubsStack("SetTextField (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("settextfield")) { return __ref.runUserSub(false, "vmtree","settextfield", __ref, _textfield);}
Debug.locals.put("textField", _textfield);
 BA.debugLineNum = 163;BA.debugLine="Sub SetTextField(textField As String) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="options.Put(\"textField\", textField)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("textField"))),(Object)((_textfield)));
 BA.debugLineNum = 165;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setuilibrary(RemoteObject __ref,RemoteObject _uilibrary) throws Exception{
try {
		Debug.PushSubsStack("SetUiLibrary (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("setuilibrary")) { return __ref.runUserSub(false, "vmtree","setuilibrary", __ref, _uilibrary);}
Debug.locals.put("uiLibrary", _uilibrary);
 BA.debugLineNum = 168;BA.debugLine="Sub SetUiLibrary(uiLibrary As String) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 169;BA.debugLine="options.Put(\"uiLibrary\", uiLibrary)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("uiLibrary"))),(Object)((_uilibrary)));
 BA.debugLineNum = 170;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmtree","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 184;BA.debugLine="Sub SetVModel(k As String) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="Tree.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 186;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtree","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 51;BA.debugLine="Sub SetVShow(vif As String) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 53;BA.debugLine="Tree.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 54;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmtree","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 67;BA.debugLine="Sub SetWidth(w As String) As VMTree";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="options.Put(\"width\", w)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((_w)));
 BA.debugLineNum = 69;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtree","tostring", __ref);}
RemoteObject _icn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 175;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="Dim icn As Map";
Debug.JustUpdateDeviceLine();
_icn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("icn", _icn);
 BA.debugLineNum = 177;BA.debugLine="icn.Initialize";
Debug.JustUpdateDeviceLine();
_icn.runVoidMethod ("Initialize");
 BA.debugLineNum = 178;BA.debugLine="icn.Put(\"expand\", ExpandIcon)";
Debug.JustUpdateDeviceLine();
_icn.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("expand"))),(Object)((__ref.getField(true,"_expandicon" /*RemoteObject*/ ))));
 BA.debugLineNum = 179;BA.debugLine="icn.Put(\"collapse\", CollapseIcon)";
Debug.JustUpdateDeviceLine();
_icn.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("collapse"))),(Object)((__ref.getField(true,"_collapseicon" /*RemoteObject*/ ))));
 BA.debugLineNum = 180;BA.debugLine="options.Put(\"icons\", icn)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((_icn.getObject())));
 BA.debugLineNum = 181;BA.debugLine="Return Tree.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tree" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _uncheck(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("UnCheck (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,413);
if (RapidSub.canDelegate("uncheck")) { return __ref.runUserSub(false, "vmtree","uncheck", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 413;BA.debugLine="Sub UnCheck(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 414;BA.debugLine="treeBO.RunMethod(\"uncheck\", Array(GetNodeById(pk)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("uncheck")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())}))));
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _uncheckall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UnCheckAll (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,455);
if (RapidSub.canDelegate("uncheckall")) { return __ref.runUserSub(false, "vmtree","uncheckall", __ref);}
 BA.debugLineNum = 455;BA.debugLine="Sub UnCheckAll()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 456;BA.debugLine="treeBO.RunMethod(\"uncheckAll\", \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("uncheckAll")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 457;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unselectall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UnSelectAll (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,500);
if (RapidSub.canDelegate("unselectall")) { return __ref.runUserSub(false, "vmtree","unselectall", __ref);}
 BA.debugLineNum = 500;BA.debugLine="Sub UnSelectAll";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 501;BA.debugLine="treeBO.RunMethod(\"unselectAll\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("unselectAll")),(Object)(vmtree.__c.getField(false,"Null")));
 BA.debugLineNum = 502;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unselectnode(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("UnSelectNode (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("unselectnode")) { return __ref.runUserSub(false, "vmtree","unselectnode", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 425;BA.debugLine="Sub UnSelectNode(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 426;BA.debugLine="treeBO.RunMethod(\"unselect\", Array(GetNodeById(pk";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("unselect")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.vmtree.class, "_getnodebyid" /*RemoteObject*/ ,(Object)(_pk)).getObject())}))));
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatenode(RemoteObject __ref,RemoteObject _pk,RemoteObject _text,RemoteObject _imgurl,RemoteObject _icon,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("UpdateNode (vmtree) ","vmtree",105,__ref.getField(false, "ba"),__ref,351);
if (RapidSub.canDelegate("updatenode")) { return __ref.runUserSub(false, "vmtree","updatenode", __ref, _pk, _text, _imgurl, _icon, _tag);}
RemoteObject _nod = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _strval = RemoteObject.declareNull("Object");
RemoteObject _sicon = RemoteObject.createImmutable("");
Debug.locals.put("pk", _pk);
Debug.locals.put("Text", _text);
Debug.locals.put("ImgURL", _imgurl);
Debug.locals.put("Icon", _icon);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 351;BA.debugLine="Sub UpdateNode(pk As String, Text As String, ImgUR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 352;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
Debug.JustUpdateDeviceLine();
_nod = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_nod.setObject(__ref.runClassMethod (b4j.example.vmtree.class, "_getdatabyid" /*RemoteObject*/ ,(Object)(_pk)).getObject());Debug.locals.put("nod", _nod);
 BA.debugLineNum = 353;BA.debugLine="If nod <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_nod)) { 
 BA.debugLineNum = 354;BA.debugLine="nod.SetField(\"text\", Text)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("SetField",(Object)(BA.ObjectToString("text")),(Object)((_text)));
 BA.debugLineNum = 355;BA.debugLine="If Tag <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_tag)) { 
 BA.debugLineNum = 356;BA.debugLine="For Each strKey As String In Tag.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _tag.runMethod(false,"Keys");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strkey = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("strKey", _strkey);
Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 357;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
Debug.JustUpdateDeviceLine();
_strval = _tag.runMethod(false,"Get",(Object)((_strkey)));Debug.locals.put("strVal", _strval);Debug.locals.put("strVal", _strval);
 BA.debugLineNum = 358;BA.debugLine="nod.SetField(strKey, strVal)";
Debug.JustUpdateDeviceLine();
_nod.runVoidMethod ("SetField",(Object)(_strkey),(Object)(_strval));
 }
}Debug.locals.put("strKey", _strkey);
;
 };
 BA.debugLineNum = 361;BA.debugLine="Dim sIcon As String = \"\"";
Debug.JustUpdateDeviceLine();
_sicon = BA.ObjectToString("");Debug.locals.put("sIcon", _sicon);Debug.locals.put("sIcon", _sicon);
 BA.debugLineNum = 362;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 364;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<i class=\"material-icons\">"),vmtree.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icon))),RemoteObject.createImmutable("</i>")));Debug.locals.put("sIcon", _sicon);
 break; }
case 1: {
 BA.debugLineNum = 366;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<i class=\""),vmtree.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icon))),RemoteObject.createImmutable("\"></i>")));Debug.locals.put("sIcon", _sicon);
 break; }
}
;
 BA.debugLineNum = 368;BA.debugLine="If ImgURL.Length > 0 Then nod.SetField(ImageUrlF";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_imgurl.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
_nod.runVoidMethod ("SetField",(Object)(__ref.getField(true,"_imageurlfield" /*RemoteObject*/ )),(Object)((_sicon)));};
 BA.debugLineNum = 369;BA.debugLine="If Icon.Length > 0 Then nod.SetField(ImageHtmlFi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_icon.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
_nod.runVoidMethod ("SetField",(Object)(__ref.getField(true,"_imagehtmlfield" /*RemoteObject*/ )),(Object)((_imgurl)));};
 BA.debugLineNum = 370;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_treebo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("updateNode")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_pk),(_nod.getObject())}))));
 };
 BA.debugLineNum = 372;BA.debugLine="End Sub";
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