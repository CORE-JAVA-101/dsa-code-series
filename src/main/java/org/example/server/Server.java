package org.example.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Server {
  public static void main(String[] args) throws IOException {

    HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
    httpServer.createContext("/", new MyHandler());
    httpServer.start();
  }

  private static class MyHandler implements HttpHandler {

    private final MeterRegistry meterRegistry = new SimpleMeterRegistry();

    // Create a Counter to track the number of requests
    private final Counter requestCounter = Counter.builder("http_requests_total")
        .description("Total number of HTTP requests")
        .register(meterRegistry);

    @Override
    public void handle(HttpExchange exchange) throws IOException {
      requestCounter.increment();
      // Define the response content
      String response = "Hello, this is a simple HTTP server example in Java!";

      // Set the response headers
      exchange.getResponseHeaders().set("Content-Type", "text/plain");
      exchange.sendResponseHeaders(200, response.getBytes().length);

      // Send the response body
      try (OutputStream outputStream = exchange.getResponseBody()) {
        outputStream.write(response.getBytes());
      }
    }
  }
}
