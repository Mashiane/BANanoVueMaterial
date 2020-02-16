package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananohashes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananohashes", this);
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
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public const HASH_MD5 As String = \"MD5\"";
_hash_md5 = "MD5";
 //BA.debugLineNum = 4;BA.debugLine="Public const HASH_SHA1 As String = \"SHA1\"";
_hash_sha1 = "SHA1";
 //BA.debugLineNum = 5;BA.debugLine="Public const HASH_SHA256 As String = \"SHA256\"";
_hash_sha256 = "SHA256";
 //BA.debugLineNum = 6;BA.debugLine="Public const HASH_SHA512 As String = \"SHA512\"";
_hash_sha512 = "SHA512";
 //BA.debugLineNum = 7;BA.debugLine="Public const HASH_RMD160 As String = \"RMD160\"";
_hash_rmd160 = "RMD160";
 //BA.debugLineNum = 8;BA.debugLine="Public const ALG_HEX As String = \"hex\"";
_alg_hex = "hex";
 //BA.debugLineNum = 9;BA.debugLine="Public const ALG_B64 As String = \"b64\"";
_alg_b64 = "b64";
 //BA.debugLineNum = 10;BA.debugLine="Public const ALG_HEX_HMAC As String = \"hex_hmac\"";
_alg_hex_hmac = "hex_hmac";
 //BA.debugLineNum = 11;BA.debugLine="Public const ALG_b64_HMAC As String = \"b64_hmac\"";
_alg_b64_hmac = "b64_hmac";
 //BA.debugLineNum = 12;BA.debugLine="Private sinput As String";
_sinput = "";
 //BA.debugLineNum = 13;BA.debugLine="Private skey As String";
_skey = "";
 //BA.debugLineNum = 14;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _generatesalt(int _rounds) throws Exception{
String _salt = "";
 //BA.debugLineNum = 26;BA.debugLine="Sub GenerateSalt(rounds As Int) As String";
 //BA.debugLineNum = 27;BA.debugLine="Dim salt As String = BANano.RunJavascriptMethod(\"";
_salt = BA.ObjectToString(_banano.RunJavascriptMethod("gensalt",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_rounds)})));
 //BA.debugLineNum = 28;BA.debugLine="Return salt";
if (true) return _salt;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _hash(String _hashtype,String _algorithm) throws Exception{
com.ab.banano.BANanoObject _bo = null;
String _res = "";
 //BA.debugLineNum = 31;BA.debugLine="Sub Hash(hashType As String, algorithm As String)";
 //BA.debugLineNum = 32;BA.debugLine="Dim bo As BANanoObject";
_bo = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 33;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 34;BA.debugLine="Select Case hashType";
switch (BA.switchObjectToInt(_hashtype,_hash_md5,_hash_sha1,_hash_sha256,_hash_sha512,_hash_rmd160)) {
case 0: {
 //BA.debugLineNum = 36;BA.debugLine="bo.Initialize2(\"Hashes.MD5\",Null)";
_bo.Initialize2("Hashes.MD5",__c.Null);
 break; }
case 1: {
 //BA.debugLineNum = 38;BA.debugLine="bo.Initialize2(\"Hashes.SHA1\",Null)";
_bo.Initialize2("Hashes.SHA1",__c.Null);
 break; }
case 2: {
 //BA.debugLineNum = 40;BA.debugLine="bo.Initialize2(\"Hashes.SHA256\",Null)";
_bo.Initialize2("Hashes.SHA256",__c.Null);
 break; }
case 3: {
 //BA.debugLineNum = 42;BA.debugLine="bo.Initialize2(\"Hashes.SHA512\",Null)";
_bo.Initialize2("Hashes.SHA512",__c.Null);
 break; }
case 4: {
 //BA.debugLineNum = 44;BA.debugLine="bo.Initialize2(\"Hashes.RMD160\",Null)";
_bo.Initialize2("Hashes.RMD160",__c.Null);
 break; }
}
;
 //BA.debugLineNum = 47;BA.debugLine="Select Case algorithm";
switch (BA.switchObjectToInt(_algorithm,_alg_hex,_alg_b64,_alg_hex_hmac,_alg_b64_hmac)) {
case 0: {
 //BA.debugLineNum = 49;BA.debugLine="res = bo.RunMethod(\"hex\", Array(sinput)).result";
_res = BA.ObjectToString(_bo.RunMethod("hex",(Object)(new Object[]{(Object)(_sinput)})).Result());
 break; }
case 1: {
 //BA.debugLineNum = 51;BA.debugLine="res = bo.RunMethod(\"b64\", Array(sinput)).result";
_res = BA.ObjectToString(_bo.RunMethod("b64",(Object)(new Object[]{(Object)(_sinput)})).Result());
 break; }
case 2: {
 //BA.debugLineNum = 53;BA.debugLine="res = bo.RunMethod(\"hex_hmac\", Array(skey, sinp";
_res = BA.ObjectToString(_bo.RunMethod("hex_hmac",(Object)(new Object[]{(Object)(_skey),(Object)(_sinput)})).Result());
 break; }
case 3: {
 //BA.debugLineNum = 55;BA.debugLine="res = bo.RunMethod(\"b64_hmac\", Array(skey, sinp";
_res = BA.ObjectToString(_bo.RunMethod("b64_hmac",(Object)(new Object[]{(Object)(_skey),(Object)(_sinput)})).Result());
 break; }
}
;
 //BA.debugLineNum = 57;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _hash1(String _salt,Object _module,String _methodname) throws Exception{
Object _newhash = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 61;BA.debugLine="Sub Hash1(salt As String, module As Object, method";
 //BA.debugLineNum = 62;BA.debugLine="Dim newHash As Object";
_newhash = new Object();
 //BA.debugLineNum = 63;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_newhash}))));
 //BA.debugLineNum = 64;BA.debugLine="BANano.RunJavascriptMethod(\"hashpw\", Array(sinput";
_banano.RunJavascriptMethod("hashpw",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sinput),(Object)(_salt),(Object)(_cb.getObject())}));
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananohashes  _initialize(anywheresoftware.b4a.BA _ba,String _input,String _key) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(input As String, key As Stri";
 //BA.debugLineNum = 19;BA.debugLine="BANano.DependsOnAsset(\"hashes.min.js\")";
_banano.DependsOnAsset("hashes.min.js");
 //BA.debugLineNum = 20;BA.debugLine="sinput = input";
_sinput = _input;
 //BA.debugLineNum = 21;BA.debugLine="skey = key";
_skey = _key;
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.bananohashes)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _verify(String _oldhash,Object _module,String _methodname) throws Exception{
Object _res = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub Verify(oldHash As String, module As Object, me";
 //BA.debugLineNum = 69;BA.debugLine="Dim res As Object";
_res = new Object();
 //BA.debugLineNum = 70;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_res}))));
 //BA.debugLineNum = 71;BA.debugLine="BANano.RunJavascriptMethod(\"checkpw\", Array(sinpu";
_banano.RunJavascriptMethod("checkpw",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sinput),(Object)(_oldhash),(Object)(_cb.getObject())}));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
