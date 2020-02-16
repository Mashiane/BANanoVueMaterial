package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmlistitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistitem.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _listitem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmelement _txt = null;
public boolean _hastext = false;
public boolean _hasaction = false;
public b4j.example.vmbutton _btn = null;
public boolean _hasicon = false;
public b4j.example.vmicon _icn = null;
public boolean _hasavatar = false;
public b4j.example.vmavatar _avatar = null;
public boolean _hasswitch = false;
public b4j.example.vmswitch _switch = null;
public boolean _hasbadge = false;
public b4j.example.vmbadge _badge = null;
public b4j.example.vmlist _childlist = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _span = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public boolean _hasmenu = false;
public b4j.example.vmmenu _menu = null;
public String _syncid = "";
public Object _eventhandler = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmlistitem  _initialize(b4j.example.vmlistitem __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_module}));}
RDebugUtils.currentLine=166264832;
 //BA.debugLineNum = 166264832;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=166264833;
 //BA.debugLineNum = 166264833;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=166264834;
 //BA.debugLineNum = 166264834;BA.debugLine="syncid = $\"${ID}sync\"$";
__ref._syncid /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"sync");
RDebugUtils.currentLine=166264835;
 //BA.debugLineNum = 166264835;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=166264836;
 //BA.debugLineNum = 166264836;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=166264837;
 //BA.debugLineNum = 166264837;BA.debugLine="ListItem.Initialize(vue, ID).SetTag(\"md-list-item";
__ref._listitem /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-list-item");
RDebugUtils.currentLine=166264838;
 //BA.debugLineNum = 166264838;BA.debugLine="hasText = False";
__ref._hastext /*boolean*/  = __c.False;
RDebugUtils.currentLine=166264839;
 //BA.debugLineNum = 166264839;BA.debugLine="txt.Initialize(vue,$\"${ID}text\"$).SetTag(\"div\").A";
__ref._txt /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"text"))._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"md-list-item-text");
RDebugUtils.currentLine=166264840;
 //BA.debugLineNum = 166264840;BA.debugLine="hasAction = False";
__ref._hasaction /*boolean*/  = __c.False;
RDebugUtils.currentLine=166264841;
 //BA.debugLineNum = 166264841;BA.debugLine="btn.Initialize(vue,$\"${ID}button\"$,module).SetIco";
__ref._btn /*b4j.example.vmbutton*/ ._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"button"),_module)._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True)._setlistaction /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=166264842;
 //BA.debugLineNum = 166264842;BA.debugLine="hasMenu = False";
__ref._hasmenu /*boolean*/  = __c.False;
RDebugUtils.currentLine=166264843;
 //BA.debugLineNum = 166264843;BA.debugLine="menu.Initialize(vue,$\"${ID}menu\"$,module).AddClas";
__ref._menu /*b4j.example.vmmenu*/ ._initialize /*b4j.example.vmmenu*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"menu"),_module)._addclass /*b4j.example.vmmenu*/ (null,"md-list-action")._setcloseonclick /*b4j.example.vmmenu*/ (null,__c.True)._setcloseonselect /*b4j.example.vmmenu*/ (null,__c.True);
RDebugUtils.currentLine=166264844;
 //BA.debugLineNum = 166264844;BA.debugLine="menu.SetAlignTrigger(True).SetSizeAuto(True)";
__ref._menu /*b4j.example.vmmenu*/ ._setaligntrigger /*b4j.example.vmmenu*/ (null,(Object)(__c.True))._setsizeauto /*b4j.example.vmmenu*/ (null,__c.True);
RDebugUtils.currentLine=166264845;
 //BA.debugLineNum = 166264845;BA.debugLine="hasIcon = False";
__ref._hasicon /*boolean*/  = __c.False;
RDebugUtils.currentLine=166264846;
 //BA.debugLineNum = 166264846;BA.debugLine="icn.Initialize(vue, $\"${ID}icon\"$)";
__ref._icn /*b4j.example.vmicon*/ ._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon"));
RDebugUtils.currentLine=166264847;
 //BA.debugLineNum = 166264847;BA.debugLine="hasAvatar = False";
__ref._hasavatar /*boolean*/  = __c.False;
RDebugUtils.currentLine=166264848;
 //BA.debugLineNum = 166264848;BA.debugLine="avatar.Initialize(vue, $\"${ID}avatar\"$,module)";
__ref._avatar /*b4j.example.vmavatar*/ ._initialize /*b4j.example.vmavatar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"avatar"),_module);
RDebugUtils.currentLine=166264849;
 //BA.debugLineNum = 166264849;BA.debugLine="hasSwitch = False";
__ref._hasswitch /*boolean*/  = __c.False;
RDebugUtils.currentLine=166264850;
 //BA.debugLineNum = 166264850;BA.debugLine="switch.Initialize(vue, $\"${ID}switch\"$,module)";
__ref._switch /*b4j.example.vmswitch*/ ._initialize /*b4j.example.vmswitch*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"switch"),_module);
RDebugUtils.currentLine=166264851;
 //BA.debugLineNum = 166264851;BA.debugLine="hasBadge = False";
__ref._hasbadge /*boolean*/  = __c.False;
RDebugUtils.currentLine=166264852;
 //BA.debugLineNum = 166264852;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
__ref._badge /*b4j.example.vmbadge*/ ._initialize /*b4j.example.vmbadge*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"badge"));
RDebugUtils.currentLine=166264853;
 //BA.debugLineNum = 166264853;BA.debugLine="childList.Initialize(vue, $\"${ID}children\"$, even";
__ref._childlist /*b4j.example.vmlist*/ ._initialize /*b4j.example.vmlist*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"children"),__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=166264854;
 //BA.debugLineNum = 166264854;BA.debugLine="span.Initialize(vue,$\"${ID}span\"$).SetTag(\"span\")";
__ref._span /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"span"))._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=166264855;
 //BA.debugLineNum = 166264855;BA.debugLine="vue.SetStateSingle(syncid, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._syncid /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=166264856;
 //BA.debugLineNum = 166264856;BA.debugLine="ListItem.SetOnClick(eventHandler, $\"${ID}_click\"$";
__ref._listitem /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,__ref._eventhandler /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=166264857;
 //BA.debugLineNum = 166264857;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166264858;
 //BA.debugLineNum = 166264858;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setvfor(b4j.example.vmlistitem __ref,String _item,String _datasource) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setvfor", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setvfor", new Object[] {_item,_datasource}));}
RDebugUtils.currentLine=168755200;
 //BA.debugLineNum = 168755200;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
RDebugUtils.currentLine=168755201;
 //BA.debugLineNum = 168755201;BA.debugLine="ListItem.SetVFor(item, dataSource)";
__ref._listitem /*b4j.example.vmelement*/ ._setvfor /*b4j.example.vmelement*/ (null,_item,_datasource);
RDebugUtils.currentLine=168755202;
 //BA.debugLineNum = 168755202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168755203;
 //BA.debugLineNum = 168755203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setid(b4j.example.vmlistitem __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setid", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=168361984;
 //BA.debugLineNum = 168361984;BA.debugLine="Sub SetID(k As String, bind As Boolean) As VMListI";
RDebugUtils.currentLine=168361985;
 //BA.debugLineNum = 168361985;BA.debugLine="ListItem.SetID(k, bind)";
__ref._listitem /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_k,_bind);
RDebugUtils.currentLine=168361986;
 //BA.debugLineNum = 168361986;BA.debugLine="txt.SetID(k,bind)";
__ref._txt /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_k,_bind);
RDebugUtils.currentLine=168361987;
 //BA.debugLineNum = 168361987;BA.debugLine="span.SetID(k,bind)";
__ref._span /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_k,_bind);
RDebugUtils.currentLine=168361988;
 //BA.debugLineNum = 168361988;BA.debugLine="btn.setid(k,bind)";
__ref._btn /*b4j.example.vmbutton*/ ._setid /*b4j.example.vmbutton*/ (null,_k,_bind);
RDebugUtils.currentLine=168361989;
 //BA.debugLineNum = 168361989;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168361990;
 //BA.debugLineNum = 168361990;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setkey(b4j.example.vmlistitem __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=168427520;
 //BA.debugLineNum = 168427520;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMList";
