package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmgmap_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmgmap","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 312;BA.debugLine="Sub AddChild(child As VMElement) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 313;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 314;BA.debugLine="GMap.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 315;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 316;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmgmap","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 358;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 359;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 360;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 362;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmgmap","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 330;BA.debugLine="Sub AddClass(c As String) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 331;BA.debugLine="GMap.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 332;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmarker(RemoteObject __ref,RemoteObject _mid,RemoteObject _lat,RemoteObject _lng,RemoteObject _label,RemoteObject _info) throws Exception{
try {
		Debug.PushSubsStack("AddMarker (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("addmarker")) { return __ref.runUserSub(false, "vmgmap","addmarker", __ref, _mid, _lat, _lng, _label, _info);}
RemoteObject _point = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _marker = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("mID", _mid);
Debug.locals.put("lat", _lat);
Debug.locals.put("lng", _lng);
Debug.locals.put("label", _label);
Debug.locals.put("info", _info);
 BA.debugLineNum = 163;BA.debugLine="Sub AddMarker(mID As String, lat As Double, lng As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="mID = mID.tolowercase";
Debug.JustUpdateDeviceLine();
_mid = _mid.runMethod(true,"toLowerCase");Debug.locals.put("mID", _mid);
 BA.debugLineNum = 165;BA.debugLine="Dim point As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_point = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_point = vmgmap.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("point", _point);Debug.locals.put("point", _point);
 BA.debugLineNum = 166;BA.debugLine="Dim marker As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_marker = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_marker = vmgmap.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("marker", _marker);Debug.locals.put("marker", _marker);
 BA.debugLineNum = 168;BA.debugLine="lat = BANano.parseFloat(lat)";
Debug.JustUpdateDeviceLine();
_lat = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_lat)));Debug.locals.put("lat", _lat);
 BA.debugLineNum = 169;BA.debugLine="lng = BANano.parseFloat(lng)";
Debug.JustUpdateDeviceLine();
_lng = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_lng)));Debug.locals.put("lng", _lng);
 BA.debugLineNum = 171;BA.debugLine="point.Put(\"lat\", lat)";
Debug.JustUpdateDeviceLine();
_point.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lat"))),(Object)((_lat)));
 BA.debugLineNum = 172;BA.debugLine="point.put(\"lng\", lng)";
Debug.JustUpdateDeviceLine();
_point.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lng"))),(Object)((_lng)));
 BA.debugLineNum = 174;BA.debugLine="marker.put(\"position\", point)";
Debug.JustUpdateDeviceLine();
_marker.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)((_point.getObject())));
 BA.debugLineNum = 175;BA.debugLine="marker.put(\"id\", mID)";
Debug.JustUpdateDeviceLine();
_marker.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_mid)));
 BA.debugLineNum = 176;BA.debugLine="If info <> Null Then marker.Put(\"infoText\", info)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_info)) { 
_marker.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("infoText"))),(Object)((_info)));};
 BA.debugLineNum = 177;BA.debugLine="If label <> Null Then marker.put(\"label\", label)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_label)) { 
_marker.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("label"))),(Object)((_label)));};
 BA.debugLineNum = 178;BA.debugLine="points.add(marker)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_points" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_marker.getObject())));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public GMap As VMElement";
vmgmap._gmap = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_gmap",vmgmap._gmap);
 //BA.debugLineNum = 5;BA.debugLine="Public ID As String";
vmgmap._id = RemoteObject.createImmutable("");__ref.setField("_id",vmgmap._id);
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
vmgmap._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmgmap._vue);
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano  'ignore";
vmgmap._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmgmap._banano);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmgmap._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmgmap._module);
 //BA.debugLineNum = 9;BA.debugLine="Private markers As VMElement";
vmgmap._markers = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_markers",vmgmap._markers);
 //BA.debugLineNum = 10;BA.debugLine="Private options As Map";
vmgmap._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",vmgmap._options);
 //BA.debugLineNum = 11;BA.debugLine="Private points As List";
vmgmap._points = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_points",vmgmap._points);
 //BA.debugLineNum = 12;BA.debugLine="Private markerName As String";
vmgmap._markername = RemoteObject.createImmutable("");__ref.setField("_markername",vmgmap._markername);
 //BA.debugLineNum = 13;BA.debugLine="Private infoWindow As VMElement";
vmgmap._infowindow = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_infowindow",vmgmap._infowindow);
 //BA.debugLineNum = 14;BA.debugLine="Private iwOptions As String";
vmgmap._iwoptions = RemoteObject.createImmutable("");__ref.setField("_iwoptions",vmgmap._iwoptions);
 //BA.debugLineNum = 15;BA.debugLine="Private iwPosition As String";
vmgmap._iwposition = RemoteObject.createImmutable("");__ref.setField("_iwposition",vmgmap._iwposition);
 //BA.debugLineNum = 16;BA.debugLine="Private iwOpen As String";
vmgmap._iwopen = RemoteObject.createImmutable("");__ref.setField("_iwopen",vmgmap._iwopen);
 //BA.debugLineNum = 17;BA.debugLine="Private curMidx As String";
vmgmap._curmidx = RemoteObject.createImmutable("");__ref.setField("_curmidx",vmgmap._curmidx);
 //BA.debugLineNum = 18;BA.debugLine="Type GMarker(ID As String, lat As Double, lng As";
;
 //BA.debugLineNum = 19;BA.debugLine="Private kmlLayer As VMElement";
vmgmap._kmllayer = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_kmllayer",vmgmap._kmllayer);
 //BA.debugLineNum = 20;BA.debugLine="Private kmlName As String";
vmgmap._kmlname = RemoteObject.createImmutable("");__ref.setField("_kmlname",vmgmap._kmlname);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearmarkers(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearMarkers (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("clearmarkers")) { return __ref.runUserSub(false, "vmgmap","clearmarkers", __ref);}
 BA.debugLineNum = 153;BA.debugLine="Sub ClearMarkers As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="points.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_points" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _closeinfowindow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("closeInfoWindow (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("closeinfowindow")) { return __ref.runUserSub(false, "vmgmap","closeinfowindow", __ref);}
 BA.debugLineNum = 120;BA.debugLine="Private Sub closeInfoWindow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="vue.setstatesingle(iwOpen, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwopen" /*RemoteObject*/ )),(Object)((vmgmap.__c.getField(true,"False"))));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmgmap","hide", __ref);}
 BA.debugLineNum = 296;BA.debugLine="Sub Hide As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 297;BA.debugLine="GMap.Hide";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 298;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmgmap","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _woptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pixeloffset = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 26;BA.debugLine="GMap.Initialize(v, ID).SetTag(\"gmap-map\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("gmap-map")));
 BA.debugLineNum = 27;BA.debugLine="GMap.SetRef(ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setref" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="GMap.RemoveAttr(\":required\").RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required"))).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show"))).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 29;BA.debugLine="GMap.SetAttrSingle(\":options\", $\"${ID}options\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":options")),(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("options"))))));
 BA.debugLineNum = 30;BA.debugLine="vue.setstatesingle($\"${ID}options\"$, CreateMap())";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("options")))),(Object)((vmgmap.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})).getObject())));
 BA.debugLineNum = 31;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 32;BA.debugLine="markerName = $\"${ID}markers\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_markername" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("markers"))));
 BA.debugLineNum = 33;BA.debugLine="kmlName = $\"${ID}kmlayers\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_kmlname" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("kmlayers"))));
 BA.debugLineNum = 35;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 36;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="markers.initialize(vue,markerName).SetTag(\"gmap-m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_markername" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("gmap-marker"))).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":position")),(Object)((RemoteObject.createImmutable("m.position"))));
 BA.debugLineNum = 38;BA.debugLine="markers.RemoveAttr(\":required\").RemoveAttr(\"v-sho";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required"))).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show"))).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 39;BA.debugLine="markers.SetAttrSingle(\"v-if\", $\"${ID}markersvisib";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-if")),(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("markersvisible"))))));
 BA.debugLineNum = 40;BA.debugLine="markers.SetAttrSingle(\":clickable\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":clickable")),(Object)((vmgmap.__c.getField(true,"True"))));
 BA.debugLineNum = 41;BA.debugLine="markers.SetAttrSingle(\":draggable\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":draggable")),(Object)((vmgmap.__c.getField(true,"True"))));
 BA.debugLineNum = 42;BA.debugLine="markers.SetVFor(\"(m,i)\", markerName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("(m,i)")),(Object)(__ref.getField(true,"_markername" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="markers.SetAttrSingle(\":key\", \"m.id\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":key")),(Object)((RemoteObject.createImmutable("m.id"))));
 BA.debugLineNum = 44;BA.debugLine="markers.SetAttrSingle(\"@click\", \"toggleinfowindow";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("@click")),(Object)((RemoteObject.createImmutable("toggleinfowindow(m,i)"))));
 BA.debugLineNum = 45;BA.debugLine="SetEvents";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setevents" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="vue.SetStateSingle(markerName, Array())";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_markername" /*RemoteObject*/ )),(Object)((RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 47;BA.debugLine="points.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_points" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="iwPosition = $\"${ID}iwpos\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_iwposition" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("iwpos"))));
 BA.debugLineNum = 50;BA.debugLine="iwOptions = $\"${ID}opt\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_iwoptions" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("opt"))));
 BA.debugLineNum = 51;BA.debugLine="iwOpen = $\"${ID}open\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_iwopen" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("open"))));
 BA.debugLineNum = 52;BA.debugLine="curMidx = $\"${ID}midx\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_curmidx" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("midx"))));
 BA.debugLineNum = 54;BA.debugLine="vue.setstatesingle(iwPosition, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwposition" /*RemoteObject*/ )),(Object)(vmgmap.__c.getField(false,"Null")));
 BA.debugLineNum = 55;BA.debugLine="vue.setstatesingle(iwOpen, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwopen" /*RemoteObject*/ )),(Object)((vmgmap.__c.getField(true,"False"))));
 BA.debugLineNum = 56;BA.debugLine="vue.setstatesingle(curMidx, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_curmidx" /*RemoteObject*/ )),(Object)(vmgmap.__c.getField(false,"Null")));
 BA.debugLineNum = 58;BA.debugLine="infoWindow.Initialize(vue, $\"${ID}iw\"$).SetTag(\"g";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infowindow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("iw"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("gmap-info-window")));
 BA.debugLineNum = 59;BA.debugLine="infoWindow.RemoveAttr(\":required\").RemoveAttr(\"v-";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infowindow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required"))).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show"))).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 60;BA.debugLine="infoWindow.SetAttrSingle(\":options\", iwOptions)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infowindow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":options")),(Object)((__ref.getField(true,"_iwoptions" /*RemoteObject*/ ))));
 BA.debugLineNum = 61;BA.debugLine="infoWindow.setattrsingle(\":position\", iwPosition)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infowindow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":position")),(Object)((__ref.getField(true,"_iwposition" /*RemoteObject*/ ))));
 BA.debugLineNum = 62;BA.debugLine="infoWindow.SetAttrSingle(\":opened\", iwOpen)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infowindow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":opened")),(Object)((__ref.getField(true,"_iwopen" /*RemoteObject*/ ))));
 BA.debugLineNum = 63;BA.debugLine="infoWindow.SetAttrSingle(\"@closeclick\", \"closeinf";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infowindow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("@closeclick")),(Object)((RemoteObject.createImmutable("closeinfowindow"))));
 BA.debugLineNum = 65;BA.debugLine="Dim woptions As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_woptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_woptions = vmgmap.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("woptions", _woptions);Debug.locals.put("woptions", _woptions);
 BA.debugLineNum = 66;BA.debugLine="Dim pixelOffset As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_pixeloffset = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pixeloffset = vmgmap.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("pixelOffset", _pixeloffset);Debug.locals.put("pixelOffset", _pixeloffset);
 BA.debugLineNum = 67;BA.debugLine="pixelOffset.Put(\"width\", 0)";
Debug.JustUpdateDeviceLine();
_pixeloffset.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 68;BA.debugLine="pixelOffset.put(\"height\", -35)";
Debug.JustUpdateDeviceLine();
_pixeloffset.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 35)))));
 BA.debugLineNum = 69;BA.debugLine="woptions.Put(\"content\", \"\")";
