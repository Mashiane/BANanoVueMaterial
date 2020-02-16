package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmfile_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmfile","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 137;BA.debugLine="Sub AddChild(child As VMElement) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 139;BA.debugLine="FileO.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 140;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmfile","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 183;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 184;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 185;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfile.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmfile","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 165;BA.debugLine="Sub AddClass(c As String) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 166;BA.debugLine="FileO.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 167;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmfile","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 226;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmfile.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 228;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public FileO As VMElement";
vmfile._fileo = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_fileo",vmfile._fileo);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmfile._id = RemoteObject.createImmutable("");__ref.setField("_id",vmfile._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmfile._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmfile._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmfile._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmfile._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private FileInt As VMField";
vmfile._fileint = RemoteObject.createNew ("b4j.example.vmfield");__ref.setField("_fileint",vmfile._fileint);
 //BA.debugLineNum = 8;BA.debugLine="Private lbl As VMLabel";
vmfile._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vmfile._lbl);
 //BA.debugLineNum = 9;BA.debugLine="Private hasHelp As Boolean";
vmfile._hashelp = RemoteObject.createImmutable(false);__ref.setField("_hashelp",vmfile._hashelp);
 //BA.debugLineNum = 10;BA.debugLine="Private ht As VMElement";
vmfile._ht = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_ht",vmfile._ht);
 //BA.debugLineNum = 11;BA.debugLine="Private hasError As Boolean";
vmfile._haserror = RemoteObject.createImmutable(false);__ref.setField("_haserror",vmfile._haserror);
 //BA.debugLineNum = 12;BA.debugLine="Private he As VMElement";
vmfile._he = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_he",vmfile._he);
 //BA.debugLineNum = 13;BA.debugLine="Private vmodel As String";
vmfile._vmodel = RemoteObject.createImmutable("");__ref.setField("_vmodel",vmfile._vmodel);
 //BA.debugLineNum = 14;BA.debugLine="Private module As Object";
vmfile._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmfile._module);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmfile","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _flist = RemoteObject.declareNull("Object");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 20;BA.debugLine="FileO.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 21;BA.debugLine="FileO.SetTag(\"md-file\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-file")));
 BA.debugLineNum = 22;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 23;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 24;BA.debugLine="FileInt.Initialize(v, ID,  $\"${ID}field\"$, module";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmfile.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("field")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 25;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmfile.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label")))));
 BA.debugLineNum = 26;BA.debugLine="hasHelp = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmfile.__c.getField(true,"False"));
 BA.debugLineNum = 27;BA.debugLine="hasError = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmfile.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="vmodel = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 29;BA.debugLine="Dim fList As Object";
