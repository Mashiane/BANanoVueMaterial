package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtree extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtree", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtree.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _tree = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public Object _eventhandler = null;
public String _expandicon = "";
public String _collapseicon = "";
public com.ab.banano.BANanoObject _treebo = null;
public String _iconslibrary = "";
public String _imageurlfield = "";
public String _imagehtmlfield = "";
public com.ab.banano.BANanoObject _jq = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmtree  _initialize(b4j.example.vmtree __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,Object _module,String _sid,String _prikey) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_module,_sid,_prikey}));}
RDebugUtils.currentLine=225902592;
 //BA.debugLineNum = 225902592;BA.debugLine="Public Sub Initialize(v As BANanoVue, module As Ob";
RDebugUtils.currentLine=225902593;
 //BA.debugLineNum = 225902593;BA.debugLine="BANano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jquery-3.4.1.min.js");
RDebugUtils.currentLine=225902594;
 //BA.debugLineNum = 225902594;BA.debugLine="BANano.DependsOnAsset(\"gijgo.min.css\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("gijgo.min.css");
RDebugUtils.currentLine=225902595;
 //BA.debugLineNum = 225902595;BA.debugLine="BANano.DependsOnAsset(\"gijgo.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("gijgo.min.js");
RDebugUtils.currentLine=225902596;
 //BA.debugLineNum = 225902596;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=225902597;
 //BA.debugLineNum = 225902597;BA.debugLine="Tree.Initialize(v, ID)";
__ref._tree /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=225902598;
 //BA.debugLineNum = 225902598;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=225902599;
 //BA.debugLineNum = 225902599;BA.debugLine="JQ = vue.jquery";
__ref._jq /*com.ab.banano.BANanoObject*/  = __ref._vue /*b4j.example.bananovue*/ ._jquery /*com.ab.banano.BANanoObject*/ ;
RDebugUtils.currentLine=225902600;
 //BA.debugLineNum = 225902600;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=225902601;
 //BA.debugLineNum = 225902601;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=225902602;
 //BA.debugLineNum = 225902602;BA.debugLine="SetUiLibrary(\"materialdesign\")";
__ref._setuilibrary /*b4j.example.vmtree*/ (null,"materialdesign");
RDebugUtils.currentLine=225902603;
 //BA.debugLineNum = 225902603;BA.debugLine="SetIconsLibrary(\"materialicons\")";
__ref._seticonslibrary /*b4j.example.vmtree*/ (null,"materialicons");
RDebugUtils.currentLine=225902604;
 //BA.debugLineNum = 225902604;BA.debugLine="SetLazyLoading(True)";
__ref._setlazyloading /*b4j.example.vmtree*/ (null,__c.True);
RDebugUtils.currentLine=225902605;
 //BA.debugLineNum = 225902605;BA.debugLine="SetSelectionType(\"single\")";
__ref._setselectiontype /*b4j.example.vmtree*/ (null,"single");
RDebugUtils.currentLine=225902606;
 //BA.debugLineNum = 225902606;BA.debugLine="SetCheckedField(\"checked\")";
__ref._setcheckedfield /*b4j.example.vmtree*/ (null,"checked");
RDebugUtils.currentLine=225902607;
 //BA.debugLineNum = 225902607;BA.debugLine="SetChildrenField(\"children\")";
__ref._setchildrenfield /*b4j.example.vmtree*/ (null,"children");
RDebugUtils.currentLine=225902608;
 //BA.debugLineNum = 225902608;BA.debugLine="SetDisabledField(\"disabled\")";
__ref._setdisabledfield /*b4j.example.vmtree*/ (null,"disabled");
RDebugUtils.currentLine=225902609;
 //BA.debugLineNum = 225902609;BA.debugLine="SetHasChildrenField(\"hasChildren\")";
__ref._sethaschildrenfield /*b4j.example.vmtree*/ (null,"hasChildren");
RDebugUtils.currentLine=225902610;
 //BA.debugLineNum = 225902610;BA.debugLine="SetImageCssClassField(\"imageCssClass\")";
__ref._setimagecssclassfield /*b4j.example.vmtree*/ (null,"imageCssClass");
RDebugUtils.currentLine=225902611;
 //BA.debugLineNum = 225902611;BA.debugLine="SetImageHtmlField(\"imageHtml\")";
__ref._setimagehtmlfield /*b4j.example.vmtree*/ (null,"imageHtml");
RDebugUtils.currentLine=225902612;
 //BA.debugLineNum = 225902612;BA.debugLine="SetImageUrlField(\"imageUrl\")";
__ref._setimageurlfield /*b4j.example.vmtree*/ (null,"imageUrl");
RDebugUtils.currentLine=225902613;
 //BA.debugLineNum = 225902613;BA.debugLine="SetTextField(\"text\")";
__ref._settextfield /*b4j.example.vmtree*/ (null,"text");
RDebugUtils.currentLine=225902614;
 //BA.debugLineNum = 225902614;BA.debugLine="SetPrimaryKey(priKey)";
__ref._setprimarykey /*b4j.example.vmtree*/ (null,_prikey);
RDebugUtils.currentLine=225902615;
 //BA.debugLineNum = 225902615;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=225902616;
 //BA.debugLineNum = 225902616;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _addclass(b4j.example.vmtree __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=227737600;
 //BA.debugLineNum = 227737600;BA.debugLine="Sub AddClass(c As String) As VMTree";
RDebugUtils.currentLine=227737601;
 //BA.debugLineNum = 227737601;BA.debugLine="Tree.AddClass(c)";
__ref._tree /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=227737602;
 //BA.debugLineNum = 227737602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227737603;
 //BA.debugLineNum = 227737603;BA.debugLine="End Sub";
return null;
}
public String  _addnode(b4j.example.vmtree __ref,String _parentid,String _pk,String _text,String _imgurl,String _icon,anywheresoftware.b4a.objects.collections.Map _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "addnode", true))
	 {return ((String) Debug.delegate(ba, "addnode", new Object[] {_parentid,_pk,_text,_imgurl,_icon,_tag}));}
anywheresoftware.b4a.objects.collections.Map _nod = null;
String _sicon = "";
String _strkey = "";
Object _strval = null;
com.ab.banano.BANanoObject _prnt = null;
RDebugUtils.currentLine=228130816;
 //BA.debugLineNum = 228130816;BA.debugLine="Sub AddNode(parentID As String, pk As String, Text";
RDebugUtils.currentLine=228130817;
 //BA.debugLineNum = 228130817;BA.debugLine="If treeBO = Null Then Refresh";
if (__ref._treebo /*com.ab.banano.BANanoObject*/ == null) { 
__ref._refresh /*String*/ (null);};
RDebugUtils.currentLine=228130819;
 //BA.debugLineNum = 228130819;BA.debugLine="Dim nod As Map = CreateMap(\"id\":pk,\"text\":Text)";
_nod = new anywheresoftware.b4a.objects.collections.Map();
_nod = __c.createMap(new Object[] {(Object)("id"),(Object)(_pk),(Object)("text"),(Object)(_text)});
RDebugUtils.currentLine=228130821;
 //BA.debugLineNum = 228130821;BA.debugLine="If ImgURL <> \"\" Then";
if ((_imgurl).equals("") == false) { 
RDebugUtils.currentLine=228130822;
 //BA.debugLineNum = 228130822;BA.debugLine="nod.Put(ImageUrlField, ImgURL)";
_nod.Put((Object)(__ref._imageurlfield /*String*/ ),(Object)(_imgurl));
 };
RDebugUtils.currentLine=228130825;
 //BA.debugLineNum = 228130825;BA.debugLine="If Icon <> \"\" Then";
if ((_icon).equals("") == false) { 
RDebugUtils.currentLine=228130826;
 //BA.debugLineNum = 228130826;BA.debugLine="Dim sIcon As String = \"\"";
_sicon = "";
RDebugUtils.currentLine=228130827;
 //BA.debugLineNum = 228130827;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=228130829;
 //BA.debugLineNum = 228130829;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
_sicon = ("<i class=\"material-icons\">"+__c.SmartStringFormatter("",(Object)(_icon))+"</i>");
 break; }
case 1: {
RDebugUtils.currentLine=228130831;
 //BA.debugLineNum = 228130831;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
_sicon = ("<i class=\""+__c.SmartStringFormatter("",(Object)(_icon))+"\"></i>");
 break; }
}
;
RDebugUtils.currentLine=228130833;
 //BA.debugLineNum = 228130833;BA.debugLine="nod.Put(ImageHtmlField, sIcon)";
_nod.Put((Object)(__ref._imagehtmlfield /*String*/ ),(Object)(_sicon));
 };
RDebugUtils.currentLine=228130836;
 //BA.debugLineNum = 228130836;BA.debugLine="If Tag <> Null Then";
if (_tag!= null) { 
RDebugUtils.currentLine=228130837;
 //BA.debugLineNum = 228130837;BA.debugLine="For Each strKey As String In Tag.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _tag.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_strkey = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=228130838;
 //BA.debugLineNum = 228130838;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
_strval = _tag.Get((Object)(_strkey));
RDebugUtils.currentLine=228130839;
 //BA.debugLineNum = 228130839;BA.debugLine="nod.Put(strKey,strVal)";
_nod.Put((Object)(_strkey),_strval);
 }
};
 };
RDebugUtils.currentLine=228130842;
 //BA.debugLineNum = 228130842;BA.debugLine="If parentID = \"\" Then";
if ((_parentid).equals("")) { 
RDebugUtils.currentLine=228130843;
 //BA.debugLineNum = 228130843;BA.debugLine="treeBO.RunMethod(\"addNode\",Array(nod))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("addNode",(Object)(new Object[]{(Object)(_nod.getObject())}));
 }else {
RDebugUtils.currentLine=228130845;
 //BA.debugLineNum = 228130845;BA.debugLine="Dim prnt As BANanoObject = GetNodeById(parentID)";
_prnt = new com.ab.banano.BANanoObject();
_prnt = __ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_parentid);
RDebugUtils.currentLine=228130846;
 //BA.debugLineNum = 228130846;BA.debugLine="If prnt <> Null Then";
if (_prnt!= null) { 
RDebugUtils.currentLine=228130847;
 //BA.debugLineNum = 228130847;BA.debugLine="treeBO.RunMethod(\"addNode\",Array(nod,prnt))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("addNode",(Object)(new Object[]{(Object)(_nod.getObject()),(Object)(_prnt.getObject())}));
 };
 };
RDebugUtils.currentLine=228130850;
 //BA.debugLineNum = 228130850;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
anywheresoftware.b4a.objects.collections.Map _e = null;
anywheresoftware.b4a.objects.collections.Map _node = null;
anywheresoftware.b4a.objects.collections.Map _record = null;
anywheresoftware.b4a.objects.collections.Map _sid = null;
anywheresoftware.b4a.objects.collections.Map _state = null;
RDebugUtils.currentLine=228065280;
 //BA.debugLineNum = 228065280;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=228065281;
 //BA.debugLineNum = 228065281;BA.debugLine="If treeBO <> Null Then Destroy";
if (__ref._treebo /*com.ab.banano.BANanoObject*/ != null) { 
__ref._destroy /*String*/ (null);};
RDebugUtils.currentLine=228065283;
 //BA.debugLineNum = 228065283;BA.debugLine="treeBO = JQ.Selector($\"#${ID}\"$).RunMethod(\"tree\"";
__ref._treebo /*com.ab.banano.BANanoObject*/  = __ref._jq /*com.ab.banano.BANanoObject*/ .Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+""))).RunMethod("tree",(Object)(new Object[]{(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())}));
RDebugUtils.currentLine=228065285;
 //BA.debugLineNum = 228065285;BA.debugLine="Dim e, node, record, sID, state As Map  'ignore";
_e = new anywheresoftware.b4a.objects.collections.Map();
_node = new anywheresoftware.b4a.objects.collections.Map();
_record = new anywheresoftware.b4a.objects.collections.Map();
_sid = new anywheresoftware.b4a.objects.collections.Map();
_state = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=228065288;
 //BA.debugLineNum = 228065288;BA.debugLine="treeBO.RunMethod(\"bind\", Array(\"select\", BANano.C";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("bind",(Object)(new Object[]{(Object)("select"),__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._eventhandler /*Object*/ ,__ref._id /*String*/ +"_select",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e.getObject()),(Object)(_node.getObject()),(Object)(_sid.getObject())}))}));
RDebugUtils.currentLine=228065292;
 //BA.debugLineNum = 228065292;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getnodebyid(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getnodebyid", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "getnodebyid", new Object[] {_pk}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=228261888;
 //BA.debugLineNum = 228261888;BA.debugLine="Sub GetNodeById(pk As String) As BANanoObject";
RDebugUtils.currentLine=228261889;
 //BA.debugLineNum = 228261889;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getNod";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("getNodeById",(Object)(new Object[]{(Object)(_pk)}));
RDebugUtils.currentLine=228261890;
 //BA.debugLineNum = 228261890;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=228261891;
 //BA.debugLineNum = 228261891;BA.debugLine="End Sub";
return null;
}
public String  _check(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "check", true))
	 {return ((String) Debug.delegate(ba, "check", new Object[] {_pk}));}
RDebugUtils.currentLine=229113856;
 //BA.debugLineNum = 229113856;BA.debugLine="Sub Check(pk As String)";
RDebugUtils.currentLine=229113857;
 //BA.debugLineNum = 229113857;BA.debugLine="treeBO.RunMethod(\"check\", Array(GetNodeById(pk)))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("check",(Object)(new Object[]{(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject())}));
RDebugUtils.currentLine=229113858;
 //BA.debugLineNum = 229113858;BA.debugLine="End Sub";
return "";
}
public String  _checkall(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "checkall", true))
	 {return ((String) Debug.delegate(ba, "checkall", null));}
RDebugUtils.currentLine=229638144;
 //BA.debugLineNum = 229638144;BA.debugLine="Sub CheckAll()";
RDebugUtils.currentLine=229638145;
 //BA.debugLineNum = 229638145;BA.debugLine="treeBO.RunMethod(\"checkAll\", \"\")";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("checkAll",(Object)(""));
RDebugUtils.currentLine=229638146;
 //BA.debugLineNum = 229638146;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
RDebugUtils.currentLine=225837056;
 //BA.debugLineNum = 225837056;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=225837057;
 //BA.debugLineNum = 225837057;BA.debugLine="Public Tree As VMElement";
_tree = new b4j.example.vmelement();
RDebugUtils.currentLine=225837058;
 //BA.debugLineNum = 225837058;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=225837059;
 //BA.debugLineNum = 225837059;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=225837060;
 //BA.debugLineNum = 225837060;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=225837061;
 //BA.debugLineNum = 225837061;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=225837062;
 //BA.debugLineNum = 225837062;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
RDebugUtils.currentLine=225837063;
 //BA.debugLineNum = 225837063;BA.debugLine="Private ExpandIcon As String";
_expandicon = "";
RDebugUtils.currentLine=225837064;
 //BA.debugLineNum = 225837064;BA.debugLine="Private CollapseIcon As String";
_collapseicon = "";
RDebugUtils.currentLine=225837065;
 //BA.debugLineNum = 225837065;BA.debugLine="Private treeBO As BANanoObject";
_treebo = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=225837066;
 //BA.debugLineNum = 225837066;BA.debugLine="Private IconsLibrary As String";
_iconslibrary = "";
RDebugUtils.currentLine=225837067;
 //BA.debugLineNum = 225837067;BA.debugLine="Private ImageUrlField As String";
_imageurlfield = "";
RDebugUtils.currentLine=225837068;
 //BA.debugLineNum = 225837068;BA.debugLine="Private ImageHtmlField As String";
