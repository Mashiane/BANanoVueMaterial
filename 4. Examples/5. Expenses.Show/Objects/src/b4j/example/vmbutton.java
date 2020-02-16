package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbutton.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _button = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hasbadge = false;
public b4j.example.vmbadge _badge = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmbutton  _initialize(b4j.example.vmbutton __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=71696384;
 //BA.debugLineNum = 71696384;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=71696385;
 //BA.debugLineNum = 71696385;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=71696386;
 //BA.debugLineNum = 71696386;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=71696387;
 //BA.debugLineNum = 71696387;BA.debugLine="Button.Initialize(vue, ID).SetTag(\"md-button\")";
__ref._button /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-button");
RDebugUtils.currentLine=71696388;
 //BA.debugLineNum = 71696388;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=71696389;
 //BA.debugLineNum = 71696389;BA.debugLine="hasBadge = False";
__ref._hasbadge /*boolean*/  = __c.False;
RDebugUtils.currentLine=71696390;
 //BA.debugLineNum = 71696390;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
__ref._badge /*b4j.example.vmbadge*/ ._initialize /*b4j.example.vmbadge*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"badge"));
 };
RDebugUtils.currentLine=71696392;
 //BA.debugLineNum = 71696392;BA.debugLine="Button.SetOnClick(eventHandler, $\"${ID}_click\"$)";
__ref._button /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,_eventhandler,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=71696393;
 //BA.debugLineNum = 71696393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=71696394;
 //BA.debugLineNum = 71696394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _seticonbutton(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "seticonbutton", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "seticonbutton", new Object[] {_b}));}
RDebugUtils.currentLine=74317824;
 //BA.debugLineNum = 74317824;BA.debugLine="Sub SetIconButton(b As Boolean) As VMButton";
RDebugUtils.currentLine=74317825;
 //BA.debugLineNum = 74317825;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74317826;
 //BA.debugLineNum = 74317826;BA.debugLine="Button.AddClass(\"md-icon-button\")";
__ref._button /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-icon-button");
RDebugUtils.currentLine=74317827;
 //BA.debugLineNum = 74317827;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74317828;
 //BA.debugLineNum = 74317828;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _seticon(b4j.example.vmbutton __ref,String _icn) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "seticon", new Object[] {_icn}));}
b4j.example.vmelement _icon = null;
RDebugUtils.currentLine=74514432;
 //BA.debugLineNum = 74514432;BA.debugLine="Sub SetIcon(icn As String) As VMButton";
RDebugUtils.currentLine=74514433;
 //BA.debugLineNum = 74514433;BA.debugLine="If icn = \"\" Then Return Me";
if ((_icn).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74514434;
 //BA.debugLineNum = 74514434;BA.debugLine="Dim icon As VMElement";
_icon = new b4j.example.vmelement();
RDebugUtils.currentLine=74514435;
 //BA.debugLineNum = 74514435;BA.debugLine="icon.Initialize(vue,$\"${ID}icn\"$).SetTagIcon(True";
_icon._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icn"))._settagicon /*b4j.example.vmelement*/ (null,__c.True)._settext /*b4j.example.vmelement*/ (null,_icn);
RDebugUtils.currentLine=74514436;
 //BA.debugLineNum = 74514436;BA.debugLine="icon.Pop(Button)";
_icon._pop /*String*/ (null,__ref._button /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=74514437;
 //BA.debugLineNum = 74514437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74514438;
 //BA.debugLineNum = 74514438;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmbutton __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=74842112;
 //BA.debugLineNum = 74842112;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=74842113;
 //BA.debugLineNum = 74842113;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=74842114;
 //BA.debugLineNum = 74842114;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _setonclick(b4j.example.vmbutton __ref,Object _targetmodule) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setonclick", new Object[] {_targetmodule}));}
RDebugUtils.currentLine=72548352;
 //BA.debugLineNum = 72548352;BA.debugLine="Sub SetOnClick(targetModule As Object) As VMButton";
RDebugUtils.currentLine=72548353;
 //BA.debugLineNum = 72548353;BA.debugLine="Button.SetOnClick(targetModule, $\"${ID}_click\"$)";
__ref._button /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,_targetmodule,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=72548354;
 //BA.debugLineNum = 72548354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72548355;
 //BA.debugLineNum = 72548355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _addclass(b4j.example.vmbutton __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=73596928;
 //BA.debugLineNum = 73596928;BA.debugLine="Sub AddClass(c As String) As VMButton";
RDebugUtils.currentLine=73596929;
 //BA.debugLineNum = 73596929;BA.debugLine="Button.AddClass(c)";
__ref._button /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=73596930;
 //BA.debugLineNum = 73596930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73596931;
 //BA.debugLineNum = 73596931;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmbutton __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=74907648;
 //BA.debugLineNum = 74907648;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=74907649;
 //BA.debugLineNum = 74907649;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=74907650;
 //BA.debugLineNum = 74907650;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
String _strbtn = "";
RDebugUtils.currentLine=74711040;
 //BA.debugLineNum = 74711040;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=74711041;
 //BA.debugLineNum = 74711041;BA.debugLine="If hasBadge Then";
if (__ref._hasbadge /*boolean*/ ) { 
RDebugUtils.currentLine=74711042;
 //BA.debugLineNum = 74711042;BA.debugLine="Dim strBTN As String = Button.ToString";
_strbtn = __ref._button /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=74711043;
 //BA.debugLineNum = 74711043;BA.debugLine="badge.SetText(strBTN)";
__ref._badge /*b4j.example.vmbadge*/ ._settext /*b4j.example.vmbadge*/ (null,(Object)(_strbtn));
RDebugUtils.currentLine=74711044;
 //BA.debugLineNum = 74711044;BA.debugLine="Return badge.tostring";
if (true) return __ref._badge /*b4j.example.vmbadge*/ ._tostring /*String*/ (null);
 }else {
RDebugUtils.currentLine=74711046;
 //BA.debugLineNum = 74711046;BA.debugLine="Return Button.tostring";
if (true) return __ref._button /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
 };
RDebugUtils.currentLine=74711048;
 //BA.debugLineNum = 74711048;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
RDebugUtils.currentLine=71630848;
 //BA.debugLineNum = 71630848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=71630849;
 //BA.debugLineNum = 71630849;BA.debugLine="Public Button As VMElement";
_button = new b4j.example.vmelement();
RDebugUtils.currentLine=71630850;
 //BA.debugLineNum = 71630850;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=71630851;
 //BA.debugLineNum = 71630851;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=71630852;
 //BA.debugLineNum = 71630852;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
RDebugUtils.currentLine=71630853;
 //BA.debugLineNum = 71630853;BA.debugLine="Private badge As VMBadge";
_badge = new b4j.example.vmbadge();
RDebugUtils.currentLine=71630854;
 //BA.debugLineNum = 71630854;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=71827456;
 //BA.debugLineNum = 71827456;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=71827457;
 //BA.debugLineNum = 71827457;BA.debugLine="Button.hide";
__ref._button /*b4j.example.vmelement*/ ._hide /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=71827458;
 //BA.debugLineNum = 71827458;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _removeattr(b4j.example.vmbutton __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "removeattr", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "removeattr", new Object[] {_sname}));}
RDebugUtils.currentLine=71761920;
 //BA.debugLineNum = 71761920;BA.debugLine="public Sub RemoveAttr(sName As String) As VMButton";
RDebugUtils.currentLine=71761921;
 //BA.debugLineNum = 71761921;BA.debugLine="Button.RemoveAttr(sName)";
__ref._button /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,_sname);
RDebugUtils.currentLine=71761922;
 //BA.debugLineNum = 71761922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=71761923;
 //BA.debugLineNum = 71761923;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=74776576;
 //BA.debugLineNum = 74776576;BA.debugLine="Sub Render";
RDebugUtils.currentLine=74776577;
 //BA.debugLineNum = 74776577;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=74776578;
 //BA.debugLineNum = 74776578;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _setaccent(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=74121216;
 //BA.debugLineNum = 74121216;BA.debugLine="Sub SetAccent(b As Boolean) As VMButton";
RDebugUtils.currentLine=74121217;
 //BA.debugLineNum = 74121217;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74121218;
 //BA.debugLineNum = 74121218;BA.debugLine="Button.SetAccent(b)";
__ref._button /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=74121219;
 //BA.debugLineNum = 74121219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74121220;
 //BA.debugLineNum = 74121220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setattr(b4j.example.vmbutton __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=73662464;
 //BA.debugLineNum = 73662464;BA.debugLine="Sub SetAttr(attr As Map) As VMButton";
RDebugUtils.currentLine=73662465;
 //BA.debugLineNum = 73662465;BA.debugLine="Button.SetAttr(attr)";
__ref._button /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=73662466;
 //BA.debugLineNum = 73662466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73662467;
 //BA.debugLineNum = 73662467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgeaccent(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setbadgeaccent", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setbadgeaccent", null));}
RDebugUtils.currentLine=72744960;
 //BA.debugLineNum = 72744960;BA.debugLine="Sub SetBadgeAccent As VMButton";
RDebugUtils.currentLine=72744961;
 //BA.debugLineNum = 72744961;BA.debugLine="badge.SetAccent(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setaccent /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=72744962;
 //BA.debugLineNum = 72744962;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=72744963;
 //BA.debugLineNum = 72744963;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72744964;
 //BA.debugLineNum = 72744964;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgecontent(b4j.example.vmbutton __ref,int _counted) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setbadgecontent", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setbadgecontent", new Object[] {_counted}));}
RDebugUtils.currentLine=72613888;
 //BA.debugLineNum = 72613888;BA.debugLine="Sub SetBadgeContent(counted As Int) As VMButton";
RDebugUtils.currentLine=72613889;
 //BA.debugLineNum = 72613889;BA.debugLine="badge.SetContent(counted)";
__ref._badge /*b4j.example.vmbadge*/ ._setcontent /*b4j.example.vmbadge*/ (null,_counted);
RDebugUtils.currentLine=72613890;
 //BA.debugLineNum = 72613890;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=72613891;
 //BA.debugLineNum = 72613891;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72613892;
 //BA.debugLineNum = 72613892;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgedense(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setbadgedense", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setbadgedense", null));}
RDebugUtils.currentLine=72941568;
 //BA.debugLineNum = 72941568;BA.debugLine="Sub SetBadgeDense As VMButton";
RDebugUtils.currentLine=72941569;
 //BA.debugLineNum = 72941569;BA.debugLine="badge.SetDense(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setdense /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=72941570;
 //BA.debugLineNum = 72941570;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=72941571;
 //BA.debugLineNum = 72941571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72941572;
 //BA.debugLineNum = 72941572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgeonbottom(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setbadgeonbottom", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setbadgeonbottom", null));}
RDebugUtils.currentLine=72876032;
 //BA.debugLineNum = 72876032;BA.debugLine="Sub SetBadgeOnBottom As VMButton";
RDebugUtils.currentLine=72876033;
 //BA.debugLineNum = 72876033;BA.debugLine="badge.SetPositionBottom(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setpositionbottom /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=72876034;
 //BA.debugLineNum = 72876034;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=72876035;
 //BA.debugLineNum = 72876035;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72876036;
 //BA.debugLineNum = 72876036;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgeontop(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setbadgeontop", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setbadgeontop", null));}
RDebugUtils.currentLine=72810496;
 //BA.debugLineNum = 72810496;BA.debugLine="Sub SetBadgeOnTop As VMButton";
RDebugUtils.currentLine=72810497;
 //BA.debugLineNum = 72810497;BA.debugLine="badge.SetPositionTop(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setpositiontop /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=72810498;
 //BA.debugLineNum = 72810498;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=72810499;
 //BA.debugLineNum = 72810499;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72810500;
 //BA.debugLineNum = 72810500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgeprimary(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setbadgeprimary", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setbadgeprimary", null));}
RDebugUtils.currentLine=72679424;
 //BA.debugLineNum = 72679424;BA.debugLine="Sub SetBadgePrimary As VMButton";
RDebugUtils.currentLine=72679425;
 //BA.debugLineNum = 72679425;BA.debugLine="badge.SetPrimary(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setprimary /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=72679426;
 //BA.debugLineNum = 72679426;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=72679427;
 //BA.debugLineNum = 72679427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72679428;
 //BA.debugLineNum = 72679428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setbadgesquare(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setbadgesquare", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setbadgesquare", null));}
RDebugUtils.currentLine=73007104;
 //BA.debugLineNum = 73007104;BA.debugLine="Sub SetBadgeSquare As VMButton";
RDebugUtils.currentLine=73007105;
 //BA.debugLineNum = 73007105;BA.debugLine="badge.SetSquare(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setsquare /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=73007106;
 //BA.debugLineNum = 73007106;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=73007107;
 //BA.debugLineNum = 73007107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73007108;
 //BA.debugLineNum = 73007108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdense(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setdense", new Object[] {_b}));}
RDebugUtils.currentLine=73859072;
 //BA.debugLineNum = 73859072;BA.debugLine="Sub SetDense(b As Boolean) As VMButton";
RDebugUtils.currentLine=73859073;
 //BA.debugLineNum = 73859073;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=73859074;
 //BA.debugLineNum = 73859074;BA.debugLine="Button.SetDense(b)";
__ref._button /*b4j.example.vmelement*/ ._setdense /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=73859075;
 //BA.debugLineNum = 73859075;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73859076;
 //BA.debugLineNum = 73859076;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setdisabled(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=73728000;
 //BA.debugLineNum = 73728000;BA.debugLine="Sub SetDisabled(b As Boolean) As VMButton";
RDebugUtils.currentLine=73728001;
 //BA.debugLineNum = 73728001;BA.debugLine="Button.SetDisabled(b)";
__ref._button /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=73728002;
 //BA.debugLineNum = 73728002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73728003;
 //BA.debugLineNum = 73728003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfab(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfab", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfab", new Object[] {_b}));}
RDebugUtils.currentLine=72024064;
 //BA.debugLineNum = 72024064;BA.debugLine="Sub SetFab(b As Boolean) As VMButton";
RDebugUtils.currentLine=72024065;
 //BA.debugLineNum = 72024065;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=72024066;
 //BA.debugLineNum = 72024066;BA.debugLine="Button.AddClass(\"md-fab\")";
__ref._button /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-fab");
RDebugUtils.currentLine=72024067;
 //BA.debugLineNum = 72024067;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72024068;
 //BA.debugLineNum = 72024068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabfixed(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfabfixed", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfabfixed", new Object[] {_b}));}
RDebugUtils.currentLine=71958528;
 //BA.debugLineNum = 71958528;BA.debugLine="Sub SetFabFixed(b As Boolean) As VMButton";
RDebugUtils.currentLine=71958529;
 //BA.debugLineNum = 71958529;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=71958530;
 //BA.debugLineNum = 71958530;BA.debugLine="Button.AddClass(\"md-fixed\")";
__ref._button /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-fixed");
RDebugUtils.currentLine=71958531;
 //BA.debugLineNum = 71958531;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=71958532;
 //BA.debugLineNum = 71958532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabposition(b4j.example.vmbutton __ref,String _pos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfabposition", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfabposition", new Object[] {_pos}));}
RDebugUtils.currentLine=72089600;
 //BA.debugLineNum = 72089600;BA.debugLine="Sub SetFabPosition(pos As String) As VMButton";
RDebugUtils.currentLine=72089601;
 //BA.debugLineNum = 72089601;BA.debugLine="If pos = \"\" Then Return Me";
if ((_pos).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=72089602;
 //BA.debugLineNum = 72089602;BA.debugLine="Button.AddClass(pos)";
__ref._button /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_pos);
RDebugUtils.currentLine=72089603;
 //BA.debugLineNum = 72089603;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72089604;
 //BA.debugLineNum = 72089604;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositionbottomcenter(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfabpositionbottomcenter", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfabpositionbottomcenter", null));}
RDebugUtils.currentLine=72417280;
 //BA.debugLineNum = 72417280;BA.debugLine="Sub SetFabPositionBottomCenter As VMButton";
RDebugUtils.currentLine=72417281;
 //BA.debugLineNum = 72417281;BA.debugLine="SetFabPosition(\"md-fab-bottom-center\")";
__ref._setfabposition /*b4j.example.vmbutton*/ (null,"md-fab-bottom-center");
RDebugUtils.currentLine=72417282;
 //BA.debugLineNum = 72417282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72417283;
 //BA.debugLineNum = 72417283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositionbottomleft(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfabpositionbottomleft", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfabpositionbottomleft", null));}
RDebugUtils.currentLine=72482816;
 //BA.debugLineNum = 72482816;BA.debugLine="Sub SetFabPositionBottomLeft As VMButton";
RDebugUtils.currentLine=72482817;
 //BA.debugLineNum = 72482817;BA.debugLine="SetFabPosition(\"md-fab-bottom-left\")";
__ref._setfabposition /*b4j.example.vmbutton*/ (null,"md-fab-bottom-left");
RDebugUtils.currentLine=72482818;
 //BA.debugLineNum = 72482818;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72482819;
 //BA.debugLineNum = 72482819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositionbottomright(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfabpositionbottomright", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfabpositionbottomright", null));}
RDebugUtils.currentLine=72351744;
 //BA.debugLineNum = 72351744;BA.debugLine="Sub SetFabPositionBottomRight As VMButton";
RDebugUtils.currentLine=72351745;
 //BA.debugLineNum = 72351745;BA.debugLine="SetFabPosition(\"md-fab-bottom-right\")";
__ref._setfabposition /*b4j.example.vmbutton*/ (null,"md-fab-bottom-right");
RDebugUtils.currentLine=72351746;
 //BA.debugLineNum = 72351746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72351747;
 //BA.debugLineNum = 72351747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositiontopcenter(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfabpositiontopcenter", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfabpositiontopcenter", null));}
RDebugUtils.currentLine=72220672;
 //BA.debugLineNum = 72220672;BA.debugLine="Sub SetFabPositionTopCenter As VMButton";
RDebugUtils.currentLine=72220673;
 //BA.debugLineNum = 72220673;BA.debugLine="SetFabPosition(\"md-fab-top-center\")";
__ref._setfabposition /*b4j.example.vmbutton*/ (null,"md-fab-top-center");
RDebugUtils.currentLine=72220674;
 //BA.debugLineNum = 72220674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72220675;
 //BA.debugLineNum = 72220675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositiontopleft(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfabpositiontopleft", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfabpositiontopleft", null));}
RDebugUtils.currentLine=72286208;
 //BA.debugLineNum = 72286208;BA.debugLine="Sub SetFabPositionTopLeft As VMButton";
RDebugUtils.currentLine=72286209;
 //BA.debugLineNum = 72286209;BA.debugLine="SetFabPosition(\"md-fab-top-left\")";
__ref._setfabposition /*b4j.example.vmbutton*/ (null,"md-fab-top-left");
RDebugUtils.currentLine=72286210;
 //BA.debugLineNum = 72286210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72286211;
 //BA.debugLineNum = 72286211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setfabpositiontopright(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setfabpositiontopright", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setfabpositiontopright", null));}
RDebugUtils.currentLine=72155136;
 //BA.debugLineNum = 72155136;BA.debugLine="Sub SetFabPositionTopRight As VMButton";
RDebugUtils.currentLine=72155137;
 //BA.debugLineNum = 72155137;BA.debugLine="SetFabPosition(\"md-fab-top-right\")";
__ref._setfabposition /*b4j.example.vmbutton*/ (null,"md-fab-top-right");
RDebugUtils.currentLine=72155138;
 //BA.debugLineNum = 72155138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=72155139;
 //BA.debugLineNum = 72155139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _sethref(b4j.example.vmbutton __ref,String _h,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "sethref", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "sethref", new Object[] {_h,_bind}));}
RDebugUtils.currentLine=74252288;
 //BA.debugLineNum = 74252288;BA.debugLine="Sub SetHREF(h As String, bind As Boolean) As VMBut";
RDebugUtils.currentLine=74252289;
 //BA.debugLineNum = 74252289;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74252290;
 //BA.debugLineNum = 74252290;BA.debugLine="If bind = True Then";
if (_bind==__c.True) { 
RDebugUtils.currentLine=74252291;
 //BA.debugLineNum = 74252291;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
RDebugUtils.currentLine=74252292;
 //BA.debugLineNum = 74252292;BA.debugLine="SetAttr(CreateMap(\":href\":h))";
__ref._setattr /*b4j.example.vmbutton*/ (null,__c.createMap(new Object[] {(Object)(":href"),(Object)(_h)}));
 }else {
RDebugUtils.currentLine=74252294;
 //BA.debugLineNum = 74252294;BA.debugLine="Button.sethref(h)";
__ref._button /*b4j.example.vmelement*/ ._sethref /*b4j.example.vmelement*/ (null,_h);
 };
RDebugUtils.currentLine=74252296;
 //BA.debugLineNum = 74252296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74252297;
 //BA.debugLineNum = 74252297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setid(b4j.example.vmbutton __ref,String _iid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setid", new Object[] {_iid,_bind}));}
RDebugUtils.currentLine=73269248;
 //BA.debugLineNum = 73269248;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMBut";
RDebugUtils.currentLine=73269249;
 //BA.debugLineNum = 73269249;BA.debugLine="Button.SetID(iID,bind)";
__ref._button /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_iid,_bind);
RDebugUtils.currentLine=73269250;
 //BA.debugLineNum = 73269250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73269251;
 //BA.debugLineNum = 73269251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setkey(b4j.example.vmbutton __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=73400320;
 //BA.debugLineNum = 73400320;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMButt";
RDebugUtils.currentLine=73400321;
 //BA.debugLineNum = 73400321;BA.debugLine="Button.SetKey(k, bind)";
__ref._button /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=73400322;
 //BA.debugLineNum = 73400322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73400323;
 //BA.debugLineNum = 73400323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setlistaction(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setlistaction", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setlistaction", new Object[] {_b}));}
RDebugUtils.currentLine=73793536;
 //BA.debugLineNum = 73793536;BA.debugLine="Sub SetListAction(b As Boolean) As VMButton";
RDebugUtils.currentLine=73793537;
 //BA.debugLineNum = 73793537;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=73793538;
 //BA.debugLineNum = 73793538;BA.debugLine="Button.SetListAction(True)";
__ref._button /*b4j.example.vmelement*/ ._setlistaction /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=73793539;
 //BA.debugLineNum = 73793539;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73793540;
 //BA.debugLineNum = 73793540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setmenutrigger(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setmenutrigger", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setmenutrigger", new Object[] {_b}));}
RDebugUtils.currentLine=73465856;
 //BA.debugLineNum = 73465856;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMButton";
RDebugUtils.currentLine=73465857;
 //BA.debugLineNum = 73465857;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=73465858;
 //BA.debugLineNum = 73465858;BA.debugLine="Button.SetAttr(CreateMap(\"md-menu-trigger\": True)";
