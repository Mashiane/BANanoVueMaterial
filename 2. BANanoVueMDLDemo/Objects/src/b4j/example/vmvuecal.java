package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmvuecal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmvuecal", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmvuecal.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _vuecal = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.List _events = null;
public Object _module = null;
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
public b4j.example.vmvuecal  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub AddClass(c As String) As VMVueCal";
 //BA.debugLineNum = 219;BA.debugLine="VueCal.AddClass(c)";
_vuecal._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public String  _addevent(String _eid,String _estart,String _eend,String _etitle,String _eicon,String _econtent,String _econtentfull,String _eclass,boolean _eallday) throws Exception{
anywheresoftware.b4a.objects.collections.Map _event = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub AddEvent(eID As String, eStart As String, eEnd";
 //BA.debugLineNum = 94;BA.debugLine="Dim event As Map = CreateMap()";
_event = new anywheresoftware.b4a.objects.collections.Map();
_event = __c.createMap(new Object[] {});
 //BA.debugLineNum = 95;BA.debugLine="event.Put(\"id\", eID)";
_event.Put((Object)("id"),(Object)(_eid));
 //BA.debugLineNum = 96;BA.debugLine="event.Put(\"start\", eStart)";
_event.Put((Object)("start"),(Object)(_estart));
 //BA.debugLineNum = 97;BA.debugLine="event.Put(\"end\", eEnd)";
_event.Put((Object)("end"),(Object)(_eend));
 //BA.debugLineNum = 98;BA.debugLine="event.Put(\"title\", eTitle)";
_event.Put((Object)("title"),(Object)(_etitle));
 //BA.debugLineNum = 99;BA.debugLine="If eIcon <> \"\" Then event.Put(\"icon\", eIcon)";
if ((_eicon).equals("") == false) { 
_event.Put((Object)("icon"),(Object)(_eicon));};
 //BA.debugLineNum = 100;BA.debugLine="If eContent <> \"\" Then event.Put(\"content\", eCont";
if ((_econtent).equals("") == false) { 
_event.Put((Object)("content"),(Object)(_econtent));};
 //BA.debugLineNum = 101;BA.debugLine="If eContentFull <> \"\" Then event.Put(\"contentFull";
if ((_econtentfull).equals("") == false) { 
_event.Put((Object)("contentFull"),(Object)(_econtentfull));};
 //BA.debugLineNum = 102;BA.debugLine="If eClass <> \"\" Then event.Put(\"class\", eClass)";
if ((_eclass).equals("") == false) { 
_event.Put((Object)("class"),(Object)(_eclass));};
 //BA.debugLineNum = 103;BA.debugLine="If eAllDay Then event.Put(\"allDay\", eAllDay)";
if (_eallday) { 
_event.Put((Object)("allDay"),(Object)(_eallday));};
 //BA.debugLineNum = 104;BA.debugLine="events.Add(event)";
_events.Add((Object)(_event.getObject()));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public VueCal As VMElement";
_vuecal = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private events As List";
_events = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmvuecal  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler,String _width,String _height) throws Exception{
innerInitialize(_ba);
Object _event = null;
com.ab.banano.BANanoEvent _e = null;
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="BANano.DependsOnAsset(\"vuecal.css\")";
_banano.DependsOnAsset("vuecal.css");
 //BA.debugLineNum = 17;BA.debugLine="BANano.DependsOnAsset(\"vuecal.umd.min.js\")";
_banano.DependsOnAsset("vuecal.umd.min.js");
 //BA.debugLineNum = 18;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="VueCal.Initialize(vue, ID).SetTag(\"vue-cal\")";
_vuecal._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("vue-cal");
 //BA.debugLineNum = 22;BA.debugLine="Width = VueCal.MakePx(Width)";
_width = _vuecal._makepx /*String*/ (_width);
 //BA.debugLineNum = 23;BA.debugLine="Height = VueCal.MakePx(Height)";
_height = _vuecal._makepx /*String*/ (_height);
 //BA.debugLineNum = 24;BA.debugLine="VueCal.SetWidth(Width)";
_vuecal._setwidth /*b4j.example.vmelement*/ (_width);
 //BA.debugLineNum = 25;BA.debugLine="VueCal.SetHeight(Height)";
_vuecal._setheight /*b4j.example.vmelement*/ (_height);
 //BA.debugLineNum = 26;BA.debugLine="events.Initialize";
_events.Initialize();
 //BA.debugLineNum = 27;BA.debugLine="InitializeEvents";
_initializeevents();
 //BA.debugLineNum = 28;BA.debugLine="Dim event As Object, e As BANanoEvent";
_event = new Object();
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 29;BA.debugLine="SetOnEventClick(event, e)";
_setoneventclick(_event,_e);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _initializeevents() throws Exception{
String _evename = "";
 //BA.debugLineNum = 142;BA.debugLine="private Sub InitializeEvents As VMVueCal";
 //BA.debugLineNum = 143;BA.debugLine="Dim eveName As String = $\"${ID}events\"$";
_evename = (""+__c.SmartStringFormatter("",(Object)(_id))+"events");
 //BA.debugLineNum = 144;BA.debugLine="vue.SetStateSingle(eveName, Array())";
_vue._setstatesingle /*b4j.example.bananovue*/ (_evename,(Object)(new Object[]{}));
 //BA.debugLineNum = 145;BA.debugLine="VueCal.SetAttr1(\":events\", eveName)";
_vuecal._setattr1 /*b4j.example.vmelement*/ (":events",(Object)(_evename));
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _px) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub Pop(px As VMElement)";
 //BA.debugLineNum = 239;BA.debugLine="px.SetText(ToString)";
_px._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 156;BA.debugLine="SetEvents(events)";
_setevents(_events);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub Render";
 //BA.debugLineNum = 235;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmvuecal  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetAttr(attr As Map) As VMVueCal";
 //BA.debugLineNum = 225;BA.debugLine="VueCal.SetAttr(attr)";
_vuecal._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setdefaultview(String _v) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetDefaultView(v As String) As VMVueCal";
 //BA.debugLineNum = 126;BA.debugLine="If v = \"\" Then Return Me";
if ((_v).equals("")) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 127;BA.debugLine="VueCal.SetAttr1(\"default-view\", v)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("default-view",(Object)(_v));
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setdefaultviewday() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetDefaultViewDay As VMVueCal";
 //BA.debugLineNum = 138;BA.debugLine="VueCal.SetAttr1(\"default-view\", \"day\")";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("default-view",(Object)("day"));
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setdefaultviewmonth() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetDefaultViewMonth As VMVueCal";
 //BA.debugLineNum = 132;BA.debugLine="VueCal.SetAttr1(\"default-view\", \"month\")";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("default-view",(Object)("month"));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _seteditableevents(boolean _b) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetEditableEvents(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 34;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 35;BA.debugLine="VueCal.SetAttr1(\"editable-events\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("editable-events",(Object)(__c.True));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setevents(anywheresoftware.b4a.objects.collections.List _evelist) throws Exception{
String _evename = "";
 //BA.debugLineNum = 149;BA.debugLine="Sub SetEvents(eveList As List) As VMVueCal";
 //BA.debugLineNum = 150;BA.debugLine="Dim eveName As String = $\"${ID}events\"$";
_evename = (""+__c.SmartStringFormatter("",(Object)(_id))+"events");
 //BA.debugLineNum = 151;BA.debugLine="vue.SetStateSingle(eveName, eveList)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_evename,(Object)(_evelist.getObject()));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _seteventscountonyearview(boolean _b) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetEventsCountOnYearView(b As Boolean) As VMVu";
 //BA.debugLineNum = 59;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 60;BA.debugLine="VueCal.SetAttr1(\"events-count-on-year-view\", True";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("events-count-on-year-view",(Object)(__c.True));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _seteventsonmonthview(Object _eom) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetEventsOnMonthView(eom As Object) As VMVueCa";
 //BA.debugLineNum = 65;BA.debugLine="VueCal.SetAttr1(\"events-on-month-view\", eom)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("events-on-month-view",_eom);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _sethidetitlebar(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetHideTitleBar(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 46;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 47;BA.debugLine="VueCal.SetAttr1(\"hide-title-bar\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("hide-title-bar",(Object)(__c.True));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _sethideviewselector(boolean _b) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetHideViewSelector(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 82;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 83;BA.debugLine="VueCal.SetAttr1(\"hide-view-selector\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("hide-view-selector",(Object)(__c.True));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _sethideweekends(boolean _b) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetHideWeekends(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 76;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 77;BA.debugLine="VueCal.SetAttr1(\"hide-weekends\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("hide-weekends",(Object)(__c.True));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setid(String _iid,boolean _bind) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMVue";
 //BA.debugLineNum = 198;BA.debugLine="VueCal.SetID(iID,bind)";
_vuecal._setid /*b4j.example.vmelement*/ (_iid,_bind);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMVueC";
 //BA.debugLineNum = 208;BA.debugLine="VueCal.SetKey(k, bind)";
_vuecal._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setmaxdate(String _maxdate) throws Exception{
String _maxd = "";
 //BA.debugLineNum = 166;BA.debugLine="Sub SetMaxDate(maxDate As String) As VMVueCal";
 //BA.debugLineNum = 167;BA.debugLine="Dim maxd As String = $\"${ID}maxdate\"$";
_maxd = (""+__c.SmartStringFormatter("",(Object)(_id))+"maxdate");
 //BA.debugLineNum = 168;BA.debugLine="vue.SetStateSingle(maxd, maxDate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_maxd,(Object)(_maxdate));
 //BA.debugLineNum = 169;BA.debugLine="VueCal.SetAttr1(\":maxdate\", maxd)";
_vuecal._setattr1 /*b4j.example.vmelement*/ (":maxdate",(Object)(_maxd));
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setmindate(String _mindate) throws Exception{
String _mind = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub SetMinDate(minDate As String) As VMVueCal";
 //BA.debugLineNum = 160;BA.debugLine="Dim mind As String = $\"${ID}mindate\"$";
_mind = (""+__c.SmartStringFormatter("",(Object)(_id))+"mindate");
 //BA.debugLineNum = 161;BA.debugLine="vue.SetStateSingle(mind, minDate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_mind,(Object)(_mindate));
 //BA.debugLineNum = 162;BA.debugLine="VueCal.SetAttr1(\":mindate\", mind)";
_vuecal._setattr1 /*b4j.example.vmelement*/ (":mindate",(Object)(_mind));
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setname(String _nam,boolean _bind) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMV";
 //BA.debugLineNum = 203;BA.debugLine="VueCal.SetName(nam, bind)";
_vuecal._setname /*b4j.example.vmelement*/ (_nam,_bind);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setoneventclick(Object _event,com.ab.banano.BANanoEvent _e) throws Exception{
String _ekey = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 51;BA.debugLine="private Sub SetOnEventClick(event As Object, e As";
 //BA.debugLineNum = 52;BA.debugLine="Dim eKey As String = $\"${ID}_click\"$";
_ekey = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 53;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_ekey,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_event,(Object)(_e)}))));
 //BA.debugLineNum = 54;BA.debugLine="VueCal.SetAttr1(\":on-event-click\", cb)";
_vuecal._setattr1 /*b4j.example.vmelement*/ (":on-event-click",(Object)(_cb.getObject()));
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setshowalldayevents(boolean _b) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetShowAllDayEvents(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 40;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 41;BA.debugLine="VueCal.SetAttr1(\"show-all-day-events\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("show-all-day-events",(Object)(__c.True));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setshowweeknumbers(boolean _b) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetShowWeekNumbers(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 88;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 89;BA.debugLine="VueCal.SetAttr1(\"show-week-numbers\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("show-week-numbers",(Object)(__c.True));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setstartweekonsunday(boolean _b) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetStartWeekOnSunday(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 108;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 109;BA.debugLine="VueCal.SetAttr1(\"start-week-on-sunday\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("start-week-on-sunday",(Object)(__c.True));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetStyle(sm As Map) As VMVueCal";
 //BA.debugLineNum = 188;BA.debugLine="VueCal.SetStyle(sm)";
_vuecal._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetTabIndex(ti As String) As VMVueCal";
 //BA.debugLineNum = 181;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 182;BA.debugLine="VueCal.SetTabIndex(ti)";
_vuecal._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _settime(boolean _b) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetTime(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 71;BA.debugLine="VueCal.SetAttr1(\":time\", b)";
_vuecal._setattr1 /*b4j.example.vmelement*/ (":time",(Object)(_b));
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _settimestep(String _ts) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetTimeStep(ts As String) As VMVueCal";
 //BA.debugLineNum = 120;BA.debugLine="If ts = \"\" Then Return Me";
if ((_ts).equals("")) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 121;BA.debugLine="VueCal.SetAttr1(\"time-step\",ts)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("time-step",(Object)(_ts));
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _settodaybutton(boolean _b) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetTodayButton(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 114;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 115;BA.debugLine="VueCal.SetAttr1(\"today-button\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("today-button",(Object)(__c.True));
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetVIf(vif As String) As VMVueCal";
 //BA.debugLineNum = 193;BA.debugLine="VueCal.SetVIf(vif)";
_vuecal._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetVShow(vif As String) As VMVueCal";
 //BA.debugLineNum = 213;BA.debugLine="VueCal.SetVShow(vif)";
_vuecal._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setxsmall(boolean _b) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetXSmall(b As Boolean) As VMVueCal";
 //BA.debugLineNum = 175;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
 //BA.debugLineNum = 176;BA.debugLine="VueCal.SetAttr1(\"xsmall\", True)";
_vuecal._setattr1 /*b4j.example.vmelement*/ ("xsmall",(Object)(__c.True));
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 231;BA.debugLine="Return VueCal.tostring";
if (true) return _vuecal._tostring /*String*/ ();
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