RDebugUtils.currentLine=168427521;
 //BA.debugLineNum = 168427521;BA.debugLine="ListItem.SetKey(k, bind)";
__ref._listitem /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=168427522;
 //BA.debugLineNum = 168427522;BA.debugLine="txt.SetKey(k,bind)";
__ref._txt /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=168427523;
 //BA.debugLineNum = 168427523;BA.debugLine="span.SetKey(k,bind)";
__ref._span /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=168427524;
 //BA.debugLineNum = 168427524;BA.debugLine="btn.setkey(k,bind)";
__ref._btn /*b4j.example.vmbutton*/ ._setkey /*b4j.example.vmbutton*/ (null,_k,_bind);
RDebugUtils.currentLine=168427525;
 //BA.debugLineNum = 168427525;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168427526;
 //BA.debugLineNum = 168427526;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settext(b4j.example.vmlistitem __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=167903232;
 //BA.debugLineNum = 167903232;BA.debugLine="Sub SetText(t As String) As VMListItem";
RDebugUtils.currentLine=167903233;
 //BA.debugLineNum = 167903233;BA.debugLine="span.SetText(t)";
__ref._span /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=167903234;
 //BA.debugLineNum = 167903234;BA.debugLine="span.Pop(txt)";
__ref._span /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._txt /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167903235;
 //BA.debugLineNum = 167903235;BA.debugLine="hasText = True";
__ref._hastext /*boolean*/  = __c.True;
RDebugUtils.currentLine=167903236;
 //BA.debugLineNum = 167903236;BA.debugLine="avatar.SetAlt(t)";
__ref._avatar /*b4j.example.vmavatar*/ ._setalt /*b4j.example.vmavatar*/ (null,_t);
RDebugUtils.currentLine=167903237;
 //BA.debugLineNum = 167903237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167903238;
 //BA.debugLineNum = 167903238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setdescription(b4j.example.vmlistitem __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setdescription", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setdescription", new Object[] {_t}));}
RDebugUtils.currentLine=167968768;
 //BA.debugLineNum = 167968768;BA.debugLine="Sub SetDescription(t As String) As VMListItem";
RDebugUtils.currentLine=167968769;
 //BA.debugLineNum = 167968769;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
RDebugUtils.currentLine=167968770;
 //BA.debugLineNum = 167968770;BA.debugLine="span.Initialize(vue,$\"${ID}desc\"$).SetTag(\"span\")";
__ref._span /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"desc"))._settag /*b4j.example.vmelement*/ (null,"span")._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=167968771;
 //BA.debugLineNum = 167968771;BA.debugLine="span.Pop(txt)";
__ref._span /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._txt /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167968772;
 //BA.debugLineNum = 167968772;BA.debugLine="hasText = True";
__ref._hastext /*boolean*/  = __c.True;
RDebugUtils.currentLine=167968773;
 //BA.debugLineNum = 167968773;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167968774;
 //BA.debugLineNum = 167968774;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setactionicon(b4j.example.vmlistitem __ref,String _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setactionicon", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setactionicon", new Object[] {_icon}));}
RDebugUtils.currentLine=168099840;
 //BA.debugLineNum = 168099840;BA.debugLine="Sub SetActionIcon(icon As String) As VMListItem";
RDebugUtils.currentLine=168099841;
 //BA.debugLineNum = 168099841;BA.debugLine="btn.SetIcon(icon)";
__ref._btn /*b4j.example.vmbutton*/ ._seticon /*b4j.example.vmbutton*/ (null,_icon);
RDebugUtils.currentLine=168099842;
 //BA.debugLineNum = 168099842;BA.debugLine="hasAction = True";
__ref._hasaction /*boolean*/  = __c.True;
RDebugUtils.currentLine=168099843;
 //BA.debugLineNum = 168099843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168099844;
 //BA.debugLineNum = 168099844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setmenuicon(b4j.example.vmlistitem __ref,String _menuicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setmenuicon", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setmenuicon", new Object[] {_menuicon}));}
RDebugUtils.currentLine=166199296;
 //BA.debugLineNum = 166199296;BA.debugLine="Sub SetMenuIcon(menuIcon As String) As VMListItem";
RDebugUtils.currentLine=166199297;
 //BA.debugLineNum = 166199297;BA.debugLine="hasMenu = True";
__ref._hasmenu /*boolean*/  = __c.True;
RDebugUtils.currentLine=166199298;
 //BA.debugLineNum = 166199298;BA.debugLine="menu.SetIcon(menuIcon)";
__ref._menu /*b4j.example.vmmenu*/ ._seticon /*b4j.example.vmmenu*/ (null,_menuicon);
RDebugUtils.currentLine=166199299;
 //BA.debugLineNum = 166199299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166199300;
 //BA.debugLineNum = 166199300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _seticon(b4j.example.vmlistitem __ref,String _icon,boolean _primary) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "seticon", new Object[] {_icon,_primary}));}
RDebugUtils.currentLine=166658048;
 //BA.debugLineNum = 166658048;BA.debugLine="Sub SetIcon(icon As String, primary As Boolean) As";
RDebugUtils.currentLine=166658049;
 //BA.debugLineNum = 166658049;BA.debugLine="If icon = \"\" Then Return Me";
if ((_icon).equals("")) { 
if (true) return (b4j.example.vmlistitem)(this);};
RDebugUtils.currentLine=166658050;
 //BA.debugLineNum = 166658050;BA.debugLine="icn.SetText(icon)";
__ref._icn /*b4j.example.vmicon*/ ._settext /*b4j.example.vmicon*/ (null,_icon);
RDebugUtils.currentLine=166658051;
 //BA.debugLineNum = 166658051;BA.debugLine="If primary Then icn.SetPrimary(primary)";
if (_primary) { 
__ref._icn /*b4j.example.vmicon*/ ._setprimary /*b4j.example.vmicon*/ (null,_primary);};
RDebugUtils.currentLine=166658052;
 //BA.debugLineNum = 166658052;BA.debugLine="hasIcon = True";
__ref._hasicon /*boolean*/  = __c.True;
RDebugUtils.currentLine=166658053;
 //BA.debugLineNum = 166658053;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166658054;
 //BA.debugLineNum = 166658054;BA.debugLine="End Sub";
return null;
}
public String  _addeditmenuitem(b4j.example.vmlistitem __ref,String _sid,String _caption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addeditmenuitem", true))
	 {return ((String) Debug.delegate(ba, "addeditmenuitem", new Object[] {_sid,_caption}));}
RDebugUtils.currentLine=166068224;
 //BA.debugLineNum = 166068224;BA.debugLine="Sub AddEditMenuItem(sid As String, caption As Stri";
RDebugUtils.currentLine=166068225;
 //BA.debugLineNum = 166068225;BA.debugLine="menu.AddIconText(sid, \"edit\", caption)";
__ref._menu /*b4j.example.vmmenu*/ ._addicontext /*String*/ (null,_sid,"edit",_caption);
RDebugUtils.currentLine=166068226;
 //BA.debugLineNum = 166068226;BA.debugLine="End Sub";
return "";
}
public String  _adddeletemenuitem(b4j.example.vmlistitem __ref,String _sid,String _caption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "adddeletemenuitem", true))
	 {return ((String) Debug.delegate(ba, "adddeletemenuitem", new Object[] {_sid,_caption}));}
RDebugUtils.currentLine=166133760;
 //BA.debugLineNum = 166133760;BA.debugLine="Sub AddDeleteMenuItem(sid As String, caption As St";
RDebugUtils.currentLine=166133761;
 //BA.debugLineNum = 166133761;BA.debugLine="menu.AddIconText(sid, \"delete\", caption)";
__ref._menu /*b4j.example.vmmenu*/ ._addicontext /*String*/ (null,_sid,"delete",_caption);
RDebugUtils.currentLine=166133762;
 //BA.debugLineNum = 166133762;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmlistitem __ref,b4j.example.vmlist _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=168886272;
 //BA.debugLineNum = 168886272;BA.debugLine="Sub Pop(p As VMList)";
