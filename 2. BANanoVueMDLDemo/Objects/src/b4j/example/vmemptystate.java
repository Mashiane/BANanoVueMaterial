package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmemptystate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmemptystate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmemptystate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _emptystate = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
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
public b4j.example.vmemptystate  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 44;BA.debugLine="Sub AddChild(child As VMElement) As VMEmptyState";
 //BA.debugLineNum = 45;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="EmptyState.SetText(childHTML)";
_emptystate._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 51;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 52;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 53;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmemptystate  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub AddClass(c As String) As VMEmptyState";
 //BA.debugLineNum = 111;BA.debugLine="EmptyState.AddClass(c)";
_emptystate._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _addhtml(String _html) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub AddHTML(html As String) As VMEmptyState";
 //BA.debugLineNum = 39;BA.debugLine="EmptyState.SetText(html)";
_emptystate._settext /*b4j.example.vmelement*/ (_html);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 135;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public EmptyState As VMElement";
_emptystate = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmemptystate  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 11;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 12;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 13;BA.debugLine="EmptyState.Initialize(vue, ID).SetTag(\"md-empty-s";
_emptystate._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-empty-state");
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 130;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub Render";
 //BA.debugLineNum = 126;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmemptystate  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetAccent(b As Boolean) As VMEmptyState";
 //BA.debugLineNum = 99;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmemptystate)(this);};
 //BA.debugLineNum = 100;BA.debugLine="EmptyState.AddClass(\"md-accent\")";
_emptystate._addclass /*b4j.example.vmelement*/ ("md-accent");
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetAttr(attr As Map) As VMEmptyState";
 //BA.debugLineNum = 117;BA.debugLine="EmptyState.SetAttr(attr)";
_emptystate._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setdescription(String _labelx) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetDescription(labelx As String) As VMEmptySta";
 //BA.debugLineNum = 75;BA.debugLine="If labelx = \"\" Then Return Me";
if ((_labelx).equals("")) { 
if (true) return (b4j.example.vmemptystate)(this);};
 //BA.debugLineNum = 76;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-description\": la";
_emptystate._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-description"),(Object)(_labelx)}));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _seticon(String _icon) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetIcon(icon As String) As VMEmptyState";
 //BA.debugLineNum = 63;BA.debugLine="If icon = \"\" Then Return Me";
if ((_icon).equals("")) { 
if (true) return (b4j.example.vmemptystate)(this);};
 //BA.debugLineNum = 64;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-icon\": icon))";
_emptystate._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-icon"),(Object)(_icon)}));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setid(String _iid,boolean _bind) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMEmp";
 //BA.debugLineNum = 29;BA.debugLine="EmptyState.SetID(iID,bind)";
_emptystate._setid /*b4j.example.vmelement*/ (_iid,_bind);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMEmpt";
 //BA.debugLineNum = 58;BA.debugLine="EmptyState.SetKey(k, bind)";
_emptystate._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setlabel(String _labelx) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetLabel(labelx As String) As VMEmptyState";
 //BA.debugLineNum = 69;BA.debugLine="If labelx = \"\" Then Return Me";
if ((_labelx).equals("")) { 
if (true) return (b4j.example.vmemptystate)(this);};
 //BA.debugLineNum = 70;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-label\": labelx))";
_emptystate._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-label"),(Object)(_labelx)}));
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setname(String _nam,boolean _bind) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VME";
 //BA.debugLineNum = 34;BA.debugLine="EmptyState.SetName(nam, bind)";
_emptystate._setname /*b4j.example.vmelement*/ (_nam,_bind);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetPrimary(b As Boolean) As VMEmptyState";
 //BA.debugLineNum = 93;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmemptystate)(this);};
 //BA.debugLineNum = 94;BA.debugLine="EmptyState.AddClass(\"md-primary\")";
_emptystate._addclass /*b4j.example.vmelement*/ ("md-primary");
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setrounded(boolean _b) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetRounded(b As Boolean) As VMEmptyState";
 //BA.debugLineNum = 81;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmemptystate)(this);};
 //BA.debugLineNum = 82;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-rounded\": b))";
_emptystate._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-rounded"),(Object)(_b)}));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setsize(String _size) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetSize(size As String) As VMEmptyState";
 //BA.debugLineNum = 87;BA.debugLine="If size = \"\" Then Return Me";
if ((_size).equals("")) { 
if (true) return (b4j.example.vmemptystate)(this);};
 //BA.debugLineNum = 88;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-size\": size))";
_emptystate._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("md-size"),(Object)(_size)}));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetStyle(sm As Map) As VMEmptyState";
 //BA.debugLineNum = 19;BA.debugLine="EmptyState.SetStyle(sm)";
_emptystate._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetVIf(vif As String) As VMEmptyState";
 //BA.debugLineNum = 24;BA.debugLine="EmptyState.SetVIf(vif)";
_emptystate._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetVShow(vif As String) As VMEmptyState";
 //BA.debugLineNum = 105;BA.debugLine="EmptyState.SetVShow(vif)";
_emptystate._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmemptystate)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 122;BA.debugLine="Return EmptyState.tostring";
if (true) return _emptystate._tostring /*String*/ ();
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
