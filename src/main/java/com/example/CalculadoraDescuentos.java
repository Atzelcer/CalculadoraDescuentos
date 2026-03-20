package com.example;

public class CalculadoraDescuentos {

    public double calcularPrecioFinal(double precioOriginal, double porcentajeDescuento) {
        if (precioOriginal <= 0) {
            throw new IllegalArgumentException("El precio original debe ser mayor que cero");
        }
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100");
        }
        double descuento = precioOriginal * (porcentajeDescuento / 100);
        double precioFinal = precioOriginal - descuento;
        return Math.round(precioFinal * 100.0) / 100.0;
    }
}
