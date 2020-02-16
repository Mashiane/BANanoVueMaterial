package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbottombaritem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmbottombaritem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbottombaritem.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _bottombaritem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmbottombaritem  _initialize(b4j.example.vmbottombaritem __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=70057984;
 //BA.debugLineNum = 70057984;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=70057985;
 //BA.debugLineNum = 70057985;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=70057986;
 //BA.debugLineNum = 70057986;BA.debugLine="BottomBarItem.Initialize(v, ID)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=70057987;
 //BA.debugLineNum = 70057987;BA.debugLine="BottomBarItem.SetTag(\"md-bottom-bar-item\")";
__ref._bottombaritem /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-bottom-bar-item");
RDebugUtils.currentLine=70057988;
 //BA.debugLineNum = 70057988;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=70057989;
 //BA.debugLineNum = 70057989;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=70057990;
 //BA.debugLineNum = 70057990;BA.debugLine="BottomBarItem.SetOnClick(module, $\"${ID}_click\"$)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=70057991;
 //BA.debugLineNum = 70057991;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70057992;
 //BA.debugLineNum = 70057992;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setlabel(b4j.example.vmbottombaritem __ref,String _varlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setlabel", new Object[] {_varlabel}));}
String _pp = "";
RDebugUtils.currentLine=71434240;
 //BA.debugLineNum = 71434240;BA.debugLine="Sub SetLabel(varLabel As String) As VMBottomBarIte";
RDebugUtils.currentLine=71434241;
 //BA.debugLineNum = 71434241;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label");
RDebugUtils.currentLine=71434242;
 //BA.debugLineNum = 71434242;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_varlabel));
RDebugUtils.currentLine=71434243;
 //BA.debugLineNum = 71434243;BA.debugLine="SetAttr(CreateMap(\":md-label\": pp))";
__ref._setattr /*b4j.example.vmbottombaritem*/ (null,__c.createMap(new Object[] {(Object)(":md-label"),(Object)(_pp)}));
RDebugUtils.currentLine=71434244;
 //BA.debugLineNum = 71434244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=71434245;
 //BA.debugLineNum = 71434245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _seticon(b4j.example.vmbottombaritem __ref,Object _varicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "seticon", new Object[] {_varicon}));}
String _pp = "";
RDebugUtils.currentLine=71499776;
 //BA.debugLineNum = 71499776;BA.debugLine="Sub SetIcon(varIcon As Object) As VMBottomBarItem";
RDebugUtils.currentLine=71499777;
 //BA.debugLineNum = 71499777;BA.debugLine="Dim pp As String = $\"${ID}icon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon");
RDebugUtils.currentLine=71499778;
 //BA.debugLineNum = 71499778;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,_varicon);
RDebugUtils.currentLine=71499779;
 //BA.debugLineNum = 71499779;BA.debugLine="SetAttr(CreateMap(\":md-icon\": pp))";
__ref._setattr /*b4j.example.vmbottombaritem*/ (null,__c.createMap(new Object[] {(Object)(":md-icon"),(Object)(_pp)}));
RDebugUtils.currentLine=71499780;
 //BA.debugLineNum = 71499780;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=71499781;
 //BA.debugLineNum = 71499781;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _seticon1(b4j.example.vmbottombaritem __ref,String _icn) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "seticon1", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "seticon1", new Object[] {_icn}));}
b4j.example.vmicon _icon = null;
RDebugUtils.currentLine=70254592;
 //BA.debugLineNum = 70254592;BA.debugLine="Sub SetIcon1(icn As String) As VMBottomBarItem";
RDebugUtils.currentLine=70254593;
 //BA.debugLineNum = 70254593;BA.debugLine="If icn = \"\" Then Return Me";
if ((_icn).equals("")) { 
if (true) return (b4j.example.vmbottombaritem)(this);};
RDebugUtils.currentLine=70254594;
 //BA.debugLineNum = 70254594;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
RDebugUtils.currentLine=70254595;
 //BA.debugLineNum = 70254595;BA.debugLine="icon.Initialize(vue, $\"${ID}icon\"$).SetBottomBarI";
_icon._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon"))._setbottombaricon /*b4j.example.vmicon*/ (null,__c.True)._settext /*b4j.example.vmicon*/ (null,_icn);
RDebugUtils.currentLine=70254596;
 //BA.debugLineNum = 70254596;BA.debugLine="icon.Pop(BottomBarItem)";
_icon._pop /*String*/ (null,__ref._bottombaritem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=70254597;
 //BA.debugLineNum = 70254597;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70254598;
 //BA.debugLineNum = 70254598;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setlabel1(b4j.example.vmbottombaritem __ref,String _label) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setlabel1", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setlabel1", new Object[] {_label}));}
String _pp = "";
b4j.example.vmelement _span = null;
RDebugUtils.currentLine=70320128;
 //BA.debugLineNum = 70320128;BA.debugLine="Sub SetLabel1(label As String) As VMBottomBarItem";
RDebugUtils.currentLine=70320129;
 //BA.debugLineNum = 70320129;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label");
RDebugUtils.currentLine=70320130;
 //BA.debugLineNum = 70320130;BA.debugLine="vue.SetStateSingle(pp, label)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_label));
RDebugUtils.currentLine=70320131;
 //BA.debugLineNum = 70320131;BA.debugLine="Dim span As VMElement";
_span = new b4j.example.vmelement();
RDebugUtils.currentLine=70320132;
 //BA.debugLineNum = 70320132;BA.debugLine="span.Initialize(vue, $\"${ID}label\"$).SetTag(\"span";
_span._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label"))._settag /*b4j.example.vmelement*/ (null,"span")._addclass /*b4j.example.vmelement*/ (null,"md-bottom-bar-label")._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(_pp))+" }}"));
RDebugUtils.currentLine=70320133;
 //BA.debugLineNum = 70320133;BA.debugLine="span.Pop(BottomBarItem)";
