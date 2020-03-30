%====================================================================================
% greeterdocker description   
%====================================================================================
context(greetercontext, "172.17.0.4",  "TCP", "8080").
context(hellocontext, "172.17.0.6",  "TCP", "8080").
 qactor( hello, hellocontext, "external").
  qactor( greeter, greetercontext, "it.unibo.greeter.Greeter").
