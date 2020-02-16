package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmelement extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmelement", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmelement.class).invoke(this, new Object[] {null});
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
public b4j.example.vuehtml _element = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _hascontent = false;
public String _rowclass = "";
public String _cellclass = "";
public anywheresoftware.b4a.objects.collections.Map _offclass = null;
public anywheresoftware.b4a.objects.collections.Map _colclass = null;
public String _showkey = "";
public String _diskey = "";
public String _reqkey = "";
public String _errkey = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmelement  _settext(b4j.example.vmelement __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=117243904;
 //BA.debugLineNum = 117243904;BA.debugLine="Sub SetText(t As String) As VMElement";
RDebugUtils.currentLine=117243905;
 //BA.debugLineNum = 117243905;BA.debugLine="Element.SetText(t)";
__ref._element /*b4j.example.vuehtml*/ ._settext /*b4j.example.vuehtml*/ (null,_t);
RDebugUtils.currentLine=117243906;
 //BA.debugLineNum = 117243906;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=117243907;
 //BA.debugLineNum = 117243907;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117243908;
 //BA.debugLineNum = 117243908;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=117506048;
 //BA.debugLineNum = 117506048;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=117506049;
 //BA.debugLineNum = 117506049;BA.debugLine="p.Element.AddElement(Element)";
_p._element /*b4j.example.vuehtml*/ ._addelement /*b4j.example.vuehtml*/ (null,__ref._element /*b4j.example.vuehtml*/ );
RDebugUtils.currentLine=117506050;
 //BA.debugLineNum = 117506050;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=117506051;
 //BA.debugLineNum = 117506051;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=117571584;
 //BA.debugLineNum = 117571584;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=117571585;
 //BA.debugLineNum = 117571585;BA.debugLine="Return Element.tostring";
if (true) return __ref._element /*b4j.example.vuehtml*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=117571586;
 //BA.debugLineNum = 117571586;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _initialize(b4j.example.vmelement __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=109117440;
 //BA.debugLineNum = 109117440;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=109117441;
 //BA.debugLineNum = 109117441;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=109117442;
 //BA.debugLineNum = 109117442;BA.debugLine="ID = ID.trim";
__ref._id /*String*/  = __ref._id /*String*/ .trim();
RDebugUtils.currentLine=109117443;
 //BA.debugLineNum = 109117443;BA.debugLine="Element.Initialize(ID,\"div\")";
__ref._element /*b4j.example.vuehtml*/ ._initialize /*b4j.example.vuehtml*/ (null,ba,__ref._id /*String*/ ,"div");
RDebugUtils.currentLine=109117444;
 //BA.debugLineNum = 109117444;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=109117445;
 //BA.debugLineNum = 109117445;BA.debugLine="hasContent = False";
__ref._hascontent /*boolean*/  = __c.False;
RDebugUtils.currentLine=109117446;
 //BA.debugLineNum = 109117446;BA.debugLine="SetRef(ID)";
__ref._setref /*b4j.example.vmelement*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=109117447;
 //BA.debugLineNum = 109117447;BA.debugLine="showKey = $\"${ID}show\"$";
__ref._showkey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"show");
RDebugUtils.currentLine=109117448;
 //BA.debugLineNum = 109117448;BA.debugLine="disKey = $\"${ID}disabled\"$";
__ref._diskey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"disabled");
RDebugUtils.currentLine=109117449;
 //BA.debugLineNum = 109117449;BA.debugLine="reqKey = $\"${ID}required\"$";
__ref._reqkey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"required");
RDebugUtils.currentLine=109117450;
 //BA.debugLineNum = 109117450;BA.debugLine="errKey = $\"${ID}error\"$";
__ref._errkey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"error");
RDebugUtils.currentLine=109117451;
 //BA.debugLineNum = 109117451;BA.debugLine="vue.SetStateSingle(showKey, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._showkey /*String*/ ,(Object)(__c.True));
RDebugUtils.currentLine=109117452;
 //BA.debugLineNum = 109117452;BA.debugLine="vue.SetStateSingle(disKey, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._diskey /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=109117453;
 //BA.debugLineNum = 109117453;BA.debugLine="vue.SetStateSingle(reqKey, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._reqkey /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=109117454;
 //BA.debugLineNum = 109117454;BA.debugLine="vue.SetStateSingle(errKey, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._errkey /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=109117456;
 //BA.debugLineNum = 109117456;BA.debugLine="SetRequired(False)";
__ref._setrequired /*b4j.example.vmelement*/ (null,__c.False);
RDebugUtils.currentLine=109117457;
 //BA.debugLineNum = 109117457;BA.debugLine="SetVShow(showKey)";
__ref._setvshow /*b4j.example.vmelement*/ (null,__ref._showkey /*String*/ );
RDebugUtils.currentLine=109117458;
 //BA.debugLineNum = 109117458;BA.debugLine="SetDisabled(False)";
__ref._setdisabled /*b4j.example.vmelement*/ (null,__c.False);
RDebugUtils.currentLine=109117459;
 //BA.debugLineNum = 109117459;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109117460;
 //BA.debugLineNum = 109117460;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settag(b4j.example.vmelement __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settag", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settag", new Object[] {_t}));}
RDebugUtils.currentLine=117047296;
 //BA.debugLineNum = 117047296;BA.debugLine="Sub SetTag(t As String) As VMElement";
RDebugUtils.currentLine=117047297;
 //BA.debugLineNum = 117047297;BA.debugLine="Element.SetTag(t)";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,_t);
RDebugUtils.currentLine=117047298;
 //BA.debugLineNum = 117047298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117047299;
 //BA.debugLineNum = 117047299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setstyle(b4j.example.vmelement __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=112984064;
 //BA.debugLineNum = 112984064;BA.debugLine="Sub SetStyle(m As Map) As VMElement";
RDebugUtils.currentLine=112984065;
 //BA.debugLineNum = 112984065;BA.debugLine="Element.SetStyles(m)";
__ref._element /*b4j.example.vuehtml*/ ._setstyles /*b4j.example.vuehtml*/ (null,_m);
RDebugUtils.currentLine=112984066;
 //BA.debugLineNum = 112984066;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112984067;
 //BA.debugLineNum = 112984067;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbody1(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setbody1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setbody1", new Object[] {_b}));}
RDebugUtils.currentLine=116457472;
 //BA.debugLineNum = 116457472;BA.debugLine="Sub SetBody1(b As Boolean) As VMElement";
RDebugUtils.currentLine=116457473;
 //BA.debugLineNum = 116457473;BA.debugLine="Element.AddClass(\"md-body-1\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-body-1");
RDebugUtils.currentLine=116457474;
 //BA.debugLineNum = 116457474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116457475;
 //BA.debugLineNum = 116457475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbody2(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setbody2", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setbody2", new Object[] {_b}));}
RDebugUtils.currentLine=116391936;
 //BA.debugLineNum = 116391936;BA.debugLine="Sub SetBody2(b As Boolean) As VMElement";
RDebugUtils.currentLine=116391937;
 //BA.debugLineNum = 116391937;BA.debugLine="Element.AddClass(\"md-body-2\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-body-2");
RDebugUtils.currentLine=116391938;
 //BA.debugLineNum = 116391938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116391939;
 //BA.debugLineNum = 116391939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addclass(b4j.example.vmelement __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=112721920;
 //BA.debugLineNum = 112721920;BA.debugLine="Sub AddClass(c As String) As VMElement";
RDebugUtils.currentLine=112721921;
 //BA.debugLineNum = 112721921;BA.debugLine="Element.AddClass(c)";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,_c);
RDebugUtils.currentLine=112721922;
 //BA.debugLineNum = 112721922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112721923;
 //BA.debugLineNum = 112721923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisplay1(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdisplay1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdisplay1", new Object[] {_b}));}
RDebugUtils.currentLine=115015680;
 //BA.debugLineNum = 115015680;BA.debugLine="Sub SetDisplay1(b As Boolean) As VMElement";
RDebugUtils.currentLine=115015681;
 //BA.debugLineNum = 115015681;BA.debugLine="Element.AddClass(\"md-display-1\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-display-1");
RDebugUtils.currentLine=115015682;
 //BA.debugLineNum = 115015682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115015683;
 //BA.debugLineNum = 115015683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisplay2(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdisplay2", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdisplay2", new Object[] {_b}));}
RDebugUtils.currentLine=114950144;
 //BA.debugLineNum = 114950144;BA.debugLine="Sub SetDisplay2(b As Boolean) As VMElement";
RDebugUtils.currentLine=114950145;
 //BA.debugLineNum = 114950145;BA.debugLine="Element.AddClass(\"md-display-2\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-display-2");
RDebugUtils.currentLine=114950146;
 //BA.debugLineNum = 114950146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114950147;
 //BA.debugLineNum = 114950147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisplay3(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdisplay3", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdisplay3", new Object[] {_b}));}
RDebugUtils.currentLine=114884608;
 //BA.debugLineNum = 114884608;BA.debugLine="Sub SetDisplay3(b As Boolean) As VMElement";
RDebugUtils.currentLine=114884609;
 //BA.debugLineNum = 114884609;BA.debugLine="Element.AddClass(\"md-display-3\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-display-3");
RDebugUtils.currentLine=114884610;
 //BA.debugLineNum = 114884610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114884611;
 //BA.debugLineNum = 114884611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisplay4(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdisplay4", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdisplay4", new Object[] {_b}));}
RDebugUtils.currentLine=114819072;
 //BA.debugLineNum = 114819072;BA.debugLine="Sub SetDisplay4(b As Boolean) As VMElement";
RDebugUtils.currentLine=114819073;
 //BA.debugLineNum = 114819073;BA.debugLine="Element.AddClass(\"md-display-4\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-display-4");
RDebugUtils.currentLine=114819074;
 //BA.debugLineNum = 114819074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114819075;
 //BA.debugLineNum = 114819075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setheadline(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setheadline", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setheadline", new Object[] {_b}));}
RDebugUtils.currentLine=115081216;
 //BA.debugLineNum = 115081216;BA.debugLine="Sub SetHeadline(b As Boolean) As VMElement";
RDebugUtils.currentLine=115081217;
 //BA.debugLineNum = 115081217;BA.debugLine="Element.AddClass(\"md-headline\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-headline");
RDebugUtils.currentLine=115081218;
 //BA.debugLineNum = 115081218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115081219;
 //BA.debugLineNum = 115081219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlayout(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setlayout", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setlayout", new Object[] {_b}));}
RDebugUtils.currentLine=117374976;
 //BA.debugLineNum = 117374976;BA.debugLine="Sub SetLayout(b As Boolean) As VMElement";
RDebugUtils.currentLine=117374977;
 //BA.debugLineNum = 117374977;BA.debugLine="Element.AddClass(\"md-layout\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-layout");
RDebugUtils.currentLine=117374978;
 //BA.debugLineNum = 117374978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117374979;
 //BA.debugLineNum = 117374979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlayoutitem(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setlayoutitem", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setlayoutitem", new Object[] {_b}));}
RDebugUtils.currentLine=117440512;
 //BA.debugLineNum = 117440512;BA.debugLine="Sub SetLayoutItem(b As Boolean) As VMElement";
RDebugUtils.currentLine=117440513;
 //BA.debugLineNum = 117440513;BA.debugLine="Element.AddClass(\"md-layout-item\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-layout-item");
RDebugUtils.currentLine=117440514;
 //BA.debugLineNum = 117440514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117440515;
 //BA.debugLineNum = 117440515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsubhead(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setsubhead", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setsubhead", new Object[] {_b}));}
RDebugUtils.currentLine=116260864;
 //BA.debugLineNum = 116260864;BA.debugLine="Sub SetSubHead(b As Boolean) As VMElement";
RDebugUtils.currentLine=116260865;
 //BA.debugLineNum = 116260865;BA.debugLine="Element.AddClass(\"md-subhead\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-subhead");
RDebugUtils.currentLine=116260866;
 //BA.debugLineNum = 116260866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116260867;
 //BA.debugLineNum = 116260867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagsubheader(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settagsubheader", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settagsubheader", new Object[] {_b}));}
RDebugUtils.currentLine=116326400;
 //BA.debugLineNum = 116326400;BA.debugLine="Sub SetTagSubHeader(b As Boolean) As VMElement";
RDebugUtils.currentLine=116326401;
 //BA.debugLineNum = 116326401;BA.debugLine="Element.SetTag(\"md-subheader\")";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,"md-subheader");
RDebugUtils.currentLine=116326402;
 //BA.debugLineNum = 116326402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116326403;
 //BA.debugLineNum = 116326403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsubheading(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setsubheading", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setsubheading", new Object[] {_b}));}
RDebugUtils.currentLine=116195328;
 //BA.debugLineNum = 116195328;BA.debugLine="Sub SetSubHeading(b As Boolean) As VMElement";
RDebugUtils.currentLine=116195329;
 //BA.debugLineNum = 116195329;BA.debugLine="Element.AddClass(\"md-subheading\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-subheading");
RDebugUtils.currentLine=116195330;
 //BA.debugLineNum = 116195330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116195331;
 //BA.debugLineNum = 116195331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattr1(b4j.example.vmelement __ref,String _attr,Object _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setattr1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setattr1", new Object[] {_attr,_val}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=109707264;
 //BA.debugLineNum = 109707264;BA.debugLine="Sub SetAttr1(attr As String, val As Object) As VME";
RDebugUtils.currentLine=109707265;
 //BA.debugLineNum = 109707265;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=109707266;
 //BA.debugLineNum = 109707266;BA.debugLine="opt.Put(attr, val)";
_opt.Put((Object)(_attr),_val);
RDebugUtils.currentLine=109707267;
 //BA.debugLineNum = 109707267;BA.debugLine="SetAttr(opt)";
__ref._setattr /*b4j.example.vmelement*/ (null,_opt);
RDebugUtils.currentLine=109707268;
 //BA.debugLineNum = 109707268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109707269;
 //BA.debugLineNum = 109707269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbackgroundimage(b4j.example.vmelement __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setbackgroundimage", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setbackgroundimage", new Object[] {_url}));}
RDebugUtils.currentLine=114688000;
 //BA.debugLineNum = 114688000;BA.debugLine="Sub SetBackgroundImage(url As String) As VMElement";
RDebugUtils.currentLine=114688001;
 //BA.debugLineNum = 114688001;BA.debugLine="Element.SetStyle(\"background-image\", $\"url('${url";
__ref._element /*b4j.example.vuehtml*/ ._setstyle /*b4j.example.vuehtml*/ (null,"background-image",("url('"+__c.SmartStringFormatter("",(Object)(_url))+"')"));
RDebugUtils.currentLine=114688002;
 //BA.debugLineNum = 114688002;BA.debugLine="Element.SetStyle(\"background-size\", \"100% 100%\")";
__ref._element /*b4j.example.vuehtml*/ ._setstyle /*b4j.example.vuehtml*/ (null,"background-size","100% 100%");
RDebugUtils.currentLine=114688003;
 //BA.debugLineNum = 114688003;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114688004;
 //BA.debugLineNum = 114688004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattr(b4j.example.vmelement __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setattr", new Object[] {_m}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=114556928;
 //BA.debugLineNum = 114556928;BA.debugLine="Sub SetAttr(m As Map) As VMElement";
RDebugUtils.currentLine=114556929;
 //BA.debugLineNum = 114556929;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=114556930;
 //BA.debugLineNum = 114556930;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=114556931;
 //BA.debugLineNum = 114556931;BA.debugLine="Element.SetAttr(k, v)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,_k,BA.ObjectToString(_v));
 }
};
RDebugUtils.currentLine=114556933;
 //BA.debugLineNum = 114556933;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114556934;
 //BA.debugLineNum = 114556934;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setactivesync(b4j.example.vmelement __ref,String _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setactivesync", new Object[] {_a}));}
anywheresoftware.b4a.objects.collections.Map _state = null;
RDebugUtils.currentLine=113836032;
 //BA.debugLineNum = 113836032;BA.debugLine="Sub SetActiveSync(a As String) As VMElement";
RDebugUtils.currentLine=113836033;
 //BA.debugLineNum = 113836033;BA.debugLine="a = a.tolowercase";
_a = _a.toLowerCase();
RDebugUtils.currentLine=113836034;
 //BA.debugLineNum = 113836034;BA.debugLine="Element.SetAttr(\":md-active.sync\", a)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,":md-active.sync",_a);
RDebugUtils.currentLine=113836035;
 //BA.debugLineNum = 113836035;BA.debugLine="Dim state As Map = CreateMap()";
_state = new anywheresoftware.b4a.objects.collections.Map();
_state = __c.createMap(new Object[] {});
RDebugUtils.currentLine=113836036;
 //BA.debugLineNum = 113836036;BA.debugLine="state.Put(a, False)";
_state.Put((Object)(_a),(Object)(__c.False));
RDebugUtils.currentLine=113836037;
 //BA.debugLineNum = 113836037;BA.debugLine="vue.SetState(state)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_state);
RDebugUtils.currentLine=113836038;
 //BA.debugLineNum = 113836038;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113836039;
 //BA.debugLineNum = 113836039;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setalt(b4j.example.vmelement __ref,String _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setalt", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setalt", new Object[] {_a}));}
RDebugUtils.currentLine=115408896;
 //BA.debugLineNum = 115408896;BA.debugLine="Sub SetAlt(a As String) As VMElement";
RDebugUtils.currentLine=115408897;
 //BA.debugLineNum = 115408897;BA.debugLine="Element.SetAlt(a)";
__ref._element /*b4j.example.vuehtml*/ ._setalt /*b4j.example.vuehtml*/ (null,_a);
RDebugUtils.currentLine=115408898;
 //BA.debugLineNum = 115408898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115408899;
 //BA.debugLineNum = 115408899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisabled(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=114098176;
 //BA.debugLineNum = 114098176;BA.debugLine="Sub SetDisabled(b As Boolean) As VMElement";
RDebugUtils.currentLine=114098177;
 //BA.debugLineNum = 114098177;BA.debugLine="vue.SetStatesingle(disKey, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._diskey /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=114098178;
 //BA.debugLineNum = 114098178;BA.debugLine="Element.SetAttr(\":disabled\", disKey)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,":disabled",__ref._diskey /*String*/ );
RDebugUtils.currentLine=114098179;
 //BA.debugLineNum = 114098179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114098180;
 //BA.debugLineNum = 114098180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setelevation(b4j.example.vmelement __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=116064256;
 //BA.debugLineNum = 116064256;BA.debugLine="Sub SetElevation(e As Int) As VMElement";
RDebugUtils.currentLine=116064257;
 //BA.debugLineNum = 116064257;BA.debugLine="Element.addclass($\"md-elevation-${e}\"$)";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,("md-elevation-"+__c.SmartStringFormatter("",(Object)(_e))+""));
RDebugUtils.currentLine=116064258;
 //BA.debugLineNum = 116064258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116064259;
 //BA.debugLineNum = 116064259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsrc(b4j.example.vmelement __ref,String _s,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setsrc", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setsrc", new Object[] {_s,_bind}));}
RDebugUtils.currentLine=115343360;
 //BA.debugLineNum = 115343360;BA.debugLine="Sub SetSRC(s As String, bind As Boolean) As VMElem";
RDebugUtils.currentLine=115343361;
 //BA.debugLineNum = 115343361;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=115343362;
 //BA.debugLineNum = 115343362;BA.debugLine="SetAttr(CreateMap(\":src\":s))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":src"),(Object)(_s)}));
 }else {
RDebugUtils.currentLine=115343364;
 //BA.debugLineNum = 115343364;BA.debugLine="SetAttr(CreateMap(\"src\":s))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("src"),(Object)(_s)}));
 };
RDebugUtils.currentLine=115343366;
 //BA.debugLineNum = 115343366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115343367;
 //BA.debugLineNum = 115343367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvshow(b4j.example.vmelement __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=112525312;
 //BA.debugLineNum = 112525312;BA.debugLine="Sub SetVShow(vif As String) As VMElement";
RDebugUtils.currentLine=112525313;
 //BA.debugLineNum = 112525313;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
RDebugUtils.currentLine=112525314;
 //BA.debugLineNum = 112525314;BA.debugLine="If vue.HasState(vif) = False Then vue.SetStateFal";
if (__ref._vue /*b4j.example.bananovue*/ ._hasstate /*boolean*/ (null,_vif)==__c.False) { 
__ref._vue /*b4j.example.bananovue*/ ._setstatefalse /*b4j.example.bananovue*/ (null,_vif);};
RDebugUtils.currentLine=112525315;
 //BA.debugLineNum = 112525315;BA.debugLine="Element.SetVShow(vif)";
__ref._element /*b4j.example.vuehtml*/ ._setvshow /*b4j.example.vuehtml*/ (null,(Object)(_vif));
RDebugUtils.currentLine=112525316;
 //BA.debugLineNum = 112525316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112525317;
 //BA.debugLineNum = 112525317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setaccent(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=114229248;
 //BA.debugLineNum = 114229248;BA.debugLine="Sub SetAccent(b As Boolean) As VMElement";
RDebugUtils.currentLine=114229249;
 //BA.debugLineNum = 114229249;BA.debugLine="Element.AddClass(\"md-accent\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-accent");
RDebugUtils.currentLine=114229250;
 //BA.debugLineNum = 114229250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114229251;
 //BA.debugLineNum = 114229251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpaddingall(b4j.example.vmelement __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setpaddingall", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setpaddingall", new Object[] {_p}));}
RDebugUtils.currentLine=113311744;
 //BA.debugLineNum = 113311744;BA.debugLine="Sub SetPaddingAll(p As Object) As VMElement";
RDebugUtils.currentLine=113311745;
 //BA.debugLineNum = 113311745;BA.debugLine="SetStyle(CreateMap(\"padding\":p))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("padding"),_p}));
RDebugUtils.currentLine=113311746;
 //BA.debugLineNum = 113311746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113311747;
 //BA.debugLineNum = 113311747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setprimary(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=116129792;
 //BA.debugLineNum = 116129792;BA.debugLine="Sub SetPrimary(b As Boolean) As VMElement";
RDebugUtils.currentLine=116129793;
 //BA.debugLineNum = 116129793;BA.debugLine="Element.AddClass(\"md-primary\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-primary");
RDebugUtils.currentLine=116129794;
 //BA.debugLineNum = 116129794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116129795;
 //BA.debugLineNum = 116129795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvmodel(b4j.example.vmelement __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=116981760;
 //BA.debugLineNum = 116981760;BA.debugLine="Sub SetVModel(k As String) As VMElement";
RDebugUtils.currentLine=116981761;
 //BA.debugLineNum = 116981761;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=116981762;
 //BA.debugLineNum = 116981762;BA.debugLine="If vue.HasState(k) = False Then";
if (__ref._vue /*b4j.example.bananovue*/ ._hasstate /*boolean*/ (null,_k)==__c.False) { 
RDebugUtils.currentLine=116981763;
 //BA.debugLineNum = 116981763;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=116981764;
 //BA.debugLineNum = 116981764;BA.debugLine="opt.Put(k, Null)";
_opt.Put((Object)(_k),__c.Null);
RDebugUtils.currentLine=116981765;
 //BA.debugLineNum = 116981765;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
 };
RDebugUtils.currentLine=116981767;
 //BA.debugLineNum = 116981767;BA.debugLine="Element.SetAttr(\"v-model\", k)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"v-model",_k);
RDebugUtils.currentLine=116981768;
 //BA.debugLineNum = 116981768;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116981769;
 //BA.debugLineNum = 116981769;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvif(b4j.example.vmelement __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=112459776;
 //BA.debugLineNum = 112459776;BA.debugLine="Sub SetVIf(vif As String) As VMElement";
RDebugUtils.currentLine=112459777;
 //BA.debugLineNum = 112459777;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
RDebugUtils.currentLine=112459778;
 //BA.debugLineNum = 112459778;BA.debugLine="If vue.HasState(vif) = False Then vue.SetStateFal";
if (__ref._vue /*b4j.example.bananovue*/ ._hasstate /*boolean*/ (null,_vif)==__c.False) { 
__ref._vue /*b4j.example.bananovue*/ ._setstatefalse /*b4j.example.bananovue*/ (null,_vif);};
RDebugUtils.currentLine=112459779;
 //BA.debugLineNum = 112459779;BA.debugLine="Element.SetVIf(vif)";
__ref._element /*b4j.example.vuehtml*/ ._setvif /*b4j.example.vuehtml*/ (null,(Object)(_vif));
RDebugUtils.currentLine=112459780;
 //BA.debugLineNum = 112459780;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112459781;
 //BA.debugLineNum = 112459781;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonclick(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setonclick", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118161408;
 //BA.debugLineNum = 118161408;BA.debugLine="Sub SetOnClick(module As Object, methodName As Str";
RDebugUtils.currentLine=118161409;
 //BA.debugLineNum = 118161409;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118161410;
 //BA.debugLineNum = 118161410;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118161411;
 //BA.debugLineNum = 118161411;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118161412;
 //BA.debugLineNum = 118161412;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118161413;
 //BA.debugLineNum = 118161413;BA.debugLine="SetAttr(CreateMap(\"v-on:click\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:click"),(Object)(_methodname)}));
RDebugUtils.currentLine=118161415;
 //BA.debugLineNum = 118161415;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118161416;
 //BA.debugLineNum = 118161416;BA.debugLine="SetPointer(True)";
__ref._setpointer /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=118161417;
 //BA.debugLineNum = 118161417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118161418;
 //BA.debugLineNum = 118161418;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setexact(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setexact", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setexact", new Object[] {_b}));}
RDebugUtils.currentLine=111083520;
 //BA.debugLineNum = 111083520;BA.debugLine="Sub SetExact(b As Boolean) As VMElement";
RDebugUtils.currentLine=111083521;
 //BA.debugLineNum = 111083521;BA.debugLine="If b Then SetAttr(CreateMap(\"exact\": b))";
if (_b) { 
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("exact"),(Object)(_b)}));};
RDebugUtils.currentLine=111083522;
 //BA.debugLineNum = 111083522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111083523;
 //BA.debugLineNum = 111083523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setto(b4j.example.vmelement __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setto", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setto", new Object[] {_t}));}
RDebugUtils.currentLine=113901568;
 //BA.debugLineNum = 113901568;BA.debugLine="Sub SetTo(t As Object) As VMElement";
RDebugUtils.currentLine=113901569;
 //BA.debugLineNum = 113901569;BA.debugLine="Element.SetAttr(\"to\", t)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"to",BA.ObjectToString(_t));
RDebugUtils.currentLine=113901570;
 //BA.debugLineNum = 113901570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113901571;
 //BA.debugLineNum = 113901571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _hide(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=109510656;
 //BA.debugLineNum = 109510656;BA.debugLine="Sub Hide As VMElement";
RDebugUtils.currentLine=109510657;
 //BA.debugLineNum = 109510657;BA.debugLine="vue.SetStateSingle(showKey, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._showkey /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=109510658;
 //BA.debugLineNum = 109510658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109510659;
 //BA.debugLineNum = 109510659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _removeattr(b4j.example.vmelement __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "removeattr", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "removeattr", new Object[] {_sname}));}
RDebugUtils.currentLine=112328704;
 //BA.debugLineNum = 112328704;BA.debugLine="public Sub RemoveAttr(sName As String) As VMElemen";
RDebugUtils.currentLine=112328705;
 //BA.debugLineNum = 112328705;BA.debugLine="Element.RemoveAttr(sName)";
__ref._element /*b4j.example.vuehtml*/ ._removeattr /*b4j.example.vuehtml*/ (null,_sname);
RDebugUtils.currentLine=112328706;
 //BA.debugLineNum = 112328706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112328707;
 //BA.debugLineNum = 112328707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdense(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdense", new Object[] {_b}));}
RDebugUtils.currentLine=113967104;
 //BA.debugLineNum = 113967104;BA.debugLine="Sub SetDense(b As Boolean) As VMElement";
RDebugUtils.currentLine=113967105;
 //BA.debugLineNum = 113967105;BA.debugLine="Element.AddClass(\"md-dense\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-dense");
RDebugUtils.currentLine=113967106;
 //BA.debugLineNum = 113967106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113967107;
 //BA.debugLineNum = 113967107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _sethref(b4j.example.vmelement __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "sethref", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "sethref", new Object[] {_h}));}
RDebugUtils.currentLine=114032640;
 //BA.debugLineNum = 114032640;BA.debugLine="Sub SetHREF(h As String) As VMElement";
RDebugUtils.currentLine=114032641;
 //BA.debugLineNum = 114032641;BA.debugLine="Element.SetAttrHREF(h)";
__ref._element /*b4j.example.vuehtml*/ ._setattrhref /*b4j.example.vuehtml*/ (null,_h);
RDebugUtils.currentLine=114032642;
 //BA.debugLineNum = 114032642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114032643;
 //BA.debugLineNum = 114032643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagicon(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settagicon", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settagicon", new Object[] {_b}));}
RDebugUtils.currentLine=115802112;
 //BA.debugLineNum = 115802112;BA.debugLine="Sub SetTagIcon(b As Boolean) As VMElement";
RDebugUtils.currentLine=115802113;
 //BA.debugLineNum = 115802113;BA.debugLine="Element.SetTag(\"md-icon\")";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,"md-icon");
RDebugUtils.currentLine=115802114;
 //BA.debugLineNum = 115802114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115802115;
 //BA.debugLineNum = 115802115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setid(b4j.example.vmelement __ref,String _n,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setid", new Object[] {_n,_bind}));}
RDebugUtils.currentLine=112394240;
 //BA.debugLineNum = 112394240;BA.debugLine="Sub SetID(n As String, bind As Boolean) As VMEleme";
RDebugUtils.currentLine=112394241;
 //BA.debugLineNum = 112394241;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=112394242;
 //BA.debugLineNum = 112394242;BA.debugLine="RemoveAttr(\"id\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,"id");
RDebugUtils.currentLine=112394243;
 //BA.debugLineNum = 112394243;BA.debugLine="SetAttr(CreateMap(\":id\": n))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":id"),(Object)(_n)}));
 }else {
RDebugUtils.currentLine=112394245;
 //BA.debugLineNum = 112394245;BA.debugLine="RemoveAttr(\":id\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,":id");
RDebugUtils.currentLine=112394246;
 //BA.debugLineNum = 112394246;BA.debugLine="SetAttr(CreateMap(\"id\": n))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("id"),(Object)(_n)}));
 };
RDebugUtils.currentLine=112394248;
 //BA.debugLineNum = 112394248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112394249;
 //BA.debugLineNum = 112394249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setkey(b4j.example.vmelement __ref,Object _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=111280128;
 //BA.debugLineNum = 111280128;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VMElem";
RDebugUtils.currentLine=111280129;
 //BA.debugLineNum = 111280129;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=111280130;
 //BA.debugLineNum = 111280130;BA.debugLine="RemoveAttr(\"key\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,"key");
RDebugUtils.currentLine=111280131;
 //BA.debugLineNum = 111280131;BA.debugLine="Element.SetAttr(\":key\", k)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,":key",BA.ObjectToString(_k));
 }else {
RDebugUtils.currentLine=111280133;
 //BA.debugLineNum = 111280133;BA.debugLine="RemoveAttr(\":key\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,":key");
RDebugUtils.currentLine=111280134;
 //BA.debugLineNum = 111280134;BA.debugLine="Element.SetAttr(\"key\", k)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"key",BA.ObjectToString(_k));
 };
RDebugUtils.currentLine=111280136;
 //BA.debugLineNum = 111280136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111280137;
 //BA.debugLineNum = 111280137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlistaction(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setlistaction", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setlistaction", new Object[] {_b}));}
RDebugUtils.currentLine=115736576;
 //BA.debugLineNum = 115736576;BA.debugLine="Sub SetListAction(b As Boolean) As VMElement";
RDebugUtils.currentLine=115736577;
 //BA.debugLineNum = 115736577;BA.debugLine="Element.AddClass(\"md-list-action\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-list-action");
RDebugUtils.currentLine=115736578;
 //BA.debugLineNum = 115736578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115736579;
 //BA.debugLineNum = 115736579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setname(b4j.example.vmelement __ref,String _n,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setname", new Object[] {_n,_bind}));}
RDebugUtils.currentLine=112263168;
 //BA.debugLineNum = 112263168;BA.debugLine="Sub SetName(n As String, bind As Boolean) As VMEle";
RDebugUtils.currentLine=112263169;
 //BA.debugLineNum = 112263169;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=112263170;
 //BA.debugLineNum = 112263170;BA.debugLine="RemoveAttr(\"name\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,"name");
RDebugUtils.currentLine=112263171;
 //BA.debugLineNum = 112263171;BA.debugLine="SetAttr(CreateMap(\":name\": n))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":name"),(Object)(_n)}));
 }else {
RDebugUtils.currentLine=112263173;
 //BA.debugLineNum = 112263173;BA.debugLine="RemoveAttr(\":name\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,":name");
RDebugUtils.currentLine=112263174;
 //BA.debugLineNum = 112263174;BA.debugLine="SetAttr(CreateMap(\"name\": n))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("name"),(Object)(_n)}));
 };
RDebugUtils.currentLine=112263176;
 //BA.debugLineNum = 112263176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112263177;
 //BA.debugLineNum = 112263177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setripple(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setripple", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setripple", new Object[] {_b}));}
RDebugUtils.currentLine=114294784;
 //BA.debugLineNum = 114294784;BA.debugLine="Sub SetRipple(b As Boolean) As VMElement";
RDebugUtils.currentLine=114294785;
 //BA.debugLineNum = 114294785;BA.debugLine="Element.SetAttr(\":md-ripple\", b)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,":md-ripple",BA.ObjectToString(_b));
RDebugUtils.currentLine=114294786;
 //BA.debugLineNum = 114294786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114294787;
 //BA.debugLineNum = 114294787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settabindex(b4j.example.vmelement __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=110034944;
 //BA.debugLineNum = 110034944;BA.debugLine="Sub SetTabIndex(ti As String) As VMElement";
RDebugUtils.currentLine=110034945;
 //BA.debugLineNum = 110034945;BA.debugLine="Element.SetTabIndex(ti)";
__ref._element /*b4j.example.vuehtml*/ ._settabindex /*b4j.example.vuehtml*/ (null,_ti);
RDebugUtils.currentLine=110034946;
 //BA.debugLineNum = 110034946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110034947;
 //BA.debugLineNum = 110034947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _show(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=109445120;
 //BA.debugLineNum = 109445120;BA.debugLine="Sub Show As VMElement";
RDebugUtils.currentLine=109445121;
 //BA.debugLineNum = 109445121;BA.debugLine="vue.SetStateSingle(showKey, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._showkey /*String*/ ,(Object)(__c.True));
RDebugUtils.currentLine=109445122;
 //BA.debugLineNum = 109445122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109445123;
 //BA.debugLineNum = 109445123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settitle(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settitle", new Object[] {_b}));}
RDebugUtils.currentLine=115146752;
 //BA.debugLineNum = 115146752;BA.debugLine="Sub SetTitle(b As Boolean) As VMElement";
RDebugUtils.currentLine=115146753;
 //BA.debugLineNum = 115146753;BA.debugLine="Element.AddClass(\"md-title\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-title");
RDebugUtils.currentLine=115146754;
 //BA.debugLineNum = 115146754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115146755;
 //BA.debugLineNum = 115146755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvalue(b4j.example.vmelement __ref,String _valuename,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvalue", new Object[] {_valuename,_bind}));}
RDebugUtils.currentLine=112001024;
 //BA.debugLineNum = 112001024;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
RDebugUtils.currentLine=112001025;
 //BA.debugLineNum = 112001025;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=112001026;
 //BA.debugLineNum = 112001026;BA.debugLine="RemoveAttr(\"value\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,"value");
RDebugUtils.currentLine=112001027;
 //BA.debugLineNum = 112001027;BA.debugLine="valueName = valueName.tolowercase";
_valuename = _valuename.toLowerCase();
RDebugUtils.currentLine=112001028;
 //BA.debugLineNum = 112001028;BA.debugLine="SetAttr(CreateMap(\":value\":valueName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":value"),(Object)(_valuename)}));
 }else {
RDebugUtils.currentLine=112001030;
 //BA.debugLineNum = 112001030;BA.debugLine="RemoveAttr(\":value\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,":value");
RDebugUtils.currentLine=112001031;
 //BA.debugLineNum = 112001031;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("value"),(Object)(_valuename)}));
 };
RDebugUtils.currentLine=112001033;
 //BA.debugLineNum = 112001033;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112001034;
 //BA.debugLineNum = 112001034;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _clear(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=110690304;
 //BA.debugLineNum = 110690304;BA.debugLine="Sub Clear As VMElement";
RDebugUtils.currentLine=110690305;
 //BA.debugLineNum = 110690305;BA.debugLine="Element.clear";
__ref._element /*b4j.example.vuehtml*/ ._clear /*b4j.example.vuehtml*/ (null);
RDebugUtils.currentLine=110690306;
 //BA.debugLineNum = 110690306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110690307;
 //BA.debugLineNum = 110690307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvfor(b4j.example.vmelement __ref,String _item,String _datasource) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvfor", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvfor", new Object[] {_item,_datasource}));}
String _sline = "";
RDebugUtils.currentLine=111935488;
 //BA.debugLineNum = 111935488;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
RDebugUtils.currentLine=111935489;
 //BA.debugLineNum = 111935489;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
RDebugUtils.currentLine=111935490;
 //BA.debugLineNum = 111935490;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
RDebugUtils.currentLine=111935491;
 //BA.debugLineNum = 111935491;BA.debugLine="If vue.StateExists(dataSource) = False Then vue.S";
if (__ref._vue /*b4j.example.bananovue*/ ._stateexists /*boolean*/ (null,_datasource)==__c.False) { 
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_datasource,(Object)(new Object[]{}));};
RDebugUtils.currentLine=111935492;
 //BA.debugLineNum = 111935492;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
RDebugUtils.currentLine=111935493;
 //BA.debugLineNum = 111935493;BA.debugLine="SetAttr(CreateMap(\"v-for\": sline))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-for"),(Object)(_sline)}));
RDebugUtils.currentLine=111935494;
 //BA.debugLineNum = 111935494;BA.debugLine="RemoveAttr(\"ref\")";
__ref._removeattr /*b4j.example.vmelement*/ (null,"ref");
RDebugUtils.currentLine=111935495;
 //BA.debugLineNum = 111935495;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111935496;
 //BA.debugLineNum = 111935496;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _seterrortext(b4j.example.vmelement __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "seterrortext", new Object[] {_t}));}
String _errorshow = "";
b4j.example.vmelement _he = null;
RDebugUtils.currentLine=116850688;
 //BA.debugLineNum = 116850688;BA.debugLine="Sub SetErrorText(t As String) As VMElement";
RDebugUtils.currentLine=116850689;
 //BA.debugLineNum = 116850689;BA.debugLine="Dim errorShow As String = $\"${ID}error\"$";
_errorshow = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"error");
RDebugUtils.currentLine=116850690;
 //BA.debugLineNum = 116850690;BA.debugLine="Dim he As VMElement";
_he = new b4j.example.vmelement();
RDebugUtils.currentLine=116850691;
 //BA.debugLineNum = 116850691;BA.debugLine="he.Initialize(vue,$\"${ID}err\"$).SetTag(\"span\")";
_he._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"err"))._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=116850692;
 //BA.debugLineNum = 116850692;BA.debugLine="he.AddClass(\"md-error\")";
_he._addclass /*b4j.example.vmelement*/ (null,"md-error");
RDebugUtils.currentLine=116850693;
 //BA.debugLineNum = 116850693;BA.debugLine="he.SetText(t)";
_he._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=116850694;
 //BA.debugLineNum = 116850694;BA.debugLine="Return he";
if (true) return _he;
RDebugUtils.currentLine=116850695;
 //BA.debugLineNum = 116850695;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _sethelpertext(b4j.example.vmelement __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "sethelpertext", new Object[] {_t}));}
b4j.example.vmelement _ht = null;
RDebugUtils.currentLine=116785152;
 //BA.debugLineNum = 116785152;BA.debugLine="Sub SetHelperText(t As String) As VMElement";
RDebugUtils.currentLine=116785153;
 //BA.debugLineNum = 116785153;BA.debugLine="Dim ht As VMElement";
_ht = new b4j.example.vmelement();
RDebugUtils.currentLine=116785154;
 //BA.debugLineNum = 116785154;BA.debugLine="ht.Initialize(vue,$\"${ID}hlp\"$).SetTag(\"span\")";
_ht._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"hlp"))._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=116785155;
 //BA.debugLineNum = 116785155;BA.debugLine="ht.AddClass(\"md-helper-text\")";
_ht._addclass /*b4j.example.vmelement*/ (null,"md-helper-text");
RDebugUtils.currentLine=116785156;
 //BA.debugLineNum = 116785156;BA.debugLine="ht.SetText(t)";
_ht._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=116785157;
 //BA.debugLineNum = 116785157;BA.debugLine="Return ht";
if (true) return _ht;
RDebugUtils.currentLine=116785158;
 //BA.debugLineNum = 116785158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrequired(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setrequired", new Object[] {_b}));}
RDebugUtils.currentLine=114163712;
 //BA.debugLineNum = 114163712;BA.debugLine="Sub SetRequired(b As Boolean) As VMElement";
RDebugUtils.currentLine=114163713;
 //BA.debugLineNum = 114163713;BA.debugLine="vue.SetStateSingle(reqKey, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._reqkey /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=114163714;
 //BA.debugLineNum = 114163714;BA.debugLine="Element.SetAttr(\":required\", reqKey)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,":required",__ref._reqkey /*String*/ );
RDebugUtils.currentLine=114163715;
 //BA.debugLineNum = 114163715;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114163716;
 //BA.debugLineNum = 114163716;BA.debugLine="End Sub";
return null;
}
public String  _addelements(b4j.example.vmelement __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "addelements", true))
	 {return ((String) Debug.delegate(ba, "addelements", new Object[] {_lst}));}
b4j.example.vmelement _li = null;
RDebugUtils.currentLine=117112832;
 //BA.debugLineNum = 117112832;BA.debugLine="Sub AddElements(lst As List)";
RDebugUtils.currentLine=117112833;
 //BA.debugLineNum = 117112833;BA.debugLine="For Each li As VMElement In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_li = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=117112834;
 //BA.debugLineNum = 117112834;BA.debugLine="SetText(li.tostring)";
__ref._settext /*b4j.example.vmelement*/ (null,_li._tostring /*String*/ (null));
 }
};
RDebugUtils.currentLine=117112836;
 //BA.debugLineNum = 117112836;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _setgutter(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setgutter", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setgutter", new Object[] {_b}));}
RDebugUtils.currentLine=117309440;
 //BA.debugLineNum = 117309440;BA.debugLine="Sub SetGutter(b As Boolean) As VMElement";
RDebugUtils.currentLine=117309441;
 //BA.debugLineNum = 117309441;BA.debugLine="Element.AddClass(\"md-gutter\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-gutter");
RDebugUtils.currentLine=117309442;
 //BA.debugLineNum = 117309442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117309443;
 //BA.debugLineNum = 117309443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _sethidden(b4j.example.vmelement __ref,boolean _xsmall,boolean _small,boolean _medium,boolean _large,boolean _xlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "sethidden", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "sethidden", new Object[] {_xsmall,_small,_medium,_large,_xlarge}));}
anywheresoftware.b4a.objects.collections.List _sizes = null;
String _strsizes = "";
RDebugUtils.currentLine=116588544;
 //BA.debugLineNum = 116588544;BA.debugLine="Sub SetHidden(xsmall As Boolean, small As Boolean,";
RDebugUtils.currentLine=116588545;
 //BA.debugLineNum = 116588545;BA.debugLine="Dim sizes As List";
_sizes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116588546;
 //BA.debugLineNum = 116588546;BA.debugLine="sizes.Initialize";
_sizes.Initialize();
RDebugUtils.currentLine=116588548;
 //BA.debugLineNum = 116588548;BA.debugLine="If xsmall Then";
if (_xsmall) { 
RDebugUtils.currentLine=116588549;
 //BA.debugLineNum = 116588549;BA.debugLine="sizes.Add($\"md-xsmall-hide\"$)";
_sizes.Add((Object)(("md-xsmall-hide")));
 };
RDebugUtils.currentLine=116588552;
 //BA.debugLineNum = 116588552;BA.debugLine="If small Then";
if (_small) { 
RDebugUtils.currentLine=116588553;
 //BA.debugLineNum = 116588553;BA.debugLine="sizes.Add($\"md-small-hide\"$)";
_sizes.Add((Object)(("md-small-hide")));
 };
RDebugUtils.currentLine=116588556;
 //BA.debugLineNum = 116588556;BA.debugLine="If medium Then";
if (_medium) { 
RDebugUtils.currentLine=116588557;
 //BA.debugLineNum = 116588557;BA.debugLine="sizes.Add($\"md-medium-hide\"$)";
_sizes.Add((Object)(("md-medium-hide")));
 };
RDebugUtils.currentLine=116588560;
 //BA.debugLineNum = 116588560;BA.debugLine="If large Then";
if (_large) { 
RDebugUtils.currentLine=116588561;
 //BA.debugLineNum = 116588561;BA.debugLine="sizes.Add($\"md-large-hide\"$)";
_sizes.Add((Object)(("md-large-hide")));
 };
RDebugUtils.currentLine=116588564;
 //BA.debugLineNum = 116588564;BA.debugLine="If xlarge Then";
if (_xlarge) { 
RDebugUtils.currentLine=116588565;
 //BA.debugLineNum = 116588565;BA.debugLine="sizes.Add($\"md-xlarge-hide\"$)";
_sizes.Add((Object)(("md-xlarge-hide")));
 };
RDebugUtils.currentLine=116588568;
 //BA.debugLineNum = 116588568;BA.debugLine="Dim strSizes As String = Element.join(\" \", sizes)";
_strsizes = __ref._element /*b4j.example.vuehtml*/ ._join /*String*/ (null," ",_sizes);
RDebugUtils.currentLine=116588569;
 //BA.debugLineNum = 116588569;BA.debugLine="Element.AddClass(strSizes)";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,_strsizes);
RDebugUtils.currentLine=116588570;
 //BA.debugLineNum = 116588570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116588571;
 //BA.debugLineNum = 116588571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsizes(b4j.example.vmelement __ref,int _xsmall,int _small,int _medium,int _large,int _xlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setsizes", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setsizes", new Object[] {_xsmall,_small,_medium,_large,_xlarge}));}
anywheresoftware.b4a.objects.collections.List _sizes = null;
double _eachcell = 0;
String _eachsize = "";
double _xsmalld = 0;
double _smalld = 0;
double _mediumd = 0;
double _larged = 0;
double _xlarged = 0;
String _strsizes = "";
RDebugUtils.currentLine=116654080;
 //BA.debugLineNum = 116654080;BA.debugLine="Sub SetSizes(xsmall As Int, small As Int, medium A";
RDebugUtils.currentLine=116654081;
 //BA.debugLineNum = 116654081;BA.debugLine="Dim sizes As List";
_sizes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=116654082;
 //BA.debugLineNum = 116654082;BA.debugLine="sizes.Initialize";
_sizes.Initialize();
RDebugUtils.currentLine=116654083;
 //BA.debugLineNum = 116654083;BA.debugLine="Dim eachCell As Double = 8.33";
_eachcell = 8.33;
RDebugUtils.currentLine=116654084;
 //BA.debugLineNum = 116654084;BA.debugLine="Dim eachSize As String";
_eachsize = "";
RDebugUtils.currentLine=116654086;
 //BA.debugLineNum = 116654086;BA.debugLine="If xsmall > 0 Then";
if (_xsmall>0) { 
RDebugUtils.currentLine=116654087;
 //BA.debugLineNum = 116654087;BA.debugLine="Dim xsmallD As Double = xsmall * BANano.parseFlo";
_xsmalld = _xsmall*__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_eachcell));
RDebugUtils.currentLine=116654088;
 //BA.debugLineNum = 116654088;BA.debugLine="xsmallD = Round(BANano.parseFloat(xsmallD))";
_xsmalld = __c.Round(__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_xsmalld)));
RDebugUtils.currentLine=116654089;
 //BA.debugLineNum = 116654089;BA.debugLine="eachSize = 	$\"md-xsmall-size-${xsmallD}\"$";
_eachsize = ("md-xsmall-size-"+__c.SmartStringFormatter("",(Object)(_xsmalld))+"");
RDebugUtils.currentLine=116654090;
 //BA.debugLineNum = 116654090;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
RDebugUtils.currentLine=116654093;
 //BA.debugLineNum = 116654093;BA.debugLine="If small > 0 Then";
if (_small>0) { 
RDebugUtils.currentLine=116654094;
 //BA.debugLineNum = 116654094;BA.debugLine="Dim smallD As Double = small * BANano.parseFloat";
_smalld = _small*__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_eachcell));
RDebugUtils.currentLine=116654095;
 //BA.debugLineNum = 116654095;BA.debugLine="smallD = Round(BANano.parseFloat(smallD))";
_smalld = __c.Round(__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_smalld)));
RDebugUtils.currentLine=116654096;
 //BA.debugLineNum = 116654096;BA.debugLine="eachSize = 	$\"md-small-size-${smallD}\"$";
_eachsize = ("md-small-size-"+__c.SmartStringFormatter("",(Object)(_smalld))+"");
RDebugUtils.currentLine=116654097;
 //BA.debugLineNum = 116654097;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
RDebugUtils.currentLine=116654100;
 //BA.debugLineNum = 116654100;BA.debugLine="If medium > 0 Then";
if (_medium>0) { 
RDebugUtils.currentLine=116654101;
 //BA.debugLineNum = 116654101;BA.debugLine="Dim mediumD As Double = medium * BANano.parseFlo";
_mediumd = _medium*__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_eachcell));
RDebugUtils.currentLine=116654102;
 //BA.debugLineNum = 116654102;BA.debugLine="mediumD = Round(BANano.parseFloat(mediumD))";
_mediumd = __c.Round(__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_mediumd)));
RDebugUtils.currentLine=116654103;
 //BA.debugLineNum = 116654103;BA.debugLine="eachSize = 	$\"md-medium-size-${mediumD}\"$";
_eachsize = ("md-medium-size-"+__c.SmartStringFormatter("",(Object)(_mediumd))+"");
RDebugUtils.currentLine=116654104;
 //BA.debugLineNum = 116654104;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
RDebugUtils.currentLine=116654107;
 //BA.debugLineNum = 116654107;BA.debugLine="If large > 0 Then";
if (_large>0) { 
RDebugUtils.currentLine=116654108;
 //BA.debugLineNum = 116654108;BA.debugLine="Dim largeD As Double = large * BANano.parseFloat";
_larged = _large*__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_eachcell));
RDebugUtils.currentLine=116654109;
 //BA.debugLineNum = 116654109;BA.debugLine="largeD = Round(BANano.parseFloat(largeD))";
_larged = __c.Round(__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_larged)));
RDebugUtils.currentLine=116654110;
 //BA.debugLineNum = 116654110;BA.debugLine="eachSize = 	$\"md-large-size-${largeD}\"$";
_eachsize = ("md-large-size-"+__c.SmartStringFormatter("",(Object)(_larged))+"");
RDebugUtils.currentLine=116654111;
 //BA.debugLineNum = 116654111;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
RDebugUtils.currentLine=116654114;
 //BA.debugLineNum = 116654114;BA.debugLine="If xlarge > 0 Then";
if (_xlarge>0) { 
RDebugUtils.currentLine=116654115;
 //BA.debugLineNum = 116654115;BA.debugLine="Dim xlargeD As Double = xlarge * BANano.parseFlo";
_xlarged = _xlarge*__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_eachcell));
RDebugUtils.currentLine=116654116;
 //BA.debugLineNum = 116654116;BA.debugLine="xlargeD = Round(BANano.parseFloat(xlargeD))";
_xlarged = __c.Round(__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_xlarged)));
RDebugUtils.currentLine=116654117;
 //BA.debugLineNum = 116654117;BA.debugLine="eachSize = 	$\"md-xlarge-size-${xlargeD}\"$";
_eachsize = ("md-xlarge-size-"+__c.SmartStringFormatter("",(Object)(_xlarged))+"");
RDebugUtils.currentLine=116654118;
 //BA.debugLineNum = 116654118;BA.debugLine="sizes.Add(eachSize)";
_sizes.Add((Object)(_eachsize));
 };
RDebugUtils.currentLine=116654121;
 //BA.debugLineNum = 116654121;BA.debugLine="Dim strSizes As String = Element.join(\" \", sizes)";
_strsizes = __ref._element /*b4j.example.vuehtml*/ ._join /*String*/ (null," ",_sizes);
RDebugUtils.currentLine=116654122;
 //BA.debugLineNum = 116654122;BA.debugLine="Element.AddClass(strSizes)";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,_strsizes);
RDebugUtils.currentLine=116654123;
 //BA.debugLineNum = 116654123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116654124;
 //BA.debugLineNum = 116654124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonconfirm(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setonconfirm", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setonconfirm", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=117768192;
 //BA.debugLineNum = 117768192;BA.debugLine="Sub SetOnConfirm(module As Object, methodName As S";
RDebugUtils.currentLine=117768193;
 //BA.debugLineNum = 117768193;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=117768194;
 //BA.debugLineNum = 117768194;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=117768195;
 //BA.debugLineNum = 117768195;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=117768196;
 //BA.debugLineNum = 117768196;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=117768197;
 //BA.debugLineNum = 117768197;BA.debugLine="SetAttr(CreateMap(\"@md-confirm\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("@md-confirm"),(Object)(_methodname)}));
RDebugUtils.currentLine=117768199;
 //BA.debugLineNum = 117768199;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=117768200;
 //BA.debugLineNum = 117768200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117768201;
 //BA.debugLineNum = 117768201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setoncancel(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setoncancel", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setoncancel", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=117702656;
 //BA.debugLineNum = 117702656;BA.debugLine="Sub SetOnCancel(module As Object, methodName As St";
RDebugUtils.currentLine=117702657;
 //BA.debugLineNum = 117702657;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=117702658;
 //BA.debugLineNum = 117702658;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=117702659;
 //BA.debugLineNum = 117702659;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=117702660;
 //BA.debugLineNum = 117702660;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=117702661;
 //BA.debugLineNum = 117702661;BA.debugLine="SetAttr(CreateMap(\"@md-cancel\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("@md-cancel"),(Object)(_methodname)}));
RDebugUtils.currentLine=117702663;
 //BA.debugLineNum = 117702663;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=117702664;
 //BA.debugLineNum = 117702664;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117702665;
 //BA.debugLineNum = 117702665;BA.debugLine="End Sub";
return null;
}
public String  _addbr(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "addbr", true))
	 {return ((String) Debug.delegate(ba, "addbr", null));}
RDebugUtils.currentLine=112590848;
 //BA.debugLineNum = 112590848;BA.debugLine="Sub AddBR";
RDebugUtils.currentLine=112590849;
 //BA.debugLineNum = 112590849;BA.debugLine="SetText(\"<br>\")";
__ref._settext /*b4j.example.vmelement*/ (null,"<br>");
RDebugUtils.currentLine=112590850;
 //BA.debugLineNum = 112590850;BA.debugLine="End Sub";
return "";
}
public String  _addhr(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "addhr", true))
	 {return ((String) Debug.delegate(ba, "addhr", null));}
RDebugUtils.currentLine=112656384;
 //BA.debugLineNum = 112656384;BA.debugLine="Sub AddHR";
RDebugUtils.currentLine=112656385;
 //BA.debugLineNum = 112656385;BA.debugLine="SetText(\"<hr>\")";
__ref._settext /*b4j.example.vmelement*/ (null,"<hr>");
RDebugUtils.currentLine=112656386;
 //BA.debugLineNum = 112656386;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _setbackgroundcolor(b4j.example.vmelement __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_p}));}
RDebugUtils.currentLine=113180672;
 //BA.debugLineNum = 113180672;BA.debugLine="Sub SetBackgroundColor(p As Object) As VMElement";
RDebugUtils.currentLine=113180673;
 //BA.debugLineNum = 113180673;BA.debugLine="SetStyle(CreateMap(\"background-color\":p))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("background-color"),_p}));
RDebugUtils.currentLine=113180674;
 //BA.debugLineNum = 113180674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113180675;
 //BA.debugLineNum = 113180675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setborder(b4j.example.vmelement __ref,String _width,String _color,String _bstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setborder", new Object[] {_width,_color,_bstyle}));}
anywheresoftware.b4a.objects.collections.Map _b = null;
RDebugUtils.currentLine=110428160;
 //BA.debugLineNum = 110428160;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
RDebugUtils.currentLine=110428161;
 //BA.debugLineNum = 110428161;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
RDebugUtils.currentLine=110428162;
 //BA.debugLineNum = 110428162;BA.debugLine="b.Put(\"border-style\", bstyle)";
_b.Put((Object)("border-style"),(Object)(_bstyle));
RDebugUtils.currentLine=110428163;
 //BA.debugLineNum = 110428163;BA.debugLine="b.Put(\"border-width\", width)";
_b.Put((Object)("border-width"),(Object)(_width));
RDebugUtils.currentLine=110428164;
 //BA.debugLineNum = 110428164;BA.debugLine="b.Put(\"border-color\", color)";
_b.Put((Object)("border-color"),(Object)(_color));
RDebugUtils.currentLine=110428165;
 //BA.debugLineNum = 110428165;BA.debugLine="SetStyle(b)";
__ref._setstyle /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=110428166;
 //BA.debugLineNum = 110428166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110428167;
 //BA.debugLineNum = 110428167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcolor(b4j.example.vmelement __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setcolor", new Object[] {_c}));}
RDebugUtils.currentLine=112918528;
 //BA.debugLineNum = 112918528;BA.debugLine="Sub SetColor(c As Object) As VMElement";
