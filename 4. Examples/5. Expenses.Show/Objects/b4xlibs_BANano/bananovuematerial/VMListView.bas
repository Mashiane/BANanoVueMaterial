B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListView As VMList
	Public ID As String
	Public vue As BANanoVue
	Public HasContent As Boolean
	Private eventHandler As Object
	Private items As Map
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, module As Object) As VMListView
	ID = sid.ToLowerCase
	vue = v
	ListView.Initialize(vue, ID,module)
	items.Initialize
	HasContent = False
	eventHandler = module
	Return Me
End Sub


Sub SetDisabled(b As Boolean) As VMListView
	ListView.SetDisabled(b)
	Return Me
End Sub


Sub AddAvatar(key As String, imgURL As String, text As String, badge As Object)
	key = key.tolowercase
	Dim item As VMListItem
	item.Initialize(vue, key,eventHandler)
	item.SetAvatar(imgURL)
	item.SetText(text)
	If badge <> Null Then item.SetBadge(badge,True,"top",True,False)
	items.Put(key, item)
End Sub

Sub AddSubAvatar(parent As String, key As String, imgURL As String, text As String)
	If items.ContainsKey(parent) Then
		Dim li As VMListItem = items.Get(parent)
		Dim pl As VMList = li.childList
		Dim item As VMListItem
		item.Initialize(vue, key,eventHandler)
		item.SetAvatar(imgURL)
		item.SetText(text)
		item.Pop(pl)
	End If
End Sub

Sub AddItem(key As String, icon As String, text As String, badge As Object)
	Dim item As VMListItem
	item.Initialize(vue, key,eventHandler)
	item.SetIcon(icon, False)
	item.SetText(text)
	If badge <> Null Then item.SetBadge(badge,True,"top",True,False)
	items.Put(key, item)
End Sub

Sub AddSubItem(parent As String, key As String, icon As String, text As String)
	If items.ContainsKey(parent) Then
		Dim li As VMListItem = items.Get(parent)
		Dim pl As VMList = li.childList
		Dim item As VMListItem
		item.Initialize(vue, key, eventHandler)
		item.SetIcon(icon, False)
		item.SetText(text)
		item.SetInset(True)
		item.Pop(pl)
	End If
End Sub

'expand a single item from the list
Sub ExpandItem(sid As String, b As Boolean) As VMListView
	Dim syncid As String = $"${ID}sync"$
	vue.SetStateSingle(syncid, b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListView
	ListView.SetTabIndex(ti)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListView
	ListView.SetVShow(vif)
	Return Me
End Sub

Sub SetDense(b As Boolean) As VMListView
	If b Then AddClass("md-dense")
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListView
	ListView.SetVIf(vif)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMListView
	ListView.SetStyle(m)
	Return Me
End Sub

Sub SetBorder(b As Boolean) As VMListView
	If b Then SetStyle(CreateMap("border": "1px solid rgba(#000, .12)"))
	Return Me
End Sub

Sub SetElevation(e As Int) As VMListView
	ListView.SetElevation(e)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMListView
	ListView.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListView
	ListView.SetAttr(attr)
	Return Me
End Sub

Sub SetText(t As String) As VMListView
	ListView.SetText(t)
	HasContent = True
	Return Me
End Sub

Sub ToString As String
	For Each item As VMListItem In items.Values
		Dim cl As VMList = item.childList
		If cl.HasContent Then item.SetList(cl)
		item.Pop(ListView)
	Next
	Return ListView.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub