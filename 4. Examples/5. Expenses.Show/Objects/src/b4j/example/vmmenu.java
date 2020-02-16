package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmmenu.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _menu = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _menucontent = null;
public boolean _bactive = false;
public Object _eventhandler = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmmenu  _initialize(b4j.example.vmmenu __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_module}));}
RDebugUtils.currentLine=173015040;
 //BA.debugLineNum = 173015040;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=173015041;
 //BA.debugLineNum = 173015041;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=173015042;
 //BA.debugLineNum = 173015042;BA.debugLine="Menu.Initialize(v, ID)";
__ref._menu /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=173015043;
 //BA.debugLineNum = 173015043;BA.debugLine="Menu.SetTag(\"md-menu\")";
__ref._menu /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-menu");
RDebugUtils.currentLine=173015044;
 //BA.debugLineNum = 173015044;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=173015045;
 //BA.debugLineNum = 173015045;BA.debugLine="MenuContent.Initialize(vue,$\"${ID}content\"$).SetT";
__ref._menucontent /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"content"))._settag /*b4j.example.vmelement*/ (null,"md-menu-content");
RDebugUtils.currentLine=173015046;
 //BA.debugLineNum = 173015046;BA.debugLine="bActive = False";
__ref._bactive /*boolean*/  = __c.False;
RDebugUtils.currentLine=173015047;
 //BA.debugLineNum = 173015047;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=173015048;
 //BA.debugLineNum = 173015048;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173015049;
 //BA.debugLineNum = 173015049;BA.debugLine="End Sub";
return null;
}
public String  _addicontext(b4j.example.vmmenu __ref,String _itemid,String _iconname,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "addicontext", true))
	 {return ((String) Debug.delegate(ba, "addicontext", new Object[] {_itemid,_iconname,_text}));}
b4j.example.vmmenuitem _mi = null;
b4j.example.vmicon _icn = null;
b4j.example.vmelement _span = null;
RDebugUtils.currentLine=173342720;
 //BA.debugLineNum = 173342720;BA.debugLine="Sub AddIconText(itemID As String, iconName As Stri";
RDebugUtils.currentLine=173342721;
 //BA.debugLineNum = 173342721;BA.debugLine="Dim mi As VMMenuItem";
_mi = new b4j.example.vmmenuitem();
RDebugUtils.currentLine=173342722;
 //BA.debugLineNum = 173342722;BA.debugLine="mi.Initialize(vue,itemID, eventHandler)";
_mi._initialize /*b4j.example.vmmenuitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_itemid,__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=173342724;
 //BA.debugLineNum = 173342724;BA.debugLine="If iconName <> \"\" Then";
if ((_iconname).equals("") == false) { 
RDebugUtils.currentLine=173342725;
 //BA.debugLineNum = 173342725;BA.debugLine="Dim icn As VMIcon";
_icn = new b4j.example.vmicon();
RDebugUtils.currentLine=173342726;
 //BA.debugLineNum = 173342726;BA.debugLine="icn.Initialize(vue, $\"${itemID}icon\"$).SetText(i";
_icn._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_itemid))+"icon"))._settext /*b4j.example.vmicon*/ (null,_iconname);
RDebugUtils.currentLine=173342727;
 //BA.debugLineNum = 173342727;BA.debugLine="icn.Pop(mi.MenuItem)";
_icn._pop /*String*/ (null,_mi._menuitem /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=173342730;
 //BA.debugLineNum = 173342730;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
RDebugUtils.currentLine=173342731;
 //BA.debugLineNum = 173342731;BA.debugLine="span.Initialize(vue,$\"${itemID}text\"$).SetTag(\"sp";
_span._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_itemid))+"text"))._settag /*b4j.example.vmelement*/ (null,"span")._settext /*b4j.example.vmelement*/ (null,_text);
RDebugUtils.currentLine=173342732;
 //BA.debugLineNum = 173342732;BA.debugLine="span.Pop(mi.MenuItem)";
