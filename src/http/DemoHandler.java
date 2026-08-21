package http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class DemoHandler implements HttpHandler {
    private  int counter = 0;
    @Override
    public void  handle(HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200,0);

        System.out.println("Получили запрос");
        OutputStream os = exchange.getResponseBody();
        counter++;
        String r = "r" + counter;
        os.write(r.getBytes());
        os.close();
    }
}