_span._pop /*String*/ (null,__ref._bottombaritem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=70320134;
 //BA.debugLineNum = 70320134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70320135;
 //BA.debugLineNum = 70320135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setbadge(b4j.example.vmbottombaritem __ref,String _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setbadge", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setbadge", new Object[] {_badge}));}
String _badgecontent = "";
b4j.example.vmelement _i = null;
RDebugUtils.currentLine=70385664;
 //BA.debugLineNum = 70385664;BA.debugLine="Sub SetBadge(badge As String) As VMBottomBarItem";
RDebugUtils.currentLine=70385665;
 //BA.debugLineNum = 70385665;BA.debugLine="Dim badgeContent As String = $\"${ID}badgevalue\"$";
_badgecontent = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"badgevalue");
RDebugUtils.currentLine=70385666;
 //BA.debugLineNum = 70385666;BA.debugLine="vue.SetStateSingle(badgeContent, badge)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_badgecontent,(Object)(_badge));
RDebugUtils.currentLine=70385667;
 //BA.debugLineNum = 70385667;BA.debugLine="Dim i As VMElement";
_i = new b4j.example.vmelement();
RDebugUtils.currentLine=70385668;
 //BA.debugLineNum = 70385668;BA.debugLine="i.Initialize(vue,$\"${ID}badge\"$).SetTag(\"i\").AddC";
_i._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"badge"))._settag /*b4j.example.vmelement*/ (null,"i")._addclass /*b4j.example.vmelement*/ (null,"bottomitembadge")._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(_badgecontent))+" }}"));
RDebugUtils.currentLine=70385669;
 //BA.debugLineNum = 70385669;BA.debugLine="i.Pop(BottomBarItem)";
_i._pop /*String*/ (null,__ref._bottombaritem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=70385670;
 //BA.debugLineNum = 70385670;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70385671;
 //BA.debugLineNum = 70385671;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmbottombaritem __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=70975488;
 //BA.debugLineNum = 70975488;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=70975489;
 //BA.debugLineNum = 70975489;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=70975490;
 //BA.debugLineNum = 70975490;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombaritem  _addchild(b4j.example.vmbottombaritem __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=70778880;
 //BA.debugLineNum = 70778880;BA.debugLine="Sub AddChild(child As VMElement) As VMBottomBarIte";
RDebugUtils.currentLine=70778881;
 //BA.debugLineNum = 70778881;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=70778882;
 //BA.debugLineNum = 70778882;BA.debugLine="BottomBarItem.SetText(childHTML)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=70778883;
 //BA.debugLineNum = 70778883;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70778884;
 //BA.debugLineNum = 70778884;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmbottombaritem __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=71237632;
 //BA.debugLineNum = 71237632;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=71237633;
 //BA.debugLineNum = 71237633;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=71237634;
 //BA.debugLineNum = 71237634;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmbottombaritem*/ (null,_childx);
 }
};
RDebugUtils.currentLine=71237636;
 //BA.debugLineNum = 71237636;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombaritem  _addclass(b4j.example.vmbottombaritem __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=71041024;
 //BA.debugLineNum = 71041024;BA.debugLine="Sub AddClass(c As String) As VMBottomBarItem";
RDebugUtils.currentLine=71041025;
 //BA.debugLineNum = 71041025;BA.debugLine="BottomBarItem.AddClass(c)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=71041026;
 //BA.debugLineNum = 71041026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=71041027;
 //BA.debugLineNum = 71041027;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmbottombaritem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=69992449;
 //BA.debugLineNum = 69992449;BA.debugLine="Public BottomBarItem As VMElement";
_bottombaritem = new b4j.example.vmelement();
RDebugUtils.currentLine=69992450;
 //BA.debugLineNum = 69992450;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=69992451;
 //BA.debugLineNum = 69992451;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=69992452;
 //BA.debugLineNum = 69992452;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=69992453;
 //BA.debugLineNum = 69992453;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=69992454;
 //BA.debugLineNum = 69992454;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmbottombaritem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=70516736;
 //BA.debugLineNum = 70516736;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=70516737;
 //BA.debugLineNum = 70516737;BA.debugLine="Return BottomBarItem.ToString";
if (true) return __ref._bottombaritem /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=70516738;
 //BA.debugLineNum = 70516738;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmbottombaritem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=70713344;
 //BA.debugLineNum = 70713344;BA.debugLine="Sub Render";
RDebugUtils.currentLine=70713345;
 //BA.debugLineNum = 70713345;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=70713346;
 //BA.debugLineNum = 70713346;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbottombaritem  _setaccent(b4j.example.vmbottombaritem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=70909952;
 //BA.debugLineNum = 70909952;BA.debugLine="Sub SetAccent(b As Boolean) As VMBottomBarItem";
RDebugUtils.currentLine=70909953;
 //BA.debugLineNum = 70909953;BA.debugLine="BottomBarItem.SetAccent(True)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=70909954;
 //BA.debugLineNum = 70909954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70909955;
 //BA.debugLineNum = 70909955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setattr(b4j.example.vmbottombaritem __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=71106560;
 //BA.debugLineNum = 71106560;BA.debugLine="Sub SetAttr(attr As Map) As VMBottomBarItem";
RDebugUtils.currentLine=71106561;
 //BA.debugLineNum = 71106561;BA.debugLine="BottomBarItem.SetAttr(attr)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=71106562;
 //BA.debugLineNum = 71106562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=71106563;
 //BA.debugLineNum = 71106563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setdisabled(b4j.example.vmbottombaritem __ref,boolean _vardisabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setdisabled", new Object[] {_vardisabled}));}
RDebugUtils.currentLine=71565312;
 //BA.debugLineNum = 71565312;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMBotto";
RDebugUtils.currentLine=71565313;
 //BA.debugLineNum = 71565313;BA.debugLine="BottomBarItem.SetDisabled(varDisabled)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_vardisabled);
RDebugUtils.currentLine=71565314;
 //BA.debugLineNum = 71565314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=71565315;
 //BA.debugLineNum = 71565315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setexact(b4j.example.vmbottombaritem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setexact", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setexact", new Object[] {_b}));}
RDebugUtils.currentLine=70123520;
 //BA.debugLineNum = 70123520;BA.debugLine="Sub SetExact(b As Boolean) As VMBottomBarItem";
RDebugUtils.currentLine=70123521;
 //BA.debugLineNum = 70123521;BA.debugLine="BottomBarItem.SetExact(b)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setexact /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=70123522;
 //BA.debugLineNum = 70123522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70123523;
 //BA.debugLineNum = 70123523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setid(b4j.example.vmbottombaritem __ref,Object _varid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setid", new Object[] {_varid}));}
RDebugUtils.currentLine=71368704;
 //BA.debugLineNum = 71368704;BA.debugLine="Sub SetId(varId As Object) As VMBottomBarItem";
RDebugUtils.currentLine=71368705;
 //BA.debugLineNum = 71368705;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
