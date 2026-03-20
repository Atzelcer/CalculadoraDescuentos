package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescuentosTest {

    CalculadoraDescuentos calc = new CalculadoraDescuentos();

    @Test
    void testDescuentoCero() {
        assertEquals(100.0, calc.calcularPrecioFinal(100.0, 0));
    }

    @Test
    void testDescuento100() {
        assertEquals(0.0, calc.calcularPrecioFinal(100.0, 100));
    }

    @Test
    void testDescuentoNormal() {
        assertEquals(85.0, calc.calcularPrecioFinal(100.0, 15));
    }

    @Test
    void testPrecioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> calc.calcularPrecioFinal(-50, 10));
    }

    @Test
    void testDescuentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> calc.calcularPrecioFinal(100, -5));
    }

    @Test
    void testDescuentoMayorA100() {
        assertThrows(IllegalArgumentException.class, () -> calc.calcularPrecioFinal(100, 110));
    }
}
