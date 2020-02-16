package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmselect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmselect", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmselect.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _combo = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmfield _comboint = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public b4j.example.vmelement _et = null;
public com.ab.banano.BANano _banano = null;
public boolean _haserror = false;
public String _xname = "";
public String _xmodel = "";
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmselect  _initialize(b4j.example.vmselect __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
String _sval = "";
RDebugUtils.currentLine=191561728;
 //BA.debugLineNum = 191561728;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=191561729;
 //BA.debugLineNum = 191561729;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=191561730;
 //BA.debugLineNum = 191561730;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=191561731;
 //BA.debugLineNum = 191561731;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=191561732;
 //BA.debugLineNum = 191561732;BA.debugLine="Combo.Initialize(vue, ID).SetTag(\"md-select\")";
__ref._combo /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-select");
RDebugUtils.currentLine=191561733;
 //BA.debugLineNum = 191561733;BA.debugLine="ComboInt.Initialize(v, ID, $\"${ID}field\"$, module";
__ref._comboint /*b4j.example.vmfield*/ ._initialize /*b4j.example.vmfield*/ (null,ba,_v,__ref._id /*String*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"field"),__ref._module /*Object*/ );
RDebugUtils.currentLine=191561734;
 //BA.debugLineNum = 191561734;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$)";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_sid))+"label"));
RDebugUtils.currentLine=191561735;
 //BA.debugLineNum = 191561735;BA.debugLine="SetName(sid)";
__ref._setname /*b4j.example.vmselect*/ (null,_sid);
RDebugUtils.currentLine=191561736;
 //BA.debugLineNum = 191561736;BA.debugLine="hasHelp = False";
__ref._hashelp /*boolean*/  = __c.False;
RDebugUtils.currentLine=191561737;
 //BA.debugLineNum = 191561737;BA.debugLine="hasError = False";
__ref._haserror /*boolean*/  = __c.False;
RDebugUtils.currentLine=191561738;
 //BA.debugLineNum = 191561738;BA.debugLine="xname = \"\"";
__ref._xname /*String*/  = "";
RDebugUtils.currentLine=191561739;
 //BA.debugLineNum = 191561739;BA.debugLine="xmodel = \"\"";
__ref._xmodel /*String*/  = "";
RDebugUtils.currentLine=191561740;
 //BA.debugLineNum = 191561740;BA.debugLine="Dim sval As String";
_sval = "";
RDebugUtils.currentLine=191561741;
 //BA.debugLineNum = 191561741;BA.debugLine="SetOnSelected(sval)";
__ref._setonselected /*b4j.example.vmselect*/ (null,_sval);
RDebugUtils.currentLine=191561742;
 //BA.debugLineNum = 191561742;BA.debugLine="SetOnOpened";
__ref._setonopened /*b4j.example.vmselect*/ (null);
RDebugUtils.currentLine=191561743;
 //BA.debugLineNum = 191561743;BA.debugLine="SetOnClosed";
__ref._setonclosed /*b4j.example.vmselect*/ (null);
RDebugUtils.currentLine=191561744;
 //BA.debugLineNum = 191561744;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=191561745;
 //BA.debugLineNum = 191561745;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setlabel(b4j.example.vmselect __ref,Object _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setlabel", new Object[] {_l}));}
RDebugUtils.currentLine=191889408;
 //BA.debugLineNum = 191889408;BA.debugLine="Sub SetLabel(l As Object) As VMSelect";
RDebugUtils.currentLine=191889409;
 //BA.debugLineNum = 191889409;BA.debugLine="lbl.SetText(l)";
__ref._lbl /*b4j.example.vmlabel*/ ._settext /*b4j.example.vmlabel*/ (null,BA.ObjectToString(_l));
RDebugUtils.currentLine=191889410;
 //BA.debugLineNum = 191889410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=191889411;
 //BA.debugLineNum = 191889411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvmodel(b4j.example.vmselect __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=191823872;
 //BA.debugLineNum = 191823872;BA.debugLine="Sub SetVModel(k As String) As VMSelect";
RDebugUtils.currentLine=191823873;
 //BA.debugLineNum = 191823873;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=191823874;
 //BA.debugLineNum = 191823874;BA.debugLine="xmodel = k";
__ref._xmodel /*String*/  = _k;
RDebugUtils.currentLine=191823875;
 //BA.debugLineNum = 191823875;BA.debugLine="Combo.SetVModel(k)";
__ref._combo /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=191823876;
 //BA.debugLineNum = 191823876;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=191823877;
 //BA.debugLineNum = 191823877;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvshow(b4j.example.vmselect __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=192675840;
 //BA.debugLineNum = 192675840;BA.debugLine="Sub SetVShow(vif As String) As VMSelect";
RDebugUtils.currentLine=192675841;
 //BA.debugLineNum = 192675841;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=192675842;
 //BA.debugLineNum = 192675842;BA.debugLine="ComboInt.SetVShow(vif)";
__ref._comboint /*b4j.example.vmfield*/ ._setvshow /*b4j.example.vmfield*/ (null,(Object)(_vif));
RDebugUtils.currentLine=192675843;
 //BA.debugLineNum = 192675843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192675844;
 //BA.debugLineNum = 192675844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdisabled(b4j.example.vmselect __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=193396736;
 //BA.debugLineNum = 193396736;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSelect";
RDebugUtils.currentLine=193396737;
 //BA.debugLineNum = 193396737;BA.debugLine="Combo.SetDisabled(b)";
__ref._combo /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=193396738;
 //BA.debugLineNum = 193396738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193396739;
 //BA.debugLineNum = 193396739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setrequired(b4j.example.vmselect __ref,boolean _varrequired) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setrequired", new Object[] {_varrequired}));}
RDebugUtils.currentLine=193265664;
 //BA.debugLineNum = 193265664;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMSelec";
RDebugUtils.currentLine=193265665;
 //BA.debugLineNum = 193265665;BA.debugLine="Combo.SetRequired(varRequired)";
__ref._combo /*b4j.example.vmelement*/ ._setrequired /*b4j.example.vmelement*/ (null,_varrequired);
RDebugUtils.currentLine=193265666;
 //BA.debugLineNum = 193265666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193265667;
 //BA.debugLineNum = 193265667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settabindex(b4j.example.vmselect __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=191627264;
 //BA.debugLineNum = 191627264;BA.debugLine="Sub SetTabIndex(ti As String) As VMSelect";
RDebugUtils.currentLine=191627265;
 //BA.debugLineNum = 191627265;BA.debugLine="Combo.SetTabIndex(ti)";
__ref._combo /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=191627266;
 //BA.debugLineNum = 191627266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=191627267;
 //BA.debugLineNum = 191627267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setplaceholder(b4j.example.vmselect __ref,String _varplaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setplaceholder", new Object[] {_varplaceholder}));}
RDebugUtils.currentLine=193200128;
 //BA.debugLineNum = 193200128;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
RDebugUtils.currentLine=193200129;
 //BA.debugLineNum = 193200129;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=193200130;
 //BA.debugLineNum = 193200130;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
__ref._setattr /*b4j.example.vmselect*/ (null,__c.createMap(new Object[] {(Object)("placeholder"),(Object)(_varplaceholder)}));
RDebugUtils.currentLine=193200131;
 //BA.debugLineNum = 193200131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193200132;
 //BA.debugLineNum = 193200132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _sethelpertext(b4j.example.vmselect __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "sethelpertext", new Object[] {_t}));}
RDebugUtils.currentLine=192282624;
 //BA.debugLineNum = 192282624;BA.debugLine="Sub SetHelperText(t As String) As VMSelect";
RDebugUtils.currentLine=192282625;
 //BA.debugLineNum = 192282625;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=192282626;
 //BA.debugLineNum = 192282626;BA.debugLine="hasHelp = True";
__ref._hashelp /*boolean*/  = __c.True;
RDebugUtils.currentLine=192282627;
 //BA.debugLineNum = 192282627;BA.debugLine="ht = Combo.SetHelperText(t)";
__ref._ht /*b4j.example.vmelement*/  = __ref._combo /*b4j.example.vmelement*/ ._sethelpertext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=192282628;
 //BA.debugLineNum = 192282628;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192282629;
 //BA.debugLineNum = 192282629;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _seterrortext(b4j.example.vmselect __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "seterrortext", new Object[] {_txt}));}
RDebugUtils.currentLine=192348160;
 //BA.debugLineNum = 192348160;BA.debugLine="Sub SetErrorText(txt As String) As VMSelect";
RDebugUtils.currentLine=192348161;
 //BA.debugLineNum = 192348161;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=192348162;
 //BA.debugLineNum = 192348162;BA.debugLine="hasError = True";
__ref._haserror /*boolean*/  = __c.True;
RDebugUtils.currentLine=192348163;
 //BA.debugLineNum = 192348163;BA.debugLine="et = Combo.SetErrorText(txt)";
__ref._et /*b4j.example.vmelement*/  = __ref._combo /*b4j.example.vmelement*/ ._seterrortext /*b4j.example.vmelement*/ (null,_txt);
RDebugUtils.currentLine=192348164;
 //BA.debugLineNum = 192348164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192348165;
 //BA.debugLineNum = 192348165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setdense(b4j.example.vmselect __ref,boolean _vardense) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setdense", new Object[] {_vardense}));}
RDebugUtils.currentLine=193658880;
 //BA.debugLineNum = 193658880;BA.debugLine="Sub SetDense(varDense As Boolean) As VMSelect";
RDebugUtils.currentLine=193658881;
 //BA.debugLineNum = 193658881;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=193658882;
 //BA.debugLineNum = 193658882;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
if (_vardense) { 
__ref._setattr /*b4j.example.vmselect*/ (null,__c.createMap(new Object[] {(Object)(":md-dense"),(Object)(_vardense)}));};
RDebugUtils.currentLine=193658883;
 //BA.debugLineNum = 193658883;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193658884;
 //BA.debugLineNum = 193658884;BA.debugLine="End Sub";
return null;
}
public String  _setoptions(b4j.example.vmselect __ref,String _sourcename,anywheresoftware.b4a.objects.collections.Map _options,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((String) Debug.delegate(ba, "setoptions", new Object[] {_sourcename,_options,_sourcefield,_displayfield}));}
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _krow = "";
String _drow = "";
b4j.example.vmelement _option = null;
RDebugUtils.currentLine=192151552;
 //BA.debugLineNum = 192151552;BA.debugLine="Sub SetOptions(sourceName As String, options As Ma";
RDebugUtils.currentLine=192151553;
 //BA.debugLineNum = 192151553;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
RDebugUtils.currentLine=192151554;
 //BA.debugLineNum = 192151554;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=192151555;
 //BA.debugLineNum = 192151555;BA.debugLine="recs.Initialize";
_recs.Initialize();
RDebugUtils.currentLine=192151556;
 //BA.debugLineNum = 192151556;BA.debugLine="For Each k As String In options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _options.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=192151557;
 //BA.debugLineNum = 192151557;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
RDebugUtils.currentLine=192151558;
 //BA.debugLineNum = 192151558;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
RDebugUtils.currentLine=192151559;
 //BA.debugLineNum = 192151559;BA.debugLine="nrec.Put(sourcefield, k)";
_nrec.Put((Object)(_sourcefield),(Object)(_k));
RDebugUtils.currentLine=192151560;
 //BA.debugLineNum = 192151560;BA.debugLine="nrec.Put(displayfield, v)";
_nrec.Put((Object)(_displayfield),(Object)(_v));
RDebugUtils.currentLine=192151561;
 //BA.debugLineNum = 192151561;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
RDebugUtils.currentLine=192151564;
 //BA.debugLineNum = 192151564;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_sourcename,(Object)(_recs.getObject()));
RDebugUtils.currentLine=192151565;
 //BA.debugLineNum = 192151565;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
RDebugUtils.currentLine=192151566;
 //BA.debugLineNum = 192151566;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
RDebugUtils.currentLine=192151568;
 //BA.debugLineNum = 192151568;BA.debugLine="Dim option As VMElement";
_option = new b4j.example.vmelement();
RDebugUtils.currentLine=192151569;
 //BA.debugLineNum = 192151569;BA.debugLine="option.Initialize(vue,\"\")";
_option._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"");
RDebugUtils.currentLine=192151570;
 //BA.debugLineNum = 192151570;BA.debugLine="option.SetTag(\"md-option\")";
_option._settag /*b4j.example.vmelement*/ (null,"md-option");
RDebugUtils.currentLine=192151571;
 //BA.debugLineNum = 192151571;BA.debugLine="option.SetVFor(\"row\", sourceName)";
_option._setvfor /*b4j.example.vmelement*/ (null,"row",_sourcename);
RDebugUtils.currentLine=192151572;
 //BA.debugLineNum = 192151572;BA.debugLine="option.SetID($\"${kRow}\"$,True)";
_option._setid /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=192151573;
 //BA.debugLineNum = 192151573;BA.debugLine="option.SetKey($\"${kRow}\"$,True)";
_option._setkey /*b4j.example.vmelement*/ (null,(Object)((""+__c.SmartStringFormatter("",(Object)(_krow))+"")),__c.True);
RDebugUtils.currentLine=192151574;
 //BA.debugLineNum = 192151574;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
_option._setvalue /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=192151575;
 //BA.debugLineNum = 192151575;BA.debugLine="option.SetName($\"${kRow}\"$,True)";
_option._setname /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=192151576;
 //BA.debugLineNum = 192151576;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
_option._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
RDebugUtils.currentLine=192151577;
 //BA.debugLineNum = 192151577;BA.debugLine="option.RemoveAttr(\":required\")";
_option._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=192151578;
 //BA.debugLineNum = 192151578;BA.debugLine="option.RemoveAttr(\":disabled\")";
_option._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=192151579;
 //BA.debugLineNum = 192151579;BA.debugLine="option.RemoveAttr(\"v-show\")";
_option._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=192151580;
 //BA.debugLineNum = 192151580;BA.debugLine="option.Pop(Combo)";
