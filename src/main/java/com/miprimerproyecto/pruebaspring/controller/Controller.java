package com.miprimerproyecto.pruebaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello world!";
    }
}
