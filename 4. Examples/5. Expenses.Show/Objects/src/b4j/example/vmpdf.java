package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmpdf extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmpdf", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmpdf.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _pdf = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public String _dockey = "";
public String _docvisible = "";
public anywheresoftware.b4a.objects.collections.Map _options = null;
public com.ab.banano.BANano _banano = null;
public com.ab.banano.BANanoObject _jq = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _initialize(b4j.example.vmpdf __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_url}));}
RDebugUtils.currentLine=178716672;
 //BA.debugLineNum = 178716672;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=178716673;
 //BA.debugLineNum = 178716673;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=178716674;
 //BA.debugLineNum = 178716674;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=178716675;
 //BA.debugLineNum = 178716675;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=178716676;
 //BA.debugLineNum = 178716676;BA.debugLine="JQ = vue.jquery";
__ref._jq /*com.ab.banano.BANanoObject*/  = __ref._vue /*b4j.example.bananovue*/ ._jquery /*com.ab.banano.BANanoObject*/ ;
RDebugUtils.currentLine=178716677;
 //BA.debugLineNum = 178716677;BA.debugLine="PDF.Initialize(vue, sid)";
__ref._pdf /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=178716678;
 //BA.debugLineNum = 178716678;BA.debugLine="PDF.SetTag(\"iframe\")";
__ref._pdf /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"iframe");
RDebugUtils.currentLine=178716679;
 //BA.debugLineNum = 178716679;BA.debugLine="PDF.SetAttr(CreateMap(\"type\":\"application/pdf\"))";
__ref._pdf /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("type"),(Object)("application/pdf")}));
RDebugUtils.currentLine=178716680;
 //BA.debugLineNum = 178716680;BA.debugLine="PDF.SetAttr(CreateMap(\"frameborder\":\"0\"))";
__ref._pdf /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("frameborder"),(Object)("0")}));
RDebugUtils.currentLine=178716681;
 //BA.debugLineNum = 178716681;BA.debugLine="PDF.SetAttr(CreateMap(\"scrolling\":\"no\"))";
__ref._pdf /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("scrolling"),(Object)("no")}));
RDebugUtils.currentLine=178716682;
 //BA.debugLineNum = 178716682;BA.debugLine="PDF.SetAttr(CreateMap(\"allowfullscreen\":True))";
__ref._pdf /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("allowfullscreen"),(Object)(__c.True)}));
RDebugUtils.currentLine=178716683;
 //BA.debugLineNum = 178716683;BA.debugLine="SetURL(URL)";
__ref._seturl /*String*/ (null,_url);
RDebugUtils.currentLine=178716684;
 //BA.debugLineNum = 178716684;BA.debugLine="docVisible = $\"${ID}visible\"$";
__ref._docvisible /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"visible");
RDebugUtils.currentLine=178716685;
 //BA.debugLineNum = 178716685;BA.debugLine="SetVIf(docVisible)";
__ref._setvif /*b4j.example.vmpdf*/ (null,(Object)(__ref._docvisible /*String*/ ));
RDebugUtils.currentLine=178716686;
 //BA.debugLineNum = 178716686;BA.debugLine="SetVisible(True)";
__ref._setvisible /*String*/ (null,__c.True);
RDebugUtils.currentLine=178716687;
 //BA.debugLineNum = 178716687;BA.debugLine="SetWidth(\"100%\")";
__ref._setwidth /*b4j.example.vmpdf*/ (null,"100%");
RDebugUtils.currentLine=178716688;
 //BA.debugLineNum = 178716688;BA.debugLine="SetHeight(\"80vh\")";
__ref._setheight /*b4j.example.vmpdf*/ (null,"80vh");
RDebugUtils.currentLine=178716689;
 //BA.debugLineNum = 178716689;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmpdf __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
RDebugUtils.currentLine=178651136;
 //BA.debugLineNum = 178651136;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=178651137;
 //BA.debugLineNum = 178651137;BA.debugLine="Public PDF As VMElement";
_pdf = new b4j.example.vmelement();
RDebugUtils.currentLine=178651138;
 //BA.debugLineNum = 178651138;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=178651139;
 //BA.debugLineNum = 178651139;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=178651140;
 //BA.debugLineNum = 178651140;BA.debugLine="Private docKey As String";
_dockey = "";
RDebugUtils.currentLine=178651141;
 //BA.debugLineNum = 178651141;BA.debugLine="Private docVisible As String";
_docvisible = "";
RDebugUtils.currentLine=178651142;
 //BA.debugLineNum = 178651142;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=178651143;
 //BA.debugLineNum = 178651143;BA.debugLine="Private BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=178651144;
 //BA.debugLineNum = 178651144;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=178651145;
 //BA.debugLineNum = 178651145;BA.debugLine="End Sub";
return "";
}
public String  _seturl(b4j.example.vmpdf __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "seturl", true))
	 {return ((String) Debug.delegate(ba, "seturl", new Object[] {_url}));}
RDebugUtils.currentLine=179175424;
 //BA.debugLineNum = 179175424;BA.debugLine="Sub SetURL(url As String)";
RDebugUtils.currentLine=179175425;
 //BA.debugLineNum = 179175425;BA.debugLine="docKey = $\"${ID}doc\"$";
__ref._dockey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"doc");
RDebugUtils.currentLine=179175426;
 //BA.debugLineNum = 179175426;BA.debugLine="vue.SetStateSingle(docKey, url)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._dockey /*String*/ ,(Object)(_url));
RDebugUtils.currentLine=179175427;
 //BA.debugLineNum = 179175427;BA.debugLine="PDF.SetAttr(CreateMap(\":src\":docKey))";