_option._pop /*String*/ (null,__ref._combo /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=192151581;
 //BA.debugLineNum = 192151581;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _additem(b4j.example.vmselect __ref,String _k,String _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "additem", new Object[] {_k,_v}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=192020480;
 //BA.debugLineNum = 192020480;BA.debugLine="Sub AddItem(k As String, v As String) As VMSelect";
RDebugUtils.currentLine=192020481;
 //BA.debugLineNum = 192020481;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=192020482;
 //BA.debugLineNum = 192020482;BA.debugLine="el.Initialize(vue,k).SetTag(\"md-option\").SetName(";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_k)._settag /*b4j.example.vmelement*/ (null,"md-option")._setname /*b4j.example.vmelement*/ (null,_k,__c.False)._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),__c.False)._setvalue /*b4j.example.vmelement*/ (null,_k,__c.False)._settext /*b4j.example.vmelement*/ (null,_v);
RDebugUtils.currentLine=192020483;
 //BA.debugLineNum = 192020483;BA.debugLine="el.Pop(Combo)";
_el._pop /*String*/ (null,__ref._combo /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=192020484;
 //BA.debugLineNum = 192020484;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192020485;
 //BA.debugLineNum = 192020485;BA.debugLine="End Sub";
return null;
}
public String  _setdatasource(b4j.example.vmselect __ref,String _sourcetable,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setdatasource", true))
	 {return ((String) Debug.delegate(ba, "setdatasource", new Object[] {_sourcetable,_sourcefield,_displayfield}));}
int _intsel = 0;
String _krow = "";
String _drow = "";
b4j.example.vmelement _option = null;
RDebugUtils.currentLine=192217088;
 //BA.debugLineNum = 192217088;BA.debugLine="Sub SetDataSource(sourceTable As String, sourceFie";
RDebugUtils.currentLine=192217089;
 //BA.debugLineNum = 192217089;BA.debugLine="sourceTable = sourceTable.ToLowerCase";
_sourcetable = _sourcetable.toLowerCase();
RDebugUtils.currentLine=192217090;
 //BA.debugLineNum = 192217090;BA.debugLine="sourceField = sourceField.ToLowerCase";
_sourcefield = _sourcefield.toLowerCase();
RDebugUtils.currentLine=192217091;
 //BA.debugLineNum = 192217091;BA.debugLine="displayField = displayField.tolowercase";
_displayfield = _displayfield.toLowerCase();
RDebugUtils.currentLine=192217093;
 //BA.debugLineNum = 192217093;BA.debugLine="Dim intSel As Int = 0";
_intsel = (int) (0);
RDebugUtils.currentLine=192217094;
 //BA.debugLineNum = 192217094;BA.debugLine="If sourceTable <> \"\" Then intSel = BANano.parseIn";
if ((_sourcetable).equals("") == false) { 
_intsel = (int) (__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_intsel))+1);};
RDebugUtils.currentLine=192217095;
 //BA.debugLineNum = 192217095;BA.debugLine="If sourceField <> \"\" Then intSel = BANano.parseIn";
if ((_sourcefield).equals("") == false) { 
_intsel = (int) (__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_intsel))+1);};
RDebugUtils.currentLine=192217096;
 //BA.debugLineNum = 192217096;BA.debugLine="If displayField <> \"\" Then intSel = BANano.parseI";
if ((_displayfield).equals("") == false) { 
_intsel = (int) (__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_intsel))+1);};
RDebugUtils.currentLine=192217098;
 //BA.debugLineNum = 192217098;BA.debugLine="If intSel = 3 Then";
if (_intsel==3) { 
RDebugUtils.currentLine=192217099;
 //BA.debugLineNum = 192217099;BA.debugLine="Dim kRow As String = $\"row.${sourceField}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
RDebugUtils.currentLine=192217100;
 //BA.debugLineNum = 192217100;BA.debugLine="Dim dRow As String = $\"row.${displayField}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
RDebugUtils.currentLine=192217101;
 //BA.debugLineNum = 192217101;BA.debugLine="Dim option As VMElement";
_option = new b4j.example.vmelement();
RDebugUtils.currentLine=192217102;
 //BA.debugLineNum = 192217102;BA.debugLine="option.Initialize(vue,\"\")";
_option._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"");
RDebugUtils.currentLine=192217103;
 //BA.debugLineNum = 192217103;BA.debugLine="option.SetTag(\"md-option\")";
_option._settag /*b4j.example.vmelement*/ (null,"md-option");
RDebugUtils.currentLine=192217104;
 //BA.debugLineNum = 192217104;BA.debugLine="option.SetVFor(\"row\", sourceTable)";
_option._setvfor /*b4j.example.vmelement*/ (null,"row",_sourcetable);
RDebugUtils.currentLine=192217105;
 //BA.debugLineNum = 192217105;BA.debugLine="option.SetID($\"${kRow}\"$,True)";
_option._setid /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=192217106;
 //BA.debugLineNum = 192217106;BA.debugLine="option.SetKey($\"${kRow}\"$,True)";
_option._setkey /*b4j.example.vmelement*/ (null,(Object)((""+__c.SmartStringFormatter("",(Object)(_krow))+"")),__c.True);
RDebugUtils.currentLine=192217107;
 //BA.debugLineNum = 192217107;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
_option._setvalue /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=192217108;
 //BA.debugLineNum = 192217108;BA.debugLine="option.SetName($\"${kRow}\"$,True)";
_option._setname /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=192217109;
 //BA.debugLineNum = 192217109;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
_option._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
RDebugUtils.currentLine=192217110;
 //BA.debugLineNum = 192217110;BA.debugLine="option.RemoveAttr(\":required\")";
_option._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=192217111;
 //BA.debugLineNum = 192217111;BA.debugLine="option.RemoveAttr(\":disabled\")";
_option._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=192217112;
 //BA.debugLineNum = 192217112;BA.debugLine="option.RemoveAttr(\"v-show\")";
_option._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=192217113;
 //BA.debugLineNum = 192217113;BA.debugLine="option.Pop(Combo)";
_option._pop /*String*/ (null,__ref._combo /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=192217115;
 //BA.debugLineNum = 192217115;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _setmultiple(b4j.example.vmselect __ref,boolean _varmultiple) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setmultiple", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setmultiple", new Object[] {_varmultiple}));}
anywheresoftware.b4a.objects.collections.List _nlist = null;
RDebugUtils.currentLine=193593344;
 //BA.debugLineNum = 193593344;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMSelec";
RDebugUtils.currentLine=193593345;
 //BA.debugLineNum = 193593345;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=193593346;
 //BA.debugLineNum = 193593346;BA.debugLine="If xmodel = \"\" Then";
if ((__ref._xmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=193593347;
 //BA.debugLineNum = 193593347;BA.debugLine="Log($\"VMSelect.SetMultiple.${ID} - vmodel is not";
__c.Log(("VMSelect.SetMultiple."+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+" - vmodel is not set!"));
 };
RDebugUtils.currentLine=193593349;
 //BA.debugLineNum = 193593349;BA.debugLine="Dim nList As List";
_nlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=193593350;
 //BA.debugLineNum = 193593350;BA.debugLine="nList.Initialize";
_nlist.Initialize();
RDebugUtils.currentLine=193593351;
 //BA.debugLineNum = 193593351;BA.debugLine="vue.SetStateSingle(xmodel, nList)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._xmodel /*String*/ ,(Object)(_nlist.getObject()));
RDebugUtils.currentLine=193593352;
 //BA.debugLineNum = 193593352;BA.debugLine="SetAttr(CreateMap(\":multiple\": varMultiple))";
__ref._setattr /*b4j.example.vmselect*/ (null,__c.createMap(new Object[] {(Object)(":multiple"),(Object)(_varmultiple)}));
RDebugUtils.currentLine=193593353;
 //BA.debugLineNum = 193593353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193593354;
 //BA.debugLineNum = 193593354;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmselect __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=192413696;
 //BA.debugLineNum = 192413696;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=192413697;
 //BA.debugLineNum = 192413697;BA.debugLine="If xname = \"\" Then";
if ((__ref._xname /*String*/ ).equals("")) { 
RDebugUtils.currentLine=192413698;
 //BA.debugLineNum = 192413698;BA.debugLine="Log($\"VMSelect.ToString.${ID} - name is not set!";
__c.Log(("VMSelect.ToString."+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+" - name is not set!"));
 };
RDebugUtils.currentLine=192413700;
 //BA.debugLineNum = 192413700;BA.debugLine="If xmodel = \"\" Then";
if ((__ref._xmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=192413701;
 //BA.debugLineNum = 192413701;BA.debugLine="Log($\"VMSelect.ToString.${ID} - model is not set";
__c.Log(("VMSelect.ToString."+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+" - model is not set!"));
 };
RDebugUtils.currentLine=192413703;
 //BA.debugLineNum = 192413703;BA.debugLine="lbl.Pop(ComboInt.Field)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._comboint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=192413704;
 //BA.debugLineNum = 192413704;BA.debugLine="Combo.Pop(ComboInt.Field)";
__ref._combo /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._comboint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=192413705;
 //BA.debugLineNum = 192413705;BA.debugLine="If hasHelp Then";
if (__ref._hashelp /*boolean*/ ) { 
RDebugUtils.currentLine=192413706;
 //BA.debugLineNum = 192413706;BA.debugLine="ht.Pop(ComboInt.Field)";
__ref._ht /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._comboint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=192413708;
 //BA.debugLineNum = 192413708;BA.debugLine="If hasError Then";
if (__ref._haserror /*boolean*/ ) { 
RDebugUtils.currentLine=192413709;
 //BA.debugLineNum = 192413709;BA.debugLine="et.Pop(ComboInt.Field)";
__ref._et /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._comboint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=192413711;
 //BA.debugLineNum = 192413711;BA.debugLine="Return ComboInt.tostring";
if (true) return __ref._comboint /*b4j.example.vmfield*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=192413712;
 //BA.debugLineNum = 192413712;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmselect __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=192544768;
 //BA.debugLineNum = 192544768;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=192544769;
 //BA.debugLineNum = 192544769;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=192544770;
 //BA.debugLineNum = 192544770;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _addchild(b4j.example.vmselect __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=192741376;
 //BA.debugLineNum = 192741376;BA.debugLine="Sub AddChild(child As VMElement) As VMSelect";
RDebugUtils.currentLine=192741377;
 //BA.debugLineNum = 192741377;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=192741378;
 //BA.debugLineNum = 192741378;BA.debugLine="Combo.SetText(childHTML)";
__ref._combo /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=192741379;
 //BA.debugLineNum = 192741379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192741380;
 //BA.debugLineNum = 192741380;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmselect __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=193069056;
 //BA.debugLineNum = 193069056;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=193069057;
 //BA.debugLineNum = 193069057;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=193069058;
 //BA.debugLineNum = 193069058;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmselect*/ (null,_childx);
 }
};
RDebugUtils.currentLine=193069060;
 //BA.debugLineNum = 193069060;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _addclass(b4j.example.vmselect __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=191692800;
 //BA.debugLineNum = 191692800;BA.debugLine="Sub AddClass(c As String) As VMSelect";
RDebugUtils.currentLine=191692801;
 //BA.debugLineNum = 191692801;BA.debugLine="Combo.AddClass(c)";
__ref._combo /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=191692802;
 //BA.debugLineNum = 191692802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=191692803;
 //BA.debugLineNum = 191692803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _additem1(b4j.example.vmselect __ref,String _k,String _v,boolean _disabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "additem1", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "additem1", new Object[] {_k,_v,_disabled}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=192086016;
 //BA.debugLineNum = 192086016;BA.debugLine="Sub AddItem1(k As String, v As String,disabled As";
RDebugUtils.currentLine=192086017;
 //BA.debugLineNum = 192086017;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=192086018;
 //BA.debugLineNum = 192086018;BA.debugLine="el.Initialize(vue,k).SetTag(\"md-option\").SetName(";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_k)._settag /*b4j.example.vmelement*/ (null,"md-option")._setname /*b4j.example.vmelement*/ (null,_k,__c.False)._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),__c.False)._setvalue /*b4j.example.vmelement*/ (null,_k,__c.False)._settext /*b4j.example.vmelement*/ (null,_v)._setdisabled /*b4j.example.vmelement*/ (null,_disabled);
RDebugUtils.currentLine=192086019;
 //BA.debugLineNum = 192086019;BA.debugLine="el.Pop(Combo)";
_el._pop /*String*/ (null,__ref._combo /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=192086020;
 //BA.debugLineNum = 192086020;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192086021;
 //BA.debugLineNum = 192086021;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _additems(b4j.example.vmselect __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "additems", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "additems", new Object[] {_m}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=191954944;
 //BA.debugLineNum = 191954944;BA.debugLine="Sub AddItems(m As Map) As VMSelect";
RDebugUtils.currentLine=191954945;
 //BA.debugLineNum = 191954945;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=191954946;
 //BA.debugLineNum = 191954946;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=191954947;
 //BA.debugLineNum = 191954947;BA.debugLine="AddItem(k, v)";
__ref._additem /*b4j.example.vmselect*/ (null,_k,BA.ObjectToString(_v));
 }
};
RDebugUtils.currentLine=191954949;
 //BA.debugLineNum = 191954949;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=191954950;
 //BA.debugLineNum = 191954950;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmselect __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=193921024;
 //BA.debugLineNum = 193921024;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=193921025;
 //BA.debugLineNum = 193921025;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=193921026;
 //BA.debugLineNum = 193921026;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmselect __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
RDebugUtils.currentLine=191496192;
 //BA.debugLineNum = 191496192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=191496193;
 //BA.debugLineNum = 191496193;BA.debugLine="Private Combo As VMElement";
_combo = new b4j.example.vmelement();
RDebugUtils.currentLine=191496194;
 //BA.debugLineNum = 191496194;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=191496195;
 //BA.debugLineNum = 191496195;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=191496196;
 //BA.debugLineNum = 191496196;BA.debugLine="Private ComboInt As VMField";
_comboint = new b4j.example.vmfield();
RDebugUtils.currentLine=191496197;
 //BA.debugLineNum = 191496197;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=191496198;
 //BA.debugLineNum = 191496198;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
RDebugUtils.currentLine=191496199;
 //BA.debugLineNum = 191496199;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
RDebugUtils.currentLine=191496200;
 //BA.debugLineNum = 191496200;BA.debugLine="Private et As VMElement";
_et = new b4j.example.vmelement();
RDebugUtils.currentLine=191496201;
 //BA.debugLineNum = 191496201;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=191496202;
 //BA.debugLineNum = 191496202;BA.debugLine="Private hasError As Boolean";
_haserror = false;
RDebugUtils.currentLine=191496203;
 //BA.debugLineNum = 191496203;BA.debugLine="Private xname As String";
_xname = "";
RDebugUtils.currentLine=191496204;
 //BA.debugLineNum = 191496204;BA.debugLine="Private xmodel As String";
_xmodel = "";
RDebugUtils.currentLine=191496205;
 //BA.debugLineNum = 191496205;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=191496206;
 //BA.debugLineNum = 191496206;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _setname(b4j.example.vmselect __ref,String _varname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setname", new Object[] {_varname}));}
RDebugUtils.currentLine=193462272;
 //BA.debugLineNum = 193462272;BA.debugLine="private Sub SetName(varName As String) As VMSelect";
RDebugUtils.currentLine=193462273;
 //BA.debugLineNum = 193462273;BA.debugLine="varName = varName.tolowercase";
_varname = _varname.toLowerCase();
RDebugUtils.currentLine=193462274;
 //BA.debugLineNum = 193462274;BA.debugLine="xname = varName";
__ref._xname /*String*/  = _varname;
RDebugUtils.currentLine=193462275;
 //BA.debugLineNum = 193462275;BA.debugLine="Combo.SetName(varName, False)";
__ref._combo /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_varname,__c.False);
RDebugUtils.currentLine=193462276;
 //BA.debugLineNum = 193462276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193462277;
 //BA.debugLineNum = 193462277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonselected(b4j.example.vmselect __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setonselected", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setonselected", new Object[] {_value}));}
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=193724416;
 //BA.debugLineNum = 193724416;BA.debugLine="private Sub SetOnSelected(value As String) As VMSe";
RDebugUtils.currentLine=193724417;
 //BA.debugLineNum = 193724417;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_change");
RDebugUtils.currentLine=193724418;
 //BA.debugLineNum = 193724418;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=193724419;
 //BA.debugLineNum = 193724419;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value)}))));
RDebugUtils.currentLine=193724420;
 //BA.debugLineNum = 193724420;BA.debugLine="SetAttr(CreateMap(\"v-on:md-selected\": methodName))";
__ref._setattr /*b4j.example.vmselect*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-selected"),(Object)(_methodname)}));
RDebugUtils.currentLine=193724422;
 //BA.debugLineNum = 193724422;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=193724423;
 //BA.debugLineNum = 193724423;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193724424;
 //BA.debugLineNum = 193724424;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonopened(b4j.example.vmselect __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setonopened", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setonopened", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=193789952;
 //BA.debugLineNum = 193789952;BA.debugLine="private Sub SetOnOpened As VMSelect";
RDebugUtils.currentLine=193789953;
 //BA.debugLineNum = 193789953;BA.debugLine="Dim methodName As String = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_opened");
RDebugUtils.currentLine=193789954;
 //BA.debugLineNum = 193789954;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=193789955;
 //BA.debugLineNum = 193789955;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=193789956;
 //BA.debugLineNum = 193789956;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=193789957;
 //BA.debugLineNum = 193789957;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
__ref._setattr /*b4j.example.vmselect*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
RDebugUtils.currentLine=193789959;
 //BA.debugLineNum = 193789959;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=193789960;
 //BA.debugLineNum = 193789960;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193789961;
 //BA.debugLineNum = 193789961;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setonclosed(b4j.example.vmselect __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setonclosed", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setonclosed", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=193855488;
 //BA.debugLineNum = 193855488;BA.debugLine="private Sub SetOnClosed As VMSelect";
RDebugUtils.currentLine=193855489;
 //BA.debugLineNum = 193855489;BA.debugLine="Dim methodName As String  = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_closed");
RDebugUtils.currentLine=193855490;
 //BA.debugLineNum = 193855490;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=193855491;
 //BA.debugLineNum = 193855491;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=193855492;
 //BA.debugLineNum = 193855492;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=193855493;
 //BA.debugLineNum = 193855493;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
__ref._setattr /*b4j.example.vmselect*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
RDebugUtils.currentLine=193855495;
 //BA.debugLineNum = 193855495;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=193855496;
 //BA.debugLineNum = 193855496;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193855497;
 //BA.debugLineNum = 193855497;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmselect __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=192479232;
 //BA.debugLineNum = 192479232;BA.debugLine="Sub Render";
RDebugUtils.currentLine=192479233;
 //BA.debugLineNum = 192479233;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=192479234;
 //BA.debugLineNum = 192479234;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmselect  _setaccent(b4j.example.vmselect __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=192937984;
 //BA.debugLineNum = 192937984;BA.debugLine="Sub SetAccent(b As Boolean) As VMSelect";
RDebugUtils.currentLine=192937985;
 //BA.debugLineNum = 192937985;BA.debugLine="Combo.SetAccent(True)";
__ref._combo /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=192937986;
 //BA.debugLineNum = 192937986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192937987;
 //BA.debugLineNum = 192937987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setattr(b4j.example.vmselect __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=191758336;
 //BA.debugLineNum = 191758336;BA.debugLine="Sub SetAttr(attr As Map) As VMSelect";
RDebugUtils.currentLine=191758337;
 //BA.debugLineNum = 191758337;BA.debugLine="Combo.SetAttr(attr)";
__ref._combo /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=191758338;
 //BA.debugLineNum = 191758338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=191758339;
 //BA.debugLineNum = 191758339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setid(b4j.example.vmselect __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setid", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=193527808;
 //BA.debugLineNum = 193527808;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
RDebugUtils.currentLine=193527809;
 //BA.debugLineNum = 193527809;BA.debugLine="Combo.SetID(varName, bind)";
__ref._combo /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=193527810;
 //BA.debugLineNum = 193527810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193527811;
 //BA.debugLineNum = 193527811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setpadding(b4j.example.vmselect __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=193134592;
 //BA.debugLineNum = 193134592;BA.debugLine="Sub SetPadding(p As Object) As VMSelect";
RDebugUtils.currentLine=193134593;
 //BA.debugLineNum = 193134593;BA.debugLine="Combo.SetPaddingAll(p)";
__ref._combo /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=193134594;
 //BA.debugLineNum = 193134594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193134595;
 //BA.debugLineNum = 193134595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setprimary(b4j.example.vmselect __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=192872448;
 //BA.debugLineNum = 192872448;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSelect";
RDebugUtils.currentLine=192872449;
 //BA.debugLineNum = 192872449;BA.debugLine="Combo.SetPrimary(True)";
__ref._combo /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=192872450;
 //BA.debugLineNum = 192872450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192872451;
 //BA.debugLineNum = 192872451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setstyle(b4j.example.vmselect __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=193003520;
 //BA.debugLineNum = 193003520;BA.debugLine="Sub SetStyle(sm As Map) As VMSelect";
RDebugUtils.currentLine=193003521;
 //BA.debugLineNum = 193003521;BA.debugLine="Combo.SetStyle(sm)";
__ref._combo /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=193003522;
 //BA.debugLineNum = 193003522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193003523;
 //BA.debugLineNum = 193003523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _settext(b4j.example.vmselect __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=192806912;
 //BA.debugLineNum = 192806912;BA.debugLine="Sub SetText(t As Object) As VMSelect";
RDebugUtils.currentLine=192806913;
 //BA.debugLineNum = 192806913;BA.debugLine="Combo.SetText(t)";
__ref._combo /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=192806914;
 //BA.debugLineNum = 192806914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192806915;
 //BA.debugLineNum = 192806915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvalue(b4j.example.vmselect __ref,String _valx) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setvalue", new Object[] {_valx}));}
RDebugUtils.currentLine=193331200;
 //BA.debugLineNum = 193331200;BA.debugLine="Sub SetValue(valx As String) As VMSelect";
RDebugUtils.currentLine=193331201;
 //BA.debugLineNum = 193331201;BA.debugLine="If xmodel = \"\" Then";
if ((__ref._xmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=193331202;
 //BA.debugLineNum = 193331202;BA.debugLine="Log($\"VMSelect.SetValue.${ID} - vmodel is not se";
__c.Log(("VMSelect.SetValue."+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+" - vmodel is not set!"));
 };
RDebugUtils.currentLine=193331204;
 //BA.debugLineNum = 193331204;BA.debugLine="vue.SetStateSingle(xmodel, valx)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._xmodel /*String*/ ,(Object)(_valx));
RDebugUtils.currentLine=193331205;
 //BA.debugLineNum = 193331205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=193331206;
 //BA.debugLineNum = 193331206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _setvif(b4j.example.vmselect __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmselect";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=192610304;
 //BA.debugLineNum = 192610304;BA.debugLine="Sub SetVIf(vif As String) As VMSelect";
RDebugUtils.currentLine=192610305;
 //BA.debugLineNum = 192610305;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmselect)(this);};
RDebugUtils.currentLine=192610306;
 //BA.debugLineNum = 192610306;BA.debugLine="ComboInt.SetVIf(vif)";
__ref._comboint /*b4j.example.vmfield*/ ._setvif /*b4j.example.vmfield*/ (null,(Object)(_vif));
RDebugUtils.currentLine=192610307;
 //BA.debugLineNum = 192610307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmselect)(this);
RDebugUtils.currentLine=192610308;
 //BA.debugLineNum = 192610308;BA.debugLine="End Sub";
return null;
}
}