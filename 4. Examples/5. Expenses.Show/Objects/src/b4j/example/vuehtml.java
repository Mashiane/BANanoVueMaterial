package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vuehtml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vuehtml", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vuehtml.class).invoke(this, new Object[] {null});
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
public String _id = "";
public String _tag = "";
public anywheresoftware.b4a.objects.collections.Map _properties = null;
public anywheresoftware.b4a.objects.collections.List _contents = null;
public anywheresoftware.b4a.objects.collections.Map _classes = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public anywheresoftware.b4a.objects.collections.Map _looseattributes = null;
public anywheresoftware.b4a.objects.collections.List _dontbreak = null;
public String _prefix = "";
public boolean _doaproperclose = false;
public anywheresoftware.b4a.objects.collections.Map _cssrule = null;
public anywheresoftware.b4a.objects.collections.List _singlequote = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sbafter = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sbbefore = null;
public boolean _isimportant = false;
public com.ab.banano.BANano _banano = null;
public String _parentid = "";
public String _ds = "";
public boolean _hascontent = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vuehtml  _addclass(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addclass", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.List _spclasses = null;
String _strclass = "";
RDebugUtils.currentLine=259391488;
 //BA.debugLineNum = 259391488;BA.debugLine="Sub AddClass(value As String) As VueHTML";
RDebugUtils.currentLine=259391490;
 //BA.debugLineNum = 259391490;BA.debugLine="value = value.Replace(\" \",\";\")";
_value = _value.replace(" ",";");
RDebugUtils.currentLine=259391491;
 //BA.debugLineNum = 259391491;BA.debugLine="Dim spClasses As List = StrParse(\";\",value)";
_spclasses = new anywheresoftware.b4a.objects.collections.List();
_spclasses = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,";",_value);
RDebugUtils.currentLine=259391492;
 //BA.debugLineNum = 259391492;BA.debugLine="For Each strClass As String In spClasses";
{
final anywheresoftware.b4a.BA.IterableList group3 = _spclasses;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strclass = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=259391493;
 //BA.debugLineNum = 259391493;BA.debugLine="strClass = strClass.Trim";
_strclass = _strclass.trim();
RDebugUtils.currentLine=259391494;
 //BA.debugLineNum = 259391494;BA.debugLine="If strClass.Length > 0 Then";
if (_strclass.length()>0) { 
RDebugUtils.currentLine=259391495;
 //BA.debugLineNum = 259391495;BA.debugLine="Classes.Put(strClass,strClass)";
__ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strclass),(Object)(_strclass));
 };
 }
};
RDebugUtils.currentLine=259391498;
 //BA.debugLineNum = 259391498;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=259391499;
 //BA.debugLineNum = 259391499;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=259391500;
 //BA.debugLineNum = 259391500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _initialize(b4j.example.vuehtml __ref,anywheresoftware.b4a.BA _ba,String _elid,String _stag) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "initialize", new Object[] {_ba,_elid,_stag}));}
RDebugUtils.currentLine=256114688;
 //BA.debugLineNum = 256114688;BA.debugLine="Public Sub Initialize(elID As String, stag As Stri";
RDebugUtils.currentLine=256114689;
 //BA.debugLineNum = 256114689;BA.debugLine="ds = \"\"";
__ref._ds /*String*/  = "";
RDebugUtils.currentLine=256114690;
 //BA.debugLineNum = 256114690;BA.debugLine="hasContent = False";
__ref._hascontent /*boolean*/  = __c.False;
RDebugUtils.currentLine=256114691;
 //BA.debugLineNum = 256114691;BA.debugLine="ParentID = \"\"";
__ref._parentid /*String*/  = "";
RDebugUtils.currentLine=256114692;
 //BA.debugLineNum = 256114692;BA.debugLine="ID = elID.tolowercase";
__ref._id /*String*/  = _elid.toLowerCase();
RDebugUtils.currentLine=256114693;
 //BA.debugLineNum = 256114693;BA.debugLine="IsImportant = False";
__ref._isimportant /*boolean*/  = __c.False;
RDebugUtils.currentLine=256114694;
 //BA.debugLineNum = 256114694;BA.debugLine="SBBefore.Initialize";
__ref._sbbefore /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=256114695;
 //BA.debugLineNum = 256114695;BA.debugLine="SBAfter.Initialize";
__ref._sbafter /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=256114696;
 //BA.debugLineNum = 256114696;BA.debugLine="properties.Initialize";
__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=256114697;
 //BA.debugLineNum = 256114697;BA.debugLine="properties.clear";
__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=256114698;
 //BA.debugLineNum = 256114698;BA.debugLine="Contents.Initialize";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=256114699;
 //BA.debugLineNum = 256114699;BA.debugLine="Contents.clear";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=256114700;
 //BA.debugLineNum = 256114700;BA.debugLine="Styles.Initialize";
__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=256114701;
 //BA.debugLineNum = 256114701;BA.debugLine="Styles.clear";
__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=256114702;
 //BA.debugLineNum = 256114702;BA.debugLine="Classes.Initialize";
__ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=256114703;
 //BA.debugLineNum = 256114703;BA.debugLine="Classes.clear";
__ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=256114704;
 //BA.debugLineNum = 256114704;BA.debugLine="LooseAttributes.Initialize";
__ref._looseattributes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=256114705;
 //BA.debugLineNum = 256114705;BA.debugLine="LooseAttributes.clear";
__ref._looseattributes /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=256114706;
 //BA.debugLineNum = 256114706;BA.debugLine="DontBreak.Initialize";
__ref._dontbreak /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=256114707;
 //BA.debugLineNum = 256114707;BA.debugLine="DontBreak.clear";
__ref._dontbreak /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=256114708;
 //BA.debugLineNum = 256114708;BA.debugLine="DontBreak.Add(\"li\")";
__ref._dontbreak /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("li"));
RDebugUtils.currentLine=256114709;
 //BA.debugLineNum = 256114709;BA.debugLine="DontBreak.Add(\"a\")";
__ref._dontbreak /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("a"));
RDebugUtils.currentLine=256114710;
 //BA.debugLineNum = 256114710;BA.debugLine="DontBreak.Add(\"i\")";
__ref._dontbreak /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("i"));
RDebugUtils.currentLine=256114711;
 //BA.debugLineNum = 256114711;BA.debugLine="DontBreak.Add(\"span\")";
__ref._dontbreak /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("span"));
RDebugUtils.currentLine=256114712;
 //BA.debugLineNum = 256114712;BA.debugLine="DontBreak.Add(\"img\")";
__ref._dontbreak /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("img"));
RDebugUtils.currentLine=256114713;
 //BA.debugLineNum = 256114713;BA.debugLine="Tag = stag.tolowercase";
__ref._tag /*String*/  = _stag.toLowerCase();
RDebugUtils.currentLine=256114714;
 //BA.debugLineNum = 256114714;BA.debugLine="Prefix = \"\"";
__ref._prefix /*String*/  = "";
RDebugUtils.currentLine=256114715;
 //BA.debugLineNum = 256114715;BA.debugLine="DoAProperClose = True";
__ref._doaproperclose /*boolean*/  = __c.True;
RDebugUtils.currentLine=256114716;
 //BA.debugLineNum = 256114716;BA.debugLine="CSSRule.Initialize";
__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=256114717;
 //BA.debugLineNum = 256114717;BA.debugLine="CSSRule.clear";
__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=256114718;
 //BA.debugLineNum = 256114718;BA.debugLine="SingleQuote.Initialize";
__ref._singlequote /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=256114719;
 //BA.debugLineNum = 256114719;BA.debugLine="SingleQuote.clear";
__ref._singlequote /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=256114720;
 //BA.debugLineNum = 256114720;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256114721;
 //BA.debugLineNum = 256114721;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settext(b4j.example.vuehtml __ref,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "settext", new Object[] {_stext}));}
RDebugUtils.currentLine=255393792;
 //BA.debugLineNum = 255393792;BA.debugLine="Sub SetText(sText As String) As VueHTML";
RDebugUtils.currentLine=255393793;
 //BA.debugLineNum = 255393793;BA.debugLine="AddContent(sText)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_stext);
RDebugUtils.currentLine=255393794;
 //BA.debugLineNum = 255393794;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=255393795;
 //BA.debugLineNum = 255393795;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255393796;
 //BA.debugLineNum = 255393796;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvcloak(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvcloak", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvcloak", null));}
RDebugUtils.currentLine=241827840;
 //BA.debugLineNum = 241827840;BA.debugLine="Sub SetVCloak As VueHTML";
RDebugUtils.currentLine=241827841;
 //BA.debugLineNum = 241827841;BA.debugLine="SetAttr(\"v-cloak\", \"true\")";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-cloak","true");
RDebugUtils.currentLine=241827842;
 //BA.debugLineNum = 241827842;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=241827843;
 //BA.debugLineNum = 241827843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattr(b4j.example.vuehtml __ref,String _attr,String _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattr", new Object[] {_attr,_val}));}
RDebugUtils.currentLine=244973568;
 //BA.debugLineNum = 244973568;BA.debugLine="Sub SetAttr(attr As String, val As String) As VueH";
RDebugUtils.currentLine=244973569;
 //BA.debugLineNum = 244973569;BA.debugLine="AddAttribute(attr,val)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,_attr,(Object)(_val));
RDebugUtils.currentLine=244973570;
 //BA.debugLineNum = 244973570;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244973571;
 //BA.debugLineNum = 244973571;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
String _imgurl = "";
String _lnk = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strcontent = "";
String _sout = "";
RDebugUtils.currentLine=259784704;
 //BA.debugLineNum = 259784704;BA.debugLine="public Sub ToString As String";
RDebugUtils.currentLine=259784705;
 //BA.debugLineNum = 259784705;BA.debugLine="If ParentID <> \"\" Then";
if ((__ref._parentid /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=259784706;
 //BA.debugLineNum = 259784706;BA.debugLine="ID = ParentID & ID";
__ref._id /*String*/  = __ref._parentid /*String*/ +__ref._id /*String*/ ;
 };
RDebugUtils.currentLine=259784708;
 //BA.debugLineNum = 259784708;BA.debugLine="Select Case Tag";
switch (BA.switchObjectToInt(__ref._tag /*String*/ ,"img","script","link")) {
case 0: 
case 1: {
RDebugUtils.currentLine=259784711;
 //BA.debugLineNum = 259784711;BA.debugLine="Dim imgURL As String = GetAttr(\"src\")";
_imgurl = BA.ObjectToString(__ref._getattr /*Object*/ (null,"src"));
RDebugUtils.currentLine=259784712;
 //BA.debugLineNum = 259784712;BA.debugLine="If imgURL.Length > 0 Then";
if (_imgurl.length()>0) { 
RDebugUtils.currentLine=259784713;
 //BA.debugLineNum = 259784713;BA.debugLine="imgURL = imgURL.tolowercase";
_imgurl = _imgurl.toLowerCase();
 };
 break; }
case 2: {
RDebugUtils.currentLine=259784716;
 //BA.debugLineNum = 259784716;BA.debugLine="Dim lnk As String = GetAttr(\"href\")";
_lnk = BA.ObjectToString(__ref._getattr /*Object*/ (null,"href"));
RDebugUtils.currentLine=259784717;
 //BA.debugLineNum = 259784717;BA.debugLine="If lnk.Length > 0 Then";
if (_lnk.length()>0) { 
RDebugUtils.currentLine=259784718;
 //BA.debugLineNum = 259784718;BA.debugLine="lnk = lnk.tolowercase";
_lnk = _lnk.toLowerCase();
 };
 break; }
}
;
RDebugUtils.currentLine=259784721;
 //BA.debugLineNum = 259784721;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=259784722;
 //BA.debugLineNum = 259784722;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=259784723;
 //BA.debugLineNum = 259784723;BA.debugLine="sb.Append(SBBefore)";
_sb.Append(BA.ObjectToString(__ref._sbbefore /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ ));
RDebugUtils.currentLine=259784724;
 //BA.debugLineNum = 259784724;BA.debugLine="sb.Append(Open)";
_sb.Append(__ref._open /*String*/ (null));
RDebugUtils.currentLine=259784725;
 //BA.debugLineNum = 259784725;BA.debugLine="For Each strContent As String In Contents";
{
final anywheresoftware.b4a.BA.IterableList group20 = __ref._contents /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_strcontent = BA.ObjectToString(group20.Get(index20));
RDebugUtils.currentLine=259784726;
 //BA.debugLineNum = 259784726;BA.debugLine="If strContent.Length > 0 Then";
if (_strcontent.length()>0) { 
RDebugUtils.currentLine=259784727;
 //BA.debugLineNum = 259784727;BA.debugLine="strContent = strContent.trim";
_strcontent = _strcontent.trim();
RDebugUtils.currentLine=259784728;
 //BA.debugLineNum = 259784728;BA.debugLine="sb.Append(strContent.trim)";
_sb.Append(_strcontent.trim());
 };
 }
};
RDebugUtils.currentLine=259784731;
 //BA.debugLineNum = 259784731;BA.debugLine="sb.Append(Close)";
_sb.Append(__ref._close /*String*/ (null));
RDebugUtils.currentLine=259784732;
 //BA.debugLineNum = 259784732;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
RDebugUtils.currentLine=259784733;
 //BA.debugLineNum = 259784733;BA.debugLine="If DontBreak.IndexOf(Tag) <> -1 Then";
if (__ref._dontbreak /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(__ref._tag /*String*/ ))!=-1) { 
RDebugUtils.currentLine=259784734;
 //BA.debugLineNum = 259784734;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
_sout = _sout.replace(__c.CRLF,"");
 };
RDebugUtils.currentLine=259784737;
 //BA.debugLineNum = 259784737;BA.debugLine="sout = sout & SBAfter.tostring";
_sout = _sout+__ref._sbafter /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString();
RDebugUtils.currentLine=259784738;
 //BA.debugLineNum = 259784738;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
_sout = _sout.replace(__c.CRLF,"");
RDebugUtils.currentLine=259784739;
 //BA.debugLineNum = 259784739;BA.debugLine="sout = sout.Replace(\"  >\",\">\")";
_sout = _sout.replace("  >",">");
RDebugUtils.currentLine=259784740;
 //BA.debugLineNum = 259784740;BA.debugLine="sout = sout.Replace(\" >\",\">\")";
_sout = _sout.replace(" >",">");
RDebugUtils.currentLine=259784741;
 //BA.debugLineNum = 259784741;BA.debugLine="Return sout";
if (true) return _sout;
RDebugUtils.currentLine=259784742;
 //BA.debugLineNum = 259784742;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _clear(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=251002880;
 //BA.debugLineNum = 251002880;BA.debugLine="Sub Clear As VueHTML";
RDebugUtils.currentLine=251002881;
 //BA.debugLineNum = 251002881;BA.debugLine="Contents.clear";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=251002882;
 //BA.debugLineNum = 251002882;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251002883;
 //BA.debugLineNum = 251002883;BA.debugLine="End Sub";
return null;
}
public String  _makepx(b4j.example.vuehtml __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "makepx", true))
	 {return ((String) Debug.delegate(ba, "makepx", new Object[] {_svalue}));}
RDebugUtils.currentLine=254017536;
 //BA.debugLineNum = 254017536;BA.debugLine="Sub MakePx(sValue As String) As String";
RDebugUtils.currentLine=254017537;
 //BA.debugLineNum = 254017537;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
RDebugUtils.currentLine=254017538;
 //BA.debugLineNum = 254017538;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
RDebugUtils.currentLine=254017539;
 //BA.debugLineNum = 254017539;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017540;
 //BA.debugLineNum = 254017540;BA.debugLine="else If sValue.EndsWith(\"vm\") Then";
if (_svalue.endsWith("vm")) { 
RDebugUtils.currentLine=254017541;
 //BA.debugLineNum = 254017541;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017542;
 //BA.debugLineNum = 254017542;BA.debugLine="else If sValue.EndsWith(\"px\") Then";
if (_svalue.endsWith("px")) { 
RDebugUtils.currentLine=254017543;
 //BA.debugLineNum = 254017543;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017544;
 //BA.debugLineNum = 254017544;BA.debugLine="else If sValue.EndsWith(\"cm\") Then";
if (_svalue.endsWith("cm")) { 
RDebugUtils.currentLine=254017545;
 //BA.debugLineNum = 254017545;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017546;
 //BA.debugLineNum = 254017546;BA.debugLine="else If sValue.EndsWith(\"mm\") Then";
if (_svalue.endsWith("mm")) { 
RDebugUtils.currentLine=254017547;
 //BA.debugLineNum = 254017547;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017548;
 //BA.debugLineNum = 254017548;BA.debugLine="else If sValue.EndsWith(\"in\") Then";
if (_svalue.endsWith("in")) { 
RDebugUtils.currentLine=254017549;
 //BA.debugLineNum = 254017549;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017550;
 //BA.debugLineNum = 254017550;BA.debugLine="else If sValue.EndsWith(\"pt\") Then";
if (_svalue.endsWith("pt")) { 
RDebugUtils.currentLine=254017551;
 //BA.debugLineNum = 254017551;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017552;
 //BA.debugLineNum = 254017552;BA.debugLine="else If sValue.EndsWith(\"pc\") Then";
if (_svalue.endsWith("pc")) { 
RDebugUtils.currentLine=254017553;
 //BA.debugLineNum = 254017553;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017554;
 //BA.debugLineNum = 254017554;BA.debugLine="else If sValue.EndsWith(\"em\") Then";
if (_svalue.endsWith("em")) { 
RDebugUtils.currentLine=254017555;
 //BA.debugLineNum = 254017555;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017556;
 //BA.debugLineNum = 254017556;BA.debugLine="else If sValue.EndsWith(\"ex\") Then";
if (_svalue.endsWith("ex")) { 
RDebugUtils.currentLine=254017557;
 //BA.debugLineNum = 254017557;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017558;
 //BA.debugLineNum = 254017558;BA.debugLine="else If sValue.EndsWith(\"ch\") Then";
if (_svalue.endsWith("ch")) { 
RDebugUtils.currentLine=254017559;
 //BA.debugLineNum = 254017559;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017560;
 //BA.debugLineNum = 254017560;BA.debugLine="else If sValue.EndsWith(\"rem\") Then";
if (_svalue.endsWith("rem")) { 
RDebugUtils.currentLine=254017561;
 //BA.debugLineNum = 254017561;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017562;
 //BA.debugLineNum = 254017562;BA.debugLine="else If sValue.EndsWith(\"vw\") Then";
if (_svalue.endsWith("vw")) { 
RDebugUtils.currentLine=254017563;
 //BA.debugLineNum = 254017563;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017564;
 //BA.debugLineNum = 254017564;BA.debugLine="else If sValue.EndsWith(\"vh\") Then";
if (_svalue.endsWith("vh")) { 
RDebugUtils.currentLine=254017565;
 //BA.debugLineNum = 254017565;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017566;
 //BA.debugLineNum = 254017566;BA.debugLine="else If sValue.EndsWith(\"vmin\") Then";
if (_svalue.endsWith("vmin")) { 
RDebugUtils.currentLine=254017567;
 //BA.debugLineNum = 254017567;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017568;
 //BA.debugLineNum = 254017568;BA.debugLine="else If sValue.EndsWith(\"vmax\") Then";
if (_svalue.endsWith("vmax")) { 
RDebugUtils.currentLine=254017569;
 //BA.debugLineNum = 254017569;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=254017570;
 //BA.debugLineNum = 254017570;BA.debugLine="else If sValue.EndsWith(\";\") Then";
if (_svalue.endsWith(";")) { 
RDebugUtils.currentLine=254017571;
 //BA.debugLineNum = 254017571;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
RDebugUtils.currentLine=254017573;
 //BA.debugLineNum = 254017573;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
RDebugUtils.currentLine=254017574;
 //BA.debugLineNum = 254017574;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
RDebugUtils.currentLine=254017575;
 //BA.debugLineNum = 254017575;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
RDebugUtils.currentLine=254017576;
 //BA.debugLineNum = 254017576;BA.debugLine="Return sValue";
if (true) return _svalue;
 }}}}}}}}}}}}}}}}}
;
RDebugUtils.currentLine=254017578;
 //BA.debugLineNum = 254017578;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addelement(b4j.example.vuehtml __ref,b4j.example.vuehtml _el) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addelement", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addelement", new Object[] {_el}));}
String _scode = "";
RDebugUtils.currentLine=257163264;
 //BA.debugLineNum = 257163264;BA.debugLine="public Sub AddElement(el As VueHTML) As VueHTML";
RDebugUtils.currentLine=257163265;
 //BA.debugLineNum = 257163265;BA.debugLine="If el <> Null Then";
if (_el!= null) { 
RDebugUtils.currentLine=257163266;
 //BA.debugLineNum = 257163266;BA.debugLine="Dim scode As String = el.tostring";
_scode = _el._tostring /*String*/ (null);
RDebugUtils.currentLine=257163267;
 //BA.debugLineNum = 257163267;BA.debugLine="AddContent(scode)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_scode);
RDebugUtils.currentLine=257163268;
 //BA.debugLineNum = 257163268;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=257163270;
 //BA.debugLineNum = 257163270;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257163271;
 //BA.debugLineNum = 257163271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeattr(b4j.example.vuehtml __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removeattr", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removeattr", new Object[] {_sname}));}
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
RDebugUtils.currentLine=256442368;
 //BA.debugLineNum = 256442368;BA.debugLine="public Sub RemoveAttr(sName As String) As VueHTML";
RDebugUtils.currentLine=256442369;
 //BA.debugLineNum = 256442369;BA.debugLine="sName = sName.ToLowerCase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=256442370;
 //BA.debugLineNum = 256442370;BA.debugLine="sName = sName.Replace(\" \",\";\")";
_sname = _sname.replace(" ",";");
RDebugUtils.currentLine=256442371;
 //BA.debugLineNum = 256442371;BA.debugLine="Dim sItems As List = StrParse(\";\",sName)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,";",_sname);
RDebugUtils.currentLine=256442372;
 //BA.debugLineNum = 256442372;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sitems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=256442373;
 //BA.debugLineNum = 256442373;BA.debugLine="strStyle = strStyle.trim";
_strstyle = _strstyle.trim();
RDebugUtils.currentLine=256442374;
 //BA.debugLineNum = 256442374;BA.debugLine="If properties.ContainsKey(strStyle) Then";
if (__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_strstyle))) { 
RDebugUtils.currentLine=256442375;
 //BA.debugLineNum = 256442375;BA.debugLine="properties.Remove(strStyle)";
__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_strstyle));
 };
 }
};
RDebugUtils.currentLine=256442378;
 //BA.debugLineNum = 256442378;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256442379;
 //BA.debugLineNum = 256442379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeclass(b4j.example.vuehtml __ref,String _classname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removeclass", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removeclass", new Object[] {_classname}));}
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
RDebugUtils.currentLine=257097728;
 //BA.debugLineNum = 257097728;BA.debugLine="public Sub removeClass(className As String) As Vue";
RDebugUtils.currentLine=257097729;
 //BA.debugLineNum = 257097729;BA.debugLine="className = className.Trim";
_classname = _classname.trim();
RDebugUtils.currentLine=257097730;
 //BA.debugLineNum = 257097730;BA.debugLine="className = className.replace(\" \",\";\")";
_classname = _classname.replace(" ",";");
RDebugUtils.currentLine=257097731;
 //BA.debugLineNum = 257097731;BA.debugLine="Dim sItems As List = StrParse(\";\",className)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,";",_classname);
RDebugUtils.currentLine=257097732;
 //BA.debugLineNum = 257097732;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sitems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=257097733;
 //BA.debugLineNum = 257097733;BA.debugLine="strStyle = strStyle.Trim";
_strstyle = _strstyle.trim();
RDebugUtils.currentLine=257097734;
 //BA.debugLineNum = 257097734;BA.debugLine="If Classes.ContainsKey(strStyle) Then";
if (__ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_strstyle))) { 
RDebugUtils.currentLine=257097735;
 //BA.debugLineNum = 257097735;BA.debugLine="Classes.Remove(strStyle)";
__ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_strstyle));
 };
 }
};
RDebugUtils.currentLine=257097738;
 //BA.debugLineNum = 257097738;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257097739;
 //BA.debugLineNum = 257097739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setalt(b4j.example.vuehtml __ref,String _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setalt", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setalt", new Object[] {_a}));}
RDebugUtils.currentLine=242810880;
 //BA.debugLineNum = 242810880;BA.debugLine="Sub SetAlt(a As String) As VueHTML";
RDebugUtils.currentLine=242810881;
 //BA.debugLineNum = 242810881;BA.debugLine="SetAttr(\"alt\", a)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"alt",_a);
RDebugUtils.currentLine=242810882;
 //BA.debugLineNum = 242810882;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242810883;
 //BA.debugLineNum = 242810883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settag(b4j.example.vuehtml __ref,String _stag) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "settag", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "settag", new Object[] {_stag}));}
RDebugUtils.currentLine=255655936;
 //BA.debugLineNum = 255655936;BA.debugLine="Sub SetTag(sTag As String) As VueHTML";
RDebugUtils.currentLine=255655937;
 //BA.debugLineNum = 255655937;BA.debugLine="Tag = sTag.tolowercase";
__ref._tag /*String*/  = _stag.toLowerCase();
RDebugUtils.currentLine=255655938;
 //BA.debugLineNum = 255655938;BA.debugLine="If Tag = \"pre\" Then";
if ((__ref._tag /*String*/ ).equals("pre")) { 
RDebugUtils.currentLine=255655939;
 //BA.debugLineNum = 255655939;BA.debugLine="AddClass(\"code-line\")";
__ref._addclass /*b4j.example.vuehtml*/ (null,"code-line");
 };
RDebugUtils.currentLine=255655941;
 //BA.debugLineNum = 255655941;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255655942;
 //BA.debugLineNum = 255655942;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyle(b4j.example.vuehtml __ref,String _prop,String _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyle", new Object[] {_prop,_val}));}
RDebugUtils.currentLine=249233408;
 //BA.debugLineNum = 249233408;BA.debugLine="Sub SetStyle(prop As String, val As String) As Vue";
RDebugUtils.currentLine=249233409;
 //BA.debugLineNum = 249233409;BA.debugLine="AddStyleAttribute(prop,val)";
__ref._addstyleattribute /*b4j.example.vuehtml*/ (null,_prop,(Object)(_val));
RDebugUtils.currentLine=249233410;
 //BA.debugLineNum = 249233410;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249233411;
 //BA.debugLineNum = 249233411;BA.debugLine="End Sub";
return null;
}
public String  _join(b4j.example.vuehtml __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "join", true))
	 {return ((String) Debug.delegate(ba, "join", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=259588096;
 //BA.debugLineNum = 259588096;BA.debugLine="public Sub Join(delimiter As String, lst As List)";
RDebugUtils.currentLine=259588097;
 //BA.debugLineNum = 259588097;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=259588098;
 //BA.debugLineNum = 259588098;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=259588099;
 //BA.debugLineNum = 259588099;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=259588100;
 //BA.debugLineNum = 259588100;BA.debugLine="sb.Append(lst.get(0))";
_sb.Append(BA.ObjectToString(_lst.Get((int) (0))));
RDebugUtils.currentLine=259588101;
 //BA.debugLineNum = 259588101;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=259588102;
 //BA.debugLineNum = 259588102;BA.debugLine="sb.Append(delimiter).Append(lst.get(i))";
_sb.Append(_delimiter).Append(BA.ObjectToString(_lst.Get(_i)));
 }
};
RDebugUtils.currentLine=259588104;
 //BA.debugLineNum = 259588104;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=259588105;
 //BA.debugLineNum = 259588105;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _setattrhref(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrhref", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrhref", new Object[] {_value}));}
RDebugUtils.currentLine=254869504;
 //BA.debugLineNum = 254869504;BA.debugLine="Sub SetAttrHREF(value As String) As VueHTML";
RDebugUtils.currentLine=254869505;
 //BA.debugLineNum = 254869505;BA.debugLine="AddAttribute(\"href\",value)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"href",(Object)(_value));
RDebugUtils.currentLine=254869506;
 //BA.debugLineNum = 254869506;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254869507;
 //BA.debugLineNum = 254869507;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrplaceholder(b4j.example.vuehtml __ref,String _splaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrplaceholder", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrplaceholder", new Object[] {_splaceholder}));}
RDebugUtils.currentLine=250609664;
 //BA.debugLineNum = 250609664;BA.debugLine="Sub SetAttrPlaceHolder(sPlaceholder As String) As";
RDebugUtils.currentLine=250609665;
 //BA.debugLineNum = 250609665;BA.debugLine="AddAttribute(\"placeholder\",sPlaceholder)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"placeholder",(Object)(_splaceholder));
RDebugUtils.currentLine=250609666;
 //BA.debugLineNum = 250609666;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250609667;
 //BA.debugLineNum = 250609667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setpointer(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setpointer", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setpointer", new Object[] {_b}));}
RDebugUtils.currentLine=242155520;
 //BA.debugLineNum = 242155520;BA.debugLine="Sub SetPointer(b As Boolean) As VueHTML";
RDebugUtils.currentLine=242155521;
 //BA.debugLineNum = 242155521;BA.debugLine="SetStyle(\"cursor\",\"pointer\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"cursor","pointer");
RDebugUtils.currentLine=242155522;
 //BA.debugLineNum = 242155522;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242155523;
 //BA.debugLineNum = 242155523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyles(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyles", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyles", new Object[] {_m}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=244383744;
 //BA.debugLineNum = 244383744;BA.debugLine="Sub SetStyles(m As Map) As VueHTML";
RDebugUtils.currentLine=244383745;
 //BA.debugLineNum = 244383745;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=244383746;
 //BA.debugLineNum = 244383746;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
RDebugUtils.currentLine=244383747;
 //BA.debugLineNum = 244383747;BA.debugLine="SetStyle(k,v)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,_k,_v);
 }
};
RDebugUtils.currentLine=244383749;
 //BA.debugLineNum = 244383749;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244383750;
 //BA.debugLineNum = 244383750;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settabindex(b4j.example.vuehtml __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=241893376;
 //BA.debugLineNum = 241893376;BA.debugLine="Sub SetTabIndex(ti As String) As VueHTML";
RDebugUtils.currentLine=241893377;
 //BA.debugLineNum = 241893377;BA.debugLine="SetAttr(\"tabindex\", ti)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"tabindex",_ti);
RDebugUtils.currentLine=241893378;
 //BA.debugLineNum = 241893378;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=241893379;
 //BA.debugLineNum = 241893379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvif(b4j.example.vuehtml __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=243531776;
 //BA.debugLineNum = 243531776;BA.debugLine="Sub SetVIf(vif As Object) As VueHTML";
RDebugUtils.currentLine=243531777;
 //BA.debugLineNum = 243531777;BA.debugLine="SetAttr(\"v-if\", vif)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-if",BA.ObjectToString(_vif));
RDebugUtils.currentLine=243531778;
 //BA.debugLineNum = 243531778;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243531779;
 //BA.debugLineNum = 243531779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvshow(b4j.example.vuehtml __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=243597312;
 //BA.debugLineNum = 243597312;BA.debugLine="Sub SetVShow(vif As Object) As VueHTML";
RDebugUtils.currentLine=243597313;
 //BA.debugLineNum = 243597313;BA.debugLine="SetAttr(\"v-show\", vif)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-show",BA.ObjectToString(_vif));
RDebugUtils.currentLine=243597314;
 //BA.debugLineNum = 243597314;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243597315;
 //BA.debugLineNum = 243597315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstyle(b4j.example.vuehtml __ref,String _prop,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addstyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addstyle", new Object[] {_prop,_value}));}
RDebugUtils.currentLine=259260416;
 //BA.debugLineNum = 259260416;BA.debugLine="Sub AddStyle(prop As String, value As Object) As V";
RDebugUtils.currentLine=259260417;
 //BA.debugLineNum = 259260417;BA.debugLine="AddStyleAttribute(prop,value)";
__ref._addstyleattribute /*b4j.example.vuehtml*/ (null,_prop,_value);
RDebugUtils.currentLine=259260418;
 //BA.debugLineNum = 259260418;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=259260419;
 //BA.debugLineNum = 259260419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstyleattribute(b4j.example.vuehtml __ref,String _sprop,Object _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addstyleattribute", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addstyleattribute", new Object[] {_sprop,_svalue}));}
String _xvalue = "";
RDebugUtils.currentLine=259325952;
 //BA.debugLineNum = 259325952;BA.debugLine="Sub AddStyleAttribute(sprop As String, svalue As O";
RDebugUtils.currentLine=259325953;
 //BA.debugLineNum = 259325953;BA.debugLine="If svalue = Null Then Return Me";
if (_svalue== null) { 
if (true) return (b4j.example.vuehtml)(this);};
RDebugUtils.currentLine=259325954;
 //BA.debugLineNum = 259325954;BA.debugLine="sprop = sprop.ToLowerCase";
_sprop = _sprop.toLowerCase();
RDebugUtils.currentLine=259325955;
 //BA.debugLineNum = 259325955;BA.debugLine="sprop = sprop.Trim";
_sprop = _sprop.trim();
RDebugUtils.currentLine=259325956;
 //BA.debugLineNum = 259325956;BA.debugLine="Dim xvalue As String = CStr(svalue)";
_xvalue = __ref._cstr /*String*/ (null,_svalue);
RDebugUtils.currentLine=259325958;
 //BA.debugLineNum = 259325958;BA.debugLine="sprop = RemDelim(sprop,\":\")";
_sprop = __ref._remdelim /*String*/ (null,_sprop,":");
RDebugUtils.currentLine=259325960;
 //BA.debugLineNum = 259325960;BA.debugLine="xvalue = RemDelim(xvalue,\";\")";
_xvalue = __ref._remdelim /*String*/ (null,_xvalue,";");
RDebugUtils.currentLine=259325961;
 //BA.debugLineNum = 259325961;BA.debugLine="sprop = sprop.Trim";
_sprop = _sprop.trim();
RDebugUtils.currentLine=259325962;
 //BA.debugLineNum = 259325962;BA.debugLine="xvalue = xvalue.trim";
_xvalue = _xvalue.trim();
RDebugUtils.currentLine=259325963;
 //BA.debugLineNum = 259325963;BA.debugLine="If xvalue.Length > 0 And sprop.length > 0 Then";
if (_xvalue.length()>0 && _sprop.length()>0) { 
RDebugUtils.currentLine=259325965;
 //BA.debugLineNum = 259325965;BA.debugLine="If xvalue.EndsWith(\"!important\") = False Then";
if (_xvalue.endsWith("!important")==__c.False) { 
RDebugUtils.currentLine=259325966;
 //BA.debugLineNum = 259325966;BA.debugLine="If IsImportant Then";
if (__ref._isimportant /*boolean*/ ) { 
RDebugUtils.currentLine=259325967;
 //BA.debugLineNum = 259325967;BA.debugLine="xvalue = xvalue & \" !important\"";
_xvalue = _xvalue+" !important";
 };
 };
RDebugUtils.currentLine=259325971;
 //BA.debugLineNum = 259325971;BA.debugLine="Styles.Put(sprop, xvalue)";
__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_sprop),(Object)(_xvalue));
 };
RDebugUtils.currentLine=259325973;
 //BA.debugLineNum = 259325973;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=259325974;
 //BA.debugLineNum = 259325974;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=259325975;
 //BA.debugLineNum = 259325975;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentlist(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcontentlist", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcontentlist", new Object[] {_lst}));}
String _strcontent = "";
RDebugUtils.currentLine=255262720;
 //BA.debugLineNum = 255262720;BA.debugLine="Sub AddContentList(lst As List) As VueHTML";
RDebugUtils.currentLine=255262721;
 //BA.debugLineNum = 255262721;BA.debugLine="For Each strContent As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcontent = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=255262722;
 //BA.debugLineNum = 255262722;BA.debugLine="AddContent(strContent)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_strcontent);
 }
};
RDebugUtils.currentLine=255262724;
 //BA.debugLineNum = 255262724;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255262725;
 //BA.debugLineNum = 255262725;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtarget(b4j.example.vuehtml __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtarget", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtarget", new Object[] {_svalue}));}
RDebugUtils.currentLine=251199488;
 //BA.debugLineNum = 251199488;BA.debugLine="Sub SetAttrTARGET(sValue As String) As VueHTML";
RDebugUtils.currentLine=251199489;
 //BA.debugLineNum = 251199489;BA.debugLine="If sValue.Trim = \"\" Then Return Me";
if ((_svalue.trim()).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
RDebugUtils.currentLine=251199490;
 //BA.debugLineNum = 251199490;BA.debugLine="AddAttribute(\"target\",sValue)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"target",(Object)(_svalue));
RDebugUtils.currentLine=251199491;
 //BA.debugLineNum = 251199491;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251199492;
 //BA.debugLineNum = 251199492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setsrc(b4j.example.vuehtml __ref,String _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setsrc", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setsrc", new Object[] {_bind}));}
RDebugUtils.currentLine=242745344;
 //BA.debugLineNum = 242745344;BA.debugLine="Sub SetSrc(bind As String) As VueHTML";
RDebugUtils.currentLine=242745345;
 //BA.debugLineNum = 242745345;BA.debugLine="SetAttr(\":src\", bind)";
__ref._setattr /*b4j.example.vuehtml*/ (null,":src",_bind);
RDebugUtils.currentLine=242745346;
 //BA.debugLineNum = 242745346;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242745347;
 //BA.debugLineNum = 242745347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settype(b4j.example.vuehtml __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "settype", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "settype", new Object[] {_t}));}
RDebugUtils.currentLine=255328256;
 //BA.debugLineNum = 255328256;BA.debugLine="Sub SetType(t As String) As VueHTML";
RDebugUtils.currentLine=255328257;
 //BA.debugLineNum = 255328257;BA.debugLine="SetAttr(\"type\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"type",_t);
RDebugUtils.currentLine=255328258;
 //BA.debugLineNum = 255328258;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255328259;
 //BA.debugLineNum = 255328259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addanchor(b4j.example.vuehtml __ref,String _href,String _caption,String _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addanchor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addanchor", new Object[] {_href,_caption,_target}));}
RDebugUtils.currentLine=260964352;
 //BA.debugLineNum = 260964352;BA.debugLine="Sub AddAnchor(href As String,caption As String,Tar";
RDebugUtils.currentLine=260964353;
 //BA.debugLineNum = 260964353;BA.debugLine="AddLink(href,caption,Target)";
__ref._addlink /*b4j.example.vuehtml*/ (null,_href,_caption,_target);
RDebugUtils.currentLine=260964354;
 //BA.debugLineNum = 260964354;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260964355;
 //BA.debugLineNum = 260964355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addlink(b4j.example.vuehtml __ref,String _href,String _caption,String _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addlink", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addlink", new Object[] {_href,_caption,_target}));}
b4j.example.vuehtml _a = null;
RDebugUtils.currentLine=260898816;
 //BA.debugLineNum = 260898816;BA.debugLine="Sub AddLink(href As String,caption As String,Targe";
RDebugUtils.currentLine=260898817;
 //BA.debugLineNum = 260898817;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
RDebugUtils.currentLine=260898818;
 //BA.debugLineNum = 260898818;BA.debugLine="a.Initialize(\"\",\"a\").SetAttrHREF(href).AddContent";
_a._initialize /*b4j.example.vuehtml*/ (null,ba,"","a")._setattrhref /*b4j.example.vuehtml*/ (null,_href)._addcontent /*b4j.example.vuehtml*/ (null,_caption)._setattrtarget /*b4j.example.vuehtml*/ (null,_target);
RDebugUtils.currentLine=260898819;
 //BA.debugLineNum = 260898819;BA.debugLine="AddElement(a)";
__ref._addelement /*b4j.example.vuehtml*/ (null,_a);
RDebugUtils.currentLine=260898820;
 //BA.debugLineNum = 260898820;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260898821;
 //BA.debugLineNum = 260898821;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addattribute(b4j.example.vuehtml __ref,String _skey,Object _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addattribute", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addattribute", new Object[] {_skey,_svalue}));}
RDebugUtils.currentLine=259457024;
 //BA.debugLineNum = 259457024;BA.debugLine="public Sub AddAttribute(skey As String, svalue As";
RDebugUtils.currentLine=259457025;
 //BA.debugLineNum = 259457025;BA.debugLine="If svalue <> Null Then";
if (_svalue!= null) { 
RDebugUtils.currentLine=259457026;
 //BA.debugLineNum = 259457026;BA.debugLine="skey = CStr(skey)";
_skey = __ref._cstr /*String*/ (null,(Object)(_skey));
RDebugUtils.currentLine=259457027;
 //BA.debugLineNum = 259457027;BA.debugLine="skey = skey.trim";
_skey = _skey.trim();
RDebugUtils.currentLine=259457028;
 //BA.debugLineNum = 259457028;BA.debugLine="properties.Put(skey,svalue)";
__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_skey),_svalue);
RDebugUtils.currentLine=259457029;
 //BA.debugLineNum = 259457029;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=259457031;
 //BA.debugLineNum = 259457031;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=259457032;
 //BA.debugLineNum = 259457032;BA.debugLine="End Sub";
return null;
}
public String  _cstr(b4j.example.vuehtml __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=256835584;
 //BA.debugLineNum = 256835584;BA.debugLine="private Sub CStr(o As Object) As String";
RDebugUtils.currentLine=256835585;
 //BA.debugLineNum = 256835585;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_o = (Object)("");};
RDebugUtils.currentLine=256835586;
 //BA.debugLineNum = 256835586;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=256835587;
 //BA.debugLineNum = 256835587;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addattributeifset(b4j.example.vuehtml __ref,String _prop,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addattributeifset", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addattributeifset", new Object[] {_prop,_value}));}
RDebugUtils.currentLine=250544128;
 //BA.debugLineNum = 250544128;BA.debugLine="Sub AddAttributeIfSet(prop As String, value As Str";
RDebugUtils.currentLine=250544129;
 //BA.debugLineNum = 250544129;BA.debugLine="If value <> \"\" Then";
if ((_value).equals("") == false) { 
RDebugUtils.currentLine=250544130;
 //BA.debugLineNum = 250544130;BA.debugLine="AddAttribute(prop,value)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,_prop,(Object)(_value));
 };
RDebugUtils.currentLine=250544132;
 //BA.debugLineNum = 250544132;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250544133;
 //BA.debugLineNum = 250544133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addattributeoncondition(b4j.example.vuehtml __ref,boolean _bcondition,String _attr,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addattributeoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addattributeoncondition", new Object[] {_bcondition,_attr,_value}));}
RDebugUtils.currentLine=254476288;
 //BA.debugLineNum = 254476288;BA.debugLine="Sub AddAttributeOnCondition(bCondition As Boolean,";
RDebugUtils.currentLine=254476289;
 //BA.debugLineNum = 254476289;BA.debugLine="If bCondition = True Then";
if (_bcondition==__c.True) { 
RDebugUtils.currentLine=254476290;
 //BA.debugLineNum = 254476290;BA.debugLine="AddAttribute(attr,value)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,_attr,(Object)(_value));
 };
RDebugUtils.currentLine=254476292;
 //BA.debugLineNum = 254476292;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254476293;
 //BA.debugLineNum = 254476293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addbold(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addbold", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addbold", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=259981312;
 //BA.debugLineNum = 259981312;BA.debugLine="Sub AddBold(value As String) As VueHTML";
RDebugUtils.currentLine=259981313;
 //BA.debugLineNum = 259981313;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=259981314;
 //BA.debugLineNum = 259981314;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=259981315;
 //BA.debugLineNum = 259981315;BA.debugLine="sb.Append(\"{B}\").Append(value).Append(\"{/B}\")";
_sb.Append("{B}").Append(_value).Append("{/B}");
RDebugUtils.currentLine=259981316;
 //BA.debugLineNum = 259981316;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=259981317;
 //BA.debugLineNum = 259981317;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=259981318;
 //BA.debugLineNum = 259981318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontent(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcontent", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcontent", new Object[] {_value}));}
RDebugUtils.currentLine=256901120;
 //BA.debugLineNum = 256901120;BA.debugLine="public Sub AddContent(value As String) As VueHTML";
RDebugUtils.currentLine=256901121;
 //BA.debugLineNum = 256901121;BA.debugLine="value = CStr(value)";
_value = __ref._cstr /*String*/ (null,(Object)(_value));
RDebugUtils.currentLine=256901122;
 //BA.debugLineNum = 256901122;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
RDebugUtils.currentLine=256901123;
 //BA.debugLineNum = 256901123;BA.debugLine="value = FormatText(value)";
_value = __ref._formattext /*String*/ (null,_value);
RDebugUtils.currentLine=256901124;
 //BA.debugLineNum = 256901124;BA.debugLine="Contents.Add(value)";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_value));
RDebugUtils.currentLine=256901125;
 //BA.debugLineNum = 256901125;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=256901127;
 //BA.debugLineNum = 256901127;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256901128;
 //BA.debugLineNum = 256901128;BA.debugLine="End Sub";
return null;
}
public String  _addbr(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addbr", true))
	 {return ((String) Debug.delegate(ba, "addbr", null));}
RDebugUtils.currentLine=243400704;
 //BA.debugLineNum = 243400704;BA.debugLine="Sub AddBR";
RDebugUtils.currentLine=243400705;
 //BA.debugLineNum = 243400705;BA.debugLine="SetText(\"<br>\")";
__ref._settext /*b4j.example.vuehtml*/ (null,"<br>");
RDebugUtils.currentLine=243400706;
 //BA.debugLineNum = 243400706;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addbreak(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addbreak", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addbreak", new Object[] {_b}));}
RDebugUtils.currentLine=260833280;
 //BA.debugLineNum = 260833280;BA.debugLine="Sub AddBreak(b As Boolean) As VueHTML  'ignore";
RDebugUtils.currentLine=260833281;
 //BA.debugLineNum = 260833281;BA.debugLine="AddContent(\"{BR}\")";
__ref._addcontent /*b4j.example.vuehtml*/ (null,"{BR}");
RDebugUtils.currentLine=260833282;
 //BA.debugLineNum = 260833282;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260833283;
 //BA.debugLineNum = 260833283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addchild(b4j.example.vuehtml __ref,b4j.example.vuehtml _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=258670592;
 //BA.debugLineNum = 258670592;BA.debugLine="Sub AddChild(child As VueHTML) As VueHTML";
RDebugUtils.currentLine=258670593;
 //BA.debugLineNum = 258670593;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=258670594;
 //BA.debugLineNum = 258670594;BA.debugLine="SetText(childHTML)";
__ref._settext /*b4j.example.vuehtml*/ (null,_childhtml);
RDebugUtils.currentLine=258670595;
 //BA.debugLineNum = 258670595;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258670596;
 //BA.debugLineNum = 258670596;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vuehtml _childx = null;
RDebugUtils.currentLine=258736128;
 //BA.debugLineNum = 258736128;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=258736129;
 //BA.debugLineNum = 258736129;BA.debugLine="For Each childx As VueHTML In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vuehtml)(group1.Get(index1));
RDebugUtils.currentLine=258736130;
 //BA.debugLineNum = 258736130;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vuehtml*/ (null,_childx);
 }
};
RDebugUtils.currentLine=258736132;
 //BA.debugLineNum = 258736132;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addcite(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcite", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcite", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260636672;
 //BA.debugLineNum = 260636672;BA.debugLine="Sub AddCite(value As String) As VueHTML";
RDebugUtils.currentLine=260636673;
 //BA.debugLineNum = 260636673;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260636674;
 //BA.debugLineNum = 260636674;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260636675;
 //BA.debugLineNum = 260636675;BA.debugLine="sb.Append(\"<cite>\").Append(value).Append(\"</cite>";
_sb.Append("<cite>").Append(_value).Append("</cite>");
RDebugUtils.currentLine=260636676;
 //BA.debugLineNum = 260636676;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260636677;
 //BA.debugLineNum = 260636677;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260636678;
 //BA.debugLineNum = 260636678;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _strparse(b4j.example.vuehtml __ref,String _delim,String _inputstring) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "strparse", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "strparse", new Object[] {_delim,_inputstring}));}
anywheresoftware.b4a.objects.collections.List _outlist = null;
int _commaloc = 0;
String _leftside = "";
String _rightside = "";
RDebugUtils.currentLine=259522560;
 //BA.debugLineNum = 259522560;BA.debugLine="private Sub StrParse(Delim As String, InputString";
RDebugUtils.currentLine=259522561;
 //BA.debugLineNum = 259522561;BA.debugLine="Dim OutList As List";
_outlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=259522562;
 //BA.debugLineNum = 259522562;BA.debugLine="Dim CommaLoc As Int";
_commaloc = 0;
RDebugUtils.currentLine=259522563;
 //BA.debugLineNum = 259522563;BA.debugLine="OutList.Initialize";
_outlist.Initialize();
RDebugUtils.currentLine=259522564;
 //BA.debugLineNum = 259522564;BA.debugLine="OutList.clear";
_outlist.Clear();
RDebugUtils.currentLine=259522565;
 //BA.debugLineNum = 259522565;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
RDebugUtils.currentLine=259522566;
 //BA.debugLineNum = 259522566;BA.debugLine="Do While CommaLoc >-1";
while (_commaloc>-1) {
RDebugUtils.currentLine=259522567;
 //BA.debugLineNum = 259522567;BA.debugLine="Dim LeftSide As String";
_leftside = "";
RDebugUtils.currentLine=259522568;
 //BA.debugLineNum = 259522568;BA.debugLine="LeftSide= InputString.SubString2(0,CommaLoc)";
_leftside = _inputstring.substring((int) (0),_commaloc);
RDebugUtils.currentLine=259522569;
 //BA.debugLineNum = 259522569;BA.debugLine="Dim RightSide As String";
_rightside = "";
RDebugUtils.currentLine=259522570;
 //BA.debugLineNum = 259522570;BA.debugLine="RightSide= InputString.SubString(CommaLoc+1)";
_rightside = _inputstring.substring((int) (_commaloc+1));
RDebugUtils.currentLine=259522571;
 //BA.debugLineNum = 259522571;BA.debugLine="OutList.Add(LeftSide)";
_outlist.Add((Object)(_leftside));
RDebugUtils.currentLine=259522572;
 //BA.debugLineNum = 259522572;BA.debugLine="InputString=RightSide";
_inputstring = _rightside;
RDebugUtils.currentLine=259522573;
 //BA.debugLineNum = 259522573;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 }
;
RDebugUtils.currentLine=259522575;
 //BA.debugLineNum = 259522575;BA.debugLine="OutList.Add(InputString)";
_outlist.Add((Object)(_inputstring));
RDebugUtils.currentLine=259522576;
 //BA.debugLineNum = 259522576;BA.debugLine="Return OutList";
if (true) return _outlist;
RDebugUtils.currentLine=259522577;
 //BA.debugLineNum = 259522577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclasses(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _clslist) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addclasses", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addclasses", new Object[] {_clslist}));}
String _c = "";
RDebugUtils.currentLine=244252672;
 //BA.debugLineNum = 244252672;BA.debugLine="Sub AddClasses(clsList As List) As VueHTML";
RDebugUtils.currentLine=244252673;
 //BA.debugLineNum = 244252673;BA.debugLine="For Each c As String In clsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _clslist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=244252674;
 //BA.debugLineNum = 244252674;BA.debugLine="AddClass(c)";
__ref._addclass /*b4j.example.vuehtml*/ (null,_c);
 }
};
RDebugUtils.currentLine=244252676;
 //BA.debugLineNum = 244252676;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244252677;
 //BA.debugLineNum = 244252677;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclassoncondition(b4j.example.vuehtml __ref,boolean _bcondition,String _sclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addclassoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addclassoncondition", new Object[] {_bcondition,_sclass}));}
RDebugUtils.currentLine=255000576;
 //BA.debugLineNum = 255000576;BA.debugLine="Sub AddClassOnCondition(bCondition As Boolean, sCl";
RDebugUtils.currentLine=255000577;
 //BA.debugLineNum = 255000577;BA.debugLine="If bCondition  Then";
if (_bcondition) { 
RDebugUtils.currentLine=255000578;
 //BA.debugLineNum = 255000578;BA.debugLine="AddClass(sClass)";
__ref._addclass /*b4j.example.vuehtml*/ (null,_sclass);
 };
RDebugUtils.currentLine=255000580;
 //BA.debugLineNum = 255000580;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255000581;
 //BA.debugLineNum = 255000581;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclassonfalsecondition(b4j.example.vuehtml __ref,boolean _bcondition,String _sclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addclassonfalsecondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addclassonfalsecondition", new Object[] {_bcondition,_sclass}));}
RDebugUtils.currentLine=255066112;
 //BA.debugLineNum = 255066112;BA.debugLine="Sub AddClassOnFalseCondition(bCondition As Boolean";
RDebugUtils.currentLine=255066113;
 //BA.debugLineNum = 255066113;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
RDebugUtils.currentLine=255066114;
 //BA.debugLineNum = 255066114;BA.debugLine="AddClass(sClass)";
__ref._addclass /*b4j.example.vuehtml*/ (null,_sclass);
 };
RDebugUtils.currentLine=255066116;
 //BA.debugLineNum = 255066116;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255066117;
 //BA.debugLineNum = 255066117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclassonvalue(b4j.example.vuehtml __ref,int _ivalue,String _sclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addclassonvalue", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addclassonvalue", new Object[] {_ivalue,_sclass}));}
RDebugUtils.currentLine=254935040;
 //BA.debugLineNum = 254935040;BA.debugLine="Sub AddClassOnValue(iValue As Int, sClass As Strin";
RDebugUtils.currentLine=254935041;
 //BA.debugLineNum = 254935041;BA.debugLine="If iValue > 0 Then";
if (_ivalue>0) { 
RDebugUtils.currentLine=254935042;
 //BA.debugLineNum = 254935042;BA.debugLine="AddClass(sClass)";
__ref._addclass /*b4j.example.vuehtml*/ (null,_sclass);
 };
RDebugUtils.currentLine=254935044;
 //BA.debugLineNum = 254935044;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254935045;
 //BA.debugLineNum = 254935045;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcode(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcode", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcode", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260440064;
 //BA.debugLineNum = 260440064;BA.debugLine="Sub AddCode(value As String) As VueHTML";
RDebugUtils.currentLine=260440065;
 //BA.debugLineNum = 260440065;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260440066;
 //BA.debugLineNum = 260440066;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260440067;
 //BA.debugLineNum = 260440067;BA.debugLine="sb.Append(\"<code>\").Append(value).Append(\"</code>";
_sb.Append("<code>").Append(_value).Append("</code>");
RDebugUtils.currentLine=260440068;
 //BA.debugLineNum = 260440068;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260440069;
 //BA.debugLineNum = 260440069;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260440070;
 //BA.debugLineNum = 260440070;BA.debugLine="End Sub";
return null;
}
public String  _formattext(b4j.example.vuehtml __ref,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "formattext", true))
	 {return ((String) Debug.delegate(ba, "formattext", new Object[] {_stext}));}
anywheresoftware.b4a.objects.collections.Map _rm = null;
int _ktot = 0;
int _kcnt = 0;
String _strvalue = "";
String _strrep = "";
RDebugUtils.currentLine=259129344;
 //BA.debugLineNum = 259129344;BA.debugLine="private Sub FormatText(sText As String) As String";
RDebugUtils.currentLine=259129345;
 //BA.debugLineNum = 259129345;BA.debugLine="Dim RM As Map";
_rm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=259129346;
 //BA.debugLineNum = 259129346;BA.debugLine="RM.Initialize";
_rm.Initialize();
RDebugUtils.currentLine=259129347;
 //BA.debugLineNum = 259129347;BA.debugLine="RM.clear";
_rm.Clear();
RDebugUtils.currentLine=259129348;
 //BA.debugLineNum = 259129348;BA.debugLine="RM.Put(\"{U}\", \"<ins>\")";
_rm.Put((Object)("{U}"),(Object)("<ins>"));
RDebugUtils.currentLine=259129349;
 //BA.debugLineNum = 259129349;BA.debugLine="RM.Put(\"{/U}\", \"</ins>\")";
_rm.Put((Object)("{/U}"),(Object)("</ins>"));
RDebugUtils.currentLine=259129350;
 //BA.debugLineNum = 259129350;BA.debugLine="RM.Put(\"¢\",\"&cent;\")";
_rm.Put((Object)("¢"),(Object)("&cent;"));
RDebugUtils.currentLine=259129351;
 //BA.debugLineNum = 259129351;BA.debugLine="RM.put(\"£\",\"&pound;\")";
_rm.Put((Object)("£"),(Object)("&pound;"));
RDebugUtils.currentLine=259129352;
 //BA.debugLineNum = 259129352;BA.debugLine="RM.Put(\"{SUP}\", \"<sup>\")";
_rm.Put((Object)("{SUP}"),(Object)("<sup>"));
RDebugUtils.currentLine=259129353;
 //BA.debugLineNum = 259129353;BA.debugLine="RM.Put(\"{/SUP}\", \"</sup>\")";
_rm.Put((Object)("{/SUP}"),(Object)("</sup>"));
RDebugUtils.currentLine=259129354;
 //BA.debugLineNum = 259129354;BA.debugLine="RM.Put(\"¥\",\"&yen;\")";
_rm.Put((Object)("¥"),(Object)("&yen;"));
RDebugUtils.currentLine=259129355;
 //BA.debugLineNum = 259129355;BA.debugLine="RM.Put(\"€\",\"&euro;\")";
_rm.Put((Object)("€"),(Object)("&euro;"));
RDebugUtils.currentLine=259129356;
 //BA.debugLineNum = 259129356;BA.debugLine="RM.put(\"©\",\"&copy;\")";
_rm.Put((Object)("©"),(Object)("&copy;"));
RDebugUtils.currentLine=259129357;
 //BA.debugLineNum = 259129357;BA.debugLine="RM.Put(\"®\",\"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
RDebugUtils.currentLine=259129358;
 //BA.debugLineNum = 259129358;BA.debugLine="RM.Put(\"{POUND}\",\"&pound;\")";
_rm.Put((Object)("{POUND}"),(Object)("&pound;"));
RDebugUtils.currentLine=259129359;
 //BA.debugLineNum = 259129359;BA.debugLine="RM.Put(\"{/B}\", \"</b>\")";
_rm.Put((Object)("{/B}"),(Object)("</b>"));
RDebugUtils.currentLine=259129360;
 //BA.debugLineNum = 259129360;BA.debugLine="RM.Put(\"{I}\", \"<i>\")";
_rm.Put((Object)("{I}"),(Object)("<i>"));
RDebugUtils.currentLine=259129361;
 //BA.debugLineNum = 259129361;BA.debugLine="RM.Put(\"{YEN}\",\"&yen;\")";
_rm.Put((Object)("{YEN}"),(Object)("&yen;"));
RDebugUtils.currentLine=259129362;
 //BA.debugLineNum = 259129362;BA.debugLine="RM.Put(\"{EURO}\",\"&euro;\")";
_rm.Put((Object)("{EURO}"),(Object)("&euro;"));
RDebugUtils.currentLine=259129363;
 //BA.debugLineNum = 259129363;BA.debugLine="RM.Put(\"{CODE}\",\"<code>\")";
_rm.Put((Object)("{CODE}"),(Object)("<code>"));
RDebugUtils.currentLine=259129364;
 //BA.debugLineNum = 259129364;BA.debugLine="RM.Put(\"{/CODE}\",\"</code>\")";
_rm.Put((Object)("{/CODE}"),(Object)("</code>"));
RDebugUtils.currentLine=259129365;
 //BA.debugLineNum = 259129365;BA.debugLine="RM.put(\"{COPYRIGHT}\",\"&copy;\")";
_rm.Put((Object)("{COPYRIGHT}"),(Object)("&copy;"));
RDebugUtils.currentLine=259129366;
 //BA.debugLineNum = 259129366;BA.debugLine="RM.Put(\"{REGISTERED}\",\"&reg;\")";
_rm.Put((Object)("{REGISTERED}"),(Object)("&reg;"));
RDebugUtils.currentLine=259129367;
 //BA.debugLineNum = 259129367;BA.debugLine="RM.Put(\"®\", \"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
RDebugUtils.currentLine=259129368;
 //BA.debugLineNum = 259129368;BA.debugLine="RM.Put(\"{B}\", \"<b>\")";
_rm.Put((Object)("{B}"),(Object)("<b>"));
RDebugUtils.currentLine=259129369;
 //BA.debugLineNum = 259129369;BA.debugLine="RM.Put(\"{SMALL}\", \"<small>\")";
_rm.Put((Object)("{SMALL}"),(Object)("<small>"));
RDebugUtils.currentLine=259129370;
 //BA.debugLineNum = 259129370;BA.debugLine="RM.Put(\"{/SMALL}\", \"</small>\")";
_rm.Put((Object)("{/SMALL}"),(Object)("</small>"));
RDebugUtils.currentLine=259129371;
 //BA.debugLineNum = 259129371;BA.debugLine="RM.Put(\"{EM}\", \"<em>\")";
_rm.Put((Object)("{EM}"),(Object)("<em>"));
RDebugUtils.currentLine=259129372;
 //BA.debugLineNum = 259129372;BA.debugLine="RM.Put(\"{/EM}\", \"</em>\")";
_rm.Put((Object)("{/EM}"),(Object)("</em>"));
RDebugUtils.currentLine=259129373;
 //BA.debugLineNum = 259129373;BA.debugLine="RM.Put(\"{MARK}\", \"<mark>\")";
_rm.Put((Object)("{MARK}"),(Object)("<mark>"));
RDebugUtils.currentLine=259129374;
 //BA.debugLineNum = 259129374;BA.debugLine="RM.Put(\"{/MARK}\", \"</mark>\")";
_rm.Put((Object)("{/MARK}"),(Object)("</mark>"));
RDebugUtils.currentLine=259129375;
 //BA.debugLineNum = 259129375;BA.debugLine="RM.Put(\"{/I}\", \"</i>\")";
_rm.Put((Object)("{/I}"),(Object)("</i>"));
RDebugUtils.currentLine=259129376;
 //BA.debugLineNum = 259129376;BA.debugLine="RM.Put(\"{SUB}\", \"<sub>\")";
_rm.Put((Object)("{SUB}"),(Object)("<sub>"));
RDebugUtils.currentLine=259129377;
 //BA.debugLineNum = 259129377;BA.debugLine="RM.Put(\"{/SUB}\", \"</sub>\")";
_rm.Put((Object)("{/SUB}"),(Object)("</sub>"));
RDebugUtils.currentLine=259129378;
 //BA.debugLineNum = 259129378;BA.debugLine="RM.Put(\"{BR}\", \"<br/>\")";
_rm.Put((Object)("{BR}"),(Object)("<br/>"));
RDebugUtils.currentLine=259129379;
 //BA.debugLineNum = 259129379;BA.debugLine="RM.Put(\"{WBR}\",\"<wbr>\")";
_rm.Put((Object)("{WBR}"),(Object)("<wbr>"));
RDebugUtils.currentLine=259129380;
 //BA.debugLineNum = 259129380;BA.debugLine="RM.Put(\"{STRONG}\", \"<strong>\")";
_rm.Put((Object)("{STRONG}"),(Object)("<strong>"));
RDebugUtils.currentLine=259129381;
 //BA.debugLineNum = 259129381;BA.debugLine="RM.Put(\"{/STRONG}\", \"</strong>\")";
_rm.Put((Object)("{/STRONG}"),(Object)("</strong>"));
RDebugUtils.currentLine=259129382;
 //BA.debugLineNum = 259129382;BA.debugLine="RM.Put(\"{NBSP}\", \"&nbsp;\")";
_rm.Put((Object)("{NBSP}"),(Object)("&nbsp;"));
RDebugUtils.currentLine=259129383;
 //BA.debugLineNum = 259129383;BA.debugLine="RM.Put(\"“\",\"\")";
_rm.Put((Object)("“"),(Object)(""));
RDebugUtils.currentLine=259129384;
 //BA.debugLineNum = 259129384;BA.debugLine="RM.Put(\"”\",\"\")";
_rm.Put((Object)("”"),(Object)(""));
RDebugUtils.currentLine=259129385;
 //BA.debugLineNum = 259129385;BA.debugLine="RM.Put(\"’\",\"'\")";
_rm.Put((Object)("’"),(Object)("'"));
RDebugUtils.currentLine=259129386;
 //BA.debugLineNum = 259129386;BA.debugLine="Dim kTot As Int = RM.Size - 1";
_ktot = (int) (_rm.getSize()-1);
RDebugUtils.currentLine=259129387;
 //BA.debugLineNum = 259129387;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
RDebugUtils.currentLine=259129388;
 //BA.debugLineNum = 259129388;BA.debugLine="For kCnt = 0 To kTot";
{
final int step44 = 1;
final int limit44 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit44 ;_kcnt = _kcnt + step44 ) {
RDebugUtils.currentLine=259129389;
 //BA.debugLineNum = 259129389;BA.debugLine="Dim strValue As String = RM.GetKeyAt(kCnt)";
_strvalue = BA.ObjectToString(_rm.GetKeyAt(_kcnt));
RDebugUtils.currentLine=259129390;
 //BA.debugLineNum = 259129390;BA.debugLine="Dim strRep As String = RM.Get(strValue)";
_strrep = BA.ObjectToString(_rm.Get((Object)(_strvalue)));
RDebugUtils.currentLine=259129391;
 //BA.debugLineNum = 259129391;BA.debugLine="sText = sText.Replace(strValue, strRep)";
_stext = _stext.replace(_strvalue,_strrep);
 }
};
RDebugUtils.currentLine=259129393;
 //BA.debugLineNum = 259129393;BA.debugLine="Return sText";
if (true) return _stext;
RDebugUtils.currentLine=259129394;
 //BA.debugLineNum = 259129394;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addcontentafter(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcontentafter", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcontentafter", new Object[] {_value}));}
RDebugUtils.currentLine=256966656;
 //BA.debugLineNum = 256966656;BA.debugLine="public Sub AddContentAfter(value As String) As Vue";
RDebugUtils.currentLine=256966657;
 //BA.debugLineNum = 256966657;BA.debugLine="value = CStr(value)";
_value = __ref._cstr /*String*/ (null,(Object)(_value));
RDebugUtils.currentLine=256966658;
 //BA.debugLineNum = 256966658;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
RDebugUtils.currentLine=256966659;
 //BA.debugLineNum = 256966659;BA.debugLine="value = FormatText(value)";
_value = __ref._formattext /*String*/ (null,_value);
RDebugUtils.currentLine=256966660;
 //BA.debugLineNum = 256966660;BA.debugLine="SBAfter.Append(value)";
__ref._sbafter /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_value);
RDebugUtils.currentLine=256966661;
 //BA.debugLineNum = 256966661;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=256966663;
 //BA.debugLineNum = 256966663;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256966664;
 //BA.debugLineNum = 256966664;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentbefore(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcontentbefore", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcontentbefore", new Object[] {_value}));}
RDebugUtils.currentLine=257032192;
 //BA.debugLineNum = 257032192;BA.debugLine="public Sub AddContentBefore(value As String) As Vu";
RDebugUtils.currentLine=257032193;
 //BA.debugLineNum = 257032193;BA.debugLine="value = CStr(value)";
_value = __ref._cstr /*String*/ (null,(Object)(_value));
RDebugUtils.currentLine=257032194;
 //BA.debugLineNum = 257032194;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
RDebugUtils.currentLine=257032195;
 //BA.debugLineNum = 257032195;BA.debugLine="value = FormatText(value)";
_value = __ref._formattext /*String*/ (null,_value);
RDebugUtils.currentLine=257032196;
 //BA.debugLineNum = 257032196;BA.debugLine="SBBefore.Append(value)";
__ref._sbbefore /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_value);
RDebugUtils.currentLine=257032197;
 //BA.debugLineNum = 257032197;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=257032199;
 //BA.debugLineNum = 257032199;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257032200;
 //BA.debugLineNum = 257032200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentline(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcontentline", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcontentline", new Object[] {_value}));}
RDebugUtils.currentLine=251985920;
 //BA.debugLineNum = 251985920;BA.debugLine="public Sub AddContentLine(value As String) As VueH";
RDebugUtils.currentLine=251985921;
 //BA.debugLineNum = 251985921;BA.debugLine="If value <> \"\" Then";
if ((_value).equals("") == false) { 
RDebugUtils.currentLine=251985922;
 //BA.debugLineNum = 251985922;BA.debugLine="value = value.Replace(CRLF,\"\")";
_value = _value.replace(__c.CRLF,"");
RDebugUtils.currentLine=251985923;
 //BA.debugLineNum = 251985923;BA.debugLine="AddContent(value)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_value);
 };
RDebugUtils.currentLine=251985925;
 //BA.debugLineNum = 251985925;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251985926;
 //BA.debugLineNum = 251985926;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentlistreverse(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcontentlistreverse", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcontentlistreverse", new Object[] {_lst}));}
int _ltot = 0;
int _lcnt = 0;
String _strcontent = "";
RDebugUtils.currentLine=253034496;
 //BA.debugLineNum = 253034496;BA.debugLine="Sub AddContentListReverse(lst As List) As VueHTML";
RDebugUtils.currentLine=253034497;
 //BA.debugLineNum = 253034497;BA.debugLine="Dim lTot As Int = lst.Size - 1";
_ltot = (int) (_lst.getSize()-1);
RDebugUtils.currentLine=253034498;
 //BA.debugLineNum = 253034498;BA.debugLine="Dim lCnt As Int";
_lcnt = 0;
RDebugUtils.currentLine=253034499;
 //BA.debugLineNum = 253034499;BA.debugLine="For lCnt = lTot To 0 Step -1";
{
final int step3 = -1;
final int limit3 = (int) (0);
_lcnt = _ltot ;
for (;_lcnt >= limit3 ;_lcnt = _lcnt + step3 ) {
RDebugUtils.currentLine=253034500;
 //BA.debugLineNum = 253034500;BA.debugLine="Dim strContent As String = lst.Get(lCnt)";
_strcontent = BA.ObjectToString(_lst.Get(_lcnt));
RDebugUtils.currentLine=253034501;
 //BA.debugLineNum = 253034501;BA.debugLine="AddContent(strContent)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_strcontent);
 }
};
RDebugUtils.currentLine=253034503;
 //BA.debugLineNum = 253034503;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253034504;
 //BA.debugLineNum = 253034504;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcssclassproperties(b4j.example.vuehtml __ref,String _sproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcssclassproperties", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcssclassproperties", new Object[] {_sproperties}));}
RDebugUtils.currentLine=241565696;
 //BA.debugLineNum = 241565696;BA.debugLine="Sub AddCSSClassProperties(sProperties As String) A";
RDebugUtils.currentLine=241565697;
 //BA.debugLineNum = 241565697;BA.debugLine="AddCssRule(\".\" & ID,sProperties)";
__ref._addcssrule /*b4j.example.vuehtml*/ (null,"."+__ref._id /*String*/ ,_sproperties);
RDebugUtils.currentLine=241565698;
 //BA.debugLineNum = 241565698;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=241565699;
 //BA.debugLineNum = 241565699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcssrule(b4j.example.vuehtml __ref,String _stylename,String _content) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcssrule", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcssrule", new Object[] {_stylename,_content}));}
String _scontent = "";
anywheresoftware.b4a.objects.collections.List _themstyles = null;
String _strit = "";
RDebugUtils.currentLine=241696768;
 //BA.debugLineNum = 241696768;BA.debugLine="Sub AddCssRule(styleName As String, content As Str";
RDebugUtils.currentLine=241696769;
 //BA.debugLineNum = 241696769;BA.debugLine="Dim scontent As String";
_scontent = "";
RDebugUtils.currentLine=241696771;
 //BA.debugLineNum = 241696771;BA.debugLine="Dim themStyles As List = StrParse(\",\",styleName)";
_themstyles = new anywheresoftware.b4a.objects.collections.List();
_themstyles = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,",",_stylename);
RDebugUtils.currentLine=241696772;
 //BA.debugLineNum = 241696772;BA.debugLine="For Each strIT As String In themStyles";
{
final anywheresoftware.b4a.BA.IterableList group3 = _themstyles;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strit = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=241696773;
 //BA.debugLineNum = 241696773;BA.debugLine="strIT = strIT.Replace(CRLF,\"\")";
_strit = _strit.replace(__c.CRLF,"");
RDebugUtils.currentLine=241696774;
 //BA.debugLineNum = 241696774;BA.debugLine="If CSSRule.ContainsKey(strIT) Then";
if (__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_strit))) { 
RDebugUtils.currentLine=241696775;
 //BA.debugLineNum = 241696775;BA.debugLine="scontent = CSSRule.Get(strIT)";
_scontent = BA.ObjectToString(__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strit)));
RDebugUtils.currentLine=241696776;
 //BA.debugLineNum = 241696776;BA.debugLine="scontent = scontent & \";\" & content";
_scontent = _scontent+";"+_content;
RDebugUtils.currentLine=241696777;
 //BA.debugLineNum = 241696777;BA.debugLine="CSSRule.Put(strIT,scontent)";
__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strit),(Object)(_scontent));
 }else {
RDebugUtils.currentLine=241696779;
 //BA.debugLineNum = 241696779;BA.debugLine="CSSRule.Put(strIT,content)";
__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strit),(Object)(_content));
 };
 }
};
RDebugUtils.currentLine=241696782;
 //BA.debugLineNum = 241696782;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=241696783;
 //BA.debugLineNum = 241696783;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcursor(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addcursor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addcursor", null));}
RDebugUtils.currentLine=254803968;
 //BA.debugLineNum = 254803968;BA.debugLine="Sub AddCursor As VueHTML";
RDebugUtils.currentLine=254803969;
 //BA.debugLineNum = 254803969;BA.debugLine="SetStyle(\"cursor\", \"pointer\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"cursor","pointer");
RDebugUtils.currentLine=254803970;
 //BA.debugLineNum = 254803970;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254803971;
 //BA.debugLineNum = 254803971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _adddataattribute(b4j.example.vuehtml __ref,String _attribute,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "adddataattribute", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "adddataattribute", new Object[] {_attribute,_value}));}
boolean _sw = false;
RDebugUtils.currentLine=254083072;
 //BA.debugLineNum = 254083072;BA.debugLine="Sub AddDataAttribute(attribute As String, value As";
RDebugUtils.currentLine=254083073;
 //BA.debugLineNum = 254083073;BA.debugLine="Dim sw As Boolean = attribute.StartsWith(\"data-\")";
_sw = _attribute.startsWith("data-");
RDebugUtils.currentLine=254083074;
 //BA.debugLineNum = 254083074;BA.debugLine="If sw Then";
if (_sw) { 
RDebugUtils.currentLine=254083075;
 //BA.debugLineNum = 254083075;BA.debugLine="AddAttribute(attribute,value)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,_attribute,(Object)(_value));
 }else {
RDebugUtils.currentLine=254083077;
 //BA.debugLineNum = 254083077;BA.debugLine="AddAttribute(\"data-\" & attribute,value)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"data-"+_attribute,(Object)(_value));
 };
RDebugUtils.currentLine=254083079;
 //BA.debugLineNum = 254083079;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254083080;
 //BA.debugLineNum = 254083080;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _adddataattributeoncondition(b4j.example.vuehtml __ref,boolean _bcondition,String _attribute,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "adddataattributeoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "adddataattributeoncondition", new Object[] {_bcondition,_attribute,_value}));}
RDebugUtils.currentLine=254148608;
 //BA.debugLineNum = 254148608;BA.debugLine="Sub AddDataAttributeOnCondition(bCondition As Bool";
RDebugUtils.currentLine=254148609;
 //BA.debugLineNum = 254148609;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
RDebugUtils.currentLine=254148610;
 //BA.debugLineNum = 254148610;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 };
RDebugUtils.currentLine=254148612;
 //BA.debugLineNum = 254148612;BA.debugLine="AddDataAttribute(attribute,value)";
__ref._adddataattribute /*b4j.example.vuehtml*/ (null,_attribute,_value);
RDebugUtils.currentLine=254148613;
 //BA.debugLineNum = 254148613;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254148614;
 //BA.debugLineNum = 254148614;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _adddiv(b4j.example.vuehtml __ref,String _divid,String _divcontent,String _divclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "adddiv", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "adddiv", new Object[] {_divid,_divcontent,_divclass}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=259915776;
 //BA.debugLineNum = 259915776;BA.debugLine="Sub AddDiv(divid As String, divContent As String,";
RDebugUtils.currentLine=259915777;
 //BA.debugLineNum = 259915777;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=259915778;
 //BA.debugLineNum = 259915778;BA.debugLine="div.Initialize(divid,\"div\").SetText(divContent).a";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_divid,"div")._settext /*b4j.example.vuehtml*/ (null,_divcontent)._addclass /*b4j.example.vuehtml*/ (null,_divclass);
RDebugUtils.currentLine=259915779;
 //BA.debugLineNum = 259915779;BA.debugLine="AddContent(div.HTML)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_div._html /*String*/ (null));
RDebugUtils.currentLine=259915780;
 //BA.debugLineNum = 259915780;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=259915781;
 //BA.debugLineNum = 259915781;BA.debugLine="End Sub";
return null;
}
public String  _html(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "html", true))
	 {return ((String) Debug.delegate(ba, "html", null));}
String _sout = "";
RDebugUtils.currentLine=254672896;
 //BA.debugLineNum = 254672896;BA.debugLine="public Sub HTML As String";
RDebugUtils.currentLine=254672897;
 //BA.debugLineNum = 254672897;BA.debugLine="Dim sOut As String = ToString";
_sout = __ref._tostring /*String*/ (null);
RDebugUtils.currentLine=254672898;
 //BA.debugLineNum = 254672898;BA.debugLine="Return sOut";
if (true) return _sout;
RDebugUtils.currentLine=254672899;
 //BA.debugLineNum = 254672899;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addelementline(b4j.example.vuehtml __ref,b4j.example.vuehtml _el) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addelementline", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addelementline", new Object[] {_el}));}
String _scode = "";
RDebugUtils.currentLine=251789312;
 //BA.debugLineNum = 251789312;BA.debugLine="public Sub AddElementLine(el As VueHTML) As VueHTM";
RDebugUtils.currentLine=251789313;
 //BA.debugLineNum = 251789313;BA.debugLine="If el <> Null Then";
if (_el!= null) { 
RDebugUtils.currentLine=251789314;
 //BA.debugLineNum = 251789314;BA.debugLine="Dim scode As String = el.html";
_scode = _el._html /*String*/ (null);
RDebugUtils.currentLine=251789315;
 //BA.debugLineNum = 251789315;BA.debugLine="AddContent(scode)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_scode);
 };
RDebugUtils.currentLine=251789317;
 //BA.debugLineNum = 251789317;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251789318;
 //BA.debugLineNum = 251789318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addelements(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addelements", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addelements", new Object[] {_lst}));}
b4j.example.vuehtml _el = null;
RDebugUtils.currentLine=257228800;
 //BA.debugLineNum = 257228800;BA.debugLine="Sub AddElements(lst As List) As VueHTML";
RDebugUtils.currentLine=257228801;
 //BA.debugLineNum = 257228801;BA.debugLine="For Each el As VueHTML In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_el = (b4j.example.vuehtml)(group1.Get(index1));
RDebugUtils.currentLine=257228802;
 //BA.debugLineNum = 257228802;BA.debugLine="AddElement(el)";
__ref._addelement /*b4j.example.vuehtml*/ (null,_el);
 }
};
RDebugUtils.currentLine=257228804;
 //BA.debugLineNum = 257228804;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257228805;
 //BA.debugLineNum = 257228805;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addem(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addem", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addem", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260702208;
 //BA.debugLineNum = 260702208;BA.debugLine="Sub AddEM(value As String) As VueHTML";
RDebugUtils.currentLine=260702209;
 //BA.debugLineNum = 260702209;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260702210;
 //BA.debugLineNum = 260702210;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260702211;
 //BA.debugLineNum = 260702211;BA.debugLine="sb.Append(\"<em>\").Append(value).Append(\"</em>\")";
_sb.Append("<em>").Append(_value).Append("</em>");
RDebugUtils.currentLine=260702212;
 //BA.debugLineNum = 260702212;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260702213;
 //BA.debugLineNum = 260702213;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260702214;
 //BA.debugLineNum = 260702214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addheading(b4j.example.vuehtml __ref,int _ssize,String _scontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addheading", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addheading", new Object[] {_ssize,_scontent}));}
b4j.example.vuehtml _hdr = null;
String _hkey = "";
RDebugUtils.currentLine=252641280;
 //BA.debugLineNum = 252641280;BA.debugLine="Sub AddHeading(sSize As Int, sContent As String) A";
RDebugUtils.currentLine=252641281;
 //BA.debugLineNum = 252641281;BA.debugLine="Dim hdr As VueHTML";
_hdr = new b4j.example.vuehtml();
RDebugUtils.currentLine=252641282;
 //BA.debugLineNum = 252641282;BA.debugLine="Dim hKey As String = \"h\" & sSize";
_hkey = "h"+BA.NumberToString(_ssize);
RDebugUtils.currentLine=252641283;
 //BA.debugLineNum = 252641283;BA.debugLine="hdr.Initialize(\"\",hKey)";
_hdr._initialize /*b4j.example.vuehtml*/ (null,ba,"",_hkey);
RDebugUtils.currentLine=252641284;
 //BA.debugLineNum = 252641284;BA.debugLine="hdr.AddContent(sContent)";
_hdr._addcontent /*b4j.example.vuehtml*/ (null,_scontent);
RDebugUtils.currentLine=252641285;
 //BA.debugLineNum = 252641285;BA.debugLine="AddContent(hdr.HTML)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_hdr._html /*String*/ (null));
RDebugUtils.currentLine=252641286;
 //BA.debugLineNum = 252641286;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252641287;
 //BA.debugLineNum = 252641287;BA.debugLine="End Sub";
return null;
}
public String  _addhr(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addhr", true))
	 {return ((String) Debug.delegate(ba, "addhr", null));}
RDebugUtils.currentLine=243466240;
 //BA.debugLineNum = 243466240;BA.debugLine="Sub AddHR";
RDebugUtils.currentLine=243466241;
 //BA.debugLineNum = 243466241;BA.debugLine="SetText(\"<hr>\")";
__ref._settext /*b4j.example.vuehtml*/ (null,"<hr>");
RDebugUtils.currentLine=243466242;
 //BA.debugLineNum = 243466242;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _additalic(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "additalic", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "additalic", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260046848;
 //BA.debugLineNum = 260046848;BA.debugLine="Sub AddItalic(value As String) As VueHTML";
RDebugUtils.currentLine=260046849;
 //BA.debugLineNum = 260046849;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260046850;
 //BA.debugLineNum = 260046850;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260046851;
 //BA.debugLineNum = 260046851;BA.debugLine="sb.Append(\"{I}\").Append(value).Append(\"{/I}\")";
_sb.Append("{I}").Append(_value).Append("{/I}");
RDebugUtils.currentLine=260046852;
 //BA.debugLineNum = 260046852;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260046853;
 //BA.debugLineNum = 260046853;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260046854;
 //BA.debugLineNum = 260046854;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addkbd(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addkbd", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addkbd", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260374528;
 //BA.debugLineNum = 260374528;BA.debugLine="Sub AddKBD(value As String) As VueHTML";
RDebugUtils.currentLine=260374529;
 //BA.debugLineNum = 260374529;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260374530;
 //BA.debugLineNum = 260374530;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260374531;
 //BA.debugLineNum = 260374531;BA.debugLine="sb.Append(\"<kbd>\").Append(value).Append(\"</kbd>\")";
_sb.Append("<kbd>").Append(_value).Append("</kbd>");
RDebugUtils.currentLine=260374532;
 //BA.debugLineNum = 260374532;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260374533;
 //BA.debugLineNum = 260374533;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260374534;
 //BA.debugLineNum = 260374534;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addlooseattribute(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addlooseattribute", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addlooseattribute", new Object[] {_value}));}
RDebugUtils.currentLine=253952000;
 //BA.debugLineNum = 253952000;BA.debugLine="Sub AddLooseAttribute(value As String) As VueHTML";
RDebugUtils.currentLine=253952001;
 //BA.debugLineNum = 253952001;BA.debugLine="LooseAttributes.Put(value,value)";
__ref._looseattributes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_value),(Object)(_value));
RDebugUtils.currentLine=253952002;
 //BA.debugLineNum = 253952002;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253952003;
 //BA.debugLineNum = 253952003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addlooseattributeoncondition(b4j.example.vuehtml __ref,boolean _bstatus,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addlooseattributeoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addlooseattributeoncondition", new Object[] {_bstatus,_value}));}
RDebugUtils.currentLine=253886464;
 //BA.debugLineNum = 253886464;BA.debugLine="Sub AddLooseAttributeOnCondition(bStatus As Boolea";
RDebugUtils.currentLine=253886465;
 //BA.debugLineNum = 253886465;BA.debugLine="If bStatus = True Then";
if (_bstatus==__c.True) { 
RDebugUtils.currentLine=253886466;
 //BA.debugLineNum = 253886466;BA.debugLine="AddLooseAttribute(value)";
__ref._addlooseattribute /*b4j.example.vuehtml*/ (null,_value);
 };
RDebugUtils.currentLine=253886468;
 //BA.debugLineNum = 253886468;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253886469;
 //BA.debugLineNum = 253886469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addlooseattributeonfalsecondition(b4j.example.vuehtml __ref,boolean _bstatus,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addlooseattributeonfalsecondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addlooseattributeonfalsecondition", new Object[] {_bstatus,_value}));}
RDebugUtils.currentLine=252837888;
 //BA.debugLineNum = 252837888;BA.debugLine="Sub AddLooseAttributeOnFalseCondition(bStatus As B";
RDebugUtils.currentLine=252837889;
 //BA.debugLineNum = 252837889;BA.debugLine="If bStatus = False Then";
if (_bstatus==__c.False) { 
RDebugUtils.currentLine=252837890;
 //BA.debugLineNum = 252837890;BA.debugLine="AddLooseAttribute(value)";
__ref._addlooseattribute /*b4j.example.vuehtml*/ (null,_value);
 };
RDebugUtils.currentLine=252837892;
 //BA.debugLineNum = 252837892;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252837893;
 //BA.debugLineNum = 252837893;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addmailto(b4j.example.vuehtml __ref,String _emailaddress,String _subject,String _caption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addmailto", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addmailto", new Object[] {_emailaddress,_subject,_caption}));}
b4j.example.vuehtml _a = null;
RDebugUtils.currentLine=259850240;
 //BA.debugLineNum = 259850240;BA.debugLine="Sub AddMailTo(emailaddress As String,subject As St";
RDebugUtils.currentLine=259850241;
 //BA.debugLineNum = 259850241;BA.debugLine="subject = subject.Replace(\" \", \"%20\")";
_subject = _subject.replace(" ","%20");
RDebugUtils.currentLine=259850242;
 //BA.debugLineNum = 259850242;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
RDebugUtils.currentLine=259850243;
 //BA.debugLineNum = 259850243;BA.debugLine="a.Initialize(\"\",\"a\").setAttrHREF($\"mailto:${email";
_a._initialize /*b4j.example.vuehtml*/ (null,ba,"","a")._setattrhref /*b4j.example.vuehtml*/ (null,("mailto:"+__c.SmartStringFormatter("",(Object)(_emailaddress))+"?subject="+__c.SmartStringFormatter("",(Object)(_subject))+""))._addcontent /*b4j.example.vuehtml*/ (null,_caption)._setattrtargetblank /*b4j.example.vuehtml*/ (null,__c.True);
RDebugUtils.currentLine=259850244;
 //BA.debugLineNum = 259850244;BA.debugLine="AddContent(a.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_a._tostring /*String*/ (null));
RDebugUtils.currentLine=259850245;
 //BA.debugLineNum = 259850245;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=259850246;
 //BA.debugLineNum = 259850246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtargetblank(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtargetblank", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtargetblank", new Object[] {_b}));}
RDebugUtils.currentLine=251265024;
 //BA.debugLineNum = 251265024;BA.debugLine="Sub SetAttrTargetBlank(b As Boolean) As VueHTML";
RDebugUtils.currentLine=251265025;
 //BA.debugLineNum = 251265025;BA.debugLine="SetAttrTARGET(\"_blank\")";
__ref._setattrtarget /*b4j.example.vuehtml*/ (null,"_blank");
RDebugUtils.currentLine=251265026;
 //BA.debugLineNum = 251265026;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251265027;
 //BA.debugLineNum = 251265027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addmark(b4j.example.vuehtml __ref,String _scontent,String _sclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addmark", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addmark", new Object[] {_scontent,_sclass}));}
b4j.example.vuehtml _p = null;
RDebugUtils.currentLine=252772352;
 //BA.debugLineNum = 252772352;BA.debugLine="Sub AddMark(sContent As String, sclass As String)";
RDebugUtils.currentLine=252772353;
 //BA.debugLineNum = 252772353;BA.debugLine="Dim p As VueHTML";
_p = new b4j.example.vuehtml();
RDebugUtils.currentLine=252772354;
 //BA.debugLineNum = 252772354;BA.debugLine="p.Initialize(\"\",\"mark\").AddClass(sclass)";
_p._initialize /*b4j.example.vuehtml*/ (null,ba,"","mark")._addclass /*b4j.example.vuehtml*/ (null,_sclass);
RDebugUtils.currentLine=252772355;
 //BA.debugLineNum = 252772355;BA.debugLine="p.AddContent(sContent)";
_p._addcontent /*b4j.example.vuehtml*/ (null,_scontent);
RDebugUtils.currentLine=252772356;
 //BA.debugLineNum = 252772356;BA.debugLine="AddContent(p.HTML)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_p._html /*String*/ (null));
RDebugUtils.currentLine=252772357;
 //BA.debugLineNum = 252772357;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252772358;
 //BA.debugLineNum = 252772358;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addpre(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addpre", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addpre", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260505600;
 //BA.debugLineNum = 260505600;BA.debugLine="Sub AddPre(value As String) As VueHTML";
RDebugUtils.currentLine=260505601;
 //BA.debugLineNum = 260505601;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260505602;
 //BA.debugLineNum = 260505602;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260505603;
 //BA.debugLineNum = 260505603;BA.debugLine="sb.Append(\"<pre>\").Append(value).Append(\"</pre>\")";
_sb.Append("<pre>").Append(_value).Append("</pre>");
RDebugUtils.currentLine=260505604;
 //BA.debugLineNum = 260505604;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260505605;
 //BA.debugLineNum = 260505605;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260505606;
 //BA.debugLineNum = 260505606;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addproperty(b4j.example.vuehtml __ref,String _skey,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addproperty", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addproperty", new Object[] {_skey,_svalue}));}
RDebugUtils.currentLine=251133952;
 //BA.debugLineNum = 251133952;BA.debugLine="Public Sub AddProperty(sKey As String, sValue As S";
RDebugUtils.currentLine=251133953;
 //BA.debugLineNum = 251133953;BA.debugLine="AddAttribute(sKey, sValue)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,_skey,(Object)(_svalue));
RDebugUtils.currentLine=251133954;
 //BA.debugLineNum = 251133954;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251133955;
 //BA.debugLineNum = 251133955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addpropertyoncondition(b4j.example.vuehtml __ref,boolean _bcondition,String _attr,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addpropertyoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addpropertyoncondition", new Object[] {_bcondition,_attr,_value}));}
RDebugUtils.currentLine=251068416;
 //BA.debugLineNum = 251068416;BA.debugLine="Sub AddPropertyOnCondition(bCondition As Boolean,";
RDebugUtils.currentLine=251068417;
 //BA.debugLineNum = 251068417;BA.debugLine="If bCondition Then";
if (_bcondition) { 
RDebugUtils.currentLine=251068418;
 //BA.debugLineNum = 251068418;BA.debugLine="AddAttribute(attr,value)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,_attr,(Object)(_value));
 };
RDebugUtils.currentLine=251068420;
 //BA.debugLineNum = 251068420;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251068421;
 //BA.debugLineNum = 251068421;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstrong(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addstrong", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addstrong", new Object[] {_value}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=260767744;
 //BA.debugLineNum = 260767744;BA.debugLine="Sub AddStrong(value As String) As VueHTML";
RDebugUtils.currentLine=260767745;
 //BA.debugLineNum = 260767745;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=260767746;
 //BA.debugLineNum = 260767746;BA.debugLine="s = CreateStrong(\"\").SetText(value)";
_s = __ref._createstrong /*b4j.example.vuehtml*/ (null,"")._settext /*b4j.example.vuehtml*/ (null,_value);
RDebugUtils.currentLine=260767747;
 //BA.debugLineNum = 260767747;BA.debugLine="AddElement(s)";
__ref._addelement /*b4j.example.vuehtml*/ (null,_s);
RDebugUtils.currentLine=260767748;
 //BA.debugLineNum = 260767748;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260767749;
 //BA.debugLineNum = 260767749;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createstrong(b4j.example.vuehtml __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createstrong", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createstrong", new Object[] {_sid}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=263782400;
 //BA.debugLineNum = 263782400;BA.debugLine="Sub CreateStrong(sid As String) As VueHTML";
RDebugUtils.currentLine=263782401;
 //BA.debugLineNum = 263782401;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=263782402;
 //BA.debugLineNum = 263782402;BA.debugLine="s.Initialize(sid, \"strong\")";
_s._initialize /*b4j.example.vuehtml*/ (null,ba,_sid,"strong");
RDebugUtils.currentLine=263782403;
 //BA.debugLineNum = 263782403;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=263782404;
 //BA.debugLineNum = 263782404;BA.debugLine="End Sub";
return null;
}
public String  _remdelim(b4j.example.vuehtml __ref,String _svalue,String _delim) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "remdelim", true))
	 {return ((String) Debug.delegate(ba, "remdelim", new Object[] {_svalue,_delim}));}
boolean _sw = false;
int _ldelim = 0;
String _nvalue = "";
RDebugUtils.currentLine=259194880;
 //BA.debugLineNum = 259194880;BA.debugLine="private Sub RemDelim(sValue As String, Delim As St";
RDebugUtils.currentLine=259194881;
 //BA.debugLineNum = 259194881;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
_sw = _svalue.endsWith(_delim);
RDebugUtils.currentLine=259194882;
 //BA.debugLineNum = 259194882;BA.debugLine="If sw Then";
if (_sw) { 
RDebugUtils.currentLine=259194883;
 //BA.debugLineNum = 259194883;BA.debugLine="Dim lDelim As Int = Delim.Length";
_ldelim = _delim.length();
RDebugUtils.currentLine=259194884;
 //BA.debugLineNum = 259194884;BA.debugLine="Dim nValue As String = sValue";
_nvalue = _svalue;
RDebugUtils.currentLine=259194885;
 //BA.debugLineNum = 259194885;BA.debugLine="sw = nValue.EndsWith(Delim)";
_sw = _nvalue.endsWith(_delim);
RDebugUtils.currentLine=259194886;
 //BA.debugLineNum = 259194886;BA.debugLine="If sw Then";
if (_sw) { 
RDebugUtils.currentLine=259194887;
 //BA.debugLineNum = 259194887;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
_nvalue = _nvalue.substring((int) (0),(int) (_nvalue.length()-_ldelim));
 };
RDebugUtils.currentLine=259194889;
 //BA.debugLineNum = 259194889;BA.debugLine="Return nValue";
if (true) return _nvalue;
 }else {
RDebugUtils.currentLine=259194891;
 //BA.debugLineNum = 259194891;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
RDebugUtils.currentLine=259194893;
 //BA.debugLineNum = 259194893;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addstyleattributeoncondition(b4j.example.vuehtml __ref,boolean _bcondition,String _attr,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addstyleattributeoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addstyleattributeoncondition", new Object[] {_bcondition,_attr,_value}));}
RDebugUtils.currentLine=254410752;
 //BA.debugLineNum = 254410752;BA.debugLine="Sub AddStyleAttributeOnCondition(bCondition As Boo";
RDebugUtils.currentLine=254410753;
 //BA.debugLineNum = 254410753;BA.debugLine="If bCondition = True Then";
if (_bcondition==__c.True) { 
RDebugUtils.currentLine=254410754;
 //BA.debugLineNum = 254410754;BA.debugLine="SetStyle(attr,value)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,_attr,_value);
 };
RDebugUtils.currentLine=254410756;
 //BA.debugLineNum = 254410756;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254410757;
 //BA.debugLineNum = 254410757;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstyleoncondition(b4j.example.vuehtml __ref,boolean _bcondition,String _attribute,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addstyleoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addstyleoncondition", new Object[] {_bcondition,_attribute,_value}));}
RDebugUtils.currentLine=254214144;
 //BA.debugLineNum = 254214144;BA.debugLine="Sub AddStyleOnCondition(bCondition As Boolean,attr";
RDebugUtils.currentLine=254214145;
 //BA.debugLineNum = 254214145;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
RDebugUtils.currentLine=254214146;
 //BA.debugLineNum = 254214146;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 };
RDebugUtils.currentLine=254214148;
 //BA.debugLineNum = 254214148;BA.debugLine="AddStyle(attribute,value)";
__ref._addstyle /*b4j.example.vuehtml*/ (null,_attribute,(Object)(_value));
RDebugUtils.currentLine=254214149;
 //BA.debugLineNum = 254214149;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254214150;
 //BA.debugLineNum = 254214150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addsub(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addsub", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addsub", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260308992;
 //BA.debugLineNum = 260308992;BA.debugLine="Sub AddSub(value As String) As VueHTML";
RDebugUtils.currentLine=260308993;
 //BA.debugLineNum = 260308993;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260308994;
 //BA.debugLineNum = 260308994;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260308995;
 //BA.debugLineNum = 260308995;BA.debugLine="sb.Append(\"<sub>\").Append(value).Append(\"</sub>\")";
_sb.Append("<sub>").Append(_value).Append("</sub>");
RDebugUtils.currentLine=260308996;
 //BA.debugLineNum = 260308996;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260308997;
 //BA.debugLineNum = 260308997;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260308998;
 //BA.debugLineNum = 260308998;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addsubscript(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addsubscript", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addsubscript", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260177920;
 //BA.debugLineNum = 260177920;BA.debugLine="Sub AddSubScript(value As String) As VueHTML";
RDebugUtils.currentLine=260177921;
 //BA.debugLineNum = 260177921;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260177922;
 //BA.debugLineNum = 260177922;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260177923;
 //BA.debugLineNum = 260177923;BA.debugLine="sb.Append(\"{SUB}\").Append(value).Append(\"{/SUB}\")";
_sb.Append("{SUB}").Append(_value).Append("{/SUB}");
RDebugUtils.currentLine=260177924;
 //BA.debugLineNum = 260177924;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260177925;
 //BA.debugLineNum = 260177925;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260177926;
 //BA.debugLineNum = 260177926;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addsup(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addsup", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addsup", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260571136;
 //BA.debugLineNum = 260571136;BA.debugLine="Sub AddSup(value As String) As VueHTML";
RDebugUtils.currentLine=260571137;
 //BA.debugLineNum = 260571137;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260571138;
 //BA.debugLineNum = 260571138;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260571139;
 //BA.debugLineNum = 260571139;BA.debugLine="sb.Append(\"<sup>\").Append(value).Append(\"</sup>\")";
_sb.Append("<sup>").Append(_value).Append("</sup>");
RDebugUtils.currentLine=260571140;
 //BA.debugLineNum = 260571140;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260571141;
 //BA.debugLineNum = 260571141;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260571142;
 //BA.debugLineNum = 260571142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addsuperscript(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addsuperscript", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addsuperscript", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260243456;
 //BA.debugLineNum = 260243456;BA.debugLine="Sub AddSuperScript(value As String) As VueHTML";
RDebugUtils.currentLine=260243457;
 //BA.debugLineNum = 260243457;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260243458;
 //BA.debugLineNum = 260243458;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260243459;
 //BA.debugLineNum = 260243459;BA.debugLine="sb.Append(\"{SUP}\").Append(value).Append(\"{/SUP}\")";
_sb.Append("{SUP}").Append(_value).Append("{/SUP}");
RDebugUtils.currentLine=260243460;
 //BA.debugLineNum = 260243460;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260243461;
 //BA.debugLineNum = 260243461;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260243462;
 //BA.debugLineNum = 260243462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addtext(b4j.example.vuehtml __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addtext", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addtext", new Object[] {_txt}));}
RDebugUtils.currentLine=255524864;
 //BA.debugLineNum = 255524864;BA.debugLine="Sub AddText(txt As String) As VueHTML";
RDebugUtils.currentLine=255524865;
 //BA.debugLineNum = 255524865;BA.debugLine="AddContent(txt)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_txt);
RDebugUtils.currentLine=255524866;
 //BA.debugLineNum = 255524866;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255524867;
 //BA.debugLineNum = 255524867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addunderline(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "addunderline", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "addunderline", new Object[] {_value}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=260112384;
 //BA.debugLineNum = 260112384;BA.debugLine="Sub AddUnderline(value As String) As VueHTML";
RDebugUtils.currentLine=260112385;
 //BA.debugLineNum = 260112385;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=260112386;
 //BA.debugLineNum = 260112386;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=260112387;
 //BA.debugLineNum = 260112387;BA.debugLine="sb.Append(\"{U}\").Append(value).Append(\"{/U}\")";
_sb.Append("{U}").Append(_value).Append("{/U}");
RDebugUtils.currentLine=260112388;
 //BA.debugLineNum = 260112388;BA.debugLine="AddContent(sb.ToString)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_sb.ToString());
RDebugUtils.currentLine=260112389;
 //BA.debugLineNum = 260112389;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=260112390;
 //BA.debugLineNum = 260112390;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh1(b4j.example.vuehtml __ref,String _paratext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "appendh1", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "appendh1", new Object[] {_paratext}));}
RDebugUtils.currentLine=261029888;
 //BA.debugLineNum = 261029888;BA.debugLine="Sub AppendH1(paraText As String) As VueHTML";
RDebugUtils.currentLine=261029889;
 //BA.debugLineNum = 261029889;BA.debugLine="AddContent($\"<h1>${paraText}</h1>\"$)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,("<h1>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h1>"));
RDebugUtils.currentLine=261029890;
 //BA.debugLineNum = 261029890;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=261029891;
 //BA.debugLineNum = 261029891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh2(b4j.example.vuehtml __ref,String _paratext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "appendh2", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "appendh2", new Object[] {_paratext}));}
RDebugUtils.currentLine=261095424;
 //BA.debugLineNum = 261095424;BA.debugLine="Sub AppendH2(paraText As String) As VueHTML";
RDebugUtils.currentLine=261095425;
 //BA.debugLineNum = 261095425;BA.debugLine="AddContent($\"<h2>${paraText}</h2>\"$)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,("<h2>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h2>"));
RDebugUtils.currentLine=261095426;
 //BA.debugLineNum = 261095426;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=261095427;
 //BA.debugLineNum = 261095427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh3(b4j.example.vuehtml __ref,String _paratext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "appendh3", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "appendh3", new Object[] {_paratext}));}
RDebugUtils.currentLine=261160960;
 //BA.debugLineNum = 261160960;BA.debugLine="Sub AppendH3(paraText As String) As VueHTML";
RDebugUtils.currentLine=261160961;
 //BA.debugLineNum = 261160961;BA.debugLine="AddContent($\"<h3>${paraText}</h3>\"$)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,("<h3>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h3>"));
RDebugUtils.currentLine=261160962;
 //BA.debugLineNum = 261160962;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=261160963;
 //BA.debugLineNum = 261160963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh4(b4j.example.vuehtml __ref,String _paratext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "appendh4", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "appendh4", new Object[] {_paratext}));}
RDebugUtils.currentLine=261226496;
 //BA.debugLineNum = 261226496;BA.debugLine="Sub AppendH4(paraText As String) As VueHTML";
RDebugUtils.currentLine=261226497;
 //BA.debugLineNum = 261226497;BA.debugLine="AddContent($\"<h4>${paraText}</h4>\"$)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,("<h4>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h4>"));
RDebugUtils.currentLine=261226498;
 //BA.debugLineNum = 261226498;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=261226499;
 //BA.debugLineNum = 261226499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh5(b4j.example.vuehtml __ref,String _paratext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "appendh5", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "appendh5", new Object[] {_paratext}));}
RDebugUtils.currentLine=261357568;
 //BA.debugLineNum = 261357568;BA.debugLine="Sub AppendH5(paraText As String) As VueHTML";
RDebugUtils.currentLine=261357569;
 //BA.debugLineNum = 261357569;BA.debugLine="AddContent($\"<h5>${paraText}</h5>\"$)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,("<h5>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h5>"));
RDebugUtils.currentLine=261357570;
 //BA.debugLineNum = 261357570;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=261357571;
 //BA.debugLineNum = 261357571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh6(b4j.example.vuehtml __ref,String _paratext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "appendh6", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "appendh6", new Object[] {_paratext}));}
RDebugUtils.currentLine=261423104;
 //BA.debugLineNum = 261423104;BA.debugLine="Sub AppendH6(paraText As String) As VueHTML";
RDebugUtils.currentLine=261423105;
 //BA.debugLineNum = 261423105;BA.debugLine="AddContent($\"<h6>${paraText}</h6>\"$)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,("<h6>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h6>"));
RDebugUtils.currentLine=261423106;
 //BA.debugLineNum = 261423106;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=261423107;
 //BA.debugLineNum = 261423107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendparagraph(b4j.example.vuehtml __ref,String _scontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "appendparagraph", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "appendparagraph", new Object[] {_scontent}));}
b4j.example.vuehtml _p = null;
RDebugUtils.currentLine=252706816;
 //BA.debugLineNum = 252706816;BA.debugLine="Sub AppendParagraph(sContent As String) As VueHTML";
RDebugUtils.currentLine=252706817;
 //BA.debugLineNum = 252706817;BA.debugLine="Dim p As VueHTML";
_p = new b4j.example.vuehtml();
RDebugUtils.currentLine=252706818;
 //BA.debugLineNum = 252706818;BA.debugLine="p.Initialize(\"\",\"p\")";
_p._initialize /*b4j.example.vuehtml*/ (null,ba,"","p");
RDebugUtils.currentLine=252706819;
 //BA.debugLineNum = 252706819;BA.debugLine="p.AddContent(sContent)";
_p._addcontent /*b4j.example.vuehtml*/ (null,_scontent);
RDebugUtils.currentLine=252706820;
 //BA.debugLineNum = 252706820;BA.debugLine="AddContent(p.HTML)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_p._html /*String*/ (null));
RDebugUtils.currentLine=252706821;
 //BA.debugLineNum = 252706821;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252706822;
 //BA.debugLineNum = 252706822;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendsmall(b4j.example.vuehtml __ref,String _paratext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "appendsmall", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "appendsmall", new Object[] {_paratext}));}
RDebugUtils.currentLine=261292032;
 //BA.debugLineNum = 261292032;BA.debugLine="Sub AppendSmall(paraText As String) As VueHTML";
RDebugUtils.currentLine=261292033;
 //BA.debugLineNum = 261292033;BA.debugLine="AddContent($\"<small>${paraText}</small>\"$)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,("<small>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</small>"));
RDebugUtils.currentLine=261292034;
 //BA.debugLineNum = 261292034;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=261292035;
 //BA.debugLineNum = 261292035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _applystyle(b4j.example.vuehtml __ref,String _sstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "applystyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "applystyle", new Object[] {_sstyle}));}
anywheresoftware.b4a.objects.collections.List _pieces = null;
String _strpiece = "";
String _attr = "";
String _val = "";
RDebugUtils.currentLine=251527168;
 //BA.debugLineNum = 251527168;BA.debugLine="Sub ApplyStyle(sStyle As String) As VueHTML";
RDebugUtils.currentLine=251527170;
 //BA.debugLineNum = 251527170;BA.debugLine="sStyle = sStyle.trim";
_sstyle = _sstyle.trim();
RDebugUtils.currentLine=251527171;
 //BA.debugLineNum = 251527171;BA.debugLine="sStyle = RemDelim(sStyle,\";\")";
_sstyle = __ref._remdelim /*String*/ (null,_sstyle,";");
RDebugUtils.currentLine=251527172;
 //BA.debugLineNum = 251527172;BA.debugLine="Dim pieces As List = StrParse(\";\",sStyle)";
_pieces = new anywheresoftware.b4a.objects.collections.List();
_pieces = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,";",_sstyle);
RDebugUtils.currentLine=251527173;
 //BA.debugLineNum = 251527173;BA.debugLine="For Each strPiece As String In pieces";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pieces;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strpiece = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=251527174;
 //BA.debugLineNum = 251527174;BA.debugLine="Dim attr As String = MvField(strPiece,1,\":\")";
_attr = __ref._mvfield /*String*/ (null,_strpiece,(int) (1),":");
RDebugUtils.currentLine=251527175;
 //BA.debugLineNum = 251527175;BA.debugLine="Dim val As String = MvField(strPiece,2,\":\")";
_val = __ref._mvfield /*String*/ (null,_strpiece,(int) (2),":");
RDebugUtils.currentLine=251527176;
 //BA.debugLineNum = 251527176;BA.debugLine="attr = attr.trim";
_attr = _attr.trim();
RDebugUtils.currentLine=251527177;
 //BA.debugLineNum = 251527177;BA.debugLine="val = val.trim";
_val = _val.trim();
RDebugUtils.currentLine=251527178;
 //BA.debugLineNum = 251527178;BA.debugLine="If attr <> \"\" Then";
if ((_attr).equals("") == false) { 
RDebugUtils.currentLine=251527179;
 //BA.debugLineNum = 251527179;BA.debugLine="SetStyle(attr,val)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,_attr,_val);
 };
 }
};
RDebugUtils.currentLine=251527182;
 //BA.debugLineNum = 251527182;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251527183;
 //BA.debugLineNum = 251527183;BA.debugLine="End Sub";
return null;
}
public String  _mvfield(b4j.example.vuehtml __ref,String _svalue,int _iposition,String _delimiter) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "mvfield", true))
	 {return ((String) Debug.delegate(ba, "mvfield", new Object[] {_svalue,_iposition,_delimiter}));}
int _xpos = 0;
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
RDebugUtils.currentLine=243859456;
 //BA.debugLineNum = 243859456;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
RDebugUtils.currentLine=243859457;
 //BA.debugLineNum = 243859457;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=243859458;
 //BA.debugLineNum = 243859458;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
RDebugUtils.currentLine=243859459;
 //BA.debugLineNum = 243859459;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
RDebugUtils.currentLine=243859460;
 //BA.debugLineNum = 243859460;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
_mvalues = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,_delimiter,_svalue);
RDebugUtils.currentLine=243859461;
 //BA.debugLineNum = 243859461;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
RDebugUtils.currentLine=243859462;
 //BA.debugLineNum = 243859462;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
RDebugUtils.currentLine=243859463;
 //BA.debugLineNum = 243859463;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
RDebugUtils.currentLine=243859465;
 //BA.debugLineNum = 243859465;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 break; }
case 1: {
RDebugUtils.currentLine=243859467;
 //BA.debugLineNum = 243859467;BA.debugLine="Return mValues.get(tValues - 1)";
if (true) return BA.ObjectToString(_mvalues.Get((int) (_tvalues-1)));
 break; }
case 2: {
RDebugUtils.currentLine=243859469;
 //BA.debugLineNum = 243859469;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=243859470;
 //BA.debugLineNum = 243859470;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=243859471;
 //BA.debugLineNum = 243859471;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
RDebugUtils.currentLine=243859472;
 //BA.debugLineNum = 243859472;BA.debugLine="sb.Append(mValues.Get(1))";
_sb.Append(BA.ObjectToString(_mvalues.Get((int) (1))));
RDebugUtils.currentLine=243859473;
 //BA.debugLineNum = 243859473;BA.debugLine="For startcnt = 2 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (2) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
RDebugUtils.currentLine=243859474;
 //BA.debugLineNum = 243859474;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
RDebugUtils.currentLine=243859475;
 //BA.debugLineNum = 243859475;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
RDebugUtils.currentLine=243859477;
 //BA.debugLineNum = 243859477;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
RDebugUtils.currentLine=243859479;
 //BA.debugLineNum = 243859479;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
RDebugUtils.currentLine=243859480;
 //BA.debugLineNum = 243859480;BA.debugLine="If iPosition <= -1 Then";
if (_iposition<=-1) { 
RDebugUtils.currentLine=243859481;
 //BA.debugLineNum = 243859481;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
RDebugUtils.currentLine=243859483;
 //BA.debugLineNum = 243859483;BA.debugLine="If iPosition > tValues Then";
if (_iposition>_tvalues) { 
RDebugUtils.currentLine=243859484;
 //BA.debugLineNum = 243859484;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=243859486;
 //BA.debugLineNum = 243859486;BA.debugLine="Return mValues.get(iPosition)";
if (true) return BA.ObjectToString(_mvalues.Get(_iposition));
 break; }
}
;
RDebugUtils.currentLine=243859488;
 //BA.debugLineNum = 243859488;BA.debugLine="End Sub";
return "";
}
public String  _buildattributes(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "buildattributes", true))
	 {return ((String) Debug.delegate(ba, "buildattributes", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
Object _strvalue = null;
RDebugUtils.currentLine=258998272;
 //BA.debugLineNum = 258998272;BA.debugLine="Sub BuildAttributes As String";
RDebugUtils.currentLine=258998273;
 //BA.debugLineNum = 258998273;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=258998274;
 //BA.debugLineNum = 258998274;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=258998275;
 //BA.debugLineNum = 258998275;BA.debugLine="Dim kTot As Int = properties.Size - 1";
_ktot = (int) (__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
RDebugUtils.currentLine=258998276;
 //BA.debugLineNum = 258998276;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
RDebugUtils.currentLine=258998277;
 //BA.debugLineNum = 258998277;BA.debugLine="Dim strKey As String = properties.GetKeyAt(0)";
_strkey = BA.ObjectToString(__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt((int) (0)));
RDebugUtils.currentLine=258998278;
 //BA.debugLineNum = 258998278;BA.debugLine="Dim strValue As Object = properties.Get(strKey)";
_strvalue = __ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strkey));
RDebugUtils.currentLine=258998279;
 //BA.debugLineNum = 258998279;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
if (__ref._singlequote /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_strkey))==-1) { 
RDebugUtils.currentLine=258998280;
 //BA.debugLineNum = 258998280;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
_sb.Append(__ref._toproperty /*String*/ (null,_strkey,_strvalue));
 }else {
RDebugUtils.currentLine=258998282;
 //BA.debugLineNum = 258998282;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue)";
_sb.Append(__ref._tosinglequoteproperty /*String*/ (null,_strkey,_strvalue));
 };
RDebugUtils.currentLine=258998284;
 //BA.debugLineNum = 258998284;BA.debugLine="For kCnt = 1 To kTot";
{
final int step12 = 1;
final int limit12 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit12 ;_kcnt = _kcnt + step12 ) {
RDebugUtils.currentLine=258998285;
 //BA.debugLineNum = 258998285;BA.debugLine="strKey = properties.GetKeyAt(kCnt)";
_strkey = BA.ObjectToString(__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_kcnt));
RDebugUtils.currentLine=258998286;
 //BA.debugLineNum = 258998286;BA.debugLine="strValue = properties.Get(strKey)";
_strvalue = __ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strkey));
RDebugUtils.currentLine=258998287;
 //BA.debugLineNum = 258998287;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=258998288;
 //BA.debugLineNum = 258998288;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
if (__ref._singlequote /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_strkey))==-1) { 
RDebugUtils.currentLine=258998289;
 //BA.debugLineNum = 258998289;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
_sb.Append(__ref._toproperty /*String*/ (null,_strkey,_strvalue));
 }else {
RDebugUtils.currentLine=258998291;
 //BA.debugLineNum = 258998291;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue";
_sb.Append(__ref._tosinglequoteproperty /*String*/ (null,_strkey,_strvalue));
 };
 }
};
RDebugUtils.currentLine=258998294;
 //BA.debugLineNum = 258998294;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=258998295;
 //BA.debugLineNum = 258998295;BA.debugLine="End Sub";
return "";
}
public String  _toproperty(b4j.example.vuehtml __ref,String _sname,Object _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "toproperty", true))
	 {return ((String) Debug.delegate(ba, "toproperty", new Object[] {_sname,_svalue}));}
String _script = "";
RDebugUtils.currentLine=256704512;
 //BA.debugLineNum = 256704512;BA.debugLine="private Sub ToProperty(sName As String, svalue As";
RDebugUtils.currentLine=256704513;
 //BA.debugLineNum = 256704513;BA.debugLine="sName = CStr(sName)";
_sname = __ref._cstr /*String*/ (null,(Object)(_sname));
RDebugUtils.currentLine=256704514;
 //BA.debugLineNum = 256704514;BA.debugLine="sName = sName.Trim";
_sname = _sname.trim();
RDebugUtils.currentLine=256704515;
 //BA.debugLineNum = 256704515;BA.debugLine="Dim script As String = \"\"";
_script = "";
RDebugUtils.currentLine=256704516;
 //BA.debugLineNum = 256704516;BA.debugLine="If sName.Length > 0 Then";
if (_sname.length()>0) { 
RDebugUtils.currentLine=256704517;
 //BA.debugLineNum = 256704517;BA.debugLine="script = $\"${sName}=\"${svalue}\"\"$";
_script = (""+__c.SmartStringFormatter("",(Object)(_sname))+"=\""+__c.SmartStringFormatter("",_svalue)+"\"");
RDebugUtils.currentLine=256704518;
 //BA.debugLineNum = 256704518;BA.debugLine="script = script.trim";
_script = _script.trim();
RDebugUtils.currentLine=256704519;
 //BA.debugLineNum = 256704519;BA.debugLine="Return script";
if (true) return _script;
 }else {
RDebugUtils.currentLine=256704521;
 //BA.debugLineNum = 256704521;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=256704523;
 //BA.debugLineNum = 256704523;BA.debugLine="End Sub";
return "";
}
public String  _tosinglequoteproperty(b4j.example.vuehtml __ref,String _sname,Object _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "tosinglequoteproperty", true))
	 {return ((String) Debug.delegate(ba, "tosinglequoteproperty", new Object[] {_sname,_svalue}));}
String _script = "";
RDebugUtils.currentLine=259063808;
 //BA.debugLineNum = 259063808;BA.debugLine="private Sub ToSingleQuoteProperty(sName As String,";
RDebugUtils.currentLine=259063809;
 //BA.debugLineNum = 259063809;BA.debugLine="sName = CStr(sName)";
_sname = __ref._cstr /*String*/ (null,(Object)(_sname));
RDebugUtils.currentLine=259063810;
 //BA.debugLineNum = 259063810;BA.debugLine="sName = sName.Trim";
_sname = _sname.trim();
RDebugUtils.currentLine=259063811;
 //BA.debugLineNum = 259063811;BA.debugLine="If sName.Length > 0 Then";
if (_sname.length()>0) { 
RDebugUtils.currentLine=259063812;
 //BA.debugLineNum = 259063812;BA.debugLine="Dim script As String = $\"${sName}='${svalue}'\"$";
_script = (""+__c.SmartStringFormatter("",(Object)(_sname))+"='"+__c.SmartStringFormatter("",_svalue)+"'");
RDebugUtils.currentLine=259063813;
 //BA.debugLineNum = 259063813;BA.debugLine="script = script.trim";
_script = _script.trim();
RDebugUtils.currentLine=259063814;
 //BA.debugLineNum = 259063814;BA.debugLine="Return script";
if (true) return _script;
 }else {
RDebugUtils.currentLine=259063816;
 //BA.debugLineNum = 259063816;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=259063818;
 //BA.debugLineNum = 259063818;BA.debugLine="End Sub";
return "";
}
public String  _buildclass(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "buildclass", true))
	 {return ((String) Debug.delegate(ba, "buildclass", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strclass = "";
String _estyle = "";
RDebugUtils.currentLine=257294336;
 //BA.debugLineNum = 257294336;BA.debugLine="Sub BuildClass() As String";
RDebugUtils.currentLine=257294337;
 //BA.debugLineNum = 257294337;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=257294338;
 //BA.debugLineNum = 257294338;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=257294339;
 //BA.debugLineNum = 257294339;BA.debugLine="Dim kTot As Int = Classes.Size - 1";
_ktot = (int) (__ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
RDebugUtils.currentLine=257294340;
 //BA.debugLineNum = 257294340;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
RDebugUtils.currentLine=257294341;
 //BA.debugLineNum = 257294341;BA.debugLine="Dim strClass As String  = Classes.GetKeyAt(0)";
_strclass = BA.ObjectToString(__ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt((int) (0)));
RDebugUtils.currentLine=257294342;
 //BA.debugLineNum = 257294342;BA.debugLine="sb.Append(strClass)";
_sb.Append(_strclass);
RDebugUtils.currentLine=257294343;
 //BA.debugLineNum = 257294343;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
RDebugUtils.currentLine=257294344;
 //BA.debugLineNum = 257294344;BA.debugLine="Dim strClass As String  = Classes.GetKeyAt(kCnt)";
_strclass = BA.ObjectToString(__ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_kcnt));
RDebugUtils.currentLine=257294346;
 //BA.debugLineNum = 257294346;BA.debugLine="If CSSRule.ContainsKey(strClass.tolowercase) The";
if (__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_strclass.toLowerCase()))) { 
RDebugUtils.currentLine=257294347;
 //BA.debugLineNum = 257294347;BA.debugLine="Dim eStyle As String = CSSRule.Get(strClass)";
_estyle = BA.ObjectToString(__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strclass)));
RDebugUtils.currentLine=257294348;
 //BA.debugLineNum = 257294348;BA.debugLine="ApplyStyle(eStyle)";
__ref._applystyle /*b4j.example.vuehtml*/ (null,_estyle);
RDebugUtils.currentLine=257294349;
 //BA.debugLineNum = 257294349;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=257294352;
 //BA.debugLineNum = 257294352;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=257294353;
 //BA.debugLineNum = 257294353;BA.debugLine="sb.Append(strClass)";
_sb.Append(_strclass);
 }
};
RDebugUtils.currentLine=257294355;
 //BA.debugLineNum = 257294355;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=257294356;
 //BA.debugLineNum = 257294356;BA.debugLine="End Sub";
return "";
}
public String  _buildcssrules(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "buildcssrules", true))
	 {return ((String) Debug.delegate(ba, "buildcssrules", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _scontent = "";
anywheresoftware.b4a.objects.collections.List _spprops = null;
anywheresoftware.b4a.objects.collections.List _nlist = null;
String _strpropvalue = "";
String _strprop = "";
String _strvalue = "";
String _nline = "";
String _values = "";
RDebugUtils.currentLine=241631232;
 //BA.debugLineNum = 241631232;BA.debugLine="Sub BuildCSSRules() As String";
RDebugUtils.currentLine=241631233;
 //BA.debugLineNum = 241631233;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=241631234;
 //BA.debugLineNum = 241631234;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=241631236;
 //BA.debugLineNum = 241631236;BA.debugLine="For Each strKey As String In CSSRule.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=241631238;
 //BA.debugLineNum = 241631238;BA.debugLine="Dim scontent As String = CSSRule.Get(strKey)";
_scontent = BA.ObjectToString(__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strkey)));
RDebugUtils.currentLine=241631239;
 //BA.debugLineNum = 241631239;BA.debugLine="Dim spProps As List = StrParse(\";\",scontent)";
_spprops = new anywheresoftware.b4a.objects.collections.List();
_spprops = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,";",_scontent);
RDebugUtils.currentLine=241631240;
 //BA.debugLineNum = 241631240;BA.debugLine="Dim nList As List";
_nlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=241631241;
 //BA.debugLineNum = 241631241;BA.debugLine="nList.initialize";
_nlist.Initialize();
RDebugUtils.currentLine=241631242;
 //BA.debugLineNum = 241631242;BA.debugLine="For Each strPropValue As String In spProps";
{
final anywheresoftware.b4a.BA.IterableList group8 = _spprops;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_strpropvalue = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=241631243;
 //BA.debugLineNum = 241631243;BA.debugLine="strPropValue = strPropValue.Trim";
_strpropvalue = _strpropvalue.trim();
RDebugUtils.currentLine=241631244;
 //BA.debugLineNum = 241631244;BA.debugLine="If strPropValue <> \"\" Then";
if ((_strpropvalue).equals("") == false) { 
RDebugUtils.currentLine=241631245;
 //BA.debugLineNum = 241631245;BA.debugLine="Dim strProp As String = MvField(strPropValue,1";
_strprop = __ref._mvfield /*String*/ (null,_strpropvalue,(int) (1),":");
RDebugUtils.currentLine=241631246;
 //BA.debugLineNum = 241631246;BA.debugLine="Dim strValue As String = MvField(strPropValue,";
_strvalue = __ref._mvfield /*String*/ (null,_strpropvalue,(int) (2),":");
RDebugUtils.currentLine=241631247;
 //BA.debugLineNum = 241631247;BA.debugLine="strProp = strProp.Trim";
_strprop = _strprop.trim();
RDebugUtils.currentLine=241631248;
 //BA.debugLineNum = 241631248;BA.debugLine="strValue = strValue.trim";
_strvalue = _strvalue.trim();
RDebugUtils.currentLine=241631249;
 //BA.debugLineNum = 241631249;BA.debugLine="If strValue.EndsWith(\"!important\") = False And";
if (_strvalue.endsWith("!important")==__c.False && __ref._isimportant /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=241631250;
 //BA.debugLineNum = 241631250;BA.debugLine="strValue = strValue & \" !important\"";
_strvalue = _strvalue+" !important";
 };
RDebugUtils.currentLine=241631252;
 //BA.debugLineNum = 241631252;BA.debugLine="Dim nLine As String = $\"${strProp}:${strValue}";
_nline = (""+__c.SmartStringFormatter("",(Object)(_strprop))+":"+__c.SmartStringFormatter("",(Object)(_strvalue))+"");
RDebugUtils.currentLine=241631253;
 //BA.debugLineNum = 241631253;BA.debugLine="nList.Add(nLine)";
_nlist.Add((Object)(_nline));
 };
 }
};
RDebugUtils.currentLine=241631256;
 //BA.debugLineNum = 241631256;BA.debugLine="scontent = Join(\";\",nList)";
_scontent = __ref._join /*String*/ (null,";",_nlist);
RDebugUtils.currentLine=241631257;
 //BA.debugLineNum = 241631257;BA.debugLine="CSSRule.Put(strKey,scontent)";
__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strkey),(Object)(_scontent));
 }
};
RDebugUtils.currentLine=241631260;
 //BA.debugLineNum = 241631260;BA.debugLine="For Each strKey As String In CSSRule.Keys";
{
final anywheresoftware.b4a.BA.IterableList group25 = __ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_strkey = BA.ObjectToString(group25.Get(index25));
RDebugUtils.currentLine=241631261;
 //BA.debugLineNum = 241631261;BA.debugLine="Dim values As String = CSSRule.Get(strKey)";
_values = BA.ObjectToString(__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strkey)));
RDebugUtils.currentLine=241631262;
 //BA.debugLineNum = 241631262;BA.debugLine="If values.StartsWith(\"{\") = False Then values =";
if (_values.startsWith("{")==__c.False) { 
_values = "{"+_values;};
RDebugUtils.currentLine=241631263;
 //BA.debugLineNum = 241631263;BA.debugLine="If values.EndsWith(\"}\") = False Then values = va";
if (_values.endsWith("}")==__c.False) { 
_values = _values+"}";};
RDebugUtils.currentLine=241631264;
 //BA.debugLineNum = 241631264;BA.debugLine="sb.Append(strKey).Append(\" \").Append(values).App";
_sb.Append(_strkey).Append(" ").Append(_values).Append(__c.CRLF);
 }
};
RDebugUtils.currentLine=241631266;
 //BA.debugLineNum = 241631266;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=241631267;
 //BA.debugLineNum = 241631267;BA.debugLine="End Sub";
return "";
}
public String  _buildstyle(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "buildstyle", true))
	 {return ((String) Debug.delegate(ba, "buildstyle", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _kcnt = 0;
int _ktot = 0;
String _strkey = "";
String _strvalue = "";
String _strline = "";
RDebugUtils.currentLine=257359872;
 //BA.debugLineNum = 257359872;BA.debugLine="Sub BuildStyle() As String";
RDebugUtils.currentLine=257359873;
 //BA.debugLineNum = 257359873;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=257359874;
 //BA.debugLineNum = 257359874;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=257359875;
 //BA.debugLineNum = 257359875;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
RDebugUtils.currentLine=257359876;
 //BA.debugLineNum = 257359876;BA.debugLine="Dim kTot As Int = Styles.Size - 1";
_ktot = (int) (__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
RDebugUtils.currentLine=257359878;
 //BA.debugLineNum = 257359878;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(0)";
_strkey = BA.ObjectToString(__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt((int) (0)));
RDebugUtils.currentLine=257359879;
 //BA.debugLineNum = 257359879;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
_strvalue = BA.ObjectToString(__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strkey)));
RDebugUtils.currentLine=257359880;
 //BA.debugLineNum = 257359880;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
_strline = __ref._tostyle /*String*/ (null,_strkey,_strvalue);
RDebugUtils.currentLine=257359881;
 //BA.debugLineNum = 257359881;BA.debugLine="sb.Append(strLine)";
_sb.Append(_strline);
RDebugUtils.currentLine=257359882;
 //BA.debugLineNum = 257359882;BA.debugLine="For kCnt = 1 To kTot";
{
final int step9 = 1;
final int limit9 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit9 ;_kcnt = _kcnt + step9 ) {
RDebugUtils.currentLine=257359883;
 //BA.debugLineNum = 257359883;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(kCnt)";
_strkey = BA.ObjectToString(__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_kcnt));
RDebugUtils.currentLine=257359884;
 //BA.debugLineNum = 257359884;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
_strvalue = BA.ObjectToString(__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strkey)));
RDebugUtils.currentLine=257359885;
 //BA.debugLineNum = 257359885;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
_strline = __ref._tostyle /*String*/ (null,_strkey,_strvalue);
RDebugUtils.currentLine=257359886;
 //BA.debugLineNum = 257359886;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=257359887;
 //BA.debugLineNum = 257359887;BA.debugLine="sb.Append(strLine)";
_sb.Append(_strline);
 }
};
RDebugUtils.currentLine=257359889;
 //BA.debugLineNum = 257359889;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=257359890;
 //BA.debugLineNum = 257359890;BA.debugLine="End Sub";
return "";
}
public String  _tostyle(b4j.example.vuehtml __ref,String _sname,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "tostyle", true))
	 {return ((String) Debug.delegate(ba, "tostyle", new Object[] {_sname,_value}));}
boolean _ew = false;
String _sout = "";
RDebugUtils.currentLine=257425408;
 //BA.debugLineNum = 257425408;BA.debugLine="private Sub ToStyle(sName As String, value As Stri";
RDebugUtils.currentLine=257425409;
 //BA.debugLineNum = 257425409;BA.debugLine="If sName.Length > 0 And value.Length > 0 Then";
if (_sname.length()>0 && _value.length()>0) { 
RDebugUtils.currentLine=257425410;
 //BA.debugLineNum = 257425410;BA.debugLine="Dim ew As Boolean = sName.EndsWith(\":\")";
_ew = _sname.endsWith(":");
RDebugUtils.currentLine=257425411;
 //BA.debugLineNum = 257425411;BA.debugLine="If ew Then";
if (_ew) { 
RDebugUtils.currentLine=257425412;
 //BA.debugLineNum = 257425412;BA.debugLine="sName = MvField(sName,1,\":\")";
_sname = __ref._mvfield /*String*/ (null,_sname,(int) (1),":");
 };
RDebugUtils.currentLine=257425414;
 //BA.debugLineNum = 257425414;BA.debugLine="Dim sout As String = $\"${sName}:${value};\"$";
_sout = (""+__c.SmartStringFormatter("",(Object)(_sname))+":"+__c.SmartStringFormatter("",(Object)(_value))+";");
RDebugUtils.currentLine=257425415;
 //BA.debugLineNum = 257425415;BA.debugLine="If sout = \":;\" Then sout = \"\"";
if ((_sout).equals(":;")) { 
_sout = "";};
RDebugUtils.currentLine=257425416;
 //BA.debugLineNum = 257425416;BA.debugLine="Return sout";
if (true) return _sout;
 }else {
RDebugUtils.currentLine=257425418;
 //BA.debugLineNum = 257425418;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=257425420;
 //BA.debugLineNum = 257425420;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _centeritems(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "centeritems", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "centeritems", new Object[] {_b}));}
RDebugUtils.currentLine=242221056;
 //BA.debugLineNum = 242221056;BA.debugLine="Sub CenterItems(b As Boolean) As VueHTML";
RDebugUtils.currentLine=242221057;
 //BA.debugLineNum = 242221057;BA.debugLine="SetStyle(\"justify-content\", \"center\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"justify-content","center");
RDebugUtils.currentLine=242221058;
 //BA.debugLineNum = 242221058;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242221059;
 //BA.debugLineNum = 242221059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _centertext(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "centertext", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "centertext", new Object[] {_b}));}
RDebugUtils.currentLine=242286592;
 //BA.debugLineNum = 242286592;BA.debugLine="Sub CenterText(b As Boolean) As VueHTML";
RDebugUtils.currentLine=242286593;
 //BA.debugLineNum = 242286593;BA.debugLine="SetStyle(\"text-align\", \"center\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"text-align","center");
RDebugUtils.currentLine=242286594;
 //BA.debugLineNum = 242286594;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242286595;
 //BA.debugLineNum = 242286595;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
RDebugUtils.currentLine=241434624;
 //BA.debugLineNum = 241434624;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=241434625;
 //BA.debugLineNum = 241434625;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=241434626;
 //BA.debugLineNum = 241434626;BA.debugLine="Public Tag As String";
_tag = "";
RDebugUtils.currentLine=241434627;
 //BA.debugLineNum = 241434627;BA.debugLine="Private properties As Map";
_properties = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=241434628;
 //BA.debugLineNum = 241434628;BA.debugLine="Private Contents As List";
_contents = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=241434629;
 //BA.debugLineNum = 241434629;BA.debugLine="Private Classes As Map";
_classes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=241434630;
 //BA.debugLineNum = 241434630;BA.debugLine="Public Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=241434631;
 //BA.debugLineNum = 241434631;BA.debugLine="Private LooseAttributes As Map";
_looseattributes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=241434632;
 //BA.debugLineNum = 241434632;BA.debugLine="Private DontBreak As List";
_dontbreak = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=241434633;
 //BA.debugLineNum = 241434633;BA.debugLine="Private Prefix As String";
_prefix = "";
RDebugUtils.currentLine=241434634;
 //BA.debugLineNum = 241434634;BA.debugLine="Private DoAProperClose As Boolean";
_doaproperclose = false;
RDebugUtils.currentLine=241434635;
 //BA.debugLineNum = 241434635;BA.debugLine="Private CSSRule As Map";
_cssrule = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=241434636;
 //BA.debugLineNum = 241434636;BA.debugLine="Private SingleQuote As List";
_singlequote = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=241434637;
 //BA.debugLineNum = 241434637;BA.debugLine="Private SBAfter As StringBuilder";
_sbafter = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=241434638;
 //BA.debugLineNum = 241434638;BA.debugLine="Private SBBefore As StringBuilder";
_sbbefore = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=241434639;
 //BA.debugLineNum = 241434639;BA.debugLine="Public IsImportant As Boolean";
_isimportant = false;
RDebugUtils.currentLine=241434640;
 //BA.debugLineNum = 241434640;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=241434641;
 //BA.debugLineNum = 241434641;BA.debugLine="Private ParentID As String";
_parentid = "";
RDebugUtils.currentLine=241434642;
 //BA.debugLineNum = 241434642;BA.debugLine="Private ds As String";
_ds = "";
RDebugUtils.currentLine=241434643;
 //BA.debugLineNum = 241434643;BA.debugLine="Private hasContent As Boolean";
_hascontent = false;
RDebugUtils.currentLine=241434644;
 //BA.debugLineNum = 241434644;BA.debugLine="End Sub";
return "";
}
public boolean  _classexists(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "classexists", true))
	 {return ((Boolean) Debug.delegate(ba, "classexists", new Object[] {_value}));}
RDebugUtils.currentLine=254607360;
 //BA.debugLineNum = 254607360;BA.debugLine="Sub ClassExists(value As String) As Boolean";
RDebugUtils.currentLine=254607361;
 //BA.debugLineNum = 254607361;BA.debugLine="value = value.trim";
_value = _value.trim();
RDebugUtils.currentLine=254607362;
 //BA.debugLineNum = 254607362;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
RDebugUtils.currentLine=254607363;
 //BA.debugLineNum = 254607363;BA.debugLine="Return Classes.ContainsKey(value)";
if (true) return __ref._classes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_value));
 };
RDebugUtils.currentLine=254607365;
 //BA.debugLineNum = 254607365;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=254607366;
 //BA.debugLineNum = 254607366;BA.debugLine="End Sub";
return false;
}
public String  _close(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "close", true))
	 {return ((String) Debug.delegate(ba, "close", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=259653632;
 //BA.debugLineNum = 259653632;BA.debugLine="private Sub Close() As String";
RDebugUtils.currentLine=259653633;
 //BA.debugLineNum = 259653633;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=259653634;
 //BA.debugLineNum = 259653634;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=259653635;
 //BA.debugLineNum = 259653635;BA.debugLine="Select Case Tag.ToLowerCase";
switch (BA.switchObjectToInt(__ref._tag /*String*/ .toLowerCase(),"img","link","meta","input","source","hr","br")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: {
RDebugUtils.currentLine=259653637;
 //BA.debugLineNum = 259653637;BA.debugLine="DoAProperClose = False";
__ref._doaproperclose /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=259653639;
 //BA.debugLineNum = 259653639;BA.debugLine="If DoAProperClose = True Then";
if (__ref._doaproperclose /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=259653640;
 //BA.debugLineNum = 259653640;BA.debugLine="sb.Append(\"</\")";
_sb.Append("</");
RDebugUtils.currentLine=259653641;
 //BA.debugLineNum = 259653641;BA.debugLine="sb.Append(Tag)";
_sb.Append(__ref._tag /*String*/ );
RDebugUtils.currentLine=259653642;
 //BA.debugLineNum = 259653642;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 };
RDebugUtils.currentLine=259653644;
 //BA.debugLineNum = 259653644;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=259653645;
 //BA.debugLineNum = 259653645;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _createanchor(b4j.example.vuehtml __ref,String _aid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createanchor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createanchor", new Object[] {_aid}));}
b4j.example.vuehtml _a = null;
RDebugUtils.currentLine=264044544;
 //BA.debugLineNum = 264044544;BA.debugLine="Sub CreateAnchor(aid As String) As VueHTML";
RDebugUtils.currentLine=264044545;
 //BA.debugLineNum = 264044545;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
RDebugUtils.currentLine=264044546;
 //BA.debugLineNum = 264044546;BA.debugLine="a.Initialize(aid,\"a\")";
_a._initialize /*b4j.example.vuehtml*/ (null,ba,_aid,"a");
RDebugUtils.currentLine=264044547;
 //BA.debugLineNum = 264044547;BA.debugLine="Return a";
if (true) return _a;
RDebugUtils.currentLine=264044548;
 //BA.debugLineNum = 264044548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createarticle(b4j.example.vuehtml __ref,String _aid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createarticle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createarticle", new Object[] {_aid}));}
b4j.example.vuehtml _a = null;
RDebugUtils.currentLine=264110080;
 //BA.debugLineNum = 264110080;BA.debugLine="Sub CreateArticle(aid As String) As VueHTML";
RDebugUtils.currentLine=264110081;
 //BA.debugLineNum = 264110081;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
RDebugUtils.currentLine=264110082;
 //BA.debugLineNum = 264110082;BA.debugLine="a.Initialize(aid,\"article\")";
_a._initialize /*b4j.example.vuehtml*/ (null,ba,_aid,"article");
RDebugUtils.currentLine=264110083;
 //BA.debugLineNum = 264110083;BA.debugLine="Return a";
if (true) return _a;
RDebugUtils.currentLine=264110084;
 //BA.debugLineNum = 264110084;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createaside(b4j.example.vuehtml __ref,String _aid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createaside", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createaside", new Object[] {_aid}));}
b4j.example.vuehtml _a = null;
RDebugUtils.currentLine=264175616;
 //BA.debugLineNum = 264175616;BA.debugLine="Sub CreateAside(aid As String) As VueHTML";
RDebugUtils.currentLine=264175617;
 //BA.debugLineNum = 264175617;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
RDebugUtils.currentLine=264175618;
 //BA.debugLineNum = 264175618;BA.debugLine="a.Initialize(aid,\"aside\")";
_a._initialize /*b4j.example.vuehtml*/ (null,ba,_aid,"aside");
RDebugUtils.currentLine=264175619;
 //BA.debugLineNum = 264175619;BA.debugLine="Return a";
if (true) return _a;
RDebugUtils.currentLine=264175620;
 //BA.debugLineNum = 264175620;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createaudio(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createaudio", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createaudio", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=264634368;
 //BA.debugLineNum = 264634368;BA.debugLine="Sub CreateAUDIO(cid As String) As VueHTML";
RDebugUtils.currentLine=264634369;
 //BA.debugLineNum = 264634369;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=264634370;
 //BA.debugLineNum = 264634370;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=264634371;
 //BA.debugLineNum = 264634371;BA.debugLine="div.Initialize(cid,\"audio\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"audio");
RDebugUtils.currentLine=264634372;
 //BA.debugLineNum = 264634372;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=264634373;
 //BA.debugLineNum = 264634373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createblockquote(b4j.example.vuehtml __ref,String _bqid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createblockquote", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createblockquote", new Object[] {_bqid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262144000;
 //BA.debugLineNum = 262144000;BA.debugLine="Sub CreateBlockQuote(bqid As String) As VueHTML";
RDebugUtils.currentLine=262144001;
 //BA.debugLineNum = 262144001;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262144002;
 //BA.debugLineNum = 262144002;BA.debugLine="ul.Initialize(bqid,\"blockquote\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_bqid,"blockquote");
RDebugUtils.currentLine=262144003;
 //BA.debugLineNum = 262144003;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262144004;
 //BA.debugLineNum = 262144004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createbutton(b4j.example.vuehtml __ref,String _btnid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createbutton", new Object[] {_btnid}));}
b4j.example.vuehtml _b = null;
RDebugUtils.currentLine=265879552;
 //BA.debugLineNum = 265879552;BA.debugLine="Sub CreateButton(btnID As String) As VueHTML";
RDebugUtils.currentLine=265879553;
 //BA.debugLineNum = 265879553;BA.debugLine="Dim b As VueHTML";
_b = new b4j.example.vuehtml();
RDebugUtils.currentLine=265879554;
 //BA.debugLineNum = 265879554;BA.debugLine="b.Initialize(btnID, \"button\")";
_b._initialize /*b4j.example.vuehtml*/ (null,ba,_btnid,"button");
RDebugUtils.currentLine=265879555;
 //BA.debugLineNum = 265879555;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=265879556;
 //BA.debugLineNum = 265879556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createcanvas(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createcanvas", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createcanvas", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=264568832;
 //BA.debugLineNum = 264568832;BA.debugLine="Sub CreateCANVAS(cid As String) As VueHTML";
RDebugUtils.currentLine=264568833;
 //BA.debugLineNum = 264568833;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=264568834;
 //BA.debugLineNum = 264568834;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=264568835;
 //BA.debugLineNum = 264568835;BA.debugLine="div.Initialize(cid,\"canvas\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"canvas");
RDebugUtils.currentLine=264568836;
 //BA.debugLineNum = 264568836;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=264568837;
 //BA.debugLineNum = 264568837;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createcaption(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createcaption", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createcaption", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=265093120;
 //BA.debugLineNum = 265093120;BA.debugLine="Sub CreateCAPTION(cid As String) As VueHTML";
RDebugUtils.currentLine=265093121;
 //BA.debugLineNum = 265093121;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=265093122;
 //BA.debugLineNum = 265093122;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=265093123;
 //BA.debugLineNum = 265093123;BA.debugLine="div.Initialize(cid,\"caption\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"caption");
RDebugUtils.currentLine=265093124;
 //BA.debugLineNum = 265093124;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=265093125;
 //BA.debugLineNum = 265093125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createcode(b4j.example.vuehtml __ref,String _oid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createcode", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createcode", new Object[] {_oid}));}
b4j.example.vuehtml _o = null;
RDebugUtils.currentLine=265682944;
 //BA.debugLineNum = 265682944;BA.debugLine="Sub CreateCode(oid As String) As VueHTML";
RDebugUtils.currentLine=265682945;
 //BA.debugLineNum = 265682945;BA.debugLine="Dim o As VueHTML";
_o = new b4j.example.vuehtml();
RDebugUtils.currentLine=265682946;
 //BA.debugLineNum = 265682946;BA.debugLine="o.Initialize(oid, \"code\")";
_o._initialize /*b4j.example.vuehtml*/ (null,ba,_oid,"code");
RDebugUtils.currentLine=265682947;
 //BA.debugLineNum = 265682947;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=265682948;
 //BA.debugLineNum = 265682948;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createcontainer(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createcontainer", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createcontainer", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=264503296;
 //BA.debugLineNum = 264503296;BA.debugLine="Sub CreateContainer(cid As String) As VueHTML";
RDebugUtils.currentLine=264503297;
 //BA.debugLineNum = 264503297;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=264503298;
 //BA.debugLineNum = 264503298;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=264503299;
 //BA.debugLineNum = 264503299;BA.debugLine="div.Initialize(cid,\"div\").AddClass(\"container\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"div")._addclass /*b4j.example.vuehtml*/ (null,"container");
RDebugUtils.currentLine=264503300;
 //BA.debugLineNum = 264503300;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=264503301;
 //BA.debugLineNum = 264503301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createdatalist(b4j.example.vuehtml __ref,String _nid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createdatalist", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createdatalist", new Object[] {_nid}));}
b4j.example.vuehtml _n = null;
RDebugUtils.currentLine=261881856;
 //BA.debugLineNum = 261881856;BA.debugLine="Sub CreateDataList(nid As String) As VueHTML";
RDebugUtils.currentLine=261881857;
 //BA.debugLineNum = 261881857;BA.debugLine="Dim n As VueHTML";
_n = new b4j.example.vuehtml();
RDebugUtils.currentLine=261881858;
 //BA.debugLineNum = 261881858;BA.debugLine="n.Initialize(nid, \"datalist\")";
_n._initialize /*b4j.example.vuehtml*/ (null,ba,_nid,"datalist");
RDebugUtils.currentLine=261881859;
 //BA.debugLineNum = 261881859;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=261881860;
 //BA.debugLineNum = 261881860;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createdd(b4j.example.vuehtml __ref,String _preid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createdd", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createdd", new Object[] {_preid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262602752;
 //BA.debugLineNum = 262602752;BA.debugLine="Sub CreateDD(preid As String) As VueHTML";
RDebugUtils.currentLine=262602753;
 //BA.debugLineNum = 262602753;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262602754;
 //BA.debugLineNum = 262602754;BA.debugLine="ul.Initialize(preid, \"dd\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_preid,"dd");
RDebugUtils.currentLine=262602755;
 //BA.debugLineNum = 262602755;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262602756;
 //BA.debugLineNum = 262602756;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _creatediv(b4j.example.vuehtml __ref,String _did) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "creatediv", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "creatediv", new Object[] {_did}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=262078464;
 //BA.debugLineNum = 262078464;BA.debugLine="Sub CreateDIV(did As String) As VueHTML";
RDebugUtils.currentLine=262078465;
 //BA.debugLineNum = 262078465;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=262078466;
 //BA.debugLineNum = 262078466;BA.debugLine="div.Initialize(did,\"div\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_did,"div");
RDebugUtils.currentLine=262078467;
 //BA.debugLineNum = 262078467;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=262078468;
 //BA.debugLineNum = 262078468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createdl(b4j.example.vuehtml __ref,String _preid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createdl", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createdl", new Object[] {_preid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262471680;
 //BA.debugLineNum = 262471680;BA.debugLine="Sub CreateDL(preid As String) As VueHTML";
RDebugUtils.currentLine=262471681;
 //BA.debugLineNum = 262471681;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262471682;
 //BA.debugLineNum = 262471682;BA.debugLine="ul.Initialize(preid, \"dl\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_preid,"dl");
RDebugUtils.currentLine=262471683;
 //BA.debugLineNum = 262471683;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262471684;
 //BA.debugLineNum = 262471684;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createdt(b4j.example.vuehtml __ref,String _preid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createdt", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createdt", new Object[] {_preid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262537216;
 //BA.debugLineNum = 262537216;BA.debugLine="Sub CreateDT(preid As String) As VueHTML";
RDebugUtils.currentLine=262537217;
 //BA.debugLineNum = 262537217;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262537218;
 //BA.debugLineNum = 262537218;BA.debugLine="ul.Initialize(preid, \"dt\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_preid,"dt");
RDebugUtils.currentLine=262537219;
 //BA.debugLineNum = 262537219;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262537220;
 //BA.debugLineNum = 262537220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createem(b4j.example.vuehtml __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createem", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createem", new Object[] {_sid}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=263847936;
 //BA.debugLineNum = 263847936;BA.debugLine="Sub CreateEM(sid As String) As VueHTML";
RDebugUtils.currentLine=263847937;
 //BA.debugLineNum = 263847937;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=263847938;
 //BA.debugLineNum = 263847938;BA.debugLine="s.Initialize(sid, \"em\")";
_s._initialize /*b4j.example.vuehtml*/ (null,ba,_sid,"em");
RDebugUtils.currentLine=263847939;
 //BA.debugLineNum = 263847939;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=263847940;
 //BA.debugLineNum = 263847940;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createfieldset(b4j.example.vuehtml __ref,String _fid,String _scaption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createfieldset", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createfieldset", new Object[] {_fid,_scaption}));}
b4j.example.vuehtml _fs = null;
b4j.example.vuehtml _lgnd = null;
RDebugUtils.currentLine=264437760;
 //BA.debugLineNum = 264437760;BA.debugLine="Sub CreateFieldSet(fID As String, sCaption As Stri";
RDebugUtils.currentLine=264437761;
 //BA.debugLineNum = 264437761;BA.debugLine="Dim fs As VueHTML";
_fs = new b4j.example.vuehtml();
RDebugUtils.currentLine=264437762;
 //BA.debugLineNum = 264437762;BA.debugLine="fs.Initialize(fID,\"fieldset\")";
_fs._initialize /*b4j.example.vuehtml*/ (null,ba,_fid,"fieldset");
RDebugUtils.currentLine=264437763;
 //BA.debugLineNum = 264437763;BA.debugLine="Dim lgnd As VueHTML = CreateLegend(\"\", sCaption)";
_lgnd = __ref._createlegend /*b4j.example.vuehtml*/ (null,"",_scaption);
RDebugUtils.currentLine=264437764;
 //BA.debugLineNum = 264437764;BA.debugLine="fs.AddElement(lgnd)";
_fs._addelement /*b4j.example.vuehtml*/ (null,_lgnd);
RDebugUtils.currentLine=264437765;
 //BA.debugLineNum = 264437765;BA.debugLine="Return fs";
if (true) return _fs;
RDebugUtils.currentLine=264437766;
 //BA.debugLineNum = 264437766;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createlegend(b4j.example.vuehtml __ref,String _fid,String _scaption) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createlegend", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createlegend", new Object[] {_fid,_scaption}));}
b4j.example.vuehtml _fs = null;
RDebugUtils.currentLine=264372224;
 //BA.debugLineNum = 264372224;BA.debugLine="Sub CreateLegend(fID As String, sCaption As String";
RDebugUtils.currentLine=264372225;
 //BA.debugLineNum = 264372225;BA.debugLine="Dim fs As VueHTML";
_fs = new b4j.example.vuehtml();
RDebugUtils.currentLine=264372226;
 //BA.debugLineNum = 264372226;BA.debugLine="fs.Initialize(fID, \"legend\").AddContent(sCaption)";
_fs._initialize /*b4j.example.vuehtml*/ (null,ba,_fid,"legend")._addcontent /*b4j.example.vuehtml*/ (null,_scaption);
RDebugUtils.currentLine=264372227;
 //BA.debugLineNum = 264372227;BA.debugLine="Return fs";
if (true) return _fs;
RDebugUtils.currentLine=264372228;
 //BA.debugLineNum = 264372228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createfigcaption(b4j.example.vuehtml __ref,String _fid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createfigcaption", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createfigcaption", new Object[] {_fid}));}
b4j.example.vuehtml _f = null;
RDebugUtils.currentLine=263061504;
 //BA.debugLineNum = 263061504;BA.debugLine="Sub CreateFigCaption(fid As String) As VueHTML";
RDebugUtils.currentLine=263061505;
 //BA.debugLineNum = 263061505;BA.debugLine="Dim f As VueHTML";
_f = new b4j.example.vuehtml();
RDebugUtils.currentLine=263061506;
 //BA.debugLineNum = 263061506;BA.debugLine="f.Initialize(fid, \"figcaption\")";
_f._initialize /*b4j.example.vuehtml*/ (null,ba,_fid,"figcaption");
RDebugUtils.currentLine=263061507;
 //BA.debugLineNum = 263061507;BA.debugLine="Return f";
if (true) return _f;
RDebugUtils.currentLine=263061508;
 //BA.debugLineNum = 263061508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createfigure(b4j.example.vuehtml __ref,String _fid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createfigure", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createfigure", new Object[] {_fid}));}
b4j.example.vuehtml _f = null;
RDebugUtils.currentLine=263127040;
 //BA.debugLineNum = 263127040;BA.debugLine="Sub CreateFigure(fid As String) As VueHTML";
RDebugUtils.currentLine=263127041;
 //BA.debugLineNum = 263127041;BA.debugLine="Dim f As VueHTML";
_f = new b4j.example.vuehtml();
RDebugUtils.currentLine=263127042;
 //BA.debugLineNum = 263127042;BA.debugLine="f.Initialize(fid, \"figure\")";
_f._initialize /*b4j.example.vuehtml*/ (null,ba,_fid,"figure");
RDebugUtils.currentLine=263127043;
 //BA.debugLineNum = 263127043;BA.debugLine="Return f";
if (true) return _f;
RDebugUtils.currentLine=263127044;
 //BA.debugLineNum = 263127044;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createfooter(b4j.example.vuehtml __ref,String _fid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createfooter", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createfooter", new Object[] {_fid}));}
b4j.example.vuehtml _f = null;
RDebugUtils.currentLine=261750784;
 //BA.debugLineNum = 261750784;BA.debugLine="Sub CreateFooter(fid As String) As VueHTML";
RDebugUtils.currentLine=261750785;
 //BA.debugLineNum = 261750785;BA.debugLine="Dim f As VueHTML";
_f = new b4j.example.vuehtml();
RDebugUtils.currentLine=261750786;
 //BA.debugLineNum = 261750786;BA.debugLine="f.Initialize(fid, \"footer\")";
_f._initialize /*b4j.example.vuehtml*/ (null,ba,_fid,"footer");
RDebugUtils.currentLine=261750787;
 //BA.debugLineNum = 261750787;BA.debugLine="Return f";
if (true) return _f;
RDebugUtils.currentLine=261750788;
 //BA.debugLineNum = 261750788;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createform(b4j.example.vuehtml __ref,String _fid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createform", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createform", new Object[] {_fid}));}
b4j.example.vuehtml _frm = null;
RDebugUtils.currentLine=264306688;
 //BA.debugLineNum = 264306688;BA.debugLine="Sub CreateForm(fID As String) As VueHTML";
RDebugUtils.currentLine=264306689;
 //BA.debugLineNum = 264306689;BA.debugLine="Dim frm As VueHTML";
_frm = new b4j.example.vuehtml();
RDebugUtils.currentLine=264306690;
 //BA.debugLineNum = 264306690;BA.debugLine="frm.Initialize(fID, \"form\")";
_frm._initialize /*b4j.example.vuehtml*/ (null,ba,_fid,"form");
RDebugUtils.currentLine=264306691;
 //BA.debugLineNum = 264306691;BA.debugLine="Return frm";
if (true) return _frm;
RDebugUtils.currentLine=264306692;
 //BA.debugLineNum = 264306692;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh(b4j.example.vuehtml __ref,String _hid,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createh", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createh", new Object[] {_hid,_size}));}
String _hkey = "";
b4j.example.vuehtml _h = null;
RDebugUtils.currentLine=263192576;
 //BA.debugLineNum = 263192576;BA.debugLine="Sub CreateH(hid As String, size As Int) As VueHTML";
RDebugUtils.currentLine=263192577;
 //BA.debugLineNum = 263192577;BA.debugLine="Dim hkey As String = \"h\" & CStr(size)";
_hkey = "h"+__ref._cstr /*String*/ (null,(Object)(_size));
RDebugUtils.currentLine=263192578;
 //BA.debugLineNum = 263192578;BA.debugLine="Dim h As VueHTML";
_h = new b4j.example.vuehtml();
RDebugUtils.currentLine=263192579;
 //BA.debugLineNum = 263192579;BA.debugLine="h.Initialize(hid, hkey)";
_h._initialize /*b4j.example.vuehtml*/ (null,ba,_hid,_hkey);
RDebugUtils.currentLine=263192580;
 //BA.debugLineNum = 263192580;BA.debugLine="Return h";
if (true) return _h;
RDebugUtils.currentLine=263192581;
 //BA.debugLineNum = 263192581;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh1(b4j.example.vuehtml __ref,String _hid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createh1", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createh1", new Object[] {_hid}));}
b4j.example.vuehtml _hdr = null;
RDebugUtils.currentLine=263258112;
 //BA.debugLineNum = 263258112;BA.debugLine="Sub CreateH1(hid As String) As VueHTML";
RDebugUtils.currentLine=263258113;
 //BA.debugLineNum = 263258113;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,1)";
_hdr = __ref._createh /*b4j.example.vuehtml*/ (null,_hid,(int) (1));
RDebugUtils.currentLine=263258114;
 //BA.debugLineNum = 263258114;BA.debugLine="Return hdr";
if (true) return _hdr;
RDebugUtils.currentLine=263258115;
 //BA.debugLineNum = 263258115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh2(b4j.example.vuehtml __ref,String _hid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createh2", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createh2", new Object[] {_hid}));}
b4j.example.vuehtml _hdr = null;
RDebugUtils.currentLine=263323648;
 //BA.debugLineNum = 263323648;BA.debugLine="Sub CreateH2(hid As String) As VueHTML";
RDebugUtils.currentLine=263323649;
 //BA.debugLineNum = 263323649;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,2)";
_hdr = __ref._createh /*b4j.example.vuehtml*/ (null,_hid,(int) (2));
RDebugUtils.currentLine=263323650;
 //BA.debugLineNum = 263323650;BA.debugLine="Return hdr";
if (true) return _hdr;
RDebugUtils.currentLine=263323651;
 //BA.debugLineNum = 263323651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh3(b4j.example.vuehtml __ref,String _hid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createh3", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createh3", new Object[] {_hid}));}
b4j.example.vuehtml _hdr = null;
RDebugUtils.currentLine=263389184;
 //BA.debugLineNum = 263389184;BA.debugLine="Sub CreateH3(hid As String) As VueHTML";
RDebugUtils.currentLine=263389185;
 //BA.debugLineNum = 263389185;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,3)";
_hdr = __ref._createh /*b4j.example.vuehtml*/ (null,_hid,(int) (3));
RDebugUtils.currentLine=263389186;
 //BA.debugLineNum = 263389186;BA.debugLine="Return hdr";
if (true) return _hdr;
RDebugUtils.currentLine=263389187;
 //BA.debugLineNum = 263389187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh4(b4j.example.vuehtml __ref,String _hid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createh4", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createh4", new Object[] {_hid}));}
b4j.example.vuehtml _hdr = null;
RDebugUtils.currentLine=263454720;
 //BA.debugLineNum = 263454720;BA.debugLine="Sub CreateH4(hid As String) As VueHTML";
RDebugUtils.currentLine=263454721;
 //BA.debugLineNum = 263454721;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,4)";
_hdr = __ref._createh /*b4j.example.vuehtml*/ (null,_hid,(int) (4));
RDebugUtils.currentLine=263454722;
 //BA.debugLineNum = 263454722;BA.debugLine="Return hdr";
if (true) return _hdr;
RDebugUtils.currentLine=263454723;
 //BA.debugLineNum = 263454723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh5(b4j.example.vuehtml __ref,String _hid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createh5", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createh5", new Object[] {_hid}));}
b4j.example.vuehtml _hdr = null;
RDebugUtils.currentLine=263520256;
 //BA.debugLineNum = 263520256;BA.debugLine="Sub CreateH5(hid As String) As VueHTML";
RDebugUtils.currentLine=263520257;
 //BA.debugLineNum = 263520257;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,5)";
_hdr = __ref._createh /*b4j.example.vuehtml*/ (null,_hid,(int) (5));
RDebugUtils.currentLine=263520258;
 //BA.debugLineNum = 263520258;BA.debugLine="Return hdr";
if (true) return _hdr;
RDebugUtils.currentLine=263520259;
 //BA.debugLineNum = 263520259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh6(b4j.example.vuehtml __ref,String _hid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createh6", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createh6", new Object[] {_hid}));}
b4j.example.vuehtml _hdr = null;
RDebugUtils.currentLine=263585792;
 //BA.debugLineNum = 263585792;BA.debugLine="Sub CreateH6(hid As String) As VueHTML";
RDebugUtils.currentLine=263585793;
 //BA.debugLineNum = 263585793;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,6)";
_hdr = __ref._createh /*b4j.example.vuehtml*/ (null,_hid,(int) (6));
RDebugUtils.currentLine=263585794;
 //BA.debugLineNum = 263585794;BA.debugLine="Return hdr";
if (true) return _hdr;
RDebugUtils.currentLine=263585795;
 //BA.debugLineNum = 263585795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createheader(b4j.example.vuehtml __ref,String _hid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createheader", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createheader", new Object[] {_hid}));}
b4j.example.vuehtml _h = null;
RDebugUtils.currentLine=261947392;
 //BA.debugLineNum = 261947392;BA.debugLine="Sub CreateHeader(hid As String) As VueHTML";
RDebugUtils.currentLine=261947393;
 //BA.debugLineNum = 261947393;BA.debugLine="Dim h As VueHTML";
_h = new b4j.example.vuehtml();
RDebugUtils.currentLine=261947394;
 //BA.debugLineNum = 261947394;BA.debugLine="h.Initialize(hid, \"header\")";
_h._initialize /*b4j.example.vuehtml*/ (null,ba,_hid,"header");
RDebugUtils.currentLine=261947395;
 //BA.debugLineNum = 261947395;BA.debugLine="Return h";
if (true) return _h;
RDebugUtils.currentLine=261947396;
 //BA.debugLineNum = 261947396;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createhr(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createhr", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createhr", new Object[] {_b}));}
b4j.example.vuehtml _hr = null;
RDebugUtils.currentLine=263651328;
 //BA.debugLineNum = 263651328;BA.debugLine="Sub CreateHR(b As Boolean) As VueHTML";
RDebugUtils.currentLine=263651329;
 //BA.debugLineNum = 263651329;BA.debugLine="Dim hr As VueHTML";
_hr = new b4j.example.vuehtml();
RDebugUtils.currentLine=263651330;
 //BA.debugLineNum = 263651330;BA.debugLine="hr.Initialize(\"\",\"hr\")";
_hr._initialize /*b4j.example.vuehtml*/ (null,ba,"","hr");
RDebugUtils.currentLine=263651331;
 //BA.debugLineNum = 263651331;BA.debugLine="Return hr";
if (true) return _hr;
RDebugUtils.currentLine=263651332;
 //BA.debugLineNum = 263651332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createiframe(b4j.example.vuehtml __ref,String _ifid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createiframe", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createiframe", new Object[] {_ifid}));}
b4j.example.vuehtml _i = null;
RDebugUtils.currentLine=266928128;
 //BA.debugLineNum = 266928128;BA.debugLine="Sub CreateIFrame(ifid As String) As VueHTML";
RDebugUtils.currentLine=266928129;
 //BA.debugLineNum = 266928129;BA.debugLine="Dim i As VueHTML";
_i = new b4j.example.vuehtml();
RDebugUtils.currentLine=266928130;
 //BA.debugLineNum = 266928130;BA.debugLine="i.Initialize(ifid, \"iframe\")";
_i._initialize /*b4j.example.vuehtml*/ (null,ba,_ifid,"iframe");
RDebugUtils.currentLine=266928131;
 //BA.debugLineNum = 266928131;BA.debugLine="Return i";
if (true) return _i;
RDebugUtils.currentLine=266928132;
 //BA.debugLineNum = 266928132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createimg(b4j.example.vuehtml __ref,String _imgid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createimg", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createimg", new Object[] {_imgid}));}
b4j.example.vuehtml _img = null;
RDebugUtils.currentLine=262995968;
 //BA.debugLineNum = 262995968;BA.debugLine="Sub CreateIMG(imgid As String) As VueHTML";
RDebugUtils.currentLine=262995969;
 //BA.debugLineNum = 262995969;BA.debugLine="Dim img As VueHTML";
_img = new b4j.example.vuehtml();
RDebugUtils.currentLine=262995970;
 //BA.debugLineNum = 262995970;BA.debugLine="img.Initialize(imgid, \"img\")";
_img._initialize /*b4j.example.vuehtml*/ (null,ba,_imgid,"img");
RDebugUtils.currentLine=262995971;
 //BA.debugLineNum = 262995971;BA.debugLine="Return img";
if (true) return _img;
RDebugUtils.currentLine=262995972;
 //BA.debugLineNum = 262995972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinput(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinput", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinput", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=265355264;
 //BA.debugLineNum = 265355264;BA.debugLine="Sub CreateInput(tid As String) As VueHTML";
RDebugUtils.currentLine=265355265;
 //BA.debugLineNum = 265355265;BA.debugLine="tid = tid.tolowercase";
_tid = _tid.toLowerCase();
RDebugUtils.currentLine=265355266;
 //BA.debugLineNum = 265355266;BA.debugLine="Dim input As VueHTML";
_input = new b4j.example.vuehtml();
RDebugUtils.currentLine=265355267;
 //BA.debugLineNum = 265355267;BA.debugLine="input.Initialize(tid, \"input\")";
_input._initialize /*b4j.example.vuehtml*/ (null,ba,_tid,"input");
RDebugUtils.currentLine=265355268;
 //BA.debugLineNum = 265355268;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=265355269;
 //BA.debugLineNum = 265355269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputbutton(b4j.example.vuehtml __ref,String _tid,String _tvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputbutton", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputbutton", new Object[] {_tid,_tvalue}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=265945088;
 //BA.debugLineNum = 265945088;BA.debugLine="Sub CreateInputButton(tid As String, tValue As Str";
RDebugUtils.currentLine=265945089;
 //BA.debugLineNum = 265945089;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"button")._setattrvalue /*b4j.example.vuehtml*/ (null,_tvalue);
RDebugUtils.currentLine=265945090;
 //BA.debugLineNum = 265945090;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=265945091;
 //BA.debugLineNum = 265945091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtype(b4j.example.vuehtml __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtype", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtype", new Object[] {_svalue}));}
RDebugUtils.currentLine=253755392;
 //BA.debugLineNum = 253755392;BA.debugLine="Sub SetAttrTYPE(sValue As String) As VueHTML";
RDebugUtils.currentLine=253755393;
 //BA.debugLineNum = 253755393;BA.debugLine="AddAttribute(\"type\",sValue)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"type",(Object)(_svalue));
RDebugUtils.currentLine=253755394;
 //BA.debugLineNum = 253755394;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253755395;
 //BA.debugLineNum = 253755395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrvalue(b4j.example.vuehtml __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrvalue", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrvalue", new Object[] {_svalue}));}
RDebugUtils.currentLine=253231104;
 //BA.debugLineNum = 253231104;BA.debugLine="Sub SetAttrVALUE(sValue As String) As VueHTML";
RDebugUtils.currentLine=253231105;
 //BA.debugLineNum = 253231105;BA.debugLine="AddAttribute(\"value\",sValue)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"value",(Object)(_svalue));
RDebugUtils.currentLine=253231106;
 //BA.debugLineNum = 253231106;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253231107;
 //BA.debugLineNum = 253231107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputcheckbox(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputcheckbox", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputcheckbox", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266469376;
 //BA.debugLineNum = 266469376;BA.debugLine="Sub CreateInputCheckBox(tid As String) As VueHTML";
RDebugUtils.currentLine=266469377;
 //BA.debugLineNum = 266469377;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"checkbox")._setattr /*b4j.example.vuehtml*/ (null,"tabindex","0");
RDebugUtils.currentLine=266469378;
 //BA.debugLineNum = 266469378;BA.debugLine="input.AddAttribute(\"autocomplete\", \"off\")";
_input._addattribute /*b4j.example.vuehtml*/ (null,"autocomplete",(Object)("off"));
RDebugUtils.currentLine=266469379;
 //BA.debugLineNum = 266469379;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266469380;
 //BA.debugLineNum = 266469380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputcolor(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputcolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputcolor", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266272768;
 //BA.debugLineNum = 266272768;BA.debugLine="Sub CreateInputColor(tid As String) As VueHTML";
RDebugUtils.currentLine=266272769;
 //BA.debugLineNum = 266272769;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"color");
RDebugUtils.currentLine=266272770;
 //BA.debugLineNum = 266272770;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266272771;
 //BA.debugLineNum = 266272771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputdate(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputdate", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputdate", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266207232;
 //BA.debugLineNum = 266207232;BA.debugLine="Sub CreateInputDate(tid As String) As VueHTML";
RDebugUtils.currentLine=266207233;
 //BA.debugLineNum = 266207233;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"date");
RDebugUtils.currentLine=266207234;
 //BA.debugLineNum = 266207234;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266207235;
 //BA.debugLineNum = 266207235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputemail(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputemail", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputemail", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266338304;
 //BA.debugLineNum = 266338304;BA.debugLine="Sub CreateInputEmail(tid As String) As VueHTML";
RDebugUtils.currentLine=266338305;
 //BA.debugLineNum = 266338305;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"email");
RDebugUtils.currentLine=266338306;
 //BA.debugLineNum = 266338306;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266338307;
 //BA.debugLineNum = 266338307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputfile(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputfile", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputfile", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266141696;
 //BA.debugLineNum = 266141696;BA.debugLine="Sub CreateInputFile(tid As String) As VueHTML";
RDebugUtils.currentLine=266141697;
 //BA.debugLineNum = 266141697;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"file");
RDebugUtils.currentLine=266141698;
 //BA.debugLineNum = 266141698;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266141699;
 //BA.debugLineNum = 266141699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputnumber(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputnumber", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputnumber", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266862592;
 //BA.debugLineNum = 266862592;BA.debugLine="Sub CreateInputNumber(tid As String) As VueHTML";
RDebugUtils.currentLine=266862593;
 //BA.debugLineNum = 266862593;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"number");
RDebugUtils.currentLine=266862594;
 //BA.debugLineNum = 266862594;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266862595;
 //BA.debugLineNum = 266862595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputpassword(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputpassword", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputpassword", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266403840;
 //BA.debugLineNum = 266403840;BA.debugLine="Sub CreateInputPassword(tid As String) As VueHTML";
RDebugUtils.currentLine=266403841;
 //BA.debugLineNum = 266403841;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"password");
RDebugUtils.currentLine=266403842;
 //BA.debugLineNum = 266403842;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266403843;
 //BA.debugLineNum = 266403843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputradio(b4j.example.vuehtml __ref,String _tid,String _tname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputradio", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputradio", new Object[] {_tid,_tname}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266665984;
 //BA.debugLineNum = 266665984;BA.debugLine="Sub CreateInputRadio(tid As String, tname As Strin";
RDebugUtils.currentLine=266665985;
 //BA.debugLineNum = 266665985;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"radio")._setattrtabindex /*b4j.example.vuehtml*/ (null,"0")._setattrname /*b4j.example.vuehtml*/ (null,_tname);
RDebugUtils.currentLine=266665986;
 //BA.debugLineNum = 266665986;BA.debugLine="input.SetAttrautocomplete(\"off\")";
_input._setattrautocomplete /*b4j.example.vuehtml*/ (null,BA.ObjectToBoolean("off"));
RDebugUtils.currentLine=266665987;
 //BA.debugLineNum = 266665987;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266665988;
 //BA.debugLineNum = 266665988;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtabindex(b4j.example.vuehtml __ref,String _tbi) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtabindex", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtabindex", new Object[] {_tbi}));}
RDebugUtils.currentLine=266600448;
 //BA.debugLineNum = 266600448;BA.debugLine="Sub SetAttrTabIndex(tbi As String) As VueHTML";
RDebugUtils.currentLine=266600449;
 //BA.debugLineNum = 266600449;BA.debugLine="SetAttr(\"tabindex\", tbi)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"tabindex",_tbi);
RDebugUtils.currentLine=266600450;
 //BA.debugLineNum = 266600450;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=266600451;
 //BA.debugLineNum = 266600451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrname(b4j.example.vuehtml __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrname", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrname", new Object[] {_sname}));}
RDebugUtils.currentLine=253296640;
 //BA.debugLineNum = 253296640;BA.debugLine="Sub SetAttrNAME(sName As String) As VueHTML";
RDebugUtils.currentLine=253296641;
 //BA.debugLineNum = 253296641;BA.debugLine="AddAttribute(\"name\",sName)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"name",(Object)(_sname));
RDebugUtils.currentLine=253296642;
 //BA.debugLineNum = 253296642;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253296643;
 //BA.debugLineNum = 253296643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrautocomplete(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrautocomplete", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrautocomplete", new Object[] {_b}));}
RDebugUtils.currentLine=250806272;
 //BA.debugLineNum = 250806272;BA.debugLine="Sub SetAttrAUTOCOMPLETE(b As Boolean) As VueHTML";
RDebugUtils.currentLine=250806273;
 //BA.debugLineNum = 250806273;BA.debugLine="If b Then";
if (_b) { 
RDebugUtils.currentLine=250806274;
 //BA.debugLineNum = 250806274;BA.debugLine="AddAttribute(\"autocomplete\", \"on\")";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"autocomplete",(Object)("on"));
 };
RDebugUtils.currentLine=250806276;
 //BA.debugLineNum = 250806276;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250806277;
 //BA.debugLineNum = 250806277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputrange(b4j.example.vuehtml __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputrange", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputrange", new Object[] {_sid}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=261554176;
 //BA.debugLineNum = 261554176;BA.debugLine="Sub CreateInputRange(sid As String) As VueHTML";
RDebugUtils.currentLine=261554177;
 //BA.debugLineNum = 261554177;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=261554178;
 //BA.debugLineNum = 261554178;BA.debugLine="s.Initialize(sid, \"input\").SetAttrTYPE(\"range\")";
_s._initialize /*b4j.example.vuehtml*/ (null,ba,_sid,"input")._setattrtype /*b4j.example.vuehtml*/ (null,"range");
RDebugUtils.currentLine=261554179;
 //BA.debugLineNum = 261554179;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=261554180;
 //BA.debugLineNum = 261554180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputreset(b4j.example.vuehtml __ref,String _tid,String _tvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputreset", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputreset", new Object[] {_tid,_tvalue}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266010624;
 //BA.debugLineNum = 266010624;BA.debugLine="Sub CreateInputReset(tid As String, tValue As Stri";
RDebugUtils.currentLine=266010625;
 //BA.debugLineNum = 266010625;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"reset")._setattrvalue /*b4j.example.vuehtml*/ (null,_tvalue);
RDebugUtils.currentLine=266010626;
 //BA.debugLineNum = 266010626;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266010627;
 //BA.debugLineNum = 266010627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputsearch(b4j.example.vuehtml __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputsearch", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputsearch", new Object[] {_sid}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=261488640;
 //BA.debugLineNum = 261488640;BA.debugLine="Sub CreateInputSearch(sid As String) As VueHTML";
RDebugUtils.currentLine=261488641;
 //BA.debugLineNum = 261488641;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=261488642;
 //BA.debugLineNum = 261488642;BA.debugLine="s.Initialize(sid, \"input\").SetAttrTYPE(\"search\")";
_s._initialize /*b4j.example.vuehtml*/ (null,ba,_sid,"input")._setattrtype /*b4j.example.vuehtml*/ (null,"search");
RDebugUtils.currentLine=261488643;
 //BA.debugLineNum = 261488643;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=261488644;
 //BA.debugLineNum = 261488644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputsubmit(b4j.example.vuehtml __ref,String _tid,String _tvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputsubmit", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputsubmit", new Object[] {_tid,_tvalue}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266076160;
 //BA.debugLineNum = 266076160;BA.debugLine="Sub CreateInputSubmit(tid As String, tValue As Str";
RDebugUtils.currentLine=266076161;
 //BA.debugLineNum = 266076161;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"submit")._setattrvalue /*b4j.example.vuehtml*/ (null,_tvalue);
RDebugUtils.currentLine=266076162;
 //BA.debugLineNum = 266076162;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266076163;
 //BA.debugLineNum = 266076163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputtel(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputtel", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputtel", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266731520;
 //BA.debugLineNum = 266731520;BA.debugLine="Sub CreateInputTel(tid As String) As VueHTML";
RDebugUtils.currentLine=266731521;
 //BA.debugLineNum = 266731521;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"tel");
RDebugUtils.currentLine=266731522;
 //BA.debugLineNum = 266731522;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266731523;
 //BA.debugLineNum = 266731523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputtext(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputtext", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputtext", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=265814016;
 //BA.debugLineNum = 265814016;BA.debugLine="Sub CreateInputText(tid As String) As VueHTML";
RDebugUtils.currentLine=265814017;
 //BA.debugLineNum = 265814017;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"text");
RDebugUtils.currentLine=265814018;
 //BA.debugLineNum = 265814018;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=265814019;
 //BA.debugLineNum = 265814019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputurl(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createinputurl", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createinputurl", new Object[] {_tid}));}
b4j.example.vuehtml _input = null;
RDebugUtils.currentLine=266797056;
 //BA.debugLineNum = 266797056;BA.debugLine="Sub CreateInputUrl(tid As String) As VueHTML";
RDebugUtils.currentLine=266797057;
 //BA.debugLineNum = 266797057;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = __ref._createinput /*b4j.example.vuehtml*/ (null,_tid)._setattrtype /*b4j.example.vuehtml*/ (null,"url");
RDebugUtils.currentLine=266797058;
 //BA.debugLineNum = 266797058;BA.debugLine="Return input";
if (true) return _input;
RDebugUtils.currentLine=266797059;
 //BA.debugLineNum = 266797059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createlabel(b4j.example.vuehtml __ref,String _lid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createlabel", new Object[] {_lid}));}
b4j.example.vuehtml _lbl = null;
RDebugUtils.currentLine=265224192;
 //BA.debugLineNum = 265224192;BA.debugLine="Sub CreateLabel(lid As String) As VueHTML";
RDebugUtils.currentLine=265224193;
 //BA.debugLineNum = 265224193;BA.debugLine="lid = lid.tolowercase";
_lid = _lid.toLowerCase();
RDebugUtils.currentLine=265224194;
 //BA.debugLineNum = 265224194;BA.debugLine="Dim lbl As VueHTML";
_lbl = new b4j.example.vuehtml();
RDebugUtils.currentLine=265224195;
 //BA.debugLineNum = 265224195;BA.debugLine="lbl.Initialize(lid, \"label\")";
_lbl._initialize /*b4j.example.vuehtml*/ (null,ba,_lid,"label");
RDebugUtils.currentLine=265224196;
 //BA.debugLineNum = 265224196;BA.debugLine="Return lbl";
if (true) return _lbl;
RDebugUtils.currentLine=265224197;
 //BA.debugLineNum = 265224197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createli(b4j.example.vuehtml __ref,String _liid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createli", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createli", new Object[] {_liid}));}
b4j.example.vuehtml _li = null;
RDebugUtils.currentLine=262930432;
 //BA.debugLineNum = 262930432;BA.debugLine="Sub CreateLI(liid As String) As VueHTML";
RDebugUtils.currentLine=262930433;
 //BA.debugLineNum = 262930433;BA.debugLine="Dim li As VueHTML";
_li = new b4j.example.vuehtml();
RDebugUtils.currentLine=262930434;
 //BA.debugLineNum = 262930434;BA.debugLine="li.Initialize(liid, \"li\")";
_li._initialize /*b4j.example.vuehtml*/ (null,ba,_liid,"li");
RDebugUtils.currentLine=262930435;
 //BA.debugLineNum = 262930435;BA.debugLine="Return li";
if (true) return _li;
RDebugUtils.currentLine=262930436;
 //BA.debugLineNum = 262930436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createmain(b4j.example.vuehtml __ref,String _mainid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createmain", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createmain", new Object[] {_mainid}));}
b4j.example.vuehtml _m = null;
RDebugUtils.currentLine=261619712;
 //BA.debugLineNum = 261619712;BA.debugLine="Sub CreateMain(mainid As String) As VueHTML";
RDebugUtils.currentLine=261619713;
 //BA.debugLineNum = 261619713;BA.debugLine="Dim m As VueHTML";
_m = new b4j.example.vuehtml();
RDebugUtils.currentLine=261619714;
 //BA.debugLineNum = 261619714;BA.debugLine="m.Initialize(mainid, \"main\")";
_m._initialize /*b4j.example.vuehtml*/ (null,ba,_mainid,"main");
RDebugUtils.currentLine=261619715;
 //BA.debugLineNum = 261619715;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=261619716;
 //BA.debugLineNum = 261619716;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createmark(b4j.example.vuehtml __ref,String _preid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createmark", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createmark", new Object[] {_preid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262340608;
 //BA.debugLineNum = 262340608;BA.debugLine="Sub CreateMARK(preid As String) As VueHTML";
RDebugUtils.currentLine=262340609;
 //BA.debugLineNum = 262340609;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262340610;
 //BA.debugLineNum = 262340610;BA.debugLine="ul.Initialize(preid, \"mark\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_preid,"mark");
RDebugUtils.currentLine=262340611;
 //BA.debugLineNum = 262340611;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262340612;
 //BA.debugLineNum = 262340612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createnav(b4j.example.vuehtml __ref,String _nid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createnav", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createnav", new Object[] {_nid}));}
b4j.example.vuehtml _n = null;
RDebugUtils.currentLine=261816320;
 //BA.debugLineNum = 261816320;BA.debugLine="Sub CreateNav(nid As String) As VueHTML";
RDebugUtils.currentLine=261816321;
 //BA.debugLineNum = 261816321;BA.debugLine="Dim n As VueHTML";
_n = new b4j.example.vuehtml();
RDebugUtils.currentLine=261816322;
 //BA.debugLineNum = 261816322;BA.debugLine="n.Initialize(nid, \"nav\")";
_n._initialize /*b4j.example.vuehtml*/ (null,ba,_nid,"nav");
RDebugUtils.currentLine=261816323;
 //BA.debugLineNum = 261816323;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=261816324;
 //BA.debugLineNum = 261816324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createol(b4j.example.vuehtml __ref,String _preid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createol", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createol", new Object[] {_preid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262668288;
 //BA.debugLineNum = 262668288;BA.debugLine="Sub CreateOL(preid As String) As VueHTML";
RDebugUtils.currentLine=262668289;
 //BA.debugLineNum = 262668289;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262668290;
 //BA.debugLineNum = 262668290;BA.debugLine="ul.Initialize(preid, \"ol\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_preid,"ol");
RDebugUtils.currentLine=262668291;
 //BA.debugLineNum = 262668291;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262668292;
 //BA.debugLineNum = 262668292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createol1(b4j.example.vuehtml __ref,String _ulid,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createol1", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createol1", new Object[] {_ulid,_items}));}
b4j.example.vuehtml _ul = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _optid = "";
String _optval = "";
b4j.example.vuehtml _thisoption = null;
RDebugUtils.currentLine=262799360;
 //BA.debugLineNum = 262799360;BA.debugLine="Sub CreateOL1(ulid As String, items As List) As Vu";
RDebugUtils.currentLine=262799361;
 //BA.debugLineNum = 262799361;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262799362;
 //BA.debugLineNum = 262799362;BA.debugLine="ul.Initialize(ulid, \"ol\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_ulid,"ol");
RDebugUtils.currentLine=262799363;
 //BA.debugLineNum = 262799363;BA.debugLine="For Each opt As Map In items";
_opt = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _items;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
RDebugUtils.currentLine=262799364;
 //BA.debugLineNum = 262799364;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
_optid = BA.ObjectToString(_opt.Get((Object)("id")));
RDebugUtils.currentLine=262799365;
 //BA.debugLineNum = 262799365;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
_optval = BA.ObjectToString(_opt.Get((Object)("value")));
RDebugUtils.currentLine=262799366;
 //BA.debugLineNum = 262799366;BA.debugLine="Dim thisoption As VueHTML = CreateLI(\"\")";
_thisoption = __ref._createli /*b4j.example.vuehtml*/ (null,"");
RDebugUtils.currentLine=262799367;
 //BA.debugLineNum = 262799367;BA.debugLine="optid = CStr(optid)";
_optid = __ref._cstr /*String*/ (null,(Object)(_optid));
RDebugUtils.currentLine=262799368;
 //BA.debugLineNum = 262799368;BA.debugLine="optval = CStr(optval)";
_optval = __ref._cstr /*String*/ (null,(Object)(_optval));
RDebugUtils.currentLine=262799369;
 //BA.debugLineNum = 262799369;BA.debugLine="thisoption.SetText(optval)";
_thisoption._settext /*b4j.example.vuehtml*/ (null,_optval);
RDebugUtils.currentLine=262799370;
 //BA.debugLineNum = 262799370;BA.debugLine="thisoption.SetAttrVALUE(optid)";
_thisoption._setattrvalue /*b4j.example.vuehtml*/ (null,_optid);
RDebugUtils.currentLine=262799371;
 //BA.debugLineNum = 262799371;BA.debugLine="ul.AddElement(thisoption)";
_ul._addelement /*b4j.example.vuehtml*/ (null,_thisoption);
 }
};
RDebugUtils.currentLine=262799373;
 //BA.debugLineNum = 262799373;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262799374;
 //BA.debugLineNum = 262799374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createoptgroup(b4j.example.vuehtml __ref,String _oid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createoptgroup", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createoptgroup", new Object[] {_oid}));}
b4j.example.vuehtml _o = null;
RDebugUtils.currentLine=265551872;
 //BA.debugLineNum = 265551872;BA.debugLine="Sub CreateOptGroup(oid As String) As VueHTML";
RDebugUtils.currentLine=265551873;
 //BA.debugLineNum = 265551873;BA.debugLine="Dim o As VueHTML";
_o = new b4j.example.vuehtml();
RDebugUtils.currentLine=265551874;
 //BA.debugLineNum = 265551874;BA.debugLine="o.Initialize(oid, \"optgroup\")";
_o._initialize /*b4j.example.vuehtml*/ (null,ba,_oid,"optgroup");
RDebugUtils.currentLine=265551875;
 //BA.debugLineNum = 265551875;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=265551876;
 //BA.debugLineNum = 265551876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createoption(b4j.example.vuehtml __ref,String _oid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createoption", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createoption", new Object[] {_oid}));}
b4j.example.vuehtml _o = null;
RDebugUtils.currentLine=265486336;
 //BA.debugLineNum = 265486336;BA.debugLine="Sub CreateOption(oid As String) As VueHTML";
RDebugUtils.currentLine=265486337;
 //BA.debugLineNum = 265486337;BA.debugLine="Dim o As VueHTML";
_o = new b4j.example.vuehtml();
RDebugUtils.currentLine=265486338;
 //BA.debugLineNum = 265486338;BA.debugLine="o.Initialize(oid, \"option\")";
_o._initialize /*b4j.example.vuehtml*/ (null,ba,_oid,"option");
RDebugUtils.currentLine=265486339;
 //BA.debugLineNum = 265486339;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=265486340;
 //BA.debugLineNum = 265486340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createparagraph(b4j.example.vuehtml __ref,String _pid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createparagraph", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createparagraph", new Object[] {_pid}));}
b4j.example.vuehtml _p = null;
RDebugUtils.currentLine=264241152;
 //BA.debugLineNum = 264241152;BA.debugLine="Sub CreateParagraph(pid As String) As VueHTML";
RDebugUtils.currentLine=264241153;
 //BA.debugLineNum = 264241153;BA.debugLine="Dim p As VueHTML";
_p = new b4j.example.vuehtml();
RDebugUtils.currentLine=264241154;
 //BA.debugLineNum = 264241154;BA.debugLine="p.Initialize(pid, \"p\")";
_p._initialize /*b4j.example.vuehtml*/ (null,ba,_pid,"p");
RDebugUtils.currentLine=264241155;
 //BA.debugLineNum = 264241155;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=264241156;
 //BA.debugLineNum = 264241156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createpre(b4j.example.vuehtml __ref,String _preid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createpre", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createpre", new Object[] {_preid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262275072;
 //BA.debugLineNum = 262275072;BA.debugLine="Sub CreatePRE(preid As String) As VueHTML";
RDebugUtils.currentLine=262275073;
 //BA.debugLineNum = 262275073;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262275074;
 //BA.debugLineNum = 262275074;BA.debugLine="ul.Initialize(preid, \"pre\").AddClass(\"code-line\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_preid,"pre")._addclass /*b4j.example.vuehtml*/ (null,"code-line");
RDebugUtils.currentLine=262275075;
 //BA.debugLineNum = 262275075;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262275076;
 //BA.debugLineNum = 262275076;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createprogressbar(b4j.example.vuehtml __ref,String _pbid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createprogressbar", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createprogressbar", new Object[] {_pbid}));}
b4j.example.vuehtml _pb = null;
RDebugUtils.currentLine=261685248;
 //BA.debugLineNum = 261685248;BA.debugLine="Sub CreateProgressBar(pbid As String) As VueHTML";
RDebugUtils.currentLine=261685249;
 //BA.debugLineNum = 261685249;BA.debugLine="Dim pb As VueHTML";
_pb = new b4j.example.vuehtml();
RDebugUtils.currentLine=261685250;
 //BA.debugLineNum = 261685250;BA.debugLine="pb.Initialize(pbid, \"progress\")";
_pb._initialize /*b4j.example.vuehtml*/ (null,ba,_pbid,"progress");
RDebugUtils.currentLine=261685251;
 //BA.debugLineNum = 261685251;BA.debugLine="Return pb";
if (true) return _pb;
RDebugUtils.currentLine=261685252;
 //BA.debugLineNum = 261685252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createsection(b4j.example.vuehtml __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createsection", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createsection", new Object[] {_sid}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=262012928;
 //BA.debugLineNum = 262012928;BA.debugLine="Sub CreateSection(sid As String) As VueHTML";
RDebugUtils.currentLine=262012929;
 //BA.debugLineNum = 262012929;BA.debugLine="Dim s As VueHTML = CreateDIV(sid)";
_s = __ref._creatediv /*b4j.example.vuehtml*/ (null,_sid);
RDebugUtils.currentLine=262012930;
 //BA.debugLineNum = 262012930;BA.debugLine="s.AddClass(\"section\")";
_s._addclass /*b4j.example.vuehtml*/ (null,"section");
RDebugUtils.currentLine=262012931;
 //BA.debugLineNum = 262012931;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=262012932;
 //BA.debugLineNum = 262012932;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createselect(b4j.example.vuehtml __ref,String _oid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createselect", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createselect", new Object[] {_oid}));}
b4j.example.vuehtml _o = null;
RDebugUtils.currentLine=265617408;
 //BA.debugLineNum = 265617408;BA.debugLine="Sub CreateSelect(oid As String) As VueHTML";
RDebugUtils.currentLine=265617409;
 //BA.debugLineNum = 265617409;BA.debugLine="Dim o As VueHTML";
_o = new b4j.example.vuehtml();
RDebugUtils.currentLine=265617410;
 //BA.debugLineNum = 265617410;BA.debugLine="o.Initialize(oid, \"select\")";
_o._initialize /*b4j.example.vuehtml*/ (null,ba,_oid,"select");
RDebugUtils.currentLine=265617411;
 //BA.debugLineNum = 265617411;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=265617412;
 //BA.debugLineNum = 265617412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createselect1(b4j.example.vuehtml __ref,String _tid,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createselect1", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createselect1", new Object[] {_tid,_options}));}
b4j.example.vuehtml _ta = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _optid = "";
String _optval = "";
b4j.example.vuehtml _thisoption = null;
RDebugUtils.currentLine=265748480;
 //BA.debugLineNum = 265748480;BA.debugLine="Sub CreateSelect1(tid As String, options As List)";
RDebugUtils.currentLine=265748481;
 //BA.debugLineNum = 265748481;BA.debugLine="Dim ta As VueHTML";
_ta = new b4j.example.vuehtml();
RDebugUtils.currentLine=265748482;
 //BA.debugLineNum = 265748482;BA.debugLine="ta.Initialize(tid, \"select\")";
_ta._initialize /*b4j.example.vuehtml*/ (null,ba,_tid,"select");
RDebugUtils.currentLine=265748483;
 //BA.debugLineNum = 265748483;BA.debugLine="For Each opt As Map In options";
_opt = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _options;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
RDebugUtils.currentLine=265748484;
 //BA.debugLineNum = 265748484;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
_optid = BA.ObjectToString(_opt.Get((Object)("id")));
RDebugUtils.currentLine=265748485;
 //BA.debugLineNum = 265748485;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
_optval = BA.ObjectToString(_opt.Get((Object)("value")));
RDebugUtils.currentLine=265748486;
 //BA.debugLineNum = 265748486;BA.debugLine="Dim thisoption As VueHTML = CreateOption(\"\").Set";
_thisoption = __ref._createoption /*b4j.example.vuehtml*/ (null,"")._settext /*b4j.example.vuehtml*/ (null,_optval);
RDebugUtils.currentLine=265748487;
 //BA.debugLineNum = 265748487;BA.debugLine="thisoption.SetParentID(tid).SetAttrVALUE(optid)";
_thisoption._setparentid /*b4j.example.vuehtml*/ (null,_tid)._setattrvalue /*b4j.example.vuehtml*/ (null,_optid);
RDebugUtils.currentLine=265748488;
 //BA.debugLineNum = 265748488;BA.debugLine="ta.AddElement(thisoption)";
_ta._addelement /*b4j.example.vuehtml*/ (null,_thisoption);
 }
};
RDebugUtils.currentLine=265748490;
 //BA.debugLineNum = 265748490;BA.debugLine="Return ta";
if (true) return _ta;
RDebugUtils.currentLine=265748491;
 //BA.debugLineNum = 265748491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setparentid(b4j.example.vuehtml __ref,String _sparentid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setparentid", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setparentid", new Object[] {_sparentid}));}
RDebugUtils.currentLine=259719168;
 //BA.debugLineNum = 259719168;BA.debugLine="Sub SetParentID(sParentID As String) As VueHTML";
RDebugUtils.currentLine=259719169;
 //BA.debugLineNum = 259719169;BA.debugLine="ParentID = sParentID";
__ref._parentid /*String*/  = _sparentid;
RDebugUtils.currentLine=259719170;
 //BA.debugLineNum = 259719170;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=259719171;
 //BA.debugLineNum = 259719171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createsmall(b4j.example.vuehtml __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createsmall", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createsmall", new Object[] {_sid}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=263913472;
 //BA.debugLineNum = 263913472;BA.debugLine="Sub CreateSmall(sid As String) As VueHTML";
RDebugUtils.currentLine=263913473;
 //BA.debugLineNum = 263913473;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=263913474;
 //BA.debugLineNum = 263913474;BA.debugLine="s.Initialize(sid,\"small\")";
_s._initialize /*b4j.example.vuehtml*/ (null,ba,_sid,"small");
RDebugUtils.currentLine=263913475;
 //BA.debugLineNum = 263913475;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=263913476;
 //BA.debugLineNum = 263913476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createsource(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createsource", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createsource", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=264830976;
 //BA.debugLineNum = 264830976;BA.debugLine="Sub CreateSOURCE(cid As String) As VueHTML";
RDebugUtils.currentLine=264830977;
 //BA.debugLineNum = 264830977;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=264830978;
 //BA.debugLineNum = 264830978;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=264830979;
 //BA.debugLineNum = 264830979;BA.debugLine="div.Initialize(cid, \"source\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"source");
RDebugUtils.currentLine=264830980;
 //BA.debugLineNum = 264830980;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=264830981;
 //BA.debugLineNum = 264830981;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createspan(b4j.example.vuehtml __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createspan", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createspan", new Object[] {_sid}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=263979008;
 //BA.debugLineNum = 263979008;BA.debugLine="Sub CreateSpan(sid As String) As VueHTML";
RDebugUtils.currentLine=263979009;
 //BA.debugLineNum = 263979009;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=263979010;
 //BA.debugLineNum = 263979010;BA.debugLine="s.Initialize(sid,\"span\")";
_s._initialize /*b4j.example.vuehtml*/ (null,ba,_sid,"span");
RDebugUtils.currentLine=263979011;
 //BA.debugLineNum = 263979011;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=263979012;
 //BA.debugLineNum = 263979012;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createsub(b4j.example.vuehtml __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createsub", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createsub", new Object[] {_sid}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=263716864;
 //BA.debugLineNum = 263716864;BA.debugLine="Sub CreateSub(sid As String) As VueHTML";
RDebugUtils.currentLine=263716865;
 //BA.debugLineNum = 263716865;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=263716866;
 //BA.debugLineNum = 263716866;BA.debugLine="s.Initialize(sid, \"sub\")";
_s._initialize /*b4j.example.vuehtml*/ (null,ba,_sid,"sub");
RDebugUtils.currentLine=263716867;
 //BA.debugLineNum = 263716867;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=263716868;
 //BA.debugLineNum = 263716868;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtable(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createtable", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=264765440;
 //BA.debugLineNum = 264765440;BA.debugLine="Sub CreateTABLE(cid As String) As VueHTML";
RDebugUtils.currentLine=264765441;
 //BA.debugLineNum = 264765441;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=264765442;
 //BA.debugLineNum = 264765442;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=264765443;
 //BA.debugLineNum = 264765443;BA.debugLine="div.Initialize(cid, \"table\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"table");
RDebugUtils.currentLine=264765444;
 //BA.debugLineNum = 264765444;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=264765445;
 //BA.debugLineNum = 264765445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtbody(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createtbody", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createtbody", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=265027584;
 //BA.debugLineNum = 265027584;BA.debugLine="Sub CreateTBODY(cid As String) As VueHTML";
RDebugUtils.currentLine=265027585;
 //BA.debugLineNum = 265027585;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=265027586;
 //BA.debugLineNum = 265027586;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=265027587;
 //BA.debugLineNum = 265027587;BA.debugLine="div.Initialize(cid, \"tbody\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"tbody");
RDebugUtils.currentLine=265027588;
 //BA.debugLineNum = 265027588;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=265027589;
 //BA.debugLineNum = 265027589;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtd(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createtd", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createtd", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=265158656;
 //BA.debugLineNum = 265158656;BA.debugLine="Sub CreateTD(cid As String) As VueHTML";
RDebugUtils.currentLine=265158657;
 //BA.debugLineNum = 265158657;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=265158658;
 //BA.debugLineNum = 265158658;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=265158659;
 //BA.debugLineNum = 265158659;BA.debugLine="div.Initialize(cid, \"td\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"td");
RDebugUtils.currentLine=265158660;
 //BA.debugLineNum = 265158660;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=265158661;
 //BA.debugLineNum = 265158661;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtextarea(b4j.example.vuehtml __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createtextarea", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createtextarea", new Object[] {_tid}));}
b4j.example.vuehtml _ta = null;
RDebugUtils.currentLine=265420800;
 //BA.debugLineNum = 265420800;BA.debugLine="Sub CreateTextArea(tid As String) As VueHTML";
RDebugUtils.currentLine=265420801;
 //BA.debugLineNum = 265420801;BA.debugLine="Dim ta As VueHTML";
_ta = new b4j.example.vuehtml();
RDebugUtils.currentLine=265420802;
 //BA.debugLineNum = 265420802;BA.debugLine="ta.Initialize(tid, \"textarea\")";
_ta._initialize /*b4j.example.vuehtml*/ (null,ba,_tid,"textarea");
RDebugUtils.currentLine=265420803;
 //BA.debugLineNum = 265420803;BA.debugLine="Return ta";
if (true) return _ta;
RDebugUtils.currentLine=265420804;
 //BA.debugLineNum = 265420804;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createthead(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createthead", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createthead", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=264962048;
 //BA.debugLineNum = 264962048;BA.debugLine="Sub CreateTHEAD(cid As String) As VueHTML";
RDebugUtils.currentLine=264962049;
 //BA.debugLineNum = 264962049;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=264962050;
 //BA.debugLineNum = 264962050;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=264962051;
 //BA.debugLineNum = 264962051;BA.debugLine="div.Initialize(cid, \"thead\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"thead");
RDebugUtils.currentLine=264962052;
 //BA.debugLineNum = 264962052;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=264962053;
 //BA.debugLineNum = 264962053;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtime(b4j.example.vuehtml __ref,String _preid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createtime", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createtime", new Object[] {_preid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262406144;
 //BA.debugLineNum = 262406144;BA.debugLine="Sub CreateTIME(preid As String) As VueHTML";
RDebugUtils.currentLine=262406145;
 //BA.debugLineNum = 262406145;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262406146;
 //BA.debugLineNum = 262406146;BA.debugLine="ul.Initialize(preid, \"time\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_preid,"time");
RDebugUtils.currentLine=262406147;
 //BA.debugLineNum = 262406147;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262406148;
 //BA.debugLineNum = 262406148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtr(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createtr", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createtr", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=264896512;
 //BA.debugLineNum = 264896512;BA.debugLine="Sub CreateTR(cid As String) As VueHTML";
RDebugUtils.currentLine=264896513;
 //BA.debugLineNum = 264896513;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=264896514;
 //BA.debugLineNum = 264896514;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=264896515;
 //BA.debugLineNum = 264896515;BA.debugLine="div.Initialize(cid, \"tr\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"tr");
RDebugUtils.currentLine=264896516;
 //BA.debugLineNum = 264896516;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=264896517;
 //BA.debugLineNum = 264896517;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createul(b4j.example.vuehtml __ref,String _preid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createul", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createul", new Object[] {_preid}));}
b4j.example.vuehtml _ul = null;
RDebugUtils.currentLine=262733824;
 //BA.debugLineNum = 262733824;BA.debugLine="Sub CreateUL(preid As String) As VueHTML";
RDebugUtils.currentLine=262733825;
 //BA.debugLineNum = 262733825;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262733826;
 //BA.debugLineNum = 262733826;BA.debugLine="ul.Initialize(preid, \"ul\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_preid,"ul");
RDebugUtils.currentLine=262733827;
 //BA.debugLineNum = 262733827;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262733828;
 //BA.debugLineNum = 262733828;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createul1(b4j.example.vuehtml __ref,String _ulid,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createul1", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createul1", new Object[] {_ulid,_items}));}
b4j.example.vuehtml _ul = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _optid = "";
String _optval = "";
b4j.example.vuehtml _thisoption = null;
RDebugUtils.currentLine=262864896;
 //BA.debugLineNum = 262864896;BA.debugLine="Sub CreateUL1(ulid As String, items As List) As Vu";
RDebugUtils.currentLine=262864897;
 //BA.debugLineNum = 262864897;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
RDebugUtils.currentLine=262864898;
 //BA.debugLineNum = 262864898;BA.debugLine="ul.Initialize(ulid, \"ul\")";
_ul._initialize /*b4j.example.vuehtml*/ (null,ba,_ulid,"ul");
RDebugUtils.currentLine=262864899;
 //BA.debugLineNum = 262864899;BA.debugLine="For Each opt As Map In items";
_opt = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _items;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
RDebugUtils.currentLine=262864900;
 //BA.debugLineNum = 262864900;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
_optid = BA.ObjectToString(_opt.Get((Object)("id")));
RDebugUtils.currentLine=262864901;
 //BA.debugLineNum = 262864901;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
_optval = BA.ObjectToString(_opt.Get((Object)("value")));
RDebugUtils.currentLine=262864902;
 //BA.debugLineNum = 262864902;BA.debugLine="optid = CStr(optid)";
_optid = __ref._cstr /*String*/ (null,(Object)(_optid));
RDebugUtils.currentLine=262864903;
 //BA.debugLineNum = 262864903;BA.debugLine="optval = CStr(optval)";
_optval = __ref._cstr /*String*/ (null,(Object)(_optval));
RDebugUtils.currentLine=262864904;
 //BA.debugLineNum = 262864904;BA.debugLine="Dim thisoption As VueHTML = CreateLI(optid)";
_thisoption = __ref._createli /*b4j.example.vuehtml*/ (null,_optid);
RDebugUtils.currentLine=262864905;
 //BA.debugLineNum = 262864905;BA.debugLine="thisoption.SetText(optval)";
_thisoption._settext /*b4j.example.vuehtml*/ (null,_optval);
RDebugUtils.currentLine=262864906;
 //BA.debugLineNum = 262864906;BA.debugLine="ul.AddElement(thisoption)";
_ul._addelement /*b4j.example.vuehtml*/ (null,_thisoption);
 }
};
RDebugUtils.currentLine=262864908;
 //BA.debugLineNum = 262864908;BA.debugLine="Return ul";
if (true) return _ul;
RDebugUtils.currentLine=262864909;
 //BA.debugLineNum = 262864909;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createvideo(b4j.example.vuehtml __ref,String _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "createvideo", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createvideo", new Object[] {_cid}));}
b4j.example.vuehtml _div = null;
RDebugUtils.currentLine=264699904;
 //BA.debugLineNum = 264699904;BA.debugLine="Sub CreateVIDEO(cid As String) As VueHTML";
RDebugUtils.currentLine=264699905;
 //BA.debugLineNum = 264699905;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
RDebugUtils.currentLine=264699906;
 //BA.debugLineNum = 264699906;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
RDebugUtils.currentLine=264699907;
 //BA.debugLineNum = 264699907;BA.debugLine="div.Initialize(cid,\"video\")";
_div._initialize /*b4j.example.vuehtml*/ (null,ba,_cid,"video");
RDebugUtils.currentLine=264699908;
 //BA.debugLineNum = 264699908;BA.debugLine="Return div";
if (true) return _div;
RDebugUtils.currentLine=264699909;
 //BA.debugLineNum = 264699909;BA.debugLine="End Sub";
return null;
}
public Object  _getattr(b4j.example.vuehtml __ref,String _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "getattr", true))
	 {return ((Object) Debug.delegate(ba, "getattr", new Object[] {_attr}));}
RDebugUtils.currentLine=254541824;
 //BA.debugLineNum = 254541824;BA.debugLine="Sub GetAttr(attr As String) As Object";
RDebugUtils.currentLine=254541825;
 //BA.debugLineNum = 254541825;BA.debugLine="attr = attr.tolowercase";
_attr = _attr.toLowerCase();
RDebugUtils.currentLine=254541826;
 //BA.debugLineNum = 254541826;BA.debugLine="If properties.ContainsKey(attr) Then";
if (__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_attr))) { 
RDebugUtils.currentLine=254541827;
 //BA.debugLineNum = 254541827;BA.debugLine="Return properties.Get(attr)";
if (true) return __ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_attr));
 }else {
RDebugUtils.currentLine=254541829;
 //BA.debugLineNum = 254541829;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
RDebugUtils.currentLine=254541831;
 //BA.debugLineNum = 254541831;BA.debugLine="End Sub";
return null;
}
public String  _getcomponentbuilder(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "getcomponentbuilder", true))
	 {return ((String) Debug.delegate(ba, "getcomponentbuilder", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sout = "";
RDebugUtils.currentLine=256638976;
 //BA.debugLineNum = 256638976;BA.debugLine="private Sub GetComponentBuilder() As String";
RDebugUtils.currentLine=256638977;
 //BA.debugLineNum = 256638977;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=256638978;
 //BA.debugLineNum = 256638978;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=256638979;
 //BA.debugLineNum = 256638979;BA.debugLine="If Prefix.Length > 0 Then";
if (__ref._prefix /*String*/ .length()>0) { 
RDebugUtils.currentLine=256638980;
 //BA.debugLineNum = 256638980;BA.debugLine="sb.Append(Prefix)";
_sb.Append(__ref._prefix /*String*/ );
 };
RDebugUtils.currentLine=256638982;
 //BA.debugLineNum = 256638982;BA.debugLine="sb.Append(\"<\")";
_sb.Append("<");
RDebugUtils.currentLine=256638983;
 //BA.debugLineNum = 256638983;BA.debugLine="sb.Append(Tag)";
_sb.Append(__ref._tag /*String*/ );
RDebugUtils.currentLine=256638984;
 //BA.debugLineNum = 256638984;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=256638985;
 //BA.debugLineNum = 256638985;BA.debugLine="If ID.Length > 0 Then";
if (__ref._id /*String*/ .length()>0) { 
RDebugUtils.currentLine=256638986;
 //BA.debugLineNum = 256638986;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
_sb.Append(__ref._toproperty /*String*/ (null,"id",(Object)(__ref._id /*String*/ )));
 };
RDebugUtils.currentLine=256638988;
 //BA.debugLineNum = 256638988;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
RDebugUtils.currentLine=256638989;
 //BA.debugLineNum = 256638989;BA.debugLine="Select Case Tag.ToLowerCase";
switch (BA.switchObjectToInt(__ref._tag /*String*/ .toLowerCase(),"img","link","meta","input","source")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
RDebugUtils.currentLine=256638991;
 //BA.debugLineNum = 256638991;BA.debugLine="DoAProperClose = False";
__ref._doaproperclose /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=256638993;
 //BA.debugLineNum = 256638993;BA.debugLine="If DoAProperClose = True Then";
if (__ref._doaproperclose /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=256638994;
 //BA.debugLineNum = 256638994;BA.debugLine="sb.Append(\"</\")";
_sb.Append("</");
RDebugUtils.currentLine=256638995;
 //BA.debugLineNum = 256638995;BA.debugLine="sb.Append(Tag)";
_sb.Append(__ref._tag /*String*/ );
RDebugUtils.currentLine=256638996;
 //BA.debugLineNum = 256638996;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 };
RDebugUtils.currentLine=256638998;
 //BA.debugLineNum = 256638998;BA.debugLine="Dim sout As String = sb.tostring";
_sout = _sb.ToString();
RDebugUtils.currentLine=256638999;
 //BA.debugLineNum = 256638999;BA.debugLine="sout = sout.Trim";
_sout = _sout.trim();
RDebugUtils.currentLine=256639000;
 //BA.debugLineNum = 256639000;BA.debugLine="Return sout";
if (true) return _sout;
RDebugUtils.currentLine=256639001;
 //BA.debugLineNum = 256639001;BA.debugLine="End Sub";
return "";
}
public String  _getcssstyle(b4j.example.vuehtml __ref,String _stylename) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "getcssstyle", true))
	 {return ((String) Debug.delegate(ba, "getcssstyle", new Object[] {_stylename}));}
RDebugUtils.currentLine=241500160;
 //BA.debugLineNum = 241500160;BA.debugLine="Sub GetCssStyle(styleName As String) As String";
RDebugUtils.currentLine=241500161;
 //BA.debugLineNum = 241500161;BA.debugLine="Return CSSRule.Get(styleName)";
if (true) return BA.ObjectToString(__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_stylename)));
RDebugUtils.currentLine=241500162;
 //BA.debugLineNum = 241500162;BA.debugLine="End Sub";
return "";
}
public String  _getkeys(b4j.example.vuehtml __ref,String _delim,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "getkeys", true))
	 {return ((String) Debug.delegate(ba, "getkeys", new Object[] {_delim,_m}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _sout = "";
RDebugUtils.currentLine=258867200;
 //BA.debugLineNum = 258867200;BA.debugLine="Sub GetKeys(Delim As String, m As Map) As String";
RDebugUtils.currentLine=258867201;
 //BA.debugLineNum = 258867201;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=258867202;
 //BA.debugLineNum = 258867202;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=258867203;
 //BA.debugLineNum = 258867203;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=258867204;
 //BA.debugLineNum = 258867204;BA.debugLine="sb.Append(strKey).Append(Delim)";
_sb.Append(_strkey).Append(_delim);
 }
};
RDebugUtils.currentLine=258867206;
 //BA.debugLineNum = 258867206;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
RDebugUtils.currentLine=258867207;
 //BA.debugLineNum = 258867207;BA.debugLine="sout = RemDelim(sout,Delim)";
_sout = __ref._remdelim /*String*/ (null,_sout,_delim);
RDebugUtils.currentLine=258867208;
 //BA.debugLineNum = 258867208;BA.debugLine="Return sout";
if (true) return _sout;
RDebugUtils.currentLine=258867209;
 //BA.debugLineNum = 258867209;BA.debugLine="End Sub";
return "";
}
public String  _getstyleattr(b4j.example.vuehtml __ref,String _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "getstyleattr", true))
	 {return ((String) Debug.delegate(ba, "getstyleattr", new Object[] {_attr}));}
boolean _hasitem = false;
RDebugUtils.currentLine=251658240;
 //BA.debugLineNum = 251658240;BA.debugLine="Sub GetStyleAttr(attr As String) As String";
RDebugUtils.currentLine=251658241;
 //BA.debugLineNum = 251658241;BA.debugLine="attr = attr.ToLowerCase";
_attr = _attr.toLowerCase();
RDebugUtils.currentLine=251658242;
 //BA.debugLineNum = 251658242;BA.debugLine="attr = RemDelim(attr,\":\")";
_attr = __ref._remdelim /*String*/ (null,_attr,":");
RDebugUtils.currentLine=251658243;
 //BA.debugLineNum = 251658243;BA.debugLine="attr = attr.trim";
_attr = _attr.trim();
RDebugUtils.currentLine=251658244;
 //BA.debugLineNum = 251658244;BA.debugLine="Dim hasItem As Boolean = Styles.ContainsKey(attr)";
_hasitem = __ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_attr));
RDebugUtils.currentLine=251658245;
 //BA.debugLineNum = 251658245;BA.debugLine="If hasItem Then";
if (_hasitem) { 
RDebugUtils.currentLine=251658246;
 //BA.debugLineNum = 251658246;BA.debugLine="Return Styles.Get(attr)";
if (true) return BA.ObjectToString(__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_attr)));
 }else {
RDebugUtils.currentLine=251658248;
 //BA.debugLineNum = 251658248;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=251658250;
 //BA.debugLineNum = 251658250;BA.debugLine="End Sub";
return "";
}
public String  _getvalues(b4j.example.vuehtml __ref,String _delim,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "getvalues", true))
	 {return ((String) Debug.delegate(ba, "getvalues", new Object[] {_delim,_m}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _sout = "";
RDebugUtils.currentLine=258932736;
 //BA.debugLineNum = 258932736;BA.debugLine="Sub GetValues(Delim As String, m As Map) As String";
RDebugUtils.currentLine=258932737;
 //BA.debugLineNum = 258932737;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=258932738;
 //BA.debugLineNum = 258932738;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=258932739;
 //BA.debugLineNum = 258932739;BA.debugLine="For Each strKey As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=258932740;
 //BA.debugLineNum = 258932740;BA.debugLine="sb.Append(strKey).Append(Delim)";
_sb.Append(_strkey).Append(_delim);
 }
};
RDebugUtils.currentLine=258932742;
 //BA.debugLineNum = 258932742;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
RDebugUtils.currentLine=258932743;
 //BA.debugLineNum = 258932743;BA.debugLine="sout = RemDelim(sout,Delim)";
_sout = __ref._remdelim /*String*/ (null,_sout,_delim);
RDebugUtils.currentLine=258932744;
 //BA.debugLineNum = 258932744;BA.debugLine="Return sout";
if (true) return _sout;
RDebugUtils.currentLine=258932745;
 //BA.debugLineNum = 258932745;BA.debugLine="End Sub";
return "";
}
public String  _mvfieldfrom(b4j.example.vuehtml __ref,String _svalue,int _iposition,String _delimiter) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "mvfieldfrom", true))
	 {return ((String) Debug.delegate(ba, "mvfieldfrom", new Object[] {_svalue,_iposition,_delimiter}));}
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
boolean _ew = false;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
RDebugUtils.currentLine=257490944;
 //BA.debugLineNum = 257490944;BA.debugLine="public Sub MvFieldFrom(sValue As String, iPosition";
RDebugUtils.currentLine=257490945;
 //BA.debugLineNum = 257490945;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=257490946;
 //BA.debugLineNum = 257490946;BA.debugLine="Dim mValues As List";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=257490947;
 //BA.debugLineNum = 257490947;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
RDebugUtils.currentLine=257490948;
 //BA.debugLineNum = 257490948;BA.debugLine="Dim ew As Boolean = sValue.EndsWith(Delimiter)";
_ew = _svalue.endsWith(_delimiter);
RDebugUtils.currentLine=257490949;
 //BA.debugLineNum = 257490949;BA.debugLine="If ew Then";
if (_ew) { 
RDebugUtils.currentLine=257490950;
 //BA.debugLineNum = 257490950;BA.debugLine="sValue = sValue & \" \"";
_svalue = _svalue+" ";
 };
RDebugUtils.currentLine=257490952;
 //BA.debugLineNum = 257490952;BA.debugLine="mValues = StrParse(Delimiter, sValue)";
_mvalues = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,_delimiter,_svalue);
RDebugUtils.currentLine=257490953;
 //BA.debugLineNum = 257490953;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
RDebugUtils.currentLine=257490954;
 //BA.debugLineNum = 257490954;BA.debugLine="If tValues < iPosition Then";
if (_tvalues<_iposition) { 
RDebugUtils.currentLine=257490955;
 //BA.debugLineNum = 257490955;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
RDebugUtils.currentLine=257490957;
 //BA.debugLineNum = 257490957;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=257490958;
 //BA.debugLineNum = 257490958;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=257490959;
 //BA.debugLineNum = 257490959;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
RDebugUtils.currentLine=257490960;
 //BA.debugLineNum = 257490960;BA.debugLine="sb.Append(mValues.get(iPosition))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_iposition)));
RDebugUtils.currentLine=257490961;
 //BA.debugLineNum = 257490961;BA.debugLine="For startcnt = iPosition + 1 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (_iposition+1) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
RDebugUtils.currentLine=257490962;
 //BA.debugLineNum = 257490962;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
RDebugUtils.currentLine=257490963;
 //BA.debugLineNum = 257490963;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
RDebugUtils.currentLine=257490965;
 //BA.debugLineNum = 257490965;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=257490966;
 //BA.debugLineNum = 257490966;BA.debugLine="End Sub";
return "";
}
public String  _open(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "open", true))
	 {return ((String) Debug.delegate(ba, "open", null));}
String _thisclass = "";
String _thisstyle = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _thisattr = "";
String _thoseloose = "";
RDebugUtils.currentLine=258801664;
 //BA.debugLineNum = 258801664;BA.debugLine="private Sub Open() As String";
RDebugUtils.currentLine=258801670;
 //BA.debugLineNum = 258801670;BA.debugLine="Dim thisClass As String = BuildClass";
_thisclass = __ref._buildclass /*String*/ (null);
RDebugUtils.currentLine=258801671;
 //BA.debugLineNum = 258801671;BA.debugLine="thisClass = thisClass.trim";
_thisclass = _thisclass.trim();
RDebugUtils.currentLine=258801672;
 //BA.debugLineNum = 258801672;BA.debugLine="If thisClass.Length > 0 Then";
if (_thisclass.length()>0) { 
RDebugUtils.currentLine=258801673;
 //BA.debugLineNum = 258801673;BA.debugLine="AddAttribute(\"class\", thisClass)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"class",(Object)(_thisclass));
 };
RDebugUtils.currentLine=258801676;
 //BA.debugLineNum = 258801676;BA.debugLine="Dim thisStyle As String = BuildStyle";
_thisstyle = __ref._buildstyle /*String*/ (null);
RDebugUtils.currentLine=258801677;
 //BA.debugLineNum = 258801677;BA.debugLine="thisStyle = thisStyle.trim";
_thisstyle = _thisstyle.trim();
RDebugUtils.currentLine=258801678;
 //BA.debugLineNum = 258801678;BA.debugLine="If thisStyle.Length > 0 Then";
if (_thisstyle.length()>0) { 
RDebugUtils.currentLine=258801679;
 //BA.debugLineNum = 258801679;BA.debugLine="AddAttribute(\"style\", thisStyle)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"style",(Object)(_thisstyle));
 };
RDebugUtils.currentLine=258801681;
 //BA.debugLineNum = 258801681;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=258801682;
 //BA.debugLineNum = 258801682;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=258801683;
 //BA.debugLineNum = 258801683;BA.debugLine="If Prefix.Length > 0 Then";
if (__ref._prefix /*String*/ .length()>0) { 
RDebugUtils.currentLine=258801684;
 //BA.debugLineNum = 258801684;BA.debugLine="sb.Append(Prefix)";
_sb.Append(__ref._prefix /*String*/ );
 };
RDebugUtils.currentLine=258801686;
 //BA.debugLineNum = 258801686;BA.debugLine="sb.Append(\"<\")";
_sb.Append("<");
RDebugUtils.currentLine=258801687;
 //BA.debugLineNum = 258801687;BA.debugLine="sb.Append(Tag)";
_sb.Append(__ref._tag /*String*/ );
RDebugUtils.currentLine=258801688;
 //BA.debugLineNum = 258801688;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=258801689;
 //BA.debugLineNum = 258801689;BA.debugLine="If ID.Length > 0 Then";
if (__ref._id /*String*/ .length()>0) { 
RDebugUtils.currentLine=258801690;
 //BA.debugLineNum = 258801690;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
_sb.Append(__ref._toproperty /*String*/ (null,"id",(Object)(__ref._id /*String*/ )));
RDebugUtils.currentLine=258801691;
 //BA.debugLineNum = 258801691;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 };
RDebugUtils.currentLine=258801694;
 //BA.debugLineNum = 258801694;BA.debugLine="Dim thisAttr As String = BuildAttributes";
_thisattr = __ref._buildattributes /*String*/ (null);
RDebugUtils.currentLine=258801695;
 //BA.debugLineNum = 258801695;BA.debugLine="thisAttr = thisAttr.Trim";
_thisattr = _thisattr.trim();
RDebugUtils.currentLine=258801696;
 //BA.debugLineNum = 258801696;BA.debugLine="If thisAttr.Length > 0 Then";
if (_thisattr.length()>0) { 
RDebugUtils.currentLine=258801697;
 //BA.debugLineNum = 258801697;BA.debugLine="sb.Append(thisAttr)";
_sb.Append(_thisattr);
 };
RDebugUtils.currentLine=258801699;
 //BA.debugLineNum = 258801699;BA.debugLine="Dim thoseLoose As String = GetKeys(\" \",LooseAttri";
_thoseloose = __ref._getkeys /*String*/ (null," ",__ref._looseattributes /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=258801700;
 //BA.debugLineNum = 258801700;BA.debugLine="sb.Append(\" \").Append(thoseLoose)";
_sb.Append(" ").Append(_thoseloose);
RDebugUtils.currentLine=258801701;
 //BA.debugLineNum = 258801701;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
RDebugUtils.currentLine=258801702;
 //BA.debugLineNum = 258801702;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=258801703;
 //BA.debugLineNum = 258801703;BA.debugLine="End Sub";
return "";
}
public String  _pointer(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "pointer", true))
	 {return ((String) Debug.delegate(ba, "pointer", null));}
RDebugUtils.currentLine=254738432;
 //BA.debugLineNum = 254738432;BA.debugLine="Sub Pointer As String";
RDebugUtils.currentLine=254738433;
 //BA.debugLineNum = 254738433;BA.debugLine="Return \"cursor:pointer\"";
if (true) return "cursor:pointer";
RDebugUtils.currentLine=254738434;
 //BA.debugLineNum = 254738434;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vuehtml __ref,b4j.example.vuehtml _pelement) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_pelement}));}
RDebugUtils.currentLine=256180224;
 //BA.debugLineNum = 256180224;BA.debugLine="Sub Pop(pElement As VueHTML)";
RDebugUtils.currentLine=256180225;
 //BA.debugLineNum = 256180225;BA.debugLine="pElement.AddElement(Me)";
_pelement._addelement /*b4j.example.vuehtml*/ (null,(b4j.example.vuehtml)(this));
RDebugUtils.currentLine=256180226;
 //BA.debugLineNum = 256180226;BA.debugLine="End Sub";
return "";
}
public String  _poptoparent(b4j.example.vuehtml __ref,String _sparentid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "poptoparent", true))
	 {return ((String) Debug.delegate(ba, "poptoparent", new Object[] {_sparentid}));}
String _sout = "";
com.ab.banano.BANanoElement _pel = null;
RDebugUtils.currentLine=265289728;
 //BA.debugLineNum = 265289728;BA.debugLine="Sub PopToParent(sParentID As String)";
RDebugUtils.currentLine=265289729;
 //BA.debugLineNum = 265289729;BA.debugLine="Dim sout As String = ToString";
_sout = __ref._tostring /*String*/ (null);
RDebugUtils.currentLine=265289730;
 //BA.debugLineNum = 265289730;BA.debugLine="sParentID = sParentID.tolowercase";
_sparentid = _sparentid.toLowerCase();
RDebugUtils.currentLine=265289731;
 //BA.debugLineNum = 265289731;BA.debugLine="Dim pEL As BANanoElement";
_pel = new com.ab.banano.BANanoElement();
RDebugUtils.currentLine=265289732;
 //BA.debugLineNum = 265289732;BA.debugLine="pEL = BANano.GetElement($\"#${sParentID}\"$)";
_pel = __ref._banano /*com.ab.banano.BANano*/ .GetElement(("#"+__c.SmartStringFormatter("",(Object)(_sparentid))+""));
RDebugUtils.currentLine=265289733;
 //BA.debugLineNum = 265289733;BA.debugLine="pEL.Append(sout)";
_pel.Append(_sout);
RDebugUtils.currentLine=265289734;
 //BA.debugLineNum = 265289734;BA.debugLine="End Sub";
return "";
}
public String  _ramovefromlist(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _listx,String _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "ramovefromlist", true))
	 {return ((String) Debug.delegate(ba, "ramovefromlist", new Object[] {_listx,_item}));}
int _li = 0;
RDebugUtils.currentLine=243990528;
 //BA.debugLineNum = 243990528;BA.debugLine="Sub RamoveFromList(listX As List, item As String)";
RDebugUtils.currentLine=243990529;
 //BA.debugLineNum = 243990529;BA.debugLine="Dim li As Int = listX.IndexOf(item)";
_li = _listx.IndexOf((Object)(_item));
RDebugUtils.currentLine=243990530;
 //BA.debugLineNum = 243990530;BA.debugLine="If li >= 0 Then listX.RemoveAt(li)";
if (_li>=0) { 
_listx.RemoveAt(_li);};
RDebugUtils.currentLine=243990531;
 //BA.debugLineNum = 243990531;BA.debugLine="End Sub";
return "";
}
public Object  _randlistvalue(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "randlistvalue", true))
	 {return ((Object) Debug.delegate(ba, "randlistvalue", new Object[] {_listx}));}
RDebugUtils.currentLine=243924992;
 //BA.debugLineNum = 243924992;BA.debugLine="Sub RandListValue(ListX As List) As Object";
RDebugUtils.currentLine=243924993;
 //BA.debugLineNum = 243924993;BA.debugLine="ShuffleList(ListX)";
__ref._shufflelist /*anywheresoftware.b4a.objects.collections.List*/ (null,_listx);
RDebugUtils.currentLine=243924994;
 //BA.debugLineNum = 243924994;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(__c.Rnd((int) (0),(int) (_listx.getSize()-1)));
RDebugUtils.currentLine=243924995;
 //BA.debugLineNum = 243924995;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _shufflelist(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _pl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "shufflelist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "shufflelist", new Object[] {_pl}));}
int _i = 0;
int _j = 0;
Object _k = null;
RDebugUtils.currentLine=244056064;
 //BA.debugLineNum = 244056064;BA.debugLine="Sub ShuffleList(pl As List) As List";
RDebugUtils.currentLine=244056065;
 //BA.debugLineNum = 244056065;BA.debugLine="For i = pl.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_pl.getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=244056066;
 //BA.debugLineNum = 244056066;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=244056067;
 //BA.debugLineNum = 244056067;BA.debugLine="Dim k As Object";
_k = new Object();
RDebugUtils.currentLine=244056068;
 //BA.debugLineNum = 244056068;BA.debugLine="j = Rnd(0, i + 1)";
_j = __c.Rnd((int) (0),(int) (_i+1));
RDebugUtils.currentLine=244056069;
 //BA.debugLineNum = 244056069;BA.debugLine="k = pl.Get(j)";
_k = _pl.Get(_j);
RDebugUtils.currentLine=244056070;
 //BA.debugLineNum = 244056070;BA.debugLine="pl.Set(j,pl.Get(i))";
_pl.Set(_j,_pl.Get(_i));
RDebugUtils.currentLine=244056071;
 //BA.debugLineNum = 244056071;BA.debugLine="pl.Set(i,k)";
_pl.Set(_i,_k);
 }
};
RDebugUtils.currentLine=244056073;
 //BA.debugLineNum = 244056073;BA.debugLine="Return pl";
if (true) return _pl;
RDebugUtils.currentLine=244056074;
 //BA.debugLineNum = 244056074;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeattrdata(b4j.example.vuehtml __ref,String _sdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removeattrdata", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removeattrdata", new Object[] {_sdata}));}
RDebugUtils.currentLine=256245760;
 //BA.debugLineNum = 256245760;BA.debugLine="public Sub RemoveAttrData(sData As String) As VueH";
RDebugUtils.currentLine=256245761;
 //BA.debugLineNum = 256245761;BA.debugLine="sData = $\"data-${sData}\"$";
_sdata = ("data-"+__c.SmartStringFormatter("",(Object)(_sdata))+"");
RDebugUtils.currentLine=256245762;
 //BA.debugLineNum = 256245762;BA.debugLine="RemoveAttr(sData)";
__ref._removeattr /*b4j.example.vuehtml*/ (null,_sdata);
RDebugUtils.currentLine=256245763;
 //BA.debugLineNum = 256245763;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256245764;
 //BA.debugLineNum = 256245764;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeattribute(b4j.example.vuehtml __ref,String _prop) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removeattribute", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removeattribute", new Object[] {_prop}));}
RDebugUtils.currentLine=256376832;
 //BA.debugLineNum = 256376832;BA.debugLine="Sub RemoveAttribute(prop As String) As VueHTML";
RDebugUtils.currentLine=256376833;
 //BA.debugLineNum = 256376833;BA.debugLine="RemoveAttr(prop)";
__ref._removeattr /*b4j.example.vuehtml*/ (null,_prop);
RDebugUtils.currentLine=256376834;
 //BA.debugLineNum = 256376834;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256376835;
 //BA.debugLineNum = 256376835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeattributeoncondition(b4j.example.vuehtml __ref,boolean _bcondition,String _prop) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removeattributeoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removeattributeoncondition", new Object[] {_bcondition,_prop}));}
RDebugUtils.currentLine=256311296;
 //BA.debugLineNum = 256311296;BA.debugLine="Sub RemoveAttributeOnCondition(bCondition As Boole";
RDebugUtils.currentLine=256311297;
 //BA.debugLineNum = 256311297;BA.debugLine="If bCondition Then";
if (_bcondition) { 
RDebugUtils.currentLine=256311298;
 //BA.debugLineNum = 256311298;BA.debugLine="RemoveAttr(prop)";
__ref._removeattr /*b4j.example.vuehtml*/ (null,_prop);
 };
RDebugUtils.currentLine=256311300;
 //BA.debugLineNum = 256311300;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256311301;
 //BA.debugLineNum = 256311301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeborder(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removeborder", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removeborder", new Object[] {_b}));}
RDebugUtils.currentLine=242089984;
 //BA.debugLineNum = 242089984;BA.debugLine="Sub RemoveBorder(b As Boolean) As VueHTML";
RDebugUtils.currentLine=242089985;
 //BA.debugLineNum = 242089985;BA.debugLine="SetStyle(\"border\",\"none none double none\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border","none none double none");
RDebugUtils.currentLine=242089986;
 //BA.debugLineNum = 242089986;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242089987;
 //BA.debugLineNum = 242089987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeclassoncondition(b4j.example.vuehtml __ref,boolean _bcondition,String _sclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removeclassoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removeclassoncondition", new Object[] {_bcondition,_sclass}));}
RDebugUtils.currentLine=255131648;
 //BA.debugLineNum = 255131648;BA.debugLine="Sub RemoveClassOnCondition(bCondition As Boolean,";
RDebugUtils.currentLine=255131649;
 //BA.debugLineNum = 255131649;BA.debugLine="If bCondition Then";
if (_bcondition) { 
RDebugUtils.currentLine=255131650;
 //BA.debugLineNum = 255131650;BA.debugLine="removeClass(sClass)";
__ref._removeclass /*b4j.example.vuehtml*/ (null,_sclass);
 };
RDebugUtils.currentLine=255131652;
 //BA.debugLineNum = 255131652;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255131653;
 //BA.debugLineNum = 255131653;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeclassonfalsecondition(b4j.example.vuehtml __ref,boolean _bcondition,String _sclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removeclassonfalsecondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removeclassonfalsecondition", new Object[] {_bcondition,_sclass}));}
RDebugUtils.currentLine=255197184;
 //BA.debugLineNum = 255197184;BA.debugLine="Sub RemoveClassOnFalseCondition(bCondition As Bool";
RDebugUtils.currentLine=255197185;
 //BA.debugLineNum = 255197185;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
RDebugUtils.currentLine=255197186;
 //BA.debugLineNum = 255197186;BA.debugLine="removeClass(sClass)";
__ref._removeclass /*b4j.example.vuehtml*/ (null,_sclass);
 };
RDebugUtils.currentLine=255197188;
 //BA.debugLineNum = 255197188;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255197189;
 //BA.debugLineNum = 255197189;BA.debugLine="End Sub";
return null;
}
public String  _removecssrule(b4j.example.vuehtml __ref,String _stylename,String _styleprop) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removecssrule", true))
	 {return ((String) Debug.delegate(ba, "removecssrule", new Object[] {_stylename,_styleprop}));}
String _scontent = "";
anywheresoftware.b4a.objects.collections.List _spprops = null;
anywheresoftware.b4a.objects.collections.List _nlist = null;
String _strpropvalue = "";
String _strprop = "";
String _strvalue = "";
String _nline = "";
RDebugUtils.currentLine=241762304;
 //BA.debugLineNum = 241762304;BA.debugLine="Sub RemoveCssRule(styleName As String, styleProp A";
RDebugUtils.currentLine=241762305;
 //BA.debugLineNum = 241762305;BA.debugLine="Dim scontent As String";
_scontent = "";
RDebugUtils.currentLine=241762306;
 //BA.debugLineNum = 241762306;BA.debugLine="If CSSRule.ContainsKey(styleName) Then";
if (__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_stylename))) { 
RDebugUtils.currentLine=241762307;
 //BA.debugLineNum = 241762307;BA.debugLine="scontent = CSSRule.Get(styleName)";
_scontent = BA.ObjectToString(__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_stylename)));
RDebugUtils.currentLine=241762308;
 //BA.debugLineNum = 241762308;BA.debugLine="scontent = scontent.trim";
_scontent = _scontent.trim();
RDebugUtils.currentLine=241762309;
 //BA.debugLineNum = 241762309;BA.debugLine="Dim spProps As List = StrParse(\";\",scontent)";
_spprops = new anywheresoftware.b4a.objects.collections.List();
_spprops = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,";",_scontent);
RDebugUtils.currentLine=241762310;
 //BA.debugLineNum = 241762310;BA.debugLine="Dim nList As List";
_nlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=241762311;
 //BA.debugLineNum = 241762311;BA.debugLine="nList.initialize";
_nlist.Initialize();
RDebugUtils.currentLine=241762312;
 //BA.debugLineNum = 241762312;BA.debugLine="For Each strPropValue As String In spProps";
{
final anywheresoftware.b4a.BA.IterableList group8 = _spprops;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_strpropvalue = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=241762313;
 //BA.debugLineNum = 241762313;BA.debugLine="strPropValue = strPropValue.Trim";
_strpropvalue = _strpropvalue.trim();
RDebugUtils.currentLine=241762314;
 //BA.debugLineNum = 241762314;BA.debugLine="Dim strProp As String = MvField(strPropValue,1,";
_strprop = __ref._mvfield /*String*/ (null,_strpropvalue,(int) (1),":");
RDebugUtils.currentLine=241762315;
 //BA.debugLineNum = 241762315;BA.debugLine="Dim strValue As String = MvField(strPropValue,2";
_strvalue = __ref._mvfield /*String*/ (null,_strpropvalue,(int) (2),":");
RDebugUtils.currentLine=241762316;
 //BA.debugLineNum = 241762316;BA.debugLine="strProp = strProp.Trim";
_strprop = _strprop.trim();
RDebugUtils.currentLine=241762317;
 //BA.debugLineNum = 241762317;BA.debugLine="strValue = strValue.trim";
_strvalue = _strvalue.trim();
RDebugUtils.currentLine=241762318;
 //BA.debugLineNum = 241762318;BA.debugLine="If styleProp.EqualsIgnoreCase(strProp) = False";
if (_styleprop.equalsIgnoreCase(_strprop)==__c.False) { 
RDebugUtils.currentLine=241762319;
 //BA.debugLineNum = 241762319;BA.debugLine="Dim nLine As String = $\"${strProp}:${strValue}";
_nline = (""+__c.SmartStringFormatter("",(Object)(_strprop))+":"+__c.SmartStringFormatter("",(Object)(_strvalue))+"");
RDebugUtils.currentLine=241762320;
 //BA.debugLineNum = 241762320;BA.debugLine="nList.Add(nLine)";
_nlist.Add((Object)(_nline));
 };
 }
};
RDebugUtils.currentLine=241762323;
 //BA.debugLineNum = 241762323;BA.debugLine="scontent = Join(\";\",nList)";
_scontent = __ref._join /*String*/ (null,";",_nlist);
RDebugUtils.currentLine=241762324;
 //BA.debugLineNum = 241762324;BA.debugLine="CSSRule.Put(styleName,scontent)";
__ref._cssrule /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_stylename),(Object)(_scontent));
 };
RDebugUtils.currentLine=241762326;
 //BA.debugLineNum = 241762326;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _removestyle(b4j.example.vuehtml __ref,String _stylename) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "removestyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "removestyle", new Object[] {_stylename}));}
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
RDebugUtils.currentLine=256507904;
 //BA.debugLineNum = 256507904;BA.debugLine="public Sub RemoveStyle(styleName As String) As Vue";
RDebugUtils.currentLine=256507905;
 //BA.debugLineNum = 256507905;BA.debugLine="styleName = styleName.Trim";
_stylename = _stylename.trim();
RDebugUtils.currentLine=256507906;
 //BA.debugLineNum = 256507906;BA.debugLine="styleName = styleName.tolowercase";
_stylename = _stylename.toLowerCase();
RDebugUtils.currentLine=256507907;
 //BA.debugLineNum = 256507907;BA.debugLine="styleName = styleName.Replace(\" \",\";\")";
_stylename = _stylename.replace(" ",";");
RDebugUtils.currentLine=256507908;
 //BA.debugLineNum = 256507908;BA.debugLine="Dim sItems As List = StrParse(\";\",styleName)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,";",_stylename);
RDebugUtils.currentLine=256507909;
 //BA.debugLineNum = 256507909;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group5 = _sitems;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strstyle = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=256507910;
 //BA.debugLineNum = 256507910;BA.debugLine="strStyle = strStyle.trim";
_strstyle = _strstyle.trim();
RDebugUtils.currentLine=256507911;
 //BA.debugLineNum = 256507911;BA.debugLine="If Styles.ContainsKey(strStyle) Then";
if (__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_strstyle))) { 
RDebugUtils.currentLine=256507912;
 //BA.debugLineNum = 256507912;BA.debugLine="Styles.Remove(strStyle)";
__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_strstyle));
 };
 }
};
RDebugUtils.currentLine=256507915;
 //BA.debugLineNum = 256507915;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256507916;
 //BA.debugLineNum = 256507916;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattraction(b4j.example.vuehtml __ref,String _stitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattraction", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattraction", new Object[] {_stitle}));}
RDebugUtils.currentLine=250740736;
 //BA.debugLineNum = 250740736;BA.debugLine="Sub SetAttrACTION(stitle As String) As VueHTML";
RDebugUtils.currentLine=250740737;
 //BA.debugLineNum = 250740737;BA.debugLine="AddAttribute(\"action\", stitle)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"action",(Object)(_stitle));
RDebugUtils.currentLine=250740738;
 //BA.debugLineNum = 250740738;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250740739;
 //BA.debugLineNum = 250740739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattralt(b4j.example.vuehtml __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattralt", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattralt", new Object[] {_svalue}));}
RDebugUtils.currentLine=254345216;
 //BA.debugLineNum = 254345216;BA.debugLine="Sub SetAttrALT(sValue As String) As VueHTML";
RDebugUtils.currentLine=254345217;
 //BA.debugLineNum = 254345217;BA.debugLine="AddAttribute(\"alt\",sValue)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"alt",(Object)(_svalue));
RDebugUtils.currentLine=254345218;
 //BA.debugLineNum = 254345218;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254345219;
 //BA.debugLineNum = 254345219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrautocompleteoff(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrautocompleteoff", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrautocompleteoff", new Object[] {_b}));}
RDebugUtils.currentLine=266534912;
 //BA.debugLineNum = 266534912;BA.debugLine="Sub SetAttrAutoCompleteOFF(b As Boolean) As VueHTM";
RDebugUtils.currentLine=266534913;
 //BA.debugLineNum = 266534913;BA.debugLine="SetAttr(\"autocomplete\", \"off\")";
__ref._setattr /*b4j.example.vuehtml*/ (null,"autocomplete","off");
RDebugUtils.currentLine=266534914;
 //BA.debugLineNum = 266534914;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=266534915;
 //BA.debugLineNum = 266534915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrautofocus(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrautofocus", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrautofocus", new Object[] {_b}));}
RDebugUtils.currentLine=250871808;
 //BA.debugLineNum = 250871808;BA.debugLine="Sub SetAttrAUTOFOCUS(b As Boolean) As VueHTML";
RDebugUtils.currentLine=250871809;
 //BA.debugLineNum = 250871809;BA.debugLine="If b Then AddLooseAttribute(\"autofocus\")";
if (_b) { 
__ref._addlooseattribute /*b4j.example.vuehtml*/ (null,"autofocus");};
RDebugUtils.currentLine=250871810;
 //BA.debugLineNum = 250871810;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250871811;
 //BA.debugLineNum = 250871811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrcols(b4j.example.vuehtml __ref,String _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrcols", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrcols", new Object[] {_l}));}
RDebugUtils.currentLine=253624320;
 //BA.debugLineNum = 253624320;BA.debugLine="Sub SetAttrCols(l As String) As VueHTML";
RDebugUtils.currentLine=253624321;
 //BA.debugLineNum = 253624321;BA.debugLine="AddAttribute(\"cols\",l)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"cols",(Object)(_l));
RDebugUtils.currentLine=253624322;
 //BA.debugLineNum = 253624322;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253624323;
 //BA.debugLineNum = 253624323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrcss(b4j.example.vuehtml __ref,Object _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrcss", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrcss", new Object[] {_w}));}
RDebugUtils.currentLine=249364480;
 //BA.debugLineNum = 249364480;BA.debugLine="Sub SetAttrCSS(w As Object) As VueHTML";
RDebugUtils.currentLine=249364481;
 //BA.debugLineNum = 249364481;BA.debugLine="AddAttribute(\"css\", w)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"css",_w);
RDebugUtils.currentLine=249364482;
 //BA.debugLineNum = 249364482;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249364483;
 //BA.debugLineNum = 249364483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrdata(b4j.example.vuehtml __ref,String _prop,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrdata", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrdata", new Object[] {_prop,_value}));}
boolean _sw = false;
RDebugUtils.currentLine=256770048;
 //BA.debugLineNum = 256770048;BA.debugLine="Sub SetAttrData(prop As String, value As String) A";
RDebugUtils.currentLine=256770049;
 //BA.debugLineNum = 256770049;BA.debugLine="Dim sw As Boolean = prop.StartsWith(\"data-\")";
_sw = _prop.startsWith("data-");
RDebugUtils.currentLine=256770050;
 //BA.debugLineNum = 256770050;BA.debugLine="If sw Then";
if (_sw) { 
RDebugUtils.currentLine=256770051;
 //BA.debugLineNum = 256770051;BA.debugLine="AddAttribute(prop,value)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,_prop,(Object)(_value));
 }else {
RDebugUtils.currentLine=256770053;
 //BA.debugLineNum = 256770053;BA.debugLine="AddAttribute(\"data-\" & prop,value)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"data-"+_prop,(Object)(_value));
 };
RDebugUtils.currentLine=256770055;
 //BA.debugLineNum = 256770055;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256770056;
 //BA.debugLineNum = 256770056;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrdisabled(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrdisabled", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=246284288;
 //BA.debugLineNum = 246284288;BA.debugLine="Sub SetAttrDisabled(b As Boolean) As VueHTML";
RDebugUtils.currentLine=246284289;
 //BA.debugLineNum = 246284289;BA.debugLine="If b Then AddLooseAttribute(\"disabled\")";
if (_b) { 
__ref._addlooseattribute /*b4j.example.vuehtml*/ (null,"disabled");};
RDebugUtils.currentLine=246284290;
 //BA.debugLineNum = 246284290;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246284291;
 //BA.debugLineNum = 246284291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrfor(b4j.example.vuehtml __ref,String _sfor) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrfor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrfor", new Object[] {_sfor}));}
RDebugUtils.currentLine=253165568;
 //BA.debugLineNum = 253165568;BA.debugLine="Sub SetAttrFOR(sFor As String) As VueHTML";
RDebugUtils.currentLine=253165569;
 //BA.debugLineNum = 253165569;BA.debugLine="AddAttribute(\"for\",sFor)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"for",(Object)(_sfor));
RDebugUtils.currentLine=253165570;
 //BA.debugLineNum = 253165570;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253165571;
 //BA.debugLineNum = 253165571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrheight(b4j.example.vuehtml __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrheight", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrheight", new Object[] {_h}));}
RDebugUtils.currentLine=249430016;
 //BA.debugLineNum = 249430016;BA.debugLine="Sub SetAttrHeight(h As String) As VueHTML";
RDebugUtils.currentLine=249430017;
 //BA.debugLineNum = 249430017;BA.debugLine="AddAttribute(\"height\", h)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"height",(Object)(_h));
RDebugUtils.currentLine=249430018;
 //BA.debugLineNum = 249430018;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249430019;
 //BA.debugLineNum = 249430019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattributes(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattributes", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattributes", new Object[] {_m}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=244318208;
 //BA.debugLineNum = 244318208;BA.debugLine="Sub SetAttributes(m As Map) As VueHTML";
RDebugUtils.currentLine=244318209;
 //BA.debugLineNum = 244318209;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=244318210;
 //BA.debugLineNum = 244318210;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
RDebugUtils.currentLine=244318211;
 //BA.debugLineNum = 244318211;BA.debugLine="SetAttr(k,v)";
__ref._setattr /*b4j.example.vuehtml*/ (null,_k,_v);
 }
};
RDebugUtils.currentLine=244318213;
 //BA.debugLineNum = 244318213;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244318214;
 //BA.debugLineNum = 244318214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrlabel(b4j.example.vuehtml __ref,String _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrlabel", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrlabel", new Object[] {_l}));}
RDebugUtils.currentLine=253493248;
 //BA.debugLineNum = 253493248;BA.debugLine="Sub SetAttrLabel(l As String) As VueHTML";
RDebugUtils.currentLine=253493249;
 //BA.debugLineNum = 253493249;BA.debugLine="AddAttribute(\"label\",l)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"label",(Object)(_l));
RDebugUtils.currentLine=253493250;
 //BA.debugLineNum = 253493250;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253493251;
 //BA.debugLineNum = 253493251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrloose(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrloose", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrloose", new Object[] {_value}));}
RDebugUtils.currentLine=256573440;
 //BA.debugLineNum = 256573440;BA.debugLine="Sub SetAttrLoose(value As String) As VueHTML";
RDebugUtils.currentLine=256573441;
 //BA.debugLineNum = 256573441;BA.debugLine="AddLooseAttribute(value)";
__ref._addlooseattribute /*b4j.example.vuehtml*/ (null,_value);
RDebugUtils.currentLine=256573442;
 //BA.debugLineNum = 256573442;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256573443;
 //BA.debugLineNum = 256573443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmax(b4j.example.vuehtml __ref,Object _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrmax", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrmax", new Object[] {_m}));}
RDebugUtils.currentLine=255721472;
 //BA.debugLineNum = 255721472;BA.debugLine="Sub SetAttrMax(m As Object) As VueHTML";
RDebugUtils.currentLine=255721473;
 //BA.debugLineNum = 255721473;BA.debugLine="SetAttr(\"max\", m)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"max",BA.ObjectToString(_m));
RDebugUtils.currentLine=255721474;
 //BA.debugLineNum = 255721474;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255721475;
 //BA.debugLineNum = 255721475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmaxheight(b4j.example.vuehtml __ref,Object _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrmaxheight", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrmaxheight", new Object[] {_m}));}
RDebugUtils.currentLine=256049152;
 //BA.debugLineNum = 256049152;BA.debugLine="Sub SetAttrMaxHeight(m As Object) As VueHTML";
RDebugUtils.currentLine=256049153;
 //BA.debugLineNum = 256049153;BA.debugLine="SetAttr(\"mnax-height\", MakePx(m))";
__ref._setattr /*b4j.example.vuehtml*/ (null,"mnax-height",__ref._makepx /*String*/ (null,BA.ObjectToString(_m)));
RDebugUtils.currentLine=256049154;
 //BA.debugLineNum = 256049154;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=256049155;
 //BA.debugLineNum = 256049155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmaxwidth(b4j.example.vuehtml __ref,Object _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrmaxwidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrmaxwidth", new Object[] {_m}));}
RDebugUtils.currentLine=255983616;
 //BA.debugLineNum = 255983616;BA.debugLine="Sub SetAttrMaxWidth(m As Object) As VueHTML";
RDebugUtils.currentLine=255983617;
 //BA.debugLineNum = 255983617;BA.debugLine="SetAttr(\"max-width\", MakePx(m))";
__ref._setattr /*b4j.example.vuehtml*/ (null,"max-width",__ref._makepx /*String*/ (null,BA.ObjectToString(_m)));
RDebugUtils.currentLine=255983618;
 //BA.debugLineNum = 255983618;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255983619;
 //BA.debugLineNum = 255983619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmethod(b4j.example.vuehtml __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrmethod", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrmethod", new Object[] {_svalue}));}
RDebugUtils.currentLine=251920384;
 //BA.debugLineNum = 251920384;BA.debugLine="Sub SetAttrMETHOD(sValue As String) As VueHTML";
RDebugUtils.currentLine=251920385;
 //BA.debugLineNum = 251920385;BA.debugLine="AddAttribute(\"method\",sValue)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"method",(Object)(_svalue));
RDebugUtils.currentLine=251920386;
 //BA.debugLineNum = 251920386;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251920387;
 //BA.debugLineNum = 251920387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmin(b4j.example.vuehtml __ref,Object _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrmin", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrmin", new Object[] {_m}));}
RDebugUtils.currentLine=255787008;
 //BA.debugLineNum = 255787008;BA.debugLine="Sub SetAttrMin(m As Object) As VueHTML";
RDebugUtils.currentLine=255787009;
 //BA.debugLineNum = 255787009;BA.debugLine="SetAttr(\"min\", MakePx(m))";
__ref._setattr /*b4j.example.vuehtml*/ (null,"min",__ref._makepx /*String*/ (null,BA.ObjectToString(_m)));
RDebugUtils.currentLine=255787010;
 //BA.debugLineNum = 255787010;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255787011;
 //BA.debugLineNum = 255787011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrminheight(b4j.example.vuehtml __ref,Object _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrminheight", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrminheight", new Object[] {_m}));}
RDebugUtils.currentLine=255918080;
 //BA.debugLineNum = 255918080;BA.debugLine="Sub SetAttrMinHeight(m As Object) As VueHTML";
RDebugUtils.currentLine=255918081;
 //BA.debugLineNum = 255918081;BA.debugLine="SetAttr(\"min-height\", MakePx(m))";
__ref._setattr /*b4j.example.vuehtml*/ (null,"min-height",__ref._makepx /*String*/ (null,BA.ObjectToString(_m)));
RDebugUtils.currentLine=255918082;
 //BA.debugLineNum = 255918082;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255918083;
 //BA.debugLineNum = 255918083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrminwidth(b4j.example.vuehtml __ref,Object _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrminwidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrminwidth", new Object[] {_m}));}
RDebugUtils.currentLine=255852544;
 //BA.debugLineNum = 255852544;BA.debugLine="Sub SetAttrMinWidth(m As Object) As VueHTML";
RDebugUtils.currentLine=255852545;
 //BA.debugLineNum = 255852545;BA.debugLine="SetAttr(\"min-width\", MakePx(m))";
__ref._setattr /*b4j.example.vuehtml*/ (null,"min-width",__ref._makepx /*String*/ (null,BA.ObjectToString(_m)));
RDebugUtils.currentLine=255852546;
 //BA.debugLineNum = 255852546;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255852547;
 //BA.debugLineNum = 255852547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrel(b4j.example.vuehtml __ref,String _rel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrrel", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrrel", new Object[] {_rel}));}
RDebugUtils.currentLine=250937344;
 //BA.debugLineNum = 250937344;BA.debugLine="Sub SetAttrREL(rel As String) As VueHTML";
RDebugUtils.currentLine=250937345;
 //BA.debugLineNum = 250937345;BA.debugLine="AddAttribute(\"rel\", rel)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"rel",(Object)(_rel));
RDebugUtils.currentLine=250937346;
 //BA.debugLineNum = 250937346;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250937347;
 //BA.debugLineNum = 250937347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrole(b4j.example.vuehtml __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrrole", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrrole", new Object[] {_svalue}));}
RDebugUtils.currentLine=251854848;
 //BA.debugLineNum = 251854848;BA.debugLine="Sub SetAttrROLE(sValue As String) As VueHTML";
RDebugUtils.currentLine=251854849;
 //BA.debugLineNum = 251854849;BA.debugLine="AddAttribute(\"role\",sValue)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"role",(Object)(_svalue));
RDebugUtils.currentLine=251854850;
 //BA.debugLineNum = 251854850;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251854851;
 //BA.debugLineNum = 251854851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrolebutton(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrrolebutton", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrrolebutton", new Object[] {_b}));}
RDebugUtils.currentLine=245039104;
 //BA.debugLineNum = 245039104;BA.debugLine="Sub SetAttrRoleButton(b As Boolean) As VueHTML   '";
RDebugUtils.currentLine=245039105;
 //BA.debugLineNum = 245039105;BA.debugLine="SetAttrROLE(\"button\")";
__ref._setattrrole /*b4j.example.vuehtml*/ (null,"button");
RDebugUtils.currentLine=245039106;
 //BA.debugLineNum = 245039106;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245039107;
 //BA.debugLineNum = 245039107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrows(b4j.example.vuehtml __ref,String _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrrows", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrrows", new Object[] {_l}));}
RDebugUtils.currentLine=253558784;
 //BA.debugLineNum = 253558784;BA.debugLine="Sub SetAttrRows(l As String) As VueHTML";
RDebugUtils.currentLine=253558785;
 //BA.debugLineNum = 253558785;BA.debugLine="AddAttribute(\"rows\",l)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"rows",(Object)(_l));
RDebugUtils.currentLine=253558786;
 //BA.debugLineNum = 253558786;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253558787;
 //BA.debugLineNum = 253558787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrowspan(b4j.example.vuehtml __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrrowspan", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrrowspan", new Object[] {_sname}));}
RDebugUtils.currentLine=253689856;
 //BA.debugLineNum = 253689856;BA.debugLine="Sub SetAttrROWSPAN(sName As String) As VueHTML";
RDebugUtils.currentLine=253689857;
 //BA.debugLineNum = 253689857;BA.debugLine="AddAttribute(\"rowspan\",sName)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"rowspan",(Object)(_sname));
RDebugUtils.currentLine=253689858;
 //BA.debugLineNum = 253689858;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253689859;
 //BA.debugLineNum = 253689859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrsrc(b4j.example.vuehtml __ref,String _svalue,boolean _static) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrsrc", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrsrc", new Object[] {_svalue,_static}));}
String _tmpfile = "";
RDebugUtils.currentLine=254279680;
 //BA.debugLineNum = 254279680;BA.debugLine="Sub SetAttrSRC(sValue As String, Static As Boolean";
RDebugUtils.currentLine=254279681;
 //BA.debugLineNum = 254279681;BA.debugLine="Dim tmpFile As String = MvField(sValue,1,\"?\")";
_tmpfile = __ref._mvfield /*String*/ (null,_svalue,(int) (1),"?");
RDebugUtils.currentLine=254279682;
 //BA.debugLineNum = 254279682;BA.debugLine="If Static Then";
if (_static) { 
RDebugUtils.currentLine=254279683;
 //BA.debugLineNum = 254279683;BA.debugLine="sValue = tmpFile";
_svalue = _tmpfile;
 }else {
RDebugUtils.currentLine=254279685;
 //BA.debugLineNum = 254279685;BA.debugLine="sValue = tmpFile & \"?\" & DateTime.now";
_svalue = _tmpfile+"?"+BA.NumberToString(__c.DateTime.getNow());
 };
RDebugUtils.currentLine=254279687;
 //BA.debugLineNum = 254279687;BA.debugLine="AddAttribute(\"src\",sValue)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"src",(Object)(_svalue));
RDebugUtils.currentLine=254279688;
 //BA.debugLineNum = 254279688;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=254279689;
 //BA.debugLineNum = 254279689;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrsummary(b4j.example.vuehtml __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrsummary", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrsummary", new Object[] {_sname}));}
RDebugUtils.currentLine=253362176;
 //BA.debugLineNum = 253362176;BA.debugLine="Sub SetAttrSUMMARY(sName As String) As VueHTML";
RDebugUtils.currentLine=253362177;
 //BA.debugLineNum = 253362177;BA.debugLine="AddAttribute(\"summary\",sName)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"summary",(Object)(_sname));
RDebugUtils.currentLine=253362178;
 //BA.debugLineNum = 253362178;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253362179;
 //BA.debugLineNum = 253362179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtargetparent(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtargetparent", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtargetparent", new Object[] {_b}));}
RDebugUtils.currentLine=251396096;
 //BA.debugLineNum = 251396096;BA.debugLine="Sub SetAttrTargetParent(b As Boolean) As VueHTML";
RDebugUtils.currentLine=251396097;
 //BA.debugLineNum = 251396097;BA.debugLine="SetAttrTARGET(\"_parent\")";
__ref._setattrtarget /*b4j.example.vuehtml*/ (null,"_parent");
RDebugUtils.currentLine=251396098;
 //BA.debugLineNum = 251396098;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251396099;
 //BA.debugLineNum = 251396099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtargetself(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtargetself", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtargetself", new Object[] {_b}));}
RDebugUtils.currentLine=251330560;
 //BA.debugLineNum = 251330560;BA.debugLine="Sub SetAttrTargetSelf(b As Boolean) As VueHTML";
RDebugUtils.currentLine=251330561;
 //BA.debugLineNum = 251330561;BA.debugLine="SetAttrTARGET(\"_self\")";
__ref._setattrtarget /*b4j.example.vuehtml*/ (null,"_self");
RDebugUtils.currentLine=251330562;
 //BA.debugLineNum = 251330562;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251330563;
 //BA.debugLineNum = 251330563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtargettop(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtargettop", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtargettop", new Object[] {_b}));}
RDebugUtils.currentLine=251461632;
 //BA.debugLineNum = 251461632;BA.debugLine="Sub SetAttrTargetTop(b As Boolean) As VueHTML    '";
RDebugUtils.currentLine=251461633;
 //BA.debugLineNum = 251461633;BA.debugLine="SetAttrTARGET(\"_top\")";
__ref._setattrtarget /*b4j.example.vuehtml*/ (null,"_top");
RDebugUtils.currentLine=251461634;
 //BA.debugLineNum = 251461634;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251461635;
 //BA.debugLineNum = 251461635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtitle(b4j.example.vuehtml __ref,String _stitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtitle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtitle", new Object[] {_stitle}));}
RDebugUtils.currentLine=250675200;
 //BA.debugLineNum = 250675200;BA.debugLine="Sub SetAttrTITLE(stitle As String) As VueHTML";
RDebugUtils.currentLine=250675201;
 //BA.debugLineNum = 250675201;BA.debugLine="AddAttribute(\"title\", stitle)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"title",(Object)(_stitle));
RDebugUtils.currentLine=250675202;
 //BA.debugLineNum = 250675202;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250675203;
 //BA.debugLineNum = 250675203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypelowercase(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtypelowercase", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtypelowercase", null));}
RDebugUtils.currentLine=252182528;
 //BA.debugLineNum = 252182528;BA.debugLine="Sub SetAttrTypeLowerCase() As VueHTML";
RDebugUtils.currentLine=252182529;
 //BA.debugLineNum = 252182529;BA.debugLine="AddAttribute(\"type\",\"a\")";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"type",(Object)("a"));
RDebugUtils.currentLine=252182530;
 //BA.debugLineNum = 252182530;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252182531;
 //BA.debugLineNum = 252182531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypelowercaseroman(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtypelowercaseroman", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtypelowercaseroman", null));}
RDebugUtils.currentLine=252313600;
 //BA.debugLineNum = 252313600;BA.debugLine="Sub SetAttrTypeLowerCaseRoman() As VueHTML";
RDebugUtils.currentLine=252313601;
 //BA.debugLineNum = 252313601;BA.debugLine="AddAttribute(\"type\",\"i\")";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"type",(Object)("i"));
RDebugUtils.currentLine=252313602;
 //BA.debugLineNum = 252313602;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252313603;
 //BA.debugLineNum = 252313603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypenumbers(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtypenumbers", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtypenumbers", null));}
RDebugUtils.currentLine=252051456;
 //BA.debugLineNum = 252051456;BA.debugLine="Sub SetAttrTypeNumbers() As VueHTML";
RDebugUtils.currentLine=252051457;
 //BA.debugLineNum = 252051457;BA.debugLine="AddAttribute(\"type\",\"1\")";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"type",(Object)("1"));
RDebugUtils.currentLine=252051458;
 //BA.debugLineNum = 252051458;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252051459;
 //BA.debugLineNum = 252051459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypeuppercase(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtypeuppercase", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtypeuppercase", null));}
RDebugUtils.currentLine=252116992;
 //BA.debugLineNum = 252116992;BA.debugLine="Sub SetAttrTypeUpperCase() As VueHTML";
RDebugUtils.currentLine=252116993;
 //BA.debugLineNum = 252116993;BA.debugLine="AddAttribute(\"type\",\"A\")";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"type",(Object)("A"));
RDebugUtils.currentLine=252116994;
 //BA.debugLineNum = 252116994;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252116995;
 //BA.debugLineNum = 252116995;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypeuppercaseroman(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrtypeuppercaseroman", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrtypeuppercaseroman", null));}
RDebugUtils.currentLine=252248064;
 //BA.debugLineNum = 252248064;BA.debugLine="Sub SetAttrTypeUpperCaseRoman() As VueHTML";
RDebugUtils.currentLine=252248065;
 //BA.debugLineNum = 252248065;BA.debugLine="AddAttribute(\"type\",\"I\")";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"type",(Object)("I"));
RDebugUtils.currentLine=252248066;
 //BA.debugLineNum = 252248066;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252248067;
 //BA.debugLineNum = 252248067;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrwidth(b4j.example.vuehtml __ref,Object _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setattrwidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setattrwidth", new Object[] {_w}));}
RDebugUtils.currentLine=249298944;
 //BA.debugLineNum = 249298944;BA.debugLine="Sub SetAttrWidth(w As Object) As VueHTML";
RDebugUtils.currentLine=249298945;
 //BA.debugLineNum = 249298945;BA.debugLine="AddAttribute(\"width\", w)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"width",_w);
RDebugUtils.currentLine=249298946;
 //BA.debugLineNum = 249298946;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249298947;
 //BA.debugLineNum = 249298947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setbackgroundcolor(b4j.example.vuehtml __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_p}));}
RDebugUtils.currentLine=242614272;
 //BA.debugLineNum = 242614272;BA.debugLine="Sub SetBackgroundColor(p As Object) As VueHTML";
RDebugUtils.currentLine=242614273;
 //BA.debugLineNum = 242614273;BA.debugLine="SetStyleMulti(CreateMap(\"background-color\":p))";
__ref._setstylemulti /*b4j.example.vuehtml*/ (null,__c.createMap(new Object[] {(Object)("background-color"),_p}));
RDebugUtils.currentLine=242614274;
 //BA.debugLineNum = 242614274;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242614275;
 //BA.debugLineNum = 242614275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemulti(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylemulti", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylemulti", new Object[] {_m}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=248905728;
 //BA.debugLineNum = 248905728;BA.debugLine="Sub SetStyleMulti(m As Map) As VueHTML";
RDebugUtils.currentLine=248905729;
 //BA.debugLineNum = 248905729;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=248905730;
 //BA.debugLineNum = 248905730;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=248905731;
 //BA.debugLineNum = 248905731;BA.debugLine="SetStyle(k,v)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,_k,BA.ObjectToString(_v));
 }
};
RDebugUtils.currentLine=248905733;
 //BA.debugLineNum = 248905733;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248905734;
 //BA.debugLineNum = 248905734;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setborder(b4j.example.vuehtml __ref,String _width,String _color,String _bstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setborder", new Object[] {_width,_color,_bstyle}));}
RDebugUtils.currentLine=249036800;
 //BA.debugLineNum = 249036800;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
RDebugUtils.currentLine=249036801;
 //BA.debugLineNum = 249036801;BA.debugLine="SetStyle(\"border-style\", bstyle)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style",_bstyle);
RDebugUtils.currentLine=249036802;
 //BA.debugLineNum = 249036802;BA.debugLine="SetStyle(\"border-width\", width)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-width",_width);
RDebugUtils.currentLine=249036803;
 //BA.debugLineNum = 249036803;BA.debugLine="SetStyle(\"border-color\", color)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-color",_color);
RDebugUtils.currentLine=249036804;
 //BA.debugLineNum = 249036804;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249036805;
 //BA.debugLineNum = 249036805;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcite(b4j.example.vuehtml __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setcite", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setcite", new Object[] {_c}));}
RDebugUtils.currentLine=262209536;
 //BA.debugLineNum = 262209536;BA.debugLine="Sub SetCite(c As Object) As VueHTML";
RDebugUtils.currentLine=262209537;
 //BA.debugLineNum = 262209537;BA.debugLine="AddAttribute(\"cite\", c)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"cite",_c);
RDebugUtils.currentLine=262209538;
 //BA.debugLineNum = 262209538;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=262209539;
 //BA.debugLineNum = 262209539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclass(b4j.example.vuehtml __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setclass", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setclass", new Object[] {_c}));}
RDebugUtils.currentLine=244711424;
 //BA.debugLineNum = 244711424;BA.debugLine="Sub SetClass(c As Object) As VueHTML   'ignore";
RDebugUtils.currentLine=244711425;
 //BA.debugLineNum = 244711425;BA.debugLine="AddClass(c)";
__ref._addclass /*b4j.example.vuehtml*/ (null,BA.ObjectToString(_c));
RDebugUtils.currentLine=244711426;
 //BA.debugLineNum = 244711426;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244711427;
 //BA.debugLineNum = 244711427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclasscenter(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setclasscenter", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setclasscenter", null));}
RDebugUtils.currentLine=251592704;
 //BA.debugLineNum = 251592704;BA.debugLine="Sub SetClassCenter As VueHTML";
RDebugUtils.currentLine=251592705;
 //BA.debugLineNum = 251592705;BA.debugLine="AddClass(\"center\")";
__ref._addclass /*b4j.example.vuehtml*/ (null,"center");
RDebugUtils.currentLine=251592706;
 //BA.debugLineNum = 251592706;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251592707;
 //BA.debugLineNum = 251592707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclasses(b4j.example.vuehtml __ref,anywheresoftware.b4a.objects.collections.List _clslist) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setclasses", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setclasses", new Object[] {_clslist}));}
String _c = "";
RDebugUtils.currentLine=244187136;
 //BA.debugLineNum = 244187136;BA.debugLine="Sub SetClasses(clsList As List) As VueHTML";
RDebugUtils.currentLine=244187137;
 //BA.debugLineNum = 244187137;BA.debugLine="For Each c As String In clsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _clslist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=244187138;
 //BA.debugLineNum = 244187138;BA.debugLine="AddClass(c)";
__ref._addclass /*b4j.example.vuehtml*/ (null,_c);
 }
};
RDebugUtils.currentLine=244187140;
 //BA.debugLineNum = 244187140;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244187141;
 //BA.debugLineNum = 244187141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclassrow(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setclassrow", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setclassrow", new Object[] {_b}));}
RDebugUtils.currentLine=244908032;
 //BA.debugLineNum = 244908032;BA.debugLine="Sub SetClassRow(b As Boolean) As VueHTML   'ignore";
RDebugUtils.currentLine=244908033;
 //BA.debugLineNum = 244908033;BA.debugLine="AddClass(\"row\")";
__ref._addclass /*b4j.example.vuehtml*/ (null,"row");
RDebugUtils.currentLine=244908034;
 //BA.debugLineNum = 244908034;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244908035;
 //BA.debugLineNum = 244908035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclasssection(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setclasssection", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setclasssection", new Object[] {_b}));}
RDebugUtils.currentLine=244776960;
 //BA.debugLineNum = 244776960;BA.debugLine="Sub SetClassSection(b As Boolean) As VueHTML   'ig";
RDebugUtils.currentLine=244776961;
 //BA.debugLineNum = 244776961;BA.debugLine="AddClass(\"section\")";
__ref._addclass /*b4j.example.vuehtml*/ (null,"section");
RDebugUtils.currentLine=244776962;
 //BA.debugLineNum = 244776962;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244776963;
 //BA.debugLineNum = 244776963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcode(b4j.example.vuehtml __ref,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setcode", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setcode", new Object[] {_stext}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=255459328;
 //BA.debugLineNum = 255459328;BA.debugLine="Sub SetCode(sText As String) As VueHTML";
RDebugUtils.currentLine=255459329;
 //BA.debugLineNum = 255459329;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=255459330;
 //BA.debugLineNum = 255459330;BA.debugLine="s = CreateCode(\"\").SetText(sText)";
_s = __ref._createcode /*b4j.example.vuehtml*/ (null,"")._settext /*b4j.example.vuehtml*/ (null,_stext);
RDebugUtils.currentLine=255459331;
 //BA.debugLineNum = 255459331;BA.debugLine="AddElement(s)";
__ref._addelement /*b4j.example.vuehtml*/ (null,_s);
RDebugUtils.currentLine=255459332;
 //BA.debugLineNum = 255459332;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255459333;
 //BA.debugLineNum = 255459333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcolor(b4j.example.vuehtml __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setcolor", new Object[] {_c}));}
RDebugUtils.currentLine=242483200;
 //BA.debugLineNum = 242483200;BA.debugLine="Sub SetColor(c As Object) As VueHTML";
RDebugUtils.currentLine=242483201;
 //BA.debugLineNum = 242483201;BA.debugLine="SetAttr(\"color\", c)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"color",BA.ObjectToString(_c));
RDebugUtils.currentLine=242483202;
 //BA.debugLineNum = 242483202;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242483203;
 //BA.debugLineNum = 242483203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcolspan(b4j.example.vuehtml __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setcolspan", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setcolspan", new Object[] {_sname}));}
RDebugUtils.currentLine=253427712;
 //BA.debugLineNum = 253427712;BA.debugLine="Sub SetCOLSPAN(sName As String) As VueHTML";
RDebugUtils.currentLine=253427713;
 //BA.debugLineNum = 253427713;BA.debugLine="AddAttribute(\"colspan\",sName)";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"colspan",(Object)(_sname));
RDebugUtils.currentLine=253427714;
 //BA.debugLineNum = 253427714;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253427715;
 //BA.debugLineNum = 253427715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcontents(b4j.example.vuehtml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setcontents", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setcontents", new Object[] {_value}));}
RDebugUtils.currentLine=251723776;
 //BA.debugLineNum = 251723776;BA.debugLine="public Sub SetContents(value As String) As VueHTML";
RDebugUtils.currentLine=251723777;
 //BA.debugLineNum = 251723777;BA.debugLine="Contents.Initialize";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=251723778;
 //BA.debugLineNum = 251723778;BA.debugLine="Contents.clear";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=251723779;
 //BA.debugLineNum = 251723779;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
RDebugUtils.currentLine=251723780;
 //BA.debugLineNum = 251723780;BA.debugLine="AddContent(value)";
__ref._addcontent /*b4j.example.vuehtml*/ (null,_value);
 };
RDebugUtils.currentLine=251723782;
 //BA.debugLineNum = 251723782;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=251723783;
 //BA.debugLineNum = 251723783;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcursormove(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setcursormove", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setcursormove", null));}
RDebugUtils.currentLine=249102336;
 //BA.debugLineNum = 249102336;BA.debugLine="Sub SetCursorMove As VueHTML";
RDebugUtils.currentLine=249102337;
 //BA.debugLineNum = 249102337;BA.debugLine="SetStyle(\"cursor\", \"move\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"cursor","move");
RDebugUtils.currentLine=249102338;
 //BA.debugLineNum = 249102338;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249102339;
 //BA.debugLineNum = 249102339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcursorpointer(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setcursorpointer", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setcursorpointer", null));}
RDebugUtils.currentLine=248971264;
 //BA.debugLineNum = 248971264;BA.debugLine="Sub SetCursorPointer As VueHTML";
RDebugUtils.currentLine=248971265;
 //BA.debugLineNum = 248971265;BA.debugLine="SetStyle(\"cursor\", \"pointer\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"cursor","pointer");
RDebugUtils.currentLine=248971266;
 //BA.debugLineNum = 248971266;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248971267;
 //BA.debugLineNum = 248971267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdata(b4j.example.vuehtml __ref,Object _dsx) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setdata", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setdata", new Object[] {_dsx}));}
RDebugUtils.currentLine=242941952;
 //BA.debugLineNum = 242941952;BA.debugLine="Sub SetData(dsx As Object) As VueHTML";
RDebugUtils.currentLine=242941953;
 //BA.debugLineNum = 242941953;BA.debugLine="ds = dsx";
__ref._ds /*String*/  = BA.ObjectToString(_dsx);
RDebugUtils.currentLine=242941954;
 //BA.debugLineNum = 242941954;BA.debugLine="SetVFor(\"row\", dsx)";
__ref._setvfor /*b4j.example.vuehtml*/ (null,"row",BA.ObjectToString(_dsx));
RDebugUtils.currentLine=242941955;
 //BA.debugLineNum = 242941955;BA.debugLine="SetKey(\"id\")";
__ref._setkey /*b4j.example.vuehtml*/ (null,"id");
RDebugUtils.currentLine=242941956;
 //BA.debugLineNum = 242941956;BA.debugLine="SetValue(\"value\")";
__ref._setvalue /*b4j.example.vuehtml*/ (null,(Object)("value"));
RDebugUtils.currentLine=242941957;
 //BA.debugLineNum = 242941957;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242941958;
 //BA.debugLineNum = 242941958;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvfor(b4j.example.vuehtml __ref,String _item,String _datasource) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvfor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvfor", new Object[] {_item,_datasource}));}
String _sline = "";
RDebugUtils.currentLine=243269632;
 //BA.debugLineNum = 243269632;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
RDebugUtils.currentLine=243269633;
 //BA.debugLineNum = 243269633;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
RDebugUtils.currentLine=243269634;
 //BA.debugLineNum = 243269634;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
RDebugUtils.currentLine=243269635;
 //BA.debugLineNum = 243269635;BA.debugLine="If ds = \"\" Then";
if ((__ref._ds /*String*/ ).equals("")) { 
RDebugUtils.currentLine=243269636;
 //BA.debugLineNum = 243269636;BA.debugLine="Log(\"VueHTML.SetValue, you need to run VueHTML.S";
__c.Log("VueHTML.SetValue, you need to run VueHTML.SetData first before you set for!");
 };
RDebugUtils.currentLine=243269638;
 //BA.debugLineNum = 243269638;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
RDebugUtils.currentLine=243269639;
 //BA.debugLineNum = 243269639;BA.debugLine="SetAttr(\"v-for\", sline)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-for",_sline);
RDebugUtils.currentLine=243269640;
 //BA.debugLineNum = 243269640;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243269641;
 //BA.debugLineNum = 243269641;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setkey(b4j.example.vuehtml __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setkey", new Object[] {_k}));}
RDebugUtils.currentLine=243335168;
 //BA.debugLineNum = 243335168;BA.debugLine="Sub SetKey(k As String) As VueHTML";
RDebugUtils.currentLine=243335169;
 //BA.debugLineNum = 243335169;BA.debugLine="SetAttr(\":key\", k)";
__ref._setattr /*b4j.example.vuehtml*/ (null,":key",_k);
RDebugUtils.currentLine=243335170;
 //BA.debugLineNum = 243335170;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243335171;
 //BA.debugLineNum = 243335171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvalue(b4j.example.vuehtml __ref,Object _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvalue", new Object[] {_l}));}
String _valuename = "";
String _txt = "";
RDebugUtils.currentLine=243007488;
 //BA.debugLineNum = 243007488;BA.debugLine="private Sub SetValue(l As Object) As VueHTML";
RDebugUtils.currentLine=243007489;
 //BA.debugLineNum = 243007489;BA.debugLine="If ds = \"\" Then";
if ((__ref._ds /*String*/ ).equals("")) { 
RDebugUtils.currentLine=243007490;
 //BA.debugLineNum = 243007490;BA.debugLine="Log(\"VueHTML.SetValue, you need to run VueHTML.S";
__c.Log("VueHTML.SetValue, you need to run VueHTML.SetData first before you set value!");
 };
RDebugUtils.currentLine=243007492;
 //BA.debugLineNum = 243007492;BA.debugLine="Dim valueName As String = $\"row.${l}\"$";
_valuename = ("row."+__c.SmartStringFormatter("",_l)+"");
RDebugUtils.currentLine=243007493;
 //BA.debugLineNum = 243007493;BA.debugLine="Dim txt As String = $\"{{ ${valueName} }}\"$";
_txt = ("{{ "+__c.SmartStringFormatter("",(Object)(_valuename))+" }}");
RDebugUtils.currentLine=243007494;
 //BA.debugLineNum = 243007494;BA.debugLine="SetText(txt)";
__ref._settext /*b4j.example.vuehtml*/ (null,_txt);
RDebugUtils.currentLine=243007495;
 //BA.debugLineNum = 243007495;BA.debugLine="SetAttr(\"v-bind:name\", valueName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-bind:name",_valuename);
RDebugUtils.currentLine=243007496;
 //BA.debugLineNum = 243007496;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243007497;
 //BA.debugLineNum = 243007497;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdraggable(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setdraggable", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setdraggable", new Object[] {_b}));}
RDebugUtils.currentLine=243073024;
 //BA.debugLineNum = 243073024;BA.debugLine="Sub SetDraggable(b As Boolean) As VueHTML";
RDebugUtils.currentLine=243073025;
 //BA.debugLineNum = 243073025;BA.debugLine="SetAttr(\":draggable\",b)";
__ref._setattr /*b4j.example.vuehtml*/ (null,":draggable",BA.ObjectToString(_b));
RDebugUtils.currentLine=243073026;
 //BA.debugLineNum = 243073026;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243073027;
 //BA.debugLineNum = 243073027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdroppable(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setdroppable", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setdroppable", new Object[] {_b}));}
RDebugUtils.currentLine=243138560;
 //BA.debugLineNum = 243138560;BA.debugLine="Sub SetDroppable(b As Boolean) As VueHTML";
RDebugUtils.currentLine=243138561;
 //BA.debugLineNum = 243138561;BA.debugLine="SetAttr(\":droppable\",b)";
__ref._setattr /*b4j.example.vuehtml*/ (null,":droppable",BA.ObjectToString(_b));
RDebugUtils.currentLine=243138562;
 //BA.debugLineNum = 243138562;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243138563;
 //BA.debugLineNum = 243138563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setelementtypeoncondition(b4j.example.vuehtml __ref,boolean _bstatus,String _selementtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setelementtypeoncondition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setelementtypeoncondition", new Object[] {_bstatus,_selementtype}));}
RDebugUtils.currentLine=252903424;
 //BA.debugLineNum = 252903424;BA.debugLine="Sub SetElementTypeOnCondition(bStatus As Boolean,s";
RDebugUtils.currentLine=252903425;
 //BA.debugLineNum = 252903425;BA.debugLine="If bStatus Then";
if (_bstatus) { 
RDebugUtils.currentLine=252903426;
 //BA.debugLineNum = 252903426;BA.debugLine="Tag = sElementType";
__ref._tag /*String*/  = _selementtype;
 };
RDebugUtils.currentLine=252903428;
 //BA.debugLineNum = 252903428;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252903429;
 //BA.debugLineNum = 252903429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setexact(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setexact", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setexact", new Object[] {_b}));}
RDebugUtils.currentLine=243204096;
 //BA.debugLineNum = 243204096;BA.debugLine="Sub SetExact(b As Boolean) As VueHTML";
RDebugUtils.currentLine=243204097;
 //BA.debugLineNum = 243204097;BA.debugLine="If b Then SetAttr(\"exact\", b)";
if (_b) { 
__ref._setattr /*b4j.example.vuehtml*/ (null,"exact",BA.ObjectToString(_b));};
RDebugUtils.currentLine=243204098;
 //BA.debugLineNum = 243204098;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243204099;
 //BA.debugLineNum = 243204099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setinline(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setinline", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setinline", new Object[] {_b}));}
RDebugUtils.currentLine=244121600;
 //BA.debugLineNum = 244121600;BA.debugLine="Sub SetInline(b As Boolean) As VueHTML";
RDebugUtils.currentLine=244121601;
 //BA.debugLineNum = 244121601;BA.debugLine="SetStyleMulti(CreateMap(\"display\":\"inline-flex\",\"";
__ref._setstylemulti /*b4j.example.vuehtml*/ (null,__c.createMap(new Object[] {(Object)("display"),(Object)("inline-flex"),(Object)("margin-right"),(Object)("10px")}));
RDebugUtils.currentLine=244121602;
 //BA.debugLineNum = 244121602;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244121603;
 //BA.debugLineNum = 244121603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setmethodpost(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setmethodpost", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setmethodpost", null));}
RDebugUtils.currentLine=253100032;
 //BA.debugLineNum = 253100032;BA.debugLine="Sub SetMethodPost As VueHTML";
RDebugUtils.currentLine=253100033;
 //BA.debugLineNum = 253100033;BA.debugLine="AddAttribute(\"method\",\"POST\")";
__ref._addattribute /*b4j.example.vuehtml*/ (null,"method",(Object)("POST"));
RDebugUtils.currentLine=253100034;
 //BA.debugLineNum = 253100034;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253100035;
 //BA.debugLineNum = 253100035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonblur(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setonblur", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setonblur", new Object[] {_methodname}));}
RDebugUtils.currentLine=258473984;
 //BA.debugLineNum = 258473984;BA.debugLine="Sub SetOnBlur(methodName As String) As VueHTML";
RDebugUtils.currentLine=258473985;
 //BA.debugLineNum = 258473985;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=258473986;
 //BA.debugLineNum = 258473986;BA.debugLine="SetAttr(\"v-on:blur\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:blur",_methodname);
RDebugUtils.currentLine=258473987;
 //BA.debugLineNum = 258473987;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258473988;
 //BA.debugLineNum = 258473988;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonclick(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setonclick", new Object[] {_methodname}));}
RDebugUtils.currentLine=258539520;
 //BA.debugLineNum = 258539520;BA.debugLine="Sub SetOnClick(methodName As String) As VueHTML";
RDebugUtils.currentLine=258539521;
 //BA.debugLineNum = 258539521;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=258539522;
 //BA.debugLineNum = 258539522;BA.debugLine="SetAttr(\"v-on:click\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:click",_methodname);
RDebugUtils.currentLine=258539523;
 //BA.debugLineNum = 258539523;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258539524;
 //BA.debugLineNum = 258539524;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setondblclick(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setondblclick", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setondblclick", new Object[] {_methodname}));}
RDebugUtils.currentLine=257622016;
 //BA.debugLineNum = 257622016;BA.debugLine="Sub SetOnDblClick(methodName As String) As VueHTML";
RDebugUtils.currentLine=257622017;
 //BA.debugLineNum = 257622017;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=257622018;
 //BA.debugLineNum = 257622018;BA.debugLine="SetAttr(\"v-on:dblclick\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:dblclick",_methodname);
RDebugUtils.currentLine=257622019;
 //BA.debugLineNum = 257622019;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257622020;
 //BA.debugLineNum = 257622020;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonfocus(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setonfocus", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setonfocus", new Object[] {_methodname}));}
RDebugUtils.currentLine=258408448;
 //BA.debugLineNum = 258408448;BA.debugLine="Sub SetOnFocus(methodName As String) As VueHTML";
RDebugUtils.currentLine=258408449;
 //BA.debugLineNum = 258408449;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=258408450;
 //BA.debugLineNum = 258408450;BA.debugLine="SetAttr(\"v-on:focus\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:focus",_methodname);
RDebugUtils.currentLine=258408451;
 //BA.debugLineNum = 258408451;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258408452;
 //BA.debugLineNum = 258408452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setoninput(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setoninput", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setoninput", new Object[] {_methodname}));}
RDebugUtils.currentLine=258342912;
 //BA.debugLineNum = 258342912;BA.debugLine="Sub SetOnInput(methodName As String) As VueHTML";
RDebugUtils.currentLine=258342913;
 //BA.debugLineNum = 258342913;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=258342914;
 //BA.debugLineNum = 258342914;BA.debugLine="SetAttr(\"v-on:input\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:input",_methodname);
RDebugUtils.currentLine=258342915;
 //BA.debugLineNum = 258342915;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258342916;
 //BA.debugLineNum = 258342916;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonkeydown(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setonkeydown", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setonkeydown", new Object[] {_methodname}));}
RDebugUtils.currentLine=258211840;
 //BA.debugLineNum = 258211840;BA.debugLine="Sub SetOnKeyDown(methodName As String) As VueHTML";
RDebugUtils.currentLine=258211841;
 //BA.debugLineNum = 258211841;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=258211842;
 //BA.debugLineNum = 258211842;BA.debugLine="SetAttr(\"v-on:keydown\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:keydown",_methodname);
RDebugUtils.currentLine=258211843;
 //BA.debugLineNum = 258211843;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258211844;
 //BA.debugLineNum = 258211844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonkeyup(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setonkeyup", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setonkeyup", new Object[] {_methodname}));}
RDebugUtils.currentLine=258277376;
 //BA.debugLineNum = 258277376;BA.debugLine="Sub SetOnKeyUp(methodName As String) As VueHTML";
RDebugUtils.currentLine=258277377;
 //BA.debugLineNum = 258277377;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=258277378;
 //BA.debugLineNum = 258277378;BA.debugLine="SetAttr(\"v-on:keyup\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:keyup",_methodname);
RDebugUtils.currentLine=258277379;
 //BA.debugLineNum = 258277379;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258277380;
 //BA.debugLineNum = 258277380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonmouseout(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setonmouseout", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setonmouseout", new Object[] {_methodname}));}
RDebugUtils.currentLine=241958912;
 //BA.debugLineNum = 241958912;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VueHTML";
RDebugUtils.currentLine=241958913;
 //BA.debugLineNum = 241958913;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=241958914;
 //BA.debugLineNum = 241958914;BA.debugLine="SetAttr(\"v-on:mouseout\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:mouseout",_methodname);
RDebugUtils.currentLine=241958915;
 //BA.debugLineNum = 241958915;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=241958916;
 //BA.debugLineNum = 241958916;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonmouseover(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setonmouseover", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setonmouseover", new Object[] {_methodname}));}
RDebugUtils.currentLine=242024448;
 //BA.debugLineNum = 242024448;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VueHTM";
RDebugUtils.currentLine=242024449;
 //BA.debugLineNum = 242024449;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=242024450;
 //BA.debugLineNum = 242024450;BA.debugLine="SetAttr(\"v-on:mouseover\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:mouseover",_methodname);
RDebugUtils.currentLine=242024451;
 //BA.debugLineNum = 242024451;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242024452;
 //BA.debugLineNum = 242024452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonsubmit(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setonsubmit", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setonsubmit", new Object[] {_methodname}));}
RDebugUtils.currentLine=258146304;
 //BA.debugLineNum = 258146304;BA.debugLine="Sub SetOnSubmit(methodName As String) As VueHTML";
RDebugUtils.currentLine=258146305;
 //BA.debugLineNum = 258146305;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=258146306;
 //BA.debugLineNum = 258146306;BA.debugLine="SetAttr(\"v-on:submit\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:submit",_methodname);
RDebugUtils.currentLine=258146307;
 //BA.debugLineNum = 258146307;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258146308;
 //BA.debugLineNum = 258146308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setontouchstart(b4j.example.vuehtml __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setontouchstart", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setontouchstart", new Object[] {_methodname}));}
RDebugUtils.currentLine=258605056;
 //BA.debugLineNum = 258605056;BA.debugLine="Sub SetOnTouchStart(methodName As String) As VueHT";
RDebugUtils.currentLine=258605057;
 //BA.debugLineNum = 258605057;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=258605058;
 //BA.debugLineNum = 258605058;BA.debugLine="SetAttr(\"v-on:touchstart\", methodName)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:touchstart",_methodname);
RDebugUtils.currentLine=258605059;
 //BA.debugLineNum = 258605059;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258605060;
 //BA.debugLineNum = 258605060;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setpadding(b4j.example.vuehtml __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=242548736;
 //BA.debugLineNum = 242548736;BA.debugLine="Sub SetPadding(p As Object) As VueHTML";
RDebugUtils.currentLine=242548737;
 //BA.debugLineNum = 242548737;BA.debugLine="SetStyleMulti(CreateMap(\"padding\":p))";
__ref._setstylemulti /*b4j.example.vuehtml*/ (null,__c.createMap(new Object[] {(Object)("padding"),_p}));
RDebugUtils.currentLine=242548738;
 //BA.debugLineNum = 242548738;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242548739;
 //BA.debugLineNum = 242548739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setprefix(b4j.example.vuehtml __ref,String _sprefix) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setprefix", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setprefix", new Object[] {_sprefix}));}
RDebugUtils.currentLine=255590400;
 //BA.debugLineNum = 255590400;BA.debugLine="Sub SetPrefix(sPrefix As String) As VueHTML";
RDebugUtils.currentLine=255590401;
 //BA.debugLineNum = 255590401;BA.debugLine="Prefix = sPrefix";
__ref._prefix /*String*/  = _sprefix;
RDebugUtils.currentLine=255590402;
 //BA.debugLineNum = 255590402;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=255590403;
 //BA.debugLineNum = 255590403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setref(b4j.example.vuehtml __ref,String _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setref", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setref", new Object[] {_r}));}
RDebugUtils.currentLine=242876416;
 //BA.debugLineNum = 242876416;BA.debugLine="Sub SetRef(r As String) As VueHTML";
RDebugUtils.currentLine=242876417;
 //BA.debugLineNum = 242876417;BA.debugLine="If r = \"\" Then Return Me";
if ((_r).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
RDebugUtils.currentLine=242876418;
 //BA.debugLineNum = 242876418;BA.debugLine="SetAttr(\"ref\", r)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"ref",_r);
RDebugUtils.currentLine=242876419;
 //BA.debugLineNum = 242876419;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242876420;
 //BA.debugLineNum = 242876420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setslot(b4j.example.vuehtml __ref,Object _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setslot", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setslot", new Object[] {_s}));}
RDebugUtils.currentLine=244514816;
 //BA.debugLineNum = 244514816;BA.debugLine="Sub SetSlot(s As Object) As VueHTML";
RDebugUtils.currentLine=244514817;
 //BA.debugLineNum = 244514817;BA.debugLine="SetAttr(\"slot\", s)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"slot",BA.ObjectToString(_s));
RDebugUtils.currentLine=244514818;
 //BA.debugLineNum = 244514818;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244514819;
 //BA.debugLineNum = 244514819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setspan(b4j.example.vuehtml __ref,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setspan", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setspan", new Object[] {_stext}));}
b4j.example.vuehtml _s = null;
RDebugUtils.currentLine=244449280;
 //BA.debugLineNum = 244449280;BA.debugLine="Sub SetSpan(sText As String) As VueHTML";
RDebugUtils.currentLine=244449281;
 //BA.debugLineNum = 244449281;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
RDebugUtils.currentLine=244449282;
 //BA.debugLineNum = 244449282;BA.debugLine="s = CreateSpan(\"\").SetText(sText)";
_s = __ref._createspan /*b4j.example.vuehtml*/ (null,"")._settext /*b4j.example.vuehtml*/ (null,_stext);
RDebugUtils.currentLine=244449283;
 //BA.debugLineNum = 244449283;BA.debugLine="AddElement(s)";
__ref._addelement /*b4j.example.vuehtml*/ (null,_s);
RDebugUtils.currentLine=244449284;
 //BA.debugLineNum = 244449284;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244449285;
 //BA.debugLineNum = 244449285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstateonclick(b4j.example.vuehtml __ref,Object _ns) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstateonclick", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstateonclick", new Object[] {_ns}));}
RDebugUtils.currentLine=244580352;
 //BA.debugLineNum = 244580352;BA.debugLine="Sub SetStateOnClick(ns As Object) As VueHTML";
RDebugUtils.currentLine=244580353;
 //BA.debugLineNum = 244580353;BA.debugLine="SetAttr(\"v-on:click\", ns)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on:click",BA.ObjectToString(_ns));
RDebugUtils.currentLine=244580354;
 //BA.debugLineNum = 244580354;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244580355;
 //BA.debugLineNum = 244580355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundattachment(b4j.example.vuehtml __ref,String _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebackgroundattachment", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebackgroundattachment", new Object[] {_r}));}
RDebugUtils.currentLine=250019840;
 //BA.debugLineNum = 250019840;BA.debugLine="Sub SetStyleBackgroundAttachment(r As String) As V";
RDebugUtils.currentLine=250019841;
 //BA.debugLineNum = 250019841;BA.debugLine="SetStyle(\"background-attachment\", r)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"background-attachment",_r);
RDebugUtils.currentLine=250019842;
 //BA.debugLineNum = 250019842;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250019843;
 //BA.debugLineNum = 250019843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundclip(b4j.example.vuehtml __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebackgroundclip", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebackgroundclip", new Object[] {_c}));}
RDebugUtils.currentLine=246415360;
 //BA.debugLineNum = 246415360;BA.debugLine="Sub SetStyleBackgroundClip(c As Object) As VueHTML";
RDebugUtils.currentLine=246415361;
 //BA.debugLineNum = 246415361;BA.debugLine="SetStyle(\"background-clip\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"background-clip",BA.ObjectToString(_c));
RDebugUtils.currentLine=246415362;
 //BA.debugLineNum = 246415362;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246415363;
 //BA.debugLineNum = 246415363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundcolor(b4j.example.vuehtml __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebackgroundcolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebackgroundcolor", new Object[] {_c}));}
RDebugUtils.currentLine=246349824;
 //BA.debugLineNum = 246349824;BA.debugLine="Sub SetStyleBackgroundColor(c As Object) As VueHTM";
RDebugUtils.currentLine=246349825;
 //BA.debugLineNum = 246349825;BA.debugLine="SetStyle(\"background-color\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"background-color",BA.ObjectToString(_c));
RDebugUtils.currentLine=246349826;
 //BA.debugLineNum = 246349826;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246349827;
 //BA.debugLineNum = 246349827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundimage(b4j.example.vuehtml __ref,String _imgurl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebackgroundimage", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebackgroundimage", new Object[] {_imgurl}));}
RDebugUtils.currentLine=249823232;
 //BA.debugLineNum = 249823232;BA.debugLine="Sub SetStyleBackgroundImage(imgURL As String) As V";
RDebugUtils.currentLine=249823233;
 //BA.debugLineNum = 249823233;BA.debugLine="SetStyle(\"background-image\", $\"url('${imgURL}')\"$";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"background-image",("url('"+__c.SmartStringFormatter("",(Object)(_imgurl))+"')"));
RDebugUtils.currentLine=249823234;
 //BA.debugLineNum = 249823234;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249823235;
 //BA.debugLineNum = 249823235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundorigin(b4j.example.vuehtml __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebackgroundorigin", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebackgroundorigin", new Object[] {_c}));}
RDebugUtils.currentLine=246480896;
 //BA.debugLineNum = 246480896;BA.debugLine="Sub SetStyleBackgroundOrigin(c As Object) As VueHT";
RDebugUtils.currentLine=246480897;
 //BA.debugLineNum = 246480897;BA.debugLine="SetStyle(\"background-origin\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"background-origin",BA.ObjectToString(_c));
RDebugUtils.currentLine=246480898;
 //BA.debugLineNum = 246480898;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246480899;
 //BA.debugLineNum = 246480899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundposition(b4j.example.vuehtml __ref,String _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebackgroundposition", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebackgroundposition", new Object[] {_r}));}
RDebugUtils.currentLine=250085376;
 //BA.debugLineNum = 250085376;BA.debugLine="Sub SetStyleBackgroundPosition(r As String) As Vue";
RDebugUtils.currentLine=250085377;
 //BA.debugLineNum = 250085377;BA.debugLine="SetStyle(\"background-position\", r)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"background-position",_r);
RDebugUtils.currentLine=250085378;
 //BA.debugLineNum = 250085378;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250085379;
 //BA.debugLineNum = 250085379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundrepeat(b4j.example.vuehtml __ref,String _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebackgroundrepeat", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebackgroundrepeat", new Object[] {_r}));}
RDebugUtils.currentLine=249888768;
 //BA.debugLineNum = 249888768;BA.debugLine="Sub SetStyleBackgroundRepeat(r As String) As VueHT";
RDebugUtils.currentLine=249888769;
 //BA.debugLineNum = 249888769;BA.debugLine="SetStyle(\"background-repeat\", r)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"background-repeat",_r);
RDebugUtils.currentLine=249888770;
 //BA.debugLineNum = 249888770;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249888771;
 //BA.debugLineNum = 249888771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundsize(b4j.example.vuehtml __ref,String _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebackgroundsize", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebackgroundsize", new Object[] {_r}));}
RDebugUtils.currentLine=249954304;
 //BA.debugLineNum = 249954304;BA.debugLine="Sub SetStyleBackgroundSize(r As String) As VueHTML";
RDebugUtils.currentLine=249954305;
 //BA.debugLineNum = 249954305;BA.debugLine="SetStyle(\"background-size\", r)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"background-size",_r);
RDebugUtils.currentLine=249954306;
 //BA.debugLineNum = 249954306;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249954307;
 //BA.debugLineNum = 249954307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomcolor(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderbottomcolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderbottomcolor", new Object[] {_c}));}
RDebugUtils.currentLine=248119296;
 //BA.debugLineNum = 248119296;BA.debugLine="Sub SetStyleBorderBottomColor(c As String) As VueH";
RDebugUtils.currentLine=248119297;
 //BA.debugLineNum = 248119297;BA.debugLine="SetStyle(\"border-bottom-color\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-bottom-color",_c);
RDebugUtils.currentLine=248119298;
 //BA.debugLineNum = 248119298;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248119299;
 //BA.debugLineNum = 248119299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomleftradius(b4j.example.vuehtml __ref,String _bottomleft) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderbottomleftradius", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderbottomleftradius", new Object[] {_bottomleft}));}
RDebugUtils.currentLine=246743040;
 //BA.debugLineNum = 246743040;BA.debugLine="Sub SetStyleBorderBottomLeftRadius(bottomLeft As S";
RDebugUtils.currentLine=246743041;
 //BA.debugLineNum = 246743041;BA.debugLine="bottomLeft = MakePx(bottomLeft)";
_bottomleft = __ref._makepx /*String*/ (null,_bottomleft);
RDebugUtils.currentLine=246743042;
 //BA.debugLineNum = 246743042;BA.debugLine="SetStyle(\"border-bottom-left-radius\", bottomLeft)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-bottom-left-radius",_bottomleft);
RDebugUtils.currentLine=246743043;
 //BA.debugLineNum = 246743043;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246743044;
 //BA.debugLineNum = 246743044;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomrightradius(b4j.example.vuehtml __ref,String _bottomright) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderbottomrightradius", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderbottomrightradius", new Object[] {_bottomright}));}
RDebugUtils.currentLine=246808576;
 //BA.debugLineNum = 246808576;BA.debugLine="Sub SetStyleBorderBottomRightRadius(bottomRight As";
RDebugUtils.currentLine=246808577;
 //BA.debugLineNum = 246808577;BA.debugLine="bottomRight = MakePx(bottomRight)";
_bottomright = __ref._makepx /*String*/ (null,_bottomright);
RDebugUtils.currentLine=246808578;
 //BA.debugLineNum = 246808578;BA.debugLine="SetStyle(\"border-bottom-right-radius\", bottomRigh";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-bottom-right-radius",_bottomright);
RDebugUtils.currentLine=246808579;
 //BA.debugLineNum = 246808579;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246808580;
 //BA.debugLineNum = 246808580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomstyle(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderbottomstyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderbottomstyle", new Object[] {_c}));}
RDebugUtils.currentLine=248315904;
 //BA.debugLineNum = 248315904;BA.debugLine="Sub SetStyleBorderBottomStyle(c As String) As VueH";
RDebugUtils.currentLine=248315905;
 //BA.debugLineNum = 248315905;BA.debugLine="SetStyle(\"border-bottom-style\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-bottom-style",_c);
RDebugUtils.currentLine=248315906;
 //BA.debugLineNum = 248315906;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248315907;
 //BA.debugLineNum = 248315907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomwidth(b4j.example.vuehtml __ref,String _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderbottomwidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderbottomwidth", new Object[] {_b}));}
RDebugUtils.currentLine=247726080;
 //BA.debugLineNum = 247726080;BA.debugLine="Sub SetStyleBorderBottomWidth(b As String) As VueH";
RDebugUtils.currentLine=247726081;
 //BA.debugLineNum = 247726081;BA.debugLine="SetStyle(\"border-bottom-width\",MakePx(b))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-bottom-width",__ref._makepx /*String*/ (null,_b));
RDebugUtils.currentLine=247726082;
 //BA.debugLineNum = 247726082;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247726083;
 //BA.debugLineNum = 247726083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordercolor(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebordercolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebordercolor", new Object[] {_c}));}
RDebugUtils.currentLine=247857152;
 //BA.debugLineNum = 247857152;BA.debugLine="Sub SetStyleBorderColor(c As String) As VueHTML";
RDebugUtils.currentLine=247857153;
 //BA.debugLineNum = 247857153;BA.debugLine="SetStyle(\"border-color\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-color",_c);
RDebugUtils.currentLine=247857154;
 //BA.debugLineNum = 247857154;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247857155;
 //BA.debugLineNum = 247857155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderleftcolor(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderleftcolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderleftcolor", new Object[] {_c}));}
RDebugUtils.currentLine=247922688;
 //BA.debugLineNum = 247922688;BA.debugLine="Sub SetStyleBorderLeftColor(c As String) As VueHTM";
RDebugUtils.currentLine=247922689;
 //BA.debugLineNum = 247922689;BA.debugLine="SetStyle(\"border-left-color\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-left-color",_c);
RDebugUtils.currentLine=247922690;
 //BA.debugLineNum = 247922690;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247922691;
 //BA.debugLineNum = 247922691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderleftstyle(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderleftstyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderleftstyle", new Object[] {_c}));}
RDebugUtils.currentLine=248184832;
 //BA.debugLineNum = 248184832;BA.debugLine="Sub SetStyleBorderLeftStyle(c As String) As VueHTM";
RDebugUtils.currentLine=248184833;
 //BA.debugLineNum = 248184833;BA.debugLine="SetStyle(\"border-left-style\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-left-style",_c);
RDebugUtils.currentLine=248184834;
 //BA.debugLineNum = 248184834;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248184835;
 //BA.debugLineNum = 248184835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderleftwidth(b4j.example.vuehtml __ref,String _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderleftwidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderleftwidth", new Object[] {_b}));}
RDebugUtils.currentLine=247595008;
 //BA.debugLineNum = 247595008;BA.debugLine="Sub SetStyleBorderLeftWidth(b As String) As VueHTM";
RDebugUtils.currentLine=247595009;
 //BA.debugLineNum = 247595009;BA.debugLine="SetStyle(\"border-left-width\",MakePx(b))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-left-width",__ref._makepx /*String*/ (null,_b));
RDebugUtils.currentLine=247595010;
 //BA.debugLineNum = 247595010;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247595011;
 //BA.debugLineNum = 247595011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderradius(b4j.example.vuehtml __ref,String _topleft,String _topright,String _bottomleft,String _bottomright) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderradius", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderradius", new Object[] {_topleft,_topright,_bottomleft,_bottomright}));}
anywheresoftware.b4a.objects.collections.List _br = null;
String _sbr = "";
RDebugUtils.currentLine=246546432;
 //BA.debugLineNum = 246546432;BA.debugLine="Sub SetStyleBorderRadius(topLeft As String, topRig";
RDebugUtils.currentLine=246546433;
 //BA.debugLineNum = 246546433;BA.debugLine="Dim br As List";
_br = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=246546434;
 //BA.debugLineNum = 246546434;BA.debugLine="br.Initialize";
_br.Initialize();
RDebugUtils.currentLine=246546435;
 //BA.debugLineNum = 246546435;BA.debugLine="br.Add(MakePx(topLeft))";
_br.Add((Object)(__ref._makepx /*String*/ (null,_topleft)));
RDebugUtils.currentLine=246546436;
 //BA.debugLineNum = 246546436;BA.debugLine="br.Add(MakePx(topRight))";
_br.Add((Object)(__ref._makepx /*String*/ (null,_topright)));
RDebugUtils.currentLine=246546437;
 //BA.debugLineNum = 246546437;BA.debugLine="br.Add(MakePx(bottomLeft))";
_br.Add((Object)(__ref._makepx /*String*/ (null,_bottomleft)));
RDebugUtils.currentLine=246546438;
 //BA.debugLineNum = 246546438;BA.debugLine="br.Add(MakePx(bottomRight))";
_br.Add((Object)(__ref._makepx /*String*/ (null,_bottomright)));
RDebugUtils.currentLine=246546440;
 //BA.debugLineNum = 246546440;BA.debugLine="Dim sbr As String = Join(\" \", br)";
_sbr = __ref._join /*String*/ (null," ",_br);
RDebugUtils.currentLine=246546441;
 //BA.debugLineNum = 246546441;BA.debugLine="SetStyle(\"border-radius\", sbr)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-radius",_sbr);
RDebugUtils.currentLine=246546442;
 //BA.debugLineNum = 246546442;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246546443;
 //BA.debugLineNum = 246546443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderrightcolor(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderrightcolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderrightcolor", new Object[] {_c}));}
RDebugUtils.currentLine=247988224;
 //BA.debugLineNum = 247988224;BA.debugLine="Sub SetStyleBorderRightColor(c As String) As VueHT";
RDebugUtils.currentLine=247988225;
 //BA.debugLineNum = 247988225;BA.debugLine="SetStyle(\"border-right-color\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-right-color",_c);
RDebugUtils.currentLine=247988226;
 //BA.debugLineNum = 247988226;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247988227;
 //BA.debugLineNum = 247988227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderrightstyle(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderrightstyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderrightstyle", new Object[] {_c}));}
RDebugUtils.currentLine=248250368;
 //BA.debugLineNum = 248250368;BA.debugLine="Sub SetStyleBorderRightStyle(c As String) As VueHT";
RDebugUtils.currentLine=248250369;
 //BA.debugLineNum = 248250369;BA.debugLine="SetStyle(\"border-right-style\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-right-style",_c);
RDebugUtils.currentLine=248250370;
 //BA.debugLineNum = 248250370;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248250371;
 //BA.debugLineNum = 248250371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderrightwidth(b4j.example.vuehtml __ref,String _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderrightwidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderrightwidth", new Object[] {_b}));}
RDebugUtils.currentLine=247660544;
 //BA.debugLineNum = 247660544;BA.debugLine="Sub SetStyleBorderRightWidth(b As String) As VueHT";
RDebugUtils.currentLine=247660545;
 //BA.debugLineNum = 247660545;BA.debugLine="SetStyle(\"border-right-width\",MakePx(b))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-right-width",__ref._makepx /*String*/ (null,_b));
RDebugUtils.currentLine=247660546;
 //BA.debugLineNum = 247660546;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247660547;
 //BA.debugLineNum = 247660547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyle(b4j.example.vuehtml __ref,Object _bs) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstyle", new Object[] {_bs}));}
RDebugUtils.currentLine=247201792;
 //BA.debugLineNum = 247201792;BA.debugLine="Sub SetStyleBorderStyle(bs As Object) As VueHTML";
RDebugUtils.currentLine=247201793;
 //BA.debugLineNum = 247201793;BA.debugLine="SetStyle(\"border-style\",bs)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style",BA.ObjectToString(_bs));
RDebugUtils.currentLine=247201794;
 //BA.debugLineNum = 247201794;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247201795;
 //BA.debugLineNum = 247201795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyledashed(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstyledashed", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstyledashed", new Object[] {_b}));}
RDebugUtils.currentLine=247332864;
 //BA.debugLineNum = 247332864;BA.debugLine="Sub SetStyleBorderStyleDashed(b As Boolean) As Vue";
RDebugUtils.currentLine=247332865;
 //BA.debugLineNum = 247332865;BA.debugLine="SetStyle(\"border-style\",\"dashed\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","dashed");
RDebugUtils.currentLine=247332866;
 //BA.debugLineNum = 247332866;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247332867;
 //BA.debugLineNum = 247332867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyledotted(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstyledotted", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstyledotted", new Object[] {_b}));}
RDebugUtils.currentLine=247267328;
 //BA.debugLineNum = 247267328;BA.debugLine="Sub SetStyleBorderStyleDotted(b As Boolean) As Vue";
RDebugUtils.currentLine=247267329;
 //BA.debugLineNum = 247267329;BA.debugLine="SetStyle(\"border-style\",\"dotted\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","dotted");
RDebugUtils.currentLine=247267330;
 //BA.debugLineNum = 247267330;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247267331;
 //BA.debugLineNum = 247267331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyledouble(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstyledouble", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstyledouble", new Object[] {_b}));}
RDebugUtils.currentLine=247463936;
 //BA.debugLineNum = 247463936;BA.debugLine="Sub SetStyleBorderStyleDouble(b As Boolean) As Vue";
RDebugUtils.currentLine=247463937;
 //BA.debugLineNum = 247463937;BA.debugLine="SetStyle(\"border-style\",\"double\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","double");
RDebugUtils.currentLine=247463938;
 //BA.debugLineNum = 247463938;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247463939;
 //BA.debugLineNum = 247463939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstylegroove(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstylegroove", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstylegroove", new Object[] {_b}));}
RDebugUtils.currentLine=248446976;
 //BA.debugLineNum = 248446976;BA.debugLine="Sub SetStyleBorderStyleGroove(b As Boolean) As Vue";
RDebugUtils.currentLine=248446977;
 //BA.debugLineNum = 248446977;BA.debugLine="SetStyle(\"border-style\",\"groove\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","groove");
RDebugUtils.currentLine=248446978;
 //BA.debugLineNum = 248446978;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248446979;
 //BA.debugLineNum = 248446979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstylehidden(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstylehidden", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstylehidden", new Object[] {_b}));}
RDebugUtils.currentLine=248774656;
 //BA.debugLineNum = 248774656;BA.debugLine="Sub SetStyleBorderStyleHidden(b As Boolean) As Vue";
RDebugUtils.currentLine=248774657;
 //BA.debugLineNum = 248774657;BA.debugLine="SetStyle(\"border-style\",\"hidden\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","hidden");
RDebugUtils.currentLine=248774658;
 //BA.debugLineNum = 248774658;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248774659;
 //BA.debugLineNum = 248774659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyleinset(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstyleinset", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstyleinset", new Object[] {_b}));}
RDebugUtils.currentLine=248578048;
 //BA.debugLineNum = 248578048;BA.debugLine="Sub SetStyleBorderStyleInset(b As Boolean) As VueH";
RDebugUtils.currentLine=248578049;
 //BA.debugLineNum = 248578049;BA.debugLine="SetStyle(\"border-style\",\"inset\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","inset");
RDebugUtils.currentLine=248578050;
 //BA.debugLineNum = 248578050;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248578051;
 //BA.debugLineNum = 248578051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstylenone(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstylenone", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstylenone", new Object[] {_b}));}
RDebugUtils.currentLine=248709120;
 //BA.debugLineNum = 248709120;BA.debugLine="Sub SetStyleBorderStyleNone(b As Boolean) As VueHT";
RDebugUtils.currentLine=248709121;
 //BA.debugLineNum = 248709121;BA.debugLine="SetStyle(\"border-style\",\"none\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","none");
RDebugUtils.currentLine=248709122;
 //BA.debugLineNum = 248709122;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248709123;
 //BA.debugLineNum = 248709123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyleoutset(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstyleoutset", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstyleoutset", new Object[] {_b}));}
RDebugUtils.currentLine=248643584;
 //BA.debugLineNum = 248643584;BA.debugLine="Sub SetStyleBorderStyleOutset(b As Boolean) As Vue";
RDebugUtils.currentLine=248643585;
 //BA.debugLineNum = 248643585;BA.debugLine="SetStyle(\"border-style\",\"outset\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","outset");
RDebugUtils.currentLine=248643586;
 //BA.debugLineNum = 248643586;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248643587;
 //BA.debugLineNum = 248643587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyleridge(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstyleridge", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstyleridge", new Object[] {_b}));}
RDebugUtils.currentLine=248512512;
 //BA.debugLineNum = 248512512;BA.debugLine="Sub SetStyleBorderStyleRidge(b As Boolean) As VueH";
RDebugUtils.currentLine=248512513;
 //BA.debugLineNum = 248512513;BA.debugLine="SetStyle(\"border-style\",\"ridge\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","ridge");
RDebugUtils.currentLine=248512514;
 //BA.debugLineNum = 248512514;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248512515;
 //BA.debugLineNum = 248512515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstylesolid(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderstylesolid", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderstylesolid", new Object[] {_b}));}
RDebugUtils.currentLine=247398400;
 //BA.debugLineNum = 247398400;BA.debugLine="Sub SetStyleBorderStyleSolid(b As Boolean) As VueH";
RDebugUtils.currentLine=247398401;
 //BA.debugLineNum = 247398401;BA.debugLine="SetStyle(\"border-style\",\"solid\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-style","solid");
RDebugUtils.currentLine=247398402;
 //BA.debugLineNum = 247398402;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247398403;
 //BA.debugLineNum = 247398403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertopcolor(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebordertopcolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebordertopcolor", new Object[] {_c}));}
RDebugUtils.currentLine=248053760;
 //BA.debugLineNum = 248053760;BA.debugLine="Sub SetStyleBorderTopColor(c As String) As VueHTML";
RDebugUtils.currentLine=248053761;
 //BA.debugLineNum = 248053761;BA.debugLine="SetStyle(\"border-top-color\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-top-color",_c);
RDebugUtils.currentLine=248053762;
 //BA.debugLineNum = 248053762;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248053763;
 //BA.debugLineNum = 248053763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertopleftradius(b4j.example.vuehtml __ref,String _topleft) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebordertopleftradius", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebordertopleftradius", new Object[] {_topleft}));}
RDebugUtils.currentLine=246611968;
 //BA.debugLineNum = 246611968;BA.debugLine="Sub SetStyleBorderTopLeftRadius(topLeft As String)";
RDebugUtils.currentLine=246611969;
 //BA.debugLineNum = 246611969;BA.debugLine="topLeft = MakePx(topLeft)";
_topleft = __ref._makepx /*String*/ (null,_topleft);
RDebugUtils.currentLine=246611970;
 //BA.debugLineNum = 246611970;BA.debugLine="SetStyle(\"border-top-left-radius\", topLeft)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-top-left-radius",_topleft);
RDebugUtils.currentLine=246611971;
 //BA.debugLineNum = 246611971;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246611972;
 //BA.debugLineNum = 246611972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertoprightradius(b4j.example.vuehtml __ref,String _topright) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebordertoprightradius", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebordertoprightradius", new Object[] {_topright}));}
RDebugUtils.currentLine=246677504;
 //BA.debugLineNum = 246677504;BA.debugLine="Sub SetStyleBorderTopRightRadius(topRight As Strin";
RDebugUtils.currentLine=246677505;
 //BA.debugLineNum = 246677505;BA.debugLine="topRight = MakePx(topRight)";
_topright = __ref._makepx /*String*/ (null,_topright);
RDebugUtils.currentLine=246677506;
 //BA.debugLineNum = 246677506;BA.debugLine="SetStyle(\"border-top-right-radius\", topRight)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-top-right-radius",_topright);
RDebugUtils.currentLine=246677507;
 //BA.debugLineNum = 246677507;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246677508;
 //BA.debugLineNum = 246677508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertopstyle(b4j.example.vuehtml __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebordertopstyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebordertopstyle", new Object[] {_c}));}
RDebugUtils.currentLine=248381440;
 //BA.debugLineNum = 248381440;BA.debugLine="Sub SetStyleBorderTopStyle(c As String) As VueHTML";
RDebugUtils.currentLine=248381441;
 //BA.debugLineNum = 248381441;BA.debugLine="SetStyle(\"border-top-style\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-top-style",_c);
RDebugUtils.currentLine=248381442;
 //BA.debugLineNum = 248381442;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248381443;
 //BA.debugLineNum = 248381443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertopwidth(b4j.example.vuehtml __ref,String _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylebordertopwidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylebordertopwidth", new Object[] {_b}));}
RDebugUtils.currentLine=247791616;
 //BA.debugLineNum = 247791616;BA.debugLine="Sub SetStyleBorderTopWidth(b As String) As VueHTML";
RDebugUtils.currentLine=247791617;
 //BA.debugLineNum = 247791617;BA.debugLine="SetStyle(\"border-top-width\",MakePx(b))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-top-width",__ref._makepx /*String*/ (null,_b));
RDebugUtils.currentLine=247791618;
 //BA.debugLineNum = 247791618;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247791619;
 //BA.debugLineNum = 247791619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderwidth(b4j.example.vuehtml __ref,String _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleborderwidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleborderwidth", new Object[] {_b}));}
RDebugUtils.currentLine=247529472;
 //BA.debugLineNum = 247529472;BA.debugLine="Sub SetStyleBorderWidth(b As String) As VueHTML";
RDebugUtils.currentLine=247529473;
 //BA.debugLineNum = 247529473;BA.debugLine="SetStyle(\"border-width\",MakePx(b))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"border-width",__ref._makepx /*String*/ (null,_b));
RDebugUtils.currentLine=247529474;
 //BA.debugLineNum = 247529474;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247529475;
 //BA.debugLineNum = 247529475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylecolor(b4j.example.vuehtml __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylecolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylecolor", new Object[] {_c}));}
RDebugUtils.currentLine=246874112;
 //BA.debugLineNum = 246874112;BA.debugLine="Sub SetStyleColor(c As Object) As VueHTML";
RDebugUtils.currentLine=246874113;
 //BA.debugLineNum = 246874113;BA.debugLine="SetStyle(\"color\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"color",BA.ObjectToString(_c));
RDebugUtils.currentLine=246874114;
 //BA.debugLineNum = 246874114;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246874115;
 //BA.debugLineNum = 246874115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyledirection(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyledirection", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyledirection", new Object[] {_f}));}
RDebugUtils.currentLine=246153216;
 //BA.debugLineNum = 246153216;BA.debugLine="Sub SetStyleDirection(f As Object) As VueHTML   'i";
RDebugUtils.currentLine=246153217;
 //BA.debugLineNum = 246153217;BA.debugLine="SetStyle(\"direction\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"direction",BA.ObjectToString(_f));
RDebugUtils.currentLine=246153218;
 //BA.debugLineNum = 246153218;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246153219;
 //BA.debugLineNum = 246153219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontfamily(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylefontfamily", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylefontfamily", new Object[] {_f}));}
RDebugUtils.currentLine=245104640;
 //BA.debugLineNum = 245104640;BA.debugLine="Sub SetStyleFontFamily(f As Object) As VueHTML   '";
RDebugUtils.currentLine=245104641;
 //BA.debugLineNum = 245104641;BA.debugLine="SetStyle(\"font-family\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"font-family",BA.ObjectToString(_f));
RDebugUtils.currentLine=245104642;
 //BA.debugLineNum = 245104642;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245104643;
 //BA.debugLineNum = 245104643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontsize(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylefontsize", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylefontsize", new Object[] {_f}));}
RDebugUtils.currentLine=245497856;
 //BA.debugLineNum = 245497856;BA.debugLine="Sub SetStyleFontSize(f As Object) As VueHTML   'ig";
RDebugUtils.currentLine=245497857;
 //BA.debugLineNum = 245497857;BA.debugLine="SetStyle(\"font-size\", MakePx(f))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"font-size",__ref._makepx /*String*/ (null,BA.ObjectToString(_f)));
RDebugUtils.currentLine=245497858;
 //BA.debugLineNum = 245497858;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245497859;
 //BA.debugLineNum = 245497859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontstyle(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylefontstyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylefontstyle", new Object[] {_f}));}
RDebugUtils.currentLine=245432320;
 //BA.debugLineNum = 245432320;BA.debugLine="Sub SetStyleFontStyle(f As Object) As VueHTML   'i";
RDebugUtils.currentLine=245432321;
 //BA.debugLineNum = 245432321;BA.debugLine="SetStyle(\"font-style\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"font-style",BA.ObjectToString(_f));
RDebugUtils.currentLine=245432322;
 //BA.debugLineNum = 245432322;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245432323;
 //BA.debugLineNum = 245432323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontvariant(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylefontvariant", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylefontvariant", new Object[] {_f}));}
RDebugUtils.currentLine=245301248;
 //BA.debugLineNum = 245301248;BA.debugLine="Sub SetStyleFontVariant(f As Object) As VueHTML";
RDebugUtils.currentLine=245301249;
 //BA.debugLineNum = 245301249;BA.debugLine="SetStyle(\"font-variant\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"font-variant",BA.ObjectToString(_f));
RDebugUtils.currentLine=245301250;
 //BA.debugLineNum = 245301250;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245301251;
 //BA.debugLineNum = 245301251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontweight(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylefontweight", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylefontweight", new Object[] {_f}));}
RDebugUtils.currentLine=245170176;
 //BA.debugLineNum = 245170176;BA.debugLine="Sub SetStyleFontWeight(f As Object) As VueHTML   '";
RDebugUtils.currentLine=245170177;
 //BA.debugLineNum = 245170177;BA.debugLine="SetStyle(\"font-weight\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"font-weight",BA.ObjectToString(_f));
RDebugUtils.currentLine=245170178;
 //BA.debugLineNum = 245170178;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245170179;
 //BA.debugLineNum = 245170179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontweightbold(b4j.example.vuehtml __ref,boolean _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylefontweightbold", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylefontweightbold", new Object[] {_f}));}
RDebugUtils.currentLine=245235712;
 //BA.debugLineNum = 245235712;BA.debugLine="Sub SetStyleFontWeightBold(f As Boolean) As VueHTM";
RDebugUtils.currentLine=245235713;
 //BA.debugLineNum = 245235713;BA.debugLine="SetStyle(\"font-weight\", \"bold\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"font-weight","bold");
RDebugUtils.currentLine=245235714;
 //BA.debugLineNum = 245235714;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245235715;
 //BA.debugLineNum = 245235715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontweightnormal(b4j.example.vuehtml __ref,boolean _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylefontweightnormal", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylefontweightnormal", new Object[] {_f}));}
RDebugUtils.currentLine=245366784;
 //BA.debugLineNum = 245366784;BA.debugLine="Sub SetStyleFontWeightNormal(f As Boolean) As VueH";
RDebugUtils.currentLine=245366785;
 //BA.debugLineNum = 245366785;BA.debugLine="SetStyle(\"font-weight\", \"normal\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"font-weight","normal");
RDebugUtils.currentLine=245366786;
 //BA.debugLineNum = 245366786;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245366787;
 //BA.debugLineNum = 245366787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleheight(b4j.example.vuehtml __ref,Object _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleheight", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleheight", new Object[] {_h}));}
RDebugUtils.currentLine=243662848;
 //BA.debugLineNum = 243662848;BA.debugLine="Sub SetStyleHeight(h As Object) As VueHTML";
RDebugUtils.currentLine=243662849;
 //BA.debugLineNum = 243662849;BA.debugLine="SetStyleMulti(CreateMap(\"height\":h))";
__ref._setstylemulti /*b4j.example.vuehtml*/ (null,__c.createMap(new Object[] {(Object)("height"),_h}));
RDebugUtils.currentLine=243662850;
 //BA.debugLineNum = 243662850;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243662851;
 //BA.debugLineNum = 243662851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleimportant(b4j.example.vuehtml __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleimportant", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleimportant", new Object[] {_b}));}
RDebugUtils.currentLine=248840192;
 //BA.debugLineNum = 248840192;BA.debugLine="Sub SetStyleImportant(b As Boolean) As VueHTML";
RDebugUtils.currentLine=248840193;
 //BA.debugLineNum = 248840193;BA.debugLine="IsImportant = b";
__ref._isimportant /*boolean*/  = _b;
RDebugUtils.currentLine=248840194;
 //BA.debugLineNum = 248840194;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=248840195;
 //BA.debugLineNum = 248840195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleletterspacing(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleletterspacing", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleletterspacing", new Object[] {_f}));}
RDebugUtils.currentLine=245760000;
 //BA.debugLineNum = 245760000;BA.debugLine="Sub SetStyleLetterSpacing(f As Object) As VueHTML";
RDebugUtils.currentLine=245760001;
 //BA.debugLineNum = 245760001;BA.debugLine="SetStyle(\"letter-spacing\", MakePx(f))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"letter-spacing",__ref._makepx /*String*/ (null,BA.ObjectToString(_f)));
RDebugUtils.currentLine=245760002;
 //BA.debugLineNum = 245760002;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245760003;
 //BA.debugLineNum = 245760003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylelineheight(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylelineheight", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylelineheight", new Object[] {_f}));}
RDebugUtils.currentLine=245956608;
 //BA.debugLineNum = 245956608;BA.debugLine="Sub SetStyleLineHeight(f As Object) As VueHTML   '";
RDebugUtils.currentLine=245956609;
 //BA.debugLineNum = 245956609;BA.debugLine="SetStyle(\"line-height\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"line-height",BA.ObjectToString(_f));
RDebugUtils.currentLine=245956610;
 //BA.debugLineNum = 245956610;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245956611;
 //BA.debugLineNum = 245956611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleliststylecircle(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleliststylecircle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleliststylecircle", null));}
RDebugUtils.currentLine=252379136;
 //BA.debugLineNum = 252379136;BA.debugLine="Sub SetStyleListStyleCircle() As VueHTML";
RDebugUtils.currentLine=252379137;
 //BA.debugLineNum = 252379137;BA.debugLine="SetStyle(\"list-style-type\",\"circle\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"list-style-type","circle");
RDebugUtils.currentLine=252379138;
 //BA.debugLineNum = 252379138;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252379139;
 //BA.debugLineNum = 252379139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleliststyledisk(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleliststyledisk", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleliststyledisk", null));}
RDebugUtils.currentLine=252444672;
 //BA.debugLineNum = 252444672;BA.debugLine="Sub SetStyleListStyleDisk() As VueHTML";
RDebugUtils.currentLine=252444673;
 //BA.debugLineNum = 252444673;BA.debugLine="SetStyle(\"list-style-type\",\"disk\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"list-style-type","disk");
RDebugUtils.currentLine=252444674;
 //BA.debugLineNum = 252444674;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252444675;
 //BA.debugLineNum = 252444675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleliststylenone(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleliststylenone", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleliststylenone", null));}
RDebugUtils.currentLine=252510208;
 //BA.debugLineNum = 252510208;BA.debugLine="Sub SetStyleListStyleNone() As VueHTML";
RDebugUtils.currentLine=252510209;
 //BA.debugLineNum = 252510209;BA.debugLine="SetStyle(\"list-style-type\",\"none\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"list-style-type","none");
RDebugUtils.currentLine=252510210;
 //BA.debugLineNum = 252510210;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252510211;
 //BA.debugLineNum = 252510211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleliststylesquare(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleliststylesquare", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleliststylesquare", null));}
RDebugUtils.currentLine=252575744;
 //BA.debugLineNum = 252575744;BA.debugLine="Sub SetStyleListStyleSquare() As VueHTML";
RDebugUtils.currentLine=252575745;
 //BA.debugLineNum = 252575745;BA.debugLine="SetStyle(\"list-style-type\",\"square\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"list-style-type","square");
RDebugUtils.currentLine=252575746;
 //BA.debugLineNum = 252575746;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252575747;
 //BA.debugLineNum = 252575747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemargin(b4j.example.vuehtml __ref,String _marginbottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylemargin", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylemargin", new Object[] {_marginbottom}));}
RDebugUtils.currentLine=250150912;
 //BA.debugLineNum = 250150912;BA.debugLine="Sub SetStyleMargin(MarginBottom As String) As VueH";
RDebugUtils.currentLine=250150913;
 //BA.debugLineNum = 250150913;BA.debugLine="SetStyle(\"margin\", MakePx(MarginBottom))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"margin",__ref._makepx /*String*/ (null,_marginbottom));
RDebugUtils.currentLine=250150914;
 //BA.debugLineNum = 250150914;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250150915;
 //BA.debugLineNum = 250150915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemarginbottom(b4j.example.vuehtml __ref,String _marginbottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylemarginbottom", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylemarginbottom", new Object[] {_marginbottom}));}
RDebugUtils.currentLine=250216448;
 //BA.debugLineNum = 250216448;BA.debugLine="Sub SetStyleMarginBottom(MarginBottom As String) A";
RDebugUtils.currentLine=250216449;
 //BA.debugLineNum = 250216449;BA.debugLine="SetStyle(\"margin-bottom\", MakePx(MarginBottom))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"margin-bottom",__ref._makepx /*String*/ (null,_marginbottom));
RDebugUtils.currentLine=250216450;
 //BA.debugLineNum = 250216450;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250216451;
 //BA.debugLineNum = 250216451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemarginleft(b4j.example.vuehtml __ref,String _marginleft) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylemarginleft", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylemarginleft", new Object[] {_marginleft}));}
RDebugUtils.currentLine=250347520;
 //BA.debugLineNum = 250347520;BA.debugLine="Sub SetStyleMarginLeft(MarginLeft As String) As Vu";
RDebugUtils.currentLine=250347521;
 //BA.debugLineNum = 250347521;BA.debugLine="SetStyle(\"margin-left\", MakePx(MarginLeft))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"margin-left",__ref._makepx /*String*/ (null,_marginleft));
RDebugUtils.currentLine=250347522;
 //BA.debugLineNum = 250347522;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250347523;
 //BA.debugLineNum = 250347523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemarginright(b4j.example.vuehtml __ref,String _marginright) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylemarginright", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylemarginright", new Object[] {_marginright}));}
RDebugUtils.currentLine=250281984;
 //BA.debugLineNum = 250281984;BA.debugLine="Sub SetStyleMarginRight(MarginRight As String) As";
RDebugUtils.currentLine=250281985;
 //BA.debugLineNum = 250281985;BA.debugLine="SetStyle(\"margin-right\", MakePx(MarginRight))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"margin-right",__ref._makepx /*String*/ (null,_marginright));
RDebugUtils.currentLine=250281986;
 //BA.debugLineNum = 250281986;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250281987;
 //BA.debugLineNum = 250281987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemargintop(b4j.example.vuehtml __ref,String _margintop) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylemargintop", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylemargintop", new Object[] {_margintop}));}
RDebugUtils.currentLine=250413056;
 //BA.debugLineNum = 250413056;BA.debugLine="Sub SetStyleMarginTop(MarginTop As String) As VueH";
RDebugUtils.currentLine=250413057;
 //BA.debugLineNum = 250413057;BA.debugLine="SetStyle(\"margin-top\", MakePx(MarginTop))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"margin-top",__ref._makepx /*String*/ (null,_margintop));
RDebugUtils.currentLine=250413058;
 //BA.debugLineNum = 250413058;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250413059;
 //BA.debugLineNum = 250413059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleoutline(b4j.example.vuehtml __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleoutline", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleoutline", new Object[] {_c}));}
RDebugUtils.currentLine=246939648;
 //BA.debugLineNum = 246939648;BA.debugLine="Sub SetStyleOutline(c As Object) As VueHTML";
RDebugUtils.currentLine=246939649;
 //BA.debugLineNum = 246939649;BA.debugLine="SetStyle(\"outline\",c)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"outline",BA.ObjectToString(_c));
RDebugUtils.currentLine=246939650;
 //BA.debugLineNum = 246939650;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246939651;
 //BA.debugLineNum = 246939651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleoutlinecolor(b4j.example.vuehtml __ref,Object _bs) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleoutlinecolor", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleoutlinecolor", new Object[] {_bs}));}
RDebugUtils.currentLine=247070720;
 //BA.debugLineNum = 247070720;BA.debugLine="Sub SetStyleOutlineColor(bs As Object) As VueHTML";
RDebugUtils.currentLine=247070721;
 //BA.debugLineNum = 247070721;BA.debugLine="SetStyle(\"outline-color\",bs)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"outline-color",BA.ObjectToString(_bs));
RDebugUtils.currentLine=247070722;
 //BA.debugLineNum = 247070722;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247070723;
 //BA.debugLineNum = 247070723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleoutlinestyle(b4j.example.vuehtml __ref,Object _bs) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleoutlinestyle", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleoutlinestyle", new Object[] {_bs}));}
RDebugUtils.currentLine=247005184;
 //BA.debugLineNum = 247005184;BA.debugLine="Sub SetStyleOutlineStyle(bs As Object) As VueHTML";
RDebugUtils.currentLine=247005185;
 //BA.debugLineNum = 247005185;BA.debugLine="SetStyle(\"outline-style\",bs)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"outline-style",BA.ObjectToString(_bs));
RDebugUtils.currentLine=247005186;
 //BA.debugLineNum = 247005186;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247005187;
 //BA.debugLineNum = 247005187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleoutlinewidth(b4j.example.vuehtml __ref,Object _bs) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleoutlinewidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleoutlinewidth", new Object[] {_bs}));}
RDebugUtils.currentLine=247136256;
 //BA.debugLineNum = 247136256;BA.debugLine="Sub SetStyleOutlineWidth(bs As Object) As VueHTML";
RDebugUtils.currentLine=247136257;
 //BA.debugLineNum = 247136257;BA.debugLine="SetStyle(\"outline-width\",MakePx(bs))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"outline-width",__ref._makepx /*String*/ (null,BA.ObjectToString(_bs)));
RDebugUtils.currentLine=247136258;
 //BA.debugLineNum = 247136258;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=247136259;
 //BA.debugLineNum = 247136259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepadding(b4j.example.vuehtml __ref,String _paddingbottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylepadding", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylepadding", new Object[] {_paddingbottom}));}
RDebugUtils.currentLine=249495552;
 //BA.debugLineNum = 249495552;BA.debugLine="Sub SetStylePadding(PaddingBottom As String) As Vu";
RDebugUtils.currentLine=249495553;
 //BA.debugLineNum = 249495553;BA.debugLine="SetStyle(\"padding\", MakePx(PaddingBottom))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"padding",__ref._makepx /*String*/ (null,_paddingbottom));
RDebugUtils.currentLine=249495554;
 //BA.debugLineNum = 249495554;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249495555;
 //BA.debugLineNum = 249495555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepaddingbottom(b4j.example.vuehtml __ref,String _paddingbottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylepaddingbottom", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylepaddingbottom", new Object[] {_paddingbottom}));}
RDebugUtils.currentLine=249561088;
 //BA.debugLineNum = 249561088;BA.debugLine="Sub SetStylePaddingBottom(PaddingBottom As String)";
RDebugUtils.currentLine=249561089;
 //BA.debugLineNum = 249561089;BA.debugLine="SetStyle(\"padding-bottom\", MakePx(PaddingBottom))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"padding-bottom",__ref._makepx /*String*/ (null,_paddingbottom));
RDebugUtils.currentLine=249561090;
 //BA.debugLineNum = 249561090;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249561091;
 //BA.debugLineNum = 249561091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepaddingleft(b4j.example.vuehtml __ref,String _paddingleft) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylepaddingleft", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylepaddingleft", new Object[] {_paddingleft}));}
RDebugUtils.currentLine=249692160;
 //BA.debugLineNum = 249692160;BA.debugLine="Sub SetStylePaddingLeft(PaddingLeft As String) As";
RDebugUtils.currentLine=249692161;
 //BA.debugLineNum = 249692161;BA.debugLine="SetStyle(\"padding-left\", MakePx(PaddingLeft))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"padding-left",__ref._makepx /*String*/ (null,_paddingleft));
RDebugUtils.currentLine=249692162;
 //BA.debugLineNum = 249692162;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249692163;
 //BA.debugLineNum = 249692163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepaddingright(b4j.example.vuehtml __ref,String _paddingright) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylepaddingright", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylepaddingright", new Object[] {_paddingright}));}
RDebugUtils.currentLine=249626624;
 //BA.debugLineNum = 249626624;BA.debugLine="Sub SetStylePaddingRight(PaddingRight As String) A";
RDebugUtils.currentLine=249626625;
 //BA.debugLineNum = 249626625;BA.debugLine="SetStyle(\"padding-right\", MakePx(PaddingRight))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"padding-right",__ref._makepx /*String*/ (null,_paddingright));
RDebugUtils.currentLine=249626626;
 //BA.debugLineNum = 249626626;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249626627;
 //BA.debugLineNum = 249626627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepaddingtop(b4j.example.vuehtml __ref,String _paddingtop) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylepaddingtop", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylepaddingtop", new Object[] {_paddingtop}));}
RDebugUtils.currentLine=249757696;
 //BA.debugLineNum = 249757696;BA.debugLine="Sub SetStylePaddingTop(PaddingTop As String) As Vu";
RDebugUtils.currentLine=249757697;
 //BA.debugLineNum = 249757697;BA.debugLine="SetStyle(\"padding-top\", MakePx(PaddingTop))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"padding-top",__ref._makepx /*String*/ (null,_paddingtop));
RDebugUtils.currentLine=249757698;
 //BA.debugLineNum = 249757698;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249757699;
 //BA.debugLineNum = 249757699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletextaligncenter(b4j.example.vuehtml __ref,boolean _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyletextaligncenter", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyletextaligncenter", new Object[] {_f}));}
RDebugUtils.currentLine=245563392;
 //BA.debugLineNum = 245563392;BA.debugLine="Sub SetStyleTextAlignCenter(f As Boolean) As VueHT";
RDebugUtils.currentLine=245563393;
 //BA.debugLineNum = 245563393;BA.debugLine="SetStyle(\"text-align\", \"center\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"text-align","center");
RDebugUtils.currentLine=245563394;
 //BA.debugLineNum = 245563394;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245563395;
 //BA.debugLineNum = 245563395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletextdecoration(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyletextdecoration", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyletextdecoration", new Object[] {_f}));}
RDebugUtils.currentLine=245825536;
 //BA.debugLineNum = 245825536;BA.debugLine="Sub SetStyleTextDecoration(f As Object) As VueHTML";
RDebugUtils.currentLine=245825537;
 //BA.debugLineNum = 245825537;BA.debugLine="SetStyle(\"text-decoration\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"text-decoration",BA.ObjectToString(_f));
RDebugUtils.currentLine=245825538;
 //BA.debugLineNum = 245825538;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245825539;
 //BA.debugLineNum = 245825539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletextindent(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyletextindent", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyletextindent", new Object[] {_f}));}
RDebugUtils.currentLine=245628928;
 //BA.debugLineNum = 245628928;BA.debugLine="Sub SetStyleTextIndent(f As Object) As VueHTML   '";
RDebugUtils.currentLine=245628929;
 //BA.debugLineNum = 245628929;BA.debugLine="SetStyle(\"text-indent\", MakePx(f))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"text-indent",__ref._makepx /*String*/ (null,BA.ObjectToString(_f)));
RDebugUtils.currentLine=245628930;
 //BA.debugLineNum = 245628930;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245628931;
 //BA.debugLineNum = 245628931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletextshadow(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyletextshadow", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyletextshadow", new Object[] {_f}));}
RDebugUtils.currentLine=245891072;
 //BA.debugLineNum = 245891072;BA.debugLine="Sub SetStyleTextShadow(f As Object) As VueHTML   '";
RDebugUtils.currentLine=245891073;
 //BA.debugLineNum = 245891073;BA.debugLine="SetStyle(\"text-shadow\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"text-shadow",BA.ObjectToString(_f));
RDebugUtils.currentLine=245891074;
 //BA.debugLineNum = 245891074;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245891075;
 //BA.debugLineNum = 245891075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletexttransform(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyletexttransform", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyletexttransform", new Object[] {_f}));}
RDebugUtils.currentLine=245694464;
 //BA.debugLineNum = 245694464;BA.debugLine="Sub SetStyleTextTransform(f As Object) As VueHTML";
RDebugUtils.currentLine=245694465;
 //BA.debugLineNum = 245694465;BA.debugLine="SetStyle(\"text-transform\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"text-transform",BA.ObjectToString(_f));
RDebugUtils.currentLine=245694466;
 //BA.debugLineNum = 245694466;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=245694467;
 //BA.debugLineNum = 245694467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleverticalalign(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstyleverticalalign", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstyleverticalalign", new Object[] {_f}));}
RDebugUtils.currentLine=246087680;
 //BA.debugLineNum = 246087680;BA.debugLine="Sub SetStyleVerticalAlign(f As Object) As VueHTML";
RDebugUtils.currentLine=246087681;
 //BA.debugLineNum = 246087681;BA.debugLine="SetStyle(\"vertical-align\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"vertical-align",BA.ObjectToString(_f));
RDebugUtils.currentLine=246087682;
 //BA.debugLineNum = 246087682;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246087683;
 //BA.debugLineNum = 246087683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylewhitespace(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylewhitespace", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylewhitespace", new Object[] {_f}));}
RDebugUtils.currentLine=246022144;
 //BA.debugLineNum = 246022144;BA.debugLine="Sub SetStyleWhiteSpace(f As Object) As VueHTML   '";
RDebugUtils.currentLine=246022145;
 //BA.debugLineNum = 246022145;BA.debugLine="SetStyle(\"white-space\", f)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"white-space",BA.ObjectToString(_f));
RDebugUtils.currentLine=246022146;
 //BA.debugLineNum = 246022146;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246022147;
 //BA.debugLineNum = 246022147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylewidth(b4j.example.vuehtml __ref,Object _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylewidth", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylewidth", new Object[] {_h}));}
RDebugUtils.currentLine=243793920;
 //BA.debugLineNum = 243793920;BA.debugLine="Sub SetStyleWidth(h As Object) As VueHTML";
RDebugUtils.currentLine=243793921;
 //BA.debugLineNum = 243793921;BA.debugLine="SetStyleMulti(CreateMap(\"width\":h))";
__ref._setstylemulti /*b4j.example.vuehtml*/ (null,__c.createMap(new Object[] {(Object)("width"),_h}));
RDebugUtils.currentLine=243793922;
 //BA.debugLineNum = 243793922;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243793923;
 //BA.debugLineNum = 243793923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylewordspacing(b4j.example.vuehtml __ref,Object _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylewordspacing", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylewordspacing", new Object[] {_f}));}
RDebugUtils.currentLine=246218752;
 //BA.debugLineNum = 246218752;BA.debugLine="Sub SetStyleWordSpacing(f As Object) As VueHTML";
RDebugUtils.currentLine=246218753;
 //BA.debugLineNum = 246218753;BA.debugLine="SetStyle(\"word-spacing\", MakePx(f))";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"word-spacing",__ref._makepx /*String*/ (null,BA.ObjectToString(_f)));
RDebugUtils.currentLine=246218754;
 //BA.debugLineNum = 246218754;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=246218755;
 //BA.debugLineNum = 246218755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylezindex(b4j.example.vuehtml __ref,String _zindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setstylezindex", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setstylezindex", new Object[] {_zindex}));}
RDebugUtils.currentLine=252968960;
 //BA.debugLineNum = 252968960;BA.debugLine="Sub SetStyleZIndex(zindex As String) As VueHTML";
RDebugUtils.currentLine=252968961;
 //BA.debugLineNum = 252968961;BA.debugLine="SetStyle(\"z-index\",zindex)";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"z-index",_zindex);
RDebugUtils.currentLine=252968962;
 //BA.debugLineNum = 252968962;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=252968963;
 //BA.debugLineNum = 252968963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settemplate(b4j.example.vuehtml __ref,Object _tmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "settemplate", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "settemplate", new Object[] {_tmp}));}
RDebugUtils.currentLine=242679808;
 //BA.debugLineNum = 242679808;BA.debugLine="Sub SetTemplate(tmp As Object) As VueHTML";
RDebugUtils.currentLine=242679809;
 //BA.debugLineNum = 242679809;BA.debugLine="Clear";
__ref._clear /*b4j.example.vuehtml*/ (null);
RDebugUtils.currentLine=242679810;
 //BA.debugLineNum = 242679810;BA.debugLine="SetText(tmp)";
__ref._settext /*b4j.example.vuehtml*/ (null,BA.ObjectToString(_tmp));
RDebugUtils.currentLine=242679811;
 //BA.debugLineNum = 242679811;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242679812;
 //BA.debugLineNum = 242679812;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settextaligncenter(b4j.example.vuehtml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "settextaligncenter", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "settextaligncenter", null));}
RDebugUtils.currentLine=249167872;
 //BA.debugLineNum = 249167872;BA.debugLine="Sub SetTextAlignCenter As VueHTML";
RDebugUtils.currentLine=249167873;
 //BA.debugLineNum = 249167873;BA.debugLine="SetStyle(\"text-align\", \"center\")";
__ref._setstyle /*b4j.example.vuehtml*/ (null,"text-align","center");
RDebugUtils.currentLine=249167874;
 //BA.debugLineNum = 249167874;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=249167875;
 //BA.debugLineNum = 249167875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setto(b4j.example.vuehtml __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setto", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setto", new Object[] {_t}));}
RDebugUtils.currentLine=242417664;
 //BA.debugLineNum = 242417664;BA.debugLine="Sub SetTo(t As Object) As VueHTML";
RDebugUtils.currentLine=242417665;
 //BA.debugLineNum = 242417665;BA.debugLine="SetAttr(\"to\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"to",BA.ObjectToString(_t));
RDebugUtils.currentLine=242417666;
 //BA.debugLineNum = 242417666;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242417667;
 //BA.debugLineNum = 242417667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _seturl(b4j.example.vuehtml __ref,Object _u) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "seturl", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "seturl", new Object[] {_u}));}
RDebugUtils.currentLine=242352128;
 //BA.debugLineNum = 242352128;BA.debugLine="Sub SetURL(u As Object) As VueHTML";
RDebugUtils.currentLine=242352129;
 //BA.debugLineNum = 242352129;BA.debugLine="SetAttr(\"url\", u)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"url",BA.ObjectToString(_u));
RDebugUtils.currentLine=242352130;
 //BA.debugLineNum = 242352130;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=242352131;
 //BA.debugLineNum = 242352131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvbind(b4j.example.vuehtml __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvbind", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvbind", new Object[] {_t}));}
RDebugUtils.currentLine=257753088;
 //BA.debugLineNum = 257753088;BA.debugLine="Sub SetVBind(t As String) As VueHTML";
RDebugUtils.currentLine=257753089;
 //BA.debugLineNum = 257753089;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
RDebugUtils.currentLine=257753090;
 //BA.debugLineNum = 257753090;BA.debugLine="SetAttr(\"v-bind\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-bind",_t);
RDebugUtils.currentLine=257753091;
 //BA.debugLineNum = 257753091;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257753092;
 //BA.debugLineNum = 257753092;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvbindis(b4j.example.vuehtml __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvbindis", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvbindis", new Object[] {_t}));}
RDebugUtils.currentLine=257818624;
 //BA.debugLineNum = 257818624;BA.debugLine="Sub SetVBindIs(t As String) As VueHTML";
RDebugUtils.currentLine=257818625;
 //BA.debugLineNum = 257818625;BA.debugLine="SetAttr(\"v-bind:is\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-bind:is",_t);
RDebugUtils.currentLine=257818626;
 //BA.debugLineNum = 257818626;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257818627;
 //BA.debugLineNum = 257818627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvelse(b4j.example.vuehtml __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvelse", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvelse", new Object[] {_t}));}
RDebugUtils.currentLine=258015232;
 //BA.debugLineNum = 258015232;BA.debugLine="Sub SetVElse(t As Object) As VueHTML";
RDebugUtils.currentLine=258015233;
 //BA.debugLineNum = 258015233;BA.debugLine="SetAttr(\"v-else\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-else",BA.ObjectToString(_t));
RDebugUtils.currentLine=258015234;
 //BA.debugLineNum = 258015234;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258015235;
 //BA.debugLineNum = 258015235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvelseif(b4j.example.vuehtml __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvelseif", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvelseif", new Object[] {_t}));}
RDebugUtils.currentLine=258080768;
 //BA.debugLineNum = 258080768;BA.debugLine="Sub SetVElseIf(t As Object) As VueHTML";
RDebugUtils.currentLine=258080769;
 //BA.debugLineNum = 258080769;BA.debugLine="SetAttr(\"v-else-if\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-else-if",BA.ObjectToString(_t));
RDebugUtils.currentLine=258080770;
 //BA.debugLineNum = 258080770;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=258080771;
 //BA.debugLineNum = 258080771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvhtml(b4j.example.vuehtml __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvhtml", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvhtml", new Object[] {_h}));}
RDebugUtils.currentLine=243728384;
 //BA.debugLineNum = 243728384;BA.debugLine="Sub SetVHtml(h As String) As VueHTML";
RDebugUtils.currentLine=243728385;
 //BA.debugLineNum = 243728385;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
RDebugUtils.currentLine=243728386;
 //BA.debugLineNum = 243728386;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
RDebugUtils.currentLine=243728387;
 //BA.debugLineNum = 243728387;BA.debugLine="SetAttr(\"v-html\", h)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-html",_h);
RDebugUtils.currentLine=243728388;
 //BA.debugLineNum = 243728388;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=243728389;
 //BA.debugLineNum = 243728389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvlazy(b4j.example.vuehtml __ref,Object _varlazyload) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvlazy", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvlazy", new Object[] {_varlazyload}));}
RDebugUtils.currentLine=244645888;
 //BA.debugLineNum = 244645888;BA.debugLine="Sub SetVLazy(varLazyLoad As Object) As VueHTML";
RDebugUtils.currentLine=244645889;
 //BA.debugLineNum = 244645889;BA.debugLine="SetAttr(\"v-lazy\", varLazyLoad)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-lazy",BA.ObjectToString(_varlazyload));
RDebugUtils.currentLine=244645890;
 //BA.debugLineNum = 244645890;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=244645891;
 //BA.debugLineNum = 244645891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvmodel(b4j.example.vuehtml __ref,String _varvmodel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvmodel", new Object[] {_varvmodel}));}
RDebugUtils.currentLine=257556480;
 //BA.debugLineNum = 257556480;BA.debugLine="Sub SetVModel(varVModel As String) As VueHTML";
RDebugUtils.currentLine=257556481;
 //BA.debugLineNum = 257556481;BA.debugLine="varVModel = varVModel.tolowercase";
_varvmodel = _varvmodel.toLowerCase();
RDebugUtils.currentLine=257556482;
 //BA.debugLineNum = 257556482;BA.debugLine="SetAttr(\"v-model\", varVModel)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-model",_varvmodel);
RDebugUtils.currentLine=257556483;
 //BA.debugLineNum = 257556483;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257556484;
 //BA.debugLineNum = 257556484;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvon(b4j.example.vuehtml __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvon", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvon", new Object[] {_t}));}
RDebugUtils.currentLine=257687552;
 //BA.debugLineNum = 257687552;BA.debugLine="Sub SetVOn(t As Object) As VueHTML";
RDebugUtils.currentLine=257687553;
 //BA.debugLineNum = 257687553;BA.debugLine="SetAttr(\"v-on\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-on",BA.ObjectToString(_t));
RDebugUtils.currentLine=257687554;
 //BA.debugLineNum = 257687554;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257687555;
 //BA.debugLineNum = 257687555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvonce(b4j.example.vuehtml __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvonce", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvonce", new Object[] {_t}));}
RDebugUtils.currentLine=257884160;
 //BA.debugLineNum = 257884160;BA.debugLine="Sub SetVOnce(t As Object) As VueHTML";
RDebugUtils.currentLine=257884161;
 //BA.debugLineNum = 257884161;BA.debugLine="SetAttr(\"v-once\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-once",BA.ObjectToString(_t));
RDebugUtils.currentLine=257884162;
 //BA.debugLineNum = 257884162;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257884163;
 //BA.debugLineNum = 257884163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvtext(b4j.example.vuehtml __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "setvtext", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "setvtext", new Object[] {_t}));}
RDebugUtils.currentLine=257949696;
 //BA.debugLineNum = 257949696;BA.debugLine="Sub SetVText(t As Object) As VueHTML";
RDebugUtils.currentLine=257949697;
 //BA.debugLineNum = 257949697;BA.debugLine="SetAttr(\"v-text\", t)";
__ref._setattr /*b4j.example.vuehtml*/ (null,"v-text",BA.ObjectToString(_t));
RDebugUtils.currentLine=257949698;
 //BA.debugLineNum = 257949698;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=257949699;
 //BA.debugLineNum = 257949699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _updateattribute(b4j.example.vuehtml __ref,String _name,Object _propvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "updateattribute", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "updateattribute", new Object[] {_name,_propvalue}));}
Object _svalue = null;
RDebugUtils.currentLine=253820928;
 //BA.debugLineNum = 253820928;BA.debugLine="Sub UpdateAttribute(name As String, propValue As O";
RDebugUtils.currentLine=253820929;
 //BA.debugLineNum = 253820929;BA.debugLine="If properties.ContainsKey(name) Then";
if (__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_name))) { 
RDebugUtils.currentLine=253820930;
 //BA.debugLineNum = 253820930;BA.debugLine="Dim svalue As Object = properties.Get(name)";
_svalue = __ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name));
RDebugUtils.currentLine=253820931;
 //BA.debugLineNum = 253820931;BA.debugLine="svalue = svalue & \";\" & propValue";
_svalue = (Object)(BA.ObjectToString(_svalue)+";"+BA.ObjectToString(_propvalue));
RDebugUtils.currentLine=253820932;
 //BA.debugLineNum = 253820932;BA.debugLine="properties.Put(name,svalue)";
__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_name),_svalue);
 }else {
RDebugUtils.currentLine=253820934;
 //BA.debugLineNum = 253820934;BA.debugLine="properties.Put(name,propValue)";
__ref._properties /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_name),_propvalue);
 };
RDebugUtils.currentLine=253820936;
 //BA.debugLineNum = 253820936;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=253820937;
 //BA.debugLineNum = 253820937;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _usetheme(b4j.example.vuehtml __ref,String _sprefix,String _themename) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "usetheme", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "usetheme", new Object[] {_sprefix,_themename}));}
RDebugUtils.currentLine=250478592;
 //BA.debugLineNum = 250478592;BA.debugLine="Sub UseTheme(sPrefix As String, themeName As Strin";
RDebugUtils.currentLine=250478593;
 //BA.debugLineNum = 250478593;BA.debugLine="If themeName = \"\" Then Return Me";
if ((_themename).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
RDebugUtils.currentLine=250478594;
 //BA.debugLineNum = 250478594;BA.debugLine="themeName = themeName.tolowercase";
_themename = _themename.toLowerCase();
RDebugUtils.currentLine=250478595;
 //BA.debugLineNum = 250478595;BA.debugLine="If sPrefix <> \"\" And themeName <> \"\" Then";
if ((_sprefix).equals("") == false && (_themename).equals("") == false) { 
RDebugUtils.currentLine=250478596;
 //BA.debugLineNum = 250478596;BA.debugLine="AddClass($\"${sPrefix}-${themeName}\"$)";
__ref._addclass /*b4j.example.vuehtml*/ (null,(""+__c.SmartStringFormatter("",(Object)(_sprefix))+"-"+__c.SmartStringFormatter("",(Object)(_themename))+""));
 };
RDebugUtils.currentLine=250478598;
 //BA.debugLineNum = 250478598;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
RDebugUtils.currentLine=250478599;
 //BA.debugLineNum = 250478599;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _wrap(b4j.example.vuehtml __ref,String _wid,String _wraptype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuehtml";
if (Debug.shouldDelegate(ba, "wrap", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "wrap", new Object[] {_wid,_wraptype}));}
b4j.example.vuehtml _p = null;
RDebugUtils.currentLine=244842496;
 //BA.debugLineNum = 244842496;BA.debugLine="Sub Wrap(wid As String, wrapType As String) As Vue";
RDebugUtils.currentLine=244842497;
 //BA.debugLineNum = 244842497;BA.debugLine="Dim p As VueHTML";
_p = new b4j.example.vuehtml();
RDebugUtils.currentLine=244842498;
 //BA.debugLineNum = 244842498;BA.debugLine="p.Initialize(wid,wrapType)";
_p._initialize /*b4j.example.vuehtml*/ (null,ba,_wid,_wraptype);
RDebugUtils.currentLine=244842499;
 //BA.debugLineNum = 244842499;BA.debugLine="p.AddContent(HTML)";
_p._addcontent /*b4j.example.vuehtml*/ (null,__ref._html /*String*/ (null));
RDebugUtils.currentLine=244842500;
 //BA.debugLineNum = 244842500;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=244842501;
 //BA.debugLineNum = 244842501;BA.debugLine="End Sub";
return null;
}
}