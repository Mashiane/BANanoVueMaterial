B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Type CssOverflow(all As String,x As String,y As String)
	Type StyleObj(letterspacing As String, Color As String, lineheight As String, _
	direction As String,wordspacing As String,verticalalign As String,display As String,visibility As String, _
	position As CssPositions,zindex As String,clip As String, overflow As CssOverflow, floatto As String, clear As String, _
	opacity As String, BackGround As String, resize As String,boxsizing As String,boxshadow As String,whitespace As String)
	Type CssSize(size As String, maxsize As String,minsize As String)
	Type CssBackground(Color As String,Image As String,repeat As String,attachment As String,position As String,clip As String, size As String,Origin As String)
	Type CssPositions(all As String, top As String,bottom As String,left As String,right As String)
	Type CssRadius(all As String, topleft As String,topright As String,bottomleft As String,bottomright As String)
	Type CssBorder(Style As CssPositions,size As String,Width As CssPositions,Color As CssPositions, radius As CssRadius,collapse As String, Image As CssBorderImage)
	Type CssOutline(all As String,offset As String,Color As String,Style As String,Width As String)
	Type CssFont(all As String,fontFamily As String,Style As String,size As String,weight As String,variant As String,src As String, stretch As String)
	Type CssBorderImage(Image As String,source As String,slice As String,Width As String,outset As String,repeat As String)
	Type CssListStyle(typeOf As String,position As String,Image As String)
	Type CssTransform(texttransform As String, mstransform As String,origin As String,Style As String,perspective As String,perspectiveorigin As String,backfacevisibility As String,webkittransform As String)
	Type CssTransition(webkittransition As String,Transition As String,delay As String,duration As String,property As String,timingfunction As String)
	Type CssAnimation(Animation As String,delay As String,duration As String,direction As String,fillmode As String,iterationcount As String,name As String,playstate As String,timingfunction As String)
	Type CssFilter(Filter As String,webkitfilter As String)
	Type CssImage(objectfit As String)
	Type CssText(align As String,decoration As String,indent As String,Textshadow As String,textoverflow As String)
	Public Style As StyleObj
	Public Width As CssSize
	Public Height As CssSize
	Public BackGround As CssBackground
	Public Border As CssBorder
	Public Margin As CssPositions
	Public Padding As CssPositions
	Public Outline As CssOutline
	Public Text As CssText
	Public Font As CssFont
	Private css As Map
	Public ListStyle As CssListStyle
	Public Transform As CssTransform
	Public Transition As CssTransition
	Public Animation As CssAnimation
	Public Filter As CssFilter
	Public Image As CssImage
	Private sortit As List
	Private BANano As BANano   'ignore
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	css.Initialize
	BackGround.Initialize
	Border.Initialize
	Border.Color.Initialize
	Border.width.Initialize
	Border.style.Initialize
	Border.radius.Initialize
	Border.image.Initialize
	Margin.Initialize
	Padding.Initialize
	Height.Initialize
	Width.Initialize
	Outline.Initialize
	Style.Initialize 
	Text.Initialize
	Style.position.Initialize
	Style.overflow.Initialize
	Font.Initialize
	ListStyle.Initialize
	Transform.Initialize
	Transition.Initialize
	Animation.Initialize
	Filter.Initialize
	Image.Initialize
End Sub

Sub SetAttr(property As String,value As String) As VMCSS
	value = value.Trim
	If value.Length > 0 Then
		css.Put(property,value)
	End If
	Return Me
End Sub