__ref._setattr /*b4j.example.vmbottombaritem*/ (null,__c.createMap(new Object[] {(Object)("id"),_varid}));
RDebugUtils.currentLine=71368706;
 //BA.debugLineNum = 71368706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=71368707;
 //BA.debugLineNum = 71368707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setpadding(b4j.example.vmbottombaritem __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=71303168;
 //BA.debugLineNum = 71303168;BA.debugLine="Sub SetPadding(p As Object) As VMBottomBarItem";
RDebugUtils.currentLine=71303169;
 //BA.debugLineNum = 71303169;BA.debugLine="BottomBarItem.SetPaddingAll(p)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=71303170;
 //BA.debugLineNum = 71303170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=71303171;
 //BA.debugLineNum = 71303171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setprimary(b4j.example.vmbottombaritem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=70844416;
 //BA.debugLineNum = 70844416;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBottomBarItem";
RDebugUtils.currentLine=70844417;
 //BA.debugLineNum = 70844417;BA.debugLine="BottomBarItem.SetPrimary(True)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=70844418;
 //BA.debugLineNum = 70844418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70844419;
 //BA.debugLineNum = 70844419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setstyle(b4j.example.vmbottombaritem __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=71172096;
 //BA.debugLineNum = 71172096;BA.debugLine="Sub SetStyle(sm As Map) As VMBottomBarItem";
RDebugUtils.currentLine=71172097;
 //BA.debugLineNum = 71172097;BA.debugLine="BottomBarItem.SetStyle(sm)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=71172098;
 //BA.debugLineNum = 71172098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=71172099;
 //BA.debugLineNum = 71172099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setsvg(b4j.example.vmbottombaritem __ref,String _src) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setsvg", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setsvg", new Object[] {_src}));}
b4j.example.vmicon _icon = null;
RDebugUtils.currentLine=70189056;
 //BA.debugLineNum = 70189056;BA.debugLine="Sub SetSVG(src As String) As VMBottomBarItem";
RDebugUtils.currentLine=70189057;
 //BA.debugLineNum = 70189057;BA.debugLine="Dim icon As VMIcon";
_icon = new b4j.example.vmicon();
RDebugUtils.currentLine=70189058;
 //BA.debugLineNum = 70189058;BA.debugLine="icon.Initialize(vue, $\"${ID}svg\"$).SetBottomBarIc";
_icon._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"svg"))._setbottombaricon /*b4j.example.vmicon*/ (null,__c.True)._setsrc /*b4j.example.vmicon*/ (null,_src);
RDebugUtils.currentLine=70189059;
 //BA.debugLineNum = 70189059;BA.debugLine="icon.Pop(BottomBarItem)";
_icon._pop /*String*/ (null,__ref._bottombaritem /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=70189060;
 //BA.debugLineNum = 70189060;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70189061;
 //BA.debugLineNum = 70189061;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setto(b4j.example.vmbottombaritem __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setto", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setto", new Object[] {_t}));}
RDebugUtils.currentLine=70451200;
 //BA.debugLineNum = 70451200;BA.debugLine="Sub SetTo(t As String) As VMBottomBarItem";
RDebugUtils.currentLine=70451201;
 //BA.debugLineNum = 70451201;BA.debugLine="BottomBarItem.SetTo(t)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setto /*b4j.example.vmelement*/ (null,(Object)(_t));
RDebugUtils.currentLine=70451202;
 //BA.debugLineNum = 70451202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70451203;
 //BA.debugLineNum = 70451203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setvif(b4j.example.vmbottombaritem __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=70582272;
 //BA.debugLineNum = 70582272;BA.debugLine="Sub SetVIf(vif As Object) As VMBottomBarItem";
RDebugUtils.currentLine=70582273;
 //BA.debugLineNum = 70582273;BA.debugLine="BottomBarItem.SetVIf(vif)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=70582274;
 //BA.debugLineNum = 70582274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70582275;
 //BA.debugLineNum = 70582275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _setvshow(b4j.example.vmbottombaritem __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbottombaritem";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=70647808;
 //BA.debugLineNum = 70647808;BA.debugLine="Sub SetVShow(vif As Object) As VMBottomBarItem";
RDebugUtils.currentLine=70647809;
 //BA.debugLineNum = 70647809;BA.debugLine="BottomBarItem.SetVShow(vif)";
__ref._bottombaritem /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=70647810;
 //BA.debugLineNum = 70647810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbottombaritem)(this);
RDebugUtils.currentLine=70647811;
 //BA.debugLineNum = 70647811;BA.debugLine="End Sub";
return null;
}
}