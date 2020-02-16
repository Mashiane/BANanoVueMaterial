package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmlistview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmlist _listview = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hascontent = false;
public Object _eventhandler = null;
public anywheresoftware.b4a.objects.collections.Map _items = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmlistview  _initialize(b4j.example.vmlistview __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_module}));}
RDebugUtils.currentLine=169017344;
 //BA.debugLineNum = 169017344;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=169017345;
 //BA.debugLineNum = 169017345;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=169017346;
 //BA.debugLineNum = 169017346;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=169017347;
 //BA.debugLineNum = 169017347;BA.debugLine="ListView.Initialize(vue, ID,module)";
__ref._listview /*b4j.example.vmlist*/ ._initialize /*b4j.example.vmlist*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ ,_module);
RDebugUtils.currentLine=169017348;
 //BA.debugLineNum = 169017348;BA.debugLine="items.Initialize";
__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=169017349;
 //BA.debugLineNum = 169017349;BA.debugLine="HasContent = False";
__ref._hascontent /*boolean*/  = __c.False;
RDebugUtils.currentLine=169017350;
 //BA.debugLineNum = 169017350;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=169017351;
 //BA.debugLineNum = 169017351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169017352;
 //BA.debugLineNum = 169017352;BA.debugLine="End Sub";
return null;
}
public String  _addavatar(b4j.example.vmlistview __ref,String _key,String _imgurl,String _text,Object _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "addavatar", true))
	 {return ((String) Debug.delegate(ba, "addavatar", new Object[] {_key,_imgurl,_text,_badge}));}
b4j.example.vmlistitem _item = null;
RDebugUtils.currentLine=169148416;
 //BA.debugLineNum = 169148416;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, tex";
RDebugUtils.currentLine=169148417;
 //BA.debugLineNum = 169148417;BA.debugLine="key = key.tolowercase";
_key = _key.toLowerCase();
RDebugUtils.currentLine=169148418;
 //BA.debugLineNum = 169148418;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
RDebugUtils.currentLine=169148419;
 //BA.debugLineNum = 169148419;BA.debugLine="item.Initialize(vue, key,eventHandler)";
_item._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=169148420;
 //BA.debugLineNum = 169148420;BA.debugLine="item.SetAvatar(imgURL)";
_item._setavatar /*b4j.example.vmlistitem*/ (null,_imgurl);
RDebugUtils.currentLine=169148421;
 //BA.debugLineNum = 169148421;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=169148422;
 //BA.debugLineNum = 169148422;BA.debugLine="If badge <> Null Then item.SetBadge(badge,True,\"t";
if (_badge!= null) { 
_item._setbadge /*b4j.example.vmlistitem*/ (null,(int)(BA.ObjectToNumber(_badge)),__c.True,"top",__c.True,__c.False);};
RDebugUtils.currentLine=169148423;
 //BA.debugLineNum = 169148423;BA.debugLine="items.Put(key, item)";
__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_item));
RDebugUtils.currentLine=169148424;
 //BA.debugLineNum = 169148424;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistview  _addclass(b4j.example.vmlistview __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=169934848;
 //BA.debugLineNum = 169934848;BA.debugLine="Sub AddClass(c As String) As VMListView";
RDebugUtils.currentLine=169934849;
 //BA.debugLineNum = 169934849;BA.debugLine="ListView.AddClass(c)";
__ref._listview /*b4j.example.vmlist*/ ._addclass /*b4j.example.vmlist*/ (null,_c);
RDebugUtils.currentLine=169934850;
 //BA.debugLineNum = 169934850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169934851;
 //BA.debugLineNum = 169934851;BA.debugLine="End Sub";
return null;
}
public String  _additem(b4j.example.vmlistview __ref,String _key,String _icon,String _text,Object _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_key,_icon,_text,_badge}));}
b4j.example.vmlistitem _item = null;
RDebugUtils.currentLine=169279488;
 //BA.debugLineNum = 169279488;BA.debugLine="Sub AddItem(key As String, icon As String, text As";
RDebugUtils.currentLine=169279489;
 //BA.debugLineNum = 169279489;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
RDebugUtils.currentLine=169279490;
 //BA.debugLineNum = 169279490;BA.debugLine="item.Initialize(vue, key,eventHandler)";
_item._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=169279491;
 //BA.debugLineNum = 169279491;BA.debugLine="item.SetIcon(icon, False)";
_item._seticon /*b4j.example.vmlistitem*/ (null,_icon,__c.False);
RDebugUtils.currentLine=169279492;
 //BA.debugLineNum = 169279492;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=169279493;
 //BA.debugLineNum = 169279493;BA.debugLine="If badge <> Null Then item.SetBadge(badge,True,\"t";
if (_badge!= null) { 
_item._setbadge /*b4j.example.vmlistitem*/ (null,(int)(BA.ObjectToNumber(_badge)),__c.True,"top",__c.True,__c.False);};
RDebugUtils.currentLine=169279494;
 //BA.debugLineNum = 169279494;BA.debugLine="items.Put(key, item)";
__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_item));
RDebugUtils.currentLine=169279495;
 //BA.debugLineNum = 169279495;BA.debugLine="End Sub";
return "";
}
public String  _addsubavatar(b4j.example.vmlistview __ref,String _parent,String _key,String _imgurl,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "addsubavatar", true))
	 {return ((String) Debug.delegate(ba, "addsubavatar", new Object[] {_parent,_key,_imgurl,_text}));}
b4j.example.vmlistitem _li = null;
b4j.example.vmlist _pl = null;
b4j.example.vmlistitem _item = null;
RDebugUtils.currentLine=169213952;
 //BA.debugLineNum = 169213952;BA.debugLine="Sub AddSubAvatar(parent As String, key As String,";
RDebugUtils.currentLine=169213953;
 //BA.debugLineNum = 169213953;BA.debugLine="If items.ContainsKey(parent) Then";
if (__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_parent))) { 
RDebugUtils.currentLine=169213954;
 //BA.debugLineNum = 169213954;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
_li = (b4j.example.vmlistitem)(__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent)));
RDebugUtils.currentLine=169213955;
 //BA.debugLineNum = 169213955;BA.debugLine="Dim pl As VMList = li.childList";
_pl = _li._childlist /*b4j.example.vmlist*/ ;
RDebugUtils.currentLine=169213956;
 //BA.debugLineNum = 169213956;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
RDebugUtils.currentLine=169213957;
 //BA.debugLineNum = 169213957;BA.debugLine="item.Initialize(vue, key,eventHandler)";
_item._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=169213958;
 //BA.debugLineNum = 169213958;BA.debugLine="item.SetAvatar(imgURL)";
_item._setavatar /*b4j.example.vmlistitem*/ (null,_imgurl);
RDebugUtils.currentLine=169213959;
 //BA.debugLineNum = 169213959;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=169213960;
 //BA.debugLineNum = 169213960;BA.debugLine="item.Pop(pl)";
_item._pop /*String*/ (null,_pl);
 };
RDebugUtils.currentLine=169213962;
 //BA.debugLineNum = 169213962;BA.debugLine="End Sub";
return "";
}
public String  _addsubitem(b4j.example.vmlistview __ref,String _parent,String _key,String _icon,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "addsubitem", true))
	 {return ((String) Debug.delegate(ba, "addsubitem", new Object[] {_parent,_key,_icon,_text}));}
b4j.example.vmlistitem _li = null;
b4j.example.vmlist _pl = null;
b4j.example.vmlistitem _item = null;
RDebugUtils.currentLine=169345024;
 //BA.debugLineNum = 169345024;BA.debugLine="Sub AddSubItem(parent As String, key As String, ic";
RDebugUtils.currentLine=169345025;
 //BA.debugLineNum = 169345025;BA.debugLine="If items.ContainsKey(parent) Then";
if (__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_parent))) { 
RDebugUtils.currentLine=169345026;
 //BA.debugLineNum = 169345026;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
_li = (b4j.example.vmlistitem)(__ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_parent)));
RDebugUtils.currentLine=169345027;
 //BA.debugLineNum = 169345027;BA.debugLine="Dim pl As VMList = li.childList";
_pl = _li._childlist /*b4j.example.vmlist*/ ;
RDebugUtils.currentLine=169345028;
 //BA.debugLineNum = 169345028;BA.debugLine="Dim item As VMListItem";
_item = new b4j.example.vmlistitem();
RDebugUtils.currentLine=169345029;
 //BA.debugLineNum = 169345029;BA.debugLine="item.Initialize(vue, key, eventHandler)";
_item._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=169345030;
 //BA.debugLineNum = 169345030;BA.debugLine="item.SetIcon(icon, False)";
_item._seticon /*b4j.example.vmlistitem*/ (null,_icon,__c.False);
RDebugUtils.currentLine=169345031;
 //BA.debugLineNum = 169345031;BA.debugLine="item.SetText(text)";
_item._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=169345032;
 //BA.debugLineNum = 169345032;BA.debugLine="item.SetInset(True)";
_item._setinset /*b4j.example.vmlistitem*/ (null,__c.True);
RDebugUtils.currentLine=169345033;
 //BA.debugLineNum = 169345033;BA.debugLine="item.Pop(pl)";
_item._pop /*String*/ (null,_pl);
 };
RDebugUtils.currentLine=169345035;
 //BA.debugLineNum = 169345035;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmlistview __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=170328064;
 //BA.debugLineNum = 170328064;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=170328065;
 //BA.debugLineNum = 170328065;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=170328066;
 //BA.debugLineNum = 170328066;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
b4j.example.vmlistitem _item = null;
b4j.example.vmlist _cl = null;
RDebugUtils.currentLine=170131456;
 //BA.debugLineNum = 170131456;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=170131457;
 //BA.debugLineNum = 170131457;BA.debugLine="For Each item As VMListItem In items.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._items /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = (b4j.example.vmlistitem)(group1.Get(index1));
RDebugUtils.currentLine=170131458;
 //BA.debugLineNum = 170131458;BA.debugLine="Dim cl As VMList = item.childList";
_cl = _item._childlist /*b4j.example.vmlist*/ ;
RDebugUtils.currentLine=170131459;
 //BA.debugLineNum = 170131459;BA.debugLine="If cl.HasContent Then item.SetList(cl)";
if (_cl._hascontent /*boolean*/ ) { 
_item._setlist /*b4j.example.vmlistitem*/ (null,_cl);};
RDebugUtils.currentLine=170131460;
 //BA.debugLineNum = 170131460;BA.debugLine="item.Pop(ListView)";
_item._pop /*String*/ (null,__ref._listview /*b4j.example.vmlist*/ );
 }
};
RDebugUtils.currentLine=170131462;
 //BA.debugLineNum = 170131462;BA.debugLine="Return ListView.tostring";
if (true) return __ref._listview /*b4j.example.vmlist*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=170131463;
 //BA.debugLineNum = 170131463;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
RDebugUtils.currentLine=168951808;
 //BA.debugLineNum = 168951808;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=168951809;
 //BA.debugLineNum = 168951809;BA.debugLine="Public ListView As VMList";
_listview = new b4j.example.vmlist();
RDebugUtils.currentLine=168951810;
 //BA.debugLineNum = 168951810;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=168951811;
 //BA.debugLineNum = 168951811;BA.debugLine="Public vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=168951812;
 //BA.debugLineNum = 168951812;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
RDebugUtils.currentLine=168951813;
 //BA.debugLineNum = 168951813;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
RDebugUtils.currentLine=168951814;
 //BA.debugLineNum = 168951814;BA.debugLine="Private items As Map";
_items = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=168951815;
 //BA.debugLineNum = 168951815;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistview  _expanditem(b4j.example.vmlistview __ref,String _sid,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "expanditem", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "expanditem", new Object[] {_sid,_b}));}
String _syncid = "";
RDebugUtils.currentLine=169410560;
 //BA.debugLineNum = 169410560;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VML";
RDebugUtils.currentLine=169410561;
 //BA.debugLineNum = 169410561;BA.debugLine="Dim syncid As String = $\"${ID}sync\"$";
_syncid = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"sync");
RDebugUtils.currentLine=169410562;
 //BA.debugLineNum = 169410562;BA.debugLine="vue.SetStateSingle(syncid, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_syncid,(Object)(_b));
RDebugUtils.currentLine=169410563;
 //BA.debugLineNum = 169410563;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169410564;
 //BA.debugLineNum = 169410564;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmlistview __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=170262528;
 //BA.debugLineNum = 170262528;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=170262529;
 //BA.debugLineNum = 170262529;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=170262530;
 //BA.debugLineNum = 170262530;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=170196992;
 //BA.debugLineNum = 170196992;BA.debugLine="Sub Render";
RDebugUtils.currentLine=170196993;
 //BA.debugLineNum = 170196993;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=170196994;
 //BA.debugLineNum = 170196994;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistview  _setattr(b4j.example.vmlistview __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=170000384;
 //BA.debugLineNum = 170000384;BA.debugLine="Sub SetAttr(attr As Map) As VMListView";
RDebugUtils.currentLine=170000385;
 //BA.debugLineNum = 170000385;BA.debugLine="ListView.SetAttr(attr)";
__ref._listview /*b4j.example.vmlist*/ ._setattr /*b4j.example.vmlist*/ (null,_attr);
RDebugUtils.currentLine=170000386;
 //BA.debugLineNum = 170000386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=170000387;
 //BA.debugLineNum = 170000387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setborder(b4j.example.vmlistview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "setborder", new Object[] {_b}));}
RDebugUtils.currentLine=169803776;
 //BA.debugLineNum = 169803776;BA.debugLine="Sub SetBorder(b As Boolean) As VMListView";
RDebugUtils.currentLine=169803777;
 //BA.debugLineNum = 169803777;BA.debugLine="If b Then SetStyle(CreateMap(\"border\": \"1px solid";
if (_b) { 
__ref._setstyle /*b4j.example.vmlistview*/ (null,__c.createMap(new Object[] {(Object)("border"),(Object)("1px solid rgba(#000, .12)")}));};
RDebugUtils.currentLine=169803778;
 //BA.debugLineNum = 169803778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169803779;
 //BA.debugLineNum = 169803779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setstyle(b4j.example.vmlistview __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=169738240;
 //BA.debugLineNum = 169738240;BA.debugLine="Sub SetStyle(m As Map) As VMListView";
RDebugUtils.currentLine=169738241;
 //BA.debugLineNum = 169738241;BA.debugLine="ListView.SetStyle(m)";
__ref._listview /*b4j.example.vmlist*/ ._setstyle /*b4j.example.vmlist*/ (null,_m);
RDebugUtils.currentLine=169738242;
 //BA.debugLineNum = 169738242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169738243;
 //BA.debugLineNum = 169738243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setdense(b4j.example.vmlistview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "setdense", new Object[] {_b}));}
RDebugUtils.currentLine=169607168;
 //BA.debugLineNum = 169607168;BA.debugLine="Sub SetDense(b As Boolean) As VMListView";
RDebugUtils.currentLine=169607169;
 //BA.debugLineNum = 169607169;BA.debugLine="If b Then AddClass(\"md-dense\")";
if (_b) { 
__ref._addclass /*b4j.example.vmlistview*/ (null,"md-dense");};
RDebugUtils.currentLine=169607170;
 //BA.debugLineNum = 169607170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169607171;
 //BA.debugLineNum = 169607171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setdisabled(b4j.example.vmlistview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=169082880;
 //BA.debugLineNum = 169082880;BA.debugLine="Sub SetDisabled(b As Boolean) As VMListView";
RDebugUtils.currentLine=169082881;
 //BA.debugLineNum = 169082881;BA.debugLine="ListView.SetDisabled(b)";
__ref._listview /*b4j.example.vmlist*/ ._setdisabled /*b4j.example.vmlist*/ (null,_b);
RDebugUtils.currentLine=169082882;
 //BA.debugLineNum = 169082882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169082883;
 //BA.debugLineNum = 169082883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setelevation(b4j.example.vmlistview __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=169869312;
 //BA.debugLineNum = 169869312;BA.debugLine="Sub SetElevation(e As Int) As VMListView";
RDebugUtils.currentLine=169869313;
 //BA.debugLineNum = 169869313;BA.debugLine="ListView.SetElevation(e)";
__ref._listview /*b4j.example.vmlist*/ ._setelevation /*b4j.example.vmlist*/ (null,_e);
RDebugUtils.currentLine=169869314;
 //BA.debugLineNum = 169869314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169869315;
 //BA.debugLineNum = 169869315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _settabindex(b4j.example.vmlistview __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=169476096;
 //BA.debugLineNum = 169476096;BA.debugLine="Sub SetTabIndex(ti As String) As VMListView";
RDebugUtils.currentLine=169476097;
 //BA.debugLineNum = 169476097;BA.debugLine="ListView.SetTabIndex(ti)";
__ref._listview /*b4j.example.vmlist*/ ._settabindex /*b4j.example.vmlist*/ (null,_ti);
RDebugUtils.currentLine=169476098;
 //BA.debugLineNum = 169476098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169476099;
 //BA.debugLineNum = 169476099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _settext(b4j.example.vmlistview __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=170065920;
 //BA.debugLineNum = 170065920;BA.debugLine="Sub SetText(t As String) As VMListView";
RDebugUtils.currentLine=170065921;
 //BA.debugLineNum = 170065921;BA.debugLine="ListView.SetText(t)";
__ref._listview /*b4j.example.vmlist*/ ._settext /*b4j.example.vmlist*/ (null,_t);
RDebugUtils.currentLine=170065922;
 //BA.debugLineNum = 170065922;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=170065923;
 //BA.debugLineNum = 170065923;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=170065924;
 //BA.debugLineNum = 170065924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setvif(b4j.example.vmlistview __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=169672704;
 //BA.debugLineNum = 169672704;BA.debugLine="Sub SetVIf(vif As Object) As VMListView";
RDebugUtils.currentLine=169672705;
 //BA.debugLineNum = 169672705;BA.debugLine="ListView.SetVIf(vif)";
__ref._listview /*b4j.example.vmlist*/ ._setvif /*b4j.example.vmlist*/ (null,_vif);
RDebugUtils.currentLine=169672706;
 //BA.debugLineNum = 169672706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169672707;
 //BA.debugLineNum = 169672707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _setvshow(b4j.example.vmlistview __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistview";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=169541632;
 //BA.debugLineNum = 169541632;BA.debugLine="Sub SetVShow(vif As Object) As VMListView";
RDebugUtils.currentLine=169541633;
 //BA.debugLineNum = 169541633;BA.debugLine="ListView.SetVShow(vif)";
__ref._listview /*b4j.example.vmlist*/ ._setvshow /*b4j.example.vmlist*/ (null,_vif);
RDebugUtils.currentLine=169541634;
 //BA.debugLineNum = 169541634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistview)(this);
RDebugUtils.currentLine=169541635;
 //BA.debugLineNum = 169541635;BA.debugLine="End Sub";
return null;
}
}