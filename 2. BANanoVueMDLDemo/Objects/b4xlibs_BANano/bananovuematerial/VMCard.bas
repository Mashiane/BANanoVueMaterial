B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Card As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Public Header As VMElement
	Public Content As VMElement
	Public Actions As VMCardActions
	Private HeaderText As VMElement
	Private Media As VMCardMedia
	Private monside As Boolean
	Private Avatar As VMAvatar
	Private module As Object
End Sub

'initialize the Card
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCard
	ID = sid.tolowercase
	Card.Initialize(v, ID)
	Card.SetTag("md-card")
	vue = v
	module = eventHandler
	Header.Initialize(vue,$"${ID}ch"$).SetTag("md-card-header")
	Content.Initialize(vue,$"${ID}cc"$).SetTag("md-card-content")
	Actions.Initialize(vue,$"${ID}actions"$)
	HeaderText.Initialize(vue,$"${ID}cht"$).SetTag("md-card-header-text")
	Media.Initialize(vue,$"${ID}media"$) 
	monside = False
	Avatar.Initialize(vue,$"${ID}avatar"$,module)
	Return Me
End Sub

Sub SetAvatar(imgURL As String, imgAlt As String) As VMCard
	Avatar.SetValue(imgURL)
	Avatar.SetAlt(imgAlt)
	Return Me 
End Sub

Sub SetMediaOnSide(b As Boolean) As VMCard
	monside = b
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMCard
	Card.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMCard
	Card.SetAccent(True)
	Return Me
End Sub

Sub SetMediaBig(b As Boolean) As VMCard
	Media.SetBig(b)
	Return Me
End Sub

Sub SetMediaMedium(b As Boolean) As VMCard
	Media.SetMedium(b)
	Return Me
End Sub

Sub SetTitle(t As String) As VMCard
	Dim title As VMElement
	title.Initialize(vue,$"${ID}title"$).SetTag("div").SetTitle(True).SetText(t) 
	title.Pop(HeaderText)
	Return Me
End Sub

Sub SetImage(imgURL As String, alt As String) As VMCard
	Dim img As VMImage
	img.Initialize(vue,$"${ID}image"$,module).SetValue(imgURL,True)
	img.SetAlt(alt)
	img.Pop(Media.CardMedia)
	Return Me 
End Sub
	
Sub SetSubHeading(t As String) As VMCard
	Dim title As VMElement
	title.Initialize(vue,$"${ID}subheading"$).SetTag("div").SetSubHead(True).SetText(t)
	title.Pop(HeaderText)
	Return Me
End Sub

Sub AddAction(btnID As String, btnText As String) As VMCard
	Dim btn As VMButton
	btn.Initialize(vue,btnID, module).SetText(btnText) 
	btn.Pop(Actions.CardActions)
	Return Me
End Sub

Sub SetContent(c As String) As VMCard
	Content.SetText(c)
	Return Me
End Sub

'get component
Sub ToString As String
	'Avatar.Pop(Header)
	HeaderText.Pop(Header)
	If monside Then
		Media.Pop(Header)
	Else
		Media.Pop(Card)
	End If	
	Header.Pop(Card)
	Content.Pop(Card)
	Actions.Pop(Card)
	Return Card.ToString
End Sub

Sub SetVModel(k As String) As VMCard
	Card.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCard
	Card.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCard
	Card.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCard
	Dim childHTML As String = child.ToString
	Card.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCard
	Card.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCard
	Card.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCard
	Card.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCard
	Card.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMCard
	Card.SetPaddingAll(p)
	Return Me
End Sub

'Hover effect
Sub SetWithHover(varWith As Boolean) As VMCard
	SetAttr(CreateMap(":md-with-hover": varWith))
	Return Me
End Sub

'Theme
Sub SetTheme(varTheme As Object) As VMCard
	SetAttr(CreateMap("md-theme": varTheme))
	Return Me
End Sub

'Primary-md-primary
Sub SetThemePrimary(b As Boolean) As VMCard    'ignore
	AddClass("md-primary")
	Return Me
End Sub

'Primary-md-accent
Sub SetThemeAccent(b As Boolean) As VMCard    'ignore
	AddClass("md-accent")
	Return Me
End Sub