RDebugUtils.currentLine=168886273;
 //BA.debugLineNum = 168886273;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmlist*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=168886274;
 //BA.debugLineNum = 168886274;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _setavatar(b4j.example.vmlistitem __ref,String _img) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setavatar", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setavatar", new Object[] {_img}));}
RDebugUtils.currentLine=166920192;
 //BA.debugLineNum = 166920192;BA.debugLine="Sub SetAvatar(img As String) As VMListItem";
RDebugUtils.currentLine=166920193;
 //BA.debugLineNum = 166920193;BA.debugLine="avatar.SetID(ID)";
__ref._avatar /*b4j.example.vmavatar*/ ._setid /*b4j.example.vmavatar*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=166920194;
 //BA.debugLineNum = 166920194;BA.debugLine="avatar.SetValue(img)";
__ref._avatar /*b4j.example.vmavatar*/ ._setvalue /*b4j.example.vmavatar*/ (null,_img);
RDebugUtils.currentLine=166920195;
 //BA.debugLineNum = 166920195;BA.debugLine="hasAvatar = True";
__ref._hasavatar /*boolean*/  = __c.True;
RDebugUtils.currentLine=166920196;
 //BA.debugLineNum = 166920196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166920197;
 //BA.debugLineNum = 166920197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setinset(b4j.example.vmlistitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setinset", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setinset", new Object[] {_b}));}
RDebugUtils.currentLine=166461440;
 //BA.debugLineNum = 166461440;BA.debugLine="Sub SetInset(b As Boolean) As VMListItem";
RDebugUtils.currentLine=166461441;
 //BA.debugLineNum = 166461441;BA.debugLine="If b Then AddClass(\"md-inset\")";
if (_b) { 
__ref._addclass /*b4j.example.vmlistitem*/ (null,"md-inset");};
RDebugUtils.currentLine=166461442;
 //BA.debugLineNum = 166461442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166461443;
 //BA.debugLineNum = 166461443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setlist(b4j.example.vmlistitem __ref,b4j.example.vmlist _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setlist", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setlist", new Object[] {_lst}));}
RDebugUtils.currentLine=166395904;
 //BA.debugLineNum = 166395904;BA.debugLine="Sub SetList(lst As VMList) As VMListItem";
RDebugUtils.currentLine=166395905;
 //BA.debugLineNum = 166395905;BA.debugLine="SetExpand(True)";
__ref._setexpand /*b4j.example.vmlistitem*/ (null,__c.True);
RDebugUtils.currentLine=166395906;
 //BA.debugLineNum = 166395906;BA.debugLine="SetExpanded(syncid)";
__ref._setexpanded /*b4j.example.vmlistitem*/ (null,__ref._syncid /*String*/ );
RDebugUtils.currentLine=166395907;
 //BA.debugLineNum = 166395907;BA.debugLine="lst.SetSlotExpand(True)";
_lst._setslotexpand /*b4j.example.vmlist*/ (null,__c.True);
RDebugUtils.currentLine=166395908;
 //BA.debugLineNum = 166395908;BA.debugLine="lst.Pop(ListItem)";
_lst._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=166395909;
 //BA.debugLineNum = 166395909;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166395910;
 //BA.debugLineNum = 166395910;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addbutton(b4j.example.vmlistitem __ref,String _btnid,String _btntext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addbutton", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addbutton", new Object[] {_btnid,_btntext}));}
RDebugUtils.currentLine=166985728;
 //BA.debugLineNum = 166985728;BA.debugLine="Sub AddButton(btnID As String, btnText As String)";
RDebugUtils.currentLine=166985729;
 //BA.debugLineNum = 166985729;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=166985730;
 //BA.debugLineNum = 166985730;BA.debugLine="btn.Initialize(vue,btnID, eventHandler)";
__ref._btn /*b4j.example.vmbutton*/ ._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_btnid,__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=166985731;
 //BA.debugLineNum = 166985731;BA.debugLine="btn.SetText(btnText)";
__ref._btn /*b4j.example.vmbutton*/ ._settext /*b4j.example.vmbutton*/ (null,_btntext);
RDebugUtils.currentLine=166985732;
 //BA.debugLineNum = 166985732;BA.debugLine="btn.SetRaised(True)";
__ref._btn /*b4j.example.vmbutton*/ ._setraised /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=166985733;
 //BA.debugLineNum = 166985733;BA.debugLine="btn.SetPrimary(True)";
__ref._btn /*b4j.example.vmbutton*/ ._setprimary /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=166985734;
 //BA.debugLineNum = 166985734;BA.debugLine="btn.SetAccent(False)";
__ref._btn /*b4j.example.vmbutton*/ ._setaccent /*b4j.example.vmbutton*/ (null,__c.False);
RDebugUtils.currentLine=166985735;
 //BA.debugLineNum = 166985735;BA.debugLine="btn.SetDisabled(False)";
__ref._btn /*b4j.example.vmbutton*/ ._setdisabled /*b4j.example.vmbutton*/ (null,__c.False);
RDebugUtils.currentLine=166985736;
 //BA.debugLineNum = 166985736;BA.debugLine="btn.SetStyle(CreateMap(\"width\":\"100%\",\"margin-lef";
__ref._btn /*b4j.example.vmbutton*/ ._setstyle /*b4j.example.vmbutton*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)("100%"),(Object)("margin-left"),(Object)("0px"),(Object)("margin-right"),(Object)("0px")}));
RDebugUtils.currentLine=166985737;
 //BA.debugLineNum = 166985737;BA.debugLine="btn.Pop(ListItem)";
__ref._btn /*b4j.example.vmbutton*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=166985738;
 //BA.debugLineNum = 166985738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166985739;
 //BA.debugLineNum = 166985739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setstyle(b4j.example.vmlistitem __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=166789120;
 //BA.debugLineNum = 166789120;BA.debugLine="Sub SetStyle(m As Map) As VMListItem";
RDebugUtils.currentLine=166789121;
 //BA.debugLineNum = 166789121;BA.debugLine="ListItem.SetStyle(m)";
__ref._listitem /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=166789122;
 //BA.debugLineNum = 166789122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166789123;
 //BA.debugLineNum = 166789123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addcheckbox(b4j.example.vmlistitem __ref,String _vmodel,boolean _bvalue,String _vtext,boolean _bprimary) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addcheckbox", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addcheckbox", new Object[] {_vmodel,_bvalue,_vtext,_bprimary}));}
b4j.example.vmcheckbox _cb = null;
RDebugUtils.currentLine=167641088;
 //BA.debugLineNum = 167641088;BA.debugLine="Sub AddCheckBox(vmodel As String, bValue As Boolea";
RDebugUtils.currentLine=167641089;
 //BA.debugLineNum = 167641089;BA.debugLine="vue.SetStateSingle(vmodel, bValue)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_bvalue));
RDebugUtils.currentLine=167641090;
 //BA.debugLineNum = 167641090;BA.debugLine="Dim cb As VMCheckBox";
_cb = new b4j.example.vmcheckbox();
RDebugUtils.currentLine=167641091;
 //BA.debugLineNum = 167641091;BA.debugLine="cb.Initialize(vue, $\"${vmodel}cb\"$,eventHandler).";
_cb._initialize /*b4j.example.vmcheckbox*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"cb"),__ref._eventhandler /*Object*/ )._setvmodel /*b4j.example.vmcheckbox*/ (null,_vmodel)._setprimary /*b4j.example.vmcheckbox*/ (null,_bprimary);
RDebugUtils.currentLine=167641092;
 //BA.debugLineNum = 167641092;BA.debugLine="cb.Pop(ListItem)";
_cb._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167641093;
 //BA.debugLineNum = 167641093;BA.debugLine="SetText(vText)";
__ref._settext /*b4j.example.vmlistitem*/ (null,_vtext);
RDebugUtils.currentLine=167641094;
 //BA.debugLineNum = 167641094;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167641095;
 //BA.debugLineNum = 167641095;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _adddatepicker(b4j.example.vmlistitem __ref,String _vmodel,String _vtext,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "adddatepicker", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "adddatepicker", new Object[] {_vmodel,_vtext,_value}));}
b4j.example.vmdatepicker _datex = null;
RDebugUtils.currentLine=167444480;
 //BA.debugLineNum = 167444480;BA.debugLine="Sub AddDatePicker(vmodel As String, vText As Strin";
RDebugUtils.currentLine=167444481;
 //BA.debugLineNum = 167444481;BA.debugLine="vue.SetStateSingle(vmodel, value)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_value));
RDebugUtils.currentLine=167444482;
 //BA.debugLineNum = 167444482;BA.debugLine="Dim datex As VMDatePicker";
_datex = new b4j.example.vmdatepicker();
RDebugUtils.currentLine=167444483;
 //BA.debugLineNum = 167444483;BA.debugLine="datex.Initialize(vue,$\"${vmodel}dp\"$,eventHandler";
_datex._initialize /*b4j.example.vmdatepicker*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"dp"),__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=167444484;
 //BA.debugLineNum = 167444484;BA.debugLine="datex.SetVModel(vmodel)";
_datex._setvmodel /*b4j.example.vmdatepicker*/ (null,_vmodel);
RDebugUtils.currentLine=167444485;
 //BA.debugLineNum = 167444485;BA.debugLine="datex.SetLabel(vText)";
_datex._setlabel /*b4j.example.vmdatepicker*/ (null,_vtext);
RDebugUtils.currentLine=167444486;
 //BA.debugLineNum = 167444486;BA.debugLine="datex.Pop(ListItem)";
_datex._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167444487;
 //BA.debugLineNum = 167444487;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167444488;
 //BA.debugLineNum = 167444488;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addiconbutton(b4j.example.vmlistitem __ref,String _btnid,String _btnicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addiconbutton", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addiconbutton", new Object[] {_btnid,_btnicon}));}
RDebugUtils.currentLine=167051264;
 //BA.debugLineNum = 167051264;BA.debugLine="Sub AddIconButton(btnID As String, btnIcon As Stri";
RDebugUtils.currentLine=167051265;
 //BA.debugLineNum = 167051265;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=167051266;
 //BA.debugLineNum = 167051266;BA.debugLine="btn.Initialize(vue,btnID,eventHandler).SetIconBut";
__ref._btn /*b4j.example.vmbutton*/ ._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_btnid,__ref._eventhandler /*Object*/ )._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True)._seticon /*b4j.example.vmbutton*/ (null,_btnicon);
RDebugUtils.currentLine=167051267;
 //BA.debugLineNum = 167051267;BA.debugLine="btn.SetPrimary(True)";
__ref._btn /*b4j.example.vmbutton*/ ._setprimary /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=167051268;
 //BA.debugLineNum = 167051268;BA.debugLine="btn.SetDisabled(False)";
__ref._btn /*b4j.example.vmbutton*/ ._setdisabled /*b4j.example.vmbutton*/ (null,__c.False);
RDebugUtils.currentLine=167051269;
 //BA.debugLineNum = 167051269;BA.debugLine="btn.Pop(ListItem)";
__ref._btn /*b4j.example.vmbutton*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167051270;
 //BA.debugLineNum = 167051270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167051271;
 //BA.debugLineNum = 167051271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addinput(b4j.example.vmlistitem __ref,String _typeof,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addinput", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addinput", new Object[] {_typeof,_vmodel,_vtext,_vicon,_vvalue}));}
b4j.example.vminput _input = null;
RDebugUtils.currentLine=167575552;
 //BA.debugLineNum = 167575552;BA.debugLine="Sub AddInput(typeOf As String, vModel As String, v";
RDebugUtils.currentLine=167575553;
 //BA.debugLineNum = 167575553;BA.debugLine="vue.SetStateSingle(vModel, vValue)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_vvalue));
RDebugUtils.currentLine=167575554;
 //BA.debugLineNum = 167575554;BA.debugLine="Dim input As VMInput";
_input = new b4j.example.vminput();
RDebugUtils.currentLine=167575555;
 //BA.debugLineNum = 167575555;BA.debugLine="input.Initialize(vue,$\"${vModel}inp\"$,eventHandle";
_input._initialize /*b4j.example.vminput*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"inp"),__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=167575556;
 //BA.debugLineNum = 167575556;BA.debugLine="input.SetType(typeOf)";
_input._settype /*b4j.example.vminput*/ (null,(Object)(_typeof));
RDebugUtils.currentLine=167575557;
 //BA.debugLineNum = 167575557;BA.debugLine="input.SetLabel(vText)";
_input._setlabel /*b4j.example.vminput*/ (null,_vtext);
RDebugUtils.currentLine=167575558;
 //BA.debugLineNum = 167575558;BA.debugLine="input.SetVModel(vModel)";
_input._setvmodel /*b4j.example.vminput*/ (null,_vmodel);
RDebugUtils.currentLine=167575559;
 //BA.debugLineNum = 167575559;BA.debugLine="input.SetName(vModel,False)";
_input._setname /*b4j.example.vminput*/ (null,(Object)(_vmodel),__c.False);
RDebugUtils.currentLine=167575560;
 //BA.debugLineNum = 167575560;BA.debugLine="input.SetAutoComplete(vModel)";
_input._setautocomplete /*b4j.example.vminput*/ (null,_vmodel);
RDebugUtils.currentLine=167575561;
 //BA.debugLineNum = 167575561;BA.debugLine="If vIcon <> \"\" Then input.SetIcon(vIcon)";
if ((_vicon).equals("") == false) { 
_input._seticon /*b4j.example.vminput*/ (null,_vicon);};
RDebugUtils.currentLine=167575562;
 //BA.debugLineNum = 167575562;BA.debugLine="If typeOf <> \"password\" Then";
if ((_typeof).equals("password") == false) { 
RDebugUtils.currentLine=167575563;
 //BA.debugLineNum = 167575563;BA.debugLine="input.SetClearable(True)";
_input._setclearable /*b4j.example.vminput*/ (null,__c.True);
 };
RDebugUtils.currentLine=167575565;
 //BA.debugLineNum = 167575565;BA.debugLine="input.Pop(ListItem)";
_input._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167575566;
 //BA.debugLineNum = 167575566;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167575567;
 //BA.debugLineNum = 167575567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addlabel(b4j.example.vmlistitem __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addlabel", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addlabel", new Object[] {_t}));}
b4j.example.vmlabel _el = null;
RDebugUtils.currentLine=167378944;
 //BA.debugLineNum = 167378944;BA.debugLine="Sub AddLabel(t As String) As VMListItem";
RDebugUtils.currentLine=167378945;
 //BA.debugLineNum = 167378945;BA.debugLine="Dim el As VMLabel";
_el = new b4j.example.vmlabel();
RDebugUtils.currentLine=167378946;
 //BA.debugLineNum = 167378946;BA.debugLine="el.Initialize(vue,$\"${ID}lbl\"$).SetText(t)";
_el._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"lbl"))._settext /*b4j.example.vmlabel*/ (null,_t);
RDebugUtils.currentLine=167378947;
 //BA.debugLineNum = 167378947;BA.debugLine="el.Pop(ListItem)";
_el._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167378948;
 //BA.debugLineNum = 167378948;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167378949;
 //BA.debugLineNum = 167378949;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addnumberinput(b4j.example.vmlistitem __ref,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addnumberinput", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addnumberinput", new Object[] {_vmodel,_label,_minvalue,_maxvalue,_value}));}
b4j.example.vmnumberinput _ni = null;
RDebugUtils.currentLine=167182336;
 //BA.debugLineNum = 167182336;BA.debugLine="Sub AddNumberInput(vmodel As String, Label As Stri";
RDebugUtils.currentLine=167182337;
 //BA.debugLineNum = 167182337;BA.debugLine="vue.SetStateSingle(vmodel, value)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_value));
RDebugUtils.currentLine=167182338;
 //BA.debugLineNum = 167182338;BA.debugLine="Dim ni As VMNumberInput";
_ni = new b4j.example.vmnumberinput();
RDebugUtils.currentLine=167182339;
 //BA.debugLineNum = 167182339;BA.debugLine="ni.initialize(vue,$\"${vmodel}ni\"$)";
