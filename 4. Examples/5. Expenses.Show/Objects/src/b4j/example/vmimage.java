package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmimage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmimage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmimage.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _image = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hastt = false;
public b4j.example.vmtooltip _tt = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmimage  _initialize(b4j.example.vmimage __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=143327232;
 //BA.debugLineNum = 143327232;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=143327233;
 //BA.debugLineNum = 143327233;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=143327234;
 //BA.debugLineNum = 143327234;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=143327235;
 //BA.debugLineNum = 143327235;BA.debugLine="Image.Initialize(vue, ID).SetTag(\"img\")";
__ref._image /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"img");
RDebugUtils.currentLine=143327236;
 //BA.debugLineNum = 143327236;BA.debugLine="hasTT = False";
__ref._hastt /*boolean*/  = __c.False;
RDebugUtils.currentLine=143327237;
 //BA.debugLineNum = 143327237;BA.debugLine="Image.SetOnClick(eventHandler, $\"${ID}_click\"$)";
__ref._image /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,_eventhandler,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=143327238;
 //BA.debugLineNum = 143327238;BA.debugLine="Image.SetOnTouchStart(module, $\"${ID}_touchstart\"";
__ref._image /*b4j.example.vmelement*/ ._setontouchstart /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_touchstart"));
RDebugUtils.currentLine=143327239;
 //BA.debugLineNum = 143327239;BA.debugLine="Image.SetOnDragOver(module, $\"${ID}_dragover\"$)";
__ref._image /*b4j.example.vmelement*/ ._setondragover /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_dragover"));
RDebugUtils.currentLine=143327240;
 //BA.debugLineNum = 143327240;BA.debugLine="Image.setondragstart(module, $\"${ID}_dragstart\"$)";
__ref._image /*b4j.example.vmelement*/ ._setondragstart /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_dragstart"));
RDebugUtils.currentLine=143327241;
 //BA.debugLineNum = 143327241;BA.debugLine="Image.SetOnDragEnd(module, $\"${ID}_dragend\"$)";
__ref._image /*b4j.example.vmelement*/ ._setondragend /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_dragend"));
RDebugUtils.currentLine=143327242;
 //BA.debugLineNum = 143327242;BA.debugLine="Image.setondragenter(module, $\"${ID}_dragenter\"$)";
__ref._image /*b4j.example.vmelement*/ ._setondragenter /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_dragenter"));
RDebugUtils.currentLine=143327243;
 //BA.debugLineNum = 143327243;BA.debugLine="Image.SetOnDrop(module, $\"${ID}_drop\"$)";
__ref._image /*b4j.example.vmelement*/ ._setondrop /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_drop"));
RDebugUtils.currentLine=143327244;
 //BA.debugLineNum = 143327244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143327245;
 //BA.debugLineNum = 143327245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvalue(b4j.example.vmimage __ref,String _valuename,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setvalue", new Object[] {_valuename,_bind}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=144834560;
 //BA.debugLineNum = 144834560;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
RDebugUtils.currentLine=144834561;
 //BA.debugLineNum = 144834561;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=144834562;
 //BA.debugLineNum = 144834562;BA.debugLine="valueName = valueName.tolowercase";
_valuename = _valuename.toLowerCase();
RDebugUtils.currentLine=144834563;
 //BA.debugLineNum = 144834563;BA.debugLine="Image.SetSRC($\"${ID}src\"$,True)";
__ref._image /*b4j.example.vmelement*/ ._setsrc /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"src"),__c.True);
RDebugUtils.currentLine=144834564;
 //BA.debugLineNum = 144834564;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=144834565;
 //BA.debugLineNum = 144834565;BA.debugLine="opt.Put($\"${ID}src\"$, valueName)";
_opt.Put((Object)((""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"src")),(Object)(_valuename));
RDebugUtils.currentLine=144834566;
 //BA.debugLineNum = 144834566;BA.debugLine="vue.SetState(opt)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_opt);
 }else {
RDebugUtils.currentLine=144834568;
 //BA.debugLineNum = 144834568;BA.debugLine="Image.SetSRC(valueName, False)";
__ref._image /*b4j.example.vmelement*/ ._setsrc /*b4j.example.vmelement*/ (null,_valuename,__c.False);
RDebugUtils.currentLine=144834569;
 //BA.debugLineNum = 144834569;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
__ref._setattr /*b4j.example.vmimage*/ (null,__c.createMap(new Object[] {(Object)("value"),(Object)(_valuename)}));
 };
RDebugUtils.currentLine=144834571;
 //BA.debugLineNum = 144834571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144834572;
 //BA.debugLineNum = 144834572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setalt(b4j.example.vmimage __ref,String _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setalt", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setalt", new Object[] {_a}));}
RDebugUtils.currentLine=144703488;
 //BA.debugLineNum = 144703488;BA.debugLine="Sub SetAlt(a As String) As VMImage";
RDebugUtils.currentLine=144703489;
 //BA.debugLineNum = 144703489;BA.debugLine="Image.SetAlt(a)";
__ref._image /*b4j.example.vmelement*/ ._setalt /*b4j.example.vmelement*/ (null,_a);
RDebugUtils.currentLine=144703490;
 //BA.debugLineNum = 144703490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144703491;
 //BA.debugLineNum = 144703491;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmimage __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=145096704;
 //BA.debugLineNum = 145096704;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=145096705;
 //BA.debugLineNum = 145096705;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=145096706;
 //BA.debugLineNum = 145096706;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _setwidth(b4j.example.vmimage __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=143917056;
 //BA.debugLineNum = 143917056;BA.debugLine="Sub SetWidth(w As String) As VMImage";
RDebugUtils.currentLine=143917057;
 //BA.debugLineNum = 143917057;BA.debugLine="Image.SetWidth(w)";
__ref._image /*b4j.example.vmelement*/ ._setwidth /*b4j.example.vmelement*/ (null,_w);
RDebugUtils.currentLine=143917058;
 //BA.debugLineNum = 143917058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143917059;
 //BA.debugLineNum = 143917059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setheight(b4j.example.vmimage __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=143982592;
 //BA.debugLineNum = 143982592;BA.debugLine="Sub SetHeight(h As String) As VMImage";
RDebugUtils.currentLine=143982593;
 //BA.debugLineNum = 143982593;BA.debugLine="Image.SetHeight(h)";
__ref._image /*b4j.example.vmelement*/ ._setheight /*b4j.example.vmelement*/ (null,_h);
RDebugUtils.currentLine=143982594;
 //BA.debugLineNum = 143982594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143982595;
 //BA.debugLineNum = 143982595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvmodel(b4j.example.vmimage __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=144900096;
 //BA.debugLineNum = 144900096;BA.debugLine="Sub SetVModel(k As String) As VMImage";
RDebugUtils.currentLine=144900097;
 //BA.debugLineNum = 144900097;BA.debugLine="Image.SetVModel(k)";
__ref._image /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=144900098;
 //BA.debugLineNum = 144900098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144900099;
 //BA.debugLineNum = 144900099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvshow(b4j.example.vmimage __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=143654912;
 //BA.debugLineNum = 143654912;BA.debugLine="Sub SetVShow(vif As String) As VMImage";
RDebugUtils.currentLine=143654913;
 //BA.debugLineNum = 143654913;BA.debugLine="Image.SetVShow(vif)";
__ref._image /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=143654914;
 //BA.debugLineNum = 143654914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143654915;
 //BA.debugLineNum = 143654915;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
b4j.example.vmelement _div = null;
RDebugUtils.currentLine=144965632;
 //BA.debugLineNum = 144965632;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=144965633;
 //BA.debugLineNum = 144965633;BA.debugLine="If hasTT Then";
if (__ref._hastt /*boolean*/ ) { 
RDebugUtils.currentLine=144965634;
 //BA.debugLineNum = 144965634;BA.debugLine="Dim div As VMElement";
_div = new b4j.example.vmelement();
RDebugUtils.currentLine=144965635;
 //BA.debugLineNum = 144965635;BA.debugLine="div.Initialize(vue,$\"${ID}parent\"$)";
_div._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"parent"));
RDebugUtils.currentLine=144965636;
 //BA.debugLineNum = 144965636;BA.debugLine="div.SetText(Image.ToString)";
_div._settext /*b4j.example.vmelement*/ (null,__ref._image /*b4j.example.vmelement*/ ._tostring /*String*/ (null));
RDebugUtils.currentLine=144965637;
 //BA.debugLineNum = 144965637;BA.debugLine="div.SetText(tt.ToString)";
_div._settext /*b4j.example.vmelement*/ (null,__ref._tt /*b4j.example.vmtooltip*/ ._tostring /*String*/ (null));
RDebugUtils.currentLine=144965638;
 //BA.debugLineNum = 144965638;BA.debugLine="Return div.tostring";
