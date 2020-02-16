package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vuecomponent extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vuecomponent", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vuecomponent.class).invoke(this, new Object[] {null});
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
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.Map _methods = null;
public anywheresoftware.b4a.objects.collections.Map _data = null;
public b4j.example.vuehtml _template = null;
public anywheresoftware.b4a.objects.collections.Map _computed = null;
public anywheresoftware.b4a.objects.collections.Map _watches = null;
public com.ab.banano.BANanoObject _created = null;
public com.ab.banano.BANanoObject _mounted = null;
public com.ab.banano.BANanoObject _beforecreate = null;
public com.ab.banano.BANanoObject _destroyed = null;
public com.ab.banano.BANanoObject _beforemount = null;
public com.ab.banano.BANanoObject _updated = null;
public com.ab.banano.BANanoObject _beforedestroy = null;
public com.ab.banano.BANanoObject _activated = null;
public com.ab.banano.BANanoObject _deactivated = null;
public com.ab.banano.BANanoObject _beforeupdate = null;
public anywheresoftware.b4a.objects.collections.Map _opt = null;
public String _url = "";
public String _name = "";
public boolean _hascontent = false;
public anywheresoftware.b4a.objects.collections.Map _refs = null;
public anywheresoftware.b4a.objects.collections.List _props = null;
public String _propfrom = "";
public com.ab.banano.BANanoObject _bovue = null;
public String _showkey = "";
public String _diskey = "";
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vuecomponent  _initialize(b4j.example.vuecomponent __ref,anywheresoftware.b4a.BA _ba,String _sid,String _tag,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "initialize", new Object[] {_ba,_sid,_tag,_eventhandler}));}
RDebugUtils.currentLine=234684416;
 //BA.debugLineNum = 234684416;BA.debugLine="Public Sub Initialize(sid As String, tag As String";
RDebugUtils.currentLine=234684417;
 //BA.debugLineNum = 234684417;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=234684418;
 //BA.debugLineNum = 234684418;BA.debugLine="ID = ID.trim";
__ref._id /*String*/  = __ref._id /*String*/ .trim();
RDebugUtils.currentLine=234684419;
 //BA.debugLineNum = 234684419;BA.debugLine="name = sid";
__ref._name /*String*/  = _sid;
RDebugUtils.currentLine=234684420;
 //BA.debugLineNum = 234684420;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=234684421;
 //BA.debugLineNum = 234684421;BA.debugLine="props.Initialize";
__ref._props /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=234684422;
 //BA.debugLineNum = 234684422;BA.debugLine="Template.Initialize(ID,tag)";
__ref._template /*b4j.example.vuehtml*/ ._initialize /*b4j.example.vuehtml*/ (null,ba,__ref._id /*String*/ ,_tag);
RDebugUtils.currentLine=234684423;
 //BA.debugLineNum = 234684423;BA.debugLine="methods.Initialize";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=234684424;
 //BA.debugLineNum = 234684424;BA.debugLine="data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=234684425;
 //BA.debugLineNum = 234684425;BA.debugLine="computed.Initialize";
__ref._computed /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=234684426;
 //BA.debugLineNum = 234684426;BA.debugLine="watches.Initialize";
__ref._watches /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=234684427;
 //BA.debugLineNum = 234684427;BA.debugLine="beforeMount = Null";
__ref._beforemount /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684428;
 //BA.debugLineNum = 234684428;BA.debugLine="beforeUpdate = Null";
__ref._beforeupdate /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684429;
 //BA.debugLineNum = 234684429;BA.debugLine="created = Null";
__ref._created /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684430;
 //BA.debugLineNum = 234684430;BA.debugLine="mounted = Null";
__ref._mounted /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684431;
 //BA.debugLineNum = 234684431;BA.debugLine="destroyed = Null";
__ref._destroyed /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684432;
 //BA.debugLineNum = 234684432;BA.debugLine="updated = Null";
__ref._updated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684433;
 //BA.debugLineNum = 234684433;BA.debugLine="beforeCreate = Null";
__ref._beforecreate /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684434;
 //BA.debugLineNum = 234684434;BA.debugLine="activated = Null";
__ref._activated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684435;
 //BA.debugLineNum = 234684435;BA.debugLine="deactivated = Null";
__ref._deactivated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684436;
 //BA.debugLineNum = 234684436;BA.debugLine="beforeDestroy = Null";
__ref._beforedestroy /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=234684437;
 //BA.debugLineNum = 234684437;BA.debugLine="opt = CreateMap()";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=234684438;
 //BA.debugLineNum = 234684438;BA.debugLine="URL = $\"/${ID}\"$";
__ref._url /*String*/  = ("/"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"");
RDebugUtils.currentLine=234684439;
 //BA.debugLineNum = 234684439;BA.debugLine="hasContent = False";
__ref._hascontent /*boolean*/  = __c.False;
RDebugUtils.currentLine=234684440;
 //BA.debugLineNum = 234684440;BA.debugLine="boVUE.Initialize(\"Vue\")";
__ref._bovue /*com.ab.banano.BANanoObject*/ .Initialize((Object)("Vue"));
RDebugUtils.currentLine=234684441;
 //BA.debugLineNum = 234684441;BA.debugLine="showKey = $\"${ID}show\"$";
__ref._showkey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"show");
RDebugUtils.currentLine=234684442;
 //BA.debugLineNum = 234684442;BA.debugLine="disKey = $\"${ID}disabled\"$";
__ref._diskey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"disabled");
RDebugUtils.currentLine=234684443;
 //BA.debugLineNum = 234684443;BA.debugLine="SetStateSingle(showKey, True)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,__ref._showkey /*String*/ ,(Object)(__c.True));
RDebugUtils.currentLine=234684444;
 //BA.debugLineNum = 234684444;BA.debugLine="SetVShow(showKey)";
__ref._setvshow /*b4j.example.vuecomponent*/ (null,__ref._showkey /*String*/ );
RDebugUtils.currentLine=234684445;
 //BA.debugLineNum = 234684445;BA.debugLine="SetStateSingle(disKey, False)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,__ref._diskey /*String*/ ,(Object)(__c.False));
RDebugUtils.currentLine=234684446;
 //BA.debugLineNum = 234684446;BA.debugLine="SetDisabled(False)";
__ref._setdisabled /*b4j.example.vuecomponent*/ (null,__c.False);
RDebugUtils.currentLine=234684447;
 //BA.debugLineNum = 234684447;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234684448;
 //BA.debugLineNum = 234684448;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _component(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "component", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "component", null));}
String _tmp = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=235405312;
 //BA.debugLineNum = 235405312;BA.debugLine="Sub Component() As Map";
RDebugUtils.currentLine=235405313;
 //BA.debugLineNum = 235405313;BA.debugLine="Dim tmp As String = Template.tostring";
_tmp = __ref._template /*b4j.example.vuehtml*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=235405314;
 //BA.debugLineNum = 235405314;BA.debugLine="If data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=235405315;
 //BA.debugLineNum = 235405315;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"re";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(this,"returnData",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235405316;
 //BA.debugLineNum = 235405316;BA.debugLine="opt.Put(\"data\", cb)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("data"),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=235405318;
 //BA.debugLineNum = 235405318;BA.debugLine="If methods.Size > 0 Then opt.Put(\"methods\", metho";
if (__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("methods"),(Object)(__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=235405319;
 //BA.debugLineNum = 235405319;BA.debugLine="If computed.Size > 0 Then opt.Put(\"computed\", com";
if (__ref._computed /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("computed"),(Object)(__ref._computed /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=235405320;
 //BA.debugLineNum = 235405320;BA.debugLine="If watches.Size > 0 Then opt.Put(\"watch\", watches";
if (__ref._watches /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("watch"),(Object)(__ref._watches /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=235405321;
 //BA.debugLineNum = 235405321;BA.debugLine="If props.Size <> 0 Then opt.Put(\"props\", props)";
if (__ref._props /*anywheresoftware.b4a.objects.collections.List*/ .getSize()!=0) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("props"),(Object)(__ref._props /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));};
RDebugUtils.currentLine=235405322;
 //BA.debugLineNum = 235405322;BA.debugLine="If updated <> Null Then opt.Put(\"updated\", update";
if (__ref._updated /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("updated"),(Object)(__ref._updated /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405323;
 //BA.debugLineNum = 235405323;BA.debugLine="If destroyed <> Null Then opt.Put(\"destroyed\", de";
if (__ref._destroyed /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("destroyed"),(Object)(__ref._destroyed /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405324;
 //BA.debugLineNum = 235405324;BA.debugLine="If mounted <> Null Then	opt.Put(\"mounted\", mounte";
if (__ref._mounted /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("mounted"),(Object)(__ref._mounted /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405325;
 //BA.debugLineNum = 235405325;BA.debugLine="If beforeCreate <> Null Then opt.Put(\"beforeCreat";
if (__ref._beforecreate /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("beforeCreate"),(Object)(__ref._beforecreate /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405326;
 //BA.debugLineNum = 235405326;BA.debugLine="If created <> Null Then opt.Put(\"created\", create";
if (__ref._created /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("created"),(Object)(__ref._created /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405327;
 //BA.debugLineNum = 235405327;BA.debugLine="If beforeMount <> Null Then opt.Put(\"beforeMount\"";
if (__ref._beforemount /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("beforeMount"),(Object)(__ref._beforemount /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405328;
 //BA.debugLineNum = 235405328;BA.debugLine="If beforeUpdate <> Null Then opt.Put(\"beforeUpdat";
if (__ref._beforeupdate /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("beforeUpdate"),(Object)(__ref._beforeupdate /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405329;
 //BA.debugLineNum = 235405329;BA.debugLine="If activated <> Null Then opt.Put(\"activated\", ac";
if (__ref._activated /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("activated"),(Object)(__ref._activated /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405330;
 //BA.debugLineNum = 235405330;BA.debugLine="If deactivated <> Null Then opt.Put(\"deactivated\"";
if (__ref._deactivated /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deactivated"),(Object)(__ref._deactivated /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405331;
 //BA.debugLineNum = 235405331;BA.debugLine="If beforeDestroy <> Null Then opt.Put(\"beforeDest";
if (__ref._beforedestroy /*com.ab.banano.BANanoObject*/ != null) { 
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("beforeDestroy"),(Object)(__ref._beforedestroy /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=235405332;
 //BA.debugLineNum = 235405332;BA.debugLine="opt.Put(\"template\", tmp)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("template"),(Object)(_tmp));
RDebugUtils.currentLine=235405333;
 //BA.debugLineNum = 235405333;BA.debugLine="Return opt";
if (true) return __ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=235405334;
 //BA.debugLineNum = 235405334;BA.debugLine="End Sub";
return null;
}
public String  _addbr(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addbr", true))
	 {return ((String) Debug.delegate(ba, "addbr", null));}
RDebugUtils.currentLine=238878720;
 //BA.debugLineNum = 238878720;BA.debugLine="Sub AddBR";
RDebugUtils.currentLine=238878721;
 //BA.debugLineNum = 238878721;BA.debugLine="Template.SetText(\"<br>\")";
__ref._template /*b4j.example.vuehtml*/ ._settext /*b4j.example.vuehtml*/ (null,"<br>");
RDebugUtils.currentLine=238878722;
 //BA.debugLineNum = 238878722;BA.debugLine="End Sub";
return "";
}
public String  _addchild(b4j.example.vuecomponent __ref,String _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((String) Debug.delegate(ba, "addchild", new Object[] {_child}));}
RDebugUtils.currentLine=234356736;
 //BA.debugLineNum = 234356736;BA.debugLine="Sub AddChild(child As String)";
RDebugUtils.currentLine=234356737;
 //BA.debugLineNum = 234356737;BA.debugLine="SetText(child)";
__ref._settext /*b4j.example.vuecomponent*/ (null,_child);
RDebugUtils.currentLine=234356738;
 //BA.debugLineNum = 234356738;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _settext(b4j.example.vuecomponent __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "settext", new Object[] {_txt}));}
RDebugUtils.currentLine=238813184;
 //BA.debugLineNum = 238813184;BA.debugLine="Sub SetText(txt As String) As VueComponent";
RDebugUtils.currentLine=238813185;
 //BA.debugLineNum = 238813185;BA.debugLine="Template.settext(txt)";
__ref._template /*b4j.example.vuehtml*/ ._settext /*b4j.example.vuehtml*/ (null,_txt);
RDebugUtils.currentLine=238813186;
 //BA.debugLineNum = 238813186;BA.debugLine="hasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=238813187;
 //BA.debugLineNum = 238813187;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238813188;
 //BA.debugLineNum = 238813188;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vuecomponent __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_lst}));}
String _strline = "";
RDebugUtils.currentLine=234618880;
 //BA.debugLineNum = 234618880;BA.debugLine="Sub AddChildren(lst As List)";
RDebugUtils.currentLine=234618881;
 //BA.debugLineNum = 234618881;BA.debugLine="For Each strLine As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strline = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=234618882;
 //BA.debugLineNum = 234618882;BA.debugLine="SetText(strLine)";
__ref._settext /*b4j.example.vuecomponent*/ (null,_strline);
 }
};
RDebugUtils.currentLine=234618884;
 //BA.debugLineNum = 234618884;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _addclass(b4j.example.vuecomponent __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=239009792;
 //BA.debugLineNum = 239009792;BA.debugLine="Sub AddClass(c As String) As VueComponent";
RDebugUtils.currentLine=239009793;
 //BA.debugLineNum = 239009793;BA.debugLine="Template.AddClass(c)";
__ref._template /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,_c);
RDebugUtils.currentLine=239009794;
 //BA.debugLineNum = 239009794;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239009795;
 //BA.debugLineNum = 239009795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _addelement(b4j.example.vuecomponent __ref,b4j.example.vmelement _el) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addelement", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "addelement", new Object[] {_el}));}
RDebugUtils.currentLine=234422272;
 //BA.debugLineNum = 234422272;BA.debugLine="Sub AddElement(el As VMElement) As VueComponent";
RDebugUtils.currentLine=234422273;
 //BA.debugLineNum = 234422273;BA.debugLine="AddChild(el.ToString)";
__ref._addchild /*String*/ (null,_el._tostring /*String*/ (null));
RDebugUtils.currentLine=234422274;
 //BA.debugLineNum = 234422274;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234422275;
 //BA.debugLineNum = 234422275;BA.debugLine="End Sub";
return null;
}
public String  _addhr(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addhr", true))
	 {return ((String) Debug.delegate(ba, "addhr", null));}
RDebugUtils.currentLine=238944256;
 //BA.debugLineNum = 238944256;BA.debugLine="Sub AddHR";
RDebugUtils.currentLine=238944257;
 //BA.debugLineNum = 238944257;BA.debugLine="Template.SetText(\"<hr>\")";
__ref._template /*b4j.example.vuehtml*/ ._settext /*b4j.example.vuehtml*/ (null,"<hr>");
RDebugUtils.currentLine=238944258;
 //BA.debugLineNum = 238944258;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _addprop(b4j.example.vuecomponent __ref,String _propname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addprop", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "addprop", new Object[] {_propname}));}
RDebugUtils.currentLine=241172480;
 //BA.debugLineNum = 241172480;BA.debugLine="Sub AddProp(propName As String) As VueComponent";
RDebugUtils.currentLine=241172481;
 //BA.debugLineNum = 241172481;BA.debugLine="props.Add(propName)";
__ref._props /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_propname));
RDebugUtils.currentLine=241172482;
 //BA.debugLineNum = 241172482;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=241172483;
 //BA.debugLineNum = 241172483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _addprops(b4j.example.vuecomponent __ref,anywheresoftware.b4a.objects.collections.List _propslist) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addprops", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "addprops", new Object[] {_propslist}));}
String _k = "";
RDebugUtils.currentLine=241238016;
 //BA.debugLineNum = 241238016;BA.debugLine="Sub AddProps(propsList As List) As VueComponent";
RDebugUtils.currentLine=241238017;
 //BA.debugLineNum = 241238017;BA.debugLine="For Each k As String In propsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _propslist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=241238018;
 //BA.debugLineNum = 241238018;BA.debugLine="AddProp(k)";
__ref._addprop /*b4j.example.vuecomponent*/ (null,_k);
 }
};
RDebugUtils.currentLine=241238020;
 //BA.debugLineNum = 241238020;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=241238021;
 //BA.debugLineNum = 241238021;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _addstyle(b4j.example.vuecomponent __ref,String _prop,Object _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "addstyle", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "addstyle", new Object[] {_prop,_val}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=241303552;
 //BA.debugLineNum = 241303552;BA.debugLine="Sub AddStyle(prop As String, val As Object) As Vue";
RDebugUtils.currentLine=241303553;
 //BA.debugLineNum = 241303553;BA.debugLine="If val = Null Then Return Me";
if (_val== null) { 
if (true) return (b4j.example.vuecomponent)(this);};
RDebugUtils.currentLine=241303554;
 //BA.debugLineNum = 241303554;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
RDebugUtils.currentLine=241303555;
 //BA.debugLineNum = 241303555;BA.debugLine="m.Put(prop, val)";
_m.Put((Object)(_prop),_val);
RDebugUtils.currentLine=241303556;
 //BA.debugLineNum = 241303556;BA.debugLine="SetStyle(m)";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,_m);
RDebugUtils.currentLine=241303557;
 //BA.debugLineNum = 241303557;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=241303558;
 //BA.debugLineNum = 241303558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstyle(b4j.example.vuecomponent __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=237109248;
 //BA.debugLineNum = 237109248;BA.debugLine="Sub SetStyle(m As Map) As VueComponent";
RDebugUtils.currentLine=237109249;
 //BA.debugLineNum = 237109249;BA.debugLine="Template.SetStyles(m)";
__ref._template /*b4j.example.vuehtml*/ ._setstyles /*b4j.example.vuehtml*/ (null,_m);
RDebugUtils.currentLine=237109250;
 //BA.debugLineNum = 237109250;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237109251;
 //BA.debugLineNum = 237109251;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
RDebugUtils.currentLine=233832448;
 //BA.debugLineNum = 233832448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=233832449;
 //BA.debugLineNum = 233832449;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=233832450;
 //BA.debugLineNum = 233832450;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=233832451;
 //BA.debugLineNum = 233832451;BA.debugLine="Private methods As Map";
_methods = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=233832452;
 //BA.debugLineNum = 233832452;BA.debugLine="Private data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=233832453;
 //BA.debugLineNum = 233832453;BA.debugLine="Private Template As VueHTML";
_template = new b4j.example.vuehtml();
RDebugUtils.currentLine=233832454;
 //BA.debugLineNum = 233832454;BA.debugLine="Private computed As Map";
_computed = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=233832455;
 //BA.debugLineNum = 233832455;BA.debugLine="Private watches As Map";
_watches = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=233832456;
 //BA.debugLineNum = 233832456;BA.debugLine="Private created As BANanoObject";
_created = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832457;
 //BA.debugLineNum = 233832457;BA.debugLine="Private mounted As BANanoObject";
_mounted = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832458;
 //BA.debugLineNum = 233832458;BA.debugLine="Private beforeCreate As BANanoObject";
_beforecreate = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832459;
 //BA.debugLineNum = 233832459;BA.debugLine="Private destroyed As BANanoObject";
_destroyed = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832460;
 //BA.debugLineNum = 233832460;BA.debugLine="Private beforeMount As BANanoObject";
_beforemount = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832461;
 //BA.debugLineNum = 233832461;BA.debugLine="Private updated As BANanoObject";
_updated = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832462;
 //BA.debugLineNum = 233832462;BA.debugLine="Private beforeDestroy As BANanoObject";
_beforedestroy = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832463;
 //BA.debugLineNum = 233832463;BA.debugLine="Private activated As BANanoObject";
_activated = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832464;
 //BA.debugLineNum = 233832464;BA.debugLine="Private deactivated As BANanoObject";
_deactivated = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832465;
 //BA.debugLineNum = 233832465;BA.debugLine="Private beforeUpdate As BANanoObject";
_beforeupdate = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832466;
 //BA.debugLineNum = 233832466;BA.debugLine="Private opt As Map";
_opt = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=233832467;
 //BA.debugLineNum = 233832467;BA.debugLine="Public URL As String";
_url = "";
RDebugUtils.currentLine=233832468;
 //BA.debugLineNum = 233832468;BA.debugLine="Public name As String";
_name = "";
RDebugUtils.currentLine=233832469;
 //BA.debugLineNum = 233832469;BA.debugLine="Public hasContent As Boolean";
_hascontent = false;
RDebugUtils.currentLine=233832470;
 //BA.debugLineNum = 233832470;BA.debugLine="Private refs As Map";
_refs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=233832471;
 //BA.debugLineNum = 233832471;BA.debugLine="Private props As List";
_props = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=233832472;
 //BA.debugLineNum = 233832472;BA.debugLine="Private propFrom As String";
_propfrom = "";
RDebugUtils.currentLine=233832473;
 //BA.debugLineNum = 233832473;BA.debugLine="Private boVUE As BANanoObject";
_bovue = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=233832474;
 //BA.debugLineNum = 233832474;BA.debugLine="Private showKey As String";
_showkey = "";
RDebugUtils.currentLine=233832475;
 //BA.debugLineNum = 233832475;BA.debugLine="Private disKey As String";
_diskey = "";
RDebugUtils.currentLine=233832476;
 //BA.debugLineNum = 233832476;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=233832477;
 //BA.debugLineNum = 233832477;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _clear(b4j.example.vuecomponent __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "clear", new Object[] {_b}));}
RDebugUtils.currentLine=239206400;
 //BA.debugLineNum = 239206400;BA.debugLine="Sub Clear(b As Boolean) As VueComponent";
RDebugUtils.currentLine=239206401;
 //BA.debugLineNum = 239206401;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vuecomponent)(this);};
RDebugUtils.currentLine=239206402;
 //BA.debugLineNum = 239206402;BA.debugLine="Template.Clear";
__ref._template /*b4j.example.vuehtml*/ ._clear /*b4j.example.vuehtml*/ (null);
RDebugUtils.currentLine=239206403;
 //BA.debugLineNum = 239206403;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239206404;
 //BA.debugLineNum = 239206404;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _compile(b4j.example.vuecomponent __ref,String _html) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "compile", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "compile", new Object[] {_html}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=233897984;
 //BA.debugLineNum = 233897984;BA.debugLine="Sub Compile(html As String) As BANanoObject";
RDebugUtils.currentLine=233897985;
 //BA.debugLineNum = 233897985;BA.debugLine="Dim bo As BANanoObject = boVUE.RunMethod(\"compile";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._bovue /*com.ab.banano.BANanoObject*/ .RunMethod("compile",(Object)(new Object[]{(Object)(_html)}));
RDebugUtils.currentLine=233897986;
 //BA.debugLineNum = 233897986;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=233897987;
 //BA.debugLineNum = 233897987;BA.debugLine="End Sub";
return null;
}
public Object  _getstate(b4j.example.vuecomponent __ref,String _k,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "getstate", true))
	 {return ((Object) Debug.delegate(ba, "getstate", new Object[] {_k,_v}));}
Object _out = null;
RDebugUtils.currentLine=236978176;
 //BA.debugLineNum = 236978176;BA.debugLine="Sub GetState(k As String, v As Object) As Object";
RDebugUtils.currentLine=236978177;
 //BA.debugLineNum = 236978177;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=236978178;
 //BA.debugLineNum = 236978178;BA.debugLine="If data.ContainsKey(k) Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=236978179;
 //BA.debugLineNum = 236978179;BA.debugLine="Dim out As Object = data.GetDefault(k,v)";
_out = __ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_k),_v);
RDebugUtils.currentLine=236978180;
 //BA.debugLineNum = 236978180;BA.debugLine="Return out";
if (true) return _out;
 }else {
RDebugUtils.currentLine=236978182;
 //BA.debugLineNum = 236978182;BA.debugLine="Log(\"GetState: First set the v-model for \" & k)";
__c.Log("GetState: First set the v-model for "+_k);
RDebugUtils.currentLine=236978183;
 //BA.debugLineNum = 236978183;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
RDebugUtils.currentLine=236978185;
 //BA.debugLineNum = 236978185;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(b4j.example.vuecomponent __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "getstates", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getstates", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _sm = null;
String _lstrec = "";
Object _state = null;
RDebugUtils.currentLine=236912640;
 //BA.debugLineNum = 236912640;BA.debugLine="Sub GetStates(lst As List) As Map";
RDebugUtils.currentLine=236912641;
 //BA.debugLineNum = 236912641;BA.debugLine="Dim sm As Map = CreateMap()";
_sm = new anywheresoftware.b4a.objects.collections.Map();
_sm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=236912642;
 //BA.debugLineNum = 236912642;BA.debugLine="For Each lstrec As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lstrec = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=236912643;
 //BA.debugLineNum = 236912643;BA.debugLine="lstrec = lstrec.tolowercase";
_lstrec = _lstrec.toLowerCase();
RDebugUtils.currentLine=236912644;
 //BA.debugLineNum = 236912644;BA.debugLine="Dim state As Object = GetState(lstrec, Null)";
_state = __ref._getstate /*Object*/ (null,_lstrec,__c.Null);
RDebugUtils.currentLine=236912645;
 //BA.debugLineNum = 236912645;BA.debugLine="sm.Put(lstrec, state)";
_sm.Put((Object)(_lstrec),_state);
 }
};
RDebugUtils.currentLine=236912647;
 //BA.debugLineNum = 236912647;BA.debugLine="Return sm";
if (true) return _sm;
RDebugUtils.currentLine=236912648;
 //BA.debugLineNum = 236912648;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(b4j.example.vuecomponent __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "hasstate", true))
	 {return ((Boolean) Debug.delegate(ba, "hasstate", new Object[] {_k}));}
RDebugUtils.currentLine=236847104;
 //BA.debugLineNum = 236847104;BA.debugLine="Sub HasState(k As String) As Boolean";
RDebugUtils.currentLine=236847105;
 //BA.debugLineNum = 236847105;BA.debugLine="Return data.ContainsKey(k)";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_k));
RDebugUtils.currentLine=236847106;
 //BA.debugLineNum = 236847106;BA.debugLine="End Sub";
return false;
}
public b4j.example.vuecomponent  _setstatesingle(b4j.example.vuecomponent __ref,String _k,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstatesingle", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstatesingle", new Object[] {_k,_v}));}
anywheresoftware.b4a.objects.collections.Map _optx = null;
RDebugUtils.currentLine=235012096;
 //BA.debugLineNum = 235012096;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As Vu";
RDebugUtils.currentLine=235012097;
 //BA.debugLineNum = 235012097;BA.debugLine="Dim optx As Map = CreateMap()";
_optx = new anywheresoftware.b4a.objects.collections.Map();
_optx = __c.createMap(new Object[] {});
RDebugUtils.currentLine=235012098;
 //BA.debugLineNum = 235012098;BA.debugLine="optx.Put(k, v)";
_optx.Put((Object)(_k),_v);
RDebugUtils.currentLine=235012099;
 //BA.debugLineNum = 235012099;BA.debugLine="SetState(optx)";
__ref._setstate /*b4j.example.vuecomponent*/ (null,_optx);
RDebugUtils.currentLine=235012100;
 //BA.debugLineNum = 235012100;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235012101;
 //BA.debugLineNum = 235012101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvshow(b4j.example.vuecomponent __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=238747648;
 //BA.debugLineNum = 238747648;BA.debugLine="Sub SetVShow(vif As String) As VueComponent";
RDebugUtils.currentLine=238747649;
 //BA.debugLineNum = 238747649;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
RDebugUtils.currentLine=238747650;
 //BA.debugLineNum = 238747650;BA.debugLine="If HasState(vif) = False Then";
if (__ref._hasstate /*boolean*/ (null,_vif)==__c.False) { 
RDebugUtils.currentLine=238747651;
 //BA.debugLineNum = 238747651;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=238747652;
 //BA.debugLineNum = 238747652;BA.debugLine="opt.Put(vif, False)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vif),(Object)(__c.False));
RDebugUtils.currentLine=238747653;
 //BA.debugLineNum = 238747653;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.vuecomponent*/ (null,__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=238747655;
 //BA.debugLineNum = 238747655;BA.debugLine="SetVShow(vif)";
__ref._setvshow /*b4j.example.vuecomponent*/ (null,_vif);
RDebugUtils.currentLine=238747656;
 //BA.debugLineNum = 238747656;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238747657;
 //BA.debugLineNum = 238747657;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setdisabled(b4j.example.vuecomponent __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=238419968;
 //BA.debugLineNum = 238419968;BA.debugLine="Sub SetDisabled(b As Boolean) As VueComponent";
RDebugUtils.currentLine=238419969;
 //BA.debugLineNum = 238419969;BA.debugLine="Template.SetAttr(\":disabled\", b)";
__ref._template /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,":disabled",BA.ObjectToString(_b));
RDebugUtils.currentLine=238419970;
 //BA.debugLineNum = 238419970;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238419971;
 //BA.debugLineNum = 238419971;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vuecomponent __ref,b4j.example.vuecomponent _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
String _sout = "";
RDebugUtils.currentLine=234291200;
 //BA.debugLineNum = 234291200;BA.debugLine="Sub Pop(p As VueComponent)";
RDebugUtils.currentLine=234291201;
 //BA.debugLineNum = 234291201;BA.debugLine="Dim sout As String = ToString";
_sout = __ref._tostring /*String*/ (null);
RDebugUtils.currentLine=234291202;
 //BA.debugLineNum = 234291202;BA.debugLine="p.SetText(sout)";
_p._settext /*b4j.example.vuecomponent*/ (null,_sout);
RDebugUtils.currentLine=234291203;
 //BA.debugLineNum = 234291203;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=237240320;
 //BA.debugLineNum = 237240320;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=237240321;
 //BA.debugLineNum = 237240321;BA.debugLine="Return Template.tostring";
if (true) return __ref._template /*b4j.example.vuehtml*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=237240322;
 //BA.debugLineNum = 237240322;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _removeclass(b4j.example.vuecomponent __ref,String _classname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "removeclass", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "removeclass", new Object[] {_classname}));}
RDebugUtils.currentLine=239140864;
 //BA.debugLineNum = 239140864;BA.debugLine="Sub RemoveClass(className As String) As VueCompone";
RDebugUtils.currentLine=239140865;
 //BA.debugLineNum = 239140865;BA.debugLine="RemoveClass(className)";
__ref._removeclass /*b4j.example.vuecomponent*/ (null,_classname);
RDebugUtils.currentLine=239140866;
 //BA.debugLineNum = 239140866;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239140867;
 //BA.debugLineNum = 239140867;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _renderit(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "renderit", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "renderit", null));}
anywheresoftware.b4a.objects.collections.Map _option = null;
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=234094592;
 //BA.debugLineNum = 234094592;BA.debugLine="Sub RenderIt As BANanoObject";
RDebugUtils.currentLine=234094593;
 //BA.debugLineNum = 234094593;BA.debugLine="Dim option As Map = CreateMap(\"template\" : $\"{{ $";
_option = new anywheresoftware.b4a.objects.collections.Map();
_option = __c.createMap(new Object[] {(Object)("template"),(Object)(("{{ "+__c.SmartStringFormatter("",(Object)(__ref._propfrom /*String*/ ))+" }}"))});
RDebugUtils.currentLine=234094594;
 //BA.debugLineNum = 234094594;BA.debugLine="Dim bo As BANanoObject = BANano.RunJavascriptMeth";
_bo = new com.ab.banano.BANanoObject();
_bo.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("createElement",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_option.getObject())}))));
RDebugUtils.currentLine=234094595;
 //BA.debugLineNum = 234094595;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=234094596;
 //BA.debugLineNum = 234094596;BA.debugLine="End Sub";
return null;
}
public String  _renderto(b4j.example.vuecomponent __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "renderto", true))
	 {return ((String) Debug.delegate(ba, "renderto", new Object[] {_elid}));}
String _dkey = "";
String _rkey = "";
RDebugUtils.currentLine=235470848;
 //BA.debugLineNum = 235470848;BA.debugLine="Sub RenderTo(elID As String)";
RDebugUtils.currentLine=235470849;
 //BA.debugLineNum = 235470849;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=235470850;
 //BA.debugLineNum = 235470850;BA.debugLine="BANano.GetElement($\"#${elID}\"$).empty";
__ref._banano /*com.ab.banano.BANano*/ .GetElement(("#"+__c.SmartStringFormatter("",(Object)(_elid))+"")).Empty();
RDebugUtils.currentLine=235470852;
 //BA.debugLineNum = 235470852;BA.debugLine="Dim boVUE As BANanoObject";
_bovue = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=235470853;
 //BA.debugLineNum = 235470853;BA.debugLine="opt.Put(\"el\", $\"#${elID}\"$)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("el"),(Object)(("#"+__c.SmartStringFormatter("",(Object)(_elid))+"")));
RDebugUtils.currentLine=235470854;
 //BA.debugLineNum = 235470854;BA.debugLine="Component";
__ref._component /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=235470855;
 //BA.debugLineNum = 235470855;BA.debugLine="boVUE.Initialize2(\"Vue\", opt)";
__ref._bovue /*com.ab.banano.BANanoObject*/ .Initialize2("Vue",(Object)(__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=235470857;
 //BA.debugLineNum = 235470857;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
RDebugUtils.currentLine=235470858;
 //BA.debugLineNum = 235470858;BA.debugLine="data = boVUE.GetField(dKey).Result";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bovue /*com.ab.banano.BANanoObject*/ .GetField(_dkey).Result()));
RDebugUtils.currentLine=235470860;
 //BA.debugLineNum = 235470860;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
RDebugUtils.currentLine=235470861;
 //BA.debugLineNum = 235470861;BA.debugLine="refs = boVUE.GetField(rKey).result";
__ref._refs /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bovue /*com.ab.banano.BANanoObject*/ .GetField(_rkey).Result()));
RDebugUtils.currentLine=235470862;
 //BA.debugLineNum = 235470862;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _returndata(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "returndata", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "returndata", null));}
RDebugUtils.currentLine=236388352;
 //BA.debugLineNum = 236388352;BA.debugLine="private Sub ReturnData As Map";
RDebugUtils.currentLine=236388353;
 //BA.debugLineNum = 236388353;BA.debugLine="Return data";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=236388354;
 //BA.debugLineNum = 236388354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setactivated(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setactivated", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setactivated", new Object[] {_methodname}));}
RDebugUtils.currentLine=235667456;
 //BA.debugLineNum = 235667456;BA.debugLine="Sub SetActivated(methodName As String) As VueCompo";
RDebugUtils.currentLine=235667457;
 //BA.debugLineNum = 235667457;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=235667458;
 //BA.debugLineNum = 235667458;BA.debugLine="activated = BANano.CallBack(module, methodName, N";
__ref._activated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235667459;
 //BA.debugLineNum = 235667459;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235667460;
 //BA.debugLineNum = 235667460;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setalt(b4j.example.vuecomponent __ref,String _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setalt", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setalt", new Object[] {_a}));}
RDebugUtils.currentLine=238157824;
 //BA.debugLineNum = 238157824;BA.debugLine="Sub SetAlt(a As String) As VueComponent";
RDebugUtils.currentLine=238157825;
 //BA.debugLineNum = 238157825;BA.debugLine="Template.SetAlt(a)";
__ref._template /*b4j.example.vuehtml*/ ._setalt /*b4j.example.vuehtml*/ (null,_a);
RDebugUtils.currentLine=238157826;
 //BA.debugLineNum = 238157826;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238157827;
 //BA.debugLineNum = 238157827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setattr(b4j.example.vuecomponent __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setattr", new Object[] {_m}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=238616576;
 //BA.debugLineNum = 238616576;BA.debugLine="Sub SetAttr(m As Map) As VueComponent";
RDebugUtils.currentLine=238616577;
 //BA.debugLineNum = 238616577;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=238616578;
 //BA.debugLineNum = 238616578;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=238616579;
 //BA.debugLineNum = 238616579;BA.debugLine="Template.SetAttr(k, v)";
__ref._template /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,_k,BA.ObjectToString(_v));
 }
};
RDebugUtils.currentLine=238616581;
 //BA.debugLineNum = 238616581;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238616582;
 //BA.debugLineNum = 238616582;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setautocomplete(b4j.example.vuecomponent __ref,String _auto,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setautocomplete", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setautocomplete", new Object[] {_auto,_bind}));}
RDebugUtils.currentLine=240189440;
 //BA.debugLineNum = 240189440;BA.debugLine="Sub SetAutoComplete(auto As String, bind As Boolea";
RDebugUtils.currentLine=240189441;
 //BA.debugLineNum = 240189441;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=240189442;
 //BA.debugLineNum = 240189442;BA.debugLine="SetAttr(CreateMap(\":autocomplete\": auto))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":autocomplete"),(Object)(_auto)}));
 }else {
RDebugUtils.currentLine=240189444;
 //BA.debugLineNum = 240189444;BA.debugLine="SetAttr(CreateMap(\"autocomplete\": auto))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("autocomplete"),(Object)(_auto)}));
 };
RDebugUtils.currentLine=240189446;
 //BA.debugLineNum = 240189446;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240189447;
 //BA.debugLineNum = 240189447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbackgroundcolor(b4j.example.vuecomponent __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_p}));}
RDebugUtils.currentLine=237174784;
 //BA.debugLineNum = 237174784;BA.debugLine="Sub SetBackgroundColor(p As Object) As VueComponen";
RDebugUtils.currentLine=237174785;
 //BA.debugLineNum = 237174785;BA.debugLine="SetStyle(CreateMap(\"background-color\":p))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("background-color"),_p}));
RDebugUtils.currentLine=237174786;
 //BA.debugLineNum = 237174786;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237174787;
 //BA.debugLineNum = 237174787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbeforecreate(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setbeforecreate", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setbeforecreate", new Object[] {_methodname}));}
RDebugUtils.currentLine=236191744;
 //BA.debugLineNum = 236191744;BA.debugLine="Sub SetBeforeCreate(methodName As String) As VueCo";
RDebugUtils.currentLine=236191745;
 //BA.debugLineNum = 236191745;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=236191746;
 //BA.debugLineNum = 236191746;BA.debugLine="beforeCreate = BANano.CallBack(module, methodName";
__ref._beforecreate /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=236191747;
 //BA.debugLineNum = 236191747;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236191748;
 //BA.debugLineNum = 236191748;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbeforedestroy(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setbeforedestroy", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setbeforedestroy", new Object[] {_methodname}));}
RDebugUtils.currentLine=235995136;
 //BA.debugLineNum = 235995136;BA.debugLine="Sub SetBeforeDestroy(methodName As String) As VueC";
RDebugUtils.currentLine=235995137;
 //BA.debugLineNum = 235995137;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=235995138;
 //BA.debugLineNum = 235995138;BA.debugLine="beforeDestroy = BANano.CallBack(module, methodNam";
__ref._beforedestroy /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235995139;
 //BA.debugLineNum = 235995139;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235995140;
 //BA.debugLineNum = 235995140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbeforemount(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setbeforemount", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setbeforemount", new Object[] {_methodname}));}