Debug.JustUpdateDeviceLine();
_flist = RemoteObject.createNew ("Object");Debug.locals.put("fList", _flist);
 BA.debugLineNum = 30;BA.debugLine="SetOnChange(fList)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfile.class, "_setonchange" /*RemoteObject*/ ,(Object)(_flist));
 BA.debugLineNum = 31;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmfile","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 160;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmfile.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmfile","render", __ref);}
 BA.debugLineNum = 132;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmfile.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmfile","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 154;BA.debugLine="Sub SetAccent(b As Boolean) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 155;BA.debugLine="FileO.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmfile.__c.getField(true,"True")));
 BA.debugLineNum = 156;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setaccept(RemoteObject __ref,RemoteObject _accept) throws Exception{
try {
		Debug.PushSubsStack("SetAccept (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setaccept")) { return __ref.runUserSub(false, "vmfile","setaccept", __ref, _accept);}
Debug.locals.put("accept", _accept);
 BA.debugLineNum = 66;BA.debugLine="Sub SetAccept(accept As Object) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="FileO.SetAttr(CreateMap(\"accept\": accept))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfile.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("accept")),_accept}))));
 BA.debugLineNum = 68;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setacceptimages(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAcceptImages (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setacceptimages")) { return __ref.runUserSub(false, "vmfile","setacceptimages", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Sub SetAcceptImages As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="SetAttr(CreateMap(\"accept\":\"image/*\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfile.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfile.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("accept")),(RemoteObject.createImmutable("image/*"))}))));
 BA.debugLineNum = 47;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmfile","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 171;BA.debugLine="Sub SetAttr(attr As Map) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="FileO.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 173;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclearable(RemoteObject __ref,RemoteObject _varclearable) throws Exception{
try {
		Debug.PushSubsStack("SetClearable (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("setclearable")) { return __ref.runUserSub(false, "vmfile","setclearable", __ref, _varclearable);}
Debug.locals.put("varClearable", _varclearable);
 BA.debugLineNum = 221;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMFil";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 222;BA.debugLine="FileInt.SetClearable(varClearable)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setclearable" /*RemoteObject*/ ,(Object)(_varclearable));
 BA.debugLineNum = 223;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmfile","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 201;BA.debugLine="Sub SetDisabled(b As Boolean) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 202;BA.debugLine="FileO.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 203;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seterrortext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetErrorText (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("seterrortext")) { return __ref.runUserSub(false, "vmfile","seterrortext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 100;BA.debugLine="Sub SetErrorText(t As String) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="hasError = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmfile.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="he = FileO.SetErrorText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_he" /*RemoteObject*/ ,__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_t)));
 BA.debugLineNum = 103;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethelpertext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetHelperText (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("sethelpertext")) { return __ref.runUserSub(false, "vmfile","sethelpertext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 94;BA.debugLine="Sub SetHelperText(t As String) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="hasHelp = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmfile.__c.getField(true,"True"));
 BA.debugLineNum = 96;BA.debugLine="ht = FileO.SetHelperText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ht" /*RemoteObject*/ ,__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_t)));
 BA.debugLineNum = 97;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinline(RemoteObject __ref,RemoteObject _varinline) throws Exception{
try {
		Debug.PushSubsStack("SetInline (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("setinline")) { return __ref.runUserSub(false, "vmfile","setinline", __ref, _varinline);}
Debug.locals.put("varInline", _varinline);
 BA.debugLineNum = 215;BA.debugLine="Sub SetInline(varInline As Boolean) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="FileInt.SetInline(varInline)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setinline" /*RemoteObject*/ ,(Object)(_varinline));
 BA.debugLineNum = 217;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmfile","setlabel", __ref, _l);}
Debug.locals.put("l", _l);
 BA.debugLineNum = 76;BA.debugLine="Sub SetLabel(l As Object) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="lbl.SetText(l)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_l)));
 BA.debugLineNum = 78;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmultiple(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMultiple (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setmultiple")) { return __ref.runUserSub(false, "vmfile","setmultiple", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 61;BA.debugLine="Sub SetMultiple(b As Boolean) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="FileO.SetAttr(CreateMap(\":multiple\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfile.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":multiple")),(_b)}))));
 BA.debugLineNum = 63;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmfile","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 35;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="FileO.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 37;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonchange(RemoteObject __ref,RemoteObject _filelist) throws Exception{
try {
		Debug.PushSubsStack("SetOnChange (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setonchange")) { return __ref.runUserSub(false, "vmfile","setonchange", __ref, _filelist);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("fileList", _filelist);
 BA.debugLineNum = 51;BA.debugLine="private Sub SetOnChange(fileList As Object) As VMF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmfile.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_change")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 53;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmfile.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmfile.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 54;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmfile.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_filelist}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 55;BA.debugLine="SetAttr(CreateMap(\"v-on:md-change\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfile.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfile.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-change")),(_methodname)}))));
 BA.debugLineNum = 57;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 58;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmfile","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 190;BA.debugLine="Sub SetPadding(p As Object) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="FileO.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 192;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplaceholder(RemoteObject __ref,RemoteObject _varplaceholder) throws Exception{
try {
		Debug.PushSubsStack("SetPlaceholder (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("setplaceholder")) { return __ref.runUserSub(false, "vmfile","setplaceholder", __ref, _varplaceholder);}
Debug.locals.put("varPlaceholder", _varplaceholder);
 BA.debugLineNum = 196;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfile.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfile.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("placeholder")),_varplaceholder}))));
 BA.debugLineNum = 198;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmfile","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 149;BA.debugLine="Sub SetPrimary(b As Boolean) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="FileO.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmfile.__c.getField(true,"True")));
 BA.debugLineNum = 151;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setreadonly(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetReadOnly (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setreadonly")) { return __ref.runUserSub(false, "vmfile","setreadonly", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 71;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="FileO.SetAttr(CreateMap(\":readonly\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfile.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":readonly")),(_b)}))));
 BA.debugLineNum = 73;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrequired(RemoteObject __ref,RemoteObject _varrequired) throws Exception{
try {
		Debug.PushSubsStack("SetRequired (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "vmfile","setrequired", __ref, _varrequired);}
Debug.locals.put("varRequired", _varrequired);
 BA.debugLineNum = 208;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 209;BA.debugLine="FileO.SetRequired(varRequired)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setrequired" /*RemoteObject*/ ,(Object)(_varrequired));
 BA.debugLineNum = 210;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 211;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmfile","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 177;BA.debugLine="Sub SetStyle(sm As Map) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 178;BA.debugLine="FileO.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 179;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmfile","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 40;BA.debugLine="Sub SetTabIndex(ti As String) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="FileO.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmfile","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 144;BA.debugLine="Sub SetText(t As Object) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="FileO.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 146;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _xval) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmfile","setvalue", __ref, _xval);}
Debug.locals.put("xval", _xval);
 BA.debugLineNum = 113;BA.debugLine="Sub SetValue(xval As String) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="If vmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 115;BA.debugLine="Log($\"VMFile.SetValue ${ID} - v-model has not be";
Debug.JustUpdateDeviceLine();
vmfile.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMFile.SetValue "),vmfile.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(" - v-model has not been set!")))));
 };
 BA.debugLineNum = 117;BA.debugLine="vue.SetStateSingle(vmodel, xval)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_vmodel" /*RemoteObject*/ )),(Object)((_xval)));
 BA.debugLineNum = 118;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmfile","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 121;BA.debugLine="Sub SetVIf(vif As Object) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="FileInt.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 123;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmfile","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 106;BA.debugLine="Sub SetVModel(k As String) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="vmodel = k.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vmodel" /*RemoteObject*/ ,_k.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 108;BA.debugLine="vue.SetStateSingle(k,Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)(vmfile.__c.getField(false,"Null")));
 BA.debugLineNum = 109;BA.debugLine="FileO.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 110;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmfile","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 126;BA.debugLine="Sub SetVShow(vif As Object) As VMFile";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="FileInt.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmfile) ","vmfile",57,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmfile","tostring", __ref);}
 BA.debugLineNum = 82;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="lbl.Pop(FileInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_fileint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="FileO.Pop(FileInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fileo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_fileint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="If hasHelp Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hashelp" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="ht.Pop(FileInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ht" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_fileint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 88;BA.debugLine="If hasError Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_haserror" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 89;BA.debugLine="he.Pop(FileInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_he" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_fileint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 91;BA.debugLine="Return FileInt.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_fileint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="End Sub";
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