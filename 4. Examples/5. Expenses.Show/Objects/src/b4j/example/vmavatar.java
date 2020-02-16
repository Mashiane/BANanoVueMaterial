package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmavatar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmavatar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmavatar.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _avatar = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmelement _img = null;
public boolean _hasimage = false;
public boolean _hasbadge = false;
public b4j.example.vmbadge _badge = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmavatar  _initialize(b4j.example.vmavatar __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=64618496;
 //BA.debugLineNum = 64618496;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=64618497;
 //BA.debugLineNum = 64618497;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=64618498;
 //BA.debugLineNum = 64618498;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=64618499;
 //BA.debugLineNum = 64618499;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=64618500;
 //BA.debugLineNum = 64618500;BA.debugLine="Avatar.Initialize(vue, ID).SetTag(\"md-avatar\")";
__ref._avatar /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-avatar");
RDebugUtils.currentLine=64618501;
 //BA.debugLineNum = 64618501;BA.debugLine="img.Initialize(vue,$\"${ID}img\"$).SetTag(\"img\")";
__ref._img /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"img"))._settag /*b4j.example.vmelement*/ (null,"img");
RDebugUtils.currentLine=64618502;
 //BA.debugLineNum = 64618502;BA.debugLine="hasImage = False";
__ref._hasimage /*boolean*/  = __c.False;
RDebugUtils.currentLine=64618503;
 //BA.debugLineNum = 64618503;BA.debugLine="hasBadge = False";
__ref._hasbadge /*boolean*/  = __c.False;
RDebugUtils.currentLine=64618504;
 //BA.debugLineNum = 64618504;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
__ref._badge /*b4j.example.vmbadge*/ ._initialize /*b4j.example.vmbadge*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"badge"));
RDebugUtils.currentLine=64618505;
 //BA.debugLineNum = 64618505;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=64618506;
 //BA.debugLineNum = 64618506;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _addclass(b4j.example.vmavatar __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=65798144;
 //BA.debugLineNum = 65798144;BA.debugLine="Sub AddClass(c As String) As VMAvatar";
RDebugUtils.currentLine=65798145;
 //BA.debugLineNum = 65798145;BA.debugLine="Avatar.AddClass(c)";
__ref._avatar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=65798146;
 //BA.debugLineNum = 65798146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65798147;
 //BA.debugLineNum = 65798147;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmavatar __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=66519040;
 //BA.debugLineNum = 66519040;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=66519041;
 //BA.debugLineNum = 66519041;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=66519042;
 //BA.debugLineNum = 66519042;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
String _strbtn = "";
RDebugUtils.currentLine=66322432;
 //BA.debugLineNum = 66322432;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=66322433;
 //BA.debugLineNum = 66322433;BA.debugLine="If hasImage Then img.Pop(Avatar)";
if (__ref._hasimage /*boolean*/ ) { 
__ref._img /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._avatar /*b4j.example.vmelement*/ );};
RDebugUtils.currentLine=66322435;
 //BA.debugLineNum = 66322435;BA.debugLine="If hasBadge Then";
if (__ref._hasbadge /*boolean*/ ) { 
RDebugUtils.currentLine=66322436;
 //BA.debugLineNum = 66322436;BA.debugLine="Dim strBTN As String = Avatar.ToString";
_strbtn = __ref._avatar /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=66322437;
 //BA.debugLineNum = 66322437;BA.debugLine="badge.SetText(strBTN)";
__ref._badge /*b4j.example.vmbadge*/ ._settext /*b4j.example.vmbadge*/ (null,(Object)(_strbtn));
RDebugUtils.currentLine=66322438;
 //BA.debugLineNum = 66322438;BA.debugLine="Return badge.tostring";
if (true) return __ref._badge /*b4j.example.vmbadge*/ ._tostring /*String*/ (null);
 }else {
RDebugUtils.currentLine=66322440;
 //BA.debugLineNum = 66322440;BA.debugLine="Return Avatar.tostring";
if (true) return __ref._avatar /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
 };
RDebugUtils.currentLine=66322442;
 //BA.debugLineNum = 66322442;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
RDebugUtils.currentLine=64552960;
 //BA.debugLineNum = 64552960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=64552961;
 //BA.debugLineNum = 64552961;BA.debugLine="Public Avatar As VMElement";
_avatar = new b4j.example.vmelement();
RDebugUtils.currentLine=64552962;
 //BA.debugLineNum = 64552962;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=64552963;
 //BA.debugLineNum = 64552963;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=64552964;
 //BA.debugLineNum = 64552964;BA.debugLine="Private img As VMElement";
