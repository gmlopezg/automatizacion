package com.automatizacion.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoUnitarioTest {
    @Test
    public void testSumaSimple() {
        // Una prueba unitaria pura: solo lógica interna
        assertEquals(10, 5 + 5, "La suma básica debería funcionar");
    }
}