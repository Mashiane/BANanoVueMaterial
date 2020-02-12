B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "steppercode"
	Dim step4 As VMSteppers
End Sub


Sub Code(vmx As BANanoVM)
	Log("modSkeleton.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(4).AddColumns12
	'
	Dim step1 As VMSteppers = vm.CreateSteppers("step1", Me).SetElevation(2).SetMargin("10px")
	step1.AddStep("first","First Step","",True,Null)
	step1.AddStep("second","Second Step","",True,Null)
	step1.AddStep("third","Third Step","",True,Null)
	step1.AddToContainer(cont, 1, 1)
	'
	Dim step2 As VMSteppers = vm.CreateSteppers("step2", Me).SetAlternative(True).SetElevation(2).SetMargin("10px")
	step2.AddStep("first2","First Step","",True,Null)
	step2.AddStep("second2","Second Step","",True,Null)
	step2.AddStep("third2","Third Step","",True,Null)
	step2.AddToContainer(cont, 2, 1)
	'
	Dim step3 As VMSteppers = vm.CreateSteppers("step3", Me).SetVertical(True).SetElevation(2).SetMargin("10px")
	step3.AddStep("first3","First Step","Optional",True,Null)
	step3.AddStep("second3","Second Step","",True,Null)
	step3.AddStep("third3","Third Step","",True,Null)
	step3.AddToContainer(cont, 3, 1)
	
	step4 = vm.CreateSteppers("step4", Me).SetStepActive("first4").SetLinear(True).SetElevation(2).SetMargin("10px")
	step4.AddStep("first4","First Step","Optional",True,FirstStep.tostring)
	step4.AddStep("second4","Second Step","",True,SecondStep.ToString)
	step4.AddStep("third4","Third Step","",True,ThirdStep.tostring)
	step4.AddToContainer(cont,4, 1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub


Sub FirstStep As VMContainer
	Dim el As VMContainer = vm.CreateContainer("firststep", Me)
	
	el.AddRows(1).AddColumns12
	el.AddRows(1).AddColumns2x6
	vm.CreateLABEL("fs1label").SetParagraph.SetText("This is step 1").AddToContainer(el, 1, 1)
	vm.CreateButton("tostep2", Me).SetText("Next").SetRaised(True).SetPrimary(True).AddToContainer(el, 2, 1)
	Return el
End Sub


Sub SecondStep As VMContainer
	Dim el As VMContainer = vm.CreateContainer("firststep", Me)
	
	
	el.AddRows(1).AddColumns12
	el.AddRows(1).AddColumns2x6
	vm.CreateLABEL("fs1label").SetParagraph.SetText("This is step 2").AddToContainer(el, 1, 1)
	vm.CreateButton("tostep1", Me).SetText("Back").SetRaised(True).SetPrimary(True).AddToContainer(el, 2, 1)
	vm.CreateButton("tostep3", Me).SetText("Next").SetRaised(True).SetPrimary(True).AddToContainer(el, 2, 1)
	Return el
End Sub

Sub tostep1_click(e As BANanoEvent)
	step4.SetStepActive("first4")
	step4.SetStepDone("second4",False)
End Sub

Sub tostep2_click(e As BANanoEvent)
	step4.SetStepActive("second4")
	step4.SetStepDone("first4",True)
End Sub

Sub tostep3_click(e As BANanoEvent)
	step4.SetStepActive("third4")
	step4.SetStepDone("second4",True)
End Sub

Sub ThirdStep As VMContainer
	Dim el As VMContainer = vm.CreateContainer("firststep", Me)
	
	
	el.AddRows(1).AddColumns12
	el.AddRows(1).AddColumns2x6
	vm.CreateLABEL("fs1label").SetParagraph.SetText("This is step 3").AddToContainer(el, 1, 1)
	vm.CreateButton("tostep2", Me).SetText("Back").SetRaised(True).SetPrimary(True).AddToContainer(el, 2, 1)
	vm.CreateButton("done", Me).SetText("Done").SetRaised(True).SetPrimary(True).AddToContainer(el, 2, 1)
	Return el
End Sub