package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananooxml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananooxml", this);
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
public b4j.example.bananooxml  _addrowformula(b4j.example.bananooxml._oxmlrow _row,String _formula) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 290;BA.debugLine="Sub AddRowFormula(row As OXMLRow, formula As Strin";
 //BA.debugLineNum = 291;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createformula(_formula));
 //BA.debugLineNum = 292;BA.debugLine="row.values.Add(cell)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cell.getObject()));
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml  _addrowformula1(b4j.example.bananooxml._oxmlrow _row,String _formula,String _value) throws Exception{
b4j.example.bananooxml._oxmlcell _cell = null;
anywheresoftware.b4a.objects.collections.Map _cellv = null;
 //BA.debugLineNum = 297;BA.debugLine="Sub AddRowFormula1(row As OXMLRow, formula As Stri";
 //BA.debugLineNum = 298;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
_cell = _createformula(_formula);
 //BA.debugLineNum = 299;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
 //BA.debugLineNum = 300;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
_cellv = new anywheresoftware.b4a.objects.collections.Map();
_cellv = _cell2map(_cell);
 //BA.debugLineNum = 301;BA.debugLine="row.values.Add(cellV)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cellv.getObject()));
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml  _addrownumber(b4j.example.bananooxml._oxmlrow _row,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 276;BA.debugLine="Sub AddRowNumber(row As OXMLRow, value As String)";
 //BA.debugLineNum = 277;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createnumber(_value));
 //BA.debugLineNum = 278;BA.debugLine="row.values.Add(cell)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cell.getObject()));
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml  _addrowsharedtext(b4j.example.bananooxml._oxmlrow _row,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 283;BA.debugLine="Sub AddRowSharedText(row As OXMLRow, value As Stri";
 //BA.debugLineNum = 284;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createsharedtext(_value));
 //BA.debugLineNum = 285;BA.debugLine="row.values.Add(cell)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cell.getObject()));
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml  _addrowtext(b4j.example.bananooxml._oxmlrow _row,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 269;BA.debugLine="Sub AddRowText(row As OXMLRow, value As String) As";
 //BA.debugLineNum = 270;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createtext(_value));
 //BA.debugLineNum = 271;BA.debugLine="row.values.Add(cell)";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cell.getObject()));
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _cell2map(b4j.example.bananooxml._oxmlcell _cell) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 215;BA.debugLine="private Sub Cell2Map(cell As OXMLCell) As Map";
 //BA.debugLineNum = 216;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 217;BA.debugLine="m.Put(\"type\", cell.typeOf)";
_m.Put((Object)("type"),(Object)(_cell.typeOf /*String*/ ));
 //BA.debugLineNum = 218;BA.debugLine="m.Put(\"value\", cell.value)";
_m.Put((Object)("value"),(Object)(_cell.value /*String*/ ));
 //BA.debugLineNum = 219;BA.debugLine="If cell.formula <> \"\" Then";
if ((_cell.formula /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 220;BA.debugLine="m.Put(\"formula\", cell.formula)";
_m.Put((Object)("formula"),(Object)(_cell.formula /*String*/ ));
 };
 //BA.debugLineNum = 222;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 5;BA.debugLine="Public WorkBook As BANanoObject";
_workbook = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 6;BA.debugLine="Private oxml As BANanoObject";
_oxml = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 7;BA.debugLine="Private fName As String";
_fname = "";
 //BA.debugLineNum = 8;BA.debugLine="Type OXMLCell(typeOf As String, value As String,";
;
 //BA.debugLineNum = 9;BA.debugLine="Type OXMLRow(rowIndex As Int, columnIndex As Int,";
;
 //BA.debugLineNum = 10;BA.debugLine="Type OXMLStyle(bold As Boolean, italic As Boolean";
;
 //BA.debugLineNum = 14;BA.debugLine="Public const BorderThick As String = \"thick\"";
_borderthick = "thick";
 //BA.debugLineNum = 15;BA.debugLine="Public const BorderNone As String = \"none\"";
_bordernone = "none";
 //BA.debugLineNum = 16;BA.debugLine="Public const BorderThin As String = \"thin\"";
_borderthin = "thin";
 //BA.debugLineNum = 17;BA.debugLine="Public const BorderMedium As String = \"medium\"";
_bordermedium = "medium";
 //BA.debugLineNum = 18;BA.debugLine="Public const BorderDashed As String = \"dashed\"";
_borderdashed = "dashed";
 //BA.debugLineNum = 19;BA.debugLine="Public const BorderDotted As String = \"dotted\"";
_borderdotted = "dotted";
 //BA.debugLineNum = 20;BA.debugLine="Public const BorderDouble As String = \"double\"";
_borderdouble = "double";
 //BA.debugLineNum = 21;BA.debugLine="Public const BorderHair As String = \"hair\"";
_borderhair = "hair";
 //BA.debugLineNum = 22;BA.debugLine="Public const BorderMediumDashed As String = \"medi";
_bordermediumdashed = "mediumDashed";
 //BA.debugLineNum = 23;BA.debugLine="Public const BorderDashDot As String = \"dashDot\"";
_borderdashdot = "dashDot";
 //BA.debugLineNum = 24;BA.debugLine="Public const BorderMediumDashDot As String = \"med";
_bordermediumdashdot = "mediumDashDot";
 //BA.debugLineNum = 25;BA.debugLine="Public const BorderDashDotDot As String = \"dashDo";
_borderdashdotdot = "dashDotDot";
 //BA.debugLineNum = 26;BA.debugLine="Public const BorderMediumDashDotDot As String = \"";
_bordermediumdashdotdot = "mediumDashDotDot";
 //BA.debugLineNum = 27;BA.debugLine="Public const BorderSlantDashDot As String = \"slan";
_borderslantdashdot = "slantDashDot";
 //BA.debugLineNum = 28;BA.debugLine="Public const colors_red As String = \"F44336\"";
_colors_red = "F44336";
 //BA.debugLineNum = 29;BA.debugLine="Public const colors_pink As String = \"E91E63\"";
_colors_pink = "E91E63";
 //BA.debugLineNum = 30;BA.debugLine="Public const colors_purple As String = \"9C27B0\"";
_colors_purple = "9C27B0";
 //BA.debugLineNum = 31;BA.debugLine="Public const colors_deepPurple As String = \"673AB";
_colors_deeppurple = "673AB7";
 //BA.debugLineNum = 32;BA.debugLine="Public const colors_indigo As String = \"3F51B5\"";
_colors_indigo = "3F51B5";
 //BA.debugLineNum = 33;BA.debugLine="Public const colors_blue As String = \"2196F3\"";
_colors_blue = "2196F3";
 //BA.debugLineNum = 34;BA.debugLine="Public const colors_lightBlue As String = \"03A9F4";
_colors_lightblue = "03A9F4";
 //BA.debugLineNum = 35;BA.debugLine="Public const colors_cyan As String = \"00BCD4\"";
_colors_cyan = "00BCD4";
 //BA.debugLineNum = 36;BA.debugLine="Public const colors_teal As String = \"009688\"";
_colors_teal = "009688";
 //BA.debugLineNum = 37;BA.debugLine="Public const colors_green As String = \"4CAF50\"";
_colors_green = "4CAF50";
 //BA.debugLineNum = 38;BA.debugLine="Public const colors_lightGreen As String = \"8BC34";
_colors_lightgreen = "8BC34A";
 //BA.debugLineNum = 39;BA.debugLine="Public const colors_lime As String = \"CDDC39\"";
_colors_lime = "CDDC39";
 //BA.debugLineNum = 40;BA.debugLine="Public const colors_yellow As String = \"ffe821\"";
_colors_yellow = "ffe821";
 //BA.debugLineNum = 41;BA.debugLine="Public const colors_amber As String = \"FFC107\"";
_colors_amber = "FFC107";
 //BA.debugLineNum = 42;BA.debugLine="Public const colors_orange As String = \"FF9800\"";
_colors_orange = "FF9800";
 //BA.debugLineNum = 43;BA.debugLine="Public const colors_deepOrange As String = \"FF572";
_colors_deeporange = "FF5722";
 //BA.debugLineNum = 44;BA.debugLine="Public const colors_brown As String = \"795548\"";
_colors_brown = "795548";
 //BA.debugLineNum = 45;BA.debugLine="Public const colors_grey As String = \"9E9E9E\"";
_colors_grey = "9E9E9E";
 //BA.debugLineNum = 46;BA.debugLine="Public const colors_blueGrey As String = \"607D8B\"";
_colors_bluegrey = "607D8B";
 //BA.debugLineNum = 47;BA.debugLine="Public const colors_black As String = \"000000\"";
_colors_black = "000000";
 //BA.debugLineNum = 48;BA.debugLine="Public const colors_white As String = \"ffffff\"";
_colors_white = "ffffff";
 //BA.debugLineNum = 49;BA.debugLine="Public const colors_transparent As String = \"tran";
_colors_transparent = "transparent";
 //BA.debugLineNum = 51;BA.debugLine="Public const Pattern_darkDown As String = \"darkDo";
_pattern_darkdown = "darkDown";
 //BA.debugLineNum = 52;BA.debugLine="Public const Pattern_darkGray As String = \"darkGr";
_pattern_darkgray = "darkGray";
 //BA.debugLineNum = 53;BA.debugLine="Public const Pattern_darkGrid As String = \"darkGr";
_pattern_darkgrid = "darkGrid";
 //BA.debugLineNum = 54;BA.debugLine="Public const Pattern_darkHorizontal As String = \"";
_pattern_darkhorizontal = "darkHorizontal";
 //BA.debugLineNum = 55;BA.debugLine="Public const Pattern_darkTrellis As String = \"dar";
_pattern_darktrellis = "darkTrellis";
 //BA.debugLineNum = 56;BA.debugLine="Public const Pattern_darkUp As String = \"darkUp\"";
_pattern_darkup = "darkUp";
 //BA.debugLineNum = 57;BA.debugLine="Public const Pattern_darkVertical As String = \"da";
_pattern_darkvertical = "darkVertical";
 //BA.debugLineNum = 58;BA.debugLine="Public const Pattern_gray0625 As String = \"gray06";
_pattern_gray0625 = "gray0625";
 //BA.debugLineNum = 59;BA.debugLine="Public const Pattern_gray125 As String = \"gray125";
_pattern_gray125 = "gray125";
 //BA.debugLineNum = 60;BA.debugLine="Public const Pattern_lightDown As String = \"light";
_pattern_lightdown = "lightDown";
 //BA.debugLineNum = 61;BA.debugLine="Public const Pattern_lightGray As String = \"light";
_pattern_lightgray = "lightGray";
 //BA.debugLineNum = 62;BA.debugLine="Public const Pattern_lightGrid As String = \"light";
_pattern_lightgrid = "lightGrid";
 //BA.debugLineNum = 63;BA.debugLine="Public const Pattern_lightHorizontal As String =";
_pattern_lighthorizontal = "lightHorizontal";
 //BA.debugLineNum = 64;BA.debugLine="Public const Pattern_lightTrellis As String = \"li";
_pattern_lighttrellis = "lightTrellis";
 //BA.debugLineNum = 65;BA.debugLine="Public const Pattern_lightUp As String = \"lightUp";
_pattern_lightup = "lightUp";
 //BA.debugLineNum = 66;BA.debugLine="Public const Pattern_lightVertical As String  = \"";
_pattern_lightvertical = "lightVertical";
 //BA.debugLineNum = 67;BA.debugLine="Public const Pattern_mediumGray As String = \"medi";
_pattern_mediumgray = "mediumGray";
 //BA.debugLineNum = 68;BA.debugLine="Public const Pattern_none As String = \"none\"";
_pattern_none = "none";
 //BA.debugLineNum = 69;BA.debugLine="Public const Pattern_solid As String = \"solid\"";
_pattern_solid = "solid";
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananooxml._oxmlcell  _createformula(String _formula) throws Exception{
b4j.example.bananooxml._oxmlcell _cell = null;
 //BA.debugLineNum = 175;BA.debugLine="private Sub CreateFormula(formula As String) As OX";
 //BA.debugLineNum = 176;BA.debugLine="Dim cell As OXMLCell";
_cell = new b4j.example.bananooxml._oxmlcell();
 //BA.debugLineNum = 177;BA.debugLine="cell.Initialize";
_cell.Initialize();
 //BA.debugLineNum = 178;BA.debugLine="cell.typeOf = \"formula\"";
_cell.typeOf /*String*/  = "formula";
 //BA.debugLineNum = 179;BA.debugLine="cell.formula = formula";
_cell.formula /*String*/  = _formula;
 //BA.debugLineNum = 180;BA.debugLine="cell.style = CreateMap()";
_cell.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
 //BA.debugLineNum = 181;BA.debugLine="Return cell";
if (true) return _cell;
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlcell  _createnumber(String _value) throws Exception{
b4j.example.bananooxml._oxmlcell _cell = null;
 //BA.debugLineNum = 195;BA.debugLine="private Sub CreateNumber(value As String) As OXMLC";
 //BA.debugLineNum = 196;BA.debugLine="Dim cell As OXMLCell";
_cell = new b4j.example.bananooxml._oxmlcell();
 //BA.debugLineNum = 197;BA.debugLine="cell.Initialize";
_cell.Initialize();
 //BA.debugLineNum = 198;BA.debugLine="cell.typeOf = \"numeric\"";
_cell.typeOf /*String*/  = "numeric";
 //BA.debugLineNum = 199;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
 //BA.debugLineNum = 200;BA.debugLine="cell.style = CreateMap()";
_cell.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
 //BA.debugLineNum = 201;BA.debugLine="Return cell";
if (true) return _cell;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlrow  _createrow(int _rowpos,int _colpos) throws Exception{
b4j.example.bananooxml._oxmlrow _row = null;
 //BA.debugLineNum = 164;BA.debugLine="Sub CreateRow(rowPos As Int, colPos As Int) As OXM";
 //BA.debugLineNum = 165;BA.debugLine="Dim row As OXMLRow";
_row = new b4j.example.bananooxml._oxmlrow();
 //BA.debugLineNum = 166;BA.debugLine="row.Initialize";
_row.Initialize();
 //BA.debugLineNum = 167;BA.debugLine="row.columnIndex = colPos";
_row.columnIndex /*int*/  = _colpos;
 //BA.debugLineNum = 168;BA.debugLine="row.rowIndex = rowPos";
_row.rowIndex /*int*/  = _rowpos;
 //BA.debugLineNum = 169;BA.debugLine="row.values.Initialize";
_row.values /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 170;BA.debugLine="row.style = CreateMap()";
_row.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
 //BA.debugLineNum = 171;BA.debugLine="Return row";
if (true) return _row;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlcell  _createsharedtext(String _value) throws Exception{
b4j.example.bananooxml._oxmlcell _cell = null;
 //BA.debugLineNum = 205;BA.debugLine="private Sub CreateSharedText(value As String) As O";
 //BA.debugLineNum = 206;BA.debugLine="Dim cell As OXMLCell";
_cell = new b4j.example.bananooxml._oxmlcell();
 //BA.debugLineNum = 207;BA.debugLine="cell.Initialize";
_cell.Initialize();
 //BA.debugLineNum = 208;BA.debugLine="cell.typeOf = \"sharedString\"";
_cell.typeOf /*String*/  = "sharedString";
 //BA.debugLineNum = 209;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
 //BA.debugLineNum = 210;BA.debugLine="cell.style = CreateMap()";
_cell.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
 //BA.debugLineNum = 211;BA.debugLine="Return cell";
if (true) return _cell;
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlstyle  _createstyle() throws Exception{
b4j.example.bananooxml._oxmlstyle _s = null;
 //BA.debugLineNum = 85;BA.debugLine="Sub CreateStyle As OXMLStyle";
 //BA.debugLineNum = 86;BA.debugLine="Dim s As OXMLStyle";
_s = new b4j.example.bananooxml._oxmlstyle();
 //BA.debugLineNum = 87;BA.debugLine="s.Initialize";
_s.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="s.bold = False";
_s.bold /*boolean*/  = __c.False;
 //BA.debugLineNum = 89;BA.debugLine="s.italic = False";
_s.italic /*boolean*/  = __c.False;
 //BA.debugLineNum = 90;BA.debugLine="s.underline = False";
_s.underline /*boolean*/  = __c.False;
 //BA.debugLineNum = 91;BA.debugLine="s.strike = False";
_s.strike /*boolean*/  = __c.False;
 //BA.debugLineNum = 92;BA.debugLine="s.fontSize = False";
_s.fontSize /*String*/  = BA.ObjectToString(__c.False);
 //BA.debugLineNum = 93;BA.debugLine="s.fontColor = \"\"";
_s.fontColor /*String*/  = "";
 //BA.debugLineNum = 94;BA.debugLine="s.fontName= \"\"";
_s.fontName /*String*/  = "";
 //BA.debugLineNum = 95;BA.debugLine="s.fontFamily = \"\"";
_s.fontFamily /*String*/  = "";
 //BA.debugLineNum = 96;BA.debugLine="s.scheme = \"\"";
_s.scheme /*String*/  = "";
 //BA.debugLineNum = 97;BA.debugLine="s.numberFrmat = \"\"";
_s.numberFrmat /*String*/  = "";
 //BA.debugLineNum = 98;BA.debugLine="s.bordercolor = \"\"";
_s.borderColor /*String*/  = "";
 //BA.debugLineNum = 99;BA.debugLine="s.hAlignment = \"\"";
_s.hAlignment /*String*/  = "";
 //BA.debugLineNum = 100;BA.debugLine="s.vAlignment = \"\"";
_s.vAlignment /*String*/  = "";
 //BA.debugLineNum = 101;BA.debugLine="s.FillPattern =\"\"";
_s.FillPattern /*String*/  = "";
 //BA.debugLineNum = 102;BA.debugLine="s.FillForeColor = \"\"";
_s.FillForeColor /*String*/  = "";
 //BA.debugLineNum = 103;BA.debugLine="s.FillBackground = \"\"";
_s.FillBackground /*String*/  = "";
 //BA.debugLineNum = 104;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananooxml._oxmlcell  _createtext(String _value) throws Exception{
b4j.example.bananooxml._oxmlcell _cell = null;
 //BA.debugLineNum = 185;BA.debugLine="private Sub CreateText(value As String) As OXMLCel";
 //BA.debugLineNum = 186;BA.debugLine="Dim cell As OXMLCell";
_cell = new b4j.example.bananooxml._oxmlcell();
 //BA.debugLineNum = 187;BA.debugLine="cell.Initialize";
_cell.Initialize();
 //BA.debugLineNum = 188;BA.debugLine="cell.typeOf = \"string\"";
_cell.typeOf /*String*/  = "string";
 //BA.debugLineNum = 189;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
 //BA.debugLineNum = 190;BA.debugLine="cell.style = CreateMap()";
_cell.style /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
 //BA.debugLineNum = 191;BA.debugLine="Return cell";
if (true) return _cell;
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public String  _download(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoObject _cb = null;
com.ab.banano.BANanoObject _prom = null;
 //BA.debugLineNum = 261;BA.debugLine="Sub Download(module As Object, methodName As Strin";
 //BA.debugLineNum = 262;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 263;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 264;BA.debugLine="Dim prom As BANanoObject = WorkBook.RunMethod(\"do";
_prom = new com.ab.banano.BANanoObject();
_prom = _workbook.RunMethod("download",(Object)(new Object[]{(Object)(_fname)}));
 //BA.debugLineNum = 265;BA.debugLine="prom.RunMethod(\"then\", Array(cb))";
_prom.RunMethod("then",(Object)(new Object[]{(Object)(_cb.getObject())}));
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getcell(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos) throws Exception{
com.ab.banano.BANanoObject _colx = null;
 //BA.debugLineNum = 158;BA.debugLine="Sub GetCell(sheet As BANanoObject, rowPos As Int,";
 //BA.debugLineNum = 159;BA.debugLine="Dim colx As BANanoObject = sheet.RunMethod(\"cell\"";
_colx = new com.ab.banano.BANanoObject();
_colx = _sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)}));
 //BA.debugLineNum = 160;BA.debugLine="Return colx";
if (true) return _colx;
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getcolumn(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos) throws Exception{
com.ab.banano.BANanoObject _colx = null;
 //BA.debugLineNum = 152;BA.debugLine="Sub GetColumn(sheet As BANanoObject, rowPos As Int";
 //BA.debugLineNum = 153;BA.debugLine="Dim colx As BANanoObject = sheet.RunMethod(\"colum";
_colx = new com.ab.banano.BANanoObject();
_colx = _sheet.RunMethod("column",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)}));
 //BA.debugLineNum = 154;BA.debugLine="Return colx";
if (true) return _colx;
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _getrow(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos) throws Exception{
com.ab.banano.BANanoObject _row = null;
 //BA.debugLineNum = 146;BA.debugLine="Sub GetRow(sheet As BANanoObject, rowPos As Int, c";
 //BA.debugLineNum = 147;BA.debugLine="Dim row As BANanoObject = sheet.RunMethod(\"row\",";
_row = new com.ab.banano.BANanoObject();
_row = _sheet.RunMethod("row",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)}));
 //BA.debugLineNum = 148;BA.debugLine="Return row";
if (true) return _row;
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 73;BA.debugLine="Public Sub Initialize(fileName As String)";
 //BA.debugLineNum = 74;BA.debugLine="BANano.DependsOnAsset(\"dom-to-image.min.js\")";
_banano.DependsOnAsset("dom-to-image.min.js");
 //BA.debugLineNum = 75;BA.debugLine="BANano.DependsOnAsset(\"fileSaver.min.js\")";
_banano.DependsOnAsset("fileSaver.min.js");
 //BA.debugLineNum = 76;BA.debugLine="BANano.DependsOnAsset(\"jszip.min.js\")";
_banano.DependsOnAsset("jszip.min.js");
 //BA.debugLineNum = 77;BA.debugLine="BANano.DependsOnAsset(\"oxml.min.js\")";
_banano.DependsOnAsset("oxml.min.js");
 //BA.debugLineNum = 79;BA.debugLine="oxml.Initialize(\"oxml\")";
_oxml.Initialize((Object)("oxml"));
 //BA.debugLineNum = 80;BA.debugLine="WorkBook = oxml.RunMethod(\"xlsx\", Null)";
_workbook = _oxml.RunMethod("xlsx",__c.Null);
 //BA.debugLineNum = 81;BA.debugLine="fName = fileName";
_fname = _filename;
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananooxml  _merge(com.ab.banano.BANanoObject _sheet,String _range) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub Merge(sheet As BANanoObject, range As String)";
 //BA.debugLineNum = 141;BA.debugLine="sheet.RunMethod(\"merge\", Array(range))";
_sheet.RunMethod("merge",(Object)(new Object[]{(Object)(_range)}));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.bananooxml)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public String  _setcellformula(com.ab.banano.BANanoObject _cellbo,String _formula) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 342;BA.debugLine="Sub SetCellFormula(cellBO As BANanoObject, formula";
 //BA.debugLineNum = 343;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createformula(_formula));
 //BA.debugLineNum = 344;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return "";
}
public String  _setcellformula1(com.ab.banano.BANanoObject _cellbo,String _formula,String _value) throws Exception{
b4j.example.bananooxml._oxmlcell _cell = null;
anywheresoftware.b4a.objects.collections.Map _cellv = null;
 //BA.debugLineNum = 355;BA.debugLine="Sub SetCellFormula1(cellBO As BANanoObject, formul";
 //BA.debugLineNum = 356;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
_cell = _createformula(_formula);
 //BA.debugLineNum = 357;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
 //BA.debugLineNum = 358;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
_cellv = new anywheresoftware.b4a.objects.collections.Map();
_cellv = _cell2map(_cell);
 //BA.debugLineNum = 359;BA.debugLine="cellBO.RunMethod(\"set\", Array(cellV))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cellv.getObject())}));
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _setcellnumber(com.ab.banano.BANanoObject _cellbo,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 318;BA.debugLine="Sub SetCellNumber(cellBO As BANanoObject, value As";
 //BA.debugLineNum = 319;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createnumber(_value));
 //BA.debugLineNum = 320;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return "";
}
public String  _setcellsharedtext(com.ab.banano.BANanoObject _cellbo,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 330;BA.debugLine="Sub SetCellSharedText(cellBO As BANanoObject, valu";
 //BA.debugLineNum = 331;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createsharedtext(_value));
 //BA.debugLineNum = 332;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _setcelltext(com.ab.banano.BANanoObject _cellbo,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 312;BA.debugLine="Sub SetCellText(cellBO As BANanoObject,  value As";
 //BA.debugLineNum = 313;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createtext(_value));
 //BA.debugLineNum = 314;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
_cellbo.RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public String  _setcolbo(com.ab.banano.BANanoObject _col,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub SetColBO(col As BANanoObject, values As List)";
 //BA.debugLineNum = 249;BA.debugLine="col.RunMethod(\"set\", values)";
_col.RunMethod("set",(Object)(_values.getObject()));
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public String  _setcolumn(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetColumn(sheet As BANanoObject, rowPos As Int";
 //BA.debugLineNum = 239;BA.debugLine="sheet.RunMethod(\"column\", Array(rowPos, colPos, v";
_sheet.RunMethod("column",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos),(Object)(_values.getObject())}));
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _setformula(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _formula) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 349;BA.debugLine="Sub SetFormula(sheet As BANanoObject, rowPos As In";
 //BA.debugLineNum = 350;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createformula(_formula));
 //BA.debugLineNum = 351;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public String  _setformula1(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _formula,String _value) throws Exception{
b4j.example.bananooxml._oxmlcell _cell = null;
anywheresoftware.b4a.objects.collections.Map _cellv = null;
 //BA.debugLineNum = 363;BA.debugLine="Sub SetFormula1(sheet As BANanoObject, rowPos As I";
 //BA.debugLineNum = 364;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
_cell = _createformula(_formula);
 //BA.debugLineNum = 365;BA.debugLine="cell.value = value";
_cell.value /*String*/  = _value;
 //BA.debugLineNum = 366;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
_cellv = new anywheresoftware.b4a.objects.collections.Map();
_cellv = _cell2map(_cell);
 //BA.debugLineNum = 367;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cellv.getObject())}));
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return "";
}
public String  _setnumber(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 324;BA.debugLine="Sub SetNumber(sheet As BANanoObject, rowPos As Int";
 //BA.debugLineNum = 325;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createnumber(_value));
 //BA.debugLineNum = 326;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public String  _setrow(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetRow(sheet As BANanoObject, rowPos As Int, c";
 //BA.debugLineNum = 234;BA.debugLine="sheet.RunMethod(\"row\", Array(rowPos, colPos, valu";
_sheet.RunMethod("row",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos),(Object)(_values.getObject())}));
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public String  _setrow1(com.ab.banano.BANanoObject _sheet,b4j.example.bananooxml._oxmlrow _row) throws Exception{
int _rowpos = 0;
int _colpos = 0;
anywheresoftware.b4a.objects.collections.List _values = null;
 //BA.debugLineNum = 253;BA.debugLine="Sub SetRow1(sheet As BANanoObject, row As OXMLRow)";
 //BA.debugLineNum = 254;BA.debugLine="Dim rowPos As Int = row.rowIndex";
_rowpos = _row.rowIndex /*int*/ ;
 //BA.debugLineNum = 255;BA.debugLine="Dim colPos As Int = row.columnIndex";
_colpos = _row.columnIndex /*int*/ ;
 //BA.debugLineNum = 256;BA.debugLine="Dim values As List = row.values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = _row.values /*anywheresoftware.b4a.objects.collections.List*/ ;
 //BA.debugLineNum = 257;BA.debugLine="SetRow(sheet, rowPos, colPos, values)";
_setrow(_sheet,_rowpos,_colpos,_values);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public String  _setrowbo(com.ab.banano.BANanoObject _row,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetRowBO(row As BANanoObject, values As List)";
 //BA.debugLineNum = 244;BA.debugLine="row.RunMethod(\"set\", values)";
_row.RunMethod("set",(Object)(_values.getObject()));
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _setsharedtext(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 336;BA.debugLine="Sub SetSharedText(sheet As BANanoObject, rowPos As";
 //BA.debugLineNum = 337;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createsharedtext(_value));
 //BA.debugLineNum = 338;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return "";
}
public String  _setstyle(com.ab.banano.BANanoObject _rc,b4j.example.bananooxml._oxmlstyle _style) throws Exception{
anywheresoftware.b4a.objects.collections.Map _obj = null;
anywheresoftware.b4a.objects.collections.Map _border = null;
anywheresoftware.b4a.objects.collections.Map _fill = null;
 //BA.debugLineNum = 108;BA.debugLine="Sub SetStyle(rc As BANanoObject, Style As OXMLStyl";
 //BA.debugLineNum = 109;BA.debugLine="Dim obj As Map = CreateMap()";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj = __c.createMap(new Object[] {});
 //BA.debugLineNum = 110;BA.debugLine="If Style.bold Then obj.Put(\"bold\", Style.bold)";
if (_style.bold /*boolean*/ ) { 
_obj.Put((Object)("bold"),(Object)(_style.bold /*boolean*/ ));};
 //BA.debugLineNum = 111;BA.debugLine="If Style.italic Then obj.Put(\"italic\", Style.ital";
if (_style.italic /*boolean*/ ) { 
_obj.Put((Object)("italic"),(Object)(_style.italic /*boolean*/ ));};
 //BA.debugLineNum = 112;BA.debugLine="If Style.underline Then obj.Put(\"underline\", Styl";
if (_style.underline /*boolean*/ ) { 
_obj.Put((Object)("underline"),(Object)(_style.underline /*boolean*/ ));};
 //BA.debugLineNum = 113;BA.debugLine="If Style.strike Then obj.Put(\"strike\", Style.stri";
if (_style.strike /*boolean*/ ) { 
_obj.Put((Object)("strike"),(Object)(_style.strike /*boolean*/ ));};
 //BA.debugLineNum = 114;BA.debugLine="If Style.fontSize Then obj.Put(\"fontSize\", Style.";
if (BA.ObjectToBoolean(_style.fontSize /*String*/ )) { 
_obj.Put((Object)("fontSize"),(Object)(_style.fontSize /*String*/ ));};
 //BA.debugLineNum = 115;BA.debugLine="If Style.fontColor <> \"\" Then obj.Put(\"fontColor\"";
if ((_style.fontColor /*String*/ ).equals("") == false) { 
_obj.Put((Object)("fontColor"),(Object)(_style.fontColor /*String*/ ));};
 //BA.debugLineNum = 116;BA.debugLine="If Style.fontName <> \"\" Then obj.Put(\"fontName\",";
if ((_style.fontName /*String*/ ).equals("") == false) { 
_obj.Put((Object)("fontName"),(Object)(_style.fontName /*String*/ ));};
 //BA.debugLineNum = 117;BA.debugLine="If Style.fontFamily <> \"\" Then obj.Put(\"fontFamil";
if ((_style.fontFamily /*String*/ ).equals("") == false) { 
_obj.Put((Object)("fontFamily"),(Object)(_style.fontFamily /*String*/ ));};
 //BA.debugLineNum = 118;BA.debugLine="If Style.scheme <> \"\" Then obj.Put(\"scheme\", Styl";
if ((_style.scheme /*String*/ ).equals("") == false) { 
_obj.Put((Object)("scheme"),(Object)(_style.scheme /*String*/ ));};
 //BA.debugLineNum = 119;BA.debugLine="If Style.numberFrmat <> \"\" Then obj.Put(\"numberFo";
if ((_style.numberFrmat /*String*/ ).equals("") == false) { 
_obj.Put((Object)("numberFormat"),(Object)(_style.numberFrmat /*String*/ ));};
 //BA.debugLineNum = 120;BA.debugLine="If Style.vAlignment <> \"\" Then obj.Put(\"vAlignmen";
if ((_style.vAlignment /*String*/ ).equals("") == false) { 
_obj.Put((Object)("vAlignment"),(Object)(_style.vAlignment /*String*/ ));};
 //BA.debugLineNum = 121;BA.debugLine="If Style.hAlignment <> \"\" Then obj.Put(\"hAlignmen";
if ((_style.hAlignment /*String*/ ).equals("") == false) { 
_obj.Put((Object)("hAlignment"),(Object)(_style.hAlignment /*String*/ ));};
 //BA.debugLineNum = 122;BA.debugLine="If Style.borderColor <> \"\" Or Style.borderThickne";
if ((_style.borderColor /*String*/ ).equals("") == false || (_style.borderThickness /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 123;BA.debugLine="Dim border As Map = CreateMap()";
_border = new anywheresoftware.b4a.objects.collections.Map();
_border = __c.createMap(new Object[] {});
 //BA.debugLineNum = 124;BA.debugLine="border.Put(\"color\", Style.bordercolor)";
_border.Put((Object)("color"),(Object)(_style.borderColor /*String*/ ));
 //BA.debugLineNum = 125;BA.debugLine="border.Put(\"style\", Style.borderthickness)";
_border.Put((Object)("style"),(Object)(_style.borderThickness /*String*/ ));
 //BA.debugLineNum = 126;BA.debugLine="obj.Put(\"border\", border)";
_obj.Put((Object)("border"),(Object)(_border.getObject()));
 };
 //BA.debugLineNum = 129;BA.debugLine="If Style.FillPattern <> \"\" And Style.FillForeColo";
if ((_style.FillPattern /*String*/ ).equals("") == false && (_style.FillForeColor /*String*/ ).equals("") == false && (_style.FillBackground /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 130;BA.debugLine="Dim fill As Map = CreateMap()";
_fill = new anywheresoftware.b4a.objects.collections.Map();
_fill = __c.createMap(new Object[] {});
 //BA.debugLineNum = 131;BA.debugLine="fill.Put(\"pattern\", Style.FillPattern)";
_fill.Put((Object)("pattern"),(Object)(_style.FillPattern /*String*/ ));
 //BA.debugLineNum = 132;BA.debugLine="fill.Put(\"foreColor\", Style.FillForeColor)";
_fill.Put((Object)("foreColor"),(Object)(_style.FillForeColor /*String*/ ));
 //BA.debugLineNum = 133;BA.debugLine="fill.Put(\"backColor\", Style.FillBackground)";
_fill.Put((Object)("backColor"),(Object)(_style.FillBackground /*String*/ ));
 //BA.debugLineNum = 134;BA.debugLine="obj.Put(\"fill\", fill)";
_obj.Put((Object)("fill"),(Object)(_fill.getObject()));
 };
 //BA.debugLineNum = 136;BA.debugLine="rc.RunMethod(\"style\", Array(obj))";
_rc.RunMethod("style",(Object)(new Object[]{(Object)(_obj.getObject())}));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _settext(com.ab.banano.BANanoObject _sheet,int _rowpos,int _colpos,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cell = null;
 //BA.debugLineNum = 306;BA.debugLine="Sub SetText(sheet As BANanoObject, rowPos As Int,";
 //BA.debugLineNum = 307;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
_cell = new anywheresoftware.b4a.objects.collections.Map();
_cell = _cell2map(_createtext(_value));
 //BA.debugLineNum = 308;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
_sheet.RunMethod("cell",(Object)(new Object[]{(Object)(_rowpos),(Object)(_colpos)})).RunMethod("set",(Object)(new Object[]{(Object)(_cell.getObject())}));
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _worksheet(String _sheetname) throws Exception{
com.ab.banano.BANanoObject _wksheet = null;
 //BA.debugLineNum = 226;BA.debugLine="Sub WorkSheet(sheetName As String) As BANanoObject";
 //BA.debugLineNum = 227;BA.debugLine="Dim wkSheet As BANanoObject";
_wksheet = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 228;BA.debugLine="wkSheet = WorkBook.RunMethod(\"sheet\", Array(sheet";
_wksheet = _workbook.RunMethod("sheet",(Object)(new Object[]{(Object)(_sheetname)}));
 //BA.debugLineNum = 229;BA.debugLine="Return wkSheet";
if (true) return _wksheet;
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
