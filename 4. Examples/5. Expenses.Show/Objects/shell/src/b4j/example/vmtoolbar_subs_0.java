package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtoolbar_subs_0 {


public static RemoteObject  _addavatar(RemoteObject __ref,RemoteObject _key,RemoteObject _imgurl,RemoteObject _txt,RemoteObject _tooltip,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddAvatar (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("addavatar")) { return __ref.runUserSub(false, "vmtoolbar","addavatar", __ref, _key, _imgurl, _txt, _tooltip, _badge);}
RemoteObject _avt = RemoteObject.declareNull("b4j.example.vmavatar");
Debug.locals.put("key", _key);
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("txt", _txt);
Debug.locals.put("toolTip", _tooltip);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 190;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, txt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="Dim avt As VMAvatar";
Debug.JustUpdateDeviceLine();
_avt = RemoteObject.createNew ("b4j.example.vmavatar");Debug.locals.put("avt", _avt);
 BA.debugLineNum = 192;BA.debugLine="avt.Initialize(vue, key,module)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 193;BA.debugLine="avt.SetValue(imgURL)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_setvalue" /*RemoteObject*/ ,(Object)(_imgurl));
 BA.debugLineNum = 194;BA.debugLine="avt.SetAlt(txt)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_setalt" /*RemoteObject*/ ,(Object)(_txt));
 BA.debugLineNum = 195;BA.debugLine="avt.SetToolTip(toolTip)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_settooltip" /*RemoteObject*/ ,(Object)(_tooltip));
 BA.debugLineNum = 196;BA.debugLine="If badge <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_badge,BA.ObjectToString(""))) { 
 BA.debugLineNum = 197;BA.debugLine="avt.SetBadgeContent(badge)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_setbadgecontent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _badge)));
 };
 BA.debugLineNum = 199;BA.debugLine="avt.Pop(EndSection)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_endsection" /*RemoteObject*/ )));
 BA.debugLineNum = 200;BA.debugLine="EndSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_endsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 201;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 202;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addavatarstart(RemoteObject __ref,RemoteObject _key,RemoteObject _imgurl,RemoteObject _txt,RemoteObject _tooltip,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddAvatarStart (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("addavatarstart")) { return __ref.runUserSub(false, "vmtoolbar","addavatarstart", __ref, _key, _imgurl, _txt, _tooltip, _badge);}
RemoteObject _avt = RemoteObject.declareNull("b4j.example.vmavatar");
Debug.locals.put("key", _key);
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("txt", _txt);
Debug.locals.put("toolTip", _tooltip);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 205;BA.debugLine="Sub AddAvatarStart(key As String, imgURL As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="Dim avt As VMAvatar";
Debug.JustUpdateDeviceLine();
_avt = RemoteObject.createNew ("b4j.example.vmavatar");Debug.locals.put("avt", _avt);
 BA.debugLineNum = 207;BA.debugLine="avt.Initialize(vue, key,module)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 208;BA.debugLine="avt.SetValue(imgURL)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_setvalue" /*RemoteObject*/ ,(Object)(_imgurl));
 BA.debugLineNum = 209;BA.debugLine="avt.SetAlt(txt)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_setalt" /*RemoteObject*/ ,(Object)(_txt));
 BA.debugLineNum = 210;BA.debugLine="avt.SetToolTip(toolTip)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_settooltip" /*RemoteObject*/ ,(Object)(_tooltip));
 BA.debugLineNum = 211;BA.debugLine="If badge <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_badge,BA.ObjectToString(""))) { 
 BA.debugLineNum = 212;BA.debugLine="avt.SetBadgeContent(badge)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_setbadgecontent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _badge)));
 };
 BA.debugLineNum = 214;BA.debugLine="avt.Pop(StartSection)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_startsection" /*RemoteObject*/ )));
 BA.debugLineNum = 215;BA.debugLine="StartSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_startsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 216;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 217;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbutton(RemoteObject __ref,RemoteObject _key,RemoteObject _iconname,RemoteObject _text,RemoteObject _tooltip,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddButton (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("addbutton")) { return __ref.runUserSub(false, "vmtoolbar","addbutton", __ref, _key, _iconname, _text, _tooltip, _badge);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("key", _key);
Debug.locals.put("iconName", _iconname);
Debug.locals.put("text", _text);
Debug.locals.put("toolTip", _tooltip);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 151;BA.debugLine="Sub AddButton(key As String, iconName As String, t";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 153;BA.debugLine="btn.Initialize(vue, key, module).SetToolTip(toolT";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_settooltip" /*RemoteObject*/ ,(Object)(_tooltip)).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_iconname)).runClassMethod (b4j.example.vmbutton.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 154;BA.debugLine="If badge <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_badge,BA.ObjectToString(""))) { 
 BA.debugLineNum = 155;BA.debugLine="btn.SetBadgeContent(badge)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setbadgecontent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _badge)));
 };
 BA.debugLineNum = 157;BA.debugLine="btn.Pop(EndSection)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_endsection" /*RemoteObject*/ )));
 BA.debugLineNum = 158;BA.debugLine="EndSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_endsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 159;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 160;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbuttonstart(RemoteObject __ref,RemoteObject _key,RemoteObject _iconname,RemoteObject _text,RemoteObject _tooltip,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddButtonStart (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("addbuttonstart")) { return __ref.runUserSub(false, "vmtoolbar","addbuttonstart", __ref, _key, _iconname, _text, _tooltip, _badge);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("key", _key);
Debug.locals.put("iconName", _iconname);
Debug.locals.put("text", _text);
Debug.locals.put("toolTip", _tooltip);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 163;BA.debugLine="Sub AddButtonStart(key As String, iconName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 165;BA.debugLine="btn.Initialize(vue, key, module).SetToolTip(toolT";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_settooltip" /*RemoteObject*/ ,(Object)(_tooltip)).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_iconname)).runClassMethod (b4j.example.vmbutton.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 166;BA.debugLine="If badge <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_badge,BA.ObjectToString(""))) { 
 BA.debugLineNum = 167;BA.debugLine="btn.SetBadgeContent(badge)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setbadgecontent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _badge)));
 };
 BA.debugLineNum = 169;BA.debugLine="btn.Pop(StartSection)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_startsection" /*RemoteObject*/ )));
 BA.debugLineNum = 170;BA.debugLine="StartSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_startsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 171;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 172;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,282);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtoolbar","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 282;BA.debugLine="Sub AddClass(c As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 283;BA.debugLine="ToolBar.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 284;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addicon(RemoteObject __ref,RemoteObject _key,RemoteObject _iconname,RemoteObject _tooltip,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddIcon (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("addicon")) { return __ref.runUserSub(false, "vmtoolbar","addicon", __ref, _key, _iconname, _tooltip, _badge);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("key", _key);
Debug.locals.put("iconName", _iconname);
Debug.locals.put("toolTip", _tooltip);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 139;BA.debugLine="Sub AddIcon(key As String, iconName As String, too";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 141;BA.debugLine="btn.Initialize(vue, key, module).SetIcon(iconName";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_iconname)).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True"))).runClassMethod (b4j.example.vmbutton.class, "_settooltip" /*RemoteObject*/ ,(Object)(_tooltip));
 BA.debugLineNum = 142;BA.debugLine="If badge <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_badge,BA.ObjectToString(""))) { 
 BA.debugLineNum = 143;BA.debugLine="btn.SetBadgeContent(badge)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setbadgecontent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _badge)));
 };
 BA.debugLineNum = 145;BA.debugLine="btn.Pop(EndSection)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_endsection" /*RemoteObject*/ )));
 BA.debugLineNum = 146;BA.debugLine="EndSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_endsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 147;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 148;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addiconstart(RemoteObject __ref,RemoteObject _key,RemoteObject _iconname,RemoteObject _tooltip,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddIconStart (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("addiconstart")) { return __ref.runUserSub(false, "vmtoolbar","addiconstart", __ref, _key, _iconname, _tooltip, _badge);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("key", _key);
Debug.locals.put("iconName", _iconname);
Debug.locals.put("tooltip", _tooltip);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 220;BA.debugLine="Sub AddIconStart(key As String, iconName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 221;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 222;BA.debugLine="btn.Initialize(vue, key, module).SetIcon(iconName";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_iconname)).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True"))).runClassMethod (b4j.example.vmbutton.class, "_settooltip" /*RemoteObject*/ ,(Object)(_tooltip));
 BA.debugLineNum = 223;BA.debugLine="If badge <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_badge,BA.ObjectToString(""))) { 
 BA.debugLineNum = 224;BA.debugLine="btn.SetBadgeContent(badge)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setbadgecontent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _badge)));
 };
 BA.debugLineNum = 226;BA.debugLine="btn.Pop(StartSection)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_startsection" /*RemoteObject*/ )));
 BA.debugLineNum = 227;BA.debugLine="StartSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_startsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 228;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 229;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmenu(RemoteObject __ref,RemoteObject _mnu) throws Exception{
try {
		Debug.PushSubsStack("AddMenu (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("addmenu")) { return __ref.runUserSub(false, "vmtoolbar","addmenu", __ref, _mnu);}
Debug.locals.put("mnu", _mnu);
 BA.debugLineNum = 176;BA.debugLine="Sub AddMenu(mnu As VMMenu) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="mnu.Pop(EndSection)";
Debug.JustUpdateDeviceLine();
_mnu.runClassMethod (b4j.example.vmmenu.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_endsection" /*RemoteObject*/ )));
 BA.debugLineNum = 178;BA.debugLine="EndSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_endsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 179;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 180;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmenustart(RemoteObject __ref,RemoteObject _mnu) throws Exception{
try {
		Debug.PushSubsStack("AddMenuStart (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("addmenustart")) { return __ref.runUserSub(false, "vmtoolbar","addmenustart", __ref, _mnu);}
Debug.locals.put("mnu", _mnu);
 BA.debugLineNum = 183;BA.debugLine="Sub AddMenuStart(mnu As VMMenu) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 184;BA.debugLine="mnu.Pop(StartSection)";
Debug.JustUpdateDeviceLine();
_mnu.runClassMethod (b4j.example.vmmenu.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_startsection" /*RemoteObject*/ )));
 BA.debugLineNum = 185;BA.debugLine="StartSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_startsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 186;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 187;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addsearch(RemoteObject __ref,RemoteObject _searchid,RemoteObject _placeholder,RemoteObject _vmodel) throws Exception{
try {
		Debug.PushSubsStack("AddSearch (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("addsearch")) { return __ref.runUserSub(false, "vmtoolbar","addsearch", __ref, _searchid, _placeholder, _vmodel);}
RemoteObject _mf = RemoteObject.declareNull("b4j.example.vmfield");
RemoteObject _inp = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("searchID", _searchid);
Debug.locals.put("placeHolder", _placeholder);
Debug.locals.put("vmodel", _vmodel);
 BA.debugLineNum = 51;BA.debugLine="Sub AddSearch(searchID As String, placeHolder As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="searchID = searchID.tolowercase";
Debug.JustUpdateDeviceLine();
_searchid = _searchid.runMethod(true,"toLowerCase");Debug.locals.put("searchID", _searchid);
 BA.debugLineNum = 53;BA.debugLine="Dim mf As VMField";
Debug.JustUpdateDeviceLine();
_mf = RemoteObject.createNew ("b4j.example.vmfield");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 54;BA.debugLine="Dim inp As VMInput";
Debug.JustUpdateDeviceLine();
_inp = RemoteObject.createNew ("b4j.example.vminput");Debug.locals.put("inp", _inp);
 BA.debugLineNum = 56;BA.debugLine="mf.Initialize(vue, ID, $\"${searchID}field\"$, modu";
Debug.JustUpdateDeviceLine();
_mf.runClassMethod (b4j.example.vmfield.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_searchid))),RemoteObject.createImmutable("field")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmfield.class, "_setclearable" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True"))).runClassMethod (b4j.example.vmfield.class, "_setmaxwidth" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("300px")));
 BA.debugLineNum = 57;BA.debugLine="inp.Initialize(vue, searchID, module).SetPlacehol";
Debug.JustUpdateDeviceLine();
_inp.runClassMethod (b4j.example.vminput.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_searchid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vminput.class, "_setplaceholder" /*RemoteObject*/ ,(Object)((_placeholder))).runClassMethod (b4j.example.vminput.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 58;BA.debugLine="inp.Pop(mf.Field)";
Debug.JustUpdateDeviceLine();
_inp.runClassMethod (b4j.example.vminput.class, "_pop" /*RemoteObject*/ ,(Object)(_mf.getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="mf.Pop(EndSection)";
Debug.JustUpdateDeviceLine();
_mf.runClassMethod (b4j.example.vmfield.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_endsection" /*RemoteObject*/ )));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,389);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmtoolbar","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 389;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 390;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmtoolbar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ToolBar As VMElement";
vmtoolbar._toolbar = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_toolbar",vmtoolbar._toolbar);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtoolbar._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtoolbar._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtoolbar._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtoolbar._vue);
 //BA.debugLineNum = 6;BA.debugLine="Public HasContent As Boolean";
vmtoolbar._hascontent = RemoteObject.createImmutable(false);__ref.setField("_hascontent",vmtoolbar._hascontent);
 //BA.debugLineNum = 7;BA.debugLine="Public EndSection As VMElement";
vmtoolbar._endsection = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_endsection",vmtoolbar._endsection);
 //BA.debugLineNum = 8;BA.debugLine="Public StartSection As VMElement";
vmtoolbar._startsection = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_startsection",vmtoolbar._startsection);
 //BA.debugLineNum = 9;BA.debugLine="Private module As Object";
vmtoolbar._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmtoolbar._module);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createbutton(RemoteObject __ref,RemoteObject _btnid) throws Exception{
try {
		Debug.PushSubsStack("CreateButton (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("createbutton")) { return __ref.runUserSub(false, "vmtoolbar","createbutton", __ref, _btnid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("btnID", _btnid);
 BA.debugLineNum = 265;BA.debugLine="Sub CreateButton(btnID As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 266;BA.debugLine="Dim el As VMButton";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("el", _el);
 BA.debugLineNum = 267;BA.debugLine="el.Initialize(vue, btnID, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_btnid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 268;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmtoolbar","hide", __ref);}
 BA.debugLineNum = 277;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="SetVisible(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_setvisible" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"False")));
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidebackbutton(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideBackButton (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("hidebackbutton")) { return __ref.runUserSub(false, "vmtoolbar","hidebackbutton", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Sub HideBackButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="SetHasBackButton(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_sethasbackbutton" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"False")));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidemenu(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideMenu (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("hidemenu")) { return __ref.runUserSub(false, "vmtoolbar","hidemenu", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Sub HideMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="SetHasMenuButton(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_sethasmenubutton" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"False")));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtoolbar","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 14;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 16;BA.debugLine="ToolBar.Initialize(vue, ID).SetTag(\"md-app-toolba";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-app-toolbar")));
 BA.debugLineNum = 17;BA.debugLine="HasContent = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"False"));
 BA.debugLineNum = 18;BA.debugLine="EndSection.Initialize(vue,$\"${ID}end\"$).SetTag(\"d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_endsection" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("end"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-toolbar-section-end")));
 BA.debugLineNum = 19;BA.debugLine="StartSection.Initialize(vue,$\"${ID}start\"$).SetTa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_startsection" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("start"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-toolbar-section-start")));
 BA.debugLineNum = 20;BA.debugLine="ToolBar.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 21;BA.debugLine="ToolBar.RemoveAttr(\":disabled\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 22;BA.debugLine="SetToolbar(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_settoolbar" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True")));
 BA.debugLineNum = 23;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,383);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtoolbar","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 383;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 384;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtoolbar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,379);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtoolbar","render", __ref);}
 BA.debugLineNum = 379;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 380;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtoolbar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmtoolbar","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 344;BA.debugLine="Sub SetAccent(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 345;BA.debugLine="ToolBar.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True")));
 BA.debugLineNum = 346;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 347;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setapptoolbar(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAppToolbar (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setapptoolbar")) { return __ref.runUserSub(false, "vmtoolbar","setapptoolbar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="Sub SetAppToolbar(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmtoolbar.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 64;BA.debugLine="ToolBar.SetTag(\"md-app-toolbar\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-app-toolbar")));
 BA.debugLineNum = 65;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtoolbar","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 288;BA.debugLine="Sub SetAttr(attr As Map) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 289;BA.debugLine="ToolBar.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 290;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdense(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDense (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("setdense")) { return __ref.runUserSub(false, "vmtoolbar","setdense", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 312;BA.debugLine="Sub SetDense(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 313;BA.debugLine="ToolBar.SetDense(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdense" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 314;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmtoolbar","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 85;BA.debugLine="Sub SetDisabled(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="ToolBar.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 87;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmtoolbar","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 333;BA.debugLine="Sub SetElevation(e As Int) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 334;BA.debugLine="ToolBar.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 335;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 336;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethasbackbutton(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHasBackButton (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("sethasbackbutton")) { return __ref.runUserSub(false, "vmtoolbar","sethasbackbutton", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 232;BA.debugLine="Sub SetHasBackButton(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 233;BA.debugLine="vue.SetStateSingle(\"backshow\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("backshow")),(Object)((_b)));
 BA.debugLineNum = 234;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethaslogo(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHasLogo (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("sethaslogo")) { return __ref.runUserSub(false, "vmtoolbar","sethaslogo", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 27;BA.debugLine="Sub SetHasLogo(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="vue.SetStateSingle(\"logo\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("logo")),(Object)((_b)));
 BA.debugLineNum = 29;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethasmenubutton(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHasMenuButton (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("sethasmenubutton")) { return __ref.runUserSub(false, "vmtoolbar","sethasmenubutton", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 238;BA.debugLine="Sub SetHasMenuButton(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 239;BA.debugLine="vue.SetStateSingle(\"menushow\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("menushow")),(Object)((_b)));
 BA.debugLineNum = 240;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlarge(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetLarge (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("setlarge")) { return __ref.runUserSub(false, "vmtoolbar","setlarge", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 318;BA.debugLine="Sub SetLarge(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 319;BA.debugLine="ToolBar.SetLarge(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setlarge" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 320;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlogo(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SetLogo (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setlogo")) { return __ref.runUserSub(false, "vmtoolbar","setlogo", __ref, _url);}
RemoteObject _img = RemoteObject.declareNull("b4j.example.vmimage");
Debug.locals.put("url", _url);
 BA.debugLineNum = 32;BA.debugLine="Sub SetLogo(url As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="Dim img As VMImage";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.createNew ("b4j.example.vmimage");Debug.locals.put("img", _img);
 BA.debugLineNum = 34;BA.debugLine="img.Initialize(vue, $\"${ID}logo\"$, module)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("logo")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="img.SetValue(url, True).SetStyle(CreateMap(\"heigh";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setvalue" /*RemoteObject*/ ,(Object)(_url),(Object)(vmtoolbar.__c.getField(true,"True"))).runClassMethod (b4j.example.vmimage.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("42px")),RemoteObject.createImmutable(("width")),(RemoteObject.createImmutable("56px"))}))));
 BA.debugLineNum = 36;BA.debugLine="img.SetVShow(\"logo\")";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setvshow" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("logo")));
 BA.debugLineNum = 37;BA.debugLine="img.Pop(StartSection)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_startsection" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="vue.SetStateSingle(\"logo\", False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("logo")),(Object)((vmtoolbar.__c.getField(true,"False"))));
 BA.debugLineNum = 39;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="StartSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_startsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmarginall(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetMarginAll (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("setmarginall")) { return __ref.runUserSub(false, "vmtoolbar","setmarginall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 364;BA.debugLine="Sub SetMarginAll(p As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 365;BA.debugLine="ToolBar.SetMarginAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmarginall" /*RemoteObject*/ ,(Object)((_p)));
 BA.debugLineNum = 366;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmedium(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMedium (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("setmedium")) { return __ref.runUserSub(false, "vmtoolbar","setmedium", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 323;BA.debugLine="Sub SetMedium(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 324;BA.debugLine="ToolBar.SetMedium(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmedium" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 325;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmode(RemoteObject __ref,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("SetMode (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("setmode")) { return __ref.runUserSub(false, "vmtoolbar","setmode", __ref, _str);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 106;BA.debugLine="Sub SetMode(str As String) As VMToolBar   'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="Dim pp As String = $\"${ID}mode\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("mode")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 108;BA.debugLine="vue.SetStateSingle(pp, str)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_str)));
 BA.debugLineNum = 109;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmodefixed(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeFixed (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("setmodefixed")) { return __ref.runUserSub(false, "vmtoolbar","setmodefixed", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 113;BA.debugLine="Sub SetModeFixed(b As Boolean) As VMToolBar   'ign";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="SetMode(\"fixed\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("fixed")));
 BA.debugLineNum = 115;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmodefixedlast(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeFixedLast (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("setmodefixedlast")) { return __ref.runUserSub(false, "vmtoolbar","setmodefixedlast", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 128;BA.debugLine="Sub SetModeFixedLast(b As Boolean) As VMToolBar  '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="SetMode(\"fixed-last\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("fixed-last")));
 BA.debugLineNum = 130;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmodeflexible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeFlexible (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("setmodeflexible")) { return __ref.runUserSub(false, "vmtoolbar","setmodeflexible", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 123;BA.debugLine="Sub SetModeFlexible(b As Boolean) As VMToolBar  'i";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="SetMode(\"flexible\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("flexible")));
 BA.debugLineNum = 125;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmodeoverlap(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeOverlap (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("setmodeoverlap")) { return __ref.runUserSub(false, "vmtoolbar","setmodeoverlap", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 133;BA.debugLine="Sub SetModeOverlap(b As Boolean) As VMToolBar   'i";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="SetMode(\"overlap\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("overlap")));
 BA.debugLineNum = 135;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmodereveal(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeReveal (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setmodereveal")) { return __ref.runUserSub(false, "vmtoolbar","setmodereveal", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 118;BA.debugLine="Sub SetModeReveal(b As Boolean) As VMToolBar   'ig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="SetMode(\"reveal\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("reveal")));
 BA.debugLineNum = 120;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaddingall(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPaddingAll (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("setpaddingall")) { return __ref.runUserSub(false, "vmtoolbar","setpaddingall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 358;BA.debugLine="Sub SetPaddingAll(p As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 359;BA.debugLine="ToolBar.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)((_p)));
 BA.debugLineNum = 360;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmtoolbar","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 338;BA.debugLine="Sub SetPrimary(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 339;BA.debugLine="ToolBar.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True")));
 BA.debugLineNum = 340;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 341;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabletoolbar(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTableToolbar (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("settabletoolbar")) { return __ref.runUserSub(false, "vmtoolbar","settabletoolbar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 78;BA.debugLine="Sub SetTableToolbar(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmtoolbar.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 80;BA.debugLine="ToolBar.SetTag(\"md-table-toolbar\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-table-toolbar")));
 BA.debugLineNum = 81;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtoolbar","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 350;BA.debugLine="Sub SetText(t As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 351;BA.debugLine="ToolBar.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 352;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 353;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _tt) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmtoolbar","settitle", __ref, _tt);}
RemoteObject _pp = RemoteObject.createImmutable("");
RemoteObject _page_title = RemoteObject.createImmutable("");
RemoteObject _span = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("tt", _tt);
 BA.debugLineNum = 293;BA.debugLine="Sub SetTitle(tt As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 294;BA.debugLine="Dim pp As String = $\"${ID}title\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("title")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 295;BA.debugLine="vue.SetStateSingle(pp, tt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_tt)));
 BA.debugLineNum = 297;BA.debugLine="Dim page_title As String = $\"{{ ${pp} }}\"$";
Debug.JustUpdateDeviceLine();
_page_title = (RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pp))),RemoteObject.createImmutable(" }}")));Debug.locals.put("page_title", _page_title);Debug.locals.put("page_title", _page_title);
 BA.debugLineNum = 298;BA.debugLine="Dim span As VMElement";
Debug.JustUpdateDeviceLine();
_span = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("span", _span);
 BA.debugLineNum = 299;BA.debugLine="span.Initialize(vue, $\"${ID}title\"$).SetTag(\"h1\")";
Debug.JustUpdateDeviceLine();
_span.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("title"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h1"))).runClassMethod (b4j.example.vmelement.class, "_settitle" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_page_title));
 BA.debugLineNum = 300;BA.debugLine="span.Pop(StartSection)";
Debug.JustUpdateDeviceLine();
_span.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_startsection" /*RemoteObject*/ )));
 BA.debugLineNum = 301;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 302;BA.debugLine="StartSection.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_startsection" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 303;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settoolbar(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetToolbar (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("settoolbar")) { return __ref.runUserSub(false, "vmtoolbar","settoolbar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 70;BA.debugLine="Sub SetToolbar(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmtoolbar.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 72;BA.debugLine="ToolBar.SetTag(\"md-toolbar\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-toolbar")));
 BA.debugLineNum = 73;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtoolbar.__c.getField(true,"True"));
 BA.debugLineNum = 74;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settransparent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTransparent (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("settransparent")) { return __ref.runUserSub(false, "vmtoolbar","settransparent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 328;BA.debugLine="Sub SetTransparent(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="ToolBar.SetTransparent(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settransparent" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 330;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _xshow) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtoolbar","setvif", __ref, _xshow);}
Debug.locals.put("xshow", _xshow);
 BA.debugLineNum = 260;BA.debugLine="Sub SetVIf(xshow As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 261;BA.debugLine="ToolBar.SetVif(xshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_xshow));
 BA.debugLineNum = 262;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetVisible (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "vmtoolbar","setvisible", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 250;BA.debugLine="Sub SetVisible(b As Boolean) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 251;BA.debugLine="ToolBar.SetVisible(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvisible" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 252;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _xshow) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtoolbar","setvshow", __ref, _xshow);}
Debug.locals.put("xshow", _xshow);
 BA.debugLineNum = 255;BA.debugLine="Sub SetVShow(xshow As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 256;BA.debugLine="ToolBar.SetVShow(xshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_xshow));
 BA.debugLineNum = 257;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmtoolbar","show", __ref);}
 BA.debugLineNum = 272;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 273;BA.debugLine="SetVisible(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_setvisible" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True")));
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showbackbutton(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowBackButton (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("showbackbutton")) { return __ref.runUserSub(false, "vmtoolbar","showbackbutton", __ref);}
 BA.debugLineNum = 94;BA.debugLine="Sub ShowBackButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="SetHasBackButton(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_sethasbackbutton" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True")));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showmenu(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowMenu (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("showmenu")) { return __ref.runUserSub(false, "vmtoolbar","showmenu", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Sub ShowMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="SetHasMenuButton(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_sethasmenubutton" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True")));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _togglemenu(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToggleMenu (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("togglemenu")) { return __ref.runUserSub(false, "vmtoolbar","togglemenu", __ref);}
RemoteObject _bdrawer = RemoteObject.createImmutable(false);
 BA.debugLineNum = 243;BA.debugLine="Sub ToggleMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="Dim bDrawer As Boolean = vue.GetState(\"drawer\",Fa";
Debug.JustUpdateDeviceLine();
_bdrawer = BA.ObjectToBoolean(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("drawer")),(Object)((vmtoolbar.__c.getField(true,"False")))));Debug.locals.put("bDrawer", _bdrawer);Debug.locals.put("bDrawer", _bdrawer);
 BA.debugLineNum = 246;BA.debugLine="bDrawer = Not(bDrawer)";
Debug.JustUpdateDeviceLine();
_bdrawer = vmtoolbar.__c.runMethod(true,"Not",(Object)(_bdrawer));Debug.locals.put("bDrawer", _bdrawer);
 BA.debugLineNum = 247;BA.debugLine="vue.SetStateSingle(\"menushow\", bDrawer)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("menushow")),(Object)((_bdrawer)));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtoolbar","tostring", __ref);}
 BA.debugLineNum = 369;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 370;BA.debugLine="If StartSection.hasContent Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_startsection" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 371;BA.debugLine="StartSection.Pop(ToolBar)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_startsection" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_toolbar" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 373;BA.debugLine="If EndSection.hasContent Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_endsection" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 374;BA.debugLine="EndSection.Pop(ToolBar)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_endsection" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_toolbar" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 376;BA.debugLine="Return ToolBar.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatelogo(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("UpdateLogo (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("updatelogo")) { return __ref.runUserSub(false, "vmtoolbar","updatelogo", __ref, _url);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("URL", _url);
 BA.debugLineNum = 43;BA.debugLine="Sub UpdateLogo(URL As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Dim pp As String = $\"${ID}logosrc\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("logosrc")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 45;BA.debugLine="vue.SetStateSingle(pp, URL)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_url)));
 BA.debugLineNum = 46;BA.debugLine="SetHasLogo(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtoolbar.class, "_sethaslogo" /*RemoteObject*/ ,(Object)(vmtoolbar.__c.getField(true,"True")));
 BA.debugLineNum = 47;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetitle(RemoteObject __ref,RemoteObject _tt) throws Exception{
try {
		Debug.PushSubsStack("UpdateTitle (vmtoolbar) ","vmtoolbar",102,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("updatetitle")) { return __ref.runUserSub(false, "vmtoolbar","updatetitle", __ref, _tt);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("tt", _tt);
 BA.debugLineNum = 306;BA.debugLine="Sub UpdateTitle(tt As String) As VMToolBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 307;BA.debugLine="Dim pp As String = $\"${ID}title\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtoolbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("title")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 308;BA.debugLine="vue.SetStateSingle(pp, tt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_tt)));
 BA.debugLineNum = 309;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}