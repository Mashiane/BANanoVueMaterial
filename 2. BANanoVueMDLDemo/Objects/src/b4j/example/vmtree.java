package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtree extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtree", this);
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
public b4j.example.vmtree  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub AddClass(c As String) As VMTree";
 //BA.debugLineNum = 201;BA.debugLine="Tree.AddClass(c)";
_tree._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public String  _addnode(String _parentid,String _pk,String _text,String _imgurl,String _icon,anywheresoftware.b4a.objects.collections.Map _tag) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nod = null;
String _sicon = "";
String _strkey = "";
Object _strval = null;
com.ab.banano.BANanoObject _prnt = null;
 //BA.debugLineNum = 244;BA.debugLine="Sub AddNode(parentID As String, pk As String, Text";
 //BA.debugLineNum = 245;BA.debugLine="If treeBO = Null Then Refresh";
if (_treebo== null) { 
_refresh();};
 //BA.debugLineNum = 247;BA.debugLine="Dim nod As Map = CreateMap(\"id\":pk,\"text\":Text)";
_nod = new anywheresoftware.b4a.objects.collections.Map();
_nod = __c.createMap(new Object[] {(Object)("id"),(Object)(_pk),(Object)("text"),(Object)(_text)});
 //BA.debugLineNum = 249;BA.debugLine="If ImgURL <> \"\" Then";
if ((_imgurl).equals("") == false) { 
 //BA.debugLineNum = 250;BA.debugLine="nod.Put(ImageUrlField, ImgURL)";
_nod.Put((Object)(_imageurlfield),(Object)(_imgurl));
 };
 //BA.debugLineNum = 253;BA.debugLine="If Icon <> \"\" Then";
if ((_icon).equals("") == false) { 
 //BA.debugLineNum = 254;BA.debugLine="Dim sIcon As String = \"\"";
_sicon = "";
 //BA.debugLineNum = 255;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 257;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
_sicon = ("<i class=\"material-icons\">"+__c.SmartStringFormatter("",(Object)(_icon))+"</i>");
 break; }
case 1: {
 //BA.debugLineNum = 259;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
_sicon = ("<i class=\""+__c.SmartStringFormatter("",(Object)(_icon))+"\"></i>");
 break; }
}
;
 //BA.debugLineNum = 261;BA.debugLine="nod.Put(ImageHtmlField, sIcon)";
_nod.Put((Object)(_imagehtmlfield),(Object)(_sicon));
 };
 //BA.debugLineNum = 264;BA.debugLine="If Tag <> Null Then";
if (_tag!= null) { 
 //BA.debugLineNum = 265;BA.debugLine="For Each strKey As String In Tag.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _tag.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_strkey = BA.ObjectToString(group17.Get(index17));
 //BA.debugLineNum = 266;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
_strval = _tag.Get((Object)(_strkey));
 //BA.debugLineNum = 267;BA.debugLine="nod.Put(strKey,strVal)";
_nod.Put((Object)(_strkey),_strval);
 }
};
 };
 //BA.debugLineNum = 270;BA.debugLine="If parentID = \"\" Then";
if ((_parentid).equals("")) { 
 //BA.debugLineNum = 271;BA.debugLine="treeBO.RunMethod(\"addNode\",Array(nod))";
_treebo.RunMethod("addNode",(Object)(new Object[]{(Object)(_nod.getObject())}));
 }else {
 //BA.debugLineNum = 273;BA.debugLine="Dim prnt As BANanoObject = GetNodeById(parentID)";
_prnt = new com.ab.banano.BANanoObject();
_prnt = _getnodebyid(_parentid);
 //BA.debugLineNum = 274;BA.debugLine="If prnt <> Null Then";
if (_prnt!= null) { 
 //BA.debugLineNum = 275;BA.debugLine="treeBO.RunMethod(\"addNode\",Array(nod,prnt))";
_treebo.RunMethod("addNode",(Object)(new Object[]{(Object)(_nod.getObject()),(Object)(_prnt.getObject())}));
 };
 };
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public String  _check(String _pk) throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Sub Check(pk As String)";
 //BA.debugLineNum = 409;BA.debugLine="treeBO.RunMethod(\"check\", Array(GetNodeById(pk)))";
_treebo.RunMethod("check",(Object)(new Object[]{(Object)(_getnodebyid(_pk).getObject())}));
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return "";
}
public String  _checkall() throws Exception{
 //BA.debugLineNum = 450;BA.debugLine="Sub CheckAll()";
 //BA.debugLineNum = 451;BA.debugLine="treeBO.RunMethod(\"checkAll\", \"\")";
_treebo.RunMethod("checkAll",(Object)(""));
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Tree As VMElement";
_tree = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private ExpandIcon As String";
_expandicon = "";
 //BA.debugLineNum = 10;BA.debugLine="Private CollapseIcon As String";
_collapseicon = "";
 //BA.debugLineNum = 11;BA.debugLine="Private treeBO As BANanoObject";
_treebo = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 12;BA.debugLine="Private IconsLibrary As String";
_iconslibrary = "";
 //BA.debugLineNum = 13;BA.debugLine="Private ImageUrlField As String";
_imageurlfield = "";
 //BA.debugLineNum = 14;BA.debugLine="Private ImageHtmlField As String";
_imagehtmlfield = "";
 //BA.debugLineNum = 15;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 435;BA.debugLine="SetDataSource(Array())";
_setdatasource(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{}));
 //BA.debugLineNum = 436;BA.debugLine="Refresh";
_refresh();
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return "";
}
public String  _collapse(String _pk) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub Collapse(pk As String)";
 //BA.debugLineNum = 467;BA.debugLine="treeBO.RunMethod(\"collapse\", Array(GetNodeById(pk";
_treebo.RunMethod("collapse",(Object)(new Object[]{(Object)(_getnodebyid(_pk).getObject())}));
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return "";
}
public String  _collapseall() throws Exception{
 //BA.debugLineNum = 445;BA.debugLine="Sub CollapseAll()";
 //BA.debugLineNum = 446;BA.debugLine="treeBO.RunMethod(\"collapseAll\", \"\")";
_treebo.RunMethod("collapseAll",(Object)(""));
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return "";
}
public String  _destroy() throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub Destroy";
 //BA.debugLineNum = 225;BA.debugLine="treeBO.runmethod(\"destroy\",Null)";
_treebo.RunMethod("destroy",__c.Null);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _disable(String _pk) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub Disable(pk As String)";
 //BA.debugLineNum = 477;BA.debugLine="treeBO.RunMethod(\"disable\", Array(GetNodeById(pk)";
_treebo.RunMethod("disable",(Object)(new Object[]{(Object)(_getnodebyid(_pk).getObject())}));
 //BA.debugLineNum = 478;BA.debugLine="End Sub";
return "";
}
public String  _enable(String _pk) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub Enable(pk As String)";
 //BA.debugLineNum = 472;BA.debugLine="treeBO.RunMethod(\"enable\", Array(GetNodeById(pk))";
_treebo.RunMethod("enable",(Object)(new Object[]{(Object)(_getnodebyid(_pk).getObject())}));
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return "";
}
public String  _expand(String _pk) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub Expand(pk As String)";
 //BA.debugLineNum = 462;BA.debugLine="treeBO.RunMethod(\"expand\", Array(GetNodeById(pk))";
_treebo.RunMethod("expand",(Object)(new Object[]{(Object)(_getnodebyid(_pk).getObject())}));
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return "";
}
public String  _expandall() throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub ExpandAll()";
 //BA.debugLineNum = 431;BA.debugLine="treeBO.RunMethod(\"expandAll\", \"\")";
_treebo.RunMethod("expandAll",(Object)(""));
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return "";
}
public String  _getall() throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 393;BA.debugLine="Sub GetAll() As String";
 //BA.debugLineNum = 394;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getAll";
_bo = new com.ab.banano.BANanoObject();
_bo = _treebo.RunMethod("getAll",(Object)(""));
 //BA.debugLineNum = 395;BA.debugLine="Return BANano.ToJson(bo.Result)";
if (true) return BA.ObjectToString(_banano.ToJson(_bo.Result()));
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getcheckednodes() throws Exception{
anywheresoftware.b4a.objects.collections.List _snodes = null;
 //BA.debugLineNum = 380;BA.debugLine="Sub GetCheckedNodes() As List";
 //BA.debugLineNum = 381;BA.debugLine="Dim snodes As List";
_snodes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 382;BA.debugLine="snodes.Initialize";
_snodes.Initialize();
 //BA.debugLineNum = 383;BA.debugLine="snodes = treeBO.RunMethod(\"getCheckedNodes\",\"\")";
_snodes.setObject((java.util.List)(_treebo.RunMethod("getCheckedNodes",(Object)("")).getObject()));
 //BA.debugLineNum = 384;BA.debugLine="Return snodes";
if (true) return _snodes;
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getchildren(String _pk) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub GetChildren(pk As String) As List";
 //BA.debugLineNum = 376;BA.debugLine="Return treeBO.RunMethod(\"getChildren\", Array(GetN";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_treebo.RunMethod("getChildren",(Object)(new Object[]{(Object)(_getnodebyid(_pk).getObject())})).getObject()));
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdata(String _pk) throws Exception{
com.ab.banano.BANanoObject _bo = null;
anywheresoftware.b4a.objects.collections.Map _dm = null;
 //BA.debugLineNum = 493;BA.debugLine="Sub GetData(pk As String) As Map";
 //BA.debugLineNum = 494;BA.debugLine="Dim bo As BANanoObject = GetDataById(pk)";
_bo = new com.ab.banano.BANanoObject();
_bo.setObject((java.lang.Object)(_getdatabyid(_pk).getObject()));
 //BA.debugLineNum = 495;BA.debugLine="Dim dm As Map = bo.Result";
_dm = new anywheresoftware.b4a.objects.collections.Map();
_dm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bo.Result()));
 //BA.debugLineNum = 496;BA.debugLine="Return dm";
if (true) return _dm;
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getdatabyid(String _pk) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub GetDataById(pk As String) As Map";
 //BA.debugLineNum = 282;BA.debugLine="Return treeBO.RunMethod(\"getDataById\", Array(pk))";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_treebo.RunMethod("getDataById",(Object)(new Object[]{(Object)(_pk)})).getObject()));
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getdatabytext(String _nodetext) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub GetDataByText(nodeText As String) As BANanoObj";
 //BA.debugLineNum = 299;BA.debugLine="Return treeBO.RunMethod(\"getDataByText\", Array(no";
if (true) return _treebo.RunMethod("getDataByText",(Object)(new Object[]{(Object)(_nodetext)}));
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getnodebyid(String _pk) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 286;BA.debugLine="Sub GetNodeById(pk As String) As BANanoObject";
 //BA.debugLineNum = 287;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getNod";
_bo = new com.ab.banano.BANanoObject();
_bo = _treebo.RunMethod("getNodeById",(Object)(new Object[]{(Object)(_pk)}));
 //BA.debugLineNum = 288;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getnodebytext(String _pk) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 292;BA.debugLine="Sub GetNodeByText(pk As String) As BANanoObject";
 //BA.debugLineNum = 293;BA.debugLine="Dim bo As BANanoObject = treeBO.RunMethod(\"getNod";
_bo = new com.ab.banano.BANanoObject();
_bo = _treebo.RunMethod("getNodeByText",(Object)(new Object[]{(Object)(_pk)}));
 //BA.debugLineNum = 294;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getselections() throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub GetSelections() As List";
 //BA.debugLineNum = 389;BA.debugLine="Return treeBO.RunMethod(\"getSelections\",\"\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_treebo.RunMethod("getSelections",(Object)("")).getObject()));
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,Object _module,String _sid,String _prikey) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(v As BANanoVue, module As Ob";
 //BA.debugLineNum = 20;BA.debugLine="BANano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
_banano.DependsOnAsset("jquery-3.4.1.min.js");
 //BA.debugLineNum = 21;BA.debugLine="BANano.DependsOnAsset(\"gijgo.min.css\")";
_banano.DependsOnAsset("gijgo.min.css");
 //BA.debugLineNum = 22;BA.debugLine="BANano.DependsOnAsset(\"gijgo.min.js\")";
_banano.DependsOnAsset("gijgo.min.js");
 //BA.debugLineNum = 23;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 24;BA.debugLine="Tree.Initialize(v, ID)";
_tree._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 25;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 26;BA.debugLine="JQ = vue.jquery";
_jq = _vue._jquery /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 27;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 28;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="SetUiLibrary(\"materialdesign\")";
_setuilibrary("materialdesign");
 //BA.debugLineNum = 30;BA.debugLine="SetIconsLibrary(\"materialicons\")";
_seticonslibrary("materialicons");
 //BA.debugLineNum = 31;BA.debugLine="SetLazyLoading(True)";
_setlazyloading(__c.True);
 //BA.debugLineNum = 32;BA.debugLine="SetSelectionType(\"single\")";
_setselectiontype("single");
 //BA.debugLineNum = 33;BA.debugLine="SetCheckedField(\"checked\")";
_setcheckedfield("checked");
 //BA.debugLineNum = 34;BA.debugLine="SetChildrenField(\"children\")";
_setchildrenfield("children");
 //BA.debugLineNum = 35;BA.debugLine="SetDisabledField(\"disabled\")";
_setdisabledfield("disabled");
 //BA.debugLineNum = 36;BA.debugLine="SetHasChildrenField(\"hasChildren\")";
_sethaschildrenfield("hasChildren");
 //BA.debugLineNum = 37;BA.debugLine="SetImageCssClassField(\"imageCssClass\")";
_setimagecssclassfield("imageCssClass");
 //BA.debugLineNum = 38;BA.debugLine="SetImageHtmlField(\"imageHtml\")";
_setimagehtmlfield("imageHtml");
 //BA.debugLineNum = 39;BA.debugLine="SetImageUrlField(\"imageUrl\")";
_setimageurlfield("imageUrl");
 //BA.debugLineNum = 40;BA.debugLine="SetTextField(\"text\")";
_settextfield("text");
 //BA.debugLineNum = 41;BA.debugLine="SetPrimaryKey(priKey)";
_setprimarykey(_prikey);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 196;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
anywheresoftware.b4a.objects.collections.Map _e = null;
anywheresoftware.b4a.objects.collections.Map _node = null;
anywheresoftware.b4a.objects.collections.Map _record = null;
anywheresoftware.b4a.objects.collections.Map _sid = null;
anywheresoftware.b4a.objects.collections.Map _state = null;
 //BA.debugLineNum = 229;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 230;BA.debugLine="If treeBO <> Null Then Destroy";
if (_treebo!= null) { 
_destroy();};
 //BA.debugLineNum = 232;BA.debugLine="treeBO = JQ.Selector($\"#${ID}\"$).RunMethod(\"tree\"";
_treebo = _jq.Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(_id))+""))).RunMethod("tree",(Object)(new Object[]{(Object)(_options.getObject())}));
 //BA.debugLineNum = 234;BA.debugLine="Dim e, node, record, sID, state As Map  'ignore";
_e = new anywheresoftware.b4a.objects.collections.Map();
_node = new anywheresoftware.b4a.objects.collections.Map();
_record = new anywheresoftware.b4a.objects.collections.Map();
_sid = new anywheresoftware.b4a.objects.collections.Map();
_state = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 237;BA.debugLine="treeBO.RunMethod(\"bind\", Array(\"select\", BANano.C";
_treebo.RunMethod("bind",(Object)(new Object[]{(Object)("select"),_banano.CallBack(_eventhandler,_id+"_select",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e.getObject()),(Object)(_node.getObject()),(Object)(_sid.getObject())}))}));
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _reload() throws Exception{
 //BA.debugLineNum = 440;BA.debugLine="Sub Reload()";
 //BA.debugLineNum = 441;BA.debugLine="treeBO.RunMethod(\"reload\", \"\")";
_treebo.RunMethod("reload",(Object)(""));
 //BA.debugLineNum = 442;BA.debugLine="End Sub";
return "";
}
public String  _removechildren(String _parentid) throws Exception{
anywheresoftware.b4a.objects.collections.List _children = null;
int _tchild = 0;
int _cchild = 0;
String _strchild = "";
 //BA.debugLineNum = 481;BA.debugLine="Sub RemoveChildren(parentID As String)";
 //BA.debugLineNum = 483;BA.debugLine="Dim children As List = GetChildren(parentID)";
_children = new anywheresoftware.b4a.objects.collections.List();
_children = _getchildren(_parentid);
 //BA.debugLineNum = 484;BA.debugLine="Dim tChild As Int = children.Size - 1";
_tchild = (int) (_children.getSize()-1);
 //BA.debugLineNum = 485;BA.debugLine="Dim cChild As Int";
_cchild = 0;
 //BA.debugLineNum = 486;BA.debugLine="For cChild = tChild To 0 Step -1";
{
final int step4 = -1;
final int limit4 = (int) (0);
_cchild = _tchild ;
for (;_cchild >= limit4 ;_cchild = _cchild + step4 ) {
 //BA.debugLineNum = 487;BA.debugLine="Dim strChild As String = children.Get(cChild)";
_strchild = BA.ObjectToString(_children.Get(_cchild));
 //BA.debugLineNum = 488;BA.debugLine="RemoveNode(strChild)";
_removenode(_strchild);
 }
};
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return "";
}
public String  _removenode(String _pk) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub RemoveNode(pk As String)";
 //BA.debugLineNum = 400;BA.debugLine="Try";
try { //BA.debugLineNum = 401;BA.debugLine="treeBO.RunMethod(\"removeNode\", GetNodeById(pk))";
_treebo.RunMethod("removeNode",(Object)(_getnodebyid(_pk).getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 403;BA.debugLine="Log(\"Error removing node\")";
__c.Log("Error removing node");
 };
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub Render";
 //BA.debugLineNum = 191;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _selectnode(String _pk) throws Exception{
com.ab.banano.BANanoObject _rec = null;
 //BA.debugLineNum = 418;BA.debugLine="Sub SelectNode(pk As String)";
 //BA.debugLineNum = 419;BA.debugLine="UnSelectAll";
_unselectall();
 //BA.debugLineNum = 420;BA.debugLine="Dim rec As BANanoObject = GetNodeById(pk)";
_rec = new com.ab.banano.BANanoObject();
_rec = _getnodebyid(_pk);
 //BA.debugLineNum = 421;BA.debugLine="treeBO.RunMethod(\"select\", Array(rec))";
_treebo.RunMethod("select",(Object)(new Object[]{(Object)(_rec.getObject())}));
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetAttr(attr As Map) As VMTree";
 //BA.debugLineNum = 207;BA.debugLine="Tree.SetAttr(attr)";
_tree._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setautoload(boolean _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetAutoLoad(b As Boolean) As VMTree";
 //BA.debugLineNum = 63;BA.debugLine="options.Put(\"autoLoad\", b)";
_options.Put((Object)("autoLoad"),(Object)(_b));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setborder(boolean _b) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetBorder(b As Boolean) As VMTree";
 //BA.debugLineNum = 73;BA.debugLine="options.Put(\"border\", b)";
_options.Put((Object)("border"),(Object)(_b));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setcascadecheck(boolean _b) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetCascadeCheck(b As Boolean) As VMTree";
 //BA.debugLineNum = 78;BA.debugLine="options.Put(\"cascadeCheck\", b)";
_options.Put((Object)("cascadeCheck"),(Object)(_b));
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setcheckboxes(boolean _b) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetCheckboxes(b As Boolean) As VMTree";
 //BA.debugLineNum = 83;BA.debugLine="options.put(\"checkboxes\", b)";
_options.Put((Object)("checkboxes"),(Object)(_b));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setcheckedfield(String _checkedfield) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetCheckedField(checkedField As String) As VMT";
 //BA.debugLineNum = 88;BA.debugLine="options.Put(\"checkedField\", checkedField)";
_options.Put((Object)("checkedField"),(Object)(_checkedfield));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setchildrenfield(String _childrenfield) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetChildrenField(childrenField As String) As V";
 //BA.debugLineNum = 93;BA.debugLine="options.Put(\"childrenField\", childrenField)";
_options.Put((Object)("childrenField"),(Object)(_childrenfield));
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public String  _setdata(String _pk,anywheresoftware.b4a.objects.collections.Map _tag) throws Exception{
com.ab.banano.BANanoObject _nod = null;
String _strkey = "";
Object _strval = null;
 //BA.debugLineNum = 337;BA.debugLine="Sub SetData(pk As String, Tag As Map)";
 //BA.debugLineNum = 338;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(_getdatabyid(_pk).getObject()));
 //BA.debugLineNum = 339;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
 //BA.debugLineNum = 340;BA.debugLine="If Tag <> Null Then";
if (_tag!= null) { 
 //BA.debugLineNum = 341;BA.debugLine="For Each strKey As String In Tag.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _tag.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strkey = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 342;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
_strval = _tag.Get((Object)(_strkey));
 //BA.debugLineNum = 343;BA.debugLine="nod.SetField(strKey, strVal)";
_nod.SetField(_strkey,_strval);
 }
};
 };
 //BA.debugLineNum = 346;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
_treebo.RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _setdatasource(anywheresoftware.b4a.objects.collections.List _datasource) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetDataSource(dataSource As List) As VMTree";
 //BA.debugLineNum = 98;BA.debugLine="options.Put(\"dataSource\", dataSource)";
_options.Put((Object)("dataSource"),(Object)(_datasource.getObject()));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTree";
 //BA.debugLineNum = 47;BA.debugLine="Tree.SetDisabled(b)";
_tree._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setdisabledfield(String _disabledfield) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetDisabledField(disabledField As String) As V";
 //BA.debugLineNum = 103;BA.debugLine="options.Put(\"disabledField\", disabledField)";
_options.Put((Object)("disabledField"),(Object)(_disabledfield));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setdraganddrop(boolean _draganddrop) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetDragAndDrop(dragAndDrop As Boolean) As VMTr";
 //BA.debugLineNum = 108;BA.debugLine="options.Put(\"dragAndDrop\", dragAndDrop)";
_options.Put((Object)("dragAndDrop"),(Object)(_draganddrop));
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetElevation(e As Int) As VMTree";
 //BA.debugLineNum = 58;BA.debugLine="Tree.SetElevation(e)";
_tree._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _sethaschildrenfield(String _haschildrenfield) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetHasChildrenField(hasChildrenField As String";
 //BA.debugLineNum = 113;BA.debugLine="options.Put(\"hasChildrenField\", hasChildrenField)";
_options.Put((Object)("hasChildrenField"),(Object)(_haschildrenfield));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public String  _seticon(String _pk,String _icon) throws Exception{
com.ab.banano.BANanoObject _nod = null;
String _sicon = "";
 //BA.debugLineNum = 312;BA.debugLine="Sub SetIcon(pk As String, Icon As String)";
 //BA.debugLineNum = 313;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(_getdatabyid(_pk).getObject()));
 //BA.debugLineNum = 314;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
 //BA.debugLineNum = 315;BA.debugLine="Dim sIcon As String = \"\"";
_sicon = "";
 //BA.debugLineNum = 316;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 318;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
_sicon = ("<i class=\"material-icons\">"+__c.SmartStringFormatter("",(Object)(_icon))+"</i>");
 break; }
case 1: {
 //BA.debugLineNum = 320;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
_sicon = ("<i class=\""+__c.SmartStringFormatter("",(Object)(_icon))+"\"></i>");
 break; }
}
;
 //BA.debugLineNum = 322;BA.debugLine="nod.SetField(ImageHtmlField, sIcon)";
_nod.SetField(_imagehtmlfield,(Object)(_sicon));
 //BA.debugLineNum = 323;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
_treebo.RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _seticonslibrary(String _siconslibrary) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetIconsLibrary(sIconsLibrary As String) As VM";
 //BA.debugLineNum = 118;BA.debugLine="IconsLibrary = sIconsLibrary";
_iconslibrary = _siconslibrary;
 //BA.debugLineNum = 119;BA.debugLine="options.Put(\"iconsLibrary\", IconsLibrary)";
_options.Put((Object)("iconsLibrary"),(Object)(_iconslibrary));
 //BA.debugLineNum = 120;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 122;BA.debugLine="ExpandIcon = $\"<i class=\"material-icons\">keyboar";
_expandicon = ("<i class=\"material-icons\">keyboard_arrow_right</i>");
 //BA.debugLineNum = 123;BA.debugLine="CollapseIcon = $\"<i class=\"material-icons\">keybo";
_collapseicon = ("<i class=\"material-icons\">keyboard_arrow_down</i>");
 break; }
case 1: {
 //BA.debugLineNum = 125;BA.debugLine="ExpandIcon = $\"<i class=\"fa fa-chevron-right\"></";
_expandicon = ("<i class=\"fa fa-chevron-right\"></i>");
 //BA.debugLineNum = 126;BA.debugLine="CollapseIcon = $\"<i class=\"fa fa-chevron-down\"><";
_collapseicon = ("<i class=\"fa fa-chevron-down\"></i>");
 break; }
}
;
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public String  _setimage(String _pk,String _imageurl) throws Exception{
com.ab.banano.BANanoObject _nod = null;
 //BA.debugLineNum = 328;BA.debugLine="Sub SetImage(pk As String, ImageURL As String)";
 //BA.debugLineNum = 329;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(_getdatabyid(_pk).getObject()));
 //BA.debugLineNum = 330;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
 //BA.debugLineNum = 331;BA.debugLine="nod.SetField(ImageUrlField, ImageURL)";
_nod.SetField(_imageurlfield,(Object)(_imageurl));
 //BA.debugLineNum = 332;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
_treebo.RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _setimagecssclassfield(String _imagecssclassfield) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetImageCssClassField(imageCssClassField As St";
 //BA.debugLineNum = 132;BA.debugLine="options.Put(\"imageCssClassField\", imageCssClassFi";
_options.Put((Object)("imageCssClassField"),(Object)(_imagecssclassfield));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setimagehtmlfield(String _simagehtmlfield) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetImageHtmlField(sImageHtmlField As String) A";
 //BA.debugLineNum = 137;BA.debugLine="ImageHtmlField = sImageHtmlField";
_imagehtmlfield = _simagehtmlfield;
 //BA.debugLineNum = 138;BA.debugLine="options.Put(\"imageHtmlField\", ImageHtmlField)";
_options.Put((Object)("imageHtmlField"),(Object)(_imagehtmlfield));
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setimageurlfield(String _simageurlfield) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetImageUrlField(sImageUrlField As String) As";
 //BA.debugLineNum = 143;BA.debugLine="ImageUrlField = sImageUrlField";
_imageurlfield = _simageurlfield;
 //BA.debugLineNum = 144;BA.debugLine="options.Put(\"imageUrlField\", ImageUrlField)";
_options.Put((Object)("imageUrlField"),(Object)(_imageurlfield));
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setlazyloading(boolean _lazyloading) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetLazyLoading(lazyLoading As Boolean) As VMTr";
 //BA.debugLineNum = 149;BA.debugLine="options.Put(\"lazyLoading\", lazyLoading)";
_options.Put((Object)("lazyLoading"),(Object)(_lazyloading));
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetPadding(p As Object) As VMTree";
 //BA.debugLineNum = 219;BA.debugLine="Tree.SetPaddingAll(p)";
_tree._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setprimarykey(String _primarykey) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetPrimaryKey(primaryKey As String) As VMTree";
 //BA.debugLineNum = 154;BA.debugLine="options.Put(\"primaryKey\", primaryKey)";
_options.Put((Object)("primaryKey"),(Object)(_primarykey));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setselectiontype(String _selectiontype) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetSelectionType(selectionType As String) As V";
 //BA.debugLineNum = 159;BA.debugLine="options.Put(\"selectionType\", selectionType)";
_options.Put((Object)("selectionType"),(Object)(_selectiontype));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetStyle(sm As Map) As VMTree";
 //BA.debugLineNum = 213;BA.debugLine="Tree.SetStyle(sm)";
_tree._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public String  _settext(String _pk,String _text) throws Exception{
com.ab.banano.BANanoObject _nod = null;
 //BA.debugLineNum = 303;BA.debugLine="Sub SetText(pk As String, Text As String)";
 //BA.debugLineNum = 304;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(_getdatabyid(_pk).getObject()));
 //BA.debugLineNum = 305;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
 //BA.debugLineNum = 306;BA.debugLine="nod.SetField(\"text\", Text)";
_nod.SetField("text",(Object)(_text));
 //BA.debugLineNum = 307;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
_treebo.RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtree  _settextfield(String _textfield) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetTextField(textField As String) As VMTree";
 //BA.debugLineNum = 164;BA.debugLine="options.Put(\"textField\", textField)";
_options.Put((Object)("textField"),(Object)(_textfield));
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setuilibrary(String _uilibrary) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetUiLibrary(uiLibrary As String) As VMTree";
 //BA.debugLineNum = 169;BA.debugLine="options.Put(\"uiLibrary\", uiLibrary)";
_options.Put((Object)("uiLibrary"),(Object)(_uilibrary));
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub SetVModel(k As String) As VMTree";
 //BA.debugLineNum = 185;BA.debugLine="Tree.SetVModel(k)";
_tree._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetVShow(vif As String) As VMTree";
 //BA.debugLineNum = 52;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtree)(this);};
 //BA.debugLineNum = 53;BA.debugLine="Tree.SetVShow(vif)";
_tree._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtree  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetWidth(w As String) As VMTree";
 //BA.debugLineNum = 68;BA.debugLine="options.Put(\"width\", w)";
_options.Put((Object)("width"),(Object)(_w));
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtree)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
anywheresoftware.b4a.objects.collections.Map _icn = null;
 //BA.debugLineNum = 175;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 176;BA.debugLine="Dim icn As Map";
_icn = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 177;BA.debugLine="icn.Initialize";
_icn.Initialize();
 //BA.debugLineNum = 178;BA.debugLine="icn.Put(\"expand\", ExpandIcon)";
_icn.Put((Object)("expand"),(Object)(_expandicon));
 //BA.debugLineNum = 179;BA.debugLine="icn.Put(\"collapse\", CollapseIcon)";
_icn.Put((Object)("collapse"),(Object)(_collapseicon));
 //BA.debugLineNum = 180;BA.debugLine="options.Put(\"icons\", icn)";
_options.Put((Object)("icons"),(Object)(_icn.getObject()));
 //BA.debugLineNum = 181;BA.debugLine="Return Tree.ToString";
if (true) return _tree._tostring /*String*/ ();
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _uncheck(String _pk) throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Sub UnCheck(pk As String)";
 //BA.debugLineNum = 414;BA.debugLine="treeBO.RunMethod(\"uncheck\", Array(GetNodeById(pk)";
_treebo.RunMethod("uncheck",(Object)(new Object[]{(Object)(_getnodebyid(_pk).getObject())}));
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return "";
}
public String  _uncheckall() throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub UnCheckAll()";
 //BA.debugLineNum = 456;BA.debugLine="treeBO.RunMethod(\"uncheckAll\", \"\")";
_treebo.RunMethod("uncheckAll",(Object)(""));
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return "";
}
public String  _unselectall() throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub UnSelectAll";
 //BA.debugLineNum = 501;BA.debugLine="treeBO.RunMethod(\"unselectAll\", Null)";
_treebo.RunMethod("unselectAll",__c.Null);
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return "";
}
public String  _unselectnode(String _pk) throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Sub UnSelectNode(pk As String)";
 //BA.debugLineNum = 426;BA.debugLine="treeBO.RunMethod(\"unselect\", Array(GetNodeById(pk";
_treebo.RunMethod("unselect",(Object)(new Object[]{(Object)(_getnodebyid(_pk).getObject())}));
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public String  _updatenode(String _pk,String _text,String _imgurl,String _icon,anywheresoftware.b4a.objects.collections.Map _tag) throws Exception{
com.ab.banano.BANanoObject _nod = null;
String _strkey = "";
Object _strval = null;
String _sicon = "";
 //BA.debugLineNum = 351;BA.debugLine="Sub UpdateNode(pk As String, Text As String, ImgUR";
 //BA.debugLineNum = 352;BA.debugLine="Dim nod As BANanoObject = GetDataById(pk)";
_nod = new com.ab.banano.BANanoObject();
_nod.setObject((java.lang.Object)(_getdatabyid(_pk).getObject()));
 //BA.debugLineNum = 353;BA.debugLine="If nod <> Null Then";
if (_nod!= null) { 
 //BA.debugLineNum = 354;BA.debugLine="nod.SetField(\"text\", Text)";
_nod.SetField("text",(Object)(_text));
 //BA.debugLineNum = 355;BA.debugLine="If Tag <> Null Then";
if (_tag!= null) { 
 //BA.debugLineNum = 356;BA.debugLine="For Each strKey As String In Tag.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _tag.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strkey = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 357;BA.debugLine="Dim strVal As Object = Tag.Get(strKey)";
_strval = _tag.Get((Object)(_strkey));
 //BA.debugLineNum = 358;BA.debugLine="nod.SetField(strKey, strVal)";
_nod.SetField(_strkey,_strval);
 }
};
 };
 //BA.debugLineNum = 361;BA.debugLine="Dim sIcon As String = \"\"";
_sicon = "";
 //BA.debugLineNum = 362;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 364;BA.debugLine="sIcon = $\"<i class=\"material-icons\">${Icon}</i";
_sicon = ("<i class=\"material-icons\">"+__c.SmartStringFormatter("",(Object)(_icon))+"</i>");
 break; }
case 1: {
 //BA.debugLineNum = 366;BA.debugLine="sIcon = $\"<i class=\"${Icon}\"></i>\"$";
_sicon = ("<i class=\""+__c.SmartStringFormatter("",(Object)(_icon))+"\"></i>");
 break; }
}
;
 //BA.debugLineNum = 368;BA.debugLine="If ImgURL.Length > 0 Then nod.SetField(ImageUrlF";
if (_imgurl.length()>0) { 
_nod.SetField(_imageurlfield,(Object)(_sicon));};
 //BA.debugLineNum = 369;BA.debugLine="If Icon.Length > 0 Then nod.SetField(ImageHtmlFi";
if (_icon.length()>0) { 
_nod.SetField(_imagehtmlfield,(Object)(_imgurl));};
 //BA.debugLineNum = 370;BA.debugLine="treeBO.RunMethod(\"updateNode\", Array(pk, nod))";
_treebo.RunMethod("updateNode",(Object)(new Object[]{(Object)(_pk),(Object)(_nod.getObject())}));
 };
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
