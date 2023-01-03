package aspects;

import marketAlertUM.MarketAlertList;

import larva.*;
public aspect _asp_alertProperty0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_alertProperty0.initialize();
}
}
before () : (call(* *.alertsDeleted(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_alertProperty0.lock){

_cls_alertProperty0 _cls_inst = _cls_alertProperty0._get_cls_alertProperty0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 248/*alertsDeleted*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 248/*alertsDeleted*/);
}
}
after () returning (int noOfAlerts) : (call(* *.getNumberOfAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_alertProperty0.lock){

_cls_alertProperty0 _cls_inst = _cls_alertProperty0._get_cls_alertProperty0_inst();
_cls_inst.noOfAlerts = noOfAlerts;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 254/*getNoOfAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 254/*getNoOfAlerts*/);
}
}
before () : (call(* *.userViewedAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_alertProperty0.lock){

_cls_alertProperty0 _cls_inst = _cls_alertProperty0._get_cls_alertProperty0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 252/*userViewedAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 252/*userViewedAlerts*/);
}
}
after () returning (boolean verifiedIcon) : (call(* *.verifyIcon(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_alertProperty0.lock){

_cls_alertProperty0 _cls_inst = _cls_alertProperty0._get_cls_alertProperty0_inst();
_cls_inst.verifiedIcon = verifiedIcon;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 258/*verifyIcon*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 258/*verifyIcon*/);
}
}
before () : (call(* *.alertCreated(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_alertProperty0.lock){

_cls_alertProperty0 _cls_inst = _cls_alertProperty0._get_cls_alertProperty0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 246/*alertCreated*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 246/*alertCreated*/);
}
}
before () : (call(* *.userValidLogin(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_alertProperty0.lock){

_cls_alertProperty0 _cls_inst = _cls_alertProperty0._get_cls_alertProperty0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 250/*userValidLogin*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 250/*userValidLogin*/);
}
}
after () returning (boolean verified) : (call(* *.verifyAlertsLayout(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_alertProperty0.lock){

_cls_alertProperty0 _cls_inst = _cls_alertProperty0._get_cls_alertProperty0_inst();
_cls_inst.verified = verified;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 256/*verifyAlertsLayout*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 256/*verifyAlertsLayout*/);
}
}
}