Sub Build
	SetAttr("color",Style.Color)
	SetAttr("text-align",Text.align)
	SetAttr("text-decoration",Text.decoration)
	SetAttr("text-indent", Text.indent)
	SetAttr("letter-spacing", Style.letterspacing)
	SetAttr("line-height", Style.lineheight)
	SetAttr("direction", Style.direction)
	SetAttr("word-spacing", Style.wordspacing)
	SetAttr("text-shadow", Text.Textshadow)
	SetAttr("vertical-align", Style.verticalalign)
	SetAttr("display",Style.display)
	SetAttr("visibility",Style.visibility)
	SetAttr("clip",Style.clip)
	SetAttr("float",Style.floatto)
	SetAttr("clear",Style.clear)
	SetAttr("opacity",Style.opacity)
	SetAttr("background",Style.BackGround)
	SetAttr("box-sizing",Style.boxsizing)
	SetAttr("resize",Style.resize)
	SetAttr("box-shadow", Style.boxshadow)
	SetAttr("white-space", Style.whitespace)
	SetAttr("text-overflow", Text.textoverflow)
	
	'image
	SetAttr("object-fit", Image.objectfit)
	
	
	'filter
	SetAttr("filter",Filter.filter)
	SetAttr("-webkit-filter", Filter.webkitfilter)
	
	'animation
	SetAttr("animation", Animation.animation)
	SetAttr("animation-delay", Animation.delay)
	SetAttr("animation-direction", Animation.direction)
	SetAttr("animation-duration", Animation.duration)
	SetAttr("animation-fill-mode", Animation.fillmode)
	SetAttr("animation-iteration-count", Animation.iterationcount)
	SetAttr("animation-name", Animation.name)
	SetAttr("animation-play-state", Animation.playstate)
	SetAttr("animation-timing-function", Animation.timingfunction)
	
	
	'transition
	SetAttr("-webkit-transition",Transition.webkittransition)
	SetAttr("transition",Transition.transition)
	SetAttr("transition-delay",Transition.delay)
	SetAttr("transition-duration",Transition.duration)
	SetAttr("transition-property",Transition.property)
	SetAttr("transition-timing-function",Transition.timingfunction)
	
	'transform
	SetAttr("text-transform", Transform.texttransform)
	SetAttr("-ms-transform", Transform.mstransform)
	SetAttr("transform-origin", Transform.origin)
	SetAttr("transform-style", Transform.style)
	SetAttr("perspective", Transform.perspective)
	SetAttr("perspective-origin", Transform.perspectiveorigin)
	SetAttr("backface-visibility", Transform.backfacevisibility)
	SetAttr("-webkit-transform", Transform.webkittransform)
	
	'set overflow
	SetAttr("overflow",Style.overflow.all)
	SetAttr("overflow-y",Style.overflow.y)
	SetAttr("overflow-x",Style.overflow.x)
	
	'set position
	SetAttr("z-index",Style.zindex)
	SetAttr("position",Style.position.all)
	SetAttr("left",Style.position.left)
	SetAttr("top",Style.position.top)
	SetAttr("bottom",Style.position.bottom)
	SetAttr("right",Style.position.right)
	
	'set font
	SetAttr("font", Font.all)
	SetAttr("font-family", Font.fontFamily)
	SetAttr("font-style", Font.style)
	SetAttr("font-size", Font.size)
	SetAttr("font-weight", Font.weight)
	SetAttr("font-variant", Font.variant)
	SetAttr("src", Font.src)
	SetAttr("font-stretch", Font.stretch)
	'set list type
	SetAttr("list-style-type", ListStyle.typeof)
	SetAttr("list-style-position", ListStyle.position)
	SetAttr("list-style-image", $"url('${ListStyle.image}')"$)
	'set width
	SetAttr("width",Width.size)
	SetAttr("max-width",Width.maxsize)
	SetAttr("min-width",Width.minsize)
	'set height
	SetAttr("height",Height.size)
	SetAttr("max-height",Height.maxsize)
	SetAttr("min-height",Height.minsize)
	'set background
	SetAttr("background-color",BackGround.color)
	SetAttr("background-image", $"url('${BackGround.image}')"$)
	SetAttr("background-repeat", BackGround.repeat)
	SetAttr("background-position", BackGround.position)
	SetAttr("background-attachment", BackGround.attachment)
	SetAttr("background-clip", BackGround.clip)
	SetAttr("background-size", BackGround.size)
	SetAttr("background-origin", BackGround.origin)
	
	'border
	SetAttr("border-collapse",Border.collapse)
	SetAttr("border-style", Border.style.all)
	SetAttr("border-top-style", Border.style.top)
	SetAttr("border-bottom-style", Border.style.bottom)
	SetAttr("border-right-style", Border.style.right)
	SetAttr("border-left-style", Border.style.left)
	'set border color
	SetAttr("border-color", Border.color.all)
	SetAttr("border-left-color", Border.color.left)
	SetAttr("border-right-color", Border.color.right)
	SetAttr("border-top-color", Border.color.top)
	SetAttr("border-bottom-color", Border.color.bottom)
	
	SetAttr("border-radius", Border.radius.all)
	SetAttr("border-top-left-radius", Border.radius.topleft)
	SetAttr("border-top-right-radius", Border.radius.topright)
	SetAttr("border-bottom-left-radius", Border.radius.bottomleft)
	SetAttr("border-bottom-right-radius", Border.radius.bottomright)
	
	'set border width
	SetAttr("border-width", Border.width.all)
	SetAttr("border-left-width",Border.width.left)
	SetAttr("border-right-width",Border.width.right)
	SetAttr("border-top-width",Border.width.top)
	SetAttr("border-bottom-width",Border.width.bottom)
	
	'border image
	SetAttr("border-image", Border.image.image)
	SetAttr("border-image-source",Border.image.source)
	SetAttr("border-image-slice",Border.image.slice)
	SetAttr("border-image-width",Border.image.width)
	SetAttr("border-image-outset",Border.image.outset)
	SetAttr("border-image-repeat",Border.image.repeat)
		
	'set margins
	SetAttr("margin",Margin.all)
	SetAttr("margin-top",Margin.top)
	SetAttr("margin-bottom",Margin.bottom)
	SetAttr("margin-left",Margin.left)
	SetAttr("margin-right",Margin.right)
	'set padding
	SetAttr("padding",Padding.all)
	SetAttr("padding-top",Padding.top)
	SetAttr("padding-bottom",Padding.bottom)
	SetAttr("padding-left",Padding.left)
	SetAttr("padding-right",Padding.right)
	'define the outline
	SetAttr("outline",Outline.all)
	SetAttr("outline-style",Outline.style)
	SetAttr("outline-offset",Outline.offset)
	SetAttr("outline-width",Outline.width)
	SetAttr("outline-color",Outline.color)
	
	'build the css in srted property order
	sortit.Initialize
	For Each strProp As String In css.Keys
		sortit.Add(strProp)
	Next
	sortit.Sort(True)
End Sub

'return the map css of the style
Sub ToMap As Map
	Return css
End Sub

'return json value of the style
Sub ToJSON As String
	Dim sjson As String = BANano.ToJson(css)
	Return sjson
End Sub
