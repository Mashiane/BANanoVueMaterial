B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "tabscode"
	Dim step4 As VMTabs
End Sub


Sub Code(vmx As BANanoVM)
	Log("mdTabs.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(4).AddColumns12
	'
	Dim step1 As VMTabs = vm.CreateTabs("tab1", Me).SetElevation(2).SetMargin("10px")
	step1.AddTab("first","First Step","home",FirstStep.tostring)
	step1.AddTab("second","Second Step","pages",SecondStep.tostring)
	step1.AddTab("third","Third Step","favorite",ThirdStep.tostring)
	step1.AddToContainer(cont, 1, 1)
	'
	Dim step2 As VMTabs = vm.CreateTabs("tab2", Me).SetElevation(2).SetMargin("10px").SetAlignmentCenter(True).SetSwipeable(True)
	step2.AddTab("first2","First Step","",Null)
	step2.AddTab("second2","Second Step","",Null)
	step2.AddTab("third2","Third Step","",Null)
	step2.AddToContainer(cont, 2, 1)
	'
	Dim step3 As VMTabs = vm.CreateTabs("tab3", Me).SetElevation(2).SetMargin("10px").SetAlignmentRight(True).SetTabActive("second3")
	step3.AddTab("first3","First Step","Optional",Null)
	step3.AddTab("second3","Second Step","",Null)
	step3.AddTab("third3","Third Step","",Null)
	step3.AddToContainer(cont, 3, 1)
	
	step4 = vm.CreateTabs("step4", Me).SetTabActive("first4").SetElevation(2).SetMargin("10px").SetAlignmentFixed(True)
	step4.AddTab("first4","First Step","",FirstStep.tostring)
	step4.AddTab("second4","Second Step","",SecondStep.ToString)
	step4.AddTab("third4","Third Step","",ThirdStep.tostring)
	step4.AddToContainer(cont,4, 1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub


Sub FirstStep As VMContainer
	Dim el As VMContainer = vm.CreateContainer("firststep", Me)
	
	el.AddRows(1).AddColumns12
	
	vm.CreateLABEL("fs1label").SetParagraph.SetText("This is tab 1").AddToContainer(el, 1, 1)
	Return el
End Sub


Sub SecondStep As VMContainer
	Dim el As VMContainer = vm.CreateContainer("firststep", Me)
	
	
	el.AddRows(1).AddColumns12
	
	vm.CreateLABEL("fs1label").SetParagraph.SetText("This is tab 2").AddToContainer(el, 1, 1)
	Return el
End Sub

Sub ThirdStep As VMContainer
	Dim el As VMContainer = vm.CreateContainer("firststep", Me)
	
	
	el.AddRows(1).AddColumns12
	
	vm.CreateLABEL("fs1label").SetParagraph.SetText("This is tab 3").AddToContainer(el, 1, 1)
	Return el
End Sub