_img = new b4j.example.vmelement();
RDebugUtils.currentLine=64552965;
 //BA.debugLineNum = 64552965;BA.debugLine="Private hasImage As Boolean";
_hasimage = false;
RDebugUtils.currentLine=64552966;
 //BA.debugLineNum = 64552966;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
RDebugUtils.currentLine=64552967;
 //BA.debugLineNum = 64552967;BA.debugLine="Private badge As VMBadge";
_badge = new b4j.example.vmbadge();
RDebugUtils.currentLine=64552968;
 //BA.debugLineNum = 64552968;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=64552969;
 //BA.debugLineNum = 64552969;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmavatar __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=66453504;
 //BA.debugLineNum = 66453504;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=66453505;
 //BA.debugLineNum = 66453505;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=66453506;
 //BA.debugLineNum = 66453506;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=66387968;
 //BA.debugLineNum = 66387968;BA.debugLine="Sub Render";
RDebugUtils.currentLine=66387969;
 //BA.debugLineNum = 66387969;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=66387970;
 //BA.debugLineNum = 66387970;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmavatar  _setaccent(b4j.example.vmavatar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=65536000;
 //BA.debugLineNum = 65536000;BA.debugLine="Sub SetAccent(b As Boolean) As VMAvatar";
RDebugUtils.currentLine=65536001;
 //BA.debugLineNum = 65536001;BA.debugLine="If b Then Avatar.AddClass(\"md-accent\")";
if (_b) { 
__ref._avatar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-accent");};
RDebugUtils.currentLine=65536002;
 //BA.debugLineNum = 65536002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65536003;
 //BA.debugLineNum = 65536003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setalt(b4j.example.vmavatar __ref,String _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setalt", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setalt", new Object[] {_a}));}
RDebugUtils.currentLine=66191360;
 //BA.debugLineNum = 66191360;BA.debugLine="Sub SetAlt(a As String) As VMAvatar";
RDebugUtils.currentLine=66191361;
 //BA.debugLineNum = 66191361;BA.debugLine="img.SetAlt(a)";
__ref._img /*b4j.example.vmelement*/ ._setalt /*b4j.example.vmelement*/ (null,_a);
RDebugUtils.currentLine=66191362;
 //BA.debugLineNum = 66191362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=66191363;
 //BA.debugLineNum = 66191363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setattr(b4j.example.vmavatar __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=66125824;
 //BA.debugLineNum = 66125824;BA.debugLine="Sub SetAttr(attr As Map) As VMAvatar";
RDebugUtils.currentLine=66125825;
 //BA.debugLineNum = 66125825;BA.debugLine="Avatar.SetAttr(attr)";
__ref._avatar /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=66125826;
 //BA.debugLineNum = 66125826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=66125827;
 //BA.debugLineNum = 66125827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setavataricon(b4j.example.vmavatar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setavataricon", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setavataricon", new Object[] {_b}));}
RDebugUtils.currentLine=65994752;
 //BA.debugLineNum = 65994752;BA.debugLine="Sub SetAvatarIcon(b As Boolean) As VMAvatar";
RDebugUtils.currentLine=65994753;
 //BA.debugLineNum = 65994753;BA.debugLine="If b Then Avatar.AddClass(\"md-avatar-icon\")";
if (_b) { 
__ref._avatar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-avatar-icon");};
RDebugUtils.currentLine=65994754;
 //BA.debugLineNum = 65994754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65994755;
 //BA.debugLineNum = 65994755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgeaccent(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setbadgeaccent", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setbadgeaccent", null));}
RDebugUtils.currentLine=64815104;
 //BA.debugLineNum = 64815104;BA.debugLine="Sub SetBadgeAccent As VMAvatar";
RDebugUtils.currentLine=64815105;
 //BA.debugLineNum = 64815105;BA.debugLine="badge.SetAccent(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setaccent /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=64815106;
 //BA.debugLineNum = 64815106;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=64815107;
 //BA.debugLineNum = 64815107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=64815108;
 //BA.debugLineNum = 64815108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgecontent(b4j.example.vmavatar __ref,int _counted) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setbadgecontent", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setbadgecontent", new Object[] {_counted}));}
RDebugUtils.currentLine=64684032;
 //BA.debugLineNum = 64684032;BA.debugLine="Sub SetBadgeContent(counted As Int) As VMAvatar";
RDebugUtils.currentLine=64684033;
 //BA.debugLineNum = 64684033;BA.debugLine="badge.SetContent(counted)";
__ref._badge /*b4j.example.vmbadge*/ ._setcontent /*b4j.example.vmbadge*/ (null,_counted);
RDebugUtils.currentLine=64684034;
 //BA.debugLineNum = 64684034;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=64684035;
 //BA.debugLineNum = 64684035;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=64684036;
 //BA.debugLineNum = 64684036;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgedense(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setbadgedense", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setbadgedense", null));}
RDebugUtils.currentLine=65011712;
 //BA.debugLineNum = 65011712;BA.debugLine="Sub SetBadgeDense As VMAvatar";
RDebugUtils.currentLine=65011713;
 //BA.debugLineNum = 65011713;BA.debugLine="badge.SetDense(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setdense /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=65011714;
 //BA.debugLineNum = 65011714;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=65011715;
 //BA.debugLineNum = 65011715;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65011716;
 //BA.debugLineNum = 65011716;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgeonbottom(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setbadgeonbottom", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setbadgeonbottom", null));}
RDebugUtils.currentLine=64946176;
 //BA.debugLineNum = 64946176;BA.debugLine="Sub SetBadgeOnBottom As VMAvatar";
RDebugUtils.currentLine=64946177;
 //BA.debugLineNum = 64946177;BA.debugLine="badge.SetPositionBottom(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setpositionbottom /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=64946178;
 //BA.debugLineNum = 64946178;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=64946179;
 //BA.debugLineNum = 64946179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=64946180;
 //BA.debugLineNum = 64946180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgeontop(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setbadgeontop", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setbadgeontop", null));}
RDebugUtils.currentLine=64880640;
 //BA.debugLineNum = 64880640;BA.debugLine="Sub SetBadgeOnTop As VMAvatar";
RDebugUtils.currentLine=64880641;
 //BA.debugLineNum = 64880641;BA.debugLine="badge.SetPositionTop(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setpositiontop /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=64880642;
 //BA.debugLineNum = 64880642;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=64880643;
 //BA.debugLineNum = 64880643;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=64880644;
 //BA.debugLineNum = 64880644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgeprimary(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setbadgeprimary", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setbadgeprimary", null));}
RDebugUtils.currentLine=64749568;
 //BA.debugLineNum = 64749568;BA.debugLine="Sub SetBadgePrimary As VMAvatar";
RDebugUtils.currentLine=64749569;
 //BA.debugLineNum = 64749569;BA.debugLine="badge.SetPrimary(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setprimary /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=64749570;
 //BA.debugLineNum = 64749570;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=64749571;
 //BA.debugLineNum = 64749571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=64749572;
 //BA.debugLineNum = 64749572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setbadgesquare(b4j.example.vmavatar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setbadgesquare", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setbadgesquare", null));}
RDebugUtils.currentLine=65077248;
 //BA.debugLineNum = 65077248;BA.debugLine="Sub SetBadgeSquare As VMAvatar";
RDebugUtils.currentLine=65077249;
 //BA.debugLineNum = 65077249;BA.debugLine="badge.SetSquare(True)";
__ref._badge /*b4j.example.vmbadge*/ ._setsquare /*b4j.example.vmbadge*/ (null,__c.True);
RDebugUtils.currentLine=65077250;
 //BA.debugLineNum = 65077250;BA.debugLine="hasBadge = True";
__ref._hasbadge /*boolean*/  = __c.True;
RDebugUtils.currentLine=65077251;
 //BA.debugLineNum = 65077251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65077252;
 //BA.debugLineNum = 65077252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setdisabled(b4j.example.vmavatar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=65142784;
 //BA.debugLineNum = 65142784;BA.debugLine="Sub SetDisabled(b As Boolean) As VMAvatar";
RDebugUtils.currentLine=65142785;
 //BA.debugLineNum = 65142785;BA.debugLine="Avatar.SetDisabled(b)";
__ref._avatar /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=65142786;
 //BA.debugLineNum = 65142786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65142787;
 //BA.debugLineNum = 65142787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setelevation(b4j.example.vmavatar __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=65667072;
 //BA.debugLineNum = 65667072;BA.debugLine="Sub SetElevation(e As Int) As VMAvatar";
RDebugUtils.currentLine=65667073;
 //BA.debugLineNum = 65667073;BA.debugLine="Avatar.SetElevation(e)";
__ref._avatar /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=65667074;
 //BA.debugLineNum = 65667074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65667075;
 //BA.debugLineNum = 65667075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _seticon(b4j.example.vmavatar __ref,String _icn) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "seticon", new Object[] {_icn}));}
b4j.example.vmicon _icon = null;
RDebugUtils.currentLine=65929216;
 //BA.debugLineNum = 65929216;BA.debugLine="Sub SetIcon(icn As String) As VMAvatar";
RDebugUtils.currentLine=65929217;
 //BA.debugLineNum = 65929217;BA.debugLine="If icn = \"\" Then Return Me";
if ((_icn).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
RDebugUtils.currentLine=65929218;
 //BA.debugLineNum = 65929218;BA.debugLine="SetAvatarIcon(True)";
__ref._setavataricon /*b4j.example.vmavatar*/ (null,__c.True);
RDebugUtils.currentLine=65929219;
 //BA.debugLineNum = 65929219;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
RDebugUtils.currentLine=65929220;
 //BA.debugLineNum = 65929220;BA.debugLine="icon.Initialize(vue,$\"${ID}icn\"$).SetText(icn)";
_icon._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icn"))._settext /*b4j.example.vmicon*/ (null,_icn);
RDebugUtils.currentLine=65929221;
 //BA.debugLineNum = 65929221;BA.debugLine="icon.pop(Avatar)";
_icon._pop /*String*/ (null,__ref._avatar /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=65929222;
 //BA.debugLineNum = 65929222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65929223;
 //BA.debugLineNum = 65929223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setid(b4j.example.vmavatar __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setid", new Object[] {_sid}));}
RDebugUtils.currentLine=65601536;
 //BA.debugLineNum = 65601536;BA.debugLine="Sub SetID(sid As String) As VMAvatar";
RDebugUtils.currentLine=65601537;
 //BA.debugLineNum = 65601537;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=65601538;
 //BA.debugLineNum = 65601538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65601539;
 //BA.debugLineNum = 65601539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setlarge(b4j.example.vmavatar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setlarge", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setlarge", new Object[] {_b}));}
RDebugUtils.currentLine=66060288;
 //BA.debugLineNum = 66060288;BA.debugLine="Sub SetLarge(b As Boolean) As VMAvatar";
RDebugUtils.currentLine=66060289;
 //BA.debugLineNum = 66060289;BA.debugLine="If b Then Avatar.AddClass(\"md-large\")";
if (_b) { 
__ref._avatar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-large");};
RDebugUtils.currentLine=66060290;
 //BA.debugLineNum = 66060290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=66060291;
 //BA.debugLineNum = 66060291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setmenutrigger(b4j.example.vmavatar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setmenutrigger", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setmenutrigger", new Object[] {_b}));}
RDebugUtils.currentLine=65273856;
 //BA.debugLineNum = 65273856;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMAvatar";
RDebugUtils.currentLine=65273857;
 //BA.debugLineNum = 65273857;BA.debugLine="Avatar.SetAttr(CreateMap(\":md-menu-trigger\": b))";
__ref._avatar /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-menu-trigger"),(Object)(_b)}));
RDebugUtils.currentLine=65273858;
 //BA.debugLineNum = 65273858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65273859;
 //BA.debugLineNum = 65273859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setprimary(b4j.example.vmavatar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=65470464;
 //BA.debugLineNum = 65470464;BA.debugLine="Sub SetPrimary(b As Boolean) As VMAvatar";
RDebugUtils.currentLine=65470465;
 //BA.debugLineNum = 65470465;BA.debugLine="If b Then Avatar.AddClass(\"md-primary\")";
if (_b) { 
__ref._avatar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-primary");};
RDebugUtils.currentLine=65470466;
 //BA.debugLineNum = 65470466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65470467;
 //BA.debugLineNum = 65470467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setsmall(b4j.example.vmavatar __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setsmall", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setsmall", new Object[] {_b}));}
RDebugUtils.currentLine=65863680;
 //BA.debugLineNum = 65863680;BA.debugLine="Sub SetSmall(b As Boolean) As VMAvatar";
RDebugUtils.currentLine=65863681;
 //BA.debugLineNum = 65863681;BA.debugLine="If b Then Avatar.AddClass(\"md-small\")";
if (_b) { 
__ref._avatar /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-small");};
RDebugUtils.currentLine=65863682;
 //BA.debugLineNum = 65863682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65863683;
 //BA.debugLineNum = 65863683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settext(b4j.example.vmavatar __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=65339392;
 //BA.debugLineNum = 65339392;BA.debugLine="Sub SetText(t As String) As VMAvatar";
RDebugUtils.currentLine=65339393;
 //BA.debugLineNum = 65339393;BA.debugLine="Avatar.SetText(t)";
__ref._avatar /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=65339394;
 //BA.debugLineNum = 65339394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65339395;
 //BA.debugLineNum = 65339395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settextripple(b4j.example.vmavatar __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "settextripple", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "settextripple", new Object[] {_t}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=65404928;
 //BA.debugLineNum = 65404928;BA.debugLine="Sub SetTextRipple(t As String) As VMAvatar";
RDebugUtils.currentLine=65404929;
 //BA.debugLineNum = 65404929;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=65404930;
 //BA.debugLineNum = 65404930;BA.debugLine="el.Initialize(vue,$\"${ID}txt\"$).SetTag(\"md-ripple";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"txt"))._settag /*b4j.example.vmelement*/ (null,"md-ripple")._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=65404931;
 //BA.debugLineNum = 65404931;BA.debugLine="el.Pop(Avatar)";
_el._pop /*String*/ (null,__ref._avatar /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=65404932;
 //BA.debugLineNum = 65404932;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65404933;
 //BA.debugLineNum = 65404933;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _settooltip(b4j.example.vmavatar __ref,String _tt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "settooltip", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "settooltip", new Object[] {_tt}));}
b4j.example.vmtooltip _el = null;
RDebugUtils.currentLine=65732608;
 //BA.debugLineNum = 65732608;BA.debugLine="Sub SetToolTip(tt As String) As VMAvatar";
RDebugUtils.currentLine=65732609;
 //BA.debugLineNum = 65732609;BA.debugLine="If tt = \"\" Then Return Me";
if ((_tt).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
RDebugUtils.currentLine=65732610;
 //BA.debugLineNum = 65732610;BA.debugLine="Dim el As VMTooltip";
_el = new b4j.example.vmtooltip();
RDebugUtils.currentLine=65732611;
 //BA.debugLineNum = 65732611;BA.debugLine="el.Initialize(vue,$\"${ID}tlt\"$).SetText(tt)";
_el._initialize /*b4j.example.vmtooltip*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"tlt"))._settext /*b4j.example.vmtooltip*/ (null,(Object)(_tt));
RDebugUtils.currentLine=65732612;
 //BA.debugLineNum = 65732612;BA.debugLine="el.Pop(Avatar)";
_el._pop /*String*/ (null,__ref._avatar /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=65732613;
 //BA.debugLineNum = 65732613;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65732614;
 //BA.debugLineNum = 65732614;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setvalue(b4j.example.vmavatar __ref,String _imgurl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setvalue", new Object[] {_imgurl}));}
String _lkey = "";
RDebugUtils.currentLine=66256896;
 //BA.debugLineNum = 66256896;BA.debugLine="Sub SetValue(imgURL As String) As VMAvatar";
RDebugUtils.currentLine=66256897;
 //BA.debugLineNum = 66256897;BA.debugLine="If ID = \"\" Then";
if ((__ref._id /*String*/ ).equals("")) { 
RDebugUtils.currentLine=66256898;
 //BA.debugLineNum = 66256898;BA.debugLine="Log(\"VMAvatar.SetValue: You need to set the ID o";
__c.Log("VMAvatar.SetValue: You need to set the ID of the image.");
 };
RDebugUtils.currentLine=66256900;
 //BA.debugLineNum = 66256900;BA.debugLine="Dim lkey As String = $\"${ID}url\"$";
_lkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"url");
RDebugUtils.currentLine=66256901;
 //BA.debugLineNum = 66256901;BA.debugLine="img.SetSRC(lkey,True)";
__ref._img /*b4j.example.vmelement*/ ._setsrc /*b4j.example.vmelement*/ (null,_lkey,__c.True);
RDebugUtils.currentLine=66256902;
 //BA.debugLineNum = 66256902;BA.debugLine="vue.SetStateSingle(lkey, imgURL)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_lkey,(Object)(_imgurl));
RDebugUtils.currentLine=66256903;
 //BA.debugLineNum = 66256903;BA.debugLine="hasImage = True";
__ref._hasimage /*boolean*/  = __c.True;
RDebugUtils.currentLine=66256904;
 //BA.debugLineNum = 66256904;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=66256905;
 //BA.debugLineNum = 66256905;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _setvshow(b4j.example.vmavatar __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmavatar";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=65208320;
 //BA.debugLineNum = 65208320;BA.debugLine="Sub SetVShow(vif As String) As VMAvatar";
RDebugUtils.currentLine=65208321;
 //BA.debugLineNum = 65208321;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmavatar)(this);};
RDebugUtils.currentLine=65208322;
 //BA.debugLineNum = 65208322;BA.debugLine="Avatar.SetVShow(vif)";
__ref._avatar /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=65208323;
 //BA.debugLineNum = 65208323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmavatar)(this);
RDebugUtils.currentLine=65208324;
 //BA.debugLineNum = 65208324;BA.debugLine="End Sub";
return null;
}
}