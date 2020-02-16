B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Steppers As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private actKey As String
	Private module As Object
	Private steps As Map
End Sub

'initialize the Steppers
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSteppers
	ID = sid.tolowercase
	module = eventHandler
	Steppers.Initialize(v, ID)
	Steppers.SetTag("md-steppers")
	vue = v
	actKey = $"${ID}active"$
	SetOnChanged
	SetActiveStepSync
	steps.initialize
	Return Me
End Sub

Sub SetKey(mdlName As String) As VMSteppers
	mdlName = mdlName.tolowercase
	SetAttr(CreateMap(":key": mdlName))
	Return Me
End Sub

private Sub SetActiveStepSync As VMSteppers
	vue.SetStateSingle(actKey, Null)
	SetAttr(CreateMap(":md-active-step.sync": actKey))
	Return Me
End Sub

'the stepLabelVModel is the vmodel to have the caption
Sub AddStep(stepID As String, stepLabel As String, stepDescription As String, stepEditable As Boolean, stepContent As String)
	stepID = stepID.tolowercase
	steps.put(stepID, stepID)
	Dim stepitem As VMStepItem
	stepitem.Initialize(vue, stepID, module) 
	stepitem.SetLabel(stepLabel)
	If stepContent <> Null Then
		stepitem.SetContent(stepContent)
	End If
	stepitem.SetDescription(stepDescription)
	stepitem.SetEditable(stepEditable)
	stepitem.Pop(Steppers)
End Sub

Sub SetElevation(e As Int) As VMSteppers
	Steppers.SetElevation(e)
	Return Me
End Sub


Sub SetStepEditable(stepID As String, stepEditable As Boolean) As VMSteppers
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}editable"$
	vue.SetStateSingle(stepShow, stepEditable)
	Return Me
End Sub

Sub SetStepDescription(stepID As String, stepEditable As String) As VMSteppers
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}description"$
	vue.SetStateSingle(stepShow, stepEditable)
	Return Me
End Sub

Sub SetStepLabel(stepID As String, stepLabel As String) As VMSteppers
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}label"$
	vue.SetStateSingle(stepShow, stepLabel)
	Return Me
End Sub

Sub HideStep(stepID As String) As VMSteppers
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}show"$
	vue.SetStateSingle(stepShow, False)
	Return Me
End Sub

Sub ShowStep(stepID As String) As VMSteppers
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}show"$
	vue.SetStateSingle(stepShow, True)
	Return Me
End Sub

'get component
Sub ToString As String
	Return Steppers.ToString
End Sub

Sub SetVIf(vif As Object) As VMSteppers
	Steppers.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSteppers
	Steppers.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSteppers
	Dim childHTML As String = child.ToString
	Steppers.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSteppers
	Steppers.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSteppers
	Steppers.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSteppers
	Steppers.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSteppers
	Steppers.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMSteppers
	Steppers.SetPaddingAll(p)
	Return Me
End Sub

'set margins
Sub SetMargin(p As Object) As VMSteppers
	Steppers.SetMarginAll(p)
	Return Me
End Sub

Sub SetStepError(stepID As String, stepError As String) As VMSteppers
	stepID = stepID.tolowercase
	Dim dd As String = $"${stepID}error"$
	vue.SetStateSingle(dd, stepError)
	Return Me
End Sub

Sub SetStepDone(stepDone As String, b As Boolean) As VMSteppers
	stepDone = stepDone.tolowercase
	Dim dd As String = $"${stepDone}done"$
	vue.SetStateSingle(dd, b)
	Return Me
End Sub

'The id of the Step To be set As the current one.
Sub SetStepActive(varActiveStep As String) As VMSteppers
	varActiveStep = varActiveStep.tolowercase
	vue.SetStateSingle(actKey, varActiveStep)
	for each stepa as string in steps.keys
		if stepa = varactivestep then
		else
			SetStepDone(stepa, false)
		end if
	next
	Return Me
End Sub

'Watches the current route If there Is a Vue Router instance running on the page.
Sub SetSyncRoute(varSyncRoute As Boolean) As VMSteppers
	SetAttr(CreateMap(":md-sync-route": varSyncRoute))
	Return Me
End Sub

'Change the steppers into a alternative layout
Sub SetAlternative(varAlternative As Boolean) As VMSteppers
	SetAttr(CreateMap(":md-alternative": varAlternative))
	Return Me
End Sub

'Change the steppers into a vertical orientation. For mobile.
Sub SetVertical(varVertical As Boolean) As VMSteppers
	SetAttr(CreateMap(":md-vertical": varVertical))
	Return Me
End Sub

'Set steppers To work in a linear flow.
Sub SetLinear(varLinear As Boolean) As VMSteppers
	SetAttr(CreateMap(":md-linear": varLinear))
	Return Me
End Sub

'Calculate the stepper height automatically And add an awesome height transition between them.
Sub SetDynamicHeight(varDynamicHeight As Boolean) As VMSteppers
	SetAttr(CreateMap(":md-dynamic-height": varDynamicHeight))
	Return Me
End Sub

'Triggered when the active stepper changes
private Sub SetOnChanged As VMSteppers
	Dim stepID As String = ""
	Dim methodName As String  = $"${ID}_change"$
	If SubExists(module, methodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(stepID))
	SetAttr(CreateMap("v-on:md-changed": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub