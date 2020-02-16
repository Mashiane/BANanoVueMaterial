package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprettyprint extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmprettyprint", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprettyprint.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _pp = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _codename = "";
public String _codevisible = "";
public b4j.example.vmelement _codeel = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmprettyprint  _initialize(b4j.example.vmprettyprint __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _lang) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_lang}));}
RDebugUtils.currentLine=179568640;
 //BA.debugLineNum = 179568640;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=179568641;
 //BA.debugLineNum = 179568641;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=179568642;
 //BA.debugLineNum = 179568642;BA.debugLine="PP.Initialize(v, ID).SetTag(\"pre\").AddClass(\"pret";
__ref._pp /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"pre")._addclass /*b4j.example.vmelement*/ (null,"prettyprint")._addclass /*b4j.example.vmelement*/ (null,"linenums");
RDebugUtils.currentLine=179568643;
 //BA.debugLineNum = 179568643;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=179568644;
 //BA.debugLineNum = 179568644;BA.debugLine="PP.SetStyle(CreateMap(\"width\":\"100% !important\",";
__ref._pp /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)("100% !important"),(Object)("height"),(Object)("80vh !important")}));
RDebugUtils.currentLine=179568646;
 //BA.debugLineNum = 179568646;BA.debugLine="codeName = $\"${ID}code\"$";
__ref._codename /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"code");
RDebugUtils.currentLine=179568647;
 //BA.debugLineNum = 179568647;BA.debugLine="CodeEL.Initialize(v, codeName).SetTag(\"code\")";
__ref._codeel /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._codename /*String*/ )._settag /*b4j.example.vmelement*/ (null,"code");
RDebugUtils.currentLine=179568648;
 //BA.debugLineNum = 179568648;BA.debugLine="CodeEL.SetText($\"{{ ${codeName} }}\"$)";
__ref._codeel /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(__ref._codename /*String*/ ))+" }}"));
RDebugUtils.currentLine=179568649;
 //BA.debugLineNum = 179568649;BA.debugLine="CodeEL.AddClass(\"col s12\").AddClass(\"prettyprint\"";
__ref._codeel /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"col s12")._addclass /*b4j.example.vmelement*/ (null,"prettyprint");
RDebugUtils.currentLine=179568650;
 //BA.debugLineNum = 179568650;BA.debugLine="CodeEL.AddClass($\"language-${lang}\"$)";
__ref._codeel /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,("language-"+__c.SmartStringFormatter("",(Object)(_lang))+""));
RDebugUtils.currentLine=179568652;
 //BA.debugLineNum = 179568652;BA.debugLine="codevisible = $\"${ID}visible\"$";
__ref._codevisible /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"visible");
RDebugUtils.currentLine=179568653;
 //BA.debugLineNum = 179568653;BA.debugLine="SetVIf(codevisible)";
__ref._setvif /*b4j.example.vmprettyprint*/ (null,__ref._codevisible /*String*/ );
RDebugUtils.currentLine=179568654;
 //BA.debugLineNum = 179568654;BA.debugLine="SetVisible(True)";
__ref._setvisible /*String*/ (null,__c.True);
RDebugUtils.currentLine=179568655;
 //BA.debugLineNum = 179568655;BA.debugLine="SetText(\"\")";
__ref._settext /*b4j.example.vmprettyprint*/ (null,"");
RDebugUtils.currentLine=179568656;
 //BA.debugLineNum = 179568656;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=179568657;
 //BA.debugLineNum = 179568657;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _addclass(b4j.example.vmprettyprint __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=180224000;
 //BA.debugLineNum = 180224000;BA.debugLine="Sub AddClass(c As String) As VMPrettyPrint";
RDebugUtils.currentLine=180224001;
 //BA.debugLineNum = 180224001;BA.debugLine="PP.AddClass(c)";
__ref._pp /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=180224002;
 //BA.debugLineNum = 180224002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=180224003;
 //BA.debugLineNum = 180224003;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmprettyprint __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
RDebugUtils.currentLine=179503104;
 //BA.debugLineNum = 179503104;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=179503105;
 //BA.debugLineNum = 179503105;BA.debugLine="Public PP As VMElement";
_pp = new b4j.example.vmelement();
RDebugUtils.currentLine=179503106;
 //BA.debugLineNum = 179503106;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=179503107;
 //BA.debugLineNum = 179503107;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=179503108;
 //BA.debugLineNum = 179503108;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=179503109;
 //BA.debugLineNum = 179503109;BA.debugLine="Private codeName As String";
_codename = "";
RDebugUtils.currentLine=179503110;
 //BA.debugLineNum = 179503110;BA.debugLine="Private codevisible As String";
_codevisible = "";
RDebugUtils.currentLine=179503111;
 //BA.debugLineNum = 179503111;BA.debugLine="Private CodeEL As VMElement";
_codeel = new b4j.example.vmelement();
RDebugUtils.currentLine=179503112;
 //BA.debugLineNum = 179503112;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprettyprint  _setvif(b4j.example.vmprettyprint __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=179765248;
 //BA.debugLineNum = 179765248;BA.debugLine="Sub SetVIf(vif As String) As VMPrettyPrint";
RDebugUtils.currentLine=179765249;
 //BA.debugLineNum = 179765249;BA.debugLine="PP.SetVIf(vif)";
__ref._pp /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=179765250;
 //BA.debugLineNum = 179765250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=179765251;
 //BA.debugLineNum = 179765251;BA.debugLine="End Sub";
return null;
}
public String  _setvisible(b4j.example.vmprettyprint __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=179699712;
 //BA.debugLineNum = 179699712;BA.debugLine="Sub SetVisible(b As Boolean)";
RDebugUtils.currentLine=179699713;
 //BA.debugLineNum = 179699713;BA.debugLine="vue.SetStateSingle(codevisible, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._codevisible /*String*/ ,(Object)(_b));
RDebugUtils.currentLine=179699714;
 //BA.debugLineNum = 179699714;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprettyprint  _settext(b4j.example.vmprettyprint __ref,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "settext", new Object[] {_stext}));}
RDebugUtils.currentLine=179896320;
 //BA.debugLineNum = 179896320;BA.debugLine="Sub SetText(sText As String) As VMPrettyPrint";
RDebugUtils.currentLine=179896321;
 //BA.debugLineNum = 179896321;BA.debugLine="vue.SetStateSingle(codeName, sText)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._codename /*String*/ ,(Object)(_stext));
RDebugUtils.currentLine=179896322;
 //BA.debugLineNum = 179896322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=179896323;
 //BA.debugLineNum = 179896323;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmprettyprint __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=180158464;
 //BA.debugLineNum = 180158464;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=180158465;
 //BA.debugLineNum = 180158465;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=180158466;
 //BA.debugLineNum = 180158466;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmprettyprint __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=180027392;
 //BA.debugLineNum = 180027392;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=180027393;
 //BA.debugLineNum = 180027393;BA.debugLine="PP.AddElement(CodeEL)";
__ref._pp /*b4j.example.vmelement*/ ._addelement /*String*/ (null,__ref._codeel /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=180027394;
 //BA.debugLineNum = 180027394;BA.debugLine="Return PP.ToString";
if (true) return __ref._pp /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=180027395;
 //BA.debugLineNum = 180027395;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.vmprettyprint __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
com.ab.banano.BANanoObject _pr = null;
RDebugUtils.currentLine=179961856;
 //BA.debugLineNum = 179961856;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=179961857;
 //BA.debugLineNum = 179961857;BA.debugLine="Dim PR As BANanoObject";
_pr = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=179961858;
 //BA.debugLineNum = 179961858;BA.debugLine="PR.Initialize(\"PR\")";
_pr.Initialize((Object)("PR"));
RDebugUtils.currentLine=179961859;
 //BA.debugLineNum = 179961859;BA.debugLine="PR.RunMethod(\"prettyPrint\", Null)";
_pr.RunMethod("prettyPrint",__c.Null);
RDebugUtils.currentLine=179961860;
 //BA.debugLineNum = 179961860;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmprettyprint __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=180092928;
 //BA.debugLineNum = 180092928;BA.debugLine="Sub Render";
RDebugUtils.currentLine=180092929;
 //BA.debugLineNum = 180092929;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=180092930;
 //BA.debugLineNum = 180092930;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprettyprint  _setattr(b4j.example.vmprettyprint __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=180289536;
 //BA.debugLineNum = 180289536;BA.debugLine="Sub SetAttr(attr As Map) As VMPrettyPrint";
RDebugUtils.currentLine=180289537;
 //BA.debugLineNum = 180289537;BA.debugLine="PP.SetAttr(attr)";
__ref._pp /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=180289538;
 //BA.debugLineNum = 180289538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=180289539;
 //BA.debugLineNum = 180289539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _setelevation(b4j.example.vmprettyprint __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=179634176;
 //BA.debugLineNum = 179634176;BA.debugLine="Sub SetElevation(e As Int) As VMPrettyPrint";
RDebugUtils.currentLine=179634177;
 //BA.debugLineNum = 179634177;BA.debugLine="PP.SetElevation(e)";
__ref._pp /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=179634178;
 //BA.debugLineNum = 179634178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=179634179;
 //BA.debugLineNum = 179634179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _setpadding(b4j.example.vmprettyprint __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=180420608;
 //BA.debugLineNum = 180420608;BA.debugLine="Sub SetPadding(p As Object) As VMPrettyPrint";
RDebugUtils.currentLine=180420609;
 //BA.debugLineNum = 180420609;BA.debugLine="PP.SetPaddingAll(p)";
__ref._pp /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=180420610;
 //BA.debugLineNum = 180420610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=180420611;
 //BA.debugLineNum = 180420611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _setstyle(b4j.example.vmprettyprint __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=180355072;
 //BA.debugLineNum = 180355072;BA.debugLine="Sub SetStyle(sm As Map) As VMPrettyPrint";
RDebugUtils.currentLine=180355073;
 //BA.debugLineNum = 180355073;BA.debugLine="PP.SetStyle(sm)";
__ref._pp /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=180355074;
 //BA.debugLineNum = 180355074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=180355075;
 //BA.debugLineNum = 180355075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _setvshow(b4j.example.vmprettyprint __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprettyprint";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=179830784;
 //BA.debugLineNum = 179830784;BA.debugLine="Sub SetVShow(vif As String) As VMPrettyPrint";
RDebugUtils.currentLine=179830785;
 //BA.debugLineNum = 179830785;BA.debugLine="PP.SetVShow(vif)";
__ref._pp /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=179830786;
 //BA.debugLineNum = 179830786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprettyprint)(this);
RDebugUtils.currentLine=179830787;
 //BA.debugLineNum = 179830787;BA.debugLine="End Sub";
return null;
}
}