RDebugUtils.currentLine=112918529;
 //BA.debugLineNum = 112918529;BA.debugLine="SetStyle(CreateMap(\"color\": c))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("color"),_c}));
RDebugUtils.currentLine=112918530;
 //BA.debugLineNum = 112918530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112918531;
 //BA.debugLineNum = 112918531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcursormove(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setcursormove", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setcursormove", null));}
RDebugUtils.currentLine=110493696;
 //BA.debugLineNum = 110493696;BA.debugLine="Sub SetCursorMove As VMElement";
RDebugUtils.currentLine=110493697;
 //BA.debugLineNum = 110493697;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"move\"))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("cursor"),(Object)("move")}));
RDebugUtils.currentLine=110493698;
 //BA.debugLineNum = 110493698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110493699;
 //BA.debugLineNum = 110493699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcursorpointer(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setcursorpointer", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setcursorpointer", null));}
RDebugUtils.currentLine=110559232;
 //BA.debugLineNum = 110559232;BA.debugLine="Sub SetCursorPointer As VMElement";
RDebugUtils.currentLine=110559233;
 //BA.debugLineNum = 110559233;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"pointer\"))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("cursor"),(Object)("pointer")}));
RDebugUtils.currentLine=110559234;
 //BA.debugLineNum = 110559234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110559235;
 //BA.debugLineNum = 110559235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdraggable(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdraggable", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdraggable", new Object[] {_b}));}
RDebugUtils.currentLine=110166016;
 //BA.debugLineNum = 110166016;BA.debugLine="Sub SetDraggable(b As Boolean) As VMElement";
RDebugUtils.currentLine=110166017;
 //BA.debugLineNum = 110166017;BA.debugLine="SetAttr(CreateMap(\":draggable\":b))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":draggable"),(Object)(_b)}));
RDebugUtils.currentLine=110166018;
 //BA.debugLineNum = 110166018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110166019;
 //BA.debugLineNum = 110166019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdroppable(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdroppable", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdroppable", new Object[] {_b}));}
RDebugUtils.currentLine=110231552;
 //BA.debugLineNum = 110231552;BA.debugLine="Sub SetDroppable(b As Boolean) As VMElement";
RDebugUtils.currentLine=110231553;
 //BA.debugLineNum = 110231553;BA.debugLine="SetAttr(CreateMap(\":droppable\":b))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":droppable"),(Object)(_b)}));
RDebugUtils.currentLine=110231554;
 //BA.debugLineNum = 110231554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110231555;
 //BA.debugLineNum = 110231555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setheight(b4j.example.vmelement __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=110362624;
 //BA.debugLineNum = 110362624;BA.debugLine="Sub SetHeight(h As String) As VMElement";
RDebugUtils.currentLine=110362625;
 //BA.debugLineNum = 110362625;BA.debugLine="SetStyle(CreateMap(\"height\":h))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)(_h)}));
RDebugUtils.currentLine=110362626;
 //BA.debugLineNum = 110362626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110362627;
 //BA.debugLineNum = 110362627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmarginall(b4j.example.vmelement __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setmarginall", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setmarginall", new Object[] {_p}));}
RDebugUtils.currentLine=113246208;
 //BA.debugLineNum = 113246208;BA.debugLine="Sub SetMarginAll(p As Object) As VMElement";
RDebugUtils.currentLine=113246209;
 //BA.debugLineNum = 113246209;BA.debugLine="SetStyle(CreateMap(\"margin\":p))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("margin"),_p}));
RDebugUtils.currentLine=113246210;
 //BA.debugLineNum = 113246210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113246211;
 //BA.debugLineNum = 113246211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmargins(b4j.example.vmelement __ref,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setmargins", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setmargins", new Object[] {_mt,_mb,_ml,_mr}));}
RDebugUtils.currentLine=118685696;
 //BA.debugLineNum = 118685696;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
RDebugUtils.currentLine=118685697;
 //BA.debugLineNum = 118685697;BA.debugLine="AddStyle(\"margin-top\", mt)";
__ref._addstyle /*b4j.example.vmelement*/ (null,"margin-top",_mt);
RDebugUtils.currentLine=118685698;
 //BA.debugLineNum = 118685698;BA.debugLine="AddStyle(\"margin-bottom\", mb)";
__ref._addstyle /*b4j.example.vmelement*/ (null,"margin-bottom",_mb);
RDebugUtils.currentLine=118685699;
 //BA.debugLineNum = 118685699;BA.debugLine="AddStyle(\"margin-left\", ml)";
__ref._addstyle /*b4j.example.vmelement*/ (null,"margin-left",_ml);
RDebugUtils.currentLine=118685700;
 //BA.debugLineNum = 118685700;BA.debugLine="AddStyle(\"margin-right\", mr)";
__ref._addstyle /*b4j.example.vmelement*/ (null,"margin-right",_mr);
RDebugUtils.currentLine=118685701;
 //BA.debugLineNum = 118685701;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118685702;
 //BA.debugLineNum = 118685702;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmaxheight(b4j.example.vmelement __ref,String _mw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setmaxheight", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setmaxheight", new Object[] {_mw}));}
RDebugUtils.currentLine=113704960;
 //BA.debugLineNum = 113704960;BA.debugLine="Sub SetMaxHeight(mw As String) As VMElement";
RDebugUtils.currentLine=113704961;
 //BA.debugLineNum = 113704961;BA.debugLine="Element.SetStyle(\"max-height\",mw)";
__ref._element /*b4j.example.vuehtml*/ ._setstyle /*b4j.example.vuehtml*/ (null,"max-height",_mw);
RDebugUtils.currentLine=113704962;
 //BA.debugLineNum = 113704962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113704963;
 //BA.debugLineNum = 113704963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmaxwidth(b4j.example.vmelement __ref,String _mw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setmaxwidth", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setmaxwidth", new Object[] {_mw}));}
RDebugUtils.currentLine=113639424;
 //BA.debugLineNum = 113639424;BA.debugLine="Sub SetMaxWidth(mw As String) As VMElement";
RDebugUtils.currentLine=113639425;
 //BA.debugLineNum = 113639425;BA.debugLine="Element.SetStyle(\"max-width\",mw)";
__ref._element /*b4j.example.vuehtml*/ ._setstyle /*b4j.example.vuehtml*/ (null,"max-width",_mw);
RDebugUtils.currentLine=113639426;
 //BA.debugLineNum = 113639426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113639427;
 //BA.debugLineNum = 113639427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setnotselectible(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setnotselectible", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setnotselectible", null));}
RDebugUtils.currentLine=109969408;
 //BA.debugLineNum = 109969408;BA.debugLine="Sub SetNotSelectible As VMElement";
RDebugUtils.currentLine=109969409;
 //BA.debugLineNum = 109969409;BA.debugLine="Element.AddClass(\"gj-unselectable\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"gj-unselectable");
RDebugUtils.currentLine=109969410;
 //BA.debugLineNum = 109969410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109969411;
 //BA.debugLineNum = 109969411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondrop(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setondrop", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setondrop", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118620160;
 //BA.debugLineNum = 118620160;BA.debugLine="Sub SetOnDrop(module As Object, methodName As Stri";
RDebugUtils.currentLine=118620161;
 //BA.debugLineNum = 118620161;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118620162;
 //BA.debugLineNum = 118620162;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118620163;
 //BA.debugLineNum = 118620163;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118620164;
 //BA.debugLineNum = 118620164;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118620165;
 //BA.debugLineNum = 118620165;BA.debugLine="SetAttr(CreateMap(\"v-on:drop\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:drop"),(Object)(_methodname)}));
RDebugUtils.currentLine=118620167;
 //BA.debugLineNum = 118620167;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118620168;
 //BA.debugLineNum = 118620168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118620169;
 //BA.debugLineNum = 118620169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonmouseout(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setonmouseout", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setonmouseout", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=111149056;
 //BA.debugLineNum = 111149056;BA.debugLine="Sub SetOnMouseOut(module As Object, methodName As";
RDebugUtils.currentLine=111149057;
 //BA.debugLineNum = 111149057;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=111149058;
 //BA.debugLineNum = 111149058;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=111149059;
 //BA.debugLineNum = 111149059;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseout\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:mouseout"),(Object)(_methodname)}));
RDebugUtils.currentLine=111149060;
 //BA.debugLineNum = 111149060;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=111149061;
 //BA.debugLineNum = 111149061;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=111149062;
 //BA.debugLineNum = 111149062;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=111149063;
 //BA.debugLineNum = 111149063;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111149064;
 //BA.debugLineNum = 111149064;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonmouseover(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setonmouseover", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setonmouseover", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=111214592;
 //BA.debugLineNum = 111214592;BA.debugLine="Sub SetOnMouseOver(module As Object, methodName As";
RDebugUtils.currentLine=111214593;
 //BA.debugLineNum = 111214593;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=111214594;
 //BA.debugLineNum = 111214594;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=111214595;
 //BA.debugLineNum = 111214595;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseover\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:mouseover"),(Object)(_methodname)}));
RDebugUtils.currentLine=111214596;
 //BA.debugLineNum = 111214596;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=111214597;
 //BA.debugLineNum = 111214597;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=111214598;
 //BA.debugLineNum = 111214598;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=111214599;
 //BA.debugLineNum = 111214599;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111214600;
 //BA.debugLineNum = 111214600;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpadding(b4j.example.vmelement __ref,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setpadding", new Object[] {_pt,_pb,_pl,_pr}));}
RDebugUtils.currentLine=118816768;
 //BA.debugLineNum = 118816768;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
RDebugUtils.currentLine=118816769;
 //BA.debugLineNum = 118816769;BA.debugLine="AddStyle(\"padding-top\", pt)";
__ref._addstyle /*b4j.example.vmelement*/ (null,"padding-top",_pt);
RDebugUtils.currentLine=118816770;
 //BA.debugLineNum = 118816770;BA.debugLine="AddStyle(\"padding-bottom\", pb)";
__ref._addstyle /*b4j.example.vmelement*/ (null,"padding-bottom",_pb);
RDebugUtils.currentLine=118816771;
 //BA.debugLineNum = 118816771;BA.debugLine="AddStyle(\"padding-left\", pl)";
__ref._addstyle /*b4j.example.vmelement*/ (null,"padding-left",_pl);
RDebugUtils.currentLine=118816772;
 //BA.debugLineNum = 118816772;BA.debugLine="AddStyle(\"padding-right\", pr)";
__ref._addstyle /*b4j.example.vmelement*/ (null,"padding-right",_pr);
RDebugUtils.currentLine=118816773;
 //BA.debugLineNum = 118816773;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118816774;
 //BA.debugLineNum = 118816774;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setref(b4j.example.vmelement __ref,String _varref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setref", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setref", new Object[] {_varref}));}
RDebugUtils.currentLine=111411200;
 //BA.debugLineNum = 111411200;BA.debugLine="Sub SetRef(varRef As String) As VMElement";
RDebugUtils.currentLine=111411201;
 //BA.debugLineNum = 111411201;BA.debugLine="If varRef <> \"\" Then";
if ((_varref).equals("") == false) { 
RDebugUtils.currentLine=111411202;
 //BA.debugLineNum = 111411202;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("ref"),(Object)(_varref)}));
 };
RDebugUtils.currentLine=111411204;
 //BA.debugLineNum = 111411204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111411205;
 //BA.debugLineNum = 111411205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setscrollbar(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setscrollbar", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setscrollbar", new Object[] {_b}));}
RDebugUtils.currentLine=114622464;
 //BA.debugLineNum = 114622464;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMElement";
RDebugUtils.currentLine=114622465;
 //BA.debugLineNum = 114622465;BA.debugLine="Element.AddClass(\"md-scrollbar\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-scrollbar");
RDebugUtils.currentLine=114622466;
 //BA.debugLineNum = 114622466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114622467;
 //BA.debugLineNum = 114622467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settextaligncenter(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settextaligncenter", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settextaligncenter", null));}
RDebugUtils.currentLine=110624768;
 //BA.debugLineNum = 110624768;BA.debugLine="Sub SetTextAlignCenter As VMElement";
RDebugUtils.currentLine=110624769;
 //BA.debugLineNum = 110624769;BA.debugLine="SetStyle(CreateMap(\"text-align\": \"center\"))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("text-align"),(Object)("center")}));
RDebugUtils.currentLine=110624770;
 //BA.debugLineNum = 110624770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110624771;
 //BA.debugLineNum = 110624771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setwidth(b4j.example.vmelement __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=110297088;
 //BA.debugLineNum = 110297088;BA.debugLine="Sub SetWidth(w As String) As VMElement";
RDebugUtils.currentLine=110297089;
 //BA.debugLineNum = 110297089;BA.debugLine="SetStyle(CreateMap(\"width\":w))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
RDebugUtils.currentLine=110297090;
 //BA.debugLineNum = 110297090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110297091;
 //BA.debugLineNum = 110297091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagdialogtitle(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settagdialogtitle", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settagdialogtitle", new Object[] {_b}));}
RDebugUtils.currentLine=113770496;
 //BA.debugLineNum = 113770496;BA.debugLine="Sub SetTagDialogTitle(b As Boolean) As VMElement";
RDebugUtils.currentLine=113770497;
 //BA.debugLineNum = 113770497;BA.debugLine="Element.SetTag(\"md-dialog-title\")";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,"md-dialog-title");
RDebugUtils.currentLine=113770498;
 //BA.debugLineNum = 113770498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113770499;
 //BA.debugLineNum = 113770499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpermanentfull(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setpermanentfull", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setpermanentfull", new Object[] {_b}));}
RDebugUtils.currentLine=115605504;
 //BA.debugLineNum = 115605504;BA.debugLine="Sub SetPermanentFull(b As Boolean) As VMElement";
RDebugUtils.currentLine=115605505;
 //BA.debugLineNum = 115605505;BA.debugLine="Element.SetAttr(\"md-permanent\",\"full\")";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"md-permanent","full");
RDebugUtils.currentLine=115605506;
 //BA.debugLineNum = 115605506;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115605507;
 //BA.debugLineNum = 115605507;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addchild(b4j.example.vmelement __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=113049600;
 //BA.debugLineNum = 113049600;BA.debugLine="Sub AddChild(child As VMElement) As VMElement";
RDebugUtils.currentLine=113049601;
 //BA.debugLineNum = 113049601;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=113049602;
 //BA.debugLineNum = 113049602;BA.debugLine="Element.SetText(childHTML)";
