package larva;


import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_logins0 implements _callable{

public static PrintWriter pw; 
public static _cls_logins0 root;

public static LinkedHashMap<_cls_logins0,_cls_logins0> _cls_logins0_instances = new LinkedHashMap<_cls_logins0,_cls_logins0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\cyrus\\workspace\\BadLogin/src/output_logins.txt");

root = new _cls_logins0();
_cls_logins0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_logins0 parent; //to remain null - this class does not have a parent!
public static boolean locked;
int no_automata = 1;
 public int badLogins =0 ;
public Clock lockedTime = new Clock(this,"lockedTime");

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_logins0() {
}

public void initialisation() {
   lockedTime.reset();
}

public static _cls_logins0 _get_cls_logins0_inst() { synchronized(_cls_logins0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_logins0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_logins0_instances){
_performLogic_badLoginsProperty(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_logins0[] a = new _cls_logins0[1];
synchronized(_cls_logins0_instances){
a = _cls_logins0_instances.keySet().toArray(a);}
for (_cls_logins0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_logins0_instances){
_cls_logins0_instances.remove(this);}
synchronized(lockedTime){
lockedTime.off();
lockedTime._inst = null;
lockedTime = null;}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_badLoginsProperty = 2;

public void _performLogic_badLoginsProperty(String _info, int... _event) {

_cls_logins0.pw.println("[badLoginsProperty]AUTOMATON::> badLoginsProperty("+") STATE::>"+ _string_badLoginsProperty(_state_id_badLoginsProperty, 0));
_cls_logins0.pw.flush();

if (0==1){}
else if (_state_id_badLoginsProperty==2){
		if (1==0){}
		else if ((_occurredEvent(_event,2/*goodLogin*/))){
		badLogins =0 ;
_cls_logins0.pw .println ("Good login observed. Bad logins: "+badLogins );

		_state_id_badLoginsProperty = 2;//moving to state unblocked
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,0/*badLogin*/)) && (badLogins <2 )){
		badLogins ++;
_cls_logins0.pw .println ("Bad login observed. Bad logins: "+badLogins );

		_state_id_badLoginsProperty = 2;//moving to state unblocked
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,0/*badLogin*/)) && (badLogins ==2 )){
		badLogins ++;
lockedTime .reset ();
_cls_logins0.pw .println ("Bad login observed. Bad logins: "+badLogins );

		_state_id_badLoginsProperty = 1;//moving to state blocked
		_goto_badLoginsProperty(_info);
		}
}
else if (_state_id_badLoginsProperty==1){
		if (1==0){}
		else if ((_occurredEvent(_event,4/*unlockAccount*/)) && (locked ==false &&lockedTime .compareTo (10 )<0 )){
		badLogins =0 ;
_cls_logins0.pw .println ("Unblocked prematurely! Entering bad state!");

		_state_id_badLoginsProperty = 0;//moving to state unlockedPrematurely
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,4/*unlockAccount*/)) && (locked ==false &&lockedTime .compareTo (10 )>=0 )){
		badLogins =0 ;
_cls_logins0.pw .println ("Going back to unblocked.");

		_state_id_badLoginsProperty = 2;//moving to state unblocked
		_goto_badLoginsProperty(_info);
		}
}
}

public void _goto_badLoginsProperty(String _info){
_cls_logins0.pw.println("[badLoginsProperty]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_badLoginsProperty(_state_id_badLoginsProperty, 1));
_cls_logins0.pw.flush();
}

public String _string_badLoginsProperty(int _state_id, int _mode){
switch(_state_id){
case 2: if (_mode == 0) return "unblocked"; else return "unblocked";
case 1: if (_mode == 0) return "blocked"; else return "blocked";
case 0: if (_mode == 0) return "unlockedPrematurely"; else return "!!!SYSTEM REACHED BAD STATE!!! unlockedPrematurely "+new _BadStateExceptionlogins().toString()+" ";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}