__ref._button /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-menu-trigger"),(Object)(__c.True)}));
RDebugUtils.currentLine=73465859;
 //BA.debugLineNum = 73465859;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73465860;
 //BA.debugLineNum = 73465860;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setmini(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setmini", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setmini", new Object[] {_b}));}
RDebugUtils.currentLine=74383360;
 //BA.debugLineNum = 74383360;BA.debugLine="Sub SetMini(b As Boolean) As VMButton";
RDebugUtils.currentLine=74383361;
 //BA.debugLineNum = 74383361;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74383362;
 //BA.debugLineNum = 74383362;BA.debugLine="Button.AddClass(\"md-mini\")";
__ref._button /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-mini");
RDebugUtils.currentLine=74383363;
 //BA.debugLineNum = 74383363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74383364;
 //BA.debugLineNum = 74383364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setname(b4j.example.vmbutton __ref,String _nam,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setname", new Object[] {_nam,_bind}));}
RDebugUtils.currentLine=73334784;
 //BA.debugLineNum = 73334784;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMB";
RDebugUtils.currentLine=73334785;
 //BA.debugLineNum = 73334785;BA.debugLine="Button.SetName(nam, bind)";
__ref._button /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_nam,_bind);
RDebugUtils.currentLine=73334786;
 //BA.debugLineNum = 73334786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73334787;
 //BA.debugLineNum = 73334787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setplain(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setplain", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setplain", new Object[] {_b}));}
