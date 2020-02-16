package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlist", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _list = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hascontent = false;
public Object _eventhandler = null;
public boolean _ispropertybag = false;
public String _expands = "";
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
public String  _addbutton(String _btnid,String _btntext) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 82;BA.debugLine="Sub AddButton(btnID As String, btnText As String)";
 //BA.debugLineNum = 83;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 84;BA.debugLine="li.Initialize(vue, $\"${btnID}li\"$, eventHandler).";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_btnid))+"li"),_eventhandler)._addbutton /*b4j.example.vmlistitem*/ (_btnid,_btntext);
 //BA.debugLineNum = 85;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 86;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important")}));
 };
 //BA.debugLineNum = 88;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 89;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _addcheckbox(String _vmodel,boolean _vvalue,String _vtext,boolean _bprimary) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub AddCheckBox(vmodel As String, vValue As Boolea";
 //BA.debugLineNum = 94;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 95;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._addcheckbox /*b4j.example.vmlistitem*/ (_vmodel,_vvalue,_vtext,_bprimary);
 //BA.debugLineNum = 96;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 97;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("32px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
 //BA.debugLineNum = 101;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 102;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub AddClass(c As String) As VMList";
 //BA.debugLineNum = 258;BA.debugLine="List.AddClass(c)";
_list._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public String  _adddatepicker(String _vmodel,String _vtext,String _vvalue) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 105;BA.debugLine="Sub AddDatePicker(vmodel As String, vText As Strin";
 //BA.debugLineNum = 106;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 107;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._adddatepicker /*b4j.example.vmlistitem*/ (_vmodel,_vtext,_vvalue);
 //BA.debugLineNum = 108;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 109;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
 //BA.debugLineNum = 113;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 114;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _adddivider(boolean _binset) throws Exception{
b4j.example.vmdivider _el = null;
 //BA.debugLineNum = 303;BA.debugLine="Sub AddDivider(bInset As Boolean) As VMList";
 //BA.debugLineNum = 304;BA.debugLine="Dim el As VMDivider";
_el = new b4j.example.vmdivider();
 //BA.debugLineNum = 305;BA.debugLine="el.Initialize(vue, \"\").SetInset(bInset)";
_el._initialize /*b4j.example.vmdivider*/ (ba,_vue,"")._setinset /*b4j.example.vmdivider*/ (_binset);
 //BA.debugLineNum = 306;BA.debugLine="el.Pop(List)";
_el._pop /*String*/ (_list);
 //BA.debugLineNum = 307;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public String  _addiconbutton(String _btnid,String _btnicon) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 60;BA.debugLine="Sub AddIconButton(btnID As String, btnIcon As Stri";
 //BA.debugLineNum = 61;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 62;BA.debugLine="li.Initialize(vue, $\"${btnID}li\"$, eventHandler).";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_btnid))+"li"),_eventhandler)._addiconbutton /*b4j.example.vmlistitem*/ (_btnid,_btnicon);
 //BA.debugLineNum = 63;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 64;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important")}));
 };
 //BA.debugLineNum = 66;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 67;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _addinput(String _typeof,String _vmodel,String _vtext,String _vicon,String _vvalue) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub AddInput(typeOf As String, vModel As String, v";
 //BA.debugLineNum = 71;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 72;BA.debugLine="li.Initialize(vue, $\"${vModel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._addinput /*b4j.example.vmlistitem*/ (_typeof,_vmodel,_vtext,_vicon,_vvalue);
 //BA.debugLineNum = 73;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 74;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("10px !important")}));
 };
 //BA.debugLineNum = 78;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 79;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _addlabel(String _txt) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 47;BA.debugLine="Sub AddLabel(txt As String)";
 //BA.debugLineNum = 48;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 49;BA.debugLine="li.Initialize(vue, \"\",eventHandler).AddLabel(txt)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,"",_eventhandler)._addlabel /*b4j.example.vmlistitem*/ (_txt);
 //BA.debugLineNum = 50;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 51;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("32px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
 //BA.debugLineNum = 56;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 57;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _addnumberinput(String _vmodel,String _label,int _minvalue,int _maxvalue,int _value) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 158;BA.debugLine="Sub AddNumberInput(vmodel As String, Label As Stri";
 //BA.debugLineNum = 159;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 160;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._addnumberinput /*b4j.example.vmlistitem*/ (_vmodel,_label,_minvalue,_maxvalue,_value);
 //BA.debugLineNum = 161;BA.debugLine="li.AddClass(\"numberinput\")";
