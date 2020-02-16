package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcss extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcss", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcss.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _cssoverflow{
public boolean IsInitialized;
public String all;
public String x;
public String y;
public void Initialize() {
IsInitialized = true;
all = "";
x = "";
y = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _styleobj{
public boolean IsInitialized;
public String letterspacing;
public String Color;
public String lineheight;
public String direction;
public String wordspacing;
public String verticalalign;
public String display;
public String visibility;
public b4j.example.vmcss._csspositions position;
public String zindex;
public String clip;
public b4j.example.vmcss._cssoverflow overflow;
public String floatto;
public String clear;
public String opacity;
public String BackGround;
public String resize;
public String boxsizing;
public String boxshadow;
public String whitespace;
public void Initialize() {
IsInitialized = true;
letterspacing = "";
Color = "";
lineheight = "";
direction = "";
wordspacing = "";
verticalalign = "";
display = "";
visibility = "";
position = new b4j.example.vmcss._csspositions();
zindex = "";
clip = "";
overflow = new b4j.example.vmcss._cssoverflow();
floatto = "";
clear = "";
opacity = "";
BackGround = "";
resize = "";
boxsizing = "";
boxshadow = "";
whitespace = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _csssize{
public boolean IsInitialized;
public String size;
public String maxsize;
public String minsize;
public void Initialize() {
IsInitialized = true;
size = "";
maxsize = "";
minsize = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssbackground{
public boolean IsInitialized;
public String Color;
public String Image;
public String repeat;
public String attachment;
public String position;
public String clip;
public String size;
public String Origin;
public void Initialize() {
IsInitialized = true;
Color = "";
Image = "";
repeat = "";
attachment = "";
position = "";
clip = "";
size = "";
Origin = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _csspositions{
public boolean IsInitialized;
public String all;
public String top;
public String bottom;
public String left;
public String right;
public void Initialize() {
IsInitialized = true;
all = "";
top = "";
bottom = "";
left = "";
right = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssradius{
public boolean IsInitialized;
public String all;
public String topleft;
public String topright;
public String bottomleft;
public String bottomright;
public void Initialize() {
IsInitialized = true;
all = "";
topleft = "";
topright = "";
bottomleft = "";
bottomright = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssborder{
public boolean IsInitialized;
public b4j.example.vmcss._csspositions Style;
public String size;
public b4j.example.vmcss._csspositions Width;
public b4j.example.vmcss._csspositions Color;
public b4j.example.vmcss._cssradius radius;
public String collapse;
public b4j.example.vmcss._cssborderimage Image;
public void Initialize() {
IsInitialized = true;
Style = new b4j.example.vmcss._csspositions();
size = "";
Width = new b4j.example.vmcss._csspositions();
Color = new b4j.example.vmcss._csspositions();
radius = new b4j.example.vmcss._cssradius();
collapse = "";
Image = new b4j.example.vmcss._cssborderimage();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssoutline{
public boolean IsInitialized;
public String all;
public String offset;
public String Color;
public String Style;
public String Width;
public void Initialize() {
IsInitialized = true;
all = "";
offset = "";
Color = "";
Style = "";
Width = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssfont{
public boolean IsInitialized;
public String all;
public String fontFamily;
public String Style;
public String size;
public String weight;
public String variant;
public String src;
public String stretch;
public void Initialize() {
IsInitialized = true;
all = "";
fontFamily = "";
Style = "";
size = "";
weight = "";
variant = "";
src = "";
stretch = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssborderimage{
public boolean IsInitialized;
public String Image;
public String source;
public String slice;
public String Width;
public String outset;
public String repeat;
public void Initialize() {
IsInitialized = true;
Image = "";
source = "";
slice = "";
Width = "";
outset = "";
repeat = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssliststyle{
public boolean IsInitialized;
public String typeOf;
public String position;
public String Image;
public void Initialize() {
IsInitialized = true;
typeOf = "";
position = "";
Image = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _csstransform{
public boolean IsInitialized;
public String texttransform;
public String mstransform;
public String origin;
public String Style;
public String perspective;
public String perspectiveorigin;
public String backfacevisibility;
public String webkittransform;
public void Initialize() {
IsInitialized = true;
texttransform = "";
mstransform = "";
origin = "";
Style = "";
perspective = "";
perspectiveorigin = "";
backfacevisibility = "";
webkittransform = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _csstransition{
public boolean IsInitialized;
public String webkittransition;
public String Transition;
public String delay;
public String duration;
public String property;
public String timingfunction;
public void Initialize() {
IsInitialized = true;
webkittransition = "";
Transition = "";
delay = "";
duration = "";
property = "";
timingfunction = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssanimation{
public boolean IsInitialized;
public String Animation;
public String delay;
public String duration;
public String direction;
public String fillmode;
public String iterationcount;
public String name;
public String playstate;
public String timingfunction;
public void Initialize() {
IsInitialized = true;
Animation = "";
delay = "";
duration = "";
direction = "";
fillmode = "";
iterationcount = "";
name = "";
playstate = "";
timingfunction = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssfilter{
public boolean IsInitialized;
public String Filter;
public String webkitfilter;
public void Initialize() {
IsInitialized = true;
Filter = "";
webkitfilter = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cssimage{
public boolean IsInitialized;
public String objectfit;
public void Initialize() {
IsInitialized = true;
objectfit = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _csstext{
public boolean IsInitialized;
public String align;
public String decoration;
public String indent;
public String Textshadow;
public String textoverflow;
public void Initialize() {
IsInitialized = true;
align = "";
decoration = "";
indent = "";
Textshadow = "";
textoverflow = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmcss._styleobj _style = null;
public b4j.example.vmcss._csssize _width = null;
public b4j.example.vmcss._csssize _height = null;
public b4j.example.vmcss._cssbackground _background = null;
public b4j.example.vmcss._cssborder _border = null;
public b4j.example.vmcss._csspositions _margin = null;
public b4j.example.vmcss._csspositions _padding = null;
public b4j.example.vmcss._cssoutline _outline = null;
public b4j.example.vmcss._csstext _text = null;
public b4j.example.vmcss._cssfont _font = null;
public anywheresoftware.b4a.objects.collections.Map _css = null;
public b4j.example.vmcss._cssliststyle _liststyle = null;
public b4j.example.vmcss._csstransform _transform = null;
public b4j.example.vmcss._csstransition _transition = null;
public b4j.example.vmcss._cssanimation _animation = null;
public b4j.example.vmcss._cssfilter _filter = null;
public b4j.example.vmcss._cssimage _image = null;
public anywheresoftware.b4a.objects.collections.List _sortit = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _initialize(b4j.example.vmcss __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcss";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=102170624;
 //BA.debugLineNum = 102170624;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=102170625;
 //BA.debugLineNum = 102170625;BA.debugLine="css.Initialize";
__ref._css /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=102170626;
 //BA.debugLineNum = 102170626;BA.debugLine="BackGround.Initialize";
__ref._background /*b4j.example.vmcss._cssbackground*/ .Initialize();
RDebugUtils.currentLine=102170627;
 //BA.debugLineNum = 102170627;BA.debugLine="Border.Initialize";
__ref._border /*b4j.example.vmcss._cssborder*/ .Initialize();
RDebugUtils.currentLine=102170628;
 //BA.debugLineNum = 102170628;BA.debugLine="Border.Color.Initialize";
__ref._border /*b4j.example.vmcss._cssborder*/ .Color /*b4j.example.vmcss._csspositions*/ .Initialize();
RDebugUtils.currentLine=102170629;
 //BA.debugLineNum = 102170629;BA.debugLine="Border.width.Initialize";
__ref._border /*b4j.example.vmcss._cssborder*/ .Width /*b4j.example.vmcss._csspositions*/ .Initialize();
RDebugUtils.currentLine=102170630;
 //BA.debugLineNum = 102170630;BA.debugLine="Border.style.Initialize";
__ref._border /*b4j.example.vmcss._cssborder*/ .Style /*b4j.example.vmcss._csspositions*/ .Initialize();
RDebugUtils.currentLine=102170631;
 //BA.debugLineNum = 102170631;BA.debugLine="Border.radius.Initialize";
__ref._border /*b4j.example.vmcss._cssborder*/ .radius /*b4j.example.vmcss._cssradius*/ .Initialize();
RDebugUtils.currentLine=102170632;
 //BA.debugLineNum = 102170632;BA.debugLine="Border.image.Initialize";
__ref._border /*b4j.example.vmcss._cssborder*/ .Image /*b4j.example.vmcss._cssborderimage*/ .Initialize();
RDebugUtils.currentLine=102170633;
 //BA.debugLineNum = 102170633;BA.debugLine="Margin.Initialize";
__ref._margin /*b4j.example.vmcss._csspositions*/ .Initialize();
RDebugUtils.currentLine=102170634;
 //BA.debugLineNum = 102170634;BA.debugLine="Padding.Initialize";
__ref._padding /*b4j.example.vmcss._csspositions*/ .Initialize();
RDebugUtils.currentLine=102170635;
 //BA.debugLineNum = 102170635;BA.debugLine="Height.Initialize";
__ref._height /*b4j.example.vmcss._csssize*/ .Initialize();
RDebugUtils.currentLine=102170636;
 //BA.debugLineNum = 102170636;BA.debugLine="Width.Initialize";
__ref._width /*b4j.example.vmcss._csssize*/ .Initialize();
RDebugUtils.currentLine=102170637;
 //BA.debugLineNum = 102170637;BA.debugLine="Outline.Initialize";
__ref._outline /*b4j.example.vmcss._cssoutline*/ .Initialize();
RDebugUtils.currentLine=102170638;
 //BA.debugLineNum = 102170638;BA.debugLine="Style.Initialize";
__ref._style /*b4j.example.vmcss._styleobj*/ .Initialize();
RDebugUtils.currentLine=102170639;
 //BA.debugLineNum = 102170639;BA.debugLine="Text.Initialize";
__ref._text /*b4j.example.vmcss._csstext*/ .Initialize();
RDebugUtils.currentLine=102170640;
 //BA.debugLineNum = 102170640;BA.debugLine="Style.position.Initialize";
__ref._style /*b4j.example.vmcss._styleobj*/ .position /*b4j.example.vmcss._csspositions*/ .Initialize();
RDebugUtils.currentLine=102170641;
 //BA.debugLineNum = 102170641;BA.debugLine="Style.overflow.Initialize";
__ref._style /*b4j.example.vmcss._styleobj*/ .overflow /*b4j.example.vmcss._cssoverflow*/ .Initialize();
RDebugUtils.currentLine=102170642;
 //BA.debugLineNum = 102170642;BA.debugLine="Font.Initialize";
__ref._font /*b4j.example.vmcss._cssfont*/ .Initialize();
RDebugUtils.currentLine=102170643;
 //BA.debugLineNum = 102170643;BA.debugLine="ListStyle.Initialize";
__ref._liststyle /*b4j.example.vmcss._cssliststyle*/ .Initialize();
RDebugUtils.currentLine=102170644;
 //BA.debugLineNum = 102170644;BA.debugLine="Transform.Initialize";
__ref._transform /*b4j.example.vmcss._csstransform*/ .Initialize();
RDebugUtils.currentLine=102170645;
 //BA.debugLineNum = 102170645;BA.debugLine="Transition.Initialize";
__ref._transition /*b4j.example.vmcss._csstransition*/ .Initialize();
RDebugUtils.currentLine=102170646;
 //BA.debugLineNum = 102170646;BA.debugLine="Animation.Initialize";
__ref._animation /*b4j.example.vmcss._cssanimation*/ .Initialize();
RDebugUtils.currentLine=102170647;
 //BA.debugLineNum = 102170647;BA.debugLine="Filter.Initialize";
__ref._filter /*b4j.example.vmcss._cssfilter*/ .Initialize();
RDebugUtils.currentLine=102170648;
 //BA.debugLineNum = 102170648;BA.debugLine="Image.Initialize";
__ref._image /*b4j.example.vmcss._cssimage*/ .Initialize();
RDebugUtils.currentLine=102170649;
 //BA.debugLineNum = 102170649;BA.debugLine="End Sub";
return "";
}
public String  _build(b4j.example.vmcss __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcss";
if (Debug.shouldDelegate(ba, "build", true))
	 {return ((String) Debug.delegate(ba, "build", null));}
String _strprop = "";
RDebugUtils.currentLine=102301696;
 //BA.debugLineNum = 102301696;BA.debugLine="Sub Build";
RDebugUtils.currentLine=102301697;
 //BA.debugLineNum = 102301697;BA.debugLine="SetAttr(\"color\",Style.Color)";
__ref._setattr /*b4j.example.vmcss*/ (null,"color",__ref._style /*b4j.example.vmcss._styleobj*/ .Color /*String*/ );
RDebugUtils.currentLine=102301698;
 //BA.debugLineNum = 102301698;BA.debugLine="SetAttr(\"text-align\",Text.align)";
__ref._setattr /*b4j.example.vmcss*/ (null,"text-align",__ref._text /*b4j.example.vmcss._csstext*/ .align /*String*/ );
RDebugUtils.currentLine=102301699;
 //BA.debugLineNum = 102301699;BA.debugLine="SetAttr(\"text-decoration\",Text.decoration)";
__ref._setattr /*b4j.example.vmcss*/ (null,"text-decoration",__ref._text /*b4j.example.vmcss._csstext*/ .decoration /*String*/ );
RDebugUtils.currentLine=102301700;
 //BA.debugLineNum = 102301700;BA.debugLine="SetAttr(\"text-indent\", Text.indent)";
__ref._setattr /*b4j.example.vmcss*/ (null,"text-indent",__ref._text /*b4j.example.vmcss._csstext*/ .indent /*String*/ );
RDebugUtils.currentLine=102301701;
 //BA.debugLineNum = 102301701;BA.debugLine="SetAttr(\"letter-spacing\", Style.letterspacing)";
__ref._setattr /*b4j.example.vmcss*/ (null,"letter-spacing",__ref._style /*b4j.example.vmcss._styleobj*/ .letterspacing /*String*/ );
RDebugUtils.currentLine=102301702;
 //BA.debugLineNum = 102301702;BA.debugLine="SetAttr(\"line-height\", Style.lineheight)";
__ref._setattr /*b4j.example.vmcss*/ (null,"line-height",__ref._style /*b4j.example.vmcss._styleobj*/ .lineheight /*String*/ );
RDebugUtils.currentLine=102301703;
 //BA.debugLineNum = 102301703;BA.debugLine="SetAttr(\"direction\", Style.direction)";
__ref._setattr /*b4j.example.vmcss*/ (null,"direction",__ref._style /*b4j.example.vmcss._styleobj*/ .direction /*String*/ );
RDebugUtils.currentLine=102301704;
 //BA.debugLineNum = 102301704;BA.debugLine="SetAttr(\"word-spacing\", Style.wordspacing)";
__ref._setattr /*b4j.example.vmcss*/ (null,"word-spacing",__ref._style /*b4j.example.vmcss._styleobj*/ .wordspacing /*String*/ );
RDebugUtils.currentLine=102301705;
 //BA.debugLineNum = 102301705;BA.debugLine="SetAttr(\"text-shadow\", Text.Textshadow)";
__ref._setattr /*b4j.example.vmcss*/ (null,"text-shadow",__ref._text /*b4j.example.vmcss._csstext*/ .Textshadow /*String*/ );
RDebugUtils.currentLine=102301706;
 //BA.debugLineNum = 102301706;BA.debugLine="SetAttr(\"vertical-align\", Style.verticalalign)";
__ref._setattr /*b4j.example.vmcss*/ (null,"vertical-align",__ref._style /*b4j.example.vmcss._styleobj*/ .verticalalign /*String*/ );
RDebugUtils.currentLine=102301707;
 //BA.debugLineNum = 102301707;BA.debugLine="SetAttr(\"display\",Style.display)";
__ref._setattr /*b4j.example.vmcss*/ (null,"display",__ref._style /*b4j.example.vmcss._styleobj*/ .display /*String*/ );
RDebugUtils.currentLine=102301708;
 //BA.debugLineNum = 102301708;BA.debugLine="SetAttr(\"visibility\",Style.visibility)";
__ref._setattr /*b4j.example.vmcss*/ (null,"visibility",__ref._style /*b4j.example.vmcss._styleobj*/ .visibility /*String*/ );
RDebugUtils.currentLine=102301709;
 //BA.debugLineNum = 102301709;BA.debugLine="SetAttr(\"clip\",Style.clip)";
__ref._setattr /*b4j.example.vmcss*/ (null,"clip",__ref._style /*b4j.example.vmcss._styleobj*/ .clip /*String*/ );
RDebugUtils.currentLine=102301710;
 //BA.debugLineNum = 102301710;BA.debugLine="SetAttr(\"float\",Style.floatto)";
__ref._setattr /*b4j.example.vmcss*/ (null,"float",__ref._style /*b4j.example.vmcss._styleobj*/ .floatto /*String*/ );
RDebugUtils.currentLine=102301711;
 //BA.debugLineNum = 102301711;BA.debugLine="SetAttr(\"clear\",Style.clear)";
__ref._setattr /*b4j.example.vmcss*/ (null,"clear",__ref._style /*b4j.example.vmcss._styleobj*/ .clear /*String*/ );
RDebugUtils.currentLine=102301712;
 //BA.debugLineNum = 102301712;BA.debugLine="SetAttr(\"opacity\",Style.opacity)";
__ref._setattr /*b4j.example.vmcss*/ (null,"opacity",__ref._style /*b4j.example.vmcss._styleobj*/ .opacity /*String*/ );
RDebugUtils.currentLine=102301713;
 //BA.debugLineNum = 102301713;BA.debugLine="SetAttr(\"background\",Style.BackGround)";
__ref._setattr /*b4j.example.vmcss*/ (null,"background",__ref._style /*b4j.example.vmcss._styleobj*/ .BackGround /*String*/ );
RDebugUtils.currentLine=102301714;
 //BA.debugLineNum = 102301714;BA.debugLine="SetAttr(\"box-sizing\",Style.boxsizing)";
__ref._setattr /*b4j.example.vmcss*/ (null,"box-sizing",__ref._style /*b4j.example.vmcss._styleobj*/ .boxsizing /*String*/ );
RDebugUtils.currentLine=102301715;
 //BA.debugLineNum = 102301715;BA.debugLine="SetAttr(\"resize\",Style.resize)";
__ref._setattr /*b4j.example.vmcss*/ (null,"resize",__ref._style /*b4j.example.vmcss._styleobj*/ .resize /*String*/ );
RDebugUtils.currentLine=102301716;
 //BA.debugLineNum = 102301716;BA.debugLine="SetAttr(\"box-shadow\", Style.boxshadow)";
__ref._setattr /*b4j.example.vmcss*/ (null,"box-shadow",__ref._style /*b4j.example.vmcss._styleobj*/ .boxshadow /*String*/ );
RDebugUtils.currentLine=102301717;
 //BA.debugLineNum = 102301717;BA.debugLine="SetAttr(\"white-space\", Style.whitespace)";
__ref._setattr /*b4j.example.vmcss*/ (null,"white-space",__ref._style /*b4j.example.vmcss._styleobj*/ .whitespace /*String*/ );
RDebugUtils.currentLine=102301718;
 //BA.debugLineNum = 102301718;BA.debugLine="SetAttr(\"text-overflow\", Text.textoverflow)";
__ref._setattr /*b4j.example.vmcss*/ (null,"text-overflow",__ref._text /*b4j.example.vmcss._csstext*/ .textoverflow /*String*/ );
RDebugUtils.currentLine=102301721;
 //BA.debugLineNum = 102301721;BA.debugLine="SetAttr(\"object-fit\", Image.objectfit)";
__ref._setattr /*b4j.example.vmcss*/ (null,"object-fit",__ref._image /*b4j.example.vmcss._cssimage*/ .objectfit /*String*/ );
RDebugUtils.currentLine=102301725;
 //BA.debugLineNum = 102301725;BA.debugLine="SetAttr(\"filter\",Filter.filter)";
__ref._setattr /*b4j.example.vmcss*/ (null,"filter",__ref._filter /*b4j.example.vmcss._cssfilter*/ .Filter /*String*/ );
RDebugUtils.currentLine=102301726;
 //BA.debugLineNum = 102301726;BA.debugLine="SetAttr(\"-webkit-filter\", Filter.webkitfilter)";
__ref._setattr /*b4j.example.vmcss*/ (null,"-webkit-filter",__ref._filter /*b4j.example.vmcss._cssfilter*/ .webkitfilter /*String*/ );
RDebugUtils.currentLine=102301729;
 //BA.debugLineNum = 102301729;BA.debugLine="SetAttr(\"animation\", Animation.animation)";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation",__ref._animation /*b4j.example.vmcss._cssanimation*/ .Animation /*String*/ );
RDebugUtils.currentLine=102301730;
 //BA.debugLineNum = 102301730;BA.debugLine="SetAttr(\"animation-delay\", Animation.delay)";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation-delay",__ref._animation /*b4j.example.vmcss._cssanimation*/ .delay /*String*/ );
RDebugUtils.currentLine=102301731;
 //BA.debugLineNum = 102301731;BA.debugLine="SetAttr(\"animation-direction\", Animation.directio";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation-direction",__ref._animation /*b4j.example.vmcss._cssanimation*/ .direction /*String*/ );
RDebugUtils.currentLine=102301732;
 //BA.debugLineNum = 102301732;BA.debugLine="SetAttr(\"animation-duration\", Animation.duration)";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation-duration",__ref._animation /*b4j.example.vmcss._cssanimation*/ .duration /*String*/ );
RDebugUtils.currentLine=102301733;
 //BA.debugLineNum = 102301733;BA.debugLine="SetAttr(\"animation-fill-mode\", Animation.fillmode";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation-fill-mode",__ref._animation /*b4j.example.vmcss._cssanimation*/ .fillmode /*String*/ );
RDebugUtils.currentLine=102301734;
 //BA.debugLineNum = 102301734;BA.debugLine="SetAttr(\"animation-iteration-count\", Animation.it";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation-iteration-count",__ref._animation /*b4j.example.vmcss._cssanimation*/ .iterationcount /*String*/ );
RDebugUtils.currentLine=102301735;
 //BA.debugLineNum = 102301735;BA.debugLine="SetAttr(\"animation-name\", Animation.name)";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation-name",__ref._animation /*b4j.example.vmcss._cssanimation*/ .name /*String*/ );
RDebugUtils.currentLine=102301736;
 //BA.debugLineNum = 102301736;BA.debugLine="SetAttr(\"animation-play-state\", Animation.playsta";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation-play-state",__ref._animation /*b4j.example.vmcss._cssanimation*/ .playstate /*String*/ );
RDebugUtils.currentLine=102301737;
 //BA.debugLineNum = 102301737;BA.debugLine="SetAttr(\"animation-timing-function\", Animation.ti";
__ref._setattr /*b4j.example.vmcss*/ (null,"animation-timing-function",__ref._animation /*b4j.example.vmcss._cssanimation*/ .timingfunction /*String*/ );
RDebugUtils.currentLine=102301741;
 //BA.debugLineNum = 102301741;BA.debugLine="SetAttr(\"-webkit-transition\",Transition.webkittra";
__ref._setattr /*b4j.example.vmcss*/ (null,"-webkit-transition",__ref._transition /*b4j.example.vmcss._csstransition*/ .webkittransition /*String*/ );
RDebugUtils.currentLine=102301742;
 //BA.debugLineNum = 102301742;BA.debugLine="SetAttr(\"transition\",Transition.transition)";
__ref._setattr /*b4j.example.vmcss*/ (null,"transition",__ref._transition /*b4j.example.vmcss._csstransition*/ .Transition /*String*/ );
RDebugUtils.currentLine=102301743;
 //BA.debugLineNum = 102301743;BA.debugLine="SetAttr(\"transition-delay\",Transition.delay)";
__ref._setattr /*b4j.example.vmcss*/ (null,"transition-delay",__ref._transition /*b4j.example.vmcss._csstransition*/ .delay /*String*/ );
RDebugUtils.currentLine=102301744;
 //BA.debugLineNum = 102301744;BA.debugLine="SetAttr(\"transition-duration\",Transition.duration";
__ref._setattr /*b4j.example.vmcss*/ (null,"transition-duration",__ref._transition /*b4j.example.vmcss._csstransition*/ .duration /*String*/ );
RDebugUtils.currentLine=102301745;
 //BA.debugLineNum = 102301745;BA.debugLine="SetAttr(\"transition-property\",Transition.property";
__ref._setattr /*b4j.example.vmcss*/ (null,"transition-property",__ref._transition /*b4j.example.vmcss._csstransition*/ .property /*String*/ );
RDebugUtils.currentLine=102301746;
 //BA.debugLineNum = 102301746;BA.debugLine="SetAttr(\"transition-timing-function\",Transition.t";
__ref._setattr /*b4j.example.vmcss*/ (null,"transition-timing-function",__ref._transition /*b4j.example.vmcss._csstransition*/ .timingfunction /*String*/ );
RDebugUtils.currentLine=102301749;
 //BA.debugLineNum = 102301749;BA.debugLine="SetAttr(\"text-transform\", Transform.texttransform";
__ref._setattr /*b4j.example.vmcss*/ (null,"text-transform",__ref._transform /*b4j.example.vmcss._csstransform*/ .texttransform /*String*/ );
RDebugUtils.currentLine=102301750;
 //BA.debugLineNum = 102301750;BA.debugLine="SetAttr(\"-ms-transform\", Transform.mstransform)";
__ref._setattr /*b4j.example.vmcss*/ (null,"-ms-transform",__ref._transform /*b4j.example.vmcss._csstransform*/ .mstransform /*String*/ );
RDebugUtils.currentLine=102301751;
 //BA.debugLineNum = 102301751;BA.debugLine="SetAttr(\"transform-origin\", Transform.origin)";
__ref._setattr /*b4j.example.vmcss*/ (null,"transform-origin",__ref._transform /*b4j.example.vmcss._csstransform*/ .origin /*String*/ );
RDebugUtils.currentLine=102301752;
 //BA.debugLineNum = 102301752;BA.debugLine="SetAttr(\"transform-style\", Transform.style)";
__ref._setattr /*b4j.example.vmcss*/ (null,"transform-style",__ref._transform /*b4j.example.vmcss._csstransform*/ .Style /*String*/ );
RDebugUtils.currentLine=102301753;
 //BA.debugLineNum = 102301753;BA.debugLine="SetAttr(\"perspective\", Transform.perspective)";
__ref._setattr /*b4j.example.vmcss*/ (null,"perspective",__ref._transform /*b4j.example.vmcss._csstransform*/ .perspective /*String*/ );
RDebugUtils.currentLine=102301754;
 //BA.debugLineNum = 102301754;BA.debugLine="SetAttr(\"perspective-origin\", Transform.perspecti";
__ref._setattr /*b4j.example.vmcss*/ (null,"perspective-origin",__ref._transform /*b4j.example.vmcss._csstransform*/ .perspectiveorigin /*String*/ );
RDebugUtils.currentLine=102301755;
 //BA.debugLineNum = 102301755;BA.debugLine="SetAttr(\"backface-visibility\", Transform.backface";
__ref._setattr /*b4j.example.vmcss*/ (null,"backface-visibility",__ref._transform /*b4j.example.vmcss._csstransform*/ .backfacevisibility /*String*/ );
RDebugUtils.currentLine=102301756;
 //BA.debugLineNum = 102301756;BA.debugLine="SetAttr(\"-webkit-transform\", Transform.webkittran";
__ref._setattr /*b4j.example.vmcss*/ (null,"-webkit-transform",__ref._transform /*b4j.example.vmcss._csstransform*/ .webkittransform /*String*/ );
RDebugUtils.currentLine=102301759;
 //BA.debugLineNum = 102301759;BA.debugLine="SetAttr(\"overflow\",Style.overflow.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"overflow",__ref._style /*b4j.example.vmcss._styleobj*/ .overflow /*b4j.example.vmcss._cssoverflow*/ .all /*String*/ );
RDebugUtils.currentLine=102301760;
 //BA.debugLineNum = 102301760;BA.debugLine="SetAttr(\"overflow-y\",Style.overflow.y)";
__ref._setattr /*b4j.example.vmcss*/ (null,"overflow-y",__ref._style /*b4j.example.vmcss._styleobj*/ .overflow /*b4j.example.vmcss._cssoverflow*/ .y /*String*/ );
RDebugUtils.currentLine=102301761;
 //BA.debugLineNum = 102301761;BA.debugLine="SetAttr(\"overflow-x\",Style.overflow.x)";
__ref._setattr /*b4j.example.vmcss*/ (null,"overflow-x",__ref._style /*b4j.example.vmcss._styleobj*/ .overflow /*b4j.example.vmcss._cssoverflow*/ .x /*String*/ );
RDebugUtils.currentLine=102301764;
 //BA.debugLineNum = 102301764;BA.debugLine="SetAttr(\"z-index\",Style.zindex)";
__ref._setattr /*b4j.example.vmcss*/ (null,"z-index",__ref._style /*b4j.example.vmcss._styleobj*/ .zindex /*String*/ );
RDebugUtils.currentLine=102301765;
 //BA.debugLineNum = 102301765;BA.debugLine="SetAttr(\"position\",Style.position.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"position",__ref._style /*b4j.example.vmcss._styleobj*/ .position /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
RDebugUtils.currentLine=102301766;
 //BA.debugLineNum = 102301766;BA.debugLine="SetAttr(\"left\",Style.position.left)";
__ref._setattr /*b4j.example.vmcss*/ (null,"left",__ref._style /*b4j.example.vmcss._styleobj*/ .position /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
RDebugUtils.currentLine=102301767;
 //BA.debugLineNum = 102301767;BA.debugLine="SetAttr(\"top\",Style.position.top)";
__ref._setattr /*b4j.example.vmcss*/ (null,"top",__ref._style /*b4j.example.vmcss._styleobj*/ .position /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
RDebugUtils.currentLine=102301768;
 //BA.debugLineNum = 102301768;BA.debugLine="SetAttr(\"bottom\",Style.position.bottom)";
__ref._setattr /*b4j.example.vmcss*/ (null,"bottom",__ref._style /*b4j.example.vmcss._styleobj*/ .position /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
RDebugUtils.currentLine=102301769;
 //BA.debugLineNum = 102301769;BA.debugLine="SetAttr(\"right\",Style.position.right)";
__ref._setattr /*b4j.example.vmcss*/ (null,"right",__ref._style /*b4j.example.vmcss._styleobj*/ .position /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
RDebugUtils.currentLine=102301772;
 //BA.debugLineNum = 102301772;BA.debugLine="SetAttr(\"font\", Font.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"font",__ref._font /*b4j.example.vmcss._cssfont*/ .all /*String*/ );
RDebugUtils.currentLine=102301773;
 //BA.debugLineNum = 102301773;BA.debugLine="SetAttr(\"font-family\", Font.fontFamily)";
__ref._setattr /*b4j.example.vmcss*/ (null,"font-family",__ref._font /*b4j.example.vmcss._cssfont*/ .fontFamily /*String*/ );
RDebugUtils.currentLine=102301774;
 //BA.debugLineNum = 102301774;BA.debugLine="SetAttr(\"font-style\", Font.style)";
__ref._setattr /*b4j.example.vmcss*/ (null,"font-style",__ref._font /*b4j.example.vmcss._cssfont*/ .Style /*String*/ );
RDebugUtils.currentLine=102301775;
 //BA.debugLineNum = 102301775;BA.debugLine="SetAttr(\"font-size\", Font.size)";
__ref._setattr /*b4j.example.vmcss*/ (null,"font-size",__ref._font /*b4j.example.vmcss._cssfont*/ .size /*String*/ );
RDebugUtils.currentLine=102301776;
 //BA.debugLineNum = 102301776;BA.debugLine="SetAttr(\"font-weight\", Font.weight)";
__ref._setattr /*b4j.example.vmcss*/ (null,"font-weight",__ref._font /*b4j.example.vmcss._cssfont*/ .weight /*String*/ );
RDebugUtils.currentLine=102301777;
 //BA.debugLineNum = 102301777;BA.debugLine="SetAttr(\"font-variant\", Font.variant)";
__ref._setattr /*b4j.example.vmcss*/ (null,"font-variant",__ref._font /*b4j.example.vmcss._cssfont*/ .variant /*String*/ );
RDebugUtils.currentLine=102301778;
 //BA.debugLineNum = 102301778;BA.debugLine="SetAttr(\"src\", Font.src)";
__ref._setattr /*b4j.example.vmcss*/ (null,"src",__ref._font /*b4j.example.vmcss._cssfont*/ .src /*String*/ );
RDebugUtils.currentLine=102301779;
 //BA.debugLineNum = 102301779;BA.debugLine="SetAttr(\"font-stretch\", Font.stretch)";
__ref._setattr /*b4j.example.vmcss*/ (null,"font-stretch",__ref._font /*b4j.example.vmcss._cssfont*/ .stretch /*String*/ );
RDebugUtils.currentLine=102301781;
 //BA.debugLineNum = 102301781;BA.debugLine="SetAttr(\"list-style-type\", ListStyle.typeof)";
__ref._setattr /*b4j.example.vmcss*/ (null,"list-style-type",__ref._liststyle /*b4j.example.vmcss._cssliststyle*/ .typeOf /*String*/ );
RDebugUtils.currentLine=102301782;
 //BA.debugLineNum = 102301782;BA.debugLine="SetAttr(\"list-style-position\", ListStyle.position";
__ref._setattr /*b4j.example.vmcss*/ (null,"list-style-position",__ref._liststyle /*b4j.example.vmcss._cssliststyle*/ .position /*String*/ );
RDebugUtils.currentLine=102301783;
 //BA.debugLineNum = 102301783;BA.debugLine="SetAttr(\"list-style-image\", $\"url('${ListStyle.im";
__ref._setattr /*b4j.example.vmcss*/ (null,"list-style-image",("url('"+__c.SmartStringFormatter("",(Object)(__ref._liststyle /*b4j.example.vmcss._cssliststyle*/ .Image /*String*/ ))+"')"));
RDebugUtils.currentLine=102301785;
 //BA.debugLineNum = 102301785;BA.debugLine="SetAttr(\"width\",Width.size)";
__ref._setattr /*b4j.example.vmcss*/ (null,"width",__ref._width /*b4j.example.vmcss._csssize*/ .size /*String*/ );
RDebugUtils.currentLine=102301786;
 //BA.debugLineNum = 102301786;BA.debugLine="SetAttr(\"max-width\",Width.maxsize)";
__ref._setattr /*b4j.example.vmcss*/ (null,"max-width",__ref._width /*b4j.example.vmcss._csssize*/ .maxsize /*String*/ );
RDebugUtils.currentLine=102301787;
 //BA.debugLineNum = 102301787;BA.debugLine="SetAttr(\"min-width\",Width.minsize)";
__ref._setattr /*b4j.example.vmcss*/ (null,"min-width",__ref._width /*b4j.example.vmcss._csssize*/ .minsize /*String*/ );
RDebugUtils.currentLine=102301789;
 //BA.debugLineNum = 102301789;BA.debugLine="SetAttr(\"height\",Height.size)";
__ref._setattr /*b4j.example.vmcss*/ (null,"height",__ref._height /*b4j.example.vmcss._csssize*/ .size /*String*/ );
RDebugUtils.currentLine=102301790;
 //BA.debugLineNum = 102301790;BA.debugLine="SetAttr(\"max-height\",Height.maxsize)";
__ref._setattr /*b4j.example.vmcss*/ (null,"max-height",__ref._height /*b4j.example.vmcss._csssize*/ .maxsize /*String*/ );
RDebugUtils.currentLine=102301791;
 //BA.debugLineNum = 102301791;BA.debugLine="SetAttr(\"min-height\",Height.minsize)";
__ref._setattr /*b4j.example.vmcss*/ (null,"min-height",__ref._height /*b4j.example.vmcss._csssize*/ .minsize /*String*/ );
RDebugUtils.currentLine=102301793;
 //BA.debugLineNum = 102301793;BA.debugLine="SetAttr(\"background-color\",BackGround.color)";
__ref._setattr /*b4j.example.vmcss*/ (null,"background-color",__ref._background /*b4j.example.vmcss._cssbackground*/ .Color /*String*/ );
RDebugUtils.currentLine=102301794;
 //BA.debugLineNum = 102301794;BA.debugLine="SetAttr(\"background-image\", $\"url('${BackGround.i";
__ref._setattr /*b4j.example.vmcss*/ (null,"background-image",("url('"+__c.SmartStringFormatter("",(Object)(__ref._background /*b4j.example.vmcss._cssbackground*/ .Image /*String*/ ))+"')"));
RDebugUtils.currentLine=102301795;
 //BA.debugLineNum = 102301795;BA.debugLine="SetAttr(\"background-repeat\", BackGround.repeat)";
__ref._setattr /*b4j.example.vmcss*/ (null,"background-repeat",__ref._background /*b4j.example.vmcss._cssbackground*/ .repeat /*String*/ );
RDebugUtils.currentLine=102301796;
 //BA.debugLineNum = 102301796;BA.debugLine="SetAttr(\"background-position\", BackGround.positio";
__ref._setattr /*b4j.example.vmcss*/ (null,"background-position",__ref._background /*b4j.example.vmcss._cssbackground*/ .position /*String*/ );
RDebugUtils.currentLine=102301797;
 //BA.debugLineNum = 102301797;BA.debugLine="SetAttr(\"background-attachment\", BackGround.attac";
__ref._setattr /*b4j.example.vmcss*/ (null,"background-attachment",__ref._background /*b4j.example.vmcss._cssbackground*/ .attachment /*String*/ );
RDebugUtils.currentLine=102301798;
 //BA.debugLineNum = 102301798;BA.debugLine="SetAttr(\"background-clip\", BackGround.clip)";
__ref._setattr /*b4j.example.vmcss*/ (null,"background-clip",__ref._background /*b4j.example.vmcss._cssbackground*/ .clip /*String*/ );
RDebugUtils.currentLine=102301799;
 //BA.debugLineNum = 102301799;BA.debugLine="SetAttr(\"background-size\", BackGround.size)";
__ref._setattr /*b4j.example.vmcss*/ (null,"background-size",__ref._background /*b4j.example.vmcss._cssbackground*/ .size /*String*/ );
RDebugUtils.currentLine=102301800;
 //BA.debugLineNum = 102301800;BA.debugLine="SetAttr(\"background-origin\", BackGround.origin)";
__ref._setattr /*b4j.example.vmcss*/ (null,"background-origin",__ref._background /*b4j.example.vmcss._cssbackground*/ .Origin /*String*/ );
RDebugUtils.currentLine=102301803;
 //BA.debugLineNum = 102301803;BA.debugLine="SetAttr(\"border-collapse\",Border.collapse)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-collapse",__ref._border /*b4j.example.vmcss._cssborder*/ .collapse /*String*/ );
RDebugUtils.currentLine=102301804;
 //BA.debugLineNum = 102301804;BA.debugLine="SetAttr(\"border-style\", Border.style.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-style",__ref._border /*b4j.example.vmcss._cssborder*/ .Style /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
RDebugUtils.currentLine=102301805;
 //BA.debugLineNum = 102301805;BA.debugLine="SetAttr(\"border-top-style\", Border.style.top)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-top-style",__ref._border /*b4j.example.vmcss._cssborder*/ .Style /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
RDebugUtils.currentLine=102301806;
 //BA.debugLineNum = 102301806;BA.debugLine="SetAttr(\"border-bottom-style\", Border.style.botto";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-bottom-style",__ref._border /*b4j.example.vmcss._cssborder*/ .Style /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
RDebugUtils.currentLine=102301807;
 //BA.debugLineNum = 102301807;BA.debugLine="SetAttr(\"border-right-style\", Border.style.right)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-right-style",__ref._border /*b4j.example.vmcss._cssborder*/ .Style /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
RDebugUtils.currentLine=102301808;
 //BA.debugLineNum = 102301808;BA.debugLine="SetAttr(\"border-left-style\", Border.style.left)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-left-style",__ref._border /*b4j.example.vmcss._cssborder*/ .Style /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
RDebugUtils.currentLine=102301810;
 //BA.debugLineNum = 102301810;BA.debugLine="SetAttr(\"border-color\", Border.color.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-color",__ref._border /*b4j.example.vmcss._cssborder*/ .Color /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
RDebugUtils.currentLine=102301811;
 //BA.debugLineNum = 102301811;BA.debugLine="SetAttr(\"border-left-color\", Border.color.left)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-left-color",__ref._border /*b4j.example.vmcss._cssborder*/ .Color /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
RDebugUtils.currentLine=102301812;
 //BA.debugLineNum = 102301812;BA.debugLine="SetAttr(\"border-right-color\", Border.color.right)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-right-color",__ref._border /*b4j.example.vmcss._cssborder*/ .Color /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
RDebugUtils.currentLine=102301813;
 //BA.debugLineNum = 102301813;BA.debugLine="SetAttr(\"border-top-color\", Border.color.top)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-top-color",__ref._border /*b4j.example.vmcss._cssborder*/ .Color /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
RDebugUtils.currentLine=102301814;
 //BA.debugLineNum = 102301814;BA.debugLine="SetAttr(\"border-bottom-color\", Border.color.botto";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-bottom-color",__ref._border /*b4j.example.vmcss._cssborder*/ .Color /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
RDebugUtils.currentLine=102301816;
 //BA.debugLineNum = 102301816;BA.debugLine="SetAttr(\"border-radius\", Border.radius.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-radius",__ref._border /*b4j.example.vmcss._cssborder*/ .radius /*b4j.example.vmcss._cssradius*/ .all /*String*/ );
RDebugUtils.currentLine=102301817;
 //BA.debugLineNum = 102301817;BA.debugLine="SetAttr(\"border-top-left-radius\", Border.radius.t";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-top-left-radius",__ref._border /*b4j.example.vmcss._cssborder*/ .radius /*b4j.example.vmcss._cssradius*/ .topleft /*String*/ );
RDebugUtils.currentLine=102301818;
 //BA.debugLineNum = 102301818;BA.debugLine="SetAttr(\"border-top-right-radius\", Border.radius.";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-top-right-radius",__ref._border /*b4j.example.vmcss._cssborder*/ .radius /*b4j.example.vmcss._cssradius*/ .topright /*String*/ );
RDebugUtils.currentLine=102301819;
 //BA.debugLineNum = 102301819;BA.debugLine="SetAttr(\"border-bottom-left-radius\", Border.radiu";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-bottom-left-radius",__ref._border /*b4j.example.vmcss._cssborder*/ .radius /*b4j.example.vmcss._cssradius*/ .bottomleft /*String*/ );
RDebugUtils.currentLine=102301820;
 //BA.debugLineNum = 102301820;BA.debugLine="SetAttr(\"border-bottom-right-radius\", Border.radi";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-bottom-right-radius",__ref._border /*b4j.example.vmcss._cssborder*/ .radius /*b4j.example.vmcss._cssradius*/ .bottomright /*String*/ );
RDebugUtils.currentLine=102301823;
 //BA.debugLineNum = 102301823;BA.debugLine="SetAttr(\"border-width\", Border.width.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-width",__ref._border /*b4j.example.vmcss._cssborder*/ .Width /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
RDebugUtils.currentLine=102301824;
 //BA.debugLineNum = 102301824;BA.debugLine="SetAttr(\"border-left-width\",Border.width.left)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-left-width",__ref._border /*b4j.example.vmcss._cssborder*/ .Width /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
RDebugUtils.currentLine=102301825;
 //BA.debugLineNum = 102301825;BA.debugLine="SetAttr(\"border-right-width\",Border.width.right)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-right-width",__ref._border /*b4j.example.vmcss._cssborder*/ .Width /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
RDebugUtils.currentLine=102301826;
 //BA.debugLineNum = 102301826;BA.debugLine="SetAttr(\"border-top-width\",Border.width.top)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-top-width",__ref._border /*b4j.example.vmcss._cssborder*/ .Width /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
RDebugUtils.currentLine=102301827;
 //BA.debugLineNum = 102301827;BA.debugLine="SetAttr(\"border-bottom-width\",Border.width.bottom";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-bottom-width",__ref._border /*b4j.example.vmcss._cssborder*/ .Width /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
RDebugUtils.currentLine=102301830;
 //BA.debugLineNum = 102301830;BA.debugLine="SetAttr(\"border-image\", Border.image.image)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-image",__ref._border /*b4j.example.vmcss._cssborder*/ .Image /*b4j.example.vmcss._cssborderimage*/ .Image /*String*/ );
RDebugUtils.currentLine=102301831;
 //BA.debugLineNum = 102301831;BA.debugLine="SetAttr(\"border-image-source\",Border.image.source";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-image-source",__ref._border /*b4j.example.vmcss._cssborder*/ .Image /*b4j.example.vmcss._cssborderimage*/ .source /*String*/ );
RDebugUtils.currentLine=102301832;
 //BA.debugLineNum = 102301832;BA.debugLine="SetAttr(\"border-image-slice\",Border.image.slice)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-image-slice",__ref._border /*b4j.example.vmcss._cssborder*/ .Image /*b4j.example.vmcss._cssborderimage*/ .slice /*String*/ );
RDebugUtils.currentLine=102301833;
 //BA.debugLineNum = 102301833;BA.debugLine="SetAttr(\"border-image-width\",Border.image.width)";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-image-width",__ref._border /*b4j.example.vmcss._cssborder*/ .Image /*b4j.example.vmcss._cssborderimage*/ .Width /*String*/ );
RDebugUtils.currentLine=102301834;
 //BA.debugLineNum = 102301834;BA.debugLine="SetAttr(\"border-image-outset\",Border.image.outset";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-image-outset",__ref._border /*b4j.example.vmcss._cssborder*/ .Image /*b4j.example.vmcss._cssborderimage*/ .outset /*String*/ );
RDebugUtils.currentLine=102301835;
 //BA.debugLineNum = 102301835;BA.debugLine="SetAttr(\"border-image-repeat\",Border.image.repeat";
__ref._setattr /*b4j.example.vmcss*/ (null,"border-image-repeat",__ref._border /*b4j.example.vmcss._cssborder*/ .Image /*b4j.example.vmcss._cssborderimage*/ .repeat /*String*/ );
RDebugUtils.currentLine=102301838;
 //BA.debugLineNum = 102301838;BA.debugLine="SetAttr(\"margin\",Margin.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"margin",__ref._margin /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
RDebugUtils.currentLine=102301839;
 //BA.debugLineNum = 102301839;BA.debugLine="SetAttr(\"margin-top\",Margin.top)";
__ref._setattr /*b4j.example.vmcss*/ (null,"margin-top",__ref._margin /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
RDebugUtils.currentLine=102301840;
 //BA.debugLineNum = 102301840;BA.debugLine="SetAttr(\"margin-bottom\",Margin.bottom)";
__ref._setattr /*b4j.example.vmcss*/ (null,"margin-bottom",__ref._margin /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
RDebugUtils.currentLine=102301841;
 //BA.debugLineNum = 102301841;BA.debugLine="SetAttr(\"margin-left\",Margin.left)";
__ref._setattr /*b4j.example.vmcss*/ (null,"margin-left",__ref._margin /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
RDebugUtils.currentLine=102301842;
 //BA.debugLineNum = 102301842;BA.debugLine="SetAttr(\"margin-right\",Margin.right)";
__ref._setattr /*b4j.example.vmcss*/ (null,"margin-right",__ref._margin /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
RDebugUtils.currentLine=102301844;
 //BA.debugLineNum = 102301844;BA.debugLine="SetAttr(\"padding\",Padding.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"padding",__ref._padding /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
RDebugUtils.currentLine=102301845;
 //BA.debugLineNum = 102301845;BA.debugLine="SetAttr(\"padding-top\",Padding.top)";
__ref._setattr /*b4j.example.vmcss*/ (null,"padding-top",__ref._padding /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
RDebugUtils.currentLine=102301846;
 //BA.debugLineNum = 102301846;BA.debugLine="SetAttr(\"padding-bottom\",Padding.bottom)";
__ref._setattr /*b4j.example.vmcss*/ (null,"padding-bottom",__ref._padding /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
RDebugUtils.currentLine=102301847;
 //BA.debugLineNum = 102301847;BA.debugLine="SetAttr(\"padding-left\",Padding.left)";
__ref._setattr /*b4j.example.vmcss*/ (null,"padding-left",__ref._padding /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
RDebugUtils.currentLine=102301848;
 //BA.debugLineNum = 102301848;BA.debugLine="SetAttr(\"padding-right\",Padding.right)";
__ref._setattr /*b4j.example.vmcss*/ (null,"padding-right",__ref._padding /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
RDebugUtils.currentLine=102301850;
 //BA.debugLineNum = 102301850;BA.debugLine="SetAttr(\"outline\",Outline.all)";
__ref._setattr /*b4j.example.vmcss*/ (null,"outline",__ref._outline /*b4j.example.vmcss._cssoutline*/ .all /*String*/ );
RDebugUtils.currentLine=102301851;
 //BA.debugLineNum = 102301851;BA.debugLine="SetAttr(\"outline-style\",Outline.style)";
__ref._setattr /*b4j.example.vmcss*/ (null,"outline-style",__ref._outline /*b4j.example.vmcss._cssoutline*/ .Style /*String*/ );
RDebugUtils.currentLine=102301852;
 //BA.debugLineNum = 102301852;BA.debugLine="SetAttr(\"outline-offset\",Outline.offset)";
__ref._setattr /*b4j.example.vmcss*/ (null,"outline-offset",__ref._outline /*b4j.example.vmcss._cssoutline*/ .offset /*String*/ );
RDebugUtils.currentLine=102301853;
 //BA.debugLineNum = 102301853;BA.debugLine="SetAttr(\"outline-width\",Outline.width)";
__ref._setattr /*b4j.example.vmcss*/ (null,"outline-width",__ref._outline /*b4j.example.vmcss._cssoutline*/ .Width /*String*/ );
RDebugUtils.currentLine=102301854;
 //BA.debugLineNum = 102301854;BA.debugLine="SetAttr(\"outline-color\",Outline.color)";
__ref._setattr /*b4j.example.vmcss*/ (null,"outline-color",__ref._outline /*b4j.example.vmcss._cssoutline*/ .Color /*String*/ );
RDebugUtils.currentLine=102301857;
 //BA.debugLineNum = 102301857;BA.debugLine="sortit.Initialize";
__ref._sortit /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=102301858;
 //BA.debugLineNum = 102301858;BA.debugLine="For Each strProp As String In css.Keys";
{
final anywheresoftware.b4a.BA.IterableList group126 = __ref._css /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen126 = group126.getSize()
;int index126 = 0;
;
for (; index126 < groupLen126;index126++){
_strprop = BA.ObjectToString(group126.Get(index126));
RDebugUtils.currentLine=102301859;
 //BA.debugLineNum = 102301859;BA.debugLine="sortit.Add(strProp)";
__ref._sortit /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_strprop));
 }
};
RDebugUtils.currentLine=102301861;
 //BA.debugLineNum = 102301861;BA.debugLine="sortit.Sort(True)";
__ref._sortit /*anywheresoftware.b4a.objects.collections.List*/ .Sort(__c.True);
RDebugUtils.currentLine=102301862;
 //BA.debugLineNum = 102301862;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcss  _setattr(b4j.example.vmcss __ref,String _property,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcss";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcss) Debug.delegate(ba, "setattr", new Object[] {_property,_value}));}
RDebugUtils.currentLine=102236160;
 //BA.debugLineNum = 102236160;BA.debugLine="Sub SetAttr(property As String,value As String) As";
RDebugUtils.currentLine=102236161;
 //BA.debugLineNum = 102236161;BA.debugLine="value = value.Trim";
_value = _value.trim();
RDebugUtils.currentLine=102236162;
 //BA.debugLineNum = 102236162;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
RDebugUtils.currentLine=102236163;
 //BA.debugLineNum = 102236163;BA.debugLine="css.Put(property,value)";
__ref._css /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_property),(Object)(_value));
 };
RDebugUtils.currentLine=102236165;
 //BA.debugLineNum = 102236165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcss)(this);
RDebugUtils.currentLine=102236166;
 //BA.debugLineNum = 102236166;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmcss __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcss";
RDebugUtils.currentLine=102105088;
 //BA.debugLineNum = 102105088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=102105089;
 //BA.debugLineNum = 102105089;BA.debugLine="Type CssOverflow(all As String,x As String,y As S";
;
RDebugUtils.currentLine=102105090;
 //BA.debugLineNum = 102105090;BA.debugLine="Type StyleObj(letterspacing As String, Color As S";
;
RDebugUtils.currentLine=102105094;
 //BA.debugLineNum = 102105094;BA.debugLine="Type CssSize(size As String, maxsize As String,mi";
;
RDebugUtils.currentLine=102105095;
 //BA.debugLineNum = 102105095;BA.debugLine="Type CssBackground(Color As String,Image As Strin";
;
RDebugUtils.currentLine=102105096;
 //BA.debugLineNum = 102105096;BA.debugLine="Type CssPositions(all As String, top As String,bo";
;
RDebugUtils.currentLine=102105097;
 //BA.debugLineNum = 102105097;BA.debugLine="Type CssRadius(all As String, topleft As String,t";
;
RDebugUtils.currentLine=102105098;
 //BA.debugLineNum = 102105098;BA.debugLine="Type CssBorder(Style As CssPositions,size As Stri";
;
RDebugUtils.currentLine=102105099;
 //BA.debugLineNum = 102105099;BA.debugLine="Type CssOutline(all As String,offset As String,Co";
;
RDebugUtils.currentLine=102105100;
 //BA.debugLineNum = 102105100;BA.debugLine="Type CssFont(all As String,fontFamily As String,S";
;
RDebugUtils.currentLine=102105101;
 //BA.debugLineNum = 102105101;BA.debugLine="Type CssBorderImage(Image As String,source As Str";
;
RDebugUtils.currentLine=102105102;
 //BA.debugLineNum = 102105102;BA.debugLine="Type CssListStyle(typeOf As String,position As St";
;
RDebugUtils.currentLine=102105103;
 //BA.debugLineNum = 102105103;BA.debugLine="Type CssTransform(texttransform As String, mstran";
;
RDebugUtils.currentLine=102105104;
 //BA.debugLineNum = 102105104;BA.debugLine="Type CssTransition(webkittransition As String,Tra";
;
RDebugUtils.currentLine=102105105;
 //BA.debugLineNum = 102105105;BA.debugLine="Type CssAnimation(Animation As String,delay As St";
;
RDebugUtils.currentLine=102105106;
 //BA.debugLineNum = 102105106;BA.debugLine="Type CssFilter(Filter As String,webkitfilter As S";
;
RDebugUtils.currentLine=102105107;
 //BA.debugLineNum = 102105107;BA.debugLine="Type CssImage(objectfit As String)";
;
RDebugUtils.currentLine=102105108;
 //BA.debugLineNum = 102105108;BA.debugLine="Type CssText(align As String,decoration As String";
;
RDebugUtils.currentLine=102105109;
 //BA.debugLineNum = 102105109;BA.debugLine="Public Style As StyleObj";
_style = new b4j.example.vmcss._styleobj();
RDebugUtils.currentLine=102105110;
 //BA.debugLineNum = 102105110;BA.debugLine="Public Width As CssSize";
_width = new b4j.example.vmcss._csssize();
RDebugUtils.currentLine=102105111;
 //BA.debugLineNum = 102105111;BA.debugLine="Public Height As CssSize";
_height = new b4j.example.vmcss._csssize();
RDebugUtils.currentLine=102105112;
 //BA.debugLineNum = 102105112;BA.debugLine="Public BackGround As CssBackground";
_background = new b4j.example.vmcss._cssbackground();
RDebugUtils.currentLine=102105113;
 //BA.debugLineNum = 102105113;BA.debugLine="Public Border As CssBorder";
_border = new b4j.example.vmcss._cssborder();
RDebugUtils.currentLine=102105114;
 //BA.debugLineNum = 102105114;BA.debugLine="Public Margin As CssPositions";
_margin = new b4j.example.vmcss._csspositions();
RDebugUtils.currentLine=102105115;
 //BA.debugLineNum = 102105115;BA.debugLine="Public Padding As CssPositions";
_padding = new b4j.example.vmcss._csspositions();
RDebugUtils.currentLine=102105116;
 //BA.debugLineNum = 102105116;BA.debugLine="Public Outline As CssOutline";
_outline = new b4j.example.vmcss._cssoutline();
RDebugUtils.currentLine=102105117;
 //BA.debugLineNum = 102105117;BA.debugLine="Public Text As CssText";
_text = new b4j.example.vmcss._csstext();
RDebugUtils.currentLine=102105118;
 //BA.debugLineNum = 102105118;BA.debugLine="Public Font As CssFont";
_font = new b4j.example.vmcss._cssfont();
RDebugUtils.currentLine=102105119;
 //BA.debugLineNum = 102105119;BA.debugLine="Private css As Map";
_css = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=102105120;
 //BA.debugLineNum = 102105120;BA.debugLine="Public ListStyle As CssListStyle";
_liststyle = new b4j.example.vmcss._cssliststyle();
RDebugUtils.currentLine=102105121;
 //BA.debugLineNum = 102105121;BA.debugLine="Public Transform As CssTransform";
_transform = new b4j.example.vmcss._csstransform();
RDebugUtils.currentLine=102105122;
 //BA.debugLineNum = 102105122;BA.debugLine="Public Transition As CssTransition";
_transition = new b4j.example.vmcss._csstransition();
RDebugUtils.currentLine=102105123;
 //BA.debugLineNum = 102105123;BA.debugLine="Public Animation As CssAnimation";
_animation = new b4j.example.vmcss._cssanimation();
RDebugUtils.currentLine=102105124;
 //BA.debugLineNum = 102105124;BA.debugLine="Public Filter As CssFilter";
_filter = new b4j.example.vmcss._cssfilter();
RDebugUtils.currentLine=102105125;
 //BA.debugLineNum = 102105125;BA.debugLine="Public Image As CssImage";
_image = new b4j.example.vmcss._cssimage();
RDebugUtils.currentLine=102105126;
 //BA.debugLineNum = 102105126;BA.debugLine="Private sortit As List";
_sortit = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=102105127;
 //BA.debugLineNum = 102105127;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=102105128;
 //BA.debugLineNum = 102105128;BA.debugLine="End Sub";
return "";
}
public String  _tojson(b4j.example.vmcss __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcss";
if (Debug.shouldDelegate(ba, "tojson", true))
	 {return ((String) Debug.delegate(ba, "tojson", null));}
String _sjson = "";
RDebugUtils.currentLine=102432768;
 //BA.debugLineNum = 102432768;BA.debugLine="Sub ToJSON As String";
RDebugUtils.currentLine=102432769;
 //BA.debugLineNum = 102432769;BA.debugLine="Dim sjson As String = BANano.ToJson(css)";
_sjson = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(__ref._css /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=102432770;
 //BA.debugLineNum = 102432770;BA.debugLine="Return sjson";
if (true) return _sjson;
RDebugUtils.currentLine=102432771;
 //BA.debugLineNum = 102432771;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _tomap(b4j.example.vmcss __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcss";
if (Debug.shouldDelegate(ba, "tomap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "tomap", null));}
RDebugUtils.currentLine=102367232;
 //BA.debugLineNum = 102367232;BA.debugLine="Sub ToMap As Map";
RDebugUtils.currentLine=102367233;
 //BA.debugLineNum = 102367233;BA.debugLine="Return css";
if (true) return __ref._css /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=102367234;
 //BA.debugLineNum = 102367234;BA.debugLine="End Sub";
return null;
}
}