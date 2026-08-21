package http;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;


public class Test1 {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create((new InetSocketAddress(8080)), 0);
        server.createContext("/demo", new DemoHandler());
        server.start();
        System.out.println("Сервер запущен");
    }
// users.txt

// id,login,birthdate,country
// 1,bob,2012-12-12,USA
// 2,jack,2000-12-12,Austria
// 3,sam,1995-12-12,Canada
// 4,mandy,1999-12-12,Brazil
}
