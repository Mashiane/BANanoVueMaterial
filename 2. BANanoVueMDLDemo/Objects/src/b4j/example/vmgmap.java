package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmgmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmgmap", this);
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
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
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
public b4j.example.vmgmap  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 312;BA.debugLine="Sub AddChild(child As VMElement) As VMGMap";
 //BA.debugLineNum = 313;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 314;BA.debugLine="GMap.SetText(childHTML)";
_gmap._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 358;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 359;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 360;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub AddClass(c As String) As VMGMap";
 //BA.debugLineNum = 331;BA.debugLine="GMap.AddClass(c)";
_gmap._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public String  _addmarker(String _mid,double _lat,double _lng,String _label,String _info) throws Exception{
anywheresoftware.b4a.objects.collections.Map _point = null;
anywheresoftware.b4a.objects.collections.Map _marker = null;
 //BA.debugLineNum = 163;BA.debugLine="Sub AddMarker(mID As String, lat As Double, lng As";
 //BA.debugLineNum = 164;BA.debugLine="mID = mID.tolowercase";
_mid = _mid.toLowerCase();
 //BA.debugLineNum = 165;BA.debugLine="Dim point As Map = CreateMap()";
_point = new anywheresoftware.b4a.objects.collections.Map();
_point = __c.createMap(new Object[] {});
 //BA.debugLineNum = 166;BA.debugLine="Dim marker As Map = CreateMap()";
_marker = new anywheresoftware.b4a.objects.collections.Map();
_marker = __c.createMap(new Object[] {});
 //BA.debugLineNum = 168;BA.debugLine="lat = BANano.parseFloat(lat)";
_lat = _banano.parseFloat((Object)(_lat));
 //BA.debugLineNum = 169;BA.debugLine="lng = BANano.parseFloat(lng)";
_lng = _banano.parseFloat((Object)(_lng));
 //BA.debugLineNum = 171;BA.debugLine="point.Put(\"lat\", lat)";
_point.Put((Object)("lat"),(Object)(_lat));
 //BA.debugLineNum = 172;BA.debugLine="point.put(\"lng\", lng)";
_point.Put((Object)("lng"),(Object)(_lng));
 //BA.debugLineNum = 174;BA.debugLine="marker.put(\"position\", point)";
_marker.Put((Object)("position"),(Object)(_point.getObject()));
 //BA.debugLineNum = 175;BA.debugLine="marker.put(\"id\", mID)";
_marker.Put((Object)("id"),(Object)(_mid));
 //BA.debugLineNum = 176;BA.debugLine="If info <> Null Then marker.Put(\"infoText\", info)";
if (_info!= null) { 
_marker.Put((Object)("infoText"),(Object)(_info));};
 //BA.debugLineNum = 177;BA.debugLine="If label <> Null Then marker.put(\"label\", label)";
if (_label!= null) { 
_marker.Put((Object)("label"),(Object)(_label));};
 //BA.debugLineNum = 178;BA.debugLine="points.add(marker)";
_points.Add((Object)(_marker.getObject()));
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public GMap As VMElement";
_gmap = new b4j.example.vmelement();
 //BA.debugLineNum = 5;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private markers As VMElement";
_markers = new b4j.example.vmelement();
 //BA.debugLineNum = 10;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private points As List";
_points = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private markerName As String";
_markername = "";
 //BA.debugLineNum = 13;BA.debugLine="Private infoWindow As VMElement";
_infowindow = new b4j.example.vmelement();
 //BA.debugLineNum = 14;BA.debugLine="Private iwOptions As String";
_iwoptions = "";
 //BA.debugLineNum = 15;BA.debugLine="Private iwPosition As String";
_iwposition = "";
 //BA.debugLineNum = 16;BA.debugLine="Private iwOpen As String";
_iwopen = "";
 //BA.debugLineNum = 17;BA.debugLine="Private curMidx As String";
_curmidx = "";
 //BA.debugLineNum = 18;BA.debugLine="Type GMarker(ID As String, lat As Double, lng As";
;
 //BA.debugLineNum = 19;BA.debugLine="Private kmlLayer As VMElement";
_kmllayer = new b4j.example.vmelement();
 //BA.debugLineNum = 20;BA.debugLine="Private kmlName As String";
_kmlname = "";
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _clearmarkers() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub ClearMarkers As VMGMap";
 //BA.debugLineNum = 154;BA.debugLine="points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public String  _closeinfowindow() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Private Sub closeInfoWindow";
 //BA.debugLineNum = 121;BA.debugLine="vue.setstatesingle(iwOpen, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_iwopen,(Object)(__c.False));
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _hide() throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub Hide As VMGMap";
 //BA.debugLineNum = 297;BA.debugLine="GMap.Hide";
_gmap._hide /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.collections.Map _woptions = null;
anywheresoftware.b4a.objects.collections.Map _pixeloffset = null;
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 25;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 26;BA.debugLine="GMap.Initialize(v, ID).SetTag(\"gmap-map\")";
_gmap._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("gmap-map");
 //BA.debugLineNum = 27;BA.debugLine="GMap.SetRef(ID)";
_gmap._setref /*b4j.example.vmelement*/ (_id);
 //BA.debugLineNum = 28;BA.debugLine="GMap.RemoveAttr(\":required\").RemoveAttr(\"v-show\")";
_gmap._removeattr /*b4j.example.vmelement*/ (":required")._removeattr /*b4j.example.vmelement*/ ("v-show")._removeattr /*b4j.example.vmelement*/ (":disabled");
 //BA.debugLineNum = 29;BA.debugLine="GMap.SetAttrSingle(\":options\", $\"${ID}options\"$)";
_gmap._setattrsingle /*b4j.example.vmelement*/ (":options",(Object)((""+__c.SmartStringFormatter("",(Object)(_id))+"options")));
 //BA.debugLineNum = 30;BA.debugLine="vue.setstatesingle($\"${ID}options\"$, CreateMap())";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"options"),(Object)(__c.createMap(new Object[] {}).getObject()));
 //BA.debugLineNum = 31;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 32;BA.debugLine="markerName = $\"${ID}markers\"$";
_markername = (""+__c.SmartStringFormatter("",(Object)(_id))+"markers");
 //BA.debugLineNum = 33;BA.debugLine="kmlName = $\"${ID}kmlayers\"$";
_kmlname = (""+__c.SmartStringFormatter("",(Object)(_id))+"kmlayers");
 //BA.debugLineNum = 35;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 36;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="markers.initialize(vue,markerName).SetTag(\"gmap-m";
_markers._initialize /*b4j.example.vmelement*/ (ba,_vue,_markername)._settag /*b4j.example.vmelement*/ ("gmap-marker")._setattrsingle /*b4j.example.vmelement*/ (":position",(Object)("m.position"));
 //BA.debugLineNum = 38;BA.debugLine="markers.RemoveAttr(\":required\").RemoveAttr(\"v-sho";
_markers._removeattr /*b4j.example.vmelement*/ (":required")._removeattr /*b4j.example.vmelement*/ ("v-show")._removeattr /*b4j.example.vmelement*/ (":disabled");
 //BA.debugLineNum = 39;BA.debugLine="markers.SetAttrSingle(\"v-if\", $\"${ID}markersvisib";
_markers._setattrsingle /*b4j.example.vmelement*/ ("v-if",(Object)((""+__c.SmartStringFormatter("",(Object)(_id))+"markersvisible")));
 //BA.debugLineNum = 40;BA.debugLine="markers.SetAttrSingle(\":clickable\", True)";
_markers._setattrsingle /*b4j.example.vmelement*/ (":clickable",(Object)(__c.True));
 //BA.debugLineNum = 41;BA.debugLine="markers.SetAttrSingle(\":draggable\", True)";
_markers._setattrsingle /*b4j.example.vmelement*/ (":draggable",(Object)(__c.True));
 //BA.debugLineNum = 42;BA.debugLine="markers.SetVFor(\"(m,i)\", markerName)";
_markers._setvfor /*b4j.example.vmelement*/ ("(m,i)",_markername);
 //BA.debugLineNum = 43;BA.debugLine="markers.SetAttrSingle(\":key\", \"m.id\")";
_markers._setattrsingle /*b4j.example.vmelement*/ (":key",(Object)("m.id"));
 //BA.debugLineNum = 44;BA.debugLine="markers.SetAttrSingle(\"@click\", \"toggleinfowindow";
_markers._setattrsingle /*b4j.example.vmelement*/ ("@click",(Object)("toggleinfowindow(m,i)"));
 //BA.debugLineNum = 45;BA.debugLine="SetEvents";
_setevents();
 //BA.debugLineNum = 46;BA.debugLine="vue.SetStateSingle(markerName, Array())";
_vue._setstatesingle /*b4j.example.bananovue*/ (_markername,(Object)(new Object[]{}));
 //BA.debugLineNum = 47;BA.debugLine="points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="iwPosition = $\"${ID}iwpos\"$";
_iwposition = (""+__c.SmartStringFormatter("",(Object)(_id))+"iwpos");
 //BA.debugLineNum = 50;BA.debugLine="iwOptions = $\"${ID}opt\"$";
_iwoptions = (""+__c.SmartStringFormatter("",(Object)(_id))+"opt");
 //BA.debugLineNum = 51;BA.debugLine="iwOpen = $\"${ID}open\"$";
_iwopen = (""+__c.SmartStringFormatter("",(Object)(_id))+"open");
 //BA.debugLineNum = 52;BA.debugLine="curMidx = $\"${ID}midx\"$";
_curmidx = (""+__c.SmartStringFormatter("",(Object)(_id))+"midx");
 //BA.debugLineNum = 54;BA.debugLine="vue.setstatesingle(iwPosition, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_iwposition,__c.Null);
 //BA.debugLineNum = 55;BA.debugLine="vue.setstatesingle(iwOpen, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_iwopen,(Object)(__c.False));
 //BA.debugLineNum = 56;BA.debugLine="vue.setstatesingle(curMidx, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_curmidx,__c.Null);
 //BA.debugLineNum = 58;BA.debugLine="infoWindow.Initialize(vue, $\"${ID}iw\"$).SetTag(\"g";
_infowindow._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"iw"))._settag /*b4j.example.vmelement*/ ("gmap-info-window");
 //BA.debugLineNum = 59;BA.debugLine="infoWindow.RemoveAttr(\":required\").RemoveAttr(\"v-";
_infowindow._removeattr /*b4j.example.vmelement*/ (":required")._removeattr /*b4j.example.vmelement*/ ("v-show")._removeattr /*b4j.example.vmelement*/ (":disabled");
 //BA.debugLineNum = 60;BA.debugLine="infoWindow.SetAttrSingle(\":options\", iwOptions)";
_infowindow._setattrsingle /*b4j.example.vmelement*/ (":options",(Object)(_iwoptions));
 //BA.debugLineNum = 61;BA.debugLine="infoWindow.setattrsingle(\":position\", iwPosition)";
_infowindow._setattrsingle /*b4j.example.vmelement*/ (":position",(Object)(_iwposition));
 //BA.debugLineNum = 62;BA.debugLine="infoWindow.SetAttrSingle(\":opened\", iwOpen)";
_infowindow._setattrsingle /*b4j.example.vmelement*/ (":opened",(Object)(_iwopen));
 //BA.debugLineNum = 63;BA.debugLine="infoWindow.SetAttrSingle(\"@closeclick\", \"closeinf";
_infowindow._setattrsingle /*b4j.example.vmelement*/ ("@closeclick",(Object)("closeinfowindow"));
 //BA.debugLineNum = 65;BA.debugLine="Dim woptions As Map = CreateMap()";
_woptions = new anywheresoftware.b4a.objects.collections.Map();
_woptions = __c.createMap(new Object[] {});
 //BA.debugLineNum = 66;BA.debugLine="Dim pixelOffset As Map = CreateMap()";
_pixeloffset = new anywheresoftware.b4a.objects.collections.Map();
_pixeloffset = __c.createMap(new Object[] {});
 //BA.debugLineNum = 67;BA.debugLine="pixelOffset.Put(\"width\", 0)";
_pixeloffset.Put((Object)("width"),(Object)(0));
 //BA.debugLineNum = 68;BA.debugLine="pixelOffset.put(\"height\", -35)";
_pixeloffset.Put((Object)("height"),(Object)(-35));
 //BA.debugLineNum = 69;BA.debugLine="woptions.Put(\"content\", \"\")";
_woptions.Put((Object)("content"),(Object)(""));
 //BA.debugLineNum = 70;BA.debugLine="woptions.put(\"pixelOffset\", pixelOffset)";
_woptions.Put((Object)("pixelOffset"),(Object)(_pixeloffset.getObject()));
 //BA.debugLineNum = 71;BA.debugLine="vue.SetStateSingle(iwOptions, woptions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_iwoptions,(Object)(_woptions.getObject()));
 //BA.debugLineNum = 74;BA.debugLine="kmlLayer.Initialize(vue, kmlName).SetTag(\"google-";
_kmllayer._initialize /*b4j.example.vmelement*/ (ba,_vue,_kmlname)._settag /*b4j.example.vmelement*/ ("google-kml-layer");
 //BA.debugLineNum = 75;BA.debugLine="kmlLayer.RemoveAttr(\":required\").RemoveAttr(\"v-sh";
_kmllayer._removeattr /*b4j.example.vmelement*/ (":required")._removeattr /*b4j.example.vmelement*/ ("v-show")._removeattr /*b4j.example.vmelement*/ (":disabled");
 //BA.debugLineNum = 76;BA.debugLine="kmlLayer.SetAttrSingle(\"v-if\", $\"${ID}kmlvisible\"";
_kmllayer._setattrsingle /*b4j.example.vmelement*/ ("v-if",(Object)((""+__c.SmartStringFormatter("",(Object)(_id))+"kmlvisible")));
 //BA.debugLineNum = 77;BA.debugLine="vue.setstatesingle(kmlName, Array())";
_vue._setstatesingle /*b4j.example.bananovue*/ (_kmlname,(Object)(new Object[]{}));
 //BA.debugLineNum = 78;BA.debugLine="kmlLayer.SetAttrSingle(\":clickable\", True)";
_kmllayer._setattrsingle /*b4j.example.vmelement*/ (":clickable",(Object)(__c.True));
 //BA.debugLineNum = 79;BA.debugLine="kmlLayer.SetVFor(\"lyr\", kmlName)";
_kmllayer._setvfor /*b4j.example.vmelement*/ ("lyr",_kmlname);
 //BA.debugLineNum = 80;BA.debugLine="kmlLayer.SetAttrSingle(\":url\", \"lyr.url\")";
_kmllayer._setattrsingle /*b4j.example.vmelement*/ (":url",(Object)("lyr.url"));
 //BA.debugLineNum = 82;BA.debugLine="ShowKML(False)";
_showkml(__c.False);
 //BA.debugLineNum = 83;BA.debugLine="ShowMarkers(True)";
_showmarkers(__c.True);
 //BA.debugLineNum = 86;BA.debugLine="SetFullscreenControl(True)";
_setfullscreencontrol(__c.True);
 //BA.debugLineNum = 87;BA.debugLine="SetDisableDefaultUi(False)";
_setdisabledefaultui(__c.False);
 //BA.debugLineNum = 88;BA.debugLine="SetMapTypeControl(True)";
_setmaptypecontrol(__c.True);
 //BA.debugLineNum = 89;BA.debugLine="SetRotateControl(True)";
_setrotatecontrol(__c.True);
 //BA.debugLineNum = 90;BA.debugLine="SetStreetViewControl(True)";
_setstreetviewcontrol(__c.True);
 //BA.debugLineNum = 91;BA.debugLine="SetScaleControl(True)";
_setscalecontrol(__c.True);
 //BA.debugLineNum = 92;BA.debugLine="SetZoomControl(True)";
_setzoomcontrol(__c.True);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 326;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 160;BA.debugLine="vue.SetStateSingle(markerName, points)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_markername,(Object)(_points.getObject()));
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub Render";
 //BA.debugLineNum = 308;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub SetAttr(attr As Map) As VMGMap";
 //BA.debugLineNum = 337;BA.debugLine="GMap.SetAttr(attr)";
_gmap._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setattrsingle(String _prop,Object _val) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
 //BA.debugLineNum = 342;BA.debugLine="GMap.SetAttrSingle(prop, val)";
_gmap._setattrsingle /*b4j.example.vmelement*/ (_prop,_val);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setcenter(double _lat,double _lng) throws Exception{
String _pp = "";
anywheresoftware.b4a.objects.collections.Map _point = null;
 //BA.debugLineNum = 216;BA.debugLine="Sub SetCenter(lat As Double, lng As Double) As VMG";
 //BA.debugLineNum = 217;BA.debugLine="lat = BANano.parseFloat(lat)";
_lat = _banano.parseFloat((Object)(_lat));
 //BA.debugLineNum = 218;BA.debugLine="lng = BANano.parseFloat(lng)";
_lng = _banano.parseFloat((Object)(_lng));
 //BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${ID}center\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"center");
 //BA.debugLineNum = 221;BA.debugLine="Dim point As Map = CreateMap()";
_point = new anywheresoftware.b4a.objects.collections.Map();
_point = __c.createMap(new Object[] {});
 //BA.debugLineNum = 222;BA.debugLine="point.put(\"lat\", lat)";
_point.Put((Object)("lat"),(Object)(_lat));
 //BA.debugLineNum = 223;BA.debugLine="point.put(\"lng\", lng)";
_point.Put((Object)("lng"),(Object)(_lng));
 //BA.debugLineNum = 224;BA.debugLine="vue.SetStateSingle(pp, point)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_point.getObject()));
 //BA.debugLineNum = 225;BA.debugLine="GMap.SetAttrSingle(\":center\", pp)";
_gmap._setattrsingle /*b4j.example.vmelement*/ (":center",(Object)(_pp));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setdisabledefaultui(boolean _b) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetDisableDefaultUi(b As Boolean) As VMGMap";
 //BA.debugLineNum = 207;BA.debugLine="options.put(\"disableDefaultUi\", b)";
_options.Put((Object)("disableDefaultUi"),(Object)(_b));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public String  _setevents() throws Exception{
Object _m = null;
Object _i = null;
com.ab.banano.BANanoObject _cb = null;
com.ab.banano.BANanoEvent _e = null;
 //BA.debugLineNum = 142;BA.debugLine="private Sub SetEvents";
 //BA.debugLineNum = 143;BA.debugLine="Dim m, i As Object";
_m = new Object();
_i = new Object();
 //BA.debugLineNum = 144;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"tog";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(this,"toggleInfoWindow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m,_i}))));
 //BA.debugLineNum = 145;BA.debugLine="vue.SetCallBack(\"toggleInfoWindow\", cb)";
_vue._setcallback /*String*/ ("toggleInfoWindow",_cb);
 //BA.debugLineNum = 147;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 148;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"clo";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(this,"closeInfoWindow",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 149;BA.debugLine="vue.SetCallBack(\"closeInfoWindow\", cb)";
_vue._setcallback /*String*/ ("closeInfoWindow",_cb);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgmap  _setfullscreencontrol(boolean _b) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetFullscreenControl(b As Boolean) As VMGMap";
 //BA.debugLineNum = 212;BA.debugLine="options.put(\"fullscreenControl\", b)";
_options.Put((Object)("fullscreenControl"),(Object)(_b));
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetHeight(h As String) As VMGMap";
 //BA.debugLineNum = 238;BA.debugLine="SetStyleSingle(\"height\", h)";
_setstylesingle("height",(Object)(_h));
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setkmlurl(String _url) throws Exception{
anywheresoftware.b4a.objects.collections.List _kmlold = null;
anywheresoftware.b4a.objects.collections.List _kml = null;
anywheresoftware.b4a.objects.collections.Map _nl = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub SetKMLURL(url As String) As VMGMap";
 //BA.debugLineNum = 102;BA.debugLine="Dim kmlold As List";
_kmlold = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 103;BA.debugLine="Dim kml As List = vue.GetState(kmlName, kmlold)";
_kml = new anywheresoftware.b4a.objects.collections.List();
_kml.setObject((java.util.List)(_vue._getstate /*Object*/ (_kmlname,(Object)(_kmlold.getObject()))));
 //BA.debugLineNum = 104;BA.debugLine="Dim nl As Map = CreateMap()";
_nl = new anywheresoftware.b4a.objects.collections.Map();
_nl = __c.createMap(new Object[] {});
 //BA.debugLineNum = 105;BA.debugLine="nl.put(\"url\", url)";
_nl.Put((Object)("url"),(Object)(_url));
 //BA.debugLineNum = 106;BA.debugLine="kml.add(nl)";
_kml.Add((Object)(_nl.getObject()));
 //BA.debugLineNum = 107;BA.debugLine="vue.setstatesingle(kmlName, kml)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_kmlname,(Object)(_kml.getObject()));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptype(String _maptype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 247;BA.debugLine="Sub SetMapType(maptype As String) As VMGMap";
 //BA.debugLineNum = 248;BA.debugLine="Dim pp As String = $\"${ID}maptype\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"maptype");
 //BA.debugLineNum = 249;BA.debugLine="vue.setstatesingle(pp, maptype)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_maptype));
 //BA.debugLineNum = 250;BA.debugLine="SetAttrSingle(\":map-type-id\", pp)";
_setattrsingle(":map-type-id",(Object)(_pp));
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptypecontrol(boolean _b) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetMapTypeControl(b As Boolean) As VMGMap";
 //BA.debugLineNum = 202;BA.debugLine="options.put(\"mapTypeControl\", b)";
_options.Put((Object)("mapTypeControl"),(Object)(_b));
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptypehybrid() throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetMapTypeHybrid As VMGMap";
 //BA.debugLineNum = 266;BA.debugLine="SetMapType(\"hybrid\")";
_setmaptype("hybrid");
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptyperoadmap() throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetMapTypeRoadMap As VMGMap";
 //BA.debugLineNum = 255;BA.debugLine="SetMapType(\"roadmap\")";
_setmaptype("roadmap");
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptypesatellite() throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetMapTypeSatellite As VMGMap";
 //BA.debugLineNum = 260;BA.debugLine="SetMapType(\"satellite\")";
_setmaptype("satellite");
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setmaptypeterrain() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetMapTypeTerrain As VMGMap";
 //BA.debugLineNum = 271;BA.debugLine="SetMapType(\"terrain\")";
_setmaptype("terrain");
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub SetPadding(p As Object) As VMGMap";
 //BA.debugLineNum = 366;BA.debugLine="GMap.SetPaddingAll(p)";
_gmap._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setrotatecontrol(boolean _b) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetRotateControl(b As Boolean) As VMGMap";
 //BA.debugLineNum = 197;BA.debugLine="options.put(\"rotateControl\", b)";
_options.Put((Object)("rotateControl"),(Object)(_b));
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setscalecontrol(boolean _b) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetScaleControl(b As Boolean) As VMGMap";
 //BA.debugLineNum = 187;BA.debugLine="options.put(\"scaleControl\", b)";
_options.Put((Object)("scaleControl"),(Object)(_b));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setstreetviewcontrol(boolean _b) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetStreetViewControl(b As Boolean) As VMGMap";
 //BA.debugLineNum = 192;BA.debugLine="options.put(\"streetViewControl\", b)";
_options.Put((Object)("streetViewControl"),(Object)(_b));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetStyle(sm As Map) As VMGMap";
 //BA.debugLineNum = 348;BA.debugLine="GMap.SetStyle(sm)";
_gmap._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setstylesingle(String _prop,Object _val) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetStyleSingle(prop As String, val As Object)";
 //BA.debugLineNum = 353;BA.debugLine="GMap.setstylesingle(prop, val)";
_gmap._setstylesingle /*b4j.example.vmelement*/ (_prop,_val);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetText(t As Object) As VMGMap";
 //BA.debugLineNum = 320;BA.debugLine="GMap.SetText(t)";
_gmap._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetVIf(vif As Object) As VMGMap";
 //BA.debugLineNum = 287;BA.debugLine="GMap.SetVIf(vif)";
_gmap._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetVShow(vif As Object) As VMGMap";
 //BA.debugLineNum = 292;BA.debugLine="GMap.SetVShow(vif)";
_gmap._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setwidth(String _h) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetWidth(h As String) As VMGMap";
 //BA.debugLineNum = 243;BA.debugLine="SetStyleSingle(\"width\", h)";
_setstylesingle("width",(Object)(_h));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setzoom(int _z) throws Exception{
String _pp = "";
 //BA.debugLineNum = 229;BA.debugLine="Sub SetZoom(z As Int) As VMGMap";
 //BA.debugLineNum = 230;BA.debugLine="z = BANano.parseInt(z)";
_z = _banano.parseInt((Object)(_z));
 //BA.debugLineNum = 231;BA.debugLine="Dim pp As String = $\"${ID}zoom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"zoom");
 //BA.debugLineNum = 232;BA.debugLine="vue.SetStateSingle(pp, z)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_z));
 //BA.debugLineNum = 233;BA.debugLine="SetAttrSingle(\":zoom\", pp)";
_setattrsingle(":zoom",(Object)(_pp));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _setzoomcontrol(boolean _b) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetZoomControl(b As Boolean) As VMGMap";
 //BA.debugLineNum = 182;BA.debugLine="options.put(\"zoomControl\", b)";
_options.Put((Object)("zoomControl"),(Object)(_b));
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _show() throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub Show As VMGMap";
 //BA.debugLineNum = 302;BA.debugLine="GMap.Show";
_gmap._show /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _showinfowindow(boolean _b) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub ShowInfoWindow(b As Boolean) As VMGMap";
 //BA.debugLineNum = 97;BA.debugLine="vue.SetStateSingle(iwOpen, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_iwopen,(Object)(_b));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _showkml(boolean _b) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub ShowKML(b As Boolean) As VMGMap";
 //BA.debugLineNum = 116;BA.debugLine="vue.setstatesingle($\"${ID}kmlvisible\"$, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"kmlvisible"),(Object)(_b));
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _showmarkers(boolean _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub ShowMarkers(b As Boolean) As VMGMap";
 //BA.debugLineNum = 111;BA.debugLine="vue.setstatesingle($\"${ID}markersvisible\"$, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"markersvisible"),(Object)(_b));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgmap)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public String  _toggleinfowindow(anywheresoftware.b4a.objects.collections.Map _m,Object _i) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mo = null;
anywheresoftware.b4a.objects.collections.Map _infowindowpos = null;
String _mcontent = "";
anywheresoftware.b4a.objects.collections.Map _infooptions = null;
Object _cidx = null;
 //BA.debugLineNum = 124;BA.debugLine="private Sub toggleInfoWindow(m As Map, i As Object";
 //BA.debugLineNum = 125;BA.debugLine="Dim mo As Map = CreateMap()";
_mo = new anywheresoftware.b4a.objects.collections.Map();
_mo = __c.createMap(new Object[] {});
 //BA.debugLineNum = 126;BA.debugLine="Dim infoWindowPos As Map = m.Get(\"position\")";
_infowindowpos = new anywheresoftware.b4a.objects.collections.Map();
_infowindowpos.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_m.Get((Object)("position"))));
 //BA.debugLineNum = 127;BA.debugLine="Dim mcontent As String = m.Get(\"infoText\")";
_mcontent = BA.ObjectToString(_m.Get((Object)("infoText")));
 //BA.debugLineNum = 128;BA.debugLine="Dim infoOptions As Map = vue.GetState(iwOptions,";
_infooptions = new anywheresoftware.b4a.objects.collections.Map();
_infooptions.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_vue._getstate /*Object*/ (_iwoptions,(Object)(_mo.getObject()))));
 //BA.debugLineNum = 129;BA.debugLine="infoOptions.Put(\"content\", mcontent)";
_infooptions.Put((Object)("content"),(Object)(_mcontent));
 //BA.debugLineNum = 130;BA.debugLine="vue.setstatesingle(iwPosition, infoWindowPos)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_iwposition,(Object)(_infowindowpos.getObject()));
 //BA.debugLineNum = 131;BA.debugLine="vue.setstatesingle(iwOptions, infoOptions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_iwoptions,(Object)(_infooptions.getObject()));
 //BA.debugLineNum = 133;BA.debugLine="Dim cIdx As Object = vue.getstate(curMidx, Null)";
_cidx = _vue._getstate /*Object*/ (_curmidx,__c.Null);
 //BA.debugLineNum = 134;BA.debugLine="If cIdx = i Then";
if ((_cidx).equals(_i)) { 
 //BA.debugLineNum = 135;BA.debugLine="vue.ToggleState(iwOpen)";
_vue._togglestate /*b4j.example.bananovue*/ (_iwopen);
 }else {
 //BA.debugLineNum = 137;BA.debugLine="vue.SetStateSingle(iwOpen, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_iwopen,(Object)(__c.True));
 //BA.debugLineNum = 138;BA.debugLine="vue.setstatesingle(curMidx, i)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_curmidx,_i);
 };
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 278;BA.debugLine="vue.SetStateSingle($\"${ID}options\"$, options)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"options"),(Object)(_options.getObject()));
 //BA.debugLineNum = 279;BA.debugLine="vue.SetStateSingle(markerName, points)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_markername,(Object)(_points.getObject()));
 //BA.debugLineNum = 280;BA.debugLine="infoWindow.Pop(GMap)";
_infowindow._pop /*String*/ (_gmap);
 //BA.debugLineNum = 281;BA.debugLine="kmlLayer.pop(GMap)";
_kmllayer._pop /*String*/ (_gmap);
 //BA.debugLineNum = 282;BA.debugLine="markers.pop(GMap)";
_markers._pop /*String*/ (_gmap);
 //BA.debugLineNum = 283;BA.debugLine="Return GMap.ToString";
if (true) return _gmap._tostring /*String*/ ();
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
