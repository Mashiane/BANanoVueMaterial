B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Slider As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private InputInt As VMElement
	Private lbl As VMLabel
	Private labelText As String
	Private vmodelText As String
	Private labelOnTop As Boolean
	Private module As Object
End Sub

#if css
	.dontwrap {
	white-space: initial !important;
}
#End If

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSlider
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Slider.Initialize(vue, ID).SetTag("vue-material-slider")
	InputInt.Initialize(v,$"${sid}parent"$).SetTag("div")
	lbl.Initialize(vue, $"${sid}label"$)
	labelText = ""
	labelOnTop = False
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSlider
	Slider.SetTabIndex(ti)
	Return Me
End Sub


Sub SetLabelOnTop(b As Boolean) As VMSlider
	labelOnTop = b
	Return Me
End Sub

Sub SetLabel(lblText As Object) As VMSlider
	labelText = lblText
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMSlider
	Slider.SetName(varName, bind)
	Return Me
End Sub

Sub SetThumbLabel(b As Boolean) As VMSlider
	SetAttr(CreateMap(":thumbLabel": b))
	Return Me
End Sub

Sub SetInvert(b As Boolean) As VMSlider
	SetAttr(CreateMap(":invert": b))
	Return Me
End Sub

Sub SetVertical(b As Boolean) As VMSlider
	SetAttr(CreateMap(":vertical": b))
	Return Me
End Sub


'The Select name. Similar To HTML5 name attribute.
Sub SetID(varName As Object, bind As Boolean) As VMSlider
	Slider.SetID(varName, bind)
	Return Me
End Sub

Sub SetMin(m As Int) As VMSlider
	SetAttr(CreateMap(":min": m))
	Return Me
End Sub


Sub SetMax(m As Int) As VMSlider
	SetAttr(CreateMap(":max": m))
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMSlider
	Slider.SetDisabled(b)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSlider
	Slider.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSlider
	Slider.SetVShow(vif)
	Return Me
End Sub

Sub SetValue(v As Object) As VMSlider
	SetAttr(CreateMap("value": v))
	Return Me
End Sub

Sub SetVModel(k As String) As VMSlider
	Slider.SetVModel(k)
	vmodelText = k
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMSlider
	Slider.AddClass(c)
	Return Me
End Sub


Sub SetStyle(m As Map) As VMSlider
	InputInt.SetStyle(m)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSlider
	Slider.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	Dim mModel As String = $"{{ ${vmodelText} }}"$
	lbl.SetText($"${labelText}: ${mModel}"$)
	If labelOnTop Then InputInt.AddClass("dontwrap")
	lbl.Pop(InputInt)
	Slider.Pop(InputInt)
	Return InputInt.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub