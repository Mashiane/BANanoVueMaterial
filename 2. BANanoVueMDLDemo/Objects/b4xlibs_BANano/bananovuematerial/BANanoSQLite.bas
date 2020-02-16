B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public const DB_VARCHAR_20 As String = "VARCHAR(20)"
	Public const DB_VARCHAR_10 As String = "VARCHAR(10)"
	Public const DB_VARCHAR_30 As String = "VARCHAR(30)"
	Public const DB_VARCHAR_40 As String = "VARCHAR(40)"
	Public const DB_VARCHAR_50 As String = "VARCHAR(50)"
	Public const DB_VARCHAR_100 As String = "VARCHAR(100)"
	Public const DB_VARCHAR_255 As String = "VARCHAR(255)"
	Public const DB_STRING As String = "TEXT"
	Public const DB_INT As String = "INT"
	Public const DB_FLOAT As String = "FLOAT"
	Public const DB_BLOB As String = "BLOB"
	Public const DB_BOOL As String = "BOOL"
	Public const DB_REAL As String = "REAL"
	Public const DB_DATE As String = "DATE"
	Public const DB_INTEGER As String = "INTEGER"
	Public const DB_TEXT As String = "TEXT"
	Private recType As Map
	Type SQLiteResultSet(result As List, command As String, types As List, args As List, query As String, _
	response As String, error As String, affectedRows As Long, json As String)
	Private BANano As BANano  'ignore
	Private dbName As String
	Public MethodName As String
	Private schema As Map
	Private OK As Boolean
End Sub

Sub Update(tblName As String, priKey As String, priValue As String, tblfields As Map) As SQLiteResultSet
	Dim tblWhere As Map = CreateMap()
	tblWhere.Put(priKey, priValue)
	Return UpdateWhere(tblName, tblfields, tblWhere, Null)
End Sub

'initialize the class, a field named "id" is assumed to be an integer
Public Sub Initialize As BANanoSQLite
	recType.Initialize
	MethodName = "BANanoSQLite"
	schema.Initialize
	OK = False 
	Return Me
End Sub

Sub SetDB(db As String) As BANanoSQLite
	dbName = db
	Return Me
End Sub


'prepare for new table definition
Sub SchemaClear As BANanoSQLite
	schema.clear
	Return Me
End Sub


Sub JSONToResultSet(rs As SQLiteResultSet)
	OK = False
	Dim m As Map = BANano.FromJson(rs.json)
	rs.response = m.Get("response")
	rs.error = m.Get("error")
	rs.result = m.Get("result")
	rs.affectedRows = m.Get("affectedRows")
	If rs.response = "Success" And rs.affectedRows >= 1 Then
		OK = True
	End If
End Sub

'schema add boolean
Sub SchemaAddBoolean(bools As List) As BANanoSQLite
	For Each b As String In bools
		schema.Put(b, DB_BOOL)
	Next
	Return Me
End Sub
'
Sub SchemaAddInt(bools As List) As BANanoSQLite
	For Each b As String In bools
		schema.Put(b, DB_INT)
	Next
	Return Me
End Sub

Sub SchemaAddFloat(bools As List) As BANanoSQLite
	For Each b As String In bools
		schema.Put(b, DB_FLOAT)
	Next
	Return Me
End Sub

Sub SchemaAddBlob(bools As List) As BANanoSQLite
	For Each b As String In bools
		schema.Put(b, DB_BLOB)
	Next
	Return Me
End Sub

Sub SchemaAddText(bools As List) As BANanoSQLite
	For Each b As String In bools
		schema.Put(b, DB_TEXT)
	Next
	Return Me
End Sub


Sub SchemaCreateTable(tblName As String, PK As String, Auto As String) As SQLiteResultSet
	Return CreateTable(tblName, schema, PK, Auto)
End Sub

Sub SchemaAddDate(bools As List) As BANanoSQLite
	For Each b As String In bools
		schema.Put(b, DB_DATE)
	Next
	Return Me
End Sub

Sub ResetTypes As BANanoSQLite
	recType.Initialize
	Return Me
End Sub

'query table structure
Sub Pragma(tblName As String) As SQLiteResultSet
	Dim sb As String = $"PRAGMA table_info('${tblName}')"$
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb
	gr.args = Null
	gr.command = "pragma"
	gr.types = Null
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'query table foreign keys
Sub ForeignKeys(tblName As String) As SQLiteResultSet
	Dim sb As String = $"PRAGMA foreign_key_list('${tblName}')"$
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb
	gr.args = Null
	gr.command = "foreignkeys"
	gr.types = Null
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'query table structure
Sub TableNames() As SQLiteResultSet
	Dim sb As String = $"SELECT name FROM sqlite_master WHERE type ='table' AND name NOT LIKE 'sqlite_%'"$
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb
	gr.args = Null
	gr.command = "tables"
	gr.types = Null
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'return a sql to delete record of table where one exists
Sub DeleteAll(tblName As String) As SQLiteResultSet
	Dim sb As String = $"DELETE FROM ${EscapeField(tblName)}"$
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb
	gr.args = Null
	gr.command = "delete"
	gr.types = Null
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'return a sql to delete record of table where one exists
Sub GetMax(tblName As String, fldName As String) As SQLiteResultSet
	Dim sb As String = $"SELECT MAX(${fldName}) As ${fldName} FROM ${EscapeField(tblName)}"$
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb
	gr.args = Null
	gr.command = "getmax"
	gr.types = Null
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'convert a map to a json string
Sub Map2Json(mp As Map) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize(mp)
	Return JSON.ToString
End Sub

'convert a list to json
Sub List2Json(mp As List) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize2(mp)
	Return JSON.ToString
End Sub


'convert a json string to a map
Sub Json2Map(strJSON As String) As Map
	Dim json As BANanoJSONParser
	Dim Map1 As Map
	Map1.Initialize
	Map1.clear
	Try
		If strJSON.length > 0 Then
			json.Initialize(strJSON)
			Map1 = json.NextObject
		End If
		Return Map1
	Catch
		Return Map1
	End Try
End Sub

' convert a json string to a list
Sub Json2List(strValue As String) As List
	Dim lst As List
	lst.Initialize
	lst.clear
	If strValue.Length = 0 Then
		Return lst
	End If
	Try
		Dim parser As BANanoJSONParser
		parser.Initialize(strValue)
		Return parser.NextArray
	Catch
		Return lst
	End Try
End Sub

'return a sql to update all records of table
Sub UpdateAll(tblName As String, tblFields As Map, operators As List) As SQLiteResultSet
	If operators = Null Then operators = EQOperators(tblFields)
	Dim listOfTypes As List = GetMapTypes(tblFields)
	Dim args As List = GetMapValues(tblFields)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"UPDATE ${EscapeField(tblName)} SET "$)
	Dim i As Int
	Dim iTot As Int = tblFields.Size - 1
	For i = 0 To iTot
		Dim col As String = tblFields.GetKeyAt(i)
		Dim oper As String = operators.Get(i)
		sb.Append(col)
		If i <> iTot Then
			sb.Append(" = ?,")
		Else
			sb.Append($" ${oper} ?"$)
		End If
	Next
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb.tostring
	gr.args = args
	gr.command = "update"
	gr.types = listOfTypes
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'read by a field
Sub Read(tblName As String, primaryKey As String, primaryValue As String) As SQLiteResultSet
	Dim qw As Map = CreateMap()
	qw.Put(primaryKey, primaryValue)
	Dim gr As SQLiteResultSet = SelectWhere(tblName, Array("*"), qw, Null, Array(primaryKey))
	Return gr
End Sub

Sub Delete(tblName As String, primaryKey As String, primaryValue As String) As SQLiteResultSet
	Dim qw As Map = CreateMap()
	qw.Put(primaryKey, primaryValue)
	Dim qry As SQLiteResultSet = DeleteWhere(tblName, qw, Array("="))
	Return qry
End Sub


'exists
Sub Exists(tblName As String, primaryKey As String, primaryValue As String) As SQLiteResultSet
	Dim qw As Map = CreateMap()
	qw.Put(primaryKey, primaryValue)
	Dim gr As SQLiteResultSet = SelectWhere(tblName, Array(primaryKey), qw, Null, Array(primaryKey))
	Return gr
End Sub

'return a sql to select record of table where one exists
Sub SelectWhere(tblName As String, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As SQLiteResultSet
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(tblWhere)
	Dim listOfValues As List = GetMapValues(tblWhere)
	'are we selecting all fields or just some
	Dim fld1 As String = tblfields.Get(0)
	Dim selFIelds As String = ""
	Select Case fld1
		Case "*"
			selFIelds = "*"
		Case Else
			selFIelds = JoinFields(",", tblfields)
	End Select
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(tblName)} WHERE "$)
	Dim i As Int
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		Dim oper As String = operators.Get(i)
		sb.Append(col)
		sb.Append($" ${oper} ?"$)
	Next
	If orderBy <> Null Then
		'order by
		Dim stro As String = JoinFields(",", orderBy)
		If stro.Length > 0 Then
			sb.Append(" ORDER BY ").Append(stro)
		End If
	End If
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb.tostring
	gr.args = listOfValues
	gr.command = "select"
	gr.types = listOfTypes
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub


Sub EQOperators(sm As Map) As List
	Dim nl As List
	nl.initialize
	For Each k As String In sm.Keys
		nl.Add("=")
	Next
	Return nl
End Sub


'return a sql to update records of table where one exists
Sub UpdateWhere(tblName As String, tblfields As Map, tblWhere As Map, operators As List) As SQLiteResultSet
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(tblfields)
	Dim listOfTypes1 As List = GetMapTypes(tblWhere)
	listOfTypes.AddAll(listOfTypes1)
	Dim listOfValues As List = GetMapValues(tblfields)
	Dim listOfValues1 As List = GetMapValues(tblWhere)
	listOfValues.AddAll(listOfValues1)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"UPDATE ${EscapeField(tblName)} SET "$)
	Dim i As Int
	Dim iTot As Int = tblfields.Size - 1
	For i = 0 To iTot
		Dim col As String = tblfields.GetKeyAt(i)
		sb.Append(EscapeField(col))
		If i <> iTot Then
			sb.Append("= ?,")
		Else
			sb.Append("= ?")
		End If
	Next
	sb.Append($" WHERE "$)
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(EscapeField(col))
		Dim opr As String = operators.Get(i)
		sb.Append($" ${opr} ?"$)
	Next
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb.tostring
	gr.args = listOfValues
	gr.command = "update"
	gr.types = listOfTypes
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'get the list of types
private Sub GetMapTypes(sourceMap As Map) As List
	Dim listOfTypes As List
	listOfTypes.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim col As String = sourceMap.GetKeyAt(iCnt)
		Dim colType As String = recType.GetDefault(col,"STRING")
		Select Case colType
			Case "VARCHAR(20)", "VARCHAR(10)", "VARCHAR(30)", "VARCHAR(40)"
				listOfTypes.add("s")
			Case "VARCHAR(50)", "VARCHAR(100)", "VARCHAR(255)"
				listOfTypes.add("s")
			Case "STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR"
				listOfTypes.add("s")
			Case "INTEGER", "INT", "BOOL","BOOLEAN"
				listOfTypes.add("i")
			Case "BLOB"
				listOfTypes.add("b")
			Case "REAL","FLOAT","DOUBLE"
				listOfTypes.add("d")
			Case Else
				listOfTypes.add("s")
		End Select
	Next
	Return listOfTypes
End Sub

'get map values
private Sub GetMapValues(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As String = sourceMap.GetValueAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub

'get map keys
private Sub GetMapKeys(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As String = sourceMap.GetKeyAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub

'specify strings field types, this is default for all strings
Sub AddStrings(fieldNames As List) As BANanoSQLite
	For Each strfld As String In fieldNames
		recType.Put(strfld,"STRING")
	Next
	Return Me
End Sub

'specify integer field types
Sub AddIntegers(fieldNames As List) As BANanoSQLite
	For Each strfld As String In fieldNames
		recType.Put(strfld,"INT")
	Next
	Return Me
End Sub

'specify double field types
Sub AddDoubles(fieldNames As List) As BANanoSQLite
	For Each strfld As String In fieldNames
		recType.Put(strfld,"DOUBLE")
	Next
	Return Me
End Sub

'specify boolean field types
Sub AddBooleans(fieldNames As List) As BANanoSQLite
	For Each strfld As String In fieldNames
		recType.Put(strfld,"BOOL")
	Next
	Return Me
End Sub

'specify blobs field types
Sub AddBlobs(fieldNames As List) As BANanoSQLite
	For Each strfld As String In fieldNames
		recType.Put(strfld,"BLOB")
	Next
	Return Me
End Sub


'return sql command to drop a table
public Sub DropTable(tblName As String) As SQLiteResultSet
	'define the qry to execute
	Dim query As String = "DROP TABLE " & EscapeField(tblName)
	Dim m As SQLiteResultSet
	m.Initialize
	m.query = query
	m.args = Null
	m.types = Null
	m.response = ""
	m.error = ""
	m.command = "droptable"
	m.result = Array()
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub

Private Sub EscapeField(f As String) As String
	Return $"[${f}]"$
End Sub

'return a sql command to create the table
public Sub CreateTable(tblName As String, tblFields As Map, PK As String, Auto As String) As SQLiteResultSet
	Dim fldName As String
	Dim fldType As String
	Dim fldTot As Int
	Dim fldCnt As Int
	fldTot = tblFields.Size - 1
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("(")
	For fldCnt = 0 To fldTot
		fldName = tblFields.GetKeyAt(fldCnt)
		fldType = tblFields.Get(fldName)
		fldType = fldType.Replace("STRING", "TEXT")
		If fldCnt > 0 Then
			sb.Append(", ")
		End If
		sb.Append(EscapeField(fldName))
		sb.Append(" ")
		sb.Append(fldType)
		Select Case fldType
			Case "STRING", "TEXT"
				sb.Append(" COLLATE NOCASE")
		End Select
		If fldName.EqualsIgnoreCase(PK) Then
			sb.Append(" PRIMARY KEY")
		End If
		If fldName.EqualsIgnoreCase(Auto) Then
			sb.Append(" AUTOINCREMENT")
		End If
	Next
	sb.Append(")")
	'define the qry to execute
	Dim query As String = "CREATE TABLE IF NOT EXISTS " & EscapeField(tblName) & " " & sb.ToString
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = query
	gr.args = Null
	gr.command = "createtable"
	gr.types = Null
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'return a sql insert statement
Sub Insert(tblName As String, tblFields As Map) As SQLiteResultSet
	Dim sb As StringBuilder
	Dim columns As StringBuilder
	Dim values As StringBuilder
	Dim listOfValues As List = GetMapValues(tblFields)
	Dim listOfTypes As List = GetMapTypes(tblFields)
	Dim iCnt As Int
	Dim iTot As Int
	sb.Initialize
	columns.Initialize
	values.Initialize
	sb.Append($"INSERT INTO ${EscapeField(tblName)} ("$)
	iTot = tblFields.Size - 1
	For iCnt = 0 To iTot
		Dim col As String = tblFields.GetKeyAt(iCnt)
		If iCnt > 0 Then
			columns.Append(", ")
			values.Append(", ")
		End If
		columns.Append(EscapeField(col))
		values.Append("?")
	Next
	sb.Append(columns.ToString)
	sb.Append(") VALUES (")
	sb.Append(values.ToString)
	sb.Append(")")
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb.tostring
	gr.args = listOfValues
	gr.command = "insert"
	gr.types = listOfTypes
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	Return gr
End Sub

'return a sql insert statement
Sub InsertReplace(tblName As String, tblFields As Map) As SQLiteResultSet
	Dim sb As StringBuilder
	Dim columns As StringBuilder
	Dim values As StringBuilder
	Dim listOfValues As List = GetMapValues(tblFields)
	Dim listOfTypes As List = GetMapTypes(tblFields)
	Dim iCnt As Int
	Dim iTot As Int
	sb.Initialize
	columns.Initialize
	values.Initialize
	sb.Append($"REPLACE INTO ${EscapeField(tblName)} ("$)
	iTot = tblFields.Size - 1
	For iCnt = 0 To iTot
		Dim col As String = tblFields.GetKeyAt(iCnt)
		If iCnt > 0 Then
			columns.Append(", ")
			values.Append(", ")
		End If
		columns.Append(EscapeField(col))
		values.Append("?")
	Next
	sb.Append(columns.ToString)
	sb.Append(") VALUES (")
	sb.Append(values.ToString)
	sb.Append(")")
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb.tostring
	gr.args = listOfValues
	gr.command = "replace"
	gr.types = listOfTypes
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	
	Return gr
End Sub

'join list to multi value string
private Sub JoinFields(delimiter As String, lst As List) As String
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	fld = EscapeField(fld)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		fld = EscapeField(fld)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub


'return a sql to select record of table where one exists
Sub SelectAll(tblName As String, tblfields As List, orderBy As List) As SQLiteResultSet
	'are we selecting all fields or just some
	Dim fld1 As String = tblfields.Get(0)
	Dim selFIelds As String = ""
	Select Case fld1
		Case "*"
			selFIelds = "*"
		Case Else
			selFIelds = JoinFields(",", tblfields)
	End Select
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(tblName)}"$)
	If orderBy <> Null Then
		'order by
		Dim stro As String = JoinFields(",", orderBy)
		If stro.Length > 0 Then
			sb.Append(" ORDER BY ").Append(stro)
		End If
	End If
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb.tostring
	gr.args = Null
	gr.command = "select"
	gr.types = Null
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	
	Return gr
End Sub

'return a sql to delete record of table where one exists
Sub DeleteWhere(tblName As String, tblWhere As Map, operators As List) As SQLiteResultSet
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(tblWhere)
	Dim listOfValues As List = GetMapValues(tblWhere)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"DELETE FROM ${EscapeField(tblName)} WHERE "$)
	Dim i As Int
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(col)
		Dim opr As String = operators.Get(i)
		sb.Append($" ${opr} ?"$)
	Next
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = sb.tostring
	gr.args = listOfValues
	gr.command = "delete"
	gr.types = listOfTypes
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0
	
	Return gr
End Sub

Sub Execute(strSQL As String) As SQLiteResultSet
	Dim gr As SQLiteResultSet
	gr.Initialize
	gr.query = strSQL
	gr.args = Null
	gr.command = "execute"
	gr.types = Null
	gr.response = ""
	gr.error = ""
	gr.result = Array()
	gr.json = ""
	gr.affectedRows = 0	
	Return gr
End Sub

Sub Build(rslt As SQLiteResultSet) As Map
	Dim b As Map = CreateMap()
	If dbName = "" Then
		Log("BANanoSQLite.Build: The database name has not been set!")
		Return b
	End If
	b.Put("dbname", dbName)
	b.Put("command", rslt.command)
	b.Put("query", rslt.query)
	b.Put("args", rslt.args)
	b.Put("types", rslt.types)
	Return b
End Sub


Sub GetNextID(fld As String, rsl As List) As String
	Dim nextid As Int
	Dim strid As String
	
	If rsl.Size = 0 Then
		nextid = 0
	Else
		Dim nr As Map = rsl.Get(0)
		Dim ni As String = nr.Getdefault(fld,"0")
		nextid = BANano.parseInt(ni)
	End If
	nextid = nextid + 1
	strid = CStr(nextid)
	Return strid
End Sub


Sub CStr(o As Object) As String
	Return "" & o
End Sub


#if PHP
function preparesqlite1($db, $sql, $types, $values) {
		/* Bind parameters. Types: s = string, i = integer, d = double,  b = blob */
		$stmt = $db->prepare($sql);
		if(is_array($types)){
			$n = count($types);
			for($i = 0; $i < $n; $i++) {
				$param_type = $types[$i];
				$param_value = $values[$i];
				$loc = $i + 1;
				switch($param_type){
					case "s":
						$stmt->bindValue($loc, $param_value, SQLITE3_TEXT);
						break;
					case "i":
						$stmt->bindValue($loc, $param_value, SQLITE3_INTEGER);
						break;
					case "d":
						$stmt->bindValue($loc, $param_value, SQLITE3_FLOAT);
						break;
					case "b":
						$stmt->bindValue($loc, $param_value, SQLITE3_BLOB);
						break;
				}
			}
		}
		return $stmt;
}

function BANanoSQLite($dbname,$command,$query,$args,$types) {
	$db;
	$resp = array();
	header('Access-Control-Allow-Origin: *');
   	//set the header
	header('content-type: application/json; charset=utf-8');
   	$db = new SQLite3($dbname, SQLITE3_OPEN_CREATE | SQLITE3_OPEN_READWRITE);
	if(!$db) {
  		$response = $db->lastErrorMsg();
		$resp['response'] = "Error";
		$resp['error'] = $response;
		$resp['result'] = array();
		$output = json_encode($resp);
		die($output);
	}
	$commands = array('delete', 'update', 'replace', 'insert', 'createtable','droptable');
	if(in_array($command,$commands)) {
    	$command = 'changes';
	}
	switch($command){
		case "changes":
			//build the prepared statement
			$stmt = preparesqlite1($db, $query, $types, $args);
			
			if (!($res = $stmt->execute())) {
				$response = $stmt->error;
        		$resp['response'] = "Error";
				$resp['error'] = $response;
				$resp['result'] = array();
				$output = json_encode($resp);
	        	die($output);
			}
			
			$changes = $db->changes();
			$res->finalize();
			$resp['response'] = "Success";
			$resp['error'] = '';
			$resp['result'] = array();
			$resp['affectedRows'] = $changes;
			$output = json_encode($resp);
			break;
	   	default:
		    $stmt = preparesqlite1($db, $query, $types, $args);
			
			if (!($res = $stmt->execute())) {
				$response = $stmt->error;
        		$resp['response'] = "Error";
				$resp['error'] = $response;
				$resp['result'] = array();
				$output = json_encode($resp);
	        	die($output);
			}
			
			$changes = $db->changes();
	    	$rows = array();
    	    while($row = $res->fetchArray(1)) {
			    $rows[] = $row;
        	}
			$res->finalize();
    		$resp['response'] = "Success";
			$resp['error'] = '';
			$resp['result'] = $rows;
			$resp['affectedRows'] = $changes;
			$output = json_encode($resp);
        	break;
	}
	echo ($output);
	$stmt->close();
	$db->close();
}
#End If