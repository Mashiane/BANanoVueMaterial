package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananooxml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananooxml", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananooxml.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _oxmlcell{
public boolean IsInitialized;
public String typeOf;
public String value;
public String formula;
public anywheresoftware.b4a.objects.collections.Map style;
public void Initialize() {
IsInitialized = true;
typeOf = "";
value = "";
formula = "";
style = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _oxmlrow{
public boolean IsInitialized;
public int rowIndex;
public int columnIndex;
public anywheresoftware.b4a.objects.collections.List values;
public anywheresoftware.b4a.objects.collections.Map style;
public void Initialize() {
IsInitialized = true;
rowIndex = 0;
columnIndex = 0;
values = new anywheresoftware.b4a.objects.collections.List();
style = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _oxmlstyle{
public boolean IsInitialized;
public boolean bold;
public boolean italic;
public boolean underline;
public boolean strike;
public String fontSize;
public String fontColor;
public String fontName;
public String fontFamily;
public String scheme;
public String numberFrmat;
public String borderColor;
public String borderThickness;
public String hAlignment;
public String vAlignment;
public String FillPattern;
public String FillForeColor;
public String FillBackground;
public void Initialize() {
IsInitialized = true;
bold = false;
italic = false;
underline = false;
strike = false;
fontSize = "";
fontColor = "";
fontName = "";
fontFamily = "";
scheme = "";
numberFrmat = "";
borderColor = "";
borderThickness = "";
hAlignment = "";
vAlignment = "";
FillPattern = "";
FillForeColor = "";
FillBackground = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANano _banano = null;
public com.ab.banano.BANanoObject _workbook = null;
public com.ab.banano.BANanoObject _oxml = null;
public String _fname = "";
public String _borderthick = "";
public String _bordernone = "";
public String _borderthin = "";
public String _bordermedium = "";
public String _borderdashed = "";
public String _borderdotted = "";
public String _borderdouble = "";
public String _borderhair = "";
public String _bordermediumdashed = "";
public String _borderdashdot = "";
public String _bordermediumdashdot = "";
public String _borderdashdotdot = "";
public String _bordermediumdashdotdot = "";
public String _borderslantdashdot = "";
public String _colors_red = "";
public String _colors_pink = "";
public String _colors_purple = "";
public String _colors_deeppurple = "";
public String _colors_indigo = "";
public String _colors_blue = "";
public String _colors_lightblue = "";
public String _colors_cyan = "";
public String _colors_teal = "";
public String _colors_green = "";
public String _colors_lightgreen = "";
public String _colors_lime = "";
public String _colors_yellow = "";
public String _colors_amber = "";
public String _colors_orange = "";
public String _colors_deeporange = "";
public String _colors_brown = "";
public String _colors_grey = "";
public String _colors_bluegrey = "";
public String _colors_black = "";
public String _colors_white = "";
public String _colors_transparent = "";
public String _pattern_darkdown = "";
public String _pattern_darkgray = "";
public String _pattern_darkgrid = "";
public String _pattern_darkhorizontal = "";
public String _pattern_darktrellis = "";
public String _pattern_darkup = "";
public String _pattern_darkvertical = "";
public String _pattern_gray0625 = "";
public String _pattern_gray125 = "";
public String _pattern_lightdown = "";
public String _pattern_lightgray = "";
public String _pattern_lightgrid = "";
public String _pattern_lighthorizontal = "";
public String _pattern_lighttrellis = "";
public String _pattern_lightup = "";
public String _pattern_lightvertical = "";
public String _pattern_mediumgray = "";
public String _pattern_none = "";
public String _pattern_solid = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.bananooxml  _addrowformula(b4j.example.bananooxml __ref,b4j.example.bananooxml._oxmlrow _row,String _formula) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "addrowformula", true))
	 {return ((b4j.example.bananooxml) Debug.delegate(ba, "addrowformula", new Object[] {_row,_formula}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub AddRowFormula(row As OXMLRow, formula As Strin";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createformula /*b4j.example.bananooxml._oxmlcell*/ (null,_formula));
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="row.values.Add(cell)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cell.getObject()));
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _cell2map(b4j.example.bananooxml __ref,b4j.example.bananooxml._oxmlcell _cell) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "cell2map", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "cell2map", new Object[] {_cell}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="private Sub Cell2Map(cell As OXMLCell) As Map";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="m.Put(\"type\", cell.typeOf)";
_m.Put((Object)("type"),(Object)(_cell.typeOf /*String*/ ));
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="m.Put(\"value\", cell.value)";
_m.Put((Object)("value"),(Object)(_cell.value /*String*/ ));
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="If cell.formula <> \"\" Then";
if ((_cell.formula /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="m.Put(\"formula\", cell.formula)";
_m.Put((Object)("formula"),(Object)(_cell.formula /*String*/ ));
 };
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlcell  _createformula(b4j.example.bananooxml __ref,String _formula) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "createformula", true))
	 {return ((b4j.example.bananooxml._oxmlcell) Debug.delegate(ba, "createformula", new Object[] {_formula}));}
b4j.example.bananooxml._oxmlcell _cell = null;
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="private Sub CreateFormula(formula As String) As OX";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Dim cell As OXMLCell";
_cell = new b4j.example.bananooxml._oxmlcell();
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="cell.Initialize";
_cell.Initialize();
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="cell.typeOf = \"formula\"";
_cell.typeOf /*String*/  = "formula";
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="cell.formula = formula";
_cell.formula /*String*/  = _formula;
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="cell.style = CreateMap()";
_cell.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="Return cell";
if (true) return _cell;
RDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml  _addrowformula1(b4j.example.bananooxml __ref,b4j.example.bananooxml._oxmlrow _row,String _formula,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "addrowformula1", true))
	 {return ((b4j.example.bananooxml) Debug.delegate(ba, "addrowformula1", new Object[] {_row,_formula,_value}));}
b4j.example.bananooxml._oxmlcell _cell = null;
anywheresoftware.b4a.objects.collections.Map _cellv = null;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub AddRowFormula1(row As OXMLRow, formula As Stri";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
_cell = __ref._createformula /*b4j.example.bananooxml._oxmlcell*/ (null,_formula);
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
_cellv = new anywheresoftware.b4a.objects.collections.Map();
_cellv = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,_cell);
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="row.values.Add(cellV)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cellv.getObject()));
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml  _addrownumber(b4j.example.bananooxml __ref,b4j.example.bananooxml._oxmlrow _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "addrownumber", true))
	 {return ((b4j.example.bananooxml) Debug.delegate(ba, "addrownumber", new Object[] {_row,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub AddRowNumber(row As OXMLRow, value As String)";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createnumber /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="row.values.Add(cell)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cell.getObject()));
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlcell  _createnumber(b4j.example.bananooxml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "createnumber", true))
	 {return ((b4j.example.bananooxml._oxmlcell) Debug.delegate(ba, "createnumber", new Object[] {_value}));}
b4j.example.bananooxml._oxmlcell _cell = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="private Sub CreateNumber(value As String) As OXMLC";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Dim cell As OXMLCell";
_cell = new b4j.example.bananooxml._oxmlcell();
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="cell.Initialize";
_cell.Initialize();
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="cell.typeOf = \"numeric\"";
_cell.typeOf /*String*/  = "numeric";
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="cell.style = CreateMap()";
_cell.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Return cell";
if (true) return _cell;
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml  _addrowsharedtext(b4j.example.bananooxml __ref,b4j.example.bananooxml._oxmlrow _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "addrowsharedtext", true))
	 {return ((b4j.example.bananooxml) Debug.delegate(ba, "addrowsharedtext", new Object[] {_row,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Sub AddRowSharedText(row As OXMLRow, value As Stri";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createsharedtext /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="row.values.Add(cell)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cell.getObject()));
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlcell  _createsharedtext(b4j.example.bananooxml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "createsharedtext", true))
	 {return ((b4j.example.bananooxml._oxmlcell) Debug.delegate(ba, "createsharedtext", new Object[] {_value}));}
b4j.example.bananooxml._oxmlcell _cell = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="private Sub CreateSharedText(value As String) As O";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Dim cell As OXMLCell";
_cell = new b4j.example.bananooxml._oxmlcell();
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="cell.Initialize";
_cell.Initialize();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="cell.typeOf = \"sharedString\"";
_cell.typeOf /*String*/  = "sharedString";
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="cell.style = CreateMap()";
_cell.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="Return cell";
if (true) return _cell;
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml  _addrowtext(b4j.example.bananooxml __ref,b4j.example.bananooxml._oxmlrow _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "addrowtext", true))
	 {return ((b4j.example.bananooxml) Debug.delegate(ba, "addrowtext", new Object[] {_row,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub AddRowText(row As OXMLRow, value As String) As";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createtext /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="row.values.Add(cell)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cell.getObject()));
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlcell  _createtext(b4j.example.bananooxml __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "createtext", true))
	 {return ((b4j.example.bananooxml._oxmlcell) Debug.delegate(ba, "createtext", new Object[] {_value}));}
b4j.example.bananooxml._oxmlcell _cell = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="private Sub CreateText(value As String) As OXMLCel";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim cell As OXMLCell";
_cell = new b4j.example.bananooxml._oxmlcell();
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="cell.Initialize";
_cell.Initialize();
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="cell.typeOf = \"string\"";
_cell.typeOf /*String*/  = "string";
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="cell.style = CreateMap()";
_cell.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="Return cell";
if (true) return _cell;
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.bananooxml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="Public WorkBook As BANanoObject";
_workbook = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Private oxml As BANanoObject";
_oxml = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Private fName As String";
_fname = "";
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Type OXMLCell(typeOf As String, value As String,";
;
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="Type OXMLRow(rowIndex As Int, columnIndex As Int,";
;
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="Type OXMLStyle(bold As Boolean, italic As Boolean";
;
RDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="Public const BorderThick As String = \"thick\"";
_borderthick = "thick";
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="Public const BorderNone As String = \"none\"";
_bordernone = "none";
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="Public const BorderThin As String = \"thin\"";
_borderthin = "thin";
RDebugUtils.currentLine=11337742;
 //BA.debugLineNum = 11337742;BA.debugLine="Public const BorderMedium As String = \"medium\"";
_bordermedium = "medium";
RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="Public const BorderDashed As String = \"dashed\"";
_borderdashed = "dashed";
RDebugUtils.currentLine=11337744;
 //BA.debugLineNum = 11337744;BA.debugLine="Public const BorderDotted As String = \"dotted\"";
_borderdotted = "dotted";
RDebugUtils.currentLine=11337745;
 //BA.debugLineNum = 11337745;BA.debugLine="Public const BorderDouble As String = \"double\"";
_borderdouble = "double";
RDebugUtils.currentLine=11337746;
 //BA.debugLineNum = 11337746;BA.debugLine="Public const BorderHair As String = \"hair\"";
_borderhair = "hair";
RDebugUtils.currentLine=11337747;
 //BA.debugLineNum = 11337747;BA.debugLine="Public const BorderMediumDashed As String = \"medi";
_bordermediumdashed = "mediumDashed";
RDebugUtils.currentLine=11337748;
 //BA.debugLineNum = 11337748;BA.debugLine="Public const BorderDashDot As String = \"dashDot\"";
_borderdashdot = "dashDot";
RDebugUtils.currentLine=11337749;
 //BA.debugLineNum = 11337749;BA.debugLine="Public const BorderMediumDashDot As String = \"med";
_bordermediumdashdot = "mediumDashDot";
RDebugUtils.currentLine=11337750;
 //BA.debugLineNum = 11337750;BA.debugLine="Public const BorderDashDotDot As String = \"dashDo";
_borderdashdotdot = "dashDotDot";
RDebugUtils.currentLine=11337751;
 //BA.debugLineNum = 11337751;BA.debugLine="Public const BorderMediumDashDotDot As String = \"";
_bordermediumdashdotdot = "mediumDashDotDot";
RDebugUtils.currentLine=11337752;
 //BA.debugLineNum = 11337752;BA.debugLine="Public const BorderSlantDashDot As String = \"slan";
_borderslantdashdot = "slantDashDot";
RDebugUtils.currentLine=11337753;
 //BA.debugLineNum = 11337753;BA.debugLine="Public const colors_red As String = \"F44336\"";
_colors_red = "F44336";
RDebugUtils.currentLine=11337754;
 //BA.debugLineNum = 11337754;BA.debugLine="Public const colors_pink As String = \"E91E63\"";
_colors_pink = "E91E63";
RDebugUtils.currentLine=11337755;
 //BA.debugLineNum = 11337755;BA.debugLine="Public const colors_purple As String = \"9C27B0\"";
_colors_purple = "9C27B0";
RDebugUtils.currentLine=11337756;
 //BA.debugLineNum = 11337756;BA.debugLine="Public const colors_deepPurple As String = \"673AB";
_colors_deeppurple = "673AB7";
RDebugUtils.currentLine=11337757;
 //BA.debugLineNum = 11337757;BA.debugLine="Public const colors_indigo As String = \"3F51B5\"";
_colors_indigo = "3F51B5";
RDebugUtils.currentLine=11337758;
 //BA.debugLineNum = 11337758;BA.debugLine="Public const colors_blue As String = \"2196F3\"";
_colors_blue = "2196F3";
RDebugUtils.currentLine=11337759;
 //BA.debugLineNum = 11337759;BA.debugLine="Public const colors_lightBlue As String = \"03A9F4";
_colors_lightblue = "03A9F4";
RDebugUtils.currentLine=11337760;
 //BA.debugLineNum = 11337760;BA.debugLine="Public const colors_cyan As String = \"00BCD4\"";
_colors_cyan = "00BCD4";
RDebugUtils.currentLine=11337761;
 //BA.debugLineNum = 11337761;BA.debugLine="Public const colors_teal As String = \"009688\"";
_colors_teal = "009688";
RDebugUtils.currentLine=11337762;
 //BA.debugLineNum = 11337762;BA.debugLine="Public const colors_green As String = \"4CAF50\"";
_colors_green = "4CAF50";
RDebugUtils.currentLine=11337763;
 //BA.debugLineNum = 11337763;BA.debugLine="Public const colors_lightGreen As String = \"8BC34";
_colors_lightgreen = "8BC34A";
RDebugUtils.currentLine=11337764;
 //BA.debugLineNum = 11337764;BA.debugLine="Public const colors_lime As String = \"CDDC39\"";
_colors_lime = "CDDC39";
RDebugUtils.currentLine=11337765;
 //BA.debugLineNum = 11337765;BA.debugLine="Public const colors_yellow As String = \"ffe821\"";
_colors_yellow = "ffe821";
RDebugUtils.currentLine=11337766;
 //BA.debugLineNum = 11337766;BA.debugLine="Public const colors_amber As String = \"FFC107\"";
_colors_amber = "FFC107";
RDebugUtils.currentLine=11337767;
 //BA.debugLineNum = 11337767;BA.debugLine="Public const colors_orange As String = \"FF9800\"";
_colors_orange = "FF9800";
RDebugUtils.currentLine=11337768;
 //BA.debugLineNum = 11337768;BA.debugLine="Public const colors_deepOrange As String = \"FF572";
_colors_deeporange = "FF5722";
RDebugUtils.currentLine=11337769;
 //BA.debugLineNum = 11337769;BA.debugLine="Public const colors_brown As String = \"795548\"";
_colors_brown = "795548";
RDebugUtils.currentLine=11337770;
 //BA.debugLineNum = 11337770;BA.debugLine="Public const colors_grey As String = \"9E9E9E\"";
_colors_grey = "9E9E9E";
RDebugUtils.currentLine=11337771;
 //BA.debugLineNum = 11337771;BA.debugLine="Public const colors_blueGrey As String = \"607D8B\"";
_colors_bluegrey = "607D8B";
RDebugUtils.currentLine=11337772;
 //BA.debugLineNum = 11337772;BA.debugLine="Public const colors_black As String = \"000000\"";
_colors_black = "000000";
RDebugUtils.currentLine=11337773;
 //BA.debugLineNum = 11337773;BA.debugLine="Public const colors_white As String = \"ffffff\"";
_colors_white = "ffffff";
RDebugUtils.currentLine=11337774;
 //BA.debugLineNum = 11337774;BA.debugLine="Public const colors_transparent As String = \"tran";
_colors_transparent = "transparent";
RDebugUtils.currentLine=11337776;
 //BA.debugLineNum = 11337776;BA.debugLine="Public const Pattern_darkDown As String = \"darkDo";
_pattern_darkdown = "darkDown";
RDebugUtils.currentLine=11337777;
 //BA.debugLineNum = 11337777;BA.debugLine="Public const Pattern_darkGray As String = \"darkGr";
_pattern_darkgray = "darkGray";
RDebugUtils.currentLine=11337778;
 //BA.debugLineNum = 11337778;BA.debugLine="Public const Pattern_darkGrid As String = \"darkGr";
_pattern_darkgrid = "darkGrid";
RDebugUtils.currentLine=11337779;
 //BA.debugLineNum = 11337779;BA.debugLine="Public const Pattern_darkHorizontal As String = \"";
_pattern_darkhorizontal = "darkHorizontal";
RDebugUtils.currentLine=11337780;
 //BA.debugLineNum = 11337780;BA.debugLine="Public const Pattern_darkTrellis As String = \"dar";
_pattern_darktrellis = "darkTrellis";
RDebugUtils.currentLine=11337781;
 //BA.debugLineNum = 11337781;BA.debugLine="Public const Pattern_darkUp As String = \"darkUp\"";
_pattern_darkup = "darkUp";
RDebugUtils.currentLine=11337782;
 //BA.debugLineNum = 11337782;BA.debugLine="Public const Pattern_darkVertical As String = \"da";
_pattern_darkvertical = "darkVertical";
RDebugUtils.currentLine=11337783;
 //BA.debugLineNum = 11337783;BA.debugLine="Public const Pattern_gray0625 As String = \"gray06";
_pattern_gray0625 = "gray0625";
RDebugUtils.currentLine=11337784;
 //BA.debugLineNum = 11337784;BA.debugLine="Public const Pattern_gray125 As String = \"gray125";
_pattern_gray125 = "gray125";
RDebugUtils.currentLine=11337785;
 //BA.debugLineNum = 11337785;BA.debugLine="Public const Pattern_lightDown As String = \"light";
_pattern_lightdown = "lightDown";
RDebugUtils.currentLine=11337786;
 //BA.debugLineNum = 11337786;BA.debugLine="Public const Pattern_lightGray As String = \"light";
_pattern_lightgray = "lightGray";
RDebugUtils.currentLine=11337787;
 //BA.debugLineNum = 11337787;BA.debugLine="Public const Pattern_lightGrid As String = \"light";
_pattern_lightgrid = "lightGrid";
RDebugUtils.currentLine=11337788;
 //BA.debugLineNum = 11337788;BA.debugLine="Public const Pattern_lightHorizontal As String =";
_pattern_lighthorizontal = "lightHorizontal";
RDebugUtils.currentLine=11337789;
 //BA.debugLineNum = 11337789;BA.debugLine="Public const Pattern_lightTrellis As String = \"li";
_pattern_lighttrellis = "lightTrellis";
RDebugUtils.currentLine=11337790;
 //BA.debugLineNum = 11337790;BA.debugLine="Public const Pattern_lightUp As String = \"lightUp";
_pattern_lightup = "lightUp";
RDebugUtils.currentLine=11337791;
 //BA.debugLineNum = 11337791;BA.debugLine="Public const Pattern_lightVertical As String  = \"";
_pattern_lightvertical = "lightVertical";
RDebugUtils.currentLine=11337792;
 //BA.debugLineNum = 11337792;BA.debugLine="Public const Pattern_mediumGray As String = \"medi";
_pattern_mediumgray = "mediumGray";
RDebugUtils.currentLine=11337793;
 //BA.debugLineNum = 11337793;BA.debugLine="Public const Pattern_none As String = \"none\"";
_pattern_none = "none";
RDebugUtils.currentLine=11337794;
 //BA.debugLineNum = 11337794;BA.debugLine="Public const Pattern_solid As String = \"solid\"";
_pattern_solid = "solid";
RDebugUtils.currentLine=11337795;
 //BA.debugLineNum = 11337795;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananooxml._oxmlrow  _createrow(b4j.example.bananooxml __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "createrow", true))
	 {return ((b4j.example.bananooxml._oxmlrow) Debug.delegate(ba, "createrow", new Object[] {_rowpos,_colpos}));}
b4j.example.bananooxml._oxmlrow _row = null;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub CreateRow(rowPos As Int, colPos As Int) As OXM";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Dim row As OXMLRow";
_row = new b4j.example.bananooxml._oxmlrow();
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="row.columnIndex = colPos";
_row.columnIndex /*int*/  = _colpos;
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="row.rowIndex = rowPos";
_row.rowIndex /*int*/  = _rowpos;
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="row.values.Initialize";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="row.style = CreateMap()";
_row.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="Return row";
if (true) return _row;
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlstyle  _createstyle(b4j.example.bananooxml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((b4j.example.bananooxml._oxmlstyle) Debug.delegate(ba, "createstyle", null));}
b4j.example.bananooxml._oxmlstyle _s = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub CreateStyle As OXMLStyle";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Dim s As OXMLStyle";
_s = new b4j.example.bananooxml._oxmlstyle();
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="s.Initialize";
_s.Initialize();
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="s.bold = False";
_s.bold /*boolean*/  = __c.False;
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="s.italic = False";
_s.italic /*boolean*/  = __c.False;
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="s.underline = False";
_s.underline /*boolean*/  = __c.False;
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="s.strike = False";
_s.strike /*boolean*/  = __c.False;
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="s.fontSize = False";
_s.fontSize /*String*/  = BA.ObjectToString(__c.False);
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="s.fontColor = \"\"";
_s.fontColor /*String*/  = "";
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="s.fontName= \"\"";
_s.fontName /*String*/  = "";
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="s.fontFamily = \"\"";
_s.fontFamily /*String*/  = "";
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="s.scheme = \"\"";
_s.scheme /*String*/  = "";
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="s.numberFrmat = \"\"";
_s.numberFrmat /*String*/  = "";
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="s.bordercolor = \"\"";
_s.borderColor /*String*/  = "";
RDebugUtils.currentLine=11468814;
 //BA.debugLineNum = 11468814;BA.debugLine="s.hAlignment = \"\"";
_s.hAlignment /*String*/  = "";
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="s.vAlignment = \"\"";
_s.vAlignment /*String*/  = "";
RDebugUtils.currentLine=11468816;
 //BA.debugLineNum = 11468816;BA.debugLine="s.FillPattern =\"\"";
_s.FillPattern /*String*/  = "";
RDebugUtils.currentLine=11468817;
 //BA.debugLineNum = 11468817;BA.debugLine="s.FillForeColor = \"\"";
_s.FillForeColor /*String*/  = "";
RDebugUtils.currentLine=11468818;
 //BA.debugLineNum = 11468818;BA.debugLine="s.FillBackground = \"\"";
_s.FillBackground /*String*/  = "";
RDebugUtils.currentLine=11468819;
 //BA.debugLineNum = 11468819;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=11468820;
 //BA.debugLineNum = 11468820;BA.debugLine="End Sub";
return null;
}
public String  _download(b4j.example.bananooxml __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoObject _cb = null;
com.ab.banano.BANanoObject _prom = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub Download(module As Object, methodName As Strin";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Dim prom As BANanoObject = WorkBook.RunMethod(\"do";
_prom = new com.ab.banano.BANanoObject();
_prom = __ref._workbook /*com.ab.banano.BANanoObject*/ .RunMethod("download",(Object)(new Object[]{(Object)(__ref._fname /*String*/ )}));
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="prom.RunMethod(\"then\", Array(cb))";
_prom.RunMethod("then",(Object)(new Object[]{(Object)(_cb.getObject())}));
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getcell(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "getcell", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "getcell", new Object[] {_sheet,_rowpos,_colpos}));}
com.ab.banano.BANanoObject _colx = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub GetCell(sheet As BANanoObject, rowPos As Int,";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim colx As BANanoObject = sheet.RunMethod(\"cell\"";
_colx = new com.ab.banano.BANanoObject();
_colx = _sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)}));
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Return colx";
if (true) return _colx;
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getcolumn(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "getcolumn", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "getcolumn", new Object[] {_sheet,_rowpos,_colpos}));}
com.ab.banano.BANanoObject _colx = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub GetColumn(sheet As BANanoObject, rowPos As Int";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Dim colx As BANanoObject = sheet.RunMethod(\"colum";
_colx = new com.ab.banano.BANanoObject();
_colx = _sheet.RunMethod("column",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)}));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Return colx";
if (true) return _colx;
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getrow(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "getrow", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "getrow", new Object[] {_sheet,_rowpos,_colpos}));}
com.ab.banano.BANanoObject _row = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub GetRow(sheet As BANanoObject, rowPos As Int, c";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim row As BANanoObject = sheet.RunMethod(\"row\",";
_row = new com.ab.banano.BANanoObject();
_row = _sheet.RunMethod("row",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)}));
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Return row";
if (true) return _row;
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.bananooxml __ref,anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_filename}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub Initialize(fileName As String)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="BANano.DependsOnAsset(\"dom-to-image.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("dom-to-image.min.js");
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="BANano.DependsOnAsset(\"fileSaver.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("fileSaver.min.js");
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="BANano.DependsOnAsset(\"jszip.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jszip.min.js");
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="BANano.DependsOnAsset(\"oxml.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("oxml.min.js");
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="oxml.Initialize(\"oxml\")";
__ref._oxml /*com.ab.banano.BANanoObject*/ .Initialize((Object)("oxml"));
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="WorkBook = oxml.RunMethod(\"xlsx\", Null)";
__ref._workbook /*com.ab.banano.BANanoObject*/  = __ref._oxml /*com.ab.banano.BANanoObject*/ .RunMethod("xlsx",__c.Null);
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="fName = fileName";
__ref._fname /*String*/  = _filename;
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananooxml  _merge(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,String _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "merge", true))
	 {return ((b4j.example.bananooxml) Debug.delegate(ba, "merge", new Object[] {_sheet,_range}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub Merge(sheet As BANanoObject, range As String)";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="sheet.RunMethod(\"merge\", Array(range))";
_sheet.RunMethod("merge",(Object)(new Object[]{(Object)(_range)}));
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="End Sub";
return null;
}
public String  _setcellformula(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _cellbo,String _formula) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setcellformula", true))
	 {return ((String) Debug.delegate(ba, "setcellformula", new Object[] {_cellbo,_formula}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub SetCellFormula(cellBO As BANanoObject, formula";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createformula /*b4j.example.bananooxml._oxmlcell*/ (null,_formula));
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="End Sub";
return "";
}
public String  _setcellformula1(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _cellbo,String _formula,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setcellformula1", true))
	 {return ((String) Debug.delegate(ba, "setcellformula1", new Object[] {_cellbo,_formula,_value}));}
b4j.example.bananooxml._oxmlcell _cell = null;
anywheresoftware.b4a.objects.collections.Map _cellv = null;
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub SetCellFormula1(cellBO As BANanoObject, formul";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
_cell = __ref._createformula /*b4j.example.bananooxml._oxmlcell*/ (null,_formula);
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
_cellv = new anywheresoftware.b4a.objects.collections.Map();
_cellv = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,_cell);
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="cellBO.RunMethod(\"set\", Array(cellV))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cellv.getObject())}));
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="End Sub";
return "";
}
public String  _setcellnumber(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _cellbo,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setcellnumber", true))
	 {return ((String) Debug.delegate(ba, "setcellnumber", new Object[] {_cellbo,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub SetCellNumber(cellBO As BANanoObject, value As";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createnumber /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="End Sub";
return "";
}
public String  _setcellsharedtext(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _cellbo,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setcellsharedtext", true))
	 {return ((String) Debug.delegate(ba, "setcellsharedtext", new Object[] {_cellbo,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub SetCellSharedText(cellBO As BANanoObject, valu";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createsharedtext /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="End Sub";
return "";
}
public String  _setcelltext(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _cellbo,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setcelltext", true))
	 {return ((String) Debug.delegate(ba, "setcelltext", new Object[] {_cellbo,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub SetCellText(cellBO As BANanoObject,  value As";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createtext /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="End Sub";
return "";
}
public String  _setcolbo(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _col,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setcolbo", true))
	 {return ((String) Debug.delegate(ba, "setcolbo", new Object[] {_col,_values}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Sub SetColBO(col As BANanoObject, values As List)";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="col.RunMethod(\"set\", values)";
_col.RunMethod("set",(Object)(_values.getObject()));
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="End Sub";
return "";
}
public String  _setcolumn(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setcolumn", true))
	 {return ((String) Debug.delegate(ba, "setcolumn", new Object[] {_sheet,_rowpos,_colpos,_values}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub SetColumn(sheet As BANanoObject, rowPos As Int";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="sheet.RunMethod(\"column\", Array(rowPos, colPos, v";
_sheet.RunMethod("column",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos),(Object)(_values.getObject())}));
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="End Sub";
return "";
}
public String  _setformula(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _formula) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setformula", true))
	 {return ((String) Debug.delegate(ba, "setformula", new Object[] {_sheet,_rowpos,_colpos,_formula}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub SetFormula(sheet As BANanoObject, rowPos As In";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createformula /*b4j.example.bananooxml._oxmlcell*/ (null,_formula));
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="End Sub";
return "";
}
public String  _setformula1(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _formula,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setformula1", true))
	 {return ((String) Debug.delegate(ba, "setformula1", new Object[] {_sheet,_rowpos,_colpos,_formula,_value}));}
b4j.example.bananooxml._oxmlcell _cell = null;
anywheresoftware.b4a.objects.collections.Map _cellv = null;
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub SetFormula1(sheet As BANanoObject, rowPos As I";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
_cell = __ref._createformula /*b4j.example.bananooxml._oxmlcell*/ (null,_formula);
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
_cellv = new anywheresoftware.b4a.objects.collections.Map();
_cellv = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,_cell);
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cellv.getObject())}));
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="End Sub";
return "";
}
public String  _setnumber(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setnumber", true))
	 {return ((String) Debug.delegate(ba, "setnumber", new Object[] {_sheet,_rowpos,_colpos,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub SetNumber(sheet As BANanoObject, rowPos As Int";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createnumber /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return "";
}
public String  _setrow(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setrow", true))
	 {return ((String) Debug.delegate(ba, "setrow", new Object[] {_sheet,_rowpos,_colpos,_values}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub SetRow(sheet As BANanoObject, rowPos As Int, c";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="sheet.RunMethod(\"row\", Array(rowPos, colPos, valu";
_sheet.RunMethod("row",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos),(Object)(_values.getObject())}));
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="End Sub";
return "";
}
public String  _setrow1(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,b4j.example.bananooxml._oxmlrow _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setrow1", true))
	 {return ((String) Debug.delegate(ba, "setrow1", new Object[] {_sheet,_row}));}
int _rowpos = 0;
int _colpos = 0;
anywheresoftware.b4a.objects.collections.List _values = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub SetRow1(sheet As BANanoObject, row As OXMLRow)";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Dim rowPos As Int = row.rowIndex";
_rowpos = _row.rowIndex /*int*/ ;
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim colPos As Int = row.columnIndex";
_colpos = _row.columnIndex /*int*/ ;
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Dim values As List = row.values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = _row.values /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="SetRow(sheet, rowPos, colPos, values)";
__ref._setrow /*String*/ (null,_sheet,_rowpos,_colpos,_values);
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="End Sub";
return "";
}
public String  _setrowbo(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _row,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setrowbo", true))
	 {return ((String) Debug.delegate(ba, "setrowbo", new Object[] {_row,_values}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub SetRowBO(row As BANanoObject, values As List)";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="row.RunMethod(\"set\", values)";
_row.RunMethod("set",(Object)(_values.getObject()));
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public String  _setsharedtext(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setsharedtext", true))
	 {return ((String) Debug.delegate(ba, "setsharedtext", new Object[] {_sheet,_rowpos,_colpos,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub SetSharedText(sheet As BANanoObject, rowPos As";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createsharedtext /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="End Sub";
return "";
}
public String  _setstyle(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _rc,b4j.example.bananooxml._oxmlstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((String) Debug.delegate(ba, "setstyle", new Object[] {_rc,_style}));}
anywheresoftware.b4a.objects.collections.Map _obj = null;
anywheresoftware.b4a.objects.collections.Map _border = null;
anywheresoftware.b4a.objects.collections.Map _fill = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub SetStyle(rc As BANanoObject, Style As OXMLStyl";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim obj As Map = CreateMap()";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj = __c.createMap(new Object[] {});
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="If Style.bold Then obj.Put(\"bold\", Style.bold)";
if (_style.bold /*boolean*/ ) { 
_obj.Put((Object)("bold"),(Object)(_style.bold /*boolean*/ ));};
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="If Style.italic Then obj.Put(\"italic\", Style.ital";
if (_style.italic /*boolean*/ ) { 
_obj.Put((Object)("italic"),(Object)(_style.italic /*boolean*/ ));};
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="If Style.underline Then obj.Put(\"underline\", Styl";
if (_style.underline /*boolean*/ ) { 
_obj.Put((Object)("underline"),(Object)(_style.underline /*boolean*/ ));};
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="If Style.strike Then obj.Put(\"strike\", Style.stri";
if (_style.strike /*boolean*/ ) { 
_obj.Put((Object)("strike"),(Object)(_style.strike /*boolean*/ ));};
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="If Style.fontSize Then obj.Put(\"fontSize\", Style.";
if (BA.ObjectToBoolean(_style.fontSize /*String*/ )) { 
_obj.Put((Object)("fontSize"),(Object)(_style.fontSize /*String*/ ));};
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="If Style.fontColor <> \"\" Then obj.Put(\"fontColor\"";
if ((_style.fontColor /*String*/ ).equals("") == false) { 
_obj.Put((Object)("fontColor"),(Object)(_style.fontColor /*String*/ ));};
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="If Style.fontName <> \"\" Then obj.Put(\"fontName\",";
if ((_style.fontName /*String*/ ).equals("") == false) { 
_obj.Put((Object)("fontName"),(Object)(_style.fontName /*String*/ ));};
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="If Style.fontFamily <> \"\" Then obj.Put(\"fontFamil";
if ((_style.fontFamily /*String*/ ).equals("") == false) { 
_obj.Put((Object)("fontFamily"),(Object)(_style.fontFamily /*String*/ ));};
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="If Style.scheme <> \"\" Then obj.Put(\"scheme\", Styl";
if ((_style.scheme /*String*/ ).equals("") == false) { 
_obj.Put((Object)("scheme"),(Object)(_style.scheme /*String*/ ));};
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="If Style.numberFrmat <> \"\" Then obj.Put(\"numberFo";
if ((_style.numberFrmat /*String*/ ).equals("") == false) { 
_obj.Put((Object)("numberFormat"),(Object)(_style.numberFrmat /*String*/ ));};
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="If Style.vAlignment <> \"\" Then obj.Put(\"vAlignmen";
if ((_style.vAlignment /*String*/ ).equals("") == false) { 
_obj.Put((Object)("vAlignment"),(Object)(_style.vAlignment /*String*/ ));};
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="If Style.hAlignment <> \"\" Then obj.Put(\"hAlignmen";
if ((_style.hAlignment /*String*/ ).equals("") == false) { 
_obj.Put((Object)("hAlignment"),(Object)(_style.hAlignment /*String*/ ));};
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="If Style.borderColor <> \"\" Or Style.borderThickne";
if ((_style.borderColor /*String*/ ).equals("") == false || (_style.borderThickness /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="Dim border As Map = CreateMap()";
_border = new anywheresoftware.b4a.objects.collections.Map();
_border = __c.createMap(new Object[] {});
RDebugUtils.currentLine=11534352;
 //BA.debugLineNum = 11534352;BA.debugLine="border.Put(\"color\", Style.bordercolor)";
_border.Put((Object)("color"),(Object)(_style.borderColor /*String*/ ));
RDebugUtils.currentLine=11534353;
 //BA.debugLineNum = 11534353;BA.debugLine="border.Put(\"style\", Style.borderthickness)";
_border.Put((Object)("style"),(Object)(_style.borderThickness /*String*/ ));
RDebugUtils.currentLine=11534354;
 //BA.debugLineNum = 11534354;BA.debugLine="obj.Put(\"border\", border)";
_obj.Put((Object)("border"),(Object)(_border.getObject()));
 };
RDebugUtils.currentLine=11534357;
 //BA.debugLineNum = 11534357;BA.debugLine="If Style.FillPattern <> \"\" And Style.FillForeColo";
if ((_style.FillPattern /*String*/ ).equals("") == false && (_style.FillForeColor /*String*/ ).equals("") == false && (_style.FillBackground /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=11534358;
 //BA.debugLineNum = 11534358;BA.debugLine="Dim fill As Map = CreateMap()";
_fill = new anywheresoftware.b4a.objects.collections.Map();
_fill = __c.createMap(new Object[] {});
RDebugUtils.currentLine=11534359;
 //BA.debugLineNum = 11534359;BA.debugLine="fill.Put(\"pattern\", Style.FillPattern)";
_fill.Put((Object)("pattern"),(Object)(_style.FillPattern /*String*/ ));
RDebugUtils.currentLine=11534360;
 //BA.debugLineNum = 11534360;BA.debugLine="fill.Put(\"foreColor\", Style.FillForeColor)";
_fill.Put((Object)("foreColor"),(Object)(_style.FillForeColor /*String*/ ));
RDebugUtils.currentLine=11534361;
 //BA.debugLineNum = 11534361;BA.debugLine="fill.Put(\"backColor\", Style.FillBackground)";
_fill.Put((Object)("backColor"),(Object)(_style.FillBackground /*String*/ ));
RDebugUtils.currentLine=11534362;
 //BA.debugLineNum = 11534362;BA.debugLine="obj.Put(\"fill\", fill)";
_obj.Put((Object)("fill"),(Object)(_fill.getObject()));
 };
RDebugUtils.currentLine=11534364;
 //BA.debugLineNum = 11534364;BA.debugLine="rc.RunMethod(\"style\", Array(obj))";
_rc.RunMethod("style",(Object)(new Object[]{(Object)(_obj.getObject())}));
RDebugUtils.currentLine=11534365;
 //BA.debugLineNum = 11534365;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4j.example.bananooxml __ref,com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_sheet,_rowpos,_colpos,_value}));}
anywheresoftware.b4a.objects.collections.Map _cell = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub SetText(sheet As BANanoObject, rowPos As Int,";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = __ref._cell2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._createtext /*b4j.example.bananooxml._oxmlcell*/ (null,_value));
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _worksheet(b4j.example.bananooxml __ref,String _sheetname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananooxml";
if (Debug.shouldDelegate(ba, "worksheet", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "worksheet", new Object[] {_sheetname}));}
com.ab.banano.BANanoObject _wksheet = null;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub WorkSheet(sheetName As String) As BANanoObject";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Dim wkSheet As BANanoObject";
_wksheet = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="wkSheet = WorkBook.RunMethod(\"sheet\", Array(sheet";
_wksheet = __ref._workbook /*com.ab.banano.BANanoObject*/ .RunMethod("sheet",(Object)(new Object[]{(Object)(_sheetname)}));
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Return wkSheet";
if (true) return _wksheet;
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="End Sub";
return null;
}
}