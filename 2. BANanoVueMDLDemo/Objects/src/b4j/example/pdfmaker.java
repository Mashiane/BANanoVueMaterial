package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfmaker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfmaker", this);
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
public b4j.example.pdfmaker  _addcolumns(b4j.example.pdfcolumns _cols) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub AddColumns(cols As PDFColumns) As PDFMaker";
 //BA.debugLineNum = 342;BA.debugLine="content.Add(cols.content)";
_content.Add((Object)(_cols._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addfooter(b4j.example.pdffooter _ftr) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub AddFooter(ftr As PDFFooter) As PDFMaker";
 //BA.debugLineNum = 349;BA.debugLine="docDefinition.Put(\"footer\", ftr.content)";
_docdefinition.Put((Object)("footer"),(Object)(_ftr._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addimage(b4j.example.pdfimage _img) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub AddImage(img As PDFImage) As PDFMaker";
 //BA.debugLineNum = 308;BA.debugLine="content.Add(img.Content)";
_content.Add((Object)(_img._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addlist(b4j.example.pdflist _lstof) throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub AddList(lstOf As PDFList) As PDFMaker";
 //BA.debugLineNum = 424;BA.debugLine="content.Add(lstOf.Content)";
_content.Add((Object)(_lstof._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addparagraphs(b4j.example.pdfparagraphs _stack) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub AddParagraphs(stack As PDFParagraphs) As PDFMa";
 //BA.debugLineNum = 370;BA.debugLine="content.Add(stack.Content)";
_content.Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addqrcode(b4j.example.pdfqrcode _qrcode) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub AddQRCode(qrCode As PDFQRCode) As PDFMaker";
 //BA.debugLineNum = 363;BA.debugLine="content.Add(qrCode.Content)";
_content.Add((Object)(_qrcode._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addstack(b4j.example.pdfstack _stack) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub AddStack(stack As PDFStack) As PDFMaker";
 //BA.debugLineNum = 356;BA.debugLine="content.Add(stack.Content)";
_content.Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addstring(String _txt) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub AddString(txt As String) As PDFMaker";
 //BA.debugLineNum = 377;BA.debugLine="content.Add(txt)";
_content.Add((Object)(_txt));
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public String  _addstyle(b4j.example.pdfstyle _style) throws Exception{
String _name = "";
anywheresoftware.b4a.objects.collections.Map _stylecontent = null;
 //BA.debugLineNum = 463;BA.debugLine="Sub AddStyle(style As PDFStyle)";
 //BA.debugLineNum = 465;BA.debugLine="Dim name As String = style.name";
_name = _style._name /*String*/ ;
 //BA.debugLineNum = 466;BA.debugLine="Dim stylecontent As Map = style.content";
_stylecontent = new anywheresoftware.b4a.objects.collections.Map();
_stylecontent = _style._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 467;BA.debugLine="styles.Put(name, stylecontent)";
_styles.Put((Object)(_name),(Object)(_stylecontent.getObject()));
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _addtable(b4j.example.pdftable _tbl) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub AddTable(tbl As PDFTable) As PDFMaker";
 //BA.debugLineNum = 315;BA.debugLine="content.Add(tbl.Content)";
_content.Add((Object)(_tbl._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public String  _addtext(b4j.example.pdftext _currentcontent) throws Exception{
anywheresoftware.b4a.objects.collections.Map _text = null;
 //BA.debugLineNum = 471;BA.debugLine="Sub AddText(currentContent As PDFText)";
 //BA.debugLineNum = 473;BA.debugLine="Dim text As Map = currentContent.Content";
_text = new anywheresoftware.b4a.objects.collections.Map();
_text = _currentcontent._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 474;BA.debugLine="content.Add(text)";
_content.Add((Object)(_text.getObject()));
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _addtoc(b4j.example.pdftoc _toc) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub AddToC(toc As PDFToC) As PDFMaker";
 //BA.debugLineNum = 258;BA.debugLine="content.Add(toc.Content)";
_content.Add((Object)(_toc._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public String  _build() throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 496;BA.debugLine="private Sub Build";
 //BA.debugLineNum = 498;BA.debugLine="If pageSize <> Null Then docDefinition.Put(\"pageS";
if (_pagesize!= null) { 
_docdefinition.Put((Object)("pageSize"),(Object)(_pagesize));};
 //BA.debugLineNum = 499;BA.debugLine="If pageOrientation <> Null Then docDefinition.Put";
if (_pageorientation!= null) { 
_docdefinition.Put((Object)("pageOrientation"),(Object)(_pageorientation));};
 //BA.debugLineNum = 500;BA.debugLine="docDefinition.Put(\"content\", content)";
_docdefinition.Put((Object)("content"),(Object)(_content.getObject()));
 //BA.debugLineNum = 501;BA.debugLine="docDefinition.Put(\"styles\", styles)";
_docdefinition.Put((Object)("styles"),(Object)(_styles.getObject()));
 //BA.debugLineNum = 502;BA.debugLine="If title <> Null Then info.Put(\"Title\", title)";
if (_title!= null) { 
_info.Put((Object)("Title"),(Object)(_title));};
 //BA.debugLineNum = 503;BA.debugLine="If author <> Null Then info.Put(\"Author\", author)";
if (_author!= null) { 
_info.Put((Object)("Author"),(Object)(_author));};
 //BA.debugLineNum = 504;BA.debugLine="If subject <> Null Then info.Put(\"Subject\", subje";
if (_subject!= null) { 
_info.Put((Object)("Subject"),(Object)(_subject));};
 //BA.debugLineNum = 505;BA.debugLine="If keywords <> Null Then info.Put(\"Keywords\", key";
if (_keywords!= null) { 
_info.Put((Object)("Keywords"),(Object)(_keywords));};
 //BA.debugLineNum = 506;BA.debugLine="If creator <> Null Then info.Put(\"Creator\", creat";
if (_creator!= null) { 
_info.Put((Object)("Creator"),(Object)(_creator));};
 //BA.debugLineNum = 507;BA.debugLine="If producer <> Null Then info.Put(\"Producer\", pro";
if (_producer!= null) { 
_info.Put((Object)("Producer"),(Object)(_producer));};
 //BA.debugLineNum = 508;BA.debugLine="If info.Size > 0 Then docDefinition.Put(\"info\", i";
if (_info.getSize()>0) { 
_docdefinition.Put((Object)("info"),(Object)(_info.getObject()));};
 //BA.debugLineNum = 509;BA.debugLine="If compress <> Null Then docDefinition.Put(\"compr";
if (_compress!=BA.ObjectToBoolean(__c.Null)) { 
_docdefinition.Put((Object)("compress"),(Object)(_compress));};
 //BA.debugLineNum = 510;BA.debugLine="If security.userPassword <> Null Then docDefiniti";
if (_security._userpassword /*String*/ != null) { 
_docdefinition.Put((Object)("userPassword"),(Object)(_security._userpassword /*String*/ ));};
 //BA.debugLineNum = 511;BA.debugLine="If security.ownerPassword <> Null Then docDefinit";
if (_security._ownerpassword /*String*/ != null) { 
_docdefinition.Put((Object)("ownerPassword"),(Object)(_security._ownerpassword /*String*/ ));};
 //BA.debugLineNum = 512;BA.debugLine="docDefinition.Put(\"permissions\", security.content";
_docdefinition.Put((Object)("permissions"),(Object)(_security._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 513;BA.debugLine="docDefinition.Put(\"defaultStyle\", defaultStyle.co";
_docdefinition.Put((Object)("defaultStyle"),(Object)(_defaultstyle._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 514;BA.debugLine="If files.Size > 0 Then";
if (_files.getSize()>0) { 
 //BA.debugLineNum = 515;BA.debugLine="For Each k As String In files.Keys";
{
final anywheresoftware.b4a.BA.IterableList group18 = _files.Keys();
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_k = BA.ObjectToString(group18.Get(index18));
 //BA.debugLineNum = 517;BA.debugLine="Dim v As String = files.Get(k)";
_v = BA.ObjectToString(_files.Get((Object)(_k)));
 //BA.debugLineNum = 518;BA.debugLine="GetFileFromServer(v)";
_getfilefromserver(_v);
 }
};
 }else {
 //BA.debugLineNum = 521;BA.debugLine="FilesAreReady";
_filesareready();
 };
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private docDefinition As Map";
_docdefinition = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5;BA.debugLine="Private content As List";
_content = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public defaultStyle As PDFStyle";
_defaultstyle = new b4j.example.pdfstyle();
 //BA.debugLineNum = 7;BA.debugLine="Private pdf As BANanoObject";
_pdf = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 8;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 9;BA.debugLine="Public pageSize As String";
_pagesize = "";
 //BA.debugLineNum = 10;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 11;BA.debugLine="Public title As String";
_title = "";
 //BA.debugLineNum = 12;BA.debugLine="Public author As String";
_author = "";
 //BA.debugLineNum = 13;BA.debugLine="Public subject As String";
_subject = "";
 //BA.debugLineNum = 14;BA.debugLine="Public keywords As String";
_keywords = "";
 //BA.debugLineNum = 15;BA.debugLine="Public creator As String";
_creator = "";
 //BA.debugLineNum = 16;BA.debugLine="Public producer As String";
_producer = "";
 //BA.debugLineNum = 17;BA.debugLine="Private info As Map";
_info = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="Private compress As Boolean";
_compress = false;
 //BA.debugLineNum = 19;BA.debugLine="Public security As PDFSecurity";
_security = new b4j.example.pdfsecurity();
 //BA.debugLineNum = 20;BA.debugLine="Private parentID As String";
_parentid = "";
 //BA.debugLineNum = 21;BA.debugLine="Private fName As String";
_fname = "";
 //BA.debugLineNum = 22;BA.debugLine="Private Blobs As Map";
_blobs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 23;BA.debugLine="Private NumFiles As Int";
_numfiles = 0;
 //BA.debugLineNum = 24;BA.debugLine="Private files As Map";
_files = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 25;BA.debugLine="Private images As Map";
_images = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 26;BA.debugLine="Private fileKeys As Map";
_filekeys = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="Private action As String";
_action = "";
 //BA.debugLineNum = 28;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
 //BA.debugLineNum = 29;BA.debugLine="Private eventMethod As String";
_eventmethod = "";
 //BA.debugLineNum = 30;BA.debugLine="Private mJSON As String";
_mjson = "";
 //BA.debugLineNum = 31;BA.debugLine="Private mJSONPretty As String";
_mjsonpretty = "";
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfcolumns  _createcolumns() throws Exception{
b4j.example.pdfcolumns _col = null;
 //BA.debugLineNum = 429;BA.debugLine="Sub CreateColumns As PDFColumns";
 //BA.debugLineNum = 431;BA.debugLine="Dim col As PDFColumns";
_col = new b4j.example.pdfcolumns();
 //BA.debugLineNum = 432;BA.debugLine="col.Initialize";
_col._initialize /*b4j.example.pdfcolumns*/ (ba);
 //BA.debugLineNum = 433;BA.debugLine="Return col";
if (true) return _col;
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdffooter  _createfooter() throws Exception{
b4j.example.pdffooter _ftr = null;
 //BA.debugLineNum = 406;BA.debugLine="Sub CreateFooter As PDFFooter";
 //BA.debugLineNum = 408;BA.debugLine="Dim ftr As PDFFooter";
_ftr = new b4j.example.pdffooter();
 //BA.debugLineNum = 409;BA.debugLine="ftr.Initialize";
_ftr._initialize /*String*/ (ba);
 //BA.debugLineNum = 410;BA.debugLine="Return ftr";
if (true) return _ftr;
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _createimage(String _imgkey) throws Exception{
b4j.example.pdfimage _img = null;
 //BA.debugLineNum = 297;BA.debugLine="Sub CreateImage(imgKey As String) As PDFImage";
 //BA.debugLineNum = 299;BA.debugLine="Dim img As PDFImage";
_img = new b4j.example.pdfimage();
 //BA.debugLineNum = 300;BA.debugLine="img.Initialize";
_img._initialize /*b4j.example.pdfimage*/ (ba);
 //BA.debugLineNum = 301;BA.debugLine="img.SetImage(imgKey)";
_img._setimage /*b4j.example.pdfimage*/ (_imgkey);
 //BA.debugLineNum = 302;BA.debugLine="Return img";
if (true) return _img;
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _createlist(String _typeof) throws Exception{
b4j.example.pdflist _lstof = null;
 //BA.debugLineNum = 414;BA.debugLine="Sub CreateList(typeOf As String) As PDFList";
 //BA.debugLineNum = 416;BA.debugLine="Dim lstOf As PDFList";
_lstof = new b4j.example.pdflist();
 //BA.debugLineNum = 417;BA.debugLine="lstOf.Initialize(typeOf)";
_lstof._initialize /*b4j.example.pdflist*/ (ba,_typeof);
 //BA.debugLineNum = 418;BA.debugLine="Return lstOf";
if (true) return _lstof;
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _createparagraphs() throws Exception{
b4j.example.pdfparagraphs _stack = null;
 //BA.debugLineNum = 398;BA.debugLine="Sub CreateParagraphs As PDFParagraphs";
 //BA.debugLineNum = 400;BA.debugLine="Dim stack As PDFParagraphs";
_stack = new b4j.example.pdfparagraphs();
 //BA.debugLineNum = 401;BA.debugLine="stack.Initialize";
_stack._initialize /*b4j.example.pdfparagraphs*/ (ba);
 //BA.debugLineNum = 402;BA.debugLine="Return stack";
if (true) return _stack;
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _createqrcode() throws Exception{
b4j.example.pdfqrcode _qrcode = null;
 //BA.debugLineNum = 382;BA.debugLine="Sub CreateQRCode As PDFQRCode";
 //BA.debugLineNum = 384;BA.debugLine="Dim qrcode As PDFQRCode";
_qrcode = new b4j.example.pdfqrcode();
 //BA.debugLineNum = 385;BA.debugLine="qrcode.Initialize";
_qrcode._initialize /*b4j.example.pdfqrcode*/ (ba);
 //BA.debugLineNum = 386;BA.debugLine="Return qrcode";
if (true) return _qrcode;
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _createrow() throws Exception{
b4j.example.pdfrow _row = null;
 //BA.debugLineNum = 281;BA.debugLine="Sub CreateRow As PDFRow";
 //BA.debugLineNum = 283;BA.debugLine="Dim row As PDFRow";
_row = new b4j.example.pdfrow();
 //BA.debugLineNum = 284;BA.debugLine="row.Initialize";
_row._initialize /*b4j.example.pdfrow*/ (ba);
 //BA.debugLineNum = 285;BA.debugLine="Return row";
if (true) return _row;
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _createstack() throws Exception{
b4j.example.pdfstack _stack = null;
 //BA.debugLineNum = 390;BA.debugLine="Sub CreateStack As PDFStack";
 //BA.debugLineNum = 392;BA.debugLine="Dim stack As PDFStack";
_stack = new b4j.example.pdfstack();
 //BA.debugLineNum = 393;BA.debugLine="stack.Initialize";
_stack._initialize /*b4j.example.pdfstack*/ (ba);
 //BA.debugLineNum = 394;BA.debugLine="Return stack";
if (true) return _stack;
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _createstyle(String _name) throws Exception{
b4j.example.pdfstyle _style = null;
 //BA.debugLineNum = 437;BA.debugLine="Sub CreateStyle(name As String) As PDFStyle";
 //BA.debugLineNum = 439;BA.debugLine="Dim Style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 440;BA.debugLine="Style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 441;BA.debugLine="Style.name = name";
_style._name /*String*/  = _name;
 //BA.debugLineNum = 442;BA.debugLine="Return Style";
if (true) return _style;
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _createstyleonly() throws Exception{
b4j.example.pdfstyle _stl = null;
 //BA.debugLineNum = 446;BA.debugLine="Sub CreateStyleOnly As PDFStyle";
 //BA.debugLineNum = 448;BA.debugLine="Dim stl As PDFStyle";
_stl = new b4j.example.pdfstyle();
 //BA.debugLineNum = 449;BA.debugLine="stl.Initialize";
_stl._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 450;BA.debugLine="Return stl";
if (true) return _stl;
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _createtable() throws Exception{
b4j.example.pdftable _tbl = null;
 //BA.debugLineNum = 289;BA.debugLine="Sub CreateTable As PDFTable";
 //BA.debugLineNum = 291;BA.debugLine="Dim tbl As PDFTable";
_tbl = new b4j.example.pdftable();
 //BA.debugLineNum = 292;BA.debugLine="tbl.Initialize";
_tbl._initialize /*b4j.example.pdftable*/ (ba);
 //BA.debugLineNum = 293;BA.debugLine="Return tbl";
if (true) return _tbl;
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _createtext(String _txt) throws Exception{
b4j.example.pdftext _cnt = null;
 //BA.debugLineNum = 454;BA.debugLine="Sub CreateText(txt As String) As PDFText";
 //BA.debugLineNum = 456;BA.debugLine="Dim cnt As PDFText";
_cnt = new b4j.example.pdftext();
 //BA.debugLineNum = 457;BA.debugLine="cnt.Initialize";
_cnt._initialize /*b4j.example.pdftext*/ (ba);
 //BA.debugLineNum = 458;BA.debugLine="cnt.Append(txt)";
_cnt._append /*b4j.example.pdftext*/ (_txt);
 //BA.debugLineNum = 459;BA.debugLine="Return cnt";
if (true) return _cnt;
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftoc  _createtoc() throws Exception{
b4j.example.pdftoc _toc = null;
 //BA.debugLineNum = 263;BA.debugLine="Sub CreateToC As PDFToC";
 //BA.debugLineNum = 265;BA.debugLine="Dim toc As PDFToC";
_toc = new b4j.example.pdftoc();
 //BA.debugLineNum = 266;BA.debugLine="toc.Initialize";
_toc._initialize /*b4j.example.pdftoc*/ (ba);
 //BA.debugLineNum = 267;BA.debugLine="Return toc";
if (true) return _toc;
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public String  _download(String _filename) throws Exception{
 //BA.debugLineNum = 488;BA.debugLine="Sub Download(fileName As String)";
 //BA.debugLineNum = 490;BA.debugLine="fName = fileName";
_fname = _filename;
 //BA.debugLineNum = 491;BA.debugLine="action = \"download\"";
_action = "download";
 //BA.debugLineNum = 492;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return "";
}
public String  _filesareready() throws Exception{
String _k = "";
String _v = "";
String _dataurl = "";
Object _data = null;
com.ab.banano.BANanoObject _res = null;
com.ab.banano.BANanoPromise _prom = null;
 //BA.debugLineNum = 592;BA.debugLine="private Sub FilesAreReady()";
 //BA.debugLineNum = 593;BA.debugLine="Try";
try { //BA.debugLineNum = 595;BA.debugLine="If files.Size > 0 Then";
if (_files.getSize()>0) { 
 //BA.debugLineNum = 597;BA.debugLine="For Each k As String In Blobs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _blobs.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 599;BA.debugLine="Dim v As String = fileKeys.Get(k)";
_v = BA.ObjectToString(_filekeys.Get((Object)(_k)));
 //BA.debugLineNum = 600;BA.debugLine="Dim DataUrl As String = Blobs.Get(k)";
_dataurl = BA.ObjectToString(_blobs.Get((Object)(_k)));
 //BA.debugLineNum = 601;BA.debugLine="images.Put(v, DataUrl)";
_images.Put((Object)(_v),(Object)(_dataurl));
 }
};
 //BA.debugLineNum = 603;BA.debugLine="If images.Size > 0 Then docDefinition.Put(\"ima";
if (_images.getSize()>0) { 
_docdefinition.Put((Object)("images"),(Object)(_images.getObject()));};
 };
 //BA.debugLineNum = 606;BA.debugLine="mJSON = BANano.ToJson(docDefinition)";
_mjson = BA.ObjectToString(_banano.ToJson((Object)(_docdefinition.getObject())));
 //BA.debugLineNum = 607;BA.debugLine="mJSONPretty = BANano.RunJavascriptMethod(\"JSON.st";
_mjsonpretty = BA.ObjectToString(_banano.RunJavascriptMethod("JSON.stringify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_docdefinition.getObject()),__c.Null,(Object)(4)})));
 //BA.debugLineNum = 609;BA.debugLine="Dim data As Object";
_data = new Object();
 //BA.debugLineNum = 610;BA.debugLine="Dim res As BANanoObject";
_res = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 611;BA.debugLine="Dim prom As BANanoPromise";
_prom = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 612;BA.debugLine="Select Case action";
switch (BA.switchObjectToInt(_action,"download","print","open","upload","getDataUrl","getBlob","getBuffer","getBase64")) {
case 0: {
 //BA.debugLineNum = 614;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
_pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject())).RunMethod("download",(Object)(_fname));
 break; }
case 1: {
 //BA.debugLineNum = 616;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
_pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject())).RunMethod("print",__c.Null);
 break; }
case 2: {
 //BA.debugLineNum = 618;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
_pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject())).RunMethod("open",__c.Null);
 break; }
case 3: {
 //BA.debugLineNum = 620;BA.debugLine="res = pdf.RunMethod(\"createPdf\", docDefinition)";
_res = _pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject()));
 //BA.debugLineNum = 621;BA.debugLine="prom = res.RunMethod(\"getBlob\", data)";
_prom.setObject((java.lang.Object)(_res.RunMethod("getBlob",_data).getObject()));
 //BA.debugLineNum = 622;BA.debugLine="prom.Then(data)";
_prom.Then(_data);
 //BA.debugLineNum = 623;BA.debugLine="BANano.CallSub(Me, \"forUpload\", data)";
_banano.CallSub(this,"forUpload",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
 //BA.debugLineNum = 624;BA.debugLine="prom.End";
_prom.End();
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 626;BA.debugLine="res = pdf.RunMethod(\"createPdf\", docDefinition)";
_res = _pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject()));
 //BA.debugLineNum = 627;BA.debugLine="prom = res.RunMethod(action, data)";
_prom.setObject((java.lang.Object)(_res.RunMethod(_action,_data).getObject()));
 //BA.debugLineNum = 628;BA.debugLine="prom.Then(data)";
_prom.Then(_data);
 //BA.debugLineNum = 629;BA.debugLine="BANano.CallSub(Me, \"forReading\", data)";
_banano.CallSub(this,"forReading",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
 //BA.debugLineNum = 630;BA.debugLine="prom.End";
_prom.End();
 break; }
}
;
 } 
       catch (Exception e36) {
			ba.setLastException(e36); //BA.debugLineNum = 633;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return "";
}
public String  _forreading(Object _data) throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="private Sub forReading(data As Object)";
 //BA.debugLineNum = 579;BA.debugLine="BANano.CallSub(eventHandler, eventMethod, data)";
_banano.CallSub(_eventhandler,_eventmethod,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return "";
}
public String  _forupload(Object _data) throws Exception{
com.ab.banano.BANanoObject _formdata = null;
 //BA.debugLineNum = 583;BA.debugLine="private Sub forUpload(data As Object)";
 //BA.debugLineNum = 585;BA.debugLine="Dim formData As BANanoObject";
_formdata = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 586;BA.debugLine="formData.Initialize2(\"FormData\",Null)";
_formdata.Initialize2("FormData",__c.Null);
 //BA.debugLineNum = 587;BA.debugLine="formData.RunMethod(\"append\", Array(\"upload\", data";
_formdata.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_data,(Object)(_fname)}));
 //BA.debugLineNum = 588;BA.debugLine="BANano.CallSub(eventHandler, eventMethod, formDat";
_banano.CallSub(_eventhandler,_eventmethod,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_formdata.getObject())));
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return "";
}
public String  _getbase64(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 666;BA.debugLine="Sub GetBase64(module As Object, methodName As Stri";
 //BA.debugLineNum = 668;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 669;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 670;BA.debugLine="action = \"getBase64\"";
_action = "getBase64";
 //BA.debugLineNum = 671;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 672;BA.debugLine="End Sub";
return "";
}
public String  _getblob(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 648;BA.debugLine="Sub GetBlob(module As Object, methodName As String";
 //BA.debugLineNum = 650;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 651;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 652;BA.debugLine="action = \"getBlob\"";
_action = "getBlob";
 //BA.debugLineNum = 653;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
return "";
}
public String  _getbuffer(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 657;BA.debugLine="Sub GetBuffer(module As Object, methodName As Stri";
 //BA.debugLineNum = 659;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 660;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 661;BA.debugLine="action = \"getBuffer\"";
_action = "getBuffer";
 //BA.debugLineNum = 662;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 663;BA.debugLine="End Sub";
return "";
}
public String  _getdataurl(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 639;BA.debugLine="Sub GetDataURL(module As Object, methodName As Str";
 //BA.debugLineNum = 641;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 642;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 643;BA.debugLine="action = \"getDataUrl\"";
_action = "getDataUrl";
 //BA.debugLineNum = 644;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return "";
}
public String  _getfilefromserver(String _filename) throws Exception{
com.ab.banano.BANanoFetchResponse _response = null;
com.ab.banano.BANanoObject _blob = null;
com.ab.banano.BANanoFetch _fetch1 = null;
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoEvent _event = null;
com.ab.banano.BANanoObject _target = null;
String _dataurl = "";
 //BA.debugLineNum = 541;BA.debugLine="private Sub GetFileFromServer(FileName As String)";
 //BA.debugLineNum = 543;BA.debugLine="Dim Response As BANanoFetchResponse";
_response = new com.ab.banano.BANanoFetchResponse();
 //BA.debugLineNum = 544;BA.debugLine="Dim Blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 547;BA.debugLine="Dim fetch1 As BANanoFetch";
_fetch1 = new com.ab.banano.BANanoFetch();
 //BA.debugLineNum = 548;BA.debugLine="fetch1.Initialize(FileName, Null)";
_fetch1.Initialize(_filename,(com.ab.banano.BANanoFetchOptions)(__c.Null));
 //BA.debugLineNum = 549;BA.debugLine="fetch1.Then(Response)";
_fetch1.Then((Object)(_response));
 //BA.debugLineNum = 551;BA.debugLine="fetch1.Return(Response.Blob)";
_fetch1.Return(_response.Blob());
 //BA.debugLineNum = 552;BA.debugLine="fetch1.Then(Blob)";
_fetch1.Then((Object)(_blob.getObject()));
 //BA.debugLineNum = 555;BA.debugLine="Dim FileReader As BANanoObject";
_filereader = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 556;BA.debugLine="FileReader.Initialize2(\"FileReader\", Null)";
_filereader.Initialize2("FileReader",__c.Null);
 //BA.debugLineNum = 557;BA.debugLine="Dim event As BANanoEvent";
_event = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 559;BA.debugLine="FileReader.AddEventListenerOpen(\"onload\", Array(e";
_filereader.AddEventListenerOpen("onload",(Object)(new Object[]{(Object)(_event)}));
 //BA.debugLineNum = 561;BA.debugLine="Dim Target As BANanoObject = event.OtherField(\"ta";
_target = new com.ab.banano.BANanoObject();
_target = _event.OtherField("target");
 //BA.debugLineNum = 562;BA.debugLine="Dim DataUrl As String = Target.GetField(\"result\")";
_dataurl = BA.ObjectToString(_target.GetField("result").Result());
 //BA.debugLineNum = 564;BA.debugLine="Blobs.Put(FileName, DataUrl)";
_blobs.Put((Object)(_filename),(Object)(_dataurl));
 //BA.debugLineNum = 566;BA.debugLine="If Blobs.Size = NumFiles Then";
if (_blobs.getSize()==_numfiles) { 
 //BA.debugLineNum = 567;BA.debugLine="FilesAreReady";
_filesareready();
 };
 //BA.debugLineNum = 570;BA.debugLine="FileReader.CloseEventListener";
_filereader.CloseEventListener();
 //BA.debugLineNum = 572;BA.debugLine="FileReader.RunMethod(\"readAsDataURL\", Blob)";
_filereader.RunMethod("readAsDataURL",(Object)(_blob.getObject()));
 //BA.debugLineNum = 573;BA.debugLine="fetch1.End ' always end a fetch with this!";
_fetch1.End();
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getformdata(Object _data,String _filename) throws Exception{
com.ab.banano.BANanoObject _formdata = null;
 //BA.debugLineNum = 685;BA.debugLine="Sub GetFormData(data As Object, fileName As String";
 //BA.debugLineNum = 687;BA.debugLine="Dim formData As BANanoObject";
_formdata = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 688;BA.debugLine="formData.Initialize2(\"FormData\",Null)";
_formdata.Initialize2("FormData",__c.Null);
 //BA.debugLineNum = 689;BA.debugLine="formData.RunMethod(\"append\", Array(\"upload\", data";
_formdata.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_data,(Object)(_filename)}));
 //BA.debugLineNum = 690;BA.debugLine="Return formData";
if (true) return _formdata;
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public String  _getjson() throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub getJSON As String";
 //BA.debugLineNum = 480;BA.debugLine="Return mJSON";
if (true) return _mjson;
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return "";
}
public String  _getjsonpretty() throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub getJSONPretty As String";
 //BA.debugLineNum = 484;BA.debugLine="Return mJSONPretty";
if (true) return _mjsonpretty;
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfstyle  _getstyle(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
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
 //BA.debugLineNum = 115;BA.debugLine="Sub GetStyle(rec As Map) As PDFStyle";
 //BA.debugLineNum = 117;BA.debugLine="Dim name As String = rec.Get(\"name\")";
_name = BA.ObjectToString(_rec.Get((Object)("name")));
 //BA.debugLineNum = 118;BA.debugLine="Dim bold As Boolean = rec.get(\"bold\")";
_bold = BA.ObjectToBoolean(_rec.Get((Object)("bold")));
 //BA.debugLineNum = 119;BA.debugLine="Dim italics As Boolean = rec.Get(\"italics\")";
_italics = BA.ObjectToBoolean(_rec.Get((Object)("italics")));
 //BA.debugLineNum = 120;BA.debugLine="Dim alignment As String = rec.Get(\"alignment\")";
_alignment = BA.ObjectToString(_rec.Get((Object)("alignment")));
 //BA.debugLineNum = 121;BA.debugLine="Dim fontSize As Int = rec.Get(\"fontSize\")";
_fontsize = (int)(BA.ObjectToNumber(_rec.Get((Object)("fontSize"))));
 //BA.debugLineNum = 122;BA.debugLine="Dim marginleft As Int = rec.Get(\"marginleft\")";
_marginleft = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginleft"))));
 //BA.debugLineNum = 123;BA.debugLine="Dim margintop As Int = rec.Get(\"margintop\")";
_margintop = (int)(BA.ObjectToNumber(_rec.Get((Object)("margintop"))));
 //BA.debugLineNum = 124;BA.debugLine="Dim marginright As Int = rec.Get(\"marginright\")";
_marginright = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginright"))));
 //BA.debugLineNum = 125;BA.debugLine="Dim marginbottom As Int = rec.Get(\"marginbottom\")";
_marginbottom = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginbottom"))));
 //BA.debugLineNum = 126;BA.debugLine="Dim noborder As Boolean = rec.Get(\"noborder\")";
_noborder = BA.ObjectToBoolean(_rec.Get((Object)("noborder")));
 //BA.debugLineNum = 127;BA.debugLine="Dim borderleft As Boolean = rec.get(\"borderleft\")";
_borderleft = BA.ObjectToBoolean(_rec.Get((Object)("borderleft")));
 //BA.debugLineNum = 128;BA.debugLine="Dim bordertop As Boolean = rec.get(\"bordertop\")";
_bordertop = BA.ObjectToBoolean(_rec.Get((Object)("bordertop")));
 //BA.debugLineNum = 129;BA.debugLine="Dim borderright As Boolean = rec.get(\"borderright";
_borderright = BA.ObjectToBoolean(_rec.Get((Object)("borderright")));
 //BA.debugLineNum = 130;BA.debugLine="Dim borderbottom As Boolean = rec.get(\"borderbott";
_borderbottom = BA.ObjectToBoolean(_rec.Get((Object)("borderbottom")));
 //BA.debugLineNum = 131;BA.debugLine="Dim width As Int = rec.Get(\"width\")";
_width = (int)(BA.ObjectToNumber(_rec.Get((Object)("width"))));
 //BA.debugLineNum = 132;BA.debugLine="Dim height As Int = rec.get(\"height\")";
_height = (int)(BA.ObjectToNumber(_rec.Get((Object)("height"))));
 //BA.debugLineNum = 133;BA.debugLine="Dim color As String = rec.Get(\"color\")";
_color = BA.ObjectToString(_rec.Get((Object)("color")));
 //BA.debugLineNum = 134;BA.debugLine="Dim fillColor As String = rec.get(\"fillColor\")";
_fillcolor = BA.ObjectToString(_rec.Get((Object)("fillColor")));
 //BA.debugLineNum = 135;BA.debugLine="Dim background As String = rec.Get(\"background\")";
_background = BA.ObjectToString(_rec.Get((Object)("background")));
 //BA.debugLineNum = 136;BA.debugLine="Dim opacity As Double = rec.Get(\"opacity\")";
_opacity = (double)(BA.ObjectToNumber(_rec.Get((Object)("opacity"))));
 //BA.debugLineNum = 137;BA.debugLine="Dim angle As Int = rec.get(\"angle\")";
_angle = (int)(BA.ObjectToNumber(_rec.Get((Object)("angle"))));
 //BA.debugLineNum = 138;BA.debugLine="Dim columnGap As Int = rec.get(\"columnGap\")";
_columngap = (int)(BA.ObjectToNumber(_rec.Get((Object)("columnGap"))));
 //BA.debugLineNum = 139;BA.debugLine="Dim decoration As String = rec.Get(\"decoration\")";
_decoration = BA.ObjectToString(_rec.Get((Object)("decoration")));
 //BA.debugLineNum = 140;BA.debugLine="If decoration = \"none\" Then decoration = \"\"";
if ((_decoration).equals("none")) { 
_decoration = "";};
 //BA.debugLineNum = 141;BA.debugLine="Dim decorationStyle As String = rec.Get(\"decorati";
_decorationstyle = BA.ObjectToString(_rec.Get((Object)("decorationStyle")));
 //BA.debugLineNum = 142;BA.debugLine="If decorationStyle = \"none\" Then decorationStyle";
if ((_decorationstyle).equals("none")) { 
_decorationstyle = "";};
 //BA.debugLineNum = 143;BA.debugLine="Dim decorationColor As String = rec.Get(\"decorati";
_decorationcolor = BA.ObjectToString(_rec.Get((Object)("decorationColor")));
 //BA.debugLineNum = 144;BA.debugLine="Dim applymargins As Boolean = rec.Get(\"applymargi";
_applymargins = BA.ObjectToBoolean(_rec.Get((Object)("applymargins")));
 //BA.debugLineNum = 145;BA.debugLine="Dim applyborders As Boolean = rec.Get(\"applyborde";
_applyborders = BA.ObjectToBoolean(_rec.Get((Object)("applyborders")));
 //BA.debugLineNum = 147;BA.debugLine="Dim st As PDFStyle";
_st = new b4j.example.pdfstyle();
 //BA.debugLineNum = 148;BA.debugLine="st.Initialize";
_st._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 149;BA.debugLine="st.SetName(name)";
_st._setname /*b4j.example.pdfstyle*/ (_name);
 //BA.debugLineNum = 150;BA.debugLine="st.SetBold(bold)";
_st._setbold /*b4j.example.pdfstyle*/ (_bold);
 //BA.debugLineNum = 151;BA.debugLine="st.SetItalics(italics)";
_st._setitalics /*b4j.example.pdfstyle*/ (_italics);
 //BA.debugLineNum = 152;BA.debugLine="Select Case alignment";
switch (BA.switchObjectToInt(_alignment,"alignmentRight","alignmentCenter","alignmentJustify")) {
case 0: {
 //BA.debugLineNum = 154;BA.debugLine="st.alignmentRight = True";
_st._alignmentright /*boolean*/  = __c.True;
 break; }
case 1: {
 //BA.debugLineNum = 156;BA.debugLine="st.alignmentCenter = True";
_st._alignmentcenter /*boolean*/  = __c.True;
 break; }
case 2: {
 //BA.debugLineNum = 158;BA.debugLine="st.alignmentJustify = True";
_st._alignmentjustify /*boolean*/  = __c.True;
 break; }
}
;
 //BA.debugLineNum = 160;BA.debugLine="st.SetFontSize(fontSize)";
_st._setfontsize /*b4j.example.pdfstyle*/ (_fontsize);
 //BA.debugLineNum = 161;BA.debugLine="If applymargins Then";
if (_applymargins) { 
 //BA.debugLineNum = 162;BA.debugLine="st.SetMargin(marginleft, margintop, marginright,";
_st._setmargin /*b4j.example.pdfstyle*/ (_marginleft,_margintop,_marginright,_marginbottom);
 };
 //BA.debugLineNum = 164;BA.debugLine="If noborder Then";
if (_noborder) { 
 //BA.debugLineNum = 165;BA.debugLine="st.NoBorder";
_st._noborder /*b4j.example.pdfstyle*/ ();
 }else {
 //BA.debugLineNum = 167;BA.debugLine="If applyborders Then";
if (_applyborders) { 
 //BA.debugLineNum = 168;BA.debugLine="st.SetBorder(borderleft, bordertop, borderright";
_st._setborder /*b4j.example.pdfstyle*/ (_borderleft,_bordertop,_borderright,_borderbottom);
 };
 };
 //BA.debugLineNum = 171;BA.debugLine="st.SetWidth(width)";
_st._setwidth /*b4j.example.pdfstyle*/ (_width);
 //BA.debugLineNum = 172;BA.debugLine="st.setheight(height)";
_st._setheight /*b4j.example.pdfstyle*/ (_height);
 //BA.debugLineNum = 173;BA.debugLine="st.SetColor(color)";
_st._setcolor /*b4j.example.pdfstyle*/ (_color);
 //BA.debugLineNum = 174;BA.debugLine="st.SetFillColor(fillColor)";
_st._setfillcolor /*b4j.example.pdfstyle*/ (_fillcolor);
 //BA.debugLineNum = 175;BA.debugLine="st.setbackground(background)";
_st._setbackground /*b4j.example.pdfstyle*/ (_background);
 //BA.debugLineNum = 176;BA.debugLine="st.SetOpacity(opacity)";
_st._setopacity /*b4j.example.pdfstyle*/ (_opacity);
 //BA.debugLineNum = 177;BA.debugLine="st.SetAngle(angle)";
_st._setangle /*b4j.example.pdfstyle*/ (_angle);
 //BA.debugLineNum = 178;BA.debugLine="st.SetColumnGap(columnGap)";
_st._setcolumngap /*b4j.example.pdfstyle*/ (_columngap);
 //BA.debugLineNum = 179;BA.debugLine="Return st";
if (true) return _st;
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize As PDFMaker";
 //BA.debugLineNum = 36;BA.debugLine="BANano.DependsOnAsset(\"pdfmake.js\")";
_banano.DependsOnAsset("pdfmake.js");
 //BA.debugLineNum = 37;BA.debugLine="BANano.DependsOnAsset(\"vfs_fonts.js\")";
_banano.DependsOnAsset("vfs_fonts.js");
 //BA.debugLineNum = 38;BA.debugLine="BANano.DependsOnAsset(\"jquery.media.js\")";
_banano.DependsOnAsset("jquery.media.js");
 //BA.debugLineNum = 41;BA.debugLine="pdf.Initialize(\"pdfMake\")";
_pdf.Initialize((Object)("pdfMake"));
 //BA.debugLineNum = 42;BA.debugLine="Blobs.Initialize";
_blobs.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="docDefinition.Initialize";
_docdefinition.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="content.Initialize";
_content.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="defaultStyle.Initialize";
_defaultstyle._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 47;BA.debugLine="defaultStyle.name = \"defaultStyle\"";
_defaultstyle._name /*String*/  = "defaultStyle";
 //BA.debugLineNum = 48;BA.debugLine="pageSize = Null";
_pagesize = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 49;BA.debugLine="pageOrientation = Null";
_pageorientation = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 50;BA.debugLine="title = Null";
_title = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 51;BA.debugLine="author = Null";
_author = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 52;BA.debugLine="subject = Null";
_subject = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 53;BA.debugLine="keywords = Null";
_keywords = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 54;BA.debugLine="creator = Null";
_creator = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 55;BA.debugLine="producer = Null";
_producer = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 56;BA.debugLine="info.Initialize";
_info.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="compress = Null";
_compress = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 58;BA.debugLine="security.Initialize";
_security._initialize /*String*/ (ba);
 //BA.debugLineNum = 59;BA.debugLine="files.Initialize";
_files.Initialize();
 //BA.debugLineNum = 60;BA.debugLine="images.Initialize";
_images.Initialize();
 //BA.debugLineNum = 61;BA.debugLine="fileKeys.Initialize";
_filekeys.Initialize();
 //BA.debugLineNum = 62;BA.debugLine="mJSON = \"\"";
_mjson = "";
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public String  _open() throws Exception{
 //BA.debugLineNum = 533;BA.debugLine="Sub Open";
 //BA.debugLineNum = 535;BA.debugLine="action = \"open\"";
_action = "open";
 //BA.debugLineNum = 536;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _pagesizes() throws Exception{
anywheresoftware.b4a.objects.collections.List _ps = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _stritem = "";
 //BA.debugLineNum = 693;BA.debugLine="Sub PageSizes As Map";
 //BA.debugLineNum = 694;BA.debugLine="Dim ps As List";
_ps = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 695;BA.debugLine="ps.Initialize";
_ps.Initialize();
 //BA.debugLineNum = 696;BA.debugLine="ps.Add(\"4A0\")";
_ps.Add((Object)("4A0"));
 //BA.debugLineNum = 697;BA.debugLine="ps.Add(\"2A0\")";
_ps.Add((Object)("2A0"));
 //BA.debugLineNum = 698;BA.debugLine="ps.Add(\"A0\")";
_ps.Add((Object)("A0"));
 //BA.debugLineNum = 699;BA.debugLine="ps.Add(\"A1\")";
_ps.Add((Object)("A1"));
 //BA.debugLineNum = 700;BA.debugLine="ps.Add(\"A2\")";
_ps.Add((Object)("A2"));
 //BA.debugLineNum = 701;BA.debugLine="ps.Add(\"A3\")";
_ps.Add((Object)("A3"));
 //BA.debugLineNum = 702;BA.debugLine="ps.Add(\"A4\")";
_ps.Add((Object)("A4"));
 //BA.debugLineNum = 703;BA.debugLine="ps.Add(\"A5\")";
_ps.Add((Object)("A5"));
 //BA.debugLineNum = 704;BA.debugLine="ps.Add(\"A6\")";
_ps.Add((Object)("A6"));
 //BA.debugLineNum = 705;BA.debugLine="ps.Add(\"A7\")";
_ps.Add((Object)("A7"));
 //BA.debugLineNum = 706;BA.debugLine="ps.Add(\"A8\")";
_ps.Add((Object)("A8"));
 //BA.debugLineNum = 707;BA.debugLine="ps.Add(\"A9\")";
_ps.Add((Object)("A9"));
 //BA.debugLineNum = 708;BA.debugLine="ps.Add(\"A10\")";
_ps.Add((Object)("A10"));
 //BA.debugLineNum = 709;BA.debugLine="ps.Add(\"B0\")";
_ps.Add((Object)("B0"));
 //BA.debugLineNum = 710;BA.debugLine="ps.Add(\"B1\")";
_ps.Add((Object)("B1"));
 //BA.debugLineNum = 711;BA.debugLine="ps.Add(\"B2\")";
_ps.Add((Object)("B2"));
 //BA.debugLineNum = 712;BA.debugLine="ps.Add(\"B3\")";
_ps.Add((Object)("B3"));
 //BA.debugLineNum = 713;BA.debugLine="ps.Add(\"B4\")";
_ps.Add((Object)("B4"));
 //BA.debugLineNum = 714;BA.debugLine="ps.Add(\"B5\")";
_ps.Add((Object)("B5"));
 //BA.debugLineNum = 715;BA.debugLine="ps.Add(\"B6\")";
_ps.Add((Object)("B6"));
 //BA.debugLineNum = 716;BA.debugLine="ps.Add(\"B7\")";
_ps.Add((Object)("B7"));
 //BA.debugLineNum = 717;BA.debugLine="ps.Add(\"B8\")";
_ps.Add((Object)("B8"));
 //BA.debugLineNum = 718;BA.debugLine="ps.Add(\"B9\")";
_ps.Add((Object)("B9"));
 //BA.debugLineNum = 719;BA.debugLine="ps.Add(\"B10\")";
_ps.Add((Object)("B10"));
 //BA.debugLineNum = 720;BA.debugLine="ps.Add(\"C0\")";
_ps.Add((Object)("C0"));
 //BA.debugLineNum = 721;BA.debugLine="ps.Add(\"C1\")";
_ps.Add((Object)("C1"));
 //BA.debugLineNum = 722;BA.debugLine="ps.Add(\"C2\")";
_ps.Add((Object)("C2"));
 //BA.debugLineNum = 723;BA.debugLine="ps.Add(\"C3\")";
_ps.Add((Object)("C3"));
 //BA.debugLineNum = 724;BA.debugLine="ps.Add(\"C4\")";
_ps.Add((Object)("C4"));
 //BA.debugLineNum = 725;BA.debugLine="ps.Add(\"C5\")";
_ps.Add((Object)("C5"));
 //BA.debugLineNum = 726;BA.debugLine="ps.Add(\"C6\")";
_ps.Add((Object)("C6"));
 //BA.debugLineNum = 727;BA.debugLine="ps.Add(\"C7\")";
_ps.Add((Object)("C7"));
 //BA.debugLineNum = 728;BA.debugLine="ps.Add(\"C8\")";
_ps.Add((Object)("C8"));
 //BA.debugLineNum = 729;BA.debugLine="ps.Add(\"C9\")";
_ps.Add((Object)("C9"));
 //BA.debugLineNum = 730;BA.debugLine="ps.Add(\"C10\")";
_ps.Add((Object)("C10"));
 //BA.debugLineNum = 731;BA.debugLine="ps.Add(\"RA0\")";
_ps.Add((Object)("RA0"));
 //BA.debugLineNum = 732;BA.debugLine="ps.Add(\"RA1\")";
_ps.Add((Object)("RA1"));
 //BA.debugLineNum = 733;BA.debugLine="ps.Add(\"RA2\")";
_ps.Add((Object)("RA2"));
 //BA.debugLineNum = 734;BA.debugLine="ps.Add(\"RA3\")";
_ps.Add((Object)("RA3"));
 //BA.debugLineNum = 735;BA.debugLine="ps.Add(\"RA4\")";
_ps.Add((Object)("RA4"));
 //BA.debugLineNum = 736;BA.debugLine="ps.Add(\"SRA0\")";
_ps.Add((Object)("SRA0"));
 //BA.debugLineNum = 737;BA.debugLine="ps.Add(\"SRA1\")";
_ps.Add((Object)("SRA1"));
 //BA.debugLineNum = 738;BA.debugLine="ps.Add(\"SRA2\")";
_ps.Add((Object)("SRA2"));
 //BA.debugLineNum = 739;BA.debugLine="ps.Add(\"SRA3\")";
_ps.Add((Object)("SRA3"));
 //BA.debugLineNum = 740;BA.debugLine="ps.Add(\"SRA4\")";
_ps.Add((Object)("SRA4"));
 //BA.debugLineNum = 741;BA.debugLine="ps.Add(\"EXECUTIVE\")";
_ps.Add((Object)("EXECUTIVE"));
 //BA.debugLineNum = 742;BA.debugLine="ps.Add(\"FOLIO\")";
_ps.Add((Object)("FOLIO"));
 //BA.debugLineNum = 743;BA.debugLine="ps.Add(\"LEGAL\")";
_ps.Add((Object)("LEGAL"));
 //BA.debugLineNum = 744;BA.debugLine="ps.Add(\"LETTER\")";
_ps.Add((Object)("LETTER"));
 //BA.debugLineNum = 745;BA.debugLine="ps.Add(\"TABLOID\")";
_ps.Add((Object)("TABLOID"));
 //BA.debugLineNum = 747;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 748;BA.debugLine="For Each strItem As String In ps";
{
final anywheresoftware.b4a.BA.IterableList group54 = _ps;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_stritem = BA.ObjectToString(group54.Get(index54));
 //BA.debugLineNum = 749;BA.debugLine="m.Put(strItem, strItem)";
_m.Put((Object)(_stritem),(Object)(_stritem));
 }
};
 //BA.debugLineNum = 751;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 752;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _preload(String _key,String _url) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub Preload(key As String, url As String) As PDFMa";
 //BA.debugLineNum = 248;BA.debugLine="files.Put(key, url)";
_files.Put((Object)(_key),(Object)(_url));
 //BA.debugLineNum = 249;BA.debugLine="fileKeys.Put(url, key)";
_filekeys.Put((Object)(_url),(Object)(_key));
 //BA.debugLineNum = 251;BA.debugLine="NumFiles = files.size";
_numfiles = _files.getSize();
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public String  _print() throws Exception{
 //BA.debugLineNum = 526;BA.debugLine="Sub Print";
 //BA.debugLineNum = 528;BA.debugLine="action = \"print\"";
_action = "print";
 //BA.debugLineNum = 529;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setauthor(String _sauthor) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetAuthor(sauthor As String) As PDFMaker";
 //BA.debugLineNum = 219;BA.debugLine="If sauthor = \"\" Then Return Me";
if ((_sauthor).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 220;BA.debugLine="author = sauthor";
_author = _sauthor;
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setbackground(b4j.example.pdftext _wm) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetBackground(wm As PDFText) As PDFMaker";
 //BA.debugLineNum = 328;BA.debugLine="docDefinition.Put(\"background\", wm.Content)";
_docdefinition.Put((Object)("background"),(Object)(_wm._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setcompress(boolean _bcompress) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetCompress(bcompress As Boolean) As PDFMaker";
 //BA.debugLineNum = 192;BA.debugLine="compress = bcompress";
_compress = _bcompress;
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setcreator(String _screator) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetCreator(screator As String) As PDFMaker";
 //BA.debugLineNum = 198;BA.debugLine="If screator = \"\" Then Return Me";
if ((_screator).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 199;BA.debugLine="creator = screator";
_creator = _screator;
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public String  _setdefaultstyle(anywheresoftware.b4a.objects.collections.Map _ds) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetDefaultStyle(ds As Map)";
 //BA.debugLineNum = 99;BA.debugLine="If ds.IsInitialized Then";
if (_ds.IsInitialized()) { 
 //BA.debugLineNum = 100;BA.debugLine="ds.Put(\"name\", \"defaultStyle\")";
_ds.Put((Object)("name"),(Object)("defaultStyle"));
 //BA.debugLineNum = 101;BA.debugLine="defaultStyle = GetStyle(ds)";
_defaultstyle = _getstyle(_ds);
 };
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _setdocumentproperties(anywheresoftware.b4a.objects.collections.Map _docprops) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetDocumentProperties(docprops As Map)";
 //BA.debugLineNum = 69;BA.debugLine="SetAuthor(docprops.Get(\"author\"))";
_setauthor(BA.ObjectToString(_docprops.Get((Object)("author"))));
 //BA.debugLineNum = 70;BA.debugLine="SetTitle(docprops.Get(\"title\"))";
_settitle(BA.ObjectToString(_docprops.Get((Object)("title"))));
 //BA.debugLineNum = 71;BA.debugLine="SetSubject(docprops.Get(\"subject\"))";
_setsubject(BA.ObjectToString(_docprops.Get((Object)("subject"))));
 //BA.debugLineNum = 72;BA.debugLine="SetKeywords(docprops.Get(\"keywords\"))";
_setkeywords(BA.ObjectToString(_docprops.Get((Object)("keywords"))));
 //BA.debugLineNum = 73;BA.debugLine="SetCreator(docprops.Get(\"creator\"))";
_setcreator(BA.ObjectToString(_docprops.Get((Object)("creator"))));
 //BA.debugLineNum = 74;BA.debugLine="SetProducer(docprops.Get(\"producer\"))";
_setproducer(BA.ObjectToString(_docprops.Get((Object)("producer"))));
 //BA.debugLineNum = 75;BA.debugLine="SetCompress(docprops.Get(\"compress\"))";
_setcompress(BA.ObjectToBoolean(_docprops.Get((Object)("compress"))));
 //BA.debugLineNum = 76;BA.debugLine="security.Set(\"userPassword\", docprops.Get(\"userPa";
_security._set /*String*/ ("userPassword",_docprops.Get((Object)("userPassword")));
 //BA.debugLineNum = 77;BA.debugLine="security.Set(\"ownerPassword\", docprops.Get(\"owner";
_security._set /*String*/ ("ownerPassword",_docprops.Get((Object)("ownerPassword")));
 //BA.debugLineNum = 78;BA.debugLine="security.Set(\"modifying\", docprops.Get(\"modifying";
_security._set /*String*/ ("modifying",_docprops.Get((Object)("modifying")));
 //BA.debugLineNum = 79;BA.debugLine="security.Set(\"copying\", docprops.Get(\"copying\"))";
_security._set /*String*/ ("copying",_docprops.Get((Object)("copying")));
 //BA.debugLineNum = 80;BA.debugLine="security.Set(\"annotating\", docprops.Get(\"annotati";
_security._set /*String*/ ("annotating",_docprops.Get((Object)("annotating")));
 //BA.debugLineNum = 81;BA.debugLine="security.Set(\"fillingForms\", docprops.Get(\"fillin";
_security._set /*String*/ ("fillingForms",_docprops.Get((Object)("fillingForms")));
 //BA.debugLineNum = 82;BA.debugLine="security.Set(\"contentAccessibility\", docprops.Get";
_security._set /*String*/ ("contentAccessibility",_docprops.Get((Object)("contentAccessibility")));
 //BA.debugLineNum = 83;BA.debugLine="security.Set(\"documentAssembly\", docprops.Get(\"do";
_security._set /*String*/ ("documentAssembly",_docprops.Get((Object)("documentAssembly")));
 //BA.debugLineNum = 84;BA.debugLine="security.Set(\"printing\", docprops.Get(\"printing\")";
_security._set /*String*/ ("printing",_docprops.Get((Object)("printing")));
 //BA.debugLineNum = 85;BA.debugLine="SetPageSize(docprops.Get(\"pageSize\"))";
_setpagesize(BA.ObjectToString(_docprops.Get((Object)("pageSize"))));
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setheader(b4j.example.pdftext _hdr) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetHeader(hdr As PDFText) As PDFMaker";
 //BA.debugLineNum = 335;BA.debugLine="docDefinition.Put(\"header\", hdr.content)";
_docdefinition.Put((Object)("header"),(Object)(_hdr._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setkeywords(String _skeywords) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetKeywords(skeywords As String) As PDFMaker";
 //BA.debugLineNum = 205;BA.debugLine="If skeywords = \"\" Then Return Me";
if ((_skeywords).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 206;BA.debugLine="keywords = skeywords";
_keywords = _skeywords;
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpagemargins(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 271;BA.debugLine="Sub SetPageMargins(l As Int, t As Int, r As Int, b";
 //BA.debugLineNum = 273;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 274;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 275;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 276;BA.debugLine="docDefinition.Put(\"pageMargins\", margin)";
_docdefinition.Put((Object)("pageMargins"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpageorientation(String _spageorientation) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
 //BA.debugLineNum = 240;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 241;BA.debugLine="pageOrientation = spageOrientation";
_pageorientation = _spageorientation;
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpagesize(String _spagesize) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetPageSize(spageSize As String) As PDFMaker";
 //BA.debugLineNum = 233;BA.debugLine="If spageSize = \"\" Then Return Me";
if ((_spagesize).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 234;BA.debugLine="pageSize = spageSize";
_pagesize = _spagesize;
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setproducer(String _sproducer) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetProducer(sproducer As String) As PDFMaker";
 //BA.debugLineNum = 185;BA.debugLine="If sproducer = \"\" Then Return Me";
if ((_sproducer).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 186;BA.debugLine="producer = sproducer";
_producer = _sproducer;
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setprogresscallback(Object _module,String _methodname,anywheresoftware.b4a.objects.collections.List _params) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 90;BA.debugLine="Sub SetProgressCallback(module As Object, methodNa";
 //BA.debugLineNum = 91;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,_params)));
 //BA.debugLineNum = 92;BA.debugLine="docDefinition.Put(\"progressCallback\", cb)";
_docdefinition.Put((Object)("progressCallback"),(Object)(_cb.getObject()));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public String  _setstyles(anywheresoftware.b4a.objects.collections.Map _allstyles) throws Exception{
String _sk = "";
anywheresoftware.b4a.objects.collections.Map _sv = null;
b4j.example.pdfstyle _ts = null;
 //BA.debugLineNum = 105;BA.debugLine="Sub SetStyles(allStyles As Map)";
 //BA.debugLineNum = 107;BA.debugLine="For Each sk As String In allStyles.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _allstyles.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_sk = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 108;BA.debugLine="Dim sv As Map = allStyles.Get(sk)";
_sv = new anywheresoftware.b4a.objects.collections.Map();
_sv.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_allstyles.Get((Object)(_sk))));
 //BA.debugLineNum = 109;BA.debugLine="Dim ts As PDFStyle = GetStyle(sv)";
_ts = _getstyle(_sv);
 //BA.debugLineNum = 110;BA.debugLine="AddStyle(ts)";
_addstyle(_ts);
 }
};
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setsubject(String _ssubject) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetSubject(ssubject As String) As PDFMaker";
 //BA.debugLineNum = 212;BA.debugLine="If ssubject = \"\" Then Return Me";
if ((_ssubject).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 213;BA.debugLine="subject = ssubject";
_subject = _ssubject;
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _settitle(String _stitle) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetTitle(stitle As String) As PDFMaker";
 //BA.debugLineNum = 226;BA.debugLine="If stitle = \"\" Then Return Me";
if ((_stitle).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 227;BA.debugLine="title = stitle";
_title = _stitle;
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setwatermark(b4j.example.pdftext _wm) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetWaterMark(wm As PDFText) As PDFMaker";
 //BA.debugLineNum = 321;BA.debugLine="docDefinition.Put(\"watermark\", wm.Content)";
_docdefinition.Put((Object)("watermark"),(Object)(_wm._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public String  _upload(Object _module,String _methodname,String _filename) throws Exception{
 //BA.debugLineNum = 675;BA.debugLine="Sub Upload(module As Object, methodName As String,";
 //BA.debugLineNum = 676;BA.debugLine="Log(\"PDFMaker.Upload\")";
__c.Log("PDFMaker.Upload");
 //BA.debugLineNum = 677;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 678;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 679;BA.debugLine="fName = fileName";
_fname = _filename;
 //BA.debugLineNum = 680;BA.debugLine="action = \"upload\"";
_action = "upload";
 //BA.debugLineNum = 681;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 682;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "FORREADING"))
	return _forreading((Object) args[0]);
if (BA.fastSubCompare(sub, "FORUPLOAD"))
	return _forupload((Object) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
