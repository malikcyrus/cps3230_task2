package larva;


import marketAlertUM.MarketAlertList;

import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_alertProperty0 implements _callable{

public static PrintWriter pw; 
public static _cls_alertProperty0 root;

public static LinkedHashMap<_cls_alertProperty0,_cls_alertProperty0> _cls_alertProperty0_instances = new LinkedHashMap<_cls_alertProperty0,_cls_alertProperty0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\cyrus\\workspace\\cps3230_task2/src/output_alertProperty.txt");

root = new _cls_alertProperty0();
_cls_alertProperty0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_alertProperty0 parent; //to remain null - this class does not have a parent!
public static int noOfAlerts;
public static boolean verifiedIcon;
public static boolean verified;
int no_automata = 1;
 public int alertsUploaded =0 ;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_alertProperty0() {
}

public void initialisation() {
}

public static _cls_alertProperty0 _get_cls_alertProperty0_inst() { synchronized(_cls_alertProperty0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_alertProperty0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_alertProperty0_instances){
_performLogic_alertProperty(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_alertProperty0[] a = new _cls_alertProperty0[1];
synchronized(_cls_alertProperty0_instances){
a = _cls_alertProperty0_instances.keySet().toArray(a);}
for (_cls_alertProperty0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_alertProperty0_instances){
_cls_alertProperty0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_alertProperty = 163;

public void _performLogic_alertProperty(String _info, int... _event) {

_cls_alertProperty0.pw.println("[alertProperty]AUTOMATON::> alertProperty("+") STATE::>"+ _string_alertProperty(_state_id_alertProperty, 0));
_cls_alertProperty0.pw.flush();

if (0==1){}
else if (_state_id_alertProperty==161){
		if (1==0){}
		else if ((_occurredEvent(_event,252/*userViewedAlerts*/))){
		;
_cls_alertProperty0.pw .println ("User viewed Alerts");

		_state_id_alertProperty = 162;//moving to state alertsPage
		_goto_alertProperty(_info);
		}
}
else if (_state_id_alertProperty==162){
		if (1==0){}
		else if ((_occurredEvent(_event,254/*getNoOfAlerts*/)) && (noOfAlerts <=5 )){
		;
_cls_alertProperty0.pw .println ("Number of Alerts on Page: "+noOfAlerts );

		_state_id_alertProperty = 162;//moving to state alertsPage
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,248/*alertsDeleted*/))){
		alertsUploaded =0 ;
_cls_alertProperty0.pw .println ("Alerts Deleted, alerts = "+alertsUploaded );

		_state_id_alertProperty = 162;//moving to state alertsPage
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,258/*verifyIcon*/)) && (verifiedIcon ==true )){
		;
_cls_alertProperty0.pw .println ("Icon name verified");

		_state_id_alertProperty = 162;//moving to state alertsPage
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,246/*alertCreated*/))){
		alertsUploaded ++;
_cls_alertProperty0.pw .println ("User created Alert, alerts_uploaded = "+alertsUploaded );

		_state_id_alertProperty = 163;//moving to state createAlerts
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,254/*getNoOfAlerts*/)) && (noOfAlerts >5 )){
		;
_cls_alertProperty0.pw .println ("Invalid Number of Alerts on Page!, Number of Alerts on Page: "+noOfAlerts );

		_state_id_alertProperty = 157;//moving to state badAlertNumber
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,258/*verifyIcon*/)) && (verifiedIcon ==false )){
		;
_cls_alertProperty0.pw .println ("Bad Icon name detected!");

		_state_id_alertProperty = 159;//moving to state badIconName
		_goto_alertProperty(_info);
		}
}
else if (_state_id_alertProperty==163){
		if (1==0){}
		else if ((_occurredEvent(_event,246/*alertCreated*/)) && (alertsUploaded <=5 )){
		alertsUploaded ++;
_cls_alertProperty0.pw .println ("User created Alert, alerts_uploaded = "+alertsUploaded );

		_state_id_alertProperty = 163;//moving to state createAlerts
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,248/*alertsDeleted*/))){
		alertsUploaded =0 ;
_cls_alertProperty0.pw .println ("Alerts Deleted, alerts_uploaded = "+alertsUploaded );

		_state_id_alertProperty = 163;//moving to state createAlerts
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,256/*verifyAlertsLayout*/)) && (verified ==true )){
		;
_cls_alertProperty0.pw .println ("Verified Alert Layout!");

		_state_id_alertProperty = 161;//moving to state verifiedAlertLayout
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,256/*verifyAlertsLayout*/)) && (verified ==false )){
		;
_cls_alertProperty0.pw .println ("Failed to verify Alerts!");

		_state_id_alertProperty = 158;//moving to state badAlertLayout
		_goto_alertProperty(_info);
		}
}
}

public void _goto_alertProperty(String _info){
_cls_alertProperty0.pw.println("[alertProperty]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_alertProperty(_state_id_alertProperty, 1));
_cls_alertProperty0.pw.flush();
}

public String _string_alertProperty(int _state_id, int _mode){
switch(_state_id){
case 161: if (_mode == 0) return "verifiedAlertLayout"; else return "verifiedAlertLayout";
case 157: if (_mode == 0) return "badAlertNumber"; else return "!!!SYSTEM REACHED BAD STATE!!! badAlertNumber "+new _BadStateExceptionalertProperty().toString()+" ";
case 158: if (_mode == 0) return "badAlertLayout"; else return "!!!SYSTEM REACHED BAD STATE!!! badAlertLayout "+new _BadStateExceptionalertProperty().toString()+" ";
case 162: if (_mode == 0) return "alertsPage"; else return "alertsPage";
case 159: if (_mode == 0) return "badIconName"; else return "!!!SYSTEM REACHED BAD STATE!!! badIconName "+new _BadStateExceptionalertProperty().toString()+" ";
case 163: if (_mode == 0) return "createAlerts"; else return "createAlerts";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}