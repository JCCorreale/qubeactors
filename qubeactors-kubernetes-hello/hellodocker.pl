%====================================================================================
% hellodocker description   
%====================================================================================
context(hellocontext, "172.17.0.6",  "TCP", "8080").
 qactor( hello, hellocontext, "it.unibo.hello.Hello").
