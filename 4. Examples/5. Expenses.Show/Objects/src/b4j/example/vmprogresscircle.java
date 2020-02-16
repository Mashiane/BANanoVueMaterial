package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprogresscircle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmprogresscircle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprogresscircle.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _progresscircle = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public com.ab.banano.BANanoObject _jq = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmprogresscircle  _initialize(b4j.example.vmprogresscircle __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _width,String _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_width,_height}));}
RDebugUtils.currentLine=182190080;
 //BA.debugLineNum = 182190080;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=182190081;
 //BA.debugLineNum = 182190081;BA.debugLine="BANano.DependsOnAsset(\"progresscircle.css\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("progresscircle.css");
RDebugUtils.currentLine=182190082;
 //BA.debugLineNum = 182190082;BA.debugLine="BANano.DependsOnAsset(\"progresscircle.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("progresscircle.js");
RDebugUtils.currentLine=182190084;
 //BA.debugLineNum = 182190084;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=182190085;
 //BA.debugLineNum = 182190085;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=182190086;
 //BA.debugLineNum = 182190086;BA.debugLine="JQ = vue.jquery";
__ref._jq /*com.ab.banano.BANanoObject*/  = __ref._vue /*b4j.example.bananovue*/ ._jquery /*com.ab.banano.BANanoObject*/ ;
RDebugUtils.currentLine=182190087;
 //BA.debugLineNum = 182190087;BA.debugLine="ProgressCircle.Initialize(vue, ID).SetTag(\"div\")";
__ref._progresscircle /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=182190088;
 //BA.debugLineNum = 182190088;BA.debugLine="ProgressCircle.AddClass(ID)";
__ref._progresscircle /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=182190089;
 //BA.debugLineNum = 182190089;BA.debugLine="Width = ProgressCircle.MakePx(Width)";
_width = __ref._progresscircle /*b4j.example.vmelement*/ ._makepx /*String*/ (null,_width);
RDebugUtils.currentLine=182190090;
 //BA.debugLineNum = 182190090;BA.debugLine="Height = ProgressCircle.MakePx(Height)";
_height = __ref._progresscircle /*b4j.example.vmelement*/ ._makepx /*String*/ (null,_height);
RDebugUtils.currentLine=182190091;
 //BA.debugLineNum = 182190091;BA.debugLine="ProgressCircle.SetWidth(Width).SetHeight(Height)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setwidth /*b4j.example.vmelement*/ (null,_width)._setheight /*b4j.example.vmelement*/ (null,_height);
RDebugUtils.currentLine=182190092;
 //BA.debugLineNum = 182190092;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182190093;
 //BA.debugLineNum = 182190093;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _addclass(b4j.example.vmprogresscircle __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=182779904;
 //BA.debugLineNum = 182779904;BA.debugLine="Sub AddClass(c As String) As VMProgressCircle";
RDebugUtils.currentLine=182779905;
 //BA.debugLineNum = 182779905;BA.debugLine="ProgressCircle.AddClass(c)";
__ref._progresscircle /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=182779906;
 //BA.debugLineNum = 182779906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182779907;
 //BA.debugLineNum = 182779907;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmprogresscircle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
RDebugUtils.currentLine=182124544;
 //BA.debugLineNum = 182124544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=182124545;
 //BA.debugLineNum = 182124545;BA.debugLine="Public ProgressCircle As VMElement";
_progresscircle = new b4j.example.vmelement();
RDebugUtils.currentLine=182124546;
 //BA.debugLineNum = 182124546;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=182124547;
 //BA.debugLineNum = 182124547;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=182124548;
 //BA.debugLineNum = 182124548;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=182124549;
 //BA.debugLineNum = 182124549;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=182124550;
 //BA.debugLineNum = 182124550;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmprogresscircle __ref,b4j.example.vmelement _px) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_px}));}
RDebugUtils.currentLine=183042048;
 //BA.debugLineNum = 183042048;BA.debugLine="Sub Pop(px As VMElement)";
RDebugUtils.currentLine=183042049;
 //BA.debugLineNum = 183042049;BA.debugLine="px.SetText(ToString)";
_px._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=183042050;
 //BA.debugLineNum = 183042050;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmprogresscircle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=182910976;
 //BA.debugLineNum = 182910976;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=182910977;
 //BA.debugLineNum = 182910977;BA.debugLine="Return ProgressCircle.tostring";
if (true) return __ref._progresscircle /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=182910978;
 //BA.debugLineNum = 182910978;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.vmprogresscircle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
com.ab.banano.BANanoObject _loadingele = null;
RDebugUtils.currentLine=183238656;
 //BA.debugLineNum = 183238656;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=183238658;
 //BA.debugLineNum = 183238658;BA.debugLine="Dim loadingEle As BANanoObject = JQ.Selector($\"#$";
_loadingele = new com.ab.banano.BANanoObject();
_loadingele = __ref._jq /*com.ab.banano.BANanoObject*/ .Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"")));
RDebugUtils.currentLine=183238659;
 //BA.debugLineNum = 183238659;BA.debugLine="loadingEle.RunMethod(\"circlechart\", Null)";
_loadingele.RunMethod("circlechart",__c.Null);
RDebugUtils.currentLine=183238660;
 //BA.debugLineNum = 183238660;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmprogresscircle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=182976512;
 //BA.debugLineNum = 182976512;BA.debugLine="Sub Render";
RDebugUtils.currentLine=182976513;
 //BA.debugLineNum = 182976513;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=182976514;
 //BA.debugLineNum = 182976514;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircle  _setattr(b4j.example.vmprogresscircle __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=182845440;
 //BA.debugLineNum = 182845440;BA.debugLine="Sub SetAttr(attr As Map) As VMProgressCircle";
RDebugUtils.currentLine=182845441;
 //BA.debugLineNum = 182845441;BA.debugLine="ProgressCircle.SetAttr(attr)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=182845442;
 //BA.debugLineNum = 182845442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182845443;
 //BA.debugLineNum = 182845443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setdisabled(b4j.example.vmprogresscircle __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=182255616;
 //BA.debugLineNum = 182255616;BA.debugLine="Sub SetDisabled(b As Boolean) As VMProgressCircle";
RDebugUtils.currentLine=182255617;
 //BA.debugLineNum = 182255617;BA.debugLine="ProgressCircle.SetDisabled(b)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=182255618;
 //BA.debugLineNum = 182255618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182255619;
 //BA.debugLineNum = 182255619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setid(b4j.example.vmprogresscircle __ref,String _iid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setid", new Object[] {_iid,_bind}));}
RDebugUtils.currentLine=182517760;
 //BA.debugLineNum = 182517760;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMPro";
RDebugUtils.currentLine=182517761;
 //BA.debugLineNum = 182517761;BA.debugLine="ProgressCircle.SetID(iID,bind)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_iid,_bind);
RDebugUtils.currentLine=182517762;
 //BA.debugLineNum = 182517762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182517763;
 //BA.debugLineNum = 182517763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setkey(b4j.example.vmprogresscircle __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=182648832;
 //BA.debugLineNum = 182648832;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMProg";
RDebugUtils.currentLine=182648833;
 //BA.debugLineNum = 182648833;BA.debugLine="ProgressCircle.SetKey(k, bind)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=182648834;
 //BA.debugLineNum = 182648834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182648835;
 //BA.debugLineNum = 182648835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setlabel(b4j.example.vmprogresscircle __ref,String _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setlabel", new Object[] {_lbl}));}
RDebugUtils.currentLine=183173120;
 //BA.debugLineNum = 183173120;BA.debugLine="Sub SetLabel(lbl As String) As VMProgressCircle";
RDebugUtils.currentLine=183173121;
 //BA.debugLineNum = 183173121;BA.debugLine="ProgressCircle.SetText(lbl)";
__ref._progresscircle /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_lbl);
RDebugUtils.currentLine=183173122;
 //BA.debugLineNum = 183173122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=183173123;
 //BA.debugLineNum = 183173123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setname(b4j.example.vmprogresscircle __ref,String _nam,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setname", new Object[] {_nam,_bind}));}
RDebugUtils.currentLine=182583296;
 //BA.debugLineNum = 182583296;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMP";
RDebugUtils.currentLine=182583297;
 //BA.debugLineNum = 182583297;BA.debugLine="ProgressCircle.SetName(nam, bind)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_nam,_bind);
RDebugUtils.currentLine=182583298;
 //BA.debugLineNum = 182583298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182583299;
 //BA.debugLineNum = 182583299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setstyle(b4j.example.vmprogresscircle __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=182386688;
 //BA.debugLineNum = 182386688;BA.debugLine="Sub SetStyle(sm As Map) As VMProgressCircle";
RDebugUtils.currentLine=182386689;
 //BA.debugLineNum = 182386689;BA.debugLine="ProgressCircle.SetStyle(sm)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=182386690;
 //BA.debugLineNum = 182386690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182386691;
 //BA.debugLineNum = 182386691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _settabindex(b4j.example.vmprogresscircle __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=182321152;
 //BA.debugLineNum = 182321152;BA.debugLine="Sub SetTabIndex(ti As String) As VMProgressCircle";
RDebugUtils.currentLine=182321153;
 //BA.debugLineNum = 182321153;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmprogresscircle)(this);};
RDebugUtils.currentLine=182321154;
 //BA.debugLineNum = 182321154;BA.debugLine="ProgressCircle.SetTabIndex(ti)";
__ref._progresscircle /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=182321155;
 //BA.debugLineNum = 182321155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182321156;
 //BA.debugLineNum = 182321156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setvalue(b4j.example.vmprogresscircle __ref,int _vl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setvalue", new Object[] {_vl}));}
RDebugUtils.currentLine=183107584;
 //BA.debugLineNum = 183107584;BA.debugLine="Sub SetValue(vl As Int) As VMProgressCircle";
RDebugUtils.currentLine=183107585;
 //BA.debugLineNum = 183107585;BA.debugLine="ProgressCircle.SetAttr(CreateMap(\"data-percentage";
__ref._progresscircle /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-percentage"),(Object)(_vl)}));
RDebugUtils.currentLine=183107586;
 //BA.debugLineNum = 183107586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=183107587;
 //BA.debugLineNum = 183107587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setvif(b4j.example.vmprogresscircle __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=182452224;
 //BA.debugLineNum = 182452224;BA.debugLine="Sub SetVIf(vif As String) As VMProgressCircle";
RDebugUtils.currentLine=182452225;
 //BA.debugLineNum = 182452225;BA.debugLine="ProgressCircle.SetVIf(vif)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=182452226;
 //BA.debugLineNum = 182452226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182452227;
 //BA.debugLineNum = 182452227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _setvshow(b4j.example.vmprogresscircle __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogresscircle";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=182714368;
 //BA.debugLineNum = 182714368;BA.debugLine="Sub SetVShow(vif As String) As VMProgressCircle";
RDebugUtils.currentLine=182714369;
 //BA.debugLineNum = 182714369;BA.debugLine="ProgressCircle.SetVShow(vif)";
__ref._progresscircle /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=182714370;
 //BA.debugLineNum = 182714370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircle)(this);
RDebugUtils.currentLine=182714371;
 //BA.debugLineNum = 182714371;BA.debugLine="End Sub";
return null;
}
}