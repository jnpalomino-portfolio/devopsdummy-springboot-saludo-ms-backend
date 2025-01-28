package com.devopsdummy.springbootms1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SaludoTests {

    @Test
    void testGetSaludoWithDefaultName() {
        Saludo saludoController = new Saludo();
        String result = saludoController.getSaludo("Mundo");
        assertEquals("¡Hola Mundo!", result);
    }

    @Test
    void testGetSaludoWithCustomName() {
        Saludo saludoController = new Saludo();
        String result = saludoController.getSaludo("Juan");
        assertEquals("¡Hola Juan!", result);
    }
}
