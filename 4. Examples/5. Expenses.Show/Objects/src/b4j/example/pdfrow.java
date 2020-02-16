package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfrow.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _row = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.pdfrow  _initialize(b4j.example.pdfrow __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfrow";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfrow) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=56229888;
 //BA.debugLineNum = 56229888;BA.debugLine="Public Sub Initialize As PDFRow";
RDebugUtils.currentLine=56229889;
 //BA.debugLineNum = 56229889;BA.debugLine="row.Initialize";
__ref._row /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=56229890;
 //BA.debugLineNum = 56229890;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
RDebugUtils.currentLine=56229891;
 //BA.debugLineNum = 56229891;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addempty(b4j.example.pdfrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfrow";
if (Debug.shouldDelegate(ba, "addempty", true))
	 {return ((b4j.example.pdfrow) Debug.delegate(ba, "addempty", null));}
RDebugUtils.currentLine=56360960;
 //BA.debugLineNum = 56360960;BA.debugLine="Sub AddEmpty As PDFRow";
RDebugUtils.currentLine=56360961;
 //BA.debugLineNum = 56360961;BA.debugLine="row.Add(CreateMap())";
__ref._row /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {}).getObject()));
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
RDebugUtils.currentLine=56360963;
 //BA.debugLineNum = 56360963;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addimage(b4j.example.pdfrow __ref,b4j.example.pdfimage _img) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfrow";
if (Debug.shouldDelegate(ba, "addimage", true))
	 {return ((b4j.example.pdfrow) Debug.delegate(ba, "addimage", new Object[] {_img}));}
RDebugUtils.currentLine=56295424;
 //BA.debugLineNum = 56295424;BA.debugLine="Sub AddImage(img As PDFImage) As PDFRow";
RDebugUtils.currentLine=56295425;
 //BA.debugLineNum = 56295425;BA.debugLine="row.Add(img.Content)";
__ref._row /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_img._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
RDebugUtils.currentLine=56295427;
 //BA.debugLineNum = 56295427;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addlist(b4j.example.pdfrow __ref,b4j.example.pdflist _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfrow";
if (Debug.shouldDelegate(ba, "addlist", true))
	 {return ((b4j.example.pdfrow) Debug.delegate(ba, "addlist", new Object[] {_lst}));}
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Sub AddList(lst As PDFList) As PDFRow";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="row.Add(lst.Content)";
__ref._row /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lst._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=56426498;
 //BA.debugLineNum = 56426498;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
RDebugUtils.currentLine=56426499;
 //BA.debugLineNum = 56426499;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addstring(b4j.example.pdfrow __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfrow";
if (Debug.shouldDelegate(ba, "addstring", true))
	 {return ((b4j.example.pdfrow) Debug.delegate(ba, "addstring", new Object[] {_txt}));}
RDebugUtils.currentLine=56623104;
 //BA.debugLineNum = 56623104;BA.debugLine="Sub AddString(txt As String) As PDFRow";
RDebugUtils.currentLine=56623105;
 //BA.debugLineNum = 56623105;BA.debugLine="row.Add(txt)";
__ref._row /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt));
RDebugUtils.currentLine=56623106;
 //BA.debugLineNum = 56623106;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
RDebugUtils.currentLine=56623107;
 //BA.debugLineNum = 56623107;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addtable(b4j.example.pdfrow __ref,b4j.example.pdftable _tbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfrow";
if (Debug.shouldDelegate(ba, "addtable", true))
	 {return ((b4j.example.pdfrow) Debug.delegate(ba, "addtable", new Object[] {_tbl}));}
RDebugUtils.currentLine=56557568;
 //BA.debugLineNum = 56557568;BA.debugLine="Sub AddTable(tbl As PDFTable) As PDFRow";
RDebugUtils.currentLine=56557569;
 //BA.debugLineNum = 56557569;BA.debugLine="row.Add(tbl.Content)";
__ref._row /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tbl._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
RDebugUtils.currentLine=56557571;
 //BA.debugLineNum = 56557571;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addtext(b4j.example.pdfrow __ref,b4j.example.pdftext _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfrow";
if (Debug.shouldDelegate(ba, "addtext", true))
	 {return ((b4j.example.pdfrow) Debug.delegate(ba, "addtext", new Object[] {_txt}));}
RDebugUtils.currentLine=56492032;
 //BA.debugLineNum = 56492032;BA.debugLine="Sub AddText(txt As PDFText) As PDFRow";
RDebugUtils.currentLine=56492033;
 //BA.debugLineNum = 56492033;BA.debugLine="row.Add(txt.Content)";
__ref._row /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
RDebugUtils.currentLine=56492035;
 //BA.debugLineNum = 56492035;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdfrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfrow";
RDebugUtils.currentLine=56164352;
 //BA.debugLineNum = 56164352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=56164353;
 //BA.debugLineNum = 56164353;BA.debugLine="Private row As List";
_row = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56164354;
 //BA.debugLineNum = 56164354;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getcontent(b4j.example.pdfrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfrow";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Sub getContent As List";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="Return row";
if (true) return __ref._row /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=56688642;
 //BA.debugLineNum = 56688642;BA.debugLine="End Sub";
return null;
}
}