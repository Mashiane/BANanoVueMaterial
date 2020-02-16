package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbadge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmbadge", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbadge.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _badge = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _badvalue = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmbadge  _initialize(b4j.example.vmbadge __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=66650112;
 //BA.debugLineNum = 66650112;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=66650113;
 //BA.debugLineNum = 66650113;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=66650114;
 //BA.debugLineNum = 66650114;BA.debugLine="Badge.Initialize(v, ID)";
__ref._badge /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=66650115;
 //BA.debugLineNum = 66650115;BA.debugLine="Badge.SetTag(\"md-badge\")";
__ref._badge /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-badge");
RDebugUtils.currentLine=66650116;
 //BA.debugLineNum = 66650116;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=66650117;
 //BA.debugLineNum = 66650117;BA.debugLine="badValue = $\"${ID}value\"$";
__ref._badvalue /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"value");
RDebugUtils.currentLine=66650118;
 //BA.debugLineNum = 66650118;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=66650119;
 //BA.debugLineNum = 66650119;BA.debugLine="vue.SetStateSingle(badValue,\"0\")";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._badvalue /*String*/ ,(Object)("0"));
RDebugUtils.currentLine=66650120;
 //BA.debugLineNum = 66650120;BA.debugLine="SetAttr(CreateMap(\"v-bind:md-content\": badValue))";
__ref._setattr /*b4j.example.vmbadge*/ (null,__c.createMap(new Object[] {(Object)("v-bind:md-content"),(Object)(__ref._badvalue /*String*/ )}));
 };
RDebugUtils.currentLine=66650122;
 //BA.debugLineNum = 66650122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=66650123;
 //BA.debugLineNum = 66650123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setaccent(b4j.example.vmbadge __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=67108864;
 //BA.debugLineNum = 67108864;BA.debugLine="Sub SetAccent(b As Boolean) As VMBadge";
RDebugUtils.currentLine=67108865;
 //BA.debugLineNum = 67108865;BA.debugLine="If b Then Badge.SetAccent(True)";
if (_b) { 
__ref._badge /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);};
RDebugUtils.currentLine=67108866;
 //BA.debugLineNum = 67108866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67108867;
 //BA.debugLineNum = 67108867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setcontent(b4j.example.vmbadge __ref,int _varcontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setcontent", new Object[] {_varcontent}));}
RDebugUtils.currentLine=67829760;
 //BA.debugLineNum = 67829760;BA.debugLine="Sub SetContent(varContent As Int) As VMBadge";
RDebugUtils.currentLine=67829761;
 //BA.debugLineNum = 67829761;BA.debugLine="vue.SetStateSingle(badValue,varContent)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._badvalue /*String*/ ,(Object)(_varcontent));
RDebugUtils.currentLine=67829762;
 //BA.debugLineNum = 67829762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67829763;
 //BA.debugLineNum = 67829763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdense(b4j.example.vmbadge __ref,boolean _vardense) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setdense", new Object[] {_vardense}));}
RDebugUtils.currentLine=68091904;
 //BA.debugLineNum = 68091904;BA.debugLine="Sub SetDense(varDense As Boolean) As VMBadge";
RDebugUtils.currentLine=68091905;
 //BA.debugLineNum = 68091905;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
if (_vardense) { 
__ref._setattr /*b4j.example.vmbadge*/ (null,__c.createMap(new Object[] {(Object)(":md-dense"),(Object)(_vardense)}));};
RDebugUtils.currentLine=68091906;
 //BA.debugLineNum = 68091906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=68091907;
 //BA.debugLineNum = 68091907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setpositionbottom(b4j.example.vmbadge __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setpositionbottom", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setpositionbottom", new Object[] {_b}));}
RDebugUtils.currentLine=68026368;
 //BA.debugLineNum = 68026368;BA.debugLine="Sub SetPositionBottom(b As Boolean) As VMBadge";
RDebugUtils.currentLine=68026369;
 //BA.debugLineNum = 68026369;BA.debugLine="SetAttr(CreateMap(\"md-position\": \"bottom\"))";
__ref._setattr /*b4j.example.vmbadge*/ (null,__c.createMap(new Object[] {(Object)("md-position"),(Object)("bottom")}));
RDebugUtils.currentLine=68026370;
 //BA.debugLineNum = 68026370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=68026371;
 //BA.debugLineNum = 68026371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setpositiontop(b4j.example.vmbadge __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setpositiontop", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setpositiontop", new Object[] {_b}));}
RDebugUtils.currentLine=67960832;
 //BA.debugLineNum = 67960832;BA.debugLine="Sub SetPositionTop(b As Boolean) As VMBadge    'ig";
RDebugUtils.currentLine=67960833;
 //BA.debugLineNum = 67960833;BA.debugLine="SetAttr(CreateMap(\"md-position\": \"top\"))";
__ref._setattr /*b4j.example.vmbadge*/ (null,__c.createMap(new Object[] {(Object)("md-position"),(Object)("top")}));
RDebugUtils.currentLine=67960834;
 //BA.debugLineNum = 67960834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67960835;
 //BA.debugLineNum = 67960835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setprimary(b4j.example.vmbadge __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=67043328;
 //BA.debugLineNum = 67043328;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBadge";
RDebugUtils.currentLine=67043329;
 //BA.debugLineNum = 67043329;BA.debugLine="If b Then Badge.SetPrimary(True)";
if (_b) { 
__ref._badge /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);};
RDebugUtils.currentLine=67043330;
 //BA.debugLineNum = 67043330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67043331;
 //BA.debugLineNum = 67043331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setsquare(b4j.example.vmbadge __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setsquare", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setsquare", new Object[] {_b}));}
RDebugUtils.currentLine=68157440;
 //BA.debugLineNum = 68157440;BA.debugLine="Sub SetSquare(b As Boolean) As VMBadge    'ignore";
RDebugUtils.currentLine=68157441;
 //BA.debugLineNum = 68157441;BA.debugLine="If b = True Then AddClass(\"md-square\")";
if (_b==__c.True) { 
__ref._addclass /*b4j.example.vmbadge*/ (null,"md-square");};
RDebugUtils.currentLine=68157442;
 //BA.debugLineNum = 68157442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=68157443;
 //BA.debugLineNum = 68157443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _settext(b4j.example.vmbadge __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=67305472;
 //BA.debugLineNum = 67305472;BA.debugLine="Sub SetText(t As Object) As VMBadge";
RDebugUtils.currentLine=67305473;
 //BA.debugLineNum = 67305473;BA.debugLine="Badge.SetText(t)";
__ref._badge /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=67305474;
 //BA.debugLineNum = 67305474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67305475;
 //BA.debugLineNum = 67305475;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmbadge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=66977792;
 //BA.debugLineNum = 66977792;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=66977793;
 //BA.debugLineNum = 66977793;BA.debugLine="Return Badge.ToString";
if (true) return __ref._badge /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=66977794;
 //BA.debugLineNum = 66977794;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _addchild(b4j.example.vmbadge __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=67633152;
 //BA.debugLineNum = 67633152;BA.debugLine="Sub AddChild(child As VMElement) As VMBadge";
RDebugUtils.currentLine=67633153;
 //BA.debugLineNum = 67633153;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=67633154;
 //BA.debugLineNum = 67633154;BA.debugLine="Badge.SetText(childHTML)";
__ref._badge /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=67633155;
 //BA.debugLineNum = 67633155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67633156;
 //BA.debugLineNum = 67633156;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmbadge __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=67698688;
 //BA.debugLineNum = 67698688;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=67698689;
 //BA.debugLineNum = 67698689;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=67698690;
 //BA.debugLineNum = 67698690;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmbadge*/ (null,_childx);
 }
};
RDebugUtils.currentLine=67698692;
 //BA.debugLineNum = 67698692;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _addclass(b4j.example.vmbadge __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=67436544;
 //BA.debugLineNum = 67436544;BA.debugLine="Sub AddClass(c As String) As VMBadge";
RDebugUtils.currentLine=67436545;
 //BA.debugLineNum = 67436545;BA.debugLine="Badge.AddClass(c)";
__ref._badge /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=67436546;
 //BA.debugLineNum = 67436546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67436547;
 //BA.debugLineNum = 67436547;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmbadge __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=68222976;
 //BA.debugLineNum = 68222976;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=68222977;
 //BA.debugLineNum = 68222977;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=68222978;
 //BA.debugLineNum = 68222978;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmbadge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
RDebugUtils.currentLine=66584576;
 //BA.debugLineNum = 66584576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=66584577;
 //BA.debugLineNum = 66584577;BA.debugLine="Public Badge As VMElement";
_badge = new b4j.example.vmelement();
RDebugUtils.currentLine=66584578;
 //BA.debugLineNum = 66584578;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=66584579;
 //BA.debugLineNum = 66584579;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=66584580;
 //BA.debugLineNum = 66584580;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=66584581;
 //BA.debugLineNum = 66584581;BA.debugLine="Private badValue As String";
_badvalue = "";
RDebugUtils.currentLine=66584582;
 //BA.debugLineNum = 66584582;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _setattr(b4j.example.vmbadge __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=67502080;
 //BA.debugLineNum = 67502080;BA.debugLine="Sub SetAttr(attr As Map) As VMBadge";
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="Badge.SetAttr(attr)";
__ref._badge /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=67502082;
 //BA.debugLineNum = 67502082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67502083;
 //BA.debugLineNum = 67502083;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmbadge __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=67371008;
 //BA.debugLineNum = 67371008;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=67371009;
 //BA.debugLineNum = 67371009;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=67371010;
 //BA.debugLineNum = 67371010;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmbadge __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=67239936;
 //BA.debugLineNum = 67239936;BA.debugLine="Sub Render";
RDebugUtils.currentLine=67239937;
 //BA.debugLineNum = 67239937;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=67239938;
 //BA.debugLineNum = 67239938;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbadge  _setavatar(b4j.example.vmbadge __ref,b4j.example.vmavatar _avtr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setavatar", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setavatar", new Object[] {_avtr}));}
RDebugUtils.currentLine=66912256;
 //BA.debugLineNum = 66912256;BA.debugLine="Sub SetAvatar(avtr As VMAvatar) As VMBadge";
RDebugUtils.currentLine=66912257;
 //BA.debugLineNum = 66912257;BA.debugLine="avtr.Pop(Badge)";
_avtr._pop /*String*/ (null,__ref._badge /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=66912258;
 //BA.debugLineNum = 66912258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=66912259;
 //BA.debugLineNum = 66912259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setbutton(b4j.example.vmbadge __ref,b4j.example.vmbutton _btn) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setbutton", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setbutton", new Object[] {_btn}));}
RDebugUtils.currentLine=66846720;
 //BA.debugLineNum = 66846720;BA.debugLine="Sub SetButton(btn As VMButton) As VMBadge";
RDebugUtils.currentLine=66846721;
 //BA.debugLineNum = 66846721;BA.debugLine="btn.Pop(Badge)";
_btn._pop /*String*/ (null,__ref._badge /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=66846722;
 //BA.debugLineNum = 66846722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=66846723;
 //BA.debugLineNum = 66846723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setdisabled(b4j.example.vmbadge __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=66715648;
 //BA.debugLineNum = 66715648;BA.debugLine="Sub SetDisabled(b As Boolean) As VMBadge";
RDebugUtils.currentLine=66715649;
 //BA.debugLineNum = 66715649;BA.debugLine="Badge.SetDisabled(b)";
__ref._badge /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=66715650;
 //BA.debugLineNum = 66715650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=66715651;
 //BA.debugLineNum = 66715651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setpadding(b4j.example.vmbadge __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=67764224;
 //BA.debugLineNum = 67764224;BA.debugLine="Sub SetPadding(p As Object) As VMBadge";
RDebugUtils.currentLine=67764225;
 //BA.debugLineNum = 67764225;BA.debugLine="Badge.SetPaddingAll(p)";
__ref._badge /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=67764226;
 //BA.debugLineNum = 67764226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67764227;
 //BA.debugLineNum = 67764227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setposition(b4j.example.vmbadge __ref,Object _varposition) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setposition", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setposition", new Object[] {_varposition}));}
RDebugUtils.currentLine=67895296;
 //BA.debugLineNum = 67895296;BA.debugLine="Sub SetPosition(varPosition As Object) As VMBadge";
RDebugUtils.currentLine=67895297;
 //BA.debugLineNum = 67895297;BA.debugLine="SetAttr(CreateMap(\"md-position\": varPosition))";
__ref._setattr /*b4j.example.vmbadge*/ (null,__c.createMap(new Object[] {(Object)("md-position"),_varposition}));
RDebugUtils.currentLine=67895298;
 //BA.debugLineNum = 67895298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67895299;
 //BA.debugLineNum = 67895299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setstyle(b4j.example.vmbadge __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=67567616;
 //BA.debugLineNum = 67567616;BA.debugLine="Sub SetStyle(sm As Map) As VMBadge";
RDebugUtils.currentLine=67567617;
 //BA.debugLineNum = 67567617;BA.debugLine="Badge.SetStyle(sm)";
__ref._badge /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=67567618;
 //BA.debugLineNum = 67567618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67567619;
 //BA.debugLineNum = 67567619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setvmodel(b4j.example.vmbadge __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=67174400;
 //BA.debugLineNum = 67174400;BA.debugLine="Sub SetVModel(k As String) As VMBadge";
RDebugUtils.currentLine=67174401;
 //BA.debugLineNum = 67174401;BA.debugLine="Badge.SetVModel(k)";
__ref._badge /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=67174402;
 //BA.debugLineNum = 67174402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=67174403;
 //BA.debugLineNum = 67174403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _setvshow(b4j.example.vmbadge __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmbadge";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=66781184;
 //BA.debugLineNum = 66781184;BA.debugLine="Sub SetVShow(vif As String) As VMBadge";
RDebugUtils.currentLine=66781185;
 //BA.debugLineNum = 66781185;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmbadge)(this);};
RDebugUtils.currentLine=66781186;
 //BA.debugLineNum = 66781186;BA.debugLine="Badge.SetVShow(vif)";
__ref._badge /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=66781187;
 //BA.debugLineNum = 66781187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbadge)(this);
RDebugUtils.currentLine=66781188;
 //BA.debugLineNum = 66781188;BA.debugLine="End Sub";
return null;
}
}