RDebugUtils.currentLine=74448896;
 //BA.debugLineNum = 74448896;BA.debugLine="Sub SetPlain(b As Boolean) As VMButton";
RDebugUtils.currentLine=74448897;
 //BA.debugLineNum = 74448897;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74448898;
 //BA.debugLineNum = 74448898;BA.debugLine="Button.AddClass(\"md-plain\")";
__ref._button /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-plain");
RDebugUtils.currentLine=74448899;
 //BA.debugLineNum = 74448899;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74448900;
 //BA.debugLineNum = 74448900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setprimary(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=74055680;
 //BA.debugLineNum = 74055680;BA.debugLine="Sub SetPrimary(b As Boolean) As VMButton";
RDebugUtils.currentLine=74055681;
 //BA.debugLineNum = 74055681;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74055682;
 //BA.debugLineNum = 74055682;BA.debugLine="Button.SetPrimary(b)";
__ref._button /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=74055683;
 //BA.debugLineNum = 74055683;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74055684;
 //BA.debugLineNum = 74055684;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setraised(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setraised", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setraised", new Object[] {_b}));}
RDebugUtils.currentLine=73924608;
 //BA.debugLineNum = 73924608;BA.debugLine="Sub SetRaised(b As Boolean) As VMButton";
RDebugUtils.currentLine=73924609;
 //BA.debugLineNum = 73924609;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=73924610;
 //BA.debugLineNum = 73924610;BA.debugLine="Button.AddClass(\"md-raised\")";
__ref._button /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-raised");
RDebugUtils.currentLine=73924611;
 //BA.debugLineNum = 73924611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73924612;
 //BA.debugLineNum = 73924612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setripple(b4j.example.vmbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setripple", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setripple", new Object[] {_b}));}
RDebugUtils.currentLine=73990144;
 //BA.debugLineNum = 73990144;BA.debugLine="Sub SetRipple(b As Boolean) As VMButton";
RDebugUtils.currentLine=73990145;
 //BA.debugLineNum = 73990145;BA.debugLine="Button.SetRipple(b)";
__ref._button /*b4j.example.vmelement*/ ._setripple /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=73990146;
 //BA.debugLineNum = 73990146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73990147;
 //BA.debugLineNum = 73990147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setstyle(b4j.example.vmbutton __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=73138176;
 //BA.debugLineNum = 73138176;BA.debugLine="Sub SetStyle(sm As Map) As VMButton";
RDebugUtils.currentLine=73138177;
 //BA.debugLineNum = 73138177;BA.debugLine="Button.SetStyle(sm)";
__ref._button /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=73138178;
 //BA.debugLineNum = 73138178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73138179;
 //BA.debugLineNum = 73138179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settabindex(b4j.example.vmbutton __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=73072640;
 //BA.debugLineNum = 73072640;BA.debugLine="Sub SetTabIndex(ti As String) As VMButton";
