B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Tree As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private options As Map
	Private eventHandler As Object
	Private ExpandIcon As String
	Private CollapseIcon As String
	Private treeBO As BANanoObject
	Private IconsLibrary As String
	Private ImageUrlField As String
	Private ImageHtmlField As String
	Private JQ As BANanoObject
End Sub

'initialize the Badge
Public Sub Initialize(v As BANanoVue, module As Object, sid As String, priKey As String) As VMTree
	BANano.DependsOnAsset("jquery-3.4.1.min.js")
	BANano.DependsOnAsset("gijgo.min.css")
	BANano.DependsOnAsset("gijgo.min.js")
	ID = sid.tolowercase
	Tree.Initialize(v, ID)
	vue = v
	JQ = vue.jquery
	eventHandler = module
	options.Initialize 
	SetUiLibrary("materialdesign")
	SetIconsLibrary("materialicons")
	SetLazyLoading(True)
	SetSelectionType("single")
	SetCheckedField("checked")
	SetChildrenField("children")
	SetDisabledField("disabled")
	SetHasChildrenField("hasChildren")
	SetImageCssClassField("imageCssClass")
	SetImageHtmlField("imageHtml")
	SetImageUrlField("imageUrl")
	SetTextField("text")
	SetPrimaryKey(priKey)
	Return Me
End Sub


Sub SetDisabled(b As Boolean) As VMTree
	Tree.SetDisabled(b)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTree
	If vif = "" Then Return Me
	Tree.SetVShow(vif)
	Return Me
End Sub

Sub SetElevation(e As Int) As VMTree
	Tree.SetElevation(e)
	Return Me
End Sub

Sub SetAutoLoad(b As Boolean) As VMTree
	options.Put("autoLoad", b)
	Return Me
End Sub

Sub SetWidth(w As String) As VMTree
	options.Put("width", w)
	Return Me
End Sub

Sub SetBorder(b As Boolean) As VMTree
	options.Put("border", b)
	Return Me
End Sub

Sub SetCascadeCheck(b As Boolean) As VMTree
	options.Put("cascadeCheck", b)
	Return Me
End Sub

Sub SetCheckboxes(b As Boolean) As VMTree
	options.put("checkboxes", b)
	Return Me
End Sub

Sub SetCheckedField(checkedField As String) As VMTree
	options.Put("checkedField", checkedField)
	Return Me
End Sub

Sub SetChildrenField(childrenField As String) As VMTree
	options.Put("childrenField", childrenField)
	Return Me
End Sub

Sub SetDataSource(dataSource As List) As VMTree
	options.Put("dataSource", dataSource)
	Return Me
End Sub

Sub SetDisabledField(disabledField As String) As VMTree
	options.Put("disabledField", disabledField)
	Return Me
End Sub

Sub SetDragAndDrop(dragAndDrop As Boolean) As VMTree
	options.Put("dragAndDrop", dragAndDrop)
	Return Me
End Sub

Sub SetHasChildrenField(hasChildrenField As String) As VMTree
	options.Put("hasChildrenField", hasChildrenField)
	Return Me
End Sub

Sub SetIconsLibrary(sIconsLibrary As String) As VMTree
	IconsLibrary = sIconsLibrary
	options.Put("iconsLibrary", IconsLibrary)
	Select Case IconsLibrary
	Case "materialicons"
		ExpandIcon = $"<i class="material-icons">keyboard_arrow_right</i>"$
		CollapseIcon = $"<i class="material-icons">keyboard_arrow_down</i>"$
	Case "fontawesome"
		ExpandIcon = $"<i class="fa fa-chevron-right"></i>"$
		CollapseIcon = $"<i class="fa fa-chevron-down"></i>"$
	End Select
	Return Me
End Sub

Sub SetImageCssClassField(imageCssClassField As String) As VMTree
	options.Put("imageCssClassField", imageCssClassField)
	Return Me
End Sub

Sub SetImageHtmlField(sImageHtmlField As String) As VMTree
	ImageHtmlField = sImageHtmlField
	options.Put("imageHtmlField", ImageHtmlField)
	Return Me
End Sub

Sub SetImageUrlField(sImageUrlField As String) As VMTree
	ImageUrlField = sImageUrlField
	options.Put("imageUrlField", ImageUrlField)
	Return Me
End Sub

Sub SetLazyLoading(lazyLoading As Boolean) As VMTree
	options.Put("lazyLoading", lazyLoading)
	Return Me
End Sub

Sub SetPrimaryKey(primaryKey As String) As VMTree
	options.Put("primaryKey", primaryKey)
	Return Me
End Sub

Sub SetSelectionType(selectionType As String) As VMTree
	options.Put("selectionType", selectionType)
	Return Me
End Sub

Sub SetTextField(textField As String) As VMTree
	options.Put("textField", textField)
	Return Me
End Sub

Sub SetUiLibrary(uiLibrary As String) As VMTree
	options.Put("uiLibrary", uiLibrary)
	Return Me
End Sub


'get component
Sub ToString As String
	Dim icn As Map
	icn.Initialize
	icn.Put("expand", ExpandIcon)
	icn.Put("collapse", CollapseIcon)
	options.Put("icons", icn)
	Return Tree.ToString
End Sub

Sub SetVModel(k As String) As VMTree
	Tree.SetVModel(k)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTree
	Tree.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTree
	Tree.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTree
	Tree.SetStyle(sm)
	Return Me
End Sub

'set padding
Sub SetPadding(p As Object) As VMTree
	Tree.SetPaddingAll(p)
	Return Me
End Sub

'destroy the tree
Sub Destroy
	treeBO.runmethod("destroy",Null)
End Sub

'set the options for the tree
Sub Refresh
	If treeBO <> Null Then Destroy
	'initialize jquery
	treeBO = JQ.Selector($"#${ID}"$).RunMethod("tree", Array(options))
	'
	Dim e, node, record, sID, state As Map  'ignore
	'Dim parentId, orderNumber As Map
	'Tree.RunMethod("bind", Array("checkboxChange", BANano.Callback(mCallBack, mEventName & "_checkboxchange", Array(e, node, record, state))))
	treeBO.RunMethod("bind", Array("select", BANano.Callback(eventHandler, ID & "_select", Array(e, node, sID))))
	''tree.RunMethod("bind", Array("unselect", Banano.Callback(mCallBack, mEventName & "_select", Array(e, node, id))))
	'Tree.RunMethod("bind", Array("nodeDrop", BANano.Callback(mCallBack, mEventName & "_nodedrop", Array(e, ID, parentId, orderNumber))))
	'Tree.RunMethod("bind", Array("nodeDataBound", BANano.Callback(mCallBack, mEventName & "_nodedatabound", Array(e, node, ID, record))))
End Sub

'add node
Sub AddNode(parentID As String, pk As String, Text As String, ImgURL As String, Icon As String, Tag As Map)
	If treeBO = Null Then Refresh
	'define the node to add
	Dim nod As Map = CreateMap("id":pk,"text":Text)
	'if the png is specified
	If ImgURL <> "" Then
		nod.Put(ImageUrlField, ImgURL)
	End If
	'if icon is specified
	If Icon <> "" Then
		Dim sIcon As String = ""
		Select Case IconsLibrary
			Case "materialicons"
				sIcon = $"<i class="material-icons">${Icon}</i>"$
			Case "fontawesome"
				sIcon = $"<i class="${Icon}"></i>"$
		End Select
		nod.Put(ImageHtmlField, sIcon)
	End If
	'the node as details
	If Tag <> Null Then
		For Each strKey As String In Tag.Keys
			Dim strVal As Object = Tag.Get(strKey)
			nod.Put(strKey,strVal)
		Next
	End If
	If parentID = "" Then
		treeBO.RunMethod("addNode",Array(nod))
	Else
		Dim prnt As BANanoObject = GetNodeById(parentID)
		If prnt <> Null Then
			treeBO.RunMethod("addNode",Array(nod,prnt))
		End If
	End If
End Sub

'get data by id
Sub GetDataById(pk As String) As Map
	Return treeBO.RunMethod("getDataById", Array(pk))
End Sub

'get node by id
Sub GetNodeById(pk As String) As BANanoObject
	Dim bo As BANanoObject = treeBO.RunMethod("getNodeById", Array(pk))
	Return bo
End Sub

'get node by text
Sub GetNodeByText(pk As String) As BANanoObject
	Dim bo As BANanoObject = treeBO.RunMethod("getNodeByText", Array(pk))
	Return bo
End Sub

'get data by text
Sub GetDataByText(nodeText As String) As BANanoObject
	Return treeBO.RunMethod("getDataByText", Array(nodeText))
End Sub

'set text of node
Sub SetText(pk As String, Text As String)
	Dim nod As BANanoObject = GetDataById(pk)
	If nod <> Null Then
		nod.SetField("text", Text)
		treeBO.RunMethod("updateNode", Array(pk, nod))
	End If
End Sub

'set icon of node
Sub SetIcon(pk As String, Icon As String)
	Dim nod As BANanoObject = GetDataById(pk)
	If nod <> Null Then
		Dim sIcon As String = ""
		Select Case IconsLibrary
			Case "materialicons"
				sIcon = $"<i class="material-icons">${Icon}</i>"$
			Case "fontawesome"
				sIcon = $"<i class="${Icon}"></i>"$
		End Select
		nod.SetField(ImageHtmlField, sIcon)
		treeBO.RunMethod("updateNode", Array(pk, nod))
	End If
End Sub

'set image of node
Sub SetImage(pk As String, ImageURL As String)
	Dim nod As BANanoObject = GetDataById(pk)
	If nod <> Null Then
		nod.SetField(ImageUrlField, ImageURL)
		treeBO.RunMethod("updateNode", Array(pk, nod))
	End If
End Sub

'set data for Node
Sub SetData(pk As String, Tag As Map)
	Dim nod As BANanoObject = GetDataById(pk)
	If nod <> Null Then
		If Tag <> Null Then
			For Each strKey As String In Tag.Keys
				Dim strVal As Object = Tag.Get(strKey)
				nod.SetField(strKey, strVal)
			Next
		End If
		treeBO.RunMethod("updateNode", Array(pk, nod))
	End If
End Sub

'update node
Sub UpdateNode(pk As String, Text As String, ImgURL As String, Icon As String, Tag As Map)
	Dim nod As BANanoObject = GetDataById(pk)
	If nod <> Null Then
		nod.SetField("text", Text)
		If Tag <> Null Then
			For Each strKey As String In Tag.Keys
				Dim strVal As Object = Tag.Get(strKey)
				nod.SetField(strKey, strVal)
			Next
		End If
		Dim sIcon As String = ""
		Select Case IconsLibrary
			Case "materialicons"
				sIcon = $"<i class="material-icons">${Icon}</i>"$
			Case "fontawesome"
				sIcon = $"<i class="${Icon}"></i>"$
		End Select
		If ImgURL.Length > 0 Then nod.SetField(ImageUrlField, sIcon)
		If Icon.Length > 0 Then nod.SetField(ImageHtmlField, ImgURL)
		treeBO.RunMethod("updateNode", Array(pk, nod))
	End If
End Sub

'get children
Sub GetChildren(pk As String) As List
	Return treeBO.RunMethod("getChildren", Array(GetNodeById(pk)))
End Sub

'get checkedNodes
Sub GetCheckedNodes() As List
	Dim snodes As List
	snodes.Initialize
	snodes = treeBO.RunMethod("getCheckedNodes","")
	Return snodes
End Sub

'get selected nodes
Sub GetSelections() As List
	Return treeBO.RunMethod("getSelections","")
End Sub

'get all ids
Sub GetAll() As String
	Dim bo As BANanoObject = treeBO.RunMethod("getAll","")
	Return BANano.ToJson(bo.Result)
End Sub

'remove a node
Sub RemoveNode(pk As String)
	Try
		treeBO.RunMethod("removeNode", GetNodeById(pk))
	Catch
		Log("Error removing node")
	End Try
End Sub

'check a node
Sub Check(pk As String)
	treeBO.RunMethod("check", Array(GetNodeById(pk)))
End Sub

'uncheck a node
Sub UnCheck(pk As String)
	treeBO.RunMethod("uncheck", Array(GetNodeById(pk)))
End Sub

'select a node
Sub SelectNode(pk As String)
	UnSelectAll
	Dim rec As BANanoObject = GetNodeById(pk)
	treeBO.RunMethod("select", Array(rec))
End Sub

'unselect a node
Sub UnSelectNode(pk As String)
	treeBO.RunMethod("unselect", Array(GetNodeById(pk)))
End Sub

'ExpandAll nodes
Sub ExpandAll()
	treeBO.RunMethod("expandAll", "")
End Sub

Sub Clear
	SetDataSource(Array())
	Refresh
End Sub

'reload tree view
Sub Reload()
	treeBO.RunMethod("reload", "")
End Sub

'collapse all nodes
Sub CollapseAll()
	treeBO.RunMethod("collapseAll", "")
End Sub

'checkAll nodes
Sub CheckAll()
	treeBO.RunMethod("checkAll", "")
End Sub

'UncheckAll nodes
Sub UnCheckAll()
	treeBO.RunMethod("uncheckAll", "")
End Sub


'Expand a node
Sub Expand(pk As String)
	treeBO.RunMethod("expand", Array(GetNodeById(pk)))
End Sub

'collapse a node
Sub Collapse(pk As String)
	treeBO.RunMethod("collapse", Array(GetNodeById(pk)))
End Sub

'enable a node
Sub Enable(pk As String)
	treeBO.RunMethod("enable", Array(GetNodeById(pk)))
End Sub

'disable a node
Sub Disable(pk As String)
	treeBO.RunMethod("disable", Array(GetNodeById(pk)))
End Sub

'remove children
Sub RemoveChildren(parentID As String)
	'get all children
	Dim children As List = GetChildren(parentID)
	Dim tChild As Int = children.Size - 1
	Dim cChild As Int
	For cChild = tChild To 0 Step -1
		Dim strChild As String = children.Get(cChild)
		RemoveNode(strChild)
	Next
End Sub

'get the data
Sub GetData(pk As String) As Map
	Dim bo As BANanoObject = GetDataById(pk)
	Dim dm As Map = bo.Result
	Return dm
End Sub

'un-select all records
Sub UnSelectAll
	treeBO.RunMethod("unselectAll", Null)
End Sub