__ref._element /*b4j.example.vuehtml*/ ._settext /*b4j.example.vuehtml*/ (null,_childhtml);
RDebugUtils.currentLine=113049603;
 //BA.debugLineNum = 113049603;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=113049604;
 //BA.debugLineNum = 113049604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113049605;
 //BA.debugLineNum = 113049605;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmelement __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=113115136;
 //BA.debugLineNum = 113115136;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=113115137;
 //BA.debugLineNum = 113115137;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=113115138;
 //BA.debugLineNum = 113115138;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmelement*/ (null,_childx);
 }
};
RDebugUtils.currentLine=113115140;
 //BA.debugLineNum = 113115140;BA.debugLine="End Sub";
return "";
}
public String  _addelement(b4j.example.vmelement __ref,b4j.example.vmelement _el) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "addelement", true))
	 {return ((String) Debug.delegate(ba, "addelement", new Object[] {_el}));}
RDebugUtils.currentLine=117178368;
 //BA.debugLineNum = 117178368;BA.debugLine="Sub AddElement(el As VMElement)";
RDebugUtils.currentLine=117178369;
 //BA.debugLineNum = 117178369;BA.debugLine="SetText(el.ToString)";
__ref._settext /*b4j.example.vmelement*/ (null,_el._tostring /*String*/ (null));
RDebugUtils.currentLine=117178370;
 //BA.debugLineNum = 117178370;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _addstyle(b4j.example.vmelement __ref,String _prop,Object _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "addstyle", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "addstyle", new Object[] {_prop,_val}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=118751232;
 //BA.debugLineNum = 118751232;BA.debugLine="Sub AddStyle(prop As String, val As Object) As VME";
RDebugUtils.currentLine=118751233;
 //BA.debugLineNum = 118751233;BA.debugLine="If val = Null Then Return Me";
if (_val== null) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118751234;
 //BA.debugLineNum = 118751234;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
RDebugUtils.currentLine=118751235;
 //BA.debugLineNum = 118751235;BA.debugLine="m.Put(prop, val)";
_m.Put((Object)(_prop),_val);
RDebugUtils.currentLine=118751236;
 //BA.debugLineNum = 118751236;BA.debugLine="SetStyle(m)";
__ref._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=118751237;
 //BA.debugLineNum = 118751237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118751238;
 //BA.debugLineNum = 118751238;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
RDebugUtils.currentLine=109051904;
 //BA.debugLineNum = 109051904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=109051905;
 //BA.debugLineNum = 109051905;BA.debugLine="Public Element As VueHTML";
_element = new b4j.example.vuehtml();
RDebugUtils.currentLine=109051906;
 //BA.debugLineNum = 109051906;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=109051907;
 //BA.debugLineNum = 109051907;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=109051908;
 //BA.debugLineNum = 109051908;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=109051909;
 //BA.debugLineNum = 109051909;BA.debugLine="Public hasContent As Boolean";
_hascontent = false;
RDebugUtils.currentLine=109051910;
 //BA.debugLineNum = 109051910;BA.debugLine="Private rowClass As String = \"row\"";
_rowclass = "row";
RDebugUtils.currentLine=109051911;
 //BA.debugLineNum = 109051911;BA.debugLine="Private cellClass As String = \"col\"";
_cellclass = "col";
RDebugUtils.currentLine=109051913;
 //BA.debugLineNum = 109051913;BA.debugLine="Private offClass As Map = CreateMap(\"s\":\"offset-s";
_offclass = new anywheresoftware.b4a.objects.collections.Map();
_offclass = __c.createMap(new Object[] {(Object)("s"),(Object)("offset-sm-"),(Object)("m"),(Object)("offset-md-"),(Object)("l"),(Object)("offset-lg-"),(Object)("xl"),(Object)("offset-xl-")});
RDebugUtils.currentLine=109051915;
 //BA.debugLineNum = 109051915;BA.debugLine="Private colClass As Map = CreateMap(\"s\": \"col-sm-";
_colclass = new anywheresoftware.b4a.objects.collections.Map();
_colclass = __c.createMap(new Object[] {(Object)("s"),(Object)("col-sm-"),(Object)("m"),(Object)("col-md-"),(Object)("l"),(Object)("col-lg-"),(Object)("xl"),(Object)("col-xl-")});
RDebugUtils.currentLine=109051916;
 //BA.debugLineNum = 109051916;BA.debugLine="Private showKey As String";
_showkey = "";
RDebugUtils.currentLine=109051917;
 //BA.debugLineNum = 109051917;BA.debugLine="Private disKey As String";
_diskey = "";
RDebugUtils.currentLine=109051918;
 //BA.debugLineNum = 109051918;BA.debugLine="Private reqKey As String";
_reqkey = "";
RDebugUtils.currentLine=109051919;
 //BA.debugLineNum = 109051919;BA.debugLine="Private errKey As String";
_errkey = "";
RDebugUtils.currentLine=109051920;
 //BA.debugLineNum = 109051920;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _enable(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "enable", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "enable", new Object[] {_b}));}
boolean _n = false;
RDebugUtils.currentLine=109379584;
 //BA.debugLineNum = 109379584;BA.debugLine="Sub Enable(b As Boolean) As VMElement";
RDebugUtils.currentLine=109379585;
 //BA.debugLineNum = 109379585;BA.debugLine="Dim n As Boolean = Not(b)";
_n = __c.Not(_b);
RDebugUtils.currentLine=109379586;
 //BA.debugLineNum = 109379586;BA.debugLine="vue.SetStateSingle(disKey, n)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._diskey /*String*/ ,(Object)(_n));
RDebugUtils.currentLine=109379587;
 //BA.debugLineNum = 109379587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109379588;
 //BA.debugLineNum = 109379588;BA.debugLine="End Sub";
return null;
}
public String  _makepx(b4j.example.vmelement __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "makepx", true))
	 {return ((String) Debug.delegate(ba, "makepx", new Object[] {_svalue}));}
RDebugUtils.currentLine=109772800;
 //BA.debugLineNum = 109772800;BA.debugLine="Sub MakePx(sValue As String) As String";
RDebugUtils.currentLine=109772801;
 //BA.debugLineNum = 109772801;BA.debugLine="Return Element.MakePx(sValue)";
if (true) return __ref._element /*b4j.example.vuehtml*/ ._makepx /*String*/ (null,_svalue);
RDebugUtils.currentLine=109772802;
 //BA.debugLineNum = 109772802;BA.debugLine="End Sub";
return "";
}
public String  _pop1(b4j.example.vmelement __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "pop1", true))
	 {return ((String) Debug.delegate(ba, "pop1", new Object[] {_p}));}
RDebugUtils.currentLine=112852992;
 //BA.debugLineNum = 112852992;BA.debugLine="Sub Pop1(p As VMElement)";
RDebugUtils.currentLine=112852993;
 //BA.debugLineNum = 112852993;BA.debugLine="p.AddChild(Me)";
_p._addchild /*b4j.example.vmelement*/ (null,(b4j.example.vmelement)(this));
RDebugUtils.currentLine=112852994;
 //BA.debugLineNum = 112852994;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _removeclass(b4j.example.vmelement __ref,String _classname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "removeclass", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "removeclass", new Object[] {_classname}));}
RDebugUtils.currentLine=111017984;
 //BA.debugLineNum = 111017984;BA.debugLine="Sub RemoveClass(className As String) As VMElement";
RDebugUtils.currentLine=111017985;
 //BA.debugLineNum = 111017985;BA.debugLine="Element.removeClass(className)";
__ref._element /*b4j.example.vuehtml*/ ._removeclass /*b4j.example.vuehtml*/ (null,_classname);
RDebugUtils.currentLine=111017986;
 //BA.debugLineNum = 111017986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111017987;
 //BA.debugLineNum = 111017987;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=117637120;
 //BA.debugLineNum = 117637120;BA.debugLine="Sub Render";
RDebugUtils.currentLine=117637121;
 //BA.debugLineNum = 117637121;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=117637122;
 //BA.debugLineNum = 117637122;BA.debugLine="End Sub";
return "";
}
public String  _render1(b4j.example.vmelement __ref,String _parent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "render1", true))
	 {return ((String) Debug.delegate(ba, "render1", new Object[] {_parent}));}
RDebugUtils.currentLine=112787456;
 //BA.debugLineNum = 112787456;BA.debugLine="Sub Render1(parent As String)";
RDebugUtils.currentLine=112787457;
 //BA.debugLineNum = 112787457;BA.debugLine="BANano.GetElement(parent).Append(ToString)";
__ref._banano /*com.ab.banano.BANano*/ .GetElement(_parent).Append(__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=112787458;
 //BA.debugLineNum = 112787458;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _required(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "required", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "required", new Object[] {_b}));}
RDebugUtils.currentLine=109314048;
 //BA.debugLineNum = 109314048;BA.debugLine="Sub Required(b As Boolean) As VMElement";
RDebugUtils.currentLine=109314049;
 //BA.debugLineNum = 109314049;BA.debugLine="vue.SetStateSingle(reqKey, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._reqkey /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=109314050;
 //BA.debugLineNum = 109314050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109314051;
 //BA.debugLineNum = 109314051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setappcontent(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setappcontent", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setappcontent", new Object[] {_b}));}
RDebugUtils.currentLine=115212288;
 //BA.debugLineNum = 115212288;BA.debugLine="Sub SetAppContent(b As Boolean) As VMElement";
RDebugUtils.currentLine=115212289;
 //BA.debugLineNum = 115212289;BA.debugLine="Element.SetTag(\"md-app-content\")";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,"md-app-content");
RDebugUtils.currentLine=115212290;
 //BA.debugLineNum = 115212290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115212291;
 //BA.debugLineNum = 115212291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattrsingle(b4j.example.vmelement __ref,String _prop,Object _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setattrsingle", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setattrsingle", new Object[] {_prop,_val}));}
anywheresoftware.b4a.objects.collections.Map _attr = null;
RDebugUtils.currentLine=109248512;
 //BA.debugLineNum = 109248512;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
RDebugUtils.currentLine=109248513;
 //BA.debugLineNum = 109248513;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
RDebugUtils.currentLine=109248514;
 //BA.debugLineNum = 109248514;BA.debugLine="attr.Put(prop, val)";
_attr.Put((Object)(_prop),_val);
RDebugUtils.currentLine=109248515;
 //BA.debugLineNum = 109248515;BA.debugLine="SetAttr(attr)";
__ref._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=109248516;
 //BA.debugLineNum = 109248516;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109248517;
 //BA.debugLineNum = 109248517;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setautocomplete(b4j.example.vmelement __ref,String _auto) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setautocomplete", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setautocomplete", new Object[] {_auto}));}
RDebugUtils.currentLine=112197632;
 //BA.debugLineNum = 112197632;BA.debugLine="Sub SetAutoComplete(auto As String) As VMElement";
RDebugUtils.currentLine=112197633;
 //BA.debugLineNum = 112197633;BA.debugLine="SetAttr(CreateMap(\"autocomplete\": auto))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("autocomplete"),(Object)(_auto)}));
RDebugUtils.currentLine=112197634;
 //BA.debugLineNum = 112197634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112197635;
 //BA.debugLineNum = 112197635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcaption(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setcaption", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setcaption", new Object[] {_b}));}
RDebugUtils.currentLine=116523008;
 //BA.debugLineNum = 116523008;BA.debugLine="Sub SetCaption(b As Boolean) As VMElement";
RDebugUtils.currentLine=116523009;
 //BA.debugLineNum = 116523009;BA.debugLine="Element.AddClass(\"md-caption\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-caption");
RDebugUtils.currentLine=116523010;
 //BA.debugLineNum = 116523010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116523011;
 //BA.debugLineNum = 116523011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdoubleline(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setdoubleline", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setdoubleline", new Object[] {_b}));}
RDebugUtils.currentLine=113442816;
 //BA.debugLineNum = 113442816;BA.debugLine="Sub SetDoubleLine(b As Boolean) As VMElement";
RDebugUtils.currentLine=113442817;
 //BA.debugLineNum = 113442817;BA.debugLine="Element.AddClass(\"md-double-line\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-double-line");
RDebugUtils.currentLine=113442818;
 //BA.debugLineNum = 113442818;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113442819;
 //BA.debugLineNum = 113442819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setfor(b4j.example.vmelement __ref,String _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setfor", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setfor", new Object[] {_f}));}
RDebugUtils.currentLine=109838336;
 //BA.debugLineNum = 109838336;BA.debugLine="Sub SetFor(f As String) As VMElement";
RDebugUtils.currentLine=109838337;
 //BA.debugLineNum = 109838337;BA.debugLine="Element.SetAttr(\"for\", f)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"for",_f);
RDebugUtils.currentLine=109838338;
 //BA.debugLineNum = 109838338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109838339;
 //BA.debugLineNum = 109838339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _seticonbutton(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "seticonbutton", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "seticonbutton", new Object[] {_b}));}
RDebugUtils.currentLine=115671040;
 //BA.debugLineNum = 115671040;BA.debugLine="Sub SetIconButton(b As Boolean) As VMElement";
RDebugUtils.currentLine=115671041;
 //BA.debugLineNum = 115671041;BA.debugLine="Element.AddClass(\"md-icon-button\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-icon-button");
RDebugUtils.currentLine=115671042;
 //BA.debugLineNum = 115671042;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115671043;
 //BA.debugLineNum = 115671043;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setinset(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setinset", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setinset", new Object[] {_b}));}
RDebugUtils.currentLine=113508352;
 //BA.debugLineNum = 113508352;BA.debugLine="Sub SetInset(b As Boolean) As VMElement";
RDebugUtils.currentLine=113508353;
 //BA.debugLineNum = 113508353;BA.debugLine="If b Then Element.AddClass(\"md-inset\")";
if (_b) { 
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-inset");};
RDebugUtils.currentLine=113508354;
 //BA.debugLineNum = 113508354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113508355;
 //BA.debugLineNum = 113508355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setis(b4j.example.vmelement __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setis", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setis", new Object[] {_t}));}
RDebugUtils.currentLine=111345664;
 //BA.debugLineNum = 111345664;BA.debugLine="Sub SetIs(t As String) As VMElement";
RDebugUtils.currentLine=111345665;
 //BA.debugLineNum = 111345665;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
RDebugUtils.currentLine=111345666;
 //BA.debugLineNum = 111345666;BA.debugLine="SetAttr(CreateMap(\":is\": t))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":is"),(Object)(_t)}));
RDebugUtils.currentLine=111345667;
 //BA.debugLineNum = 111345667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111345668;
 //BA.debugLineNum = 111345668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlarge(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setlarge", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setlarge", new Object[] {_b}));}
RDebugUtils.currentLine=114425856;
 //BA.debugLineNum = 114425856;BA.debugLine="Sub SetLarge(b As Boolean) As VMElement";
RDebugUtils.currentLine=114425857;
 //BA.debugLineNum = 114425857;BA.debugLine="Element.AddClass(\"md-large\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-large");
RDebugUtils.currentLine=114425858;
 //BA.debugLineNum = 114425858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114425859;
 //BA.debugLineNum = 114425859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlayoutcolumn(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setlayoutcolumn", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setlayoutcolumn", new Object[] {_b}));}
RDebugUtils.currentLine=113377280;
 //BA.debugLineNum = 113377280;BA.debugLine="Sub SetLayoutColumn(b As Boolean) As VMElement";
RDebugUtils.currentLine=113377281;
 //BA.debugLineNum = 113377281;BA.debugLine="Element.AddClass(\"md-layout-column\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-layout-column");
RDebugUtils.currentLine=113377282;
 //BA.debugLineNum = 113377282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113377283;
 //BA.debugLineNum = 113377283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlineheight(b4j.example.vmelement __ref,Object _lh) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setlineheight", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setlineheight", new Object[] {_lh}));}
RDebugUtils.currentLine=115539968;
 //BA.debugLineNum = 115539968;BA.debugLine="Sub SetLineHeight(lh As Object) As VMElement";
RDebugUtils.currentLine=115539969;
 //BA.debugLineNum = 115539969;BA.debugLine="SetStyle(CreateMap(\"line-height\": lh))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("line-height"),_lh}));
RDebugUtils.currentLine=115539970;
 //BA.debugLineNum = 115539970;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115539971;
 //BA.debugLineNum = 115539971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlistitemtext(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setlistitemtext", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setlistitemtext", new Object[] {_b}));}
RDebugUtils.currentLine=115998720;
 //BA.debugLineNum = 115998720;BA.debugLine="Sub SetListItemText(b As Boolean) As VMElement";
RDebugUtils.currentLine=115998721;
 //BA.debugLineNum = 115998721;BA.debugLine="Element.AddClass(\"md-list-item-text\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-list-item-text");
RDebugUtils.currentLine=115998722;
 //BA.debugLineNum = 115998722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115998723;
 //BA.debugLineNum = 115998723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmedium(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setmedium", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setmedium", new Object[] {_b}));}
RDebugUtils.currentLine=114360320;
 //BA.debugLineNum = 114360320;BA.debugLine="Sub SetMedium(b As Boolean) As VMElement";
RDebugUtils.currentLine=114360321;
 //BA.debugLineNum = 114360321;BA.debugLine="If b Then Element.AddClass(\"md-medium\")";
if (_b) { 
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-medium");};
RDebugUtils.currentLine=114360322;
 //BA.debugLineNum = 114360322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114360323;
 //BA.debugLineNum = 114360323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmethodpost(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setmethodpost", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setmethodpost", null));}
RDebugUtils.currentLine=110100480;
 //BA.debugLineNum = 110100480;BA.debugLine="Sub SetMethodPost As VMElement";
RDebugUtils.currentLine=110100481;
 //BA.debugLineNum = 110100481;BA.debugLine="SetAttr(CreateMap(\"method\":\"POST\"))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("method"),(Object)("POST")}));
RDebugUtils.currentLine=110100482;
 //BA.debugLineNum = 110100482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110100483;
 //BA.debugLineNum = 110100483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setnowrap(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setnowrap", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setnowrap", new Object[] {_b}));}
RDebugUtils.currentLine=116916224;
 //BA.debugLineNum = 116916224;BA.debugLine="Sub SetNoWrap(b As Boolean) As VMElement";
RDebugUtils.currentLine=116916225;
 //BA.debugLineNum = 116916225;BA.debugLine="Element.AddClass(\"md-layout-nowrap\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-layout-nowrap");
RDebugUtils.currentLine=116916226;
 //BA.debugLineNum = 116916226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116916227;
 //BA.debugLineNum = 116916227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonblur(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setonblur", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setonblur", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118030336;
 //BA.debugLineNum = 118030336;BA.debugLine="Sub SetOnBlur(module As Object, methodName As Stri";
RDebugUtils.currentLine=118030337;
 //BA.debugLineNum = 118030337;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118030338;
 //BA.debugLineNum = 118030338;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118030339;
 //BA.debugLineNum = 118030339;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118030340;
 //BA.debugLineNum = 118030340;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118030341;
 //BA.debugLineNum = 118030341;BA.debugLine="SetAttr(CreateMap(\"v-on:blur\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:blur"),(Object)(_methodname)}));
RDebugUtils.currentLine=118030343;
 //BA.debugLineNum = 118030343;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118030344;
 //BA.debugLineNum = 118030344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118030345;
 //BA.debugLineNum = 118030345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonchange(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setonchange", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setonchange", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118226944;
 //BA.debugLineNum = 118226944;BA.debugLine="Sub SetOnChange(module As Object, methodName As St";
RDebugUtils.currentLine=118226945;
 //BA.debugLineNum = 118226945;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118226946;
 //BA.debugLineNum = 118226946;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118226947;
 //BA.debugLineNum = 118226947;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118226948;
 //BA.debugLineNum = 118226948;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118226949;
 //BA.debugLineNum = 118226949;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
RDebugUtils.currentLine=118226951;
 //BA.debugLineNum = 118226951;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118226952;
 //BA.debugLineNum = 118226952;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118226953;
 //BA.debugLineNum = 118226953;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonclear(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setonclear", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setonclear", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=117964800;
 //BA.debugLineNum = 117964800;BA.debugLine="Sub SetOnClear(module As Object, methodName As Str";
RDebugUtils.currentLine=117964801;
 //BA.debugLineNum = 117964801;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=117964802;
 //BA.debugLineNum = 117964802;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=117964803;
 //BA.debugLineNum = 117964803;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=117964804;
 //BA.debugLineNum = 117964804;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=117964805;
 //BA.debugLineNum = 117964805;BA.debugLine="SetAttr(CreateMap(\"v-on:md-clear\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-clear"),(Object)(_methodname)}));
RDebugUtils.currentLine=117964807;
 //BA.debugLineNum = 117964807;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=117964808;
 //BA.debugLineNum = 117964808;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117964809;
 //BA.debugLineNum = 117964809;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpointer(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setpointer", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setpointer", new Object[] {_b}));}
RDebugUtils.currentLine=118095872;
 //BA.debugLineNum = 118095872;BA.debugLine="Sub SetPointer(b As Boolean) As VMElement";
RDebugUtils.currentLine=118095873;
 //BA.debugLineNum = 118095873;BA.debugLine="Element.SetPointer(True)";
__ref._element /*b4j.example.vuehtml*/ ._setpointer /*b4j.example.vuehtml*/ (null,__c.True);
RDebugUtils.currentLine=118095874;
 //BA.debugLineNum = 118095874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118095875;
 //BA.debugLineNum = 118095875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragend(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setondragend", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setondragend", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118489088;
 //BA.debugLineNum = 118489088;BA.debugLine="Sub SetOnDragEnd(module As Object, methodName As S";
RDebugUtils.currentLine=118489089;
 //BA.debugLineNum = 118489089;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118489090;
 //BA.debugLineNum = 118489090;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118489091;
 //BA.debugLineNum = 118489091;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118489092;
 //BA.debugLineNum = 118489092;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118489093;
 //BA.debugLineNum = 118489093;BA.debugLine="SetAttr(CreateMap(\"v-on:dragend\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:dragend"),(Object)(_methodname)}));
RDebugUtils.currentLine=118489095;
 //BA.debugLineNum = 118489095;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118489096;
 //BA.debugLineNum = 118489096;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118489097;
 //BA.debugLineNum = 118489097;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragenter(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setondragenter", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setondragenter", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118554624;
 //BA.debugLineNum = 118554624;BA.debugLine="Sub SetOnDragEnter(module As Object, methodName As";
RDebugUtils.currentLine=118554625;
 //BA.debugLineNum = 118554625;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118554626;
 //BA.debugLineNum = 118554626;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118554627;
 //BA.debugLineNum = 118554627;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118554628;
 //BA.debugLineNum = 118554628;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118554629;
 //BA.debugLineNum = 118554629;BA.debugLine="SetAttr(CreateMap(\"v-on:dragenter\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:dragenter"),(Object)(_methodname)}));
RDebugUtils.currentLine=118554631;
 //BA.debugLineNum = 118554631;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118554632;
 //BA.debugLineNum = 118554632;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118554633;
 //BA.debugLineNum = 118554633;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragover(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setondragover", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setondragover", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118358016;
 //BA.debugLineNum = 118358016;BA.debugLine="Sub SetOnDragOver(module As Object, methodName As";
RDebugUtils.currentLine=118358017;
 //BA.debugLineNum = 118358017;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118358018;
 //BA.debugLineNum = 118358018;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118358019;
 //BA.debugLineNum = 118358019;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118358020;
 //BA.debugLineNum = 118358020;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118358021;
 //BA.debugLineNum = 118358021;BA.debugLine="SetAttr(CreateMap(\"v-on:dragover\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:dragover"),(Object)(_methodname)}));
RDebugUtils.currentLine=118358023;
 //BA.debugLineNum = 118358023;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118358024;
 //BA.debugLineNum = 118358024;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118358025;
 //BA.debugLineNum = 118358025;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragstart(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setondragstart", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setondragstart", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118423552;
 //BA.debugLineNum = 118423552;BA.debugLine="Sub SetOnDragStart(module As Object, methodName As";
RDebugUtils.currentLine=118423553;
 //BA.debugLineNum = 118423553;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118423554;
 //BA.debugLineNum = 118423554;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118423555;
 //BA.debugLineNum = 118423555;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118423556;
 //BA.debugLineNum = 118423556;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118423557;
 //BA.debugLineNum = 118423557;BA.debugLine="SetAttr(CreateMap(\"v-on:dragstart\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:dragstart"),(Object)(_methodname)}));
RDebugUtils.currentLine=118423559;
 //BA.debugLineNum = 118423559;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118423560;
 //BA.debugLineNum = 118423560;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118423561;
 //BA.debugLineNum = 118423561;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonfocus(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setonfocus", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setonfocus", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=117899264;
 //BA.debugLineNum = 117899264;BA.debugLine="Sub SetOnFocus(module As Object, methodName As Str";
RDebugUtils.currentLine=117899265;
 //BA.debugLineNum = 117899265;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=117899266;
 //BA.debugLineNum = 117899266;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=117899267;
 //BA.debugLineNum = 117899267;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=117899268;
 //BA.debugLineNum = 117899268;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=117899269;
 //BA.debugLineNum = 117899269;BA.debugLine="SetAttr(CreateMap(\"v-on:focus\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:focus"),(Object)(_methodname)}));
RDebugUtils.currentLine=117899271;
 //BA.debugLineNum = 117899271;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=117899272;
 //BA.debugLineNum = 117899272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117899273;
 //BA.debugLineNum = 117899273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setoninput(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setoninput", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setoninput", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=117833728;
 //BA.debugLineNum = 117833728;BA.debugLine="Sub SetOnInput(module As Object, methodName As Str";
RDebugUtils.currentLine=117833729;
 //BA.debugLineNum = 117833729;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=117833730;
 //BA.debugLineNum = 117833730;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=117833731;
 //BA.debugLineNum = 117833731;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=117833732;
 //BA.debugLineNum = 117833732;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=117833733;
 //BA.debugLineNum = 117833733;BA.debugLine="SetAttr(CreateMap(\"v-on:input\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:input"),(Object)(_methodname)}));
RDebugUtils.currentLine=117833735;
 //BA.debugLineNum = 117833735;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=117833736;
 //BA.debugLineNum = 117833736;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=117833737;
 //BA.debugLineNum = 117833737;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setontouchstart(b4j.example.vmelement __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setontouchstart", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setontouchstart", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=118292480;
 //BA.debugLineNum = 118292480;BA.debugLine="Sub SetOnTouchStart(module As Object, methodName A";
RDebugUtils.currentLine=118292481;
 //BA.debugLineNum = 118292481;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=118292482;
 //BA.debugLineNum = 118292482;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=118292483;
 //BA.debugLineNum = 118292483;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=118292484;
 //BA.debugLineNum = 118292484;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=118292485;
 //BA.debugLineNum = 118292485;BA.debugLine="SetAttr(CreateMap(\"v-on:touchstart\": methodName))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on:touchstart"),(Object)(_methodname)}));
RDebugUtils.currentLine=118292487;
 //BA.debugLineNum = 118292487;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=118292488;
 //BA.debugLineNum = 118292488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=118292489;
 //BA.debugLineNum = 118292489;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setplaceholder(b4j.example.vmelement __ref,String _varplaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setplaceholder", new Object[] {_varplaceholder}));}
RDebugUtils.currentLine=109641728;
 //BA.debugLineNum = 109641728;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
RDebugUtils.currentLine=109641729;
 //BA.debugLineNum = 109641729;BA.debugLine="Element.SetAttrPlaceHolder(varPlaceholder)";
__ref._element /*b4j.example.vuehtml*/ ._setattrplaceholder /*b4j.example.vuehtml*/ (null,_varplaceholder);
RDebugUtils.currentLine=109641730;
 //BA.debugLineNum = 109641730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109641731;
 //BA.debugLineNum = 109641731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsize(b4j.example.vmelement __ref,int _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setsize", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setsize", new Object[] {_s}));}
double _eachcell = 0;
double _actsize = 0;
RDebugUtils.currentLine=116719616;
 //BA.debugLineNum = 116719616;BA.debugLine="Sub SetSize(s As Int) As VMElement";
RDebugUtils.currentLine=116719617;
 //BA.debugLineNum = 116719617;BA.debugLine="Dim eachCell As Double = 8.33";
_eachcell = 8.33;
RDebugUtils.currentLine=116719618;
 //BA.debugLineNum = 116719618;BA.debugLine="Dim actSize As Double = s * BANano.parseFloat(eac";
_actsize = _s*__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_eachcell));
RDebugUtils.currentLine=116719619;
 //BA.debugLineNum = 116719619;BA.debugLine="actSize = Round(BANano.parseFloat(actSize))";
_actsize = __c.Round(__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_actsize)));
RDebugUtils.currentLine=116719620;
 //BA.debugLineNum = 116719620;BA.debugLine="Element.AddClass($\"md-size-${actSize}\"$)";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,("md-size-"+__c.SmartStringFormatter("",(Object)(_actsize))+""));
RDebugUtils.currentLine=116719621;
 //BA.debugLineNum = 116719621;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=116719622;
 //BA.debugLineNum = 116719622;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setslot(b4j.example.vmelement __ref,String _sltvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setslot", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setslot", new Object[] {_sltvalue}));}
RDebugUtils.currentLine=110755840;
 //BA.debugLineNum = 110755840;BA.debugLine="Sub SetSlot(sltValue As String) As VMElement";
RDebugUtils.currentLine=110755841;
 //BA.debugLineNum = 110755841;BA.debugLine="Element.SetAttr(\"slot\", sltValue)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"slot",_sltvalue);
RDebugUtils.currentLine=110755842;
 //BA.debugLineNum = 110755842;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110755843;
 //BA.debugLineNum = 110755843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setslotscope(b4j.example.vmelement __ref,String _sltvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setslotscope", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setslotscope", new Object[] {_sltvalue}));}
RDebugUtils.currentLine=110886912;
 //BA.debugLineNum = 110886912;BA.debugLine="Sub SetSlotScope(sltValue As String) As VMElement";
RDebugUtils.currentLine=110886913;
 //BA.debugLineNum = 110886913;BA.debugLine="Element.SetAttr(\"slot-scope\", sltValue)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"slot-scope",_sltvalue);
RDebugUtils.currentLine=110886914;
 //BA.debugLineNum = 110886914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110886915;
 //BA.debugLineNum = 110886915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setstylesingle(b4j.example.vmelement __ref,String _prop,Object _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setstylesingle", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setstylesingle", new Object[] {_prop,_val}));}
anywheresoftware.b4a.objects.collections.Map _attr = null;
RDebugUtils.currentLine=109182976;
 //BA.debugLineNum = 109182976;BA.debugLine="Sub SetStyleSingle(prop As String, val As Object)";
RDebugUtils.currentLine=109182977;
 //BA.debugLineNum = 109182977;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
RDebugUtils.currentLine=109182978;
 //BA.debugLineNum = 109182978;BA.debugLine="attr.Put(prop, val)";
_attr.Put((Object)(_prop),_val);
RDebugUtils.currentLine=109182979;
 //BA.debugLineNum = 109182979;BA.debugLine="SetStyle(attr)";
__ref._setstyle /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=109182980;
 //BA.debugLineNum = 109182980;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109182981;
 //BA.debugLineNum = 109182981;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagappcontent(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settagappcontent", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settagappcontent", new Object[] {_b}));}
RDebugUtils.currentLine=114753536;
 //BA.debugLineNum = 114753536;BA.debugLine="Sub SetTagAppContent(b As Boolean) As VMElement";
RDebugUtils.currentLine=114753537;
 //BA.debugLineNum = 114753537;BA.debugLine="Element.SetTag(\"md-app-content\")";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,"md-app-content");
RDebugUtils.currentLine=114753538;
 //BA.debugLineNum = 114753538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114753539;
 //BA.debugLineNum = 114753539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagdialogactions(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settagdialogactions", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settagdialogactions", new Object[] {_b}));}
RDebugUtils.currentLine=113573888;
 //BA.debugLineNum = 113573888;BA.debugLine="Sub SetTagDialogActions(b As Boolean) As VMElement";
RDebugUtils.currentLine=113573889;
 //BA.debugLineNum = 113573889;BA.debugLine="Element.SetTag(\"md-dialog-actions\")";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,"md-dialog-actions");
RDebugUtils.currentLine=113573890;
 //BA.debugLineNum = 113573890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=113573891;
 //BA.debugLineNum = 113573891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settaglistitem(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settaglistitem", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settaglistitem", new Object[] {_b}));}
RDebugUtils.currentLine=115867648;
 //BA.debugLineNum = 115867648;BA.debugLine="Sub SetTagListItem(b As Boolean) As VMElement";
RDebugUtils.currentLine=115867649;
 //BA.debugLineNum = 115867649;BA.debugLine="Element.settag(\"md-list-item\")";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,"md-list-item");
RDebugUtils.currentLine=115867650;
 //BA.debugLineNum = 115867650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115867651;
 //BA.debugLineNum = 115867651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagspan(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settagspan", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settagspan", new Object[] {_b}));}
RDebugUtils.currentLine=115933184;
 //BA.debugLineNum = 115933184;BA.debugLine="Sub SetTagSpan(b As Boolean) As VMElement";
RDebugUtils.currentLine=115933185;
 //BA.debugLineNum = 115933185;BA.debugLine="Element.SetTag(\"span\")";
__ref._element /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,"span");
RDebugUtils.currentLine=115933186;
 //BA.debugLineNum = 115933186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115933187;
 //BA.debugLineNum = 115933187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settemplate(b4j.example.vmelement __ref,Object _tmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settemplate", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settemplate", new Object[] {_tmp}));}
RDebugUtils.currentLine=112066560;
 //BA.debugLineNum = 112066560;BA.debugLine="Sub SetTemplate(tmp As Object) As VMElement";
RDebugUtils.currentLine=112066561;
 //BA.debugLineNum = 112066561;BA.debugLine="Element.Clear";
__ref._element /*b4j.example.vuehtml*/ ._clear /*b4j.example.vuehtml*/ (null);
RDebugUtils.currentLine=112066562;
 //BA.debugLineNum = 112066562;BA.debugLine="Element.SetText(tmp)";
__ref._element /*b4j.example.vuehtml*/ ._settext /*b4j.example.vuehtml*/ (null,BA.ObjectToString(_tmp));
RDebugUtils.currentLine=112066563;
 //BA.debugLineNum = 112066563;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112066564;
 //BA.debugLineNum = 112066564;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setterm(b4j.example.vmelement __ref,String _term) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setterm", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setterm", new Object[] {_term}));}
RDebugUtils.currentLine=110821376;
 //BA.debugLineNum = 110821376;BA.debugLine="Sub SetTerm(term As String) As VMElement";
RDebugUtils.currentLine=110821377;
 //BA.debugLineNum = 110821377;BA.debugLine="Element.SetAttr(\":md-term\", term)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,":md-term",_term);
RDebugUtils.currentLine=110821378;
 //BA.debugLineNum = 110821378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110821379;
 //BA.debugLineNum = 110821379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settransparent(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settransparent", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settransparent", new Object[] {_b}));}
RDebugUtils.currentLine=115277824;
 //BA.debugLineNum = 115277824;BA.debugLine="Sub SetTransparent(b As Boolean) As VMElement";
RDebugUtils.currentLine=115277825;
 //BA.debugLineNum = 115277825;BA.debugLine="Element.AddClass(\"md-transparent\")";
__ref._element /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"md-transparent");
RDebugUtils.currentLine=115277826;
 //BA.debugLineNum = 115277826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115277827;
 //BA.debugLineNum = 115277827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settype(b4j.example.vmelement __ref,String _typeof) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "settype", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "settype", new Object[] {_typeof}));}
RDebugUtils.currentLine=110952448;
 //BA.debugLineNum = 110952448;BA.debugLine="Sub SetType(typeof As String) As VMElement";
RDebugUtils.currentLine=110952449;
 //BA.debugLineNum = 110952449;BA.debugLine="Element.SetAttr(\"type\", typeof)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"type",_typeof);
RDebugUtils.currentLine=110952450;
 //BA.debugLineNum = 110952450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=110952451;
 //BA.debugLineNum = 110952451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvbind(b4j.example.vmelement __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvbind", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvbind", new Object[] {_t}));}
RDebugUtils.currentLine=111738880;
 //BA.debugLineNum = 111738880;BA.debugLine="Sub SetVBind(t As String) As VMElement";
RDebugUtils.currentLine=111738881;
 //BA.debugLineNum = 111738881;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
RDebugUtils.currentLine=111738882;
 //BA.debugLineNum = 111738882;BA.debugLine="SetAttr(CreateMap(\"v-bind\": t))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-bind"),(Object)(_t)}));
RDebugUtils.currentLine=111738883;
 //BA.debugLineNum = 111738883;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111738884;
 //BA.debugLineNum = 111738884;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvbindis(b4j.example.vmelement __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvbindis", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvbindis", new Object[] {_t}));}
RDebugUtils.currentLine=111804416;
 //BA.debugLineNum = 111804416;BA.debugLine="Sub SetVBindIs(t As String) As VMElement";
RDebugUtils.currentLine=111804417;
 //BA.debugLineNum = 111804417;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
RDebugUtils.currentLine=111804418;
 //BA.debugLineNum = 111804418;BA.debugLine="SetAttr(CreateMap(\"v-bind:is\": t))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-bind:is"),(Object)(_t)}));
RDebugUtils.currentLine=111804419;
 //BA.debugLineNum = 111804419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111804420;
 //BA.debugLineNum = 111804420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvcloak(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvcloak", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvcloak", null));}
RDebugUtils.currentLine=109903872;
 //BA.debugLineNum = 109903872;BA.debugLine="Sub SetVCloak As VMElement";
RDebugUtils.currentLine=109903873;
 //BA.debugLineNum = 109903873;BA.debugLine="Element.setvcloak";
__ref._element /*b4j.example.vuehtml*/ ._setvcloak /*b4j.example.vuehtml*/ (null);
RDebugUtils.currentLine=109903874;
 //BA.debugLineNum = 109903874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109903875;
 //BA.debugLineNum = 109903875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvelse(b4j.example.vmelement __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvelse", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvelse", new Object[] {_t}));}
RDebugUtils.currentLine=111542272;
 //BA.debugLineNum = 111542272;BA.debugLine="Sub SetVElse(t As Object) As VMElement";
RDebugUtils.currentLine=111542273;
 //BA.debugLineNum = 111542273;BA.debugLine="SetAttr(CreateMap(\"v-else\": t))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-else"),_t}));
RDebugUtils.currentLine=111542274;
 //BA.debugLineNum = 111542274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111542275;
 //BA.debugLineNum = 111542275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvelseif(b4j.example.vmelement __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvelseif", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvelseif", new Object[] {_t}));}
RDebugUtils.currentLine=111607808;
 //BA.debugLineNum = 111607808;BA.debugLine="Sub SetVElseIf(t As Object) As VMElement";
RDebugUtils.currentLine=111607809;
 //BA.debugLineNum = 111607809;BA.debugLine="SetAttr(CreateMap(\"v-else-if\": t))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-else-if"),_t}));
RDebugUtils.currentLine=111607810;
 //BA.debugLineNum = 111607810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111607811;
 //BA.debugLineNum = 111607811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setverticalalignmiddle(b4j.example.vmelement __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setverticalalignmiddle", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setverticalalignmiddle", null));}
RDebugUtils.currentLine=115474432;
 //BA.debugLineNum = 115474432;BA.debugLine="Sub SetVerticalAlignMiddle As VMElement";
RDebugUtils.currentLine=115474433;
 //BA.debugLineNum = 115474433;BA.debugLine="SetStyle(CreateMap(\"vertical-align\": \"middle\"))";
__ref._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("vertical-align"),(Object)("middle")}));
RDebugUtils.currentLine=115474434;
 //BA.debugLineNum = 115474434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=115474435;
 //BA.debugLineNum = 115474435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvhtml(b4j.example.vmelement __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvhtml", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvhtml", new Object[] {_h}));}
RDebugUtils.currentLine=112132096;
 //BA.debugLineNum = 112132096;BA.debugLine="Sub SetVHtml(h As String) As VMElement";
RDebugUtils.currentLine=112132097;
 //BA.debugLineNum = 112132097;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
RDebugUtils.currentLine=112132098;
 //BA.debugLineNum = 112132098;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
RDebugUtils.currentLine=112132099;
 //BA.debugLineNum = 112132099;BA.debugLine="Element.SetAttr(\"v-html\", h)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"v-html",_h);
RDebugUtils.currentLine=112132100;
 //BA.debugLineNum = 112132100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=112132101;
 //BA.debugLineNum = 112132101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvisible(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=109576192;
 //BA.debugLineNum = 109576192;BA.debugLine="Sub SetVisible(b As Boolean) As VMElement";
RDebugUtils.currentLine=109576193;
 //BA.debugLineNum = 109576193;BA.debugLine="vue.SetStateSingle(showKey, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._showkey /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=109576194;
 //BA.debugLineNum = 109576194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=109576195;
 //BA.debugLineNum = 109576195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvon(b4j.example.vmelement __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvon", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvon", new Object[] {_t}));}
RDebugUtils.currentLine=111673344;
 //BA.debugLineNum = 111673344;BA.debugLine="Sub SetVOn(t As Object) As VMElement";
RDebugUtils.currentLine=111673345;
 //BA.debugLineNum = 111673345;BA.debugLine="SetAttr(CreateMap(\"v-on\": t))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-on"),_t}));
RDebugUtils.currentLine=111673346;
 //BA.debugLineNum = 111673346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111673347;
 //BA.debugLineNum = 111673347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvonce(b4j.example.vmelement __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvonce", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvonce", new Object[] {_t}));}
RDebugUtils.currentLine=111869952;
 //BA.debugLineNum = 111869952;BA.debugLine="Sub SetVOnce(t As Object) As VMElement";
RDebugUtils.currentLine=111869953;
 //BA.debugLineNum = 111869953;BA.debugLine="SetAttr(CreateMap(\"v-once\": t))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-once"),_t}));
RDebugUtils.currentLine=111869954;
 //BA.debugLineNum = 111869954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111869955;
 //BA.debugLineNum = 111869955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvtext(b4j.example.vmelement __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setvtext", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setvtext", new Object[] {_t}));}
RDebugUtils.currentLine=111476736;
 //BA.debugLineNum = 111476736;BA.debugLine="Sub SetVText(t As Object) As VMElement";
RDebugUtils.currentLine=111476737;
 //BA.debugLineNum = 111476737;BA.debugLine="SetAttr(CreateMap(\"v-text\": t))";
__ref._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("v-text"),_t}));
RDebugUtils.currentLine=111476738;
 //BA.debugLineNum = 111476738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=111476739;
 //BA.debugLineNum = 111476739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setwaterfall(b4j.example.vmelement __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmelement";
if (Debug.shouldDelegate(ba, "setwaterfall", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "setwaterfall", new Object[] {_b}));}
RDebugUtils.currentLine=114491392;
 //BA.debugLineNum = 114491392;BA.debugLine="Sub SetWaterfall(b As Boolean) As VMElement";
RDebugUtils.currentLine=114491393;
 //BA.debugLineNum = 114491393;BA.debugLine="Element.SetAttr(\":md-waterfall\", b)";
__ref._element /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,":md-waterfall",BA.ObjectToString(_b));
RDebugUtils.currentLine=114491394;
 //BA.debugLineNum = 114491394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
RDebugUtils.currentLine=114491395;
 //BA.debugLineNum = 114491395;BA.debugLine="End Sub";
return null;
}
}