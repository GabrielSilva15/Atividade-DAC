package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class HelloName {

    @WebMethod
    public void messageName(String name){
        System.out.println("Hello " + name);
    }
}
