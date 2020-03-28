%====================================================================================
% greeterdocker description   
%====================================================================================
context(greetercontext, "localhost",  "TCP", "8090").
context(hellocontext, "192.168.1.6",  "TCP", "8080").
 qactor( hello, hellocontext, "external").
  qactor( greeter, greetercontext, "it.unibo.greeter.Greeter").
