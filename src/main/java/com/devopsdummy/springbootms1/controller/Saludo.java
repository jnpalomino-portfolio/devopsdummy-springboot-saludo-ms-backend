package com.devopsdummy.springbootms1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/saludo")
    public String getSaludo(@RequestParam(required=false, defaultValue="Mundo") String nombre) {
        return "¡Hola "+nombre+"!";
    }
}