Debug.JustUpdateDeviceLine();
_woptions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("content"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 70;BA.debugLine="woptions.put(\"pixelOffset\", pixelOffset)";
Debug.JustUpdateDeviceLine();
_woptions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pixelOffset"))),(Object)((_pixeloffset.getObject())));
 BA.debugLineNum = 71;BA.debugLine="vue.SetStateSingle(iwOptions, woptions)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwoptions" /*RemoteObject*/ )),(Object)((_woptions.getObject())));
 BA.debugLineNum = 74;BA.debugLine="kmlLayer.Initialize(vue, kmlName).SetTag(\"google-";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kmllayer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_kmlname" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("google-kml-layer")));
 BA.debugLineNum = 75;BA.debugLine="kmlLayer.RemoveAttr(\":required\").RemoveAttr(\"v-sh";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kmllayer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required"))).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show"))).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 76;BA.debugLine="kmlLayer.SetAttrSingle(\"v-if\", $\"${ID}kmlvisible\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kmllayer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-if")),(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("kmlvisible"))))));
 BA.debugLineNum = 77;BA.debugLine="vue.setstatesingle(kmlName, Array())";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_kmlname" /*RemoteObject*/ )),(Object)((RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 78;BA.debugLine="kmlLayer.SetAttrSingle(\":clickable\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kmllayer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":clickable")),(Object)((vmgmap.__c.getField(true,"True"))));
 BA.debugLineNum = 79;BA.debugLine="kmlLayer.SetVFor(\"lyr\", kmlName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kmllayer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lyr")),(Object)(__ref.getField(true,"_kmlname" /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="kmlLayer.SetAttrSingle(\":url\", \"lyr.url\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kmllayer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":url")),(Object)((RemoteObject.createImmutable("lyr.url"))));
 BA.debugLineNum = 82;BA.debugLine="ShowKML(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_showkml" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"False")));
 BA.debugLineNum = 83;BA.debugLine="ShowMarkers(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_showmarkers" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"True")));
 BA.debugLineNum = 86;BA.debugLine="SetFullscreenControl(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setfullscreencontrol" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"True")));
 BA.debugLineNum = 87;BA.debugLine="SetDisableDefaultUi(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setdisabledefaultui" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"False")));
 BA.debugLineNum = 88;BA.debugLine="SetMapTypeControl(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setmaptypecontrol" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"True")));
 BA.debugLineNum = 89;BA.debugLine="SetRotateControl(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setrotatecontrol" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"True")));
 BA.debugLineNum = 90;BA.debugLine="SetStreetViewControl(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setstreetviewcontrol" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"True")));
 BA.debugLineNum = 91;BA.debugLine="SetScaleControl(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setscalecontrol" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"True")));
 BA.debugLineNum = 92;BA.debugLine="SetZoomControl(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setzoomcontrol" /*RemoteObject*/ ,(Object)(vmgmap.__c.getField(true,"True")));
 BA.debugLineNum = 93;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmgmap","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 325;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 326;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmgmap.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 327;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Refresh (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmgmap","refresh", __ref);}
 BA.debugLineNum = 159;BA.debugLine="Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="vue.SetStateSingle(markerName, points)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_markername" /*RemoteObject*/ )),(Object)((__ref.getField(false,"_points" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmgmap","render", __ref);}
 BA.debugLineNum = 307;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmgmap.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmgmap","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 336;BA.debugLine="Sub SetAttr(attr As Map) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="GMap.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 338;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrsingle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetAttrSingle (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("setattrsingle")) { return __ref.runUserSub(false, "vmgmap","setattrsingle", __ref, _prop, _val);}
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 341;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 342;BA.debugLine="GMap.SetAttrSingle(prop, val)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(_prop),(Object)(_val));
 BA.debugLineNum = 343;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcenter(RemoteObject __ref,RemoteObject _lat,RemoteObject _lng) throws Exception{
try {
		Debug.PushSubsStack("SetCenter (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("setcenter")) { return __ref.runUserSub(false, "vmgmap","setcenter", __ref, _lat, _lng);}
RemoteObject _pp = RemoteObject.createImmutable("");
RemoteObject _point = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("lat", _lat);
Debug.locals.put("lng", _lng);
 BA.debugLineNum = 216;BA.debugLine="Sub SetCenter(lat As Double, lng As Double) As VMG";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="lat = BANano.parseFloat(lat)";
Debug.JustUpdateDeviceLine();
_lat = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_lat)));Debug.locals.put("lat", _lat);
 BA.debugLineNum = 218;BA.debugLine="lng = BANano.parseFloat(lng)";
Debug.JustUpdateDeviceLine();
_lng = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_lng)));Debug.locals.put("lng", _lng);
 BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${ID}center\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("center")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 221;BA.debugLine="Dim point As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_point = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_point = vmgmap.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("point", _point);Debug.locals.put("point", _point);
 BA.debugLineNum = 222;BA.debugLine="point.put(\"lat\", lat)";
Debug.JustUpdateDeviceLine();
_point.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lat"))),(Object)((_lat)));
 BA.debugLineNum = 223;BA.debugLine="point.put(\"lng\", lng)";
Debug.JustUpdateDeviceLine();
_point.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lng"))),(Object)((_lng)));
 BA.debugLineNum = 224;BA.debugLine="vue.SetStateSingle(pp, point)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_point.getObject())));
 BA.debugLineNum = 225;BA.debugLine="GMap.SetAttrSingle(\":center\", pp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":center")),(Object)((_pp)));
 BA.debugLineNum = 226;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabledefaultui(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisableDefaultUi (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setdisabledefaultui")) { return __ref.runUserSub(false, "vmgmap","setdisabledefaultui", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 206;BA.debugLine="Sub SetDisableDefaultUi(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="options.put(\"disableDefaultUi\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("disableDefaultUi"))),(Object)((_b)));
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
public static RemoteObject  _setevents(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetEvents (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("setevents")) { return __ref.runUserSub(false, "vmgmap","setevents", __ref);}
RemoteObject _m = RemoteObject.declareNull("Object");
RemoteObject _i = RemoteObject.declareNull("Object");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
 BA.debugLineNum = 142;BA.debugLine="private Sub SetEvents";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="Dim m, i As Object";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("Object");Debug.locals.put("m", _m);
_i = RemoteObject.createNew ("Object");Debug.locals.put("i", _i);
 BA.debugLineNum = 144;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"tog";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref),(Object)(BA.ObjectToString("toggleInfoWindow")),(Object)(vmgmap.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_m,_i}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 145;BA.debugLine="vue.SetCallBack(\"toggleInfoWindow\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(BA.ObjectToString("toggleInfoWindow")),(Object)(_cb));
 BA.debugLineNum = 147;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 148;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"clo";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref),(Object)(BA.ObjectToString("closeInfoWindow")),(Object)(vmgmap.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 149;BA.debugLine="vue.SetCallBack(\"closeInfoWindow\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(BA.ObjectToString("closeInfoWindow")),(Object)(_cb));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfullscreencontrol(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetFullscreenControl (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("setfullscreencontrol")) { return __ref.runUserSub(false, "vmgmap","setfullscreencontrol", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 211;BA.debugLine="Sub SetFullscreenControl(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 212;BA.debugLine="options.put(\"fullscreenControl\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fullscreenControl"))),(Object)((_b)));
 BA.debugLineNum = 213;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 214;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetHeight (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmgmap","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 237;BA.debugLine="Sub SetHeight(h As String) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="SetStyleSingle(\"height\", h)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setstylesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("height")),(Object)((_h)));
 BA.debugLineNum = 239;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setkmlurl(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SetKMLURL (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setkmlurl")) { return __ref.runUserSub(false, "vmgmap","setkmlurl", __ref, _url);}
RemoteObject _kmlold = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _kml = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("url", _url);
 BA.debugLineNum = 101;BA.debugLine="Sub SetKMLURL(url As String) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="Dim kmlold As List";
Debug.JustUpdateDeviceLine();
_kmlold = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("kmlold", _kmlold);
 BA.debugLineNum = 103;BA.debugLine="Dim kml As List = vue.GetState(kmlName, kmlold)";
Debug.JustUpdateDeviceLine();
_kml = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_kml.setObject(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_kmlname" /*RemoteObject*/ )),(Object)((_kmlold.getObject()))));Debug.locals.put("kml", _kml);
 BA.debugLineNum = 104;BA.debugLine="Dim nl As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nl = vmgmap.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nl", _nl);Debug.locals.put("nl", _nl);
 BA.debugLineNum = 105;BA.debugLine="nl.put(\"url\", url)";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("url"))),(Object)((_url)));
 BA.debugLineNum = 106;BA.debugLine="kml.add(nl)";
Debug.JustUpdateDeviceLine();
_kml.runVoidMethod ("Add",(Object)((_nl.getObject())));
 BA.debugLineNum = 107;BA.debugLine="vue.setstatesingle(kmlName, kml)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_kmlname" /*RemoteObject*/ )),(Object)((_kml.getObject())));
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
public static RemoteObject  _setmaptype(RemoteObject __ref,RemoteObject _maptype) throws Exception{
try {
		Debug.PushSubsStack("SetMapType (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("setmaptype")) { return __ref.runUserSub(false, "vmgmap","setmaptype", __ref, _maptype);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("maptype", _maptype);
 BA.debugLineNum = 247;BA.debugLine="Sub SetMapType(maptype As String) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 248;BA.debugLine="Dim pp As String = $\"${ID}maptype\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("maptype")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 249;BA.debugLine="vue.setstatesingle(pp, maptype)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_maptype)));
 BA.debugLineNum = 250;BA.debugLine="SetAttrSingle(\":map-type-id\", pp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":map-type-id")),(Object)((_pp)));
 BA.debugLineNum = 251;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaptypecontrol(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMapTypeControl (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("setmaptypecontrol")) { return __ref.runUserSub(false, "vmgmap","setmaptypecontrol", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 201;BA.debugLine="Sub SetMapTypeControl(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 202;BA.debugLine="options.put(\"mapTypeControl\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mapTypeControl"))),(Object)((_b)));
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
public static RemoteObject  _setmaptypehybrid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetMapTypeHybrid (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("setmaptypehybrid")) { return __ref.runUserSub(false, "vmgmap","setmaptypehybrid", __ref);}
 BA.debugLineNum = 265;BA.debugLine="Sub SetMapTypeHybrid As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 266;BA.debugLine="SetMapType(\"hybrid\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setmaptype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("hybrid")));
 BA.debugLineNum = 267;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaptyperoadmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetMapTypeRoadMap (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,254);
if (RapidSub.canDelegate("setmaptyperoadmap")) { return __ref.runUserSub(false, "vmgmap","setmaptyperoadmap", __ref);}
 BA.debugLineNum = 254;BA.debugLine="Sub SetMapTypeRoadMap As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 255;BA.debugLine="SetMapType(\"roadmap\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setmaptype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("roadmap")));
 BA.debugLineNum = 256;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaptypesatellite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetMapTypeSatellite (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("setmaptypesatellite")) { return __ref.runUserSub(false, "vmgmap","setmaptypesatellite", __ref);}
 BA.debugLineNum = 259;BA.debugLine="Sub SetMapTypeSatellite As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 260;BA.debugLine="SetMapType(\"satellite\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setmaptype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("satellite")));
 BA.debugLineNum = 261;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaptypeterrain(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetMapTypeTerrain (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("setmaptypeterrain")) { return __ref.runUserSub(false, "vmgmap","setmaptypeterrain", __ref);}
 BA.debugLineNum = 270;BA.debugLine="Sub SetMapTypeTerrain As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 271;BA.debugLine="SetMapType(\"terrain\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setmaptype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("terrain")));
 BA.debugLineNum = 272;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 273;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmgmap","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 365;BA.debugLine="Sub SetPadding(p As Object) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 366;BA.debugLine="GMap.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 367;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrotatecontrol(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRotateControl (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("setrotatecontrol")) { return __ref.runUserSub(false, "vmgmap","setrotatecontrol", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 196;BA.debugLine="Sub SetRotateControl(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="options.put(\"rotateControl\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("rotateControl"))),(Object)((_b)));
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
public static RemoteObject  _setscalecontrol(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetScaleControl (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("setscalecontrol")) { return __ref.runUserSub(false, "vmgmap","setscalecontrol", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 186;BA.debugLine="Sub SetScaleControl(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="options.put(\"scaleControl\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("scaleControl"))),(Object)((_b)));
 BA.debugLineNum = 188;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstreetviewcontrol(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStreetViewControl (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("setstreetviewcontrol")) { return __ref.runUserSub(false, "vmgmap","setstreetviewcontrol", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 191;BA.debugLine="Sub SetStreetViewControl(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="options.put(\"streetViewControl\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("streetViewControl"))),(Object)((_b)));
 BA.debugLineNum = 193;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 194;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmgmap","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 347;BA.debugLine="Sub SetStyle(sm As Map) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 348;BA.debugLine="GMap.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 349;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylesingle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetStyleSingle (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("setstylesingle")) { return __ref.runUserSub(false, "vmgmap","setstylesingle", __ref, _prop, _val);}
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 352;BA.debugLine="Sub SetStyleSingle(prop As String, val As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 353;BA.debugLine="GMap.setstylesingle(prop, val)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstylesingle" /*RemoteObject*/ ,(Object)(_prop),(Object)(_val));
 BA.debugLineNum = 354;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 355;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmgmap","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 319;BA.debugLine="Sub SetText(t As Object) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="GMap.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 321;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 322;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmgmap","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 286;BA.debugLine="Sub SetVIf(vif As Object) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 287;BA.debugLine="GMap.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 288;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmgmap","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 291;BA.debugLine="Sub SetVShow(vif As Object) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 292;BA.debugLine="GMap.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 293;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmgmap","setwidth", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 242;BA.debugLine="Sub SetWidth(h As String) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="SetStyleSingle(\"width\", h)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setstylesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("width")),(Object)((_h)));
 BA.debugLineNum = 244;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzoom(RemoteObject __ref,RemoteObject _z) throws Exception{
try {
		Debug.PushSubsStack("SetZoom (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("setzoom")) { return __ref.runUserSub(false, "vmgmap","setzoom", __ref, _z);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("z", _z);
 BA.debugLineNum = 229;BA.debugLine="Sub SetZoom(z As Int) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 230;BA.debugLine="z = BANano.parseInt(z)";
Debug.JustUpdateDeviceLine();
_z = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_z)));Debug.locals.put("z", _z);
 BA.debugLineNum = 231;BA.debugLine="Dim pp As String = $\"${ID}zoom\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("zoom")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 232;BA.debugLine="vue.SetStateSingle(pp, z)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_z)));
 BA.debugLineNum = 233;BA.debugLine="SetAttrSingle(\":zoom\", pp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgmap.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":zoom")),(Object)((_pp)));
 BA.debugLineNum = 234;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzoomcontrol(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetZoomControl (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("setzoomcontrol")) { return __ref.runUserSub(false, "vmgmap","setzoomcontrol", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 181;BA.debugLine="Sub SetZoomControl(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 182;BA.debugLine="options.put(\"zoomControl\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("zoomControl"))),(Object)((_b)));
 BA.debugLineNum = 183;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmgmap","show", __ref);}
 BA.debugLineNum = 301;BA.debugLine="Sub Show As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="GMap.Show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 303;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showinfowindow(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("ShowInfoWindow (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("showinfowindow")) { return __ref.runUserSub(false, "vmgmap","showinfowindow", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 96;BA.debugLine="Sub ShowInfoWindow(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="vue.SetStateSingle(iwOpen, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwopen" /*RemoteObject*/ )),(Object)((_b)));
 BA.debugLineNum = 98;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showkml(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("ShowKML (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("showkml")) { return __ref.runUserSub(false, "vmgmap","showkml", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 115;BA.debugLine="Sub ShowKML(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="vue.setstatesingle($\"${ID}kmlvisible\"$, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("kmlvisible")))),(Object)((_b)));
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
public static RemoteObject  _showmarkers(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("ShowMarkers (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("showmarkers")) { return __ref.runUserSub(false, "vmgmap","showmarkers", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 110;BA.debugLine="Sub ShowMarkers(b As Boolean) As VMGMap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="vue.setstatesingle($\"${ID}markersvisible\"$, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("markersvisible")))),(Object)((_b)));
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
public static RemoteObject  _toggleinfowindow(RemoteObject __ref,RemoteObject _m,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("toggleInfoWindow (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("toggleinfowindow")) { return __ref.runUserSub(false, "vmgmap","toggleinfowindow", __ref, _m, _i);}
RemoteObject _mo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _infowindowpos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mcontent = RemoteObject.createImmutable("");
RemoteObject _infooptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cidx = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
Debug.locals.put("i", _i);
 BA.debugLineNum = 124;BA.debugLine="private Sub toggleInfoWindow(m As Map, i As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="Dim mo As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_mo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mo = vmgmap.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("mo", _mo);Debug.locals.put("mo", _mo);
 BA.debugLineNum = 126;BA.debugLine="Dim infoWindowPos As Map = m.Get(\"position\")";
Debug.JustUpdateDeviceLine();
_infowindowpos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_infowindowpos.setObject(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("position")))));Debug.locals.put("infoWindowPos", _infowindowpos);
 BA.debugLineNum = 127;BA.debugLine="Dim mcontent As String = m.Get(\"infoText\")";
Debug.JustUpdateDeviceLine();
_mcontent = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("infoText")))));Debug.locals.put("mcontent", _mcontent);Debug.locals.put("mcontent", _mcontent);
 BA.debugLineNum = 128;BA.debugLine="Dim infoOptions As Map = vue.GetState(iwOptions,";
Debug.JustUpdateDeviceLine();
_infooptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_infooptions.setObject(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwoptions" /*RemoteObject*/ )),(Object)((_mo.getObject()))));Debug.locals.put("infoOptions", _infooptions);
 BA.debugLineNum = 129;BA.debugLine="infoOptions.Put(\"content\", mcontent)";
Debug.JustUpdateDeviceLine();
_infooptions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("content"))),(Object)((_mcontent)));
 BA.debugLineNum = 130;BA.debugLine="vue.setstatesingle(iwPosition, infoWindowPos)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwposition" /*RemoteObject*/ )),(Object)((_infowindowpos.getObject())));
 BA.debugLineNum = 131;BA.debugLine="vue.setstatesingle(iwOptions, infoOptions)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwoptions" /*RemoteObject*/ )),(Object)((_infooptions.getObject())));
 BA.debugLineNum = 133;BA.debugLine="Dim cIdx As Object = vue.getstate(curMidx, Null)";
Debug.JustUpdateDeviceLine();
_cidx = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_curmidx" /*RemoteObject*/ )),(Object)(vmgmap.__c.getField(false,"Null")));Debug.locals.put("cIdx", _cidx);Debug.locals.put("cIdx", _cidx);
 BA.debugLineNum = 134;BA.debugLine="If cIdx = i Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cidx,_i)) { 
 BA.debugLineNum = 135;BA.debugLine="vue.ToggleState(iwOpen)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_togglestate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwopen" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 137;BA.debugLine="vue.SetStateSingle(iwOpen, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iwopen" /*RemoteObject*/ )),(Object)((vmgmap.__c.getField(true,"True"))));
 BA.debugLineNum = 138;BA.debugLine="vue.setstatesingle(curMidx, i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_curmidx" /*RemoteObject*/ )),(Object)(_i));
 };
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmgmap) ","vmgmap",61,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmgmap","tostring", __ref);}
 BA.debugLineNum = 277;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="vue.SetStateSingle($\"${ID}options\"$, options)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgmap.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("options")))),(Object)((__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 279;BA.debugLine="vue.SetStateSingle(markerName, points)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_markername" /*RemoteObject*/ )),(Object)((__ref.getField(false,"_points" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 280;BA.debugLine="infoWindow.Pop(GMap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infowindow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gmap" /*RemoteObject*/ )));
 BA.debugLineNum = 281;BA.debugLine="kmlLayer.pop(GMap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_kmllayer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gmap" /*RemoteObject*/ )));
 BA.debugLineNum = 282;BA.debugLine="markers.pop(GMap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_markers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_gmap" /*RemoteObject*/ )));
 BA.debugLineNum = 283;BA.debugLine="Return GMap.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_gmap" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 284;BA.debugLine="End Sub";
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