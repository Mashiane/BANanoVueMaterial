B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Image As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private hasTT As Boolean
	Private tt As VMTooltip
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMImage
	ID = sid.ToLowerCase
	vue = v
	Image.Initialize(vue, ID).SetTag("img")
	hasTT = False
	Image.SetOnClick(eventHandler, $"${ID}_click"$)
	Image.SetOnTouchStart(module, $"${ID}_touchstart"$)
	Image.SetOnDragOver(module, $"${ID}_dragover"$)
	Image.setondragstart(module, $"${ID}_dragstart"$)
	Image.SetOnDragEnd(module, $"${ID}_dragend"$)
	Image.setondragenter(module, $"${ID}_dragenter"$)
	Image.SetOnDrop(module, $"${ID}_drop"$)
	Return Me
End Sub

Sub SetToolTipTop(Text As String) As VMImage
	tt.Initialize(vue,$"${ID}tlt"$).SetText(Text).SetDirectionTop(True)
	hasTT = True 
	Return Me
End Sub

Sub SetToolTipRight(Text As String) As VMImage
	tt.Initialize(vue,$"${ID}tlt"$).SetText(Text).SetDirectionRight(True)
	hasTT = True 
	Return Me
End Sub

Sub SetToolTipBottom(Text As String) As VMImage
	tt.Initialize(vue,$"${ID}tlt"$).SetText(Text).SetDirectionBottom(True)
	hasTT = True 
	Return Me
End Sub

Sub SetToolTipLeft(Text As String) As VMImage
	tt.Initialize(vue,$"${id}tlt"$).SetText(Text).SetDirectionLeft(True)
	hasTT = True 
	Return Me
End Sub

Sub SetVShow(vif As String) As VMImage
	Image.SetVShow(vif)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMImage
	Image.SetVIf(vif)
	Return Me
End Sub

Sub SetDraggable(b As Boolean) As VMImage
	Image.SetDraggable(b)
	Return Me
End Sub

Sub SetDroppable(b As Boolean) As VMImage
	Image.SetDroppable(b)
	Return Me	
End Sub

Sub SetWidth(w As String) As VMImage
	Image.SetWidth(w)
	Return Me
End Sub

Sub SetHeight(h As String) As VMImage
	Image.SetHeight(h)
	Return Me
End Sub

Sub SetBorder(width As String, color As String, bstyle As String) As VMImage
	Image.SetBorder(width, color, bstyle)
	Return Me
End Sub

Sub SetMarginAll(p As Object) As VMImage
	Image.SetMarginAll(p)
	Return Me
End Sub

Sub SetAttr(m As Map) As VMImage
	Image.SetAttr(m)
	Return Me
End Sub

Sub SetRipple(b As Boolean) As VMImage
	Image.SetRipple(b)
	Return Me
End Sub

Sub SetPaddingAll(p As Object) As VMImage
	Image.SetPaddingAll(p)
	Return Me
End Sub

Sub SetCursorMove As VMImage
	Image.SetCursorMove
	Return Me
End Sub

Sub SetCursorPointer As VMImage
	Image.SetCursorPointer
	Return Me
End Sub

Sub SetText(t As String) As VMImage
	Image.SetText(t)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMImage
	Image.SetStyle(m)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMImage
	Image.AddClass(c)
	Return Me
End Sub

Sub SetAlt(a As String) As VMImage
	Image.SetAlt(a)
	Return Me
End Sub

Sub SetVerticalAlignMiddle As VMImage
	Image.SetVerticalAlignMiddle
	Return Me
End Sub

'set value
Sub SetValue(valueName As String, bind As Boolean) As VMImage
	If bind Then
		valueName = valueName.tolowercase
		Image.SetSRC($"${ID}src"$,True)
		Dim opt As Map = CreateMap()
		opt.Put($"${ID}src"$, valueName)
		vue.SetState(opt)
	Else
		Image.SetSRC(valueName, False)
		SetAttr(CreateMap("value":valueName))
	End If
	Return Me
End Sub

Sub SetVModel(k As String) As VMImage
	Image.SetVModel(k)
	Return Me
End Sub

Sub ToString As String
	If hasTT Then
		Dim div As VMElement
		div.Initialize(vue,$"${ID}parent"$)
		div.SetText(Image.ToString)
		div.SetText(tt.ToString)
		Return div.tostring  
	Else
		Return Image.tostring
	End If
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub