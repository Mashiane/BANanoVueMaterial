package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananovm extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananovm", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananovm.class).invoke(this, new Object[] {null});
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
public com.ab.banano.BANano _banano = null;
public b4j.example.vmloader _overlay = null;
public anywheresoftware.b4a.objects.collections.Map _themes = null;
public anywheresoftware.b4a.objects.collections.Map _refs = null;
public anywheresoftware.b4a.objects.collections.Map _data = null;
public b4j.example.vmprompt _prompt = null;
public com.ab.banano.BANanoObject _material = null;
public com.ab.banano.BANanoObject _vueloading = null;
public com.ab.banano.BANanoObject _vuecal = null;
public com.ab.banano.BANanoObject _vuebo = null;
public com.ab.banano.BANanoObject _jquery = null;
public com.ab.banano.BANanoObject _vm = null;
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANanoObject _vmdef = null;
public b4j.example.vmelement _content = null;
public b4j.example.vmtoolbar _navbar = null;
public b4j.example.vmdrawer _drawer = null;
public b4j.example.vmelement _app = null;
public b4j.example.vmalert _alert = null;
public b4j.example.vmconfirm _confirm = null;
public b4j.example.vmsnackbar _snack = null;
public anywheresoftware.b4a.objects.collections.Map _coloroptions = null;
public anywheresoftware.b4a.objects.collections.Map _borderoptions = null;
public anywheresoftware.b4a.objects.collections.Map _intensityoptions = null;
public boolean _hasknob = false;
public boolean _hasinfobox = false;
public anywheresoftware.b4a.objects.collections.Map _elevation = null;
public b4j.example.vmcontainer _container = null;
public String _gettemplate = "";
public anywheresoftware.b4a.objects.collections.List _pages = null;
public com.ab.banano.BANanoObject _chartkick = null;
public com.ab.banano.BANanoObject _chart = null;
public com.ab.banano.BANanoObject _vuegooglemaps = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _addpage(b4j.example.bananovm __ref,String _name,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_name,_module}));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Sub AddPage(name As String, module As Object)";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="Pages.add(name)";
__ref._pages /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_name));
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="BANano.CallSub(module, \"Code\", Array(Me))   'igno";
__ref._banano /*com.ab.banano.BANano*/ .CallSub(_module,"Code",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{this}));
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="End Sub";
return "";
}
public String  _getconfirm(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getconfirm", true))
	 {return ((String) Debug.delegate(ba, "getconfirm", null));}
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Sub GetConfirm As String";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Return Vue.getstate(\"confirmkey\",\"\")";
if (true) return BA.ObjectToString(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,"confirmkey",(Object)("")));
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="End Sub";
return "";
}
public Object  _getstate(b4j.example.bananovm __ref,String _k,Object _default) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getstate", true))
	 {return ((Object) Debug.delegate(ba, "getstate", new Object[] {_k,_default}));}
Object _res = null;
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Sub GetState(k As String, default As Object) As Ob";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="Dim res As Object = Vue.GetState(k, default)";
_res = __ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,_k,_default);
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="End Sub";
return null;
}
public String  _showsnackbar(b4j.example.bananovm __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showsnackbar", true))
	 {return ((String) Debug.delegate(ba, "showsnackbar", new Object[] {_message}));}
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Sub ShowSnackBar(Message As String)";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="Vue.SetState(CreateMap(\"snackmessage\":Message))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("snackmessage"),(Object)(_message)}));
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="Snack.show";
__ref._snack /*b4j.example.vmsnackbar*/ ._show /*String*/ (null);
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.bananovm __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_elid}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Sub Show(elID As String)";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Vue.SetStateSingle($\"${elID}show\"$, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.True));
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
return "";
}
public String  _showpage(b4j.example.bananovm __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_name}));}
String _page = "";
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Sub ShowPage(name As String)";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="For Each page As String In Pages";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._pages /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_page = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="If name = page Then";
if ((_name).equals(_page)) { 
RDebugUtils.currentLine=29687811;
 //BA.debugLineNum = 29687811;BA.debugLine="Show(name)";
__ref._show /*String*/ (null,_name);
 }else {
RDebugUtils.currentLine=29687813;
 //BA.debugLineNum = 29687813;BA.debugLine="Hide(page)";
__ref._hide /*String*/ (null,_page);
 };
 }
};
RDebugUtils.currentLine=29687816;
 //BA.debugLineNum = 29687816;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.example.bananovm __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", new Object[] {_elid}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Sub Hide(elID As String)";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="Vue.SetStateSingle($\"${elID}show\"$, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.False));
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.bananovm __ref,anywheresoftware.b4a.BA _ba,Object _module,String _sappname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_module,_sappname}));}
int _e = 0;
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Public Sub Initialize(module As Object, sAppName A";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Pages.initialize";
__ref._pages /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="Vue.Initialize()";
__ref._vue /*b4j.example.bananovue*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=29753347;
 //BA.debugLineNum = 29753347;BA.debugLine="Themes.Initialize";
__ref._themes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=29753348;
 //BA.debugLineNum = 29753348;BA.debugLine="SetNeeds";
__ref._setneeds /*String*/ (null);
RDebugUtils.currentLine=29753349;
 //BA.debugLineNum = 29753349;BA.debugLine="JQuery = Vue.jquery";
__ref._jquery /*com.ab.banano.BANanoObject*/  = __ref._vue /*b4j.example.bananovue*/ ._jquery /*com.ab.banano.BANanoObject*/ ;
RDebugUtils.currentLine=29753350;
 //BA.debugLineNum = 29753350;BA.debugLine="VM.Initialize(\"VueMaterial\")";
__ref._vm /*com.ab.banano.BANanoObject*/ .Initialize((Object)("VueMaterial"));
RDebugUtils.currentLine=29753351;
 //BA.debugLineNum = 29753351;BA.debugLine="VueCal.Initialize(\"vuecal\")";
__ref._vuecal /*com.ab.banano.BANanoObject*/ .Initialize((Object)("vuecal"));
RDebugUtils.currentLine=29753352;
 //BA.debugLineNum = 29753352;BA.debugLine="VueLoading.initialize(\"VueLoading\")";
__ref._vueloading /*com.ab.banano.BANanoObject*/ .Initialize((Object)("VueLoading"));
RDebugUtils.currentLine=29753353;
 //BA.debugLineNum = 29753353;BA.debugLine="VMDef = VM.GetField(\"default\")";
__ref._vmdef /*com.ab.banano.BANanoObject*/  = __ref._vm /*com.ab.banano.BANanoObject*/ .GetField("default");
RDebugUtils.currentLine=29753354;
 //BA.debugLineNum = 29753354;BA.debugLine="Chartkick.initialize(\"Chartkick\")";
__ref._chartkick /*com.ab.banano.BANanoObject*/ .Initialize((Object)("Chartkick"));
RDebugUtils.currentLine=29753355;
 //BA.debugLineNum = 29753355;BA.debugLine="Chart.Initialize(\"Chart\")";
__ref._chart /*com.ab.banano.BANanoObject*/ .Initialize((Object)("Chart"));
RDebugUtils.currentLine=29753356;
 //BA.debugLineNum = 29753356;BA.debugLine="Vue.Use(Chartkick.RunMethod(\"use\", Chart))";
__ref._vue /*b4j.example.bananovue*/ ._use /*String*/ (null,__ref._chartkick /*com.ab.banano.BANanoObject*/ .RunMethod("use",(Object)(__ref._chart /*com.ab.banano.BANanoObject*/ .getObject())));
RDebugUtils.currentLine=29753357;
 //BA.debugLineNum = 29753357;BA.debugLine="Vue.Use(VMDef)";
__ref._vue /*b4j.example.bananovue*/ ._use /*String*/ (null,__ref._vmdef /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=29753358;
 //BA.debugLineNum = 29753358;BA.debugLine="Vue.Use(VueLoading)";
__ref._vue /*b4j.example.bananovue*/ ._use /*String*/ (null,__ref._vueloading /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=29753359;
 //BA.debugLineNum = 29753359;BA.debugLine="Vue.AddComponentBO(\"loading\",VueLoading)";
__ref._vue /*b4j.example.bananovue*/ ._addcomponentbo /*b4j.example.bananovue*/ (null,"loading",__ref._vueloading /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=29753360;
 //BA.debugLineNum = 29753360;BA.debugLine="Vue.AddComponentBO(\"vue-cal\", VueCal)";
__ref._vue /*b4j.example.bananovue*/ ._addcomponentbo /*b4j.example.bananovue*/ (null,"vue-cal",__ref._vuecal /*com.ab.banano.BANanoObject*/ );
RDebugUtils.currentLine=29753361;
 //BA.debugLineNum = 29753361;BA.debugLine="App = CreateApp(\"\")";
__ref._app /*b4j.example.vmelement*/  = __ref._createapp /*b4j.example.vmelement*/ (null,"");
RDebugUtils.currentLine=29753362;
 //BA.debugLineNum = 29753362;BA.debugLine="Vue.SetStateSingle(\"navbarmode\", Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"navbarmode",__c.Null);
RDebugUtils.currentLine=29753363;
 //BA.debugLineNum = 29753363;BA.debugLine="App.SetAttr1(\":md-mode\", \"navbarmode\")";
__ref._app /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":md-mode",(Object)("navbarmode"));
RDebugUtils.currentLine=29753364;
 //BA.debugLineNum = 29753364;BA.debugLine="Vue.SetState(CreateMap(\"navbartitle\":sAppName))";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("navbartitle"),(Object)(_sappname)}));
RDebugUtils.currentLine=29753365;
 //BA.debugLineNum = 29753365;BA.debugLine="Vue.SetState(CreateMap(\"drawertblbartitle\":sAppNa";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("drawertblbartitle"),(Object)(_sappname)}));
RDebugUtils.currentLine=29753366;
 //BA.debugLineNum = 29753366;BA.debugLine="Vue.SetState(CreateMap(\"snack\":False,\"backshow\":F";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("snack"),(Object)(__c.False),(Object)("backshow"),(Object)(__c.False),(Object)("menushow"),(Object)(__c.True)}));
RDebugUtils.currentLine=29753367;
 //BA.debugLineNum = 29753367;BA.debugLine="Vue.SetState(CreateMap(\"alerttitle\":\"\",\"alertmess";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("alerttitle"),(Object)(""),(Object)("alertmessage"),(Object)(""),(Object)("alertkey"),(Object)(""),(Object)("snackmessage"),(Object)(""),(Object)("confirmtext"),(Object)("")}));
RDebugUtils.currentLine=29753368;
 //BA.debugLineNum = 29753368;BA.debugLine="Vue.SetState(CreateMap(\"confirmtitle\":\"\",\"confirm";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("confirmtitle"),(Object)(""),(Object)("confirmmessage"),(Object)(""),(Object)("confirmkey"),(Object)(""),(Object)("confirmtext"),(Object)(""),(Object)("canceltext"),(Object)("")}));
RDebugUtils.currentLine=29753369;
 //BA.debugLineNum = 29753369;BA.debugLine="NavBar.Initialize(Vue, \"navbar\", module)";
__ref._navbar /*b4j.example.vmtoolbar*/ ._initialize /*b4j.example.vmtoolbar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"navbar",_module);
RDebugUtils.currentLine=29753370;
 //BA.debugLineNum = 29753370;BA.debugLine="Drawer.Initialize(Vue, \"drawer\", module)";
__ref._drawer /*b4j.example.vmdrawer*/ ._initialize /*b4j.example.vmdrawer*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"drawer",_module);
RDebugUtils.currentLine=29753371;
 //BA.debugLineNum = 29753371;BA.debugLine="Content = CreateAppContent(\"content\")";
__ref._content /*b4j.example.vmelement*/  = __ref._createappcontent /*b4j.example.vmelement*/ (null,"content");
RDebugUtils.currentLine=29753372;
 //BA.debugLineNum = 29753372;BA.debugLine="NavBar.SetHasBackButton(False).SetAppToolbar(True";
__ref._navbar /*b4j.example.vmtoolbar*/ ._sethasbackbutton /*b4j.example.vmtoolbar*/ (null,__c.False)._setapptoolbar /*b4j.example.vmtoolbar*/ (null,__c.True);
RDebugUtils.currentLine=29753373;
 //BA.debugLineNum = 29753373;BA.debugLine="NavBar.SetHasMenuButton(True)";
__ref._navbar /*b4j.example.vmtoolbar*/ ._sethasmenubutton /*b4j.example.vmtoolbar*/ (null,__c.True);
RDebugUtils.currentLine=29753376;
 //BA.debugLineNum = 29753376;BA.debugLine="Overlay = CreateLoader(\"pageloader\", module)";
__ref._overlay /*b4j.example.vmloader*/  = __ref._createloader /*b4j.example.vmloader*/ (null,"pageloader",_module);
RDebugUtils.currentLine=29753377;
 //BA.debugLineNum = 29753377;BA.debugLine="Overlay.Pop(Content)";
__ref._overlay /*b4j.example.vmloader*/ ._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=29753379;
 //BA.debugLineNum = 29753379;BA.debugLine="CreateButton(\"back\",module).SetIconButton(True).S";
__ref._createbutton /*b4j.example.vmbutton*/ (null,"back",_module)._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True)._seticon /*b4j.example.vmbutton*/ (null,"keyboard_arrow_left")._pop /*String*/ (null,__ref._navbar /*b4j.example.vmtoolbar*/ ._startsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=29753380;
 //BA.debugLineNum = 29753380;BA.debugLine="CreateButton(\"menu\",module).SetIconButton(True).S";
__ref._createbutton /*b4j.example.vmbutton*/ (null,"menu",_module)._seticonbutton /*b4j.example.vmbutton*/ (null,__c.True)._seticon /*b4j.example.vmbutton*/ (null,"menu")._setonclick /*b4j.example.vmbutton*/ (null,this)._pop /*String*/ (null,__ref._navbar /*b4j.example.vmtoolbar*/ ._startsection /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=29753382;
 //BA.debugLineNum = 29753382;BA.debugLine="NavBar.SetHasLogo(False)";
__ref._navbar /*b4j.example.vmtoolbar*/ ._sethaslogo /*b4j.example.vmtoolbar*/ (null,__c.False);
RDebugUtils.currentLine=29753383;
 //BA.debugLineNum = 29753383;BA.debugLine="NavBar.SetLogo(\"\")";
__ref._navbar /*b4j.example.vmtoolbar*/ ._setlogo /*b4j.example.vmtoolbar*/ (null,"");
RDebugUtils.currentLine=29753385;
 //BA.debugLineNum = 29753385;BA.debugLine="Alert = CreateAlert(\"alert\",module).SetTitle(\"Ale";
__ref._alert /*b4j.example.vmalert*/  = __ref._createalert /*b4j.example.vmalert*/ (null,"alert",_module)._settitle /*b4j.example.vmalert*/ (null,"Alert")._setconfirmtext /*b4j.example.vmalert*/ (null,"Ok")._setcontent /*b4j.example.vmalert*/ (null,"Alert Content!");
RDebugUtils.currentLine=29753386;
 //BA.debugLineNum = 29753386;BA.debugLine="Alert.Pop(Content)";
__ref._alert /*b4j.example.vmalert*/ ._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=29753388;
 //BA.debugLineNum = 29753388;BA.debugLine="Confirm = CreateConfirm(\"confirm\",module).SetTitl";
__ref._confirm /*b4j.example.vmconfirm*/  = __ref._createconfirm /*b4j.example.vmconfirm*/ (null,"confirm",_module)._settitle /*b4j.example.vmconfirm*/ (null,"Title")._setcontent /*b4j.example.vmconfirm*/ (null,"Content");
RDebugUtils.currentLine=29753389;
 //BA.debugLineNum = 29753389;BA.debugLine="Confirm.SetConfirmText(\"Ok\").SetCancelText(\"Cance";
__ref._confirm /*b4j.example.vmconfirm*/ ._setconfirmtext /*b4j.example.vmconfirm*/ (null,"Ok")._setcanceltext /*b4j.example.vmconfirm*/ (null,"Cancel");
RDebugUtils.currentLine=29753390;
 //BA.debugLineNum = 29753390;BA.debugLine="Confirm.Pop(Content)";
__ref._confirm /*b4j.example.vmconfirm*/ ._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=29753392;
 //BA.debugLineNum = 29753392;BA.debugLine="Prompt = CreatePrompt(\"prompt\", module).SetTitle(";
__ref._prompt /*b4j.example.vmprompt*/  = __ref._createprompt /*b4j.example.vmprompt*/ (null,"prompt",_module)._settitle /*b4j.example.vmprompt*/ (null,"Title")._setcontent /*b4j.example.vmprompt*/ (null,"Content")._setmaxlength /*b4j.example.vmprompt*/ (null,(int) (20))._setplaceholder /*b4j.example.vmprompt*/ (null,"Placeholder");
RDebugUtils.currentLine=29753393;
 //BA.debugLineNum = 29753393;BA.debugLine="Prompt.SetConfirmText(\"Ok\").SetCancelText(\"Cancel";
__ref._prompt /*b4j.example.vmprompt*/ ._setconfirmtext /*b4j.example.vmprompt*/ (null,"Ok")._setcanceltext /*b4j.example.vmprompt*/ (null,"Cancel");
RDebugUtils.currentLine=29753394;
 //BA.debugLineNum = 29753394;BA.debugLine="Prompt.Pop(Content)";
__ref._prompt /*b4j.example.vmprompt*/ ._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=29753396;
 //BA.debugLineNum = 29753396;BA.debugLine="Snack = CreateSnackBar(\"snack\",module)";
__ref._snack /*b4j.example.vmsnackbar*/  = __ref._createsnackbar /*b4j.example.vmsnackbar*/ (null,"snack",_module);
RDebugUtils.currentLine=29753397;
 //BA.debugLineNum = 29753397;BA.debugLine="Snack.Pop(Content)";
__ref._snack /*b4j.example.vmsnackbar*/ ._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=29753399;
 //BA.debugLineNum = 29753399;BA.debugLine="If SubExists(module, \"confirm_cancel\") = False Th";
if (__c.SubExists(ba,_module,"confirm_cancel")==__c.False) { 
RDebugUtils.currentLine=29753400;
 //BA.debugLineNum = 29753400;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a conf";
__c.Log("Initialize: Pleasure ensure you have a confirm_cancel event!");
 };
RDebugUtils.currentLine=29753403;
 //BA.debugLineNum = 29753403;BA.debugLine="If SubExists(module, \"confirm_ok\") = False Then";
if (__c.SubExists(ba,_module,"confirm_ok")==__c.False) { 
RDebugUtils.currentLine=29753404;
 //BA.debugLineNum = 29753404;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a conf";
__c.Log("Initialize: Pleasure ensure you have a confirm_ok event!");
 };
RDebugUtils.currentLine=29753407;
 //BA.debugLineNum = 29753407;BA.debugLine="If SubExists(module, \"prompt_cancel\") = False The";
if (__c.SubExists(ba,_module,"prompt_cancel")==__c.False) { 
RDebugUtils.currentLine=29753408;
 //BA.debugLineNum = 29753408;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a prom";
__c.Log("Initialize: Pleasure ensure you have a prompt_cancel event!");
 };
RDebugUtils.currentLine=29753411;
 //BA.debugLineNum = 29753411;BA.debugLine="If SubExists(module, \"prompt_ok\") = False Then";
if (__c.SubExists(ba,_module,"prompt_ok")==__c.False) { 
RDebugUtils.currentLine=29753412;
 //BA.debugLineNum = 29753412;BA.debugLine="Log(\"Initialize: Pleasure ensure you have a prom";
__c.Log("Initialize: Pleasure ensure you have a prompt_ok event!");
 };
RDebugUtils.currentLine=29753415;
 //BA.debugLineNum = 29753415;BA.debugLine="InitColors";
__ref._initcolors /*String*/ (null);
RDebugUtils.currentLine=29753416;
 //BA.debugLineNum = 29753416;BA.debugLine="Vue.Template.AddClass(\"page-container\")";
__ref._vue /*b4j.example.bananovue*/ ._template /*b4j.example.vuehtml*/ ._addclass /*b4j.example.vuehtml*/ (null,"page-container");
RDebugUtils.currentLine=29753417;
 //BA.debugLineNum = 29753417;BA.debugLine="Container.Initialize(Vue, sAppName & \"page\", modu";
__ref._container /*b4j.example.vmcontainer*/ ._initialize /*b4j.example.vmcontainer*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sappname+"page",_module);
RDebugUtils.currentLine=29753419;
 //BA.debugLineNum = 29753419;BA.debugLine="Dim e As Int";
_e = 0;
RDebugUtils.currentLine=29753420;
 //BA.debugLineNum = 29753420;BA.debugLine="For e = 0 To 24";
{
final int step62 = 1;
final int limit62 = (int) (24);
_e = (int) (0) ;
for (;_e <= limit62 ;_e = _e + step62 ) {
RDebugUtils.currentLine=29753421;
 //BA.debugLineNum = 29753421;BA.debugLine="Elevation.Put(e, e)";
__ref._elevation /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_e),(Object)(_e));
 }
};
RDebugUtils.currentLine=29753423;
 //BA.debugLineNum = 29753423;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setmethod(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setmethod", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setmethod", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Sub SetMethod(module As Object, methodName As Stri";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="Vue.SetMethod(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setmethod /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="End Sub";
return null;
}
public String  _ux(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "ux", true))
	 {return ((String) Debug.delegate(ba, "ux", null));}
String _rkey = "";
String _srefs = "";
String _dkey = "";
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Sub UX()";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="Content.SetText(Container.ToString)";
__ref._content /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,__ref._container /*b4j.example.vmcontainer*/ ._tostring /*String*/ (null));
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="Create";
__ref._create /*String*/ (null);
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="Vue.ux";
__ref._vue /*b4j.example.bananovue*/ ._ux /*String*/ (null);
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="GetTemplate = Vue.GetTemplate";
__ref._gettemplate /*String*/  = __ref._vue /*b4j.example.bananovue*/ ._gettemplate /*String*/ ;
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="VueBO = Vue.BOVue";
__ref._vuebo /*com.ab.banano.BANanoObject*/  = __ref._vue /*b4j.example.bananovue*/ ._bovue /*com.ab.banano.BANanoObject*/ ;
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="Dim rKey As String = \"$material\"";
_rkey = "$material";
RDebugUtils.currentLine=26017800;
 //BA.debugLineNum = 26017800;BA.debugLine="material = VueBO.GetField(rKey)";
__ref._material /*com.ab.banano.BANanoObject*/  = __ref._vuebo /*com.ab.banano.BANanoObject*/ .GetField(_rkey);
RDebugUtils.currentLine=26017801;
 //BA.debugLineNum = 26017801;BA.debugLine="Dim srefs As String = \"$refs\"";
_srefs = "$refs";
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="refs = VueBO.GetField(srefs).result";
__ref._refs /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._vuebo /*com.ab.banano.BANanoObject*/ .GetField(_srefs).Result()));
RDebugUtils.currentLine=26017803;
 //BA.debugLineNum = 26017803;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
RDebugUtils.currentLine=26017804;
 //BA.debugLineNum = 26017804;BA.debugLine="data = VueBO.GetField(dKey).Result";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._vuebo /*com.ab.banano.BANanoObject*/ .GetField(_dkey).Result()));
RDebugUtils.currentLine=26017805;
 //BA.debugLineNum = 26017805;BA.debugLine="If HasInfoBox Then SetInfoBox";
if (__ref._hasinfobox /*boolean*/ ) { 
__ref._setinfobox /*String*/ (null);};
RDebugUtils.currentLine=26017806;
 //BA.debugLineNum = 26017806;BA.debugLine="If HasKnob Then SetKnob";
if (__ref._hasknob /*boolean*/ ) { 
__ref._setknob /*String*/ (null);};
RDebugUtils.currentLine=26017808;
 //BA.debugLineNum = 26017808;BA.debugLine="SetDateFormat(\"yyyy-MM-dd\")";
__ref._setdateformat /*b4j.example.bananovm*/ (null,"yyyy-MM-dd");
RDebugUtils.currentLine=26017809;
 //BA.debugLineNum = 26017809;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setstatesingle(b4j.example.bananovm __ref,Object _k,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstatesingle", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstatesingle", new Object[] {_k,_v}));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Sub SetStateSingle(k As Object, v As Object) As BA";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="Vue.SetStateSingle(k, v)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,BA.ObjectToString(_k),_v);
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="End Sub";
return null;
}
public String  _callmethod(b4j.example.bananovm __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "callmethod", true))
	 {return ((String) Debug.delegate(ba, "callmethod", new Object[] {_methodname}));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub CallMethod(methodName As String)";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Vue.CallMethod(methodName)";
__ref._vue /*b4j.example.bananovue*/ ._callmethod /*String*/ (null,_methodname);
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _createcontainer(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcontainer", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "createcontainer", new Object[] {_sid,_eventhandler}));}
b4j.example.vmcontainer _el = null;
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Sub CreateContainer(sid As String, eventHandler As";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Dim el As VMContainer";
_el = new b4j.example.vmcontainer();
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcontainer*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="End Sub";
return null;
}
public boolean  _validate(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.Map _required) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "validate", true))
	 {return ((Boolean) Debug.delegate(ba, "validate", new Object[] {_rec,_required}));}
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Sub Validate(rec As Map, required As Map) As Boole";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="Return Vue.Validate(rec, required)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._validate /*boolean*/ (null,_rec,_required);
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="End Sub";
return false;
}
public String  _addcontainer(b4j.example.bananovm __ref,b4j.example.vmcontainer _cont) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addcontainer", true))
	 {return ((String) Debug.delegate(ba, "addcontainer", new Object[] {_cont}));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub AddContainer(cont As VMContainer)";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="Content.SetText(cont.tostring)";
__ref._content /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_cont._tostring /*String*/ (null));
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="End Sub";
return "";
}
public String  _showdialog(b4j.example.bananovm __ref,String _did) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showdialog", true))
	 {return ((String) Debug.delegate(ba, "showdialog", new Object[] {_did}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Sub ShowDialog(dID As String)";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="SetStateTrue(dID)";
__ref._setstatetrue /*b4j.example.bananovm*/ (null,_did);
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="End Sub";
return "";
}
public String  _hidedialog(b4j.example.bananovm __ref,String _did) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "hidedialog", true))
	 {return ((String) Debug.delegate(ba, "hidedialog", new Object[] {_did}));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Sub HideDialog(dID As String)";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="dID = dID.tolowercase";
_did = _did.toLowerCase();
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="SetStateFalse(dID)";
__ref._setstatefalse /*b4j.example.bananovm*/ (null,_did);
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _creategijgotable(b4j.example.bananovm __ref,String _sid,String _primarykey,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "creategijgotable", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "creategijgotable", new Object[] {_sid,_primarykey,_module}));}
b4j.example.vmgijgotable _el = null;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Sub CreateGijgoTable(sid As String, PrimaryKey As";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Dim el As VMGijgoTable";
_el = new b4j.example.vmgijgotable();
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="el.Initialize(Vue, sid, PrimaryKey, module)";
_el._initialize /*b4j.example.vmgijgotable*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_primarykey,_module);
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdialog  _createdialog(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createdialog", true))
	 {return ((b4j.example.vmdialog) Debug.delegate(ba, "createdialog", new Object[] {_sid,_module}));}
b4j.example.vmdialog _el = null;
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Sub CreateDialog(sid As String, module As Object)";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="Dim el As VMDialog";
_el = new b4j.example.vmdialog();
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmdialog*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=32505859;
 //BA.debugLineNum = 32505859;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="End Sub";
return null;
}
public String  _adddialog(b4j.example.bananovm __ref,b4j.example.vmdialog _diag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "adddialog", true))
	 {return ((String) Debug.delegate(ba, "adddialog", new Object[] {_diag}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub AddDialog(diag As VMDialog)";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="diag.Pop(Content)";
_diag._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="End Sub";
return "";
}
public String  _pagepause(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "pagepause", true))
	 {return ((String) Debug.delegate(ba, "pagepause", null));}
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Sub PagePause";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="Overlay.SetIsLoading(True)";
__ref._overlay /*b4j.example.vmloader*/ ._setisloading /*b4j.example.vmloader*/ (null,__c.True);
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="End Sub";
return "";
}
public String  _pageresume(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "pageresume", true))
	 {return ((String) Debug.delegate(ba, "pageresume", null));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Sub PageResume";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="Overlay.SetIsLoading(False)";
__ref._overlay /*b4j.example.vmloader*/ ._setisloading /*b4j.example.vmloader*/ (null,__c.False);
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="End Sub";
return "";
}
public String  _showconfirm(b4j.example.bananovm __ref,String _process,String _title,String _message,String _confirmtext,String _canceltext) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showconfirm", true))
	 {return ((String) Debug.delegate(ba, "showconfirm", new Object[] {_process,_title,_message,_confirmtext,_canceltext}));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Sub ShowConfirm(process As String, Title As String";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Vue.SetState(CreateMap(\"confirmtitle\":Title,\"conf";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("confirmtitle"),(Object)(_title),(Object)("confirmmessage"),(Object)(_message),(Object)("confirmkey"),(Object)(_process),(Object)("confirmtext"),(Object)(_confirmtext),(Object)("canceltext"),(Object)(_canceltext)}));
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="Confirm.Show";
__ref._confirm /*b4j.example.vmconfirm*/ ._show /*String*/ (null);
RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setstate(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstate", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstate", new Object[] {_m}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Sub SetState(m As Map) As BANanoVM";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="Vue.SetState(m)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,_m);
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="End Sub";
return null;
}
public String  _addalert(b4j.example.bananovm __ref,String _alertid,Object _eventhandler,String _title,String _alertcontent,String _confirmtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addalert", true))
	 {return ((String) Debug.delegate(ba, "addalert", new Object[] {_alertid,_eventhandler,_title,_alertcontent,_confirmtext}));}
b4j.example.vmalert _myalert = null;
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Sub AddAlert(alertid As String, eventHandler As Ob";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="Dim myalert As VMAlert = CreateAlert(alertid,even";
_myalert = __ref._createalert /*b4j.example.vmalert*/ (null,_alertid,_eventhandler)._setstatic /*b4j.example.vmalert*/ (null,__c.True)._settitle /*b4j.example.vmalert*/ (null,_title)._setconfirmtext /*b4j.example.vmalert*/ (null,_confirmtext)._setcontent /*b4j.example.vmalert*/ (null,_alertcontent);
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="myalert.Pop(Content)";
_myalert._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=30015491;
 //BA.debugLineNum = 30015491;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmalert  _createalert(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createalert", true))
	 {return ((b4j.example.vmalert) Debug.delegate(ba, "createalert", new Object[] {_sid,_eventhandler}));}
b4j.example.vmalert _el = null;
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Sub CreateAlert(sid As String, eventHandler As Obj";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="Dim el As VMAlert";
_el = new b4j.example.vmalert();
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmalert*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32309252;
 //BA.debugLineNum = 32309252;BA.debugLine="End Sub";
return null;
}
public String  _addcomponent(b4j.example.bananovm __ref,b4j.example.vuecomponent _comp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addcomponent", true))
	 {return ((String) Debug.delegate(ba, "addcomponent", new Object[] {_comp}));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Sub AddComponent(comp As VueComponent)";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Vue.AddComponent(comp)";
__ref._vue /*b4j.example.bananovue*/ ._addcomponent /*b4j.example.bananovue*/ (null,_comp);
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="End Sub";
return "";
}
public String  _addconfirm(b4j.example.bananovm __ref,String _confirmid,Object _eventhandler,String _title,String _confirmcontent,String _confirmtext,String _canceltext) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addconfirm", true))
	 {return ((String) Debug.delegate(ba, "addconfirm", new Object[] {_confirmid,_eventhandler,_title,_confirmcontent,_confirmtext,_canceltext}));}
b4j.example.vmconfirm _myalert = null;
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Sub AddConfirm(confirmid As String, eventHandler A";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="Dim myalert As VMConfirm = CreateConfirm(confirmi";
_myalert = __ref._createconfirm /*b4j.example.vmconfirm*/ (null,_confirmid,_eventhandler)._setstatic /*b4j.example.vmconfirm*/ (null,__c.True)._settitle /*b4j.example.vmconfirm*/ (null,_title)._setconfirmtext /*b4j.example.vmconfirm*/ (null,_confirmtext)._setcontent /*b4j.example.vmconfirm*/ (null,_confirmcontent)._setcanceltext /*b4j.example.vmconfirm*/ (null,_canceltext);
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="myalert.Pop(Content)";
_myalert._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=30081027;
 //BA.debugLineNum = 30081027;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmconfirm  _createconfirm(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createconfirm", true))
	 {return ((b4j.example.vmconfirm) Debug.delegate(ba, "createconfirm", new Object[] {_sid,_eventhandler}));}
b4j.example.vmconfirm _el = null;
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Sub CreateConfirm(sid As String, eventHandler As O";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="Dim el As VMConfirm";
_el = new b4j.example.vmconfirm();
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmconfirm*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32243716;
 //BA.debugLineNum = 32243716;BA.debugLine="End Sub";
return null;
}
public String  _addcontainerrc(b4j.example.bananovm __ref,int _row,int _col,b4j.example.vmcontainer _cont) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addcontainerrc", true))
	 {return ((String) Debug.delegate(ba, "addcontainerrc", new Object[] {_row,_col,_cont}));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Sub AddContainerRC(row As Int, col As Int, cont As";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Container.AddComponent(row, col, cont.ToString)";
__ref._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ (null,_row,_col,_cont._tostring /*String*/ (null));
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="End Sub";
return "";
}
public String  _addcontent(b4j.example.bananovm __ref,String _els) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addcontent", true))
	 {return ((String) Debug.delegate(ba, "addcontent", new Object[] {_els}));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Sub AddContent(els As String)";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Vue.SetTemplate(els)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,_els);
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="End Sub";
return "";
}
public String  _addelement(b4j.example.bananovm __ref,b4j.example.vmelement _elm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addelement", true))
	 {return ((String) Debug.delegate(ba, "addelement", new Object[] {_elm}));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub AddElement(elm As VMElement)";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="elm.Pop(Content)";
_elm._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="End Sub";
return "";
}
public String  _addgrid(b4j.example.bananovm __ref,b4j.example.vmgrid _grd) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addgrid", true))
	 {return ((String) Debug.delegate(ba, "addgrid", new Object[] {_grd}));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub AddGrid(grd As VMGrid)";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="grd.Pop(Content)";
_grd._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="End Sub";
return "";
}
public String  _addhtml(b4j.example.bananovm __ref,String _htmlcontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addhtml", true))
	 {return ((String) Debug.delegate(ba, "addhtml", new Object[] {_htmlcontent}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub AddHTML(htmlContent As String)";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Content.SetText(htmlContent)";
__ref._content /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_htmlcontent);
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="End Sub";
return "";
}
public String  _addprompt(b4j.example.bananovm __ref,String _promptid,Object _eventhandler,String _title,String _message,String _placeholder,int _maxlen,String _confirmtext,String _canceltext) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addprompt", true))
	 {return ((String) Debug.delegate(ba, "addprompt", new Object[] {_promptid,_eventhandler,_title,_message,_placeholder,_maxlen,_confirmtext,_canceltext}));}
b4j.example.vmprompt _myprompt = null;
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Sub AddPrompt(promptid As String, eventHandler As";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="Vue.SetStateSingle(promptid, Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_promptid,__c.Null);
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="Dim myprompt As VMPrompt = CreatePrompt(promptid,";
_myprompt = __ref._createprompt /*b4j.example.vmprompt*/ (null,_promptid,_eventhandler)._setstatic /*b4j.example.vmprompt*/ (null,__c.True)._settitle /*b4j.example.vmprompt*/ (null,_title)._setcontent /*b4j.example.vmprompt*/ (null,_message)._setmaxlength /*b4j.example.vmprompt*/ (null,_maxlen)._setplaceholder /*b4j.example.vmprompt*/ (null,_placeholder);
RDebugUtils.currentLine=30146563;
 //BA.debugLineNum = 30146563;BA.debugLine="myprompt.SetConfirmText(ConfirmText).SetCancelTex";
_myprompt._setconfirmtext /*b4j.example.vmprompt*/ (null,_confirmtext)._setcanceltext /*b4j.example.vmprompt*/ (null,_canceltext);
RDebugUtils.currentLine=30146564;
 //BA.debugLineNum = 30146564;BA.debugLine="myprompt.Pop(Content)";
_myprompt._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprompt  _createprompt(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createprompt", true))
	 {return ((b4j.example.vmprompt) Debug.delegate(ba, "createprompt", new Object[] {_sid,_eventhandler}));}
b4j.example.vmprompt _el = null;
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Sub CreatePrompt(sid As String, eventHandler As Ob";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="Dim el As VMPrompt";
_el = new b4j.example.vmprompt();
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmprompt*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=32178179;
 //BA.debugLineNum = 32178179;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32178180;
 //BA.debugLineNum = 32178180;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _addroute(b4j.example.bananovm __ref,String _path,b4j.example.vuecomponent _comp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addroute", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "addroute", new Object[] {_path,_comp}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub AddRoute(path As String, comp As VueComponent)";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Vue.AddRoute(path, comp)";
__ref._vue /*b4j.example.bananovue*/ ._addroute /*String*/ (null,_path,_comp);
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="End Sub";
return null;
}
public String  _addsnackbar(b4j.example.bananovm __ref,b4j.example.vmsnackbar _snackbar) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addsnackbar", true))
	 {return ((String) Debug.delegate(ba, "addsnackbar", new Object[] {_snackbar}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Sub AddSnackBar(SnackBar As VMSnackbar)";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="SnackBar.Pop(Content)";
_snackbar._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="End Sub";
return "";
}
public String  _addspeeddial(b4j.example.bananovm __ref,b4j.example.vmspeeddial _speed) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addspeeddial", true))
	 {return ((String) Debug.delegate(ba, "addspeeddial", new Object[] {_speed}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub AddSpeedDial(speed As VMSpeedDial)";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="speed.Pop(Content)";
_speed._pop /*String*/ (null,__ref._content /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="End Sub";
return "";
}
public String  _addtheme(b4j.example.bananovm __ref,String _themename,String _forecolor,String _forecolorintensity,String _backcolor,String _backcolorintensity) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "addtheme", true))
	 {return ((String) Debug.delegate(ba, "addtheme", new Object[] {_themename,_forecolor,_forecolorintensity,_backcolor,_backcolorintensity}));}
String _fc = "";
String _bc = "";
anywheresoftware.b4a.objects.collections.Map _theme = null;
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Sub AddTheme(themeName As String, ForeColor As Str";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="Dim fc As String = $\"${ForeColor} ${ForeColorInte";
_fc = (""+__c.SmartStringFormatter("",(Object)(_forecolor))+" "+__c.SmartStringFormatter("",(Object)(_forecolorintensity))+"");
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="Dim bc As String = $\"${BackColor} ${BackColorInte";
_bc = (""+__c.SmartStringFormatter("",(Object)(_backcolor))+" "+__c.SmartStringFormatter("",(Object)(_backcolorintensity))+"");
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="fc = fc.Trim";
_fc = _fc.trim();
RDebugUtils.currentLine=30343174;
 //BA.debugLineNum = 30343174;BA.debugLine="bc = bc.trim";
_bc = _bc.trim();
RDebugUtils.currentLine=30343176;
 //BA.debugLineNum = 30343176;BA.debugLine="Dim theme As Map = CreateMap()";
_theme = new anywheresoftware.b4a.objects.collections.Map();
_theme = __c.createMap(new Object[] {});
RDebugUtils.currentLine=30343177;
 //BA.debugLineNum = 30343177;BA.debugLine="theme.Put(\"fc\", fc)";
_theme.Put((Object)("fc"),(Object)(_fc));
RDebugUtils.currentLine=30343178;
 //BA.debugLineNum = 30343178;BA.debugLine="theme.Put(\"bc\", bc)";
_theme.Put((Object)("bc"),(Object)(_bc));
RDebugUtils.currentLine=30343179;
 //BA.debugLineNum = 30343179;BA.debugLine="Themes.Put(themeName, theme)";
__ref._themes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_themename),(Object)(_theme.getObject()));
RDebugUtils.currentLine=30343180;
 //BA.debugLineNum = 30343180;BA.debugLine="End Sub";
return "";
}
public int  _age(b4j.example.bananovm __ref,String _birthday) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "age", true))
	 {return ((Integer) Debug.delegate(ba, "age", new Object[] {_birthday}));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Sub Age(birthDay As String) As Int";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Return Vue.Age(birthDay)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._age /*int*/ (null,_birthday);
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _audittrail(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "audittrail", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "audittrail", new Object[] {_oldm,_newm}));}
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Return Vue.AuditTrail(oldM, newM)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._audittrail /*anywheresoftware.b4a.objects.collections.Map*/ (null,_oldm,_newm);
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="End Sub";
return null;
}
public String  _br(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "br", true))
	 {return ((String) Debug.delegate(ba, "br", null));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub BR As String";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Return \"<br>\"";
if (true) return "<br>";
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="End Sub";
return "";
}
public Object  _callcomputed(b4j.example.bananovm __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "callcomputed", true))
	 {return ((Object) Debug.delegate(ba, "callcomputed", new Object[] {_methodname}));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Sub CallComputed(methodName As String) As Object";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="Return Vue.CallComputed(methodName)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._callcomputed /*Object*/ (null,_methodname);
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="Public Overlay As VMLoader";
_overlay = new b4j.example.vmloader();
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Private Themes As Map";
_themes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="Public refs As Map";
_refs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="Public data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="Private Prompt As VMPrompt";
_prompt = new b4j.example.vmprompt();
RDebugUtils.currentLine=16973831;
 //BA.debugLineNum = 16973831;BA.debugLine="Public material As BANanoObject";
_material = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="Public VueLoading As BANanoObject";
_vueloading = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="Public VueCal As BANanoObject";
_vuecal = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973834;
 //BA.debugLineNum = 16973834;BA.debugLine="Public VueBO As BANanoObject";
_vuebo = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973835;
 //BA.debugLineNum = 16973835;BA.debugLine="Public JQuery As BANanoObject";
_jquery = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=16973837;
 //BA.debugLineNum = 16973837;BA.debugLine="Public VM As BANanoObject";
_vm = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Public Vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="Public VMDef As BANanoObject";
_vmdef = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973840;
 //BA.debugLineNum = 16973840;BA.debugLine="Public Content As VMElement";
_content = new b4j.example.vmelement();
RDebugUtils.currentLine=16973841;
 //BA.debugLineNum = 16973841;BA.debugLine="Public NavBar As VMToolBar";
_navbar = new b4j.example.vmtoolbar();
RDebugUtils.currentLine=16973842;
 //BA.debugLineNum = 16973842;BA.debugLine="Public Drawer As VMDrawer";
_drawer = new b4j.example.vmdrawer();
RDebugUtils.currentLine=16973843;
 //BA.debugLineNum = 16973843;BA.debugLine="Public App As VMElement";
_app = new b4j.example.vmelement();
RDebugUtils.currentLine=16973844;
 //BA.debugLineNum = 16973844;BA.debugLine="Private Alert As VMAlert";
_alert = new b4j.example.vmalert();
RDebugUtils.currentLine=16973845;
 //BA.debugLineNum = 16973845;BA.debugLine="Private Confirm As VMConfirm";
_confirm = new b4j.example.vmconfirm();
RDebugUtils.currentLine=16973846;
 //BA.debugLineNum = 16973846;BA.debugLine="Private Snack As VMSnackbar";
_snack = new b4j.example.vmsnackbar();
RDebugUtils.currentLine=16973847;
 //BA.debugLineNum = 16973847;BA.debugLine="Public ColorOptions As Map";
_coloroptions = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16973848;
 //BA.debugLineNum = 16973848;BA.debugLine="Public BorderOptions As Map";
_borderoptions = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16973849;
 //BA.debugLineNum = 16973849;BA.debugLine="Public IntensityOptions As Map";
_intensityoptions = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16973850;
 //BA.debugLineNum = 16973850;BA.debugLine="Private HasKnob As Boolean";
_hasknob = false;
RDebugUtils.currentLine=16973851;
 //BA.debugLineNum = 16973851;BA.debugLine="Private HasInfoBox As Boolean";
_hasinfobox = false;
RDebugUtils.currentLine=16973852;
 //BA.debugLineNum = 16973852;BA.debugLine="Public Elevation As Map";
_elevation = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16973853;
 //BA.debugLineNum = 16973853;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
RDebugUtils.currentLine=16973854;
 //BA.debugLineNum = 16973854;BA.debugLine="Public GetTemplate As String";
_gettemplate = "";
RDebugUtils.currentLine=16973855;
 //BA.debugLineNum = 16973855;BA.debugLine="Private Pages As List";
_pages = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16973856;
 //BA.debugLineNum = 16973856;BA.debugLine="Private Chartkick As BANanoObject";
_chartkick = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973857;
 //BA.debugLineNum = 16973857;BA.debugLine="Private Chart As BANanoObject";
_chart = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973858;
 //BA.debugLineNum = 16973858;BA.debugLine="Private VueGoogleMaps As BANanoObject";
_vuegooglemaps = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=16973859;
 //BA.debugLineNum = 16973859;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _compile(b4j.example.bananovm __ref,String _html) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "compile", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "compile", new Object[] {_html}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Sub Compile(html As String) As BANanoObject";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="Dim bo As BANanoObject = Vue.Compile(html)";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._vue /*b4j.example.bananovue*/ ._compile /*com.ab.banano.BANanoObject*/ (null,_html);
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _copymap(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "copymap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "copymap", new Object[] {_source,_keys}));}
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="Return Vue.CopyMap(source, keys)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._copymap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_source,_keys);
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="End Sub";
return null;
}
public String  _create(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "create", true))
	 {return ((String) Debug.delegate(ba, "create", null));}
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Sub Create";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="NavBar.Pop(App)";
__ref._navbar /*b4j.example.vmtoolbar*/ ._pop /*String*/ (null,__ref._app /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="Drawer.Pop(App)";
__ref._drawer /*b4j.example.vmdrawer*/ ._pop /*String*/ (null,__ref._app /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=31850499;
 //BA.debugLineNum = 31850499;BA.debugLine="Content.Pop(App)";
__ref._content /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._app /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=31850500;
 //BA.debugLineNum = 31850500;BA.debugLine="AddContent(App.ToString)";
__ref._addcontent /*String*/ (null,__ref._app /*b4j.example.vmelement*/ ._tostring /*String*/ (null));
RDebugUtils.currentLine=31850501;
 //BA.debugLineNum = 31850501;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _createa(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createa", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createa", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Sub CreateA(sid As String) As VMElement";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"a\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"a");
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createapp(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createapp", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createapp", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Sub CreateApp(sid As String) As VMElement";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"md-app\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"md-app");
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="el.SetStyle(CreateMap(\"height\":\"100vh\"))";
_el._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)("100vh")}));
RDebugUtils.currentLine=33554436;
 //BA.debugLineNum = 33554436;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33554437;
 //BA.debugLineNum = 33554437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createappcontent(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createappcontent", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createappcontent", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Sub CreateAppContent(sid As String) As VMElement";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="el.SetTag(\"md-app-content\")";
_el._settag /*b4j.example.vmelement*/ (null,"md-app-content");
RDebugUtils.currentLine=32964612;
 //BA.debugLineNum = 32964612;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32964613;
 //BA.debugLineNum = 32964613;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmavatar  _createavatar(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createavatar", true))
	 {return ((b4j.example.vmavatar) Debug.delegate(ba, "createavatar", new Object[] {_sid,_module}));}
b4j.example.vmavatar _el = null;
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Sub CreateAvatar(sid As String, module As Object)";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Dim el As VMAvatar";
_el = new b4j.example.vmavatar();
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="el.Initialize(Vue,sid, module)";
_el._initialize /*b4j.example.vmavatar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbadge  _createbadge(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createbadge", true))
	 {return ((b4j.example.vmbadge) Debug.delegate(ba, "createbadge", new Object[] {_sid}));}
b4j.example.vmbadge _el = null;
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub CreateBadge(sid As String) As VMBadge";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Dim el As VMBadge";
_el = new b4j.example.vmbadge();
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmbadge*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createbody1(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createbody1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createbody1", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Sub CreateBody1(sid As String) As VMElement";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetBody1(T";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setbody1 /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=26673155;
 //BA.debugLineNum = 26673155;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createbody2(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createbody2", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createbody2", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Sub CreateBody2(sid As String) As VMElement";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetBody2(T";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setbody2 /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=26804227;
 //BA.debugLineNum = 26804227;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26804228;
 //BA.debugLineNum = 26804228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombaritem  _createbottombaritem(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createbottombaritem", true))
	 {return ((b4j.example.vmbottombaritem) Debug.delegate(ba, "createbottombaritem", new Object[] {_sid,_eventhandler}));}
b4j.example.vmbottombaritem _el = null;
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Sub CreateBottomBarItem(sid As String, eventHandle";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="Dim el As VMBottomBarItem";
_el = new b4j.example.vmbottombaritem();
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmbottombaritem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=25559043;
 //BA.debugLineNum = 25559043;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=25559044;
 //BA.debugLineNum = 25559044;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbottombar  _createbuttombar(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createbuttombar", true))
	 {return ((b4j.example.vmbottombar) Debug.delegate(ba, "createbuttombar", new Object[] {_sid,_eventhandler}));}
b4j.example.vmbottombar _el = null;
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Sub CreateButtomBar(sid As String, eventHandler As";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="Dim el As VMBottomBar";
_el = new b4j.example.vmbottombar();
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmbottombar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createbutton(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "createbutton", new Object[] {_sid,_module}));}
b4j.example.vmbutton _el = null;
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Sub CreateButton(sid As String,module As Object) A";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33161220;
 //BA.debugLineNum = 33161220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createbutton1(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createbutton1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createbutton1", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Sub CreateBUTTON1(id As String) As VMElement";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="el.Initialize(Vue, id).SetTag(\"button\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"button");
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcaption(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcaption", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createcaption", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Sub CreateCaption(sid As String) As VMElement";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").AddClass(\"";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._addclass /*b4j.example.vmelement*/ (null,"md-caption");
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _createchartkick(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createchartkick", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "createchartkick", new Object[] {_sid,_eventhandler}));}
b4j.example.vmchartkick _el = null;
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Sub CreateChartKick(sid As String, eventHandler As";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Dim el As VMChartKick";
_el = new b4j.example.vmchartkick();
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmchartkick*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _createcheckbox(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcheckbox", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "createcheckbox", new Object[] {_sid,_eventhandler}));}
b4j.example.vmcheckbox _el = null;
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Sub CreateCheckBox(sid As String, eventHandler As";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcheckbox*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _createcheckboxgroup(b4j.example.bananovm __ref,String _sid,String _scaption,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcheckboxgroup", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "createcheckboxgroup", new Object[] {_sid,_scaption,_eventhandler}));}
b4j.example.vmcheckboxgroup _el = null;
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Sub CreateCheckBoxGroup(sid As String, sCaption As";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="Dim el As VMCheckBoxGroup";
_el = new b4j.example.vmcheckboxgroup();
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="el.Initialize(Vue, sid, sCaption, eventHandler)";
_el._initialize /*b4j.example.vmcheckboxgroup*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_scaption,_eventhandler);
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33292292;
 //BA.debugLineNum = 33292292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _createchip(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createchip", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "createchip", new Object[] {_sid,_eventhandler}));}
b4j.example.vmchip _el = null;
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Sub CreateChip(sid As String, eventHandler As Obje";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="Dim el As VMChip";
_el = new b4j.example.vmchip();
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmchip*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=31064067;
 //BA.debugLineNum = 31064067;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31064068;
 //BA.debugLineNum = 31064068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _createchips(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createchips", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "createchips", new Object[] {_sid,_eventhandler}));}
b4j.example.vmchips _el = null;
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Sub CreateChips(sid As String, eventHandler As Obj";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="Dim el As VMChips";
_el = new b4j.example.vmchips();
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmchips*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcol  _createcol(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcol", true))
	 {return ((b4j.example.vmcol) Debug.delegate(ba, "createcol", new Object[] {_sid}));}
b4j.example.vmcol _el = null;
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Sub CreateCol(sid As String) As VMCol";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="Dim el As VMCol";
_el = new b4j.example.vmcol();
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmcol*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=31719427;
 //BA.debugLineNum = 31719427;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuecomponent  _createcomponent(b4j.example.bananovm __ref,String _id,String _tag,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcomponent", true))
	 {return ((b4j.example.vuecomponent) Debug.delegate(ba, "createcomponent", new Object[] {_id,_tag,_eventhandler}));}
b4j.example.vuecomponent _el = null;
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub CreateComponent(id As String, tag As String, e";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Dim el As VueComponent";
_el = new b4j.example.vuecomponent();
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="el.Initialize(id, tag, eventHandler)";
_el._initialize /*b4j.example.vuecomponent*/ (null,ba,_id,_tag,_eventhandler);
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcomponent1(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcomponent1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createcomponent1", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub CreateComponent1(id As String) As VMElement";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="el.Initialize(Vue, id).SetTag(\"component\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"component");
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcss  _createcss(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcss", true))
	 {return ((b4j.example.vmcss) Debug.delegate(ba, "createcss", null));}
b4j.example.vmcss _el = null;
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Sub CreateCSS As VMCSS";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim El As VMCSS";
_el = new b4j.example.vmcss();
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="El.Initialize";
_el._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Return El";
if (true) return _el;
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcustomcomponent(b4j.example.bananovm __ref,String _id,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createcustomcomponent", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createcustomcomponent", new Object[] {_id,_tag}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub CreateCustomComponent(id As String, tag As Str";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="el.Initialize(Vue, id).SetTag(tag)";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,_tag);
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _createdatepicker(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createdatepicker", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "createdatepicker", new Object[] {_sid,_eventhandler}));}
b4j.example.vmdatepicker _el = null;
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Sub CreateDatePicker(sid As String, eventHandler A";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="Dim el As VMDatePicker";
_el = new b4j.example.vmdatepicker();
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmdatepicker*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=32702467;
 //BA.debugLineNum = 32702467;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32702468;
 //BA.debugLineNum = 32702468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdisplay1(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createdisplay1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createdisplay1", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Sub CreateDisplay1(sid As String) As VMElement";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setdisplay1 /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=27066371;
 //BA.debugLineNum = 27066371;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdisplay2(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createdisplay2", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createdisplay2", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Sub CreateDisplay2(sid As String) As VMElement";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setdisplay2 /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdisplay3(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createdisplay3", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createdisplay3", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Sub CreateDisplay3(sid As String) As VMElement";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setdisplay3 /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=27197443;
 //BA.debugLineNum = 27197443;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=27197444;
 //BA.debugLineNum = 27197444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createdisplay4(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createdisplay4", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createdisplay4", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Sub CreateDisplay4(sid As String) As VMElement";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetDisplay";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setdisplay4 /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=27262979;
 //BA.debugLineNum = 27262979;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=27262980;
 //BA.debugLineNum = 27262980;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _creatediv(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "creatediv", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "creatediv", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Sub CreateDiv(id As String) As VMElement";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="el.Initialize(Vue,id).SetTag(\"div\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _createdivider(b4j.example.bananovm __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createdivider", true))
	 {return ((b4j.example.vmdivider) Debug.delegate(ba, "createdivider", new Object[] {_b}));}
b4j.example.vmdivider _el = null;
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Sub CreateDivider(b As Boolean) As VMDivider";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="Dim el As VMDivider";
_el = new b4j.example.vmdivider();
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="el.Initialize(Vue, \"\")";
_el._initialize /*b4j.example.vmdivider*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"");
RDebugUtils.currentLine=32571395;
 //BA.debugLineNum = 32571395;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32571396;
 //BA.debugLineNum = 32571396;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdrawer  _createdrawer(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createdrawer", true))
	 {return ((b4j.example.vmdrawer) Debug.delegate(ba, "createdrawer", new Object[] {_sid,_module}));}
b4j.example.vmdrawer _el = null;
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Sub CreateDrawer(sid As String, module As Object)";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="Dim el As VMDrawer";
_el = new b4j.example.vmdrawer();
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="el.Initialize(Vue,sid, module)";
_el._initialize /*b4j.example.vmdrawer*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33095684;
 //BA.debugLineNum = 33095684;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createelement(b4j.example.bananovm __ref,String _sid,String _stag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createelement", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createelement", new Object[] {_sid,_stag}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Sub CreateElement(sid As String, stag As String) A";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="el.Initialize(Vue,sid).SetTag(stag)";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,_stag);
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createemail(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createemail", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "createemail", new Object[] {_sid,_eventhandler}));}
b4j.example.vminput _el = null;
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Sub CreateEmail(sid As String, eventHandler As Obj";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="Dim el As VMInput = CreateInput(sid, eventHandler";
_el = __ref._createinput /*b4j.example.vminput*/ (null,_sid,_eventhandler)._settypeemail /*b4j.example.vminput*/ (null,__c.True);
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createinput(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createinput", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "createinput", new Object[] {_sid,_eventhandler}));}
b4j.example.vminput _el = null;
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Sub CreateInput(sid As String, eventHandler As Obj";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="Dim el As VMInput";
_el = new b4j.example.vminput();
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminput*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=31195139;
 //BA.debugLineNum = 31195139;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31195140;
 //BA.debugLineNum = 31195140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmemptystate  _createemptystate(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createemptystate", true))
	 {return ((b4j.example.vmemptystate) Debug.delegate(ba, "createemptystate", new Object[] {_sid,_eventhandler}));}
b4j.example.vmemptystate _el = null;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub CreateEmptyState(sid As String, eventHandler A";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Dim el As VMEmptyState";
_el = new b4j.example.vmemptystate();
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmemptystate*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmenlighter  _createenlighter(b4j.example.bananovm __ref,String _sid,String _lang) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createenlighter", true))
	 {return ((b4j.example.vmenlighter) Debug.delegate(ba, "createenlighter", new Object[] {_sid,_lang}));}
b4j.example.vmenlighter _el = null;
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Sub CreateEnlighter(sid As String, lang As String)";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Dim el As VMEnlighter";
_el = new b4j.example.vmenlighter();
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="el.Initialize(Vue, sid, lang)";
_el._initialize /*b4j.example.vmenlighter*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_lang);
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfield  _createfield(b4j.example.bananovm __ref,String _parentid,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createfield", true))
	 {return ((b4j.example.vmfield) Debug.delegate(ba, "createfield", new Object[] {_parentid,_sid,_eventhandler}));}
b4j.example.vmfield _el = null;
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Sub CreateField(parentid As String, sid As String,";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="Dim el As VMField";
_el = new b4j.example.vmfield();
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="el.Initialize(Vue, parentid, sid,eventHandler)";
_el._initialize /*b4j.example.vmfield*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_parentid,_sid,_eventhandler);
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _createfile(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createfile", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "createfile", new Object[] {_sid,_eventhandler}));}
b4j.example.vmfile _el = null;
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Sub CreateFile(sid As String, eventHandler As Obje";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="Dim el As VMFile";
_el = new b4j.example.vmfile();
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmfile*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=31260675;
 //BA.debugLineNum = 31260675;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31260676;
 //BA.debugLineNum = 31260676;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmform  _createform(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createform", true))
	 {return ((b4j.example.vmform) Debug.delegate(ba, "createform", new Object[] {_sid,_eventhandler}));}
b4j.example.vmform _el = null;
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Sub CreateForm(sid As String, eventHandler As Obje";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="Dim el As VMForm";
_el = new b4j.example.vmform();
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmform*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=30998532;
 //BA.debugLineNum = 30998532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createform1(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createform1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createform1", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Sub CreateFORM1(id As String) As VMElement";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="el.Initialize(Vue, id).SetTag(\"form\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"form");
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _createfrappegantt(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createfrappegantt", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "createfrappegantt", new Object[] {_sid,_eventhandler}));}
b4j.example.vmfrappegantt _el = null;
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Sub CreateFrappeGantt(sid As String, eventHandler";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Dim el As VMFrappeGantt";
_el = new b4j.example.vmfrappegantt();
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmfrappegantt*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=19136515;
 //BA.debugLineNum = 19136515;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=19136516;
 //BA.debugLineNum = 19136516;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgmap  _creategmap(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "creategmap", true))
	 {return ((b4j.example.vmgmap) Debug.delegate(ba, "creategmap", new Object[] {_sid,_eventhandler}));}
b4j.example.vmgmap _el = null;
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub CreateGMap(sid As String, eventHandler As Obje";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Dim el As VMGMap";
_el = new b4j.example.vmgmap();
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmgmap*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _creategrid(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "creategrid", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "creategrid", new Object[] {_sid,_eventhandler}));}
b4j.example.vmgrid _el = null;
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Sub CreateGrid(sid As String, eventHandler As Obje";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="Dim el As VMGrid";
_el = new b4j.example.vmgrid();
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmgrid*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=26542083;
 //BA.debugLineNum = 26542083;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26542084;
 //BA.debugLineNum = 26542084;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh1(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createh1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh1", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Sub CreateH1(id As String) As VMElement";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h1\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"h1");
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh2(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createh2", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh2", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Sub CreateH2(id As String) As VMElement";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h2\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"h2");
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh3(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createh3", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh3", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Sub CreateH3(id As String) As VMElement";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h3\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"h3");
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh4(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createh4", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh4", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Sub CreateH4(id As String) As VMElement";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h4\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"h4");
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh5(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createh5", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh5", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Sub CreateH5(id As String) As VMElement";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h5\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"h5");
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh6(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createh6", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh6", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub CreateH6(id As String) As VMElement";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="el.Initialize(Vue, id).SetTag(\"h6\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"h6");
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createheadline(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createheadline", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createheadline", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Sub CreateHeadline(sid As String) As VMElement";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetHeadlin";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setheadline /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=27000835;
 //BA.debugLineNum = 27000835;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _createicon(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createicon", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "createicon", new Object[] {_sid}));}
b4j.example.vmicon _el = null;
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Sub CreateIcon(sid As String) As VMIcon";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="Dim el As VMIcon";
_el = new b4j.example.vmicon();
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _createimage(b4j.example.bananovm __ref,String _img,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createimage", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "createimage", new Object[] {_img,_eventhandler}));}
b4j.example.vmimage _el = null;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Sub CreateImage(img As String, eventHandler As Obj";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim el As VMImage";
_el = new b4j.example.vmimage();
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="el.Initialize(Vue, img, eventHandler)";
_el._initialize /*b4j.example.vmimage*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_img,_eventhandler);
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _createinfobox(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createinfobox", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "createinfobox", new Object[] {_sid,_eventhandler}));}
b4j.example.vminfobox _el = null;
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Sub CreateInfoBox(sid As String, eventHandler As O";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="HasInfoBox = True";
__ref._hasinfobox /*boolean*/  = __c.True;
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="Dim el As VMInfoBox";
_el = new b4j.example.vminfobox();
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminfobox*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createinput1(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createinput1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createinput1", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Sub CreateINPUT1(id As String) As VMElement";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="el.Initialize(Vue, id).SetTag(\"input\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"input");
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createkeepalive(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createkeepalive", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createkeepalive", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Sub CreateKeepAlive(sid As String) As VMElement";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"keep-alive\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"keep-alive");
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _createknob(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createknob", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "createknob", new Object[] {_sid,_eventhandler}));}
b4j.example.vmknob _el = null;
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub CreateKnob(sid As String, eventHandler As Obje";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="HasKnob = True";
__ref._hasknob /*boolean*/  = __c.True;
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Dim el As VMKnob";
_el = new b4j.example.vmknob();
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmknob*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createlabel(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "createlabel", new Object[] {_id}));}
b4j.example.vmlabel _el = null;
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Sub CreateLABEL(id As String) As VMLabel";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="Dim el As VMLabel";
_el = new b4j.example.vmlabel();
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="el.Initialize(Vue, id)";
_el._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id);
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createlayout(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createlayout", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createlayout", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Sub CreateLayout(sid As String) As VMElement";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"div\").SetLayout(Tr";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"div")._setlayout /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createlayoutitem(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createlayoutitem", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createlayoutitem", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Sub CreateLayoutItem(sid As String) As VMElement";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"div\").SetLayoutIte";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"div")._setlayoutitem /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createli(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createli", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createli", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Sub CreateLI(id As String) As VMElement";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="el.Initialize(Vue,id).SetTag(\"li\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"li");
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _createlist(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createlist", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "createlist", new Object[] {_sid,_module}));}
b4j.example.vmlist _el = null;
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Sub CreateList(sid As String,module As Object) As";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="Dim el As VMList";
_el = new b4j.example.vmlist();
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmlist*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=26411011;
 //BA.debugLineNum = 26411011;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26411012;
 //BA.debugLineNum = 26411012;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _createlistitem(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createlistitem", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "createlistitem", new Object[] {_sid,_module}));}
b4j.example.vmlistitem _el = null;
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Sub CreateListItem(sid As String, module As Object";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Dim el As VMListItem";
_el = new b4j.example.vmlistitem();
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistview  _createlistview(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createlistview", true))
	 {return ((b4j.example.vmlistview) Debug.delegate(ba, "createlistview", new Object[] {_sid,_module}));}
b4j.example.vmlistview _el = null;
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Sub CreateListView(sid As String, module As Object";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="Dim el As VMListView";
_el = new b4j.example.vmlistview();
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmlistview*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmloader  _createloader(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createloader", true))
	 {return ((b4j.example.vmloader) Debug.delegate(ba, "createloader", new Object[] {_sid,_module}));}
b4j.example.vmloader _el = null;
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Sub CreateLoader(sid As String, module As Object)";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="Dim el As VMLoader";
_el = new b4j.example.vmloader();
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmloader*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33423364;
 //BA.debugLineNum = 33423364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenu  _createmenu(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createmenu", true))
	 {return ((b4j.example.vmmenu) Debug.delegate(ba, "createmenu", new Object[] {_sid,_module}));}
b4j.example.vmmenu _el = null;
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Sub CreateMenu(sid As String, module As Object) As";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="Dim el As VMMenu";
_el = new b4j.example.vmmenu();
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmmenu*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=32112643;
 //BA.debugLineNum = 32112643;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32112644;
 //BA.debugLineNum = 32112644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _createmenuitem(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createmenuitem", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "createmenuitem", new Object[] {_sid,_eventhandler}));}
b4j.example.vmmenuitem _el = null;
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Sub CreateMenuItem(sid As String, eventHandler As";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="Dim el As VMMenuItem";
_el = new b4j.example.vmmenuitem();
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmmenuitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=32047107;
 //BA.debugLineNum = 32047107;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32047108;
 //BA.debugLineNum = 32047108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createnumber(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createnumber", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "createnumber", new Object[] {_sid,_eventhandler}));}
b4j.example.vminput _el = null;
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Sub CreateNumber(sid As String, eventHandler As Ob";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
_el = __ref._createinput /*b4j.example.vminput*/ (null,_sid,_eventhandler)._settypenumber /*b4j.example.vminput*/ (null,__c.True);
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _createnumberinput(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createnumberinput", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "createnumberinput", new Object[] {_sid}));}
b4j.example.vmnumberinput _el = null;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Sub CreateNumberInput(sid As String) As VMNumberIn";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Dim el As VMNumberInput";
_el = new b4j.example.vmnumberinput();
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmnumberinput*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createol(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createol", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createol", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub CreateOL(id As String) As VMElement";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="el.Initialize(Vue,id).SetTag(\"ol\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"ol");
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createoption1(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createoption1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createoption1", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Sub CreateOPTION1(sid As String) As VMElement";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"option\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"option");
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createp(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createp", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createp", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Sub CreateP(id As String) As VMElement";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="el.Initialize(Vue, id).SetTag(\"p\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"p");
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createpassword(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createpassword", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "createpassword", new Object[] {_sid,_eventhandler}));}
b4j.example.vminput _el = null;
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Sub CreatePassword(sid As String, eventHandler As";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
_el = __ref._createinput /*b4j.example.vminput*/ (null,_sid,_eventhandler)._settypepassword /*b4j.example.vminput*/ (null,__c.True);
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmpdf  _createpdf(b4j.example.bananovm __ref,String _sid,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createpdf", true))
	 {return ((b4j.example.vmpdf) Debug.delegate(ba, "createpdf", new Object[] {_sid,_url}));}
b4j.example.vmpdf _el = null;
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Sub CreatePDF(sid As String, url As String) As VMP";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Dim el As VMPDF";
_el = new b4j.example.vmpdf();
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="el.Initialize(Vue, sid, url)";
_el._initialize /*String*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_url);
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprettyprint  _createprettyprint(b4j.example.bananovm __ref,String _sid,String _lang) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createprettyprint", true))
	 {return ((b4j.example.vmprettyprint) Debug.delegate(ba, "createprettyprint", new Object[] {_sid,_lang}));}
b4j.example.vmprettyprint _el = null;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Sub CreatePrettyPrint(sid As String, lang As Strin";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Dim El As VMPrettyPrint";
_el = new b4j.example.vmprettyprint();
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="El.Initialize(Vue, sid, lang)";
_el._initialize /*b4j.example.vmprettyprint*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_lang);
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="Return El";
if (true) return _el;
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _createprogress(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createprogress", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "createprogress", new Object[] {_sid,_eventhandler}));}
b4j.example.vmprogress _el = null;
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Sub CreateProgress(sid As String, eventHandler As";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Dim el As VMProgress";
_el = new b4j.example.vmprogress();
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmprogress*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircle  _createprogresscircle(b4j.example.bananovm __ref,String _sid,String _width,String _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createprogresscircle", true))
	 {return ((b4j.example.vmprogresscircle) Debug.delegate(ba, "createprogresscircle", new Object[] {_sid,_width,_height}));}
b4j.example.vmprogresscircle _el = null;
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Sub CreateProgressCircle(sid As String, Width As S";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Dim el As VMProgressCircle";
_el = new b4j.example.vmprogresscircle();
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="el.Initialize(Vue, sid, Width, Height)";
_el._initialize /*b4j.example.vmprogresscircle*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_width,_height);
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=28770308;
 //BA.debugLineNum = 28770308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmproperty  _createproperty(b4j.example.bananovm __ref,Object _module,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createproperty", true))
	 {return ((b4j.example.vmproperty) Debug.delegate(ba, "createproperty", new Object[] {_module,_sid}));}
b4j.example.vmproperty _el = null;
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Sub CreateProperty(module As Object, sid As String";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="Dim el As VMProperty";
_el = new b4j.example.vmproperty();
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="el.Initialize(Vue, module, sid)";
_el._initialize /*b4j.example.vmproperty*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_module,_sid);
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32374788;
 //BA.debugLineNum = 32374788;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _createradio(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createradio", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "createradio", new Object[] {_sid,_eventhandler}));}
b4j.example.vmradio _el = null;
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Sub CreateRadio(sid As String, eventHandler As Obj";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="Dim el As VMRadio";
_el = new b4j.example.vmradio();
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmradio*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _createradiogroup(b4j.example.bananovm __ref,String _sid,String _scaption,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createradiogroup", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "createradiogroup", new Object[] {_sid,_scaption,_eventhandler}));}
b4j.example.vmradiogroup _el = null;
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Sub CreateRadioGroup(sid As String, sCaption As St";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="Dim el As VMRadioGroup";
_el = new b4j.example.vmradiogroup();
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="el.Initialize(Vue, sid, sCaption, eventHandler)";
_el._initialize /*b4j.example.vmradiogroup*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_scaption,_eventhandler);
RDebugUtils.currentLine=33226755;
 //BA.debugLineNum = 33226755;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33226756;
 //BA.debugLineNum = 33226756;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createrouterlink(b4j.example.bananovm __ref,String _rid,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createrouterlink", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createrouterlink", new Object[] {_rid,_text}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Sub CreateRouterLink(rID As String, Text As String";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="el.Initialize(Vue,rID).SetTag(\"router-link\").SetT";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_rid)._settag /*b4j.example.vmelement*/ (null,"router-link")._settext /*b4j.example.vmelement*/ (null,_text);
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createrouterview(b4j.example.bananovm __ref,String _rid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createrouterview", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createrouterview", new Object[] {_rid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Sub CreateRouterView(rID As String) As VMElement";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="el.Initialize(Vue,rID).SetTag(\"router-view\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_rid)._settag /*b4j.example.vmelement*/ (null,"router-view");
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _createrow(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createrow", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "createrow", new Object[] {_sid}));}
b4j.example.vmrow _el = null;
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Sub CreateRow(sid As String) As VMRow";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="Dim el As VMRow";
_el = new b4j.example.vmrow();
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="el.Initialize(Vue, sid)";
_el._initialize /*b4j.example.vmrow*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _createselect(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createselect", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "createselect", new Object[] {_sid,_eventhandler}));}
b4j.example.vmselect _el = null;
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Sub CreateSelect(sid As String, eventHandler As Ob";
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="el.Initialize(Vue,sid,eventHandler)";
_el._initialize /*b4j.example.vmselect*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createselect1(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createselect1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createselect1", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Sub CreateSELECT1(sid As String) As VMElement";
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"select\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"select");
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33816580;
 //BA.debugLineNum = 33816580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _createslider(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createslider", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "createslider", new Object[] {_sid,_eventhandler}));}
b4j.example.vmslider _el = null;
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Sub CreateSlider(sid As String, eventHandler As Ob";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="Dim el As VMSlider";
_el = new b4j.example.vmslider();
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmslider*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsnackbar  _createsnackbar(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createsnackbar", true))
	 {return ((b4j.example.vmsnackbar) Debug.delegate(ba, "createsnackbar", new Object[] {_sid,_eventhandler}));}
b4j.example.vmsnackbar _el = null;
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Sub CreateSnackBar(sid As String, eventHandler As";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="Dim el As VMSnackbar";
_el = new b4j.example.vmsnackbar();
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmsnackbar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=30736388;
 //BA.debugLineNum = 30736388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createspan(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createspan", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createspan", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Sub CreateSpan(sid As String) As VMElement";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="el.Initialize(Vue,sid).SetTag(\"span\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspeeddial  _createspeeddial(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createspeeddial", true))
	 {return ((b4j.example.vmspeeddial) Debug.delegate(ba, "createspeeddial", new Object[] {_sid,_eventhandler}));}
b4j.example.vmspeeddial _el = null;
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Sub CreateSpeedDial(sid As String, eventHandler As";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="Dim el As VMSpeedDial";
_el = new b4j.example.vmspeeddial();
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmspeeddial*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31916036;
 //BA.debugLineNum = 31916036;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _createspinner(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createspinner", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "createspinner", new Object[] {_sid,_eventhandler}));}
b4j.example.vmspinner _el = null;
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Sub CreateSpinner(sid As String, eventHandler As O";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Dim el As VMSpinner";
_el = new b4j.example.vmspinner();
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmspinner*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _createstepperitem(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createstepperitem", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "createstepperitem", new Object[] {_sid,_eventhandler}));}
b4j.example.vmstepitem _el = null;
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Sub CreateStepperItem(sid As String, eventHandler";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Dim el As VMStepItem";
_el = new b4j.example.vmstepitem();
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmstepitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _createsteppers(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createsteppers", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "createsteppers", new Object[] {_sid,_eventhandler}));}
b4j.example.vmsteppers _el = null;
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Sub CreateSteppers(sid As String, eventHandler As";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="Dim el As VMSteppers";
_el = new b4j.example.vmsteppers();
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmsteppers*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createsubhead(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createsubhead", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createsubhead", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Sub CreateSubHead(sid As String) As VMElement";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetSubHead";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setsubhead /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=26935299;
 //BA.debugLineNum = 26935299;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createsubheader(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createsubheader", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createsubheader", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Sub CreateSubHeader(sid As String) As VMElement";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="el.Initialize(Vue, sid).SetTagSubHeader(True)";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settagsubheader /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=31981571;
 //BA.debugLineNum = 31981571;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createsubheading(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createsubheading", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createsubheading", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Sub CreateSubHeading(sid As String) As VMElement";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="el.Initialize(Vue, sid).SetTag(\"span\").SetSubHead";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid)._settag /*b4j.example.vmelement*/ (null,"span")._setsubheading /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=26869763;
 //BA.debugLineNum = 26869763;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=26869764;
 //BA.debugLineNum = 26869764;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _createswitch(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createswitch", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "createswitch", new Object[] {_sid,_eventhandler}));}
b4j.example.vmswitch _el = null;
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Sub CreateSwitch(sid As String, eventHandler As Ob";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="Dim el As VMSwitch";
_el = new b4j.example.vmswitch();
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmswitch*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtable  _createtable(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.example.vmtable) Debug.delegate(ba, "createtable", new Object[] {_sid,_eventhandler}));}
b4j.example.vmtable _el = null;
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Sub CreateTable(sid As String, eventHandler As Obj";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim el As VMTable";
_el = new b4j.example.vmtable();
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtable*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _createtabs(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtabs", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "createtabs", new Object[] {_sid,_eventhandler}));}
b4j.example.vmtabs _el = null;
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Sub CreateTabs(sid As String, eventHandler As Obje";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="Dim el As VMTabs";
_el = new b4j.example.vmtabs();
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtabs*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _createtabsitem(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtabsitem", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "createtabsitem", new Object[] {_sid,_eventhandler}));}
b4j.example.vmtabsitem _el = null;
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Sub CreateTabsItem(sid As String, eventHandler As";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Dim el As VMTabsItem";
_el = new b4j.example.vmtabsitem();
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtabsitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=25690116;
 //BA.debugLineNum = 25690116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtag(b4j.example.bananovm __ref,String _id,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtag", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createtag", new Object[] {_id,_tag}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub CreateTag(id As String, tag As String) As VMEl";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="el.Initialize(Vue,id).SetTag(tag)";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,_tag);
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createtel(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtel", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "createtel", new Object[] {_sid,_eventhandler}));}
b4j.example.vminput _el = null;
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Sub CreateTel(sid As String, eventHandler As Objec";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
_el = __ref._createinput /*b4j.example.vminput*/ (null,_sid,_eventhandler)._settypetel /*b4j.example.vminput*/ (null,__c.True);
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _createtextarea(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtextarea", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "createtextarea", new Object[] {_sid,_eventhandler}));}
b4j.example.vmtextarea _el = null;
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Sub CreateTextArea(sid As String, eventHandler As";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="Dim el As VMTextArea";
_el = new b4j.example.vmtextarea();
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="el.Initialize(Vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmtextarea*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=31129604;
 //BA.debugLineNum = 31129604;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtextarea1(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtextarea1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createtextarea1", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Sub CreateTEXTAREA1(id As String) As VMElement";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="el.Initialize(Vue, id).SetTag(\"textarea\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"textarea");
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _createtimepicker(b4j.example.bananovm __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtimepicker", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "createtimepicker", new Object[] {_sid,_eventhandler}));}
b4j.example.vmtimepicker _el = null;
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Sub CreateTimePicker(sid As String, eventHandler A";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Dim el As VMTimePicker";
_el = new b4j.example.vmtimepicker();
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="el.Initialize(Vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtimepicker*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtoolbar  _createtoolbar(b4j.example.bananovm __ref,String _sid,Object _module) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtoolbar", true))
	 {return ((b4j.example.vmtoolbar) Debug.delegate(ba, "createtoolbar", new Object[] {_sid,_module}));}
b4j.example.vmtoolbar _el = null;
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Sub CreateToolbar(sid As String, module As Object)";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="Dim el As VMToolBar";
_el = new b4j.example.vmtoolbar();
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="el.Initialize(Vue, sid, module)";
_el._initialize /*b4j.example.vmtoolbar*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_module);
RDebugUtils.currentLine=33357827;
 //BA.debugLineNum = 33357827;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=33357828;
 //BA.debugLineNum = 33357828;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _createtree(b4j.example.bananovm __ref,Object _module,String _sid,String _prikey) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createtree", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "createtree", new Object[] {_module,_sid,_prikey}));}
b4j.example.vmtree _el = null;
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Sub CreateTree(module As Object, sid As String, pr";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="Dim el As VMTree";
_el = new b4j.example.vmtree();
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="el.Initialize(Vue, module, sid, priKey)";
_el._initialize /*b4j.example.vmtree*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_module,_sid,_prikey);
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createul(b4j.example.bananovm __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createul", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createul", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Sub CreateUL(id As String) As VMElement";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="el.Initialize(Vue,id).SetTag(\"ul\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_id)._settag /*b4j.example.vmelement*/ (null,"ul");
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _createvuecal(b4j.example.bananovm __ref,String _sid,Object _eventhandler,String _width,String _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createvuecal", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "createvuecal", new Object[] {_sid,_eventhandler,_width,_height}));}
b4j.example.vmvuecal _el = null;
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Sub CreateVueCal(sid As String, eventHandler As Ob";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="Dim el As VMVueCal";
_el = new b4j.example.vmvuecal();
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="el.Initialize(Vue, sid, eventHandler, width, heig";
_el._initialize /*b4j.example.vmvuecal*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler,_width,_height);
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _createwaterball(b4j.example.bananovm __ref,String _sid,Object _eventhandler,String _width,String _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "createwaterball", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "createwaterball", new Object[] {_sid,_eventhandler,_width,_height}));}
b4j.example.vmwaterball _el = null;
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Sub CreateWaterBall(sid As String, eventHandler As";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="Dim el As VMWaterBall";
_el = new b4j.example.vmwaterball();
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="el.Initialize(Vue, sid, eventHandler, Width, Heig";
_el._initialize /*b4j.example.vmwaterball*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler,_width,_height);
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="End Sub";
return null;
}
public String  _cstr(b4j.example.bananovm __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Sub CStr(o As Object) As String";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Return Vue.CStr(o)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._cstr /*String*/ (null,_o);
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="End Sub";
return "";
}
public String  _date2yyyymmdd(b4j.example.bananovm __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "date2yyyymmdd", true))
	 {return ((String) Debug.delegate(ba, "date2yyyymmdd", new Object[] {_value}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Sub Date2YYYYMMDD(value As Object) As String";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Return Vue.Date2YYYYMMDD(value)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._date2yyyymmdd /*String*/ (null,_value);
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="End Sub";
return "";
}
public String  _dateadd(b4j.example.bananovm __ref,String _mdate,int _howmanydays) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "dateadd", true))
	 {return ((String) Debug.delegate(ba, "dateadd", new Object[] {_mdate,_howmanydays}));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Return Vue.DateAdd(mDate, HowManyDays)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._dateadd /*String*/ (null,_mdate,_howmanydays);
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="End Sub";
return "";
}
public int  _datediff(b4j.example.bananovm __ref,String _currentdate,String _otherdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "datediff", true))
	 {return ((Integer) Debug.delegate(ba, "datediff", new Object[] {_currentdate,_otherdate}));}
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Sub DateDiff(CurrentDate As String, OtherDate As S";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Return Vue.DateDiff(CurrentDate, OtherDate)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._datediff /*int*/ (null,_currentdate,_otherdate);
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="End Sub";
return 0;
}
public String  _datenow(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "datenow", true))
	 {return ((String) Debug.delegate(ba, "datenow", null));}
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Public Sub DateNow() As String";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="Return Vue.DateNow";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._datenow /*String*/ (null);
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="End Sub";
return "";
}
public String  _datetimenow(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "datetimenow", true))
	 {return ((String) Debug.delegate(ba, "datetimenow", null));}
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Public Sub DateTimeNow() As String";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="Return Vue.DateTimeNow";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._datetimenow /*String*/ (null);
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _decrementbadge(b4j.example.bananovm __ref,String _elid,int _counted) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "decrementbadge", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "decrementbadge", new Object[] {_elid,_counted}));}
String _badvalue = "";
String _lastvalue = "";
int _intlast = 0;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub DecrementBadge(elID As String, counted As Int)";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgevalue");
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Dim lastValue As String = Vue.GetState(badValue,";
_lastvalue = BA.ObjectToString(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,_badvalue,(Object)("0")));
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="Dim intLast As Int = BANano.parseInt(lastValue)";
_intlast = __ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_lastvalue));
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="intLast = intLast - counted";
_intlast = (int) (_intlast-_counted);
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="Vue.SetStateSingle(badValue, intLast)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_badvalue,(Object)(_intlast));
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="End Sub";
return null;
}
public String  _disable(b4j.example.bananovm __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "disable", true))
	 {return ((String) Debug.delegate(ba, "disable", new Object[] {_elid}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Sub Disable(elID As String)";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.True));
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="End Sub";
return "";
}
public String  _enable(b4j.example.bananovm __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "enable", true))
	 {return ((String) Debug.delegate(ba, "enable", new Object[] {_elid}));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Sub Enable(elID As String)";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.False));
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "eqoperators", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "eqoperators", new Object[] {_sm}));}
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Sub EQOperators(sm As Map) As List";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Return Vue.EQOperators(sm)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_sm);
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _extractmap(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "extractmap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractmap", new Object[] {_source,_keys}));}
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Return ExtractMap(source, keys)";
if (true) return __ref._extractmap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_source,_keys);
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="End Sub";
return null;
}
public String  _fixrecords(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _recs,anywheresoftware.b4a.objects.collections.List _trimthese,anywheresoftware.b4a.objects.collections.List _numthese,anywheresoftware.b4a.objects.collections.List _boolthese,anywheresoftware.b4a.objects.collections.List _datethese,anywheresoftware.b4a.objects.collections.List _dblthese) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "fixrecords", true))
	 {return ((String) Debug.delegate(ba, "fixrecords", new Object[] {_recs,_trimthese,_numthese,_boolthese,_datethese,_dblthese}));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="Vue.FixRecords(recs, trimThese, numThese, boolThe";
__ref._vue /*b4j.example.bananovue*/ ._fixrecords /*String*/ (null,_recs,_trimthese,_numthese,_boolthese,_datethese,_dblthese);
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
return "";
}
public String  _fixrecordsusedesign(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _recs,b4j.example.vmcontainer _design) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "fixrecordsusedesign", true))
	 {return ((String) Debug.delegate(ba, "fixrecordsusedesign", new Object[] {_recs,_design}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Sub FixRecordsUseDesign(recs As List, design As VM";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="Vue.FixRecords(recs, design.Strings, design.Integ";
__ref._vue /*b4j.example.bananovue*/ ._fixrecords /*String*/ (null,_recs,_design._strings /*anywheresoftware.b4a.objects.collections.List*/ ,_design._integers /*anywheresoftware.b4a.objects.collections.List*/ ,_design._booleans /*anywheresoftware.b4a.objects.collections.List*/ ,_design._dates /*anywheresoftware.b4a.objects.collections.List*/ ,_design._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="End Sub";
return "";
}
public String  _forceupdate(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "forceupdate", true))
	 {return ((String) Debug.delegate(ba, "forceupdate", null));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Sub ForceUpdate";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="Vue.ForceUpdate";
__ref._vue /*b4j.example.bananovue*/ ._forceupdate /*String*/ (null);
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="End Sub";
return "";
}
public String  _getalert(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getalert", true))
	 {return ((String) Debug.delegate(ba, "getalert", null));}
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Sub GetAlert As String";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="Return Vue.getstate(\"alertkey\",\"\")";
if (true) return BA.ObjectToString(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,"alertkey",(Object)("")));
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="End Sub";
return "";
}
public String  _getalphabets(b4j.example.bananovm __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getalphabets", true))
	 {return ((String) Debug.delegate(ba, "getalphabets", new Object[] {_value}));}
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Return Vue.GetAlphabets(value)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._getalphabets /*String*/ (null,_value);
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="End Sub";
return "";
}
public String  _getchipidfromevent(b4j.example.bananovm __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getchipidfromevent", true))
	 {return ((String) Debug.delegate(ba, "getchipidfromevent", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.List _spath = null;
anywheresoftware.b4a.objects.collections.Map _sitem = null;
String _sid = "";
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Sub GetChipIDFromEvent(e As BANanoEvent) As String";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Try";
try {RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Dim spath As List = e.OtherField(\"path\").Result";
_spath = new anywheresoftware.b4a.objects.collections.List();
_spath.setObject((java.util.List)(_e.OtherField("path").Result()));
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="Dim sitem As Map = spath.get(5)";
_sitem = new anywheresoftware.b4a.objects.collections.Map();
_sitem.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_spath.Get((int) (5))));
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="Dim sid As String = sitem.get(\"id\")";
_sid = BA.ObjectToString(_sitem.Get((Object)("id")));
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Return sid";
if (true) return _sid;
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=21692426;
 //BA.debugLineNum = 21692426;BA.debugLine="End Sub";
return "";
}
public boolean  _getdisabledstate(b4j.example.bananovm __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getdisabledstate", true))
	 {return ((Boolean) Debug.delegate(ba, "getdisabledstate", new Object[] {_k}));}
String _diskey = "";
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Sub GetDisabledState(k As String) As Boolean";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(__ref._getstate /*Object*/ (null,_diskey,(Object)(__c.False)));
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="End Sub";
return false;
}
public String  _geteventtargetproperty(b4j.example.bananovm __ref,com.ab.banano.BANanoEvent _e,String _prop) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "geteventtargetproperty", true))
	 {return ((String) Debug.delegate(ba, "geteventtargetproperty", new Object[] {_e,_prop}));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="Return Vue.GetEventTargetProperty(e, prop)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._geteventtargetproperty /*String*/ (null,_e,_prop);
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue._fileobject  _getfiledetails(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _fileobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getfiledetails", true))
	 {return ((b4j.example.bananovue._fileobject) Debug.delegate(ba, "getfiledetails", new Object[] {_fileobj}));}
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Return Vue.GetFileDetails(fileObj)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._getfiledetails /*b4j.example.bananovue._fileobject*/ (null,_fileobj);
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="End Sub";
return null;
}
public String  _getidfromevent(b4j.example.bananovm __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getidfromevent", true))
	 {return ((String) Debug.delegate(ba, "getidfromevent", new Object[] {_e}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="Return Vue.GetIDFromEvent(e)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._getidfromevent /*String*/ (null,_e);
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="End Sub";
return "";
}
public String  _getkeyfromevent(b4j.example.bananovm __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getkeyfromevent", true))
	 {return ((String) Debug.delegate(ba, "getkeyfromevent", new Object[] {_e}));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="Return Vue.GetKeyFromEvent(e)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._getkeyfromevent /*String*/ (null,_e);
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="End Sub";
return "";
}
public String  _getprompt(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getprompt", true))
	 {return ((String) Debug.delegate(ba, "getprompt", null));}
String _ss = "";
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Sub GetPrompt As String";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="Dim ss As String = Vue.GetState(\"promptvalue\",\"\")";
_ss = BA.ObjectToString(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,"promptvalue",(Object)("")));
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="Return ss";
if (true) return _ss;
RDebugUtils.currentLine=29949955;
 //BA.debugLineNum = 29949955;BA.debugLine="End Sub";
return "";
}
public boolean  _getrequiredstate(b4j.example.bananovm __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getrequiredstate", true))
	 {return ((Boolean) Debug.delegate(ba, "getrequiredstate", new Object[] {_k}));}
String _diskey = "";
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Sub GetRequiredState(k As String) As Boolean";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(__ref._getstate /*Object*/ (null,_diskey,(Object)(__c.False)));
RDebugUtils.currentLine=27525123;
 //BA.debugLineNum = 27525123;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowstate(b4j.example.bananovm __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getshowstate", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowstate", new Object[] {_k}));}
String _showkey = "";
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Sub GetShowState(k As String) As Boolean";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="Return GetState(showKey,False)";
if (true) return BA.ObjectToBoolean(__ref._getstate /*Object*/ (null,_showkey,(Object)(__c.False)));
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "getstates", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getstates", new Object[] {_lst}));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Sub GetStates(lst As List) As Map";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="Return Vue.GetStates(lst)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._getstates /*anywheresoftware.b4a.objects.collections.Map*/ (null,_lst);
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(b4j.example.bananovm __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "hasstate", true))
	 {return ((Boolean) Debug.delegate(ba, "hasstate", new Object[] {_k}));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Sub HasState(k As String) As Boolean";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Return Vue.HasState(k)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._hasstate /*boolean*/ (null,_k);
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="End Sub";
return false;
}
public b4j.example.bananovm  _setstatefalse(b4j.example.bananovm __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstatefalse", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstatefalse", new Object[] {_k}));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Sub SetStateFalse(k As String) As BANanoVM";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="Vue.SetStateFalse(k)";
__ref._vue /*b4j.example.bananovue*/ ._setstatefalse /*b4j.example.bananovue*/ (null,_k);
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="End Sub";
return null;
}
public String  _hideerror(b4j.example.bananovm __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "hideerror", true))
	 {return ((String) Debug.delegate(ba, "hideerror", new Object[] {_elid}));}
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub HideError(elID As String)";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Vue.SetStateSingle($\"${elID}error\"$, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.False));
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="End Sub";
return "";
}
public String  _hideitems(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "hideitems", true))
	 {return ((String) Debug.delegate(ba, "hideitems", new Object[] {_items}));}
String _item = "";
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Sub HideItems(items As List)";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Vue.SetStateSingle(item, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_item,(Object)(__c.False));
 }
};
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="End Sub";
return "";
}
public String  _hr(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "hr", true))
	 {return ((String) Debug.delegate(ba, "hr", null));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub HR As String";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="Return \"<hr>\"";
if (true) return "<hr>";
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
return "";
}
public String  _httpupload(b4j.example.bananovm __ref,Object _fileobj,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "httpupload", true))
	 {return ((String) Debug.delegate(ba, "httpupload", new Object[] {_fileobj,_module,_methodname}));}
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Sub HTTPUpload(fileObj As Object, module As Object";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="Vue.HTTPUpload(fileObj, module, methodname)";
__ref._vue /*b4j.example.bananovue*/ ._httpupload /*String*/ (null,_fileobj,_module,_methodname);
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _incrementbadge(b4j.example.bananovm __ref,String _elid,int _counted) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "incrementbadge", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "incrementbadge", new Object[] {_elid,_counted}));}
String _badvalue = "";
String _lastvalue = "";
int _intlast = 0;
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub IncrementBadge(elID As String, counted As Int)";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgevalue");
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="Dim lastValue As String = Vue.GetState(badValue,";
_lastvalue = BA.ObjectToString(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,_badvalue,(Object)("0")));
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Dim intLast As Int = BANano.parseInt(lastValue)";
_intlast = __ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_lastvalue));
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="intLast = intLast + counted";
_intlast = (int) (_intlast+_counted);
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Vue.SetStateSingle(badValue, intLast)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_badvalue,(Object)(_intlast));
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="End Sub";
return null;
}
public String  _initcolors(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "initcolors", true))
	 {return ((String) Debug.delegate(ba, "initcolors", null));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="private Sub InitColors";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="IntensityOptions.Initialize";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="IntensityOptions.put(\"\",\"Normal\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(""),(Object)("Normal"));
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="IntensityOptions.put(\"lighten-1\",\"Lighten 1\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lighten-1"),(Object)("Lighten 1"));
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="IntensityOptions.put(\"lighten-2\",\"Lighten 2\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lighten-2"),(Object)("Lighten 2"));
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="IntensityOptions.put(\"lighten-3\",\"Lighten 3\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lighten-3"),(Object)("Lighten 3"));
RDebugUtils.currentLine=20709382;
 //BA.debugLineNum = 20709382;BA.debugLine="IntensityOptions.put(\"lighten-4\",\"Lighten 4\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lighten-4"),(Object)("Lighten 4"));
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="IntensityOptions.put(\"lighten-5\",\"Lighten 5\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lighten-5"),(Object)("Lighten 5"));
RDebugUtils.currentLine=20709384;
 //BA.debugLineNum = 20709384;BA.debugLine="IntensityOptions.put(\"darken-1\",\"Darken 1\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("darken-1"),(Object)("Darken 1"));
RDebugUtils.currentLine=20709385;
 //BA.debugLineNum = 20709385;BA.debugLine="IntensityOptions.put(\"darken-2\",\"Darken 2\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("darken-2"),(Object)("Darken 2"));
RDebugUtils.currentLine=20709386;
 //BA.debugLineNum = 20709386;BA.debugLine="IntensityOptions.put(\"darken-3\",\"Darken 3\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("darken-3"),(Object)("Darken 3"));
RDebugUtils.currentLine=20709387;
 //BA.debugLineNum = 20709387;BA.debugLine="IntensityOptions.put(\"darken-4\",\"Darken 4\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("darken-4"),(Object)("Darken 4"));
RDebugUtils.currentLine=20709388;
 //BA.debugLineNum = 20709388;BA.debugLine="IntensityOptions.put(\"accent-1\",\"Accent 1\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("accent-1"),(Object)("Accent 1"));
RDebugUtils.currentLine=20709389;
 //BA.debugLineNum = 20709389;BA.debugLine="IntensityOptions.put(\"accent-2\",\"Accent 2\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("accent-2"),(Object)("Accent 2"));
RDebugUtils.currentLine=20709390;
 //BA.debugLineNum = 20709390;BA.debugLine="IntensityOptions.put(\"accent-3\",\"Accent 3\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("accent-3"),(Object)("Accent 3"));
RDebugUtils.currentLine=20709391;
 //BA.debugLineNum = 20709391;BA.debugLine="IntensityOptions.put(\"accent-4\",\"Accent 4\")";
__ref._intensityoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("accent-4"),(Object)("Accent 4"));
RDebugUtils.currentLine=20709393;
 //BA.debugLineNum = 20709393;BA.debugLine="ColorOptions.Initialize";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=20709394;
 //BA.debugLineNum = 20709394;BA.debugLine="ColorOptions.Put(\"amber\",\"Amber\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber"),(Object)("Amber"));
RDebugUtils.currentLine=20709395;
 //BA.debugLineNum = 20709395;BA.debugLine="ColorOptions.Put(\"black\",\"Black\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("black"),(Object)("Black"));
RDebugUtils.currentLine=20709396;
 //BA.debugLineNum = 20709396;BA.debugLine="ColorOptions.Put(\"blue\",\"Blue\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue"),(Object)("Blue"));
RDebugUtils.currentLine=20709397;
 //BA.debugLineNum = 20709397;BA.debugLine="ColorOptions.Put(\"blue-grey\",\"Blue Grey\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey"),(Object)("Blue Grey"));
RDebugUtils.currentLine=20709398;
 //BA.debugLineNum = 20709398;BA.debugLine="ColorOptions.Put(\"brown\",\"Brown\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown"),(Object)("Brown"));
RDebugUtils.currentLine=20709399;
 //BA.debugLineNum = 20709399;BA.debugLine="ColorOptions.Put(\"cyan\",\"Cyan\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan"),(Object)("Cyan"));
RDebugUtils.currentLine=20709400;
 //BA.debugLineNum = 20709400;BA.debugLine="ColorOptions.Put(\"deep-orange\",\"Deep Orange\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange"),(Object)("Deep Orange"));
RDebugUtils.currentLine=20709401;
 //BA.debugLineNum = 20709401;BA.debugLine="ColorOptions.Put(\"deep-purple\",\"Deep Purple\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple"),(Object)("Deep Purple"));
RDebugUtils.currentLine=20709402;
 //BA.debugLineNum = 20709402;BA.debugLine="ColorOptions.Put(\"green\",\"Green\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green"),(Object)("Green"));
RDebugUtils.currentLine=20709403;
 //BA.debugLineNum = 20709403;BA.debugLine="ColorOptions.Put(\"grey\",\"Grey\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey"),(Object)("Grey"));
RDebugUtils.currentLine=20709404;
 //BA.debugLineNum = 20709404;BA.debugLine="ColorOptions.Put(\"indigo\",\"Indigo\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo"),(Object)("Indigo"));
RDebugUtils.currentLine=20709405;
 //BA.debugLineNum = 20709405;BA.debugLine="ColorOptions.Put(\"light-blue\",\"Light Blue\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue"),(Object)("Light Blue"));
RDebugUtils.currentLine=20709406;
 //BA.debugLineNum = 20709406;BA.debugLine="ColorOptions.Put(\"light-green\", \"Light Green\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green"),(Object)("Light Green"));
RDebugUtils.currentLine=20709407;
 //BA.debugLineNum = 20709407;BA.debugLine="ColorOptions.Put(\"lime\", \"Lime\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime"),(Object)("Lime"));
RDebugUtils.currentLine=20709408;
 //BA.debugLineNum = 20709408;BA.debugLine="ColorOptions.Put(\"orange\", \"Orange\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange"),(Object)("Orange"));
RDebugUtils.currentLine=20709409;
 //BA.debugLineNum = 20709409;BA.debugLine="ColorOptions.Put(\"pink\", \"Pink\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink"),(Object)("Pink"));
RDebugUtils.currentLine=20709410;
 //BA.debugLineNum = 20709410;BA.debugLine="ColorOptions.Put(\"purple\", \"Purple\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple"),(Object)("Purple"));
RDebugUtils.currentLine=20709411;
 //BA.debugLineNum = 20709411;BA.debugLine="ColorOptions.Put(\"red\", \"Red\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red"),(Object)("Red"));
RDebugUtils.currentLine=20709412;
 //BA.debugLineNum = 20709412;BA.debugLine="ColorOptions.Put(\"teal\", \"Teal\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal"),(Object)("Teal"));
RDebugUtils.currentLine=20709413;
 //BA.debugLineNum = 20709413;BA.debugLine="ColorOptions.Put(\"transparent\", \"Transparent\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("transparent"),(Object)("Transparent"));
RDebugUtils.currentLine=20709414;
 //BA.debugLineNum = 20709414;BA.debugLine="ColorOptions.Put(\"white\", \"White\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("white"),(Object)("White"));
RDebugUtils.currentLine=20709415;
 //BA.debugLineNum = 20709415;BA.debugLine="ColorOptions.Put(\"yellow\", \"Yellow\")";
__ref._coloroptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow"),(Object)("Yellow"));
RDebugUtils.currentLine=20709417;
 //BA.debugLineNum = 20709417;BA.debugLine="BorderOptions.Initialize";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=20709418;
 //BA.debugLineNum = 20709418;BA.debugLine="BorderOptions.Put(\"dashed\", \"Dashed\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("dashed"),(Object)("Dashed"));
RDebugUtils.currentLine=20709419;
 //BA.debugLineNum = 20709419;BA.debugLine="BorderOptions.Put(\"dotted\", \"Dotted\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("dotted"),(Object)("Dotted"));
RDebugUtils.currentLine=20709420;
 //BA.debugLineNum = 20709420;BA.debugLine="BorderOptions.Put(\"double\", \"Double\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("double"),(Object)("Double"));
RDebugUtils.currentLine=20709421;
 //BA.debugLineNum = 20709421;BA.debugLine="BorderOptions.Put(\"groove\", \"Groove\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("groove"),(Object)("Groove"));
RDebugUtils.currentLine=20709422;
 //BA.debugLineNum = 20709422;BA.debugLine="BorderOptions.Put(\"hidden\", \"Hidden\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("hidden"),(Object)("Hidden"));
RDebugUtils.currentLine=20709423;
 //BA.debugLineNum = 20709423;BA.debugLine="BorderOptions.Put(\"inset\", \"Inset\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("inset"),(Object)("Inset"));
RDebugUtils.currentLine=20709424;
 //BA.debugLineNum = 20709424;BA.debugLine="BorderOptions.Put(\"none\", \"None\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("none"),(Object)("None"));
RDebugUtils.currentLine=20709425;
 //BA.debugLineNum = 20709425;BA.debugLine="BorderOptions.Put(\"outset\", \"Outset\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("outset"),(Object)("Outset"));
RDebugUtils.currentLine=20709426;
 //BA.debugLineNum = 20709426;BA.debugLine="BorderOptions.Put(\"ridge\", \"Ridge\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ridge"),(Object)("Ridge"));
RDebugUtils.currentLine=20709427;
 //BA.debugLineNum = 20709427;BA.debugLine="BorderOptions.Put(\"solid\", \"Solid\")";
__ref._borderoptions /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("solid"),(Object)("Solid"));
RDebugUtils.currentLine=20709428;
 //BA.debugLineNum = 20709428;BA.debugLine="End Sub";
return "";
}
public String  _setneeds(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setneeds", true))
	 {return ((String) Debug.delegate(ba, "setneeds", null));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="private Sub SetNeeds";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="HasKnob = False";
__ref._hasknob /*boolean*/  = __c.False;
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="HasInfoBox = False";
__ref._hasinfobox /*boolean*/  = __c.False;
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="End Sub";
return "";
}
public int  _instr(b4j.example.bananovm __ref,String _searchit,String _searchfor) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "instr", true))
	 {return ((Integer) Debug.delegate(ba, "instr", new Object[] {_searchit,_searchfor}));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Sub InStr(searchit As String, searchfor As String)";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Return Vue.InStr(searchit, searchfor)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._instr /*int*/ (null,_searchit,_searchfor);
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _joinlists(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "joinlists", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "joinlists", new Object[] {_lst}));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Sub JoinLists(lst As List) As List";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Return Vue.JoinLists(lst)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._joinlists /*anywheresoftware.b4a.objects.collections.List*/ (null,_lst);
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _joinmaps(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "joinmaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "joinmaps", new Object[] {_lst}));}
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Sub JoinMaps(lst As List) As Map";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Return Vue.JoinMaps(lst)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._joinmaps /*anywheresoftware.b4a.objects.collections.Map*/ (null,_lst);
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="End Sub";
return null;
}
public String  _joinnonblanks(b4j.example.bananovm __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "joinnonblanks", true))
	 {return ((String) Debug.delegate(ba, "joinnonblanks", new Object[] {_delimiter,_lst}));}
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Return Vue.JoinNonBlanks(delimiter, lst)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._joinnonblanks /*String*/ (null,_delimiter,_lst);
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _jqueryelement(b4j.example.bananovm __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "jqueryelement", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "jqueryelement", new Object[] {_sid}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Sub JQueryElement(sid As String) As BANanoObject";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="sid = sid.ToLowerCase";
_sid = _sid.toLowerCase();
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="Dim bo As BANanoObject = JQuery.Selector($\"#${sid";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._jquery /*com.ab.banano.BANanoObject*/ .Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(_sid))+"")));
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=34078724;
 //BA.debugLineNum = 34078724;BA.debugLine="End Sub";
return null;
}
public String  _jsonpretty(b4j.example.bananovm __ref,Object _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "jsonpretty", true))
	 {return ((String) Debug.delegate(ba, "jsonpretty", new Object[] {_m}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub JSONPretty(m As Object) As String";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Return Vue.JSONPretty(m)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._jsonpretty /*String*/ (null,_m);
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="End Sub";
return "";
}
public String  _jsonsetproperty(b4j.example.bananovm __ref,String _sjson,anywheresoftware.b4a.objects.collections.Map _updates) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "jsonsetproperty", true))
	 {return ((String) Debug.delegate(ba, "jsonsetproperty", new Object[] {_sjson,_updates}));}
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Return Vue.JSONSetProperty(sjson, updates)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._jsonsetproperty /*String*/ (null,_sjson,_updates);
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="End Sub";
return "";
}
public int  _len(b4j.example.bananovm __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "len", true))
	 {return ((Integer) Debug.delegate(ba, "len", new Object[] {_text}));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="private Sub Len(Text As String) As Int";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Return Text.Length";
if (true) return _text.length();
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _list2map(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "list2map", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "list2map", new Object[] {_lst,_keyname,_valuename}));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Return List2Options(lst, keyName, valueName)";
if (true) return __ref._list2options /*anywheresoftware.b4a.objects.collections.Map*/ (null,_lst,_keyname,_valuename);
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2options(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "list2options", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "list2options", new Object[] {_lst,_keyname,_valuename}));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Return List2Options(lst, keyName, valueName)";
if (true) return __ref._list2options /*anywheresoftware.b4a.objects.collections.Map*/ (null,_lst,_keyname,_valuename);
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="End Sub";
return null;
}
public String  _makeboolean(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "makeboolean", true))
	 {return ((String) Debug.delegate(ba, "makeboolean", new Object[] {_m,_xkeys}));}
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="Vue.MakeBoolean(m, xkeys)";
__ref._vue /*b4j.example.bananovue*/ ._makeboolean /*String*/ (null,_m,_xkeys);
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="End Sub";
return "";
}
public String  _makedate(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "makedate", true))
	 {return ((String) Debug.delegate(ba, "makedate", new Object[] {_m,_xkeys}));}
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="Vue.MakeDate(m, xkeys)";
__ref._vue /*b4j.example.bananovue*/ ._makedate /*String*/ (null,_m,_xkeys);
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="End Sub";
return "";
}
public String  _makedouble(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "makedouble", true))
	 {return ((String) Debug.delegate(ba, "makedouble", new Object[] {_m,_xkeys}));}
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="Vue.MakeDouble(m, xkeys)";
__ref._vue /*b4j.example.bananovue*/ ._makedouble /*String*/ (null,_m,_xkeys);
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="End Sub";
return "";
}
public String  _makeinteger(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "makeinteger", true))
	 {return ((String) Debug.delegate(ba, "makeinteger", new Object[] {_m,_xkeys}));}
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="Vue.MakeInteger(m, xkeys)";
__ref._vue /*b4j.example.bananovue*/ ._makeinteger /*String*/ (null,_m,_xkeys);
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _makelowercase(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "makelowercase", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "makelowercase", new Object[] {_m}));}
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="Return Vue.MakeLowerCase(m)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._makelowercase /*anywheresoftware.b4a.objects.collections.Map*/ (null,_m);
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="End Sub";
return null;
}
public String  _makepx(b4j.example.bananovm __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "makepx", true))
	 {return ((String) Debug.delegate(ba, "makepx", new Object[] {_svalue}));}
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Sub MakePx(sValue As String) As String";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Return Vue.MakePx(sValue)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._makepx /*String*/ (null,_svalue);
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="End Sub";
return "";
}
public String  _maketrim(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "maketrim", true))
	 {return ((String) Debug.delegate(ba, "maketrim", new Object[] {_m,_xkeys}));}
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="Vue.MakeTrim(m, xkeys)";
__ref._vue /*b4j.example.bananovue*/ ._maketrim /*String*/ (null,_m,_xkeys);
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _map2options(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _m,String _keyname,String _valuename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "map2options", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "map2options", new Object[] {_m,_keyname,_valuename}));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="Return Vue.Map2Options(m, keyName, valueName)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._map2options /*anywheresoftware.b4a.objects.collections.List*/ (null,_m,_keyname,_valuename);
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="End Sub";
return null;
}
public String  _md5hash(b4j.example.bananovm __ref,String _value,String _key,boolean _raw) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "md5hash", true))
	 {return ((String) Debug.delegate(ba, "md5hash", new Object[] {_value,_key,_raw}));}
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Sub Md5Hash(value As String, key As String, raw As";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Return Vue.Md5Hash(value, key, raw)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._md5hash /*String*/ (null,_value,_key,_raw);
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="End Sub";
return "";
}
public String  _menu_click(b4j.example.bananovm __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "menu_click", true))
	 {return ((String) Debug.delegate(ba, "menu_click", new Object[] {_e}));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Sub menu_click(e As BANanoEvent)";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="Drawer.Toggle";
__ref._drawer /*b4j.example.vmdrawer*/ ._toggle /*String*/ (null);
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="NavBar.ToggleMenu";
__ref._navbar /*b4j.example.vmtoolbar*/ ._togglemenu /*String*/ (null);
RDebugUtils.currentLine=30277635;
 //BA.debugLineNum = 30277635;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _mergemaps(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "mergemaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "mergemaps", new Object[] {_oldm,_newm}));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Return Vue.MergeMaps(oldm, newm)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (null,_oldm,_newm);
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="End Sub";
return null;
}
public String  _mvfield(b4j.example.bananovm __ref,String _svalue,int _iposition,String _delimiter) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "mvfield", true))
	 {return ((String) Debug.delegate(ba, "mvfield", new Object[] {_svalue,_iposition,_delimiter}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Return Vue.MvField(sValue, iPosition, Delimiter)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._mvfield /*String*/ (null,_svalue,_iposition,_delimiter);
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="End Sub";
return "";
}
public String  _padright(b4j.example.bananovm __ref,String _value,int _maxlen,String _padchar) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "padright", true))
	 {return ((String) Debug.delegate(ba, "padright", new Object[] {_value,_maxlen,_padchar}));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Return Vue.PadRight(Value, MaxLen, PadChar)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._padright /*String*/ (null,_value,_maxlen,_padchar);
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="End Sub";
return "";
}
public String  _pagerefresh(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "pagerefresh", true))
	 {return ((String) Debug.delegate(ba, "pagerefresh", null));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Sub PageRefresh";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="If HasInfoBox Then SetInfoBox";
if (__ref._hasinfobox /*boolean*/ ) { 
__ref._setinfobox /*String*/ (null);};
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="If HasKnob Then SetKnob";
if (__ref._hasknob /*boolean*/ ) { 
__ref._setknob /*String*/ (null);};
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="End Sub";
return "";
}
public String  _setinfobox(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setinfobox", true))
	 {return ((String) Debug.delegate(ba, "setinfobox", null));}
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Sub SetInfoBox";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="JQuery.Selector(\".count-to\").RunMethod(\"countTo\",";
__ref._jquery /*com.ab.banano.BANanoObject*/ .Selector((Object)(".count-to")).RunMethod("countTo",__c.Null);
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="End Sub";
return "";
}
public String  _setknob(b4j.example.bananovm __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setknob", true))
	 {return ((String) Debug.delegate(ba, "setknob", null));}
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Sub SetKnob";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="BANano.RunJavascriptMethod(\"tron\", Null)";
__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("tron",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="End Sub";
return "";
}
public String  _prepare(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "prepare", true))
	 {return ((String) Debug.delegate(ba, "prepare", new Object[] {_keys}));}
String _k = "";
String _sk = "";
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Sub Prepare(keys As List)";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _keys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="Dim sk As String = GetState(k,\"\")";
_sk = BA.ObjectToString(__ref._getstate /*Object*/ (null,_k,(Object)("")));
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="sk = Date2YYYYMMDD(sk)";
_sk = __ref._date2yyyymmdd /*String*/ (null,(Object)(_sk));
RDebugUtils.currentLine=28246020;
 //BA.debugLineNum = 28246020;BA.debugLine="SetStateSingle(k, sk)";
__ref._setstatesingle /*b4j.example.bananovm*/ (null,(Object)(_k),(Object)(_sk));
 }
};
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _runmethod(b4j.example.bananovm __ref,String _methodname,Object _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "runmethod", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "runmethod", new Object[] {_methodname,_params}));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Sub RunMethod(methodName As String, params As Obje";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="Return Vue.RunMethod(methodName, params)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._runmethod /*com.ab.banano.BANanoObject*/ (null,_methodname,_params);
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setactivated(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setactivated", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setactivated", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Sub SetActivated(module As Object, methodName As S";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Vue.SetActivated(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setactivated /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbackgroundimage(b4j.example.bananovm __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setbackgroundimage", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setbackgroundimage", new Object[] {_url}));}
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Sub SetBackgroundImage(url As String) As BANanoVM";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="Content.SetBackgroundImage(url)";
__ref._content /*b4j.example.vmelement*/ ._setbackgroundimage /*b4j.example.vmelement*/ (null,_url);
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforecreate(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setbeforecreate", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setbeforecreate", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Sub SetBeforeCreate(module As Object, methodName A";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Vue.SetBeforeCreate(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setbeforecreate /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29556739;
 //BA.debugLineNum = 29556739;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforedestroy(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setbeforedestroy", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setbeforedestroy", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Sub SetBeforeDestroy(module As Object, methodName";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="Vue.SetBeforeDestroy(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setbeforedestroy /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforemount(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setbeforemount", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setbeforemount", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Sub SetBeforeMount(module As Object, methodName As";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="Vue.SetBeforeMount(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setbeforemount /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setbeforeupdate(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setbeforeupdate", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setbeforeupdate", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Sub SetBeforeUpdate(module As Object, methodName A";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Vue.SetBeforeUpdate(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setbeforeupdate /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcallback(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setcallback", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setcallback", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Sub SetCallBack(module As Object, methodName As St";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.bananovm)(this);};
RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=30212100;
 //BA.debugLineNum = 30212100;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="Vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=30212103;
 //BA.debugLineNum = 30212103;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcloak(b4j.example.bananovm __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setcloak", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setcloak", new Object[] {_b}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Sub SetCloak(b As Boolean) As BANanoVM";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Vue.SetCloak(b)";
__ref._vue /*b4j.example.bananovue*/ ._setcloak /*b4j.example.bananovue*/ (null,_b);
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcomputed(b4j.example.bananovm __ref,String _k,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setcomputed", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setcomputed", new Object[] {_k,_module,_methodname}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Sub SetComputed(k As String, module As Object, met";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="Vue.SetComputed(k, module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setcomputed /*b4j.example.bananovue*/ (null,_k,_module,_methodname);
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setcreated(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setcreated", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setcreated", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Sub SetCreated(module As Object, methodName As Str";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Vue.SetCreated(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setcreated /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdateformat(b4j.example.bananovm __ref,String _df) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setdateformat", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setdateformat", new Object[] {_df}));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Sub SetDateFormat(df As String) As BANanoVM";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="material.GetField(\"locale\").SetField(\"dateFormat\"";
__ref._material /*com.ab.banano.BANanoObject*/ .GetField("locale").SetField("dateFormat",(Object)(_df));
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdeactivated(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setdeactivated", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setdeactivated", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Sub SetDeActivated(module As Object, methodName As";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="Vue.SetDeActivated(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setdeactivated /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setdestroyed(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setdestroyed", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setdestroyed", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Sub SetDestroyed(module As Object, methodName As S";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Vue.SetDestroyed(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setdestroyed /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="End Sub";
return null;
}
public String  _setdisabledstate(b4j.example.bananovm __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setdisabledstate", true))
	 {return ((String) Debug.delegate(ba, "setdisabledstate", new Object[] {_k,_v}));}
String _diskey = "";
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="SetStateSingle(disKey, v)";
__ref._setstatesingle /*b4j.example.bananovm*/ (null,(Object)(_diskey),(Object)(_v));
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4j.example.bananovm __ref,String _elid,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_elid,_b}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub SetEnabled(elID As String, b As Boolean)";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="Vue.SetStateSingle($\"${elID}disabled\"$, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(_b));
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="End Sub";
return "";
}
public String  _seterrorstate(b4j.example.bananovm __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "seterrorstate", true))
	 {return ((String) Debug.delegate(ba, "seterrorstate", new Object[] {_k,_v}));}
String _showkey = "";
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Sub SetErrorState(k As String, v As Boolean)";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="Dim showKey As String = $\"${k}error\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"error");
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="SetStateSingle(showKey, v)";
__ref._setstatesingle /*b4j.example.bananovm*/ (null,(Object)(_showkey),(Object)(_v));
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="End Sub";
return "";
}
public String  _setfontfamily(b4j.example.bananovm __ref,Object _ff) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setfontfamily", true))
	 {return ((String) Debug.delegate(ba, "setfontfamily", new Object[] {_ff}));}
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="private Sub SetFontFamily(ff As Object)";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Vue.SetFontFamily(ff)";
__ref._vue /*b4j.example.bananovue*/ ._setfontfamily /*String*/ (null,_ff);
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="End Sub";
return "";
}
public String  _setgmapkey(b4j.example.bananovm __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setgmapkey", true))
	 {return ((String) Debug.delegate(ba, "setgmapkey", new Object[] {_key}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
anywheresoftware.b4a.objects.collections.Map _load = null;
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Sub SetGMapKey(key As String)";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="VueGoogleMaps.Initialize(\"VueGoogleMaps\")";
__ref._vuegooglemaps /*com.ab.banano.BANanoObject*/ .Initialize((Object)("VueGoogleMaps"));
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="Dim load As Map = CreateMap()";
_load = new anywheresoftware.b4a.objects.collections.Map();
_load = __c.createMap(new Object[] {});
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="load.Put(\"key\", key)";
_load.Put((Object)("key"),(Object)(_key));
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="load.Put(\"libraries\", \"places\")";
_load.Put((Object)("libraries"),(Object)("places"));
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="opt.Put(\"load\", load)";
_opt.Put((Object)("load"),(Object)(_load.getObject()));
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="opt.Put(\"installComponents\", True)";
_opt.Put((Object)("installComponents"),(Object)(__c.True));
RDebugUtils.currentLine=17104904;
 //BA.debugLineNum = 17104904;BA.debugLine="Vue.Use1(VueGoogleMaps, opt)";
__ref._vue /*b4j.example.bananovue*/ ._use1 /*String*/ (null,__ref._vuegooglemaps /*com.ab.banano.BANanoObject*/ ,_opt);
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setmounted(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setmounted", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setmounted", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Sub SetMounted(module As Object, methodName As Str";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="Vue.SetMounted(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setmounted /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setprogressbuffer(b4j.example.bananovm __ref,String _pid,int _bval) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setprogressbuffer", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setprogressbuffer", new Object[] {_pid,_bval}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub SetProgressBuffer(pID As String, bVal As Int)";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="pID = pID.ToLowerCase";
_pid = _pid.toLowerCase();
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="SetStateSingle($\"${pID}buffer\"$, bVal)";
__ref._setstatesingle /*b4j.example.bananovm*/ (null,(Object)((""+__c.SmartStringFormatter("",(Object)(_pid))+"buffer")),(Object)(_bval));
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setprogressvalue(b4j.example.bananovm __ref,String _pid,int _pval) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setprogressvalue", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setprogressvalue", new Object[] {_pid,_pval}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub SetProgressValue(pID As String, pVal As Int) A";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="pID = pID.ToLowerCase";
_pid = _pid.toLowerCase();
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="SetStateSingle($\"${pID}value\"$, pVal)";
__ref._setstatesingle /*b4j.example.bananovm*/ (null,(Object)((""+__c.SmartStringFormatter("",(Object)(_pid))+"value")),(Object)(_pval));
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="End Sub";
return null;
}
public String  _setprompt(b4j.example.bananovm __ref,Object _pvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setprompt", true))
	 {return ((String) Debug.delegate(ba, "setprompt", new Object[] {_pvalue}));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Sub SetPrompt(pvalue As Object)";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="Vue.SetStateSingle(\"promptvalue\",pvalue)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"promptvalue",_pvalue);
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="End Sub";
return "";
}
public String  _setrequired(b4j.example.bananovm __ref,String _elid,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((String) Debug.delegate(ba, "setrequired", new Object[] {_elid,_b}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Sub SetRequired(elID As String, b As Boolean)";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Vue.SetStateSingle($\"${elID}required\"$, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"required"),(Object)(_b));
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="End Sub";
return "";
}
public String  _setrequiredstate(b4j.example.bananovm __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setrequiredstate", true))
	 {return ((String) Debug.delegate(ba, "setrequiredstate", new Object[] {_k,_v}));}
String _diskey = "";
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Sub SetRequiredState(k As String, v As Boolean)";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="SetStateSingle(disKey, v)";
__ref._setstatesingle /*b4j.example.bananovm*/ (null,(Object)(_diskey),(Object)(_v));
RDebugUtils.currentLine=27787267;
 //BA.debugLineNum = 27787267;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setscrollbar(b4j.example.bananovm __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setscrollbar", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setscrollbar", new Object[] {_b}));}
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Sub SetScrollBar(b As Boolean) As BANanoVM";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="App.SetAttr(CreateMap(\":md-scrollbar\":b))";
__ref._app /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-scrollbar"),(Object)(_b)}));
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="End Sub";
return null;
}
public String  _setshowstate(b4j.example.bananovm __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setshowstate", true))
	 {return ((String) Debug.delegate(ba, "setshowstate", new Object[] {_k,_v}));}
String _showkey = "";
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="SetStateSingle(showKey, v)";
__ref._setstatesingle /*b4j.example.bananovm*/ (null,(Object)(_showkey),(Object)(_v));
RDebugUtils.currentLine=27656195;
 //BA.debugLineNum = 27656195;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _setstatedecrement(b4j.example.bananovm __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstatedecrement", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstatedecrement", new Object[] {_k}));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Sub SetStateDecrement(k As String) As BANanoVM";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="Vue.SetStateDecrement(k)";
__ref._vue /*b4j.example.bananovue*/ ._setstatedecrement /*b4j.example.bananovue*/ (null,_k);
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstateincrement(b4j.example.bananovm __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstateincrement", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstateincrement", new Object[] {_k}));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Sub SetStateIncrement(k As String) As BANanoVM";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="Vue.SetStateIncrement(k)";
__ref._vue /*b4j.example.bananovue*/ ._setstateincrement /*b4j.example.bananovue*/ (null,_k);
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=25165827;
 //BA.debugLineNum = 25165827;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatelist(b4j.example.bananovm __ref,String _mapkey,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstatelist", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstatelist", new Object[] {_mapkey,_mapvalues}));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Vue.SetStateList(mapKey, mapValues)";
__ref._vue /*b4j.example.bananovue*/ ._setstatelist /*b4j.example.bananovue*/ (null,_mapkey,_mapvalues);
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatelistvalues(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstatelistvalues", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstatelistvalues", new Object[] {_mapvalues}));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Sub SetStateListValues(mapValues As List) As BANan";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="Vue.SetStateListValues(mapValues)";
__ref._vue /*b4j.example.bananovue*/ ._setstatelistvalues /*b4j.example.bananovue*/ (null,_mapvalues);
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatemap(b4j.example.bananovm __ref,String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstatemap", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstatemap", new Object[] {_mapkey,_mapvalues}));}
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="Vue.SetStateMap(mapKey, mapValues)";
__ref._vue /*b4j.example.bananovue*/ ._setstatemap /*b4j.example.bananovue*/ (null,_mapkey,_mapvalues);
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstatetrue(b4j.example.bananovm __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstatetrue", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstatetrue", new Object[] {_k}));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Sub SetStateTrue(k As String) As BANanoVM";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="Vue.SetStateTrue(k)";
__ref._vue /*b4j.example.bananovue*/ ._setstatetrue /*b4j.example.bananovue*/ (null,_k);
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setstyle(b4j.example.bananovm __ref,String _classname,String _prop,String _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setstyle", new Object[] {_classname,_prop,_val}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Sub SetStyle(className As String, prop As String,";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Vue.SetStyle(className, prop, val)";
__ref._vue /*b4j.example.bananovue*/ ._setstyle /*b4j.example.bananovue*/ (null,_classname,_prop,_val);
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setupdated(b4j.example.bananovm __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setupdated", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setupdated", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Sub SetUpdated(module As Object, methodName As Str";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="Vue.SetUpdated(module, methodName)";
__ref._vue /*b4j.example.bananovue*/ ._setupdated /*b4j.example.bananovue*/ (null,_module,_methodname);
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=29294595;
 //BA.debugLineNum = 29294595;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _setwatch(b4j.example.bananovm __ref,String _k,boolean _bimmediate,boolean _bdeep,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "setwatch", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "setwatch", new Object[] {_k,_bimmediate,_bdeep,_module,_methodname}));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="Vue.SetWatch(k, bImmediate, bDeep, module, method";
__ref._vue /*b4j.example.bananovue*/ ._setwatch /*b4j.example.bananovue*/ (null,_k,_bimmediate,_bdeep,_module,_methodname);
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="End Sub";
return null;
}
public String  _showalert(b4j.example.bananovm __ref,String _process,String _title,String _message,String _confirmtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showalert", true))
	 {return ((String) Debug.delegate(ba, "showalert", new Object[] {_process,_title,_message,_confirmtext}));}
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Sub ShowAlert(process As String, Title As String,";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="Vue.SetState(CreateMap(\"alertkey\":process, \"alert";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("alertkey"),(Object)(_process),(Object)("alerttitle"),(Object)(_title),(Object)("alertmessage"),(Object)(_message),(Object)("confirmtext"),(Object)(_confirmtext)}));
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="Alert.Show";
__ref._alert /*b4j.example.vmalert*/ ._show /*String*/ (null);
RDebugUtils.currentLine=30474243;
 //BA.debugLineNum = 30474243;BA.debugLine="End Sub";
return "";
}
public String  _showerror(b4j.example.bananovm __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showerror", true))
	 {return ((String) Debug.delegate(ba, "showerror", new Object[] {_elid}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Sub ShowError(elID As String)";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Vue.SetStateSingle($\"${elID}error\"$, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.True));
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="End Sub";
return "";
}
public String  _showitems(b4j.example.bananovm __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showitems", true))
	 {return ((String) Debug.delegate(ba, "showitems", new Object[] {_items}));}
String _item = "";
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Sub ShowItems(items As List)";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="Vue.SetStateSingle(item, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_item,(Object)(__c.True));
 }
};
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="End Sub";
return "";
}
public String  _showprompt(b4j.example.bananovm __ref,String _title,String _message,String _placeholder,int _maxlen,String _confirmtext,String _canceltext) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showprompt", true))
	 {return ((String) Debug.delegate(ba, "showprompt", new Object[] {_title,_message,_placeholder,_maxlen,_confirmtext,_canceltext}));}
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Sub ShowPrompt(Title As String, Message As String,";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="Vue.SetStateSingle(\"promptvalue\",Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,"promptvalue",__c.Null);
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="Vue.SetState(CreateMap(\"promptplaceholder\":Placeh";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__c.createMap(new Object[] {(Object)("promptplaceholder"),(Object)(_placeholder),(Object)("prompttitle"),(Object)(_title),(Object)("promptcontent"),(Object)(_message),(Object)("promptconfirmtext"),(Object)(_confirmtext),(Object)("promptcanceltext"),(Object)(_canceltext),(Object)("promptmaxlength"),(Object)(_maxlen)}));
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="Prompt.Show";
__ref._prompt /*b4j.example.vmprompt*/ ._show /*String*/ (null);
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="End Sub";
return "";
}
public String  _showprompt1(b4j.example.bananovm __ref,String _pname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "showprompt1", true))
	 {return ((String) Debug.delegate(ba, "showprompt1", new Object[] {_pname}));}
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Sub ShowPrompt1(pName As String)";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="SetPrompt(Null)";
__ref._setprompt /*String*/ (null,__c.Null);
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="ShowDialog(pName)";
__ref._showdialog /*String*/ (null,_pname);
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="End Sub";
return "";
}
public String  _state2another(b4j.example.bananovm __ref,String _source,String _target,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "state2another", true))
	 {return ((String) Debug.delegate(ba, "state2another", new Object[] {_source,_target,_defaultvalue}));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Sub State2Another(source As String, target As Stri";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Vue.State2Another(source, target, defaultValue)";
__ref._vue /*b4j.example.bananovue*/ ._state2another /*String*/ (null,_source,_target,_defaultvalue);
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return "";
}
public boolean  _stateexists(b4j.example.bananovm __ref,String _statename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "stateexists", true))
	 {return ((Boolean) Debug.delegate(ba, "stateexists", new Object[] {_statename}));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="Return Vue.StateExists(stateName)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._stateexists /*boolean*/ (null,_statename);
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _strparse(b4j.example.bananovm __ref,String _delim,String _inputstring) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "strparse", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "strparse", new Object[] {_delim,_inputstring}));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Sub StrParse(Delim As String, InputString As Strin";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="Return Vue.StrParse(Delim, InputString)";
if (true) return __ref._vue /*b4j.example.bananovue*/ ._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,_delim,_inputstring);
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _togglenamedstate(b4j.example.bananovm __ref,String _statename,String _state1,String _state2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "togglenamedstate", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "togglenamedstate", new Object[] {_statename,_state1,_state2}));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Sub ToggleNamedState(stateName As String, state1 A";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Vue.ToggleNamedState(stateName, state1, state2)";
__ref._vue /*b4j.example.bananovue*/ ._togglenamedstate /*b4j.example.bananovue*/ (null,_statename,_state1,_state2);
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=28573699;
 //BA.debugLineNum = 28573699;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _togglestate(b4j.example.bananovm __ref,String _statename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "togglestate", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "togglestate", new Object[] {_statename}));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Sub ToggleState(stateName As String) As BANanoVM";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="Vue.ToggleState(stateName)";
__ref._vue /*b4j.example.bananovue*/ ._togglestate /*b4j.example.bananovue*/ (null,_statename);
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="End Sub";
return null;
}
public String  _toyyyymmdd(b4j.example.bananovm __ref,String _vmodel) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "toyyyymmdd", true))
	 {return ((String) Debug.delegate(ba, "toyyyymmdd", new Object[] {_vmodel}));}
String _sk = "";
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Sub ToYYYYMMDD(vmodel As String)";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="Dim sk As String = GetState(vmodel,\"\")";
_sk = BA.ObjectToString(__ref._getstate /*Object*/ (null,_vmodel,(Object)("")));
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="sk = Date2YYYYMMDD(sk)";
_sk = __ref._date2yyyymmdd /*String*/ (null,(Object)(_sk));
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="SetStateSingle(vmodel, sk)";
__ref._setstatesingle /*b4j.example.bananovm*/ (null,(Object)(_vmodel),(Object)(_sk));
RDebugUtils.currentLine=28311556;
 //BA.debugLineNum = 28311556;BA.debugLine="End Sub";
return "";
}
public String  _updatebackgroundimage(b4j.example.bananovm __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "updatebackgroundimage", true))
	 {return ((String) Debug.delegate(ba, "updatebackgroundimage", new Object[] {_url}));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Sub UpdateBackgroundImage(url As String)";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="BANano.GetElement(\"#content\").SetStyle(BANano.ToJ";
__ref._banano /*com.ab.banano.BANano*/ .GetElement("#content").SetStyle(BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(__c.createMap(new Object[] {(Object)("background-image"),(Object)(("url('"+__c.SmartStringFormatter("",(Object)(_url))+"')")),(Object)("background-size"),(Object)("100% 100%")}).getObject()))));
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovm  _updatebadge(b4j.example.bananovm __ref,String _elid,String _counted) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "updatebadge", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "updatebadge", new Object[] {_elid,_counted}));}
String _badvalue = "";
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub UpdateBadge(elID As String, counted As String)";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="Dim badValue As String = $\"${elID}value\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"value");
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="Vue.SetStateSingle(badValue, counted)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_badvalue,(Object)(_counted));
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovm  _updateitembadge(b4j.example.bananovm __ref,String _elid,String _counted) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "updateitembadge", true))
	 {return ((b4j.example.bananovm) Debug.delegate(ba, "updateitembadge", new Object[] {_elid,_counted}));}
String _badvalue = "";
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub UpdateItemBadge(elID As String, counted As Str";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="Dim badValue As String = $\"${elID}badgevalue\"$";
_badvalue = (""+__c.SmartStringFormatter("",(Object)(_elid))+"badgevalue");
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="Vue.SetStateSingle(badValue, counted)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_badvalue,(Object)(_counted));
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovm)(this);
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="End Sub";
return null;
}
public String  _use(b4j.example.bananovm __ref,com.ab.banano.BANanoObject _bo) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "use", true))
	 {return ((String) Debug.delegate(ba, "use", new Object[] {_bo}));}
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Sub Use(bo As BANanoObject)";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="Vue.Use(bo)";
__ref._vue /*b4j.example.bananovue*/ ._use /*String*/ (null,_bo);
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="End Sub";
return "";
}
public String  _usetheme(b4j.example.bananovm __ref,b4j.example.vmelement _ve,String _themename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovm";
if (Debug.shouldDelegate(ba, "usetheme", true))
	 {return ((String) Debug.delegate(ba, "usetheme", new Object[] {_ve,_themename}));}
anywheresoftware.b4a.objects.collections.Map _theme = null;
String _fc = "";
String _bc = "";
anywheresoftware.b4a.objects.collections.Map _color = null;
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Sub UseTheme(ve As VMElement, themeName As String)";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="If Themes.ContainsKey(themeName) Then";
if (__ref._themes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_themename))) { 
RDebugUtils.currentLine=30408707;
 //BA.debugLineNum = 30408707;BA.debugLine="Dim theme As Map = Themes.Get(themeName)";
_theme = new anywheresoftware.b4a.objects.collections.Map();
_theme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._themes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_themename))));
RDebugUtils.currentLine=30408708;
 //BA.debugLineNum = 30408708;BA.debugLine="Dim fc As String = theme.Get(themeName)";
_fc = BA.ObjectToString(_theme.Get((Object)(_themename)));
RDebugUtils.currentLine=30408709;
 //BA.debugLineNum = 30408709;BA.debugLine="Dim bc As String = theme.Get(themeName)";
_bc = BA.ObjectToString(_theme.Get((Object)(_themename)));
RDebugUtils.currentLine=30408711;
 //BA.debugLineNum = 30408711;BA.debugLine="Dim color As Map = CreateMap()";
_color = new anywheresoftware.b4a.objects.collections.Map();
_color = __c.createMap(new Object[] {});
RDebugUtils.currentLine=30408712;
 //BA.debugLineNum = 30408712;BA.debugLine="color.Put(\"color\", fc)";
_color.Put((Object)("color"),(Object)(_fc));
RDebugUtils.currentLine=30408713;
 //BA.debugLineNum = 30408713;BA.debugLine="color.Put(\"background-color\", bc)";
_color.Put((Object)("background-color"),(Object)(_bc));
RDebugUtils.currentLine=30408714;
 //BA.debugLineNum = 30408714;BA.debugLine="ve.SetStyle(color)";
_ve._setstyle /*b4j.example.vmelement*/ (null,_color);
 };
RDebugUtils.currentLine=30408716;
 //BA.debugLineNum = 30408716;BA.debugLine="End Sub";
return "";
}
}