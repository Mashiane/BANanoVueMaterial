package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcss extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcss", this);
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
public String  _build() throws Exception{
String _strprop = "";
 //BA.debugLineNum = 80;BA.debugLine="Sub Build";
 //BA.debugLineNum = 81;BA.debugLine="SetAttr(\"color\",Style.Color)";
_setattr("color",_style.Color /*String*/ );
 //BA.debugLineNum = 82;BA.debugLine="SetAttr(\"text-align\",Text.align)";
_setattr("text-align",_text.align /*String*/ );
 //BA.debugLineNum = 83;BA.debugLine="SetAttr(\"text-decoration\",Text.decoration)";
_setattr("text-decoration",_text.decoration /*String*/ );
 //BA.debugLineNum = 84;BA.debugLine="SetAttr(\"text-indent\", Text.indent)";
_setattr("text-indent",_text.indent /*String*/ );
 //BA.debugLineNum = 85;BA.debugLine="SetAttr(\"letter-spacing\", Style.letterspacing)";
_setattr("letter-spacing",_style.letterspacing /*String*/ );
 //BA.debugLineNum = 86;BA.debugLine="SetAttr(\"line-height\", Style.lineheight)";
_setattr("line-height",_style.lineheight /*String*/ );
 //BA.debugLineNum = 87;BA.debugLine="SetAttr(\"direction\", Style.direction)";
_setattr("direction",_style.direction /*String*/ );
 //BA.debugLineNum = 88;BA.debugLine="SetAttr(\"word-spacing\", Style.wordspacing)";
_setattr("word-spacing",_style.wordspacing /*String*/ );
 //BA.debugLineNum = 89;BA.debugLine="SetAttr(\"text-shadow\", Text.Textshadow)";
_setattr("text-shadow",_text.Textshadow /*String*/ );
 //BA.debugLineNum = 90;BA.debugLine="SetAttr(\"vertical-align\", Style.verticalalign)";
_setattr("vertical-align",_style.verticalalign /*String*/ );
 //BA.debugLineNum = 91;BA.debugLine="SetAttr(\"display\",Style.display)";
_setattr("display",_style.display /*String*/ );
 //BA.debugLineNum = 92;BA.debugLine="SetAttr(\"visibility\",Style.visibility)";
_setattr("visibility",_style.visibility /*String*/ );
 //BA.debugLineNum = 93;BA.debugLine="SetAttr(\"clip\",Style.clip)";
_setattr("clip",_style.clip /*String*/ );
 //BA.debugLineNum = 94;BA.debugLine="SetAttr(\"float\",Style.floatto)";
_setattr("float",_style.floatto /*String*/ );
 //BA.debugLineNum = 95;BA.debugLine="SetAttr(\"clear\",Style.clear)";
_setattr("clear",_style.clear /*String*/ );
 //BA.debugLineNum = 96;BA.debugLine="SetAttr(\"opacity\",Style.opacity)";
_setattr("opacity",_style.opacity /*String*/ );
 //BA.debugLineNum = 97;BA.debugLine="SetAttr(\"background\",Style.BackGround)";
_setattr("background",_style.BackGround /*String*/ );
 //BA.debugLineNum = 98;BA.debugLine="SetAttr(\"box-sizing\",Style.boxsizing)";
_setattr("box-sizing",_style.boxsizing /*String*/ );
 //BA.debugLineNum = 99;BA.debugLine="SetAttr(\"resize\",Style.resize)";
_setattr("resize",_style.resize /*String*/ );
 //BA.debugLineNum = 100;BA.debugLine="SetAttr(\"box-shadow\", Style.boxshadow)";
_setattr("box-shadow",_style.boxshadow /*String*/ );
 //BA.debugLineNum = 101;BA.debugLine="SetAttr(\"white-space\", Style.whitespace)";
_setattr("white-space",_style.whitespace /*String*/ );
 //BA.debugLineNum = 102;BA.debugLine="SetAttr(\"text-overflow\", Text.textoverflow)";
_setattr("text-overflow",_text.textoverflow /*String*/ );
 //BA.debugLineNum = 105;BA.debugLine="SetAttr(\"object-fit\", Image.objectfit)";
_setattr("object-fit",_image.objectfit /*String*/ );
 //BA.debugLineNum = 109;BA.debugLine="SetAttr(\"filter\",Filter.filter)";
_setattr("filter",_filter.Filter /*String*/ );
 //BA.debugLineNum = 110;BA.debugLine="SetAttr(\"-webkit-filter\", Filter.webkitfilter)";
_setattr("-webkit-filter",_filter.webkitfilter /*String*/ );
 //BA.debugLineNum = 113;BA.debugLine="SetAttr(\"animation\", Animation.animation)";
_setattr("animation",_animation.Animation /*String*/ );
 //BA.debugLineNum = 114;BA.debugLine="SetAttr(\"animation-delay\", Animation.delay)";
_setattr("animation-delay",_animation.delay /*String*/ );
 //BA.debugLineNum = 115;BA.debugLine="SetAttr(\"animation-direction\", Animation.directio";
_setattr("animation-direction",_animation.direction /*String*/ );
 //BA.debugLineNum = 116;BA.debugLine="SetAttr(\"animation-duration\", Animation.duration)";
_setattr("animation-duration",_animation.duration /*String*/ );
 //BA.debugLineNum = 117;BA.debugLine="SetAttr(\"animation-fill-mode\", Animation.fillmode";
_setattr("animation-fill-mode",_animation.fillmode /*String*/ );
 //BA.debugLineNum = 118;BA.debugLine="SetAttr(\"animation-iteration-count\", Animation.it";
_setattr("animation-iteration-count",_animation.iterationcount /*String*/ );
 //BA.debugLineNum = 119;BA.debugLine="SetAttr(\"animation-name\", Animation.name)";
_setattr("animation-name",_animation.name /*String*/ );
 //BA.debugLineNum = 120;BA.debugLine="SetAttr(\"animation-play-state\", Animation.playsta";
_setattr("animation-play-state",_animation.playstate /*String*/ );
 //BA.debugLineNum = 121;BA.debugLine="SetAttr(\"animation-timing-function\", Animation.ti";
_setattr("animation-timing-function",_animation.timingfunction /*String*/ );
 //BA.debugLineNum = 125;BA.debugLine="SetAttr(\"-webkit-transition\",Transition.webkittra";
_setattr("-webkit-transition",_transition.webkittransition /*String*/ );
 //BA.debugLineNum = 126;BA.debugLine="SetAttr(\"transition\",Transition.transition)";
_setattr("transition",_transition.Transition /*String*/ );
 //BA.debugLineNum = 127;BA.debugLine="SetAttr(\"transition-delay\",Transition.delay)";
_setattr("transition-delay",_transition.delay /*String*/ );
 //BA.debugLineNum = 128;BA.debugLine="SetAttr(\"transition-duration\",Transition.duration";
_setattr("transition-duration",_transition.duration /*String*/ );
 //BA.debugLineNum = 129;BA.debugLine="SetAttr(\"transition-property\",Transition.property";
_setattr("transition-property",_transition.property /*String*/ );
 //BA.debugLineNum = 130;BA.debugLine="SetAttr(\"transition-timing-function\",Transition.t";
_setattr("transition-timing-function",_transition.timingfunction /*String*/ );
 //BA.debugLineNum = 133;BA.debugLine="SetAttr(\"text-transform\", Transform.texttransform";
_setattr("text-transform",_transform.texttransform /*String*/ );
 //BA.debugLineNum = 134;BA.debugLine="SetAttr(\"-ms-transform\", Transform.mstransform)";
_setattr("-ms-transform",_transform.mstransform /*String*/ );
 //BA.debugLineNum = 135;BA.debugLine="SetAttr(\"transform-origin\", Transform.origin)";
_setattr("transform-origin",_transform.origin /*String*/ );
 //BA.debugLineNum = 136;BA.debugLine="SetAttr(\"transform-style\", Transform.style)";
_setattr("transform-style",_transform.Style /*String*/ );
 //BA.debugLineNum = 137;BA.debugLine="SetAttr(\"perspective\", Transform.perspective)";
_setattr("perspective",_transform.perspective /*String*/ );
 //BA.debugLineNum = 138;BA.debugLine="SetAttr(\"perspective-origin\", Transform.perspecti";
_setattr("perspective-origin",_transform.perspectiveorigin /*String*/ );
 //BA.debugLineNum = 139;BA.debugLine="SetAttr(\"backface-visibility\", Transform.backface";
_setattr("backface-visibility",_transform.backfacevisibility /*String*/ );
 //BA.debugLineNum = 140;BA.debugLine="SetAttr(\"-webkit-transform\", Transform.webkittran";
_setattr("-webkit-transform",_transform.webkittransform /*String*/ );
 //BA.debugLineNum = 143;BA.debugLine="SetAttr(\"overflow\",Style.overflow.all)";
_setattr("overflow",_style.overflow /*b4j.example.vmcss._cssoverflow*/ .all /*String*/ );
 //BA.debugLineNum = 144;BA.debugLine="SetAttr(\"overflow-y\",Style.overflow.y)";
_setattr("overflow-y",_style.overflow /*b4j.example.vmcss._cssoverflow*/ .y /*String*/ );
 //BA.debugLineNum = 145;BA.debugLine="SetAttr(\"overflow-x\",Style.overflow.x)";
_setattr("overflow-x",_style.overflow /*b4j.example.vmcss._cssoverflow*/ .x /*String*/ );
 //BA.debugLineNum = 148;BA.debugLine="SetAttr(\"z-index\",Style.zindex)";
_setattr("z-index",_style.zindex /*String*/ );
 //BA.debugLineNum = 149;BA.debugLine="SetAttr(\"position\",Style.position.all)";
_setattr("position",_style.position /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
 //BA.debugLineNum = 150;BA.debugLine="SetAttr(\"left\",Style.position.left)";
_setattr("left",_style.position /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
 //BA.debugLineNum = 151;BA.debugLine="SetAttr(\"top\",Style.position.top)";
_setattr("top",_style.position /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
 //BA.debugLineNum = 152;BA.debugLine="SetAttr(\"bottom\",Style.position.bottom)";
_setattr("bottom",_style.position /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
 //BA.debugLineNum = 153;BA.debugLine="SetAttr(\"right\",Style.position.right)";
_setattr("right",_style.position /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
 //BA.debugLineNum = 156;BA.debugLine="SetAttr(\"font\", Font.all)";
_setattr("font",_font.all /*String*/ );
 //BA.debugLineNum = 157;BA.debugLine="SetAttr(\"font-family\", Font.fontFamily)";
_setattr("font-family",_font.fontFamily /*String*/ );
 //BA.debugLineNum = 158;BA.debugLine="SetAttr(\"font-style\", Font.style)";
_setattr("font-style",_font.Style /*String*/ );
 //BA.debugLineNum = 159;BA.debugLine="SetAttr(\"font-size\", Font.size)";
_setattr("font-size",_font.size /*String*/ );
 //BA.debugLineNum = 160;BA.debugLine="SetAttr(\"font-weight\", Font.weight)";
_setattr("font-weight",_font.weight /*String*/ );
 //BA.debugLineNum = 161;BA.debugLine="SetAttr(\"font-variant\", Font.variant)";
_setattr("font-variant",_font.variant /*String*/ );
 //BA.debugLineNum = 162;BA.debugLine="SetAttr(\"src\", Font.src)";
_setattr("src",_font.src /*String*/ );
 //BA.debugLineNum = 163;BA.debugLine="SetAttr(\"font-stretch\", Font.stretch)";
_setattr("font-stretch",_font.stretch /*String*/ );
 //BA.debugLineNum = 165;BA.debugLine="SetAttr(\"list-style-type\", ListStyle.typeof)";
_setattr("list-style-type",_liststyle.typeOf /*String*/ );
 //BA.debugLineNum = 166;BA.debugLine="SetAttr(\"list-style-position\", ListStyle.position";
_setattr("list-style-position",_liststyle.position /*String*/ );
 //BA.debugLineNum = 167;BA.debugLine="SetAttr(\"list-style-image\", $\"url('${ListStyle.im";
_setattr("list-style-image",("url('"+__c.SmartStringFormatter("",(Object)(_liststyle.Image /*String*/ ))+"')"));
 //BA.debugLineNum = 169;BA.debugLine="SetAttr(\"width\",Width.size)";
_setattr("width",_width.size /*String*/ );
 //BA.debugLineNum = 170;BA.debugLine="SetAttr(\"max-width\",Width.maxsize)";
_setattr("max-width",_width.maxsize /*String*/ );
 //BA.debugLineNum = 171;BA.debugLine="SetAttr(\"min-width\",Width.minsize)";
_setattr("min-width",_width.minsize /*String*/ );
 //BA.debugLineNum = 173;BA.debugLine="SetAttr(\"height\",Height.size)";
_setattr("height",_height.size /*String*/ );
 //BA.debugLineNum = 174;BA.debugLine="SetAttr(\"max-height\",Height.maxsize)";
_setattr("max-height",_height.maxsize /*String*/ );
 //BA.debugLineNum = 175;BA.debugLine="SetAttr(\"min-height\",Height.minsize)";
_setattr("min-height",_height.minsize /*String*/ );
 //BA.debugLineNum = 177;BA.debugLine="SetAttr(\"background-color\",BackGround.color)";
_setattr("background-color",_background.Color /*String*/ );
 //BA.debugLineNum = 178;BA.debugLine="SetAttr(\"background-image\", $\"url('${BackGround.i";
_setattr("background-image",("url('"+__c.SmartStringFormatter("",(Object)(_background.Image /*String*/ ))+"')"));
 //BA.debugLineNum = 179;BA.debugLine="SetAttr(\"background-repeat\", BackGround.repeat)";
_setattr("background-repeat",_background.repeat /*String*/ );
 //BA.debugLineNum = 180;BA.debugLine="SetAttr(\"background-position\", BackGround.positio";
_setattr("background-position",_background.position /*String*/ );
 //BA.debugLineNum = 181;BA.debugLine="SetAttr(\"background-attachment\", BackGround.attac";
_setattr("background-attachment",_background.attachment /*String*/ );
 //BA.debugLineNum = 182;BA.debugLine="SetAttr(\"background-clip\", BackGround.clip)";
_setattr("background-clip",_background.clip /*String*/ );
 //BA.debugLineNum = 183;BA.debugLine="SetAttr(\"background-size\", BackGround.size)";
_setattr("background-size",_background.size /*String*/ );
 //BA.debugLineNum = 184;BA.debugLine="SetAttr(\"background-origin\", BackGround.origin)";
_setattr("background-origin",_background.Origin /*String*/ );
 //BA.debugLineNum = 187;BA.debugLine="SetAttr(\"border-collapse\",Border.collapse)";
_setattr("border-collapse",_border.collapse /*String*/ );
 //BA.debugLineNum = 188;BA.debugLine="SetAttr(\"border-style\", Border.style.all)";
_setattr("border-style",_border.Style /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
 //BA.debugLineNum = 189;BA.debugLine="SetAttr(\"border-top-style\", Border.style.top)";
_setattr("border-top-style",_border.Style /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
 //BA.debugLineNum = 190;BA.debugLine="SetAttr(\"border-bottom-style\", Border.style.botto";
_setattr("border-bottom-style",_border.Style /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
 //BA.debugLineNum = 191;BA.debugLine="SetAttr(\"border-right-style\", Border.style.right)";
_setattr("border-right-style",_border.Style /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
 //BA.debugLineNum = 192;BA.debugLine="SetAttr(\"border-left-style\", Border.style.left)";
_setattr("border-left-style",_border.Style /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
 //BA.debugLineNum = 194;BA.debugLine="SetAttr(\"border-color\", Border.color.all)";
_setattr("border-color",_border.Color /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
 //BA.debugLineNum = 195;BA.debugLine="SetAttr(\"border-left-color\", Border.color.left)";
_setattr("border-left-color",_border.Color /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
 //BA.debugLineNum = 196;BA.debugLine="SetAttr(\"border-right-color\", Border.color.right)";
_setattr("border-right-color",_border.Color /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
 //BA.debugLineNum = 197;BA.debugLine="SetAttr(\"border-top-color\", Border.color.top)";
_setattr("border-top-color",_border.Color /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
 //BA.debugLineNum = 198;BA.debugLine="SetAttr(\"border-bottom-color\", Border.color.botto";
_setattr("border-bottom-color",_border.Color /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
 //BA.debugLineNum = 200;BA.debugLine="SetAttr(\"border-radius\", Border.radius.all)";
_setattr("border-radius",_border.radius /*b4j.example.vmcss._cssradius*/ .all /*String*/ );
 //BA.debugLineNum = 201;BA.debugLine="SetAttr(\"border-top-left-radius\", Border.radius.t";
_setattr("border-top-left-radius",_border.radius /*b4j.example.vmcss._cssradius*/ .topleft /*String*/ );
 //BA.debugLineNum = 202;BA.debugLine="SetAttr(\"border-top-right-radius\", Border.radius.";
_setattr("border-top-right-radius",_border.radius /*b4j.example.vmcss._cssradius*/ .topright /*String*/ );
 //BA.debugLineNum = 203;BA.debugLine="SetAttr(\"border-bottom-left-radius\", Border.radiu";
_setattr("border-bottom-left-radius",_border.radius /*b4j.example.vmcss._cssradius*/ .bottomleft /*String*/ );
 //BA.debugLineNum = 204;BA.debugLine="SetAttr(\"border-bottom-right-radius\", Border.radi";
_setattr("border-bottom-right-radius",_border.radius /*b4j.example.vmcss._cssradius*/ .bottomright /*String*/ );
 //BA.debugLineNum = 207;BA.debugLine="SetAttr(\"border-width\", Border.width.all)";
_setattr("border-width",_border.Width /*b4j.example.vmcss._csspositions*/ .all /*String*/ );
 //BA.debugLineNum = 208;BA.debugLine="SetAttr(\"border-left-width\",Border.width.left)";
_setattr("border-left-width",_border.Width /*b4j.example.vmcss._csspositions*/ .left /*String*/ );
 //BA.debugLineNum = 209;BA.debugLine="SetAttr(\"border-right-width\",Border.width.right)";
_setattr("border-right-width",_border.Width /*b4j.example.vmcss._csspositions*/ .right /*String*/ );
 //BA.debugLineNum = 210;BA.debugLine="SetAttr(\"border-top-width\",Border.width.top)";
_setattr("border-top-width",_border.Width /*b4j.example.vmcss._csspositions*/ .top /*String*/ );
 //BA.debugLineNum = 211;BA.debugLine="SetAttr(\"border-bottom-width\",Border.width.bottom";
_setattr("border-bottom-width",_border.Width /*b4j.example.vmcss._csspositions*/ .bottom /*String*/ );
 //BA.debugLineNum = 214;BA.debugLine="SetAttr(\"border-image\", Border.image.image)";
_setattr("border-image",_border.Image /*b4j.example.vmcss._cssborderimage*/ .Image /*String*/ );
 //BA.debugLineNum = 215;BA.debugLine="SetAttr(\"border-image-source\",Border.image.source";
_setattr("border-image-source",_border.Image /*b4j.example.vmcss._cssborderimage*/ .source /*String*/ );
 //BA.debugLineNum = 216;BA.debugLine="SetAttr(\"border-image-slice\",Border.image.slice)";
_setattr("border-image-slice",_border.Image /*b4j.example.vmcss._cssborderimage*/ .slice /*String*/ );
 //BA.debugLineNum = 217;BA.debugLine="SetAttr(\"border-image-width\",Border.image.width)";
_setattr("border-image-width",_border.Image /*b4j.example.vmcss._cssborderimage*/ .Width /*String*/ );
 //BA.debugLineNum = 218;BA.debugLine="SetAttr(\"border-image-outset\",Border.image.outset";
_setattr("border-image-outset",_border.Image /*b4j.example.vmcss._cssborderimage*/ .outset /*String*/ );
 //BA.debugLineNum = 219;BA.debugLine="SetAttr(\"border-image-repeat\",Border.image.repeat";
_setattr("border-image-repeat",_border.Image /*b4j.example.vmcss._cssborderimage*/ .repeat /*String*/ );
 //BA.debugLineNum = 222;BA.debugLine="SetAttr(\"margin\",Margin.all)";
_setattr("margin",_margin.all /*String*/ );
 //BA.debugLineNum = 223;BA.debugLine="SetAttr(\"margin-top\",Margin.top)";
_setattr("margin-top",_margin.top /*String*/ );
 //BA.debugLineNum = 224;BA.debugLine="SetAttr(\"margin-bottom\",Margin.bottom)";
_setattr("margin-bottom",_margin.bottom /*String*/ );
 //BA.debugLineNum = 225;BA.debugLine="SetAttr(\"margin-left\",Margin.left)";
_setattr("margin-left",_margin.left /*String*/ );
 //BA.debugLineNum = 226;BA.debugLine="SetAttr(\"margin-right\",Margin.right)";
_setattr("margin-right",_margin.right /*String*/ );
 //BA.debugLineNum = 228;BA.debugLine="SetAttr(\"padding\",Padding.all)";
_setattr("padding",_padding.all /*String*/ );
 //BA.debugLineNum = 229;BA.debugLine="SetAttr(\"padding-top\",Padding.top)";
_setattr("padding-top",_padding.top /*String*/ );
 //BA.debugLineNum = 230;BA.debugLine="SetAttr(\"padding-bottom\",Padding.bottom)";
_setattr("padding-bottom",_padding.bottom /*String*/ );
 //BA.debugLineNum = 231;BA.debugLine="SetAttr(\"padding-left\",Padding.left)";
_setattr("padding-left",_padding.left /*String*/ );
 //BA.debugLineNum = 232;BA.debugLine="SetAttr(\"padding-right\",Padding.right)";
_setattr("padding-right",_padding.right /*String*/ );
 //BA.debugLineNum = 234;BA.debugLine="SetAttr(\"outline\",Outline.all)";
_setattr("outline",_outline.all /*String*/ );
 //BA.debugLineNum = 235;BA.debugLine="SetAttr(\"outline-style\",Outline.style)";
_setattr("outline-style",_outline.Style /*String*/ );
 //BA.debugLineNum = 236;BA.debugLine="SetAttr(\"outline-offset\",Outline.offset)";
_setattr("outline-offset",_outline.offset /*String*/ );
 //BA.debugLineNum = 237;BA.debugLine="SetAttr(\"outline-width\",Outline.width)";
_setattr("outline-width",_outline.Width /*String*/ );
 //BA.debugLineNum = 238;BA.debugLine="SetAttr(\"outline-color\",Outline.color)";
_setattr("outline-color",_outline.Color /*String*/ );
 //BA.debugLineNum = 241;BA.debugLine="sortit.Initialize";
_sortit.Initialize();
 //BA.debugLineNum = 242;BA.debugLine="For Each strProp As String In css.Keys";
{
final anywheresoftware.b4a.BA.IterableList group126 = _css.Keys();
final int groupLen126 = group126.getSize()
;int index126 = 0;
;
for (; index126 < groupLen126;index126++){
_strprop = BA.ObjectToString(group126.Get(index126));
 //BA.debugLineNum = 243;BA.debugLine="sortit.Add(strProp)";
_sortit.Add((Object)(_strprop));
 }
};
 //BA.debugLineNum = 245;BA.debugLine="sortit.Sort(True)";
_sortit.Sort(__c.True);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type CssOverflow(all As String,x As String,y As S";
;
 //BA.debugLineNum = 4;BA.debugLine="Type StyleObj(letterspacing As String, Color As S";
;
 //BA.debugLineNum = 8;BA.debugLine="Type CssSize(size As String, maxsize As String,mi";
;
 //BA.debugLineNum = 9;BA.debugLine="Type CssBackground(Color As String,Image As Strin";
;
 //BA.debugLineNum = 10;BA.debugLine="Type CssPositions(all As String, top As String,bo";
;
 //BA.debugLineNum = 11;BA.debugLine="Type CssRadius(all As String, topleft As String,t";
;
 //BA.debugLineNum = 12;BA.debugLine="Type CssBorder(Style As CssPositions,size As Stri";
;
 //BA.debugLineNum = 13;BA.debugLine="Type CssOutline(all As String,offset As String,Co";
;
 //BA.debugLineNum = 14;BA.debugLine="Type CssFont(all As String,fontFamily As String,S";
;
 //BA.debugLineNum = 15;BA.debugLine="Type CssBorderImage(Image As String,source As Str";
;
 //BA.debugLineNum = 16;BA.debugLine="Type CssListStyle(typeOf As String,position As St";
;
 //BA.debugLineNum = 17;BA.debugLine="Type CssTransform(texttransform As String, mstran";
;
 //BA.debugLineNum = 18;BA.debugLine="Type CssTransition(webkittransition As String,Tra";
;
 //BA.debugLineNum = 19;BA.debugLine="Type CssAnimation(Animation As String,delay As St";
;
 //BA.debugLineNum = 20;BA.debugLine="Type CssFilter(Filter As String,webkitfilter As S";
;
 //BA.debugLineNum = 21;BA.debugLine="Type CssImage(objectfit As String)";
;
 //BA.debugLineNum = 22;BA.debugLine="Type CssText(align As String,decoration As String";
;
 //BA.debugLineNum = 23;BA.debugLine="Public Style As StyleObj";
_style = new b4j.example.vmcss._styleobj();
 //BA.debugLineNum = 24;BA.debugLine="Public Width As CssSize";
_width = new b4j.example.vmcss._csssize();
 //BA.debugLineNum = 25;BA.debugLine="Public Height As CssSize";
_height = new b4j.example.vmcss._csssize();
 //BA.debugLineNum = 26;BA.debugLine="Public BackGround As CssBackground";
_background = new b4j.example.vmcss._cssbackground();
 //BA.debugLineNum = 27;BA.debugLine="Public Border As CssBorder";
_border = new b4j.example.vmcss._cssborder();
 //BA.debugLineNum = 28;BA.debugLine="Public Margin As CssPositions";
_margin = new b4j.example.vmcss._csspositions();
 //BA.debugLineNum = 29;BA.debugLine="Public Padding As CssPositions";
_padding = new b4j.example.vmcss._csspositions();
 //BA.debugLineNum = 30;BA.debugLine="Public Outline As CssOutline";
_outline = new b4j.example.vmcss._cssoutline();
 //BA.debugLineNum = 31;BA.debugLine="Public Text As CssText";
_text = new b4j.example.vmcss._csstext();
 //BA.debugLineNum = 32;BA.debugLine="Public Font As CssFont";
_font = new b4j.example.vmcss._cssfont();
 //BA.debugLineNum = 33;BA.debugLine="Private css As Map";
_css = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 34;BA.debugLine="Public ListStyle As CssListStyle";
_liststyle = new b4j.example.vmcss._cssliststyle();
 //BA.debugLineNum = 35;BA.debugLine="Public Transform As CssTransform";
_transform = new b4j.example.vmcss._csstransform();
 //BA.debugLineNum = 36;BA.debugLine="Public Transition As CssTransition";
_transition = new b4j.example.vmcss._csstransition();
 //BA.debugLineNum = 37;BA.debugLine="Public Animation As CssAnimation";
_animation = new b4j.example.vmcss._cssanimation();
 //BA.debugLineNum = 38;BA.debugLine="Public Filter As CssFilter";
_filter = new b4j.example.vmcss._cssfilter();
 //BA.debugLineNum = 39;BA.debugLine="Public Image As CssImage";
_image = new b4j.example.vmcss._cssimage();
 //BA.debugLineNum = 40;BA.debugLine="Private sortit As List";
_sortit = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 41;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 46;BA.debugLine="css.Initialize";
_css.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="BackGround.Initialize";
_background.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="Border.Initialize";
_border.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="Border.Color.Initialize";
_border.Color /*b4j.example.vmcss._csspositions*/ .Initialize();
 //BA.debugLineNum = 50;BA.debugLine="Border.width.Initialize";
_border.Width /*b4j.example.vmcss._csspositions*/ .Initialize();
 //BA.debugLineNum = 51;BA.debugLine="Border.style.Initialize";
_border.Style /*b4j.example.vmcss._csspositions*/ .Initialize();
 //BA.debugLineNum = 52;BA.debugLine="Border.radius.Initialize";
_border.radius /*b4j.example.vmcss._cssradius*/ .Initialize();
 //BA.debugLineNum = 53;BA.debugLine="Border.image.Initialize";
_border.Image /*b4j.example.vmcss._cssborderimage*/ .Initialize();
 //BA.debugLineNum = 54;BA.debugLine="Margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="Padding.Initialize";
_padding.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="Height.Initialize";
_height.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="Width.Initialize";
_width.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="Outline.Initialize";
_outline.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="Style.Initialize";
_style.Initialize();
 //BA.debugLineNum = 60;BA.debugLine="Text.Initialize";
_text.Initialize();
 //BA.debugLineNum = 61;BA.debugLine="Style.position.Initialize";
_style.position /*b4j.example.vmcss._csspositions*/ .Initialize();
 //BA.debugLineNum = 62;BA.debugLine="Style.overflow.Initialize";
_style.overflow /*b4j.example.vmcss._cssoverflow*/ .Initialize();
 //BA.debugLineNum = 63;BA.debugLine="Font.Initialize";
_font.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="ListStyle.Initialize";
_liststyle.Initialize();
 //BA.debugLineNum = 65;BA.debugLine="Transform.Initialize";
_transform.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="Transition.Initialize";
_transition.Initialize();
 //BA.debugLineNum = 67;BA.debugLine="Animation.Initialize";
_animation.Initialize();
 //BA.debugLineNum = 68;BA.debugLine="Filter.Initialize";
_filter.Initialize();
 //BA.debugLineNum = 69;BA.debugLine="Image.Initialize";
_image.Initialize();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcss  _setattr(String _property,String _value) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetAttr(property As String,value As String) As";
 //BA.debugLineNum = 73;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 74;BA.debugLine="If value.Length > 0 Then";
if (_value.length()>0) { 
 //BA.debugLineNum = 75;BA.debugLine="css.Put(property,value)";
_css.Put((Object)(_property),(Object)(_value));
 };
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcss)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public String  _tojson() throws Exception{
String _sjson = "";
 //BA.debugLineNum = 254;BA.debugLine="Sub ToJSON As String";
 //BA.debugLineNum = 255;BA.debugLine="Dim sjson As String = BANano.ToJson(css)";
_sjson = BA.ObjectToString(_banano.ToJson((Object)(_css.getObject())));
 //BA.debugLineNum = 256;BA.debugLine="Return sjson";
if (true) return _sjson;
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _tomap() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub ToMap As Map";
 //BA.debugLineNum = 250;BA.debugLine="Return css";
if (true) return _css;
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
