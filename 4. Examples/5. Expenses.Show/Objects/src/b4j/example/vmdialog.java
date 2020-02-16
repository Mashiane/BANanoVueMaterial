package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdialog.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _dialog = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmelement _actions = null;
public com.ab.banano.BANano _banano = null;
public boolean _bactive = false;
public b4j.example.vmelement _content = null;
public Object _module = null;
public b4j.example.vmcontainer _container = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmdialog  _settitle(b4j.example.vmdialog __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "settitle", new Object[] {_t}));}
String _pp = "";
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=105185280;
 //BA.debugLineNum = 105185280;BA.debugLine="Sub SetTitle(t As String) As VMDialog";
RDebugUtils.currentLine=105185281;
 //BA.debugLineNum = 105185281;BA.debugLine="Dim pp As String = $\"${ID}title\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"title");
RDebugUtils.currentLine=105185282;
 //BA.debugLineNum = 105185282;BA.debugLine="vue.SetStateSingle(pp, t)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_t));
RDebugUtils.currentLine=105185283;
 //BA.debugLineNum = 105185283;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=105185284;
 //BA.debugLineNum = 105185284;BA.debugLine="el.Initialize(vue,$\"${ID}title\"$).SetTagDialogTit";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"title"))._settagdialogtitle /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=105185285;
 //BA.debugLineNum = 105185285;BA.debugLine="el.SetText($\"{{ ${pp} }}\"$)";
_el._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(_pp))+" }}"));
RDebugUtils.currentLine=105185286;
 //BA.debugLineNum = 105185286;BA.debugLine="el.Pop(Dialog)";
_el._pop /*String*/ (null,__ref._dialog /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=105185287;
 //BA.debugLineNum = 105185287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105185288;
 //BA.debugLineNum = 105185288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addcancel(b4j.example.vmdialog __ref,String _btnid,String _caption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "addcancel", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "addcancel", new Object[] {_btnid,_caption}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=105381888;
 //BA.debugLineNum = 105381888;BA.debugLine="Sub AddCancel(btnID As String, Caption As String)";
RDebugUtils.currentLine=105381889;
 //BA.debugLineNum = 105381889;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=105381890;
 //BA.debugLineNum = 105381890;BA.debugLine="btn.Initialize(vue, btnID, module)";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_btnid,__ref._module /*Object*/ );
RDebugUtils.currentLine=105381891;
 //BA.debugLineNum = 105381891;BA.debugLine="btn.SetText(Caption).SetAccent(True)";
_btn._settext /*b4j.example.vmbutton*/ (null,_caption)._setaccent /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=105381892;
 //BA.debugLineNum = 105381892;BA.debugLine="btn.RemoveAttr(\":required\")";
_btn._removeattr /*b4j.example.vmbutton*/ (null,":required");
RDebugUtils.currentLine=105381893;
 //BA.debugLineNum = 105381893;BA.debugLine="AddAction(btn)";
__ref._addaction /*b4j.example.vmdialog*/ (null,_btn);
RDebugUtils.currentLine=105381894;
 //BA.debugLineNum = 105381894;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105381895;
 //BA.debugLineNum = 105381895;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addok(b4j.example.vmdialog __ref,String _btnid,String _caption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "addok", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "addok", new Object[] {_btnid,_caption}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=105316352;
 //BA.debugLineNum = 105316352;BA.debugLine="Sub AddOK(btnID As String, Caption As String) As V";
RDebugUtils.currentLine=105316353;
 //BA.debugLineNum = 105316353;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=105316354;
 //BA.debugLineNum = 105316354;BA.debugLine="btn.Initialize(vue, btnID, module)";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_btnid,__ref._module /*Object*/ );
RDebugUtils.currentLine=105316355;
 //BA.debugLineNum = 105316355;BA.debugLine="btn.SetText(Caption).SetPrimary(True)";
_btn._settext /*b4j.example.vmbutton*/ (null,_caption)._setprimary /*b4j.example.vmbutton*/ (null,__c.True);
RDebugUtils.currentLine=105316356;
 //BA.debugLineNum = 105316356;BA.debugLine="btn.RemoveAttr(\":required\")";
_btn._removeattr /*b4j.example.vmbutton*/ (null,":required");
RDebugUtils.currentLine=105316357;
 //BA.debugLineNum = 105316357;BA.debugLine="AddAction(btn)";
__ref._addaction /*b4j.example.vmdialog*/ (null,_btn);
RDebugUtils.currentLine=105316358;
 //BA.debugLineNum = 105316358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105316359;
 //BA.debugLineNum = 105316359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setclickoutsidetoclose(b4j.example.vmdialog __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setclickoutsidetoclose", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setclickoutsidetoclose", new Object[] {_b}));}
RDebugUtils.currentLine=105906176;
 //BA.debugLineNum = 105906176;BA.debugLine="Sub SetClickOutsideToClose(b As Boolean) As VMDial";
RDebugUtils.currentLine=105906177;
 //BA.debugLineNum = 105906177;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-click-outside-to-cl";
__ref._dialog /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-click-outside-to-close"),(Object)(_b)}));
RDebugUtils.currentLine=105906178;
 //BA.debugLineNum = 105906178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105906179;
 //BA.debugLineNum = 105906179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setcloseonesc(b4j.example.vmdialog __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setcloseonesc", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setcloseonesc", new Object[] {_b}));}
RDebugUtils.currentLine=105971712;
 //BA.debugLineNum = 105971712;BA.debugLine="Sub SetCloseOnEsc(b As Boolean) As VMDialog";
RDebugUtils.currentLine=105971713;
 //BA.debugLineNum = 105971713;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-close-on-esc\": b))";
__ref._dialog /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-close-on-esc"),(Object)(_b)}));
RDebugUtils.currentLine=105971714;
 //BA.debugLineNum = 105971714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105971715;
 //BA.debugLineNum = 105971715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setwidth(b4j.example.vmdialog __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=104464384;
 //BA.debugLineNum = 104464384;BA.debugLine="Sub SetWidth(w As String) As VMDialog";
RDebugUtils.currentLine=104464385;
 //BA.debugLineNum = 104464385;BA.debugLine="Dialog.SetStyle(CreateMap(\"width\":w))";
__ref._dialog /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
RDebugUtils.currentLine=104464386;
 //BA.debugLineNum = 104464386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104464387;
 //BA.debugLineNum = 104464387;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdata(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "getdata", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getdata", null));}
RDebugUtils.currentLine=273285120;
 //BA.debugLineNum = 273285120;BA.debugLine="Sub GetData As Map";
RDebugUtils.currentLine=273285121;
 //BA.debugLineNum = 273285121;BA.debugLine="Return Container.GetData";
if (true) return __ref._container /*b4j.example.vmcontainer*/ ._getdata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=273285122;
 //BA.debugLineNum = 273285122;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _required(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "required", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "required", null));}
RDebugUtils.currentLine=273350656;
 //BA.debugLineNum = 273350656;BA.debugLine="Sub Required As Map";
RDebugUtils.currentLine=273350657;
 //BA.debugLineNum = 273350657;BA.debugLine="Return Container.required";
if (true) return __ref._container /*b4j.example.vmcontainer*/ ._required /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=273350658;
 //BA.debugLineNum = 273350658;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmdialog __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=105775104;
 //BA.debugLineNum = 105775104;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=105775105;
 //BA.debugLineNum = 105775105;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=105775106;
 //BA.debugLineNum = 105775106;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _initialize(b4j.example.vmdialog __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=104202240;
 //BA.debugLineNum = 104202240;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=104202241;
 //BA.debugLineNum = 104202241;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=104202242;
 //BA.debugLineNum = 104202242;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=104202243;
 //BA.debugLineNum = 104202243;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=104202244;
 //BA.debugLineNum = 104202244;BA.debugLine="Dialog.Initialize(vue, $\"${ID}dialog\"$).SetTag(\"m";
__ref._dialog /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"dialog"))._settag /*b4j.example.vmelement*/ (null,"md-dialog");
RDebugUtils.currentLine=104202245;
 //BA.debugLineNum = 104202245;BA.debugLine="actions.Initialize(vue,$\"${ID}actions\"$).SetTag(\"";
__ref._actions /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"actions"))._settag /*b4j.example.vmelement*/ (null,"md-dialog-actions");
RDebugUtils.currentLine=104202246;
 //BA.debugLineNum = 104202246;BA.debugLine="actions.RemoveAttr(\":required\")";
__ref._actions /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=104202247;
 //BA.debugLineNum = 104202247;BA.debugLine="actions.RemoveAttr(\"v-show\")";
__ref._actions /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=104202248;
 //BA.debugLineNum = 104202248;BA.debugLine="bActive = False";
__ref._bactive /*boolean*/  = __c.False;
RDebugUtils.currentLine=104202249;
 //BA.debugLineNum = 104202249;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=104202250;
 //BA.debugLineNum = 104202250;BA.debugLine="SetActiveSync(ID)";
__ref._setactivesync /*b4j.example.vmdialog*/ (null,(Object)(__ref._id /*String*/ ));
 };
RDebugUtils.currentLine=104202252;
 //BA.debugLineNum = 104202252;BA.debugLine="Content.Initialize(vue,$\"${ID}content\"$).SetTag(\"";
__ref._content /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"content"))._settag /*b4j.example.vmelement*/ (null,"md-dialog-content");
RDebugUtils.currentLine=104202253;
 //BA.debugLineNum = 104202253;BA.debugLine="Content.RemoveAttr(\":required\")";
__ref._content /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=104202254;
 //BA.debugLineNum = 104202254;BA.debugLine="Container.Initialize(vue, sid & \"grid\", eventHand";
__ref._container /*b4j.example.vmcontainer*/ ._initialize /*b4j.example.vmcontainer*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid+"grid",_eventhandler);
RDebugUtils.currentLine=104202255;
 //BA.debugLineNum = 104202255;BA.debugLine="Container.RemoveAttr(\":required\")";
__ref._container /*b4j.example.vmcontainer*/ ._removeattr /*b4j.example.vmcontainer*/ (null,":required");
RDebugUtils.currentLine=104202256;
 //BA.debugLineNum = 104202256;BA.debugLine="SetOnOpened";
__ref._setonopened /*b4j.example.vmdialog*/ (null);
RDebugUtils.currentLine=104202257;
 //BA.debugLineNum = 104202257;BA.debugLine="SetOnClosed";
__ref._setonclosed /*b4j.example.vmdialog*/ (null);
RDebugUtils.currentLine=104202258;
 //BA.debugLineNum = 104202258;BA.debugLine="SetOnClickedOutside";
__ref._setonclickedoutside /*b4j.example.vmdialog*/ (null);
RDebugUtils.currentLine=104202259;
 //BA.debugLineNum = 104202259;BA.debugLine="Dialog.RemoveAttr(\":required\")";
__ref._dialog /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=104202260;
 //BA.debugLineNum = 104202260;BA.debugLine="Dialog.RemoveAttr(\"v-show\")";
__ref._dialog /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=104202261;
 //BA.debugLineNum = 104202261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104202262;
 //BA.debugLineNum = 104202262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addaction(b4j.example.vmdialog __ref,b4j.example.vmbutton _btn) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "addaction", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "addaction", new Object[] {_btn}));}
RDebugUtils.currentLine=105250816;
 //BA.debugLineNum = 105250816;BA.debugLine="Sub AddAction(btn As VMButton) As VMDialog";
RDebugUtils.currentLine=105250817;
 //BA.debugLineNum = 105250817;BA.debugLine="btn.Pop(actions)";
