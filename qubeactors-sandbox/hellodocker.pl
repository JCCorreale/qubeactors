%====================================================================================
% hellodocker description   
%====================================================================================
context(hellocontext, "localhost",  "TCP", "8080").
 qactor( hello, hellocontext, "it.unibo.hello.Hello").