_ni._initialize /*b4j.example.vmnumberinput*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ni"));
RDebugUtils.currentLine=167182340;
 //BA.debugLineNum = 167182340;BA.debugLine="ni.SetMin(minValue)";
_ni._setmin /*b4j.example.vmnumberinput*/ (null,BA.NumberToString(_minvalue));
RDebugUtils.currentLine=167182341;
 //BA.debugLineNum = 167182341;BA.debugLine="ni.SetMax(maxValue)";
_ni._setmax /*b4j.example.vmnumberinput*/ (null,BA.NumberToString(_maxvalue));
RDebugUtils.currentLine=167182342;
 //BA.debugLineNum = 167182342;BA.debugLine="ni.SetLabel(Label)";
_ni._setlabel /*b4j.example.vmnumberinput*/ (null,_label);
RDebugUtils.currentLine=167182343;
 //BA.debugLineNum = 167182343;BA.debugLine="ni.SetVModel(vmodel)";
_ni._setvmodel /*b4j.example.vmnumberinput*/ (null,_vmodel);
RDebugUtils.currentLine=167182344;
 //BA.debugLineNum = 167182344;BA.debugLine="ni.SetName(vmodel,False)";
_ni._setname /*b4j.example.vmnumberinput*/ (null,(Object)(_vmodel),__c.False);
RDebugUtils.currentLine=167182345;
 //BA.debugLineNum = 167182345;BA.debugLine="ni.SetSizeSmall";
_ni._setsizesmall /*b4j.example.vmnumberinput*/ (null);
RDebugUtils.currentLine=167182346;
 //BA.debugLineNum = 167182346;BA.debugLine="ni.Pop(ListItem)";
_ni._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167182347;
 //BA.debugLineNum = 167182347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167182348;
 //BA.debugLineNum = 167182348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addclass(b4j.example.vmlistitem __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=166723584;
 //BA.debugLineNum = 166723584;BA.debugLine="Sub AddClass(c As String) As VMListItem";
RDebugUtils.currentLine=166723585;
 //BA.debugLineNum = 166723585;BA.debugLine="ListItem.AddClass(c)";
__ref._listitem /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=166723586;
 //BA.debugLineNum = 166723586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166723587;
 //BA.debugLineNum = 166723587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setradio(b4j.example.vmlistitem __ref,String _vmodel,String _vvalue,String _vtext,boolean _bprimary,boolean _bdesignmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setradio", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setradio", new Object[] {_vmodel,_vvalue,_vtext,_bprimary,_bdesignmode}));}
b4j.example.vmradio _cb = null;
RDebugUtils.currentLine=167706624;
 //BA.debugLineNum = 167706624;BA.debugLine="Sub SetRadio(vmodel As String, vValue As String, v";
RDebugUtils.currentLine=167706625;
 //BA.debugLineNum = 167706625;BA.debugLine="Dim cb As VMRadio";
_cb = new b4j.example.vmradio();
RDebugUtils.currentLine=167706626;
 //BA.debugLineNum = 167706626;BA.debugLine="cb.Initialize(vue, $\"${vmodel}rd\"$,eventHandler).";
_cb._initialize /*b4j.example.vmradio*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"rd"),__ref._eventhandler /*Object*/ )._setvalue /*b4j.example.vmradio*/ (null,(Object)(_vvalue),__c.False)._setname /*b4j.example.vmradio*/ (null,(Object)(_vmodel),__c.False)._setprimary /*b4j.example.vmradio*/ (null,_bprimary);
RDebugUtils.currentLine=167706627;
 //BA.debugLineNum = 167706627;BA.debugLine="If bDesignMode = False Then cb.SetVModel(vmodel)";
if (_bdesignmode==__c.False) { 
_cb._setvmodel /*b4j.example.vmradio*/ (null,_vmodel);};
RDebugUtils.currentLine=167706628;
 //BA.debugLineNum = 167706628;BA.debugLine="cb.Pop(ListItem)";
_cb._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167706629;
 //BA.debugLineNum = 167706629;BA.debugLine="SetText(vText)";
__ref._settext /*b4j.example.vmlistitem*/ (null,_vtext);
RDebugUtils.currentLine=167706630;
 //BA.debugLineNum = 167706630;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167706631;
 //BA.debugLineNum = 167706631;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addselect(b4j.example.vmlistitem __ref,String _vmodel,String _vtext,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addselect", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addselect", new Object[] {_vmodel,_vtext,_sourcename,_options,_sourcefield,_displayfield}));}
b4j.example.vmselect _sel = null;
RDebugUtils.currentLine=167247872;
 //BA.debugLineNum = 167247872;BA.debugLine="Sub AddSelect(vmodel As String, vText As String, s";
RDebugUtils.currentLine=167247873;
 //BA.debugLineNum = 167247873;BA.debugLine="Dim sel As VMSelect";
_sel = new b4j.example.vmselect();
RDebugUtils.currentLine=167247874;
 //BA.debugLineNum = 167247874;BA.debugLine="sel.Initialize(vue,$\"${vmodel}sel\"$,eventHandler)";
_sel._initialize /*b4j.example.vmselect*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"sel"),__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=167247875;
 //BA.debugLineNum = 167247875;BA.debugLine="sel.SetLabel(vText)";
_sel._setlabel /*b4j.example.vmselect*/ (null,(Object)(_vtext));
RDebugUtils.currentLine=167247876;
 //BA.debugLineNum = 167247876;BA.debugLine="sel.SetVModel(vmodel)";
_sel._setvmodel /*b4j.example.vmselect*/ (null,_vmodel);
RDebugUtils.currentLine=167247877;
 //BA.debugLineNum = 167247877;BA.debugLine="sel.SetOPtions(sourceName, options, sourcefield,";
_sel._setoptions /*String*/ (null,_sourcename,_options,_sourcefield,_displayfield);
RDebugUtils.currentLine=167247878;
 //BA.debugLineNum = 167247878;BA.debugLine="sel.SetDense(True)";
_sel._setdense /*b4j.example.vmselect*/ (null,__c.True);
RDebugUtils.currentLine=167247879;
 //BA.debugLineNum = 167247879;BA.debugLine="sel.Pop(ListItem)";
_sel._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167247880;
 //BA.debugLineNum = 167247880;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167247881;
 //BA.debugLineNum = 167247881;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addslider(b4j.example.vmlistitem __ref,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value,boolean _labelontop) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addslider", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addslider", new Object[] {_vmodel,_label,_minvalue,_maxvalue,_value,_labelontop}));}
b4j.example.vmslider _slid = null;
RDebugUtils.currentLine=167116800;
 //BA.debugLineNum = 167116800;BA.debugLine="Sub AddSlider(vmodel As String, Label As String, m";
RDebugUtils.currentLine=167116801;
 //BA.debugLineNum = 167116801;BA.debugLine="vue.SetStateSingle(vmodel, value)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_value));
RDebugUtils.currentLine=167116802;
 //BA.debugLineNum = 167116802;BA.debugLine="Dim slid As VMSlider";
_slid = new b4j.example.vmslider();
RDebugUtils.currentLine=167116803;
 //BA.debugLineNum = 167116803;BA.debugLine="slid.initialize(vue,$\"${vmodel}sld\"$, eventHandle";
_slid._initialize /*b4j.example.vmslider*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"sld"),__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=167116804;
 //BA.debugLineNum = 167116804;BA.debugLine="slid.SetMin(minValue)";
_slid._setmin /*b4j.example.vmslider*/ (null,_minvalue);
RDebugUtils.currentLine=167116805;
 //BA.debugLineNum = 167116805;BA.debugLine="slid.SetMax(maxValue)";
_slid._setmax /*b4j.example.vmslider*/ (null,_maxvalue);
RDebugUtils.currentLine=167116806;
 //BA.debugLineNum = 167116806;BA.debugLine="slid.SetLabel(Label)";
_slid._setlabel /*b4j.example.vmslider*/ (null,(Object)(_label));
RDebugUtils.currentLine=167116807;
 //BA.debugLineNum = 167116807;BA.debugLine="slid.SetThumbLabel(False)";
_slid._setthumblabel /*b4j.example.vmslider*/ (null,__c.False);
RDebugUtils.currentLine=167116808;
 //BA.debugLineNum = 167116808;BA.debugLine="slid.SetVModel(vmodel)";
_slid._setvmodel /*b4j.example.vmslider*/ (null,_vmodel);
RDebugUtils.currentLine=167116809;
 //BA.debugLineNum = 167116809;BA.debugLine="slid.SetName(vmodel,False)";
_slid._setname /*b4j.example.vmslider*/ (null,(Object)(_vmodel),__c.False);
RDebugUtils.currentLine=167116810;
 //BA.debugLineNum = 167116810;BA.debugLine="slid.SetLabelOnTop(labelOnTop)";
_slid._setlabelontop /*b4j.example.vmslider*/ (null,_labelontop);
RDebugUtils.currentLine=167116811;
 //BA.debugLineNum = 167116811;BA.debugLine="slid.Pop(ListItem)";
_slid._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167116812;
 //BA.debugLineNum = 167116812;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167116813;
 //BA.debugLineNum = 167116813;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setswitch(b4j.example.vmlistitem __ref,String _vmodel,String _text,boolean _bprimary,boolean _bvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setswitch", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setswitch", new Object[] {_vmodel,_text,_bprimary,_bvalue}));}
RDebugUtils.currentLine=167837696;
 //BA.debugLineNum = 167837696;BA.debugLine="Sub SetSwitch(vmodel As String, text As String,bPr";
RDebugUtils.currentLine=167837697;
 //BA.debugLineNum = 167837697;BA.debugLine="vue.SetStateSingle(vmodel, bValue)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_bvalue));
RDebugUtils.currentLine=167837698;
 //BA.debugLineNum = 167837698;BA.debugLine="SetText(text)";
__ref._settext /*b4j.example.vmlistitem*/ (null,_text);
RDebugUtils.currentLine=167837699;
 //BA.debugLineNum = 167837699;BA.debugLine="hasSwitch = True";
__ref._hasswitch /*boolean*/  = __c.True;
RDebugUtils.currentLine=167837700;
 //BA.debugLineNum = 167837700;BA.debugLine="switch.SetVModel(vmodel).SetPrimary(bPrimary)";
__ref._switch /*b4j.example.vmswitch*/ ._setvmodel /*b4j.example.vmswitch*/ (null,_vmodel)._setprimary /*b4j.example.vmswitch*/ (null,_bprimary);
RDebugUtils.currentLine=167837701;
 //BA.debugLineNum = 167837701;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167837702;
 //BA.debugLineNum = 167837702;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _addtextarea(b4j.example.vmlistitem __ref,String _vmodel,String _vtext,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addtextarea", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addtextarea", new Object[] {_vmodel,_vtext,_vvalue}));}
b4j.example.vmtextarea _input = null;
RDebugUtils.currentLine=167510016;
 //BA.debugLineNum = 167510016;BA.debugLine="Sub AddTextArea(vModel As String, vText As String,";
RDebugUtils.currentLine=167510017;
 //BA.debugLineNum = 167510017;BA.debugLine="vue.SetStateSingle(vModel, vValue)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_vvalue));
RDebugUtils.currentLine=167510018;
 //BA.debugLineNum = 167510018;BA.debugLine="Dim input As VMTextArea";
_input = new b4j.example.vmtextarea();
RDebugUtils.currentLine=167510019;
 //BA.debugLineNum = 167510019;BA.debugLine="input.Initialize(vue,$\"${vModel}ta\"$, eventHandle";
_input._initialize /*b4j.example.vmtextarea*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ta"),__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=167510020;
 //BA.debugLineNum = 167510020;BA.debugLine="input.SetLabel(vText)";
_input._setlabel /*b4j.example.vmtextarea*/ (null,_vtext);
RDebugUtils.currentLine=167510021;
 //BA.debugLineNum = 167510021;BA.debugLine="input.SetVModel(vModel)";
_input._setvmodel /*b4j.example.vmtextarea*/ (null,_vmodel);
RDebugUtils.currentLine=167510022;
 //BA.debugLineNum = 167510022;BA.debugLine="input.SetName(vModel,False)";
_input._setname /*b4j.example.vmtextarea*/ (null,(Object)(_vmodel),__c.False);
RDebugUtils.currentLine=167510023;
 //BA.debugLineNum = 167510023;BA.debugLine="input.Pop(ListItem)";
_input._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167510024;
 //BA.debugLineNum = 167510024;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167510025;
 //BA.debugLineNum = 167510025;BA.debugLine="End Sub";
return null;
}
public String  _addmenuitem(b4j.example.vmlistitem __ref,String _sid,String _iconname,String _caption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addmenuitem", true))
	 {return ((String) Debug.delegate(ba, "addmenuitem", new Object[] {_sid,_iconname,_caption}));}
RDebugUtils.currentLine=166002688;
 //BA.debugLineNum = 166002688;BA.debugLine="Sub AddMenuItem(sid As String, iconName As String,";
RDebugUtils.currentLine=166002689;
 //BA.debugLineNum = 166002689;BA.debugLine="menu.addicontext(sid, iconName, Caption)";
__ref._menu /*b4j.example.vmmenu*/ ._addicontext /*String*/ (null,_sid,_iconname,_caption);
RDebugUtils.currentLine=166002690;
 //BA.debugLineNum = 166002690;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _addradiogroup(b4j.example.vmlistitem __ref,String _vmodel,String _vtext,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "addradiogroup", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "addradiogroup", new Object[] {_vmodel,_vtext,_options}));}
b4j.example.vmradiogroup _sel = null;
RDebugUtils.currentLine=167313408;
 //BA.debugLineNum = 167313408;BA.debugLine="Sub AddRadioGroup(vmodel As String, vText As Strin";
RDebugUtils.currentLine=167313409;
 //BA.debugLineNum = 167313409;BA.debugLine="Dim sel As VMRadioGroup";
_sel = new b4j.example.vmradiogroup();
RDebugUtils.currentLine=167313410;
 //BA.debugLineNum = 167313410;BA.debugLine="sel.Initialize(vue,$\"${vmodel}rg\"$,vText,eventHan";
_sel._initialize /*b4j.example.vmradiogroup*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"rg"),_vtext,__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=167313411;
 //BA.debugLineNum = 167313411;BA.debugLine="sel.SetVModel(vmodel)";
_sel._setvmodel /*b4j.example.vmradiogroup*/ (null,_vmodel);
RDebugUtils.currentLine=167313412;
 //BA.debugLineNum = 167313412;BA.debugLine="sel.SetOPtions(options)";
_sel._setoptions /*String*/ (null,_options);
RDebugUtils.currentLine=167313413;
 //BA.debugLineNum = 167313413;BA.debugLine="sel.Pop(ListItem)";
_sel._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=167313414;
 //BA.debugLineNum = 167313414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167313415;
 //BA.debugLineNum = 167313415;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmlistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
RDebugUtils.currentLine=165871616;
 //BA.debugLineNum = 165871616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=165871617;
 //BA.debugLineNum = 165871617;BA.debugLine="Public ListItem As VMElement";
_listitem = new b4j.example.vmelement();
RDebugUtils.currentLine=165871618;
 //BA.debugLineNum = 165871618;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=165871619;
 //BA.debugLineNum = 165871619;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=165871620;
 //BA.debugLineNum = 165871620;BA.debugLine="Private txt As VMElement";
_txt = new b4j.example.vmelement();
RDebugUtils.currentLine=165871621;
 //BA.debugLineNum = 165871621;BA.debugLine="Private hasText As Boolean";
_hastext = false;
RDebugUtils.currentLine=165871622;
 //BA.debugLineNum = 165871622;BA.debugLine="Private hasAction As Boolean";
_hasaction = false;
RDebugUtils.currentLine=165871623;
 //BA.debugLineNum = 165871623;BA.debugLine="Private btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=165871624;
 //BA.debugLineNum = 165871624;BA.debugLine="Private hasIcon As Boolean";
_hasicon = false;
RDebugUtils.currentLine=165871625;
 //BA.debugLineNum = 165871625;BA.debugLine="Private icn As VMIcon";
_icn = new b4j.example.vmicon();
RDebugUtils.currentLine=165871626;
 //BA.debugLineNum = 165871626;BA.debugLine="Private hasAvatar As Boolean";
_hasavatar = false;
RDebugUtils.currentLine=165871627;
 //BA.debugLineNum = 165871627;BA.debugLine="Private avatar As VMAvatar";
_avatar = new b4j.example.vmavatar();
RDebugUtils.currentLine=165871628;
 //BA.debugLineNum = 165871628;BA.debugLine="Private hasSwitch As Boolean";
_hasswitch = false;
RDebugUtils.currentLine=165871629;
 //BA.debugLineNum = 165871629;BA.debugLine="Private switch As VMSwitch";
_switch = new b4j.example.vmswitch();
RDebugUtils.currentLine=165871630;
 //BA.debugLineNum = 165871630;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
RDebugUtils.currentLine=165871631;
 //BA.debugLineNum = 165871631;BA.debugLine="Private badge As VMBadge";
_badge = new b4j.example.vmbadge();
RDebugUtils.currentLine=165871632;
 //BA.debugLineNum = 165871632;BA.debugLine="Public childList As VMList";
_childlist = new b4j.example.vmlist();
RDebugUtils.currentLine=165871633;
 //BA.debugLineNum = 165871633;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=165871634;
 //BA.debugLineNum = 165871634;BA.debugLine="Private span As VMElement";
_span = new b4j.example.vmelement();
RDebugUtils.currentLine=165871635;
 //BA.debugLineNum = 165871635;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=165871636;
 //BA.debugLineNum = 165871636;BA.debugLine="Private hasMenu As Boolean";
_hasmenu = false;
RDebugUtils.currentLine=165871637;
 //BA.debugLineNum = 165871637;BA.debugLine="Private menu As VMMenu";
_menu = new b4j.example.vmmenu();
RDebugUtils.currentLine=165871638;
 //BA.debugLineNum = 165871638;BA.debugLine="Private syncid As String";
_syncid = "";
RDebugUtils.currentLine=165871639;
 //BA.debugLineNum = 165871639;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
RDebugUtils.currentLine=165871640;
 //BA.debugLineNum = 165871640;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmlistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=168820736;
 //BA.debugLineNum = 168820736;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=168820737;
 //BA.debugLineNum = 168820737;BA.debugLine="If hasIcon Then";
if (__ref._hasicon /*boolean*/ ) { 
RDebugUtils.currentLine=168820738;
 //BA.debugLineNum = 168820738;BA.debugLine="icn.Pop(ListItem)";
__ref._icn /*b4j.example.vmicon*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=168820740;
 //BA.debugLineNum = 168820740;BA.debugLine="If hasAvatar Then";
if (__ref._hasavatar /*boolean*/ ) { 
RDebugUtils.currentLine=168820741;
 //BA.debugLineNum = 168820741;BA.debugLine="avatar.Pop(ListItem)";
__ref._avatar /*b4j.example.vmavatar*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=168820743;
 //BA.debugLineNum = 168820743;BA.debugLine="If hasText Then";
if (__ref._hastext /*boolean*/ ) { 
RDebugUtils.currentLine=168820744;
 //BA.debugLineNum = 168820744;BA.debugLine="txt.Pop(ListItem)";
__ref._txt /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=168820746;
 //BA.debugLineNum = 168820746;BA.debugLine="If hasAction Then";
if (__ref._hasaction /*boolean*/ ) { 
RDebugUtils.currentLine=168820747;
 //BA.debugLineNum = 168820747;BA.debugLine="btn.Pop(ListItem)";
__ref._btn /*b4j.example.vmbutton*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=168820749;
 //BA.debugLineNum = 168820749;BA.debugLine="If hasMenu Then";
if (__ref._hasmenu /*boolean*/ ) { 
RDebugUtils.currentLine=168820750;
 //BA.debugLineNum = 168820750;BA.debugLine="menu.Pop(ListItem)";
__ref._menu /*b4j.example.vmmenu*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=168820752;
 //BA.debugLineNum = 168820752;BA.debugLine="If hasSwitch Then";
if (__ref._hasswitch /*boolean*/ ) { 
RDebugUtils.currentLine=168820753;
 //BA.debugLineNum = 168820753;BA.debugLine="switch.Pop(ListItem)";
__ref._switch /*b4j.example.vmswitch*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=168820755;
 //BA.debugLineNum = 168820755;BA.debugLine="If hasBadge Then";
if (__ref._hasbadge /*boolean*/ ) { 
RDebugUtils.currentLine=168820756;
 //BA.debugLineNum = 168820756;BA.debugLine="badge.Pop(ListItem)";
__ref._badge /*b4j.example.vmbadge*/ ._pop /*String*/ (null,__ref._listitem /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=168820758;
 //BA.debugLineNum = 168820758;BA.debugLine="Return ListItem.ToString";
if (true) return __ref._listitem /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=168820759;
 //BA.debugLineNum = 168820759;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _setattr(b4j.example.vmlistitem __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=166854656;
 //BA.debugLineNum = 166854656;BA.debugLine="Sub SetAttr(attr As Map) As VMListItem";
RDebugUtils.currentLine=166854657;
 //BA.debugLineNum = 166854657;BA.debugLine="ListItem.SetAttr(attr)";
__ref._listitem /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=166854658;
 //BA.debugLineNum = 166854658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166854659;
 //BA.debugLineNum = 166854659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setbadge(b4j.example.vmlistitem __ref,int _content,boolean _bprimary,String _position,boolean _bdense,boolean _bsquare) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setbadge", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setbadge", new Object[] {_content,_bprimary,_position,_bdense,_bsquare}));}
RDebugUtils.currentLine=167772160;
 //BA.debugLineNum = 167772160;BA.debugLine="Sub SetBadge(content As Int, bPrimary As Boolean,";
RDebugUtils.currentLine=167772161;
 //BA.debugLineNum = 167772161;BA.debugLine="badge.SetContent(content).SetPosition(position).S";
__ref._badge /*b4j.example.vmbadge*/ ._setcontent /*b4j.example.vmbadge*/ (null,_content)._setposition /*b4j.example.vmbadge*/ (null,(Object)(_position))._setdense /*b4j.example.vmbadge*/ (null,_bdense)._setsquare /*b4j.example.vmbadge*/ (null,_bsquare);
RDebugUtils.currentLine=167772162;
 //BA.debugLineNum = 167772162;BA.debugLine="badge.SetPrimary(bPrimary)";
__ref._badge /*b4j.example.vmbadge*/ ._setprimary /*b4j.example.vmbadge*/ (null,_bprimary);
RDebugUtils.currentLine=167772163;
 //BA.debugLineNum = 167772163;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=167772164;
 //BA.debugLineNum = 167772164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=167772165;
 //BA.debugLineNum = 167772165;BA.debugLine="End Sub";
return null;
}
public String  _setdata(b4j.example.vmlistitem __ref,anywheresoftware.b4a.objects.collections.List _recs) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setdata", true))
	 {return ((String) Debug.delegate(ba, "setdata", new Object[] {_recs}));}
RDebugUtils.currentLine=166330368;
 //BA.debugLineNum = 166330368;BA.debugLine="Sub SetData(recs As List)";
RDebugUtils.currentLine=166330369;
 //BA.debugLineNum = 166330369;BA.debugLine="data = recs";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/  = _recs;
RDebugUtils.currentLine=166330370;
 //BA.debugLineNum = 166330370;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitem  _setelevation(b4j.example.vmlistitem __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=165937152;
 //BA.debugLineNum = 165937152;BA.debugLine="Sub SetElevation(e As Int) As VMListItem";
RDebugUtils.currentLine=165937153;
 //BA.debugLineNum = 165937153;BA.debugLine="ListItem.SetElevation(e)";
__ref._listitem /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=165937154;
 //BA.debugLineNum = 165937154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=165937155;
 //BA.debugLineNum = 165937155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setexpand(b4j.example.vmlistitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setexpand", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setexpand", new Object[] {_b}));}
RDebugUtils.currentLine=166526976;
 //BA.debugLineNum = 166526976;BA.debugLine="Sub SetExpand(b As Boolean) As VMListItem";
RDebugUtils.currentLine=166526977;
 //BA.debugLineNum = 166526977;BA.debugLine="ListItem.SetAttr(CreateMap(\":md-expand\": b))";
__ref._listitem /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-expand"),(Object)(_b)}));
RDebugUtils.currentLine=166526978;
 //BA.debugLineNum = 166526978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166526979;
 //BA.debugLineNum = 166526979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setexpanded(b4j.example.vmlistitem __ref,String _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setexpanded", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setexpanded", new Object[] {_b}));}
RDebugUtils.currentLine=166592512;
 //BA.debugLineNum = 166592512;BA.debugLine="Sub SetExpanded(b As String) As VMListItem";
RDebugUtils.currentLine=166592513;
 //BA.debugLineNum = 166592513;BA.debugLine="b = b.tolowercase";
_b = _b.toLowerCase();
RDebugUtils.currentLine=166592514;
 //BA.debugLineNum = 166592514;BA.debugLine="If vue.HasState(b) = False Then";
if (__ref._vue /*b4j.example.bananovue*/ ._hasstate /*boolean*/ (null,_b)==__c.False) { 
RDebugUtils.currentLine=166592515;
 //BA.debugLineNum = 166592515;BA.debugLine="Log($\"VMListItem.SetExpanded: '${b}' default sta";
__c.Log(("VMListItem.SetExpanded: '"+__c.SmartStringFormatter("",(Object)(_b))+"' default state should be set!"));
 };
RDebugUtils.currentLine=166592517;
 //BA.debugLineNum = 166592517;BA.debugLine="ListItem.SetAttr(CreateMap(\":md-expanded.sync\": b";
__ref._listitem /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-expanded.sync"),(Object)(_b)}));
RDebugUtils.currentLine=166592518;
 //BA.debugLineNum = 166592518;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=166592519;
 //BA.debugLineNum = 166592519;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _sethref(b4j.example.vmlistitem __ref,Object _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "sethref", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "sethref", new Object[] {_h}));}
RDebugUtils.currentLine=168230912;
 //BA.debugLineNum = 168230912;BA.debugLine="Sub SetHREF(h As Object) As VMListItem";
RDebugUtils.currentLine=168230913;
 //BA.debugLineNum = 168230913;BA.debugLine="ListItem.SetHREF(h)";
__ref._listitem /*b4j.example.vmelement*/ ._sethref /*b4j.example.vmelement*/ (null,BA.ObjectToString(_h));
RDebugUtils.currentLine=168230914;
 //BA.debugLineNum = 168230914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168230915;
 //BA.debugLineNum = 168230915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setname(b4j.example.vmlistitem __ref,Object _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setname", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=168296448;
 //BA.debugLineNum = 168296448;BA.debugLine="Sub SetName(k As Object, bind As Boolean) As VMLis";
RDebugUtils.currentLine=168296449;
 //BA.debugLineNum = 168296449;BA.debugLine="ListItem.SetName(k, bind)";
__ref._listitem /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_k),_bind);
RDebugUtils.currentLine=168296450;
 //BA.debugLineNum = 168296450;BA.debugLine="txt.SetName(k,bind)";
__ref._txt /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_k),_bind);
RDebugUtils.currentLine=168296451;
 //BA.debugLineNum = 168296451;BA.debugLine="span.SetName(k,bind)";
__ref._span /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_k),_bind);
RDebugUtils.currentLine=168296452;
 //BA.debugLineNum = 168296452;BA.debugLine="btn.setname(k,bind)";
__ref._btn /*b4j.example.vmbutton*/ ._setname /*b4j.example.vmbutton*/ (null,BA.ObjectToString(_k),_bind);
RDebugUtils.currentLine=168296453;
 //BA.debugLineNum = 168296453;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168296454;
 //BA.debugLineNum = 168296454;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settargetblank(b4j.example.vmlistitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "settargetblank", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "settargetblank", new Object[] {_b}));}
RDebugUtils.currentLine=168493056;
 //BA.debugLineNum = 168493056;BA.debugLine="Sub SetTargetBlank(b As Boolean) As VMListItem   '";
RDebugUtils.currentLine=168493057;
 //BA.debugLineNum = 168493057;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_blank\")";
__ref._listitem /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattrtarget /*b4j.example.vuehtml*/ (null,"_blank");
RDebugUtils.currentLine=168493058;
 //BA.debugLineNum = 168493058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168493059;
 //BA.debugLineNum = 168493059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settargetparent(b4j.example.vmlistitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "settargetparent", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "settargetparent", new Object[] {_b}));}
RDebugUtils.currentLine=168624128;
 //BA.debugLineNum = 168624128;BA.debugLine="Sub SetTargetParent(b As Boolean) As VMListItem";
RDebugUtils.currentLine=168624129;
 //BA.debugLineNum = 168624129;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_parent\")";
__ref._listitem /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattrtarget /*b4j.example.vuehtml*/ (null,"_parent");
RDebugUtils.currentLine=168624130;
 //BA.debugLineNum = 168624130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168624131;
 //BA.debugLineNum = 168624131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settargetself(b4j.example.vmlistitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "settargetself", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "settargetself", new Object[] {_b}));}
RDebugUtils.currentLine=168558592;
 //BA.debugLineNum = 168558592;BA.debugLine="Sub SetTargetSelf(b As Boolean) As VMListItem    '";
RDebugUtils.currentLine=168558593;
 //BA.debugLineNum = 168558593;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_self\")";
__ref._listitem /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattrtarget /*b4j.example.vuehtml*/ (null,"_self");
RDebugUtils.currentLine=168558594;
 //BA.debugLineNum = 168558594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168558595;
 //BA.debugLineNum = 168558595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _settargettop(b4j.example.vmlistitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "settargettop", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "settargettop", new Object[] {_b}));}
RDebugUtils.currentLine=168689664;
 //BA.debugLineNum = 168689664;BA.debugLine="Sub SetTargetTop(b As Boolean) As VMListItem    'i";
RDebugUtils.currentLine=168689665;
 //BA.debugLineNum = 168689665;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_top\")";
__ref._listitem /*b4j.example.vmelement*/ ._element /*b4j.example.vuehtml*/ ._setattrtarget /*b4j.example.vuehtml*/ (null,"_top");
RDebugUtils.currentLine=168689666;
 //BA.debugLineNum = 168689666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168689667;
 //BA.debugLineNum = 168689667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setthirdline(b4j.example.vmlistitem __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setthirdline", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setthirdline", new Object[] {_t}));}
b4j.example.vmelement _p = null;
RDebugUtils.currentLine=168034304;
 //BA.debugLineNum = 168034304;BA.debugLine="Sub SetThirdLine(t As String) As VMListItem";
RDebugUtils.currentLine=168034305;
 //BA.debugLineNum = 168034305;BA.debugLine="Dim p As VMElement";
_p = new b4j.example.vmelement();
RDebugUtils.currentLine=168034306;
 //BA.debugLineNum = 168034306;BA.debugLine="p.Initialize(vue,$\"${ID}third\"$).SetTag(\"p\").SetT";
_p._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"third"))._settag /*b4j.example.vmelement*/ (null,"p")._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=168034307;
 //BA.debugLineNum = 168034307;BA.debugLine="p.Pop(txt)";
_p._pop /*String*/ (null,__ref._txt /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=168034308;
 //BA.debugLineNum = 168034308;BA.debugLine="hasText = True";
__ref._hastext /*boolean*/  = __c.True;
RDebugUtils.currentLine=168034309;
 //BA.debugLineNum = 168034309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168034310;
 //BA.debugLineNum = 168034310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _setto(b4j.example.vmlistitem __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlistitem";
if (Debug.shouldDelegate(ba, "setto", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "setto", new Object[] {_t}));}
RDebugUtils.currentLine=168165376;
 //BA.debugLineNum = 168165376;BA.debugLine="Sub SetTo(t As Object) As VMListItem";
RDebugUtils.currentLine=168165377;
 //BA.debugLineNum = 168165377;BA.debugLine="ListItem.SetTo(t)";
__ref._listitem /*b4j.example.vmelement*/ ._setto /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=168165378;
 //BA.debugLineNum = 168165378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitem)(this);
RDebugUtils.currentLine=168165379;
 //BA.debugLineNum = 168165379;BA.debugLine="End Sub";
return null;
}
}