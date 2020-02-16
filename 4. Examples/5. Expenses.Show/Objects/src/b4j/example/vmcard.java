package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcard.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _card = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _header = null;
public b4j.example.vmelement _content = null;
public b4j.example.vmcardactions _actions = null;
public b4j.example.vmelement _headertext = null;
public b4j.example.vmcardmedia _media = null;
public boolean _monside = false;
public b4j.example.vmavatar _avatar = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmcard  _addaction(b4j.example.vmcard __ref,String _btnid,String _btntext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "addaction", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "addaction", new Object[] {_btnid,_btntext}));}
b4j.example.vmbutton _btn = null;
RDebugUtils.currentLine=75694080;
 //BA.debugLineNum = 75694080;BA.debugLine="Sub AddAction(btnID As String, btnText As String)";
RDebugUtils.currentLine=75694081;
 //BA.debugLineNum = 75694081;BA.debugLine="Dim btn As VMButton";
_btn = new b4j.example.vmbutton();
RDebugUtils.currentLine=75694082;
 //BA.debugLineNum = 75694082;BA.debugLine="btn.Initialize(vue,btnID, module).SetText(btnText";
_btn._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_btnid,__ref._module /*Object*/ )._settext /*b4j.example.vmbutton*/ (null,_btntext);
RDebugUtils.currentLine=75694083;
 //BA.debugLineNum = 75694083;BA.debugLine="btn.Pop(Actions.CardActions)";
_btn._pop /*String*/ (null,__ref._actions /*b4j.example.vmcardactions*/ ._cardactions /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=75694084;
 //BA.debugLineNum = 75694084;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75694085;
 //BA.debugLineNum = 75694085;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _addchild(b4j.example.vmcard __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=76152832;
 //BA.debugLineNum = 76152832;BA.debugLine="Sub AddChild(child As VMElement) As VMCard";
RDebugUtils.currentLine=76152833;
 //BA.debugLineNum = 76152833;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=76152834;
 //BA.debugLineNum = 76152834;BA.debugLine="Card.SetText(childHTML)";
__ref._card /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=76152835;
 //BA.debugLineNum = 76152835;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76152836;
 //BA.debugLineNum = 76152836;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmcard __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=76546048;
 //BA.debugLineNum = 76546048;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=76546049;
 //BA.debugLineNum = 76546049;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=76546050;
 //BA.debugLineNum = 76546050;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmcard*/ (null,_childx);
 }
};
RDebugUtils.currentLine=76546052;
 //BA.debugLineNum = 76546052;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _addclass(b4j.example.vmcard __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=76349440;
 //BA.debugLineNum = 76349440;BA.debugLine="Sub AddClass(c As String) As VMCard";
RDebugUtils.currentLine=76349441;
 //BA.debugLineNum = 76349441;BA.debugLine="Card.AddClass(c)";
__ref._card /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=76349442;
 //BA.debugLineNum = 76349442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76349443;
 //BA.debugLineNum = 76349443;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
RDebugUtils.currentLine=74973184;
 //BA.debugLineNum = 74973184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=74973185;
 //BA.debugLineNum = 74973185;BA.debugLine="Public Card As VMElement";
_card = new b4j.example.vmelement();
RDebugUtils.currentLine=74973186;
 //BA.debugLineNum = 74973186;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=74973187;
 //BA.debugLineNum = 74973187;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=74973188;
 //BA.debugLineNum = 74973188;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=74973189;
 //BA.debugLineNum = 74973189;BA.debugLine="Public Header As VMElement";
_header = new b4j.example.vmelement();
RDebugUtils.currentLine=74973190;
 //BA.debugLineNum = 74973190;BA.debugLine="Public Content As VMElement";
_content = new b4j.example.vmelement();
RDebugUtils.currentLine=74973191;
 //BA.debugLineNum = 74973191;BA.debugLine="Public Actions As VMCardActions";
_actions = new b4j.example.vmcardactions();
RDebugUtils.currentLine=74973192;
 //BA.debugLineNum = 74973192;BA.debugLine="Private HeaderText As VMElement";
_headertext = new b4j.example.vmelement();
RDebugUtils.currentLine=74973193;
 //BA.debugLineNum = 74973193;BA.debugLine="Private Media As VMCardMedia";
_media = new b4j.example.vmcardmedia();
RDebugUtils.currentLine=74973194;
 //BA.debugLineNum = 74973194;BA.debugLine="Private monside As Boolean";
_monside = false;
RDebugUtils.currentLine=74973195;
 //BA.debugLineNum = 74973195;BA.debugLine="Private Avatar As VMAvatar";
_avatar = new b4j.example.vmavatar();
RDebugUtils.currentLine=74973196;
 //BA.debugLineNum = 74973196;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=74973197;
 //BA.debugLineNum = 74973197;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _initialize(b4j.example.vmcard __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=75038720;
 //BA.debugLineNum = 75038720;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=75038721;
 //BA.debugLineNum = 75038721;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=75038722;
 //BA.debugLineNum = 75038722;BA.debugLine="Card.Initialize(v, ID)";
__ref._card /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=75038723;
 //BA.debugLineNum = 75038723;BA.debugLine="Card.SetTag(\"md-card\")";
__ref._card /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-card");
RDebugUtils.currentLine=75038724;
 //BA.debugLineNum = 75038724;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=75038725;
 //BA.debugLineNum = 75038725;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=75038726;
 //BA.debugLineNum = 75038726;BA.debugLine="Header.Initialize(vue,$\"${ID}ch\"$).SetTag(\"md-car";
__ref._header /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"ch"))._settag /*b4j.example.vmelement*/ (null,"md-card-header");
RDebugUtils.currentLine=75038727;
 //BA.debugLineNum = 75038727;BA.debugLine="Content.Initialize(vue,$\"${ID}cc\"$).SetTag(\"md-ca";
__ref._content /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"cc"))._settag /*b4j.example.vmelement*/ (null,"md-card-content");
RDebugUtils.currentLine=75038728;
 //BA.debugLineNum = 75038728;BA.debugLine="Actions.Initialize(vue,$\"${ID}actions\"$)";
__ref._actions /*b4j.example.vmcardactions*/ ._initialize /*b4j.example.vmcardactions*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"actions"));
RDebugUtils.currentLine=75038729;
 //BA.debugLineNum = 75038729;BA.debugLine="HeaderText.Initialize(vue,$\"${ID}cht\"$).SetTag(\"m";
__ref._headertext /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"cht"))._settag /*b4j.example.vmelement*/ (null,"md-card-header-text");
RDebugUtils.currentLine=75038730;
 //BA.debugLineNum = 75038730;BA.debugLine="Media.Initialize(vue,$\"${ID}media\"$)";
__ref._media /*b4j.example.vmcardmedia*/ ._initialize /*b4j.example.vmcardmedia*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"media"));
RDebugUtils.currentLine=75038731;
 //BA.debugLineNum = 75038731;BA.debugLine="monside = False";
__ref._monside /*boolean*/  = __c.False;
RDebugUtils.currentLine=75038732;
 //BA.debugLineNum = 75038732;BA.debugLine="Avatar.Initialize(vue,$\"${ID}avatar\"$,module)";
__ref._avatar /*b4j.example.vmavatar*/ ._initialize /*b4j.example.vmavatar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"avatar"),__ref._module /*Object*/ );
RDebugUtils.currentLine=75038733;
 //BA.debugLineNum = 75038733;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75038734;
 //BA.debugLineNum = 75038734;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmcard __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=76283904;
 //BA.debugLineNum = 76283904;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=76283905;
 //BA.debugLineNum = 76283905;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=76283906;
 //BA.debugLineNum = 76283906;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=75825152;
 //BA.debugLineNum = 75825152;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=75825154;
 //BA.debugLineNum = 75825154;BA.debugLine="HeaderText.Pop(Header)";
__ref._headertext /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._header /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=75825155;
 //BA.debugLineNum = 75825155;BA.debugLine="If monside Then";
