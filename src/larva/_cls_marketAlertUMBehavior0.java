package larva;


import main.PostService;

import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_marketAlertUMBehavior0 implements _callable{

public static PrintWriter pw; 
public static _cls_marketAlertUMBehavior0 root;

public static LinkedHashMap<_cls_marketAlertUMBehavior0,_cls_marketAlertUMBehavior0> _cls_marketAlertUMBehavior0_instances = new LinkedHashMap<_cls_marketAlertUMBehavior0,_cls_marketAlertUMBehavior0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\cyrus\\workspace\\cps3230_task2/src/output_marketAlertUMBehavior.txt");

root = new _cls_marketAlertUMBehavior0();
_cls_marketAlertUMBehavior0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_marketAlertUMBehavior0 parent; //to remain null - this class does not have a parent!
public static boolean status;
int no_automata = 1;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_marketAlertUMBehavior0() {
}

public void initialisation() {
}

public static _cls_marketAlertUMBehavior0 _get_cls_marketAlertUMBehavior0_inst() { synchronized(_cls_marketAlertUMBehavior0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_marketAlertUMBehavior0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_marketAlertUMBehavior0_instances){
_performLogic_marketAlertUMProperty(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_marketAlertUMBehavior0[] a = new _cls_marketAlertUMBehavior0[1];
synchronized(_cls_marketAlertUMBehavior0_instances){
a = _cls_marketAlertUMBehavior0_instances.keySet().toArray(a);}
for (_cls_marketAlertUMBehavior0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_marketAlertUMBehavior0_instances){
_cls_marketAlertUMBehavior0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_marketAlertUMProperty = 148;

public void _performLogic_marketAlertUMProperty(String _info, int... _event) {

_cls_marketAlertUMBehavior0.pw.println("[marketAlertUMProperty]AUTOMATON::> marketAlertUMProperty("+") STATE::>"+ _string_marketAlertUMProperty(_state_id_marketAlertUMProperty, 0));
_cls_marketAlertUMBehavior0.pw.flush();

if (0==1){}
else if (_state_id_marketAlertUMProperty==145){
		if (1==0){}
		else if ((_occurredEvent(_event,224/*userLoggedOut*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User logged out");

		_state_id_marketAlertUMProperty = 148;//moving to state loginPage
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,226/*userViewedAlerts*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User viewed Alerts");

		_state_id_marketAlertUMProperty = 143;//moving to state alertsPage
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,218/*alertCreated*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User created Alert");

		_state_id_marketAlertUMProperty = 144;//moving to state createAlerts
		_goto_marketAlertUMProperty(_info);
		}
}
else if (_state_id_marketAlertUMProperty==143){
		if (1==0){}
		else if ((_occurredEvent(_event,224/*userLoggedOut*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User logged out!");

		_state_id_marketAlertUMProperty = 148;//moving to state loginPage
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,218/*alertCreated*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User Created alerts!");

		_state_id_marketAlertUMProperty = 144;//moving to state createAlerts
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,228/*invalidPost*/)) && (status ==false )){
		;
_cls_marketAlertUMBehavior0.pw .println ("Invalid Post Requst!");

		_state_id_marketAlertUMProperty = 141;//moving to state badRequest
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,230/*invalidDelete*/)) && (status ==false )){
		;
_cls_marketAlertUMBehavior0.pw .println ("Invalid Delete Requst!");

		_state_id_marketAlertUMProperty = 141;//moving to state badRequest
		_goto_marketAlertUMProperty(_info);
		}
}
else if (_state_id_marketAlertUMProperty==148){
		if (1==0){}
		else if ((_occurredEvent(_event,222/*userValidLogin*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User Logged in!");

		_state_id_marketAlertUMProperty = 143;//moving to state alertsPage
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,228/*invalidPost*/)) && (status ==false )){
		;
_cls_marketAlertUMBehavior0.pw .println ("Invalid Post Requst!");

		_state_id_marketAlertUMProperty = 141;//moving to state badRequest
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,230/*invalidDelete*/)) && (status ==false )){
		;
_cls_marketAlertUMBehavior0.pw .println ("Invalid Delete Requst!");

		_state_id_marketAlertUMProperty = 141;//moving to state badRequest
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,218/*alertCreated*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User created alert, loginStatus: off");

		_state_id_marketAlertUMProperty = 146;//moving to state createAlertsLoggedOff
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,220/*alertsDeleted*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User deleted alerts, loginStatus: off");

		_state_id_marketAlertUMProperty = 147;//moving to state deleteAlertsLoggedOff
		_goto_marketAlertUMProperty(_info);
		}
}
else if (_state_id_marketAlertUMProperty==146){
		if (1==0){}
		else if ((_occurredEvent(_event,222/*userValidLogin*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User Logged In");

		_state_id_marketAlertUMProperty = 143;//moving to state alertsPage
		_goto_marketAlertUMProperty(_info);
		}
}
else if (_state_id_marketAlertUMProperty==147){
		if (1==0){}
		else if ((_occurredEvent(_event,222/*userValidLogin*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User logged In");

		_state_id_marketAlertUMProperty = 143;//moving to state alertsPage
		_goto_marketAlertUMProperty(_info);
		}
}
else if (_state_id_marketAlertUMProperty==144){
		if (1==0){}
		else if ((_occurredEvent(_event,224/*userLoggedOut*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User logged out");

		_state_id_marketAlertUMProperty = 148;//moving to state loginPage
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,218/*alertCreated*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User Created alert");

		_state_id_marketAlertUMProperty = 144;//moving to state createAlerts
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,226/*userViewedAlerts*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User viewed alerts");

		_state_id_marketAlertUMProperty = 143;//moving to state alertsPage
		_goto_marketAlertUMProperty(_info);
		}
		else if ((_occurredEvent(_event,220/*alertsDeleted*/))){
		;
_cls_marketAlertUMBehavior0.pw .println ("User deleted alerts");

		_state_id_marketAlertUMProperty = 145;//moving to state deleteAlerts
		_goto_marketAlertUMProperty(_info);
		}
}
}

public void _goto_marketAlertUMProperty(String _info){
_cls_marketAlertUMBehavior0.pw.println("[marketAlertUMProperty]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_marketAlertUMProperty(_state_id_marketAlertUMProperty, 1));
_cls_marketAlertUMBehavior0.pw.flush();
}

public String _string_marketAlertUMProperty(int _state_id, int _mode){
switch(_state_id){
case 141: if (_mode == 0) return "badRequest"; else return "!!!SYSTEM REACHED BAD STATE!!! badRequest "+new _BadStateExceptionmarketAlertUMBehavior().toString()+" ";
case 145: if (_mode == 0) return "deleteAlerts"; else return "deleteAlerts";
case 143: if (_mode == 0) return "alertsPage"; else return "alertsPage";
case 148: if (_mode == 0) return "loginPage"; else return "loginPage";
case 146: if (_mode == 0) return "createAlertsLoggedOff"; else return "createAlertsLoggedOff";
case 147: if (_mode == 0) return "deleteAlertsLoggedOff"; else return "deleteAlertsLoggedOff";
case 144: if (_mode == 0) return "createAlerts"; else return "createAlerts";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}