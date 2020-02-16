package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANanoObject _jq = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public String _href = "";
public String _id = "";
public com.ab.banano.BANano _banano = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 5;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private href As String";
_href = "";
 //BA.debugLineNum = 7;BA.debugLine="Private id As String";
_id = "";
 //BA.debugLineNum = 8;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfview  _initialize(anywheresoftware.b4a.BA _ba,String _elementid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(elementID As String) As PDFV";
 //BA.debugLineNum = 14;BA.debugLine="JQ.Initialize(\"$\")";
_jq.Initialize((Object)("$"));
 //BA.debugLineNum = 15;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="href = \"\"";
_href = "";
 //BA.debugLineNum = 17;BA.debugLine="id = elementID.tolowercase";
_id = _elementid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="SetWidth(\"100%\")";
_setwidth("100%");
 //BA.debugLineNum = 19;BA.debugLine="SetHeight(\"80vh\")";
_setheight("80vh");
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfview)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _refresh() throws Exception{
String _ikey = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 44;BA.debugLine="Dim iKey As String = $\"#${id}\"$";
_ikey = ("#"+__c.SmartStringFormatter("",(Object)(_id))+"");
 //BA.debugLineNum = 45;BA.debugLine="BANano.GetElement(iKey).SetAttr(\"href\", href).Add";
_banano.GetElement(_ikey).SetAttr("href",_href).AddClass("media");
 //BA.debugLineNum = 46;BA.debugLine="JQ.Selector(iKey).RunMethod(\"media\", options)";
_jq.Selector((Object)(_ikey)).RunMethod("media",(Object)(_options.getObject()));
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfview  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetHeight(h As String) As PDFView";
 //BA.debugLineNum = 32;BA.debugLine="options.Put(\"height\", h)";
_options.Put((Object)("height"),(Object)(_h));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfview)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfview  _sethref(String _shref) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetHREF(shref As String) As PDFView";
 //BA.debugLineNum = 38;BA.debugLine="href = shref";
_href = _shref;
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfview)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfview  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetWidth(w As String) As PDFView";
 //BA.debugLineNum = 26;BA.debugLine="options.Put(\"width\", w)";
_options.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfview)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
