package org.example;

import jakarta.xml.ws.Endpoint;



public class Server {

    public static void main(String[] args) {
        HelloName helloNameService = new HelloName();
        Endpoint.publish("http://localhost:8080/hello", helloNameService);
        System.out.println("Servidor rodando locahost na porta 8080");
    }
}
