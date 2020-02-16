package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmicon extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmicon", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmicon.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _icon = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _hascontent = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmicon  _initialize(b4j.example.vmicon __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=141819904;
 //BA.debugLineNum = 141819904;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=141819905;
 //BA.debugLineNum = 141819905;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=141819906;
 //BA.debugLineNum = 141819906;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=141819907;
 //BA.debugLineNum = 141819907;BA.debugLine="Icon.Initialize(vue, ID).SetTag(\"md-icon\")";
__ref._icon /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-icon");
RDebugUtils.currentLine=141819908;
 //BA.debugLineNum = 141819908;BA.debugLine="hasContent = False";
__ref._hascontent /*boolean*/  = __c.False;
RDebugUtils.currentLine=141819909;
 //BA.debugLineNum = 141819909;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=141819910;
 //BA.debugLineNum = 141819910;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _settext(b4j.example.vmicon __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=142540800;
 //BA.debugLineNum = 142540800;BA.debugLine="Sub SetText(t As String) As VMIcon";
RDebugUtils.currentLine=142540801;
 //BA.debugLineNum = 142540801;BA.debugLine="Icon.SetText(t)";
__ref._icon /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=142540802;
 //BA.debugLineNum = 142540802;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=142540803;
 //BA.debugLineNum = 142540803;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142540804;
 //BA.debugLineNum = 142540804;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmicon __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=142934016;
 //BA.debugLineNum = 142934016;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=142934017;
 //BA.debugLineNum = 142934017;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=142934018;
 //BA.debugLineNum = 142934018;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _setbottombaricon(b4j.example.vmicon __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setbottombaricon", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setbottombaricon", new Object[] {_b}));}
RDebugUtils.currentLine=142016512;
 //BA.debugLineNum = 142016512;BA.debugLine="Sub SetBottomBarIcon(b As Boolean) As VMIcon";
RDebugUtils.currentLine=142016513;
 //BA.debugLineNum = 142016513;BA.debugLine="Icon.AddClass(\"md-bottom-bar-icon\")";
__ref._icon /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-bottom-bar-icon");
RDebugUtils.currentLine=142016514;
 //BA.debugLineNum = 142016514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142016515;
 //BA.debugLineNum = 142016515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsrc(b4j.example.vmicon __ref,String _src) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setsrc", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setsrc", new Object[] {_src}));}
RDebugUtils.currentLine=142082048;
 //BA.debugLineNum = 142082048;BA.debugLine="Sub SetSrc(src As String) As VMIcon";
RDebugUtils.currentLine=142082049;
 //BA.debugLineNum = 142082049;BA.debugLine="SetAttr(CreateMap(\"md-src\": src))";
__ref._setattr /*b4j.example.vmicon*/ (null,__c.createMap(new Object[] {(Object)("md-src"),(Object)(_src)}));
RDebugUtils.currentLine=142082050;
 //BA.debugLineNum = 142082050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142082051;
 //BA.debugLineNum = 142082051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvshow(b4j.example.vmicon __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=142344192;
 //BA.debugLineNum = 142344192;BA.debugLine="Sub SetVShow(vif As Object) As VMIcon";
RDebugUtils.currentLine=142344193;
 //BA.debugLineNum = 142344193;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals((Object)(""))) { 
if (true) return (b4j.example.vmicon)(this);};
RDebugUtils.currentLine=142344194;
 //BA.debugLineNum = 142344194;BA.debugLine="Icon.SetVShow(vif)";
__ref._icon /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=142344195;
 //BA.debugLineNum = 142344195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142344196;
 //BA.debugLineNum = 142344196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setname(b4j.example.vmicon __ref,String _nam,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setname", new Object[] {_nam,_bind}));}
RDebugUtils.currentLine=142671872;
 //BA.debugLineNum = 142671872;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMI";
RDebugUtils.currentLine=142671873;
 //BA.debugLineNum = 142671873;BA.debugLine="Icon.SetName(nam, bind)";
__ref._icon /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_nam,_bind);
RDebugUtils.currentLine=142671874;
 //BA.debugLineNum = 142671874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142671875;
 //BA.debugLineNum = 142671875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize2x(b4j.example.vmicon __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setsize2x", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setsize2x", new Object[] {_b}));}
RDebugUtils.currentLine=142999552;
 //BA.debugLineNum = 142999552;BA.debugLine="Sub SetSize2x(b As Boolean) As VMIcon    'ignore";
RDebugUtils.currentLine=142999553;
 //BA.debugLineNum = 142999553;BA.debugLine="AddClass(\"md-size-2x\")";
__ref._addclass /*b4j.example.vmicon*/ (null,"md-size-2x");
RDebugUtils.currentLine=142999554;
 //BA.debugLineNum = 142999554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142999555;
 //BA.debugLineNum = 142999555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize3x(b4j.example.vmicon __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setsize3x", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setsize3x", new Object[] {_b}));}
RDebugUtils.currentLine=143065088;
 //BA.debugLineNum = 143065088;BA.debugLine="Sub SetSize3x(b As Boolean) As VMIcon    'ignore";
RDebugUtils.currentLine=143065089;
 //BA.debugLineNum = 143065089;BA.debugLine="AddClass(\"md-size-3x\")";
__ref._addclass /*b4j.example.vmicon*/ (null,"md-size-3x");
RDebugUtils.currentLine=143065090;
 //BA.debugLineNum = 143065090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=143065091;
 //BA.debugLineNum = 143065091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize4x(b4j.example.vmicon __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setsize4x", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setsize4x", new Object[] {_b}));}
RDebugUtils.currentLine=143130624;
 //BA.debugLineNum = 143130624;BA.debugLine="Sub SetSize4x(b As Boolean) As VMIcon    'ignore";
RDebugUtils.currentLine=143130625;
 //BA.debugLineNum = 143130625;BA.debugLine="AddClass(\"md-size-4x\")";
__ref._addclass /*b4j.example.vmicon*/ (null,"md-size-4x");
RDebugUtils.currentLine=143130626;
 //BA.debugLineNum = 143130626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=143130627;
 //BA.debugLineNum = 143130627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setsize5x(b4j.example.vmicon __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setsize5x", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setsize5x", new Object[] {_b}));}
RDebugUtils.currentLine=143196160;
 //BA.debugLineNum = 143196160;BA.debugLine="Sub SetSize5x(b As Boolean) As VMIcon    'ignore";
RDebugUtils.currentLine=143196161;
 //BA.debugLineNum = 143196161;BA.debugLine="AddClass(\"md-size-5x\")";
__ref._addclass /*b4j.example.vmicon*/ (null,"md-size-5x");
RDebugUtils.currentLine=143196162;
 //BA.debugLineNum = 143196162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=143196163;
 //BA.debugLineNum = 143196163;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmicon __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=142802944;
 //BA.debugLineNum = 142802944;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=142802945;
 //BA.debugLineNum = 142802945;BA.debugLine="Return Icon.tostring";
if (true) return __ref._icon /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=142802946;
 //BA.debugLineNum = 142802946;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _addclass(b4j.example.vmicon __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=142147584;
 //BA.debugLineNum = 142147584;BA.debugLine="Sub AddClass(c As String) As VMIcon";
RDebugUtils.currentLine=142147585;
 //BA.debugLineNum = 142147585;BA.debugLine="Icon.AddClass(c)";
__ref._icon /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=142147586;
 //BA.debugLineNum = 142147586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142147587;
 //BA.debugLineNum = 142147587;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmicon __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=141885440;
 //BA.debugLineNum = 141885440;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=141885441;
 //BA.debugLineNum = 141885441;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=141885442;
 //BA.debugLineNum = 141885442;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmicon __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
RDebugUtils.currentLine=141754368;
 //BA.debugLineNum = 141754368;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=141754369;
 //BA.debugLineNum = 141754369;BA.debugLine="Public Icon As VMElement";
_icon = new b4j.example.vmelement();
RDebugUtils.currentLine=141754370;
 //BA.debugLineNum = 141754370;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=141754371;
 //BA.debugLineNum = 141754371;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=141754372;
 //BA.debugLineNum = 141754372;BA.debugLine="Public hasContent As Boolean";
_hascontent = false;
RDebugUtils.currentLine=141754373;
 //BA.debugLineNum = 141754373;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmicon __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=142868480;
 //BA.debugLineNum = 142868480;BA.debugLine="Sub Render";
RDebugUtils.currentLine=142868481;
 //BA.debugLineNum = 142868481;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=142868482;
 //BA.debugLineNum = 142868482;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmicon  _setattr(b4j.example.vmicon __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=142409728;
 //BA.debugLineNum = 142409728;BA.debugLine="Sub SetAttr(attr As Map) As VMIcon";
RDebugUtils.currentLine=142409729;
 //BA.debugLineNum = 142409729;BA.debugLine="Icon.SetAttr(attr)";
__ref._icon /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=142409730;
 //BA.debugLineNum = 142409730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142409731;
 //BA.debugLineNum = 142409731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setfontawesome(b4j.example.vmicon __ref,String _fa) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setfontawesome", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setfontawesome", new Object[] {_fa}));}
RDebugUtils.currentLine=142213120;
 //BA.debugLineNum = 142213120;BA.debugLine="Sub SetFontAwesome(fa As String) As VMIcon";
RDebugUtils.currentLine=142213121;
 //BA.debugLineNum = 142213121;BA.debugLine="AddClass(fa)";
__ref._addclass /*b4j.example.vmicon*/ (null,_fa);
RDebugUtils.currentLine=142213122;
 //BA.debugLineNum = 142213122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142213123;
 //BA.debugLineNum = 142213123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setid(b4j.example.vmicon __ref,String _iid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setid", new Object[] {_iid,_bind}));}
RDebugUtils.currentLine=142606336;
 //BA.debugLineNum = 142606336;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMIco";
RDebugUtils.currentLine=142606337;
 //BA.debugLineNum = 142606337;BA.debugLine="Icon.setid(iID, bind)";
__ref._icon /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_iid,_bind);
RDebugUtils.currentLine=142606338;
 //BA.debugLineNum = 142606338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142606339;
 //BA.debugLineNum = 142606339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setkey(b4j.example.vmicon __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=142737408;
 //BA.debugLineNum = 142737408;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMIcon";
RDebugUtils.currentLine=142737409;
 //BA.debugLineNum = 142737409;BA.debugLine="Icon.SetKey(k, bind)";
__ref._icon /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=142737410;
 //BA.debugLineNum = 142737410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142737411;
 //BA.debugLineNum = 142737411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setonclick(b4j.example.vmicon __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setonclick", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=141950976;
 //BA.debugLineNum = 141950976;BA.debugLine="Sub SetOnClick(module As Object, methodName As Str";
RDebugUtils.currentLine=141950977;
 //BA.debugLineNum = 141950977;BA.debugLine="Icon.SetOnClick(module, methodName)";
__ref._icon /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,_module,_methodname);
RDebugUtils.currentLine=141950978;
 //BA.debugLineNum = 141950978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=141950979;
 //BA.debugLineNum = 141950979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setprimary(b4j.example.vmicon __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=142475264;
 //BA.debugLineNum = 142475264;BA.debugLine="Sub SetPrimary(b As Boolean) As VMIcon";
RDebugUtils.currentLine=142475265;
 //BA.debugLineNum = 142475265;BA.debugLine="Icon.SetPrimary(b)";
__ref._icon /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=142475266;
 //BA.debugLineNum = 142475266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142475267;
 //BA.debugLineNum = 142475267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _setvif(b4j.example.vmicon __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmicon";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=142278656;
 //BA.debugLineNum = 142278656;BA.debugLine="Sub SetVIf(vif As Object) As VMIcon";
RDebugUtils.currentLine=142278657;
 //BA.debugLineNum = 142278657;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals((Object)(""))) { 
if (true) return (b4j.example.vmicon)(this);};
RDebugUtils.currentLine=142278658;
 //BA.debugLineNum = 142278658;BA.debugLine="Icon.SetVIf(vif)";
__ref._icon /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=142278659;
 //BA.debugLineNum = 142278659;BA.debugLine="Return Me";
if (true) return (b4j.example.vmicon)(this);
RDebugUtils.currentLine=142278660;
 //BA.debugLineNum = 142278660;BA.debugLine="End Sub";
return null;
}
}