_imagehtmlfield = "";
RDebugUtils.currentLine=225837069;
 //BA.debugLineNum = 225837069;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=225837070;
 //BA.debugLineNum = 225837070;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=229441536;
 //BA.debugLineNum = 229441536;BA.debugLine="Sub Clear";
RDebugUtils.currentLine=229441537;
 //BA.debugLineNum = 229441537;BA.debugLine="SetDataSource(Array())";
__ref._setdatasource /*b4j.example.vmtree*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
RDebugUtils.currentLine=229441538;
 //BA.debugLineNum = 229441538;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=229441539;
 //BA.debugLineNum = 229441539;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _setdatasource(b4j.example.vmtree __ref,anywheresoftware.b4a.objects.collections.List _datasource) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setdatasource", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setdatasource", new Object[] {_datasource}));}
RDebugUtils.currentLine=226623488;
 //BA.debugLineNum = 226623488;BA.debugLine="Sub SetDataSource(dataSource As List) As VMTree";
RDebugUtils.currentLine=226623489;
 //BA.debugLineNum = 226623489;BA.debugLine="options.Put(\"dataSource\", dataSource)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("dataSource"),(Object)(_datasource.getObject()));
RDebugUtils.currentLine=226623490;
 //BA.debugLineNum = 226623490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226623491;
 //BA.debugLineNum = 226623491;BA.debugLine="End Sub";
return null;
}
public String  _collapse(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "collapse", true))
	 {return ((String) Debug.delegate(ba, "collapse", new Object[] {_pk}));}
RDebugUtils.currentLine=229834752;
 //BA.debugLineNum = 229834752;BA.debugLine="Sub Collapse(pk As String)";
RDebugUtils.currentLine=229834753;
 //BA.debugLineNum = 229834753;BA.debugLine="treeBO.RunMethod(\"collapse\", Array(GetNodeById(pk";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("collapse",(Object)(new Object[]{(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject())}));
RDebugUtils.currentLine=229834754;
 //BA.debugLineNum = 229834754;BA.debugLine="End Sub";
return "";
}
public String  _collapseall(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "collapseall", true))
	 {return ((String) Debug.delegate(ba, "collapseall", null));}
RDebugUtils.currentLine=229572608;
 //BA.debugLineNum = 229572608;BA.debugLine="Sub CollapseAll()";
RDebugUtils.currentLine=229572609;
 //BA.debugLineNum = 229572609;BA.debugLine="treeBO.RunMethod(\"collapseAll\", \"\")";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("collapseAll",(Object)(""));
RDebugUtils.currentLine=229572610;
 //BA.debugLineNum = 229572610;BA.debugLine="End Sub";
return "";
}
public String  _destroy(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "destroy", true))
	 {return ((String) Debug.delegate(ba, "destroy", null));}
RDebugUtils.currentLine=227999744;
 //BA.debugLineNum = 227999744;BA.debugLine="Sub Destroy";
RDebugUtils.currentLine=227999745;
 //BA.debugLineNum = 227999745;BA.debugLine="treeBO.runmethod(\"destroy\",Null)";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("destroy",__c.Null);
RDebugUtils.currentLine=227999746;
 //BA.debugLineNum = 227999746;BA.debugLine="End Sub";
return "";
}
public String  _disable(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "disable", true))
	 {return ((String) Debug.delegate(ba, "disable", new Object[] {_pk}));}
RDebugUtils.currentLine=229965824;
 //BA.debugLineNum = 229965824;BA.debugLine="Sub Disable(pk As String)";
RDebugUtils.currentLine=229965825;
 //BA.debugLineNum = 229965825;BA.debugLine="treeBO.RunMethod(\"disable\", Array(GetNodeById(pk)";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("disable",(Object)(new Object[]{(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject())}));
RDebugUtils.currentLine=229965826;
 //BA.debugLineNum = 229965826;BA.debugLine="End Sub";
return "";
}
public String  _enable(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "enable", true))
	 {return ((String) Debug.delegate(ba, "enable", new Object[] {_pk}));}
RDebugUtils.currentLine=229900288;
 //BA.debugLineNum = 229900288;BA.debugLine="Sub Enable(pk As String)";
RDebugUtils.currentLine=229900289;
 //BA.debugLineNum = 229900289;BA.debugLine="treeBO.RunMethod(\"enable\", Array(GetNodeById(pk))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("enable",(Object)(new Object[]{(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject())}));
RDebugUtils.currentLine=229900290;
 //BA.debugLineNum = 229900290;BA.debugLine="End Sub";
return "";
}
public String  _expand(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "expand", true))
	 {return ((String) Debug.delegate(ba, "expand", new Object[] {_pk}));}
RDebugUtils.currentLine=229769216;
 //BA.debugLineNum = 229769216;BA.debugLine="Sub Expand(pk As String)";
RDebugUtils.currentLine=229769217;
 //BA.debugLineNum = 229769217;BA.debugLine="treeBO.RunMethod(\"expand\", Array(GetNodeById(pk))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("expand",(Object)(new Object[]{(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject())}));
RDebugUtils.currentLine=229769218;
 //BA.debugLineNum = 229769218;BA.debugLine="End Sub";
return "";
}
public String  _expandall(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "expandall", true))
	 {return ((String) Debug.delegate(ba, "expandall", null));}
RDebugUtils.currentLine=229376000;
 //BA.debugLineNum = 229376000;BA.debugLine="Sub ExpandAll()";
RDebugUtils.currentLine=229376001;
 //BA.debugLineNum = 229376001;BA.debugLine="treeBO.RunMethod(\"expandAll\", \"\")";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("expandAll",(Object)(""));
RDebugUtils.currentLine=229376002;
 //BA.debugLineNum = 229376002;BA.debugLine="End Sub";
return "";
}
public String  _getall(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getall", true))
	 {return ((String) Debug.delegate(ba, "getall", null));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=228982784;
 //BA.debugLineNum = 228982784;BA.debugLine="Sub GetAll() As String";
RDebugUtils.currentLine=228982785;
 //BA.debugLineNum = 228982785;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getAll";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("getAll",(Object)(""));
RDebugUtils.currentLine=228982786;
 //BA.debugLineNum = 228982786;BA.debugLine="Return BANano.ToJson(bo.Result)";
if (true) return BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson(_bo.Result()));
RDebugUtils.currentLine=228982787;
 //BA.debugLineNum = 228982787;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getcheckednodes(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getcheckednodes", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getcheckednodes", null));}
anywheresoftware.b4a.objects.collections.List _snodes = null;
RDebugUtils.currentLine=228851712;
 //BA.debugLineNum = 228851712;BA.debugLine="Sub GetCheckedNodes() As List";
RDebugUtils.currentLine=228851713;
 //BA.debugLineNum = 228851713;BA.debugLine="Dim snodes As List";
_snodes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=228851714;
 //BA.debugLineNum = 228851714;BA.debugLine="snodes.Initialize";
_snodes.Initialize();
RDebugUtils.currentLine=228851715;
 //BA.debugLineNum = 228851715;BA.debugLine="snodes = treeBO.RunMethod(\"getCheckedNodes\",\"\")";
_snodes.setObject((java.util.List)(__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("getCheckedNodes",(Object)("")).getObject()));
RDebugUtils.currentLine=228851716;
 //BA.debugLineNum = 228851716;BA.debugLine="Return snodes";
if (true) return _snodes;
RDebugUtils.currentLine=228851717;
 //BA.debugLineNum = 228851717;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getchildren(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getchildren", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getchildren", new Object[] {_pk}));}
RDebugUtils.currentLine=228786176;
 //BA.debugLineNum = 228786176;BA.debugLine="Sub GetChildren(pk As String) As List";
RDebugUtils.currentLine=228786177;
 //BA.debugLineNum = 228786177;BA.debugLine="Return treeBO.RunMethod(\"getChildren\", Array(GetN";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("getChildren",(Object)(new Object[]{(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject())})).getObject()));
RDebugUtils.currentLine=228786178;
 //BA.debugLineNum = 228786178;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdata(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getdata", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getdata", new Object[] {_pk}));}
com.ab.banano.BANanoObject _bo = null;
anywheresoftware.b4a.objects.collections.Map _dm = null;
RDebugUtils.currentLine=230096896;
 //BA.debugLineNum = 230096896;BA.debugLine="Sub GetData(pk As String) As Map";
RDebugUtils.currentLine=230096897;
 //BA.debugLineNum = 230096897;BA.debugLine="Dim bo As BANanoObject = GetDataById(pk)";
_bo = new com.ab.banano.BANanoObject();
_bo.setObject((java.lang.Object)(__ref._getdatabyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pk).getObject()));
RDebugUtils.currentLine=230096898;
 //BA.debugLineNum = 230096898;BA.debugLine="Dim dm As Map = bo.Result";
_dm = new anywheresoftware.b4a.objects.collections.Map();
_dm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bo.Result()));
RDebugUtils.currentLine=230096899;
 //BA.debugLineNum = 230096899;BA.debugLine="Return dm";
if (true) return _dm;
RDebugUtils.currentLine=230096900;
 //BA.debugLineNum = 230096900;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdatabyid(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getdatabyid", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getdatabyid", new Object[] {_pk}));}
RDebugUtils.currentLine=228196352;
 //BA.debugLineNum = 228196352;BA.debugLine="Sub GetDataById(pk As String) As Map";
RDebugUtils.currentLine=228196353;
 //BA.debugLineNum = 228196353;BA.debugLine="Return treeBO.RunMethod(\"getDataById\", Array(pk))";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("getDataById",(Object)(new Object[]{(Object)(_pk)})).getObject()));
RDebugUtils.currentLine=228196354;
 //BA.debugLineNum = 228196354;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getdatabytext(b4j.example.vmtree __ref,String _nodetext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getdatabytext", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "getdatabytext", new Object[] {_nodetext}));}
RDebugUtils.currentLine=228392960;
 //BA.debugLineNum = 228392960;BA.debugLine="Sub GetDataByText(nodeText As String) As BANanoObj";
RDebugUtils.currentLine=228392961;
 //BA.debugLineNum = 228392961;BA.debugLine="Return treeBO.RunMethod(\"getDataByText\", Array(no";
if (true) return __ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("getDataByText",(Object)(new Object[]{(Object)(_nodetext)}));
RDebugUtils.currentLine=228392962;
 //BA.debugLineNum = 228392962;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getnodebytext(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getnodebytext", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "getnodebytext", new Object[] {_pk}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=228327424;
 //BA.debugLineNum = 228327424;BA.debugLine="Sub GetNodeByText(pk As String) As BANanoObject";
RDebugUtils.currentLine=228327425;
 //BA.debugLineNum = 228327425;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getNod";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("getNodeByText",(Object)(new Object[]{(Object)(_pk)}));
RDebugUtils.currentLine=228327426;
 //BA.debugLineNum = 228327426;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=228327427;
 //BA.debugLineNum = 228327427;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getselections(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "getselections", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getselections", null));}
RDebugUtils.currentLine=228917248;
 //BA.debugLineNum = 228917248;BA.debugLine="Sub GetSelections() As List";
RDebugUtils.currentLine=228917249;
 //BA.debugLineNum = 228917249;BA.debugLine="Return treeBO.RunMethod(\"getSelections\",\"\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("getSelections",(Object)("")).getObject()));
RDebugUtils.currentLine=228917250;
 //BA.debugLineNum = 228917250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setuilibrary(b4j.example.vmtree __ref,String _uilibrary) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setuilibrary", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setuilibrary", new Object[] {_uilibrary}));}
RDebugUtils.currentLine=227409920;
 //BA.debugLineNum = 227409920;BA.debugLine="Sub SetUiLibrary(uiLibrary As String) As VMTree";
RDebugUtils.currentLine=227409921;
 //BA.debugLineNum = 227409921;BA.debugLine="options.Put(\"uiLibrary\", uiLibrary)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("uiLibrary"),(Object)(_uilibrary));
RDebugUtils.currentLine=227409922;
 //BA.debugLineNum = 227409922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227409923;
 //BA.debugLineNum = 227409923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _seticonslibrary(b4j.example.vmtree __ref,String _siconslibrary) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "seticonslibrary", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "seticonslibrary", new Object[] {_siconslibrary}));}
RDebugUtils.currentLine=226885632;
 //BA.debugLineNum = 226885632;BA.debugLine="Sub SetIconsLibrary(sIconsLibrary As String) As VM";
RDebugUtils.currentLine=226885633;
 //BA.debugLineNum = 226885633;BA.debugLine="IconsLibrary = sIconsLibrary";
__ref._iconslibrary /*String*/  = _siconslibrary;
RDebugUtils.currentLine=226885634;
 //BA.debugLineNum = 226885634;BA.debugLine="options.Put(\"iconsLibrary\", IconsLibrary)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("iconsLibrary"),(Object)(__ref._iconslibrary /*String*/ ));
RDebugUtils.currentLine=226885635;
 //BA.debugLineNum = 226885635;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=226885637;
 //BA.debugLineNum = 226885637;BA.debugLine="ExpandIcon = $\"<i class=\"material-icons\">keyboar";
__ref._expandicon /*String*/  = ("<i class=\"material-icons\">keyboard_arrow_right</i>");
RDebugUtils.currentLine=226885638;
 //BA.debugLineNum = 226885638;BA.debugLine="CollapseIcon = $\"<i class=\"material-icons\">keybo";
__ref._collapseicon /*String*/  = ("<i class=\"material-icons\">keyboard_arrow_down</i>");
 break; }
case 1: {
RDebugUtils.currentLine=226885640;
 //BA.debugLineNum = 226885640;BA.debugLine="ExpandIcon = $\"<i class=\"fa fa-chevron-right\"></";
__ref._expandicon /*String*/  = ("<i class=\"fa fa-chevron-right\"></i>");
RDebugUtils.currentLine=226885641;
 //BA.debugLineNum = 226885641;BA.debugLine="CollapseIcon = $\"<i class=\"fa fa-chevron-down\"><";
__ref._collapseicon /*String*/  = ("<i class=\"fa fa-chevron-down\"></i>");
 break; }
}
;
RDebugUtils.currentLine=226885643;
 //BA.debugLineNum = 226885643;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226885644;
 //BA.debugLineNum = 226885644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setlazyloading(b4j.example.vmtree __ref,boolean _lazyloading) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setlazyloading", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setlazyloading", new Object[] {_lazyloading}));}
RDebugUtils.currentLine=227147776;
 //BA.debugLineNum = 227147776;BA.debugLine="Sub SetLazyLoading(lazyLoading As Boolean) As VMTr";
RDebugUtils.currentLine=227147777;
 //BA.debugLineNum = 227147777;BA.debugLine="options.Put(\"lazyLoading\", lazyLoading)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lazyLoading"),(Object)(_lazyloading));
RDebugUtils.currentLine=227147778;
 //BA.debugLineNum = 227147778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227147779;
 //BA.debugLineNum = 227147779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setselectiontype(b4j.example.vmtree __ref,String _selectiontype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setselectiontype", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setselectiontype", new Object[] {_selectiontype}));}
RDebugUtils.currentLine=227278848;
 //BA.debugLineNum = 227278848;BA.debugLine="Sub SetSelectionType(selectionType As String) As V";
RDebugUtils.currentLine=227278849;
 //BA.debugLineNum = 227278849;BA.debugLine="options.Put(\"selectionType\", selectionType)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("selectionType"),(Object)(_selectiontype));
RDebugUtils.currentLine=227278850;
 //BA.debugLineNum = 227278850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227278851;
 //BA.debugLineNum = 227278851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setcheckedfield(b4j.example.vmtree __ref,String _checkedfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setcheckedfield", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setcheckedfield", new Object[] {_checkedfield}));}
