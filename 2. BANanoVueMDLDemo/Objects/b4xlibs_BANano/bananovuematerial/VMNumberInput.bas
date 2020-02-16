B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public NumberInput As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private div As VMElement
	Private lbl As VMElement
	Private mdl As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String) As VMNumberInput
	BANano.DependsOnAsset("vue-number-input.js")
	
	ID = sid.ToLowerCase
	vue = v
	div.Initialize(vue, $"${ID}"$).SetTag("div")
	lbl.Initialize(vue,$"${ID}lbl"$).SetTag("label")
	lbl.SetStyle(CreateMap("pointer-events": "auto", "top": "0", "opacity": "1", "font-size": "12px"))
	NumberInput.Initialize(vue, ID).SetTag("number-input")
	mdl = ""
	SetCenter(True)
	SetControls(True)
	SetInputable(False)
	Return Me
End Sub

Sub SetControls(b As Boolean) As VMNumberInput
	If b = False Then Return Me
	SetAttr(CreateMap(":controls":b))
	Return Me
End Sub


Sub SetCenter(b As Boolean) As VMNumberInput
	If b = False Then Return Me
	SetAttr(CreateMap(":center":b))
	Return Me
End Sub

Sub SetInline(b As Boolean) As VMNumberInput
	If b = False Then Return Me
	SetAttr(CreateMap(":inline":b))
	Return Me
End Sub

Sub SetReadOnly(b As Boolean) As VMNumberInput
	If b = True Then Return Me
	SetAttr(CreateMap(":readonly": b))
	Return Me
End Sub

Sub SetInputable(b As Boolean) As VMNumberInput
	If b = True Then Return Me
	SetAttr(CreateMap(":inputtable": b))
	Return Me
End Sub

Sub SetRounded(b As Boolean) As VMNumberInput
	If b = False Then Return Me
	SetAttr(CreateMap("rounded": b))
	Return Me
End Sub

Sub SetSizeSmall As VMNumberInput
	SetAttr(CreateMap("size":"small"))
	Return Me
End Sub

Sub SetSizeLarge As VMNumberInput
	SetAttr(CreateMap("size":"large"))
	Return Me
End Sub

Sub SetLabel(t As String) As VMNumberInput
	If t = "" Then Return Me
	lbl.SetText(t)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMNumberInput
	If ti = "" Then Return Me
	NumberInput.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMNumberInput
	NumberInput.SetName(varName, bind)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetID(varName As Object, bind As Boolean) As VMNumberInput
	NumberInput.SetID(varName, bind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMNumberInput
	NumberInput.SetDisabled(b)
	Return Me
End Sub


'add a class
Sub AddClass(c As String) As VMNumberInput
	NumberInput.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMNumberInput
	NumberInput.SetAttr(attr)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMNumberInput
	If vif = "" Then Return Me
	div.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMNumberInput
	If vif = "" Then Return Me
	div.SetVShow(vif)
	Return Me
End Sub

Sub SetMax(mx As String) As VMNumberInput
	If mx = "" Then Return Me
	SetAttr(CreateMap(":max": mx))
	Return Me
End Sub

Sub SetMin(mn As String) As VMNumberInput
	If mn = "" Then Return Me
	SetAttr(CreateMap(":min": mn))
	Return Me
End Sub

Sub SetVModel(k As String) As VMNumberInput
	If k = "" Then Return Me
	mdl = k.tolowercase
	NumberInput.SetVModel(k)
	Return Me
End Sub

Sub SetValue(vl As String) As VMNumberInput
	If mdl = "" Then
		Log("VMNumberInput: Set VModel first!")
	End If
	vue.SetStateSingle(mdl, vl)
	Return Me
End Sub

Sub SetStep(stp As String) As VMNumberInput
	If stp = "" Then Return Me
	SetAttr(CreateMap(":step":stp))
	Return Me
End Sub

Sub ToString As String
	lbl.Pop(div)
	NumberInput.Pop(div)
	Return div.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub