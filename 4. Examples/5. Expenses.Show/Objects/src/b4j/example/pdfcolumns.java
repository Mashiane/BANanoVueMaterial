package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfcolumns extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfcolumns", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfcolumns.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _columnsint = null;
public int _columngap = 0;
public anywheresoftware.b4a.objects.collections.Map _cols = null;
public b4j.example.pdfstyle _style = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.pdfcolumns  _addcolumns(b4j.example.pdfcolumns __ref,b4j.example.pdfcolumns _colsx) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "addcolumns", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "addcolumns", new Object[] {_colsx}));}
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="Sub AddColumns(colsx As PDFColumns) As PDFColumns";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="columnsInt.Add(colsx.Content)";
__ref._columnsint /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_colsx._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48758787;
 //BA.debugLineNum = 48758787;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdfcolumns __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=49020928;
 //BA.debugLineNum = 49020928;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=49020929;
 //BA.debugLineNum = 49020929;BA.debugLine="If columnsInt.Size > 0 Then";
if (__ref._columnsint /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=49020930;
 //BA.debugLineNum = 49020930;BA.debugLine="cols.Put(\"columnGap\", columnGap)";
__ref._cols /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("columnGap"),(Object)(__ref._columngap /*int*/ ));
RDebugUtils.currentLine=49020931;
 //BA.debugLineNum = 49020931;BA.debugLine="cols.Put(\"columns\", columnsInt)";
__ref._cols /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("columns"),(Object)(__ref._columnsint /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 };
RDebugUtils.currentLine=49020933;
 //BA.debugLineNum = 49020933;BA.debugLine="style.Include(cols)";
__ref._style /*b4j.example.pdfstyle*/ ._include /*String*/ (null,__ref._cols /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=49020934;
 //BA.debugLineNum = 49020934;BA.debugLine="Return cols";
if (true) return __ref._cols /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=49020935;
 //BA.debugLineNum = 49020935;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _addlist(b4j.example.pdfcolumns __ref,b4j.example.pdflist _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "addlist", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "addlist", new Object[] {_lst}));}
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Sub AddList(lst As PDFList) As PDFColumns";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="columnsInt.Add(lst.Content)";
__ref._columnsint /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lst._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48562179;
 //BA.debugLineNum = 48562179;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _addstack(b4j.example.pdfcolumns __ref,b4j.example.pdfstack _stack) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "addstack", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "addstack", new Object[] {_stack}));}
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Sub AddStack(stack As PDFStack) As PDFColumns";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="columnsInt.Add(stack.Content)";
__ref._columnsint /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48627715;
 //BA.debugLineNum = 48627715;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _addstring(b4j.example.pdfcolumns __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "addstring", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "addstring", new Object[] {_txt}));}
RDebugUtils.currentLine=48824320;
 //BA.debugLineNum = 48824320;BA.debugLine="Sub AddString(txt As String) As PDFColumns";
RDebugUtils.currentLine=48824321;
 //BA.debugLineNum = 48824321;BA.debugLine="columnsInt.Add(txt)";
__ref._columnsint /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt));
RDebugUtils.currentLine=48824322;
 //BA.debugLineNum = 48824322;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48824323;
 //BA.debugLineNum = 48824323;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _addtext(b4j.example.pdfcolumns __ref,b4j.example.pdftext _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "addtext", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "addtext", new Object[] {_text}));}
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Sub AddText(text As PDFText) As PDFColumns";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="columnsInt.Add(text.Content)";
__ref._columnsint /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_text._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48693251;
 //BA.debugLineNum = 48693251;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdfcolumns __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="Private columnsInt As List";
_columnsint = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="Public columnGap As Int";
_columngap = 0;
RDebugUtils.currentLine=48365571;
 //BA.debugLineNum = 48365571;BA.debugLine="Private cols As Map";
_cols = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48365572;
 //BA.debugLineNum = 48365572;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
RDebugUtils.currentLine=48365573;
 //BA.debugLineNum = 48365573;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfcolumns  _initialize(b4j.example.pdfcolumns __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Public Sub Initialize As PDFColumns";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="columnsInt.Initialize";
__ref._columnsint /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="columnGap = 10";
__ref._columngap /*int*/  = (int) (10);
RDebugUtils.currentLine=48431107;
 //BA.debugLineNum = 48431107;BA.debugLine="cols.Initialize";
__ref._cols /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=48431108;
 //BA.debugLineNum = 48431108;BA.debugLine="style.Initialize";
__ref._style /*b4j.example.pdfstyle*/ ._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=48431109;
 //BA.debugLineNum = 48431109;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48431110;
 //BA.debugLineNum = 48431110;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _setabsoluteposition(b4j.example.pdfcolumns __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "setabsoluteposition", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "setabsoluteposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=48496643;
 //BA.debugLineNum = 48496643;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=48496644;
 //BA.debugLineNum = 48496644;BA.debugLine="cols.Put(\"absolutePosition\", opt)";
__ref._cols /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
RDebugUtils.currentLine=48496645;
 //BA.debugLineNum = 48496645;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48496646;
 //BA.debugLineNum = 48496646;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _setpagebreakafter(b4j.example.pdfcolumns __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "setpagebreakafter", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "setpagebreakafter", null));}
RDebugUtils.currentLine=48955392;
 //BA.debugLineNum = 48955392;BA.debugLine="Sub SetPageBreakAfter As PDFColumns";
RDebugUtils.currentLine=48955393;
 //BA.debugLineNum = 48955393;BA.debugLine="cols.Put(\"pageBreak\", \"after\")";
__ref._cols /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));
RDebugUtils.currentLine=48955394;
 //BA.debugLineNum = 48955394;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48955395;
 //BA.debugLineNum = 48955395;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _setpagebreakbefore(b4j.example.pdfcolumns __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfcolumns";
if (Debug.shouldDelegate(ba, "setpagebreakbefore", true))
	 {return ((b4j.example.pdfcolumns) Debug.delegate(ba, "setpagebreakbefore", null));}
RDebugUtils.currentLine=48889856;
 //BA.debugLineNum = 48889856;BA.debugLine="Sub SetPageBreakBefore As PDFColumns";
RDebugUtils.currentLine=48889857;
 //BA.debugLineNum = 48889857;BA.debugLine="cols.Put(\"pageBreak\", \"before\")";
__ref._cols /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));
RDebugUtils.currentLine=48889858;
 //BA.debugLineNum = 48889858;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
RDebugUtils.currentLine=48889859;
 //BA.debugLineNum = 48889859;BA.debugLine="End Sub";
return null;
}
}