_span._pop /*String*/ (null,_mi._menuitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=173342733;
 //BA.debugLineNum = 173342733;BA.debugLine="mi.Pop(MenuContent)";
_mi._pop /*String*/ (null,__ref._menucontent /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=173342734;
 //BA.debugLineNum = 173342734;BA.debugLine="MenuContent.hasContent = True";
__ref._menucontent /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=173342735;
 //BA.debugLineNum = 173342735;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _addclass(b4j.example.vmmenu __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=174129152;
 //BA.debugLineNum = 174129152;BA.debugLine="Sub AddClass(c As String) As VMMenu";
RDebugUtils.currentLine=174129153;
 //BA.debugLineNum = 174129153;BA.debugLine="Menu.AddClass(c)";
__ref._menu /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=174129154;
 //BA.debugLineNum = 174129154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174129155;
 //BA.debugLineNum = 174129155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setcloseonclick(b4j.example.vmmenu __ref,boolean _varcloseonclick) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setcloseonclick", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setcloseonclick", new Object[] {_varcloseonclick}));}
RDebugUtils.currentLine=174522368;
 //BA.debugLineNum = 174522368;BA.debugLine="Sub SetCloseOnClick(varCloseOnClick As Boolean) As";
RDebugUtils.currentLine=174522369;
 //BA.debugLineNum = 174522369;BA.debugLine="SetAttr(CreateMap(\":md-close-on-click\": varCloseO";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)(":md-close-on-click"),(Object)(_varcloseonclick)}));
RDebugUtils.currentLine=174522370;
 //BA.debugLineNum = 174522370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174522371;
 //BA.debugLineNum = 174522371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setcloseonselect(b4j.example.vmmenu __ref,boolean _varcloseonselect) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setcloseonselect", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setcloseonselect", new Object[] {_varcloseonselect}));}
RDebugUtils.currentLine=174587904;
 //BA.debugLineNum = 174587904;BA.debugLine="Sub SetCloseOnSelect(varCloseOnSelect As Boolean)";
RDebugUtils.currentLine=174587905;
 //BA.debugLineNum = 174587905;BA.debugLine="SetAttr(CreateMap(\":md-close-on-select\": varClose";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)(":md-close-on-select"),(Object)(_varcloseonselect)}));
RDebugUtils.currentLine=174587906;
 //BA.debugLineNum = 174587906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174587907;
 //BA.debugLineNum = 174587907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setaligntrigger(b4j.example.vmmenu __ref,Object _varaligntrigger) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setaligntrigger", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setaligntrigger", new Object[] {_varaligntrigger}));}
RDebugUtils.currentLine=174981120;
 //BA.debugLineNum = 174981120;BA.debugLine="Sub SetAlignTrigger(varAlignTrigger As Object) As";
RDebugUtils.currentLine=174981121;
 //BA.debugLineNum = 174981121;BA.debugLine="SetAttr(CreateMap(\"md-align-trigger\": varAlignTri";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-align-trigger"),_varaligntrigger}));
RDebugUtils.currentLine=174981122;
 //BA.debugLineNum = 174981122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174981123;
 //BA.debugLineNum = 174981123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizeauto(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setsizeauto", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setsizeauto", new Object[] {_b}));}
RDebugUtils.currentLine=175505408;
 //BA.debugLineNum = 175505408;BA.debugLine="Sub SetSizeAuto(b As Boolean) As VMMenu    'ignore";
RDebugUtils.currentLine=175505409;
 //BA.debugLineNum = 175505409;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"auto\"))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-size"),(Object)("auto")}));
RDebugUtils.currentLine=175505410;
 //BA.debugLineNum = 175505410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=175505411;
 //BA.debugLineNum = 175505411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _seticon(b4j.example.vmmenu __ref,String _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "seticon", new Object[] {_icon}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=173080576;
 //BA.debugLineNum = 173080576;BA.debugLine="Sub SetIcon(icon As String) As VMMenu";
RDebugUtils.currentLine=173080577;
 //BA.debugLineNum = 173080577;BA.debugLine="If icon = \"\" Then Return Me";
if ((_icon).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
RDebugUtils.currentLine=173080578;
 //BA.debugLineNum = 173080578;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=173080579;
 //BA.debugLineNum = 173080579;BA.debugLine="btn.Initialize(vue, $\"${ID}icon\"$, eventHandler).";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon"),__ref._eventhandler /*Object*/ )._setmenutrigger /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=173080580;
 //BA.debugLineNum = 173080580;BA.debugLine="btn.SetIcon(icon).SetIconButton(True)";
_btn._seticon /*b4j.example.vmbutton*/ (null,_icon)._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=173080581;
 //BA.debugLineNum = 173080581;BA.debugLine="btn.Pop(Menu)";
_btn._pop /*String*/ (null,__ref._menu /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=173080582;
 //BA.debugLineNum = 173080582;BA.debugLine="SetDirectionBottomEnd(True)";
__ref._setdirectionbottomend /*b4j.example.vmmenu*/ (null,__c.True);
RDebugUtils.currentLine=173080583;
 //BA.debugLineNum = 173080583;BA.debugLine="SetAlignTrigger(True)";
__ref._setaligntrigger /*b4j.example.vmmenu*/ (null,(Object)(__c.True));
RDebugUtils.currentLine=173080584;
 //BA.debugLineNum = 173080584;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173080585;
 //BA.debugLineNum = 173080585;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmmenu __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=174063616;
 //BA.debugLineNum = 174063616;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=174063617;
 //BA.debugLineNum = 174063617;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=174063618;
 //BA.debugLineNum = 174063618;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _addchild(b4j.example.vmmenu __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=173801472;
 //BA.debugLineNum = 173801472;BA.debugLine="Sub AddChild(child As VMElement) As VMMenu";
RDebugUtils.currentLine=173801473;
 //BA.debugLineNum = 173801473;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=173801474;
 //BA.debugLineNum = 173801474;BA.debugLine="Menu.SetText(childHTML)";
__ref._menu /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=173801475;
 //BA.debugLineNum = 173801475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173801476;
 //BA.debugLineNum = 173801476;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmmenu __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=174325760;
 //BA.debugLineNum = 174325760;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=174325761;
 //BA.debugLineNum = 174325761;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=174325762;
 //BA.debugLineNum = 174325762;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmmenu*/ (null,_childx);
 }
};
RDebugUtils.currentLine=174325764;
 //BA.debugLineNum = 174325764;BA.debugLine="End Sub";
return "";
}
public String  _addmenuitem(b4j.example.vmmenu __ref,String _itemid,String _iconname,String _itemtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "addmenuitem", true))
	 {return ((String) Debug.delegate(ba, "addmenuitem", new Object[] {_itemid,_iconname,_itemtext}));}
RDebugUtils.currentLine=173277184;
 //BA.debugLineNum = 173277184;BA.debugLine="Sub AddMenuItem(itemID As String, iconName As Stri";
RDebugUtils.currentLine=173277185;
 //BA.debugLineNum = 173277185;BA.debugLine="AddIconText(itemID, iconName, itemText)";
__ref._addicontext /*String*/ (null,_itemid,_iconname,_itemtext);
RDebugUtils.currentLine=173277186;
 //BA.debugLineNum = 173277186;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmmenu __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=175570944;
 //BA.debugLineNum = 175570944;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=175570945;
 //BA.debugLineNum = 175570945;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=175570946;
 //BA.debugLineNum = 175570946;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=173408256;
 //BA.debugLineNum = 173408256;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=173408257;
 //BA.debugLineNum = 173408257;BA.debugLine="If MenuContent.hasContent Then MenuContent.Pop(Me";
if (__ref._menucontent /*b4j.example.vmelement*/ ._hascontent /*boolean*/ ) { 
__ref._menucontent /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._menu /*b4j.example.vmelement*/ );};
RDebugUtils.currentLine=173408258;
 //BA.debugLineNum = 173408258;BA.debugLine="Return Menu.ToString";
if (true) return __ref._menu /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=173408259;
 //BA.debugLineNum = 173408259;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
RDebugUtils.currentLine=172949504;
 //BA.debugLineNum = 172949504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=172949505;
 //BA.debugLineNum = 172949505;BA.debugLine="Public Menu As VMElement";
_menu = new b4j.example.vmelement();
RDebugUtils.currentLine=172949506;
 //BA.debugLineNum = 172949506;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=172949507;
 //BA.debugLineNum = 172949507;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=172949508;
 //BA.debugLineNum = 172949508;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=172949509;
 //BA.debugLineNum = 172949509;BA.debugLine="Private MenuContent As VMElement";
_menucontent = new b4j.example.vmelement();
RDebugUtils.currentLine=172949510;
 //BA.debugLineNum = 172949510;BA.debugLine="Private bActive As Boolean";
_bactive = false;
RDebugUtils.currentLine=172949511;
 //BA.debugLineNum = 172949511;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
RDebugUtils.currentLine=172949512;
 //BA.debugLineNum = 172949512;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=173735936;
 //BA.debugLineNum = 173735936;BA.debugLine="Sub Render";
RDebugUtils.currentLine=173735937;
 //BA.debugLineNum = 173735937;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=173735938;
 //BA.debugLineNum = 173735938;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenu  _setaccent(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=173998080;
 //BA.debugLineNum = 173998080;BA.debugLine="Sub SetAccent(b As Boolean) As VMMenu";
RDebugUtils.currentLine=173998081;
 //BA.debugLineNum = 173998081;BA.debugLine="Menu.SetAccent(True)";
__ref._menu /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=173998082;
 //BA.debugLineNum = 173998082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173998083;
 //BA.debugLineNum = 173998083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setactive(b4j.example.vmmenu __ref,Object _varactive) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setactive", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setactive", new Object[] {_varactive}));}
RDebugUtils.currentLine=174456832;
 //BA.debugLineNum = 174456832;BA.debugLine="Sub SetActive(varActive As Object) As VMMenu";
RDebugUtils.currentLine=174456833;
 //BA.debugLineNum = 174456833;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-active"),_varactive}));
RDebugUtils.currentLine=174456834;
 //BA.debugLineNum = 174456834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174456835;
 //BA.debugLineNum = 174456835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setattr(b4j.example.vmmenu __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=174194688;
 //BA.debugLineNum = 174194688;BA.debugLine="Sub SetAttr(attr As Map) As VMMenu";
RDebugUtils.currentLine=174194689;
 //BA.debugLineNum = 174194689;BA.debugLine="Menu.SetAttr(attr)";
__ref._menu /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=174194690;
 //BA.debugLineNum = 174194690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174194691;
 //BA.debugLineNum = 174194691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setactivesync(b4j.example.vmmenu __ref,String _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setactivesync", new Object[] {_v}));}
RDebugUtils.currentLine=173670400;
 //BA.debugLineNum = 173670400;BA.debugLine="Sub SetActiveSync(v As String) As VMMenu";
RDebugUtils.currentLine=173670401;
 //BA.debugLineNum = 173670401;BA.debugLine="Menu.SetActiveSync(v)";
__ref._menu /*b4j.example.vmelement*/ ._setactivesync /*b4j.example.vmelement*/ (null,_v);
RDebugUtils.currentLine=173670402;
 //BA.debugLineNum = 173670402;BA.debugLine="bActive = True";
__ref._bactive /*boolean*/  = __c.True;
RDebugUtils.currentLine=173670403;
 //BA.debugLineNum = 173670403;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173670404;
 //BA.debugLineNum = 173670404;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setbutton(b4j.example.vmmenu __ref,String _iconname,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setbutton", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setbutton", new Object[] {_iconname,_text}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=173211648;
 //BA.debugLineNum = 173211648;BA.debugLine="Sub SetButton(iconName As String, text As String)";
RDebugUtils.currentLine=173211649;
 //BA.debugLineNum = 173211649;BA.debugLine="If text = \"\" Then Return Me";
if ((_text).equals("")) { 
if (true) return (b4j.example.vmmenu)(this);};
RDebugUtils.currentLine=173211650;
 //BA.debugLineNum = 173211650;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=173211651;
 //BA.debugLineNum = 173211651;BA.debugLine="btn.Initialize(vue, $\"${ID}button\"$,eventHandler)";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"button"),__ref._eventhandler /*Object*/ )._setmenutrigger /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=173211652;
 //BA.debugLineNum = 173211652;BA.debugLine="If iconName <> \"\" Then";
if ((_iconname).equals("") == false) { 
RDebugUtils.currentLine=173211653;
 //BA.debugLineNum = 173211653;BA.debugLine="btn.SetIcon(iconName)";
_btn._seticon /*b4j.example.vmbutton*/ (null,_iconname);
 };
RDebugUtils.currentLine=173211655;
 //BA.debugLineNum = 173211655;BA.debugLine="btn.SetText(text)";
_btn._settext /*b4j.example.vmbutton*/ (null,_text);
RDebugUtils.currentLine=173211656;
 //BA.debugLineNum = 173211656;BA.debugLine="btn.Pop(Menu)";
_btn._pop /*String*/ (null,__ref._menu /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=173211657;
 //BA.debugLineNum = 173211657;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173211658;
 //BA.debugLineNum = 173211658;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirection(b4j.example.vmmenu __ref,Object _vardirection) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setdirection", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setdirection", new Object[] {_vardirection}));}
RDebugUtils.currentLine=174653440;
 //BA.debugLineNum = 174653440;BA.debugLine="Sub SetDirection(varDirection As Object) As VMMenu";
RDebugUtils.currentLine=174653441;
 //BA.debugLineNum = 174653441;BA.debugLine="SetAttr(CreateMap(\"md-direction\": varDirection))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),_vardirection}));
RDebugUtils.currentLine=174653442;
 //BA.debugLineNum = 174653442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174653443;
 //BA.debugLineNum = 174653443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirectionbottomend(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setdirectionbottomend", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setdirectionbottomend", new Object[] {_b}));}
RDebugUtils.currentLine=174784512;
 //BA.debugLineNum = 174784512;BA.debugLine="Sub SetDirectionBottomEnd(b As Boolean) As VMMenu";
RDebugUtils.currentLine=174784513;
 //BA.debugLineNum = 174784513;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom-end\"))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),(Object)("bottom-end")}));
RDebugUtils.currentLine=174784514;
 //BA.debugLineNum = 174784514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174784515;
 //BA.debugLineNum = 174784515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirectionbottomstart(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setdirectionbottomstart", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setdirectionbottomstart", new Object[] {_b}));}
RDebugUtils.currentLine=174718976;
 //BA.debugLineNum = 174718976;BA.debugLine="Sub SetDirectionBottomStart(b As Boolean) As VMMen";
RDebugUtils.currentLine=174718977;
 //BA.debugLineNum = 174718977;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom-start\")";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),(Object)("bottom-start")}));
RDebugUtils.currentLine=174718978;
 //BA.debugLineNum = 174718978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174718979;
 //BA.debugLineNum = 174718979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirectiontopend(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setdirectiontopend", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setdirectiontopend", new Object[] {_b}));}
RDebugUtils.currentLine=174915584;
 //BA.debugLineNum = 174915584;BA.debugLine="Sub SetDirectionTopEnd(b As Boolean) As VMMenu";
RDebugUtils.currentLine=174915585;
 //BA.debugLineNum = 174915585;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top-end\"))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),(Object)("top-end")}));
RDebugUtils.currentLine=174915586;
 //BA.debugLineNum = 174915586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174915587;
 //BA.debugLineNum = 174915587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setdirectiontopstart(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setdirectiontopstart", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setdirectiontopstart", new Object[] {_b}));}
RDebugUtils.currentLine=174850048;
 //BA.debugLineNum = 174850048;BA.debugLine="Sub SetDirectionTopStart(b As Boolean) As VMMenu";
RDebugUtils.currentLine=174850049;
 //BA.debugLineNum = 174850049;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top-start\"))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),(Object)("top-start")}));
RDebugUtils.currentLine=174850050;
 //BA.debugLineNum = 174850050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174850051;
 //BA.debugLineNum = 174850051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setimage(b4j.example.vmmenu __ref,String _imgurl,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setimage", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setimage", new Object[] {_imgurl,_txt}));}
b4j.example.vmavatar _avt = null;
RDebugUtils.currentLine=173146112;
 //BA.debugLineNum = 173146112;BA.debugLine="Sub SetImage(imgURL As String, txt As String) As V";
RDebugUtils.currentLine=173146113;
 //BA.debugLineNum = 173146113;BA.debugLine="Dim avt As VMAvatar";
_avt = new b4j.example.vmavatar();
RDebugUtils.currentLine=173146114;
 //BA.debugLineNum = 173146114;BA.debugLine="avt.Initialize(vue, $\"${ID}image\"$,eventHandler).";
_avt._initialize /*b4j.example.vmavatar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"image"),__ref._eventhandler /*Object*/ )._setalt /*b4j.example.vmavatar*/ (null,_txt)._setmenutrigger /*b4j.example.vmavatar*/ (null,__c.True);
RDebugUtils.currentLine=173146115;
 //BA.debugLineNum = 173146115;BA.debugLine="avt.SetValue(imgURL)";
_avt._setvalue /*b4j.example.vmavatar*/ (null,_imgurl);
RDebugUtils.currentLine=173146116;
 //BA.debugLineNum = 173146116;BA.debugLine="avt.Pop(Menu)";
_avt._pop /*String*/ (null,__ref._menu /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=173146117;
 //BA.debugLineNum = 173146117;BA.debugLine="SetDirectionBottomEnd(True)";
__ref._setdirectionbottomend /*b4j.example.vmmenu*/ (null,__c.True);
RDebugUtils.currentLine=173146118;
 //BA.debugLineNum = 173146118;BA.debugLine="SetAlignTrigger(True)";
__ref._setaligntrigger /*b4j.example.vmmenu*/ (null,(Object)(__c.True));
RDebugUtils.currentLine=173146119;
 //BA.debugLineNum = 173146119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173146120;
 //BA.debugLineNum = 173146120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setoffsetx(b4j.example.vmmenu __ref,Object _varoffsetx) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setoffsetx", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setoffsetx", new Object[] {_varoffsetx}));}
RDebugUtils.currentLine=175046656;
 //BA.debugLineNum = 175046656;BA.debugLine="Sub SetOffsetX(varOffsetX As Object) As VMMenu";
RDebugUtils.currentLine=175046657;
 //BA.debugLineNum = 175046657;BA.debugLine="SetAttr(CreateMap(\"md-offset-x\": varOffsetX))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-offset-x"),_varoffsetx}));
RDebugUtils.currentLine=175046658;
 //BA.debugLineNum = 175046658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=175046659;
 //BA.debugLineNum = 175046659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setoffsety(b4j.example.vmmenu __ref,Object _varoffsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setoffsety", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setoffsety", new Object[] {_varoffsety}));}
RDebugUtils.currentLine=175112192;
 //BA.debugLineNum = 175112192;BA.debugLine="Sub SetOffsetY(varOffsetY As Object) As VMMenu";
RDebugUtils.currentLine=175112193;
 //BA.debugLineNum = 175112193;BA.debugLine="SetAttr(CreateMap(\"md-offset-y\": varOffsetY))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-offset-y"),_varoffsety}));
RDebugUtils.currentLine=175112194;
 //BA.debugLineNum = 175112194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=175112195;
 //BA.debugLineNum = 175112195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setpadding(b4j.example.vmmenu __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=174391296;
 //BA.debugLineNum = 174391296;BA.debugLine="Sub SetPadding(p As Object) As VMMenu";
RDebugUtils.currentLine=174391297;
 //BA.debugLineNum = 174391297;BA.debugLine="Menu.SetPaddingAll(p)";
__ref._menu /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=174391298;
 //BA.debugLineNum = 174391298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174391299;
 //BA.debugLineNum = 174391299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setprimary(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=173932544;
 //BA.debugLineNum = 173932544;BA.debugLine="Sub SetPrimary(b As Boolean) As VMMenu";
RDebugUtils.currentLine=173932545;
 //BA.debugLineNum = 173932545;BA.debugLine="Menu.SetPrimary(True)";
__ref._menu /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=173932546;
 //BA.debugLineNum = 173932546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173932547;
 //BA.debugLineNum = 173932547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsize(b4j.example.vmmenu __ref,Object _varsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setsize", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setsize", new Object[] {_varsize}));}
RDebugUtils.currentLine=175177728;
 //BA.debugLineNum = 175177728;BA.debugLine="Sub SetSize(varSize As Object) As VMMenu";
RDebugUtils.currentLine=175177729;
 //BA.debugLineNum = 175177729;BA.debugLine="SetAttr(CreateMap(\"md-size\": varSize))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-size"),_varsize}));
RDebugUtils.currentLine=175177730;
 //BA.debugLineNum = 175177730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=175177731;
 //BA.debugLineNum = 175177731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizebig(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setsizebig", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setsizebig", new Object[] {_b}));}
RDebugUtils.currentLine=175374336;
 //BA.debugLineNum = 175374336;BA.debugLine="Sub SetSizeBig(b As Boolean) As VMMenu    'ignore";
RDebugUtils.currentLine=175374337;
 //BA.debugLineNum = 175374337;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"big\"))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-size"),(Object)("big")}));
RDebugUtils.currentLine=175374338;
 //BA.debugLineNum = 175374338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=175374339;
 //BA.debugLineNum = 175374339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizehuge(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setsizehuge", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setsizehuge", new Object[] {_b}));}
RDebugUtils.currentLine=175439872;
 //BA.debugLineNum = 175439872;BA.debugLine="Sub SetSizeHuge(b As Boolean) As VMMenu    'ignore";
RDebugUtils.currentLine=175439873;
 //BA.debugLineNum = 175439873;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"huge\"))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-size"),(Object)("huge")}));
RDebugUtils.currentLine=175439874;
 //BA.debugLineNum = 175439874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=175439875;
 //BA.debugLineNum = 175439875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizemedium(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setsizemedium", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setsizemedium", new Object[] {_b}));}
RDebugUtils.currentLine=175308800;
 //BA.debugLineNum = 175308800;BA.debugLine="Sub SetSizeMedium(b As Boolean) As VMMenu    'igno";
RDebugUtils.currentLine=175308801;
 //BA.debugLineNum = 175308801;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"medium\"))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-size"),(Object)("medium")}));
RDebugUtils.currentLine=175308802;
 //BA.debugLineNum = 175308802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=175308803;
 //BA.debugLineNum = 175308803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setsizesmall(b4j.example.vmmenu __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setsizesmall", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setsizesmall", new Object[] {_b}));}
RDebugUtils.currentLine=175243264;
 //BA.debugLineNum = 175243264;BA.debugLine="Sub SetSizeSmall(b As Boolean) As VMMenu    'ignor";
RDebugUtils.currentLine=175243265;
 //BA.debugLineNum = 175243265;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"small\"))";
__ref._setattr /*b4j.example.vmmenu*/ (null,__c.createMap(new Object[] {(Object)("md-size"),(Object)("small")}));
RDebugUtils.currentLine=175243266;
 //BA.debugLineNum = 175243266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=175243267;
 //BA.debugLineNum = 175243267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setstyle(b4j.example.vmmenu __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=174260224;
 //BA.debugLineNum = 174260224;BA.debugLine="Sub SetStyle(sm As Map) As VMMenu";
RDebugUtils.currentLine=174260225;
 //BA.debugLineNum = 174260225;BA.debugLine="Menu.SetStyle(sm)";
__ref._menu /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=174260226;
 //BA.debugLineNum = 174260226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=174260227;
 //BA.debugLineNum = 174260227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _settext(b4j.example.vmmenu __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=173867008;
 //BA.debugLineNum = 173867008;BA.debugLine="Sub SetText(t As Object) As VMMenu";
RDebugUtils.currentLine=173867009;
 //BA.debugLineNum = 173867009;BA.debugLine="Menu.SetText(t)";
__ref._menu /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=173867010;
 //BA.debugLineNum = 173867010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173867011;
 //BA.debugLineNum = 173867011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvif(b4j.example.vmmenu __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=173539328;
 //BA.debugLineNum = 173539328;BA.debugLine="Sub SetVIf(vif As Object) As VMMenu";
RDebugUtils.currentLine=173539329;
 //BA.debugLineNum = 173539329;BA.debugLine="Menu.SetVIf(vif)";
__ref._menu /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=173539330;
 //BA.debugLineNum = 173539330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173539331;
 //BA.debugLineNum = 173539331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvmodel(b4j.example.vmmenu __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=173473792;
 //BA.debugLineNum = 173473792;BA.debugLine="Sub SetVModel(k As String) As VMMenu";
RDebugUtils.currentLine=173473793;
 //BA.debugLineNum = 173473793;BA.debugLine="Menu.SetVModel(k)";
__ref._menu /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=173473794;
 //BA.debugLineNum = 173473794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173473795;
 //BA.debugLineNum = 173473795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _setvshow(b4j.example.vmmenu __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenu";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=173604864;
 //BA.debugLineNum = 173604864;BA.debugLine="Sub SetVShow(vif As Object) As VMMenu";
RDebugUtils.currentLine=173604865;
 //BA.debugLineNum = 173604865;BA.debugLine="Menu.SetVShow(vif)";
__ref._menu /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=173604866;
 //BA.debugLineNum = 173604866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenu)(this);
RDebugUtils.currentLine=173604867;
 //BA.debugLineNum = 173604867;BA.debugLine="End Sub";
return null;
}
}