if (true) return _div._tostring /*String*/ (null);
 }else {
RDebugUtils.currentLine=144965640;
 //BA.debugLineNum = 144965640;BA.debugLine="Return Image.tostring";
if (true) return __ref._image /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
 };
RDebugUtils.currentLine=144965642;
 //BA.debugLineNum = 144965642;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _addclass(b4j.example.vmimage __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=144637952;
 //BA.debugLineNum = 144637952;BA.debugLine="Sub AddClass(c As String) As VMImage";
RDebugUtils.currentLine=144637953;
 //BA.debugLineNum = 144637953;BA.debugLine="Image.AddClass(c)";
__ref._image /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=144637954;
 //BA.debugLineNum = 144637954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144637955;
 //BA.debugLineNum = 144637955;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
RDebugUtils.currentLine=143261696;
 //BA.debugLineNum = 143261696;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=143261697;
 //BA.debugLineNum = 143261697;BA.debugLine="Public Image As VMElement";
_image = new b4j.example.vmelement();
RDebugUtils.currentLine=143261698;
 //BA.debugLineNum = 143261698;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=143261699;
 //BA.debugLineNum = 143261699;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=143261700;
 //BA.debugLineNum = 143261700;BA.debugLine="Private hasTT As Boolean";
_hastt = false;
RDebugUtils.currentLine=143261701;
 //BA.debugLineNum = 143261701;BA.debugLine="Private tt As VMTooltip";
_tt = new b4j.example.vmtooltip();
RDebugUtils.currentLine=143261702;
 //BA.debugLineNum = 143261702;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=143261703;
 //BA.debugLineNum = 143261703;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=145031168;
 //BA.debugLineNum = 145031168;BA.debugLine="Sub Render";
RDebugUtils.currentLine=145031169;
 //BA.debugLineNum = 145031169;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=145031170;
 //BA.debugLineNum = 145031170;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _setattr(b4j.example.vmimage __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setattr", new Object[] {_m}));}
RDebugUtils.currentLine=144179200;
 //BA.debugLineNum = 144179200;BA.debugLine="Sub SetAttr(m As Map) As VMImage";
RDebugUtils.currentLine=144179201;
 //BA.debugLineNum = 144179201;BA.debugLine="Image.SetAttr(m)";
__ref._image /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=144179202;
 //BA.debugLineNum = 144179202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144179203;
 //BA.debugLineNum = 144179203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setborder(b4j.example.vmimage __ref,String _width,String _color,String _bstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setborder", new Object[] {_width,_color,_bstyle}));}
RDebugUtils.currentLine=144048128;
 //BA.debugLineNum = 144048128;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
RDebugUtils.currentLine=144048129;
 //BA.debugLineNum = 144048129;BA.debugLine="Image.SetBorder(width, color, bstyle)";
__ref._image /*b4j.example.vmelement*/ ._setborder /*b4j.example.vmelement*/ (null,_width,_color,_bstyle);
RDebugUtils.currentLine=144048130;
 //BA.debugLineNum = 144048130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144048131;
 //BA.debugLineNum = 144048131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcursormove(b4j.example.vmimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setcursormove", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setcursormove", null));}
RDebugUtils.currentLine=144375808;
 //BA.debugLineNum = 144375808;BA.debugLine="Sub SetCursorMove As VMImage";
RDebugUtils.currentLine=144375809;
 //BA.debugLineNum = 144375809;BA.debugLine="Image.SetCursorMove";
__ref._image /*b4j.example.vmelement*/ ._setcursormove /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=144375810;
 //BA.debugLineNum = 144375810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144375811;
 //BA.debugLineNum = 144375811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcursorpointer(b4j.example.vmimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setcursorpointer", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setcursorpointer", null));}
RDebugUtils.currentLine=144441344;
 //BA.debugLineNum = 144441344;BA.debugLine="Sub SetCursorPointer As VMImage";
RDebugUtils.currentLine=144441345;
 //BA.debugLineNum = 144441345;BA.debugLine="Image.SetCursorPointer";
__ref._image /*b4j.example.vmelement*/ ._setcursorpointer /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=144441346;
 //BA.debugLineNum = 144441346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144441347;
 //BA.debugLineNum = 144441347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdraggable(b4j.example.vmimage __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setdraggable", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setdraggable", new Object[] {_b}));}
RDebugUtils.currentLine=143785984;
 //BA.debugLineNum = 143785984;BA.debugLine="Sub SetDraggable(b As Boolean) As VMImage";
RDebugUtils.currentLine=143785985;
 //BA.debugLineNum = 143785985;BA.debugLine="Image.SetDraggable(b)";
__ref._image /*b4j.example.vmelement*/ ._setdraggable /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=143785986;
 //BA.debugLineNum = 143785986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143785987;
 //BA.debugLineNum = 143785987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdroppable(b4j.example.vmimage __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setdroppable", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setdroppable", new Object[] {_b}));}
RDebugUtils.currentLine=143851520;
 //BA.debugLineNum = 143851520;BA.debugLine="Sub SetDroppable(b As Boolean) As VMImage";
RDebugUtils.currentLine=143851521;
 //BA.debugLineNum = 143851521;BA.debugLine="Image.SetDroppable(b)";
__ref._image /*b4j.example.vmelement*/ ._setdroppable /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=143851522;
 //BA.debugLineNum = 143851522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143851523;
 //BA.debugLineNum = 143851523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setmarginall(b4j.example.vmimage __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setmarginall", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setmarginall", new Object[] {_p}));}
RDebugUtils.currentLine=144113664;
 //BA.debugLineNum = 144113664;BA.debugLine="Sub SetMarginAll(p As Object) As VMImage";
RDebugUtils.currentLine=144113665;
 //BA.debugLineNum = 144113665;BA.debugLine="Image.SetMarginAll(p)";
__ref._image /*b4j.example.vmelement*/ ._setmarginall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=144113666;
 //BA.debugLineNum = 144113666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144113667;
 //BA.debugLineNum = 144113667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setpaddingall(b4j.example.vmimage __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setpaddingall", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setpaddingall", new Object[] {_p}));}
RDebugUtils.currentLine=144310272;
 //BA.debugLineNum = 144310272;BA.debugLine="Sub SetPaddingAll(p As Object) As VMImage";
RDebugUtils.currentLine=144310273;
 //BA.debugLineNum = 144310273;BA.debugLine="Image.SetPaddingAll(p)";
__ref._image /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=144310274;
 //BA.debugLineNum = 144310274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144310275;
 //BA.debugLineNum = 144310275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setripple(b4j.example.vmimage __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setripple", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setripple", new Object[] {_b}));}
RDebugUtils.currentLine=144244736;
 //BA.debugLineNum = 144244736;BA.debugLine="Sub SetRipple(b As Boolean) As VMImage";
RDebugUtils.currentLine=144244737;
 //BA.debugLineNum = 144244737;BA.debugLine="Image.SetRipple(b)";
__ref._image /*b4j.example.vmelement*/ ._setripple /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=144244738;
 //BA.debugLineNum = 144244738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144244739;
 //BA.debugLineNum = 144244739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setstyle(b4j.example.vmimage __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=144572416;
 //BA.debugLineNum = 144572416;BA.debugLine="Sub SetStyle(m As Map) As VMImage";
RDebugUtils.currentLine=144572417;
 //BA.debugLineNum = 144572417;BA.debugLine="Image.SetStyle(m)";
__ref._image /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=144572418;
 //BA.debugLineNum = 144572418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144572419;
 //BA.debugLineNum = 144572419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settext(b4j.example.vmimage __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=144506880;
 //BA.debugLineNum = 144506880;BA.debugLine="Sub SetText(t As String) As VMImage";
RDebugUtils.currentLine=144506881;
 //BA.debugLineNum = 144506881;BA.debugLine="Image.SetText(t)";
__ref._image /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=144506882;
 //BA.debugLineNum = 144506882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144506883;
 //BA.debugLineNum = 144506883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltipbottom(b4j.example.vmimage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "settooltipbottom", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "settooltipbottom", new Object[] {_text}));}
RDebugUtils.currentLine=143523840;
 //BA.debugLineNum = 143523840;BA.debugLine="Sub SetToolTipBottom(Text As String) As VMImage";
RDebugUtils.currentLine=143523841;
 //BA.debugLineNum = 143523841;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
__ref._tt /*b4j.example.vmtooltip*/ ._initialize /*b4j.example.vmtooltip*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"tlt"))._settext /*b4j.example.vmtooltip*/ (null,(Object)(_text))._setdirectionbottom /*b4j.example.vmtooltip*/ (null,__c.True);
RDebugUtils.currentLine=143523842;
 //BA.debugLineNum = 143523842;BA.debugLine="hasTT = True";
__ref._hastt /*boolean*/  = __c.True;
RDebugUtils.currentLine=143523843;
 //BA.debugLineNum = 143523843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143523844;
 //BA.debugLineNum = 143523844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltipleft(b4j.example.vmimage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "settooltipleft", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "settooltipleft", new Object[] {_text}));}
RDebugUtils.currentLine=143589376;
 //BA.debugLineNum = 143589376;BA.debugLine="Sub SetToolTipLeft(Text As String) As VMImage";
RDebugUtils.currentLine=143589377;
 //BA.debugLineNum = 143589377;BA.debugLine="tt.Initialize(vue,$\"${id}tlt\"$).SetText(Text).Set";
__ref._tt /*b4j.example.vmtooltip*/ ._initialize /*b4j.example.vmtooltip*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"tlt"))._settext /*b4j.example.vmtooltip*/ (null,(Object)(_text))._setdirectionleft /*b4j.example.vmtooltip*/ (null,__c.True);
RDebugUtils.currentLine=143589378;
 //BA.debugLineNum = 143589378;BA.debugLine="hasTT = True";
__ref._hastt /*boolean*/  = __c.True;
RDebugUtils.currentLine=143589379;
 //BA.debugLineNum = 143589379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143589380;
 //BA.debugLineNum = 143589380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltipright(b4j.example.vmimage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "settooltipright", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "settooltipright", new Object[] {_text}));}
RDebugUtils.currentLine=143458304;
 //BA.debugLineNum = 143458304;BA.debugLine="Sub SetToolTipRight(Text As String) As VMImage";
RDebugUtils.currentLine=143458305;
 //BA.debugLineNum = 143458305;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
__ref._tt /*b4j.example.vmtooltip*/ ._initialize /*b4j.example.vmtooltip*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"tlt"))._settext /*b4j.example.vmtooltip*/ (null,(Object)(_text))._setdirectionright /*b4j.example.vmtooltip*/ (null,__c.True);
RDebugUtils.currentLine=143458306;
 //BA.debugLineNum = 143458306;BA.debugLine="hasTT = True";
__ref._hastt /*boolean*/  = __c.True;
RDebugUtils.currentLine=143458307;
 //BA.debugLineNum = 143458307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143458308;
 //BA.debugLineNum = 143458308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltiptop(b4j.example.vmimage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "settooltiptop", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "settooltiptop", new Object[] {_text}));}
RDebugUtils.currentLine=143392768;
 //BA.debugLineNum = 143392768;BA.debugLine="Sub SetToolTipTop(Text As String) As VMImage";
RDebugUtils.currentLine=143392769;
 //BA.debugLineNum = 143392769;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
__ref._tt /*b4j.example.vmtooltip*/ ._initialize /*b4j.example.vmtooltip*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"tlt"))._settext /*b4j.example.vmtooltip*/ (null,(Object)(_text))._setdirectiontop /*b4j.example.vmtooltip*/ (null,__c.True);
RDebugUtils.currentLine=143392770;
 //BA.debugLineNum = 143392770;BA.debugLine="hasTT = True";
__ref._hastt /*boolean*/  = __c.True;
RDebugUtils.currentLine=143392771;
 //BA.debugLineNum = 143392771;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143392772;
 //BA.debugLineNum = 143392772;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setverticalalignmiddle(b4j.example.vmimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setverticalalignmiddle", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setverticalalignmiddle", null));}
RDebugUtils.currentLine=144769024;
 //BA.debugLineNum = 144769024;BA.debugLine="Sub SetVerticalAlignMiddle As VMImage";
RDebugUtils.currentLine=144769025;
 //BA.debugLineNum = 144769025;BA.debugLine="Image.SetVerticalAlignMiddle";
__ref._image /*b4j.example.vmelement*/ ._setverticalalignmiddle /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=144769026;
 //BA.debugLineNum = 144769026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=144769027;
 //BA.debugLineNum = 144769027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvif(b4j.example.vmimage __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmimage";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=143720448;
 //BA.debugLineNum = 143720448;BA.debugLine="Sub SetVIf(vif As String) As VMImage";
RDebugUtils.currentLine=143720449;
 //BA.debugLineNum = 143720449;BA.debugLine="Image.SetVIf(vif)";
__ref._image /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=143720450;
 //BA.debugLineNum = 143720450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
RDebugUtils.currentLine=143720451;
 //BA.debugLineNum = 143720451;BA.debugLine="End Sub";
return null;
}
}