_li._addclass /*b4j.example.vmlistitem*/ ("numberinput");
 //BA.debugLineNum = 162;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 163;BA.debugLine="li.SetStyle(CreateMap(\"padding-top\": \"10px !impo";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
 //BA.debugLineNum = 166;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 167;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _addradio(String _vmodel,String _vvalue,String _vtext,boolean _bprimary,boolean _bdesignmode) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 193;BA.debugLine="Sub AddRadio(vmodel As String, vValue As String, v";
 //BA.debugLineNum = 194;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 195;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._setradio /*b4j.example.vmlistitem*/ (_vmodel,_vvalue,_vtext,_bprimary,_bdesignmode);
 //BA.debugLineNum = 196;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 197;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("32px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
 //BA.debugLineNum = 202;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 203;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _addselect(String _vmodel,String _vtext,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub AddSelect(vmodel As String, vText As String, s";
 //BA.debugLineNum = 118;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 119;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._addselect /*b4j.example.vmlistitem*/ (_vmodel,_vtext,_sourcename,_options,_sourcefield,_displayfield);
 //BA.debugLineNum = 120;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 121;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
 //BA.debugLineNum = 125;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 126;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _addslider(String _vmodel,String _label,int _minvalue,int _maxvalue,int _value,boolean _labelontop) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 144;BA.debugLine="Sub AddSlider(vmodel As String, Label As String, m";
 //BA.debugLineNum = 145;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 146;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._addslider /*b4j.example.vmlistitem*/ (_vmodel,_label,_minvalue,_maxvalue,_value,_labelontop);
 //BA.debugLineNum = 147;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 148;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
 //BA.debugLineNum = 153;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 154;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _addsubheader(Object _t) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 296;BA.debugLine="Sub AddSubHeader(t As Object) As VMList";
 //BA.debugLineNum = 297;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 298;BA.debugLine="el.Initialize(vue, \"\").SetTagSubHeader(True).SetT";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settagsubheader /*b4j.example.vmelement*/ (__c.True)._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t))._pop /*String*/ (_list);
 //BA.debugLineNum = 299;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public String  _addswitch(String _vmodel,String _vtext,boolean _bprimary,boolean _bvalue) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 180;BA.debugLine="Sub AddSwitch(vmodel As String, vText As String, b";
 //BA.debugLineNum = 181;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 182;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._setswitch /*b4j.example.vmlistitem*/ (_vmodel,_vtext,_bprimary,_bvalue);
 //BA.debugLineNum = 183;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 184;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("48px !important"),(Object)("padding-top"),(Object)("10px !important"),(Object)("padding-bottom"),(Object)("10px !important"),(Object)("margin-top"),(Object)("5px !important"),(Object)("margin-bottom"),(Object)("5px !important")}));
 };
 //BA.debugLineNum = 188;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 189;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _addtextarea(String _vmodel,String _vtext,String _vvalue) throws Exception{
b4j.example.vmlistitem _li = null;
 //BA.debugLineNum = 170;BA.debugLine="Sub AddTextArea(vmodel As String, vText As String,";
 //BA.debugLineNum = 171;BA.debugLine="Dim li As VMListItem";
_li = new b4j.example.vmlistitem();
 //BA.debugLineNum = 172;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
_li._initialize /*b4j.example.vmlistitem*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_vmodel))+"li"),_eventhandler)._addtextarea /*b4j.example.vmlistitem*/ (_vmodel,_vtext,_vvalue);
 //BA.debugLineNum = 173;BA.debugLine="If isPropertyBag Then";
if (_ispropertybag) { 
 //BA.debugLineNum = 174;BA.debugLine="li.SetStyle(CreateMap(\"height\":\"130px !important";
_li._setstyle /*b4j.example.vmlistitem*/ (__c.createMap(new Object[] {(Object)("height"),(Object)("130px !important"),(Object)("padding-top"),(Object)("10px !important")}));
 };
 //BA.debugLineNum = 176;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 177;BA.debugLine="li.Pop(Me)";
_li._pop /*String*/ ((b4j.example.vmlist)(this));
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 326;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public List As VMElement";
_list = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 7;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Public isPropertyBag As Boolean";
_ispropertybag = false;
 //BA.debugLineNum = 9;BA.debugLine="Private expandS As String";
_expands = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdivider  _createdivider(boolean _b) throws Exception{
b4j.example.vmdivider _el = null;
 //BA.debugLineNum = 234;BA.debugLine="Sub CreateDivider(b As Boolean) As VMDivider";
 //BA.debugLineNum = 235;BA.debugLine="Dim el As VMDivider";
_el = new b4j.example.vmdivider();
 //BA.debugLineNum = 236;BA.debugLine="el.Initialize(vue, \"\")";
_el._initialize /*b4j.example.vmdivider*/ (ba,_vue,"");
 //BA.debugLineNum = 237;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 238;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _createitem(String _itemid) throws Exception{
b4j.example.vmlistitem _el = null;
 //BA.debugLineNum = 216;BA.debugLine="Sub CreateItem(itemID As String) As VMListItem";
 //BA.debugLineNum = 217;BA.debugLine="Dim el As VMListItem";
_el = new b4j.example.vmlistitem();
 //BA.debugLineNum = 218;BA.debugLine="el.Initialize(vue, itemID, eventHandler)";
_el._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_itemid,_eventhandler);
 //BA.debugLineNum = 219;BA.debugLine="If itemID = \"\" Then";
if ((_itemid).equals("")) { 
 //BA.debugLineNum = 220;BA.debugLine="Log(\"VMList.CreateItem - please specify an item";
__c.Log("VMList.CreateItem - please specify an item id!");
 //BA.debugLineNum = 221;BA.debugLine="Return el";
if (true) return _el;
 };
 //BA.debugLineNum = 223;BA.debugLine="itemID = itemID.tolowercase";
_itemid = _itemid.toLowerCase();
 //BA.debugLineNum = 224;BA.debugLine="If vue.HasState(itemID) = False Then";
if (_vue._hasstate /*boolean*/ (_itemid)==__c.False) { 
 //BA.debugLineNum = 225;BA.debugLine="vue.SetStateSingle(itemID, itemID)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_itemid,(Object)(_itemid));
 };
 //BA.debugLineNum = 227;BA.debugLine="el.SetID(itemID,True)";
_el._setid /*b4j.example.vmlistitem*/ (_itemid,__c.True);
 //BA.debugLineNum = 228;BA.debugLine="el.SetKey(itemID,True)";
_el._setkey /*b4j.example.vmlistitem*/ (_itemid,__c.True);
 //BA.debugLineNum = 229;BA.debugLine="el.SetActionIcon(\"chevron_right\")";
_el._setactionicon /*b4j.example.vmlistitem*/ ("chevron_right");
 //BA.debugLineNum = 230;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 231;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _expanditem(String _sid,boolean _b) throws Exception{
String _syncid = "";
 //BA.debugLineNum = 31;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VML";
 //BA.debugLineNum = 32;BA.debugLine="Dim syncid As String = $\"${sid}sync\"$";
_syncid = (""+__c.SmartStringFormatter("",(Object)(_sid))+"sync");
 //BA.debugLineNum = 33;BA.debugLine="vue.SetStateSingle(syncid, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_syncid,(Object)(_b));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _module) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 15;BA.debugLine="List.Initialize(vue, ID).SetTag(\"md-list\")";
