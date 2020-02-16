
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bananohashes {
    public static RemoteObject myClass;
	public bananohashes() {
	}
    public static PCBA staticBA = new PCBA(null, bananohashes.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _hash_md5 = RemoteObject.createImmutable("");
public static RemoteObject _hash_sha1 = RemoteObject.createImmutable("");
public static RemoteObject _hash_sha256 = RemoteObject.createImmutable("");
public static RemoteObject _hash_sha512 = RemoteObject.createImmutable("");
public static RemoteObject _hash_rmd160 = RemoteObject.createImmutable("");
public static RemoteObject _alg_hex = RemoteObject.createImmutable("");
public static RemoteObject _alg_b64 = RemoteObject.createImmutable("");
public static RemoteObject _alg_hex_hmac = RemoteObject.createImmutable("");
public static RemoteObject _alg_b64_hmac = RemoteObject.createImmutable("");
public static RemoteObject _sinput = RemoteObject.createImmutable("");
public static RemoteObject _skey = RemoteObject.createImmutable("");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ALG_B64",_ref.getField(false, "_alg_b64"),"ALG_b64_HMAC",_ref.getField(false, "_alg_b64_hmac"),"ALG_HEX",_ref.getField(false, "_alg_hex"),"ALG_HEX_HMAC",_ref.getField(false, "_alg_hex_hmac"),"BANano",_ref.getField(false, "_banano"),"HASH_MD5",_ref.getField(false, "_hash_md5"),"HASH_RMD160",_ref.getField(false, "_hash_rmd160"),"HASH_SHA1",_ref.getField(false, "_hash_sha1"),"HASH_SHA256",_ref.getField(false, "_hash_sha256"),"HASH_SHA512",_ref.getField(false, "_hash_sha512"),"sinput",_ref.getField(false, "_sinput"),"skey",_ref.getField(false, "_skey")};
}
}