RDebugUtils.currentLine=235864064;
 //BA.debugLineNum = 235864064;BA.debugLine="Sub SetBeforeMount(methodName As String) As VueCom";
RDebugUtils.currentLine=235864065;
 //BA.debugLineNum = 235864065;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=235864066;
 //BA.debugLineNum = 235864066;BA.debugLine="beforeMount = BANano.CallBack(module, methodName,";
__ref._beforemount /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235864067;
 //BA.debugLineNum = 235864067;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235864068;
 //BA.debugLineNum = 235864068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setbeforeupdate(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setbeforeupdate", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setbeforeupdate", new Object[] {_methodname}));}
RDebugUtils.currentLine=235929600;
 //BA.debugLineNum = 235929600;BA.debugLine="Sub SetBeforeUpdate(methodName As String) As VueCo";
RDebugUtils.currentLine=235929601;
 //BA.debugLineNum = 235929601;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=235929602;
 //BA.debugLineNum = 235929602;BA.debugLine="beforeMount = BANano.CallBack(module, methodName,";
__ref._beforemount /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235929603;
 //BA.debugLineNum = 235929603;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235929604;
 //BA.debugLineNum = 235929604;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setborder(b4j.example.vuecomponent __ref,String _width,String _color,String _bstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setborder", new Object[] {_width,_color,_bstyle}));}
anywheresoftware.b4a.objects.collections.Map _b = null;
RDebugUtils.currentLine=240254976;
 //BA.debugLineNum = 240254976;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
RDebugUtils.currentLine=240254977;
 //BA.debugLineNum = 240254977;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
RDebugUtils.currentLine=240254978;
 //BA.debugLineNum = 240254978;BA.debugLine="b.Put(\"border-style\", bstyle)";
_b.Put((Object)("border-style"),(Object)(_bstyle));
RDebugUtils.currentLine=240254979;
 //BA.debugLineNum = 240254979;BA.debugLine="b.Put(\"border-width\", width)";
_b.Put((Object)("border-width"),(Object)(_width));
RDebugUtils.currentLine=240254980;
 //BA.debugLineNum = 240254980;BA.debugLine="b.Put(\"border-color\", color)";
_b.Put((Object)("border-color"),(Object)(_color));
RDebugUtils.currentLine=240254981;
 //BA.debugLineNum = 240254981;BA.debugLine="SetStyle(b)";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,_b);
RDebugUtils.currentLine=240254982;
 //BA.debugLineNum = 240254982;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240254983;
 //BA.debugLineNum = 240254983;BA.debugLine="End Sub";
return null;
}
public String  _setcallback(b4j.example.vuecomponent __ref,String _methodname,com.ab.banano.BANanoObject _cb) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setcallback", true))
	 {return ((String) Debug.delegate(ba, "setcallback", new Object[] {_methodname,_cb}));}
RDebugUtils.currentLine=240713728;
 //BA.debugLineNum = 240713728;BA.debugLine="Sub SetCallBack(methodName As String, cb As BANano";
RDebugUtils.currentLine=240713729;
 //BA.debugLineNum = 240713729;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=240713730;
 //BA.debugLineNum = 240713730;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
RDebugUtils.currentLine=240713731;
 //BA.debugLineNum = 240713731;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _setchecked(b4j.example.vuecomponent __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setchecked", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setchecked", new Object[] {_b}));}
RDebugUtils.currentLine=239075328;
 //BA.debugLineNum = 239075328;BA.debugLine="Sub SetChecked(b As Boolean) As VueComponent";
RDebugUtils.currentLine=239075329;
 //BA.debugLineNum = 239075329;BA.debugLine="SetAttr(CreateMap(\":checked\":b))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":checked"),(Object)(_b)}));
RDebugUtils.currentLine=239075330;
 //BA.debugLineNum = 239075330;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239075331;
 //BA.debugLineNum = 239075331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setcolor(b4j.example.vuecomponent __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setcolor", new Object[] {_c}));}
RDebugUtils.currentLine=237043712;
 //BA.debugLineNum = 237043712;BA.debugLine="Sub SetColor(c As Object) As VueComponent";
RDebugUtils.currentLine=237043713;
 //BA.debugLineNum = 237043713;BA.debugLine="SetStyle(CreateMap(\"color\": c))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("color"),_c}));
RDebugUtils.currentLine=237043714;
 //BA.debugLineNum = 237043714;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237043715;
 //BA.debugLineNum = 237043715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setcomputed(b4j.example.vuecomponent __ref,String _k,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setcomputed", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setcomputed", new Object[] {_k,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=236453888;
 //BA.debugLineNum = 236453888;BA.debugLine="Sub SetComputed(k As String, methodName As String)";
RDebugUtils.currentLine=236453889;
 //BA.debugLineNum = 236453889;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=236453890;
 //BA.debugLineNum = 236453890;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=236453891;
 //BA.debugLineNum = 236453891;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=236453892;
 //BA.debugLineNum = 236453892;BA.debugLine="If data.ContainsKey(k) Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=236453893;
 //BA.debugLineNum = 236453893;BA.debugLine="SetStateSingle(k, Null)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,_k,__c.Null);
 };
RDebugUtils.currentLine=236453895;
 //BA.debugLineNum = 236453895;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=236453896;
 //BA.debugLineNum = 236453896;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
RDebugUtils.currentLine=236453897;
 //BA.debugLineNum = 236453897;BA.debugLine="computed.Put(k, cb)";
__ref._computed /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=236453899;
 //BA.debugLineNum = 236453899;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236453900;
 //BA.debugLineNum = 236453900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setcreated(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setcreated", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setcreated", new Object[] {_methodname}));}
RDebugUtils.currentLine=236257280;
 //BA.debugLineNum = 236257280;BA.debugLine="Sub SetCreated(methodName As String) As VueCompone";
RDebugUtils.currentLine=236257281;
 //BA.debugLineNum = 236257281;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=236257282;
 //BA.debugLineNum = 236257282;BA.debugLine="created = BANano.CallBack(module, methodName, Nul";
__ref._created /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=236257283;
 //BA.debugLineNum = 236257283;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236257284;
 //BA.debugLineNum = 236257284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setcursormove(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setcursormove", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setcursormove", null));}
RDebugUtils.currentLine=240320512;
 //BA.debugLineNum = 240320512;BA.debugLine="Sub SetCursorMove As VueComponent";
RDebugUtils.currentLine=240320513;
 //BA.debugLineNum = 240320513;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"move\"))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("cursor"),(Object)("move")}));
RDebugUtils.currentLine=240320514;
 //BA.debugLineNum = 240320514;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240320515;
 //BA.debugLineNum = 240320515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setdeactivated(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setdeactivated", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setdeactivated", new Object[] {_methodname}));}
RDebugUtils.currentLine=235732992;
 //BA.debugLineNum = 235732992;BA.debugLine="Sub SetDeActivated(methodName As String) As VueCom";
RDebugUtils.currentLine=235732993;
 //BA.debugLineNum = 235732993;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=235732994;
 //BA.debugLineNum = 235732994;BA.debugLine="deactivated = BANano.CallBack(module, methodName,";
__ref._deactivated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235732995;
 //BA.debugLineNum = 235732995;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235732996;
 //BA.debugLineNum = 235732996;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setdestroyed(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setdestroyed", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setdestroyed", new Object[] {_methodname}));}
RDebugUtils.currentLine=235601920;
 //BA.debugLineNum = 235601920;BA.debugLine="Sub SetDestroyed(methodName As String) As VueCompo";
RDebugUtils.currentLine=235601921;
 //BA.debugLineNum = 235601921;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=235601922;
 //BA.debugLineNum = 235601922;BA.debugLine="destroyed = BANano.CallBack(module, methodName, N";
__ref._destroyed /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235601923;
 //BA.debugLineNum = 235601923;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235601924;
 //BA.debugLineNum = 235601924;BA.debugLine="End Sub";
return null;
}
public String  _setdisabledstate(b4j.example.vuecomponent __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setdisabledstate", true))
	 {return ((String) Debug.delegate(ba, "setdisabledstate", new Object[] {_k,_v}));}
RDebugUtils.currentLine=235274240;
 //BA.debugLineNum = 235274240;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
RDebugUtils.currentLine=235274241;
 //BA.debugLineNum = 235274241;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
RDebugUtils.currentLine=235274242;
 //BA.debugLineNum = 235274242;BA.debugLine="SetStateSingle(disKey, v)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,__ref._diskey /*String*/ ,(Object)(_v));
RDebugUtils.currentLine=235274243;
 //BA.debugLineNum = 235274243;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _setdraggable(b4j.example.vuecomponent __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setdraggable", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setdraggable", new Object[] {_b}));}
RDebugUtils.currentLine=240451584;
 //BA.debugLineNum = 240451584;BA.debugLine="Sub SetDraggable(b As Boolean) As VueComponent";
RDebugUtils.currentLine=240451585;
 //BA.debugLineNum = 240451585;BA.debugLine="SetAttr(CreateMap(\":draggable\":b))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":draggable"),(Object)(_b)}));
RDebugUtils.currentLine=240451586;
 //BA.debugLineNum = 240451586;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240451587;
 //BA.debugLineNum = 240451587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setdroppable(b4j.example.vuecomponent __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setdroppable", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setdroppable", new Object[] {_b}));}
RDebugUtils.currentLine=240517120;
 //BA.debugLineNum = 240517120;BA.debugLine="Sub SetDroppable(b As Boolean) As VueComponent";
RDebugUtils.currentLine=240517121;
 //BA.debugLineNum = 240517121;BA.debugLine="SetAttr(CreateMap(\":droppable\":b))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":droppable"),(Object)(_b)}));
RDebugUtils.currentLine=240517122;
 //BA.debugLineNum = 240517122;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240517123;
 //BA.debugLineNum = 240517123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setfunctional(b4j.example.vuecomponent __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setfunctional", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setfunctional", new Object[] {_b}));}
RDebugUtils.currentLine=233963520;
 //BA.debugLineNum = 233963520;BA.debugLine="Sub SetFunctional(b As Boolean) As VueComponent";
RDebugUtils.currentLine=233963521;
 //BA.debugLineNum = 233963521;BA.debugLine="opt.Put(\"functional\", b)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("functional"),(Object)(_b));
RDebugUtils.currentLine=233963522;
 //BA.debugLineNum = 233963522;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=233963523;
 //BA.debugLineNum = 233963523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setheight(b4j.example.vuecomponent __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=240648192;
 //BA.debugLineNum = 240648192;BA.debugLine="Sub SetHeight(h As String) As VueComponent";
RDebugUtils.currentLine=240648193;
 //BA.debugLineNum = 240648193;BA.debugLine="SetStyle(CreateMap(\"height\":h))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)(_h)}));
RDebugUtils.currentLine=240648194;
 //BA.debugLineNum = 240648194;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240648195;
 //BA.debugLineNum = 240648195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _sethref(b4j.example.vuecomponent __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "sethref", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "sethref", new Object[] {_h}));}
RDebugUtils.currentLine=238354432;
 //BA.debugLineNum = 238354432;BA.debugLine="Sub SetHREF(h As String) As VueComponent";
RDebugUtils.currentLine=238354433;
 //BA.debugLineNum = 238354433;BA.debugLine="Template.SetAttrHREF(h)";
__ref._template /*b4j.example.vuehtml*/ ._setattrhref /*b4j.example.vuehtml*/ (null,_h);
RDebugUtils.currentLine=238354434;
 //BA.debugLineNum = 238354434;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238354435;
 //BA.debugLineNum = 238354435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setid(b4j.example.vuecomponent __ref,String _sid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setid", new Object[] {_sid,_bind}));}
RDebugUtils.currentLine=234487808;
 //BA.debugLineNum = 234487808;BA.debugLine="Sub SetID(sid As String, bind As Boolean) As VueCo";
RDebugUtils.currentLine=234487809;
 //BA.debugLineNum = 234487809;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=234487810;
 //BA.debugLineNum = 234487810;BA.debugLine="SetAttr(CreateMap(\":id\":sid))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":id"),(Object)(_sid)}));
 }else {
RDebugUtils.currentLine=234487812;
 //BA.debugLineNum = 234487812;BA.debugLine="SetAttr(CreateMap(\"id\":sid))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("id"),(Object)(_sid)}));
 };
RDebugUtils.currentLine=234487814;
 //BA.debugLineNum = 234487814;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234487815;
 //BA.debugLineNum = 234487815;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setis(b4j.example.vuecomponent __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setis", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setis", new Object[] {_t}));}
RDebugUtils.currentLine=239861760;
 //BA.debugLineNum = 239861760;BA.debugLine="Sub SetIs(t As String) As VueComponent";
RDebugUtils.currentLine=239861761;
 //BA.debugLineNum = 239861761;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
RDebugUtils.currentLine=239861762;
 //BA.debugLineNum = 239861762;BA.debugLine="SetAttr(CreateMap(\":is\": t))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":is"),(Object)(_t)}));
