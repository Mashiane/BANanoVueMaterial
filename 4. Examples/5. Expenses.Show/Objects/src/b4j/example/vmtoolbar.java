package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtoolbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtoolbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtoolbar.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _toolbar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hascontent = false;
public b4j.example.vmelement _endsection = null;
public b4j.example.vmelement _startsection = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmtoolbar  _settitle(b4j.example.vmtoolbar __ref,String _tt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "settitle", new Object[] {_tt}));}
String _pp = "";
String _page_title = "";
b4j.example.vmelement _span = null;
RDebugUtils.currentLine=221577216;
 //BA.debugLineNum = 221577216;BA.debugLine="Sub SetTitle(tt As String) As VMToolBar";
RDebugUtils.currentLine=221577217;
 //BA.debugLineNum = 221577217;BA.debugLine="Dim pp As String = $\"${ID}title\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"title");
RDebugUtils.currentLine=221577218;
 //BA.debugLineNum = 221577218;BA.debugLine="vue.SetStateSingle(pp, tt)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_tt));
RDebugUtils.currentLine=221577220;
 //BA.debugLineNum = 221577220;BA.debugLine="Dim page_title As String = $\"{{ ${pp} }}\"$";
_page_title = ("{{ "+__c.SmartStringFormatter("",(Object)(_pp))+" }}");
RDebugUtils.currentLine=221577221;
 //BA.debugLineNum = 221577221;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
RDebugUtils.currentLine=221577222;
 //BA.debugLineNum = 221577222;BA.debugLine="span.Initialize(vue, $\"${ID}title\"$).SetTag(\"h1\")";
_span._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"title"))._settag /*b4j.example.vmelement*/ (null,"h1")._settitle /*b4j.example.vmelement*/ (null,__c.True)._settext /*b4j.example.vmelement*/ (null,_page_title);
RDebugUtils.currentLine=221577223;
 //BA.debugLineNum = 221577223;BA.debugLine="span.Pop(StartSection)";
_span._pop /*String*/ (null,__ref._startsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=221577224;
 //BA.debugLineNum = 221577224;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=221577225;
 //BA.debugLineNum = 221577225;BA.debugLine="StartSection.hasContent = True";
__ref._startsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=221577226;
 //BA.debugLineNum = 221577226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221577227;
 //BA.debugLineNum = 221577227;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=221315072;
 //BA.debugLineNum = 221315072;BA.debugLine="Sub Show";
RDebugUtils.currentLine=221315073;
 //BA.debugLineNum = 221315073;BA.debugLine="SetVisible(True)";
__ref._setvisible /*b4j.example.vmtoolbar*/ (null,__c.True);
RDebugUtils.currentLine=221315074;
 //BA.debugLineNum = 221315074;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _setprimary(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=222035968;
 //BA.debugLineNum = 222035968;BA.debugLine="Sub SetPrimary(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=222035969;
 //BA.debugLineNum = 222035969;BA.debugLine="ToolBar.SetPrimary(True)";
__ref._toolbar /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=222035970;
 //BA.debugLineNum = 222035970;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=222035971;
 //BA.debugLineNum = 222035971;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=222035972;
 //BA.debugLineNum = 222035972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodefixed(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setmodefixed", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setmodefixed", new Object[] {_b}));}
RDebugUtils.currentLine=220004352;
 //BA.debugLineNum = 220004352;BA.debugLine="Sub SetModeFixed(b As Boolean) As VMToolBar   'ign";
RDebugUtils.currentLine=220004353;
 //BA.debugLineNum = 220004353;BA.debugLine="SetMode(\"fixed\")";
__ref._setmode /*b4j.example.vmtoolbar*/ (null,"fixed");
RDebugUtils.currentLine=220004354;
 //BA.debugLineNum = 220004354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220004355;
 //BA.debugLineNum = 220004355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _sethasbackbutton(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "sethasbackbutton", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "sethasbackbutton", new Object[] {_b}));}
RDebugUtils.currentLine=220856320;
 //BA.debugLineNum = 220856320;BA.debugLine="Sub SetHasBackButton(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=220856321;
 //BA.debugLineNum = 220856321;BA.debugLine="vue.SetStateSingle(\"backshow\", b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"backshow",(Object)(_b));
RDebugUtils.currentLine=220856322;
 //BA.debugLineNum = 220856322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220856323;
 //BA.debugLineNum = 220856323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _sethasmenubutton(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "sethasmenubutton", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "sethasmenubutton", new Object[] {_b}));}
RDebugUtils.currentLine=220921856;
 //BA.debugLineNum = 220921856;BA.debugLine="Sub SetHasMenuButton(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=220921857;
 //BA.debugLineNum = 220921857;BA.debugLine="vue.SetStateSingle(\"menushow\", b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"menushow",(Object)(_b));
RDebugUtils.currentLine=220921858;
 //BA.debugLineNum = 220921858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220921859;
 //BA.debugLineNum = 220921859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addicon(b4j.example.vmtoolbar __ref,String _key,String _iconname,String _tooltip,String _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addicon", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addicon", new Object[] {_key,_iconname,_tooltip,_badge}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=220332032;
 //BA.debugLineNum = 220332032;BA.debugLine="Sub AddIcon(key As String, iconName As String, too";
RDebugUtils.currentLine=220332033;
 //BA.debugLineNum = 220332033;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=220332034;
 //BA.debugLineNum = 220332034;BA.debugLine="btn.Initialize(vue, key, module).SetIcon(iconName";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ )._seticon /*b4j.example.vmbutton*/ (null,_iconname)._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True)._settooltip /*b4j.example.vmbutton*/ (null,_tooltip);
RDebugUtils.currentLine=220332035;
 //BA.debugLineNum = 220332035;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
RDebugUtils.currentLine=220332036;
 //BA.debugLineNum = 220332036;BA.debugLine="btn.SetBadgeContent(badge)";
_btn._setbadgecontent /*b4j.example.vmbutton*/ (null,(int)(Double.parseDouble(_badge)));
 };
