package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananohashes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananohashes", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananohashes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _hash_md5 = "";
public String _hash_sha1 = "";
public String _hash_sha256 = "";
public String _hash_sha512 = "";
public String _hash_rmd160 = "";
public String _alg_hex = "";
public String _alg_b64 = "";
public String _alg_hex_hmac = "";
public String _alg_b64_hmac = "";
public String _sinput = "";
public String _skey = "";
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _class_globals(b4j.example.bananohashes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananohashes";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Public const HASH_MD5 As String = \"MD5\"";
_hash_md5 = "MD5";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Public const HASH_SHA1 As String = \"SHA1\"";
_hash_sha1 = "SHA1";
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Public const HASH_SHA256 As String = \"SHA256\"";
_hash_sha256 = "SHA256";
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Public const HASH_SHA512 As String = \"SHA512\"";
_hash_sha512 = "SHA512";
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Public const HASH_RMD160 As String = \"RMD160\"";
_hash_rmd160 = "RMD160";
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Public const ALG_HEX As String = \"hex\"";
_alg_hex = "hex";
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="Public const ALG_B64 As String = \"b64\"";
_alg_b64 = "b64";
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="Public const ALG_HEX_HMAC As String = \"hex_hmac\"";
_alg_hex_hmac = "hex_hmac";
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="Public const ALG_b64_HMAC As String = \"b64_hmac\"";
_alg_b64_hmac = "b64_hmac";
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="Private sinput As String";
_sinput = "";
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="Private skey As String";
_skey = "";
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="End Sub";
return "";
}
public String  _generatesalt(b4j.example.bananohashes __ref,int _rounds) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananohashes";
if (Debug.shouldDelegate(ba, "generatesalt", true))
	 {return ((String) Debug.delegate(ba, "generatesalt", new Object[] {_rounds}));}
String _salt = "";
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub GenerateSalt(rounds As Int) As String";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim salt As String = BANano.RunJavascriptMethod(\"";
_salt = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("gensalt",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_rounds)})));
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Return salt";
if (true) return _salt;
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="End Sub";
return "";
}
public String  _hash(b4j.example.bananohashes __ref,String _hashtype,String _algorithm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananohashes";
if (Debug.shouldDelegate(ba, "hash", true))
	 {return ((String) Debug.delegate(ba, "hash", new Object[] {_hashtype,_algorithm}));}
com.ab.banano.BANanoObject _bo = null;
String _res = "";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub Hash(hashType As String, algorithm As String)";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim bo As BANanoObject";
_bo = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="Select Case hashType";
switch (BA.switchObjectToInt(_hashtype,__ref._hash_md5 /*String*/ ,__ref._hash_sha1 /*String*/ ,__ref._hash_sha256 /*String*/ ,__ref._hash_sha512 /*String*/ ,__ref._hash_rmd160 /*String*/ )) {
case 0: {
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="bo.Initialize2(\"Hashes.MD5\",Null)";
_bo.Initialize2("Hashes.MD5",__c.Null);
 break; }
case 1: {
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="bo.Initialize2(\"Hashes.SHA1\",Null)";
_bo.Initialize2("Hashes.SHA1",__c.Null);
 break; }
case 2: {
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="bo.Initialize2(\"Hashes.SHA256\",Null)";
_bo.Initialize2("Hashes.SHA256",__c.Null);
 break; }
case 3: {
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="bo.Initialize2(\"Hashes.SHA512\",Null)";
_bo.Initialize2("Hashes.SHA512",__c.Null);
 break; }
case 4: {
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="bo.Initialize2(\"Hashes.RMD160\",Null)";
_bo.Initialize2("Hashes.RMD160",__c.Null);
 break; }
}
;
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="Select Case algorithm";
switch (BA.switchObjectToInt(_algorithm,__ref._alg_hex /*String*/ ,__ref._alg_b64 /*String*/ ,__ref._alg_hex_hmac /*String*/ ,__ref._alg_b64_hmac /*String*/ )) {
case 0: {
RDebugUtils.currentLine=4587538;
 //BA.debugLineNum = 4587538;BA.debugLine="res = bo.RunMethod(\"hex\", Array(sinput)).result";
_res = BA.ObjectToString(_bo.RunMethod("hex",(Object)(new Object[]{(Object)(__ref._sinput /*String*/ )})).Result());
 break; }
case 1: {
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="res = bo.RunMethod(\"b64\", Array(sinput)).result";
_res = BA.ObjectToString(_bo.RunMethod("b64",(Object)(new Object[]{(Object)(__ref._sinput /*String*/ )})).Result());
 break; }
case 2: {
RDebugUtils.currentLine=4587542;
 //BA.debugLineNum = 4587542;BA.debugLine="res = bo.RunMethod(\"hex_hmac\", Array(skey, sinp";
_res = BA.ObjectToString(_bo.RunMethod("hex_hmac",(Object)(new Object[]{(Object)(__ref._skey /*String*/ ),(Object)(__ref._sinput /*String*/ )})).Result());
 break; }
case 3: {
RDebugUtils.currentLine=4587544;
 //BA.debugLineNum = 4587544;BA.debugLine="res = bo.RunMethod(\"b64_hmac\", Array(skey, sinp";
_res = BA.ObjectToString(_bo.RunMethod("b64_hmac",(Object)(new Object[]{(Object)(__ref._skey /*String*/ ),(Object)(__ref._sinput /*String*/ )})).Result());
 break; }
}
;
RDebugUtils.currentLine=4587546;
 //BA.debugLineNum = 4587546;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=4587547;
 //BA.debugLineNum = 4587547;BA.debugLine="End Sub";
return "";
}
public String  _hash1(b4j.example.bananohashes __ref,String _salt,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananohashes";
if (Debug.shouldDelegate(ba, "hash1", true))
	 {return ((String) Debug.delegate(ba, "hash1", new Object[] {_salt,_module,_methodname}));}
Object _newhash = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub Hash1(salt As String, module As Object, method";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim newHash As Object";
_newhash = new Object();
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_newhash}))));
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="BANano.RunJavascriptMethod(\"hashpw\", Array(sinput";
__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("hashpw",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._sinput /*String*/ ),(Object)(_salt),(Object)(_cb.getObject())}));
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananohashes  _initialize(b4j.example.bananohashes __ref,anywheresoftware.b4a.BA _ba,String _input,String _key) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananohashes";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.bananohashes) Debug.delegate(ba, "initialize", new Object[] {_ba,_input,_key}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub Initialize(input As String, key As Stri";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="BANano.DependsOnAsset(\"hashes.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("hashes.min.js");
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="sinput = input";
__ref._sinput /*String*/  = _input;
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="skey = key";
__ref._skey /*String*/  = _key;
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Return Me";
if (true) return (b4j.example.bananohashes)(this);
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="End Sub";
return null;
}
public String  _verify(b4j.example.bananohashes __ref,String _oldhash,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananohashes";
if (Debug.shouldDelegate(ba, "verify", true))
	 {return ((String) Debug.delegate(ba, "verify", new Object[] {_oldhash,_module,_methodname}));}
Object _res = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub Verify(oldHash As String, module As Object, me";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim res As Object";
_res = new Object();
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_res}))));
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="BANano.RunJavascriptMethod(\"checkpw\", Array(sinpu";
__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("checkpw",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._sinput /*String*/ ),(Object)(_oldhash),(Object)(_cb.getObject())}));
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="End Sub";
return "";
}
}