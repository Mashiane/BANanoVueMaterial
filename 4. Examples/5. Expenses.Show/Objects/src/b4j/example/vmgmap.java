package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmgmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmgmap", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmgmap.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _gmarker{
public boolean IsInitialized;
public String ID;
public double lat;
public double lng;
public String label;
public String infoText;
public void Initialize() {
IsInitialized = true;
ID = "";
lat = 0;
lng = 0;
label = "";
infoText = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _gmap = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public b4j.example.vmelement _markers = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public anywheresoftware.b4a.objects.collections.List _points = null;
public String _markername = "";
public b4j.example.vmelement _infowindow = null;
public String _iwoptions = "";
public String _iwposition = "";
public String _iwopen = "";
public String _curmidx = "";
public b4j.example.vmelement _kmllayer = null;
public String _kmlname = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmgmap  _initialize(b4j.example.vmgmap __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
anywheresoftware.b4a.objects.collections.Map _woptions = null;
anywheresoftware.b4a.objects.collections.Map _pixeloffset = null;
RDebugUtils.currentLine=134610944;
 //BA.debugLineNum = 134610944;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=134610945;
 //BA.debugLineNum = 134610945;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=134610946;
 //BA.debugLineNum = 134610946;BA.debugLine="GMap.Initialize(v, ID).SetTag(\"gmap-map\")";
__ref._gmap /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"gmap-map");
RDebugUtils.currentLine=134610947;
 //BA.debugLineNum = 134610947;BA.debugLine="GMap.SetRef(ID)";
__ref._gmap /*b4j.example.vmelement*/ ._setref /*b4j.example.vmelement*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=134610948;
 //BA.debugLineNum = 134610948;BA.debugLine="GMap.RemoveAttr(\":required\").RemoveAttr(\"v-show\")";
__ref._gmap /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required")._removeattr /*b4j.example.vmelement*/ (null,"v-show")._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=134610949;
 //BA.debugLineNum = 134610949;BA.debugLine="GMap.SetAttrSingle(\":options\", $\"${ID}options\"$)";
__ref._gmap /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":options",(Object)((""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"options")));
RDebugUtils.currentLine=134610950;
 //BA.debugLineNum = 134610950;BA.debugLine="vue.setstatesingle($\"${ID}options\"$, CreateMap())";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"options"),(Object)(__c.createMap(new Object[] {}).getObject()));
RDebugUtils.currentLine=134610951;
 //BA.debugLineNum = 134610951;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=134610952;
 //BA.debugLineNum = 134610952;BA.debugLine="markerName = $\"${ID}markers\"$";
__ref._markername /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"markers");
RDebugUtils.currentLine=134610953;
 //BA.debugLineNum = 134610953;BA.debugLine="kmlName = $\"${ID}kmlayers\"$";
__ref._kmlname /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"kmlayers");
RDebugUtils.currentLine=134610955;
 //BA.debugLineNum = 134610955;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=134610956;
 //BA.debugLineNum = 134610956;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=134610957;
 //BA.debugLineNum = 134610957;BA.debugLine="markers.initialize(vue,markerName).SetTag(\"gmap-m";
__ref._markers /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._markername /*String*/ )._settag /*b4j.example.vmelement*/ (null,"gmap-marker")._setattrsingle /*b4j.example.vmelement*/ (null,":position",(Object)("m.position"));
RDebugUtils.currentLine=134610958;
 //BA.debugLineNum = 134610958;BA.debugLine="markers.RemoveAttr(\":required\").RemoveAttr(\"v-sho";
__ref._markers /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required")._removeattr /*b4j.example.vmelement*/ (null,"v-show")._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=134610959;
 //BA.debugLineNum = 134610959;BA.debugLine="markers.SetAttrSingle(\"v-if\", $\"${ID}markersvisib";
__ref._markers /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,"v-if",(Object)((""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"markersvisible")));
RDebugUtils.currentLine=134610960;
 //BA.debugLineNum = 134610960;BA.debugLine="markers.SetAttrSingle(\":clickable\", True)";
__ref._markers /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":clickable",(Object)(__c.True));
RDebugUtils.currentLine=134610961;
 //BA.debugLineNum = 134610961;BA.debugLine="markers.SetAttrSingle(\":draggable\", True)";
__ref._markers /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":draggable",(Object)(__c.True));
RDebugUtils.currentLine=134610962;
 //BA.debugLineNum = 134610962;BA.debugLine="markers.SetVFor(\"(m,i)\", markerName)";
__ref._markers /*b4j.example.vmelement*/ ._setvfor /*b4j.example.vmelement*/ (null,"(m,i)",__ref._markername /*String*/ );
RDebugUtils.currentLine=134610963;
 //BA.debugLineNum = 134610963;BA.debugLine="markers.SetAttrSingle(\":key\", \"m.id\")";
__ref._markers /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":key",(Object)("m.id"));
RDebugUtils.currentLine=134610964;
 //BA.debugLineNum = 134610964;BA.debugLine="markers.SetAttrSingle(\"@click\", \"toggleinfowindow";
__ref._markers /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,"@click",(Object)("toggleinfowindow(m,i)"));
RDebugUtils.currentLine=134610965;
 //BA.debugLineNum = 134610965;BA.debugLine="SetEvents";
__ref._setevents /*String*/ (null);
RDebugUtils.currentLine=134610966;
 //BA.debugLineNum = 134610966;BA.debugLine="vue.SetStateSingle(markerName, Array())";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._markername /*String*/ ,(Object)(new Object[]{}));
RDebugUtils.currentLine=134610967;
 //BA.debugLineNum = 134610967;BA.debugLine="points.Initialize";
__ref._points /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=134610969;
 //BA.debugLineNum = 134610969;BA.debugLine="iwPosition = $\"${ID}iwpos\"$";
__ref._iwposition /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"iwpos");
RDebugUtils.currentLine=134610970;
 //BA.debugLineNum = 134610970;BA.debugLine="iwOptions = $\"${ID}opt\"$";
__ref._iwoptions /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"opt");
RDebugUtils.currentLine=134610971;
 //BA.debugLineNum = 134610971;BA.debugLine="iwOpen = $\"${ID}open\"$";
__ref._iwopen /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"open");
RDebugUtils.currentLine=134610972;
 //BA.debugLineNum = 134610972;BA.debugLine="curMidx = $\"${ID}midx\"$";
__ref._curmidx /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"midx");
RDebugUtils.currentLine=134610974;
 //BA.debugLineNum = 134610974;BA.debugLine="vue.setstatesingle(iwPosition, Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._iwposition /*String*/ ,__c.Null);
RDebugUtils.currentLine=134610975;
 //BA.debugLineNum = 134610975;BA.debugLine="vue.setstatesingle(iwOpen, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._iwopen /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=134610976;
 //BA.debugLineNum = 134610976;BA.debugLine="vue.setstatesingle(curMidx, Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._curmidx /*String*/ ,__c.Null);
RDebugUtils.currentLine=134610978;
 //BA.debugLineNum = 134610978;BA.debugLine="infoWindow.Initialize(vue, $\"${ID}iw\"$).SetTag(\"g";
__ref._infowindow /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"iw"))._settag /*b4j.example.vmelement*/ (null,"gmap-info-window");
RDebugUtils.currentLine=134610979;
 //BA.debugLineNum = 134610979;BA.debugLine="infoWindow.RemoveAttr(\":required\").RemoveAttr(\"v-";
__ref._infowindow /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required")._removeattr /*b4j.example.vmelement*/ (null,"v-show")._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=134610980;
 //BA.debugLineNum = 134610980;BA.debugLine="infoWindow.SetAttrSingle(\":options\", iwOptions)";
__ref._infowindow /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":options",(Object)(__ref._iwoptions /*String*/ ));
RDebugUtils.currentLine=134610981;
 //BA.debugLineNum = 134610981;BA.debugLine="infoWindow.setattrsingle(\":position\", iwPosition)";
__ref._infowindow /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":position",(Object)(__ref._iwposition /*String*/ ));
RDebugUtils.currentLine=134610982;
 //BA.debugLineNum = 134610982;BA.debugLine="infoWindow.SetAttrSingle(\":opened\", iwOpen)";
__ref._infowindow /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":opened",(Object)(__ref._iwopen /*String*/ ));
RDebugUtils.currentLine=134610983;
 //BA.debugLineNum = 134610983;BA.debugLine="infoWindow.SetAttrSingle(\"@closeclick\", \"closeinf";
__ref._infowindow /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,"@closeclick",(Object)("closeinfowindow"));
RDebugUtils.currentLine=134610985;
 //BA.debugLineNum = 134610985;BA.debugLine="Dim woptions As Map = CreateMap()";
_woptions = new anywheresoftware.b4a.objects.collections.Map();
_woptions = __c.createMap(new Object[] {});
RDebugUtils.currentLine=134610986;
 //BA.debugLineNum = 134610986;BA.debugLine="Dim pixelOffset As Map = CreateMap()";
_pixeloffset = new anywheresoftware.b4a.objects.collections.Map();
_pixeloffset = __c.createMap(new Object[] {});
RDebugUtils.currentLine=134610987;
 //BA.debugLineNum = 134610987;BA.debugLine="pixelOffset.Put(\"width\", 0)";
_pixeloffset.Put((Object)("width"),(Object)(0));
RDebugUtils.currentLine=134610988;
 //BA.debugLineNum = 134610988;BA.debugLine="pixelOffset.put(\"height\", -35)";
_pixeloffset.Put((Object)("height"),(Object)(-35));
RDebugUtils.currentLine=134610989;
 //BA.debugLineNum = 134610989;BA.debugLine="woptions.Put(\"content\", \"\")";
_woptions.Put((Object)("content"),(Object)(""));
RDebugUtils.currentLine=134610990;
 //BA.debugLineNum = 134610990;BA.debugLine="woptions.put(\"pixelOffset\", pixelOffset)";
_woptions.Put((Object)("pixelOffset"),(Object)(_pixeloffset.getObject()));
RDebugUtils.currentLine=134610991;
 //BA.debugLineNum = 134610991;BA.debugLine="vue.SetStateSingle(iwOptions, woptions)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._iwoptions /*String*/ ,(Object)(_woptions.getObject()));
RDebugUtils.currentLine=134610994;
 //BA.debugLineNum = 134610994;BA.debugLine="kmlLayer.Initialize(vue, kmlName).SetTag(\"google-";
__ref._kmllayer /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._kmlname /*String*/ )._settag /*b4j.example.vmelement*/ (null,"google-kml-layer");
RDebugUtils.currentLine=134610995;
 //BA.debugLineNum = 134610995;BA.debugLine="kmlLayer.RemoveAttr(\":required\").RemoveAttr(\"v-sh";
__ref._kmllayer /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required")._removeattr /*b4j.example.vmelement*/ (null,"v-show")._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=134610996;
 //BA.debugLineNum = 134610996;BA.debugLine="kmlLayer.SetAttrSingle(\"v-if\", $\"${ID}kmlvisible\"";
__ref._kmllayer /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,"v-if",(Object)((""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"kmlvisible")));
RDebugUtils.currentLine=134610997;
 //BA.debugLineNum = 134610997;BA.debugLine="vue.setstatesingle(kmlName, Array())";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._kmlname /*String*/ ,(Object)(new Object[]{}));
RDebugUtils.currentLine=134610998;
 //BA.debugLineNum = 134610998;BA.debugLine="kmlLayer.SetAttrSingle(\":clickable\", True)";
__ref._kmllayer /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":clickable",(Object)(__c.True));
RDebugUtils.currentLine=134610999;
 //BA.debugLineNum = 134610999;BA.debugLine="kmlLayer.SetVFor(\"lyr\", kmlName)";
__ref._kmllayer /*b4j.example.vmelement*/ ._setvfor /*b4j.example.vmelement*/ (null,"lyr",__ref._kmlname /*String*/ );
RDebugUtils.currentLine=134611000;
 //BA.debugLineNum = 134611000;BA.debugLine="kmlLayer.SetAttrSingle(\":url\", \"lyr.url\")";
__ref._kmllayer /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":url",(Object)("lyr.url"));
RDebugUtils.currentLine=134611002;
 //BA.debugLineNum = 134611002;BA.debugLine="ShowKML(False)";
__ref._showkml /*b4j.example.vmgmap*/ (null,__c.False);
RDebugUtils.currentLine=134611003;
 //BA.debugLineNum = 134611003;BA.debugLine="ShowMarkers(True)";
__ref._showmarkers /*b4j.example.vmgmap*/ (null,__c.True);
RDebugUtils.currentLine=134611006;
 //BA.debugLineNum = 134611006;BA.debugLine="SetFullscreenControl(True)";
__ref._setfullscreencontrol /*b4j.example.vmgmap*/ (null,__c.True);
RDebugUtils.currentLine=134611007;
 //BA.debugLineNum = 134611007;BA.debugLine="SetDisableDefaultUi(False)";
__ref._setdisabledefaultui /*b4j.example.vmgmap*/ (null,__c.False);
RDebugUtils.currentLine=134611008;
 //BA.debugLineNum = 134611008;BA.debugLine="SetMapTypeControl(True)";
__ref._setmaptypecontrol /*b4j.example.vmgmap*/ (null,__c.True);
RDebugUtils.currentLine=134611009;
 //BA.debugLineNum = 134611009;BA.debugLine="SetRotateControl(True)";
__ref._setrotatecontrol /*b4j.example.vmgmap*/ (null,__c.True);
RDebugUtils.currentLine=134611010;
 //BA.debugLineNum = 134611010;BA.debugLine="SetStreetViewControl(True)";
__ref._setstreetviewcontrol /*b4j.example.vmgmap*/ (null,__c.True);
RDebugUtils.currentLine=134611011;
 //BA.debugLineNum = 134611011;BA.debugLine="SetScaleControl(True)";
__ref._setscalecontrol /*b4j.example.vmgmap*/ (null,__c.True);
RDebugUtils.currentLine=134611012;
 //BA.debugLineNum = 134611012;BA.debugLine="SetZoomControl(True)";
__ref._setzoomcontrol /*b4j.example.vmgmap*/ (null,__c.True);
RDebugUtils.currentLine=134611013;
 //BA.debugLineNum = 134611013;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=134611014;
 //BA.debugLineNum = 134611014;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _addchild(b4j.example.vmgmap __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=136773632;
 //BA.debugLineNum = 136773632;BA.debugLine="Sub AddChild(child As VMElement) As VMGMap";
RDebugUtils.currentLine=136773633;
 //BA.debugLineNum = 136773633;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=136773634;
 //BA.debugLineNum = 136773634;BA.debugLine="GMap.SetText(childHTML)";
__ref._gmap /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=136773635;
 //BA.debugLineNum = 136773635;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136773636;
 //BA.debugLineNum = 136773636;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmgmap __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=137297920;
 //BA.debugLineNum = 137297920;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=137297921;
 //BA.debugLineNum = 137297921;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=137297922;
 //BA.debugLineNum = 137297922;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmgmap*/ (null,_childx);
 }
};
RDebugUtils.currentLine=137297924;
 //BA.debugLineNum = 137297924;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _addclass(b4j.example.vmgmap __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=136970240;
 //BA.debugLineNum = 136970240;BA.debugLine="Sub AddClass(c As String) As VMGMap";
RDebugUtils.currentLine=136970241;
 //BA.debugLineNum = 136970241;BA.debugLine="GMap.AddClass(c)";
__ref._gmap /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=136970242;
 //BA.debugLineNum = 136970242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136970243;
 //BA.debugLineNum = 136970243;BA.debugLine="End Sub";
return null;
}
public String  _addmarker(b4j.example.vmgmap __ref,String _mid,double _lat,double _lng,String _label,String _info) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "addmarker", true))
	 {return ((String) Debug.delegate(ba, "addmarker", new Object[] {_mid,_lat,_lng,_label,_info}));}
anywheresoftware.b4a.objects.collections.Map _point = null;
anywheresoftware.b4a.objects.collections.Map _marker = null;
RDebugUtils.currentLine=135266304;
 //BA.debugLineNum = 135266304;BA.debugLine="Sub AddMarker(mID As String, lat As Double, lng As";
RDebugUtils.currentLine=135266305;
 //BA.debugLineNum = 135266305;BA.debugLine="mID = mID.tolowercase";
_mid = _mid.toLowerCase();
RDebugUtils.currentLine=135266306;
 //BA.debugLineNum = 135266306;BA.debugLine="Dim point As Map = CreateMap()";
_point = new anywheresoftware.b4a.objects.collections.Map();
_point = __c.createMap(new Object[] {});
RDebugUtils.currentLine=135266307;
 //BA.debugLineNum = 135266307;BA.debugLine="Dim marker As Map = CreateMap()";
_marker = new anywheresoftware.b4a.objects.collections.Map();
_marker = __c.createMap(new Object[] {});
RDebugUtils.currentLine=135266309;
 //BA.debugLineNum = 135266309;BA.debugLine="lat = BANano.parseFloat(lat)";
_lat = __ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_lat));
RDebugUtils.currentLine=135266310;
 //BA.debugLineNum = 135266310;BA.debugLine="lng = BANano.parseFloat(lng)";
_lng = __ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_lng));
RDebugUtils.currentLine=135266312;
 //BA.debugLineNum = 135266312;BA.debugLine="point.Put(\"lat\", lat)";
_point.Put((Object)("lat"),(Object)(_lat));
RDebugUtils.currentLine=135266313;
 //BA.debugLineNum = 135266313;BA.debugLine="point.put(\"lng\", lng)";
_point.Put((Object)("lng"),(Object)(_lng));
RDebugUtils.currentLine=135266315;
 //BA.debugLineNum = 135266315;BA.debugLine="marker.put(\"position\", point)";
_marker.Put((Object)("position"),(Object)(_point.getObject()));
RDebugUtils.currentLine=135266316;
 //BA.debugLineNum = 135266316;BA.debugLine="marker.put(\"id\", mID)";
_marker.Put((Object)("id"),(Object)(_mid));
RDebugUtils.currentLine=135266317;
 //BA.debugLineNum = 135266317;BA.debugLine="If info <> Null Then marker.Put(\"infoText\", info)";
if (_info!= null) { 
_marker.Put((Object)("infoText"),(Object)(_info));};
RDebugUtils.currentLine=135266318;
 //BA.debugLineNum = 135266318;BA.debugLine="If label <> Null Then marker.put(\"label\", label)";
if (_label!= null) { 
_marker.Put((Object)("label"),(Object)(_label));};
RDebugUtils.currentLine=135266319;
 //BA.debugLineNum = 135266319;BA.debugLine="points.add(marker)";
__ref._points /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_marker.getObject()));
RDebugUtils.currentLine=135266320;
 //BA.debugLineNum = 135266320;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
RDebugUtils.currentLine=134545408;
 //BA.debugLineNum = 134545408;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=134545409;
 //BA.debugLineNum = 134545409;BA.debugLine="Public GMap As VMElement";
_gmap = new b4j.example.vmelement();
RDebugUtils.currentLine=134545410;
 //BA.debugLineNum = 134545410;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=134545411;
 //BA.debugLineNum = 134545411;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=134545412;
 //BA.debugLineNum = 134545412;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=134545413;
 //BA.debugLineNum = 134545413;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=134545414;
 //BA.debugLineNum = 134545414;BA.debugLine="Private markers As VMElement";
_markers = new b4j.example.vmelement();
RDebugUtils.currentLine=134545415;
 //BA.debugLineNum = 134545415;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=134545416;
 //BA.debugLineNum = 134545416;BA.debugLine="Private points As List";
_points = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=134545417;
 //BA.debugLineNum = 134545417;BA.debugLine="Private markerName As String";
_markername = "";
RDebugUtils.currentLine=134545418;
 //BA.debugLineNum = 134545418;BA.debugLine="Private infoWindow As VMElement";
_infowindow = new b4j.example.vmelement();
RDebugUtils.currentLine=134545419;
 //BA.debugLineNum = 134545419;BA.debugLine="Private iwOptions As String";
_iwoptions = "";
RDebugUtils.currentLine=134545420;
 //BA.debugLineNum = 134545420;BA.debugLine="Private iwPosition As String";
_iwposition = "";
RDebugUtils.currentLine=134545421;
 //BA.debugLineNum = 134545421;BA.debugLine="Private iwOpen As String";
_iwopen = "";
RDebugUtils.currentLine=134545422;
 //BA.debugLineNum = 134545422;BA.debugLine="Private curMidx As String";
_curmidx = "";
RDebugUtils.currentLine=134545423;
 //BA.debugLineNum = 134545423;BA.debugLine="Type GMarker(ID As String, lat As Double, lng As";
;
RDebugUtils.currentLine=134545424;
 //BA.debugLineNum = 134545424;BA.debugLine="Private kmlLayer As VMElement";
_kmllayer = new b4j.example.vmelement();
RDebugUtils.currentLine=134545425;
 //BA.debugLineNum = 134545425;BA.debugLine="Private kmlName As String";
_kmlname = "";
RDebugUtils.currentLine=134545426;
 //BA.debugLineNum = 134545426;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _clearmarkers(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "clearmarkers", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "clearmarkers", null));}
RDebugUtils.currentLine=135135232;
 //BA.debugLineNum = 135135232;BA.debugLine="Sub ClearMarkers As VMGMap";
RDebugUtils.currentLine=135135233;
 //BA.debugLineNum = 135135233;BA.debugLine="points.Initialize";
__ref._points /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=135135234;
 //BA.debugLineNum = 135135234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135135235;
 //BA.debugLineNum = 135135235;BA.debugLine="End Sub";
return null;
}
public String  _closeinfowindow(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "closeinfowindow", true))
	 {return ((String) Debug.delegate(ba, "closeinfowindow", null));}
RDebugUtils.currentLine=134938624;
 //BA.debugLineNum = 134938624;BA.debugLine="Private Sub closeInfoWindow";
RDebugUtils.currentLine=134938625;
 //BA.debugLineNum = 134938625;BA.debugLine="vue.setstatesingle(iwOpen, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._iwopen /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=134938626;
 //BA.debugLineNum = 134938626;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _hide(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=136577024;
 //BA.debugLineNum = 136577024;BA.debugLine="Sub Hide As VMGMap";
RDebugUtils.currentLine=136577025;
 //BA.debugLineNum = 136577025;BA.debugLine="GMap.Hide";
__ref._gmap /*b4j.example.vmelement*/ ._hide /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=136577026;
 //BA.debugLineNum = 136577026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136577027;
 //BA.debugLineNum = 136577027;BA.debugLine="End Sub";
