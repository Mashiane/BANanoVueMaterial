B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "typographycode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(1).AddColumns12
	vm.CreateLABEL("").SetParagraph.SetDisplay4(True).SetText("Display 4").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetDisplay3(True).SetText("Display 3").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetDisplay2(True).SetText("Display 2").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetDisplay1(True).SetText("Display 1").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetHeadline(True).SetText("Headline").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetTitle(True).SetText("Title").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetSubHeading(True).SetText("Sub-Heading").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetBody2(True).SetText("Body 2").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetBody1(True).SetText("Body 1").AddToContainer(cont, 1,1)
	vm.CreateLABEL("").SetParagraph.SetCaption(True).SetText("Caption").AddToContainer(cont, 1,1)
	
	'Dim el As VMElement = vm.CreateRouterLink("Links").SetTo("/components/typography")
	'cont.AddComponent(1,1, el.ToString)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub