package aspects;

import main.PostService;

import larva.*;
public aspect _asp_marketAlertUMBehavior0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_marketAlertUMBehavior0.initialize();
}
}
before () : (call(* *.userLoggedOut(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_marketAlertUMBehavior0.lock){

_cls_marketAlertUMBehavior0 _cls_inst = _cls_marketAlertUMBehavior0._get_cls_marketAlertUMBehavior0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 224/*userLoggedOut*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 224/*userLoggedOut*/);
}
}
before () : (call(* *.alertsDeleted(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_marketAlertUMBehavior0.lock){

_cls_marketAlertUMBehavior0 _cls_inst = _cls_marketAlertUMBehavior0._get_cls_marketAlertUMBehavior0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 220/*alertsDeleted*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 220/*alertsDeleted*/);
}
}
after () returning (boolean status) : (call(* *.deleteAllAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_marketAlertUMBehavior0.lock){

_cls_marketAlertUMBehavior0 _cls_inst = _cls_marketAlertUMBehavior0._get_cls_marketAlertUMBehavior0_inst();
_cls_inst.status = status;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 230/*invalidDelete*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 230/*invalidDelete*/);
}
}
after () returning (boolean status) : (call(* *.postAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_marketAlertUMBehavior0.lock){

_cls_marketAlertUMBehavior0 _cls_inst = _cls_marketAlertUMBehavior0._get_cls_marketAlertUMBehavior0_inst();
_cls_inst.status = status;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 228/*invalidPost*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 228/*invalidPost*/);
}
}
before () : (call(* *.userViewedAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_marketAlertUMBehavior0.lock){

_cls_marketAlertUMBehavior0 _cls_inst = _cls_marketAlertUMBehavior0._get_cls_marketAlertUMBehavior0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 226/*userViewedAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 226/*userViewedAlerts*/);
}
}
before () : (call(* *.alertCreated(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_marketAlertUMBehavior0.lock){

_cls_marketAlertUMBehavior0 _cls_inst = _cls_marketAlertUMBehavior0._get_cls_marketAlertUMBehavior0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 218/*alertCreated*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 218/*alertCreated*/);
}
}
before () : (call(* *.userValidLogin(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_marketAlertUMBehavior0.lock){

_cls_marketAlertUMBehavior0 _cls_inst = _cls_marketAlertUMBehavior0._get_cls_marketAlertUMBehavior0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 222/*userValidLogin*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 222/*userValidLogin*/);
}
}
}