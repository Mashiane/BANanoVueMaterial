package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmimage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmimage", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _image = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hastt = false;
public b4j.example.vmtooltip _tt = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public b4j.example.vmimage  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub AddClass(c As String) As VMImage";
 //BA.debugLineNum = 127;BA.debugLine="Image.AddClass(c)";
_image._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Image As VMElement";
_image = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private hasTT As Boolean";
_hastt = false;
 //BA.debugLineNum = 7;BA.debugLine="Private tt As VMTooltip";
_tt = new b4j.example.vmtooltip();
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 14;BA.debugLine="Image.Initialize(vue, ID).SetTag(\"img\")";
_image._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("img");
 //BA.debugLineNum = 15;BA.debugLine="hasTT = False";
_hastt = __c.False;
 //BA.debugLineNum = 16;BA.debugLine="Image.SetOnClick(eventHandler, $\"${ID}_click\"$)";
_image._setonclick /*b4j.example.vmelement*/ (_eventhandler,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 17;BA.debugLine="Image.SetOnTouchStart(module, $\"${ID}_touchstart\"";
_image._setontouchstart /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_touchstart"));
 //BA.debugLineNum = 18;BA.debugLine="Image.SetOnDragOver(module, $\"${ID}_dragover\"$)";
_image._setondragover /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_dragover"));
 //BA.debugLineNum = 19;BA.debugLine="Image.setondragstart(module, $\"${ID}_dragstart\"$)";
_image._setondragstart /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_dragstart"));
 //BA.debugLineNum = 20;BA.debugLine="Image.SetOnDragEnd(module, $\"${ID}_dragend\"$)";
_image._setondragend /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_dragend"));
 //BA.debugLineNum = 21;BA.debugLine="Image.setondragenter(module, $\"${ID}_dragenter\"$)";
_image._setondragenter /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_dragenter"));
 //BA.debugLineNum = 22;BA.debugLine="Image.SetOnDrop(module, $\"${ID}_drop\"$)";
_image._setondrop /*b4j.example.vmelement*/ (_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_drop"));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 178;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Render";
 //BA.debugLineNum = 174;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmimage  _setalt(String _a) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetAlt(a As String) As VMImage";
 //BA.debugLineNum = 132;BA.debugLine="Image.SetAlt(a)";
_image._setalt /*b4j.example.vmelement*/ (_a);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setattr(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetAttr(m As Map) As VMImage";
 //BA.debugLineNum = 91;BA.debugLine="Image.SetAttr(m)";
_image._setattr /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setborder(String _width,String _color,String _bstyle) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
 //BA.debugLineNum = 81;BA.debugLine="Image.SetBorder(width, color, bstyle)";
_image._setborder /*b4j.example.vmelement*/ (_width,_color,_bstyle);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcursormove() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetCursorMove As VMImage";
 //BA.debugLineNum = 106;BA.debugLine="Image.SetCursorMove";
_image._setcursormove /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setcursorpointer() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetCursorPointer As VMImage";
 //BA.debugLineNum = 111;BA.debugLine="Image.SetCursorPointer";
_image._setcursorpointer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdraggable(boolean _b) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetDraggable(b As Boolean) As VMImage";
 //BA.debugLineNum = 61;BA.debugLine="Image.SetDraggable(b)";
_image._setdraggable /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setdroppable(boolean _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetDroppable(b As Boolean) As VMImage";
 //BA.debugLineNum = 66;BA.debugLine="Image.SetDroppable(b)";
_image._setdroppable /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetHeight(h As String) As VMImage";
 //BA.debugLineNum = 76;BA.debugLine="Image.SetHeight(h)";
_image._setheight /*b4j.example.vmelement*/ (_h);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setmarginall(Object _p) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetMarginAll(p As Object) As VMImage";
 //BA.debugLineNum = 86;BA.debugLine="Image.SetMarginAll(p)";
_image._setmarginall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setpaddingall(Object _p) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetPaddingAll(p As Object) As VMImage";
 //BA.debugLineNum = 101;BA.debugLine="Image.SetPaddingAll(p)";
_image._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setripple(boolean _b) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetRipple(b As Boolean) As VMImage";
 //BA.debugLineNum = 96;BA.debugLine="Image.SetRipple(b)";
_image._setripple /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetStyle(m As Map) As VMImage";
 //BA.debugLineNum = 121;BA.debugLine="Image.SetStyle(m)";
_image._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settext(String _t) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub SetText(t As String) As VMImage";
 //BA.debugLineNum = 116;BA.debugLine="Image.SetText(t)";
_image._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 117;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltipbottom(String _text) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetToolTipBottom(Text As String) As VMImage";
 //BA.debugLineNum = 39;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
_tt._initialize /*b4j.example.vmtooltip*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tlt"))._settext /*b4j.example.vmtooltip*/ ((Object)(_text))._setdirectionbottom /*b4j.example.vmtooltip*/ (__c.True);
 //BA.debugLineNum = 40;BA.debugLine="hasTT = True";
_hastt = __c.True;
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltipleft(String _text) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetToolTipLeft(Text As String) As VMImage";
 //BA.debugLineNum = 45;BA.debugLine="tt.Initialize(vue,$\"${id}tlt\"$).SetText(Text).Set";
_tt._initialize /*b4j.example.vmtooltip*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tlt"))._settext /*b4j.example.vmtooltip*/ ((Object)(_text))._setdirectionleft /*b4j.example.vmtooltip*/ (__c.True);
 //BA.debugLineNum = 46;BA.debugLine="hasTT = True";
_hastt = __c.True;
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltipright(String _text) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetToolTipRight(Text As String) As VMImage";
 //BA.debugLineNum = 33;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
_tt._initialize /*b4j.example.vmtooltip*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tlt"))._settext /*b4j.example.vmtooltip*/ ((Object)(_text))._setdirectionright /*b4j.example.vmtooltip*/ (__c.True);
 //BA.debugLineNum = 34;BA.debugLine="hasTT = True";
_hastt = __c.True;
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _settooltiptop(String _text) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetToolTipTop(Text As String) As VMImage";
 //BA.debugLineNum = 27;BA.debugLine="tt.Initialize(vue,$\"${ID}tlt\"$).SetText(Text).Set";
_tt._initialize /*b4j.example.vmtooltip*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tlt"))._settext /*b4j.example.vmtooltip*/ ((Object)(_text))._setdirectiontop /*b4j.example.vmtooltip*/ (__c.True);
 //BA.debugLineNum = 28;BA.debugLine="hasTT = True";
_hastt = __c.True;
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvalue(String _valuename,boolean _bind) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 142;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
 //BA.debugLineNum = 143;BA.debugLine="If bind Then";
if (_bind) { 
 //BA.debugLineNum = 144;BA.debugLine="valueName = valueName.tolowercase";
_valuename = _valuename.toLowerCase();
 //BA.debugLineNum = 145;BA.debugLine="Image.SetSRC($\"${ID}src\"$,True)";
_image._setsrc /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"src"),__c.True);
 //BA.debugLineNum = 146;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 147;BA.debugLine="opt.Put($\"${ID}src\"$, valueName)";
_opt.Put((Object)((""+__c.SmartStringFormatter("",(Object)(_id))+"src")),(Object)(_valuename));
 //BA.debugLineNum = 148;BA.debugLine="vue.SetState(opt)";
_vue._setstate /*b4j.example.bananovue*/ (_opt);
 }else {
 //BA.debugLineNum = 150;BA.debugLine="Image.SetSRC(valueName, False)";
_image._setsrc /*b4j.example.vmelement*/ (_valuename,__c.False);
 //BA.debugLineNum = 151;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
_setattr(__c.createMap(new Object[] {(Object)("value"),(Object)(_valuename)}));
 };
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setverticalalignmiddle() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetVerticalAlignMiddle As VMImage";
 //BA.debugLineNum = 137;BA.debugLine="Image.SetVerticalAlignMiddle";
_image._setverticalalignmiddle /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetVIf(vif As String) As VMImage";
 //BA.debugLineNum = 56;BA.debugLine="Image.SetVIf(vif)";
_image._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub SetVModel(k As String) As VMImage";
 //BA.debugLineNum = 157;BA.debugLine="Image.SetVModel(k)";
_image._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetVShow(vif As String) As VMImage";
 //BA.debugLineNum = 51;BA.debugLine="Image.SetVShow(vif)";
_image._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetWidth(w As String) As VMImage";
 //BA.debugLineNum = 71;BA.debugLine="Image.SetWidth(w)";
_image._setwidth /*b4j.example.vmelement*/ (_w);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmimage)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
b4j.example.vmelement _div = null;
 //BA.debugLineNum = 161;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 162;BA.debugLine="If hasTT Then";
if (_hastt) { 
 //BA.debugLineNum = 163;BA.debugLine="Dim div As VMElement";
_div = new b4j.example.vmelement();
 //BA.debugLineNum = 164;BA.debugLine="div.Initialize(vue,$\"${ID}parent\"$)";
_div._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"parent"));
 //BA.debugLineNum = 165;BA.debugLine="div.SetText(Image.ToString)";
_div._settext /*b4j.example.vmelement*/ (_image._tostring /*String*/ ());
 //BA.debugLineNum = 166;BA.debugLine="div.SetText(tt.ToString)";
_div._settext /*b4j.example.vmelement*/ (_tt._tostring /*String*/ ());
 //BA.debugLineNum = 167;BA.debugLine="Return div.tostring";
if (true) return _div._tostring /*String*/ ();
 }else {
 //BA.debugLineNum = 169;BA.debugLine="Return Image.tostring";
if (true) return _image._tostring /*String*/ ();
 };
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