RDebugUtils.currentLine=239861763;
 //BA.debugLineNum = 239861763;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239861764;
 //BA.debugLineNum = 239861764;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setishidden(b4j.example.vuecomponent __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setishidden", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setishidden", new Object[] {_b}));}
RDebugUtils.currentLine=239271936;
 //BA.debugLineNum = 239271936;BA.debugLine="Sub SetIsHidden(b As Boolean) As VueComponent";
RDebugUtils.currentLine=239271937;
 //BA.debugLineNum = 239271937;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vuecomponent)(this);};
RDebugUtils.currentLine=239271938;
 //BA.debugLineNum = 239271938;BA.debugLine="AddClass(\"is-hidden\")";
__ref._addclass /*b4j.example.vuecomponent*/ (null,"is-hidden");
RDebugUtils.currentLine=239271939;
 //BA.debugLineNum = 239271939;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239271940;
 //BA.debugLineNum = 239271940;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setkey(b4j.example.vuecomponent __ref,Object _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=239403008;
 //BA.debugLineNum = 239403008;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VueCom";
RDebugUtils.currentLine=239403009;
 //BA.debugLineNum = 239403009;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=239403010;
 //BA.debugLineNum = 239403010;BA.debugLine="SetAttr(CreateMap(\":key\": k))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":key"),_k}));
 }else {
RDebugUtils.currentLine=239403012;
 //BA.debugLineNum = 239403012;BA.debugLine="SetAttr(CreateMap(\"key\": k))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("key"),_k}));
 };
RDebugUtils.currentLine=239403014;
 //BA.debugLineNum = 239403014;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239403015;
 //BA.debugLineNum = 239403015;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setlineheight(b4j.example.vuecomponent __ref,Object _lh) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setlineheight", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setlineheight", new Object[] {_lh}));}
RDebugUtils.currentLine=238551040;
 //BA.debugLineNum = 238551040;BA.debugLine="Sub SetLineHeight(lh As Object) As VueComponent";
RDebugUtils.currentLine=238551041;
 //BA.debugLineNum = 238551041;BA.debugLine="SetStyle(CreateMap(\"line-height\": lh))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("line-height"),_lh}));
RDebugUtils.currentLine=238551042;
 //BA.debugLineNum = 238551042;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238551043;
 //BA.debugLineNum = 238551043;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmarginall(b4j.example.vuecomponent __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setmarginall", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setmarginall", new Object[] {_p}));}
RDebugUtils.currentLine=237895680;
 //BA.debugLineNum = 237895680;BA.debugLine="Sub SetMarginAll(p As Object) As VueComponent";
RDebugUtils.currentLine=237895681;
 //BA.debugLineNum = 237895681;BA.debugLine="SetStyle(CreateMap(\"margin\":p))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("margin"),_p}));
RDebugUtils.currentLine=237895682;
 //BA.debugLineNum = 237895682;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237895683;
 //BA.debugLineNum = 237895683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmargins(b4j.example.vuecomponent __ref,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setmargins", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setmargins", new Object[] {_mt,_mb,_ml,_mr}));}
RDebugUtils.currentLine=241106944;
 //BA.debugLineNum = 241106944;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
RDebugUtils.currentLine=241106945;
 //BA.debugLineNum = 241106945;BA.debugLine="AddStyle(\"margin-top\", mt)";
__ref._addstyle /*b4j.example.vuecomponent*/ (null,"margin-top",_mt);
RDebugUtils.currentLine=241106946;
 //BA.debugLineNum = 241106946;BA.debugLine="AddStyle(\"margin-bottom\", mb)";
__ref._addstyle /*b4j.example.vuecomponent*/ (null,"margin-bottom",_mb);
RDebugUtils.currentLine=241106947;
 //BA.debugLineNum = 241106947;BA.debugLine="AddStyle(\"margin-left\", ml)";
__ref._addstyle /*b4j.example.vuecomponent*/ (null,"margin-left",_ml);
RDebugUtils.currentLine=241106948;
 //BA.debugLineNum = 241106948;BA.debugLine="AddStyle(\"margin-right\", mr)";
__ref._addstyle /*b4j.example.vuecomponent*/ (null,"margin-right",_mr);
RDebugUtils.currentLine=241106949;
 //BA.debugLineNum = 241106949;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=241106950;
 //BA.debugLineNum = 241106950;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmaxwidth(b4j.example.vuecomponent __ref,String _mw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setmaxwidth", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setmaxwidth", new Object[] {_mw}));}
RDebugUtils.currentLine=238223360;
 //BA.debugLineNum = 238223360;BA.debugLine="Sub SetMaxWidth(mw As String) As VueComponent";
RDebugUtils.currentLine=238223361;
 //BA.debugLineNum = 238223361;BA.debugLine="Template.SetStyle(\"max-width\",mw)";
__ref._template /*b4j.example.vuehtml*/ ._setstyle /*b4j.example.vuehtml*/ (null,"max-width",_mw);
RDebugUtils.currentLine=238223362;
 //BA.debugLineNum = 238223362;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238223363;
 //BA.debugLineNum = 238223363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmethod(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setmethod", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setmethod", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=236322816;
 //BA.debugLineNum = 236322816;BA.debugLine="Sub SetMethod(methodName As String) As VueComponen";
RDebugUtils.currentLine=236322817;
 //BA.debugLineNum = 236322817;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=236322818;
 //BA.debugLineNum = 236322818;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=236322819;
 //BA.debugLineNum = 236322819;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=236322820;
 //BA.debugLineNum = 236322820;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
RDebugUtils.currentLine=236322821;
 //BA.debugLineNum = 236322821;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=236322823;
 //BA.debugLineNum = 236322823;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236322824;
 //BA.debugLineNum = 236322824;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setmounted(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setmounted", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setmounted", new Object[] {_methodname}));}
RDebugUtils.currentLine=235536384;
 //BA.debugLineNum = 235536384;BA.debugLine="Sub SetMounted(methodName As String) As VueCompone";
RDebugUtils.currentLine=235536385;
 //BA.debugLineNum = 235536385;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=235536386;
 //BA.debugLineNum = 235536386;BA.debugLine="mounted = BANano.CallBack(module, methodName, Nul";
__ref._mounted /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235536387;
 //BA.debugLineNum = 235536387;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235536388;
 //BA.debugLineNum = 235536388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setname(b4j.example.vuecomponent __ref,String _sid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setname", new Object[] {_sid,_bind}));}
RDebugUtils.currentLine=234553344;
 //BA.debugLineNum = 234553344;BA.debugLine="Sub SetName(sid As String, bind As Boolean) As Vue";
RDebugUtils.currentLine=234553345;
 //BA.debugLineNum = 234553345;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=234553346;
 //BA.debugLineNum = 234553346;BA.debugLine="SetAttr(CreateMap(\":name\":sid))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":name"),(Object)(_sid)}));
 }else {
RDebugUtils.currentLine=234553348;
 //BA.debugLineNum = 234553348;BA.debugLine="SetAttr(CreateMap(\"name\":sid))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("name"),(Object)(_sid)}));
 };
RDebugUtils.currentLine=234553350;
 //BA.debugLineNum = 234553350;BA.debugLine="name = sid";
__ref._name /*String*/  = _sid;
RDebugUtils.currentLine=234553351;
 //BA.debugLineNum = 234553351;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234553352;
 //BA.debugLineNum = 234553352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonblur(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setonblur", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setonblur", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=237436928;
 //BA.debugLineNum = 237436928;BA.debugLine="Sub SetOnBlur(methodName As String) As VueComponen";
RDebugUtils.currentLine=237436929;
 //BA.debugLineNum = 237436929;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=237436930;
 //BA.debugLineNum = 237436930;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=237436931;
 //BA.debugLineNum = 237436931;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=237436932;
 //BA.debugLineNum = 237436932;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=237436933;
 //BA.debugLineNum = 237436933;BA.debugLine="SetAttr(CreateMap(\"v-on:blur\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:blur"),(Object)(_methodname)}));
RDebugUtils.currentLine=237436935;
 //BA.debugLineNum = 237436935;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=237436937;
 //BA.debugLineNum = 237436937;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237436938;
 //BA.debugLineNum = 237436938;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonchange(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setonchange", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setonchange", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=237633536;
 //BA.debugLineNum = 237633536;BA.debugLine="Sub SetOnChange(methodName As String) As VueCompon";
RDebugUtils.currentLine=237633537;
 //BA.debugLineNum = 237633537;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=237633538;
 //BA.debugLineNum = 237633538;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=237633539;
 //BA.debugLineNum = 237633539;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=237633540;
 //BA.debugLineNum = 237633540;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=237633541;
 //BA.debugLineNum = 237633541;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
RDebugUtils.currentLine=237633543;
 //BA.debugLineNum = 237633543;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=237633545;
 //BA.debugLineNum = 237633545;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237633546;
 //BA.debugLineNum = 237633546;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonclick(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setonclick", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=237568000;
 //BA.debugLineNum = 237568000;BA.debugLine="Sub SetOnClick(methodName As String) As VueCompone";
RDebugUtils.currentLine=237568001;
 //BA.debugLineNum = 237568001;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=237568002;
 //BA.debugLineNum = 237568002;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=237568003;
 //BA.debugLineNum = 237568003;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=237568004;
 //BA.debugLineNum = 237568004;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=237568005;
 //BA.debugLineNum = 237568005;BA.debugLine="SetAttr(CreateMap(\"v-on:click\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:click"),(Object)(_methodname)}));
RDebugUtils.currentLine=237568007;
 //BA.debugLineNum = 237568007;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
RDebugUtils.currentLine=237568008;
 //BA.debugLineNum = 237568008;BA.debugLine="SetPointer(True)";
__ref._setpointer /*b4j.example.vuecomponent*/ (null,__c.True);
 };
RDebugUtils.currentLine=237568010;
 //BA.debugLineNum = 237568010;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237568011;
 //BA.debugLineNum = 237568011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setpointer(b4j.example.vuecomponent __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setpointer", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setpointer", new Object[] {_b}));}
RDebugUtils.currentLine=237502464;
 //BA.debugLineNum = 237502464;BA.debugLine="Sub SetPointer(b As Boolean) As VueComponent";
RDebugUtils.currentLine=237502465;
 //BA.debugLineNum = 237502465;BA.debugLine="Template.SetPointer(True)";
__ref._template /*b4j.example.vuehtml*/ ._setpointer /*b4j.example.vuehtml*/ (null,__c.True);
RDebugUtils.currentLine=237502466;
 //BA.debugLineNum = 237502466;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237502467;
 //BA.debugLineNum = 237502467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondragend(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setondragend", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setondragend", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=240910336;
 //BA.debugLineNum = 240910336;BA.debugLine="Sub SetOnDragEnd(methodName As String) As VueCompo";
RDebugUtils.currentLine=240910337;
 //BA.debugLineNum = 240910337;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=240910338;
 //BA.debugLineNum = 240910338;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=240910339;
 //BA.debugLineNum = 240910339;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=240910340;
 //BA.debugLineNum = 240910340;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=240910341;
 //BA.debugLineNum = 240910341;BA.debugLine="SetAttr(CreateMap(\"v-on:dragend\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:dragend"),(Object)(_methodname)}));
RDebugUtils.currentLine=240910343;
 //BA.debugLineNum = 240910343;BA.debugLine="SetCallBack(methodName, cb)";
__ref._setcallback /*String*/ (null,_methodname,_cb);
 };
RDebugUtils.currentLine=240910345;
 //BA.debugLineNum = 240910345;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240910346;
 //BA.debugLineNum = 240910346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondragenter(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setondragenter", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setondragenter", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=240975872;
 //BA.debugLineNum = 240975872;BA.debugLine="Sub SetOnDragEnter(methodName As String) As VueCom";
RDebugUtils.currentLine=240975873;
 //BA.debugLineNum = 240975873;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=240975874;
 //BA.debugLineNum = 240975874;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=240975875;
 //BA.debugLineNum = 240975875;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=240975876;
 //BA.debugLineNum = 240975876;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=240975877;
 //BA.debugLineNum = 240975877;BA.debugLine="SetAttr(CreateMap(\"v-on:dragenter\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:dragenter"),(Object)(_methodname)}));
RDebugUtils.currentLine=240975879;
 //BA.debugLineNum = 240975879;BA.debugLine="SetCallBack(methodName, cb)";
__ref._setcallback /*String*/ (null,_methodname,_cb);
 };
RDebugUtils.currentLine=240975881;
 //BA.debugLineNum = 240975881;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240975882;
 //BA.debugLineNum = 240975882;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondragover(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setondragover", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setondragover", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=240779264;
 //BA.debugLineNum = 240779264;BA.debugLine="Sub SetOnDragOver(methodName As String) As VueComp";
RDebugUtils.currentLine=240779265;
 //BA.debugLineNum = 240779265;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=240779266;
 //BA.debugLineNum = 240779266;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=240779267;
 //BA.debugLineNum = 240779267;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=240779268;
 //BA.debugLineNum = 240779268;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=240779269;
 //BA.debugLineNum = 240779269;BA.debugLine="SetAttr(CreateMap(\"v-on:dragover\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:dragover"),(Object)(_methodname)}));
RDebugUtils.currentLine=240779271;
 //BA.debugLineNum = 240779271;BA.debugLine="SetCallBack(methodName, cb)";
__ref._setcallback /*String*/ (null,_methodname,_cb);
 };
RDebugUtils.currentLine=240779273;
 //BA.debugLineNum = 240779273;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240779274;
 //BA.debugLineNum = 240779274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondragstart(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setondragstart", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setondragstart", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=240844800;
 //BA.debugLineNum = 240844800;BA.debugLine="Sub SetOnDragStart(methodName As String) As VueCom";
RDebugUtils.currentLine=240844801;
 //BA.debugLineNum = 240844801;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=240844802;
 //BA.debugLineNum = 240844802;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=240844803;
 //BA.debugLineNum = 240844803;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=240844804;
 //BA.debugLineNum = 240844804;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=240844805;
 //BA.debugLineNum = 240844805;BA.debugLine="SetAttr(CreateMap(\"v-on:dragstart\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:dragstart"),(Object)(_methodname)}));
RDebugUtils.currentLine=240844807;
 //BA.debugLineNum = 240844807;BA.debugLine="SetCallBack(methodName, cb)";
__ref._setcallback /*String*/ (null,_methodname,_cb);
 };
RDebugUtils.currentLine=240844809;
 //BA.debugLineNum = 240844809;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240844810;
 //BA.debugLineNum = 240844810;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setondrop(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setondrop", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setondrop", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=241041408;
 //BA.debugLineNum = 241041408;BA.debugLine="Sub SetOnDrop(methodName As String) As VueComponen";
RDebugUtils.currentLine=241041409;
 //BA.debugLineNum = 241041409;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=241041410;
 //BA.debugLineNum = 241041410;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=241041411;
 //BA.debugLineNum = 241041411;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=241041412;
 //BA.debugLineNum = 241041412;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=241041413;
 //BA.debugLineNum = 241041413;BA.debugLine="SetAttr(CreateMap(\"v-on:drop\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:drop"),(Object)(_methodname)}));
RDebugUtils.currentLine=241041415;
 //BA.debugLineNum = 241041415;BA.debugLine="SetCallBack(methodName, cb)";
__ref._setcallback /*String*/ (null,_methodname,_cb);
 };
RDebugUtils.currentLine=241041417;
 //BA.debugLineNum = 241041417;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=241041418;
 //BA.debugLineNum = 241041418;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonfocus(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setonfocus", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setonfocus", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=237371392;
 //BA.debugLineNum = 237371392;BA.debugLine="Sub SetOnFocus(methodName As String) As VueCompone";
RDebugUtils.currentLine=237371393;
 //BA.debugLineNum = 237371393;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=237371394;
 //BA.debugLineNum = 237371394;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=237371395;
 //BA.debugLineNum = 237371395;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=237371396;
 //BA.debugLineNum = 237371396;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=237371397;
 //BA.debugLineNum = 237371397;BA.debugLine="SetAttr(CreateMap(\"v-on:focus\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:focus"),(Object)(_methodname)}));
RDebugUtils.currentLine=237371399;
 //BA.debugLineNum = 237371399;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=237371401;
 //BA.debugLineNum = 237371401;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237371402;
 //BA.debugLineNum = 237371402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setoninput(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setoninput", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setoninput", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=237305856;
 //BA.debugLineNum = 237305856;BA.debugLine="Sub SetOnInput(methodName As String) As VueCompone";
RDebugUtils.currentLine=237305857;
 //BA.debugLineNum = 237305857;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=237305858;
 //BA.debugLineNum = 237305858;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=237305859;
 //BA.debugLineNum = 237305859;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=237305860;
 //BA.debugLineNum = 237305860;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=237305861;
 //BA.debugLineNum = 237305861;BA.debugLine="SetAttr(CreateMap(\"v-on:input\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:input"),(Object)(_methodname)}));
RDebugUtils.currentLine=237305863;
 //BA.debugLineNum = 237305863;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=237305865;
 //BA.debugLineNum = 237305865;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237305866;
 //BA.debugLineNum = 237305866;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonmouseout(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setonmouseout", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setonmouseout", new Object[] {_methodname}));}
RDebugUtils.currentLine=236060672;
 //BA.debugLineNum = 236060672;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VueComp";
RDebugUtils.currentLine=236060673;
 //BA.debugLineNum = 236060673;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=236060674;
 //BA.debugLineNum = 236060674;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseout\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:mouseout"),(Object)(_methodname)}));
RDebugUtils.currentLine=236060675;
 //BA.debugLineNum = 236060675;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236060676;
 //BA.debugLineNum = 236060676;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonmouseover(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setonmouseover", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setonmouseover", new Object[] {_methodname}));}
RDebugUtils.currentLine=236126208;
 //BA.debugLineNum = 236126208;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VueCom";
RDebugUtils.currentLine=236126209;
 //BA.debugLineNum = 236126209;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=236126210;
 //BA.debugLineNum = 236126210;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseover\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:mouseover"),(Object)(_methodname)}));
RDebugUtils.currentLine=236126211;
 //BA.debugLineNum = 236126211;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236126212;
 //BA.debugLineNum = 236126212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setonselected(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setonselected", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setonselected", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=237699072;
 //BA.debugLineNum = 237699072;BA.debugLine="Sub SetOnSelected(methodName As String) As VueComp";
RDebugUtils.currentLine=237699073;
 //BA.debugLineNum = 237699073;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=237699074;
 //BA.debugLineNum = 237699074;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=237699075;
 //BA.debugLineNum = 237699075;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=237699076;
 //BA.debugLineNum = 237699076;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=237699077;
 //BA.debugLineNum = 237699077;BA.debugLine="SetAttr(CreateMap(\"v-on:selected\": methodName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:selected"),(Object)(_methodname)}));
RDebugUtils.currentLine=237699079;
 //BA.debugLineNum = 237699079;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=237699081;
 //BA.debugLineNum = 237699081;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237699082;
 //BA.debugLineNum = 237699082;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setontouchstart(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setontouchstart", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setontouchstart", new Object[] {_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=237764608;
 //BA.debugLineNum = 237764608;BA.debugLine="Sub SetOnTouchStart(methodName As String) As VueCo";
RDebugUtils.currentLine=237764609;
 //BA.debugLineNum = 237764609;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=237764610;
 //BA.debugLineNum = 237764610;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=237764611;
 //BA.debugLineNum = 237764611;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=237764612;
 //BA.debugLineNum = 237764612;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=237764613;
 //BA.debugLineNum = 237764613;BA.debugLine="SetAttr(CreateMap(\"v-on:touchstart\": methodName)";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on:touchstart"),(Object)(_methodname)}));
RDebugUtils.currentLine=237764615;
 //BA.debugLineNum = 237764615;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=237764617;
 //BA.debugLineNum = 237764617;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237764618;
 //BA.debugLineNum = 237764618;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setpadding(b4j.example.vuecomponent __ref,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setpadding", new Object[] {_pt,_pb,_pl,_pr}));}
RDebugUtils.currentLine=241369088;
 //BA.debugLineNum = 241369088;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
RDebugUtils.currentLine=241369089;
 //BA.debugLineNum = 241369089;BA.debugLine="AddStyle(\"padding-top\", pt)";
__ref._addstyle /*b4j.example.vuecomponent*/ (null,"padding-top",_pt);
RDebugUtils.currentLine=241369090;
 //BA.debugLineNum = 241369090;BA.debugLine="AddStyle(\"padding-bottom\", pb)";
__ref._addstyle /*b4j.example.vuecomponent*/ (null,"padding-bottom",_pb);
RDebugUtils.currentLine=241369091;
 //BA.debugLineNum = 241369091;BA.debugLine="AddStyle(\"padding-left\", pl)";
__ref._addstyle /*b4j.example.vuecomponent*/ (null,"padding-left",_pl);
RDebugUtils.currentLine=241369092;
 //BA.debugLineNum = 241369092;BA.debugLine="AddStyle(\"padding-right\", pr)";
__ref._addstyle /*b4j.example.vuecomponent*/ (null,"padding-right",_pr);
RDebugUtils.currentLine=241369093;
 //BA.debugLineNum = 241369093;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=241369094;
 //BA.debugLineNum = 241369094;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setpaddingall(b4j.example.vuecomponent __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setpaddingall", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setpaddingall", new Object[] {_p}));}
RDebugUtils.currentLine=238026752;
 //BA.debugLineNum = 238026752;BA.debugLine="Sub SetPaddingAll(p As Object) As VueComponent";
RDebugUtils.currentLine=238026753;
 //BA.debugLineNum = 238026753;BA.debugLine="SetStyle(CreateMap(\"padding\":p))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("padding"),_p}));
RDebugUtils.currentLine=238026754;
 //BA.debugLineNum = 238026754;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238026755;
 //BA.debugLineNum = 238026755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setref(b4j.example.vuecomponent __ref,String _varref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setref", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setref", new Object[] {_varref}));}
RDebugUtils.currentLine=239468544;
 //BA.debugLineNum = 239468544;BA.debugLine="Sub SetRef(varRef As String) As VueComponent";
RDebugUtils.currentLine=239468545;
 //BA.debugLineNum = 239468545;BA.debugLine="If varRef <> \"\" Then";
if ((_varref).equals("") == false) { 
RDebugUtils.currentLine=239468546;
 //BA.debugLineNum = 239468546;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("ref"),(Object)(_varref)}));
 };
RDebugUtils.currentLine=239468548;
 //BA.debugLineNum = 239468548;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239468549;
 //BA.debugLineNum = 239468549;BA.debugLine="End Sub";
return null;
}
public String  _setshowstate(b4j.example.vuecomponent __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setshowstate", true))
	 {return ((String) Debug.delegate(ba, "setshowstate", new Object[] {_k,_v}));}
RDebugUtils.currentLine=235208704;
 //BA.debugLineNum = 235208704;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
RDebugUtils.currentLine=235208705;
 //BA.debugLineNum = 235208705;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
RDebugUtils.currentLine=235208706;
 //BA.debugLineNum = 235208706;BA.debugLine="SetStateSingle(showKey, v)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,__ref._showkey /*String*/ ,(Object)(_v));
RDebugUtils.currentLine=235208707;
 //BA.debugLineNum = 235208707;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuecomponent  _setsrc(b4j.example.vuecomponent __ref,String _s,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setsrc", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setsrc", new Object[] {_s,_bind}));}
RDebugUtils.currentLine=238092288;
 //BA.debugLineNum = 238092288;BA.debugLine="Sub SetSRC(s As String, bind As Boolean) As VueCom";
RDebugUtils.currentLine=238092289;
 //BA.debugLineNum = 238092289;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=238092290;
 //BA.debugLineNum = 238092290;BA.debugLine="SetAttr(CreateMap(\":src\":s))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":src"),(Object)(_s)}));
 }else {
RDebugUtils.currentLine=238092292;
 //BA.debugLineNum = 238092292;BA.debugLine="Template.SetSrc(s)";
__ref._template /*b4j.example.vuehtml*/ ._setsrc /*b4j.example.vuehtml*/ (null,_s);
 };
RDebugUtils.currentLine=238092294;
 //BA.debugLineNum = 238092294;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238092295;
 //BA.debugLineNum = 238092295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstate(b4j.example.vuecomponent __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstate", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstate", new Object[] {_m}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=236781568;
 //BA.debugLineNum = 236781568;BA.debugLine="Sub SetState(m As Map) As VueComponent";
RDebugUtils.currentLine=236781569;
 //BA.debugLineNum = 236781569;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=236781570;
 //BA.debugLineNum = 236781570;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=236781571;
 //BA.debugLineNum = 236781571;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=236781572;
 //BA.debugLineNum = 236781572;BA.debugLine="data.Put(k, v)";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=236781574;
 //BA.debugLineNum = 236781574;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236781575;
 //BA.debugLineNum = 236781575;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatedecrement(b4j.example.vuecomponent __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstatedecrement", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstatedecrement", new Object[] {_k}));}
String _oldv = "";
RDebugUtils.currentLine=234946560;
 //BA.debugLineNum = 234946560;BA.debugLine="Sub SetStateDecrement(k As String) As VueComponent";
RDebugUtils.currentLine=234946561;
 //BA.debugLineNum = 234946561;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(__ref._getstate /*Object*/ (null,_k,(Object)("0")));
RDebugUtils.currentLine=234946562;
 //BA.debugLineNum = 234946562;BA.debugLine="oldV = BANano.parseInt(oldV) - 1";
_oldv = BA.NumberToString(__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_oldv))-1);
RDebugUtils.currentLine=234946563;
 //BA.debugLineNum = 234946563;BA.debugLine="SetStateSingle(k, oldV)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,_k,(Object)(_oldv));
RDebugUtils.currentLine=234946564;
 //BA.debugLineNum = 234946564;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234946565;
 //BA.debugLineNum = 234946565;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatefalse(b4j.example.vuecomponent __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstatefalse", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstatefalse", new Object[] {_k}));}
RDebugUtils.currentLine=234815488;
 //BA.debugLineNum = 234815488;BA.debugLine="Sub SetStateFalse(k As String) As VueComponent";
RDebugUtils.currentLine=234815489;
 //BA.debugLineNum = 234815489;BA.debugLine="SetStateSingle(k,False)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,_k,(Object)(__c.False));
RDebugUtils.currentLine=234815490;
 //BA.debugLineNum = 234815490;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234815491;
 //BA.debugLineNum = 234815491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstateincrement(b4j.example.vuecomponent __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstateincrement", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstateincrement", new Object[] {_k}));}
String _oldv = "";
RDebugUtils.currentLine=234881024;
 //BA.debugLineNum = 234881024;BA.debugLine="Sub SetStateIncrement(k As String) As VueComponent";
RDebugUtils.currentLine=234881025;
 //BA.debugLineNum = 234881025;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(__ref._getstate /*Object*/ (null,_k,(Object)("0")));
RDebugUtils.currentLine=234881026;
 //BA.debugLineNum = 234881026;BA.debugLine="oldV = BANano.parseInt(oldV) + 1";
_oldv = BA.NumberToString(__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_oldv))+1);
RDebugUtils.currentLine=234881027;
 //BA.debugLineNum = 234881027;BA.debugLine="SetStateSingle(k, oldV)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,_k,(Object)(_oldv));
RDebugUtils.currentLine=234881028;
 //BA.debugLineNum = 234881028;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234881029;
 //BA.debugLineNum = 234881029;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatelist(b4j.example.vuecomponent __ref,String _mapkey,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstatelist", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstatelist", new Object[] {_mapkey,_mapvalues}));}
RDebugUtils.currentLine=236650496;
 //BA.debugLineNum = 236650496;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
RDebugUtils.currentLine=236650497;
 //BA.debugLineNum = 236650497;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=236650498;
 //BA.debugLineNum = 236650498;BA.debugLine="opt.Put(mapKey, mapValues)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
RDebugUtils.currentLine=236650499;
 //BA.debugLineNum = 236650499;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.vuecomponent*/ (null,__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=236650500;
 //BA.debugLineNum = 236650500;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236650501;
 //BA.debugLineNum = 236650501;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatelistvalues(b4j.example.vuecomponent __ref,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstatelistvalues", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstatelistvalues", new Object[] {_mapvalues}));}
String _lstvalue = "";
RDebugUtils.currentLine=236716032;
 //BA.debugLineNum = 236716032;BA.debugLine="Sub SetStateListValues(mapValues As List) As VueCo";
RDebugUtils.currentLine=236716033;
 //BA.debugLineNum = 236716033;BA.debugLine="For Each lstValue As String In mapValues";
{
final anywheresoftware.b4a.BA.IterableList group1 = _mapvalues;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstvalue = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=236716034;
 //BA.debugLineNum = 236716034;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=236716035;
 //BA.debugLineNum = 236716035;BA.debugLine="opt.Put(lstValue, \"\")";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_lstvalue),(Object)(""));
RDebugUtils.currentLine=236716036;
 //BA.debugLineNum = 236716036;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.vuecomponent*/ (null,__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ );
 }
};
RDebugUtils.currentLine=236716038;
 //BA.debugLineNum = 236716038;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236716039;
 //BA.debugLineNum = 236716039;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatemap(b4j.example.vuecomponent __ref,String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstatemap", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstatemap", new Object[] {_mapkey,_mapvalues}));}
RDebugUtils.currentLine=236584960;
 //BA.debugLineNum = 236584960;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
RDebugUtils.currentLine=236584961;
 //BA.debugLineNum = 236584961;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=236584962;
 //BA.debugLineNum = 236584962;BA.debugLine="opt.Put(mapKey, mapValues)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
RDebugUtils.currentLine=236584963;
 //BA.debugLineNum = 236584963;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.vuecomponent*/ (null,__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=236584964;
 //BA.debugLineNum = 236584964;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236584965;
 //BA.debugLineNum = 236584965;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setstatetrue(b4j.example.vuecomponent __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setstatetrue", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setstatetrue", new Object[] {_k}));}
RDebugUtils.currentLine=234749952;
 //BA.debugLineNum = 234749952;BA.debugLine="Sub SetStateTrue(k As String) As VueComponent";
RDebugUtils.currentLine=234749953;
 //BA.debugLineNum = 234749953;BA.debugLine="SetStateSingle(k,True)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,_k,(Object)(__c.True));
RDebugUtils.currentLine=234749954;
 //BA.debugLineNum = 234749954;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234749955;
 //BA.debugLineNum = 234749955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settabindex(b4j.example.vuecomponent __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=234225664;
 //BA.debugLineNum = 234225664;BA.debugLine="Sub SetTabIndex(ti As String) As VueComponent";
RDebugUtils.currentLine=234225665;
 //BA.debugLineNum = 234225665;BA.debugLine="Template.SetTabIndex(ti)";
__ref._template /*b4j.example.vuehtml*/ ._settabindex /*b4j.example.vuehtml*/ (null,_ti);
RDebugUtils.currentLine=234225666;
 //BA.debugLineNum = 234225666;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234225667;
 //BA.debugLineNum = 234225667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settag(b4j.example.vuecomponent __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "settag", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "settag", new Object[] {_t}));}
RDebugUtils.currentLine=237961216;
 //BA.debugLineNum = 237961216;BA.debugLine="Sub SetTag(t As String) As VueComponent";
RDebugUtils.currentLine=237961217;
 //BA.debugLineNum = 237961217;BA.debugLine="Template.SetTag(t)";
__ref._template /*b4j.example.vuehtml*/ ._settag /*b4j.example.vuehtml*/ (null,_t);
RDebugUtils.currentLine=237961218;
 //BA.debugLineNum = 237961218;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237961219;
 //BA.debugLineNum = 237961219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settemplate(b4j.example.vuecomponent __ref,String _tmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "settemplate", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "settemplate", new Object[] {_tmp}));}
RDebugUtils.currentLine=235339776;
 //BA.debugLineNum = 235339776;BA.debugLine="Sub SetTemplate(tmp As String) As VueComponent";
RDebugUtils.currentLine=235339777;
 //BA.debugLineNum = 235339777;BA.debugLine="Template.clear";
__ref._template /*b4j.example.vuehtml*/ ._clear /*b4j.example.vuehtml*/ (null);
RDebugUtils.currentLine=235339778;
 //BA.debugLineNum = 235339778;BA.debugLine="Template.SetText(tmp)";
__ref._template /*b4j.example.vuehtml*/ ._settext /*b4j.example.vuehtml*/ (null,_tmp);
RDebugUtils.currentLine=235339779;
 //BA.debugLineNum = 235339779;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235339780;
 //BA.debugLineNum = 235339780;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settextaligncenter(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "settextaligncenter", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "settextaligncenter", null));}
RDebugUtils.currentLine=240386048;
 //BA.debugLineNum = 240386048;BA.debugLine="Sub SetTextAlignCenter As VueComponent";
RDebugUtils.currentLine=240386049;
 //BA.debugLineNum = 240386049;BA.debugLine="SetStyle(CreateMap(\"text-align\": \"center\"))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("text-align"),(Object)("center")}));
RDebugUtils.currentLine=240386050;
 //BA.debugLineNum = 240386050;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240386051;
 //BA.debugLineNum = 240386051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setto(b4j.example.vuecomponent __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setto", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setto", new Object[] {_t}));}
RDebugUtils.currentLine=238288896;
 //BA.debugLineNum = 238288896;BA.debugLine="Sub SetTo(t As Object) As VueComponent";
RDebugUtils.currentLine=238288897;
 //BA.debugLineNum = 238288897;BA.debugLine="Template.SetAttr(\"to\", t)";
__ref._template /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"to",BA.ObjectToString(_t));
RDebugUtils.currentLine=238288898;
 //BA.debugLineNum = 238288898;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238288899;
 //BA.debugLineNum = 238288899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _settype(b4j.example.vuecomponent __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "settype", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "settype", new Object[] {_t}));}
RDebugUtils.currentLine=239337472;
 //BA.debugLineNum = 239337472;BA.debugLine="Sub SetType(t As String) As VueComponent";
RDebugUtils.currentLine=239337473;
 //BA.debugLineNum = 239337473;BA.debugLine="Template.SetType(t)";
__ref._template /*b4j.example.vuehtml*/ ._settype /*b4j.example.vuehtml*/ (null,_t);
RDebugUtils.currentLine=239337474;
 //BA.debugLineNum = 239337474;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239337475;
 //BA.debugLineNum = 239337475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setupdated(b4j.example.vuecomponent __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setupdated", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setupdated", new Object[] {_methodname}));}
RDebugUtils.currentLine=235798528;
 //BA.debugLineNum = 235798528;BA.debugLine="Sub SetUpdated(methodName As String) As VueCompone";
RDebugUtils.currentLine=235798529;
 //BA.debugLineNum = 235798529;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=235798530;
 //BA.debugLineNum = 235798530;BA.debugLine="updated = BANano.CallBack(module, methodName, Nul";
__ref._updated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=235798531;
 //BA.debugLineNum = 235798531;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235798532;
 //BA.debugLineNum = 235798532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvalue(b4j.example.vuecomponent __ref,String _valuename,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvalue", new Object[] {_valuename,_bind}));}
RDebugUtils.currentLine=240058368;
 //BA.debugLineNum = 240058368;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
RDebugUtils.currentLine=240058369;
 //BA.debugLineNum = 240058369;BA.debugLine="If bind Then";
if (_bind) { 
RDebugUtils.currentLine=240058370;
 //BA.debugLineNum = 240058370;BA.debugLine="valueName = valueName.tolowercase";
_valuename = _valuename.toLowerCase();
RDebugUtils.currentLine=240058371;
 //BA.debugLineNum = 240058371;BA.debugLine="SetAttr(CreateMap(\":value\":valueName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)(":value"),(Object)(_valuename)}));
 }else {
RDebugUtils.currentLine=240058373;
 //BA.debugLineNum = 240058373;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("value"),(Object)(_valuename)}));
 };
RDebugUtils.currentLine=240058375;
 //BA.debugLineNum = 240058375;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240058376;
 //BA.debugLineNum = 240058376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvbind(b4j.example.vuecomponent __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvbind", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvbind", new Object[] {_t}));}
RDebugUtils.currentLine=239796224;
 //BA.debugLineNum = 239796224;BA.debugLine="Sub SetVBind(t As String) As VueComponent";
RDebugUtils.currentLine=239796225;
 //BA.debugLineNum = 239796225;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
RDebugUtils.currentLine=239796226;
 //BA.debugLineNum = 239796226;BA.debugLine="SetAttr(CreateMap(\"v-bind\": t))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-bind"),(Object)(_t)}));
RDebugUtils.currentLine=239796227;
 //BA.debugLineNum = 239796227;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239796228;
 //BA.debugLineNum = 239796228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvcloak(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvcloak", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvcloak", null));}
RDebugUtils.currentLine=234160128;
 //BA.debugLineNum = 234160128;BA.debugLine="Sub SetVCloak As VueComponent";
RDebugUtils.currentLine=234160129;
 //BA.debugLineNum = 234160129;BA.debugLine="Template.setvcloak";
__ref._template /*b4j.example.vuehtml*/ ._setvcloak /*b4j.example.vuehtml*/ (null);
RDebugUtils.currentLine=234160130;
 //BA.debugLineNum = 234160130;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234160131;
 //BA.debugLineNum = 234160131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvelse(b4j.example.vuecomponent __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvelse", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvelse", new Object[] {_t}));}
RDebugUtils.currentLine=239599616;
 //BA.debugLineNum = 239599616;BA.debugLine="Sub SetVElse(t As Object) As VueComponent";
RDebugUtils.currentLine=239599617;
 //BA.debugLineNum = 239599617;BA.debugLine="SetAttr(CreateMap(\"v-else\": t))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-else"),_t}));
RDebugUtils.currentLine=239599618;
 //BA.debugLineNum = 239599618;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239599619;
 //BA.debugLineNum = 239599619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvelseif(b4j.example.vuecomponent __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvelseif", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvelseif", new Object[] {_t}));}
RDebugUtils.currentLine=239665152;
 //BA.debugLineNum = 239665152;BA.debugLine="Sub SetVElseIf(t As Object) As VueComponent";
RDebugUtils.currentLine=239665153;
 //BA.debugLineNum = 239665153;BA.debugLine="SetAttr(CreateMap(\"v-else-if\": t))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-else-if"),_t}));
RDebugUtils.currentLine=239665154;
 //BA.debugLineNum = 239665154;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239665155;
 //BA.debugLineNum = 239665155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setverticalalignmiddle(b4j.example.vuecomponent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setverticalalignmiddle", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setverticalalignmiddle", null));}
RDebugUtils.currentLine=238485504;
 //BA.debugLineNum = 238485504;BA.debugLine="Sub SetVerticalAlignMiddle As VueComponent";
RDebugUtils.currentLine=238485505;
 //BA.debugLineNum = 238485505;BA.debugLine="SetStyle(CreateMap(\"vertical-align\": \"middle\"))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("vertical-align"),(Object)("middle")}));
RDebugUtils.currentLine=238485506;
 //BA.debugLineNum = 238485506;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238485507;
 //BA.debugLineNum = 238485507;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvfor(b4j.example.vuecomponent __ref,String _item,String _datasource) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvfor", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvfor", new Object[] {_item,_datasource}));}
String _sline = "";
RDebugUtils.currentLine=239992832;
 //BA.debugLineNum = 239992832;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
RDebugUtils.currentLine=239992833;
 //BA.debugLineNum = 239992833;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
RDebugUtils.currentLine=239992834;
 //BA.debugLineNum = 239992834;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
RDebugUtils.currentLine=239992835;
 //BA.debugLineNum = 239992835;BA.debugLine="If StateExists(dataSource) = False Then";
if (__ref._stateexists /*boolean*/ (null,_datasource)==__c.False) { 
RDebugUtils.currentLine=239992836;
 //BA.debugLineNum = 239992836;BA.debugLine="Log(\"VueComponent.SetVFor: The data source state";
__c.Log("VueComponent.SetVFor: The data source state has not been registered, register it first!");
 };
RDebugUtils.currentLine=239992838;
 //BA.debugLineNum = 239992838;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
RDebugUtils.currentLine=239992839;
 //BA.debugLineNum = 239992839;BA.debugLine="SetAttr(CreateMap(\"v-for\": sline))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-for"),(Object)(_sline)}));
RDebugUtils.currentLine=239992840;
 //BA.debugLineNum = 239992840;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239992841;
 //BA.debugLineNum = 239992841;BA.debugLine="End Sub";
return null;
}
public boolean  _stateexists(b4j.example.vuecomponent __ref,String _statename) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "stateexists", true))
	 {return ((Boolean) Debug.delegate(ba, "stateexists", new Object[] {_statename}));}
RDebugUtils.currentLine=235143168;
 //BA.debugLineNum = 235143168;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
RDebugUtils.currentLine=235143169;
 //BA.debugLineNum = 235143169;BA.debugLine="stateName = stateName.tolowercase";
_statename = _statename.toLowerCase();
RDebugUtils.currentLine=235143170;
 //BA.debugLineNum = 235143170;BA.debugLine="Return data.ContainsKey(stateName)";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_statename));
RDebugUtils.currentLine=235143171;
 //BA.debugLineNum = 235143171;BA.debugLine="End Sub";
return false;
}
public b4j.example.vuecomponent  _setvhtml(b4j.example.vuecomponent __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvhtml", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvhtml", new Object[] {_h}));}
RDebugUtils.currentLine=240123904;
 //BA.debugLineNum = 240123904;BA.debugLine="Sub SetVHtml(h As String) As VueComponent";
RDebugUtils.currentLine=240123905;
 //BA.debugLineNum = 240123905;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vuecomponent)(this);};
RDebugUtils.currentLine=240123906;
 //BA.debugLineNum = 240123906;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
RDebugUtils.currentLine=240123907;
 //BA.debugLineNum = 240123907;BA.debugLine="SetAttr(CreateMap(\"v-html\": h))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-html"),(Object)(_h)}));
RDebugUtils.currentLine=240123908;
 //BA.debugLineNum = 240123908;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240123909;
 //BA.debugLineNum = 240123909;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvif(b4j.example.vuecomponent __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=238682112;
 //BA.debugLineNum = 238682112;BA.debugLine="Sub SetVIf(vif As String) As VueComponent";
RDebugUtils.currentLine=238682113;
 //BA.debugLineNum = 238682113;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
RDebugUtils.currentLine=238682114;
 //BA.debugLineNum = 238682114;BA.debugLine="If HasState(vif) = False Then";
if (__ref._hasstate /*boolean*/ (null,_vif)==__c.False) { 
RDebugUtils.currentLine=238682115;
 //BA.debugLineNum = 238682115;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=238682116;
 //BA.debugLineNum = 238682116;BA.debugLine="opt.Put(vif, False)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vif),(Object)(__c.False));
RDebugUtils.currentLine=238682117;
 //BA.debugLineNum = 238682117;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.vuecomponent*/ (null,__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=238682119;
 //BA.debugLineNum = 238682119;BA.debugLine="SetVIf(vif)";
__ref._setvif /*b4j.example.vuecomponent*/ (null,_vif);
RDebugUtils.currentLine=238682120;
 //BA.debugLineNum = 238682120;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=238682121;
 //BA.debugLineNum = 238682121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvmodel(b4j.example.vuecomponent __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=237830144;
 //BA.debugLineNum = 237830144;BA.debugLine="Sub SetVModel(k As String) As VueComponent";
RDebugUtils.currentLine=237830145;
 //BA.debugLineNum = 237830145;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=237830146;
 //BA.debugLineNum = 237830146;BA.debugLine="If HasState(k) = False Then";
if (__ref._hasstate /*boolean*/ (null,_k)==__c.False) { 
RDebugUtils.currentLine=237830147;
 //BA.debugLineNum = 237830147;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=237830148;
 //BA.debugLineNum = 237830148;BA.debugLine="opt.Put(k, Null)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),__c.Null);
RDebugUtils.currentLine=237830149;
 //BA.debugLineNum = 237830149;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.vuecomponent*/ (null,__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=237830151;
 //BA.debugLineNum = 237830151;BA.debugLine="Template.SetAttr(\"v-model\", k)";
__ref._template /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"v-model",_k);
RDebugUtils.currentLine=237830152;
 //BA.debugLineNum = 237830152;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=237830153;
 //BA.debugLineNum = 237830153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvon(b4j.example.vuecomponent __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvon", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvon", new Object[] {_t}));}
RDebugUtils.currentLine=239730688;
 //BA.debugLineNum = 239730688;BA.debugLine="Sub SetVOn(t As Object) As VueComponent";
RDebugUtils.currentLine=239730689;
 //BA.debugLineNum = 239730689;BA.debugLine="SetAttr(CreateMap(\"v-on\": t))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-on"),_t}));
RDebugUtils.currentLine=239730690;
 //BA.debugLineNum = 239730690;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239730691;
 //BA.debugLineNum = 239730691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvonce(b4j.example.vuecomponent __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvonce", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvonce", new Object[] {_t}));}
RDebugUtils.currentLine=239927296;
 //BA.debugLineNum = 239927296;BA.debugLine="Sub SetVOnce(t As Object) As VueComponent";
RDebugUtils.currentLine=239927297;
 //BA.debugLineNum = 239927297;BA.debugLine="SetAttr(CreateMap(\"v-once\": t))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-once"),_t}));
RDebugUtils.currentLine=239927298;
 //BA.debugLineNum = 239927298;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239927299;
 //BA.debugLineNum = 239927299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setvtext(b4j.example.vuecomponent __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setvtext", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setvtext", new Object[] {_t}));}
RDebugUtils.currentLine=239534080;
 //BA.debugLineNum = 239534080;BA.debugLine="Sub SetVText(t As Object) As VueComponent";
RDebugUtils.currentLine=239534081;
 //BA.debugLineNum = 239534081;BA.debugLine="SetAttr(CreateMap(\"v-text\": t))";
__ref._setattr /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("v-text"),_t}));
RDebugUtils.currentLine=239534082;
 //BA.debugLineNum = 239534082;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=239534083;
 //BA.debugLineNum = 239534083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setwatch(b4j.example.vuecomponent __ref,String _k,boolean _bimmediate,boolean _bdeep,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setwatch", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setwatch", new Object[] {_k,_bimmediate,_bdeep,_methodname}));}
Object _newval = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _deepit = null;
RDebugUtils.currentLine=236519424;
 //BA.debugLineNum = 236519424;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
RDebugUtils.currentLine=236519425;
 //BA.debugLineNum = 236519425;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=236519426;
 //BA.debugLineNum = 236519426;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)) { 
RDebugUtils.currentLine=236519427;
 //BA.debugLineNum = 236519427;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=236519428;
 //BA.debugLineNum = 236519428;BA.debugLine="If data.ContainsKey(k) Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=236519429;
 //BA.debugLineNum = 236519429;BA.debugLine="SetStateSingle(k, Null)";
__ref._setstatesingle /*b4j.example.vuecomponent*/ (null,_k,__c.Null);
 };
RDebugUtils.currentLine=236519431;
 //BA.debugLineNum = 236519431;BA.debugLine="Dim newVal As Object";
_newval = new Object();
RDebugUtils.currentLine=236519432;
 //BA.debugLineNum = 236519432;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_newval}))));
RDebugUtils.currentLine=236519433;
 //BA.debugLineNum = 236519433;BA.debugLine="Dim deepit As Map = CreateMap()";
_deepit = new anywheresoftware.b4a.objects.collections.Map();
_deepit = __c.createMap(new Object[] {});
RDebugUtils.currentLine=236519434;
 //BA.debugLineNum = 236519434;BA.debugLine="deepit.Put(\"handler\", methodName)";
_deepit.Put((Object)("handler"),(Object)(_methodname));
RDebugUtils.currentLine=236519435;
 //BA.debugLineNum = 236519435;BA.debugLine="deepit.Put(\"deep\", bDeep)";
_deepit.Put((Object)("deep"),(Object)(_bdeep));
RDebugUtils.currentLine=236519436;
 //BA.debugLineNum = 236519436;BA.debugLine="deepit.Put(\"immediate\", bImmediate)";
_deepit.Put((Object)("immediate"),(Object)(_bimmediate));
RDebugUtils.currentLine=236519437;
 //BA.debugLineNum = 236519437;BA.debugLine="watches.Put(k, deepit)";
__ref._watches /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),(Object)(_deepit.getObject()));
RDebugUtils.currentLine=236519438;
 //BA.debugLineNum = 236519438;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=236519440;
 //BA.debugLineNum = 236519440;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=236519441;
 //BA.debugLineNum = 236519441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _setwidth(b4j.example.vuecomponent __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=240582656;
 //BA.debugLineNum = 240582656;BA.debugLine="Sub SetWidth(w As String) As VueComponent";
RDebugUtils.currentLine=240582657;
 //BA.debugLineNum = 240582657;BA.debugLine="SetStyle(CreateMap(\"width\":w))";
__ref._setstyle /*b4j.example.vuecomponent*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
RDebugUtils.currentLine=240582658;
 //BA.debugLineNum = 240582658;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=240582659;
 //BA.debugLineNum = 240582659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _templatefromproperty(b4j.example.vuecomponent __ref,String _propname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "templatefromproperty", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "templatefromproperty", new Object[] {_propname}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=234029056;
 //BA.debugLineNum = 234029056;BA.debugLine="Sub TemplateFromProperty(propName As String) As Vu";
RDebugUtils.currentLine=234029057;
 //BA.debugLineNum = 234029057;BA.debugLine="propName = propName.ToLowerCase";
_propname = _propname.toLowerCase();
RDebugUtils.currentLine=234029058;
 //BA.debugLineNum = 234029058;BA.debugLine="propFrom = propName";
__ref._propfrom /*String*/  = _propname;
RDebugUtils.currentLine=234029059;
 //BA.debugLineNum = 234029059;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"Ren";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(this,"RenderIt",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=234029060;
 //BA.debugLineNum = 234029060;BA.debugLine="opt.Put(\"render\", cb)";
__ref._opt /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("render"),(Object)(_cb.getObject()));
RDebugUtils.currentLine=234029061;
 //BA.debugLineNum = 234029061;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=234029062;
 //BA.debugLineNum = 234029062;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _togglestate(b4j.example.vuecomponent __ref,String _statename) throws Exception{
__ref = this;
RDebugUtils.currentModule="vuecomponent";
if (Debug.shouldDelegate(ba, "togglestate", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "togglestate", new Object[] {_statename}));}
boolean _bcurrent = false;
anywheresoftware.b4a.objects.collections.Map _optx = null;
RDebugUtils.currentLine=235077632;
 //BA.debugLineNum = 235077632;BA.debugLine="Sub ToggleState(stateName As String) As VueCompone";
RDebugUtils.currentLine=235077633;
 //BA.debugLineNum = 235077633;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,\"\")";
_bcurrent = BA.ObjectToBoolean(__ref._getstate /*Object*/ (null,_statename,(Object)("")));
RDebugUtils.currentLine=235077634;
 //BA.debugLineNum = 235077634;BA.debugLine="bcurrent = Not(bcurrent)";
_bcurrent = __c.Not(_bcurrent);
RDebugUtils.currentLine=235077635;
 //BA.debugLineNum = 235077635;BA.debugLine="Dim optx As Map = CreateMap()";
_optx = new anywheresoftware.b4a.objects.collections.Map();
_optx = __c.createMap(new Object[] {});
RDebugUtils.currentLine=235077636;
 //BA.debugLineNum = 235077636;BA.debugLine="optx.Put(stateName, bcurrent)";
_optx.Put((Object)(_statename),(Object)(_bcurrent));
RDebugUtils.currentLine=235077637;
 //BA.debugLineNum = 235077637;BA.debugLine="SetState(optx)";
__ref._setstate /*b4j.example.vuecomponent*/ (null,_optx);
RDebugUtils.currentLine=235077638;
 //BA.debugLineNum = 235077638;BA.debugLine="Return Me";
if (true) return (b4j.example.vuecomponent)(this);
RDebugUtils.currentLine=235077639;
 //BA.debugLineNum = 235077639;BA.debugLine="End Sub";
return null;
}
}