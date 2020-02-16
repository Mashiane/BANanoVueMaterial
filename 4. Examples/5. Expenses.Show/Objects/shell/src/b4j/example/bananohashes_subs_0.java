package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bananohashes_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public const HASH_MD5 As String = \"MD5\"";
bananohashes._hash_md5 = BA.ObjectToString("MD5");__ref.setField("_hash_md5",bananohashes._hash_md5);
 //BA.debugLineNum = 4;BA.debugLine="Public const HASH_SHA1 As String = \"SHA1\"";
bananohashes._hash_sha1 = BA.ObjectToString("SHA1");__ref.setField("_hash_sha1",bananohashes._hash_sha1);
 //BA.debugLineNum = 5;BA.debugLine="Public const HASH_SHA256 As String = \"SHA256\"";
bananohashes._hash_sha256 = BA.ObjectToString("SHA256");__ref.setField("_hash_sha256",bananohashes._hash_sha256);
 //BA.debugLineNum = 6;BA.debugLine="Public const HASH_SHA512 As String = \"SHA512\"";
bananohashes._hash_sha512 = BA.ObjectToString("SHA512");__ref.setField("_hash_sha512",bananohashes._hash_sha512);
 //BA.debugLineNum = 7;BA.debugLine="Public const HASH_RMD160 As String = \"RMD160\"";
bananohashes._hash_rmd160 = BA.ObjectToString("RMD160");__ref.setField("_hash_rmd160",bananohashes._hash_rmd160);
 //BA.debugLineNum = 8;BA.debugLine="Public const ALG_HEX As String = \"hex\"";
bananohashes._alg_hex = BA.ObjectToString("hex");__ref.setField("_alg_hex",bananohashes._alg_hex);
 //BA.debugLineNum = 9;BA.debugLine="Public const ALG_B64 As String = \"b64\"";
bananohashes._alg_b64 = BA.ObjectToString("b64");__ref.setField("_alg_b64",bananohashes._alg_b64);
 //BA.debugLineNum = 10;BA.debugLine="Public const ALG_HEX_HMAC As String = \"hex_hmac\"";
bananohashes._alg_hex_hmac = BA.ObjectToString("hex_hmac");__ref.setField("_alg_hex_hmac",bananohashes._alg_hex_hmac);
 //BA.debugLineNum = 11;BA.debugLine="Public const ALG_b64_HMAC As String = \"b64_hmac\"";
bananohashes._alg_b64_hmac = BA.ObjectToString("b64_hmac");__ref.setField("_alg_b64_hmac",bananohashes._alg_b64_hmac);
 //BA.debugLineNum = 12;BA.debugLine="Private sinput As String";
bananohashes._sinput = RemoteObject.createImmutable("");__ref.setField("_sinput",bananohashes._sinput);
 //BA.debugLineNum = 13;BA.debugLine="Private skey As String";
bananohashes._skey = RemoteObject.createImmutable("");__ref.setField("_skey",bananohashes._skey);
 //BA.debugLineNum = 14;BA.debugLine="Private BANano As BANano  'ignore";
bananohashes._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananohashes._banano);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _generatesalt(RemoteObject __ref,RemoteObject _rounds) throws Exception{
try {
		Debug.PushSubsStack("GenerateSalt (bananohashes) ","bananohashes",8,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("generatesalt")) { return __ref.runUserSub(false, "bananohashes","generatesalt", __ref, _rounds);}
RemoteObject _salt = RemoteObject.createImmutable("");
Debug.locals.put("rounds", _rounds);
 BA.debugLineNum = 26;BA.debugLine="Sub GenerateSalt(rounds As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="Dim salt As String = BANano.RunJavascriptMethod(\"";
Debug.JustUpdateDeviceLine();
_salt = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunJavascriptMethod",(Object)(BA.ObjectToString("gensalt")),(Object)(bananohashes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_rounds)}))))));Debug.locals.put("salt", _salt);Debug.locals.put("salt", _salt);
 BA.debugLineNum = 28;BA.debugLine="Return salt";
Debug.JustUpdateDeviceLine();
if (true) return _salt;
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hash(RemoteObject __ref,RemoteObject _hashtype,RemoteObject _algorithm) throws Exception{
try {
		Debug.PushSubsStack("Hash (bananohashes) ","bananohashes",8,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("hash")) { return __ref.runUserSub(false, "bananohashes","hash", __ref, _hashtype, _algorithm);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("hashType", _hashtype);
Debug.locals.put("algorithm", _algorithm);
 BA.debugLineNum = 31;BA.debugLine="Sub Hash(hashType As String, algorithm As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Dim bo As BANanoObject";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("bo", _bo);
 BA.debugLineNum = 33;BA.debugLine="Dim res As String";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 34;BA.debugLine="Select Case hashType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_hashtype,__ref.getField(true,"_hash_md5" /*RemoteObject*/ ),__ref.getField(true,"_hash_sha1" /*RemoteObject*/ ),__ref.getField(true,"_hash_sha256" /*RemoteObject*/ ),__ref.getField(true,"_hash_sha512" /*RemoteObject*/ ),__ref.getField(true,"_hash_rmd160" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 36;BA.debugLine="bo.Initialize2(\"Hashes.MD5\",Null)";
Debug.JustUpdateDeviceLine();
_bo.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Hashes.MD5")),(Object)(bananohashes.__c.getField(false,"Null")));
 break; }
case 1: {
 BA.debugLineNum = 38;BA.debugLine="bo.Initialize2(\"Hashes.SHA1\",Null)";
Debug.JustUpdateDeviceLine();
_bo.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Hashes.SHA1")),(Object)(bananohashes.__c.getField(false,"Null")));
 break; }
case 2: {
 BA.debugLineNum = 40;BA.debugLine="bo.Initialize2(\"Hashes.SHA256\",Null)";
Debug.JustUpdateDeviceLine();
_bo.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Hashes.SHA256")),(Object)(bananohashes.__c.getField(false,"Null")));
 break; }
case 3: {
 BA.debugLineNum = 42;BA.debugLine="bo.Initialize2(\"Hashes.SHA512\",Null)";
Debug.JustUpdateDeviceLine();
_bo.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Hashes.SHA512")),(Object)(bananohashes.__c.getField(false,"Null")));
 break; }
case 4: {
 BA.debugLineNum = 44;BA.debugLine="bo.Initialize2(\"Hashes.RMD160\",Null)";
Debug.JustUpdateDeviceLine();
_bo.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Hashes.RMD160")),(Object)(bananohashes.__c.getField(false,"Null")));
 break; }
}
;
 BA.debugLineNum = 47;BA.debugLine="Select Case algorithm";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_algorithm,__ref.getField(true,"_alg_hex" /*RemoteObject*/ ),__ref.getField(true,"_alg_b64" /*RemoteObject*/ ),__ref.getField(true,"_alg_hex_hmac" /*RemoteObject*/ ),__ref.getField(true,"_alg_b64_hmac" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 49;BA.debugLine="res = bo.RunMethod(\"hex\", Array(sinput)).result";
Debug.JustUpdateDeviceLine();
_res = BA.ObjectToString(_bo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hex")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_sinput" /*RemoteObject*/ ))})))).runMethod(false,"Result"));Debug.locals.put("res", _res);
 break; }
case 1: {
 BA.debugLineNum = 51;BA.debugLine="res = bo.RunMethod(\"b64\", Array(sinput)).result";
Debug.JustUpdateDeviceLine();
_res = BA.ObjectToString(_bo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("b64")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_sinput" /*RemoteObject*/ ))})))).runMethod(false,"Result"));Debug.locals.put("res", _res);
 break; }
case 2: {
 BA.debugLineNum = 53;BA.debugLine="res = bo.RunMethod(\"hex_hmac\", Array(skey, sinp";
Debug.JustUpdateDeviceLine();
_res = BA.ObjectToString(_bo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hex_hmac")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_skey" /*RemoteObject*/ )),(__ref.getField(true,"_sinput" /*RemoteObject*/ ))})))).runMethod(false,"Result"));Debug.locals.put("res", _res);
 break; }
case 3: {
 BA.debugLineNum = 55;BA.debugLine="res = bo.RunMethod(\"b64_hmac\", Array(skey, sinp";
Debug.JustUpdateDeviceLine();
_res = BA.ObjectToString(_bo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("b64_hmac")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_skey" /*RemoteObject*/ )),(__ref.getField(true,"_sinput" /*RemoteObject*/ ))})))).runMethod(false,"Result"));Debug.locals.put("res", _res);
 break; }
}
;
 BA.debugLineNum = 57;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hash1(RemoteObject __ref,RemoteObject _salt,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("Hash1 (bananohashes) ","bananohashes",8,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("hash1")) { return __ref.runUserSub(false, "bananohashes","hash1", __ref, _salt, _module, _methodname);}
RemoteObject _newhash = RemoteObject.declareNull("Object");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("salt", _salt);
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 61;BA.debugLine="Sub Hash1(salt As String, module As Object, method";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Dim newHash As Object";
Debug.JustUpdateDeviceLine();
_newhash = RemoteObject.createNew ("Object");Debug.locals.put("newHash", _newhash);
 BA.debugLineNum = 63;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),(Object)(bananohashes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_newhash}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 64;BA.debugLine="BANano.RunJavascriptMethod(\"hashpw\", Array(sinput";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunJavascriptMethod",(Object)(BA.ObjectToString("hashpw")),(Object)(bananohashes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(true,"_sinput" /*RemoteObject*/ )),(_salt),(_cb.getObject())})))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _input,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bananohashes) ","bananohashes",8,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bananohashes","initialize", __ref, _ba, _input, _key);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("input", _input);
Debug.locals.put("key", _key);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(input As String, key As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="BANano.DependsOnAsset(\"hashes.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("hashes.min.js")));
 BA.debugLineNum = 20;BA.debugLine="sinput = input";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sinput" /*RemoteObject*/ ,_input);
 BA.debugLineNum = 21;BA.debugLine="skey = key";
Debug.JustUpdateDeviceLine();
__ref.setField ("_skey" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _verify(RemoteObject __ref,RemoteObject _oldhash,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("Verify (bananohashes) ","bananohashes",8,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("verify")) { return __ref.runUserSub(false, "bananohashes","verify", __ref, _oldhash, _module, _methodname);}
RemoteObject _res = RemoteObject.declareNull("Object");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("oldHash", _oldhash);
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 68;BA.debugLine="Sub Verify(oldHash As String, module As Object, me";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Dim res As Object";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("Object");Debug.locals.put("res", _res);
 BA.debugLineNum = 70;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),(Object)(bananohashes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_res}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 71;BA.debugLine="BANano.RunJavascriptMethod(\"checkpw\", Array(sinpu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("RunJavascriptMethod",(Object)(BA.ObjectToString("checkpw")),(Object)(bananohashes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(true,"_sinput" /*RemoteObject*/ )),(_oldhash),(_cb.getObject())})))));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}