package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmlist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlist.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _list = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hascontent = false;
public Object _eventhandler = null;
public boolean _ispropertybag = false;
public String _expands = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmlist  _initialize(b4j.example.vmlist __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_module}));}
RDebugUtils.currentLine=163446784;
 //BA.debugLineNum = 163446784;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=163446785;
 //BA.debugLineNum = 163446785;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=163446786;
 //BA.debugLineNum = 163446786;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=163446787;
 //BA.debugLineNum = 163446787;BA.debugLine="List.Initialize(vue, ID).SetTag(\"md-list\")";
__ref._list /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-list");
RDebugUtils.currentLine=163446788;
 //BA.debugLineNum = 163446788;BA.debugLine="HasContent = False";
__ref._hascontent /*boolean*/  = __c.False;
RDebugUtils.currentLine=163446789;
 //BA.debugLineNum = 163446789;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=163446790;
 //BA.debugLineNum = 163446790;BA.debugLine="isPropertyBag = False";
__ref._ispropertybag /*boolean*/  = __c.False;
RDebugUtils.currentLine=163446791;
 //BA.debugLineNum = 163446791;BA.debugLine="expandS = $\"${ID}expandsingle\"$";
__ref._expands /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"expandsingle");
RDebugUtils.currentLine=163446792;
 //BA.debugLineNum = 163446792;BA.debugLine="vue.SetStateFalse(expandS)";
__ref._vue /*b4j.example.bananovue*/ ._setstatefalse /*b4j.example.bananovue*/ (null,__ref._expands /*String*/ );
RDebugUtils.currentLine=163446793;
 //BA.debugLineNum = 163446793;BA.debugLine="SetExpandSingle(False)";
__ref._setexpandsingle /*b4j.example.vmlist*/ (null,__c.False);
RDebugUtils.currentLine=163446794;
 //BA.debugLineNum = 163446794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=163446795;
 //BA.debugLineNum = 163446795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvshow(b4j.example.vmlist __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=163708928;
 //BA.debugLineNum = 163708928;BA.debugLine="Sub SetVShow(vif As Object) As VMList";
RDebugUtils.currentLine=163708929;
 //BA.debugLineNum = 163708929;BA.debugLine="List.SetVShow(vif)";
__ref._list /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=163708930;
 //BA.debugLineNum = 163708930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=163708931;
 //BA.debugLineNum = 163708931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _addsubheader(b4j.example.vmlist __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addsubheader", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "addsubheader", new Object[] {_t}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=165478400;
 //BA.debugLineNum = 165478400;BA.debugLine="Sub AddSubHeader(t As Object) As VMList";
RDebugUtils.currentLine=165478401;
 //BA.debugLineNum = 165478401;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=165478402;
 //BA.debugLineNum = 165478402;BA.debugLine="el.Initialize(vue, \"\").SetTagSubHeader(True).SetT";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"")._settagsubheader /*b4j.example.vmelement*/ (null,__c.True)._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t))._pop /*String*/ (null,__ref._list /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=165478403;
 //BA.debugLineNum = 165478403;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=165478404;
 //BA.debugLineNum = 165478404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165478405;
 //BA.debugLineNum = 165478405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdoubleline(b4j.example.vmlist __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setdoubleline", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setdoubleline", new Object[] {_b}));}
RDebugUtils.currentLine=165281792;
 //BA.debugLineNum = 165281792;BA.debugLine="Sub SetDoubleLine(b As Boolean) As VMList";
RDebugUtils.currentLine=165281793;
 //BA.debugLineNum = 165281793;BA.debugLine="If b Then List.SetDoubleLine(True)";
if (_b) { 
__ref._list /*b4j.example.vmelement*/ ._setdoubleline /*b4j.example.vmelement*/ (null,__c.True);};
RDebugUtils.currentLine=165281794;
 //BA.debugLineNum = 165281794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165281795;
 //BA.debugLineNum = 165281795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settripleline(b4j.example.vmlist __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "settripleline", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "settripleline", new Object[] {_b}));}
RDebugUtils.currentLine=165412864;
 //BA.debugLineNum = 165412864;BA.debugLine="Sub SetTripleLine(b As Boolean) As VMList";
RDebugUtils.currentLine=165412865;
 //BA.debugLineNum = 165412865;BA.debugLine="If b Then AddClass(\"md-triple-line\")";
if (_b) { 
__ref._addclass /*b4j.example.vmlist*/ (null,"md-triple-line");};
RDebugUtils.currentLine=165412866;
 //BA.debugLineNum = 165412866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165412867;
 //BA.debugLineNum = 165412867;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmlist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=165609472;
 //BA.debugLineNum = 165609472;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=165609473;
 //BA.debugLineNum = 165609473;BA.debugLine="Return List.tostring";
if (true) return __ref._list /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=165609474;
 //BA.debugLineNum = 165609474;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _setexpandsingle(b4j.example.vmlist __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setexpandsingle", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setexpandsingle", new Object[] {_b}));}
RDebugUtils.currentLine=165347328;
 //BA.debugLineNum = 165347328;BA.debugLine="Sub SetExpandSingle(b As Boolean) As VMList";
RDebugUtils.currentLine=165347329;
 //BA.debugLineNum = 165347329;BA.debugLine="expandS = $\"${ID}expandsingle\"$";
__ref._expands /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"expandsingle");
RDebugUtils.currentLine=165347330;
 //BA.debugLineNum = 165347330;BA.debugLine="vue.SetStateSingle(expandS, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._expands /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=165347331;
 //BA.debugLineNum = 165347331;BA.debugLine="List.SetAttr(CreateMap(\":md-expand-single\": expan";
__ref._list /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-expand-single"),(Object)(__ref._expands /*String*/ )}));
RDebugUtils.currentLine=165347332;
 //BA.debugLineNum = 165347332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165347333;
 //BA.debugLineNum = 165347333;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmlist __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=165740544;
 //BA.debugLineNum = 165740544;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=165740545;
 //BA.debugLineNum = 165740545;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=165740546;
 //BA.debugLineNum = 165740546;BA.debugLine="End Sub";
return "";
}
public String  _addbutton(b4j.example.vmlist __ref,String _btnid,String _btntext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addbutton", true))
	 {return ((String) Debug.delegate(ba, "addbutton", new Object[] {_btnid,_btntext}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=163971072;
 //BA.debugLineNum = 163971072;BA.debugLine="Sub AddButton(btnID As String, btnText As String)";
RDebugUtils.currentLine=163971073;
 //BA.debugLineNum = 163971073;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=163971074;
 //BA.debugLineNum = 163971074;BA.debugLine="li.Initialize(vue, $\"${btnID}li\"$, eventHandler).";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_btnid))+"li"),__ref._eventhandler /*Object*/ )._addbutton /*b4j.example.vmlistitem*/ (null,_btnid,_btntext);
RDebugUtils.currentLine=163971075;
 //BA.debugLineNum = 163971075;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=163971076;
 //BA.debugLineNum = 163971076;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important")}));
 };
RDebugUtils.currentLine=163971078;
 //BA.debugLineNum = 163971078;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=163971079;
 //BA.debugLineNum = 163971079;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=163971080;
 //BA.debugLineNum = 163971080;BA.debugLine="End Sub";
return "";
}
public String  _addcheckbox(b4j.example.vmlist __ref,String _vmodel,boolean _vvalue,String _vtext,boolean _bprimary) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addcheckbox", true))
	 {return ((String) Debug.delegate(ba, "addcheckbox", new Object[] {_vmodel,_vvalue,_vtext,_bprimary}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=164036608;
 //BA.debugLineNum = 164036608;BA.debugLine="Sub AddCheckBox(vmodel As String, vValue As Boolea";
RDebugUtils.currentLine=164036609;
 //BA.debugLineNum = 164036609;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164036610;
 //BA.debugLineNum = 164036610;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._addcheckbox /*b4j.example.vmlistitem*/ (null,_vmodel,_vvalue,_vtext,_bprimary);
RDebugUtils.currentLine=164036611;
 //BA.debugLineNum = 164036611;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=164036612;
 //BA.debugLineNum = 164036612;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("32px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
RDebugUtils.currentLine=164036616;
 //BA.debugLineNum = 164036616;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164036617;
 //BA.debugLineNum = 164036617;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=164036618;
 //BA.debugLineNum = 164036618;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _addclass(b4j.example.vmlist __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=165019648;
 //BA.debugLineNum = 165019648;BA.debugLine="Sub AddClass(c As String) As VMList";
RDebugUtils.currentLine=165019649;
 //BA.debugLineNum = 165019649;BA.debugLine="List.AddClass(c)";
__ref._list /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=165019650;
 //BA.debugLineNum = 165019650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165019651;
 //BA.debugLineNum = 165019651;BA.debugLine="End Sub";
return null;
}
public String  _adddatepicker(b4j.example.vmlist __ref,String _vmodel,String _vtext,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "adddatepicker", true))
	 {return ((String) Debug.delegate(ba, "adddatepicker", new Object[] {_vmodel,_vtext,_vvalue}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=164102144;
 //BA.debugLineNum = 164102144;BA.debugLine="Sub AddDatePicker(vmodel As String, vText As Strin";
RDebugUtils.currentLine=164102145;
 //BA.debugLineNum = 164102145;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164102146;
 //BA.debugLineNum = 164102146;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._adddatepicker /*b4j.example.vmlistitem*/ (null,_vmodel,_vtext,_vvalue);
RDebugUtils.currentLine=164102147;
 //BA.debugLineNum = 164102147;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=164102148;
 //BA.debugLineNum = 164102148;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
RDebugUtils.currentLine=164102152;
 //BA.debugLineNum = 164102152;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164102153;
 //BA.debugLineNum = 164102153;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=164102154;
 //BA.debugLineNum = 164102154;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _adddivider(b4j.example.vmlist __ref,boolean _binset) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "adddivider", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "adddivider", new Object[] {_binset}));}
b4j.example.vmdivider _el = null;
RDebugUtils.currentLine=165543936;
 //BA.debugLineNum = 165543936;BA.debugLine="Sub AddDivider(bInset As Boolean) As VMList";
RDebugUtils.currentLine=165543937;
 //BA.debugLineNum = 165543937;BA.debugLine="Dim el As VMDivider";
_el = new b4j.example.vmdivider();
RDebugUtils.currentLine=165543938;
 //BA.debugLineNum = 165543938;BA.debugLine="el.Initialize(vue, \"\").SetInset(bInset)";
_el._initialize /*b4j.example.vmdivider*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"")._setinset /*b4j.example.vmdivider*/ (null,_binset);
RDebugUtils.currentLine=165543939;
 //BA.debugLineNum = 165543939;BA.debugLine="el.Pop(List)";
_el._pop /*String*/ (null,__ref._list /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=165543940;
 //BA.debugLineNum = 165543940;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=165543941;
 //BA.debugLineNum = 165543941;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165543942;
 //BA.debugLineNum = 165543942;BA.debugLine="End Sub";
return null;
}
public String  _addiconbutton(b4j.example.vmlist __ref,String _btnid,String _btnicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addiconbutton", true))
	 {return ((String) Debug.delegate(ba, "addiconbutton", new Object[] {_btnid,_btnicon}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=163840000;
 //BA.debugLineNum = 163840000;BA.debugLine="Sub AddIconButton(btnID As String, btnIcon As Stri";
RDebugUtils.currentLine=163840001;
 //BA.debugLineNum = 163840001;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=163840002;
 //BA.debugLineNum = 163840002;BA.debugLine="li.Initialize(vue, $\"${btnID}li\"$, eventHandler).";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_btnid))+"li"),__ref._eventhandler /*Object*/ )._addiconbutton /*b4j.example.vmlistitem*/ (null,_btnid,_btnicon);
RDebugUtils.currentLine=163840003;
 //BA.debugLineNum = 163840003;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=163840004;
 //BA.debugLineNum = 163840004;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important")}));
 };
RDebugUtils.currentLine=163840006;
 //BA.debugLineNum = 163840006;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=163840007;
 //BA.debugLineNum = 163840007;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=163840008;
 //BA.debugLineNum = 163840008;BA.debugLine="End Sub";
return "";
}
public String  _addinput(b4j.example.vmlist __ref,String _typeof,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addinput", true))
	 {return ((String) Debug.delegate(ba, "addinput", new Object[] {_typeof,_vmodel,_vtext,_vicon,_vvalue}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=163905536;
 //BA.debugLineNum = 163905536;BA.debugLine="Sub AddInput(typeOf As String, vModel As String, v";
RDebugUtils.currentLine=163905537;
 //BA.debugLineNum = 163905537;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=163905538;
 //BA.debugLineNum = 163905538;BA.debugLine="li.Initialize(vue, $\"${vModel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._addinput /*b4j.example.vmlistitem*/ (null,_typeof,_vmodel,_vtext,_vicon,_vvalue);
RDebugUtils.currentLine=163905539;
 //BA.debugLineNum = 163905539;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=163905540;
 //BA.debugLineNum = 163905540;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("10px !important")}));
 };
RDebugUtils.currentLine=163905544;
 //BA.debugLineNum = 163905544;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=163905545;
 //BA.debugLineNum = 163905545;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=163905546;
 //BA.debugLineNum = 163905546;BA.debugLine="End Sub";
return "";
}
public String  _addlabel(b4j.example.vmlist __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addlabel", true))
	 {return ((String) Debug.delegate(ba, "addlabel", new Object[] {_txt}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=163774464;
 //BA.debugLineNum = 163774464;BA.debugLine="Sub AddLabel(txt As String)";
RDebugUtils.currentLine=163774465;
 //BA.debugLineNum = 163774465;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=163774466;
 //BA.debugLineNum = 163774466;BA.debugLine="li.Initialize(vue, \"\",eventHandler).AddLabel(txt)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"",__ref._eventhandler /*Object*/ )._addlabel /*b4j.example.vmlistitem*/ (null,_txt);
RDebugUtils.currentLine=163774467;
 //BA.debugLineNum = 163774467;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=163774468;
 //BA.debugLineNum = 163774468;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("32px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
RDebugUtils.currentLine=163774473;
 //BA.debugLineNum = 163774473;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=163774474;
 //BA.debugLineNum = 163774474;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=163774475;
 //BA.debugLineNum = 163774475;BA.debugLine="End Sub";
return "";
}
public String  _addnumberinput(b4j.example.vmlist __ref,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addnumberinput", true))
	 {return ((String) Debug.delegate(ba, "addnumberinput", new Object[] {_vmodel,_label,_minvalue,_maxvalue,_value}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=164298752;
 //BA.debugLineNum = 164298752;BA.debugLine="Sub AddNumberInput(vmodel As String, Label As Stri";
RDebugUtils.currentLine=164298753;
 //BA.debugLineNum = 164298753;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164298754;
 //BA.debugLineNum = 164298754;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._addnumberinput /*b4j.example.vmlistitem*/ (null,_vmodel,_label,_minvalue,_maxvalue,_value);
RDebugUtils.currentLine=164298755;
 //BA.debugLineNum = 164298755;BA.debugLine="li.AddClass(\"numberinput\")";
_li._addclass /*b4j.example.vmlistitem*/ (null,"numberinput");
RDebugUtils.currentLine=164298756;
 //BA.debugLineNum = 164298756;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=164298757;
 //BA.debugLineNum = 164298757;BA.debugLine="li.SetStyle(CreateMap(\"padding-top\": \"10px !impo";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
RDebugUtils.currentLine=164298760;
 //BA.debugLineNum = 164298760;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164298761;
 //BA.debugLineNum = 164298761;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=164298762;
 //BA.debugLineNum = 164298762;BA.debugLine="End Sub";
return "";
}
public String  _addradio(b4j.example.vmlist __ref,String _vmodel,String _vvalue,String _vtext,boolean _bprimary,boolean _bdesignmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addradio", true))
	 {return ((String) Debug.delegate(ba, "addradio", new Object[] {_vmodel,_vvalue,_vtext,_bprimary,_bdesignmode}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=164495360;
 //BA.debugLineNum = 164495360;BA.debugLine="Sub AddRadio(vmodel As String, vValue As String, v";
RDebugUtils.currentLine=164495361;
 //BA.debugLineNum = 164495361;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164495362;
 //BA.debugLineNum = 164495362;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._setradio /*b4j.example.vmlistitem*/ (null,_vmodel,_vvalue,_vtext,_bprimary,_bdesignmode);
RDebugUtils.currentLine=164495363;
 //BA.debugLineNum = 164495363;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=164495364;
 //BA.debugLineNum = 164495364;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("32px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
RDebugUtils.currentLine=164495369;
 //BA.debugLineNum = 164495369;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164495370;
 //BA.debugLineNum = 164495370;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=164495371;
 //BA.debugLineNum = 164495371;BA.debugLine="End Sub";
return "";
}
public String  _addselect(b4j.example.vmlist __ref,String _vmodel,String _vtext,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addselect", true))
	 {return ((String) Debug.delegate(ba, "addselect", new Object[] {_vmodel,_vtext,_sourcename,_options,_sourcefield,_displayfield}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=164167680;
 //BA.debugLineNum = 164167680;BA.debugLine="Sub AddSelect(vmodel As String, vText As String, s";
RDebugUtils.currentLine=164167681;
 //BA.debugLineNum = 164167681;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164167682;
 //BA.debugLineNum = 164167682;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._addselect /*b4j.example.vmlistitem*/ (null,_vmodel,_vtext,_sourcename,_options,_sourcefield,_displayfield);
RDebugUtils.currentLine=164167683;
 //BA.debugLineNum = 164167683;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=164167684;
 //BA.debugLineNum = 164167684;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
RDebugUtils.currentLine=164167688;
 //BA.debugLineNum = 164167688;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164167689;
 //BA.debugLineNum = 164167689;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=164167690;
 //BA.debugLineNum = 164167690;BA.debugLine="End Sub";
return "";
}
public String  _addslider(b4j.example.vmlist __ref,String _vmodel,String _label,int _minvalue,int _maxvalue,int _value,boolean _labelontop) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addslider", true))
	 {return ((String) Debug.delegate(ba, "addslider", new Object[] {_vmodel,_label,_minvalue,_maxvalue,_value,_labelontop}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=164233216;
 //BA.debugLineNum = 164233216;BA.debugLine="Sub AddSlider(vmodel As String, Label As String, m";
RDebugUtils.currentLine=164233217;
 //BA.debugLineNum = 164233217;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164233218;
 //BA.debugLineNum = 164233218;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._addslider /*b4j.example.vmlistitem*/ (null,_vmodel,_label,_minvalue,_maxvalue,_value,_labelontop);
RDebugUtils.currentLine=164233219;
 //BA.debugLineNum = 164233219;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=164233220;
 //BA.debugLineNum = 164233220;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
RDebugUtils.currentLine=164233225;
 //BA.debugLineNum = 164233225;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164233226;
 //BA.debugLineNum = 164233226;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=164233227;
 //BA.debugLineNum = 164233227;BA.debugLine="End Sub";
return "";
}
public String  _addswitch(b4j.example.vmlist __ref,String _vmodel,String _vtext,boolean _bprimary,boolean _bvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addswitch", true))
	 {return ((String) Debug.delegate(ba, "addswitch", new Object[] {_vmodel,_vtext,_bprimary,_bvalue}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=164429824;
 //BA.debugLineNum = 164429824;BA.debugLine="Sub AddSwitch(vmodel As String, vText As String, b";
RDebugUtils.currentLine=164429825;
 //BA.debugLineNum = 164429825;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164429826;
 //BA.debugLineNum = 164429826;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._setswitch /*b4j.example.vmlistitem*/ (null,_vmodel,_vtext,_bprimary,_bvalue);
RDebugUtils.currentLine=164429827;
 //BA.debugLineNum = 164429827;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=164429828;
 //BA.debugLineNum = 164429828;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
RDebugUtils.currentLine=164429832;
 //BA.debugLineNum = 164429832;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164429833;
 //BA.debugLineNum = 164429833;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=164429834;
 //BA.debugLineNum = 164429834;BA.debugLine="End Sub";
return "";
}
public String  _addtextarea(b4j.example.vmlist __ref,String _vmodel,String _vtext,String _vvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addtextarea", true))
	 {return ((String) Debug.delegate(ba, "addtextarea", new Object[] {_vmodel,_vtext,_vvalue}));}
b4j.example.vmlistitem _li = null;
RDebugUtils.currentLine=164364288;
 //BA.debugLineNum = 164364288;BA.debugLine="Sub AddTextArea(vmodel As String, vText As String,";
RDebugUtils.currentLine=164364289;
 //BA.debugLineNum = 164364289;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164364290;
 //BA.debugLineNum = 164364290;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),__ref._eventhandler /*Object*/ )._addtextarea /*b4j.example.vmlistitem*/ (null,_vmodel,_vtext,_vvalue);
RDebugUtils.currentLine=164364291;
 //BA.debugLineNum = 164364291;BA.debugLine="If isPropertyBag Then";
if (__ref._ispropertybag /*boolean*/ ) { 
RDebugUtils.currentLine=164364292;
 //BA.debugLineNum = 164364292;BA.debugLine="li.SetStyle(CreateMap(\"height\":\"130px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("130px !important"),(Object)("padding-top"),(Object)("10px !important")}));
 };
RDebugUtils.currentLine=164364294;
 //BA.debugLineNum = 164364294;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164364295;
 //BA.debugLineNum = 164364295;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ (null,(b4j.example.vmlist)(this));
RDebugUtils.currentLine=164364296;
 //BA.debugLineNum = 164364296;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmlist __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=165806080;
 //BA.debugLineNum = 165806080;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=165806081;
 //BA.debugLineNum = 165806081;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=165806082;
 //BA.debugLineNum = 165806082;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmlist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
RDebugUtils.currentLine=163381248;
 //BA.debugLineNum = 163381248;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=163381249;
 //BA.debugLineNum = 163381249;BA.debugLine="Public List As VMElement";
_list = new b4j.example.vmelement();
RDebugUtils.currentLine=163381250;
 //BA.debugLineNum = 163381250;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=163381251;
 //BA.debugLineNum = 163381251;BA.debugLine="Public vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=163381252;
 //BA.debugLineNum = 163381252;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
RDebugUtils.currentLine=163381253;
 //BA.debugLineNum = 163381253;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
RDebugUtils.currentLine=163381254;
 //BA.debugLineNum = 163381254;BA.debugLine="Public isPropertyBag As Boolean";
_ispropertybag = false;
RDebugUtils.currentLine=163381255;
 //BA.debugLineNum = 163381255;BA.debugLine="Private expandS As String";
_expands = "";
RDebugUtils.currentLine=163381256;
 //BA.debugLineNum = 163381256;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdivider  _createdivider(b4j.example.vmlist __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "createdivider", true))
	 {return ((b4j.example.vmdivider) Debug.delegate(ba, "createdivider", new Object[] {_b}));}
b4j.example.vmdivider _el = null;
RDebugUtils.currentLine=164757504;
 //BA.debugLineNum = 164757504;BA.debugLine="Sub CreateDivider(b As Boolean) As VMDivider";
RDebugUtils.currentLine=164757505;
 //BA.debugLineNum = 164757505;BA.debugLine="Dim el As VMDivider";
_el = new b4j.example.vmdivider();
RDebugUtils.currentLine=164757506;
 //BA.debugLineNum = 164757506;BA.debugLine="el.Initialize(vue, \"\")";
_el._initialize /*b4j.example.vmdivider*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"");
RDebugUtils.currentLine=164757507;
 //BA.debugLineNum = 164757507;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164757508;
 //BA.debugLineNum = 164757508;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=164757509;
 //BA.debugLineNum = 164757509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _createitem(b4j.example.vmlist __ref,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "createitem", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "createitem", new Object[] {_itemid}));}
b4j.example.vmlistitem _el = null;
RDebugUtils.currentLine=164691968;
 //BA.debugLineNum = 164691968;BA.debugLine="Sub CreateItem(itemID As String) As VMListItem";
RDebugUtils.currentLine=164691969;
 //BA.debugLineNum = 164691969;BA.debugLine="Dim el As VMListItem";
_el = new b4j.example.vmlistitem();
RDebugUtils.currentLine=164691970;
 //BA.debugLineNum = 164691970;BA.debugLine="el.Initialize(vue, itemID, eventHandler)";
_el._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_itemid,__ref._eventhandler /*Object*/ );
RDebugUtils.currentLine=164691971;
 //BA.debugLineNum = 164691971;BA.debugLine="If itemID = \"\" Then";
if ((_itemid).equals("")) { 
RDebugUtils.currentLine=164691972;
 //BA.debugLineNum = 164691972;BA.debugLine="Log(\"VMList.CreateItem - please specify an item";
__c.Log("VMList.CreateItem - please specify an item id!");
RDebugUtils.currentLine=164691973;
 //BA.debugLineNum = 164691973;BA.debugLine="Return el";
if (true) return _el;
 };
RDebugUtils.currentLine=164691975;
 //BA.debugLineNum = 164691975;BA.debugLine="itemID = itemID.tolowercase";
_itemid = _itemid.toLowerCase();
RDebugUtils.currentLine=164691976;
 //BA.debugLineNum = 164691976;BA.debugLine="If vue.HasState(itemID) = False Then";
if (__ref._vue /*b4j.example.bananovue*/ ._hasstate /*boolean*/ (null,_itemid)==__c.False) { 
RDebugUtils.currentLine=164691977;
 //BA.debugLineNum = 164691977;BA.debugLine="vue.SetStateSingle(itemID, itemID)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_itemid,(Object)(_itemid));
 };
RDebugUtils.currentLine=164691979;
 //BA.debugLineNum = 164691979;BA.debugLine="el.SetID(itemID,True)";
_el._setid /*b4j.example.vmlistitem*/ (null,_itemid,__c.True);
RDebugUtils.currentLine=164691980;
 //BA.debugLineNum = 164691980;BA.debugLine="el.SetKey(itemID,True)";
_el._setkey /*b4j.example.vmlistitem*/ (null,_itemid,__c.True);
RDebugUtils.currentLine=164691981;
 //BA.debugLineNum = 164691981;BA.debugLine="el.SetActionIcon(\"chevron_right\")";
_el._setactionicon /*b4j.example.vmlistitem*/ (null,"chevron_right");
RDebugUtils.currentLine=164691982;
 //BA.debugLineNum = 164691982;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=164691983;
 //BA.debugLineNum = 164691983;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=164691984;
 //BA.debugLineNum = 164691984;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _expanditem(b4j.example.vmlist __ref,String _sid,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "expanditem", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "expanditem", new Object[] {_sid,_b}));}
String _syncid = "";
RDebugUtils.currentLine=163577856;
 //BA.debugLineNum = 163577856;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VML";
RDebugUtils.currentLine=163577857;
 //BA.debugLineNum = 163577857;BA.debugLine="Dim syncid As String = $\"${sid}sync\"$";
_syncid = (""+__c.SmartStringFormatter("",(Object)(_sid))+"sync");
RDebugUtils.currentLine=163577858;
 //BA.debugLineNum = 163577858;BA.debugLine="vue.SetStateSingle(syncid, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_syncid,(Object)(_b));
RDebugUtils.currentLine=163577859;
 //BA.debugLineNum = 163577859;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=163577860;
 //BA.debugLineNum = 163577860;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmlist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=165675008;
 //BA.debugLineNum = 165675008;BA.debugLine="Sub Render";
RDebugUtils.currentLine=165675009;
 //BA.debugLineNum = 165675009;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=165675010;
 //BA.debugLineNum = 165675010;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _setattr(b4j.example.vmlist __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=165085184;
 //BA.debugLineNum = 165085184;BA.debugLine="Sub SetAttr(attr As Map) As VMList";
RDebugUtils.currentLine=165085185;
 //BA.debugLineNum = 165085185;BA.debugLine="List.SetAttr(attr)";
__ref._list /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=165085186;
 //BA.debugLineNum = 165085186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165085187;
 //BA.debugLineNum = 165085187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setborder(b4j.example.vmlist __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setborder", new Object[] {_b}));}
RDebugUtils.currentLine=164888576;
 //BA.debugLineNum = 164888576;BA.debugLine="Sub SetBorder(b As Boolean) As VMList";
RDebugUtils.currentLine=164888577;
 //BA.debugLineNum = 164888577;BA.debugLine="If b Then SetStyle(CreateMap(\"border\": \"1px solid";
if (_b) { 
__ref._setstyle /*b4j.example.vmlist*/ (null,__c.createMap(new Object[] {(Object)("border"),(Object)("1px solid rgba(#000, .12)")}));};
RDebugUtils.currentLine=164888578;
 //BA.debugLineNum = 164888578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=164888579;
 //BA.debugLineNum = 164888579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setstyle(b4j.example.vmlist __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=164823040;
 //BA.debugLineNum = 164823040;BA.debugLine="Sub SetStyle(m As Map) As VMList";
RDebugUtils.currentLine=164823041;
 //BA.debugLineNum = 164823041;BA.debugLine="List.SetStyle(m)";
__ref._list /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=164823042;
 //BA.debugLineNum = 164823042;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=164823043;
 //BA.debugLineNum = 164823043;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdense(b4j.example.vmlist __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setdense", new Object[] {_b}));}
RDebugUtils.currentLine=164560896;
 //BA.debugLineNum = 164560896;BA.debugLine="Sub SetDense(b As Boolean) As VMList";
RDebugUtils.currentLine=164560897;
 //BA.debugLineNum = 164560897;BA.debugLine="If b Then AddClass(\"md-dense\")";
if (_b) { 
__ref._addclass /*b4j.example.vmlist*/ (null,"md-dense");};
RDebugUtils.currentLine=164560898;
 //BA.debugLineNum = 164560898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=164560899;
 //BA.debugLineNum = 164560899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdisabled(b4j.example.vmlist __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=163512320;
 //BA.debugLineNum = 163512320;BA.debugLine="Sub SetDisabled(b As Boolean) As VMList";
RDebugUtils.currentLine=163512321;
 //BA.debugLineNum = 163512321;BA.debugLine="List.SetDisabled(b)";
__ref._list /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=163512322;
 //BA.debugLineNum = 163512322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=163512323;
 //BA.debugLineNum = 163512323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setelevation(b4j.example.vmlist __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=164954112;
 //BA.debugLineNum = 164954112;BA.debugLine="Sub SetElevation(e As Int) As VMList";
RDebugUtils.currentLine=164954113;
 //BA.debugLineNum = 164954113;BA.debugLine="List.SetElevation(e)";
__ref._list /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=164954114;
 //BA.debugLineNum = 164954114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=164954115;
 //BA.debugLineNum = 164954115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setslotexpand(b4j.example.vmlist __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setslotexpand", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setslotexpand", new Object[] {_b}));}
RDebugUtils.currentLine=165216256;
 //BA.debugLineNum = 165216256;BA.debugLine="Sub SetSlotExpand(b As Boolean) As VMList";
RDebugUtils.currentLine=165216257;
 //BA.debugLineNum = 165216257;BA.debugLine="If b Then List.SetAttr(CreateMap(\"slot\":\"md-expan";
if (_b) { 
__ref._list /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("slot"),(Object)("md-expand")}));};
RDebugUtils.currentLine=165216258;
 //BA.debugLineNum = 165216258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165216259;
 //BA.debugLineNum = 165216259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settabindex(b4j.example.vmlist __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=163643392;
 //BA.debugLineNum = 163643392;BA.debugLine="Sub SetTabIndex(ti As String) As VMList";
RDebugUtils.currentLine=163643393;
 //BA.debugLineNum = 163643393;BA.debugLine="List.SetTabIndex(ti)";
__ref._list /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=163643394;
 //BA.debugLineNum = 163643394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=163643395;
 //BA.debugLineNum = 163643395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settext(b4j.example.vmlist __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=165150720;
 //BA.debugLineNum = 165150720;BA.debugLine="Sub SetText(t As String) As VMList";
RDebugUtils.currentLine=165150721;
 //BA.debugLineNum = 165150721;BA.debugLine="List.SetText(t)";
__ref._list /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=165150722;
 //BA.debugLineNum = 165150722;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=165150723;
 //BA.debugLineNum = 165150723;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=165150724;
 //BA.debugLineNum = 165150724;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvif(b4j.example.vmlist __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlist";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=164626432;
 //BA.debugLineNum = 164626432;BA.debugLine="Sub SetVIf(vif As Object) As VMList";
RDebugUtils.currentLine=164626433;
 //BA.debugLineNum = 164626433;BA.debugLine="List.SetVIf(vif)";
__ref._list /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=164626434;
 //BA.debugLineNum = 164626434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
RDebugUtils.currentLine=164626435;
 //BA.debugLineNum = 164626435;BA.debugLine="End Sub";
return null;
}
}