_list._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-list");
 //BA.debugLineNum = 16;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 18;BA.debugLine="isPropertyBag = False";
_ispropertybag = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="expandS = $\"${ID}expandsingle\"$";
_expands = (""+__c.SmartStringFormatter("",(Object)(_id))+"expandsingle");
 //BA.debugLineNum = 20;BA.debugLine="vue.SetStateFalse(expandS)";
_vue._setstatefalse /*b4j.example.bananovue*/ (_expands);
 //BA.debugLineNum = 21;BA.debugLine="SetExpandSingle(False)";
_setexpandsingle(__c.False);
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 320;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub Render";
 //BA.debugLineNum = 316;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetAttr(attr As Map) As VMList";
 //BA.debugLineNum = 264;BA.debugLine="List.SetAttr(attr)";
_list._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setborder(boolean _b) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub SetBorder(b As Boolean) As VMList";
 //BA.debugLineNum = 247;BA.debugLine="If b Then SetStyle(CreateMap(\"border\": \"1px solid";
if (_b) { 
_setstyle(__c.createMap(new Object[] {(Object)("border"),(Object)("1px solid rgba(#000, .12)")}));};
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdense(boolean _b) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetDense(b As Boolean) As VMList";
 //BA.debugLineNum = 207;BA.debugLine="If b Then AddClass(\"md-dense\")";
if (_b) { 
_addclass("md-dense");};
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetDisabled(b As Boolean) As VMList";
 //BA.debugLineNum = 26;BA.debugLine="List.SetDisabled(b)";
_list._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setdoubleline(boolean _b) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetDoubleLine(b As Boolean) As VMList";
 //BA.debugLineNum = 280;BA.debugLine="If b Then List.SetDoubleLine(True)";
if (_b) { 
_list._setdoubleline /*b4j.example.vmelement*/ (__c.True);};
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetElevation(e As Int) As VMList";
 //BA.debugLineNum = 252;BA.debugLine="List.SetElevation(e)";
_list._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setexpandsingle(boolean _b) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetExpandSingle(b As Boolean) As VMList";
 //BA.debugLineNum = 285;BA.debugLine="expandS = $\"${ID}expandsingle\"$";
_expands = (""+__c.SmartStringFormatter("",(Object)(_id))+"expandsingle");
 //BA.debugLineNum = 286;BA.debugLine="vue.SetStateSingle(expandS, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_expands,(Object)(_b));
 //BA.debugLineNum = 287;BA.debugLine="List.SetAttr(CreateMap(\":md-expand-single\": expan";
_list._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)(":md-expand-single"),(Object)(_expands)}));
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setslotexpand(boolean _b) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetSlotExpand(b As Boolean) As VMList";
 //BA.debugLineNum = 275;BA.debugLine="If b Then List.SetAttr(CreateMap(\"slot\":\"md-expan";
if (_b) { 
_list._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("slot"),(Object)("md-expand")}));};
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetStyle(m As Map) As VMList";
 //BA.debugLineNum = 242;BA.debugLine="List.SetStyle(m)";
_list._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetTabIndex(ti As String) As VMList";
 //BA.debugLineNum = 38;BA.debugLine="List.SetTabIndex(ti)";
_list._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settext(String _t) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetText(t As String) As VMList";
 //BA.debugLineNum = 269;BA.debugLine="List.SetText(t)";
_list._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 270;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _settripleline(boolean _b) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetTripleLine(b As Boolean) As VMList";
 //BA.debugLineNum = 292;BA.debugLine="If b Then AddClass(\"md-triple-line\")";
if (_b) { 
_addclass("md-triple-line");};
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetVIf(vif As Object) As VMList";
 //BA.debugLineNum = 212;BA.debugLine="List.SetVIf(vif)";
_list._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetVShow(vif As Object) As VMList";
 //BA.debugLineNum = 43;BA.debugLine="List.SetVShow(vif)";
_list._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlist)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 312;BA.debugLine="Return List.tostring";
if (true) return _list._tostring /*String*/ ();
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