RDebugUtils.currentLine=226492416;
 //BA.debugLineNum = 226492416;BA.debugLine="Sub SetCheckedField(checkedField As String) As VMT";
RDebugUtils.currentLine=226492417;
 //BA.debugLineNum = 226492417;BA.debugLine="options.Put(\"checkedField\", checkedField)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("checkedField"),(Object)(_checkedfield));
RDebugUtils.currentLine=226492418;
 //BA.debugLineNum = 226492418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226492419;
 //BA.debugLineNum = 226492419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setchildrenfield(b4j.example.vmtree __ref,String _childrenfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setchildrenfield", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setchildrenfield", new Object[] {_childrenfield}));}
RDebugUtils.currentLine=226557952;
 //BA.debugLineNum = 226557952;BA.debugLine="Sub SetChildrenField(childrenField As String) As V";
RDebugUtils.currentLine=226557953;
 //BA.debugLineNum = 226557953;BA.debugLine="options.Put(\"childrenField\", childrenField)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("childrenField"),(Object)(_childrenfield));
RDebugUtils.currentLine=226557954;
 //BA.debugLineNum = 226557954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226557955;
 //BA.debugLineNum = 226557955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setdisabledfield(b4j.example.vmtree __ref,String _disabledfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setdisabledfield", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setdisabledfield", new Object[] {_disabledfield}));}
RDebugUtils.currentLine=226689024;
 //BA.debugLineNum = 226689024;BA.debugLine="Sub SetDisabledField(disabledField As String) As V";
RDebugUtils.currentLine=226689025;
 //BA.debugLineNum = 226689025;BA.debugLine="options.Put(\"disabledField\", disabledField)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("disabledField"),(Object)(_disabledfield));
RDebugUtils.currentLine=226689026;
 //BA.debugLineNum = 226689026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226689027;
 //BA.debugLineNum = 226689027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _sethaschildrenfield(b4j.example.vmtree __ref,String _haschildrenfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "sethaschildrenfield", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "sethaschildrenfield", new Object[] {_haschildrenfield}));}
RDebugUtils.currentLine=226820096;
 //BA.debugLineNum = 226820096;BA.debugLine="Sub SetHasChildrenField(hasChildrenField As String";
RDebugUtils.currentLine=226820097;
 //BA.debugLineNum = 226820097;BA.debugLine="options.Put(\"hasChildrenField\", hasChildrenField)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("hasChildrenField"),(Object)(_haschildrenfield));
RDebugUtils.currentLine=226820098;
 //BA.debugLineNum = 226820098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226820099;
 //BA.debugLineNum = 226820099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setimagecssclassfield(b4j.example.vmtree __ref,String _imagecssclassfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setimagecssclassfield", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setimagecssclassfield", new Object[] {_imagecssclassfield}));}
RDebugUtils.currentLine=226951168;
 //BA.debugLineNum = 226951168;BA.debugLine="Sub SetImageCssClassField(imageCssClassField As St";
RDebugUtils.currentLine=226951169;
 //BA.debugLineNum = 226951169;BA.debugLine="options.Put(\"imageCssClassField\", imageCssClassFi";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("imageCssClassField"),(Object)(_imagecssclassfield));
RDebugUtils.currentLine=226951170;
 //BA.debugLineNum = 226951170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226951171;
 //BA.debugLineNum = 226951171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setimagehtmlfield(b4j.example.vmtree __ref,String _simagehtmlfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setimagehtmlfield", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setimagehtmlfield", new Object[] {_simagehtmlfield}));}
RDebugUtils.currentLine=227016704;
 //BA.debugLineNum = 227016704;BA.debugLine="Sub SetImageHtmlField(sImageHtmlField As String) A";
RDebugUtils.currentLine=227016705;
 //BA.debugLineNum = 227016705;BA.debugLine="ImageHtmlField = sImageHtmlField";
__ref._imagehtmlfield /*String*/  = _simagehtmlfield;
RDebugUtils.currentLine=227016706;
 //BA.debugLineNum = 227016706;BA.debugLine="options.Put(\"imageHtmlField\", ImageHtmlField)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("imageHtmlField"),(Object)(__ref._imagehtmlfield /*String*/ ));
RDebugUtils.currentLine=227016707;
 //BA.debugLineNum = 227016707;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227016708;
 //BA.debugLineNum = 227016708;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setimageurlfield(b4j.example.vmtree __ref,String _simageurlfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setimageurlfield", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setimageurlfield", new Object[] {_simageurlfield}));}
RDebugUtils.currentLine=227082240;
 //BA.debugLineNum = 227082240;BA.debugLine="Sub SetImageUrlField(sImageUrlField As String) As";
RDebugUtils.currentLine=227082241;
 //BA.debugLineNum = 227082241;BA.debugLine="ImageUrlField = sImageUrlField";
__ref._imageurlfield /*String*/  = _simageurlfield;
RDebugUtils.currentLine=227082242;
 //BA.debugLineNum = 227082242;BA.debugLine="options.Put(\"imageUrlField\", ImageUrlField)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("imageUrlField"),(Object)(__ref._imageurlfield /*String*/ ));
RDebugUtils.currentLine=227082243;
 //BA.debugLineNum = 227082243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227082244;
 //BA.debugLineNum = 227082244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _settextfield(b4j.example.vmtree __ref,String _textfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "settextfield", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "settextfield", new Object[] {_textfield}));}
RDebugUtils.currentLine=227344384;
 //BA.debugLineNum = 227344384;BA.debugLine="Sub SetTextField(textField As String) As VMTree";
RDebugUtils.currentLine=227344385;
 //BA.debugLineNum = 227344385;BA.debugLine="options.Put(\"textField\", textField)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("textField"),(Object)(_textfield));
RDebugUtils.currentLine=227344386;
 //BA.debugLineNum = 227344386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227344387;
 //BA.debugLineNum = 227344387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setprimarykey(b4j.example.vmtree __ref,String _primarykey) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setprimarykey", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setprimarykey", new Object[] {_primarykey}));}
RDebugUtils.currentLine=227213312;
 //BA.debugLineNum = 227213312;BA.debugLine="Sub SetPrimaryKey(primaryKey As String) As VMTree";
RDebugUtils.currentLine=227213313;
 //BA.debugLineNum = 227213313;BA.debugLine="options.Put(\"primaryKey\", primaryKey)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("primaryKey"),(Object)(_primarykey));
RDebugUtils.currentLine=227213314;
 //BA.debugLineNum = 227213314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227213315;
 //BA.debugLineNum = 227213315;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtree __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=227672064;
 //BA.debugLineNum = 227672064;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=227672065;
 //BA.debugLineNum = 227672065;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=227672066;
 //BA.debugLineNum = 227672066;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
anywheresoftware.b4a.objects.collections.Map _icn = null;
RDebugUtils.currentLine=227475456;
 //BA.debugLineNum = 227475456;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=227475457;
 //BA.debugLineNum = 227475457;BA.debugLine="Dim icn As Map";
_icn = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=227475458;
 //BA.debugLineNum = 227475458;BA.debugLine="icn.Initialize";
_icn.Initialize();
RDebugUtils.currentLine=227475459;
 //BA.debugLineNum = 227475459;BA.debugLine="icn.Put(\"expand\", ExpandIcon)";
_icn.Put((Object)("expand"),(Object)(__ref._expandicon /*String*/ ));
RDebugUtils.currentLine=227475460;
 //BA.debugLineNum = 227475460;BA.debugLine="icn.Put(\"collapse\", CollapseIcon)";
_icn.Put((Object)("collapse"),(Object)(__ref._collapseicon /*String*/ ));
RDebugUtils.currentLine=227475461;
 //BA.debugLineNum = 227475461;BA.debugLine="options.Put(\"icons\", icn)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("icons"),(Object)(_icn.getObject()));
RDebugUtils.currentLine=227475462;
 //BA.debugLineNum = 227475462;BA.debugLine="Return Tree.ToString";
if (true) return __ref._tree /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=227475463;
 //BA.debugLineNum = 227475463;BA.debugLine="End Sub";
return "";
}
public String  _reload(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "reload", true))
	 {return ((String) Debug.delegate(ba, "reload", null));}
RDebugUtils.currentLine=229507072;
 //BA.debugLineNum = 229507072;BA.debugLine="Sub Reload()";
RDebugUtils.currentLine=229507073;
 //BA.debugLineNum = 229507073;BA.debugLine="treeBO.RunMethod(\"reload\", \"\")";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("reload",(Object)(""));
RDebugUtils.currentLine=229507074;
 //BA.debugLineNum = 229507074;BA.debugLine="End Sub";
return "";
}
public String  _removechildren(b4j.example.vmtree __ref,String _parentid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "removechildren", true))
	 {return ((String) Debug.delegate(ba, "removechildren", new Object[] {_parentid}));}
anywheresoftware.b4a.objects.collections.List _children = null;
int _tchild = 0;
int _cchild = 0;
String _strchild = "";
RDebugUtils.currentLine=230031360;
 //BA.debugLineNum = 230031360;BA.debugLine="Sub RemoveChildren(parentID As String)";
RDebugUtils.currentLine=230031362;
 //BA.debugLineNum = 230031362;BA.debugLine="Dim children As List = GetChildren(parentID)";
_children = new anywheresoftware.b4a.objects.collections.List();
_children = __ref._getchildren /*anywheresoftware.b4a.objects.collections.List*/ (null,_parentid);
RDebugUtils.currentLine=230031363;
 //BA.debugLineNum = 230031363;BA.debugLine="Dim tChild As Int = children.Size - 1";
_tchild = (int) (_children.getSize()-1);
RDebugUtils.currentLine=230031364;
 //BA.debugLineNum = 230031364;BA.debugLine="Dim cChild As Int";
_cchild = 0;
RDebugUtils.currentLine=230031365;
 //BA.debugLineNum = 230031365;BA.debugLine="For cChild = tChild To 0 Step -1";
{
final int step4 = -1;
final int limit4 = (int) (0);
_cchild = _tchild ;
for (;_cchild >= limit4 ;_cchild = _cchild + step4 ) {
RDebugUtils.currentLine=230031366;
 //BA.debugLineNum = 230031366;BA.debugLine="Dim strChild As String = children.Get(cChild)";
_strchild = BA.ObjectToString(_children.Get(_cchild));
RDebugUtils.currentLine=230031367;
 //BA.debugLineNum = 230031367;BA.debugLine="RemoveNode(strChild)";
__ref._removenode /*String*/ (null,_strchild);
 }
};
RDebugUtils.currentLine=230031369;
 //BA.debugLineNum = 230031369;BA.debugLine="End Sub";
return "";
}
public String  _removenode(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "removenode", true))
	 {return ((String) Debug.delegate(ba, "removenode", new Object[] {_pk}));}
RDebugUtils.currentLine=229048320;
 //BA.debugLineNum = 229048320;BA.debugLine="Sub RemoveNode(pk As String)";
RDebugUtils.currentLine=229048321;
 //BA.debugLineNum = 229048321;BA.debugLine="Try";
try {RDebugUtils.currentLine=229048322;
 //BA.debugLineNum = 229048322;BA.debugLine="treeBO.RunMethod(\"removeNode\", GetNodeById(pk))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("removeNode",(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=229048324;
 //BA.debugLineNum = 229048324;BA.debugLine="Log(\"Error removing node\")";
__c.Log("Error removing node");
 };
RDebugUtils.currentLine=229048326;
 //BA.debugLineNum = 229048326;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=227606528;
 //BA.debugLineNum = 227606528;BA.debugLine="Sub Render";
RDebugUtils.currentLine=227606529;
 //BA.debugLineNum = 227606529;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=227606530;
 //BA.debugLineNum = 227606530;BA.debugLine="End Sub";
return "";
}
public String  _selectnode(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "selectnode", true))
	 {return ((String) Debug.delegate(ba, "selectnode", new Object[] {_pk}));}
com.ab.banano.BANanoObject _rec = null;
RDebugUtils.currentLine=229244928;
 //BA.debugLineNum = 229244928;BA.debugLine="Sub SelectNode(pk As String)";
RDebugUtils.currentLine=229244929;
 //BA.debugLineNum = 229244929;BA.debugLine="UnSelectAll";
__ref._unselectall /*String*/ (null);
RDebugUtils.currentLine=229244930;
 //BA.debugLineNum = 229244930;BA.debugLine="Dim rec As BANanoObject = GetNodeById(pk)";
_rec = new com.ab.banano.BANanoObject();
_rec = __ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk);
RDebugUtils.currentLine=229244931;
 //BA.debugLineNum = 229244931;BA.debugLine="treeBO.RunMethod(\"select\", Array(rec))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("select",(Object)(new Object[]{(Object)(_rec.getObject())}));
RDebugUtils.currentLine=229244932;
 //BA.debugLineNum = 229244932;BA.debugLine="End Sub";
return "";
}
public String  _unselectall(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "unselectall", true))
	 {return ((String) Debug.delegate(ba, "unselectall", null));}
RDebugUtils.currentLine=230162432;
 //BA.debugLineNum = 230162432;BA.debugLine="Sub UnSelectAll";
RDebugUtils.currentLine=230162433;
 //BA.debugLineNum = 230162433;BA.debugLine="treeBO.RunMethod(\"unselectAll\", Null)";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("unselectAll",__c.Null);
RDebugUtils.currentLine=230162434;
 //BA.debugLineNum = 230162434;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _setattr(b4j.example.vmtree __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=227803136;
 //BA.debugLineNum = 227803136;BA.debugLine="Sub SetAttr(attr As Map) As VMTree";
RDebugUtils.currentLine=227803137;
 //BA.debugLineNum = 227803137;BA.debugLine="Tree.SetAttr(attr)";
__ref._tree /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=227803138;
 //BA.debugLineNum = 227803138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227803139;
 //BA.debugLineNum = 227803139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setautoload(b4j.example.vmtree __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setautoload", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setautoload", new Object[] {_b}));}
RDebugUtils.currentLine=226164736;
 //BA.debugLineNum = 226164736;BA.debugLine="Sub SetAutoLoad(b As Boolean) As VMTree";
RDebugUtils.currentLine=226164737;
 //BA.debugLineNum = 226164737;BA.debugLine="options.Put(\"autoLoad\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("autoLoad"),(Object)(_b));
RDebugUtils.currentLine=226164738;
 //BA.debugLineNum = 226164738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226164739;
 //BA.debugLineNum = 226164739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setborder(b4j.example.vmtree __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setborder", new Object[] {_b}));}
RDebugUtils.currentLine=226295808;
 //BA.debugLineNum = 226295808;BA.debugLine="Sub SetBorder(b As Boolean) As VMTree";
RDebugUtils.currentLine=226295809;
 //BA.debugLineNum = 226295809;BA.debugLine="options.Put(\"border\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("border"),(Object)(_b));
RDebugUtils.currentLine=226295810;
 //BA.debugLineNum = 226295810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226295811;
 //BA.debugLineNum = 226295811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setcascadecheck(b4j.example.vmtree __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setcascadecheck", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setcascadecheck", new Object[] {_b}));}
RDebugUtils.currentLine=226361344;
 //BA.debugLineNum = 226361344;BA.debugLine="Sub SetCascadeCheck(b As Boolean) As VMTree";
RDebugUtils.currentLine=226361345;
 //BA.debugLineNum = 226361345;BA.debugLine="options.Put(\"cascadeCheck\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cascadeCheck"),(Object)(_b));
RDebugUtils.currentLine=226361346;
 //BA.debugLineNum = 226361346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226361347;
 //BA.debugLineNum = 226361347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setcheckboxes(b4j.example.vmtree __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setcheckboxes", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setcheckboxes", new Object[] {_b}));}
RDebugUtils.currentLine=226426880;
 //BA.debugLineNum = 226426880;BA.debugLine="Sub SetCheckboxes(b As Boolean) As VMTree";
RDebugUtils.currentLine=226426881;
 //BA.debugLineNum = 226426881;BA.debugLine="options.put(\"checkboxes\", b)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("checkboxes"),(Object)(_b));
RDebugUtils.currentLine=226426882;
 //BA.debugLineNum = 226426882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226426883;
 //BA.debugLineNum = 226426883;BA.debugLine="End Sub";
return null;
}
public String  _setdata(b4j.example.vmtree __ref,String _pk,anywheresoftware.b4a.objects.collections.Map _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setdata", true))
	 {return ((String) Debug.delegate(ba, "setdata", new Object[] {_pk,_tag}));}
com.ab.banano.BANanoObject _nod = null;
String _strkey = "";
Object _strval = null;
RDebugUtils.currentLine=228655104;
 //BA.debugLineNum = 228655104;BA.debugLine="Sub SetData(pk As String, Tag As Map)";
RDebugUtils.currentLine=228655105;
 //BA.debugLineNum = 228655105;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(__ref._getdatabyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pk).getObject()));
RDebugUtils.currentLine=228655106;
 //BA.debugLineNum = 228655106;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
RDebugUtils.currentLine=228655107;
 //BA.debugLineNum = 228655107;BA.debugLine="If Tag <> Null Then";
if (_tag!= null) { 
RDebugUtils.currentLine=228655108;
 //BA.debugLineNum = 228655108;BA.debugLine="For Each strKey As String In Tag.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _tag.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strkey = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=228655109;
 //BA.debugLineNum = 228655109;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
_strval = _tag.Get((Object)(_strkey));
RDebugUtils.currentLine=228655110;
 //BA.debugLineNum = 228655110;BA.debugLine="nod.SetField(strKey, strVal)";
_nod.SetField(_strkey,_strval);
 }
};
 };
RDebugUtils.currentLine=228655113;
 //BA.debugLineNum = 228655113;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
RDebugUtils.currentLine=228655115;
 //BA.debugLineNum = 228655115;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _setdisabled(b4j.example.vmtree __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=225968128;
 //BA.debugLineNum = 225968128;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTree";
RDebugUtils.currentLine=225968129;
 //BA.debugLineNum = 225968129;BA.debugLine="Tree.SetDisabled(b)";
__ref._tree /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=225968130;
 //BA.debugLineNum = 225968130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=225968131;
 //BA.debugLineNum = 225968131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setdraganddrop(b4j.example.vmtree __ref,boolean _draganddrop) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setdraganddrop", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setdraganddrop", new Object[] {_draganddrop}));}
RDebugUtils.currentLine=226754560;
 //BA.debugLineNum = 226754560;BA.debugLine="Sub SetDragAndDrop(dragAndDrop As Boolean) As VMTr";
RDebugUtils.currentLine=226754561;
 //BA.debugLineNum = 226754561;BA.debugLine="options.Put(\"dragAndDrop\", dragAndDrop)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("dragAndDrop"),(Object)(_draganddrop));
RDebugUtils.currentLine=226754562;
 //BA.debugLineNum = 226754562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226754563;
 //BA.debugLineNum = 226754563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setelevation(b4j.example.vmtree __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=226099200;
 //BA.debugLineNum = 226099200;BA.debugLine="Sub SetElevation(e As Int) As VMTree";
RDebugUtils.currentLine=226099201;
 //BA.debugLineNum = 226099201;BA.debugLine="Tree.SetElevation(e)";
__ref._tree /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=226099202;
 //BA.debugLineNum = 226099202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226099203;
 //BA.debugLineNum = 226099203;BA.debugLine="End Sub";
return null;
}
public String  _seticon(b4j.example.vmtree __ref,String _pk,String _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((String) Debug.delegate(ba, "seticon", new Object[] {_pk,_icon}));}
com.ab.banano.BANanoObject _nod = null;
String _sicon = "";
RDebugUtils.currentLine=228524032;
 //BA.debugLineNum = 228524032;BA.debugLine="Sub SetIcon(pk As String, Icon As String)";
RDebugUtils.currentLine=228524033;
 //BA.debugLineNum = 228524033;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(__ref._getdatabyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pk).getObject()));
RDebugUtils.currentLine=228524034;
 //BA.debugLineNum = 228524034;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
RDebugUtils.currentLine=228524035;
 //BA.debugLineNum = 228524035;BA.debugLine="Dim sIcon As String = \"\"";
_sicon = "";
RDebugUtils.currentLine=228524036;
 //BA.debugLineNum = 228524036;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=228524038;
 //BA.debugLineNum = 228524038;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
_sicon = ("<i class=\"material-icons\">"+__c.SmartStringFormatter("",(Object)(_icon))+"</i>");
 break; }
case 1: {
RDebugUtils.currentLine=228524040;
 //BA.debugLineNum = 228524040;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
_sicon = ("<i class=\""+__c.SmartStringFormatter("",(Object)(_icon))+"\"></i>");
 break; }
}
;
RDebugUtils.currentLine=228524042;
 //BA.debugLineNum = 228524042;BA.debugLine="nod.SetField(ImageHtmlField, sIcon)";
_nod.SetField(__ref._imagehtmlfield /*String*/ ,(Object)(_sicon));
RDebugUtils.currentLine=228524043;
 //BA.debugLineNum = 228524043;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
RDebugUtils.currentLine=228524045;
 //BA.debugLineNum = 228524045;BA.debugLine="End Sub";
return "";
}
public String  _setimage(b4j.example.vmtree __ref,String _pk,String _imageurl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setimage", true))
	 {return ((String) Debug.delegate(ba, "setimage", new Object[] {_pk,_imageurl}));}
com.ab.banano.BANanoObject _nod = null;
RDebugUtils.currentLine=228589568;
 //BA.debugLineNum = 228589568;BA.debugLine="Sub SetImage(pk As String, ImageURL As String)";
RDebugUtils.currentLine=228589569;
 //BA.debugLineNum = 228589569;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(__ref._getdatabyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pk).getObject()));
RDebugUtils.currentLine=228589570;
 //BA.debugLineNum = 228589570;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
RDebugUtils.currentLine=228589571;
 //BA.debugLineNum = 228589571;BA.debugLine="nod.SetField(ImageUrlField, ImageURL)";
_nod.SetField(__ref._imageurlfield /*String*/ ,(Object)(_imageurl));
RDebugUtils.currentLine=228589572;
 //BA.debugLineNum = 228589572;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
RDebugUtils.currentLine=228589574;
 //BA.debugLineNum = 228589574;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _setpadding(b4j.example.vmtree __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=227934208;
 //BA.debugLineNum = 227934208;BA.debugLine="Sub SetPadding(p As Object) As VMTree";
RDebugUtils.currentLine=227934209;
 //BA.debugLineNum = 227934209;BA.debugLine="Tree.SetPaddingAll(p)";
__ref._tree /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=227934210;
 //BA.debugLineNum = 227934210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227934211;
 //BA.debugLineNum = 227934211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setstyle(b4j.example.vmtree __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=227868672;
 //BA.debugLineNum = 227868672;BA.debugLine="Sub SetStyle(sm As Map) As VMTree";
RDebugUtils.currentLine=227868673;
 //BA.debugLineNum = 227868673;BA.debugLine="Tree.SetStyle(sm)";
__ref._tree /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=227868674;
 //BA.debugLineNum = 227868674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227868675;
 //BA.debugLineNum = 227868675;BA.debugLine="End Sub";
return null;
}
public String  _settext(b4j.example.vmtree __ref,String _pk,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_pk,_text}));}
com.ab.banano.BANanoObject _nod = null;
RDebugUtils.currentLine=228458496;
 //BA.debugLineNum = 228458496;BA.debugLine="Sub SetText(pk As String, Text As String)";
RDebugUtils.currentLine=228458497;
 //BA.debugLineNum = 228458497;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(__ref._getdatabyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pk).getObject()));
RDebugUtils.currentLine=228458498;
 //BA.debugLineNum = 228458498;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
RDebugUtils.currentLine=228458499;
 //BA.debugLineNum = 228458499;BA.debugLine="nod.SetField(\"text\", Text)";
_nod.SetField("text",(Object)(_text));
RDebugUtils.currentLine=228458500;
 //BA.debugLineNum = 228458500;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
RDebugUtils.currentLine=228458502;
 //BA.debugLineNum = 228458502;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _setvmodel(b4j.example.vmtree __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=227540992;
 //BA.debugLineNum = 227540992;BA.debugLine="Sub SetVModel(k As String) As VMTree";
RDebugUtils.currentLine=227540993;
 //BA.debugLineNum = 227540993;BA.debugLine="Tree.SetVModel(k)";
__ref._tree /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=227540994;
 //BA.debugLineNum = 227540994;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=227540995;
 //BA.debugLineNum = 227540995;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setvshow(b4j.example.vmtree __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=226033664;
 //BA.debugLineNum = 226033664;BA.debugLine="Sub SetVShow(vif As String) As VMTree";
RDebugUtils.currentLine=226033665;
 //BA.debugLineNum = 226033665;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtree)(this);};
RDebugUtils.currentLine=226033666;
 //BA.debugLineNum = 226033666;BA.debugLine="Tree.SetVShow(vif)";
__ref._tree /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=226033667;
 //BA.debugLineNum = 226033667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226033668;
 //BA.debugLineNum = 226033668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setwidth(b4j.example.vmtree __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmtree) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=226230272;
 //BA.debugLineNum = 226230272;BA.debugLine="Sub SetWidth(w As String) As VMTree";
RDebugUtils.currentLine=226230273;
 //BA.debugLineNum = 226230273;BA.debugLine="options.Put(\"width\", w)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("width"),(Object)(_w));
RDebugUtils.currentLine=226230274;
 //BA.debugLineNum = 226230274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
RDebugUtils.currentLine=226230275;
 //BA.debugLineNum = 226230275;BA.debugLine="End Sub";
return null;
}
public String  _uncheck(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "uncheck", true))
	 {return ((String) Debug.delegate(ba, "uncheck", new Object[] {_pk}));}
RDebugUtils.currentLine=229179392;
 //BA.debugLineNum = 229179392;BA.debugLine="Sub UnCheck(pk As String)";
RDebugUtils.currentLine=229179393;
 //BA.debugLineNum = 229179393;BA.debugLine="treeBO.RunMethod(\"uncheck\", Array(GetNodeById(pk)";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("uncheck",(Object)(new Object[]{(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject())}));
RDebugUtils.currentLine=229179394;
 //BA.debugLineNum = 229179394;BA.debugLine="End Sub";
return "";
}
public String  _uncheckall(b4j.example.vmtree __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "uncheckall", true))
	 {return ((String) Debug.delegate(ba, "uncheckall", null));}
RDebugUtils.currentLine=229703680;
 //BA.debugLineNum = 229703680;BA.debugLine="Sub UnCheckAll()";
RDebugUtils.currentLine=229703681;
 //BA.debugLineNum = 229703681;BA.debugLine="treeBO.RunMethod(\"uncheckAll\", \"\")";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("uncheckAll",(Object)(""));
RDebugUtils.currentLine=229703682;
 //BA.debugLineNum = 229703682;BA.debugLine="End Sub";
return "";
}
public String  _unselectnode(b4j.example.vmtree __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "unselectnode", true))
	 {return ((String) Debug.delegate(ba, "unselectnode", new Object[] {_pk}));}
RDebugUtils.currentLine=229310464;
 //BA.debugLineNum = 229310464;BA.debugLine="Sub UnSelectNode(pk As String)";
RDebugUtils.currentLine=229310465;
 //BA.debugLineNum = 229310465;BA.debugLine="treeBO.RunMethod(\"unselect\", Array(GetNodeById(pk";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("unselect",(Object)(new Object[]{(Object)(__ref._getnodebyid /*com.ab.banano.BANanoObject*/ (null,_pk).getObject())}));
RDebugUtils.currentLine=229310466;
 //BA.debugLineNum = 229310466;BA.debugLine="End Sub";
return "";
}
public String  _updatenode(b4j.example.vmtree __ref,String _pk,String _text,String _imgurl,String _icon,anywheresoftware.b4a.objects.collections.Map _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtree";
if (Debug.shouldDelegate(ba, "updatenode", true))
	 {return ((String) Debug.delegate(ba, "updatenode", new Object[] {_pk,_text,_imgurl,_icon,_tag}));}
com.ab.banano.BANanoObject _nod = null;
String _strkey = "";
Object _strval = null;
String _sicon = "";
RDebugUtils.currentLine=228720640;
 //BA.debugLineNum = 228720640;BA.debugLine="Sub UpdateNode(pk As String, Text As String, ImgUR";
RDebugUtils.currentLine=228720641;
 //BA.debugLineNum = 228720641;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(__ref._getdatabyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pk).getObject()));
RDebugUtils.currentLine=228720642;
 //BA.debugLineNum = 228720642;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
RDebugUtils.currentLine=228720643;
 //BA.debugLineNum = 228720643;BA.debugLine="nod.SetField(\"text\", Text)";
_nod.SetField("text",(Object)(_text));
RDebugUtils.currentLine=228720644;
 //BA.debugLineNum = 228720644;BA.debugLine="If Tag <> Null Then";
if (_tag!= null) { 
RDebugUtils.currentLine=228720645;
 //BA.debugLineNum = 228720645;BA.debugLine="For Each strKey As String In Tag.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _tag.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strkey = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=228720646;
 //BA.debugLineNum = 228720646;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
_strval = _tag.Get((Object)(_strkey));
RDebugUtils.currentLine=228720647;
 //BA.debugLineNum = 228720647;BA.debugLine="nod.SetField(strKey, strVal)";
_nod.SetField(_strkey,_strval);
 }
};
 };
RDebugUtils.currentLine=228720650;
 //BA.debugLineNum = 228720650;BA.debugLine="Dim sIcon As String = \"\"";
_sicon = "";
RDebugUtils.currentLine=228720651;
 //BA.debugLineNum = 228720651;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=228720653;
 //BA.debugLineNum = 228720653;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
_sicon = ("<i class=\"material-icons\">"+__c.SmartStringFormatter("",(Object)(_icon))+"</i>");
 break; }
case 1: {
RDebugUtils.currentLine=228720655;
 //BA.debugLineNum = 228720655;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
_sicon = ("<i class=\""+__c.SmartStringFormatter("",(Object)(_icon))+"\"></i>");
 break; }
}
;
RDebugUtils.currentLine=228720657;
 //BA.debugLineNum = 228720657;BA.debugLine="If ImgURL.Length > 0 Then nod.SetField(ImageUrlF";
if (_imgurl.length()>0) { 
_nod.SetField(__ref._imageurlfield /*String*/ ,(Object)(_sicon));};
RDebugUtils.currentLine=228720658;
 //BA.debugLineNum = 228720658;BA.debugLine="If Icon.Length > 0 Then nod.SetField(ImageHtmlFi";
if (_icon.length()>0) { 
_nod.SetField(__ref._imagehtmlfield /*String*/ ,(Object)(_imgurl));};
RDebugUtils.currentLine=228720659;
 //BA.debugLineNum = 228720659;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
__ref._treebo /*com.ab.banano.BANanoObject*/ .RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
RDebugUtils.currentLine=228720661;
 //BA.debugLineNum = 228720661;BA.debugLine="End Sub";
return "";
}
}