return null;
}
public String  _setevents(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setevents", true))
	 {return ((String) Debug.delegate(ba, "setevents", null));}
Object _m = null;
Object _i = null;
com.ab.banano.BANanoObject _cb = null;
com.ab.banano.BANanoEvent _e = null;
RDebugUtils.currentLine=135069696;
 //BA.debugLineNum = 135069696;BA.debugLine="private Sub SetEvents";
RDebugUtils.currentLine=135069697;
 //BA.debugLineNum = 135069697;BA.debugLine="Dim m, i As Object";
_m = new Object();
_i = new Object();
RDebugUtils.currentLine=135069698;
 //BA.debugLineNum = 135069698;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"tog";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(this,"toggleInfoWindow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m,_i}))));
RDebugUtils.currentLine=135069699;
 //BA.debugLineNum = 135069699;BA.debugLine="vue.SetCallBack(\"toggleInfoWindow\", cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,"toggleInfoWindow",_cb);
RDebugUtils.currentLine=135069701;
 //BA.debugLineNum = 135069701;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=135069702;
 //BA.debugLineNum = 135069702;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"clo";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(this,"closeInfoWindow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
RDebugUtils.currentLine=135069703;
 //BA.debugLineNum = 135069703;BA.debugLine="vue.SetCallBack(\"closeInfoWindow\", cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,"closeInfoWindow",_cb);
RDebugUtils.currentLine=135069704;
 //BA.debugLineNum = 135069704;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _showkml(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "showkml", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "showkml", new Object[] {_b}));}
RDebugUtils.currentLine=134873088;
 //BA.debugLineNum = 134873088;BA.debugLine="Sub ShowKML(b As Boolean) As VMGMap";
RDebugUtils.currentLine=134873089;
 //BA.debugLineNum = 134873089;BA.debugLine="vue.setstatesingle($\"${ID}kmlvisible\"$, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"kmlvisible"),(Object)(_b));
RDebugUtils.currentLine=134873090;
 //BA.debugLineNum = 134873090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=134873091;
 //BA.debugLineNum = 134873091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _showmarkers(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "showmarkers", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "showmarkers", new Object[] {_b}));}
RDebugUtils.currentLine=134807552;
 //BA.debugLineNum = 134807552;BA.debugLine="Sub ShowMarkers(b As Boolean) As VMGMap";
RDebugUtils.currentLine=134807553;
 //BA.debugLineNum = 134807553;BA.debugLine="vue.setstatesingle($\"${ID}markersvisible\"$, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"markersvisible"),(Object)(_b));
RDebugUtils.currentLine=134807554;
 //BA.debugLineNum = 134807554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=134807555;
 //BA.debugLineNum = 134807555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setfullscreencontrol(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setfullscreencontrol", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setfullscreencontrol", new Object[] {_b}));}
RDebugUtils.currentLine=135725056;
 //BA.debugLineNum = 135725056;BA.debugLine="Sub SetFullscreenControl(b As Boolean) As VMGMap";
RDebugUtils.currentLine=135725057;
 //BA.debugLineNum = 135725057;BA.debugLine="options.put(\"fullscreenControl\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("fullscreenControl"),(Object)(_b));
RDebugUtils.currentLine=135725058;
 //BA.debugLineNum = 135725058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135725059;
 //BA.debugLineNum = 135725059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setdisabledefaultui(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setdisabledefaultui", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setdisabledefaultui", new Object[] {_b}));}
RDebugUtils.currentLine=135659520;
 //BA.debugLineNum = 135659520;BA.debugLine="Sub SetDisableDefaultUi(b As Boolean) As VMGMap";
RDebugUtils.currentLine=135659521;
 //BA.debugLineNum = 135659521;BA.debugLine="options.put(\"disableDefaultUi\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("disableDefaultUi"),(Object)(_b));
RDebugUtils.currentLine=135659522;
 //BA.debugLineNum = 135659522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135659523;
 //BA.debugLineNum = 135659523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptypecontrol(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setmaptypecontrol", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setmaptypecontrol", new Object[] {_b}));}
RDebugUtils.currentLine=135593984;
 //BA.debugLineNum = 135593984;BA.debugLine="Sub SetMapTypeControl(b As Boolean) As VMGMap";
RDebugUtils.currentLine=135593985;
 //BA.debugLineNum = 135593985;BA.debugLine="options.put(\"mapTypeControl\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("mapTypeControl"),(Object)(_b));
RDebugUtils.currentLine=135593986;
 //BA.debugLineNum = 135593986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135593987;
 //BA.debugLineNum = 135593987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setrotatecontrol(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setrotatecontrol", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setrotatecontrol", new Object[] {_b}));}
RDebugUtils.currentLine=135528448;
 //BA.debugLineNum = 135528448;BA.debugLine="Sub SetRotateControl(b As Boolean) As VMGMap";
RDebugUtils.currentLine=135528449;
 //BA.debugLineNum = 135528449;BA.debugLine="options.put(\"rotateControl\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("rotateControl"),(Object)(_b));
RDebugUtils.currentLine=135528450;
 //BA.debugLineNum = 135528450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135528451;
 //BA.debugLineNum = 135528451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setstreetviewcontrol(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setstreetviewcontrol", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setstreetviewcontrol", new Object[] {_b}));}
RDebugUtils.currentLine=135462912;
 //BA.debugLineNum = 135462912;BA.debugLine="Sub SetStreetViewControl(b As Boolean) As VMGMap";
RDebugUtils.currentLine=135462913;
 //BA.debugLineNum = 135462913;BA.debugLine="options.put(\"streetViewControl\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("streetViewControl"),(Object)(_b));
RDebugUtils.currentLine=135462914;
 //BA.debugLineNum = 135462914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135462915;
 //BA.debugLineNum = 135462915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setscalecontrol(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setscalecontrol", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setscalecontrol", new Object[] {_b}));}
RDebugUtils.currentLine=135397376;
 //BA.debugLineNum = 135397376;BA.debugLine="Sub SetScaleControl(b As Boolean) As VMGMap";
RDebugUtils.currentLine=135397377;
 //BA.debugLineNum = 135397377;BA.debugLine="options.put(\"scaleControl\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("scaleControl"),(Object)(_b));
RDebugUtils.currentLine=135397378;
 //BA.debugLineNum = 135397378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135397379;
 //BA.debugLineNum = 135397379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setzoomcontrol(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setzoomcontrol", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setzoomcontrol", new Object[] {_b}));}
RDebugUtils.currentLine=135331840;
 //BA.debugLineNum = 135331840;BA.debugLine="Sub SetZoomControl(b As Boolean) As VMGMap";
RDebugUtils.currentLine=135331841;
 //BA.debugLineNum = 135331841;BA.debugLine="options.put(\"zoomControl\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("zoomControl"),(Object)(_b));
RDebugUtils.currentLine=135331842;
 //BA.debugLineNum = 135331842;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135331843;
 //BA.debugLineNum = 135331843;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmgmap __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=136904704;
 //BA.debugLineNum = 136904704;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=136904705;
 //BA.debugLineNum = 136904705;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=136904706;
 //BA.debugLineNum = 136904706;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=136380416;
 //BA.debugLineNum = 136380416;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=136380417;
 //BA.debugLineNum = 136380417;BA.debugLine="vue.SetStateSingle($\"${ID}options\"$, options)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"options"),(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=136380418;
 //BA.debugLineNum = 136380418;BA.debugLine="vue.SetStateSingle(markerName, points)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._markername /*String*/ ,(Object)(__ref._points /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=136380419;
 //BA.debugLineNum = 136380419;BA.debugLine="infoWindow.Pop(GMap)";
__ref._infowindow /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._gmap /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=136380420;
 //BA.debugLineNum = 136380420;BA.debugLine="kmlLayer.pop(GMap)";
__ref._kmllayer /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._gmap /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=136380421;
 //BA.debugLineNum = 136380421;BA.debugLine="markers.pop(GMap)";
__ref._markers /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._gmap /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=136380422;
 //BA.debugLineNum = 136380422;BA.debugLine="Return GMap.ToString";
if (true) return __ref._gmap /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=136380423;
 //BA.debugLineNum = 136380423;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=135200768;
 //BA.debugLineNum = 135200768;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=135200769;
 //BA.debugLineNum = 135200769;BA.debugLine="vue.SetStateSingle(markerName, points)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._markername /*String*/ ,(Object)(__ref._points /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=135200770;
 //BA.debugLineNum = 135200770;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=136708096;
 //BA.debugLineNum = 136708096;BA.debugLine="Sub Render";
RDebugUtils.currentLine=136708097;
 //BA.debugLineNum = 136708097;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=136708098;
 //BA.debugLineNum = 136708098;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _setattr(b4j.example.vmgmap __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=137035776;
 //BA.debugLineNum = 137035776;BA.debugLine="Sub SetAttr(attr As Map) As VMGMap";
RDebugUtils.currentLine=137035777;
 //BA.debugLineNum = 137035777;BA.debugLine="GMap.SetAttr(attr)";
__ref._gmap /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=137035778;
 //BA.debugLineNum = 137035778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=137035779;
 //BA.debugLineNum = 137035779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setattrsingle(b4j.example.vmgmap __ref,String _prop,Object _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setattrsingle", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setattrsingle", new Object[] {_prop,_val}));}
RDebugUtils.currentLine=137101312;
 //BA.debugLineNum = 137101312;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
RDebugUtils.currentLine=137101313;
 //BA.debugLineNum = 137101313;BA.debugLine="GMap.SetAttrSingle(prop, val)";
__ref._gmap /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,_prop,_val);
RDebugUtils.currentLine=137101314;
 //BA.debugLineNum = 137101314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=137101315;
 //BA.debugLineNum = 137101315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setcenter(b4j.example.vmgmap __ref,double _lat,double _lng) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setcenter", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setcenter", new Object[] {_lat,_lng}));}
String _pp = "";
anywheresoftware.b4a.objects.collections.Map _point = null;
RDebugUtils.currentLine=135790592;
 //BA.debugLineNum = 135790592;BA.debugLine="Sub SetCenter(lat As Double, lng As Double) As VMG";
RDebugUtils.currentLine=135790593;
 //BA.debugLineNum = 135790593;BA.debugLine="lat = BANano.parseFloat(lat)";
_lat = __ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_lat));
RDebugUtils.currentLine=135790594;
 //BA.debugLineNum = 135790594;BA.debugLine="lng = BANano.parseFloat(lng)";
_lng = __ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_lng));
RDebugUtils.currentLine=135790596;
 //BA.debugLineNum = 135790596;BA.debugLine="Dim pp As String = $\"${ID}center\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"center");
RDebugUtils.currentLine=135790597;
 //BA.debugLineNum = 135790597;BA.debugLine="Dim point As Map = CreateMap()";
_point = new anywheresoftware.b4a.objects.collections.Map();
_point = __c.createMap(new Object[] {});
RDebugUtils.currentLine=135790598;
 //BA.debugLineNum = 135790598;BA.debugLine="point.put(\"lat\", lat)";
_point.Put((Object)("lat"),(Object)(_lat));
RDebugUtils.currentLine=135790599;
 //BA.debugLineNum = 135790599;BA.debugLine="point.put(\"lng\", lng)";
_point.Put((Object)("lng"),(Object)(_lng));
RDebugUtils.currentLine=135790600;
 //BA.debugLineNum = 135790600;BA.debugLine="vue.SetStateSingle(pp, point)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_point.getObject()));
RDebugUtils.currentLine=135790601;
 //BA.debugLineNum = 135790601;BA.debugLine="GMap.SetAttrSingle(\":center\", pp)";
__ref._gmap /*b4j.example.vmelement*/ ._setattrsingle /*b4j.example.vmelement*/ (null,":center",(Object)(_pp));
RDebugUtils.currentLine=135790602;
 //BA.debugLineNum = 135790602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135790603;
 //BA.debugLineNum = 135790603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setheight(b4j.example.vmgmap __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=135921664;
 //BA.debugLineNum = 135921664;BA.debugLine="Sub SetHeight(h As String) As VMGMap";
RDebugUtils.currentLine=135921665;
 //BA.debugLineNum = 135921665;BA.debugLine="SetStyleSingle(\"height\", h)";
__ref._setstylesingle /*b4j.example.vmgmap*/ (null,"height",(Object)(_h));
RDebugUtils.currentLine=135921666;
 //BA.debugLineNum = 135921666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135921667;
 //BA.debugLineNum = 135921667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setstylesingle(b4j.example.vmgmap __ref,String _prop,Object _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setstylesingle", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setstylesingle", new Object[] {_prop,_val}));}
RDebugUtils.currentLine=137232384;
 //BA.debugLineNum = 137232384;BA.debugLine="Sub SetStyleSingle(prop As String, val As Object)";
RDebugUtils.currentLine=137232385;
 //BA.debugLineNum = 137232385;BA.debugLine="GMap.setstylesingle(prop, val)";
__ref._gmap /*b4j.example.vmelement*/ ._setstylesingle /*b4j.example.vmelement*/ (null,_prop,_val);
RDebugUtils.currentLine=137232386;
 //BA.debugLineNum = 137232386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=137232387;
 //BA.debugLineNum = 137232387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setkmlurl(b4j.example.vmgmap __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setkmlurl", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setkmlurl", new Object[] {_url}));}
anywheresoftware.b4a.objects.collections.List _kmlold = null;
anywheresoftware.b4a.objects.collections.List _kml = null;
anywheresoftware.b4a.objects.collections.Map _nl = null;
RDebugUtils.currentLine=134742016;
 //BA.debugLineNum = 134742016;BA.debugLine="Sub SetKMLURL(url As String) As VMGMap";
RDebugUtils.currentLine=134742017;
 //BA.debugLineNum = 134742017;BA.debugLine="Dim kmlold As List";
_kmlold = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=134742018;
 //BA.debugLineNum = 134742018;BA.debugLine="Dim kml As List = vue.GetState(kmlName, kmlold)";
_kml = new anywheresoftware.b4a.objects.collections.List();
_kml.setObject((java.util.List)(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,__ref._kmlname /*String*/ ,(Object)(_kmlold.getObject()))));
RDebugUtils.currentLine=134742019;
 //BA.debugLineNum = 134742019;BA.debugLine="Dim nl As Map = CreateMap()";
_nl = new anywheresoftware.b4a.objects.collections.Map();
_nl = __c.createMap(new Object[] {});
RDebugUtils.currentLine=134742020;
 //BA.debugLineNum = 134742020;BA.debugLine="nl.put(\"url\", url)";
_nl.Put((Object)("url"),(Object)(_url));
RDebugUtils.currentLine=134742021;
 //BA.debugLineNum = 134742021;BA.debugLine="kml.add(nl)";
_kml.Add((Object)(_nl.getObject()));
RDebugUtils.currentLine=134742022;
 //BA.debugLineNum = 134742022;BA.debugLine="vue.setstatesingle(kmlName, kml)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._kmlname /*String*/ ,(Object)(_kml.getObject()));
RDebugUtils.currentLine=134742023;
 //BA.debugLineNum = 134742023;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptype(b4j.example.vmgmap __ref,String _maptype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setmaptype", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setmaptype", new Object[] {_maptype}));}
String _pp = "";
RDebugUtils.currentLine=136052736;
 //BA.debugLineNum = 136052736;BA.debugLine="Sub SetMapType(maptype As String) As VMGMap";
RDebugUtils.currentLine=136052737;
 //BA.debugLineNum = 136052737;BA.debugLine="Dim pp As String = $\"${ID}maptype\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"maptype");
RDebugUtils.currentLine=136052738;
 //BA.debugLineNum = 136052738;BA.debugLine="vue.setstatesingle(pp, maptype)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_maptype));
RDebugUtils.currentLine=136052739;
 //BA.debugLineNum = 136052739;BA.debugLine="SetAttrSingle(\":map-type-id\", pp)";
__ref._setattrsingle /*b4j.example.vmgmap*/ (null,":map-type-id",(Object)(_pp));
RDebugUtils.currentLine=136052740;
 //BA.debugLineNum = 136052740;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136052741;
 //BA.debugLineNum = 136052741;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptypehybrid(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setmaptypehybrid", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setmaptypehybrid", null));}
RDebugUtils.currentLine=136249344;
 //BA.debugLineNum = 136249344;BA.debugLine="Sub SetMapTypeHybrid As VMGMap";
RDebugUtils.currentLine=136249345;
 //BA.debugLineNum = 136249345;BA.debugLine="SetMapType(\"hybrid\")";
__ref._setmaptype /*b4j.example.vmgmap*/ (null,"hybrid");
RDebugUtils.currentLine=136249346;
 //BA.debugLineNum = 136249346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136249347;
 //BA.debugLineNum = 136249347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptyperoadmap(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setmaptyperoadmap", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setmaptyperoadmap", null));}
RDebugUtils.currentLine=136118272;
 //BA.debugLineNum = 136118272;BA.debugLine="Sub SetMapTypeRoadMap As VMGMap";
RDebugUtils.currentLine=136118273;
 //BA.debugLineNum = 136118273;BA.debugLine="SetMapType(\"roadmap\")";
__ref._setmaptype /*b4j.example.vmgmap*/ (null,"roadmap");
RDebugUtils.currentLine=136118274;
 //BA.debugLineNum = 136118274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136118275;
 //BA.debugLineNum = 136118275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptypesatellite(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setmaptypesatellite", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setmaptypesatellite", null));}
RDebugUtils.currentLine=136183808;
 //BA.debugLineNum = 136183808;BA.debugLine="Sub SetMapTypeSatellite As VMGMap";
RDebugUtils.currentLine=136183809;
 //BA.debugLineNum = 136183809;BA.debugLine="SetMapType(\"satellite\")";
__ref._setmaptype /*b4j.example.vmgmap*/ (null,"satellite");
RDebugUtils.currentLine=136183810;
 //BA.debugLineNum = 136183810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136183811;
 //BA.debugLineNum = 136183811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptypeterrain(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setmaptypeterrain", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setmaptypeterrain", null));}
RDebugUtils.currentLine=136314880;
 //BA.debugLineNum = 136314880;BA.debugLine="Sub SetMapTypeTerrain As VMGMap";
RDebugUtils.currentLine=136314881;
 //BA.debugLineNum = 136314881;BA.debugLine="SetMapType(\"terrain\")";
__ref._setmaptype /*b4j.example.vmgmap*/ (null,"terrain");
RDebugUtils.currentLine=136314882;
 //BA.debugLineNum = 136314882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136314883;
 //BA.debugLineNum = 136314883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setpadding(b4j.example.vmgmap __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=137363456;
 //BA.debugLineNum = 137363456;BA.debugLine="Sub SetPadding(p As Object) As VMGMap";
RDebugUtils.currentLine=137363457;
 //BA.debugLineNum = 137363457;BA.debugLine="GMap.SetPaddingAll(p)";
__ref._gmap /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=137363458;
 //BA.debugLineNum = 137363458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=137363459;
 //BA.debugLineNum = 137363459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setstyle(b4j.example.vmgmap __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=137166848;
 //BA.debugLineNum = 137166848;BA.debugLine="Sub SetStyle(sm As Map) As VMGMap";
RDebugUtils.currentLine=137166849;
 //BA.debugLineNum = 137166849;BA.debugLine="GMap.SetStyle(sm)";
__ref._gmap /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=137166850;
 //BA.debugLineNum = 137166850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=137166851;
 //BA.debugLineNum = 137166851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _settext(b4j.example.vmgmap __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=136839168;
 //BA.debugLineNum = 136839168;BA.debugLine="Sub SetText(t As Object) As VMGMap";
RDebugUtils.currentLine=136839169;
 //BA.debugLineNum = 136839169;BA.debugLine="GMap.SetText(t)";
__ref._gmap /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=136839170;
 //BA.debugLineNum = 136839170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136839171;
 //BA.debugLineNum = 136839171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setvif(b4j.example.vmgmap __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=136445952;
 //BA.debugLineNum = 136445952;BA.debugLine="Sub SetVIf(vif As Object) As VMGMap";
RDebugUtils.currentLine=136445953;
 //BA.debugLineNum = 136445953;BA.debugLine="GMap.SetVIf(vif)";
__ref._gmap /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=136445954;
 //BA.debugLineNum = 136445954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136445955;
 //BA.debugLineNum = 136445955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setvshow(b4j.example.vmgmap __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=136511488;
 //BA.debugLineNum = 136511488;BA.debugLine="Sub SetVShow(vif As Object) As VMGMap";
RDebugUtils.currentLine=136511489;
 //BA.debugLineNum = 136511489;BA.debugLine="GMap.SetVShow(vif)";
__ref._gmap /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=136511490;
 //BA.debugLineNum = 136511490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136511491;
 //BA.debugLineNum = 136511491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setwidth(b4j.example.vmgmap __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setwidth", new Object[] {_h}));}
RDebugUtils.currentLine=135987200;
 //BA.debugLineNum = 135987200;BA.debugLine="Sub SetWidth(h As String) As VMGMap";
RDebugUtils.currentLine=135987201;
 //BA.debugLineNum = 135987201;BA.debugLine="SetStyleSingle(\"width\", h)";
__ref._setstylesingle /*b4j.example.vmgmap*/ (null,"width",(Object)(_h));
RDebugUtils.currentLine=135987202;
 //BA.debugLineNum = 135987202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135987203;
 //BA.debugLineNum = 135987203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setzoom(b4j.example.vmgmap __ref,int _z) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "setzoom", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "setzoom", new Object[] {_z}));}
String _pp = "";
RDebugUtils.currentLine=135856128;
 //BA.debugLineNum = 135856128;BA.debugLine="Sub SetZoom(z As Int) As VMGMap";
RDebugUtils.currentLine=135856129;
 //BA.debugLineNum = 135856129;BA.debugLine="z = BANano.parseInt(z)";
_z = __ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_z));
RDebugUtils.currentLine=135856130;
 //BA.debugLineNum = 135856130;BA.debugLine="Dim pp As String = $\"${ID}zoom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"zoom");
RDebugUtils.currentLine=135856131;
 //BA.debugLineNum = 135856131;BA.debugLine="vue.SetStateSingle(pp, z)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_z));
RDebugUtils.currentLine=135856132;
 //BA.debugLineNum = 135856132;BA.debugLine="SetAttrSingle(\":zoom\", pp)";
__ref._setattrsingle /*b4j.example.vmgmap*/ (null,":zoom",(Object)(_pp));
RDebugUtils.currentLine=135856133;
 //BA.debugLineNum = 135856133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=135856134;
 //BA.debugLineNum = 135856134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _show(b4j.example.vmgmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=136642560;
 //BA.debugLineNum = 136642560;BA.debugLine="Sub Show As VMGMap";
RDebugUtils.currentLine=136642561;
 //BA.debugLineNum = 136642561;BA.debugLine="GMap.Show";
__ref._gmap /*b4j.example.vmelement*/ ._show /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=136642562;
 //BA.debugLineNum = 136642562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=136642563;
 //BA.debugLineNum = 136642563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _showinfowindow(b4j.example.vmgmap __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "showinfowindow", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "showinfowindow", new Object[] {_b}));}
RDebugUtils.currentLine=134676480;
 //BA.debugLineNum = 134676480;BA.debugLine="Sub ShowInfoWindow(b As Boolean) As VMGMap";
RDebugUtils.currentLine=134676481;
 //BA.debugLineNum = 134676481;BA.debugLine="vue.SetStateSingle(iwOpen, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._iwopen /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=134676482;
 //BA.debugLineNum = 134676482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
RDebugUtils.currentLine=134676483;
 //BA.debugLineNum = 134676483;BA.debugLine="End Sub";
return null;
}
public String  _toggleinfowindow(b4j.example.vmgmap __ref,anywheresoftware.b4a.objects.collections.Map _m,Object _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgmap";
if (Debug.shouldDelegate(ba, "toggleinfowindow", true))
	 {return ((String) Debug.delegate(ba, "toggleinfowindow", new Object[] {_m,_i}));}
anywheresoftware.b4a.objects.collections.Map _mo = null;
anywheresoftware.b4a.objects.collections.Map _infowindowpos = null;
String _mcontent = "";
anywheresoftware.b4a.objects.collections.Map _infooptions = null;
Object _cidx = null;
RDebugUtils.currentLine=135004160;
 //BA.debugLineNum = 135004160;BA.debugLine="private Sub toggleInfoWindow(m As Map, i As Object";
RDebugUtils.currentLine=135004161;
 //BA.debugLineNum = 135004161;BA.debugLine="Dim mo As Map = CreateMap()";
_mo = new anywheresoftware.b4a.objects.collections.Map();
_mo = __c.createMap(new Object[] {});
RDebugUtils.currentLine=135004162;
 //BA.debugLineNum = 135004162;BA.debugLine="Dim infoWindowPos As Map = m.Get(\"position\")";
_infowindowpos = new anywheresoftware.b4a.objects.collections.Map();
_infowindowpos.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_m.Get((Object)("position"))));
RDebugUtils.currentLine=135004163;
 //BA.debugLineNum = 135004163;BA.debugLine="Dim mcontent As String = m.Get(\"infoText\")";
_mcontent = BA.ObjectToString(_m.Get((Object)("infoText")));
RDebugUtils.currentLine=135004164;
 //BA.debugLineNum = 135004164;BA.debugLine="Dim infoOptions As Map = vue.GetState(iwOptions,";
_infooptions = new anywheresoftware.b4a.objects.collections.Map();
_infooptions.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,__ref._iwoptions /*String*/ ,(Object)(_mo.getObject()))));
RDebugUtils.currentLine=135004165;
 //BA.debugLineNum = 135004165;BA.debugLine="infoOptions.Put(\"content\", mcontent)";
_infooptions.Put((Object)("content"),(Object)(_mcontent));
RDebugUtils.currentLine=135004166;
 //BA.debugLineNum = 135004166;BA.debugLine="vue.setstatesingle(iwPosition, infoWindowPos)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._iwposition /*String*/ ,(Object)(_infowindowpos.getObject()));
RDebugUtils.currentLine=135004167;
 //BA.debugLineNum = 135004167;BA.debugLine="vue.setstatesingle(iwOptions, infoOptions)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._iwoptions /*String*/ ,(Object)(_infooptions.getObject()));
RDebugUtils.currentLine=135004169;
 //BA.debugLineNum = 135004169;BA.debugLine="Dim cIdx As Object = vue.getstate(curMidx, Null)";
_cidx = __ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,__ref._curmidx /*String*/ ,__c.Null);
RDebugUtils.currentLine=135004170;
 //BA.debugLineNum = 135004170;BA.debugLine="If cIdx = i Then";
if ((_cidx).equals(_i)) { 
RDebugUtils.currentLine=135004171;
 //BA.debugLineNum = 135004171;BA.debugLine="vue.ToggleState(iwOpen)";
__ref._vue /*b4j.example.bananovue*/ ._togglestate /*b4j.example.bananovue*/ (null,__ref._iwopen /*String*/ );
 }else {
RDebugUtils.currentLine=135004173;
 //BA.debugLineNum = 135004173;BA.debugLine="vue.SetStateSingle(iwOpen, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._iwopen /*String*/ ,(Object)(__c.True));
RDebugUtils.currentLine=135004174;
 //BA.debugLineNum = 135004174;BA.debugLine="vue.setstatesingle(curMidx, i)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._curmidx /*String*/ ,_i);
 };
RDebugUtils.currentLine=135004176;
 //BA.debugLineNum = 135004176;BA.debugLine="End Sub";
return "";
}
}