__ref._pdf /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":src"),(Object)(__ref._dockey /*String*/ )}));
RDebugUtils.currentLine=179175428;
 //BA.debugLineNum = 179175428;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpdf  _setvif(b4j.example.vmpdf __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmpdf) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=179044352;
 //BA.debugLineNum = 179044352;BA.debugLine="Sub SetVIf(vif As Object) As VMPDF";
RDebugUtils.currentLine=179044353;
 //BA.debugLineNum = 179044353;BA.debugLine="PDF.SetVIf(vif)";
__ref._pdf /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=179044354;
 //BA.debugLineNum = 179044354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
RDebugUtils.currentLine=179044355;
 //BA.debugLineNum = 179044355;BA.debugLine="End Sub";
return null;
}
public String  _setvisible(b4j.example.vmpdf __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=178978816;
 //BA.debugLineNum = 178978816;BA.debugLine="Sub SetVisible(b As Boolean)";
RDebugUtils.currentLine=178978817;
 //BA.debugLineNum = 178978817;BA.debugLine="vue.SetStateSingle(docVisible, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._docvisible /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=178978818;
 //BA.debugLineNum = 178978818;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpdf  _setwidth(b4j.example.vmpdf __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmpdf) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=178782208;
 //BA.debugLineNum = 178782208;BA.debugLine="Sub SetWidth(w As String) As VMPDF";
RDebugUtils.currentLine=178782209;
 //BA.debugLineNum = 178782209;BA.debugLine="PDF.SetStyle(CreateMap(\"width\":w & \" !important\")";
__ref._pdf /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)(_w+" !important")}));
RDebugUtils.currentLine=178782210;
 //BA.debugLineNum = 178782210;BA.debugLine="options.Put(\"width\", w)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("width"),(Object)(_w));
RDebugUtils.currentLine=178782211;
 //BA.debugLineNum = 178782211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
RDebugUtils.currentLine=178782212;
 //BA.debugLineNum = 178782212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpdf  _setheight(b4j.example.vmpdf __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmpdf) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=178847744;
 //BA.debugLineNum = 178847744;BA.debugLine="Sub SetHeight(h As String) As VMPDF";
RDebugUtils.currentLine=178847745;
 //BA.debugLineNum = 178847745;BA.debugLine="PDF.SetStyle(CreateMap(\"height\":h & \" !important\"";
__ref._pdf /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)(_h+" !important")}));
RDebugUtils.currentLine=178847746;
 //BA.debugLineNum = 178847746;BA.debugLine="options.Put(\"height\", h)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("height"),(Object)(_h));
RDebugUtils.currentLine=178847747;
 //BA.debugLineNum = 178847747;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
RDebugUtils.currentLine=178847748;
 //BA.debugLineNum = 178847748;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmpdf __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=179437568;
 //BA.debugLineNum = 179437568;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=179437569;
 //BA.debugLineNum = 179437569;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=179437570;
 //BA.debugLineNum = 179437570;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmpdf __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=179306496;
 //BA.debugLineNum = 179306496;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=179306497;
 //BA.debugLineNum = 179306497;BA.debugLine="Return PDF.tostring";
if (true) return __ref._pdf /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=179306498;
 //BA.debugLineNum = 179306498;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmpdf __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=179372032;
 //BA.debugLineNum = 179372032;BA.debugLine="Sub Render";
RDebugUtils.currentLine=179372033;
 //BA.debugLineNum = 179372033;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=179372034;
 //BA.debugLineNum = 179372034;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpdf  _setelevation(b4j.example.vmpdf __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmpdf) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=178913280;
 //BA.debugLineNum = 178913280;BA.debugLine="Sub SetElevation(e As Int) As VMPDF";
RDebugUtils.currentLine=178913281;
 //BA.debugLineNum = 178913281;BA.debugLine="PDF.SetElevation(e)";
__ref._pdf /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=178913282;
 //BA.debugLineNum = 178913282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
RDebugUtils.currentLine=178913283;
 //BA.debugLineNum = 178913283;BA.debugLine="End Sub";
return null;
}
public String  _seturl1(b4j.example.vmpdf __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "seturl1", true))
	 {return ((String) Debug.delegate(ba, "seturl1", new Object[] {_url}));}
String _ikey = "";
RDebugUtils.currentLine=179240960;
 //BA.debugLineNum = 179240960;BA.debugLine="Sub SetURL1(url As String)";
RDebugUtils.currentLine=179240961;
 //BA.debugLineNum = 179240961;BA.debugLine="Dim iKey As String = $\"#${ID}\"$";
_ikey = ("#"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"");
RDebugUtils.currentLine=179240962;
 //BA.debugLineNum = 179240962;BA.debugLine="BANano.GetElement(iKey).SetAttr(\"href\", url).AddC";
__ref._banano /*com.ab.banano.BANano*/ .GetElement(_ikey).SetAttr("href",_url).AddClass("media");
RDebugUtils.currentLine=179240963;
 //BA.debugLineNum = 179240963;BA.debugLine="JQ.Selector(iKey).RunMethod(\"media\", options)";
__ref._jq /*com.ab.banano.BANanoObject*/ .Selector((Object)(_ikey)).RunMethod("media",(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=179240964;
 //BA.debugLineNum = 179240964;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmpdf  _setvshow(b4j.example.vmpdf __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmpdf";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmpdf) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=179109888;
 //BA.debugLineNum = 179109888;BA.debugLine="Sub SetVShow(vif As Object) As VMPDF";
RDebugUtils.currentLine=179109889;
 //BA.debugLineNum = 179109889;BA.debugLine="PDF.SetVShow(vif)";
__ref._pdf /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=179109890;
 //BA.debugLineNum = 179109890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmpdf)(this);
RDebugUtils.currentLine=179109891;
 //BA.debugLineNum = 179109891;BA.debugLine="End Sub";
return null;
}
}