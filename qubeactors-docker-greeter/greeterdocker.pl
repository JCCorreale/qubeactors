%====================================================================================
% greeterdocker description   
%====================================================================================
context(greetercontext, "172.20.128.2",  "TCP", "8080").
context(hellocontext, "172.20.128.1",  "TCP", "8080").
 qactor( hello, hellocontext, "external").
  qactor( greeter, greetercontext, "it.unibo.greeter.Greeter").