RDebugUtils.currentLine=220332038;
 //BA.debugLineNum = 220332038;BA.debugLine="btn.Pop(EndSection)";
_btn._pop /*String*/ (null,__ref._endsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=220332039;
 //BA.debugLineNum = 220332039;BA.debugLine="EndSection.hasContent = True";
__ref._endsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220332040;
 //BA.debugLineNum = 220332040;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220332041;
 //BA.debugLineNum = 220332041;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220332042;
 //BA.debugLineNum = 220332042;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtoolbar __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=222494720;
 //BA.debugLineNum = 222494720;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=222494721;
 //BA.debugLineNum = 222494721;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=222494722;
 //BA.debugLineNum = 222494722;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _initialize(b4j.example.vmtoolbar __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=219086848;
 //BA.debugLineNum = 219086848;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=219086849;
 //BA.debugLineNum = 219086849;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=219086850;
 //BA.debugLineNum = 219086850;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=219086851;
 //BA.debugLineNum = 219086851;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=219086852;
 //BA.debugLineNum = 219086852;BA.debugLine="ToolBar.Initialize(vue, ID).SetTag(\"md-app-toolba";
__ref._toolbar /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-app-toolbar");
RDebugUtils.currentLine=219086853;
 //BA.debugLineNum = 219086853;BA.debugLine="HasContent = False";
__ref._hascontent /*boolean*/  = __c.False;
RDebugUtils.currentLine=219086854;
 //BA.debugLineNum = 219086854;BA.debugLine="EndSection.Initialize(vue,$\"${ID}end\"$).SetTag(\"d";
__ref._endsection /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"end"))._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"md-toolbar-section-end");
RDebugUtils.currentLine=219086855;
 //BA.debugLineNum = 219086855;BA.debugLine="StartSection.Initialize(vue,$\"${ID}start\"$).SetTa";
__ref._startsection /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"start"))._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"md-toolbar-section-start");
RDebugUtils.currentLine=219086856;
 //BA.debugLineNum = 219086856;BA.debugLine="ToolBar.RemoveAttr(\":required\")";
__ref._toolbar /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=219086857;
 //BA.debugLineNum = 219086857;BA.debugLine="ToolBar.RemoveAttr(\":disabled\")";
__ref._toolbar /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=219086858;
 //BA.debugLineNum = 219086858;BA.debugLine="SetToolbar(True)";
__ref._settoolbar /*b4j.example.vmtoolbar*/ (null,__c.True);
RDebugUtils.currentLine=219086859;
 //BA.debugLineNum = 219086859;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=219086860;
 //BA.debugLineNum = 219086860;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setapptoolbar(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setapptoolbar", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setapptoolbar", new Object[] {_b}));}
RDebugUtils.currentLine=219414528;
 //BA.debugLineNum = 219414528;BA.debugLine="Sub SetAppToolbar(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=219414529;
 //BA.debugLineNum = 219414529;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
RDebugUtils.currentLine=219414530;
 //BA.debugLineNum = 219414530;BA.debugLine="ToolBar.SetTag(\"md-app-toolbar\")";
__ref._toolbar /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-app-toolbar");
RDebugUtils.currentLine=219414531;
 //BA.debugLineNum = 219414531;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=219414532;
 //BA.debugLineNum = 219414532;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=219414533;
 //BA.debugLineNum = 219414533;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _sethaslogo(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "sethaslogo", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "sethaslogo", new Object[] {_b}));}
RDebugUtils.currentLine=219152384;
 //BA.debugLineNum = 219152384;BA.debugLine="Sub SetHasLogo(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=219152385;
 //BA.debugLineNum = 219152385;BA.debugLine="vue.SetStateSingle(\"logo\", b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"logo",(Object)(_b));
RDebugUtils.currentLine=219152386;
 //BA.debugLineNum = 219152386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=219152387;
 //BA.debugLineNum = 219152387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setlogo(b4j.example.vmtoolbar __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setlogo", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setlogo", new Object[] {_url}));}
b4j.example.vmimage _img = null;
RDebugUtils.currentLine=219217920;
 //BA.debugLineNum = 219217920;BA.debugLine="Sub SetLogo(url As String) As VMToolBar";
RDebugUtils.currentLine=219217921;
 //BA.debugLineNum = 219217921;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
RDebugUtils.currentLine=219217922;
 //BA.debugLineNum = 219217922;BA.debugLine="img.Initialize(vue, $\"${ID}logo\"$, module)";
_img._initialize /*b4j.example.vmimage*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"logo"),__ref._module /*Object*/ );
RDebugUtils.currentLine=219217923;
 //BA.debugLineNum = 219217923;BA.debugLine="img.SetValue(url, True).SetStyle(CreateMap(\"heigh";
_img._setvalue /*b4j.example.vmimage*/ (null,_url,__c.True)._setstyle /*b4j.example.vmimage*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("42px"),(Object)("width"),(Object)("56px")}));
RDebugUtils.currentLine=219217924;
 //BA.debugLineNum = 219217924;BA.debugLine="img.SetVShow(\"logo\")";
_img._setvshow /*b4j.example.vmimage*/ (null,"logo");
RDebugUtils.currentLine=219217925;
 //BA.debugLineNum = 219217925;BA.debugLine="img.Pop(StartSection)";
_img._pop /*String*/ (null,__ref._startsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=219217926;
 //BA.debugLineNum = 219217926;BA.debugLine="vue.SetStateSingle(\"logo\", False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"logo",(Object)(__c.False));
RDebugUtils.currentLine=219217927;
 //BA.debugLineNum = 219217927;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=219217928;
 //BA.debugLineNum = 219217928;BA.debugLine="StartSection.hasContent = True";
__ref._startsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=219217929;
 //BA.debugLineNum = 219217929;BA.debugLine="End Sub";
return null;
}
public String  _togglemenu(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "togglemenu", true))
	 {return ((String) Debug.delegate(ba, "togglemenu", null));}
boolean _bdrawer = false;
RDebugUtils.currentLine=220987392;
 //BA.debugLineNum = 220987392;BA.debugLine="Sub ToggleMenu";
RDebugUtils.currentLine=220987394;
 //BA.debugLineNum = 220987394;BA.debugLine="Dim bDrawer As Boolean = vue.GetState(\"drawer\",Fa";
_bdrawer = BA.ObjectToBoolean(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,"drawer",(Object)(__c.False)));
RDebugUtils.currentLine=220987395;
 //BA.debugLineNum = 220987395;BA.debugLine="bDrawer = Not(bDrawer)";
_bdrawer = __c.Not(_bdrawer);
RDebugUtils.currentLine=220987396;
 //BA.debugLineNum = 220987396;BA.debugLine="vue.SetStateSingle(\"menushow\", bDrawer)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"menushow",(Object)(_bdrawer));
RDebugUtils.currentLine=220987397;
 //BA.debugLineNum = 220987397;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _settransparent(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "settransparent", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "settransparent", new Object[] {_b}));}
RDebugUtils.currentLine=221904896;
 //BA.debugLineNum = 221904896;BA.debugLine="Sub SetTransparent(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=221904897;
 //BA.debugLineNum = 221904897;BA.debugLine="ToolBar.SetTransparent(b)";
__ref._toolbar /*b4j.example.vmelement*/ ._settransparent /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=221904898;
 //BA.debugLineNum = 221904898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221904899;
 //BA.debugLineNum = 221904899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setelevation(b4j.example.vmtoolbar __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=221970432;
 //BA.debugLineNum = 221970432;BA.debugLine="Sub SetElevation(e As Int) As VMToolBar";
RDebugUtils.currentLine=221970433;
 //BA.debugLineNum = 221970433;BA.debugLine="ToolBar.SetElevation(e)";
__ref._toolbar /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=221970434;
 //BA.debugLineNum = 221970434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221970435;
 //BA.debugLineNum = 221970435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createbutton(b4j.example.vmtoolbar __ref,String _btnid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "createbutton", new Object[] {_btnid}));}
b4j.example.vmbutton _el = null;
RDebugUtils.currentLine=221249536;
 //BA.debugLineNum = 221249536;BA.debugLine="Sub CreateButton(btnID As String) As VMButton";
RDebugUtils.currentLine=221249537;
 //BA.debugLineNum = 221249537;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
RDebugUtils.currentLine=221249538;
 //BA.debugLineNum = 221249538;BA.debugLine="el.Initialize(vue, btnID, module)";
_el._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_btnid,__ref._module /*Object*/ );
RDebugUtils.currentLine=221249539;
 //BA.debugLineNum = 221249539;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=221249540;
 //BA.debugLineNum = 221249540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settabletoolbar(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "settabletoolbar", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "settabletoolbar", new Object[] {_b}));}
RDebugUtils.currentLine=219545600;
 //BA.debugLineNum = 219545600;BA.debugLine="Sub SetTableToolbar(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=219545601;
 //BA.debugLineNum = 219545601;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
RDebugUtils.currentLine=219545602;
 //BA.debugLineNum = 219545602;BA.debugLine="ToolBar.SetTag(\"md-table-toolbar\")";
__ref._toolbar /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-table-toolbar");
RDebugUtils.currentLine=219545603;
 //BA.debugLineNum = 219545603;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=219545604;
 //BA.debugLineNum = 219545604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=219545605;
 //BA.debugLineNum = 219545605;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addavatar(b4j.example.vmtoolbar __ref,String _key,String _imgurl,String _txt,String _tooltip,String _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addavatar", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addavatar", new Object[] {_key,_imgurl,_txt,_tooltip,_badge}));}
b4j.example.vmavatar _avt = null;
RDebugUtils.currentLine=220659712;
 //BA.debugLineNum = 220659712;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, txt";
RDebugUtils.currentLine=220659713;
 //BA.debugLineNum = 220659713;BA.debugLine="Dim avt As VMAvatar";
_avt = new b4j.example.vmavatar();
RDebugUtils.currentLine=220659714;
 //BA.debugLineNum = 220659714;BA.debugLine="avt.Initialize(vue, key,module)";
_avt._initialize /*b4j.example.vmavatar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ );
RDebugUtils.currentLine=220659715;
 //BA.debugLineNum = 220659715;BA.debugLine="avt.SetValue(imgURL)";
_avt._setvalue /*b4j.example.vmavatar*/ (null,_imgurl);
RDebugUtils.currentLine=220659716;
 //BA.debugLineNum = 220659716;BA.debugLine="avt.SetAlt(txt)";
_avt._setalt /*b4j.example.vmavatar*/ (null,_txt);
RDebugUtils.currentLine=220659717;
 //BA.debugLineNum = 220659717;BA.debugLine="avt.SetToolTip(toolTip)";
_avt._settooltip /*b4j.example.vmavatar*/ (null,_tooltip);
RDebugUtils.currentLine=220659718;
 //BA.debugLineNum = 220659718;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
RDebugUtils.currentLine=220659719;
 //BA.debugLineNum = 220659719;BA.debugLine="avt.SetBadgeContent(badge)";
_avt._setbadgecontent /*b4j.example.vmavatar*/ (null,(int)(Double.parseDouble(_badge)));
 };
RDebugUtils.currentLine=220659721;
 //BA.debugLineNum = 220659721;BA.debugLine="avt.Pop(EndSection)";
