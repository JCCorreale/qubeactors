package itunibo.qubeactor.probes

import it.unibo.kactor.ActorBasicFsm
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress

object httpProbe {
	
	fun create(actor: ActorBasicFsm, endpoint : String, port: Int) {
		
		println( "CREATE HTTP PROBE ${endpoint} FOR ACTOR ${actor} ON PORT ${port}")
		
		val server = HttpServer.create(InetSocketAddress(port), 0);
        server.createContext(endpoint, { httpExchange ->
			val response = "OK";
            httpExchange.sendResponseHeaders(200, response.length.toLong());
            val os = httpExchange.getResponseBody();
            os.write(response.toByteArray());
            os.close();
		});
        server.setExecutor(null);
        server.start();
	}
}