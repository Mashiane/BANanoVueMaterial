package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfmaker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfmaker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfmaker.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public anywheresoftware.b4a.objects.collections.Map _docdefinition = null;
public anywheresoftware.b4a.objects.collections.List _content = null;
public b4j.example.pdfstyle _defaultstyle = null;
public com.ab.banano.BANanoObject _pdf = null;
public com.ab.banano.BANano _banano = null;
public String _pagesize = "";
public String _pageorientation = "";
public String _title = "";
public String _author = "";
public String _subject = "";
public String _keywords = "";
public String _creator = "";
public String _producer = "";
public anywheresoftware.b4a.objects.collections.Map _info = null;
public boolean _compress = false;
public b4j.example.pdfsecurity _security = null;
public String _parentid = "";
public String _fname = "";
public anywheresoftware.b4a.objects.collections.Map _blobs = null;
public int _numfiles = 0;
public anywheresoftware.b4a.objects.collections.Map _files = null;
public anywheresoftware.b4a.objects.collections.Map _images = null;
public anywheresoftware.b4a.objects.collections.Map _filekeys = null;
public String _action = "";
public Object _eventhandler = null;
public String _eventmethod = "";
public String _mjson = "";
public String _mjsonpretty = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.pdfmaker  _addcolumns(b4j.example.pdfmaker __ref,b4j.example.pdfcolumns _cols) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addcolumns", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addcolumns", new Object[] {_cols}));}
RDebugUtils.currentLine=52822016;
 //BA.debugLineNum = 52822016;BA.debugLine="Sub AddColumns(cols As PDFColumns) As PDFMaker";
RDebugUtils.currentLine=52822018;
 //BA.debugLineNum = 52822018;BA.debugLine="content.Add(cols.content)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cols._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52822019;
 //BA.debugLineNum = 52822019;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52822020;
 //BA.debugLineNum = 52822020;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addfooter(b4j.example.pdfmaker __ref,b4j.example.pdffooter _ftr) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addfooter", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addfooter", new Object[] {_ftr}));}
RDebugUtils.currentLine=52887552;
 //BA.debugLineNum = 52887552;BA.debugLine="Sub AddFooter(ftr As PDFFooter) As PDFMaker";
RDebugUtils.currentLine=52887554;
 //BA.debugLineNum = 52887554;BA.debugLine="docDefinition.Put(\"footer\", ftr.content)";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("footer"),(Object)(_ftr._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52887555;
 //BA.debugLineNum = 52887555;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52887556;
 //BA.debugLineNum = 52887556;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addimage(b4j.example.pdfmaker __ref,b4j.example.pdfimage _img) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addimage", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addimage", new Object[] {_img}));}
RDebugUtils.currentLine=52494336;
 //BA.debugLineNum = 52494336;BA.debugLine="Sub AddImage(img As PDFImage) As PDFMaker";
RDebugUtils.currentLine=52494338;
 //BA.debugLineNum = 52494338;BA.debugLine="content.Add(img.Content)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_img._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52494339;
 //BA.debugLineNum = 52494339;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52494340;
 //BA.debugLineNum = 52494340;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addlist(b4j.example.pdfmaker __ref,b4j.example.pdflist _lstof) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addlist", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addlist", new Object[] {_lstof}));}
RDebugUtils.currentLine=53542912;
 //BA.debugLineNum = 53542912;BA.debugLine="Sub AddList(lstOf As PDFList) As PDFMaker";
RDebugUtils.currentLine=53542914;
 //BA.debugLineNum = 53542914;BA.debugLine="content.Add(lstOf.Content)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lstof._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=53542915;
 //BA.debugLineNum = 53542915;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=53542916;
 //BA.debugLineNum = 53542916;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addparagraphs(b4j.example.pdfmaker __ref,b4j.example.pdfparagraphs _stack) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addparagraphs", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addparagraphs", new Object[] {_stack}));}
RDebugUtils.currentLine=53084160;
 //BA.debugLineNum = 53084160;BA.debugLine="Sub AddParagraphs(stack As PDFParagraphs) As PDFMa";
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="content.Add(stack.Content)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=53084163;
 //BA.debugLineNum = 53084163;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=53084164;
 //BA.debugLineNum = 53084164;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addqrcode(b4j.example.pdfmaker __ref,b4j.example.pdfqrcode _qrcode) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addqrcode", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addqrcode", new Object[] {_qrcode}));}
RDebugUtils.currentLine=53018624;
 //BA.debugLineNum = 53018624;BA.debugLine="Sub AddQRCode(qrCode As PDFQRCode) As PDFMaker";
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="content.Add(qrCode.Content)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_qrcode._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=53018627;
 //BA.debugLineNum = 53018627;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=53018628;
 //BA.debugLineNum = 53018628;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addstack(b4j.example.pdfmaker __ref,b4j.example.pdfstack _stack) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addstack", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addstack", new Object[] {_stack}));}
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Sub AddStack(stack As PDFStack) As PDFMaker";
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="content.Add(stack.Content)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52953091;
 //BA.debugLineNum = 52953091;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52953092;
 //BA.debugLineNum = 52953092;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addstring(b4j.example.pdfmaker __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addstring", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addstring", new Object[] {_txt}));}
RDebugUtils.currentLine=53149696;
 //BA.debugLineNum = 53149696;BA.debugLine="Sub AddString(txt As String) As PDFMaker";
RDebugUtils.currentLine=53149698;
 //BA.debugLineNum = 53149698;BA.debugLine="content.Add(txt)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt));
RDebugUtils.currentLine=53149699;
 //BA.debugLineNum = 53149699;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=53149700;
 //BA.debugLineNum = 53149700;BA.debugLine="End Sub";
return null;
}
public String  _addstyle(b4j.example.pdfmaker __ref,b4j.example.pdfstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addstyle", true))
	 {return ((String) Debug.delegate(ba, "addstyle", new Object[] {_style}));}
String _name = "";
anywheresoftware.b4a.objects.collections.Map _stylecontent = null;
RDebugUtils.currentLine=53870592;
 //BA.debugLineNum = 53870592;BA.debugLine="Sub AddStyle(style As PDFStyle)";
RDebugUtils.currentLine=53870594;
 //BA.debugLineNum = 53870594;BA.debugLine="Dim name As String = style.name";
_name = _style._name /*String*/ ;
RDebugUtils.currentLine=53870595;
 //BA.debugLineNum = 53870595;BA.debugLine="Dim stylecontent As Map = style.content";
_stylecontent = new anywheresoftware.b4a.objects.collections.Map();
_stylecontent = _style._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=53870596;
 //BA.debugLineNum = 53870596;BA.debugLine="styles.Put(name, stylecontent)";
__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_name),(Object)(_stylecontent.getObject()));
RDebugUtils.currentLine=53870597;
 //BA.debugLineNum = 53870597;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _addtable(b4j.example.pdfmaker __ref,b4j.example.pdftable _tbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addtable", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addtable", new Object[] {_tbl}));}
RDebugUtils.currentLine=52559872;
 //BA.debugLineNum = 52559872;BA.debugLine="Sub AddTable(tbl As PDFTable) As PDFMaker";
RDebugUtils.currentLine=52559874;
 //BA.debugLineNum = 52559874;BA.debugLine="content.Add(tbl.Content)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tbl._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52559875;
 //BA.debugLineNum = 52559875;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52559876;
 //BA.debugLineNum = 52559876;BA.debugLine="End Sub";
