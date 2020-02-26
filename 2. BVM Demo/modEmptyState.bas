B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "emptycode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(4).AddColumns12
	
	Dim es As VMEmptyState = vm.CreateEmptyState("es1", Me)
	es.SetIcon("devices_other").SetLabel("Create your first project")
	es.SetDescription("Creating project, you'll be able to upload your design and collaborate with people.")
	'
	Dim btn As VMButton = vm.CreateButton("btn1", Me).SetPrimary(True).SetRaised(True).SetText("Create first project")
	es.Addhtml(btn.tostring)
	es.AddToContainer(cont, 1, 1)
	'
	Dim es1 As VMEmptyState = vm.CreateEmptyState("es1", Me).SetRounded(True).SetIcon("access_time")
	es1.Setlabel("Nothing in Snoozed")
	es1.SetDescription("Anything you snooze will go here until it's time for it to return to the inbox.")
	es1.AddToContainer(cont, 2, 1)
	'
	Dim es2 As VMEmptyState = vm.CreateEmptyState("es2", Me).SetIcon("done").SetPrimary(True)
	es2.Setlabel("Nothing in Done")
	es2.SetDescription("Anything you mark done will be safely stored here.")
	es2.AddToContainer(cont, 3, 1)
	'
	Dim es3 As VMEmptyState = vm.CreateEmptyState("es3", Me).SetRounded(True).SetIcon("alarm_off").SetAccent(True)
	es3.Setlabel("Nothing in Reminders")
	es3.SetDescription("Create a Reminder and it will show up here.")
	es3.AddToContainer(cont, 4, 1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub btn1_click(e As BANanoEvent)
	vm.ShowSnackBar("Start creating your project now!")
End Sub