
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmlistitem {
    public static RemoteObject myClass;
	public vmlistitem() {
	}
    public static PCBA staticBA = new PCBA(null, vmlistitem.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _listitem = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _txt = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _hastext = RemoteObject.createImmutable(false);
public static RemoteObject _hasaction = RemoteObject.createImmutable(false);
public static RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
public static RemoteObject _hasicon = RemoteObject.createImmutable(false);
public static RemoteObject _icn = RemoteObject.declareNull("b4j.example.vmicon");
public static RemoteObject _hasavatar = RemoteObject.createImmutable(false);
public static RemoteObject _avatar = RemoteObject.declareNull("b4j.example.vmavatar");
public static RemoteObject _hasswitch = RemoteObject.createImmutable(false);
public static RemoteObject _switch = RemoteObject.declareNull("b4j.example.vmswitch");
public static RemoteObject _hasbadge = RemoteObject.createImmutable(false);
public static RemoteObject _badge = RemoteObject.declareNull("b4j.example.vmbadge");
public static RemoteObject _childlist = RemoteObject.declareNull("b4j.example.vmlist");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _span = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _hasmenu = RemoteObject.createImmutable(false);
public static RemoteObject _menu = RemoteObject.declareNull("b4j.example.vmmenu");
public static RemoteObject _syncid = RemoteObject.createImmutable("");
public static RemoteObject _eventhandler = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"avatar",_ref.getField(false, "_avatar"),"badge",_ref.getField(false, "_badge"),"BANano",_ref.getField(false, "_banano"),"btn",_ref.getField(false, "_btn"),"childList",_ref.getField(false, "_childlist"),"data",_ref.getField(false, "_data"),"eventHandler",_ref.getField(false, "_eventhandler"),"hasAction",_ref.getField(false, "_hasaction"),"hasAvatar",_ref.getField(false, "_hasavatar"),"hasBadge",_ref.getField(false, "_hasbadge"),"hasIcon",_ref.getField(false, "_hasicon"),"hasMenu",_ref.getField(false, "_hasmenu"),"hasSwitch",_ref.getField(false, "_hasswitch"),"hasText",_ref.getField(false, "_hastext"),"icn",_ref.getField(false, "_icn"),"ID",_ref.getField(false, "_id"),"ListItem",_ref.getField(false, "_listitem"),"menu",_ref.getField(false, "_menu"),"span",_ref.getField(false, "_span"),"switch",_ref.getField(false, "_switch"),"syncid",_ref.getField(false, "_syncid"),"txt",_ref.getField(false, "_txt"),"vue",_ref.getField(false, "_vue")};
}
}