B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "textcode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns(2,12,12,12,12)
	'
	vm.CreateInput("inp1",Me).SetLabel("Initial Value").SetVModel("initial").AddToContainer(cont, 1, 1)
	vm.CreateInput("inp2",Me).SetLabel("Initial Value (Read Only)").SetReadOnly(True).SetVModel("initial").AddToContainer(cont, 1, 1)
	vm.CreateInput("inp3",Me).SetLabel("With Help").SetVModel("help").SetHelperText("Some help text").AddToContainer(cont, 1, 1)
	vm.CreateInput("inp4",Me).SetLabel("Inline").SetVModel("help1").SetInline(True).AddToContainer(cont, 1, 1)
	vm.CreateInput("inp5",Me).SetLabel("Number").SetVModel("help3").SetTypeNumber(True).AddToContainer(cont, 1, 1)
	vm.CreateInput("inp6",Me).SetLabel("Disabled").SetVModel("help4").SetDisabled(True).AddToContainer(cont, 1, 1)
	vm.CreateInput("inp7",Me).SetLabel("Required").SetVModel("help5").SetErrorText("There is an error").SetRequired(True).AddToContainer(cont, 1, 1)
	vm.CreateInput("inp8",Me).SetLabel("Counter").SetVModel("txtcount").SetCounter(30).AddToContainer(cont, 1, 1)
	vm.CreateInput("inp9",Me).SetLabel("Max Length").SetVModel("txtlen").SetMaxlength(10).AddToContainer(cont, 1, 1)
	vm.CreateInput("inp10",Me).SetLabel("Max Length & Disabled Counter").SetVModel("txtlend").SetMaxlength(15).SetCounterDisabled.AddToContainer(cont, 1, 1)
	vm.CreateInput("txti",Me).SetLabel("Date").SetVModel("txti").SetIcon("event").AddToContainer(cont, 1, 1)
	vm.CreateInput("txtz",Me).SetLabel("Voice").SetVModel("txtz").SetIcon1("keyboard_voice").AddToContainer(cont, 1, 1)
	vm.CreateInput("txty",Me).SetLabel("Transfer Money").SetVModel("txty").SetIcon("warning").SetIcon1("attach_money").AddToContainer(cont, 1, 1)
	vm.CreateInput("txtw",Me).SetLabel("Cleraable").SetVModel("initial").SetClearable(True).AddToContainer(cont, 1, 1)
	vm.CreateInput("txtu",Me).SetLabel("Password").SetVModel("password").SetTypePassword(True).AddToContainer(cont, 1, 1)
	vm.CreateInput("txth",Me).SetLabel("Password without toggle").SetVModel("password").SetTypePassword(True).SetTogglePassword(False).AddToContainer(cont, 1, 1)
	vm.CreateInput("txtd",Me).SetLabel("Prefix").SetVModel("txtd").SetPrefix("$").AddToContainer(cont, 1, 1)
	vm.CreateInput("txtf",Me).SetLabel("Suffix").SetVModel("txtf").SetSuffix("@gmail.com").AddToContainer(cont, 1, 1)
	
	
	cont.AddComponent(1,1, vm.BR)
	cont.AddComponent(1,1, vm.BR)
	vm.CreateButton("btnx",Me).SetText("Show Error").SetRaised(True).AddToContainer(cont, 1, 1)
	
	
	'
	vm.CreateLABEL("").SetParagraph.SetText("{{ initial }}").AddToContainer(cont,1,1)
	vm.CreateLABEL("").SetParagraph.SetText("{{ help }}").AddToContainer(cont,1,1)
	vm.CreateLABEL("").SetParagraph.SetText("{{ help1 }}").AddToContainer(cont,1,1)
	vm.CreateLABEL("").SetParagraph.SetText("{{ help3 }}").AddToContainer(cont,1,1)
	vm.CreateLABEL("").SetParagraph.SetText("{{ help4 }}").AddToContainer(cont,1,1)
	vm.CreateLABEL("").SetParagraph.SetText("{{ txtd }}").AddToContainer(cont,1,1)
	vm.CreateLABEL("").SetParagraph.SetText("{{ txtf }}").AddToContainer(cont,1,1)
	'
	vm.SetStateSingle("help4", "This text control is disabled!")
	vm.SetStateSingle("initial", "This is BANanoVuewMaterial")
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub btnx_click(e As BANanoEvent)
	vm.ShowError("inp7")
End Sub
