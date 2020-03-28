%====================================================================================
% greeterdocker description   
%====================================================================================
context(greetercontext, "192.168.1.6",  "TCP", "8081").
context(hellocontext, "localhost",  "TCP", "8080").
 qactor( hello, hellocontext, "external").
  qactor( greeter, greetercontext, "it.unibo.greeter.Greeter").