RDebugUtils.currentLine=73072641;
 //BA.debugLineNum = 73072641;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=73072642;
 //BA.debugLineNum = 73072642;BA.debugLine="Button.SetTabIndex(ti)";
__ref._button /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=73072643;
 //BA.debugLineNum = 73072643;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73072644;
 //BA.debugLineNum = 73072644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settext(b4j.example.vmbutton __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=74645504;
 //BA.debugLineNum = 74645504;BA.debugLine="Sub SetText(t As String) As VMButton";
RDebugUtils.currentLine=74645505;
 //BA.debugLineNum = 74645505;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74645506;
 //BA.debugLineNum = 74645506;BA.debugLine="Button.SetText(t)";
__ref._button /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=74645507;
 //BA.debugLineNum = 74645507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74645508;
 //BA.debugLineNum = 74645508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setto(b4j.example.vmbutton __ref,String _t,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setto", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setto", new Object[] {_t,_bind}));}
RDebugUtils.currentLine=74186752;
 //BA.debugLineNum = 74186752;BA.debugLine="Sub SetTo(t As String, bind As Boolean) As VMButto";
RDebugUtils.currentLine=74186753;
 //BA.debugLineNum = 74186753;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74186754;
 //BA.debugLineNum = 74186754;BA.debugLine="If bind = True Then";
if (_bind==__c.True) { 
RDebugUtils.currentLine=74186755;
 //BA.debugLineNum = 74186755;BA.debugLine="t= t.tolowercase";
_t = _t.toLowerCase();
RDebugUtils.currentLine=74186756;
 //BA.debugLineNum = 74186756;BA.debugLine="SetAttr(CreateMap(\":to\":t))";
__ref._setattr /*b4j.example.vmbutton*/ (null,__c.createMap(new Object[] {(Object)(":to"),(Object)(_t)}));
 }else {
RDebugUtils.currentLine=74186758;
 //BA.debugLineNum = 74186758;BA.debugLine="Button.SetTo(t)";
__ref._button /*b4j.example.vmelement*/ ._setto /*b4j.example.vmelement*/ (null,(Object)(_t));
 };
RDebugUtils.currentLine=74186760;
 //BA.debugLineNum = 74186760;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74186761;
 //BA.debugLineNum = 74186761;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _settooltip(b4j.example.vmbutton __ref,String _tt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "settooltip", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "settooltip", new Object[] {_tt}));}
b4j.example.vmtooltip _el = null;
RDebugUtils.currentLine=74579968;
 //BA.debugLineNum = 74579968;BA.debugLine="Sub SetToolTip(tt As String) As VMButton";
RDebugUtils.currentLine=74579969;
 //BA.debugLineNum = 74579969;BA.debugLine="If tt = \"\" Then Return Me";
if ((_tt).equals("")) { 
if (true) return (b4j.example.vmbutton)(this);};
RDebugUtils.currentLine=74579970;
 //BA.debugLineNum = 74579970;BA.debugLine="Dim el As VMTooltip";
_el = new b4j.example.vmtooltip();
RDebugUtils.currentLine=74579971;
 //BA.debugLineNum = 74579971;BA.debugLine="el.Initialize(vue,$\"${ID}tlt\"$).SetText(tt)";
_el._initialize /*b4j.example.vmtooltip*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"tlt"))._settext /*b4j.example.vmtooltip*/ (null,(Object)(_tt));
RDebugUtils.currentLine=74579972;
 //BA.debugLineNum = 74579972;BA.debugLine="el.Pop(Button)";
_el._pop /*String*/ (null,__ref._button /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=74579973;
 //BA.debugLineNum = 74579973;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=74579974;
 //BA.debugLineNum = 74579974;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvif(b4j.example.vmbutton __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=73203712;
 //BA.debugLineNum = 73203712;BA.debugLine="Sub SetVIf(vif As String) As VMButton";
RDebugUtils.currentLine=73203713;
 //BA.debugLineNum = 73203713;BA.debugLine="Button.SetVIf(vif)";
__ref._button /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=73203714;
 //BA.debugLineNum = 73203714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73203715;
 //BA.debugLineNum = 73203715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _setvshow(b4j.example.vmbutton __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=73531392;
 //BA.debugLineNum = 73531392;BA.debugLine="Sub SetVShow(vif As String) As VMButton";
RDebugUtils.currentLine=73531393;
 //BA.debugLineNum = 73531393;BA.debugLine="Button.SetVShow(vif)";
__ref._button /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=73531394;
 //BA.debugLineNum = 73531394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbutton)(this);
RDebugUtils.currentLine=73531395;
 //BA.debugLineNum = 73531395;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.vmbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbutton";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=71892992;
 //BA.debugLineNum = 71892992;BA.debugLine="Sub Show";
RDebugUtils.currentLine=71892993;
 //BA.debugLineNum = 71892993;BA.debugLine="Button.show";
__ref._button /*b4j.example.vmelement*/ ._show /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=71892994;
 //BA.debugLineNum = 71892994;BA.debugLine="End Sub";
return "";
}
}