if (__ref._monside /*boolean*/ ) { 
RDebugUtils.currentLine=75825156;
 //BA.debugLineNum = 75825156;BA.debugLine="Media.Pop(Header)";
__ref._media /*b4j.example.vmcardmedia*/ ._pop /*String*/ (null,__ref._header /*b4j.example.vmelement*/ );
 }else {
RDebugUtils.currentLine=75825158;
 //BA.debugLineNum = 75825158;BA.debugLine="Media.Pop(Card)";
__ref._media /*b4j.example.vmcardmedia*/ ._pop /*String*/ (null,__ref._card /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=75825160;
 //BA.debugLineNum = 75825160;BA.debugLine="Header.Pop(Card)";
__ref._header /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._card /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=75825161;
 //BA.debugLineNum = 75825161;BA.debugLine="Content.Pop(Card)";
__ref._content /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._card /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=75825162;
 //BA.debugLineNum = 75825162;BA.debugLine="Actions.Pop(Card)";
__ref._actions /*b4j.example.vmcardactions*/ ._pop /*String*/ (null,__ref._card /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=75825163;
 //BA.debugLineNum = 75825163;BA.debugLine="Return Card.ToString";
if (true) return __ref._card /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=75825164;
 //BA.debugLineNum = 75825164;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=76087296;
 //BA.debugLineNum = 76087296;BA.debugLine="Sub Render";
RDebugUtils.currentLine=76087297;
 //BA.debugLineNum = 76087297;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=76087298;
 //BA.debugLineNum = 76087298;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcard  _setaccent(b4j.example.vmcard __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=75300864;
 //BA.debugLineNum = 75300864;BA.debugLine="Sub SetAccent(b As Boolean) As VMCard";
RDebugUtils.currentLine=75300865;
 //BA.debugLineNum = 75300865;BA.debugLine="Card.SetAccent(True)";
__ref._card /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=75300866;
 //BA.debugLineNum = 75300866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75300867;
 //BA.debugLineNum = 75300867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setattr(b4j.example.vmcard __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=76414976;
 //BA.debugLineNum = 76414976;BA.debugLine="Sub SetAttr(attr As Map) As VMCard";
RDebugUtils.currentLine=76414977;
 //BA.debugLineNum = 76414977;BA.debugLine="Card.SetAttr(attr)";
__ref._card /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=76414978;
 //BA.debugLineNum = 76414978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76414979;
 //BA.debugLineNum = 76414979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setavatar(b4j.example.vmcard __ref,String _imgurl,String _imgalt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setavatar", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setavatar", new Object[] {_imgurl,_imgalt}));}
RDebugUtils.currentLine=75104256;
 //BA.debugLineNum = 75104256;BA.debugLine="Sub SetAvatar(imgURL As String, imgAlt As String)";
RDebugUtils.currentLine=75104257;
 //BA.debugLineNum = 75104257;BA.debugLine="Avatar.SetValue(imgURL)";
__ref._avatar /*b4j.example.vmavatar*/ ._setvalue /*b4j.example.vmavatar*/ (null,_imgurl);
RDebugUtils.currentLine=75104258;
 //BA.debugLineNum = 75104258;BA.debugLine="Avatar.SetAlt(imgAlt)";
__ref._avatar /*b4j.example.vmavatar*/ ._setalt /*b4j.example.vmavatar*/ (null,_imgalt);
RDebugUtils.currentLine=75104259;
 //BA.debugLineNum = 75104259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75104260;
 //BA.debugLineNum = 75104260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setcontent(b4j.example.vmcard __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setcontent", new Object[] {_c}));}
RDebugUtils.currentLine=75759616;
 //BA.debugLineNum = 75759616;BA.debugLine="Sub SetContent(c As String) As VMCard";
RDebugUtils.currentLine=75759617;
 //BA.debugLineNum = 75759617;BA.debugLine="Content.SetText(c)";
__ref._content /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=75759618;
 //BA.debugLineNum = 75759618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75759619;
 //BA.debugLineNum = 75759619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setimage(b4j.example.vmcard __ref,String _imgurl,String _alt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setimage", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setimage", new Object[] {_imgurl,_alt}));}
b4j.example.vmimage _img = null;
RDebugUtils.currentLine=75563008;
 //BA.debugLineNum = 75563008;BA.debugLine="Sub SetImage(imgURL As String, alt As String) As V";
RDebugUtils.currentLine=75563009;
 //BA.debugLineNum = 75563009;BA.debugLine="Dim img As VMImage";
_img = new b4j.example.vmimage();
RDebugUtils.currentLine=75563010;
 //BA.debugLineNum = 75563010;BA.debugLine="img.Initialize(vue,$\"${ID}image\"$,module).SetValu";
_img._initialize /*b4j.example.vmimage*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"image"),__ref._module /*Object*/ )._setvalue /*b4j.example.vmimage*/ (null,_imgurl,__c.True);
RDebugUtils.currentLine=75563011;
 //BA.debugLineNum = 75563011;BA.debugLine="img.SetAlt(alt)";
_img._setalt /*b4j.example.vmimage*/ (null,_alt);
RDebugUtils.currentLine=75563012;
 //BA.debugLineNum = 75563012;BA.debugLine="img.Pop(Media.CardMedia)";
_img._pop /*String*/ (null,__ref._media /*b4j.example.vmcardmedia*/ ._cardmedia /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=75563013;
 //BA.debugLineNum = 75563013;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75563014;
 //BA.debugLineNum = 75563014;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmediabig(b4j.example.vmcard __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setmediabig", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setmediabig", new Object[] {_b}));}
RDebugUtils.currentLine=75366400;
 //BA.debugLineNum = 75366400;BA.debugLine="Sub SetMediaBig(b As Boolean) As VMCard";
RDebugUtils.currentLine=75366401;
 //BA.debugLineNum = 75366401;BA.debugLine="Media.SetBig(b)";
__ref._media /*b4j.example.vmcardmedia*/ ._setbig /*b4j.example.vmcardmedia*/ (null,_b);
RDebugUtils.currentLine=75366402;
 //BA.debugLineNum = 75366402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75366403;
 //BA.debugLineNum = 75366403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmediamedium(b4j.example.vmcard __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setmediamedium", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setmediamedium", new Object[] {_b}));}
RDebugUtils.currentLine=75431936;
 //BA.debugLineNum = 75431936;BA.debugLine="Sub SetMediaMedium(b As Boolean) As VMCard";
RDebugUtils.currentLine=75431937;
 //BA.debugLineNum = 75431937;BA.debugLine="Media.SetMedium(b)";
__ref._media /*b4j.example.vmcardmedia*/ ._setmedium /*b4j.example.vmcardmedia*/ (null,_b);
RDebugUtils.currentLine=75431938;
 //BA.debugLineNum = 75431938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75431939;
 //BA.debugLineNum = 75431939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setmediaonside(b4j.example.vmcard __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setmediaonside", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setmediaonside", new Object[] {_b}));}
RDebugUtils.currentLine=75169792;
 //BA.debugLineNum = 75169792;BA.debugLine="Sub SetMediaOnSide(b As Boolean) As VMCard";
RDebugUtils.currentLine=75169793;
 //BA.debugLineNum = 75169793;BA.debugLine="monside = b";
__ref._monside /*boolean*/  = _b;
RDebugUtils.currentLine=75169794;
 //BA.debugLineNum = 75169794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75169795;
 //BA.debugLineNum = 75169795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setpadding(b4j.example.vmcard __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=76611584;
 //BA.debugLineNum = 76611584;BA.debugLine="Sub SetPadding(p As Object) As VMCard";
RDebugUtils.currentLine=76611585;
 //BA.debugLineNum = 76611585;BA.debugLine="Card.SetPaddingAll(p)";
__ref._card /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=76611586;
 //BA.debugLineNum = 76611586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76611587;
 //BA.debugLineNum = 76611587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setprimary(b4j.example.vmcard __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=75235328;
 //BA.debugLineNum = 75235328;BA.debugLine="Sub SetPrimary(b As Boolean) As VMCard";
RDebugUtils.currentLine=75235329;
 //BA.debugLineNum = 75235329;BA.debugLine="Card.SetPrimary(True)";
__ref._card /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=75235330;
 //BA.debugLineNum = 75235330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75235331;
 //BA.debugLineNum = 75235331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setstyle(b4j.example.vmcard __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=76480512;
 //BA.debugLineNum = 76480512;BA.debugLine="Sub SetStyle(sm As Map) As VMCard";
RDebugUtils.currentLine=76480513;
 //BA.debugLineNum = 76480513;BA.debugLine="Card.SetStyle(sm)";
__ref._card /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=76480514;
 //BA.debugLineNum = 76480514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76480515;
 //BA.debugLineNum = 76480515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setsubheading(b4j.example.vmcard __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setsubheading", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setsubheading", new Object[] {_t}));}
b4j.example.vmelement _title = null;
RDebugUtils.currentLine=75628544;
 //BA.debugLineNum = 75628544;BA.debugLine="Sub SetSubHeading(t As String) As VMCard";
RDebugUtils.currentLine=75628545;
 //BA.debugLineNum = 75628545;BA.debugLine="Dim title As VMElement";
_title = new b4j.example.vmelement();
RDebugUtils.currentLine=75628546;
 //BA.debugLineNum = 75628546;BA.debugLine="title.Initialize(vue,$\"${ID}subheading\"$).SetTag(";
_title._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"subheading"))._settag /*b4j.example.vmelement*/ (null,"div")._setsubhead /*b4j.example.vmelement*/ (null,__c.True)._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=75628547;
 //BA.debugLineNum = 75628547;BA.debugLine="title.Pop(HeaderText)";
_title._pop /*String*/ (null,__ref._headertext /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=75628548;
 //BA.debugLineNum = 75628548;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75628549;
 //BA.debugLineNum = 75628549;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settext(b4j.example.vmcard __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=76218368;
 //BA.debugLineNum = 76218368;BA.debugLine="Sub SetText(t As Object) As VMCard";
RDebugUtils.currentLine=76218369;
 //BA.debugLineNum = 76218369;BA.debugLine="Card.SetText(t)";
__ref._card /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=76218370;
 //BA.debugLineNum = 76218370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76218371;
 //BA.debugLineNum = 76218371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settheme(b4j.example.vmcard __ref,Object _vartheme) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "settheme", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "settheme", new Object[] {_vartheme}));}
RDebugUtils.currentLine=76742656;
 //BA.debugLineNum = 76742656;BA.debugLine="Sub SetTheme(varTheme As Object) As VMCard";
RDebugUtils.currentLine=76742657;
 //BA.debugLineNum = 76742657;BA.debugLine="SetAttr(CreateMap(\"md-theme\": varTheme))";
__ref._setattr /*b4j.example.vmcard*/ (null,__c.createMap(new Object[] {(Object)("md-theme"),_vartheme}));
RDebugUtils.currentLine=76742658;
 //BA.debugLineNum = 76742658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76742659;
 //BA.debugLineNum = 76742659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setthemeaccent(b4j.example.vmcard __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setthemeaccent", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setthemeaccent", new Object[] {_b}));}
RDebugUtils.currentLine=76873728;
 //BA.debugLineNum = 76873728;BA.debugLine="Sub SetThemeAccent(b As Boolean) As VMCard    'ign";
RDebugUtils.currentLine=76873729;
 //BA.debugLineNum = 76873729;BA.debugLine="AddClass(\"md-accent\")";
__ref._addclass /*b4j.example.vmcard*/ (null,"md-accent");
RDebugUtils.currentLine=76873730;
 //BA.debugLineNum = 76873730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76873731;
 //BA.debugLineNum = 76873731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setthemeprimary(b4j.example.vmcard __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setthemeprimary", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setthemeprimary", new Object[] {_b}));}
RDebugUtils.currentLine=76808192;
 //BA.debugLineNum = 76808192;BA.debugLine="Sub SetThemePrimary(b As Boolean) As VMCard    'ig";
RDebugUtils.currentLine=76808193;
 //BA.debugLineNum = 76808193;BA.debugLine="AddClass(\"md-primary\")";
__ref._addclass /*b4j.example.vmcard*/ (null,"md-primary");
RDebugUtils.currentLine=76808194;
 //BA.debugLineNum = 76808194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76808195;
 //BA.debugLineNum = 76808195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _settitle(b4j.example.vmcard __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "settitle", new Object[] {_t}));}
b4j.example.vmelement _title = null;
RDebugUtils.currentLine=75497472;
 //BA.debugLineNum = 75497472;BA.debugLine="Sub SetTitle(t As String) As VMCard";
RDebugUtils.currentLine=75497473;
 //BA.debugLineNum = 75497473;BA.debugLine="Dim title As VMElement";
_title = new b4j.example.vmelement();
RDebugUtils.currentLine=75497474;
 //BA.debugLineNum = 75497474;BA.debugLine="title.Initialize(vue,$\"${ID}title\"$).SetTag(\"div\"";
_title._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"title"))._settag /*b4j.example.vmelement*/ (null,"div")._settitle /*b4j.example.vmelement*/ (null,__c.True)._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=75497475;
 //BA.debugLineNum = 75497475;BA.debugLine="title.Pop(HeaderText)";
_title._pop /*String*/ (null,__ref._headertext /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=75497476;
 //BA.debugLineNum = 75497476;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75497477;
 //BA.debugLineNum = 75497477;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvif(b4j.example.vmcard __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=75956224;
 //BA.debugLineNum = 75956224;BA.debugLine="Sub SetVIf(vif As Object) As VMCard";
RDebugUtils.currentLine=75956225;
 //BA.debugLineNum = 75956225;BA.debugLine="Card.SetVIf(vif)";
__ref._card /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=75956226;
 //BA.debugLineNum = 75956226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75956227;
 //BA.debugLineNum = 75956227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvmodel(b4j.example.vmcard __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=75890688;
 //BA.debugLineNum = 75890688;BA.debugLine="Sub SetVModel(k As String) As VMCard";
RDebugUtils.currentLine=75890689;
 //BA.debugLineNum = 75890689;BA.debugLine="Card.SetVModel(k)";
__ref._card /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=75890690;
 //BA.debugLineNum = 75890690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=75890691;
 //BA.debugLineNum = 75890691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setvshow(b4j.example.vmcard __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=76021760;
 //BA.debugLineNum = 76021760;BA.debugLine="Sub SetVShow(vif As Object) As VMCard";
RDebugUtils.currentLine=76021761;
 //BA.debugLineNum = 76021761;BA.debugLine="Card.SetVShow(vif)";
__ref._card /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=76021762;
 //BA.debugLineNum = 76021762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76021763;
 //BA.debugLineNum = 76021763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcard  _setwithhover(b4j.example.vmcard __ref,boolean _varwith) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcard";
if (Debug.shouldDelegate(ba, "setwithhover", true))
	 {return ((b4j.example.vmcard) Debug.delegate(ba, "setwithhover", new Object[] {_varwith}));}
RDebugUtils.currentLine=76677120;
 //BA.debugLineNum = 76677120;BA.debugLine="Sub SetWithHover(varWith As Boolean) As VMCard";
RDebugUtils.currentLine=76677121;
 //BA.debugLineNum = 76677121;BA.debugLine="SetAttr(CreateMap(\":md-with-hover\": varWith))";
__ref._setattr /*b4j.example.vmcard*/ (null,__c.createMap(new Object[] {(Object)(":md-with-hover"),(Object)(_varwith)}));
RDebugUtils.currentLine=76677122;
 //BA.debugLineNum = 76677122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcard)(this);
RDebugUtils.currentLine=76677123;
 //BA.debugLineNum = 76677123;BA.debugLine="End Sub";
return null;
}
}