return null;
}
public String  _addtext(b4j.example.pdfmaker __ref,b4j.example.pdftext _currentcontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addtext", true))
	 {return ((String) Debug.delegate(ba, "addtext", new Object[] {_currentcontent}));}
anywheresoftware.b4a.objects.collections.Map _text = null;
RDebugUtils.currentLine=53936128;
 //BA.debugLineNum = 53936128;BA.debugLine="Sub AddText(currentContent As PDFText)";
RDebugUtils.currentLine=53936130;
 //BA.debugLineNum = 53936130;BA.debugLine="Dim text As Map = currentContent.Content";
_text = new anywheresoftware.b4a.objects.collections.Map();
_text = _currentcontent._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=53936131;
 //BA.debugLineNum = 53936131;BA.debugLine="content.Add(text)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_text.getObject()));
RDebugUtils.currentLine=53936132;
 //BA.debugLineNum = 53936132;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _addtoc(b4j.example.pdfmaker __ref,b4j.example.pdftoc _toc) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "addtoc", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "addtoc", new Object[] {_toc}));}
RDebugUtils.currentLine=52101120;
 //BA.debugLineNum = 52101120;BA.debugLine="Sub AddToC(toc As PDFToC) As PDFMaker";
RDebugUtils.currentLine=52101122;
 //BA.debugLineNum = 52101122;BA.debugLine="content.Add(toc.Content)";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_toc._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52101123;
 //BA.debugLineNum = 52101123;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52101124;
 //BA.debugLineNum = 52101124;BA.debugLine="End Sub";
return null;
}
public String  _build(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "build", true))
	 {return ((String) Debug.delegate(ba, "build", null));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=54198272;
 //BA.debugLineNum = 54198272;BA.debugLine="private Sub Build";
RDebugUtils.currentLine=54198274;
 //BA.debugLineNum = 54198274;BA.debugLine="If pageSize <> Null Then docDefinition.Put(\"pageS";
if (__ref._pagesize /*String*/ != null) { 
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageSize"),(Object)(__ref._pagesize /*String*/ ));};
RDebugUtils.currentLine=54198275;
 //BA.debugLineNum = 54198275;BA.debugLine="If pageOrientation <> Null Then docDefinition.Put";
if (__ref._pageorientation /*String*/ != null) { 
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageOrientation"),(Object)(__ref._pageorientation /*String*/ ));};
RDebugUtils.currentLine=54198276;
 //BA.debugLineNum = 54198276;BA.debugLine="docDefinition.Put(\"content\", content)";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("content"),(Object)(__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=54198277;
 //BA.debugLineNum = 54198277;BA.debugLine="docDefinition.Put(\"styles\", styles)";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("styles"),(Object)(__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=54198278;
 //BA.debugLineNum = 54198278;BA.debugLine="If title <> Null Then info.Put(\"Title\", title)";
if (__ref._title /*String*/ != null) { 
__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Title"),(Object)(__ref._title /*String*/ ));};
RDebugUtils.currentLine=54198279;
 //BA.debugLineNum = 54198279;BA.debugLine="If author <> Null Then info.Put(\"Author\", author)";
if (__ref._author /*String*/ != null) { 
__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Author"),(Object)(__ref._author /*String*/ ));};
RDebugUtils.currentLine=54198280;
 //BA.debugLineNum = 54198280;BA.debugLine="If subject <> Null Then info.Put(\"Subject\", subje";
if (__ref._subject /*String*/ != null) { 
__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Subject"),(Object)(__ref._subject /*String*/ ));};
RDebugUtils.currentLine=54198281;
 //BA.debugLineNum = 54198281;BA.debugLine="If keywords <> Null Then info.Put(\"Keywords\", key";
if (__ref._keywords /*String*/ != null) { 
__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Keywords"),(Object)(__ref._keywords /*String*/ ));};
RDebugUtils.currentLine=54198282;
 //BA.debugLineNum = 54198282;BA.debugLine="If creator <> Null Then info.Put(\"Creator\", creat";
if (__ref._creator /*String*/ != null) { 
__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Creator"),(Object)(__ref._creator /*String*/ ));};
RDebugUtils.currentLine=54198283;
 //BA.debugLineNum = 54198283;BA.debugLine="If producer <> Null Then info.Put(\"Producer\", pro";
if (__ref._producer /*String*/ != null) { 
__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Producer"),(Object)(__ref._producer /*String*/ ));};
RDebugUtils.currentLine=54198284;
 //BA.debugLineNum = 54198284;BA.debugLine="If info.Size > 0 Then docDefinition.Put(\"info\", i";
if (__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("info"),(Object)(__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=54198285;
 //BA.debugLineNum = 54198285;BA.debugLine="If compress <> Null Then docDefinition.Put(\"compr";
if (__ref._compress /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("compress"),(Object)(__ref._compress /*boolean*/ ));};
RDebugUtils.currentLine=54198286;
 //BA.debugLineNum = 54198286;BA.debugLine="If security.userPassword <> Null Then docDefiniti";
if (__ref._security /*b4j.example.pdfsecurity*/ ._userpassword /*String*/ != null) { 
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("userPassword"),(Object)(__ref._security /*b4j.example.pdfsecurity*/ ._userpassword /*String*/ ));};
RDebugUtils.currentLine=54198287;
 //BA.debugLineNum = 54198287;BA.debugLine="If security.ownerPassword <> Null Then docDefinit";
if (__ref._security /*b4j.example.pdfsecurity*/ ._ownerpassword /*String*/ != null) { 
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ownerPassword"),(Object)(__ref._security /*b4j.example.pdfsecurity*/ ._ownerpassword /*String*/ ));};
RDebugUtils.currentLine=54198288;
 //BA.debugLineNum = 54198288;BA.debugLine="docDefinition.Put(\"permissions\", security.content";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("permissions"),(Object)(__ref._security /*b4j.example.pdfsecurity*/ ._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=54198289;
 //BA.debugLineNum = 54198289;BA.debugLine="docDefinition.Put(\"defaultStyle\", defaultStyle.co";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("defaultStyle"),(Object)(__ref._defaultstyle /*b4j.example.pdfstyle*/ ._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=54198290;
 //BA.debugLineNum = 54198290;BA.debugLine="If files.Size > 0 Then";
if (__ref._files /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=54198291;
 //BA.debugLineNum = 54198291;BA.debugLine="For Each k As String In files.Keys";
{
final anywheresoftware.b4a.BA.IterableList group18 = __ref._files /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_k = BA.ObjectToString(group18.Get(index18));
RDebugUtils.currentLine=54198293;
 //BA.debugLineNum = 54198293;BA.debugLine="Dim v As String = files.Get(k)";
_v = BA.ObjectToString(__ref._files /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
RDebugUtils.currentLine=54198294;
 //BA.debugLineNum = 54198294;BA.debugLine="GetFileFromServer(v)";
__ref._getfilefromserver /*String*/ (null,_v);
 }
};
 }else {
RDebugUtils.currentLine=54198297;
 //BA.debugLineNum = 54198297;BA.debugLine="FilesAreReady";
__ref._filesareready /*String*/ (null);
 };
RDebugUtils.currentLine=54198299;
 //BA.debugLineNum = 54198299;BA.debugLine="End Sub";
return "";
}
public String  _getfilefromserver(b4j.example.pdfmaker __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getfilefromserver", true))
	 {return ((String) Debug.delegate(ba, "getfilefromserver", new Object[] {_filename}));}
com.ab.banano.BANanoFetchResponse _response = null;
com.ab.banano.BANanoObject _blob = null;
com.ab.banano.BANanoFetch _fetch1 = null;
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoEvent _event = null;
com.ab.banano.BANanoObject _target = null;
String _dataurl = "";
RDebugUtils.currentLine=54394880;
 //BA.debugLineNum = 54394880;BA.debugLine="private Sub GetFileFromServer(FileName As String)";
RDebugUtils.currentLine=54394882;
 //BA.debugLineNum = 54394882;BA.debugLine="Dim Response As BANanoFetchResponse";
_response = new com.ab.banano.BANanoFetchResponse();
RDebugUtils.currentLine=54394883;
 //BA.debugLineNum = 54394883;BA.debugLine="Dim Blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=54394886;
 //BA.debugLineNum = 54394886;BA.debugLine="Dim fetch1 As BANanoFetch";
_fetch1 = new com.ab.banano.BANanoFetch();
RDebugUtils.currentLine=54394887;
 //BA.debugLineNum = 54394887;BA.debugLine="fetch1.Initialize(FileName, Null)";
_fetch1.Initialize(_filename,(com.ab.banano.BANanoFetchOptions)(__c.Null));
RDebugUtils.currentLine=54394888;
 //BA.debugLineNum = 54394888;BA.debugLine="fetch1.Then(Response)";
_fetch1.Then((Object)(_response));
RDebugUtils.currentLine=54394890;
 //BA.debugLineNum = 54394890;BA.debugLine="fetch1.Return(Response.Blob)";
_fetch1.Return(_response.Blob());
RDebugUtils.currentLine=54394891;
 //BA.debugLineNum = 54394891;BA.debugLine="fetch1.Then(Blob)";
_fetch1.Then((Object)(_blob.getObject()));
RDebugUtils.currentLine=54394894;
 //BA.debugLineNum = 54394894;BA.debugLine="Dim FileReader As BANanoObject";
_filereader = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=54394895;
 //BA.debugLineNum = 54394895;BA.debugLine="FileReader.Initialize2(\"FileReader\", Null)";
_filereader.Initialize2("FileReader",__c.Null);
RDebugUtils.currentLine=54394896;
 //BA.debugLineNum = 54394896;BA.debugLine="Dim event As BANanoEvent";
_event = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=54394898;
 //BA.debugLineNum = 54394898;BA.debugLine="FileReader.AddEventListenerOpen(\"onload\", Array(e";
_filereader.AddEventListenerOpen("onload",(Object)(new Object[]{(Object)(_event)}));
RDebugUtils.currentLine=54394900;
 //BA.debugLineNum = 54394900;BA.debugLine="Dim Target As BANanoObject = event.OtherField(\"ta";
_target = new com.ab.banano.BANanoObject();
_target = _event.OtherField("target");
RDebugUtils.currentLine=54394901;
 //BA.debugLineNum = 54394901;BA.debugLine="Dim DataUrl As String = Target.GetField(\"result\")";
_dataurl = BA.ObjectToString(_target.GetField("result").Result());
RDebugUtils.currentLine=54394903;
 //BA.debugLineNum = 54394903;BA.debugLine="Blobs.Put(FileName, DataUrl)";
__ref._blobs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_filename),(Object)(_dataurl));
RDebugUtils.currentLine=54394905;
 //BA.debugLineNum = 54394905;BA.debugLine="If Blobs.Size = NumFiles Then";
if (__ref._blobs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==__ref._numfiles /*int*/ ) { 
RDebugUtils.currentLine=54394906;
 //BA.debugLineNum = 54394906;BA.debugLine="FilesAreReady";
__ref._filesareready /*String*/ (null);
 };
RDebugUtils.currentLine=54394909;
 //BA.debugLineNum = 54394909;BA.debugLine="FileReader.CloseEventListener";
_filereader.CloseEventListener();
RDebugUtils.currentLine=54394911;
 //BA.debugLineNum = 54394911;BA.debugLine="FileReader.RunMethod(\"readAsDataURL\", Blob)";
_filereader.RunMethod("readAsDataURL",(Object)(_blob.getObject()));
RDebugUtils.currentLine=54394912;
 //BA.debugLineNum = 54394912;BA.debugLine="fetch1.End ' always end a fetch with this!";
_fetch1.End();
RDebugUtils.currentLine=54394913;
 //BA.debugLineNum = 54394913;BA.debugLine="End Sub";
return "";
}
public String  _filesareready(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "filesareready", true))
	 {return ((String) Debug.delegate(ba, "filesareready", null));}
String _k = "";
String _v = "";
String _dataurl = "";
Object _data = null;
com.ab.banano.BANanoObject _res = null;
com.ab.banano.BANanoPromise _prom = null;
RDebugUtils.currentLine=54591488;
 //BA.debugLineNum = 54591488;BA.debugLine="private Sub FilesAreReady()";
RDebugUtils.currentLine=54591489;
 //BA.debugLineNum = 54591489;BA.debugLine="Try";
try {RDebugUtils.currentLine=54591491;
 //BA.debugLineNum = 54591491;BA.debugLine="If files.Size > 0 Then";
if (__ref._files /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=54591493;
 //BA.debugLineNum = 54591493;BA.debugLine="For Each k As String In Blobs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._blobs /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=54591495;
 //BA.debugLineNum = 54591495;BA.debugLine="Dim v As String = fileKeys.Get(k)";
_v = BA.ObjectToString(__ref._filekeys /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
RDebugUtils.currentLine=54591496;
 //BA.debugLineNum = 54591496;BA.debugLine="Dim DataUrl As String = Blobs.Get(k)";
_dataurl = BA.ObjectToString(__ref._blobs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
RDebugUtils.currentLine=54591497;
 //BA.debugLineNum = 54591497;BA.debugLine="images.Put(v, DataUrl)";
__ref._images /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_v),(Object)(_dataurl));
 }
};
RDebugUtils.currentLine=54591499;
 //BA.debugLineNum = 54591499;BA.debugLine="If images.Size > 0 Then docDefinition.Put(\"ima";
if (__ref._images /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("images"),(Object)(__ref._images /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
 };
RDebugUtils.currentLine=54591502;
 //BA.debugLineNum = 54591502;BA.debugLine="mJSON = BANano.ToJson(docDefinition)";
__ref._mjson /*String*/  = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=54591503;
 //BA.debugLineNum = 54591503;BA.debugLine="mJSONPretty = BANano.RunJavascriptMethod(\"JSON.st";
__ref._mjsonpretty /*String*/  = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("JSON.stringify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),__c.Null,(Object)(4)})));
RDebugUtils.currentLine=54591505;
 //BA.debugLineNum = 54591505;BA.debugLine="Dim data As Object";
_data = new Object();
RDebugUtils.currentLine=54591506;
 //BA.debugLineNum = 54591506;BA.debugLine="Dim res As BANanoObject";
_res = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=54591507;
 //BA.debugLineNum = 54591507;BA.debugLine="Dim prom As BANanoPromise";
_prom = new com.ab.banano.BANanoPromise();
RDebugUtils.currentLine=54591508;
 //BA.debugLineNum = 54591508;BA.debugLine="Select Case action";
switch (BA.switchObjectToInt(__ref._action /*String*/ ,"download","print","open","upload","getDataUrl","getBlob","getBuffer","getBase64")) {
case 0: {
RDebugUtils.currentLine=54591510;
 //BA.debugLineNum = 54591510;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
__ref._pdf /*com.ab.banano.BANanoObject*/ .RunMethod("createPdf",(Object)(__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())).RunMethod("download",(Object)(__ref._fname /*String*/ ));
 break; }
case 1: {
RDebugUtils.currentLine=54591512;
 //BA.debugLineNum = 54591512;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
__ref._pdf /*com.ab.banano.BANanoObject*/ .RunMethod("createPdf",(Object)(__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())).RunMethod("print",__c.Null);
 break; }
case 2: {
RDebugUtils.currentLine=54591514;
 //BA.debugLineNum = 54591514;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
__ref._pdf /*com.ab.banano.BANanoObject*/ .RunMethod("createPdf",(Object)(__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())).RunMethod("open",__c.Null);
 break; }
case 3: {
RDebugUtils.currentLine=54591516;
 //BA.debugLineNum = 54591516;BA.debugLine="res = pdf.RunMethod(\"createPdf\", docDefinition)";
_res = __ref._pdf /*com.ab.banano.BANanoObject*/ .RunMethod("createPdf",(Object)(__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=54591517;
 //BA.debugLineNum = 54591517;BA.debugLine="prom = res.RunMethod(\"getBlob\", data)";
_prom.setObject((java.lang.Object)(_res.RunMethod("getBlob",_data).getObject()));
RDebugUtils.currentLine=54591518;
 //BA.debugLineNum = 54591518;BA.debugLine="prom.Then(data)";
_prom.Then(_data);
RDebugUtils.currentLine=54591519;
 //BA.debugLineNum = 54591519;BA.debugLine="BANano.CallSub(Me, \"forUpload\", data)";
__ref._banano /*com.ab.banano.BANano*/ .CallSub(this,"forUpload",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
RDebugUtils.currentLine=54591520;
 //BA.debugLineNum = 54591520;BA.debugLine="prom.End";
_prom.End();
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
RDebugUtils.currentLine=54591522;
 //BA.debugLineNum = 54591522;BA.debugLine="res = pdf.RunMethod(\"createPdf\", docDefinition)";
_res = __ref._pdf /*com.ab.banano.BANanoObject*/ .RunMethod("createPdf",(Object)(__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=54591523;
 //BA.debugLineNum = 54591523;BA.debugLine="prom = res.RunMethod(action, data)";
_prom.setObject((java.lang.Object)(_res.RunMethod(__ref._action /*String*/ ,_data).getObject()));
RDebugUtils.currentLine=54591524;
 //BA.debugLineNum = 54591524;BA.debugLine="prom.Then(data)";
_prom.Then(_data);
RDebugUtils.currentLine=54591525;
 //BA.debugLineNum = 54591525;BA.debugLine="BANano.CallSub(Me, \"forReading\", data)";
__ref._banano /*com.ab.banano.BANano*/ .CallSub(this,"forReading",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
RDebugUtils.currentLine=54591526;
 //BA.debugLineNum = 54591526;BA.debugLine="prom.End";
_prom.End();
 break; }
}
;
 } 
       catch (Exception e36) {
			ba.setLastException(e36);RDebugUtils.currentLine=54591529;
 //BA.debugLineNum = 54591529;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=54591531;
 //BA.debugLineNum = 54591531;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
RDebugUtils.currentLine=50987008;
 //BA.debugLineNum = 50987008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=50987009;
 //BA.debugLineNum = 50987009;BA.debugLine="Private styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987010;
 //BA.debugLineNum = 50987010;BA.debugLine="Private docDefinition As Map";
_docdefinition = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987011;
 //BA.debugLineNum = 50987011;BA.debugLine="Private content As List";
_content = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50987012;
 //BA.debugLineNum = 50987012;BA.debugLine="Public defaultStyle As PDFStyle";
_defaultstyle = new b4j.example.pdfstyle();
RDebugUtils.currentLine=50987013;
 //BA.debugLineNum = 50987013;BA.debugLine="Private pdf As BANanoObject";
_pdf = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=50987014;
 //BA.debugLineNum = 50987014;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=50987015;
 //BA.debugLineNum = 50987015;BA.debugLine="Public pageSize As String";
_pagesize = "";
RDebugUtils.currentLine=50987016;
 //BA.debugLineNum = 50987016;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
RDebugUtils.currentLine=50987017;
 //BA.debugLineNum = 50987017;BA.debugLine="Public title As String";
_title = "";
RDebugUtils.currentLine=50987018;
 //BA.debugLineNum = 50987018;BA.debugLine="Public author As String";
_author = "";
RDebugUtils.currentLine=50987019;
 //BA.debugLineNum = 50987019;BA.debugLine="Public subject As String";
_subject = "";
RDebugUtils.currentLine=50987020;
 //BA.debugLineNum = 50987020;BA.debugLine="Public keywords As String";
_keywords = "";
RDebugUtils.currentLine=50987021;
 //BA.debugLineNum = 50987021;BA.debugLine="Public creator As String";
_creator = "";
RDebugUtils.currentLine=50987022;
 //BA.debugLineNum = 50987022;BA.debugLine="Public producer As String";
_producer = "";
RDebugUtils.currentLine=50987023;
 //BA.debugLineNum = 50987023;BA.debugLine="Private info As Map";
_info = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987024;
 //BA.debugLineNum = 50987024;BA.debugLine="Private compress As Boolean";
_compress = false;
RDebugUtils.currentLine=50987025;
 //BA.debugLineNum = 50987025;BA.debugLine="Public security As PDFSecurity";
_security = new b4j.example.pdfsecurity();
RDebugUtils.currentLine=50987026;
 //BA.debugLineNum = 50987026;BA.debugLine="Private parentID As String";
_parentid = "";
RDebugUtils.currentLine=50987027;
 //BA.debugLineNum = 50987027;BA.debugLine="Private fName As String";
_fname = "";
RDebugUtils.currentLine=50987028;
 //BA.debugLineNum = 50987028;BA.debugLine="Private Blobs As Map";
_blobs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987029;
 //BA.debugLineNum = 50987029;BA.debugLine="Private NumFiles As Int";
_numfiles = 0;
RDebugUtils.currentLine=50987030;
 //BA.debugLineNum = 50987030;BA.debugLine="Private files As Map";
_files = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987031;
 //BA.debugLineNum = 50987031;BA.debugLine="Private images As Map";
_images = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987032;
 //BA.debugLineNum = 50987032;BA.debugLine="Private fileKeys As Map";
_filekeys = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987033;
 //BA.debugLineNum = 50987033;BA.debugLine="Private action As String";
_action = "";
RDebugUtils.currentLine=50987034;
 //BA.debugLineNum = 50987034;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
RDebugUtils.currentLine=50987035;
 //BA.debugLineNum = 50987035;BA.debugLine="Private eventMethod As String";
_eventmethod = "";
RDebugUtils.currentLine=50987036;
 //BA.debugLineNum = 50987036;BA.debugLine="Private mJSON As String";
_mjson = "";
RDebugUtils.currentLine=50987037;
 //BA.debugLineNum = 50987037;BA.debugLine="Private mJSONPretty As String";
_mjsonpretty = "";
RDebugUtils.currentLine=50987038;
 //BA.debugLineNum = 50987038;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfcolumns  _createcolumns(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createcolumns", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "createcolumns", null));}
b4j.example.pdfcolumns _col = null;
RDebugUtils.currentLine=53608448;
 //BA.debugLineNum = 53608448;BA.debugLine="Sub CreateColumns As PDFColumns";
RDebugUtils.currentLine=53608450;
 //BA.debugLineNum = 53608450;BA.debugLine="Dim col As PDFColumns";
_col = new b4j.example.pdfcolumns();
RDebugUtils.currentLine=53608451;
 //BA.debugLineNum = 53608451;BA.debugLine="col.Initialize";
_col._initialize /*b4j.example.pdfcolumns*/ (null,ba);
RDebugUtils.currentLine=53608452;
 //BA.debugLineNum = 53608452;BA.debugLine="Return col";
if (true) return _col;
RDebugUtils.currentLine=53608453;
 //BA.debugLineNum = 53608453;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdffooter  _createfooter(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createfooter", true))
	 {return ((b4j.example.pdffooter) Debug.delegate(ba, "createfooter", null));}
b4j.example.pdffooter _ftr = null;
RDebugUtils.currentLine=53411840;
 //BA.debugLineNum = 53411840;BA.debugLine="Sub CreateFooter As PDFFooter";
RDebugUtils.currentLine=53411842;
 //BA.debugLineNum = 53411842;BA.debugLine="Dim ftr As PDFFooter";
_ftr = new b4j.example.pdffooter();
RDebugUtils.currentLine=53411843;
 //BA.debugLineNum = 53411843;BA.debugLine="ftr.Initialize";
_ftr._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=53411844;
 //BA.debugLineNum = 53411844;BA.debugLine="Return ftr";
if (true) return _ftr;
RDebugUtils.currentLine=53411845;
 //BA.debugLineNum = 53411845;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _createimage(b4j.example.pdfmaker __ref,String _imgkey) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createimage", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "createimage", new Object[] {_imgkey}));}
b4j.example.pdfimage _img = null;
RDebugUtils.currentLine=52428800;
 //BA.debugLineNum = 52428800;BA.debugLine="Sub CreateImage(imgKey As String) As PDFImage";
RDebugUtils.currentLine=52428802;
 //BA.debugLineNum = 52428802;BA.debugLine="Dim img As PDFImage";
_img = new b4j.example.pdfimage();
RDebugUtils.currentLine=52428803;
 //BA.debugLineNum = 52428803;BA.debugLine="img.Initialize";
_img._initialize /*b4j.example.pdfimage*/ (null,ba);
RDebugUtils.currentLine=52428804;
 //BA.debugLineNum = 52428804;BA.debugLine="img.SetImage(imgKey)";
_img._setimage /*b4j.example.pdfimage*/ (null,_imgkey);
RDebugUtils.currentLine=52428805;
 //BA.debugLineNum = 52428805;BA.debugLine="Return img";
if (true) return _img;
RDebugUtils.currentLine=52428806;
 //BA.debugLineNum = 52428806;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _createlist(b4j.example.pdfmaker __ref,String _typeof) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createlist", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "createlist", new Object[] {_typeof}));}
b4j.example.pdflist _lstof = null;
RDebugUtils.currentLine=53477376;
 //BA.debugLineNum = 53477376;BA.debugLine="Sub CreateList(typeOf As String) As PDFList";
RDebugUtils.currentLine=53477378;
 //BA.debugLineNum = 53477378;BA.debugLine="Dim lstOf As PDFList";
_lstof = new b4j.example.pdflist();
RDebugUtils.currentLine=53477379;
 //BA.debugLineNum = 53477379;BA.debugLine="lstOf.Initialize(typeOf)";
_lstof._initialize /*b4j.example.pdflist*/ (null,ba,_typeof);
RDebugUtils.currentLine=53477380;
 //BA.debugLineNum = 53477380;BA.debugLine="Return lstOf";
if (true) return _lstof;
RDebugUtils.currentLine=53477381;
 //BA.debugLineNum = 53477381;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _createparagraphs(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createparagraphs", true))
	 {return ((b4j.example.pdfparagraphs) Debug.delegate(ba, "createparagraphs", null));}
b4j.example.pdfparagraphs _stack = null;
RDebugUtils.currentLine=53346304;
 //BA.debugLineNum = 53346304;BA.debugLine="Sub CreateParagraphs As PDFParagraphs";
RDebugUtils.currentLine=53346306;
 //BA.debugLineNum = 53346306;BA.debugLine="Dim stack As PDFParagraphs";
_stack = new b4j.example.pdfparagraphs();
RDebugUtils.currentLine=53346307;
 //BA.debugLineNum = 53346307;BA.debugLine="stack.Initialize";
_stack._initialize /*b4j.example.pdfparagraphs*/ (null,ba);
RDebugUtils.currentLine=53346308;
 //BA.debugLineNum = 53346308;BA.debugLine="Return stack";
if (true) return _stack;
RDebugUtils.currentLine=53346309;
 //BA.debugLineNum = 53346309;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _createqrcode(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createqrcode", true))
	 {return ((b4j.example.pdfqrcode) Debug.delegate(ba, "createqrcode", null));}
b4j.example.pdfqrcode _qrcode = null;
RDebugUtils.currentLine=53215232;
 //BA.debugLineNum = 53215232;BA.debugLine="Sub CreateQRCode As PDFQRCode";
RDebugUtils.currentLine=53215234;
 //BA.debugLineNum = 53215234;BA.debugLine="Dim qrcode As PDFQRCode";
_qrcode = new b4j.example.pdfqrcode();
RDebugUtils.currentLine=53215235;
 //BA.debugLineNum = 53215235;BA.debugLine="qrcode.Initialize";
_qrcode._initialize /*b4j.example.pdfqrcode*/ (null,ba);
RDebugUtils.currentLine=53215236;
 //BA.debugLineNum = 53215236;BA.debugLine="Return qrcode";
if (true) return _qrcode;
RDebugUtils.currentLine=53215237;
 //BA.debugLineNum = 53215237;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _createrow(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createrow", true))
	 {return ((b4j.example.pdfrow) Debug.delegate(ba, "createrow", null));}
b4j.example.pdfrow _row = null;
RDebugUtils.currentLine=52297728;
 //BA.debugLineNum = 52297728;BA.debugLine="Sub CreateRow As PDFRow";
RDebugUtils.currentLine=52297730;
 //BA.debugLineNum = 52297730;BA.debugLine="Dim row As PDFRow";
_row = new b4j.example.pdfrow();
RDebugUtils.currentLine=52297731;
 //BA.debugLineNum = 52297731;BA.debugLine="row.Initialize";
_row._initialize /*b4j.example.pdfrow*/ (null,ba);
RDebugUtils.currentLine=52297732;
 //BA.debugLineNum = 52297732;BA.debugLine="Return row";
if (true) return _row;
RDebugUtils.currentLine=52297733;
 //BA.debugLineNum = 52297733;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _createstack(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createstack", true))
	 {return ((b4j.example.pdfstack) Debug.delegate(ba, "createstack", null));}
b4j.example.pdfstack _stack = null;
RDebugUtils.currentLine=53280768;
 //BA.debugLineNum = 53280768;BA.debugLine="Sub CreateStack As PDFStack";
RDebugUtils.currentLine=53280770;
 //BA.debugLineNum = 53280770;BA.debugLine="Dim stack As PDFStack";
_stack = new b4j.example.pdfstack();
RDebugUtils.currentLine=53280771;
 //BA.debugLineNum = 53280771;BA.debugLine="stack.Initialize";
_stack._initialize /*b4j.example.pdfstack*/ (null,ba);
RDebugUtils.currentLine=53280772;
 //BA.debugLineNum = 53280772;BA.debugLine="Return stack";
if (true) return _stack;
RDebugUtils.currentLine=53280773;
 //BA.debugLineNum = 53280773;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _createstyle(b4j.example.pdfmaker __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "createstyle", new Object[] {_name}));}
b4j.example.pdfstyle _style = null;
RDebugUtils.currentLine=53673984;
 //BA.debugLineNum = 53673984;BA.debugLine="Sub CreateStyle(name As String) As PDFStyle";
RDebugUtils.currentLine=53673986;
 //BA.debugLineNum = 53673986;BA.debugLine="Dim Style As PDFStyle";
_style = new b4j.example.pdfstyle();
RDebugUtils.currentLine=53673987;
 //BA.debugLineNum = 53673987;BA.debugLine="Style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=53673988;
 //BA.debugLineNum = 53673988;BA.debugLine="Style.name = name";
_style._name /*String*/  = _name;
RDebugUtils.currentLine=53673989;
 //BA.debugLineNum = 53673989;BA.debugLine="Return Style";
if (true) return _style;
RDebugUtils.currentLine=53673990;
 //BA.debugLineNum = 53673990;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _createstyleonly(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createstyleonly", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "createstyleonly", null));}
b4j.example.pdfstyle _stl = null;
RDebugUtils.currentLine=53739520;
 //BA.debugLineNum = 53739520;BA.debugLine="Sub CreateStyleOnly As PDFStyle";
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="Dim stl As PDFStyle";
_stl = new b4j.example.pdfstyle();
RDebugUtils.currentLine=53739523;
 //BA.debugLineNum = 53739523;BA.debugLine="stl.Initialize";
_stl._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=53739524;
 //BA.debugLineNum = 53739524;BA.debugLine="Return stl";
if (true) return _stl;
RDebugUtils.currentLine=53739525;
 //BA.debugLineNum = 53739525;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _createtable(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "createtable", null));}
b4j.example.pdftable _tbl = null;
RDebugUtils.currentLine=52363264;
 //BA.debugLineNum = 52363264;BA.debugLine="Sub CreateTable As PDFTable";
RDebugUtils.currentLine=52363266;
 //BA.debugLineNum = 52363266;BA.debugLine="Dim tbl As PDFTable";
_tbl = new b4j.example.pdftable();
RDebugUtils.currentLine=52363267;
 //BA.debugLineNum = 52363267;BA.debugLine="tbl.Initialize";
_tbl._initialize /*b4j.example.pdftable*/ (null,ba);
RDebugUtils.currentLine=52363268;
 //BA.debugLineNum = 52363268;BA.debugLine="Return tbl";
if (true) return _tbl;
RDebugUtils.currentLine=52363269;
 //BA.debugLineNum = 52363269;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _createtext(b4j.example.pdfmaker __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createtext", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "createtext", new Object[] {_txt}));}
b4j.example.pdftext _cnt = null;
RDebugUtils.currentLine=53805056;
 //BA.debugLineNum = 53805056;BA.debugLine="Sub CreateText(txt As String) As PDFText";
RDebugUtils.currentLine=53805058;
 //BA.debugLineNum = 53805058;BA.debugLine="Dim cnt As PDFText";
_cnt = new b4j.example.pdftext();
RDebugUtils.currentLine=53805059;
 //BA.debugLineNum = 53805059;BA.debugLine="cnt.Initialize";
_cnt._initialize /*b4j.example.pdftext*/ (null,ba);
RDebugUtils.currentLine=53805060;
 //BA.debugLineNum = 53805060;BA.debugLine="cnt.Append(txt)";
_cnt._append /*b4j.example.pdftext*/ (null,_txt);
RDebugUtils.currentLine=53805061;
 //BA.debugLineNum = 53805061;BA.debugLine="Return cnt";
if (true) return _cnt;
RDebugUtils.currentLine=53805062;
 //BA.debugLineNum = 53805062;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftoc  _createtoc(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "createtoc", true))
	 {return ((b4j.example.pdftoc) Debug.delegate(ba, "createtoc", null));}
b4j.example.pdftoc _toc = null;
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Sub CreateToC As PDFToC";
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="Dim toc As PDFToC";
_toc = new b4j.example.pdftoc();
RDebugUtils.currentLine=52166659;
 //BA.debugLineNum = 52166659;BA.debugLine="toc.Initialize";
_toc._initialize /*b4j.example.pdftoc*/ (null,ba);
RDebugUtils.currentLine=52166660;
 //BA.debugLineNum = 52166660;BA.debugLine="Return toc";
if (true) return _toc;
RDebugUtils.currentLine=52166661;
 //BA.debugLineNum = 52166661;BA.debugLine="End Sub";
return null;
}
public String  _download(b4j.example.pdfmaker __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_filename}));}
RDebugUtils.currentLine=54132736;
 //BA.debugLineNum = 54132736;BA.debugLine="Sub Download(fileName As String)";
RDebugUtils.currentLine=54132738;
 //BA.debugLineNum = 54132738;BA.debugLine="fName = fileName";
__ref._fname /*String*/  = _filename;
RDebugUtils.currentLine=54132739;
 //BA.debugLineNum = 54132739;BA.debugLine="action = \"download\"";
__ref._action /*String*/  = "download";
RDebugUtils.currentLine=54132740;
 //BA.debugLineNum = 54132740;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=54132741;
 //BA.debugLineNum = 54132741;BA.debugLine="End Sub";
return "";
}
public String  _forreading(b4j.example.pdfmaker __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "forreading", true))
	 {return ((String) Debug.delegate(ba, "forreading", new Object[] {_data}));}
RDebugUtils.currentLine=54460416;
 //BA.debugLineNum = 54460416;BA.debugLine="private Sub forReading(data As Object)";
RDebugUtils.currentLine=54460418;
 //BA.debugLineNum = 54460418;BA.debugLine="BANano.CallSub(eventHandler, eventMethod, data)";
__ref._banano /*com.ab.banano.BANano*/ .CallSub(__ref._eventhandler /*Object*/ ,__ref._eventmethod /*String*/ ,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
RDebugUtils.currentLine=54460419;
 //BA.debugLineNum = 54460419;BA.debugLine="End Sub";
return "";
}
public String  _forupload(b4j.example.pdfmaker __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "forupload", true))
	 {return ((String) Debug.delegate(ba, "forupload", new Object[] {_data}));}
com.ab.banano.BANanoObject _formdata = null;
RDebugUtils.currentLine=54525952;
 //BA.debugLineNum = 54525952;BA.debugLine="private Sub forUpload(data As Object)";
RDebugUtils.currentLine=54525954;
 //BA.debugLineNum = 54525954;BA.debugLine="Dim formData As BANanoObject";
_formdata = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=54525955;
 //BA.debugLineNum = 54525955;BA.debugLine="formData.Initialize2(\"FormData\",Null)";
_formdata.Initialize2("FormData",__c.Null);
RDebugUtils.currentLine=54525956;
 //BA.debugLineNum = 54525956;BA.debugLine="formData.RunMethod(\"append\", Array(\"upload\", data";
_formdata.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_data,(Object)(__ref._fname /*String*/ )}));
RDebugUtils.currentLine=54525957;
 //BA.debugLineNum = 54525957;BA.debugLine="BANano.CallSub(eventHandler, eventMethod, formDat";
__ref._banano /*com.ab.banano.BANano*/ .CallSub(__ref._eventhandler /*Object*/ ,__ref._eventmethod /*String*/ ,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_formdata.getObject())));
RDebugUtils.currentLine=54525958;
 //BA.debugLineNum = 54525958;BA.debugLine="End Sub";
return "";
}
public String  _getbase64(b4j.example.pdfmaker __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getbase64", true))
	 {return ((String) Debug.delegate(ba, "getbase64", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=54853632;
 //BA.debugLineNum = 54853632;BA.debugLine="Sub GetBase64(module As Object, methodName As Stri";
RDebugUtils.currentLine=54853634;
 //BA.debugLineNum = 54853634;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=54853635;
 //BA.debugLineNum = 54853635;BA.debugLine="eventMethod = methodName.tolowercase";
__ref._eventmethod /*String*/  = _methodname.toLowerCase();
RDebugUtils.currentLine=54853636;
 //BA.debugLineNum = 54853636;BA.debugLine="action = \"getBase64\"";
__ref._action /*String*/  = "getBase64";
RDebugUtils.currentLine=54853637;
 //BA.debugLineNum = 54853637;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=54853638;
 //BA.debugLineNum = 54853638;BA.debugLine="End Sub";
return "";
}
public String  _getblob(b4j.example.pdfmaker __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getblob", true))
	 {return ((String) Debug.delegate(ba, "getblob", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=54722560;
 //BA.debugLineNum = 54722560;BA.debugLine="Sub GetBlob(module As Object, methodName As String";
RDebugUtils.currentLine=54722562;
 //BA.debugLineNum = 54722562;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=54722563;
 //BA.debugLineNum = 54722563;BA.debugLine="eventMethod = methodName.tolowercase";
__ref._eventmethod /*String*/  = _methodname.toLowerCase();
RDebugUtils.currentLine=54722564;
 //BA.debugLineNum = 54722564;BA.debugLine="action = \"getBlob\"";
__ref._action /*String*/  = "getBlob";
RDebugUtils.currentLine=54722565;
 //BA.debugLineNum = 54722565;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=54722566;
 //BA.debugLineNum = 54722566;BA.debugLine="End Sub";
return "";
}
public String  _getbuffer(b4j.example.pdfmaker __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getbuffer", true))
	 {return ((String) Debug.delegate(ba, "getbuffer", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=54788096;
 //BA.debugLineNum = 54788096;BA.debugLine="Sub GetBuffer(module As Object, methodName As Stri";
RDebugUtils.currentLine=54788098;
 //BA.debugLineNum = 54788098;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=54788099;
 //BA.debugLineNum = 54788099;BA.debugLine="eventMethod = methodName.tolowercase";
__ref._eventmethod /*String*/  = _methodname.toLowerCase();
RDebugUtils.currentLine=54788100;
 //BA.debugLineNum = 54788100;BA.debugLine="action = \"getBuffer\"";
__ref._action /*String*/  = "getBuffer";
RDebugUtils.currentLine=54788101;
 //BA.debugLineNum = 54788101;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=54788102;
 //BA.debugLineNum = 54788102;BA.debugLine="End Sub";
return "";
}
public String  _getdataurl(b4j.example.pdfmaker __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getdataurl", true))
	 {return ((String) Debug.delegate(ba, "getdataurl", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=54657024;
 //BA.debugLineNum = 54657024;BA.debugLine="Sub GetDataURL(module As Object, methodName As Str";
RDebugUtils.currentLine=54657026;
 //BA.debugLineNum = 54657026;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=54657027;
 //BA.debugLineNum = 54657027;BA.debugLine="eventMethod = methodName.tolowercase";
__ref._eventmethod /*String*/  = _methodname.toLowerCase();
RDebugUtils.currentLine=54657028;
 //BA.debugLineNum = 54657028;BA.debugLine="action = \"getDataUrl\"";
__ref._action /*String*/  = "getDataUrl";
RDebugUtils.currentLine=54657029;
 //BA.debugLineNum = 54657029;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=54657030;
 //BA.debugLineNum = 54657030;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getformdata(b4j.example.pdfmaker __ref,Object _data,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getformdata", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "getformdata", new Object[] {_data,_filename}));}
com.ab.banano.BANanoObject _formdata = null;
RDebugUtils.currentLine=54984704;
 //BA.debugLineNum = 54984704;BA.debugLine="Sub GetFormData(data As Object, fileName As String";
RDebugUtils.currentLine=54984706;
 //BA.debugLineNum = 54984706;BA.debugLine="Dim formData As BANanoObject";
_formdata = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=54984707;
 //BA.debugLineNum = 54984707;BA.debugLine="formData.Initialize2(\"FormData\",Null)";
_formdata.Initialize2("FormData",__c.Null);
RDebugUtils.currentLine=54984708;
 //BA.debugLineNum = 54984708;BA.debugLine="formData.RunMethod(\"append\", Array(\"upload\", data";
_formdata.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_data,(Object)(_filename)}));
RDebugUtils.currentLine=54984709;
 //BA.debugLineNum = 54984709;BA.debugLine="Return formData";
if (true) return _formdata;
RDebugUtils.currentLine=54984710;
 //BA.debugLineNum = 54984710;BA.debugLine="End Sub";
return null;
}
public String  _getjson(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getjson", true))
	 {return ((String) Debug.delegate(ba, "getjson", null));}
RDebugUtils.currentLine=54001664;
 //BA.debugLineNum = 54001664;BA.debugLine="Sub getJSON As String";
RDebugUtils.currentLine=54001666;
 //BA.debugLineNum = 54001666;BA.debugLine="Return mJSON";
if (true) return __ref._mjson /*String*/ ;
RDebugUtils.currentLine=54001667;
 //BA.debugLineNum = 54001667;BA.debugLine="End Sub";
return "";
}
public String  _getjsonpretty(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getjsonpretty", true))
	 {return ((String) Debug.delegate(ba, "getjsonpretty", null));}
RDebugUtils.currentLine=54067200;
 //BA.debugLineNum = 54067200;BA.debugLine="Sub getJSONPretty As String";
RDebugUtils.currentLine=54067201;
 //BA.debugLineNum = 54067201;BA.debugLine="Return mJSONPretty";
if (true) return __ref._mjsonpretty /*String*/ ;
RDebugUtils.currentLine=54067202;
 //BA.debugLineNum = 54067202;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfstyle  _getstyle(b4j.example.pdfmaker __ref,anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "getstyle", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "getstyle", new Object[] {_rec}));}
String _name = "";
boolean _bold = false;
boolean _italics = false;
String _alignment = "";
int _fontsize = 0;
int _marginleft = 0;
int _margintop = 0;
int _marginright = 0;
int _marginbottom = 0;
boolean _noborder = false;
boolean _borderleft = false;
boolean _bordertop = false;
boolean _borderright = false;
boolean _borderbottom = false;
int _width = 0;
int _height = 0;
String _color = "";
String _fillcolor = "";
String _background = "";
double _opacity = 0;
int _angle = 0;
int _columngap = 0;
String _decoration = "";
String _decorationstyle = "";
String _decorationcolor = "";
boolean _applymargins = false;
boolean _applyborders = false;
b4j.example.pdfstyle _st = null;
RDebugUtils.currentLine=51380224;
 //BA.debugLineNum = 51380224;BA.debugLine="Sub GetStyle(rec As Map) As PDFStyle";
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="Dim name As String = rec.Get(\"name\")";
_name = BA.ObjectToString(_rec.Get((Object)("name")));
RDebugUtils.currentLine=51380227;
 //BA.debugLineNum = 51380227;BA.debugLine="Dim bold As Boolean = rec.get(\"bold\")";
_bold = BA.ObjectToBoolean(_rec.Get((Object)("bold")));
RDebugUtils.currentLine=51380228;
 //BA.debugLineNum = 51380228;BA.debugLine="Dim italics As Boolean = rec.Get(\"italics\")";
_italics = BA.ObjectToBoolean(_rec.Get((Object)("italics")));
RDebugUtils.currentLine=51380229;
 //BA.debugLineNum = 51380229;BA.debugLine="Dim alignment As String = rec.Get(\"alignment\")";
_alignment = BA.ObjectToString(_rec.Get((Object)("alignment")));
RDebugUtils.currentLine=51380230;
 //BA.debugLineNum = 51380230;BA.debugLine="Dim fontSize As Int = rec.Get(\"fontSize\")";
_fontsize = (int)(BA.ObjectToNumber(_rec.Get((Object)("fontSize"))));
RDebugUtils.currentLine=51380231;
 //BA.debugLineNum = 51380231;BA.debugLine="Dim marginleft As Int = rec.Get(\"marginleft\")";
_marginleft = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginleft"))));
RDebugUtils.currentLine=51380232;
 //BA.debugLineNum = 51380232;BA.debugLine="Dim margintop As Int = rec.Get(\"margintop\")";
_margintop = (int)(BA.ObjectToNumber(_rec.Get((Object)("margintop"))));
RDebugUtils.currentLine=51380233;
 //BA.debugLineNum = 51380233;BA.debugLine="Dim marginright As Int = rec.Get(\"marginright\")";
_marginright = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginright"))));
RDebugUtils.currentLine=51380234;
 //BA.debugLineNum = 51380234;BA.debugLine="Dim marginbottom As Int = rec.Get(\"marginbottom\")";
_marginbottom = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginbottom"))));
RDebugUtils.currentLine=51380235;
 //BA.debugLineNum = 51380235;BA.debugLine="Dim noborder As Boolean = rec.Get(\"noborder\")";
_noborder = BA.ObjectToBoolean(_rec.Get((Object)("noborder")));
RDebugUtils.currentLine=51380236;
 //BA.debugLineNum = 51380236;BA.debugLine="Dim borderleft As Boolean = rec.get(\"borderleft\")";
_borderleft = BA.ObjectToBoolean(_rec.Get((Object)("borderleft")));
RDebugUtils.currentLine=51380237;
 //BA.debugLineNum = 51380237;BA.debugLine="Dim bordertop As Boolean = rec.get(\"bordertop\")";
_bordertop = BA.ObjectToBoolean(_rec.Get((Object)("bordertop")));
RDebugUtils.currentLine=51380238;
 //BA.debugLineNum = 51380238;BA.debugLine="Dim borderright As Boolean = rec.get(\"borderright";
_borderright = BA.ObjectToBoolean(_rec.Get((Object)("borderright")));
RDebugUtils.currentLine=51380239;
 //BA.debugLineNum = 51380239;BA.debugLine="Dim borderbottom As Boolean = rec.get(\"borderbott";
_borderbottom = BA.ObjectToBoolean(_rec.Get((Object)("borderbottom")));
RDebugUtils.currentLine=51380240;
 //BA.debugLineNum = 51380240;BA.debugLine="Dim width As Int = rec.Get(\"width\")";
_width = (int)(BA.ObjectToNumber(_rec.Get((Object)("width"))));
RDebugUtils.currentLine=51380241;
 //BA.debugLineNum = 51380241;BA.debugLine="Dim height As Int = rec.get(\"height\")";
_height = (int)(BA.ObjectToNumber(_rec.Get((Object)("height"))));
RDebugUtils.currentLine=51380242;
 //BA.debugLineNum = 51380242;BA.debugLine="Dim color As String = rec.Get(\"color\")";
_color = BA.ObjectToString(_rec.Get((Object)("color")));
RDebugUtils.currentLine=51380243;
 //BA.debugLineNum = 51380243;BA.debugLine="Dim fillColor As String = rec.get(\"fillColor\")";
_fillcolor = BA.ObjectToString(_rec.Get((Object)("fillColor")));
RDebugUtils.currentLine=51380244;
 //BA.debugLineNum = 51380244;BA.debugLine="Dim background As String = rec.Get(\"background\")";
_background = BA.ObjectToString(_rec.Get((Object)("background")));
RDebugUtils.currentLine=51380245;
 //BA.debugLineNum = 51380245;BA.debugLine="Dim opacity As Double = rec.Get(\"opacity\")";
_opacity = (double)(BA.ObjectToNumber(_rec.Get((Object)("opacity"))));
RDebugUtils.currentLine=51380246;
 //BA.debugLineNum = 51380246;BA.debugLine="Dim angle As Int = rec.get(\"angle\")";
_angle = (int)(BA.ObjectToNumber(_rec.Get((Object)("angle"))));
RDebugUtils.currentLine=51380247;
 //BA.debugLineNum = 51380247;BA.debugLine="Dim columnGap As Int = rec.get(\"columnGap\")";
_columngap = (int)(BA.ObjectToNumber(_rec.Get((Object)("columnGap"))));
RDebugUtils.currentLine=51380248;
 //BA.debugLineNum = 51380248;BA.debugLine="Dim decoration As String = rec.Get(\"decoration\")";
_decoration = BA.ObjectToString(_rec.Get((Object)("decoration")));
RDebugUtils.currentLine=51380249;
 //BA.debugLineNum = 51380249;BA.debugLine="If decoration = \"none\" Then decoration = \"\"";
if ((_decoration).equals("none")) { 
_decoration = "";};
RDebugUtils.currentLine=51380250;
 //BA.debugLineNum = 51380250;BA.debugLine="Dim decorationStyle As String = rec.Get(\"decorati";
_decorationstyle = BA.ObjectToString(_rec.Get((Object)("decorationStyle")));
RDebugUtils.currentLine=51380251;
 //BA.debugLineNum = 51380251;BA.debugLine="If decorationStyle = \"none\" Then decorationStyle";
if ((_decorationstyle).equals("none")) { 
_decorationstyle = "";};
RDebugUtils.currentLine=51380252;
 //BA.debugLineNum = 51380252;BA.debugLine="Dim decorationColor As String = rec.Get(\"decorati";
_decorationcolor = BA.ObjectToString(_rec.Get((Object)("decorationColor")));
RDebugUtils.currentLine=51380253;
 //BA.debugLineNum = 51380253;BA.debugLine="Dim applymargins As Boolean = rec.Get(\"applymargi";
_applymargins = BA.ObjectToBoolean(_rec.Get((Object)("applymargins")));
RDebugUtils.currentLine=51380254;
 //BA.debugLineNum = 51380254;BA.debugLine="Dim applyborders As Boolean = rec.Get(\"applyborde";
_applyborders = BA.ObjectToBoolean(_rec.Get((Object)("applyborders")));
RDebugUtils.currentLine=51380256;
 //BA.debugLineNum = 51380256;BA.debugLine="Dim st As PDFStyle";
_st = new b4j.example.pdfstyle();
RDebugUtils.currentLine=51380257;
 //BA.debugLineNum = 51380257;BA.debugLine="st.Initialize";
_st._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=51380258;
 //BA.debugLineNum = 51380258;BA.debugLine="st.SetName(name)";
_st._setname /*b4j.example.pdfstyle*/ (null,_name);
RDebugUtils.currentLine=51380259;
 //BA.debugLineNum = 51380259;BA.debugLine="st.SetBold(bold)";
_st._setbold /*b4j.example.pdfstyle*/ (null,_bold);
RDebugUtils.currentLine=51380260;
 //BA.debugLineNum = 51380260;BA.debugLine="st.SetItalics(italics)";
_st._setitalics /*b4j.example.pdfstyle*/ (null,_italics);
RDebugUtils.currentLine=51380261;
 //BA.debugLineNum = 51380261;BA.debugLine="Select Case alignment";
switch (BA.switchObjectToInt(_alignment,"alignmentRight","alignmentCenter","alignmentJustify")) {
case 0: {
RDebugUtils.currentLine=51380263;
 //BA.debugLineNum = 51380263;BA.debugLine="st.alignmentRight = True";
_st._alignmentright /*boolean*/  = __c.True;
 break; }
case 1: {
RDebugUtils.currentLine=51380265;
 //BA.debugLineNum = 51380265;BA.debugLine="st.alignmentCenter = True";
_st._alignmentcenter /*boolean*/  = __c.True;
 break; }
case 2: {
RDebugUtils.currentLine=51380267;
 //BA.debugLineNum = 51380267;BA.debugLine="st.alignmentJustify = True";
_st._alignmentjustify /*boolean*/  = __c.True;
 break; }
}
;
RDebugUtils.currentLine=51380269;
 //BA.debugLineNum = 51380269;BA.debugLine="st.SetFontSize(fontSize)";
_st._setfontsize /*b4j.example.pdfstyle*/ (null,_fontsize);
RDebugUtils.currentLine=51380270;
 //BA.debugLineNum = 51380270;BA.debugLine="If applymargins Then";
if (_applymargins) { 
RDebugUtils.currentLine=51380271;
 //BA.debugLineNum = 51380271;BA.debugLine="st.SetMargin(marginleft, margintop, marginright,";
_st._setmargin /*b4j.example.pdfstyle*/ (null,_marginleft,_margintop,_marginright,_marginbottom);
 };
RDebugUtils.currentLine=51380273;
 //BA.debugLineNum = 51380273;BA.debugLine="If noborder Then";
if (_noborder) { 
RDebugUtils.currentLine=51380274;
 //BA.debugLineNum = 51380274;BA.debugLine="st.NoBorder";
_st._noborder /*b4j.example.pdfstyle*/ (null);
 }else {
RDebugUtils.currentLine=51380276;
 //BA.debugLineNum = 51380276;BA.debugLine="If applyborders Then";
if (_applyborders) { 
RDebugUtils.currentLine=51380277;
 //BA.debugLineNum = 51380277;BA.debugLine="st.SetBorder(borderleft, bordertop, borderright";
_st._setborder /*b4j.example.pdfstyle*/ (null,_borderleft,_bordertop,_borderright,_borderbottom);
 };
 };
RDebugUtils.currentLine=51380280;
 //BA.debugLineNum = 51380280;BA.debugLine="st.SetWidth(width)";
_st._setwidth /*b4j.example.pdfstyle*/ (null,_width);
RDebugUtils.currentLine=51380281;
 //BA.debugLineNum = 51380281;BA.debugLine="st.setheight(height)";
_st._setheight /*b4j.example.pdfstyle*/ (null,_height);
RDebugUtils.currentLine=51380282;
 //BA.debugLineNum = 51380282;BA.debugLine="st.SetColor(color)";
_st._setcolor /*b4j.example.pdfstyle*/ (null,_color);
RDebugUtils.currentLine=51380283;
 //BA.debugLineNum = 51380283;BA.debugLine="st.SetFillColor(fillColor)";
_st._setfillcolor /*b4j.example.pdfstyle*/ (null,_fillcolor);
RDebugUtils.currentLine=51380284;
 //BA.debugLineNum = 51380284;BA.debugLine="st.setbackground(background)";
_st._setbackground /*b4j.example.pdfstyle*/ (null,_background);
RDebugUtils.currentLine=51380285;
 //BA.debugLineNum = 51380285;BA.debugLine="st.SetOpacity(opacity)";
_st._setopacity /*b4j.example.pdfstyle*/ (null,_opacity);
RDebugUtils.currentLine=51380286;
 //BA.debugLineNum = 51380286;BA.debugLine="st.SetAngle(angle)";
_st._setangle /*b4j.example.pdfstyle*/ (null,_angle);
RDebugUtils.currentLine=51380287;
 //BA.debugLineNum = 51380287;BA.debugLine="st.SetColumnGap(columnGap)";
_st._setcolumngap /*b4j.example.pdfstyle*/ (null,_columngap);
RDebugUtils.currentLine=51380288;
 //BA.debugLineNum = 51380288;BA.debugLine="Return st";
if (true) return _st;
RDebugUtils.currentLine=51380289;
 //BA.debugLineNum = 51380289;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _initialize(b4j.example.pdfmaker __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=51052544;
 //BA.debugLineNum = 51052544;BA.debugLine="Public Sub Initialize As PDFMaker";
RDebugUtils.currentLine=51052545;
 //BA.debugLineNum = 51052545;BA.debugLine="BANano.DependsOnAsset(\"pdfmake.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("pdfmake.js");
RDebugUtils.currentLine=51052546;
 //BA.debugLineNum = 51052546;BA.debugLine="BANano.DependsOnAsset(\"vfs_fonts.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("vfs_fonts.js");
RDebugUtils.currentLine=51052547;
 //BA.debugLineNum = 51052547;BA.debugLine="BANano.DependsOnAsset(\"jquery.media.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jquery.media.js");
RDebugUtils.currentLine=51052550;
 //BA.debugLineNum = 51052550;BA.debugLine="pdf.Initialize(\"pdfMake\")";
__ref._pdf /*com.ab.banano.BANanoObject*/ .Initialize((Object)("pdfMake"));
RDebugUtils.currentLine=51052551;
 //BA.debugLineNum = 51052551;BA.debugLine="Blobs.Initialize";
__ref._blobs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51052552;
 //BA.debugLineNum = 51052552;BA.debugLine="styles.Initialize";
__ref._styles /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51052553;
 //BA.debugLineNum = 51052553;BA.debugLine="docDefinition.Initialize";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51052554;
 //BA.debugLineNum = 51052554;BA.debugLine="content.Initialize";
__ref._content /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=51052555;
 //BA.debugLineNum = 51052555;BA.debugLine="defaultStyle.Initialize";
__ref._defaultstyle /*b4j.example.pdfstyle*/ ._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=51052556;
 //BA.debugLineNum = 51052556;BA.debugLine="defaultStyle.name = \"defaultStyle\"";
__ref._defaultstyle /*b4j.example.pdfstyle*/ ._name /*String*/  = "defaultStyle";
RDebugUtils.currentLine=51052557;
 //BA.debugLineNum = 51052557;BA.debugLine="pageSize = Null";
__ref._pagesize /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=51052558;
 //BA.debugLineNum = 51052558;BA.debugLine="pageOrientation = Null";
__ref._pageorientation /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=51052559;
 //BA.debugLineNum = 51052559;BA.debugLine="title = Null";
__ref._title /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=51052560;
 //BA.debugLineNum = 51052560;BA.debugLine="author = Null";
__ref._author /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=51052561;
 //BA.debugLineNum = 51052561;BA.debugLine="subject = Null";
__ref._subject /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=51052562;
 //BA.debugLineNum = 51052562;BA.debugLine="keywords = Null";
__ref._keywords /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=51052563;
 //BA.debugLineNum = 51052563;BA.debugLine="creator = Null";
__ref._creator /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=51052564;
 //BA.debugLineNum = 51052564;BA.debugLine="producer = Null";
__ref._producer /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=51052565;
 //BA.debugLineNum = 51052565;BA.debugLine="info.Initialize";
__ref._info /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51052566;
 //BA.debugLineNum = 51052566;BA.debugLine="compress = Null";
__ref._compress /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=51052567;
 //BA.debugLineNum = 51052567;BA.debugLine="security.Initialize";
__ref._security /*b4j.example.pdfsecurity*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=51052568;
 //BA.debugLineNum = 51052568;BA.debugLine="files.Initialize";
__ref._files /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51052569;
 //BA.debugLineNum = 51052569;BA.debugLine="images.Initialize";
__ref._images /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51052570;
 //BA.debugLineNum = 51052570;BA.debugLine="fileKeys.Initialize";
__ref._filekeys /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51052571;
 //BA.debugLineNum = 51052571;BA.debugLine="mJSON = \"\"";
__ref._mjson /*String*/  = "";
RDebugUtils.currentLine=51052572;
 //BA.debugLineNum = 51052572;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51052573;
 //BA.debugLineNum = 51052573;BA.debugLine="End Sub";
return null;
}
public String  _open(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "open", true))
	 {return ((String) Debug.delegate(ba, "open", null));}
RDebugUtils.currentLine=54329344;
 //BA.debugLineNum = 54329344;BA.debugLine="Sub Open";
RDebugUtils.currentLine=54329346;
 //BA.debugLineNum = 54329346;BA.debugLine="action = \"open\"";
__ref._action /*String*/  = "open";
RDebugUtils.currentLine=54329347;
 //BA.debugLineNum = 54329347;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=54329348;
 //BA.debugLineNum = 54329348;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _pagesizes(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "pagesizes", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "pagesizes", null));}
anywheresoftware.b4a.objects.collections.List _ps = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _stritem = "";
RDebugUtils.currentLine=55050240;
 //BA.debugLineNum = 55050240;BA.debugLine="Sub PageSizes As Map";
RDebugUtils.currentLine=55050241;
 //BA.debugLineNum = 55050241;BA.debugLine="Dim ps As List";
_ps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55050242;
 //BA.debugLineNum = 55050242;BA.debugLine="ps.Initialize";
_ps.Initialize();
RDebugUtils.currentLine=55050243;
 //BA.debugLineNum = 55050243;BA.debugLine="ps.Add(\"4A0\")";
_ps.Add((Object)("4A0"));
RDebugUtils.currentLine=55050244;
 //BA.debugLineNum = 55050244;BA.debugLine="ps.Add(\"2A0\")";
_ps.Add((Object)("2A0"));
RDebugUtils.currentLine=55050245;
 //BA.debugLineNum = 55050245;BA.debugLine="ps.Add(\"A0\")";
_ps.Add((Object)("A0"));
RDebugUtils.currentLine=55050246;
 //BA.debugLineNum = 55050246;BA.debugLine="ps.Add(\"A1\")";
_ps.Add((Object)("A1"));
RDebugUtils.currentLine=55050247;
 //BA.debugLineNum = 55050247;BA.debugLine="ps.Add(\"A2\")";
_ps.Add((Object)("A2"));
RDebugUtils.currentLine=55050248;
 //BA.debugLineNum = 55050248;BA.debugLine="ps.Add(\"A3\")";
_ps.Add((Object)("A3"));
RDebugUtils.currentLine=55050249;
 //BA.debugLineNum = 55050249;BA.debugLine="ps.Add(\"A4\")";
_ps.Add((Object)("A4"));
RDebugUtils.currentLine=55050250;
 //BA.debugLineNum = 55050250;BA.debugLine="ps.Add(\"A5\")";
_ps.Add((Object)("A5"));
RDebugUtils.currentLine=55050251;
 //BA.debugLineNum = 55050251;BA.debugLine="ps.Add(\"A6\")";
_ps.Add((Object)("A6"));
RDebugUtils.currentLine=55050252;
 //BA.debugLineNum = 55050252;BA.debugLine="ps.Add(\"A7\")";
_ps.Add((Object)("A7"));
RDebugUtils.currentLine=55050253;
 //BA.debugLineNum = 55050253;BA.debugLine="ps.Add(\"A8\")";
_ps.Add((Object)("A8"));
RDebugUtils.currentLine=55050254;
 //BA.debugLineNum = 55050254;BA.debugLine="ps.Add(\"A9\")";
_ps.Add((Object)("A9"));
RDebugUtils.currentLine=55050255;
 //BA.debugLineNum = 55050255;BA.debugLine="ps.Add(\"A10\")";
_ps.Add((Object)("A10"));
RDebugUtils.currentLine=55050256;
 //BA.debugLineNum = 55050256;BA.debugLine="ps.Add(\"B0\")";
_ps.Add((Object)("B0"));
RDebugUtils.currentLine=55050257;
 //BA.debugLineNum = 55050257;BA.debugLine="ps.Add(\"B1\")";
_ps.Add((Object)("B1"));
RDebugUtils.currentLine=55050258;
 //BA.debugLineNum = 55050258;BA.debugLine="ps.Add(\"B2\")";
_ps.Add((Object)("B2"));
RDebugUtils.currentLine=55050259;
 //BA.debugLineNum = 55050259;BA.debugLine="ps.Add(\"B3\")";
_ps.Add((Object)("B3"));
RDebugUtils.currentLine=55050260;
 //BA.debugLineNum = 55050260;BA.debugLine="ps.Add(\"B4\")";
_ps.Add((Object)("B4"));
RDebugUtils.currentLine=55050261;
 //BA.debugLineNum = 55050261;BA.debugLine="ps.Add(\"B5\")";
_ps.Add((Object)("B5"));
RDebugUtils.currentLine=55050262;
 //BA.debugLineNum = 55050262;BA.debugLine="ps.Add(\"B6\")";
_ps.Add((Object)("B6"));
RDebugUtils.currentLine=55050263;
 //BA.debugLineNum = 55050263;BA.debugLine="ps.Add(\"B7\")";
_ps.Add((Object)("B7"));
RDebugUtils.currentLine=55050264;
 //BA.debugLineNum = 55050264;BA.debugLine="ps.Add(\"B8\")";
_ps.Add((Object)("B8"));
RDebugUtils.currentLine=55050265;
 //BA.debugLineNum = 55050265;BA.debugLine="ps.Add(\"B9\")";
_ps.Add((Object)("B9"));
RDebugUtils.currentLine=55050266;
 //BA.debugLineNum = 55050266;BA.debugLine="ps.Add(\"B10\")";
_ps.Add((Object)("B10"));
RDebugUtils.currentLine=55050267;
 //BA.debugLineNum = 55050267;BA.debugLine="ps.Add(\"C0\")";
_ps.Add((Object)("C0"));
RDebugUtils.currentLine=55050268;
 //BA.debugLineNum = 55050268;BA.debugLine="ps.Add(\"C1\")";
_ps.Add((Object)("C1"));
RDebugUtils.currentLine=55050269;
 //BA.debugLineNum = 55050269;BA.debugLine="ps.Add(\"C2\")";
_ps.Add((Object)("C2"));
RDebugUtils.currentLine=55050270;
 //BA.debugLineNum = 55050270;BA.debugLine="ps.Add(\"C3\")";
_ps.Add((Object)("C3"));
RDebugUtils.currentLine=55050271;
 //BA.debugLineNum = 55050271;BA.debugLine="ps.Add(\"C4\")";
_ps.Add((Object)("C4"));
RDebugUtils.currentLine=55050272;
 //BA.debugLineNum = 55050272;BA.debugLine="ps.Add(\"C5\")";
_ps.Add((Object)("C5"));
RDebugUtils.currentLine=55050273;
 //BA.debugLineNum = 55050273;BA.debugLine="ps.Add(\"C6\")";
_ps.Add((Object)("C6"));
RDebugUtils.currentLine=55050274;
 //BA.debugLineNum = 55050274;BA.debugLine="ps.Add(\"C7\")";
_ps.Add((Object)("C7"));
RDebugUtils.currentLine=55050275;
 //BA.debugLineNum = 55050275;BA.debugLine="ps.Add(\"C8\")";
_ps.Add((Object)("C8"));
RDebugUtils.currentLine=55050276;
 //BA.debugLineNum = 55050276;BA.debugLine="ps.Add(\"C9\")";
_ps.Add((Object)("C9"));
RDebugUtils.currentLine=55050277;
 //BA.debugLineNum = 55050277;BA.debugLine="ps.Add(\"C10\")";
_ps.Add((Object)("C10"));
RDebugUtils.currentLine=55050278;
 //BA.debugLineNum = 55050278;BA.debugLine="ps.Add(\"RA0\")";
_ps.Add((Object)("RA0"));
RDebugUtils.currentLine=55050279;
 //BA.debugLineNum = 55050279;BA.debugLine="ps.Add(\"RA1\")";
_ps.Add((Object)("RA1"));
RDebugUtils.currentLine=55050280;
 //BA.debugLineNum = 55050280;BA.debugLine="ps.Add(\"RA2\")";
_ps.Add((Object)("RA2"));
RDebugUtils.currentLine=55050281;
 //BA.debugLineNum = 55050281;BA.debugLine="ps.Add(\"RA3\")";
_ps.Add((Object)("RA3"));
RDebugUtils.currentLine=55050282;
 //BA.debugLineNum = 55050282;BA.debugLine="ps.Add(\"RA4\")";
_ps.Add((Object)("RA4"));
RDebugUtils.currentLine=55050283;
 //BA.debugLineNum = 55050283;BA.debugLine="ps.Add(\"SRA0\")";
_ps.Add((Object)("SRA0"));
RDebugUtils.currentLine=55050284;
 //BA.debugLineNum = 55050284;BA.debugLine="ps.Add(\"SRA1\")";
_ps.Add((Object)("SRA1"));
RDebugUtils.currentLine=55050285;
 //BA.debugLineNum = 55050285;BA.debugLine="ps.Add(\"SRA2\")";
_ps.Add((Object)("SRA2"));
RDebugUtils.currentLine=55050286;
 //BA.debugLineNum = 55050286;BA.debugLine="ps.Add(\"SRA3\")";
_ps.Add((Object)("SRA3"));
RDebugUtils.currentLine=55050287;
 //BA.debugLineNum = 55050287;BA.debugLine="ps.Add(\"SRA4\")";
_ps.Add((Object)("SRA4"));
RDebugUtils.currentLine=55050288;
 //BA.debugLineNum = 55050288;BA.debugLine="ps.Add(\"EXECUTIVE\")";
_ps.Add((Object)("EXECUTIVE"));
RDebugUtils.currentLine=55050289;
 //BA.debugLineNum = 55050289;BA.debugLine="ps.Add(\"FOLIO\")";
_ps.Add((Object)("FOLIO"));
RDebugUtils.currentLine=55050290;
 //BA.debugLineNum = 55050290;BA.debugLine="ps.Add(\"LEGAL\")";
_ps.Add((Object)("LEGAL"));
RDebugUtils.currentLine=55050291;
 //BA.debugLineNum = 55050291;BA.debugLine="ps.Add(\"LETTER\")";
_ps.Add((Object)("LETTER"));
RDebugUtils.currentLine=55050292;
 //BA.debugLineNum = 55050292;BA.debugLine="ps.Add(\"TABLOID\")";
_ps.Add((Object)("TABLOID"));
RDebugUtils.currentLine=55050294;
 //BA.debugLineNum = 55050294;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
RDebugUtils.currentLine=55050295;
 //BA.debugLineNum = 55050295;BA.debugLine="For Each strItem As String In ps";
{
final anywheresoftware.b4a.BA.IterableList group54 = _ps;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_stritem = BA.ObjectToString(group54.Get(index54));
RDebugUtils.currentLine=55050296;
 //BA.debugLineNum = 55050296;BA.debugLine="m.Put(strItem, strItem)";
_m.Put((Object)(_stritem),(Object)(_stritem));
 }
};
RDebugUtils.currentLine=55050298;
 //BA.debugLineNum = 55050298;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=55050299;
 //BA.debugLineNum = 55050299;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _preload(b4j.example.pdfmaker __ref,String _key,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "preload", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "preload", new Object[] {_key,_url}));}
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Sub Preload(key As String, url As String) As PDFMa";
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="files.Put(key, url)";
__ref._files /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_url));
RDebugUtils.currentLine=52035587;
 //BA.debugLineNum = 52035587;BA.debugLine="fileKeys.Put(url, key)";
__ref._filekeys /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_url),(Object)(_key));
RDebugUtils.currentLine=52035589;
 //BA.debugLineNum = 52035589;BA.debugLine="NumFiles = files.size";
__ref._numfiles /*int*/  = __ref._files /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=52035590;
 //BA.debugLineNum = 52035590;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52035591;
 //BA.debugLineNum = 52035591;BA.debugLine="End Sub";
return null;
}
public String  _print(b4j.example.pdfmaker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "print", true))
	 {return ((String) Debug.delegate(ba, "print", null));}
RDebugUtils.currentLine=54263808;
 //BA.debugLineNum = 54263808;BA.debugLine="Sub Print";
RDebugUtils.currentLine=54263810;
 //BA.debugLineNum = 54263810;BA.debugLine="action = \"print\"";
__ref._action /*String*/  = "print";
RDebugUtils.currentLine=54263811;
 //BA.debugLineNum = 54263811;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=54263812;
 //BA.debugLineNum = 54263812;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setauthor(b4j.example.pdfmaker __ref,String _sauthor) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setauthor", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setauthor", new Object[] {_sauthor}));}
RDebugUtils.currentLine=51773440;
 //BA.debugLineNum = 51773440;BA.debugLine="Sub SetAuthor(sauthor As String) As PDFMaker";
RDebugUtils.currentLine=51773442;
 //BA.debugLineNum = 51773442;BA.debugLine="If sauthor = \"\" Then Return Me";
if ((_sauthor).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
RDebugUtils.currentLine=51773443;
 //BA.debugLineNum = 51773443;BA.debugLine="author = sauthor";
__ref._author /*String*/  = _sauthor;
RDebugUtils.currentLine=51773444;
 //BA.debugLineNum = 51773444;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51773445;
 //BA.debugLineNum = 51773445;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setbackground(b4j.example.pdfmaker __ref,b4j.example.pdftext _wm) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setbackground", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setbackground", new Object[] {_wm}));}
RDebugUtils.currentLine=52690944;
 //BA.debugLineNum = 52690944;BA.debugLine="Sub SetBackground(wm As PDFText) As PDFMaker";
RDebugUtils.currentLine=52690946;
 //BA.debugLineNum = 52690946;BA.debugLine="docDefinition.Put(\"background\", wm.Content)";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("background"),(Object)(_wm._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52690947;
 //BA.debugLineNum = 52690947;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52690948;
 //BA.debugLineNum = 52690948;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setcompress(b4j.example.pdfmaker __ref,boolean _bcompress) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setcompress", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setcompress", new Object[] {_bcompress}));}
RDebugUtils.currentLine=51511296;
 //BA.debugLineNum = 51511296;BA.debugLine="Sub SetCompress(bcompress As Boolean) As PDFMaker";
RDebugUtils.currentLine=51511298;
 //BA.debugLineNum = 51511298;BA.debugLine="compress = bcompress";
__ref._compress /*boolean*/  = _bcompress;
RDebugUtils.currentLine=51511299;
 //BA.debugLineNum = 51511299;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51511300;
 //BA.debugLineNum = 51511300;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setcreator(b4j.example.pdfmaker __ref,String _screator) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setcreator", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setcreator", new Object[] {_screator}));}
RDebugUtils.currentLine=51576832;
 //BA.debugLineNum = 51576832;BA.debugLine="Sub SetCreator(screator As String) As PDFMaker";
RDebugUtils.currentLine=51576834;
 //BA.debugLineNum = 51576834;BA.debugLine="If screator = \"\" Then Return Me";
if ((_screator).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
RDebugUtils.currentLine=51576835;
 //BA.debugLineNum = 51576835;BA.debugLine="creator = screator";
__ref._creator /*String*/  = _screator;
RDebugUtils.currentLine=51576836;
 //BA.debugLineNum = 51576836;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51576837;
 //BA.debugLineNum = 51576837;BA.debugLine="End Sub";
return null;
}
public String  _setdefaultstyle(b4j.example.pdfmaker __ref,anywheresoftware.b4a.objects.collections.Map _ds) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setdefaultstyle", true))
	 {return ((String) Debug.delegate(ba, "setdefaultstyle", new Object[] {_ds}));}
RDebugUtils.currentLine=51249152;
 //BA.debugLineNum = 51249152;BA.debugLine="Sub SetDefaultStyle(ds As Map)";
RDebugUtils.currentLine=51249154;
 //BA.debugLineNum = 51249154;BA.debugLine="If ds.IsInitialized Then";
if (_ds.IsInitialized()) { 
RDebugUtils.currentLine=51249155;
 //BA.debugLineNum = 51249155;BA.debugLine="ds.Put(\"name\", \"defaultStyle\")";
_ds.Put((Object)("name"),(Object)("defaultStyle"));
RDebugUtils.currentLine=51249156;
 //BA.debugLineNum = 51249156;BA.debugLine="defaultStyle = GetStyle(ds)";
__ref._defaultstyle /*b4j.example.pdfstyle*/  = __ref._getstyle /*b4j.example.pdfstyle*/ (null,_ds);
 };
RDebugUtils.currentLine=51249158;
 //BA.debugLineNum = 51249158;BA.debugLine="End Sub";
return "";
}
public String  _setdocumentproperties(b4j.example.pdfmaker __ref,anywheresoftware.b4a.objects.collections.Map _docprops) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setdocumentproperties", true))
	 {return ((String) Debug.delegate(ba, "setdocumentproperties", new Object[] {_docprops}));}
RDebugUtils.currentLine=51118080;
 //BA.debugLineNum = 51118080;BA.debugLine="Sub SetDocumentProperties(docprops As Map)";
RDebugUtils.currentLine=51118082;
 //BA.debugLineNum = 51118082;BA.debugLine="SetAuthor(docprops.Get(\"author\"))";
__ref._setauthor /*b4j.example.pdfmaker*/ (null,BA.ObjectToString(_docprops.Get((Object)("author"))));
RDebugUtils.currentLine=51118083;
 //BA.debugLineNum = 51118083;BA.debugLine="SetTitle(docprops.Get(\"title\"))";
__ref._settitle /*b4j.example.pdfmaker*/ (null,BA.ObjectToString(_docprops.Get((Object)("title"))));
RDebugUtils.currentLine=51118084;
 //BA.debugLineNum = 51118084;BA.debugLine="SetSubject(docprops.Get(\"subject\"))";
__ref._setsubject /*b4j.example.pdfmaker*/ (null,BA.ObjectToString(_docprops.Get((Object)("subject"))));
RDebugUtils.currentLine=51118085;
 //BA.debugLineNum = 51118085;BA.debugLine="SetKeywords(docprops.Get(\"keywords\"))";
__ref._setkeywords /*b4j.example.pdfmaker*/ (null,BA.ObjectToString(_docprops.Get((Object)("keywords"))));
RDebugUtils.currentLine=51118086;
 //BA.debugLineNum = 51118086;BA.debugLine="SetCreator(docprops.Get(\"creator\"))";
__ref._setcreator /*b4j.example.pdfmaker*/ (null,BA.ObjectToString(_docprops.Get((Object)("creator"))));
RDebugUtils.currentLine=51118087;
 //BA.debugLineNum = 51118087;BA.debugLine="SetProducer(docprops.Get(\"producer\"))";
__ref._setproducer /*b4j.example.pdfmaker*/ (null,BA.ObjectToString(_docprops.Get((Object)("producer"))));
RDebugUtils.currentLine=51118088;
 //BA.debugLineNum = 51118088;BA.debugLine="SetCompress(docprops.Get(\"compress\"))";
__ref._setcompress /*b4j.example.pdfmaker*/ (null,BA.ObjectToBoolean(_docprops.Get((Object)("compress"))));
RDebugUtils.currentLine=51118089;
 //BA.debugLineNum = 51118089;BA.debugLine="security.Set(\"userPassword\", docprops.Get(\"userPa";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"userPassword",_docprops.Get((Object)("userPassword")));
RDebugUtils.currentLine=51118090;
 //BA.debugLineNum = 51118090;BA.debugLine="security.Set(\"ownerPassword\", docprops.Get(\"owner";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"ownerPassword",_docprops.Get((Object)("ownerPassword")));
RDebugUtils.currentLine=51118091;
 //BA.debugLineNum = 51118091;BA.debugLine="security.Set(\"modifying\", docprops.Get(\"modifying";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"modifying",_docprops.Get((Object)("modifying")));
RDebugUtils.currentLine=51118092;
 //BA.debugLineNum = 51118092;BA.debugLine="security.Set(\"copying\", docprops.Get(\"copying\"))";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"copying",_docprops.Get((Object)("copying")));
RDebugUtils.currentLine=51118093;
 //BA.debugLineNum = 51118093;BA.debugLine="security.Set(\"annotating\", docprops.Get(\"annotati";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"annotating",_docprops.Get((Object)("annotating")));
RDebugUtils.currentLine=51118094;
 //BA.debugLineNum = 51118094;BA.debugLine="security.Set(\"fillingForms\", docprops.Get(\"fillin";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"fillingForms",_docprops.Get((Object)("fillingForms")));
RDebugUtils.currentLine=51118095;
 //BA.debugLineNum = 51118095;BA.debugLine="security.Set(\"contentAccessibility\", docprops.Get";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"contentAccessibility",_docprops.Get((Object)("contentAccessibility")));
RDebugUtils.currentLine=51118096;
 //BA.debugLineNum = 51118096;BA.debugLine="security.Set(\"documentAssembly\", docprops.Get(\"do";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"documentAssembly",_docprops.Get((Object)("documentAssembly")));
RDebugUtils.currentLine=51118097;
 //BA.debugLineNum = 51118097;BA.debugLine="security.Set(\"printing\", docprops.Get(\"printing\")";
__ref._security /*b4j.example.pdfsecurity*/ ._set /*String*/ (null,"printing",_docprops.Get((Object)("printing")));
RDebugUtils.currentLine=51118098;
 //BA.debugLineNum = 51118098;BA.debugLine="SetPageSize(docprops.Get(\"pageSize\"))";
__ref._setpagesize /*b4j.example.pdfmaker*/ (null,BA.ObjectToString(_docprops.Get((Object)("pageSize"))));
RDebugUtils.currentLine=51118099;
 //BA.debugLineNum = 51118099;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _settitle(b4j.example.pdfmaker __ref,String _stitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "settitle", new Object[] {_stitle}));}
RDebugUtils.currentLine=51838976;
 //BA.debugLineNum = 51838976;BA.debugLine="Sub SetTitle(stitle As String) As PDFMaker";
RDebugUtils.currentLine=51838978;
 //BA.debugLineNum = 51838978;BA.debugLine="If stitle = \"\" Then Return Me";
if ((_stitle).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
RDebugUtils.currentLine=51838979;
 //BA.debugLineNum = 51838979;BA.debugLine="title = stitle";
__ref._title /*String*/  = _stitle;
RDebugUtils.currentLine=51838980;
 //BA.debugLineNum = 51838980;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51838981;
 //BA.debugLineNum = 51838981;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setsubject(b4j.example.pdfmaker __ref,String _ssubject) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setsubject", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setsubject", new Object[] {_ssubject}));}
RDebugUtils.currentLine=51707904;
 //BA.debugLineNum = 51707904;BA.debugLine="Sub SetSubject(ssubject As String) As PDFMaker";
RDebugUtils.currentLine=51707906;
 //BA.debugLineNum = 51707906;BA.debugLine="If ssubject = \"\" Then Return Me";
if ((_ssubject).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
RDebugUtils.currentLine=51707907;
 //BA.debugLineNum = 51707907;BA.debugLine="subject = ssubject";
__ref._subject /*String*/  = _ssubject;
RDebugUtils.currentLine=51707908;
 //BA.debugLineNum = 51707908;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51707909;
 //BA.debugLineNum = 51707909;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setkeywords(b4j.example.pdfmaker __ref,String _skeywords) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setkeywords", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setkeywords", new Object[] {_skeywords}));}
RDebugUtils.currentLine=51642368;
 //BA.debugLineNum = 51642368;BA.debugLine="Sub SetKeywords(skeywords As String) As PDFMaker";
RDebugUtils.currentLine=51642370;
 //BA.debugLineNum = 51642370;BA.debugLine="If skeywords = \"\" Then Return Me";
if ((_skeywords).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
RDebugUtils.currentLine=51642371;
 //BA.debugLineNum = 51642371;BA.debugLine="keywords = skeywords";
__ref._keywords /*String*/  = _skeywords;
RDebugUtils.currentLine=51642372;
 //BA.debugLineNum = 51642372;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51642373;
 //BA.debugLineNum = 51642373;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setproducer(b4j.example.pdfmaker __ref,String _sproducer) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setproducer", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setproducer", new Object[] {_sproducer}));}
RDebugUtils.currentLine=51445760;
 //BA.debugLineNum = 51445760;BA.debugLine="Sub SetProducer(sproducer As String) As PDFMaker";
RDebugUtils.currentLine=51445762;
 //BA.debugLineNum = 51445762;BA.debugLine="If sproducer = \"\" Then Return Me";
if ((_sproducer).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
RDebugUtils.currentLine=51445763;
 //BA.debugLineNum = 51445763;BA.debugLine="producer = sproducer";
__ref._producer /*String*/  = _sproducer;
RDebugUtils.currentLine=51445764;
 //BA.debugLineNum = 51445764;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51445765;
 //BA.debugLineNum = 51445765;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpagesize(b4j.example.pdfmaker __ref,String _spagesize) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setpagesize", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setpagesize", new Object[] {_spagesize}));}
RDebugUtils.currentLine=51904512;
 //BA.debugLineNum = 51904512;BA.debugLine="Sub SetPageSize(spageSize As String) As PDFMaker";
RDebugUtils.currentLine=51904514;
 //BA.debugLineNum = 51904514;BA.debugLine="If spageSize = \"\" Then Return Me";
if ((_spagesize).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
RDebugUtils.currentLine=51904515;
 //BA.debugLineNum = 51904515;BA.debugLine="pageSize = spageSize";
__ref._pagesize /*String*/  = _spagesize;
RDebugUtils.currentLine=51904516;
 //BA.debugLineNum = 51904516;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51904517;
 //BA.debugLineNum = 51904517;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setheader(b4j.example.pdfmaker __ref,b4j.example.pdftext _hdr) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setheader", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setheader", new Object[] {_hdr}));}
RDebugUtils.currentLine=52756480;
 //BA.debugLineNum = 52756480;BA.debugLine="Sub SetHeader(hdr As PDFText) As PDFMaker";
RDebugUtils.currentLine=52756482;
 //BA.debugLineNum = 52756482;BA.debugLine="docDefinition.Put(\"header\", hdr.content)";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("header"),(Object)(_hdr._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52756483;
 //BA.debugLineNum = 52756483;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52756484;
 //BA.debugLineNum = 52756484;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpagemargins(b4j.example.pdfmaker __ref,int _l,int _t,int _r,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setpagemargins", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setpagemargins", new Object[] {_l,_t,_r,_b}));}
anywheresoftware.b4a.objects.collections.List _margin = null;
RDebugUtils.currentLine=52232192;
 //BA.debugLineNum = 52232192;BA.debugLine="Sub SetPageMargins(l As Int, t As Int, r As Int, b";
RDebugUtils.currentLine=52232194;
 //BA.debugLineNum = 52232194;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=52232195;
 //BA.debugLineNum = 52232195;BA.debugLine="margin.Initialize";
_margin.Initialize();
RDebugUtils.currentLine=52232196;
 //BA.debugLineNum = 52232196;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
RDebugUtils.currentLine=52232197;
 //BA.debugLineNum = 52232197;BA.debugLine="docDefinition.Put(\"pageMargins\", margin)";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageMargins"),(Object)(_margin.getObject()));
RDebugUtils.currentLine=52232198;
 //BA.debugLineNum = 52232198;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52232199;
 //BA.debugLineNum = 52232199;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpageorientation(b4j.example.pdfmaker __ref,String _spageorientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setpageorientation", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setpageorientation", new Object[] {_spageorientation}));}
RDebugUtils.currentLine=51970048;
 //BA.debugLineNum = 51970048;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
RDebugUtils.currentLine=51970050;
 //BA.debugLineNum = 51970050;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
RDebugUtils.currentLine=51970051;
 //BA.debugLineNum = 51970051;BA.debugLine="pageOrientation = spageOrientation";
__ref._pageorientation /*String*/  = _spageorientation;
RDebugUtils.currentLine=51970052;
 //BA.debugLineNum = 51970052;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51970053;
 //BA.debugLineNum = 51970053;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setprogresscallback(b4j.example.pdfmaker __ref,Object _module,String _methodname,anywheresoftware.b4a.objects.collections.List _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setprogresscallback", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setprogresscallback", new Object[] {_module,_methodname,_params}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=51183616;
 //BA.debugLineNum = 51183616;BA.debugLine="Sub SetProgressCallback(module As Object, methodNa";
RDebugUtils.currentLine=51183617;
 //BA.debugLineNum = 51183617;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,_params)));
RDebugUtils.currentLine=51183618;
 //BA.debugLineNum = 51183618;BA.debugLine="docDefinition.Put(\"progressCallback\", cb)";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("progressCallback"),(Object)(_cb.getObject()));
RDebugUtils.currentLine=51183619;
 //BA.debugLineNum = 51183619;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=51183620;
 //BA.debugLineNum = 51183620;BA.debugLine="End Sub";
return null;
}
public String  _setstyles(b4j.example.pdfmaker __ref,anywheresoftware.b4a.objects.collections.Map _allstyles) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setstyles", true))
	 {return ((String) Debug.delegate(ba, "setstyles", new Object[] {_allstyles}));}
String _sk = "";
anywheresoftware.b4a.objects.collections.Map _sv = null;
b4j.example.pdfstyle _ts = null;
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Sub SetStyles(allStyles As Map)";
RDebugUtils.currentLine=51314690;
 //BA.debugLineNum = 51314690;BA.debugLine="For Each sk As String In allStyles.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _allstyles.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_sk = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=51314691;
 //BA.debugLineNum = 51314691;BA.debugLine="Dim sv As Map = allStyles.Get(sk)";
_sv = new anywheresoftware.b4a.objects.collections.Map();
_sv.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_allstyles.Get((Object)(_sk))));
RDebugUtils.currentLine=51314692;
 //BA.debugLineNum = 51314692;BA.debugLine="Dim ts As PDFStyle = GetStyle(sv)";
_ts = __ref._getstyle /*b4j.example.pdfstyle*/ (null,_sv);
RDebugUtils.currentLine=51314693;
 //BA.debugLineNum = 51314693;BA.debugLine="AddStyle(ts)";
__ref._addstyle /*String*/ (null,_ts);
 }
};
RDebugUtils.currentLine=51314695;
 //BA.debugLineNum = 51314695;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setwatermark(b4j.example.pdfmaker __ref,b4j.example.pdftext _wm) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "setwatermark", true))
	 {return ((b4j.example.pdfmaker) Debug.delegate(ba, "setwatermark", new Object[] {_wm}));}
RDebugUtils.currentLine=52625408;
 //BA.debugLineNum = 52625408;BA.debugLine="Sub SetWaterMark(wm As PDFText) As PDFMaker";
RDebugUtils.currentLine=52625410;
 //BA.debugLineNum = 52625410;BA.debugLine="docDefinition.Put(\"watermark\", wm.Content)";
__ref._docdefinition /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("watermark"),(Object)(_wm._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=52625411;
 //BA.debugLineNum = 52625411;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
RDebugUtils.currentLine=52625412;
 //BA.debugLineNum = 52625412;BA.debugLine="End Sub";
return null;
}
public String  _upload(b4j.example.pdfmaker __ref,Object _module,String _methodname,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfmaker";
if (Debug.shouldDelegate(ba, "upload", true))
	 {return ((String) Debug.delegate(ba, "upload", new Object[] {_module,_methodname,_filename}));}
RDebugUtils.currentLine=54919168;
 //BA.debugLineNum = 54919168;BA.debugLine="Sub Upload(module As Object, methodName As String,";
RDebugUtils.currentLine=54919169;
 //BA.debugLineNum = 54919169;BA.debugLine="Log(\"PDFMaker.Upload\")";
__c.Log("PDFMaker.Upload");
RDebugUtils.currentLine=54919170;
 //BA.debugLineNum = 54919170;BA.debugLine="eventHandler = module";
__ref._eventhandler /*Object*/  = _module;
RDebugUtils.currentLine=54919171;
 //BA.debugLineNum = 54919171;BA.debugLine="eventMethod = methodName.tolowercase";
__ref._eventmethod /*String*/  = _methodname.toLowerCase();
RDebugUtils.currentLine=54919172;
 //BA.debugLineNum = 54919172;BA.debugLine="fName = fileName";
__ref._fname /*String*/  = _filename;
RDebugUtils.currentLine=54919173;
 //BA.debugLineNum = 54919173;BA.debugLine="action = \"upload\"";
__ref._action /*String*/  = "upload";
RDebugUtils.currentLine=54919174;
 //BA.debugLineNum = 54919174;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=54919175;
 //BA.debugLineNum = 54919175;BA.debugLine="End Sub";
return "";
}
}