_avt._pop /*String*/ (null,__ref._endsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=220659722;
 //BA.debugLineNum = 220659722;BA.debugLine="EndSection.hasContent = True";
__ref._endsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220659723;
 //BA.debugLineNum = 220659723;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220659724;
 //BA.debugLineNum = 220659724;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220659725;
 //BA.debugLineNum = 220659725;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addavatarstart(b4j.example.vmtoolbar __ref,String _key,String _imgurl,String _txt,String _tooltip,String _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addavatarstart", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addavatarstart", new Object[] {_key,_imgurl,_txt,_tooltip,_badge}));}
b4j.example.vmavatar _avt = null;
RDebugUtils.currentLine=220725248;
 //BA.debugLineNum = 220725248;BA.debugLine="Sub AddAvatarStart(key As String, imgURL As String";
RDebugUtils.currentLine=220725249;
 //BA.debugLineNum = 220725249;BA.debugLine="Dim avt As VMAvatar";
_avt = new b4j.example.vmavatar();
RDebugUtils.currentLine=220725250;
 //BA.debugLineNum = 220725250;BA.debugLine="avt.Initialize(vue, key,module)";
_avt._initialize /*b4j.example.vmavatar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ );
RDebugUtils.currentLine=220725251;
 //BA.debugLineNum = 220725251;BA.debugLine="avt.SetValue(imgURL)";
_avt._setvalue /*b4j.example.vmavatar*/ (null,_imgurl);
RDebugUtils.currentLine=220725252;
 //BA.debugLineNum = 220725252;BA.debugLine="avt.SetAlt(txt)";
_avt._setalt /*b4j.example.vmavatar*/ (null,_txt);
RDebugUtils.currentLine=220725253;
 //BA.debugLineNum = 220725253;BA.debugLine="avt.SetToolTip(toolTip)";
_avt._settooltip /*b4j.example.vmavatar*/ (null,_tooltip);
RDebugUtils.currentLine=220725254;
 //BA.debugLineNum = 220725254;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
RDebugUtils.currentLine=220725255;
 //BA.debugLineNum = 220725255;BA.debugLine="avt.SetBadgeContent(badge)";
_avt._setbadgecontent /*b4j.example.vmavatar*/ (null,(int)(Double.parseDouble(_badge)));
 };
RDebugUtils.currentLine=220725257;
 //BA.debugLineNum = 220725257;BA.debugLine="avt.Pop(StartSection)";
_avt._pop /*String*/ (null,__ref._startsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=220725258;
 //BA.debugLineNum = 220725258;BA.debugLine="StartSection.hasContent = True";
__ref._startsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220725259;
 //BA.debugLineNum = 220725259;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220725260;
 //BA.debugLineNum = 220725260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220725261;
 //BA.debugLineNum = 220725261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addbutton(b4j.example.vmtoolbar __ref,String _key,String _iconname,String _text,String _tooltip,String _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addbutton", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addbutton", new Object[] {_key,_iconname,_text,_tooltip,_badge}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=220397568;
 //BA.debugLineNum = 220397568;BA.debugLine="Sub AddButton(key As String, iconName As String, t";
RDebugUtils.currentLine=220397569;
 //BA.debugLineNum = 220397569;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=220397570;
 //BA.debugLineNum = 220397570;BA.debugLine="btn.Initialize(vue, key, module).SetToolTip(toolT";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ )._settooltip /*b4j.example.vmbutton*/ (null,_tooltip)._seticon /*b4j.example.vmbutton*/ (null,_iconname)._settext /*b4j.example.vmbutton*/ (null,_text);
RDebugUtils.currentLine=220397571;
 //BA.debugLineNum = 220397571;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
RDebugUtils.currentLine=220397572;
 //BA.debugLineNum = 220397572;BA.debugLine="btn.SetBadgeContent(badge)";
_btn._setbadgecontent /*b4j.example.vmbutton*/ (null,(int)(Double.parseDouble(_badge)));
 };
RDebugUtils.currentLine=220397574;
 //BA.debugLineNum = 220397574;BA.debugLine="btn.Pop(EndSection)";
_btn._pop /*String*/ (null,__ref._endsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=220397575;
 //BA.debugLineNum = 220397575;BA.debugLine="EndSection.hasContent = True";
__ref._endsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220397576;
 //BA.debugLineNum = 220397576;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220397577;
 //BA.debugLineNum = 220397577;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220397578;
 //BA.debugLineNum = 220397578;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addbuttonstart(b4j.example.vmtoolbar __ref,String _key,String _iconname,String _text,String _tooltip,String _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addbuttonstart", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addbuttonstart", new Object[] {_key,_iconname,_text,_tooltip,_badge}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=220463104;
 //BA.debugLineNum = 220463104;BA.debugLine="Sub AddButtonStart(key As String, iconName As Stri";
RDebugUtils.currentLine=220463105;
 //BA.debugLineNum = 220463105;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=220463106;
 //BA.debugLineNum = 220463106;BA.debugLine="btn.Initialize(vue, key, module).SetToolTip(toolT";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ )._settooltip /*b4j.example.vmbutton*/ (null,_tooltip)._seticon /*b4j.example.vmbutton*/ (null,_iconname)._settext /*b4j.example.vmbutton*/ (null,_text);
RDebugUtils.currentLine=220463107;
 //BA.debugLineNum = 220463107;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
RDebugUtils.currentLine=220463108;
 //BA.debugLineNum = 220463108;BA.debugLine="btn.SetBadgeContent(badge)";
_btn._setbadgecontent /*b4j.example.vmbutton*/ (null,(int)(Double.parseDouble(_badge)));
 };
RDebugUtils.currentLine=220463110;
 //BA.debugLineNum = 220463110;BA.debugLine="btn.Pop(StartSection)";
_btn._pop /*String*/ (null,__ref._startsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=220463111;
 //BA.debugLineNum = 220463111;BA.debugLine="StartSection.hasContent = True";
__ref._startsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220463112;
 //BA.debugLineNum = 220463112;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220463113;
 //BA.debugLineNum = 220463113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220463114;
 //BA.debugLineNum = 220463114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addclass(b4j.example.vmtoolbar __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=221446144;
 //BA.debugLineNum = 221446144;BA.debugLine="Sub AddClass(c As String) As VMToolBar";
RDebugUtils.currentLine=221446145;
 //BA.debugLineNum = 221446145;BA.debugLine="ToolBar.AddClass(c)";
__ref._toolbar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=221446146;
 //BA.debugLineNum = 221446146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221446147;
 //BA.debugLineNum = 221446147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addiconstart(b4j.example.vmtoolbar __ref,String _key,String _iconname,String _tooltip,String _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addiconstart", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addiconstart", new Object[] {_key,_iconname,_tooltip,_badge}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=220790784;
 //BA.debugLineNum = 220790784;BA.debugLine="Sub AddIconStart(key As String, iconName As String";
RDebugUtils.currentLine=220790785;
 //BA.debugLineNum = 220790785;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=220790786;
 //BA.debugLineNum = 220790786;BA.debugLine="btn.Initialize(vue, key, module).SetIcon(iconName";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_key,__ref._module /*Object*/ )._seticon /*b4j.example.vmbutton*/ (null,_iconname)._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True)._settooltip /*b4j.example.vmbutton*/ (null,_tooltip);
RDebugUtils.currentLine=220790787;
 //BA.debugLineNum = 220790787;BA.debugLine="If badge <> \"\" Then";
if ((_badge).equals("") == false) { 
RDebugUtils.currentLine=220790788;
 //BA.debugLineNum = 220790788;BA.debugLine="btn.SetBadgeContent(badge)";
_btn._setbadgecontent /*b4j.example.vmbutton*/ (null,(int)(Double.parseDouble(_badge)));
 };
RDebugUtils.currentLine=220790790;
 //BA.debugLineNum = 220790790;BA.debugLine="btn.Pop(StartSection)";
_btn._pop /*String*/ (null,__ref._startsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=220790791;
 //BA.debugLineNum = 220790791;BA.debugLine="StartSection.hasContent = True";
__ref._startsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220790792;
 //BA.debugLineNum = 220790792;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220790793;
 //BA.debugLineNum = 220790793;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220790794;
 //BA.debugLineNum = 220790794;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addmenu(b4j.example.vmtoolbar __ref,b4j.example.vmmenu _mnu) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addmenu", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addmenu", new Object[] {_mnu}));}
RDebugUtils.currentLine=220528640;
 //BA.debugLineNum = 220528640;BA.debugLine="Sub AddMenu(mnu As VMMenu) As VMToolBar";
RDebugUtils.currentLine=220528641;
 //BA.debugLineNum = 220528641;BA.debugLine="mnu.Pop(EndSection)";
_mnu._pop /*String*/ (null,__ref._endsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=220528642;
 //BA.debugLineNum = 220528642;BA.debugLine="EndSection.hasContent = True";
__ref._endsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220528643;
 //BA.debugLineNum = 220528643;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220528644;
 //BA.debugLineNum = 220528644;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220528645;
 //BA.debugLineNum = 220528645;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _addmenustart(b4j.example.vmtoolbar __ref,b4j.example.vmmenu _mnu) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addmenustart", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "addmenustart", new Object[] {_mnu}));}
RDebugUtils.currentLine=220594176;
 //BA.debugLineNum = 220594176;BA.debugLine="Sub AddMenuStart(mnu As VMMenu) As VMToolBar";
RDebugUtils.currentLine=220594177;
 //BA.debugLineNum = 220594177;BA.debugLine="mnu.Pop(StartSection)";
_mnu._pop /*String*/ (null,__ref._startsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=220594178;
 //BA.debugLineNum = 220594178;BA.debugLine="StartSection.hasContent = True";
__ref._startsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220594179;
 //BA.debugLineNum = 220594179;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=220594180;
 //BA.debugLineNum = 220594180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220594181;
 //BA.debugLineNum = 220594181;BA.debugLine="End Sub";
return null;
}
public String  _addsearch(b4j.example.vmtoolbar __ref,String _searchid,String _placeholder,String _vmodel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addsearch", true))
	 {return ((String) Debug.delegate(ba, "addsearch", new Object[] {_searchid,_placeholder,_vmodel}));}
b4j.example.vmfield _mf = null;
b4j.example.vminput _inp = null;
RDebugUtils.currentLine=219348992;
 //BA.debugLineNum = 219348992;BA.debugLine="Sub AddSearch(searchID As String, placeHolder As S";
RDebugUtils.currentLine=219348993;
 //BA.debugLineNum = 219348993;BA.debugLine="searchID = searchID.tolowercase";
_searchid = _searchid.toLowerCase();
RDebugUtils.currentLine=219348994;
 //BA.debugLineNum = 219348994;BA.debugLine="Dim mf As VMField";
_mf = new b4j.example.vmfield();
RDebugUtils.currentLine=219348995;
 //BA.debugLineNum = 219348995;BA.debugLine="Dim inp As VMInput";
_inp = new b4j.example.vminput();
RDebugUtils.currentLine=219348997;
 //BA.debugLineNum = 219348997;BA.debugLine="mf.Initialize(vue, ID, $\"${searchID}field\"$, modu";
_mf._initialize /*b4j.example.vmfield*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ ,(""+__c.SmartStringFormatter("",(Object)(_searchid))+"field"),__ref._module /*Object*/ )._setclearable /*b4j.example.vmfield*/ (null,__c.True)._setmaxwidth /*b4j.example.vmfield*/ (null,"300px");
RDebugUtils.currentLine=219348998;
 //BA.debugLineNum = 219348998;BA.debugLine="inp.Initialize(vue, searchID, module).SetPlacehol";
_inp._initialize /*b4j.example.vminput*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_searchid,__ref._module /*Object*/ )._setplaceholder /*b4j.example.vminput*/ (null,(Object)(_placeholder))._setvmodel /*b4j.example.vminput*/ (null,_vmodel);
RDebugUtils.currentLine=219348999;
 //BA.debugLineNum = 219348999;BA.debugLine="inp.Pop(mf.Field)";
_inp._pop /*String*/ (null,_mf._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=219349000;
 //BA.debugLineNum = 219349000;BA.debugLine="mf.Pop(EndSection)";
_mf._pop /*String*/ (null,__ref._endsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=219349001;
 //BA.debugLineNum = 219349001;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmtoolbar __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=222560256;
 //BA.debugLineNum = 222560256;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=222560257;
 //BA.debugLineNum = 222560257;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=222560258;
 //BA.debugLineNum = 222560258;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=222363648;
 //BA.debugLineNum = 222363648;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=222363649;
 //BA.debugLineNum = 222363649;BA.debugLine="If StartSection.hasContent Then";
if (__ref._startsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/ ) { 
RDebugUtils.currentLine=222363650;
 //BA.debugLineNum = 222363650;BA.debugLine="StartSection.Pop(ToolBar)";
__ref._startsection /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._toolbar /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=222363652;
 //BA.debugLineNum = 222363652;BA.debugLine="If EndSection.hasContent Then";
if (__ref._endsection /*b4j.example.vmelement*/ ._hascontent /*boolean*/ ) { 
RDebugUtils.currentLine=222363653;
 //BA.debugLineNum = 222363653;BA.debugLine="EndSection.Pop(ToolBar)";
__ref._endsection /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._toolbar /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=222363655;
 //BA.debugLineNum = 222363655;BA.debugLine="Return ToolBar.tostring";
if (true) return __ref._toolbar /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=222363656;
 //BA.debugLineNum = 222363656;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
RDebugUtils.currentLine=219021312;
 //BA.debugLineNum = 219021312;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=219021313;
 //BA.debugLineNum = 219021313;BA.debugLine="Public ToolBar As VMElement";
_toolbar = new b4j.example.vmelement();
RDebugUtils.currentLine=219021314;
 //BA.debugLineNum = 219021314;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=219021315;
 //BA.debugLineNum = 219021315;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=219021316;
 //BA.debugLineNum = 219021316;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
RDebugUtils.currentLine=219021317;
 //BA.debugLineNum = 219021317;BA.debugLine="Public EndSection As VMElement";
_endsection = new b4j.example.vmelement();
RDebugUtils.currentLine=219021318;
 //BA.debugLineNum = 219021318;BA.debugLine="Public StartSection As VMElement";
_startsection = new b4j.example.vmelement();
RDebugUtils.currentLine=219021319;
 //BA.debugLineNum = 219021319;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=219021320;
 //BA.debugLineNum = 219021320;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=221380608;
 //BA.debugLineNum = 221380608;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=221380609;
 //BA.debugLineNum = 221380609;BA.debugLine="SetVisible(False)";
__ref._setvisible /*b4j.example.vmtoolbar*/ (null,__c.False);
RDebugUtils.currentLine=221380610;
 //BA.debugLineNum = 221380610;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _setvisible(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=221052928;
 //BA.debugLineNum = 221052928;BA.debugLine="Sub SetVisible(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=221052929;
 //BA.debugLineNum = 221052929;BA.debugLine="ToolBar.SetVisible(b)";
__ref._toolbar /*b4j.example.vmelement*/ ._setvisible /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=221052930;
 //BA.debugLineNum = 221052930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221052931;
 //BA.debugLineNum = 221052931;BA.debugLine="End Sub";
return null;
}
public String  _hidebackbutton(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "hidebackbutton", true))
	 {return ((String) Debug.delegate(ba, "hidebackbutton", null));}
RDebugUtils.currentLine=219676672;
 //BA.debugLineNum = 219676672;BA.debugLine="Sub HideBackButton";
RDebugUtils.currentLine=219676673;
 //BA.debugLineNum = 219676673;BA.debugLine="SetHasBackButton(False)";
__ref._sethasbackbutton /*b4j.example.vmtoolbar*/ (null,__c.False);
RDebugUtils.currentLine=219676674;
 //BA.debugLineNum = 219676674;BA.debugLine="End Sub";
return "";
}
public String  _hidemenu(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "hidemenu", true))
	 {return ((String) Debug.delegate(ba, "hidemenu", null));}
RDebugUtils.currentLine=219873280;
 //BA.debugLineNum = 219873280;BA.debugLine="Sub HideMenu";
RDebugUtils.currentLine=219873281;
 //BA.debugLineNum = 219873281;BA.debugLine="SetHasMenuButton(False)";
__ref._sethasmenubutton /*b4j.example.vmtoolbar*/ (null,__c.False);
RDebugUtils.currentLine=219873282;
 //BA.debugLineNum = 219873282;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _settoolbar(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "settoolbar", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "settoolbar", new Object[] {_b}));}
RDebugUtils.currentLine=219480064;
 //BA.debugLineNum = 219480064;BA.debugLine="Sub SetToolbar(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=219480065;
 //BA.debugLineNum = 219480065;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtoolbar)(this);};
RDebugUtils.currentLine=219480066;
 //BA.debugLineNum = 219480066;BA.debugLine="ToolBar.SetTag(\"md-toolbar\")";
__ref._toolbar /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-toolbar");
RDebugUtils.currentLine=219480067;
 //BA.debugLineNum = 219480067;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=219480068;
 //BA.debugLineNum = 219480068;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=219480069;
 //BA.debugLineNum = 219480069;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=222429184;
 //BA.debugLineNum = 222429184;BA.debugLine="Sub Render";
RDebugUtils.currentLine=222429185;
 //BA.debugLineNum = 222429185;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=222429186;
 //BA.debugLineNum = 222429186;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _setaccent(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=222101504;
 //BA.debugLineNum = 222101504;BA.debugLine="Sub SetAccent(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=222101505;
 //BA.debugLineNum = 222101505;BA.debugLine="ToolBar.SetAccent(True)";
__ref._toolbar /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=222101506;
 //BA.debugLineNum = 222101506;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=222101507;
 //BA.debugLineNum = 222101507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=222101508;
 //BA.debugLineNum = 222101508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setattr(b4j.example.vmtoolbar __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=221511680;
 //BA.debugLineNum = 221511680;BA.debugLine="Sub SetAttr(attr As Map) As VMToolBar";
RDebugUtils.currentLine=221511681;
 //BA.debugLineNum = 221511681;BA.debugLine="ToolBar.SetAttr(attr)";
__ref._toolbar /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=221511682;
 //BA.debugLineNum = 221511682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221511683;
 //BA.debugLineNum = 221511683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdense(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setdense", new Object[] {_b}));}
RDebugUtils.currentLine=221708288;
 //BA.debugLineNum = 221708288;BA.debugLine="Sub SetDense(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=221708289;
 //BA.debugLineNum = 221708289;BA.debugLine="ToolBar.SetDense(b)";
__ref._toolbar /*b4j.example.vmelement*/ ._setdense /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=221708290;
 //BA.debugLineNum = 221708290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221708291;
 //BA.debugLineNum = 221708291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setdisabled(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=219611136;
 //BA.debugLineNum = 219611136;BA.debugLine="Sub SetDisabled(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=219611137;
 //BA.debugLineNum = 219611137;BA.debugLine="ToolBar.SetDisabled(b)";
__ref._toolbar /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=219611138;
 //BA.debugLineNum = 219611138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=219611139;
 //BA.debugLineNum = 219611139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setlarge(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setlarge", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setlarge", new Object[] {_b}));}
RDebugUtils.currentLine=221773824;
 //BA.debugLineNum = 221773824;BA.debugLine="Sub SetLarge(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=221773825;
 //BA.debugLineNum = 221773825;BA.debugLine="ToolBar.SetLarge(b)";
__ref._toolbar /*b4j.example.vmelement*/ ._setlarge /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=221773826;
 //BA.debugLineNum = 221773826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221773827;
 //BA.debugLineNum = 221773827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmarginall(b4j.example.vmtoolbar __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setmarginall", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setmarginall", new Object[] {_p}));}
RDebugUtils.currentLine=222298112;
 //BA.debugLineNum = 222298112;BA.debugLine="Sub SetMarginAll(p As String) As VMToolBar";
RDebugUtils.currentLine=222298113;
 //BA.debugLineNum = 222298113;BA.debugLine="ToolBar.SetMarginAll(p)";
__ref._toolbar /*b4j.example.vmelement*/ ._setmarginall /*b4j.example.vmelement*/ (null,(Object)(_p));
RDebugUtils.currentLine=222298114;
 //BA.debugLineNum = 222298114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=222298115;
 //BA.debugLineNum = 222298115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmedium(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setmedium", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setmedium", new Object[] {_b}));}
RDebugUtils.currentLine=221839360;
 //BA.debugLineNum = 221839360;BA.debugLine="Sub SetMedium(b As Boolean) As VMToolBar";
RDebugUtils.currentLine=221839361;
 //BA.debugLineNum = 221839361;BA.debugLine="ToolBar.SetMedium(b)";
__ref._toolbar /*b4j.example.vmelement*/ ._setmedium /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=221839362;
 //BA.debugLineNum = 221839362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221839363;
 //BA.debugLineNum = 221839363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmode(b4j.example.vmtoolbar __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setmode", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setmode", new Object[] {_str}));}
String _pp = "";
RDebugUtils.currentLine=219938816;
 //BA.debugLineNum = 219938816;BA.debugLine="Sub SetMode(str As String) As VMToolBar   'ignore";
RDebugUtils.currentLine=219938817;
 //BA.debugLineNum = 219938817;BA.debugLine="Dim pp As String = $\"${ID}mode\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"mode");
RDebugUtils.currentLine=219938818;
 //BA.debugLineNum = 219938818;BA.debugLine="vue.SetStateSingle(pp, str)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_str));
RDebugUtils.currentLine=219938819;
 //BA.debugLineNum = 219938819;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=219938820;
 //BA.debugLineNum = 219938820;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodefixedlast(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setmodefixedlast", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setmodefixedlast", new Object[] {_b}));}
RDebugUtils.currentLine=220200960;
 //BA.debugLineNum = 220200960;BA.debugLine="Sub SetModeFixedLast(b As Boolean) As VMToolBar  '";
RDebugUtils.currentLine=220200961;
 //BA.debugLineNum = 220200961;BA.debugLine="SetMode(\"fixed-last\")";
__ref._setmode /*b4j.example.vmtoolbar*/ (null,"fixed-last");
RDebugUtils.currentLine=220200962;
 //BA.debugLineNum = 220200962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220200963;
 //BA.debugLineNum = 220200963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodeflexible(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setmodeflexible", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setmodeflexible", new Object[] {_b}));}
RDebugUtils.currentLine=220135424;
 //BA.debugLineNum = 220135424;BA.debugLine="Sub SetModeFlexible(b As Boolean) As VMToolBar  'i";
RDebugUtils.currentLine=220135425;
 //BA.debugLineNum = 220135425;BA.debugLine="SetMode(\"flexible\")";
__ref._setmode /*b4j.example.vmtoolbar*/ (null,"flexible");
RDebugUtils.currentLine=220135426;
 //BA.debugLineNum = 220135426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220135427;
 //BA.debugLineNum = 220135427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodeoverlap(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setmodeoverlap", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setmodeoverlap", new Object[] {_b}));}
RDebugUtils.currentLine=220266496;
 //BA.debugLineNum = 220266496;BA.debugLine="Sub SetModeOverlap(b As Boolean) As VMToolBar   'i";
RDebugUtils.currentLine=220266497;
 //BA.debugLineNum = 220266497;BA.debugLine="SetMode(\"overlap\")";
__ref._setmode /*b4j.example.vmtoolbar*/ (null,"overlap");
RDebugUtils.currentLine=220266498;
 //BA.debugLineNum = 220266498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220266499;
 //BA.debugLineNum = 220266499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setmodereveal(b4j.example.vmtoolbar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setmodereveal", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setmodereveal", new Object[] {_b}));}
RDebugUtils.currentLine=220069888;
 //BA.debugLineNum = 220069888;BA.debugLine="Sub SetModeReveal(b As Boolean) As VMToolBar   'ig";
RDebugUtils.currentLine=220069889;
 //BA.debugLineNum = 220069889;BA.debugLine="SetMode(\"reveal\")";
__ref._setmode /*b4j.example.vmtoolbar*/ (null,"reveal");
RDebugUtils.currentLine=220069890;
 //BA.debugLineNum = 220069890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=220069891;
 //BA.debugLineNum = 220069891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setpaddingall(b4j.example.vmtoolbar __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setpaddingall", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setpaddingall", new Object[] {_p}));}
RDebugUtils.currentLine=222232576;
 //BA.debugLineNum = 222232576;BA.debugLine="Sub SetPaddingAll(p As String) As VMToolBar";
RDebugUtils.currentLine=222232577;
 //BA.debugLineNum = 222232577;BA.debugLine="ToolBar.SetPaddingAll(p)";
__ref._toolbar /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,(Object)(_p));
RDebugUtils.currentLine=222232578;
 //BA.debugLineNum = 222232578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=222232579;
 //BA.debugLineNum = 222232579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _settext(b4j.example.vmtoolbar __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=222167040;
 //BA.debugLineNum = 222167040;BA.debugLine="Sub SetText(t As String) As VMToolBar";
RDebugUtils.currentLine=222167041;
 //BA.debugLineNum = 222167041;BA.debugLine="ToolBar.SetText(t)";
__ref._toolbar /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=222167042;
 //BA.debugLineNum = 222167042;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=222167043;
 //BA.debugLineNum = 222167043;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=222167044;
 //BA.debugLineNum = 222167044;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvif(b4j.example.vmtoolbar __ref,String _xshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setvif", new Object[] {_xshow}));}
RDebugUtils.currentLine=221184000;
 //BA.debugLineNum = 221184000;BA.debugLine="Sub SetVIf(xshow As String) As VMToolBar";
RDebugUtils.currentLine=221184001;
 //BA.debugLineNum = 221184001;BA.debugLine="ToolBar.SetVif(xshow)";
__ref._toolbar /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_xshow);
RDebugUtils.currentLine=221184002;
 //BA.debugLineNum = 221184002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221184003;
 //BA.debugLineNum = 221184003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _setvshow(b4j.example.vmtoolbar __ref,String _xshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "setvshow", new Object[] {_xshow}));}
RDebugUtils.currentLine=221118464;
 //BA.debugLineNum = 221118464;BA.debugLine="Sub SetVShow(xshow As String) As VMToolBar";
RDebugUtils.currentLine=221118465;
 //BA.debugLineNum = 221118465;BA.debugLine="ToolBar.SetVShow(xshow)";
__ref._toolbar /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_xshow);
RDebugUtils.currentLine=221118466;
 //BA.debugLineNum = 221118466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221118467;
 //BA.debugLineNum = 221118467;BA.debugLine="End Sub";
return null;
}
public String  _showbackbutton(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "showbackbutton", true))
	 {return ((String) Debug.delegate(ba, "showbackbutton", null));}
RDebugUtils.currentLine=219742208;
 //BA.debugLineNum = 219742208;BA.debugLine="Sub ShowBackButton";
RDebugUtils.currentLine=219742209;
 //BA.debugLineNum = 219742209;BA.debugLine="SetHasBackButton(True)";
__ref._sethasbackbutton /*b4j.example.vmtoolbar*/ (null,__c.True);
RDebugUtils.currentLine=219742210;
 //BA.debugLineNum = 219742210;BA.debugLine="End Sub";
return "";
}
public String  _showmenu(b4j.example.vmtoolbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "showmenu", true))
	 {return ((String) Debug.delegate(ba, "showmenu", null));}
RDebugUtils.currentLine=219807744;
 //BA.debugLineNum = 219807744;BA.debugLine="Sub ShowMenu";
RDebugUtils.currentLine=219807745;
 //BA.debugLineNum = 219807745;BA.debugLine="SetHasMenuButton(True)";
__ref._sethasmenubutton /*b4j.example.vmtoolbar*/ (null,__c.True);
RDebugUtils.currentLine=219807746;
 //BA.debugLineNum = 219807746;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtoolbar  _updatelogo(b4j.example.vmtoolbar __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "updatelogo", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "updatelogo", new Object[] {_url}));}
String _pp = "";
RDebugUtils.currentLine=219283456;
 //BA.debugLineNum = 219283456;BA.debugLine="Sub UpdateLogo(URL As String) As VMToolBar";
RDebugUtils.currentLine=219283457;
 //BA.debugLineNum = 219283457;BA.debugLine="Dim pp As String = $\"${ID}logosrc\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"logosrc");
RDebugUtils.currentLine=219283458;
 //BA.debugLineNum = 219283458;BA.debugLine="vue.SetStateSingle(pp, URL)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_url));
RDebugUtils.currentLine=219283459;
 //BA.debugLineNum = 219283459;BA.debugLine="SetHasLogo(True)";
__ref._sethaslogo /*b4j.example.vmtoolbar*/ (null,__c.True);
RDebugUtils.currentLine=219283460;
 //BA.debugLineNum = 219283460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=219283461;
 //BA.debugLineNum = 219283461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _updatetitle(b4j.example.vmtoolbar __ref,String _tt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtoolbar";
if (Debug.shouldDelegate(ba, "updatetitle", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "updatetitle", new Object[] {_tt}));}
String _pp = "";
RDebugUtils.currentLine=221642752;
 //BA.debugLineNum = 221642752;BA.debugLine="Sub UpdateTitle(tt As String) As VMToolBar";
RDebugUtils.currentLine=221642753;
 //BA.debugLineNum = 221642753;BA.debugLine="Dim pp As String = $\"${ID}title\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"title");
RDebugUtils.currentLine=221642754;
 //BA.debugLineNum = 221642754;BA.debugLine="vue.SetStateSingle(pp, tt)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_tt));
RDebugUtils.currentLine=221642755;
 //BA.debugLineNum = 221642755;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtoolbar)(this);
RDebugUtils.currentLine=221642756;
 //BA.debugLineNum = 221642756;BA.debugLine="End Sub";
return null;
}
}