_btn._pop /*String*/ (null,__ref._actions /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=105250818;
 //BA.debugLineNum = 105250818;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105250819;
 //BA.debugLineNum = 105250819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addclass(b4j.example.vmdialog __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=104988672;
 //BA.debugLineNum = 104988672;BA.debugLine="Sub AddClass(c As String) As VMDialog";
RDebugUtils.currentLine=104988673;
 //BA.debugLineNum = 104988673;BA.debugLine="Dialog.AddClass(c)";
__ref._dialog /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=104988674;
 //BA.debugLineNum = 104988674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104988675;
 //BA.debugLineNum = 104988675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _addcontent(b4j.example.vmdialog __ref,b4j.example.vmelement _cnttext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "addcontent", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "addcontent", new Object[] {_cnttext}));}
RDebugUtils.currentLine=104595456;
 //BA.debugLineNum = 104595456;BA.debugLine="Sub AddContent(cntText As VMElement) As VMDialog";
RDebugUtils.currentLine=104595457;
 //BA.debugLineNum = 104595457;BA.debugLine="cntText.Pop(Content)";
_cnttext._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=104595458;
 //BA.debugLineNum = 104595458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104595459;
 //BA.debugLineNum = 104595459;BA.debugLine="End Sub";
return null;
}
public String  _addform(b4j.example.vmdialog __ref,b4j.example.vmform _frm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "addform", true))
	 {return ((String) Debug.delegate(ba, "addform", new Object[] {_frm}));}
RDebugUtils.currentLine=104660992;
 //BA.debugLineNum = 104660992;BA.debugLine="Sub AddForm(frm As VMForm)";
RDebugUtils.currentLine=104660993;
 //BA.debugLineNum = 104660993;BA.debugLine="AddHTML(frm.ToString)";
__ref._addhtml /*String*/ (null,_frm._tostring /*String*/ (null));
RDebugUtils.currentLine=104660994;
 //BA.debugLineNum = 104660994;BA.debugLine="End Sub";
return "";
}
public String  _addhtml(b4j.example.vmdialog __ref,String _htmlcontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "addhtml", true))
	 {return ((String) Debug.delegate(ba, "addhtml", new Object[] {_htmlcontent}));}
RDebugUtils.currentLine=104726528;
 //BA.debugLineNum = 104726528;BA.debugLine="Sub AddHTML(htmlContent As String)";
RDebugUtils.currentLine=104726529;
 //BA.debugLineNum = 104726529;BA.debugLine="Content.SetText(htmlContent)";
__ref._content /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_htmlcontent);
RDebugUtils.currentLine=104726530;
 //BA.debugLineNum = 104726530;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
RDebugUtils.currentLine=104136704;
 //BA.debugLineNum = 104136704;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=104136705;
 //BA.debugLineNum = 104136705;BA.debugLine="Public Dialog As VMElement";
_dialog = new b4j.example.vmelement();
RDebugUtils.currentLine=104136706;
 //BA.debugLineNum = 104136706;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=104136707;
 //BA.debugLineNum = 104136707;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=104136708;
 //BA.debugLineNum = 104136708;BA.debugLine="Private actions As VMElement";
_actions = new b4j.example.vmelement();
RDebugUtils.currentLine=104136709;
 //BA.debugLineNum = 104136709;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=104136710;
 //BA.debugLineNum = 104136710;BA.debugLine="Private bActive As Boolean";
_bactive = false;
RDebugUtils.currentLine=104136711;
 //BA.debugLineNum = 104136711;BA.debugLine="Private Content As VMElement";
_content = new b4j.example.vmelement();
RDebugUtils.currentLine=104136712;
 //BA.debugLineNum = 104136712;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=104136713;
 //BA.debugLineNum = 104136713;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
RDebugUtils.currentLine=104136714;
 //BA.debugLineNum = 104136714;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=104792064;
 //BA.debugLineNum = 104792064;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=104792065;
 //BA.debugLineNum = 104792065;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=104792066;
 //BA.debugLineNum = 104792066;BA.debugLine="opt.Put(ID, False)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.False));
RDebugUtils.currentLine=104792067;
 //BA.debugLineNum = 104792067;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=104792068;
 //BA.debugLineNum = 104792068;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _setactivesync(b4j.example.vmdialog __ref,Object _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setactivesync", new Object[] {_a}));}
RDebugUtils.currentLine=105578496;
 //BA.debugLineNum = 105578496;BA.debugLine="private Sub SetActiveSync(a As Object) As VMDialog";
RDebugUtils.currentLine=105578497;
 //BA.debugLineNum = 105578497;BA.debugLine="Dialog.SetActiveSync(a)";
__ref._dialog /*b4j.example.vmelement*/ ._setactivesync /*b4j.example.vmelement*/ (null,BA.ObjectToString(_a));
RDebugUtils.currentLine=105578498;
 //BA.debugLineNum = 105578498;BA.debugLine="bActive = True";
__ref._bactive /*boolean*/  = __c.True;
RDebugUtils.currentLine=105578499;
 //BA.debugLineNum = 105578499;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105578500;
 //BA.debugLineNum = 105578500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setonopened(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setonopened", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setonopened", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=106102784;
 //BA.debugLineNum = 106102784;BA.debugLine="private Sub SetOnOpened As VMDialog";
RDebugUtils.currentLine=106102785;
 //BA.debugLineNum = 106102785;BA.debugLine="Dim methodName As String = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_opened");
RDebugUtils.currentLine=106102786;
 //BA.debugLineNum = 106102786;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
RDebugUtils.currentLine=106102787;
 //BA.debugLineNum = 106102787;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=106102788;
 //BA.debugLineNum = 106102788;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=106102789;
 //BA.debugLineNum = 106102789;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-opened\": method";
__ref._dialog /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
RDebugUtils.currentLine=106102791;
 //BA.debugLineNum = 106102791;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=106102792;
 //BA.debugLineNum = 106102792;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=106102793;
 //BA.debugLineNum = 106102793;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setonclosed(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setonclosed", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setonclosed", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=106168320;
 //BA.debugLineNum = 106168320;BA.debugLine="private Sub SetOnClosed As VMDialog";
RDebugUtils.currentLine=106168321;
 //BA.debugLineNum = 106168321;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_closed");
RDebugUtils.currentLine=106168322;
 //BA.debugLineNum = 106168322;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdialog)(this);};
RDebugUtils.currentLine=106168323;
 //BA.debugLineNum = 106168323;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=106168324;
 //BA.debugLineNum = 106168324;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=106168325;
 //BA.debugLineNum = 106168325;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-closed\": method";
__ref._dialog /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
RDebugUtils.currentLine=106168327;
 //BA.debugLineNum = 106168327;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=106168328;
 //BA.debugLineNum = 106168328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=106168329;
 //BA.debugLineNum = 106168329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setonclickedoutside(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setonclickedoutside", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setonclickedoutside", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=106233856;
 //BA.debugLineNum = 106233856;BA.debugLine="private Sub SetOnClickedOutside As VMDialog";
RDebugUtils.currentLine=106233857;
 //BA.debugLineNum = 106233857;BA.debugLine="Dim methodName As String = $\"${ID}_outside\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_outside");
RDebugUtils.currentLine=106233858;
 //BA.debugLineNum = 106233858;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=106233859;
 //BA.debugLineNum = 106233859;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=106233860;
 //BA.debugLineNum = 106233860;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-clicked-outside";
__ref._dialog /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-clicked-outside"),(Object)(_methodname)}));
RDebugUtils.currentLine=106233862;
 //BA.debugLineNum = 106233862;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=106233863;
 //BA.debugLineNum = 106233863;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=106233864;
 //BA.debugLineNum = 106233864;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=105644032;
 //BA.debugLineNum = 105644032;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=105644033;
 //BA.debugLineNum = 105644033;BA.debugLine="AddHTML(Container.ToString)";
__ref._addhtml /*String*/ (null,__ref._container /*b4j.example.vmcontainer*/ ._tostring /*String*/ (null));
RDebugUtils.currentLine=105644034;
 //BA.debugLineNum = 105644034;BA.debugLine="Content.Pop(Dialog)";
__ref._content /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._dialog /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=105644035;
 //BA.debugLineNum = 105644035;BA.debugLine="If bActive = False Then";
if (__ref._bactive /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=105644036;
 //BA.debugLineNum = 105644036;BA.debugLine="Log($\"VMDialog.SetActiveSync: '${ID}' has not be";
__c.Log(("VMDialog.SetActiveSync: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' has not been activated!"));
 };
RDebugUtils.currentLine=105644038;
 //BA.debugLineNum = 105644038;BA.debugLine="If actions.hasContent Then";
if (__ref._actions /*b4j.example.vmelement*/ ._hascontent /*boolean*/ ) { 
RDebugUtils.currentLine=105644039;
 //BA.debugLineNum = 105644039;BA.debugLine="actions.Pop(Dialog)";
__ref._actions /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._dialog /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=105644041;
 //BA.debugLineNum = 105644041;BA.debugLine="Return Dialog.tostring";
if (true) return __ref._dialog /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=105644042;
 //BA.debugLineNum = 105644042;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=105709568;
 //BA.debugLineNum = 105709568;BA.debugLine="Sub Render";
RDebugUtils.currentLine=105709569;
 //BA.debugLineNum = 105709569;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=105709570;
 //BA.debugLineNum = 105709570;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _setattr(b4j.example.vmdialog __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=105054208;
 //BA.debugLineNum = 105054208;BA.debugLine="Sub SetAttr(attr As Map) As VMDialog";
RDebugUtils.currentLine=105054209;
 //BA.debugLineNum = 105054209;BA.debugLine="Dialog.SetAttr(attr)";
__ref._dialog /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=105054210;
 //BA.debugLineNum = 105054210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105054211;
 //BA.debugLineNum = 105054211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setbackdrop(b4j.example.vmdialog __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setbackdrop", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setbackdrop", new Object[] {_b}));}
RDebugUtils.currentLine=106037248;
 //BA.debugLineNum = 106037248;BA.debugLine="Sub SetBackdrop(b As Boolean) As VMDialog";
RDebugUtils.currentLine=106037249;
 //BA.debugLineNum = 106037249;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-backdrop\": b))";
__ref._dialog /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-backdrop"),(Object)(_b)}));
RDebugUtils.currentLine=106037250;
 //BA.debugLineNum = 106037250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=106037251;
 //BA.debugLineNum = 106037251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setcontent(b4j.example.vmdialog __ref,String _cnttext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setcontent", new Object[] {_cnttext}));}
RDebugUtils.currentLine=105119744;
 //BA.debugLineNum = 105119744;BA.debugLine="Sub SetContent(cntText As String) As VMDialog";
RDebugUtils.currentLine=105119745;
 //BA.debugLineNum = 105119745;BA.debugLine="Dialog.SetText(cntText)";
__ref._dialog /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_cnttext);
RDebugUtils.currentLine=105119746;
 //BA.debugLineNum = 105119746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105119747;
 //BA.debugLineNum = 105119747;BA.debugLine="End Sub";
return null;
}
public String  _setdefaults(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setdefaults", true))
	 {return ((String) Debug.delegate(ba, "setdefaults", null));}
RDebugUtils.currentLine=273416192;
 //BA.debugLineNum = 273416192;BA.debugLine="Sub SetDefaults";
RDebugUtils.currentLine=273416193;
 //BA.debugLineNum = 273416193;BA.debugLine="Container.SetDefaults";
__ref._container /*b4j.example.vmcontainer*/ ._setdefaults /*String*/ (null);
RDebugUtils.currentLine=273416194;
 //BA.debugLineNum = 273416194;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdialog  _setelevation(b4j.example.vmdialog __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=104923136;
 //BA.debugLineNum = 104923136;BA.debugLine="Sub SetElevation(e As Int) As VMDialog";
RDebugUtils.currentLine=104923137;
 //BA.debugLineNum = 104923137;BA.debugLine="Dialog.SetElevation(e)";
__ref._dialog /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=104923138;
 //BA.debugLineNum = 104923138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104923139;
 //BA.debugLineNum = 104923139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setfullscreen(b4j.example.vmdialog __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setfullscreen", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setfullscreen", new Object[] {_b}));}
RDebugUtils.currentLine=105840640;
 //BA.debugLineNum = 105840640;BA.debugLine="Sub SetFullScreen(b As Boolean) As VMDialog";
RDebugUtils.currentLine=105840641;
 //BA.debugLineNum = 105840641;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-fullscreen\": b))";
__ref._dialog /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-fullscreen"),(Object)(_b)}));
RDebugUtils.currentLine=105840642;
 //BA.debugLineNum = 105840642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105840643;
 //BA.debugLineNum = 105840643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setheight(b4j.example.vmdialog __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setheight", new Object[] {_w}));}
RDebugUtils.currentLine=104529920;
 //BA.debugLineNum = 104529920;BA.debugLine="Sub SetHeight(w As String) As VMDialog";
RDebugUtils.currentLine=104529921;
 //BA.debugLineNum = 104529921;BA.debugLine="Dialog.SetStyle(CreateMap(\"width\":w))";
__ref._dialog /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
RDebugUtils.currentLine=104529922;
 //BA.debugLineNum = 104529922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104529923;
 //BA.debugLineNum = 104529923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setkey(b4j.example.vmdialog __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setkey", new Object[] {_k}));}
RDebugUtils.currentLine=104267776;
 //BA.debugLineNum = 104267776;BA.debugLine="Sub SetKey(k As String) As VMDialog";
RDebugUtils.currentLine=104267777;
 //BA.debugLineNum = 104267777;BA.debugLine="Dialog.SetKey(k,True)";
__ref._dialog /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),__c.True);
RDebugUtils.currentLine=104267778;
 //BA.debugLineNum = 104267778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104267779;
 //BA.debugLineNum = 104267779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setmaxheight(b4j.example.vmdialog __ref,String _mw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setmaxheight", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setmaxheight", new Object[] {_mw}));}
RDebugUtils.currentLine=105512960;
 //BA.debugLineNum = 105512960;BA.debugLine="Sub SetMaxHeight(mw As String) As VMDialog";
RDebugUtils.currentLine=105512961;
 //BA.debugLineNum = 105512961;BA.debugLine="Dialog.SetMaxHeight(mw)";
__ref._dialog /*b4j.example.vmelement*/ ._setmaxheight /*b4j.example.vmelement*/ (null,_mw);
RDebugUtils.currentLine=105512962;
 //BA.debugLineNum = 105512962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105512963;
 //BA.debugLineNum = 105512963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setmaxwidth(b4j.example.vmdialog __ref,String _mw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setmaxwidth", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setmaxwidth", new Object[] {_mw}));}
RDebugUtils.currentLine=105447424;
 //BA.debugLineNum = 105447424;BA.debugLine="Sub SetMaxWidth(mw As String) As VMDialog";
RDebugUtils.currentLine=105447425;
 //BA.debugLineNum = 105447425;BA.debugLine="Dialog.SetMaxWidth(mw)";
__ref._dialog /*b4j.example.vmelement*/ ._setmaxwidth /*b4j.example.vmelement*/ (null,_mw);
RDebugUtils.currentLine=105447426;
 //BA.debugLineNum = 105447426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=105447427;
 //BA.debugLineNum = 105447427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setscrollbar(b4j.example.vmdialog __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setscrollbar", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setscrollbar", new Object[] {_b}));}
RDebugUtils.currentLine=104333312;
 //BA.debugLineNum = 104333312;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMDialog";
RDebugUtils.currentLine=104333313;
 //BA.debugLineNum = 104333313;BA.debugLine="Content.SetScrollBar(True)";
__ref._content /*b4j.example.vmelement*/ ._setscrollbar /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=104333314;
 //BA.debugLineNum = 104333314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104333315;
 //BA.debugLineNum = 104333315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _setstyle(b4j.example.vmdialog __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=104398848;
 //BA.debugLineNum = 104398848;BA.debugLine="Sub SetStyle(m As Map) As VMDialog";
RDebugUtils.currentLine=104398849;
 //BA.debugLineNum = 104398849;BA.debugLine="Dialog.SetStyle(m)";
__ref._dialog /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=104398850;
 //BA.debugLineNum = 104398850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdialog)(this);
RDebugUtils.currentLine=104398851;
 //BA.debugLineNum = 104398851;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.vmdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=104857600;
 //BA.debugLineNum = 104857600;BA.debugLine="Sub Show";
RDebugUtils.currentLine=104857601;
 //BA.debugLineNum = 104857601;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=104857602;
 //BA.debugLineNum = 104857602;BA.debugLine="opt.Put(ID, True)";
_opt.Put((Object)(__ref._id /*String*/ ),(Object)(__c.True));
RDebugUtils.currentLine=104857603;
 //BA.debugLineNum = 104857603;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=104857604;
 //BA.debugLineNum = 104857604;BA.debugLine="End Sub";
return "";
}
}