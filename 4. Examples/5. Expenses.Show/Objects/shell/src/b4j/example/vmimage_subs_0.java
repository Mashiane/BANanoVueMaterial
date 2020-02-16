package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmimage_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmimage","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 126;BA.debugLine="Sub AddClass(c As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Image.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Image As VMElement";
vmimage._image = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_image",vmimage._image);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmimage._id = RemoteObject.createImmutable("");__ref.setField("_id",vmimage._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmimage._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmimage._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private hasTT As Boolean";
vmimage._hastt = RemoteObject.createImmutable(false);__ref.setField("_hastt",vmimage._hastt);
 //BA.debugLineNum = 7;BA.debugLine="Private tt As VMTooltip";
vmimage._tt = RemoteObject.createNew ("b4j.example.vmtooltip");__ref.setField("_tt",vmimage._tt);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmimage._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmimage._module);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmimage","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 14;BA.debugLine="Image.Initialize(vue, ID).SetTag(\"img\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 15;BA.debugLine="hasTT = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastt" /*RemoteObject*/ ,vmimage.__c.getField(true,"False"));
 BA.debugLineNum = 16;BA.debugLine="Image.SetOnClick(eventHandler, $\"${ID}_click\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(_eventhandler),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
 BA.debugLineNum = 17;BA.debugLine="Image.SetOnTouchStart(module, $\"${ID}_touchstart\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setontouchstart" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_touchstart")))));
 BA.debugLineNum = 18;BA.debugLine="Image.SetOnDragOver(module, $\"${ID}_dragover\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setondragover" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_dragover")))));
 BA.debugLineNum = 19;BA.debugLine="Image.setondragstart(module, $\"${ID}_dragstart\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setondragstart" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_dragstart")))));
 BA.debugLineNum = 20;BA.debugLine="Image.SetOnDragEnd(module, $\"${ID}_dragend\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setondragend" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_dragend")))));
 BA.debugLineNum = 21;BA.debugLine="Image.setondragenter(module, $\"${ID}_dragenter\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setondragenter" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_dragenter")))));
 BA.debugLineNum = 22;BA.debugLine="Image.SetOnDrop(module, $\"${ID}_drop\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setondrop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_drop")))));
 BA.debugLineNum = 23;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmimage","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 177;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 178;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmimage.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmimage","render", __ref);}
 BA.debugLineNum = 173;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 174;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmimage.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalt(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetAlt (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("setalt")) { return __ref.runUserSub(false, "vmimage","setalt", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 131;BA.debugLine="Sub SetAlt(a As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Image.SetAlt(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setalt" /*RemoteObject*/ ,(Object)(_a));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmimage","setattr", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 90;BA.debugLine="Sub SetAttr(m As Map) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Image.SetAttr(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 92;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _width,RemoteObject _color,RemoteObject _bstyle) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vmimage","setborder", __ref, _width, _color, _bstyle);}
Debug.locals.put("width", _width);
Debug.locals.put("color", _color);
Debug.locals.put("bstyle", _bstyle);
 BA.debugLineNum = 80;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Image.SetBorder(width, color, bstyle)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setborder" /*RemoteObject*/ ,(Object)(_width),(Object)(_color),(Object)(_bstyle));
 BA.debugLineNum = 82;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcursormove(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCursorMove (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setcursormove")) { return __ref.runUserSub(false, "vmimage","setcursormove", __ref);}
 BA.debugLineNum = 105;BA.debugLine="Sub SetCursorMove As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Image.SetCursorMove";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setcursormove" /*RemoteObject*/ );
 BA.debugLineNum = 107;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcursorpointer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCursorPointer (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("setcursorpointer")) { return __ref.runUserSub(false, "vmimage","setcursorpointer", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Sub SetCursorPointer As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="Image.SetCursorPointer";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setcursorpointer" /*RemoteObject*/ );
 BA.debugLineNum = 112;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdraggable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDraggable (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setdraggable")) { return __ref.runUserSub(false, "vmimage","setdraggable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 60;BA.debugLine="Sub SetDraggable(b As Boolean) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="Image.SetDraggable(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdraggable" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 62;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdroppable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDroppable (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setdroppable")) { return __ref.runUserSub(false, "vmimage","setdroppable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 65;BA.debugLine="Sub SetDroppable(b As Boolean) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Image.SetDroppable(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdroppable" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 67;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmimage","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 75;BA.debugLine="Sub SetHeight(h As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="Image.SetHeight(h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setheight" /*RemoteObject*/ ,(Object)(_h));
 BA.debugLineNum = 77;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmarginall(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetMarginAll (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setmarginall")) { return __ref.runUserSub(false, "vmimage","setmarginall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="Sub SetMarginAll(p As Object) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Image.SetMarginAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmarginall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 87;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaddingall(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPaddingAll (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("setpaddingall")) { return __ref.runUserSub(false, "vmimage","setpaddingall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 100;BA.debugLine="Sub SetPaddingAll(p As Object) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="Image.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 102;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setripple(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRipple (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setripple")) { return __ref.runUserSub(false, "vmimage","setripple", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 95;BA.debugLine="Sub SetRipple(b As Boolean) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Image.SetRipple(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setripple" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmimage","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 120;BA.debugLine="Sub SetStyle(m As Map) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="Image.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 122;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmimage","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 115;BA.debugLine="Sub SetText(t As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Image.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 117;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settooltipbottom(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetToolTipBottom (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("settooltipbottom")) { return __ref.runUserSub(false, "vmimage","settooltipbottom", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 38;BA.debugLine="Sub SetToolTipBottom(Text As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtooltip.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("tlt"))))).runClassMethod (b4j.example.vmtooltip.class, "_settext" /*RemoteObject*/ ,(Object)((_text))).runClassMethod (b4j.example.vmtooltip.class, "_setdirectionbottom" /*RemoteObject*/ ,(Object)(vmimage.__c.getField(true,"True")));
 BA.debugLineNum = 40;BA.debugLine="hasTT = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastt" /*RemoteObject*/ ,vmimage.__c.getField(true,"True"));
 BA.debugLineNum = 41;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settooltipleft(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetToolTipLeft (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("settooltipleft")) { return __ref.runUserSub(false, "vmimage","settooltipleft", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 44;BA.debugLine="Sub SetToolTipLeft(Text As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="tt.Initialize(vue,$\"${id}tlt\"$).SetText(Text).Set";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtooltip.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("tlt"))))).runClassMethod (b4j.example.vmtooltip.class, "_settext" /*RemoteObject*/ ,(Object)((_text))).runClassMethod (b4j.example.vmtooltip.class, "_setdirectionleft" /*RemoteObject*/ ,(Object)(vmimage.__c.getField(true,"True")));
 BA.debugLineNum = 46;BA.debugLine="hasTT = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastt" /*RemoteObject*/ ,vmimage.__c.getField(true,"True"));
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
public static RemoteObject  _settooltipright(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetToolTipRight (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("settooltipright")) { return __ref.runUserSub(false, "vmimage","settooltipright", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 32;BA.debugLine="Sub SetToolTipRight(Text As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtooltip.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("tlt"))))).runClassMethod (b4j.example.vmtooltip.class, "_settext" /*RemoteObject*/ ,(Object)((_text))).runClassMethod (b4j.example.vmtooltip.class, "_setdirectionright" /*RemoteObject*/ ,(Object)(vmimage.__c.getField(true,"True")));
 BA.debugLineNum = 34;BA.debugLine="hasTT = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastt" /*RemoteObject*/ ,vmimage.__c.getField(true,"True"));
 BA.debugLineNum = 35;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settooltiptop(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetToolTipTop (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("settooltiptop")) { return __ref.runUserSub(false, "vmimage","settooltiptop", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 26;BA.debugLine="Sub SetToolTipTop(Text As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtooltip.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("tlt"))))).runClassMethod (b4j.example.vmtooltip.class, "_settext" /*RemoteObject*/ ,(Object)((_text))).runClassMethod (b4j.example.vmtooltip.class, "_setdirectiontop" /*RemoteObject*/ ,(Object)(vmimage.__c.getField(true,"True")));
 BA.debugLineNum = 28;BA.debugLine="hasTT = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastt" /*RemoteObject*/ ,vmimage.__c.getField(true,"True"));
 BA.debugLineNum = 29;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _valuename,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmimage","setvalue", __ref, _valuename, _bind);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("valueName", _valuename);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 142;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 144;BA.debugLine="valueName = valueName.tolowercase";
Debug.JustUpdateDeviceLine();
_valuename = _valuename.runMethod(true,"toLowerCase");Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 145;BA.debugLine="Image.SetSRC($\"${ID}src\"$,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setsrc" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("src")))),(Object)(vmimage.__c.getField(true,"True")));
 BA.debugLineNum = 146;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmimage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 147;BA.debugLine="opt.Put($\"${ID}src\"$, valueName)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("src"))))),(Object)((_valuename)));
 BA.debugLineNum = 148;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 }else {
 BA.debugLineNum = 150;BA.debugLine="Image.SetSRC(valueName, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setsrc" /*RemoteObject*/ ,(Object)(_valuename),(Object)(vmimage.__c.getField(true,"False")));
 BA.debugLineNum = 151;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmimage.class, "_setattr" /*RemoteObject*/ ,(Object)(vmimage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("value")),(_valuename)}))));
 };
 BA.debugLineNum = 153;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setverticalalignmiddle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetVerticalAlignMiddle (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("setverticalalignmiddle")) { return __ref.runUserSub(false, "vmimage","setverticalalignmiddle", __ref);}
 BA.debugLineNum = 136;BA.debugLine="Sub SetVerticalAlignMiddle As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="Image.SetVerticalAlignMiddle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setverticalalignmiddle" /*RemoteObject*/ );
 BA.debugLineNum = 138;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmimage","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 55;BA.debugLine="Sub SetVIf(vif As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Image.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 57;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmimage","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 156;BA.debugLine="Sub SetVModel(k As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="Image.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 158;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 159;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmimage","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 50;BA.debugLine="Sub SetVShow(vif As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Image.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 52;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetWidth (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmimage","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 70;BA.debugLine="Sub SetWidth(w As String) As VMImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="Image.SetWidth(w)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setwidth" /*RemoteObject*/ ,(Object)(_w));
 BA.debugLineNum = 72;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmimage) ","vmimage",64,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmimage","tostring", __ref);}
RemoteObject _div = RemoteObject.declareNull("b4j.example.vmelement");
 BA.debugLineNum = 161;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 162;BA.debugLine="If hasTT Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hastt" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 163;BA.debugLine="Dim div As VMElement";
Debug.JustUpdateDeviceLine();
_div = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("div", _div);
 BA.debugLineNum = 164;BA.debugLine="div.Initialize(vue,$\"${ID}parent\"$)";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmimage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("parent")))));
 BA.debugLineNum = 165;BA.debugLine="div.SetText(Image.ToString)";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 166;BA.debugLine="div.SetText(tt.ToString)";
Debug.JustUpdateDeviceLine();
_div.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtooltip.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 167;BA.debugLine="Return div.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _div.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 169;BA.debugLine="Return Image.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_image" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 };
 BA.debugLineNum = 171;BA.debugLine="End Sub";
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